/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.valid_arity_p;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.cycjava.cycl.utilities_macros.register_kb_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.creduce;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.intersection;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

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
import com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
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


public final class genl_predicates extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new genl_predicates();



    // defparameter
    /**
     * Precomputed all-genls of each of the constraint collections for leaf
     * predicate wrt arg-type searches.
     */
    @LispMethod(comment = "Precomputed all-genls of each of the constraint collections for leaf\r\npredicate wrt arg-type searches.\ndefparameter\nPrecomputed all-genls of each of the constraint collections for leaf\npredicate wrt arg-type searches.")
    private static final SubLSymbol $sbhl_arg_type_genls_stores$ = makeSymbol("*SBHL-ARG-TYPE-GENLS-STORES*");



    private static final SubLSymbol GENL_PREDICATES = makeSymbol("GENL-PREDICATES");

    static private final SubLList $list3 = list(makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    static private final SubLString $str4$Returns_the_local_genlPreds_of_PR = makeString("Returns the local genlPreds of PRED");

    static private final SubLList $list5 = list(list(makeSymbol("PRED"), makeSymbol("FORT-P")));

    static private final SubLList $list6 = list(list(makeSymbol("LIST"), makeSymbol("FORT-P")));

    private static final SubLSymbol MIN_GENL_PREDICATES = makeSymbol("MIN-GENL-PREDICATES");

    static private final SubLString $str8$Returns_the_most_specific_local_g = makeString("Returns the most-specific local genlPreds of PRED");



    private static final SubLSymbol GENL_INVERSES = makeSymbol("GENL-INVERSES");

    static private final SubLString $str11$Returns_the_local_genlInverses_of = makeString("Returns the local genlInverses of PRED");

    private static final SubLSymbol MIN_GENL_INVERSES = makeSymbol("MIN-GENL-INVERSES");

    static private final SubLString $str13$Returns_the_most_specific_local_g = makeString("Returns the most-specific local genlInverses of PRED");

    private static final SubLSymbol NOT_GENL_PREDICATES = makeSymbol("NOT-GENL-PREDICATES");

    static private final SubLString $str15$Returns_the_local_negated_genlPre = makeString("Returns the local negated genlPreds of PRED");

    private static final SubLSymbol MAX_NOT_GENL_PREDICATES = makeSymbol("MAX-NOT-GENL-PREDICATES");

    static private final SubLString $str17$Returns_the_most_general_local_ne = makeString("Returns the most-general local negated genlPreds of PRED");

    private static final SubLSymbol NOT_GENL_INVERSES = makeSymbol("NOT-GENL-INVERSES");

    private static final SubLSymbol MAX_NOT_GENL_INVERSES = makeSymbol("MAX-NOT-GENL-INVERSES");

    private static final SubLSymbol SPEC_PREDICATES = makeSymbol("SPEC-PREDICATES");

    static private final SubLString $$$Returns_the_specPreds_of_PRED = makeString("Returns the specPreds of PRED");

    private static final SubLSymbol MAX_SPEC_PREDICATES = makeSymbol("MAX-SPEC-PREDICATES");

    static private final SubLString $str23$Returns_the_most_general_specPred = makeString("Returns the most-general specPreds of PRED");

    private static final SubLSymbol SPEC_INVERSES = makeSymbol("SPEC-INVERSES");

    static private final SubLString $$$Returns_the_specInverses_of_PRED = makeString("Returns the specInverses of PRED");

    private static final SubLSymbol MAX_SPEC_INVERSES = makeSymbol("MAX-SPEC-INVERSES");

    static private final SubLString $str27$Returns_the_most_general_specInve = makeString("Returns the most-general specInverses of PRED");

    private static final SubLSymbol NOT_SPEC_PREDICATES = makeSymbol("NOT-SPEC-PREDICATES");

    static private final SubLString $str29$Returns_the_negated_specPreds_of_ = makeString("Returns the negated specPreds of PRED");

    private static final SubLSymbol MIN_NOT_SPEC_PREDICATES = makeSymbol("MIN-NOT-SPEC-PREDICATES");

    static private final SubLString $str31$Returns_the_most_specific_negated = makeString("Returns the most-specific negated specPreds of PRED");

    private static final SubLSymbol NOT_SPEC_INVERSES = makeSymbol("NOT-SPEC-INVERSES");

    private static final SubLSymbol MIN_NOT_SPEC_INVERSES = makeSymbol("MIN-NOT-SPEC-INVERSES");

    private static final SubLSymbol GENL_PREDICATE_SIBLINGS = makeSymbol("GENL-PREDICATE-SIBLINGS");

    static private final SubLString $str35$Returns_the_direct___genlPreds_of = makeString("Returns the direct #$genlPreds of those predicates having direct spec-preds PRED");

    private static final SubLSymbol GENL_INVERSE_SIBLINGS = makeSymbol("GENL-INVERSE-SIBLINGS");

    static private final SubLString $str37$Returns_the_direct___genlInverse_ = makeString("Returns the direct #$genlInverse of those predicates having direct spec-inverses PRED");

    private static final SubLSymbol SPEC_PREDICATE_SIBLINGS = makeSymbol("SPEC-PREDICATE-SIBLINGS");

    static private final SubLString $str39$Returns_the_direct_spec_preds_of_ = makeString("Returns the direct spec-preds of those collections having direct #$genlPreds PRED");

    private static final SubLSymbol SPEC_INVERSE_SIBLINGS = makeSymbol("SPEC-INVERSE-SIBLINGS");

    static private final SubLString $str41$Returns_the_direct_spec_inverses_ = makeString("Returns the direct spec-inverses of those collections having direct #$genlInverse PRED");

    private static final SubLSymbol GENL_PREDICATE_ROOTS = makeSymbol("GENL-PREDICATE-ROOTS");

    static private final SubLString $str43$Returns_the_most_general_genlPred = makeString("Returns the most general genlPreds of PRED.");

    private static final SubLSymbol GENL_INVERSE_ROOTS = makeSymbol("GENL-INVERSE-ROOTS");

    static private final SubLString $str45$Returns_the_most_general_genlInve = makeString("Returns the most general genlInverses of PRED.");

    private static final SubLSymbol ALL_GENL_PREDICATES = makeSymbol("ALL-GENL-PREDICATES");

    static private final SubLString $str47$Returns_all_genlPreds_of_predicat = makeString("Returns all genlPreds of predicate PRED \n   (ascending transitive closure; inexpensive)");

    static private final SubLString $str53$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $$$continue_anyway = makeString("continue anyway");

    static private final SubLString $str58$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLString $str59$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str60$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLString $str61$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    private static final SubLSymbol ALL_GENL_INVERSES = makeSymbol("ALL-GENL-INVERSES");

    private static final SubLString $str63$Returns_all_genlInverses_of_predi = makeString("Returns all genlInverses of predicate PRED \n   (ascending transitive closure; inexpensive)");

    private static final SubLSymbol ALL_SPEC_PREDICATES = makeSymbol("ALL-SPEC-PREDICATES");

    static private final SubLString $str65$Returns_all_predicates_having_PRE = makeString("Returns all predicates having PRED as a genlPred \n   (descending transitive closure; expensive)");

    private static final SubLSymbol ALL_SPEC_INVERSES = makeSymbol("ALL-SPEC-INVERSES");

    private static final SubLString $str67$Returns_all_predicates_having_PRE = makeString("Returns all predicates having PRED as a genlInverse\n   (descending transitive closure; expensive)");



    private static final SubLSymbol ALL_GENL_PREDS_AMONG = makeSymbol("ALL-GENL-PREDS-AMONG");

    private static final SubLList $list72 = list(makeSymbol("PRED"), makeSymbol("CANDIDATES"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLString $str73$Returns_those_genlPreds_of_PRED_t = makeString("Returns those genlPreds of PRED that are included among CANDIDATEs");

    private static final SubLList $list74 = list(list(makeSymbol("PRED"), makeSymbol("EL-FORT-P")), list(makeSymbol("CANDIDATES"), makeSymbol("LISTP")));

    private static final SubLSymbol ALL_NOT_GENL_PREDICATES = makeSymbol("ALL-NOT-GENL-PREDICATES");

    private static final SubLString $str76$Returns_all_negated_genlPreds_of_ = makeString("Returns all negated genlPreds of predicate PRED \n   (descending transitive closure; expensive)");

    private static final SubLSymbol ALL_NOT_GENL_INVERSES = makeSymbol("ALL-NOT-GENL-INVERSES");

    private static final SubLSymbol ALL_NOT_SPEC_PREDICATES = makeSymbol("ALL-NOT-SPEC-PREDICATES");

    private static final SubLString $str79$Returns_all_negated_specPreds_of_ = makeString("Returns all negated specPreds of predicate PRED \n   (ascending transitive closure; inexpensive)");

    private static final SubLSymbol ALL_NOT_SPEC_INVERSES = makeSymbol("ALL-NOT-SPEC-INVERSES");

    private static final SubLString $str81$Returns_all_predicates_having_PRE = makeString("Returns all predicates having PRED as a negated genlInverse\n   (ascending transitive closure; inexpensive)");

    private static final SubLSymbol UNION_ALL_GENL_PREDICATES = makeSymbol("UNION-ALL-GENL-PREDICATES");

    private static final SubLList $list83 = list(makeSymbol("PREDS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLString $str84$Returns_all_genl_predicates_of_ea = makeString("Returns all genl-predicates of each predicate in PREDS");

    private static final SubLList $list85 = list(list(makeSymbol("PREDS"), makeSymbol("LISTP")));

    private static final SubLSymbol UNION_ALL_SPEC_PREDICATES = makeSymbol("UNION-ALL-SPEC-PREDICATES");

    private static final SubLString $str87$Returns_all_spec_predicates_of_ea = makeString("Returns all spec-predicates of each predicate in PREDS");

    private static final SubLSymbol UNION_ALL_GENL_INVERSES = makeSymbol("UNION-ALL-GENL-INVERSES");

    private static final SubLString $str89$Returns_all_genl_inverses_of_each = makeString("Returns all genl-inverses of each predicate in PREDS");

    private static final SubLSymbol UNION_ALL_SPEC_INVERSES = makeSymbol("UNION-ALL-SPEC-INVERSES");

    private static final SubLString $str91$Returns_all_specs_of_each_predica = makeString("Returns all specs of each predicate in PREDS");

    private static final SubLSymbol MAP_ALL_GENL_PREDS = makeSymbol("MAP-ALL-GENL-PREDS");

    private static final SubLList $list94 = list(makeSymbol("PRED"), makeSymbol("FN"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    static private final SubLString $$$Apply_FN_to_each_genlPred_of_PRED = makeString("Apply FN to each genlPred of PRED");

    private static final SubLList $list96 = list(list(makeSymbol("PRED"), makeSymbol("FORT-P")), list(makeSymbol("FN"), makeSymbol("FUNCTION-SPEC-P")));

    private static final SubLSymbol SOME_ALL_GENL_PREDS = makeSymbol("SOME-ALL-GENL-PREDS");

    private static final SubLString $str98$Apply_FN_to_each_genlPred_of_PRED = makeString("Apply FN to each genlPred of PRED until FN returns a non-nil result");

    private static final SubLSymbol SOME_ALL_GENL_INVERSES = makeSymbol("SOME-ALL-GENL-INVERSES");

    private static final SubLSymbol MAP_ALL_SPEC_PREDS = makeSymbol("MAP-ALL-SPEC-PREDS");

    private static final SubLSymbol SOME_ALL_SPEC_PREDS = makeSymbol("SOME-ALL-SPEC-PREDS");



    private static final SubLSymbol GATHER_IF_SEARCHED_ARG_CONSTRAINTS = makeSymbol("GATHER-IF-SEARCHED-ARG-CONSTRAINTS");

    private static final SubLSymbol ALL_SPEC_PREDS_WRT_TYPE = makeSymbol("ALL-SPEC-PREDS-WRT-TYPE");

    private static final SubLList $list106 = list(makeSymbol("PRED"), makeSymbol("COL"), makeSymbol("ARG"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLString $str107$Returns_those_all_spec_preds_of_P = makeString("Returns those all-spec-preds of PRED for which instances \nof COL are legal in arguments in position ARG");

    static private final SubLList $list108 = list(list(makeSymbol("PRED"), makeSymbol("FORT-P")), list(makeSymbol("COL"), makeSymbol("FORT-P")), list(makeSymbol("ARG"), makeSymbol("INTEGERP")));



    private static final SubLSymbol ALL_SPEC_PREDS_WRT_ARG = makeSymbol("ALL-SPEC-PREDS-WRT-ARG");

    static private final SubLList $list111 = list(makeSymbol("PRED"), makeSymbol("FORT"), makeSymbol("ARG"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLString $str112$Returns_those_all_spec_preds_of_P = makeString("Returns those all-spec-preds of PRED for which FORT\nis legal as arguments in position ARG");

    private static final SubLList $list113 = list(list(makeSymbol("PRED"), makeSymbol("FORT-P")), list(makeSymbol("FORT"), makeSymbol("FORT-P")), list(makeSymbol("ARG"), makeSymbol("INTEGERP")));

    static private final SubLList $list114 = list(makeSymbol("ALIST"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sbhl_arg_type_alist$ = makeSymbol("*SBHL-ARG-TYPE-ALIST*");

    private static final SubLList $list117 = list(list(makeSymbol("*SBHL-ARG-TYPE-GENLS-STORES*"), list(makeSymbol("NEW-DICTIONARY"), list(QUOTE, EQUAL))));

    private static final SubLSymbol SBHL_INITIALIZE_ARG_TYPE_GENLS_STORES = makeSymbol("SBHL-INITIALIZE-ARG-TYPE-GENLS-STORES");

    private static final SubLSymbol SBHL_ARG_TYPES_ALIST_SATISFIED_P = makeSymbol("SBHL-ARG-TYPES-ALIST-SATISFIED-P");





    private static final SubLObject $$True_JustificationTruth = reader_make_constant_shell("True-JustificationTruth");

    private static final SubLSymbol MIN_PREDICATES = makeSymbol("MIN-PREDICATES");

    private static final SubLString $str128$Returns_the_most_specific_predica = makeString("Returns the most-specific predicates in PREDS");

    private static final SubLSymbol MAX_PREDICATES = makeSymbol("MAX-PREDICATES");

    private static final SubLString $str130$Returns_the_most_general_predicat = makeString("Returns the most-general predicates in PREDS");

    private static final SubLSymbol MIN_CEILING_PREDICATES = makeSymbol("MIN-CEILING-PREDICATES");

    private static final SubLList $list132 = list(makeSymbol("PREDS"), makeSymbol("&OPTIONAL"), makeSymbol("CANDIDATES"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLString $str133$Returns_the_most_specific_common_ = makeString("Returns the most-specific common generalizations (ceilings) of PREDS");

    private static final SubLList $list134 = list(makeSymbol("PRED1"), makeSymbol("PRED2"));

    private static final SubLSymbol MAX_FLOOR_PREDICATES = makeSymbol("MAX-FLOOR-PREDICATES");

    private static final SubLString $str136$Returns_the_most_general_common_s = makeString("Returns the most-general common specializations (floors) of PREDS");

    private static final SubLSymbol $sym137$GENL_PREDICATE_ = makeSymbol("GENL-PREDICATE?");

    static private final SubLList $list138 = list(makeSymbol("SPEC"), makeSymbol("GENL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLString $str139$Is_GENL_a_genlPred_of_SPEC______a = makeString("Is GENL a genlPred of SPEC?\n   (ascending transitive search; inexpensive)");

    private static final SubLList $list140 = list(list(makeSymbol("SPEC"), makeSymbol("FORT-P")), list(makeSymbol("GENL"), makeSymbol("FORT-P")));

    private static final SubLList $list141 = list(makeSymbol("BOOLEANP"));



    private static final SubLSymbol $sym144$SPEC_PREDICATE_ = makeSymbol("SPEC-PREDICATE?");

    private static final SubLList $list145 = list(makeSymbol("GENL"), makeSymbol("SPEC"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLList $list146 = list(list(makeSymbol("GENL"), makeSymbol("FORT-P")), list(makeSymbol("SPEC"), makeSymbol("FORT-P")));

    private static final SubLSymbol $sym147$GENL_INVERSE_ = makeSymbol("GENL-INVERSE?");

    private static final SubLString $str148$Is_GENL_a_genlInverse_of_SPEC____ = makeString("Is GENL a genlInverse of SPEC?\n   (ascending transitive search; inexpensive)");

    private static final SubLSymbol $sym149$SPEC_INVERSE_ = makeSymbol("SPEC-INVERSE?");

    private static final SubLSymbol $sym150$ANY_GENL_PREDICATE_ = makeSymbol("ANY-GENL-PREDICATE?");

    private static final SubLList $list151 = list(makeSymbol("SPEC"), makeSymbol("GENLS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLString $str152$Returns_T_iff__genl_predicate__SP = makeString("Returns T iff (genl-predicate? SPEC GENL) for some genl in GENLS\n   (ascending transitive search; inexpensive)");

    private static final SubLList $list153 = list(list(makeSymbol("SPEC"), makeSymbol("FORT-P")), list(makeSymbol("GENLS"), makeSymbol("LISTP")));

    private static final SubLSymbol $sym154$NOT_GENL_PREDICATE_ = makeSymbol("NOT-GENL-PREDICATE?");

    private static final SubLList $list155 = list(makeSymbol("SPEC"), makeSymbol("NOT-GENL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLString $str156$Is_NOT_GENL_known_to_be_not_a_gen = makeString("Is NOT-GENL known to be not a genlPred of SPEC?\n   (descending transitive search; expensive)");

    private static final SubLList $list157 = list(list(makeSymbol("SPEC"), makeSymbol("FORT-P")), list(makeSymbol("NOT-GENL"), makeSymbol("FORT-P")));

    private static final SubLSymbol $sym158$NOT_GENL_INVERSE_ = makeSymbol("NOT-GENL-INVERSE?");

    private static final SubLString $str159$Is_NOT_GENL_a_negated_genlInverse = makeString("Is NOT-GENL a negated genlInverse of SPEC?\n   (descending transitive search; expensive)");

    private static final SubLSymbol $sym160$ANY_NOT_GENL_PREDICATE_ = makeSymbol("ANY-NOT-GENL-PREDICATE?");

    private static final SubLList $list161 = list(makeSymbol("PRED"), makeSymbol("NOT-GENLS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLString $str162$Is_any_predicate_in_NOT_GENLS_not = makeString("Is any predicate in NOT-GENLS not a genlPred of PRED?\n   (descending transitive search; expensive)");

    private static final SubLList $list163 = list(list(makeSymbol("PRED"), makeSymbol("FORT-P")), list(makeSymbol("NOT-GENLS"), makeSymbol("LISTP")));

    private static final SubLSymbol TV_P = makeSymbol("TV-P");

    private static final SubLSymbol $sym166$INTERSECTING_PREDICATES_ = makeSymbol("INTERSECTING-PREDICATES?");

    private static final SubLList $list167 = list(makeSymbol("PRED1"), makeSymbol("PRED2"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));

    private static final SubLString $str168$Does_the_extension_of_PRED1_inclu = makeString("Does the extension of PRED1 include some tuple in the extension of PRED2?");

    private static final SubLList $list169 = list(list(makeSymbol("PRED1"), makeSymbol("FORT-P")), list(makeSymbol("PRED2"), makeSymbol("FORT-P")));

    private static final SubLSymbol $sym170$WHY_GENL_PREDICATE_ = makeSymbol("WHY-GENL-PREDICATE?");

    private static final SubLList $list171 = list(makeSymbol("SPEC"), makeSymbol("GENL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("BEHAVIOR"));

    private static final SubLString $str172$A_justification_of__genlPreds_SPE = makeString("A justification of (genlPreds SPEC GENL)");

    private static final SubLList $list173 = list(makeSymbol("LISTP"));

    private static final SubLSymbol $sym174$WHY_NOT_GENL_PREDICATE_ = makeSymbol("WHY-NOT-GENL-PREDICATE?");

    private static final SubLString $str175$A_justification_of__not__genlPred = makeString("A justification of (not (genlPreds SPEC GENL))");

    private static final SubLSymbol $sym176$WHY_GENL_INVERSE_ = makeSymbol("WHY-GENL-INVERSE?");

    private static final SubLList $list177 = list(makeSymbol("PRED"), makeSymbol("GENL-INVERSE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("BEHAVIOR"));

    private static final SubLString $str178$A_justification_of__genlInverse_P = makeString("A justification of (genlInverse PRED GENL-INVERSE)");

    private static final SubLList $list179 = list(list(makeSymbol("PRED"), makeSymbol("FORT-P")), list(makeSymbol("GENL-INVERSE"), makeSymbol("FORT-P")));



    private static final SubLSymbol $sym181$WHY_NOT_GENL_INVERSE_ = makeSymbol("WHY-NOT-GENL-INVERSE?");

    private static final SubLString $str182$A_justification_of__not__genlInve = makeString("A justification of (not (genlInverse SPEC GENL)");

    private static final SubLSymbol MAX_FLOOR_MTS_OF_GENL_PREDICATE_PATHS = makeSymbol("MAX-FLOOR-MTS-OF-GENL-PREDICATE-PATHS");

    static private final SubLList $list185 = list(makeSymbol("SPEC"), makeSymbol("GENL"), makeSymbol("&OPTIONAL"), makeSymbol("TV"));

    private static final SubLString $str186$_return_listp__In_what__most_genl = makeString("@return listp; In what (most-genl) mts is GENL a genlPred of SPEC?");

    private static final SubLSymbol MAX_FLOOR_MTS_OF_GENL_INVERSE_PATHS = makeSymbol("MAX-FLOOR-MTS-OF-GENL-INVERSE-PATHS");

    private static final SubLList $list188 = list(makeSymbol("SPEC"), makeSymbol("GENL-INVERSE"), makeSymbol("&OPTIONAL"), makeSymbol("TV"));

    private static final SubLString $str189$In_what__most_genl__mts_is_GENL_I = makeString("In what (most-genl) mts is GENL-INVERSE a genlInverse of SPEC?");

    private static final SubLList $list190 = list(list(makeSymbol("SPEC"), makeSymbol("FORT-P")), list(makeSymbol("GENL-INVERSE"), makeSymbol("FORT-P")));

    private static final SubLSymbol CACHED_CANDIDATE_GENL_PREDS = makeSymbol("CACHED-CANDIDATE-GENL-PREDS");

    private static final SubLSymbol $cached_candidate_genl_preds_caching_state$ = makeSymbol("*CACHED-CANDIDATE-GENL-PREDS-CACHING-STATE*");

    private static final SubLSymbol CACHED_CANDIDATE_GENL_PREDS_IN_MT = makeSymbol("CACHED-CANDIDATE-GENL-PREDS-IN-MT");

    private static final SubLSymbol $cached_candidate_genl_preds_in_mt_caching_state$ = makeSymbol("*CACHED-CANDIDATE-GENL-PREDS-IN-MT-CACHING-STATE*");

    private static final SubLSymbol CANDIDATE_PREDS_FOR_ARG_ISA = makeSymbol("CANDIDATE-PREDS-FOR-ARG-ISA");

    private static final SubLSymbol CANDIDATE_PREDS_FOR_ARG_GENL = makeSymbol("CANDIDATE-PREDS-FOR-ARG-GENL");

    private static final SubLSymbol GENL_PREDICATE_AFTER_ADDING = makeSymbol("GENL-PREDICATE-AFTER-ADDING");

    private static final SubLSymbol ADD_GENL_PREDICATE = makeSymbol("ADD-GENL-PREDICATE");

    private static final SubLSymbol GENL_INVERSE_AFTER_ADDING = makeSymbol("GENL-INVERSE-AFTER-ADDING");

    private static final SubLSymbol ADD_GENL_INVERSE = makeSymbol("ADD-GENL-INVERSE");

    private static final SubLSymbol REMOVE_GENL_PREDICATE = makeSymbol("REMOVE-GENL-PREDICATE");

    private static final SubLSymbol REMOVE_GENL_INVERSE = makeSymbol("REMOVE-GENL-INVERSE");

    private static final SubLSymbol GENL_PREDICATE_AFTER_REMOVING = makeSymbol("GENL-PREDICATE-AFTER-REMOVING");

    private static final SubLSymbol GENL_INVERSE_AFTER_REMOVING = makeSymbol("GENL-INVERSE-AFTER-REMOVING");

    // Definitions
    /**
     * Returns the local genlPreds of PRED
     */
    @LispMethod(comment = "Returns the local genlPreds of PRED")
    public static final SubLObject genl_predicates_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(pred, FORT_P);
        return sbhl_link_methods.sbhl_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt, tv, UNPROVIDED);
    }

    // Definitions
    /**
     * Returns the local genlPreds of PRED
     */
    @LispMethod(comment = "Returns the local genlPreds of PRED")
    public static SubLObject genl_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(pred, FORT_P);
        return sbhl_link_methods.sbhl_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt, tv, UNPROVIDED);
    }

    /**
     * Returns the most-specific local genlPreds of PRED
     */
    @LispMethod(comment = "Returns the most-specific local genlPreds of PRED")
    public static final SubLObject min_genl_predicates_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(pred, FORT_P);
        return sbhl_search_methods.sbhl_min_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt, tv);
    }

    /**
     * Returns the most-specific local genlPreds of PRED
     */
    @LispMethod(comment = "Returns the most-specific local genlPreds of PRED")
    public static SubLObject min_genl_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(pred, FORT_P);
        return sbhl_search_methods.sbhl_min_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt, tv);
    }

    /**
     * Returns the local genlInverses of PRED
     */
    @LispMethod(comment = "Returns the local genlInverses of PRED")
    public static final SubLObject genl_inverses_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(pred, FORT_P);
        return sbhl_link_methods.sbhl_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt, tv, UNPROVIDED);
    }

    /**
     * Returns the local genlInverses of PRED
     */
    @LispMethod(comment = "Returns the local genlInverses of PRED")
    public static SubLObject genl_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(pred, FORT_P);
        return sbhl_link_methods.sbhl_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt, tv, UNPROVIDED);
    }

    /**
     * Returns the most-specific local genlInverses of PRED
     */
    @LispMethod(comment = "Returns the most-specific local genlInverses of PRED")
    public static final SubLObject min_genl_inverses_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(pred, FORT_P);
        return sbhl_search_methods.sbhl_min_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt, tv);
    }

    /**
     * Returns the most-specific local genlInverses of PRED
     */
    @LispMethod(comment = "Returns the most-specific local genlInverses of PRED")
    public static SubLObject min_genl_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(pred, FORT_P);
        return sbhl_search_methods.sbhl_min_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt, tv);
    }

    /**
     * Returns the local negated genlPreds of PRED
     */
    @LispMethod(comment = "Returns the local negated genlPreds of PRED")
    public static final SubLObject not_genl_predicates_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(pred, FORT_P);
        return sbhl_link_methods.sbhl_forward_false_link_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt, tv, UNPROVIDED);
    }

    /**
     * Returns the local negated genlPreds of PRED
     */
    @LispMethod(comment = "Returns the local negated genlPreds of PRED")
    public static SubLObject not_genl_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(pred, FORT_P);
        return sbhl_link_methods.sbhl_forward_false_link_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt, tv, UNPROVIDED);
    }

    /**
     * Returns the most-general local negated genlPreds of PRED
     */
    @LispMethod(comment = "Returns the most-general local negated genlPreds of PRED")
    public static final SubLObject max_not_genl_predicates_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(pred, FORT_P);
        return sbhl_search_methods.sbhl_max_forward_false_link_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt, tv);
    }

    /**
     * Returns the most-general local negated genlPreds of PRED
     */
    @LispMethod(comment = "Returns the most-general local negated genlPreds of PRED")
    public static SubLObject max_not_genl_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(pred, FORT_P);
        return sbhl_search_methods.sbhl_max_forward_false_link_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt, tv);
    }

    /**
     * Returns the local negated genlPreds of PRED
     */
    @LispMethod(comment = "Returns the local negated genlPreds of PRED")
    public static final SubLObject not_genl_inverses_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(pred, FORT_P);
        return sbhl_link_methods.sbhl_forward_false_link_nodes(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt, tv, UNPROVIDED);
    }

    /**
     * Returns the local negated genlPreds of PRED
     */
    @LispMethod(comment = "Returns the local negated genlPreds of PRED")
    public static SubLObject not_genl_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(pred, FORT_P);
        return sbhl_link_methods.sbhl_forward_false_link_nodes(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt, tv, UNPROVIDED);
    }

    /**
     * Returns the most-general local negated genlPreds of PRED
     */
    @LispMethod(comment = "Returns the most-general local negated genlPreds of PRED")
    public static final SubLObject max_not_genl_inverses_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(pred, FORT_P);
        return sbhl_search_methods.sbhl_max_forward_false_link_nodes(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt, tv);
    }

    /**
     * Returns the most-general local negated genlPreds of PRED
     */
    @LispMethod(comment = "Returns the most-general local negated genlPreds of PRED")
    public static SubLObject max_not_genl_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(pred, FORT_P);
        return sbhl_search_methods.sbhl_max_forward_false_link_nodes(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt, tv);
    }

    /**
     * Returns the specPreds of PRED
     */
    @LispMethod(comment = "Returns the specPreds of PRED")
    public static final SubLObject spec_predicates_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(pred, FORT_P);
        return sbhl_link_methods.sbhl_backward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt, tv, UNPROVIDED);
    }

    /**
     * Returns the specPreds of PRED
     */
    @LispMethod(comment = "Returns the specPreds of PRED")
    public static SubLObject spec_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(pred, FORT_P);
        return sbhl_link_methods.sbhl_backward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt, tv, UNPROVIDED);
    }

    /**
     * Returns the most-general specPreds of PRED
     */
    @LispMethod(comment = "Returns the most-general specPreds of PRED")
    public static final SubLObject max_spec_predicates_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(pred, FORT_P);
        return sbhl_search_methods.sbhl_max_backward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt, tv);
    }

    /**
     * Returns the most-general specPreds of PRED
     */
    @LispMethod(comment = "Returns the most-general specPreds of PRED")
    public static SubLObject max_spec_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(pred, FORT_P);
        return sbhl_search_methods.sbhl_max_backward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt, tv);
    }

    /**
     * Returns the specInverses of PRED
     */
    @LispMethod(comment = "Returns the specInverses of PRED")
    public static final SubLObject spec_inverses_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(pred, FORT_P);
        return sbhl_link_methods.sbhl_backward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt, tv, UNPROVIDED);
    }

    /**
     * Returns the specInverses of PRED
     */
    @LispMethod(comment = "Returns the specInverses of PRED")
    public static SubLObject spec_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(pred, FORT_P);
        return sbhl_link_methods.sbhl_backward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt, tv, UNPROVIDED);
    }

    /**
     * Returns the most-general specInverses of PRED
     */
    @LispMethod(comment = "Returns the most-general specInverses of PRED")
    public static final SubLObject max_spec_inverses_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(pred, FORT_P);
        return sbhl_search_methods.sbhl_max_backward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt, tv);
    }

    /**
     * Returns the most-general specInverses of PRED
     */
    @LispMethod(comment = "Returns the most-general specInverses of PRED")
    public static SubLObject max_spec_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(pred, FORT_P);
        return sbhl_search_methods.sbhl_max_backward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt, tv);
    }

    /**
     * Returns the negated specPreds of PRED
     */
    @LispMethod(comment = "Returns the negated specPreds of PRED")
    public static final SubLObject not_spec_predicates_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(pred, FORT_P);
        return sbhl_link_methods.sbhl_backward_false_link_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt, tv, UNPROVIDED);
    }

    /**
     * Returns the negated specPreds of PRED
     */
    @LispMethod(comment = "Returns the negated specPreds of PRED")
    public static SubLObject not_spec_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(pred, FORT_P);
        return sbhl_link_methods.sbhl_backward_false_link_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt, tv, UNPROVIDED);
    }

    /**
     * Returns the most-specific negated specPreds of PRED
     */
    @LispMethod(comment = "Returns the most-specific negated specPreds of PRED")
    public static final SubLObject min_not_spec_predicates_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(pred, FORT_P);
        return sbhl_search_methods.sbhl_min_backward_false_link_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt, tv);
    }

    /**
     * Returns the most-specific negated specPreds of PRED
     */
    @LispMethod(comment = "Returns the most-specific negated specPreds of PRED")
    public static SubLObject min_not_spec_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(pred, FORT_P);
        return sbhl_search_methods.sbhl_min_backward_false_link_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt, tv);
    }

    /**
     * Returns the most-specific negated specPreds of PRED
     */
    @LispMethod(comment = "Returns the most-specific negated specPreds of PRED")
    public static final SubLObject not_spec_inverses_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(pred, FORT_P);
        return sbhl_link_methods.sbhl_backward_false_link_nodes(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt, tv, UNPROVIDED);
    }

    /**
     * Returns the most-specific negated specPreds of PRED
     */
    @LispMethod(comment = "Returns the most-specific negated specPreds of PRED")
    public static SubLObject not_spec_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(pred, FORT_P);
        return sbhl_link_methods.sbhl_backward_false_link_nodes(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt, tv, UNPROVIDED);
    }

    /**
     * Returns the most-specific negated specPreds of PRED
     */
    @LispMethod(comment = "Returns the most-specific negated specPreds of PRED")
    public static final SubLObject min_not_spec_inverses_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(pred, FORT_P);
        return sbhl_search_methods.sbhl_min_backward_false_link_nodes(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt, tv);
    }

    /**
     * Returns the most-specific negated specPreds of PRED
     */
    @LispMethod(comment = "Returns the most-specific negated specPreds of PRED")
    public static SubLObject min_not_spec_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(pred, FORT_P);
        return sbhl_search_methods.sbhl_min_backward_false_link_nodes(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt, tv);
    }

    /**
     * Returns the direct #$genlPreds of those predicates having direct spec-preds PRED
     */
    @LispMethod(comment = "Returns the direct #$genlPreds of those predicates having direct spec-preds PRED")
    public static final SubLObject genl_predicate_siblings_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(pred, FORT_P);
        return sbhl_link_methods.sbhl_siblings_forward(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt, tv);
    }

    /**
     * Returns the direct #$genlPreds of those predicates having direct spec-preds PRED
     */
    @LispMethod(comment = "Returns the direct #$genlPreds of those predicates having direct spec-preds PRED")
    public static SubLObject genl_predicate_siblings(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(pred, FORT_P);
        return sbhl_link_methods.sbhl_siblings_forward(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt, tv);
    }

    /**
     * Returns the direct #$genlInverse of those predicates having direct spec-inverses PRED
     */
    @LispMethod(comment = "Returns the direct #$genlInverse of those predicates having direct spec-inverses PRED")
    public static final SubLObject genl_inverse_siblings_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(pred, FORT_P);
        return sbhl_link_methods.sbhl_siblings_forward(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt, tv);
    }

    /**
     * Returns the direct #$genlInverse of those predicates having direct spec-inverses PRED
     */
    @LispMethod(comment = "Returns the direct #$genlInverse of those predicates having direct spec-inverses PRED")
    public static SubLObject genl_inverse_siblings(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(pred, FORT_P);
        return sbhl_link_methods.sbhl_siblings_forward(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt, tv);
    }

    /**
     * Returns the direct spec-preds of those collections having direct #$genlPreds PRED
     */
    @LispMethod(comment = "Returns the direct spec-preds of those collections having direct #$genlPreds PRED")
    public static final SubLObject spec_predicate_siblings_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(pred, FORT_P);
        return sbhl_link_methods.sbhl_siblings_backward(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt, tv);
    }

    /**
     * Returns the direct spec-preds of those collections having direct #$genlPreds PRED
     */
    @LispMethod(comment = "Returns the direct spec-preds of those collections having direct #$genlPreds PRED")
    public static SubLObject spec_predicate_siblings(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(pred, FORT_P);
        return sbhl_link_methods.sbhl_siblings_backward(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt, tv);
    }

    /**
     * Returns the direct spec-inverses of those collections having direct #$genlInverse PRED
     */
    @LispMethod(comment = "Returns the direct spec-inverses of those collections having direct #$genlInverse PRED")
    public static final SubLObject spec_inverse_siblings_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(pred, FORT_P);
        return sbhl_link_methods.sbhl_siblings_backward(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt, tv);
    }

    /**
     * Returns the direct spec-inverses of those collections having direct #$genlInverse PRED
     */
    @LispMethod(comment = "Returns the direct spec-inverses of those collections having direct #$genlInverse PRED")
    public static SubLObject spec_inverse_siblings(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(pred, FORT_P);
        return sbhl_link_methods.sbhl_siblings_backward(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt, tv);
    }

    /**
     * Returns the most general genlPreds of PRED.
     */
    @LispMethod(comment = "Returns the most general genlPreds of PRED.")
    public static final SubLObject genl_predicate_roots_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(pred, FORT_P);
        return com.cyc.cycjava.cycl.genl_predicates.max_predicates(com.cyc.cycjava.cycl.genl_predicates.all_genl_predicates(pred, mt, tv), mt, tv);
    }

    /**
     * Returns the most general genlPreds of PRED.
     */
    @LispMethod(comment = "Returns the most general genlPreds of PRED.")
    public static SubLObject genl_predicate_roots(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(pred, FORT_P);
        return max_predicates(all_genl_predicates(pred, mt, tv), mt, tv);
    }

    /**
     * Returns the most general genlInverses of PRED.
     */
    @LispMethod(comment = "Returns the most general genlInverses of PRED.")
    public static final SubLObject genl_inverse_roots_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(pred, FORT_P);
        return com.cyc.cycjava.cycl.genl_predicates.max_predicates(com.cyc.cycjava.cycl.genl_predicates.all_genl_inverses(pred, mt, tv), mt, tv);
    }

    /**
     * Returns the most general genlInverses of PRED.
     */
    @LispMethod(comment = "Returns the most general genlInverses of PRED.")
    public static SubLObject genl_inverse_roots(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(pred, FORT_P);
        return max_predicates(all_genl_inverses(pred, mt, tv), mt, tv);
    }

    /**
     * Returns all genlPreds of predicate PRED
     * (ascending transitive closure; inexpensive)
     */
    @LispMethod(comment = "Returns all genlPreds of predicate PRED\r\n(ascending transitive closure; inexpensive)\nReturns all genlPreds of predicate PRED\n(ascending transitive closure; inexpensive)")
    public static final SubLObject all_genl_predicates_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(pred, FORT_P);
        return sbhl_search_methods.sbhl_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt, tv);
    }

    /**
     * Returns all genlPreds of predicate PRED
     * (ascending transitive closure; inexpensive)
     */
    @LispMethod(comment = "Returns all genlPreds of predicate PRED\r\n(ascending transitive closure; inexpensive)\nReturns all genlPreds of predicate PRED\n(ascending transitive closure; inexpensive)")
    public static SubLObject all_genl_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(pred, FORT_P);
        return sbhl_search_methods.sbhl_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt, tv);
    }

    public static final SubLObject all_genl_predicates_and_inverses_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject preds = NIL;
                SubLObject node_var = pred;
                SubLObject deck_type = (false) ? ((SubLObject) ($STACK)) : $QUEUE;
                SubLObject recur_deck = deck.create_deck(deck_type);
                SubLObject node_and_predicate_mode = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        {
                            SubLObject mt_var = mt;
                            {
                                SubLObject _prev_bind_0_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                    {
                                        SubLObject tv_var = tv;
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
                                                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt53$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } else {
                                                                    if (pcase_var.eql($CERROR)) {
                                                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt53$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } else {
                                                                        if (pcase_var.eql($WARN)) {
                                                                            Errors.warn($str_alt53$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        } else {
                                                                            Errors.warn($str_alt58$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                            Errors.cerror($$$continue_anyway, $str_alt53$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
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
                                                    SubLObject _prev_bind_2_6 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                    SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                            {
                                                                SubLObject _prev_bind_0_7 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_8 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                SubLObject _prev_bind_2_9 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                try {
                                                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                                    node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p());
                                                                    while (NIL != node_and_predicate_mode) {
                                                                        {
                                                                            SubLObject node_var_10 = node_and_predicate_mode.first();
                                                                            SubLObject predicate_mode = second(node_and_predicate_mode);
                                                                            SubLObject genl_pred = node_var_10;
                                                                            {
                                                                                SubLObject _prev_bind_0_11 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                                                    {
                                                                                        SubLObject inverseP = predicate_mode;
                                                                                        preds = cons(genl_pred, preds);
                                                                                        {
                                                                                            SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                                                            SubLObject cdolist_list_var = accessible_modules;
                                                                                            SubLObject module_var = NIL;
                                                                                            for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                                {
                                                                                                    SubLObject _prev_bind_0_12 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                    SubLObject _prev_bind_1_13 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                    try {
                                                                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                        {
                                                                                                            SubLObject node = function_terms.naut_to_nart(node_var_10);
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
                                                                                                                                            SubLObject mt_14 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                            SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt_14)) {
                                                                                                                                                {
                                                                                                                                                    SubLObject _prev_bind_0_15 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                    try {
                                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt_14, thread);
                                                                                                                                                        {
                                                                                                                                                            SubLObject iteration_state_16 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_16)) {
                                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                                {
                                                                                                                                                                    SubLObject tv_17 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_16);
                                                                                                                                                                    SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_17)) {
                                                                                                                                                                        {
                                                                                                                                                                            SubLObject _prev_bind_0_18 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                            try {
                                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv_17, thread);
                                                                                                                                                                                {
                                                                                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                    SubLObject cdolist_list_var_19 = new_list;
                                                                                                                                                                                    SubLObject node_vars_link_node = NIL;
                                                                                                                                                                                    for (node_vars_link_node = cdolist_list_var_19.first(); NIL != cdolist_list_var_19; cdolist_list_var_19 = cdolist_list_var_19.rest() , node_vars_link_node = cdolist_list_var_19.first()) {
                                                                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                            deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            } finally {
                                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_18, thread);
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    iteration_state_16 = dictionary_contents.do_dictionary_contents_next(iteration_state_16);
                                                                                                                                                                }
                                                                                                                                                            } 
                                                                                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_16);
                                                                                                                                                        }
                                                                                                                                                    } finally {
                                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_15, thread);
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
                                                                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt59$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                    }
                                                                                                                }
                                                                                                            } else {
                                                                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                    {
                                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                        SubLObject cdolist_list_var_20 = new_list;
                                                                                                                        SubLObject generating_fn = NIL;
                                                                                                                        for (generating_fn = cdolist_list_var_20.first(); NIL != cdolist_list_var_20; cdolist_list_var_20 = cdolist_list_var_20.rest() , generating_fn = cdolist_list_var_20.first()) {
                                                                                                                            {
                                                                                                                                SubLObject _prev_bind_0_21 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                                try {
                                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                    {
                                                                                                                                        SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                        SubLObject new_list_22 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                        SubLObject cdolist_list_var_23 = new_list_22;
                                                                                                                                        SubLObject node_vars_link_node = NIL;
                                                                                                                                        for (node_vars_link_node = cdolist_list_var_23.first(); NIL != cdolist_list_var_23; cdolist_list_var_23 = cdolist_list_var_23.rest() , node_vars_link_node = cdolist_list_var_23.first()) {
                                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                } finally {
                                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_21, thread);
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } finally {
                                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_13, thread);
                                                                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_12, thread);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_11, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        node_and_predicate_mode = deck.deck_pop(recur_deck);
                                                                    } 
                                                                } finally {
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_9, thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_8, thread);
                                                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_7, thread);
                                                                }
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt60$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } finally {
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_6, thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_5, thread);
                                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_4, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_3, thread);
                                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_2, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                    }
                }
                return nreverse(preds);
            }
        }
    }

    public static SubLObject all_genl_predicates_and_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = NIL;
        final SubLObject deck_type = $QUEUE;
        final SubLObject recur_deck = deck.create_deck(deck_type);
        SubLObject node_and_predicate_mode = NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject mt_var = mt;
                final SubLObject _prev_bind_0_$1 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
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
                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str53$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($CERROR)) {
                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str53$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($WARN)) {
                                        Errors.warn($str53$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                    } else {
                                        Errors.warn($str58$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror($$$continue_anyway, $str53$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                    }


                        }
                        final SubLObject _prev_bind_0_$3 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$4 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$6 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                            if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                final SubLObject _prev_bind_0_$4 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$5 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$7 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_marking_utilities.sbhl_mark_node_marked(pred, UNPROVIDED);
                                    for (node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                        final SubLObject node_var_$10 = node_and_predicate_mode.first();
                                        final SubLObject predicate_mode = second(node_and_predicate_mode);
                                        final SubLObject genl_pred = node_var_$10;
                                        final SubLObject _prev_bind_0_$5 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                            final SubLObject inverseP = predicate_mode;
                                            preds = cons(genl_pred, preds);
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                            SubLObject module_var = NIL;
                                            module_var = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$6 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(node_var_$10);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt_$14 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt_$14)) {
                                                                        final SubLObject _prev_bind_0_$7 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_$14, thread);
                                                                            SubLObject iteration_state_$16;
                                                                            for (iteration_state_$16 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$16); iteration_state_$16 = dictionary_contents.do_dictionary_contents_next(iteration_state_$16)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv_$17 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$16);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$17)) {
                                                                                    final SubLObject _prev_bind_0_$8 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv_$17, thread);
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
                                                                                                    deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
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
                                                                                                        deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str59$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$8, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$16);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$7, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str60$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$19;
                                                            final SubLObject new_list = cdolist_list_var_$19 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn = NIL;
                                                            generating_fn = cdolist_list_var_$19.first();
                                                            while (NIL != cdolist_list_var_$19) {
                                                                final SubLObject _prev_bind_0_$9 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
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
                                                                                deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
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
                                                                                    deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                }
                                                                                csome_list_var2 = csome_list_var2.rest();
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error($str59$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$9, thread);
                                                                }
                                                                cdolist_list_var_$19 = cdolist_list_var_$19.rest();
                                                                generating_fn = cdolist_list_var_$19.first();
                                                            } 
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$6, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$6, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            } 
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$5, thread);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$7, thread);
                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$5, thread);
                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$4, thread);
                                }
                            } else {
                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str61$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        } finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$6, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$4, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$3, thread);
                        }
                    } finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$3, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$2, thread);
                    }
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$1, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return nreverse(preds);
    }

    public static final SubLObject all_genl_preds_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return com.cyc.cycjava.cycl.genl_predicates.all_genl_predicates(pred, mt, tv);
    }

    public static SubLObject all_genl_preds(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return all_genl_predicates(pred, mt, tv);
    }

    /**
     * Returns all genlPreds of predicate PRED
     * (ascending transitive closure; inexpensive)
     */
    @LispMethod(comment = "Returns all genlPreds of predicate PRED\r\n(ascending transitive closure; inexpensive)\nReturns all genlPreds of predicate PRED\n(ascending transitive closure; inexpensive)")
    public static final SubLObject all_genl_inverses_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(pred, FORT_P);
        return sbhl_search_methods.sbhl_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt, tv);
    }

    /**
     * Returns all genlPreds of predicate PRED
     * (ascending transitive closure; inexpensive)
     */
    @LispMethod(comment = "Returns all genlPreds of predicate PRED\r\n(ascending transitive closure; inexpensive)\nReturns all genlPreds of predicate PRED\n(ascending transitive closure; inexpensive)")
    public static SubLObject all_genl_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(pred, FORT_P);
        return sbhl_search_methods.sbhl_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt, tv);
    }

    /**
     * Returns all predicates having PRED as a genlPred
     * (descending transitive closure; expensive)
     */
    @LispMethod(comment = "Returns all predicates having PRED as a genlPred\r\n(descending transitive closure; expensive)\nReturns all predicates having PRED as a genlPred\n(descending transitive closure; expensive)")
    public static final SubLObject all_spec_predicates_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(pred, FORT_P);
        return sbhl_search_methods.sbhl_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt, tv);
    }

    /**
     * Returns all predicates having PRED as a genlPred
     * (descending transitive closure; expensive)
     */
    @LispMethod(comment = "Returns all predicates having PRED as a genlPred\r\n(descending transitive closure; expensive)\nReturns all predicates having PRED as a genlPred\n(descending transitive closure; expensive)")
    public static SubLObject all_spec_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(pred, FORT_P);
        return sbhl_search_methods.sbhl_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt, tv);
    }

    public static final SubLObject all_spec_preds_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return com.cyc.cycjava.cycl.genl_predicates.all_spec_predicates(pred, mt, tv);
    }

    public static SubLObject all_spec_preds(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return all_spec_predicates(pred, mt, tv);
    }

    /**
     * Returns all predicates having PRED as a genlInverse
     * (descending transitive closure; expensive)
     */
    @LispMethod(comment = "Returns all predicates having PRED as a genlInverse\r\n(descending transitive closure; expensive)\nReturns all predicates having PRED as a genlInverse\n(descending transitive closure; expensive)")
    public static final SubLObject all_spec_inverses_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(pred, FORT_P);
        return sbhl_search_methods.sbhl_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt, tv);
    }

    /**
     * Returns all predicates having PRED as a genlInverse
     * (descending transitive closure; expensive)
     */
    @LispMethod(comment = "Returns all predicates having PRED as a genlInverse\r\n(descending transitive closure; expensive)\nReturns all predicates having PRED as a genlInverse\n(descending transitive closure; expensive)")
    public static SubLObject all_spec_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(pred, FORT_P);
        return sbhl_search_methods.sbhl_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt, tv);
    }

    public static final SubLObject all_spec_predicates_and_inverses_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject preds = NIL;
                SubLObject node_var = pred;
                SubLObject deck_type = (false) ? ((SubLObject) ($STACK)) : $QUEUE;
                SubLObject recur_deck = deck.create_deck(deck_type);
                SubLObject node_and_predicate_mode = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        {
                            SubLObject mt_var = mt;
                            {
                                SubLObject _prev_bind_0_24 = mt_relevance_macros.$mt$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                    {
                                        SubLObject tv_var = tv;
                                        {
                                            SubLObject _prev_bind_0_25 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                            SubLObject _prev_bind_1_26 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                if (NIL != tv_var) {
                                                    if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                        if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                            {
                                                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                if (pcase_var.eql($ERROR)) {
                                                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt53$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } else {
                                                                    if (pcase_var.eql($CERROR)) {
                                                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt53$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } else {
                                                                        if (pcase_var.eql($WARN)) {
                                                                            Errors.warn($str_alt53$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        } else {
                                                                            Errors.warn($str_alt58$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                            Errors.cerror($$$continue_anyway, $str_alt53$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                {
                                                    SubLObject _prev_bind_0_27 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_28 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                    SubLObject _prev_bind_2_29 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                    SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                            {
                                                                SubLObject _prev_bind_0_30 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_31 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                SubLObject _prev_bind_2_32 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                try {
                                                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                                    node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p());
                                                                    while (NIL != node_and_predicate_mode) {
                                                                        {
                                                                            SubLObject node_var_33 = node_and_predicate_mode.first();
                                                                            SubLObject predicate_mode = second(node_and_predicate_mode);
                                                                            SubLObject spec_pred = node_var_33;
                                                                            {
                                                                                SubLObject _prev_bind_0_34 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                                                    {
                                                                                        SubLObject inverseP = predicate_mode;
                                                                                        preds = cons(spec_pred, preds);
                                                                                        {
                                                                                            SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                                                            SubLObject cdolist_list_var = accessible_modules;
                                                                                            SubLObject module_var = NIL;
                                                                                            for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                                {
                                                                                                    SubLObject _prev_bind_0_35 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                    SubLObject _prev_bind_1_36 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                    try {
                                                                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                        {
                                                                                                            SubLObject node = function_terms.naut_to_nart(node_var_33);
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
                                                                                                                                            SubLObject mt_37 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                            SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt_37)) {
                                                                                                                                                {
                                                                                                                                                    SubLObject _prev_bind_0_38 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                    try {
                                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt_37, thread);
                                                                                                                                                        {
                                                                                                                                                            SubLObject iteration_state_39 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_39)) {
                                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                                {
                                                                                                                                                                    SubLObject tv_40 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_39);
                                                                                                                                                                    SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_40)) {
                                                                                                                                                                        {
                                                                                                                                                                            SubLObject _prev_bind_0_41 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                            try {
                                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv_40, thread);
                                                                                                                                                                                {
                                                                                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                    SubLObject cdolist_list_var_42 = new_list;
                                                                                                                                                                                    SubLObject node_vars_link_node = NIL;
                                                                                                                                                                                    for (node_vars_link_node = cdolist_list_var_42.first(); NIL != cdolist_list_var_42; cdolist_list_var_42 = cdolist_list_var_42.rest() , node_vars_link_node = cdolist_list_var_42.first()) {
                                                                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                            deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            } finally {
                                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_41, thread);
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    iteration_state_39 = dictionary_contents.do_dictionary_contents_next(iteration_state_39);
                                                                                                                                                                }
                                                                                                                                                            } 
                                                                                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_39);
                                                                                                                                                        }
                                                                                                                                                    } finally {
                                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_38, thread);
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
                                                                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt59$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                    }
                                                                                                                }
                                                                                                            } else {
                                                                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                    {
                                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                        SubLObject cdolist_list_var_43 = new_list;
                                                                                                                        SubLObject generating_fn = NIL;
                                                                                                                        for (generating_fn = cdolist_list_var_43.first(); NIL != cdolist_list_var_43; cdolist_list_var_43 = cdolist_list_var_43.rest() , generating_fn = cdolist_list_var_43.first()) {
                                                                                                                            {
                                                                                                                                SubLObject _prev_bind_0_44 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                                try {
                                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                    {
                                                                                                                                        SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                        SubLObject new_list_45 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                        SubLObject cdolist_list_var_46 = new_list_45;
                                                                                                                                        SubLObject node_vars_link_node = NIL;
                                                                                                                                        for (node_vars_link_node = cdolist_list_var_46.first(); NIL != cdolist_list_var_46; cdolist_list_var_46 = cdolist_list_var_46.rest() , node_vars_link_node = cdolist_list_var_46.first()) {
                                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                } finally {
                                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_44, thread);
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } finally {
                                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_36, thread);
                                                                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_35, thread);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_34, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        node_and_predicate_mode = deck.deck_pop(recur_deck);
                                                                    } 
                                                                } finally {
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_32, thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_31, thread);
                                                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_30, thread);
                                                                }
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt60$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } finally {
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_29, thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_28, thread);
                                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_27, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_26, thread);
                                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_25, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_24, thread);
                                }
                            }
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                    }
                }
                return nreverse(preds);
            }
        }
    }

    public static SubLObject all_spec_predicates_and_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = NIL;
        final SubLObject deck_type = $QUEUE;
        final SubLObject recur_deck = deck.create_deck(deck_type);
        SubLObject node_and_predicate_mode = NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject mt_var = mt;
                final SubLObject _prev_bind_0_$22 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    final SubLObject tv_var = tv;
                    final SubLObject _prev_bind_0_$23 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$24 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                        if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var.eql($ERROR)) {
                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str53$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($CERROR)) {
                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str53$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($WARN)) {
                                        Errors.warn($str53$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                    } else {
                                        Errors.warn($str58$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror($$$continue_anyway, $str53$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                    }


                        }
                        final SubLObject _prev_bind_0_$24 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$25 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$27 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                            if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                final SubLObject _prev_bind_0_$25 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$26 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$28 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_marking_utilities.sbhl_mark_node_marked(pred, UNPROVIDED);
                                    for (node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                        final SubLObject node_var_$31 = node_and_predicate_mode.first();
                                        final SubLObject predicate_mode = second(node_and_predicate_mode);
                                        final SubLObject spec_pred = node_var_$31;
                                        final SubLObject _prev_bind_0_$26 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                            final SubLObject inverseP = predicate_mode;
                                            preds = cons(spec_pred, preds);
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                            SubLObject module_var = NIL;
                                            module_var = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$27 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$27 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(node_var_$31);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt_$35 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt_$35)) {
                                                                        final SubLObject _prev_bind_0_$28 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_$35, thread);
                                                                            SubLObject iteration_state_$37;
                                                                            for (iteration_state_$37 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$37); iteration_state_$37 = dictionary_contents.do_dictionary_contents_next(iteration_state_$37)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv_$38 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$37);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$38)) {
                                                                                    final SubLObject _prev_bind_0_$29 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv_$38, thread);
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
                                                                                                    deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
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
                                                                                                        deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str59$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$29, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$37);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$28, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str60$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$40;
                                                            final SubLObject new_list = cdolist_list_var_$40 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn = NIL;
                                                            generating_fn = cdolist_list_var_$40.first();
                                                            while (NIL != cdolist_list_var_$40) {
                                                                final SubLObject _prev_bind_0_$30 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
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
                                                                                deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
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
                                                                                    deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                }
                                                                                csome_list_var2 = csome_list_var2.rest();
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error($str59$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$30, thread);
                                                                }
                                                                cdolist_list_var_$40 = cdolist_list_var_$40.rest();
                                                                generating_fn = cdolist_list_var_$40.first();
                                                            } 
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$27, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$27, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            } 
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$26, thread);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$28, thread);
                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$26, thread);
                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$25, thread);
                                }
                            } else {
                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str61$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        } finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$27, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$25, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$24, thread);
                        }
                    } finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$24, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$23, thread);
                    }
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$22, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$31 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$31, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return nreverse(preds);
    }

    public static SubLObject inverse_binary_predicates(final SubLObject binary_pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return intersection(spec_inverses(binary_pred, mt, tv), genl_inverses(binary_pred, mt, tv), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject best_inverse_binary_predicate(final SubLObject binary_pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLObject inverse_binary_predicates = inverse_binary_predicates(binary_pred, mt, tv);
        if (NIL == inverse_binary_predicates) {
            return NIL;
        }
        if (NIL != list_utilities.singletonP(inverse_binary_predicates)) {
            return inverse_binary_predicates.first();
        }
        SubLObject non_inverse_binary_predicate_fn_nats = NIL;
        SubLObject cdolist_list_var = inverse_binary_predicates;
        SubLObject inverse_binary_predicate = NIL;
        inverse_binary_predicate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == narts_high.nart_with_functor_p($$InverseBinaryPredicateFn, inverse_binary_predicate)) {
                non_inverse_binary_predicate_fn_nats = cons(inverse_binary_predicate, non_inverse_binary_predicate_fn_nats);
            }
            cdolist_list_var = cdolist_list_var.rest();
            inverse_binary_predicate = cdolist_list_var.first();
        } 
        if (NIL == non_inverse_binary_predicate_fn_nats) {
            return inverse_binary_predicates.first();
        }
        return non_inverse_binary_predicate_fn_nats.first();
    }

    /**
     * Returns all genlPreds of predicate PRED, except for PRED.
     * (ascending transitive closure; inexpensive)
     */
    @LispMethod(comment = "Returns all genlPreds of predicate PRED, except for PRED.\r\n(ascending transitive closure; inexpensive)\nReturns all genlPreds of predicate PRED, except for PRED.\n(ascending transitive closure; inexpensive)")
    public static final SubLObject all_proper_genl_predicates_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return delete(pred, com.cyc.cycjava.cycl.genl_predicates.all_genl_predicates(pred, mt, tv), symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns all genlPreds of predicate PRED, except for PRED.
     * (ascending transitive closure; inexpensive)
     */
    @LispMethod(comment = "Returns all genlPreds of predicate PRED, except for PRED.\r\n(ascending transitive closure; inexpensive)\nReturns all genlPreds of predicate PRED, except for PRED.\n(ascending transitive closure; inexpensive)")
    public static SubLObject all_proper_genl_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return delete(pred, all_genl_predicates(pred, mt, tv), symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns all genlInverses of predicate PRED,
     * but will not return PRED if it is a genlInverse of itself.
     * (ascending transitive closure; inexpensive)
     */
    @LispMethod(comment = "Returns all genlInverses of predicate PRED,\r\nbut will not return PRED if it is a genlInverse of itself.\r\n(ascending transitive closure; inexpensive)\nReturns all genlInverses of predicate PRED,\nbut will not return PRED if it is a genlInverse of itself.\n(ascending transitive closure; inexpensive)")
    public static final SubLObject all_proper_genl_inverses_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return delete(pred, com.cyc.cycjava.cycl.genl_predicates.all_genl_inverses(pred, mt, tv), symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns all genlInverses of predicate PRED,
     * but will not return PRED if it is a genlInverse of itself.
     * (ascending transitive closure; inexpensive)
     */
    @LispMethod(comment = "Returns all genlInverses of predicate PRED,\r\nbut will not return PRED if it is a genlInverse of itself.\r\n(ascending transitive closure; inexpensive)\nReturns all genlInverses of predicate PRED,\nbut will not return PRED if it is a genlInverse of itself.\n(ascending transitive closure; inexpensive)")
    public static SubLObject all_proper_genl_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return delete(pred, all_genl_inverses(pred, mt, tv), symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns all genlPreds and genlInverses of predicate PRED, except for PRED.
     * (ascending transitive closure; inexpensive)
     */
    @LispMethod(comment = "Returns all genlPreds and genlInverses of predicate PRED, except for PRED.\r\n(ascending transitive closure; inexpensive)\nReturns all genlPreds and genlInverses of predicate PRED, except for PRED.\n(ascending transitive closure; inexpensive)")
    public static final SubLObject all_proper_genl_predicates_and_inverses_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return delete(pred, com.cyc.cycjava.cycl.genl_predicates.all_genl_predicates_and_inverses(pred, mt, tv), symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns all genlPreds and genlInverses of predicate PRED, except for PRED.
     * (ascending transitive closure; inexpensive)
     */
    @LispMethod(comment = "Returns all genlPreds and genlInverses of predicate PRED, except for PRED.\r\n(ascending transitive closure; inexpensive)\nReturns all genlPreds and genlInverses of predicate PRED, except for PRED.\n(ascending transitive closure; inexpensive)")
    public static SubLObject all_proper_genl_predicates_and_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return delete(pred, all_genl_predicates_and_inverses(pred, mt, tv), symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns all specPreds of predicate PRED, except for PRED.
     * (descending transitive search; expensive)
     */
    @LispMethod(comment = "Returns all specPreds of predicate PRED, except for PRED.\r\n(descending transitive search; expensive)\nReturns all specPreds of predicate PRED, except for PRED.\n(descending transitive search; expensive)")
    public static final SubLObject all_proper_spec_predicates_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return delete(pred, com.cyc.cycjava.cycl.genl_predicates.all_spec_predicates(pred, mt, tv), symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns all specPreds of predicate PRED, except for PRED.
     * (descending transitive search; expensive)
     */
    @LispMethod(comment = "Returns all specPreds of predicate PRED, except for PRED.\r\n(descending transitive search; expensive)\nReturns all specPreds of predicate PRED, except for PRED.\n(descending transitive search; expensive)")
    public static SubLObject all_proper_spec_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return delete(pred, all_spec_predicates(pred, mt, tv), symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns all specInverses of predicate PRED,
     * but will not return PRED if it is a specInverse of itself.
     * (descending transitive search; expensive)
     */
    @LispMethod(comment = "Returns all specInverses of predicate PRED,\r\nbut will not return PRED if it is a specInverse of itself.\r\n(descending transitive search; expensive)\nReturns all specInverses of predicate PRED,\nbut will not return PRED if it is a specInverse of itself.\n(descending transitive search; expensive)")
    public static final SubLObject all_proper_spec_inverses_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return delete(pred, com.cyc.cycjava.cycl.genl_predicates.all_spec_inverses(pred, mt, tv), symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns all specInverses of predicate PRED,
     * but will not return PRED if it is a specInverse of itself.
     * (descending transitive search; expensive)
     */
    @LispMethod(comment = "Returns all specInverses of predicate PRED,\r\nbut will not return PRED if it is a specInverse of itself.\r\n(descending transitive search; expensive)\nReturns all specInverses of predicate PRED,\nbut will not return PRED if it is a specInverse of itself.\n(descending transitive search; expensive)")
    public static SubLObject all_proper_spec_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return delete(pred, all_spec_inverses(pred, mt, tv), symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns all specPreds and specInverses of predicate PRED,
     * but will not return PRED if it is a specInverse of itself.
     * (descending transitive search; expensive)
     */
    @LispMethod(comment = "Returns all specPreds and specInverses of predicate PRED,\r\nbut will not return PRED if it is a specInverse of itself.\r\n(descending transitive search; expensive)\nReturns all specPreds and specInverses of predicate PRED,\nbut will not return PRED if it is a specInverse of itself.\n(descending transitive search; expensive)")
    public static final SubLObject all_proper_spec_predicates_and_inverses_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return delete(pred, com.cyc.cycjava.cycl.genl_predicates.all_spec_predicates_and_inverses(pred, mt, tv), symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns all specPreds and specInverses of predicate PRED,
     * but will not return PRED if it is a specInverse of itself.
     * (descending transitive search; expensive)
     */
    @LispMethod(comment = "Returns all specPreds and specInverses of predicate PRED,\r\nbut will not return PRED if it is a specInverse of itself.\r\n(descending transitive search; expensive)\nReturns all specPreds and specInverses of predicate PRED,\nbut will not return PRED if it is a specInverse of itself.\n(descending transitive search; expensive)")
    public static SubLObject all_proper_spec_predicates_and_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return delete(pred, all_spec_predicates_and_inverses(pred, mt, tv), symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns those genlPreds of PRED that are included among CANDIDATEs
     */
    @LispMethod(comment = "Returns those genlPreds of PRED that are included among CANDIDATEs")
    public static final SubLObject all_genl_preds_among_alt(SubLObject pred, SubLObject candidates, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(pred, EL_FORT_P);
        SubLTrampolineFile.checkType(candidates, LISTP);
        return sbhl_search_methods.sbhl_all_forward_true_nodes_among(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, candidates, mt, tv);
    }

    /**
     * Returns those genlPreds of PRED that are included among CANDIDATEs
     */
    @LispMethod(comment = "Returns those genlPreds of PRED that are included among CANDIDATEs")
    public static SubLObject all_genl_preds_among(final SubLObject pred, final SubLObject candidates, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(pred, EL_FORT_P);
        SubLTrampolineFile.enforceType(candidates, LISTP);
        return sbhl_search_methods.sbhl_all_forward_true_nodes_among(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, candidates, mt, tv);
    }

    /**
     *
     *
     * @return listp; Returns those specPreds of GENL-PRED that are included among CANDIDATES.
     */
    @LispMethod(comment = "@return listp; Returns those specPreds of GENL-PRED that are included among CANDIDATES.")
    public static final SubLObject all_spec_predicates_among_alt(SubLObject genl_pred, SubLObject spec_candidates, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_all_backward_true_nodes_among(sbhl_module_vars.get_sbhl_module($$genlPreds), genl_pred, spec_candidates, mt, tv);
    }

    /**
     *
     *
     * @return listp; Returns those specPreds of GENL-PRED that are included among CANDIDATES.
     */
    @LispMethod(comment = "@return listp; Returns those specPreds of GENL-PRED that are included among CANDIDATES.")
    public static SubLObject all_spec_predicates_among(final SubLObject genl_pred, final SubLObject spec_candidates, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_all_backward_true_nodes_among(sbhl_module_vars.get_sbhl_module($$genlPreds), genl_pred, spec_candidates, mt, tv);
    }

    /**
     * Returns those genlInverses of PRED that are included among CANDIDATES.
     */
    @LispMethod(comment = "Returns those genlInverses of PRED that are included among CANDIDATES.")
    public static final SubLObject all_genl_inverses_among_alt(SubLObject pred, SubLObject candidates, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_all_forward_true_nodes_among(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, candidates, mt, tv);
    }

    /**
     * Returns those genlInverses of PRED that are included among CANDIDATES.
     */
    @LispMethod(comment = "Returns those genlInverses of PRED that are included among CANDIDATES.")
    public static SubLObject all_genl_inverses_among(final SubLObject pred, final SubLObject candidates, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_all_forward_true_nodes_among(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, candidates, mt, tv);
    }

    /**
     *
     *
     * @return listp; Returns those specInverses of GENL-PRED that are included among CANDIDATES.
     */
    @LispMethod(comment = "@return listp; Returns those specInverses of GENL-PRED that are included among CANDIDATES.")
    public static final SubLObject all_spec_inverses_among_alt(SubLObject genl_pred, SubLObject spec_candidates, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return keyhash_utilities.fast_intersection(com.cyc.cycjava.cycl.genl_predicates.all_spec_inverses(genl_pred, mt, tv), spec_candidates, symbol_function(EQ), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return listp; Returns those specInverses of GENL-PRED that are included among CANDIDATES.
     */
    @LispMethod(comment = "@return listp; Returns those specInverses of GENL-PRED that are included among CANDIDATES.")
    public static SubLObject all_spec_inverses_among(final SubLObject genl_pred, final SubLObject spec_candidates, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return keyhash_utilities.fast_intersection(all_spec_inverses(genl_pred, mt, tv), spec_candidates, symbol_function(EQ), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns all negated genlPreds of predicate PRED
     * (descending transitive closure; expensive)
     */
    @LispMethod(comment = "Returns all negated genlPreds of predicate PRED\r\n(descending transitive closure; expensive)\nReturns all negated genlPreds of predicate PRED\n(descending transitive closure; expensive)")
    public static final SubLObject all_not_genl_predicates_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(pred, FORT_P);
        return sbhl_search_implied_relations.sbhl_all_implied_forward_false_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt, tv);
    }

    /**
     * Returns all negated genlPreds of predicate PRED
     * (descending transitive closure; expensive)
     */
    @LispMethod(comment = "Returns all negated genlPreds of predicate PRED\r\n(descending transitive closure; expensive)\nReturns all negated genlPreds of predicate PRED\n(descending transitive closure; expensive)")
    public static SubLObject all_not_genl_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(pred, FORT_P);
        return sbhl_search_implied_relations.sbhl_all_implied_forward_false_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt, tv);
    }

    public static final SubLObject all_not_genl_preds_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return com.cyc.cycjava.cycl.genl_predicates.all_not_genl_predicates(pred, mt, tv);
    }

    public static SubLObject all_not_genl_preds(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return all_not_genl_predicates(pred, mt, tv);
    }

    /**
     * Returns all negated genlPreds of predicate PRED
     * (descending transitive closure; expensive)
     */
    @LispMethod(comment = "Returns all negated genlPreds of predicate PRED\r\n(descending transitive closure; expensive)\nReturns all negated genlPreds of predicate PRED\n(descending transitive closure; expensive)")
    public static final SubLObject all_not_genl_inverses_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(pred, FORT_P);
        return sbhl_search_implied_relations.sbhl_all_implied_forward_false_nodes(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt, tv);
    }

    /**
     * Returns all negated genlPreds of predicate PRED
     * (descending transitive closure; expensive)
     */
    @LispMethod(comment = "Returns all negated genlPreds of predicate PRED\r\n(descending transitive closure; expensive)\nReturns all negated genlPreds of predicate PRED\n(descending transitive closure; expensive)")
    public static SubLObject all_not_genl_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(pred, FORT_P);
        return sbhl_search_implied_relations.sbhl_all_implied_forward_false_nodes(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt, tv);
    }

    /**
     * Returns all negated specPreds of predicate PRED
     * (ascending transitive closure; inexpensive)
     */
    @LispMethod(comment = "Returns all negated specPreds of predicate PRED\r\n(ascending transitive closure; inexpensive)\nReturns all negated specPreds of predicate PRED\n(ascending transitive closure; inexpensive)")
    public static final SubLObject all_not_spec_predicates_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(pred, FORT_P);
        return sbhl_search_implied_relations.sbhl_all_implied_backward_false_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt, tv);
    }

    /**
     * Returns all negated specPreds of predicate PRED
     * (ascending transitive closure; inexpensive)
     */
    @LispMethod(comment = "Returns all negated specPreds of predicate PRED\r\n(ascending transitive closure; inexpensive)\nReturns all negated specPreds of predicate PRED\n(ascending transitive closure; inexpensive)")
    public static SubLObject all_not_spec_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(pred, FORT_P);
        return sbhl_search_implied_relations.sbhl_all_implied_backward_false_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt, tv);
    }

    public static final SubLObject all_not_spec_preds_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return com.cyc.cycjava.cycl.genl_predicates.all_not_spec_predicates(pred, mt, tv);
    }

    public static SubLObject all_not_spec_preds(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return all_not_spec_predicates(pred, mt, tv);
    }

    /**
     * Returns all predicates having PRED as a negated genlInverse
     * (ascending transitive closure; inexpensive)
     */
    @LispMethod(comment = "Returns all predicates having PRED as a negated genlInverse\r\n(ascending transitive closure; inexpensive)\nReturns all predicates having PRED as a negated genlInverse\n(ascending transitive closure; inexpensive)")
    public static final SubLObject all_not_spec_inverses_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(pred, FORT_P);
        return sbhl_search_implied_relations.sbhl_all_implied_backward_false_nodes(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt, tv);
    }

    /**
     * Returns all predicates having PRED as a negated genlInverse
     * (ascending transitive closure; inexpensive)
     */
    @LispMethod(comment = "Returns all predicates having PRED as a negated genlInverse\r\n(ascending transitive closure; inexpensive)\nReturns all predicates having PRED as a negated genlInverse\n(ascending transitive closure; inexpensive)")
    public static SubLObject all_not_spec_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(pred, FORT_P);
        return sbhl_search_implied_relations.sbhl_all_implied_backward_false_nodes(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt, tv);
    }

    /**
     * Returns all genl-predicates of each predicate in PREDS
     */
    @LispMethod(comment = "Returns all genl-predicates of each predicate in PREDS")
    public static final SubLObject union_all_genl_predicates_alt(SubLObject preds, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(preds, LISTP);
        return sbhl_search_methods.sbhl_union_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), preds, mt, tv);
    }

    /**
     * Returns all genl-predicates of each predicate in PREDS
     */
    @LispMethod(comment = "Returns all genl-predicates of each predicate in PREDS")
    public static SubLObject union_all_genl_predicates(final SubLObject preds, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(preds, LISTP);
        return sbhl_search_methods.sbhl_union_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), preds, mt, tv);
    }

    /**
     * Returns all spec-predicates of each predicate in PREDS
     */
    @LispMethod(comment = "Returns all spec-predicates of each predicate in PREDS")
    public static final SubLObject union_all_spec_predicates_alt(SubLObject preds, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(preds, LISTP);
        return sbhl_search_methods.sbhl_union_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), preds, mt, tv);
    }

    /**
     * Returns all spec-predicates of each predicate in PREDS
     */
    @LispMethod(comment = "Returns all spec-predicates of each predicate in PREDS")
    public static SubLObject union_all_spec_predicates(final SubLObject preds, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(preds, LISTP);
        return sbhl_search_methods.sbhl_union_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), preds, mt, tv);
    }

    /**
     * Returns all genl-inverses of each predicate in PREDS
     */
    @LispMethod(comment = "Returns all genl-inverses of each predicate in PREDS")
    public static final SubLObject union_all_genl_inverses_alt(SubLObject preds, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(preds, LISTP);
        return sbhl_search_methods.sbhl_union_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlInverse), preds, mt, tv);
    }

    /**
     * Returns all genl-inverses of each predicate in PREDS
     */
    @LispMethod(comment = "Returns all genl-inverses of each predicate in PREDS")
    public static SubLObject union_all_genl_inverses(final SubLObject preds, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(preds, LISTP);
        return sbhl_search_methods.sbhl_union_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlInverse), preds, mt, tv);
    }

    /**
     * Returns all specs of each predicate in PREDS
     */
    @LispMethod(comment = "Returns all specs of each predicate in PREDS")
    public static final SubLObject union_all_spec_inverses_alt(SubLObject preds, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(preds, LISTP);
        return sbhl_search_methods.sbhl_union_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlInverse), preds, mt, tv);
    }

    /**
     * Returns all specs of each predicate in PREDS
     */
    @LispMethod(comment = "Returns all specs of each predicate in PREDS")
    public static SubLObject union_all_spec_inverses(final SubLObject preds, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(preds, LISTP);
        return sbhl_search_methods.sbhl_union_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlInverse), preds, mt, tv);
    }

    /**
     * Returns all spec-preds and spec-inverses of PREDS.
     */
    @LispMethod(comment = "Returns all spec-preds and spec-inverses of PREDS.")
    public static final SubLObject union_all_spec_predicates_and_inverses_alt(SubLObject preds, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_result$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_result$.bind(NIL, thread);
                        try {
                            sbhl_search_methods.sbhl_simply_union_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), preds, mt, tv);
                        } finally {
                            {
                                SubLObject _prev_bind_0_47 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    result = sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_47, thread);
                                }
                            }
                        }
                    } finally {
                        sbhl_search_vars.$sbhl_result$.rebind(_prev_bind_0, thread);
                    }
                }
                return list_utilities.fast_delete_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    /**
     * Returns all spec-preds and spec-inverses of PREDS.
     */
    @LispMethod(comment = "Returns all spec-preds and spec-inverses of PREDS.")
    public static SubLObject union_all_spec_predicates_and_inverses(final SubLObject preds, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_result$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_result$.bind(NIL, thread);
            try {
                sbhl_search_methods.sbhl_simply_union_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), preds, mt, tv);
            } finally {
                final SubLObject _prev_bind_0_$43 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    result = sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$43, thread);
                }
            }
        } finally {
            sbhl_search_vars.$sbhl_result$.rebind(_prev_bind_0, thread);
        }
        return list_utilities.fast_delete_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Apply FN to each genlPred of PRED
     */
    @LispMethod(comment = "Apply FN to each genlPred of PRED")
    public static final SubLObject map_all_genl_preds_alt(SubLObject pred, SubLObject fn, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(pred, FORT_P);
        SubLTrampolineFile.checkType(fn, FUNCTION_SPEC_P);
        sbhl_search_methods.sbhl_map_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, fn, mt, tv);
        return NIL;
    }

    /**
     * Apply FN to each genlPred of PRED
     */
    @LispMethod(comment = "Apply FN to each genlPred of PRED")
    public static SubLObject map_all_genl_preds(final SubLObject pred, final SubLObject fn, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(pred, FORT_P);
        SubLTrampolineFile.enforceType(fn, FUNCTION_SPEC_P);
        sbhl_search_methods.sbhl_map_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, fn, mt, tv);
        return NIL;
    }

    /**
     * Apply FN to each genlPred of PRED until FN returns a non-nil result
     */
    @LispMethod(comment = "Apply FN to each genlPred of PRED until FN returns a non-nil result")
    public static final SubLObject some_all_genl_preds_alt(SubLObject pred, SubLObject fn, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(pred, FORT_P);
        SubLTrampolineFile.checkType(fn, FUNCTION_SPEC_P);
        return sbhl_search_methods.sbhl_gather_first_among_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, fn, mt, tv, UNPROVIDED);
    }

    /**
     * Apply FN to each genlPred of PRED until FN returns a non-nil result
     */
    @LispMethod(comment = "Apply FN to each genlPred of PRED until FN returns a non-nil result")
    public static SubLObject some_all_genl_preds(final SubLObject pred, final SubLObject fn, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(pred, FORT_P);
        SubLTrampolineFile.enforceType(fn, FUNCTION_SPEC_P);
        return sbhl_search_methods.sbhl_gather_first_among_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, fn, mt, tv, UNPROVIDED);
    }

    /**
     * Apply FN to each genlPred of PRED until FN returns a non-nil result
     */
    @LispMethod(comment = "Apply FN to each genlPred of PRED until FN returns a non-nil result")
    public static final SubLObject some_all_genl_inverses_alt(SubLObject pred, SubLObject fn, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(pred, FORT_P);
        SubLTrampolineFile.checkType(fn, FUNCTION_SPEC_P);
        return sbhl_search_methods.sbhl_gather_first_among_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, fn, mt, tv, UNPROVIDED);
    }

    /**
     * Apply FN to each genlPred of PRED until FN returns a non-nil result
     */
    @LispMethod(comment = "Apply FN to each genlPred of PRED until FN returns a non-nil result")
    public static SubLObject some_all_genl_inverses(final SubLObject pred, final SubLObject fn, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(pred, FORT_P);
        SubLTrampolineFile.enforceType(fn, FUNCTION_SPEC_P);
        return sbhl_search_methods.sbhl_gather_first_among_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, fn, mt, tv, UNPROVIDED);
    }

    /**
     * Apply FN to each genlPred or genlInverse of PRED, only upon its first visit to that node.
     */
    @LispMethod(comment = "Apply FN to each genlPred or genlInverse of PRED, only upon its first visit to that node.")
    public static final SubLObject some_all_genl_preds_and_inverses_alt(SubLObject pred, SubLObject fn, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_simply_gather_first_among_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, fn, mt, tv, UNPROVIDED);
    }

    /**
     * Apply FN to each genlPred or genlInverse of PRED, only upon its first visit to that node.
     */
    @LispMethod(comment = "Apply FN to each genlPred or genlInverse of PRED, only upon its first visit to that node.")
    public static SubLObject some_all_genl_preds_and_inverses(final SubLObject pred, final SubLObject fn, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_simply_gather_first_among_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, fn, mt, tv, UNPROVIDED);
    }

    /**
     * Apply FN to each genlPred of PRED
     */
    @LispMethod(comment = "Apply FN to each genlPred of PRED")
    public static final SubLObject map_all_spec_preds_alt(SubLObject pred, SubLObject fn, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(pred, FORT_P);
        SubLTrampolineFile.checkType(fn, FUNCTION_SPEC_P);
        sbhl_search_methods.sbhl_map_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, fn, mt, tv);
        return NIL;
    }

    /**
     * Apply FN to each genlPred of PRED
     */
    @LispMethod(comment = "Apply FN to each genlPred of PRED")
    public static SubLObject map_all_spec_preds(final SubLObject pred, final SubLObject fn, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(pred, FORT_P);
        SubLTrampolineFile.enforceType(fn, FUNCTION_SPEC_P);
        sbhl_search_methods.sbhl_map_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, fn, mt, tv);
        return NIL;
    }

    /**
     * apply FN to each genlPred of PRED
     */
    @LispMethod(comment = "apply FN to each genlPred of PRED")
    public static final SubLObject map_spec_preds_alt(SubLObject pred, SubLObject fn, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.genl_predicates.map_all_spec_preds(pred, fn, mt, UNPROVIDED);
    }

    /**
     * apply FN to each genlPred of PRED
     */
    @LispMethod(comment = "apply FN to each genlPred of PRED")
    public static SubLObject map_spec_preds(final SubLObject pred, final SubLObject fn, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return map_all_spec_preds(pred, fn, mt, UNPROVIDED);
    }

    /**
     * Apply FN to each spec-pred and spec-inverse of PRED, ambivalent about how the spec was reached, and only visiting each spec once.
     */
    @LispMethod(comment = "Apply FN to each spec-pred and spec-inverse of PRED, ambivalent about how the spec was reached, and only visiting each spec once.")
    public static final SubLObject map_all_spec_preds_and_inverses_alt(SubLObject fn, SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        sbhl_search_methods.sbhl_simply_map_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, fn, mt, tv);
        return NIL;
    }

    /**
     * Apply FN to each spec-pred and spec-inverse of PRED, ambivalent about how the spec was reached, and only visiting each spec once.
     */
    @LispMethod(comment = "Apply FN to each spec-pred and spec-inverse of PRED, ambivalent about how the spec was reached, and only visiting each spec once.")
    public static SubLObject map_all_spec_preds_and_inverses(final SubLObject fn, final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        sbhl_search_methods.sbhl_simply_map_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, fn, mt, tv);
        return NIL;
    }

    /**
     * Apply FN to each genlPred of PRED until FN returns a non-nil result
     */
    @LispMethod(comment = "Apply FN to each genlPred of PRED until FN returns a non-nil result")
    public static final SubLObject some_all_spec_preds_alt(SubLObject pred, SubLObject fn, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(pred, FORT_P);
        SubLTrampolineFile.checkType(fn, FUNCTION_SPEC_P);
        return sbhl_search_methods.sbhl_gather_first_among_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, fn, mt, tv, UNPROVIDED);
    }

    /**
     * Apply FN to each genlPred of PRED until FN returns a non-nil result
     */
    @LispMethod(comment = "Apply FN to each genlPred of PRED until FN returns a non-nil result")
    public static SubLObject some_all_spec_preds(final SubLObject pred, final SubLObject fn, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(pred, FORT_P);
        SubLTrampolineFile.enforceType(fn, FUNCTION_SPEC_P);
        return sbhl_search_methods.sbhl_gather_first_among_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, fn, mt, tv, UNPROVIDED);
    }

    public static final SubLObject some_all_spec_preds_and_inverses_alt(SubLObject pred, SubLObject fn, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_simply_gather_first_among_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, fn, mt, tv, UNPROVIDED);
    }

    public static SubLObject some_all_spec_preds_and_inverses(final SubLObject pred, final SubLObject fn, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_simply_gather_first_among_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, fn, mt, tv, UNPROVIDED);
    }

    public static final SubLObject count_all_genl_predicates_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return length(com.cyc.cycjava.cycl.genl_predicates.all_genl_predicates(pred, mt, tv));
    }

    public static SubLObject count_all_genl_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return length(all_genl_predicates(pred, mt, tv));
    }

    public static SubLObject count_all_genl_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return length(all_genl_inverses(pred, mt, tv));
    }

    public static final SubLObject count_all_genl_predicates_and_inverses_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return length(com.cyc.cycjava.cycl.genl_predicates.all_genl_predicates_and_inverses(pred, mt, tv));
    }

    public static SubLObject count_all_genl_predicates_and_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return length(all_genl_predicates_and_inverses(pred, mt, tv));
    }

    public static final SubLObject count_all_spec_predicates_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return length(com.cyc.cycjava.cycl.genl_predicates.all_spec_predicates(pred, mt, tv));
    }

    public static SubLObject count_all_spec_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return length(all_spec_predicates(pred, mt, tv));
    }

    public static SubLObject count_all_spec_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return length(all_spec_inverses(pred, mt, tv));
    }

    public static final SubLObject count_all_spec_predicates_and_inverses_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return length(com.cyc.cycjava.cycl.genl_predicates.all_spec_predicates_and_inverses(pred, mt, tv));
    }

    public static SubLObject count_all_spec_predicates_and_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return length(all_spec_predicates_and_inverses(pred, mt, tv));
    }

    /**
     * Returns those all-spec-preds of PRED for which instances
     * of COL are legal in arguments in position ARG
     */
    @LispMethod(comment = "Returns those all-spec-preds of PRED for which instances\r\nof COL are legal in arguments in position ARG\nReturns those all-spec-preds of PRED for which instances\nof COL are legal in arguments in position ARG")
    public static final SubLObject all_spec_preds_wrt_type_alt(SubLObject pred, SubLObject col, SubLObject arg, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(pred, FORT_P);
            SubLTrampolineFile.checkType(col, FORT_P);
            SubLTrampolineFile.checkType(arg, INTEGERP);
            if (((NIL != fort_types_interface.predicateP(pred)) && (NIL != fort_types_interface.collectionP(col))) && (NIL != subl_promotions.memberP(arg, czer_vars.$arg_positions$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) {
                {
                    SubLObject result = NIL;
                    {
                        SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                            {
                                SubLObject _prev_bind_0_48 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                try {
                                    sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                    {
                                        SubLObject _prev_bind_0_49 = sbhl_marking_vars.$sbhl_target_space$.currentBinding(thread);
                                        try {
                                            sbhl_marking_vars.$sbhl_target_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                            {
                                                SubLObject _prev_bind_0_50 = sbhl_marking_vars.$sbhl_target_gather_space$.currentBinding(thread);
                                                try {
                                                    sbhl_marking_vars.$sbhl_target_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                    {
                                                        SubLObject _prev_bind_0_51 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                                        try {
                                                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread), thread);
                                                            sbhl_marking_methods.sbhl_mark_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, mt, tv);
                                                        } finally {
                                                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_51, thread);
                                                        }
                                                    }
                                                    {
                                                        SubLObject _prev_bind_0_52 = sbhl_search_vars.$sbhl_access_arg$.currentBinding(thread);
                                                        SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_result$.currentBinding(thread);
                                                        try {
                                                            sbhl_search_vars.$sbhl_access_arg$.bind(arg, thread);
                                                            sbhl_search_vars.$sbhl_result$.bind(NIL, thread);
                                                            try {
                                                                sbhl_search_methods.sbhl_map_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, GATHER_IF_SEARCHED_ARG_CONSTRAINTS, mt, tv);
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0_53 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        result = sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_53, thread);
                                                                    }
                                                                }
                                                            }
                                                        } finally {
                                                            sbhl_search_vars.$sbhl_result$.rebind(_prev_bind_1, thread);
                                                            sbhl_search_vars.$sbhl_access_arg$.rebind(_prev_bind_0_52, thread);
                                                        }
                                                    }
                                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_gather_space$.getDynamicValue(thread));
                                                } finally {
                                                    sbhl_marking_vars.$sbhl_target_gather_space$.rebind(_prev_bind_0_50, thread);
                                                }
                                            }
                                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
                                        } finally {
                                            sbhl_marking_vars.$sbhl_target_space$.rebind(_prev_bind_0_49, thread);
                                        }
                                    }
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                } finally {
                                    sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_48, thread);
                                }
                            }
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        } finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                        }
                    }
                    return result;
                }
            }
            return NIL;
        }
    }

    /**
     * Returns those all-spec-preds of PRED for which instances
     * of COL are legal in arguments in position ARG
     */
    @LispMethod(comment = "Returns those all-spec-preds of PRED for which instances\r\nof COL are legal in arguments in position ARG\nReturns those all-spec-preds of PRED for which instances\nof COL are legal in arguments in position ARG")
    public static SubLObject all_spec_preds_wrt_type(final SubLObject pred, final SubLObject col, final SubLObject arg, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(pred, FORT_P);
        SubLTrampolineFile.enforceType(col, FORT_P);
        SubLTrampolineFile.enforceType(arg, INTEGERP);
        if (((NIL != fort_types_interface.predicateP(pred)) && (NIL != fort_types_interface.collectionP(col))) && (NIL != subl_promotions.memberP(arg, czer_vars.$arg_positions$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) {
            SubLObject result = NIL;
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject _prev_bind_0_$44 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject _prev_bind_0_$45 = sbhl_marking_vars.$sbhl_target_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_target_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                try {
                                    final SubLObject _prev_bind_0_$46 = sbhl_marking_vars.$sbhl_target_gather_space$.currentBinding(thread);
                                    try {
                                        sbhl_marking_vars.$sbhl_target_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                        try {
                                            final SubLObject _prev_bind_0_$47 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                            try {
                                                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread), thread);
                                                sbhl_marking_methods.sbhl_mark_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, mt, tv);
                                            } finally {
                                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$47, thread);
                                            }
                                            final SubLObject _prev_bind_0_$48 = sbhl_search_vars.$sbhl_access_arg$.currentBinding(thread);
                                            final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_result$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_access_arg$.bind(arg, thread);
                                                sbhl_search_vars.$sbhl_result$.bind(NIL, thread);
                                                try {
                                                    sbhl_search_methods.sbhl_map_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, GATHER_IF_SEARCHED_ARG_CONSTRAINTS, mt, tv);
                                                } finally {
                                                    final SubLObject _prev_bind_0_$49 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        final SubLObject _values = getValuesAsVector();
                                                        result = sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
                                                        restoreValuesFromVector(_values);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$49, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$sbhl_result$.rebind(_prev_bind_2, thread);
                                                sbhl_search_vars.$sbhl_access_arg$.rebind(_prev_bind_0_$48, thread);
                                            }
                                        } finally {
                                            final SubLObject _prev_bind_0_$50 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values2 = getValuesAsVector();
                                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_gather_space$.getDynamicValue(thread));
                                                restoreValuesFromVector(_values2);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$50, thread);
                                            }
                                        }
                                    } finally {
                                        sbhl_marking_vars.$sbhl_target_gather_space$.rebind(_prev_bind_0_$46, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$51 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values3 = getValuesAsVector();
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
                                        restoreValuesFromVector(_values3);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$51, thread);
                                    }
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_target_space$.rebind(_prev_bind_0_$45, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$52 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values4 = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                restoreValuesFromVector(_values4);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$52, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$44, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$53 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values5 = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values5);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$53, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
            }
            return result;
        }
        return NIL;
    }

    /**
     * Returns those all-spec-preds of PRED for which FORT
     * is legal as arguments in position ARG
     */
    @LispMethod(comment = "Returns those all-spec-preds of PRED for which FORT\r\nis legal as arguments in position ARG\nReturns those all-spec-preds of PRED for which FORT\nis legal as arguments in position ARG")
    public static final SubLObject all_spec_preds_wrt_arg_alt(SubLObject pred, SubLObject fort, SubLObject arg, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(pred, FORT_P);
            SubLTrampolineFile.checkType(fort, FORT_P);
            SubLTrampolineFile.checkType(arg, INTEGERP);
            if (((NIL != fort_types_interface.predicateP(pred)) && (NIL != forts.fort_p(fort))) && (NIL != subl_promotions.memberP(arg, czer_vars.$arg_positions$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) {
                {
                    SubLObject result = NIL;
                    {
                        SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                            {
                                SubLObject _prev_bind_0_54 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                try {
                                    sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                    {
                                        SubLObject _prev_bind_0_55 = sbhl_marking_vars.$sbhl_target_space$.currentBinding(thread);
                                        try {
                                            sbhl_marking_vars.$sbhl_target_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                            {
                                                SubLObject _prev_bind_0_56 = sbhl_marking_vars.$sbhl_target_gather_space$.currentBinding(thread);
                                                try {
                                                    sbhl_marking_vars.$sbhl_target_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                    {
                                                        SubLObject _prev_bind_0_57 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                                        try {
                                                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread), thread);
                                                            sbhl_marking_methods.sbhl_mark_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$isa), fort, mt, tv);
                                                            if (NIL != fort_types_interface.collectionP(fort)) {
                                                                sbhl_marking_methods.sbhl_mark_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), fort, mt, tv);
                                                            }
                                                        } finally {
                                                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_57, thread);
                                                        }
                                                    }
                                                    {
                                                        SubLObject _prev_bind_0_58 = sbhl_search_vars.$sbhl_access_arg$.currentBinding(thread);
                                                        SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_result$.currentBinding(thread);
                                                        try {
                                                            sbhl_search_vars.$sbhl_access_arg$.bind(arg, thread);
                                                            sbhl_search_vars.$sbhl_result$.bind(NIL, thread);
                                                            try {
                                                                sbhl_search_methods.sbhl_map_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, GATHER_IF_SEARCHED_ARG_CONSTRAINTS, mt, tv);
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0_59 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        result = sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_59, thread);
                                                                    }
                                                                }
                                                            }
                                                        } finally {
                                                            sbhl_search_vars.$sbhl_result$.rebind(_prev_bind_1, thread);
                                                            sbhl_search_vars.$sbhl_access_arg$.rebind(_prev_bind_0_58, thread);
                                                        }
                                                    }
                                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_gather_space$.getDynamicValue(thread));
                                                } finally {
                                                    sbhl_marking_vars.$sbhl_target_gather_space$.rebind(_prev_bind_0_56, thread);
                                                }
                                            }
                                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
                                        } finally {
                                            sbhl_marking_vars.$sbhl_target_space$.rebind(_prev_bind_0_55, thread);
                                        }
                                    }
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                } finally {
                                    sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_54, thread);
                                }
                            }
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        } finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                        }
                    }
                    return result;
                }
            }
            return NIL;
        }
    }

    /**
     * Returns those all-spec-preds of PRED for which FORT
     * is legal as arguments in position ARG
     */
    @LispMethod(comment = "Returns those all-spec-preds of PRED for which FORT\r\nis legal as arguments in position ARG\nReturns those all-spec-preds of PRED for which FORT\nis legal as arguments in position ARG")
    public static SubLObject all_spec_preds_wrt_arg(final SubLObject pred, final SubLObject fort, final SubLObject arg, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(pred, FORT_P);
        SubLTrampolineFile.enforceType(fort, FORT_P);
        SubLTrampolineFile.enforceType(arg, INTEGERP);
        if (((NIL != fort_types_interface.predicateP(pred)) && (NIL != forts.fort_p(fort))) && (NIL != subl_promotions.memberP(arg, czer_vars.$arg_positions$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) {
            SubLObject result = NIL;
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject _prev_bind_0_$54 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject _prev_bind_0_$55 = sbhl_marking_vars.$sbhl_target_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_target_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                try {
                                    final SubLObject _prev_bind_0_$56 = sbhl_marking_vars.$sbhl_target_gather_space$.currentBinding(thread);
                                    try {
                                        sbhl_marking_vars.$sbhl_target_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                        try {
                                            final SubLObject _prev_bind_0_$57 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                            try {
                                                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread), thread);
                                                sbhl_marking_methods.sbhl_mark_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$isa), fort, mt, tv);
                                                if (NIL != fort_types_interface.collectionP(fort)) {
                                                    sbhl_marking_methods.sbhl_mark_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), fort, mt, tv);
                                                }
                                            } finally {
                                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$57, thread);
                                            }
                                            final SubLObject _prev_bind_0_$58 = sbhl_search_vars.$sbhl_access_arg$.currentBinding(thread);
                                            final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_result$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_access_arg$.bind(arg, thread);
                                                sbhl_search_vars.$sbhl_result$.bind(NIL, thread);
                                                try {
                                                    sbhl_search_methods.sbhl_map_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, GATHER_IF_SEARCHED_ARG_CONSTRAINTS, mt, tv);
                                                } finally {
                                                    final SubLObject _prev_bind_0_$59 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        final SubLObject _values = getValuesAsVector();
                                                        result = sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
                                                        restoreValuesFromVector(_values);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$59, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$sbhl_result$.rebind(_prev_bind_2, thread);
                                                sbhl_search_vars.$sbhl_access_arg$.rebind(_prev_bind_0_$58, thread);
                                            }
                                        } finally {
                                            final SubLObject _prev_bind_0_$60 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values2 = getValuesAsVector();
                                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_gather_space$.getDynamicValue(thread));
                                                restoreValuesFromVector(_values2);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$60, thread);
                                            }
                                        }
                                    } finally {
                                        sbhl_marking_vars.$sbhl_target_gather_space$.rebind(_prev_bind_0_$56, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$61 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values3 = getValuesAsVector();
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
                                        restoreValuesFromVector(_values3);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$61, thread);
                                    }
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_target_space$.rebind(_prev_bind_0_$55, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$62 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values4 = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                restoreValuesFromVector(_values4);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$62, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$54, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$63 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values5 = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values5);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$63, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
            }
            return result;
        }
        return NIL;
    }

    /**
     * Checks the arg-isas and arg-genls of PRED, and if unmarked in target space, pushes pred onto sbhl-result.
     */
    @LispMethod(comment = "Checks the arg-isas and arg-genls of PRED, and if unmarked in target space, pushes pred onto sbhl-result.")
    public static final SubLObject gather_if_searched_arg_constraints_alt(SubLObject pred) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject arg_isas = kb_accessors.argn_isa(pred, sbhl_search_vars.$sbhl_access_arg$.getDynamicValue(thread), UNPROVIDED);
                SubLObject noP = sublisp_null(arg_isas);
                {
                    SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread), thread);
                        if (NIL == noP) {
                            {
                                SubLObject csome_list_var = arg_isas;
                                SubLObject arg_isa = NIL;
                                for (arg_isa = csome_list_var.first(); !((NIL != noP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , arg_isa = csome_list_var.first()) {
                                    noP = makeBoolean(NIL == sbhl_marking_utilities.sbhl_marked_node_p(arg_isa, UNPROVIDED));
                                }
                            }
                        }
                        if (NIL == noP) {
                            {
                                SubLObject csome_list_var = kb_accessors.argn_genl(pred, sbhl_search_vars.$sbhl_access_arg$.getDynamicValue(thread), UNPROVIDED);
                                SubLObject arg_genl = NIL;
                                for (arg_genl = csome_list_var.first(); !((NIL != noP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , arg_genl = csome_list_var.first()) {
                                    noP = makeBoolean(NIL == sbhl_marking_utilities.sbhl_marked_node_p(arg_genl, UNPROVIDED));
                                }
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL == noP) {
                    sbhl_search_vars.$sbhl_result$.setDynamicValue(cons(pred, sbhl_search_vars.$sbhl_result$.getDynamicValue(thread)), thread);
                }
            }
            return NIL;
        }
    }

    /**
     * Checks the arg-isas and arg-genls of PRED, and if unmarked in target space, pushes pred onto sbhl-result.
     */
    @LispMethod(comment = "Checks the arg-isas and arg-genls of PRED, and if unmarked in target space, pushes pred onto sbhl-result.")
    public static SubLObject gather_if_searched_arg_constraints(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg_isas = kb_accessors.argn_isa(pred, sbhl_search_vars.$sbhl_access_arg$.getDynamicValue(thread), UNPROVIDED);
        SubLObject noP = sublisp_null(arg_isas);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread), thread);
            if (NIL == noP) {
                SubLObject csome_list_var;
                SubLObject arg_isa;
                for (csome_list_var = arg_isas, arg_isa = NIL, arg_isa = csome_list_var.first(); (NIL == noP) && (NIL != csome_list_var); noP = makeBoolean(NIL == sbhl_marking_utilities.sbhl_marked_node_p(arg_isa, UNPROVIDED)) , csome_list_var = csome_list_var.rest() , arg_isa = csome_list_var.first()) {
                }
            }
            if (NIL == noP) {
                SubLObject csome_list_var;
                SubLObject arg_genl;
                for (csome_list_var = kb_accessors.argn_genl(pred, sbhl_search_vars.$sbhl_access_arg$.getDynamicValue(thread), UNPROVIDED), arg_genl = NIL, arg_genl = csome_list_var.first(); (NIL == noP) && (NIL != csome_list_var); noP = makeBoolean(NIL == sbhl_marking_utilities.sbhl_marked_node_p(arg_genl, UNPROVIDED)) , csome_list_var = csome_list_var.rest() , arg_genl = csome_list_var.first()) {
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        if (NIL == noP) {
            sbhl_search_vars.$sbhl_result$.setDynamicValue(cons(pred, sbhl_search_vars.$sbhl_result$.getDynamicValue(thread)), thread);
        }
        return NIL;
    }

    /**
     * Accessor. @see *sbhl-arg-type-alist*
     */
    @LispMethod(comment = "Accessor. @see *sbhl-arg-type-alist*")
    public static final SubLObject get_sbhl_arg_type_alist_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sbhl_arg_type_alist$.getDynamicValue(thread);
        }
    }

    /**
     * Accessor. @see *sbhl-arg-type-alist*
     */
    @LispMethod(comment = "Accessor. @see *sbhl-arg-type-alist*")
    public static SubLObject get_sbhl_arg_type_alist() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_arg_type_alist$.getDynamicValue(thread);
    }

    /**
     * Binds *sbhl-arg-type-alist* to ALIST
     */
    @LispMethod(comment = "Binds *sbhl-arg-type-alist* to ALIST")
    public static final SubLObject with_sbhl_arg_type_alist_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject alist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt111);
            alist = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($sbhl_arg_type_alist$, alist)), append(body, NIL));
            }
        }
    }

    /**
     * Binds *sbhl-arg-type-alist* to ALIST
     */
    @LispMethod(comment = "Binds *sbhl-arg-type-alist* to ALIST")
    public static SubLObject with_sbhl_arg_type_alist(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject alist = NIL;
        destructuring_bind_must_consp(current, datum, $list114);
        alist = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($sbhl_arg_type_alist$, alist)), append(body, NIL));
    }

    /**
     * Accessor. @see *sbhl-arg-type-genls-stores*
     */
    @LispMethod(comment = "Accessor. @see *sbhl-arg-type-genls-stores*")
    public static final SubLObject get_sbhl_arg_type_store_alt(SubLObject key_list) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return dictionary.dictionary_lookup($sbhl_arg_type_genls_stores$.getDynamicValue(thread), key_list, UNPROVIDED);
        }
    }

    /**
     * Accessor. @see *sbhl-arg-type-genls-stores*
     */
    @LispMethod(comment = "Accessor. @see *sbhl-arg-type-genls-stores*")
    public static SubLObject get_sbhl_arg_type_store(final SubLObject key_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return dictionary.dictionary_lookup($sbhl_arg_type_genls_stores$.getDynamicValue(thread), key_list, UNPROVIDED);
    }

    /**
     * Binds *sbhl-arg-type-genls-stores* to be a new dictionary. Computes the all-genls of each constraint in ALIST, and stores them in *sbhl-arg-type-genls-stores*.
     */
    @LispMethod(comment = "Binds *sbhl-arg-type-genls-stores* to be a new dictionary. Computes the all-genls of each constraint in ALIST, and stores them in *sbhl-arg-type-genls-stores*.")
    public static final SubLObject with_new_sbhl_arg_type_genls_stores_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject alist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt111);
            alist = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, $list_alt114, list(SBHL_INITIALIZE_ARG_TYPE_GENLS_STORES, alist), append(body, NIL));
            }
        }
    }

    /**
     * Binds *sbhl-arg-type-genls-stores* to be a new dictionary. Computes the all-genls of each constraint in ALIST, and stores them in *sbhl-arg-type-genls-stores*.
     */
    @LispMethod(comment = "Binds *sbhl-arg-type-genls-stores* to be a new dictionary. Computes the all-genls of each constraint in ALIST, and stores them in *sbhl-arg-type-genls-stores*.")
    public static SubLObject with_new_sbhl_arg_type_genls_stores(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject alist = NIL;
        destructuring_bind_must_consp(current, datum, $list114);
        alist = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, $list117, list(SBHL_INITIALIZE_ARG_TYPE_GENLS_STORES, alist), append(body, NIL));
    }

    /**
     * Computes the all-genls of each constraint in ALIST, and stores them in *sbhl-arg-type-genls-stores*.
     */
    @LispMethod(comment = "Computes the all-genls of each constraint in ALIST, and stores them in *sbhl-arg-type-genls-stores*.")
    public static final SubLObject sbhl_initialize_arg_type_genls_stores_alt(SubLObject alist) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = alist;
                SubLObject arg_info = NIL;
                for (arg_info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg_info = cdolist_list_var.first()) {
                    {
                        SubLObject arg = arg_info.first();
                        SubLObject cdolist_list_var_60 = second(arg_info);
                        SubLObject constraints = NIL;
                        for (constraints = cdolist_list_var_60.first(); NIL != cdolist_list_var_60; cdolist_list_var_60 = cdolist_list_var_60.rest() , constraints = cdolist_list_var_60.first()) {
                            {
                                SubLObject constraint_pred = constraints.first();
                                SubLObject cdolist_list_var_61 = constraints.rest();
                                SubLObject constraint_col = NIL;
                                for (constraint_col = cdolist_list_var_61.first(); NIL != cdolist_list_var_61; cdolist_list_var_61 = cdolist_list_var_61.rest() , constraint_col = cdolist_list_var_61.first()) {
                                    {
                                        SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                        try {
                                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                            sbhl_marking_methods.sbhl_mark_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), constraint_col, UNPROVIDED, UNPROVIDED);
                                            dictionary.dictionary_enter($sbhl_arg_type_genls_stores$.getDynamicValue(thread), list(arg, constraint_pred, constraint_col), sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                        } finally {
                                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Computes the all-genls of each constraint in ALIST, and stores them in *sbhl-arg-type-genls-stores*.
     */
    @LispMethod(comment = "Computes the all-genls of each constraint in ALIST, and stores them in *sbhl-arg-type-genls-stores*.")
    public static SubLObject sbhl_initialize_arg_type_genls_stores(final SubLObject alist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = alist;
        SubLObject arg_info = NIL;
        arg_info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject arg = arg_info.first();
            SubLObject cdolist_list_var_$64 = second(arg_info);
            SubLObject constraints = NIL;
            constraints = cdolist_list_var_$64.first();
            while (NIL != cdolist_list_var_$64) {
                final SubLObject constraint_pred = constraints.first();
                SubLObject cdolist_list_var_$65 = constraints.rest();
                SubLObject constraint_col = NIL;
                constraint_col = cdolist_list_var_$65.first();
                while (NIL != cdolist_list_var_$65) {
                    final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            sbhl_marking_methods.sbhl_mark_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), constraint_col, UNPROVIDED, UNPROVIDED);
                            dictionary.dictionary_enter($sbhl_arg_type_genls_stores$.getDynamicValue(thread), list(arg, constraint_pred, constraint_col), sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        } finally {
                            final SubLObject _prev_bind_0_$66 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$66, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                    }
                    cdolist_list_var_$65 = cdolist_list_var_$65.rest();
                    constraint_col = cdolist_list_var_$65.first();
                } 
                cdolist_list_var_$64 = cdolist_list_var_$64.rest();
                constraints = cdolist_list_var_$64.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            arg_info = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     * Determines whether the arg type constraints of PRED would be satisfied by the constraints given in @see *sbhl-arg-type-alist*.
     */
    @LispMethod(comment = "Determines whether the arg type constraints of PRED would be satisfied by the constraints given in @see *sbhl-arg-type-alist*.")
    public static final SubLObject sbhl_arg_types_alist_satisfied_p_alt(SubLObject pred) {
        {
            SubLObject failP = NIL;
            if (NIL == failP) {
                {
                    SubLObject csome_list_var = com.cyc.cycjava.cycl.genl_predicates.get_sbhl_arg_type_alist();
                    SubLObject arg_info = NIL;
                    for (arg_info = csome_list_var.first(); !((NIL != failP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , arg_info = csome_list_var.first()) {
                        {
                            SubLObject arg = arg_info.first();
                            SubLObject arg_constraint_arg = arg;
                            if ((NIL != sbhl_search_vars.genl_inverse_mode_p()) && (arg.numE(ONE_INTEGER) || arg.numE(TWO_INTEGER))) {
                                arg_constraint_arg = misc_utilities.other_binary_arg(arg);
                            }
                            if (NIL == failP) {
                                {
                                    SubLObject csome_list_var_62 = second(arg_info);
                                    SubLObject constraints = NIL;
                                    for (constraints = csome_list_var_62.first(); !((NIL != failP) || (NIL == csome_list_var_62)); csome_list_var_62 = csome_list_var_62.rest() , constraints = csome_list_var_62.first()) {
                                        {
                                            SubLObject constraint_pred = constraints.first();
                                            SubLObject constraint_cols = constraints.rest();
                                            SubLObject constraints_63 = NIL;
                                            SubLObject successP = NIL;
                                            SubLObject pcase_var = constraint_pred;
                                            if (pcase_var.eql($$isa)) {
                                                constraints_63 = kb_accessors.argn_isa(pred, arg_constraint_arg, UNPROVIDED);
                                            } else {
                                                if (pcase_var.eql($$genls)) {
                                                    constraints_63 = kb_accessors.argn_genl(pred, arg_constraint_arg, UNPROVIDED);
                                                }
                                            }
                                            if (NIL == constraints_63) {
                                                successP = T;
                                            } else {
                                                if (NIL == successP) {
                                                    {
                                                        SubLObject csome_list_var_64 = constraint_cols;
                                                        SubLObject col = NIL;
                                                        for (col = csome_list_var_64.first(); !((NIL != successP) || (NIL == csome_list_var_64)); csome_list_var_64 = csome_list_var_64.rest() , col = csome_list_var_64.first()) {
                                                            {
                                                                SubLObject store_key = list(arg, constraint_pred, col);
                                                                if (NIL == successP) {
                                                                    {
                                                                        SubLObject csome_list_var_65 = constraints_63;
                                                                        SubLObject arg_constraint = NIL;
                                                                        for (arg_constraint = csome_list_var_65.first(); !((NIL != successP) || (NIL == csome_list_var_65)); csome_list_var_65 = csome_list_var_65.rest() , arg_constraint = csome_list_var_65.first()) {
                                                                            if (NIL != sbhl_marking_utilities.sbhl_marked_node_p(arg_constraint, com.cyc.cycjava.cycl.genl_predicates.get_sbhl_arg_type_store(store_key))) {
                                                                                successP = T;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (NIL == successP) {
                                                failP = T;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return makeBoolean(NIL == failP);
        }
    }

    /**
     * Determines whether the arg type constraints of PRED would be satisfied by the constraints given in @see *sbhl-arg-type-alist*.
     */
    @LispMethod(comment = "Determines whether the arg type constraints of PRED would be satisfied by the constraints given in @see *sbhl-arg-type-alist*.")
    public static SubLObject sbhl_arg_types_alist_satisfied_p(final SubLObject pred) {
        SubLObject failP = NIL;
        if (NIL == failP) {
            SubLObject csome_list_var = get_sbhl_arg_type_alist();
            SubLObject arg_info = NIL;
            arg_info = csome_list_var.first();
            while ((NIL == failP) && (NIL != csome_list_var)) {
                SubLObject arg_constraint_arg;
                final SubLObject arg = arg_constraint_arg = arg_info.first();
                if ((NIL != sbhl_search_vars.genl_inverse_mode_p()) && (arg.numE(ONE_INTEGER) || arg.numE(TWO_INTEGER))) {
                    arg_constraint_arg = misc_utilities.other_binary_arg(arg);
                }
                if (NIL == failP) {
                    SubLObject csome_list_var_$67 = second(arg_info);
                    SubLObject constraints = NIL;
                    constraints = csome_list_var_$67.first();
                    while ((NIL == failP) && (NIL != csome_list_var_$67)) {
                        final SubLObject constraint_pred = constraints.first();
                        final SubLObject constraint_cols = constraints.rest();
                        SubLObject constraints_$68 = NIL;
                        SubLObject successP = NIL;
                        final SubLObject pcase_var = constraint_pred;
                        if (pcase_var.eql($$isa)) {
                            constraints_$68 = kb_accessors.argn_isa(pred, arg_constraint_arg, UNPROVIDED);
                        } else
                            if (pcase_var.eql($$genls)) {
                                constraints_$68 = kb_accessors.argn_genl(pred, arg_constraint_arg, UNPROVIDED);
                            }

                        if (NIL == constraints_$68) {
                            successP = T;
                        } else
                            if (NIL == successP) {
                                SubLObject csome_list_var_$68 = constraint_cols;
                                SubLObject col = NIL;
                                col = csome_list_var_$68.first();
                                while ((NIL == successP) && (NIL != csome_list_var_$68)) {
                                    final SubLObject store_key = list(arg, constraint_pred, col);
                                    if (NIL == successP) {
                                        SubLObject csome_list_var_$69 = constraints_$68;
                                        SubLObject arg_constraint = NIL;
                                        arg_constraint = csome_list_var_$69.first();
                                        while ((NIL == successP) && (NIL != csome_list_var_$69)) {
                                            if (NIL != sbhl_marking_utilities.sbhl_marked_node_p(arg_constraint, get_sbhl_arg_type_store(store_key))) {
                                                successP = T;
                                            }
                                            csome_list_var_$69 = csome_list_var_$69.rest();
                                            arg_constraint = csome_list_var_$69.first();
                                        } 
                                    }
                                    csome_list_var_$68 = csome_list_var_$68.rest();
                                    col = csome_list_var_$68.first();
                                } 
                            }

                        if (NIL == successP) {
                            failP = T;
                        }
                        csome_list_var_$67 = csome_list_var_$67.rest();
                        constraints = csome_list_var_$67.first();
                    } 
                }
                csome_list_var = csome_list_var.rest();
                arg_info = csome_list_var.first();
            } 
        }
        return makeBoolean(NIL == failP);
    }

    /**
     *
     *
     * @return listp; the minimal spec-predicates of PRED that satisfy the constraints given in ALIST.
     */
    @LispMethod(comment = "@return listp; the minimal spec-predicates of PRED that satisfy the constraints given in ALIST.")
    public static final SubLObject leaf_predicates_wrt_arg_type_alt(SubLObject pred, SubLObject alist) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $sbhl_arg_type_alist$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $sbhl_arg_type_genls_stores$.currentBinding(thread);
                    try {
                        $sbhl_arg_type_alist$.bind(alist, thread);
                        $sbhl_arg_type_genls_stores$.bind(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
                        com.cyc.cycjava.cycl.genl_predicates.sbhl_initialize_arg_type_genls_stores(alist);
                        result = sbhl_search_utilities.sbhl_min_backward_true_nodes_such_that(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, SBHL_ARG_TYPES_ALIST_SATISFIED_P, UNPROVIDED, UNPROVIDED);
                    } finally {
                        $sbhl_arg_type_genls_stores$.rebind(_prev_bind_1, thread);
                        $sbhl_arg_type_alist$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @return listp; the minimal spec-predicates of PRED that satisfy the constraints given in ALIST.
     */
    @LispMethod(comment = "@return listp; the minimal spec-predicates of PRED that satisfy the constraints given in ALIST.")
    public static SubLObject leaf_predicates_wrt_arg_type(final SubLObject pred, final SubLObject alist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $sbhl_arg_type_alist$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $sbhl_arg_type_genls_stores$.currentBinding(thread);
        try {
            $sbhl_arg_type_alist$.bind(alist, thread);
            $sbhl_arg_type_genls_stores$.bind(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
            sbhl_initialize_arg_type_genls_stores(alist);
            result = sbhl_search_utilities.sbhl_min_backward_true_nodes_such_that(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, SBHL_ARG_TYPES_ALIST_SATISFIED_P, UNPROVIDED, UNPROVIDED);
        } finally {
            $sbhl_arg_type_genls_stores$.rebind(_prev_bind_2, thread);
            $sbhl_arg_type_alist$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject sbhl_add_leaf_predicates_to_result_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != sbhl_search_vars.genl_inverse_mode_p()) {
                sbhl_search_vars.$sbhl_result$.setDynamicValue(list_utilities.assoc_pushnew(sbhl_module_vars.get_sbhl_module($$genlInverse), node, sbhl_search_vars.$sbhl_result$.getDynamicValue(thread), UNPROVIDED), thread);
            } else {
                sbhl_search_vars.$sbhl_result$.setDynamicValue(list_utilities.assoc_pushnew(sbhl_module_vars.get_sbhl_module($$genlPreds), node, sbhl_search_vars.$sbhl_result$.getDynamicValue(thread), UNPROVIDED), thread);
            }
            return NIL;
        }
    }

    public static SubLObject sbhl_add_leaf_predicates_to_result(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != sbhl_search_vars.genl_inverse_mode_p()) {
            sbhl_search_vars.$sbhl_result$.setDynamicValue(list_utilities.assoc_pushnew(sbhl_module_vars.get_sbhl_module($$genlInverse), node, sbhl_search_vars.$sbhl_result$.getDynamicValue(thread), UNPROVIDED), thread);
        } else {
            sbhl_search_vars.$sbhl_result$.setDynamicValue(list_utilities.assoc_pushnew(sbhl_module_vars.get_sbhl_module($$genlPreds), node, sbhl_search_vars.$sbhl_result$.getDynamicValue(thread), UNPROVIDED), thread);
        }
        return NIL;
    }

    public static final SubLObject pred_is_typed_spec_pred_p_alt(SubLObject node, SubLObject parent) {
        {
            SubLObject doneP = NIL;
            if (sbhl_module_vars.get_sbhl_module(UNPROVIDED) == sbhl_module_vars.get_sbhl_module($$genlPreds)) {
                {
                    SubLObject pred_var = $$typedGenlPreds;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(node, ONE_INTEGER, pred_var)) {
                        {
                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(node, ONE_INTEGER, pred_var);
                            SubLObject done_var = doneP;
                            SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                {
                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                    if (NIL != valid) {
                                        {
                                            SubLObject final_index_iterator = NIL;
                                            try {
                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                {
                                                    SubLObject done_var_66 = doneP;
                                                    SubLObject token_var_67 = NIL;
                                                    while (NIL == done_var_66) {
                                                        {
                                                            SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_67);
                                                            SubLObject valid_68 = makeBoolean(token_var_67 != ass);
                                                            if (NIL != valid_68) {
                                                                if (parent == third(assertions_high.gaf_formula(ass))) {
                                                                    doneP = T;
                                                                }
                                                            }
                                                            done_var_66 = makeBoolean((NIL == valid_68) || (NIL != doneP));
                                                        }
                                                    } 
                                                }
                                            } finally {
                                                {
                                                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                                    try {
                                                        bind($is_thread_performing_cleanupP$, T);
                                                        if (NIL != final_index_iterator) {
                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                        }
                                                    } finally {
                                                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    done_var = makeBoolean((NIL == valid) || (NIL != doneP));
                                }
                            } 
                        }
                    }
                }
            } else {
                {
                    SubLObject pred_var = $$typedGenlInverse;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(node, ONE_INTEGER, pred_var)) {
                        {
                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(node, ONE_INTEGER, pred_var);
                            SubLObject done_var = doneP;
                            SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                {
                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                    if (NIL != valid) {
                                        {
                                            SubLObject final_index_iterator = NIL;
                                            try {
                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                {
                                                    SubLObject done_var_69 = doneP;
                                                    SubLObject token_var_70 = NIL;
                                                    while (NIL == done_var_69) {
                                                        {
                                                            SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_70);
                                                            SubLObject valid_71 = makeBoolean(token_var_70 != ass);
                                                            if (NIL != valid_71) {
                                                                if (parent == third(assertions_high.gaf_formula(ass))) {
                                                                    doneP = T;
                                                                }
                                                            }
                                                            done_var_69 = makeBoolean((NIL == valid_71) || (NIL != doneP));
                                                        }
                                                    } 
                                                }
                                            } finally {
                                                {
                                                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                                    try {
                                                        bind($is_thread_performing_cleanupP$, T);
                                                        if (NIL != final_index_iterator) {
                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                        }
                                                    } finally {
                                                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    done_var = makeBoolean((NIL == valid) || (NIL != doneP));
                                }
                            } 
                        }
                    }
                }
            }
            return doneP;
        }
    }

    public static SubLObject pred_is_typed_spec_pred_p(final SubLObject node, final SubLObject parent) {
        SubLObject doneP = NIL;
        if (sbhl_module_vars.get_sbhl_module(UNPROVIDED).eql(sbhl_module_vars.get_sbhl_module($$genlPreds))) {
            final SubLObject pred_var = $$typedGenlPreds;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(node, ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(node, ONE_INTEGER, pred_var);
                SubLObject done_var = doneP;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$71 = doneP;
                            final SubLObject token_var_$72 = NIL;
                            while (NIL == done_var_$71) {
                                final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$72);
                                final SubLObject valid_$73 = makeBoolean(!token_var_$72.eql(ass));
                                if ((NIL != valid_$73) && parent.eql(third(assertions_high.gaf_formula(ass)))) {
                                    doneP = T;
                                }
                                done_var_$71 = makeBoolean((NIL == valid_$73) || (NIL != doneP));
                            } 
                        } finally {
                            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                    done_var = makeBoolean((NIL == valid) || (NIL != doneP));
                } 
            }
        } else {
            final SubLObject pred_var = $$typedGenlInverse;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(node, ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(node, ONE_INTEGER, pred_var);
                SubLObject done_var = doneP;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$72 = doneP;
                            final SubLObject token_var_$73 = NIL;
                            while (NIL == done_var_$72) {
                                final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$73);
                                final SubLObject valid_$74 = makeBoolean(!token_var_$73.eql(ass));
                                if ((NIL != valid_$74) && parent.eql(third(assertions_high.gaf_formula(ass)))) {
                                    doneP = T;
                                }
                                done_var_$72 = makeBoolean((NIL == valid_$74) || (NIL != doneP));
                            } 
                        } finally {
                            final SubLObject _prev_bind_2 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                final SubLObject _values2 = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values2);
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_2);
                            }
                        }
                    }
                    done_var = makeBoolean((NIL == valid) || (NIL != doneP));
                } 
            }
        }
        return doneP;
    }

    /**
     * Returns the spec preds and inverses of PRED such that they satisfy ALIST and have a typedGenlPred/Inverse link.
     */
    @LispMethod(comment = "Returns the spec preds and inverses of PRED such that they satisfy ALIST and have a typedGenlPred/Inverse link.")
    public static final SubLObject typed_spec_predicates_wrt_arg_type_alt(SubLObject pred, SubLObject alist) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_result$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_result$.bind(NIL, thread);
                        try {
                            {
                                SubLObject _prev_bind_0_72 = $sbhl_arg_type_alist$.currentBinding(thread);
                                SubLObject _prev_bind_1 = $sbhl_arg_type_genls_stores$.currentBinding(thread);
                                try {
                                    $sbhl_arg_type_alist$.bind(alist, thread);
                                    $sbhl_arg_type_genls_stores$.bind(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
                                    com.cyc.cycjava.cycl.genl_predicates.sbhl_initialize_arg_type_genls_stores(alist);
                                    {
                                        SubLObject _prev_bind_0_73 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                        SubLObject _prev_bind_1_74 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                        SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                            {
                                                SubLObject tv_var = NIL;
                                                {
                                                    SubLObject _prev_bind_0_75 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_76 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                        if (NIL != tv_var) {
                                                            if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                                if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                    {
                                                                        SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                        if (pcase_var.eql($ERROR)) {
                                                                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt53$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                        } else {
                                                                            if (pcase_var.eql($CERROR)) {
                                                                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt53$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                            } else {
                                                                                if (pcase_var.eql($WARN)) {
                                                                                    Errors.warn($str_alt53$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                } else {
                                                                                    Errors.warn($str_alt58$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                                    Errors.cerror($$$continue_anyway, $str_alt53$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        {
                                                            SubLObject _prev_bind_0_77 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                                                            SubLObject _prev_bind_1_78 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                            SubLObject _prev_bind_2_79 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                            try {
                                                                sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                                                                {
                                                                    SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                                                                    {
                                                                        SubLObject _prev_bind_0_80 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? ((SubLObject) (sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread))) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                                                            {
                                                                                SubLObject _prev_bind_0_81 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? ((SubLObject) (sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                                                                    {
                                                                                        SubLObject _prev_bind_0_82 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                                                                        SubLObject _prev_bind_1_83 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                                                                        SubLObject _prev_bind_2_84 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                                                        SubLObject _prev_bind_3_85 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                                                                        SubLObject _prev_bind_4_86 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                                                                            sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                                                                            sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                                                                            sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                            {
                                                                                                SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                                                                                SubLObject needs_to_releaseP = NIL;
                                                                                                try {
                                                                                                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                                                                                    com.cyc.cycjava.cycl.genl_predicates.leaf_predicates_mark_and_sweep(pred);
                                                                                                } finally {
                                                                                                    if (NIL != needs_to_releaseP) {
                                                                                                        ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } finally {
                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_86, thread);
                                                                                            sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_85, thread);
                                                                                            sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_84, thread);
                                                                                            sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_83, thread);
                                                                                            sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_82, thread);
                                                                                        }
                                                                                    }
                                                                                    if (source == $RESOURCE) {
                                                                                        sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_81, thread);
                                                                                }
                                                                            }
                                                                            if (source == $RESOURCE) {
                                                                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                                            }
                                                                        } finally {
                                                                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_80, thread);
                                                                        }
                                                                    }
                                                                }
                                                            } finally {
                                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_79, thread);
                                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_78, thread);
                                                                sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_77, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_76, thread);
                                                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_75, thread);
                                                    }
                                                }
                                            }
                                        } finally {
                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_74, thread);
                                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_73, thread);
                                        }
                                    }
                                } finally {
                                    $sbhl_arg_type_genls_stores$.rebind(_prev_bind_1, thread);
                                    $sbhl_arg_type_alist$.rebind(_prev_bind_0_72, thread);
                                }
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0_87 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    result = sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_87, thread);
                                }
                            }
                        }
                    } finally {
                        sbhl_search_vars.$sbhl_result$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Returns the spec preds and inverses of PRED such that they satisfy ALIST and have a typedGenlPred/Inverse link.
     */
    @LispMethod(comment = "Returns the spec preds and inverses of PRED such that they satisfy ALIST and have a typedGenlPred/Inverse link.")
    public static SubLObject typed_spec_predicates_wrt_arg_type(final SubLObject pred, final SubLObject alist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_result$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_result$.bind(NIL, thread);
            try {
                final SubLObject _prev_bind_0_$77 = $sbhl_arg_type_alist$.currentBinding(thread);
                final SubLObject _prev_bind_2 = $sbhl_arg_type_genls_stores$.currentBinding(thread);
                try {
                    $sbhl_arg_type_alist$.bind(alist, thread);
                    $sbhl_arg_type_genls_stores$.bind(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
                    sbhl_initialize_arg_type_genls_stores(alist);
                    final SubLObject _prev_bind_0_$78 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$79 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                        final SubLObject tv_var = NIL;
                        final SubLObject _prev_bind_0_$79 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$80 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str53$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str53$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($WARN)) {
                                            Errors.warn($str53$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn($str58$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str53$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        }


                            }
                            final SubLObject _prev_bind_0_$80 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$81 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$84 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                                final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                                final SubLObject _prev_bind_0_$81 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                try {
                                    sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                    final SubLObject _prev_bind_0_$82 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                    try {
                                        sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                        final SubLObject _prev_bind_0_$83 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$82 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$85 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                        final SubLObject _prev_bind_3_$90 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                        final SubLObject _prev_bind_4_$91 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
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
                                                leaf_predicates_mark_and_sweep(pred);
                                            } finally {
                                                if (NIL != needs_to_releaseP) {
                                                    ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                                }
                                            }
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_$91, thread);
                                            sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_$90, thread);
                                            sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_$85, thread);
                                            sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_$82, thread);
                                            sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_$83, thread);
                                        }
                                        if (source == $RESOURCE) {
                                            sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                        }
                                    } finally {
                                        sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$82, thread);
                                    }
                                    if (source == $RESOURCE) {
                                        sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    }
                                } finally {
                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$81, thread);
                                }
                            } finally {
                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$84, thread);
                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_$81, thread);
                                sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_$80, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$80, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$79, thread);
                        }
                    } finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$79, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$78, thread);
                    }
                } finally {
                    $sbhl_arg_type_genls_stores$.rebind(_prev_bind_2, thread);
                    $sbhl_arg_type_alist$.rebind(_prev_bind_0_$77, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$84 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    result = sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$84, thread);
                }
            }
        } finally {
            sbhl_search_vars.$sbhl_result$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject leaf_predicates_mark_and_sweep_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == sbhl_marking_utilities.sbhl_marked_node_p(node, UNPROVIDED)) {
                sbhl_marking_utilities.sbhl_mark_node(node, UNPROVIDED);
                {
                    SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                    SubLObject rest = NIL;
                    for (rest = accessible_modules; !((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL == rest)); rest = rest.rest()) {
                        {
                            SubLObject module_var = rest.first();
                            {
                                SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                SubLObject _prev_bind_1 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                    {
                                        SubLObject node_88 = function_terms.naut_to_nart(node);
                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node_88)) {
                                            {
                                                SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_88, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                if (NIL != d_link) {
                                                    {
                                                        SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != mt_links) {
                                                            {
                                                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                while (!((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                                                                    thread.resetMultipleValues();
                                                                    {
                                                                        SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            {
                                                                                SubLObject _prev_bind_0_89 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                    {
                                                                                        SubLObject iteration_state_90 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                        while (!((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_90)))) {
                                                                                            thread.resetMultipleValues();
                                                                                            {
                                                                                                SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_90);
                                                                                                SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                thread.resetMultipleValues();
                                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                    {
                                                                                                        SubLObject _prev_bind_0_91 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                        try {
                                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                            {
                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                SubLObject rest_92 = NIL;
                                                                                                                for (rest_92 = new_list; !((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL == rest_92)); rest_92 = rest_92.rest()) {
                                                                                                                    {
                                                                                                                        SubLObject link_node = rest_92.first();
                                                                                                                        if (NIL != com.cyc.cycjava.cycl.genl_predicates.sbhl_arg_types_alist_satisfied_p(link_node)) {
                                                                                                                            if (NIL != com.cyc.cycjava.cycl.genl_predicates.pred_is_typed_spec_pred_p(link_node, node)) {
                                                                                                                                com.cyc.cycjava.cycl.genl_predicates.sbhl_add_leaf_predicates_to_result(link_node);
                                                                                                                            }
                                                                                                                            com.cyc.cycjava.cycl.genl_predicates.leaf_predicates_mark_and_sweep(link_node);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        } finally {
                                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_91, thread);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                iteration_state_90 = dictionary_contents.do_dictionary_contents_next(iteration_state_90);
                                                                                            }
                                                                                        } 
                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_90);
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_89, thread);
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
                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt59$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                }
                                            }
                                        } else {
                                            if (NIL != obsolete.cnat_p(node_88, UNPROVIDED)) {
                                                {
                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                    SubLObject rest_93 = NIL;
                                                    for (rest_93 = new_list; !((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL == rest_93)); rest_93 = rest_93.rest()) {
                                                        {
                                                            SubLObject generating_fn = rest_93.first();
                                                            {
                                                                SubLObject _prev_bind_0_94 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    {
                                                                        SubLObject link_nodes = funcall(generating_fn, node_88);
                                                                        SubLObject new_list_95 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                        SubLObject rest_96 = NIL;
                                                                        for (rest_96 = new_list_95; !((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) || (NIL == rest_96)); rest_96 = rest_96.rest()) {
                                                                            {
                                                                                SubLObject link_node = rest_96.first();
                                                                                if (NIL != com.cyc.cycjava.cycl.genl_predicates.sbhl_arg_types_alist_satisfied_p(link_node)) {
                                                                                    if (NIL != com.cyc.cycjava.cycl.genl_predicates.pred_is_typed_spec_pred_p(link_node, node)) {
                                                                                        com.cyc.cycjava.cycl.genl_predicates.sbhl_add_leaf_predicates_to_result(link_node);
                                                                                    }
                                                                                    com.cyc.cycjava.cycl.genl_predicates.leaf_predicates_mark_and_sweep(link_node);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_94, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1, thread);
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject leaf_predicates_mark_and_sweep(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == sbhl_marking_utilities.sbhl_marked_node_p(node, UNPROVIDED)) {
            sbhl_marking_utilities.sbhl_mark_node(node, UNPROVIDED);
            final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
            SubLObject rest;
            SubLObject module_var;
            SubLObject _prev_bind_0;
            SubLObject _prev_bind_2;
            SubLObject node_$93;
            SubLObject d_link;
            SubLObject mt_links;
            SubLObject iteration_state;
            SubLObject mt;
            SubLObject tv_links;
            SubLObject _prev_bind_0_$94;
            SubLObject iteration_state_$95;
            SubLObject tv;
            SubLObject link_nodes;
            SubLObject _prev_bind_0_$95;
            SubLObject sol;
            SubLObject set_contents_var;
            SubLObject basis_object;
            SubLObject state;
            SubLObject link_node;
            SubLObject csome_list_var;
            SubLObject link_node2;
            SubLObject new_list;
            SubLObject rest_$97;
            SubLObject generating_fn;
            SubLObject _prev_bind_0_$96;
            SubLObject sol2;
            SubLObject link_nodes2;
            SubLObject set_contents_var2;
            SubLObject basis_object2;
            SubLObject state2;
            SubLObject link_node3;
            SubLObject csome_list_var2;
            SubLObject link_node4;
            for (rest = NIL, rest = accessible_modules; (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != rest); rest = rest.rest()) {
                module_var = rest.first();
                _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                _prev_bind_2 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                try {
                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                    node_$93 = function_terms.naut_to_nart(node);
                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node_$93)) {
                        d_link = sbhl_graphs.get_sbhl_graph_link(node_$93, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                        if (NIL != d_link) {
                            mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                            if (NIL != mt_links) {
                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                    thread.resetMultipleValues();
                                    mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                    tv_links = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                        _prev_bind_0_$94 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                        try {
                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                            for (iteration_state_$95 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$95)); iteration_state_$95 = dictionary_contents.do_dictionary_contents_next(iteration_state_$95)) {
                                                thread.resetMultipleValues();
                                                tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$95);
                                                link_nodes = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                    _prev_bind_0_$95 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                    try {
                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                        sol = link_nodes;
                                                        if (NIL != set.set_p(sol)) {
                                                            set_contents_var = set.do_set_internal(sol);
                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, link_node)) && (NIL != sbhl_arg_types_alist_satisfied_p(link_node))) {
                                                                    if (NIL != pred_is_typed_spec_pred_p(link_node, node)) {
                                                                        sbhl_add_leaf_predicates_to_result(link_node);
                                                                    }
                                                                    leaf_predicates_mark_and_sweep(link_node);
                                                                }
                                                            }
                                                        } else
                                                            if (sol.isList()) {
                                                                if (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) {
                                                                    csome_list_var = sol;
                                                                    link_node2 = NIL;
                                                                    link_node2 = csome_list_var.first();
                                                                    while ((NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var)) {
                                                                        if (NIL != sbhl_arg_types_alist_satisfied_p(link_node2)) {
                                                                            if (NIL != pred_is_typed_spec_pred_p(link_node2, node)) {
                                                                                sbhl_add_leaf_predicates_to_result(link_node2);
                                                                            }
                                                                            leaf_predicates_mark_and_sweep(link_node2);
                                                                        }
                                                                        csome_list_var = csome_list_var.rest();
                                                                        link_node2 = csome_list_var.first();
                                                                    } 
                                                                }
                                                            } else {
                                                                Errors.error($str59$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                            }

                                                    } finally {
                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$95, thread);
                                                    }
                                                }
                                            }
                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$95);
                                        } finally {
                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$94, thread);
                                        }
                                    }
                                }
                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                            }
                        } else {
                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str60$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    } else
                        if (NIL != obsolete.cnat_p(node_$93, UNPROVIDED)) {
                            new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                            for (rest_$97 = NIL, rest_$97 = new_list; (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != rest_$97); rest_$97 = rest_$97.rest()) {
                                generating_fn = rest_$97.first();
                                _prev_bind_0_$96 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                try {
                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                    link_nodes2 = sol2 = funcall(generating_fn, node_$93);
                                    if (NIL != set.set_p(sol2)) {
                                        set_contents_var2 = set.do_set_internal(sol2);
                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                            link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                            if ((NIL != set_contents.do_set_contents_element_validP(state2, link_node3)) && (NIL != sbhl_arg_types_alist_satisfied_p(link_node3))) {
                                                if (NIL != pred_is_typed_spec_pred_p(link_node3, node)) {
                                                    sbhl_add_leaf_predicates_to_result(link_node3);
                                                }
                                                leaf_predicates_mark_and_sweep(link_node3);
                                            }
                                        }
                                    } else
                                        if (sol2.isList()) {
                                            if (NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) {
                                                csome_list_var2 = sol2;
                                                link_node4 = NIL;
                                                link_node4 = csome_list_var2.first();
                                                while ((NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var2)) {
                                                    if (NIL != sbhl_arg_types_alist_satisfied_p(link_node4)) {
                                                        if (NIL != pred_is_typed_spec_pred_p(link_node4, node)) {
                                                            sbhl_add_leaf_predicates_to_result(link_node4);
                                                        }
                                                        leaf_predicates_mark_and_sweep(link_node4);
                                                    }
                                                    csome_list_var2 = csome_list_var2.rest();
                                                    link_node4 = csome_list_var2.first();
                                                } 
                                            }
                                        } else {
                                            Errors.error($str59$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                        }

                                } finally {
                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$96, thread);
                                }
                            }
                        }

                } finally {
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2, thread);
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return NIL;
    }

    /**
     * Returns the most-specific predicates in PREDS
     */
    @LispMethod(comment = "Returns the most-specific predicates in PREDS")
    public static final SubLObject min_predicates_alt(SubLObject preds, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(preds, LISTP);
        return sbhl_search_methods.sbhl_min_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), preds, mt, tv);
    }

    /**
     * Returns the most-specific predicates in PREDS
     */
    @LispMethod(comment = "Returns the most-specific predicates in PREDS")
    public static SubLObject min_predicates(final SubLObject preds, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(preds, LISTP);
        return sbhl_search_methods.sbhl_min_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), preds, mt, tv);
    }/**
     * Returns the most-specific predicates in PREDS
     */


    /**
     * Returns the most-general predicates in PREDS
     */
    @LispMethod(comment = "Returns the most-general predicates in PREDS")
    public static final SubLObject max_predicates_alt(SubLObject preds, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(preds, LISTP);
        return sbhl_search_methods.sbhl_max_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), preds, mt, tv, UNPROVIDED);
    }

    /**
     * Returns the most-general predicates in PREDS
     */
    @LispMethod(comment = "Returns the most-general predicates in PREDS")
    public static SubLObject max_predicates(final SubLObject preds, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(preds, LISTP);
        return sbhl_search_methods.sbhl_max_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), preds, mt, tv, UNPROVIDED);
    }/**
     * Returns the most-general predicates in PREDS
     */


    /**
     * Returns the most-specific common generalizations (ceilings) of PREDS
     */
    @LispMethod(comment = "Returns the most-specific common generalizations (ceilings) of PREDS")
    public static final SubLObject min_ceiling_predicates_alt(SubLObject preds, SubLObject candidates, SubLObject mt, SubLObject tv) {
        if (candidates == UNPROVIDED) {
            candidates = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(preds, LISTP);
        return sbhl_search_methods.sbhl_min_ceilings(sbhl_module_vars.get_sbhl_module($$genlPreds), preds, candidates, mt, tv);
    }

    /**
     * Returns the most-specific common generalizations (ceilings) of PREDS
     */
    @LispMethod(comment = "Returns the most-specific common generalizations (ceilings) of PREDS")
    public static SubLObject min_ceiling_predicates(final SubLObject preds, SubLObject candidates, SubLObject mt, SubLObject tv) {
        if (candidates == UNPROVIDED) {
            candidates = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(preds, LISTP);
        return sbhl_search_methods.sbhl_min_ceilings(sbhl_module_vars.get_sbhl_module($$genlPreds), preds, candidates, mt, tv);
    }/**
     * Returns the most-specific common generalizations (ceilings) of PREDS
     */


    /**
     * Returns the most-general common specializations (floors) of PREDS
     */
    @LispMethod(comment = "Returns the most-general common specializations (floors) of PREDS")
    public static final SubLObject max_floor_predicates_alt(SubLObject preds, SubLObject candidates, SubLObject mt, SubLObject tv) {
        if (candidates == UNPROVIDED) {
            candidates = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(preds, LISTP);
        if (NIL != list_utilities.doubletonP(preds)) {
            {
                SubLObject datum = preds;
                SubLObject current = datum;
                SubLObject pred1 = NIL;
                SubLObject pred2 = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt131);
                pred1 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt131);
                pred2 = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (pred1 == pred2) {
                        return list(pred1);
                    }
                    {
                        SubLObject pred1_specsP = com.cyc.cycjava.cycl.genl_predicates.some_spec_predicate_or_inverse_somewhereP(pred1);
                        SubLObject pred2_specsP = com.cyc.cycjava.cycl.genl_predicates.some_spec_predicate_or_inverse_somewhereP(pred2);
                        if (!((NIL != pred1_specsP) || (NIL != pred2_specsP))) {
                            return NIL;
                        } else {
                            if (NIL == pred1_specsP) {
                                if (NIL != com.cyc.cycjava.cycl.genl_predicates.genl_predicateP(pred1, pred2, mt, tv)) {
                                    return list(pred1);
                                } else {
                                    return NIL;
                                }
                            } else {
                                if (NIL == pred2_specsP) {
                                    if (NIL != com.cyc.cycjava.cycl.genl_predicates.genl_predicateP(pred2, pred1, mt, tv)) {
                                        return list(pred2);
                                    } else {
                                        return NIL;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt131);
                }
            }
        }
        return sbhl_search_methods.sbhl_max_floors(sbhl_module_vars.get_sbhl_module($$genlPreds), preds, candidates, mt, tv, UNPROVIDED);
    }

    /**
     * Returns the most-general common specializations (floors) of PREDS
     */
    @LispMethod(comment = "Returns the most-general common specializations (floors) of PREDS")
    public static SubLObject max_floor_predicates(final SubLObject preds, SubLObject candidates, SubLObject mt, SubLObject tv) {
        if (candidates == UNPROVIDED) {
            candidates = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(preds, LISTP);
        if (NIL != list_utilities.doubletonP(preds)) {
            SubLObject pred1 = NIL;
            SubLObject pred2 = NIL;
            destructuring_bind_must_consp(preds, preds, $list134);
            pred1 = preds.first();
            SubLObject current = preds.rest();
            destructuring_bind_must_consp(current, preds, $list134);
            pred2 = current.first();
            current = current.rest();
            if (NIL == current) {
                if (pred1.eql(pred2)) {
                    return list(pred1);
                }
                final SubLObject pred1_specsP = some_spec_predicate_or_inverse_somewhereP(pred1);
                final SubLObject pred2_specsP = some_spec_predicate_or_inverse_somewhereP(pred2);
                if ((NIL == pred1_specsP) && (NIL == pred2_specsP)) {
                    return NIL;
                }
                if (NIL == pred1_specsP) {
                    if (NIL != genl_predicateP(pred1, pred2, mt, tv)) {
                        return list(pred1);
                    }
                    return NIL;
                } else
                    if (NIL == pred2_specsP) {
                        if (NIL != genl_predicateP(pred2, pred1, mt, tv)) {
                            return list(pred2);
                        }
                        return NIL;
                    }

            } else {
                cdestructuring_bind_error(preds, $list134);
            }
        }
        return sbhl_search_methods.sbhl_max_floors(sbhl_module_vars.get_sbhl_module($$genlPreds), preds, candidates, mt, tv, UNPROVIDED);
    }/**
     * Returns the most-general common specializations (floors) of PREDS
     */


    public static final SubLObject some_spec_predicate_or_inverse_somewhereP_alt(SubLObject pred) {
        return makeBoolean((NIL != somewhere_cache.some_pred_assertion_somewhereP($$genlPreds, pred, TWO_INTEGER, UNPROVIDED)) || (NIL != somewhere_cache.some_pred_assertion_somewhereP($$genlInverse, pred, TWO_INTEGER, UNPROVIDED)));
    }

    public static SubLObject some_spec_predicate_or_inverse_somewhereP(final SubLObject pred) {
        return makeBoolean((NIL != somewhere_cache.some_pred_assertion_somewhereP($$genlPreds, pred, TWO_INTEGER, UNPROVIDED)) || (NIL != somewhere_cache.some_pred_assertion_somewhereP($$genlInverse, pred, TWO_INTEGER, UNPROVIDED)));
    }

    /**
     * Is GENL a genlPred of SPEC?
     * (ascending transitive search; inexpensive)
     */
    @LispMethod(comment = "Is GENL a genlPred of SPEC?\r\n(ascending transitive search; inexpensive)\nIs GENL a genlPred of SPEC?\n(ascending transitive search; inexpensive)")
    public static final SubLObject genl_predicateP_alt(SubLObject spec, SubLObject genl, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(spec, FORT_P);
        SubLTrampolineFile.checkType(genl, FORT_P);
        if ((spec != genl) && (NIL == com.cyc.cycjava.cycl.genl_predicates.some_spec_predicate_or_inverse_somewhereP(genl))) {
            return NIL;
        }
        return sbhl_search_methods.sbhl_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genlPreds), spec, genl, mt, tv);
    }

    /**
     * Is GENL a genlPred of SPEC?
     * (ascending transitive search; inexpensive)
     */
    @LispMethod(comment = "Is GENL a genlPred of SPEC?\r\n(ascending transitive search; inexpensive)\nIs GENL a genlPred of SPEC?\n(ascending transitive search; inexpensive)")
    public static SubLObject genl_predicateP(final SubLObject spec, final SubLObject genl, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(spec, FORT_P);
        SubLTrampolineFile.enforceType(genl, FORT_P);
        if ((!spec.eql(genl)) && (NIL == some_spec_predicate_or_inverse_somewhereP(genl))) {
            return NIL;
        }
        return sbhl_search_methods.sbhl_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genlPreds), spec, genl, mt, tv);
    }/**
     * Is GENL a genlPred of SPEC?
     * (ascending transitive search; inexpensive)
     */


    /**
     *
     *
     * @return boolean; t if SPEC is a more specific predicate than GENL in some mt
     */
    @LispMethod(comment = "@return boolean; t if SPEC is a more specific predicate than GENL in some mt")
    public static final SubLObject genl_predicate_in_any_mtP_alt(SubLObject spec, SubLObject genl) {
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
                        result = com.cyc.cycjava.cycl.genl_predicates.genl_predicateP(spec, genl, UNPROVIDED, UNPROVIDED);
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
     *
     *
     * @return boolean; t if SPEC is a more specific predicate than GENL in some mt
     */
    @LispMethod(comment = "@return boolean; t if SPEC is a more specific predicate than GENL in some mt")
    public static SubLObject genl_predicate_in_any_mtP(final SubLObject spec, final SubLObject genl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            result = genl_predicateP(spec, genl, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject genl_predP_alt(SubLObject spec, SubLObject genl, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return com.cyc.cycjava.cycl.genl_predicates.genl_predicateP(spec, genl, mt, tv);
    }

    public static SubLObject genl_predP(final SubLObject spec, final SubLObject genl, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return genl_predicateP(spec, genl, mt, tv);
    }

    public static final SubLObject spec_predP_alt(SubLObject genl, SubLObject spec, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return com.cyc.cycjava.cycl.genl_predicates.genl_predicateP(spec, genl, mt, tv);
    }

    public static SubLObject spec_predP(final SubLObject genl, final SubLObject spec, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return genl_predicateP(spec, genl, mt, tv);
    }

    public static SubLObject proper_genl_predP(final SubLObject spec, final SubLObject genl, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return makeBoolean((NIL == kb_utilities.kbeq(spec, genl)) && (NIL != genl_predicateP(spec, genl, mt, tv)));
    }

    public static SubLObject proper_spec_predP(final SubLObject genl, final SubLObject spec, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return makeBoolean((NIL == kb_utilities.kbeq(spec, genl)) && (NIL != genl_predicateP(spec, genl, mt, tv)));
    }

    /**
     * Is GENL a genlPred of SPEC?
     * (ascending transitive search; inexpensive)
     */
    @LispMethod(comment = "Is GENL a genlPred of SPEC?\r\n(ascending transitive search; inexpensive)\nIs GENL a genlPred of SPEC?\n(ascending transitive search; inexpensive)")
    public static final SubLObject spec_predicateP_alt(SubLObject genl, SubLObject spec, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(genl, FORT_P);
        SubLTrampolineFile.checkType(spec, FORT_P);
        return com.cyc.cycjava.cycl.genl_predicates.genl_predicateP(spec, genl, mt, tv);
    }

    /**
     * Is GENL a genlPred of SPEC?
     * (ascending transitive search; inexpensive)
     */
    @LispMethod(comment = "Is GENL a genlPred of SPEC?\r\n(ascending transitive search; inexpensive)\nIs GENL a genlPred of SPEC?\n(ascending transitive search; inexpensive)")
    public static SubLObject spec_predicateP(final SubLObject genl, final SubLObject spec, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(genl, FORT_P);
        SubLTrampolineFile.enforceType(spec, FORT_P);
        return genl_predicateP(spec, genl, mt, tv);
    }/**
     * Is GENL a genlPred of SPEC?
     * (ascending transitive search; inexpensive)
     */


    /**
     * Is GENL a genlInverse of SPEC?
     * (ascending transitive search; inexpensive)
     */
    @LispMethod(comment = "Is GENL a genlInverse of SPEC?\r\n(ascending transitive search; inexpensive)\nIs GENL a genlInverse of SPEC?\n(ascending transitive search; inexpensive)")
    public static final SubLObject genl_inverseP_alt(SubLObject spec, SubLObject genl, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(spec, FORT_P);
        SubLTrampolineFile.checkType(genl, FORT_P);
        if ((spec != genl) && (NIL == com.cyc.cycjava.cycl.genl_predicates.some_spec_predicate_or_inverse_somewhereP(genl))) {
            return NIL;
        }
        return sbhl_search_methods.sbhl_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genlInverse), spec, genl, mt, tv);
    }

    /**
     * Is GENL a genlInverse of SPEC?
     * (ascending transitive search; inexpensive)
     */
    @LispMethod(comment = "Is GENL a genlInverse of SPEC?\r\n(ascending transitive search; inexpensive)\nIs GENL a genlInverse of SPEC?\n(ascending transitive search; inexpensive)")
    public static SubLObject genl_inverseP(final SubLObject spec, final SubLObject genl, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(spec, FORT_P);
        SubLTrampolineFile.enforceType(genl, FORT_P);
        if ((!spec.eql(genl)) && (NIL == some_spec_predicate_or_inverse_somewhereP(genl))) {
            return NIL;
        }
        return sbhl_search_methods.sbhl_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genlInverse), spec, genl, mt, tv);
    }/**
     * Is GENL a genlInverse of SPEC?
     * (ascending transitive search; inexpensive)
     */


    /**
     * Is GENL a genlInverse of SPEC?
     * (ascending transitive search; inexpensive)
     */
    @LispMethod(comment = "Is GENL a genlInverse of SPEC?\r\n(ascending transitive search; inexpensive)\nIs GENL a genlInverse of SPEC?\n(ascending transitive search; inexpensive)")
    public static final SubLObject spec_inverseP_alt(SubLObject genl, SubLObject spec, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(spec, FORT_P);
        SubLTrampolineFile.checkType(genl, FORT_P);
        return com.cyc.cycjava.cycl.genl_predicates.genl_inverseP(spec, genl, mt, tv);
    }

    /**
     * Is GENL a genlInverse of SPEC?
     * (ascending transitive search; inexpensive)
     */
    @LispMethod(comment = "Is GENL a genlInverse of SPEC?\r\n(ascending transitive search; inexpensive)\nIs GENL a genlInverse of SPEC?\n(ascending transitive search; inexpensive)")
    public static SubLObject spec_inverseP(final SubLObject genl, final SubLObject spec, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(spec, FORT_P);
        SubLTrampolineFile.enforceType(genl, FORT_P);
        return genl_inverseP(spec, genl, mt, tv);
    }/**
     * Is GENL a genlInverse of SPEC?
     * (ascending transitive search; inexpensive)
     */


    /**
     * is GENL a genlPred of SPEC? -- forces search down inferior links
     * (decending transitive search; expensive; use genl-predicate? instead)
     */
    @LispMethod(comment = "is GENL a genlPred of SPEC? -- forces search down inferior links\r\n(decending transitive search; expensive; use genl-predicate? instead)\nis GENL a genlPred of SPEC? -- forces search down inferior links\n(decending transitive search; expensive; use genl-predicate? instead)")
    public static final SubLObject genl_predicate_ofP_alt(SubLObject genl, SubLObject spec, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_inverse_relation_p(sbhl_module_vars.get_sbhl_module($$genlPreds), genl, spec, mt, tv);
    }

    /**
     * is GENL a genlPred of SPEC? -- forces search down inferior links
     * (decending transitive search; expensive; use genl-predicate? instead)
     */
    @LispMethod(comment = "is GENL a genlPred of SPEC? -- forces search down inferior links\r\n(decending transitive search; expensive; use genl-predicate? instead)\nis GENL a genlPred of SPEC? -- forces search down inferior links\n(decending transitive search; expensive; use genl-predicate? instead)")
    public static SubLObject genl_predicate_ofP(final SubLObject genl, final SubLObject spec, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_inverse_relation_p(sbhl_module_vars.get_sbhl_module($$genlPreds), genl, spec, mt, tv);
    }/**
     * is GENL a genlPred of SPEC? -- forces search down inferior links
     * (decending transitive search; expensive; use genl-predicate? instead)
     */


    /**
     * is GENL a genlInverse of SPEC? -- forces search down inferior links
     * (decending transitive search; expensive; use genl-predicate? instead)
     */
    @LispMethod(comment = "is GENL a genlInverse of SPEC? -- forces search down inferior links\r\n(decending transitive search; expensive; use genl-predicate? instead)\nis GENL a genlInverse of SPEC? -- forces search down inferior links\n(decending transitive search; expensive; use genl-predicate? instead)")
    public static final SubLObject genl_inverse_ofP_alt(SubLObject genl, SubLObject spec, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_inverse_relation_p(sbhl_module_vars.get_sbhl_module($$genlInverse), genl, spec, mt, tv);
    }

    /**
     * is GENL a genlInverse of SPEC? -- forces search down inferior links
     * (decending transitive search; expensive; use genl-predicate? instead)
     */
    @LispMethod(comment = "is GENL a genlInverse of SPEC? -- forces search down inferior links\r\n(decending transitive search; expensive; use genl-predicate? instead)\nis GENL a genlInverse of SPEC? -- forces search down inferior links\n(decending transitive search; expensive; use genl-predicate? instead)")
    public static SubLObject genl_inverse_ofP(final SubLObject genl, final SubLObject spec, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_inverse_relation_p(sbhl_module_vars.get_sbhl_module($$genlInverse), genl, spec, mt, tv);
    }/**
     * is GENL a genlInverse of SPEC? -- forces search down inferior links
     * (decending transitive search; expensive; use genl-predicate? instead)
     */


    /**
     * Returns T iff (genl-predicate? SPEC GENL) for some genl in GENLS
     * (ascending transitive search; inexpensive)
     */
    @LispMethod(comment = "Returns T iff (genl-predicate? SPEC GENL) for some genl in GENLS\r\n(ascending transitive search; inexpensive)\nReturns T iff (genl-predicate? SPEC GENL) for some genl in GENLS\n(ascending transitive search; inexpensive)")
    public static final SubLObject any_genl_predicateP_alt(SubLObject spec, SubLObject v_genls, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(spec, FORT_P);
        SubLTrampolineFile.checkType(v_genls, LISTP);
        return sbhl_search_methods.sbhl_predicate_relation_with_any_p(sbhl_module_vars.get_sbhl_module($$genlPreds), spec, v_genls, mt, tv);
    }

    /**
     * Returns T iff (genl-predicate? SPEC GENL) for some genl in GENLS
     * (ascending transitive search; inexpensive)
     */
    @LispMethod(comment = "Returns T iff (genl-predicate? SPEC GENL) for some genl in GENLS\r\n(ascending transitive search; inexpensive)\nReturns T iff (genl-predicate? SPEC GENL) for some genl in GENLS\n(ascending transitive search; inexpensive)")
    public static SubLObject any_genl_predicateP(final SubLObject spec, final SubLObject v_genls, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(spec, FORT_P);
        SubLTrampolineFile.enforceType(v_genls, LISTP);
        return NIL == v_genls ? NIL : NIL != list_utilities.singletonP(v_genls) ? genl_predicateP(spec, v_genls.first(), mt, tv) : sbhl_search_methods.sbhl_predicate_relation_with_any_p(sbhl_module_vars.get_sbhl_module($$genlPreds), spec, v_genls, mt, tv);
    }/**
     * Returns T iff (genl-predicate? SPEC GENL) for some genl in GENLS
     * (ascending transitive search; inexpensive)
     */


    public static final SubLObject any_genl_predP_alt(SubLObject spec, SubLObject v_genls, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return com.cyc.cycjava.cycl.genl_predicates.any_genl_predicateP(spec, v_genls, mt, tv);
    }

    public static SubLObject any_genl_predP(final SubLObject spec, final SubLObject v_genls, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return any_genl_predicateP(spec, v_genls, mt, tv);
    }

    /**
     * Returns T iff (genl-predicate? SPEC GENL) for some genl in GENLS and some mt
     */
    @LispMethod(comment = "Returns T iff (genl-predicate? SPEC GENL) for some genl in GENLS and some mt")
    public static final SubLObject any_genl_predicate_in_any_mtP_alt(SubLObject spec, SubLObject v_genls) {
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
                        result = com.cyc.cycjava.cycl.genl_predicates.any_genl_predicateP(spec, v_genls, UNPROVIDED, UNPROVIDED);
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
     * Returns T iff (genl-predicate? SPEC GENL) for some genl in GENLS and some mt
     */
    @LispMethod(comment = "Returns T iff (genl-predicate? SPEC GENL) for some genl in GENLS and some mt")
    public static SubLObject any_genl_predicate_in_any_mtP(final SubLObject spec, final SubLObject v_genls) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            result = any_genl_predicateP(spec, v_genls, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * Returns T iff (genl-predicate? SPEC GENL) for some genl in GENLS and some mt
     */


    /**
     * Returns T iff (genl-inverse? SPEC GENL) for some genl in GENLS
     * (ascending transitive search; inexpensive)
     */
    @LispMethod(comment = "Returns T iff (genl-inverse? SPEC GENL) for some genl in GENLS\r\n(ascending transitive search; inexpensive)\nReturns T iff (genl-inverse? SPEC GENL) for some genl in GENLS\n(ascending transitive search; inexpensive)")
    public static final SubLObject any_genl_inverseP_alt(SubLObject spec, SubLObject v_genls, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_predicate_relation_with_any_p(sbhl_module_vars.get_sbhl_module($$genlInverse), spec, v_genls, mt, tv);
    }

    /**
     * Returns T iff (genl-inverse? SPEC GENL) for some genl in GENLS
     * (ascending transitive search; inexpensive)
     */
    @LispMethod(comment = "Returns T iff (genl-inverse? SPEC GENL) for some genl in GENLS\r\n(ascending transitive search; inexpensive)\nReturns T iff (genl-inverse? SPEC GENL) for some genl in GENLS\n(ascending transitive search; inexpensive)")
    public static SubLObject any_genl_inverseP(final SubLObject spec, final SubLObject v_genls, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return NIL == v_genls ? NIL : NIL != list_utilities.singletonP(v_genls) ? genl_inverseP(spec, v_genls.first(), mt, tv) : sbhl_search_methods.sbhl_predicate_relation_with_any_p(sbhl_module_vars.get_sbhl_module($$genlInverse), spec, v_genls, mt, tv);
    }/**
     * Returns T iff (genl-inverse? SPEC GENL) for some genl in GENLS
     * (ascending transitive search; inexpensive)
     */


    /**
     * Is NOT-GENL known to be not a genlPred of SPEC?
     * (descending transitive search; expensive)
     */
    @LispMethod(comment = "Is NOT-GENL known to be not a genlPred of SPEC?\r\n(descending transitive search; expensive)\nIs NOT-GENL known to be not a genlPred of SPEC?\n(descending transitive search; expensive)")
    public static final SubLObject not_genl_predicateP_alt(SubLObject spec, SubLObject not_genl, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(spec, FORT_P);
        SubLTrampolineFile.checkType(not_genl, FORT_P);
        return sbhl_search_implied_relations.sbhl_implied_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genlPreds), spec, not_genl, mt, tv);
    }

    /**
     * Is NOT-GENL known to be not a genlPred of SPEC?
     * (descending transitive search; expensive)
     */
    @LispMethod(comment = "Is NOT-GENL known to be not a genlPred of SPEC?\r\n(descending transitive search; expensive)\nIs NOT-GENL known to be not a genlPred of SPEC?\n(descending transitive search; expensive)")
    public static SubLObject not_genl_predicateP(final SubLObject spec, final SubLObject not_genl, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(spec, FORT_P);
        SubLTrampolineFile.enforceType(not_genl, FORT_P);
        return sbhl_search_implied_relations.sbhl_implied_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genlPreds), spec, not_genl, mt, tv);
    }/**
     * Is NOT-GENL known to be not a genlPred of SPEC?
     * (descending transitive search; expensive)
     */


    public static final SubLObject not_genl_predP_alt(SubLObject spec, SubLObject not_genl, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return com.cyc.cycjava.cycl.genl_predicates.not_genl_predicateP(spec, not_genl, mt, tv);
    }

    public static SubLObject not_genl_predP(final SubLObject spec, final SubLObject not_genl, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return not_genl_predicateP(spec, not_genl, mt, tv);
    }

    public static final SubLObject not_spec_predicateP_alt(SubLObject genl, SubLObject spec, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return com.cyc.cycjava.cycl.genl_predicates.not_genl_predicateP(spec, genl, mt, tv);
    }

    public static SubLObject not_spec_predicateP(final SubLObject genl, final SubLObject spec, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return not_genl_predicateP(spec, genl, mt, tv);
    }

    /**
     * Returns whether predicate NOT-GENL is not a genl-predicate of PRED, or arguably should not be a not-genl-predicate of PRED because (genlPreds PRED NOT-GENL).
     */
    @LispMethod(comment = "Returns whether predicate NOT-GENL is not a genl-predicate of PRED, or arguably should not be a not-genl-predicate of PRED because (genlPreds PRED NOT-GENL).")
    public static final SubLObject argue_not_genl_predicateP_alt(SubLObject pred, SubLObject not_genl, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_implied_relations.sbhl_argumentation_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, not_genl, mt, tv);
    }

    /**
     * Returns whether predicate NOT-GENL is not a genl-predicate of PRED, or arguably should not be a not-genl-predicate of PRED because (genlPreds PRED NOT-GENL).
     */
    @LispMethod(comment = "Returns whether predicate NOT-GENL is not a genl-predicate of PRED, or arguably should not be a not-genl-predicate of PRED because (genlPreds PRED NOT-GENL).")
    public static SubLObject argue_not_genl_predicateP(final SubLObject pred, final SubLObject not_genl, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_implied_relations.sbhl_argumentation_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, not_genl, mt, tv);
    }/**
     * Returns whether predicate NOT-GENL is not a genl-predicate of PRED, or arguably should not be a not-genl-predicate of PRED because (genlPreds PRED NOT-GENL).
     */


    /**
     * Is NOT-GENL a negated genlInverse of SPEC?
     * (descending transitive search; expensive)
     */
    @LispMethod(comment = "Is NOT-GENL a negated genlInverse of SPEC?\r\n(descending transitive search; expensive)\nIs NOT-GENL a negated genlInverse of SPEC?\n(descending transitive search; expensive)")
    public static final SubLObject not_genl_inverseP_alt(SubLObject spec, SubLObject not_genl, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(spec, FORT_P);
        SubLTrampolineFile.checkType(not_genl, FORT_P);
        return sbhl_search_methods.sbhl_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genlInverse), spec, not_genl, mt, tv);
    }

    /**
     * Is NOT-GENL a negated genlInverse of SPEC?
     * (descending transitive search; expensive)
     */
    @LispMethod(comment = "Is NOT-GENL a negated genlInverse of SPEC?\r\n(descending transitive search; expensive)\nIs NOT-GENL a negated genlInverse of SPEC?\n(descending transitive search; expensive)")
    public static SubLObject not_genl_inverseP(final SubLObject spec, final SubLObject not_genl, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(spec, FORT_P);
        SubLTrampolineFile.enforceType(not_genl, FORT_P);
        return sbhl_search_methods.sbhl_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genlInverse), spec, not_genl, mt, tv);
    }/**
     * Is NOT-GENL a negated genlInverse of SPEC?
     * (descending transitive search; expensive)
     */


    public static final SubLObject not_spec_inverseP_alt(SubLObject genl, SubLObject spec, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.genl_predicates.not_genl_inverseP(spec, genl, mt, UNPROVIDED);
    }

    public static SubLObject not_spec_inverseP(final SubLObject genl, final SubLObject spec, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return not_genl_inverseP(spec, genl, mt, UNPROVIDED);
    }

    /**
     * Returns whether predicate NOT-GENL is not a genl-inverse of PRED, or arguably should not be a not-genl-inverse of PRED because (genlPreds PRED NOT-GENL).
     */
    @LispMethod(comment = "Returns whether predicate NOT-GENL is not a genl-inverse of PRED, or arguably should not be a not-genl-inverse of PRED because (genlPreds PRED NOT-GENL).")
    public static final SubLObject argue_not_genl_inverseP_alt(SubLObject pred, SubLObject not_genl, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_implied_relations.sbhl_argumentation_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, not_genl, mt, tv);
    }

    /**
     * Returns whether predicate NOT-GENL is not a genl-inverse of PRED, or arguably should not be a not-genl-inverse of PRED because (genlPreds PRED NOT-GENL).
     */
    @LispMethod(comment = "Returns whether predicate NOT-GENL is not a genl-inverse of PRED, or arguably should not be a not-genl-inverse of PRED because (genlPreds PRED NOT-GENL).")
    public static SubLObject argue_not_genl_inverseP(final SubLObject pred, final SubLObject not_genl, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_implied_relations.sbhl_argumentation_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, not_genl, mt, tv);
    }/**
     * Returns whether predicate NOT-GENL is not a genl-inverse of PRED, or arguably should not be a not-genl-inverse of PRED because (genlPreds PRED NOT-GENL).
     */


    /**
     * Is any predicate in NOT-GENLS not a genlPred of PRED?
     * (descending transitive search; expensive)
     */
    @LispMethod(comment = "Is any predicate in NOT-GENLS not a genlPred of PRED?\r\n(descending transitive search; expensive)\nIs any predicate in NOT-GENLS not a genlPred of PRED?\n(descending transitive search; expensive)")
    public static final SubLObject any_not_genl_predicateP_alt(SubLObject pred, SubLObject not_genls, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(pred, FORT_P);
        SubLTrampolineFile.checkType(not_genls, LISTP);
        return sbhl_search_implied_relations.sbhl_implied_false_predicate_relation_with_any_p(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, not_genls, mt, tv);
    }

    /**
     * Is any predicate in NOT-GENLS not a genlPred of PRED?
     * (descending transitive search; expensive)
     */
    @LispMethod(comment = "Is any predicate in NOT-GENLS not a genlPred of PRED?\r\n(descending transitive search; expensive)\nIs any predicate in NOT-GENLS not a genlPred of PRED?\n(descending transitive search; expensive)")
    public static SubLObject any_not_genl_predicateP(final SubLObject pred, final SubLObject not_genls, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(pred, FORT_P);
        SubLTrampolineFile.enforceType(not_genls, LISTP);
        return sbhl_search_implied_relations.sbhl_implied_false_predicate_relation_with_any_p(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, not_genls, mt, tv);
    }/**
     * Is any predicate in NOT-GENLS not a genlPred of PRED?
     * (descending transitive search; expensive)
     */


    public static final SubLObject random_genl_predicate_of_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(pred, FORT_P);
        if (NIL != mt) {
            SubLTrampolineFile.checkType(mt, HLMT_P);
        }
        if (NIL != tv) {
            SubLTrampolineFile.checkType(tv, TV_P);
        }
        return list_utilities.random_element(com.cyc.cycjava.cycl.genl_predicates.all_genl_predicates(pred, mt, tv));
    }

    public static SubLObject random_genl_predicate_of(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != forts.fort_p(pred) : "! forts.fort_p(pred) " + ("forts.fort_p(pred) " + "CommonSymbols.NIL != forts.fort_p(pred) ") + pred;
        if (((NIL != mt) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == hlmt.hlmt_p(mt))) {
            throw new AssertionError(mt);
        }
        if (((NIL != tv) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == enumeration_types.tv_p(tv))) {
            throw new AssertionError(tv);
        }
        return list_utilities.random_element(all_genl_predicates(pred, mt, tv));
    }

    public static final SubLObject random_spec_predicate_of_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(pred, FORT_P);
        if (NIL != mt) {
            SubLTrampolineFile.checkType(mt, HLMT_P);
        }
        if (NIL != tv) {
            SubLTrampolineFile.checkType(tv, TV_P);
        }
        return list_utilities.random_element(com.cyc.cycjava.cycl.genl_predicates.all_spec_predicates(pred, mt, tv));
    }

    public static SubLObject random_spec_predicate_of(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != forts.fort_p(pred) : "! forts.fort_p(pred) " + ("forts.fort_p(pred) " + "CommonSymbols.NIL != forts.fort_p(pred) ") + pred;
        if (((NIL != mt) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == hlmt.hlmt_p(mt))) {
            throw new AssertionError(mt);
        }
        if (((NIL != tv) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == enumeration_types.tv_p(tv))) {
            throw new AssertionError(tv);
        }
        return list_utilities.random_element(all_spec_predicates(pred, mt, tv));
    }

    public static final SubLObject random_proper_genl_predicate_of_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(pred, FORT_P);
        if (NIL != mt) {
            SubLTrampolineFile.checkType(mt, HLMT_P);
        }
        if (NIL != tv) {
            SubLTrampolineFile.checkType(tv, TV_P);
        }
        return list_utilities.random_element(com.cyc.cycjava.cycl.genl_predicates.all_proper_genl_predicates(pred, mt, tv));
    }

    public static SubLObject random_proper_genl_predicate_of(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != forts.fort_p(pred) : "! forts.fort_p(pred) " + ("forts.fort_p(pred) " + "CommonSymbols.NIL != forts.fort_p(pred) ") + pred;
        if (((NIL != mt) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == hlmt.hlmt_p(mt))) {
            throw new AssertionError(mt);
        }
        if (((NIL != tv) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == enumeration_types.tv_p(tv))) {
            throw new AssertionError(tv);
        }
        return list_utilities.random_element(all_proper_genl_predicates(pred, mt, tv));
    }

    public static final SubLObject random_proper_spec_predicate_of_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(pred, FORT_P);
        if (NIL != mt) {
            SubLTrampolineFile.checkType(mt, HLMT_P);
        }
        if (NIL != tv) {
            SubLTrampolineFile.checkType(tv, TV_P);
        }
        return list_utilities.random_element(com.cyc.cycjava.cycl.genl_predicates.all_proper_spec_predicates(pred, mt, tv));
    }

    public static SubLObject random_proper_spec_predicate_of(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != forts.fort_p(pred) : "! forts.fort_p(pred) " + ("forts.fort_p(pred) " + "CommonSymbols.NIL != forts.fort_p(pred) ") + pred;
        if (((NIL != mt) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == hlmt.hlmt_p(mt))) {
            throw new AssertionError(mt);
        }
        if (((NIL != tv) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == enumeration_types.tv_p(tv))) {
            throw new AssertionError(tv);
        }
        return list_utilities.random_element(all_proper_spec_predicates(pred, mt, tv));
    }

    public static final SubLObject random_genl_inverse_of_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(pred, FORT_P);
        if (NIL != mt) {
            SubLTrampolineFile.checkType(mt, HLMT_P);
        }
        if (NIL != tv) {
            SubLTrampolineFile.checkType(tv, TV_P);
        }
        return list_utilities.random_element(com.cyc.cycjava.cycl.genl_predicates.all_genl_inverses(pred, mt, tv));
    }

    public static SubLObject random_genl_inverse_of(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != forts.fort_p(pred) : "! forts.fort_p(pred) " + ("forts.fort_p(pred) " + "CommonSymbols.NIL != forts.fort_p(pred) ") + pred;
        if (((NIL != mt) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == hlmt.hlmt_p(mt))) {
            throw new AssertionError(mt);
        }
        if (((NIL != tv) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == enumeration_types.tv_p(tv))) {
            throw new AssertionError(tv);
        }
        return list_utilities.random_element(all_genl_inverses(pred, mt, tv));
    }

    public static final SubLObject random_spec_inverse_of_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(pred, FORT_P);
        if (NIL != mt) {
            SubLTrampolineFile.checkType(mt, HLMT_P);
        }
        if (NIL != tv) {
            SubLTrampolineFile.checkType(tv, TV_P);
        }
        return list_utilities.random_element(com.cyc.cycjava.cycl.genl_predicates.all_spec_inverses(pred, mt, tv));
    }

    public static SubLObject random_spec_inverse_of(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != forts.fort_p(pred) : "! forts.fort_p(pred) " + ("forts.fort_p(pred) " + "CommonSymbols.NIL != forts.fort_p(pred) ") + pred;
        if (((NIL != mt) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == hlmt.hlmt_p(mt))) {
            throw new AssertionError(mt);
        }
        if (((NIL != tv) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == enumeration_types.tv_p(tv))) {
            throw new AssertionError(tv);
        }
        return list_utilities.random_element(all_spec_inverses(pred, mt, tv));
    }

    public static final SubLObject random_proper_genl_inverse_of_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(pred, FORT_P);
        if (NIL != mt) {
            SubLTrampolineFile.checkType(mt, HLMT_P);
        }
        if (NIL != tv) {
            SubLTrampolineFile.checkType(tv, TV_P);
        }
        return list_utilities.random_element(com.cyc.cycjava.cycl.genl_predicates.all_proper_genl_inverses(pred, mt, tv));
    }

    public static SubLObject random_proper_genl_inverse_of(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != forts.fort_p(pred) : "! forts.fort_p(pred) " + ("forts.fort_p(pred) " + "CommonSymbols.NIL != forts.fort_p(pred) ") + pred;
        if (((NIL != mt) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == hlmt.hlmt_p(mt))) {
            throw new AssertionError(mt);
        }
        if (((NIL != tv) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == enumeration_types.tv_p(tv))) {
            throw new AssertionError(tv);
        }
        return list_utilities.random_element(all_proper_genl_inverses(pred, mt, tv));
    }

    public static final SubLObject random_proper_spec_inverse_of_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(pred, FORT_P);
        if (NIL != mt) {
            SubLTrampolineFile.checkType(mt, HLMT_P);
        }
        if (NIL != tv) {
            SubLTrampolineFile.checkType(tv, TV_P);
        }
        return list_utilities.random_element(com.cyc.cycjava.cycl.genl_predicates.all_proper_spec_inverses(pred, mt, tv));
    }

    public static SubLObject random_proper_spec_inverse_of(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != forts.fort_p(pred) : "! forts.fort_p(pred) " + ("forts.fort_p(pred) " + "CommonSymbols.NIL != forts.fort_p(pred) ") + pred;
        if (((NIL != mt) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == hlmt.hlmt_p(mt))) {
            throw new AssertionError(mt);
        }
        if (((NIL != tv) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == enumeration_types.tv_p(tv))) {
            throw new AssertionError(tv);
        }
        return list_utilities.random_element(all_proper_spec_inverses(pred, mt, tv));
    }

    public static final SubLObject random_genl_predicate_or_inverse_of_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(pred, FORT_P);
        if (NIL != mt) {
            SubLTrampolineFile.checkType(mt, HLMT_P);
        }
        if (NIL != tv) {
            SubLTrampolineFile.checkType(tv, TV_P);
        }
        return list_utilities.random_element(com.cyc.cycjava.cycl.genl_predicates.all_genl_predicates_and_inverses(pred, mt, tv));
    }

    public static SubLObject random_genl_predicate_or_inverse_of(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != forts.fort_p(pred) : "! forts.fort_p(pred) " + ("forts.fort_p(pred) " + "CommonSymbols.NIL != forts.fort_p(pred) ") + pred;
        if (((NIL != mt) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == hlmt.hlmt_p(mt))) {
            throw new AssertionError(mt);
        }
        if (((NIL != tv) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == enumeration_types.tv_p(tv))) {
            throw new AssertionError(tv);
        }
        return list_utilities.random_element(all_genl_predicates_and_inverses(pred, mt, tv));
    }

    public static final SubLObject random_spec_predicate_or_inverse_of_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(pred, FORT_P);
        if (NIL != mt) {
            SubLTrampolineFile.checkType(mt, HLMT_P);
        }
        if (NIL != tv) {
            SubLTrampolineFile.checkType(tv, TV_P);
        }
        return list_utilities.random_element(com.cyc.cycjava.cycl.genl_predicates.all_spec_predicates_and_inverses(pred, mt, tv));
    }

    public static SubLObject random_spec_predicate_or_inverse_of(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != forts.fort_p(pred) : "! forts.fort_p(pred) " + ("forts.fort_p(pred) " + "CommonSymbols.NIL != forts.fort_p(pred) ") + pred;
        if (((NIL != mt) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == hlmt.hlmt_p(mt))) {
            throw new AssertionError(mt);
        }
        if (((NIL != tv) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == enumeration_types.tv_p(tv))) {
            throw new AssertionError(tv);
        }
        return list_utilities.random_element(all_spec_predicates_and_inverses(pred, mt, tv));
    }

    public static final SubLObject random_proper_genl_predicate_or_inverse_of_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(pred, FORT_P);
        if (NIL != mt) {
            SubLTrampolineFile.checkType(mt, HLMT_P);
        }
        if (NIL != tv) {
            SubLTrampolineFile.checkType(tv, TV_P);
        }
        return list_utilities.random_element(com.cyc.cycjava.cycl.genl_predicates.all_proper_genl_predicates_and_inverses(pred, mt, tv));
    }

    public static SubLObject random_proper_genl_predicate_or_inverse_of(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != forts.fort_p(pred) : "! forts.fort_p(pred) " + ("forts.fort_p(pred) " + "CommonSymbols.NIL != forts.fort_p(pred) ") + pred;
        if (((NIL != mt) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == hlmt.hlmt_p(mt))) {
            throw new AssertionError(mt);
        }
        if (((NIL != tv) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == enumeration_types.tv_p(tv))) {
            throw new AssertionError(tv);
        }
        return list_utilities.random_element(all_proper_genl_predicates_and_inverses(pred, mt, tv));
    }

    public static final SubLObject random_proper_spec_predicate_or_inverse_of_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(pred, FORT_P);
        if (NIL != mt) {
            SubLTrampolineFile.checkType(mt, HLMT_P);
        }
        if (NIL != tv) {
            SubLTrampolineFile.checkType(tv, TV_P);
        }
        return list_utilities.random_element(com.cyc.cycjava.cycl.genl_predicates.all_proper_spec_predicates_and_inverses(pred, mt, tv));
    }

    public static SubLObject random_proper_spec_predicate_or_inverse_of(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != forts.fort_p(pred) : "! forts.fort_p(pred) " + ("forts.fort_p(pred) " + "CommonSymbols.NIL != forts.fort_p(pred) ") + pred;
        if (((NIL != mt) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == hlmt.hlmt_p(mt))) {
            throw new AssertionError(mt);
        }
        if (((NIL != tv) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == enumeration_types.tv_p(tv))) {
            throw new AssertionError(tv);
        }
        return list_utilities.random_element(all_proper_spec_predicates_and_inverses(pred, mt, tv));
    }

    /**
     * Returns T iff (genl-pred? spec-pred PRED) for some spec-pred among SPEC-PREDS
     */
    @LispMethod(comment = "Returns T iff (genl-pred? spec-pred PRED) for some spec-pred among SPEC-PREDS")
    public static final SubLObject any_spec_predP_alt(SubLObject pred, SubLObject spec_preds, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_any_with_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genlPreds), spec_preds, pred, mt, tv);
    }

    /**
     * Returns T iff (genl-pred? spec-pred PRED) for some spec-pred among SPEC-PREDS
     */
    @LispMethod(comment = "Returns T iff (genl-pred? spec-pred PRED) for some spec-pred among SPEC-PREDS")
    public static SubLObject any_spec_predP(final SubLObject pred, final SubLObject spec_preds, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return NIL == spec_preds ? NIL : NIL != list_utilities.singletonP(spec_preds) ? genl_predicateP(spec_preds.first(), pred, mt, tv) : sbhl_search_methods.sbhl_any_with_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genlPreds), spec_preds, pred, mt, tv);
    }/**
     * Returns T iff (genl-pred? spec-pred PRED) for some spec-pred among SPEC-PREDS
     */


    /**
     * Returns T iff (genl-inverse? spec-inverse PRED) for some spec-inverse among SPEC-INVERSES
     */
    @LispMethod(comment = "Returns T iff (genl-inverse? spec-inverse PRED) for some spec-inverse among SPEC-INVERSES")
    public static final SubLObject any_spec_inverseP_alt(SubLObject pred, SubLObject spec_inverses, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_any_with_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genlInverse), spec_inverses, pred, mt, tv);
    }

    /**
     * Returns T iff (genl-inverse? spec-inverse PRED) for some spec-inverse among SPEC-INVERSES
     */
    @LispMethod(comment = "Returns T iff (genl-inverse? spec-inverse PRED) for some spec-inverse among SPEC-INVERSES")
    public static SubLObject any_spec_inverseP(final SubLObject pred, final SubLObject spec_inverses, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return NIL == spec_inverses ? NIL : NIL != list_utilities.singletonP(spec_inverses) ? genl_inverseP(spec_inverses.first(), pred, mt, tv) : sbhl_search_methods.sbhl_any_with_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genlInverse), spec_inverses, pred, mt, tv);
    }/**
     * Returns T iff (genl-inverse? spec-inverse PRED) for some spec-inverse among SPEC-INVERSES
     */


    /**
     *
     *
     * @return booleanp; whether PRED has some genlPred (other than itself) or some genlInverse?
     */
    @LispMethod(comment = "@return booleanp; whether PRED has some genlPred (other than itself) or some genlInverse?")
    public static final SubLObject some_genl_pred_or_inverseP_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return com.cyc.cycjava.cycl.genl_predicates.some_genl_pred_or_inverseP_int(pred, mt, tv);
    }

    /**
     *
     *
     * @return booleanp; whether PRED has some genlPred (other than itself) or some genlInverse?
     */
    @LispMethod(comment = "@return booleanp; whether PRED has some genlPred (other than itself) or some genlInverse?")
    public static SubLObject some_genl_pred_or_inverseP(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return some_genl_pred_or_inverseP_int(pred, mt, tv);
    }

    /**
     *
     *
     * @unknown does pred p have some genlPred (other than p) or some genlInverse?
     */
    @LispMethod(comment = "@unknown does pred p have some genlPred (other than p) or some genlInverse?")
    public static final SubLObject some_genl_pred_or_inverseP_int_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return makeBoolean((NIL != sbhl_link_methods.sbhl_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt, tv, UNPROVIDED)) || (NIL != sbhl_link_methods.sbhl_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt, tv, UNPROVIDED)));
    }

    /**
     *
     *
     * @unknown does pred p have some genlPred (other than p) or some genlInverse?
     */
    @LispMethod(comment = "@unknown does pred p have some genlPred (other than p) or some genlInverse?")
    public static SubLObject some_genl_pred_or_inverseP_int(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return makeBoolean((NIL != sbhl_link_methods.sbhl_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt, tv, UNPROVIDED)) || (NIL != sbhl_link_methods.sbhl_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt, tv, UNPROVIDED)));
    }

    /**
     *
     *
     * @return booleanp; whether PRED is the genlPred of some other pred or genlInverse of some other pred?
     */
    @LispMethod(comment = "@return booleanp; whether PRED is the genlPred of some other pred or genlInverse of some other pred?")
    public static final SubLObject some_spec_pred_or_inverseP_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return com.cyc.cycjava.cycl.genl_predicates.some_spec_pred_or_inverseP_int(pred, mt, tv);
    }

    /**
     *
     *
     * @return booleanp; whether PRED is the genlPred of some other pred or genlInverse of some other pred?
     */
    @LispMethod(comment = "@return booleanp; whether PRED is the genlPred of some other pred or genlInverse of some other pred?")
    public static SubLObject some_spec_pred_or_inverseP(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return some_spec_pred_or_inverseP_int(pred, mt, tv);
    }

    /**
     *
     *
     * @unknown is pred p the genlPred of some pred other than p or genlInverse of some pred?
     */
    @LispMethod(comment = "@unknown is pred p the genlPred of some pred other than p or genlInverse of some pred?")
    public static final SubLObject some_spec_pred_or_inverseP_int_alt(SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return makeBoolean((NIL != sbhl_link_methods.sbhl_backward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt, tv, UNPROVIDED)) || (NIL != sbhl_link_methods.sbhl_backward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt, tv, UNPROVIDED)));
    }

    /**
     *
     *
     * @unknown is pred p the genlPred of some pred other than p or genlInverse of some pred?
     */
    @LispMethod(comment = "@unknown is pred p the genlPred of some pred other than p or genlInverse of some pred?")
    public static SubLObject some_spec_pred_or_inverseP_int(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return makeBoolean((NIL != sbhl_link_methods.sbhl_backward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt, tv, UNPROVIDED)) || (NIL != sbhl_link_methods.sbhl_backward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt, tv, UNPROVIDED)));
    }

    /**
     * Does the extension of PRED1 include some tuple in the extension of PRED2?
     */
    @LispMethod(comment = "Does the extension of PRED1 include some tuple in the extension of PRED2?")
    public static final SubLObject intersecting_predicatesP_alt(SubLObject pred1, SubLObject pred2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(pred1, FORT_P);
        SubLTrampolineFile.checkType(pred2, FORT_P);
        return com.cyc.cycjava.cycl.genl_predicates.predicates_intersectP(pred1, pred2, mt);
    }

    /**
     * Does the extension of PRED1 include some tuple in the extension of PRED2?
     */
    @LispMethod(comment = "Does the extension of PRED1 include some tuple in the extension of PRED2?")
    public static SubLObject intersecting_predicatesP(final SubLObject pred1, final SubLObject pred2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.enforceType(pred1, FORT_P);
        SubLTrampolineFile.enforceType(pred2, FORT_P);
        return predicates_intersectP(pred1, pred2, mt);
    }/**
     * Does the extension of PRED1 include some tuple in the extension of PRED2?
     */


    /**
     * Does the extension of PRED1 include some tuple in the extension of PRED2?
     */
    @LispMethod(comment = "Does the extension of PRED1 include some tuple in the extension of PRED2?")
    public static final SubLObject predicates_intersectP_alt(SubLObject pred1, SubLObject pred2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if ((NIL != fort_types_interface.predicateP(pred1)) && (NIL != fort_types_interface.predicateP(pred2))) {
            return makeBoolean(((NIL != com.cyc.cycjava.cycl.genl_predicates.genl_predicateP(pred1, pred2, mt, UNPROVIDED)) || (NIL != com.cyc.cycjava.cycl.genl_predicates.genl_predicateP(pred2, pred1, mt, UNPROVIDED))) || (NIL != negation_predicate.not_negation_predicateP(pred1, pred2, mt, UNPROVIDED)));
        }
        return NIL;
    }

    /**
     * Does the extension of PRED1 include some tuple in the extension of PRED2?
     */
    @LispMethod(comment = "Does the extension of PRED1 include some tuple in the extension of PRED2?")
    public static SubLObject predicates_intersectP(final SubLObject pred1, final SubLObject pred2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if ((NIL != fort_types_interface.predicateP(pred1)) && (NIL != fort_types_interface.predicateP(pred2))) {
            return makeBoolean(((NIL != genl_predicateP(pred1, pred2, mt, UNPROVIDED)) || (NIL != genl_predicateP(pred2, pred1, mt, UNPROVIDED))) || (NIL != negation_predicate.not_negation_predicateP(pred1, pred2, mt, UNPROVIDED)));
        }
        return NIL;
    }/**
     * Does the extension of PRED1 include some tuple in the extension of PRED2?
     */


    public static final SubLObject preds_intersectP_alt(SubLObject pred1, SubLObject pred2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.genl_predicates.predicates_intersectP(pred1, pred2, mt);
    }

    public static SubLObject preds_intersectP(final SubLObject pred1, final SubLObject pred2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return predicates_intersectP(pred1, pred2, mt);
    }

    /**
     * A justification of (genlPreds SPEC GENL)
     */
    @LispMethod(comment = "A justification of (genlPreds SPEC GENL)")
    public static final SubLObject why_genl_predicateP_alt(SubLObject spec, SubLObject genl, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (behavior == UNPROVIDED) {
            behavior = NIL;
        }
        SubLTrampolineFile.checkType(spec, FORT_P);
        SubLTrampolineFile.checkType(genl, FORT_P);
        return sbhl_search_methods.why_sbhl_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genlPreds), spec, genl, mt, tv, behavior);
    }

    /**
     * A justification of (genlPreds SPEC GENL)
     */
    @LispMethod(comment = "A justification of (genlPreds SPEC GENL)")
    public static SubLObject why_genl_predicateP(final SubLObject spec, final SubLObject genl, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (behavior == UNPROVIDED) {
            behavior = NIL;
        }
        SubLTrampolineFile.enforceType(spec, FORT_P);
        SubLTrampolineFile.enforceType(genl, FORT_P);
        return sbhl_search_methods.why_sbhl_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genlPreds), spec, genl, mt, tv, behavior);
    }/**
     * A justification of (genlPreds SPEC GENL)
     */


    /**
     * A justification of (not (genlPreds SPEC GENL))
     */
    @LispMethod(comment = "A justification of (not (genlPreds SPEC GENL))")
    public static final SubLObject why_not_genl_predicateP_alt(SubLObject spec, SubLObject genl, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (behavior == UNPROVIDED) {
            behavior = NIL;
        }
        SubLTrampolineFile.checkType(spec, FORT_P);
        SubLTrampolineFile.checkType(genl, FORT_P);
        return sbhl_search_implied_relations.why_sbhl_implied_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genlPreds), spec, genl, mt, tv, behavior);
    }

    /**
     * A justification of (not (genlPreds SPEC GENL))
     */
    @LispMethod(comment = "A justification of (not (genlPreds SPEC GENL))")
    public static SubLObject why_not_genl_predicateP(final SubLObject spec, final SubLObject genl, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (behavior == UNPROVIDED) {
            behavior = NIL;
        }
        SubLTrampolineFile.enforceType(spec, FORT_P);
        SubLTrampolineFile.enforceType(genl, FORT_P);
        return sbhl_search_implied_relations.why_sbhl_implied_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genlPreds), spec, genl, mt, tv, behavior);
    }/**
     * A justification of (not (genlPreds SPEC GENL))
     */


    /**
     * A justification of (genlInverse PRED GENL-INVERSE)
     */
    @LispMethod(comment = "A justification of (genlInverse PRED GENL-INVERSE)")
    public static final SubLObject why_genl_inverseP_alt(SubLObject pred, SubLObject genl_inverse, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (behavior == UNPROVIDED) {
            behavior = NIL;
        }
        SubLTrampolineFile.checkType(pred, FORT_P);
        SubLTrampolineFile.checkType(genl_inverse, FORT_P);
        return sbhl_search_methods.why_sbhl_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, genl_inverse, mt, tv, behavior);
    }

    /**
     * A justification of (genlInverse PRED GENL-INVERSE)
     */
    @LispMethod(comment = "A justification of (genlInverse PRED GENL-INVERSE)")
    public static SubLObject why_genl_inverseP(final SubLObject pred, final SubLObject genl_inverse, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (behavior == UNPROVIDED) {
            behavior = NIL;
        }
        SubLTrampolineFile.enforceType(pred, FORT_P);
        SubLTrampolineFile.enforceType(genl_inverse, FORT_P);
        return sbhl_search_methods.why_sbhl_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, genl_inverse, mt, tv, behavior);
    }/**
     * A justification of (genlInverse PRED GENL-INVERSE)
     */


    /**
     * justification of (genlInverse SPEC-INVERSE PRED)
     */
    @LispMethod(comment = "justification of (genlInverse SPEC-INVERSE PRED)")
    public static final SubLObject why_spec_inverseP_alt(SubLObject pred, SubLObject spec_inverse, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (behavior == UNPROVIDED) {
            behavior = NIL;
        }
        return sbhl_search_methods.why_sbhl_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genlInverse), spec_inverse, pred, mt, tv, behavior);
    }

    /**
     * justification of (genlInverse SPEC-INVERSE PRED)
     */
    @LispMethod(comment = "justification of (genlInverse SPEC-INVERSE PRED)")
    public static SubLObject why_spec_inverseP(final SubLObject pred, final SubLObject spec_inverse, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (behavior == UNPROVIDED) {
            behavior = NIL;
        }
        return sbhl_search_methods.why_sbhl_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genlInverse), spec_inverse, pred, mt, tv, behavior);
    }/**
     * justification of (genlInverse SPEC-INVERSE PRED)
     */


    /**
     * A justification of (not (genlInverse SPEC GENL)
     */
    @LispMethod(comment = "A justification of (not (genlInverse SPEC GENL)")
    public static final SubLObject why_not_genl_inverseP_alt(SubLObject spec, SubLObject genl, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (behavior == UNPROVIDED) {
            behavior = NIL;
        }
        SubLTrampolineFile.checkType(spec, FORT_P);
        SubLTrampolineFile.checkType(genl, FORT_P);
        return sbhl_search_implied_relations.why_sbhl_implied_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genlMt), spec, genl, mt, tv, behavior);
    }

    /**
     * A justification of (not (genlInverse SPEC GENL)
     */
    @LispMethod(comment = "A justification of (not (genlInverse SPEC GENL)")
    public static SubLObject why_not_genl_inverseP(final SubLObject spec, final SubLObject genl, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (behavior == UNPROVIDED) {
            behavior = NIL;
        }
        SubLTrampolineFile.enforceType(spec, FORT_P);
        SubLTrampolineFile.enforceType(genl, FORT_P);
        return sbhl_search_implied_relations.why_sbhl_implied_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genlMt), spec, genl, mt, tv, behavior);
    }/**
     * A justification of (not (genlInverse SPEC GENL)
     */


    /**
     * A justification for why SPEC is a spec-predicate of one of GENLS.
     */
    @LispMethod(comment = "A justification for why SPEC is a spec-predicate of one of GENLS.")
    public static final SubLObject why_some_genl_predicate_amongP_alt(SubLObject spec, SubLObject v_genls, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (behavior == UNPROVIDED) {
            behavior = $ASSERTION;
        }
        return sbhl_search_methods.why_some_sbhl_predicate_relation_among_p(sbhl_module_vars.get_sbhl_module($$genlPreds), spec, v_genls, mt, tv, behavior);
    }

    /**
     * A justification for why SPEC is a spec-predicate of one of GENLS.
     */
    @LispMethod(comment = "A justification for why SPEC is a spec-predicate of one of GENLS.")
    public static SubLObject why_some_genl_predicate_amongP(final SubLObject spec, final SubLObject v_genls, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (behavior == UNPROVIDED) {
            behavior = $ASSERTION;
        }
        return sbhl_search_methods.why_some_sbhl_predicate_relation_among_p(sbhl_module_vars.get_sbhl_module($$genlPreds), spec, v_genls, mt, tv, behavior);
    }/**
     * A justification for why SPEC is a spec-predicate of one of GENLS.
     */


    /**
     * A justification for why SPEC is a spec-inverse of one of GENLS.
     */
    @LispMethod(comment = "A justification for why SPEC is a spec-inverse of one of GENLS.")
    public static final SubLObject why_some_genl_inverse_amongP_alt(SubLObject spec, SubLObject genl_invs, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (behavior == UNPROVIDED) {
            behavior = $ASSERTION;
        }
        return sbhl_search_methods.why_some_sbhl_predicate_relation_among_p(sbhl_module_vars.get_sbhl_module($$genlInverse), spec, genl_invs, mt, tv, behavior);
    }

    /**
     * A justification for why SPEC is a spec-inverse of one of GENLS.
     */
    @LispMethod(comment = "A justification for why SPEC is a spec-inverse of one of GENLS.")
    public static SubLObject why_some_genl_inverse_amongP(final SubLObject spec, final SubLObject genl_invs, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (behavior == UNPROVIDED) {
            behavior = $ASSERTION;
        }
        return sbhl_search_methods.why_some_sbhl_predicate_relation_among_p(sbhl_module_vars.get_sbhl_module($$genlInverse), spec, genl_invs, mt, tv, behavior);
    }/**
     * A justification for why SPEC is a spec-inverse of one of GENLS.
     */


    /**
     *
     *
     * @return listp; In what (most-genl) mts is GENL a genlPred of SPEC?
     */
    @LispMethod(comment = "@return listp; In what (most-genl) mts is GENL a genlPred of SPEC?")
    public static final SubLObject max_floor_mts_of_genl_predicate_paths_alt(SubLObject spec, SubLObject genl, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(spec, FORT_P);
        SubLTrampolineFile.checkType(genl, FORT_P);
        return sbhl_search_what_mts.sbhl_max_floor_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module($$genlPreds), spec, genl, tv);
    }

    /**
     *
     *
     * @return listp; In what (most-genl) mts is GENL a genlPred of SPEC?
     */
    @LispMethod(comment = "@return listp; In what (most-genl) mts is GENL a genlPred of SPEC?")
    public static SubLObject max_floor_mts_of_genl_predicate_paths(final SubLObject spec, final SubLObject genl, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(spec, FORT_P);
        SubLTrampolineFile.enforceType(genl, FORT_P);
        return sbhl_search_what_mts.sbhl_max_floor_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module($$genlPreds), spec, genl, tv);
    }

    public static final SubLObject max_floor_mts_of_genl_pred_paths_alt(SubLObject spec, SubLObject genl) {
        return com.cyc.cycjava.cycl.genl_predicates.max_floor_mts_of_genl_predicate_paths(spec, genl, UNPROVIDED);
    }

    public static SubLObject max_floor_mts_of_genl_pred_paths(final SubLObject spec, final SubLObject genl) {
        return max_floor_mts_of_genl_predicate_paths(spec, genl, UNPROVIDED);
    }

    /**
     *
     *
     * @return listp; what minimal sets of mts are associated with genlPred paths from SPEC to GENL?
     */
    @LispMethod(comment = "@return listp; what minimal sets of mts are associated with genlPred paths from SPEC to GENL?")
    public static final SubLObject min_mts_of_genl_predicate_paths_alt(SubLObject spec, SubLObject genl, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_what_mts.sbhl_min_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module($$genlPreds), spec, genl, tv);
    }

    /**
     *
     *
     * @return listp; what minimal sets of mts are associated with genlPred paths from SPEC to GENL?
     */
    @LispMethod(comment = "@return listp; what minimal sets of mts are associated with genlPred paths from SPEC to GENL?")
    public static SubLObject min_mts_of_genl_predicate_paths(final SubLObject spec, final SubLObject genl, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_what_mts.sbhl_min_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module($$genlPreds), spec, genl, tv);
    }

    public static final SubLObject min_mts_of_genl_pred_paths_alt(SubLObject spec, SubLObject genl, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return com.cyc.cycjava.cycl.genl_predicates.min_mts_of_genl_predicate_paths(spec, genl, tv);
    }

    public static SubLObject min_mts_of_genl_pred_paths(final SubLObject spec, final SubLObject genl, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return min_mts_of_genl_predicate_paths(spec, genl, tv);
    }

    /**
     *
     *
     * @return listp; the most genl mts by which NOT-GENL is accessible to SPEC by a false genl-predicate path. Currently this does not take disjoins into account.
     */
    @LispMethod(comment = "@return listp; the most genl mts by which NOT-GENL is accessible to SPEC by a false genl-predicate path. Currently this does not take disjoins into account.")
    public static final SubLObject max_floor_mts_of_not_genl_predicate_paths_alt(SubLObject spec, SubLObject not_genl, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_what_mts.sbhl_max_floor_mts_of_false_inverse_paths(sbhl_module_vars.get_sbhl_module($$genlPreds), not_genl, spec, tv);
    }

    /**
     *
     *
     * @return listp; the most genl mts by which NOT-GENL is accessible to SPEC by a false genl-predicate path. Currently this does not take disjoins into account.
     */
    @LispMethod(comment = "@return listp; the most genl mts by which NOT-GENL is accessible to SPEC by a false genl-predicate path. Currently this does not take disjoins into account.")
    public static SubLObject max_floor_mts_of_not_genl_predicate_paths(final SubLObject spec, final SubLObject not_genl, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_what_mts.sbhl_max_floor_mts_of_false_inverse_paths(sbhl_module_vars.get_sbhl_module($$genlPreds), not_genl, spec, tv);
    }

    /**
     *
     *
     * @return listp; what minimal sets of mts are associated with false genl-predicate paths from SPEC to GENL?. Currently this does not take disjoins into account.
     */
    @LispMethod(comment = "@return listp; what minimal sets of mts are associated with false genl-predicate paths from SPEC to GENL?. Currently this does not take disjoins into account.")
    public static final SubLObject min_mts_of_not_genl_predicate_paths_alt(SubLObject spec, SubLObject not_genl, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_what_mts.sbhl_min_mts_of_false_inverse_paths(sbhl_module_vars.get_sbhl_module($$genlPreds), not_genl, spec, tv);
    }

    /**
     *
     *
     * @return listp; what minimal sets of mts are associated with false genl-predicate paths from SPEC to GENL?. Currently this does not take disjoins into account.
     */
    @LispMethod(comment = "@return listp; what minimal sets of mts are associated with false genl-predicate paths from SPEC to GENL?. Currently this does not take disjoins into account.")
    public static SubLObject min_mts_of_not_genl_predicate_paths(final SubLObject spec, final SubLObject not_genl, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_what_mts.sbhl_min_mts_of_false_inverse_paths(sbhl_module_vars.get_sbhl_module($$genlPreds), not_genl, spec, tv);
    }

    /**
     * In what (most-genl) mts is GENL-INVERSE a genlInverse of SPEC?
     */
    @LispMethod(comment = "In what (most-genl) mts is GENL-INVERSE a genlInverse of SPEC?")
    public static final SubLObject max_floor_mts_of_genl_inverse_paths_alt(SubLObject spec, SubLObject genl_inverse, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(spec, FORT_P);
        SubLTrampolineFile.checkType(genl_inverse, FORT_P);
        return sbhl_search_what_mts.sbhl_max_floor_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module($$genlInverse), spec, genl_inverse, tv);
    }

    /**
     * In what (most-genl) mts is GENL-INVERSE a genlInverse of SPEC?
     */
    @LispMethod(comment = "In what (most-genl) mts is GENL-INVERSE a genlInverse of SPEC?")
    public static SubLObject max_floor_mts_of_genl_inverse_paths(final SubLObject spec, final SubLObject genl_inverse, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(spec, FORT_P);
        SubLTrampolineFile.enforceType(genl_inverse, FORT_P);
        return sbhl_search_what_mts.sbhl_max_floor_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module($$genlInverse), spec, genl_inverse, tv);
    }/**
     * In what (most-genl) mts is GENL-INVERSE a genlInverse of SPEC?
     */


    /**
     *
     *
     * @return listp; what minimal sets of mts are associated with genlInverse paths from SPEC to GENL-INVERSE?
     */
    @LispMethod(comment = "@return listp; what minimal sets of mts are associated with genlInverse paths from SPEC to GENL-INVERSE?")
    public static final SubLObject min_mts_of_genl_inverse_paths_alt(SubLObject spec, SubLObject genl_inverse, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_what_mts.sbhl_min_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module($$genlInverse), spec, genl_inverse, tv);
    }

    /**
     *
     *
     * @return listp; what minimal sets of mts are associated with genlInverse paths from SPEC to GENL-INVERSE?
     */
    @LispMethod(comment = "@return listp; what minimal sets of mts are associated with genlInverse paths from SPEC to GENL-INVERSE?")
    public static SubLObject min_mts_of_genl_inverse_paths(final SubLObject spec, final SubLObject genl_inverse, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_what_mts.sbhl_min_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module($$genlInverse), spec, genl_inverse, tv);
    }

    /**
     *
     *
     * @return listp; the most genl mts by which NOT-GENL is accessible to SPEC by a false genls path. Currently this does not take disjoins into account.
     */
    @LispMethod(comment = "@return listp; the most genl mts by which NOT-GENL is accessible to SPEC by a false genls path. Currently this does not take disjoins into account.")
    public static final SubLObject max_floor_mts_of_not_genl_inverse_paths_alt(SubLObject spec, SubLObject not_genl_inverse, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_what_mts.sbhl_max_floor_mts_of_false_inverse_paths(sbhl_module_vars.get_sbhl_module($$genlInverse), not_genl_inverse, spec, tv);
    }

    /**
     *
     *
     * @return listp; the most genl mts by which NOT-GENL is accessible to SPEC by a false genls path. Currently this does not take disjoins into account.
     */
    @LispMethod(comment = "@return listp; the most genl mts by which NOT-GENL is accessible to SPEC by a false genls path. Currently this does not take disjoins into account.")
    public static SubLObject max_floor_mts_of_not_genl_inverse_paths(final SubLObject spec, final SubLObject not_genl_inverse, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_what_mts.sbhl_max_floor_mts_of_false_inverse_paths(sbhl_module_vars.get_sbhl_module($$genlInverse), not_genl_inverse, spec, tv);
    }

    /**
     *
     *
     * @return listp; what minimal sets of mts are associated with false-genls paths from SPEC to GENL?. Currently this does not take disjoins into account.
     */
    @LispMethod(comment = "@return listp; what minimal sets of mts are associated with false-genls paths from SPEC to GENL?. Currently this does not take disjoins into account.")
    public static final SubLObject min_mts_of_not_genl_inverse_paths_alt(SubLObject spec, SubLObject not_genl_inverse, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_what_mts.sbhl_min_mts_of_false_inverse_paths(sbhl_module_vars.get_sbhl_module($$genlInverse), not_genl_inverse, spec, tv);
    }

    /**
     *
     *
     * @return listp; what minimal sets of mts are associated with false-genls paths from SPEC to GENL?. Currently this does not take disjoins into account.
     */
    @LispMethod(comment = "@return listp; what minimal sets of mts are associated with false-genls paths from SPEC to GENL?. Currently this does not take disjoins into account.")
    public static SubLObject min_mts_of_not_genl_inverse_paths(final SubLObject spec, final SubLObject not_genl_inverse, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_what_mts.sbhl_min_mts_of_false_inverse_paths(sbhl_module_vars.get_sbhl_module($$genlInverse), not_genl_inverse, spec, tv);
    }

    /**
     * those candidate-genl-preds wrt PRED whose args are most tightly constrained
     */
    @LispMethod(comment = "those candidate-genl-preds wrt PRED whose args are most tightly constrained")
    public static final SubLObject min_candidate_genl_preds_alt(SubLObject pred, SubLObject omit, SubLObject mt) {
        if (omit == UNPROVIDED) {
            omit = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.genl_predicates.min_preds_wrt_arg_types(com.cyc.cycjava.cycl.genl_predicates.min_predicates(set_difference(remove(pred, com.cyc.cycjava.cycl.genl_predicates.candidate_genl_preds(pred, mt), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), omit, UNPROVIDED, UNPROVIDED), mt, UNPROVIDED), mt);
    }

    /**
     * those candidate-genl-preds wrt PRED whose args are most tightly constrained
     */
    @LispMethod(comment = "those candidate-genl-preds wrt PRED whose args are most tightly constrained")
    public static SubLObject min_candidate_genl_preds(final SubLObject pred, SubLObject omit, SubLObject mt) {
        if (omit == UNPROVIDED) {
            omit = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return min_preds_wrt_arg_types(min_predicates(set_difference(remove(pred, candidate_genl_preds(pred, mt), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), omit, UNPROVIDED, UNPROVIDED), mt, UNPROVIDED), mt);
    }/**
     * those candidate-genl-preds wrt PRED whose args are most tightly constrained
     */


    /**
     * the most tightly constrained of PRED's @see cached-candidate-genl-preds.
     */
    @LispMethod(comment = "the most tightly constrained of PRED\'s @see cached-candidate-genl-preds.")
    public static final SubLObject cached_min_candidate_genl_preds_alt(SubLObject pred, SubLObject omit) {
        if (omit == UNPROVIDED) {
            omit = NIL;
        }
        return com.cyc.cycjava.cycl.genl_predicates.min_preds_wrt_arg_types(com.cyc.cycjava.cycl.genl_predicates.min_predicates(set_difference(remove(pred, com.cyc.cycjava.cycl.genl_predicates.cached_candidate_genl_preds(pred), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), omit, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED), UNPROVIDED);
    }

    /**
     * the most tightly constrained of PRED's @see cached-candidate-genl-preds.
     */
    @LispMethod(comment = "the most tightly constrained of PRED\'s @see cached-candidate-genl-preds.")
    public static SubLObject cached_min_candidate_genl_preds(final SubLObject pred, SubLObject omit) {
        if (omit == UNPROVIDED) {
            omit = NIL;
        }
        return min_preds_wrt_arg_types(min_predicates(set_difference(remove(pred, cached_candidate_genl_preds(pred), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), omit, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED), UNPROVIDED);
    }/**
     * the most tightly constrained of PRED's @see cached-candidate-genl-preds.
     */


    /**
     * the most tightly constrained of PRED's @see cached-candidate-genl-preds-in-mt.
     */
    @LispMethod(comment = "the most tightly constrained of PRED\'s @see cached-candidate-genl-preds-in-mt.")
    public static final SubLObject cached_min_candidate_genl_preds_in_mt_alt(SubLObject pred, SubLObject mt, SubLObject omit) {
        if (omit == UNPROVIDED) {
            omit = NIL;
        }
        return com.cyc.cycjava.cycl.genl_predicates.min_preds_wrt_arg_types(com.cyc.cycjava.cycl.genl_predicates.min_predicates(set_difference(remove(pred, com.cyc.cycjava.cycl.genl_predicates.cached_candidate_genl_preds_in_mt(pred, mt), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), omit, UNPROVIDED, UNPROVIDED), mt, UNPROVIDED), mt);
    }

    /**
     * the most tightly constrained of PRED's @see cached-candidate-genl-preds-in-mt.
     */
    @LispMethod(comment = "the most tightly constrained of PRED\'s @see cached-candidate-genl-preds-in-mt.")
    public static SubLObject cached_min_candidate_genl_preds_in_mt(final SubLObject pred, final SubLObject mt, SubLObject omit) {
        if (omit == UNPROVIDED) {
            omit = NIL;
        }
        return min_preds_wrt_arg_types(min_predicates(set_difference(remove(pred, cached_candidate_genl_preds_in_mt(pred, mt), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), omit, UNPROVIDED, UNPROVIDED), mt, UNPROVIDED), mt);
    }/**
     * the most tightly constrained of PRED's @see cached-candidate-genl-preds-in-mt.
     */


    public static final SubLObject clear_cached_candidate_genl_preds_alt() {
        {
            SubLObject cs = $cached_candidate_genl_preds_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_cached_candidate_genl_preds() {
        final SubLObject cs = $cached_candidate_genl_preds_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_cached_candidate_genl_preds_alt(SubLObject pred) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_candidate_genl_preds_caching_state$.getGlobalValue(), list(pred), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_cached_candidate_genl_preds(final SubLObject pred) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_candidate_genl_preds_caching_state$.getGlobalValue(), list(pred), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cached_candidate_genl_preds_internal_alt(SubLObject pred) {
        return com.cyc.cycjava.cycl.genl_predicates.candidate_genl_preds(pred, UNPROVIDED);
    }

    public static SubLObject cached_candidate_genl_preds_internal(final SubLObject pred) {
        return candidate_genl_preds(pred, UNPROVIDED);
    }

    public static final SubLObject cached_candidate_genl_preds_alt(SubLObject pred) {
        {
            SubLObject caching_state = $cached_candidate_genl_preds_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(CACHED_CANDIDATE_GENL_PREDS, $cached_candidate_genl_preds_caching_state$, NIL, EQL, ONE_INTEGER, $int$64);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, pred, $kw191$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw191$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.genl_predicates.cached_candidate_genl_preds_internal(pred)));
                    memoization_state.caching_state_put(caching_state, pred, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject cached_candidate_genl_preds(final SubLObject pred) {
        SubLObject caching_state = $cached_candidate_genl_preds_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CACHED_CANDIDATE_GENL_PREDS, $cached_candidate_genl_preds_caching_state$, $int$512, EQL, ONE_INTEGER, $int$64);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pred, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(cached_candidate_genl_preds_internal(pred)));
            memoization_state.caching_state_put(caching_state, pred, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject clear_cached_candidate_genl_preds_in_mt_alt() {
        {
            SubLObject cs = $cached_candidate_genl_preds_in_mt_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_cached_candidate_genl_preds_in_mt() {
        final SubLObject cs = $cached_candidate_genl_preds_in_mt_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_cached_candidate_genl_preds_in_mt_alt(SubLObject pred, SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_candidate_genl_preds_in_mt_caching_state$.getGlobalValue(), list(pred, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_cached_candidate_genl_preds_in_mt(final SubLObject pred, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_candidate_genl_preds_in_mt_caching_state$.getGlobalValue(), list(pred, mt), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cached_candidate_genl_preds_in_mt_internal_alt(SubLObject pred, SubLObject mt) {
        return com.cyc.cycjava.cycl.genl_predicates.candidate_genl_preds(pred, mt);
    }

    public static SubLObject cached_candidate_genl_preds_in_mt_internal(final SubLObject pred, final SubLObject mt) {
        return candidate_genl_preds(pred, mt);
    }

    public static final SubLObject cached_candidate_genl_preds_in_mt_alt(SubLObject pred, SubLObject mt) {
        {
            SubLObject caching_state = $cached_candidate_genl_preds_in_mt_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(CACHED_CANDIDATE_GENL_PREDS_IN_MT, $cached_candidate_genl_preds_in_mt_caching_state$, NIL, EQL, TWO_INTEGER, $int$64);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(pred, mt);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw191$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (pred.eql(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.genl_predicates.cached_candidate_genl_preds_in_mt_internal(pred, mt)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(pred, mt));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject cached_candidate_genl_preds_in_mt(final SubLObject pred, final SubLObject mt) {
        SubLObject caching_state = $cached_candidate_genl_preds_in_mt_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CACHED_CANDIDATE_GENL_PREDS_IN_MT, $cached_candidate_genl_preds_in_mt_caching_state$, $int$512, EQL, TWO_INTEGER, $int$64);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pred, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(cached_candidate_genl_preds_in_mt_internal(pred, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred, mt));
        return memoization_state.caching_results(results3);
    }

    /**
     * returns predicates whose arity, arg-isa, and arg-genls constraints are consistent
     * with those of PRED
     */
    @LispMethod(comment = "returns predicates whose arity, arg-isa, and arg-genls constraints are consistent\r\nwith those of PRED\nreturns predicates whose arity, arg-isa, and arg-genls constraints are consistent\nwith those of PRED")
    public static final SubLObject candidate_genl_preds_alt(SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != fort_types_interface.predicateP(pred)) {
                {
                    SubLObject v_arity = arity.arity(pred);
                    SubLObject pos_arityP = makeBoolean((NIL != v_arity) && v_arity.numG(ZERO_INTEGER));
                    SubLObject result = NIL;
                    if ((NIL == v_arity) || (NIL != valid_arity_p(v_arity))) {
                    }
                    {
                        SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_referent$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_referent$.bind(v_arity, thread);
                            if (NIL != pos_arityP) {
                                {
                                    SubLObject arg_isas = kb_accessors.argn_isa(pred, ONE_INTEGER, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_97 = sbhl_marking_vars.$sbhl_target_space$.currentBinding(thread);
                                        try {
                                            sbhl_marking_vars.$sbhl_target_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                            {
                                                SubLObject _prev_bind_0_98 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                                try {
                                                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread), thread);
                                                    {
                                                        SubLObject cdolist_list_var = arg_isas;
                                                        SubLObject arg_isa = NIL;
                                                        for (arg_isa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg_isa = cdolist_list_var.first()) {
                                                            sbhl_marking_methods.sbhl_mark_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), arg_isa, mt, UNPROVIDED);
                                                        }
                                                    }
                                                } finally {
                                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_98, thread);
                                                }
                                            }
                                            {
                                                SubLObject cdolist_list_var = arg_isas;
                                                SubLObject arg_isa = NIL;
                                                for (arg_isa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg_isa = cdolist_list_var.first()) {
                                                    result = nconc(result, com.cyc.cycjava.cycl.genl_predicates.candidate_preds_for_arg_type(arg_isa, ONE_INTEGER, $ISA, mt));
                                                }
                                            }
                                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
                                        } finally {
                                            sbhl_marking_vars.$sbhl_target_space$.rebind(_prev_bind_0_97, thread);
                                        }
                                    }
                                }
                                {
                                    SubLObject cdotimes_end_var = subtract(v_arity, ONE_INTEGER);
                                    SubLObject n = NIL;
                                    for (n = ZERO_INTEGER; n.numL(cdotimes_end_var); n = add(n, ONE_INTEGER)) {
                                        if (NIL != result) {
                                            {
                                                SubLObject arg = add(TWO_INTEGER, n);
                                                SubLObject arg_isas = kb_accessors.argn_isa(pred, arg, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_99 = sbhl_marking_vars.$sbhl_target_space$.currentBinding(thread);
                                                    try {
                                                        sbhl_marking_vars.$sbhl_target_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                        {
                                                            SubLObject _prev_bind_0_100 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                                            try {
                                                                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread), thread);
                                                                {
                                                                    SubLObject cdolist_list_var = arg_isas;
                                                                    SubLObject arg_isa = NIL;
                                                                    for (arg_isa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg_isa = cdolist_list_var.first()) {
                                                                        sbhl_marking_methods.sbhl_mark_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), arg_isa, mt, UNPROVIDED);
                                                                    }
                                                                }
                                                            } finally {
                                                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_100, thread);
                                                            }
                                                        }
                                                        {
                                                            SubLObject cdolist_list_var = arg_isas;
                                                            SubLObject arg_isa = NIL;
                                                            for (arg_isa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg_isa = cdolist_list_var.first()) {
                                                                result = keyhash_utilities.intersect_forts(result, com.cyc.cycjava.cycl.genl_predicates.candidate_preds_for_arg_type(arg_isa, arg, $ISA, mt));
                                                            }
                                                        }
                                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
                                                    } finally {
                                                        sbhl_marking_vars.$sbhl_target_space$.rebind(_prev_bind_0_99, thread);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            {
                                SubLObject args_isas = kb_accessors.args_isa(pred, UNPROVIDED);
                                if (NIL != args_isas) {
                                    {
                                        SubLObject _prev_bind_0_101 = sbhl_marking_vars.$sbhl_target_space$.currentBinding(thread);
                                        try {
                                            sbhl_marking_vars.$sbhl_target_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                            {
                                                SubLObject _prev_bind_0_102 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                                try {
                                                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread), thread);
                                                    {
                                                        SubLObject cdolist_list_var = args_isas;
                                                        SubLObject arg_isa = NIL;
                                                        for (arg_isa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg_isa = cdolist_list_var.first()) {
                                                            sbhl_marking_methods.sbhl_mark_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), arg_isa, mt, UNPROVIDED);
                                                        }
                                                    }
                                                } finally {
                                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_102, thread);
                                                }
                                            }
                                            {
                                                SubLObject cdolist_list_var = args_isas;
                                                SubLObject arg_isa = NIL;
                                                for (arg_isa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg_isa = cdolist_list_var.first()) {
                                                    if (NIL != pos_arityP) {
                                                        result = keyhash_utilities.intersect_forts(result, com.cyc.cycjava.cycl.genl_predicates.candidate_preds_for_arg_type(arg_isa, ZERO_INTEGER, $ISA, UNPROVIDED));
                                                    } else {
                                                        result = nconc(result, com.cyc.cycjava.cycl.genl_predicates.candidate_preds_for_arg_type(arg_isa, ZERO_INTEGER, $ISA, mt));
                                                    }
                                                }
                                            }
                                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
                                        } finally {
                                            sbhl_marking_vars.$sbhl_target_space$.rebind(_prev_bind_0_101, thread);
                                        }
                                    }
                                }
                            }
                            {
                                SubLObject cdotimes_end_var = add(ONE_INTEGER, NIL != pos_arityP ? ((SubLObject) (v_arity)) : ZERO_INTEGER);
                                SubLObject arg = NIL;
                                for (arg = ZERO_INTEGER; arg.numL(cdotimes_end_var); arg = add(arg, ONE_INTEGER)) {
                                    if (NIL != result) {
                                        {
                                            SubLObject arg_genls = kb_accessors.argn_genl(pred, arg, UNPROVIDED);
                                            if (NIL != arg_genls) {
                                                {
                                                    SubLObject _prev_bind_0_103 = sbhl_marking_vars.$sbhl_target_space$.currentBinding(thread);
                                                    try {
                                                        sbhl_marking_vars.$sbhl_target_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                        {
                                                            SubLObject _prev_bind_0_104 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                                            try {
                                                                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread), thread);
                                                                {
                                                                    SubLObject cdolist_list_var = arg_genls;
                                                                    SubLObject arg_genl = NIL;
                                                                    for (arg_genl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg_genl = cdolist_list_var.first()) {
                                                                        sbhl_marking_methods.sbhl_mark_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), arg_genl, mt, UNPROVIDED);
                                                                    }
                                                                }
                                                            } finally {
                                                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_104, thread);
                                                            }
                                                        }
                                                        {
                                                            SubLObject cdolist_list_var = arg_genls;
                                                            SubLObject arg_genl = NIL;
                                                            for (arg_genl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg_genl = cdolist_list_var.first()) {
                                                                result = keyhash_utilities.intersect_forts(result, com.cyc.cycjava.cycl.genl_predicates.candidate_preds_for_arg_type(arg_genl, arg, $GENL, mt));
                                                            }
                                                        }
                                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
                                                    } finally {
                                                        sbhl_marking_vars.$sbhl_target_space$.rebind(_prev_bind_0_103, thread);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } finally {
                            sbhl_search_vars.$sbhl_referent$.rebind(_prev_bind_0, thread);
                        }
                    }
                    return result;
                }
            }
            return NIL;
        }
    }

    /**
     * returns predicates whose arity, arg-isa, and arg-genls constraints are consistent
     * with those of PRED
     */
    @LispMethod(comment = "returns predicates whose arity, arg-isa, and arg-genls constraints are consistent\r\nwith those of PRED\nreturns predicates whose arity, arg-isa, and arg-genls constraints are consistent\nwith those of PRED")
    public static SubLObject candidate_genl_preds(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != fort_types_interface.predicateP(pred)) {
            final SubLObject v_arity = arity.arity(pred);
            final SubLObject pos_arityP = makeBoolean((NIL != v_arity) && v_arity.numG(ZERO_INTEGER));
            SubLObject result = NIL;
            if ((NIL == v_arity) || (NIL != valid_arity_p(v_arity))) {
            }
            final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_referent$.currentBinding(thread);
            try {
                sbhl_search_vars.$sbhl_referent$.bind(v_arity, thread);
                if (NIL != pos_arityP) {
                    final SubLObject arg_isas = kb_accessors.argn_isa(pred, ONE_INTEGER, UNPROVIDED);
                    final SubLObject _prev_bind_0_$99 = sbhl_marking_vars.$sbhl_target_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_target_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject _prev_bind_0_$100 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread), thread);
                                SubLObject cdolist_list_var = arg_isas;
                                SubLObject arg_isa = NIL;
                                arg_isa = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    sbhl_marking_methods.sbhl_mark_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), arg_isa, mt, UNPROVIDED);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    arg_isa = cdolist_list_var.first();
                                } 
                            } finally {
                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$100, thread);
                            }
                            SubLObject cdolist_list_var2 = arg_isas;
                            SubLObject arg_isa2 = NIL;
                            arg_isa2 = cdolist_list_var2.first();
                            while (NIL != cdolist_list_var2) {
                                result = nconc(result, candidate_preds_for_arg_type(arg_isa2, ONE_INTEGER, $ISA, mt));
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                arg_isa2 = cdolist_list_var2.first();
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$101 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$101, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_target_space$.rebind(_prev_bind_0_$99, thread);
                    }
                    SubLObject cdotimes_end_var;
                    SubLObject n;
                    SubLObject arg;
                    SubLObject arg_isas2;
                    SubLObject _prev_bind_0_$102;
                    SubLObject _prev_bind_0_$103;
                    SubLObject cdolist_list_var3;
                    SubLObject arg_isa3;
                    SubLObject cdolist_list_var4;
                    SubLObject arg_isa4;
                    SubLObject _prev_bind_0_$104;
                    SubLObject _values2;
                    for (cdotimes_end_var = subtract(v_arity, ONE_INTEGER), n = NIL, n = ZERO_INTEGER; n.numL(cdotimes_end_var); n = add(n, ONE_INTEGER)) {
                        if (NIL != result) {
                            arg = add(TWO_INTEGER, n);
                            arg_isas2 = kb_accessors.argn_isa(pred, arg, UNPROVIDED);
                            _prev_bind_0_$102 = sbhl_marking_vars.$sbhl_target_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_target_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                try {
                                    _prev_bind_0_$103 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                    try {
                                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread), thread);
                                        cdolist_list_var3 = arg_isas2;
                                        arg_isa3 = NIL;
                                        arg_isa3 = cdolist_list_var3.first();
                                        while (NIL != cdolist_list_var3) {
                                            sbhl_marking_methods.sbhl_mark_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), arg_isa3, mt, UNPROVIDED);
                                            cdolist_list_var3 = cdolist_list_var3.rest();
                                            arg_isa3 = cdolist_list_var3.first();
                                        } 
                                    } finally {
                                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$103, thread);
                                    }
                                    cdolist_list_var4 = arg_isas2;
                                    arg_isa4 = NIL;
                                    arg_isa4 = cdolist_list_var4.first();
                                    while (NIL != cdolist_list_var4) {
                                        result = keyhash_utilities.intersect_forts(result, candidate_preds_for_arg_type(arg_isa4, arg, $ISA, mt));
                                        cdolist_list_var4 = cdolist_list_var4.rest();
                                        arg_isa4 = cdolist_list_var4.first();
                                    } 
                                } finally {
                                    _prev_bind_0_$104 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        _values2 = getValuesAsVector();
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$104, thread);
                                    }
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_target_space$.rebind(_prev_bind_0_$102, thread);
                            }
                        }
                    }
                }
                final SubLObject args_isas = kb_accessors.args_isa(pred, UNPROVIDED);
                if (NIL != args_isas) {
                    final SubLObject _prev_bind_0_$105 = sbhl_marking_vars.$sbhl_target_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_target_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject _prev_bind_0_$106 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread), thread);
                                SubLObject cdolist_list_var = args_isas;
                                SubLObject arg_isa = NIL;
                                arg_isa = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    sbhl_marking_methods.sbhl_mark_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), arg_isa, mt, UNPROVIDED);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    arg_isa = cdolist_list_var.first();
                                } 
                            } finally {
                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$106, thread);
                            }
                            SubLObject cdolist_list_var2 = args_isas;
                            SubLObject arg_isa2 = NIL;
                            arg_isa2 = cdolist_list_var2.first();
                            while (NIL != cdolist_list_var2) {
                                if (NIL != pos_arityP) {
                                    result = keyhash_utilities.intersect_forts(result, candidate_preds_for_arg_type(arg_isa2, ZERO_INTEGER, $ISA, UNPROVIDED));
                                } else {
                                    result = nconc(result, candidate_preds_for_arg_type(arg_isa2, ZERO_INTEGER, $ISA, mt));
                                }
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                arg_isa2 = cdolist_list_var2.first();
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$107 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values3 = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
                                restoreValuesFromVector(_values3);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$107, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_target_space$.rebind(_prev_bind_0_$105, thread);
                    }
                }
                SubLObject cdotimes_end_var;
                SubLObject cdolist_list_var4;
                SubLObject arg2;
                SubLObject arg_genls;
                SubLObject _prev_bind_0_$108;
                SubLObject _prev_bind_0_$109;
                SubLObject arg_genl;
                SubLObject cdolist_list_var5;
                SubLObject arg_genl2;
                SubLObject _prev_bind_0_$110;
                SubLObject _values4;
                for (cdotimes_end_var = add(ONE_INTEGER, NIL != pos_arityP ? v_arity : ZERO_INTEGER), arg2 = NIL, arg2 = ZERO_INTEGER; arg2.numL(cdotimes_end_var); arg2 = add(arg2, ONE_INTEGER)) {
                    if (NIL != result) {
                        arg_genls = kb_accessors.argn_genl(pred, arg2, UNPROVIDED);
                        if (NIL != arg_genls) {
                            _prev_bind_0_$108 = sbhl_marking_vars.$sbhl_target_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_target_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                try {
                                    _prev_bind_0_$109 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                    try {
                                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread), thread);
                                        cdolist_list_var4 = arg_genls;
                                        arg_genl = NIL;
                                        arg_genl = cdolist_list_var4.first();
                                        while (NIL != cdolist_list_var4) {
                                            sbhl_marking_methods.sbhl_mark_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), arg_genl, mt, UNPROVIDED);
                                            cdolist_list_var4 = cdolist_list_var4.rest();
                                            arg_genl = cdolist_list_var4.first();
                                        } 
                                    } finally {
                                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$109, thread);
                                    }
                                    cdolist_list_var5 = arg_genls;
                                    arg_genl2 = NIL;
                                    arg_genl2 = cdolist_list_var5.first();
                                    while (NIL != cdolist_list_var5) {
                                        result = keyhash_utilities.intersect_forts(result, candidate_preds_for_arg_type(arg_genl2, arg2, $GENL, mt));
                                        cdolist_list_var5 = cdolist_list_var5.rest();
                                        arg_genl2 = cdolist_list_var5.first();
                                    } 
                                } finally {
                                    _prev_bind_0_$110 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        _values4 = getValuesAsVector();
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
                                        restoreValuesFromVector(_values4);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$110, thread);
                                    }
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_target_space$.rebind(_prev_bind_0_$108, thread);
                            }
                        }
                    }
                }
            } finally {
                sbhl_search_vars.$sbhl_referent$.rebind(_prev_bind_0, thread);
            }
            return result;
        }
        return NIL;
    }

    public static final SubLObject candidate_preds_for_arg_type_alt(SubLObject col, SubLObject arg, SubLObject type, SubLObject mt) {
        if (type == UNPROVIDED) {
            type = $ISA;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_access_arg$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_result$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_access_arg$.bind(arg, thread);
                        sbhl_search_vars.$sbhl_result$.bind(NIL, thread);
                        try {
                            {
                                SubLObject pcase_var = type;
                                if (pcase_var.eql($ISA)) {
                                    genls.map_all_genls(CANDIDATE_PREDS_FOR_ARG_ISA, col, mt, UNPROVIDED);
                                } else {
                                    if (pcase_var.eql($GENL)) {
                                        genls.map_all_genls(CANDIDATE_PREDS_FOR_ARG_GENL, col, mt, UNPROVIDED);
                                    }
                                }
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0_105 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    result = sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_105, thread);
                                }
                            }
                        }
                    } finally {
                        sbhl_search_vars.$sbhl_result$.rebind(_prev_bind_1, thread);
                        sbhl_search_vars.$sbhl_access_arg$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject candidate_preds_for_arg_type(final SubLObject col, final SubLObject arg, SubLObject type, SubLObject mt) {
        if (type == UNPROVIDED) {
            type = $ISA;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_access_arg$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_result$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_access_arg$.bind(arg, thread);
            sbhl_search_vars.$sbhl_result$.bind(NIL, thread);
            try {
                final SubLObject pcase_var = type;
                if (pcase_var.eql($ISA)) {
                    genls.map_all_genls(CANDIDATE_PREDS_FOR_ARG_ISA, col, mt, UNPROVIDED);
                } else
                    if (pcase_var.eql($GENL)) {
                        genls.map_all_genls(CANDIDATE_PREDS_FOR_ARG_GENL, col, mt, UNPROVIDED);
                    }

            } finally {
                final SubLObject _prev_bind_0_$111 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    result = sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$111, thread);
                }
            }
        } finally {
            sbhl_search_vars.$sbhl_result$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_access_arg$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject candidate_preds_for_arg_isa_alt(SubLObject col) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = kb_accessors.argn_isa_of(col, sbhl_search_vars.$sbhl_access_arg$.getDynamicValue(thread), UNPROVIDED);
                SubLObject pred = NIL;
                for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                    if (NIL != fort_types_interface.predicateP(pred)) {
                        {
                            SubLObject not_okP = makeBoolean(!sbhl_search_vars.$sbhl_referent$.getDynamicValue(thread).eql(arity.arity(pred)));
                            if (NIL == not_okP) {
                                {
                                    SubLObject csome_list_var = kb_accessors.argn_isa(pred, sbhl_search_vars.$sbhl_access_arg$.getDynamicValue(thread), mt_relevance_macros.$mt$.getDynamicValue(thread));
                                    SubLObject arg_isa = NIL;
                                    for (arg_isa = csome_list_var.first(); !((NIL != not_okP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , arg_isa = csome_list_var.first()) {
                                        not_okP = makeBoolean(NIL == sbhl_marking_utilities.sbhl_marked_in_target_space_p(arg_isa));
                                    }
                                }
                            }
                            if (NIL == not_okP) {
                                sbhl_search_vars.$sbhl_result$.setDynamicValue(cons(pred, sbhl_search_vars.$sbhl_result$.getDynamicValue(thread)), thread);
                            }
                        }
                    }
                }
            }
            return sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
        }
    }

    public static SubLObject candidate_preds_for_arg_isa(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = kb_accessors.argn_isa_of(col, sbhl_search_vars.$sbhl_access_arg$.getDynamicValue(thread), UNPROVIDED);
        SubLObject pred = NIL;
        pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != fort_types_interface.predicateP(pred)) {
                SubLObject not_okP = makeBoolean(!sbhl_search_vars.$sbhl_referent$.getDynamicValue(thread).eql(arity.arity(pred)));
                if (NIL == not_okP) {
                    SubLObject csome_list_var;
                    SubLObject arg_isa;
                    for (csome_list_var = kb_accessors.argn_isa(pred, sbhl_search_vars.$sbhl_access_arg$.getDynamicValue(thread), mt_relevance_macros.$mt$.getDynamicValue(thread)), arg_isa = NIL, arg_isa = csome_list_var.first(); (NIL == not_okP) && (NIL != csome_list_var); not_okP = makeBoolean(NIL == sbhl_marking_utilities.sbhl_marked_in_target_space_p(arg_isa)) , csome_list_var = csome_list_var.rest() , arg_isa = csome_list_var.first()) {
                    }
                }
                if (NIL == not_okP) {
                    sbhl_search_vars.$sbhl_result$.setDynamicValue(cons(pred, sbhl_search_vars.$sbhl_result$.getDynamicValue(thread)), thread);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        } 
        return sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
    }

    public static final SubLObject candidate_preds_for_arg_genl_alt(SubLObject col) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = kb_accessors.argn_genl_of(col, sbhl_search_vars.$sbhl_access_arg$.getDynamicValue(thread), UNPROVIDED);
                SubLObject pred = NIL;
                for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                    if (NIL != fort_types_interface.predicateP(pred)) {
                        {
                            SubLObject not_okP = NIL;
                            if (NIL == not_okP) {
                                {
                                    SubLObject csome_list_var = kb_accessors.argn_genl(pred, sbhl_search_vars.$sbhl_access_arg$.getDynamicValue(thread), UNPROVIDED);
                                    SubLObject arg_genl = NIL;
                                    for (arg_genl = csome_list_var.first(); !((NIL != not_okP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , arg_genl = csome_list_var.first()) {
                                        not_okP = makeBoolean(NIL == sbhl_marking_utilities.sbhl_marked_in_target_space_p(arg_genl));
                                    }
                                }
                            }
                            if (NIL == not_okP) {
                                sbhl_search_vars.$sbhl_result$.setDynamicValue(cons(pred, sbhl_search_vars.$sbhl_result$.getDynamicValue(thread)), thread);
                            }
                        }
                    }
                }
            }
            return sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
        }
    }

    public static SubLObject candidate_preds_for_arg_genl(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = kb_accessors.argn_genl_of(col, sbhl_search_vars.$sbhl_access_arg$.getDynamicValue(thread), UNPROVIDED);
        SubLObject pred = NIL;
        pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != fort_types_interface.predicateP(pred)) {
                SubLObject not_okP = NIL;
                if (NIL == not_okP) {
                    SubLObject csome_list_var;
                    SubLObject arg_genl;
                    for (csome_list_var = kb_accessors.argn_genl(pred, sbhl_search_vars.$sbhl_access_arg$.getDynamicValue(thread), UNPROVIDED), arg_genl = NIL, arg_genl = csome_list_var.first(); (NIL == not_okP) && (NIL != csome_list_var); not_okP = makeBoolean(NIL == sbhl_marking_utilities.sbhl_marked_in_target_space_p(arg_genl)) , csome_list_var = csome_list_var.rest() , arg_genl = csome_list_var.first()) {
                    }
                }
                if (NIL == not_okP) {
                    sbhl_search_vars.$sbhl_result$.setDynamicValue(cons(pred, sbhl_search_vars.$sbhl_result$.getDynamicValue(thread)), thread);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        } 
        return sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
    }

    /**
     *
     *
     * @return listp; the minimal predicates of PREDS wrt arg-isa and arg-genls.
     */
    @LispMethod(comment = "@return listp; the minimal predicates of PREDS wrt arg-isa and arg-genls.")
    public static final SubLObject min_preds_wrt_arg_types_alt(SubLObject preds, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.genl_predicates.min_preds_wrt_arg_genl(com.cyc.cycjava.cycl.genl_predicates.min_preds_wrt_arg_isa(preds, mt), mt);
    }

    /**
     *
     *
     * @return listp; the minimal predicates of PREDS wrt arg-isa and arg-genls.
     */
    @LispMethod(comment = "@return listp; the minimal predicates of PREDS wrt arg-isa and arg-genls.")
    public static SubLObject min_preds_wrt_arg_types(final SubLObject preds, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return min_preds_wrt_arg_genl(min_preds_wrt_arg_isa(preds, mt), mt);
    }

    /**
     *
     *
     * @return listp; the minimal predicates of PREDS wrt their arg-isas.
     */
    @LispMethod(comment = "@return listp; the minimal predicates of PREDS wrt their arg-isas.")
    public static final SubLObject min_preds_wrt_arg_isa_alt(SubLObject preds, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != preds) {
                {
                    SubLObject result = NIL;
                    SubLObject mt_var = mt;
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                            {
                                SubLObject table = make_hash_table(length(preds), UNPROVIDED, UNPROVIDED);
                                SubLObject v_arity = creduce(MAX, Mapping.mapcar(ARITY, preds), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                SubLObject n = NIL;
                                for (n = ZERO_INTEGER; n.numL(v_arity); n = add(n, ONE_INTEGER)) {
                                    {
                                        SubLObject arg_isas = NIL;
                                        {
                                            SubLObject cdolist_list_var = preds;
                                            SubLObject pred = NIL;
                                            for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                                                {
                                                    SubLObject cdolist_list_var_106 = kb_accessors.argn_isa(pred, n, mt);
                                                    SubLObject col = NIL;
                                                    for (col = cdolist_list_var_106.first(); NIL != cdolist_list_var_106; cdolist_list_var_106 = cdolist_list_var_106.rest() , col = cdolist_list_var_106.first()) {
                                                        hash_table_utilities.push_hash(col, pred, table);
                                                        {
                                                            SubLObject item_var = col;
                                                            if (NIL == member(item_var, arg_isas, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                arg_isas = cons(item_var, arg_isas);
                                                            }
                                                        }
                                                    }
                                                }
                                                {
                                                    SubLObject cdolist_list_var_107 = kb_accessors.args_isa(pred, mt);
                                                    SubLObject col = NIL;
                                                    for (col = cdolist_list_var_107.first(); NIL != cdolist_list_var_107; cdolist_list_var_107 = cdolist_list_var_107.rest() , col = cdolist_list_var_107.first()) {
                                                        hash_table_utilities.push_hash(col, pred, table);
                                                        {
                                                            SubLObject item_var = col;
                                                            if (NIL == member(item_var, arg_isas, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                arg_isas = cons(item_var, arg_isas);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        {
                                            SubLObject cdolist_list_var = genls.min_cols(arg_isas, mt, UNPROVIDED);
                                            SubLObject min_col = NIL;
                                            for (min_col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , min_col = cdolist_list_var.first()) {
                                                result = nconc(result, gethash(min_col, table, UNPROVIDED));
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
                    return list_utilities.remove_duplicate_forts(result);
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return listp; the minimal predicates of PREDS wrt their arg-isas.
     */
    @LispMethod(comment = "@return listp; the minimal predicates of PREDS wrt their arg-isas.")
    public static SubLObject min_preds_wrt_arg_isa(final SubLObject preds, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != preds) {
            SubLObject result = NIL;
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                final SubLObject table = make_hash_table(length(preds), UNPROVIDED, UNPROVIDED);
                SubLObject v_arity;
                SubLObject n;
                SubLObject arg_isas;
                SubLObject cdolist_list_var;
                SubLObject pred;
                SubLObject cdolist_list_var_$112;
                SubLObject col;
                SubLObject item_var;
                SubLObject cdolist_list_var_$113;
                SubLObject min_col;
                for (v_arity = creduce(MAX, Mapping.mapcar(ARITY, preds), UNPROVIDED, UNPROVIDED, UNPROVIDED), n = NIL, n = ZERO_INTEGER; n.numL(v_arity); n = add(n, ONE_INTEGER)) {
                    arg_isas = NIL;
                    cdolist_list_var = preds;
                    pred = NIL;
                    pred = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        cdolist_list_var_$112 = kb_accessors.argn_isa(pred, n, mt);
                        col = NIL;
                        col = cdolist_list_var_$112.first();
                        while (NIL != cdolist_list_var_$112) {
                            hash_table_utilities.push_hash(col, pred, table);
                            item_var = col;
                            if (NIL == member(item_var, arg_isas, symbol_function(EQL), symbol_function(IDENTITY))) {
                                arg_isas = cons(item_var, arg_isas);
                            }
                            cdolist_list_var_$112 = cdolist_list_var_$112.rest();
                            col = cdolist_list_var_$112.first();
                        } 
                        cdolist_list_var_$113 = kb_accessors.args_isa(pred, mt);
                        col = NIL;
                        col = cdolist_list_var_$113.first();
                        while (NIL != cdolist_list_var_$113) {
                            hash_table_utilities.push_hash(col, pred, table);
                            item_var = col;
                            if (NIL == member(item_var, arg_isas, symbol_function(EQL), symbol_function(IDENTITY))) {
                                arg_isas = cons(item_var, arg_isas);
                            }
                            cdolist_list_var_$113 = cdolist_list_var_$113.rest();
                            col = cdolist_list_var_$113.first();
                        } 
                        cdolist_list_var = cdolist_list_var.rest();
                        pred = cdolist_list_var.first();
                    } 
                    cdolist_list_var = genls.min_cols(arg_isas, mt, UNPROVIDED);
                    min_col = NIL;
                    min_col = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        result = nconc(result, gethash(min_col, table, UNPROVIDED));
                        cdolist_list_var = cdolist_list_var.rest();
                        min_col = cdolist_list_var.first();
                    } 
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            return list_utilities.remove_duplicate_forts(result);
        }
        return NIL;
    }

    /**
     *
     *
     * @return listp; the minimal predicates of PREDS wrt their arg-genls
     */
    @LispMethod(comment = "@return listp; the minimal predicates of PREDS wrt their arg-genls")
    public static final SubLObject min_preds_wrt_arg_genl_alt(SubLObject preds, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != preds) {
                {
                    SubLObject result = NIL;
                    SubLObject mt_var = mt;
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                            {
                                SubLObject table = make_hash_table(length(preds), UNPROVIDED, UNPROVIDED);
                                SubLObject v_arity = creduce(MAX, Mapping.mapcar(ARITY, preds), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                SubLObject n = NIL;
                                for (n = ZERO_INTEGER; n.numL(v_arity); n = add(n, ONE_INTEGER)) {
                                    {
                                        SubLObject arg_genls = NIL;
                                        {
                                            SubLObject cdolist_list_var = preds;
                                            SubLObject pred = NIL;
                                            for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                                                {
                                                    SubLObject pred_argn_genls = kb_accessors.argn_genl(pred, n, mt);
                                                    if (NIL != pred_argn_genls) {
                                                        {
                                                            SubLObject cdolist_list_var_108 = pred_argn_genls;
                                                            SubLObject col = NIL;
                                                            for (col = cdolist_list_var_108.first(); NIL != cdolist_list_var_108; cdolist_list_var_108 = cdolist_list_var_108.rest() , col = cdolist_list_var_108.first()) {
                                                                hash_table_utilities.push_hash(col, pred, table);
                                                                {
                                                                    SubLObject item_var = col;
                                                                    if (NIL == member(item_var, arg_genls, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                        arg_genls = cons(item_var, arg_genls);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        result = cons(pred, result);
                                                    }
                                                }
                                                {
                                                    SubLObject pred_args_genls = kb_accessors.args_genl(pred, mt);
                                                    if (NIL != pred_args_genls) {
                                                        {
                                                            SubLObject cdolist_list_var_109 = pred_args_genls;
                                                            SubLObject col = NIL;
                                                            for (col = cdolist_list_var_109.first(); NIL != cdolist_list_var_109; cdolist_list_var_109 = cdolist_list_var_109.rest() , col = cdolist_list_var_109.first()) {
                                                                hash_table_utilities.push_hash(col, pred, table);
                                                                {
                                                                    SubLObject item_var = col;
                                                                    if (NIL == member(item_var, arg_genls, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                        arg_genls = cons(item_var, arg_genls);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        result = cons(pred, result);
                                                    }
                                                }
                                            }
                                        }
                                        {
                                            SubLObject cdolist_list_var = genls.min_cols(arg_genls, mt, UNPROVIDED);
                                            SubLObject min_col = NIL;
                                            for (min_col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , min_col = cdolist_list_var.first()) {
                                                result = nconc(result, gethash(min_col, table, UNPROVIDED));
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
                    return list_utilities.remove_duplicate_forts(result);
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return listp; the minimal predicates of PREDS wrt their arg-genls
     */
    @LispMethod(comment = "@return listp; the minimal predicates of PREDS wrt their arg-genls")
    public static SubLObject min_preds_wrt_arg_genl(final SubLObject preds, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != preds) {
            SubLObject result = NIL;
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                final SubLObject table = make_hash_table(length(preds), UNPROVIDED, UNPROVIDED);
                SubLObject v_arity;
                SubLObject n;
                SubLObject arg_genls;
                SubLObject cdolist_list_var;
                SubLObject pred;
                SubLObject pred_argn_genls;
                SubLObject cdolist_list_var_$114;
                SubLObject col;
                SubLObject item_var;
                SubLObject pred_args_genls;
                SubLObject cdolist_list_var_$115;
                SubLObject min_col;
                for (v_arity = creduce(MAX, Mapping.mapcar(ARITY, preds), UNPROVIDED, UNPROVIDED, UNPROVIDED), n = NIL, n = ZERO_INTEGER; n.numL(v_arity); n = add(n, ONE_INTEGER)) {
                    arg_genls = NIL;
                    cdolist_list_var = preds;
                    pred = NIL;
                    pred = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        pred_argn_genls = kb_accessors.argn_genl(pred, n, mt);
                        if (NIL != pred_argn_genls) {
                            cdolist_list_var_$114 = pred_argn_genls;
                            col = NIL;
                            col = cdolist_list_var_$114.first();
                            while (NIL != cdolist_list_var_$114) {
                                hash_table_utilities.push_hash(col, pred, table);
                                item_var = col;
                                if (NIL == member(item_var, arg_genls, symbol_function(EQL), symbol_function(IDENTITY))) {
                                    arg_genls = cons(item_var, arg_genls);
                                }
                                cdolist_list_var_$114 = cdolist_list_var_$114.rest();
                                col = cdolist_list_var_$114.first();
                            } 
                        } else {
                            result = cons(pred, result);
                        }
                        pred_args_genls = kb_accessors.args_genl(pred, mt);
                        if (NIL != pred_args_genls) {
                            cdolist_list_var_$115 = pred_args_genls;
                            col = NIL;
                            col = cdolist_list_var_$115.first();
                            while (NIL != cdolist_list_var_$115) {
                                hash_table_utilities.push_hash(col, pred, table);
                                item_var = col;
                                if (NIL == member(item_var, arg_genls, symbol_function(EQL), symbol_function(IDENTITY))) {
                                    arg_genls = cons(item_var, arg_genls);
                                }
                                cdolist_list_var_$115 = cdolist_list_var_$115.rest();
                                col = cdolist_list_var_$115.first();
                            } 
                        } else {
                            result = cons(pred, result);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        pred = cdolist_list_var.first();
                    } 
                    cdolist_list_var = genls.min_cols(arg_genls, mt, UNPROVIDED);
                    min_col = NIL;
                    min_col = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        result = nconc(result, gethash(min_col, table, UNPROVIDED));
                        cdolist_list_var = cdolist_list_var.rest();
                        min_col = cdolist_list_var.first();
                    } 
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            return list_utilities.remove_duplicate_forts(result);
        }
        return NIL;
    }

    /**
     *
     *
     * @return listp; the microtheories in which PRED has genl-predicate assertions.
     */
    @LispMethod(comment = "@return listp; the microtheories in which PRED has genl-predicate assertions.")
    public static final SubLObject genl_predicate_mts_alt(SubLObject pred) {
        return kb_accessors.pred_mts(pred, $$genlPreds, UNPROVIDED);
    }

    /**
     *
     *
     * @return listp; the microtheories in which PRED has genl-predicate assertions.
     */
    @LispMethod(comment = "@return listp; the microtheories in which PRED has genl-predicate assertions.")
    public static SubLObject genl_predicate_mts(final SubLObject pred) {
        return kb_accessors.pred_mts(pred, $$genlPreds, UNPROVIDED);
    }

    /**
     *
     *
     * @return listp; the microtheories in which PRED is arg1 in genl-predicate assertions.
     */
    @LispMethod(comment = "@return listp; the microtheories in which PRED is arg1 in genl-predicate assertions.")
    public static final SubLObject genl_predicate_forward_mts_alt(SubLObject pred) {
        return sbhl_link_methods.sbhl_forward_mts(sbhl_module_vars.get_sbhl_module($$genlPreds), pred);
    }

    /**
     *
     *
     * @return listp; the microtheories in which PRED is arg1 in genl-predicate assertions.
     */
    @LispMethod(comment = "@return listp; the microtheories in which PRED is arg1 in genl-predicate assertions.")
    public static SubLObject genl_predicate_forward_mts(final SubLObject pred) {
        return sbhl_link_methods.sbhl_forward_mts(sbhl_module_vars.get_sbhl_module($$genlPreds), pred);
    }

    /**
     *
     *
     * @return listp; the microtheories in which PRED is arg2 in genl-predicate assertions.
     */
    @LispMethod(comment = "@return listp; the microtheories in which PRED is arg2 in genl-predicate assertions.")
    public static final SubLObject genl_predicate_backward_mts_alt(SubLObject pred) {
        return sbhl_link_methods.sbhl_backward_mts(sbhl_module_vars.get_sbhl_module($$genlPreds), pred);
    }

    /**
     *
     *
     * @return listp; the microtheories in which PRED is arg2 in genl-predicate assertions.
     */
    @LispMethod(comment = "@return listp; the microtheories in which PRED is arg2 in genl-predicate assertions.")
    public static SubLObject genl_predicate_backward_mts(final SubLObject pred) {
        return sbhl_link_methods.sbhl_backward_mts(sbhl_module_vars.get_sbhl_module($$genlPreds), pred);
    }

    /**
     *
     *
     * @return booleanp; whether there are any asserted true genl-predicate links for PRED.
     */
    @LispMethod(comment = "@return booleanp; whether there are any asserted true genl-predicate links for PRED.")
    public static final SubLObject asserted_genl_predicatesP_alt(SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_any_asserted_true_links(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt);
    }

    /**
     *
     *
     * @return booleanp; whether there are any asserted true genl-predicate links for PRED.
     */
    @LispMethod(comment = "@return booleanp; whether there are any asserted true genl-predicate links for PRED.")
    public static SubLObject asserted_genl_predicatesP(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_any_asserted_true_links(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt);
    }

    /**
     *
     *
     * @return listp; the asserted true genl-predicate links for PRED in MT / *mt*.
     */
    @LispMethod(comment = "@return listp; the asserted true genl-predicate links for PRED in MT / *mt*.")
    public static final SubLObject asserted_genl_predicates_alt(SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_true_links(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt);
    }

    /**
     *
     *
     * @return listp; the asserted true genl-predicate links for PRED in MT / *mt*.
     */
    @LispMethod(comment = "@return listp; the asserted true genl-predicate links for PRED in MT / *mt*.")
    public static SubLObject asserted_genl_predicates(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_true_links(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt);
    }

    /**
     *
     *
     * @return listp; the asserted false genl-predicate links for PRED in MT / *mt*.
     */
    @LispMethod(comment = "@return listp; the asserted false genl-predicate links for PRED in MT / *mt*.")
    public static final SubLObject asserted_not_genl_predicates_alt(SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_false_links(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt);
    }

    /**
     *
     *
     * @return listp; the asserted false genl-predicate links for PRED in MT / *mt*.
     */
    @LispMethod(comment = "@return listp; the asserted false genl-predicate links for PRED in MT / *mt*.")
    public static SubLObject asserted_not_genl_predicates(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_false_links(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt);
    }

    /**
     *
     *
     * @return listp; the supported true genl-predicate links for PRED in MT / *mt*.
     */
    @LispMethod(comment = "@return listp; the supported true genl-predicate links for PRED in MT / *mt*.")
    public static final SubLObject supported_genl_predicates_alt(SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_true_links(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt);
    }

    /**
     *
     *
     * @return listp; the supported true genl-predicate links for PRED in MT / *mt*.
     */
    @LispMethod(comment = "@return listp; the supported true genl-predicate links for PRED in MT / *mt*.")
    public static SubLObject supported_genl_predicates(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_true_links(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt);
    }

    /**
     *
     *
     * @return listp; the supported false genl-predicate links for PRED in MT / *mt*.
     */
    @LispMethod(comment = "@return listp; the supported false genl-predicate links for PRED in MT / *mt*.")
    public static final SubLObject supported_not_genl_predicates_alt(SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_false_links(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt);
    }

    /**
     *
     *
     * @return listp; the supported false genl-predicate links for PRED in MT / *mt*.
     */
    @LispMethod(comment = "@return listp; the supported false genl-predicate links for PRED in MT / *mt*.")
    public static SubLObject supported_not_genl_predicates(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_false_links(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt);
    }

    /**
     *
     *
     * @return listp; the asserted true spec-predicate links for PRED in MT / *mt*.
     */
    @LispMethod(comment = "@return listp; the asserted true spec-predicate links for PRED in MT / *mt*.")
    public static final SubLObject asserted_spec_predicates_alt(SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_true_inverse_links(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt);
    }

    /**
     *
     *
     * @return listp; the asserted true spec-predicate links for PRED in MT / *mt*.
     */
    @LispMethod(comment = "@return listp; the asserted true spec-predicate links for PRED in MT / *mt*.")
    public static SubLObject asserted_spec_predicates(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_true_inverse_links(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt);
    }

    /**
     *
     *
     * @return listp; the asserted false spec-predicate links for PRED in MT / *mt*.
     */
    @LispMethod(comment = "@return listp; the asserted false spec-predicate links for PRED in MT / *mt*.")
    public static final SubLObject asserted_not_spec_predicates_alt(SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_false_inverse_links(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt);
    }

    /**
     *
     *
     * @return listp; the asserted false spec-predicate links for PRED in MT / *mt*.
     */
    @LispMethod(comment = "@return listp; the asserted false spec-predicate links for PRED in MT / *mt*.")
    public static SubLObject asserted_not_spec_predicates(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_false_inverse_links(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt);
    }

    /**
     *
     *
     * @return listp; the supported true spec-predicate links for PRED in MT / *mt*.
     */
    @LispMethod(comment = "@return listp; the supported true spec-predicate links for PRED in MT / *mt*.")
    public static final SubLObject supported_spec_predicates_alt(SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_true_inverse_links(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt);
    }

    /**
     *
     *
     * @return listp; the supported true spec-predicate links for PRED in MT / *mt*.
     */
    @LispMethod(comment = "@return listp; the supported true spec-predicate links for PRED in MT / *mt*.")
    public static SubLObject supported_spec_predicates(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_true_inverse_links(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt);
    }

    /**
     *
     *
     * @return listp; the supported false spec-predicate links for PRED in MT / *mt*.
     */
    @LispMethod(comment = "@return listp; the supported false spec-predicate links for PRED in MT / *mt*.")
    public static final SubLObject supported_not_spec_predicates_alt(SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_false_inverse_links(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt);
    }

    /**
     *
     *
     * @return listp; the supported false spec-predicate links for PRED in MT / *mt*.
     */
    @LispMethod(comment = "@return listp; the supported false spec-predicate links for PRED in MT / *mt*.")
    public static SubLObject supported_not_spec_predicates(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_false_inverse_links(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt);
    }

    /**
     *
     *
     * @return listp; the microtheories in which PRED has genl-inverse assertions.
     */
    @LispMethod(comment = "@return listp; the microtheories in which PRED has genl-inverse assertions.")
    public static final SubLObject genl_inverse_mts_alt(SubLObject pred) {
        return kb_accessors.pred_mts(pred, $$genlInverse, UNPROVIDED);
    }

    /**
     *
     *
     * @return listp; the microtheories in which PRED has genl-inverse assertions.
     */
    @LispMethod(comment = "@return listp; the microtheories in which PRED has genl-inverse assertions.")
    public static SubLObject genl_inverse_mts(final SubLObject pred) {
        return kb_accessors.pred_mts(pred, $$genlInverse, UNPROVIDED);
    }

    /**
     *
     *
     * @return listp; the microtheories in which PRED is arg1 in genl-inverse assertions.
     */
    @LispMethod(comment = "@return listp; the microtheories in which PRED is arg1 in genl-inverse assertions.")
    public static final SubLObject genl_inverse_forward_mts_alt(SubLObject pred) {
        return sbhl_link_methods.sbhl_forward_mts(sbhl_module_vars.get_sbhl_module($$genlInverse), pred);
    }

    /**
     *
     *
     * @return listp; the microtheories in which PRED is arg1 in genl-inverse assertions.
     */
    @LispMethod(comment = "@return listp; the microtheories in which PRED is arg1 in genl-inverse assertions.")
    public static SubLObject genl_inverse_forward_mts(final SubLObject pred) {
        return sbhl_link_methods.sbhl_forward_mts(sbhl_module_vars.get_sbhl_module($$genlInverse), pred);
    }

    /**
     *
     *
     * @return listp; the microtheories in which PRED is arg2 in genl-inverse assertions.
     */
    @LispMethod(comment = "@return listp; the microtheories in which PRED is arg2 in genl-inverse assertions.")
    public static final SubLObject genl_inverse_backward_mts_alt(SubLObject pred) {
        return sbhl_link_methods.sbhl_backward_mts(sbhl_module_vars.get_sbhl_module($$genlInverse), pred);
    }

    /**
     *
     *
     * @return listp; the microtheories in which PRED is arg2 in genl-inverse assertions.
     */
    @LispMethod(comment = "@return listp; the microtheories in which PRED is arg2 in genl-inverse assertions.")
    public static SubLObject genl_inverse_backward_mts(final SubLObject pred) {
        return sbhl_link_methods.sbhl_backward_mts(sbhl_module_vars.get_sbhl_module($$genlInverse), pred);
    }

    /**
     *
     *
     * @return booleanp; whether there are any asserted true genl-inverse links for PRED.
     */
    @LispMethod(comment = "@return booleanp; whether there are any asserted true genl-inverse links for PRED.")
    public static final SubLObject asserted_genl_inversesP_alt(SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_any_asserted_true_links(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt);
    }

    /**
     *
     *
     * @return booleanp; whether there are any asserted true genl-inverse links for PRED.
     */
    @LispMethod(comment = "@return booleanp; whether there are any asserted true genl-inverse links for PRED.")
    public static SubLObject asserted_genl_inversesP(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_any_asserted_true_links(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt);
    }

    /**
     *
     *
     * @return listp; the asserted true genl-inverse links for PRED in MT / *mt*.
     */
    @LispMethod(comment = "@return listp; the asserted true genl-inverse links for PRED in MT / *mt*.")
    public static final SubLObject asserted_genl_inverses_alt(SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_true_links(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt);
    }

    /**
     *
     *
     * @return listp; the asserted true genl-inverse links for PRED in MT / *mt*.
     */
    @LispMethod(comment = "@return listp; the asserted true genl-inverse links for PRED in MT / *mt*.")
    public static SubLObject asserted_genl_inverses(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_true_links(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt);
    }

    /**
     *
     *
     * @return listp; the asserted false genl-inverse links for PRED in MT / *mt*.
     */
    @LispMethod(comment = "@return listp; the asserted false genl-inverse links for PRED in MT / *mt*.")
    public static final SubLObject asserted_not_genl_inverses_alt(SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_false_links(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt);
    }

    /**
     *
     *
     * @return listp; the asserted false genl-inverse links for PRED in MT / *mt*.
     */
    @LispMethod(comment = "@return listp; the asserted false genl-inverse links for PRED in MT / *mt*.")
    public static SubLObject asserted_not_genl_inverses(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_false_links(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt);
    }

    /**
     *
     *
     * @return listp; the supported true genl-inverse links for PRED in MT / *mt*.
     */
    @LispMethod(comment = "@return listp; the supported true genl-inverse links for PRED in MT / *mt*.")
    public static final SubLObject supported_genl_inverses_alt(SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_true_links(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt);
    }

    /**
     *
     *
     * @return listp; the supported true genl-inverse links for PRED in MT / *mt*.
     */
    @LispMethod(comment = "@return listp; the supported true genl-inverse links for PRED in MT / *mt*.")
    public static SubLObject supported_genl_inverses(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_true_links(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt);
    }

    /**
     *
     *
     * @return listp; the supported false genl-inverse links for PRED in MT / *mt*.
     */
    @LispMethod(comment = "@return listp; the supported false genl-inverse links for PRED in MT / *mt*.")
    public static final SubLObject supported_not_genl_inverses_alt(SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_false_links(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt);
    }

    /**
     *
     *
     * @return listp; the supported false genl-inverse links for PRED in MT / *mt*.
     */
    @LispMethod(comment = "@return listp; the supported false genl-inverse links for PRED in MT / *mt*.")
    public static SubLObject supported_not_genl_inverses(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_false_links(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt);
    }

    /**
     *
     *
     * @return listp; the asserted true spec-inverse links for PRED in MT / *mt*.
     */
    @LispMethod(comment = "@return listp; the asserted true spec-inverse links for PRED in MT / *mt*.")
    public static final SubLObject asserted_spec_inverses_alt(SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_true_inverse_links(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt);
    }

    /**
     *
     *
     * @return listp; the asserted true spec-inverse links for PRED in MT / *mt*.
     */
    @LispMethod(comment = "@return listp; the asserted true spec-inverse links for PRED in MT / *mt*.")
    public static SubLObject asserted_spec_inverses(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_true_inverse_links(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt);
    }

    /**
     *
     *
     * @return listp; the asserted false spec-inverse links for PRED in MT / *mt*.
     */
    @LispMethod(comment = "@return listp; the asserted false spec-inverse links for PRED in MT / *mt*.")
    public static final SubLObject asserted_not_spec_inverses_alt(SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_false_inverse_links(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt);
    }

    /**
     *
     *
     * @return listp; the asserted false spec-inverse links for PRED in MT / *mt*.
     */
    @LispMethod(comment = "@return listp; the asserted false spec-inverse links for PRED in MT / *mt*.")
    public static SubLObject asserted_not_spec_inverses(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_false_inverse_links(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt);
    }

    /**
     *
     *
     * @return listp; the supported true spec-inverse links for PRED in MT / *mt*.
     */
    @LispMethod(comment = "@return listp; the supported true spec-inverse links for PRED in MT / *mt*.")
    public static final SubLObject supported_spec_inverses_alt(SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_true_inverse_links(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt);
    }

    /**
     *
     *
     * @return listp; the supported true spec-inverse links for PRED in MT / *mt*.
     */
    @LispMethod(comment = "@return listp; the supported true spec-inverse links for PRED in MT / *mt*.")
    public static SubLObject supported_spec_inverses(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_true_inverse_links(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt);
    }

    /**
     *
     *
     * @return listp; the supported false spec-inverse links for PRED in MT / *mt*.
     */
    @LispMethod(comment = "@return listp; the supported false spec-inverse links for PRED in MT / *mt*.")
    public static final SubLObject supported_not_spec_inverses_alt(SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_false_inverse_links(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt);
    }

    /**
     *
     *
     * @return listp; the supported false spec-inverse links for PRED in MT / *mt*.
     */
    @LispMethod(comment = "@return listp; the supported false spec-inverse links for PRED in MT / *mt*.")
    public static SubLObject supported_not_spec_inverses(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_false_inverse_links(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt);
    }

    /**
     * Modifier. Adds sbhl links with @see sbhl-after-adding.
     */
    @LispMethod(comment = "Modifier. Adds sbhl links with @see sbhl-after-adding.")
    public static final SubLObject genl_predicate_after_adding_alt(SubLObject source, SubLObject assertion) {
        sbhl_link_methods.sbhl_after_adding(source, assertion, sbhl_module_vars.get_sbhl_module($$genlPreds));
        sbhl_cache.sbhl_cache_addition_maintainence(assertion);
        after_adding_modules.clear_genl_pred_dependent_caches(source, assertion);
        return NIL;
    }

    @LispMethod(comment = "Modifier. Adds sbhl links with @see sbhl-after-adding.")
    public static SubLObject genl_predicate_after_adding(SubLObject source, final SubLObject assertion) {
        sbhl_link_methods.sbhl_after_adding(source, assertion, sbhl_module_vars.get_sbhl_module($$genlPreds));
        sbhl_cache.sbhl_cache_addition_maintainence(assertion);
        after_adding_modules.clear_genl_pred_dependent_caches(source, assertion);
        return NIL;
    }/**
     * Modifier. Adds sbhl links with @see sbhl-after-adding.
     */


    /**
     * Modifier. Adds sbhl links with @see sbhl-after-adding.
     */
    @LispMethod(comment = "Modifier. Adds sbhl links with @see sbhl-after-adding.")
    public static final SubLObject add_genl_predicate_alt(SubLObject source, SubLObject assertion) {
        com.cyc.cycjava.cycl.genl_predicates.genl_predicate_after_adding(source, assertion);
        return NIL;
    }

    @LispMethod(comment = "Modifier. Adds sbhl links with @see sbhl-after-adding.")
    public static SubLObject add_genl_predicate(SubLObject source, final SubLObject assertion) {
        genl_predicate_after_adding(source, assertion);
        return NIL;
    }/**
     * Modifier. Adds sbhl links with @see sbhl-after-adding.
     */


    /**
     * Modifier. Adds sbhl links with @see sbhl-after-adding.
     */
    @LispMethod(comment = "Modifier. Adds sbhl links with @see sbhl-after-adding.")
    public static final SubLObject genl_inverse_after_adding_alt(SubLObject source, SubLObject assertion) {
        sbhl_link_methods.sbhl_after_adding(source, assertion, sbhl_module_vars.get_sbhl_module($$genlInverse));
        sbhl_cache.sbhl_cache_addition_maintainence(assertion);
        after_adding_modules.clear_genl_pred_dependent_caches(source, assertion);
        return NIL;
    }

    @LispMethod(comment = "Modifier. Adds sbhl links with @see sbhl-after-adding.")
    public static SubLObject genl_inverse_after_adding(SubLObject source, final SubLObject assertion) {
        sbhl_link_methods.sbhl_after_adding(source, assertion, sbhl_module_vars.get_sbhl_module($$genlInverse));
        sbhl_cache.sbhl_cache_addition_maintainence(assertion);
        after_adding_modules.clear_genl_pred_dependent_caches(source, assertion);
        return NIL;
    }/**
     * Modifier. Adds sbhl links with @see sbhl-after-adding.
     */


    /**
     * Modifier. Adds sbhl links with @see sbhl-after-adding.
     */
    @LispMethod(comment = "Modifier. Adds sbhl links with @see sbhl-after-adding.")
    public static final SubLObject add_genl_inverse_alt(SubLObject source, SubLObject assertion) {
        com.cyc.cycjava.cycl.genl_predicates.genl_inverse_after_adding(source, assertion);
        return NIL;
    }

    @LispMethod(comment = "Modifier. Adds sbhl links with @see sbhl-after-adding.")
    public static SubLObject add_genl_inverse(SubLObject source, final SubLObject assertion) {
        genl_inverse_after_adding(source, assertion);
        return NIL;
    }/**
     * Modifier. Adds sbhl links with @see sbhl-after-adding.
     */


    /**
     * Modifier. Removes sbhl links with @see sbhl-after-removing.
     */
    @LispMethod(comment = "Modifier. Removes sbhl links with @see sbhl-after-removing.")
    public static final SubLObject remove_genl_predicate_alt(SubLObject source, SubLObject assertion) {
        com.cyc.cycjava.cycl.genl_predicates.genl_predicate_after_removing(source, assertion);
        return NIL;
    }

    @LispMethod(comment = "Modifier. Removes sbhl links with @see sbhl-after-removing.")
    public static SubLObject remove_genl_predicate(SubLObject source, final SubLObject assertion) {
        genl_predicate_after_removing(source, assertion);
        return NIL;
    }/**
     * Modifier. Removes sbhl links with @see sbhl-after-removing.
     */


    /**
     * Modifier. Removes sbhl links with @see sbhl-after-removing.
     */
    @LispMethod(comment = "Modifier. Removes sbhl links with @see sbhl-after-removing.")
    public static final SubLObject remove_genl_inverse_alt(SubLObject source, SubLObject assertion) {
        com.cyc.cycjava.cycl.genl_predicates.genl_inverse_after_removing(source, assertion);
        return NIL;
    }

    @LispMethod(comment = "Modifier. Removes sbhl links with @see sbhl-after-removing.")
    public static SubLObject remove_genl_inverse(SubLObject source, final SubLObject assertion) {
        genl_inverse_after_removing(source, assertion);
        return NIL;
    }/**
     * Modifier. Removes sbhl links with @see sbhl-after-removing.
     */


    /**
     * Modifier. Removes sbhl links with @see sbhl-after-removing.
     */
    @LispMethod(comment = "Modifier. Removes sbhl links with @see sbhl-after-removing.")
    public static final SubLObject genl_predicate_after_removing_alt(SubLObject source, SubLObject assertion) {
        sbhl_link_methods.sbhl_after_removing(source, assertion, sbhl_module_vars.get_sbhl_module($$genlPreds));
        sbhl_cache.sbhl_cache_removal_maintainence(assertion);
        after_adding_modules.clear_genl_pred_dependent_caches(source, assertion);
        return NIL;
    }

    @LispMethod(comment = "Modifier. Removes sbhl links with @see sbhl-after-removing.")
    public static SubLObject genl_predicate_after_removing(SubLObject source, final SubLObject assertion) {
        sbhl_link_methods.sbhl_after_removing(source, assertion, sbhl_module_vars.get_sbhl_module($$genlPreds));
        sbhl_cache.sbhl_cache_removal_maintainence(assertion);
        after_adding_modules.clear_genl_pred_dependent_caches(source, assertion);
        return NIL;
    }/**
     * Modifier. Removes sbhl links with @see sbhl-after-removing.
     */


    /**
     * Modifier. Removes sbhl links with @see sbhl-after-removing.
     */
    @LispMethod(comment = "Modifier. Removes sbhl links with @see sbhl-after-removing.")
    public static final SubLObject genl_inverse_after_removing_alt(SubLObject source, SubLObject assertion) {
        sbhl_link_methods.sbhl_after_removing(source, assertion, sbhl_module_vars.get_sbhl_module($$genlInverse));
        sbhl_cache.sbhl_cache_removal_maintainence(assertion);
        after_adding_modules.clear_genl_pred_dependent_caches(source, assertion);
        return NIL;
    }

    @LispMethod(comment = "Modifier. Removes sbhl links with @see sbhl-after-removing.")
    public static SubLObject genl_inverse_after_removing(SubLObject source, final SubLObject assertion) {
        sbhl_link_methods.sbhl_after_removing(source, assertion, sbhl_module_vars.get_sbhl_module($$genlInverse));
        sbhl_cache.sbhl_cache_removal_maintainence(assertion);
        after_adding_modules.clear_genl_pred_dependent_caches(source, assertion);
        return NIL;
    }/**
     * Modifier. Removes sbhl links with @see sbhl-after-removing.
     */


    public static final SubLObject clear_predicate_graph_alt() {
        com.cyc.cycjava.cycl.genl_predicates.clear_genl_predicate_graph();
        return NIL;
    }

    public static SubLObject clear_predicate_graph() {
        clear_genl_predicate_graph();
        return NIL;
    }

    public static final SubLObject clear_genl_predicate_graph_alt() {
        sbhl_link_methods.clear_sbhl_module_graph(sbhl_module_vars.get_sbhl_module($$genlPreds));
        return NIL;
    }

    public static SubLObject clear_genl_predicate_graph() {
        sbhl_link_methods.clear_sbhl_module_graph(sbhl_module_vars.get_sbhl_module($$genlPreds));
        return NIL;
    }

    public static final SubLObject clear_genl_inverse_graph_alt() {
        sbhl_link_methods.clear_sbhl_module_graph(sbhl_module_vars.get_sbhl_module($$genlInverse));
        return NIL;
    }

    public static SubLObject clear_genl_inverse_graph() {
        sbhl_link_methods.clear_sbhl_module_graph(sbhl_module_vars.get_sbhl_module($$genlInverse));
        return NIL;
    }

    public static final SubLObject clear_node_genl_predicate_links_alt(SubLObject pred) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                    {
                        SubLObject cdolist_list_var = sbhl_link_methods.sbhl_link_mts(sbhl_module_vars.get_sbhl_module($$genlPreds), pred);
                        SubLObject mt = NIL;
                        for (mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt = cdolist_list_var.first()) {
                            if (NIL != fort_types_interface.predicateP(pred)) {
                                sbhl_link_methods.clear_sbhl_links_within_mt(pred, mt, UNPROVIDED);
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

    public static SubLObject clear_node_genl_predicate_links(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
            SubLObject cdolist_list_var = sbhl_link_methods.sbhl_link_mts(sbhl_module_vars.get_sbhl_module($$genlPreds), pred);
            SubLObject mt = NIL;
            mt = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != fort_types_interface.predicateP(pred)) {
                    sbhl_link_methods.clear_sbhl_links_within_mt(pred, mt, UNPROVIDED);
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

    public static final SubLObject clear_node_genl_inverse_links_alt(SubLObject pred) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlInverse), thread);
                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlInverse)), thread);
                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlInverse)), thread);
                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlInverse), thread);
                    {
                        SubLObject cdolist_list_var = sbhl_link_methods.sbhl_link_mts(sbhl_module_vars.get_sbhl_module($$genlInverse), pred);
                        SubLObject mt = NIL;
                        for (mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt = cdolist_list_var.first()) {
                            if (NIL != fort_types_interface.predicateP(pred)) {
                                sbhl_link_methods.clear_sbhl_links_within_mt(pred, mt, UNPROVIDED);
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

    public static SubLObject clear_node_genl_inverse_links(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlInverse), thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlInverse)), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlInverse)), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlInverse), thread);
            SubLObject cdolist_list_var = sbhl_link_methods.sbhl_link_mts(sbhl_module_vars.get_sbhl_module($$genlInverse), pred);
            SubLObject mt = NIL;
            mt = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != fort_types_interface.predicateP(pred)) {
                    sbhl_link_methods.clear_sbhl_links_within_mt(pred, mt, UNPROVIDED);
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

    public static final SubLObject reset_genl_predicate_links_alt(SubLObject pred) {
        {
            SubLObject mts = com.cyc.cycjava.cycl.genl_predicates.genl_predicate_mts(pred);
            com.cyc.cycjava.cycl.genl_predicates.clear_node_genl_predicate_links(pred);
            {
                SubLObject cdolist_list_var = mts;
                SubLObject mt = NIL;
                for (mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt = cdolist_list_var.first()) {
                    if (NIL != fort_types_interface.predicateP(pred)) {
                        com.cyc.cycjava.cycl.genl_predicates.reset_genl_predicate_links_in_mt(pred, mt);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject reset_genl_predicate_links(final SubLObject pred) {
        final SubLObject mts = genl_predicate_mts(pred);
        clear_node_genl_predicate_links(pred);
        SubLObject cdolist_list_var = mts;
        SubLObject mt = NIL;
        mt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != fort_types_interface.predicateP(pred)) {
                reset_genl_predicate_links_in_mt(pred, mt);
            }
            cdolist_list_var = cdolist_list_var.rest();
            mt = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject reset_genl_inverse_links_alt(SubLObject pred) {
        {
            SubLObject mts = com.cyc.cycjava.cycl.genl_predicates.genl_inverse_mts(pred);
            com.cyc.cycjava.cycl.genl_predicates.clear_node_genl_inverse_links(pred);
            {
                SubLObject cdolist_list_var = mts;
                SubLObject mt = NIL;
                for (mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt = cdolist_list_var.first()) {
                    if (NIL != fort_types_interface.predicateP(pred)) {
                        com.cyc.cycjava.cycl.genl_predicates.reset_genl_inverse_links_in_mt(pred, mt);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject reset_genl_inverse_links(final SubLObject pred) {
        final SubLObject mts = genl_inverse_mts(pred);
        clear_node_genl_inverse_links(pred);
        SubLObject cdolist_list_var = mts;
        SubLObject mt = NIL;
        mt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != fort_types_interface.predicateP(pred)) {
                reset_genl_inverse_links_in_mt(pred, mt);
            }
            cdolist_list_var = cdolist_list_var.rest();
            mt = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject reset_predicate_genls_links_in_mt_alt(SubLObject pred, SubLObject mt) {
        return com.cyc.cycjava.cycl.genl_predicates.reset_genl_predicate_links_in_mt(pred, mt);
    }

    public static SubLObject reset_predicate_genls_links_in_mt(final SubLObject pred, final SubLObject mt) {
        return reset_genl_predicate_links_in_mt(pred, mt);
    }

    public static final SubLObject reset_genl_predicate_links_in_mt_alt(SubLObject pred, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                    sbhl_link_methods.sbhl_recompute_links(pred, mt, UNPROVIDED);
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

    public static SubLObject reset_genl_predicate_links_in_mt(final SubLObject pred, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
            sbhl_link_methods.sbhl_recompute_links(pred, mt, UNPROVIDED);
        } finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject reset_genl_inverse_links_in_mt_alt(SubLObject pred, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlInverse), thread);
                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlInverse)), thread);
                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlInverse)), thread);
                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlInverse), thread);
                    sbhl_link_methods.sbhl_recompute_links(pred, mt, UNPROVIDED);
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

    public static SubLObject reset_genl_inverse_links_in_mt(final SubLObject pred, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlInverse), thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlInverse)), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlInverse)), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlInverse), thread);
            sbhl_link_methods.sbhl_recompute_links(pred, mt, UNPROVIDED);
        } finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject reset_predicate_graph_alt(SubLObject clearP) {
        if (clearP == UNPROVIDED) {
            clearP = T;
        }
        com.cyc.cycjava.cycl.genl_predicates.reset_genl_predicate_graph(clearP);
        return NIL;
    }

    public static SubLObject reset_predicate_graph(SubLObject clearP) {
        if (clearP == UNPROVIDED) {
            clearP = T;
        }
        reset_genl_predicate_graph(clearP);
        return NIL;
    }

    public static final SubLObject reset_genl_predicate_graph_alt(SubLObject clearP) {
        if (clearP == UNPROVIDED) {
            clearP = T;
        }
        if (NIL != clearP) {
            com.cyc.cycjava.cycl.genl_predicates.clear_genl_predicate_graph();
        }
        sbhl_link_methods.sbhl_recompute_graph_links(sbhl_module_vars.get_sbhl_module($$genlPreds));
        return NIL;
    }

    public static SubLObject reset_genl_predicate_graph(SubLObject clearP) {
        if (clearP == UNPROVIDED) {
            clearP = T;
        }
        if (NIL != clearP) {
            clear_genl_predicate_graph();
        }
        sbhl_link_methods.sbhl_recompute_graph_links(sbhl_module_vars.get_sbhl_module($$genlPreds));
        return NIL;
    }

    public static final SubLObject reset_genl_inverse_graph_alt(SubLObject clearP) {
        if (clearP == UNPROVIDED) {
            clearP = T;
        }
        if (NIL != clearP) {
            com.cyc.cycjava.cycl.genl_predicates.clear_genl_predicate_graph();
        }
        sbhl_link_methods.sbhl_recompute_graph_links(sbhl_module_vars.get_sbhl_module($$genlInverse));
        return NIL;
    }

    public static SubLObject reset_genl_inverse_graph(SubLObject clearP) {
        if (clearP == UNPROVIDED) {
            clearP = T;
        }
        if (NIL != clearP) {
            clear_genl_predicate_graph();
        }
        sbhl_link_methods.sbhl_recompute_graph_links(sbhl_module_vars.get_sbhl_module($$genlInverse));
        return NIL;
    }

    public static SubLObject declare_genl_predicates_file() {
        declareFunction("genl_predicates", "GENL-PREDICATES", 1, 2, false);
        declareFunction("min_genl_predicates", "MIN-GENL-PREDICATES", 1, 2, false);
        declareFunction("genl_inverses", "GENL-INVERSES", 1, 2, false);
        declareFunction("min_genl_inverses", "MIN-GENL-INVERSES", 1, 2, false);
        declareFunction("not_genl_predicates", "NOT-GENL-PREDICATES", 1, 2, false);
        declareFunction("max_not_genl_predicates", "MAX-NOT-GENL-PREDICATES", 1, 2, false);
        declareFunction("not_genl_inverses", "NOT-GENL-INVERSES", 1, 2, false);
        declareFunction("max_not_genl_inverses", "MAX-NOT-GENL-INVERSES", 1, 2, false);
        declareFunction("spec_predicates", "SPEC-PREDICATES", 1, 2, false);
        declareFunction("max_spec_predicates", "MAX-SPEC-PREDICATES", 1, 2, false);
        declareFunction("spec_inverses", "SPEC-INVERSES", 1, 2, false);
        declareFunction("max_spec_inverses", "MAX-SPEC-INVERSES", 1, 2, false);
        declareFunction("not_spec_predicates", "NOT-SPEC-PREDICATES", 1, 2, false);
        declareFunction("min_not_spec_predicates", "MIN-NOT-SPEC-PREDICATES", 1, 2, false);
        declareFunction("not_spec_inverses", "NOT-SPEC-INVERSES", 1, 2, false);
        declareFunction("min_not_spec_inverses", "MIN-NOT-SPEC-INVERSES", 1, 2, false);
        declareFunction("genl_predicate_siblings", "GENL-PREDICATE-SIBLINGS", 1, 2, false);
        declareFunction("genl_inverse_siblings", "GENL-INVERSE-SIBLINGS", 1, 2, false);
        declareFunction("spec_predicate_siblings", "SPEC-PREDICATE-SIBLINGS", 1, 2, false);
        declareFunction("spec_inverse_siblings", "SPEC-INVERSE-SIBLINGS", 1, 2, false);
        declareFunction("genl_predicate_roots", "GENL-PREDICATE-ROOTS", 1, 2, false);
        declareFunction("genl_inverse_roots", "GENL-INVERSE-ROOTS", 1, 2, false);
        declareFunction("all_genl_predicates", "ALL-GENL-PREDICATES", 1, 2, false);
        declareFunction("all_genl_predicates_and_inverses", "ALL-GENL-PREDICATES-AND-INVERSES", 1, 2, false);
        declareFunction("all_genl_preds", "ALL-GENL-PREDS", 1, 2, false);
        declareFunction("all_genl_inverses", "ALL-GENL-INVERSES", 1, 2, false);
        declareFunction("all_spec_predicates", "ALL-SPEC-PREDICATES", 1, 2, false);
        declareFunction("all_spec_preds", "ALL-SPEC-PREDS", 1, 2, false);
        declareFunction("all_spec_inverses", "ALL-SPEC-INVERSES", 1, 2, false);
        declareFunction("all_spec_predicates_and_inverses", "ALL-SPEC-PREDICATES-AND-INVERSES", 1, 2, false);
        declareFunction("inverse_binary_predicates", "INVERSE-BINARY-PREDICATES", 1, 2, false);
        declareFunction("best_inverse_binary_predicate", "BEST-INVERSE-BINARY-PREDICATE", 1, 2, false);
        declareFunction("all_proper_genl_predicates", "ALL-PROPER-GENL-PREDICATES", 1, 2, false);
        declareFunction("all_proper_genl_inverses", "ALL-PROPER-GENL-INVERSES", 1, 2, false);
        declareFunction("all_proper_genl_predicates_and_inverses", "ALL-PROPER-GENL-PREDICATES-AND-INVERSES", 1, 2, false);
        declareFunction("all_proper_spec_predicates", "ALL-PROPER-SPEC-PREDICATES", 1, 2, false);
        declareFunction("all_proper_spec_inverses", "ALL-PROPER-SPEC-INVERSES", 1, 2, false);
        declareFunction("all_proper_spec_predicates_and_inverses", "ALL-PROPER-SPEC-PREDICATES-AND-INVERSES", 1, 2, false);
        declareFunction("all_genl_preds_among", "ALL-GENL-PREDS-AMONG", 2, 2, false);
        declareFunction("all_spec_predicates_among", "ALL-SPEC-PREDICATES-AMONG", 2, 2, false);
        declareFunction("all_genl_inverses_among", "ALL-GENL-INVERSES-AMONG", 2, 2, false);
        declareFunction("all_spec_inverses_among", "ALL-SPEC-INVERSES-AMONG", 2, 2, false);
        declareFunction("all_not_genl_predicates", "ALL-NOT-GENL-PREDICATES", 1, 2, false);
        declareFunction("all_not_genl_preds", "ALL-NOT-GENL-PREDS", 1, 2, false);
        declareFunction("all_not_genl_inverses", "ALL-NOT-GENL-INVERSES", 1, 2, false);
        declareFunction("all_not_spec_predicates", "ALL-NOT-SPEC-PREDICATES", 1, 2, false);
        declareFunction("all_not_spec_preds", "ALL-NOT-SPEC-PREDS", 1, 2, false);
        declareFunction("all_not_spec_inverses", "ALL-NOT-SPEC-INVERSES", 1, 2, false);
        declareFunction("union_all_genl_predicates", "UNION-ALL-GENL-PREDICATES", 1, 2, false);
        declareFunction("union_all_spec_predicates", "UNION-ALL-SPEC-PREDICATES", 1, 2, false);
        declareFunction("union_all_genl_inverses", "UNION-ALL-GENL-INVERSES", 1, 2, false);
        declareFunction("union_all_spec_inverses", "UNION-ALL-SPEC-INVERSES", 1, 2, false);
        declareFunction("union_all_spec_predicates_and_inverses", "UNION-ALL-SPEC-PREDICATES-AND-INVERSES", 1, 2, false);
        declareFunction("map_all_genl_preds", "MAP-ALL-GENL-PREDS", 2, 2, false);
        declareFunction("some_all_genl_preds", "SOME-ALL-GENL-PREDS", 2, 2, false);
        declareFunction("some_all_genl_inverses", "SOME-ALL-GENL-INVERSES", 2, 2, false);
        declareFunction("some_all_genl_preds_and_inverses", "SOME-ALL-GENL-PREDS-AND-INVERSES", 2, 2, false);
        declareFunction("map_all_spec_preds", "MAP-ALL-SPEC-PREDS", 2, 2, false);
        declareFunction("map_spec_preds", "MAP-SPEC-PREDS", 2, 1, false);
        declareFunction("map_all_spec_preds_and_inverses", "MAP-ALL-SPEC-PREDS-AND-INVERSES", 2, 2, false);
        declareFunction("some_all_spec_preds", "SOME-ALL-SPEC-PREDS", 2, 2, false);
        declareFunction("some_all_spec_preds_and_inverses", "SOME-ALL-SPEC-PREDS-AND-INVERSES", 2, 2, false);
        declareFunction("count_all_genl_predicates", "COUNT-ALL-GENL-PREDICATES", 1, 2, false);
        declareFunction("count_all_genl_inverses", "COUNT-ALL-GENL-INVERSES", 1, 2, false);
        declareFunction("count_all_genl_predicates_and_inverses", "COUNT-ALL-GENL-PREDICATES-AND-INVERSES", 1, 2, false);
        declareFunction("count_all_spec_predicates", "COUNT-ALL-SPEC-PREDICATES", 1, 2, false);
        declareFunction("count_all_spec_inverses", "COUNT-ALL-SPEC-INVERSES", 1, 2, false);
        declareFunction("count_all_spec_predicates_and_inverses", "COUNT-ALL-SPEC-PREDICATES-AND-INVERSES", 1, 2, false);
        declareFunction("all_spec_preds_wrt_type", "ALL-SPEC-PREDS-WRT-TYPE", 3, 2, false);
        declareFunction("all_spec_preds_wrt_arg", "ALL-SPEC-PREDS-WRT-ARG", 3, 2, false);
        declareFunction("gather_if_searched_arg_constraints", "GATHER-IF-SEARCHED-ARG-CONSTRAINTS", 1, 0, false);
        declareFunction("get_sbhl_arg_type_alist", "GET-SBHL-ARG-TYPE-ALIST", 0, 0, false);
        declareMacro("with_sbhl_arg_type_alist", "WITH-SBHL-ARG-TYPE-ALIST");
        declareFunction("get_sbhl_arg_type_store", "GET-SBHL-ARG-TYPE-STORE", 1, 0, false);
        declareMacro("with_new_sbhl_arg_type_genls_stores", "WITH-NEW-SBHL-ARG-TYPE-GENLS-STORES");
        declareFunction("sbhl_initialize_arg_type_genls_stores", "SBHL-INITIALIZE-ARG-TYPE-GENLS-STORES", 1, 0, false);
        declareFunction("sbhl_arg_types_alist_satisfied_p", "SBHL-ARG-TYPES-ALIST-SATISFIED-P", 1, 0, false);
        declareFunction("leaf_predicates_wrt_arg_type", "LEAF-PREDICATES-WRT-ARG-TYPE", 2, 0, false);
        declareFunction("sbhl_add_leaf_predicates_to_result", "SBHL-ADD-LEAF-PREDICATES-TO-RESULT", 1, 0, false);
        declareFunction("pred_is_typed_spec_pred_p", "PRED-IS-TYPED-SPEC-PRED-P", 2, 0, false);
        declareFunction("typed_spec_predicates_wrt_arg_type", "TYPED-SPEC-PREDICATES-WRT-ARG-TYPE", 2, 0, false);
        declareFunction("leaf_predicates_mark_and_sweep", "LEAF-PREDICATES-MARK-AND-SWEEP", 1, 0, false);
        declareFunction("min_predicates", "MIN-PREDICATES", 1, 2, false);
        declareFunction("max_predicates", "MAX-PREDICATES", 1, 2, false);
        declareFunction("min_ceiling_predicates", "MIN-CEILING-PREDICATES", 1, 3, false);
        declareFunction("max_floor_predicates", "MAX-FLOOR-PREDICATES", 1, 3, false);
        declareFunction("some_spec_predicate_or_inverse_somewhereP", "SOME-SPEC-PREDICATE-OR-INVERSE-SOMEWHERE?", 1, 0, false);
        declareFunction("genl_predicateP", "GENL-PREDICATE?", 2, 2, false);
        declareFunction("genl_predicate_in_any_mtP", "GENL-PREDICATE-IN-ANY-MT?", 2, 0, false);
        declareFunction("genl_predP", "GENL-PRED?", 2, 2, false);
        declareFunction("spec_predP", "SPEC-PRED?", 2, 2, false);
        declareFunction("proper_genl_predP", "PROPER-GENL-PRED?", 2, 2, false);
        declareFunction("proper_spec_predP", "PROPER-SPEC-PRED?", 2, 2, false);
        declareFunction("spec_predicateP", "SPEC-PREDICATE?", 2, 2, false);
        declareFunction("genl_inverseP", "GENL-INVERSE?", 2, 2, false);
        declareFunction("spec_inverseP", "SPEC-INVERSE?", 2, 2, false);
        declareFunction("genl_predicate_ofP", "GENL-PREDICATE-OF?", 2, 2, false);
        declareFunction("genl_inverse_ofP", "GENL-INVERSE-OF?", 2, 2, false);
        declareFunction("any_genl_predicateP", "ANY-GENL-PREDICATE?", 2, 2, false);
        declareFunction("any_genl_predP", "ANY-GENL-PRED?", 2, 2, false);
        declareFunction("any_genl_predicate_in_any_mtP", "ANY-GENL-PREDICATE-IN-ANY-MT?", 2, 0, false);
        declareFunction("any_genl_inverseP", "ANY-GENL-INVERSE?", 2, 2, false);
        declareFunction("not_genl_predicateP", "NOT-GENL-PREDICATE?", 2, 2, false);
        declareFunction("not_genl_predP", "NOT-GENL-PRED?", 2, 2, false);
        declareFunction("not_spec_predicateP", "NOT-SPEC-PREDICATE?", 2, 2, false);
        declareFunction("argue_not_genl_predicateP", "ARGUE-NOT-GENL-PREDICATE?", 2, 2, false);
        declareFunction("not_genl_inverseP", "NOT-GENL-INVERSE?", 2, 2, false);
        declareFunction("not_spec_inverseP", "NOT-SPEC-INVERSE?", 2, 1, false);
        declareFunction("argue_not_genl_inverseP", "ARGUE-NOT-GENL-INVERSE?", 2, 2, false);
        declareFunction("any_not_genl_predicateP", "ANY-NOT-GENL-PREDICATE?", 2, 2, false);
        declareFunction("random_genl_predicate_of", "RANDOM-GENL-PREDICATE-OF", 1, 2, false);
        declareFunction("random_spec_predicate_of", "RANDOM-SPEC-PREDICATE-OF", 1, 2, false);
        declareFunction("random_proper_genl_predicate_of", "RANDOM-PROPER-GENL-PREDICATE-OF", 1, 2, false);
        declareFunction("random_proper_spec_predicate_of", "RANDOM-PROPER-SPEC-PREDICATE-OF", 1, 2, false);
        declareFunction("random_genl_inverse_of", "RANDOM-GENL-INVERSE-OF", 1, 2, false);
        declareFunction("random_spec_inverse_of", "RANDOM-SPEC-INVERSE-OF", 1, 2, false);
        declareFunction("random_proper_genl_inverse_of", "RANDOM-PROPER-GENL-INVERSE-OF", 1, 2, false);
        declareFunction("random_proper_spec_inverse_of", "RANDOM-PROPER-SPEC-INVERSE-OF", 1, 2, false);
        declareFunction("random_genl_predicate_or_inverse_of", "RANDOM-GENL-PREDICATE-OR-INVERSE-OF", 1, 2, false);
        declareFunction("random_spec_predicate_or_inverse_of", "RANDOM-SPEC-PREDICATE-OR-INVERSE-OF", 1, 2, false);
        declareFunction("random_proper_genl_predicate_or_inverse_of", "RANDOM-PROPER-GENL-PREDICATE-OR-INVERSE-OF", 1, 2, false);
        declareFunction("random_proper_spec_predicate_or_inverse_of", "RANDOM-PROPER-SPEC-PREDICATE-OR-INVERSE-OF", 1, 2, false);
        declareFunction("any_spec_predP", "ANY-SPEC-PRED?", 2, 2, false);
        declareFunction("any_spec_inverseP", "ANY-SPEC-INVERSE?", 2, 2, false);
        declareFunction("some_genl_pred_or_inverseP", "SOME-GENL-PRED-OR-INVERSE?", 1, 2, false);
        declareFunction("some_genl_pred_or_inverseP_int", "SOME-GENL-PRED-OR-INVERSE?-INT", 1, 2, false);
        declareFunction("some_spec_pred_or_inverseP", "SOME-SPEC-PRED-OR-INVERSE?", 1, 2, false);
        declareFunction("some_spec_pred_or_inverseP_int", "SOME-SPEC-PRED-OR-INVERSE?-INT", 1, 2, false);
        declareFunction("intersecting_predicatesP", "INTERSECTING-PREDICATES?", 2, 1, false);
        declareFunction("predicates_intersectP", "PREDICATES-INTERSECT?", 2, 1, false);
        declareFunction("preds_intersectP", "PREDS-INTERSECT?", 2, 1, false);
        declareFunction("why_genl_predicateP", "WHY-GENL-PREDICATE?", 2, 3, false);
        declareFunction("why_not_genl_predicateP", "WHY-NOT-GENL-PREDICATE?", 2, 3, false);
        declareFunction("why_genl_inverseP", "WHY-GENL-INVERSE?", 2, 3, false);
        declareFunction("why_spec_inverseP", "WHY-SPEC-INVERSE?", 2, 3, false);
        declareFunction("why_not_genl_inverseP", "WHY-NOT-GENL-INVERSE?", 2, 3, false);
        declareFunction("why_some_genl_predicate_amongP", "WHY-SOME-GENL-PREDICATE-AMONG?", 2, 3, false);
        declareFunction("why_some_genl_inverse_amongP", "WHY-SOME-GENL-INVERSE-AMONG?", 2, 3, false);
        declareFunction("max_floor_mts_of_genl_predicate_paths", "MAX-FLOOR-MTS-OF-GENL-PREDICATE-PATHS", 2, 1, false);
        declareFunction("max_floor_mts_of_genl_pred_paths", "MAX-FLOOR-MTS-OF-GENL-PRED-PATHS", 2, 0, false);
        declareFunction("min_mts_of_genl_predicate_paths", "MIN-MTS-OF-GENL-PREDICATE-PATHS", 2, 1, false);
        declareFunction("min_mts_of_genl_pred_paths", "MIN-MTS-OF-GENL-PRED-PATHS", 2, 1, false);
        declareFunction("max_floor_mts_of_not_genl_predicate_paths", "MAX-FLOOR-MTS-OF-NOT-GENL-PREDICATE-PATHS", 2, 1, false);
        declareFunction("min_mts_of_not_genl_predicate_paths", "MIN-MTS-OF-NOT-GENL-PREDICATE-PATHS", 2, 1, false);
        declareFunction("max_floor_mts_of_genl_inverse_paths", "MAX-FLOOR-MTS-OF-GENL-INVERSE-PATHS", 2, 1, false);
        declareFunction("min_mts_of_genl_inverse_paths", "MIN-MTS-OF-GENL-INVERSE-PATHS", 2, 1, false);
        declareFunction("max_floor_mts_of_not_genl_inverse_paths", "MAX-FLOOR-MTS-OF-NOT-GENL-INVERSE-PATHS", 2, 1, false);
        declareFunction("min_mts_of_not_genl_inverse_paths", "MIN-MTS-OF-NOT-GENL-INVERSE-PATHS", 2, 1, false);
        declareFunction("min_candidate_genl_preds", "MIN-CANDIDATE-GENL-PREDS", 1, 2, false);
        declareFunction("cached_min_candidate_genl_preds", "CACHED-MIN-CANDIDATE-GENL-PREDS", 1, 1, false);
        declareFunction("cached_min_candidate_genl_preds_in_mt", "CACHED-MIN-CANDIDATE-GENL-PREDS-IN-MT", 2, 1, false);
        declareFunction("clear_cached_candidate_genl_preds", "CLEAR-CACHED-CANDIDATE-GENL-PREDS", 0, 0, false);
        declareFunction("remove_cached_candidate_genl_preds", "REMOVE-CACHED-CANDIDATE-GENL-PREDS", 1, 0, false);
        declareFunction("cached_candidate_genl_preds_internal", "CACHED-CANDIDATE-GENL-PREDS-INTERNAL", 1, 0, false);
        declareFunction("cached_candidate_genl_preds", "CACHED-CANDIDATE-GENL-PREDS", 1, 0, false);
        declareFunction("clear_cached_candidate_genl_preds_in_mt", "CLEAR-CACHED-CANDIDATE-GENL-PREDS-IN-MT", 0, 0, false);
        declareFunction("remove_cached_candidate_genl_preds_in_mt", "REMOVE-CACHED-CANDIDATE-GENL-PREDS-IN-MT", 2, 0, false);
        declareFunction("cached_candidate_genl_preds_in_mt_internal", "CACHED-CANDIDATE-GENL-PREDS-IN-MT-INTERNAL", 2, 0, false);
        declareFunction("cached_candidate_genl_preds_in_mt", "CACHED-CANDIDATE-GENL-PREDS-IN-MT", 2, 0, false);
        declareFunction("candidate_genl_preds", "CANDIDATE-GENL-PREDS", 1, 1, false);
        declareFunction("candidate_preds_for_arg_type", "CANDIDATE-PREDS-FOR-ARG-TYPE", 2, 2, false);
        declareFunction("candidate_preds_for_arg_isa", "CANDIDATE-PREDS-FOR-ARG-ISA", 1, 0, false);
        declareFunction("candidate_preds_for_arg_genl", "CANDIDATE-PREDS-FOR-ARG-GENL", 1, 0, false);
        declareFunction("min_preds_wrt_arg_types", "MIN-PREDS-WRT-ARG-TYPES", 1, 1, false);
        declareFunction("min_preds_wrt_arg_isa", "MIN-PREDS-WRT-ARG-ISA", 1, 1, false);
        declareFunction("min_preds_wrt_arg_genl", "MIN-PREDS-WRT-ARG-GENL", 1, 1, false);
        declareFunction("genl_predicate_mts", "GENL-PREDICATE-MTS", 1, 0, false);
        declareFunction("genl_predicate_forward_mts", "GENL-PREDICATE-FORWARD-MTS", 1, 0, false);
        declareFunction("genl_predicate_backward_mts", "GENL-PREDICATE-BACKWARD-MTS", 1, 0, false);
        declareFunction("asserted_genl_predicatesP", "ASSERTED-GENL-PREDICATES?", 1, 1, false);
        declareFunction("asserted_genl_predicates", "ASSERTED-GENL-PREDICATES", 1, 1, false);
        declareFunction("asserted_not_genl_predicates", "ASSERTED-NOT-GENL-PREDICATES", 1, 1, false);
        declareFunction("supported_genl_predicates", "SUPPORTED-GENL-PREDICATES", 1, 1, false);
        declareFunction("supported_not_genl_predicates", "SUPPORTED-NOT-GENL-PREDICATES", 1, 1, false);
        declareFunction("asserted_spec_predicates", "ASSERTED-SPEC-PREDICATES", 1, 1, false);
        declareFunction("asserted_not_spec_predicates", "ASSERTED-NOT-SPEC-PREDICATES", 1, 1, false);
        declareFunction("supported_spec_predicates", "SUPPORTED-SPEC-PREDICATES", 1, 1, false);
        declareFunction("supported_not_spec_predicates", "SUPPORTED-NOT-SPEC-PREDICATES", 1, 1, false);
        declareFunction("genl_inverse_mts", "GENL-INVERSE-MTS", 1, 0, false);
        declareFunction("genl_inverse_forward_mts", "GENL-INVERSE-FORWARD-MTS", 1, 0, false);
        declareFunction("genl_inverse_backward_mts", "GENL-INVERSE-BACKWARD-MTS", 1, 0, false);
        declareFunction("asserted_genl_inversesP", "ASSERTED-GENL-INVERSES?", 1, 1, false);
        declareFunction("asserted_genl_inverses", "ASSERTED-GENL-INVERSES", 1, 1, false);
        declareFunction("asserted_not_genl_inverses", "ASSERTED-NOT-GENL-INVERSES", 1, 1, false);
        declareFunction("supported_genl_inverses", "SUPPORTED-GENL-INVERSES", 1, 1, false);
        declareFunction("supported_not_genl_inverses", "SUPPORTED-NOT-GENL-INVERSES", 1, 1, false);
        declareFunction("asserted_spec_inverses", "ASSERTED-SPEC-INVERSES", 1, 1, false);
        declareFunction("asserted_not_spec_inverses", "ASSERTED-NOT-SPEC-INVERSES", 1, 1, false);
        declareFunction("supported_spec_inverses", "SUPPORTED-SPEC-INVERSES", 1, 1, false);
        declareFunction("supported_not_spec_inverses", "SUPPORTED-NOT-SPEC-INVERSES", 1, 1, false);
        declareFunction("genl_predicate_after_adding", "GENL-PREDICATE-AFTER-ADDING", 2, 0, false);
        declareFunction("add_genl_predicate", "ADD-GENL-PREDICATE", 2, 0, false);
        declareFunction("genl_inverse_after_adding", "GENL-INVERSE-AFTER-ADDING", 2, 0, false);
        declareFunction("add_genl_inverse", "ADD-GENL-INVERSE", 2, 0, false);
        declareFunction("remove_genl_predicate", "REMOVE-GENL-PREDICATE", 2, 0, false);
        declareFunction("remove_genl_inverse", "REMOVE-GENL-INVERSE", 2, 0, false);
        declareFunction("genl_predicate_after_removing", "GENL-PREDICATE-AFTER-REMOVING", 2, 0, false);
        declareFunction("genl_inverse_after_removing", "GENL-INVERSE-AFTER-REMOVING", 2, 0, false);
        declareFunction("clear_predicate_graph", "CLEAR-PREDICATE-GRAPH", 0, 0, false);
        declareFunction("clear_genl_predicate_graph", "CLEAR-GENL-PREDICATE-GRAPH", 0, 0, false);
        declareFunction("clear_genl_inverse_graph", "CLEAR-GENL-INVERSE-GRAPH", 0, 0, false);
        declareFunction("clear_node_genl_predicate_links", "CLEAR-NODE-GENL-PREDICATE-LINKS", 1, 0, false);
        declareFunction("clear_node_genl_inverse_links", "CLEAR-NODE-GENL-INVERSE-LINKS", 1, 0, false);
        declareFunction("reset_genl_predicate_links", "RESET-GENL-PREDICATE-LINKS", 1, 0, false);
        declareFunction("reset_genl_inverse_links", "RESET-GENL-INVERSE-LINKS", 1, 0, false);
        declareFunction("reset_predicate_genls_links_in_mt", "RESET-PREDICATE-GENLS-LINKS-IN-MT", 2, 0, false);
        declareFunction("reset_genl_predicate_links_in_mt", "RESET-GENL-PREDICATE-LINKS-IN-MT", 2, 0, false);
        declareFunction("reset_genl_inverse_links_in_mt", "RESET-GENL-INVERSE-LINKS-IN-MT", 2, 0, false);
        declareFunction("reset_predicate_graph", "RESET-PREDICATE-GRAPH", 0, 1, false);
        declareFunction("reset_genl_predicate_graph", "RESET-GENL-PREDICATE-GRAPH", 0, 1, false);
        declareFunction("reset_genl_inverse_graph", "RESET-GENL-INVERSE-GRAPH", 0, 1, false);
        return NIL;
    }

    public static SubLObject init_genl_predicates_file() {
        defparameter("*SBHL-ARG-TYPE-ALIST*", NIL);
        defparameter("*SBHL-ARG-TYPE-GENLS-STORES*", NIL);
        deflexical("*CACHED-CANDIDATE-GENL-PREDS-CACHING-STATE*", NIL);
        deflexical("*CACHED-CANDIDATE-GENL-PREDS-IN-MT-CACHING-STATE*", NIL);
        return NIL;
    }

    public static final SubLObject setup_genl_predicates_file_alt() {
        register_cyc_api_function(GENL_PREDICATES, $list_alt3, $str_alt4$Returns_the_local_genlPreds_of_PR, $list_alt5, $list_alt6);
        register_cyc_api_function(MIN_GENL_PREDICATES, $list_alt3, $str_alt8$Returns_the_most_specific_local_g, $list_alt5, $list_alt6);
        register_cyc_api_function(GENL_INVERSES, $list_alt3, $str_alt11$Returns_the_local_genlInverses_of, $list_alt5, $list_alt6);
        register_cyc_api_function(MIN_GENL_INVERSES, $list_alt3, $str_alt13$Returns_the_most_specific_local_g, $list_alt5, $list_alt6);
        register_cyc_api_function(NOT_GENL_PREDICATES, $list_alt3, $str_alt15$Returns_the_local_negated_genlPre, $list_alt5, $list_alt6);
        register_cyc_api_function(MAX_NOT_GENL_PREDICATES, $list_alt3, $str_alt17$Returns_the_most_general_local_ne, $list_alt5, $list_alt6);
        register_cyc_api_function(NOT_GENL_INVERSES, $list_alt3, $str_alt15$Returns_the_local_negated_genlPre, $list_alt5, $list_alt6);
        register_cyc_api_function(MAX_NOT_GENL_INVERSES, $list_alt3, $str_alt17$Returns_the_most_general_local_ne, $list_alt5, $list_alt6);
        register_cyc_api_function(SPEC_PREDICATES, $list_alt3, $$$Returns_the_specPreds_of_PRED, $list_alt5, $list_alt6);
        register_cyc_api_function(MAX_SPEC_PREDICATES, $list_alt3, $str_alt23$Returns_the_most_general_specPred, $list_alt5, $list_alt6);
        register_cyc_api_function(SPEC_INVERSES, $list_alt3, $$$Returns_the_specInverses_of_PRED, $list_alt5, $list_alt6);
        register_cyc_api_function(MAX_SPEC_INVERSES, $list_alt3, $str_alt27$Returns_the_most_general_specInve, $list_alt5, $list_alt6);
        register_cyc_api_function(NOT_SPEC_PREDICATES, $list_alt3, $str_alt29$Returns_the_negated_specPreds_of_, $list_alt5, $list_alt6);
        register_cyc_api_function(MIN_NOT_SPEC_PREDICATES, $list_alt3, $str_alt31$Returns_the_most_specific_negated, $list_alt5, $list_alt6);
        register_cyc_api_function(NOT_SPEC_INVERSES, $list_alt3, $str_alt31$Returns_the_most_specific_negated, $list_alt5, $list_alt6);
        register_cyc_api_function(MIN_NOT_SPEC_INVERSES, $list_alt3, $str_alt31$Returns_the_most_specific_negated, $list_alt5, $list_alt6);
        register_cyc_api_function(GENL_PREDICATE_SIBLINGS, $list_alt3, $str_alt35$Returns_the_direct___genlPreds_of, $list_alt5, $list_alt6);
        register_cyc_api_function(GENL_INVERSE_SIBLINGS, $list_alt3, $str_alt37$Returns_the_direct___genlInverse_, $list_alt5, $list_alt6);
        register_cyc_api_function(SPEC_PREDICATE_SIBLINGS, $list_alt3, $str_alt39$Returns_the_direct_spec_preds_of_, $list_alt5, $list_alt6);
        register_cyc_api_function(SPEC_INVERSE_SIBLINGS, $list_alt3, $str_alt41$Returns_the_direct_spec_inverses_, $list_alt5, $list_alt6);
        register_cyc_api_function(GENL_PREDICATE_ROOTS, $list_alt3, $str_alt43$Returns_the_most_general_genlPred, $list_alt5, $list_alt6);
        register_cyc_api_function(GENL_INVERSE_ROOTS, $list_alt3, $str_alt45$Returns_the_most_general_genlInve, $list_alt5, $list_alt6);
        register_cyc_api_function(ALL_GENL_PREDICATES, $list_alt3, $str_alt47$Returns_all_genlPreds_of_predicat, $list_alt5, $list_alt6);
        register_cyc_api_function(ALL_GENL_INVERSES, $list_alt3, $str_alt47$Returns_all_genlPreds_of_predicat, $list_alt5, $list_alt6);
        register_cyc_api_function(ALL_SPEC_PREDICATES, $list_alt3, $str_alt63$Returns_all_predicates_having_PRE, $list_alt5, $list_alt6);
        register_cyc_api_function(ALL_SPEC_INVERSES, $list_alt3, $str_alt65$Returns_all_predicates_having_PRE, $list_alt5, $list_alt6);
        register_cyc_api_function(ALL_GENL_PREDS_AMONG, $list_alt69, $str_alt70$Returns_those_genlPreds_of_PRED_t, $list_alt71, $list_alt6);
        register_cyc_api_function(ALL_NOT_GENL_PREDICATES, $list_alt3, $str_alt73$Returns_all_negated_genlPreds_of_, $list_alt5, $list_alt6);
        register_cyc_api_function(ALL_NOT_GENL_INVERSES, $list_alt3, $str_alt73$Returns_all_negated_genlPreds_of_, $list_alt5, $list_alt6);
        register_cyc_api_function(ALL_NOT_SPEC_PREDICATES, $list_alt3, $str_alt76$Returns_all_negated_specPreds_of_, $list_alt5, $list_alt6);
        register_cyc_api_function(ALL_NOT_SPEC_INVERSES, $list_alt3, $str_alt78$Returns_all_predicates_having_PRE, $list_alt5, $list_alt6);
        register_cyc_api_function(UNION_ALL_GENL_PREDICATES, $list_alt80, $str_alt81$Returns_all_genl_predicates_of_ea, $list_alt82, $list_alt6);
        register_cyc_api_function(UNION_ALL_SPEC_PREDICATES, $list_alt80, $str_alt84$Returns_all_spec_predicates_of_ea, $list_alt82, $list_alt6);
        register_cyc_api_function(UNION_ALL_GENL_INVERSES, $list_alt80, $str_alt86$Returns_all_genl_inverses_of_each, $list_alt82, $list_alt6);
        register_cyc_api_function(UNION_ALL_SPEC_INVERSES, $list_alt80, $str_alt88$Returns_all_specs_of_each_predica, $list_alt82, $list_alt6);
        register_cyc_api_function(MAP_ALL_GENL_PREDS, $list_alt91, $$$Apply_FN_to_each_genlPred_of_PRED, $list_alt93, NIL);
        register_cyc_api_function(SOME_ALL_GENL_PREDS, $list_alt91, $str_alt95$Apply_FN_to_each_genlPred_of_PRED, $list_alt93, NIL);
        register_cyc_api_function(SOME_ALL_GENL_INVERSES, $list_alt91, $str_alt95$Apply_FN_to_each_genlPred_of_PRED, $list_alt93, NIL);
        register_cyc_api_function(MAP_ALL_SPEC_PREDS, $list_alt91, $$$Apply_FN_to_each_genlPred_of_PRED, $list_alt93, NIL);
        register_cyc_api_function(SOME_ALL_SPEC_PREDS, $list_alt91, $str_alt95$Apply_FN_to_each_genlPred_of_PRED, $list_alt93, NIL);
        register_cyc_api_function(ALL_SPEC_PREDS_WRT_TYPE, $list_alt103, $str_alt104$Returns_those_all_spec_preds_of_P, $list_alt105, $list_alt6);
        register_cyc_api_function(ALL_SPEC_PREDS_WRT_ARG, $list_alt108, $str_alt109$Returns_those_all_spec_preds_of_P, $list_alt110, $list_alt6);
        register_cyc_api_function(MIN_PREDICATES, $list_alt80, $str_alt125$Returns_the_most_specific_predica, $list_alt82, $list_alt6);
        register_cyc_api_function(MAX_PREDICATES, $list_alt80, $str_alt127$Returns_the_most_general_predicat, $list_alt82, $list_alt6);
        register_cyc_api_function(MIN_CEILING_PREDICATES, $list_alt129, $str_alt130$Returns_the_most_specific_common_, $list_alt82, $list_alt6);
        register_cyc_api_function(MAX_FLOOR_PREDICATES, $list_alt129, $str_alt133$Returns_the_most_general_common_s, $list_alt82, $list_alt6);
        register_cyc_api_function($sym134$GENL_PREDICATE_, $list_alt135, $str_alt136$Is_GENL_a_genlPred_of_SPEC______a, $list_alt137, $list_alt138);
        register_cyc_api_function($sym141$SPEC_PREDICATE_, $list_alt142, $str_alt136$Is_GENL_a_genlPred_of_SPEC______a, $list_alt143, $list_alt138);
        register_cyc_api_function($sym144$GENL_INVERSE_, $list_alt135, $str_alt145$Is_GENL_a_genlInverse_of_SPEC____, $list_alt137, $list_alt138);
        register_cyc_api_function($sym146$SPEC_INVERSE_, $list_alt142, $str_alt145$Is_GENL_a_genlInverse_of_SPEC____, $list_alt137, $list_alt138);
        register_cyc_api_function($sym147$ANY_GENL_PREDICATE_, $list_alt148, $str_alt149$Returns_T_iff__genl_predicate__SP, $list_alt150, $list_alt138);
        register_cyc_api_function($sym151$NOT_GENL_PREDICATE_, $list_alt152, $str_alt153$Is_NOT_GENL_known_to_be_not_a_gen, $list_alt154, $list_alt138);
        register_cyc_api_function($sym155$NOT_GENL_INVERSE_, $list_alt152, $str_alt156$Is_NOT_GENL_a_negated_genlInverse, $list_alt154, $list_alt138);
        register_cyc_api_function($sym157$ANY_NOT_GENL_PREDICATE_, $list_alt158, $str_alt159$Is_any_predicate_in_NOT_GENLS_not, $list_alt160, $list_alt138);
        register_cyc_api_function($sym163$INTERSECTING_PREDICATES_, $list_alt164, $str_alt165$Does_the_extension_of_PRED1_inclu, $list_alt166, $list_alt138);
        register_cyc_api_function($sym167$WHY_GENL_PREDICATE_, $list_alt168, $str_alt169$A_justification_of__genlPreds_SPE, $list_alt137, $list_alt170);
        register_cyc_api_function($sym171$WHY_NOT_GENL_PREDICATE_, $list_alt168, $str_alt172$A_justification_of__not__genlPred, $list_alt137, $list_alt170);
        register_cyc_api_function($sym173$WHY_GENL_INVERSE_, $list_alt174, $str_alt175$A_justification_of__genlInverse_P, $list_alt176, $list_alt170);
        register_cyc_api_function($sym178$WHY_NOT_GENL_INVERSE_, $list_alt168, $str_alt179$A_justification_of__not__genlInve, $list_alt137, $list_alt170);
        register_cyc_api_function(MAX_FLOOR_MTS_OF_GENL_PREDICATE_PATHS, $list_alt182, $str_alt183$_return_listp__In_what__most_genl, $list_alt137, NIL);
        register_cyc_api_function(MAX_FLOOR_MTS_OF_GENL_INVERSE_PATHS, $list_alt185, $str_alt186$In_what__most_genl__mts_is_GENL_I, $list_alt187, NIL);
        memoization_state.note_globally_cached_function(CACHED_CANDIDATE_GENL_PREDS);
        memoization_state.note_globally_cached_function(CACHED_CANDIDATE_GENL_PREDS_IN_MT);
        register_kb_function(GENL_PREDICATE_AFTER_ADDING);
        register_kb_function(ADD_GENL_PREDICATE);
        register_kb_function(GENL_INVERSE_AFTER_ADDING);
        register_kb_function(ADD_GENL_INVERSE);
        register_kb_function(REMOVE_GENL_PREDICATE);
        register_kb_function(REMOVE_GENL_INVERSE);
        register_kb_function(GENL_PREDICATE_AFTER_REMOVING);
        register_kb_function(GENL_INVERSE_AFTER_REMOVING);
        return NIL;
    }

    public static SubLObject setup_genl_predicates_file() {
        if (SubLFiles.USE_V1) {
            register_cyc_api_function(GENL_PREDICATES, $list3, $str4$Returns_the_local_genlPreds_of_PR, $list5, $list6);
            register_cyc_api_function(MIN_GENL_PREDICATES, $list3, $str8$Returns_the_most_specific_local_g, $list5, $list6);
            register_cyc_api_function(GENL_INVERSES, $list3, $str11$Returns_the_local_genlInverses_of, $list5, $list6);
            register_cyc_api_function(MIN_GENL_INVERSES, $list3, $str13$Returns_the_most_specific_local_g, $list5, $list6);
            register_cyc_api_function(NOT_GENL_PREDICATES, $list3, $str15$Returns_the_local_negated_genlPre, $list5, $list6);
            register_cyc_api_function(MAX_NOT_GENL_PREDICATES, $list3, $str17$Returns_the_most_general_local_ne, $list5, $list6);
            register_cyc_api_function(NOT_GENL_INVERSES, $list3, $str15$Returns_the_local_negated_genlPre, $list5, $list6);
            register_cyc_api_function(MAX_NOT_GENL_INVERSES, $list3, $str17$Returns_the_most_general_local_ne, $list5, $list6);
            register_cyc_api_function(SPEC_PREDICATES, $list3, $$$Returns_the_specPreds_of_PRED, $list5, $list6);
            register_cyc_api_function(MAX_SPEC_PREDICATES, $list3, $str23$Returns_the_most_general_specPred, $list5, $list6);
            register_cyc_api_function(SPEC_INVERSES, $list3, $$$Returns_the_specInverses_of_PRED, $list5, $list6);
            register_cyc_api_function(MAX_SPEC_INVERSES, $list3, $str27$Returns_the_most_general_specInve, $list5, $list6);
            register_cyc_api_function(NOT_SPEC_PREDICATES, $list3, $str29$Returns_the_negated_specPreds_of_, $list5, $list6);
            register_cyc_api_function(MIN_NOT_SPEC_PREDICATES, $list3, $str31$Returns_the_most_specific_negated, $list5, $list6);
            register_cyc_api_function(NOT_SPEC_INVERSES, $list3, $str31$Returns_the_most_specific_negated, $list5, $list6);
            register_cyc_api_function(MIN_NOT_SPEC_INVERSES, $list3, $str31$Returns_the_most_specific_negated, $list5, $list6);
            register_cyc_api_function(GENL_PREDICATE_SIBLINGS, $list3, $str35$Returns_the_direct___genlPreds_of, $list5, $list6);
            register_cyc_api_function(GENL_INVERSE_SIBLINGS, $list3, $str37$Returns_the_direct___genlInverse_, $list5, $list6);
            register_cyc_api_function(SPEC_PREDICATE_SIBLINGS, $list3, $str39$Returns_the_direct_spec_preds_of_, $list5, $list6);
            register_cyc_api_function(SPEC_INVERSE_SIBLINGS, $list3, $str41$Returns_the_direct_spec_inverses_, $list5, $list6);
            register_cyc_api_function(GENL_PREDICATE_ROOTS, $list3, $str43$Returns_the_most_general_genlPred, $list5, $list6);
            register_cyc_api_function(GENL_INVERSE_ROOTS, $list3, $str45$Returns_the_most_general_genlInve, $list5, $list6);
            register_cyc_api_function(ALL_GENL_PREDICATES, $list3, $str47$Returns_all_genlPreds_of_predicat, $list5, $list6);
            register_cyc_api_function(ALL_GENL_INVERSES, $list3, $str63$Returns_all_genlInverses_of_predi, $list5, $list6);
            register_cyc_api_function(ALL_SPEC_PREDICATES, $list3, $str65$Returns_all_predicates_having_PRE, $list5, $list6);
            register_cyc_api_function(ALL_SPEC_INVERSES, $list3, $str67$Returns_all_predicates_having_PRE, $list5, $list6);
            register_cyc_api_function(ALL_GENL_PREDS_AMONG, $list72, $str73$Returns_those_genlPreds_of_PRED_t, $list74, $list6);
            register_cyc_api_function(ALL_NOT_GENL_PREDICATES, $list3, $str76$Returns_all_negated_genlPreds_of_, $list5, $list6);
            register_cyc_api_function(ALL_NOT_GENL_INVERSES, $list3, $str76$Returns_all_negated_genlPreds_of_, $list5, $list6);
            register_cyc_api_function(ALL_NOT_SPEC_PREDICATES, $list3, $str79$Returns_all_negated_specPreds_of_, $list5, $list6);
            register_cyc_api_function(ALL_NOT_SPEC_INVERSES, $list3, $str81$Returns_all_predicates_having_PRE, $list5, $list6);
            register_cyc_api_function(UNION_ALL_GENL_PREDICATES, $list83, $str84$Returns_all_genl_predicates_of_ea, $list85, $list6);
            register_cyc_api_function(UNION_ALL_SPEC_PREDICATES, $list83, $str87$Returns_all_spec_predicates_of_ea, $list85, $list6);
            register_cyc_api_function(UNION_ALL_GENL_INVERSES, $list83, $str89$Returns_all_genl_inverses_of_each, $list85, $list6);
            register_cyc_api_function(UNION_ALL_SPEC_INVERSES, $list83, $str91$Returns_all_specs_of_each_predica, $list85, $list6);
            register_cyc_api_function(MAP_ALL_GENL_PREDS, $list94, $$$Apply_FN_to_each_genlPred_of_PRED, $list96, NIL);
            register_cyc_api_function(SOME_ALL_GENL_PREDS, $list94, $str98$Apply_FN_to_each_genlPred_of_PRED, $list96, NIL);
            register_cyc_api_function(SOME_ALL_GENL_INVERSES, $list94, $str98$Apply_FN_to_each_genlPred_of_PRED, $list96, NIL);
            register_cyc_api_function(MAP_ALL_SPEC_PREDS, $list94, $$$Apply_FN_to_each_genlPred_of_PRED, $list96, NIL);
            register_cyc_api_function(SOME_ALL_SPEC_PREDS, $list94, $str98$Apply_FN_to_each_genlPred_of_PRED, $list96, NIL);
            register_cyc_api_function(ALL_SPEC_PREDS_WRT_TYPE, $list106, $str107$Returns_those_all_spec_preds_of_P, $list108, $list6);
            register_cyc_api_function(ALL_SPEC_PREDS_WRT_ARG, $list111, $str112$Returns_those_all_spec_preds_of_P, $list113, $list6);
            register_cyc_api_function(MIN_PREDICATES, $list83, $str128$Returns_the_most_specific_predica, $list85, $list6);
            register_cyc_api_function(MAX_PREDICATES, $list83, $str130$Returns_the_most_general_predicat, $list85, $list6);
            register_cyc_api_function(MIN_CEILING_PREDICATES, $list132, $str133$Returns_the_most_specific_common_, $list85, $list6);
            register_cyc_api_function(MAX_FLOOR_PREDICATES, $list132, $str136$Returns_the_most_general_common_s, $list85, $list6);
            register_cyc_api_function($sym137$GENL_PREDICATE_, $list138, $str139$Is_GENL_a_genlPred_of_SPEC______a, $list140, $list141);
            register_cyc_api_function($sym144$SPEC_PREDICATE_, $list145, $str139$Is_GENL_a_genlPred_of_SPEC______a, $list146, $list141);
            register_cyc_api_function($sym147$GENL_INVERSE_, $list138, $str148$Is_GENL_a_genlInverse_of_SPEC____, $list140, $list141);
            register_cyc_api_function($sym149$SPEC_INVERSE_, $list145, $str148$Is_GENL_a_genlInverse_of_SPEC____, $list140, $list141);
            register_cyc_api_function($sym150$ANY_GENL_PREDICATE_, $list151, $str152$Returns_T_iff__genl_predicate__SP, $list153, $list141);
            register_cyc_api_function($sym154$NOT_GENL_PREDICATE_, $list155, $str156$Is_NOT_GENL_known_to_be_not_a_gen, $list157, $list141);
            register_cyc_api_function($sym158$NOT_GENL_INVERSE_, $list155, $str159$Is_NOT_GENL_a_negated_genlInverse, $list157, $list141);
            register_cyc_api_function($sym160$ANY_NOT_GENL_PREDICATE_, $list161, $str162$Is_any_predicate_in_NOT_GENLS_not, $list163, $list141);
            register_cyc_api_function($sym166$INTERSECTING_PREDICATES_, $list167, $str168$Does_the_extension_of_PRED1_inclu, $list169, $list141);
            register_cyc_api_function($sym170$WHY_GENL_PREDICATE_, $list171, $str172$A_justification_of__genlPreds_SPE, $list140, $list173);
            register_cyc_api_function($sym174$WHY_NOT_GENL_PREDICATE_, $list171, $str175$A_justification_of__not__genlPred, $list140, $list173);
            register_cyc_api_function($sym176$WHY_GENL_INVERSE_, $list177, $str178$A_justification_of__genlInverse_P, $list179, $list173);
            register_cyc_api_function($sym181$WHY_NOT_GENL_INVERSE_, $list171, $str182$A_justification_of__not__genlInve, $list140, $list173);
            register_cyc_api_function(MAX_FLOOR_MTS_OF_GENL_PREDICATE_PATHS, $list185, $str186$_return_listp__In_what__most_genl, $list140, NIL);
            register_cyc_api_function(MAX_FLOOR_MTS_OF_GENL_INVERSE_PATHS, $list188, $str189$In_what__most_genl__mts_is_GENL_I, $list190, NIL);
            memoization_state.note_globally_cached_function(CACHED_CANDIDATE_GENL_PREDS);
            memoization_state.note_globally_cached_function(CACHED_CANDIDATE_GENL_PREDS_IN_MT);
            register_kb_function(GENL_PREDICATE_AFTER_ADDING);
            register_kb_function(ADD_GENL_PREDICATE);
            register_kb_function(GENL_INVERSE_AFTER_ADDING);
            register_kb_function(ADD_GENL_INVERSE);
            register_kb_function(REMOVE_GENL_PREDICATE);
            register_kb_function(REMOVE_GENL_INVERSE);
            register_kb_function(GENL_PREDICATE_AFTER_REMOVING);
            register_kb_function(GENL_INVERSE_AFTER_REMOVING);
        }
        if (SubLFiles.USE_V2) {
            register_cyc_api_function(ALL_GENL_INVERSES, $list_alt3, $str_alt47$Returns_all_genlPreds_of_predicat, $list_alt5, $list_alt6);
            register_cyc_api_function(ALL_SPEC_PREDICATES, $list_alt3, $str_alt63$Returns_all_predicates_having_PRE, $list_alt5, $list_alt6);
            register_cyc_api_function(ALL_SPEC_INVERSES, $list_alt3, $str_alt65$Returns_all_predicates_having_PRE, $list_alt5, $list_alt6);
            register_cyc_api_function(ALL_GENL_PREDS_AMONG, $list_alt69, $str_alt70$Returns_those_genlPreds_of_PRED_t, $list_alt71, $list_alt6);
            register_cyc_api_function(ALL_NOT_GENL_PREDICATES, $list_alt3, $str_alt73$Returns_all_negated_genlPreds_of_, $list_alt5, $list_alt6);
            register_cyc_api_function(ALL_NOT_GENL_INVERSES, $list_alt3, $str_alt73$Returns_all_negated_genlPreds_of_, $list_alt5, $list_alt6);
            register_cyc_api_function(ALL_NOT_SPEC_PREDICATES, $list_alt3, $str_alt76$Returns_all_negated_specPreds_of_, $list_alt5, $list_alt6);
            register_cyc_api_function(ALL_NOT_SPEC_INVERSES, $list_alt3, $str_alt78$Returns_all_predicates_having_PRE, $list_alt5, $list_alt6);
            register_cyc_api_function(UNION_ALL_GENL_PREDICATES, $list_alt80, $str_alt81$Returns_all_genl_predicates_of_ea, $list_alt82, $list_alt6);
            register_cyc_api_function(UNION_ALL_SPEC_PREDICATES, $list_alt80, $str_alt84$Returns_all_spec_predicates_of_ea, $list_alt82, $list_alt6);
            register_cyc_api_function(UNION_ALL_GENL_INVERSES, $list_alt80, $str_alt86$Returns_all_genl_inverses_of_each, $list_alt82, $list_alt6);
            register_cyc_api_function(UNION_ALL_SPEC_INVERSES, $list_alt80, $str_alt88$Returns_all_specs_of_each_predica, $list_alt82, $list_alt6);
            register_cyc_api_function(MAP_ALL_GENL_PREDS, $list_alt91, $$$Apply_FN_to_each_genlPred_of_PRED, $list_alt93, NIL);
            register_cyc_api_function(SOME_ALL_GENL_PREDS, $list_alt91, $str_alt95$Apply_FN_to_each_genlPred_of_PRED, $list_alt93, NIL);
            register_cyc_api_function(SOME_ALL_GENL_INVERSES, $list_alt91, $str_alt95$Apply_FN_to_each_genlPred_of_PRED, $list_alt93, NIL);
            register_cyc_api_function(MAP_ALL_SPEC_PREDS, $list_alt91, $$$Apply_FN_to_each_genlPred_of_PRED, $list_alt93, NIL);
            register_cyc_api_function(SOME_ALL_SPEC_PREDS, $list_alt91, $str_alt95$Apply_FN_to_each_genlPred_of_PRED, $list_alt93, NIL);
            register_cyc_api_function(ALL_SPEC_PREDS_WRT_TYPE, $list_alt103, $str_alt104$Returns_those_all_spec_preds_of_P, $list_alt105, $list_alt6);
            register_cyc_api_function(ALL_SPEC_PREDS_WRT_ARG, $list_alt108, $str_alt109$Returns_those_all_spec_preds_of_P, $list_alt110, $list_alt6);
            register_cyc_api_function(MIN_PREDICATES, $list_alt80, $str_alt125$Returns_the_most_specific_predica, $list_alt82, $list_alt6);
            register_cyc_api_function(MAX_PREDICATES, $list_alt80, $str_alt127$Returns_the_most_general_predicat, $list_alt82, $list_alt6);
            register_cyc_api_function(MIN_CEILING_PREDICATES, $list_alt129, $str_alt130$Returns_the_most_specific_common_, $list_alt82, $list_alt6);
            register_cyc_api_function(MAX_FLOOR_PREDICATES, $list_alt129, $str_alt133$Returns_the_most_general_common_s, $list_alt82, $list_alt6);
            register_cyc_api_function($sym134$GENL_PREDICATE_, $list_alt135, $str_alt136$Is_GENL_a_genlPred_of_SPEC______a, $list_alt137, $list_alt138);
            register_cyc_api_function($sym141$SPEC_PREDICATE_, $list_alt142, $str_alt136$Is_GENL_a_genlPred_of_SPEC______a, $list_alt143, $list_alt138);
            register_cyc_api_function($sym144$GENL_INVERSE_, $list_alt135, $str_alt145$Is_GENL_a_genlInverse_of_SPEC____, $list_alt137, $list_alt138);
            register_cyc_api_function($sym146$SPEC_INVERSE_, $list_alt142, $str_alt145$Is_GENL_a_genlInverse_of_SPEC____, $list_alt137, $list_alt138);
            register_cyc_api_function($sym147$ANY_GENL_PREDICATE_, $list_alt148, $str_alt149$Returns_T_iff__genl_predicate__SP, $list_alt150, $list_alt138);
            register_cyc_api_function($sym151$NOT_GENL_PREDICATE_, $list_alt152, $str_alt153$Is_NOT_GENL_known_to_be_not_a_gen, $list_alt154, $list_alt138);
            register_cyc_api_function($sym155$NOT_GENL_INVERSE_, $list_alt152, $str_alt156$Is_NOT_GENL_a_negated_genlInverse, $list_alt154, $list_alt138);
            register_cyc_api_function($sym157$ANY_NOT_GENL_PREDICATE_, $list_alt158, $str_alt159$Is_any_predicate_in_NOT_GENLS_not, $list_alt160, $list_alt138);
            register_cyc_api_function($sym163$INTERSECTING_PREDICATES_, $list_alt164, $str_alt165$Does_the_extension_of_PRED1_inclu, $list_alt166, $list_alt138);
            register_cyc_api_function($sym167$WHY_GENL_PREDICATE_, $list_alt168, $str_alt169$A_justification_of__genlPreds_SPE, $list_alt137, $list_alt170);
            register_cyc_api_function($sym171$WHY_NOT_GENL_PREDICATE_, $list_alt168, $str_alt172$A_justification_of__not__genlPred, $list_alt137, $list_alt170);
            register_cyc_api_function($sym173$WHY_GENL_INVERSE_, $list_alt174, $str_alt175$A_justification_of__genlInverse_P, $list_alt176, $list_alt170);
            register_cyc_api_function($sym178$WHY_NOT_GENL_INVERSE_, $list_alt168, $str_alt179$A_justification_of__not__genlInve, $list_alt137, $list_alt170);
            register_cyc_api_function(MAX_FLOOR_MTS_OF_GENL_PREDICATE_PATHS, $list_alt182, $str_alt183$_return_listp__In_what__most_genl, $list_alt137, NIL);
            register_cyc_api_function(MAX_FLOOR_MTS_OF_GENL_INVERSE_PATHS, $list_alt185, $str_alt186$In_what__most_genl__mts_is_GENL_I, $list_alt187, NIL);
        }
        return NIL;
    }

    public static SubLObject setup_genl_predicates_file_Previous() {
        register_cyc_api_function(GENL_PREDICATES, $list3, $str4$Returns_the_local_genlPreds_of_PR, $list5, $list6);
        register_cyc_api_function(MIN_GENL_PREDICATES, $list3, $str8$Returns_the_most_specific_local_g, $list5, $list6);
        register_cyc_api_function(GENL_INVERSES, $list3, $str11$Returns_the_local_genlInverses_of, $list5, $list6);
        register_cyc_api_function(MIN_GENL_INVERSES, $list3, $str13$Returns_the_most_specific_local_g, $list5, $list6);
        register_cyc_api_function(NOT_GENL_PREDICATES, $list3, $str15$Returns_the_local_negated_genlPre, $list5, $list6);
        register_cyc_api_function(MAX_NOT_GENL_PREDICATES, $list3, $str17$Returns_the_most_general_local_ne, $list5, $list6);
        register_cyc_api_function(NOT_GENL_INVERSES, $list3, $str15$Returns_the_local_negated_genlPre, $list5, $list6);
        register_cyc_api_function(MAX_NOT_GENL_INVERSES, $list3, $str17$Returns_the_most_general_local_ne, $list5, $list6);
        register_cyc_api_function(SPEC_PREDICATES, $list3, $$$Returns_the_specPreds_of_PRED, $list5, $list6);
        register_cyc_api_function(MAX_SPEC_PREDICATES, $list3, $str23$Returns_the_most_general_specPred, $list5, $list6);
        register_cyc_api_function(SPEC_INVERSES, $list3, $$$Returns_the_specInverses_of_PRED, $list5, $list6);
        register_cyc_api_function(MAX_SPEC_INVERSES, $list3, $str27$Returns_the_most_general_specInve, $list5, $list6);
        register_cyc_api_function(NOT_SPEC_PREDICATES, $list3, $str29$Returns_the_negated_specPreds_of_, $list5, $list6);
        register_cyc_api_function(MIN_NOT_SPEC_PREDICATES, $list3, $str31$Returns_the_most_specific_negated, $list5, $list6);
        register_cyc_api_function(NOT_SPEC_INVERSES, $list3, $str31$Returns_the_most_specific_negated, $list5, $list6);
        register_cyc_api_function(MIN_NOT_SPEC_INVERSES, $list3, $str31$Returns_the_most_specific_negated, $list5, $list6);
        register_cyc_api_function(GENL_PREDICATE_SIBLINGS, $list3, $str35$Returns_the_direct___genlPreds_of, $list5, $list6);
        register_cyc_api_function(GENL_INVERSE_SIBLINGS, $list3, $str37$Returns_the_direct___genlInverse_, $list5, $list6);
        register_cyc_api_function(SPEC_PREDICATE_SIBLINGS, $list3, $str39$Returns_the_direct_spec_preds_of_, $list5, $list6);
        register_cyc_api_function(SPEC_INVERSE_SIBLINGS, $list3, $str41$Returns_the_direct_spec_inverses_, $list5, $list6);
        register_cyc_api_function(GENL_PREDICATE_ROOTS, $list3, $str43$Returns_the_most_general_genlPred, $list5, $list6);
        register_cyc_api_function(GENL_INVERSE_ROOTS, $list3, $str45$Returns_the_most_general_genlInve, $list5, $list6);
        register_cyc_api_function(ALL_GENL_PREDICATES, $list3, $str47$Returns_all_genlPreds_of_predicat, $list5, $list6);
        register_cyc_api_function(ALL_GENL_INVERSES, $list3, $str63$Returns_all_genlInverses_of_predi, $list5, $list6);
        register_cyc_api_function(ALL_SPEC_PREDICATES, $list3, $str65$Returns_all_predicates_having_PRE, $list5, $list6);
        register_cyc_api_function(ALL_SPEC_INVERSES, $list3, $str67$Returns_all_predicates_having_PRE, $list5, $list6);
        register_cyc_api_function(ALL_GENL_PREDS_AMONG, $list72, $str73$Returns_those_genlPreds_of_PRED_t, $list74, $list6);
        register_cyc_api_function(ALL_NOT_GENL_PREDICATES, $list3, $str76$Returns_all_negated_genlPreds_of_, $list5, $list6);
        register_cyc_api_function(ALL_NOT_GENL_INVERSES, $list3, $str76$Returns_all_negated_genlPreds_of_, $list5, $list6);
        register_cyc_api_function(ALL_NOT_SPEC_PREDICATES, $list3, $str79$Returns_all_negated_specPreds_of_, $list5, $list6);
        register_cyc_api_function(ALL_NOT_SPEC_INVERSES, $list3, $str81$Returns_all_predicates_having_PRE, $list5, $list6);
        register_cyc_api_function(UNION_ALL_GENL_PREDICATES, $list83, $str84$Returns_all_genl_predicates_of_ea, $list85, $list6);
        register_cyc_api_function(UNION_ALL_SPEC_PREDICATES, $list83, $str87$Returns_all_spec_predicates_of_ea, $list85, $list6);
        register_cyc_api_function(UNION_ALL_GENL_INVERSES, $list83, $str89$Returns_all_genl_inverses_of_each, $list85, $list6);
        register_cyc_api_function(UNION_ALL_SPEC_INVERSES, $list83, $str91$Returns_all_specs_of_each_predica, $list85, $list6);
        register_cyc_api_function(MAP_ALL_GENL_PREDS, $list94, $$$Apply_FN_to_each_genlPred_of_PRED, $list96, NIL);
        register_cyc_api_function(SOME_ALL_GENL_PREDS, $list94, $str98$Apply_FN_to_each_genlPred_of_PRED, $list96, NIL);
        register_cyc_api_function(SOME_ALL_GENL_INVERSES, $list94, $str98$Apply_FN_to_each_genlPred_of_PRED, $list96, NIL);
        register_cyc_api_function(MAP_ALL_SPEC_PREDS, $list94, $$$Apply_FN_to_each_genlPred_of_PRED, $list96, NIL);
        register_cyc_api_function(SOME_ALL_SPEC_PREDS, $list94, $str98$Apply_FN_to_each_genlPred_of_PRED, $list96, NIL);
        register_cyc_api_function(ALL_SPEC_PREDS_WRT_TYPE, $list106, $str107$Returns_those_all_spec_preds_of_P, $list108, $list6);
        register_cyc_api_function(ALL_SPEC_PREDS_WRT_ARG, $list111, $str112$Returns_those_all_spec_preds_of_P, $list113, $list6);
        register_cyc_api_function(MIN_PREDICATES, $list83, $str128$Returns_the_most_specific_predica, $list85, $list6);
        register_cyc_api_function(MAX_PREDICATES, $list83, $str130$Returns_the_most_general_predicat, $list85, $list6);
        register_cyc_api_function(MIN_CEILING_PREDICATES, $list132, $str133$Returns_the_most_specific_common_, $list85, $list6);
        register_cyc_api_function(MAX_FLOOR_PREDICATES, $list132, $str136$Returns_the_most_general_common_s, $list85, $list6);
        register_cyc_api_function($sym137$GENL_PREDICATE_, $list138, $str139$Is_GENL_a_genlPred_of_SPEC______a, $list140, $list141);
        register_cyc_api_function($sym144$SPEC_PREDICATE_, $list145, $str139$Is_GENL_a_genlPred_of_SPEC______a, $list146, $list141);
        register_cyc_api_function($sym147$GENL_INVERSE_, $list138, $str148$Is_GENL_a_genlInverse_of_SPEC____, $list140, $list141);
        register_cyc_api_function($sym149$SPEC_INVERSE_, $list145, $str148$Is_GENL_a_genlInverse_of_SPEC____, $list140, $list141);
        register_cyc_api_function($sym150$ANY_GENL_PREDICATE_, $list151, $str152$Returns_T_iff__genl_predicate__SP, $list153, $list141);
        register_cyc_api_function($sym154$NOT_GENL_PREDICATE_, $list155, $str156$Is_NOT_GENL_known_to_be_not_a_gen, $list157, $list141);
        register_cyc_api_function($sym158$NOT_GENL_INVERSE_, $list155, $str159$Is_NOT_GENL_a_negated_genlInverse, $list157, $list141);
        register_cyc_api_function($sym160$ANY_NOT_GENL_PREDICATE_, $list161, $str162$Is_any_predicate_in_NOT_GENLS_not, $list163, $list141);
        register_cyc_api_function($sym166$INTERSECTING_PREDICATES_, $list167, $str168$Does_the_extension_of_PRED1_inclu, $list169, $list141);
        register_cyc_api_function($sym170$WHY_GENL_PREDICATE_, $list171, $str172$A_justification_of__genlPreds_SPE, $list140, $list173);
        register_cyc_api_function($sym174$WHY_NOT_GENL_PREDICATE_, $list171, $str175$A_justification_of__not__genlPred, $list140, $list173);
        register_cyc_api_function($sym176$WHY_GENL_INVERSE_, $list177, $str178$A_justification_of__genlInverse_P, $list179, $list173);
        register_cyc_api_function($sym181$WHY_NOT_GENL_INVERSE_, $list171, $str182$A_justification_of__not__genlInve, $list140, $list173);
        register_cyc_api_function(MAX_FLOOR_MTS_OF_GENL_PREDICATE_PATHS, $list185, $str186$_return_listp__In_what__most_genl, $list140, NIL);
        register_cyc_api_function(MAX_FLOOR_MTS_OF_GENL_INVERSE_PATHS, $list188, $str189$In_what__most_genl__mts_is_GENL_I, $list190, NIL);
        memoization_state.note_globally_cached_function(CACHED_CANDIDATE_GENL_PREDS);
        memoization_state.note_globally_cached_function(CACHED_CANDIDATE_GENL_PREDS_IN_MT);
        register_kb_function(GENL_PREDICATE_AFTER_ADDING);
        register_kb_function(ADD_GENL_PREDICATE);
        register_kb_function(GENL_INVERSE_AFTER_ADDING);
        register_kb_function(ADD_GENL_INVERSE);
        register_kb_function(REMOVE_GENL_PREDICATE);
        register_kb_function(REMOVE_GENL_INVERSE);
        register_kb_function(GENL_PREDICATE_AFTER_REMOVING);
        register_kb_function(GENL_INVERSE_AFTER_REMOVING);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_genl_predicates_file();
    }

    @Override
    public void initializeVariables() {
        init_genl_predicates_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_genl_predicates_file();
    }

    static {
    }

    static private final SubLList $list_alt3 = list(makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    static private final SubLString $str_alt4$Returns_the_local_genlPreds_of_PR = makeString("Returns the local genlPreds of PRED");

    static private final SubLList $list_alt5 = list(list(makeSymbol("PRED"), makeSymbol("FORT-P")));

    static private final SubLList $list_alt6 = list(list(makeSymbol("LIST"), makeSymbol("FORT-P")));

    static private final SubLString $str_alt8$Returns_the_most_specific_local_g = makeString("Returns the most-specific local genlPreds of PRED");

    static private final SubLString $str_alt11$Returns_the_local_genlInverses_of = makeString("Returns the local genlInverses of PRED");

    static private final SubLString $str_alt13$Returns_the_most_specific_local_g = makeString("Returns the most-specific local genlInverses of PRED");

    static private final SubLString $str_alt15$Returns_the_local_negated_genlPre = makeString("Returns the local negated genlPreds of PRED");

    static private final SubLString $str_alt17$Returns_the_most_general_local_ne = makeString("Returns the most-general local negated genlPreds of PRED");

    static private final SubLString $str_alt23$Returns_the_most_general_specPred = makeString("Returns the most-general specPreds of PRED");

    static private final SubLString $str_alt27$Returns_the_most_general_specInve = makeString("Returns the most-general specInverses of PRED");

    static private final SubLString $str_alt29$Returns_the_negated_specPreds_of_ = makeString("Returns the negated specPreds of PRED");

    static private final SubLString $str_alt31$Returns_the_most_specific_negated = makeString("Returns the most-specific negated specPreds of PRED");

    static private final SubLString $str_alt35$Returns_the_direct___genlPreds_of = makeString("Returns the direct #$genlPreds of those predicates having direct spec-preds PRED");

    static private final SubLString $str_alt37$Returns_the_direct___genlInverse_ = makeString("Returns the direct #$genlInverse of those predicates having direct spec-inverses PRED");

    static private final SubLString $str_alt39$Returns_the_direct_spec_preds_of_ = makeString("Returns the direct spec-preds of those collections having direct #$genlPreds PRED");

    static private final SubLString $str_alt41$Returns_the_direct_spec_inverses_ = makeString("Returns the direct spec-inverses of those collections having direct #$genlInverse PRED");

    static private final SubLString $str_alt43$Returns_the_most_general_genlPred = makeString("Returns the most general genlPreds of PRED.");

    static private final SubLString $str_alt45$Returns_the_most_general_genlInve = makeString("Returns the most general genlInverses of PRED.");

    static private final SubLString $str_alt47$Returns_all_genlPreds_of_predicat = makeString("Returns all genlPreds of predicate PRED \n   (ascending transitive closure; inexpensive)");

    static private final SubLString $str_alt53$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $str_alt58$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    static private final SubLString $str_alt59$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    static private final SubLString $str_alt60$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    static private final SubLString $str_alt63$Returns_all_predicates_having_PRE = makeString("Returns all predicates having PRED as a genlPred \n   (descending transitive closure; expensive)");

    static private final SubLString $str_alt65$Returns_all_predicates_having_PRE = makeString("Returns all predicates having PRED as a genlInverse\n   (descending transitive closure; expensive)");

    static private final SubLList $list_alt69 = list(makeSymbol("PRED"), makeSymbol("CANDIDATES"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    static private final SubLString $str_alt70$Returns_those_genlPreds_of_PRED_t = makeString("Returns those genlPreds of PRED that are included among CANDIDATEs");

    static private final SubLList $list_alt71 = list(list(makeSymbol("PRED"), makeSymbol("EL-FORT-P")), list(makeSymbol("CANDIDATES"), makeSymbol("LISTP")));

    static private final SubLString $str_alt73$Returns_all_negated_genlPreds_of_ = makeString("Returns all negated genlPreds of predicate PRED \n   (descending transitive closure; expensive)");

    static private final SubLString $str_alt76$Returns_all_negated_specPreds_of_ = makeString("Returns all negated specPreds of predicate PRED \n   (ascending transitive closure; inexpensive)");

    static private final SubLString $str_alt78$Returns_all_predicates_having_PRE = makeString("Returns all predicates having PRED as a negated genlInverse\n   (ascending transitive closure; inexpensive)");

    static private final SubLList $list_alt80 = list(makeSymbol("PREDS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    static private final SubLString $str_alt81$Returns_all_genl_predicates_of_ea = makeString("Returns all genl-predicates of each predicate in PREDS");

    static private final SubLList $list_alt82 = list(list(makeSymbol("PREDS"), makeSymbol("LISTP")));

    static private final SubLString $str_alt84$Returns_all_spec_predicates_of_ea = makeString("Returns all spec-predicates of each predicate in PREDS");

    static private final SubLString $str_alt86$Returns_all_genl_inverses_of_each = makeString("Returns all genl-inverses of each predicate in PREDS");

    static private final SubLString $str_alt88$Returns_all_specs_of_each_predica = makeString("Returns all specs of each predicate in PREDS");

    static private final SubLList $list_alt91 = list(makeSymbol("PRED"), makeSymbol("FN"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    static private final SubLList $list_alt93 = list(list(makeSymbol("PRED"), makeSymbol("FORT-P")), list(makeSymbol("FN"), makeSymbol("FUNCTION-SPEC-P")));

    static private final SubLString $str_alt95$Apply_FN_to_each_genlPred_of_PRED = makeString("Apply FN to each genlPred of PRED until FN returns a non-nil result");

    static private final SubLList $list_alt103 = list(makeSymbol("PRED"), makeSymbol("COL"), makeSymbol("ARG"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    static private final SubLString $str_alt104$Returns_those_all_spec_preds_of_P = makeString("Returns those all-spec-preds of PRED for which instances \nof COL are legal in arguments in position ARG");

    static private final SubLList $list_alt105 = list(list(makeSymbol("PRED"), makeSymbol("FORT-P")), list(makeSymbol("COL"), makeSymbol("FORT-P")), list(makeSymbol("ARG"), makeSymbol("INTEGERP")));

    static private final SubLList $list_alt108 = list(makeSymbol("PRED"), makeSymbol("FORT"), makeSymbol("ARG"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    static private final SubLString $str_alt109$Returns_those_all_spec_preds_of_P = makeString("Returns those all-spec-preds of PRED for which FORT\nis legal as arguments in position ARG");

    static private final SubLList $list_alt110 = list(list(makeSymbol("PRED"), makeSymbol("FORT-P")), list(makeSymbol("FORT"), makeSymbol("FORT-P")), list(makeSymbol("ARG"), makeSymbol("INTEGERP")));

    static private final SubLList $list_alt111 = list(makeSymbol("ALIST"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt114 = list(list(makeSymbol("*SBHL-ARG-TYPE-GENLS-STORES*"), list(makeSymbol("NEW-DICTIONARY"), list(QUOTE, EQUAL))));

    static private final SubLString $str_alt125$Returns_the_most_specific_predica = makeString("Returns the most-specific predicates in PREDS");

    static private final SubLString $str_alt127$Returns_the_most_general_predicat = makeString("Returns the most-general predicates in PREDS");

    static private final SubLList $list_alt129 = list(makeSymbol("PREDS"), makeSymbol("&OPTIONAL"), makeSymbol("CANDIDATES"), makeSymbol("MT"), makeSymbol("TV"));

    static private final SubLString $str_alt130$Returns_the_most_specific_common_ = makeString("Returns the most-specific common generalizations (ceilings) of PREDS");

    static private final SubLList $list_alt131 = list(makeSymbol("PRED1"), makeSymbol("PRED2"));

    static private final SubLString $str_alt133$Returns_the_most_general_common_s = makeString("Returns the most-general common specializations (floors) of PREDS");

    static private final SubLSymbol $sym134$GENL_PREDICATE_ = makeSymbol("GENL-PREDICATE?");

    static private final SubLList $list_alt135 = list(makeSymbol("SPEC"), makeSymbol("GENL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    static private final SubLString $str_alt136$Is_GENL_a_genlPred_of_SPEC______a = makeString("Is GENL a genlPred of SPEC?\n   (ascending transitive search; inexpensive)");

    static private final SubLList $list_alt137 = list(list(makeSymbol("SPEC"), makeSymbol("FORT-P")), list(makeSymbol("GENL"), makeSymbol("FORT-P")));

    static private final SubLList $list_alt138 = list(makeSymbol("BOOLEANP"));

    static private final SubLSymbol $sym141$SPEC_PREDICATE_ = makeSymbol("SPEC-PREDICATE?");

    static private final SubLList $list_alt142 = list(makeSymbol("GENL"), makeSymbol("SPEC"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    static private final SubLList $list_alt143 = list(list(makeSymbol("GENL"), makeSymbol("FORT-P")), list(makeSymbol("SPEC"), makeSymbol("FORT-P")));

    static private final SubLSymbol $sym144$GENL_INVERSE_ = makeSymbol("GENL-INVERSE?");

    static private final SubLString $str_alt145$Is_GENL_a_genlInverse_of_SPEC____ = makeString("Is GENL a genlInverse of SPEC?\n   (ascending transitive search; inexpensive)");

    static private final SubLSymbol $sym146$SPEC_INVERSE_ = makeSymbol("SPEC-INVERSE?");

    static private final SubLSymbol $sym147$ANY_GENL_PREDICATE_ = makeSymbol("ANY-GENL-PREDICATE?");

    static private final SubLList $list_alt148 = list(makeSymbol("SPEC"), makeSymbol("GENLS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    static private final SubLString $str_alt149$Returns_T_iff__genl_predicate__SP = makeString("Returns T iff (genl-predicate? SPEC GENL) for some genl in GENLS\n   (ascending transitive search; inexpensive)");

    static private final SubLList $list_alt150 = list(list(makeSymbol("SPEC"), makeSymbol("FORT-P")), list(makeSymbol("GENLS"), makeSymbol("LISTP")));

    static private final SubLSymbol $sym151$NOT_GENL_PREDICATE_ = makeSymbol("NOT-GENL-PREDICATE?");

    static private final SubLList $list_alt152 = list(makeSymbol("SPEC"), makeSymbol("NOT-GENL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    static private final SubLString $str_alt153$Is_NOT_GENL_known_to_be_not_a_gen = makeString("Is NOT-GENL known to be not a genlPred of SPEC?\n   (descending transitive search; expensive)");

    static private final SubLList $list_alt154 = list(list(makeSymbol("SPEC"), makeSymbol("FORT-P")), list(makeSymbol("NOT-GENL"), makeSymbol("FORT-P")));

    static private final SubLSymbol $sym155$NOT_GENL_INVERSE_ = makeSymbol("NOT-GENL-INVERSE?");

    static private final SubLString $str_alt156$Is_NOT_GENL_a_negated_genlInverse = makeString("Is NOT-GENL a negated genlInverse of SPEC?\n   (descending transitive search; expensive)");

    static private final SubLSymbol $sym157$ANY_NOT_GENL_PREDICATE_ = makeSymbol("ANY-NOT-GENL-PREDICATE?");

    static private final SubLList $list_alt158 = list(makeSymbol("PRED"), makeSymbol("NOT-GENLS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    static private final SubLString $str_alt159$Is_any_predicate_in_NOT_GENLS_not = makeString("Is any predicate in NOT-GENLS not a genlPred of PRED?\n   (descending transitive search; expensive)");

    static private final SubLList $list_alt160 = list(list(makeSymbol("PRED"), makeSymbol("FORT-P")), list(makeSymbol("NOT-GENLS"), makeSymbol("LISTP")));

    static private final SubLSymbol $sym163$INTERSECTING_PREDICATES_ = makeSymbol("INTERSECTING-PREDICATES?");

    static private final SubLList $list_alt164 = list(makeSymbol("PRED1"), makeSymbol("PRED2"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));

    static private final SubLString $str_alt165$Does_the_extension_of_PRED1_inclu = makeString("Does the extension of PRED1 include some tuple in the extension of PRED2?");

    static private final SubLList $list_alt166 = list(list(makeSymbol("PRED1"), makeSymbol("FORT-P")), list(makeSymbol("PRED2"), makeSymbol("FORT-P")));

    static private final SubLSymbol $sym167$WHY_GENL_PREDICATE_ = makeSymbol("WHY-GENL-PREDICATE?");

    static private final SubLList $list_alt168 = list(makeSymbol("SPEC"), makeSymbol("GENL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("BEHAVIOR"));

    static private final SubLString $str_alt169$A_justification_of__genlPreds_SPE = makeString("A justification of (genlPreds SPEC GENL)");

    static private final SubLList $list_alt170 = list(makeSymbol("LISTP"));

    static private final SubLSymbol $sym171$WHY_NOT_GENL_PREDICATE_ = makeSymbol("WHY-NOT-GENL-PREDICATE?");

    static private final SubLString $str_alt172$A_justification_of__not__genlPred = makeString("A justification of (not (genlPreds SPEC GENL))");

    static private final SubLSymbol $sym173$WHY_GENL_INVERSE_ = makeSymbol("WHY-GENL-INVERSE?");

    static private final SubLList $list_alt174 = list(makeSymbol("PRED"), makeSymbol("GENL-INVERSE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("BEHAVIOR"));

    static private final SubLString $str_alt175$A_justification_of__genlInverse_P = makeString("A justification of (genlInverse PRED GENL-INVERSE)");

    static private final SubLList $list_alt176 = list(list(makeSymbol("PRED"), makeSymbol("FORT-P")), list(makeSymbol("GENL-INVERSE"), makeSymbol("FORT-P")));

    static private final SubLSymbol $sym178$WHY_NOT_GENL_INVERSE_ = makeSymbol("WHY-NOT-GENL-INVERSE?");

    static private final SubLString $str_alt179$A_justification_of__not__genlInve = makeString("A justification of (not (genlInverse SPEC GENL)");

    static private final SubLList $list_alt182 = list(makeSymbol("SPEC"), makeSymbol("GENL"), makeSymbol("&OPTIONAL"), makeSymbol("TV"));

    static private final SubLString $str_alt183$_return_listp__In_what__most_genl = makeString("@return listp; In what (most-genl) mts is GENL a genlPred of SPEC?");

    static private final SubLList $list_alt185 = list(makeSymbol("SPEC"), makeSymbol("GENL-INVERSE"), makeSymbol("&OPTIONAL"), makeSymbol("TV"));

    static private final SubLString $str_alt186$In_what__most_genl__mts_is_GENL_I = makeString("In what (most-genl) mts is GENL-INVERSE a genlInverse of SPEC?");

    static private final SubLList $list_alt187 = list(list(makeSymbol("SPEC"), makeSymbol("FORT-P")), list(makeSymbol("GENL-INVERSE"), makeSymbol("FORT-P")));

    public static final SubLSymbol $kw191$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
}

/**
 * Total time: 2153 ms synthetic
 */
