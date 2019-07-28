package com.cyc.cycjava.cycl.inference.modules.removal;


import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_semantically_related;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.virtual_indexing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_semantically_related.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class removal_modules_semantically_related extends SubLTranslatedFile {
    public static final SubLFile me = new removal_modules_semantically_related();

    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_semantically_related";

    public static final String myFingerPrint = "6fe3a210f5a7a0ab00b0170463d13c0bb0d86fb347662d4d5a84a73bef8fbff3";

    // defparameter
    private static final SubLSymbol $default_mutually_coherent_cost$ = makeSymbol("*DEFAULT-MUTUALLY-COHERENT-COST*");



    private static final SubLObject $$or = reader_make_constant_shell(makeString("or"));

    private static final SubLObject $$geographicalSubRegions = reader_make_constant_shell(makeString("geographicalSubRegions"));

    private static final SubLObject $$geopoliticalSubdivision = reader_make_constant_shell(makeString("geopoliticalSubdivision"));

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));



    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));





    private static final SubLObject $$mutuallyCoherent = reader_make_constant_shell(makeString("mutuallyCoherent"));



    private static final SubLSymbol $REMOVAL_MUTUALLY_COHERENT = makeKeyword("REMOVAL-MUTUALLY-COHERENT");

    private static final SubLList $list12 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("mutuallyCoherent")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("mutuallyCoherent")), makeKeyword("FORT"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MUTUALLY-COHERENT-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MUTUALLY-COHERENT-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$mutuallyCoherent <fort> <fully bound>)"), makeKeyword("EXAMPLE"), makeString("(#$mutuallyCoherent #$BillClinton HilaryClinton)") });

    public static SubLObject mutually_coherentP(SubLObject source, final SubLObject target, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        assert NIL != forts.fort_p(source) : "forts.fort_p(source) " + "CommonSymbols.NIL != forts.fort_p(source) " + source;
        if (NIL != subl_promotions.positive_integer_p(virtual_indexing.num_overlap_index(list(source, target), mt))) {
            return T;
        }
        if (NIL != genls.hierarchical_collectionsP(source, target, mt)) {
            return T;
        }
        if (NIL != isa.isaP(source, target, mt, UNPROVIDED)) {
            return T;
        }
        if (NIL != isa.isaP(target, source, mt, UNPROVIDED)) {
            return T;
        }
        if (NIL != ask_utilities.query_boolean(list($$or, list($$geographicalSubRegions, source, target), list($$geographicalSubRegions, target, source), list($$geopoliticalSubdivision, target, source), list($$geopoliticalSubdivision, source, target)), mt, UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject why_mutually_coherentP(SubLObject source, final SubLObject target, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        assert NIL != forts.fort_p(source) : "forts.fort_p(source) " + "CommonSymbols.NIL != forts.fort_p(source) " + source;
        assert NIL != forts.fort_p(target) : "forts.fort_p(target) " + "CommonSymbols.NIL != forts.fort_p(target) " + target;
        return why_mutually_coherentP_internal(source, target, mt).first();
    }

    public static SubLObject why_mutually_coherentP_internal(SubLObject source, final SubLObject target, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_arguments = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
            if (NIL != subl_promotions.positive_integer_p(virtual_indexing.num_overlap_index(list(source, target), UNPROVIDED))) {
                v_arguments = cons(virtual_indexing.gather_overlap_index(list(source, target), mt).first(), v_arguments);
            } else
                if (NIL != genls.genlP(source, target, UNPROVIDED, UNPROVIDED)) {
                    final SubLObject formula = list($$genls, source, target);
                    v_arguments = cons(arguments.make_hl_support($GENLS, formula, UNPROVIDED, UNPROVIDED), v_arguments);
                } else
                    if (NIL != genls.genlP(target, source, UNPROVIDED, UNPROVIDED)) {
                        final SubLObject formula = list($$genls, target, source);
                        v_arguments = cons(arguments.make_hl_support($GENLS, formula, UNPROVIDED, UNPROVIDED), v_arguments);
                    } else
                        if (NIL != isa.isaP(source, target, mt, UNPROVIDED)) {
                            final SubLObject formula = list($$isa, source, target);
                            v_arguments = cons(arguments.make_hl_support($ISA, formula, UNPROVIDED, UNPROVIDED), v_arguments);
                        } else
                            if (NIL != isa.isaP(target, source, mt, UNPROVIDED)) {
                                final SubLObject formula = list($$isa, target, source);
                                v_arguments = cons(arguments.make_hl_support($ISA, formula, UNPROVIDED, UNPROVIDED), v_arguments);
                            } else {
                                v_arguments = cons(arguments.make_hl_support($OPAQUE, list($$mutuallyCoherent, source, target), mt, UNPROVIDED), v_arguments);
                            }




        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return v_arguments;
    }

    public static SubLObject removal_mutually_coherent_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject source = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject target = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (NIL != mutually_coherentP(source, target, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($OPAQUE, asent, UNPROVIDED, UNPROVIDED), NIL, why_mutually_coherentP_internal(source, target, mt_relevance_macros.$mt$.getDynamicValue(thread)));
        }
        return NIL;
    }

    public static SubLObject declare_removal_modules_semantically_related_file() {
        declareFunction(me, "mutually_coherentP", "MUTUALLY-COHERENT?", 2, 1, false);
        declareFunction(me, "why_mutually_coherentP", "WHY-MUTUALLY-COHERENT?", 2, 1, false);
        declareFunction(me, "why_mutually_coherentP_internal", "WHY-MUTUALLY-COHERENT?-INTERNAL", 3, 0, false);
        declareFunction(me, "removal_mutually_coherent_expand", "REMOVAL-MUTUALLY-COHERENT-EXPAND", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_semantically_related_file() {
        defparameter("*DEFAULT-MUTUALLY-COHERENT-COST*", ONE_INTEGER);
        return NIL;
    }

    public static SubLObject setup_removal_modules_semantically_related_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$mutuallyCoherent);
        preference_modules.doomed_unless_all_args_bindable($POS, $$mutuallyCoherent);
        inference_modules.inference_removal_module($REMOVAL_MUTUALLY_COHERENT, $list12);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_semantically_related_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_semantically_related_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_semantically_related_file();
    }

    static {















    }
}

/**
 * Total time: 104 ms
 */
