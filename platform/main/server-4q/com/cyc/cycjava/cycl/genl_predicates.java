package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.valid_arity_p;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

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
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class genl_predicates extends SubLTranslatedFile {
    public static final SubLFile me = new genl_predicates();

    public static final String myName = "com.cyc.cycjava.cycl.genl_predicates";

    public static final String myFingerPrint = "7a487269490a959e8a8822b6e7f1a7d89971370e1bc7e14485fe27ff86b5b654";



    // defparameter
    /**
     * Precomputed all-genls of each of the constraint collections for leaf
     * predicate wrt arg-type searches.
     */
    private static final SubLSymbol $sbhl_arg_type_genls_stores$ = makeSymbol("*SBHL-ARG-TYPE-GENLS-STORES*");







    private static final SubLObject $$genlPreds = reader_make_constant_shell(makeString("genlPreds"));

    public static final SubLSymbol GENL_PREDICATES = makeSymbol("GENL-PREDICATES");

    public static final SubLList $list3 = list(makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    public static final SubLString $str4$Returns_the_local_genlPreds_of_PR = makeString("Returns the local genlPreds of PRED");

    public static final SubLList $list5 = list(list(makeSymbol("PRED"), makeSymbol("FORT-P")));

    public static final SubLList $list6 = list(list(makeSymbol("LIST"), makeSymbol("FORT-P")));

    public static final SubLSymbol MIN_GENL_PREDICATES = makeSymbol("MIN-GENL-PREDICATES");

    public static final SubLString $str8$Returns_the_most_specific_local_g = makeString("Returns the most-specific local genlPreds of PRED");

    private static final SubLObject $$genlInverse = reader_make_constant_shell(makeString("genlInverse"));

    public static final SubLSymbol GENL_INVERSES = makeSymbol("GENL-INVERSES");

    public static final SubLString $str11$Returns_the_local_genlInverses_of = makeString("Returns the local genlInverses of PRED");

    public static final SubLSymbol MIN_GENL_INVERSES = makeSymbol("MIN-GENL-INVERSES");

    public static final SubLString $str13$Returns_the_most_specific_local_g = makeString("Returns the most-specific local genlInverses of PRED");

    public static final SubLSymbol NOT_GENL_PREDICATES = makeSymbol("NOT-GENL-PREDICATES");

    public static final SubLString $str15$Returns_the_local_negated_genlPre = makeString("Returns the local negated genlPreds of PRED");

    public static final SubLSymbol MAX_NOT_GENL_PREDICATES = makeSymbol("MAX-NOT-GENL-PREDICATES");

    public static final SubLString $str17$Returns_the_most_general_local_ne = makeString("Returns the most-general local negated genlPreds of PRED");

    public static final SubLSymbol NOT_GENL_INVERSES = makeSymbol("NOT-GENL-INVERSES");

    public static final SubLSymbol MAX_NOT_GENL_INVERSES = makeSymbol("MAX-NOT-GENL-INVERSES");

    public static final SubLSymbol SPEC_PREDICATES = makeSymbol("SPEC-PREDICATES");

    public static final SubLString $$$Returns_the_specPreds_of_PRED = makeString("Returns the specPreds of PRED");

    public static final SubLSymbol MAX_SPEC_PREDICATES = makeSymbol("MAX-SPEC-PREDICATES");

    public static final SubLString $str23$Returns_the_most_general_specPred = makeString("Returns the most-general specPreds of PRED");

    public static final SubLSymbol SPEC_INVERSES = makeSymbol("SPEC-INVERSES");

    public static final SubLString $$$Returns_the_specInverses_of_PRED = makeString("Returns the specInverses of PRED");

    public static final SubLSymbol MAX_SPEC_INVERSES = makeSymbol("MAX-SPEC-INVERSES");

    public static final SubLString $str27$Returns_the_most_general_specInve = makeString("Returns the most-general specInverses of PRED");

    public static final SubLSymbol NOT_SPEC_PREDICATES = makeSymbol("NOT-SPEC-PREDICATES");

    public static final SubLString $str29$Returns_the_negated_specPreds_of_ = makeString("Returns the negated specPreds of PRED");

    public static final SubLSymbol MIN_NOT_SPEC_PREDICATES = makeSymbol("MIN-NOT-SPEC-PREDICATES");

    public static final SubLString $str31$Returns_the_most_specific_negated = makeString("Returns the most-specific negated specPreds of PRED");

    public static final SubLSymbol NOT_SPEC_INVERSES = makeSymbol("NOT-SPEC-INVERSES");

    public static final SubLSymbol MIN_NOT_SPEC_INVERSES = makeSymbol("MIN-NOT-SPEC-INVERSES");

    public static final SubLSymbol GENL_PREDICATE_SIBLINGS = makeSymbol("GENL-PREDICATE-SIBLINGS");

    public static final SubLString $str35$Returns_the_direct___genlPreds_of = makeString("Returns the direct #$genlPreds of those predicates having direct spec-preds PRED");

    public static final SubLSymbol GENL_INVERSE_SIBLINGS = makeSymbol("GENL-INVERSE-SIBLINGS");

    public static final SubLString $str37$Returns_the_direct___genlInverse_ = makeString("Returns the direct #$genlInverse of those predicates having direct spec-inverses PRED");

    public static final SubLSymbol SPEC_PREDICATE_SIBLINGS = makeSymbol("SPEC-PREDICATE-SIBLINGS");

    public static final SubLString $str39$Returns_the_direct_spec_preds_of_ = makeString("Returns the direct spec-preds of those collections having direct #$genlPreds PRED");

    public static final SubLSymbol SPEC_INVERSE_SIBLINGS = makeSymbol("SPEC-INVERSE-SIBLINGS");

    public static final SubLString $str41$Returns_the_direct_spec_inverses_ = makeString("Returns the direct spec-inverses of those collections having direct #$genlInverse PRED");

    public static final SubLSymbol GENL_PREDICATE_ROOTS = makeSymbol("GENL-PREDICATE-ROOTS");

    public static final SubLString $str43$Returns_the_most_general_genlPred = makeString("Returns the most general genlPreds of PRED.");

    public static final SubLSymbol GENL_INVERSE_ROOTS = makeSymbol("GENL-INVERSE-ROOTS");

    public static final SubLString $str45$Returns_the_most_general_genlInve = makeString("Returns the most general genlInverses of PRED.");

    public static final SubLSymbol ALL_GENL_PREDICATES = makeSymbol("ALL-GENL-PREDICATES");

    public static final SubLString $str47$Returns_all_genlPreds_of_predicat = makeString("Returns all genlPreds of predicate PRED \n   (ascending transitive closure; inexpensive)");











    public static final SubLString $str53$_A_is_not_a__A = makeString("~A is not a ~A");





    public static final SubLString $$$continue_anyway = makeString("continue anyway");



    public static final SubLString $str58$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLString $str59$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str60$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLString $str61$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    private static final SubLSymbol ALL_GENL_INVERSES = makeSymbol("ALL-GENL-INVERSES");

    private static final SubLString $str63$Returns_all_genlInverses_of_predi = makeString("Returns all genlInverses of predicate PRED \n   (ascending transitive closure; inexpensive)");

    private static final SubLSymbol ALL_SPEC_PREDICATES = makeSymbol("ALL-SPEC-PREDICATES");

    public static final SubLString $str65$Returns_all_predicates_having_PRE = makeString("Returns all predicates having PRED as a genlPred \n   (descending transitive closure; expensive)");

    private static final SubLSymbol ALL_SPEC_INVERSES = makeSymbol("ALL-SPEC-INVERSES");

    private static final SubLString $str67$Returns_all_predicates_having_PRE = makeString("Returns all predicates having PRED as a genlInverse\n   (descending transitive closure; expensive)");

    private static final SubLObject $$InverseBinaryPredicateFn = reader_make_constant_shell(makeString("InverseBinaryPredicateFn"));





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

    public static final SubLString $$$Apply_FN_to_each_genlPred_of_PRED = makeString("Apply FN to each genlPred of PRED");

    private static final SubLList $list96 = list(list(makeSymbol("PRED"), makeSymbol("FORT-P")), list(makeSymbol("FN"), makeSymbol("FUNCTION-SPEC-P")));

    private static final SubLSymbol SOME_ALL_GENL_PREDS = makeSymbol("SOME-ALL-GENL-PREDS");

    private static final SubLString $str98$Apply_FN_to_each_genlPred_of_PRED = makeString("Apply FN to each genlPred of PRED until FN returns a non-nil result");

    private static final SubLSymbol SOME_ALL_GENL_INVERSES = makeSymbol("SOME-ALL-GENL-INVERSES");

    private static final SubLSymbol MAP_ALL_SPEC_PREDS = makeSymbol("MAP-ALL-SPEC-PREDS");

    private static final SubLSymbol SOME_ALL_SPEC_PREDS = makeSymbol("SOME-ALL-SPEC-PREDS");



    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLSymbol GATHER_IF_SEARCHED_ARG_CONSTRAINTS = makeSymbol("GATHER-IF-SEARCHED-ARG-CONSTRAINTS");

    private static final SubLSymbol ALL_SPEC_PREDS_WRT_TYPE = makeSymbol("ALL-SPEC-PREDS-WRT-TYPE");

    private static final SubLList $list106 = list(makeSymbol("PRED"), makeSymbol("COL"), makeSymbol("ARG"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLString $str107$Returns_those_all_spec_preds_of_P = makeString("Returns those all-spec-preds of PRED for which instances \nof COL are legal in arguments in position ARG");

    public static final SubLList $list108 = list(list(makeSymbol("PRED"), makeSymbol("FORT-P")), list(makeSymbol("COL"), makeSymbol("FORT-P")), list(makeSymbol("ARG"), makeSymbol("INTEGERP")));

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLSymbol ALL_SPEC_PREDS_WRT_ARG = makeSymbol("ALL-SPEC-PREDS-WRT-ARG");

    public static final SubLList $list111 = list(makeSymbol("PRED"), makeSymbol("FORT"), makeSymbol("ARG"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLString $str112$Returns_those_all_spec_preds_of_P = makeString("Returns those all-spec-preds of PRED for which FORT\nis legal as arguments in position ARG");

    private static final SubLList $list113 = list(list(makeSymbol("PRED"), makeSymbol("FORT-P")), list(makeSymbol("FORT"), makeSymbol("FORT-P")), list(makeSymbol("ARG"), makeSymbol("INTEGERP")));

    public static final SubLList $list114 = list(makeSymbol("ALIST"), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLSymbol $sbhl_arg_type_alist$ = makeSymbol("*SBHL-ARG-TYPE-ALIST*");

    private static final SubLList $list117 = list(list(makeSymbol("*SBHL-ARG-TYPE-GENLS-STORES*"), list(makeSymbol("NEW-DICTIONARY"), list(makeSymbol("QUOTE"), EQUAL))));

    private static final SubLSymbol SBHL_INITIALIZE_ARG_TYPE_GENLS_STORES = makeSymbol("SBHL-INITIALIZE-ARG-TYPE-GENLS-STORES");

    private static final SubLSymbol SBHL_ARG_TYPES_ALIST_SATISFIED_P = makeSymbol("SBHL-ARG-TYPES-ALIST-SATISFIED-P");

    private static final SubLObject $$typedGenlPreds = reader_make_constant_shell(makeString("typedGenlPreds"));





    private static final SubLObject $$typedGenlInverse = reader_make_constant_shell(makeString("typedGenlInverse"));

    private static final SubLObject $$True_JustificationTruth = reader_make_constant_shell(makeString("True-JustificationTruth"));





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

    public static final SubLList $list138 = list(makeSymbol("SPEC"), makeSymbol("GENL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLString $str139$Is_GENL_a_genlPred_of_SPEC______a = makeString("Is GENL a genlPred of SPEC?\n   (ascending transitive search; inexpensive)");

    private static final SubLList $list140 = list(list(makeSymbol("SPEC"), makeSymbol("FORT-P")), list(makeSymbol("GENL"), makeSymbol("FORT-P")));

    private static final SubLList $list141 = list(makeSymbol("BOOLEANP"));



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

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

    private static final SubLObject $$genlMt = reader_make_constant_shell(makeString("genlMt"));

    private static final SubLSymbol $sym181$WHY_NOT_GENL_INVERSE_ = makeSymbol("WHY-NOT-GENL-INVERSE?");

    private static final SubLString $str182$A_justification_of__not__genlInve = makeString("A justification of (not (genlInverse SPEC GENL)");



    private static final SubLSymbol MAX_FLOOR_MTS_OF_GENL_PREDICATE_PATHS = makeSymbol("MAX-FLOOR-MTS-OF-GENL-PREDICATE-PATHS");

    public static final SubLList $list185 = list(makeSymbol("SPEC"), makeSymbol("GENL"), makeSymbol("&OPTIONAL"), makeSymbol("TV"));

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

    public static SubLObject all_genl_preds(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return all_genl_predicates(pred, mt, tv);
    }

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

    public static SubLObject all_spec_preds(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return all_spec_predicates(pred, mt, tv);
    }

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

    public static SubLObject all_proper_genl_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return delete(pred, all_genl_predicates(pred, mt, tv), symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject all_proper_genl_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return delete(pred, all_genl_inverses(pred, mt, tv), symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject all_proper_genl_predicates_and_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return delete(pred, all_genl_predicates_and_inverses(pred, mt, tv), symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject all_proper_spec_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return delete(pred, all_spec_predicates(pred, mt, tv), symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject all_proper_spec_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return delete(pred, all_spec_inverses(pred, mt, tv), symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject all_proper_spec_predicates_and_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return delete(pred, all_spec_predicates_and_inverses(pred, mt, tv), symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

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

    public static SubLObject all_spec_predicates_among(final SubLObject genl_pred, final SubLObject spec_candidates, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_all_backward_true_nodes_among(sbhl_module_vars.get_sbhl_module($$genlPreds), genl_pred, spec_candidates, mt, tv);
    }

    public static SubLObject all_genl_inverses_among(final SubLObject pred, final SubLObject candidates, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_all_forward_true_nodes_among(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, candidates, mt, tv);
    }

    public static SubLObject all_spec_inverses_among(final SubLObject genl_pred, final SubLObject spec_candidates, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return keyhash_utilities.fast_intersection(all_spec_inverses(genl_pred, mt, tv), spec_candidates, symbol_function(EQ), UNPROVIDED, UNPROVIDED);
    }

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

    public static SubLObject all_not_genl_preds(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return all_not_genl_predicates(pred, mt, tv);
    }

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

    public static SubLObject all_not_spec_preds(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return all_not_spec_predicates(pred, mt, tv);
    }

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

    public static SubLObject some_all_genl_preds_and_inverses(final SubLObject pred, final SubLObject fn, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_simply_gather_first_among_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, fn, mt, tv, UNPROVIDED);
    }

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

    public static SubLObject map_spec_preds(final SubLObject pred, final SubLObject fn, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return map_all_spec_preds(pred, fn, mt, UNPROVIDED);
    }

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

    public static SubLObject some_all_spec_preds_and_inverses(final SubLObject pred, final SubLObject fn, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_simply_gather_first_among_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, fn, mt, tv, UNPROVIDED);
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

    public static SubLObject count_all_genl_predicates_and_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return length(all_genl_predicates_and_inverses(pred, mt, tv));
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

    public static SubLObject count_all_spec_predicates_and_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return length(all_spec_predicates_and_inverses(pred, mt, tv));
    }

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

    public static SubLObject get_sbhl_arg_type_alist() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_arg_type_alist$.getDynamicValue(thread);
    }

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

    public static SubLObject get_sbhl_arg_type_store(final SubLObject key_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return dictionary.dictionary_lookup($sbhl_arg_type_genls_stores$.getDynamicValue(thread), key_list, UNPROVIDED);
    }

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

    public static SubLObject sbhl_add_leaf_predicates_to_result(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != sbhl_search_vars.genl_inverse_mode_p()) {
            sbhl_search_vars.$sbhl_result$.setDynamicValue(list_utilities.assoc_pushnew(sbhl_module_vars.get_sbhl_module($$genlInverse), node, sbhl_search_vars.$sbhl_result$.getDynamicValue(thread), UNPROVIDED), thread);
        } else {
            sbhl_search_vars.$sbhl_result$.setDynamicValue(list_utilities.assoc_pushnew(sbhl_module_vars.get_sbhl_module($$genlPreds), node, sbhl_search_vars.$sbhl_result$.getDynamicValue(thread), UNPROVIDED), thread);
        }
        return NIL;
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

    public static SubLObject min_predicates(final SubLObject preds, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(preds, LISTP);
        return sbhl_search_methods.sbhl_min_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), preds, mt, tv);
    }

    public static SubLObject max_predicates(final SubLObject preds, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(preds, LISTP);
        return sbhl_search_methods.sbhl_max_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), preds, mt, tv, UNPROVIDED);
    }

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
    }

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
    }

    public static SubLObject some_spec_predicate_or_inverse_somewhereP(final SubLObject pred) {
        return makeBoolean((NIL != somewhere_cache.some_pred_assertion_somewhereP($$genlPreds, pred, TWO_INTEGER, UNPROVIDED)) || (NIL != somewhere_cache.some_pred_assertion_somewhereP($$genlInverse, pred, TWO_INTEGER, UNPROVIDED)));
    }

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
    }

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

    public static SubLObject genl_predP(final SubLObject spec, final SubLObject genl, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return genl_predicateP(spec, genl, mt, tv);
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
    }

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
    }

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
    }

    public static SubLObject genl_predicate_ofP(final SubLObject genl, final SubLObject spec, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_inverse_relation_p(sbhl_module_vars.get_sbhl_module($$genlPreds), genl, spec, mt, tv);
    }

    public static SubLObject genl_inverse_ofP(final SubLObject genl, final SubLObject spec, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_inverse_relation_p(sbhl_module_vars.get_sbhl_module($$genlInverse), genl, spec, mt, tv);
    }

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
    }

    public static SubLObject any_genl_inverseP(final SubLObject spec, final SubLObject v_genls, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return NIL == v_genls ? NIL : NIL != list_utilities.singletonP(v_genls) ? genl_inverseP(spec, v_genls.first(), mt, tv) : sbhl_search_methods.sbhl_predicate_relation_with_any_p(sbhl_module_vars.get_sbhl_module($$genlInverse), spec, v_genls, mt, tv);
    }

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

    public static SubLObject not_spec_predicateP(final SubLObject genl, final SubLObject spec, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return not_genl_predicateP(spec, genl, mt, tv);
    }

    public static SubLObject argue_not_genl_predicateP(final SubLObject pred, final SubLObject not_genl, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_implied_relations.sbhl_argumentation_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, not_genl, mt, tv);
    }

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
    }

    public static SubLObject not_spec_inverseP(final SubLObject genl, final SubLObject spec, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return not_genl_inverseP(spec, genl, mt, UNPROVIDED);
    }

    public static SubLObject argue_not_genl_inverseP(final SubLObject pred, final SubLObject not_genl, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_implied_relations.sbhl_argumentation_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, not_genl, mt, tv);
    }

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
    }

    public static SubLObject random_genl_predicate_of(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != forts.fort_p(pred) : "forts.fort_p(pred) " + "CommonSymbols.NIL != forts.fort_p(pred) " + pred;
        if (((NIL != mt) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == hlmt.hlmt_p(mt))) {
            throw new AssertionError(mt);
        }
        if (((NIL != tv) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == enumeration_types.tv_p(tv))) {
            throw new AssertionError(tv);
        }
        return list_utilities.random_element(all_genl_predicates(pred, mt, tv));
    }

    public static SubLObject random_spec_predicate_of(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != forts.fort_p(pred) : "forts.fort_p(pred) " + "CommonSymbols.NIL != forts.fort_p(pred) " + pred;
        if (((NIL != mt) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == hlmt.hlmt_p(mt))) {
            throw new AssertionError(mt);
        }
        if (((NIL != tv) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == enumeration_types.tv_p(tv))) {
            throw new AssertionError(tv);
        }
        return list_utilities.random_element(all_spec_predicates(pred, mt, tv));
    }

    public static SubLObject random_proper_genl_predicate_of(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != forts.fort_p(pred) : "forts.fort_p(pred) " + "CommonSymbols.NIL != forts.fort_p(pred) " + pred;
        if (((NIL != mt) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == hlmt.hlmt_p(mt))) {
            throw new AssertionError(mt);
        }
        if (((NIL != tv) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == enumeration_types.tv_p(tv))) {
            throw new AssertionError(tv);
        }
        return list_utilities.random_element(all_proper_genl_predicates(pred, mt, tv));
    }

    public static SubLObject random_proper_spec_predicate_of(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != forts.fort_p(pred) : "forts.fort_p(pred) " + "CommonSymbols.NIL != forts.fort_p(pred) " + pred;
        if (((NIL != mt) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == hlmt.hlmt_p(mt))) {
            throw new AssertionError(mt);
        }
        if (((NIL != tv) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == enumeration_types.tv_p(tv))) {
            throw new AssertionError(tv);
        }
        return list_utilities.random_element(all_proper_spec_predicates(pred, mt, tv));
    }

    public static SubLObject random_genl_inverse_of(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != forts.fort_p(pred) : "forts.fort_p(pred) " + "CommonSymbols.NIL != forts.fort_p(pred) " + pred;
        if (((NIL != mt) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == hlmt.hlmt_p(mt))) {
            throw new AssertionError(mt);
        }
        if (((NIL != tv) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == enumeration_types.tv_p(tv))) {
            throw new AssertionError(tv);
        }
        return list_utilities.random_element(all_genl_inverses(pred, mt, tv));
    }

    public static SubLObject random_spec_inverse_of(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != forts.fort_p(pred) : "forts.fort_p(pred) " + "CommonSymbols.NIL != forts.fort_p(pred) " + pred;
        if (((NIL != mt) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == hlmt.hlmt_p(mt))) {
            throw new AssertionError(mt);
        }
        if (((NIL != tv) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == enumeration_types.tv_p(tv))) {
            throw new AssertionError(tv);
        }
        return list_utilities.random_element(all_spec_inverses(pred, mt, tv));
    }

    public static SubLObject random_proper_genl_inverse_of(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != forts.fort_p(pred) : "forts.fort_p(pred) " + "CommonSymbols.NIL != forts.fort_p(pred) " + pred;
        if (((NIL != mt) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == hlmt.hlmt_p(mt))) {
            throw new AssertionError(mt);
        }
        if (((NIL != tv) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == enumeration_types.tv_p(tv))) {
            throw new AssertionError(tv);
        }
        return list_utilities.random_element(all_proper_genl_inverses(pred, mt, tv));
    }

    public static SubLObject random_proper_spec_inverse_of(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != forts.fort_p(pred) : "forts.fort_p(pred) " + "CommonSymbols.NIL != forts.fort_p(pred) " + pred;
        if (((NIL != mt) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == hlmt.hlmt_p(mt))) {
            throw new AssertionError(mt);
        }
        if (((NIL != tv) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == enumeration_types.tv_p(tv))) {
            throw new AssertionError(tv);
        }
        return list_utilities.random_element(all_proper_spec_inverses(pred, mt, tv));
    }

    public static SubLObject random_genl_predicate_or_inverse_of(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != forts.fort_p(pred) : "forts.fort_p(pred) " + "CommonSymbols.NIL != forts.fort_p(pred) " + pred;
        if (((NIL != mt) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == hlmt.hlmt_p(mt))) {
            throw new AssertionError(mt);
        }
        if (((NIL != tv) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == enumeration_types.tv_p(tv))) {
            throw new AssertionError(tv);
        }
        return list_utilities.random_element(all_genl_predicates_and_inverses(pred, mt, tv));
    }

    public static SubLObject random_spec_predicate_or_inverse_of(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != forts.fort_p(pred) : "forts.fort_p(pred) " + "CommonSymbols.NIL != forts.fort_p(pred) " + pred;
        if (((NIL != mt) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == hlmt.hlmt_p(mt))) {
            throw new AssertionError(mt);
        }
        if (((NIL != tv) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == enumeration_types.tv_p(tv))) {
            throw new AssertionError(tv);
        }
        return list_utilities.random_element(all_spec_predicates_and_inverses(pred, mt, tv));
    }

    public static SubLObject random_proper_genl_predicate_or_inverse_of(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != forts.fort_p(pred) : "forts.fort_p(pred) " + "CommonSymbols.NIL != forts.fort_p(pred) " + pred;
        if (((NIL != mt) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == hlmt.hlmt_p(mt))) {
            throw new AssertionError(mt);
        }
        if (((NIL != tv) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == enumeration_types.tv_p(tv))) {
            throw new AssertionError(tv);
        }
        return list_utilities.random_element(all_proper_genl_predicates_and_inverses(pred, mt, tv));
    }

    public static SubLObject random_proper_spec_predicate_or_inverse_of(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != forts.fort_p(pred) : "forts.fort_p(pred) " + "CommonSymbols.NIL != forts.fort_p(pred) " + pred;
        if (((NIL != mt) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == hlmt.hlmt_p(mt))) {
            throw new AssertionError(mt);
        }
        if (((NIL != tv) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == enumeration_types.tv_p(tv))) {
            throw new AssertionError(tv);
        }
        return list_utilities.random_element(all_proper_spec_predicates_and_inverses(pred, mt, tv));
    }

    public static SubLObject any_spec_predP(final SubLObject pred, final SubLObject spec_preds, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return NIL == spec_preds ? NIL : NIL != list_utilities.singletonP(spec_preds) ? genl_predicateP(spec_preds.first(), pred, mt, tv) : sbhl_search_methods.sbhl_any_with_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genlPreds), spec_preds, pred, mt, tv);
    }

    public static SubLObject any_spec_inverseP(final SubLObject pred, final SubLObject spec_inverses, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return NIL == spec_inverses ? NIL : NIL != list_utilities.singletonP(spec_inverses) ? genl_inverseP(spec_inverses.first(), pred, mt, tv) : sbhl_search_methods.sbhl_any_with_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$genlInverse), spec_inverses, pred, mt, tv);
    }

    public static SubLObject some_genl_pred_or_inverseP(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return some_genl_pred_or_inverseP_int(pred, mt, tv);
    }

    public static SubLObject some_genl_pred_or_inverseP_int(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return makeBoolean((NIL != sbhl_link_methods.sbhl_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt, tv, UNPROVIDED)) || (NIL != sbhl_link_methods.sbhl_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt, tv, UNPROVIDED)));
    }

    public static SubLObject some_spec_pred_or_inverseP(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return some_spec_pred_or_inverseP_int(pred, mt, tv);
    }

    public static SubLObject some_spec_pred_or_inverseP_int(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return makeBoolean((NIL != sbhl_link_methods.sbhl_backward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt, tv, UNPROVIDED)) || (NIL != sbhl_link_methods.sbhl_backward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt, tv, UNPROVIDED)));
    }

    public static SubLObject intersecting_predicatesP(final SubLObject pred1, final SubLObject pred2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.enforceType(pred1, FORT_P);
        SubLTrampolineFile.enforceType(pred2, FORT_P);
        return predicates_intersectP(pred1, pred2, mt);
    }

    public static SubLObject predicates_intersectP(final SubLObject pred1, final SubLObject pred2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if ((NIL != fort_types_interface.predicateP(pred1)) && (NIL != fort_types_interface.predicateP(pred2))) {
            return makeBoolean(((NIL != genl_predicateP(pred1, pred2, mt, UNPROVIDED)) || (NIL != genl_predicateP(pred2, pred1, mt, UNPROVIDED))) || (NIL != negation_predicate.not_negation_predicateP(pred1, pred2, mt, UNPROVIDED)));
        }
        return NIL;
    }

    public static SubLObject preds_intersectP(final SubLObject pred1, final SubLObject pred2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return predicates_intersectP(pred1, pred2, mt);
    }

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
    }

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
    }

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
    }

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
    }

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
    }

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
    }

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
    }

    public static SubLObject max_floor_mts_of_genl_predicate_paths(final SubLObject spec, final SubLObject genl, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(spec, FORT_P);
        SubLTrampolineFile.enforceType(genl, FORT_P);
        return sbhl_search_what_mts.sbhl_max_floor_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module($$genlPreds), spec, genl, tv);
    }

    public static SubLObject max_floor_mts_of_genl_pred_paths(final SubLObject spec, final SubLObject genl) {
        return max_floor_mts_of_genl_predicate_paths(spec, genl, UNPROVIDED);
    }

    public static SubLObject min_mts_of_genl_predicate_paths(final SubLObject spec, final SubLObject genl, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_what_mts.sbhl_min_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module($$genlPreds), spec, genl, tv);
    }

    public static SubLObject min_mts_of_genl_pred_paths(final SubLObject spec, final SubLObject genl, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return min_mts_of_genl_predicate_paths(spec, genl, tv);
    }

    public static SubLObject max_floor_mts_of_not_genl_predicate_paths(final SubLObject spec, final SubLObject not_genl, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_what_mts.sbhl_max_floor_mts_of_false_inverse_paths(sbhl_module_vars.get_sbhl_module($$genlPreds), not_genl, spec, tv);
    }

    public static SubLObject min_mts_of_not_genl_predicate_paths(final SubLObject spec, final SubLObject not_genl, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_what_mts.sbhl_min_mts_of_false_inverse_paths(sbhl_module_vars.get_sbhl_module($$genlPreds), not_genl, spec, tv);
    }

    public static SubLObject max_floor_mts_of_genl_inverse_paths(final SubLObject spec, final SubLObject genl_inverse, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.enforceType(spec, FORT_P);
        SubLTrampolineFile.enforceType(genl_inverse, FORT_P);
        return sbhl_search_what_mts.sbhl_max_floor_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module($$genlInverse), spec, genl_inverse, tv);
    }

    public static SubLObject min_mts_of_genl_inverse_paths(final SubLObject spec, final SubLObject genl_inverse, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_what_mts.sbhl_min_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module($$genlInverse), spec, genl_inverse, tv);
    }

    public static SubLObject max_floor_mts_of_not_genl_inverse_paths(final SubLObject spec, final SubLObject not_genl_inverse, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_what_mts.sbhl_max_floor_mts_of_false_inverse_paths(sbhl_module_vars.get_sbhl_module($$genlInverse), not_genl_inverse, spec, tv);
    }

    public static SubLObject min_mts_of_not_genl_inverse_paths(final SubLObject spec, final SubLObject not_genl_inverse, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_what_mts.sbhl_min_mts_of_false_inverse_paths(sbhl_module_vars.get_sbhl_module($$genlInverse), not_genl_inverse, spec, tv);
    }

    public static SubLObject min_candidate_genl_preds(final SubLObject pred, SubLObject omit, SubLObject mt) {
        if (omit == UNPROVIDED) {
            omit = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return min_preds_wrt_arg_types(min_predicates(set_difference(remove(pred, candidate_genl_preds(pred, mt), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), omit, UNPROVIDED, UNPROVIDED), mt, UNPROVIDED), mt);
    }

    public static SubLObject cached_min_candidate_genl_preds(final SubLObject pred, SubLObject omit) {
        if (omit == UNPROVIDED) {
            omit = NIL;
        }
        return min_preds_wrt_arg_types(min_predicates(set_difference(remove(pred, cached_candidate_genl_preds(pred), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), omit, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED), UNPROVIDED);
    }

    public static SubLObject cached_min_candidate_genl_preds_in_mt(final SubLObject pred, final SubLObject mt, SubLObject omit) {
        if (omit == UNPROVIDED) {
            omit = NIL;
        }
        return min_preds_wrt_arg_types(min_predicates(set_difference(remove(pred, cached_candidate_genl_preds_in_mt(pred, mt), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), omit, UNPROVIDED, UNPROVIDED), mt, UNPROVIDED), mt);
    }

    public static SubLObject clear_cached_candidate_genl_preds() {
        final SubLObject cs = $cached_candidate_genl_preds_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_cached_candidate_genl_preds(final SubLObject pred) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_candidate_genl_preds_caching_state$.getGlobalValue(), list(pred), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cached_candidate_genl_preds_internal(final SubLObject pred) {
        return candidate_genl_preds(pred, UNPROVIDED);
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

    public static SubLObject clear_cached_candidate_genl_preds_in_mt() {
        final SubLObject cs = $cached_candidate_genl_preds_in_mt_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_cached_candidate_genl_preds_in_mt(final SubLObject pred, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_candidate_genl_preds_in_mt_caching_state$.getGlobalValue(), list(pred, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cached_candidate_genl_preds_in_mt_internal(final SubLObject pred, final SubLObject mt) {
        return candidate_genl_preds(pred, mt);
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

    public static SubLObject min_preds_wrt_arg_types(final SubLObject preds, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return min_preds_wrt_arg_genl(min_preds_wrt_arg_isa(preds, mt), mt);
    }

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

    public static SubLObject genl_predicate_mts(final SubLObject pred) {
        return kb_accessors.pred_mts(pred, $$genlPreds, UNPROVIDED);
    }

    public static SubLObject genl_predicate_forward_mts(final SubLObject pred) {
        return sbhl_link_methods.sbhl_forward_mts(sbhl_module_vars.get_sbhl_module($$genlPreds), pred);
    }

    public static SubLObject genl_predicate_backward_mts(final SubLObject pred) {
        return sbhl_link_methods.sbhl_backward_mts(sbhl_module_vars.get_sbhl_module($$genlPreds), pred);
    }

    public static SubLObject asserted_genl_predicatesP(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_any_asserted_true_links(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt);
    }

    public static SubLObject asserted_genl_predicates(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_true_links(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt);
    }

    public static SubLObject asserted_not_genl_predicates(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_false_links(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt);
    }

    public static SubLObject supported_genl_predicates(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_true_links(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt);
    }

    public static SubLObject supported_not_genl_predicates(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_false_links(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt);
    }

    public static SubLObject asserted_spec_predicates(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_true_inverse_links(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt);
    }

    public static SubLObject asserted_not_spec_predicates(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_false_inverse_links(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt);
    }

    public static SubLObject supported_spec_predicates(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_true_inverse_links(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt);
    }

    public static SubLObject supported_not_spec_predicates(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_false_inverse_links(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, mt);
    }

    public static SubLObject genl_inverse_mts(final SubLObject pred) {
        return kb_accessors.pred_mts(pred, $$genlInverse, UNPROVIDED);
    }

    public static SubLObject genl_inverse_forward_mts(final SubLObject pred) {
        return sbhl_link_methods.sbhl_forward_mts(sbhl_module_vars.get_sbhl_module($$genlInverse), pred);
    }

    public static SubLObject genl_inverse_backward_mts(final SubLObject pred) {
        return sbhl_link_methods.sbhl_backward_mts(sbhl_module_vars.get_sbhl_module($$genlInverse), pred);
    }

    public static SubLObject asserted_genl_inversesP(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_any_asserted_true_links(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt);
    }

    public static SubLObject asserted_genl_inverses(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_true_links(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt);
    }

    public static SubLObject asserted_not_genl_inverses(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_false_links(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt);
    }

    public static SubLObject supported_genl_inverses(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_true_links(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt);
    }

    public static SubLObject supported_not_genl_inverses(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_false_links(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt);
    }

    public static SubLObject asserted_spec_inverses(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_true_inverse_links(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt);
    }

    public static SubLObject asserted_not_spec_inverses(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_false_inverse_links(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt);
    }

    public static SubLObject supported_spec_inverses(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_true_inverse_links(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt);
    }

    public static SubLObject supported_not_spec_inverses(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_false_inverse_links(sbhl_module_vars.get_sbhl_module($$genlInverse), pred, mt);
    }

    public static SubLObject genl_predicate_after_adding(SubLObject source, final SubLObject assertion) {
        sbhl_link_methods.sbhl_after_adding(source, assertion, sbhl_module_vars.get_sbhl_module($$genlPreds));
        sbhl_cache.sbhl_cache_addition_maintainence(assertion);
        after_adding_modules.clear_genl_pred_dependent_caches(source, assertion);
        return NIL;
    }

    public static SubLObject add_genl_predicate(SubLObject source, final SubLObject assertion) {
        genl_predicate_after_adding(source, assertion);
        return NIL;
    }

    public static SubLObject genl_inverse_after_adding(SubLObject source, final SubLObject assertion) {
        sbhl_link_methods.sbhl_after_adding(source, assertion, sbhl_module_vars.get_sbhl_module($$genlInverse));
        sbhl_cache.sbhl_cache_addition_maintainence(assertion);
        after_adding_modules.clear_genl_pred_dependent_caches(source, assertion);
        return NIL;
    }

    public static SubLObject add_genl_inverse(SubLObject source, final SubLObject assertion) {
        genl_inverse_after_adding(source, assertion);
        return NIL;
    }

    public static SubLObject remove_genl_predicate(SubLObject source, final SubLObject assertion) {
        genl_predicate_after_removing(source, assertion);
        return NIL;
    }

    public static SubLObject remove_genl_inverse(SubLObject source, final SubLObject assertion) {
        genl_inverse_after_removing(source, assertion);
        return NIL;
    }

    public static SubLObject genl_predicate_after_removing(SubLObject source, final SubLObject assertion) {
        sbhl_link_methods.sbhl_after_removing(source, assertion, sbhl_module_vars.get_sbhl_module($$genlPreds));
        sbhl_cache.sbhl_cache_removal_maintainence(assertion);
        after_adding_modules.clear_genl_pred_dependent_caches(source, assertion);
        return NIL;
    }

    public static SubLObject genl_inverse_after_removing(SubLObject source, final SubLObject assertion) {
        sbhl_link_methods.sbhl_after_removing(source, assertion, sbhl_module_vars.get_sbhl_module($$genlInverse));
        sbhl_cache.sbhl_cache_removal_maintainence(assertion);
        after_adding_modules.clear_genl_pred_dependent_caches(source, assertion);
        return NIL;
    }

    public static SubLObject clear_predicate_graph() {
        clear_genl_predicate_graph();
        return NIL;
    }

    public static SubLObject clear_genl_predicate_graph() {
        sbhl_link_methods.clear_sbhl_module_graph(sbhl_module_vars.get_sbhl_module($$genlPreds));
        return NIL;
    }

    public static SubLObject clear_genl_inverse_graph() {
        sbhl_link_methods.clear_sbhl_module_graph(sbhl_module_vars.get_sbhl_module($$genlInverse));
        return NIL;
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

    public static SubLObject reset_predicate_genls_links_in_mt(final SubLObject pred, final SubLObject mt) {
        return reset_genl_predicate_links_in_mt(pred, mt);
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

    public static SubLObject reset_predicate_graph(SubLObject clearP) {
        if (clearP == UNPROVIDED) {
            clearP = T;
        }
        reset_genl_predicate_graph(clearP);
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
        declareFunction(me, "genl_predicates", "GENL-PREDICATES", 1, 2, false);
        declareFunction(me, "min_genl_predicates", "MIN-GENL-PREDICATES", 1, 2, false);
        declareFunction(me, "genl_inverses", "GENL-INVERSES", 1, 2, false);
        declareFunction(me, "min_genl_inverses", "MIN-GENL-INVERSES", 1, 2, false);
        declareFunction(me, "not_genl_predicates", "NOT-GENL-PREDICATES", 1, 2, false);
        declareFunction(me, "max_not_genl_predicates", "MAX-NOT-GENL-PREDICATES", 1, 2, false);
        declareFunction(me, "not_genl_inverses", "NOT-GENL-INVERSES", 1, 2, false);
        declareFunction(me, "max_not_genl_inverses", "MAX-NOT-GENL-INVERSES", 1, 2, false);
        declareFunction(me, "spec_predicates", "SPEC-PREDICATES", 1, 2, false);
        declareFunction(me, "max_spec_predicates", "MAX-SPEC-PREDICATES", 1, 2, false);
        declareFunction(me, "spec_inverses", "SPEC-INVERSES", 1, 2, false);
        declareFunction(me, "max_spec_inverses", "MAX-SPEC-INVERSES", 1, 2, false);
        declareFunction(me, "not_spec_predicates", "NOT-SPEC-PREDICATES", 1, 2, false);
        declareFunction(me, "min_not_spec_predicates", "MIN-NOT-SPEC-PREDICATES", 1, 2, false);
        declareFunction(me, "not_spec_inverses", "NOT-SPEC-INVERSES", 1, 2, false);
        declareFunction(me, "min_not_spec_inverses", "MIN-NOT-SPEC-INVERSES", 1, 2, false);
        declareFunction(me, "genl_predicate_siblings", "GENL-PREDICATE-SIBLINGS", 1, 2, false);
        declareFunction(me, "genl_inverse_siblings", "GENL-INVERSE-SIBLINGS", 1, 2, false);
        declareFunction(me, "spec_predicate_siblings", "SPEC-PREDICATE-SIBLINGS", 1, 2, false);
        declareFunction(me, "spec_inverse_siblings", "SPEC-INVERSE-SIBLINGS", 1, 2, false);
        declareFunction(me, "genl_predicate_roots", "GENL-PREDICATE-ROOTS", 1, 2, false);
        declareFunction(me, "genl_inverse_roots", "GENL-INVERSE-ROOTS", 1, 2, false);
        declareFunction(me, "all_genl_predicates", "ALL-GENL-PREDICATES", 1, 2, false);
        declareFunction(me, "all_genl_predicates_and_inverses", "ALL-GENL-PREDICATES-AND-INVERSES", 1, 2, false);
        declareFunction(me, "all_genl_preds", "ALL-GENL-PREDS", 1, 2, false);
        declareFunction(me, "all_genl_inverses", "ALL-GENL-INVERSES", 1, 2, false);
        declareFunction(me, "all_spec_predicates", "ALL-SPEC-PREDICATES", 1, 2, false);
        declareFunction(me, "all_spec_preds", "ALL-SPEC-PREDS", 1, 2, false);
        declareFunction(me, "all_spec_inverses", "ALL-SPEC-INVERSES", 1, 2, false);
        declareFunction(me, "all_spec_predicates_and_inverses", "ALL-SPEC-PREDICATES-AND-INVERSES", 1, 2, false);
        declareFunction(me, "inverse_binary_predicates", "INVERSE-BINARY-PREDICATES", 1, 2, false);
        declareFunction(me, "best_inverse_binary_predicate", "BEST-INVERSE-BINARY-PREDICATE", 1, 2, false);
        declareFunction(me, "all_proper_genl_predicates", "ALL-PROPER-GENL-PREDICATES", 1, 2, false);
        declareFunction(me, "all_proper_genl_inverses", "ALL-PROPER-GENL-INVERSES", 1, 2, false);
        declareFunction(me, "all_proper_genl_predicates_and_inverses", "ALL-PROPER-GENL-PREDICATES-AND-INVERSES", 1, 2, false);
        declareFunction(me, "all_proper_spec_predicates", "ALL-PROPER-SPEC-PREDICATES", 1, 2, false);
        declareFunction(me, "all_proper_spec_inverses", "ALL-PROPER-SPEC-INVERSES", 1, 2, false);
        declareFunction(me, "all_proper_spec_predicates_and_inverses", "ALL-PROPER-SPEC-PREDICATES-AND-INVERSES", 1, 2, false);
        declareFunction(me, "all_genl_preds_among", "ALL-GENL-PREDS-AMONG", 2, 2, false);
        declareFunction(me, "all_spec_predicates_among", "ALL-SPEC-PREDICATES-AMONG", 2, 2, false);
        declareFunction(me, "all_genl_inverses_among", "ALL-GENL-INVERSES-AMONG", 2, 2, false);
        declareFunction(me, "all_spec_inverses_among", "ALL-SPEC-INVERSES-AMONG", 2, 2, false);
        declareFunction(me, "all_not_genl_predicates", "ALL-NOT-GENL-PREDICATES", 1, 2, false);
        declareFunction(me, "all_not_genl_preds", "ALL-NOT-GENL-PREDS", 1, 2, false);
        declareFunction(me, "all_not_genl_inverses", "ALL-NOT-GENL-INVERSES", 1, 2, false);
        declareFunction(me, "all_not_spec_predicates", "ALL-NOT-SPEC-PREDICATES", 1, 2, false);
        declareFunction(me, "all_not_spec_preds", "ALL-NOT-SPEC-PREDS", 1, 2, false);
        declareFunction(me, "all_not_spec_inverses", "ALL-NOT-SPEC-INVERSES", 1, 2, false);
        declareFunction(me, "union_all_genl_predicates", "UNION-ALL-GENL-PREDICATES", 1, 2, false);
        declareFunction(me, "union_all_spec_predicates", "UNION-ALL-SPEC-PREDICATES", 1, 2, false);
        declareFunction(me, "union_all_genl_inverses", "UNION-ALL-GENL-INVERSES", 1, 2, false);
        declareFunction(me, "union_all_spec_inverses", "UNION-ALL-SPEC-INVERSES", 1, 2, false);
        declareFunction(me, "union_all_spec_predicates_and_inverses", "UNION-ALL-SPEC-PREDICATES-AND-INVERSES", 1, 2, false);
        declareFunction(me, "map_all_genl_preds", "MAP-ALL-GENL-PREDS", 2, 2, false);
        declareFunction(me, "some_all_genl_preds", "SOME-ALL-GENL-PREDS", 2, 2, false);
        declareFunction(me, "some_all_genl_inverses", "SOME-ALL-GENL-INVERSES", 2, 2, false);
        declareFunction(me, "some_all_genl_preds_and_inverses", "SOME-ALL-GENL-PREDS-AND-INVERSES", 2, 2, false);
        declareFunction(me, "map_all_spec_preds", "MAP-ALL-SPEC-PREDS", 2, 2, false);
        declareFunction(me, "map_spec_preds", "MAP-SPEC-PREDS", 2, 1, false);
        declareFunction(me, "map_all_spec_preds_and_inverses", "MAP-ALL-SPEC-PREDS-AND-INVERSES", 2, 2, false);
        declareFunction(me, "some_all_spec_preds", "SOME-ALL-SPEC-PREDS", 2, 2, false);
        declareFunction(me, "some_all_spec_preds_and_inverses", "SOME-ALL-SPEC-PREDS-AND-INVERSES", 2, 2, false);
        declareFunction(me, "count_all_genl_predicates", "COUNT-ALL-GENL-PREDICATES", 1, 2, false);
        declareFunction(me, "count_all_genl_inverses", "COUNT-ALL-GENL-INVERSES", 1, 2, false);
        declareFunction(me, "count_all_genl_predicates_and_inverses", "COUNT-ALL-GENL-PREDICATES-AND-INVERSES", 1, 2, false);
        declareFunction(me, "count_all_spec_predicates", "COUNT-ALL-SPEC-PREDICATES", 1, 2, false);
        declareFunction(me, "count_all_spec_inverses", "COUNT-ALL-SPEC-INVERSES", 1, 2, false);
        declareFunction(me, "count_all_spec_predicates_and_inverses", "COUNT-ALL-SPEC-PREDICATES-AND-INVERSES", 1, 2, false);
        declareFunction(me, "all_spec_preds_wrt_type", "ALL-SPEC-PREDS-WRT-TYPE", 3, 2, false);
        declareFunction(me, "all_spec_preds_wrt_arg", "ALL-SPEC-PREDS-WRT-ARG", 3, 2, false);
        declareFunction(me, "gather_if_searched_arg_constraints", "GATHER-IF-SEARCHED-ARG-CONSTRAINTS", 1, 0, false);
        declareFunction(me, "get_sbhl_arg_type_alist", "GET-SBHL-ARG-TYPE-ALIST", 0, 0, false);
        declareMacro(me, "with_sbhl_arg_type_alist", "WITH-SBHL-ARG-TYPE-ALIST");
        declareFunction(me, "get_sbhl_arg_type_store", "GET-SBHL-ARG-TYPE-STORE", 1, 0, false);
        declareMacro(me, "with_new_sbhl_arg_type_genls_stores", "WITH-NEW-SBHL-ARG-TYPE-GENLS-STORES");
        declareFunction(me, "sbhl_initialize_arg_type_genls_stores", "SBHL-INITIALIZE-ARG-TYPE-GENLS-STORES", 1, 0, false);
        declareFunction(me, "sbhl_arg_types_alist_satisfied_p", "SBHL-ARG-TYPES-ALIST-SATISFIED-P", 1, 0, false);
        declareFunction(me, "leaf_predicates_wrt_arg_type", "LEAF-PREDICATES-WRT-ARG-TYPE", 2, 0, false);
        declareFunction(me, "sbhl_add_leaf_predicates_to_result", "SBHL-ADD-LEAF-PREDICATES-TO-RESULT", 1, 0, false);
        declareFunction(me, "pred_is_typed_spec_pred_p", "PRED-IS-TYPED-SPEC-PRED-P", 2, 0, false);
        declareFunction(me, "typed_spec_predicates_wrt_arg_type", "TYPED-SPEC-PREDICATES-WRT-ARG-TYPE", 2, 0, false);
        declareFunction(me, "leaf_predicates_mark_and_sweep", "LEAF-PREDICATES-MARK-AND-SWEEP", 1, 0, false);
        declareFunction(me, "min_predicates", "MIN-PREDICATES", 1, 2, false);
        declareFunction(me, "max_predicates", "MAX-PREDICATES", 1, 2, false);
        declareFunction(me, "min_ceiling_predicates", "MIN-CEILING-PREDICATES", 1, 3, false);
        declareFunction(me, "max_floor_predicates", "MAX-FLOOR-PREDICATES", 1, 3, false);
        declareFunction(me, "some_spec_predicate_or_inverse_somewhereP", "SOME-SPEC-PREDICATE-OR-INVERSE-SOMEWHERE?", 1, 0, false);
        declareFunction(me, "genl_predicateP", "GENL-PREDICATE?", 2, 2, false);
        declareFunction(me, "genl_predicate_in_any_mtP", "GENL-PREDICATE-IN-ANY-MT?", 2, 0, false);
        declareFunction(me, "genl_predP", "GENL-PRED?", 2, 2, false);
        declareFunction(me, "spec_predP", "SPEC-PRED?", 2, 2, false);
        declareFunction(me, "proper_genl_predP", "PROPER-GENL-PRED?", 2, 2, false);
        declareFunction(me, "proper_spec_predP", "PROPER-SPEC-PRED?", 2, 2, false);
        declareFunction(me, "spec_predicateP", "SPEC-PREDICATE?", 2, 2, false);
        declareFunction(me, "genl_inverseP", "GENL-INVERSE?", 2, 2, false);
        declareFunction(me, "spec_inverseP", "SPEC-INVERSE?", 2, 2, false);
        declareFunction(me, "genl_predicate_ofP", "GENL-PREDICATE-OF?", 2, 2, false);
        declareFunction(me, "genl_inverse_ofP", "GENL-INVERSE-OF?", 2, 2, false);
        declareFunction(me, "any_genl_predicateP", "ANY-GENL-PREDICATE?", 2, 2, false);
        declareFunction(me, "any_genl_predP", "ANY-GENL-PRED?", 2, 2, false);
        declareFunction(me, "any_genl_predicate_in_any_mtP", "ANY-GENL-PREDICATE-IN-ANY-MT?", 2, 0, false);
        declareFunction(me, "any_genl_inverseP", "ANY-GENL-INVERSE?", 2, 2, false);
        declareFunction(me, "not_genl_predicateP", "NOT-GENL-PREDICATE?", 2, 2, false);
        declareFunction(me, "not_genl_predP", "NOT-GENL-PRED?", 2, 2, false);
        declareFunction(me, "not_spec_predicateP", "NOT-SPEC-PREDICATE?", 2, 2, false);
        declareFunction(me, "argue_not_genl_predicateP", "ARGUE-NOT-GENL-PREDICATE?", 2, 2, false);
        declareFunction(me, "not_genl_inverseP", "NOT-GENL-INVERSE?", 2, 2, false);
        declareFunction(me, "not_spec_inverseP", "NOT-SPEC-INVERSE?", 2, 1, false);
        declareFunction(me, "argue_not_genl_inverseP", "ARGUE-NOT-GENL-INVERSE?", 2, 2, false);
        declareFunction(me, "any_not_genl_predicateP", "ANY-NOT-GENL-PREDICATE?", 2, 2, false);
        declareFunction(me, "random_genl_predicate_of", "RANDOM-GENL-PREDICATE-OF", 1, 2, false);
        declareFunction(me, "random_spec_predicate_of", "RANDOM-SPEC-PREDICATE-OF", 1, 2, false);
        declareFunction(me, "random_proper_genl_predicate_of", "RANDOM-PROPER-GENL-PREDICATE-OF", 1, 2, false);
        declareFunction(me, "random_proper_spec_predicate_of", "RANDOM-PROPER-SPEC-PREDICATE-OF", 1, 2, false);
        declareFunction(me, "random_genl_inverse_of", "RANDOM-GENL-INVERSE-OF", 1, 2, false);
        declareFunction(me, "random_spec_inverse_of", "RANDOM-SPEC-INVERSE-OF", 1, 2, false);
        declareFunction(me, "random_proper_genl_inverse_of", "RANDOM-PROPER-GENL-INVERSE-OF", 1, 2, false);
        declareFunction(me, "random_proper_spec_inverse_of", "RANDOM-PROPER-SPEC-INVERSE-OF", 1, 2, false);
        declareFunction(me, "random_genl_predicate_or_inverse_of", "RANDOM-GENL-PREDICATE-OR-INVERSE-OF", 1, 2, false);
        declareFunction(me, "random_spec_predicate_or_inverse_of", "RANDOM-SPEC-PREDICATE-OR-INVERSE-OF", 1, 2, false);
        declareFunction(me, "random_proper_genl_predicate_or_inverse_of", "RANDOM-PROPER-GENL-PREDICATE-OR-INVERSE-OF", 1, 2, false);
        declareFunction(me, "random_proper_spec_predicate_or_inverse_of", "RANDOM-PROPER-SPEC-PREDICATE-OR-INVERSE-OF", 1, 2, false);
        declareFunction(me, "any_spec_predP", "ANY-SPEC-PRED?", 2, 2, false);
        declareFunction(me, "any_spec_inverseP", "ANY-SPEC-INVERSE?", 2, 2, false);
        declareFunction(me, "some_genl_pred_or_inverseP", "SOME-GENL-PRED-OR-INVERSE?", 1, 2, false);
        declareFunction(me, "some_genl_pred_or_inverseP_int", "SOME-GENL-PRED-OR-INVERSE?-INT", 1, 2, false);
        declareFunction(me, "some_spec_pred_or_inverseP", "SOME-SPEC-PRED-OR-INVERSE?", 1, 2, false);
        declareFunction(me, "some_spec_pred_or_inverseP_int", "SOME-SPEC-PRED-OR-INVERSE?-INT", 1, 2, false);
        declareFunction(me, "intersecting_predicatesP", "INTERSECTING-PREDICATES?", 2, 1, false);
        declareFunction(me, "predicates_intersectP", "PREDICATES-INTERSECT?", 2, 1, false);
        declareFunction(me, "preds_intersectP", "PREDS-INTERSECT?", 2, 1, false);
        declareFunction(me, "why_genl_predicateP", "WHY-GENL-PREDICATE?", 2, 3, false);
        declareFunction(me, "why_not_genl_predicateP", "WHY-NOT-GENL-PREDICATE?", 2, 3, false);
        declareFunction(me, "why_genl_inverseP", "WHY-GENL-INVERSE?", 2, 3, false);
        declareFunction(me, "why_spec_inverseP", "WHY-SPEC-INVERSE?", 2, 3, false);
        declareFunction(me, "why_not_genl_inverseP", "WHY-NOT-GENL-INVERSE?", 2, 3, false);
        declareFunction(me, "why_some_genl_predicate_amongP", "WHY-SOME-GENL-PREDICATE-AMONG?", 2, 3, false);
        declareFunction(me, "why_some_genl_inverse_amongP", "WHY-SOME-GENL-INVERSE-AMONG?", 2, 3, false);
        declareFunction(me, "max_floor_mts_of_genl_predicate_paths", "MAX-FLOOR-MTS-OF-GENL-PREDICATE-PATHS", 2, 1, false);
        declareFunction(me, "max_floor_mts_of_genl_pred_paths", "MAX-FLOOR-MTS-OF-GENL-PRED-PATHS", 2, 0, false);
        declareFunction(me, "min_mts_of_genl_predicate_paths", "MIN-MTS-OF-GENL-PREDICATE-PATHS", 2, 1, false);
        declareFunction(me, "min_mts_of_genl_pred_paths", "MIN-MTS-OF-GENL-PRED-PATHS", 2, 1, false);
        declareFunction(me, "max_floor_mts_of_not_genl_predicate_paths", "MAX-FLOOR-MTS-OF-NOT-GENL-PREDICATE-PATHS", 2, 1, false);
        declareFunction(me, "min_mts_of_not_genl_predicate_paths", "MIN-MTS-OF-NOT-GENL-PREDICATE-PATHS", 2, 1, false);
        declareFunction(me, "max_floor_mts_of_genl_inverse_paths", "MAX-FLOOR-MTS-OF-GENL-INVERSE-PATHS", 2, 1, false);
        declareFunction(me, "min_mts_of_genl_inverse_paths", "MIN-MTS-OF-GENL-INVERSE-PATHS", 2, 1, false);
        declareFunction(me, "max_floor_mts_of_not_genl_inverse_paths", "MAX-FLOOR-MTS-OF-NOT-GENL-INVERSE-PATHS", 2, 1, false);
        declareFunction(me, "min_mts_of_not_genl_inverse_paths", "MIN-MTS-OF-NOT-GENL-INVERSE-PATHS", 2, 1, false);
        declareFunction(me, "min_candidate_genl_preds", "MIN-CANDIDATE-GENL-PREDS", 1, 2, false);
        declareFunction(me, "cached_min_candidate_genl_preds", "CACHED-MIN-CANDIDATE-GENL-PREDS", 1, 1, false);
        declareFunction(me, "cached_min_candidate_genl_preds_in_mt", "CACHED-MIN-CANDIDATE-GENL-PREDS-IN-MT", 2, 1, false);
        declareFunction(me, "clear_cached_candidate_genl_preds", "CLEAR-CACHED-CANDIDATE-GENL-PREDS", 0, 0, false);
        declareFunction(me, "remove_cached_candidate_genl_preds", "REMOVE-CACHED-CANDIDATE-GENL-PREDS", 1, 0, false);
        declareFunction(me, "cached_candidate_genl_preds_internal", "CACHED-CANDIDATE-GENL-PREDS-INTERNAL", 1, 0, false);
        declareFunction(me, "cached_candidate_genl_preds", "CACHED-CANDIDATE-GENL-PREDS", 1, 0, false);
        declareFunction(me, "clear_cached_candidate_genl_preds_in_mt", "CLEAR-CACHED-CANDIDATE-GENL-PREDS-IN-MT", 0, 0, false);
        declareFunction(me, "remove_cached_candidate_genl_preds_in_mt", "REMOVE-CACHED-CANDIDATE-GENL-PREDS-IN-MT", 2, 0, false);
        declareFunction(me, "cached_candidate_genl_preds_in_mt_internal", "CACHED-CANDIDATE-GENL-PREDS-IN-MT-INTERNAL", 2, 0, false);
        declareFunction(me, "cached_candidate_genl_preds_in_mt", "CACHED-CANDIDATE-GENL-PREDS-IN-MT", 2, 0, false);
        declareFunction(me, "candidate_genl_preds", "CANDIDATE-GENL-PREDS", 1, 1, false);
        declareFunction(me, "candidate_preds_for_arg_type", "CANDIDATE-PREDS-FOR-ARG-TYPE", 2, 2, false);
        declareFunction(me, "candidate_preds_for_arg_isa", "CANDIDATE-PREDS-FOR-ARG-ISA", 1, 0, false);
        declareFunction(me, "candidate_preds_for_arg_genl", "CANDIDATE-PREDS-FOR-ARG-GENL", 1, 0, false);
        declareFunction(me, "min_preds_wrt_arg_types", "MIN-PREDS-WRT-ARG-TYPES", 1, 1, false);
        declareFunction(me, "min_preds_wrt_arg_isa", "MIN-PREDS-WRT-ARG-ISA", 1, 1, false);
        declareFunction(me, "min_preds_wrt_arg_genl", "MIN-PREDS-WRT-ARG-GENL", 1, 1, false);
        declareFunction(me, "genl_predicate_mts", "GENL-PREDICATE-MTS", 1, 0, false);
        declareFunction(me, "genl_predicate_forward_mts", "GENL-PREDICATE-FORWARD-MTS", 1, 0, false);
        declareFunction(me, "genl_predicate_backward_mts", "GENL-PREDICATE-BACKWARD-MTS", 1, 0, false);
        declareFunction(me, "asserted_genl_predicatesP", "ASSERTED-GENL-PREDICATES?", 1, 1, false);
        declareFunction(me, "asserted_genl_predicates", "ASSERTED-GENL-PREDICATES", 1, 1, false);
        declareFunction(me, "asserted_not_genl_predicates", "ASSERTED-NOT-GENL-PREDICATES", 1, 1, false);
        declareFunction(me, "supported_genl_predicates", "SUPPORTED-GENL-PREDICATES", 1, 1, false);
        declareFunction(me, "supported_not_genl_predicates", "SUPPORTED-NOT-GENL-PREDICATES", 1, 1, false);
        declareFunction(me, "asserted_spec_predicates", "ASSERTED-SPEC-PREDICATES", 1, 1, false);
        declareFunction(me, "asserted_not_spec_predicates", "ASSERTED-NOT-SPEC-PREDICATES", 1, 1, false);
        declareFunction(me, "supported_spec_predicates", "SUPPORTED-SPEC-PREDICATES", 1, 1, false);
        declareFunction(me, "supported_not_spec_predicates", "SUPPORTED-NOT-SPEC-PREDICATES", 1, 1, false);
        declareFunction(me, "genl_inverse_mts", "GENL-INVERSE-MTS", 1, 0, false);
        declareFunction(me, "genl_inverse_forward_mts", "GENL-INVERSE-FORWARD-MTS", 1, 0, false);
        declareFunction(me, "genl_inverse_backward_mts", "GENL-INVERSE-BACKWARD-MTS", 1, 0, false);
        declareFunction(me, "asserted_genl_inversesP", "ASSERTED-GENL-INVERSES?", 1, 1, false);
        declareFunction(me, "asserted_genl_inverses", "ASSERTED-GENL-INVERSES", 1, 1, false);
        declareFunction(me, "asserted_not_genl_inverses", "ASSERTED-NOT-GENL-INVERSES", 1, 1, false);
        declareFunction(me, "supported_genl_inverses", "SUPPORTED-GENL-INVERSES", 1, 1, false);
        declareFunction(me, "supported_not_genl_inverses", "SUPPORTED-NOT-GENL-INVERSES", 1, 1, false);
        declareFunction(me, "asserted_spec_inverses", "ASSERTED-SPEC-INVERSES", 1, 1, false);
        declareFunction(me, "asserted_not_spec_inverses", "ASSERTED-NOT-SPEC-INVERSES", 1, 1, false);
        declareFunction(me, "supported_spec_inverses", "SUPPORTED-SPEC-INVERSES", 1, 1, false);
        declareFunction(me, "supported_not_spec_inverses", "SUPPORTED-NOT-SPEC-INVERSES", 1, 1, false);
        declareFunction(me, "genl_predicate_after_adding", "GENL-PREDICATE-AFTER-ADDING", 2, 0, false);
        declareFunction(me, "add_genl_predicate", "ADD-GENL-PREDICATE", 2, 0, false);
        declareFunction(me, "genl_inverse_after_adding", "GENL-INVERSE-AFTER-ADDING", 2, 0, false);
        declareFunction(me, "add_genl_inverse", "ADD-GENL-INVERSE", 2, 0, false);
        declareFunction(me, "remove_genl_predicate", "REMOVE-GENL-PREDICATE", 2, 0, false);
        declareFunction(me, "remove_genl_inverse", "REMOVE-GENL-INVERSE", 2, 0, false);
        declareFunction(me, "genl_predicate_after_removing", "GENL-PREDICATE-AFTER-REMOVING", 2, 0, false);
        declareFunction(me, "genl_inverse_after_removing", "GENL-INVERSE-AFTER-REMOVING", 2, 0, false);
        declareFunction(me, "clear_predicate_graph", "CLEAR-PREDICATE-GRAPH", 0, 0, false);
        declareFunction(me, "clear_genl_predicate_graph", "CLEAR-GENL-PREDICATE-GRAPH", 0, 0, false);
        declareFunction(me, "clear_genl_inverse_graph", "CLEAR-GENL-INVERSE-GRAPH", 0, 0, false);
        declareFunction(me, "clear_node_genl_predicate_links", "CLEAR-NODE-GENL-PREDICATE-LINKS", 1, 0, false);
        declareFunction(me, "clear_node_genl_inverse_links", "CLEAR-NODE-GENL-INVERSE-LINKS", 1, 0, false);
        declareFunction(me, "reset_genl_predicate_links", "RESET-GENL-PREDICATE-LINKS", 1, 0, false);
        declareFunction(me, "reset_genl_inverse_links", "RESET-GENL-INVERSE-LINKS", 1, 0, false);
        declareFunction(me, "reset_predicate_genls_links_in_mt", "RESET-PREDICATE-GENLS-LINKS-IN-MT", 2, 0, false);
        declareFunction(me, "reset_genl_predicate_links_in_mt", "RESET-GENL-PREDICATE-LINKS-IN-MT", 2, 0, false);
        declareFunction(me, "reset_genl_inverse_links_in_mt", "RESET-GENL-INVERSE-LINKS-IN-MT", 2, 0, false);
        declareFunction(me, "reset_predicate_graph", "RESET-PREDICATE-GRAPH", 0, 1, false);
        declareFunction(me, "reset_genl_predicate_graph", "RESET-GENL-PREDICATE-GRAPH", 0, 1, false);
        declareFunction(me, "reset_genl_inverse_graph", "RESET-GENL-INVERSE-GRAPH", 0, 1, false);
        return NIL;
    }

    public static SubLObject init_genl_predicates_file() {
        defparameter("*SBHL-ARG-TYPE-ALIST*", NIL);
        defparameter("*SBHL-ARG-TYPE-GENLS-STORES*", NIL);
        deflexical("*CACHED-CANDIDATE-GENL-PREDS-CACHING-STATE*", NIL);
        deflexical("*CACHED-CANDIDATE-GENL-PREDS-IN-MT-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_genl_predicates_file() {
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

    
}

/**
 * Total time: 2153 ms synthetic
 */
