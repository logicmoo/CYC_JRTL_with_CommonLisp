package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_constant_name extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_constant_name";
    public static final String myFingerPrint = "5ef31cead88851b9028b46a85a9d21b79c72e71c696c35c5f1d7ccf3faa54649";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 986L)
    public static SubLSymbol $constant_name_defining_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 1168L)
    private static SubLSymbol $constant_name_check_default_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 3087L)
    private static SubLSymbol $constant_name_unify_default_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 5386L)
    public static SubLSymbol $denotational_term_defining_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 5585L)
    private static SubLSymbol $denotational_term_check_default_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 7750L)
    private static SubLSymbol $denotational_term_unify_default_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 10235L)
    public static SubLSymbol $constant_id_defining_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 10754L)
    private static SubLSymbol $constant_id_check_default_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 12649L)
    private static SubLSymbol $constant_id_unify_default_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 14888L)
    public static SubLSymbol $constant_guid_defining_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 15330L)
    private static SubLSymbol $constant_guid_check_default_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 17366L)
    private static SubLSymbol $constant_guid_unify_default_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 18313L)
    private static SubLSymbol $constant_guid_lookup_default_cost$;
    private static final SubLObject $const0$constantName;
    private static final SubLSymbol $kw1$POS;
    private static final SubLSymbol $kw2$NEG;
    private static final SubLSymbol $sym3$_CONSTANT_NAME_DEFINING_MT_;
    private static final SubLObject $const4$BaseKB;
    private static final SubLSymbol $kw5$REMOVAL_CONSTANT_NAME_CHECK_POS;
    private static final SubLList $list6;
    private static final SubLSymbol $kw7$REMOVAL_CONSTANT_NAME_CHECK_NEG;
    private static final SubLList $list8;
    private static final SubLSymbol $kw9$REMOVAL_CONSTANT_NAME_UNIFY;
    private static final SubLList $list10;
    private static final SubLSymbol $kw11$REMOVAL_CONSTANT_NAME_LOOKUP;
    private static final SubLList $list12;
    private static final SubLObject $const13$denotationalTermName;
    private static final SubLSymbol $sym14$_DENOTATIONAL_TERM_DEFINING_MT_;
    private static final SubLSymbol $kw15$REMOVAL_DENOTATIONAL_TERM_NAME_CHECK_POS;
    private static final SubLList $list16;
    private static final SubLSymbol $kw17$REMOVAL_DENOTATIONAL_TERM_NAME_CHECK_NEG;
    private static final SubLList $list18;
    private static final SubLSymbol $kw19$REMOVAL_DENOTATIONAL_TERM_NAME_UNIFY;
    private static final SubLList $list20;
    private static final SubLSymbol $kw21$REMOVAL_DENOTATIONAL_TERM_NAME_LOOKUP;
    private static final SubLList $list22;
    private static final SubLObject $const23$constantID;
    private static final SubLSymbol $sym24$_CONSTANT_ID_DEFINING_MT_;
    private static final SubLSymbol $kw25$OPAQUE;
    private static final SubLSymbol $kw26$TRUE_MON;
    private static final SubLSymbol $kw27$REMOVAL_CONSTANT_ID_CHECK_POS;
    private static final SubLList $list28;
    private static final SubLSymbol $kw29$REMOVAL_CONSTANT_ID_CHECK_NEG;
    private static final SubLList $list30;
    private static final SubLSymbol $kw31$REMOVAL_CONSTANT_ID_UNIFY;
    private static final SubLList $list32;
    private static final SubLSymbol $kw33$REMOVAL_CONSTANT_ID_LOOKUP;
    private static final SubLList $list34;
    private static final SubLObject $const35$constantGUID;
    private static final SubLSymbol $sym36$_CONSTANT_GUID_DEFINING_MT_;
    private static final SubLSymbol $kw37$REMOVAL_CONSTANT_GUID_CHECK_POS;
    private static final SubLList $list38;
    private static final SubLSymbol $kw39$REMOVAL_CONSTANT_GUID_CHECK_NEG;
    private static final SubLList $list40;
    private static final SubLSymbol $kw41$REMOVAL_CONSTANT_GUID_UNIFY;
    private static final SubLList $list42;
    private static final SubLSymbol $kw43$REMOVAL_CONSTANT_GUID_LOOKUP;
    private static final SubLList $list44;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 1058L)
    public static SubLObject inference_constant_name_check(final SubLObject constant, final SubLObject name) {
        return Equality.equal(name, constants_high.constant_name(constant));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 1407L)
    public static SubLObject removal_constant_name_check_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_constant_name.UNPROVIDED) {
            sense = (SubLObject)removal_modules_constant_name.NIL;
        }
        return (SubLObject)((removal_modules_constant_name.NIL != removal_constant_name_check(asent)) ? removal_modules_constant_name.$constant_name_check_default_cost$.getGlobalValue() : removal_modules_constant_name.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 1600L)
    public static SubLObject removal_constant_name_check_neg_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_constant_name.UNPROVIDED) {
            sense = (SubLObject)removal_modules_constant_name.NIL;
        }
        return removal_module_utilities.invert_removal_check_cost(removal_constant_name_check_pos_cost(asent, (SubLObject)removal_modules_constant_name.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 1778L)
    public static SubLObject removal_constant_name_check(final SubLObject asent) {
        final SubLObject constant = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_constant_name.UNPROVIDED);
        final SubLObject name = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_constant_name.UNPROVIDED);
        return inference_constant_name_check(constant, name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 3987L)
    public static SubLObject removal_constant_name_lookup_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_constant_name.UNPROVIDED) {
            sense = (SubLObject)removal_modules_constant_name.NIL;
        }
        final SubLObject name = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_constant_name.UNPROVIDED);
        return (SubLObject)((removal_modules_constant_name.NIL != constants_high.find_constant(name)) ? removal_modules_constant_name.ONE_INTEGER : removal_modules_constant_name.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 5470L)
    public static SubLObject inference_denotational_term_check(final SubLObject v_term, final SubLObject name) {
        return Equality.equal(name, cycl_utilities.denotational_term_name(v_term));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 5836L)
    public static SubLObject removal_denotational_term_check_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_constant_name.UNPROVIDED) {
            sense = (SubLObject)removal_modules_constant_name.NIL;
        }
        return (SubLObject)((removal_modules_constant_name.NIL != removal_denotational_term_check(asent)) ? removal_modules_constant_name.$denotational_term_check_default_cost$.getGlobalValue() : removal_modules_constant_name.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 6041L)
    public static SubLObject removal_denotational_term_check_neg_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_constant_name.UNPROVIDED) {
            sense = (SubLObject)removal_modules_constant_name.NIL;
        }
        return removal_module_utilities.invert_removal_check_cost(removal_denotational_term_check_pos_cost(asent, (SubLObject)removal_modules_constant_name.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 6227L)
    public static SubLObject removal_denotational_term_check(final SubLObject asent) {
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_constant_name.UNPROVIDED);
        final SubLObject name = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_constant_name.UNPROVIDED);
        return inference_denotational_term_check(v_term, name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 8777L)
    public static SubLObject removal_denotational_term_name_lookup_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_constant_name.UNPROVIDED) {
            sense = (SubLObject)removal_modules_constant_name.NIL;
        }
        final SubLObject name = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_constant_name.UNPROVIDED);
        return (SubLObject)((removal_modules_constant_name.NIL != cycl_utilities.find_denotational_term(name)) ? removal_modules_constant_name.ONE_INTEGER : removal_modules_constant_name.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 10303L)
    public static SubLObject inference_constant_id_check(final SubLObject constant, final SubLObject id) {
        return Equality.eql(id, constants_high.constant_internal_id(constant));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 10412L)
    public static SubLObject make_constant_id_support(final SubLObject constant, final SubLObject id, SubLObject negateP) {
        if (negateP == removal_modules_constant_name.UNPROVIDED) {
            negateP = (SubLObject)removal_modules_constant_name.NIL;
        }
        final SubLObject support_formula = (SubLObject)ConsesLow.list(removal_modules_constant_name.$const23$constantID, constant, id);
        if (removal_modules_constant_name.NIL == negateP) {
            return arguments.make_hl_support((SubLObject)removal_modules_constant_name.$kw25$OPAQUE, support_formula, removal_modules_constant_name.$constant_id_defining_mt$.getGlobalValue(), (SubLObject)removal_modules_constant_name.$kw26$TRUE_MON);
        }
        return arguments.make_hl_support((SubLObject)removal_modules_constant_name.$kw25$OPAQUE, cycl_utilities.negate(support_formula), removal_modules_constant_name.$constant_id_defining_mt$.getGlobalValue(), (SubLObject)removal_modules_constant_name.$kw26$TRUE_MON);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 10983L)
    public static SubLObject removal_constant_id_check_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_constant_name.UNPROVIDED) {
            sense = (SubLObject)removal_modules_constant_name.NIL;
        }
        return (SubLObject)((removal_modules_constant_name.NIL != removal_constant_id_check(asent)) ? removal_modules_constant_name.$constant_id_check_default_cost$.getGlobalValue() : removal_modules_constant_name.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 11222L)
    public static SubLObject removal_constant_id_check_neg_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_constant_name.UNPROVIDED) {
            sense = (SubLObject)removal_modules_constant_name.NIL;
        }
        return removal_module_utilities.invert_removal_check_cost(removal_constant_id_check_pos_cost(asent, (SubLObject)removal_modules_constant_name.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 11396L)
    public static SubLObject removal_constant_id_check(final SubLObject asent) {
        final SubLObject constant = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_constant_name.UNPROVIDED);
        final SubLObject id = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_constant_name.UNPROVIDED);
        return inference_constant_id_check(constant, id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 13532L)
    public static SubLObject removal_constant_id_lookup_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_constant_name.UNPROVIDED) {
            sense = (SubLObject)removal_modules_constant_name.NIL;
        }
        final SubLObject id = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_constant_name.UNPROVIDED);
        return (SubLObject)((removal_modules_constant_name.NIL != constants_high.find_constant_by_internal_id(id)) ? removal_modules_constant_name.ONE_INTEGER : removal_modules_constant_name.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 14960L)
    public static SubLObject inference_constant_guid_check(final SubLObject constant, final SubLObject guid_string) {
        return Equality.equal(guid_string, Guids.guid_to_string(constants_high.constant_external_id(constant)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 15108L)
    public static SubLObject inference_constant_guid_lookup(final SubLObject guid_string) {
        if (removal_modules_constant_name.NIL != Guids.guid_string_p(guid_string)) {
            final SubLObject guid = Guids.string_to_guid(guid_string);
            final SubLObject constant = constants_high.find_constant_by_external_id(guid);
            return constant;
        }
        return (SubLObject)removal_modules_constant_name.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 15569L)
    public static SubLObject removal_constant_guid_check_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_constant_name.UNPROVIDED) {
            sense = (SubLObject)removal_modules_constant_name.NIL;
        }
        return (SubLObject)((removal_modules_constant_name.NIL != removal_constant_guid_check(asent)) ? removal_modules_constant_name.$constant_guid_check_default_cost$.getGlobalValue() : removal_modules_constant_name.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 15814L)
    public static SubLObject removal_constant_guid_check_neg_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_constant_name.UNPROVIDED) {
            sense = (SubLObject)removal_modules_constant_name.NIL;
        }
        return removal_module_utilities.invert_removal_check_cost(removal_constant_guid_check_pos_cost(asent, (SubLObject)removal_modules_constant_name.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 15992L)
    public static SubLObject removal_constant_guid_check(final SubLObject asent) {
        final SubLObject constant = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_constant_name.UNPROVIDED);
        final SubLObject guid_string = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_constant_name.UNPROVIDED);
        return inference_constant_guid_check(constant, guid_string);
    }
    
    public static SubLObject declare_removal_modules_constant_name_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_constant_name", "inference_constant_name_check", "INFERENCE-CONSTANT-NAME-CHECK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_constant_name", "removal_constant_name_check_pos_cost", "REMOVAL-CONSTANT-NAME-CHECK-POS-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_constant_name", "removal_constant_name_check_neg_cost", "REMOVAL-CONSTANT-NAME-CHECK-NEG-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_constant_name", "removal_constant_name_check", "REMOVAL-CONSTANT-NAME-CHECK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_constant_name", "removal_constant_name_lookup_cost", "REMOVAL-CONSTANT-NAME-LOOKUP-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_constant_name", "inference_denotational_term_check", "INFERENCE-DENOTATIONAL-TERM-CHECK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_constant_name", "removal_denotational_term_check_pos_cost", "REMOVAL-DENOTATIONAL-TERM-CHECK-POS-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_constant_name", "removal_denotational_term_check_neg_cost", "REMOVAL-DENOTATIONAL-TERM-CHECK-NEG-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_constant_name", "removal_denotational_term_check", "REMOVAL-DENOTATIONAL-TERM-CHECK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_constant_name", "removal_denotational_term_name_lookup_cost", "REMOVAL-DENOTATIONAL-TERM-NAME-LOOKUP-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_constant_name", "inference_constant_id_check", "INFERENCE-CONSTANT-ID-CHECK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_constant_name", "make_constant_id_support", "MAKE-CONSTANT-ID-SUPPORT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_constant_name", "removal_constant_id_check_pos_cost", "REMOVAL-CONSTANT-ID-CHECK-POS-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_constant_name", "removal_constant_id_check_neg_cost", "REMOVAL-CONSTANT-ID-CHECK-NEG-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_constant_name", "removal_constant_id_check", "REMOVAL-CONSTANT-ID-CHECK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_constant_name", "removal_constant_id_lookup_cost", "REMOVAL-CONSTANT-ID-LOOKUP-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_constant_name", "inference_constant_guid_check", "INFERENCE-CONSTANT-GUID-CHECK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_constant_name", "inference_constant_guid_lookup", "INFERENCE-CONSTANT-GUID-LOOKUP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_constant_name", "removal_constant_guid_check_pos_cost", "REMOVAL-CONSTANT-GUID-CHECK-POS-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_constant_name", "removal_constant_guid_check_neg_cost", "REMOVAL-CONSTANT-GUID-CHECK-NEG-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_constant_name", "removal_constant_guid_check", "REMOVAL-CONSTANT-GUID-CHECK", 1, 0, false);
        return (SubLObject)removal_modules_constant_name.NIL;
    }
    
    public static SubLObject init_removal_modules_constant_name_file() {
        removal_modules_constant_name.$constant_name_defining_mt$ = SubLFiles.deflexical("*CONSTANT-NAME-DEFINING-MT*", maybeDefault((SubLObject)removal_modules_constant_name.$sym3$_CONSTANT_NAME_DEFINING_MT_, removal_modules_constant_name.$constant_name_defining_mt$, removal_modules_constant_name.$const4$BaseKB));
        removal_modules_constant_name.$constant_name_check_default_cost$ = SubLFiles.deflexical("*CONSTANT-NAME-CHECK-DEFAULT-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        removal_modules_constant_name.$constant_name_unify_default_cost$ = SubLFiles.deflexical("*CONSTANT-NAME-UNIFY-DEFAULT-COST*", (SubLObject)removal_modules_constant_name.ONE_INTEGER);
        removal_modules_constant_name.$denotational_term_defining_mt$ = SubLFiles.deflexical("*DENOTATIONAL-TERM-DEFINING-MT*", maybeDefault((SubLObject)removal_modules_constant_name.$sym14$_DENOTATIONAL_TERM_DEFINING_MT_, removal_modules_constant_name.$denotational_term_defining_mt$, removal_modules_constant_name.$const4$BaseKB));
        removal_modules_constant_name.$denotational_term_check_default_cost$ = SubLFiles.deflexical("*DENOTATIONAL-TERM-CHECK-DEFAULT-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        removal_modules_constant_name.$denotational_term_unify_default_cost$ = SubLFiles.deflexical("*DENOTATIONAL-TERM-UNIFY-DEFAULT-COST*", (SubLObject)removal_modules_constant_name.ONE_INTEGER);
        removal_modules_constant_name.$constant_id_defining_mt$ = SubLFiles.deflexical("*CONSTANT-ID-DEFINING-MT*", maybeDefault((SubLObject)removal_modules_constant_name.$sym24$_CONSTANT_ID_DEFINING_MT_, removal_modules_constant_name.$constant_id_defining_mt$, removal_modules_constant_name.$const4$BaseKB));
        removal_modules_constant_name.$constant_id_check_default_cost$ = SubLFiles.deflexical("*CONSTANT-ID-CHECK-DEFAULT-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        removal_modules_constant_name.$constant_id_unify_default_cost$ = SubLFiles.deflexical("*CONSTANT-ID-UNIFY-DEFAULT-COST*", (SubLObject)removal_modules_constant_name.ONE_INTEGER);
        removal_modules_constant_name.$constant_guid_defining_mt$ = SubLFiles.deflexical("*CONSTANT-GUID-DEFINING-MT*", maybeDefault((SubLObject)removal_modules_constant_name.$sym36$_CONSTANT_GUID_DEFINING_MT_, removal_modules_constant_name.$constant_guid_defining_mt$, removal_modules_constant_name.$const4$BaseKB));
        removal_modules_constant_name.$constant_guid_check_default_cost$ = SubLFiles.deflexical("*CONSTANT-GUID-CHECK-DEFAULT-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        removal_modules_constant_name.$constant_guid_unify_default_cost$ = SubLFiles.deflexical("*CONSTANT-GUID-UNIFY-DEFAULT-COST*", (SubLObject)removal_modules_constant_name.ONE_INTEGER);
        removal_modules_constant_name.$constant_guid_lookup_default_cost$ = SubLFiles.deflexical("*CONSTANT-GUID-LOOKUP-DEFAULT-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        return (SubLObject)removal_modules_constant_name.NIL;
    }
    
    public static SubLObject setup_removal_modules_constant_name_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_constant_name.$const0$constantName);
        preference_modules.doomed_unless_either_arg_bindable((SubLObject)removal_modules_constant_name.$kw1$POS, removal_modules_constant_name.$const0$constantName);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_constant_name.$kw2$NEG, removal_modules_constant_name.$const0$constantName);
        subl_macro_promotions.declare_defglobal((SubLObject)removal_modules_constant_name.$sym3$_CONSTANT_NAME_DEFINING_MT_);
        mt_vars.note_mt_var((SubLObject)removal_modules_constant_name.$sym3$_CONSTANT_NAME_DEFINING_MT_, removal_modules_constant_name.$const0$constantName);
        inference_modules.inference_removal_module((SubLObject)removal_modules_constant_name.$kw5$REMOVAL_CONSTANT_NAME_CHECK_POS, (SubLObject)removal_modules_constant_name.$list6);
        inference_modules.inference_removal_module((SubLObject)removal_modules_constant_name.$kw7$REMOVAL_CONSTANT_NAME_CHECK_NEG, (SubLObject)removal_modules_constant_name.$list8);
        inference_modules.inference_removal_module((SubLObject)removal_modules_constant_name.$kw9$REMOVAL_CONSTANT_NAME_UNIFY, (SubLObject)removal_modules_constant_name.$list10);
        inference_modules.inference_removal_module((SubLObject)removal_modules_constant_name.$kw11$REMOVAL_CONSTANT_NAME_LOOKUP, (SubLObject)removal_modules_constant_name.$list12);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_constant_name.$const13$denotationalTermName);
        preference_modules.doomed_unless_either_arg_bindable((SubLObject)removal_modules_constant_name.$kw1$POS, removal_modules_constant_name.$const13$denotationalTermName);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_constant_name.$kw2$NEG, removal_modules_constant_name.$const13$denotationalTermName);
        subl_macro_promotions.declare_defglobal((SubLObject)removal_modules_constant_name.$sym14$_DENOTATIONAL_TERM_DEFINING_MT_);
        mt_vars.note_mt_var((SubLObject)removal_modules_constant_name.$sym14$_DENOTATIONAL_TERM_DEFINING_MT_, removal_modules_constant_name.$const13$denotationalTermName);
        inference_modules.inference_removal_module((SubLObject)removal_modules_constant_name.$kw15$REMOVAL_DENOTATIONAL_TERM_NAME_CHECK_POS, (SubLObject)removal_modules_constant_name.$list16);
        inference_modules.inference_removal_module((SubLObject)removal_modules_constant_name.$kw17$REMOVAL_DENOTATIONAL_TERM_NAME_CHECK_NEG, (SubLObject)removal_modules_constant_name.$list18);
        inference_modules.inference_removal_module((SubLObject)removal_modules_constant_name.$kw19$REMOVAL_DENOTATIONAL_TERM_NAME_UNIFY, (SubLObject)removal_modules_constant_name.$list20);
        inference_modules.inference_removal_module((SubLObject)removal_modules_constant_name.$kw21$REMOVAL_DENOTATIONAL_TERM_NAME_LOOKUP, (SubLObject)removal_modules_constant_name.$list22);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_constant_name.$const23$constantID);
        preference_modules.doomed_unless_either_arg_bindable((SubLObject)removal_modules_constant_name.$kw1$POS, removal_modules_constant_name.$const23$constantID);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_constant_name.$kw2$NEG, removal_modules_constant_name.$const23$constantID);
        subl_macro_promotions.declare_defglobal((SubLObject)removal_modules_constant_name.$sym24$_CONSTANT_ID_DEFINING_MT_);
        mt_vars.note_mt_var((SubLObject)removal_modules_constant_name.$sym24$_CONSTANT_ID_DEFINING_MT_, removal_modules_constant_name.$const23$constantID);
        inference_modules.inference_removal_module((SubLObject)removal_modules_constant_name.$kw27$REMOVAL_CONSTANT_ID_CHECK_POS, (SubLObject)removal_modules_constant_name.$list28);
        inference_modules.inference_removal_module((SubLObject)removal_modules_constant_name.$kw29$REMOVAL_CONSTANT_ID_CHECK_NEG, (SubLObject)removal_modules_constant_name.$list30);
        inference_modules.inference_removal_module((SubLObject)removal_modules_constant_name.$kw31$REMOVAL_CONSTANT_ID_UNIFY, (SubLObject)removal_modules_constant_name.$list32);
        inference_modules.inference_removal_module((SubLObject)removal_modules_constant_name.$kw33$REMOVAL_CONSTANT_ID_LOOKUP, (SubLObject)removal_modules_constant_name.$list34);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_constant_name.$const35$constantGUID);
        preference_modules.doomed_unless_either_arg_bindable((SubLObject)removal_modules_constant_name.$kw1$POS, removal_modules_constant_name.$const35$constantGUID);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_constant_name.$kw2$NEG, removal_modules_constant_name.$const35$constantGUID);
        subl_macro_promotions.declare_defglobal((SubLObject)removal_modules_constant_name.$sym36$_CONSTANT_GUID_DEFINING_MT_);
        mt_vars.note_mt_var((SubLObject)removal_modules_constant_name.$sym36$_CONSTANT_GUID_DEFINING_MT_, removal_modules_constant_name.$const35$constantGUID);
        inference_modules.inference_removal_module((SubLObject)removal_modules_constant_name.$kw37$REMOVAL_CONSTANT_GUID_CHECK_POS, (SubLObject)removal_modules_constant_name.$list38);
        inference_modules.inference_removal_module((SubLObject)removal_modules_constant_name.$kw39$REMOVAL_CONSTANT_GUID_CHECK_NEG, (SubLObject)removal_modules_constant_name.$list40);
        inference_modules.inference_removal_module((SubLObject)removal_modules_constant_name.$kw41$REMOVAL_CONSTANT_GUID_UNIFY, (SubLObject)removal_modules_constant_name.$list42);
        inference_modules.inference_removal_module((SubLObject)removal_modules_constant_name.$kw43$REMOVAL_CONSTANT_GUID_LOOKUP, (SubLObject)removal_modules_constant_name.$list44);
        return (SubLObject)removal_modules_constant_name.NIL;
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
        me = (SubLFile)new removal_modules_constant_name();
        removal_modules_constant_name.$constant_name_defining_mt$ = null;
        removal_modules_constant_name.$constant_name_check_default_cost$ = null;
        removal_modules_constant_name.$constant_name_unify_default_cost$ = null;
        removal_modules_constant_name.$denotational_term_defining_mt$ = null;
        removal_modules_constant_name.$denotational_term_check_default_cost$ = null;
        removal_modules_constant_name.$denotational_term_unify_default_cost$ = null;
        removal_modules_constant_name.$constant_id_defining_mt$ = null;
        removal_modules_constant_name.$constant_id_check_default_cost$ = null;
        removal_modules_constant_name.$constant_id_unify_default_cost$ = null;
        removal_modules_constant_name.$constant_guid_defining_mt$ = null;
        removal_modules_constant_name.$constant_guid_check_default_cost$ = null;
        removal_modules_constant_name.$constant_guid_unify_default_cost$ = null;
        removal_modules_constant_name.$constant_guid_lookup_default_cost$ = null;
        $const0$constantName = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("constantName"));
        $kw1$POS = SubLObjectFactory.makeKeyword("POS");
        $kw2$NEG = SubLObjectFactory.makeKeyword("NEG");
        $sym3$_CONSTANT_NAME_DEFINING_MT_ = SubLObjectFactory.makeSymbol("*CONSTANT-NAME-DEFINING-MT*");
        $const4$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $kw5$REMOVAL_CONSTANT_NAME_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-CONSTANT-NAME-CHECK-POS");
        $list6 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("constantName")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("constantName")), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT"), (SubLObject)SubLObjectFactory.makeKeyword("STRING")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-CONSTANT-NAME-CHECK-POS-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("CHECK"), removal_modules_constant_name.T, SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-CONSTANT-NAME-CHECK"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*CONSTANT-NAME-DEFINING-MT*"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$constantName <constant-p> <stringp>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$constantName #$Thing \"Thing\")") });
        $kw7$REMOVAL_CONSTANT_NAME_CHECK_NEG = SubLObjectFactory.makeKeyword("REMOVAL-CONSTANT-NAME-CHECK-NEG");
        $list8 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("constantName")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("constantName")), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT"), (SubLObject)SubLObjectFactory.makeKeyword("STRING")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-CONSTANT-NAME-CHECK-NEG-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("CHECK"), removal_modules_constant_name.T, SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INVERT-BOOLEAN-ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-CONSTANT-NAME-CHECK"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*CONSTANT-NAME-DEFINING-MT*"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$constantName <constant-p> <stringp>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$constantName #$Thing \"Collection\"))") });
        $kw9$REMOVAL_CONSTANT_NAME_UNIFY = SubLObjectFactory.makeKeyword("REMOVAL-CONSTANT-NAME-UNIFY");
        $list10 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("constantName")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("constantName")), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*CONSTANT-NAME-UNIFY-DEFAULT-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("constantName")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-TO-SINGLETON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-NAME"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("constantName")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*CONSTANT-NAME-DEFINING-MT*"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$constantName <constant-p> <not fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$constantName #$Thing ?NAME)") });
        $kw11$REMOVAL_CONSTANT_NAME_LOOKUP = SubLObjectFactory.makeKeyword("REMOVAL-CONSTANT-NAME-LOOKUP");
        $list12 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("constantName")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("constantName")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("STRING")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-CONSTANT-NAME-LOOKUP-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("constantName")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-CONSTANT"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("constantName")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"))), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*CONSTANT-NAME-DEFINING-MT*"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$constantName <not fully-bound> <stringp>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$constantName ?CONSTANT \"Thing\")") });
        $const13$denotationalTermName = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotationalTermName"));
        $sym14$_DENOTATIONAL_TERM_DEFINING_MT_ = SubLObjectFactory.makeSymbol("*DENOTATIONAL-TERM-DEFINING-MT*");
        $kw15$REMOVAL_DENOTATIONAL_TERM_NAME_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-DENOTATIONAL-TERM-NAME-CHECK-POS");
        $list16 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotationalTermName")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotationalTermName")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-DENOTATIONAL-TERM-P"))), (SubLObject)SubLObjectFactory.makeKeyword("STRING")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-DENOTATIONAL-TERM-CHECK-POS-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("CHECK"), removal_modules_constant_name.T, SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-DENOTATIONAL-TERM-CHECK"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*DENOTATIONAL-TERM-DEFINING-MT*"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$denotationalTermName <cycl-denotational-term-p> <stringp>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$denotationalTermName #$Thing \"Thing\")") });
        $kw17$REMOVAL_DENOTATIONAL_TERM_NAME_CHECK_NEG = SubLObjectFactory.makeKeyword("REMOVAL-DENOTATIONAL-TERM-NAME-CHECK-NEG");
        $list18 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotationalTermName")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotationalTermName")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-DENOTATIONAL-TERM-P"))), (SubLObject)SubLObjectFactory.makeKeyword("STRING")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-DENOTATIONAL-TERM-CHECK-NEG-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("CHECK"), removal_modules_constant_name.T, SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INVERT-BOOLEAN-ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-DENOTATIONAL-TERM-CHECK"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*DENOTATIONAL-TERM-DEFINING-MT*"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$denotationalTermName <cycl-denotation-term-p> <stringp>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$denotationalTermName #$Thing \"Collection\"))") });
        $kw19$REMOVAL_DENOTATIONAL_TERM_NAME_UNIFY = SubLObjectFactory.makeKeyword("REMOVAL-DENOTATIONAL-TERM-NAME-UNIFY");
        $list20 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotationalTermName")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotationalTermName")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-DENOTATIONAL-TERM-P"))), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DENOTATIONAL-TERM-UNIFY-DEFAULT-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotationalTermName")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("TERM")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-TO-SINGLETON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("DENOTATIONAL-TERM-NAME"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotationalTermName")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TERM")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*DENOTATIONAL-TERM-DEFINING-MT*"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$denotationalTermName <cycl-denotational-term-p> <not fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$denotationalTermName #$Thing ?NAME)") });
        $kw21$REMOVAL_DENOTATIONAL_TERM_NAME_LOOKUP = SubLObjectFactory.makeKeyword("REMOVAL-DENOTATIONAL-TERM-NAME-LOOKUP");
        $list22 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotationalTermName")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotationalTermName")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("STRING")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-DENOTATIONAL-TERM-NAME-LOOKUP-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotationalTermName")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-DENOTATIONAL-TERM"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotationalTermName")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"))), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*DENOTATIONAL-TERM-DEFINING-MT*"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$denotationalTermName <not fully-bound> <stringp>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$denotationalTermName ?TERM \"Thing\")") });
        $const23$constantID = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("constantID"));
        $sym24$_CONSTANT_ID_DEFINING_MT_ = SubLObjectFactory.makeSymbol("*CONSTANT-ID-DEFINING-MT*");
        $kw25$OPAQUE = SubLObjectFactory.makeKeyword("OPAQUE");
        $kw26$TRUE_MON = SubLObjectFactory.makeKeyword("TRUE-MON");
        $kw27$REMOVAL_CONSTANT_ID_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-CONSTANT-ID-CHECK-POS");
        $list28 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("constantID")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("constantID")), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-CONSTANT-ID-CHECK-POS-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("CHECK"), removal_modules_constant_name.T, SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-CONSTANT-ID-CHECK"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*CONSTANT-ID-DEFINING-MT*"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$constantID <constant-p> <integerp>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$constantID #$isa 260)") });
        $kw29$REMOVAL_CONSTANT_ID_CHECK_NEG = SubLObjectFactory.makeKeyword("REMOVAL-CONSTANT-ID-CHECK-NEG");
        $list30 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("constantID")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("constantID")), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-CONSTANT-ID-CHECK-NEG-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("CHECK"), removal_modules_constant_name.T, SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INVERT-BOOLEAN-ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-CONSTANT-ID-CHECK"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*CONSTANT-ID-DEFINING-MT*"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$constantID <constant-p> <integerp>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$constantID #$Thing 260))") });
        $kw31$REMOVAL_CONSTANT_ID_UNIFY = SubLObjectFactory.makeKeyword("REMOVAL-CONSTANT-ID-UNIFY");
        $list32 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("constantID")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("constantID")), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*CONSTANT-ID-UNIFY-DEFAULT-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("constantID")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-TO-SINGLETON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-INTERNAL-ID"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("constantID")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*CONSTANT-ID-DEFINING-MT*"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$constantID <constant-p> <not fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$constantID #$isa ?ID)") });
        $kw33$REMOVAL_CONSTANT_ID_LOOKUP = SubLObjectFactory.makeKeyword("REMOVAL-CONSTANT-ID-LOOKUP");
        $list34 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("constantID")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("constantID")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-CONSTANT-ID-LOOKUP-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("constantID")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ID"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ID"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-CONSTANT-BY-INTERNAL-ID"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("constantID")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ID"))), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*CONSTANT-ID-DEFINING-MT*"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$constantID <not fully-bound> <integerp>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$constantID ?CONSTANT 260)") });
        $const35$constantGUID = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("constantGUID"));
        $sym36$_CONSTANT_GUID_DEFINING_MT_ = SubLObjectFactory.makeSymbol("*CONSTANT-GUID-DEFINING-MT*");
        $kw37$REMOVAL_CONSTANT_GUID_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-CONSTANT-GUID-CHECK-POS");
        $list38 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("constantGUID")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("constantGUID")), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT"), (SubLObject)SubLObjectFactory.makeKeyword("STRING")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-CONSTANT-GUID-CHECK-POS-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("CHECK"), removal_modules_constant_name.T, SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-CONSTANT-GUID-CHECK"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*CONSTANT-GUID-DEFINING-MT*"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$constantGUID <constant-p> <stringp>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$constantGUID #$isa \"bd588104-9c29-11b1-9dad-c379636f7270\")") });
        $kw39$REMOVAL_CONSTANT_GUID_CHECK_NEG = SubLObjectFactory.makeKeyword("REMOVAL-CONSTANT-GUID-CHECK-NEG");
        $list40 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("constantGUID")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("constantGUID")), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT"), (SubLObject)SubLObjectFactory.makeKeyword("STRING")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-CONSTANT-GUID-CHECK-NEG-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("CHECK"), removal_modules_constant_name.T, SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INVERT-BOOLEAN-ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-CONSTANT-GUID-CHECK"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*CONSTANT-GUID-DEFINING-MT*"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$constantGUID <constant-p> <stringp>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$constantGUID #$Thing \"bd588104-9c29-11b1-9dad-c379636f7270\"))") });
        $kw41$REMOVAL_CONSTANT_GUID_UNIFY = SubLObjectFactory.makeKeyword("REMOVAL-CONSTANT-GUID-UNIFY");
        $list42 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("constantGUID")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("constantGUID")), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*CONSTANT-GUID-UNIFY-DEFAULT-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("constantGUID")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-TO-SINGLETON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("GUID-TO-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-EXTERNAL-ID"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("constantGUID")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*CONSTANT-GUID-DEFINING-MT*"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$constantGUID <constant-p> <not fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$constantGUID #$isa ?GUID-STRING)") });
        $kw43$REMOVAL_CONSTANT_GUID_LOOKUP = SubLObjectFactory.makeKeyword("REMOVAL-CONSTANT-GUID-LOOKUP");
        $list44 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("constantGUID")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("constantGUID")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("STRING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*CONSTANT-GUID-LOOKUP-DEFAULT-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("constantGUID")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("GUID-STRING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("GUID-STRING"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-CONSTANT-GUID-LOOKUP"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("constantGUID")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("GUID-STRING"))), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*CONSTANT-GUID-DEFINING-MT*"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$constantGUID <not fully-bound> <stringp>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$constantGUID ?CONSTANT \"bd588104-9c29-11b1-9dad-c379636f7270\")") });
    }
}

/*

	Total time: 140 ms
	
*/