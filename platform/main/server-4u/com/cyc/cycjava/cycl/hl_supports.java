/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.assertions_high.assertion_has_truth;
import static com.cyc.cycjava.cycl.assertions_high.assertion_mt;
import static com.cyc.cycjava.cycl.assertions_high.assertion_strength;
import static com.cyc.cycjava.cycl.assertions_high.gaf_arg2;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.constant_handles.valid_constantP;
import static com.cyc.cycjava.cycl.control_vars.$perform_equals_unification$;
import static com.cyc.cycjava.cycl.cycl_utilities.atomic_sentence_predicate;
import static com.cyc.cycjava.cycl.cycl_utilities.formula_arg1;
import static com.cyc.cycjava.cycl.cycl_utilities.formula_args;
import static com.cyc.cycjava.cycl.cycl_utilities.formula_operator;
import static com.cyc.cycjava.cycl.cycl_utilities.nat_functor;
import static com.cyc.cycjava.cycl.cycl_utilities.negate;
import static com.cyc.cycjava.cycl.cycl_utilities.negatedP;
import static com.cyc.cycjava.cycl.disjoint_with.disjoint_withP;
import static com.cyc.cycjava.cycl.disjoint_with.not_disjoint_withP;
import static com.cyc.cycjava.cycl.disjoint_with.why_instances_of_disjoint_collections;
import static com.cyc.cycjava.cycl.el_utilities.designated_mt;
import static com.cyc.cycjava.cycl.el_utilities.designated_sentence;
import static com.cyc.cycjava.cycl.el_utilities.el_empty_set_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_implication_p;
import static com.cyc.cycjava.cycl.el_utilities.el_negation_p;
import static com.cyc.cycjava.cycl.el_utilities.ist_sentence_p;
import static com.cyc.cycjava.cycl.el_utilities.literal_arg0;
import static com.cyc.cycjava.cycl.el_utilities.literal_arg1;
import static com.cyc.cycjava.cycl.el_utilities.literal_arg2;
import static com.cyc.cycjava.cycl.el_utilities.literal_args;
import static com.cyc.cycjava.cycl.el_utilities.literal_atomic_sentence;
import static com.cyc.cycjava.cycl.el_utilities.literal_predicate;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_ternary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_formula;
import static com.cyc.cycjava.cycl.el_utilities.sefify;
import static com.cyc.cycjava.cycl.genl_mts.genl_mtP;
import static com.cyc.cycjava.cycl.genl_mts.max_floor_mts;
import static com.cyc.cycjava.cycl.genl_mts.max_floor_mts_from_mt_sets;
import static com.cyc.cycjava.cycl.genl_mts.max_floor_mts_of_genl_mt_paths;
import static com.cyc.cycjava.cycl.genl_mts.max_mts;
import static com.cyc.cycjava.cycl.genl_mts.not_genl_mtP;
import static com.cyc.cycjava.cycl.genl_mts.why_genl_mtP;
import static com.cyc.cycjava.cycl.genl_predicates.genl_inverseP;
import static com.cyc.cycjava.cycl.genl_predicates.genl_predicateP;
import static com.cyc.cycjava.cycl.genl_predicates.max_floor_mts_of_genl_inverse_paths;
import static com.cyc.cycjava.cycl.genl_predicates.max_floor_mts_of_genl_pred_paths;
import static com.cyc.cycjava.cycl.genl_predicates.not_genl_inverseP;
import static com.cyc.cycjava.cycl.genl_predicates.not_genl_predicateP;
import static com.cyc.cycjava.cycl.kb_indexing.find_gaf;
import static com.cyc.cycjava.cycl.kb_indexing.find_gaf_genl_mts;
import static com.cyc.cycjava.cycl.mt_vars.$element_of_defining_mt$;
import static com.cyc.cycjava.cycl.mt_vars.$equals_defining_mt$;
import static com.cyc.cycjava.cycl.mt_vars.$subset_of_defining_mt$;
import static com.cyc.cycjava.cycl.mt_vars.maximize_mts_wrt_core;
import static com.cyc.cycjava.cycl.mt_vars.minimize_mt_sets_wrt_core;
import static com.cyc.cycjava.cycl.mt_vars.note_mt_var;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.set_nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.get;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.put;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.remprop;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.consp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.keywordp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subsetp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_metrics;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_admitted_formula;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_arg1_binary_preds;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_candidate_noun_compounds;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_consistent;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_cyclifier;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_different;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_evaluate;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_evaluation;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_formula_arg_n;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_gaf_components;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlmt;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genls;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ncr_constraints;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nearest_isa;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_parse_trees;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_reflexive_on;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_transitivity;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_true_sentence;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_modules;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_hl_support_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      HL-SUPPORTS
 * source file: /cyc/top/cycl/hl-supports.lisp
 * created:     2019/07/03 17:37:36
 */
public final class hl_supports extends SubLTranslatedFile implements V12 {
    public static final SubLObject hl_verify_gis(SubLObject support) {
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.hl_supports.hl_justify_gis(support));
    }

    public static final SubLObject hl_justify_gis(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != subl_promotions.memberP(literal.first(), $list_alt124, UNPROVIDED, UNPROVIDED)) {
                    {
                        SubLObject ks = constants_high.find_constant($str_alt125$Cycorp_ArcMap_GIS_KS);
                        SubLObject formula = list($$sourceClaims, ks, literal);
                        if (NIL != valid_constantP(ks, UNPROVIDED)) {
                            return list(arguments.make_hl_support($GIS, formula, $$CycorpBusinessDatabaseMt, tv));
                        }
                    }
                }
                return NIL;
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static final SubLObject hl_forward_mt_combos_gis(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(mt);
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static final SubLFile me = new hl_supports();



    // deflexical
    // Definitions
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $hl_predicates$ = makeSymbol("*HL-PREDICATES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $hl_support_module_plist_indicators$ = makeSymbol("*HL-SUPPORT-MODULE-PLIST-INDICATORS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $hl_forward_mt_combos_max_recursion_depth$ = makeSymbol("*HL-FORWARD-MT-COMBOS-MAX-RECURSION-DEPTH*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $debug_null_hl_forward_mt_combosP$ = makeSymbol("*DEBUG-NULL-HL-FORWARD-MT-COMBOS?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $perform_opaque_support_verification$ = makeSymbol("*PERFORM-OPAQUE-SUPPORT-VERIFICATION*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $default_hl_verify_query_properties$ = makeSymbol("*DEFAULT-HL-VERIFY-QUERY-PROPERTIES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $default_hl_justify_query_properties$ = makeSymbol("*DEFAULT-HL-JUSTIFY-QUERY-PROPERTIES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $within_hl_justify_queryP$ = makeSymbol("*WITHIN-HL-JUSTIFY-QUERY?*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(new SubLObject[]{ reader_make_constant_shell("isa"), reader_make_constant_shell("quotedIsa"), reader_make_constant_shell("genls"), reader_make_constant_shell("termOfUnit"), reader_make_constant_shell("equals"), reader_make_constant_shell("equalSymbols"), reader_make_constant_shell("different"), reader_make_constant_shell("differentSymbols"), reader_make_constant_shell("evaluate"), reader_make_constant_shell("elementOf"), reader_make_constant_shell("subsetOf"), reader_make_constant_shell("disjointWith"), reader_make_constant_shell("genlMt"), reader_make_constant_shell("genlPreds"), reader_make_constant_shell("genlInverse"), reader_make_constant_shell("negationPreds"), reader_make_constant_shell("negationInverse"), reader_make_constant_shell("conceptuallyRelated"), reader_make_constant_shell("incompatibleMt") });

    public static final SubLSymbol $hl_support_modules$ = makeSymbol("*HL-SUPPORT-MODULES*");

    static private final SubLList $list3 = list(makeKeyword("VERIFY"), makeKeyword("JUSTIFY"), makeKeyword("VALIDATE"), makeKeyword("FORWARD-MT-COMBOS"));

    private static final SubLSymbol HL_SUPPORT_MODULE_P = makeSymbol("HL-SUPPORT-MODULE-P");

    static private final SubLList $list5 = list(makeSymbol("OBJECT"));

    static private final SubLString $str6$Return_T_iff_OBJECT_is_an_HL_supp = makeString("Return T iff OBJECT is an HL support module.");

    static private final SubLList $list7 = list(makeSymbol("BOOLEANP"));

    static private final SubLString $str9$_S_was_not_a_valid_hl_support_mod = makeString("~S was not a valid hl-support-module indicator");

    private static final SubLSymbol $FORWARD_MT_COMBOS = makeKeyword("FORWARD-MT-COMBOS");

    private static final SubLSymbol $sym19$FORT_BEING_REMOVED_ = makeSymbol("FORT-BEING-REMOVED?");

    private static final SubLSymbol $HL_SUPPORT_JUSTIFY = makeKeyword("HL-SUPPORT-JUSTIFY");

    private static final SubLSymbol $sym21$VALID_SUPPORT_ = makeSymbol("VALID-SUPPORT?");

    private static final SubLString $str22$Throwing_out_HL_justification__S_ = makeString("Throwing out HL justification ~S~%  with invalid support ~S");





    private static final SubLString $str27$Adding__S_to_supports_list_from__ = makeString("Adding ~S to supports list from ~S");

    private static final SubLString $str29$null_mt_combos_from__hl_forward_m = makeString("null mt-combos from (hl-forward-mt-combos ~S) but mts found from justification ~S");

    private static final SubLString $str30$bad_mt_combos_from__hl_forward_mt = makeString("bad mt-combos from (hl-forward-mt-combos ~S)");



    private static final SubLSymbol HL_SUPPORT_MT = makeSymbol("HL-SUPPORT-MT");

    private static final SubLSymbol $sym36$GAF_ASSERTION_ = makeSymbol("GAF-ASSERTION?");

    private static final SubLSymbol $sym37$ASSERTED_ASSERTION_ = makeSymbol("ASSERTED-ASSERTION?");

    private static final SubLSymbol TERM_OF_UNIT_ASSERTION_P = makeSymbol("TERM-OF-UNIT-ASSERTION-P");

    private static final SubLSymbol $sym39$_ = makeSymbol("<");

    private static final SubLSymbol ASSERTION_DEPENDENT_COUNT = makeSymbol("ASSERTION-DEPENDENT-COUNT");

    private static final SubLList $list41 = list(makeKeyword("VERIFY"), makeSymbol("TRUE"));

    private static final SubLList $list42 = list(makeSymbol("HL-MODULE"), makeSymbol("LITERAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLList $list43 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-OPAQUE"));















    public static final SubLSymbol $bookkeeping_justification_assertion_mt$ = makeSymbol("*BOOKKEEPING-JUSTIFICATION-ASSERTION-MT*");

    private static final SubLSymbol CACHED_FIND_ASSERTION_CYCL = makeSymbol("CACHED-FIND-ASSERTION-CYCL");

    private static final SubLSymbol $cached_find_assertion_cycl_caching_state$ = makeSymbol("*CACHED-FIND-ASSERTION-CYCL-CACHING-STATE*");

    private static final SubLList $list60 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-BOOKKEEPING"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-BOOKKEEPING"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-BOOKKEEPING"));

    private static final SubLList $list61 = list(makeSymbol("OBJECT"), makeSymbol("COLLECTION"));



    private static final SubLList $list63 = list(reader_make_constant_shell("isa"), reader_make_constant_shell("quotedIsa"));

    private static final SubLList $list65 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-DEFN"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-DEFN"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-DEFN"));

    private static final SubLList $list66 = list(makeSymbol("ELEMENT"), cons(makeSymbol("THESET"), makeSymbol("ARGS")));

    private static final SubLList $list68 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-ELEMENTOF"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-ELEMENTOF"));





    private static final SubLList $list72 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-SUBSETOF"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-SUBSETOF"));

    private static final SubLList $list73 = list(makeSymbol("COL1"), makeSymbol("COL2"));

    private static final SubLObject $$True_JustificationTruth = reader_make_constant_shell("True-JustificationTruth");

    private static final SubLObject $$False_JustificationTruth = reader_make_constant_shell("False-JustificationTruth");

    private static final SubLList $list78 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-SIBLING-DISJOINT"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-SIBLING-DISJOINT"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-SIBLING-DISJOINT"));





    private static final SubLString $str85$Unexpected_intermediate_step_vali = makeString("Unexpected intermediate step validation level ~s");

    private static final SubLList $list87 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-EQUALITY"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-EQUALITY"), makeKeyword("VALIDATE"), makeSymbol("HL-VALIDATE-EQUALITY"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-EQUALITY"));



    static private final SubLList $list89 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-EVAL"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-EVAL"));

    private static final SubLList $list90 = list(makeSymbol("PRED"), makeSymbol("ARG1"), makeSymbol("ARG2"));









    private static final SubLSymbol MAX_FLOOR_MTS_WHERE_ARG_CONSTRAINTS_MET = makeSymbol("MAX-FLOOR-MTS-WHERE-ARG-CONSTRAINTS-MET");

    static private final SubLList $list99 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-REFLEXIVE"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-REFLEXIVE"), makeKeyword("VALIDATE"), makeSymbol("HL-VALIDATE-REFLEXIVE"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-REFLEXIVE"));

    private static final SubLList $list100 = list(makeSymbol("ARG1"), makeSymbol("ARG2"));

    static private final SubLList $list101 = list(makeSymbol("PREDICATE"), makeSymbol("ARG1"), makeSymbol("ARG2"));





    private static final SubLList $list106 = cons(makeSymbol("REFLEX-MT"), makeSymbol("COL"));

    private static final SubLSymbol $sym107$TERM__ = makeSymbol("TERM-<");

    static private final SubLList $list109 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-REFLEXIVE-ON"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-REFLEXIVE-ON"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-REFLEXIVE-ON"));

    private static final SubLList $list111 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-TRANSITIVITY"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-TRANSITIVITY"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-TRANSITIVITY"));

    static private final SubLList $list113 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-CONTEXTUAL-TRANSITIVITY"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-TRANSITIVITY"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-CONTEXTUAL-TRANSITIVITY"));

    private static final SubLList $list116 = list(makeSymbol("HL-MODULE"), makeSymbol("ASENT"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLList $list118 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-TVA"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-TVA"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-TVA"));

    static private final SubLList $list119 = list(makeSymbol("HL-MODULE"), makeSymbol("ASENT"), makeSymbol("SUPPORT-MT"), makeSymbol("TV"));

    static private final SubLList $list121 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-RTV"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-RTV"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-RTV"));

    static private final SubLList $list122 = list(makeSymbol("HL-MODULE"), makeSymbol("FORMULA"), makeSymbol("MT"), makeSymbol("TV"));



    private static final SubLList $list125 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-MINIMIZE"));

    private static final SubLList $list127 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-CONSISTENT"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-CONSISTENT"));

    static private final SubLList $list129 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-CONCEPTUALLY-RELATED"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-CONCEPTUALLY-RELATED"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-CONCEPTUALLY-RELATED"));





    static private final SubLList $list132 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-ADMIT"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-ADMIT"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-ADMIT"));

    private static final SubLList $list133 = list(makeSymbol("TERM"), makeSymbol("ARGNUM"), makeSymbol("RELATION"));

    private static final SubLList $list136 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-SKSI"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-SKSI"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-SKSI"));

    private static final SubLList $list138 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-CSQL"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-CSQL"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-CSQL"));

    private static final SubLSymbol $SOURCE_SCHEMA_OBJECT_FN = makeKeyword("SOURCE-SCHEMA-OBJECT-FN");

    private static final SubLList $list140 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-SOURCE-SCHEMA-OBJECT-FN"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-SOURCE-SCHEMA-OBJECT-FN"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-SOURCE-SCHEMA-OBJECT-FN"));

    private static final SubLList $list142 = list(makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-REFORMULATE"));

    private static final SubLList $list143 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-ASSERTION"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-ASSERTION"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-ASSERTION"));

    private static final SubLList $list144 = list(makeSymbol("HL-MODULE"), makeSymbol("EL-SENTENCE"), makeSymbol("MT"), makeSymbol("TV"));

    static private final SubLList $list145 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-GAF"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-GAF"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-GAF"));





    private static final SubLString $str148$Unexpected_predicate___S = makeString("Unexpected predicate: ~S");

    private static final SubLSymbol $sym149$_EXIT = makeSymbol("%EXIT");

    private static final SubLList $list150 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-MENTIONS"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-MENTIONS"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-MENTIONS"));

    private static final SubLList $list151 = list(makeSymbol("HL-MODULE"), makeSymbol("SENTENCE"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLList $list154 = list(list(makeSymbol("LITERAL-VAR"), makeSymbol("TV-VAR"), makeSymbol("LITERAL"), makeSymbol("TV")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol EL_NEGATION_P = makeSymbol("EL-NEGATION-P");

    static private final SubLList $list159 = list(makeKeyword("REGULARIZE"));

    private static final SubLSymbol INVERSE_TV = makeSymbol("INVERSE-TV");

    private static final SubLList $list163 = list(makeKeyword("ISA"), makeKeyword("GENLS"));







    private static final SubLSymbol HL_FORWARD_MT_COMBOS_ISA = makeSymbol("HL-FORWARD-MT-COMBOS-ISA");

    private static final SubLList $list169 = list(makeSymbol("ARG1"), makeSymbol("ARG2"), makeSymbol("ARG3"));

    private static final SubLSymbol $hl_forward_mt_combos_isa_caching_state$ = makeSymbol("*HL-FORWARD-MT-COMBOS-ISA-CACHING-STATE*");

    private static final SubLInteger $int$1024 = makeInteger(1024);

    private static final SubLSymbol CLEAR_HL_FORWARD_MT_COMBOS_ISA = makeSymbol("CLEAR-HL-FORWARD-MT-COMBOS-ISA");

    private static final SubLList $list173 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-ISA"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-ISA"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-ISA"));

    private static final SubLList $list174 = list(makeSymbol("GAF"), makeSymbol("TV"));

    static private final SubLList $list175 = list(reader_make_constant_shell("disjointWith"));

    private static final SubLList $list176 = list(makeSymbol("MT1"), makeSymbol("MT2"));

    private static final SubLList $list178 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-INCOMPATIBLE-MTS"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-INCOMPATIBLE-MTS"));





    private static final SubLList $list182 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-GENLS"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-GENLS"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-GENLS"));





    static private final SubLList $list185 = list(makeSymbol("TERM1"), makeSymbol("TERM2"));

    static private final SubLList $list187 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-DISJOINTWITH"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-DISJOINTWITH"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-DISJOINTWITH"));

    private static final SubLList $list189 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-GENLMT"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-GENLMT"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-GENLMT"));

    static private final SubLList $list190 = list(makeSymbol("PREDICATE"), makeSymbol("SPEC"), makeSymbol("GENL"));





    static private final SubLList $list194 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-GENLPREDS"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-GENLPREDS"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-GENLPREDS"));





    private static final SubLList $list198 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-NEGATIONPREDS"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-NEGATIONPREDS"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-NEGATIONPREDS"));

    private static final SubLObject $$temporallySubsumes_TypeType = reader_make_constant_shell("temporallySubsumes-TypeType");

    private static final SubLObject $$temporallySubsumes_InsType = reader_make_constant_shell("temporallySubsumes-InsType");



    private static final SubLString $str202$Continue_anyway_ = makeString("Continue anyway.");

    private static final SubLString $str203$Unsupported_predicate___a__for__T = makeString("Unsupported predicate, ~a, for :TIME module");

    static private final SubLList $list205 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-TIME-SENTENCE"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-TRUE-MTS-FOR-TIME-SENTENCE"), makeKeyword("VALIDATE"), makeSymbol("HL-VALIDATE-TIME"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-TIME-SENTENCE"));

    static private final SubLList $list207 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-CYCLIFY"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-CYCLIFY"), makeKeyword("FORWARD-MT-COMBOS"), NIL);

    private static final SubLList $list209 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-NC-PARSE"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-NC-PARSE"), makeKeyword("FORWARD-MT-COMBOS"), NIL);

    private static final SubLSymbol $CANDIDATE_NC_TESTS = makeKeyword("CANDIDATE-NC-TESTS");

    private static final SubLList $list211 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-CANDIDATE-NC-TEST"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-CANDIDATE-NC-TEST"), makeKeyword("FORWARD-MT-COMBOS"), NIL);

    private static final SubLSymbol $ASSERTED_ARG1_BINARY_PREDS = makeKeyword("ASSERTED-ARG1-BINARY-PREDS");

    private static final SubLList $list213 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-ASSERTED-ARG1-BINARY-PREDS"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-ASSERTED-ARG1-BINARY-PREDS"), makeKeyword("FORWARD-MT-COMBOS"), NIL);

    private static final SubLList $list215 = list(makeKeyword("VERIFY"), makeSymbol("REMOVAL-FCP-VERIFY"), makeKeyword("JUSTIFY"), makeSymbol("REMOVAL-FCP-JUSTIFY"), makeKeyword("FORWARD-MT-COMBOS"), NIL);

    private static final SubLList $list217 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-SHOP-EFFECT"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-SHOP-EFFECT"), makeKeyword("FORWARD-MT-COMBOS"), NIL);

    private static final SubLList $list218 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("RETURN"), makeKeyword("BINDINGS"), makeKeyword("RESULT-UNIQUENESS"), makeKeyword("BINDINGS"));

    private static final SubLObject $$ist_Asserted = reader_make_constant_shell("ist-Asserted");

    private static final SubLSymbol $kw220$CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");

    private static final SubLList $list221 = list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("RETURN"), makeKeyword("SUPPORTS"), makeKeyword("RESULT-UNIQUENESS"), makeKeyword("PROOF"));

    private static final SubLList $list223 = list(makeSymbol("COMBO-MTS"), makeSymbol("COMBO-SUPPORTS"));

    private static final SubLList $list225 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-QUERY"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-QUERY"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-OF-QUERY"));

    private static final SubLString $str226$Halo_feature_not_supported__Suppo = makeString("Halo feature not supported. Support unverifiable: ~a~%");

    private static final SubLString $str227$Halo_feature_not_supported__Suppo = makeString("Halo feature not supported. Support-mts not computable: ~a~%");

    private static final SubLSymbol $MATRIX_OF_REACTION_TYPE = makeKeyword("MATRIX-OF-REACTION-TYPE");

    private static final SubLList $list229 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-MATRIX-OF-REACTION-TYPE"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-MATRIX-OF-REACTION-TYPE"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-MATRIX-OF-REACTION-TYPE"));

    private static final SubLSymbol HL_VERIFY_PARSE_TREE_RELATION = makeSymbol("HL-VERIFY-PARSE-TREE-RELATION");

    private static final SubLSymbol HL_JUSTIFY_PARSE_TREE_RELATION = makeSymbol("HL-JUSTIFY-PARSE-TREE-RELATION");

    private static final SubLList $list233 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-PARSE-TREE-RELATION"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-PARSE-TREE-RELATION"));

    private static final SubLList $list235 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-WORD-STRINGS"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-WORD-STRINGS"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-WORD-STRINGS"));

    private static final SubLList $list237 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-TERM-PHRASES"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-TERM-PHRASES"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-TERM-PHRASES"));

    private static final SubLSymbol $RKF_IRRELEVANT_FORT_CACHE = makeKeyword("RKF-IRRELEVANT-FORT-CACHE");

    private static final SubLList $list239 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-RKF-IRRELEVANT-FORT-CACHE"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-RKF-IRRELEVANT-FORT-CACHE"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-RKF-IRRELEVANT-FORT-CACHE"));

    public static final SubLObject hl_predicate_p_alt(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $hl_predicates$.getGlobalValue());
    }

    public static SubLObject hl_predicate_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $hl_predicates$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject non_hl_predicate_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != forts.fort_p(v_object)) && (NIL == com.cyc.cycjava.cycl.hl_supports.hl_predicate_p(v_object)));
    }

    public static SubLObject non_hl_predicate_p(final SubLObject v_object) {
        return makeBoolean((NIL != forts.fort_p(v_object)) && (NIL == hl_predicate_p(v_object)));
    }

    public static final SubLObject declare_hl_predicate_alt(SubLObject predicate) {
        SubLTrampolineFile.checkType(predicate, FORT_P);
        {
            SubLObject item_var = predicate;
            if (NIL == member(item_var, $hl_predicates$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $hl_predicates$.setGlobalValue(cons(item_var, $hl_predicates$.getGlobalValue()));
            }
        }
        return NIL;
    }

    public static SubLObject declare_hl_predicate(final SubLObject predicate) {
        assert NIL != forts.fort_p(predicate) : "! forts.fort_p(predicate) " + ("forts.fort_p(predicate) " + "CommonSymbols.NIL != forts.fort_p(predicate) ") + predicate;
        if (NIL == member(predicate, $hl_predicates$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $hl_predicates$.setGlobalValue(cons(predicate, $hl_predicates$.getGlobalValue()));
        }
        return NIL;
    }

    public static final SubLObject undeclare_hl_predicate_alt(SubLObject predicate) {
        SubLTrampolineFile.checkType(predicate, FORT_P);
        $hl_predicates$.setGlobalValue(remove(predicate, $hl_predicates$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    public static SubLObject undeclare_hl_predicate(final SubLObject predicate) {
        assert NIL != forts.fort_p(predicate) : "! forts.fort_p(predicate) " + ("forts.fort_p(predicate) " + "CommonSymbols.NIL != forts.fort_p(predicate) ") + predicate;
        $hl_predicates$.setGlobalValue(remove(predicate, $hl_predicates$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    public static final SubLObject hl_support_modules_alt() {
        return $hl_support_modules$.getGlobalValue();
    }

    public static SubLObject hl_support_modules() {
        return $hl_support_modules$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is an HL support module.
     */
    @LispMethod(comment = "Return T iff OBJECT is an HL support module.")
    public static final SubLObject hl_support_module_p_alt(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $hl_support_modules$.getGlobalValue());
    }

    /**
     * Return T iff OBJECT is an HL support module.
     */
    @LispMethod(comment = "Return T iff OBJECT is an HL support module.")
    public static SubLObject hl_support_module_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $hl_support_modules$.getGlobalValue());
    }

    /**
     * Declare NAME as a new HL support module
     */
    @LispMethod(comment = "Declare NAME as a new HL support module")
    public static final SubLObject setup_hl_support_module_alt(SubLObject name, SubLObject plist) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(name, KEYWORDP);
            {
                SubLObject cdolist_list_var = $hl_support_module_plist_indicators$.getDynamicValue(thread);
                SubLObject indicator = NIL;
                for (indicator = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , indicator = cdolist_list_var.first()) {
                    remprop(name, indicator);
                }
            }
            {
                SubLObject indicator = NIL;
                SubLObject value = NIL;
                for (indicator = plist.first(), value = second(plist); NIL != plist; indicator = plist.first() , value = second(plist)) {
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == member(indicator, $hl_support_module_plist_indicators$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                            Errors.error($str_alt9$_S_was_not_a_valid_hl_support_mod, indicator);
                        }
                    }
                    put(name, indicator, value);
                    plist = cddr(plist);
                }
                {
                    SubLObject item_var = name;
                    if (NIL == member(item_var, $hl_support_modules$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                        $hl_support_modules$.setGlobalValue(cons(item_var, $hl_support_modules$.getGlobalValue()));
                    }
                }
                return name;
            }
        }
    }

    /**
     * Declare NAME as a new HL support module
     */
    @LispMethod(comment = "Declare NAME as a new HL support module")
    public static SubLObject setup_hl_support_module(final SubLObject name, SubLObject plist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != keywordp(name) : "! keywordp(name) " + ("Types.keywordp(name) " + "CommonSymbols.NIL != Types.keywordp(name) ") + name;
        SubLObject cdolist_list_var = $hl_support_module_plist_indicators$.getDynamicValue(thread);
        SubLObject indicator = NIL;
        indicator = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            remprop(name, indicator);
            cdolist_list_var = cdolist_list_var.rest();
            indicator = cdolist_list_var.first();
        } 
        SubLObject indicator2 = NIL;
        SubLObject value = NIL;
        indicator2 = plist.first();
        value = second(plist);
        while (NIL != plist) {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == member(indicator2, $hl_support_module_plist_indicators$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED))) {
                Errors.error($str9$_S_was_not_a_valid_hl_support_mod, indicator2);
            }
            put(name, indicator2, value);
            plist = cddr(plist);
            indicator2 = plist.first();
            value = second(plist);
        } 
        if (NIL == member(name, $hl_support_modules$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $hl_support_modules$.setGlobalValue(cons(name, $hl_support_modules$.getGlobalValue()));
        }
        return name;
    }

    public static final SubLObject hl_support_module_verify_func_alt(SubLObject hl_support_module) {
        return get(hl_support_module, $VERIFY, NIL);
    }

    public static SubLObject hl_support_module_verify_func(final SubLObject hl_support_module) {
        return get(hl_support_module, $VERIFY, NIL);
    }

    public static final SubLObject hl_support_module_justify_func_alt(SubLObject hl_support_module) {
        return get(hl_support_module, $JUSTIFY, NIL);
    }

    public static SubLObject hl_support_module_justify_func(final SubLObject hl_support_module) {
        return get(hl_support_module, $JUSTIFY, NIL);
    }

    public static final SubLObject hl_support_module_validate_func_alt(SubLObject hl_support_module) {
        return get(hl_support_module, $VALIDATE, NIL);
    }

    public static SubLObject hl_support_module_validate_func(final SubLObject hl_support_module) {
        return get(hl_support_module, $VALIDATE, NIL);
    }

    public static final SubLObject hl_support_module_forward_mt_combos_func_alt(SubLObject hl_support_module) {
        return get(hl_support_module, $FORWARD_MT_COMBOS, LIST);
    }

    public static SubLObject hl_support_module_forward_mt_combos_func(final SubLObject hl_support_module) {
        return get(hl_support_module, $FORWARD_MT_COMBOS, LIST);
    }

    public static final SubLObject hl_verify_alt(SubLObject support) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(support, SUPPORT_P);
            if (NIL != arguments.ill_formed_hl_supportP(support)) {
                return NIL;
            }
            {
                SubLObject hl_module = arguments.support_module(support);
                if (NIL == com.cyc.cycjava.cycl.hl_supports.hl_support_module_p(hl_module)) {
                    return NIL;
                }
                {
                    SubLObject verify_func = com.cyc.cycjava.cycl.hl_supports.hl_support_module_verify_func(hl_module);
                    if (NIL == verify_func) {
                        return T;
                    }
                    {
                        SubLObject result = NIL;
                        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(arguments.support_mt(support));
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                result = funcall(verify_func, support);
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                            }
                        }
                        return list_utilities.sublisp_boolean(result);
                    }
                }
            }
        }
    }

    public static SubLObject hl_verify(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != arguments.support_p(support) : "! arguments.support_p(support) " + ("arguments.support_p(support) " + "CommonSymbols.NIL != arguments.support_p(support) ") + support;
        if (NIL != arguments.ill_formed_hl_supportP(support)) {
            return NIL;
        }
        final SubLObject hl_module = arguments.support_module(support);
        if (NIL == hl_support_module_p(hl_module)) {
            return NIL;
        }
        final SubLObject verify_func = hl_support_module_verify_func(hl_module);
        if (NIL == verify_func) {
            return T;
        }
        SubLObject result = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(arguments.support_mt(support));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = funcall(verify_func, support);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return list_utilities.sublisp_boolean(result);
    }

    /**
     *
     *
     * @return listp; a list of supports
     */
    @LispMethod(comment = "@return listp; a list of supports")
    public static final SubLObject hl_justify_alt(SubLObject support) {
        SubLTrampolineFile.checkType(support, SUPPORT_P);
        return arguments.support_justification(support);
    }

    /**
     *
     *
     * @return listp; a list of supports
     */
    @LispMethod(comment = "@return listp; a list of supports")
    public static SubLObject hl_justify(final SubLObject support) {
        assert NIL != arguments.support_p(support) : "! arguments.support_p(support) " + ("arguments.support_p(support) " + "CommonSymbols.NIL != arguments.support_p(support) ") + support;
        return arguments.support_justification(support);
    }

    /**
     * Return a fully expanded justification for SUPPORT, which will be supports which can not be further justified.
     */
    @LispMethod(comment = "Return a fully expanded justification for SUPPORT, which will be supports which can not be further justified.")
    public static final SubLObject hl_justify_expanded_alt(SubLObject support) {
        SubLTrampolineFile.checkType(support, SUPPORT_P);
        {
            SubLObject justification = com.cyc.cycjava.cycl.hl_supports.hl_justify(support);
            if ((NIL != list_utilities.singletonP(justification)) && support.equal(justification.first())) {
                return copy_list(justification);
            } else {
                return com.cyc.cycjava.cycl.hl_supports.hl_justification_expand(justification);
            }
        }
    }

    /**
     * Return a fully expanded justification for SUPPORT, which will be supports which can not be further justified.
     */
    @LispMethod(comment = "Return a fully expanded justification for SUPPORT, which will be supports which can not be further justified.")
    public static SubLObject hl_justify_expanded(final SubLObject support) {
        assert NIL != arguments.support_p(support) : "! arguments.support_p(support) " + ("arguments.support_p(support) " + "CommonSymbols.NIL != arguments.support_p(support) ") + support;
        final SubLObject justification = hl_justify(support);
        if ((NIL != list_utilities.singletonP(justification)) && support.equal(justification.first())) {
            return copy_list(justification);
        }
        return hl_justification_expand(justification);
    }

    /**
     * Return a fully expanded version of JUSTIFICATION, which will be supports which can not be further justified.
     */
    @LispMethod(comment = "Return a fully expanded version of JUSTIFICATION, which will be supports which can not be further justified.")
    public static final SubLObject hl_justification_expand_alt(SubLObject justification) {
        SubLTrampolineFile.checkType(justification, LISTP);
        {
            SubLObject sub_justifications = NIL;
            SubLObject cdolist_list_var = justification;
            SubLObject sub_support = NIL;
            for (sub_support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sub_support = cdolist_list_var.first()) {
                sub_justifications = cons(com.cyc.cycjava.cycl.hl_supports.hl_justify_expanded(sub_support), sub_justifications);
            }
            sub_justifications = nreverse(sub_justifications);
            {
                SubLObject expanded_justification = apply(symbol_function(APPEND), sub_justifications);
                expanded_justification = delete_duplicates(expanded_justification, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return expanded_justification;
            }
        }
    }

    /**
     * Return a fully expanded version of JUSTIFICATION, which will be supports which can not be further justified.
     */
    @LispMethod(comment = "Return a fully expanded version of JUSTIFICATION, which will be supports which can not be further justified.")
    public static SubLObject hl_justification_expand(final SubLObject justification) {
        assert NIL != arguments.hl_justification_p(justification) : "! arguments.hl_justification_p(justification) " + ("arguments.hl_justification_p(justification) " + "CommonSymbols.NIL != arguments.hl_justification_p(justification) ") + justification;
        SubLObject sub_justifications = NIL;
        SubLObject cdolist_list_var = justification;
        SubLObject sub_support = NIL;
        sub_support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sub_justifications = cons(hl_justify_expanded(sub_support), sub_justifications);
            cdolist_list_var = cdolist_list_var.rest();
            sub_support = cdolist_list_var.first();
        } 
        sub_justifications = nreverse(sub_justifications);
        SubLObject expanded_justification = apply(symbol_function(APPEND), sub_justifications);
        expanded_justification = delete_duplicates(expanded_justification, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return expanded_justification;
    }

    public static final SubLObject hl_support_justify_alt(SubLObject hl_support) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(hl_support, HL_SUPPORT_P);
            {
                SubLObject module = arguments.hl_support_module(hl_support);
                SubLObject justification = NIL;
                if (NIL != com.cyc.cycjava.cycl.hl_supports.hl_support_module_p(module)) {
                    {
                        SubLObject justify_func = com.cyc.cycjava.cycl.hl_supports.hl_support_module_justify_func(module);
                        if (NIL != justify_func) {
                            {
                                SubLObject mt = arguments.hl_support_mt(hl_support);
                                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                                {
                                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                        justification = funcall(justify_func, hl_support);
                                    } finally {
                                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    }
                    if (NIL == arguments.non_empty_hl_justification_p(justification)) {
                        justification = com.cyc.cycjava.cycl.hl_supports.hl_trivial_justification(hl_support);
                    }
                }
                return justification;
            }
        }
    }

    public static SubLObject hl_support_justify(final SubLObject hl_support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != arguments.hl_support_p(hl_support) : "! arguments.hl_support_p(hl_support) " + ("arguments.hl_support_p(hl_support) " + "CommonSymbols.NIL != arguments.hl_support_p(hl_support) ") + hl_support;
        if ((NIL != cycl_utilities.expression_find_if($sym19$FORT_BEING_REMOVED_, arguments.support_sentence(hl_support), UNPROVIDED, UNPROVIDED)) || (NIL != cycl_utilities.expression_find_if($sym19$FORT_BEING_REMOVED_, arguments.support_mt(hl_support), UNPROVIDED, UNPROVIDED))) {
            return NIL;
        }
        final SubLObject module = arguments.hl_support_module(hl_support);
        SubLObject justification = NIL;
        if (NIL != hl_support_module_p(module)) {
            final SubLObject justify_func = hl_support_module_justify_func(module);
            if (NIL != justify_func) {
                final SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
                final SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
                final SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
                final SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
                if ((NIL != last_metric_type) && (NIL != last_metric)) {
                    inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, ZERO_INTEGER);
                }
                final SubLObject _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
                final SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
                final SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
                final SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
                try {
                    hl_macros.$forward_inference_metric_last_metric_type$.bind($HL_SUPPORT_JUSTIFY, thread);
                    hl_macros.$forward_inference_metric_last_metric$.bind(justify_func, thread);
                    hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind(NIL, thread);
                    hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind(NIL, thread);
                    try {
                        final SubLObject mt = arguments.hl_support_mt(hl_support);
                        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                        final SubLObject _prev_bind_0_$1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            justification = funcall(justify_func, hl_support);
                        } finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$3, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$2, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0_$1, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            inference_metrics.increment_forward_inference_metrics($HL_SUPPORT_JUSTIFY, justify_func, NIL, NIL, NIL);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                        }
                    }
                } finally {
                    hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
                    hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
                    hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
                    hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
                }
            }
            if (NIL == arguments.non_empty_hl_justification_p(justification)) {
                justification = hl_trivial_justification(hl_support);
            }
        }
        if (NIL == list_utilities.every_in_list($sym21$VALID_SUPPORT_, justification, UNPROVIDED)) {
            Errors.warn($str22$Throwing_out_HL_justification__S_, justification, hl_support);
            return NIL;
        }
        if (arguments.hl_support_module(hl_support) != $OPAQUE) {
            SubLObject cdolist_list_var = support_embedded_assertions(hl_support);
            SubLObject embedded_assertion = NIL;
            embedded_assertion = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == list_utilities.member_kbeqP(embedded_assertion, justification)) {
                    final SubLObject item_var = arguments.make_hl_support($MENTIONS, make_unary_formula($$assertionExists, embedded_assertion), $$BaseKB, UNPROVIDED);
                    if (NIL == member(item_var, justification, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        justification = cons(item_var, justification);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                embedded_assertion = cdolist_list_var.first();
            } 
        }
        return justification;
    }

    public static final SubLObject hl_trivial_justification_alt(SubLObject support) {
        return list(support);
    }

    public static SubLObject hl_trivial_justification(final SubLObject support) {
        return list(support);
    }

    public static SubLObject categorize_justification(final SubLObject justification) {
        assert NIL != arguments.hl_justification_p(justification) : "! arguments.hl_justification_p(justification) " + ("arguments.hl_justification_p(justification) " + "CommonSymbols.NIL != arguments.hl_justification_p(justification) ") + justification;
        SubLObject rules = NIL;
        SubLObject gafs = NIL;
        SubLObject v_hl_supports = NIL;
        SubLObject cdolist_list_var = justification;
        SubLObject support = NIL;
        support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != kb_hl_support_handles.kb_hl_support_p(support)) {
                support = kb_hl_supports_high.kb_hl_support_hl_support(support);
            }
            if (NIL != arguments.hl_support_p(support)) {
                final SubLObject item_var = support;
                if (NIL == member(item_var, v_hl_supports, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                    v_hl_supports = cons(item_var, v_hl_supports);
                }
            } else
                if (NIL != assertions_high.rule_assertionP(support)) {
                    final SubLObject item_var = support;
                    if (NIL == member(item_var, rules, symbol_function(EQL), symbol_function(IDENTITY))) {
                        rules = cons(item_var, rules);
                    }
                } else {
                    final SubLObject item_var = support;
                    if (NIL == member(item_var, gafs, symbol_function(EQL), symbol_function(IDENTITY))) {
                        gafs = cons(item_var, gafs);
                    }
                }

            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        } 
        rules = assertion_utilities.sort_assertions(rules);
        gafs = assertion_utilities.sort_assertions(gafs);
        v_hl_supports = kb_utilities.sort_terms(v_hl_supports, NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return values(rules, gafs, v_hl_supports);
    }

    public static SubLObject supports_with_embedded_assertions(final SubLObject supports) {
        return append(supports, supports_embedded_assertions(supports));
    }

    public static SubLObject supports_embedded_assertions(final SubLObject supports) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = supports;
        SubLObject support = NIL;
        support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$5 = support_embedded_assertions(support);
            SubLObject missed_assertion = NIL;
            missed_assertion = cdolist_list_var_$5.first();
            while (NIL != cdolist_list_var_$5) {
                if (NIL == list_utilities.member_kbeqP(missed_assertion, supports)) {
                    Errors.warn($str27$Adding__S_to_supports_list_from__, missed_assertion, support);
                    result = cons(missed_assertion, result);
                }
                cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                missed_assertion = cdolist_list_var_$5.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject support_embedded_assertions(final SubLObject support) {
        if (NIL != arguments.hl_support_p(support)) {
            return cycl_utilities.expression_gather(support, ASSERTION_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    /**
     *
     *
     * @return listp; a list of supports
     */
    @LispMethod(comment = "@return listp; a list of supports")
    public static final SubLObject hl_validate_alt(SubLObject support, SubLObject validation_level) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(support, SUPPORT_P);
            {
                SubLObject hl_module = arguments.support_module(support);
                if (NIL == com.cyc.cycjava.cycl.hl_supports.hl_support_module_p(hl_module)) {
                    return NIL;
                }
                {
                    SubLObject validate_func = com.cyc.cycjava.cycl.hl_supports.hl_support_module_validate_func(hl_module);
                    if (NIL == validate_func) {
                        return T;
                    }
                    {
                        SubLObject result = NIL;
                        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(arguments.support_mt(support));
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                result = funcall(validate_func, support, validation_level);
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                            }
                        }
                        return result;
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return listp; a list of supports
     */
    @LispMethod(comment = "@return listp; a list of supports")
    public static SubLObject hl_validate(final SubLObject support, final SubLObject validation_level) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != arguments.support_p(support) : "! arguments.support_p(support) " + ("arguments.support_p(support) " + "CommonSymbols.NIL != arguments.support_p(support) ") + support;
        final SubLObject hl_module = arguments.support_module(support);
        if (NIL == hl_support_module_p(hl_module)) {
            return NIL;
        }
        final SubLObject validate_func = hl_support_module_validate_func(hl_module);
        if (NIL == validate_func) {
            return T;
        }
        SubLObject result = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(arguments.support_mt(support));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = funcall(validate_func, support, validation_level);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     *
     *
     * @return listp; a list of supports
     */
    @LispMethod(comment = "@return listp; a list of supports")
    public static final SubLObject hl_validate_wff_violations_alt(SubLObject support, SubLObject validation_level) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = wff_vars.$wff_violations$.currentBinding(thread);
                    try {
                        wff_vars.$wff_violations$.bind(NIL, thread);
                        {
                            SubLObject _prev_bind_0_1 = at_vars.$noting_at_violationsP$.currentBinding(thread);
                            SubLObject _prev_bind_1 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
                            SubLObject _prev_bind_2 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
                            SubLObject _prev_bind_3 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
                            try {
                                at_vars.$noting_at_violationsP$.bind(T, thread);
                                at_vars.$accumulating_at_violationsP$.bind(T, thread);
                                wff_vars.$noting_wff_violationsP$.bind(T, thread);
                                wff_vars.$accumulating_wff_violationsP$.bind(T, thread);
                                com.cyc.cycjava.cycl.hl_supports.hl_validate(support, validation_level);
                            } finally {
                                wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_3, thread);
                                wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_2, thread);
                                at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_1, thread);
                                at_vars.$noting_at_violationsP$.rebind(_prev_bind_0_1, thread);
                            }
                        }
                        result = wff_vars.$wff_violations$.getDynamicValue(thread);
                    } finally {
                        wff_vars.$wff_violations$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @return listp; a list of supports
     */
    @LispMethod(comment = "@return listp; a list of supports")
    public static SubLObject hl_validate_wff_violations(final SubLObject support, final SubLObject validation_level) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = wff_vars.$wff_violations$.currentBinding(thread);
        try {
            wff_vars.$wff_violations$.bind(NIL, thread);
            final SubLObject _prev_bind_0_$6 = at_vars.$noting_at_violationsP$.currentBinding(thread);
            final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
            final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
            final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
            try {
                at_vars.$noting_at_violationsP$.bind(T, thread);
                at_vars.$accumulating_at_violationsP$.bind(T, thread);
                wff_vars.$noting_wff_violationsP$.bind(T, thread);
                wff_vars.$accumulating_wff_violationsP$.bind(T, thread);
                hl_validate(support, validation_level);
            } finally {
                wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
                wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
                at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
                at_vars.$noting_at_violationsP$.rebind(_prev_bind_0_$6, thread);
            }
            result = wff_vars.$wff_violations$.getDynamicValue(thread);
        } finally {
            wff_vars.$wff_violations$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject hl_forward_mt_combos_alt(SubLObject support) {
        {
            SubLObject hl_module = arguments.support_module(support);
            SubLTrampolineFile.checkType(hl_module, HL_SUPPORT_MODULE_P);
            {
                SubLObject forward_mt_combos_func = com.cyc.cycjava.cycl.hl_supports.hl_support_module_forward_mt_combos_func(hl_module);
                SubLObject mt = arguments.support_mt(support);
                if ((NIL != forward_mt_combos_func) && (mt == $$InferencePSC)) {
                    return funcall(forward_mt_combos_func, support);
                } else {
                    return list(support);
                }
            }
        }
    }

    public static SubLObject hl_forward_mt_combos(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject hl_module = arguments.support_module(support);
        assert NIL != hl_support_module_p(hl_module) : "! hl_supports.hl_support_module_p(hl_module) " + ("hl_supports.hl_support_module_p(hl_module) " + "CommonSymbols.NIL != hl_supports.hl_support_module_p(hl_module) ") + hl_module;
        SubLObject forward_mt_combos_func = hl_support_module_forward_mt_combos_func(hl_module);
        final SubLObject mt = arguments.support_mt(support);
        if ((forward_mt_combos_func == LIST) || forward_mt_combos_func.eql(symbol_function(LIST))) {
            forward_mt_combos_func = NIL;
        }
        if ((NIL == forward_mt_combos_func) || (NIL == mt_relevance_macros.any_or_all_mts_relevant_to_mtP(mt))) {
            return list(support);
        }
        if (NIL != mt_vars.core_microtheory_p(mt)) {
            return list(support);
        }
        SubLObject mt_combos = NIL;
        final SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
        final SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
        final SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
        final SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
        if ((NIL != last_metric_type) && (NIL != last_metric)) {
            inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, ZERO_INTEGER);
        }
        SubLObject _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
        final SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
        final SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
        final SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
        try {
            hl_macros.$forward_inference_metric_last_metric_type$.bind($FORWARD_MT_COMBOS, thread);
            hl_macros.$forward_inference_metric_last_metric$.bind(forward_mt_combos_func, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind(NIL, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind(NIL, thread);
            try {
                mt_combos = funcall(forward_mt_combos_func, support);
            } finally {
                final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    inference_metrics.increment_forward_inference_metrics($FORWARD_MT_COMBOS, forward_mt_combos_func, NIL, NIL, NIL);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                }
            }
        } finally {
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
            hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
            hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
        }
        if (NIL == mt_combos) {
            if (NIL != $debug_null_hl_forward_mt_combosP$.getDynamicValue(thread)) {
                final SubLObject mts_from_justification = hl_forward_mt_combos_from_justification(support);
                Errors.warn($str29$null_mt_combos_from__hl_forward_m, sefify(support), mts_from_justification);
            }
            return list(support);
        }
        if (NIL == list_utilities.every_in_list(SUPPORT_P, mt_combos, UNPROVIDED)) {
            Errors.warn($str30$bad_mt_combos_from__hl_forward_mt, sefify(support));
            mt_combos = NIL;
        }
        if (NIL == subl_promotions.positive_integer_p($hl_forward_mt_combos_max_recursion_depth$.getDynamicValue(thread))) {
            return NIL;
        }
        if ((NIL != list_utilities.singletonP(mt_combos)) && (NIL != arguments.support_equal(mt_combos.first(), support))) {
            mt_combos = NIL;
        }
        if (NIL == mt_combos) {
            _prev_bind_0 = $hl_forward_mt_combos_max_recursion_depth$.currentBinding(thread);
            try {
                $hl_forward_mt_combos_max_recursion_depth$.bind(subtract($hl_forward_mt_combos_max_recursion_depth$.getDynamicValue(thread), ONE_INTEGER), thread);
                mt_combos = hl_forward_mt_combos_from_justification(support);
            } finally {
                $hl_forward_mt_combos_max_recursion_depth$.rebind(_prev_bind_0, thread);
            }
        }
        if (NIL != mt_combos) {
            return mt_combos;
        }
        return list(support);
    }

    public static SubLObject hl_forward_mt_combos_from_justification(final SubLObject support) {
        final SubLObject hl_module = arguments.support_module(support);
        final SubLObject justify_func = hl_support_module_justify_func(hl_module);
        SubLObject mt_lists = NIL;
        SubLObject mt_combos = NIL;
        if (NIL == justify_func) {
            return list(support);
        }
        SubLObject cdolist_list_var = funcall(justify_func, support);
        SubLObject sub_support = NIL;
        sub_support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject combo_supports = hl_forward_mt_combos(sub_support);
            mt_lists = cons(Mapping.mapcar(SUPPORT_MT, combo_supports), mt_lists);
            cdolist_list_var = cdolist_list_var.rest();
            sub_support = cdolist_list_var.first();
        } 
        cdolist_list_var = list_utilities.cartesian_product(mt_lists, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject mt_cartesian_product = NIL;
        mt_cartesian_product = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            mt_cartesian_product = remove($$InferencePSC, mt_cartesian_product, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var_$8 = genl_mts.max_floor_mts(mt_cartesian_product, UNPROVIDED, UNPROVIDED);
            SubLObject mt = NIL;
            mt = cdolist_list_var_$8.first();
            while (NIL != cdolist_list_var_$8) {
                final SubLObject result_support = copy_list(support);
                set_nth(TWO_INTEGER, result_support, mt);
                mt_combos = cons(result_support, mt_combos);
                cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                mt = cdolist_list_var_$8.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            mt_cartesian_product = cdolist_list_var.first();
        } 
        return mt_combos;
    }

    /**
     *
     *
     * @return hl-support-p; Returns an assertion corresponding to SENTENCE iff one exists (within MT relevance), or a :code support with SENTENCE as support sentence.
     */
    @LispMethod(comment = "@return hl-support-p; Returns an assertion corresponding to SENTENCE iff one exists (within MT relevance), or a :code support with SENTENCE as support sentence.")
    public static final SubLObject find_assertion_or_make_support_alt(SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
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
                            SubLObject assertion = czer_meta.find_assertion_cycl(sentence, UNPROVIDED);
                            if (NIL != assertion) {
                                result = assertion;
                            } else {
                                result = arguments.make_hl_support($CODE, sentence, mt, UNPROVIDED);
                            }
                        }
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
     * @return hl-support-p; Returns an assertion corresponding to SENTENCE iff one exists (within MT relevance), or a :code support with SENTENCE as support sentence.
     */
    @LispMethod(comment = "@return hl-support-p; Returns an assertion corresponding to SENTENCE iff one exists (within MT relevance), or a :code support with SENTENCE as support sentence.")
    public static SubLObject find_assertion_or_make_support(final SubLObject sentence, SubLObject mt) {
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
            final SubLObject assertion = czer_meta.find_assertion_cycl(sentence, UNPROVIDED);
            if (NIL != assertion) {
                result = assertion;
            } else {
                result = arguments.make_hl_support($CODE, sentence, mt, UNPROVIDED);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        BeanShellCntrl.bp();
        return result;
    }

    public static final SubLObject max_floor_mts_of_justification_alt(SubLObject justification) {
        {
            SubLObject mt_lists = NIL;
            SubLObject max_floor_mts = NIL;
            {
                SubLObject cdolist_list_var = justification;
                SubLObject support = NIL;
                for (support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , support = cdolist_list_var.first()) {
                    if (NIL != assertion_handles.assertion_p(support)) {
                        mt_lists = cons(list(assertion_mt(support)), mt_lists);
                    } else {
                        {
                            SubLObject new_supports = com.cyc.cycjava.cycl.hl_supports.hl_forward_mt_combos(support);
                            mt_lists = cons(Mapping.mapcar(HL_SUPPORT_MT, new_supports), mt_lists);
                        }
                    }
                }
            }
            {
                SubLObject mt_cartesian_product = list_utilities.cartesian_product(mt_lists, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject cdolist_list_var = mt_cartesian_product;
                SubLObject mts = NIL;
                for (mts = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mts = cdolist_list_var.first()) {
                    {
                        SubLObject max_floors = inference_trampolines.inference_max_floor_mts_with_cycles_pruned(mts, UNPROVIDED);
                        max_floor_mts = append(max_floor_mts, max_floors);
                    }
                }
                if (NIL != list_utilities.lengthG(mt_cartesian_product, ONE_INTEGER, UNPROVIDED)) {
                    max_floor_mts = max_mts(list_utilities.fast_delete_duplicates(max_floor_mts, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
                }
            }
            return max_floor_mts;
        }
    }

    public static SubLObject max_floor_mts_of_justification(final SubLObject justification) {
        SubLObject mt_lists = NIL;
        SubLObject max_floor_mts = NIL;
        SubLObject cdolist_list_var = justification;
        SubLObject support = NIL;
        support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != assertion_handles.assertion_p(support)) {
                mt_lists = cons(list(assertions_high.assertion_mt(support)), mt_lists);
            } else {
                final SubLObject new_supports = hl_forward_mt_combos(support);
                mt_lists = cons(Mapping.mapcar(HL_SUPPORT_MT, new_supports), mt_lists);
            }
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        } 
        SubLObject cdolist_list_var2;
        final SubLObject mt_cartesian_product = cdolist_list_var2 = list_utilities.cartesian_product(mt_lists, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject mts = NIL;
        mts = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            final SubLObject max_floors = inference_trampolines.inference_max_floor_mts_with_cycles_pruned(mts, UNPROVIDED);
            max_floor_mts = append(max_floor_mts, max_floors);
            cdolist_list_var2 = cdolist_list_var2.rest();
            mts = cdolist_list_var2.first();
        } 
        if (NIL != list_utilities.lengthG(mt_cartesian_product, ONE_INTEGER, UNPROVIDED)) {
            max_floor_mts = genl_mts.max_mts(list_utilities.fast_delete_duplicates(max_floor_mts, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
        }
        return max_floor_mts;
    }

    public static SubLObject hl_justification_complete_backward_theory(final SubLObject justification, SubLObject query_mt, SubLObject justify_deductionP, SubLObject justify_hl_supportP) {
        if (query_mt == UNPROVIDED) {
            query_mt = NIL;
        }
        if (justify_deductionP == UNPROVIDED) {
            justify_deductionP = TRUE;
        }
        if (justify_hl_supportP == UNPROVIDED) {
            justify_hl_supportP = TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != arguments.hl_justification_p(justification) : "! arguments.hl_justification_p(justification) " + ("arguments.hl_justification_p(justification) " + "CommonSymbols.NIL != arguments.hl_justification_p(justification) ") + justification;
        thread.resetMultipleValues();
        final SubLObject rules = categorize_justification(justification);
        final SubLObject gafs = thread.secondMultipleValue();
        final SubLObject v_hl_supports = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject processed_rules = set.new_set(symbol_function(EQL), ZERO_INTEGER);
        final SubLObject processed_gafs = set.new_set(symbol_function(EQL), ZERO_INTEGER);
        final SubLObject processed_hl_supports = set.new_set(symbol_function(EQUAL), ZERO_INTEGER);
        SubLObject next_rules;
        SubLObject next_gafs;
        SubLObject next_hl_supports;
        for (SubLObject new_rules = set_utilities.make_set_from_list(rules, symbol_function(EQL)), new_gafs = set_utilities.make_set_from_list(gafs, symbol_function(EQL)), new_hl_supports = set_utilities.make_set_from_list(v_hl_supports, symbol_function(EQUAL)); ((NIL == set.set_emptyP(new_rules)) || (NIL == set.set_emptyP(new_gafs))) || (NIL == set.set_emptyP(new_hl_supports)); new_rules = next_rules , new_gafs = next_gafs , new_hl_supports = next_hl_supports) {
            next_rules = set.new_set(symbol_function(EQL), ZERO_INTEGER);
            next_gafs = set.new_set(symbol_function(EQL), ZERO_INTEGER);
            next_hl_supports = set.new_set(symbol_function(EQUAL), ZERO_INTEGER);
            SubLObject set_contents_var = set.do_set_internal(new_rules);
            SubLObject basis_object;
            SubLObject state;
            SubLObject rule;
            SubLObject rule_mt;
            SubLObject query_mt_support;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                rule = set_contents.do_set_contents_next(basis_object, state);
                if ((NIL != set_contents.do_set_contents_element_validP(state, rule)) && (NIL == set.set_memberP(rule, processed_rules))) {
                    set.set_add(rule, processed_rules);
                    rule_mt = assertions_high.assertion_mt(rule);
                    query_mt_support = removal_modules_genlmt.possibly_make_query_mt_support(query_mt, rule_mt);
                    if (NIL != query_mt_support) {
                        set.set_add(query_mt_support, next_hl_supports);
                    }
                }
            }
            set_contents_var = set.do_set_internal(new_gafs);
            SubLObject gaf;
            SubLObject truth;
            SubLObject cdolist_list_var;
            SubLObject deduction;
            SubLObject supports;
            SubLObject rules_$9;
            SubLObject gafs_$10;
            SubLObject v_hl_supports_$11;
            SubLObject cdolist_list_var_$12;
            SubLObject rule2;
            SubLObject cdolist_list_var_$13;
            SubLObject gaf_$14;
            SubLObject cdolist_list_var_$14;
            SubLObject hl_support;
            SubLObject gaf_mt;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                gaf = set_contents.do_set_contents_next(basis_object, state);
                if ((NIL != set_contents.do_set_contents_element_validP(state, gaf)) && (NIL == set.set_memberP(gaf, processed_gafs))) {
                    set.set_add(gaf, processed_gafs);
                    if (NIL == assertions_high.asserted_assertionP(gaf)) {
                        truth = assertions_high.assertion_truth(gaf);
                        cdolist_list_var = assertions_high.assertion_arguments(gaf);
                        deduction = NIL;
                        deduction = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if (((NIL != deduction_handles.deduction_p(deduction)) && truth.eql(deductions_high.deduction_truth(deduction))) && (NIL != funcall(justify_deductionP, deduction))) {
                                supports = deductions_high.deduction_supports(deduction);
                                thread.resetMultipleValues();
                                rules_$9 = categorize_justification(supports);
                                gafs_$10 = thread.secondMultipleValue();
                                v_hl_supports_$11 = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                cdolist_list_var_$12 = rules_$9;
                                rule2 = NIL;
                                rule2 = cdolist_list_var_$12.first();
                                while (NIL != cdolist_list_var_$12) {
                                    set.set_add(rule2, next_rules);
                                    cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                                    rule2 = cdolist_list_var_$12.first();
                                } 
                                cdolist_list_var_$13 = gafs_$10;
                                gaf_$14 = NIL;
                                gaf_$14 = cdolist_list_var_$13.first();
                                while (NIL != cdolist_list_var_$13) {
                                    set.set_add(gaf_$14, next_gafs);
                                    cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                                    gaf_$14 = cdolist_list_var_$13.first();
                                } 
                                cdolist_list_var_$14 = v_hl_supports_$11;
                                hl_support = NIL;
                                hl_support = cdolist_list_var_$14.first();
                                while (NIL != cdolist_list_var_$14) {
                                    set.set_add(hl_support, next_hl_supports);
                                    cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                                    hl_support = cdolist_list_var_$14.first();
                                } 
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            deduction = cdolist_list_var.first();
                        } 
                    }
                    gaf_mt = assertions_high.assertion_mt(gaf);
                    query_mt_support = removal_modules_genlmt.possibly_make_query_mt_support(query_mt, gaf_mt);
                    if (NIL != query_mt_support) {
                        set.set_add(query_mt_support, next_hl_supports);
                    }
                }
            }
            set_contents_var = set.do_set_internal(new_hl_supports);
            SubLObject hl_support2;
            SubLObject supports2;
            SubLObject rules_$10;
            SubLObject gafs_$11;
            SubLObject v_hl_supports_$12;
            SubLObject cdolist_list_var2;
            SubLObject rule3;
            SubLObject gaf2;
            SubLObject hl_support_$19;
            SubLObject support_mt;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                hl_support2 = set_contents.do_set_contents_next(basis_object, state);
                if ((NIL != set_contents.do_set_contents_element_validP(state, hl_support2)) && (NIL == set.set_memberP(hl_support2, processed_hl_supports))) {
                    set.set_add(hl_support2, processed_hl_supports);
                    if (NIL != funcall(justify_hl_supportP, hl_support2)) {
                        supports2 = hl_justify_expanded(hl_support2);
                        thread.resetMultipleValues();
                        rules_$10 = categorize_justification(supports2);
                        gafs_$11 = thread.secondMultipleValue();
                        v_hl_supports_$12 = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        cdolist_list_var2 = rules_$10;
                        rule3 = NIL;
                        rule3 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            set.set_add(rule3, next_rules);
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            rule3 = cdolist_list_var2.first();
                        } 
                        cdolist_list_var2 = gafs_$11;
                        gaf2 = NIL;
                        gaf2 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            set.set_add(gaf2, next_gafs);
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            gaf2 = cdolist_list_var2.first();
                        } 
                        cdolist_list_var2 = v_hl_supports_$12;
                        hl_support_$19 = NIL;
                        hl_support_$19 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            set.set_add(hl_support_$19, next_hl_supports);
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            hl_support_$19 = cdolist_list_var2.first();
                        } 
                    }
                    support_mt = arguments.hl_support_mt(hl_support2);
                    query_mt_support = removal_modules_genlmt.possibly_make_query_mt_support(query_mt, support_mt);
                    if (NIL != query_mt_support) {
                        set.set_add(query_mt_support, next_hl_supports);
                    }
                }
            }
        }
        final SubLObject theory_rules = arguments.sort_supports(set.set_element_list(processed_rules));
        final SubLObject theory_gafs = arguments.sort_supports(set.set_element_list(processed_gafs));
        final SubLObject theory_hl_supports = arguments.sort_supports(set.set_element_list(processed_hl_supports));
        final SubLObject theory = nconc(theory_rules, theory_gafs);
        return values(theory, theory_hl_supports);
    }

    public static SubLObject assertion_all_supporting_asserted_gafs(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        final SubLObject justification = list(assertion);
        final SubLObject complete_backward_theory = hl_justification_complete_backward_theory(justification, NIL, symbol_function(TRUE), symbol_function(TRUE));
        final SubLObject supporting_gafs = list_utilities.remove_if_not(symbol_function($sym36$GAF_ASSERTION_), complete_backward_theory, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject supporting_asserted_gafs = list_utilities.remove_if_not(symbol_function($sym37$ASSERTED_ASSERTION_), supporting_gafs, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        supporting_asserted_gafs = remove_if(symbol_function(TERM_OF_UNIT_ASSERTION_P), supporting_asserted_gafs, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        supporting_asserted_gafs = Sort.sort(supporting_asserted_gafs, symbol_function($sym39$_), symbol_function(ASSERTION_DEPENDENT_COUNT));
        supporting_asserted_gafs = assertion_utilities.sort_assertions_via_term_rarity(supporting_asserted_gafs);
        return supporting_asserted_gafs;
    }

    public static final SubLObject hl_verify_opaque_alt(SubLObject support) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $perform_opaque_support_verification$.getDynamicValue(thread)) {
                return T;
            }
            {
                SubLObject datum = support;
                SubLObject current = datum;
                SubLObject hl_module = NIL;
                SubLObject literal = NIL;
                SubLObject mt = NIL;
                SubLObject tv = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt23);
                hl_module = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt23);
                literal = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt23);
                mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt23);
                tv = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject v_answer = NIL;
                        {
                            SubLObject _prev_bind_0 = $perform_opaque_support_verification$.currentBinding(thread);
                            try {
                                $perform_opaque_support_verification$.bind(NIL, thread);
                                v_answer = ask_utilities.inference_literal_ask(literal, mt);
                            } finally {
                                $perform_opaque_support_verification$.rebind(_prev_bind_0, thread);
                            }
                        }
                        return list_utilities.sublisp_boolean(v_answer);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt23);
                }
            }
            return NIL;
        }
    }

    public static SubLObject hl_verify_opaque(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $perform_opaque_support_verification$.getDynamicValue(thread)) {
            return T;
        }
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject v_answer = NIL;
            final SubLObject _prev_bind_0 = $perform_opaque_support_verification$.currentBinding(thread);
            try {
                $perform_opaque_support_verification$.bind(NIL, thread);
                v_answer = ask_utilities.inference_literal_ask(literal, mt);
            } finally {
                $perform_opaque_support_verification$.rebind(_prev_bind_0, thread);
            }
            return list_utilities.sublisp_boolean(v_answer);
        }
        cdestructuring_bind_error(support, $list42);
        return NIL;
    }

    public static final SubLObject opaque_hl_support_p_alt(SubLObject support) {
        return makeBoolean((NIL == assertion_handles.assertion_p(support)) && ($OPAQUE == arguments.support_module(support)));
    }

    public static SubLObject opaque_hl_support_p(final SubLObject support) {
        return makeBoolean((NIL == assertion_handles.assertion_p(support)) && ($OPAQUE == arguments.support_module(support)));
    }

    public static final SubLObject hl_verify_bookkeeping_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject asent_truth = bookkeeping_store.bookkeeping_asent_truth(literal_atomic_sentence(literal));
                    SubLObject target_truth = (NIL != negatedP(literal)) ? ((SubLObject) ($FALSE)) : $TRUE;
                    if (asent_truth == $UNKNOWN) {
                        return T;
                    }
                    return eq(asent_truth, target_truth);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_verify_bookkeeping(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(support, $list42);
            return NIL;
        }
        final SubLObject asent_truth = bookkeeping_store.bookkeeping_asent_truth(literal_atomic_sentence(literal));
        final SubLObject target_truth = (NIL != cycl_utilities.negatedP(literal)) ? $FALSE : $TRUE;
        if (asent_truth == $UNKNOWN) {
            return T;
        }
        return eq(asent_truth, target_truth);
    }

    public static final SubLObject hl_justify_bookkeeping_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != negatedP(literal)) {
                    {
                        SubLObject asent = literal_atomic_sentence(literal);
                        SubLObject why_not_sentences = bookkeeping_store.why_not_bookkeeping_asent(asent);
                        SubLObject why_not_supports = NIL;
                        SubLObject cdolist_list_var = why_not_sentences;
                        SubLObject why_not_sentence = NIL;
                        for (why_not_sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , why_not_sentence = cdolist_list_var.first()) {
                            {
                                SubLObject ass = com.cyc.cycjava.cycl.hl_supports.cached_find_assertion_cycl(why_not_sentence);
                                if (NIL != ass) {
                                    why_not_supports = cons(ass, why_not_supports);
                                } else {
                                    {
                                        SubLObject why_not_support = NIL;
                                        SubLObject pcase_var = atomic_sentence_predicate(why_not_sentence);
                                        if (((pcase_var.eql($$myCreator) || pcase_var.eql($$myCreationPurpose)) || pcase_var.eql($$myCreationTime)) || pcase_var.eql($$myCreationSecond)) {
                                            why_not_support = removal_modules_bookkeeping.make_bookkeeping_hl_support(why_not_sentence);
                                        } else {
                                            if (pcase_var.eql($$different)) {
                                                why_not_support = arguments.make_hl_support($EVAL, why_not_sentence, $$BookkeepingMt, UNPROVIDED);
                                            } else {
                                                if (pcase_var.eql($$unknownSentence)) {
                                                    why_not_support = arguments.make_hl_support($OPAQUE, why_not_sentence, $$BookkeepingMt, UNPROVIDED);
                                                } else {
                                                    why_not_support = arguments.make_hl_support($OPAQUE, why_not_sentence, $$BookkeepingMt, UNPROVIDED);
                                                }
                                            }
                                        }
                                        why_not_supports = cons(why_not_support, why_not_supports);
                                    }
                                }
                            }
                        }
                        return nreverse(why_not_supports);
                    }
                } else {
                    return list(support);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_justify_bookkeeping(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(support, $list42);
            return NIL;
        }
        if (NIL != cycl_utilities.negatedP(literal)) {
            final SubLObject asent = literal_atomic_sentence(literal);
            final SubLObject why_not_sentences = bookkeeping_store.why_not_bookkeeping_asent(asent);
            SubLObject why_not_supports = NIL;
            SubLObject cdolist_list_var = why_not_sentences;
            SubLObject why_not_sentence = NIL;
            why_not_sentence = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject ass = cached_find_assertion_cycl(why_not_sentence);
                if (NIL != ass) {
                    why_not_supports = cons(ass, why_not_supports);
                } else {
                    SubLObject why_not_support = NIL;
                    final SubLObject pcase_var = cycl_utilities.atomic_sentence_predicate(why_not_sentence);
                    if (((pcase_var.eql($$myCreator) || pcase_var.eql($$myCreationPurpose)) || pcase_var.eql($$myCreationTime)) || pcase_var.eql($$myCreationSecond)) {
                        why_not_support = removal_modules_bookkeeping.make_bookkeeping_hl_support(why_not_sentence);
                    } else
                        if (pcase_var.eql($$different)) {
                            why_not_support = arguments.make_hl_support($EVAL, why_not_sentence, $$BookkeepingMt, UNPROVIDED);
                        } else
                            if (pcase_var.eql($$unknownSentence)) {
                                why_not_support = arguments.make_hl_support($OPAQUE, why_not_sentence, $$BookkeepingMt, UNPROVIDED);
                            } else {
                                why_not_support = arguments.make_hl_support($OPAQUE, why_not_sentence, $$BookkeepingMt, UNPROVIDED);
                            }


                    why_not_supports = cons(why_not_support, why_not_supports);
                }
                cdolist_list_var = cdolist_list_var.rest();
                why_not_sentence = cdolist_list_var.first();
            } 
            return nreverse(why_not_supports);
        }
        return list(support);
    }

    public static final SubLObject clear_cached_find_assertion_cycl_alt() {
        {
            SubLObject cs = $cached_find_assertion_cycl_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_cached_find_assertion_cycl() {
        final SubLObject cs = $cached_find_assertion_cycl_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_cached_find_assertion_cycl_alt(SubLObject asent) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_find_assertion_cycl_caching_state$.getGlobalValue(), list(asent), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_cached_find_assertion_cycl(final SubLObject asent) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_find_assertion_cycl_caching_state$.getGlobalValue(), list(asent), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cached_find_assertion_cycl_internal_alt(SubLObject asent) {
        return czer_meta.find_assertion_cycl(asent, $bookkeeping_justification_assertion_mt$.getGlobalValue());
    }

    public static SubLObject cached_find_assertion_cycl_internal(final SubLObject asent) {
        return czer_meta.find_assertion_cycl(asent, $bookkeeping_justification_assertion_mt$.getGlobalValue());
    }

    public static final SubLObject cached_find_assertion_cycl_alt(SubLObject asent) {
        {
            SubLObject caching_state = $cached_find_assertion_cycl_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(CACHED_FIND_ASSERTION_CYCL, $cached_find_assertion_cycl_caching_state$, NIL, EQUAL, ONE_INTEGER, EIGHT_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, asent, $kw42$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw42$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.hl_supports.cached_find_assertion_cycl_internal(asent)));
                    memoization_state.caching_state_put(caching_state, asent, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject cached_find_assertion_cycl(final SubLObject asent) {
        SubLObject caching_state = $cached_find_assertion_cycl_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CACHED_FIND_ASSERTION_CYCL, $cached_find_assertion_cycl_caching_state$, NIL, EQUAL, ONE_INTEGER, EIGHT_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, asent, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(cached_find_assertion_cycl_internal(asent)));
            memoization_state.caching_state_put(caching_state, asent, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject hl_forward_mt_combos_bookkeeping_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(arguments.make_hl_support(hl_module, literal, $$BookkeepingMt, tv));
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_forward_mt_combos_bookkeeping(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(arguments.make_hl_support(hl_module, literal, $$BookkeepingMt, tv));
        }
        cdestructuring_bind_error(support, $list42);
        return NIL;
    }

    public static final SubLObject hl_verify_defn_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL == negatedP(literal)) {
                    {
                        SubLObject datum_2 = literal_args(literal, UNPROVIDED);
                        SubLObject current_3 = datum_2;
                        SubLObject v_object = NIL;
                        SubLObject collection = NIL;
                        destructuring_bind_must_consp(current_3, datum_2, $list_alt45);
                        v_object = current_3.first();
                        current_3 = current_3.rest();
                        destructuring_bind_must_consp(current_3, datum_2, $list_alt45);
                        collection = current_3.first();
                        current_3 = current_3.rest();
                        if (NIL == current_3) {
                            return at_defns.defns_admitP(collection, v_object, mt);
                        } else {
                            cdestructuring_bind_error(datum_2, $list_alt45);
                        }
                    }
                } else {
                    {
                        SubLObject datum_4 = literal_args(literal_atomic_sentence(literal), UNPROVIDED);
                        SubLObject current_5 = datum_4;
                        SubLObject v_object = NIL;
                        SubLObject collection = NIL;
                        destructuring_bind_must_consp(current_5, datum_4, $list_alt45);
                        v_object = current_5.first();
                        current_5 = current_5.rest();
                        destructuring_bind_must_consp(current_5, datum_4, $list_alt45);
                        collection = current_5.first();
                        current_5 = current_5.rest();
                        if (NIL == current_5) {
                            return at_defns.defns_rejectP(collection, v_object, mt);
                        } else {
                            cdestructuring_bind_error(datum_4, $list_alt45);
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_verify_defn(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL == cycl_utilities.negatedP(literal)) {
                SubLObject current_$21;
                final SubLObject datum_$20 = current_$21 = literal_args(literal, UNPROVIDED);
                SubLObject v_object = NIL;
                SubLObject collection = NIL;
                destructuring_bind_must_consp(current_$21, datum_$20, $list61);
                v_object = current_$21.first();
                current_$21 = current_$21.rest();
                destructuring_bind_must_consp(current_$21, datum_$20, $list61);
                collection = current_$21.first();
                current_$21 = current_$21.rest();
                if (NIL == current_$21) {
                    if ($$quotedIsa.eql(literal_predicate(literal, UNPROVIDED))) {
                        return at_defns.quoted_defns_admitP(collection, v_object, mt);
                    }
                    return at_defns.defns_admitP(collection, v_object, mt);
                } else {
                    cdestructuring_bind_error(datum_$20, $list61);
                }
            } else {
                SubLObject current_$22;
                final SubLObject datum_$21 = current_$22 = literal_args(literal_atomic_sentence(literal), UNPROVIDED);
                SubLObject v_object = NIL;
                SubLObject collection = NIL;
                destructuring_bind_must_consp(current_$22, datum_$21, $list61);
                v_object = current_$22.first();
                current_$22 = current_$22.rest();
                destructuring_bind_must_consp(current_$22, datum_$21, $list61);
                collection = current_$22.first();
                current_$22 = current_$22.rest();
                if (NIL == current_$22) {
                    if ($$quotedIsa.eql(literal_predicate(literal, UNPROVIDED))) {
                        return at_defns.quoted_defns_admitP(collection, v_object, mt);
                    }
                    return at_defns.defns_rejectP(collection, v_object, mt);
                } else {
                    cdestructuring_bind_error(datum_$21, $list61);
                }
            }
        } else {
            cdestructuring_bind_error(support, $list42);
        }
        return NIL;
    }

    public static final SubLObject hl_justify_defn_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL == negatedP(literal)) {
                    {
                        SubLObject datum_6 = literal_args(literal, UNPROVIDED);
                        SubLObject current_7 = datum_6;
                        SubLObject v_object = NIL;
                        SubLObject collection = NIL;
                        destructuring_bind_must_consp(current_7, datum_6, $list_alt45);
                        v_object = current_7.first();
                        current_7 = current_7.rest();
                        destructuring_bind_must_consp(current_7, datum_6, $list_alt45);
                        collection = current_7.first();
                        current_7 = current_7.rest();
                        if (NIL == current_7) {
                            return at_defns.hl_justify_isa_via_defns(v_object, collection, mt);
                        } else {
                            cdestructuring_bind_error(datum_6, $list_alt45);
                        }
                    }
                } else {
                    {
                        SubLObject datum_8 = literal_args(literal_atomic_sentence(literal), UNPROVIDED);
                        SubLObject current_9 = datum_8;
                        SubLObject v_object = NIL;
                        SubLObject collection = NIL;
                        destructuring_bind_must_consp(current_9, datum_8, $list_alt45);
                        v_object = current_9.first();
                        current_9 = current_9.rest();
                        destructuring_bind_must_consp(current_9, datum_8, $list_alt45);
                        collection = current_9.first();
                        current_9 = current_9.rest();
                        if (NIL == current_9) {
                            return at_defns.hl_justify_not_isa_via_defns(v_object, collection, mt);
                        } else {
                            cdestructuring_bind_error(datum_8, $list_alt45);
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_justify_defn(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL == cycl_utilities.negatedP(literal)) {
                SubLObject current_$25;
                final SubLObject datum_$24 = current_$25 = literal_args(literal, UNPROVIDED);
                SubLObject v_object = NIL;
                SubLObject collection = NIL;
                destructuring_bind_must_consp(current_$25, datum_$24, $list61);
                v_object = current_$25.first();
                current_$25 = current_$25.rest();
                destructuring_bind_must_consp(current_$25, datum_$24, $list61);
                collection = current_$25.first();
                current_$25 = current_$25.rest();
                if (NIL == current_$25) {
                    if ($$quotedIsa.eql(literal_predicate(literal, UNPROVIDED))) {
                        return defns.hl_justify_quoted_isa_via_defns(v_object, collection, mt);
                    }
                    return at_defns.hl_justify_isa_via_defns(v_object, collection, mt);
                } else {
                    cdestructuring_bind_error(datum_$24, $list61);
                }
            } else {
                SubLObject current_$26;
                final SubLObject datum_$25 = current_$26 = literal_args(literal_atomic_sentence(literal), UNPROVIDED);
                SubLObject v_object = NIL;
                SubLObject collection = NIL;
                destructuring_bind_must_consp(current_$26, datum_$25, $list61);
                v_object = current_$26.first();
                current_$26 = current_$26.rest();
                destructuring_bind_must_consp(current_$26, datum_$25, $list61);
                collection = current_$26.first();
                current_$26 = current_$26.rest();
                if (NIL == current_$26) {
                    if ($$quotedIsa.eql(literal_predicate(literal, UNPROVIDED))) {
                        return at_defns.hl_justify_not_quoted_isa_via_defns(v_object, collection, mt);
                    }
                    return at_defns.hl_justify_not_isa_via_defns(v_object, collection, mt);
                } else {
                    cdestructuring_bind_error(datum_$25, $list61);
                }
            }
        } else {
            cdestructuring_bind_error(support, $list42);
        }
        return NIL;
    }

    public static final SubLObject hl_forward_mt_combos_defn_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject mts = NIL;
                    SubLObject ans = NIL;
                    if (NIL == negatedP(literal)) {
                        mts = list(mt);
                    } else {
                        mts = list(mt);
                    }
                    {
                        SubLObject cdolist_list_var = mts;
                        SubLObject mt_10 = NIL;
                        for (mt_10 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt_10 = cdolist_list_var.first()) {
                            ans = cons(arguments.make_hl_support(hl_module, literal, mt_10, tv), ans);
                        }
                    }
                    return nreverse(ans);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_forward_mt_combos_defn(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject mts = NIL;
            SubLObject ans = NIL;
            if (NIL != cycl_utilities.negatedP(literal)) {
                mts = list(mt);
            } else
                if (NIL != list_utilities.member_kbeqP(literal_predicate(literal, UNPROVIDED), $list63)) {
                    final SubLObject pred = literal_predicate(literal, UNPROVIDED);
                    final SubLObject v_term = literal_arg1(literal, UNPROVIDED);
                    final SubLObject col = literal_arg2(literal, UNPROVIDED);
                    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        mts = (NIL != kb_utilities.kbeq(pred, $$quotedIsa)) ? at_defns.max_mts_of_admitting_quoted_defns(v_term, col) : at_defns.max_mts_of_admitting_defns(v_term, col);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                } else {
                    mts = list(mt);
                }

            SubLObject cdolist_list_var = mts;
            SubLObject mt_$28 = NIL;
            mt_$28 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                ans = cons(arguments.make_hl_support(hl_module, literal, mt_$28, tv), ans);
                cdolist_list_var = cdolist_list_var.rest();
                mt_$28 = cdolist_list_var.first();
            } 
            return nreverse(ans);
        }
        cdestructuring_bind_error(support, $list42);
        return NIL;
    }

    public static final SubLObject hl_verify_elementof_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL == negatedP(literal)) {
                    {
                        SubLObject datum_11 = literal_args(literal, UNPROVIDED);
                        SubLObject current_12 = datum_11;
                        SubLObject element = NIL;
                        destructuring_bind_must_consp(current_12, datum_11, $list_alt48);
                        element = current_12.first();
                        current_12 = current_12.rest();
                        destructuring_bind_must_consp(current_12, datum_11, $list_alt48);
                        {
                            SubLObject temp = current_12.rest();
                            current_12 = current_12.first();
                            {
                                SubLObject theset = NIL;
                                SubLObject args = NIL;
                                destructuring_bind_must_consp(current_12, datum_11, $list_alt48);
                                theset = current_12.first();
                                current_12 = current_12.rest();
                                args = current_12;
                                current_12 = temp;
                                if (NIL == current_12) {
                                    return subl_promotions.memberP(element, args, symbol_function(EQUAL), UNPROVIDED);
                                } else {
                                    cdestructuring_bind_error(datum_11, $list_alt48);
                                }
                            }
                        }
                    }
                } else {
                    {
                        SubLObject datum_13 = literal_args(literal_atomic_sentence(literal), UNPROVIDED);
                        SubLObject current_14 = datum_13;
                        SubLObject element = NIL;
                        destructuring_bind_must_consp(current_14, datum_13, $list_alt48);
                        element = current_14.first();
                        current_14 = current_14.rest();
                        destructuring_bind_must_consp(current_14, datum_13, $list_alt48);
                        {
                            SubLObject temp = current_14.rest();
                            current_14 = current_14.first();
                            {
                                SubLObject theset = NIL;
                                SubLObject args = NIL;
                                destructuring_bind_must_consp(current_14, datum_13, $list_alt48);
                                theset = current_14.first();
                                current_14 = current_14.rest();
                                args = current_14;
                                current_14 = temp;
                                if (NIL == current_14) {
                                    return makeBoolean(NIL == subl_promotions.memberP(element, args, symbol_function(EQUAL), UNPROVIDED));
                                } else {
                                    cdestructuring_bind_error(datum_13, $list_alt48);
                                }
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_verify_elementof(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL == cycl_utilities.negatedP(literal)) {
                SubLObject current_$30;
                final SubLObject datum_$29 = current_$30 = literal_args(literal, UNPROVIDED);
                SubLObject element = NIL;
                destructuring_bind_must_consp(current_$30, datum_$29, $list66);
                element = current_$30.first();
                current_$30 = current_$30.rest();
                destructuring_bind_must_consp(current_$30, datum_$29, $list66);
                final SubLObject temp = current_$30.rest();
                current_$30 = current_$30.first();
                SubLObject theset = NIL;
                SubLObject args = NIL;
                destructuring_bind_must_consp(current_$30, datum_$29, $list66);
                theset = current_$30.first();
                current_$30 = args = current_$30.rest();
                current_$30 = temp;
                if (NIL == current_$30) {
                    return subl_promotions.memberP(element, args, symbol_function(EQUAL), UNPROVIDED);
                }
                cdestructuring_bind_error(datum_$29, $list66);
            } else {
                SubLObject current_$31;
                final SubLObject datum_$30 = current_$31 = literal_args(literal_atomic_sentence(literal), UNPROVIDED);
                SubLObject element = NIL;
                destructuring_bind_must_consp(current_$31, datum_$30, $list66);
                element = current_$31.first();
                current_$31 = current_$31.rest();
                destructuring_bind_must_consp(current_$31, datum_$30, $list66);
                final SubLObject temp = current_$31.rest();
                current_$31 = current_$31.first();
                SubLObject theset = NIL;
                SubLObject args = NIL;
                destructuring_bind_must_consp(current_$31, datum_$30, $list66);
                theset = current_$31.first();
                current_$31 = args = current_$31.rest();
                current_$31 = temp;
                if (NIL == current_$31) {
                    return makeBoolean(NIL == subl_promotions.memberP(element, args, symbol_function(EQUAL), UNPROVIDED));
                }
                cdestructuring_bind_error(datum_$30, $list66);
            }
        } else {
            cdestructuring_bind_error(support, $list42);
        }
        return NIL;
    }

    public static final SubLObject hl_forward_mt_combos_elementof_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(arguments.make_hl_support(hl_module, literal, $element_of_defining_mt$.getGlobalValue(), tv));
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_forward_mt_combos_elementof(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(arguments.make_hl_support(hl_module, literal, mt_vars.$element_of_defining_mt$.getGlobalValue(), tv));
        }
        cdestructuring_bind_error(support, $list42);
        return NIL;
    }

    public static final SubLObject hl_verify_subsetof_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL == negatedP(literal)) {
                    {
                        SubLObject subset = literal_arg1(literal, UNPROVIDED);
                        SubLObject superset = literal_arg2(literal, UNPROVIDED);
                        if (subset.isCons() && ($$TheSet == nat_functor(subset))) {
                            if (superset.isCons() && ($$TheSet == nat_functor(superset))) {
                                return subsetp(subset, superset, symbol_function(EQUAL), UNPROVIDED);
                            } else {
                                if (NIL != forts.fort_p(superset)) {
                                    return com.cyc.cycjava.cycl.hl_supports.hl_verify_opaque(support);
                                } else {
                                    if (superset.isCons() && ($$TheSetOf == nat_functor(superset))) {
                                        return com.cyc.cycjava.cycl.hl_supports.hl_verify_opaque(support);
                                    }
                                }
                            }
                        } else {
                            if (subset.isCons() && ($$TheSetOf == nat_functor(subset))) {
                                if (NIL != forts.fort_p(superset)) {
                                    return com.cyc.cycjava.cycl.hl_supports.hl_verify_opaque(support);
                                } else {
                                    if (superset.isCons() && ($$TheSetOf == nat_functor(superset))) {
                                        return com.cyc.cycjava.cycl.hl_supports.hl_verify_opaque(support);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    {
                        SubLObject formula = literal_atomic_sentence(literal);
                        SubLObject subset = literal_arg1(formula, UNPROVIDED);
                        SubLObject superset = literal_arg2(formula, UNPROVIDED);
                        if (subset.isCons() && ($$TheSet == nat_functor(subset))) {
                            if (superset.isCons() && ($$TheSet == nat_functor(superset))) {
                                return makeBoolean(NIL == subsetp(subset, superset, symbol_function(EQUAL), UNPROVIDED));
                            } else {
                                if (NIL != forts.fort_p(superset)) {
                                    return com.cyc.cycjava.cycl.hl_supports.hl_verify_opaque(support);
                                } else {
                                    if (superset.isCons() && ($$TheSetOf == nat_functor(superset))) {
                                        return com.cyc.cycjava.cycl.hl_supports.hl_verify_opaque(support);
                                    }
                                }
                            }
                        } else {
                            if (subset.isCons() && ($$TheSetOf == nat_functor(subset))) {
                                if (NIL != forts.fort_p(superset)) {
                                    return com.cyc.cycjava.cycl.hl_supports.hl_verify_opaque(support);
                                } else {
                                    if (superset.isCons() && ($$TheSetOf == nat_functor(superset))) {
                                        return com.cyc.cycjava.cycl.hl_supports.hl_verify_opaque(support);
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_verify_subsetof(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL == cycl_utilities.negatedP(literal)) {
                final SubLObject subset = literal_arg1(literal, UNPROVIDED);
                final SubLObject superset = literal_arg2(literal, UNPROVIDED);
                if (subset.isCons() && $$TheSet.eql(cycl_utilities.nat_functor(subset))) {
                    if (superset.isCons() && $$TheSet.eql(cycl_utilities.nat_functor(superset))) {
                        return subsetp(subset, superset, symbol_function(EQUAL), UNPROVIDED);
                    }
                    if (NIL != forts.fort_p(superset)) {
                        return hl_verify_opaque(support);
                    }
                    if (superset.isCons() && $$TheSetOf.eql(cycl_utilities.nat_functor(superset))) {
                        return hl_verify_opaque(support);
                    }
                } else
                    if (subset.isCons() && $$TheSetOf.eql(cycl_utilities.nat_functor(subset))) {
                        if (NIL != forts.fort_p(superset)) {
                            return hl_verify_opaque(support);
                        }
                        if (superset.isCons() && $$TheSetOf.eql(cycl_utilities.nat_functor(superset))) {
                            return hl_verify_opaque(support);
                        }
                    }

            } else {
                final SubLObject formula = literal_atomic_sentence(literal);
                final SubLObject subset2 = literal_arg1(formula, UNPROVIDED);
                final SubLObject superset2 = literal_arg2(formula, UNPROVIDED);
                if (subset2.isCons() && $$TheSet.eql(cycl_utilities.nat_functor(subset2))) {
                    if (superset2.isCons() && $$TheSet.eql(cycl_utilities.nat_functor(superset2))) {
                        return makeBoolean(NIL == subsetp(subset2, superset2, symbol_function(EQUAL), UNPROVIDED));
                    }
                    if (NIL != forts.fort_p(superset2)) {
                        return hl_verify_opaque(support);
                    }
                    if (superset2.isCons() && $$TheSetOf.eql(cycl_utilities.nat_functor(superset2))) {
                        return hl_verify_opaque(support);
                    }
                } else
                    if (subset2.isCons() && $$TheSetOf.eql(cycl_utilities.nat_functor(subset2))) {
                        if (NIL != forts.fort_p(superset2)) {
                            return hl_verify_opaque(support);
                        }
                        if (superset2.isCons() && $$TheSetOf.eql(cycl_utilities.nat_functor(superset2))) {
                            return hl_verify_opaque(support);
                        }
                    }

            }
        } else {
            cdestructuring_bind_error(support, $list42);
        }
        return NIL;
    }

    public static final SubLObject hl_forward_mt_combos_subsetof_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject mts = NIL;
                    SubLObject ans = NIL;
                    if (NIL == negatedP(literal)) {
                        {
                            SubLObject subset = literal_arg1(literal, UNPROVIDED);
                            SubLObject superset = literal_arg2(literal, UNPROVIDED);
                            if (subset.isCons() && ($$TheSet == nat_functor(subset))) {
                                if (superset.isCons() && ($$TheSet == nat_functor(superset))) {
                                    mts = list($subset_of_defining_mt$.getGlobalValue());
                                } else {
                                    if (NIL != forts.fort_p(superset)) {
                                        mts = list(mt);
                                    } else {
                                        if (superset.isCons() && ($$TheSetOf == nat_functor(superset))) {
                                            mts = list(mt);
                                        }
                                    }
                                }
                            } else {
                                if (subset.isCons() && ($$TheSetOf == nat_functor(subset))) {
                                    if (NIL != forts.fort_p(superset)) {
                                        mts = list(mt);
                                    } else {
                                        if (superset.isCons() && ($$TheSetOf == nat_functor(superset))) {
                                            mts = list(mt);
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        {
                            SubLObject formula = literal_atomic_sentence(literal);
                            SubLObject subset = literal_arg1(formula, UNPROVIDED);
                            SubLObject superset = literal_arg2(formula, UNPROVIDED);
                            if (subset.isCons() && ($$TheSet == nat_functor(subset))) {
                                if (superset.isCons() && ($$TheSet == nat_functor(superset))) {
                                    mts = list($subset_of_defining_mt$.getGlobalValue());
                                } else {
                                    if (NIL != forts.fort_p(superset)) {
                                        mts = list(mt);
                                    } else {
                                        if (superset.isCons() && ($$TheSetOf == nat_functor(superset))) {
                                            mts = list(mt);
                                        }
                                    }
                                }
                            } else {
                                if (subset.isCons() && ($$TheSetOf == nat_functor(subset))) {
                                    if (NIL != forts.fort_p(superset)) {
                                        mts = list(mt);
                                    } else {
                                        if (superset.isCons() && ($$TheSetOf == nat_functor(superset))) {
                                            mts = list(mt);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject cdolist_list_var = mts;
                        SubLObject mt_15 = NIL;
                        for (mt_15 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt_15 = cdolist_list_var.first()) {
                            ans = cons(arguments.make_hl_support(hl_module, literal, mt_15, tv), ans);
                        }
                    }
                    return nreverse(ans);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_forward_mt_combos_subsetof(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject mts = NIL;
            SubLObject ans = NIL;
            if (NIL == cycl_utilities.negatedP(literal)) {
                final SubLObject subset = literal_arg1(literal, UNPROVIDED);
                final SubLObject superset = literal_arg2(literal, UNPROVIDED);
                if (NIL != el_empty_set_p(subset)) {
                    mts = list(mt_vars.$subset_of_defining_mt$.getGlobalValue());
                } else
                    if (subset.isCons() && $$TheSet.eql(cycl_utilities.nat_functor(subset))) {
                        if (superset.isCons() && $$TheSet.eql(cycl_utilities.nat_functor(superset))) {
                            mts = list(mt_vars.$subset_of_defining_mt$.getGlobalValue());
                        } else
                            if (NIL != forts.fort_p(superset)) {
                                mts = list(mt);
                            } else
                                if (superset.isCons() && $$TheSetOf.eql(cycl_utilities.nat_functor(superset))) {
                                    mts = list(mt);
                                }


                    } else
                        if (subset.isCons() && $$TheSetOf.eql(cycl_utilities.nat_functor(subset))) {
                            if (NIL != forts.fort_p(superset)) {
                                mts = list(mt);
                            } else
                                if (superset.isCons() && $$TheSetOf.eql(cycl_utilities.nat_functor(superset))) {
                                    mts = list(mt);
                                }

                        }


            } else {
                final SubLObject formula = literal_atomic_sentence(literal);
                final SubLObject subset2 = literal_arg1(formula, UNPROVIDED);
                final SubLObject superset2 = literal_arg2(formula, UNPROVIDED);
                if (NIL != el_empty_set_p(superset2)) {
                    mts = list(mt_vars.$subset_of_defining_mt$.getGlobalValue());
                } else
                    if (subset2.isCons() && $$TheSet.eql(cycl_utilities.nat_functor(subset2))) {
                        if (superset2.isCons() && $$TheSet.eql(cycl_utilities.nat_functor(superset2))) {
                            mts = list(mt_vars.$subset_of_defining_mt$.getGlobalValue());
                        } else
                            if (NIL != forts.fort_p(superset2)) {
                                mts = list(mt);
                            } else
                                if (superset2.isCons() && $$TheSetOf.eql(cycl_utilities.nat_functor(superset2))) {
                                    mts = list(mt);
                                }


                    } else
                        if (subset2.isCons() && $$TheSetOf.eql(cycl_utilities.nat_functor(subset2))) {
                            if (NIL != forts.fort_p(superset2)) {
                                mts = list(mt);
                            } else
                                if (superset2.isCons() && $$TheSetOf.eql(cycl_utilities.nat_functor(superset2))) {
                                    mts = list(mt);
                                }

                        }


            }
            if (NIL != mts) {
                SubLObject cdolist_list_var = mts;
                SubLObject mt_$33 = NIL;
                mt_$33 = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    ans = cons(arguments.make_hl_support(hl_module, literal, mt_$33, tv), ans);
                    cdolist_list_var = cdolist_list_var.rest();
                    mt_$33 = cdolist_list_var.first();
                } 
            } else {
                ans = list(support);
            }
            return nreverse(ans);
        }
        cdestructuring_bind_error(support, $list42);
        return NIL;
    }

    public static final SubLObject hl_verify_sibling_disjoint_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL == negatedP(literal)) {
                    {
                        SubLObject datum_16 = literal_args(literal, UNPROVIDED);
                        SubLObject current_17 = datum_16;
                        SubLObject col1 = NIL;
                        SubLObject col2 = NIL;
                        destructuring_bind_must_consp(current_17, datum_16, $list_alt55);
                        col1 = current_17.first();
                        current_17 = current_17.rest();
                        destructuring_bind_must_consp(current_17, datum_16, $list_alt55);
                        col2 = current_17.first();
                        current_17 = current_17.rest();
                        if (NIL == current_17) {
                            return sdc.sdcP(col1, col2, mt);
                        } else {
                            cdestructuring_bind_error(datum_16, $list_alt55);
                        }
                    }
                } else {
                    {
                        SubLObject datum_18 = literal_args(literal_atomic_sentence(literal), UNPROVIDED);
                        SubLObject current_19 = datum_18;
                        SubLObject col1 = NIL;
                        SubLObject col2 = NIL;
                        destructuring_bind_must_consp(current_19, datum_18, $list_alt55);
                        col1 = current_19.first();
                        current_19 = current_19.rest();
                        destructuring_bind_must_consp(current_19, datum_18, $list_alt55);
                        col2 = current_19.first();
                        current_19 = current_19.rest();
                        if (NIL == current_19) {
                            return NIL;
                        } else {
                            cdestructuring_bind_error(datum_18, $list_alt55);
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_verify_sibling_disjoint(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL == cycl_utilities.negatedP(literal)) {
                SubLObject current_$35;
                final SubLObject datum_$34 = current_$35 = literal_args(literal, UNPROVIDED);
                SubLObject col1 = NIL;
                SubLObject col2 = NIL;
                destructuring_bind_must_consp(current_$35, datum_$34, $list73);
                col1 = current_$35.first();
                current_$35 = current_$35.rest();
                destructuring_bind_must_consp(current_$35, datum_$34, $list73);
                col2 = current_$35.first();
                current_$35 = current_$35.rest();
                if (NIL == current_$35) {
                    return sdc.sdcP(col1, col2, mt);
                }
                cdestructuring_bind_error(datum_$34, $list73);
            } else {
                SubLObject current_$36;
                final SubLObject datum_$35 = current_$36 = literal_args(literal_atomic_sentence(literal), UNPROVIDED);
                SubLObject col1 = NIL;
                SubLObject col2 = NIL;
                destructuring_bind_must_consp(current_$36, datum_$35, $list73);
                col1 = current_$36.first();
                current_$36 = current_$36.rest();
                destructuring_bind_must_consp(current_$36, datum_$35, $list73);
                col2 = current_$36.first();
                current_$36 = current_$36.rest();
                if (NIL == current_$36) {
                    return NIL;
                }
                cdestructuring_bind_error(datum_$35, $list73);
            }
        } else {
            cdestructuring_bind_error(support, $list42);
        }
        return NIL;
    }

    public static final SubLObject hl_justify_sibling_disjoint_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL == negatedP(literal)) {
                    {
                        SubLObject datum_20 = literal_args(literal, UNPROVIDED);
                        SubLObject current_21 = datum_20;
                        SubLObject col1 = NIL;
                        SubLObject col2 = NIL;
                        destructuring_bind_must_consp(current_21, datum_20, $list_alt55);
                        col1 = current_21.first();
                        current_21 = current_21.rest();
                        destructuring_bind_must_consp(current_21, datum_20, $list_alt55);
                        col2 = current_21.first();
                        current_21 = current_21.rest();
                        if (NIL == current_21) {
                            return sdc.why_sdcP(col1, col2, mt, $ASSERTION);
                        } else {
                            cdestructuring_bind_error(datum_20, $list_alt55);
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_justify_sibling_disjoint(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL == cycl_utilities.negatedP(literal)) {
                SubLObject current_$39;
                final SubLObject datum_$38 = current_$39 = literal_args(literal, UNPROVIDED);
                SubLObject col1 = NIL;
                SubLObject col2 = NIL;
                destructuring_bind_must_consp(current_$39, datum_$38, $list73);
                col1 = current_$39.first();
                current_$39 = current_$39.rest();
                destructuring_bind_must_consp(current_$39, datum_$38, $list73);
                col2 = current_$39.first();
                current_$39 = current_$39.rest();
                if (NIL == current_$39) {
                    return sdc.why_sdcP(col1, col2, mt, $ASSERTION);
                }
                cdestructuring_bind_error(datum_$38, $list73);
            }
        } else {
            cdestructuring_bind_error(support, $list42);
        }
        return NIL;
    }

    public static final SubLObject hl_forward_mt_combos_sibling_disjoint_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject mts = NIL;
                    SubLObject ans = NIL;
                    if (NIL == negatedP(literal)) {
                        mts = list(mt);
                    } else {
                        mts = list(mt);
                    }
                    {
                        SubLObject cdolist_list_var = mts;
                        SubLObject mt_22 = NIL;
                        for (mt_22 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt_22 = cdolist_list_var.first()) {
                            ans = cons(arguments.make_hl_support(hl_module, literal, mt_22, tv), ans);
                        }
                    }
                    return nreverse(ans);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_forward_mt_combos_sibling_disjoint(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject col1 = literal_arg1(literal, UNPROVIDED);
            final SubLObject col2 = literal_arg2(literal, UNPROVIDED);
            SubLObject mts = NIL;
            SubLObject ans = NIL;
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject sdc_justification = (NIL == cycl_utilities.negatedP(literal)) ? disjoint_with.why_disjoint_withP(col1, col2, mt, $$True_JustificationTruth, $ASSERTION) : disjoint_with.why_not_disjoint_withP(col1, col2, mt, $$False_JustificationTruth, $ASSERTION);
                if (NIL != sdc_justification) {
                    mts = genl_mts.max_floor_mts(Mapping.mapcar(SUPPORT_MT, sdc_justification), UNPROVIDED, UNPROVIDED);
                }
                if (NIL == mts) {
                    mts = list(mt);
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
            SubLObject cdolist_list_var = mts;
            SubLObject max_mt = NIL;
            max_mt = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                ans = cons(arguments.make_hl_support(hl_module, literal, max_mt, tv), ans);
                cdolist_list_var = cdolist_list_var.rest();
                max_mt = cdolist_list_var.first();
            } 
            return nreverse(ans);
        }
        cdestructuring_bind_error(support, $list42);
        return NIL;
    }

    public static final SubLObject hl_verify_equality_alt(SubLObject support) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = support;
                SubLObject current = datum;
                SubLObject hl_module = NIL;
                SubLObject literal = NIL;
                SubLObject mt = NIL;
                SubLObject tv = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt23);
                hl_module = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt23);
                literal = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt23);
                mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt23);
                tv = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject predicate = literal_predicate(literal, UNPROVIDED);
                        SubLObject negatedP = negatedP(literal);
                        if (NIL != negatedP) {
                            literal = literal_atomic_sentence(literal);
                        }
                        {
                            SubLObject arg1 = literal_arg1(literal, UNPROVIDED);
                            SubLObject arg2 = literal_arg2(literal, UNPROVIDED);
                            SubLObject ans = NIL;
                            {
                                SubLObject _prev_bind_0 = $perform_equals_unification$.currentBinding(thread);
                                try {
                                    $perform_equals_unification$.bind(makeBoolean((NIL != $perform_equals_unification$.getDynamicValue(thread)) && (predicate != $$equalSymbols)), thread);
                                    if (NIL != negatedP) {
                                        ans = makeBoolean(NIL == unification_utilities.term_unify(arg1, arg2, mt, UNPROVIDED));
                                    } else {
                                        ans = unification_utilities.term_unify(arg1, arg2, mt, UNPROVIDED);
                                    }
                                } finally {
                                    $perform_equals_unification$.rebind(_prev_bind_0, thread);
                                }
                            }
                            return list_utilities.sublisp_boolean(ans);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt23);
                }
            }
            return NIL;
        }
    }

    public static SubLObject hl_verify_equality(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject predicate = literal_predicate(literal, UNPROVIDED);
            final SubLObject negatedP = cycl_utilities.negatedP(literal);
            if (NIL != negatedP) {
                literal = literal_atomic_sentence(literal);
            }
            final SubLObject arg1 = literal_arg1(literal, UNPROVIDED);
            final SubLObject arg2 = literal_arg2(literal, UNPROVIDED);
            SubLObject ans = NIL;
            final SubLObject _prev_bind_0 = $perform_equals_unification$.currentBinding(thread);
            try {
                $perform_equals_unification$.bind(makeBoolean((NIL != $perform_equals_unification$.getDynamicValue(thread)) && (!predicate.eql($$equalSymbols))), thread);
                if (NIL != negatedP) {
                    ans = makeBoolean(NIL == unification_utilities.term_unify(arg1, arg2, mt, UNPROVIDED));
                } else {
                    ans = unification_utilities.term_unify(arg1, arg2, mt, UNPROVIDED);
                }
            } finally {
                $perform_equals_unification$.rebind(_prev_bind_0, thread);
            }
            return list_utilities.sublisp_boolean(ans);
        }
        cdestructuring_bind_error(support, $list42);
        return NIL;
    }

    public static final SubLObject hl_forward_mt_combos_equality_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject mts = NIL;
                    SubLObject ans = NIL;
                    if (NIL == negatedP(literal)) {
                        if (literal_predicate(literal, UNPROVIDED) == $$equals) {
                            mts = equals.max_floor_mts_where_equals(literal_arg1(literal, UNPROVIDED), literal_arg2(literal, UNPROVIDED));
                        } else {
                            mts = list($equals_defining_mt$.getGlobalValue());
                        }
                    } else {
                        mts = list(mt);
                    }
                    {
                        SubLObject cdolist_list_var = mts;
                        SubLObject mt_23 = NIL;
                        for (mt_23 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt_23 = cdolist_list_var.first()) {
                            ans = cons(arguments.make_hl_support(hl_module, literal, mt_23, tv), ans);
                        }
                    }
                    return nreverse(ans);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_forward_mt_combos_equality(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject mts = NIL;
            SubLObject ans = NIL;
            if (NIL == cycl_utilities.negatedP(literal)) {
                if (literal_predicate(literal, UNPROVIDED).eql($$equals)) {
                    mts = equals.max_floor_mts_where_equals(literal_arg1(literal, UNPROVIDED), literal_arg2(literal, UNPROVIDED));
                } else {
                    mts = list(mt_vars.$equals_defining_mt$.getGlobalValue());
                }
            } else {
                mts = list(mt);
            }
            SubLObject cdolist_list_var = mts;
            SubLObject mt_$40 = NIL;
            mt_$40 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                ans = cons(arguments.make_hl_support(hl_module, literal, mt_$40, tv), ans);
                cdolist_list_var = cdolist_list_var.rest();
                mt_$40 = cdolist_list_var.first();
            } 
            return nreverse(ans);
        }
        cdestructuring_bind_error(support, $list42);
        return NIL;
    }

    public static final SubLObject hl_validate_equality_alt(SubLObject support, SubLObject validation_level) {
        return com.cyc.cycjava.cycl.hl_supports.hl_validate_default(support, validation_level);
    }

    public static SubLObject hl_validate_equality(final SubLObject support, final SubLObject validation_level) {
        return hl_validate_default(support, validation_level);
    }

    public static final SubLObject hl_validate_default_alt(SubLObject support, SubLObject validation_level) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject pcase_var = validation_level;
                    if (pcase_var.eql($NONE)) {
                        return T;
                    } else {
                        if (pcase_var.eql($MINIMAL)) {
                            return com.cyc.cycjava.cycl.hl_supports.hl_validate_literal_minimal(literal, mt);
                        } else {
                            if (pcase_var.eql($ARG_TYPE)) {
                                return removal_modules_admitted_formula.inference_admitted_sentence(literal, mt);
                            } else {
                                if (pcase_var.eql($ALL)) {
                                    return removal_modules_admitted_formula.inference_admitted_sentence(literal, mt);
                                } else {
                                    Errors.error($str_alt65$Unexpected_intermediate_step_vali, validation_level);
                                }
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_validate_default(final SubLObject support, final SubLObject validation_level) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            if (validation_level.eql($NONE)) {
                return T;
            }
            if (validation_level.eql($MINIMAL)) {
                return hl_validate_literal_minimal(literal, mt);
            }
            if (validation_level.eql($ARG_TYPE)) {
                return removal_modules_admitted_formula.inference_admitted_sentence(literal, mt);
            }
            if (validation_level.eql($ALL)) {
                return removal_modules_admitted_formula.inference_admitted_sentence(literal, mt);
            }
            Errors.error($str85$Unexpected_intermediate_step_vali, validation_level);
        } else {
            cdestructuring_bind_error(support, $list42);
        }
        return NIL;
    }

    public static final SubLObject hl_validate_literal_minimal_alt(SubLObject literal, SubLObject mt) {
        {
            SubLObject arg1 = literal_arg1(literal, UNPROVIDED);
            SubLObject arg2 = literal_arg2(literal, UNPROVIDED);
            if (arg1.equal(arg2)) {
                return removal_modules_admitted_formula.inference_admitted_sentence(literal, mt);
            }
        }
        return NIL;
    }

    public static SubLObject hl_validate_literal_minimal(final SubLObject literal, final SubLObject mt) {
        final SubLObject arg1 = literal_arg1(literal, UNPROVIDED);
        final SubLObject arg2 = literal_arg2(literal, UNPROVIDED);
        if (arg1.equal(arg2)) {
            return removal_modules_admitted_formula.inference_admitted_sentence(literal, mt);
        }
        return NIL;
    }

    public static final SubLObject hl_justify_equality_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject justification = NIL;
                    if (literal_predicate(literal, UNPROVIDED) == $$equals) {
                        justification = equals.why_equals(literal_arg1(literal, UNPROVIDED), literal_arg2(literal, UNPROVIDED), mt, tv);
                    }
                    return justification;
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_justify_equality(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject justification = NIL;
            if (NIL != genl_predicates.genl_predP(literal_predicate(literal, UNPROVIDED), $$equals, mt, UNPROVIDED)) {
                justification = equals.why_equals(literal_arg1(literal, UNPROVIDED), literal_arg2(literal, UNPROVIDED), mt, tv);
            }
            return justification;
        }
        cdestructuring_bind_error(support, $list42);
        return NIL;
    }

    public static final SubLObject hl_verify_eval_alt(SubLObject support) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject datum = support;
                SubLObject current = datum;
                SubLObject hl_module = NIL;
                SubLObject literal = NIL;
                SubLObject mt = NIL;
                SubLObject tv = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt23);
                hl_module = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt23);
                literal = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt23);
                mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt23);
                tv = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject predicate = literal_predicate(literal, UNPROVIDED);
                        if (predicate == $$evaluate) {
                            {
                                SubLObject arg1 = literal_arg1(literal, UNPROVIDED);
                                SubLObject expression = literal_arg2(literal, UNPROVIDED);
                                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                                {
                                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject v_answer = relation_evaluation.cyc_evaluate(expression);
                                            SubLObject validP = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            ans = makeBoolean((NIL != validP) && (NIL != unification_utilities.term_unify(v_answer, arg1, UNPROVIDED, UNPROVIDED)));
                                        }
                                    } finally {
                                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        } else {
                            {
                                SubLObject negatedP = negatedP(literal);
                                SubLObject atomic_sentence = literal_atomic_sentence(literal);
                                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                                {
                                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject v_answer = relation_evaluation.cyc_evaluate(atomic_sentence);
                                            SubLObject validP = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            ans = makeBoolean((NIL != validP) && (NIL != (NIL != negatedP ? ((SubLObject) (makeBoolean(NIL == v_answer))) : v_answer)));
                                        }
                                    } finally {
                                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt23);
                }
                return ans;
            }
        }
    }

    public static SubLObject hl_verify_eval(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject predicate = literal_predicate(literal, UNPROVIDED);
            if (predicate.eql($$evaluate)) {
                final SubLObject arg1 = literal_arg1(literal, UNPROVIDED);
                final SubLObject expression = literal_arg2(literal, UNPROVIDED);
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    thread.resetMultipleValues();
                    final SubLObject v_answer = relation_evaluation.cyc_evaluate(expression);
                    final SubLObject validP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    ans = makeBoolean((NIL != validP) && (NIL != unification_utilities.term_unify(v_answer, arg1, UNPROVIDED, UNPROVIDED)));
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
            } else {
                final SubLObject negatedP = cycl_utilities.negatedP(literal);
                final SubLObject atomic_sentence = literal_atomic_sentence(literal);
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    thread.resetMultipleValues();
                    final SubLObject v_answer = relation_evaluation.cyc_evaluate(atomic_sentence);
                    final SubLObject validP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    ans = makeBoolean((NIL != validP) && (NIL != (NIL != negatedP ? makeBoolean(NIL == v_answer) : v_answer)));
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
            }
        } else {
            cdestructuring_bind_error(support, $list42);
        }
        return ans;
    }

    public static final SubLObject hl_justify_eval_alt(SubLObject support) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject justification = NIL;
                SubLObject datum = support;
                SubLObject current = datum;
                SubLObject hl_module = NIL;
                SubLObject literal = NIL;
                SubLObject mt = NIL;
                SubLObject tv = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt23);
                hl_module = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt23);
                literal = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt23);
                mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt23);
                tv = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject predicate = literal_predicate(literal, UNPROVIDED);
                        if (predicate == $$evaluate) {
                            {
                                SubLObject result = literal_arg1(literal, UNPROVIDED);
                                SubLObject expression = literal_arg2(literal, UNPROVIDED);
                                if (NIL == negatedP(literal)) {
                                    {
                                        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                                        {
                                            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                            try {
                                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                                justification = relation_evaluation.cyc_evaluate_justify(expression);
                                            } finally {
                                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                    }
                                } else {
                                    {
                                        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                                        {
                                            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                            try {
                                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject v_answer = relation_evaluation.cyc_evaluate(expression);
                                                    SubLObject validP = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if ((NIL != validP) && (NIL == unification_utilities.term_unify(v_answer, result, UNPROVIDED, UNPROVIDED))) {
                                                        {
                                                            SubLObject evaluate_support = removal_modules_evaluation.make_eval_support(removal_modules_evaluate.make_evaluate_sentence(v_answer, expression), UNPROVIDED);
                                                            SubLObject different_support = removal_modules_different.make_binary_different_eval_support(result, v_answer);
                                                            justification = list(evaluate_support, different_support);
                                                        }
                                                    }
                                                }
                                            } finally {
                                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (predicate == $$different) {
                                {
                                    SubLObject args = literal_args(literal, UNPROVIDED);
                                    justification = equals.why_different(args);
                                }
                            } else {
                                {
                                    SubLObject atomic_sentence = literal_atomic_sentence(literal);
                                    if (NIL == negatedP(literal)) {
                                        {
                                            SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                                            {
                                                SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                                try {
                                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                                    justification = relation_evaluation.cyc_evaluate_justify(atomic_sentence);
                                                } finally {
                                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                                                }
                                            }
                                        }
                                    } else {
                                        {
                                            SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                                            {
                                                SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                                try {
                                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject v_answer = relation_evaluation.cyc_evaluate(atomic_sentence);
                                                        SubLObject validP = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        if ((NIL != validP) && (NIL == v_answer)) {
                                                            {
                                                                SubLObject unknown_support = removal_modules_true_sentence.make_unknown_sentence_support(atomic_sentence);
                                                                justification = list(unknown_support);
                                                            }
                                                        }
                                                    }
                                                } finally {
                                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt23);
                }
                return justification;
            }
        }
    }

    public static SubLObject hl_justify_eval(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject justification = NIL;
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject predicate = literal_predicate(literal, UNPROVIDED);
            if (predicate.eql($$evaluate)) {
                final SubLObject result = literal_arg1(literal, UNPROVIDED);
                final SubLObject expression = literal_arg2(literal, UNPROVIDED);
                if (NIL == cycl_utilities.negatedP(literal)) {
                    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        justification = relation_evaluation.cyc_evaluate_justify(expression);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                } else {
                    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        thread.resetMultipleValues();
                        final SubLObject v_answer = relation_evaluation.cyc_evaluate(expression);
                        final SubLObject validP = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if ((NIL != validP) && (NIL == unification_utilities.term_unify(v_answer, result, UNPROVIDED, UNPROVIDED))) {
                            final SubLObject evaluate_support = removal_modules_evaluation.make_eval_support(removal_modules_evaluate.make_evaluate_sentence(v_answer, expression), UNPROVIDED);
                            final SubLObject different_support = removal_modules_different.make_binary_different_eval_support(result, v_answer);
                            justification = list(evaluate_support, different_support);
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
            } else
                if (predicate.eql($$different)) {
                    final SubLObject args = literal_args(literal, UNPROVIDED);
                    justification = equals.why_different(args);
                } else {
                    final SubLObject atomic_sentence = literal_atomic_sentence(literal);
                    if (NIL == cycl_utilities.negatedP(literal)) {
                        final SubLObject mt_var2 = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                        final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_6 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var2), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var2), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var2), thread);
                            justification = relation_evaluation.cyc_evaluate_justify(atomic_sentence);
                        } finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_6, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_5, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
                        }
                    } else {
                        final SubLObject mt_var2 = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                        final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_6 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var2), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var2), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var2), thread);
                            thread.resetMultipleValues();
                            final SubLObject v_answer2 = relation_evaluation.cyc_evaluate(atomic_sentence);
                            final SubLObject validP2 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if ((NIL != validP2) && (NIL == v_answer2)) {
                                final SubLObject unknown_support = removal_modules_true_sentence.make_unknown_sentence_support(atomic_sentence);
                                justification = list(unknown_support);
                            }
                        } finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_6, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_5, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
                        }
                    }
                }

        } else {
            cdestructuring_bind_error(support, $list42);
        }
        return justification;
    }

    public static final SubLObject hl_verify_reflexive_alt(SubLObject support) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject datum = support;
                SubLObject current = datum;
                SubLObject hl_module = NIL;
                SubLObject literal = NIL;
                SubLObject mt = NIL;
                SubLObject tv = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt23);
                hl_module = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt23);
                literal = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt23);
                mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt23);
                tv = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject negatedP = negatedP(literal);
                        SubLObject atomic_sentence = literal_atomic_sentence(literal);
                        SubLObject datum_24 = atomic_sentence;
                        SubLObject current_25 = datum_24;
                        SubLObject pred = NIL;
                        SubLObject arg1 = NIL;
                        SubLObject arg2 = NIL;
                        destructuring_bind_must_consp(current_25, datum_24, $list_alt70);
                        pred = current_25.first();
                        current_25 = current_25.rest();
                        destructuring_bind_must_consp(current_25, datum_24, $list_alt70);
                        arg1 = current_25.first();
                        current_25 = current_25.rest();
                        destructuring_bind_must_consp(current_25, datum_24, $list_alt70);
                        arg2 = current_25.first();
                        current_25 = current_25.rest();
                        if (NIL == current_25) {
                            {
                                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                                {
                                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                        ans = makeBoolean((NIL != unification_utilities.term_unify(arg1, arg2, UNPROVIDED, UNPROVIDED)) && ((((NIL == negatedP) && (NIL != kb_accessors.reflexive_predicateP(pred))) && (NIL != arg_type.semantically_valid_literalP(atomic_sentence, NIL, UNPROVIDED))) || (((NIL != negatedP) && (NIL != kb_accessors.irreflexive_predicateP(pred))) && (NIL != com.cyc.cycjava.cycl.hl_supports.inference_semantically_valid_irreflexive_literalP(atomic_sentence, NIL)))));
                                    } finally {
                                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum_24, $list_alt70);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt23);
                }
                return ans;
            }
        }
    }

    public static SubLObject hl_verify_reflexive(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject negatedP = cycl_utilities.negatedP(literal);
            final SubLObject atomic_sentence = literal_atomic_sentence(literal);
            SubLObject current_$42;
            final SubLObject datum_$41 = current_$42 = atomic_sentence;
            SubLObject pred = NIL;
            SubLObject arg1 = NIL;
            SubLObject arg2 = NIL;
            destructuring_bind_must_consp(current_$42, datum_$41, $list90);
            pred = current_$42.first();
            current_$42 = current_$42.rest();
            destructuring_bind_must_consp(current_$42, datum_$41, $list90);
            arg1 = current_$42.first();
            current_$42 = current_$42.rest();
            destructuring_bind_must_consp(current_$42, datum_$41, $list90);
            arg2 = current_$42.first();
            current_$42 = current_$42.rest();
            if (NIL == current_$42) {
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    ans = makeBoolean((NIL != unification_utilities.term_unify(arg1, arg2, UNPROVIDED, UNPROVIDED)) && ((((NIL == negatedP) && (NIL != kb_accessors.reflexive_predicateP(pred))) && (NIL != arg_type.semantically_valid_literalP(atomic_sentence, NIL, UNPROVIDED))) || (((NIL != negatedP) && (NIL != kb_accessors.irreflexive_predicateP(pred))) && (NIL != inference_semantically_valid_irreflexive_literalP(atomic_sentence, NIL)))));
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
            } else {
                cdestructuring_bind_error(datum_$41, $list90);
            }
        } else {
            cdestructuring_bind_error(support, $list42);
        }
        return ans;
    }

    public static final SubLObject hl_justify_reflexive_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject negatedP = negatedP(literal);
                    SubLObject atomic_sentence = literal_atomic_sentence(literal);
                    SubLObject datum_26 = atomic_sentence;
                    SubLObject current_27 = datum_26;
                    SubLObject pred = NIL;
                    SubLObject arg1 = NIL;
                    SubLObject arg2 = NIL;
                    destructuring_bind_must_consp(current_27, datum_26, $list_alt70);
                    pred = current_27.first();
                    current_27 = current_27.rest();
                    destructuring_bind_must_consp(current_27, datum_26, $list_alt70);
                    arg1 = current_27.first();
                    current_27 = current_27.rest();
                    destructuring_bind_must_consp(current_27, datum_26, $list_alt70);
                    arg2 = current_27.first();
                    current_27 = current_27.rest();
                    if (NIL == current_27) {
                        {
                            SubLObject reflexive_col = (NIL != negatedP) ? ((SubLObject) ($$IrreflexiveBinaryPredicate)) : $$ReflexiveBinaryPredicate;
                            SubLObject isa_sentence = make_binary_formula($$isa, pred, reflexive_col);
                            SubLObject arg1_sentence = make_ternary_formula($$admittedArgument, arg1, ONE_INTEGER, pred);
                            SubLObject arg2_sentence = make_ternary_formula($$admittedArgument, arg2, TWO_INTEGER, pred);
                            SubLObject equals_sentence = (arg1.equal(arg2)) ? ((SubLObject) (NIL)) : make_binary_formula($$equals, arg1, arg2);
                            SubLObject isa_support = arguments.make_hl_support($ISA, isa_sentence, mt, UNPROVIDED);
                            SubLObject arg1_support = arguments.make_hl_support($ADMIT, arg1_sentence, mt, UNPROVIDED);
                            SubLObject arg2_support = arguments.make_hl_support($ADMIT, arg2_sentence, mt, UNPROVIDED);
                            SubLObject equals_support = (NIL != equals_sentence) ? ((SubLObject) (arguments.make_hl_support($EQUALITY, equals_sentence, mt, UNPROVIDED))) : NIL;
                            return listS(isa_support, arg1_support, arg2_support, append(NIL != equals_support ? ((SubLObject) (list(equals_support))) : NIL, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum_26, $list_alt70);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_justify_reflexive(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject negatedP = cycl_utilities.negatedP(literal);
            final SubLObject atomic_sentence = literal_atomic_sentence(literal);
            SubLObject current_$44;
            final SubLObject datum_$43 = current_$44 = atomic_sentence;
            SubLObject pred = NIL;
            SubLObject arg1 = NIL;
            SubLObject arg2 = NIL;
            destructuring_bind_must_consp(current_$44, datum_$43, $list90);
            pred = current_$44.first();
            current_$44 = current_$44.rest();
            destructuring_bind_must_consp(current_$44, datum_$43, $list90);
            arg1 = current_$44.first();
            current_$44 = current_$44.rest();
            destructuring_bind_must_consp(current_$44, datum_$43, $list90);
            arg2 = current_$44.first();
            current_$44 = current_$44.rest();
            if (NIL == current_$44) {
                final SubLObject reflexive_col = (NIL != negatedP) ? $$IrreflexiveBinaryPredicate : $$ReflexiveBinaryPredicate;
                final SubLObject isa_sentence = make_binary_formula($$isa, pred, reflexive_col);
                final SubLObject arg1_sentence = make_ternary_formula($$admittedArgument, arg1, ONE_INTEGER, pred);
                final SubLObject arg2_sentence = make_ternary_formula($$admittedArgument, arg2, TWO_INTEGER, pred);
                final SubLObject equals_sentence = (arg1.equal(arg2)) ? NIL : make_binary_formula($$equals, arg1, arg2);
                final SubLObject isa_support = arguments.make_hl_support($ISA, isa_sentence, mt, UNPROVIDED);
                final SubLObject arg1_support = arguments.make_hl_support($ADMIT, arg1_sentence, mt, UNPROVIDED);
                final SubLObject arg2_support = arguments.make_hl_support($ADMIT, arg2_sentence, mt, UNPROVIDED);
                final SubLObject equals_support = (NIL != equals_sentence) ? arguments.make_hl_support($EQUALITY, equals_sentence, mt, UNPROVIDED) : NIL;
                return listS(isa_support, arg1_support, arg2_support, append(NIL != equals_support ? list(equals_support) : NIL, NIL));
            }
            cdestructuring_bind_error(datum_$43, $list90);
        } else {
            cdestructuring_bind_error(support, $list42);
        }
        return NIL;
    }

    public static final SubLObject hl_forward_mt_combos_reflexive_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject negatedP = negatedP(literal);
                    SubLObject atomic_sentence = literal_atomic_sentence(literal);
                    SubLObject mts = com.cyc.cycjava.cycl.hl_supports.max_floor_mts_where_reflexive(atomic_sentence, negatedP);
                    SubLObject ans = NIL;
                    SubLObject cdolist_list_var = mts;
                    SubLObject mt_28 = NIL;
                    for (mt_28 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt_28 = cdolist_list_var.first()) {
                        ans = cons(arguments.make_hl_support(hl_module, literal, mt_28, tv), ans);
                    }
                    return nreverse(ans);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_forward_mt_combos_reflexive(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject negatedP = cycl_utilities.negatedP(literal);
            final SubLObject atomic_sentence = literal_atomic_sentence(literal);
            final SubLObject mts = max_floor_mts_where_reflexive(atomic_sentence, negatedP);
            SubLObject ans = NIL;
            SubLObject cdolist_list_var = mts;
            SubLObject mt_$45 = NIL;
            mt_$45 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                ans = cons(arguments.make_hl_support(hl_module, literal, mt_$45, tv), ans);
                cdolist_list_var = cdolist_list_var.rest();
                mt_$45 = cdolist_list_var.first();
            } 
            return nreverse(ans);
        }
        cdestructuring_bind_error(support, $list42);
        return NIL;
    }

    public static final SubLObject inference_semantically_valid_irreflexive_literalP_alt(SubLObject literal, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
                    try {
                        at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
                        ans = removal_modules_admitted_formula.inference_admitted_sentence(literal, mt);
                    } finally {
                        at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    public static SubLObject inference_semantically_valid_irreflexive_literalP(final SubLObject literal, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
        try {
            at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
            ans = removal_modules_admitted_formula.inference_admitted_sentence(literal, mt);
        } finally {
            at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static final SubLObject max_floor_mts_where_reflexive_alt(SubLObject literal, SubLObject negatedP) {
        if (negatedP == UNPROVIDED) {
            negatedP = NIL;
        }
        {
            SubLObject predicate = literal_predicate(literal, UNPROVIDED);
            SubLObject arg1 = literal_arg1(literal, UNPROVIDED);
            SubLObject arg1_isas = kb_accessors.arg1_isa(predicate, UNPROVIDED);
            SubLObject arg2 = literal_arg2(literal, UNPROVIDED);
            SubLObject arg2_isas = kb_accessors.arg2_isa(predicate, UNPROVIDED);
            SubLObject reflex_mts = (NIL != negatedP) ? ((SubLObject) (isa.max_floor_mts_of_isa_paths(predicate, $$IrreflexiveBinaryPredicate, UNPROVIDED))) : isa.max_floor_mts_of_isa_paths(predicate, $$ReflexiveBinaryPredicate, UNPROVIDED);
            SubLObject unify_mts = equals.max_floor_mts_where_equals(arg1, arg2);
            SubLObject arg1_mts = com.cyc.cycjava.cycl.hl_supports.max_floor_mts_where_arg_constraints_met(arg1, arg1_isas, UNPROVIDED);
            SubLObject arg2_mts = com.cyc.cycjava.cycl.hl_supports.max_floor_mts_where_arg_constraints_met(arg2, arg2_isas, UNPROVIDED);
            SubLObject answer_mts = NIL;
            if (arg1_mts.equal(arg2_mts)) {
                {
                    SubLObject cdolist_list_var = reflex_mts;
                    SubLObject reflex_mt = NIL;
                    for (reflex_mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , reflex_mt = cdolist_list_var.first()) {
                        {
                            SubLObject cdolist_list_var_29 = unify_mts;
                            SubLObject unify_mt = NIL;
                            for (unify_mt = cdolist_list_var_29.first(); NIL != cdolist_list_var_29; cdolist_list_var_29 = cdolist_list_var_29.rest() , unify_mt = cdolist_list_var_29.first()) {
                                {
                                    SubLObject cdolist_list_var_30 = arg1_mts;
                                    SubLObject arg1_mt = NIL;
                                    for (arg1_mt = cdolist_list_var_30.first(); NIL != cdolist_list_var_30; cdolist_list_var_30 = cdolist_list_var_30.rest() , arg1_mt = cdolist_list_var_30.first()) {
                                        answer_mts = append(answer_mts, inference_trampolines.inference_max_floor_mts_with_cycles_pruned(list(reflex_mt, unify_mt, arg1_mt), UNPROVIDED));
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                {
                    SubLObject cdolist_list_var = reflex_mts;
                    SubLObject reflex_mt = NIL;
                    for (reflex_mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , reflex_mt = cdolist_list_var.first()) {
                        {
                            SubLObject cdolist_list_var_31 = unify_mts;
                            SubLObject unify_mt = NIL;
                            for (unify_mt = cdolist_list_var_31.first(); NIL != cdolist_list_var_31; cdolist_list_var_31 = cdolist_list_var_31.rest() , unify_mt = cdolist_list_var_31.first()) {
                                {
                                    SubLObject cdolist_list_var_32 = arg1_mts;
                                    SubLObject arg1_mt = NIL;
                                    for (arg1_mt = cdolist_list_var_32.first(); NIL != cdolist_list_var_32; cdolist_list_var_32 = cdolist_list_var_32.rest() , arg1_mt = cdolist_list_var_32.first()) {
                                        {
                                            SubLObject cdolist_list_var_33 = arg2_mts;
                                            SubLObject arg2_mt = NIL;
                                            for (arg2_mt = cdolist_list_var_33.first(); NIL != cdolist_list_var_33; cdolist_list_var_33 = cdolist_list_var_33.rest() , arg2_mt = cdolist_list_var_33.first()) {
                                                answer_mts = append(answer_mts, inference_trampolines.inference_max_floor_mts_with_cycles_pruned(list(reflex_mt, unify_mt, arg1_mt, arg2_mt), UNPROVIDED));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return list_utilities.fast_delete_duplicates(answer_mts, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject max_floor_mts_where_reflexive(final SubLObject literal, SubLObject negatedP) {
        if (negatedP == UNPROVIDED) {
            negatedP = NIL;
        }
        final SubLObject predicate = literal_predicate(literal, UNPROVIDED);
        final SubLObject arg1 = literal_arg1(literal, UNPROVIDED);
        final SubLObject arg1_isas = kb_accessors.arg1_isa(predicate, UNPROVIDED);
        final SubLObject arg2 = literal_arg2(literal, UNPROVIDED);
        final SubLObject arg2_isas = kb_accessors.arg2_isa(predicate, UNPROVIDED);
        final SubLObject reflex_mts = (NIL != negatedP) ? isa.max_floor_mts_of_isa_paths(predicate, $$IrreflexiveBinaryPredicate, UNPROVIDED) : isa.max_floor_mts_of_isa_paths(predicate, $$ReflexiveBinaryPredicate, UNPROVIDED);
        final SubLObject unify_mts = equals.max_floor_mts_where_equals(arg1, arg2);
        final SubLObject arg1_mts = max_floor_mts_where_arg_constraints_met(arg1, arg1_isas, UNPROVIDED);
        final SubLObject arg2_mts = max_floor_mts_where_arg_constraints_met(arg2, arg2_isas, UNPROVIDED);
        SubLObject answer_mts = NIL;
        if (arg1_mts.equal(arg2_mts)) {
            SubLObject cdolist_list_var = reflex_mts;
            SubLObject reflex_mt = NIL;
            reflex_mt = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$46 = unify_mts;
                SubLObject unify_mt = NIL;
                unify_mt = cdolist_list_var_$46.first();
                while (NIL != cdolist_list_var_$46) {
                    SubLObject cdolist_list_var_$47 = arg1_mts;
                    SubLObject arg1_mt = NIL;
                    arg1_mt = cdolist_list_var_$47.first();
                    while (NIL != cdolist_list_var_$47) {
                        answer_mts = append(answer_mts, inference_trampolines.inference_max_floor_mts_with_cycles_pruned(list(reflex_mt, unify_mt, arg1_mt), UNPROVIDED));
                        cdolist_list_var_$47 = cdolist_list_var_$47.rest();
                        arg1_mt = cdolist_list_var_$47.first();
                    } 
                    cdolist_list_var_$46 = cdolist_list_var_$46.rest();
                    unify_mt = cdolist_list_var_$46.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                reflex_mt = cdolist_list_var.first();
            } 
        } else {
            SubLObject cdolist_list_var = reflex_mts;
            SubLObject reflex_mt = NIL;
            reflex_mt = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$48 = unify_mts;
                SubLObject unify_mt = NIL;
                unify_mt = cdolist_list_var_$48.first();
                while (NIL != cdolist_list_var_$48) {
                    SubLObject cdolist_list_var_$49 = arg1_mts;
                    SubLObject arg1_mt = NIL;
                    arg1_mt = cdolist_list_var_$49.first();
                    while (NIL != cdolist_list_var_$49) {
                        SubLObject cdolist_list_var_$50 = arg2_mts;
                        SubLObject arg2_mt = NIL;
                        arg2_mt = cdolist_list_var_$50.first();
                        while (NIL != cdolist_list_var_$50) {
                            answer_mts = append(answer_mts, inference_trampolines.inference_max_floor_mts_with_cycles_pruned(list(reflex_mt, unify_mt, arg1_mt, arg2_mt), UNPROVIDED));
                            cdolist_list_var_$50 = cdolist_list_var_$50.rest();
                            arg2_mt = cdolist_list_var_$50.first();
                        } 
                        cdolist_list_var_$49 = cdolist_list_var_$49.rest();
                        arg1_mt = cdolist_list_var_$49.first();
                    } 
                    cdolist_list_var_$48 = cdolist_list_var_$48.rest();
                    unify_mt = cdolist_list_var_$48.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                reflex_mt = cdolist_list_var.first();
            } 
        }
        return list_utilities.fast_delete_duplicates(answer_mts, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject max_floor_mts_where_arg_constraints_met_internal_alt(SubLObject v_term, SubLObject collections, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        {
            SubLObject mt_combos = NIL;
            SubLObject result = NIL;
            {
                SubLObject cdolist_list_var = collections;
                SubLObject collection = NIL;
                for (collection = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collection = cdolist_list_var.first()) {
                    {
                        SubLObject mt_combo = isa.max_floor_mts_of_isa_paths(v_term, collection, tv);
                        if (NIL != mt_combo) {
                            mt_combos = cons(mt_combo, mt_combos);
                        } else {
                            return NIL;
                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = list_utilities.cartesian_product(mt_combos, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject mt_combo = NIL;
                for (mt_combo = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt_combo = cdolist_list_var.first()) {
                    result = append(result, inference_trampolines.inference_max_floor_mts_with_cycles_pruned(mt_combo, UNPROVIDED));
                }
            }
            return result;
        }
    }

    public static SubLObject max_floor_mts_where_arg_constraints_met_internal(final SubLObject v_term, final SubLObject collections, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLObject mt_combos = NIL;
        SubLObject result = NIL;
        SubLObject cdolist_list_var = collections;
        SubLObject collection = NIL;
        collection = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject mt_combo = isa.max_floor_mts_of_isa_paths(v_term, collection, tv);
            if (NIL == mt_combo) {
                return NIL;
            }
            mt_combos = cons(mt_combo, mt_combos);
            cdolist_list_var = cdolist_list_var.rest();
            collection = cdolist_list_var.first();
        } 
        cdolist_list_var = list_utilities.cartesian_product(mt_combos, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject mt_combo2 = NIL;
        mt_combo2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = append(result, inference_trampolines.inference_max_floor_mts_with_cycles_pruned(mt_combo2, UNPROVIDED));
            cdolist_list_var = cdolist_list_var.rest();
            mt_combo2 = cdolist_list_var.first();
        } 
        return result;
    }

    public static final SubLObject max_floor_mts_where_arg_constraints_met_alt(SubLObject v_term, SubLObject collections, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.hl_supports.max_floor_mts_where_arg_constraints_met_internal(v_term, collections, tv);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, MAX_FLOOR_MTS_WHERE_ARG_CONSTRAINTS_MET, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), MAX_FLOOR_MTS_WHERE_ARG_CONSTRAINTS_MET, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, MAX_FLOOR_MTS_WHERE_ARG_CONSTRAINTS_MET, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_3(v_term, collections, tv);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw42$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (v_term.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (collections.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && tv.equal(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.hl_supports.max_floor_mts_where_arg_constraints_met_internal(v_term, collections, tv)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(v_term, collections, tv));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject max_floor_mts_where_arg_constraints_met(final SubLObject v_term, final SubLObject collections, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return max_floor_mts_where_arg_constraints_met_internal(v_term, collections, tv);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, MAX_FLOOR_MTS_WHERE_ARG_CONSTRAINTS_MET, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), MAX_FLOOR_MTS_WHERE_ARG_CONSTRAINTS_MET, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, MAX_FLOOR_MTS_WHERE_ARG_CONSTRAINTS_MET, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(v_term, collections, tv);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (collections.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && tv.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(max_floor_mts_where_arg_constraints_met_internal(v_term, collections, tv)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, collections, tv));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject hl_validate_reflexive_alt(SubLObject support, SubLObject validation_level) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                if ((validation_level != $NONE) && (NIL != inference_trampolines.inference_irreflexive_predicateP(literal_predicate(literal, UNPROVIDED)))) {
                    return com.cyc.cycjava.cycl.hl_supports.inference_semantically_valid_irreflexive_literalP(literal, mt);
                }
                return com.cyc.cycjava.cycl.hl_supports.hl_validate_default(support, validation_level);
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_validate_reflexive(final SubLObject support, final SubLObject validation_level) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(support, $list42);
            return NIL;
        }
        if ((validation_level != $NONE) && (NIL != inference_trampolines.inference_irreflexive_predicateP(literal_predicate(literal, UNPROVIDED)))) {
            return inference_semantically_valid_irreflexive_literalP(literal, mt);
        }
        return hl_validate_default(support, validation_level);
    }

    public static final SubLObject hl_verify_reflexive_on_alt(SubLObject support) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject datum = support;
                SubLObject current = datum;
                SubLObject hl_module = NIL;
                SubLObject literal = NIL;
                SubLObject mt = NIL;
                SubLObject tv = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt23);
                hl_module = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt23);
                literal = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt23);
                mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt23);
                tv = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL == negatedP(literal)) {
                        {
                            SubLObject atomic_sentence = literal_atomic_sentence(literal);
                            SubLObject datum_34 = formula_args(atomic_sentence, UNPROVIDED);
                            SubLObject current_35 = datum_34;
                            SubLObject arg1 = NIL;
                            SubLObject arg2 = NIL;
                            destructuring_bind_must_consp(current_35, datum_34, $list_alt80);
                            arg1 = current_35.first();
                            current_35 = current_35.rest();
                            destructuring_bind_must_consp(current_35, datum_34, $list_alt80);
                            arg2 = current_35.first();
                            current_35 = current_35.rest();
                            if (NIL == current_35) {
                                {
                                    SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                                    {
                                        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                        try {
                                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                            ans = makeBoolean((NIL != unification_utilities.term_unify(arg1, arg2, UNPROVIDED, UNPROVIDED)) && (NIL != list_utilities.non_empty_list_p(removal_modules_reflexive_on.supports_for_reflexive_on(literal, mt))));
                                        } finally {
                                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum_34, $list_alt80);
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt23);
                }
                return ans;
            }
        }
    }

    public static SubLObject hl_verify_reflexive_on(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL == cycl_utilities.negatedP(literal)) {
                final SubLObject atomic_sentence = literal_atomic_sentence(literal);
                SubLObject current_$52;
                final SubLObject datum_$51 = current_$52 = cycl_utilities.formula_args(atomic_sentence, UNPROVIDED);
                SubLObject arg1 = NIL;
                SubLObject arg2 = NIL;
                destructuring_bind_must_consp(current_$52, datum_$51, $list100);
                arg1 = current_$52.first();
                current_$52 = current_$52.rest();
                destructuring_bind_must_consp(current_$52, datum_$51, $list100);
                arg2 = current_$52.first();
                current_$52 = current_$52.rest();
                if (NIL == current_$52) {
                    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        ans = makeBoolean((NIL != unification_utilities.term_unify(arg1, arg2, UNPROVIDED, UNPROVIDED)) && (NIL != list_utilities.non_empty_list_p(removal_modules_reflexive_on.supports_for_reflexive_on(literal, mt))));
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                } else {
                    cdestructuring_bind_error(datum_$51, $list100);
                }
            }
        } else {
            cdestructuring_bind_error(support, $list42);
        }
        return ans;
    }

    public static final SubLObject hl_justify_reflexive_on_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL == negatedP(literal)) {
                    return removal_modules_reflexive_on.supports_for_reflexive_on(literal, mt);
                }
                return NIL;
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_justify_reflexive_on(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(support, $list42);
            return NIL;
        }
        if (NIL == cycl_utilities.negatedP(literal)) {
            return removal_modules_reflexive_on.supports_for_reflexive_on(literal, mt);
        }
        return NIL;
    }

    public static final SubLObject hl_forward_mt_combos_reflexive_on_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL == negatedP(literal)) {
                    {
                        SubLObject atomic_sentence = literal_atomic_sentence(literal);
                        SubLObject mts = com.cyc.cycjava.cycl.hl_supports.max_floor_mts_where_reflexive_on(atomic_sentence);
                        SubLObject ans = NIL;
                        SubLObject cdolist_list_var = mts;
                        SubLObject mt_36 = NIL;
                        for (mt_36 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt_36 = cdolist_list_var.first()) {
                            ans = cons(arguments.make_hl_support(hl_module, literal, mt_36, tv), ans);
                        }
                        return nreverse(ans);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_forward_mt_combos_reflexive_on(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL == cycl_utilities.negatedP(literal)) {
                final SubLObject atomic_sentence = literal_atomic_sentence(literal);
                final SubLObject mts = max_floor_mts_where_reflexive_on(atomic_sentence);
                SubLObject ans = NIL;
                SubLObject cdolist_list_var = mts;
                SubLObject mt_$53 = NIL;
                mt_$53 = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    ans = cons(arguments.make_hl_support(hl_module, literal, mt_$53, tv), ans);
                    cdolist_list_var = cdolist_list_var.rest();
                    mt_$53 = cdolist_list_var.first();
                } 
                return nreverse(ans);
            }
        } else {
            cdestructuring_bind_error(support, $list42);
        }
        return NIL;
    }

    public static final SubLObject max_floor_mts_where_reflexive_on_alt(SubLObject literal) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = literal;
                SubLObject current = datum;
                SubLObject predicate = NIL;
                SubLObject arg1 = NIL;
                SubLObject arg2 = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt81);
                predicate = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt81);
                arg1 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt81);
                arg2 = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject mt_combos = NIL;
                        SubLObject answer_mts = NIL;
                        SubLObject reflex_mt_col_pairs = NIL;
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                {
                                    SubLObject pred_var = $$reflexiveOn;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(predicate, ONE_INTEGER, pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(predicate, ONE_INTEGER, pred_var);
                                            SubLObject done_var = NIL;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                                {
                                                                    SubLObject done_var_37 = NIL;
                                                                    SubLObject token_var_38 = NIL;
                                                                    while (NIL == done_var_37) {
                                                                        {
                                                                            SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_38);
                                                                            SubLObject valid_39 = makeBoolean(token_var_38 != gaf);
                                                                            if (NIL != valid_39) {
                                                                                reflex_mt_col_pairs = cons(cons(assertion_mt(gaf), gaf_arg2(gaf)), reflex_mt_col_pairs);
                                                                            }
                                                                            done_var_37 = makeBoolean(NIL == valid_39);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0_40 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_40, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean(NIL == valid);
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
                        {
                            SubLObject unify_mts = equals.max_floor_mts_where_equals(arg1, arg2);
                            SubLObject cdolist_list_var = unify_mts;
                            SubLObject unify_mt = NIL;
                            for (unify_mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , unify_mt = cdolist_list_var.first()) {
                                {
                                    SubLObject cdolist_list_var_41 = reflex_mt_col_pairs;
                                    SubLObject cons = NIL;
                                    for (cons = cdolist_list_var_41.first(); NIL != cdolist_list_var_41; cdolist_list_var_41 = cdolist_list_var_41.rest() , cons = cdolist_list_var_41.first()) {
                                        {
                                            SubLObject datum_42 = cons;
                                            SubLObject current_43 = datum_42;
                                            SubLObject reflex_mt = NIL;
                                            SubLObject col = NIL;
                                            destructuring_bind_must_consp(current_43, datum_42, $list_alt86);
                                            reflex_mt = current_43.first();
                                            current_43 = current_43.rest();
                                            col = current_43;
                                            {
                                                SubLObject isa1_mts = isa.max_floor_mts_of_isa_paths(arg1, col, UNPROVIDED);
                                                SubLObject isa2_mts = (arg1.equal(arg2)) ? ((SubLObject) (isa1_mts)) : isa.max_floor_mts_of_isa_paths(arg2, col, UNPROVIDED);
                                                SubLObject cdolist_list_var_44 = isa1_mts;
                                                SubLObject isa1_mt = NIL;
                                                for (isa1_mt = cdolist_list_var_44.first(); NIL != cdolist_list_var_44; cdolist_list_var_44 = cdolist_list_var_44.rest() , isa1_mt = cdolist_list_var_44.first()) {
                                                    {
                                                        SubLObject cdolist_list_var_45 = isa2_mts;
                                                        SubLObject isa2_mt = NIL;
                                                        for (isa2_mt = cdolist_list_var_45.first(); NIL != cdolist_list_var_45; cdolist_list_var_45 = cdolist_list_var_45.rest() , isa2_mt = cdolist_list_var_45.first()) {
                                                            {
                                                                SubLObject combo = list(reflex_mt, unify_mt, isa1_mt, isa2_mt);
                                                                combo = delete_duplicates(combo, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                combo = Sort.sort(combo, symbol_function($sym87$TERM__), UNPROVIDED);
                                                                {
                                                                    SubLObject item_var = combo;
                                                                    if (NIL == member(item_var, mt_combos, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                                        mt_combos = cons(item_var, mt_combos);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        {
                            SubLObject cdolist_list_var = mt_combos;
                            SubLObject mt_combo = NIL;
                            for (mt_combo = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt_combo = cdolist_list_var.first()) {
                                {
                                    SubLObject target_set = max_floor_mts(mt_combo, UNPROVIDED, UNPROVIDED);
                                    answer_mts = append(target_set, answer_mts);
                                }
                            }
                        }
                        answer_mts = list_utilities.remove_duplicate_forts(answer_mts);
                        {
                            SubLObject sane_mts = NIL;
                            SubLObject cdolist_list_var = answer_mts;
                            SubLObject answer_mt = NIL;
                            for (answer_mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , answer_mt = cdolist_list_var.first()) {
                                if (NIL != arg_type.semantically_valid_literalP(literal, answer_mt, UNPROVIDED)) {
                                    sane_mts = cons(answer_mt, sane_mts);
                                }
                            }
                            answer_mts = sane_mts;
                        }
                        return answer_mts;
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt81);
                }
            }
            return NIL;
        }
    }

    public static SubLObject max_floor_mts_where_reflexive_on(final SubLObject literal) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject predicate = NIL;
        SubLObject arg1 = NIL;
        SubLObject arg2 = NIL;
        destructuring_bind_must_consp(literal, literal, $list101);
        predicate = literal.first();
        SubLObject current = literal.rest();
        destructuring_bind_must_consp(current, literal, $list101);
        arg1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, literal, $list101);
        arg2 = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject mt_combos = NIL;
            SubLObject answer_mts = NIL;
            SubLObject reflex_mt_col_pairs = NIL;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                final SubLObject pred_var = $$reflexiveOn;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(predicate, ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(predicate, ONE_INTEGER, pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                SubLObject done_var_$54 = NIL;
                                final SubLObject token_var_$55 = NIL;
                                while (NIL == done_var_$54) {
                                    final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$55);
                                    final SubLObject valid_$56 = makeBoolean(!token_var_$55.eql(gaf));
                                    if (NIL != valid_$56) {
                                        reflex_mt_col_pairs = cons(cons(assertions_high.assertion_mt(gaf), assertions_high.gaf_arg2(gaf)), reflex_mt_col_pairs);
                                    }
                                    done_var_$54 = makeBoolean(NIL == valid_$56);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$57 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$57, thread);
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
            SubLObject cdolist_list_var;
            final SubLObject unify_mts = cdolist_list_var = equals.max_floor_mts_where_equals(arg1, arg2);
            SubLObject unify_mt = NIL;
            unify_mt = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$58 = reflex_mt_col_pairs;
                SubLObject cons = NIL;
                cons = cdolist_list_var_$58.first();
                while (NIL != cdolist_list_var_$58) {
                    SubLObject current_$60;
                    final SubLObject datum_$59 = current_$60 = cons;
                    SubLObject reflex_mt = NIL;
                    SubLObject col = NIL;
                    destructuring_bind_must_consp(current_$60, datum_$59, $list106);
                    reflex_mt = current_$60.first();
                    current_$60 = col = current_$60.rest();
                    final SubLObject isa1_mts = isa.max_floor_mts_of_isa_paths(arg1, col, UNPROVIDED);
                    final SubLObject isa2_mts = (arg1.equal(arg2)) ? isa1_mts : isa.max_floor_mts_of_isa_paths(arg2, col, UNPROVIDED);
                    SubLObject cdolist_list_var_$59 = isa1_mts;
                    SubLObject isa1_mt = NIL;
                    isa1_mt = cdolist_list_var_$59.first();
                    while (NIL != cdolist_list_var_$59) {
                        SubLObject cdolist_list_var_$60 = isa2_mts;
                        SubLObject isa2_mt = NIL;
                        isa2_mt = cdolist_list_var_$60.first();
                        while (NIL != cdolist_list_var_$60) {
                            SubLObject combo = list(reflex_mt, unify_mt, isa1_mt, isa2_mt);
                            combo = delete_duplicates(combo, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            final SubLObject item_var;
                            combo = item_var = Sort.sort(combo, symbol_function($sym107$TERM__), UNPROVIDED);
                            if (NIL == member(item_var, mt_combos, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                mt_combos = cons(item_var, mt_combos);
                            }
                            cdolist_list_var_$60 = cdolist_list_var_$60.rest();
                            isa2_mt = cdolist_list_var_$60.first();
                        } 
                        cdolist_list_var_$59 = cdolist_list_var_$59.rest();
                        isa1_mt = cdolist_list_var_$59.first();
                    } 
                    cdolist_list_var_$58 = cdolist_list_var_$58.rest();
                    cons = cdolist_list_var_$58.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                unify_mt = cdolist_list_var.first();
            } 
            SubLObject cdolist_list_var2 = mt_combos;
            SubLObject mt_combo = NIL;
            mt_combo = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                final SubLObject target_set = genl_mts.max_floor_mts(mt_combo, UNPROVIDED, UNPROVIDED);
                answer_mts = append(target_set, answer_mts);
                cdolist_list_var2 = cdolist_list_var2.rest();
                mt_combo = cdolist_list_var2.first();
            } 
            answer_mts = list_utilities.remove_duplicate_forts(answer_mts);
            SubLObject sane_mts = NIL;
            cdolist_list_var = answer_mts;
            SubLObject answer_mt = NIL;
            answer_mt = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != arg_type.semantically_valid_literalP(literal, answer_mt, UNPROVIDED)) {
                    sane_mts = cons(answer_mt, sane_mts);
                }
                cdolist_list_var = cdolist_list_var.rest();
                answer_mt = cdolist_list_var.first();
            } 
            answer_mts = sane_mts;
            return answer_mts;
        }
        cdestructuring_bind_error(literal, $list101);
        return NIL;
    }

    public static SubLObject transitivity_support_p(final SubLObject v_object) {
        return makeBoolean((NIL != arguments.support_p(v_object)) && ($TRANSITIVITY == arguments.support_module(v_object)));
    }

    public static final SubLObject hl_verify_transitivity_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL == negatedP(literal)) {
                    {
                        SubLObject datum_46 = literal_atomic_sentence(literal);
                        SubLObject current_47 = datum_46;
                        SubLObject predicate = NIL;
                        SubLObject arg1 = NIL;
                        SubLObject arg2 = NIL;
                        destructuring_bind_must_consp(current_47, datum_46, $list_alt81);
                        predicate = current_47.first();
                        current_47 = current_47.rest();
                        destructuring_bind_must_consp(current_47, datum_46, $list_alt81);
                        arg1 = current_47.first();
                        current_47 = current_47.rest();
                        destructuring_bind_must_consp(current_47, datum_46, $list_alt81);
                        arg2 = current_47.first();
                        current_47 = current_47.rest();
                        if (NIL == current_47) {
                            return removal_modules_transitivity.inference_transitivity_check_strict(predicate, arg1, arg2, mt, tv);
                        } else {
                            cdestructuring_bind_error(datum_46, $list_alt81);
                        }
                    }
                } else {
                    return T;
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_verify_transitivity(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != cycl_utilities.negatedP(literal)) {
                return T;
            }
            SubLObject current_$64;
            final SubLObject datum_$63 = current_$64 = literal_atomic_sentence(literal);
            SubLObject predicate = NIL;
            SubLObject arg1 = NIL;
            SubLObject arg2 = NIL;
            destructuring_bind_must_consp(current_$64, datum_$63, $list101);
            predicate = current_$64.first();
            current_$64 = current_$64.rest();
            destructuring_bind_must_consp(current_$64, datum_$63, $list101);
            arg1 = current_$64.first();
            current_$64 = current_$64.rest();
            destructuring_bind_must_consp(current_$64, datum_$63, $list101);
            arg2 = current_$64.first();
            current_$64 = current_$64.rest();
            if (NIL == current_$64) {
                return removal_modules_transitivity.inference_transitivity_check_strict(predicate, arg1, arg2, mt, tv);
            }
            cdestructuring_bind_error(datum_$63, $list101);
        } else {
            cdestructuring_bind_error(support, $list42);
        }
        return NIL;
    }

    public static final SubLObject hl_forward_mt_combos_transitivity_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject mts = NIL;
                    SubLObject ans = NIL;
                    if (NIL == negatedP(literal)) {
                        {
                            SubLObject datum_48 = literal_atomic_sentence(literal);
                            SubLObject current_49 = datum_48;
                            SubLObject predicate = NIL;
                            SubLObject arg1 = NIL;
                            SubLObject arg2 = NIL;
                            destructuring_bind_must_consp(current_49, datum_48, $list_alt81);
                            predicate = current_49.first();
                            current_49 = current_49.rest();
                            destructuring_bind_must_consp(current_49, datum_48, $list_alt81);
                            arg1 = current_49.first();
                            current_49 = current_49.rest();
                            destructuring_bind_must_consp(current_49, datum_48, $list_alt81);
                            arg2 = current_49.first();
                            current_49 = current_49.rest();
                            if (NIL == current_49) {
                                mts = com.cyc.cycjava.cycl.hl_supports.max_floor_mts_of_transitivity_paths(predicate, arg1, arg2, tv);
                            } else {
                                cdestructuring_bind_error(datum_48, $list_alt81);
                            }
                        }
                    } else {
                        mts = list(mt);
                    }
                    {
                        SubLObject cdolist_list_var = mts;
                        SubLObject mt_50 = NIL;
                        for (mt_50 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt_50 = cdolist_list_var.first()) {
                            ans = cons(arguments.make_hl_support(hl_module, literal, mt_50, tv), ans);
                        }
                    }
                    return nreverse(ans);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_forward_mt_combos_transitivity(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject mts = NIL;
            SubLObject ans = NIL;
            if (NIL == cycl_utilities.negatedP(literal)) {
                SubLObject current_$66;
                final SubLObject datum_$65 = current_$66 = literal_atomic_sentence(literal);
                SubLObject predicate = NIL;
                SubLObject arg1 = NIL;
                SubLObject arg2 = NIL;
                destructuring_bind_must_consp(current_$66, datum_$65, $list101);
                predicate = current_$66.first();
                current_$66 = current_$66.rest();
                destructuring_bind_must_consp(current_$66, datum_$65, $list101);
                arg1 = current_$66.first();
                current_$66 = current_$66.rest();
                destructuring_bind_must_consp(current_$66, datum_$65, $list101);
                arg2 = current_$66.first();
                current_$66 = current_$66.rest();
                if (NIL == current_$66) {
                    mts = max_floor_mts_of_transitivity_paths(predicate, arg1, arg2, tv);
                } else {
                    cdestructuring_bind_error(datum_$65, $list101);
                }
            } else {
                mts = list(mt);
            }
            SubLObject cdolist_list_var = mts;
            SubLObject mt_$67 = NIL;
            mt_$67 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                ans = cons(arguments.make_hl_support(hl_module, literal, mt_$67, tv), ans);
                cdolist_list_var = cdolist_list_var.rest();
                mt_$67 = cdolist_list_var.first();
            } 
            return nreverse(ans);
        }
        cdestructuring_bind_error(support, $list42);
        return NIL;
    }

    public static final SubLObject hl_justify_transitivity_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL == negatedP(literal)) {
                    {
                        SubLObject datum_51 = literal_atomic_sentence(literal);
                        SubLObject current_52 = datum_51;
                        SubLObject predicate = NIL;
                        SubLObject arg1 = NIL;
                        SubLObject arg2 = NIL;
                        destructuring_bind_must_consp(current_52, datum_51, $list_alt81);
                        predicate = current_52.first();
                        current_52 = current_52.rest();
                        destructuring_bind_must_consp(current_52, datum_51, $list_alt81);
                        arg1 = current_52.first();
                        current_52 = current_52.rest();
                        destructuring_bind_must_consp(current_52, datum_51, $list_alt81);
                        arg2 = current_52.first();
                        current_52 = current_52.rest();
                        if (NIL == current_52) {
                            return removal_modules_transitivity.inference_transitivity_justify(predicate, arg1, arg2, mt, tv);
                        } else {
                            cdestructuring_bind_error(datum_51, $list_alt81);
                        }
                    }
                } else {
                    return NIL;
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_justify_transitivity(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != cycl_utilities.negatedP(literal)) {
                return NIL;
            }
            SubLObject current_$69;
            final SubLObject datum_$68 = current_$69 = literal_atomic_sentence(literal);
            SubLObject predicate = NIL;
            SubLObject arg1 = NIL;
            SubLObject arg2 = NIL;
            destructuring_bind_must_consp(current_$69, datum_$68, $list101);
            predicate = current_$69.first();
            current_$69 = current_$69.rest();
            destructuring_bind_must_consp(current_$69, datum_$68, $list101);
            arg1 = current_$69.first();
            current_$69 = current_$69.rest();
            destructuring_bind_must_consp(current_$69, datum_$68, $list101);
            arg2 = current_$69.first();
            current_$69 = current_$69.rest();
            if (NIL == current_$69) {
                return removal_modules_transitivity.inference_transitivity_justify(predicate, arg1, arg2, mt, tv);
            }
            cdestructuring_bind_error(datum_$68, $list101);
        } else {
            cdestructuring_bind_error(support, $list42);
        }
        return NIL;
    }

    public static final SubLObject hl_verify_contextual_transitivity_alt(SubLObject support) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = gt_vars.$gt_handle_non_transitive_predicateP$.currentBinding(thread);
                    try {
                        gt_vars.$gt_handle_non_transitive_predicateP$.bind(T, thread);
                        result = com.cyc.cycjava.cycl.hl_supports.hl_verify_transitivity(support);
                    } finally {
                        gt_vars.$gt_handle_non_transitive_predicateP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject hl_verify_contextual_transitivity(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_handle_non_transitive_predicateP$.currentBinding(thread);
        try {
            gt_vars.$gt_handle_non_transitive_predicateP$.bind(T, thread);
            result = hl_verify_transitivity(support);
        } finally {
            gt_vars.$gt_handle_non_transitive_predicateP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject hl_justify_contextual_transitivity_alt(SubLObject support) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = gt_vars.$gt_handle_non_transitive_predicateP$.currentBinding(thread);
                    try {
                        gt_vars.$gt_handle_non_transitive_predicateP$.bind(T, thread);
                        result = com.cyc.cycjava.cycl.hl_supports.hl_justify_transitivity(support);
                    } finally {
                        gt_vars.$gt_handle_non_transitive_predicateP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject hl_justify_contextual_transitivity(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_handle_non_transitive_predicateP$.currentBinding(thread);
        try {
            gt_vars.$gt_handle_non_transitive_predicateP$.bind(T, thread);
            result = hl_justify_transitivity(support);
        } finally {
            gt_vars.$gt_handle_non_transitive_predicateP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject max_floor_mts_of_transitivity_paths_alt(SubLObject predicate, SubLObject arg1, SubLObject arg2, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = $TRUE_DEF;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mts = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                        mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                        mts = ghl_search_methods.gt_max_floor_mts_of_predicate_paths(predicate, arg1, arg2, tv);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return mts;
            }
        }
    }

    public static SubLObject max_floor_mts_of_transitivity_paths(final SubLObject predicate, final SubLObject arg1, final SubLObject arg2, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = $TRUE_DEF;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mts = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
            mts = ghl_search_methods.ghl_max_floor_mts_of_predicate_paths(predicate, arg1, arg2, tv);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return mts;
    }

    public static final SubLObject hl_verify_tva_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject asent = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt96);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt96);
            asent = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt96);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt96);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                return removal_modules_tva_lookup.inference_tva_check(asent, mt);
            } else {
                cdestructuring_bind_error(datum, $list_alt96);
            }
        }
        return NIL;
    }

    public static SubLObject hl_verify_tva(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject asent = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list116);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list116);
        asent = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list116);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list116);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            return removal_modules_tva_lookup.inference_tva_check(asent, mt, UNPROVIDED);
        }
        cdestructuring_bind_error(support, $list116);
        return NIL;
    }

    public static final SubLObject hl_justify_tva_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject asent = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt96);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt96);
            asent = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt96);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt96);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                return removal_modules_tva_lookup.inference_tva_justify(asent, mt);
            } else {
                cdestructuring_bind_error(datum, $list_alt96);
            }
        }
        return NIL;
    }

    public static SubLObject hl_justify_tva(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject asent = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list116);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list116);
        asent = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list116);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list116);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            return removal_modules_tva_lookup.inference_tva_justify(asent, mt);
        }
        cdestructuring_bind_error(support, $list116);
        return NIL;
    }

    public static final SubLObject hl_forward_mt_combos_tva_alt(SubLObject support) {
        {
            SubLObject mts = NIL;
            SubLObject ans = NIL;
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject asent = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt96);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt96);
            asent = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt96);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt96);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                mts = removal_modules_tva_lookup.inference_tva_max_floor_mts(asent);
                {
                    SubLObject cdolist_list_var = mts;
                    SubLObject mt_53 = NIL;
                    for (mt_53 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt_53 = cdolist_list_var.first()) {
                        ans = cons(arguments.make_hl_support(hl_module, asent, mt_53, tv), ans);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt96);
            }
            return ans;
        }
    }

    public static SubLObject hl_forward_mt_combos_tva(final SubLObject support) {
        SubLObject mts = NIL;
        SubLObject ans = NIL;
        SubLObject hl_module = NIL;
        SubLObject asent = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list116);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list116);
        asent = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list116);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list116);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject cdolist_list_var;
            mts = cdolist_list_var = removal_modules_tva_lookup.inference_tva_max_floor_mts(asent);
            SubLObject mt_$70 = NIL;
            mt_$70 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                ans = cons(arguments.make_hl_support(hl_module, asent, mt_$70, tv), ans);
                cdolist_list_var = cdolist_list_var.rest();
                mt_$70 = cdolist_list_var.first();
            } 
        } else {
            cdestructuring_bind_error(support, $list116);
        }
        return ans;
    }

    public static final SubLObject hl_verify_rtv_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject asent = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt96);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt96);
            asent = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt96);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt96);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                return removal_modules_rtv.inference_rtv_check(asent, mt);
            } else {
                cdestructuring_bind_error(datum, $list_alt96);
            }
        }
        return NIL;
    }

    public static SubLObject hl_verify_rtv(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject asent = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list116);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list116);
        asent = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list116);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list116);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            return removal_modules_rtv.inference_rtv_check(asent, mt);
        }
        cdestructuring_bind_error(support, $list116);
        return NIL;
    }

    public static final SubLObject hl_justify_rtv_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject asent = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt96);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt96);
            asent = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt96);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt96);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                return removal_modules_rtv.inference_rtv_justify(asent, UNPROVIDED);
            } else {
                cdestructuring_bind_error(datum, $list_alt96);
            }
        }
        return NIL;
    }

    public static SubLObject hl_justify_rtv(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject asent = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list116);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list116);
        asent = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list116);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list116);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            return removal_modules_rtv.inference_rtv_justify(asent, UNPROVIDED);
        }
        cdestructuring_bind_error(support, $list116);
        return NIL;
    }

    public static final SubLObject hl_forward_mt_combos_rtv_alt(SubLObject support) {
        {
            SubLObject mts = NIL;
            SubLObject ans = NIL;
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject asent = NIL;
            SubLObject support_mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt99);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt99);
            asent = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt99);
            support_mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt99);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                mts = removal_modules_rtv.inference_rtv_max_floor_mts(asent, support_mt);
                {
                    SubLObject cdolist_list_var = mts;
                    SubLObject mt = NIL;
                    for (mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt = cdolist_list_var.first()) {
                        ans = cons(arguments.make_hl_support(hl_module, asent, mt, tv), ans);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt99);
            }
            return ans;
        }
    }

    public static SubLObject hl_forward_mt_combos_rtv(final SubLObject support) {
        SubLObject mts = NIL;
        SubLObject ans = NIL;
        SubLObject hl_module = NIL;
        SubLObject asent = NIL;
        SubLObject support_mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list119);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list119);
        asent = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list119);
        support_mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list119);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject cdolist_list_var;
            mts = cdolist_list_var = removal_modules_rtv.inference_rtv_max_floor_mts(asent, support_mt);
            SubLObject mt = NIL;
            mt = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                ans = cons(arguments.make_hl_support(hl_module, asent, mt, tv), ans);
                cdolist_list_var = cdolist_list_var.rest();
                mt = cdolist_list_var.first();
            } 
        } else {
            cdestructuring_bind_error(support, $list119);
        }
        return ans;
    }

    public static final SubLObject hl_verify_minimize_alt(SubLObject support) {
        {
            SubLObject ans = NIL;
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject formula = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt102);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt102);
            formula = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt102);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt102);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject operator = formula_operator(formula);
                    SubLObject pcase_var = operator;
                    if (pcase_var.eql($$not) || pcase_var.eql($$unknownSentence)) {
                        {
                            SubLObject minimized_formula = formula_arg1(formula, UNPROVIDED);
                            ans = makeBoolean(NIL == ask_utilities.inference_literal_ask(minimized_formula, mt));
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt102);
            }
            return ans;
        }
    }

    public static SubLObject hl_verify_minimize(final SubLObject support) {
        SubLObject ans = NIL;
        SubLObject hl_module = NIL;
        SubLObject formula = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list122);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list122);
        formula = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list122);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list122);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject pcase_var;
            final SubLObject operator = pcase_var = cycl_utilities.formula_operator(formula);
            if (pcase_var.eql($$not) || pcase_var.eql($$unknownSentence)) {
                final SubLObject minimized_formula = cycl_utilities.formula_arg1(formula, UNPROVIDED);
                ans = makeBoolean(NIL == ask_utilities.inference_literal_ask(minimized_formula, mt));
            }
        } else {
            cdestructuring_bind_error(support, $list122);
        }
        return ans;
    }

    public static final SubLObject hl_verify_consistent_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL == negatedP(literal)) {
                    return removal_modules_consistent.inference_consistent_check(literal_arg1(literal, UNPROVIDED), mt);
                } else {
                    return removal_modules_consistent.inference_inconsistent_check(literal_arg1(literal, UNPROVIDED), mt);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_verify_consistent(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(support, $list42);
            return NIL;
        }
        if (NIL == cycl_utilities.negatedP(literal)) {
            return removal_modules_consistent.inference_consistent_check(literal_arg1(literal, UNPROVIDED), mt);
        }
        return removal_modules_consistent.inference_inconsistent_check(literal_arg1(literal, UNPROVIDED), mt);
    }

    public static final SubLObject hl_justify_consistent_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != negatedP(literal)) {
                    return com.cyc.cycjava.cycl.hl_supports.hl_justify_query_int(negate(literal_arg1(negate(literal), UNPROVIDED)), mt, T);
                } else {
                    return com.cyc.cycjava.cycl.hl_supports.hl_justify_query_int(literal_arg1(literal, UNPROVIDED), mt, T);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_justify_consistent(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(support, $list42);
            return NIL;
        }
        if (NIL != cycl_utilities.negatedP(literal)) {
            return hl_justify_query_int(cycl_utilities.negate(literal_arg1(cycl_utilities.negate(literal), UNPROVIDED)), mt, T);
        }
        return hl_justify_query_int(literal_arg1(literal, UNPROVIDED), mt, T);
    }

    public static final SubLObject hl_verify_conceptually_related_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL == negatedP(literal)) {
                    return removal_modules_conceptually_related.conceptually_relatedP(literal_arg1(literal, UNPROVIDED), literal_arg2(literal, UNPROVIDED), mt, UNPROVIDED);
                }
                literal = literal_atomic_sentence(literal);
                return removal_modules_conceptually_related.not_conceptually_relatedP(literal_arg1(literal, UNPROVIDED), literal_arg2(literal, UNPROVIDED), mt);
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_verify_conceptually_related(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(support, $list42);
            return NIL;
        }
        if (NIL == cycl_utilities.negatedP(literal)) {
            return removal_modules_conceptually_related.conceptually_relatedP(literal_arg1(literal, UNPROVIDED), literal_arg2(literal, UNPROVIDED), mt, UNPROVIDED);
        }
        literal = literal_atomic_sentence(literal);
        return removal_modules_conceptually_related.not_conceptually_relatedP(literal_arg1(literal, UNPROVIDED), literal_arg2(literal, UNPROVIDED), mt);
    }

    public static final SubLObject hl_justify_conceptually_related_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL == negatedP(literal)) {
                    return removal_modules_conceptually_related.why_conceptually_relatedP(literal_arg1(literal, UNPROVIDED), literal_arg2(literal, UNPROVIDED), mt);
                }
                literal = literal_atomic_sentence(literal);
                return removal_modules_conceptually_related.why_not_conceptually_relatedP(literal_arg1(literal, UNPROVIDED), literal_arg2(literal, UNPROVIDED), mt);
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_justify_conceptually_related(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(support, $list42);
            return NIL;
        }
        if (NIL == cycl_utilities.negatedP(literal)) {
            return removal_modules_conceptually_related.why_conceptually_relatedP(literal_arg1(literal, UNPROVIDED), literal_arg2(literal, UNPROVIDED), mt);
        }
        literal = literal_atomic_sentence(literal);
        return removal_modules_conceptually_related.why_not_conceptually_relatedP(literal_arg1(literal, UNPROVIDED), literal_arg2(literal, UNPROVIDED), mt);
    }

    public static final SubLObject hl_forward_mt_combos_conceptually_related_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject mts = NIL;
                    SubLObject ans = NIL;
                    if (NIL == negatedP(literal)) {
                        {
                            SubLObject source = literal_arg1(literal, UNPROVIDED);
                            SubLObject target = literal_arg2(literal, UNPROVIDED);
                            mts = removal_modules_conceptually_related.max_floor_mts_of_conceptually_related_paths(source, target);
                        }
                    } else {
                        mts = list(mt);
                    }
                    {
                        SubLObject cdolist_list_var = mts;
                        SubLObject mt_54 = NIL;
                        for (mt_54 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt_54 = cdolist_list_var.first()) {
                            ans = cons(arguments.make_hl_support(hl_module, literal, mt_54, tv), ans);
                        }
                    }
                    return nreverse(ans);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_forward_mt_combos_conceptually_related(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject mts = NIL;
            SubLObject ans = NIL;
            if (NIL == cycl_utilities.negatedP(literal)) {
                final SubLObject source = literal_arg1(literal, UNPROVIDED);
                final SubLObject target = literal_arg2(literal, UNPROVIDED);
                mts = removal_modules_conceptually_related.max_floor_mts_of_conceptually_related_paths(source, target);
            } else {
                mts = list(mt);
            }
            SubLObject cdolist_list_var = mts;
            SubLObject mt_$71 = NIL;
            mt_$71 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                ans = cons(arguments.make_hl_support(hl_module, literal, mt_$71, tv), ans);
                cdolist_list_var = cdolist_list_var.rest();
                mt_$71 = cdolist_list_var.first();
            } 
            return nreverse(ans);
        }
        cdestructuring_bind_error(support, $list42);
        return NIL;
    }

    public static final SubLObject hl_verify_admit_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject predicate = literal_arg0(literal, UNPROVIDED);
                    SubLObject pcase_var = predicate;
                    if (pcase_var.eql($$admittedArgument)) {
                        return com.cyc.cycjava.cycl.hl_supports.hl_verify_admitted_argument(support);
                    } else {
                        if (pcase_var.eql($$admittedSentence)) {
                            return com.cyc.cycjava.cycl.hl_supports.hl_verify_admitted_sentence(support);
                        } else {
                            if (pcase_var.eql($$admittedNAT)) {
                                return com.cyc.cycjava.cycl.hl_supports.hl_verify_admitted_nat(support);
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_verify_admit(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject pcase_var;
            final SubLObject predicate = pcase_var = literal_arg0(literal, UNPROVIDED);
            if (pcase_var.eql($$admittedArgument)) {
                return hl_verify_admitted_argument(support);
            }
            if (pcase_var.eql($$admittedSentence)) {
                return hl_verify_admitted_sentence(support);
            }
            if (pcase_var.eql($$admittedNAT)) {
                return hl_verify_admitted_nat(support);
            }
        } else {
            cdestructuring_bind_error(support, $list42);
        }
        return NIL;
    }

    public static final SubLObject hl_forward_mt_combos_admit_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject predicate = literal_arg0(literal, UNPROVIDED);
                    SubLObject pcase_var = predicate;
                    if (pcase_var.eql($$admittedArgument)) {
                        return com.cyc.cycjava.cycl.hl_supports.hl_forward_mt_combos_admitted_argument(support);
                    } else {
                        if (pcase_var.eql($$admittedSentence)) {
                            return com.cyc.cycjava.cycl.hl_supports.hl_forward_mt_combos_admitted_sentence(support);
                        } else {
                            if (pcase_var.eql($$admittedNAT)) {
                                return com.cyc.cycjava.cycl.hl_supports.hl_forward_mt_combos_admitted_nat(support);
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_forward_mt_combos_admit(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject pcase_var;
            final SubLObject predicate = pcase_var = literal_arg0(literal, UNPROVIDED);
            if (pcase_var.eql($$admittedArgument)) {
                return hl_forward_mt_combos_admitted_argument(support);
            }
            if (pcase_var.eql($$admittedSentence)) {
                return hl_forward_mt_combos_admitted_sentence(support);
            }
            if (pcase_var.eql($$admittedNAT)) {
                return hl_forward_mt_combos_admitted_nat(support);
            }
        } else {
            cdestructuring_bind_error(support, $list42);
        }
        return NIL;
    }

    public static final SubLObject hl_justify_admit_alt(SubLObject support) {
        return NIL;
    }

    public static SubLObject hl_justify_admit(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject pcase_var;
            final SubLObject predicate = pcase_var = literal_arg0(literal, UNPROVIDED);
            if (pcase_var.eql($$admittedArgument)) {
                return hl_justify_admitted_argument(support);
            }
            if (pcase_var.eql($$admittedSentence)) {
                return hl_justify_admitted_sentence(support);
            }
            if (pcase_var.eql($$admittedNAT)) {
                return hl_justify_admitted_nat(support);
            }
        } else {
            cdestructuring_bind_error(support, $list42);
        }
        return NIL;
    }

    public static final SubLObject hl_verify_admitted_argument_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject datum_55 = literal_args(literal, UNPROVIDED);
                    SubLObject current_56 = datum_55;
                    SubLObject v_term = NIL;
                    SubLObject argnum = NIL;
                    SubLObject relation = NIL;
                    destructuring_bind_must_consp(current_56, datum_55, $list_alt113);
                    v_term = current_56.first();
                    current_56 = current_56.rest();
                    destructuring_bind_must_consp(current_56, datum_55, $list_alt113);
                    argnum = current_56.first();
                    current_56 = current_56.rest();
                    destructuring_bind_must_consp(current_56, datum_55, $list_alt113);
                    relation = current_56.first();
                    current_56 = current_56.rest();
                    if (NIL == current_56) {
                        if (NIL != negatedP(literal)) {
                            return makeBoolean(NIL == at_admitted.admitted_argumentP(v_term, argnum, relation, mt));
                        } else {
                            return at_admitted.admitted_argumentP(v_term, argnum, relation, mt);
                        }
                    } else {
                        cdestructuring_bind_error(datum_55, $list_alt113);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_verify_admitted_argument(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject current_$73;
            final SubLObject datum_$72 = current_$73 = literal_args(literal, UNPROVIDED);
            SubLObject v_term = NIL;
            SubLObject argnum = NIL;
            SubLObject relation = NIL;
            destructuring_bind_must_consp(current_$73, datum_$72, $list133);
            v_term = current_$73.first();
            current_$73 = current_$73.rest();
            destructuring_bind_must_consp(current_$73, datum_$72, $list133);
            argnum = current_$73.first();
            current_$73 = current_$73.rest();
            destructuring_bind_must_consp(current_$73, datum_$72, $list133);
            relation = current_$73.first();
            current_$73 = current_$73.rest();
            if (NIL == current_$73) {
                if (NIL != cycl_utilities.negatedP(literal)) {
                    return makeBoolean(NIL == at_admitted.admitted_argumentP(v_term, argnum, relation, mt));
                }
                return at_admitted.admitted_argumentP(v_term, argnum, relation, mt);
            } else {
                cdestructuring_bind_error(datum_$72, $list133);
            }
        } else {
            cdestructuring_bind_error(support, $list42);
        }
        return NIL;
    }

    public static final SubLObject hl_verify_admitted_sentence_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject sentence = literal_arg1(literal, UNPROVIDED);
                    if (NIL != negatedP(literal)) {
                        return makeBoolean(NIL == at_admitted.admitted_sentenceP(sentence, mt));
                    } else {
                        return at_admitted.admitted_sentenceP(sentence, mt);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_verify_admitted_sentence(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(support, $list42);
            return NIL;
        }
        final SubLObject sentence = literal_arg1(literal, UNPROVIDED);
        if (NIL != cycl_utilities.negatedP(literal)) {
            return makeBoolean(NIL == at_admitted.admitted_sentenceP(sentence, mt));
        }
        return at_admitted.admitted_sentenceP(sentence, mt);
    }

    public static final SubLObject hl_verify_admitted_nat_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject nat = literal_arg1(literal, UNPROVIDED);
                    if (NIL != negatedP(literal)) {
                        return makeBoolean(NIL == wff.el_wft_fastP(nat, mt));
                    } else {
                        return wff.el_wft_fastP(nat, mt);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_verify_admitted_nat(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(support, $list42);
            return NIL;
        }
        final SubLObject nat = literal_arg1(literal, UNPROVIDED);
        if (NIL != cycl_utilities.negatedP(literal)) {
            return makeBoolean(NIL == wff.el_wft_fastP(nat, mt));
        }
        return wff.el_wft_fastP(nat, mt);
    }

    public static final SubLObject hl_forward_mt_combos_admitted_argument_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject mts = NIL;
                    SubLObject ans = NIL;
                    if (NIL == negatedP(literal)) {
                        {
                            SubLObject datum_57 = literal_args(literal, UNPROVIDED);
                            SubLObject current_58 = datum_57;
                            SubLObject v_term = NIL;
                            SubLObject argnum = NIL;
                            SubLObject relation = NIL;
                            destructuring_bind_must_consp(current_58, datum_57, $list_alt113);
                            v_term = current_58.first();
                            current_58 = current_58.rest();
                            destructuring_bind_must_consp(current_58, datum_57, $list_alt113);
                            argnum = current_58.first();
                            current_58 = current_58.rest();
                            destructuring_bind_must_consp(current_58, datum_57, $list_alt113);
                            relation = current_58.first();
                            current_58 = current_58.rest();
                            if (NIL == current_58) {
                                mts = at_utilities.max_floor_mts_of_admitted_arg(v_term, argnum, relation, UNPROVIDED);
                            } else {
                                cdestructuring_bind_error(datum_57, $list_alt113);
                            }
                        }
                    } else {
                        mts = list(mt);
                    }
                    {
                        SubLObject cdolist_list_var = mts;
                        SubLObject mt_59 = NIL;
                        for (mt_59 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt_59 = cdolist_list_var.first()) {
                            ans = cons(arguments.make_hl_support(hl_module, literal, mt_59, tv), ans);
                        }
                    }
                    return nreverse(ans);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_forward_mt_combos_admitted_argument(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject mts = NIL;
            SubLObject ans = NIL;
            if (NIL == cycl_utilities.negatedP(literal)) {
                SubLObject current_$75;
                final SubLObject datum_$74 = current_$75 = literal_args(literal, UNPROVIDED);
                SubLObject v_term = NIL;
                SubLObject argnum = NIL;
                SubLObject relation = NIL;
                destructuring_bind_must_consp(current_$75, datum_$74, $list133);
                v_term = current_$75.first();
                current_$75 = current_$75.rest();
                destructuring_bind_must_consp(current_$75, datum_$74, $list133);
                argnum = current_$75.first();
                current_$75 = current_$75.rest();
                destructuring_bind_must_consp(current_$75, datum_$74, $list133);
                relation = current_$75.first();
                current_$75 = current_$75.rest();
                if (NIL == current_$75) {
                    mts = at_utilities.max_floor_mts_of_admitted_arg(v_term, argnum, relation, UNPROVIDED);
                } else {
                    cdestructuring_bind_error(datum_$74, $list133);
                }
            } else {
                mts = list(mt);
            }
            SubLObject cdolist_list_var = mts;
            SubLObject mt_$76 = NIL;
            mt_$76 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                ans = cons(arguments.make_hl_support(hl_module, literal, mt_$76, tv), ans);
                cdolist_list_var = cdolist_list_var.rest();
                mt_$76 = cdolist_list_var.first();
            } 
            return nreverse(ans);
        }
        cdestructuring_bind_error(support, $list42);
        return NIL;
    }

    public static final SubLObject hl_forward_mt_combos_admitted_sentence_alt(SubLObject support) {
        return list(support);
    }

    public static SubLObject hl_forward_mt_combos_admitted_sentence(final SubLObject support) {
        return list(support);
    }

    public static final SubLObject hl_forward_mt_combos_admitted_nat_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject mts = NIL;
                    SubLObject ans = NIL;
                    if (NIL == negatedP(literal)) {
                        {
                            SubLObject nat = literal_arg1(literal, UNPROVIDED);
                            mts = at_utilities.max_floor_mts_of_nat(nat, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    } else {
                        mts = list(mt);
                    }
                    {
                        SubLObject cdolist_list_var = mts;
                        SubLObject mt_60 = NIL;
                        for (mt_60 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt_60 = cdolist_list_var.first()) {
                            ans = cons(arguments.make_hl_support(hl_module, literal, mt_60, tv), ans);
                        }
                    }
                    return nreverse(ans);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_forward_mt_combos_admitted_nat(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject mts = NIL;
            SubLObject ans = NIL;
            if (NIL == cycl_utilities.negatedP(literal)) {
                final SubLObject nat = literal_arg1(literal, UNPROVIDED);
                mts = at_utilities.max_floor_mts_of_nat(nat, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else {
                mts = list(mt);
            }
            SubLObject cdolist_list_var = mts;
            SubLObject mt_$77 = NIL;
            mt_$77 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                ans = cons(arguments.make_hl_support(hl_module, literal, mt_$77, tv), ans);
                cdolist_list_var = cdolist_list_var.rest();
                mt_$77 = cdolist_list_var.first();
            } 
            return nreverse(ans);
        }
        cdestructuring_bind_error(support, $list42);
        return NIL;
    }

    public static SubLObject hl_justify_admitted_argument(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != cycl_utilities.negatedP(literal)) {
                SubLObject current_$79;
                final SubLObject datum_$78 = current_$79 = literal_args(literal, UNPROVIDED);
                SubLObject v_term = NIL;
                SubLObject argnum = NIL;
                SubLObject relation = NIL;
                destructuring_bind_must_consp(current_$79, datum_$78, $list133);
                v_term = current_$79.first();
                current_$79 = current_$79.rest();
                destructuring_bind_must_consp(current_$79, datum_$78, $list133);
                argnum = current_$79.first();
                current_$79 = current_$79.rest();
                destructuring_bind_must_consp(current_$79, datum_$78, $list133);
                relation = current_$79.first();
                current_$79 = current_$79.rest();
                if (NIL == current_$79) {
                    return wff.why_not_wff_violations_to_supports(at_admitted.why_not_admitted_argument(v_term, argnum, relation, mt));
                }
                cdestructuring_bind_error(datum_$78, $list133);
            }
        } else {
            cdestructuring_bind_error(support, $list42);
        }
        return NIL;
    }

    public static SubLObject hl_justify_admitted_sentence(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != cycl_utilities.negatedP(literal)) {
                final SubLObject sentence = literal_arg1(literal, UNPROVIDED);
                SubLObject why_not_wff_violations = NIL;
                final SubLObject _prev_bind_0 = wff_vars.$within_wffP$.currentBinding(thread);
                final SubLObject _prev_bind_2 = wff_vars.$wff_mode$.currentBinding(thread);
                try {
                    wff_vars.$within_wffP$.bind(T, thread);
                    wff_vars.$wff_mode$.bind($STRICT, thread);
                    why_not_wff_violations = at_admitted.why_not_admitted_sentence_wrt_asent_arg_constraints(sentence, mt);
                } finally {
                    wff_vars.$wff_mode$.rebind(_prev_bind_2, thread);
                    wff_vars.$within_wffP$.rebind(_prev_bind_0, thread);
                }
                return wff.why_not_wff_violations_to_supports(why_not_wff_violations);
            }
        } else {
            cdestructuring_bind_error(support, $list42);
        }
        return NIL;
    }

    public static SubLObject hl_justify_admitted_nat(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != cycl_utilities.negatedP(literal)) {
                final SubLObject nat = literal_arg1(literal, UNPROVIDED);
                return wff.why_not_wff_violations_to_supports(wff.why_not_wft(nat, mt, UNPROVIDED));
            }
        } else {
            cdestructuring_bind_error(support, $list42);
        }
        return NIL;
    }

    public static final SubLObject hl_verify_sksi_alt(SubLObject support) {
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.hl_supports.hl_justify_sksi(support));
    }

    public static SubLObject hl_verify_sksi(final SubLObject support) {
        return list_utilities.sublisp_boolean(hl_justify_sksi(support));
    }

    public static final SubLObject hl_justify_sksi_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                return sksi_hl_support_utilities.sksi_justify_int(literal, mt);
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_justify_sksi(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            return sksi_hl_support_utilities.sksi_justify_int(literal, mt);
        }
        cdestructuring_bind_error(support, $list42);
        return NIL;
    }

    public static final SubLObject hl_forward_mt_combos_sksi_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(mt);
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_forward_mt_combos_sksi(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(mt);
        }
        cdestructuring_bind_error(support, $list42);
        return NIL;
    }

    public static final SubLObject hl_verify_csql_alt(SubLObject support) {
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.hl_supports.hl_justify_csql(support));
    }

    public static SubLObject hl_verify_csql(final SubLObject support) {
        return list_utilities.sublisp_boolean(hl_justify_csql(support));
    }

    public static final SubLObject hl_justify_csql_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                return sksi_hl_support_utilities.csql_justify_int(literal, mt);
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_justify_csql(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            return sksi_hl_support_utilities.csql_justify_int(literal, mt);
        }
        cdestructuring_bind_error(support, $list42);
        return NIL;
    }

    public static final SubLObject hl_forward_mt_combos_csql_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(mt);
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_forward_mt_combos_csql(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(mt);
        }
        cdestructuring_bind_error(support, $list42);
        return NIL;
    }

    public static final SubLObject hl_verify_source_schema_object_fn_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                return sksi_hl_support_utilities.source_schema_object_fn_hl_support_verify(literal, mt);
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_verify_source_schema_object_fn(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            return sksi_hl_support_utilities.source_schema_object_fn_hl_support_verify(literal, mt);
        }
        cdestructuring_bind_error(support, $list42);
        return NIL;
    }

    public static final SubLObject hl_justify_source_schema_object_fn_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                return sksi_hl_support_utilities.source_schema_object_fn_hl_support_justify(literal, mt);
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_justify_source_schema_object_fn(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            return sksi_hl_support_utilities.source_schema_object_fn_hl_support_justify(literal, mt);
        }
        cdestructuring_bind_error(support, $list42);
        return NIL;
    }

    public static final SubLObject hl_forward_mt_combos_source_schema_object_fn_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(mt);
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_forward_mt_combos_source_schema_object_fn(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(mt);
        }
        cdestructuring_bind_error(support, $list42);
        return NIL;
    }

    public static final SubLObject hl_justify_reformulate_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != sksi_hl_support_utilities.sksi_reformulate_justify_applicableP(literal, mt)) {
                    return sksi_hl_support_utilities.sksi_reformulate_justify_int(literal, mt);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_justify_reformulate(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != sksi_hl_support_utilities.sksi_reformulate_justify_applicableP(literal, mt)) {
                return sksi_hl_support_utilities.sksi_reformulate_justify_int(literal, mt);
            }
        } else {
            cdestructuring_bind_error(support, $list42);
        }
        return NIL;
    }

    public static final SubLObject hl_justify_assertion_alt(SubLObject support) {
        if (NIL != assertion_handles.assertion_p(support)) {
            return list(support);
        }
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject el_sentence = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt123);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt123);
            el_sentence = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt123);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt123);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject assertion = fi.sentence_assertion(el_sentence, mt);
                    if (((NIL != assertion_handles.assertion_p(assertion)) && (NIL != assertion_has_truth(assertion, enumeration_types.tv_truth(tv)))) && (NIL != enumeration_types.el_strength_implies(assertion_strength(assertion), enumeration_types.tv_strength(tv)))) {
                        return list(assertion);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt123);
            }
        }
        return NIL;
    }

    public static SubLObject hl_justify_assertion(final SubLObject support) {
        if (NIL != assertion_handles.assertion_p(support)) {
            return list(support);
        }
        SubLObject hl_module = NIL;
        SubLObject el_sentence = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list144);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list144);
        el_sentence = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list144);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list144);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject assertion = fi.sentence_assertion(el_sentence, mt);
            if (((NIL != assertion_handles.assertion_p(assertion)) && (NIL != assertions_high.assertion_has_truth(assertion, enumeration_types.tv_truth(tv)))) && (NIL != enumeration_types.el_strength_implies(assertions_high.assertion_strength(assertion), enumeration_types.tv_strength(tv)))) {
                return list(assertion);
            }
        } else {
            cdestructuring_bind_error(support, $list144);
        }
        return NIL;
    }

    public static final SubLObject hl_verify_assertion_alt(SubLObject support) {
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.hl_supports.hl_justify_assertion(support));
    }

    public static SubLObject hl_verify_assertion(final SubLObject support) {
        return list_utilities.sublisp_boolean(hl_justify_assertion(support));
    }

    public static final SubLObject hl_forward_mt_combos_assertion_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject el_sentence = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt123);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt123);
            el_sentence = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt123);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt123);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject pcase_var = mt;
                    if (pcase_var.eql($$InferencePSC)) {
                        {
                            SubLObject assertions = fi.sentence_assertions_in_any_mt(el_sentence);
                            SubLObject mts = NIL;
                            SubLObject cdolist_list_var = assertions;
                            SubLObject assertion = NIL;
                            for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                                {
                                    SubLObject item_var = assertion_mt(assertion);
                                    if (NIL == member(item_var, mts, symbol_function(EQL), symbol_function(IDENTITY))) {
                                        mts = cons(item_var, mts);
                                    }
                                }
                            }
                            return mts;
                        }
                    } else {
                        return list(mt);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt123);
            }
        }
        return NIL;
    }

    public static SubLObject hl_forward_mt_combos_assertion(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject el_sentence = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list144);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list144);
        el_sentence = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list144);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list144);
        tv = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(support, $list144);
            return NIL;
        }
        final SubLObject pcase_var = mt;
        if (pcase_var.eql($$InferencePSC)) {
            final SubLObject assertions = fi.sentence_assertions_in_any_mt(el_sentence);
            SubLObject mts = NIL;
            SubLObject cdolist_list_var = assertions;
            SubLObject assertion = NIL;
            assertion = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject item_var = assertions_high.assertion_mt(assertion);
                if (NIL == member(item_var, mts, symbol_function(EQL), symbol_function(IDENTITY))) {
                    mts = cons(item_var, mts);
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            } 
            return mts;
        }
        return list(mt);
    }

    public static SubLObject hl_justify_gaf(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hl_module = NIL;
        SubLObject el_sentence = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list144);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list144);
        el_sentence = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list144);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list144);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            if ((hl_module == $GAF) && ($TRUE == enumeration_types.tv_truth(tv))) {
                final SubLObject gaf_formula = cycl_utilities.formula_arg1(el_sentence, UNPROVIDED);
                SubLObject gaf = NIL;
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    gaf = kb_indexing.find_gaf_in_relevant_mt(gaf_formula);
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
                if (NIL != gaf) {
                    final SubLObject operator = cycl_utilities.formula_operator(el_sentence);
                    SubLObject code_rule_support = NIL;
                    final SubLObject pcase_var = operator;
                    if (pcase_var.eql($$gafPredicate)) {
                        code_rule_support = removal_modules_gaf_components.make_gaf_predicate_code_rule_support();
                    } else
                        if (pcase_var.eql($$gafArgument)) {
                            code_rule_support = removal_modules_gaf_components.make_gaf_argument_code_rule_support();
                        } else {
                            Errors.error($str148$Unexpected_predicate___S, operator);
                        }

                    return list(code_rule_support, gaf);
                }
            }
        } else {
            cdestructuring_bind_error(support, $list144);
        }
        return NIL;
    }

    public static SubLObject hl_verify_gaf(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hl_module = NIL;
        SubLObject el_sentence = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list144);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list144);
        el_sentence = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list144);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list144);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            if ((hl_module == $GAF) && ($TRUE == enumeration_types.tv_truth(tv))) {
                final SubLObject gaf_formula = cycl_utilities.formula_arg1(el_sentence, UNPROVIDED);
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    if (NIL != kb_indexing.find_gaf_in_relevant_mt(gaf_formula)) {
                        final SubLObject pcase_var;
                        final SubLObject operator = pcase_var = cycl_utilities.formula_operator(el_sentence);
                        if (pcase_var.eql($$gafPredicate)) {
                            final SubLObject predicate = cycl_utilities.formula_arg2(el_sentence, UNPROVIDED);
                            return removal_modules_formula_arg_n.formula_has_operatorP(gaf_formula, predicate);
                        }
                        if (pcase_var.eql($$gafArgument)) {
                            final SubLObject argnum = cycl_utilities.formula_arg2(el_sentence, UNPROVIDED);
                            final SubLObject v_term = cycl_utilities.formula_arg3(el_sentence, UNPROVIDED);
                            return equal(v_term, cycl_utilities.formula_arg(el_sentence, argnum, UNPROVIDED));
                        }
                        return NIL;
                    }
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
            }
        } else {
            cdestructuring_bind_error(support, $list144);
        }
        return NIL;
    }

    public static SubLObject hl_forward_mt_combos_gaf(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject el_sentence = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list144);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list144);
        el_sentence = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list144);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list144);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            if ((hl_module == $GAF) && ($TRUE == enumeration_types.tv_truth(tv))) {
                final SubLObject gaf_formula = cycl_utilities.formula_arg1(el_sentence, UNPROVIDED);
                final SubLObject result_mts = kb_indexing.gaf_mts(gaf_formula);
                SubLObject result_supports = NIL;
                SubLObject cdolist_list_var = result_mts;
                SubLObject result_mt = NIL;
                result_mt = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    result_supports = cons(arguments.make_hl_support(hl_module, el_sentence, result_mt, tv), result_supports);
                    cdolist_list_var = cdolist_list_var.rest();
                    result_mt = cdolist_list_var.first();
                } 
                return nreverse(result_supports);
            }
        } else {
            cdestructuring_bind_error(support, $list144);
        }
        return NIL;
    }

    public static SubLObject hl_justify_mentions(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject sentence = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list151);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list151);
        sentence = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list151);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list151);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != cycl_utilities.atomic_sentence_with_pred_p(sentence, $$assertionExists)) {
                final SubLObject assertion = cycl_utilities.atomic_sentence_arg1(sentence, UNPROVIDED);
                if (NIL != assertion_handles.valid_assertionP(assertion, UNPROVIDED)) {
                    return list(assertion);
                }
            }
        } else {
            cdestructuring_bind_error(support, $list151);
        }
        return NIL;
    }

    public static SubLObject hl_verify_mentions(final SubLObject support) {
        return list_utilities.sublisp_boolean(hl_justify_mentions(support));
    }

    public static SubLObject hl_forward_mt_combos_mentions(final SubLObject support) {
        return list($$BaseKB);
    }

    public static final SubLObject possibly_with_negated_truth_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt132);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject literal_var = NIL;
                    SubLObject tv_var = NIL;
                    SubLObject literal = NIL;
                    SubLObject tv = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt132);
                    literal_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt132);
                    tv_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt132);
                    literal = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt132);
                    tv = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(PCOND, list(list(EL_NEGATION_P, literal), listS(CLET, list(list(literal_var, listS(FORMULA_ARG1, literal, $list_alt137)), list(tv_var, list(INVERSE_TV, tv))), append(body, NIL))), list(list(EL_FORMULA_P, literal), listS(CLET, list(list(literal_var, literal), list(tv_var, tv)), append(body, NIL))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt132);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject possibly_with_negated_truth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list154);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject literal_var = NIL;
        SubLObject tv_var = NIL;
        SubLObject literal = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(current, datum, $list154);
        literal_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list154);
        tv_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list154);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list154);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(PCOND, list(list(EL_NEGATION_P, literal), listS(CLET, list(list(literal_var, listS(FORMULA_ARG1, literal, $list159)), list(tv_var, list(INVERSE_TV, tv))), append(body, NIL))), list(list(EL_FORMULA_P, literal), listS(CLET, list(list(literal_var, literal), list(tv_var, tv)), append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list154);
        return NIL;
    }

    public static final SubLObject hl_justify_sbhl_alt(SubLObject support) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject datum = support;
                SubLObject current = datum;
                SubLObject hl_module = NIL;
                SubLObject literal = NIL;
                SubLObject mt = NIL;
                SubLObject tv = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt23);
                hl_module = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt23);
                literal = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt23);
                mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt23);
                tv = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != el_negation_p(literal)) {
                        {
                            SubLObject new_literal = formula_arg1(literal, $REGULARIZE);
                            SubLObject new_tv = enumeration_types.inverse_tv(tv);
                            SubLObject datum_61 = new_literal;
                            SubLObject current_62 = datum_61;
                            SubLObject predicate = NIL;
                            SubLObject arg1 = NIL;
                            SubLObject arg2 = NIL;
                            destructuring_bind_must_consp(current_62, datum_61, $list_alt81);
                            predicate = current_62.first();
                            current_62 = current_62.rest();
                            destructuring_bind_must_consp(current_62, datum_61, $list_alt81);
                            arg1 = current_62.first();
                            current_62 = current_62.rest();
                            destructuring_bind_must_consp(current_62, datum_61, $list_alt81);
                            arg2 = current_62.first();
                            current_62 = current_62.rest();
                            if (NIL == current_62) {
                                {
                                    SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                                    {
                                        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                        try {
                                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                            result = sbhl_search_methods.why_sbhl_relationP(sbhl_module_vars.get_sbhl_module(predicate), arg1, arg2, NIL, sbhl_link_vars.support_tv_to_sbhl_tv(new_tv), $ASSERTION);
                                        } finally {
                                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum_61, $list_alt81);
                            }
                        }
                    } else {
                        if (NIL != el_formula_p(literal)) {
                            {
                                SubLObject new_literal = literal;
                                SubLObject new_tv = tv;
                                SubLObject datum_63 = new_literal;
                                SubLObject current_64 = datum_63;
                                SubLObject predicate = NIL;
                                SubLObject arg1 = NIL;
                                SubLObject arg2 = NIL;
                                destructuring_bind_must_consp(current_64, datum_63, $list_alt81);
                                predicate = current_64.first();
                                current_64 = current_64.rest();
                                destructuring_bind_must_consp(current_64, datum_63, $list_alt81);
                                arg1 = current_64.first();
                                current_64 = current_64.rest();
                                destructuring_bind_must_consp(current_64, datum_63, $list_alt81);
                                arg2 = current_64.first();
                                current_64 = current_64.rest();
                                if (NIL == current_64) {
                                    {
                                        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                                        {
                                            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                            try {
                                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                                result = sbhl_search_methods.why_sbhl_relationP(sbhl_module_vars.get_sbhl_module(predicate), arg1, arg2, NIL, sbhl_link_vars.support_tv_to_sbhl_tv(new_tv), $ASSERTION);
                                            } finally {
                                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum_63, $list_alt81);
                                }
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt23);
                }
                return result;
            }
        }
    }

    public static SubLObject hl_justify_sbhl(final SubLObject support) {
        SubLObject result = NIL;
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != el_negation_p(literal)) {
                final SubLObject new_literal = cycl_utilities.formula_arg1(literal, $REGULARIZE);
                final SubLObject new_tv = enumeration_types.inverse_tv(tv);
                SubLObject current_$81;
                final SubLObject datum_$80 = current_$81 = new_literal;
                SubLObject predicate = NIL;
                SubLObject arg1 = NIL;
                SubLObject arg2 = NIL;
                destructuring_bind_must_consp(current_$81, datum_$80, $list101);
                predicate = current_$81.first();
                current_$81 = current_$81.rest();
                destructuring_bind_must_consp(current_$81, datum_$80, $list101);
                arg1 = current_$81.first();
                current_$81 = current_$81.rest();
                destructuring_bind_must_consp(current_$81, datum_$80, $list101);
                arg2 = current_$81.first();
                current_$81 = current_$81.rest();
                if (NIL == current_$81) {
                    result = hl_justify_sbhl_optimal(hl_module, predicate, arg1, arg2, mt, new_tv);
                } else {
                    cdestructuring_bind_error(datum_$80, $list101);
                }
            } else
                if (NIL != el_formula_p(literal)) {
                    final SubLObject new_literal = literal;
                    final SubLObject new_tv = tv;
                    SubLObject current_$82;
                    final SubLObject datum_$81 = current_$82 = new_literal;
                    SubLObject predicate = NIL;
                    SubLObject arg1 = NIL;
                    SubLObject arg2 = NIL;
                    destructuring_bind_must_consp(current_$82, datum_$81, $list101);
                    predicate = current_$82.first();
                    current_$82 = current_$82.rest();
                    destructuring_bind_must_consp(current_$82, datum_$81, $list101);
                    arg1 = current_$82.first();
                    current_$82 = current_$82.rest();
                    destructuring_bind_must_consp(current_$82, datum_$81, $list101);
                    arg2 = current_$82.first();
                    current_$82 = current_$82.rest();
                    if (NIL == current_$82) {
                        result = hl_justify_sbhl_optimal(hl_module, predicate, arg1, arg2, mt, new_tv);
                    } else {
                        cdestructuring_bind_error(datum_$81, $list101);
                    }
                }

        } else {
            cdestructuring_bind_error(support, $list42);
        }
        return result;
    }

    public static SubLObject hl_justify_sbhl_optimal(final SubLObject hl_module, final SubLObject predicate, final SubLObject arg1, final SubLObject arg2, final SubLObject mt, final SubLObject tv) {
        SubLObject result = NIL;
        if ((NIL != list_utilities.member_eqP(hl_module, $list163)) && ($TRUE == enumeration_types.tv_truth(tv))) {
            if (((NIL == mt_vars.core_microtheory_p(mt)) && ($TRUE_DEF == tv)) && (NIL == result)) {
                result = hl_justify_sbhl_optimal_int(predicate, arg1, arg2, $$BaseKB, $TRUE_MON);
            }
            if (($TRUE_DEF == tv) && (NIL == result)) {
                result = hl_justify_sbhl_optimal_int(predicate, arg1, arg2, mt, $TRUE_MON);
            }
            if ((NIL == mt_vars.core_microtheory_p(mt)) && (NIL == result)) {
                result = hl_justify_sbhl_optimal_int(predicate, arg1, arg2, $$BaseKB, tv);
            }
        }
        if (NIL == result) {
            result = hl_justify_sbhl_optimal_int(predicate, arg1, arg2, mt, tv);
        }
        return result;
    }

    public static SubLObject hl_justify_sbhl_optimal_int(final SubLObject predicate, final SubLObject arg1, final SubLObject arg2, final SubLObject mt, final SubLObject tv) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = sbhl_search_methods.why_sbhl_relationP(sbhl_module_vars.get_sbhl_module(predicate), arg1, arg2, NIL, sbhl_link_vars.support_tv_to_sbhl_tv(tv), $ASSERTION);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject hl_verify_isa_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != negatedP(literal)) {
                    {
                        SubLObject datum_65 = literal_args(literal_atomic_sentence(literal), UNPROVIDED);
                        SubLObject current_66 = datum_65;
                        SubLObject v_object = NIL;
                        SubLObject collection = NIL;
                        destructuring_bind_must_consp(current_66, datum_65, $list_alt45);
                        v_object = current_66.first();
                        current_66 = current_66.rest();
                        destructuring_bind_must_consp(current_66, datum_65, $list_alt45);
                        collection = current_66.first();
                        current_66 = current_66.rest();
                        if (NIL == current_66) {
                            return makeBoolean(((((NIL == inference_worker.currently_active_problem_store()) || (NIL != inference_datastructures_problem_store.problem_store_completeness_minimization_allowedP(inference_worker.currently_active_problem_store()))) && (NIL != kb_accessors.completely_enumerable_collectionP(collection, mt))) && (NIL == at_defns.quiet_has_typeP(v_object, collection, mt))) || (NIL != isa.not_isaP(v_object, collection, mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv))));
                        } else {
                            cdestructuring_bind_error(datum_65, $list_alt45);
                        }
                    }
                } else {
                    {
                        SubLObject pcase_var = literal_predicate(literal, UNPROVIDED);
                        if (pcase_var.eql($$nearestIsa)) {
                            return removal_modules_nearest_isa.hl_verify_nearest_isa(support);
                        } else {
                            if (pcase_var.eql($$nearestIsaOfType)) {
                                return removal_modules_nearest_isa.hl_verify_nearest_isa_of_type(support);
                            } else {
                                {
                                    SubLObject datum_67 = literal_args(literal, UNPROVIDED);
                                    SubLObject current_68 = datum_67;
                                    SubLObject v_object = NIL;
                                    SubLObject collection = NIL;
                                    destructuring_bind_must_consp(current_68, datum_67, $list_alt45);
                                    v_object = current_68.first();
                                    current_68 = current_68.rest();
                                    destructuring_bind_must_consp(current_68, datum_67, $list_alt45);
                                    collection = current_68.first();
                                    current_68 = current_68.rest();
                                    if (NIL == current_68) {
                                        return isa.isaP(v_object, collection, mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv));
                                    } else {
                                        cdestructuring_bind_error(datum_67, $list_alt45);
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_verify_isa(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != cycl_utilities.negatedP(literal)) {
                SubLObject current_$85;
                final SubLObject datum_$84 = current_$85 = literal_args(literal_atomic_sentence(literal), UNPROVIDED);
                SubLObject v_object = NIL;
                SubLObject collection = NIL;
                destructuring_bind_must_consp(current_$85, datum_$84, $list61);
                v_object = current_$85.first();
                current_$85 = current_$85.rest();
                destructuring_bind_must_consp(current_$85, datum_$84, $list61);
                collection = current_$85.first();
                current_$85 = current_$85.rest();
                if (NIL == current_$85) {
                    return makeBoolean(((((NIL == inference_worker.currently_active_problem_store()) || (NIL != inference_datastructures_problem_store.problem_store_completeness_minimization_allowedP(inference_worker.currently_active_problem_store()))) && (NIL != kb_accessors.completely_enumerable_collectionP(collection, mt))) && (NIL == at_defns.quiet_has_typeP(v_object, collection, mt))) || (NIL != isa.not_isaP(v_object, collection, mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv))));
                }
                cdestructuring_bind_error(datum_$84, $list61);
            } else {
                final SubLObject pcase_var = literal_predicate(literal, UNPROVIDED);
                if (pcase_var.eql($$nearestIsa)) {
                    return removal_modules_nearest_isa.hl_verify_nearest_isa(support);
                }
                if (pcase_var.eql($$nearestIsaOfType)) {
                    return removal_modules_nearest_isa.hl_verify_nearest_isa_of_type(support);
                }
                SubLObject current_$86;
                final SubLObject datum_$85 = current_$86 = literal_args(literal, UNPROVIDED);
                SubLObject v_object2 = NIL;
                SubLObject collection2 = NIL;
                destructuring_bind_must_consp(current_$86, datum_$85, $list61);
                v_object2 = current_$86.first();
                current_$86 = current_$86.rest();
                destructuring_bind_must_consp(current_$86, datum_$85, $list61);
                collection2 = current_$86.first();
                current_$86 = current_$86.rest();
                if (NIL == current_$86) {
                    return isa.isaP(v_object2, collection2, mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv));
                }
                cdestructuring_bind_error(datum_$85, $list61);
            }
        } else {
            cdestructuring_bind_error(support, $list42);
        }
        return NIL;
    }

    public static final SubLObject hl_justify_isa_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject pcase_var = literal_predicate(literal, UNPROVIDED);
                    if (pcase_var.eql($$elementOf)) {
                        {
                            SubLObject v_term = literal_arg1(literal, UNPROVIDED);
                            SubLObject col = literal_arg2(literal, UNPROVIDED);
                            SubLObject isa_asent = make_binary_formula($$isa, v_term, col);
                            SubLObject support_literal = (NIL != negatedP(literal)) ? ((SubLObject) (negate(isa_asent))) : isa_asent;
                            SubLObject new_support = arguments.make_hl_support(hl_module, support_literal, mt, tv);
                            return com.cyc.cycjava.cycl.hl_supports.hl_justify_sbhl(new_support);
                        }
                    } else {
                        if (pcase_var.eql($$nearestIsa)) {
                            return removal_modules_nearest_isa.hl_justify_nearest_isa(support);
                        } else {
                            if (pcase_var.eql($$nearestIsaOfType)) {
                                return removal_modules_nearest_isa.hl_justify_nearest_isa_of_type(support);
                            } else {
                                if (NIL != negatedP(literal)) {
                                    {
                                        SubLObject v_term = literal_arg1(literal, UNPROVIDED);
                                        SubLObject col = literal_arg2(literal, UNPROVIDED);
                                        if (NIL != kb_accessors.completely_enumerable_collectionP(col, mt)) {
                                            return com.cyc.cycjava.cycl.hl_supports.justify_not_type_by_extent_known(v_term, col, mt);
                                        }
                                        return com.cyc.cycjava.cycl.hl_supports.hl_justify_sbhl(support);
                                    }
                                } else {
                                    return com.cyc.cycjava.cycl.hl_supports.hl_justify_sbhl(support);
                                }
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_justify_isa(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(support, $list42);
            return NIL;
        }
        final SubLObject assertion = czer_meta.find_assertion_cycl(literal, mt);
        if (NIL != assertion) {
            return list(assertion);
        }
        final SubLObject pcase_var = literal_predicate(literal, UNPROVIDED);
        if (pcase_var.eql($$elementOf)) {
            final SubLObject v_term = literal_arg1(literal, UNPROVIDED);
            final SubLObject col = literal_arg2(literal, UNPROVIDED);
            final SubLObject isa_asent = make_binary_formula($$isa, v_term, col);
            final SubLObject support_literal = (NIL != cycl_utilities.negatedP(literal)) ? cycl_utilities.negate(isa_asent) : isa_asent;
            final SubLObject new_support = arguments.make_hl_support(hl_module, support_literal, mt, tv);
            return hl_justify_sbhl(new_support);
        }
        if (pcase_var.eql($$nearestIsa)) {
            return removal_modules_nearest_isa.hl_justify_nearest_isa(support);
        }
        if (pcase_var.eql($$nearestIsaOfType)) {
            return removal_modules_nearest_isa.hl_justify_nearest_isa_of_type(support);
        }
        if (NIL == cycl_utilities.negatedP(literal)) {
            return hl_justify_sbhl(support);
        }
        final SubLObject v_term = literal_arg1(literal, UNPROVIDED);
        final SubLObject col = literal_arg2(literal, UNPROVIDED);
        if (NIL != kb_accessors.completely_enumerable_collectionP(col, mt)) {
            return justify_not_type_by_extent_known(v_term, col, mt);
        }
        return hl_justify_sbhl(support);
    }

    public static SubLObject clear_hl_forward_mt_combos_isa() {
        final SubLObject cs = $hl_forward_mt_combos_isa_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_hl_forward_mt_combos_isa(final SubLObject support) {
        return memoization_state.caching_state_remove_function_results_with_args($hl_forward_mt_combos_isa_caching_state$.getGlobalValue(), list(support), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject hl_forward_mt_combos_isa_internal(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject mts = NIL;
            SubLObject ans = NIL;
            if (NIL == cycl_utilities.negatedP(literal)) {
                final SubLObject pcase_var = literal_predicate(literal, UNPROVIDED);
                if (pcase_var.eql($$elementOf)) {
                    SubLObject current_$89;
                    final SubLObject datum_$88 = current_$89 = literal_args(literal, UNPROVIDED);
                    SubLObject arg1 = NIL;
                    SubLObject arg2 = NIL;
                    destructuring_bind_must_consp(current_$89, datum_$88, $list100);
                    arg1 = current_$89.first();
                    current_$89 = current_$89.rest();
                    destructuring_bind_must_consp(current_$89, datum_$88, $list100);
                    arg2 = current_$89.first();
                    current_$89 = current_$89.rest();
                    if (NIL == current_$89) {
                        mts = inference_max_floor_mts_of_isa_paths(arg1, arg2);
                    } else {
                        cdestructuring_bind_error(datum_$88, $list100);
                    }
                } else
                    if (pcase_var.eql($$quotedIsa)) {
                        SubLObject current_$90;
                        final SubLObject datum_$89 = current_$90 = literal_args(literal, UNPROVIDED);
                        SubLObject arg1 = NIL;
                        SubLObject arg2 = NIL;
                        destructuring_bind_must_consp(current_$90, datum_$89, $list100);
                        arg1 = current_$90.first();
                        current_$90 = current_$90.rest();
                        destructuring_bind_must_consp(current_$90, datum_$89, $list100);
                        arg2 = current_$90.first();
                        current_$90 = current_$90.rest();
                        if (NIL == current_$90) {
                            mts = inference_max_floor_mts_of_quoted_isa_paths(arg1, arg2);
                        } else {
                            cdestructuring_bind_error(datum_$89, $list100);
                        }
                    } else
                        if (pcase_var.eql($$nearestIsa)) {
                            SubLObject current_$91;
                            final SubLObject datum_$90 = current_$91 = literal_args(literal, UNPROVIDED);
                            SubLObject arg1 = NIL;
                            SubLObject arg2 = NIL;
                            destructuring_bind_must_consp(current_$91, datum_$90, $list100);
                            arg1 = current_$91.first();
                            current_$91 = current_$91.rest();
                            destructuring_bind_must_consp(current_$91, datum_$90, $list100);
                            arg2 = current_$91.first();
                            current_$91 = current_$91.rest();
                            if (NIL == current_$91) {
                                mts = inference_max_floor_mts_of_isa_paths(arg1, arg2);
                            } else {
                                cdestructuring_bind_error(datum_$90, $list100);
                            }
                        } else
                            if (pcase_var.eql($$nearestIsaOfType)) {
                                SubLObject current_$92;
                                final SubLObject datum_$91 = current_$92 = literal_args(literal, UNPROVIDED);
                                SubLObject arg1 = NIL;
                                SubLObject arg2 = NIL;
                                SubLObject arg3 = NIL;
                                destructuring_bind_must_consp(current_$92, datum_$91, $list169);
                                arg1 = current_$92.first();
                                current_$92 = current_$92.rest();
                                destructuring_bind_must_consp(current_$92, datum_$91, $list169);
                                arg2 = current_$92.first();
                                current_$92 = current_$92.rest();
                                destructuring_bind_must_consp(current_$92, datum_$91, $list169);
                                arg3 = current_$92.first();
                                current_$92 = current_$92.rest();
                                if (NIL == current_$92) {
                                    final SubLObject mts2 = inference_max_floor_mts_of_isa_paths(arg1, arg3);
                                    final SubLObject mts3 = inference_max_floor_mts_of_isa_paths(arg3, arg2);
                                    SubLObject cdolist_list_var = mts2;
                                    SubLObject mt2 = NIL;
                                    mt2 = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        SubLObject cdolist_list_var_$96 = mts3;
                                        SubLObject mt3 = NIL;
                                        mt3 = cdolist_list_var_$96.first();
                                        while (NIL != cdolist_list_var_$96) {
                                            mts = append(mts, inference_trampolines.inference_max_floor_mts_with_cycles_pruned(list(mt2, mt3), UNPROVIDED));
                                            cdolist_list_var_$96 = cdolist_list_var_$96.rest();
                                            mt3 = cdolist_list_var_$96.first();
                                        } 
                                        cdolist_list_var = cdolist_list_var.rest();
                                        mt2 = cdolist_list_var.first();
                                    } 
                                    mts = list_utilities.fast_delete_duplicates(mts, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else {
                                    cdestructuring_bind_error(datum_$91, $list169);
                                }
                            } else {
                                SubLObject current_$93;
                                final SubLObject datum_$92 = current_$93 = literal_args(literal, UNPROVIDED);
                                SubLObject arg1 = NIL;
                                SubLObject arg2 = NIL;
                                destructuring_bind_must_consp(current_$93, datum_$92, $list100);
                                arg1 = current_$93.first();
                                current_$93 = current_$93.rest();
                                destructuring_bind_must_consp(current_$93, datum_$92, $list100);
                                arg2 = current_$93.first();
                                current_$93 = current_$93.rest();
                                if (NIL == current_$93) {
                                    mts = inference_max_floor_mts_of_isa_paths(arg1, arg2);
                                } else {
                                    cdestructuring_bind_error(datum_$92, $list100);
                                }
                            }



            } else {
                mts = list(mt);
            }
            SubLObject cdolist_list_var2 = mts;
            SubLObject mt_$99 = NIL;
            mt_$99 = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                ans = cons(arguments.make_hl_support(hl_module, literal, mt_$99, tv), ans);
                cdolist_list_var2 = cdolist_list_var2.rest();
                mt_$99 = cdolist_list_var2.first();
            } 
            return nreverse(ans);
        }
        cdestructuring_bind_error(support, $list42);
        return NIL;
    }

    public static final SubLObject hl_forward_mt_combos_isa_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject mts = NIL;
                    SubLObject ans = NIL;
                    if (NIL == negatedP(literal)) {
                        {
                            SubLObject pcase_var = literal_predicate(literal, UNPROVIDED);
                            if (pcase_var.eql($$elementOf)) {
                                {
                                    SubLObject datum_69 = literal_args(literal, UNPROVIDED);
                                    SubLObject current_70 = datum_69;
                                    SubLObject arg1 = NIL;
                                    SubLObject arg2 = NIL;
                                    destructuring_bind_must_consp(current_70, datum_69, $list_alt80);
                                    arg1 = current_70.first();
                                    current_70 = current_70.rest();
                                    destructuring_bind_must_consp(current_70, datum_69, $list_alt80);
                                    arg2 = current_70.first();
                                    current_70 = current_70.rest();
                                    if (NIL == current_70) {
                                        mts = com.cyc.cycjava.cycl.hl_supports.inference_max_floor_mts_of_isa_paths(arg1, arg2);
                                    } else {
                                        cdestructuring_bind_error(datum_69, $list_alt80);
                                    }
                                }
                            } else {
                                if (pcase_var.eql($$quotedIsa)) {
                                    {
                                        SubLObject datum_71 = literal_args(literal, UNPROVIDED);
                                        SubLObject current_72 = datum_71;
                                        SubLObject arg1 = NIL;
                                        SubLObject arg2 = NIL;
                                        destructuring_bind_must_consp(current_72, datum_71, $list_alt80);
                                        arg1 = current_72.first();
                                        current_72 = current_72.rest();
                                        destructuring_bind_must_consp(current_72, datum_71, $list_alt80);
                                        arg2 = current_72.first();
                                        current_72 = current_72.rest();
                                        if (NIL == current_72) {
                                            mts = com.cyc.cycjava.cycl.hl_supports.inference_max_floor_mts_of_quoted_isa_paths(arg1, arg2);
                                        } else {
                                            cdestructuring_bind_error(datum_71, $list_alt80);
                                        }
                                    }
                                } else {
                                    if (pcase_var.eql($$nearestIsa)) {
                                        {
                                            SubLObject datum_73 = literal_args(literal, UNPROVIDED);
                                            SubLObject current_74 = datum_73;
                                            SubLObject arg1 = NIL;
                                            SubLObject arg2 = NIL;
                                            destructuring_bind_must_consp(current_74, datum_73, $list_alt80);
                                            arg1 = current_74.first();
                                            current_74 = current_74.rest();
                                            destructuring_bind_must_consp(current_74, datum_73, $list_alt80);
                                            arg2 = current_74.first();
                                            current_74 = current_74.rest();
                                            if (NIL == current_74) {
                                                mts = com.cyc.cycjava.cycl.hl_supports.inference_max_floor_mts_of_isa_paths(arg1, arg2);
                                            } else {
                                                cdestructuring_bind_error(datum_73, $list_alt80);
                                            }
                                        }
                                    } else {
                                        if (pcase_var.eql($$nearestIsaOfType)) {
                                            {
                                                SubLObject datum_75 = literal_args(literal, UNPROVIDED);
                                                SubLObject current_76 = datum_75;
                                                SubLObject arg1 = NIL;
                                                SubLObject arg2 = NIL;
                                                SubLObject arg3 = NIL;
                                                destructuring_bind_must_consp(current_76, datum_75, $list_alt145);
                                                arg1 = current_76.first();
                                                current_76 = current_76.rest();
                                                destructuring_bind_must_consp(current_76, datum_75, $list_alt145);
                                                arg2 = current_76.first();
                                                current_76 = current_76.rest();
                                                destructuring_bind_must_consp(current_76, datum_75, $list_alt145);
                                                arg3 = current_76.first();
                                                current_76 = current_76.rest();
                                                if (NIL == current_76) {
                                                    {
                                                        SubLObject mts1 = com.cyc.cycjava.cycl.hl_supports.inference_max_floor_mts_of_isa_paths(arg1, arg3);
                                                        SubLObject mts2 = com.cyc.cycjava.cycl.hl_supports.inference_max_floor_mts_of_isa_paths(arg3, arg2);
                                                        SubLObject cdolist_list_var = mts1;
                                                        SubLObject mt1 = NIL;
                                                        for (mt1 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt1 = cdolist_list_var.first()) {
                                                            {
                                                                SubLObject cdolist_list_var_77 = mts2;
                                                                SubLObject mt2 = NIL;
                                                                for (mt2 = cdolist_list_var_77.first(); NIL != cdolist_list_var_77; cdolist_list_var_77 = cdolist_list_var_77.rest() , mt2 = cdolist_list_var_77.first()) {
                                                                    mts = append(mts, inference_trampolines.inference_max_floor_mts_with_cycles_pruned(list(mt1, mt2), UNPROVIDED));
                                                                }
                                                            }
                                                        }
                                                        mts = list_utilities.fast_delete_duplicates(mts, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                } else {
                                                    cdestructuring_bind_error(datum_75, $list_alt145);
                                                }
                                            }
                                        } else {
                                            {
                                                SubLObject datum_78 = literal_args(literal, UNPROVIDED);
                                                SubLObject current_79 = datum_78;
                                                SubLObject arg1 = NIL;
                                                SubLObject arg2 = NIL;
                                                destructuring_bind_must_consp(current_79, datum_78, $list_alt80);
                                                arg1 = current_79.first();
                                                current_79 = current_79.rest();
                                                destructuring_bind_must_consp(current_79, datum_78, $list_alt80);
                                                arg2 = current_79.first();
                                                current_79 = current_79.rest();
                                                if (NIL == current_79) {
                                                    mts = com.cyc.cycjava.cycl.hl_supports.inference_max_floor_mts_of_isa_paths(arg1, arg2);
                                                } else {
                                                    cdestructuring_bind_error(datum_78, $list_alt80);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        mts = list(mt);
                    }
                    {
                        SubLObject cdolist_list_var = mts;
                        SubLObject mt_80 = NIL;
                        for (mt_80 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt_80 = cdolist_list_var.first()) {
                            ans = cons(arguments.make_hl_support(hl_module, literal, mt_80, tv), ans);
                        }
                    }
                    return nreverse(ans);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_forward_mt_combos_isa(final SubLObject support) {
        SubLObject caching_state = $hl_forward_mt_combos_isa_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(HL_FORWARD_MT_COMBOS_ISA, $hl_forward_mt_combos_isa_caching_state$, $int$1024, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            memoization_state.register_isa_dependent_cache_clear_callback(CLEAR_HL_FORWARD_MT_COMBOS_ISA);
            memoization_state.register_genls_dependent_cache_clear_callback(CLEAR_HL_FORWARD_MT_COMBOS_ISA);
            memoization_state.register_mt_dependent_cache_clear_callback(CLEAR_HL_FORWARD_MT_COMBOS_ISA);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, support, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(hl_forward_mt_combos_isa_internal(support)));
            memoization_state.caching_state_put(caching_state, support, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject justify_not_type_by_extent_known_alt(SubLObject v_term, SubLObject collection, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject isa_sentence = make_binary_formula($$isa, v_term, collection);
                SubLObject completeness_gaf = NIL;
                SubLObject unknown_sentence_support = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        completeness_gaf = kb_accessors.completely_enumerable_collection_gaf(collection, UNPROVIDED);
                        unknown_sentence_support = removal_modules_true_sentence.make_unknown_sentence_support(isa_sentence);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return list(completeness_gaf, unknown_sentence_support);
            }
        }
    }

    public static SubLObject justify_not_type_by_extent_known(final SubLObject v_term, final SubLObject collection, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject isa_sentence = make_binary_formula($$isa, v_term, collection);
        SubLObject completeness_gaf = NIL;
        SubLObject unknown_sentence_support = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            completeness_gaf = kb_accessors.completely_enumerable_collection_gaf(collection, UNPROVIDED);
            unknown_sentence_support = removal_modules_true_sentence.make_unknown_sentence_support(isa_sentence);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return list(completeness_gaf, unknown_sentence_support);
    }

    public static final SubLObject inference_max_floor_mts_of_isa_paths_alt(SubLObject v_term, SubLObject collection) {
        {
            SubLObject min_mt_sets = isa.min_mts_of_isa_paths(v_term, collection, UNPROVIDED);
            SubLObject reduced_min_mt_sets = minimize_mt_sets_wrt_core(min_mt_sets);
            SubLObject max_floor_mts = max_floor_mts_from_mt_sets(reduced_min_mt_sets);
            SubLObject reduced_max_floor_mts = maximize_mts_wrt_core(max_floor_mts);
            return reduced_max_floor_mts;
        }
    }

    public static SubLObject inference_max_floor_mts_of_isa_paths(final SubLObject v_term, final SubLObject collection) {
        final SubLObject min_mt_sets = isa.min_mts_of_isa_paths(v_term, collection, UNPROVIDED);
        final SubLObject reduced_min_mt_sets = mt_vars.minimize_mt_sets_wrt_core(min_mt_sets);
        final SubLObject max_floor_mts = genl_mts.max_floor_mts_from_mt_sets(reduced_min_mt_sets);
        final SubLObject reduced_max_floor_mts = mt_vars.maximize_mts_wrt_core(max_floor_mts);
        return reduced_max_floor_mts;
    }

    public static final SubLObject inference_max_floor_mts_of_quoted_isa_paths_alt(SubLObject v_term, SubLObject collection) {
        {
            SubLObject min_mt_sets = isa.min_mts_of_quoted_isa_paths(v_term, collection, UNPROVIDED);
            SubLObject reduced_min_mt_sets = minimize_mt_sets_wrt_core(min_mt_sets);
            SubLObject max_floor_mts = max_floor_mts_from_mt_sets(reduced_min_mt_sets);
            SubLObject reduced_max_floor_mts = maximize_mts_wrt_core(max_floor_mts);
            return reduced_max_floor_mts;
        }
    }

    public static SubLObject inference_max_floor_mts_of_quoted_isa_paths(final SubLObject v_term, final SubLObject collection) {
        final SubLObject min_mt_sets = isa.min_mts_of_quoted_isa_paths(v_term, collection, UNPROVIDED);
        final SubLObject reduced_min_mt_sets = mt_vars.minimize_mt_sets_wrt_core(min_mt_sets);
        final SubLObject max_floor_mts = genl_mts.max_floor_mts_from_mt_sets(reduced_min_mt_sets);
        final SubLObject reduced_max_floor_mts = mt_vars.maximize_mts_wrt_core(max_floor_mts);
        return reduced_max_floor_mts;
    }

    public static final SubLObject gaf_axioms_alt(SubLObject gafs, SubLObject mt) {
        {
            SubLObject result = NIL;
            SubLObject assertion = NIL;
            SubLObject cdolist_list_var = gafs;
            SubLObject gafXtv = NIL;
            for (gafXtv = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , gafXtv = cdolist_list_var.first()) {
                {
                    SubLObject datum = gafXtv;
                    SubLObject current = datum;
                    SubLObject gaf = NIL;
                    SubLObject tv = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt147);
                    gaf = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt147);
                    tv = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        assertion = find_gaf(gaf, mt);
                        if (NIL == assertion) {
                            if (NIL != com.cyc.cycjava.cycl.hl_supports.symmetric_hl_predP(gaf.first())) {
                                assertion = find_gaf(list(gaf.first(), third(gaf), second(gaf)), mt);
                            }
                        }
                        if (NIL != assertion) {
                            result = cons(assertion, result);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt147);
                    }
                }
            }
            return nreverse(result);
        }
    }

    public static SubLObject gaf_axioms(final SubLObject gafs, final SubLObject mt) {
        SubLObject result = NIL;
        SubLObject assertion = NIL;
        SubLObject cdolist_list_var = gafs;
        SubLObject gafXtv = NIL;
        gafXtv = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = gafXtv;
            SubLObject gaf = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list174);
            gaf = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list174);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                assertion = kb_indexing.find_gaf(gaf, mt);
                if ((NIL == assertion) && (NIL != symmetric_hl_predP(gaf.first()))) {
                    assertion = kb_indexing.find_gaf(list(gaf.first(), third(gaf), second(gaf)), mt);
                }
                if (NIL != assertion) {
                    result = cons(assertion, result);
                }
            } else {
                cdestructuring_bind_error(datum, $list174);
            }
            cdolist_list_var = cdolist_list_var.rest();
            gafXtv = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static final SubLObject gaf_axioms_genl_mts_alt(SubLObject gafs, SubLObject mt) {
        {
            SubLObject result = NIL;
            SubLObject assertion = NIL;
            SubLObject cdolist_list_var = gafs;
            SubLObject gafXtv = NIL;
            for (gafXtv = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , gafXtv = cdolist_list_var.first()) {
                {
                    SubLObject datum = gafXtv;
                    SubLObject current = datum;
                    SubLObject gaf = NIL;
                    SubLObject tv = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt147);
                    gaf = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt147);
                    tv = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        assertion = find_gaf_genl_mts(gaf, mt);
                        if (NIL == assertion) {
                            if (NIL != com.cyc.cycjava.cycl.hl_supports.symmetric_hl_predP(gaf.first())) {
                                assertion = find_gaf(list(gaf.first(), third(gaf), second(gaf)), mt);
                            }
                        }
                        if (NIL != assertion) {
                            result = cons(assertion, result);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt147);
                    }
                }
            }
            return nreverse(result);
        }
    }

    public static SubLObject gaf_axioms_genl_mts(final SubLObject gafs, final SubLObject mt) {
        SubLObject result = NIL;
        SubLObject assertion = NIL;
        SubLObject cdolist_list_var = gafs;
        SubLObject gafXtv = NIL;
        gafXtv = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = gafXtv;
            SubLObject gaf = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list174);
            gaf = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list174);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                assertion = kb_indexing.find_gaf_genl_mts(gaf, mt);
                if ((NIL == assertion) && (NIL != symmetric_hl_predP(gaf.first()))) {
                    assertion = kb_indexing.find_gaf(list(gaf.first(), third(gaf), second(gaf)), mt);
                }
                if (NIL != assertion) {
                    result = cons(assertion, result);
                }
            } else {
                cdestructuring_bind_error(datum, $list174);
            }
            cdolist_list_var = cdolist_list_var.rest();
            gafXtv = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static final SubLObject symmetric_hl_predP_alt(SubLObject pred) {
        return consp(member(pred, $list_alt148, symbol_function(EQ), UNPROVIDED));
    }

    public static SubLObject symmetric_hl_predP(final SubLObject pred) {
        return consp(member(pred, $list175, symbol_function(EQL), UNPROVIDED));
    }

    public static SubLObject hl_verify_incompatible_mts(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != cycl_utilities.negatedP(literal)) {
                return NIL;
            }
            SubLObject current_$101;
            final SubLObject datum_$100 = current_$101 = literal_args(literal, UNPROVIDED);
            SubLObject mt2 = NIL;
            SubLObject mt3 = NIL;
            destructuring_bind_must_consp(current_$101, datum_$100, $list176);
            mt2 = current_$101.first();
            current_$101 = current_$101.rest();
            destructuring_bind_must_consp(current_$101, datum_$100, $list176);
            mt3 = current_$101.first();
            current_$101 = current_$101.rest();
            if (NIL == current_$101) {
                return negation_mt.incompatible_mtsP(mt2, mt3, mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv));
            }
            cdestructuring_bind_error(datum_$100, $list176);
        } else {
            cdestructuring_bind_error(support, $list42);
        }
        return NIL;
    }

    public static SubLObject hl_justify_incompatible_mts(final SubLObject support) {
        return hl_justify_sbhl(support);
    }

    public static final SubLObject hl_verify_genls_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != negatedP(literal)) {
                    literal = literal_atomic_sentence(literal);
                    return removal_modules_genls.inference_not_genlP(literal_arg1(literal, UNPROVIDED), literal_arg2(literal, UNPROVIDED), mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv));
                } else {
                    {
                        SubLObject pcase_var = literal_predicate(literal, UNPROVIDED);
                        if (pcase_var.eql($$nearestGenls)) {
                            return removal_modules_nearest_isa.hl_verify_nearest_genls(support);
                        } else {
                            if (pcase_var.eql($$nearestGenlsOfType)) {
                                return removal_modules_nearest_isa.hl_verify_nearest_genls_of_type(support);
                            } else {
                                return removal_modules_genls.inference_genlP(literal_arg1(literal, UNPROVIDED), literal_arg2(literal, UNPROVIDED), mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv));
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_verify_genls(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(support, $list42);
            return NIL;
        }
        if (NIL != cycl_utilities.negatedP(literal)) {
            literal = literal_atomic_sentence(literal);
            return removal_modules_genls.inference_not_genlP(literal_arg1(literal, UNPROVIDED), literal_arg2(literal, UNPROVIDED), mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv));
        }
        final SubLObject pcase_var = literal_predicate(literal, UNPROVIDED);
        if (pcase_var.eql($$nearestGenls)) {
            return removal_modules_nearest_isa.hl_verify_nearest_genls(support);
        }
        if (pcase_var.eql($$nearestGenlsOfType)) {
            return removal_modules_nearest_isa.hl_verify_nearest_genls_of_type(support);
        }
        return removal_modules_genls.inference_genlP(literal_arg1(literal, UNPROVIDED), literal_arg2(literal, UNPROVIDED), mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv));
    }

    public static final SubLObject hl_justify_genls_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject pcase_var = literal_predicate(literal, UNPROVIDED);
                    if (pcase_var.eql($$nearestGenls)) {
                        return removal_modules_nearest_isa.hl_justify_nearest_genls(support);
                    } else {
                        if (pcase_var.eql($$nearestGenlsOfType)) {
                            return removal_modules_nearest_isa.hl_justify_nearest_genls_of_type(support);
                        } else {
                            return com.cyc.cycjava.cycl.hl_supports.hl_justify_sbhl(support);
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_justify_genls(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(support, $list42);
            return NIL;
        }
        final SubLObject pcase_var = literal_predicate(literal, UNPROVIDED);
        if (pcase_var.eql($$nearestGenls)) {
            return removal_modules_nearest_isa.hl_justify_nearest_genls(support);
        }
        if (pcase_var.eql($$nearestGenlsOfType)) {
            return removal_modules_nearest_isa.hl_justify_nearest_genls_of_type(support);
        }
        return hl_justify_sbhl(support);
    }

    public static final SubLObject hl_forward_mt_combos_genls_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject mts = NIL;
                    SubLObject ans = NIL;
                    if (NIL == negatedP(literal)) {
                        mts = com.cyc.cycjava.cycl.hl_supports.inference_max_floor_mts_of_genls_paths(literal_arg1(literal, UNPROVIDED), literal_arg2(literal, UNPROVIDED));
                    } else {
                        mts = list(mt);
                    }
                    {
                        SubLObject cdolist_list_var = mts;
                        SubLObject mt_81 = NIL;
                        for (mt_81 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt_81 = cdolist_list_var.first()) {
                            ans = cons(arguments.make_hl_support(hl_module, literal, mt_81, tv), ans);
                        }
                    }
                    return nreverse(ans);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_forward_mt_combos_genls(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(support, $list42);
            return NIL;
        }
        final SubLObject pcase_var = literal_predicate(literal, UNPROVIDED);
        if (pcase_var.eql($$nearestGenls)) {
            return list(support);
        }
        if (pcase_var.eql($$nearestGenlsOfType)) {
            return list(support);
        }
        SubLObject mts = NIL;
        SubLObject ans = NIL;
        if (NIL == cycl_utilities.negatedP(literal)) {
            mts = inference_max_floor_mts_of_genls_paths(literal_arg1(literal, UNPROVIDED), literal_arg2(literal, UNPROVIDED));
        } else {
            mts = list(mt);
        }
        SubLObject cdolist_list_var = mts;
        SubLObject mt_$102 = NIL;
        mt_$102 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            ans = cons(arguments.make_hl_support(hl_module, literal, mt_$102, tv), ans);
            cdolist_list_var = cdolist_list_var.rest();
            mt_$102 = cdolist_list_var.first();
        } 
        return nreverse(ans);
    }

    public static final SubLObject inference_max_floor_mts_of_genls_paths_alt(SubLObject spec, SubLObject genl) {
        if (NIL != term.first_order_nautP(spec)) {
            return genls.max_floor_mts_of_nat_genls_paths(spec, genl, UNPROVIDED);
        } else {
            {
                SubLObject min_mt_sets = sbhl_search_what_mts.sbhl_min_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module($$genls), spec, genl, UNPROVIDED);
                SubLObject reduced_min_mt_sets = minimize_mt_sets_wrt_core(min_mt_sets);
                SubLObject max_floor_mts = sbhl_search_what_mts.sbhl_max_floor_mts_of_paths(reduced_min_mt_sets);
                SubLObject reduced_max_floor_mts = maximize_mts_wrt_core(max_floor_mts);
                return reduced_max_floor_mts;
            }
        }
    }

    public static SubLObject inference_max_floor_mts_of_genls_paths(final SubLObject spec, final SubLObject genl) {
        if (NIL != term.first_order_nautP(spec)) {
            return genls.max_floor_mts_of_nat_genls_paths(spec, genl, UNPROVIDED);
        }
        final SubLObject min_mt_sets = sbhl_search_what_mts.sbhl_min_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module($$genls), spec, genl, UNPROVIDED);
        final SubLObject reduced_min_mt_sets = mt_vars.minimize_mt_sets_wrt_core(min_mt_sets);
        final SubLObject max_floor_mts = sbhl_search_what_mts.sbhl_max_floor_mts_of_paths(reduced_min_mt_sets);
        final SubLObject reduced_max_floor_mts = mt_vars.maximize_mts_wrt_core(max_floor_mts);
        return reduced_max_floor_mts;
    }

    public static final SubLObject hl_verify_disjointwith_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                if (literal_predicate(literal, UNPROVIDED) == $$instancesOfDisjointCollections) {
                    {
                        SubLObject datum_82 = literal_args(literal, UNPROVIDED);
                        SubLObject current_83 = datum_82;
                        SubLObject term1 = NIL;
                        SubLObject term2 = NIL;
                        destructuring_bind_must_consp(current_83, datum_82, $list_alt155);
                        term1 = current_83.first();
                        current_83 = current_83.rest();
                        destructuring_bind_must_consp(current_83, datum_82, $list_alt155);
                        term2 = current_83.first();
                        current_83 = current_83.rest();
                        if (NIL == current_83) {
                            return list_utilities.sublisp_boolean(why_instances_of_disjoint_collections(term1, term2, mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv)));
                        } else {
                            cdestructuring_bind_error(datum_82, $list_alt155);
                        }
                    }
                } else {
                    if (NIL == negatedP(literal)) {
                        {
                            SubLObject datum_84 = literal_args(literal, UNPROVIDED);
                            SubLObject current_85 = datum_84;
                            SubLObject col1 = NIL;
                            SubLObject col2 = NIL;
                            destructuring_bind_must_consp(current_85, datum_84, $list_alt55);
                            col1 = current_85.first();
                            current_85 = current_85.rest();
                            destructuring_bind_must_consp(current_85, datum_84, $list_alt55);
                            col2 = current_85.first();
                            current_85 = current_85.rest();
                            if (NIL == current_85) {
                                return disjoint_withP(col1, col2, mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv));
                            } else {
                                cdestructuring_bind_error(datum_84, $list_alt55);
                            }
                        }
                    } else {
                        {
                            SubLObject datum_86 = literal_args(literal_atomic_sentence(literal), UNPROVIDED);
                            SubLObject current_87 = datum_86;
                            SubLObject col1 = NIL;
                            SubLObject col2 = NIL;
                            destructuring_bind_must_consp(current_87, datum_86, $list_alt55);
                            col1 = current_87.first();
                            current_87 = current_87.rest();
                            destructuring_bind_must_consp(current_87, datum_86, $list_alt55);
                            col2 = current_87.first();
                            current_87 = current_87.rest();
                            if (NIL == current_87) {
                                return not_disjoint_withP(col1, col2, mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv));
                            } else {
                                cdestructuring_bind_error(datum_86, $list_alt55);
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_verify_disjointwith(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sdc.$ignoring_sdcP$.currentBinding(thread);
        try {
            sdc.$ignoring_sdcP$.bind(T, thread);
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(support, support, $list42);
            hl_module = support.first();
            SubLObject current = support.rest();
            destructuring_bind_must_consp(current, support, $list42);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, support, $list42);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, support, $list42);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                if (literal_predicate(literal, UNPROVIDED).eql($$instancesOfDisjointCollections)) {
                    SubLObject current_$104;
                    final SubLObject datum_$103 = current_$104 = literal_args(literal, UNPROVIDED);
                    SubLObject term1 = NIL;
                    SubLObject term2 = NIL;
                    destructuring_bind_must_consp(current_$104, datum_$103, $list185);
                    term1 = current_$104.first();
                    current_$104 = current_$104.rest();
                    destructuring_bind_must_consp(current_$104, datum_$103, $list185);
                    term2 = current_$104.first();
                    current_$104 = current_$104.rest();
                    if (NIL == current_$104) {
                        return list_utilities.sublisp_boolean(disjoint_with.why_instances_of_disjoint_collections(term1, term2, mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv)));
                    }
                    cdestructuring_bind_error(datum_$103, $list185);
                } else
                    if (NIL == cycl_utilities.negatedP(literal)) {
                        SubLObject current_$105;
                        final SubLObject datum_$104 = current_$105 = literal_args(literal, UNPROVIDED);
                        SubLObject col1 = NIL;
                        SubLObject col2 = NIL;
                        destructuring_bind_must_consp(current_$105, datum_$104, $list73);
                        col1 = current_$105.first();
                        current_$105 = current_$105.rest();
                        destructuring_bind_must_consp(current_$105, datum_$104, $list73);
                        col2 = current_$105.first();
                        current_$105 = current_$105.rest();
                        if (NIL == current_$105) {
                            return disjoint_with.disjoint_withP(col1, col2, mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv));
                        }
                        cdestructuring_bind_error(datum_$104, $list73);
                    } else {
                        SubLObject current_$106;
                        final SubLObject datum_$105 = current_$106 = literal_args(literal_atomic_sentence(literal), UNPROVIDED);
                        SubLObject col1 = NIL;
                        SubLObject col2 = NIL;
                        destructuring_bind_must_consp(current_$106, datum_$105, $list73);
                        col1 = current_$106.first();
                        current_$106 = current_$106.rest();
                        destructuring_bind_must_consp(current_$106, datum_$105, $list73);
                        col2 = current_$106.first();
                        current_$106 = current_$106.rest();
                        if (NIL == current_$106) {
                            return disjoint_with.not_disjoint_withP(col1, col2, mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv));
                        }
                        cdestructuring_bind_error(datum_$105, $list73);
                    }

            } else {
                cdestructuring_bind_error(support, $list42);
            }
        } finally {
            sdc.$ignoring_sdcP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject hl_justify_disjointwith_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                if (literal_predicate(literal, UNPROVIDED) == $$instancesOfDisjointCollections) {
                    {
                        SubLObject datum_88 = literal_args(literal, UNPROVIDED);
                        SubLObject current_89 = datum_88;
                        SubLObject term1 = NIL;
                        SubLObject term2 = NIL;
                        destructuring_bind_must_consp(current_89, datum_88, $list_alt155);
                        term1 = current_89.first();
                        current_89 = current_89.rest();
                        destructuring_bind_must_consp(current_89, datum_88, $list_alt155);
                        term2 = current_89.first();
                        current_89 = current_89.rest();
                        if (NIL == current_89) {
                            return why_instances_of_disjoint_collections(term1, term2, mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv));
                        } else {
                            cdestructuring_bind_error(datum_88, $list_alt155);
                        }
                    }
                } else {
                    return com.cyc.cycjava.cycl.hl_supports.hl_justify_sbhl(support);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_justify_disjointwith(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sdc.$ignoring_sdcP$.currentBinding(thread);
        try {
            sdc.$ignoring_sdcP$.bind(T, thread);
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(support, support, $list42);
            hl_module = support.first();
            SubLObject current = support.rest();
            destructuring_bind_must_consp(current, support, $list42);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, support, $list42);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, support, $list42);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                if (!literal_predicate(literal, UNPROVIDED).eql($$instancesOfDisjointCollections)) {
                    return hl_justify_sbhl(support);
                }
                SubLObject current_$110;
                final SubLObject datum_$109 = current_$110 = literal_args(literal, UNPROVIDED);
                SubLObject term1 = NIL;
                SubLObject term2 = NIL;
                destructuring_bind_must_consp(current_$110, datum_$109, $list185);
                term1 = current_$110.first();
                current_$110 = current_$110.rest();
                destructuring_bind_must_consp(current_$110, datum_$109, $list185);
                term2 = current_$110.first();
                current_$110 = current_$110.rest();
                if (NIL == current_$110) {
                    return disjoint_with.why_instances_of_disjoint_collections(term1, term2, mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv));
                }
                cdestructuring_bind_error(datum_$109, $list185);
            } else {
                cdestructuring_bind_error(support, $list42);
            }
        } finally {
            sdc.$ignoring_sdcP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject hl_forward_mt_combos_disjointwith_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject mts = NIL;
                    SubLObject ans = NIL;
                    if (NIL == negatedP(literal)) {
                        mts = list(mt);
                    } else {
                        mts = list(mt);
                    }
                    {
                        SubLObject cdolist_list_var = mts;
                        SubLObject mt_90 = NIL;
                        for (mt_90 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt_90 = cdolist_list_var.first()) {
                            ans = cons(arguments.make_hl_support(hl_module, literal, mt_90, tv), ans);
                        }
                    }
                    return nreverse(ans);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_forward_mt_combos_disjointwith(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sdc.$ignoring_sdcP$.currentBinding(thread);
        try {
            sdc.$ignoring_sdcP$.bind(T, thread);
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(support, support, $list42);
            hl_module = support.first();
            SubLObject current = support.rest();
            destructuring_bind_must_consp(current, support, $list42);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, support, $list42);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, support, $list42);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject col1 = literal_arg1(literal, UNPROVIDED);
                final SubLObject col2 = literal_arg2(literal, UNPROVIDED);
                SubLObject mts = NIL;
                SubLObject ans = NIL;
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                final SubLObject _prev_bind_0_$111 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    if (NIL == cycl_utilities.negatedP(literal)) {
                        mts = disjoint_with.max_floor_mts_of_disjoint_with_paths(col1, col2, UNPROVIDED);
                    } else {
                        mts = disjoint_with.max_floor_mts_of_not_disjoint_with_paths(col1, col2, UNPROVIDED);
                    }
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$111, thread);
                }
                if (NIL == mts) {
                    mts = list(mt);
                }
                SubLObject cdolist_list_var = mts;
                SubLObject max_mt = NIL;
                max_mt = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    ans = cons(arguments.make_hl_support(hl_module, literal, max_mt, tv), ans);
                    cdolist_list_var = cdolist_list_var.rest();
                    max_mt = cdolist_list_var.first();
                } 
                return nreverse(ans);
            }
            cdestructuring_bind_error(support, $list42);
        } finally {
            sdc.$ignoring_sdcP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject hl_verify_genlmt_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != negatedP(literal)) {
                    {
                        SubLObject asent = literal_atomic_sentence(literal);
                        return not_genl_mtP(literal_arg1(asent, UNPROVIDED), literal_arg2(asent, UNPROVIDED), mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv));
                    }
                } else {
                    return genl_mtP(literal_arg1(literal, UNPROVIDED), literal_arg2(literal, UNPROVIDED), mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv));
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_verify_genlmt(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(support, $list42);
            return NIL;
        }
        if (NIL != cycl_utilities.negatedP(literal)) {
            final SubLObject asent = literal_atomic_sentence(literal);
            return genl_mts.not_genl_mtP(literal_arg1(asent, UNPROVIDED), literal_arg2(asent, UNPROVIDED), mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv));
        }
        return genl_mts.genl_mtP(literal_arg1(literal, UNPROVIDED), literal_arg2(literal, UNPROVIDED), mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv));
    }

    public static final SubLObject hl_justify_genlmt_alt(SubLObject support) {
        {
            SubLObject just = NIL;
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL == negatedP(literal)) {
                    just = why_genl_mtP(literal_arg1(literal, UNPROVIDED), literal_arg2(literal, UNPROVIDED), mt, NIL, $ASSERTION);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
            return just;
        }
    }

    public static SubLObject hl_justify_genlmt(final SubLObject support) {
        SubLObject just = NIL;
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL == cycl_utilities.negatedP(literal)) {
                just = genl_mts.why_genl_mtP(literal_arg1(literal, UNPROVIDED), literal_arg2(literal, UNPROVIDED), mt, NIL, $ASSERTION);
            }
        } else {
            cdestructuring_bind_error(support, $list42);
        }
        return just;
    }

    public static final SubLObject hl_forward_mt_combos_genlmt_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject mts = NIL;
                    SubLObject ans = NIL;
                    if (NIL == negatedP(literal)) {
                        mts = max_floor_mts_of_genl_mt_paths(literal_arg1(literal, UNPROVIDED), literal_arg2(literal, UNPROVIDED));
                    } else {
                        mts = list(mt);
                    }
                    {
                        SubLObject cdolist_list_var = mts;
                        SubLObject mt_91 = NIL;
                        for (mt_91 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt_91 = cdolist_list_var.first()) {
                            ans = cons(arguments.make_hl_support(hl_module, literal, mt_91, tv), ans);
                        }
                    }
                    return nreverse(ans);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_forward_mt_combos_genlmt(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject mts = NIL;
            SubLObject ans = NIL;
            if (NIL == cycl_utilities.negatedP(literal)) {
                mts = genl_mts.max_floor_mts_of_genl_mt_paths(literal_arg1(literal, UNPROVIDED), literal_arg2(literal, UNPROVIDED));
            } else {
                mts = list(mt);
            }
            SubLObject cdolist_list_var = mts;
            SubLObject mt_$112 = NIL;
            mt_$112 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                ans = cons(arguments.make_hl_support(hl_module, literal, mt_$112, tv), ans);
                cdolist_list_var = cdolist_list_var.rest();
                mt_$112 = cdolist_list_var.first();
            } 
            return nreverse(ans);
        }
        cdestructuring_bind_error(support, $list42);
        return NIL;
    }

    public static final SubLObject hl_verify_genlpreds_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL == negatedP(literal)) {
                    {
                        SubLObject datum_92 = literal;
                        SubLObject current_93 = datum_92;
                        SubLObject predicate = NIL;
                        SubLObject spec = NIL;
                        SubLObject genl = NIL;
                        destructuring_bind_must_consp(current_93, datum_92, $list_alt160);
                        predicate = current_93.first();
                        current_93 = current_93.rest();
                        destructuring_bind_must_consp(current_93, datum_92, $list_alt160);
                        spec = current_93.first();
                        current_93 = current_93.rest();
                        destructuring_bind_must_consp(current_93, datum_92, $list_alt160);
                        genl = current_93.first();
                        current_93 = current_93.rest();
                        if (NIL == current_93) {
                            {
                                SubLObject pcase_var = predicate;
                                if (pcase_var.eql($$genlPreds)) {
                                    return genl_predicateP(spec, genl, mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv));
                                } else {
                                    if (pcase_var.eql($$genlInverse)) {
                                        return genl_inverseP(spec, genl, mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv));
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum_92, $list_alt160);
                        }
                    }
                } else {
                    {
                        SubLObject datum_94 = literal_atomic_sentence(literal);
                        SubLObject current_95 = datum_94;
                        SubLObject predicate = NIL;
                        SubLObject spec = NIL;
                        SubLObject genl = NIL;
                        destructuring_bind_must_consp(current_95, datum_94, $list_alt160);
                        predicate = current_95.first();
                        current_95 = current_95.rest();
                        destructuring_bind_must_consp(current_95, datum_94, $list_alt160);
                        spec = current_95.first();
                        current_95 = current_95.rest();
                        destructuring_bind_must_consp(current_95, datum_94, $list_alt160);
                        genl = current_95.first();
                        current_95 = current_95.rest();
                        if (NIL == current_95) {
                            {
                                SubLObject pcase_var = predicate;
                                if (pcase_var.eql($$genlPreds)) {
                                    return not_genl_predicateP(spec, genl, mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv));
                                } else {
                                    if (pcase_var.eql($$genlInverse)) {
                                        return not_genl_inverseP(spec, genl, mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv));
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum_94, $list_alt160);
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_verify_genlpreds(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL == cycl_utilities.negatedP(literal)) {
                SubLObject current_$114;
                final SubLObject datum_$113 = current_$114 = literal;
                SubLObject predicate = NIL;
                SubLObject spec = NIL;
                SubLObject genl = NIL;
                destructuring_bind_must_consp(current_$114, datum_$113, $list190);
                predicate = current_$114.first();
                current_$114 = current_$114.rest();
                destructuring_bind_must_consp(current_$114, datum_$113, $list190);
                spec = current_$114.first();
                current_$114 = current_$114.rest();
                destructuring_bind_must_consp(current_$114, datum_$113, $list190);
                genl = current_$114.first();
                current_$114 = current_$114.rest();
                if (NIL == current_$114) {
                    final SubLObject pcase_var = predicate;
                    if (pcase_var.eql($$genlPreds)) {
                        return genl_predicates.genl_predicateP(spec, genl, mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv));
                    }
                    if (pcase_var.eql($$genlInverse)) {
                        return genl_predicates.genl_inverseP(spec, genl, mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv));
                    }
                } else {
                    cdestructuring_bind_error(datum_$113, $list190);
                }
            } else {
                SubLObject current_$115;
                final SubLObject datum_$114 = current_$115 = literal_atomic_sentence(literal);
                SubLObject predicate = NIL;
                SubLObject spec = NIL;
                SubLObject genl = NIL;
                destructuring_bind_must_consp(current_$115, datum_$114, $list190);
                predicate = current_$115.first();
                current_$115 = current_$115.rest();
                destructuring_bind_must_consp(current_$115, datum_$114, $list190);
                spec = current_$115.first();
                current_$115 = current_$115.rest();
                destructuring_bind_must_consp(current_$115, datum_$114, $list190);
                genl = current_$115.first();
                current_$115 = current_$115.rest();
                if (NIL == current_$115) {
                    final SubLObject pcase_var = predicate;
                    if (pcase_var.eql($$genlPreds)) {
                        return genl_predicates.not_genl_predicateP(spec, genl, mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv));
                    }
                    if (pcase_var.eql($$genlInverse)) {
                        return genl_predicates.not_genl_inverseP(spec, genl, mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv));
                    }
                } else {
                    cdestructuring_bind_error(datum_$114, $list190);
                }
            }
        } else {
            cdestructuring_bind_error(support, $list42);
        }
        return NIL;
    }

    public static final SubLObject hl_justify_genlpreds_alt(SubLObject support) {
        return com.cyc.cycjava.cycl.hl_supports.hl_justify_sbhl(support);
    }

    public static SubLObject hl_justify_genlpreds(final SubLObject support) {
        return hl_justify_sbhl(support);
    }

    public static final SubLObject hl_forward_mt_combos_genlpreds_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject mts = NIL;
                    SubLObject ans = NIL;
                    if (NIL == negatedP(literal)) {
                        {
                            SubLObject datum_96 = literal;
                            SubLObject current_97 = datum_96;
                            SubLObject predicate = NIL;
                            SubLObject spec = NIL;
                            SubLObject genl = NIL;
                            destructuring_bind_must_consp(current_97, datum_96, $list_alt160);
                            predicate = current_97.first();
                            current_97 = current_97.rest();
                            destructuring_bind_must_consp(current_97, datum_96, $list_alt160);
                            spec = current_97.first();
                            current_97 = current_97.rest();
                            destructuring_bind_must_consp(current_97, datum_96, $list_alt160);
                            genl = current_97.first();
                            current_97 = current_97.rest();
                            if (NIL == current_97) {
                                {
                                    SubLObject pcase_var = predicate;
                                    if (pcase_var.eql($$genlPreds)) {
                                        mts = max_floor_mts_of_genl_pred_paths(spec, genl);
                                    } else {
                                        if (pcase_var.eql($$genlInverse)) {
                                            mts = max_floor_mts_of_genl_inverse_paths(spec, genl, UNPROVIDED);
                                        } else {
                                            mts = list(mt);
                                        }
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum_96, $list_alt160);
                            }
                        }
                    } else {
                        mts = list(mt);
                    }
                    {
                        SubLObject cdolist_list_var = mts;
                        SubLObject mt_98 = NIL;
                        for (mt_98 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt_98 = cdolist_list_var.first()) {
                            ans = cons(arguments.make_hl_support(hl_module, literal, mt_98, tv), ans);
                        }
                    }
                    return nreverse(ans);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_forward_mt_combos_genlpreds(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject mts = NIL;
            SubLObject ans = NIL;
            if (NIL == cycl_utilities.negatedP(literal)) {
                SubLObject current_$118;
                final SubLObject datum_$117 = current_$118 = literal;
                SubLObject predicate = NIL;
                SubLObject spec = NIL;
                SubLObject genl = NIL;
                destructuring_bind_must_consp(current_$118, datum_$117, $list190);
                predicate = current_$118.first();
                current_$118 = current_$118.rest();
                destructuring_bind_must_consp(current_$118, datum_$117, $list190);
                spec = current_$118.first();
                current_$118 = current_$118.rest();
                destructuring_bind_must_consp(current_$118, datum_$117, $list190);
                genl = current_$118.first();
                current_$118 = current_$118.rest();
                if (NIL == current_$118) {
                    final SubLObject pcase_var = predicate;
                    if (pcase_var.eql($$genlPreds)) {
                        mts = genl_predicates.max_floor_mts_of_genl_pred_paths(spec, genl);
                    } else
                        if (pcase_var.eql($$genlInverse)) {
                            mts = genl_predicates.max_floor_mts_of_genl_inverse_paths(spec, genl, UNPROVIDED);
                        } else {
                            mts = list(mt);
                        }

                } else {
                    cdestructuring_bind_error(datum_$117, $list190);
                }
            } else {
                mts = list(mt);
            }
            SubLObject cdolist_list_var = mts;
            SubLObject mt_$119 = NIL;
            mt_$119 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                ans = cons(arguments.make_hl_support(hl_module, literal, mt_$119, tv), ans);
                cdolist_list_var = cdolist_list_var.rest();
                mt_$119 = cdolist_list_var.first();
            } 
            return nreverse(ans);
        }
        cdestructuring_bind_error(support, $list42);
        return NIL;
    }

    public static final SubLObject hl_verify_negationpreds_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL == negatedP(literal)) {
                    {
                        SubLObject datum_99 = literal;
                        SubLObject current_100 = datum_99;
                        SubLObject predicate = NIL;
                        SubLObject arg1 = NIL;
                        SubLObject arg2 = NIL;
                        destructuring_bind_must_consp(current_100, datum_99, $list_alt81);
                        predicate = current_100.first();
                        current_100 = current_100.rest();
                        destructuring_bind_must_consp(current_100, datum_99, $list_alt81);
                        arg1 = current_100.first();
                        current_100 = current_100.rest();
                        destructuring_bind_must_consp(current_100, datum_99, $list_alt81);
                        arg2 = current_100.first();
                        current_100 = current_100.rest();
                        if (NIL == current_100) {
                            {
                                SubLObject pcase_var = predicate;
                                if (pcase_var.eql($$negationPreds)) {
                                    return negation_predicate.negation_predicateP(arg1, arg2, mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv));
                                } else {
                                    if (pcase_var.eql($$negationInverse)) {
                                        return negation_predicate.negation_inverseP(arg1, arg2, mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv));
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum_99, $list_alt81);
                        }
                    }
                } else {
                    {
                        SubLObject datum_101 = literal_atomic_sentence(literal);
                        SubLObject current_102 = datum_101;
                        SubLObject predicate = NIL;
                        SubLObject arg1 = NIL;
                        SubLObject arg2 = NIL;
                        destructuring_bind_must_consp(current_102, datum_101, $list_alt81);
                        predicate = current_102.first();
                        current_102 = current_102.rest();
                        destructuring_bind_must_consp(current_102, datum_101, $list_alt81);
                        arg1 = current_102.first();
                        current_102 = current_102.rest();
                        destructuring_bind_must_consp(current_102, datum_101, $list_alt81);
                        arg2 = current_102.first();
                        current_102 = current_102.rest();
                        if (NIL == current_102) {
                            {
                                SubLObject pcase_var = predicate;
                                if (pcase_var.eql($$negationPreds)) {
                                    return negation_predicate.not_negation_predicateP(arg1, arg2, mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv));
                                } else {
                                    if (pcase_var.eql($$negationInverse)) {
                                        return negation_predicate.not_negation_inverseP(arg1, arg2, mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv));
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum_101, $list_alt81);
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_verify_negationpreds(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL == cycl_utilities.negatedP(literal)) {
                SubLObject current_$121;
                final SubLObject datum_$120 = current_$121 = literal;
                SubLObject predicate = NIL;
                SubLObject arg1 = NIL;
                SubLObject arg2 = NIL;
                destructuring_bind_must_consp(current_$121, datum_$120, $list101);
                predicate = current_$121.first();
                current_$121 = current_$121.rest();
                destructuring_bind_must_consp(current_$121, datum_$120, $list101);
                arg1 = current_$121.first();
                current_$121 = current_$121.rest();
                destructuring_bind_must_consp(current_$121, datum_$120, $list101);
                arg2 = current_$121.first();
                current_$121 = current_$121.rest();
                if (NIL == current_$121) {
                    final SubLObject pcase_var = predicate;
                    if (pcase_var.eql($$negationPreds)) {
                        return negation_predicate.negation_predicateP(arg1, arg2, mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv));
                    }
                    if (pcase_var.eql($$negationInverse)) {
                        return negation_predicate.negation_inverseP(arg1, arg2, mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv));
                    }
                } else {
                    cdestructuring_bind_error(datum_$120, $list101);
                }
            } else {
                SubLObject current_$122;
                final SubLObject datum_$121 = current_$122 = literal_atomic_sentence(literal);
                SubLObject predicate = NIL;
                SubLObject arg1 = NIL;
                SubLObject arg2 = NIL;
                destructuring_bind_must_consp(current_$122, datum_$121, $list101);
                predicate = current_$122.first();
                current_$122 = current_$122.rest();
                destructuring_bind_must_consp(current_$122, datum_$121, $list101);
                arg1 = current_$122.first();
                current_$122 = current_$122.rest();
                destructuring_bind_must_consp(current_$122, datum_$121, $list101);
                arg2 = current_$122.first();
                current_$122 = current_$122.rest();
                if (NIL == current_$122) {
                    final SubLObject pcase_var = predicate;
                    if (pcase_var.eql($$negationPreds)) {
                        return negation_predicate.not_negation_predicateP(arg1, arg2, mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv));
                    }
                    if (pcase_var.eql($$negationInverse)) {
                        return negation_predicate.not_negation_inverseP(arg1, arg2, mt, sbhl_link_vars.support_tv_to_sbhl_tv(tv));
                    }
                } else {
                    cdestructuring_bind_error(datum_$121, $list101);
                }
            }
        } else {
            cdestructuring_bind_error(support, $list42);
        }
        return NIL;
    }

    public static final SubLObject hl_justify_negationpreds_alt(SubLObject support) {
        return com.cyc.cycjava.cycl.hl_supports.hl_justify_sbhl(support);
    }

    public static SubLObject hl_justify_negationpreds(final SubLObject support) {
        return hl_justify_sbhl(support);
    }

    public static final SubLObject hl_forward_mt_combos_negationpreds_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject mts = NIL;
                    SubLObject ans = NIL;
                    mts = list(mt);
                    {
                        SubLObject cdolist_list_var = mts;
                        SubLObject mt_103 = NIL;
                        for (mt_103 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt_103 = cdolist_list_var.first()) {
                            ans = cons(arguments.make_hl_support(hl_module, literal, mt_103, tv), ans);
                        }
                    }
                    return nreverse(ans);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_forward_mt_combos_negationpreds(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject mts = NIL;
            SubLObject ans = NIL;
            SubLObject cdolist_list_var;
            mts = cdolist_list_var = list(mt);
            SubLObject mt_$124 = NIL;
            mt_$124 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                ans = cons(arguments.make_hl_support(hl_module, literal, mt_$124, tv), ans);
                cdolist_list_var = cdolist_list_var.rest();
                mt_$124 = cdolist_list_var.first();
            } 
            return nreverse(ans);
        }
        cdestructuring_bind_error(support, $list42);
        return NIL;
    }

    public static final SubLObject hl_verify_time_sentence_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject pred = literal_predicate(literal, UNPROVIDED);
                    if (pred == $$temporallySubsumes_TypeType) {
                        {
                            SubLObject arg1 = literal_arg1(literal, UNPROVIDED);
                            SubLObject arg2 = literal_arg2(literal, UNPROVIDED);
                            return hlmt_relevance.bigger_time_typeP(arg1, arg2);
                        }
                    } else {
                        if (pred == $$temporallySubsumes_InsType) {
                            {
                                SubLObject interval = literal_arg1(literal, UNPROVIDED);
                                SubLObject type = literal_arg2(literal, UNPROVIDED);
                                return hlmt_relevance.time_interval_subsumes_typeP(interval, type);
                            }
                        } else {
                            if (pred == $$duration) {
                                {
                                    SubLObject interval = literal_arg1(literal, UNPROVIDED);
                                    SubLObject duration = literal_arg2(literal, UNPROVIDED);
                                    return time_interval_utilities.time_interval_durationP(interval, duration);
                                }
                            } else {
                                if (NIL != sbhl_time_utilities.sbhl_time_predicate_p(pred)) {
                                    return sbhl_time_modules.hl_verify_sbhl_time(support);
                                } else {
                                    return Errors.cerror($str_alt172$Continue_anyway_, $str_alt173$Unsupported_predicate___a__for__T, pred);
                                }
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_verify_time_sentence(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(support, $list42);
            return NIL;
        }
        final SubLObject pred = literal_predicate(literal, UNPROVIDED);
        if (pred.eql($$temporallySubsumes_TypeType)) {
            final SubLObject arg1 = literal_arg1(literal, UNPROVIDED);
            final SubLObject arg2 = literal_arg2(literal, UNPROVIDED);
            return hlmt_relevance.bigger_time_typeP(arg1, arg2);
        }
        if (pred.eql($$temporallySubsumes_InsType)) {
            final SubLObject interval = literal_arg1(literal, UNPROVIDED);
            final SubLObject type = literal_arg2(literal, UNPROVIDED);
            return hlmt_relevance.time_interval_subsumes_typeP(interval, type);
        }
        if (pred.eql($$duration)) {
            final SubLObject interval = literal_arg1(literal, UNPROVIDED);
            final SubLObject duration = literal_arg2(literal, UNPROVIDED);
            return time_interval_utilities.time_interval_durationP(interval, duration);
        }
        if (NIL != sbhl_time_utilities.sbhl_time_predicate_p(pred)) {
            return sbhl_time_modules.hl_verify_sbhl_time(support);
        }
        return Errors.cerror($str202$Continue_anyway_, $str203$Unsupported_predicate___a__for__T, pred);
    }

    public static final SubLObject hl_true_mts_for_time_sentence_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != sbhl_time_utilities.sbhl_time_predicate_p(literal_predicate(literal, UNPROVIDED))) {
                    return sbhl_time_modules.hl_forward_mt_combos_sbhl_time(support);
                }
                return mt;
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_true_mts_for_time_sentence(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(support, $list42);
            return NIL;
        }
        if (NIL != sbhl_time_utilities.sbhl_time_predicate_p(literal_predicate(literal, UNPROVIDED))) {
            return sbhl_time_modules.hl_forward_mt_combos_sbhl_time(support);
        }
        return list(support);
    }

    public static final SubLObject hl_validate_time_alt(SubLObject support, SubLObject validation_level) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject pcase_var = validation_level;
                    if (pcase_var.eql($NONE)) {
                        return T;
                    } else {
                        if (pcase_var.eql($MINIMAL)) {
                            return removal_modules_admitted_formula.inference_admitted_sentence(literal, mt);
                        } else {
                            if (pcase_var.eql($ARG_TYPE)) {
                                return removal_modules_admitted_formula.inference_admitted_sentence(literal, mt);
                            } else {
                                if (pcase_var.eql($ALL)) {
                                    return removal_modules_admitted_formula.inference_admitted_sentence(literal, mt);
                                } else {
                                    Errors.error($str_alt65$Unexpected_intermediate_step_vali, validation_level);
                                }
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_validate_time(final SubLObject support, final SubLObject validation_level) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            if (validation_level.eql($NONE)) {
                return T;
            }
            if (validation_level.eql($MINIMAL)) {
                return removal_modules_admitted_formula.inference_admitted_sentence(literal, mt);
            }
            if (validation_level.eql($ARG_TYPE)) {
                return removal_modules_admitted_formula.inference_admitted_sentence(literal, mt);
            }
            if (validation_level.eql($ALL)) {
                return removal_modules_admitted_formula.inference_admitted_sentence(literal, mt);
            }
            Errors.error($str85$Unexpected_intermediate_step_vali, validation_level);
        } else {
            cdestructuring_bind_error(support, $list42);
        }
        return NIL;
    }

    public static final SubLObject hl_justify_time_sentence_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject pred = literal_predicate(literal, UNPROVIDED);
                    if (pred == $$temporallySubsumes_TypeType) {
                        {
                            SubLObject arg1 = literal_arg1(literal, UNPROVIDED);
                            SubLObject arg2 = literal_arg2(literal, UNPROVIDED);
                            return removal_modules_type_temporal_subsumption.why_bigger_time_typeP(arg1, arg2);
                        }
                    } else {
                        if (pred == $$temporallySubsumes_InsType) {
                            {
                                SubLObject interval = literal_arg1(literal, UNPROVIDED);
                                SubLObject type = literal_arg2(literal, UNPROVIDED);
                                return removal_modules_type_temporal_subsumption.why_time_interval_subsumes_typeP(interval, type);
                            }
                        } else {
                            if (pred == $$duration) {
                                return NIL;
                            } else {
                                if (NIL != sbhl_time_utilities.sbhl_time_predicate_p(pred)) {
                                    return sbhl_time_modules.hl_justify_sbhl_time(support);
                                } else {
                                    return Errors.cerror($str_alt172$Continue_anyway_, $str_alt173$Unsupported_predicate___a__for__T, pred);
                                }
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt23);
            }
        }
        return NIL;
    }

    public static SubLObject hl_justify_time_sentence(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(support, $list42);
            return NIL;
        }
        final SubLObject pred = literal_predicate(literal, UNPROVIDED);
        if (pred.eql($$temporallySubsumes_TypeType)) {
            final SubLObject arg1 = literal_arg1(literal, UNPROVIDED);
            final SubLObject arg2 = literal_arg2(literal, UNPROVIDED);
            return removal_modules_type_temporal_subsumption.why_bigger_time_typeP(arg1, arg2);
        }
        if (pred.eql($$temporallySubsumes_InsType)) {
            final SubLObject interval = literal_arg1(literal, UNPROVIDED);
            final SubLObject type = literal_arg2(literal, UNPROVIDED);
            return removal_modules_type_temporal_subsumption.why_time_interval_subsumes_typeP(interval, type);
        }
        if (pred.eql($$duration)) {
            return NIL;
        }
        if (NIL != sbhl_time_utilities.sbhl_time_predicate_p(pred)) {
            return sbhl_time_modules.hl_justify_sbhl_time(support);
        }
        return Errors.cerror($str202$Continue_anyway_, $str203$Unsupported_predicate___a__for__T, pred);
    }

    public static final SubLObject hl_verify_cyclify_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject asent = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt96);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt96);
            asent = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt96);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt96);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                return removal_modules_cyclifier.cyclify_verify_general(asent, mt);
            } else {
                cdestructuring_bind_error(datum, $list_alt96);
            }
        }
        return NIL;
    }

    public static SubLObject hl_verify_cyclify(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject asent = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list116);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list116);
        asent = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list116);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list116);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            return removal_modules_cyclifier.cyclify_verify_general(asent, mt);
        }
        cdestructuring_bind_error(support, $list116);
        return NIL;
    }

    public static final SubLObject hl_justify_cyclify_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject asent = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt96);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt96);
            asent = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt96);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt96);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                return removal_modules_cyclifier.cyclify_justify_general(asent, mt);
            } else {
                cdestructuring_bind_error(datum, $list_alt96);
            }
        }
        return NIL;
    }

    public static SubLObject hl_justify_cyclify(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject asent = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list116);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list116);
        asent = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list116);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list116);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            return removal_modules_cyclifier.cyclify_justify_general(asent, mt);
        }
        cdestructuring_bind_error(support, $list116);
        return NIL;
    }

    public static final SubLObject hl_verify_nc_parse_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject asent = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt96);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt96);
            asent = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt96);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt96);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                return removal_modules_ncr_constraints.nc_parse_verify_general(asent, mt);
            } else {
                cdestructuring_bind_error(datum, $list_alt96);
            }
        }
        return NIL;
    }

    public static SubLObject hl_verify_nc_parse(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject asent = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list116);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list116);
        asent = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list116);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list116);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            return removal_modules_ncr_constraints.nc_parse_verify_general(asent, mt);
        }
        cdestructuring_bind_error(support, $list116);
        return NIL;
    }

    public static final SubLObject hl_justify_nc_parse_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject asent = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt96);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt96);
            asent = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt96);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt96);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                return removal_modules_ncr_constraints.nc_parse_justify_general(asent, mt);
            } else {
                cdestructuring_bind_error(datum, $list_alt96);
            }
        }
        return NIL;
    }

    public static SubLObject hl_justify_nc_parse(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject asent = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list116);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list116);
        asent = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list116);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list116);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            return removal_modules_ncr_constraints.nc_parse_justify_general(asent, mt);
        }
        cdestructuring_bind_error(support, $list116);
        return NIL;
    }

    public static final SubLObject hl_verify_candidate_nc_test_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject asent = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt96);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt96);
            asent = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt96);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt96);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                return removal_modules_candidate_noun_compounds.candidate_nc_test_verify_general(asent, mt);
            } else {
                cdestructuring_bind_error(datum, $list_alt96);
            }
        }
        return NIL;
    }

    public static SubLObject hl_verify_candidate_nc_test(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject asent = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list116);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list116);
        asent = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list116);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list116);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            return removal_modules_candidate_noun_compounds.candidate_nc_test_verify_general(asent, mt);
        }
        cdestructuring_bind_error(support, $list116);
        return NIL;
    }

    public static final SubLObject hl_justify_candidate_nc_test_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject asent = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt96);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt96);
            asent = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt96);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt96);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                return removal_modules_candidate_noun_compounds.candidate_nc_test_justify_general(asent, mt);
            } else {
                cdestructuring_bind_error(datum, $list_alt96);
            }
        }
        return NIL;
    }

    public static SubLObject hl_justify_candidate_nc_test(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject asent = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list116);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list116);
        asent = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list116);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list116);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            return removal_modules_candidate_noun_compounds.candidate_nc_test_justify_general(asent, mt);
        }
        cdestructuring_bind_error(support, $list116);
        return NIL;
    }

    public static final SubLObject hl_verify_asserted_arg1_binary_preds_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject asent = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt96);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt96);
            asent = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt96);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt96);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                return removal_modules_asserted_arg1_binary_preds.asserted_arg1_binary_preds_verify_general(asent, mt);
            } else {
                cdestructuring_bind_error(datum, $list_alt96);
            }
        }
        return NIL;
    }

    public static SubLObject hl_verify_asserted_arg1_binary_preds(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject asent = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list116);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list116);
        asent = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list116);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list116);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            return removal_modules_asserted_arg1_binary_preds.asserted_arg1_binary_preds_verify_general(asent, mt);
        }
        cdestructuring_bind_error(support, $list116);
        return NIL;
    }

    public static final SubLObject hl_justify_asserted_arg1_binary_preds_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject asent = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt96);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt96);
            asent = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt96);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt96);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                return removal_modules_asserted_arg1_binary_preds.asserted_arg1_binary_preds_justify_general(asent, mt);
            } else {
                cdestructuring_bind_error(datum, $list_alt96);
            }
        }
        return NIL;
    }

    public static SubLObject hl_justify_asserted_arg1_binary_preds(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject asent = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list116);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list116);
        asent = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list116);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list116);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            return removal_modules_asserted_arg1_binary_preds.asserted_arg1_binary_preds_justify_general(asent, mt);
        }
        cdestructuring_bind_error(support, $list116);
        return NIL;
    }

    public static final SubLObject hl_verify_shop_effect_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject asent = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt96);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt96);
            asent = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt96);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt96);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
            } else {
                cdestructuring_bind_error(datum, $list_alt96);
            }
        }
        return NIL;
    }

    public static SubLObject hl_verify_shop_effect(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject asent = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list116);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list116);
        asent = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list116);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list116);
        tv = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(support, $list116);
        }
        return NIL;
    }

    public static final SubLObject hl_justify_shop_effect_alt(SubLObject support) {
        return NIL;
    }

    public static SubLObject hl_justify_shop_effect(final SubLObject support) {
        return NIL;
    }

    public static final SubLObject hl_verify_query_alt(SubLObject support) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = support;
                SubLObject current = datum;
                SubLObject hl_module = NIL;
                SubLObject asent = NIL;
                SubLObject mt = NIL;
                SubLObject tv = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt96);
                hl_module = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt96);
                asent = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt96);
                mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt96);
                tv = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject query_properties = $list_alt188;
                        SubLObject result = NIL;
                        thread.resetMultipleValues();
                        {
                            SubLObject right_sentence = czer_utilities.unwrap_if_ist(asent, mt);
                            SubLObject right_mt = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != el_implication_p(right_sentence)) {
                                query_properties = putf(query_properties, $kw189$CONDITIONAL_SENTENCE_, T);
                            }
                            result = inference_kernel.new_cyc_query(right_sentence, right_mt, query_properties);
                        }
                        return list_utilities.sublisp_boolean(result);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt96);
                }
            }
            return NIL;
        }
    }

    public static SubLObject hl_verify_query(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hl_module = NIL;
        SubLObject asent = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list116);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list116);
        asent = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list116);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list116);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject query_properties = copy_list($default_hl_verify_query_properties$.getDynamicValue(thread));
            SubLObject result = NIL;
            if (NIL != cycl_utilities.atomic_sentence_with_pred_p(asent, $$ist_Asserted)) {
                final SubLObject assertion = czer_meta.find_assertion_cycl(designated_sentence(asent), designated_mt(asent));
                if (NIL != assertion) {
                    result = list(assertion);
                }
            } else {
                thread.resetMultipleValues();
                final SubLObject right_sentence = czer_utilities.unwrap_if_ist(asent, mt, T);
                final SubLObject right_mt = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != el_implication_p(right_sentence)) {
                    query_properties = putf(query_properties, $kw220$CONDITIONAL_SENTENCE_, T);
                }
                result = inference_kernel.new_cyc_query(right_sentence, right_mt, query_properties);
            }
            return list_utilities.sublisp_boolean(result);
        }
        cdestructuring_bind_error(support, $list116);
        return NIL;
    }

    public static final SubLObject hl_justify_query_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject asent = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt96);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt96);
            asent = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt96);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt96);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                return com.cyc.cycjava.cycl.hl_supports.hl_justify_query_int(asent, mt, T);
            } else {
                cdestructuring_bind_error(datum, $list_alt96);
            }
        }
        return NIL;
    }

    public static SubLObject hl_justify_query(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject asent = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list116);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list116);
        asent = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list116);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list116);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            return hl_justify_query_int(asent, mt, T);
        }
        cdestructuring_bind_error(support, $list116);
        return NIL;
    }

    public static final SubLObject hl_justify_query_int_alt(SubLObject sentence, SubLObject mt, SubLObject return_one_answerP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject query_properties = $list_alt190;
                SubLObject result = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject right_sentence = czer_utilities.unwrap_if_ist(sentence, mt);
                    SubLObject right_mt = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != return_one_answerP) {
                        query_properties = putf(query_properties, $MAX_NUMBER, ONE_INTEGER);
                    }
                    if (NIL != el_implication_p(right_sentence)) {
                        query_properties = putf(query_properties, $kw189$CONDITIONAL_SENTENCE_, T);
                    }
                    result = inference_kernel.new_cyc_query(right_sentence, right_mt, query_properties);
                }
                return NIL != return_one_answerP ? ((SubLObject) (result.first())) : result;
            }
        }
    }

    public static SubLObject hl_justify_query_int(final SubLObject sentence, final SubLObject mt, final SubLObject return_one_answerP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject query_properties = copy_list($default_hl_justify_query_properties$.getDynamicValue(thread));
        if (NIL != cycl_utilities.atomic_sentence_with_pred_p(sentence, $$ist_Asserted)) {
            final SubLObject assertion = czer_meta.find_assertion_cycl(designated_sentence(sentence), designated_mt(sentence));
            if (NIL != assertion) {
                return list(assertion);
            }
        } else {
            thread.resetMultipleValues();
            final SubLObject right_sentence = czer_utilities.unwrap_if_ist(sentence, mt, T);
            final SubLObject right_mt = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != return_one_answerP) {
                query_properties = putf(query_properties, $MAX_NUMBER, ONE_INTEGER);
            }
            if (NIL != el_implication_p(right_sentence)) {
                query_properties = putf(query_properties, $kw220$CONDITIONAL_SENTENCE_, T);
            }
            final SubLObject _prev_bind_0 = $within_hl_justify_queryP$.currentBinding(thread);
            try {
                $within_hl_justify_queryP$.bind(T, thread);
                final SubLObject result = inference_kernel.new_cyc_query(right_sentence, right_mt, query_properties);
                return NIL != return_one_answerP ? result.first() : result;
            } finally {
                $within_hl_justify_queryP$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static final SubLObject hl_forward_mt_combos_of_query_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject asent = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt96);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt96);
            asent = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt96);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt96);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject query_supports_list = com.cyc.cycjava.cycl.hl_supports.hl_justify_query_int(asent, mt, NIL);
                    SubLObject mt_combos = NIL;
                    SubLObject cdolist_list_var = query_supports_list;
                    SubLObject query_supports = NIL;
                    for (query_supports = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , query_supports = cdolist_list_var.first()) {
                        {
                            SubLObject mt_support_combos = forward.compute_all_mt_and_support_combinations(query_supports);
                            SubLObject cdolist_list_var_104 = mt_support_combos;
                            SubLObject mt_support_combo = NIL;
                            for (mt_support_combo = cdolist_list_var_104.first(); NIL != cdolist_list_var_104; cdolist_list_var_104 = cdolist_list_var_104.rest() , mt_support_combo = cdolist_list_var_104.first()) {
                                {
                                    SubLObject datum_105 = mt_support_combo;
                                    SubLObject current_106 = datum_105;
                                    SubLObject combo_mts = NIL;
                                    SubLObject combo_supports = NIL;
                                    destructuring_bind_must_consp(current_106, datum_105, $list_alt192);
                                    combo_mts = current_106.first();
                                    current_106 = current_106.rest();
                                    destructuring_bind_must_consp(current_106, datum_105, $list_alt192);
                                    combo_supports = current_106.first();
                                    current_106 = current_106.rest();
                                    if (NIL == current_106) {
                                        {
                                            SubLObject cdolist_list_var_107 = combo_mts;
                                            SubLObject combo_mt = NIL;
                                            for (combo_mt = cdolist_list_var_107.first(); NIL != cdolist_list_var_107; cdolist_list_var_107 = cdolist_list_var_107.rest() , combo_mt = cdolist_list_var_107.first()) {
                                                mt_combos = cons(list(hl_module, asent, combo_mt, tv), mt_combos);
                                            }
                                        }
                                    } else {
                                        cdestructuring_bind_error(datum_105, $list_alt192);
                                    }
                                }
                            }
                        }
                    }
                    return mt_combos;
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt96);
            }
        }
        return NIL;
    }

    public static SubLObject hl_forward_mt_combos_of_query(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject asent = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list116);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list116);
        asent = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list116);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list116);
        tv = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(support, $list116);
            return NIL;
        }
        if (NIL != ist_sentence_p(asent, T)) {
            return list(list(hl_module, asent, $$BaseKB, tv));
        }
        SubLObject query_supports_list = hl_justify_query_int(asent, mt, NIL);
        SubLObject mt_combos = NIL;
        if (((NIL != list_utilities.singletonP(query_supports_list)) && (NIL != list_utilities.singletonP(list_utilities.only_one(query_supports_list)))) && support.equal(list_utilities.only_one(list_utilities.only_one(query_supports_list)))) {
            query_supports_list = list(list(arguments.make_hl_support($OPAQUE, asent, mt, tv)));
        }
        SubLObject cdolist_list_var = query_supports_list;
        SubLObject query_supports = NIL;
        query_supports = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$125;
            final SubLObject mt_support_combos = cdolist_list_var_$125 = forward.compute_all_mt_and_support_combinations(query_supports, UNPROVIDED);
            SubLObject mt_support_combo = NIL;
            mt_support_combo = cdolist_list_var_$125.first();
            while (NIL != cdolist_list_var_$125) {
                SubLObject current_$127;
                final SubLObject datum_$126 = current_$127 = mt_support_combo;
                SubLObject combo_mts = NIL;
                SubLObject combo_supports = NIL;
                destructuring_bind_must_consp(current_$127, datum_$126, $list223);
                combo_mts = current_$127.first();
                current_$127 = current_$127.rest();
                destructuring_bind_must_consp(current_$127, datum_$126, $list223);
                combo_supports = current_$127.first();
                current_$127 = current_$127.rest();
                if (NIL == current_$127) {
                    SubLObject cdolist_list_var_$126 = combo_mts;
                    SubLObject combo_mt = NIL;
                    combo_mt = cdolist_list_var_$126.first();
                    while (NIL != cdolist_list_var_$126) {
                        mt_combos = cons(list(hl_module, asent, combo_mt, tv), mt_combos);
                        cdolist_list_var_$126 = cdolist_list_var_$126.rest();
                        combo_mt = cdolist_list_var_$126.first();
                    } 
                } else {
                    cdestructuring_bind_error(datum_$126, $list223);
                }
                cdolist_list_var_$125 = cdolist_list_var_$125.rest();
                mt_support_combo = cdolist_list_var_$125.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            query_supports = cdolist_list_var.first();
        } 
        return mt_combos;
    }

    public static final SubLObject hl_verify_matrix_of_reaction_type_alt(SubLObject support) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject datum = support;
                SubLObject current = datum;
                SubLObject hl_module = NIL;
                SubLObject literal = NIL;
                SubLObject mt = NIL;
                SubLObject tv = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt23);
                hl_module = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt23);
                literal = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt23);
                mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt23);
                tv = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                {
                                    SubLObject reaction_type = literal_arg1(literal, UNPROVIDED);
                                    SubLObject given_matrix = literal_arg2(literal, UNPROVIDED);
                                    SubLObject generated_matrix = chemistry_utilities.generate_matrix(reaction_type);
                                    if ((NIL != generated_matrix) && generated_matrix.equal(given_matrix)) {
                                        ans = T;
                                    }
                                }
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt23);
                }
                return ans;
            }
        }
    }

    public static SubLObject hl_verify_matrix_of_reaction_type(final SubLObject support) {
        Errors.warn($str226$Halo_feature_not_supported__Suppo, support);
        return T;
    }

    public static final SubLObject hl_justify_matrix_of_reaction_type_alt(SubLObject support) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject justification = NIL;
                SubLObject datum = support;
                SubLObject current = datum;
                SubLObject hl_module = NIL;
                SubLObject literal = NIL;
                SubLObject mt = NIL;
                SubLObject tv = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt23);
                hl_module = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt23);
                literal = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt23);
                mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt23);
                tv = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject reaction_type = literal_arg1(literal, UNPROVIDED);
                        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                thread.resetMultipleValues();
                                {
                                    SubLObject missing_gafsP = chemistry_utilities.reaction_type_relevant_knowledge(reaction_type);
                                    SubLObject chemical_equation_unbalanced_gaf = thread.secondMultipleValue();
                                    SubLObject element_types_in_reaction_gaf = thread.thirdMultipleValue();
                                    SubLObject atomic_composition_of_reactant_gafs = thread.fourthMultipleValue();
                                    SubLObject atomic_composition_of_product_gafs = thread.fifthMultipleValue();
                                    SubLObject reactant_list = thread.sixthMultipleValue();
                                    SubLObject product_list = thread.seventhMultipleValue();
                                    SubLObject element_list = thread.eighthMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL == missing_gafsP) {
                                        justification = cons(chemical_equation_unbalanced_gaf, cons(element_types_in_reaction_gaf, append(atomic_composition_of_reactant_gafs, atomic_composition_of_product_gafs)));
                                    }
                                }
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt23);
                }
                return justification;
            }
        }
    }

    public static SubLObject hl_justify_matrix_of_reaction_type(final SubLObject support) {
        SubLObject justification = NIL;
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            justification = list(arguments.make_hl_support($OPAQUE, literal, mt, tv));
        } else {
            cdestructuring_bind_error(support, $list42);
        }
        return justification;
    }

    public static final SubLObject hl_forward_mt_combos_matrix_of_reaction_type_alt(SubLObject support) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mts = NIL;
                SubLObject datum = support;
                SubLObject current = datum;
                SubLObject hl_module = NIL;
                SubLObject literal = NIL;
                SubLObject mt = NIL;
                SubLObject tv = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt23);
                hl_module = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt23);
                literal = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt23);
                mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt23);
                tv = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject reaction_type = literal_arg1(literal, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                thread.resetMultipleValues();
                                {
                                    SubLObject missing_gafsP = chemistry_utilities.reaction_type_relevant_knowledge(reaction_type);
                                    SubLObject chemical_equation_unbalanced_gaf = thread.secondMultipleValue();
                                    SubLObject element_types_in_reaction_gaf = thread.thirdMultipleValue();
                                    SubLObject atomic_composition_of_reactant_gafs = thread.fourthMultipleValue();
                                    SubLObject atomic_composition_of_product_gafs = thread.fifthMultipleValue();
                                    SubLObject reactant_list = thread.sixthMultipleValue();
                                    SubLObject product_list = thread.seventhMultipleValue();
                                    SubLObject element_list = thread.eighthMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL == missing_gafsP) {
                                        {
                                            SubLObject all_gafs = cons(chemical_equation_unbalanced_gaf, cons(element_types_in_reaction_gaf, append(atomic_composition_of_reactant_gafs, atomic_composition_of_product_gafs)));
                                            SubLObject gaf_mts = Mapping.mapcar(symbol_function(ASSERTION_MT), all_gafs);
                                            mts = max_floor_mts(gaf_mts, UNPROVIDED, UNPROVIDED);
                                        }
                                    }
                                }
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt23);
                }
                return mts;
            }
        }
    }

    public static SubLObject hl_forward_mt_combos_matrix_of_reaction_type(final SubLObject support) {
        Errors.warn($str227$Halo_feature_not_supported__Suppo, support);
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(mt);
        }
        cdestructuring_bind_error(support, $list42);
        return NIL;
    }

    public static final SubLObject hl_verify_parse_tree_relation_alt(SubLObject support) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject verifiedP = NIL;
                SubLObject datum = support;
                SubLObject current = datum;
                SubLObject hl_module = NIL;
                SubLObject literal = NIL;
                SubLObject mt = NIL;
                SubLObject tv = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt23);
                hl_module = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt23);
                literal = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt23);
                mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt23);
                tv = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                verifiedP = list_utilities.sublisp_boolean(removal_modules_parse_trees.removal_parse_tree_relation_answer_list(literal));
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt23);
                }
                return verifiedP;
            }
        }
    }

    public static SubLObject hl_verify_parse_tree_relation(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject verifiedP = NIL;
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                verifiedP = list_utilities.sublisp_boolean(removal_modules_parse_trees.removal_parse_tree_relation_answer_list(literal));
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        } else {
            cdestructuring_bind_error(support, $list42);
        }
        return verifiedP;
    }

    public static final SubLObject hl_justify_parse_tree_relation_alt(SubLObject support) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject justification = NIL;
                SubLObject datum = support;
                SubLObject current = datum;
                SubLObject hl_module = NIL;
                SubLObject literal = NIL;
                SubLObject mt = NIL;
                SubLObject tv = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt23);
                hl_module = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt23);
                literal = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt23);
                mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt23);
                tv = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                justification = removal_modules_parse_trees.parse_tree_relation_supports(literal);
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt23);
                }
                return justification;
            }
        }
    }

    public static SubLObject hl_justify_parse_tree_relation(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject justification = NIL;
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list42);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list42);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list42);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                justification = removal_modules_parse_trees.parse_tree_relation_supports(literal);
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        } else {
            cdestructuring_bind_error(support, $list42);
        }
        return justification;
    }

    public static final SubLObject declare_hl_supports_file_alt() {
        declareFunction("hl_predicate_p", "HL-PREDICATE-P", 1, 0, false);
        declareFunction("non_hl_predicate_p", "NON-HL-PREDICATE-P", 1, 0, false);
        new com.cyc.cycjava.cycl.hl_supports.$non_hl_predicate_p$UnaryFunction();
        declareFunction("declare_hl_predicate", "DECLARE-HL-PREDICATE", 1, 0, false);
        declareFunction("undeclare_hl_predicate", "UNDECLARE-HL-PREDICATE", 1, 0, false);
        declareFunction("hl_support_modules", "HL-SUPPORT-MODULES", 0, 0, false);
        declareFunction("hl_support_module_p", "HL-SUPPORT-MODULE-P", 1, 0, false);
        declareFunction("setup_hl_support_module", "SETUP-HL-SUPPORT-MODULE", 2, 0, false);
        declareFunction("hl_support_module_verify_func", "HL-SUPPORT-MODULE-VERIFY-FUNC", 1, 0, false);
        declareFunction("hl_support_module_justify_func", "HL-SUPPORT-MODULE-JUSTIFY-FUNC", 1, 0, false);
        declareFunction("hl_support_module_validate_func", "HL-SUPPORT-MODULE-VALIDATE-FUNC", 1, 0, false);
        declareFunction("hl_support_module_forward_mt_combos_func", "HL-SUPPORT-MODULE-FORWARD-MT-COMBOS-FUNC", 1, 0, false);
        declareFunction("hl_verify", "HL-VERIFY", 1, 0, false);
        declareFunction("hl_justify", "HL-JUSTIFY", 1, 0, false);
        declareFunction("hl_justify_expanded", "HL-JUSTIFY-EXPANDED", 1, 0, false);
        declareFunction("hl_justification_expand", "HL-JUSTIFICATION-EXPAND", 1, 0, false);
        declareFunction("hl_support_justify", "HL-SUPPORT-JUSTIFY", 1, 0, false);
        declareFunction("hl_trivial_justification", "HL-TRIVIAL-JUSTIFICATION", 1, 0, false);
        declareFunction("hl_validate", "HL-VALIDATE", 2, 0, false);
        declareFunction("hl_validate_wff_violations", "HL-VALIDATE-WFF-VIOLATIONS", 2, 0, false);
        declareFunction("hl_forward_mt_combos", "HL-FORWARD-MT-COMBOS", 1, 0, false);
        declareFunction("find_assertion_or_make_support", "FIND-ASSERTION-OR-MAKE-SUPPORT", 1, 1, false);
        declareFunction("max_floor_mts_of_justification", "MAX-FLOOR-MTS-OF-JUSTIFICATION", 1, 0, false);
        declareFunction("hl_verify_opaque", "HL-VERIFY-OPAQUE", 1, 0, false);
        declareFunction("opaque_hl_support_p", "OPAQUE-HL-SUPPORT-P", 1, 0, false);
        declareFunction("hl_verify_bookkeeping", "HL-VERIFY-BOOKKEEPING", 1, 0, false);
        declareFunction("hl_justify_bookkeeping", "HL-JUSTIFY-BOOKKEEPING", 1, 0, false);
        declareFunction("clear_cached_find_assertion_cycl", "CLEAR-CACHED-FIND-ASSERTION-CYCL", 0, 0, false);
        declareFunction("remove_cached_find_assertion_cycl", "REMOVE-CACHED-FIND-ASSERTION-CYCL", 1, 0, false);
        declareFunction("cached_find_assertion_cycl_internal", "CACHED-FIND-ASSERTION-CYCL-INTERNAL", 1, 0, false);
        declareFunction("cached_find_assertion_cycl", "CACHED-FIND-ASSERTION-CYCL", 1, 0, false);
        declareFunction("hl_forward_mt_combos_bookkeeping", "HL-FORWARD-MT-COMBOS-BOOKKEEPING", 1, 0, false);
        declareFunction("hl_verify_defn", "HL-VERIFY-DEFN", 1, 0, false);
        declareFunction("hl_justify_defn", "HL-JUSTIFY-DEFN", 1, 0, false);
        declareFunction("hl_forward_mt_combos_defn", "HL-FORWARD-MT-COMBOS-DEFN", 1, 0, false);
        declareFunction("hl_verify_elementof", "HL-VERIFY-ELEMENTOF", 1, 0, false);
        declareFunction("hl_forward_mt_combos_elementof", "HL-FORWARD-MT-COMBOS-ELEMENTOF", 1, 0, false);
        declareFunction("hl_verify_subsetof", "HL-VERIFY-SUBSETOF", 1, 0, false);
        declareFunction("hl_forward_mt_combos_subsetof", "HL-FORWARD-MT-COMBOS-SUBSETOF", 1, 0, false);
        declareFunction("hl_verify_sibling_disjoint", "HL-VERIFY-SIBLING-DISJOINT", 1, 0, false);
        declareFunction("hl_justify_sibling_disjoint", "HL-JUSTIFY-SIBLING-DISJOINT", 1, 0, false);
        declareFunction("hl_forward_mt_combos_sibling_disjoint", "HL-FORWARD-MT-COMBOS-SIBLING-DISJOINT", 1, 0, false);
        declareFunction("hl_verify_equality", "HL-VERIFY-EQUALITY", 1, 0, false);
        declareFunction("hl_forward_mt_combos_equality", "HL-FORWARD-MT-COMBOS-EQUALITY", 1, 0, false);
        declareFunction("hl_validate_equality", "HL-VALIDATE-EQUALITY", 2, 0, false);
        declareFunction("hl_validate_default", "HL-VALIDATE-DEFAULT", 2, 0, false);
        declareFunction("hl_validate_literal_minimal", "HL-VALIDATE-LITERAL-MINIMAL", 2, 0, false);
        declareFunction("hl_justify_equality", "HL-JUSTIFY-EQUALITY", 1, 0, false);
        declareFunction("hl_verify_eval", "HL-VERIFY-EVAL", 1, 0, false);
        declareFunction("hl_justify_eval", "HL-JUSTIFY-EVAL", 1, 0, false);
        new com.cyc.cycjava.cycl.hl_supports.$hl_justify_eval$UnaryFunction();
        declareFunction("hl_verify_reflexive", "HL-VERIFY-REFLEXIVE", 1, 0, false);
        declareFunction("hl_justify_reflexive", "HL-JUSTIFY-REFLEXIVE", 1, 0, false);
        declareFunction("hl_forward_mt_combos_reflexive", "HL-FORWARD-MT-COMBOS-REFLEXIVE", 1, 0, false);
        declareFunction("inference_semantically_valid_irreflexive_literalP", "INFERENCE-SEMANTICALLY-VALID-IRREFLEXIVE-LITERAL?", 1, 1, false);
        declareFunction("max_floor_mts_where_reflexive", "MAX-FLOOR-MTS-WHERE-REFLEXIVE", 1, 1, false);
        declareFunction("max_floor_mts_where_arg_constraints_met_internal", "MAX-FLOOR-MTS-WHERE-ARG-CONSTRAINTS-MET-INTERNAL", 2, 1, false);
        declareFunction("max_floor_mts_where_arg_constraints_met", "MAX-FLOOR-MTS-WHERE-ARG-CONSTRAINTS-MET", 2, 1, false);
        declareFunction("hl_validate_reflexive", "HL-VALIDATE-REFLEXIVE", 2, 0, false);
        declareFunction("hl_verify_reflexive_on", "HL-VERIFY-REFLEXIVE-ON", 1, 0, false);
        declareFunction("hl_justify_reflexive_on", "HL-JUSTIFY-REFLEXIVE-ON", 1, 0, false);
        declareFunction("hl_forward_mt_combos_reflexive_on", "HL-FORWARD-MT-COMBOS-REFLEXIVE-ON", 1, 0, false);
        declareFunction("max_floor_mts_where_reflexive_on", "MAX-FLOOR-MTS-WHERE-REFLEXIVE-ON", 1, 0, false);
        declareFunction("hl_verify_transitivity", "HL-VERIFY-TRANSITIVITY", 1, 0, false);
        declareFunction("hl_forward_mt_combos_transitivity", "HL-FORWARD-MT-COMBOS-TRANSITIVITY", 1, 0, false);
        declareFunction("hl_justify_transitivity", "HL-JUSTIFY-TRANSITIVITY", 1, 0, false);
        declareFunction("hl_verify_contextual_transitivity", "HL-VERIFY-CONTEXTUAL-TRANSITIVITY", 1, 0, false);
        declareFunction("hl_justify_contextual_transitivity", "HL-JUSTIFY-CONTEXTUAL-TRANSITIVITY", 1, 0, false);
        declareFunction("max_floor_mts_of_transitivity_paths", "MAX-FLOOR-MTS-OF-TRANSITIVITY-PATHS", 3, 1, false);
        declareFunction("hl_verify_tva", "HL-VERIFY-TVA", 1, 0, false);
        declareFunction("hl_justify_tva", "HL-JUSTIFY-TVA", 1, 0, false);
        declareFunction("hl_forward_mt_combos_tva", "HL-FORWARD-MT-COMBOS-TVA", 1, 0, false);
        declareFunction("hl_verify_rtv", "HL-VERIFY-RTV", 1, 0, false);
        declareFunction("hl_justify_rtv", "HL-JUSTIFY-RTV", 1, 0, false);
        declareFunction("hl_forward_mt_combos_rtv", "HL-FORWARD-MT-COMBOS-RTV", 1, 0, false);
        declareFunction("hl_verify_minimize", "HL-VERIFY-MINIMIZE", 1, 0, false);
        declareFunction("hl_verify_consistent", "HL-VERIFY-CONSISTENT", 1, 0, false);
        declareFunction("hl_justify_consistent", "HL-JUSTIFY-CONSISTENT", 1, 0, false);
        declareFunction("hl_verify_conceptually_related", "HL-VERIFY-CONCEPTUALLY-RELATED", 1, 0, false);
        declareFunction("hl_justify_conceptually_related", "HL-JUSTIFY-CONCEPTUALLY-RELATED", 1, 0, false);
        declareFunction("hl_forward_mt_combos_conceptually_related", "HL-FORWARD-MT-COMBOS-CONCEPTUALLY-RELATED", 1, 0, false);
        declareFunction("hl_verify_admit", "HL-VERIFY-ADMIT", 1, 0, false);
        declareFunction("hl_forward_mt_combos_admit", "HL-FORWARD-MT-COMBOS-ADMIT", 1, 0, false);
        declareFunction("hl_justify_admit", "HL-JUSTIFY-ADMIT", 1, 0, false);
        declareFunction("hl_verify_admitted_argument", "HL-VERIFY-ADMITTED-ARGUMENT", 1, 0, false);
        declareFunction("hl_verify_admitted_sentence", "HL-VERIFY-ADMITTED-SENTENCE", 1, 0, false);
        declareFunction("hl_verify_admitted_nat", "HL-VERIFY-ADMITTED-NAT", 1, 0, false);
        declareFunction("hl_forward_mt_combos_admitted_argument", "HL-FORWARD-MT-COMBOS-ADMITTED-ARGUMENT", 1, 0, false);
        declareFunction("hl_forward_mt_combos_admitted_sentence", "HL-FORWARD-MT-COMBOS-ADMITTED-SENTENCE", 1, 0, false);
        declareFunction("hl_forward_mt_combos_admitted_nat", "HL-FORWARD-MT-COMBOS-ADMITTED-NAT", 1, 0, false);
        declareFunction("hl_verify_sksi", "HL-VERIFY-SKSI", 1, 0, false);
        declareFunction("hl_justify_sksi", "HL-JUSTIFY-SKSI", 1, 0, false);
        declareFunction("hl_forward_mt_combos_sksi", "HL-FORWARD-MT-COMBOS-SKSI", 1, 0, false);
        declareFunction("hl_verify_csql", "HL-VERIFY-CSQL", 1, 0, false);
        declareFunction("hl_justify_csql", "HL-JUSTIFY-CSQL", 1, 0, false);
        declareFunction("hl_forward_mt_combos_csql", "HL-FORWARD-MT-COMBOS-CSQL", 1, 0, false);
        declareFunction("hl_verify_source_schema_object_fn", "HL-VERIFY-SOURCE-SCHEMA-OBJECT-FN", 1, 0, false);
        declareFunction("hl_justify_source_schema_object_fn", "HL-JUSTIFY-SOURCE-SCHEMA-OBJECT-FN", 1, 0, false);
        declareFunction("hl_forward_mt_combos_source_schema_object_fn", "HL-FORWARD-MT-COMBOS-SOURCE-SCHEMA-OBJECT-FN", 1, 0, false);
        declareFunction("hl_justify_reformulate", "HL-JUSTIFY-REFORMULATE", 1, 0, false);
        declareFunction("hl_justify_assertion", "HL-JUSTIFY-ASSERTION", 1, 0, false);
        declareFunction("hl_verify_assertion", "HL-VERIFY-ASSERTION", 1, 0, false);
        declareFunction("hl_forward_mt_combos_assertion", "HL-FORWARD-MT-COMBOS-ASSERTION", 1, 0, false);
        declareFunction("hl_verify_gis", "HL-VERIFY-GIS", 1, 0, false);
        declareFunction("hl_justify_gis", "HL-JUSTIFY-GIS", 1, 0, false);
        declareFunction("hl_forward_mt_combos_gis", "HL-FORWARD-MT-COMBOS-GIS", 1, 0, false);
        declareMacro("possibly_with_negated_truth", "POSSIBLY-WITH-NEGATED-TRUTH");
        declareFunction("hl_justify_sbhl", "HL-JUSTIFY-SBHL", 1, 0, false);
        declareFunction("hl_verify_isa", "HL-VERIFY-ISA", 1, 0, false);
        declareFunction("hl_justify_isa", "HL-JUSTIFY-ISA", 1, 0, false);
        declareFunction("hl_forward_mt_combos_isa", "HL-FORWARD-MT-COMBOS-ISA", 1, 0, false);
        declareFunction("justify_not_type_by_extent_known", "JUSTIFY-NOT-TYPE-BY-EXTENT-KNOWN", 3, 0, false);
        declareFunction("inference_max_floor_mts_of_isa_paths", "INFERENCE-MAX-FLOOR-MTS-OF-ISA-PATHS", 2, 0, false);
        declareFunction("inference_max_floor_mts_of_quoted_isa_paths", "INFERENCE-MAX-FLOOR-MTS-OF-QUOTED-ISA-PATHS", 2, 0, false);
        declareFunction("gaf_axioms", "GAF-AXIOMS", 2, 0, false);
        declareFunction("gaf_axioms_genl_mts", "GAF-AXIOMS-GENL-MTS", 2, 0, false);
        declareFunction("symmetric_hl_predP", "SYMMETRIC-HL-PRED?", 1, 0, false);
        declareFunction("hl_verify_genls", "HL-VERIFY-GENLS", 1, 0, false);
        declareFunction("hl_justify_genls", "HL-JUSTIFY-GENLS", 1, 0, false);
        declareFunction("hl_forward_mt_combos_genls", "HL-FORWARD-MT-COMBOS-GENLS", 1, 0, false);
        declareFunction("inference_max_floor_mts_of_genls_paths", "INFERENCE-MAX-FLOOR-MTS-OF-GENLS-PATHS", 2, 0, false);
        declareFunction("hl_verify_disjointwith", "HL-VERIFY-DISJOINTWITH", 1, 0, false);
        declareFunction("hl_justify_disjointwith", "HL-JUSTIFY-DISJOINTWITH", 1, 0, false);
        declareFunction("hl_forward_mt_combos_disjointwith", "HL-FORWARD-MT-COMBOS-DISJOINTWITH", 1, 0, false);
        declareFunction("hl_verify_genlmt", "HL-VERIFY-GENLMT", 1, 0, false);
        declareFunction("hl_justify_genlmt", "HL-JUSTIFY-GENLMT", 1, 0, false);
        declareFunction("hl_forward_mt_combos_genlmt", "HL-FORWARD-MT-COMBOS-GENLMT", 1, 0, false);
        declareFunction("hl_verify_genlpreds", "HL-VERIFY-GENLPREDS", 1, 0, false);
        declareFunction("hl_justify_genlpreds", "HL-JUSTIFY-GENLPREDS", 1, 0, false);
        declareFunction("hl_forward_mt_combos_genlpreds", "HL-FORWARD-MT-COMBOS-GENLPREDS", 1, 0, false);
        declareFunction("hl_verify_negationpreds", "HL-VERIFY-NEGATIONPREDS", 1, 0, false);
        declareFunction("hl_justify_negationpreds", "HL-JUSTIFY-NEGATIONPREDS", 1, 0, false);
        declareFunction("hl_forward_mt_combos_negationpreds", "HL-FORWARD-MT-COMBOS-NEGATIONPREDS", 1, 0, false);
        declareFunction("hl_verify_time_sentence", "HL-VERIFY-TIME-SENTENCE", 1, 0, false);
        declareFunction("hl_true_mts_for_time_sentence", "HL-TRUE-MTS-FOR-TIME-SENTENCE", 1, 0, false);
        declareFunction("hl_validate_time", "HL-VALIDATE-TIME", 2, 0, false);
        declareFunction("hl_justify_time_sentence", "HL-JUSTIFY-TIME-SENTENCE", 1, 0, false);
        declareFunction("hl_verify_cyclify", "HL-VERIFY-CYCLIFY", 1, 0, false);
        declareFunction("hl_justify_cyclify", "HL-JUSTIFY-CYCLIFY", 1, 0, false);
        declareFunction("hl_verify_nc_parse", "HL-VERIFY-NC-PARSE", 1, 0, false);
        declareFunction("hl_justify_nc_parse", "HL-JUSTIFY-NC-PARSE", 1, 0, false);
        declareFunction("hl_verify_candidate_nc_test", "HL-VERIFY-CANDIDATE-NC-TEST", 1, 0, false);
        declareFunction("hl_justify_candidate_nc_test", "HL-JUSTIFY-CANDIDATE-NC-TEST", 1, 0, false);
        declareFunction("hl_verify_asserted_arg1_binary_preds", "HL-VERIFY-ASSERTED-ARG1-BINARY-PREDS", 1, 0, false);
        declareFunction("hl_justify_asserted_arg1_binary_preds", "HL-JUSTIFY-ASSERTED-ARG1-BINARY-PREDS", 1, 0, false);
        declareFunction("hl_verify_shop_effect", "HL-VERIFY-SHOP-EFFECT", 1, 0, false);
        declareFunction("hl_justify_shop_effect", "HL-JUSTIFY-SHOP-EFFECT", 1, 0, false);
        declareFunction("hl_verify_query", "HL-VERIFY-QUERY", 1, 0, false);
        declareFunction("hl_justify_query", "HL-JUSTIFY-QUERY", 1, 0, false);
        declareFunction("hl_justify_query_int", "HL-JUSTIFY-QUERY-INT", 3, 0, false);
        declareFunction("hl_forward_mt_combos_of_query", "HL-FORWARD-MT-COMBOS-OF-QUERY", 1, 0, false);
        declareFunction("hl_verify_matrix_of_reaction_type", "HL-VERIFY-MATRIX-OF-REACTION-TYPE", 1, 0, false);
        declareFunction("hl_justify_matrix_of_reaction_type", "HL-JUSTIFY-MATRIX-OF-REACTION-TYPE", 1, 0, false);
        declareFunction("hl_forward_mt_combos_matrix_of_reaction_type", "HL-FORWARD-MT-COMBOS-MATRIX-OF-REACTION-TYPE", 1, 0, false);
        declareFunction("hl_verify_parse_tree_relation", "HL-VERIFY-PARSE-TREE-RELATION", 1, 0, false);
        declareFunction("hl_justify_parse_tree_relation", "HL-JUSTIFY-PARSE-TREE-RELATION", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_hl_supports_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("hl_predicate_p", "HL-PREDICATE-P", 1, 0, false);
            declareFunction("non_hl_predicate_p", "NON-HL-PREDICATE-P", 1, 0, false);
            new hl_supports.$non_hl_predicate_p$UnaryFunction();
            declareFunction("declare_hl_predicate", "DECLARE-HL-PREDICATE", 1, 0, false);
            declareFunction("undeclare_hl_predicate", "UNDECLARE-HL-PREDICATE", 1, 0, false);
            declareFunction("hl_support_modules", "HL-SUPPORT-MODULES", 0, 0, false);
            declareFunction("hl_support_module_p", "HL-SUPPORT-MODULE-P", 1, 0, false);
            declareFunction("setup_hl_support_module", "SETUP-HL-SUPPORT-MODULE", 2, 0, false);
            declareFunction("hl_support_module_verify_func", "HL-SUPPORT-MODULE-VERIFY-FUNC", 1, 0, false);
            declareFunction("hl_support_module_justify_func", "HL-SUPPORT-MODULE-JUSTIFY-FUNC", 1, 0, false);
            declareFunction("hl_support_module_validate_func", "HL-SUPPORT-MODULE-VALIDATE-FUNC", 1, 0, false);
            declareFunction("hl_support_module_forward_mt_combos_func", "HL-SUPPORT-MODULE-FORWARD-MT-COMBOS-FUNC", 1, 0, false);
            declareFunction("hl_verify", "HL-VERIFY", 1, 0, false);
            declareFunction("hl_justify", "HL-JUSTIFY", 1, 0, false);
            declareFunction("hl_justify_expanded", "HL-JUSTIFY-EXPANDED", 1, 0, false);
            declareFunction("hl_justification_expand", "HL-JUSTIFICATION-EXPAND", 1, 0, false);
            declareFunction("hl_support_justify", "HL-SUPPORT-JUSTIFY", 1, 0, false);
            declareFunction("hl_trivial_justification", "HL-TRIVIAL-JUSTIFICATION", 1, 0, false);
            declareFunction("categorize_justification", "CATEGORIZE-JUSTIFICATION", 1, 0, false);
            declareFunction("supports_with_embedded_assertions", "SUPPORTS-WITH-EMBEDDED-ASSERTIONS", 1, 0, false);
            declareFunction("supports_embedded_assertions", "SUPPORTS-EMBEDDED-ASSERTIONS", 1, 0, false);
            declareFunction("support_embedded_assertions", "SUPPORT-EMBEDDED-ASSERTIONS", 1, 0, false);
            declareFunction("hl_validate", "HL-VALIDATE", 2, 0, false);
            declareFunction("hl_validate_wff_violations", "HL-VALIDATE-WFF-VIOLATIONS", 2, 0, false);
            declareFunction("hl_forward_mt_combos", "HL-FORWARD-MT-COMBOS", 1, 0, false);
            declareFunction("hl_forward_mt_combos_from_justification", "HL-FORWARD-MT-COMBOS-FROM-JUSTIFICATION", 1, 0, false);
            declareFunction("find_assertion_or_make_support", "FIND-ASSERTION-OR-MAKE-SUPPORT", 1, 1, false);
            declareFunction("max_floor_mts_of_justification", "MAX-FLOOR-MTS-OF-JUSTIFICATION", 1, 0, false);
            declareFunction("hl_justification_complete_backward_theory", "HL-JUSTIFICATION-COMPLETE-BACKWARD-THEORY", 1, 3, false);
            declareFunction("assertion_all_supporting_asserted_gafs", "ASSERTION-ALL-SUPPORTING-ASSERTED-GAFS", 1, 0, false);
            declareFunction("hl_verify_opaque", "HL-VERIFY-OPAQUE", 1, 0, false);
            declareFunction("opaque_hl_support_p", "OPAQUE-HL-SUPPORT-P", 1, 0, false);
            declareFunction("hl_verify_bookkeeping", "HL-VERIFY-BOOKKEEPING", 1, 0, false);
            declareFunction("hl_justify_bookkeeping", "HL-JUSTIFY-BOOKKEEPING", 1, 0, false);
            declareFunction("clear_cached_find_assertion_cycl", "CLEAR-CACHED-FIND-ASSERTION-CYCL", 0, 0, false);
            declareFunction("remove_cached_find_assertion_cycl", "REMOVE-CACHED-FIND-ASSERTION-CYCL", 1, 0, false);
            declareFunction("cached_find_assertion_cycl_internal", "CACHED-FIND-ASSERTION-CYCL-INTERNAL", 1, 0, false);
            declareFunction("cached_find_assertion_cycl", "CACHED-FIND-ASSERTION-CYCL", 1, 0, false);
            declareFunction("hl_forward_mt_combos_bookkeeping", "HL-FORWARD-MT-COMBOS-BOOKKEEPING", 1, 0, false);
            declareFunction("hl_verify_defn", "HL-VERIFY-DEFN", 1, 0, false);
            declareFunction("hl_justify_defn", "HL-JUSTIFY-DEFN", 1, 0, false);
            declareFunction("hl_forward_mt_combos_defn", "HL-FORWARD-MT-COMBOS-DEFN", 1, 0, false);
            declareFunction("hl_verify_elementof", "HL-VERIFY-ELEMENTOF", 1, 0, false);
            declareFunction("hl_forward_mt_combos_elementof", "HL-FORWARD-MT-COMBOS-ELEMENTOF", 1, 0, false);
            declareFunction("hl_verify_subsetof", "HL-VERIFY-SUBSETOF", 1, 0, false);
            declareFunction("hl_forward_mt_combos_subsetof", "HL-FORWARD-MT-COMBOS-SUBSETOF", 1, 0, false);
            declareFunction("hl_verify_sibling_disjoint", "HL-VERIFY-SIBLING-DISJOINT", 1, 0, false);
            declareFunction("hl_justify_sibling_disjoint", "HL-JUSTIFY-SIBLING-DISJOINT", 1, 0, false);
            declareFunction("hl_forward_mt_combos_sibling_disjoint", "HL-FORWARD-MT-COMBOS-SIBLING-DISJOINT", 1, 0, false);
            declareFunction("hl_verify_equality", "HL-VERIFY-EQUALITY", 1, 0, false);
            declareFunction("hl_forward_mt_combos_equality", "HL-FORWARD-MT-COMBOS-EQUALITY", 1, 0, false);
            declareFunction("hl_validate_equality", "HL-VALIDATE-EQUALITY", 2, 0, false);
            declareFunction("hl_validate_default", "HL-VALIDATE-DEFAULT", 2, 0, false);
            declareFunction("hl_validate_literal_minimal", "HL-VALIDATE-LITERAL-MINIMAL", 2, 0, false);
            declareFunction("hl_justify_equality", "HL-JUSTIFY-EQUALITY", 1, 0, false);
            declareFunction("hl_verify_eval", "HL-VERIFY-EVAL", 1, 0, false);
            declareFunction("hl_justify_eval", "HL-JUSTIFY-EVAL", 1, 0, false);
            new hl_supports.$hl_justify_eval$UnaryFunction();
            declareFunction("hl_verify_reflexive", "HL-VERIFY-REFLEXIVE", 1, 0, false);
            declareFunction("hl_justify_reflexive", "HL-JUSTIFY-REFLEXIVE", 1, 0, false);
            declareFunction("hl_forward_mt_combos_reflexive", "HL-FORWARD-MT-COMBOS-REFLEXIVE", 1, 0, false);
            declareFunction("inference_semantically_valid_irreflexive_literalP", "INFERENCE-SEMANTICALLY-VALID-IRREFLEXIVE-LITERAL?", 1, 1, false);
            declareFunction("max_floor_mts_where_reflexive", "MAX-FLOOR-MTS-WHERE-REFLEXIVE", 1, 1, false);
            declareFunction("max_floor_mts_where_arg_constraints_met_internal", "MAX-FLOOR-MTS-WHERE-ARG-CONSTRAINTS-MET-INTERNAL", 2, 1, false);
            declareFunction("max_floor_mts_where_arg_constraints_met", "MAX-FLOOR-MTS-WHERE-ARG-CONSTRAINTS-MET", 2, 1, false);
            declareFunction("hl_validate_reflexive", "HL-VALIDATE-REFLEXIVE", 2, 0, false);
            declareFunction("hl_verify_reflexive_on", "HL-VERIFY-REFLEXIVE-ON", 1, 0, false);
            declareFunction("hl_justify_reflexive_on", "HL-JUSTIFY-REFLEXIVE-ON", 1, 0, false);
            declareFunction("hl_forward_mt_combos_reflexive_on", "HL-FORWARD-MT-COMBOS-REFLEXIVE-ON", 1, 0, false);
            declareFunction("max_floor_mts_where_reflexive_on", "MAX-FLOOR-MTS-WHERE-REFLEXIVE-ON", 1, 0, false);
            declareFunction("transitivity_support_p", "TRANSITIVITY-SUPPORT-P", 1, 0, false);
            declareFunction("hl_verify_transitivity", "HL-VERIFY-TRANSITIVITY", 1, 0, false);
            declareFunction("hl_forward_mt_combos_transitivity", "HL-FORWARD-MT-COMBOS-TRANSITIVITY", 1, 0, false);
            declareFunction("hl_justify_transitivity", "HL-JUSTIFY-TRANSITIVITY", 1, 0, false);
            declareFunction("hl_verify_contextual_transitivity", "HL-VERIFY-CONTEXTUAL-TRANSITIVITY", 1, 0, false);
            declareFunction("hl_justify_contextual_transitivity", "HL-JUSTIFY-CONTEXTUAL-TRANSITIVITY", 1, 0, false);
            declareFunction("max_floor_mts_of_transitivity_paths", "MAX-FLOOR-MTS-OF-TRANSITIVITY-PATHS", 3, 1, false);
            declareFunction("hl_verify_tva", "HL-VERIFY-TVA", 1, 0, false);
            declareFunction("hl_justify_tva", "HL-JUSTIFY-TVA", 1, 0, false);
            declareFunction("hl_forward_mt_combos_tva", "HL-FORWARD-MT-COMBOS-TVA", 1, 0, false);
            declareFunction("hl_verify_rtv", "HL-VERIFY-RTV", 1, 0, false);
            declareFunction("hl_justify_rtv", "HL-JUSTIFY-RTV", 1, 0, false);
            declareFunction("hl_forward_mt_combos_rtv", "HL-FORWARD-MT-COMBOS-RTV", 1, 0, false);
            declareFunction("hl_verify_minimize", "HL-VERIFY-MINIMIZE", 1, 0, false);
            declareFunction("hl_verify_consistent", "HL-VERIFY-CONSISTENT", 1, 0, false);
            declareFunction("hl_justify_consistent", "HL-JUSTIFY-CONSISTENT", 1, 0, false);
            declareFunction("hl_verify_conceptually_related", "HL-VERIFY-CONCEPTUALLY-RELATED", 1, 0, false);
            declareFunction("hl_justify_conceptually_related", "HL-JUSTIFY-CONCEPTUALLY-RELATED", 1, 0, false);
            declareFunction("hl_forward_mt_combos_conceptually_related", "HL-FORWARD-MT-COMBOS-CONCEPTUALLY-RELATED", 1, 0, false);
            declareFunction("hl_verify_admit", "HL-VERIFY-ADMIT", 1, 0, false);
            declareFunction("hl_forward_mt_combos_admit", "HL-FORWARD-MT-COMBOS-ADMIT", 1, 0, false);
            declareFunction("hl_justify_admit", "HL-JUSTIFY-ADMIT", 1, 0, false);
            declareFunction("hl_verify_admitted_argument", "HL-VERIFY-ADMITTED-ARGUMENT", 1, 0, false);
            declareFunction("hl_verify_admitted_sentence", "HL-VERIFY-ADMITTED-SENTENCE", 1, 0, false);
            declareFunction("hl_verify_admitted_nat", "HL-VERIFY-ADMITTED-NAT", 1, 0, false);
            declareFunction("hl_forward_mt_combos_admitted_argument", "HL-FORWARD-MT-COMBOS-ADMITTED-ARGUMENT", 1, 0, false);
            declareFunction("hl_forward_mt_combos_admitted_sentence", "HL-FORWARD-MT-COMBOS-ADMITTED-SENTENCE", 1, 0, false);
            declareFunction("hl_forward_mt_combos_admitted_nat", "HL-FORWARD-MT-COMBOS-ADMITTED-NAT", 1, 0, false);
            declareFunction("hl_justify_admitted_argument", "HL-JUSTIFY-ADMITTED-ARGUMENT", 1, 0, false);
            declareFunction("hl_justify_admitted_sentence", "HL-JUSTIFY-ADMITTED-SENTENCE", 1, 0, false);
            declareFunction("hl_justify_admitted_nat", "HL-JUSTIFY-ADMITTED-NAT", 1, 0, false);
            declareFunction("hl_verify_sksi", "HL-VERIFY-SKSI", 1, 0, false);
            declareFunction("hl_justify_sksi", "HL-JUSTIFY-SKSI", 1, 0, false);
            declareFunction("hl_forward_mt_combos_sksi", "HL-FORWARD-MT-COMBOS-SKSI", 1, 0, false);
            declareFunction("hl_verify_csql", "HL-VERIFY-CSQL", 1, 0, false);
            declareFunction("hl_justify_csql", "HL-JUSTIFY-CSQL", 1, 0, false);
            declareFunction("hl_forward_mt_combos_csql", "HL-FORWARD-MT-COMBOS-CSQL", 1, 0, false);
            declareFunction("hl_verify_source_schema_object_fn", "HL-VERIFY-SOURCE-SCHEMA-OBJECT-FN", 1, 0, false);
            declareFunction("hl_justify_source_schema_object_fn", "HL-JUSTIFY-SOURCE-SCHEMA-OBJECT-FN", 1, 0, false);
            declareFunction("hl_forward_mt_combos_source_schema_object_fn", "HL-FORWARD-MT-COMBOS-SOURCE-SCHEMA-OBJECT-FN", 1, 0, false);
            declareFunction("hl_justify_reformulate", "HL-JUSTIFY-REFORMULATE", 1, 0, false);
            declareFunction("hl_justify_assertion", "HL-JUSTIFY-ASSERTION", 1, 0, false);
            declareFunction("hl_verify_assertion", "HL-VERIFY-ASSERTION", 1, 0, false);
            declareFunction("hl_forward_mt_combos_assertion", "HL-FORWARD-MT-COMBOS-ASSERTION", 1, 0, false);
            declareFunction("hl_justify_gaf", "HL-JUSTIFY-GAF", 1, 0, false);
            declareFunction("hl_verify_gaf", "HL-VERIFY-GAF", 1, 0, false);
            declareFunction("hl_forward_mt_combos_gaf", "HL-FORWARD-MT-COMBOS-GAF", 1, 0, false);
            declareFunction("hl_justify_mentions", "HL-JUSTIFY-MENTIONS", 1, 0, false);
            declareFunction("hl_verify_mentions", "HL-VERIFY-MENTIONS", 1, 0, false);
            declareFunction("hl_forward_mt_combos_mentions", "HL-FORWARD-MT-COMBOS-MENTIONS", 1, 0, false);
            declareMacro("possibly_with_negated_truth", "POSSIBLY-WITH-NEGATED-TRUTH");
            declareFunction("hl_justify_sbhl", "HL-JUSTIFY-SBHL", 1, 0, false);
            declareFunction("hl_justify_sbhl_optimal", "HL-JUSTIFY-SBHL-OPTIMAL", 6, 0, false);
            declareFunction("hl_justify_sbhl_optimal_int", "HL-JUSTIFY-SBHL-OPTIMAL-INT", 5, 0, false);
            declareFunction("hl_verify_isa", "HL-VERIFY-ISA", 1, 0, false);
            declareFunction("hl_justify_isa", "HL-JUSTIFY-ISA", 1, 0, false);
            declareFunction("clear_hl_forward_mt_combos_isa", "CLEAR-HL-FORWARD-MT-COMBOS-ISA", 0, 0, false);
            declareFunction("remove_hl_forward_mt_combos_isa", "REMOVE-HL-FORWARD-MT-COMBOS-ISA", 1, 0, false);
            declareFunction("hl_forward_mt_combos_isa_internal", "HL-FORWARD-MT-COMBOS-ISA-INTERNAL", 1, 0, false);
            declareFunction("hl_forward_mt_combos_isa", "HL-FORWARD-MT-COMBOS-ISA", 1, 0, false);
            declareFunction("justify_not_type_by_extent_known", "JUSTIFY-NOT-TYPE-BY-EXTENT-KNOWN", 3, 0, false);
            declareFunction("inference_max_floor_mts_of_isa_paths", "INFERENCE-MAX-FLOOR-MTS-OF-ISA-PATHS", 2, 0, false);
            declareFunction("inference_max_floor_mts_of_quoted_isa_paths", "INFERENCE-MAX-FLOOR-MTS-OF-QUOTED-ISA-PATHS", 2, 0, false);
            declareFunction("gaf_axioms", "GAF-AXIOMS", 2, 0, false);
            declareFunction("gaf_axioms_genl_mts", "GAF-AXIOMS-GENL-MTS", 2, 0, false);
            declareFunction("symmetric_hl_predP", "SYMMETRIC-HL-PRED?", 1, 0, false);
            declareFunction("hl_verify_incompatible_mts", "HL-VERIFY-INCOMPATIBLE-MTS", 1, 0, false);
            declareFunction("hl_justify_incompatible_mts", "HL-JUSTIFY-INCOMPATIBLE-MTS", 1, 0, false);
            declareFunction("hl_verify_genls", "HL-VERIFY-GENLS", 1, 0, false);
            declareFunction("hl_justify_genls", "HL-JUSTIFY-GENLS", 1, 0, false);
            declareFunction("hl_forward_mt_combos_genls", "HL-FORWARD-MT-COMBOS-GENLS", 1, 0, false);
            declareFunction("inference_max_floor_mts_of_genls_paths", "INFERENCE-MAX-FLOOR-MTS-OF-GENLS-PATHS", 2, 0, false);
            declareFunction("hl_verify_disjointwith", "HL-VERIFY-DISJOINTWITH", 1, 0, false);
            declareFunction("hl_justify_disjointwith", "HL-JUSTIFY-DISJOINTWITH", 1, 0, false);
            declareFunction("hl_forward_mt_combos_disjointwith", "HL-FORWARD-MT-COMBOS-DISJOINTWITH", 1, 0, false);
            declareFunction("hl_verify_genlmt", "HL-VERIFY-GENLMT", 1, 0, false);
            declareFunction("hl_justify_genlmt", "HL-JUSTIFY-GENLMT", 1, 0, false);
            declareFunction("hl_forward_mt_combos_genlmt", "HL-FORWARD-MT-COMBOS-GENLMT", 1, 0, false);
            declareFunction("hl_verify_genlpreds", "HL-VERIFY-GENLPREDS", 1, 0, false);
            declareFunction("hl_justify_genlpreds", "HL-JUSTIFY-GENLPREDS", 1, 0, false);
            declareFunction("hl_forward_mt_combos_genlpreds", "HL-FORWARD-MT-COMBOS-GENLPREDS", 1, 0, false);
            declareFunction("hl_verify_negationpreds", "HL-VERIFY-NEGATIONPREDS", 1, 0, false);
            declareFunction("hl_justify_negationpreds", "HL-JUSTIFY-NEGATIONPREDS", 1, 0, false);
            declareFunction("hl_forward_mt_combos_negationpreds", "HL-FORWARD-MT-COMBOS-NEGATIONPREDS", 1, 0, false);
            declareFunction("hl_verify_time_sentence", "HL-VERIFY-TIME-SENTENCE", 1, 0, false);
            declareFunction("hl_true_mts_for_time_sentence", "HL-TRUE-MTS-FOR-TIME-SENTENCE", 1, 0, false);
            declareFunction("hl_validate_time", "HL-VALIDATE-TIME", 2, 0, false);
            declareFunction("hl_justify_time_sentence", "HL-JUSTIFY-TIME-SENTENCE", 1, 0, false);
            declareFunction("hl_verify_cyclify", "HL-VERIFY-CYCLIFY", 1, 0, false);
            declareFunction("hl_justify_cyclify", "HL-JUSTIFY-CYCLIFY", 1, 0, false);
            declareFunction("hl_verify_nc_parse", "HL-VERIFY-NC-PARSE", 1, 0, false);
            declareFunction("hl_justify_nc_parse", "HL-JUSTIFY-NC-PARSE", 1, 0, false);
            declareFunction("hl_verify_candidate_nc_test", "HL-VERIFY-CANDIDATE-NC-TEST", 1, 0, false);
            declareFunction("hl_justify_candidate_nc_test", "HL-JUSTIFY-CANDIDATE-NC-TEST", 1, 0, false);
            declareFunction("hl_verify_asserted_arg1_binary_preds", "HL-VERIFY-ASSERTED-ARG1-BINARY-PREDS", 1, 0, false);
            declareFunction("hl_justify_asserted_arg1_binary_preds", "HL-JUSTIFY-ASSERTED-ARG1-BINARY-PREDS", 1, 0, false);
            declareFunction("hl_verify_shop_effect", "HL-VERIFY-SHOP-EFFECT", 1, 0, false);
            declareFunction("hl_justify_shop_effect", "HL-JUSTIFY-SHOP-EFFECT", 1, 0, false);
            declareFunction("hl_verify_query", "HL-VERIFY-QUERY", 1, 0, false);
            declareFunction("hl_justify_query", "HL-JUSTIFY-QUERY", 1, 0, false);
            declareFunction("hl_justify_query_int", "HL-JUSTIFY-QUERY-INT", 3, 0, false);
            declareFunction("hl_forward_mt_combos_of_query", "HL-FORWARD-MT-COMBOS-OF-QUERY", 1, 0, false);
            declareFunction("hl_verify_matrix_of_reaction_type", "HL-VERIFY-MATRIX-OF-REACTION-TYPE", 1, 0, false);
            declareFunction("hl_justify_matrix_of_reaction_type", "HL-JUSTIFY-MATRIX-OF-REACTION-TYPE", 1, 0, false);
            declareFunction("hl_forward_mt_combos_matrix_of_reaction_type", "HL-FORWARD-MT-COMBOS-MATRIX-OF-REACTION-TYPE", 1, 0, false);
            declareFunction("hl_verify_parse_tree_relation", "HL-VERIFY-PARSE-TREE-RELATION", 1, 0, false);
            declareFunction("hl_justify_parse_tree_relation", "HL-JUSTIFY-PARSE-TREE-RELATION", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("hl_verify_gis", "HL-VERIFY-GIS", 1, 0, false);
            declareFunction("hl_justify_gis", "HL-JUSTIFY-GIS", 1, 0, false);
            declareFunction("hl_forward_mt_combos_gis", "HL-FORWARD-MT-COMBOS-GIS", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_hl_supports_file_Previous() {
        declareFunction("hl_predicate_p", "HL-PREDICATE-P", 1, 0, false);
        declareFunction("non_hl_predicate_p", "NON-HL-PREDICATE-P", 1, 0, false);
        new hl_supports.$non_hl_predicate_p$UnaryFunction();
        declareFunction("declare_hl_predicate", "DECLARE-HL-PREDICATE", 1, 0, false);
        declareFunction("undeclare_hl_predicate", "UNDECLARE-HL-PREDICATE", 1, 0, false);
        declareFunction("hl_support_modules", "HL-SUPPORT-MODULES", 0, 0, false);
        declareFunction("hl_support_module_p", "HL-SUPPORT-MODULE-P", 1, 0, false);
        declareFunction("setup_hl_support_module", "SETUP-HL-SUPPORT-MODULE", 2, 0, false);
        declareFunction("hl_support_module_verify_func", "HL-SUPPORT-MODULE-VERIFY-FUNC", 1, 0, false);
        declareFunction("hl_support_module_justify_func", "HL-SUPPORT-MODULE-JUSTIFY-FUNC", 1, 0, false);
        declareFunction("hl_support_module_validate_func", "HL-SUPPORT-MODULE-VALIDATE-FUNC", 1, 0, false);
        declareFunction("hl_support_module_forward_mt_combos_func", "HL-SUPPORT-MODULE-FORWARD-MT-COMBOS-FUNC", 1, 0, false);
        declareFunction("hl_verify", "HL-VERIFY", 1, 0, false);
        declareFunction("hl_justify", "HL-JUSTIFY", 1, 0, false);
        declareFunction("hl_justify_expanded", "HL-JUSTIFY-EXPANDED", 1, 0, false);
        declareFunction("hl_justification_expand", "HL-JUSTIFICATION-EXPAND", 1, 0, false);
        declareFunction("hl_support_justify", "HL-SUPPORT-JUSTIFY", 1, 0, false);
        declareFunction("hl_trivial_justification", "HL-TRIVIAL-JUSTIFICATION", 1, 0, false);
        declareFunction("categorize_justification", "CATEGORIZE-JUSTIFICATION", 1, 0, false);
        declareFunction("supports_with_embedded_assertions", "SUPPORTS-WITH-EMBEDDED-ASSERTIONS", 1, 0, false);
        declareFunction("supports_embedded_assertions", "SUPPORTS-EMBEDDED-ASSERTIONS", 1, 0, false);
        declareFunction("support_embedded_assertions", "SUPPORT-EMBEDDED-ASSERTIONS", 1, 0, false);
        declareFunction("hl_validate", "HL-VALIDATE", 2, 0, false);
        declareFunction("hl_validate_wff_violations", "HL-VALIDATE-WFF-VIOLATIONS", 2, 0, false);
        declareFunction("hl_forward_mt_combos", "HL-FORWARD-MT-COMBOS", 1, 0, false);
        declareFunction("hl_forward_mt_combos_from_justification", "HL-FORWARD-MT-COMBOS-FROM-JUSTIFICATION", 1, 0, false);
        declareFunction("find_assertion_or_make_support", "FIND-ASSERTION-OR-MAKE-SUPPORT", 1, 1, false);
        declareFunction("max_floor_mts_of_justification", "MAX-FLOOR-MTS-OF-JUSTIFICATION", 1, 0, false);
        declareFunction("hl_justification_complete_backward_theory", "HL-JUSTIFICATION-COMPLETE-BACKWARD-THEORY", 1, 3, false);
        declareFunction("assertion_all_supporting_asserted_gafs", "ASSERTION-ALL-SUPPORTING-ASSERTED-GAFS", 1, 0, false);
        declareFunction("hl_verify_opaque", "HL-VERIFY-OPAQUE", 1, 0, false);
        declareFunction("opaque_hl_support_p", "OPAQUE-HL-SUPPORT-P", 1, 0, false);
        declareFunction("hl_verify_bookkeeping", "HL-VERIFY-BOOKKEEPING", 1, 0, false);
        declareFunction("hl_justify_bookkeeping", "HL-JUSTIFY-BOOKKEEPING", 1, 0, false);
        declareFunction("clear_cached_find_assertion_cycl", "CLEAR-CACHED-FIND-ASSERTION-CYCL", 0, 0, false);
        declareFunction("remove_cached_find_assertion_cycl", "REMOVE-CACHED-FIND-ASSERTION-CYCL", 1, 0, false);
        declareFunction("cached_find_assertion_cycl_internal", "CACHED-FIND-ASSERTION-CYCL-INTERNAL", 1, 0, false);
        declareFunction("cached_find_assertion_cycl", "CACHED-FIND-ASSERTION-CYCL", 1, 0, false);
        declareFunction("hl_forward_mt_combos_bookkeeping", "HL-FORWARD-MT-COMBOS-BOOKKEEPING", 1, 0, false);
        declareFunction("hl_verify_defn", "HL-VERIFY-DEFN", 1, 0, false);
        declareFunction("hl_justify_defn", "HL-JUSTIFY-DEFN", 1, 0, false);
        declareFunction("hl_forward_mt_combos_defn", "HL-FORWARD-MT-COMBOS-DEFN", 1, 0, false);
        declareFunction("hl_verify_elementof", "HL-VERIFY-ELEMENTOF", 1, 0, false);
        declareFunction("hl_forward_mt_combos_elementof", "HL-FORWARD-MT-COMBOS-ELEMENTOF", 1, 0, false);
        declareFunction("hl_verify_subsetof", "HL-VERIFY-SUBSETOF", 1, 0, false);
        declareFunction("hl_forward_mt_combos_subsetof", "HL-FORWARD-MT-COMBOS-SUBSETOF", 1, 0, false);
        declareFunction("hl_verify_sibling_disjoint", "HL-VERIFY-SIBLING-DISJOINT", 1, 0, false);
        declareFunction("hl_justify_sibling_disjoint", "HL-JUSTIFY-SIBLING-DISJOINT", 1, 0, false);
        declareFunction("hl_forward_mt_combos_sibling_disjoint", "HL-FORWARD-MT-COMBOS-SIBLING-DISJOINT", 1, 0, false);
        declareFunction("hl_verify_equality", "HL-VERIFY-EQUALITY", 1, 0, false);
        declareFunction("hl_forward_mt_combos_equality", "HL-FORWARD-MT-COMBOS-EQUALITY", 1, 0, false);
        declareFunction("hl_validate_equality", "HL-VALIDATE-EQUALITY", 2, 0, false);
        declareFunction("hl_validate_default", "HL-VALIDATE-DEFAULT", 2, 0, false);
        declareFunction("hl_validate_literal_minimal", "HL-VALIDATE-LITERAL-MINIMAL", 2, 0, false);
        declareFunction("hl_justify_equality", "HL-JUSTIFY-EQUALITY", 1, 0, false);
        declareFunction("hl_verify_eval", "HL-VERIFY-EVAL", 1, 0, false);
        declareFunction("hl_justify_eval", "HL-JUSTIFY-EVAL", 1, 0, false);
        new hl_supports.$hl_justify_eval$UnaryFunction();
        declareFunction("hl_verify_reflexive", "HL-VERIFY-REFLEXIVE", 1, 0, false);
        declareFunction("hl_justify_reflexive", "HL-JUSTIFY-REFLEXIVE", 1, 0, false);
        declareFunction("hl_forward_mt_combos_reflexive", "HL-FORWARD-MT-COMBOS-REFLEXIVE", 1, 0, false);
        declareFunction("inference_semantically_valid_irreflexive_literalP", "INFERENCE-SEMANTICALLY-VALID-IRREFLEXIVE-LITERAL?", 1, 1, false);
        declareFunction("max_floor_mts_where_reflexive", "MAX-FLOOR-MTS-WHERE-REFLEXIVE", 1, 1, false);
        declareFunction("max_floor_mts_where_arg_constraints_met_internal", "MAX-FLOOR-MTS-WHERE-ARG-CONSTRAINTS-MET-INTERNAL", 2, 1, false);
        declareFunction("max_floor_mts_where_arg_constraints_met", "MAX-FLOOR-MTS-WHERE-ARG-CONSTRAINTS-MET", 2, 1, false);
        declareFunction("hl_validate_reflexive", "HL-VALIDATE-REFLEXIVE", 2, 0, false);
        declareFunction("hl_verify_reflexive_on", "HL-VERIFY-REFLEXIVE-ON", 1, 0, false);
        declareFunction("hl_justify_reflexive_on", "HL-JUSTIFY-REFLEXIVE-ON", 1, 0, false);
        declareFunction("hl_forward_mt_combos_reflexive_on", "HL-FORWARD-MT-COMBOS-REFLEXIVE-ON", 1, 0, false);
        declareFunction("max_floor_mts_where_reflexive_on", "MAX-FLOOR-MTS-WHERE-REFLEXIVE-ON", 1, 0, false);
        declareFunction("transitivity_support_p", "TRANSITIVITY-SUPPORT-P", 1, 0, false);
        declareFunction("hl_verify_transitivity", "HL-VERIFY-TRANSITIVITY", 1, 0, false);
        declareFunction("hl_forward_mt_combos_transitivity", "HL-FORWARD-MT-COMBOS-TRANSITIVITY", 1, 0, false);
        declareFunction("hl_justify_transitivity", "HL-JUSTIFY-TRANSITIVITY", 1, 0, false);
        declareFunction("hl_verify_contextual_transitivity", "HL-VERIFY-CONTEXTUAL-TRANSITIVITY", 1, 0, false);
        declareFunction("hl_justify_contextual_transitivity", "HL-JUSTIFY-CONTEXTUAL-TRANSITIVITY", 1, 0, false);
        declareFunction("max_floor_mts_of_transitivity_paths", "MAX-FLOOR-MTS-OF-TRANSITIVITY-PATHS", 3, 1, false);
        declareFunction("hl_verify_tva", "HL-VERIFY-TVA", 1, 0, false);
        declareFunction("hl_justify_tva", "HL-JUSTIFY-TVA", 1, 0, false);
        declareFunction("hl_forward_mt_combos_tva", "HL-FORWARD-MT-COMBOS-TVA", 1, 0, false);
        declareFunction("hl_verify_rtv", "HL-VERIFY-RTV", 1, 0, false);
        declareFunction("hl_justify_rtv", "HL-JUSTIFY-RTV", 1, 0, false);
        declareFunction("hl_forward_mt_combos_rtv", "HL-FORWARD-MT-COMBOS-RTV", 1, 0, false);
        declareFunction("hl_verify_minimize", "HL-VERIFY-MINIMIZE", 1, 0, false);
        declareFunction("hl_verify_consistent", "HL-VERIFY-CONSISTENT", 1, 0, false);
        declareFunction("hl_justify_consistent", "HL-JUSTIFY-CONSISTENT", 1, 0, false);
        declareFunction("hl_verify_conceptually_related", "HL-VERIFY-CONCEPTUALLY-RELATED", 1, 0, false);
        declareFunction("hl_justify_conceptually_related", "HL-JUSTIFY-CONCEPTUALLY-RELATED", 1, 0, false);
        declareFunction("hl_forward_mt_combos_conceptually_related", "HL-FORWARD-MT-COMBOS-CONCEPTUALLY-RELATED", 1, 0, false);
        declareFunction("hl_verify_admit", "HL-VERIFY-ADMIT", 1, 0, false);
        declareFunction("hl_forward_mt_combos_admit", "HL-FORWARD-MT-COMBOS-ADMIT", 1, 0, false);
        declareFunction("hl_justify_admit", "HL-JUSTIFY-ADMIT", 1, 0, false);
        declareFunction("hl_verify_admitted_argument", "HL-VERIFY-ADMITTED-ARGUMENT", 1, 0, false);
        declareFunction("hl_verify_admitted_sentence", "HL-VERIFY-ADMITTED-SENTENCE", 1, 0, false);
        declareFunction("hl_verify_admitted_nat", "HL-VERIFY-ADMITTED-NAT", 1, 0, false);
        declareFunction("hl_forward_mt_combos_admitted_argument", "HL-FORWARD-MT-COMBOS-ADMITTED-ARGUMENT", 1, 0, false);
        declareFunction("hl_forward_mt_combos_admitted_sentence", "HL-FORWARD-MT-COMBOS-ADMITTED-SENTENCE", 1, 0, false);
        declareFunction("hl_forward_mt_combos_admitted_nat", "HL-FORWARD-MT-COMBOS-ADMITTED-NAT", 1, 0, false);
        declareFunction("hl_justify_admitted_argument", "HL-JUSTIFY-ADMITTED-ARGUMENT", 1, 0, false);
        declareFunction("hl_justify_admitted_sentence", "HL-JUSTIFY-ADMITTED-SENTENCE", 1, 0, false);
        declareFunction("hl_justify_admitted_nat", "HL-JUSTIFY-ADMITTED-NAT", 1, 0, false);
        declareFunction("hl_verify_sksi", "HL-VERIFY-SKSI", 1, 0, false);
        declareFunction("hl_justify_sksi", "HL-JUSTIFY-SKSI", 1, 0, false);
        declareFunction("hl_forward_mt_combos_sksi", "HL-FORWARD-MT-COMBOS-SKSI", 1, 0, false);
        declareFunction("hl_verify_csql", "HL-VERIFY-CSQL", 1, 0, false);
        declareFunction("hl_justify_csql", "HL-JUSTIFY-CSQL", 1, 0, false);
        declareFunction("hl_forward_mt_combos_csql", "HL-FORWARD-MT-COMBOS-CSQL", 1, 0, false);
        declareFunction("hl_verify_source_schema_object_fn", "HL-VERIFY-SOURCE-SCHEMA-OBJECT-FN", 1, 0, false);
        declareFunction("hl_justify_source_schema_object_fn", "HL-JUSTIFY-SOURCE-SCHEMA-OBJECT-FN", 1, 0, false);
        declareFunction("hl_forward_mt_combos_source_schema_object_fn", "HL-FORWARD-MT-COMBOS-SOURCE-SCHEMA-OBJECT-FN", 1, 0, false);
        declareFunction("hl_justify_reformulate", "HL-JUSTIFY-REFORMULATE", 1, 0, false);
        declareFunction("hl_justify_assertion", "HL-JUSTIFY-ASSERTION", 1, 0, false);
        declareFunction("hl_verify_assertion", "HL-VERIFY-ASSERTION", 1, 0, false);
        declareFunction("hl_forward_mt_combos_assertion", "HL-FORWARD-MT-COMBOS-ASSERTION", 1, 0, false);
        declareFunction("hl_justify_gaf", "HL-JUSTIFY-GAF", 1, 0, false);
        declareFunction("hl_verify_gaf", "HL-VERIFY-GAF", 1, 0, false);
        declareFunction("hl_forward_mt_combos_gaf", "HL-FORWARD-MT-COMBOS-GAF", 1, 0, false);
        declareFunction("hl_justify_mentions", "HL-JUSTIFY-MENTIONS", 1, 0, false);
        declareFunction("hl_verify_mentions", "HL-VERIFY-MENTIONS", 1, 0, false);
        declareFunction("hl_forward_mt_combos_mentions", "HL-FORWARD-MT-COMBOS-MENTIONS", 1, 0, false);
        declareMacro("possibly_with_negated_truth", "POSSIBLY-WITH-NEGATED-TRUTH");
        declareFunction("hl_justify_sbhl", "HL-JUSTIFY-SBHL", 1, 0, false);
        declareFunction("hl_justify_sbhl_optimal", "HL-JUSTIFY-SBHL-OPTIMAL", 6, 0, false);
        declareFunction("hl_justify_sbhl_optimal_int", "HL-JUSTIFY-SBHL-OPTIMAL-INT", 5, 0, false);
        declareFunction("hl_verify_isa", "HL-VERIFY-ISA", 1, 0, false);
        declareFunction("hl_justify_isa", "HL-JUSTIFY-ISA", 1, 0, false);
        declareFunction("clear_hl_forward_mt_combos_isa", "CLEAR-HL-FORWARD-MT-COMBOS-ISA", 0, 0, false);
        declareFunction("remove_hl_forward_mt_combos_isa", "REMOVE-HL-FORWARD-MT-COMBOS-ISA", 1, 0, false);
        declareFunction("hl_forward_mt_combos_isa_internal", "HL-FORWARD-MT-COMBOS-ISA-INTERNAL", 1, 0, false);
        declareFunction("hl_forward_mt_combos_isa", "HL-FORWARD-MT-COMBOS-ISA", 1, 0, false);
        declareFunction("justify_not_type_by_extent_known", "JUSTIFY-NOT-TYPE-BY-EXTENT-KNOWN", 3, 0, false);
        declareFunction("inference_max_floor_mts_of_isa_paths", "INFERENCE-MAX-FLOOR-MTS-OF-ISA-PATHS", 2, 0, false);
        declareFunction("inference_max_floor_mts_of_quoted_isa_paths", "INFERENCE-MAX-FLOOR-MTS-OF-QUOTED-ISA-PATHS", 2, 0, false);
        declareFunction("gaf_axioms", "GAF-AXIOMS", 2, 0, false);
        declareFunction("gaf_axioms_genl_mts", "GAF-AXIOMS-GENL-MTS", 2, 0, false);
        declareFunction("symmetric_hl_predP", "SYMMETRIC-HL-PRED?", 1, 0, false);
        declareFunction("hl_verify_incompatible_mts", "HL-VERIFY-INCOMPATIBLE-MTS", 1, 0, false);
        declareFunction("hl_justify_incompatible_mts", "HL-JUSTIFY-INCOMPATIBLE-MTS", 1, 0, false);
        declareFunction("hl_verify_genls", "HL-VERIFY-GENLS", 1, 0, false);
        declareFunction("hl_justify_genls", "HL-JUSTIFY-GENLS", 1, 0, false);
        declareFunction("hl_forward_mt_combos_genls", "HL-FORWARD-MT-COMBOS-GENLS", 1, 0, false);
        declareFunction("inference_max_floor_mts_of_genls_paths", "INFERENCE-MAX-FLOOR-MTS-OF-GENLS-PATHS", 2, 0, false);
        declareFunction("hl_verify_disjointwith", "HL-VERIFY-DISJOINTWITH", 1, 0, false);
        declareFunction("hl_justify_disjointwith", "HL-JUSTIFY-DISJOINTWITH", 1, 0, false);
        declareFunction("hl_forward_mt_combos_disjointwith", "HL-FORWARD-MT-COMBOS-DISJOINTWITH", 1, 0, false);
        declareFunction("hl_verify_genlmt", "HL-VERIFY-GENLMT", 1, 0, false);
        declareFunction("hl_justify_genlmt", "HL-JUSTIFY-GENLMT", 1, 0, false);
        declareFunction("hl_forward_mt_combos_genlmt", "HL-FORWARD-MT-COMBOS-GENLMT", 1, 0, false);
        declareFunction("hl_verify_genlpreds", "HL-VERIFY-GENLPREDS", 1, 0, false);
        declareFunction("hl_justify_genlpreds", "HL-JUSTIFY-GENLPREDS", 1, 0, false);
        declareFunction("hl_forward_mt_combos_genlpreds", "HL-FORWARD-MT-COMBOS-GENLPREDS", 1, 0, false);
        declareFunction("hl_verify_negationpreds", "HL-VERIFY-NEGATIONPREDS", 1, 0, false);
        declareFunction("hl_justify_negationpreds", "HL-JUSTIFY-NEGATIONPREDS", 1, 0, false);
        declareFunction("hl_forward_mt_combos_negationpreds", "HL-FORWARD-MT-COMBOS-NEGATIONPREDS", 1, 0, false);
        declareFunction("hl_verify_time_sentence", "HL-VERIFY-TIME-SENTENCE", 1, 0, false);
        declareFunction("hl_true_mts_for_time_sentence", "HL-TRUE-MTS-FOR-TIME-SENTENCE", 1, 0, false);
        declareFunction("hl_validate_time", "HL-VALIDATE-TIME", 2, 0, false);
        declareFunction("hl_justify_time_sentence", "HL-JUSTIFY-TIME-SENTENCE", 1, 0, false);
        declareFunction("hl_verify_cyclify", "HL-VERIFY-CYCLIFY", 1, 0, false);
        declareFunction("hl_justify_cyclify", "HL-JUSTIFY-CYCLIFY", 1, 0, false);
        declareFunction("hl_verify_nc_parse", "HL-VERIFY-NC-PARSE", 1, 0, false);
        declareFunction("hl_justify_nc_parse", "HL-JUSTIFY-NC-PARSE", 1, 0, false);
        declareFunction("hl_verify_candidate_nc_test", "HL-VERIFY-CANDIDATE-NC-TEST", 1, 0, false);
        declareFunction("hl_justify_candidate_nc_test", "HL-JUSTIFY-CANDIDATE-NC-TEST", 1, 0, false);
        declareFunction("hl_verify_asserted_arg1_binary_preds", "HL-VERIFY-ASSERTED-ARG1-BINARY-PREDS", 1, 0, false);
        declareFunction("hl_justify_asserted_arg1_binary_preds", "HL-JUSTIFY-ASSERTED-ARG1-BINARY-PREDS", 1, 0, false);
        declareFunction("hl_verify_shop_effect", "HL-VERIFY-SHOP-EFFECT", 1, 0, false);
        declareFunction("hl_justify_shop_effect", "HL-JUSTIFY-SHOP-EFFECT", 1, 0, false);
        declareFunction("hl_verify_query", "HL-VERIFY-QUERY", 1, 0, false);
        declareFunction("hl_justify_query", "HL-JUSTIFY-QUERY", 1, 0, false);
        declareFunction("hl_justify_query_int", "HL-JUSTIFY-QUERY-INT", 3, 0, false);
        declareFunction("hl_forward_mt_combos_of_query", "HL-FORWARD-MT-COMBOS-OF-QUERY", 1, 0, false);
        declareFunction("hl_verify_matrix_of_reaction_type", "HL-VERIFY-MATRIX-OF-REACTION-TYPE", 1, 0, false);
        declareFunction("hl_justify_matrix_of_reaction_type", "HL-JUSTIFY-MATRIX-OF-REACTION-TYPE", 1, 0, false);
        declareFunction("hl_forward_mt_combos_matrix_of_reaction_type", "HL-FORWARD-MT-COMBOS-MATRIX-OF-REACTION-TYPE", 1, 0, false);
        declareFunction("hl_verify_parse_tree_relation", "HL-VERIFY-PARSE-TREE-RELATION", 1, 0, false);
        declareFunction("hl_justify_parse_tree_relation", "HL-JUSTIFY-PARSE-TREE-RELATION", 1, 0, false);
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(new SubLObject[]{ reader_make_constant_shell("isa"), reader_make_constant_shell("quotedIsa"), reader_make_constant_shell("genls"), reader_make_constant_shell("termOfUnit"), reader_make_constant_shell("equals"), reader_make_constant_shell("equalSymbols"), reader_make_constant_shell("different"), reader_make_constant_shell("differentSymbols"), reader_make_constant_shell("evaluate"), reader_make_constant_shell("elementOf"), reader_make_constant_shell("subsetOf"), reader_make_constant_shell("disjointWith"), reader_make_constant_shell("genlMt"), reader_make_constant_shell("genlPreds"), reader_make_constant_shell("genlInverse"), reader_make_constant_shell("negationPreds"), reader_make_constant_shell("negationInverse"), reader_make_constant_shell("conceptuallyRelated") });

    static private final SubLList $list_alt3 = list(makeKeyword("VERIFY"), makeKeyword("JUSTIFY"), makeKeyword("VALIDATE"), makeKeyword("FORWARD-MT-COMBOS"));

    static private final SubLList $list_alt5 = list(makeSymbol("OBJECT"));

    static private final SubLString $str_alt6$Return_T_iff_OBJECT_is_an_HL_supp = makeString("Return T iff OBJECT is an HL support module.");

    static private final SubLList $list_alt7 = list(makeSymbol("BOOLEANP"));

    static private final SubLString $str_alt9$_S_was_not_a_valid_hl_support_mod = makeString("~S was not a valid hl-support-module indicator");

    static private final SubLList $list_alt22 = list(makeKeyword("VERIFY"), makeSymbol("TRUE"));

    static private final SubLList $list_alt23 = list(makeSymbol("HL-MODULE"), makeSymbol("LITERAL"), makeSymbol("MT"), makeSymbol("TV"));

    static private final SubLList $list_alt25 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-OPAQUE"));

    public static final SubLSymbol $kw42$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLList $list_alt44 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-BOOKKEEPING"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-BOOKKEEPING"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-BOOKKEEPING"));

    static private final SubLList $list_alt45 = list(makeSymbol("OBJECT"), makeSymbol("COLLECTION"));

    static private final SubLList $list_alt47 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-DEFN"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-DEFN"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-DEFN"));

    static private final SubLList $list_alt48 = list(makeSymbol("ELEMENT"), cons(makeSymbol("THESET"), makeSymbol("ARGS")));

    static private final SubLList $list_alt50 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-ELEMENTOF"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-ELEMENTOF"));

    static private final SubLList $list_alt54 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-SUBSETOF"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-SUBSETOF"));

    static private final SubLList $list_alt55 = list(makeSymbol("COL1"), makeSymbol("COL2"));

    static private final SubLList $list_alt58 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-SIBLING-DISJOINT"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-SIBLING-DISJOINT"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-SIBLING-DISJOINT"));

    static private final SubLString $str_alt65$Unexpected_intermediate_step_vali = makeString("Unexpected intermediate step validation level ~s");

    static private final SubLList $list_alt67 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-EQUALITY"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-EQUALITY"), makeKeyword("VALIDATE"), makeSymbol("HL-VALIDATE-EQUALITY"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-EQUALITY"));

    static private final SubLList $list_alt69 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-EVAL"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-EVAL"));

    static private final SubLList $list_alt70 = list(makeSymbol("PRED"), makeSymbol("ARG1"), makeSymbol("ARG2"));

    static private final SubLList $list_alt79 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-REFLEXIVE"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-REFLEXIVE"), makeKeyword("VALIDATE"), makeSymbol("HL-VALIDATE-REFLEXIVE"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-REFLEXIVE"));

    static private final SubLList $list_alt80 = list(makeSymbol("ARG1"), makeSymbol("ARG2"));

    static private final SubLList $list_alt81 = list(makeSymbol("PREDICATE"), makeSymbol("ARG1"), makeSymbol("ARG2"));

    static private final SubLList $list_alt86 = cons(makeSymbol("REFLEX-MT"), makeSymbol("COL"));

    static private final SubLSymbol $sym87$TERM__ = makeSymbol("TERM-<");

    static private final SubLList $list_alt89 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-REFLEXIVE-ON"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-REFLEXIVE-ON"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-REFLEXIVE-ON"));

    static private final SubLList $list_alt91 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-TRANSITIVITY"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-TRANSITIVITY"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-TRANSITIVITY"));

    static private final SubLList $list_alt93 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-CONTEXTUAL-TRANSITIVITY"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-TRANSITIVITY"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-CONTEXTUAL-TRANSITIVITY"));

    static private final SubLList $list_alt96 = list(makeSymbol("HL-MODULE"), makeSymbol("ASENT"), makeSymbol("MT"), makeSymbol("TV"));

    static private final SubLList $list_alt98 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-TVA"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-TVA"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-TVA"));

    public static final SubLObject init_hl_supports_file_alt() {
        deflexical("*HL-PREDICATES*", $list_alt0);
        deflexical("*HL-SUPPORT-MODULES*", NIL != boundp($hl_support_modules$) ? ((SubLObject) ($hl_support_modules$.getGlobalValue())) : NIL);
        defparameter("*HL-SUPPORT-MODULE-PLIST-INDICATORS*", $list_alt3);
        defparameter("*PERFORM-OPAQUE-SUPPORT-VERIFICATION*", NIL);
        deflexical("*BOOKKEEPING-JUSTIFICATION-ASSERTION-MT*", NIL != boundp($bookkeeping_justification_assertion_mt$) ? ((SubLObject) ($bookkeeping_justification_assertion_mt$.getGlobalValue())) : $$BaseKB);
        deflexical("*CACHED-FIND-ASSERTION-CYCL-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject init_hl_supports_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*HL-PREDICATES*", $list0);
            deflexical("*HL-SUPPORT-MODULES*", SubLTrampolineFile.maybeDefault($hl_support_modules$, $hl_support_modules$, NIL));
            defparameter("*HL-SUPPORT-MODULE-PLIST-INDICATORS*", $list3);
            defparameter("*HL-FORWARD-MT-COMBOS-MAX-RECURSION-DEPTH*", FIVE_INTEGER);
            defparameter("*DEBUG-NULL-HL-FORWARD-MT-COMBOS?*", NIL);
            defparameter("*PERFORM-OPAQUE-SUPPORT-VERIFICATION*", NIL);
            deflexical("*BOOKKEEPING-JUSTIFICATION-ASSERTION-MT*", SubLTrampolineFile.maybeDefault($bookkeeping_justification_assertion_mt$, $bookkeeping_justification_assertion_mt$, $$BaseKB));
            deflexical("*CACHED-FIND-ASSERTION-CYCL-CACHING-STATE*", NIL);
            deflexical("*HL-FORWARD-MT-COMBOS-ISA-CACHING-STATE*", NIL);
            defparameter("*DEFAULT-HL-VERIFY-QUERY-PROPERTIES*", $list218);
            defparameter("*DEFAULT-HL-JUSTIFY-QUERY-PROPERTIES*", $list221);
            defparameter("*WITHIN-HL-JUSTIFY-QUERY?*", NIL);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*HL-SUPPORT-MODULES*", NIL != boundp($hl_support_modules$) ? ((SubLObject) ($hl_support_modules$.getGlobalValue())) : NIL);
            deflexical("*BOOKKEEPING-JUSTIFICATION-ASSERTION-MT*", NIL != boundp($bookkeeping_justification_assertion_mt$) ? ((SubLObject) ($bookkeeping_justification_assertion_mt$.getGlobalValue())) : $$BaseKB);
        }
        return NIL;
    }

    public static SubLObject init_hl_supports_file_Previous() {
        deflexical("*HL-PREDICATES*", $list0);
        deflexical("*HL-SUPPORT-MODULES*", SubLTrampolineFile.maybeDefault($hl_support_modules$, $hl_support_modules$, NIL));
        defparameter("*HL-SUPPORT-MODULE-PLIST-INDICATORS*", $list3);
        defparameter("*HL-FORWARD-MT-COMBOS-MAX-RECURSION-DEPTH*", FIVE_INTEGER);
        defparameter("*DEBUG-NULL-HL-FORWARD-MT-COMBOS?*", NIL);
        defparameter("*PERFORM-OPAQUE-SUPPORT-VERIFICATION*", NIL);
        deflexical("*BOOKKEEPING-JUSTIFICATION-ASSERTION-MT*", SubLTrampolineFile.maybeDefault($bookkeeping_justification_assertion_mt$, $bookkeeping_justification_assertion_mt$, $$BaseKB));
        deflexical("*CACHED-FIND-ASSERTION-CYCL-CACHING-STATE*", NIL);
        deflexical("*HL-FORWARD-MT-COMBOS-ISA-CACHING-STATE*", NIL);
        defparameter("*DEFAULT-HL-VERIFY-QUERY-PROPERTIES*", $list218);
        defparameter("*DEFAULT-HL-JUSTIFY-QUERY-PROPERTIES*", $list221);
        defparameter("*WITHIN-HL-JUSTIFY-QUERY?*", NIL);
        return NIL;
    }

    static private final SubLList $list_alt99 = list(makeSymbol("HL-MODULE"), makeSymbol("ASENT"), makeSymbol("SUPPORT-MT"), makeSymbol("TV"));

    static private final SubLList $list_alt101 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-RTV"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-RTV"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-RTV"));

    static private final SubLList $list_alt102 = list(makeSymbol("HL-MODULE"), makeSymbol("FORMULA"), makeSymbol("MT"), makeSymbol("TV"));

    static private final SubLList $list_alt105 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-MINIMIZE"));

    static private final SubLList $list_alt107 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-CONSISTENT"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-CONSISTENT"));

    static private final SubLList $list_alt109 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-CONCEPTUALLY-RELATED"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-CONCEPTUALLY-RELATED"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-CONCEPTUALLY-RELATED"));

    public static final SubLObject setup_hl_supports_file_alt() {
        declare_defglobal($hl_support_modules$);
        register_cyc_api_function(HL_SUPPORT_MODULE_P, $list_alt5, $str_alt6$Return_T_iff_OBJECT_is_an_HL_supp, NIL, $list_alt7);
        com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($CODE, $list_alt22);
        com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($OPAQUE, $list_alt25);
        com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($ABDUCTION, $list_alt22);
        declare_defglobal($bookkeeping_justification_assertion_mt$);
        note_mt_var($bookkeeping_justification_assertion_mt$, NIL);
        memoization_state.note_globally_cached_function(CACHED_FIND_ASSERTION_CYCL);
        com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($BOOKKEEPING, $list_alt44);
        com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($DEFN, $list_alt47);
        com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($ELEMENTOF, $list_alt50);
        com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($SUBSETOF, $list_alt54);
        com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($SIBLING_DISJOINT, $list_alt58);
        com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($EQUALITY, $list_alt67);
        com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($EVAL, $list_alt69);
        memoization_state.note_memoized_function(MAX_FLOOR_MTS_WHERE_ARG_CONSTRAINTS_MET);
        com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($REFLEXIVE, $list_alt79);
        com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($REFLEXIVE_ON, $list_alt89);
        com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($TRANSITIVITY, $list_alt91);
        com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($CONTEXTUAL_TRANSITIVITY, $list_alt93);
        com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($TVA, $list_alt98);
        com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($RTV, $list_alt101);
        com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($MINIMIZE, $list_alt105);
        com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($CONSISTENT, $list_alt107);
        com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($CONCEPTUALLY_RELATED, $list_alt109);
        com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($ADMIT, $list_alt112);
        com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($SKSI, $list_alt115);
        com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($CSQL, $list_alt117);
        com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($SOURCE_SCHEMA_OBJECT_FN, $list_alt119);
        com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($REFORMULATE, $list_alt121);
        com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module(arguments.$assertion_support_module$.getGlobalValue(), $list_alt122);
        com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($GIS, $list_alt129);
        com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($EXTERNAL, NIL);
        com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($EXTERNAL_EVAL, NIL);
        com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($ISA, $list_alt146);
        com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($GENLS, $list_alt152);
        com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($DISJOINTWITH, $list_alt157);
        com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($GENLMT, $list_alt159);
        com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($GENLPREDS, $list_alt164);
        com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($NEGATIONPREDS, $list_alt168);
        com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($TIME, $list_alt175);
        com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($CYCLIFY, $list_alt177);
        com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($NC_PARSE, $list_alt179);
        com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($CANDIDATE_NC_TESTS, $list_alt181);
        com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($ASSERTED_ARG1_BINARY_PREDS, $list_alt183);
        com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($FCP, $list_alt185);
        com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($SHOP_EFFECT, $list_alt187);
        com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($QUERY, $list_alt194);
        com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($MATRIX_OF_REACTION_TYPE, $list_alt197);
        note_funcall_helper_function(HL_VERIFY_PARSE_TREE_RELATION);
        note_funcall_helper_function(HL_JUSTIFY_PARSE_TREE_RELATION);
        com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($PARSE_TREE, $list_alt201);
        com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($WORD_STRINGS, $list_alt203);
        com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($TERM_PHRASES, $list_alt205);
        com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($RKF_IRRELEVANT_FORT_CACHE, $list_alt207);
        return NIL;
    }

    public static SubLObject setup_hl_supports_file() {
        if (SubLFiles.USE_V1) {
            declare_defglobal($hl_support_modules$);
            register_cyc_api_function(HL_SUPPORT_MODULE_P, $list5, $str6$Return_T_iff_OBJECT_is_an_HL_supp, NIL, $list7);
            setup_hl_support_module($CODE, $list41);
            setup_hl_support_module($OPAQUE, $list43);
            setup_hl_support_module($ABDUCTION, $list41);
            declare_defglobal($bookkeeping_justification_assertion_mt$);
            mt_vars.note_mt_var($bookkeeping_justification_assertion_mt$, NIL);
            memoization_state.note_globally_cached_function(CACHED_FIND_ASSERTION_CYCL);
            setup_hl_support_module($BOOKKEEPING, $list60);
            setup_hl_support_module($DEFN, $list65);
            setup_hl_support_module($ELEMENTOF, $list68);
            setup_hl_support_module($SUBSETOF, $list72);
            setup_hl_support_module($SIBLING_DISJOINT, $list78);
            setup_hl_support_module($EQUALITY, $list87);
            setup_hl_support_module($EVAL, $list89);
            memoization_state.note_memoized_function(MAX_FLOOR_MTS_WHERE_ARG_CONSTRAINTS_MET);
            setup_hl_support_module($REFLEXIVE, $list99);
            setup_hl_support_module($REFLEXIVE_ON, $list109);
            setup_hl_support_module($TRANSITIVITY, $list111);
            setup_hl_support_module($CONTEXTUAL_TRANSITIVITY, $list113);
            setup_hl_support_module($TVA, $list118);
            setup_hl_support_module($RTV, $list121);
            setup_hl_support_module($MINIMIZE, $list125);
            setup_hl_support_module($CONSISTENT, $list127);
            setup_hl_support_module($CONCEPTUALLY_RELATED, $list129);
            setup_hl_support_module($ADMIT, $list132);
            setup_hl_support_module($SKSI, $list136);
            setup_hl_support_module($CSQL, $list138);
            setup_hl_support_module($SOURCE_SCHEMA_OBJECT_FN, $list140);
            setup_hl_support_module($REFORMULATE, $list142);
            setup_hl_support_module(arguments.$assertion_support_module$.getGlobalValue(), $list143);
            setup_hl_support_module($GAF, $list145);
            setup_hl_support_module($MENTIONS, $list150);
            setup_hl_support_module($EXTERNAL, NIL);
            setup_hl_support_module($EXTERNAL_EVAL, NIL);
            memoization_state.note_globally_cached_function(HL_FORWARD_MT_COMBOS_ISA);
            setup_hl_support_module($ISA, $list173);
            setup_hl_support_module($INCOMPATIBLEMT, $list178);
            setup_hl_support_module($GENLS, $list182);
            setup_hl_support_module($DISJOINTWITH, $list187);
            setup_hl_support_module($GENLMT, $list189);
            setup_hl_support_module($GENLPREDS, $list194);
            setup_hl_support_module($NEGATIONPREDS, $list198);
            setup_hl_support_module($TIME, $list205);
            setup_hl_support_module($CYCLIFY, $list207);
            setup_hl_support_module($NC_PARSE, $list209);
            setup_hl_support_module($CANDIDATE_NC_TESTS, $list211);
            setup_hl_support_module($ASSERTED_ARG1_BINARY_PREDS, $list213);
            setup_hl_support_module($FCP, $list215);
            setup_hl_support_module($SHOP_EFFECT, $list217);
            setup_hl_support_module($QUERY, $list225);
            setup_hl_support_module($MATRIX_OF_REACTION_TYPE, $list229);
            note_funcall_helper_function(HL_VERIFY_PARSE_TREE_RELATION);
            note_funcall_helper_function(HL_JUSTIFY_PARSE_TREE_RELATION);
            setup_hl_support_module($PARSE_TREE, $list233);
            setup_hl_support_module($WORD_STRINGS, $list235);
            setup_hl_support_module($TERM_PHRASES, $list237);
            setup_hl_support_module($RKF_IRRELEVANT_FORT_CACHE, $list239);
        }
        if (SubLFiles.USE_V2) {
            com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($CODE, $list_alt22);
            com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($OPAQUE, $list_alt25);
            com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($ABDUCTION, $list_alt22);
            com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($BOOKKEEPING, $list_alt44);
            com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($DEFN, $list_alt47);
            com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($ELEMENTOF, $list_alt50);
            com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($SUBSETOF, $list_alt54);
            com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($SIBLING_DISJOINT, $list_alt58);
            com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($EQUALITY, $list_alt67);
            com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($EVAL, $list_alt69);
            com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($REFLEXIVE, $list_alt79);
            com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($REFLEXIVE_ON, $list_alt89);
            com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($TRANSITIVITY, $list_alt91);
            com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($CONTEXTUAL_TRANSITIVITY, $list_alt93);
            com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($TVA, $list_alt98);
            com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($RTV, $list_alt101);
            com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($MINIMIZE, $list_alt105);
            com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($CONSISTENT, $list_alt107);
            com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($CONCEPTUALLY_RELATED, $list_alt109);
            com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($ADMIT, $list_alt112);
            com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($SKSI, $list_alt115);
            com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($CSQL, $list_alt117);
            com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($SOURCE_SCHEMA_OBJECT_FN, $list_alt119);
            com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($REFORMULATE, $list_alt121);
            com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module(arguments.$assertion_support_module$.getGlobalValue(), $list_alt122);
            com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($GIS, $list_alt129);
            com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($ISA, $list_alt146);
            com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($GENLS, $list_alt152);
            com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($DISJOINTWITH, $list_alt157);
            com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($GENLMT, $list_alt159);
            com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($GENLPREDS, $list_alt164);
            com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($NEGATIONPREDS, $list_alt168);
            com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($TIME, $list_alt175);
            com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($CYCLIFY, $list_alt177);
            com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($NC_PARSE, $list_alt179);
            com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($CANDIDATE_NC_TESTS, $list_alt181);
            com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($ASSERTED_ARG1_BINARY_PREDS, $list_alt183);
            com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($FCP, $list_alt185);
            com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($SHOP_EFFECT, $list_alt187);
            com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($QUERY, $list_alt194);
            com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($MATRIX_OF_REACTION_TYPE, $list_alt197);
            com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($PARSE_TREE, $list_alt201);
            com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($WORD_STRINGS, $list_alt203);
            com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($TERM_PHRASES, $list_alt205);
            com.cyc.cycjava.cycl.hl_supports.setup_hl_support_module($RKF_IRRELEVANT_FORT_CACHE, $list_alt207);
        }
        return NIL;
    }

    public static SubLObject setup_hl_supports_file_Previous() {
        declare_defglobal($hl_support_modules$);
        register_cyc_api_function(HL_SUPPORT_MODULE_P, $list5, $str6$Return_T_iff_OBJECT_is_an_HL_supp, NIL, $list7);
        setup_hl_support_module($CODE, $list41);
        setup_hl_support_module($OPAQUE, $list43);
        setup_hl_support_module($ABDUCTION, $list41);
        declare_defglobal($bookkeeping_justification_assertion_mt$);
        mt_vars.note_mt_var($bookkeeping_justification_assertion_mt$, NIL);
        memoization_state.note_globally_cached_function(CACHED_FIND_ASSERTION_CYCL);
        setup_hl_support_module($BOOKKEEPING, $list60);
        setup_hl_support_module($DEFN, $list65);
        setup_hl_support_module($ELEMENTOF, $list68);
        setup_hl_support_module($SUBSETOF, $list72);
        setup_hl_support_module($SIBLING_DISJOINT, $list78);
        setup_hl_support_module($EQUALITY, $list87);
        setup_hl_support_module($EVAL, $list89);
        memoization_state.note_memoized_function(MAX_FLOOR_MTS_WHERE_ARG_CONSTRAINTS_MET);
        setup_hl_support_module($REFLEXIVE, $list99);
        setup_hl_support_module($REFLEXIVE_ON, $list109);
        setup_hl_support_module($TRANSITIVITY, $list111);
        setup_hl_support_module($CONTEXTUAL_TRANSITIVITY, $list113);
        setup_hl_support_module($TVA, $list118);
        setup_hl_support_module($RTV, $list121);
        setup_hl_support_module($MINIMIZE, $list125);
        setup_hl_support_module($CONSISTENT, $list127);
        setup_hl_support_module($CONCEPTUALLY_RELATED, $list129);
        setup_hl_support_module($ADMIT, $list132);
        setup_hl_support_module($SKSI, $list136);
        setup_hl_support_module($CSQL, $list138);
        setup_hl_support_module($SOURCE_SCHEMA_OBJECT_FN, $list140);
        setup_hl_support_module($REFORMULATE, $list142);
        setup_hl_support_module(arguments.$assertion_support_module$.getGlobalValue(), $list143);
        setup_hl_support_module($GAF, $list145);
        setup_hl_support_module($MENTIONS, $list150);
        setup_hl_support_module($EXTERNAL, NIL);
        setup_hl_support_module($EXTERNAL_EVAL, NIL);
        memoization_state.note_globally_cached_function(HL_FORWARD_MT_COMBOS_ISA);
        setup_hl_support_module($ISA, $list173);
        setup_hl_support_module($INCOMPATIBLEMT, $list178);
        setup_hl_support_module($GENLS, $list182);
        setup_hl_support_module($DISJOINTWITH, $list187);
        setup_hl_support_module($GENLMT, $list189);
        setup_hl_support_module($GENLPREDS, $list194);
        setup_hl_support_module($NEGATIONPREDS, $list198);
        setup_hl_support_module($TIME, $list205);
        setup_hl_support_module($CYCLIFY, $list207);
        setup_hl_support_module($NC_PARSE, $list209);
        setup_hl_support_module($CANDIDATE_NC_TESTS, $list211);
        setup_hl_support_module($ASSERTED_ARG1_BINARY_PREDS, $list213);
        setup_hl_support_module($FCP, $list215);
        setup_hl_support_module($SHOP_EFFECT, $list217);
        setup_hl_support_module($QUERY, $list225);
        setup_hl_support_module($MATRIX_OF_REACTION_TYPE, $list229);
        note_funcall_helper_function(HL_VERIFY_PARSE_TREE_RELATION);
        note_funcall_helper_function(HL_JUSTIFY_PARSE_TREE_RELATION);
        setup_hl_support_module($PARSE_TREE, $list233);
        setup_hl_support_module($WORD_STRINGS, $list235);
        setup_hl_support_module($TERM_PHRASES, $list237);
        setup_hl_support_module($RKF_IRRELEVANT_FORT_CACHE, $list239);
        return NIL;
    }

    static private final SubLList $list_alt112 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-ADMIT"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-ADMIT"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-ADMIT"));

    static private final SubLList $list_alt113 = list(makeSymbol("TERM"), makeSymbol("ARGNUM"), makeSymbol("RELATION"));

    static private final SubLList $list_alt115 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-SKSI"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-SKSI"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-SKSI"));

    static private final SubLList $list_alt117 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-CSQL"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-CSQL"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-CSQL"));

    static private final SubLList $list_alt119 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-SOURCE-SCHEMA-OBJECT-FN"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-SOURCE-SCHEMA-OBJECT-FN"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-SOURCE-SCHEMA-OBJECT-FN"));

    static private final SubLList $list_alt121 = list(makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-REFORMULATE"));

    static private final SubLList $list_alt122 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-ASSERTION"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-ASSERTION"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-ASSERTION"));

    static private final SubLList $list_alt123 = list(makeSymbol("HL-MODULE"), makeSymbol("EL-SENTENCE"), makeSymbol("MT"), makeSymbol("TV"));

    static private final SubLList $list_alt124 = list(reader_make_constant_shell("forceElement-FromGIS"), reader_make_constant_shell("tacticalPoint-FromGIS"), reader_make_constant_shell("tacticalLine-FromGIS"), reader_make_constant_shell("tacticalArea-FromGIS"), reader_make_constant_shell("lineOfSight-PointToArea"), reader_make_constant_shell("spatiallyIntersects"));

    static private final SubLString $str_alt125$Cycorp_ArcMap_GIS_KS = makeString("Cycorp-ArcMap-GIS-KS");



    private static final SubLSymbol $GIS = makeKeyword("GIS");



    static private final SubLList $list_alt129 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-GIS"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-GIS"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-GIS"));

    static private final SubLList $list_alt132 = list(list(makeSymbol("LITERAL-VAR"), makeSymbol("TV-VAR"), makeSymbol("LITERAL"), makeSymbol("TV")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt137 = list(makeKeyword("REGULARIZE"));

    @Override
    public void declareFunctions() {
        declare_hl_supports_file();
    }

    @Override
    public void initializeVariables() {
        init_hl_supports_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_hl_supports_file();
    }

    static {
    }

    static private final SubLList $list_alt145 = list(makeSymbol("ARG1"), makeSymbol("ARG2"), makeSymbol("ARG3"));

    static private final SubLList $list_alt146 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-ISA"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-ISA"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-ISA"));

    public static final class $non_hl_predicate_p$UnaryFunction extends UnaryFunction {
        public $non_hl_predicate_p$UnaryFunction() {
            super(extractFunctionNamed("NON-HL-PREDICATE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return non_hl_predicate_p(arg1);
        }
    }

    static private final SubLList $list_alt147 = list(makeSymbol("GAF"), makeSymbol("TV"));

    static private final SubLList $list_alt148 = list(reader_make_constant_shell("disjointWith"));

    public static final class $hl_justify_eval$UnaryFunction extends UnaryFunction {
        public $hl_justify_eval$UnaryFunction() {
            super(extractFunctionNamed("HL-JUSTIFY-EVAL"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return hl_justify_eval(arg1);
        }
    }

    static private final SubLList $list_alt152 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-GENLS"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-GENLS"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-GENLS"));

    static private final SubLList $list_alt155 = list(makeSymbol("TERM1"), makeSymbol("TERM2"));

    static private final SubLList $list_alt157 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-DISJOINTWITH"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-DISJOINTWITH"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-DISJOINTWITH"));

    static private final SubLList $list_alt159 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-GENLMT"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-GENLMT"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-GENLMT"));

    static private final SubLList $list_alt160 = list(makeSymbol("PREDICATE"), makeSymbol("SPEC"), makeSymbol("GENL"));

    static private final SubLList $list_alt164 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-GENLPREDS"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-GENLPREDS"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-GENLPREDS"));

    static private final SubLList $list_alt168 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-NEGATIONPREDS"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-NEGATIONPREDS"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-NEGATIONPREDS"));

    static private final SubLString $str_alt172$Continue_anyway_ = makeString("Continue anyway.");

    static private final SubLString $str_alt173$Unsupported_predicate___a__for__T = makeString("Unsupported predicate, ~a, for :TIME module");

    static private final SubLList $list_alt175 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-TIME-SENTENCE"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-TRUE-MTS-FOR-TIME-SENTENCE"), makeKeyword("VALIDATE"), makeSymbol("HL-VALIDATE-TIME"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-TIME-SENTENCE"));

    static private final SubLList $list_alt177 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-CYCLIFY"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-CYCLIFY"), makeKeyword("FORWARD-MT-COMBOS"), NIL);

    static private final SubLList $list_alt179 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-NC-PARSE"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-NC-PARSE"), makeKeyword("FORWARD-MT-COMBOS"), NIL);

    static private final SubLList $list_alt181 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-CANDIDATE-NC-TEST"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-CANDIDATE-NC-TEST"), makeKeyword("FORWARD-MT-COMBOS"), NIL);

    static private final SubLList $list_alt183 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-ASSERTED-ARG1-BINARY-PREDS"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-ASSERTED-ARG1-BINARY-PREDS"), makeKeyword("FORWARD-MT-COMBOS"), NIL);

    static private final SubLList $list_alt185 = list(makeKeyword("VERIFY"), makeSymbol("REMOVAL-FCP-VERIFY"), makeKeyword("JUSTIFY"), makeSymbol("REMOVAL-FCP-JUSTIFY"), makeKeyword("FORWARD-MT-COMBOS"), NIL);

    static private final SubLList $list_alt187 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-SHOP-EFFECT"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-SHOP-EFFECT"), makeKeyword("FORWARD-MT-COMBOS"), NIL);

    static private final SubLList $list_alt188 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("RETURN"), makeKeyword("BINDINGS"), makeKeyword("RESULT-UNIQUENESS"), makeKeyword("BINDINGS"));

    public static final SubLSymbol $kw189$CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");

    static private final SubLList $list_alt190 = list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("RETURN"), makeKeyword("SUPPORTS"), makeKeyword("RESULT-UNIQUENESS"), makeKeyword("PROOF"));

    static private final SubLList $list_alt192 = list(makeSymbol("COMBO-MTS"), makeSymbol("COMBO-SUPPORTS"));

    static private final SubLList $list_alt194 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-QUERY"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-QUERY"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-OF-QUERY"));

    static private final SubLList $list_alt197 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-MATRIX-OF-REACTION-TYPE"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-MATRIX-OF-REACTION-TYPE"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-MATRIX-OF-REACTION-TYPE"));

    static private final SubLList $list_alt201 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-PARSE-TREE-RELATION"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-PARSE-TREE-RELATION"));

    static private final SubLList $list_alt203 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-WORD-STRINGS"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-WORD-STRINGS"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-WORD-STRINGS"));

    static private final SubLList $list_alt205 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-TERM-PHRASES"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-TERM-PHRASES"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-TERM-PHRASES"));

    static private final SubLList $list_alt207 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-RKF-IRRELEVANT-FORT-CACHE"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-RKF-IRRELEVANT-FORT-CACHE"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-RKF-IRRELEVANT-FORT-CACHE"));
}

/**
 * Total time: 1590 ms
 */
