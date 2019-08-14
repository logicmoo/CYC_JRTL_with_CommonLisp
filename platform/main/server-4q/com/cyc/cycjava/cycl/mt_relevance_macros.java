/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      MT-RELEVANCE-MACROS
 * source file: /cyc/top/cycl/mt-relevance-macros.lisp
 * created:     2019/07/03 17:37:19
 */
public final class mt_relevance_macros extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new mt_relevance_macros();

 public static final String myName = "com.cyc.cycjava.cycl.mt_relevance_macros";


    // defparameter
    /**
     * A ubiquitous parameter used to dynamically bind the current mt assumptions,
     * if they can be expressed by a single mt.
     */
    @LispMethod(comment = "A ubiquitous parameter used to dynamically bind the current mt assumptions,\r\nif they can be expressed by a single mt.\ndefparameter\nA ubiquitous parameter used to dynamically bind the current mt assumptions,\nif they can be expressed by a single mt.")
    public static final SubLSymbol $mt$ = makeSymbol("*MT*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(makeSymbol("INLINE"), makeSymbol("MT-FUNCTION-EQ"), makeSymbol("RELEVANT-MT-FUNCTION-EQ"));

    private static final SubLList $list1 = list(makeSymbol("FUNCTION"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $relevant_mt_function$ = makeSymbol("*RELEVANT-MT-FUNCTION*");

    private static final SubLList $list4 = list(makeSymbol("MT"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym5$_MT_ = makeSymbol("*MT*");

    private static final SubLSymbol IN_MT_LIST = makeSymbol("IN-MT-LIST");

    static private final SubLList $list7 = list(makeSymbol("WITH-MT-LIST"), makeSymbol("WITH-MT-LIST-AND-GENL-MTS"), makeSymbol("POSSIBLY-WITH-INFERENCE-MT-RELEVANCE-INTERNAL"));

    private static final SubLList $list8 = list(makeSymbol("MT-LIST"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $relevant_mts$ = makeSymbol("*RELEVANT-MTS*");

    private static final SubLList $list10 = list(makeSymbol("INLINE"), makeSymbol("RELEVANT-MT-IS-EVERYTHING"), makeSymbol("RELEVANT-MT-IS-ANY-MT"), makeSymbol("RELEVANT-MT-IS-EQ"), makeSymbol("RELEVANT-MT-IS-IN-LIST"), makeSymbol("RELEVANT-MT-IS-GENL-MT"), makeSymbol("RELEVANT-MT-IS-SPEC-MT"), makeSymbol("RELEVANT-MT-IS-GENL-MT-OF-LIST-MEMBER"));

    private static final SubLSymbol SPECIAL_CORE_LOOP_MT_P = makeSymbol("SPECIAL-CORE-LOOP-MT-P");

    private static final SubLSymbol CORE_MICROTHEORY_P = makeSymbol("CORE-MICROTHEORY-P");



    private static final SubLSymbol RELEVANT_MT_IS_GENL_MT_WITH_ANY_TIME = makeSymbol("RELEVANT-MT-IS-GENL-MT-WITH-ANY-TIME");

    private static final SubLSymbol $UNABLE_TO_DETERMINE = makeKeyword("UNABLE-TO-DETERMINE");

    private static final SubLSymbol RELEVANT_MT_IS_SPEC_MT = makeSymbol("RELEVANT-MT-IS-SPEC-MT");

    private static final SubLSymbol WITH_MT_FUNCTION = makeSymbol("WITH-MT-FUNCTION");

    static private final SubLList $list26 = list(QUOTE, makeSymbol("RELEVANT-MT-IS-GENL-MT"));

    private static final SubLSymbol IN_MT = makeSymbol("IN-MT");

    private static final SubLSymbol WITH_GENL_MTS = makeSymbol("WITH-GENL-MTS");

    private static final SubLString $str29$MT_and_all_its_genl_mts_are_relev = makeString("MT and all its genl mts are relevant within BODY.");

    private static final SubLList $list30 = list(makeSymbol("ELMT"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol CANONICALIZE_HLMT = makeSymbol("CANONICALIZE-HLMT");

    private static final SubLList $list33 = list(QUOTE, makeSymbol("RELEVANT-MT-IS-EVERYTHING"));



    private static final SubLList $list36 = list(makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLString $str37$All_mts_are_relevant_within_BODY_ = makeString("All mts are relevant within BODY.");

    static private final SubLList $list38 = list(QUOTE, makeSymbol("RELEVANT-MT-IS-ANY-MT"));



    private static final SubLSymbol WITH_ANY_MT = makeSymbol("WITH-ANY-MT");

    private static final SubLString $str41$Any_mt_can_be_used_for_relevance_ = makeString("Any mt can be used for relevance for a particular inference within &BODY.");

    private static final SubLList $list42 = list(QUOTE, makeSymbol("RELEVANT-MT-IS-EQ"));

    private static final SubLSymbol WITH_JUST_MT = makeSymbol("WITH-JUST-MT");

    private static final SubLString $str44$Only_MT_is_relevant_within_BODY__ = makeString("Only MT is relevant within BODY (no genl mts).");

    static private final SubLList $list45 = list(QUOTE, makeSymbol("RELEVANT-MT-IS-IN-LIST"));

    private static final SubLString $str47$Each_mt_in_the_list_MT_LIST_is_re = makeString("Each mt in the list MT-LIST is relevant within BODY (no genl mts).");

    static private final SubLList $list48 = list(QUOTE, makeSymbol("RELEVANT-MT-IS-GENL-MT-OF-LIST-MEMBER"));

    static private final SubLList $list49 = list(makeSymbol("MT-UNION"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol WITH_MT_LIST_AND_GENL_MTS = makeSymbol("WITH-MT-LIST-AND-GENL-MTS");

    private static final SubLSymbol MT_UNION_MTS = makeSymbol("MT-UNION-MTS");

    private static final SubLList $list52 = list(QUOTE, makeSymbol("RELEVANT-MT-IS-GENL-MT-WITH-ANY-TIME"));

    private static final SubLList $list53 = list(QUOTE, makeSymbol("RELEVANT-MT-IS-SPEC-MT"));

    static private final SubLSymbol $sym55$MT_VAR = makeUninternedSymbol("MT-VAR");

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



    private static final SubLList $list90 = list(makeSymbol("MT-INFO"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol MT_FUNCTION_EQ = makeSymbol("MT-FUNCTION-EQ");

    private static final SubLList $list93 = list(list(QUOTE, makeSymbol("RELEVANT-MT-IS-EVERYTHING")));

    static private final SubLList $list94 = list(list(QUOTE, makeSymbol("RELEVANT-MT-IS-ANY-MT")));

    private static final SubLSymbol MT_UNION_NAUT_P = makeSymbol("MT-UNION-NAUT-P");

    private static final SubLSymbol WITH_GENL_MTS_OF_UNION = makeSymbol("WITH-GENL-MTS-OF-UNION");

    private static final SubLList $list97 = list(list(makeSymbol("VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol DO_ALL_FORT_INSTANCES = makeSymbol("DO-ALL-FORT-INSTANCES");

    private static final SubLList $list99 = list(reader_make_constant_shell("Microtheory"));

    private static final SubLSymbol MAP_MTS = makeSymbol("MAP-MTS");

    private static final SubLString $str101$Iterate_over_all_microtheories__b = makeString("Iterate over all microtheories, binding VAR to an mt and executing BODY.");

    static final boolean assertionsDisabledSynth = true;

    /**
     * any mt for which FUNCTION returns non-nil is relevant within BODY
     */
    @LispMethod(comment = "any mt for which FUNCTION returns non-nil is relevant within BODY")
    public static final SubLObject with_mt_function_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject function = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            function = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($relevant_mt_function$, function)), append(body, NIL));
            }
        }
    }

    /**
     * any mt for which FUNCTION returns non-nil is relevant within BODY
     */
    @LispMethod(comment = "any mt for which FUNCTION returns non-nil is relevant within BODY")
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

    /**
     * Return T iff relevant-mt function MT-FUNCTION matches that specified by SYMBOL
     */
    @LispMethod(comment = "Return T iff relevant-mt function MT-FUNCTION matches that specified by SYMBOL")
    public static final SubLObject mt_function_eq_alt(SubLObject mt_function, SubLObject symbol) {
        return eq(mt_function, symbol);
    }

    /**
     * Return T iff relevant-mt function MT-FUNCTION matches that specified by SYMBOL
     */
    @LispMethod(comment = "Return T iff relevant-mt function MT-FUNCTION matches that specified by SYMBOL")
    public static SubLObject mt_function_eq(final SubLObject mt_function, final SubLObject symbol) {
        return eq(mt_function, symbol);
    }

    /**
     * Return T iff the currently relevant mt-function matches that specified by SYMBOL
     */
    @LispMethod(comment = "Return T iff the currently relevant mt-function matches that specified by SYMBOL")
    public static final SubLObject relevant_mt_function_eq_alt(SubLObject symbol) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return com.cyc.cycjava.cycl.mt_relevance_macros.mt_function_eq($relevant_mt_function$.getDynamicValue(thread), symbol);
        }
    }

    /**
     * Return T iff the currently relevant mt-function matches that specified by SYMBOL
     */
    @LispMethod(comment = "Return T iff the currently relevant mt-function matches that specified by SYMBOL")
    public static SubLObject relevant_mt_function_eq(final SubLObject symbol) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return mt_function_eq($relevant_mt_function$.getDynamicValue(thread), symbol);
    }

    /**
     * BODY is executed with *mt* bound to MT
     */
    @LispMethod(comment = "BODY is executed with *mt* bound to MT")
    public static final SubLObject in_mt_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject mt = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt3);
            mt = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($sym4$_MT_, mt)), append(body, NIL));
            }
        }
    }

    /**
     * BODY is executed with *mt* bound to MT
     */
    @LispMethod(comment = "BODY is executed with *mt* bound to MT")
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

    /**
     * BODY is executed with *relevant-mts* bound to MT-LIST
     */
    @LispMethod(comment = "BODY is executed with *relevant-mts* bound to MT-LIST")
    public static final SubLObject in_mt_list_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject mt_list = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt7);
            mt_list = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($relevant_mts$, mt_list)), append(body, NIL));
            }
        }
    }

    /**
     * BODY is executed with *relevant-mts* bound to MT-LIST
     */
    @LispMethod(comment = "BODY is executed with *relevant-mts* bound to MT-LIST")
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

    public static final SubLObject current_mt_relevance_mt_context_alt() {
        return mt_vars.$mt_mt$.getGlobalValue();
    }

    public static SubLObject current_mt_relevance_mt_context() {
        return mt_vars.$mt_mt$.getGlobalValue();
    }

    public static final SubLObject current_mt_relevance_mt_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $mt$.getDynamicValue(thread);
        }
    }

    public static SubLObject current_mt_relevance_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $mt$.getDynamicValue(thread);
    }

    public static final SubLObject current_mt_relevance_mt_list_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $relevant_mts$.getDynamicValue(thread);
        }
    }

    public static SubLObject current_mt_relevance_mt_list() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $relevant_mts$.getDynamicValue(thread);
    }

    public static final SubLObject current_mt_relevance_test_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $relevant_mt_function$.getDynamicValue(thread);
        }
    }

    public static SubLObject current_mt_relevance_test() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $relevant_mt_function$.getDynamicValue(thread);
    }

    public static final SubLObject relevant_mt_is_everything_alt(SubLObject mt) {
        return T;
    }

    public static SubLObject relevant_mt_is_everything(final SubLObject mt) {
        return T;
    }

    public static final SubLObject relevant_mt_is_any_mt_alt(SubLObject mt) {
        return T;
    }

    public static SubLObject relevant_mt_is_any_mt(final SubLObject mt) {
        return T;
    }

    public static final SubLObject relevant_mt_is_eq_alt(SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return hlmt.hlmt_equal($mt$.getDynamicValue(thread), mt);
        }
    }

    public static SubLObject relevant_mt_is_eq(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return hlmt.hlmt_equal($mt$.getDynamicValue(thread), mt);
    }

    public static final SubLObject relevant_mt_is_in_list_alt(SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return subl_promotions.memberP(mt, $relevant_mts$.getDynamicValue(thread), HLMT_EQUAL, UNPROVIDED);
        }
    }

    public static SubLObject relevant_mt_is_in_list(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(mt, $relevant_mts$.getDynamicValue(thread), HLMT_EQUAL, UNPROVIDED);
    }

    public static final SubLObject relevant_mt_is_genl_mt_alt(SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (mt == $mt$.getDynamicValue(thread)) {
                return T;
            }
            {
                SubLObject spec_coreP = mt_vars.core_microtheory_p($mt$.getDynamicValue(thread));
                SubLObject genl_coreP = mt_vars.core_microtheory_p(mt);
                if ((NIL != spec_coreP) && (NIL != genl_coreP)) {
                    return mt_vars.core_genl_mtP(mt, $mt$.getDynamicValue(thread));
                } else {
                    if (NIL != genl_coreP) {
                        return T;
                    } else {
                        if (NIL != spec_coreP) {
                            return NIL;
                        } else {
                            return mt_relevance_cache.basemtP($mt$.getDynamicValue(thread), mt);
                        }
                    }
                }
            }
        }
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

    public static final SubLObject relevant_mt_is_spec_mt_alt(SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (mt == $mt$.getDynamicValue(thread)) {
                return T;
            }
            {
                SubLObject spec_coreP = mt_vars.core_microtheory_p($mt$.getDynamicValue(thread));
                SubLObject genl_coreP = mt_vars.core_microtheory_p(mt);
                if ((NIL != spec_coreP) && (NIL != genl_coreP)) {
                    if ((NIL != mt_vars.special_core_loop_mt_p(mt)) && (NIL != mt_vars.special_core_loop_mt_p($mt$.getDynamicValue(thread)))) {
                        return T;
                    } else {
                        return mt_vars.core_microtheory_L(mt, $mt$.getDynamicValue(thread));
                    }
                } else {
                    if (NIL != spec_coreP) {
                        return T;
                    } else {
                        if (NIL != genl_coreP) {
                            return NIL;
                        } else {
                            return mt_relevance_cache.basemtP(mt, $mt$.getDynamicValue(thread));
                        }
                    }
                }
            }
        }
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

    public static final SubLObject relevant_mt_is_genl_mt_of_list_member_alt(SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != mt_vars.special_core_loop_mt_p(mt)) && (NIL != find_if(SPECIAL_CORE_LOOP_MT_P, $relevant_mts$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                return T;
            }
            if (NIL != mt_vars.core_microtheory_p(mt)) {
                if ((NIL != $relevant_mts$.getDynamicValue(thread)) && (NIL != list_utilities.find_if_not(CORE_MICROTHEORY_P, $relevant_mts$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                    return T;
                }
                {
                    SubLObject cdolist_list_var = $relevant_mts$.getDynamicValue(thread);
                    SubLObject relevant_mt = NIL;
                    for (relevant_mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , relevant_mt = cdolist_list_var.first()) {
                        if (NIL != mt_vars.core_microtheory_L(relevant_mt, mt)) {
                            return T;
                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = $relevant_mts$.getDynamicValue(thread);
                SubLObject relevant_mt = NIL;
                for (relevant_mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , relevant_mt = cdolist_list_var.first()) {
                    if (NIL != mt_relevance_cache.basemtP(relevant_mt, mt)) {
                        return T;
                    }
                }
            }
            return NIL;
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

    public static final SubLObject relevant_mt_is_genl_mt_with_any_time_alt(SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject monad_mt = hlmt.hlmt_monad_mt(mt);
                if (NIL != com.cyc.cycjava.cycl.mt_relevance_macros.relevant_mt_is_genl_mt(monad_mt)) {
                    {
                        SubLObject anytime = hlmt.hlmt_temporal_mt($mt$.getDynamicValue(thread));
                        if (NIL != hlmt.anytime_psc_p(anytime)) {
                            return T;
                        } else {
                            {
                                SubLObject time_mt = hlmt.hlmt_temporal_mt(mt);
                                if (NIL != time_mt) {
                                    {
                                        SubLObject base_time = hlmt.anytime_during_psc_fn_time_interval(anytime);
                                        SubLObject base_mt = hlmt.new_time_dimension(base_time, $$TimePoint);
                                        return hlmt_relevance.temporal_mts_intersectP(time_mt, base_mt);
                                    }
                                } else {
                                    return T;
                                }
                            }
                        }
                    }
                } else {
                    return NIL;
                }
            }
        }
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

    /**
     * Return T iff MT is relevant with respect to the current dynamic mt scope.
     */
    @LispMethod(comment = "Return T iff MT is relevant with respect to the current dynamic mt scope.")
    public static final SubLObject relevant_mtP_alt(SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject function = $relevant_mt_function$.getDynamicValue(thread);
                if (NIL == function) {
                    return com.cyc.cycjava.cycl.mt_relevance_macros.relevant_mt_is_genl_mt(mt);
                }
                {
                    SubLObject pcase_var = function;
                    if (pcase_var.eql(RELEVANT_MT_IS_GENL_MT)) {
                        return com.cyc.cycjava.cycl.mt_relevance_macros.relevant_mt_is_genl_mt(mt);
                    } else {
                        if (pcase_var.eql(RELEVANT_MT_IS_ANY_MT)) {
                            return com.cyc.cycjava.cycl.mt_relevance_macros.relevant_mt_is_any_mt(mt);
                        } else {
                            if (pcase_var.eql(RELEVANT_MT_IS_EVERYTHING)) {
                                return com.cyc.cycjava.cycl.mt_relevance_macros.relevant_mt_is_everything(mt);
                            } else {
                                if (pcase_var.eql(RELEVANT_MT_IS_EQ)) {
                                    return com.cyc.cycjava.cycl.mt_relevance_macros.relevant_mt_is_eq(mt);
                                } else {
                                    if (pcase_var.eql(RELEVANT_MT_IS_IN_LIST)) {
                                        return com.cyc.cycjava.cycl.mt_relevance_macros.relevant_mt_is_in_list(mt);
                                    } else {
                                        if (pcase_var.eql(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER)) {
                                            return com.cyc.cycjava.cycl.mt_relevance_macros.relevant_mt_is_genl_mt_of_list_member(mt);
                                        } else {
                                            if (pcase_var.eql(RELEVANT_MT_IS_GENL_MT_WITH_ANY_TIME)) {
                                                return com.cyc.cycjava.cycl.mt_relevance_macros.relevant_mt_is_genl_mt_with_any_time(mt);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return funcall(function, mt);
            }
        }
    }

    /**
     * Return T iff MT is relevant with respect to the current dynamic mt scope.
     */
    @LispMethod(comment = "Return T iff MT is relevant with respect to the current dynamic mt scope.")
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

    /**
     * Return T iff the mt of ASSERTION is relevant with respect to the current dynamic mt scope.
     */
    @LispMethod(comment = "Return T iff the mt of ASSERTION is relevant with respect to the current dynamic mt scope.")
    public static final SubLObject relevant_assertionP_alt(SubLObject assertion) {
        return com.cyc.cycjava.cycl.mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(assertion));
    }

    /**
     * Return T iff the mt of ASSERTION is relevant with respect to the current dynamic mt scope.
     */
    @LispMethod(comment = "Return T iff the mt of ASSERTION is relevant with respect to the current dynamic mt scope.")
    public static SubLObject relevant_assertionP(final SubLObject assertion) {
        if (NIL != assertion_handles.assertion_p(assertion)) {
            return makeBoolean((NIL != any_or_all_mts_are_relevantP()) || (NIL != relevant_mtP(assertions_high.assertion_mt(assertion))));
        }
        return NIL;
    }

    public static final SubLObject mt_relevance_unspecifiedP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $relevant_mt_function$.getDynamicValue(thread)) {
                return T;
            }
            return makeBoolean((NIL != com.cyc.cycjava.cycl.mt_relevance_macros.relevant_mt_function_eq(RELEVANT_MT_IS_GENL_MT)) && ($mt$.getDynamicValue(thread) == mt_vars.$assertible_theory_mt_root$.getGlobalValue()));
        }
    }

    public static SubLObject mt_relevance_unspecifiedP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $relevant_mt_function$.getDynamicValue(thread)) {
            return T;
        }
        return makeBoolean((NIL != relevant_mt_function_eq(RELEVANT_MT_IS_GENL_MT)) && $mt$.getDynamicValue(thread).eql(mt_vars.$assertible_theory_mt_root$.getGlobalValue()));
    }

    public static final SubLObject genl_mts_are_relevantP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL == $relevant_mt_function$.getDynamicValue(thread)) || (NIL != com.cyc.cycjava.cycl.mt_relevance_macros.relevant_mt_function_eq(RELEVANT_MT_IS_GENL_MT)));
        }
    }

    public static SubLObject genl_mts_are_relevantP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL == $relevant_mt_function$.getDynamicValue(thread)) || (NIL != relevant_mt_function_eq(RELEVANT_MT_IS_GENL_MT)));
    }

    public static final SubLObject any_mt_is_relevantP_alt() {
        return com.cyc.cycjava.cycl.mt_relevance_macros.relevant_mt_function_eq(RELEVANT_MT_IS_ANY_MT);
    }

    public static SubLObject any_mt_is_relevantP() {
        return relevant_mt_function_eq(RELEVANT_MT_IS_ANY_MT);
    }

    public static final SubLObject all_mts_are_relevantP_alt() {
        return com.cyc.cycjava.cycl.mt_relevance_macros.relevant_mt_function_eq(RELEVANT_MT_IS_EVERYTHING);
    }

    public static SubLObject all_mts_are_relevantP() {
        return relevant_mt_function_eq(RELEVANT_MT_IS_EVERYTHING);
    }

    public static final SubLObject any_or_all_mts_are_relevantP_alt() {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.mt_relevance_macros.relevant_mt_function_eq(RELEVANT_MT_IS_EVERYTHING)) || (NIL != com.cyc.cycjava.cycl.mt_relevance_macros.relevant_mt_function_eq(RELEVANT_MT_IS_ANY_MT)));
    }

    public static SubLObject any_or_all_mts_are_relevantP() {
        return makeBoolean((NIL != relevant_mt_function_eq(RELEVANT_MT_IS_EVERYTHING)) || (NIL != relevant_mt_function_eq(RELEVANT_MT_IS_ANY_MT)));
    }

    public static final SubLObject listed_mts_are_relevantP_alt() {
        return com.cyc.cycjava.cycl.mt_relevance_macros.relevant_mt_function_eq(RELEVANT_MT_IS_IN_LIST);
    }

    public static SubLObject listed_mts_are_relevantP() {
        return relevant_mt_function_eq(RELEVANT_MT_IS_IN_LIST);
    }

    public static final SubLObject genl_mts_of_listed_mts_are_relevantP_alt() {
        return com.cyc.cycjava.cycl.mt_relevance_macros.relevant_mt_function_eq(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER);
    }

    public static SubLObject genl_mts_of_listed_mts_are_relevantP() {
        return relevant_mt_function_eq(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER);
    }

    public static final SubLObject any_time_is_relevantP_alt() {
        return com.cyc.cycjava.cycl.mt_relevance_macros.relevant_mt_function_eq(RELEVANT_MT_IS_GENL_MT_WITH_ANY_TIME);
    }

    public static SubLObject any_time_is_relevantP() {
        return relevant_mt_function_eq(RELEVANT_MT_IS_GENL_MT_WITH_ANY_TIME);
    }

    public static final SubLObject spec_mts_are_relevantP_alt() {
        return com.cyc.cycjava.cycl.mt_relevance_macros.relevant_mt_function_eq(RELEVANT_MT_IS_SPEC_MT);
    }

    public static SubLObject spec_mts_are_relevantP() {
        return relevant_mt_function_eq(RELEVANT_MT_IS_SPEC_MT);
    }

    public static final SubLObject only_specified_mt_is_relevantP_alt() {
        return com.cyc.cycjava.cycl.mt_relevance_macros.relevant_mt_function_eq(RELEVANT_MT_IS_EQ);
    }

    public static SubLObject only_specified_mt_is_relevantP() {
        return relevant_mt_function_eq(RELEVANT_MT_IS_EQ);
    }

    /**
     * MT and all its genl mts are relevant within BODY.
     */
    @LispMethod(comment = "MT and all its genl mts are relevant within BODY.")
    public static final SubLObject with_genl_mts_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject mt = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt3);
            mt = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(WITH_MT_FUNCTION, $list_alt22, listS(IN_MT, mt, append(body, NIL)));
            }
        }
    }

    /**
     * MT and all its genl mts are relevant within BODY.
     */
    @LispMethod(comment = "MT and all its genl mts are relevant within BODY.")
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

    /**
     * Canonicalizes ELMT into its HL form (call it HLMT), then sets
     * HLMT and all its genlMts to be relevant within BODY.
     */
    @LispMethod(comment = "Canonicalizes ELMT into its HL form (call it HLMT), then sets\r\nHLMT and all its genlMts to be relevant within BODY.\nCanonicalizes ELMT into its HL form (call it HLMT), then sets\nHLMT and all its genlMts to be relevant within BODY.")
    public static final SubLObject with_genl_mts_el_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject elmt = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt26);
            elmt = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(WITH_GENL_MTS, list(CANONICALIZE_HLMT, elmt), append(body, NIL));
            }
        }
    }

    /**
     * Canonicalizes ELMT into its HL form (call it HLMT), then sets
     * HLMT and all its genlMts to be relevant within BODY.
     */
    @LispMethod(comment = "Canonicalizes ELMT into its HL form (call it HLMT), then sets\r\nHLMT and all its genlMts to be relevant within BODY.\nCanonicalizes ELMT into its HL form (call it HLMT), then sets\nHLMT and all its genlMts to be relevant within BODY.")
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

    /**
     * MT and all its genl mts are relevant within BODY.
     */
    @LispMethod(comment = "MT and all its genl mts are relevant within BODY.")
    public static final SubLObject with_mt_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject mt = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt3);
            mt = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(WITH_GENL_MTS, mt, append(body, NIL));
            }
        }
    }

    /**
     * MT and all its genl mts are relevant within BODY.
     */
    @LispMethod(comment = "MT and all its genl mts are relevant within BODY.")
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

    /**
     * All mts are relevant within BODY.
     */
    @LispMethod(comment = "All mts are relevant within BODY.")
    public static final SubLObject with_all_mts_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(WITH_MT_FUNCTION, $list_alt29, listS(IN_MT, $$EverythingPSC, append(body, NIL)));
        }
    }

    /**
     * All mts are relevant within BODY.
     */
    @LispMethod(comment = "All mts are relevant within BODY.")
    public static SubLObject with_all_mts(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(WITH_MT_FUNCTION, $list33, listS(IN_MT, $$EverythingPSC, append(body, NIL)));
    }

    /**
     * Any mt can be used for relevance for a particular inference within &BODY.
     */
    @LispMethod(comment = "Any mt can be used for relevance for a particular inference within &BODY.")
    public static final SubLObject with_any_mt_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(WITH_MT_FUNCTION, $list_alt34, listS(IN_MT, $$InferencePSC, append(body, NIL)));
        }
    }

    /**
     * Any mt can be used for relevance for a particular inference within &BODY.
     */
    @LispMethod(comment = "Any mt can be used for relevance for a particular inference within &BODY.")
    public static SubLObject with_any_mt(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(WITH_MT_FUNCTION, $list38, listS(IN_MT, $$InferencePSC, append(body, NIL)));
    }

    /**
     * Only MT is relevant within BODY (no genl mts).
     */
    @LispMethod(comment = "Only MT is relevant within BODY (no genl mts).")
    public static final SubLObject with_just_mt_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject mt = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt3);
            mt = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(WITH_MT_FUNCTION, $list_alt38, listS(IN_MT, mt, append(body, NIL)));
            }
        }
    }

    /**
     * Only MT is relevant within BODY (no genl mts).
     */
    @LispMethod(comment = "Only MT is relevant within BODY (no genl mts).")
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

    /**
     * Each mt in the list MT-LIST is relevant within BODY (no genl mts).
     */
    @LispMethod(comment = "Each mt in the list MT-LIST is relevant within BODY (no genl mts).")
    public static final SubLObject with_mt_list_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject mt_list = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt7);
            mt_list = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(WITH_MT_FUNCTION, $list_alt41, listS(IN_MT_LIST, mt_list, append(body, NIL)));
            }
        }
    }

    /**
     * Each mt in the list MT-LIST is relevant within BODY (no genl mts).
     */
    @LispMethod(comment = "Each mt in the list MT-LIST is relevant within BODY (no genl mts).")
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

    /**
     * Each mt in the list MT-LIST (and all their genl mts) are relevant within BODY.
     */
    @LispMethod(comment = "Each mt in the list MT-LIST (and all their genl mts) are relevant within BODY.")
    public static final SubLObject with_mt_list_and_genl_mts_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject mt_list = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt7);
            mt_list = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(WITH_MT_FUNCTION, $list_alt44, listS(IN_MT_LIST, mt_list, append(body, NIL)));
            }
        }
    }

    /**
     * Each mt in the list MT-LIST (and all their genl mts) are relevant within BODY.
     */
    @LispMethod(comment = "Each mt in the list MT-LIST (and all their genl mts) are relevant within BODY.")
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

    /**
     * Each of the mts in the MT-UNION (and all their genl mts) are relevant within BODY.
     */
    @LispMethod(comment = "Each of the mts in the MT-UNION (and all their genl mts) are relevant within BODY.")
    public static final SubLObject with_genl_mts_of_union_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject mt_union = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt45);
            mt_union = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(WITH_MT_LIST_AND_GENL_MTS, list(MT_UNION_MTS, mt_union), append(body, NIL));
            }
        }
    }

    /**
     * Each of the mts in the MT-UNION (and all their genl mts) are relevant within BODY.
     */
    @LispMethod(comment = "Each of the mts in the MT-UNION (and all their genl mts) are relevant within BODY.")
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

    /**
     * MT and all its genlMts are relevant ignoring the time dimension.
     */
    @LispMethod(comment = "MT and all its genlMts are relevant ignoring the time dimension.")
    public static final SubLObject with_any_time_relevance_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject mt = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt3);
            mt = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(WITH_MT_FUNCTION, $list_alt48, listS(IN_MT, mt, append(body, NIL)));
            }
        }
    }

    /**
     * MT and all its genlMts are relevant ignoring the time dimension.
     */
    @LispMethod(comment = "MT and all its genlMts are relevant ignoring the time dimension.")
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

    /**
     * MT and all its spec mts are relevant within BODY.
     */
    @LispMethod(comment = "MT and all its spec mts are relevant within BODY.")
    public static final SubLObject with_spec_mts_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject mt = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt3);
            mt = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(WITH_MT_FUNCTION, $list_alt49, listS(IN_MT, mt, append(body, NIL)));
            }
        }
    }

    /**
     * MT and all its spec mts are relevant within BODY.
     */
    @LispMethod(comment = "MT and all its spec mts are relevant within BODY.")
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

    /**
     * BODY evaluated, in MT if present.
     */
    @LispMethod(comment = "BODY evaluated, in MT if present.")
    public static final SubLObject possibly_in_mt_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject mt = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt3);
            mt = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                if (NIL == mt) {
                    return bq_cons(PROGN, append(body, NIL));
                }
                {
                    SubLObject mt_var = $sym51$MT_VAR;
                    return list(CLET, list(list(mt_var, mt)), list(WITH_MT_FUNCTION, list(POSSIBLY_IN_MT_DETERMINE_FUNCTION, mt_var), listS(IN_MT, list(POSSIBLY_IN_MT_DETERMINE_MT, mt_var), append(body, NIL))));
                }
            }
        }
    }

    /**
     * BODY evaluated, in MT if present.
     */
    @LispMethod(comment = "BODY evaluated, in MT if present.")
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

    public static final SubLObject possibly_in_mt_determine_function_alt(SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (((((NIL == mt) || (NIL != com.cyc.cycjava.cycl.mt_relevance_macros.with_inference_any_mt_relevanceP(mt))) || (NIL != com.cyc.cycjava.cycl.mt_relevance_macros.with_inference_mt_relevance_all_mtsP(mt))) || (NIL != com.cyc.cycjava.cycl.mt_relevance_macros.genl_mts_of_listed_mts_are_relevantP())) || (NIL != com.cyc.cycjava.cycl.mt_relevance_macros.any_time_is_relevantP())) {
                return $relevant_mt_function$.getDynamicValue(thread);
            }
            return RELEVANT_MT_IS_GENL_MT;
        }
    }

    public static SubLObject possibly_in_mt_determine_function(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((((NIL == mt) || (NIL != with_inference_any_mt_relevanceP(mt))) || (NIL != with_inference_mt_relevance_all_mtsP(mt))) || (NIL != genl_mts_of_listed_mts_are_relevantP())) || (NIL != any_time_is_relevantP())) {
            return $relevant_mt_function$.getDynamicValue(thread);
        }
        return RELEVANT_MT_IS_GENL_MT;
    }

    public static final SubLObject possibly_in_mt_determine_mt_alt(SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return NIL != mt ? ((SubLObject) (mt)) : $mt$.getDynamicValue(thread);
        }
    }

    public static SubLObject possibly_in_mt_determine_mt(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != mt ? mt : $mt$.getDynamicValue(thread);
    }

    /**
     * BODY evaluated, in MT (excluding genl mts) if present.
     */
    @LispMethod(comment = "BODY evaluated, in MT (excluding genl mts) if present.")
    public static final SubLObject possibly_with_just_mt_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject mt = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt3);
            mt = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                if (NIL == mt) {
                    return bq_cons(PROGN, append(body, NIL));
                }
                {
                    SubLObject mt_var = $sym55$MT_VAR;
                    return list(CLET, list(list(mt_var, mt)), list(WITH_MT_FUNCTION, list(POSSIBLY_WITH_JUST_MT_DETERMINE_FUNCTION, mt_var), listS(IN_MT, list(POSSIBLY_WITH_JUST_MT_DETERMINE_MT, mt_var), append(body, NIL))));
                }
            }
        }
    }

    /**
     * BODY evaluated, in MT (excluding genl mts) if present.
     */
    @LispMethod(comment = "BODY evaluated, in MT (excluding genl mts) if present.")
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

    public static final SubLObject possibly_with_just_mt_determine_function_alt(SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == mt) {
                return $relevant_mt_function$.getDynamicValue(thread);
            }
            SubLTrampolineFile.checkType(mt, HLMT_P);
            return RELEVANT_MT_IS_EQ;
        }
    }

    public static SubLObject possibly_with_just_mt_determine_function(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == mt) {
            return $relevant_mt_function$.getDynamicValue(thread);
        }
        assert NIL != hlmt.hlmt_p(mt) : "! hlmt.hlmt_p(mt) " + ("hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) ") + mt;
        return RELEVANT_MT_IS_EQ;
    }

    public static final SubLObject possibly_with_just_mt_determine_mt_alt(SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return NIL != mt ? ((SubLObject) (mt)) : $mt$.getDynamicValue(thread);
        }
    }

    public static SubLObject possibly_with_just_mt_determine_mt(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != mt ? mt : $mt$.getDynamicValue(thread);
    }

    /**
     * BODY evaluated with the same relevance used for inferences in MT.
     * This is like @xref with-genl-mts, except it is special-cased to
     *
     * @unknown with-all-mts when the mt is #$EverythingPSC,
     * @unknown with-any-mt when the mt is #$InferencePSC.
    Also, with-inference-mt-relevance errors if passed NIL for an mt.
     */
    @LispMethod(comment = "BODY evaluated with the same relevance used for inferences in MT.\r\nThis is like @xref with-genl-mts, except it is special-cased to\r\n\r\n@unknown with-all-mts when the mt is #$EverythingPSC,\r\n@unknown with-any-mt when the mt is #$InferencePSC.\r\nAlso, with-inference-mt-relevance errors if passed NIL for an mt.\nBODY evaluated with the same relevance used for inferences in MT.\nThis is like @xref with-genl-mts, except it is special-cased to")
    public static final SubLObject with_inference_mt_relevance_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject mt = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt3);
            mt = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(POSSIBLY_WITH_INFERENCE_MT_RELEVANCE_INTERNAL, list(WITH_INFERENCE_MT_RELEVANCE_VALIDATE, mt), append(body, NIL));
            }
        }
    }

    /**
     * BODY evaluated with the same relevance used for inferences in MT.
     * This is like @xref with-genl-mts, except it is special-cased to
     *
     * @unknown with-all-mts when the mt is #$EverythingPSC,
     * @unknown with-any-mt when the mt is #$InferencePSC.
    Also, with-inference-mt-relevance errors if passed NIL for an mt.
     */
    @LispMethod(comment = "BODY evaluated with the same relevance used for inferences in MT.\r\nThis is like @xref with-genl-mts, except it is special-cased to\r\n\r\n@unknown with-all-mts when the mt is #$EverythingPSC,\r\n@unknown with-any-mt when the mt is #$InferencePSC.\r\nAlso, with-inference-mt-relevance errors if passed NIL for an mt.\nBODY evaluated with the same relevance used for inferences in MT.\nThis is like @xref with-genl-mts, except it is special-cased to")
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

    /**
     * Like @xref WITH-INFERENCE-MT-RELEVANCE except that ELMT
     * is canonicalized to a HLMT if possible.
     */
    @LispMethod(comment = "Like @xref WITH-INFERENCE-MT-RELEVANCE except that ELMT\r\nis canonicalized to a HLMT if possible.\nLike @xref WITH-INFERENCE-MT-RELEVANCE except that ELMT\nis canonicalized to a HLMT if possible.")
    public static final SubLObject with_inference_mt_relevance_el_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject elmt = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt26);
            elmt = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(WITH_INFERENCE_MT_RELEVANCE, list(DETERMINE_INFERENCE_MT_RELEVANCE_EL_SPEC, elmt), append(body, NIL));
            }
        }
    }

    /**
     * Like @xref WITH-INFERENCE-MT-RELEVANCE except that ELMT
     * is canonicalized to a HLMT if possible.
     */
    @LispMethod(comment = "Like @xref WITH-INFERENCE-MT-RELEVANCE except that ELMT\r\nis canonicalized to a HLMT if possible.\nLike @xref WITH-INFERENCE-MT-RELEVANCE except that ELMT\nis canonicalized to a HLMT if possible.")
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

    public static final SubLObject with_inference_mt_relevance_validate_alt(SubLObject mt) {
        return NIL != mt ? ((SubLObject) (mt)) : Errors.error($str_alt65$No_microtheory_was_specified_);
    }

    public static SubLObject with_inference_mt_relevance_validate(final SubLObject mt) {
        return NIL != mt ? mt : Errors.error($str69$No_microtheory_was_specified_);
    }

    public static final SubLObject determine_inference_mt_relevance_el_spec_alt(SubLObject elmt) {
        return NIL != hlmt.possibly_mt_p(elmt) ? ((SubLObject) (hlmt_czer.canonicalize_hlmt(elmt))) : elmt;
    }

    public static SubLObject determine_inference_mt_relevance_el_spec(final SubLObject elmt) {
        return NIL != hlmt.possibly_mt_p(elmt) ? hlmt_czer.canonicalize_hlmt(elmt) : elmt;
    }

    public static final SubLObject possibly_with_inference_mt_relevance_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject mt = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt3);
            mt = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(POSSIBLY_WITH_INFERENCE_MT_RELEVANCE_INTERNAL, mt, append(body, NIL));
            }
        }
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

    public static final SubLObject possibly_with_inference_mt_relevance_internal_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject mt = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt3);
            mt = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                if (NIL == mt) {
                    return bq_cons(PROGN, append(body, NIL));
                }
                {
                    SubLObject mt_var = $sym68$MT_VAR;
                    return list(CLET, list(list(mt_var, mt)), list(IN_MT, list(UPDATE_INFERENCE_MT_RELEVANCE_MT, mt_var), list(WITH_MT_FUNCTION, list(UPDATE_INFERENCE_MT_RELEVANCE_FUNCTION, mt_var), listS(IN_MT_LIST, list(UPDATE_INFERENCE_MT_RELEVANCE_MT_LIST, mt_var), append(body, NIL)))));
                }
            }
        }
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

    public static final SubLObject possibly_with_inference_mt_relevance_el_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject elmt = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt26);
            elmt = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(POSSIBLY_WITH_INFERENCE_MT_RELEVANCE, list(CANONICALIZE_HLMT, elmt), append(body, NIL));
            }
        }
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

    public static final SubLObject update_inference_mt_relevance_mt_alt(SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != mt) {
                SubLTrampolineFile.checkType(mt, HLMT_P);
            }
            if (NIL == mt) {
                return $mt$.getDynamicValue(thread);
            } else {
                return mt;
            }
        }
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

    public static final SubLObject update_inference_mt_relevance_function_alt(SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == mt) {
                return $relevant_mt_function$.getDynamicValue(thread);
            } else {
                if (NIL != com.cyc.cycjava.cycl.mt_relevance_macros.with_inference_any_mt_relevanceP(mt)) {
                    return RELEVANT_MT_IS_ANY_MT;
                } else {
                    if (NIL != com.cyc.cycjava.cycl.mt_relevance_macros.with_inference_mt_relevance_all_mtsP(mt)) {
                        return RELEVANT_MT_IS_EVERYTHING;
                    } else {
                        if (NIL != com.cyc.cycjava.cycl.mt_relevance_macros.with_mt_union_relevanceP(mt)) {
                            return RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER;
                        } else {
                            if (NIL != com.cyc.cycjava.cycl.mt_relevance_macros.with_inference_anytime_relevanceP(mt)) {
                                return RELEVANT_MT_IS_GENL_MT_WITH_ANY_TIME;
                            } else {
                                return RELEVANT_MT_IS_GENL_MT;
                            }
                        }
                    }
                }
            }
        }
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

    public static final SubLObject update_inference_mt_relevance_mt_list_alt(SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == mt) {
                return $relevant_mts$.getDynamicValue(thread);
            } else {
                if (NIL != com.cyc.cycjava.cycl.mt_relevance_macros.with_mt_union_relevanceP(mt)) {
                    return hlmt.mt_union_mts(mt);
                } else {
                    return NIL;
                }
            }
        }
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

    public static final SubLObject determine_possibly_with_inference_mt_relevance_mt_and_spec_alt(SubLObject mt) {
        return values(com.cyc.cycjava.cycl.mt_relevance_macros.update_inference_mt_relevance_function(mt), com.cyc.cycjava.cycl.mt_relevance_macros.update_inference_mt_relevance_mt(mt), com.cyc.cycjava.cycl.mt_relevance_macros.update_inference_mt_relevance_mt_list(mt));
    }

    public static SubLObject determine_possibly_with_inference_mt_relevance_mt_and_spec(final SubLObject mt) {
        return values(update_inference_mt_relevance_function(mt), update_inference_mt_relevance_mt(mt), update_inference_mt_relevance_mt_list(mt));
    }

    public static final SubLObject with_inference_any_mt_relevanceP_alt(SubLObject mt) {
        return eq(PSC_INFERENCE, psc.mt_inference_function(mt));
    }

    public static SubLObject with_inference_any_mt_relevanceP(final SubLObject mt) {
        return eq(PSC_INFERENCE, psc.mt_inference_function(mt));
    }

    public static final SubLObject with_inference_mt_relevance_all_mtsP_alt(SubLObject mt) {
        return eq(ALL_MTS_INFERENCE, psc.mt_inference_function(mt));
    }

    public static SubLObject with_inference_mt_relevance_all_mtsP(final SubLObject mt) {
        return eq(ALL_MTS_INFERENCE, psc.mt_inference_function(mt));
    }

    public static final SubLObject with_mt_union_relevanceP_alt(SubLObject mt) {
        return eq(MT_UNION_INFERENCE, psc.mt_inference_function(mt));
    }

    public static SubLObject with_mt_union_relevanceP(final SubLObject mt) {
        return eq(MT_UNION_INFERENCE, psc.mt_inference_function(mt));
    }

    public static final SubLObject with_inference_anytime_relevanceP_alt(SubLObject mt) {
        return eq(ANYTIME_PSC_INFERENCE, psc.mt_inference_function(mt));
    }

    public static SubLObject with_inference_anytime_relevanceP(final SubLObject mt) {
        return eq(ANYTIME_PSC_INFERENCE, psc.mt_inference_function(mt));
    }

    /**
     * From the dynamic mt context, return an mt suitable for passing to
     *
     * @unknown with-inference-mt-relevance.  Using this is usually preferable to
    referencing *mt* directly.
     */
    @LispMethod(comment = "From the dynamic mt context, return an mt suitable for passing to\r\n\r\n@unknown with-inference-mt-relevance.  Using this is usually preferable to\r\nreferencing *mt* directly.")
    public static final SubLObject inference_relevant_mt_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != com.cyc.cycjava.cycl.mt_relevance_macros.all_mts_are_relevantP()) {
                return $$EverythingPSC;
            } else {
                if (NIL != com.cyc.cycjava.cycl.mt_relevance_macros.any_mt_is_relevantP()) {
                    return $$InferencePSC;
                } else {
                    if (NIL != com.cyc.cycjava.cycl.mt_relevance_macros.genl_mts_of_listed_mts_are_relevantP()) {
                        return make_formula($$MtUnionFn, $relevant_mts$.getDynamicValue(thread), UNPROVIDED);
                    } else {
                        if (NIL != com.cyc.cycjava.cycl.mt_relevance_macros.genl_mts_are_relevantP()) {
                            return $mt$.getDynamicValue(thread);
                        } else {
                            return $mt$.getDynamicValue(thread);
                        }
                    }
                }
            }
        }
    }

    /**
     * From the dynamic mt context, return an mt suitable for passing to
     *
     * @unknown with-inference-mt-relevance.  Using this is usually preferable to
    referencing *mt* directly.
     */
    @LispMethod(comment = "From the dynamic mt context, return an mt suitable for passing to\r\n\r\n@unknown with-inference-mt-relevance.  Using this is usually preferable to\r\nreferencing *mt* directly.")
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

    public static final SubLObject mt_info_alt(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != com.cyc.cycjava.cycl.mt_relevance_macros.all_mts_are_relevantP()) {
                return $relevant_mt_function$.getDynamicValue(thread);
            } else {
                if (NIL != com.cyc.cycjava.cycl.mt_relevance_macros.any_mt_is_relevantP()) {
                    return $relevant_mt_function$.getDynamicValue(thread);
                } else {
                    if (NIL != com.cyc.cycjava.cycl.mt_relevance_macros.genl_mts_of_listed_mts_are_relevantP()) {
                        return make_formula($$MtUnionFn, $relevant_mts$.getDynamicValue(thread), UNPROVIDED);
                    } else {
                        if (NIL != mt) {
                            return mt;
                        } else {
                            if (NIL != $mt$.getDynamicValue(thread)) {
                                return $mt$.getDynamicValue(thread);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
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

    /**
     * Return the mt-info corresponding to MT.
     */
    @LispMethod(comment = "Return the mt-info corresponding to MT.")
    public static final SubLObject mt_to_mt_info_alt(SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mt_info = NIL;
                SubLObject mt_var = com.cyc.cycjava.cycl.mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                {
                    SubLObject _prev_bind_0 = $mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $relevant_mts$.currentBinding(thread);
                    try {
                        $mt$.bind(com.cyc.cycjava.cycl.mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        $relevant_mt_function$.bind(com.cyc.cycjava.cycl.mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        $relevant_mts$.bind(com.cyc.cycjava.cycl.mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        mt_info = com.cyc.cycjava.cycl.mt_relevance_macros.mt_info(UNPROVIDED);
                    } finally {
                        $relevant_mts$.rebind(_prev_bind_2, thread);
                        $relevant_mt_function$.rebind(_prev_bind_1, thread);
                        $mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return mt_info;
            }
        }
    }

    @LispMethod(comment = "Return the mt-info corresponding to MT.")
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

    public static final SubLObject with_mt_info_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject mt_info = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt85);
            mt_info = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PCOND, list(listS(MT_FUNCTION_EQ, mt_info, $list_alt88), bq_cons(WITH_ALL_MTS, append(body, NIL))), list(listS(MT_FUNCTION_EQ, mt_info, $list_alt89), bq_cons(WITH_ANY_MT, append(body, NIL))), list(list(MT_UNION_NAUT_P, mt_info), listS(WITH_GENL_MTS_OF_UNION, mt_info, append(body, NIL))), list(T, listS(WITH_GENL_MTS, mt_info, append(body, NIL))));
            }
        }
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

    public static final SubLObject in_one_of_these_mtsP_alt(SubLObject ass, SubLObject mts) {
        return subl_promotions.memberP(assertions_high.assertion_mt(ass), mts, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject in_one_of_these_mtsP(final SubLObject ass, final SubLObject mts) {
        return subl_promotions.memberP(assertions_high.assertion_mt(ass), mts, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject any_or_all_mts_relevant_to_mtP_alt(SubLObject mt) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.mt_relevance_macros.with_inference_any_mt_relevanceP(mt)) || (NIL != com.cyc.cycjava.cycl.mt_relevance_macros.with_inference_mt_relevance_all_mtsP(mt)));
    }

    public static SubLObject any_or_all_mts_relevant_to_mtP(final SubLObject mt) {
        return makeBoolean((NIL != with_inference_any_mt_relevanceP(mt)) || (NIL != with_inference_mt_relevance_all_mtsP(mt)));
    }

    /**
     * Assuming that relevance is being established from MT, and we are imposing a constraint
     * about which we need to be conservative, return the mt in which we should look for such constraints.
     */
    @LispMethod(comment = "Assuming that relevance is being established from MT, and we are imposing a constraint\r\nabout which we need to be conservative, return the mt in which we should look for such constraints.\nAssuming that relevance is being established from MT, and we are imposing a constraint\nabout which we need to be conservative, return the mt in which we should look for such constraints.")
    public static final SubLObject conservative_constraint_mt_alt(SubLObject mt) {
        if (NIL != com.cyc.cycjava.cycl.mt_relevance_macros.any_or_all_mts_relevant_to_mtP(mt)) {
            return mt_vars.$core_mt_floor$.getGlobalValue();
        } else {
            return mt;
        }
    }

    @LispMethod(comment = "Assuming that relevance is being established from MT, and we are imposing a constraint\r\nabout which we need to be conservative, return the mt in which we should look for such constraints.\nAssuming that relevance is being established from MT, and we are imposing a constraint\nabout which we need to be conservative, return the mt in which we should look for such constraints.")
    public static SubLObject conservative_constraint_mt(final SubLObject mt) {
        if (NIL != any_or_all_mts_relevant_to_mtP(mt)) {
            return mt_vars.$core_mt_floor$.getGlobalValue();
        }
        return mt;
    }

    /**
     * Is possibly-relevant-mt relevant to mt?
     */
    @LispMethod(comment = "Is possibly-relevant-mt relevant to mt?")
    public static final SubLObject mt_relevant_to_mtP_alt(SubLObject mt, SubLObject possibly_relevant_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject relevantP = NIL;
                SubLObject mt_var = com.cyc.cycjava.cycl.mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                {
                    SubLObject _prev_bind_0 = $mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $relevant_mts$.currentBinding(thread);
                    try {
                        $mt$.bind(com.cyc.cycjava.cycl.mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        $relevant_mt_function$.bind(com.cyc.cycjava.cycl.mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        $relevant_mts$.bind(com.cyc.cycjava.cycl.mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        relevantP = com.cyc.cycjava.cycl.mt_relevance_macros.relevant_mtP(possibly_relevant_mt);
                    } finally {
                        $relevant_mts$.rebind(_prev_bind_2, thread);
                        $relevant_mt_function$.rebind(_prev_bind_1, thread);
                        $mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return relevantP;
            }
        }
    }

    @LispMethod(comment = "Is possibly-relevant-mt relevant to mt?")
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

    public static final SubLObject any_relevant_mtP_alt(SubLObject mts) {
        {
            SubLObject relevantP = NIL;
            if (NIL == relevantP) {
                {
                    SubLObject csome_list_var = mts;
                    SubLObject mt = NIL;
                    for (mt = csome_list_var.first(); !((NIL != relevantP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , mt = csome_list_var.first()) {
                        if (NIL != com.cyc.cycjava.cycl.mt_relevance_macros.relevant_mtP(mt)) {
                            relevantP = T;
                        }
                    }
                }
            }
            return relevantP;
        }
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

    /**
     * Iterate over all microtheories, binding VAR to an mt and executing BODY.
     */
    @LispMethod(comment = "Iterate over all microtheories, binding VAR to an mt and executing BODY.")
    public static final SubLObject map_mts_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt92);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt92);
                    var = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(WITH_ALL_MTS, listS(DO_ALL_FORT_INSTANCES, bq_cons(var, $list_alt94), append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt92);
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Iterate over all microtheories, binding VAR to an mt and executing BODY.")
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
        declareMacro("with_mt_function", "WITH-MT-FUNCTION");
        declareFunction("mt_function_eq", "MT-FUNCTION-EQ", 2, 0, false);
        declareFunction("relevant_mt_function_eq", "RELEVANT-MT-FUNCTION-EQ", 1, 0, false);
        declareMacro("in_mt", "IN-MT");
        declareMacro("in_mt_list", "IN-MT-LIST");
        declareFunction("current_mt_relevance_mt_context", "CURRENT-MT-RELEVANCE-MT-CONTEXT", 0, 0, false);
        declareFunction("current_mt_relevance_mt", "CURRENT-MT-RELEVANCE-MT", 0, 0, false);
        declareFunction("current_mt_relevance_mt_list", "CURRENT-MT-RELEVANCE-MT-LIST", 0, 0, false);
        declareFunction("current_mt_relevance_test", "CURRENT-MT-RELEVANCE-TEST", 0, 0, false);
        declareFunction("relevant_mt_is_everything", "RELEVANT-MT-IS-EVERYTHING", 1, 0, false);
        declareFunction("relevant_mt_is_any_mt", "RELEVANT-MT-IS-ANY-MT", 1, 0, false);
        declareFunction("relevant_mt_is_eq", "RELEVANT-MT-IS-EQ", 1, 0, false);
        declareFunction("relevant_mt_is_in_list", "RELEVANT-MT-IS-IN-LIST", 1, 0, false);
        declareFunction("relevant_mt_is_genl_mt", "RELEVANT-MT-IS-GENL-MT", 1, 0, false);
        declareFunction("relevant_mt_is_spec_mt", "RELEVANT-MT-IS-SPEC-MT", 1, 0, false);
        declareFunction("relevant_mt_is_genl_mt_of_list_member", "RELEVANT-MT-IS-GENL-MT-OF-LIST-MEMBER", 1, 0, false);
        declareFunction("relevant_mt_is_genl_mt_with_any_time", "RELEVANT-MT-IS-GENL-MT-WITH-ANY-TIME", 1, 0, false);
        declareFunction("relevant_mtP", "RELEVANT-MT?", 1, 0, false);
        declareFunction("all_possibly_relevant_mts", "ALL-POSSIBLY-RELEVANT-MTS", 0, 0, false);
        declareFunction("relevant_assertionP", "RELEVANT-ASSERTION?", 1, 0, false);
        declareFunction("mt_relevance_unspecifiedP", "MT-RELEVANCE-UNSPECIFIED?", 0, 0, false);
        declareFunction("genl_mts_are_relevantP", "GENL-MTS-ARE-RELEVANT?", 0, 0, false);
        declareFunction("any_mt_is_relevantP", "ANY-MT-IS-RELEVANT?", 0, 0, false);
        declareFunction("all_mts_are_relevantP", "ALL-MTS-ARE-RELEVANT?", 0, 0, false);
        declareFunction("any_or_all_mts_are_relevantP", "ANY-OR-ALL-MTS-ARE-RELEVANT?", 0, 0, false);
        declareFunction("listed_mts_are_relevantP", "LISTED-MTS-ARE-RELEVANT?", 0, 0, false);
        declareFunction("genl_mts_of_listed_mts_are_relevantP", "GENL-MTS-OF-LISTED-MTS-ARE-RELEVANT?", 0, 0, false);
        declareFunction("any_time_is_relevantP", "ANY-TIME-IS-RELEVANT?", 0, 0, false);
        declareFunction("spec_mts_are_relevantP", "SPEC-MTS-ARE-RELEVANT?", 0, 0, false);
        declareFunction("only_specified_mt_is_relevantP", "ONLY-SPECIFIED-MT-IS-RELEVANT?", 0, 0, false);
        declareMacro("with_genl_mts", "WITH-GENL-MTS");
        declareMacro("with_genl_mts_el", "WITH-GENL-MTS-EL");
        declareMacro("with_mt", "WITH-MT");
        declareMacro("with_all_mts", "WITH-ALL-MTS");
        declareMacro("with_any_mt", "WITH-ANY-MT");
        declareMacro("with_just_mt", "WITH-JUST-MT");
        declareMacro("with_mt_list", "WITH-MT-LIST");
        declareMacro("with_mt_list_and_genl_mts", "WITH-MT-LIST-AND-GENL-MTS");
        declareMacro("with_genl_mts_of_union", "WITH-GENL-MTS-OF-UNION");
        declareMacro("with_any_time_relevance", "WITH-ANY-TIME-RELEVANCE");
        declareMacro("with_spec_mts", "WITH-SPEC-MTS");
        declareMacro("possibly_in_mt", "POSSIBLY-IN-MT");
        declareFunction("possibly_in_mt_determine_function", "POSSIBLY-IN-MT-DETERMINE-FUNCTION", 1, 0, false);
        declareFunction("possibly_in_mt_determine_mt", "POSSIBLY-IN-MT-DETERMINE-MT", 1, 0, false);
        declareMacro("possibly_with_just_mt", "POSSIBLY-WITH-JUST-MT");
        declareFunction("possibly_with_just_mt_determine_function", "POSSIBLY-WITH-JUST-MT-DETERMINE-FUNCTION", 1, 0, false);
        declareFunction("possibly_with_just_mt_determine_mt", "POSSIBLY-WITH-JUST-MT-DETERMINE-MT", 1, 0, false);
        declareMacro("with_inference_mt_relevance", "WITH-INFERENCE-MT-RELEVANCE");
        declareMacro("with_inference_mt_relevance_el", "WITH-INFERENCE-MT-RELEVANCE-EL");
        declareFunction("with_inference_mt_relevance_validate", "WITH-INFERENCE-MT-RELEVANCE-VALIDATE", 1, 0, false);
        declareFunction("determine_inference_mt_relevance_el_spec", "DETERMINE-INFERENCE-MT-RELEVANCE-EL-SPEC", 1, 0, false);
        declareMacro("possibly_with_inference_mt_relevance", "POSSIBLY-WITH-INFERENCE-MT-RELEVANCE");
        declareMacro("possibly_with_inference_mt_relevance_internal", "POSSIBLY-WITH-INFERENCE-MT-RELEVANCE-INTERNAL");
        declareMacro("possibly_with_inference_mt_relevance_el", "POSSIBLY-WITH-INFERENCE-MT-RELEVANCE-EL");
        declareFunction("update_inference_mt_relevance_mt", "UPDATE-INFERENCE-MT-RELEVANCE-MT", 1, 0, false);
        declareFunction("update_inference_mt_relevance_function", "UPDATE-INFERENCE-MT-RELEVANCE-FUNCTION", 1, 0, false);
        declareFunction("update_inference_mt_relevance_mt_list", "UPDATE-INFERENCE-MT-RELEVANCE-MT-LIST", 1, 0, false);
        declareFunction("determine_possibly_with_inference_mt_relevance_mt_and_spec", "DETERMINE-POSSIBLY-WITH-INFERENCE-MT-RELEVANCE-MT-AND-SPEC", 1, 0, false);
        declareFunction("with_inference_any_mt_relevanceP", "WITH-INFERENCE-ANY-MT-RELEVANCE?", 1, 0, false);
        declareFunction("with_inference_mt_relevance_all_mtsP", "WITH-INFERENCE-MT-RELEVANCE-ALL-MTS?", 1, 0, false);
        declareFunction("with_mt_union_relevanceP", "WITH-MT-UNION-RELEVANCE?", 1, 0, false);
        declareFunction("with_inference_anytime_relevanceP", "WITH-INFERENCE-ANYTIME-RELEVANCE?", 1, 0, false);
        declareFunction("inference_relevant_mt", "INFERENCE-RELEVANT-MT", 0, 0, false);
        declareFunction("mt_info", "MT-INFO", 0, 1, false);
        declareFunction("mt_to_mt_info", "MT-TO-MT-INFO", 1, 0, false);
        declareFunction("mt_info_to_mt", "MT-INFO-TO-MT", 1, 0, false);
        declareMacro("with_mt_info", "WITH-MT-INFO");
        declareFunction("in_one_of_these_mtsP", "IN-ONE-OF-THESE-MTS?", 2, 0, false);
        declareFunction("any_or_all_mts_relevant_to_mtP", "ANY-OR-ALL-MTS-RELEVANT-TO-MT?", 1, 0, false);
        declareFunction("conservative_constraint_mt", "CONSERVATIVE-CONSTRAINT-MT", 1, 0, false);
        declareFunction("mt_relevant_to_mtP", "MT-RELEVANT-TO-MT?", 2, 0, false);
        declareFunction("any_relevant_mtP", "ANY-RELEVANT-MT?", 1, 0, false);
        declareMacro("map_mts", "MAP-MTS");
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeSymbol("FUNCTION"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static SubLObject init_mt_relevance_macros_file() {
        defparameter("*RELEVANT-MT-FUNCTION*", NIL);
        defparameter("*MT*", mt_vars.$assertible_theory_mt_root$.getGlobalValue());
        defparameter("*RELEVANT-MTS*", NIL);
        return NIL;
    }

    static private final SubLList $list_alt3 = list(makeSymbol("MT"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLObject setup_mt_relevance_macros_file_alt() {
        mt_vars.note_mt_var($mt$.getDynamicValue(), UNPROVIDED);
        register_macro_helper(IN_MT_LIST, $list_alt6);
        register_cyc_api_macro(WITH_GENL_MTS, $list_alt3, $str_alt25$MT_and_all_its_genl_mts_are_relev);
        register_cyc_api_macro(WITH_MT, $list_alt3, $str_alt25$MT_and_all_its_genl_mts_are_relev);
        register_cyc_api_macro(WITH_ALL_MTS, $list_alt32, $str_alt33$All_mts_are_relevant_within_BODY_);
        register_cyc_api_macro(WITH_ANY_MT, $list_alt32, $str_alt37$Any_mt_can_be_used_for_relevance_);
        register_cyc_api_macro(WITH_JUST_MT, $list_alt3, $str_alt40$Only_MT_is_relevant_within_BODY__);
        register_cyc_api_macro(WITH_MT_LIST, $list_alt7, $str_alt43$Each_mt_in_the_list_MT_LIST_is_re);
        register_macro_helper(POSSIBLY_IN_MT_DETERMINE_FUNCTION, POSSIBLY_IN_MT);
        register_macro_helper(POSSIBLY_IN_MT_DETERMINE_MT, POSSIBLY_IN_MT);
        register_macro_helper(POSSIBLY_WITH_JUST_MT_DETERMINE_FUNCTION, POSSIBLY_WITH_JUST_MT);
        register_macro_helper(POSSIBLY_WITH_JUST_MT_DETERMINE_MT, POSSIBLY_WITH_JUST_MT);
        register_cyc_api_macro(WITH_INFERENCE_MT_RELEVANCE, $list_alt3, $str_alt63$BODY_evaluated_with_the_same_rele);
        register_macro_helper(WITH_INFERENCE_MT_RELEVANCE_VALIDATE, WITH_INFERENCE_MT_RELEVANCE);
        register_macro_helper(DETERMINE_INFERENCE_MT_RELEVANCE_EL_SPEC, WITH_INFERENCE_MT_RELEVANCE_EL);
        register_macro_helper(POSSIBLY_WITH_INFERENCE_MT_RELEVANCE_INTERNAL, $list_alt67);
        register_macro_helper(UPDATE_INFERENCE_MT_RELEVANCE_MT, POSSIBLY_WITH_INFERENCE_MT_RELEVANCE_INTERNAL);
        register_macro_helper(UPDATE_INFERENCE_MT_RELEVANCE_FUNCTION, POSSIBLY_WITH_INFERENCE_MT_RELEVANCE_INTERNAL);
        register_macro_helper(UPDATE_INFERENCE_MT_RELEVANCE_MT_LIST, POSSIBLY_WITH_INFERENCE_MT_RELEVANCE_INTERNAL);
        define_obsolete_register(DETERMINE_POSSIBLY_WITH_INFERENCE_MT_RELEVANCE_MT_AND_SPEC, $list_alt74);
        register_macro_helper($sym75$WITH_INFERENCE_ANY_MT_RELEVANCE_, $list_alt76);
        register_macro_helper($sym78$WITH_INFERENCE_MT_RELEVANCE_ALL_MTS_, $list_alt76);
        register_macro_helper($sym80$WITH_MT_UNION_RELEVANCE_, $list_alt76);
        register_macro_helper($sym82$WITH_INFERENCE_ANYTIME_RELEVANCE_, $list_alt76);
        register_cyc_api_macro(MAP_MTS, $list_alt92, $str_alt96$Iterate_over_all_microtheories__b);
        return NIL;
    }

    public static SubLObject setup_mt_relevance_macros_file() {
        if (SubLFiles.USE_V1) {
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
        }
        if (SubLFiles.USE_V2) {
            register_macro_helper(IN_MT_LIST, $list_alt6);
            register_cyc_api_macro(WITH_GENL_MTS, $list_alt3, $str_alt25$MT_and_all_its_genl_mts_are_relev);
            register_cyc_api_macro(WITH_MT, $list_alt3, $str_alt25$MT_and_all_its_genl_mts_are_relev);
            register_cyc_api_macro(WITH_ALL_MTS, $list_alt32, $str_alt33$All_mts_are_relevant_within_BODY_);
            register_cyc_api_macro(WITH_ANY_MT, $list_alt32, $str_alt37$Any_mt_can_be_used_for_relevance_);
            register_cyc_api_macro(WITH_JUST_MT, $list_alt3, $str_alt40$Only_MT_is_relevant_within_BODY__);
            register_cyc_api_macro(WITH_MT_LIST, $list_alt7, $str_alt43$Each_mt_in_the_list_MT_LIST_is_re);
            register_cyc_api_macro(WITH_INFERENCE_MT_RELEVANCE, $list_alt3, $str_alt63$BODY_evaluated_with_the_same_rele);
            register_macro_helper(POSSIBLY_WITH_INFERENCE_MT_RELEVANCE_INTERNAL, $list_alt67);
            define_obsolete_register(DETERMINE_POSSIBLY_WITH_INFERENCE_MT_RELEVANCE_MT_AND_SPEC, $list_alt74);
            register_macro_helper($sym75$WITH_INFERENCE_ANY_MT_RELEVANCE_, $list_alt76);
            register_macro_helper($sym78$WITH_INFERENCE_MT_RELEVANCE_ALL_MTS_, $list_alt76);
            register_macro_helper($sym80$WITH_MT_UNION_RELEVANCE_, $list_alt76);
            register_macro_helper($sym82$WITH_INFERENCE_ANYTIME_RELEVANCE_, $list_alt76);
            register_cyc_api_macro(MAP_MTS, $list_alt92, $str_alt96$Iterate_over_all_microtheories__b);
        }
        return NIL;
    }

    public static SubLObject setup_mt_relevance_macros_file_Previous() {
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

    static private final SubLSymbol $sym4$_MT_ = makeSymbol("*MT*");

    static private final SubLList $list_alt6 = list(makeSymbol("WITH-MT-LIST"), makeSymbol("WITH-MT-LIST-AND-GENL-MTS"), makeSymbol("POSSIBLY-WITH-INFERENCE-MT-RELEVANCE-INTERNAL"));

    static private final SubLList $list_alt7 = list(makeSymbol("MT-LIST"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt22 = list(QUOTE, makeSymbol("RELEVANT-MT-IS-GENL-MT"));

    static private final SubLString $str_alt25$MT_and_all_its_genl_mts_are_relev = makeString("MT and all its genl mts are relevant within BODY.");

    static private final SubLList $list_alt26 = list(makeSymbol("ELMT"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt29 = list(QUOTE, makeSymbol("RELEVANT-MT-IS-EVERYTHING"));

    static private final SubLList $list_alt32 = list(makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt33$All_mts_are_relevant_within_BODY_ = makeString("All mts are relevant within BODY.");

    static private final SubLList $list_alt34 = list(QUOTE, makeSymbol("RELEVANT-MT-IS-ANY-MT"));

    @Override
    public void declareFunctions() {
        declare_mt_relevance_macros_file();
    }

    static private final SubLString $str_alt37$Any_mt_can_be_used_for_relevance_ = makeString("Any mt can be used for relevance for a particular inference within &BODY.");

    @Override
    public void initializeVariables() {
        init_mt_relevance_macros_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_mt_relevance_macros_file();
    }

    static private final SubLList $list_alt38 = list(QUOTE, makeSymbol("RELEVANT-MT-IS-EQ"));

    static {
    }

    static private final SubLString $str_alt40$Only_MT_is_relevant_within_BODY__ = makeString("Only MT is relevant within BODY (no genl mts).");

    static private final SubLList $list_alt41 = list(QUOTE, makeSymbol("RELEVANT-MT-IS-IN-LIST"));

    static private final SubLString $str_alt43$Each_mt_in_the_list_MT_LIST_is_re = makeString("Each mt in the list MT-LIST is relevant within BODY (no genl mts).");

    static private final SubLList $list_alt44 = list(QUOTE, makeSymbol("RELEVANT-MT-IS-GENL-MT-OF-LIST-MEMBER"));

    static private final SubLList $list_alt45 = list(makeSymbol("MT-UNION"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt48 = list(QUOTE, makeSymbol("RELEVANT-MT-IS-GENL-MT-WITH-ANY-TIME"));

    static private final SubLList $list_alt49 = list(QUOTE, makeSymbol("RELEVANT-MT-IS-SPEC-MT"));

    static private final SubLSymbol $sym51$MT_VAR = makeUninternedSymbol("MT-VAR");

    static private final SubLString $str_alt63$BODY_evaluated_with_the_same_rele = makeString("BODY evaluated with the same relevance used for inferences in MT.\n   This is like @xref with-genl-mts, except it is special-cased to\n   @xref with-all-mts when the mt is #$EverythingPSC,\n   @xref with-any-mt when the mt is #$InferencePSC.\n   Also, with-inference-mt-relevance errors if passed NIL for an mt.");

    static private final SubLString $str_alt65$No_microtheory_was_specified_ = makeString("No microtheory was specified.");

    static private final SubLList $list_alt67 = list(makeSymbol("WITH-INFERENCE-MT-RELEVANCE"), makeSymbol("POSSIBLY-WITH-INFERENCE-MT-RELEVANCE"));

    static private final SubLSymbol $sym68$MT_VAR = makeUninternedSymbol("MT-VAR");

    static private final SubLList $list_alt74 = list(makeSymbol("UPDATE-INFERENCE-MT-RELEVANCE-FUNCTION"), makeSymbol("UPDATE-INFERENCE-MT-RELEVANCE-MT"), makeSymbol("UPDATE-INFERENCE-MT-RELEVANCE-MT-LIST"));

    static private final SubLSymbol $sym75$WITH_INFERENCE_ANY_MT_RELEVANCE_ = makeSymbol("WITH-INFERENCE-ANY-MT-RELEVANCE?");

    static private final SubLList $list_alt76 = list(makeSymbol("POSSIBLY-WITH-INFERENCE-MT-RELEVANCE-INTERNAL"), makeSymbol("POSSIBLY-IN-MT"));

    static private final SubLSymbol $sym78$WITH_INFERENCE_MT_RELEVANCE_ALL_MTS_ = makeSymbol("WITH-INFERENCE-MT-RELEVANCE-ALL-MTS?");

    static private final SubLSymbol $sym80$WITH_MT_UNION_RELEVANCE_ = makeSymbol("WITH-MT-UNION-RELEVANCE?");

    static private final SubLSymbol $sym82$WITH_INFERENCE_ANYTIME_RELEVANCE_ = makeSymbol("WITH-INFERENCE-ANYTIME-RELEVANCE?");

    static private final SubLList $list_alt85 = list(makeSymbol("MT-INFO"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt88 = list(list(QUOTE, makeSymbol("RELEVANT-MT-IS-EVERYTHING")));

    static private final SubLList $list_alt89 = list(list(QUOTE, makeSymbol("RELEVANT-MT-IS-ANY-MT")));

    static private final SubLList $list_alt92 = list(list(makeSymbol("VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt94 = list(reader_make_constant_shell("Microtheory"));

    static private final SubLString $str_alt96$Iterate_over_all_microtheories__b = makeString("Iterate over all microtheories, binding VAR to an mt and executing BODY.");
}

/**
 * Total time: 278 ms synthetic
 */
