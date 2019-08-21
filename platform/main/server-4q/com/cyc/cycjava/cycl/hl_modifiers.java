/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      HL-MODIFIERS
 *  source file: /cyc/top/cycl/hl-modifiers.lisp
 *  created:     2019/07/03 17:37:21
 */
public final class hl_modifiers extends SubLTranslatedFile implements V02 {
    // // Constructor
    private hl_modifiers() {
    }

    public static final SubLFile me = new hl_modifiers();


    // // Definitions
    public static final SubLObject possibly_replace_assertion_asserted_argument_with_tv(SubLObject assertion, SubLObject new_tv) {
        {
            SubLObject new_truth = enumeration_types.tv_truth(new_tv);
            SubLObject new_strength = enumeration_types.tv_strength(new_tv);
            if (NIL != arguments.kb_lookup_asserted_argument(assertion, new_truth, new_strength)) {
                return NIL;
            }
            return replace_assertion_asserted_argument(assertion, new_truth, new_strength, NIL);
        }
    }

    public static final SubLObject replace_assertion_asserted_argument_with_tv(SubLObject assertion, SubLObject new_tv) {
        {
            SubLObject new_truth = enumeration_types.tv_truth(new_tv);
            SubLObject new_strength = enumeration_types.tv_strength(new_tv);
            return replace_assertion_asserted_argument(assertion, new_truth, new_strength, T);
        }
    }

    /**
     * Replace the current asserted argument for ASSERTION with a new asserted argument
     * with TRUTH and STRENGTH.
     */
    public static final SubLObject replace_assertion_asserted_argument(SubLObject assertion, SubLObject new_truth, SubLObject new_strength, SubLObject enforce_existence_of_old_asserted_argumentP) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        SubLTrampolineFile.checkType(new_truth, TRUTH_P);
        SubLTrampolineFile.checkType(new_strength, EL_STRENGTH_P);
        {
            SubLObject old_asserted_argument = assertions_high.get_asserted_argument(assertion);
            if (NIL != enforce_existence_of_old_asserted_argumentP) {
                SubLTrampolineFile.checkType(old_asserted_argument, ASSERTED_ARGUMENT_P);
            }
            {
                SubLObject old_who = assertions_high.asserted_by(assertion);
                SubLObject old_when = assertions_high.asserted_when(assertion);
                SubLObject old_why = assertions_high.asserted_why(assertion);
                SubLObject old_second = assertions_high.asserted_second(assertion);
                SubLObject result = NIL;
                if (NIL != old_asserted_argument) {
                    kb_remove_asserted_argument(assertion, old_asserted_argument);
                }
                result = kb_create_asserted_argument(assertion, new_truth, new_strength);
                assertions_high.timestamp_asserted_assertion(assertion, old_who, old_when, old_why, old_second);
                return result;
            }
        }
    }

    public static final SubLObject kb_create_asserted_argument_with_tv(SubLObject assertion, SubLObject tv) {
        {
            SubLObject truth = enumeration_types.tv_truth(tv);
            SubLObject strength = enumeration_types.tv_strength(tv);
            return kb_create_asserted_argument(assertion, truth, strength);
        }
    }

    /**
     * Create an asserted argument for ASSERTION from TRUTH and STRENGTH,
     * and hook up all the indexing between them.
     */
    public static final SubLObject kb_create_asserted_argument(SubLObject assertion, SubLObject truth, SubLObject strength) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(assertion, ASSERTION_P);
            SubLTrampolineFile.checkType(truth, TRUTH_P);
            SubLTrampolineFile.checkType(strength, EL_STRENGTH_P);
            {
                SubLObject result = NIL;
                hl_interface_infrastructure.define_hl_modifier_preamble();
                hl_interface_infrastructure.note_hl_modifier_invocation(KB_CREATE_ASSERTED_ARGUMENT, assertion, truth, strength, UNPROVIDED, UNPROVIDED, UNPROVIDED_SYM, UNPROVIDED_SYM);
                if (NIL != hl_interface_infrastructure.hl_modify_remoteP()) {
                    result = hl_interface_infrastructure.hl_store_remote_eval(list(KB_CREATE_ASSERTED_ARGUMENT, list(QUOTE, assertion), list(QUOTE, truth), list(QUOTE, strength)));
                }
                if (NIL != hl_interface_infrastructure.hl_modify_localP()) {
                    {
                        SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding(thread);
                        try {
                            hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind(T, thread);
                            {
                                SubLObject lock = control_vars.$hl_lock$.getGlobalValue();
                                SubLObject release = NIL;
                                try {
                                    release = seize_lock(lock);
                                    {
                                        SubLObject tv = enumeration_types.tv_from_truth_strength(truth, strength);
                                        SubLObject asserted_argument = arguments.create_asserted_argument(assertion, tv);
                                        assertions_low.add_new_assertion_argument(assertion, asserted_argument);
                                        kb_modification_event.post_kb_modify_create_asserted_argument(assertion, truth, strength);
                                        return asserted_argument;
                                    }
                                } finally {
                                    if (NIL != release) {
                                        release_lock(lock);
                                    }
                                }
                            }
                        } finally {
                            hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    return result;
                }
            }
        }
    }

    /**
     * Remove ASSERTED-ARGUMENT for ASSERTION.
     */
    public static final SubLObject kb_remove_asserted_argument(SubLObject assertion, SubLObject asserted_argument) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(assertion, ASSERTION_P);
            SubLTrampolineFile.checkType(asserted_argument, ASSERTED_ARGUMENT_P);
            {
                SubLObject result = NIL;
                hl_interface_infrastructure.define_hl_modifier_preamble();
                hl_interface_infrastructure.note_hl_modifier_invocation(KB_REMOVE_ASSERTED_ARGUMENT, assertion, asserted_argument, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED_SYM, UNPROVIDED_SYM);
                if (NIL != hl_interface_infrastructure.hl_modify_remoteP()) {
                    result = hl_interface_infrastructure.hl_store_remote_eval(list(KB_REMOVE_ASSERTED_ARGUMENT, list(QUOTE, assertion), list(QUOTE, asserted_argument)));
                }
                if (NIL != hl_interface_infrastructure.hl_modify_localP()) {
                    {
                        SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding(thread);
                        try {
                            hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind(T, thread);
                            {
                                SubLObject lock = control_vars.$hl_lock$.getGlobalValue();
                                SubLObject release = NIL;
                                try {
                                    release = seize_lock(lock);
                                    kb_modification_event.post_kb_modify_remove_asserted_argument(assertion, asserted_argument);
                                    assertions_low.set_assertion_asserted_by(assertion, NIL);
                                    assertions_low.set_assertion_asserted_when(assertion, NIL);
                                    assertions_low.set_assertion_asserted_why(assertion, NIL);
                                    assertions_low.set_assertion_asserted_second(assertion, NIL);
                                    assertions_low.remove_assertion_argument(assertion, asserted_argument);
                                    arguments.kb_remove_asserted_argument_internal(asserted_argument);
                                    return assertion;
                                } finally {
                                    if (NIL != release) {
                                        release_lock(lock);
                                    }
                                }
                            }
                        } finally {
                            hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    return result;
                }
            }
        }
    }

    /**
     * Assert (PRED ARG1 ARG2) in MT to the bookkeeping store.
     */
    public static final SubLObject hl_assert_bookkeeping_binary_gaf(SubLObject pred, SubLObject arg1, SubLObject arg2, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(pred, FORT_P);
            SubLTrampolineFile.checkType(mt, HLMT_P);
            {
                SubLObject result = NIL;
                hl_interface_infrastructure.define_hl_modifier_preamble();
                hl_interface_infrastructure.note_hl_modifier_invocation(HL_ASSERT_BOOKKEEPING_BINARY_GAF, pred, arg1, arg2, mt, UNPROVIDED, UNPROVIDED_SYM, UNPROVIDED_SYM);
                if (NIL != hl_interface_infrastructure.hl_modify_remoteP()) {
                    result = hl_interface_infrastructure.hl_store_remote_eval(list(HL_ASSERT_BOOKKEEPING_BINARY_GAF, list(QUOTE, pred), list(QUOTE, arg1), list(QUOTE, arg2), list(QUOTE, mt)));
                }
                if (NIL != hl_interface_infrastructure.hl_modify_localP()) {
                    {
                        SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding(thread);
                        try {
                            hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind(T, thread);
                            {
                                SubLObject lock = control_vars.$hl_lock$.getGlobalValue();
                                SubLObject release = NIL;
                                try {
                                    release = seize_lock(lock);
                                    return bookkeeping_store.assert_bookkeeping_binary_gaf(pred, arg1, arg2, mt);
                                } finally {
                                    if (NIL != release) {
                                        release_lock(lock);
                                    }
                                }
                            }
                        } finally {
                            hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    return result;
                }
            }
        }
    }

    /**
     * Unassert (PRED ARG1 ARG2) in MT from the bookkeeping store.
     */
    public static final SubLObject hl_unassert_bookkeeping_binary_gaf(SubLObject pred, SubLObject arg1, SubLObject arg2, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(pred, FORT_P);
            SubLTrampolineFile.checkType(mt, HLMT_P);
            {
                SubLObject result = NIL;
                hl_interface_infrastructure.define_hl_modifier_preamble();
                hl_interface_infrastructure.note_hl_modifier_invocation(HL_UNASSERT_BOOKKEEPING_BINARY_GAF, pred, arg1, arg2, mt, UNPROVIDED, UNPROVIDED_SYM, UNPROVIDED_SYM);
                if (NIL != hl_interface_infrastructure.hl_modify_remoteP()) {
                    result = hl_interface_infrastructure.hl_store_remote_eval(list(HL_UNASSERT_BOOKKEEPING_BINARY_GAF, list(QUOTE, pred), list(QUOTE, arg1), list(QUOTE, arg2), list(QUOTE, mt)));
                }
                if (NIL != hl_interface_infrastructure.hl_modify_localP()) {
                    {
                        SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding(thread);
                        try {
                            hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind(T, thread);
                            {
                                SubLObject lock = control_vars.$hl_lock$.getGlobalValue();
                                SubLObject release = NIL;
                                try {
                                    release = seize_lock(lock);
                                    return bookkeeping_store.unassert_bookkeeping_binary_gaf(pred, arg1, arg2, mt);
                                } finally {
                                    if (NIL != release) {
                                        release_lock(lock);
                                    }
                                }
                            }
                        } finally {
                            hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    return result;
                }
            }
        }
    }

    public static final SubLObject declare_hl_modifiers_file() {
        declareFunction("possibly_replace_assertion_asserted_argument_with_tv", "POSSIBLY-REPLACE-ASSERTION-ASSERTED-ARGUMENT-WITH-TV", 2, 0, false);
        declareFunction("replace_assertion_asserted_argument_with_tv", "REPLACE-ASSERTION-ASSERTED-ARGUMENT-WITH-TV", 2, 0, false);
        declareFunction("replace_assertion_asserted_argument", "REPLACE-ASSERTION-ASSERTED-ARGUMENT", 4, 0, false);
        declareFunction("kb_create_asserted_argument_with_tv", "KB-CREATE-ASSERTED-ARGUMENT-WITH-TV", 2, 0, false);
        declareFunction("kb_create_asserted_argument", "KB-CREATE-ASSERTED-ARGUMENT", 3, 0, false);
        declareFunction("kb_remove_asserted_argument", "KB-REMOVE-ASSERTED-ARGUMENT", 2, 0, false);
        declareFunction("hl_assert_bookkeeping_binary_gaf", "HL-ASSERT-BOOKKEEPING-BINARY-GAF", 4, 0, false);
        declareFunction("hl_unassert_bookkeeping_binary_gaf", "HL-UNASSERT-BOOKKEEPING-BINARY-GAF", 4, 0, false);
        return NIL;
    }

    public static final SubLObject init_hl_modifiers_file() {
        return NIL;
    }

    public static final SubLObject setup_hl_modifiers_file() {
                utilities_macros.register_cyc_api_function(KB_CREATE_ASSERTED_ARGUMENT, $list_alt7, $str_alt8$Create_an_asserted_argument_for_A, $list_alt9, $list_alt10);
        utilities_macros.register_cyc_api_function(KB_REMOVE_ASSERTED_ARGUMENT, $list_alt12, $str_alt13$Remove_ASSERTED_ARGUMENT_for_ASSE, $list_alt14, $list_alt15);
        utilities_macros.register_cyc_api_function(HL_ASSERT_BOOKKEEPING_BINARY_GAF, $list_alt19, $str_alt20$Assert__PRED_ARG1_ARG2__in_MT_to_, $list_alt21, $list_alt22);
        utilities_macros.register_cyc_api_function(HL_UNASSERT_BOOKKEEPING_BINARY_GAF, $list_alt19, $str_alt24$Unassert__PRED_ARG1_ARG2__in_MT_f, $list_alt21, $list_alt22);
        return NIL;
    }









    private static final SubLSymbol KB_CREATE_ASSERTED_ARGUMENT = makeSymbol("KB-CREATE-ASSERTED-ARGUMENT");



    static private final SubLSymbol $sym6$_EXIT = makeSymbol("%EXIT");

    static private final SubLList $list_alt7 = list(makeSymbol("ASSERTION"), makeSymbol("TRUTH"), makeSymbol("STRENGTH"));

    static private final SubLString $str_alt8$Create_an_asserted_argument_for_A = makeString("Create an asserted argument for ASSERTION from TRUTH and STRENGTH,\nand hook up all the indexing between them.");

    static private final SubLList $list_alt9 = list(list(makeSymbol("ASSERTION"), makeSymbol("ASSERTION-P")), list(makeSymbol("TRUTH"), makeSymbol("TRUTH-P")), list(makeSymbol("STRENGTH"), makeSymbol("EL-STRENGTH-P")));

    static private final SubLList $list_alt10 = list(makeSymbol("ASSERTED-ARGUMENT-P"));

    private static final SubLSymbol KB_REMOVE_ASSERTED_ARGUMENT = makeSymbol("KB-REMOVE-ASSERTED-ARGUMENT");

    static private final SubLList $list_alt12 = list(makeSymbol("ASSERTION"), makeSymbol("ASSERTED-ARGUMENT"));

    static private final SubLString $str_alt13$Remove_ASSERTED_ARGUMENT_for_ASSE = makeString("Remove ASSERTED-ARGUMENT for ASSERTION.");

    static private final SubLList $list_alt14 = list(list(makeSymbol("ASSERTION"), makeSymbol("ASSERTION-P")), list(makeSymbol("ASSERTED-ARGUMENT"), makeSymbol("ASSERTED-ARGUMENT-P")));

    static private final SubLList $list_alt15 = list(makeSymbol("NULL"));





    private static final SubLSymbol HL_ASSERT_BOOKKEEPING_BINARY_GAF = makeSymbol("HL-ASSERT-BOOKKEEPING-BINARY-GAF");

    static private final SubLList $list_alt19 = list(makeSymbol("PRED"), makeSymbol("ARG1"), makeSymbol("ARG2"), makeSymbol("MT"));

    static private final SubLString $str_alt20$Assert__PRED_ARG1_ARG2__in_MT_to_ = makeString("Assert (PRED ARG1 ARG2) in MT to the bookkeeping store.");

    static private final SubLList $list_alt21 = list(list(makeSymbol("PRED"), makeSymbol("FORT-P")), list(makeSymbol("MT"), makeSymbol("HLMT-P")));

    static private final SubLList $list_alt22 = list(makeSymbol("BOOLEAN"));

    private static final SubLSymbol HL_UNASSERT_BOOKKEEPING_BINARY_GAF = makeSymbol("HL-UNASSERT-BOOKKEEPING-BINARY-GAF");

    static private final SubLString $str_alt24$Unassert__PRED_ARG1_ARG2__in_MT_f = makeString("Unassert (PRED ARG1 ARG2) in MT from the bookkeeping store.");

    // // Initializers
    public void declareFunctions() {
        declare_hl_modifiers_file();
    }

    public void initializeVariables() {
        init_hl_modifiers_file();
    }

    public void runTopLevelForms() {
        setup_hl_modifiers_file();
    }
}

