package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.define_obsolete_register;
import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.make_formula;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_macro;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class mt_relevance_macros extends SubLTranslatedFile {
    public static final SubLFile me = new mt_relevance_macros();

    public static final String myName = "com.cyc.cycjava.cycl.mt_relevance_macros";

    public static final String myFingerPrint = "94aed547e114a738d6c16f7423e3ef87df9d555b0fb83b8edd7cb05b182ecc7d";



    // defparameter
    /**
     * A ubiquitous parameter used to dynamically bind the current mt assumptions,
     * if they can be expressed by a single mt.
     */
    public static final SubLSymbol $mt$ = makeSymbol("*MT*");



    // Internal Constants
    public static final SubLList $list0 = list(makeSymbol("INLINE"), makeSymbol("MT-FUNCTION-EQ"), makeSymbol("RELEVANT-MT-FUNCTION-EQ"));

    private static final SubLList $list1 = list(makeSymbol("FUNCTION"), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol $relevant_mt_function$ = makeSymbol("*RELEVANT-MT-FUNCTION*");

    private static final SubLList $list4 = list(makeSymbol("MT"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym5$_MT_ = makeSymbol("*MT*");

    private static final SubLSymbol IN_MT_LIST = makeSymbol("IN-MT-LIST");

    public static final SubLList $list7 = list(makeSymbol("WITH-MT-LIST"), makeSymbol("WITH-MT-LIST-AND-GENL-MTS"), makeSymbol("POSSIBLY-WITH-INFERENCE-MT-RELEVANCE-INTERNAL"));

    private static final SubLList $list8 = list(makeSymbol("MT-LIST"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $relevant_mts$ = makeSymbol("*RELEVANT-MTS*");

    private static final SubLList $list10 = list(makeSymbol("INLINE"), makeSymbol("RELEVANT-MT-IS-EVERYTHING"), makeSymbol("RELEVANT-MT-IS-ANY-MT"), makeSymbol("RELEVANT-MT-IS-EQ"), makeSymbol("RELEVANT-MT-IS-IN-LIST"), makeSymbol("RELEVANT-MT-IS-GENL-MT"), makeSymbol("RELEVANT-MT-IS-SPEC-MT"), makeSymbol("RELEVANT-MT-IS-GENL-MT-OF-LIST-MEMBER"));



    private static final SubLSymbol SPECIAL_CORE_LOOP_MT_P = makeSymbol("SPECIAL-CORE-LOOP-MT-P");

    private static final SubLSymbol CORE_MICROTHEORY_P = makeSymbol("CORE-MICROTHEORY-P");

    private static final SubLObject $$TimePoint = reader_make_constant_shell(makeString("TimePoint"));













    private static final SubLSymbol RELEVANT_MT_IS_GENL_MT_WITH_ANY_TIME = makeSymbol("RELEVANT-MT-IS-GENL-MT-WITH-ANY-TIME");



    private static final SubLSymbol $UNABLE_TO_DETERMINE = makeKeyword("UNABLE-TO-DETERMINE");

    private static final SubLSymbol RELEVANT_MT_IS_SPEC_MT = makeSymbol("RELEVANT-MT-IS-SPEC-MT");

    private static final SubLSymbol WITH_MT_FUNCTION = makeSymbol("WITH-MT-FUNCTION");

    public static final SubLList $list26 = list(makeSymbol("QUOTE"), makeSymbol("RELEVANT-MT-IS-GENL-MT"));

    private static final SubLSymbol IN_MT = makeSymbol("IN-MT");

    private static final SubLSymbol WITH_GENL_MTS = makeSymbol("WITH-GENL-MTS");

    private static final SubLString $str29$MT_and_all_its_genl_mts_are_relev = makeString("MT and all its genl mts are relevant within BODY.");

    private static final SubLList $list30 = list(makeSymbol("ELMT"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol CANONICALIZE_HLMT = makeSymbol("CANONICALIZE-HLMT");



    private static final SubLList $list33 = list(makeSymbol("QUOTE"), makeSymbol("RELEVANT-MT-IS-EVERYTHING"));

    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));



    private static final SubLList $list36 = list(makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLString $str37$All_mts_are_relevant_within_BODY_ = makeString("All mts are relevant within BODY.");

    public static final SubLList $list38 = list(makeSymbol("QUOTE"), makeSymbol("RELEVANT-MT-IS-ANY-MT"));

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

    private static final SubLSymbol WITH_ANY_MT = makeSymbol("WITH-ANY-MT");

    private static final SubLString $str41$Any_mt_can_be_used_for_relevance_ = makeString("Any mt can be used for relevance for a particular inference within &BODY.");

    private static final SubLList $list42 = list(makeSymbol("QUOTE"), makeSymbol("RELEVANT-MT-IS-EQ"));

    private static final SubLSymbol WITH_JUST_MT = makeSymbol("WITH-JUST-MT");

    private static final SubLString $str44$Only_MT_is_relevant_within_BODY__ = makeString("Only MT is relevant within BODY (no genl mts).");

    public static final SubLList $list45 = list(makeSymbol("QUOTE"), makeSymbol("RELEVANT-MT-IS-IN-LIST"));



    private static final SubLString $str47$Each_mt_in_the_list_MT_LIST_is_re = makeString("Each mt in the list MT-LIST is relevant within BODY (no genl mts).");

    public static final SubLList $list48 = list(makeSymbol("QUOTE"), makeSymbol("RELEVANT-MT-IS-GENL-MT-OF-LIST-MEMBER"));

    public static final SubLList $list49 = list(makeSymbol("MT-UNION"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol WITH_MT_LIST_AND_GENL_MTS = makeSymbol("WITH-MT-LIST-AND-GENL-MTS");

    private static final SubLSymbol MT_UNION_MTS = makeSymbol("MT-UNION-MTS");

    private static final SubLList $list52 = list(makeSymbol("QUOTE"), makeSymbol("RELEVANT-MT-IS-GENL-MT-WITH-ANY-TIME"));

    private static final SubLList $list53 = list(makeSymbol("QUOTE"), makeSymbol("RELEVANT-MT-IS-SPEC-MT"));



    public static final SubLSymbol $sym55$MT_VAR = makeUninternedSymbol("MT-VAR");

    private static final SubLSymbol POSSIBLY_IN_MT_DETERMINE_FUNCTION = makeSymbol("POSSIBLY-IN-MT-DETERMINE-FUNCTION");

    private static final SubLSymbol POSSIBLY_IN_MT_DETERMINE_MT = makeSymbol("POSSIBLY-IN-MT-DETERMINE-MT");



    private static final SubLSymbol $sym59$MT_VAR = makeUninternedSymbol("MT-VAR");

    private static final SubLSymbol POSSIBLY_WITH_JUST_MT_DETERMINE_FUNCTION = makeSymbol("POSSIBLY-WITH-JUST-MT-DETERMINE-FUNCTION");

    private static final SubLSymbol POSSIBLY_WITH_JUST_MT_DETERMINE_MT = makeSymbol("POSSIBLY-WITH-JUST-MT-DETERMINE-MT");

    private static final SubLSymbol POSSIBLY_WITH_JUST_MT = makeSymbol("POSSIBLY-WITH-JUST-MT");



    private static final SubLSymbol POSSIBLY_WITH_INFERENCE_MT_RELEVANCE_INTERNAL = makeSymbol("POSSIBLY-WITH-INFERENCE-MT-RELEVANCE-INTERNAL");

    private static final SubLSymbol WITH_INFERENCE_MT_RELEVANCE_VALIDATE = makeSymbol("WITH-INFERENCE-MT-RELEVANCE-VALIDATE");



    private static final SubLString $str67$BODY_evaluated_with_the_same_rele = makeString("BODY evaluated with the same relevance used for inferences in MT.\n   This is like @xref with-genl-mts, except it is special-cased to\n   @xref with-all-mts when the mt is #$EverythingPSC,\n   @xref with-any-mt when the mt is #$InferencePSC.\n   Also, with-inference-mt-relevance errors if passed NIL for an mt.");

    private static final SubLSymbol DETERMINE_INFERENCE_MT_RELEVANCE_EL_SPEC = makeSymbol("DETERMINE-INFERENCE-MT-RELEVANCE-EL-SPEC");

    private static final SubLString $str69$No_microtheory_was_specified_ = makeString("No microtheory was specified.");

    private static final SubLSymbol WITH_INFERENCE_MT_RELEVANCE_EL = makeSymbol("WITH-INFERENCE-MT-RELEVANCE-EL");

    private static final SubLList $list71 = list(makeSymbol("WITH-INFERENCE-MT-RELEVANCE"), makeSymbol("POSSIBLY-WITH-INFERENCE-MT-RELEVANCE"));

    private static final SubLSymbol $sym72$MT_VAR = makeUninternedSymbol("MT-VAR");

    private static final SubLSymbol UPDATE_INFERENCE_MT_RELEVANCE_MT = makeSymbol("UPDATE-INFERENCE-MT-RELEVANCE-MT");

    private static final SubLSymbol UPDATE_INFERENCE_MT_RELEVANCE_FUNCTION = makeSymbol("UPDATE-INFERENCE-MT-RELEVANCE-FUNCTION");

    private static final SubLSymbol UPDATE_INFERENCE_MT_RELEVANCE_MT_LIST = makeSymbol("UPDATE-INFERENCE-MT-RELEVANCE-MT-LIST");





    private static final SubLSymbol DETERMINE_POSSIBLY_WITH_INFERENCE_MT_RELEVANCE_MT_AND_SPEC = makeSymbol("DETERMINE-POSSIBLY-WITH-INFERENCE-MT-RELEVANCE-MT-AND-SPEC");

    private static final SubLList $list79 = list(makeSymbol("UPDATE-INFERENCE-MT-RELEVANCE-FUNCTION"), makeSymbol("UPDATE-INFERENCE-MT-RELEVANCE-MT"), makeSymbol("UPDATE-INFERENCE-MT-RELEVANCE-MT-LIST"));

    private static final SubLSymbol $sym80$WITH_INFERENCE_ANY_MT_RELEVANCE_ = makeSymbol("WITH-INFERENCE-ANY-MT-RELEVANCE?");

    private static final SubLList $list81 = list(makeSymbol("POSSIBLY-WITH-INFERENCE-MT-RELEVANCE-INTERNAL"), makeSymbol("POSSIBLY-IN-MT"));

    private static final SubLSymbol PSC_INFERENCE = makeSymbol("PSC-INFERENCE");

    private static final SubLSymbol $sym83$WITH_INFERENCE_MT_RELEVANCE_ALL_MTS_ = makeSymbol("WITH-INFERENCE-MT-RELEVANCE-ALL-MTS?");

    private static final SubLSymbol ALL_MTS_INFERENCE = makeSymbol("ALL-MTS-INFERENCE");

    private static final SubLSymbol $sym85$WITH_MT_UNION_RELEVANCE_ = makeSymbol("WITH-MT-UNION-RELEVANCE?");

    private static final SubLSymbol MT_UNION_INFERENCE = makeSymbol("MT-UNION-INFERENCE");

    private static final SubLSymbol $sym87$WITH_INFERENCE_ANYTIME_RELEVANCE_ = makeSymbol("WITH-INFERENCE-ANYTIME-RELEVANCE?");

    private static final SubLSymbol ANYTIME_PSC_INFERENCE = makeSymbol("ANYTIME-PSC-INFERENCE");

    private static final SubLObject $$MtUnionFn = reader_make_constant_shell(makeString("MtUnionFn"));

    private static final SubLList $list90 = list(makeSymbol("MT-INFO"), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLSymbol MT_FUNCTION_EQ = makeSymbol("MT-FUNCTION-EQ");

    private static final SubLList $list93 = list(list(makeSymbol("QUOTE"), makeSymbol("RELEVANT-MT-IS-EVERYTHING")));

    public static final SubLList $list94 = list(list(makeSymbol("QUOTE"), makeSymbol("RELEVANT-MT-IS-ANY-MT")));

    private static final SubLSymbol MT_UNION_NAUT_P = makeSymbol("MT-UNION-NAUT-P");

    private static final SubLSymbol WITH_GENL_MTS_OF_UNION = makeSymbol("WITH-GENL-MTS-OF-UNION");

    private static final SubLList $list97 = list(list(makeSymbol("VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol DO_ALL_FORT_INSTANCES = makeSymbol("DO-ALL-FORT-INSTANCES");

    private static final SubLList $list99 = list(reader_make_constant_shell(makeString("Microtheory")));

    private static final SubLSymbol MAP_MTS = makeSymbol("MAP-MTS");

    private static final SubLString $str101$Iterate_over_all_microtheories__b = makeString("Iterate over all microtheories, binding VAR to an mt and executing BODY.");

    static final boolean assertionsDisabledSynth = true;

    public static SubLObject with_mt_function(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject function = NIL;
        destructuring_bind_must_consp(current, datum, $list1);
        function = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($relevant_mt_function$, function)), append(body, NIL));
    }

    public static SubLObject mt_function_eq(final SubLObject mt_function, final SubLObject symbol) {
        return eq(mt_function, symbol);
    }

    public static SubLObject relevant_mt_function_eq(final SubLObject symbol) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return mt_function_eq($relevant_mt_function$.getDynamicValue(thread), symbol);
    }

    public static SubLObject in_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mt = NIL;
        destructuring_bind_must_consp(current, datum, $list4);
        mt = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($sym5$_MT_, mt)), append(body, NIL));
    }

    public static SubLObject in_mt_list(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mt_list = NIL;
        destructuring_bind_must_consp(current, datum, $list8);
        mt_list = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($relevant_mts$, mt_list)), append(body, NIL));
    }

    public static SubLObject current_mt_relevance_mt_context() {
        return mt_vars.$mt_mt$.getGlobalValue();
    }

    public static SubLObject current_mt_relevance_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $mt$.getDynamicValue(thread);
    }

    public static SubLObject current_mt_relevance_mt_list() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $relevant_mts$.getDynamicValue(thread);
    }

    public static SubLObject current_mt_relevance_test() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $relevant_mt_function$.getDynamicValue(thread);
    }

    public static SubLObject relevant_mt_is_everything(final SubLObject mt) {
        return T;
    }

    public static SubLObject relevant_mt_is_any_mt(final SubLObject mt) {
        return T;
    }

    public static SubLObject relevant_mt_is_eq(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return hlmt.hlmt_equal($mt$.getDynamicValue(thread), mt);
    }

    public static SubLObject relevant_mt_is_in_list(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(mt, $relevant_mts$.getDynamicValue(thread), HLMT_EQUAL, UNPROVIDED);
    }

    public static SubLObject relevant_mt_is_genl_mt(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != hlmt.hlmt_equal(mt, $mt$.getDynamicValue(thread))) {
            return T;
        }
        final SubLObject spec_coreP = mt_vars.core_microtheory_p($mt$.getDynamicValue(thread));
        final SubLObject genl_coreP = mt_vars.core_microtheory_p(mt);
        if ((NIL != spec_coreP) && (NIL != genl_coreP)) {
            return mt_vars.core_genl_mtP(mt, $mt$.getDynamicValue(thread));
        }
        if (NIL != genl_coreP) {
            return T;
        }
        if (NIL != spec_coreP) {
            return NIL;
        }
        return mt_relevance_cache.basemtP($mt$.getDynamicValue(thread), mt);
    }

    public static SubLObject relevant_mt_is_spec_mt(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != hlmt.hlmt_equal(mt, $mt$.getDynamicValue(thread))) {
            return T;
        }
        final SubLObject spec_coreP = mt_vars.core_microtheory_p($mt$.getDynamicValue(thread));
        final SubLObject genl_coreP = mt_vars.core_microtheory_p(mt);
        if ((NIL != spec_coreP) && (NIL != genl_coreP)) {
            if ((NIL != mt_vars.special_core_loop_mt_p(mt)) && (NIL != mt_vars.special_core_loop_mt_p($mt$.getDynamicValue(thread)))) {
                return T;
            }
            return mt_vars.core_microtheory_L(mt, $mt$.getDynamicValue(thread));
        } else {
            if (NIL != spec_coreP) {
                return T;
            }
            if (NIL != genl_coreP) {
                return NIL;
            }
            return mt_relevance_cache.basemtP(mt, $mt$.getDynamicValue(thread));
        }
    }

    public static SubLObject relevant_mt_is_genl_mt_of_list_member(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != mt_vars.special_core_loop_mt_p(mt)) && (NIL != find_if(SPECIAL_CORE_LOOP_MT_P, $relevant_mts$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            return T;
        }
        if (NIL != mt_vars.core_microtheory_p(mt)) {
            if ((NIL != $relevant_mts$.getDynamicValue(thread)) && (NIL != list_utilities.find_if_not(CORE_MICROTHEORY_P, $relevant_mts$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                return T;
            }
            SubLObject cdolist_list_var = $relevant_mts$.getDynamicValue(thread);
            SubLObject relevant_mt = NIL;
            relevant_mt = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != mt_vars.core_microtheory_L(relevant_mt, mt)) {
                    return T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                relevant_mt = cdolist_list_var.first();
            } 
        }
        SubLObject cdolist_list_var = $relevant_mts$.getDynamicValue(thread);
        SubLObject relevant_mt = NIL;
        relevant_mt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != mt_relevance_cache.basemtP(relevant_mt, mt)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            relevant_mt = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject relevant_mt_is_genl_mt_with_any_time(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject monad_mt = hlmt.hlmt_monad_mt(mt);
        if (NIL == relevant_mt_is_genl_mt(monad_mt)) {
            return NIL;
        }
        final SubLObject anytime = hlmt.hlmt_temporal_mt($mt$.getDynamicValue(thread));
        if (NIL != hlmt.anytime_psc_p(anytime)) {
            return T;
        }
        final SubLObject time_mt = hlmt.hlmt_temporal_mt(mt);
        if (NIL != time_mt) {
            final SubLObject base_time = hlmt.anytime_during_psc_fn_time_interval(anytime);
            final SubLObject base_mt = hlmt.new_time_dimension(base_time, $$TimePoint);
            return hlmt_relevance.temporal_mts_intersectP(time_mt, base_mt);
        }
        return T;
    }

    public static SubLObject relevant_mtP(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject function = $relevant_mt_function$.getDynamicValue(thread);
        if (NIL == function) {
            return relevant_mt_is_genl_mt(mt);
        }
        final SubLObject pcase_var = function;
        if (pcase_var.eql(RELEVANT_MT_IS_GENL_MT)) {
            return relevant_mt_is_genl_mt(mt);
        }
        if (pcase_var.eql(RELEVANT_MT_IS_ANY_MT)) {
            return relevant_mt_is_any_mt(mt);
        }
        if (pcase_var.eql(RELEVANT_MT_IS_EVERYTHING)) {
            return relevant_mt_is_everything(mt);
        }
        if (pcase_var.eql(RELEVANT_MT_IS_EQ)) {
            return relevant_mt_is_eq(mt);
        }
        if (pcase_var.eql(RELEVANT_MT_IS_IN_LIST)) {
            return relevant_mt_is_in_list(mt);
        }
        if (pcase_var.eql(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER)) {
            return relevant_mt_is_genl_mt_of_list_member(mt);
        }
        if (pcase_var.eql(RELEVANT_MT_IS_GENL_MT_WITH_ANY_TIME)) {
            return relevant_mt_is_genl_mt_with_any_time(mt);
        }
        return funcall(function, mt);
    }

    public static SubLObject all_possibly_relevant_mts() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject function = $relevant_mt_function$.getDynamicValue(thread);
        final SubLObject mt = $mt$.getDynamicValue(thread);
        if (NIL == function) {
            if (NIL != mt) {
                return genl_mts.all_genl_mts(mt, UNPROVIDED, UNPROVIDED);
            }
            return $ALL;
        } else {
            final SubLObject pcase_var = function;
            if (pcase_var.eql(RELEVANT_MT_IS_GENL_MT)) {
                return genl_mts.all_genl_mts(mt, UNPROVIDED, UNPROVIDED);
            }
            if (pcase_var.eql(RELEVANT_MT_IS_ANY_MT)) {
                return $ALL;
            }
            if (pcase_var.eql(RELEVANT_MT_IS_EVERYTHING)) {
                return $ALL;
            }
            if (pcase_var.eql(RELEVANT_MT_IS_EQ)) {
                return list(mt);
            }
            if (pcase_var.eql(RELEVANT_MT_IS_IN_LIST)) {
                return $relevant_mts$.getDynamicValue(thread);
            }
            if (pcase_var.eql(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER)) {
                return $UNABLE_TO_DETERMINE;
            }
            if (pcase_var.eql(RELEVANT_MT_IS_GENL_MT_WITH_ANY_TIME)) {
                return $UNABLE_TO_DETERMINE;
            }
            return $UNABLE_TO_DETERMINE;
        }
    }

    public static SubLObject relevant_assertionP(final SubLObject assertion) {
        if (NIL != assertion_handles.assertion_p(assertion)) {
            return makeBoolean((NIL != any_or_all_mts_are_relevantP()) || (NIL != relevant_mtP(assertions_high.assertion_mt(assertion))));
        }
        return NIL;
    }

    public static SubLObject mt_relevance_unspecifiedP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $relevant_mt_function$.getDynamicValue(thread)) {
            return T;
        }
        return makeBoolean((NIL != relevant_mt_function_eq(RELEVANT_MT_IS_GENL_MT)) && $mt$.getDynamicValue(thread).eql(mt_vars.$assertible_theory_mt_root$.getGlobalValue()));
    }

    public static SubLObject genl_mts_are_relevantP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL == $relevant_mt_function$.getDynamicValue(thread)) || (NIL != relevant_mt_function_eq(RELEVANT_MT_IS_GENL_MT)));
    }

    public static SubLObject any_mt_is_relevantP() {
        return relevant_mt_function_eq(RELEVANT_MT_IS_ANY_MT);
    }

    public static SubLObject all_mts_are_relevantP() {
        return relevant_mt_function_eq(RELEVANT_MT_IS_EVERYTHING);
    }

    public static SubLObject any_or_all_mts_are_relevantP() {
        return makeBoolean((NIL != relevant_mt_function_eq(RELEVANT_MT_IS_EVERYTHING)) || (NIL != relevant_mt_function_eq(RELEVANT_MT_IS_ANY_MT)));
    }

    public static SubLObject listed_mts_are_relevantP() {
        return relevant_mt_function_eq(RELEVANT_MT_IS_IN_LIST);
    }

    public static SubLObject genl_mts_of_listed_mts_are_relevantP() {
        return relevant_mt_function_eq(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER);
    }

    public static SubLObject any_time_is_relevantP() {
        return relevant_mt_function_eq(RELEVANT_MT_IS_GENL_MT_WITH_ANY_TIME);
    }

    public static SubLObject spec_mts_are_relevantP() {
        return relevant_mt_function_eq(RELEVANT_MT_IS_SPEC_MT);
    }

    public static SubLObject only_specified_mt_is_relevantP() {
        return relevant_mt_function_eq(RELEVANT_MT_IS_EQ);
    }

    public static SubLObject with_genl_mts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mt = NIL;
        destructuring_bind_must_consp(current, datum, $list4);
        mt = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(WITH_MT_FUNCTION, $list26, listS(IN_MT, mt, append(body, NIL)));
    }

    public static SubLObject with_genl_mts_el(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject elmt = NIL;
        destructuring_bind_must_consp(current, datum, $list30);
        elmt = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(WITH_GENL_MTS, list(CANONICALIZE_HLMT, elmt), append(body, NIL));
    }

    public static SubLObject with_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mt = NIL;
        destructuring_bind_must_consp(current, datum, $list4);
        mt = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(WITH_GENL_MTS, mt, append(body, NIL));
    }

    public static SubLObject with_all_mts(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(WITH_MT_FUNCTION, $list33, listS(IN_MT, $$EverythingPSC, append(body, NIL)));
    }

    public static SubLObject with_any_mt(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(WITH_MT_FUNCTION, $list38, listS(IN_MT, $$InferencePSC, append(body, NIL)));
    }

    public static SubLObject with_just_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mt = NIL;
        destructuring_bind_must_consp(current, datum, $list4);
        mt = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(WITH_MT_FUNCTION, $list42, listS(IN_MT, mt, append(body, NIL)));
    }

    public static SubLObject with_mt_list(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mt_list = NIL;
        destructuring_bind_must_consp(current, datum, $list8);
        mt_list = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(WITH_MT_FUNCTION, $list45, listS(IN_MT_LIST, mt_list, append(body, NIL)));
    }

    public static SubLObject with_mt_list_and_genl_mts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mt_list = NIL;
        destructuring_bind_must_consp(current, datum, $list8);
        mt_list = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(WITH_MT_FUNCTION, $list48, listS(IN_MT_LIST, mt_list, append(body, NIL)));
    }

    public static SubLObject with_genl_mts_of_union(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mt_union = NIL;
        destructuring_bind_must_consp(current, datum, $list49);
        mt_union = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(WITH_MT_LIST_AND_GENL_MTS, list(MT_UNION_MTS, mt_union), append(body, NIL));
    }

    public static SubLObject with_any_time_relevance(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mt = NIL;
        destructuring_bind_must_consp(current, datum, $list4);
        mt = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(WITH_MT_FUNCTION, $list52, listS(IN_MT, mt, append(body, NIL)));
    }

    public static SubLObject with_spec_mts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mt = NIL;
        destructuring_bind_must_consp(current, datum, $list4);
        mt = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(WITH_MT_FUNCTION, $list53, listS(IN_MT, mt, append(body, NIL)));
    }

    public static SubLObject possibly_in_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mt = NIL;
        destructuring_bind_must_consp(current, datum, $list4);
        mt = current.first();
        final SubLObject body;
        current = body = current.rest();
        if (NIL == mt) {
            return bq_cons(PROGN, append(body, NIL));
        }
        final SubLObject mt_var = $sym55$MT_VAR;
        return list(CLET, list(list(mt_var, mt)), list(WITH_MT_FUNCTION, list(POSSIBLY_IN_MT_DETERMINE_FUNCTION, mt_var), listS(IN_MT, list(POSSIBLY_IN_MT_DETERMINE_MT, mt_var), append(body, NIL))));
    }

    public static SubLObject possibly_in_mt_determine_function(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((((NIL == mt) || (NIL != with_inference_any_mt_relevanceP(mt))) || (NIL != with_inference_mt_relevance_all_mtsP(mt))) || (NIL != genl_mts_of_listed_mts_are_relevantP())) || (NIL != any_time_is_relevantP())) {
            return $relevant_mt_function$.getDynamicValue(thread);
        }
        return RELEVANT_MT_IS_GENL_MT;
    }

    public static SubLObject possibly_in_mt_determine_mt(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != mt ? mt : $mt$.getDynamicValue(thread);
    }

    public static SubLObject possibly_with_just_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mt = NIL;
        destructuring_bind_must_consp(current, datum, $list4);
        mt = current.first();
        final SubLObject body;
        current = body = current.rest();
        if (NIL == mt) {
            return bq_cons(PROGN, append(body, NIL));
        }
        final SubLObject mt_var = $sym59$MT_VAR;
        return list(CLET, list(list(mt_var, mt)), list(WITH_MT_FUNCTION, list(POSSIBLY_WITH_JUST_MT_DETERMINE_FUNCTION, mt_var), listS(IN_MT, list(POSSIBLY_WITH_JUST_MT_DETERMINE_MT, mt_var), append(body, NIL))));
    }

    public static SubLObject possibly_with_just_mt_determine_function(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == mt) {
            return $relevant_mt_function$.getDynamicValue(thread);
        }
        assert NIL != hlmt.hlmt_p(mt) : "hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) " + mt;
        return RELEVANT_MT_IS_EQ;
    }

    public static SubLObject possibly_with_just_mt_determine_mt(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != mt ? mt : $mt$.getDynamicValue(thread);
    }

    public static SubLObject with_inference_mt_relevance(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mt = NIL;
        destructuring_bind_must_consp(current, datum, $list4);
        mt = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(POSSIBLY_WITH_INFERENCE_MT_RELEVANCE_INTERNAL, list(WITH_INFERENCE_MT_RELEVANCE_VALIDATE, mt), append(body, NIL));
    }

    public static SubLObject with_inference_mt_relevance_el(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject elmt = NIL;
        destructuring_bind_must_consp(current, datum, $list30);
        elmt = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(WITH_INFERENCE_MT_RELEVANCE, list(DETERMINE_INFERENCE_MT_RELEVANCE_EL_SPEC, elmt), append(body, NIL));
    }

    public static SubLObject with_inference_mt_relevance_validate(final SubLObject mt) {
        return NIL != mt ? mt : Errors.error($str69$No_microtheory_was_specified_);
    }

    public static SubLObject determine_inference_mt_relevance_el_spec(final SubLObject elmt) {
        return NIL != hlmt.possibly_mt_p(elmt) ? hlmt_czer.canonicalize_hlmt(elmt) : elmt;
    }

    public static SubLObject possibly_with_inference_mt_relevance(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mt = NIL;
        destructuring_bind_must_consp(current, datum, $list4);
        mt = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(POSSIBLY_WITH_INFERENCE_MT_RELEVANCE_INTERNAL, mt, append(body, NIL));
    }

    public static SubLObject possibly_with_inference_mt_relevance_internal(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mt = NIL;
        destructuring_bind_must_consp(current, datum, $list4);
        mt = current.first();
        final SubLObject body;
        current = body = current.rest();
        if (NIL == mt) {
            return bq_cons(PROGN, append(body, NIL));
        }
        final SubLObject mt_var = $sym72$MT_VAR;
        return list(CLET, list(list(mt_var, mt)), list(IN_MT, list(UPDATE_INFERENCE_MT_RELEVANCE_MT, mt_var), list(WITH_MT_FUNCTION, list(UPDATE_INFERENCE_MT_RELEVANCE_FUNCTION, mt_var), listS(IN_MT_LIST, list(UPDATE_INFERENCE_MT_RELEVANCE_MT_LIST, mt_var), append(body, NIL)))));
    }

    public static SubLObject possibly_with_inference_mt_relevance_el(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject elmt = NIL;
        destructuring_bind_must_consp(current, datum, $list30);
        elmt = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(POSSIBLY_WITH_INFERENCE_MT_RELEVANCE, list(CANONICALIZE_HLMT, elmt), append(body, NIL));
    }

    public static SubLObject update_inference_mt_relevance_mt(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != mt) && (!assertionsDisabledSynth)) && (NIL == hlmt.possibly_hlmt_p(mt))) {
            throw new AssertionError(mt);
        }
        if (NIL == mt) {
            return $mt$.getDynamicValue(thread);
        }
        return mt;
    }

    public static SubLObject update_inference_mt_relevance_function(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == mt) {
            return $relevant_mt_function$.getDynamicValue(thread);
        }
        if (NIL != with_inference_any_mt_relevanceP(mt)) {
            return RELEVANT_MT_IS_ANY_MT;
        }
        if (NIL != with_inference_mt_relevance_all_mtsP(mt)) {
            return RELEVANT_MT_IS_EVERYTHING;
        }
        if (NIL != with_mt_union_relevanceP(mt)) {
            return RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER;
        }
        if (NIL != with_inference_anytime_relevanceP(mt)) {
            return RELEVANT_MT_IS_GENL_MT_WITH_ANY_TIME;
        }
        return RELEVANT_MT_IS_GENL_MT;
    }

    public static SubLObject update_inference_mt_relevance_mt_list(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == mt) {
            return $relevant_mts$.getDynamicValue(thread);
        }
        if (NIL != with_mt_union_relevanceP(mt)) {
            return hlmt.mt_union_mts(mt);
        }
        return NIL;
    }

    public static SubLObject determine_possibly_with_inference_mt_relevance_mt_and_spec(final SubLObject mt) {
        return values(update_inference_mt_relevance_function(mt), update_inference_mt_relevance_mt(mt), update_inference_mt_relevance_mt_list(mt));
    }

    public static SubLObject with_inference_any_mt_relevanceP(final SubLObject mt) {
        return eq(PSC_INFERENCE, psc.mt_inference_function(mt));
    }

    public static SubLObject with_inference_mt_relevance_all_mtsP(final SubLObject mt) {
        return eq(ALL_MTS_INFERENCE, psc.mt_inference_function(mt));
    }

    public static SubLObject with_mt_union_relevanceP(final SubLObject mt) {
        return eq(MT_UNION_INFERENCE, psc.mt_inference_function(mt));
    }

    public static SubLObject with_inference_anytime_relevanceP(final SubLObject mt) {
        return eq(ANYTIME_PSC_INFERENCE, psc.mt_inference_function(mt));
    }

    public static SubLObject inference_relevant_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != all_mts_are_relevantP()) {
            return $$EverythingPSC;
        }
        if (NIL != any_mt_is_relevantP()) {
            return $$InferencePSC;
        }
        if (NIL != genl_mts_of_listed_mts_are_relevantP()) {
            return make_formula($$MtUnionFn, $relevant_mts$.getDynamicValue(thread), UNPROVIDED);
        }
        if (NIL != genl_mts_are_relevantP()) {
            return $mt$.getDynamicValue(thread);
        }
        return $mt$.getDynamicValue(thread);
    }

    public static SubLObject mt_info(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != all_mts_are_relevantP()) {
            return $relevant_mt_function$.getDynamicValue(thread);
        }
        if (NIL != any_mt_is_relevantP()) {
            return $relevant_mt_function$.getDynamicValue(thread);
        }
        if (NIL != genl_mts_of_listed_mts_are_relevantP()) {
            return make_formula($$MtUnionFn, $relevant_mts$.getDynamicValue(thread), UNPROVIDED);
        }
        if (NIL != mt) {
            return mt;
        }
        if (NIL != $mt$.getDynamicValue(thread)) {
            return $mt$.getDynamicValue(thread);
        }
        return NIL;
    }

    public static SubLObject mt_to_mt_info(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mt_info = NIL;
        final SubLObject mt_var = with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = $mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $relevant_mts$.currentBinding(thread);
        try {
            $mt$.bind(update_inference_mt_relevance_mt(mt_var), thread);
            $relevant_mt_function$.bind(update_inference_mt_relevance_function(mt_var), thread);
            $relevant_mts$.bind(update_inference_mt_relevance_mt_list(mt_var), thread);
            mt_info = mt_info(UNPROVIDED);
        } finally {
            $relevant_mts$.rebind(_prev_bind_3, thread);
            $relevant_mt_function$.rebind(_prev_bind_2, thread);
            $mt$.rebind(_prev_bind_0, thread);
        }
        return mt_info;
    }

    public static SubLObject mt_info_to_mt(final SubLObject mt_info) {
        if (NIL != mt_function_eq(mt_info, RELEVANT_MT_IS_EVERYTHING)) {
            return $$EverythingPSC;
        }
        if (NIL != mt_function_eq(mt_info, RELEVANT_MT_IS_ANY_MT)) {
            return $$InferencePSC;
        }
        return mt_info;
    }

    public static SubLObject with_mt_info(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mt_info = NIL;
        destructuring_bind_must_consp(current, datum, $list90);
        mt_info = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PCOND, list(listS(MT_FUNCTION_EQ, mt_info, $list93), bq_cons(WITH_ALL_MTS, append(body, NIL))), list(listS(MT_FUNCTION_EQ, mt_info, $list94), bq_cons(WITH_ANY_MT, append(body, NIL))), list(list(MT_UNION_NAUT_P, mt_info), listS(WITH_GENL_MTS_OF_UNION, mt_info, append(body, NIL))), list(T, listS(WITH_GENL_MTS, mt_info, append(body, NIL))));
    }

    public static SubLObject in_one_of_these_mtsP(final SubLObject ass, final SubLObject mts) {
        return subl_promotions.memberP(assertions_high.assertion_mt(ass), mts, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject any_or_all_mts_relevant_to_mtP(final SubLObject mt) {
        return makeBoolean((NIL != with_inference_any_mt_relevanceP(mt)) || (NIL != with_inference_mt_relevance_all_mtsP(mt)));
    }

    public static SubLObject conservative_constraint_mt(final SubLObject mt) {
        if (NIL != any_or_all_mts_relevant_to_mtP(mt)) {
            return mt_vars.$core_mt_floor$.getGlobalValue();
        }
        return mt;
    }

    public static SubLObject mt_relevant_to_mtP(final SubLObject mt, final SubLObject possibly_relevant_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject relevantP = NIL;
        final SubLObject mt_var = with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = $mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $relevant_mts$.currentBinding(thread);
        try {
            $mt$.bind(update_inference_mt_relevance_mt(mt_var), thread);
            $relevant_mt_function$.bind(update_inference_mt_relevance_function(mt_var), thread);
            $relevant_mts$.bind(update_inference_mt_relevance_mt_list(mt_var), thread);
            relevantP = relevant_mtP(possibly_relevant_mt);
        } finally {
            $relevant_mts$.rebind(_prev_bind_3, thread);
            $relevant_mt_function$.rebind(_prev_bind_2, thread);
            $mt$.rebind(_prev_bind_0, thread);
        }
        return relevantP;
    }

    public static SubLObject any_relevant_mtP(final SubLObject mts) {
        SubLObject relevantP = NIL;
        if (NIL == relevantP) {
            SubLObject csome_list_var = mts;
            SubLObject mt = NIL;
            mt = csome_list_var.first();
            while ((NIL == relevantP) && (NIL != csome_list_var)) {
                if (NIL != relevant_mtP(mt)) {
                    relevantP = T;
                }
                csome_list_var = csome_list_var.rest();
                mt = csome_list_var.first();
            } 
        }
        return relevantP;
    }

    public static SubLObject map_mts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list97);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        destructuring_bind_must_consp(current, datum, $list97);
        var = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(WITH_ALL_MTS, listS(DO_ALL_FORT_INSTANCES, bq_cons(var, $list99), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list97);
        return NIL;
    }

    public static SubLObject declare_mt_relevance_macros_file() {
        declareMacro(me, "with_mt_function", "WITH-MT-FUNCTION");
        declareFunction(me, "mt_function_eq", "MT-FUNCTION-EQ", 2, 0, false);
        declareFunction(me, "relevant_mt_function_eq", "RELEVANT-MT-FUNCTION-EQ", 1, 0, false);
        declareMacro(me, "in_mt", "IN-MT");
        declareMacro(me, "in_mt_list", "IN-MT-LIST");
        declareFunction(me, "current_mt_relevance_mt_context", "CURRENT-MT-RELEVANCE-MT-CONTEXT", 0, 0, false);
        declareFunction(me, "current_mt_relevance_mt", "CURRENT-MT-RELEVANCE-MT", 0, 0, false);
        declareFunction(me, "current_mt_relevance_mt_list", "CURRENT-MT-RELEVANCE-MT-LIST", 0, 0, false);
        declareFunction(me, "current_mt_relevance_test", "CURRENT-MT-RELEVANCE-TEST", 0, 0, false);
        declareFunction(me, "relevant_mt_is_everything", "RELEVANT-MT-IS-EVERYTHING", 1, 0, false);
        declareFunction(me, "relevant_mt_is_any_mt", "RELEVANT-MT-IS-ANY-MT", 1, 0, false);
        declareFunction(me, "relevant_mt_is_eq", "RELEVANT-MT-IS-EQ", 1, 0, false);
        declareFunction(me, "relevant_mt_is_in_list", "RELEVANT-MT-IS-IN-LIST", 1, 0, false);
        declareFunction(me, "relevant_mt_is_genl_mt", "RELEVANT-MT-IS-GENL-MT", 1, 0, false);
        declareFunction(me, "relevant_mt_is_spec_mt", "RELEVANT-MT-IS-SPEC-MT", 1, 0, false);
        declareFunction(me, "relevant_mt_is_genl_mt_of_list_member", "RELEVANT-MT-IS-GENL-MT-OF-LIST-MEMBER", 1, 0, false);
        declareFunction(me, "relevant_mt_is_genl_mt_with_any_time", "RELEVANT-MT-IS-GENL-MT-WITH-ANY-TIME", 1, 0, false);
        declareFunction(me, "relevant_mtP", "RELEVANT-MT?", 1, 0, false);
        declareFunction(me, "all_possibly_relevant_mts", "ALL-POSSIBLY-RELEVANT-MTS", 0, 0, false);
        declareFunction(me, "relevant_assertionP", "RELEVANT-ASSERTION?", 1, 0, false);
        declareFunction(me, "mt_relevance_unspecifiedP", "MT-RELEVANCE-UNSPECIFIED?", 0, 0, false);
        declareFunction(me, "genl_mts_are_relevantP", "GENL-MTS-ARE-RELEVANT?", 0, 0, false);
        declareFunction(me, "any_mt_is_relevantP", "ANY-MT-IS-RELEVANT?", 0, 0, false);
        declareFunction(me, "all_mts_are_relevantP", "ALL-MTS-ARE-RELEVANT?", 0, 0, false);
        declareFunction(me, "any_or_all_mts_are_relevantP", "ANY-OR-ALL-MTS-ARE-RELEVANT?", 0, 0, false);
        declareFunction(me, "listed_mts_are_relevantP", "LISTED-MTS-ARE-RELEVANT?", 0, 0, false);
        declareFunction(me, "genl_mts_of_listed_mts_are_relevantP", "GENL-MTS-OF-LISTED-MTS-ARE-RELEVANT?", 0, 0, false);
        declareFunction(me, "any_time_is_relevantP", "ANY-TIME-IS-RELEVANT?", 0, 0, false);
        declareFunction(me, "spec_mts_are_relevantP", "SPEC-MTS-ARE-RELEVANT?", 0, 0, false);
        declareFunction(me, "only_specified_mt_is_relevantP", "ONLY-SPECIFIED-MT-IS-RELEVANT?", 0, 0, false);
        declareMacro(me, "with_genl_mts", "WITH-GENL-MTS");
        declareMacro(me, "with_genl_mts_el", "WITH-GENL-MTS-EL");
        declareMacro(me, "with_mt", "WITH-MT");
        declareMacro(me, "with_all_mts", "WITH-ALL-MTS");
        declareMacro(me, "with_any_mt", "WITH-ANY-MT");
        declareMacro(me, "with_just_mt", "WITH-JUST-MT");
        declareMacro(me, "with_mt_list", "WITH-MT-LIST");
        declareMacro(me, "with_mt_list_and_genl_mts", "WITH-MT-LIST-AND-GENL-MTS");
        declareMacro(me, "with_genl_mts_of_union", "WITH-GENL-MTS-OF-UNION");
        declareMacro(me, "with_any_time_relevance", "WITH-ANY-TIME-RELEVANCE");
        declareMacro(me, "with_spec_mts", "WITH-SPEC-MTS");
        declareMacro(me, "possibly_in_mt", "POSSIBLY-IN-MT");
        declareFunction(me, "possibly_in_mt_determine_function", "POSSIBLY-IN-MT-DETERMINE-FUNCTION", 1, 0, false);
        declareFunction(me, "possibly_in_mt_determine_mt", "POSSIBLY-IN-MT-DETERMINE-MT", 1, 0, false);
        declareMacro(me, "possibly_with_just_mt", "POSSIBLY-WITH-JUST-MT");
        declareFunction(me, "possibly_with_just_mt_determine_function", "POSSIBLY-WITH-JUST-MT-DETERMINE-FUNCTION", 1, 0, false);
        declareFunction(me, "possibly_with_just_mt_determine_mt", "POSSIBLY-WITH-JUST-MT-DETERMINE-MT", 1, 0, false);
        declareMacro(me, "with_inference_mt_relevance", "WITH-INFERENCE-MT-RELEVANCE");
        declareMacro(me, "with_inference_mt_relevance_el", "WITH-INFERENCE-MT-RELEVANCE-EL");
        declareFunction(me, "with_inference_mt_relevance_validate", "WITH-INFERENCE-MT-RELEVANCE-VALIDATE", 1, 0, false);
        declareFunction(me, "determine_inference_mt_relevance_el_spec", "DETERMINE-INFERENCE-MT-RELEVANCE-EL-SPEC", 1, 0, false);
        declareMacro(me, "possibly_with_inference_mt_relevance", "POSSIBLY-WITH-INFERENCE-MT-RELEVANCE");
        declareMacro(me, "possibly_with_inference_mt_relevance_internal", "POSSIBLY-WITH-INFERENCE-MT-RELEVANCE-INTERNAL");
        declareMacro(me, "possibly_with_inference_mt_relevance_el", "POSSIBLY-WITH-INFERENCE-MT-RELEVANCE-EL");
        declareFunction(me, "update_inference_mt_relevance_mt", "UPDATE-INFERENCE-MT-RELEVANCE-MT", 1, 0, false);
        declareFunction(me, "update_inference_mt_relevance_function", "UPDATE-INFERENCE-MT-RELEVANCE-FUNCTION", 1, 0, false);
        declareFunction(me, "update_inference_mt_relevance_mt_list", "UPDATE-INFERENCE-MT-RELEVANCE-MT-LIST", 1, 0, false);
        declareFunction(me, "determine_possibly_with_inference_mt_relevance_mt_and_spec", "DETERMINE-POSSIBLY-WITH-INFERENCE-MT-RELEVANCE-MT-AND-SPEC", 1, 0, false);
        declareFunction(me, "with_inference_any_mt_relevanceP", "WITH-INFERENCE-ANY-MT-RELEVANCE?", 1, 0, false);
        declareFunction(me, "with_inference_mt_relevance_all_mtsP", "WITH-INFERENCE-MT-RELEVANCE-ALL-MTS?", 1, 0, false);
        declareFunction(me, "with_mt_union_relevanceP", "WITH-MT-UNION-RELEVANCE?", 1, 0, false);
        declareFunction(me, "with_inference_anytime_relevanceP", "WITH-INFERENCE-ANYTIME-RELEVANCE?", 1, 0, false);
        declareFunction(me, "inference_relevant_mt", "INFERENCE-RELEVANT-MT", 0, 0, false);
        declareFunction(me, "mt_info", "MT-INFO", 0, 1, false);
        declareFunction(me, "mt_to_mt_info", "MT-TO-MT-INFO", 1, 0, false);
        declareFunction(me, "mt_info_to_mt", "MT-INFO-TO-MT", 1, 0, false);
        declareMacro(me, "with_mt_info", "WITH-MT-INFO");
        declareFunction(me, "in_one_of_these_mtsP", "IN-ONE-OF-THESE-MTS?", 2, 0, false);
        declareFunction(me, "any_or_all_mts_relevant_to_mtP", "ANY-OR-ALL-MTS-RELEVANT-TO-MT?", 1, 0, false);
        declareFunction(me, "conservative_constraint_mt", "CONSERVATIVE-CONSTRAINT-MT", 1, 0, false);
        declareFunction(me, "mt_relevant_to_mtP", "MT-RELEVANT-TO-MT?", 2, 0, false);
        declareFunction(me, "any_relevant_mtP", "ANY-RELEVANT-MT?", 1, 0, false);
        declareMacro(me, "map_mts", "MAP-MTS");
        return NIL;
    }

    public static SubLObject init_mt_relevance_macros_file() {
        defparameter("*RELEVANT-MT-FUNCTION*", NIL);
        defparameter("*MT*", mt_vars.$assertible_theory_mt_root$.getGlobalValue());
        defparameter("*RELEVANT-MTS*", NIL);
        return NIL;
    }

    public static SubLObject setup_mt_relevance_macros_file() {
        SubLSpecialOperatorDeclarations.proclaim($list0);
        mt_vars.note_mt_var($mt$.getDynamicValue(), UNPROVIDED);
        register_macro_helper(IN_MT_LIST, $list7);
        SubLSpecialOperatorDeclarations.proclaim($list10);
        register_cyc_api_macro(WITH_GENL_MTS, $list4, $str29$MT_and_all_its_genl_mts_are_relev);
        register_cyc_api_macro(WITH_MT, $list4, $str29$MT_and_all_its_genl_mts_are_relev);
        register_cyc_api_macro(WITH_ALL_MTS, $list36, $str37$All_mts_are_relevant_within_BODY_);
        register_cyc_api_macro(WITH_ANY_MT, $list36, $str41$Any_mt_can_be_used_for_relevance_);
        register_cyc_api_macro(WITH_JUST_MT, $list4, $str44$Only_MT_is_relevant_within_BODY__);
        register_cyc_api_macro(WITH_MT_LIST, $list8, $str47$Each_mt_in_the_list_MT_LIST_is_re);
        register_macro_helper(POSSIBLY_IN_MT_DETERMINE_FUNCTION, POSSIBLY_IN_MT);
        register_macro_helper(POSSIBLY_IN_MT_DETERMINE_MT, POSSIBLY_IN_MT);
        register_macro_helper(POSSIBLY_WITH_JUST_MT_DETERMINE_FUNCTION, POSSIBLY_WITH_JUST_MT);
        register_macro_helper(POSSIBLY_WITH_JUST_MT_DETERMINE_MT, POSSIBLY_WITH_JUST_MT);
        register_cyc_api_macro(WITH_INFERENCE_MT_RELEVANCE, $list4, $str67$BODY_evaluated_with_the_same_rele);
        register_macro_helper(WITH_INFERENCE_MT_RELEVANCE_VALIDATE, WITH_INFERENCE_MT_RELEVANCE);
        register_macro_helper(DETERMINE_INFERENCE_MT_RELEVANCE_EL_SPEC, WITH_INFERENCE_MT_RELEVANCE_EL);
        register_macro_helper(POSSIBLY_WITH_INFERENCE_MT_RELEVANCE_INTERNAL, $list71);
        register_macro_helper(UPDATE_INFERENCE_MT_RELEVANCE_MT, POSSIBLY_WITH_INFERENCE_MT_RELEVANCE_INTERNAL);
        register_macro_helper(UPDATE_INFERENCE_MT_RELEVANCE_FUNCTION, POSSIBLY_WITH_INFERENCE_MT_RELEVANCE_INTERNAL);
        register_macro_helper(UPDATE_INFERENCE_MT_RELEVANCE_MT_LIST, POSSIBLY_WITH_INFERENCE_MT_RELEVANCE_INTERNAL);
        define_obsolete_register(DETERMINE_POSSIBLY_WITH_INFERENCE_MT_RELEVANCE_MT_AND_SPEC, $list79);
        register_macro_helper($sym80$WITH_INFERENCE_ANY_MT_RELEVANCE_, $list81);
        register_macro_helper($sym83$WITH_INFERENCE_MT_RELEVANCE_ALL_MTS_, $list81);
        register_macro_helper($sym85$WITH_MT_UNION_RELEVANCE_, $list81);
        register_macro_helper($sym87$WITH_INFERENCE_ANYTIME_RELEVANCE_, $list81);
        register_cyc_api_macro(MAP_MTS, $list97, $str101$Iterate_over_all_microtheories__b);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_mt_relevance_macros_file();
    }

    @Override
    public void initializeVariables() {
        init_mt_relevance_macros_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_mt_relevance_macros_file();
    }

    
}

/**
 * Total time: 278 ms synthetic
 */
