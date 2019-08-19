package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.el_utilities;
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
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_term_external_id_string extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_term_external_id_string";
    public static String myFingerPrint = "65f0f4c02ce87fde97e5aebc1975826f6a39623b0fcb823a2fb46015d9df00b7";
    private static SubLObject $$termExternalIDString;
    private static SubLSymbol $POS;
    private static SubLSymbol $OPAQUE;
    private static SubLObject $$UniversalVocabularyMt;
    private static SubLSymbol $TRUE_MON;
    private static SubLSymbol $REMOVAL_TERM_EXTERNAL_ID_STRING_FULLY_BOUND;
    private static SubLList $list6;
    private static SubLSymbol $REMOVAL_TERM_EXTERNAL_ID_STRING_BOUND_UNBOUND;
    private static SubLList $list8;
    private static SubLSymbol $REMOVAL_TERM_EXTERNAL_ID_STRING_UNBOUND_BOUND;
    private static SubLList $list10;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-term-external-id-string.lisp", position = 800L)
    public static SubLObject make_term_external_id_string_support(SubLObject expression, SubLObject id_string) {
        SubLObject module = $OPAQUE;
        SubLObject sentence = el_utilities.make_binary_formula($$termExternalIDString, expression, id_string);
        SubLObject mt = $$UniversalVocabularyMt;
        return arguments.make_hl_support(module, sentence, mt, $TRUE_MON);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-term-external-id-string.lisp", position = 2000L)
    public static SubLObject removal_term_external_id_string_fully_bound(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_term_external_id_string_unbound_bound(asent, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-term-external-id-string.lisp", position = 2900L)
    public static SubLObject removal_term_external_id_string_bound_unbound(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject expression = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject id_string = kb_utilities.hl_external_id_string(expression);
        thread.resetMultipleValues();
        SubLObject v_bindings = unification_utilities.term_unify(arg2, id_string, T, T);
        SubLObject unify_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            SubLObject support = make_term_external_id_string_support(expression, id_string);
            backward.removal_add_node(support, v_bindings, unify_justification);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-term-external-id-string.lisp", position = 4300L)
    public static SubLObject removal_term_external_id_string_unbound_bound(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject id_string = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        thread.resetMultipleValues();
        SubLObject expression = kb_utilities.find_object_by_hl_external_id_string(id_string);
        SubLObject validP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != validP) {
            thread.resetMultipleValues();
            SubLObject v_bindings = unification_utilities.term_unify(arg1, expression, T, T);
            SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_bindings) {
                SubLObject support = make_term_external_id_string_support(expression, id_string);
                backward.removal_add_node(support, v_bindings, unify_justification);
            }
        }
        return NIL;
    }

    public static SubLObject declare_removal_modules_term_external_id_string_file() {
        declareFunction(myName, "make_term_external_id_string_support", "MAKE-TERM-EXTERNAL-ID-STRING-SUPPORT", 2, 0, false);
        declareFunction(myName, "removal_term_external_id_string_fully_bound", "REMOVAL-TERM-EXTERNAL-ID-STRING-FULLY-BOUND", 1, 1, false);
        declareFunction(myName, "removal_term_external_id_string_bound_unbound", "REMOVAL-TERM-EXTERNAL-ID-STRING-BOUND-UNBOUND", 1, 1, false);
        declareFunction(myName, "removal_term_external_id_string_unbound_bound", "REMOVAL-TERM-EXTERNAL-ID-STRING-UNBOUND-BOUND", 1, 1, false);
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
        me = new removal_modules_term_external_id_string();
        $$termExternalIDString = makeConstSym(("termExternalIDString"));
        $POS = makeKeyword("POS");
        $OPAQUE = makeKeyword("OPAQUE");
        $$UniversalVocabularyMt = makeConstSym(("UniversalVocabularyMt"));
        $TRUE_MON = makeKeyword("TRUE-MON");
        $REMOVAL_TERM_EXTERNAL_ID_STRING_FULLY_BOUND = makeKeyword("REMOVAL-TERM-EXTERNAL-ID-STRING-FULLY-BOUND");
        $list6 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("termExternalIDString")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("termExternalIDString")), makeKeyword("FULLY-BOUND"), makeKeyword("STRING")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-EXTERNAL-ID-STRING-FULLY-BOUND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$termExternalIDString <fully-bound> <string>)\n    by calling hl-external-id-string"), makeKeyword("EXAMPLE"),
                makeString("(#$termExternalIDString 0 \"3380\")\n    (#$termExternalIDString #$isa\n      \"331E190FA462643538383130342D396332392D313162312D396461642D633337393633366637323730\")") });
        $REMOVAL_TERM_EXTERNAL_ID_STRING_BOUND_UNBOUND = makeKeyword("REMOVAL-TERM-EXTERNAL-ID-STRING-BOUND-UNBOUND");
        $list8 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("termExternalIDString")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("termExternalIDString")), makeKeyword("FULLY-BOUND"), makeKeyword("VARIABLE")),
                makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-EXTERNAL-ID-STRING-BOUND-UNBOUND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$termExternalIDString <fully-bound> <variable>\n    by calling hl-external-id-string"), makeKeyword("EXAMPLE"), makeString("(#$termExternalIDString 0 ?WHAT)\n    (#$termExternalIDString #$isa ?WHAT)\n    (#$termExternalIDString (#$YearFn 2004) ?WHAT)") });
        $REMOVAL_TERM_EXTERNAL_ID_STRING_UNBOUND_BOUND = makeKeyword("REMOVAL-TERM-EXTERNAL-ID-STRING-UNBOUND-BOUND");
        $list10 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("termExternalIDString")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("termExternalIDString")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("STRING")),
                makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-EXTERNAL-ID-STRING-UNBOUND-BOUND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$termExternalIDString <not-fully-bound> <string>)\n    by calling find-object-by-hl-external-id-string"), makeKeyword("EXAMPLE"),
                makeString("(#$termExternalIDString ?TERM \"3381\")\n    (#$termExternalIDString (#$YearFn ?YEAR)\n      \"330D821E190FA462643538663239612D396332392D313162312D396461642D63333739363336663732373002D407\")") });
    }
}
/*
 *
 * Total time: 26 ms
 *
 */