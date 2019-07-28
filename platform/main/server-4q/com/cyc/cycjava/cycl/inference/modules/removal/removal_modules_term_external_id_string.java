package com.cyc.cycjava.cycl.inference.modules.removal;


import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_term_external_id_string;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_term_external_id_string.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class removal_modules_term_external_id_string extends SubLTranslatedFile {
    public static final SubLFile me = new removal_modules_term_external_id_string();

    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_term_external_id_string";

    public static final String myFingerPrint = "65f0f4c02ce87fde97e5aebc1975826f6a39623b0fcb823a2fb46015d9df00b7";

    private static final SubLObject $$termExternalIDString = reader_make_constant_shell(makeString("termExternalIDString"));





    private static final SubLObject $$UniversalVocabularyMt = reader_make_constant_shell(makeString("UniversalVocabularyMt"));



    private static final SubLSymbol $REMOVAL_TERM_EXTERNAL_ID_STRING_FULLY_BOUND = makeKeyword("REMOVAL-TERM-EXTERNAL-ID-STRING-FULLY-BOUND");

    private static final SubLList $list6 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("termExternalIDString")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("termExternalIDString")), makeKeyword("FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-EXTERNAL-ID-STRING-FULLY-BOUND"), makeKeyword("DOCUMENTATION"), makeString("(#$termExternalIDString <fully-bound> <string>)\n    by calling hl-external-id-string"), makeKeyword("EXAMPLE"), makeString("(#$termExternalIDString 0 \"3380\")\n    (#$termExternalIDString #$isa\n      \"331E190FA462643538383130342D396332392D313162312D396461642D633337393633366637323730\")") });

    private static final SubLSymbol $REMOVAL_TERM_EXTERNAL_ID_STRING_BOUND_UNBOUND = makeKeyword("REMOVAL-TERM-EXTERNAL-ID-STRING-BOUND-UNBOUND");

    private static final SubLList $list8 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("termExternalIDString")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("termExternalIDString")), makeKeyword("FULLY-BOUND"), makeKeyword("VARIABLE")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-EXTERNAL-ID-STRING-BOUND-UNBOUND"), makeKeyword("DOCUMENTATION"), makeString("(#$termExternalIDString <fully-bound> <variable>\n    by calling hl-external-id-string"), makeKeyword("EXAMPLE"), makeString("(#$termExternalIDString 0 ?WHAT)\n    (#$termExternalIDString #$isa ?WHAT)\n    (#$termExternalIDString (#$YearFn 2004) ?WHAT)") });

    private static final SubLSymbol $REMOVAL_TERM_EXTERNAL_ID_STRING_UNBOUND_BOUND = makeKeyword("REMOVAL-TERM-EXTERNAL-ID-STRING-UNBOUND-BOUND");

    private static final SubLList $list10 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("termExternalIDString")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("termExternalIDString")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-EXTERNAL-ID-STRING-UNBOUND-BOUND"), makeKeyword("DOCUMENTATION"), makeString("(#$termExternalIDString <not-fully-bound> <string>)\n    by calling find-object-by-hl-external-id-string"), makeKeyword("EXAMPLE"), makeString("(#$termExternalIDString ?TERM \"3381\")\n    (#$termExternalIDString (#$YearFn ?YEAR)\n      \"330D821E190FA462643538663239612D396332392D313162312D396461642D63333739363336663732373002D407\")") });

    public static SubLObject make_term_external_id_string_support(final SubLObject expression, final SubLObject id_string) {
        final SubLObject module = $OPAQUE;
        final SubLObject sentence = make_binary_formula($$termExternalIDString, expression, id_string);
        final SubLObject mt = $$UniversalVocabularyMt;
        return arguments.make_hl_support(module, sentence, mt, $TRUE_MON);
    }

    public static SubLObject removal_term_external_id_string_fully_bound(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_term_external_id_string_unbound_bound(asent, UNPROVIDED);
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

    public static SubLObject declare_removal_modules_term_external_id_string_file() {
        declareFunction(me, "make_term_external_id_string_support", "MAKE-TERM-EXTERNAL-ID-STRING-SUPPORT", 2, 0, false);
        declareFunction(me, "removal_term_external_id_string_fully_bound", "REMOVAL-TERM-EXTERNAL-ID-STRING-FULLY-BOUND", 1, 1, false);
        declareFunction(me, "removal_term_external_id_string_bound_unbound", "REMOVAL-TERM-EXTERNAL-ID-STRING-BOUND-UNBOUND", 1, 1, false);
        declareFunction(me, "removal_term_external_id_string_unbound_bound", "REMOVAL-TERM-EXTERNAL-ID-STRING-UNBOUND-BOUND", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_term_external_id_string_file() {
        return NIL;
    }

    public static SubLObject setup_removal_modules_term_external_id_string_file() {
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
