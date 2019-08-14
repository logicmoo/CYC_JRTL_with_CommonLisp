/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      REMOVAL-MODULES-TERM-EXTERNAL-ID-STRING
 * source file: /cyc/top/cycl/inference/modules/removal/removal-modules-term-external-id-string.lisp
 * created:     2019/07/03 17:37:44
 */
public final class removal_modules_term_external_id_string extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new removal_modules_term_external_id_string();

 public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_term_external_id_string";






    private static final SubLSymbol $REMOVAL_TERM_EXTERNAL_ID_STRING_FULLY_BOUND = makeKeyword("REMOVAL-TERM-EXTERNAL-ID-STRING-FULLY-BOUND");

    private static final SubLList $list6 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("termExternalIDString"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("termExternalIDString"), makeKeyword("FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-EXTERNAL-ID-STRING-FULLY-BOUND"), makeKeyword("DOCUMENTATION"), makeString("(#$termExternalIDString <fully-bound> <string>)\n    by calling hl-external-id-string"), makeKeyword("EXAMPLE"), makeString("(#$termExternalIDString 0 \"3380\")\n    (#$termExternalIDString #$isa\n      \"331E190FA462643538383130342D396332392D313162312D396461642D633337393633366637323730\")") });

    private static final SubLSymbol $REMOVAL_TERM_EXTERNAL_ID_STRING_BOUND_UNBOUND = makeKeyword("REMOVAL-TERM-EXTERNAL-ID-STRING-BOUND-UNBOUND");

    private static final SubLList $list8 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("termExternalIDString"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("termExternalIDString"), makeKeyword("FULLY-BOUND"), makeKeyword("VARIABLE")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-EXTERNAL-ID-STRING-BOUND-UNBOUND"), makeKeyword("DOCUMENTATION"), makeString("(#$termExternalIDString <fully-bound> <variable>\n    by calling hl-external-id-string"), makeKeyword("EXAMPLE"), makeString("(#$termExternalIDString 0 ?WHAT)\n    (#$termExternalIDString #$isa ?WHAT)\n    (#$termExternalIDString (#$YearFn 2004) ?WHAT)") });

    private static final SubLSymbol $REMOVAL_TERM_EXTERNAL_ID_STRING_UNBOUND_BOUND = makeKeyword("REMOVAL-TERM-EXTERNAL-ID-STRING-UNBOUND-BOUND");

    private static final SubLList $list10 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("termExternalIDString"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("termExternalIDString"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-EXTERNAL-ID-STRING-UNBOUND-BOUND"), makeKeyword("DOCUMENTATION"), makeString("(#$termExternalIDString <not-fully-bound> <string>)\n    by calling find-object-by-hl-external-id-string"), makeKeyword("EXAMPLE"), makeString("(#$termExternalIDString ?TERM \"3381\")\n    (#$termExternalIDString (#$YearFn ?YEAR)\n      \"330D821E190FA462643538663239612D396332392D313162312D396461642D63333739363336663732373002D407\")") });

    // Definitions
    public static final SubLObject make_term_external_id_string_support_alt(SubLObject expression, SubLObject id_string) {
        {
            SubLObject module = $OPAQUE;
            SubLObject sentence = make_binary_formula($$termExternalIDString, expression, id_string);
            SubLObject mt = $$UniversalVocabularyMt;
            return arguments.make_hl_support(module, sentence, mt, $TRUE_MON);
        }
    }

    // Definitions
    public static SubLObject make_term_external_id_string_support(final SubLObject expression, final SubLObject id_string) {
        final SubLObject module = $OPAQUE;
        final SubLObject sentence = make_binary_formula($$termExternalIDString, expression, id_string);
        final SubLObject mt = $$UniversalVocabularyMt;
        return arguments.make_hl_support(module, sentence, mt, $TRUE_MON);
    }

    public static final SubLObject removal_term_external_id_string_fully_bound_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_term_external_id_string.removal_term_external_id_string_unbound_bound(asent, UNPROVIDED);
    }

    public static SubLObject removal_term_external_id_string_fully_bound(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_term_external_id_string_unbound_bound(asent, UNPROVIDED);
    }

    public static final SubLObject removal_term_external_id_string_bound_unbound_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject expression = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                SubLObject id_string = kb_utilities.hl_external_id_string(expression);
                thread.resetMultipleValues();
                {
                    SubLObject v_bindings = unification_utilities.term_unify(arg2, id_string, T, T);
                    SubLObject unify_justification = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != v_bindings) {
                        {
                            SubLObject support = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_term_external_id_string.make_term_external_id_string_support(expression, id_string);
                            backward.removal_add_node(support, v_bindings, unify_justification);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_term_external_id_string_bound_unbound(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject expression = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject id_string = kb_utilities.hl_external_id_string(expression);
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification_utilities.term_unify(arg2, id_string, T, T);
        final SubLObject unify_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            final SubLObject support = make_term_external_id_string_support(expression, id_string);
            backward.removal_add_node(support, v_bindings, unify_justification);
        }
        return NIL;
    }

    public static final SubLObject removal_term_external_id_string_unbound_bound_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject id_string = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                thread.resetMultipleValues();
                {
                    SubLObject expression = kb_utilities.find_object_by_hl_external_id_string(id_string);
                    SubLObject validP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != validP) {
                        thread.resetMultipleValues();
                        {
                            SubLObject v_bindings = unification_utilities.term_unify(arg1, expression, T, T);
                            SubLObject unify_justification = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != v_bindings) {
                                {
                                    SubLObject support = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_term_external_id_string.make_term_external_id_string_support(expression, id_string);
                                    backward.removal_add_node(support, v_bindings, unify_justification);
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_term_external_id_string_unbound_bound(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject id_string = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject expression = kb_utilities.find_object_by_hl_external_id_string(id_string);
        final SubLObject validP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != validP) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(arg1, expression, T, T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_bindings) {
                final SubLObject support = make_term_external_id_string_support(expression, id_string);
                backward.removal_add_node(support, v_bindings, unify_justification);
            }
        }
        return NIL;
    }

    static private final SubLList $list_alt5 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("termExternalIDString"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("termExternalIDString"), makeKeyword("FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-EXTERNAL-ID-STRING-FULLY-BOUND"), makeKeyword("DOCUMENTATION"), makeString("(#$termExternalIDString <fully-bound> <string>)\n    by calling hl-external-id-string"), makeKeyword("EXAMPLE"), makeString("(#$termExternalIDString 0 \"3380\")\n    (#$termExternalIDString #$isa\n      \"331E190FA462643538383130342D396332392D313162312D396461642D633337393633366637323730\")") });

    public static SubLObject declare_removal_modules_term_external_id_string_file() {
        declareFunction("make_term_external_id_string_support", "MAKE-TERM-EXTERNAL-ID-STRING-SUPPORT", 2, 0, false);
        declareFunction("removal_term_external_id_string_fully_bound", "REMOVAL-TERM-EXTERNAL-ID-STRING-FULLY-BOUND", 1, 1, false);
        declareFunction("removal_term_external_id_string_bound_unbound", "REMOVAL-TERM-EXTERNAL-ID-STRING-BOUND-UNBOUND", 1, 1, false);
        declareFunction("removal_term_external_id_string_unbound_bound", "REMOVAL-TERM-EXTERNAL-ID-STRING-UNBOUND-BOUND", 1, 1, false);
        return NIL;
    }

    static private final SubLList $list_alt7 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("termExternalIDString"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("termExternalIDString"), makeKeyword("FULLY-BOUND"), makeKeyword("VARIABLE")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-EXTERNAL-ID-STRING-BOUND-UNBOUND"), makeKeyword("DOCUMENTATION"), makeString("(#$termExternalIDString <fully-bound> <variable>\n    by calling hl-external-id-string"), makeKeyword("EXAMPLE"), makeString("(#$termExternalIDString 0 ?WHAT)\n    (#$termExternalIDString #$isa ?WHAT)\n    (#$termExternalIDString (#$YearFn 2004) ?WHAT)") });

    public static SubLObject init_removal_modules_term_external_id_string_file() {
        return NIL;
    }

    public static final SubLObject setup_removal_modules_term_external_id_string_file_alt() {
        inference_modules.register_solely_specific_removal_module_predicate($$termExternalIDString);
        inference_modules.inference_removal_module($REMOVAL_TERM_EXTERNAL_ID_STRING_FULLY_BOUND, $list_alt5);
        inference_modules.inference_removal_module($REMOVAL_TERM_EXTERNAL_ID_STRING_BOUND_UNBOUND, $list_alt7);
        inference_modules.inference_removal_module($REMOVAL_TERM_EXTERNAL_ID_STRING_UNBOUND_BOUND, $list_alt9);
        return NIL;
    }

    public static SubLObject setup_removal_modules_term_external_id_string_file() {
        if (SubLFiles.USE_V1) {
            inference_modules.register_solely_specific_removal_module_predicate($$termExternalIDString);
            preference_modules.doomed_unless_either_arg_bindable($POS, $$termExternalIDString);
            inference_modules.inference_removal_module($REMOVAL_TERM_EXTERNAL_ID_STRING_FULLY_BOUND, $list6);
            inference_modules.inference_removal_module($REMOVAL_TERM_EXTERNAL_ID_STRING_BOUND_UNBOUND, $list8);
            inference_modules.inference_removal_module($REMOVAL_TERM_EXTERNAL_ID_STRING_UNBOUND_BOUND, $list10);
        }
        if (SubLFiles.USE_V2) {
            inference_modules.inference_removal_module($REMOVAL_TERM_EXTERNAL_ID_STRING_FULLY_BOUND, $list_alt5);
            inference_modules.inference_removal_module($REMOVAL_TERM_EXTERNAL_ID_STRING_BOUND_UNBOUND, $list_alt7);
            inference_modules.inference_removal_module($REMOVAL_TERM_EXTERNAL_ID_STRING_UNBOUND_BOUND, $list_alt9);
        }
        return NIL;
    }

    public static SubLObject setup_removal_modules_term_external_id_string_file_Previous() {
        inference_modules.register_solely_specific_removal_module_predicate($$termExternalIDString);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$termExternalIDString);
        inference_modules.inference_removal_module($REMOVAL_TERM_EXTERNAL_ID_STRING_FULLY_BOUND, $list6);
        inference_modules.inference_removal_module($REMOVAL_TERM_EXTERNAL_ID_STRING_BOUND_UNBOUND, $list8);
        inference_modules.inference_removal_module($REMOVAL_TERM_EXTERNAL_ID_STRING_UNBOUND_BOUND, $list10);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_term_external_id_string_file();
    }

    static private final SubLList $list_alt9 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("termExternalIDString"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("termExternalIDString"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-EXTERNAL-ID-STRING-UNBOUND-BOUND"), makeKeyword("DOCUMENTATION"), makeString("(#$termExternalIDString <not-fully-bound> <string>)\n    by calling find-object-by-hl-external-id-string"), makeKeyword("EXAMPLE"), makeString("(#$termExternalIDString ?TERM \"3381\")\n    (#$termExternalIDString (#$YearFn ?YEAR)\n      \"330D821E190FA462643538663239612D396332392D313162312D396461642D63333739363336663732373002D407\")") });

    @Override
    public void initializeVariables() {
        init_removal_modules_term_external_id_string_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_term_external_id_string_file();
    }

    static {
    }
}

/**
 * Total time: 26 ms
 */
