/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      GENLS
 * source file: /cyc/top/cycl/genls.lisp
 * created:     2019/07/03 17:37:27
 */
public final class genls extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new genls();



    // defvar
    // consider #$isa gafs when determining if two collections intersect?
    /**
     * consider #$isa gafs when determining if two collections intersect?
     */
    @LispMethod(comment = "consider #$isa gafs when determining if two collections intersect?\ndefvar")
    private static final SubLSymbol $sbhl_infer_intersection_from_instancesP$ = makeSymbol("*SBHL-INFER-INTERSECTION-FROM-INSTANCES?*");



    private static final SubLSymbol MIN_GENLS = makeSymbol("MIN-GENLS");

    static private final SubLList $list2 = list(makeSymbol("COL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    static private final SubLString $str3$Returns_the_most_specific_genls_o = makeString("Returns the most-specific genls of collection COL");

    static private final SubLList $list4 = list(list(makeSymbol("LIST"), makeSymbol("FORT-P")));

    private static final SubLSymbol MAX_NOT_GENLS = makeSymbol("MAX-NOT-GENLS");

    static private final SubLString $str7$Returns_the_least_specific_negate = makeString("Returns the least-specific negated genls of collection COL");

    static private final SubLList $list8 = list(list(makeSymbol("COL"), makeSymbol("EL-FORT-P")));

    private static final SubLSymbol MAX_SPECS = makeSymbol("MAX-SPECS");

    static private final SubLString $str11$Returns_the_least_specific_specs_ = makeString("Returns the least-specific specs of collection COL");

    private static final SubLSymbol MIN_NOT_SPECS = makeSymbol("MIN-NOT-SPECS");

    static private final SubLString $str13$Returns_the_most_specific_negated = makeString("Returns the most-specific negated specs of collection COL");

    private static final SubLSymbol GENL_SIBLINGS = makeSymbol("GENL-SIBLINGS");

    static private final SubLString $str15$Returns_the_direct_genls_of_those = makeString("Returns the direct genls of those direct spec collections of COL");

    private static final SubLSymbol SPEC_SIBLINGS = makeSymbol("SPEC-SIBLINGS");

    static private final SubLString $str17$Returns_the_direct_specs_of_those = makeString("Returns the direct specs of those direct genls collections of COL");

    static private final SubLString $str19$Returns_all_genls_of_collection_C = makeString("Returns all genls of collection COL\n   (ascending transitive closure; inexpensive)");



    private static final SubLSymbol ALL_SPECS = makeSymbol("ALL-SPECS");

    static private final SubLString $str25$Returns_all_specs_of_collection_C = makeString("Returns all specs of collection COL \n   (descending transitive closure; expensive)");

    static private final SubLString $str32$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $$$continue_anyway = makeString("continue anyway");

    static private final SubLString $str37$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLString $str38$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str39$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLString $str40$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    private static final SubLSymbol ALL_SPECS_WITH_MAX = makeSymbol("ALL-SPECS-WITH-MAX");

    private static final SubLSymbol $INVALID_ITERATION_TERM = makeKeyword("INVALID-ITERATION-TERM");

    private static final SubLSymbol $sym44$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol COUNT_ALL_SPECS = makeSymbol("COUNT-ALL-SPECS");

    static private final SubLList $list46 = list(makeSymbol("COLLECTION"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLString $str47$Counts_the_number_of_specs_in_COL = makeString("Counts the number of specs in COLLECTION and then returns the count.");

    private static final SubLList $list48 = list(list(makeSymbol("COLLECTION"), makeSymbol("EL-FORT-P")));

    static private final SubLList $list49 = list(makeSymbol("INTEGERP"));

    private static final SubLSymbol ALL_GENLS_WRT = makeSymbol("ALL-GENLS-WRT");

    static private final SubLList $list51 = list(makeSymbol("SPEC"), makeSymbol("GENL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLString $str52$Returns_all_genls_of_collection_S = makeString("Returns all genls of collection SPEC that are also specs of collection GENL (ascending transitive closure; inexpensive)");

    private static final SubLList $list53 = list(list(makeSymbol("SPEC"), makeSymbol("EL-FORT-P")), list(makeSymbol("GENL"), makeSymbol("EL-FORT-P")));

    private static final SubLSymbol UNION_ALL_GENLS = makeSymbol("UNION-ALL-GENLS");

    static private final SubLList $list56 = list(makeSymbol("COLS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLString $str57$Returns_all_genls_of_each_collect = makeString("Returns all genls of each collection in COLs");

    private static final SubLList $list58 = list(list(makeSymbol("COLS"), makeSymbol("LISTP")));

    private static final SubLSymbol UNION_ALL_SPECS = makeSymbol("UNION-ALL-SPECS");

    private static final SubLString $str60$Returns_all_specs_of_each_collect = makeString("Returns all specs of each collection in COLs");

    private static final SubLSymbol ALL_DEPENDENT_SPECS = makeSymbol("ALL-DEPENDENT-SPECS");

    private static final SubLString $str62$Returns_all_specs_s_of_COL_s_t__e = makeString("Returns all specs s of COL s.t. every path connecting\n   s to any genl of COL must pass through COL");

    private static final SubLSymbol ALL_GENLS_AMONG = makeSymbol("ALL-GENLS-AMONG");

    static private final SubLList $list64 = list(makeSymbol("COL"), makeSymbol("CANDIDATES"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLString $str65$Returns_those_genls_of_COL_that_a = makeString("Returns those genls of COL that are included among CANDIDATES");

    private static final SubLList $list66 = list(list(makeSymbol("COL"), makeSymbol("EL-FORT-P")), list(makeSymbol("CANDIDATES"), makeSymbol("LISTP")));

    private static final SubLSymbol ALL_SPECS_AMONG = makeSymbol("ALL-SPECS-AMONG");

    private static final SubLString $str68$Returns_those_specs_of_COL_that_a = makeString("Returns those specs of COL that are included among CANDIDATEs");

    private static final SubLSymbol ALL_GENLS_IF = makeSymbol("ALL-GENLS-IF");

    static private final SubLList $list71 = list(makeSymbol("FUNCTION"), makeSymbol("COL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLString $str72$Returns_all_genls_of_collection_C = makeString("Returns all genls of collection COL that satisfy FUNCTION\n   (FUNCTION must not effect sbhl search state)");

    private static final SubLList $list73 = list(list(makeSymbol("FUNCTION"), makeSymbol("FUNCTION-SPEC-P")), list(makeSymbol("COL"), makeSymbol("EL-FORT-P")));

    private static final SubLSymbol ALL_SPECS_IF = makeSymbol("ALL-SPECS-IF");

    private static final SubLSymbol ALL_NOT_GENLS = makeSymbol("ALL-NOT-GENLS");

    private static final SubLString $str76$Returns_all_negated_genls_of_coll = makeString("Returns all negated genls of collection COL \n   (descending transitive closure; expensive)");

    private static final SubLSymbol ALL_NOT_SPECS = makeSymbol("ALL-NOT-SPECS");

    private static final SubLString $str78$Returns_all_negated_specs_of_coll = makeString("Returns all negated specs of collection COL \n   (ascending transitive closure; inexpensive)");

    private static final SubLSymbol MAP_ALL_GENLS = makeSymbol("MAP-ALL-GENLS");

    static private final SubLList $list80 = list(makeSymbol("FN"), makeSymbol("COL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLString $str81$Applies_FN_to_every__all__genls_o = makeString("Applies FN to every (all) genls of COL\n   (FN must not effect the current sbhl space)");

    private static final SubLList $list82 = list(list(makeSymbol("FN"), makeSymbol("FUNCTION-SPEC-P")), list(makeSymbol("COL"), makeSymbol("EL-FORT-P")));

    private static final SubLSymbol MAP_ALL_SPECS = makeSymbol("MAP-ALL-SPECS");

    private static final SubLString $str84$Applies_FN_to_every__all__specs_o = makeString("Applies FN to every (all) specs of COL\n   (FN must not effect the current sbhl space)");

    private static final SubLSymbol ANY_ALL_GENLS = makeSymbol("ANY-ALL-GENLS");

    static private final SubLString $str86$Return_a_non_nil_result_of_applyi = makeString("Return a non-nil result of applying FN to some all-genl of COL\n   (FN must not effect the current sbhl space)");

    private static final SubLSymbol ANY_ALL_SPECS = makeSymbol("ANY-ALL-SPECS");

    private static final SubLString $str88$Return_a_non_nil_result_of_applyi = makeString("Return a non-nil result of applying FN to some all-spec of COL\n   (FN must not effect the current sbhl space)");

    private static final SubLSymbol $sym89$GENL_ = makeSymbol("GENL?");

    private static final SubLString $str90$Returns_whether____genls_SPEC_GEN = makeString("Returns whether (#$genls SPEC GENL) can be inferred.\n   (ascending transitive search; inexpensive)");

    static private final SubLList $list91 = list(makeSymbol("BOOLEANP"));

    private static final SubLSymbol $sym92$SPEC_ = makeSymbol("SPEC?");

    private static final SubLList $list93 = list(makeSymbol("GENL"), makeSymbol("SPEC"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLList $list94 = list(list(makeSymbol("GENL"), makeSymbol("EL-FORT-P")), list(makeSymbol("SPEC"), makeSymbol("EL-FORT-P")));



    private static final SubLSymbol $sym96$ANY_GENL_ = makeSymbol("ANY-GENL?");

    static private final SubLList $list97 = list(makeSymbol("SPEC"), makeSymbol("GENLS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLString $str98$_any_genl__spec_genls__is_t_iff__ = makeString("(any-genl? spec genls) is t iff (genl? spec genl) for some genl in genls\n   (ascending transitive search; inexpensive)");

    static private final SubLList $list99 = list(list(makeSymbol("SPEC"), makeSymbol("EL-FORT-P")), list(makeSymbol("GENLS"), makeSymbol("LISTP")));

    private static final SubLSymbol $sym100$ANY_SPEC_ = makeSymbol("ANY-SPEC?");

    static private final SubLList $list101 = list(makeSymbol("GENL"), makeSymbol("SPECS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLString $str102$Returns_T_iff__spec__genl_spec__f = makeString("Returns T iff (spec? genl spec) for some spec in SPECS");

    private static final SubLList $list103 = list(list(makeSymbol("GENL"), makeSymbol("EL-FORT-P")), list(makeSymbol("SPECS"), makeSymbol("LISTP")));

    private static final SubLSymbol $sym104$ALL_GENL_ = makeSymbol("ALL-GENL?");

    private static final SubLString $str105$Returns_T_iff__genl__spec_genl__f = makeString("Returns T iff (genl? spec genl) for every genl in GENLS\n   (ascending transitive search; inexpensive)");

    private static final SubLSymbol $sym106$ALL_SPEC_ = makeSymbol("ALL-SPEC?");

    private static final SubLString $str107$Returns_T_iff__spec__genl_spec__f = makeString("Returns T iff (spec? genl spec) for every spec in SPECS");

    private static final SubLSymbol $sym108$ANY_GENL_ANY_ = makeSymbol("ANY-GENL-ANY?");

    static private final SubLList $list109 = list(makeSymbol("SPECS"), makeSymbol("GENLS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLString $str110$Return_T_iff__genl__spec_genl_mt_ = makeString("Return T iff (genl? spec genl mt) for any spec in SPECS, genl in GENLS");

    private static final SubLList $list111 = list(list(makeSymbol("SPECS"), makeSymbol("LISTP")), list(makeSymbol("GENLS"), makeSymbol("LISTP")));

    private static final SubLSymbol $sym112$ANY_GENL_ALL_ = makeSymbol("ANY-GENL-ALL?");

    private static final SubLString $str113$Return_T_iff__genl__spec_genl_mt_ = makeString("Return T iff (genl? spec genl mt) for any spec in SPECS and all genl in GENLS");

    private static final SubLSymbol $sym114$ALL_SPEC_ANY_ = makeSymbol("ALL-SPEC-ANY?");

    private static final SubLString $str115$Return_T_iff_for_each_spec_in_SPE = makeString("Return T iff for each spec in SPECS there is some genl in GENLS s.t. (genl? spec genl mt)");

    private static final SubLSymbol $sym116$NOT_GENL_ = makeSymbol("NOT-GENL?");

    static private final SubLList $list117 = list(makeSymbol("COL"), makeSymbol("NOT-GENL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLString $str118$Return_whether_collection_NOT_GEN = makeString("Return whether collection NOT-GENL is not a genl of COL.");

    static private final SubLList $list119 = list(list(makeSymbol("COL"), makeSymbol("EL-FORT-P")), list(makeSymbol("NOT-GENL"), makeSymbol("EL-FORT-P")));

    private static final SubLSymbol $sym120$ALL_NOT_SPEC_ = makeSymbol("ALL-NOT-SPEC?");

    static private final SubLList $list121 = list(makeSymbol("COL"), makeSymbol("NOT-SPECS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLString $str122$Return_whether_every_collection_i = makeString("Return whether every collection in NOT-SPECS is not a spec of COL.");

    static private final SubLList $list123 = list(list(makeSymbol("COL"), makeSymbol("EL-FORT-P")), list(makeSymbol("NOT-SPECS"), makeSymbol("LISTP")));

    private static final SubLSymbol $sym124$ANY_NOT_GENL_ = makeSymbol("ANY-NOT-GENL?");

    static private final SubLList $list125 = list(makeSymbol("COL"), makeSymbol("NOT-GENLS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLString $str126$Returns_whether_any_collection_in = makeString("Returns whether any collection in NOT-GENLS is not a genl of COL.");

    private static final SubLList $list127 = list(list(makeSymbol("COL"), makeSymbol("EL-FORT-P")), list(makeSymbol("NOT-GENLS"), makeSymbol("LISTP")));

    private static final SubLSymbol $sym130$COLLECTIONS_COEXTENSIONAL_ = makeSymbol("COLLECTIONS-COEXTENSIONAL?");

    static private final SubLList $list131 = list(makeSymbol("COL-1"), makeSymbol("COL-2"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));

    private static final SubLString $str132$Are_COL_1_and_COL_2_coextensional = makeString("Are COL-1 and COL-2 coextensional?");

    private static final SubLList $list133 = list(list(makeSymbol("COL-1"), makeSymbol("EL-FORT-P")), list(makeSymbol("COL-2"), makeSymbol("EL-FORT-P")));

    private static final SubLSymbol $sym134$COLLECTIONS_INTERSECT_ = makeSymbol("COLLECTIONS-INTERSECT?");

    private static final SubLString $str135$Do_collections_COL_1_and_COL_2_in = makeString("Do collections COL-1 and COL-2 intersect?\n   (uses only sbhl graphs: their extensions are not searched\n    nor are their sufficient conditions analyzed)");

    private static final SubLSymbol $sym138$WHY_GENL_ = makeSymbol("WHY-GENL?");

    static private final SubLList $list139 = list(makeSymbol("SPEC"), makeSymbol("GENL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("BEHAVIOR"));

    private static final SubLString $str140$Justification_of__genls_SPEC_GENL = makeString("Justification of (genls SPEC GENL)");

    static private final SubLList $list141 = list(makeSymbol("LISTP"));



    private static final SubLList $list143 = list($TRUE);









    private static final SubLSymbol $sym148$WHY_NOT_GENL_ = makeSymbol("WHY-NOT-GENL?");

    private static final SubLString $str149$Justification_of__not__genls_SPEC = makeString("Justification of (not (genls SPEC GENL))");

    private static final SubLSymbol $sym150$WHY_NOT_ASSERT_GENLS_ = makeSymbol("WHY-NOT-ASSERT-GENLS?");

    private static final SubLList $list151 = list(makeSymbol("SPEC"), makeSymbol("GENL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));

    private static final SubLString $str152$Justification_of_why_asserting__g = makeString("Justification of why asserting (genls SPEC GENL) is not consistent");

    private static final SubLSymbol COLLECTION_LEAVES = makeSymbol("COLLECTION-LEAVES");

    private static final SubLString $str154$Returns_the_minimally_general__th = makeString("Returns the minimally-general (the most specific) among all-specs of COL");

    private static final SubLString $str156$Returns_the_minimally_general__th = makeString("Returns the minimally-general (the most specific) among reified collections COLS,\n   collections that have no proper specs among COLS");

    private static final SubLSymbol MIN_COL = makeSymbol("MIN-COL");

    static private final SubLString $str158$Returns_the_single_minimally_gene = makeString("Returns the single minimally-general (the most specific) among reified collections COLS.\nTies are broken by comparing the number of all-genls which is a rough depth estimate.");

    static private final SubLList $list159 = list(makeSymbol("FORT-P"));

    private static final SubLSymbol MAX_COLS = makeSymbol("MAX-COLS");

    static private final SubLString $str161$Returns_the_most_general_among_re = makeString("Returns the most-general among reified collections COLS, collections\n   that have no proper genls among COLS");

    private static final SubLSymbol MIN_CEILING_COLS = makeSymbol("MIN-CEILING-COLS");

    static private final SubLList $list163 = list(makeSymbol("COLS"), makeSymbol("&OPTIONAL"), makeSymbol("CANDIDATES"), makeSymbol("MT"), makeSymbol("TV"));

    static private final SubLString $str164$Returns_the_most_specific_common_ = makeString("Returns the most specific common generalizations among reified collections COLS\n   (if CANDIDATES is non-nil, then result is a subset of CANDIDATES)");

    private static final SubLSymbol MAX_FLOOR_COLS = makeSymbol("MAX-FLOOR-COLS");

    static private final SubLString $str166$Returns_the_most_general_common_s = makeString("Returns the most general common specializations among reified collections COLS\n   (if CANDIDATES is non-nil, then result is a subset of CANDIDATES)");

    private static final SubLSymbol ANY_GENL_ISA = makeSymbol("ANY-GENL-ISA");

    static private final SubLList $list168 = list(makeSymbol("COL"), makeSymbol("ISA"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    static private final SubLString $str169$Return_some_genl_of_COL_that_isa_ = makeString("Return some genl of COL that isa instance of ISA (if any such genl exists)");

    static private final SubLList $list170 = list(list(makeSymbol("COL"), makeSymbol("EL-FORT-P")), list(makeSymbol("ISA"), makeSymbol("EL-FORT-P")));

    private static final SubLSymbol LIGHTER_COL = makeSymbol("LIGHTER-COL");

    static private final SubLList $list172 = list(makeSymbol("COL-A"), makeSymbol("COL-B"));

    static private final SubLString $str173$Return_COL_B_iff_it_has_fewer_spe = makeString("Return COL-B iff it has fewer specs than COL-A, else return COL-A");

    static private final SubLList $list174 = list(list(makeSymbol("COL-A"), makeSymbol("EL-FORT-P")), list(makeSymbol("COL-B"), makeSymbol("EL-FORT-P")));

    private static final SubLSymbol LIGHTEST_OF_COLS = makeSymbol("LIGHTEST-OF-COLS");

    static private final SubLList $list176 = list(makeSymbol("COLS"));

    static private final SubLString $str177$Return_the_collection_having_the_ = makeString("Return the collection having the fewest specs given a list of collections.");

    private static final SubLSymbol SHALLOWER_COL = makeSymbol("SHALLOWER-COL");

    static private final SubLString $str179$Return_COL_B_iff_it_has_fewer_gen = makeString("Return COL-B iff it has fewer genls than COL-A, else return COL-A");

    private static final SubLSymbol MAX_FLOOR_MTS_OF_GENLS_PATHS = makeSymbol("MAX-FLOOR-MTS-OF-GENLS-PATHS");

    static private final SubLList $list181 = list(makeSymbol("SPEC"), makeSymbol("GENL"), makeSymbol("&OPTIONAL"), makeSymbol("TV"));

    static private final SubLString $str182$_return_listp__Returns_in_what__m = makeString("@return listp; Returns in what (most-genl) mts GENL is a genls of SPEC");



    private static final SubLSymbol GENLS_AFTER_ADDING = makeSymbol("GENLS-AFTER-ADDING");

    private static final SubLSymbol GENLS_AFTER_REMOVING = makeSymbol("GENLS-AFTER-REMOVING");

    private static final SubLList $list192 = list(list(list(NIL), NIL));

    private static final SubLList $list194 = list(list(list(list(reader_make_constant_shell("Nothing"))), list(reader_make_constant_shell("Nothing"))));

    private static final SubLSymbol MAX_COLS_BENEATH = makeSymbol("MAX-COLS-BENEATH");

    private static final SubLList $list196 = list(list(list(NIL, reader_make_constant_shell("Dog"), reader_make_constant_shell("CyclistsMt")), NIL));

    static private final SubLList $list197 = list(list(list(reader_make_constant_shell("FemaleHuman"), list(reader_make_constant_shell("Female"))), list(reader_make_constant_shell("Female"))));

    static private final SubLList $list198 = list(list(list(reader_make_constant_shell("Female"), list(reader_make_constant_shell("FemaleHuman"))), list(reader_make_constant_shell("FemaleHuman"))));

    static private final SubLList $list199 = list(list(list(reader_make_constant_shell("FemaleHuman"), list(reader_make_constant_shell("Female"))), T), list(list(reader_make_constant_shell("FemaleHuman"), NIL), NIL));

    static private final SubLList $list200 = list(list(list(reader_make_constant_shell("Female"), list(reader_make_constant_shell("FemaleHuman"))), T), list(list(reader_make_constant_shell("Female"), NIL), NIL));

    static private final SubLList $list201 = list(list(list(reader_make_constant_shell("FemaleHuman"), list(reader_make_constant_shell("Female"))), T), list(list(reader_make_constant_shell("FemaleHuman"), NIL), T));

    static private final SubLList $list202 = list(list(list(NIL, NIL), NIL), list(list(list(reader_make_constant_shell("FemaleHuman")), list(reader_make_constant_shell("Female"))), T));

    static private final SubLList $list203 = list(list(list(NIL, NIL), NIL));

    static private final SubLList $list204 = list(list(list(reader_make_constant_shell("Female"), list(reader_make_constant_shell("Male"))), T), list(list(reader_make_constant_shell("Female"), NIL), T), list(list(reader_make_constant_shell("Female"), list(reader_make_constant_shell("Female"))), NIL), list(list(reader_make_constant_shell("Female"), list(reader_make_constant_shell("FemaleHuman"))), NIL));

    static private final SubLList $list205 = list(list(list(reader_make_constant_shell("Female"), list(reader_make_constant_shell("FemaleHuman"), reader_make_constant_shell("FemaleAnimal"))), T));

    static private final SubLList $list206 = list(list(list(reader_make_constant_shell("Female"), list(reader_make_constant_shell("FemaleHuman"))), T), list(list(reader_make_constant_shell("Female"), list(reader_make_constant_shell("Thing"))), NIL), list(list(reader_make_constant_shell("Female"), NIL), NIL));

    private static final SubLSymbol $sym207$ALL_GENL_OF_SOME_ = makeSymbol("ALL-GENL-OF-SOME?");

    private static final SubLList $list208 = list(new SubLObject[]{ list(list(list(reader_make_constant_shell("Predicate")), list(reader_make_constant_shell("Individual")), reader_make_constant_shell("BaseKB")), T), list(list(list(reader_make_constant_shell("Predicate")), list(reader_make_constant_shell("Microtheory")), reader_make_constant_shell("BaseKB")), NIL), list(list(list(reader_make_constant_shell("Predicate")), list(reader_make_constant_shell("Individual"), reader_make_constant_shell("Thing")), reader_make_constant_shell("BaseKB")), T), list(list(list(reader_make_constant_shell("BinaryPredicate")), list(reader_make_constant_shell("Individual"), reader_make_constant_shell("Thing")), reader_make_constant_shell("BaseKB")), T), list(list(list(reader_make_constant_shell("BinaryPredicate")), list(reader_make_constant_shell("Individual"), reader_make_constant_shell("Predicate")), reader_make_constant_shell("BaseKB")), T), list(list(list(reader_make_constant_shell("Predicate"), reader_make_constant_shell("BinaryPredicate")), list(reader_make_constant_shell("Individual"), reader_make_constant_shell("Predicate")), reader_make_constant_shell("BaseKB")), T), list(list(list(reader_make_constant_shell("BinaryPredicate"), reader_make_constant_shell("Collection")), list(reader_make_constant_shell("Collection")), reader_make_constant_shell("BaseKB")), T), list(list(list(reader_make_constant_shell("BinaryPredicate"), reader_make_constant_shell("Collection")), list(reader_make_constant_shell("Collection"), reader_make_constant_shell("Individual")), reader_make_constant_shell("BaseKB")), T), list(list(list(reader_make_constant_shell("Collection")), list(reader_make_constant_shell("Collection"), reader_make_constant_shell("Individual")), reader_make_constant_shell("BaseKB")), NIL) });

    // Definitions
    /**
     *
     *
     * @return listp; the asserted true genls of COL
     */
    @LispMethod(comment = "@return listp; the asserted true genls of COL")
    public static final SubLObject genls_alt(SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_link_methods.sbhl_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, mt, tv, UNPROVIDED);
    }

    // Definitions
    /**
     *
     *
     * @return listp; the asserted true genls of COL
     */
    @LispMethod(comment = "@return listp; the asserted true genls of COL")
    public static SubLObject genls(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_link_methods.sbhl_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, mt, tv, UNPROVIDED);
    }

    /**
     * Returns the most-specific genls of collection COL
     */
    @LispMethod(comment = "Returns the most-specific genls of collection COL")
    public static final SubLObject min_genls_alt(SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_min_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, mt, tv);
    }

    /**
     * Returns the most-specific genls of collection COL
     */
    @LispMethod(comment = "Returns the most-specific genls of collection COL")
    public static SubLObject min_genls(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_min_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, mt, tv);
    }

    /**
     * returns the genls of collection-denoting nat NAUT
     */
    @LispMethod(comment = "returns the genls of collection-denoting nat NAUT")
    public static final SubLObject nat_genls_alt(SubLObject naut, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        {
            SubLObject nart = narts_high.find_nart(naut);
            if (NIL != nart_handles.nart_p(nart)) {
                return com.cyc.cycjava.cycl.genls.genls(nart, mt, tv);
            } else {
                return com.cyc.cycjava.cycl.genls.naut_genls(naut, mt);
            }
        }
    }

    /**
     * returns the genls of collection-denoting nat NAUT
     */
    @LispMethod(comment = "returns the genls of collection-denoting nat NAUT")
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

    /**
     * returns the min-genls of collection-denoting nat NAUT
     */
    @LispMethod(comment = "returns the min-genls of collection-denoting nat NAUT")
    public static final SubLObject nat_min_genls_alt(SubLObject naut, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        {
            SubLObject nart = narts_high.find_nart(naut);
            if (NIL != nart_handles.nart_p(nart)) {
                return com.cyc.cycjava.cycl.genls.min_genls(nart, mt, tv);
            } else {
                return com.cyc.cycjava.cycl.genls.min_cols(com.cyc.cycjava.cycl.genls.naut_genls(naut, mt), mt, tv);
            }
        }
    }

    /**
     * returns the min-genls of collection-denoting nat NAUT
     */
    @LispMethod(comment = "returns the min-genls of collection-denoting nat NAUT")
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

    /**
     * Returns the most-specific genls of collection COL
     * that are also instances of TYPE-COL.
     *
     * @unknown pace
     */
    @LispMethod(comment = "Returns the most-specific genls of collection COL\r\nthat are also instances of TYPE-COL.\r\n\r\n@unknown pace\nReturns the most-specific genls of collection COL\nthat are also instances of TYPE-COL.")
    public static final SubLObject min_genls_of_type_alt(SubLObject col, SubLObject type_col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        {
            SubLObject all_genls = com.cyc.cycjava.cycl.genls.all_genls(col, mt, tv);
            SubLObject genls_of_type = isa.all_instances_among(type_col, all_genls, mt, tv);
            return com.cyc.cycjava.cycl.genls.min_cols(genls_of_type, mt, tv);
        }
    }

    /**
     * Returns the most-specific genls of collection COL
     * that are also instances of TYPE-COL.
     *
     * @unknown pace
     */
    @LispMethod(comment = "Returns the most-specific genls of collection COL\r\nthat are also instances of TYPE-COL.\r\n\r\n@unknown pace\nReturns the most-specific genls of collection COL\nthat are also instances of TYPE-COL.")
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

    /**
     * Returns the most-specific proper genls of collection COL
     * other than itself that are also instances of TYPE-COL.
     *
     * @unknown bklimt
     */
    @LispMethod(comment = "Returns the most-specific proper genls of collection COL\r\nother than itself that are also instances of TYPE-COL.\r\n\r\n@unknown bklimt\nReturns the most-specific proper genls of collection COL\nother than itself that are also instances of TYPE-COL.")
    public static final SubLObject min_proper_genls_of_type_alt(SubLObject col, SubLObject type_col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        {
            SubLObject all_genls = com.cyc.cycjava.cycl.genls.all_genls(col, mt, tv);
            SubLObject genls_of_type = isa.all_instances_among(type_col, all_genls, mt, tv);
            return com.cyc.cycjava.cycl.genls.min_cols(remove(col, genls_of_type, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), mt, tv);
        }
    }

    /**
     * Returns the most-specific proper genls of collection COL
     * other than itself that are also instances of TYPE-COL.
     *
     * @unknown bklimt
     */
    @LispMethod(comment = "Returns the most-specific proper genls of collection COL\r\nother than itself that are also instances of TYPE-COL.\r\n\r\n@unknown bklimt\nReturns the most-specific proper genls of collection COL\nother than itself that are also instances of TYPE-COL.")
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

    /**
     * returns the genls of collection-denoting NAUT
     */
    @LispMethod(comment = "returns the genls of collection-denoting NAUT")
    public static final SubLObject naut_genls_alt(SubLObject naut, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return list_utilities.remove_duplicate_forts(append(new SubLObject[]{ kb_accessors.result_genl(cycl_utilities.nat_functor(naut), mt, UNPROVIDED), kb_accessors.result_genl_args(naut, mt), kb_accessors.result_inter_arg_genl(naut, mt), kb_accessors.result_inter_arg_genl_reln(naut, mt), kb_accessors.result_genl_via_arg_arg_genl(naut, mt) }));
    }

    /**
     * returns the genls of collection-denoting NAUT
     */
    @LispMethod(comment = "returns the genls of collection-denoting NAUT")
    public static SubLObject naut_genls(final SubLObject naut, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return list_utilities.remove_duplicate_forts(append(new SubLObject[]{ kb_accessors.result_genl(cycl_utilities.nat_functor(naut), mt, UNPROVIDED), kb_accessors.result_genl_args(naut, mt), kb_accessors.result_inter_arg_genl(naut, mt), kb_accessors.result_inter_arg_genl_reln(naut, mt), kb_accessors.result_genl_via_arg_arg_genl(naut, mt) }));
    }

    /**
     *
     *
     * @return listp; the asserted false genls of COL.
     */
    @LispMethod(comment = "@return listp; the asserted false genls of COL.")
    public static final SubLObject not_genls_alt(SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_link_methods.sbhl_forward_false_link_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, mt, tv, UNPROVIDED);
    }

    /**
     *
     *
     * @return listp; the asserted false genls of COL.
     */
    @LispMethod(comment = "@return listp; the asserted false genls of COL.")
    public static SubLObject not_genls(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_link_methods.sbhl_forward_false_link_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, mt, tv, UNPROVIDED);
    }

    /**
     * Returns the least-specific negated genls of collection COL
     */
    @LispMethod(comment = "Returns the least-specific negated genls of collection COL")
    public static final SubLObject max_not_genls_alt(SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(col, EL_FORT_P);
        return sbhl_search_methods.sbhl_max_forward_false_link_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, mt, tv);
    }

    /**
     * Returns the least-specific negated genls of collection COL
     */
    @LispMethod(comment = "Returns the least-specific negated genls of collection COL")
    public static SubLObject max_not_genls(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(col, EL_FORT_P);
        return sbhl_search_methods.sbhl_max_forward_false_link_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, mt, tv);
    }

    /**
     *
     *
     * @return listp; the false genls of NAUT
     */
    @LispMethod(comment = "@return listp; the false genls of NAUT")
    public static final SubLObject nat_not_genls_alt(SubLObject naut, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        {
            SubLObject nart = narts_high.find_nart(naut);
            if (NIL != nart_handles.nart_p(nart)) {
                return com.cyc.cycjava.cycl.genls.not_genls(nart, mt, tv);
            } else {
                return com.cyc.cycjava.cycl.genls.naut_not_genls(naut, mt);
            }
        }
    }

    /**
     *
     *
     * @return listp; the false genls of NAUT
     */
    @LispMethod(comment = "@return listp; the false genls of NAUT")
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

    /**
     *
     *
     * @return listp; the maximal false genls of NAT-FORMULA
     */
    @LispMethod(comment = "@return listp; the maximal false genls of NAT-FORMULA")
    public static final SubLObject nat_max_not_genls_alt(SubLObject nat_formula, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        {
            SubLObject nat = narts_high.find_nart(nat_formula);
            if (NIL != nart_handles.nart_p(nat)) {
                return com.cyc.cycjava.cycl.genls.max_not_genls(nat, mt, tv);
            } else {
                return com.cyc.cycjava.cycl.genls.max_cols(com.cyc.cycjava.cycl.genls.naut_not_genls(nat, mt), mt, tv);
            }
        }
    }

    /**
     *
     *
     * @return listp; the maximal false genls of NAT-FORMULA
     */
    @LispMethod(comment = "@return listp; the maximal false genls of NAT-FORMULA")
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

    /**
     *
     *
     * @return listp; the false genls of NAUT
     */
    @LispMethod(comment = "@return listp; the false genls of NAUT")
    public static final SubLObject naut_not_genls_alt(SubLObject naut, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return kb_accessors.result_genl(cycl_utilities.nat_functor(naut), mt, $FALSE);
    }

    /**
     *
     *
     * @return listp; the false genls of NAUT
     */
    @LispMethod(comment = "@return listp; the false genls of NAUT")
    public static SubLObject naut_not_genls(final SubLObject naut, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return kb_accessors.result_genl(cycl_utilities.nat_functor(naut), mt, $FALSE);
    }

    /**
     * return listp; the directly asserted true specs of COL
     */
    @LispMethod(comment = "return listp; the directly asserted true specs of COL")
    public static final SubLObject specs_alt(SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_link_methods.sbhl_backward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, mt, tv, UNPROVIDED);
    }

    /**
     * return listp; the directly asserted true specs of COL
     */
    @LispMethod(comment = "return listp; the directly asserted true specs of COL")
    public static SubLObject specs(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_link_methods.sbhl_backward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, mt, tv, UNPROVIDED);
    }

    /**
     *
     *
     * @return T iff COL has no specs.
     */
    @LispMethod(comment = "@return T iff COL has no specs.")
    public static final SubLObject leaf_colP_alt(SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return makeBoolean(NIL == sbhl_link_methods.sbhl_backward_true_link_nodes_p(sbhl_module_vars.get_sbhl_module($$genls), col, mt, tv));
    }

    /**
     *
     *
     * @return T iff COL has no specs.
     */
    @LispMethod(comment = "@return T iff COL has no specs.")
    public static SubLObject leaf_colP(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return makeBoolean(NIL == sbhl_link_methods.sbhl_backward_true_link_nodes_p(sbhl_module_vars.get_sbhl_module($$genls), col, mt, tv));
    }

    /**
     * Returns the least-specific specs of collection COL
     */
    @LispMethod(comment = "Returns the least-specific specs of collection COL")
    public static final SubLObject max_specs_alt(SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(col, EL_FORT_P);
        return sbhl_search_methods.sbhl_max_backward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, mt, tv);
    }

    /**
     * Returns the least-specific specs of collection COL
     */
    @LispMethod(comment = "Returns the least-specific specs of collection COL")
    public static SubLObject max_specs(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(col, EL_FORT_P);
        return sbhl_search_methods.sbhl_max_backward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, mt, tv);
    }

    /**
     *
     *
     * @return listp; the directely asserted false specs of COL.
     */
    @LispMethod(comment = "@return listp; the directely asserted false specs of COL.")
    public static final SubLObject not_specs_alt(SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_link_methods.sbhl_backward_false_link_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, mt, tv, UNPROVIDED);
    }

    /**
     *
     *
     * @return listp; the directely asserted false specs of COL.
     */
    @LispMethod(comment = "@return listp; the directely asserted false specs of COL.")
    public static SubLObject not_specs(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_link_methods.sbhl_backward_false_link_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, mt, tv, UNPROVIDED);
    }

    /**
     * Returns the most-specific negated specs of collection COL
     */
    @LispMethod(comment = "Returns the most-specific negated specs of collection COL")
    public static final SubLObject min_not_specs_alt(SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(col, EL_FORT_P);
        return sbhl_search_methods.sbhl_min_backward_false_link_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, mt, tv);
    }

    /**
     * Returns the most-specific negated specs of collection COL
     */
    @LispMethod(comment = "Returns the most-specific negated specs of collection COL")
    public static SubLObject min_not_specs(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(col, EL_FORT_P);
        return sbhl_search_methods.sbhl_min_backward_false_link_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, mt, tv);
    }

    /**
     * Returns the direct genls of those direct spec collections of COL
     */
    @LispMethod(comment = "Returns the direct genls of those direct spec collections of COL")
    public static final SubLObject genl_siblings_alt(SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(col, EL_FORT_P);
        return sbhl_link_methods.sbhl_siblings_forward(sbhl_module_vars.get_sbhl_module($$genls), col, mt, tv);
    }

    /**
     * Returns the direct genls of those direct spec collections of COL
     */
    @LispMethod(comment = "Returns the direct genls of those direct spec collections of COL")
    public static SubLObject genl_siblings(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(col, EL_FORT_P);
        return sbhl_link_methods.sbhl_siblings_forward(sbhl_module_vars.get_sbhl_module($$genls), col, mt, tv);
    }

    /**
     * Returns the direct specs of those direct genls collections of COL
     */
    @LispMethod(comment = "Returns the direct specs of those direct genls collections of COL")
    public static final SubLObject spec_siblings_alt(SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(col, EL_FORT_P);
        return sbhl_link_methods.sbhl_siblings_backward(sbhl_module_vars.get_sbhl_module($$genls), col, mt, tv);
    }

    /**
     * Returns the direct specs of those direct genls collections of COL
     */
    @LispMethod(comment = "Returns the direct specs of those direct genls collections of COL")
    public static SubLObject spec_siblings(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(col, EL_FORT_P);
        return sbhl_link_methods.sbhl_siblings_backward(sbhl_module_vars.get_sbhl_module($$genls), col, mt, tv);
    }

    /**
     * Returns all genls of collection COL
     * (ascending transitive closure; inexpensive)
     */
    @LispMethod(comment = "Returns all genls of collection COL\r\n(ascending transitive closure; inexpensive)\nReturns all genls of collection COL\n(ascending transitive closure; inexpensive)")
    public static final SubLObject all_genls_alt(SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(col, EL_FORT_P);
        if ((NIL == forts.fort_p(col)) || (NIL != fort_types_interface.collectionP(col))) {
            return sbhl_search_methods.sbhl_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, mt, tv);
        }
        return NIL;
    }

    /**
     * Returns all genls of collection COL
     * (ascending transitive closure; inexpensive)
     */
    @LispMethod(comment = "Returns all genls of collection COL\r\n(ascending transitive closure; inexpensive)\nReturns all genls of collection COL\n(ascending transitive closure; inexpensive)")
    public static SubLObject all_genls(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(col, EL_FORT_P);
        if ((NIL == forts.fort_p(col)) || (NIL != fort_types_interface.collectionP(col))) {
            return sbhl_search_methods.sbhl_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, mt, tv);
        }
        return NIL;
    }

    /**
     * returns all genls of collection <col> in any microtheory
     * (ascending transitive closure; inexpensive)
     */
    @LispMethod(comment = "returns all genls of collection <col> in any microtheory\r\n(ascending transitive closure; inexpensive)\nreturns all genls of collection <col> in any microtheory\n(ascending transitive closure; inexpensive)")
    public static final SubLObject all_genls_in_any_mt_alt(SubLObject col) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject all_genls = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        all_genls = com.cyc.cycjava.cycl.genls.all_genls(col, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return all_genls;
            }
        }
    }

    /**
     * returns all genls of collection <col> in any microtheory
     * (ascending transitive closure; inexpensive)
     */
    @LispMethod(comment = "returns all genls of collection <col> in any microtheory\r\n(ascending transitive closure; inexpensive)\nreturns all genls of collection <col> in any microtheory\n(ascending transitive closure; inexpensive)")
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

    /**
     * returns all genls of collection <col> in microtheory <mt>
     * (ascending transitive closure; inexpensive)
     */
    @LispMethod(comment = "returns all genls of collection <col> in microtheory <mt>\r\n(ascending transitive closure; inexpensive)\nreturns all genls of collection <col> in microtheory <mt>\n(ascending transitive closure; inexpensive)")
    public static final SubLObject all_genls_in_mt_alt(SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject all_genls = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                        mt_relevance_macros.$mt$.bind(mt, thread);
                        all_genls = com.cyc.cycjava.cycl.genls.all_genls(col, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return all_genls;
            }
        }
    }

    /**
     * returns all genls of collection <col> in microtheory <mt>
     * (ascending transitive closure; inexpensive)
     */
    @LispMethod(comment = "returns all genls of collection <col> in microtheory <mt>\r\n(ascending transitive closure; inexpensive)\nreturns all genls of collection <col> in microtheory <mt>\n(ascending transitive closure; inexpensive)")
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

    /**
     * returns all genls of collection <col> in microtheories <mts>
     * (ascending transitive closure; inexpensive)
     */
    @LispMethod(comment = "returns all genls of collection <col> in microtheories <mts>\r\n(ascending transitive closure; inexpensive)\nreturns all genls of collection <col> in microtheories <mts>\n(ascending transitive closure; inexpensive)")
    public static final SubLObject all_genls_in_mts_alt(SubLObject col, SubLObject mts) {
        if (mts == UNPROVIDED) {
            mts = genl_mts.all_base_mts(mt_relevance_macros.$mt$.getDynamicValue());
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject all_genls = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
                        mt_relevance_macros.$relevant_mts$.bind(mts, thread);
                        all_genls = com.cyc.cycjava.cycl.genls.all_genls(col, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return all_genls;
            }
        }
    }

    /**
     * returns all genls of collection <col> in microtheories <mts>
     * (ascending transitive closure; inexpensive)
     */
    @LispMethod(comment = "returns all genls of collection <col> in microtheories <mts>\r\n(ascending transitive closure; inexpensive)\nreturns all genls of collection <col> in microtheories <mts>\n(ascending transitive closure; inexpensive)")
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

    /**
     * returns all genls of collection-denoting <nat-formula>
     * (ascending transitive closure; inexpensive)
     */
    @LispMethod(comment = "returns all genls of collection-denoting <nat-formula>\r\n(ascending transitive closure; inexpensive)\nreturns all genls of collection-denoting <nat-formula>\n(ascending transitive closure; inexpensive)")
    public static final SubLObject nat_all_genls_alt(SubLObject nat_formula, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        {
            SubLObject nat = narts_high.find_nart(nat_formula);
            if (NIL != nart_handles.nart_p(nat)) {
                return com.cyc.cycjava.cycl.genls.all_genls(nat, mt, tv);
            } else {
                return com.cyc.cycjava.cycl.genls.union_all_genls(com.cyc.cycjava.cycl.genls.nat_genls(nat_formula, mt, tv), UNPROVIDED, UNPROVIDED);
            }
        }
    }

    /**
     * returns all genls of collection-denoting <nat-formula>
     * (ascending transitive closure; inexpensive)
     */
    @LispMethod(comment = "returns all genls of collection-denoting <nat-formula>\r\n(ascending transitive closure; inexpensive)\nreturns all genls of collection-denoting <nat-formula>\n(ascending transitive closure; inexpensive)")
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

    /**
     * returns all proper genls of COL.
     */
    @LispMethod(comment = "returns all proper genls of COL.")
    public static final SubLObject all_proper_genls_alt(SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return remove(col, com.cyc.cycjava.cycl.genls.all_genls(col, mt, tv), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * returns all proper genls of COL.
     */
    @LispMethod(comment = "returns all proper genls of COL.")
    public static SubLObject all_proper_genls(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return remove(col, all_genls(col, mt, tv), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns all specs of collection COL
     * (descending transitive closure; expensive)
     */
    @LispMethod(comment = "Returns all specs of collection COL\r\n(descending transitive closure; expensive)\nReturns all specs of collection COL\n(descending transitive closure; expensive)")
    public static final SubLObject all_specs_alt(SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(col, EL_FORT_P);
        if ((NIL == forts.fort_p(col)) || (NIL != fort_types_interface.collectionP(col))) {
            return sbhl_search_methods.sbhl_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, mt, tv);
        }
        return NIL;
    }

    /**
     * Returns all specs of collection COL
     * (descending transitive closure; expensive)
     */
    @LispMethod(comment = "Returns all specs of collection COL\r\n(descending transitive closure; expensive)\nReturns all specs of collection COL\n(descending transitive closure; expensive)")
    public static SubLObject all_specs(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(col, EL_FORT_P);
        if ((NIL == forts.fort_p(col)) || (NIL != fort_types_interface.collectionP(col))) {
            return sbhl_search_methods.sbhl_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, mt, tv);
        }
        return NIL;
    }

    /**
     * returns all proper specs of COL.
     */
    @LispMethod(comment = "returns all proper specs of COL.")
    public static final SubLObject all_proper_specs_alt(SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return remove(col, com.cyc.cycjava.cycl.genls.all_specs(col, mt, tv), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * returns all proper specs of COL.
     */
    @LispMethod(comment = "returns all proper specs of COL.")
    public static SubLObject all_proper_specs(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return remove(col, all_specs(col, mt, tv), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Return all proper specs of COL in any mt.  Results are sorted from most general to least general.
     */
    @LispMethod(comment = "Return all proper specs of COL in any mt.  Results are sorted from most general to least general.")
    public static final SubLObject all_proper_specs_in_any_mt_alt(SubLObject col) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        result = cardinality_estimates.sort_by_generality_estimate(com.cyc.cycjava.cycl.genls.all_proper_specs(col, UNPROVIDED, UNPROVIDED), $DESCENDING);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Return all proper specs of COL in any mt.  Results are sorted from most general to least general.
     */
    @LispMethod(comment = "Return all proper specs of COL in any mt.  Results are sorted from most general to least general.")
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

    /**
     * Return all leaf specs of COL in any mt.
     */
    @LispMethod(comment = "Return all leaf specs of COL in any mt.")
    public static final SubLObject all_leaf_specs_in_all_mts_alt(SubLObject col) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject expected_size = integerDivide(cardinality_estimates.spec_cardinality(col), TWO_INTEGER);
                SubLObject leaf_set = set.new_set(symbol_function(EQ), expected_size);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject node_var = col;
                            SubLObject deck_type = (false) ? ((SubLObject) ($QUEUE)) : $STACK;
                            SubLObject recur_deck = deck.create_deck(deck_type);
                            {
                                SubLObject _prev_bind_0_1 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                try {
                                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                    {
                                        SubLObject tv_var = NIL;
                                        {
                                            SubLObject _prev_bind_0_2 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                            SubLObject _prev_bind_1_3 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                if (NIL != tv_var) {
                                                    if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                        if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                            {
                                                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                if (pcase_var.eql($ERROR)) {
                                                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } else {
                                                                    if (pcase_var.eql($CERROR)) {
                                                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } else {
                                                                        if (pcase_var.eql($WARN)) {
                                                                            Errors.warn($str_alt32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        } else {
                                                                            Errors.warn($str_alt37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                            Errors.cerror($$$continue_anyway, $str_alt32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                {
                                                    SubLObject _prev_bind_0_4 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_5 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                    SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                    SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(col, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                            {
                                                                SubLObject _prev_bind_0_6 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_7 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                SubLObject _prev_bind_2_8 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                try {
                                                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                                    while (NIL != node_var) {
                                                                        {
                                                                            SubLObject spec = node_var;
                                                                            if (NIL != com.cyc.cycjava.cycl.genls.leaf_colP(spec, UNPROVIDED, UNPROVIDED)) {
                                                                                set.set_add(spec, leaf_set);
                                                                            }
                                                                        }
                                                                        {
                                                                            SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                                                            SubLObject cdolist_list_var = accessible_modules;
                                                                            SubLObject module_var = NIL;
                                                                            for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                {
                                                                                    SubLObject _prev_bind_0_9 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_1_10 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                        {
                                                                                            SubLObject node = function_terms.naut_to_nart(node_var);
                                                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                {
                                                                                                    SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                    if (NIL != d_link) {
                                                                                                        {
                                                                                                            SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                            if (NIL != mt_links) {
                                                                                                                {
                                                                                                                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                        thread.resetMultipleValues();
                                                                                                                        {
                                                                                                                            SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                            SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                            thread.resetMultipleValues();
                                                                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                {
                                                                                                                                    SubLObject _prev_bind_0_11 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                    try {
                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                        {
                                                                                                                                            SubLObject iteration_state_12 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_12)) {
                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                {
                                                                                                                                                    SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_12);
                                                                                                                                                    SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                        {
                                                                                                                                                            SubLObject _prev_bind_0_13 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                            try {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                {
                                                                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                    SubLObject cdolist_list_var_14 = new_list;
                                                                                                                                                                    SubLObject node_vars_link_node = NIL;
                                                                                                                                                                    for (node_vars_link_node = cdolist_list_var_14.first(); NIL != cdolist_list_var_14; cdolist_list_var_14 = cdolist_list_var_14.rest() , node_vars_link_node = cdolist_list_var_14.first()) {
                                                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            } finally {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_13, thread);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    iteration_state_12 = dictionary_contents.do_dictionary_contents_next(iteration_state_12);
                                                                                                                                                }
                                                                                                                                            } 
                                                                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_12);
                                                                                                                                        }
                                                                                                                                    } finally {
                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_11, thread);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                        }
                                                                                                                    } 
                                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt38$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                    {
                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                        SubLObject cdolist_list_var_15 = new_list;
                                                                                                        SubLObject generating_fn = NIL;
                                                                                                        for (generating_fn = cdolist_list_var_15.first(); NIL != cdolist_list_var_15; cdolist_list_var_15 = cdolist_list_var_15.rest() , generating_fn = cdolist_list_var_15.first()) {
                                                                                                            {
                                                                                                                SubLObject _prev_bind_0_16 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                try {
                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                    {
                                                                                                                        SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                        SubLObject new_list_17 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                        SubLObject cdolist_list_var_18 = new_list_17;
                                                                                                                        SubLObject node_vars_link_node = NIL;
                                                                                                                        for (node_vars_link_node = cdolist_list_var_18.first(); NIL != cdolist_list_var_18; cdolist_list_var_18 = cdolist_list_var_18.rest() , node_vars_link_node = cdolist_list_var_18.first()) {
                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                } finally {
                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_16, thread);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_10, thread);
                                                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_9, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        node_var = deck.deck_pop(recur_deck);
                                                                    } 
                                                                } finally {
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_8, thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_7, thread);
                                                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_6, thread);
                                                                }
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt39$Node__a_does_not_pass_sbhl_type_t, col, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } finally {
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_5, thread);
                                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_4, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_3, thread);
                                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_2, thread);
                                            }
                                        }
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    }
                                } finally {
                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return set.set_element_list(leaf_set);
            }
        }
    }

    /**
     * Return all leaf specs of COL in any mt.
     */
    @LispMethod(comment = "Return all leaf specs of COL in any mt.")
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

    /**
     * Returns a list of all the specs of CYCL-TERM, except that if there are more than MAX terms, then the list is truncated to MAX length.
     */
    @LispMethod(comment = "Returns a list of all the specs of CYCL-TERM, except that if there are more than MAX terms, then the list is truncated to MAX length.")
    public static final SubLObject all_specs_with_max_alt(SubLObject cycl_term, SubLObject max) {
        SubLTrampolineFile.checkType(max, INTEGERP);
        if (NIL == fort_types_interface.collection_p(cycl_term)) {
            return NIL;
        }
        {
            SubLObject iter = kb_iterators.new_specs_iterator(cycl_term);
            SubLObject cur_term = NIL;
            SubLObject result = NIL;
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(max); i = add(i, ONE_INTEGER)) {
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
    }

    /**
     * Returns a list of all the specs of CYCL-TERM, except that if there are more than MAX terms, then the list is truncated to MAX length.
     */
    @LispMethod(comment = "Returns a list of all the specs of CYCL-TERM, except that if there are more than MAX terms, then the list is truncated to MAX length.")
    public static SubLObject all_specs_with_max(final SubLObject cycl_term, final SubLObject max) {
        assert NIL != integerp(max) : "! integerp(max) " + ("Types.integerp(max) " + "CommonSymbols.NIL != Types.integerp(max) ") + max;
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

    /**
     * Counts the number of specs in COLLECTION and then returns the count.
     */
    @LispMethod(comment = "Counts the number of specs in COLLECTION and then returns the count.")
    public static final SubLObject count_all_specs_alt(SubLObject collection, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(collection, EL_FORT_P);
            {
                SubLObject count = ZERO_INTEGER;
                SubLObject node_var = collection;
                SubLObject deck_type = (false) ? ((SubLObject) ($QUEUE)) : $STACK;
                SubLObject recur_deck = deck.create_deck(deck_type);
                {
                    SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        {
                            SubLObject mt_var = mt;
                            {
                                SubLObject _prev_bind_0_19 = mt_relevance_macros.$mt$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                    {
                                        SubLObject tv_var = tv;
                                        {
                                            SubLObject _prev_bind_0_20 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                            SubLObject _prev_bind_1_21 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                if (NIL != tv_var) {
                                                    if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                        if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                            {
                                                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                if (pcase_var.eql($ERROR)) {
                                                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } else {
                                                                    if (pcase_var.eql($CERROR)) {
                                                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } else {
                                                                        if (pcase_var.eql($WARN)) {
                                                                            Errors.warn($str_alt32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        } else {
                                                                            Errors.warn($str_alt37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                            Errors.cerror($$$continue_anyway, $str_alt32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                {
                                                    SubLObject _prev_bind_0_22 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_23 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                    SubLObject _prev_bind_2_24 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                    SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(collection, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                            {
                                                                SubLObject _prev_bind_0_25 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_26 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                SubLObject _prev_bind_2_27 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                try {
                                                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                                    while (NIL != node_var) {
                                                                        {
                                                                            SubLObject spec = node_var;
                                                                            count = add(count, ONE_INTEGER);
                                                                        }
                                                                        {
                                                                            SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                                                            SubLObject cdolist_list_var = accessible_modules;
                                                                            SubLObject module_var = NIL;
                                                                            for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                {
                                                                                    SubLObject _prev_bind_0_28 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_1_29 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                        {
                                                                                            SubLObject node = function_terms.naut_to_nart(node_var);
                                                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                {
                                                                                                    SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                    if (NIL != d_link) {
                                                                                                        {
                                                                                                            SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                            if (NIL != mt_links) {
                                                                                                                {
                                                                                                                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                        thread.resetMultipleValues();
                                                                                                                        {
                                                                                                                            SubLObject mt_30 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                            SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                            thread.resetMultipleValues();
                                                                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt_30)) {
                                                                                                                                {
                                                                                                                                    SubLObject _prev_bind_0_31 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                    try {
                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt_30, thread);
                                                                                                                                        {
                                                                                                                                            SubLObject iteration_state_32 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_32)) {
                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                {
                                                                                                                                                    SubLObject tv_33 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_32);
                                                                                                                                                    SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_33)) {
                                                                                                                                                        {
                                                                                                                                                            SubLObject _prev_bind_0_34 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                            try {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv_33, thread);
                                                                                                                                                                {
                                                                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                    SubLObject cdolist_list_var_35 = new_list;
                                                                                                                                                                    SubLObject node_vars_link_node = NIL;
                                                                                                                                                                    for (node_vars_link_node = cdolist_list_var_35.first(); NIL != cdolist_list_var_35; cdolist_list_var_35 = cdolist_list_var_35.rest() , node_vars_link_node = cdolist_list_var_35.first()) {
                                                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            } finally {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_34, thread);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    iteration_state_32 = dictionary_contents.do_dictionary_contents_next(iteration_state_32);
                                                                                                                                                }
                                                                                                                                            } 
                                                                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_32);
                                                                                                                                        }
                                                                                                                                    } finally {
                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_31, thread);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                        }
                                                                                                                    } 
                                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt38$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                    {
                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                        SubLObject cdolist_list_var_36 = new_list;
                                                                                                        SubLObject generating_fn = NIL;
                                                                                                        for (generating_fn = cdolist_list_var_36.first(); NIL != cdolist_list_var_36; cdolist_list_var_36 = cdolist_list_var_36.rest() , generating_fn = cdolist_list_var_36.first()) {
                                                                                                            {
                                                                                                                SubLObject _prev_bind_0_37 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                try {
                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                    {
                                                                                                                        SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                        SubLObject new_list_38 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                        SubLObject cdolist_list_var_39 = new_list_38;
                                                                                                                        SubLObject node_vars_link_node = NIL;
                                                                                                                        for (node_vars_link_node = cdolist_list_var_39.first(); NIL != cdolist_list_var_39; cdolist_list_var_39 = cdolist_list_var_39.rest() , node_vars_link_node = cdolist_list_var_39.first()) {
                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                } finally {
                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_37, thread);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_29, thread);
                                                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_28, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        node_var = deck.deck_pop(recur_deck);
                                                                    } 
                                                                } finally {
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_27, thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_26, thread);
                                                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_25, thread);
                                                                }
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt39$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } finally {
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_24, thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_23, thread);
                                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_22, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_21, thread);
                                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_20, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_19, thread);
                                }
                            }
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                    }
                }
                return count;
            }
        }
    }

    /**
     * Counts the number of specs in COLLECTION and then returns the count.
     */
    @LispMethod(comment = "Counts the number of specs in COLLECTION and then returns the count.")
    public static SubLObject count_all_specs(final SubLObject collection, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(collection, EL_FORT_P);
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

    /**
     * Counts the number of specs in COLLECTION that pass PRED and then returns
     * the count.
     */
    @LispMethod(comment = "Counts the number of specs in COLLECTION that pass PRED and then returns\r\nthe count.\nCounts the number of specs in COLLECTION that pass PRED and then returns\nthe count.")
    public static final SubLObject count_all_specs_if_alt(SubLObject collection, SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = ZERO_INTEGER;
                SubLObject node_var = collection;
                SubLObject deck_type = (false) ? ((SubLObject) ($QUEUE)) : $STACK;
                SubLObject recur_deck = deck.create_deck(deck_type);
                {
                    SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        {
                            SubLObject mt_var = mt;
                            {
                                SubLObject _prev_bind_0_40 = mt_relevance_macros.$mt$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                    {
                                        SubLObject tv_var = tv;
                                        {
                                            SubLObject _prev_bind_0_41 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                            SubLObject _prev_bind_1_42 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                if (NIL != tv_var) {
                                                    if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                        if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                            {
                                                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                if (pcase_var.eql($ERROR)) {
                                                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } else {
                                                                    if (pcase_var.eql($CERROR)) {
                                                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } else {
                                                                        if (pcase_var.eql($WARN)) {
                                                                            Errors.warn($str_alt32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        } else {
                                                                            Errors.warn($str_alt37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                            Errors.cerror($$$continue_anyway, $str_alt32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                {
                                                    SubLObject _prev_bind_0_43 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_44 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                    SubLObject _prev_bind_2_45 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                    SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(collection, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                            {
                                                                SubLObject _prev_bind_0_46 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_47 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                SubLObject _prev_bind_2_48 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                try {
                                                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                                    while (NIL != node_var) {
                                                                        {
                                                                            SubLObject spec = node_var;
                                                                            if (NIL != funcall(pred, spec)) {
                                                                                count = add(count, ONE_INTEGER);
                                                                            }
                                                                        }
                                                                        {
                                                                            SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                                                            SubLObject cdolist_list_var = accessible_modules;
                                                                            SubLObject module_var = NIL;
                                                                            for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                {
                                                                                    SubLObject _prev_bind_0_49 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_1_50 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                        {
                                                                                            SubLObject node = function_terms.naut_to_nart(node_var);
                                                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                {
                                                                                                    SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                    if (NIL != d_link) {
                                                                                                        {
                                                                                                            SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                            if (NIL != mt_links) {
                                                                                                                {
                                                                                                                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                        thread.resetMultipleValues();
                                                                                                                        {
                                                                                                                            SubLObject mt_51 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                            SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                            thread.resetMultipleValues();
                                                                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt_51)) {
                                                                                                                                {
                                                                                                                                    SubLObject _prev_bind_0_52 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                    try {
                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt_51, thread);
                                                                                                                                        {
                                                                                                                                            SubLObject iteration_state_53 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_53)) {
                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                {
                                                                                                                                                    SubLObject tv_54 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_53);
                                                                                                                                                    SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_54)) {
                                                                                                                                                        {
                                                                                                                                                            SubLObject _prev_bind_0_55 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                            try {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv_54, thread);
                                                                                                                                                                {
                                                                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                    SubLObject cdolist_list_var_56 = new_list;
                                                                                                                                                                    SubLObject node_vars_link_node = NIL;
                                                                                                                                                                    for (node_vars_link_node = cdolist_list_var_56.first(); NIL != cdolist_list_var_56; cdolist_list_var_56 = cdolist_list_var_56.rest() , node_vars_link_node = cdolist_list_var_56.first()) {
                                                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            } finally {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_55, thread);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    iteration_state_53 = dictionary_contents.do_dictionary_contents_next(iteration_state_53);
                                                                                                                                                }
                                                                                                                                            } 
                                                                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_53);
                                                                                                                                        }
                                                                                                                                    } finally {
                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_52, thread);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                        }
                                                                                                                    } 
                                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt38$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                    {
                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                        SubLObject cdolist_list_var_57 = new_list;
                                                                                                        SubLObject generating_fn = NIL;
                                                                                                        for (generating_fn = cdolist_list_var_57.first(); NIL != cdolist_list_var_57; cdolist_list_var_57 = cdolist_list_var_57.rest() , generating_fn = cdolist_list_var_57.first()) {
                                                                                                            {
                                                                                                                SubLObject _prev_bind_0_58 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                try {
                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                    {
                                                                                                                        SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                        SubLObject new_list_59 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                        SubLObject cdolist_list_var_60 = new_list_59;
                                                                                                                        SubLObject node_vars_link_node = NIL;
                                                                                                                        for (node_vars_link_node = cdolist_list_var_60.first(); NIL != cdolist_list_var_60; cdolist_list_var_60 = cdolist_list_var_60.rest() , node_vars_link_node = cdolist_list_var_60.first()) {
                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                } finally {
                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_58, thread);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_50, thread);
                                                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_49, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        node_var = deck.deck_pop(recur_deck);
                                                                    } 
                                                                } finally {
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_48, thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_47, thread);
                                                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_46, thread);
                                                                }
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt39$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } finally {
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_45, thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_44, thread);
                                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_43, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_42, thread);
                                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_41, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_40, thread);
                                }
                            }
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                    }
                }
                return count;
            }
        }
    }

    /**
     * Counts the number of specs in COLLECTION that pass PRED and then returns
     * the count.
     */
    @LispMethod(comment = "Counts the number of specs in COLLECTION that pass PRED and then returns\r\nthe count.\nCounts the number of specs in COLLECTION that pass PRED and then returns\nthe count.")
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

    /**
     *
     *
     * @return boolean; whether COLLECTION has exactly NUM specs in MT with TV.
     */
    @LispMethod(comment = "@return boolean; whether COLLECTION has exactly NUM specs in MT with TV.")
    public static final SubLObject count_all_specs_E_alt(SubLObject collection, SubLObject num, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = ZERO_INTEGER;
                SubLObject GP = NIL;
                if (NIL == GP) {
                    {
                        SubLObject node_var = collection;
                        SubLObject deck_type = (false) ? ((SubLObject) ($QUEUE)) : $STACK;
                        SubLObject recur_deck = deck.create_deck(deck_type);
                        {
                            SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                {
                                    SubLObject mt_var = mt;
                                    {
                                        SubLObject _prev_bind_0_61 = mt_relevance_macros.$mt$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                        try {
                                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                            {
                                                SubLObject tv_var = tv;
                                                {
                                                    SubLObject _prev_bind_0_62 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_63 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                        if (NIL != tv_var) {
                                                            if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                                if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                    {
                                                                        SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                        if (pcase_var.eql($ERROR)) {
                                                                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                        } else {
                                                                            if (pcase_var.eql($CERROR)) {
                                                                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                            } else {
                                                                                if (pcase_var.eql($WARN)) {
                                                                                    Errors.warn($str_alt32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                } else {
                                                                                    Errors.warn($str_alt37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                                    Errors.cerror($$$continue_anyway, $str_alt32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        {
                                                            SubLObject _prev_bind_0_64 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                            SubLObject _prev_bind_1_65 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                            SubLObject _prev_bind_2_66 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                            SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                            SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                            try {
                                                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(collection, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                                    {
                                                                        SubLObject _prev_bind_0_67 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                        SubLObject _prev_bind_1_68 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                        SubLObject _prev_bind_2_69 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                                            while ((NIL != node_var) && (NIL == GP)) {
                                                                                {
                                                                                    SubLObject spec = node_var;
                                                                                    count = add(count, ONE_INTEGER);
                                                                                    if (count.numG(num)) {
                                                                                        GP = T;
                                                                                    }
                                                                                }
                                                                                {
                                                                                    SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                                                                    SubLObject rest = NIL;
                                                                                    for (rest = accessible_modules; !((NIL != GP) || (NIL == rest)); rest = rest.rest()) {
                                                                                        {
                                                                                            SubLObject module_var = rest.first();
                                                                                            {
                                                                                                SubLObject _prev_bind_0_70 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                SubLObject _prev_bind_1_71 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                    {
                                                                                                        SubLObject node = function_terms.naut_to_nart(node_var);
                                                                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                            {
                                                                                                                SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                if (NIL != d_link) {
                                                                                                                    {
                                                                                                                        SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                        if (NIL != mt_links) {
                                                                                                                            {
                                                                                                                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                                while (!((NIL != GP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                    {
                                                                                                                                        SubLObject mt_72 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                        SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt_72)) {
                                                                                                                                            {
                                                                                                                                                SubLObject _prev_bind_0_73 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                try {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt_72, thread);
                                                                                                                                                    {
                                                                                                                                                        SubLObject iteration_state_74 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                        while (!((NIL != GP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_74)))) {
                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                            {
                                                                                                                                                                SubLObject tv_75 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_74);
                                                                                                                                                                SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_75)) {
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject _prev_bind_0_76 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                        try {
                                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv_75, thread);
                                                                                                                                                                            {
                                                                                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                SubLObject rest_77 = NIL;
                                                                                                                                                                                for (rest_77 = new_list; !((NIL != GP) || (NIL == rest_77)); rest_77 = rest_77.rest()) {
                                                                                                                                                                                    {
                                                                                                                                                                                        SubLObject node_vars_link_node = rest_77.first();
                                                                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        } finally {
                                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_76, thread);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                iteration_state_74 = dictionary_contents.do_dictionary_contents_next(iteration_state_74);
                                                                                                                                                            }
                                                                                                                                                        } 
                                                                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_74);
                                                                                                                                                    }
                                                                                                                                                } finally {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_73, thread);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                                    }
                                                                                                                                } 
                                                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt38$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                {
                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                    SubLObject rest_78 = NIL;
                                                                                                                    for (rest_78 = new_list; !((NIL != GP) || (NIL == rest_78)); rest_78 = rest_78.rest()) {
                                                                                                                        {
                                                                                                                            SubLObject generating_fn = rest_78.first();
                                                                                                                            {
                                                                                                                                SubLObject _prev_bind_0_79 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                                try {
                                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                    {
                                                                                                                                        SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                        SubLObject new_list_80 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                        SubLObject rest_81 = NIL;
                                                                                                                                        for (rest_81 = new_list_80; !((NIL != GP) || (NIL == rest_81)); rest_81 = rest_81.rest()) {
                                                                                                                                            {
                                                                                                                                                SubLObject node_vars_link_node = rest_81.first();
                                                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                } finally {
                                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_79, thread);
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } finally {
                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_71, thread);
                                                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_70, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                node_var = deck.deck_pop(recur_deck);
                                                                            } 
                                                                        } finally {
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_69, thread);
                                                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_68, thread);
                                                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_67, thread);
                                                                        }
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt39$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            } finally {
                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_66, thread);
                                                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_65, thread);
                                                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_64, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_63, thread);
                                                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_62, thread);
                                                    }
                                                }
                                            }
                                        } finally {
                                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                            mt_relevance_macros.$mt$.rebind(_prev_bind_0_61, thread);
                                        }
                                    }
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return numE(count, num);
            }
        }
    }

    /**
     *
     *
     * @return boolean; whether COLLECTION has exactly NUM specs in MT with TV.
     */
    @LispMethod(comment = "@return boolean; whether COLLECTION has exactly NUM specs in MT with TV.")
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

    /**
     *
     *
     * @return boolean; whether COLLECTION has more than NUM specs in MT with TV.
     */
    @LispMethod(comment = "@return boolean; whether COLLECTION has more than NUM specs in MT with TV.")
    public static final SubLObject count_all_specs_G_alt(SubLObject collection, SubLObject num, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = ZERO_INTEGER;
                SubLObject GP = NIL;
                if (NIL == GP) {
                    {
                        SubLObject node_var = collection;
                        SubLObject deck_type = (false) ? ((SubLObject) ($QUEUE)) : $STACK;
                        SubLObject recur_deck = deck.create_deck(deck_type);
                        {
                            SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                {
                                    SubLObject mt_var = mt;
                                    {
                                        SubLObject _prev_bind_0_82 = mt_relevance_macros.$mt$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                        try {
                                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                            {
                                                SubLObject tv_var = tv;
                                                {
                                                    SubLObject _prev_bind_0_83 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_84 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                        if (NIL != tv_var) {
                                                            if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                                if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                    {
                                                                        SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                        if (pcase_var.eql($ERROR)) {
                                                                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                        } else {
                                                                            if (pcase_var.eql($CERROR)) {
                                                                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                            } else {
                                                                                if (pcase_var.eql($WARN)) {
                                                                                    Errors.warn($str_alt32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                } else {
                                                                                    Errors.warn($str_alt37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                                    Errors.cerror($$$continue_anyway, $str_alt32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        {
                                                            SubLObject _prev_bind_0_85 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                            SubLObject _prev_bind_1_86 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                            SubLObject _prev_bind_2_87 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                            SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                            SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                            try {
                                                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(collection, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                                    {
                                                                        SubLObject _prev_bind_0_88 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                        SubLObject _prev_bind_1_89 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                        SubLObject _prev_bind_2_90 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                                            while ((NIL != node_var) && (NIL == GP)) {
                                                                                {
                                                                                    SubLObject spec = node_var;
                                                                                    count = add(count, ONE_INTEGER);
                                                                                    if (count.numG(num)) {
                                                                                        GP = T;
                                                                                    }
                                                                                }
                                                                                {
                                                                                    SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                                                                    SubLObject rest = NIL;
                                                                                    for (rest = accessible_modules; !((NIL != GP) || (NIL == rest)); rest = rest.rest()) {
                                                                                        {
                                                                                            SubLObject module_var = rest.first();
                                                                                            {
                                                                                                SubLObject _prev_bind_0_91 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                SubLObject _prev_bind_1_92 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                    {
                                                                                                        SubLObject node = function_terms.naut_to_nart(node_var);
                                                                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                            {
                                                                                                                SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                if (NIL != d_link) {
                                                                                                                    {
                                                                                                                        SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                        if (NIL != mt_links) {
                                                                                                                            {
                                                                                                                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                                while (!((NIL != GP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                    {
                                                                                                                                        SubLObject mt_93 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                        SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt_93)) {
                                                                                                                                            {
                                                                                                                                                SubLObject _prev_bind_0_94 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                try {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt_93, thread);
                                                                                                                                                    {
                                                                                                                                                        SubLObject iteration_state_95 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                        while (!((NIL != GP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_95)))) {
                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                            {
                                                                                                                                                                SubLObject tv_96 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_95);
                                                                                                                                                                SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_96)) {
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject _prev_bind_0_97 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                        try {
                                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv_96, thread);
                                                                                                                                                                            {
                                                                                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                SubLObject rest_98 = NIL;
                                                                                                                                                                                for (rest_98 = new_list; !((NIL != GP) || (NIL == rest_98)); rest_98 = rest_98.rest()) {
                                                                                                                                                                                    {
                                                                                                                                                                                        SubLObject node_vars_link_node = rest_98.first();
                                                                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        } finally {
                                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_97, thread);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                iteration_state_95 = dictionary_contents.do_dictionary_contents_next(iteration_state_95);
                                                                                                                                                            }
                                                                                                                                                        } 
                                                                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_95);
                                                                                                                                                    }
                                                                                                                                                } finally {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_94, thread);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                                    }
                                                                                                                                } 
                                                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt38$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                {
                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                    SubLObject rest_99 = NIL;
                                                                                                                    for (rest_99 = new_list; !((NIL != GP) || (NIL == rest_99)); rest_99 = rest_99.rest()) {
                                                                                                                        {
                                                                                                                            SubLObject generating_fn = rest_99.first();
                                                                                                                            {
                                                                                                                                SubLObject _prev_bind_0_100 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                                try {
                                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                    {
                                                                                                                                        SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                        SubLObject new_list_101 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                        SubLObject rest_102 = NIL;
                                                                                                                                        for (rest_102 = new_list_101; !((NIL != GP) || (NIL == rest_102)); rest_102 = rest_102.rest()) {
                                                                                                                                            {
                                                                                                                                                SubLObject node_vars_link_node = rest_102.first();
                                                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                } finally {
                                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_100, thread);
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } finally {
                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_92, thread);
                                                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_91, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                node_var = deck.deck_pop(recur_deck);
                                                                            } 
                                                                        } finally {
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_90, thread);
                                                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_89, thread);
                                                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_88, thread);
                                                                        }
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt39$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            } finally {
                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_87, thread);
                                                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_86, thread);
                                                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_85, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_84, thread);
                                                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_83, thread);
                                                    }
                                                }
                                            }
                                        } finally {
                                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                            mt_relevance_macros.$mt$.rebind(_prev_bind_0_82, thread);
                                        }
                                    }
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return GP;
            }
        }
    }

    /**
     *
     *
     * @return boolean; whether COLLECTION has more than NUM specs in MT with TV.
     */
    @LispMethod(comment = "@return boolean; whether COLLECTION has more than NUM specs in MT with TV.")
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

    /**
     *
     *
     * @return boolean; whether COLLECTION has more than or exactly NUM specs in MT with TV.
     */
    @LispMethod(comment = "@return boolean; whether COLLECTION has more than or exactly NUM specs in MT with TV.")
    public static final SubLObject count_all_specs_GE_alt(SubLObject collection, SubLObject num, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = ZERO_INTEGER;
                SubLObject GEP = NIL;
                if (NIL == GEP) {
                    {
                        SubLObject node_var = collection;
                        SubLObject deck_type = (false) ? ((SubLObject) ($QUEUE)) : $STACK;
                        SubLObject recur_deck = deck.create_deck(deck_type);
                        {
                            SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                {
                                    SubLObject mt_var = mt;
                                    {
                                        SubLObject _prev_bind_0_103 = mt_relevance_macros.$mt$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                        try {
                                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                            {
                                                SubLObject tv_var = tv;
                                                {
                                                    SubLObject _prev_bind_0_104 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_105 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                        if (NIL != tv_var) {
                                                            if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                                if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                    {
                                                                        SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                        if (pcase_var.eql($ERROR)) {
                                                                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                        } else {
                                                                            if (pcase_var.eql($CERROR)) {
                                                                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                            } else {
                                                                                if (pcase_var.eql($WARN)) {
                                                                                    Errors.warn($str_alt32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                } else {
                                                                                    Errors.warn($str_alt37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                                    Errors.cerror($$$continue_anyway, $str_alt32$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        {
                                                            SubLObject _prev_bind_0_106 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                            SubLObject _prev_bind_1_107 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                            SubLObject _prev_bind_2_108 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                            SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                            SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                            try {
                                                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(collection, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                                    {
                                                                        SubLObject _prev_bind_0_109 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                        SubLObject _prev_bind_1_110 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                        SubLObject _prev_bind_2_111 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                                            while ((NIL != node_var) && (NIL == GEP)) {
                                                                                {
                                                                                    SubLObject spec = node_var;
                                                                                    count = add(count, ONE_INTEGER);
                                                                                    if (count.numGE(num)) {
                                                                                        GEP = T;
                                                                                    }
                                                                                }
                                                                                {
                                                                                    SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                                                                    SubLObject rest = NIL;
                                                                                    for (rest = accessible_modules; !((NIL != GEP) || (NIL == rest)); rest = rest.rest()) {
                                                                                        {
                                                                                            SubLObject module_var = rest.first();
                                                                                            {
                                                                                                SubLObject _prev_bind_0_112 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                SubLObject _prev_bind_1_113 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                    {
                                                                                                        SubLObject node = function_terms.naut_to_nart(node_var);
                                                                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                            {
                                                                                                                SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                if (NIL != d_link) {
                                                                                                                    {
                                                                                                                        SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                        if (NIL != mt_links) {
                                                                                                                            {
                                                                                                                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                                while (!((NIL != GEP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                    {
                                                                                                                                        SubLObject mt_114 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                        SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt_114)) {
                                                                                                                                            {
                                                                                                                                                SubLObject _prev_bind_0_115 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                try {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt_114, thread);
                                                                                                                                                    {
                                                                                                                                                        SubLObject iteration_state_116 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                        while (!((NIL != GEP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_116)))) {
                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                            {
                                                                                                                                                                SubLObject tv_117 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_116);
                                                                                                                                                                SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_117)) {
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject _prev_bind_0_118 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                        try {
                                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv_117, thread);
                                                                                                                                                                            {
                                                                                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                SubLObject rest_119 = NIL;
                                                                                                                                                                                for (rest_119 = new_list; !((NIL != GEP) || (NIL == rest_119)); rest_119 = rest_119.rest()) {
                                                                                                                                                                                    {
                                                                                                                                                                                        SubLObject node_vars_link_node = rest_119.first();
                                                                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        } finally {
                                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_118, thread);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                iteration_state_116 = dictionary_contents.do_dictionary_contents_next(iteration_state_116);
                                                                                                                                                            }
                                                                                                                                                        } 
                                                                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_116);
                                                                                                                                                    }
                                                                                                                                                } finally {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_115, thread);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                                    }
                                                                                                                                } 
                                                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt38$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                {
                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                    SubLObject rest_120 = NIL;
                                                                                                                    for (rest_120 = new_list; !((NIL != GEP) || (NIL == rest_120)); rest_120 = rest_120.rest()) {
                                                                                                                        {
                                                                                                                            SubLObject generating_fn = rest_120.first();
                                                                                                                            {
                                                                                                                                SubLObject _prev_bind_0_121 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                                try {
                                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                    {
                                                                                                                                        SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                        SubLObject new_list_122 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                        SubLObject rest_123 = NIL;
                                                                                                                                        for (rest_123 = new_list_122; !((NIL != GEP) || (NIL == rest_123)); rest_123 = rest_123.rest()) {
                                                                                                                                            {
                                                                                                                                                SubLObject node_vars_link_node = rest_123.first();
                                                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                } finally {
                                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_121, thread);
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } finally {
                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_113, thread);
                                                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_112, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                node_var = deck.deck_pop(recur_deck);
                                                                            } 
                                                                        } finally {
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_111, thread);
                                                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_110, thread);
                                                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_109, thread);
                                                                        }
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt39$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            } finally {
                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_108, thread);
                                                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_107, thread);
                                                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_106, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_105, thread);
                                                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_104, thread);
                                                    }
                                                }
                                            }
                                        } finally {
                                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                            mt_relevance_macros.$mt$.rebind(_prev_bind_0_103, thread);
                                        }
                                    }
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return GEP;
            }
        }
    }

    /**
     *
     *
     * @return boolean; whether COLLECTION has more than or exactly NUM specs in MT with TV.
     */
    @LispMethod(comment = "@return boolean; whether COLLECTION has more than or exactly NUM specs in MT with TV.")
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

    /**
     *
     *
     * @return boolean; whether COLLECTION has fewer than NUM specs in MT with TV.
     */
    @LispMethod(comment = "@return boolean; whether COLLECTION has fewer than NUM specs in MT with TV.")
    public static final SubLObject count_all_specs_L_alt(SubLObject collection, SubLObject num, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return numL(com.cyc.cycjava.cycl.genls.count_all_specs(collection, mt, tv), num);
    }

    /**
     *
     *
     * @return boolean; whether COLLECTION has fewer than NUM specs in MT with TV.
     */
    @LispMethod(comment = "@return boolean; whether COLLECTION has fewer than NUM specs in MT with TV.")
    public static SubLObject count_all_specs_L(final SubLObject collection, final SubLObject num, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return numL(count_all_specs(collection, mt, tv), num);
    }

    /**
     *
     *
     * @return boolean; whether COLLECTION has fewer than or exactly NUM specs in MT with TV.
     */
    @LispMethod(comment = "@return boolean; whether COLLECTION has fewer than or exactly NUM specs in MT with TV.")
    public static final SubLObject count_all_specs_LE_alt(SubLObject collection, SubLObject num, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return numLE(com.cyc.cycjava.cycl.genls.count_all_specs(collection, mt, tv), num);
    }

    /**
     *
     *
     * @return boolean; whether COLLECTION has fewer than or exactly NUM specs in MT with TV.
     */
    @LispMethod(comment = "@return boolean; whether COLLECTION has fewer than or exactly NUM specs in MT with TV.")
    public static SubLObject count_all_specs_LE(final SubLObject collection, final SubLObject num, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return numLE(count_all_specs(collection, mt, tv), num);
    }

    /**
     * Returns all genls of collection SPEC that are also specs of collection GENL (ascending transitive closure; inexpensive)
     */
    @LispMethod(comment = "Returns all genls of collection SPEC that are also specs of collection GENL (ascending transitive closure; inexpensive)")
    public static final SubLObject all_genls_wrt_alt(SubLObject spec, SubLObject genl, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(spec, EL_FORT_P);
        SubLTrampolineFile.checkType(genl, EL_FORT_P);
        return sbhl_search_methods.sbhl_all_forward_true_nodes_between(sbhl_module_vars.get_sbhl_module($$genls), spec, genl, mt, tv);
    }

    /**
     * Returns all genls of collection SPEC that are also specs of collection GENL (ascending transitive closure; inexpensive)
     */
    @LispMethod(comment = "Returns all genls of collection SPEC that are also specs of collection GENL (ascending transitive closure; inexpensive)")
    public static SubLObject all_genls_wrt(final SubLObject spec, final SubLObject genl, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(spec, EL_FORT_P);
        SubLTrampolineFile.enforceType(genl, EL_FORT_P);
        return sbhl_search_methods.sbhl_all_forward_true_nodes_between(sbhl_module_vars.get_sbhl_module($$genls), spec, genl, mt, tv);
    }/**
     * Returns all genls of collection SPEC that are also specs of collection GENL (ascending transitive closure; inexpensive)
     */


    /**
     * Returns all genls of each collection in COLs
     */
    @LispMethod(comment = "Returns all genls of each collection in COLs")
    public static final SubLObject union_all_genls_alt(SubLObject cols, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(cols, LISTP);
        if (NIL == cols) {
            return NIL;
        } else {
            if (NIL != list_utilities.singletonP(cols)) {
                return com.cyc.cycjava.cycl.genls.all_genls(cols.first(), mt, tv);
            } else {
                return sbhl_search_methods.sbhl_union_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), cols, mt, tv);
            }
        }
    }

    /**
     * Returns all genls of each collection in COLs
     */
    @LispMethod(comment = "Returns all genls of each collection in COLs")
    public static SubLObject union_all_genls(final SubLObject cols, SubLObject mt, SubLObject tv) {
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
            return all_genls(cols.first(), mt, tv);
        }
        return sbhl_search_methods.sbhl_union_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), cols, mt, tv);
    }/**
     * Returns all genls of each collection in COLs
     */


    /**
     * Returns the most-specific genls of all collections in COLS
     * that are also instances of TYPE-COL.
     *
     * @unknown pace
     */
    @LispMethod(comment = "Returns the most-specific genls of all collections in COLS\r\nthat are also instances of TYPE-COL.\r\n\r\n@unknown pace\nReturns the most-specific genls of all collections in COLS\nthat are also instances of TYPE-COL.")
    public static final SubLObject union_min_genls_of_type_alt(SubLObject cols, SubLObject type_col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        {
            SubLObject all_genls = com.cyc.cycjava.cycl.genls.union_all_genls(cols, mt, tv);
            SubLObject genls_of_type = isa.all_instances_among(type_col, all_genls, mt, tv);
            return com.cyc.cycjava.cycl.genls.min_cols(genls_of_type, mt, tv);
        }
    }

    /**
     * Returns the most-specific genls of all collections in COLS
     * that are also instances of TYPE-COL.
     *
     * @unknown pace
     */
    @LispMethod(comment = "Returns the most-specific genls of all collections in COLS\r\nthat are also instances of TYPE-COL.\r\n\r\n@unknown pace\nReturns the most-specific genls of all collections in COLS\nthat are also instances of TYPE-COL.")
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
    }/**
     * Returns the most-specific genls of all collections in COLS
     * that are also instances of TYPE-COL.
     *
     * @unknown pace
     */


    /**
     * Returns all the collections in CANDIDATES which are genls of any collection in COLS.
     */
    @LispMethod(comment = "Returns all the collections in CANDIDATES which are genls of any collection in COLS.")
    public static final SubLObject union_all_genls_among_alt(SubLObject cols, SubLObject candidates, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return keyhash_utilities.fast_intersection(com.cyc.cycjava.cycl.genls.union_all_genls(cols, mt, tv), candidates, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns all the collections in CANDIDATES which are genls of any collection in COLS.
     */
    @LispMethod(comment = "Returns all the collections in CANDIDATES which are genls of any collection in COLS.")
    public static SubLObject union_all_genls_among(final SubLObject cols, final SubLObject candidates, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return keyhash_utilities.fast_intersection(union_all_genls(cols, mt, tv), candidates, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }/**
     * Returns all the collections in CANDIDATES which are genls of any collection in COLS.
     */


    /**
     *
     *
     * @return booleanp; whether every collection in GENLS is a genl
    of some collection in SPECS.
     */
    @LispMethod(comment = "@return booleanp; whether every collection in GENLS is a genl\r\nof some collection in SPECS.")
    public static final SubLObject all_genl_of_someP_alt(SubLObject specs, SubLObject v_genls, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return subsetp(v_genls, com.cyc.cycjava.cycl.genls.union_all_genls_among(specs, v_genls, mt, tv), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return booleanp; whether every collection in GENLS is a genl
    of some collection in SPECS.
     */
    @LispMethod(comment = "@return booleanp; whether every collection in GENLS is a genl\r\nof some collection in SPECS.")
    public static SubLObject all_genl_of_someP(final SubLObject specs, final SubLObject v_genls, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return subsetp(v_genls, union_all_genls_among(specs, v_genls, mt, tv), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns all specs of each collection in COLs
     */
    @LispMethod(comment = "Returns all specs of each collection in COLs")
    public static final SubLObject union_all_specs_alt(SubLObject cols, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(cols, LISTP);
        if (NIL == cols) {
            return NIL;
        } else {
            if (NIL != list_utilities.singletonP(cols)) {
                return com.cyc.cycjava.cycl.genls.all_specs(cols.first(), mt, tv);
            } else {
                return sbhl_search_methods.sbhl_union_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), cols, mt, tv);
            }
        }
    }

    /**
     * Returns all specs of each collection in COLs
     */
    @LispMethod(comment = "Returns all specs of each collection in COLs")
    public static SubLObject union_all_specs(final SubLObject cols, SubLObject mt, SubLObject tv) {
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
            return all_specs(cols.first(), mt, tv);
        }
        return sbhl_search_methods.sbhl_union_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), cols, mt, tv);
    }/**
     * Returns all specs of each collection in COLs
     */


    /**
     * Returns the count of all specs of each collection in COLs
     */
    @LispMethod(comment = "Returns the count of all specs of each collection in COLs")
    public static final SubLObject union_all_specs_count_alt(SubLObject cols, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return length(com.cyc.cycjava.cycl.genls.union_all_specs(cols, mt, tv));
    }

    /**
     * Returns the count of all specs of each collection in COLs
     */
    @LispMethod(comment = "Returns the count of all specs of each collection in COLs")
    public static SubLObject union_all_specs_count(final SubLObject cols, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return length(union_all_specs(cols, mt, tv));
    }/**
     * Returns the count of all specs of each collection in COLs
     */


    /**
     *
     *
     * @return listp;  max-cols-beneath takes a set of collections, COLS and
    another collection GENL, and returns the most general set of collections
    from COLS which are specs of GENL.
     */
    @LispMethod(comment = "@return listp;  max-cols-beneath takes a set of collections, COLS and\r\nanother collection GENL, and returns the most general set of collections\r\nfrom COLS which are specs of GENL.")
    public static final SubLObject max_cols_beneath_alt(SubLObject cols, SubLObject genl, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.genls.max_cols(com.cyc.cycjava.cycl.genls.all_specs_among(genl, cols, mt, UNPROVIDED), mt, UNPROVIDED);
    }

    /**
     *
     *
     * @return listp;  max-cols-beneath takes a set of collections, COLS and
    another collection GENL, and returns the most general set of collections
    from COLS which are specs of GENL.
     */
    @LispMethod(comment = "@return listp;  max-cols-beneath takes a set of collections, COLS and\r\nanother collection GENL, and returns the most general set of collections\r\nfrom COLS which are specs of GENL.")
    public static SubLObject max_cols_beneath(final SubLObject cols, final SubLObject genl, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return max_cols(all_specs_among(genl, cols, mt, UNPROVIDED), mt, UNPROVIDED);
    }

    /**
     * Returns all specs s of COL s.t. every path connecting
     * s to any genl of COL must pass through COL
     */
    @LispMethod(comment = "Returns all specs s of COL s.t. every path connecting\r\ns to any genl of COL must pass through COL\nReturns all specs s of COL s.t. every path connecting\ns to any genl of COL must pass through COL")
    public static final SubLObject all_dependent_specs_alt(SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(col, EL_FORT_P);
        return sbhl_search_methods.sbhl_all_dependent_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, mt, tv);
    }

    /**
     * Returns all specs s of COL s.t. every path connecting
     * s to any genl of COL must pass through COL
     */
    @LispMethod(comment = "Returns all specs s of COL s.t. every path connecting\r\ns to any genl of COL must pass through COL\nReturns all specs s of COL s.t. every path connecting\ns to any genl of COL must pass through COL")
    public static SubLObject all_dependent_specs(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(col, EL_FORT_P);
        return sbhl_search_methods.sbhl_all_dependent_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, mt, tv);
    }/**
     * Returns all specs s of COL s.t. every path connecting
     * s to any genl of COL must pass through COL
     */


    public static final SubLObject min_genls_among_alt(SubLObject col, SubLObject candidates, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return com.cyc.cycjava.cycl.genls.min_cols(com.cyc.cycjava.cycl.genls.all_genls_among(col, candidates, mt, tv), mt, tv);
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

    /**
     * Returns those genls of COL that are included among CANDIDATES
     */
    @LispMethod(comment = "Returns those genls of COL that are included among CANDIDATES")
    public static final SubLObject all_genls_among_alt(SubLObject col, SubLObject candidates, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(col, EL_FORT_P);
        SubLTrampolineFile.checkType(candidates, LISTP);
        if (NIL == candidates) {
            return NIL;
        } else {
            if (NIL != list_utilities.singletonP(candidates)) {
                if (NIL != com.cyc.cycjava.cycl.genls.genlP(col, candidates.first(), mt, tv)) {
                    return candidates;
                } else {
                    return NIL;
                }
            } else {
                return sbhl_search_methods.sbhl_all_forward_true_nodes_among(sbhl_module_vars.get_sbhl_module($$genls), col, candidates, mt, tv);
            }
        }
    }

    /**
     * Returns those genls of COL that are included among CANDIDATES
     */
    @LispMethod(comment = "Returns those genls of COL that are included among CANDIDATES")
    public static SubLObject all_genls_among(final SubLObject col, final SubLObject candidates, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(col, EL_FORT_P);
        SubLTrampolineFile.enforceType(candidates, LISTP);
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
    }/**
     * Returns those genls of COL that are included among CANDIDATES
     */


    /**
     * Returns those specs of COL that are included among CANDIDATEs
     */
    @LispMethod(comment = "Returns those specs of COL that are included among CANDIDATEs")
    public static final SubLObject all_specs_among_alt(SubLObject col, SubLObject candidates, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(col, EL_FORT_P);
        SubLTrampolineFile.checkType(candidates, LISTP);
        if (NIL == candidates) {
            return NIL;
        } else {
            if (NIL != list_utilities.singletonP(candidates)) {
                if (NIL != com.cyc.cycjava.cycl.genls.specP(col, candidates.first(), mt, tv)) {
                    return candidates;
                } else {
                    return NIL;
                }
            } else {
                return sbhl_search_methods.sbhl_all_backward_true_nodes_among(sbhl_module_vars.get_sbhl_module($$genls), col, candidates, mt, tv);
            }
        }
    }

    /**
     * Returns those specs of COL that are included among CANDIDATEs
     */
    @LispMethod(comment = "Returns those specs of COL that are included among CANDIDATEs")
    public static SubLObject all_specs_among(final SubLObject col, final SubLObject candidates, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(col, EL_FORT_P);
        SubLTrampolineFile.enforceType(candidates, LISTP);
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
    }/**
     * Returns those specs of COL that are included among CANDIDATEs
     */


    public static SubLObject max_specs_among(final SubLObject col, final SubLObject candidates, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return max_cols(all_specs_among(col, candidates, mt, tv), mt, tv);
    }

    /**
     * Returns all genls of collection COL that satisfy FUNCTION
     * (FUNCTION must not effect sbhl search state)
     */
    @LispMethod(comment = "Returns all genls of collection COL that satisfy FUNCTION\r\n(FUNCTION must not effect sbhl search state)\nReturns all genls of collection COL that satisfy FUNCTION\n(FUNCTION must not effect sbhl search state)")
    public static final SubLObject all_genls_if_alt(SubLObject function, SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(function, FUNCTION_SPEC_P);
        SubLTrampolineFile.checkType(col, EL_FORT_P);
        return sbhl_search_methods.sbhl_all_forward_true_nodes_if(sbhl_module_vars.get_sbhl_module($$genls), col, function, mt, tv);
    }

    /**
     * Returns all genls of collection COL that satisfy FUNCTION
     * (FUNCTION must not effect sbhl search state)
     */
    @LispMethod(comment = "Returns all genls of collection COL that satisfy FUNCTION\r\n(FUNCTION must not effect sbhl search state)\nReturns all genls of collection COL that satisfy FUNCTION\n(FUNCTION must not effect sbhl search state)")
    public static SubLObject all_genls_if(final SubLObject function, final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(function, FUNCTION_SPEC_P);
        SubLTrampolineFile.enforceType(col, EL_FORT_P);
        return sbhl_search_methods.sbhl_all_forward_true_nodes_if(sbhl_module_vars.get_sbhl_module($$genls), col, function, mt, tv);
    }/**
     * Returns all genls of collection COL that satisfy FUNCTION
     * (FUNCTION must not effect sbhl search state)
     */


    /**
     * Returns all genls of collection COL that satisfy FUNCTION
     * (FUNCTION must not effect sbhl search state)
     */
    @LispMethod(comment = "Returns all genls of collection COL that satisfy FUNCTION\r\n(FUNCTION must not effect sbhl search state)\nReturns all genls of collection COL that satisfy FUNCTION\n(FUNCTION must not effect sbhl search state)")
    public static final SubLObject all_specs_if_alt(SubLObject function, SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(function, FUNCTION_SPEC_P);
        SubLTrampolineFile.checkType(col, EL_FORT_P);
        return sbhl_search_methods.sbhl_all_backward_true_nodes_if(sbhl_module_vars.get_sbhl_module($$genls), col, function, mt, tv);
    }

    /**
     * Returns all genls of collection COL that satisfy FUNCTION
     * (FUNCTION must not effect sbhl search state)
     */
    @LispMethod(comment = "Returns all genls of collection COL that satisfy FUNCTION\r\n(FUNCTION must not effect sbhl search state)\nReturns all genls of collection COL that satisfy FUNCTION\n(FUNCTION must not effect sbhl search state)")
    public static SubLObject all_specs_if(final SubLObject function, final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(function, FUNCTION_SPEC_P);
        SubLTrampolineFile.enforceType(col, EL_FORT_P);
        return sbhl_search_methods.sbhl_all_backward_true_nodes_if(sbhl_module_vars.get_sbhl_module($$genls), col, function, mt, tv);
    }/**
     * Returns all genls of collection COL that satisfy FUNCTION
     * (FUNCTION must not effect sbhl search state)
     */


    /**
     *
     *
     * @return listp;  Returns all genls of COL that satisfy FUNCTION.  does not
    continue with genls of a collection where FUNCTION is not satisfied for that
    collection.
     */
    @LispMethod(comment = "@return listp;  Returns all genls of COL that satisfy FUNCTION.  does not\r\ncontinue with genls of a collection where FUNCTION is not satisfied for that\r\ncollection.")
    public static final SubLObject all_genls_if_with_pruning_alt(SubLObject function, SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_all_forward_true_nodes_if_with_pruning(sbhl_module_vars.get_sbhl_module($$genls), col, function, mt, tv);
    }

    /**
     *
     *
     * @return listp;  Returns all genls of COL that satisfy FUNCTION.  does not
    continue with genls of a collection where FUNCTION is not satisfied for that
    collection.
     */
    @LispMethod(comment = "@return listp;  Returns all genls of COL that satisfy FUNCTION.  does not\r\ncontinue with genls of a collection where FUNCTION is not satisfied for that\r\ncollection.")
    public static SubLObject all_genls_if_with_pruning(final SubLObject function, final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_all_forward_true_nodes_if_with_pruning(sbhl_module_vars.get_sbhl_module($$genls), col, function, mt, tv);
    }

    /**
     * Returns all negated genls of collection COL
     * (descending transitive closure; expensive)
     */
    @LispMethod(comment = "Returns all negated genls of collection COL\r\n(descending transitive closure; expensive)\nReturns all negated genls of collection COL\n(descending transitive closure; expensive)")
    public static final SubLObject all_not_genls_alt(SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(col, EL_FORT_P);
        return sbhl_search_implied_relations.sbhl_all_implied_forward_false_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, mt, tv);
    }

    /**
     * Returns all negated genls of collection COL
     * (descending transitive closure; expensive)
     */
    @LispMethod(comment = "Returns all negated genls of collection COL\r\n(descending transitive closure; expensive)\nReturns all negated genls of collection COL\n(descending transitive closure; expensive)")
    public static SubLObject all_not_genls(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(col, EL_FORT_P);
        return sbhl_search_implied_relations.sbhl_all_implied_forward_false_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, mt, tv);
    }/**
     * Returns all negated genls of collection COL
     * (descending transitive closure; expensive)
     */


    /**
     * Returns all negated specs of collection COL
     * (ascending transitive closure; inexpensive)
     */
    @LispMethod(comment = "Returns all negated specs of collection COL\r\n(ascending transitive closure; inexpensive)\nReturns all negated specs of collection COL\n(ascending transitive closure; inexpensive)")
    public static final SubLObject all_not_specs_alt(SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(col, EL_FORT_P);
        return sbhl_search_implied_relations.sbhl_all_implied_backward_false_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, mt, tv);
    }

    /**
     * Returns all negated specs of collection COL
     * (ascending transitive closure; inexpensive)
     */
    @LispMethod(comment = "Returns all negated specs of collection COL\r\n(ascending transitive closure; inexpensive)\nReturns all negated specs of collection COL\n(ascending transitive closure; inexpensive)")
    public static SubLObject all_not_specs(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(col, EL_FORT_P);
        return sbhl_search_implied_relations.sbhl_all_implied_backward_false_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, mt, tv);
    }/**
     * Returns all negated specs of collection COL
     * (ascending transitive closure; inexpensive)
     */


    /**
     * returns each collection in GENLS that is not a genl
     * of any collection in SPECS
     */
    @LispMethod(comment = "returns each collection in GENLS that is not a genl\r\nof any collection in SPECS\nreturns each collection in GENLS that is not a genl\nof any collection in SPECS")
    public static final SubLObject cols_awning_alt(SubLObject specs, SubLObject v_genls, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_forward_true_goals_with_no_path_from_nodes(sbhl_module_vars.get_sbhl_module($$genls), specs, v_genls, mt, tv);
    }

    /**
     * returns each collection in GENLS that is not a genl
     * of any collection in SPECS
     */
    @LispMethod(comment = "returns each collection in GENLS that is not a genl\r\nof any collection in SPECS\nreturns each collection in GENLS that is not a genl\nof any collection in SPECS")
    public static SubLObject cols_awning(final SubLObject specs, final SubLObject v_genls, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_forward_true_goals_with_no_path_from_nodes(sbhl_module_vars.get_sbhl_module($$genls), specs, v_genls, mt, tv);
    }/**
     * returns each collection in GENLS that is not a genl
     * of any collection in SPECS
     */


    /**
     * Applies FN to every (all) genls of COL
     * (FN must not effect the current sbhl space)
     */
    @LispMethod(comment = "Applies FN to every (all) genls of COL\r\n(FN must not effect the current sbhl space)\nApplies FN to every (all) genls of COL\n(FN must not effect the current sbhl space)")
    public static final SubLObject map_all_genls_alt(SubLObject fn, SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(fn, FUNCTION_SPEC_P);
        SubLTrampolineFile.checkType(col, EL_FORT_P);
        sbhl_search_methods.sbhl_map_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, fn, mt, tv);
        return NIL;
    }

    /**
     * Applies FN to every (all) genls of COL
     * (FN must not effect the current sbhl space)
     */
    @LispMethod(comment = "Applies FN to every (all) genls of COL\r\n(FN must not effect the current sbhl space)\nApplies FN to every (all) genls of COL\n(FN must not effect the current sbhl space)")
    public static SubLObject map_all_genls(final SubLObject fn, final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(fn, FUNCTION_SPEC_P);
        SubLTrampolineFile.enforceType(col, EL_FORT_P);
        sbhl_search_methods.sbhl_map_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, fn, mt, tv);
        return NIL;
    }/**
     * Applies FN to every (all) genls of COL
     * (FN must not effect the current sbhl space)
     */


    /**
     * Applies FN to every (all) specs of COL
     * (FN must not effect the current sbhl space)
     */
    @LispMethod(comment = "Applies FN to every (all) specs of COL\r\n(FN must not effect the current sbhl space)\nApplies FN to every (all) specs of COL\n(FN must not effect the current sbhl space)")
    public static final SubLObject map_all_specs_alt(SubLObject fn, SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(fn, FUNCTION_SPEC_P);
        SubLTrampolineFile.checkType(col, EL_FORT_P);
        sbhl_search_methods.sbhl_map_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, fn, mt, tv);
        return NIL;
    }

    /**
     * Applies FN to every (all) specs of COL
     * (FN must not effect the current sbhl space)
     */
    @LispMethod(comment = "Applies FN to every (all) specs of COL\r\n(FN must not effect the current sbhl space)\nApplies FN to every (all) specs of COL\n(FN must not effect the current sbhl space)")
    public static SubLObject map_all_specs(final SubLObject fn, final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(fn, FUNCTION_SPEC_P);
        SubLTrampolineFile.enforceType(col, EL_FORT_P);
        sbhl_search_methods.sbhl_map_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, fn, mt, tv);
        return NIL;
    }/**
     * Applies FN to every (all) specs of COL
     * (FN must not effect the current sbhl space)
     */


    /**
     * Applies FN to every (all) genls of each of COLS
     * (FN must not effect the current sbhl space)
     */
    @LispMethod(comment = "Applies FN to every (all) genls of each of COLS\r\n(FN must not effect the current sbhl space)\nApplies FN to every (all) genls of each of COLS\n(FN must not effect the current sbhl space)")
    public static final SubLObject map_union_all_genls_alt(SubLObject fn, SubLObject cols, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        sbhl_search_methods.sbhl_map_union_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), cols, fn, mt, tv);
        return NIL;
    }

    /**
     * Applies FN to every (all) genls of each of COLS
     * (FN must not effect the current sbhl space)
     */
    @LispMethod(comment = "Applies FN to every (all) genls of each of COLS\r\n(FN must not effect the current sbhl space)\nApplies FN to every (all) genls of each of COLS\n(FN must not effect the current sbhl space)")
    public static SubLObject map_union_all_genls(final SubLObject fn, final SubLObject cols, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        sbhl_search_methods.sbhl_map_union_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), cols, fn, mt, tv);
        return NIL;
    }/**
     * Applies FN to every (all) genls of each of COLS
     * (FN must not effect the current sbhl space)
     */


    /**
     * Applies FN to every (all) genls of COL that passes TEST-FN.
     */
    @LispMethod(comment = "Applies FN to every (all) genls of COL that passes TEST-FN.")
    public static final SubLObject map_all_genls_if_alt(SubLObject fn, SubLObject test_fn, SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        sbhl_search_methods.sbhl_map_all_forward_true_nodes_if(sbhl_module_vars.get_sbhl_module($$genls), col, fn, test_fn, mt, tv);
        return NIL;
    }

    /**
     * Applies FN to every (all) genls of COL that passes TEST-FN.
     */
    @LispMethod(comment = "Applies FN to every (all) genls of COL that passes TEST-FN.")
    public static SubLObject map_all_genls_if(final SubLObject fn, final SubLObject test_fn, final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        sbhl_search_methods.sbhl_map_all_forward_true_nodes_if(sbhl_module_vars.get_sbhl_module($$genls), col, fn, test_fn, mt, tv);
        return NIL;
    }/**
     * Applies FN to every (all) genls of COL that passes TEST-FN.
     */


    /**
     * gather results of applying FN to every (all) genls of COL
     * (FN must not effect the current sbhl space)
     */
    @LispMethod(comment = "gather results of applying FN to every (all) genls of COL\r\n(FN must not effect the current sbhl space)\ngather results of applying FN to every (all) genls of COL\n(FN must not effect the current sbhl space)")
    public static final SubLObject gather_all_genls_alt(SubLObject fn, SubLObject col, SubLObject mt, SubLObject tv, SubLObject combine_fn) {
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

    /**
     * gather results of applying FN to every (all) genls of COL
     * (FN must not effect the current sbhl space)
     */
    @LispMethod(comment = "gather results of applying FN to every (all) genls of COL\r\n(FN must not effect the current sbhl space)\ngather results of applying FN to every (all) genls of COL\n(FN must not effect the current sbhl space)")
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
    }/**
     * gather results of applying FN to every (all) genls of COL
     * (FN must not effect the current sbhl space)
     */


    /**
     * gather results of applying FN to every (all) specs of COL
     * (FN must not effect the current sbhl space)
     */
    @LispMethod(comment = "gather results of applying FN to every (all) specs of COL\r\n(FN must not effect the current sbhl space)\ngather results of applying FN to every (all) specs of COL\n(FN must not effect the current sbhl space)")
    public static final SubLObject gather_all_specs_alt(SubLObject fn, SubLObject col, SubLObject mt, SubLObject tv, SubLObject combine_fn) {
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

    /**
     * gather results of applying FN to every (all) specs of COL
     * (FN must not effect the current sbhl space)
     */
    @LispMethod(comment = "gather results of applying FN to every (all) specs of COL\r\n(FN must not effect the current sbhl space)\ngather results of applying FN to every (all) specs of COL\n(FN must not effect the current sbhl space)")
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
    }/**
     * gather results of applying FN to every (all) specs of COL
     * (FN must not effect the current sbhl space)
     */


    /**
     * Return a non-nil result of applying FN to some all-genl of COL
     * (FN must not effect the current sbhl space)
     */
    @LispMethod(comment = "Return a non-nil result of applying FN to some all-genl of COL\r\n(FN must not effect the current sbhl space)\nReturn a non-nil result of applying FN to some all-genl of COL\n(FN must not effect the current sbhl space)")
    public static final SubLObject any_all_genls_alt(SubLObject fn, SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(fn, FUNCTION_SPEC_P);
        SubLTrampolineFile.checkType(col, EL_FORT_P);
        return sbhl_search_methods.sbhl_gather_first_among_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, fn, mt, tv, UNPROVIDED);
    }

    /**
     * Return a non-nil result of applying FN to some all-genl of COL
     * (FN must not effect the current sbhl space)
     */
    @LispMethod(comment = "Return a non-nil result of applying FN to some all-genl of COL\r\n(FN must not effect the current sbhl space)\nReturn a non-nil result of applying FN to some all-genl of COL\n(FN must not effect the current sbhl space)")
    public static SubLObject any_all_genls(final SubLObject fn, final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(fn, FUNCTION_SPEC_P);
        SubLTrampolineFile.enforceType(col, EL_FORT_P);
        return sbhl_search_methods.sbhl_gather_first_among_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, fn, mt, tv, UNPROVIDED);
    }/**
     * Return a non-nil result of applying FN to some all-genl of COL
     * (FN must not effect the current sbhl space)
     */


    /**
     * Return a non-nil result of applying FN to some all-spec of COL
     * (FN must not effect the current sbhl space)
     */
    @LispMethod(comment = "Return a non-nil result of applying FN to some all-spec of COL\r\n(FN must not effect the current sbhl space)\nReturn a non-nil result of applying FN to some all-spec of COL\n(FN must not effect the current sbhl space)")
    public static final SubLObject any_all_specs_alt(SubLObject fn, SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(fn, FUNCTION_SPEC_P);
        SubLTrampolineFile.checkType(col, EL_FORT_P);
        return sbhl_search_methods.sbhl_gather_first_among_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, fn, mt, tv, UNPROVIDED);
    }

    /**
     * Return a non-nil result of applying FN to some all-spec of COL
     * (FN must not effect the current sbhl space)
     */
    @LispMethod(comment = "Return a non-nil result of applying FN to some all-spec of COL\r\n(FN must not effect the current sbhl space)\nReturn a non-nil result of applying FN to some all-spec of COL\n(FN must not effect the current sbhl space)")
    public static SubLObject any_all_specs(final SubLObject fn, final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(fn, FUNCTION_SPEC_P);
        SubLTrampolineFile.enforceType(col, EL_FORT_P);
        return sbhl_search_methods.sbhl_gather_first_among_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, fn, mt, tv, UNPROVIDED);
    }/**
     * Return a non-nil result of applying FN to some all-spec of COL
     * (FN must not effect the current sbhl space)
     */


    /**
     * Return a sample of SAMPLES leaf collections under COL. Attempts to find
     * leaves that are as different as possible (wrt to their all-genls).
     */
    @LispMethod(comment = "Return a sample of SAMPLES leaf collections under COL. Attempts to find\r\nleaves that are as different as possible (wrt to their all-genls).\nReturn a sample of SAMPLES leaf collections under COL. Attempts to find\nleaves that are as different as possible (wrt to their all-genls).")
    public static final SubLObject sample_leaf_specs_alt(SubLObject col, SubLObject samples, SubLObject mt, SubLObject tv) {
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

    /**
     * Return a sample of SAMPLES leaf collections under COL. Attempts to find
     * leaves that are as different as possible (wrt to their all-genls).
     */
    @LispMethod(comment = "Return a sample of SAMPLES leaf collections under COL. Attempts to find\r\nleaves that are as different as possible (wrt to their all-genls).\nReturn a sample of SAMPLES leaf collections under COL. Attempts to find\nleaves that are as different as possible (wrt to their all-genls).")
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
    }/**
     * Return a sample of SAMPLES leaf collections under COL. Attempts to find
     * leaves that are as different as possible (wrt to their all-genls).
     */


    /**
     * Return a sample of SAMPLES leaf collections under COL, such that none of them
     * genl to anything between DIF-NODE and COL besides COL. Attempts to find
     * leaves that are as different as possible (wrt to their all-genls).
     */
    @LispMethod(comment = "Return a sample of SAMPLES leaf collections under COL, such that none of them\r\ngenl to anything between DIF-NODE and COL besides COL. Attempts to find\r\nleaves that are as different as possible (wrt to their all-genls).\nReturn a sample of SAMPLES leaf collections under COL, such that none of them\ngenl to anything between DIF-NODE and COL besides COL. Attempts to find\nleaves that are as different as possible (wrt to their all-genls).")
    public static final SubLObject sample_different_leaf_specs_alt(SubLObject dif_node, SubLObject col, SubLObject samples, SubLObject mt, SubLObject tv) {
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

    /**
     * Return a sample of SAMPLES leaf collections under COL, such that none of them
     * genl to anything between DIF-NODE and COL besides COL. Attempts to find
     * leaves that are as different as possible (wrt to their all-genls).
     */
    @LispMethod(comment = "Return a sample of SAMPLES leaf collections under COL, such that none of them\r\ngenl to anything between DIF-NODE and COL besides COL. Attempts to find\r\nleaves that are as different as possible (wrt to their all-genls).\nReturn a sample of SAMPLES leaf collections under COL, such that none of them\ngenl to anything between DIF-NODE and COL besides COL. Attempts to find\nleaves that are as different as possible (wrt to their all-genls).")
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
    }/**
     * Return a sample of SAMPLES leaf collections under COL, such that none of them
     * genl to anything between DIF-NODE and COL besides COL. Attempts to find
     * leaves that are as different as possible (wrt to their all-genls).
     */


    /**
     * Returns whether (#$genls SPEC GENL) can be inferred.
     * (ascending transitive search; inexpensive)
     */
    @LispMethod(comment = "Returns whether (#$genls SPEC GENL) can be inferred.\r\n(ascending transitive search; inexpensive)\nReturns whether (#$genls SPEC GENL) can be inferred.\n(ascending transitive search; inexpensive)")
    public static final SubLObject genlP_alt(SubLObject spec, SubLObject genl, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(spec, EL_FORT_P);
        SubLTrampolineFile.checkType(genl, EL_FORT_P);
        if ((NIL == forts.fort_p(spec)) || (NIL != fort_types_interface.collectionP(spec))) {
            return makeBoolean((NIL != sbhl_search_methods.sbhl_non_justifying_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genls), spec, genl, mt, tv)) || (NIL != (NIL != cycl_grammar.cycl_nat_p(spec) ? ((SubLObject) (com.cyc.cycjava.cycl.genls.result_genl_via_pgiaP(spec, genl, mt))) : NIL)));
        }
        return NIL;
    }

    /**
     * Returns whether (#$genls SPEC GENL) can be inferred.
     * (ascending transitive search; inexpensive)
     */
    @LispMethod(comment = "Returns whether (#$genls SPEC GENL) can be inferred.\r\n(ascending transitive search; inexpensive)\nReturns whether (#$genls SPEC GENL) can be inferred.\n(ascending transitive search; inexpensive)")
    public static SubLObject genlP(final SubLObject spec, final SubLObject genl, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(spec, EL_FORT_P);
        SubLTrampolineFile.enforceType(genl, EL_FORT_P);
        if ((NIL == forts.fort_p(spec)) || (NIL != fort_types_interface.collectionP(spec))) {
            return makeBoolean((NIL != sbhl_search_methods.sbhl_non_justifying_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genls), spec, genl, mt, tv)) || (NIL != (NIL != cycl_grammar.cycl_nat_p(spec) ? result_genl_via_pgiaP(spec, genl, mt) : NIL)));
        }
        return NIL;
    }/**
     * Returns whether (#$genls SPEC GENL) can be inferred.
     * (ascending transitive search; inexpensive)
     */


    /**
     * is collection GENL a genl of SPEC?
     * (ascending transitive search; inexpensive)
     */
    @LispMethod(comment = "is collection GENL a genl of SPEC?\r\n(ascending transitive search; inexpensive)\nis collection GENL a genl of SPEC?\n(ascending transitive search; inexpensive)")
    public static final SubLObject genlsP_alt(SubLObject spec, SubLObject genl, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return com.cyc.cycjava.cycl.genls.genlP(spec, genl, mt, tv);
    }

    /**
     * is collection GENL a genl of SPEC?
     * (ascending transitive search; inexpensive)
     */
    @LispMethod(comment = "is collection GENL a genl of SPEC?\r\n(ascending transitive search; inexpensive)\nis collection GENL a genl of SPEC?\n(ascending transitive search; inexpensive)")
    public static SubLObject genlsP(final SubLObject spec, final SubLObject genl, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return genlP(spec, genl, mt, tv);
    }/**
     * is collection GENL a genl of SPEC?
     * (ascending transitive search; inexpensive)
     */


    /**
     * is collection GENL a genl of SPEC in any mt in <mts>?
     * (ascending transitive search; inexpensive)
     */
    @LispMethod(comment = "is collection GENL a genl of SPEC in any mt in <mts>?\r\n(ascending transitive search; inexpensive)\nis collection GENL a genl of SPEC in any mt in <mts>?\n(ascending transitive search; inexpensive)")
    public static final SubLObject genl_in_mtsP_alt(SubLObject spec, SubLObject genl, SubLObject mts) {
        if (mts == UNPROVIDED) {
            mts = genl_mts.all_base_mts(mt_relevance_macros.$mt$.getDynamicValue());
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject genlP = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
                        mt_relevance_macros.$relevant_mts$.bind(mts, thread);
                        genlP = com.cyc.cycjava.cycl.genls.genlP(spec, genl, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return genlP;
            }
        }
    }

    /**
     * is collection GENL a genl of SPEC in any mt in <mts>?
     * (ascending transitive search; inexpensive)
     */
    @LispMethod(comment = "is collection GENL a genl of SPEC in any mt in <mts>?\r\n(ascending transitive search; inexpensive)\nis collection GENL a genl of SPEC in any mt in <mts>?\n(ascending transitive search; inexpensive)")
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
    }/**
     * is collection GENL a genl of SPEC in any mt in <mts>?
     * (ascending transitive search; inexpensive)
     */


    /**
     * is collection GENL a genl of collection SPEC in any mt?
     */
    @LispMethod(comment = "is collection GENL a genl of collection SPEC in any mt?")
    public static final SubLObject genl_in_any_mtP_alt(SubLObject spec, SubLObject genl) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        result = com.cyc.cycjava.cycl.genls.genlP(spec, genl, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * is collection GENL a genl of collection SPEC in any mt?
     */
    @LispMethod(comment = "is collection GENL a genl of collection SPEC in any mt?")
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
    }/**
     * is collection GENL a genl of collection SPEC in any mt?
     */


    /**
     * Returns whether (#$genls SPEC GENL) can be inferred.
     * (ascending transitive search; inexpensive)
     */
    @LispMethod(comment = "Returns whether (#$genls SPEC GENL) can be inferred.\r\n(ascending transitive search; inexpensive)\nReturns whether (#$genls SPEC GENL) can be inferred.\n(ascending transitive search; inexpensive)")
    public static final SubLObject specP_alt(SubLObject genl, SubLObject spec, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(genl, EL_FORT_P);
        SubLTrampolineFile.checkType(spec, EL_FORT_P);
        return com.cyc.cycjava.cycl.genls.genlP(spec, genl, mt, tv);
    }

    /**
     * Returns whether (#$genls SPEC GENL) can be inferred.
     * (ascending transitive search; inexpensive)
     */
    @LispMethod(comment = "Returns whether (#$genls SPEC GENL) can be inferred.\r\n(ascending transitive search; inexpensive)\nReturns whether (#$genls SPEC GENL) can be inferred.\n(ascending transitive search; inexpensive)")
    public static SubLObject specP(final SubLObject genl, final SubLObject spec, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(genl, EL_FORT_P);
        SubLTrampolineFile.enforceType(spec, EL_FORT_P);
        return genlP(spec, genl, mt, tv);
    }/**
     * Returns whether (#$genls SPEC GENL) can be inferred.
     * (ascending transitive search; inexpensive)
     */


    /**
     * is collection GENL a genl of collection-denoting <nat-formula>?
     * (ascending transitive search; inexpensive)
     */
    @LispMethod(comment = "is collection GENL a genl of collection-denoting <nat-formula>?\r\n(ascending transitive search; inexpensive)\nis collection GENL a genl of collection-denoting <nat-formula>?\n(ascending transitive search; inexpensive)")
    public static final SubLObject nat_genlP_alt(SubLObject nat_formula, SubLObject genl, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject nat = cycl_utilities.find_ground_naut(nat_formula);
            if (NIL != nart_handles.nart_p(nat)) {
                return com.cyc.cycjava.cycl.genls.genlP(nat, genl, mt, UNPROVIDED);
            } else {
                return com.cyc.cycjava.cycl.genls.naut_genlP(nat_formula, genl, mt);
            }
        }
    }

    /**
     * is collection GENL a genl of collection-denoting <nat-formula>?
     * (ascending transitive search; inexpensive)
     */
    @LispMethod(comment = "is collection GENL a genl of collection-denoting <nat-formula>?\r\n(ascending transitive search; inexpensive)\nis collection GENL a genl of collection-denoting <nat-formula>?\n(ascending transitive search; inexpensive)")
    public static SubLObject nat_genlP(final SubLObject nat_formula, final SubLObject genl, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject nat = cycl_utilities.find_ground_naut(nat_formula);
        if (NIL != nart_handles.nart_p(nat)) {
            return genlP(nat, genl, mt, UNPROVIDED);
        }
        return naut_genlP(nat_formula, genl, mt);
    }/**
     * is collection GENL a genl of collection-denoting <nat-formula>?
     * (ascending transitive search; inexpensive)
     */


    /**
     * is GENL a genl of collection denoting NAT-FORMULA
     */
    @LispMethod(comment = "is GENL a genl of collection denoting NAT-FORMULA")
    public static final SubLObject naut_genlP_alt(SubLObject nat_formula, SubLObject genl, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((((NIL != com.cyc.cycjava.cycl.genls.result_genl_colP(cycl_utilities.nat_functor(nat_formula), genl, mt)) || (NIL != com.cyc.cycjava.cycl.genls.result_genl_arg_colP(nat_formula, genl, mt))) || (NIL != com.cyc.cycjava.cycl.genls.result_genl_inter_arg_colP(nat_formula, genl, mt))) || (NIL != com.cyc.cycjava.cycl.genls.result_genl_via_pgiaP(nat_formula, genl, mt)));
    }

    /**
     * is GENL a genl of collection denoting NAT-FORMULA
     */
    @LispMethod(comment = "is GENL a genl of collection denoting NAT-FORMULA")
    public static SubLObject naut_genlP(final SubLObject nat_formula, final SubLObject genl, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((((NIL != result_genl_colP(cycl_utilities.nat_functor(nat_formula), genl, mt)) || (NIL != result_genl_arg_colP(nat_formula, genl, mt))) || (NIL != result_genl_inter_arg_colP(nat_formula, genl, mt))) || (NIL != result_genl_via_pgiaP(nat_formula, genl, mt)));
    }/**
     * is GENL a genl of collection denoting NAT-FORMULA
     */


    /**
     * does FUNCTOR return specs of COLLECTION?
     */
    @LispMethod(comment = "does FUNCTOR return specs of COLLECTION?")
    public static final SubLObject result_genl_colP_alt(SubLObject functor, SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.genls.any_specP(collection, kb_accessors.result_genl(functor, mt, UNPROVIDED), mt, UNPROVIDED);
    }

    /**
     * does FUNCTOR return specs of COLLECTION?
     */
    @LispMethod(comment = "does FUNCTOR return specs of COLLECTION?")
    public static SubLObject result_genl_colP(final SubLObject functor, final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return any_specP(collection, kb_accessors.result_genl(functor, mt, UNPROVIDED), mt, UNPROVIDED);
    }/**
     * does FUNCTOR return specs of COLLECTION?
     */


    /**
     * does NAT-FORMULA return specs of COLLECTION?
     */
    @LispMethod(comment = "does NAT-FORMULA return specs of COLLECTION?")
    public static final SubLObject result_genl_arg_colP_alt(SubLObject nat_formula, SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.genls.any_specP(collection, kb_accessors.result_genl_args(nat_formula, mt), mt, UNPROVIDED);
    }

    /**
     * does NAT-FORMULA return specs of COLLECTION?
     */
    @LispMethod(comment = "does NAT-FORMULA return specs of COLLECTION?")
    public static SubLObject result_genl_arg_colP(final SubLObject nat_formula, final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return any_specP(collection, kb_accessors.result_genl_args(nat_formula, mt), mt, UNPROVIDED);
    }/**
     * does NAT-FORMULA return specs of COLLECTION?
     */


    /**
     * does NAT-FORMULA return specs of COLLECTION?
     */
    @LispMethod(comment = "does NAT-FORMULA return specs of COLLECTION?")
    public static final SubLObject result_genl_inter_arg_colP_alt(SubLObject nat_formula, SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.genls.any_specP(collection, kb_accessors.result_inter_arg_genl(nat_formula, mt), mt, UNPROVIDED);
    }

    /**
     * does NAT-FORMULA return specs of COLLECTION?
     */
    @LispMethod(comment = "does NAT-FORMULA return specs of COLLECTION?")
    public static SubLObject result_genl_inter_arg_colP(final SubLObject nat_formula, final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return any_specP(collection, kb_accessors.result_inter_arg_genl(nat_formula, mt), mt, UNPROVIDED);
    }/**
     * does NAT-FORMULA return specs of COLLECTION?
     */


    /**
     * does NAT-FORMULA return specs of COLLECTION?
     */
    @LispMethod(comment = "does NAT-FORMULA return specs of COLLECTION?")
    public static final SubLObject result_genl_via_pgiaP_alt(SubLObject nat_formula, SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != $pgia_activeP$.getDynamicValue(thread)) && cycl_utilities.nat_functor(nat_formula).eql(cycl_utilities.nat_functor(collection))) {
                {
                    SubLObject functor = cycl_utilities.nat_functor(collection);
                    SubLObject genlP = NIL;
                    if (NIL == genlP) {
                        {
                            SubLObject csome_list_var = kb_mapping_utilities.pred_values_in_relevant_mts(functor, $$preservesGenlsInArg, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject arg = NIL;
                            for (arg = csome_list_var.first(); !((NIL != genlP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , arg = csome_list_var.first()) {
                                genlP = com.cyc.cycjava.cycl.genls.genlsP(cycl_utilities.nat_arg(nat_formula, arg, UNPROVIDED), cycl_utilities.nat_arg(collection, arg, UNPROVIDED), mt, UNPROVIDED);
                            }
                        }
                    }
                    return genlP;
                }
            }
            return NIL;
        }
    }

    /**
     * does NAT-FORMULA return specs of COLLECTION?
     */
    @LispMethod(comment = "does NAT-FORMULA return specs of COLLECTION?")
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
    }/**
     * does NAT-FORMULA return specs of COLLECTION?
     */


    /**
     * forces search down along spec links (rather than up along genl links);
     * use genl? if this is not necessary (almost always use genl?)
     */
    @LispMethod(comment = "forces search down along spec links (rather than up along genl links);\r\nuse genl? if this is not necessary (almost always use genl?)\nforces search down along spec links (rather than up along genl links);\nuse genl? if this is not necessary (almost always use genl?)")
    public static final SubLObject genl_ofP_alt(SubLObject genl, SubLObject spec, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_inverse_relation_p(sbhl_module_vars.get_sbhl_module($$genls), genl, spec, mt, tv);
    }

    /**
     * forces search down along spec links (rather than up along genl links);
     * use genl? if this is not necessary (almost always use genl?)
     */
    @LispMethod(comment = "forces search down along spec links (rather than up along genl links);\r\nuse genl? if this is not necessary (almost always use genl?)\nforces search down along spec links (rather than up along genl links);\nuse genl? if this is not necessary (almost always use genl?)")
    public static SubLObject genl_ofP(final SubLObject genl, final SubLObject spec, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_inverse_relation_p(sbhl_module_vars.get_sbhl_module($$genls), genl, spec, mt, tv);
    }/**
     * forces search down along spec links (rather than up along genl links);
     * use genl? if this is not necessary (almost always use genl?)
     */


    /**
     * (any-genl? spec genls) is t iff (genl? spec genl) for some genl in genls
     * (ascending transitive search; inexpensive)
     */
    @LispMethod(comment = "(any-genl? spec genls) is t iff (genl? spec genl) for some genl in genls\r\n(ascending transitive search; inexpensive)\n(any-genl? spec genls) is t iff (genl? spec genl) for some genl in genls\n(ascending transitive search; inexpensive)")
    public static final SubLObject any_genlP_alt(SubLObject spec, SubLObject v_genls, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(spec, EL_FORT_P);
        SubLTrampolineFile.checkType(v_genls, LISTP);
        if (NIL == v_genls) {
            return NIL;
        } else {
            if (NIL != list_utilities.singletonP(v_genls)) {
                return com.cyc.cycjava.cycl.genls.genlP(spec, v_genls.first(), mt, tv);
            } else {
                return sbhl_search_methods.sbhl_predicate_relation_with_any_p(sbhl_module_vars.get_sbhl_module($$genls), spec, v_genls, mt, tv);
            }
        }
    }

    /**
     * (any-genl? spec genls) is t iff (genl? spec genl) for some genl in genls
     * (ascending transitive search; inexpensive)
     */
    @LispMethod(comment = "(any-genl? spec genls) is t iff (genl? spec genl) for some genl in genls\r\n(ascending transitive search; inexpensive)\n(any-genl? spec genls) is t iff (genl? spec genl) for some genl in genls\n(ascending transitive search; inexpensive)")
    public static SubLObject any_genlP(final SubLObject spec, final SubLObject v_genls, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(spec, EL_FORT_P);
        SubLTrampolineFile.enforceType(v_genls, LISTP);
        if (NIL == v_genls) {
            return NIL;
        }
        if (NIL != list_utilities.singletonP(v_genls)) {
            return genlP(spec, v_genls.first(), mt, tv);
        }
        return sbhl_search_methods.sbhl_predicate_relation_with_any_p(sbhl_module_vars.get_sbhl_module($$genls), spec, v_genls, mt, tv);
    }/**
     * (any-genl? spec genls) is t iff (genl? spec genl) for some genl in genls
     * (ascending transitive search; inexpensive)
     */


    /**
     * Returns T iff (spec? genl spec) for some spec in SPECS
     */
    @LispMethod(comment = "Returns T iff (spec? genl spec) for some spec in SPECS")
    public static final SubLObject any_specP_alt(SubLObject genl, SubLObject specs, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(genl, EL_FORT_P);
            SubLTrampolineFile.checkType(specs, LISTP);
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_justification_search_p$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_apply_unwind_function_p$.currentBinding(thread);
                    SubLObject _prev_bind_2 = sbhl_paranoia.$suspend_sbhl_cache_useP$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_justification_search_p$.bind(NIL, thread);
                        sbhl_search_vars.$sbhl_apply_unwind_function_p$.bind(NIL, thread);
                        sbhl_paranoia.$suspend_sbhl_cache_useP$.bind(NIL, thread);
                        if (NIL == specs) {
                            result = NIL;
                        } else {
                            if (NIL != list_utilities.singletonP(specs)) {
                                result = com.cyc.cycjava.cycl.genls.specP(genl, specs.first(), mt, tv);
                            } else {
                                result = sbhl_search_methods.sbhl_any_with_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genls), specs, genl, mt, tv);
                            }
                        }
                    } finally {
                        sbhl_paranoia.$suspend_sbhl_cache_useP$.rebind(_prev_bind_2, thread);
                        sbhl_search_vars.$sbhl_apply_unwind_function_p$.rebind(_prev_bind_1, thread);
                        sbhl_search_vars.$sbhl_justification_search_p$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Returns T iff (spec? genl spec) for some spec in SPECS
     */
    @LispMethod(comment = "Returns T iff (spec? genl spec) for some spec in SPECS")
    public static SubLObject any_specP(final SubLObject genl, final SubLObject specs, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(genl, EL_FORT_P);
        SubLTrampolineFile.enforceType(specs, LISTP);
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
    }/**
     * Returns T iff (spec? genl spec) for some spec in SPECS
     */


    /**
     * Returns T iff (genl? spec genl) for every genl in GENLS
     * (ascending transitive search; inexpensive)
     */
    @LispMethod(comment = "Returns T iff (genl? spec genl) for every genl in GENLS\r\n(ascending transitive search; inexpensive)\nReturns T iff (genl? spec genl) for every genl in GENLS\n(ascending transitive search; inexpensive)")
    public static final SubLObject all_genlP_alt(SubLObject spec, SubLObject v_genls, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(spec, EL_FORT_P);
        SubLTrampolineFile.checkType(v_genls, LISTP);
        if (NIL == v_genls) {
            return T;
        } else {
            if (NIL != list_utilities.singletonP(v_genls)) {
                return com.cyc.cycjava.cycl.genls.genlP(spec, v_genls.first(), mt, tv);
            } else {
                return sbhl_search_methods.sbhl_predicate_relation_with_all_p(sbhl_module_vars.get_sbhl_module($$genls), spec, v_genls, mt, tv);
            }
        }
    }

    /**
     * Returns T iff (genl? spec genl) for every genl in GENLS
     * (ascending transitive search; inexpensive)
     */
    @LispMethod(comment = "Returns T iff (genl? spec genl) for every genl in GENLS\r\n(ascending transitive search; inexpensive)\nReturns T iff (genl? spec genl) for every genl in GENLS\n(ascending transitive search; inexpensive)")
    public static SubLObject all_genlP(final SubLObject spec, final SubLObject v_genls, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(spec, EL_FORT_P);
        SubLTrampolineFile.enforceType(v_genls, LISTP);
        if (NIL == v_genls) {
            return T;
        }
        if (NIL != list_utilities.singletonP(v_genls)) {
            return genlP(spec, v_genls.first(), mt, tv);
        }
        return sbhl_search_methods.sbhl_predicate_relation_with_all_p(sbhl_module_vars.get_sbhl_module($$genls), spec, v_genls, mt, tv);
    }/**
     * Returns T iff (genl? spec genl) for every genl in GENLS
     * (ascending transitive search; inexpensive)
     */


    /**
     * Returns T iff (spec? genl spec) for every spec in SPECS
     */
    @LispMethod(comment = "Returns T iff (spec? genl spec) for every spec in SPECS")
    public static final SubLObject all_specP_alt(SubLObject genl, SubLObject specs, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(genl, EL_FORT_P);
        SubLTrampolineFile.checkType(specs, LISTP);
        if (NIL == specs) {
            return T;
        } else {
            if (NIL != list_utilities.singletonP(specs)) {
                return com.cyc.cycjava.cycl.genls.specP(genl, specs.first(), mt, tv);
            } else {
                return sbhl_search_methods.sbhl_all_with_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genls), specs, genl, mt, tv);
            }
        }
    }

    /**
     * Returns T iff (spec? genl spec) for every spec in SPECS
     */
    @LispMethod(comment = "Returns T iff (spec? genl spec) for every spec in SPECS")
    public static SubLObject all_specP(final SubLObject genl, final SubLObject specs, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(genl, EL_FORT_P);
        SubLTrampolineFile.enforceType(specs, LISTP);
        if (NIL == specs) {
            return T;
        }
        if (NIL != list_utilities.singletonP(specs)) {
            return specP(genl, specs.first(), mt, tv);
        }
        return sbhl_search_methods.sbhl_all_with_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genls), specs, genl, mt, tv);
    }/**
     * Returns T iff (spec? genl spec) for every spec in SPECS
     */


    /**
     * Return T iff (genl? spec genl mt) for any spec in SPECS, genl in GENLS
     */
    @LispMethod(comment = "Return T iff (genl? spec genl mt) for any spec in SPECS, genl in GENLS")
    public static final SubLObject any_genl_anyP_alt(SubLObject specs, SubLObject v_genls, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(specs, LISTP);
        SubLTrampolineFile.checkType(v_genls, LISTP);
        if (NIL == specs) {
            return NIL;
        } else {
            if (NIL == v_genls) {
                return NIL;
            } else {
                if (NIL != list_utilities.singletonP(specs)) {
                    return com.cyc.cycjava.cycl.genls.any_genlP(specs.first(), v_genls, mt, tv);
                } else {
                    return sbhl_search_methods.sbhl_predicate_relation_between_any_p(sbhl_module_vars.get_sbhl_module($$genls), specs, v_genls, mt, tv);
                }
            }
        }
    }

    /**
     * Return T iff (genl? spec genl mt) for any spec in SPECS, genl in GENLS
     */
    @LispMethod(comment = "Return T iff (genl? spec genl mt) for any spec in SPECS, genl in GENLS")
    public static SubLObject any_genl_anyP(final SubLObject specs, final SubLObject v_genls, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(specs, LISTP);
        SubLTrampolineFile.enforceType(v_genls, LISTP);
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
    }/**
     * Return T iff (genl? spec genl mt) for any spec in SPECS, genl in GENLS
     */


    /**
     * Return T iff (genl? spec genl mt) for any spec in SPECS and all genl in GENLS
     */
    @LispMethod(comment = "Return T iff (genl? spec genl mt) for any spec in SPECS and all genl in GENLS")
    public static final SubLObject any_genl_allP_alt(SubLObject specs, SubLObject v_genls, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(specs, LISTP);
        SubLTrampolineFile.checkType(v_genls, LISTP);
        return sbhl_search_methods.sbhl_any_predicate_relation_with_all_p(sbhl_module_vars.get_sbhl_module($$genls), specs, v_genls, mt, tv);
    }

    /**
     * Return T iff (genl? spec genl mt) for any spec in SPECS and all genl in GENLS
     */
    @LispMethod(comment = "Return T iff (genl? spec genl mt) for any spec in SPECS and all genl in GENLS")
    public static SubLObject any_genl_allP(final SubLObject specs, final SubLObject v_genls, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(specs, LISTP);
        SubLTrampolineFile.enforceType(v_genls, LISTP);
        return sbhl_search_methods.sbhl_any_predicate_relation_with_all_p(sbhl_module_vars.get_sbhl_module($$genls), specs, v_genls, mt, tv);
    }/**
     * Return T iff (genl? spec genl mt) for any spec in SPECS and all genl in GENLS
     */


    /**
     * Return T iff for each spec in SPECS there is some genl in GENLS s.t. (genl? spec genl mt)
     */
    @LispMethod(comment = "Return T iff for each spec in SPECS there is some genl in GENLS s.t. (genl? spec genl mt)")
    public static final SubLObject all_spec_anyP_alt(SubLObject specs, SubLObject v_genls, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(specs, LISTP);
        SubLTrampolineFile.checkType(v_genls, LISTP);
        return sbhl_search_methods.sbhl_all_with_predicate_relation_with_any_p(sbhl_module_vars.get_sbhl_module($$genls), specs, v_genls, mt, tv);
    }

    /**
     * Return T iff for each spec in SPECS there is some genl in GENLS s.t. (genl? spec genl mt)
     */
    @LispMethod(comment = "Return T iff for each spec in SPECS there is some genl in GENLS s.t. (genl? spec genl mt)")
    public static SubLObject all_spec_anyP(final SubLObject specs, final SubLObject v_genls, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(specs, LISTP);
        SubLTrampolineFile.enforceType(v_genls, LISTP);
        return sbhl_search_methods.sbhl_all_with_predicate_relation_with_any_p(sbhl_module_vars.get_sbhl_module($$genls), specs, v_genls, mt, tv);
    }/**
     * Return T iff for each spec in SPECS there is some genl in GENLS s.t. (genl? spec genl mt)
     */


    /**
     * Calls not-genl?
     */
    @LispMethod(comment = "Calls not-genl?")
    public static final SubLObject not_genlsP_alt(SubLObject col, SubLObject not_genl, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return com.cyc.cycjava.cycl.genls.not_genlP(col, not_genl, mt, tv);
    }

    /**
     * Calls not-genl?
     */
    @LispMethod(comment = "Calls not-genl?")
    public static SubLObject not_genlsP(final SubLObject col, final SubLObject not_genl, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return not_genlP(col, not_genl, mt, tv);
    }/**
     * Calls not-genl?
     */


    /**
     * Return whether collection NOT-GENL is not a genl of COL.
     */
    @LispMethod(comment = "Return whether collection NOT-GENL is not a genl of COL.")
    public static final SubLObject not_genlP_alt(SubLObject col, SubLObject not_genl, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(col, EL_FORT_P);
        SubLTrampolineFile.checkType(not_genl, EL_FORT_P);
        return sbhl_search_implied_relations.sbhl_implied_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genls), col, not_genl, mt, tv);
    }

    /**
     * Return whether collection NOT-GENL is not a genl of COL.
     */
    @LispMethod(comment = "Return whether collection NOT-GENL is not a genl of COL.")
    public static SubLObject not_genlP(final SubLObject col, final SubLObject not_genl, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(col, EL_FORT_P);
        SubLTrampolineFile.enforceType(not_genl, EL_FORT_P);
        if (NIL != genlP(col, not_genl, mt, sbhl_search_vars.sbhl_opposite_or_nil_tv(tv))) {
            return NIL;
        }
        return sbhl_search_implied_relations.sbhl_implied_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genls), col, not_genl, mt, tv);
    }/**
     * Return whether collection NOT-GENL is not a genl of COL.
     */


    /**
     * Returns whether collection NOT-GENL is not a genl of COL, or arguably should not be a not-genl of COL because (genls COL NOT-GENL).
     */
    @LispMethod(comment = "Returns whether collection NOT-GENL is not a genl of COL, or arguably should not be a not-genl of COL because (genls COL NOT-GENL).")
    public static final SubLObject argue_not_genlP_alt(SubLObject col, SubLObject not_genl, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_implied_relations.sbhl_argumentation_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genls), col, not_genl, mt, tv);
    }

    /**
     * Returns whether collection NOT-GENL is not a genl of COL, or arguably should not be a not-genl of COL because (genls COL NOT-GENL).
     */
    @LispMethod(comment = "Returns whether collection NOT-GENL is not a genl of COL, or arguably should not be a not-genl of COL because (genls COL NOT-GENL).")
    public static SubLObject argue_not_genlP(final SubLObject col, final SubLObject not_genl, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_implied_relations.sbhl_argumentation_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genls), col, not_genl, mt, tv);
    }/**
     * Returns whether collection NOT-GENL is not a genl of COL, or arguably should not be a not-genl of COL because (genls COL NOT-GENL).
     */


    /**
     * Return whether every collection in NOT-SPECS is not a spec of COL.
     */
    @LispMethod(comment = "Return whether every collection in NOT-SPECS is not a spec of COL.")
    public static final SubLObject all_not_specP_alt(SubLObject col, SubLObject not_specs, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(col, EL_FORT_P);
        SubLTrampolineFile.checkType(not_specs, LISTP);
        if (NIL == not_specs) {
            return T;
        } else {
            if (NIL != list_utilities.singletonP(not_specs)) {
                return com.cyc.cycjava.cycl.genls.not_genlP(not_specs.first(), col, mt, tv);
            } else {
                return sbhl_search_implied_relations.sbhl_all_with_implied_false_inverse_relation_p(sbhl_module_vars.get_sbhl_module($$genls), not_specs, col, mt, tv);
            }
        }
    }

    /**
     * Return whether every collection in NOT-SPECS is not a spec of COL.
     */
    @LispMethod(comment = "Return whether every collection in NOT-SPECS is not a spec of COL.")
    public static SubLObject all_not_specP(final SubLObject col, final SubLObject not_specs, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(col, EL_FORT_P);
        SubLTrampolineFile.enforceType(not_specs, LISTP);
        if (NIL == not_specs) {
            return T;
        }
        if (NIL != list_utilities.singletonP(not_specs)) {
            return not_genlP(not_specs.first(), col, mt, tv);
        }
        return sbhl_search_implied_relations.sbhl_all_with_implied_false_inverse_relation_p(sbhl_module_vars.get_sbhl_module($$genls), not_specs, col, mt, tv);
    }/**
     * Return whether every collection in NOT-SPECS is not a spec of COL.
     */


    /**
     * Returns whether any collection in NOT-GENLS is not a genl of COL.
     */
    @LispMethod(comment = "Returns whether any collection in NOT-GENLS is not a genl of COL.")
    public static final SubLObject any_not_genlP_alt(SubLObject col, SubLObject not_genls, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(col, EL_FORT_P);
        SubLTrampolineFile.checkType(not_genls, LISTP);
        if (NIL == not_genls) {
            return NIL;
        } else {
            if (NIL != list_utilities.singletonP(not_genls)) {
                return com.cyc.cycjava.cycl.genls.not_genlP(col, not_genls.first(), mt, tv);
            } else {
                return sbhl_search_implied_relations.sbhl_any_with_implied_false_inverse_relation_p(sbhl_module_vars.get_sbhl_module($$genls), not_genls, col, mt, tv);
            }
        }
    }

    /**
     * Returns whether any collection in NOT-GENLS is not a genl of COL.
     */
    @LispMethod(comment = "Returns whether any collection in NOT-GENLS is not a genl of COL.")
    public static SubLObject any_not_genlP(final SubLObject col, final SubLObject not_genls, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(col, EL_FORT_P);
        SubLTrampolineFile.enforceType(not_genls, LISTP);
        if (NIL == not_genls) {
            return NIL;
        }
        if (NIL != list_utilities.singletonP(not_genls)) {
            return not_genlP(col, not_genls.first(), mt, tv);
        }
        return sbhl_search_implied_relations.sbhl_any_with_implied_false_inverse_relation_p(sbhl_module_vars.get_sbhl_module($$genls), not_genls, col, mt, tv);
    }/**
     * Returns whether any collection in NOT-GENLS is not a genl of COL.
     */


    public static final SubLObject random_genl_of_alt(SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(collection, FORT_P);
        if (NIL != mt) {
            SubLTrampolineFile.checkType(mt, HLMT_P);
        }
        return list_utilities.random_element(com.cyc.cycjava.cycl.genls.all_genls(collection, mt, UNPROVIDED));
    }

    public static SubLObject random_genl_of(final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        assert NIL != forts.fort_p(collection) : "! forts.fort_p(collection) " + ("forts.fort_p(collection) " + "CommonSymbols.NIL != forts.fort_p(collection) ") + collection;
        if (((NIL != mt) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == hlmt.hlmt_p(mt))) {
            throw new AssertionError(mt);
        }
        return list_utilities.random_element(all_genls(collection, mt, UNPROVIDED));
    }

    public static final SubLObject random_spec_of_alt(SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(collection, FORT_P);
        if (NIL != mt) {
            SubLTrampolineFile.checkType(mt, HLMT_P);
        }
        return list_utilities.random_element(com.cyc.cycjava.cycl.genls.all_specs(collection, mt, UNPROVIDED));
    }

    public static SubLObject random_spec_of(final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        assert NIL != forts.fort_p(collection) : "! forts.fort_p(collection) " + ("forts.fort_p(collection) " + "CommonSymbols.NIL != forts.fort_p(collection) ") + collection;
        if (((NIL != mt) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == hlmt.hlmt_p(mt))) {
            throw new AssertionError(mt);
        }
        return list_utilities.random_element(all_specs(collection, mt, UNPROVIDED));
    }

    /**
     * Are COL-1 and COL-2 coextensional?
     */
    @LispMethod(comment = "Are COL-1 and COL-2 coextensional?")
    public static final SubLObject collections_coextensionalP_alt(SubLObject col_1, SubLObject col_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(col_1, EL_FORT_P);
        SubLTrampolineFile.checkType(col_2, EL_FORT_P);
        return makeBoolean(((col_1 == col_2) || (NIL != com.cyc.cycjava.cycl.genls.asserted_coextensionalP(col_1, col_2, mt))) || (NIL != com.cyc.cycjava.cycl.genls.tacit_coextensionalP(col_1, col_2, mt)));
    }

    /**
     * Are COL-1 and COL-2 coextensional?
     */
    @LispMethod(comment = "Are COL-1 and COL-2 coextensional?")
    public static SubLObject collections_coextensionalP(final SubLObject col_1, final SubLObject col_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.enforceType(col_1, EL_FORT_P);
        SubLTrampolineFile.enforceType(col_2, EL_FORT_P);
        return makeBoolean((col_1.eql(col_2) || (NIL != asserted_coextensionalP(col_1, col_2, mt))) || (NIL != tacit_coextensionalP(col_1, col_2, mt)));
    }/**
     * Are COL-1 and COL-2 coextensional?
     */


    /**
     * do col-1 and col-2 genl? to eachother
     */
    @LispMethod(comment = "do col-1 and col-2 genl? to eachother")
    public static final SubLObject tacit_coextensionalP_alt(SubLObject col_1, SubLObject col_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != com.cyc.cycjava.cycl.genls.genlP(col_1, col_2, mt, UNPROVIDED)) && (NIL != com.cyc.cycjava.cycl.genls.genlP(col_2, col_1, mt, UNPROVIDED)));
    }

    /**
     * do col-1 and col-2 genl? to eachother
     */
    @LispMethod(comment = "do col-1 and col-2 genl? to eachother")
    public static SubLObject tacit_coextensionalP(final SubLObject col_1, final SubLObject col_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != genlP(col_1, col_2, mt, UNPROVIDED)) && (NIL != genlP(col_2, col_1, mt, UNPROVIDED)));
    }/**
     * do col-1 and col-2 genl? to eachother
     */


    /**
     * stub
     */
    @LispMethod(comment = "stub")
    public static final SubLObject common_instanceP_alt(SubLObject col_1, SubLObject col_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return NIL;
    }

    /**
     * stub
     */
    @LispMethod(comment = "stub")
    public static SubLObject common_instanceP(final SubLObject col_1, final SubLObject col_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return NIL;
    }/**
     * stub
     */


    /**
     * stub
     */
    @LispMethod(comment = "stub")
    public static final SubLObject why_common_instanceP_alt(SubLObject col_1, SubLObject col_2, SubLObject mt, SubLObject tv, SubLObject behavior) {
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

    /**
     * stub
     */
    @LispMethod(comment = "stub")
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
    }/**
     * stub
     */


    /**
     * Do collections COL-1 and COL-2 intersect?
     * (uses only sbhl graphs: their extensions are not searched
     * nor are their sufficient conditions analyzed)
     */
    @LispMethod(comment = "Do collections COL-1 and COL-2 intersect?\r\n(uses only sbhl graphs: their extensions are not searched\r\nnor are their sufficient conditions analyzed)\nDo collections COL-1 and COL-2 intersect?\n(uses only sbhl graphs: their extensions are not searched\nnor are their sufficient conditions analyzed)")
    public static final SubLObject collections_intersectP_alt(SubLObject col_1, SubLObject col_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(col_1, EL_FORT_P);
            SubLTrampolineFile.checkType(col_2, EL_FORT_P);
            return makeBoolean((((NIL != com.cyc.cycjava.cycl.genls.genlP(col_1, col_2, mt, UNPROVIDED)) || (NIL != com.cyc.cycjava.cycl.genls.genlP(col_2, col_1, mt, UNPROVIDED))) || (NIL != disjoint_with.not_disjoint_withP(col_1, col_2, mt, UNPROVIDED))) || ((NIL != $sbhl_infer_intersection_from_instancesP$.getDynamicValue(thread)) && (NIL != com.cyc.cycjava.cycl.genls.common_instanceP(col_1, col_2, mt))));
        }
    }

    /**
     * Do collections COL-1 and COL-2 intersect?
     * (uses only sbhl graphs: their extensions are not searched
     * nor are their sufficient conditions analyzed)
     */
    @LispMethod(comment = "Do collections COL-1 and COL-2 intersect?\r\n(uses only sbhl graphs: their extensions are not searched\r\nnor are their sufficient conditions analyzed)\nDo collections COL-1 and COL-2 intersect?\n(uses only sbhl graphs: their extensions are not searched\nnor are their sufficient conditions analyzed)")
    public static SubLObject collections_intersectP(final SubLObject col_1, final SubLObject col_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(col_1, EL_FORT_P);
        SubLTrampolineFile.enforceType(col_2, EL_FORT_P);
        return makeBoolean((((NIL != genlP(col_1, col_2, mt, UNPROVIDED)) || (NIL != genlP(col_2, col_1, mt, UNPROVIDED))) || (NIL != disjoint_with.not_disjoint_withP(col_1, col_2, mt, UNPROVIDED))) || ((NIL != $sbhl_infer_intersection_from_instancesP$.getDynamicValue(thread)) && (NIL != common_instanceP(col_1, col_2, mt))));
    }/**
     * Do collections COL-1 and COL-2 intersect?
     * (uses only sbhl graphs: their extensions are not searched
     * nor are their sufficient conditions analyzed)
     */


    /**
     * (genl? col1 col2) OR (genl? col2 col1)
     */
    @LispMethod(comment = "(genl? col1 col2) OR (genl? col2 col1)")
    public static final SubLObject hierarchical_collectionsP_alt(SubLObject col_1, SubLObject col_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != com.cyc.cycjava.cycl.genls.genlP(col_1, col_2, mt, UNPROVIDED)) || (NIL != com.cyc.cycjava.cycl.genls.genlP(col_2, col_1, mt, UNPROVIDED)));
    }

    /**
     * (genl? col1 col2) OR (genl? col2 col1)
     */
    @LispMethod(comment = "(genl? col1 col2) OR (genl? col2 col1)")
    public static SubLObject hierarchical_collectionsP(final SubLObject col_1, final SubLObject col_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != genlP(col_1, col_2, mt, UNPROVIDED)) || (NIL != genlP(col_2, col_1, mt, UNPROVIDED)));
    }/**
     * (genl? col1 col2) OR (genl? col2 col1)
     */


    /**
     * Returns t iff there exists <spec> for which (genls <spec> COLLECTION) is true,
     * and (PRED TERM <spec>) is asserted.  E.g.,
     * (genl-of-any-arg? #$Collection #$isa #$arg2Isa) -> T,   because (#$arg2Isa #$isa #$Collection) is asserted.
     * (genl-of-any-arg? #$Individual #$isa #$arg2Isa) -> NIL, because #$Collection is not a spec of #$Individual.
     * (genl-of-any-arg? #$Thing #$isa #$arg2Isa)      -> T,   because (#$arg2Isa #$isa #$Collection) is asserted and #$Collection is a spec of #$Thing.
     */
    @LispMethod(comment = "Returns t iff there exists <spec> for which (genls <spec> COLLECTION) is true,\r\nand (PRED TERM <spec>) is asserted.  E.g.,\r\n(genl-of-any-arg? #$Collection #$isa #$arg2Isa) -> T,   because (#$arg2Isa #$isa #$Collection) is asserted.\r\n(genl-of-any-arg? #$Individual #$isa #$arg2Isa) -> NIL, because #$Collection is not a spec of #$Individual.\r\n(genl-of-any-arg? #$Thing #$isa #$arg2Isa)      -> T,   because (#$arg2Isa #$isa #$Collection) is asserted and #$Collection is a spec of #$Thing.\nReturns t iff there exists <spec> for which (genls <spec> COLLECTION) is true,\nand (PRED TERM <spec>) is asserted.  E.g.,\n(genl-of-any-arg? #$Collection #$isa #$arg2Isa) -> T,   because (#$arg2Isa #$isa #$Collection) is asserted.\n(genl-of-any-arg? #$Individual #$isa #$arg2Isa) -> NIL, because #$Collection is not a spec of #$Individual.\n(genl-of-any-arg? #$Thing #$isa #$arg2Isa)      -> T,   because (#$arg2Isa #$isa #$Collection) is asserted and #$Collection is a spec of #$Thing.")
    public static final SubLObject genl_of_any_argP_alt(SubLObject collection, SubLObject v_term, SubLObject pred, SubLObject mt, SubLObject index_arg, SubLObject access_arg, SubLObject tv) {
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
        } else {
            if (NIL != term.ground_nautP(collection, UNPROVIDED)) {
                return com.cyc.cycjava.cycl.genls.genl_of_any_argP(narts_high.find_nart(collection), v_term, pred, mt, index_arg, access_arg, tv);
            } else {
                if (NIL != term.ground_nautP(v_term, UNPROVIDED)) {
                    return com.cyc.cycjava.cycl.genls.genl_of_any_argP(collection, narts_high.find_nart(v_term), pred, mt, index_arg, access_arg, tv);
                } else {
                    if (NIL == fort_types_interface.collectionP(collection)) {
                        return NIL;
                    } else {
                        if (NIL == forts.fort_p(v_term)) {
                            return NIL;
                        } else {
                            return com.cyc.cycjava.cycl.genls.genl_of_any_argP_int(collection, v_term, pred, mt, index_arg, access_arg, tv);
                        }
                    }
                }
            }
        }
    }

    /**
     * Returns t iff there exists <spec> for which (genls <spec> COLLECTION) is true,
     * and (PRED TERM <spec>) is asserted.  E.g.,
     * (genl-of-any-arg? #$Collection #$isa #$arg2Isa) -> T,   because (#$arg2Isa #$isa #$Collection) is asserted.
     * (genl-of-any-arg? #$Individual #$isa #$arg2Isa) -> NIL, because #$Collection is not a spec of #$Individual.
     * (genl-of-any-arg? #$Thing #$isa #$arg2Isa)      -> T,   because (#$arg2Isa #$isa #$Collection) is asserted and #$Collection is a spec of #$Thing.
     */
    @LispMethod(comment = "Returns t iff there exists <spec> for which (genls <spec> COLLECTION) is true,\r\nand (PRED TERM <spec>) is asserted.  E.g.,\r\n(genl-of-any-arg? #$Collection #$isa #$arg2Isa) -> T,   because (#$arg2Isa #$isa #$Collection) is asserted.\r\n(genl-of-any-arg? #$Individual #$isa #$arg2Isa) -> NIL, because #$Collection is not a spec of #$Individual.\r\n(genl-of-any-arg? #$Thing #$isa #$arg2Isa)      -> T,   because (#$arg2Isa #$isa #$Collection) is asserted and #$Collection is a spec of #$Thing.\nReturns t iff there exists <spec> for which (genls <spec> COLLECTION) is true,\nand (PRED TERM <spec>) is asserted.  E.g.,\n(genl-of-any-arg? #$Collection #$isa #$arg2Isa) -> T,   because (#$arg2Isa #$isa #$Collection) is asserted.\n(genl-of-any-arg? #$Individual #$isa #$arg2Isa) -> NIL, because #$Collection is not a spec of #$Individual.\n(genl-of-any-arg? #$Thing #$isa #$arg2Isa)      -> T,   because (#$arg2Isa #$isa #$Collection) is asserted and #$Collection is a spec of #$Thing.")
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
    }/**
     * Returns t iff there exists <spec> for which (genls <spec> COLLECTION) is true,
     * and (PRED TERM <spec>) is asserted.  E.g.,
     * (genl-of-any-arg? #$Collection #$isa #$arg2Isa) -> T,   because (#$arg2Isa #$isa #$Collection) is asserted.
     * (genl-of-any-arg? #$Individual #$isa #$arg2Isa) -> NIL, because #$Collection is not a spec of #$Individual.
     * (genl-of-any-arg? #$Thing #$isa #$arg2Isa)      -> T,   because (#$arg2Isa #$isa #$Collection) is asserted and #$Collection is a spec of #$Thing.
     */


    public static final SubLObject genl_of_any_argP_int_alt(SubLObject collection, SubLObject v_term, SubLObject pred, SubLObject mt, SubLObject index_arg, SubLObject access_arg, SubLObject tv) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject genlP = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        if (kb_indexing.num_gaf_arg_index(v_term, index_arg, pred, UNPROVIDED).numL(divide(cardinality_estimates.spec_cardinality(collection), THREE_INTEGER))) {
                            {
                                SubLObject pred_var = pred;
                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, index_arg, pred_var)) {
                                    {
                                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, index_arg, pred_var);
                                        SubLObject done_var = genlP;
                                        SubLObject token_var = NIL;
                                        while (NIL == done_var) {
                                            {
                                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                if (NIL != valid) {
                                                    {
                                                        SubLObject final_index_iterator = NIL;
                                                        try {
                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, tv, NIL);
                                                            {
                                                                SubLObject done_var_124 = genlP;
                                                                SubLObject token_var_125 = NIL;
                                                                while (NIL == done_var_124) {
                                                                    {
                                                                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_125);
                                                                        SubLObject valid_126 = makeBoolean(token_var_125 != assertion);
                                                                        if (NIL != valid_126) {
                                                                            if (NIL != com.cyc.cycjava.cycl.genls.genlP(assertions_high.gaf_arg(assertion, access_arg), collection, UNPROVIDED, UNPROVIDED)) {
                                                                                genlP = T;
                                                                            }
                                                                        }
                                                                        done_var_124 = makeBoolean((NIL == valid_126) || (NIL != genlP));
                                                                    }
                                                                } 
                                                            }
                                                        } finally {
                                                            {
                                                                SubLObject _prev_bind_0_127 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    if (NIL != final_index_iterator) {
                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                    }
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_127, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                done_var = makeBoolean((NIL == valid) || (NIL != genlP));
                                            }
                                        } 
                                    }
                                }
                            }
                        } else {
                            {
                                SubLObject specs = com.cyc.cycjava.cycl.genls.all_specs(collection, UNPROVIDED, UNPROVIDED);
                                SubLObject pred_var = pred;
                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, index_arg, pred_var)) {
                                    {
                                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, index_arg, pred_var);
                                        SubLObject done_var = genlP;
                                        SubLObject token_var = NIL;
                                        while (NIL == done_var) {
                                            {
                                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                if (NIL != valid) {
                                                    {
                                                        SubLObject final_index_iterator = NIL;
                                                        try {
                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, tv, NIL);
                                                            {
                                                                SubLObject done_var_128 = genlP;
                                                                SubLObject token_var_129 = NIL;
                                                                while (NIL == done_var_128) {
                                                                    {
                                                                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_129);
                                                                        SubLObject valid_130 = makeBoolean(token_var_129 != assertion);
                                                                        if (NIL != valid_130) {
                                                                            if (NIL != list_utilities.member_eqP(assertions_high.gaf_arg(assertion, access_arg), specs)) {
                                                                                genlP = T;
                                                                            }
                                                                        }
                                                                        done_var_128 = makeBoolean((NIL == valid_130) || (NIL != genlP));
                                                                    }
                                                                } 
                                                            }
                                                        } finally {
                                                            {
                                                                SubLObject _prev_bind_0_131 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    if (NIL != final_index_iterator) {
                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                    }
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_131, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                done_var = makeBoolean((NIL == valid) || (NIL != genlP));
                                            }
                                        } 
                                    }
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return genlP;
            }
        }
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

    /**
     * Justification of (genls SPEC GENL)
     */
    @LispMethod(comment = "Justification of (genls SPEC GENL)")
    public static final SubLObject why_genlP_alt(SubLObject spec, SubLObject genl, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (behavior == UNPROVIDED) {
            behavior = NIL;
        }
        SubLTrampolineFile.checkType(spec, EL_FORT_P);
        SubLTrampolineFile.checkType(genl, EL_FORT_P);
        if (NIL != term.first_order_nautP(spec)) {
            return com.cyc.cycjava.cycl.genls.any_just_of_nat_genl(spec, genl, mt);
        } else {
            return sbhl_search_methods.why_sbhl_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genls), spec, genl, mt, tv, behavior);
        }
    }

    @LispMethod(comment = "Justification of (genls SPEC GENL)")
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
        SubLTrampolineFile.enforceType(spec, EL_FORT_P);
        SubLTrampolineFile.enforceType(genl, EL_FORT_P);
        if (NIL != term.first_order_nautP(spec)) {
            return any_just_of_nat_genl(spec, genl, mt);
        }
        return sbhl_search_methods.why_sbhl_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genls), spec, genl, mt, tv, behavior);
    }/**
     * Justification of (genls SPEC GENL)
     */


    /**
     * justification of (isa <nat> <collection>)
     */
    @LispMethod(comment = "justification of (isa <nat> <collection>)")
    public static final SubLObject any_just_of_nat_genl_alt(SubLObject nat, SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_term = cycl_utilities.find_ground_naut(nat);
                SubLObject just = com.cyc.cycjava.cycl.genls.why_genlP(v_term, collection, mt, UNPROVIDED, UNPROVIDED);
                if (NIL != just) {
                    return cons(bq_cons(list($$termOfUnit, v_term, nat), $list_alt141), just);
                } else {
                    {
                        SubLObject nat_just = NIL;
                        if (NIL == nat_just) {
                            {
                                SubLObject csome_list_var = kb_accessors.result_genl(cycl_utilities.nat_functor(nat), mt, UNPROVIDED);
                                SubLObject genl = NIL;
                                for (genl = csome_list_var.first(); !((NIL != nat_just) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , genl = csome_list_var.first()) {
                                    if (!genl.equal(collection)) {
                                        nat_just = com.cyc.cycjava.cycl.genls.why_genlP(genl, collection, mt, UNPROVIDED, UNPROVIDED);
                                    }
                                    if ((NIL != nat_just) || genl.equal(collection)) {
                                        return cons(bq_cons(list($$resultGenl, cycl_utilities.nat_functor(nat), genl), $list_alt141), nat_just);
                                    }
                                }
                            }
                        }
                        if (NIL == nat_just) {
                            {
                                SubLObject csome_list_var = kb_accessors.result_genl_args(nat, mt);
                                SubLObject genl = NIL;
                                for (genl = csome_list_var.first(); !((NIL != nat_just) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , genl = csome_list_var.first()) {
                                    if (!genl.equal(collection)) {
                                        nat_just = com.cyc.cycjava.cycl.genls.why_genlP(genl, collection, mt, UNPROVIDED, UNPROVIDED);
                                    }
                                    if ((NIL != nat_just) || genl.equal(collection)) {
                                        {
                                            SubLObject args = kb_accessors.result_genl_via_argnums(nat, collection, mt, UNPROVIDED);
                                            if (NIL != args) {
                                                return cons(bq_cons(list($$resultGenlArg, cycl_utilities.nat_functor(nat), args.first()), $list_alt141), nat_just);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (NIL == nat_just) {
                            {
                                SubLObject csome_list_var = kb_accessors.result_inter_arg_genl(nat, mt);
                                SubLObject genl = NIL;
                                for (genl = csome_list_var.first(); !((NIL != nat_just) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , genl = csome_list_var.first()) {
                                    if (!genl.equal(collection)) {
                                        nat_just = com.cyc.cycjava.cycl.genls.why_genlP(genl, collection, mt, UNPROVIDED, UNPROVIDED);
                                    }
                                    if ((NIL != nat_just) || genl.equal(collection)) {
                                        {
                                            SubLObject args = kb_accessors.result_inter_arg_genl_via_which_args(nat, collection, mt).first();
                                            if (args.isCons()) {
                                                {
                                                    SubLObject arg = args.first();
                                                    SubLObject ind_col = second(args);
                                                    SubLObject dep_col = third(args);
                                                    SubLObject arg_col = cycl_utilities.nat_arg(nat, arg, UNPROVIDED);
                                                    if (!arg_col.equal(ind_col)) {
                                                        nat_just = nconc(nat_just, com.cyc.cycjava.cycl.genls.why_genlP(arg_col, ind_col, mt, UNPROVIDED, UNPROVIDED));
                                                    }
                                                    if (!dep_col.equal(collection)) {
                                                        nat_just = nconc(nat_just, com.cyc.cycjava.cycl.genls.why_genlP(dep_col, collection, mt, UNPROVIDED, UNPROVIDED));
                                                    }
                                                    return cons(bq_cons(list($$interArgResultGenl, cycl_utilities.nat_functor(nat), arg, ind_col, dep_col), $list_alt141), nat_just);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (NIL == nat_just) {
                            {
                                SubLObject csome_list_var = kb_accessors.result_inter_arg_genl_reln(nat, mt);
                                SubLObject genl = NIL;
                                for (genl = csome_list_var.first(); !((NIL != nat_just) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , genl = csome_list_var.first()) {
                                    if (!genl.equal(collection)) {
                                        nat_just = com.cyc.cycjava.cycl.genls.why_genlP(genl, collection, mt, UNPROVIDED, UNPROVIDED);
                                    }
                                    if ((NIL != nat_just) || genl.equal(collection)) {
                                        {
                                            SubLObject args = kb_accessors.result_inter_arg_genl_reln_via_which_args(nat, collection, mt, UNPROVIDED).first();
                                            if (args.isCons()) {
                                                {
                                                    SubLObject rel_sentence = args.first().first();
                                                    SubLObject arg = second(args);
                                                    SubLObject rel = cycl_utilities.formula_operator(rel_sentence);
                                                    SubLObject rel_nat_term_arg = third(args);
                                                    SubLObject rel_col_arg = fourth(args);
                                                    SubLObject col = cycl_utilities.formula_arg(rel_sentence, rel_col_arg, UNPROVIDED);
                                                    if (!col.equal(collection)) {
                                                        nat_just = nconc(nat_just, com.cyc.cycjava.cycl.genls.why_genlP(col, collection, mt, UNPROVIDED, UNPROVIDED));
                                                    }
                                                    return append(list(bq_cons(list($$interArgResultGenlReln, cycl_utilities.nat_functor(nat), arg, rel, rel_nat_term_arg, rel_col_arg), $list_alt141), bq_cons(rel_sentence, $list_alt141)), nat_just);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if ((((NIL == nat_just) && (NIL != $pgia_activeP$.getDynamicValue(thread))) && (NIL != term.first_order_nautP(collection))) && cycl_utilities.nat_functor(nat).eql(cycl_utilities.nat_functor(collection))) {
                            {
                                SubLObject functor = cycl_utilities.nat_functor(collection);
                                if (NIL == nat_just) {
                                    {
                                        SubLObject csome_list_var = kb_mapping_utilities.pred_values_in_relevant_mts(functor, $$preservesGenlsInArg, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        SubLObject arg = NIL;
                                        for (arg = csome_list_var.first(); !((NIL != nat_just) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , arg = csome_list_var.first()) {
                                            nat_just = com.cyc.cycjava.cycl.genls.why_genlP(cycl_utilities.nat_arg(nat, arg, UNPROVIDED), cycl_utilities.nat_arg(collection, arg, UNPROVIDED), mt, UNPROVIDED, UNPROVIDED);
                                            if (NIL != nat_just) {
                                                nat_just = cons(bq_cons(list($$preservesGenlsInArg, functor, arg), $list_alt141), nat_just);
                                            }
                                        }
                                    }
                                }
                                return nat_just;
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "justification of (isa <nat> <collection>)")
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
    }/**
     * justification of (isa <nat> <collection>)
     */


    /**
     * Justification of (not (genls SPEC GENL))
     */
    @LispMethod(comment = "Justification of (not (genls SPEC GENL))")
    public static final SubLObject why_not_genlP_alt(SubLObject spec, SubLObject genl, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (behavior == UNPROVIDED) {
            behavior = NIL;
        }
        SubLTrampolineFile.checkType(spec, EL_FORT_P);
        SubLTrampolineFile.checkType(genl, EL_FORT_P);
        return sbhl_search_implied_relations.why_sbhl_implied_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genls), spec, genl, mt, tv, behavior);
    }

    @LispMethod(comment = "Justification of (not (genls SPEC GENL))")
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
        SubLTrampolineFile.enforceType(spec, EL_FORT_P);
        SubLTrampolineFile.enforceType(genl, EL_FORT_P);
        return sbhl_search_implied_relations.why_sbhl_implied_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genls), spec, genl, mt, tv, behavior);
    }/**
     * Justification of (not (genls SPEC GENL))
     */


    /**
     * Justification of why asserting (genls SPEC GENL) is not consistent
     */
    @LispMethod(comment = "Justification of why asserting (genls SPEC GENL) is not consistent")
    public static final SubLObject why_not_assert_genlsP_alt(SubLObject spec, SubLObject genl, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(spec, EL_FORT_P);
        SubLTrampolineFile.checkType(genl, EL_FORT_P);
        return com.cyc.cycjava.cycl.genls.why_not_genlP(spec, genl, mt, UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "Justification of why asserting (genls SPEC GENL) is not consistent")
    public static SubLObject why_not_assert_genlsP(final SubLObject spec, final SubLObject genl, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.enforceType(spec, EL_FORT_P);
        SubLTrampolineFile.enforceType(genl, EL_FORT_P);
        return why_not_genlP(spec, genl, mt, UNPROVIDED, UNPROVIDED);
    }/**
     * Justification of why asserting (genls SPEC GENL) is not consistent
     */


    /**
     * Justification of why COL-1 and COL-2 interesect
     */
    @LispMethod(comment = "Justification of why COL-1 and COL-2 interesect")
    public static final SubLObject why_collections_intersectP_alt(SubLObject col_1, SubLObject col_2, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (behavior == UNPROVIDED) {
            behavior = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject why = com.cyc.cycjava.cycl.genls.why_genlP(col_1, col_2, mt, tv, behavior);
                if (NIL != why) {
                    return why;
                }
                why = com.cyc.cycjava.cycl.genls.why_genlP(col_2, col_1, mt, tv, behavior);
                if (NIL != why) {
                    return why;
                }
                why = disjoint_with.why_not_disjoint_withP(col_1, col_2, mt, tv, behavior);
                if (NIL != why) {
                    return why;
                }
                if (NIL != $sbhl_infer_intersection_from_instancesP$.getDynamicValue(thread)) {
                    return com.cyc.cycjava.cycl.genls.why_common_instanceP(col_1, col_2, mt, tv, behavior);
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Justification of why COL-1 and COL-2 interesect")
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
    }/**
     * Justification of why COL-1 and COL-2 interesect
     */


    /**
     * Calls why-collections-intersect
     */
    @LispMethod(comment = "Calls why-collections-intersect")
    public static final SubLObject why_not_assert_mdwP_alt(SubLObject col_1, SubLObject col_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.genls.why_collections_intersectP(col_1, col_2, mt, UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "Calls why-collections-intersect")
    public static SubLObject why_not_assert_mdwP(final SubLObject col_1, final SubLObject col_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return why_collections_intersectP(col_1, col_2, mt, UNPROVIDED, UNPROVIDED);
    }/**
     * Calls why-collections-intersect
     */


    /**
     * Returns the minimally-general (the most specific) among all-specs of COL
     */
    @LispMethod(comment = "Returns the minimally-general (the most specific) among all-specs of COL")
    public static final SubLObject collection_leaves_alt(SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(col, EL_FORT_P);
        return sbhl_search_methods.sbhl_leaf_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, mt, tv);
    }

    @LispMethod(comment = "Returns the minimally-general (the most specific) among all-specs of COL")
    public static SubLObject collection_leaves(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(col, EL_FORT_P);
        return sbhl_search_methods.sbhl_leaf_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, mt, tv);
    }/**
     * Returns the minimally-general (the most specific) among all-specs of COL
     */


    /**
     * Returns the minimally-general (the most specific) among reified collections COLS,
     * collections that have no proper specs among COLS
     */
    @LispMethod(comment = "Returns the minimally-general (the most specific) among reified collections COLS,\r\ncollections that have no proper specs among COLS\nReturns the minimally-general (the most specific) among reified collections COLS,\ncollections that have no proper specs among COLS")
    public static final SubLObject min_cols_alt(SubLObject cols, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(cols, LIST_OF_COLLECTIONS_P);
        return sbhl_search_methods.sbhl_min_nodes(sbhl_module_vars.get_sbhl_module($$genls), cols, mt, tv);
    }

    @LispMethod(comment = "Returns the minimally-general (the most specific) among reified collections COLS,\r\ncollections that have no proper specs among COLS\nReturns the minimally-general (the most specific) among reified collections COLS,\ncollections that have no proper specs among COLS")
    public static SubLObject min_cols(final SubLObject cols, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(cols, LISTP);
        return sbhl_search_methods.sbhl_min_nodes(sbhl_module_vars.get_sbhl_module($$genls), cols, mt, tv);
    }/**
     * Returns the minimally-general (the most specific) among reified collections COLS,
     * collections that have no proper specs among COLS
     */


    /**
     * Returns the single minimally-general (the most specific) among reified collections COLS.
     * Ties are broken by comparing the number of all-genls which is a rough depth estimate.
     */
    @LispMethod(comment = "Returns the single minimally-general (the most specific) among reified collections COLS.\r\nTies are broken by comparing the number of all-genls which is a rough depth estimate.\nReturns the single minimally-general (the most specific) among reified collections COLS.\nTies are broken by comparing the number of all-genls which is a rough depth estimate.")
    public static final SubLObject min_col_alt(SubLObject cols, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(cols, LISTP);
        {
            SubLObject min_cols = com.cyc.cycjava.cycl.genls.min_cols(cols, mt, tv);
            SubLObject min_col = min_cols.first();
            SubLObject depth_min_col = length(com.cyc.cycjava.cycl.genls.all_genls(min_col, mt, UNPROVIDED));
            SubLObject depth_col = NIL;
            SubLObject cdolist_list_var = min_cols.rest();
            SubLObject col = NIL;
            for (col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , col = cdolist_list_var.first()) {
                depth_col = length(com.cyc.cycjava.cycl.genls.all_genls(col, mt, UNPROVIDED));
                if (depth_col.numG(depth_min_col)) {
                    depth_min_col = depth_col;
                    min_col = col;
                }
            }
            return min_col;
        }
    }

    @LispMethod(comment = "Returns the single minimally-general (the most specific) among reified collections COLS.\r\nTies are broken by comparing the number of all-genls which is a rough depth estimate.\nReturns the single minimally-general (the most specific) among reified collections COLS.\nTies are broken by comparing the number of all-genls which is a rough depth estimate.")
    public static SubLObject min_col(final SubLObject cols, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(cols, LISTP);
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
    }/**
     * Returns the single minimally-general (the most specific) among reified collections COLS.
     * Ties are broken by comparing the number of all-genls which is a rough depth estimate.
     */


    /**
     * Returns the most-general among reified collections COLS, collections
     * that have no proper genls among COLS
     */
    @LispMethod(comment = "Returns the most-general among reified collections COLS, collections\r\nthat have no proper genls among COLS\nReturns the most-general among reified collections COLS, collections\nthat have no proper genls among COLS")
    public static final SubLObject max_cols_alt(SubLObject cols, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(cols, LISTP);
        return sbhl_search_methods.sbhl_max_nodes(sbhl_module_vars.get_sbhl_module($$genls), cols, mt, tv, UNPROVIDED);
    }

    @LispMethod(comment = "Returns the most-general among reified collections COLS, collections\r\nthat have no proper genls among COLS\nReturns the most-general among reified collections COLS, collections\nthat have no proper genls among COLS")
    public static SubLObject max_cols(final SubLObject cols, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(cols, LISTP);
        return sbhl_search_methods.sbhl_max_nodes(sbhl_module_vars.get_sbhl_module($$genls), cols, mt, tv, UNPROVIDED);
    }/**
     * Returns the most-general among reified collections COLS, collections
     * that have no proper genls among COLS
     */


    public static final SubLObject nearest_common_genls_alt(SubLObject cols, SubLObject candidates, SubLObject mt, SubLObject tv) {
        if (candidates == UNPROVIDED) {
            candidates = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return com.cyc.cycjava.cycl.genls.min_ceiling_cols(cols, candidates, mt, tv);
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

    /**
     * Returns the most specific common generalizations among reified collections COLS
     * (if CANDIDATES is non-nil, then result is a subset of CANDIDATES)
     */
    @LispMethod(comment = "Returns the most specific common generalizations among reified collections COLS\r\n(if CANDIDATES is non-nil, then result is a subset of CANDIDATES)\nReturns the most specific common generalizations among reified collections COLS\n(if CANDIDATES is non-nil, then result is a subset of CANDIDATES)")
    public static final SubLObject min_ceiling_cols_alt(SubLObject cols, SubLObject candidates, SubLObject mt, SubLObject tv) {
        if (candidates == UNPROVIDED) {
            candidates = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(cols, LISTP);
        return sbhl_search_methods.sbhl_min_ceilings(sbhl_module_vars.get_sbhl_module($$genls), cols, candidates, mt, tv);
    }

    @LispMethod(comment = "Returns the most specific common generalizations among reified collections COLS\r\n(if CANDIDATES is non-nil, then result is a subset of CANDIDATES)\nReturns the most specific common generalizations among reified collections COLS\n(if CANDIDATES is non-nil, then result is a subset of CANDIDATES)")
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
        SubLTrampolineFile.enforceType(cols, LISTP);
        return sbhl_search_methods.sbhl_min_ceilings(sbhl_module_vars.get_sbhl_module($$genls), cols, candidates, mt, tv);
    }/**
     * Returns the most specific common generalizations among reified collections COLS
     * (if CANDIDATES is non-nil, then result is a subset of CANDIDATES)
     */


    public static final SubLObject nearest_common_specs_alt(SubLObject cols, SubLObject candidates, SubLObject mt, SubLObject tv) {
        if (candidates == UNPROVIDED) {
            candidates = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return com.cyc.cycjava.cycl.genls.max_floor_cols(cols, candidates, mt, tv);
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

    /**
     * Returns the most general common specializations among reified collections COLS
     * (if CANDIDATES is non-nil, then result is a subset of CANDIDATES)
     */
    @LispMethod(comment = "Returns the most general common specializations among reified collections COLS\r\n(if CANDIDATES is non-nil, then result is a subset of CANDIDATES)\nReturns the most general common specializations among reified collections COLS\n(if CANDIDATES is non-nil, then result is a subset of CANDIDATES)")
    public static final SubLObject max_floor_cols_alt(SubLObject cols, SubLObject candidates, SubLObject mt, SubLObject tv) {
        if (candidates == UNPROVIDED) {
            candidates = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(cols, LISTP);
        return sbhl_search_methods.sbhl_max_floors(sbhl_module_vars.get_sbhl_module($$genls), cols, candidates, mt, tv, UNPROVIDED);
    }

    @LispMethod(comment = "Returns the most general common specializations among reified collections COLS\r\n(if CANDIDATES is non-nil, then result is a subset of CANDIDATES)\nReturns the most general common specializations among reified collections COLS\n(if CANDIDATES is non-nil, then result is a subset of CANDIDATES)")
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
        SubLTrampolineFile.enforceType(cols, LISTP);
        return sbhl_search_methods.sbhl_max_floors(sbhl_module_vars.get_sbhl_module($$genls), cols, candidates, mt, tv, UNPROVIDED);
    }/**
     * Returns the most general common specializations among reified collections COLS
     * (if CANDIDATES is non-nil, then result is a subset of CANDIDATES)
     */


    /**
     * returns whether a common spec of COL-1 and COL-2 exists
     */
    @LispMethod(comment = "returns whether a common spec of COL-1 and COL-2 exists")
    public static final SubLObject floor_of_col_pairP_alt(SubLObject col_1, SubLObject col_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.genls.any_floor_of_col_pair(col_1, col_2, mt, UNPROVIDED));
    }

    @LispMethod(comment = "returns whether a common spec of COL-1 and COL-2 exists")
    public static SubLObject floor_of_col_pairP(final SubLObject col_1, final SubLObject col_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return list_utilities.sublisp_boolean(any_floor_of_col_pair(col_1, col_2, mt, UNPROVIDED));
    }/**
     * returns whether a common spec of COL-1 and COL-2 exists
     */


    /**
     * returns a common spec of COL-1 and COL-2, if one exists
     */
    @LispMethod(comment = "returns a common spec of COL-1 and COL-2, if one exists")
    public static final SubLObject any_floor_of_col_pair_alt(SubLObject col_1, SubLObject col_2, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_first_floor_of_node_pair(sbhl_module_vars.get_sbhl_module($$genls), col_1, col_2, mt, tv);
    }

    @LispMethod(comment = "returns a common spec of COL-1 and COL-2, if one exists")
    public static SubLObject any_floor_of_col_pair(final SubLObject col_1, final SubLObject col_2, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_first_floor_of_node_pair(sbhl_module_vars.get_sbhl_module($$genls), col_1, col_2, mt, tv);
    }/**
     * returns a common spec of COL-1 and COL-2, if one exists
     */


    public static final SubLObject all_common_specs_alt(SubLObject cols, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return com.cyc.cycjava.cycl.genls.union_all_specs(com.cyc.cycjava.cycl.genls.nearest_common_specs(cols, NIL, mt, tv), mt, tv);
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

    /**
     * Return some genl of COL that isa instance of ISA (if any such genl exists)
     */
    @LispMethod(comment = "Return some genl of COL that isa instance of ISA (if any such genl exists)")
    public static final SubLObject any_genl_isa_alt(SubLObject col, SubLObject v_isa, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(col, EL_FORT_P);
        SubLTrampolineFile.checkType(v_isa, EL_FORT_P);
        return isa.any_all_forward_true_nodes_isa($$genls, col, v_isa, mt, tv);
    }

    @LispMethod(comment = "Return some genl of COL that isa instance of ISA (if any such genl exists)")
    public static SubLObject any_genl_isa(final SubLObject col, final SubLObject v_isa, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(col, EL_FORT_P);
        SubLTrampolineFile.enforceType(v_isa, EL_FORT_P);
        return isa.any_all_forward_true_nodes_isa($$genls, col, v_isa, mt, tv);
    }/**
     * Return some genl of COL that isa instance of ISA (if any such genl exists)
     */


    /**
     * Return COL-B iff it has fewer specs than COL-A, else return COL-A
     */
    @LispMethod(comment = "Return COL-B iff it has fewer specs than COL-A, else return COL-A")
    public static final SubLObject lighter_col_alt(SubLObject col_a, SubLObject col_b) {
        SubLTrampolineFile.checkType(col_a, EL_FORT_P);
        SubLTrampolineFile.checkType(col_b, EL_FORT_P);
        if (NIL != term.ground_nautP(col_a, UNPROVIDED)) {
            return com.cyc.cycjava.cycl.genls.lighter_col(narts_high.find_nart(col_a), col_b);
        } else {
            if (NIL != term.ground_nautP(col_b, UNPROVIDED)) {
                return com.cyc.cycjava.cycl.genls.lighter_col(col_a, narts_high.find_nart(col_b));
            } else {
                if (NIL == forts.fort_p(col_a)) {
                    return NIL;
                } else {
                    if (NIL == forts.fort_p(col_b)) {
                        return NIL;
                    } else {
                        return cardinality_estimates.lightest_node(col_a, col_b);
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Return COL-B iff it has fewer specs than COL-A, else return COL-A")
    public static SubLObject lighter_col(final SubLObject col_a, final SubLObject col_b) {
        SubLTrampolineFile.enforceType(col_a, EL_FORT_P);
        SubLTrampolineFile.enforceType(col_b, EL_FORT_P);
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
    }/**
     * Return COL-B iff it has fewer specs than COL-A, else return COL-A
     */


    /**
     * return col-b iff it has fewer specs than col-a, else return col-a
     */
    @LispMethod(comment = "return col-b iff it has fewer specs than col-a, else return col-a")
    public static final SubLObject lightest_col_alt(SubLObject col_a, SubLObject col_b) {
        return cardinality_estimates.lightest_node(col_a, col_b);
    }

    @LispMethod(comment = "return col-b iff it has fewer specs than col-a, else return col-a")
    public static SubLObject lightest_col(final SubLObject col_a, final SubLObject col_b) {
        return cardinality_estimates.lightest_node(col_a, col_b);
    }/**
     * return col-b iff it has fewer specs than col-a, else return col-a
     */


    /**
     * Return the collection having the fewest specs given a list of collections.
     */
    @LispMethod(comment = "Return the collection having the fewest specs given a list of collections.")
    public static final SubLObject lightest_of_cols_alt(SubLObject cols) {
        SubLTrampolineFile.checkType(cols, LISTP);
        if (NIL == cols) {
            return NIL;
        }
        {
            SubLObject lightest = cols.first();
            SubLObject cdolist_list_var = cols.rest();
            SubLObject col = NIL;
            for (col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , col = cdolist_list_var.first()) {
                lightest = com.cyc.cycjava.cycl.genls.lightest_col(lightest, col);
            }
            return lightest;
        }
    }

    @LispMethod(comment = "Return the collection having the fewest specs given a list of collections.")
    public static SubLObject lightest_of_cols(final SubLObject cols) {
        SubLTrampolineFile.enforceType(cols, LISTP);
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
    }/**
     * Return the collection having the fewest specs given a list of collections.
     */


    /**
     * Return COL-B iff it has fewer genls than COL-A, else return COL-A
     */
    @LispMethod(comment = "Return COL-B iff it has fewer genls than COL-A, else return COL-A")
    public static final SubLObject shallower_col_alt(SubLObject col_a, SubLObject col_b) {
        SubLTrampolineFile.checkType(col_a, EL_FORT_P);
        SubLTrampolineFile.checkType(col_b, EL_FORT_P);
        if (NIL != term.ground_nautP(col_a, UNPROVIDED)) {
            return com.cyc.cycjava.cycl.genls.shallower_col(narts_high.find_nart(col_a), col_b);
        } else {
            if (NIL != term.ground_nautP(col_b, UNPROVIDED)) {
                return com.cyc.cycjava.cycl.genls.shallower_col(col_a, narts_high.find_nart(col_b));
            } else {
                if (NIL == forts.fort_p(col_a)) {
                    return NIL;
                } else {
                    if (NIL == forts.fort_p(col_b)) {
                        return NIL;
                    } else {
                        return cardinality_estimates.shallowest_node(col_a, col_b);
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Return COL-B iff it has fewer genls than COL-A, else return COL-A")
    public static SubLObject shallower_col(final SubLObject col_a, final SubLObject col_b) {
        SubLTrampolineFile.enforceType(col_a, EL_FORT_P);
        SubLTrampolineFile.enforceType(col_b, EL_FORT_P);
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
    }/**
     * Return COL-B iff it has fewer genls than COL-A, else return COL-A
     */


    /**
     * return col-b iff it has fewer genls than col-a, else return col-a
     */
    @LispMethod(comment = "return col-b iff it has fewer genls than col-a, else return col-a")
    public static final SubLObject shallowest_col_alt(SubLObject col_a, SubLObject col_b) {
        return cardinality_estimates.shallowest_node(col_a, col_b);
    }

    @LispMethod(comment = "return col-b iff it has fewer genls than col-a, else return col-a")
    public static SubLObject shallowest_col(final SubLObject col_a, final SubLObject col_b) {
        return cardinality_estimates.shallowest_node(col_a, col_b);
    }/**
     * return col-b iff it has fewer genls than col-a, else return col-a
     */


    /**
     *
     *
     * @return listp; the mts of the path from SPEC to GENL which are genl-mts of MT.
     */
    @LispMethod(comment = "@return listp; the mts of the path from SPEC to GENL which are genl-mts of MT.")
    public static final SubLObject max_floor_mts_of_genls_paths_wrt_alt(SubLObject spec, SubLObject genl, SubLObject mt) {
        return genl_mts.selected_genl_mts(mt, com.cyc.cycjava.cycl.genls.max_floor_mts_of_genls_paths(spec, genl, UNPROVIDED), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return listp; the mts of the path from SPEC to GENL which are genl-mts of MT.
     */
    @LispMethod(comment = "@return listp; the mts of the path from SPEC to GENL which are genl-mts of MT.")
    public static SubLObject max_floor_mts_of_genls_paths_wrt(final SubLObject spec, final SubLObject genl, final SubLObject mt) {
        return genl_mts.selected_genl_mts(mt, max_floor_mts_of_genls_paths(spec, genl, UNPROVIDED), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return listp; Returns in what (most-genl) mts GENL is a genls of SPEC
     */
    @LispMethod(comment = "@return listp; Returns in what (most-genl) mts GENL is a genls of SPEC")
    public static final SubLObject max_floor_mts_of_genls_paths_alt(SubLObject spec, SubLObject genl, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(spec, EL_FORT_P);
        SubLTrampolineFile.checkType(genl, EL_FORT_P);
        if (NIL != term.first_order_nautP(spec)) {
            return com.cyc.cycjava.cycl.genls.max_floor_mts_of_nat_genls_paths(spec, genl, tv);
        } else {
            return sbhl_search_what_mts.sbhl_max_floor_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module($$genls), spec, genl, tv);
        }
    }

    /**
     *
     *
     * @return listp; Returns in what (most-genl) mts GENL is a genls of SPEC
     */
    @LispMethod(comment = "@return listp; Returns in what (most-genl) mts GENL is a genls of SPEC")
    public static SubLObject max_floor_mts_of_genls_paths(final SubLObject spec, final SubLObject genl, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(spec, EL_FORT_P);
        SubLTrampolineFile.enforceType(genl, EL_FORT_P);
        if (NIL != term.first_order_nautP(spec)) {
            return max_floor_mts_of_nat_genls_paths(spec, genl, tv);
        }
        return sbhl_search_what_mts.sbhl_max_floor_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module($$genls), spec, genl, tv);
    }

    public static final SubLObject max_floor_mts_of_nat_genls_paths_alt(SubLObject spec, SubLObject genl, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject hl_spec = narts_high.find_nart(spec);
                if (NIL != hl_spec) {
                    return com.cyc.cycjava.cycl.genls.max_floor_mts_of_genls_paths(hl_spec, genl, tv);
                }
            }
            {
                SubLObject functor = cycl_utilities.nat_functor(spec);
                SubLObject result = NIL;
                SubLObject mts = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject cdolist_list_var = kb_accessors.result_genl(functor, UNPROVIDED, UNPROVIDED);
                            SubLObject link_node = NIL;
                            for (link_node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , link_node = cdolist_list_var.first()) {
                                mts = com.cyc.cycjava.cycl.genls.max_floor_mts_of_genls_paths(link_node, genl, UNPROVIDED);
                                {
                                    SubLObject cdolist_list_var_132 = mts;
                                    SubLObject mt = NIL;
                                    for (mt = cdolist_list_var_132.first(); NIL != cdolist_list_var_132; cdolist_list_var_132 = cdolist_list_var_132.rest() , mt = cdolist_list_var_132.first()) {
                                        if (NIL != subl_promotions.memberP(link_node, kb_accessors.result_genl(functor, mt, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
                                            result = cons(mt, result);
                                        }
                                    }
                                }
                            }
                        }
                        {
                            SubLObject cdolist_list_var = kb_accessors.result_genl_args(spec, UNPROVIDED);
                            SubLObject link_node = NIL;
                            for (link_node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , link_node = cdolist_list_var.first()) {
                                mts = com.cyc.cycjava.cycl.genls.max_floor_mts_of_genls_paths(link_node, genl, UNPROVIDED);
                                {
                                    SubLObject cdolist_list_var_133 = mts;
                                    SubLObject mt = NIL;
                                    for (mt = cdolist_list_var_133.first(); NIL != cdolist_list_var_133; cdolist_list_var_133 = cdolist_list_var_133.rest() , mt = cdolist_list_var_133.first()) {
                                        if (NIL != subl_promotions.memberP(link_node, kb_accessors.result_genl_args(spec, mt), UNPROVIDED, UNPROVIDED)) {
                                            result = cons(mt, result);
                                        }
                                    }
                                }
                            }
                        }
                        {
                            SubLObject cdolist_list_var = kb_accessors.result_inter_arg_genl(spec, UNPROVIDED);
                            SubLObject link_node = NIL;
                            for (link_node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , link_node = cdolist_list_var.first()) {
                                mts = com.cyc.cycjava.cycl.genls.max_floor_mts_of_genls_paths(link_node, genl, UNPROVIDED);
                                {
                                    SubLObject cdolist_list_var_134 = mts;
                                    SubLObject mt = NIL;
                                    for (mt = cdolist_list_var_134.first(); NIL != cdolist_list_var_134; cdolist_list_var_134 = cdolist_list_var_134.rest() , mt = cdolist_list_var_134.first()) {
                                        if (NIL != subl_promotions.memberP(link_node, kb_accessors.result_inter_arg_genl(spec, mt), UNPROVIDED, UNPROVIDED)) {
                                            result = cons(mt, result);
                                        }
                                    }
                                }
                            }
                        }
                        {
                            SubLObject cdolist_list_var = kb_accessors.result_genl_via_arg_arg_genl(spec, UNPROVIDED);
                            SubLObject link_node = NIL;
                            for (link_node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , link_node = cdolist_list_var.first()) {
                                mts = com.cyc.cycjava.cycl.genls.max_floor_mts_of_genls_paths(link_node, genl, UNPROVIDED);
                                {
                                    SubLObject cdolist_list_var_135 = mts;
                                    SubLObject mt = NIL;
                                    for (mt = cdolist_list_var_135.first(); NIL != cdolist_list_var_135; cdolist_list_var_135 = cdolist_list_var_135.rest() , mt = cdolist_list_var_135.first()) {
                                        if (NIL != subl_promotions.memberP(link_node, kb_accessors.result_genl_via_arg_arg_genl(spec, mt), UNPROVIDED, UNPROVIDED)) {
                                            result = cons(mt, result);
                                        }
                                    }
                                }
                            }
                        }
                        if (((NIL != $pgia_activeP$.getDynamicValue(thread)) && (NIL != term.first_order_nautP(genl))) && cycl_utilities.nat_functor(spec).eql(cycl_utilities.nat_functor(genl))) {
                            {
                                SubLObject cdolist_list_var = kb_mapping_utilities.pred_values_in_relevant_mts(functor, $$preservesGenlsInArg, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                SubLObject arg = NIL;
                                for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                                    mts = com.cyc.cycjava.cycl.genls.max_floor_mts_of_genls_paths(cycl_utilities.nat_arg(spec, arg, UNPROVIDED), cycl_utilities.nat_arg(genl, arg, UNPROVIDED), UNPROVIDED);
                                    {
                                        SubLObject cdolist_list_var_136 = mts;
                                        SubLObject mt = NIL;
                                        for (mt = cdolist_list_var_136.first(); NIL != cdolist_list_var_136; cdolist_list_var_136 = cdolist_list_var_136.rest() , mt = cdolist_list_var_136.first()) {
                                            if (NIL != subl_promotions.memberP(arg, kb_mapping_utilities.pred_values_in_relevant_mts(functor, $$preservesGenlsInArg, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
                                                result = cons(mt, result);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return remove_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
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

    /**
     *
     *
     * @return listp; what minimal sets of mts are associated with genls paths from SPEC to GENL?
     */
    @LispMethod(comment = "@return listp; what minimal sets of mts are associated with genls paths from SPEC to GENL?")
    public static final SubLObject min_mts_of_genls_paths_alt(SubLObject spec, SubLObject genl, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_what_mts.sbhl_min_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module($$genls), spec, genl, tv);
    }

    /**
     *
     *
     * @return listp; what minimal sets of mts are associated with genls paths from SPEC to GENL?
     */
    @LispMethod(comment = "@return listp; what minimal sets of mts are associated with genls paths from SPEC to GENL?")
    public static SubLObject min_mts_of_genls_paths(final SubLObject spec, final SubLObject genl, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_what_mts.sbhl_min_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module($$genls), spec, genl, tv);
    }

    /**
     *
     *
     * @return listp; the most genl mts by which NOT-GENL is accessible to SPEC by a false genls path. Currently this does not take disjoins into account.
     */
    @LispMethod(comment = "@return listp; the most genl mts by which NOT-GENL is accessible to SPEC by a false genls path. Currently this does not take disjoins into account.")
    public static final SubLObject max_floor_mts_of_not_genls_paths_alt(SubLObject spec, SubLObject not_genl, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_what_mts.sbhl_max_floor_mts_of_false_inverse_paths(sbhl_module_vars.get_sbhl_module($$genls), not_genl, spec, tv);
    }

    /**
     *
     *
     * @return listp; the most genl mts by which NOT-GENL is accessible to SPEC by a false genls path. Currently this does not take disjoins into account.
     */
    @LispMethod(comment = "@return listp; the most genl mts by which NOT-GENL is accessible to SPEC by a false genls path. Currently this does not take disjoins into account.")
    public static SubLObject max_floor_mts_of_not_genls_paths(final SubLObject spec, final SubLObject not_genl, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_what_mts.sbhl_max_floor_mts_of_false_inverse_paths(sbhl_module_vars.get_sbhl_module($$genls), not_genl, spec, tv);
    }

    /**
     *
     *
     * @return listp; what minimal sets of mts are associated with false-genls paths from SPEC to GENL?. Currently this does not take disjoins into account.
     */
    @LispMethod(comment = "@return listp; what minimal sets of mts are associated with false-genls paths from SPEC to GENL?. Currently this does not take disjoins into account.")
    public static final SubLObject min_mts_of_not_genls_paths_alt(SubLObject spec, SubLObject not_genl, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_what_mts.sbhl_min_mts_of_false_inverse_paths(sbhl_module_vars.get_sbhl_module($$genls), not_genl, spec, tv);
    }

    /**
     *
     *
     * @return listp; what minimal sets of mts are associated with false-genls paths from SPEC to GENL?. Currently this does not take disjoins into account.
     */
    @LispMethod(comment = "@return listp; what minimal sets of mts are associated with false-genls paths from SPEC to GENL?. Currently this does not take disjoins into account.")
    public static SubLObject min_mts_of_not_genls_paths(final SubLObject spec, final SubLObject not_genl, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_what_mts.sbhl_min_mts_of_false_inverse_paths(sbhl_module_vars.get_sbhl_module($$genls), not_genl, spec, tv);
    }

    /**
     *
     *
     * @return listp; the microtheories in which COL has genls assertions.
     */
    @LispMethod(comment = "@return listp; the microtheories in which COL has genls assertions.")
    public static final SubLObject genls_mts_alt(SubLObject col) {
        return kb_accessors.pred_mts(col, $$genls, UNPROVIDED);
    }

    /**
     *
     *
     * @return listp; the microtheories in which COL has genls assertions.
     */
    @LispMethod(comment = "@return listp; the microtheories in which COL has genls assertions.")
    public static SubLObject genls_mts(final SubLObject col) {
        return kb_accessors.pred_mts(col, $$genls, UNPROVIDED);
    }

    /**
     *
     *
     * @return booleanp; whether there are any asserted true genls links for COL.
     */
    @LispMethod(comment = "@return booleanp; whether there are any asserted true genls links for COL.")
    public static final SubLObject asserted_genlsP_alt(SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_any_asserted_true_links(sbhl_module_vars.get_sbhl_module($$genls), col, mt);
    }

    /**
     *
     *
     * @return booleanp; whether there are any asserted true genls links for COL.
     */
    @LispMethod(comment = "@return booleanp; whether there are any asserted true genls links for COL.")
    public static SubLObject asserted_genlsP(final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_any_asserted_true_links(sbhl_module_vars.get_sbhl_module($$genls), col, mt);
    }

    /**
     *
     *
     * @return listp; the asserted true genls links for COL in MT / *mt*.
     */
    @LispMethod(comment = "@return listp; the asserted true genls links for COL in MT / *mt*.")
    public static final SubLObject asserted_genls_alt(SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_true_links(sbhl_module_vars.get_sbhl_module($$genls), col, mt);
    }

    /**
     *
     *
     * @return listp; the asserted true genls links for COL in MT / *mt*.
     */
    @LispMethod(comment = "@return listp; the asserted true genls links for COL in MT / *mt*.")
    public static SubLObject asserted_genls(final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_true_links(sbhl_module_vars.get_sbhl_module($$genls), col, mt);
    }

    /**
     *
     *
     * @return listp; the asserted false genls links for COL in MT / *mt*.
     */
    @LispMethod(comment = "@return listp; the asserted false genls links for COL in MT / *mt*.")
    public static final SubLObject asserted_not_genls_alt(SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_false_links(sbhl_module_vars.get_sbhl_module($$genls), col, mt);
    }

    /**
     *
     *
     * @return listp; the asserted false genls links for COL in MT / *mt*.
     */
    @LispMethod(comment = "@return listp; the asserted false genls links for COL in MT / *mt*.")
    public static SubLObject asserted_not_genls(final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_false_links(sbhl_module_vars.get_sbhl_module($$genls), col, mt);
    }

    /**
     *
     *
     * @return listp; the supported true genls links for COL in MT / *mt*.
     */
    @LispMethod(comment = "@return listp; the supported true genls links for COL in MT / *mt*.")
    public static final SubLObject supported_genls_alt(SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_true_links(sbhl_module_vars.get_sbhl_module($$genls), col, mt);
    }

    /**
     *
     *
     * @return listp; the supported true genls links for COL in MT / *mt*.
     */
    @LispMethod(comment = "@return listp; the supported true genls links for COL in MT / *mt*.")
    public static SubLObject supported_genls(final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_true_links(sbhl_module_vars.get_sbhl_module($$genls), col, mt);
    }

    /**
     *
     *
     * @return listp; the supported false genls links for COL in MT / *mt*.
     */
    @LispMethod(comment = "@return listp; the supported false genls links for COL in MT / *mt*.")
    public static final SubLObject supported_not_genls_alt(SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_false_links(sbhl_module_vars.get_sbhl_module($$genls), col, mt);
    }

    /**
     *
     *
     * @return listp; the supported false genls links for COL in MT / *mt*.
     */
    @LispMethod(comment = "@return listp; the supported false genls links for COL in MT / *mt*.")
    public static SubLObject supported_not_genls(final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_false_links(sbhl_module_vars.get_sbhl_module($$genls), col, mt);
    }

    /**
     *
     *
     * @return listp; the asserted true specs links for COL in MT / *mt*.
     */
    @LispMethod(comment = "@return listp; the asserted true specs links for COL in MT / *mt*.")
    public static final SubLObject asserted_specs_alt(SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_true_inverse_links(sbhl_module_vars.get_sbhl_module($$genls), col, mt);
    }

    /**
     *
     *
     * @return listp; the asserted true specs links for COL in MT / *mt*.
     */
    @LispMethod(comment = "@return listp; the asserted true specs links for COL in MT / *mt*.")
    public static SubLObject asserted_specs(final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_true_inverse_links(sbhl_module_vars.get_sbhl_module($$genls), col, mt);
    }

    /**
     *
     *
     * @return listp; the asserted false specs links for COL in MT / *mt*.
     */
    @LispMethod(comment = "@return listp; the asserted false specs links for COL in MT / *mt*.")
    public static final SubLObject asserted_not_specs_alt(SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_false_inverse_links(sbhl_module_vars.get_sbhl_module($$genls), col, mt);
    }

    /**
     *
     *
     * @return listp; the asserted false specs links for COL in MT / *mt*.
     */
    @LispMethod(comment = "@return listp; the asserted false specs links for COL in MT / *mt*.")
    public static SubLObject asserted_not_specs(final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_false_inverse_links(sbhl_module_vars.get_sbhl_module($$genls), col, mt);
    }

    /**
     *
     *
     * @return listp; the supported true specs links for COL in MT / *mt*.
     */
    @LispMethod(comment = "@return listp; the supported true specs links for COL in MT / *mt*.")
    public static final SubLObject supported_specs_alt(SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_true_inverse_links(sbhl_module_vars.get_sbhl_module($$genls), col, mt);
    }

    /**
     *
     *
     * @return listp; the supported true specs links for COL in MT / *mt*.
     */
    @LispMethod(comment = "@return listp; the supported true specs links for COL in MT / *mt*.")
    public static SubLObject supported_specs(final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_true_inverse_links(sbhl_module_vars.get_sbhl_module($$genls), col, mt);
    }

    /**
     *
     *
     * @return listp; the supported false specs links for COL in MT / *mt*.
     */
    @LispMethod(comment = "@return listp; the supported false specs links for COL in MT / *mt*.")
    public static final SubLObject supported_not_specs_alt(SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_false_inverse_links(sbhl_module_vars.get_sbhl_module($$genls), col, mt);
    }

    /**
     *
     *
     * @return listp; the supported false specs links for COL in MT / *mt*.
     */
    @LispMethod(comment = "@return listp; the supported false specs links for COL in MT / *mt*.")
    public static SubLObject supported_not_specs(final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_false_inverse_links(sbhl_module_vars.get_sbhl_module($$genls), col, mt);
    }

    /**
     *
     *
     * @return booleanp; are COL1 and COL2 asserted to be coextensional.
     */
    @LispMethod(comment = "@return booleanp; are COL1 and COL2 asserted to be coextensional.")
    public static final SubLObject asserted_coextensionalP_alt(SubLObject col1, SubLObject col2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return makeBoolean((NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts($$coExtensional, col1, col2, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts($$coExtensional, col2, col1, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    /**
     *
     *
     * @return booleanp; are COL1 and COL2 asserted to be coextensional.
     */
    @LispMethod(comment = "@return booleanp; are COL1 and COL2 asserted to be coextensional.")
    public static SubLObject asserted_coextensionalP(final SubLObject col1, final SubLObject col2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return makeBoolean((NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts($$coExtensional, col1, col2, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts($$coExtensional, col2, col1, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    /**
     * Modifier. Adds sbhl links with @see sbhl-after-adding.
     */
    @LispMethod(comment = "Modifier. Adds sbhl links with @see sbhl-after-adding.")
    public static final SubLObject genls_after_adding_alt(SubLObject source, SubLObject assertion) {
        sbhl_link_methods.sbhl_after_adding(source, assertion, sbhl_module_vars.get_sbhl_module($$genls));
        sbhl_cache.sbhl_cache_addition_maintainence(assertion);
        misc_kb_utilities.possibly_clear_genl_pos(assertion);
        {
            SubLObject spec = assertions_high.gaf_arg1(assertion);
            SubLObject genl = assertions_high.gaf_arg2(assertion);
            if (NIL != assertions_high.assertion_has_truth(assertion, $TRUE)) {
                at_defns.handle_added_genl_for_suf_defns(spec, genl);
                at_defns.handle_added_genl_for_suf_quoted_defns(spec, genl);
                at_defns.handle_added_genl_for_suf_functions(spec, genl);
                cardinality_estimates.update_cardinality_estimates_wrt_genls(spec, genl);
            }
            com.cyc.cycjava.cycl.genls.handle_more_specific_genl(spec, genl);
        }
        collection_intersection.genls_collection_intersection_after_adding_int(assertion);
        after_adding_modules.clear_genls_dependent_caches(source, assertion);
        return NIL;
    }

    @LispMethod(comment = "Modifier. Adds sbhl links with @see sbhl-after-adding.")
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
    }/**
     * Modifier. Adds sbhl links with @see sbhl-after-adding.
     */


    /**
     * Modifier.  Possibly does TMS when (#$genls SPEC GENL) invalidates some other genls assertion that was deduced from an assertedMoreSpecifically rule.
     */
    @LispMethod(comment = "Modifier.  Possibly does TMS when (#$genls SPEC GENL) invalidates some other genls assertion that was deduced from an assertedMoreSpecifically rule.")
    public static final SubLObject handle_more_specific_genl_alt(SubLObject spec, SubLObject genl) {
        return NIL;
    }

    @LispMethod(comment = "Modifier.  Possibly does TMS when (#$genls SPEC GENL) invalidates some other genls assertion that was deduced from an assertedMoreSpecifically rule.")
    public static SubLObject handle_more_specific_genl(final SubLObject spec, final SubLObject genl) {
        return NIL;
    }/**
     * Modifier.  Possibly does TMS when (#$genls SPEC GENL) invalidates some other genls assertion that was deduced from an assertedMoreSpecifically rule.
     */


    /**
     *
     *
     * @return list;  The asserted genls of SPEC which are also genls of GENL.
     */
    @LispMethod(comment = "@return list;  The asserted genls of SPEC which are also genls of GENL.")
    public static final SubLObject more_general_genls_assertions_alt(SubLObject spec, SubLObject genl) {
        {
            SubLObject genls_set = set_utilities.make_set_from_list(com.cyc.cycjava.cycl.genls.all_proper_genls(genl, UNPROVIDED, UNPROVIDED), UNPROVIDED);
            SubLObject asserted_genls = kb_mapping.gather_gaf_arg_index(spec, ONE_INTEGER, $$genls, UNPROVIDED, UNPROVIDED);
            SubLObject result = NIL;
            SubLObject cdolist_list_var = asserted_genls;
            SubLObject ass = NIL;
            for (ass = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ass = cdolist_list_var.first()) {
                if (NIL != set.set_memberP(assertions_high.gaf_arg2(ass), genls_set)) {
                    result = cons(ass, result);
                }
            }
            return result;
        }
    }

    /**
     *
     *
     * @return list;  The asserted genls of SPEC which are also genls of GENL.
     */
    @LispMethod(comment = "@return list;  The asserted genls of SPEC which are also genls of GENL.")
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

    /**
     * Modifier. Removes sbhl links with @see sbhl-after-removing.
     */
    @LispMethod(comment = "Modifier. Removes sbhl links with @see sbhl-after-removing.")
    public static final SubLObject genls_after_removing_alt(SubLObject source, SubLObject assertion) {
        misc_kb_utilities.possibly_clear_genl_pos(assertion);
        sbhl_link_methods.sbhl_after_removing(source, assertion, sbhl_module_vars.get_sbhl_module($$genls));
        sbhl_cache.sbhl_cache_removal_maintainence(assertion);
        {
            SubLObject spec = assertions_high.gaf_arg1(assertion);
            SubLObject genl = assertions_high.gaf_arg2(assertion);
            if (NIL != assertions_high.assertion_has_truth(assertion, $TRUE)) {
                at_defns.handle_removed_genl_for_suf_defns(spec, genl);
                at_defns.handle_removed_genl_for_suf_quoted_defns(spec, genl);
                at_defns.handle_removed_genl_for_suf_functions(spec, genl);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Modifier. Removes sbhl links with @see sbhl-after-removing.")
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
    }/**
     * Modifier. Removes sbhl links with @see sbhl-after-removing.
     */


    public static final SubLObject clear_genls_graph_alt() {
        sbhl_link_methods.clear_sbhl_module_graph(sbhl_module_vars.get_sbhl_module($$genls));
        return NIL;
    }

    public static SubLObject clear_genls_graph() {
        sbhl_link_methods.clear_sbhl_module_graph(sbhl_module_vars.get_sbhl_module($$genls));
        return NIL;
    }

    public static final SubLObject clear_node_genls_links_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                    {
                        SubLObject cdolist_list_var = sbhl_link_methods.sbhl_link_mts(sbhl_module_vars.get_sbhl_module($$genls), node);
                        SubLObject mt = NIL;
                        for (mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt = cdolist_list_var.first()) {
                            if (NIL != fort_types_interface.collectionP(node)) {
                                sbhl_link_methods.clear_sbhl_links_within_mt(node, mt, UNPROVIDED);
                            }
                        }
                    }
                } finally {
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1, thread);
                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
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

    public static final SubLObject reset_genls_links_alt(SubLObject col) {
        {
            SubLObject mts = com.cyc.cycjava.cycl.genls.genls_mts(col);
            com.cyc.cycjava.cycl.genls.clear_node_genls_links(col);
            {
                SubLObject cdolist_list_var = mts;
                SubLObject mt = NIL;
                for (mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt = cdolist_list_var.first()) {
                    if (NIL != fort_types_interface.collectionP(col)) {
                        com.cyc.cycjava.cycl.genls.reset_genls_links_in_mt(col, mt);
                    }
                }
            }
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

    public static final SubLObject reset_genls_links_in_mt_alt(SubLObject col, SubLObject mt) {
        sbhl_link_methods.sbhl_recompute_links(col, mt, sbhl_module_vars.get_sbhl_module($$genls));
        return NIL;
    }

    public static SubLObject reset_genls_links_in_mt(final SubLObject col, final SubLObject mt) {
        sbhl_link_methods.sbhl_recompute_links(col, mt, sbhl_module_vars.get_sbhl_module($$genls));
        return NIL;
    }

    public static final SubLObject reset_genls_graph_alt(SubLObject clearP) {
        if (clearP == UNPROVIDED) {
            clearP = T;
        }
        if (NIL != clearP) {
            com.cyc.cycjava.cycl.genls.clear_genls_graph();
        }
        sbhl_link_methods.sbhl_recompute_graph_links(sbhl_module_vars.get_sbhl_module($$genls));
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
        declareFunction("genls", "GENLS", 1, 2, false);
        declareFunction("min_genls", "MIN-GENLS", 1, 2, false);
        declareFunction("nat_genls", "NAT-GENLS", 1, 2, false);
        declareFunction("nat_min_genls", "NAT-MIN-GENLS", 1, 2, false);
        declareFunction("min_genls_of_type", "MIN-GENLS-OF-TYPE", 2, 2, false);
        declareFunction("min_proper_genls_of_type", "MIN-PROPER-GENLS-OF-TYPE", 2, 2, false);
        declareFunction("naut_genls", "NAUT-GENLS", 1, 1, false);
        declareFunction("not_genls", "NOT-GENLS", 1, 2, false);
        declareFunction("max_not_genls", "MAX-NOT-GENLS", 1, 2, false);
        declareFunction("nat_not_genls", "NAT-NOT-GENLS", 1, 2, false);
        declareFunction("nat_max_not_genls", "NAT-MAX-NOT-GENLS", 1, 2, false);
        declareFunction("naut_not_genls", "NAUT-NOT-GENLS", 1, 1, false);
        declareFunction("specs", "SPECS", 1, 2, false);
        declareFunction("leaf_colP", "LEAF-COL?", 1, 2, false);
        declareFunction("max_specs", "MAX-SPECS", 1, 2, false);
        declareFunction("not_specs", "NOT-SPECS", 1, 2, false);
        declareFunction("min_not_specs", "MIN-NOT-SPECS", 1, 2, false);
        declareFunction("genl_siblings", "GENL-SIBLINGS", 1, 2, false);
        declareFunction("spec_siblings", "SPEC-SIBLINGS", 1, 2, false);
        declareFunction("all_genls", "ALL-GENLS", 1, 2, false);
        declareFunction("all_genls_in_any_mt", "ALL-GENLS-IN-ANY-MT", 1, 0, false);
        declareFunction("all_genls_in_mt", "ALL-GENLS-IN-MT", 1, 1, false);
        declareFunction("all_genls_in_mts", "ALL-GENLS-IN-MTS", 1, 1, false);
        declareFunction("nat_all_genls", "NAT-ALL-GENLS", 1, 2, false);
        declareFunction("all_proper_genls", "ALL-PROPER-GENLS", 1, 2, false);
        declareFunction("all_specs", "ALL-SPECS", 1, 2, false);
        declareFunction("all_proper_specs", "ALL-PROPER-SPECS", 1, 2, false);
        declareFunction("all_proper_specs_in_any_mt", "ALL-PROPER-SPECS-IN-ANY-MT", 1, 0, false);
        declareFunction("all_leaf_specs_in_all_mts", "ALL-LEAF-SPECS-IN-ALL-MTS", 1, 0, false);
        declareFunction("all_specs_with_max", "ALL-SPECS-WITH-MAX", 2, 0, false);
        declareFunction("all_specs_in_all_mts", "ALL-SPECS-IN-ALL-MTS", 1, 2, false);
        declareFunction("count_all_specs", "COUNT-ALL-SPECS", 1, 2, false);
        declareFunction("count_all_specs_if", "COUNT-ALL-SPECS-IF", 2, 2, false);
        declareFunction("count_all_specs_E", "COUNT-ALL-SPECS-=", 2, 2, false);
        declareFunction("count_all_specs_G", "COUNT-ALL-SPECS->", 2, 2, false);
        declareFunction("count_all_specs_GE", "COUNT-ALL-SPECS->=", 2, 2, false);
        declareFunction("count_all_specs_L", "COUNT-ALL-SPECS-<", 2, 2, false);
        declareFunction("count_all_specs_LE", "COUNT-ALL-SPECS-<=", 2, 2, false);
        declareFunction("all_genls_wrt", "ALL-GENLS-WRT", 2, 2, false);
        declareFunction("union_all_genls", "UNION-ALL-GENLS", 1, 2, false);
        declareFunction("union_min_genls_of_type", "UNION-MIN-GENLS-OF-TYPE", 2, 2, false);
        declareFunction("union_all_genls_among", "UNION-ALL-GENLS-AMONG", 2, 2, false);
        declareFunction("all_genl_of_someP", "ALL-GENL-OF-SOME?", 2, 2, false);
        declareFunction("union_all_specs", "UNION-ALL-SPECS", 1, 2, false);
        declareFunction("union_all_specs_count", "UNION-ALL-SPECS-COUNT", 1, 2, false);
        declareFunction("max_cols_beneath", "MAX-COLS-BENEATH", 2, 1, false);
        declareFunction("all_dependent_specs", "ALL-DEPENDENT-SPECS", 1, 2, false);
        declareFunction("min_genls_among", "MIN-GENLS-AMONG", 2, 2, false);
        declareFunction("all_genls_among", "ALL-GENLS-AMONG", 2, 2, false);
        declareFunction("all_specs_among", "ALL-SPECS-AMONG", 2, 2, false);
        declareFunction("max_specs_among", "MAX-SPECS-AMONG", 2, 2, false);
        declareFunction("all_genls_if", "ALL-GENLS-IF", 2, 2, false);
        declareFunction("all_specs_if", "ALL-SPECS-IF", 2, 2, false);
        declareFunction("all_genls_if_with_pruning", "ALL-GENLS-IF-WITH-PRUNING", 2, 2, false);
        declareFunction("all_not_genls", "ALL-NOT-GENLS", 1, 2, false);
        declareFunction("all_not_specs", "ALL-NOT-SPECS", 1, 2, false);
        declareFunction("cols_awning", "COLS-AWNING", 2, 2, false);
        declareFunction("map_all_genls", "MAP-ALL-GENLS", 2, 2, false);
        declareFunction("map_all_specs", "MAP-ALL-SPECS", 2, 2, false);
        declareFunction("map_union_all_genls", "MAP-UNION-ALL-GENLS", 2, 2, false);
        declareFunction("map_all_genls_if", "MAP-ALL-GENLS-IF", 3, 2, false);
        declareFunction("gather_all_genls", "GATHER-ALL-GENLS", 2, 3, false);
        declareFunction("gather_all_specs", "GATHER-ALL-SPECS", 2, 3, false);
        declareFunction("any_all_genls", "ANY-ALL-GENLS", 2, 2, false);
        declareFunction("any_all_specs", "ANY-ALL-SPECS", 2, 2, false);
        declareFunction("sample_leaf_specs", "SAMPLE-LEAF-SPECS", 1, 3, false);
        declareFunction("sample_different_leaf_specs", "SAMPLE-DIFFERENT-LEAF-SPECS", 2, 3, false);
        declareFunction("genlP", "GENL?", 2, 2, false);
        declareFunction("genlsP", "GENLS?", 2, 2, false);
        declareFunction("genl_in_mtsP", "GENL-IN-MTS?", 2, 1, false);
        declareFunction("genl_in_any_mtP", "GENL-IN-ANY-MT?", 2, 0, false);
        declareFunction("specP", "SPEC?", 2, 2, false);
        declareFunction("nat_genlP", "NAT-GENL?", 2, 1, false);
        declareFunction("naut_genlP", "NAUT-GENL?", 2, 1, false);
        declareFunction("result_genl_colP", "RESULT-GENL-COL?", 2, 1, false);
        declareFunction("result_genl_arg_colP", "RESULT-GENL-ARG-COL?", 2, 1, false);
        declareFunction("result_genl_inter_arg_colP", "RESULT-GENL-INTER-ARG-COL?", 2, 1, false);
        declareFunction("result_genl_via_pgiaP", "RESULT-GENL-VIA-PGIA?", 2, 1, false);
        declareFunction("genl_ofP", "GENL-OF?", 2, 2, false);
        declareFunction("any_genlP", "ANY-GENL?", 2, 2, false);
        declareFunction("any_specP", "ANY-SPEC?", 2, 2, false);
        declareFunction("all_genlP", "ALL-GENL?", 2, 2, false);
        declareFunction("all_specP", "ALL-SPEC?", 2, 2, false);
        declareFunction("any_genl_anyP", "ANY-GENL-ANY?", 2, 2, false);
        declareFunction("any_genl_allP", "ANY-GENL-ALL?", 2, 2, false);
        declareFunction("all_spec_anyP", "ALL-SPEC-ANY?", 2, 2, false);
        declareFunction("not_genlsP", "NOT-GENLS?", 2, 2, false);
        declareFunction("not_genlP", "NOT-GENL?", 2, 2, false);
        declareFunction("argue_not_genlP", "ARGUE-NOT-GENL?", 2, 2, false);
        declareFunction("all_not_specP", "ALL-NOT-SPEC?", 2, 2, false);
        declareFunction("any_not_genlP", "ANY-NOT-GENL?", 2, 2, false);
        declareFunction("random_genl_of", "RANDOM-GENL-OF", 1, 1, false);
        declareFunction("random_spec_of", "RANDOM-SPEC-OF", 1, 1, false);
        declareFunction("collections_coextensionalP", "COLLECTIONS-COEXTENSIONAL?", 2, 1, false);
        declareFunction("tacit_coextensionalP", "TACIT-COEXTENSIONAL?", 2, 1, false);
        declareFunction("common_instanceP", "COMMON-INSTANCE?", 2, 1, false);
        declareFunction("why_common_instanceP", "WHY-COMMON-INSTANCE?", 2, 3, false);
        declareFunction("collections_intersectP", "COLLECTIONS-INTERSECT?", 2, 1, false);
        declareFunction("hierarchical_collectionsP", "HIERARCHICAL-COLLECTIONS?", 2, 1, false);
        declareFunction("genl_of_any_argP", "GENL-OF-ANY-ARG?", 3, 4, false);
        declareFunction("genl_of_any_argP_int", "GENL-OF-ANY-ARG?-INT", 7, 0, false);
        declareFunction("why_genlP", "WHY-GENL?", 2, 3, false);
        declareFunction("any_just_of_nat_genl", "ANY-JUST-OF-NAT-GENL", 2, 1, false);
        declareFunction("why_not_genlP", "WHY-NOT-GENL?", 2, 3, false);
        declareFunction("why_not_assert_genlsP", "WHY-NOT-ASSERT-GENLS?", 2, 1, false);
        declareFunction("why_collections_intersectP", "WHY-COLLECTIONS-INTERSECT?", 2, 3, false);
        declareFunction("why_not_assert_mdwP", "WHY-NOT-ASSERT-MDW?", 2, 1, false);
        declareFunction("collection_leaves", "COLLECTION-LEAVES", 1, 2, false);
        declareFunction("min_cols", "MIN-COLS", 1, 2, false);
        declareFunction("min_col", "MIN-COL", 1, 2, false);
        declareFunction("max_cols", "MAX-COLS", 1, 2, false);
        declareFunction("nearest_common_genls", "NEAREST-COMMON-GENLS", 1, 3, false);
        declareFunction("min_ceiling_cols", "MIN-CEILING-COLS", 1, 3, false);
        declareFunction("nearest_common_specs", "NEAREST-COMMON-SPECS", 1, 3, false);
        declareFunction("max_floor_cols", "MAX-FLOOR-COLS", 1, 3, false);
        declareFunction("floor_of_col_pairP", "FLOOR-OF-COL-PAIR?", 2, 1, false);
        declareFunction("any_floor_of_col_pair", "ANY-FLOOR-OF-COL-PAIR", 2, 2, false);
        declareFunction("all_common_specs", "ALL-COMMON-SPECS", 1, 2, false);
        declareFunction("any_genl_isa", "ANY-GENL-ISA", 2, 2, false);
        declareFunction("lighter_col", "LIGHTER-COL", 2, 0, false);
        declareFunction("lightest_col", "LIGHTEST-COL", 2, 0, false);
        declareFunction("lightest_of_cols", "LIGHTEST-OF-COLS", 1, 0, false);
        declareFunction("shallower_col", "SHALLOWER-COL", 2, 0, false);
        declareFunction("shallowest_col", "SHALLOWEST-COL", 2, 0, false);
        declareFunction("max_floor_mts_of_genls_paths_wrt", "MAX-FLOOR-MTS-OF-GENLS-PATHS-WRT", 3, 0, false);
        declareFunction("max_floor_mts_of_genls_paths", "MAX-FLOOR-MTS-OF-GENLS-PATHS", 2, 1, false);
        declareFunction("max_floor_mts_of_nat_genls_paths", "MAX-FLOOR-MTS-OF-NAT-GENLS-PATHS", 2, 1, false);
        declareFunction("min_mts_of_genls_paths", "MIN-MTS-OF-GENLS-PATHS", 2, 1, false);
        declareFunction("max_floor_mts_of_not_genls_paths", "MAX-FLOOR-MTS-OF-NOT-GENLS-PATHS", 2, 1, false);
        declareFunction("min_mts_of_not_genls_paths", "MIN-MTS-OF-NOT-GENLS-PATHS", 2, 1, false);
        declareFunction("genls_mts", "GENLS-MTS", 1, 0, false);
        declareFunction("asserted_genlsP", "ASSERTED-GENLS?", 1, 1, false);
        declareFunction("asserted_genls", "ASSERTED-GENLS", 1, 1, false);
        declareFunction("asserted_not_genls", "ASSERTED-NOT-GENLS", 1, 1, false);
        declareFunction("supported_genls", "SUPPORTED-GENLS", 1, 1, false);
        declareFunction("supported_not_genls", "SUPPORTED-NOT-GENLS", 1, 1, false);
        declareFunction("asserted_specs", "ASSERTED-SPECS", 1, 1, false);
        declareFunction("asserted_not_specs", "ASSERTED-NOT-SPECS", 1, 1, false);
        declareFunction("supported_specs", "SUPPORTED-SPECS", 1, 1, false);
        declareFunction("supported_not_specs", "SUPPORTED-NOT-SPECS", 1, 1, false);
        declareFunction("asserted_coextensionalP", "ASSERTED-COEXTENSIONAL?", 2, 1, false);
        declareFunction("genls_after_adding", "GENLS-AFTER-ADDING", 2, 0, false);
        declareFunction("handle_more_specific_genl", "HANDLE-MORE-SPECIFIC-GENL", 2, 0, false);
        declareFunction("more_general_genls_assertions", "MORE-GENERAL-GENLS-ASSERTIONS", 2, 0, false);
        declareFunction("genls_after_removing", "GENLS-AFTER-REMOVING", 2, 0, false);
        declareFunction("clear_genls_graph", "CLEAR-GENLS-GRAPH", 0, 0, false);
        declareFunction("clear_node_genls_links", "CLEAR-NODE-GENLS-LINKS", 1, 0, false);
        declareFunction("reset_genls_links", "RESET-GENLS-LINKS", 1, 0, false);
        declareFunction("reset_genls_links_in_mt", "RESET-GENLS-LINKS-IN-MT", 2, 0, false);
        declareFunction("reset_genls_graph", "RESET-GENLS-GRAPH", 0, 1, false);
        return NIL;
    }

    public static SubLObject init_genls_file() {
        defvar("*SBHL-INFER-INTERSECTION-FROM-INSTANCES?*", NIL);
        return NIL;
    }

    public static final SubLObject setup_genls_file_alt() {
        register_cyc_api_function(MIN_GENLS, $list_alt2, $str_alt3$Returns_the_most_specific_genls_o, NIL, $list_alt4);
        register_cyc_api_function(MAX_NOT_GENLS, $list_alt2, $str_alt7$Returns_the_least_specific_negate, $list_alt8, $list_alt4);
        register_cyc_api_function(MAX_SPECS, $list_alt2, $str_alt11$Returns_the_least_specific_specs_, $list_alt8, $list_alt4);
        register_cyc_api_function(MIN_NOT_SPECS, $list_alt2, $str_alt13$Returns_the_most_specific_negated, $list_alt8, $list_alt4);
        register_cyc_api_function(GENL_SIBLINGS, $list_alt2, $str_alt15$Returns_the_direct_genls_of_those, $list_alt8, $list_alt4);
        register_cyc_api_function(SPEC_SIBLINGS, $list_alt2, $str_alt17$Returns_the_direct_specs_of_those, $list_alt8, $list_alt4);
        register_cyc_api_function(ALL_GENLS, $list_alt2, $str_alt19$Returns_all_genls_of_collection_C, $list_alt8, $list_alt4);
        register_cyc_api_function(ALL_SPECS, $list_alt2, $str_alt25$Returns_all_specs_of_collection_C, $list_alt8, $list_alt4);
        register_external_symbol(ALL_SPECS_WITH_MAX);
        register_cyc_api_function(COUNT_ALL_SPECS, $list_alt44, $str_alt45$Counts_the_number_of_specs_in_COL, $list_alt46, $list_alt47);
        register_cyc_api_function(ALL_GENLS_WRT, $list_alt49, $str_alt50$Returns_all_genls_of_collection_S, $list_alt51, $list_alt4);
        register_cyc_api_function(UNION_ALL_GENLS, $list_alt54, $str_alt55$Returns_all_genls_of_each_collect, $list_alt56, $list_alt4);
        register_cyc_api_function(UNION_ALL_SPECS, $list_alt54, $str_alt58$Returns_all_specs_of_each_collect, $list_alt56, $list_alt4);
        register_cyc_api_function(ALL_DEPENDENT_SPECS, $list_alt2, $str_alt60$Returns_all_specs_s_of_COL_s_t__e, $list_alt8, $list_alt4);
        register_cyc_api_function(ALL_GENLS_AMONG, $list_alt62, $str_alt63$Returns_those_genls_of_COL_that_a, $list_alt64, $list_alt4);
        register_cyc_api_function(ALL_SPECS_AMONG, $list_alt62, $str_alt66$Returns_those_specs_of_COL_that_a, $list_alt64, $list_alt4);
        register_cyc_api_function(ALL_GENLS_IF, $list_alt69, $str_alt70$Returns_all_genls_of_collection_C, $list_alt71, $list_alt4);
        register_cyc_api_function(ALL_SPECS_IF, $list_alt69, $str_alt70$Returns_all_genls_of_collection_C, $list_alt71, $list_alt4);
        register_cyc_api_function(ALL_NOT_GENLS, $list_alt2, $str_alt74$Returns_all_negated_genls_of_coll, $list_alt8, $list_alt4);
        register_cyc_api_function(ALL_NOT_SPECS, $list_alt2, $str_alt76$Returns_all_negated_specs_of_coll, $list_alt8, $list_alt4);
        register_cyc_api_function(MAP_ALL_GENLS, $list_alt78, $str_alt79$Applies_FN_to_every__all__genls_o, $list_alt80, NIL);
        register_cyc_api_function(MAP_ALL_SPECS, $list_alt78, $str_alt82$Applies_FN_to_every__all__specs_o, $list_alt80, NIL);
        register_cyc_api_function(ANY_ALL_GENLS, $list_alt78, $str_alt84$Return_a_non_nil_result_of_applyi, $list_alt80, NIL);
        register_cyc_api_function(ANY_ALL_SPECS, $list_alt78, $str_alt86$Return_a_non_nil_result_of_applyi, $list_alt80, NIL);
        register_cyc_api_function($sym87$GENL_, $list_alt49, $str_alt88$Returns_whether____genls_SPEC_GEN, $list_alt51, $list_alt89);
        register_cyc_api_function($sym90$SPEC_, $list_alt91, $str_alt88$Returns_whether____genls_SPEC_GEN, $list_alt92, $list_alt89);
        register_cyc_api_function($sym94$ANY_GENL_, $list_alt95, $str_alt96$_any_genl__spec_genls__is_t_iff__, $list_alt97, $list_alt89);
        register_cyc_api_function($sym98$ANY_SPEC_, $list_alt99, $str_alt100$Returns_T_iff__spec__genl_spec__f, $list_alt101, $list_alt89);
        register_cyc_api_function($sym102$ALL_GENL_, $list_alt95, $str_alt103$Returns_T_iff__genl__spec_genl__f, $list_alt97, $list_alt89);
        register_cyc_api_function($sym104$ALL_SPEC_, $list_alt99, $str_alt105$Returns_T_iff__spec__genl_spec__f, $list_alt101, $list_alt89);
        register_cyc_api_function($sym106$ANY_GENL_ANY_, $list_alt107, $str_alt108$Return_T_iff__genl__spec_genl_mt_, $list_alt109, $list_alt89);
        register_cyc_api_function($sym110$ANY_GENL_ALL_, $list_alt107, $str_alt111$Return_T_iff__genl__spec_genl_mt_, $list_alt109, $list_alt89);
        register_cyc_api_function($sym112$ALL_SPEC_ANY_, $list_alt107, $str_alt113$Return_T_iff_for_each_spec_in_SPE, $list_alt109, $list_alt89);
        register_cyc_api_function($sym114$NOT_GENL_, $list_alt115, $str_alt116$Return_whether_collection_NOT_GEN, $list_alt117, $list_alt89);
        register_cyc_api_function($sym118$ALL_NOT_SPEC_, $list_alt119, $str_alt120$Return_whether_every_collection_i, $list_alt121, $list_alt89);
        register_cyc_api_function($sym122$ANY_NOT_GENL_, $list_alt123, $str_alt124$Returns_whether_any_collection_in, $list_alt125, $list_alt89);
        register_cyc_api_function($sym128$COLLECTIONS_COEXTENSIONAL_, $list_alt129, $str_alt130$Are_COL_1_and_COL_2_coextensional, $list_alt131, $list_alt89);
        register_cyc_api_function($sym132$COLLECTIONS_INTERSECT_, $list_alt129, $str_alt133$Do_collections_COL_1_and_COL_2_in, $list_alt131, $list_alt89);
        register_cyc_api_function($sym136$WHY_GENL_, $list_alt137, $str_alt138$Justification_of__genls_SPEC_GENL, $list_alt51, $list_alt139);
        register_cyc_api_function($sym146$WHY_NOT_GENL_, $list_alt137, $str_alt147$Justification_of__not__genls_SPEC, $list_alt51, $list_alt139);
        register_cyc_api_function($sym148$WHY_NOT_ASSERT_GENLS_, $list_alt149, $str_alt150$Justification_of_why_asserting__g, $list_alt51, $list_alt139);
        register_cyc_api_function(COLLECTION_LEAVES, $list_alt2, $str_alt152$Returns_the_minimally_general__th, $list_alt8, $list_alt4);
        register_cyc_api_function(MIN_COLS, $list_alt54, $str_alt155$Returns_the_minimally_general__th, $list_alt156, $list_alt4);
        register_cyc_api_function(MIN_COL, $list_alt54, $str_alt158$Returns_the_single_minimally_gene, $list_alt56, $list_alt159);
        register_cyc_api_function(MAX_COLS, $list_alt54, $str_alt161$Returns_the_most_general_among_re, $list_alt56, $list_alt4);
        register_cyc_api_function(MIN_CEILING_COLS, $list_alt163, $str_alt164$Returns_the_most_specific_common_, $list_alt56, $list_alt4);
        register_cyc_api_function(MAX_FLOOR_COLS, $list_alt163, $str_alt166$Returns_the_most_general_common_s, $list_alt56, $list_alt4);
        register_cyc_api_function(ANY_GENL_ISA, $list_alt168, $str_alt169$Return_some_genl_of_COL_that_isa_, $list_alt170, $list_alt159);
        register_cyc_api_function(LIGHTER_COL, $list_alt172, $str_alt173$Return_COL_B_iff_it_has_fewer_spe, $list_alt174, $list_alt159);
        register_cyc_api_function(LIGHTEST_OF_COLS, $list_alt176, $str_alt177$Return_the_collection_having_the_, $list_alt56, $list_alt159);
        register_cyc_api_function(SHALLOWER_COL, $list_alt172, $str_alt179$Return_COL_B_iff_it_has_fewer_gen, $list_alt174, $list_alt159);
        register_cyc_api_function(MAX_FLOOR_MTS_OF_GENLS_PATHS, $list_alt181, $str_alt182$_return_listp__Returns_in_what__m, $list_alt51, NIL);
        register_kb_function(GENLS_AFTER_ADDING);
        register_kb_function(GENLS_AFTER_REMOVING);
        define_test_case_table_int(UNION_ALL_GENLS, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$kknight, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt193);
        define_test_case_table_int(UNION_ALL_SPECS, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$kknight, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt195);
        define_test_case_table_int(MAX_COLS_BENEATH, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$kknight, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt197);
        define_test_case_table_int(ALL_GENLS_AMONG, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$kknight, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt198);
        define_test_case_table_int(ALL_SPECS_AMONG, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$kknight, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt199);
        define_test_case_table_int($sym94$ANY_GENL_, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$kknight, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt200);
        define_test_case_table_int($sym98$ANY_SPEC_, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$kknight, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt201);
        define_test_case_table_int($sym102$ALL_GENL_, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$kknight, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt202);
        define_test_case_table_int($sym106$ANY_GENL_ANY_, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$kknight, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt203);
        define_test_case_table_int($sym110$ANY_GENL_ALL_, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$kknight, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt204);
        define_test_case_table_int($sym118$ALL_NOT_SPEC_, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$kknight, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt205);
        define_test_case_table_int($sym104$ALL_SPEC_, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$kknight, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt206);
        define_test_case_table_int($sym122$ANY_NOT_GENL_, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$kknight, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt207);
        define_test_case_table_int($sym208$ALL_GENL_OF_SOME_, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$pace, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt210);
        return NIL;
    }

    public static SubLObject setup_genls_file() {
        if (SubLFiles.USE_V1) {
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
        }
        if (SubLFiles.USE_V2) {
            register_cyc_api_function(COUNT_ALL_SPECS, $list_alt44, $str_alt45$Counts_the_number_of_specs_in_COL, $list_alt46, $list_alt47);
            register_cyc_api_function(ALL_GENLS_WRT, $list_alt49, $str_alt50$Returns_all_genls_of_collection_S, $list_alt51, $list_alt4);
            register_cyc_api_function(UNION_ALL_GENLS, $list_alt54, $str_alt55$Returns_all_genls_of_each_collect, $list_alt56, $list_alt4);
            register_cyc_api_function(UNION_ALL_SPECS, $list_alt54, $str_alt58$Returns_all_specs_of_each_collect, $list_alt56, $list_alt4);
            register_cyc_api_function(ALL_DEPENDENT_SPECS, $list_alt2, $str_alt60$Returns_all_specs_s_of_COL_s_t__e, $list_alt8, $list_alt4);
            register_cyc_api_function(ALL_GENLS_AMONG, $list_alt62, $str_alt63$Returns_those_genls_of_COL_that_a, $list_alt64, $list_alt4);
            register_cyc_api_function(ALL_SPECS_AMONG, $list_alt62, $str_alt66$Returns_those_specs_of_COL_that_a, $list_alt64, $list_alt4);
            register_cyc_api_function(ALL_GENLS_IF, $list_alt69, $str_alt70$Returns_all_genls_of_collection_C, $list_alt71, $list_alt4);
            register_cyc_api_function(ALL_SPECS_IF, $list_alt69, $str_alt70$Returns_all_genls_of_collection_C, $list_alt71, $list_alt4);
            register_cyc_api_function(ALL_NOT_GENLS, $list_alt2, $str_alt74$Returns_all_negated_genls_of_coll, $list_alt8, $list_alt4);
            register_cyc_api_function(ALL_NOT_SPECS, $list_alt2, $str_alt76$Returns_all_negated_specs_of_coll, $list_alt8, $list_alt4);
            register_cyc_api_function(MAP_ALL_GENLS, $list_alt78, $str_alt79$Applies_FN_to_every__all__genls_o, $list_alt80, NIL);
            register_cyc_api_function(MAP_ALL_SPECS, $list_alt78, $str_alt82$Applies_FN_to_every__all__specs_o, $list_alt80, NIL);
            register_cyc_api_function(ANY_ALL_GENLS, $list_alt78, $str_alt84$Return_a_non_nil_result_of_applyi, $list_alt80, NIL);
            register_cyc_api_function(ANY_ALL_SPECS, $list_alt78, $str_alt86$Return_a_non_nil_result_of_applyi, $list_alt80, NIL);
            register_cyc_api_function($sym87$GENL_, $list_alt49, $str_alt88$Returns_whether____genls_SPEC_GEN, $list_alt51, $list_alt89);
            register_cyc_api_function($sym90$SPEC_, $list_alt91, $str_alt88$Returns_whether____genls_SPEC_GEN, $list_alt92, $list_alt89);
            register_cyc_api_function($sym94$ANY_GENL_, $list_alt95, $str_alt96$_any_genl__spec_genls__is_t_iff__, $list_alt97, $list_alt89);
            register_cyc_api_function($sym98$ANY_SPEC_, $list_alt99, $str_alt100$Returns_T_iff__spec__genl_spec__f, $list_alt101, $list_alt89);
            register_cyc_api_function($sym102$ALL_GENL_, $list_alt95, $str_alt103$Returns_T_iff__genl__spec_genl__f, $list_alt97, $list_alt89);
            register_cyc_api_function($sym104$ALL_SPEC_, $list_alt99, $str_alt105$Returns_T_iff__spec__genl_spec__f, $list_alt101, $list_alt89);
            register_cyc_api_function($sym106$ANY_GENL_ANY_, $list_alt107, $str_alt108$Return_T_iff__genl__spec_genl_mt_, $list_alt109, $list_alt89);
            register_cyc_api_function($sym110$ANY_GENL_ALL_, $list_alt107, $str_alt111$Return_T_iff__genl__spec_genl_mt_, $list_alt109, $list_alt89);
            register_cyc_api_function($sym112$ALL_SPEC_ANY_, $list_alt107, $str_alt113$Return_T_iff_for_each_spec_in_SPE, $list_alt109, $list_alt89);
            register_cyc_api_function($sym114$NOT_GENL_, $list_alt115, $str_alt116$Return_whether_collection_NOT_GEN, $list_alt117, $list_alt89);
            register_cyc_api_function($sym118$ALL_NOT_SPEC_, $list_alt119, $str_alt120$Return_whether_every_collection_i, $list_alt121, $list_alt89);
            register_cyc_api_function($sym122$ANY_NOT_GENL_, $list_alt123, $str_alt124$Returns_whether_any_collection_in, $list_alt125, $list_alt89);
            register_cyc_api_function($sym128$COLLECTIONS_COEXTENSIONAL_, $list_alt129, $str_alt130$Are_COL_1_and_COL_2_coextensional, $list_alt131, $list_alt89);
            register_cyc_api_function($sym132$COLLECTIONS_INTERSECT_, $list_alt129, $str_alt133$Do_collections_COL_1_and_COL_2_in, $list_alt131, $list_alt89);
            register_cyc_api_function($sym136$WHY_GENL_, $list_alt137, $str_alt138$Justification_of__genls_SPEC_GENL, $list_alt51, $list_alt139);
            register_cyc_api_function($sym146$WHY_NOT_GENL_, $list_alt137, $str_alt147$Justification_of__not__genls_SPEC, $list_alt51, $list_alt139);
            register_cyc_api_function($sym148$WHY_NOT_ASSERT_GENLS_, $list_alt149, $str_alt150$Justification_of_why_asserting__g, $list_alt51, $list_alt139);
            register_cyc_api_function(COLLECTION_LEAVES, $list_alt2, $str_alt152$Returns_the_minimally_general__th, $list_alt8, $list_alt4);
            register_cyc_api_function(MIN_COLS, $list_alt54, $str_alt155$Returns_the_minimally_general__th, $list_alt156, $list_alt4);
            register_cyc_api_function(MIN_COL, $list_alt54, $str_alt158$Returns_the_single_minimally_gene, $list_alt56, $list_alt159);
            register_cyc_api_function(MAX_COLS, $list_alt54, $str_alt161$Returns_the_most_general_among_re, $list_alt56, $list_alt4);
            register_cyc_api_function(MIN_CEILING_COLS, $list_alt163, $str_alt164$Returns_the_most_specific_common_, $list_alt56, $list_alt4);
            register_cyc_api_function(MAX_FLOOR_COLS, $list_alt163, $str_alt166$Returns_the_most_general_common_s, $list_alt56, $list_alt4);
            register_cyc_api_function(LIGHTEST_OF_COLS, $list_alt176, $str_alt177$Return_the_collection_having_the_, $list_alt56, $list_alt159);
            register_cyc_api_function(MAX_FLOOR_MTS_OF_GENLS_PATHS, $list_alt181, $str_alt182$_return_listp__Returns_in_what__m, $list_alt51, NIL);
            define_test_case_table_int(UNION_ALL_GENLS, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$kknight, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt193);
            define_test_case_table_int(UNION_ALL_SPECS, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$kknight, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt195);
            define_test_case_table_int(MAX_COLS_BENEATH, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$kknight, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt197);
            define_test_case_table_int(ALL_GENLS_AMONG, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$kknight, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt198);
            define_test_case_table_int(ALL_SPECS_AMONG, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$kknight, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt199);
            define_test_case_table_int($sym94$ANY_GENL_, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$kknight, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt200);
            define_test_case_table_int($sym98$ANY_SPEC_, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$kknight, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt201);
            define_test_case_table_int($sym102$ALL_GENL_, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$kknight, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt202);
            define_test_case_table_int($sym106$ANY_GENL_ANY_, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$kknight, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt203);
            define_test_case_table_int($sym110$ANY_GENL_ALL_, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$kknight, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt204);
            define_test_case_table_int($sym118$ALL_NOT_SPEC_, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$kknight, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt205);
            define_test_case_table_int($sym104$ALL_SPEC_, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$kknight, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt206);
            define_test_case_table_int($sym122$ANY_NOT_GENL_, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$kknight, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt207);
            define_test_case_table_int($sym208$ALL_GENL_OF_SOME_, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$pace, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt210);
        }
        return NIL;
    }

    public static SubLObject setup_genls_file_Previous() {
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

    static {
    }

    static private final SubLList $list_alt2 = list(makeSymbol("COL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    static private final SubLString $str_alt3$Returns_the_most_specific_genls_o = makeString("Returns the most-specific genls of collection COL");

    static private final SubLList $list_alt4 = list(list(makeSymbol("LIST"), makeSymbol("FORT-P")));

    static private final SubLString $str_alt7$Returns_the_least_specific_negate = makeString("Returns the least-specific negated genls of collection COL");

    static private final SubLList $list_alt8 = list(list(makeSymbol("COL"), makeSymbol("EL-FORT-P")));

    static private final SubLString $str_alt11$Returns_the_least_specific_specs_ = makeString("Returns the least-specific specs of collection COL");

    static private final SubLString $str_alt13$Returns_the_most_specific_negated = makeString("Returns the most-specific negated specs of collection COL");

    static private final SubLString $str_alt15$Returns_the_direct_genls_of_those = makeString("Returns the direct genls of those direct spec collections of COL");

    static private final SubLString $str_alt17$Returns_the_direct_specs_of_those = makeString("Returns the direct specs of those direct genls collections of COL");

    static private final SubLString $str_alt19$Returns_all_genls_of_collection_C = makeString("Returns all genls of collection COL\n   (ascending transitive closure; inexpensive)");

    static private final SubLString $str_alt25$Returns_all_specs_of_collection_C = makeString("Returns all specs of collection COL \n   (descending transitive closure; expensive)");

    static private final SubLString $str_alt32$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $str_alt37$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    static private final SubLString $str_alt38$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    static private final SubLString $str_alt39$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    static private final SubLList $list_alt44 = list(makeSymbol("COLLECTION"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    static private final SubLString $str_alt45$Counts_the_number_of_specs_in_COL = makeString("Counts the number of specs in COLLECTION and then returns the count.");

    static private final SubLList $list_alt46 = list(list(makeSymbol("COLLECTION"), makeSymbol("EL-FORT-P")));

    static private final SubLList $list_alt47 = list(makeSymbol("INTEGERP"));

    static private final SubLList $list_alt49 = list(makeSymbol("SPEC"), makeSymbol("GENL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    static private final SubLString $str_alt50$Returns_all_genls_of_collection_S = makeString("Returns all genls of collection SPEC that are also specs of collection GENL (ascending transitive closure; inexpensive)");

    static private final SubLList $list_alt51 = list(list(makeSymbol("SPEC"), makeSymbol("EL-FORT-P")), list(makeSymbol("GENL"), makeSymbol("EL-FORT-P")));

    static private final SubLList $list_alt54 = list(makeSymbol("COLS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    static private final SubLString $str_alt55$Returns_all_genls_of_each_collect = makeString("Returns all genls of each collection in COLs");

    static private final SubLList $list_alt56 = list(list(makeSymbol("COLS"), makeSymbol("LISTP")));

    static private final SubLString $str_alt58$Returns_all_specs_of_each_collect = makeString("Returns all specs of each collection in COLs");

    static private final SubLString $str_alt60$Returns_all_specs_s_of_COL_s_t__e = makeString("Returns all specs s of COL s.t. every path connecting\n   s to any genl of COL must pass through COL");

    static private final SubLList $list_alt62 = list(makeSymbol("COL"), makeSymbol("CANDIDATES"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    static private final SubLString $str_alt63$Returns_those_genls_of_COL_that_a = makeString("Returns those genls of COL that are included among CANDIDATES");

    static private final SubLList $list_alt64 = list(list(makeSymbol("COL"), makeSymbol("EL-FORT-P")), list(makeSymbol("CANDIDATES"), makeSymbol("LISTP")));

    static private final SubLString $str_alt66$Returns_those_specs_of_COL_that_a = makeString("Returns those specs of COL that are included among CANDIDATEs");

    static private final SubLList $list_alt69 = list(makeSymbol("FUNCTION"), makeSymbol("COL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    static private final SubLString $str_alt70$Returns_all_genls_of_collection_C = makeString("Returns all genls of collection COL that satisfy FUNCTION\n   (FUNCTION must not effect sbhl search state)");

    static private final SubLList $list_alt71 = list(list(makeSymbol("FUNCTION"), makeSymbol("FUNCTION-SPEC-P")), list(makeSymbol("COL"), makeSymbol("EL-FORT-P")));

    static private final SubLString $str_alt74$Returns_all_negated_genls_of_coll = makeString("Returns all negated genls of collection COL \n   (descending transitive closure; expensive)");

    static private final SubLString $str_alt76$Returns_all_negated_specs_of_coll = makeString("Returns all negated specs of collection COL \n   (ascending transitive closure; inexpensive)");

    static private final SubLList $list_alt78 = list(makeSymbol("FN"), makeSymbol("COL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    static private final SubLString $str_alt79$Applies_FN_to_every__all__genls_o = makeString("Applies FN to every (all) genls of COL\n   (FN must not effect the current sbhl space)");

    static private final SubLList $list_alt80 = list(list(makeSymbol("FN"), makeSymbol("FUNCTION-SPEC-P")), list(makeSymbol("COL"), makeSymbol("EL-FORT-P")));

    static private final SubLString $str_alt82$Applies_FN_to_every__all__specs_o = makeString("Applies FN to every (all) specs of COL\n   (FN must not effect the current sbhl space)");

    static private final SubLString $str_alt84$Return_a_non_nil_result_of_applyi = makeString("Return a non-nil result of applying FN to some all-genl of COL\n   (FN must not effect the current sbhl space)");

    static private final SubLString $str_alt86$Return_a_non_nil_result_of_applyi = makeString("Return a non-nil result of applying FN to some all-spec of COL\n   (FN must not effect the current sbhl space)");

    static private final SubLSymbol $sym87$GENL_ = makeSymbol("GENL?");

    static private final SubLString $str_alt88$Returns_whether____genls_SPEC_GEN = makeString("Returns whether (#$genls SPEC GENL) can be inferred.\n   (ascending transitive search; inexpensive)");

    static private final SubLList $list_alt89 = list(makeSymbol("BOOLEANP"));

    static private final SubLSymbol $sym90$SPEC_ = makeSymbol("SPEC?");

    static private final SubLList $list_alt91 = list(makeSymbol("GENL"), makeSymbol("SPEC"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    static private final SubLList $list_alt92 = list(list(makeSymbol("GENL"), makeSymbol("EL-FORT-P")), list(makeSymbol("SPEC"), makeSymbol("EL-FORT-P")));

    static private final SubLSymbol $sym94$ANY_GENL_ = makeSymbol("ANY-GENL?");

    static private final SubLList $list_alt95 = list(makeSymbol("SPEC"), makeSymbol("GENLS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    static private final SubLString $str_alt96$_any_genl__spec_genls__is_t_iff__ = makeString("(any-genl? spec genls) is t iff (genl? spec genl) for some genl in genls\n   (ascending transitive search; inexpensive)");

    static private final SubLList $list_alt97 = list(list(makeSymbol("SPEC"), makeSymbol("EL-FORT-P")), list(makeSymbol("GENLS"), makeSymbol("LISTP")));

    static private final SubLSymbol $sym98$ANY_SPEC_ = makeSymbol("ANY-SPEC?");

    static private final SubLList $list_alt99 = list(makeSymbol("GENL"), makeSymbol("SPECS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    static private final SubLString $str_alt100$Returns_T_iff__spec__genl_spec__f = makeString("Returns T iff (spec? genl spec) for some spec in SPECS");

    static private final SubLList $list_alt101 = list(list(makeSymbol("GENL"), makeSymbol("EL-FORT-P")), list(makeSymbol("SPECS"), makeSymbol("LISTP")));

    static private final SubLSymbol $sym102$ALL_GENL_ = makeSymbol("ALL-GENL?");

    static private final SubLString $str_alt103$Returns_T_iff__genl__spec_genl__f = makeString("Returns T iff (genl? spec genl) for every genl in GENLS\n   (ascending transitive search; inexpensive)");

    static private final SubLSymbol $sym104$ALL_SPEC_ = makeSymbol("ALL-SPEC?");

    static private final SubLString $str_alt105$Returns_T_iff__spec__genl_spec__f = makeString("Returns T iff (spec? genl spec) for every spec in SPECS");

    static private final SubLSymbol $sym106$ANY_GENL_ANY_ = makeSymbol("ANY-GENL-ANY?");

    static private final SubLList $list_alt107 = list(makeSymbol("SPECS"), makeSymbol("GENLS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    static private final SubLString $str_alt108$Return_T_iff__genl__spec_genl_mt_ = makeString("Return T iff (genl? spec genl mt) for any spec in SPECS, genl in GENLS");

    static private final SubLList $list_alt109 = list(list(makeSymbol("SPECS"), makeSymbol("LISTP")), list(makeSymbol("GENLS"), makeSymbol("LISTP")));

    static private final SubLSymbol $sym110$ANY_GENL_ALL_ = makeSymbol("ANY-GENL-ALL?");

    static private final SubLString $str_alt111$Return_T_iff__genl__spec_genl_mt_ = makeString("Return T iff (genl? spec genl mt) for any spec in SPECS and all genl in GENLS");

    static private final SubLSymbol $sym112$ALL_SPEC_ANY_ = makeSymbol("ALL-SPEC-ANY?");

    static private final SubLString $str_alt113$Return_T_iff_for_each_spec_in_SPE = makeString("Return T iff for each spec in SPECS there is some genl in GENLS s.t. (genl? spec genl mt)");

    static private final SubLSymbol $sym114$NOT_GENL_ = makeSymbol("NOT-GENL?");

    static private final SubLList $list_alt115 = list(makeSymbol("COL"), makeSymbol("NOT-GENL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    static private final SubLString $str_alt116$Return_whether_collection_NOT_GEN = makeString("Return whether collection NOT-GENL is not a genl of COL.");

    static private final SubLList $list_alt117 = list(list(makeSymbol("COL"), makeSymbol("EL-FORT-P")), list(makeSymbol("NOT-GENL"), makeSymbol("EL-FORT-P")));

    static private final SubLSymbol $sym118$ALL_NOT_SPEC_ = makeSymbol("ALL-NOT-SPEC?");

    static private final SubLList $list_alt119 = list(makeSymbol("COL"), makeSymbol("NOT-SPECS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    static private final SubLString $str_alt120$Return_whether_every_collection_i = makeString("Return whether every collection in NOT-SPECS is not a spec of COL.");

    static private final SubLList $list_alt121 = list(list(makeSymbol("COL"), makeSymbol("EL-FORT-P")), list(makeSymbol("NOT-SPECS"), makeSymbol("LISTP")));

    static private final SubLSymbol $sym122$ANY_NOT_GENL_ = makeSymbol("ANY-NOT-GENL?");

    static private final SubLList $list_alt123 = list(makeSymbol("COL"), makeSymbol("NOT-GENLS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    static private final SubLString $str_alt124$Returns_whether_any_collection_in = makeString("Returns whether any collection in NOT-GENLS is not a genl of COL.");

    static private final SubLList $list_alt125 = list(list(makeSymbol("COL"), makeSymbol("EL-FORT-P")), list(makeSymbol("NOT-GENLS"), makeSymbol("LISTP")));

    static private final SubLSymbol $sym128$COLLECTIONS_COEXTENSIONAL_ = makeSymbol("COLLECTIONS-COEXTENSIONAL?");

    static private final SubLList $list_alt129 = list(makeSymbol("COL-1"), makeSymbol("COL-2"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));

    static private final SubLString $str_alt130$Are_COL_1_and_COL_2_coextensional = makeString("Are COL-1 and COL-2 coextensional?");

    static private final SubLList $list_alt131 = list(list(makeSymbol("COL-1"), makeSymbol("EL-FORT-P")), list(makeSymbol("COL-2"), makeSymbol("EL-FORT-P")));

    static private final SubLSymbol $sym132$COLLECTIONS_INTERSECT_ = makeSymbol("COLLECTIONS-INTERSECT?");

    static private final SubLString $str_alt133$Do_collections_COL_1_and_COL_2_in = makeString("Do collections COL-1 and COL-2 intersect?\n   (uses only sbhl graphs: their extensions are not searched\n    nor are their sufficient conditions analyzed)");

    static private final SubLSymbol $sym136$WHY_GENL_ = makeSymbol("WHY-GENL?");

    static private final SubLList $list_alt137 = list(makeSymbol("SPEC"), makeSymbol("GENL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("BEHAVIOR"));

    static private final SubLString $str_alt138$Justification_of__genls_SPEC_GENL = makeString("Justification of (genls SPEC GENL)");

    static private final SubLList $list_alt139 = list(makeSymbol("LISTP"));

    static private final SubLList $list_alt141 = list($TRUE);

    static private final SubLSymbol $sym146$WHY_NOT_GENL_ = makeSymbol("WHY-NOT-GENL?");

    static private final SubLString $str_alt147$Justification_of__not__genls_SPEC = makeString("Justification of (not (genls SPEC GENL))");

    static private final SubLSymbol $sym148$WHY_NOT_ASSERT_GENLS_ = makeSymbol("WHY-NOT-ASSERT-GENLS?");

    static private final SubLList $list_alt149 = list(makeSymbol("SPEC"), makeSymbol("GENL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));

    static private final SubLString $str_alt150$Justification_of_why_asserting__g = makeString("Justification of why asserting (genls SPEC GENL) is not consistent");

    static private final SubLString $str_alt152$Returns_the_minimally_general__th = makeString("Returns the minimally-general (the most specific) among all-specs of COL");

    private static final SubLSymbol LIST_OF_COLLECTIONS_P = makeSymbol("LIST-OF-COLLECTIONS-P");

    static private final SubLString $str_alt155$Returns_the_minimally_general__th = makeString("Returns the minimally-general (the most specific) among reified collections COLS,\n   collections that have no proper specs among COLS");

    static private final SubLList $list_alt156 = list(list(makeSymbol("COLS"), makeSymbol("LIST-OF-COLLECTIONS-P")));

    static private final SubLString $str_alt158$Returns_the_single_minimally_gene = makeString("Returns the single minimally-general (the most specific) among reified collections COLS.\nTies are broken by comparing the number of all-genls which is a rough depth estimate.");

    static private final SubLList $list_alt159 = list(makeSymbol("FORT-P"));

    static private final SubLString $str_alt161$Returns_the_most_general_among_re = makeString("Returns the most-general among reified collections COLS, collections\n   that have no proper genls among COLS");

    static private final SubLList $list_alt163 = list(makeSymbol("COLS"), makeSymbol("&OPTIONAL"), makeSymbol("CANDIDATES"), makeSymbol("MT"), makeSymbol("TV"));

    static private final SubLString $str_alt164$Returns_the_most_specific_common_ = makeString("Returns the most specific common generalizations among reified collections COLS\n   (if CANDIDATES is non-nil, then result is a subset of CANDIDATES)");

    static private final SubLString $str_alt166$Returns_the_most_general_common_s = makeString("Returns the most general common specializations among reified collections COLS\n   (if CANDIDATES is non-nil, then result is a subset of CANDIDATES)");

    static private final SubLList $list_alt168 = list(makeSymbol("COL"), makeSymbol("ISA"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    static private final SubLString $str_alt169$Return_some_genl_of_COL_that_isa_ = makeString("Return some genl of COL that isa instance of ISA (if any such genl exists)");

    static private final SubLList $list_alt170 = list(list(makeSymbol("COL"), makeSymbol("EL-FORT-P")), list(makeSymbol("ISA"), makeSymbol("EL-FORT-P")));

    static private final SubLList $list_alt172 = list(makeSymbol("COL-A"), makeSymbol("COL-B"));

    static private final SubLString $str_alt173$Return_COL_B_iff_it_has_fewer_spe = makeString("Return COL-B iff it has fewer specs than COL-A, else return COL-A");

    static private final SubLList $list_alt174 = list(list(makeSymbol("COL-A"), makeSymbol("EL-FORT-P")), list(makeSymbol("COL-B"), makeSymbol("EL-FORT-P")));

    static private final SubLList $list_alt176 = list(makeSymbol("COLS"));

    static private final SubLString $str_alt177$Return_the_collection_having_the_ = makeString("Return the collection having the fewest specs given a list of collections.");

    static private final SubLString $str_alt179$Return_COL_B_iff_it_has_fewer_gen = makeString("Return COL-B iff it has fewer genls than COL-A, else return COL-A");

    static private final SubLList $list_alt181 = list(makeSymbol("SPEC"), makeSymbol("GENL"), makeSymbol("&OPTIONAL"), makeSymbol("TV"));

    static private final SubLString $str_alt182$_return_listp__Returns_in_what__m = makeString("@return listp; Returns in what (most-genl) mts GENL is a genls of SPEC");

    static private final SubLString $$$kknight = makeString("kknight");

    static private final SubLList $list_alt193 = list(list(list(NIL), NIL));

    static private final SubLList $list_alt195 = list(list(list(list(reader_make_constant_shell("Nothing"))), list(reader_make_constant_shell("Nothing"))));

    static private final SubLList $list_alt197 = list(list(list(NIL, reader_make_constant_shell("Dog"), reader_make_constant_shell("CyclistsMt")), NIL));

    static private final SubLList $list_alt198 = list(list(list(reader_make_constant_shell("FemaleHuman"), list(reader_make_constant_shell("Female"))), list(reader_make_constant_shell("Female"))));

    static private final SubLList $list_alt199 = list(list(list(reader_make_constant_shell("Female"), list(reader_make_constant_shell("FemaleHuman"))), list(reader_make_constant_shell("FemaleHuman"))));

    static private final SubLList $list_alt200 = list(list(list(reader_make_constant_shell("FemaleHuman"), list(reader_make_constant_shell("Female"))), T), list(list(reader_make_constant_shell("FemaleHuman"), NIL), NIL));

    static private final SubLList $list_alt201 = list(list(list(reader_make_constant_shell("Female"), list(reader_make_constant_shell("FemaleHuman"))), T), list(list(reader_make_constant_shell("Female"), NIL), NIL));

    static private final SubLList $list_alt202 = list(list(list(reader_make_constant_shell("FemaleHuman"), list(reader_make_constant_shell("Female"))), T), list(list(reader_make_constant_shell("FemaleHuman"), NIL), T));

    static private final SubLList $list_alt203 = list(list(list(NIL, NIL), NIL), list(list(list(reader_make_constant_shell("FemaleHuman")), list(reader_make_constant_shell("Female"))), T));

    static private final SubLList $list_alt204 = list(list(list(NIL, NIL), NIL));

    static private final SubLList $list_alt205 = list(list(list(reader_make_constant_shell("Female"), list(reader_make_constant_shell("Male"))), T), list(list(reader_make_constant_shell("Female"), NIL), T), list(list(reader_make_constant_shell("Female"), list(reader_make_constant_shell("Female"))), NIL), list(list(reader_make_constant_shell("Female"), list(reader_make_constant_shell("FemaleHuman"))), NIL));

    static private final SubLList $list_alt206 = list(list(list(reader_make_constant_shell("Female"), list(reader_make_constant_shell("FemaleHuman"), reader_make_constant_shell("FemaleAnimal"))), T));

    static private final SubLList $list_alt207 = list(list(list(reader_make_constant_shell("Female"), list(reader_make_constant_shell("FemaleHuman"))), T), list(list(reader_make_constant_shell("Female"), list(reader_make_constant_shell("Thing"))), NIL), list(list(reader_make_constant_shell("Female"), NIL), NIL));

    static private final SubLSymbol $sym208$ALL_GENL_OF_SOME_ = makeSymbol("ALL-GENL-OF-SOME?");

    static private final SubLString $$$pace = makeString("pace");

    static private final SubLList $list_alt210 = list(new SubLObject[]{ list(list(list(reader_make_constant_shell("Predicate")), list(reader_make_constant_shell("Individual")), reader_make_constant_shell("BaseKB")), T), list(list(list(reader_make_constant_shell("Predicate")), list(reader_make_constant_shell("Microtheory")), reader_make_constant_shell("BaseKB")), NIL), list(list(list(reader_make_constant_shell("Predicate")), list(reader_make_constant_shell("Individual"), reader_make_constant_shell("Thing")), reader_make_constant_shell("BaseKB")), T), list(list(list(reader_make_constant_shell("BinaryPredicate")), list(reader_make_constant_shell("Individual"), reader_make_constant_shell("Thing")), reader_make_constant_shell("BaseKB")), T), list(list(list(reader_make_constant_shell("BinaryPredicate")), list(reader_make_constant_shell("Individual"), reader_make_constant_shell("Predicate")), reader_make_constant_shell("BaseKB")), T), list(list(list(reader_make_constant_shell("Predicate"), reader_make_constant_shell("BinaryPredicate")), list(reader_make_constant_shell("Individual"), reader_make_constant_shell("Predicate")), reader_make_constant_shell("BaseKB")), T), list(list(list(reader_make_constant_shell("BinaryPredicate"), reader_make_constant_shell("Collection")), list(reader_make_constant_shell("Collection")), reader_make_constant_shell("BaseKB")), T), list(list(list(reader_make_constant_shell("BinaryPredicate"), reader_make_constant_shell("Collection")), list(reader_make_constant_shell("Collection"), reader_make_constant_shell("Individual")), reader_make_constant_shell("BaseKB")), T), list(list(list(reader_make_constant_shell("Collection")), list(reader_make_constant_shell("Collection"), reader_make_constant_shell("Individual")), reader_make_constant_shell("BaseKB")), NIL) });
}

/**
 * Total time: 2516 ms synthetic
 */
