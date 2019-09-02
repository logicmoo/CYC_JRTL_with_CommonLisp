/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.collaborative_sense_making_utilities;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      REMOVAL-MODULES-CONCEPTUALLY-NEAR-TERMS
 *  source file: /cyc/top/cycl/inference/modules/removal/removal-modules-conceptually-near-terms.lisp
 *  created:     2019/07/03 17:37:47
 */
public final class removal_modules_conceptually_near_terms extends SubLTranslatedFile implements V02 {
    // // Constructor
    private removal_modules_conceptually_near_terms() {
    }

    public static final SubLFile me = new removal_modules_conceptually_near_terms();

    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_near_terms";

    // // Definitions
    // defparameter
    private static final SubLSymbol $default_conceptually_near_terms_check_cost$ = makeSymbol("*DEFAULT-CONCEPTUALLY-NEAR-TERMS-CHECK-COST*");

    public static final SubLObject removal_conceptually_near_terms_check_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject term1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject term2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                if (!((NIL != forts.fort_p(term1)) && (NIL != forts.fort_p(term2)))) {
                    return NIL;
                }
                thread.resetMultipleValues();
                {
                    SubLObject cosine = collaborative_sense_making_utilities.conceptually_near_termsP(term1, term2, NIL);
                    SubLObject justifications = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (justifications == $IDENTITY) {
                        backward.removal_add_node(arguments.make_hl_support($OPAQUE, el_utilities.make_el_formula($$equals, list(term1, term2), UNPROVIDED), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                    } else
                        if (justifications.isCons()) {
                            {
                                SubLObject support_parts = NIL;
                                SubLObject support = NIL;
                                SubLObject cdolist_list_var = list_utilities.first_n(FIVE_INTEGER, justifications);
                                SubLObject each_just = NIL;
                                for (each_just = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , each_just = cdolist_list_var.first()) {
                                    support_parts = cons(el_utilities.make_conjunction(each_just), support_parts);
                                }
                                support_parts = nreverse(support_parts);
                                support = arguments.make_hl_support($OPAQUE, el_utilities.make_conjunction(support_parts), UNPROVIDED, UNPROVIDED);
                                backward.removal_add_node(support, UNPROVIDED, UNPROVIDED);
                            }
                        }

                }
            }
            return NIL;
        }
    }

    public static final SubLObject declare_removal_modules_conceptually_near_terms_file() {
        declareFunction("removal_conceptually_near_terms_check_pos_expand", "REMOVAL-CONCEPTUALLY-NEAR-TERMS-CHECK-POS-EXPAND", 1, 1, false);
        return NIL;
    }

    public static final SubLObject init_removal_modules_conceptually_near_terms_file() {
        defparameter("*DEFAULT-CONCEPTUALLY-NEAR-TERMS-CHECK-COST*", control_vars.$expensive_hl_module_check_cost$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject setup_removal_modules_conceptually_near_terms_file() {
                inference_modules.register_solely_specific_removal_module_predicate($$conceptuallyNearTerms);
        inference_modules.inference_removal_module($REMOVAL_CONCEPTUALLY_NEAR_TERMS_CHECK_POS, $list_alt5);
        inference_modules.inference_removal_module($REMOVAL_CONCEPTUALLY_NEAR_TERMS_CHECK_NEG, $list_alt7);
        return NIL;
    }

    // // Internal Constants
    public static final SubLObject $$conceptuallyNearTerms = constant_handles.reader_make_constant_shell(makeString("conceptuallyNearTerms"));





    public static final SubLObject $$equals = constant_handles.reader_make_constant_shell(makeString("equals"));

    private static final SubLSymbol $REMOVAL_CONCEPTUALLY_NEAR_TERMS_CHECK_POS = makeKeyword("REMOVAL-CONCEPTUALLY-NEAR-TERMS-CHECK-POS");

    static private final SubLList $list_alt5 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("conceptuallyNearTerms")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("conceptuallyNearTerms")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-CONCEPTUALLY-NEAR-TERMS-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-CONCEPTUALLY-NEAR-TERMS-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$conceptuallyNearTerms <fort> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$conceptuallyNearTerms #$Terrorist-Baasyir #$Terrorist-Isamuddin)") });

    private static final SubLSymbol $REMOVAL_CONCEPTUALLY_NEAR_TERMS_CHECK_NEG = makeKeyword("REMOVAL-CONCEPTUALLY-NEAR-TERMS-CHECK-NEG");

    static private final SubLList $list_alt7 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("conceptuallyNearTerms")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("conceptuallyNearTerms")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-CONCEPTUALLY-NEAR-TERMS-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(constant_handles.reader_make_constant_shell(makeString("conceptuallyNearTerms")), list($BIND, makeSymbol("TERM1")), list($BIND, makeSymbol("TERM2"))), list(list(makeKeyword("VALUE"), makeSymbol("TERM1")), list(makeKeyword("VALUE"), makeSymbol("TERM2")))), makeKeyword("INPUT-VERIFY-PATTERN"), list(list($TEST, makeSymbol("FORT-P")), list($TEST, makeSymbol("FORT-P"))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TERM1"), makeSymbol("TERM2")), list($CALL, makeSymbol("INVERT-BOOLEAN-ANSWER"), list($CALL, makeSymbol("CONCEPTUALLY-NEAR-TERMS?"), list(makeKeyword("VALUE"), makeSymbol("TERM1")), list(makeKeyword("VALUE"), makeSymbol("TERM2"))))), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$conceptuallyNearTerms <fort> <fort>))"), makeKeyword("EXAMPLE"), makeString("(#$not\n     (#$conceptuallyNearTerms #$Terrorist-Baasyir #$Zelal))") });

    // // Initializers
    public void declareFunctions() {
        declare_removal_modules_conceptually_near_terms_file();
    }

    public void initializeVariables() {
        init_removal_modules_conceptually_near_terms_file();
    }

    public void runTopLevelForms() {
        setup_removal_modules_conceptually_near_terms_file();
    }
}

