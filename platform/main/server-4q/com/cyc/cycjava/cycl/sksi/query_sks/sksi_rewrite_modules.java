/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sksi.query_sks;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SKSI-REWRITE-MODULES
 * source file: /cyc/top/cycl/sksi/query-sks/sksi-rewrite-modules.lisp
 * created:     2019/07/03 17:38:33
 */
public final class sksi_rewrite_modules extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new sksi_rewrite_modules();

 public static final String myName = "com.cyc.cycjava.cycl.sksi.query_sks.sksi_rewrite_modules";


    public static final SubLSymbol $isa_genls_rule$ = makeSymbol("*ISA-GENLS-RULE*");

    static private final SubLSymbol $sym2$_ISA_GENLS_RULE__INITIALIZER = makeSymbol("*ISA-GENLS-RULE*-INITIALIZER");

    static private final SubLList $list3 = list(reader_make_constant_shell("transitiveViaArg"), reader_make_constant_shell("isa"), reader_make_constant_shell("genls"), TWO_INTEGER);



    public static final SubLSymbol $genl_preds_rule$ = makeSymbol("*GENL-PREDS-RULE*");

    static private final SubLSymbol $sym6$_GENL_PREDS_RULE__INITIALIZER = makeSymbol("*GENL-PREDS-RULE*-INITIALIZER");

    static private final SubLList $list7 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("genlPreds"), makeSymbol("?SPEC"), makeSymbol("?GENL")), cons(makeSymbol("?SPEC"), makeSymbol("?ARGS"))), cons(makeSymbol("?GENL"), makeSymbol("?ARGS")));



    public static final SubLSymbol $genl_inverse_rule$ = makeSymbol("*GENL-INVERSE-RULE*");

    static private final SubLSymbol $sym10$_GENL_INVERSE_RULE__INITIALIZER = makeSymbol("*GENL-INVERSE-RULE*-INITIALIZER");

    static private final SubLList $list11 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("genlInverse"), makeSymbol("?SPEC-INV"), makeSymbol("?GENL")), list(makeSymbol("?SPEC-INV"), makeSymbol("?ARG1"), makeSymbol("?ARG2"))), list(makeSymbol("?GENL"), makeSymbol("?ARG2"), makeSymbol("?ARG1")));

    private static final SubLSymbol $SKSI_ISA_REWRITE_CHECK = makeKeyword("SKSI-ISA-REWRITE-CHECK");

    static private final SubLList $list13 = list(new SubLObject[]{ makeKeyword("MODULE-SUBTYPE"), $SKSI, makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("ANYTHING"), makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("SKSI-ISA-REWRITE-CHECK-APPLICABILITY-FN"), $COST, makeSymbol("SKSI-ISA-REWRITE-CHECK-COST-FN"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("SKSI-ISA-REWRITE-CHECK-EXPAND-FN"), makeKeyword("REWRITE-SUPPORT"), makeSymbol("*ISA-GENLS-RULE*"), makeKeyword("DOCUMENTATION"), makeString("Rewrites #$isa literals into new #$isa literals which can be handled by SKSI lookup modules,\n    where the new arg2 is a spec of the old arg2.  This module implements the isa/genls rule\n    for all SKSI modules, where we want to check an isa relationship."), makeKeyword("EXAMPLE"), makeString("(#$isa ?X #$GeographicalRegion) \n    --->\n    (#$isa ?X #$Country) \n    when we have a (#$isa (#$SchemaObjectFn <SCHEMA>) #$Country) meaning sentence.") });





    private static final SubLSymbol $SKSI_ISA_REWRITE_GENERATE = makeKeyword("SKSI-ISA-REWRITE-GENERATE");

    static private final SubLList $list19 = list(new SubLObject[]{ makeKeyword("MODULE-SUBTYPE"), $SKSI, makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("ANYTHING"), makeKeyword("VARIABLE")), makeKeyword("REQUIRED"), makeSymbol("SKSI-ISA-REWRITE-GENERATE-APPLICABILITY-FN"), $COST, makeSymbol("SKSI-ISA-REWRITE-GENERATE-COST-FN"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("SKSI-ISA-REWRITE-GENERATE-EXPAND-FN"), makeKeyword("REWRITE-CLOSURE"), makeSymbol("SKSI-ISA-REWRITE-GENERATE-CLOSURE"), makeKeyword("REWRITE-SUPPORT"), makeSymbol("*ISA-GENLS-RULE*"), makeKeyword("DOCUMENTATION"), makeString("Rewrites #$isa literals into new #$isa literals which can be handled by SKSI lookup modules,\n    where the new arg2 appears in the arg2 position of an SKSI #$isa meaning sentence.  This \n    module implements the isa/genls rule for all SKSI modules, where we want to generate #$isa \n    relationships."), makeKeyword("EXAMPLE"), makeString("(#$isa (#$SchemaObjectFn <SCHEMA>) ?X) \n    ---> (restriction)\n    when we have a (#$isa (#$SchemaObjectFn <SCHEMA>) #$Country) meaning sentence, then\n    (#$isa (#$SchemaObjectFn <SCHEMA>) #$Country) \n    ---> (rewrites)\n    (#$isa (#$SchemaObjectFn <SCHEMA>) #$GeographicalRegion) \n    (#$isa (#$SchemaObjectFn <SCHEMA>) #$SpatialThing) ...\n    (#$isa (#$SchemaObjectFn <SCHEMA>) #$Thing)") });

    private static final SubLSymbol $SKSI_GENLPREDS_REWRITE = makeKeyword("SKSI-GENLPREDS-REWRITE");

    static private final SubLList $list21 = list(new SubLObject[]{ makeKeyword("MODULE-SUBTYPE"), $SKSI, makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), cons($FORT, makeKeyword("ANYTHING")), makeKeyword("REQUIRED"), makeSymbol("SKSI-GENLPREDS-REWRITE-APPLICABILITY-FN"), $COST, makeSymbol("SKSI-GENLPREDS-REWRITE-COST-FN"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("SKSI-GENLPREDS-REWRITE-EXPAND-FN"), makeKeyword("REWRITE-SUPPORT"), makeSymbol("*GENL-PREDS-RULE*"), makeKeyword("DOCUMENTATION"), makeString("Rewrites literals into new literals which can be handled by SKSI lookup modules,\n    where the new literals have predicates which are SKSI meaning sentence predicates,\n    and are spec-preds of the original literal predicate. This module implements \n    the genlPreds rule for all SKSI modules."), makeKeyword("EXAMPLE"), makeString("1.\n    (#$isa ?X ?Y)\n    --->\n    (#$ethnicity ?X ?Y)") });



    private static final SubLSymbol $SKSI_GENLINVERSE_REWRITE = makeKeyword("SKSI-GENLINVERSE-REWRITE");

    static private final SubLList $list25 = list(new SubLObject[]{ makeKeyword("MODULE-SUBTYPE"), $SKSI, makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list($FORT, makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), makeKeyword("REQUIRED"), makeSymbol("SKSI-GENLINVERSE-REWRITE-APPLICABILITY-FN"), $COST, makeSymbol("SKSI-GENLINVERSE-REWRITE-COST-FN"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("SKSI-GENLINVERSE-REWRITE-EXPAND-FN"), makeKeyword("REWRITE-SUPPORT"), makeSymbol("*GENL-INVERSE-RULE*"), makeKeyword("DOCUMENTATION"), makeString("Rewrites literals into new literals which can be handled by SKSI lookup modules,\n    where the new literals have predicates which are SKSI meaning sentence predicates,\n    and are spec-inverses of the original literal predicate. This module implements \n    the genlInverse rule for all SKSI modules."), makeKeyword("EXAMPLE"), makeString("1.\n    (#$signifies ?STR ?PERS)\n    --->\n    (#$nameString ?PERS ?STR)\n   ") });

    static private final SubLSymbol $sym26$SENTENCE_CONTAINS_SUBSENTENCE_WITH_COMMUTATIVE_MEANING_SENTENCE_P = makeSymbol("SENTENCE-CONTAINS-SUBSENTENCE-WITH-COMMUTATIVE-MEANING-SENTENCE-PRED?");

    static private final SubLSymbol $sym27$SENTENCE_WITH_COMMUTATIVE_MEANING_SENTENCE_PRED_ = makeSymbol("SENTENCE-WITH-COMMUTATIVE-MEANING-SENTENCE-PRED?");



    private static final SubLList $list30 = list(makeSymbol("QUERY"), makeSymbol("SUPPORTS"));

    public static final SubLObject isa_genls_ruleX_initializer_alt() {
        return hl_supports.find_assertion_or_make_support($list_alt3, $$BaseKB);
    }

    public static SubLObject isa_genls_ruleX_initializer() {
        return hl_supports.find_assertion_or_make_support($list3, $$BaseKB);
    }

    public static final SubLObject genl_preds_ruleX_initializer_alt() {
        return hl_supports.find_assertion_or_make_support($list_alt7, $$UniversalVocabularyMt);
    }

    public static SubLObject genl_preds_ruleX_initializer() {
        return hl_supports.find_assertion_or_make_support($list7, $$UniversalVocabularyMt);
    }

    public static final SubLObject genl_inverse_ruleX_initializer_alt() {
        return hl_supports.find_assertion_or_make_support($list_alt11, $$BaseKB);
    }

    public static SubLObject genl_inverse_ruleX_initializer() {
        return hl_supports.find_assertion_or_make_support($list11, $$BaseKB);
    }

    public static final SubLObject sksi_isa_rewrite_check_applicability_fn_alt(SubLObject asent) {
        if (NIL == sksi_macros.sksi_slrm_genl_pred_and_genls_reasoning_onP()) {
            return NIL;
        }
        {
            SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            return makeBoolean((NIL != sksi_removal_module_generation.isa_sks_term_to_cycl_term_mt_relevantP()) && (NIL != sksi_removal_module_generation.any_sks_term_spec_to_cycl_term_in_relevant_mtP(arg2)));
        }
    }

    public static SubLObject sksi_isa_rewrite_check_applicability_fn(final SubLObject asent) {
        if (NIL == sksi_macros.sksi_slrm_genl_pred_and_genls_reasoning_onP()) {
            return NIL;
        }
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        return makeBoolean((NIL != sksi_removal_module_generation.isa_sks_term_to_cycl_term_mt_relevantP()) && (NIL != sksi_removal_module_generation.any_sks_term_spec_to_cycl_term_in_relevant_mtP(arg2)));
    }

    public static final SubLObject sksi_isa_rewrite_check_cost_fn_alt(SubLObject asent) {
        {
            SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            return length(sksi_removal_module_generation.all_sksi_relevant_rewrite_specs_for_term(arg2));
        }
    }

    public static SubLObject sksi_isa_rewrite_check_cost_fn(final SubLObject asent) {
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        return length(sksi_removal_module_generation.all_sksi_relevant_rewrite_specs_for_term(arg2));
    }

    public static final SubLObject sksi_isa_rewrite_check_expand_fn_alt(SubLObject asent) {
        {
            SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            SubLObject new_arg2s = sksi_removal_module_generation.all_sksi_relevant_rewrite_specs_for_term(arg2);
            SubLObject cdolist_list_var = new_arg2s;
            SubLObject new_arg2 = NIL;
            for (new_arg2 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , new_arg2 = cdolist_list_var.first()) {
                {
                    SubLObject new_asent = list($$isa, arg1, new_arg2);
                    SubLObject query = inference_datastructures_problem_query.asent_sense_and_mt_to_problem_query(new_asent, $POS, inference_worker_rewrite.current_rewrite_mt());
                    SubLObject supports = list(arguments.make_hl_support($GENLS, list($$genls, new_arg2, arg2), UNPROVIDED, UNPROVIDED));
                    inference_worker_rewrite.rewrite_add_link(query, supports);
                }
            }
        }
        return NIL;
    }

    public static SubLObject sksi_isa_rewrite_check_expand_fn(final SubLObject asent) {
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject new_arg2s = cdolist_list_var = sksi_removal_module_generation.all_sksi_relevant_rewrite_specs_for_term(arg2);
        SubLObject new_arg2 = NIL;
        new_arg2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject new_asent = list($$isa, arg1, new_arg2);
            final SubLObject query = inference_datastructures_problem_query.asent_sense_and_mt_to_problem_query(new_asent, $POS, inference_worker_rewrite.current_rewrite_mt());
            final SubLObject supports = list(arguments.make_hl_support($GENLS, list($$genls, new_arg2, arg2), UNPROVIDED, UNPROVIDED));
            inference_worker_rewrite.rewrite_add_link(query, supports);
            cdolist_list_var = cdolist_list_var.rest();
            new_arg2 = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject sksi_isa_rewrite_generate_applicability_fn_alt(SubLObject asent) {
        if (NIL == sksi_macros.sksi_slrm_genl_pred_and_genls_reasoning_onP()) {
            return NIL;
        }
        return sksi_removal_module_generation.isa_sks_term_to_cycl_term_mt_relevantP();
    }

    public static SubLObject sksi_isa_rewrite_generate_applicability_fn(final SubLObject asent) {
        if (NIL == sksi_macros.sksi_slrm_genl_pred_and_genls_reasoning_onP()) {
            return NIL;
        }
        return sksi_removal_module_generation.isa_sks_term_to_cycl_term_mt_relevantP();
    }

    public static final SubLObject sksi_isa_rewrite_generate_cost_fn_alt(SubLObject asent) {
        return length(sksi_removal_module_generation.all_sksi_relevant_rewrite_isas());
    }

    public static SubLObject sksi_isa_rewrite_generate_cost_fn(final SubLObject asent) {
        return length(sksi_removal_module_generation.all_sksi_relevant_rewrite_isas());
    }

    public static final SubLObject sksi_isa_rewrite_generate_expand_fn_alt(SubLObject asent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject isas = sksi_removal_module_generation.all_sksi_relevant_rewrite_isas();
                SubLObject cdolist_list_var = isas;
                SubLObject v_isa = NIL;
                for (v_isa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_isa = cdolist_list_var.first()) {
                    {
                        SubLObject new_asent = list($$isa, arg1, v_isa);
                        SubLObject query = inference_datastructures_problem_query.asent_sense_and_mt_to_problem_query(new_asent, $POS, mt_relevance_macros.$mt$.getDynamicValue(thread));
                        inference_worker_rewrite.restriction_rewrite_add_link(query, NIL);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject sksi_isa_rewrite_generate_expand_fn(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject isas = cdolist_list_var = sksi_removal_module_generation.all_sksi_relevant_rewrite_isas();
        SubLObject v_isa = NIL;
        v_isa = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject new_asent = list($$isa, arg1, v_isa);
            final SubLObject query = inference_datastructures_problem_query.asent_sense_and_mt_to_problem_query(new_asent, $POS, mt_relevance_macros.$mt$.getDynamicValue(thread));
            inference_worker_rewrite.restriction_rewrite_add_link(query, NIL);
            cdolist_list_var = cdolist_list_var.rest();
            v_isa = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject sksi_isa_rewrite_generate_closure_alt(SubLObject asent) {
        {
            SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            SubLObject v_genls = remove(arg2, genls.all_genls(arg2, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject result = NIL;
            SubLObject cdolist_list_var = v_genls;
            SubLObject genl = NIL;
            for (genl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genl = cdolist_list_var.first()) {
                {
                    SubLObject new_query = list($$isa, arg1, genl);
                    SubLObject support = arguments.make_hl_support($GENLS, list($$genls, arg2, genl), UNPROVIDED, UNPROVIDED);
                    SubLObject supports = list(support);
                    result = cons(list(new_query, supports), result);
                }
            }
            return result;
        }
    }

    public static SubLObject sksi_isa_rewrite_generate_closure(final SubLObject asent) {
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject v_genls = remove(arg2, genls.all_genls(arg2, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = v_genls;
        SubLObject genl = NIL;
        genl = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject new_query = list($$isa, arg1, genl);
            final SubLObject support = arguments.make_hl_support($GENLS, list($$genls, arg2, genl), UNPROVIDED, UNPROVIDED);
            final SubLObject supports = list(support);
            result = cons(list(new_query, supports), result);
            cdolist_list_var = cdolist_list_var.rest();
            genl = cdolist_list_var.first();
        } 
        return result;
    }

    public static final SubLObject sksi_genlpreds_rewrite_applicability_fn_alt(SubLObject asent) {
        if (NIL == sksi_macros.sksi_slrm_genl_pred_and_genls_reasoning_onP()) {
            return NIL;
        }
        {
            SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
            return makeBoolean((NIL != sksi_removal_module_generation.any_sksi_meaning_sentence_mt_relevantP()) && (NIL != sksi_removal_module_generation.any_sksi_meaning_sentence_spec_predP(pred)));
        }
    }

    public static SubLObject sksi_genlpreds_rewrite_applicability_fn(final SubLObject asent) {
        if (NIL == sksi_macros.sksi_slrm_genl_pred_and_genls_reasoning_onP()) {
            return NIL;
        }
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        return makeBoolean((NIL != sksi_removal_module_generation.any_sksi_meaning_sentence_mt_relevantP()) && (NIL != sksi_removal_module_generation.any_sksi_meaning_sentence_spec_predP(pred)));
    }

    public static final SubLObject sksi_genlpreds_rewrite_cost_fn_alt(SubLObject asent) {
        {
            SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
            return length(sksi_removal_module_generation.all_sksi_relevant_rewrite_spec_preds_for_pred(pred));
        }
    }

    public static SubLObject sksi_genlpreds_rewrite_cost_fn(final SubLObject asent) {
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        return length(sksi_removal_module_generation.all_sksi_relevant_rewrite_spec_preds_for_pred(pred));
    }

    public static final SubLObject sksi_genlpreds_rewrite_expand_fn_alt(SubLObject asent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
                SubLObject args = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
                SubLObject spec_preds = sksi_removal_module_generation.all_sksi_relevant_rewrite_spec_preds_for_pred(pred);
                SubLObject cdolist_list_var = spec_preds;
                SubLObject spec_pred = NIL;
                for (spec_pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , spec_pred = cdolist_list_var.first()) {
                    {
                        SubLObject asent_1 = make_el_formula(spec_pred, args, UNPROVIDED);
                        if (NIL != wff.el_wffP(asent_1, UNPROVIDED, UNPROVIDED)) {
                            {
                                SubLObject query = inference_datastructures_problem_query.asent_sense_and_mt_to_problem_query(asent_1, $POS, mt_relevance_macros.$mt$.getDynamicValue(thread));
                                SubLObject supports = list(arguments.make_hl_support($GENLPREDS, list($$genlPreds, spec_pred, pred), UNPROVIDED, UNPROVIDED));
                                inference_worker_rewrite.rewrite_add_link(query, supports);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject sksi_genlpreds_rewrite_expand_fn(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject args = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject spec_preds = cdolist_list_var = sksi_removal_module_generation.all_sksi_relevant_rewrite_spec_preds_for_pred(pred);
        SubLObject spec_pred = NIL;
        spec_pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject asent_$1 = make_el_formula(spec_pred, args, UNPROVIDED);
            if (NIL != wff.el_wffP(asent_$1, UNPROVIDED, UNPROVIDED)) {
                final SubLObject query = inference_datastructures_problem_query.asent_sense_and_mt_to_problem_query(asent_$1, $POS, mt_relevance_macros.$mt$.getDynamicValue(thread));
                final SubLObject supports = list(arguments.make_hl_support($GENLPREDS, list($$genlPreds, spec_pred, pred), UNPROVIDED, UNPROVIDED));
                inference_worker_rewrite.rewrite_add_link(query, supports);
            }
            cdolist_list_var = cdolist_list_var.rest();
            spec_pred = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject sksi_genlinverse_rewrite_applicability_fn_alt(SubLObject asent) {
        if (NIL == sksi_macros.sksi_slrm_genl_pred_and_genls_reasoning_onP()) {
            return NIL;
        }
        {
            SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
            return makeBoolean((NIL != sksi_removal_module_generation.any_sksi_meaning_sentence_mt_relevantP()) && ((NIL != sksi_removal_module_generation.any_sksi_meaning_sentence_spec_inverseP(pred)) || (NIL != com.cyc.cycjava.cycl.sksi.query_sks.sksi_rewrite_modules.sentence_contains_subsentence_with_commutative_meaning_sentence_predP(asent))));
        }
    }

    public static SubLObject sksi_genlinverse_rewrite_applicability_fn(final SubLObject asent) {
        if (NIL == sksi_macros.sksi_slrm_genl_pred_and_genls_reasoning_onP()) {
            return NIL;
        }
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        return makeBoolean((NIL != sksi_removal_module_generation.any_sksi_meaning_sentence_mt_relevantP()) && ((NIL != sksi_removal_module_generation.any_sksi_meaning_sentence_spec_inverseP(pred)) || (NIL != sentence_contains_subsentence_with_commutative_meaning_sentence_predP(asent))));
    }

    public static final SubLObject sentence_contains_subsentence_with_commutative_meaning_sentence_predP_internal_alt(SubLObject asent) {
        return cycl_utilities.expression_find_if($sym27$SENTENCE_WITH_COMMUTATIVE_MEANING_SENTENCE_PRED_, asent, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sentence_contains_subsentence_with_commutative_meaning_sentence_predP_internal(final SubLObject asent) {
        return cycl_utilities.expression_find_if($sym27$SENTENCE_WITH_COMMUTATIVE_MEANING_SENTENCE_PRED_, asent, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject sentence_contains_subsentence_with_commutative_meaning_sentence_predP_alt(SubLObject asent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.query_sks.sksi_rewrite_modules.sentence_contains_subsentence_with_commutative_meaning_sentence_predP_internal(asent);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym26$SENTENCE_CONTAINS_SUBSENTENCE_WITH_COMMUTATIVE_MEANING_SENTENCE_P, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym26$SENTENCE_CONTAINS_SUBSENTENCE_WITH_COMMUTATIVE_MEANING_SENTENCE_P, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym26$SENTENCE_CONTAINS_SUBSENTENCE_WITH_COMMUTATIVE_MEANING_SENTENCE_P, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, asent, $kw28$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw28$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.query_sks.sksi_rewrite_modules.sentence_contains_subsentence_with_commutative_meaning_sentence_predP_internal(asent)));
                        memoization_state.caching_state_put(caching_state, asent, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject sentence_contains_subsentence_with_commutative_meaning_sentence_predP(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return sentence_contains_subsentence_with_commutative_meaning_sentence_predP_internal(asent);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym26$SENTENCE_CONTAINS_SUBSENTENCE_WITH_COMMUTATIVE_MEANING_SENTENCE_P, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym26$SENTENCE_CONTAINS_SUBSENTENCE_WITH_COMMUTATIVE_MEANING_SENTENCE_P, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym26$SENTENCE_CONTAINS_SUBSENTENCE_WITH_COMMUTATIVE_MEANING_SENTENCE_P, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, asent, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(sentence_contains_subsentence_with_commutative_meaning_sentence_predP_internal(asent)));
            memoization_state.caching_state_put(caching_state, asent, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject sentence_with_commutative_meaning_sentence_predP_alt(SubLObject v_object) {
        return makeBoolean(((NIL != cycl_grammar.cycl_sentence_p(v_object)) && (NIL != fort_types_interface.isa_commutative_predicateP(cycl_utilities.formula_operator(v_object), UNPROVIDED))) && (NIL != sksi_removal_module_generation.meaning_sentence_predP(cycl_utilities.formula_operator(v_object))));
    }

    public static SubLObject sentence_with_commutative_meaning_sentence_predP(final SubLObject v_object) {
        return makeBoolean(((NIL != cycl_grammar.cycl_sentence_p(v_object)) && (NIL != fort_types_interface.isa_commutative_predicateP(cycl_utilities.formula_operator(v_object), UNPROVIDED))) && (NIL != sksi_removal_module_generation.meaning_sentence_predP(cycl_utilities.formula_operator(v_object))));
    }

    public static final SubLObject sksi_genlinverse_rewrite_cost_fn_alt(SubLObject asent) {
        {
            SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
            SubLObject cost = length(sksi_removal_module_generation.all_sksi_relevant_rewrite_spec_inverses_for_pred(pred));
            if (NIL != com.cyc.cycjava.cycl.sksi.query_sks.sksi_rewrite_modules.sentence_contains_subsentence_with_commutative_meaning_sentence_predP(asent)) {
                cost = add(cost, length(sksi_infrastructure_utilities.formula_commutative_permutations_memoized(asent, T, UNPROVIDED)));
            }
            return cost;
        }
    }

    public static SubLObject sksi_genlinverse_rewrite_cost_fn(final SubLObject asent) {
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject cost = length(sksi_removal_module_generation.all_sksi_relevant_rewrite_spec_inverses_for_pred(pred));
        if (NIL != sentence_contains_subsentence_with_commutative_meaning_sentence_predP(asent)) {
            cost = add(cost, length(sksi_infrastructure_utilities.formula_commutative_permutations_memoized(asent, T, UNPROVIDED)));
        }
        return cost;
    }

    public static final SubLObject sksi_genlinverse_rewrite_expand_fn_alt(SubLObject asent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
                SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                SubLObject args = list(arg2, arg1);
                SubLObject spec_invs = sksi_removal_module_generation.all_sksi_relevant_rewrite_spec_inverses_for_pred(pred);
                SubLObject rewrite_queries = NIL;
                {
                    SubLObject cdolist_list_var = spec_invs;
                    SubLObject spec_inv = NIL;
                    for (spec_inv = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , spec_inv = cdolist_list_var.first()) {
                        {
                            SubLObject new_asent = make_el_formula(spec_inv, args, UNPROVIDED);
                            if (NIL != wff.el_wffP(new_asent, UNPROVIDED, UNPROVIDED)) {
                                {
                                    SubLObject query = inference_datastructures_problem_query.asent_sense_and_mt_to_problem_query(new_asent, $POS, mt_relevance_macros.$mt$.getDynamicValue(thread));
                                    SubLObject supports = list(arguments.make_hl_support($GENLPREDS, list($$genlInverse, spec_inv, pred), UNPROVIDED, UNPROVIDED));
                                    rewrite_queries = cons(list(query, supports), rewrite_queries);
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject commutative_pred = cycl_utilities.formula_operator(com.cyc.cycjava.cycl.sksi.query_sks.sksi_rewrite_modules.sentence_contains_subsentence_with_commutative_meaning_sentence_predP(asent));
                    if (NIL != commutative_pred) {
                        {
                            SubLObject commutative_permutations = sksi_infrastructure_utilities.formula_commutative_permutations_memoized(asent, T, UNPROVIDED);
                            SubLObject cdolist_list_var = commutative_permutations;
                            SubLObject perm = NIL;
                            for (perm = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , perm = cdolist_list_var.first()) {
                                if (NIL != wff.el_wffP(perm, UNPROVIDED, UNPROVIDED)) {
                                    {
                                        SubLObject query = inference_datastructures_problem_query.asent_sense_and_mt_to_problem_query(perm, $POS, mt_relevance_macros.$mt$.getDynamicValue(thread));
                                        SubLObject supports = list(arguments.make_hl_support($GENLPREDS, list($$genlInverse, commutative_pred, commutative_pred), UNPROVIDED, UNPROVIDED));
                                        rewrite_queries = cons(list(query, supports), rewrite_queries);
                                    }
                                }
                            }
                        }
                    }
                }
                rewrite_queries = list_utilities.fast_delete_duplicates(rewrite_queries, symbol_function(EQUAL), symbol_function(FIRST), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                {
                    SubLObject cdolist_list_var = rewrite_queries;
                    SubLObject query_supports_pair = NIL;
                    for (query_supports_pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , query_supports_pair = cdolist_list_var.first()) {
                        {
                            SubLObject datum = query_supports_pair;
                            SubLObject current = datum;
                            SubLObject query = NIL;
                            SubLObject supports = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt31);
                            query = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt31);
                            supports = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                inference_worker_rewrite.rewrite_add_link(query, supports);
                            } else {
                                cdestructuring_bind_error(datum, $list_alt31);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject sksi_genlinverse_rewrite_expand_fn(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject args = list(arg2, arg1);
        final SubLObject spec_invs = sksi_removal_module_generation.all_sksi_relevant_rewrite_spec_inverses_for_pred(pred);
        SubLObject rewrite_queries = NIL;
        SubLObject cdolist_list_var = spec_invs;
        SubLObject spec_inv = NIL;
        spec_inv = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject new_asent = make_el_formula(spec_inv, args, UNPROVIDED);
            if (NIL != wff.el_wffP(new_asent, UNPROVIDED, UNPROVIDED)) {
                final SubLObject query = inference_datastructures_problem_query.asent_sense_and_mt_to_problem_query(new_asent, $POS, mt_relevance_macros.$mt$.getDynamicValue(thread));
                final SubLObject supports = list(arguments.make_hl_support($GENLPREDS, list($$genlInverse, spec_inv, pred), UNPROVIDED, UNPROVIDED));
                rewrite_queries = cons(list(query, supports), rewrite_queries);
            }
            cdolist_list_var = cdolist_list_var.rest();
            spec_inv = cdolist_list_var.first();
        } 
        final SubLObject commutative_pred = cycl_utilities.formula_operator(sentence_contains_subsentence_with_commutative_meaning_sentence_predP(asent));
        if (NIL != commutative_pred) {
            SubLObject cdolist_list_var2;
            final SubLObject commutative_permutations = cdolist_list_var2 = sksi_infrastructure_utilities.formula_commutative_permutations_memoized(asent, T, UNPROVIDED);
            SubLObject perm = NIL;
            perm = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                if (NIL != wff.el_wffP(perm, UNPROVIDED, UNPROVIDED)) {
                    final SubLObject query2 = inference_datastructures_problem_query.asent_sense_and_mt_to_problem_query(perm, $POS, mt_relevance_macros.$mt$.getDynamicValue(thread));
                    final SubLObject supports2 = list(arguments.make_hl_support($GENLPREDS, list($$genlInverse, commutative_pred, commutative_pred), UNPROVIDED, UNPROVIDED));
                    rewrite_queries = cons(list(query2, supports2), rewrite_queries);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                perm = cdolist_list_var2.first();
            } 
        }
        rewrite_queries = cdolist_list_var = list_utilities.fast_delete_duplicates(rewrite_queries, symbol_function(EQUAL), symbol_function(FIRST), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject query_supports_pair = NIL;
        query_supports_pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = query_supports_pair;
            SubLObject query2 = NIL;
            SubLObject supports2 = NIL;
            destructuring_bind_must_consp(current, datum, $list30);
            query2 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list30);
            supports2 = current.first();
            current = current.rest();
            if (NIL == current) {
                inference_worker_rewrite.rewrite_add_link(query2, supports2);
            } else {
                cdestructuring_bind_error(datum, $list30);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_supports_pair = cdolist_list_var.first();
        } 
        return NIL;
    }

    static private final SubLList $list_alt3 = list(reader_make_constant_shell("transitiveViaArg"), reader_make_constant_shell("isa"), reader_make_constant_shell("genls"), TWO_INTEGER);

    static private final SubLList $list_alt7 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("genlPreds"), makeSymbol("?SPEC"), makeSymbol("?GENL")), cons(makeSymbol("?SPEC"), makeSymbol("?ARGS"))), cons(makeSymbol("?GENL"), makeSymbol("?ARGS")));

    static private final SubLList $list_alt11 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("genlInverse"), makeSymbol("?SPEC-INV"), makeSymbol("?GENL")), list(makeSymbol("?SPEC-INV"), makeSymbol("?ARG1"), makeSymbol("?ARG2"))), list(makeSymbol("?GENL"), makeSymbol("?ARG2"), makeSymbol("?ARG1")));

    public static SubLObject declare_sksi_rewrite_modules_file() {
        declareFunction("isa_genls_ruleX_initializer", "*ISA-GENLS-RULE*-INITIALIZER", 0, 0, false);
        declareFunction("genl_preds_ruleX_initializer", "*GENL-PREDS-RULE*-INITIALIZER", 0, 0, false);
        declareFunction("genl_inverse_ruleX_initializer", "*GENL-INVERSE-RULE*-INITIALIZER", 0, 0, false);
        declareFunction("sksi_isa_rewrite_check_applicability_fn", "SKSI-ISA-REWRITE-CHECK-APPLICABILITY-FN", 1, 0, false);
        declareFunction("sksi_isa_rewrite_check_cost_fn", "SKSI-ISA-REWRITE-CHECK-COST-FN", 1, 0, false);
        declareFunction("sksi_isa_rewrite_check_expand_fn", "SKSI-ISA-REWRITE-CHECK-EXPAND-FN", 1, 0, false);
        declareFunction("sksi_isa_rewrite_generate_applicability_fn", "SKSI-ISA-REWRITE-GENERATE-APPLICABILITY-FN", 1, 0, false);
        declareFunction("sksi_isa_rewrite_generate_cost_fn", "SKSI-ISA-REWRITE-GENERATE-COST-FN", 1, 0, false);
        declareFunction("sksi_isa_rewrite_generate_expand_fn", "SKSI-ISA-REWRITE-GENERATE-EXPAND-FN", 1, 0, false);
        declareFunction("sksi_isa_rewrite_generate_closure", "SKSI-ISA-REWRITE-GENERATE-CLOSURE", 1, 0, false);
        declareFunction("sksi_genlpreds_rewrite_applicability_fn", "SKSI-GENLPREDS-REWRITE-APPLICABILITY-FN", 1, 0, false);
        declareFunction("sksi_genlpreds_rewrite_cost_fn", "SKSI-GENLPREDS-REWRITE-COST-FN", 1, 0, false);
        declareFunction("sksi_genlpreds_rewrite_expand_fn", "SKSI-GENLPREDS-REWRITE-EXPAND-FN", 1, 0, false);
        declareFunction("sksi_genlinverse_rewrite_applicability_fn", "SKSI-GENLINVERSE-REWRITE-APPLICABILITY-FN", 1, 0, false);
        declareFunction("sentence_contains_subsentence_with_commutative_meaning_sentence_predP_internal", "SENTENCE-CONTAINS-SUBSENTENCE-WITH-COMMUTATIVE-MEANING-SENTENCE-PRED?-INTERNAL", 1, 0, false);
        declareFunction("sentence_contains_subsentence_with_commutative_meaning_sentence_predP", "SENTENCE-CONTAINS-SUBSENTENCE-WITH-COMMUTATIVE-MEANING-SENTENCE-PRED?", 1, 0, false);
        declareFunction("sentence_with_commutative_meaning_sentence_predP", "SENTENCE-WITH-COMMUTATIVE-MEANING-SENTENCE-PRED?", 1, 0, false);
        declareFunction("sksi_genlinverse_rewrite_cost_fn", "SKSI-GENLINVERSE-REWRITE-COST-FN", 1, 0, false);
        declareFunction("sksi_genlinverse_rewrite_expand_fn", "SKSI-GENLINVERSE-REWRITE-EXPAND-FN", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt13 = list(new SubLObject[]{ makeKeyword("MODULE-SUBTYPE"), $SKSI, makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("ANYTHING"), makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("SKSI-ISA-REWRITE-CHECK-APPLICABILITY-FN"), $COST, makeSymbol("SKSI-ISA-REWRITE-CHECK-COST-FN"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("SKSI-ISA-REWRITE-CHECK-EXPAND-FN"), makeKeyword("REWRITE-SUPPORT"), makeSymbol("*ISA-GENLS-RULE*"), makeKeyword("DOCUMENTATION"), makeString("Rewrites #$isa literals into new #$isa literals which can be handled by SKSI lookup modules,\n    where the new arg2 is a spec of the old arg2.  This module implements the isa/genls rule\n    for all SKSI modules, where we want to check an isa relationship."), makeKeyword("EXAMPLE"), makeString("(#$isa ?X #$GeographicalRegion) \n    --->\n    (#$isa ?X #$Country) \n    when we have a (#$isa (#$SchemaObjectFn <SCHEMA>) #$Country) meaning sentence.") });

    static private final SubLList $list_alt19 = list(new SubLObject[]{ makeKeyword("MODULE-SUBTYPE"), $SKSI, makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), makeKeyword("ANYTHING"), makeKeyword("VARIABLE")), makeKeyword("REQUIRED"), makeSymbol("SKSI-ISA-REWRITE-GENERATE-APPLICABILITY-FN"), $COST, makeSymbol("SKSI-ISA-REWRITE-GENERATE-COST-FN"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("SKSI-ISA-REWRITE-GENERATE-EXPAND-FN"), makeKeyword("REWRITE-CLOSURE"), makeSymbol("SKSI-ISA-REWRITE-GENERATE-CLOSURE"), makeKeyword("REWRITE-SUPPORT"), makeSymbol("*ISA-GENLS-RULE*"), makeKeyword("DOCUMENTATION"), makeString("Rewrites #$isa literals into new #$isa literals which can be handled by SKSI lookup modules,\n    where the new arg2 appears in the arg2 position of an SKSI #$isa meaning sentence.  This \n    module implements the isa/genls rule for all SKSI modules, where we want to generate #$isa \n    relationships."), makeKeyword("EXAMPLE"), makeString("(#$isa (#$SchemaObjectFn <SCHEMA>) ?X) \n    ---> (restriction)\n    when we have a (#$isa (#$SchemaObjectFn <SCHEMA>) #$Country) meaning sentence, then\n    (#$isa (#$SchemaObjectFn <SCHEMA>) #$Country) \n    ---> (rewrites)\n    (#$isa (#$SchemaObjectFn <SCHEMA>) #$GeographicalRegion) \n    (#$isa (#$SchemaObjectFn <SCHEMA>) #$SpatialThing) ...\n    (#$isa (#$SchemaObjectFn <SCHEMA>) #$Thing)") });

    public static SubLObject init_sksi_rewrite_modules_file() {
        defvar("*ISA-GENLS-RULE*", $UNINITIALIZED);
        defvar("*GENL-PREDS-RULE*", $UNINITIALIZED);
        defvar("*GENL-INVERSE-RULE*", $UNINITIALIZED);
        return NIL;
    }

    public static SubLObject setup_sksi_rewrite_modules_file() {
        register_kb_variable_initialization($isa_genls_rule$, $sym2$_ISA_GENLS_RULE__INITIALIZER);
        register_kb_variable_initialization($genl_preds_rule$, $sym6$_GENL_PREDS_RULE__INITIALIZER);
        register_kb_variable_initialization($genl_inverse_rule$, $sym10$_GENL_INVERSE_RULE__INITIALIZER);
        inference_modules.inference_rewrite_module($SKSI_ISA_REWRITE_CHECK, $list13);
        inference_modules.inference_rewrite_module($SKSI_ISA_REWRITE_GENERATE, $list19);
        inference_modules.inference_rewrite_module($SKSI_GENLPREDS_REWRITE, $list21);
        inference_modules.inference_rewrite_module($SKSI_GENLINVERSE_REWRITE, $list25);
        memoization_state.note_memoized_function($sym26$SENTENCE_CONTAINS_SUBSENTENCE_WITH_COMMUTATIVE_MEANING_SENTENCE_P);
        return NIL;
    }

    static private final SubLList $list_alt21 = list(new SubLObject[]{ makeKeyword("MODULE-SUBTYPE"), $SKSI, makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), cons($FORT, makeKeyword("ANYTHING")), makeKeyword("REQUIRED"), makeSymbol("SKSI-GENLPREDS-REWRITE-APPLICABILITY-FN"), $COST, makeSymbol("SKSI-GENLPREDS-REWRITE-COST-FN"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("SKSI-GENLPREDS-REWRITE-EXPAND-FN"), makeKeyword("REWRITE-SUPPORT"), makeSymbol("*GENL-PREDS-RULE*"), makeKeyword("DOCUMENTATION"), makeString("Rewrites literals into new literals which can be handled by SKSI lookup modules,\n    where the new literals have predicates which are SKSI meaning sentence predicates,\n    and are spec-preds of the original literal predicate. This module implements \n    the genlPreds rule for all SKSI modules."), makeKeyword("EXAMPLE"), makeString("1.\n    (#$isa ?X ?Y)\n    --->\n    (#$ethnicity ?X ?Y)") });

    @Override
    public void declareFunctions() {
        declare_sksi_rewrite_modules_file();
    }

    @Override
    public void initializeVariables() {
        init_sksi_rewrite_modules_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sksi_rewrite_modules_file();
    }

    static {
    }

    static private final SubLList $list_alt25 = list(new SubLObject[]{ makeKeyword("MODULE-SUBTYPE"), $SKSI, makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list($FORT, makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), makeKeyword("REQUIRED"), makeSymbol("SKSI-GENLINVERSE-REWRITE-APPLICABILITY-FN"), $COST, makeSymbol("SKSI-GENLINVERSE-REWRITE-COST-FN"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("SKSI-GENLINVERSE-REWRITE-EXPAND-FN"), makeKeyword("REWRITE-SUPPORT"), makeSymbol("*GENL-INVERSE-RULE*"), makeKeyword("DOCUMENTATION"), makeString("Rewrites literals into new literals which can be handled by SKSI lookup modules,\n    where the new literals have predicates which are SKSI meaning sentence predicates,\n    and are spec-inverses of the original literal predicate. This module implements \n    the genlInverse rule for all SKSI modules."), makeKeyword("EXAMPLE"), makeString("1.\n    (#$signifies ?STR ?PERS)\n    --->\n    (#$nameString ?PERS ?STR)\n   ") });

    public static final SubLSymbol $kw28$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLList $list_alt31 = list(makeSymbol("QUERY"), makeSymbol("SUPPORTS"));
}

/**
 * Total time: 231 ms
 */
