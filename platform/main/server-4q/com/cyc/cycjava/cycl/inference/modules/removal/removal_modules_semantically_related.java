/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      REMOVAL-MODULES-SEMANTICALLY-RELATED
 * source file: /cyc/top/cycl/inference/modules/removal/removal-modules-semantically-related.lisp
 * created:     2019/07/03 17:38:26
 */
public final class removal_modules_semantically_related extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new removal_modules_semantically_related();

 public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_semantically_related";


    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_mutually_coherent_cost$ = makeSymbol("*DEFAULT-MUTUALLY-COHERENT-COST*");













    private static final SubLSymbol $REMOVAL_MUTUALLY_COHERENT = makeKeyword("REMOVAL-MUTUALLY-COHERENT");

    private static final SubLList $list12 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("mutuallyCoherent"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("mutuallyCoherent"), $FORT, makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MUTUALLY-COHERENT-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MUTUALLY-COHERENT-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$mutuallyCoherent <fort> <fully bound>)"), makeKeyword("EXAMPLE"), makeString("(#$mutuallyCoherent #$BillClinton HilaryClinton)") });

    // Definitions
    /**
     * Return T iff SOURCE and TARGET are mutually coherent in MT.
     */
    @LispMethod(comment = "Return T iff SOURCE and TARGET are mutually coherent in MT.")
    public static final SubLObject mutually_coherentP_alt(SubLObject source, SubLObject target, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(source, FORT_P);
        if (NIL != subl_promotions.positive_integer_p(virtual_indexing.num_overlap_index(list(source, target), mt))) {
            return T;
        } else {
            if (NIL != genls.hierarchical_collectionsP(source, target, mt)) {
                return T;
            } else {
                if (NIL != isa.isaP(source, target, mt, UNPROVIDED)) {
                    return T;
                } else {
                    if (NIL != isa.isaP(target, source, mt, UNPROVIDED)) {
                        return T;
                    } else {
                        if (NIL != ask_utilities.query_boolean(list($$or, list($$geographicalSubRegions, source, target), list($$geographicalSubRegions, target, source), list($$geopoliticalSubdivision, target, source), list($$geopoliticalSubdivision, source, target)), mt, UNPROVIDED)) {
                            return T;
                        } else {
                            return NIL;
                        }
                    }
                }
            }
        }
    }

    // Definitions
    /**
     * Return T iff SOURCE and TARGET are mutually coherent in MT.
     */
    @LispMethod(comment = "Return T iff SOURCE and TARGET are mutually coherent in MT.")
    public static SubLObject mutually_coherentP(SubLObject source, final SubLObject target, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        assert NIL != forts.fort_p(source) : "! forts.fort_p(source) " + ("forts.fort_p(source) " + "CommonSymbols.NIL != forts.fort_p(source) ") + source;
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

    /**
     * Return one argument for why SOURCE and TARGET are mutually coherent in MT
     */
    @LispMethod(comment = "Return one argument for why SOURCE and TARGET are mutually coherent in MT")
    public static final SubLObject why_mutually_coherentP_alt(SubLObject source, SubLObject target, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(source, FORT_P);
        SubLTrampolineFile.checkType(target, FORT_P);
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_semantically_related.why_mutually_coherentP_internal(source, target, mt).first();
    }

    /**
     * Return one argument for why SOURCE and TARGET are mutually coherent in MT
     */
    @LispMethod(comment = "Return one argument for why SOURCE and TARGET are mutually coherent in MT")
    public static SubLObject why_mutually_coherentP(SubLObject source, final SubLObject target, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        assert NIL != forts.fort_p(source) : "! forts.fort_p(source) " + ("forts.fort_p(source) " + "CommonSymbols.NIL != forts.fort_p(source) ") + source;
        assert NIL != forts.fort_p(target) : "! forts.fort_p(target) " + ("forts.fort_p(target) " + "CommonSymbols.NIL != forts.fort_p(target) ") + target;
        return why_mutually_coherentP_internal(source, target, mt).first();
    }

    /**
     * Return list of arguments for why SOURCE and TARGET are mutually coherent in MT
     */
    @LispMethod(comment = "Return list of arguments for why SOURCE and TARGET are mutually coherent in MT")
    public static final SubLObject why_mutually_coherentP_internal_alt(SubLObject source, SubLObject target, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_arguments = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        if (NIL != subl_promotions.positive_integer_p(virtual_indexing.num_overlap_index(list(source, target), UNPROVIDED))) {
                            v_arguments = cons(virtual_indexing.gather_overlap_index(list(source, target), mt).first(), v_arguments);
                        } else {
                            if (NIL != genls.genlP(source, target, UNPROVIDED, UNPROVIDED)) {
                                {
                                    SubLObject formula = list($$genls, source, target);
                                    v_arguments = cons(arguments.make_hl_support($GENLS, formula, UNPROVIDED, UNPROVIDED), v_arguments);
                                }
                            } else {
                                if (NIL != genls.genlP(target, source, UNPROVIDED, UNPROVIDED)) {
                                    {
                                        SubLObject formula = list($$genls, target, source);
                                        v_arguments = cons(arguments.make_hl_support($GENLS, formula, UNPROVIDED, UNPROVIDED), v_arguments);
                                    }
                                } else {
                                    if (NIL != isa.isaP(source, target, mt, UNPROVIDED)) {
                                        {
                                            SubLObject formula = list($$isa, source, target);
                                            v_arguments = cons(arguments.make_hl_support($ISA, formula, UNPROVIDED, UNPROVIDED), v_arguments);
                                        }
                                    } else {
                                        if (NIL != isa.isaP(target, source, mt, UNPROVIDED)) {
                                            {
                                                SubLObject formula = list($$isa, target, source);
                                                v_arguments = cons(arguments.make_hl_support($ISA, formula, UNPROVIDED, UNPROVIDED), v_arguments);
                                            }
                                        } else {
                                            v_arguments = cons(arguments.make_hl_support($OPAQUE, list($$mutuallyCoherent, source, target), mt, UNPROVIDED), v_arguments);
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
                return v_arguments;
            }
        }
    }

    /**
     * Return list of arguments for why SOURCE and TARGET are mutually coherent in MT
     */
    @LispMethod(comment = "Return list of arguments for why SOURCE and TARGET are mutually coherent in MT")
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

    public static final SubLObject removal_mutually_coherent_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject source = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject target = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                if (NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_semantically_related.mutually_coherentP(source, target, UNPROVIDED)) {
                    backward.removal_add_node(arguments.make_hl_support($OPAQUE, asent, UNPROVIDED, UNPROVIDED), NIL, com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_semantically_related.why_mutually_coherentP_internal(source, target, mt_relevance_macros.$mt$.getDynamicValue(thread)));
                }
            }
            return NIL;
        }
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
        declareFunction("mutually_coherentP", "MUTUALLY-COHERENT?", 2, 1, false);
        declareFunction("why_mutually_coherentP", "WHY-MUTUALLY-COHERENT?", 2, 1, false);
        declareFunction("why_mutually_coherentP_internal", "WHY-MUTUALLY-COHERENT?-INTERNAL", 3, 0, false);
        declareFunction("removal_mutually_coherent_expand", "REMOVAL-MUTUALLY-COHERENT-EXPAND", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_semantically_related_file() {
        defparameter("*DEFAULT-MUTUALLY-COHERENT-COST*", ONE_INTEGER);
        return NIL;
    }

    public static final SubLObject setup_removal_modules_semantically_related_file_alt() {
        inference_modules.register_solely_specific_removal_module_predicate($$mutuallyCoherent);
        inference_modules.inference_removal_module($REMOVAL_CONCEPTUALLY_RELATED, $list_alt11);
        return NIL;
    }

    public static SubLObject setup_removal_modules_semantically_related_file() {
        if (SubLFiles.USE_V1) {
            inference_modules.register_solely_specific_removal_module_predicate($$mutuallyCoherent);
            preference_modules.doomed_unless_all_args_bindable($POS, $$mutuallyCoherent);
            inference_modules.inference_removal_module($REMOVAL_MUTUALLY_COHERENT, $list12);
        }
        if (SubLFiles.USE_V2) {
            inference_modules.inference_removal_module($REMOVAL_CONCEPTUALLY_RELATED, $list_alt11);
        }
        return NIL;
    }

    public static SubLObject setup_removal_modules_semantically_related_file_Previous() {
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

    private static final SubLSymbol $REMOVAL_CONCEPTUALLY_RELATED = makeKeyword("REMOVAL-CONCEPTUALLY-RELATED");

    static private final SubLList $list_alt11 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("mutuallyCoherent"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("mutuallyCoherent"), $FORT, makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MUTUALLY-COHERENT-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MUTUALLY-COHERENT-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$mutuallyCoherent <fort> <fully bound>)"), makeKeyword("EXAMPLE"), makeString("(#$mutuallyCoherent #$BillClinton HilaryClinton)") });
}

/**
 * Total time: 104 ms
 */
