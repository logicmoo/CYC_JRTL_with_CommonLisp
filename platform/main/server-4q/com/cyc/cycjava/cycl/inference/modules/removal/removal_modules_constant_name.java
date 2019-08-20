package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_constant_name extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "5ef31cead88851b9028b46a85a9d21b79c72e71c696c35c5f1d7ccf3faa54649";
    @SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 900L)
    public static SubLSymbol $constant_name_defining_mt$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 1100L)
    private static SubLSymbol $constant_name_check_default_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 3000L)
    private static SubLSymbol $constant_name_unify_default_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 5300L)
    public static SubLSymbol $denotational_term_defining_mt$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 5500L)
    private static SubLSymbol $denotational_term_check_default_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 7700L)
    private static SubLSymbol $denotational_term_unify_default_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 10200L)
    public static SubLSymbol $constant_id_defining_mt$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 10700L)
    private static SubLSymbol $constant_id_check_default_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 12600L)
    private static SubLSymbol $constant_id_unify_default_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 14800L)
    public static SubLSymbol $constant_guid_defining_mt$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 15300L)
    private static SubLSymbol $constant_guid_check_default_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 17300L)
    private static SubLSymbol $constant_guid_unify_default_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 18300L)
    private static SubLSymbol $constant_guid_lookup_default_cost$;
    private static SubLObject $$constantName;
    private static SubLSymbol $POS;
    private static SubLSymbol $NEG;
    private static SubLSymbol $sym3$_CONSTANT_NAME_DEFINING_MT_;
    private static SubLObject $$BaseKB;
    private static SubLSymbol $REMOVAL_CONSTANT_NAME_CHECK_POS;
    private static SubLList $list6;
    private static SubLSymbol $REMOVAL_CONSTANT_NAME_CHECK_NEG;
    private static SubLList $list8;
    private static SubLSymbol $REMOVAL_CONSTANT_NAME_UNIFY;
    private static SubLList $list10;
    private static SubLSymbol $REMOVAL_CONSTANT_NAME_LOOKUP;
    private static SubLList $list12;
    private static SubLObject $$denotationalTermName;
    private static SubLSymbol $sym14$_DENOTATIONAL_TERM_DEFINING_MT_;
    private static SubLSymbol $REMOVAL_DENOTATIONAL_TERM_NAME_CHECK_POS;
    private static SubLList $list16;
    private static SubLSymbol $REMOVAL_DENOTATIONAL_TERM_NAME_CHECK_NEG;
    private static SubLList $list18;
    private static SubLSymbol $REMOVAL_DENOTATIONAL_TERM_NAME_UNIFY;
    private static SubLList $list20;
    private static SubLSymbol $REMOVAL_DENOTATIONAL_TERM_NAME_LOOKUP;
    private static SubLList $list22;
    private static SubLObject $$constantID;
    private static SubLSymbol $sym24$_CONSTANT_ID_DEFINING_MT_;
    private static SubLSymbol $OPAQUE;
    private static SubLSymbol $TRUE_MON;
    private static SubLSymbol $REMOVAL_CONSTANT_ID_CHECK_POS;
    private static SubLList $list28;
    private static SubLSymbol $REMOVAL_CONSTANT_ID_CHECK_NEG;
    private static SubLList $list30;
    private static SubLSymbol $REMOVAL_CONSTANT_ID_UNIFY;
    private static SubLList $list32;
    private static SubLSymbol $REMOVAL_CONSTANT_ID_LOOKUP;
    private static SubLList $list34;
    private static SubLObject $$constantGUID;
    private static SubLSymbol $sym36$_CONSTANT_GUID_DEFINING_MT_;
    private static SubLSymbol $REMOVAL_CONSTANT_GUID_CHECK_POS;
    private static SubLList $list38;
    private static SubLSymbol $REMOVAL_CONSTANT_GUID_CHECK_NEG;
    private static SubLList $list40;
    private static SubLSymbol $REMOVAL_CONSTANT_GUID_UNIFY;
    private static SubLList $list42;
    private static SubLSymbol $REMOVAL_CONSTANT_GUID_LOOKUP;
    private static SubLList $list44;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 1000L)
    public static SubLObject inference_constant_name_check(SubLObject constant, SubLObject name) {
        return Equality.equal(name, constants_high.constant_name(constant));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 1400L)
    public static SubLObject removal_constant_name_check_pos_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return (NIL != removal_constant_name_check(asent)) ? $constant_name_check_default_cost$.getGlobalValue() : ZERO_INTEGER;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 1600L)
    public static SubLObject removal_constant_name_check_neg_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_module_utilities.invert_removal_check_cost(removal_constant_name_check_pos_cost(asent, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 1700L)
    public static SubLObject removal_constant_name_check(SubLObject asent) {
        SubLObject constant = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject name = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        return inference_constant_name_check(constant, name);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 3900L)
    public static SubLObject removal_constant_name_lookup_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject name = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        return (NIL != constants_high.find_constant(name)) ? ONE_INTEGER : ZERO_INTEGER;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 5400L)
    public static SubLObject inference_denotational_term_check(SubLObject v_term, SubLObject name) {
        return Equality.equal(name, cycl_utilities.denotational_term_name(v_term));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 5800L)
    public static SubLObject removal_denotational_term_check_pos_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return (NIL != removal_denotational_term_check(asent)) ? $denotational_term_check_default_cost$.getGlobalValue() : ZERO_INTEGER;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 6000L)
    public static SubLObject removal_denotational_term_check_neg_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_module_utilities.invert_removal_check_cost(removal_denotational_term_check_pos_cost(asent, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 6200L)
    public static SubLObject removal_denotational_term_check(SubLObject asent) {
        SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject name = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        return inference_denotational_term_check(v_term, name);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 8700L)
    public static SubLObject removal_denotational_term_name_lookup_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject name = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        return (NIL != cycl_utilities.find_denotational_term(name)) ? ONE_INTEGER : ZERO_INTEGER;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 10300L)
    public static SubLObject inference_constant_id_check(SubLObject constant, SubLObject id) {
        return Equality.eql(id, constants_high.constant_internal_id(constant));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 10400L)
    public static SubLObject make_constant_id_support(SubLObject constant, SubLObject id, SubLObject negateP) {
        if (negateP == UNPROVIDED) {
            negateP = NIL;
        }
        SubLObject support_formula = list($$constantID, constant, id);
        if (NIL == negateP) {
            return arguments.make_hl_support($OPAQUE, support_formula, $constant_id_defining_mt$.getGlobalValue(), $TRUE_MON);
        }
        return arguments.make_hl_support($OPAQUE, cycl_utilities.negate(support_formula), $constant_id_defining_mt$.getGlobalValue(), $TRUE_MON);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 10900L)
    public static SubLObject removal_constant_id_check_pos_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return (NIL != removal_constant_id_check(asent)) ? $constant_id_check_default_cost$.getGlobalValue() : ZERO_INTEGER;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 11200L)
    public static SubLObject removal_constant_id_check_neg_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_module_utilities.invert_removal_check_cost(removal_constant_id_check_pos_cost(asent, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 11300L)
    public static SubLObject removal_constant_id_check(SubLObject asent) {
        SubLObject constant = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject id = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        return inference_constant_id_check(constant, id);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 13500L)
    public static SubLObject removal_constant_id_lookup_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject id = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        return (NIL != constants_high.find_constant_by_internal_id(id)) ? ONE_INTEGER : ZERO_INTEGER;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 14900L)
    public static SubLObject inference_constant_guid_check(SubLObject constant, SubLObject guid_string) {
        return Equality.equal(guid_string, Guids.guid_to_string(constants_high.constant_external_id(constant)));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 15100L)
    public static SubLObject inference_constant_guid_lookup(SubLObject guid_string) {
        if (NIL != Guids.guid_string_p(guid_string)) {
            SubLObject guid = Guids.string_to_guid(guid_string);
            SubLObject constant = constants_high.find_constant_by_external_id(guid);
            return constant;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 15500L)
    public static SubLObject removal_constant_guid_check_pos_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return (NIL != removal_constant_guid_check(asent)) ? $constant_guid_check_default_cost$.getGlobalValue() : ZERO_INTEGER;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 15800L)
    public static SubLObject removal_constant_guid_check_neg_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_module_utilities.invert_removal_check_cost(removal_constant_guid_check_pos_cost(asent, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 15900L)
    public static SubLObject removal_constant_guid_check(SubLObject asent) {
        SubLObject constant = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject guid_string = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        return inference_constant_guid_check(constant, guid_string);
    }

    public static SubLObject declare_removal_modules_constant_name_file() {
        declareFunction("inference_constant_name_check", "INFERENCE-CONSTANT-NAME-CHECK", 2, 0, false);
        declareFunction("removal_constant_name_check_pos_cost", "REMOVAL-CONSTANT-NAME-CHECK-POS-COST", 1, 1, false);
        declareFunction("removal_constant_name_check_neg_cost", "REMOVAL-CONSTANT-NAME-CHECK-NEG-COST", 1, 1, false);
        declareFunction("removal_constant_name_check", "REMOVAL-CONSTANT-NAME-CHECK", 1, 0, false);
        declareFunction("removal_constant_name_lookup_cost", "REMOVAL-CONSTANT-NAME-LOOKUP-COST", 1, 1, false);
        declareFunction("inference_denotational_term_check", "INFERENCE-DENOTATIONAL-TERM-CHECK", 2, 0, false);
        declareFunction("removal_denotational_term_check_pos_cost", "REMOVAL-DENOTATIONAL-TERM-CHECK-POS-COST", 1, 1, false);
        declareFunction("removal_denotational_term_check_neg_cost", "REMOVAL-DENOTATIONAL-TERM-CHECK-NEG-COST", 1, 1, false);
        declareFunction("removal_denotational_term_check", "REMOVAL-DENOTATIONAL-TERM-CHECK", 1, 0, false);
        declareFunction("removal_denotational_term_name_lookup_cost", "REMOVAL-DENOTATIONAL-TERM-NAME-LOOKUP-COST", 1, 1, false);
        declareFunction("inference_constant_id_check", "INFERENCE-CONSTANT-ID-CHECK", 2, 0, false);
        declareFunction("make_constant_id_support", "MAKE-CONSTANT-ID-SUPPORT", 2, 1, false);
        declareFunction("removal_constant_id_check_pos_cost", "REMOVAL-CONSTANT-ID-CHECK-POS-COST", 1, 1, false);
        declareFunction("removal_constant_id_check_neg_cost", "REMOVAL-CONSTANT-ID-CHECK-NEG-COST", 1, 1, false);
        declareFunction("removal_constant_id_check", "REMOVAL-CONSTANT-ID-CHECK", 1, 0, false);
        declareFunction("removal_constant_id_lookup_cost", "REMOVAL-CONSTANT-ID-LOOKUP-COST", 1, 1, false);
        declareFunction("inference_constant_guid_check", "INFERENCE-CONSTANT-GUID-CHECK", 2, 0, false);
        declareFunction("inference_constant_guid_lookup", "INFERENCE-CONSTANT-GUID-LOOKUP", 1, 0, false);
        declareFunction("removal_constant_guid_check_pos_cost", "REMOVAL-CONSTANT-GUID-CHECK-POS-COST", 1, 1, false);
        declareFunction("removal_constant_guid_check_neg_cost", "REMOVAL-CONSTANT-GUID-CHECK-NEG-COST", 1, 1, false);
        declareFunction("removal_constant_guid_check", "REMOVAL-CONSTANT-GUID-CHECK", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_constant_name_file() {
        $constant_name_defining_mt$ = deflexical("*CONSTANT-NAME-DEFINING-MT*", maybeDefault($sym3$_CONSTANT_NAME_DEFINING_MT_, $constant_name_defining_mt$, $$BaseKB));
        $constant_name_check_default_cost$ = deflexical("*CONSTANT-NAME-CHECK-DEFAULT-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        $constant_name_unify_default_cost$ = deflexical("*CONSTANT-NAME-UNIFY-DEFAULT-COST*", ONE_INTEGER);
        $denotational_term_defining_mt$ = deflexical("*DENOTATIONAL-TERM-DEFINING-MT*", maybeDefault($sym14$_DENOTATIONAL_TERM_DEFINING_MT_, $denotational_term_defining_mt$, $$BaseKB));
        $denotational_term_check_default_cost$ = deflexical("*DENOTATIONAL-TERM-CHECK-DEFAULT-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        $denotational_term_unify_default_cost$ = deflexical("*DENOTATIONAL-TERM-UNIFY-DEFAULT-COST*", ONE_INTEGER);
        $constant_id_defining_mt$ = deflexical("*CONSTANT-ID-DEFINING-MT*", maybeDefault($sym24$_CONSTANT_ID_DEFINING_MT_, $constant_id_defining_mt$, $$BaseKB));
        $constant_id_check_default_cost$ = deflexical("*CONSTANT-ID-CHECK-DEFAULT-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        $constant_id_unify_default_cost$ = deflexical("*CONSTANT-ID-UNIFY-DEFAULT-COST*", ONE_INTEGER);
        $constant_guid_defining_mt$ = deflexical("*CONSTANT-GUID-DEFINING-MT*", maybeDefault($sym36$_CONSTANT_GUID_DEFINING_MT_, $constant_guid_defining_mt$, $$BaseKB));
        $constant_guid_check_default_cost$ = deflexical("*CONSTANT-GUID-CHECK-DEFAULT-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        $constant_guid_unify_default_cost$ = deflexical("*CONSTANT-GUID-UNIFY-DEFAULT-COST*", ONE_INTEGER);
        $constant_guid_lookup_default_cost$ = deflexical("*CONSTANT-GUID-LOOKUP-DEFAULT-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        return NIL;
    }

    public static SubLObject setup_removal_modules_constant_name_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$constantName);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$constantName);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$constantName);
        subl_macro_promotions.declare_defglobal($sym3$_CONSTANT_NAME_DEFINING_MT_);
        mt_vars.note_mt_var($sym3$_CONSTANT_NAME_DEFINING_MT_, $$constantName);
        inference_modules.inference_removal_module($REMOVAL_CONSTANT_NAME_CHECK_POS, $list6);
        inference_modules.inference_removal_module($REMOVAL_CONSTANT_NAME_CHECK_NEG, $list8);
        inference_modules.inference_removal_module($REMOVAL_CONSTANT_NAME_UNIFY, $list10);
        inference_modules.inference_removal_module($REMOVAL_CONSTANT_NAME_LOOKUP, $list12);
        inference_modules.register_solely_specific_removal_module_predicate($$denotationalTermName);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$denotationalTermName);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$denotationalTermName);
        subl_macro_promotions.declare_defglobal($sym14$_DENOTATIONAL_TERM_DEFINING_MT_);
        mt_vars.note_mt_var($sym14$_DENOTATIONAL_TERM_DEFINING_MT_, $$denotationalTermName);
        inference_modules.inference_removal_module($REMOVAL_DENOTATIONAL_TERM_NAME_CHECK_POS, $list16);
        inference_modules.inference_removal_module($REMOVAL_DENOTATIONAL_TERM_NAME_CHECK_NEG, $list18);
        inference_modules.inference_removal_module($REMOVAL_DENOTATIONAL_TERM_NAME_UNIFY, $list20);
        inference_modules.inference_removal_module($REMOVAL_DENOTATIONAL_TERM_NAME_LOOKUP, $list22);
        inference_modules.register_solely_specific_removal_module_predicate($$constantID);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$constantID);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$constantID);
        subl_macro_promotions.declare_defglobal($sym24$_CONSTANT_ID_DEFINING_MT_);
        mt_vars.note_mt_var($sym24$_CONSTANT_ID_DEFINING_MT_, $$constantID);
        inference_modules.inference_removal_module($REMOVAL_CONSTANT_ID_CHECK_POS, $list28);
        inference_modules.inference_removal_module($REMOVAL_CONSTANT_ID_CHECK_NEG, $list30);
        inference_modules.inference_removal_module($REMOVAL_CONSTANT_ID_UNIFY, $list32);
        inference_modules.inference_removal_module($REMOVAL_CONSTANT_ID_LOOKUP, $list34);
        inference_modules.register_solely_specific_removal_module_predicate($$constantGUID);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$constantGUID);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$constantGUID);
        subl_macro_promotions.declare_defglobal($sym36$_CONSTANT_GUID_DEFINING_MT_);
        mt_vars.note_mt_var($sym36$_CONSTANT_GUID_DEFINING_MT_, $$constantGUID);
        inference_modules.inference_removal_module($REMOVAL_CONSTANT_GUID_CHECK_POS, $list38);
        inference_modules.inference_removal_module($REMOVAL_CONSTANT_GUID_CHECK_NEG, $list40);
        inference_modules.inference_removal_module($REMOVAL_CONSTANT_GUID_UNIFY, $list42);
        inference_modules.inference_removal_module($REMOVAL_CONSTANT_GUID_LOOKUP, $list44);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_constant_name_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_constant_name_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_constant_name_file();
    }

    static {
        me = new removal_modules_constant_name();
        $constant_name_defining_mt$ = null;
        $constant_name_check_default_cost$ = null;
        $constant_name_unify_default_cost$ = null;
        $denotational_term_defining_mt$ = null;
        $denotational_term_check_default_cost$ = null;
        $denotational_term_unify_default_cost$ = null;
        $constant_id_defining_mt$ = null;
        $constant_id_check_default_cost$ = null;
        $constant_id_unify_default_cost$ = null;
        $constant_guid_defining_mt$ = null;
        $constant_guid_check_default_cost$ = null;
        $constant_guid_unify_default_cost$ = null;
        $constant_guid_lookup_default_cost$ = null;
        $$constantName = makeConstSym(("constantName"));
        $POS = makeKeyword("POS");
        $NEG = makeKeyword("NEG");
        $sym3$_CONSTANT_NAME_DEFINING_MT_ = makeSymbol("*CONSTANT-NAME-DEFINING-MT*");
        $$BaseKB = makeConstSym(("BaseKB"));
        $REMOVAL_CONSTANT_NAME_CHECK_POS = makeKeyword("REMOVAL-CONSTANT-NAME-CHECK-POS");
        $list6 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("constantName")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("constantName")), makeKeyword("CONSTANT"), makeKeyword("STRING")), makeKeyword("COST"),
                makeSymbol("REMOVAL-CONSTANT-NAME-CHECK-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-CONSTANT-NAME-CHECK"), makeKeyword("INPUT")),
                makeKeyword("SUPPORT-MT"), makeSymbol("*CONSTANT-NAME-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$constantName <constant-p> <stringp>)"), makeKeyword("EXAMPLE"),
                makeString("(#$constantName #$Thing \"Thing\")") });
        $REMOVAL_CONSTANT_NAME_CHECK_NEG = makeKeyword("REMOVAL-CONSTANT-NAME-CHECK-NEG");
        $list8 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("constantName")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("constantName")), makeKeyword("CONSTANT"), makeKeyword("STRING")), makeKeyword("COST"),
                makeSymbol("REMOVAL-CONSTANT-NAME-CHECK-NEG-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-CONSTANT-NAME-CHECK"), makeKeyword("INPUT"))), makeKeyword("SUPPORT-MT"), makeSymbol("*CONSTANT-NAME-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"),
                makeKeyword("DOCUMENTATION"), makeString("(#$not (#$constantName <constant-p> <stringp>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$constantName #$Thing \"Collection\"))") });
        $REMOVAL_CONSTANT_NAME_UNIFY = makeKeyword("REMOVAL-CONSTANT-NAME-UNIFY");
        $list10 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("constantName")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("constantName")), makeKeyword("CONSTANT"), makeKeyword("NOT-FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*CONSTANT-NAME-UNIFY-DEFAULT-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("constantName")), list(makeKeyword("BIND"), makeSymbol("CONSTANT")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("CONSTANT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("CONSTANT-NAME"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("constantName")), list(makeKeyword("VALUE"), makeSymbol("CONSTANT")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("*CONSTANT-NAME-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"),
                makeString("(#$constantName <constant-p> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$constantName #$Thing ?NAME)") });
        $REMOVAL_CONSTANT_NAME_LOOKUP = makeKeyword("REMOVAL-CONSTANT-NAME-LOOKUP");
        $list12 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("constantName")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("constantName")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("COST"),
                makeSymbol("REMOVAL-CONSTANT-NAME-LOOKUP-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("constantName")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("NAME"))), list(makeKeyword("VALUE"), makeSymbol("NAME"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("FIND-CONSTANT"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("constantName")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("NAME"))), makeKeyword("SUPPORT-MT"), makeSymbol("*CONSTANT-NAME-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"),
                makeString("(#$constantName <not fully-bound> <stringp>)"), makeKeyword("EXAMPLE"), makeString("(#$constantName ?CONSTANT \"Thing\")") });
        $$denotationalTermName = makeConstSym(("denotationalTermName"));
        $sym14$_DENOTATIONAL_TERM_DEFINING_MT_ = makeSymbol("*DENOTATIONAL-TERM-DEFINING-MT*");
        $REMOVAL_DENOTATIONAL_TERM_NAME_CHECK_POS = makeKeyword("REMOVAL-DENOTATIONAL-TERM-NAME-CHECK-POS");
        $list16 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("denotationalTermName")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("denotationalTermName")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("CYCL-DENOTATIONAL-TERM-P"))), makeKeyword("STRING")), makeKeyword("COST"), makeSymbol("REMOVAL-DENOTATIONAL-TERM-CHECK-POS-COST"),
                makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-DENOTATIONAL-TERM-CHECK"), makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"),
                makeSymbol("*DENOTATIONAL-TERM-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$denotationalTermName <cycl-denotational-term-p> <stringp>)"), makeKeyword("EXAMPLE"),
                makeString("(#$denotationalTermName #$Thing \"Thing\")") });
        $REMOVAL_DENOTATIONAL_TERM_NAME_CHECK_NEG = makeKeyword("REMOVAL-DENOTATIONAL-TERM-NAME-CHECK-NEG");
        $list18 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("denotationalTermName")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("denotationalTermName")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("CYCL-DENOTATIONAL-TERM-P"))), makeKeyword("STRING")), makeKeyword("COST"), makeSymbol("REMOVAL-DENOTATIONAL-TERM-CHECK-NEG-COST"),
                makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-DENOTATIONAL-TERM-CHECK"), makeKeyword("INPUT"))),
                makeKeyword("SUPPORT-MT"), makeSymbol("*DENOTATIONAL-TERM-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$denotationalTermName <cycl-denotation-term-p> <stringp>))"), makeKeyword("EXAMPLE"),
                makeString("(#$not (#$denotationalTermName #$Thing \"Collection\"))") });
        $REMOVAL_DENOTATIONAL_TERM_NAME_UNIFY = makeKeyword("REMOVAL-DENOTATIONAL-TERM-NAME-UNIFY");
        $list20 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("denotationalTermName")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("denotationalTermName")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("CYCL-DENOTATIONAL-TERM-P"))), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DENOTATIONAL-TERM-UNIFY-DEFAULT-COST*"),
                makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("denotationalTermName")), list(makeKeyword("BIND"), makeSymbol("TERM")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("TERM"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("ANSWER-TO-SINGLETON"), ConsesLow.list(makeKeyword("CALL"), makeSymbol("DENOTATIONAL-TERM-NAME"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("denotationalTermName")), list(makeKeyword("VALUE"), makeSymbol("TERM")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("*DENOTATIONAL-TERM-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"),
                makeString("(#$denotationalTermName <cycl-denotational-term-p> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$denotationalTermName #$Thing ?NAME)") });
        $REMOVAL_DENOTATIONAL_TERM_NAME_LOOKUP = makeKeyword("REMOVAL-DENOTATIONAL-TERM-NAME-LOOKUP");
        $list22 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("denotationalTermName")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("denotationalTermName")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("STRING")),
                makeKeyword("COST"), makeSymbol("REMOVAL-DENOTATIONAL-TERM-NAME-LOOKUP-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("denotationalTermName")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("NAME"))), list(makeKeyword("VALUE"), makeSymbol("NAME"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), ConsesLow.list(makeKeyword("CALL"), makeSymbol("FIND-DENOTATIONAL-TERM"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("denotationalTermName")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("NAME"))), makeKeyword("SUPPORT-MT"), makeSymbol("*DENOTATIONAL-TERM-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"),
                makeString("(#$denotationalTermName <not fully-bound> <stringp>)"), makeKeyword("EXAMPLE"), makeString("(#$denotationalTermName ?TERM \"Thing\")") });
        $$constantID = makeConstSym(("constantID"));
        $sym24$_CONSTANT_ID_DEFINING_MT_ = makeSymbol("*CONSTANT-ID-DEFINING-MT*");
        $OPAQUE = makeKeyword("OPAQUE");
        $TRUE_MON = makeKeyword("TRUE-MON");
        $REMOVAL_CONSTANT_ID_CHECK_POS = makeKeyword("REMOVAL-CONSTANT-ID-CHECK-POS");
        $list28 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("constantID")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("constantID")), makeKeyword("CONSTANT"), makeKeyword("INTEGER")), makeKeyword("COST"),
                makeSymbol("REMOVAL-CONSTANT-ID-CHECK-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-CONSTANT-ID-CHECK"), makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"),
                makeSymbol("*CONSTANT-ID-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$constantID <constant-p> <integerp>)"), makeKeyword("EXAMPLE"), makeString("(#$constantID #$isa 260)") });
        $REMOVAL_CONSTANT_ID_CHECK_NEG = makeKeyword("REMOVAL-CONSTANT-ID-CHECK-NEG");
        $list30 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("constantID")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("constantID")), makeKeyword("CONSTANT"), makeKeyword("INTEGER")), makeKeyword("COST"),
                makeSymbol("REMOVAL-CONSTANT-ID-CHECK-NEG-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-CONSTANT-ID-CHECK"), makeKeyword("INPUT"))), makeKeyword("SUPPORT-MT"), makeSymbol("*CONSTANT-ID-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"),
                makeKeyword("DOCUMENTATION"), makeString("(#$not (#$constantID <constant-p> <integerp>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$constantID #$Thing 260))") });
        $REMOVAL_CONSTANT_ID_UNIFY = makeKeyword("REMOVAL-CONSTANT-ID-UNIFY");
        $list32 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("constantID")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("constantID")), makeKeyword("CONSTANT"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"),
                makeSymbol("*CONSTANT-ID-UNIFY-DEFAULT-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("constantID")), list(makeKeyword("BIND"), makeSymbol("CONSTANT")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("CONSTANT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("CONSTANT-INTERNAL-ID"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("constantID")), list(makeKeyword("VALUE"), makeSymbol("CONSTANT")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("*CONSTANT-ID-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"),
                makeString("(#$constantID <constant-p> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$constantID #$isa ?ID)") });
        $REMOVAL_CONSTANT_ID_LOOKUP = makeKeyword("REMOVAL-CONSTANT-ID-LOOKUP");
        $list34 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("constantID")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("constantID")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("INTEGER")), makeKeyword("COST"),
                makeSymbol("REMOVAL-CONSTANT-ID-LOOKUP-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("constantID")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("ID"))), list(makeKeyword("VALUE"), makeSymbol("ID"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("FIND-CONSTANT-BY-INTERNAL-ID"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("constantID")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("ID"))), makeKeyword("SUPPORT-MT"), makeSymbol("*CONSTANT-ID-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"),
                makeString("(#$constantID <not fully-bound> <integerp>)"), makeKeyword("EXAMPLE"), makeString("(#$constantID ?CONSTANT 260)") });
        $$constantGUID = makeConstSym(("constantGUID"));
        $sym36$_CONSTANT_GUID_DEFINING_MT_ = makeSymbol("*CONSTANT-GUID-DEFINING-MT*");
        $REMOVAL_CONSTANT_GUID_CHECK_POS = makeKeyword("REMOVAL-CONSTANT-GUID-CHECK-POS");
        $list38 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("constantGUID")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("constantGUID")), makeKeyword("CONSTANT"), makeKeyword("STRING")), makeKeyword("COST"),
                makeSymbol("REMOVAL-CONSTANT-GUID-CHECK-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-CONSTANT-GUID-CHECK"), makeKeyword("INPUT")),
                makeKeyword("SUPPORT-MT"), makeSymbol("*CONSTANT-GUID-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$constantGUID <constant-p> <stringp>)"), makeKeyword("EXAMPLE"),
                makeString("(#$constantGUID #$isa \"bd588104-9c29-11b1-9dad-c379636f7270\")") });
        $REMOVAL_CONSTANT_GUID_CHECK_NEG = makeKeyword("REMOVAL-CONSTANT-GUID-CHECK-NEG");
        $list40 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("constantGUID")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("constantGUID")), makeKeyword("CONSTANT"), makeKeyword("STRING")), makeKeyword("COST"),
                makeSymbol("REMOVAL-CONSTANT-GUID-CHECK-NEG-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-CONSTANT-GUID-CHECK"), makeKeyword("INPUT"))), makeKeyword("SUPPORT-MT"), makeSymbol("*CONSTANT-GUID-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"),
                makeKeyword("DOCUMENTATION"), makeString("(#$not (#$constantGUID <constant-p> <stringp>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$constantGUID #$Thing \"bd588104-9c29-11b1-9dad-c379636f7270\"))") });
        $REMOVAL_CONSTANT_GUID_UNIFY = makeKeyword("REMOVAL-CONSTANT-GUID-UNIFY");
        $list42 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("constantGUID")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("constantGUID")), makeKeyword("CONSTANT"), makeKeyword("NOT-FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*CONSTANT-GUID-UNIFY-DEFAULT-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("constantGUID")), list(makeKeyword("BIND"), makeSymbol("CONSTANT")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("CONSTANT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("GUID-TO-STRING"), list(makeKeyword("CALL"), makeSymbol("CONSTANT-EXTERNAL-ID"), makeKeyword("INPUT")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("constantGUID")), list(makeKeyword("VALUE"), makeSymbol("CONSTANT")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("*CONSTANT-GUID-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"),
                makeString("(#$constantGUID <constant-p> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$constantGUID #$isa ?GUID-STRING)") });
        $REMOVAL_CONSTANT_GUID_LOOKUP = makeKeyword("REMOVAL-CONSTANT-GUID-LOOKUP");
        $list44 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("constantGUID")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("constantGUID")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("COST-EXPRESSION"),
                makeSymbol("*CONSTANT-GUID-LOOKUP-DEFAULT-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("constantGUID")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("GUID-STRING"))), list(makeKeyword("VALUE"), makeSymbol("GUID-STRING"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("INFERENCE-CONSTANT-GUID-LOOKUP"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("constantGUID")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("GUID-STRING"))), makeKeyword("SUPPORT-MT"), makeSymbol("*CONSTANT-GUID-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"),
                makeString("(#$constantGUID <not fully-bound> <stringp>)"), makeKeyword("EXAMPLE"), makeString("(#$constantGUID ?CONSTANT \"bd588104-9c29-11b1-9dad-c379636f7270\")") });
    }
}
/*
 *
 * Total time: 140 ms
 *
 */