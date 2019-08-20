package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.cfasl;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.eval_in_api;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class inference_modules extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "f5f9fcc424bd7fc666d1bc2ddf032d2b8831d8370456272003b844b3b510e8bf";
    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 800L)
    private static SubLSymbol $meta_removal_modules$;
    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 1100L)
    private static SubLSymbol $hl_module_properties$;
    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 3700L)
    private static SubLSymbol $valid_hl_module_subtypes$;
    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 3800L)
    private static SubLSymbol $default_hl_module_subtype$;
    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 4000L)
    private static SubLSymbol $hl_module_property_defaults$;
    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12300L)
    public static SubLSymbol $dtp_hl_module$;
    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 14200L)
    private static SubLSymbol $cfasl_create_invalid_hl_module_caching_state$;
    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 17000L)
    private static SubLSymbol $hl_module_store$;
    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 36100L)
    private static SubLSymbol $removal_modules$;
    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 36800L)
    private static SubLSymbol $removal_modules_external$;
    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 37200L)
    private static SubLSymbol $removal_modules_generic$;
    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 38000L)
    private static SubLSymbol $removal_modules_universal$;
    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 39700L)
    private static SubLSymbol $removal_modules_specific$;
    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 42000L)
    private static SubLSymbol $removal_modules_specific_use_generic$;
    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 42200L)
    private static SubLSymbol $removal_modules_specific_use_meta_removal$;
    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 42400L)
    private static SubLSymbol $removal_modules_specific_dont_use_universal$;
    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 42600L)
    private static SubLSymbol $solely_specific_removal_module_predicate_store$;
    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 50800L)
    private static SubLSymbol $classify_removal_modules_with_deterministic_sortP$;
    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 53700L)
    private static SubLSymbol $removal_pruning_module_properties$;
    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 54500L)
    private static SubLSymbol $conjunctive_removal_modules$;
    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 60100L)
    private static SubLSymbol $transformation_modules$;
    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 61200L)
    private static SubLSymbol $meta_transformation_modules$;
    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 62400L)
    private static SubLSymbol $rewrite_modules$;
    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 65000L)
    private static SubLSymbol $structural_modules$;
    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 65700L)
    private static SubLSymbol $meta_structural_modules$;
    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 66700L)
    private static SubLSymbol $cfasl_wide_opcode_hl_module$;
    private static SubLSymbol $sym0$_META_REMOVAL_MODULES_;
    private static SubLList $list1;
    private static SubLList $list2;
    private static SubLSymbol $sym3$MODULE_VAR;
    private static SubLSymbol $sym4$CLET;
    private static SubLSymbol $sym5$DO_LIST;
    private static SubLList $list6;
    private static SubLSymbol $sym7$PWHEN;
    private static SubLSymbol $sym8$HL_MODULE_PROPERTY_NOT_DEFAULT_;
    private static SubLSymbol $sym9$HL_MODULE_PROPERTY_WITHOUT_VALUES;
    private static SubLList $list10;
    private static SubLSymbol $KB;
    private static SubLList $list12;
    private static SubLSymbol $MODULE_SUBTYPE;
    private static SubLList $list14;
    private static SubLSymbol $ALL;
    private static SubLSymbol $OR;
    private static SubLSymbol $sym17$ALLOWED_MODULES_SPEC_P;
    private static SubLSymbol $AND;
    private static SubLSymbol $NOT;
    private static SubLSymbol $MODULE_TYPE;
    private static SubLSymbol $sym21$HL_MODULE_P;
    private static SubLSymbol $sym22$HL_MODULE;
    private static SubLList $list23;
    private static SubLList $list24;
    private static SubLList $list25;
    private static SubLList $list26;
    private static SubLSymbol $sym27$PRINT_HL_MODULE;
    private static SubLSymbol $sym28$HL_MODULE_PRINT_FUNCTION_TRAMPOLINE;
    private static SubLList $list29;
    private static SubLSymbol $sym30$HL_MOD_NAME;
    private static SubLSymbol $sym31$_CSETF_HL_MOD_NAME;
    private static SubLSymbol $sym32$HL_MOD_PLIST;
    private static SubLSymbol $sym33$_CSETF_HL_MOD_PLIST;
    private static SubLSymbol $sym34$HL_MOD_SENSE;
    private static SubLSymbol $sym35$_CSETF_HL_MOD_SENSE;
    private static SubLSymbol $sym36$HL_MOD_PREDICATE;
    private static SubLSymbol $sym37$_CSETF_HL_MOD_PREDICATE;
    private static SubLSymbol $sym38$HL_MOD_ANY_PREDICATES;
    private static SubLSymbol $sym39$_CSETF_HL_MOD_ANY_PREDICATES;
    private static SubLSymbol $sym40$HL_MOD_ARITY;
    private static SubLSymbol $sym41$_CSETF_HL_MOD_ARITY;
    private static SubLSymbol $sym42$HL_MOD_DIRECTION;
    private static SubLSymbol $sym43$_CSETF_HL_MOD_DIRECTION;
    private static SubLSymbol $sym44$HL_MOD_REQUIRED_PATTERN;
    private static SubLSymbol $sym45$_CSETF_HL_MOD_REQUIRED_PATTERN;
    private static SubLSymbol $sym46$HL_MOD_REQUIRED_MT;
    private static SubLSymbol $sym47$_CSETF_HL_MOD_REQUIRED_MT;
    private static SubLSymbol $sym48$HL_MOD_EXCLUSIVE_FUNC;
    private static SubLSymbol $sym49$_CSETF_HL_MOD_EXCLUSIVE_FUNC;
    private static SubLSymbol $sym50$HL_MOD_REQUIRED_FUNC;
    private static SubLSymbol $sym51$_CSETF_HL_MOD_REQUIRED_FUNC;
    private static SubLSymbol $sym52$HL_MOD_COMPLETENESS;
    private static SubLSymbol $sym53$_CSETF_HL_MOD_COMPLETENESS;
    private static SubLSymbol $NAME;
    private static SubLSymbol $PLIST;
    private static SubLSymbol $SENSE;
    private static SubLSymbol $PREDICATE;
    private static SubLSymbol $ANY_PREDICATES;
    private static SubLSymbol $ARITY;
    private static SubLSymbol $DIRECTION;
    private static SubLSymbol $REQUIRED_PATTERN;
    private static SubLSymbol $REQUIRED_MT;
    private static SubLSymbol $EXCLUSIVE_FUNC;
    private static SubLSymbol $REQUIRED_FUNC;
    private static SubLSymbol $COMPLETENESS;
    private static SubLString $str66$Invalid_slot__S_for_construction_;
    private static SubLSymbol $BEGIN;
    private static SubLSymbol $sym68$MAKE_HL_MODULE;
    private static SubLSymbol $SLOT;
    private static SubLSymbol $END;
    private static SubLSymbol $sym71$VISIT_DEFSTRUCT_OBJECT_HL_MODULE_METHOD;
    private static SubLString $str72$_HL_Module___a_;
    private static SubLSymbol $sym73$SXHASH_HL_MODULE_METHOD;
    private static SubLSymbol $sym74$PROPERTY_LIST_P;
    private static SubLSymbol $sym75$HL_MODULE_PROPERTY_P;
    private static SubLSymbol $EXCLUSIVE;
    private static SubLSymbol $SUPPLANTS;
    private static SubLString $str78$_supplants_is_meaningless_without;
    private static SubLSymbol $sym79$CFASL_CREATE_INVALID_HL_MODULE;
    private static SubLList $list80;
    private static SubLSymbol $sym81$_CFASL_CREATE_INVALID_HL_MODULE_CACHING_STATE_;
    private static SubLSymbol $FREE;
    private static SubLSymbol $DEFAULT;
    private static SubLSymbol $sym84$_HL_MODULE_STORE_;
    private static SubLInteger $int$212;
    private static SubLList $list86;
    private static SubLList $list87;
    private static SubLSymbol $ALLOW_OTHER_KEYS;
    private static SubLSymbol $DONE;
    private static SubLSymbol $sym90$NAME_VAR;
    private static SubLSymbol $sym91$DO_HASH_TABLE;
    private static SubLList $list92;
    private static SubLSymbol $sym93$IGNORE;
    private static SubLSymbol $sym94$HL_MODULE_STORE;
    private static SubLSymbol $sym95$DO_HL_MODULES;
    private static SubLSymbol $ABDUCTION;
    private static SubLSymbol $UNIVERSAL;
    private static SubLSymbol $MODULE_SOURCE;
    private static SubLSymbol $ANYTHING;
    private static SubLSymbol $REQUIRED;
    private static SubLSymbol $COST_PATTERN;
    private static SubLSymbol $COST_EXPRESSION;
    private static SubLSymbol $COST;
    private static SubLSymbol $CHECK;
    private static SubLSymbol $UNKNOWN;
    private static SubLSymbol $NOT_FULLY_BOUND;
    private static SubLString $str107$check;
    private static SubLSymbol $RULE_SELECT;
    private static SubLSymbol $RULE_FILTER;
    private static SubLSymbol $EXPAND;
    private static SubLSymbol $REMOVAL;
    private static SubLSymbol $sym112$INFERENCE_REMOVE_CHECK_DEFAULT;
    private static SubLSymbol $sym113$INFERENCE_REMOVE_UNIFY_DEFAULT;
    private static SubLSymbol $sym114$DEFAULT_EXPAND_FUNC;
    private static SubLSymbol $EXPAND_PATTERN;
    private static SubLSymbol $EXPAND_ITERATIVE_PATTERN;
    private static SubLSymbol $sym117$PATTERN_MATCHES_FORMULA;
    private static SubLSymbol $FORWARD;
    private static SubLSymbol $INPUT_EXTRACT_PATTERN;
    private static SubLSymbol $INPUT_VERIFY_PATTERN;
    private static SubLSymbol $INPUT_ENCODE_PATTERN;
    private static SubLSymbol $OUTPUT_CHECK_PATTERN;
    private static SubLSymbol $OUTPUT_GENERATE_PATTERN;
    private static SubLSymbol $OUTPUT_DECODE_PATTERN;
    private static SubLSymbol $OUTPUT_VERIFY_PATTERN;
    private static SubLSymbol $OUTPUT_CONSTRUCT_PATTERN;
    private static SubLSymbol $SUPPORT_PATTERN;
    private static SubLSymbol $SUPPORT;
    private static SubLSymbol $SUPPORT_MODULE;
    private static SubLSymbol $SUPPORT_MT;
    private static SubLSymbol $SUPPORT_STRENGTH;
    private static SubLSymbol $EVERY_PREDICATES;
    private static SubLSymbol $APPLICABILITY;
    private static SubLSymbol $APPLICABILITY_PATTERN;
    private static SubLSymbol $DOCUMENTATION;
    private static SubLSymbol $EXAMPLE;
    private static SubLSymbol $COMPLETE;
    private static SubLSymbol $INCOMPLETE;
    private static SubLSymbol $COMPLETE_PATTERN;
    private static SubLSymbol $COMPLETENESS_PATTERN;
    private static SubLSymbol $EXTERNAL;
    private static SubLSymbol $sym142$FUNCTION_SYMBOL_P;
    private static SubLList $list143;
    private static SubLSymbol $sym144$STRING_LESSP;
    private static SubLSymbol $sym145$SYMBOL_NAME;
    private static SubLSymbol $sym146$_REMOVAL_MODULES_;
    private static SubLList $list147;
    private static SubLSymbol $sym148$DO_SET;
    private static SubLList $list149;
    private static SubLSymbol $sym150$REMOVAL_MODULES;
    private static SubLSymbol $sym151$DO_REMOVAL_MODULES;
    private static SubLSymbol $sym152$_REMOVAL_MODULES_EXTERNAL_;
    private static SubLSymbol $sym153$_REMOVAL_MODULES_GENERIC_;
    private static SubLSymbol $sym154$HL_MODULE_SENSE;
    private static SubLSymbol $sym155$_REMOVAL_MODULES_UNIVERSAL_;
    private static SubLSymbol $sym156$_REMOVAL_MODULES_SPECIFIC_;
    private static SubLInteger $int$32;
    private static SubLSymbol $sym158$FORT_P;
    private static SubLSymbol $sym159$_REMOVAL_MODULES_SPECIFIC_USE_GENERIC_;
    private static SubLSymbol $sym160$_REMOVAL_MODULES_SPECIFIC_USE_META_REMOVAL_;
    private static SubLSymbol $sym161$_REMOVAL_MODULES_SPECIFIC_DONT_USE_UNIVERSAL_;
    private static SubLSymbol $sym162$_SOLELY_SPECIFIC_REMOVAL_MODULE_PREDICATE_STORE_;
    private static SubLInteger $int$50;
    private static SubLSymbol $POS;
    private static SubLSymbol $NEG;
    private static SubLString $str166$removal_module__S_must_have_a__SE;
    private static SubLSymbol $sym167$CAR;
    private static SubLList $list168;
    private static SubLSymbol $sym169$INFERENCE_REMOVAL_MODULE__FOR_CLASSIFICATION;
    private static SubLSymbol $sym170$REMOVAL_MODULE_SPECIFIC_USE_GENERIC_;
    private static SubLList $list171;
    private static SubLSymbol $PRUNING;
    private static SubLSymbol $sym173$_CONJUNCTIVE_REMOVAL_MODULES_;
    private static SubLList $list174;
    private static SubLList $list175;
    private static SubLSymbol $sym176$REMOVAL_MODULES_CONJUNCTIVE;
    private static SubLSymbol $sym177$DO_CONJUNCTIVE_REMOVAL_MODULES;
    private static SubLSymbol $REMOVAL_CONJUNCTIVE;
    private static SubLList $list179;
    private static SubLSymbol $sym180$META_REMOVAL_MODULES;
    private static SubLSymbol $sym181$DO_META_REMOVAL_MODULES;
    private static SubLSymbol $META_REMOVAL;
    private static SubLSymbol $sym183$_TRANSFORMATION_MODULES_;
    private static SubLList $list184;
    private static SubLSymbol $sym185$TRANSFORMATION_MODULES;
    private static SubLSymbol $sym186$DO_TRANSFORMATION_MODULES;
    private static SubLSymbol $TRANSFORMATION;
    private static SubLSymbol $sym188$_META_TRANSFORMATION_MODULES_;
    private static SubLList $list189;
    private static SubLSymbol $sym190$META_TRANSFORMATION_MODULES;
    private static SubLSymbol $sym191$DO_META_TRANSFORMATION_MODULES;
    private static SubLSymbol $META_TRANSFORMATION;
    private static SubLSymbol $sym193$_REWRITE_MODULES_;
    private static SubLList $list194;
    private static SubLSymbol $REWRITE_SUPPORT;
    private static SubLSymbol $REWRITE_CLOSURE;
    private static SubLSymbol $REWRITE;
    private static SubLString $str198$rewrite_module__S_must_have_a__SE;
    private static SubLSymbol $sym199$_STRUCTURAL_MODULES_;
    private static SubLSymbol $STRUCTURAL;
    private static SubLSymbol $sym201$_META_STRUCTURAL_MODULES_;
    private static SubLList $list202;
    private static SubLSymbol $sym203$META_STRUCTURAL_MODULES;
    private static SubLSymbol $sym204$DO_META_STRUCTURAL_MODULES;
    private static SubLSymbol $META_STRUCTURAL;
    private static SubLInteger $int$256;
    private static SubLSymbol $sym207$CFASL_INPUT_HL_MODULE;
    private static SubLSymbol $sym208$CFASL_OUTPUT_OBJECT_HL_MODULE_METHOD;

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 3000L)
    public static SubLObject hl_module_property_p(SubLObject v_object) {
        return makeBoolean(v_object.isKeyword() && NIL != subl_promotions.memberP(v_object, $hl_module_properties$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 3100L)
    public static SubLObject do_hl_module_properties(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list2);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject property_var = NIL;
        SubLObject value_var = NIL;
        SubLObject hl_module = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list2);
        property_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list2);
        value_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list2);
        hl_module = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject body;
            current = (body = temp);
            SubLObject module_var = $sym3$MODULE_VAR;
            return list($sym4$CLET, list(list(module_var, hl_module)), list($sym5$DO_LIST, reader.bq_cons(property_var, $list6),
                    list($sym7$PWHEN, list($sym8$HL_MODULE_PROPERTY_NOT_DEFAULT_, module_var, property_var), listS($sym4$CLET, list(list(value_var, ConsesLow.list($sym9$HL_MODULE_PROPERTY_WITHOUT_VALUES, module_var, property_var))), append(body, NIL)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list2);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 3500L)
    public static SubLObject hl_module_properties() {
        return $hl_module_properties$.getGlobalValue();
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 3600L)
    public static SubLObject removal_module_plist_indicators() {
        return hl_module_properties();
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 3900L)
    public static SubLObject hl_module_subtype_p(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $valid_hl_module_subtypes$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 5500L)
    public static SubLObject allowed_modules_spec_p(SubLObject v_object) {
        return makeBoolean($ALL == v_object || NIL != disjunctive_allowed_modules_spec_p(v_object) || NIL != conjunctive_allowed_modules_spec_p(v_object) || NIL != negated_allowed_modules_spec_p(v_object) || NIL != hl_module_type_spec_p(v_object) || NIL != hl_module_subtype_spec_p(v_object)
                || NIL != property_allowed_modules_spec_p(v_object) || NIL != find_hl_module_by_name(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 6800L)
    public static SubLObject non_universal_allowed_modules_spec_p(SubLObject v_object) {
        return makeBoolean($ALL != v_object && NIL != allowed_modules_spec_p(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 7000L)
    public static SubLObject disjunctive_allowed_modules_spec_p(SubLObject v_object) {
        return makeBoolean(v_object.isCons() && $OR == v_object.first() && NIL != list_utilities.list_of_type_p($sym17$ALLOWED_MODULES_SPEC_P, v_object.rest()));
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 7200L)
    public static SubLObject conjunctive_allowed_modules_spec_p(SubLObject v_object) {
        return makeBoolean(v_object.isCons() && $AND == v_object.first() && NIL != list_utilities.list_of_type_p($sym17$ALLOWED_MODULES_SPEC_P, v_object.rest()));
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 7400L)
    public static SubLObject negated_allowed_modules_spec_p(SubLObject v_object) {
        return makeBoolean(v_object.isCons() && $NOT == v_object.first() && NIL != list_utilities.list_of_type_p($sym17$ALLOWED_MODULES_SPEC_P, v_object.rest()));
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 7600L)
    public static SubLObject hl_module_type_spec_p(SubLObject v_object) {
        return makeBoolean(NIL != list_utilities.doubletonP(v_object) && $MODULE_TYPE == v_object.first());
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 7700L)
    public static SubLObject hl_module_subtype_spec_p(SubLObject v_object) {
        return makeBoolean(NIL != list_utilities.doubletonP(v_object) && $MODULE_SUBTYPE == v_object.first());
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 7800L)
    public static SubLObject property_allowed_modules_spec_p(SubLObject v_object) {
        return makeBoolean(NIL != list_utilities.doubletonP(v_object) && NIL != hl_module_property_p(v_object.first()));
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 7900L)
    public static SubLObject hl_module_allowedP(SubLObject hl_module, SubLObject allowed_modules_spec) {
        assert NIL != hl_module_p(hl_module) : hl_module;
        assert NIL != allowed_modules_spec_p(allowed_modules_spec) : allowed_modules_spec;
        return hl_module_allowed_by_allowed_modules_specP(hl_module, allowed_modules_spec);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 8800L)
    public static SubLObject hl_module_allowed_by_allowed_modules_specP(SubLObject hl_module, SubLObject allowed_modules_spec) {
        if ($ALL == allowed_modules_spec) {
            return T;
        }
        if (NIL != disjunctive_allowed_modules_spec_p(allowed_modules_spec)) {
            SubLObject cdolist_list_var = allowed_modules_spec.rest();
            SubLObject allowed_modules_subspec = NIL;
            allowed_modules_subspec = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != hl_module_allowed_by_allowed_modules_specP(hl_module, allowed_modules_subspec)) {
                    return T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                allowed_modules_subspec = cdolist_list_var.first();
            }
            return NIL;
        }
        if (NIL != conjunctive_allowed_modules_spec_p(allowed_modules_spec)) {
            SubLObject cdolist_list_var = allowed_modules_spec.rest();
            SubLObject allowed_modules_subspec = NIL;
            allowed_modules_subspec = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == hl_module_allowed_by_allowed_modules_specP(hl_module, allowed_modules_subspec)) {
                    return NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                allowed_modules_subspec = cdolist_list_var.first();
            }
            return T;
        }
        if (NIL != negated_allowed_modules_spec_p(allowed_modules_spec)) {
            return makeBoolean(NIL == hl_module_allowed_by_allowed_modules_specP(hl_module, conses_high.second(allowed_modules_spec)));
        }
        if (NIL != hl_module_type_spec_p(allowed_modules_spec)) {
            return Equality.eql(conses_high.second(allowed_modules_spec), hl_module_type(hl_module));
        }
        if (NIL != hl_module_subtype_spec_p(allowed_modules_spec)) {
            return subl_promotions.memberP(conses_high.second(allowed_modules_spec), hl_module_subtypes(hl_module), UNPROVIDED, UNPROVIDED);
        }
        if (NIL != property_allowed_modules_spec_p(allowed_modules_spec)) {
            SubLObject property = allowed_modules_spec.first();
            SubLObject allowed_value = conses_high.second(allowed_modules_spec);
            SubLObject actual_value = hl_module_property_without_values(hl_module, property);
            return Equality.equal(allowed_value, actual_value);
        }
        return Equality.eql(hl_module, find_hl_module_by_name(allowed_modules_spec));
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 10300L)
    public static SubLObject simple_allowed_modules_spec_p(SubLObject allowed_modules_spec) {
        if (NIL != find_hl_module_by_name(allowed_modules_spec)) {
            return T;
        }
        if (NIL != disjunctive_allowed_modules_spec_p(allowed_modules_spec)) {
            SubLObject cdolist_list_var = allowed_modules_spec.rest();
            SubLObject allowed_modules_subspec = NIL;
            allowed_modules_subspec = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == simple_allowed_modules_spec_p(allowed_modules_subspec)) {
                    return NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                allowed_modules_subspec = cdolist_list_var.first();
            }
            return T;
        }
        if (NIL != conjunctive_allowed_modules_spec_p(allowed_modules_spec)) {
            SubLObject cdolist_list_var = allowed_modules_spec.rest();
            SubLObject allowed_modules_subspec = NIL;
            allowed_modules_subspec = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == simple_allowed_modules_spec_p(allowed_modules_subspec)) {
                    return NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                allowed_modules_subspec = cdolist_list_var.first();
            }
            return T;
        }
        if ($ALL == allowed_modules_spec || NIL != negated_allowed_modules_spec_p(allowed_modules_spec) || NIL != hl_module_type_spec_p(allowed_modules_spec) || NIL != hl_module_subtype_spec_p(allowed_modules_spec) || NIL != property_allowed_modules_spec_p(allowed_modules_spec)) {
            return NIL;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 11200L)
    public static SubLObject get_modules_from_simple_allowed_modules_spec(SubLObject allowed_modules_spec) {
        if (NIL != disjunctive_allowed_modules_spec_p(allowed_modules_spec)) {
            SubLObject module_specs = NIL;
            SubLObject cdolist_list_var = allowed_modules_spec.rest();
            SubLObject allowed_modules_subspec = NIL;
            allowed_modules_subspec = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                module_specs = append(module_specs, get_modules_from_simple_allowed_modules_spec(allowed_modules_subspec));
                cdolist_list_var = cdolist_list_var.rest();
                allowed_modules_subspec = cdolist_list_var.first();
            }
            return module_specs;
        }
        if (NIL != conjunctive_allowed_modules_spec_p(allowed_modules_spec)) {
            SubLObject module_specs = NIL;
            SubLObject cdolist_list_var = allowed_modules_spec.rest();
            SubLObject allowed_modules_subspec = NIL;
            allowed_modules_subspec = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                module_specs = append(module_specs, get_modules_from_simple_allowed_modules_spec(allowed_modules_subspec));
                cdolist_list_var = cdolist_list_var.rest();
                allowed_modules_subspec = cdolist_list_var.first();
            }
            return module_specs;
        }
        return list(find_hl_module_by_name(allowed_modules_spec));
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12300L)
    public static SubLObject hl_module_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        print_hl_module(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12300L)
    public static SubLObject hl_module_p(SubLObject v_object) {
        return (v_object.getClass() == $hl_module_native.class) ? T : NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12300L)
    public static SubLObject hl_mod_name(SubLObject v_object) {
        assert NIL != hl_module_p(v_object) : v_object;
        return v_object.getField2();
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12300L)
    public static SubLObject hl_mod_plist(SubLObject v_object) {
        assert NIL != hl_module_p(v_object) : v_object;
        return v_object.getField3();
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12300L)
    public static SubLObject hl_mod_sense(SubLObject v_object) {
        assert NIL != hl_module_p(v_object) : v_object;
        return v_object.getField4();
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12300L)
    public static SubLObject hl_mod_predicate(SubLObject v_object) {
        assert NIL != hl_module_p(v_object) : v_object;
        return v_object.getField5();
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12300L)
    public static SubLObject hl_mod_any_predicates(SubLObject v_object) {
        assert NIL != hl_module_p(v_object) : v_object;
        return v_object.getField6();
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12300L)
    public static SubLObject hl_mod_arity(SubLObject v_object) {
        assert NIL != hl_module_p(v_object) : v_object;
        return v_object.getField7();
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12300L)
    public static SubLObject hl_mod_direction(SubLObject v_object) {
        assert NIL != hl_module_p(v_object) : v_object;
        return v_object.getField8();
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12300L)
    public static SubLObject hl_mod_required_pattern(SubLObject v_object) {
        assert NIL != hl_module_p(v_object) : v_object;
        return v_object.getField9();
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12300L)
    public static SubLObject hl_mod_required_mt(SubLObject v_object) {
        assert NIL != hl_module_p(v_object) : v_object;
        return v_object.getField10();
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12300L)
    public static SubLObject hl_mod_exclusive_func(SubLObject v_object) {
        assert NIL != hl_module_p(v_object) : v_object;
        return v_object.getField11();
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12300L)
    public static SubLObject hl_mod_required_func(SubLObject v_object) {
        assert NIL != hl_module_p(v_object) : v_object;
        return v_object.getField12();
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12300L)
    public static SubLObject hl_mod_completeness(SubLObject v_object) {
        assert NIL != hl_module_p(v_object) : v_object;
        return v_object.getField13();
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12300L)
    public static SubLObject _csetf_hl_mod_name(SubLObject v_object, SubLObject value) {
        assert NIL != hl_module_p(v_object) : v_object;
        return v_object.setField2(value);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12300L)
    public static SubLObject _csetf_hl_mod_plist(SubLObject v_object, SubLObject value) {
        assert NIL != hl_module_p(v_object) : v_object;
        return v_object.setField3(value);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12300L)
    public static SubLObject _csetf_hl_mod_sense(SubLObject v_object, SubLObject value) {
        assert NIL != hl_module_p(v_object) : v_object;
        return v_object.setField4(value);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12300L)
    public static SubLObject _csetf_hl_mod_predicate(SubLObject v_object, SubLObject value) {
        assert NIL != hl_module_p(v_object) : v_object;
        return v_object.setField5(value);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12300L)
    public static SubLObject _csetf_hl_mod_any_predicates(SubLObject v_object, SubLObject value) {
        assert NIL != hl_module_p(v_object) : v_object;
        return v_object.setField6(value);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12300L)
    public static SubLObject _csetf_hl_mod_arity(SubLObject v_object, SubLObject value) {
        assert NIL != hl_module_p(v_object) : v_object;
        return v_object.setField7(value);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12300L)
    public static SubLObject _csetf_hl_mod_direction(SubLObject v_object, SubLObject value) {
        assert NIL != hl_module_p(v_object) : v_object;
        return v_object.setField8(value);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12300L)
    public static SubLObject _csetf_hl_mod_required_pattern(SubLObject v_object, SubLObject value) {
        assert NIL != hl_module_p(v_object) : v_object;
        return v_object.setField9(value);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12300L)
    public static SubLObject _csetf_hl_mod_required_mt(SubLObject v_object, SubLObject value) {
        assert NIL != hl_module_p(v_object) : v_object;
        return v_object.setField10(value);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12300L)
    public static SubLObject _csetf_hl_mod_exclusive_func(SubLObject v_object, SubLObject value) {
        assert NIL != hl_module_p(v_object) : v_object;
        return v_object.setField11(value);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12300L)
    public static SubLObject _csetf_hl_mod_required_func(SubLObject v_object, SubLObject value) {
        assert NIL != hl_module_p(v_object) : v_object;
        return v_object.setField12(value);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12300L)
    public static SubLObject _csetf_hl_mod_completeness(SubLObject v_object, SubLObject value) {
        assert NIL != hl_module_p(v_object) : v_object;
        return v_object.setField13(value);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12300L)
    public static SubLObject make_hl_module(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        SubLObject v_new = new $hl_module_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($NAME)) {
                _csetf_hl_mod_name(v_new, current_value);
            } else if (pcase_var.eql($PLIST)) {
                _csetf_hl_mod_plist(v_new, current_value);
            } else if (pcase_var.eql($SENSE)) {
                _csetf_hl_mod_sense(v_new, current_value);
            } else if (pcase_var.eql($PREDICATE)) {
                _csetf_hl_mod_predicate(v_new, current_value);
            } else if (pcase_var.eql($ANY_PREDICATES)) {
                _csetf_hl_mod_any_predicates(v_new, current_value);
            } else if (pcase_var.eql($ARITY)) {
                _csetf_hl_mod_arity(v_new, current_value);
            } else if (pcase_var.eql($DIRECTION)) {
                _csetf_hl_mod_direction(v_new, current_value);
            } else if (pcase_var.eql($REQUIRED_PATTERN)) {
                _csetf_hl_mod_required_pattern(v_new, current_value);
            } else if (pcase_var.eql($REQUIRED_MT)) {
                _csetf_hl_mod_required_mt(v_new, current_value);
            } else if (pcase_var.eql($EXCLUSIVE_FUNC)) {
                _csetf_hl_mod_exclusive_func(v_new, current_value);
            } else if (pcase_var.eql($REQUIRED_FUNC)) {
                _csetf_hl_mod_required_func(v_new, current_value);
            } else if (pcase_var.eql($COMPLETENESS)) {
                _csetf_hl_mod_completeness(v_new, current_value);
            } else {
                Errors.error($str66$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12300L)
    public static SubLObject visit_defstruct_hl_module(SubLObject obj, SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, $BEGIN, $sym68$MAKE_HL_MODULE, TWELVE_INTEGER);
        Functions.funcall(visitor_fn, obj, $SLOT, $NAME, hl_mod_name(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $PLIST, hl_mod_plist(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $SENSE, hl_mod_sense(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $PREDICATE, hl_mod_predicate(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $ANY_PREDICATES, hl_mod_any_predicates(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $ARITY, hl_mod_arity(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $DIRECTION, hl_mod_direction(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $REQUIRED_PATTERN, hl_mod_required_pattern(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $REQUIRED_MT, hl_mod_required_mt(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $EXCLUSIVE_FUNC, hl_mod_exclusive_func(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $REQUIRED_FUNC, hl_mod_required_func(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $COMPLETENESS, hl_mod_completeness(obj));
        Functions.funcall(visitor_fn, obj, $END, $sym68$MAKE_HL_MODULE, TWELVE_INTEGER);
        return obj;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12300L)
    public static SubLObject visit_defstruct_object_hl_module_method(SubLObject obj, SubLObject visitor_fn) {
        return visit_defstruct_hl_module(obj, visitor_fn);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12800L)
    public static SubLObject print_hl_module(SubLObject v_object, SubLObject stream, SubLObject depth) {
        SubLObject name = hl_module_name(v_object);
        PrintLow.format(stream, $str72$_HL_Module___a_, name);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 13000L)
    public static SubLObject sxhash_hl_module_method(SubLObject v_object) {
        return Sxhash.sxhash(hl_mod_name(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 13100L)
    public static SubLObject check_hl_module_property_list(SubLObject plist) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != list_utilities.property_list_p(plist) : plist;
        SubLObject exclusive_specifiedP = NIL;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        SubLObject pcase_var;
        for (remainder = NIL, remainder = plist; NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            value = conses_high.cadr(remainder);
            assert NIL != hl_module_property_p(property) : property;
            pcase_var = property;
            if (pcase_var.eql($EXCLUSIVE)) {
                exclusive_specifiedP = T;
            }
        }
        for (remainder = NIL, remainder = plist; NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            value = conses_high.cadr(remainder);
            pcase_var = property;
            if (pcase_var.eql($SUPPLANTS) && NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL == exclusive_specifiedP) {
                Errors.error($str78$_supplants_is_meaningless_without, plist);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 13800L)
    public static SubLObject new_hl_module(SubLObject name, SubLObject plist) {
        check_hl_module_property_list(plist);
        SubLObject hl_module = allocate_hl_module(name);
        plist = canonicalize_hl_module_plist(plist);
        _csetf_hl_mod_plist(hl_module, plist);
        add_hl_module(hl_module);
        return hl_module;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 14200L)
    public static SubLObject clear_cfasl_create_invalid_hl_module() {
        SubLObject cs = $cfasl_create_invalid_hl_module_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 14200L)
    public static SubLObject remove_cfasl_create_invalid_hl_module(SubLObject name) {
        return memoization_state.caching_state_remove_function_results_with_args($cfasl_create_invalid_hl_module_caching_state$.getGlobalValue(), list(name), UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 14200L)
    public static SubLObject cfasl_create_invalid_hl_module_internal(SubLObject name) {
        return new_hl_module(name, $list80);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 14200L)
    public static SubLObject cfasl_create_invalid_hl_module(SubLObject name) {
        SubLObject caching_state = $cfasl_create_invalid_hl_module_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym79$CFASL_CREATE_INVALID_HL_MODULE, $sym81$_CFASL_CREATE_INVALID_HL_MODULE_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, name, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), Values.multiple_value_list(cfasl_create_invalid_hl_module_internal(name)));
            memoization_state.caching_state_put(caching_state, name, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 14400L)
    public static SubLObject canonicalize_hl_module_plist(SubLObject plist) {
        SubLObject module_subtypes = conses_high.getf(plist, $MODULE_SUBTYPE, UNPROVIDED);
        if (!module_subtypes.isList()) {
            plist = conses_high.putf(conses_high.copy_list(plist), $MODULE_SUBTYPE, list(module_subtypes));
        }
        return plist;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 14800L)
    public static SubLObject allocate_hl_module(SubLObject name) {
        SubLObject hl_module = find_hl_module_by_name(name);
        if (NIL != hl_module) {
            remove_hl_module(hl_module);
        } else {
            hl_module = make_hl_module(UNPROVIDED);
            _csetf_hl_mod_name(hl_module, name);
        }
        _csetf_hl_mod_plist(hl_module, NIL);
        return hl_module;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 15100L)
    public static SubLObject destroy_hl_module(SubLObject hl_module) {
        remove_hl_module(hl_module);
        _csetf_hl_mod_plist(hl_module, $FREE);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 15200L)
    public static SubLObject hl_module_name(SubLObject hl_module) {
        assert NIL != hl_module_p(hl_module) : hl_module;
        return hl_mod_name(hl_module);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 15400L)
    public static SubLObject hl_module_plist(SubLObject hl_module) {
        return hl_mod_plist(hl_module);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 15600L)
    public static SubLObject hl_module_property(SubLObject hl_module, SubLObject property) {
        SubLObject plist = hl_module_plist(hl_module);
        SubLObject value = conses_high.getf(plist, property, $DEFAULT);
        if (value == $DEFAULT) {
            SubLObject v_default = dictionary.dictionary_lookup_without_values($hl_module_property_defaults$.getGlobalValue(), property, UNPROVIDED);
            return subl_promotions.values2(v_default, T);
        }
        return subl_promotions.values2(value, NIL);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 16200L)
    public static SubLObject hl_module_property_without_values(SubLObject hl_module, SubLObject property) {
        SubLObject plist = hl_module_plist(hl_module);
        SubLObject value = conses_high.getf(plist, property, $DEFAULT);
        if (value == $DEFAULT) {
            value = dictionary.dictionary_lookup_without_values($hl_module_property_defaults$.getGlobalValue(), property, UNPROVIDED);
        }
        return value;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 16800L)
    public static SubLObject hl_module_property_not_defaultP(SubLObject hl_module, SubLObject property) {
        SubLObject value = hl_module_property_without_values(hl_module, property);
        SubLObject v_default = dictionary.dictionary_lookup_without_values($hl_module_property_defaults$.getGlobalValue(), property, UNPROVIDED);
        return makeBoolean(!value.equal(v_default));
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 17700L)
    public static SubLObject do_hl_modules(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list86);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject hl_module_var = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list86);
        hl_module_var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list86);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list86);
            if (NIL == conses_high.member(current_$1, $list87, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list86);
        }
        SubLObject done_tail = cdestructuring_bind.property_list_member($DONE, current);
        SubLObject done = (NIL != done_tail) ? conses_high.cadr(done_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        SubLObject name_var = $sym90$NAME_VAR;
        return listS($sym91$DO_HASH_TABLE, list(name_var, hl_module_var, $list92, $DONE, done), list($sym93$IGNORE, name_var), append(body, NIL));
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 17900L)
    public static SubLObject hl_module_store() {
        return $hl_module_store$.getGlobalValue();
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 18000L)
    public static SubLObject find_hl_module_by_name(SubLObject name) {
        SubLObject hl_module = Hashtables.gethash_without_values(name, $hl_module_store$.getGlobalValue(), UNPROVIDED);
        return hl_module;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 18200L)
    public static SubLObject add_hl_module(SubLObject hl_module) {
        SubLObject name = hl_module_name(hl_module);
        Hashtables.sethash(name, $hl_module_store$.getGlobalValue(), hl_module);
        return hl_module;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 18400L)
    public static SubLObject remove_hl_module(SubLObject hl_module) {
        SubLObject name = hl_module_name(hl_module);
        Hashtables.remhash(name, $hl_module_store$.getGlobalValue());
        return hl_module;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 18600L)
    public static SubLObject setup_module(SubLObject name, SubLObject type, SubLObject plist) {
        SubLObject new_plist = conses_high.copy_list(plist);
        new_plist = conses_high.putf(plist, $MODULE_TYPE, type);
        SubLObject hl_module = new_hl_module(name, new_plist);
        return hl_module;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 18800L)
    public static SubLObject default_cost_func(SubLObject v_object) {
        if (v_object == UNPROVIDED) {
            v_object = NIL;
        }
        return ZERO_INTEGER;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 18900L)
    public static SubLObject default_expand_func(SubLObject arg1, SubLObject arg2) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 19000L)
    public static SubLObject hl_module_type(SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $MODULE_TYPE);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 19100L)
    public static SubLObject hl_module_subtypes(SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $MODULE_SUBTYPE);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 19300L)
    public static SubLObject abductive_hl_moduleP(SubLObject hl_module) {
        return list_utilities.member_eqP($ABDUCTION, hl_module_subtypes(hl_module));
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 19400L)
    public static SubLObject hl_module_universal(SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $UNIVERSAL);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 19500L)
    public static SubLObject hl_module_source(SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $MODULE_SOURCE);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 19700L)
    public static SubLObject hl_module_sense(SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $SENSE);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 19800L)
    public static SubLObject hl_module_sense_relevant_p(SubLObject hl_module, SubLObject sense) {
        SubLObject module_sense = hl_module_sense(hl_module);
        return makeBoolean(NIL == module_sense || module_sense.eql(sense));
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 19900L)
    public static SubLObject hl_module_required_pattern(SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $REQUIRED_PATTERN);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 20100L)
    public static SubLObject hl_module_required_pattern_matched_p(SubLObject hl_module, SubLObject asent) {
        SubLObject pattern = hl_module_required_pattern(hl_module);
        return makeBoolean($ANYTHING == pattern || NIL != formula_pattern_match.pattern_matches_formula_without_bindings(pattern, asent));
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 20300L)
    public static SubLObject hl_module_required_mt(SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $REQUIRED_MT);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 20400L)
    public static SubLObject hl_module_required_mt_result(SubLObject hl_module) {
        SubLObject required_mt_prop = hl_module_required_mt(hl_module);
        if (NIL != required_mt_prop) {
            return interpret_hl_module_mt_prop(required_mt_prop);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 20700L)
    public static SubLObject interpret_hl_module_mt_prop(SubLObject mt_prop) {
        if (NIL != hlmt.hlmt_p(mt_prop)) {
            return mt_prop;
        }
        if (mt_prop.isSymbol() && NIL != Symbols.boundp(mt_prop)) {
            return Symbols.symbol_value(mt_prop);
        }
        return eval_in_api.possibly_cyc_api_eval(mt_prop);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 20900L)
    public static SubLObject hl_module_required_mt_relevantP(SubLObject hl_module) {
        SubLObject required_mt = hl_module_required_mt_result(hl_module);
        return makeBoolean(NIL == required_mt || NIL != mt_relevance_macros.relevant_mtP(required_mt));
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 21100L)
    public static SubLObject hl_module_required_func(SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $REQUIRED);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 21300L)
    public static SubLObject hl_module_required_func_p(SubLObject hl_module, SubLObject asent) {
        SubLObject required_func = hl_module_required_func(hl_module);
        return makeBoolean(NIL == required_func || NIL != Functions.funcall(required_func, asent));
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 21500L)
    public static SubLObject hl_module_cost_pattern(SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $COST_PATTERN);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 21600L)
    public static SubLObject hl_module_cost_expression(SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $COST_EXPRESSION);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 21700L)
    public static SubLObject hl_module_cost_func(SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $COST);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 21800L)
    public static SubLObject hl_module_cost(SubLObject hl_module, SubLObject v_object, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject cost = hl_module_cost_pattern_result(hl_module, v_object);
        if (!cost.isNumber()) {
            cost = hl_module_cost_expression_result(hl_module);
            if (!cost.isNumber()) {
                cost = hl_module_cost_function_result(hl_module, v_object);
            }
        }
        return cost;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 22300L)
    public static SubLObject hl_module_asent_cost(SubLObject hl_module, SubLObject asent) {
        return hl_module_cost(hl_module, asent, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 22400L)
    public static SubLObject hl_module_clause_cost(SubLObject hl_module, SubLObject contextualized_dnf_clause) {
        return hl_module_cost(hl_module, contextualized_dnf_clause, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 22600L)
    public static SubLObject hl_module_cost_pattern_result(SubLObject hl_module, SubLObject formula) {
        SubLObject cost_pattern = hl_module_cost_pattern(hl_module);
        if (NIL != cost_pattern) {
            return formula_pattern_match.pattern_transform_formula(cost_pattern, formula, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 22900L)
    public static SubLObject hl_module_cost_expression_result(SubLObject hl_module) {
        SubLObject cost_expression = hl_module_cost_expression(hl_module);
        if (NIL == cost_expression) {
            return NIL;
        }
        if (cost_expression.isNumber()) {
            return cost_expression;
        }
        if (cost_expression.isSymbol() && NIL != Symbols.boundp(cost_expression)) {
            return Symbols.symbol_value(cost_expression);
        }
        return eval_in_api.possibly_cyc_api_eval(cost_expression);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 23600L)
    public static SubLObject hl_module_cost_function_result(SubLObject hl_module, SubLObject v_object) {
        SubLObject cost_func = hl_module_cost_func(hl_module);
        if (NIL != eval_in_api.possibly_cyc_api_function_spec_p(cost_func)) {
            SubLObject cost = eval_in_api.possibly_cyc_api_funcall_1(cost_func, v_object);
            return cost;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 23900L)
    public static SubLObject hl_module_asent_cost_function_result(SubLObject hl_module, SubLObject asent) {
        return hl_module_cost_function_result(hl_module, asent);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 24200L)
    public static SubLObject hl_module_clause_cost_function_result(SubLObject hl_module, SubLObject contextualized_dnf_clause) {
        return hl_module_cost_function_result(hl_module, contextualized_dnf_clause);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 24500L)
    public static SubLObject hl_module_is_checkP(SubLObject hl_module) {
        SubLObject check = hl_module_property_without_values(hl_module, $CHECK);
        if (check == $UNKNOWN) {
            return guess_hl_module_is_checkP(hl_module);
        }
        return list_utilities.sublisp_boolean(check);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 24900L)
    public static SubLObject guess_hl_module_is_checkP(SubLObject hl_module) {
        SubLObject required_pattern = hl_module_required_pattern(hl_module);
        if (NIL != cycl_utilities.expression_find($NOT_FULLY_BOUND, required_pattern, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        SubLObject name = string_utilities.str(hl_module_name(hl_module));
        SubLObject checkP = string_utilities.substringP($str107$check, name, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return checkP;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 25300L)
    public static SubLObject hl_module_rule_select_func(SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $RULE_SELECT);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 25400L)
    public static SubLObject hl_module_rule_filter_func(SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $RULE_FILTER);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 25600L)
    public static SubLObject hl_module_expand_func(SubLObject hl_module) {
        inference_analysis.cinc_module_expand_count(hl_module);
        SubLObject expand = hl_module_property_without_values(hl_module, $EXPAND);
        if ($DEFAULT == expand) {
            return default_expand_func_for_hl_module(hl_module);
        }
        return expand;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 25800L)
    public static SubLObject default_expand_func_for_hl_module(SubLObject hl_module) {
        if ($REMOVAL != hl_module_type(hl_module)) {
            return $sym114$DEFAULT_EXPAND_FUNC;
        }
        if (NIL != hl_module_is_checkP(hl_module)) {
            return $sym112$INFERENCE_REMOVE_CHECK_DEFAULT;
        }
        return $sym113$INFERENCE_REMOVE_UNIFY_DEFAULT;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 26100L)
    public static SubLObject hl_module_expand_pattern(SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $EXPAND_PATTERN);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 26200L)
    public static SubLObject hl_module_expand_iterative_pattern(SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $EXPAND_ITERATIVE_PATTERN);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 26400L)
    public static SubLObject hl_module_predicate(SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $PREDICATE);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 26500L)
    public static SubLObject hl_module_predicate_relevant_p(SubLObject hl_module, SubLObject predicate) {
        SubLObject hl_module_predicate = hl_module_predicate(hl_module);
        if (NIL != hl_module_predicate) {
            return Equality.eql(hl_module_predicate, predicate);
        }
        SubLObject hl_module_any_preds = hl_module_any_predicates(hl_module);
        if (NIL != hl_module_any_preds) {
            return subl_promotions.memberP(predicate, hl_module_any_preds, $sym117$PATTERN_MATCHES_FORMULA, UNPROVIDED);
        }
        return T;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 26900L)
    public static SubLObject hl_module_arity(SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $ARITY);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 27000L)
    public static SubLObject hl_module_arity_relevant_p(SubLObject hl_module, SubLObject asent) {
        SubLObject hl_module_arity = hl_module_arity(hl_module);
        return makeBoolean(NIL == hl_module_arity || (NIL != el_utilities.el_formula_without_sequence_termP(asent) && hl_module_arity.numE(Sequences.length(asent.rest()))));
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 27300L)
    public static SubLObject hl_module_exclusive_func(SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $EXCLUSIVE);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 28100L)
    public static SubLObject hl_module_supplants_info(SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $SUPPLANTS);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 28300L)
    public static SubLObject hl_module_direction(SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $DIRECTION);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 28400L)
    public static SubLObject hl_module_direction_relevantP(SubLObject hl_module) {
        if (NIL == kb_control_vars.within_forward_inferenceP()) {
            return T;
        }
        SubLObject direction = hl_module_direction(hl_module);
        return Equality.eq(direction, $FORWARD);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 28900L)
    public static SubLObject hl_module_input_extract_pattern(SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $INPUT_EXTRACT_PATTERN);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 29000L)
    public static SubLObject hl_module_input_verify_pattern(SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $INPUT_VERIFY_PATTERN);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 29200L)
    public static SubLObject hl_module_input_encode_pattern(SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $INPUT_ENCODE_PATTERN);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 29300L)
    public static SubLObject hl_module_output_check_pattern(SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $OUTPUT_CHECK_PATTERN);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 29400L)
    public static SubLObject hl_module_output_generate_pattern(SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $OUTPUT_GENERATE_PATTERN);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 29600L)
    public static SubLObject hl_module_output_decode_pattern(SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $OUTPUT_DECODE_PATTERN);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 29700L)
    public static SubLObject hl_module_output_verify_pattern(SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $OUTPUT_VERIFY_PATTERN);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 29900L)
    public static SubLObject hl_module_output_construct_pattern(SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $OUTPUT_CONSTRUCT_PATTERN);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 30000L)
    public static SubLObject hl_module_support_pattern(SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $SUPPORT_PATTERN);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 30100L)
    public static SubLObject hl_module_support_func(SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $SUPPORT);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 30200L)
    public static SubLObject hl_module_support_module(SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $SUPPORT_MODULE);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 30400L)
    public static SubLObject hl_module_support_mt(SubLObject hl_module) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject support_mt = hl_module_property(hl_module, $SUPPORT_MT);
        SubLObject default_inferredP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != default_inferredP) {
            support_mt = mt_relevance_macros.current_mt_relevance_mt();
        }
        return support_mt;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 30600L)
    public static SubLObject hl_module_support_mt_result(SubLObject hl_module) {
        SubLObject support_mt_prop = hl_module_support_mt(hl_module);
        return interpret_hl_module_mt_prop(support_mt_prop);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 30800L)
    public static SubLObject hl_module_support_strength(SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $SUPPORT_STRENGTH);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 30900L)
    public static SubLObject hl_module_every_predicates(SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $EVERY_PREDICATES);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 31100L)
    public static SubLObject hl_module_applicability_func(SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $APPLICABILITY);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 31200L)
    public static SubLObject hl_module_applicability_pattern(SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $APPLICABILITY_PATTERN);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 31300L)
    public static SubLObject hl_module_any_predicates(SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $ANY_PREDICATES);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 31400L)
    public static SubLObject hl_module_documentation_string(SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $DOCUMENTATION);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 31600L)
    public static SubLObject hl_module_example_string(SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $EXAMPLE);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 31700L)
    public static SubLObject hl_module_completeP(SubLObject hl_module, SubLObject asent) {
        return Equality.eq($COMPLETE, hl_module_completeness(hl_module, asent, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 31800L)
    public static SubLObject hl_module_incompleteP(SubLObject hl_module, SubLObject asent) {
        return Equality.eq($INCOMPLETE, hl_module_completeness(hl_module, asent, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 32100L)
    public static SubLObject hl_module_completeness(SubLObject hl_module, SubLObject asent, SubLObject default_completeness) {
        if (default_completeness == UNPROVIDED) {
            default_completeness = $INCOMPLETE;
        }
        SubLObject completeness = hl_module_property_without_values(hl_module, $COMPLETENESS);
        if (NIL != completeness) {
            return completeness;
        }
        SubLObject pattern = hl_module_property_without_values(hl_module, $COMPLETE_PATTERN);
        if (NIL != pattern && NIL != formula_pattern_match.pattern_matches_formula_without_bindings(pattern, asent)) {
            return $COMPLETE;
        }
        pattern = hl_module_property_without_values(hl_module, $COMPLETENESS_PATTERN);
        if (NIL != pattern) {
            SubLObject completeness2 = formula_pattern_match.pattern_transform_formula(pattern, asent, UNPROVIDED);
            if (NIL != completeness2) {
                return completeness2;
            }
        }
        return default_completeness;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 33700L)
    public static SubLObject hl_module_clause_completeness(SubLObject hl_module, SubLObject clause) {
        SubLObject completeness = hl_module_property_without_values(hl_module, $COMPLETENESS);
        if (NIL != completeness) {
            return completeness;
        }
        SubLObject pattern = hl_module_property_without_values(hl_module, $COMPLETE_PATTERN);
        if (NIL != pattern && NIL != formula_pattern_match.pattern_matches_formula_without_bindings(pattern, clause)) {
            return $COMPLETE;
        }
        pattern = hl_module_property_without_values(hl_module, $COMPLETENESS_PATTERN);
        if (NIL != pattern) {
            SubLObject completeness2 = formula_pattern_match.pattern_transform_formula(pattern, clause, UNPROVIDED);
            if (NIL != completeness2) {
                return completeness2;
            }
        }
        return $INCOMPLETE;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 35100L)
    public static SubLObject hl_module_externalP(SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $EXTERNAL);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 35300L)
    public static SubLObject hl_module_activeP(SubLObject hl_module, SubLObject inactive_hl_modules) {
        if (inactive_hl_modules == UNPROVIDED) {
            inactive_hl_modules = NIL;
        }
        return makeBoolean(NIL == subl_promotions.memberP(hl_module, inactive_hl_modules, UNPROVIDED, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 35400L)
    public static SubLObject hl_module_implementation_methods(SubLObject hl_module) {
        if (hl_module.isSymbol()) {
            hl_module = find_hl_module_by_name(hl_module);
        }
        assert NIL != hl_module_p(hl_module) : hl_module;
        SubLObject plist = hl_module_plist(hl_module);
        SubLObject all_methods = NIL;
        SubLObject remainder;
        SubLObject key;
        SubLObject value;
        SubLObject cdolist_list_var;
        SubLObject v_methods;
        SubLObject method;
        SubLObject item_var;
        for (remainder = NIL, remainder = plist; NIL != remainder; remainder = conses_high.cddr(remainder)) {
            key = remainder.first();
            value = conses_high.cadr(remainder);
            v_methods = (cdolist_list_var = list_utilities.tree_gather(value, Symbols.symbol_function($sym142$FUNCTION_SYMBOL_P), UNPROVIDED, UNPROVIDED, UNPROVIDED));
            method = NIL;
            method = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == list_utilities.member_eqP(method, $list143)) {
                    item_var = method;
                    if (NIL == conses_high.member(item_var, all_methods, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY))) {
                        all_methods = cons(item_var, all_methods);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                method = cdolist_list_var.first();
            }
        }
        return Sort.sort(all_methods, Symbols.symbol_function($sym144$STRING_LESSP), Symbols.symbol_function($sym145$SYMBOL_NAME));
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 36400L)
    public static SubLObject do_removal_modules(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list147);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject hl_module = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list147);
        hl_module = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list147);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list147);
            if (NIL == conses_high.member(current_$2, $list87, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list147);
        }
        SubLObject done_tail = cdestructuring_bind.property_list_member($DONE, current);
        SubLObject done = (NIL != done_tail) ? conses_high.cadr(done_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        return listS($sym148$DO_SET, list(hl_module, $list149, $DONE, done), append(body, NIL));
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 36600L)
    public static SubLObject removal_modules() {
        return $removal_modules$.getGlobalValue();
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 36700L)
    public static SubLObject removal_module_p(SubLObject v_object) {
        return set.set_memberP(v_object, $removal_modules$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 36700L)
    public static SubLObject removal_module_count() {
        return set.set_size($removal_modules$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 37000L)
    public static SubLObject some_external_removal_modulesP() {
        return list_utilities.sublisp_boolean($removal_modules_external$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 37100L)
    public static SubLObject removal_modules_external() {
        return $removal_modules_external$.getGlobalValue();
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 37400L)
    public static SubLObject generic_removal_module_p(SubLObject v_object) {
        return makeBoolean(NIL != removal_module_p(v_object) && NIL != subl_promotions.memberP(v_object, $removal_modules_generic$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 37600L)
    public static SubLObject generic_removal_modules() {
        return conses_high.copy_list($removal_modules_generic$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 37700L)
    public static SubLObject generic_removal_modules_for_sense(SubLObject sense) {
        return Sequences.remove(enumeration_types.inverse_sense(sense), $removal_modules_generic$.getGlobalValue(), Symbols.symbol_function(EQL), $sym154$HL_MODULE_SENSE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 37900L)
    public static SubLObject generic_removal_module_count() {
        return Sequences.length($removal_modules_generic$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 38200L)
    public static SubLObject universal_removal_modules() {
        return conses_high.copy_list($removal_modules_universal$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 38400L)
    public static SubLObject universal_removal_module_p(SubLObject v_object) {
        return makeBoolean(NIL != removal_module_p(v_object) && NIL != subl_promotions.memberP(v_object, $removal_modules_universal$.getGlobalValue(), Symbols.symbol_function(EQL), UNPROVIDED));
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 38500L)
    public static SubLObject universal_removal_module_count() {
        return Sequences.length($removal_modules_universal$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 38600L)
    public static SubLObject universal_removal_module_exception_predicates(SubLObject universal_module) {
        return list_utilities.alist_lookup($removal_modules_specific_dont_use_universal$.getGlobalValue(), universal_module, Symbols.symbol_function(EQL), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 38900L)
    public static SubLObject universal_removal_module_exception_predicateP(SubLObject universal_module, SubLObject predicate) {
        return subl_promotions.memberP(predicate, universal_removal_module_exception_predicates(universal_module), UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 39100L)
    public static SubLObject predicate_doesnt_use_universal_removal_moduleP(SubLObject predicate, SubLObject universal_module) {
        if (NIL != forts.fort_p(predicate) && NIL == universal_removal_module_exception_predicateP(universal_module, predicate)) {
            return NIL;
        }
        return T;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 39500L)
    public static SubLObject universal_removal_modules_for_sense(SubLObject sense) {
        return Sequences.remove(enumeration_types.inverse_sense(sense), $removal_modules_universal$.getGlobalValue(), Symbols.symbol_function(EQL), $sym154$HL_MODULE_SENSE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 40000L)
    public static SubLObject removal_modules_specific(SubLObject predicate) {
        assert NIL != forts.fort_p(predicate) : predicate;
        return conses_high.copy_list(Hashtables.gethash_without_values(predicate, $removal_modules_specific$.getGlobalValue(), NIL));
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 40200L)
    public static SubLObject predicate_has_specific_removal_modulesP(SubLObject predicate) {
        return list_utilities.sublisp_boolean(Hashtables.gethash_without_values(predicate, $removal_modules_specific$.getGlobalValue(), NIL));
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 40400L)
    public static SubLObject removal_modules_specific_for_sense(SubLObject predicate, SubLObject sense) {
        assert NIL != forts.fort_p(predicate) : predicate;
        return Sequences.remove(enumeration_types.inverse_sense(sense), Hashtables.gethash_without_values(predicate, $removal_modules_specific$.getGlobalValue(), NIL), Symbols.symbol_function(EQL), $sym154$HL_MODULE_SENSE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 40700L)
    public static SubLObject removal_modules_universal_for_predicate_and_sense(SubLObject predicate, SubLObject sense) {
        assert NIL != forts.fort_p(predicate) : predicate;
        SubLObject universal_modules = NIL;
        SubLObject cdolist_list_var = universal_removal_modules_for_sense(sense);
        SubLObject universal_module = NIL;
        universal_module = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == predicate_doesnt_use_universal_removal_moduleP(predicate, universal_module)) {
                universal_modules = cons(universal_module, universal_modules);
            }
            cdolist_list_var = cdolist_list_var.rest();
            universal_module = cdolist_list_var.first();
        }
        return Sequences.nreverse(universal_modules);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 41300L)
    public static SubLObject predicates_with_specific_removal_modules() {
        return hash_table_utilities.hash_table_keys($removal_modules_specific$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 41500L)
    public static SubLObject specific_removal_modules() {
        return set.set_element_list(specific_removal_module_set());
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 41600L)
    public static SubLObject specific_removal_module_count() {
        return set.set_size(specific_removal_module_set());
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 41700L)
    public static SubLObject specific_removal_module_set() {
        SubLObject v_set = set.new_set(EQL, removal_module_count());
        SubLObject pred = NIL;
        SubLObject hl_module_list = NIL;
        Iterator cdohash_iterator = Hashtables.getEntrySetIterator($removal_modules_specific$.getGlobalValue());
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                pred = Hashtables.getEntryKey(cdohash_entry);
                SubLObject cdolist_list_var;
                hl_module_list = (cdolist_list_var = Hashtables.getEntryValue(cdohash_entry));
                SubLObject hl_module = NIL;
                hl_module = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL == generic_removal_module_p(hl_module)) {
                        set.set_add(hl_module, v_set);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    hl_module = cdolist_list_var.first();
                }
            }
        } finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return v_set;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 42700L)
    public static SubLObject clear_solely_specific_removal_module_predicate_store() {
        set.clear_set($solely_specific_removal_module_predicate_store$.getGlobalValue());
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 42900L)
    public static SubLObject rebuild_solely_specific_removal_module_predicate_store() {
        return set.set_rebuild($solely_specific_removal_module_predicate_store$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 43000L)
    public static SubLObject register_solely_specific_removal_module_predicate(SubLObject predicate) {
        return set.set_add(predicate, $solely_specific_removal_module_predicate_store$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 43300L)
    public static SubLObject deregister_solely_specific_removal_module_predicate(SubLObject predicate) {
        return set.set_remove(predicate, $solely_specific_removal_module_predicate_store$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 43500L)
    public static SubLObject solely_specific_removal_module_predicateP(SubLObject predicate) {
        return set.set_memberP(predicate, $solely_specific_removal_module_predicate_store$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 43700L)
    public static SubLObject inference_removal_module(SubLObject name, SubLObject plist) {
        SubLObject strengthened_plist = strengthen_removal_module_properties(name, plist);
        SubLObject hl_module = setup_module(name, $REMOVAL, strengthened_plist);
        set.set_add(hl_module, $removal_modules$.getGlobalValue());
        classify_removal_module(hl_module);
        return hl_module;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 44300L)
    public static SubLObject inference_removal_module_use_generic(SubLObject predicate, SubLObject name) {
        SubLObject hl_module = find_hl_module_by_name(name);
        if (NIL != hl_module) {
            SubLObject existing = conses_high.assoc(hl_module, $removal_modules_specific_use_generic$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
            if (NIL == existing) {
                existing = list(hl_module);
                $removal_modules_specific_use_generic$.setGlobalValue(cons(existing, $removal_modules_specific_use_generic$.getGlobalValue()));
            }
            rplacd(existing, conses_high.adjoin(predicate, existing.rest(), UNPROVIDED, UNPROVIDED));
            return inference_removal_module_note_specific(predicate, hl_module);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 44800L)
    public static SubLObject inference_removal_module_use_meta_removal(SubLObject predicate, SubLObject name) {
        SubLObject hl_module = find_hl_module_by_name(name);
        if (NIL != hl_module) {
            SubLObject existing = conses_high.assoc(hl_module, $removal_modules_specific_use_meta_removal$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
            if (NIL == existing) {
                existing = list(hl_module);
                $removal_modules_specific_use_meta_removal$.setGlobalValue(cons(existing, $removal_modules_specific_use_meta_removal$.getGlobalValue()));
            }
            rplacd(existing, conses_high.adjoin(predicate, existing.rest(), UNPROVIDED, UNPROVIDED));
            return hl_module;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 45300L)
    public static SubLObject inference_removal_module_dont_use_universal(SubLObject predicate, SubLObject name) {
        SubLObject hl_module = find_hl_module_by_name(name);
        if (NIL != hl_module) {
            SubLObject existing = conses_high.assoc(hl_module, $removal_modules_specific_dont_use_universal$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
            if (NIL == existing) {
                existing = list(hl_module);
                $removal_modules_specific_dont_use_universal$.setGlobalValue(cons(existing, $removal_modules_specific_dont_use_universal$.getGlobalValue()));
            }
            rplacd(existing, conses_high.adjoin(predicate, existing.rest(), UNPROVIDED, UNPROVIDED));
            return hl_module;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 45900L)
    public static SubLObject redeclare_inference_removal_module(SubLObject name) {
        SubLObject hl_module = find_hl_module_by_name(name);
        if (NIL != hl_module) {
            set.set_add(hl_module, $removal_modules$.getGlobalValue());
            classify_removal_module(hl_module);
            return hl_module;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 46300L)
    public static SubLObject strengthen_removal_module_properties(SubLObject name, SubLObject plist) {
        plist = conses_high.copy_tree(plist);
        SubLObject pcase_var;
        SubLObject sense = pcase_var = conses_high.getf(plist, $SENSE, UNPROVIDED);
        if (!pcase_var.eql($POS)) {
            if (!pcase_var.eql($NEG)) {
                Errors.error($str166$removal_module__S_must_have_a__SE, name);
            }
        }
        return plist;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 46600L)
    public static SubLObject undeclare_inference_removal_module(SubLObject name, SubLObject reclassifyP) {
        if (reclassifyP == UNPROVIDED) {
            reclassifyP = T;
        }
        SubLObject hl_module = find_hl_module_by_name(name);
        if (NIL != hl_module) {
            remove_hl_module(hl_module);
            set.set_remove(hl_module, $removal_modules$.getGlobalValue());
            $removal_modules_generic$.setGlobalValue(Sequences.remove(hl_module, $removal_modules_generic$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            $removal_modules_universal$.setGlobalValue(Sequences.remove(hl_module, $removal_modules_universal$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            $removal_modules_specific_use_generic$.setGlobalValue(Sequences.delete(hl_module, $removal_modules_specific_use_generic$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function($sym167$CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED));
            $removal_modules_specific_use_meta_removal$.setGlobalValue(Sequences.delete(hl_module, $removal_modules_specific_use_meta_removal$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function($sym167$CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED));
            $removal_modules_specific_dont_use_universal$.setGlobalValue(Sequences.delete(hl_module, $removal_modules_specific_dont_use_universal$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function($sym167$CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED));
            if (NIL != reclassifyP) {
                reclassify_removal_modules();
            }
            return hl_module;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 47700L)
    public static SubLObject undeclare_inference_meta_removal_module(SubLObject name) {
        SubLObject hl_module = find_hl_module_by_name(name);
        if (NIL != hl_module) {
            remove_hl_module(hl_module);
            set.set_remove(hl_module, $meta_removal_modules$.getGlobalValue());
        }
        return hl_module;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 48000L)
    public static SubLObject undeclare_inference_removal_module_use_generic(SubLObject predicate, SubLObject name, SubLObject reclassifyP) {
        if (reclassifyP == UNPROVIDED) {
            reclassifyP = NIL;
        }
        SubLObject hl_module = find_hl_module_by_name(name);
        if (NIL != hl_module) {
            SubLObject existing = conses_high.assoc(hl_module, $removal_modules_specific_use_generic$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
            if (NIL != existing) {
                rplacd(existing, Sequences.delete(predicate, existing.rest(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                if (NIL == existing.rest()) {
                    $removal_modules_specific_use_generic$.setGlobalValue(Sequences.delete(existing, $removal_modules_specific_use_generic$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                }
            }
            if (NIL != reclassifyP) {
                reclassify_removal_modules();
            }
            return hl_module;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 48600L)
    public static SubLObject undeclare_inference_removal_module_use_meta_removal(SubLObject predicate, SubLObject name, SubLObject reclassifyP) {
        if (reclassifyP == UNPROVIDED) {
            reclassifyP = NIL;
        }
        SubLObject hl_module = find_hl_module_by_name(name);
        if (NIL != hl_module) {
            SubLObject existing = conses_high.assoc(hl_module, $removal_modules_specific_use_meta_removal$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
            if (NIL != existing) {
                rplacd(existing, Sequences.delete(predicate, existing.rest(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                if (NIL == existing.rest()) {
                    $removal_modules_specific_use_meta_removal$.setGlobalValue(Sequences.delete(existing, $removal_modules_specific_use_meta_removal$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                }
            }
            if (NIL != reclassifyP) {
                reclassify_removal_modules();
            }
            return hl_module;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 49300L)
    public static SubLObject undeclare_inference_removal_module_dont_use_universal(SubLObject predicate, SubLObject name, SubLObject reclassifyP) {
        if (reclassifyP == UNPROVIDED) {
            reclassifyP = NIL;
        }
        SubLObject hl_module = find_hl_module_by_name(name);
        if (NIL != hl_module) {
            SubLObject existing = conses_high.assoc(hl_module, $removal_modules_specific_dont_use_universal$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
            if (NIL != existing) {
                rplacd(existing, Sequences.delete(predicate, existing.rest(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                if (NIL == existing.rest()) {
                    $removal_modules_specific_dont_use_universal$.setGlobalValue(Sequences.delete(existing, $removal_modules_specific_dont_use_universal$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                }
            }
            if (NIL != reclassifyP) {
                reclassify_removal_modules();
            }
            return hl_module;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 49900L)
    public static SubLObject reclassify_removal_modules() {
        SubLThread thread = SubLProcess.currentSubLThread();
        clear_removal_modules();
        rebuild_solely_specific_removal_module_predicate_store();
        SubLObject local_state;
        SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                SubLObject cdolist_list_var = $removal_modules_specific_use_generic$.getGlobalValue();
                SubLObject generic_info = NIL;
                generic_info = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject current;
                    SubLObject datum = current = generic_info;
                    SubLObject hl_module = NIL;
                    SubLObject predicates = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list168);
                    hl_module = current.first();
                    current = current.rest();
                    SubLObject cdolist_list_var_$3;
                    predicates = (cdolist_list_var_$3 = current);
                    SubLObject predicate = NIL;
                    predicate = cdolist_list_var_$3.first();
                    while (NIL != cdolist_list_var_$3) {
                        inference_removal_module_note_specific(predicate, hl_module);
                        cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                        predicate = cdolist_list_var_$3.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    generic_info = cdolist_list_var.first();
                }
                SubLObject set_var = removal_modules();
                SubLObject set_contents_var = set.do_set_internal(set_var);
                SubLObject basis_object;
                SubLObject state_$4;
                SubLObject hl_module2;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state_$4 = NIL, state_$4 = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                        state_$4); state_$4 = set_contents.do_set_contents_update_state(state_$4)) {
                    hl_module2 = set_contents.do_set_contents_next(basis_object, state_$4);
                    if (NIL != set_contents.do_set_contents_element_validP(state_$4, hl_module2)) {
                        classify_removal_module(hl_module2);
                    }
                }
                preference_modules.reclassify_preference_modules();
            } finally {
                SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                    SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                } finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 50600L)
    public static SubLObject clear_removal_modules() {
        Hashtables.clrhash($removal_modules_specific$.getGlobalValue());
        $removal_modules_external$.setGlobalValue(NIL);
        $removal_modules_generic$.setGlobalValue(NIL);
        $removal_modules_universal$.setGlobalValue(NIL);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 51000L)
    public static SubLObject classify_removal_module(SubLObject hl_module) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != hl_module_externalP(hl_module)) {
            if (NIL != $classify_removal_modules_with_deterministic_sortP$.getDynamicValue(thread)) {
                $removal_modules_external$.setGlobalValue(list_utilities.sort_adjoin(hl_module, $removal_modules_external$.getGlobalValue(), EQL, $sym169$INFERENCE_REMOVAL_MODULE__FOR_CLASSIFICATION, IDENTITY));
            } else if (NIL == conses_high.member(hl_module, $removal_modules_external$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY))) {
                $removal_modules_external$.setGlobalValue(cons(hl_module, $removal_modules_external$.getGlobalValue()));
            }
        } else {
            SubLObject predicate_spec = hl_module_predicate(hl_module);
            SubLObject universalP = hl_module_universal(hl_module);
            if (NIL != universalP) {
                if (NIL != $classify_removal_modules_with_deterministic_sortP$.getDynamicValue(thread)) {
                    $removal_modules_universal$.setGlobalValue(list_utilities.sort_adjoin(hl_module, $removal_modules_universal$.getGlobalValue(), EQL, $sym169$INFERENCE_REMOVAL_MODULE__FOR_CLASSIFICATION, IDENTITY));
                } else if (NIL == conses_high.member(hl_module, $removal_modules_universal$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY))) {
                    $removal_modules_universal$.setGlobalValue(cons(hl_module, $removal_modules_universal$.getGlobalValue()));
                }
            } else if (NIL == predicate_spec) {
                if (NIL != $classify_removal_modules_with_deterministic_sortP$.getDynamicValue(thread)) {
                    $removal_modules_generic$.setGlobalValue(list_utilities.sort_adjoin(hl_module, $removal_modules_generic$.getGlobalValue(), EQL, $sym169$INFERENCE_REMOVAL_MODULE__FOR_CLASSIFICATION, IDENTITY));
                } else if (NIL == conses_high.member(hl_module, $removal_modules_generic$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY))) {
                    $removal_modules_generic$.setGlobalValue(cons(hl_module, $removal_modules_generic$.getGlobalValue()));
                }
            } else if (predicate_spec.isAtom()) {
                inference_removal_module_note_specific(predicate_spec, hl_module);
            } else {
                SubLObject cdolist_list_var = predicate_spec;
                SubLObject predicate = NIL;
                predicate = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    inference_removal_module_note_specific(predicate, hl_module);
                    cdolist_list_var = cdolist_list_var.rest();
                    predicate = cdolist_list_var.first();
                }
            }
        }
        return hl_module;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 52300L)
    public static SubLObject inference_removal_module_note_specific(SubLObject predicate, SubLObject hl_module) {
        SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.sethash(predicate, $removal_modules_specific$.getGlobalValue(),
                (NIL != $classify_removal_modules_with_deterministic_sortP$.getDynamicValue(thread)) ? list_utilities.sort_adjoin(hl_module, Hashtables.gethash(predicate, $removal_modules_specific$.getGlobalValue(), NIL), EQL, $sym169$INFERENCE_REMOVAL_MODULE__FOR_CLASSIFICATION, IDENTITY)
                        : conses_high.adjoin(hl_module, Hashtables.gethash(predicate, $removal_modules_specific$.getGlobalValue(), NIL), UNPROVIDED, UNPROVIDED));
        return hl_module;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 52700L)
    public static SubLObject inference_removal_moduleL_for_classification(SubLObject module1, SubLObject module2) {
        SubLObject module1_specific_use_genericP = removal_module_specific_use_genericP(module1);
        SubLObject module2_specific_use_genericP = removal_module_specific_use_genericP(module2);
        if (NIL != module1_specific_use_genericP && NIL == module2_specific_use_genericP) {
            return NIL;
        }
        if (NIL == module1_specific_use_genericP && NIL != module2_specific_use_genericP) {
            return T;
        }
        SubLObject name1 = Symbols.symbol_name(hl_module_name(module1));
        SubLObject name2 = Symbols.symbol_name(hl_module_name(module2));
        SubLObject name1_length = Sequences.length(name1);
        SubLObject name2_length = Sequences.length(name2);
        if (name1_length.numL(name2_length)) {
            return T;
        }
        if (name1_length.numG(name2_length)) {
            return NIL;
        }
        return Strings.stringL(name1, name2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 53500L)
    public static SubLObject removal_module_specific_use_genericP_internal(SubLObject module) {
        return conses_high.assoc(module, $removal_modules_specific_use_generic$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 53500L)
    public static SubLObject removal_module_specific_use_genericP(SubLObject module) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return removal_module_specific_use_genericP_internal(module);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym170$REMOVAL_MODULE_SPECIFIC_USE_GENERIC_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym170$REMOVAL_MODULE_SPECIFIC_USE_GENERIC_, ONE_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym170$REMOVAL_MODULE_SPECIFIC_USE_GENERIC_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, module, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(removal_module_specific_use_genericP_internal(module)));
            memoization_state.caching_state_put(caching_state, module, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 53900L)
    public static SubLObject inference_removal_pruning_module(SubLObject name, SubLObject plist) {
        SubLObject removal_plist = list_utilities.merge_plist(plist, $removal_pruning_module_properties$.getGlobalValue());
        SubLObject subtypes = conses_high.adjoin($PRUNING, conses_high.getf(plist, $MODULE_SUBTYPE, NIL), UNPROVIDED, UNPROVIDED);
        removal_plist = conses_high.putf(removal_plist, $MODULE_SUBTYPE, subtypes);
        return inference_removal_module(name, removal_plist);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 54300L)
    public static SubLObject removal_pruning_moduleP(SubLObject v_object) {
        return makeBoolean(NIL != removal_module_p(v_object) && NIL != list_utilities.member_eqP($PRUNING, hl_module_subtypes(v_object)));
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 54600L)
    public static SubLObject do_conjunctive_removal_modules(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list174);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject module = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list174);
        module = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$6 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list174);
            current_$6 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list174);
            if (NIL == conses_high.member(current_$6, $list87, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$6 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list174);
        }
        SubLObject done_tail = cdestructuring_bind.property_list_member($DONE, current);
        SubLObject done = (NIL != done_tail) ? conses_high.cadr(done_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        return listS($sym148$DO_SET, list(module, $list175, $DONE, done), append(body, NIL));
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 54900L)
    public static SubLObject removal_modules_conjunctive() {
        return $conjunctive_removal_modules$.getGlobalValue();
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 55100L)
    public static SubLObject conjunctive_removal_module_p(SubLObject v_object) {
        return set.set_memberP(v_object, $conjunctive_removal_modules$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 55200L)
    public static SubLObject conjunctive_removal_module_count() {
        return set.set_size($conjunctive_removal_modules$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 55300L)
    public static SubLObject conjunctive_removal_modules() {
        SubLObject v_modules = NIL;
        SubLObject set_var = removal_modules_conjunctive();
        SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject module;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            module = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, module)) {
                v_modules = cons(module, v_modules);
            }
        }
        return v_modules;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 55600L)
    public static SubLObject inference_conjunctive_removal_module(SubLObject name, SubLObject plist) {
        SubLObject hl_module = setup_module(name, $REMOVAL_CONJUNCTIVE, plist);
        set.set_add(hl_module, $conjunctive_removal_modules$.getGlobalValue());
        return hl_module;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 57500L)
    public static SubLObject undeclare_inference_conjunctive_removal_module(SubLObject name) {
        SubLObject hl_module = find_hl_module_by_name(name);
        if (NIL != hl_module_p(hl_module)) {
            remove_hl_module(hl_module);
            return set.set_remove(hl_module, $conjunctive_removal_modules$.getGlobalValue());
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 57900L)
    public static SubLObject do_meta_removal_modules(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list147);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject hl_module = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list147);
        hl_module = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$7 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list147);
            current_$7 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list147);
            if (NIL == conses_high.member(current_$7, $list87, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$7 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list147);
        }
        SubLObject done_tail = cdestructuring_bind.property_list_member($DONE, current);
        SubLObject done = (NIL != done_tail) ? conses_high.cadr(done_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        return listS($sym5$DO_LIST, list(hl_module, $list179, $DONE, done), append(body, NIL));
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 58000L)
    public static SubLObject meta_removal_modules() {
        return $meta_removal_modules$.getGlobalValue();
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 58200L)
    public static SubLObject meta_removal_module_list() {
        return conses_high.copy_list($meta_removal_modules$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 58200L)
    public static SubLObject meta_removal_module_p(SubLObject v_object) {
        SubLObject cdolist_list_var = meta_removal_modules();
        SubLObject module = NIL;
        module = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (v_object.eql(module)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            module = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 58400L)
    public static SubLObject meta_removal_module_count() {
        return Sequences.length($meta_removal_modules$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 58500L)
    public static SubLObject meta_removal_module_specific_predicates(SubLObject meta_removal_module) {
        return list_utilities.alist_lookup($removal_modules_specific_use_meta_removal$.getGlobalValue(), meta_removal_module, Symbols.symbol_function(EQL), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 58700L)
    public static SubLObject meta_removal_module_specific_predicateP(SubLObject meta_removal_module, SubLObject predicate) {
        return subl_promotions.memberP(predicate, meta_removal_module_specific_predicates(meta_removal_module), UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 58900L)
    public static SubLObject predicate_uses_meta_removal_moduleP(SubLObject predicate, SubLObject meta_removal_module) {
        if (NIL != forts.fort_p(predicate) && NIL != solely_specific_removal_module_predicateP(predicate) && NIL == meta_removal_module_specific_predicateP(meta_removal_module, predicate)) {
            return NIL;
        }
        return T;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 59400L)
    public static SubLObject inference_meta_removal_module(SubLObject name, SubLObject plist) {
        if (plist == UNPROVIDED) {
            plist = NIL;
        }
        SubLObject item_var;
        SubLObject hl_module = item_var = setup_module(name, $META_REMOVAL, plist);
        if (NIL == conses_high.member(item_var, $meta_removal_modules$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY))) {
            $meta_removal_modules$.setGlobalValue(cons(item_var, $meta_removal_modules$.getGlobalValue()));
        }
        return hl_module;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 59800L)
    public static SubLObject removal_proof_module_p(SubLObject hl_module) {
        return makeBoolean(NIL != removal_module_p(hl_module) || NIL != conjunctive_removal_module_p(hl_module));
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 60500L)
    public static SubLObject do_transformation_modules(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list147);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject hl_module = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list147);
        hl_module = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$8 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list147);
            current_$8 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list147);
            if (NIL == conses_high.member(current_$8, $list87, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$8 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list147);
        }
        SubLObject done_tail = cdestructuring_bind.property_list_member($DONE, current);
        SubLObject done = (NIL != done_tail) ? conses_high.cadr(done_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        return listS($sym5$DO_LIST, list(hl_module, $list184, $DONE, done), append(body, NIL));
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 60600L)
    public static SubLObject transformation_modules() {
        return $transformation_modules$.getGlobalValue();
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 60700L)
    public static SubLObject transformation_module_p(SubLObject v_object) {
        return subl_promotions.memberP(v_object, $transformation_modules$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 60800L)
    public static SubLObject transformation_module_count() {
        return Sequences.length($transformation_modules$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 60900L)
    public static SubLObject inference_transformation_module(SubLObject name, SubLObject plist) {
        SubLObject item_var;
        SubLObject hl_module = item_var = setup_module(name, $TRANSFORMATION, plist);
        if (NIL == conses_high.member(item_var, $transformation_modules$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY))) {
            $transformation_modules$.setGlobalValue(cons(item_var, $transformation_modules$.getGlobalValue()));
        }
        return hl_module;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 61600L)
    public static SubLObject do_meta_transformation_modules(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list147);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject hl_module = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list147);
        hl_module = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$9 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list147);
            current_$9 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list147);
            if (NIL == conses_high.member(current_$9, $list87, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$9 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list147);
        }
        SubLObject done_tail = cdestructuring_bind.property_list_member($DONE, current);
        SubLObject done = (NIL != done_tail) ? conses_high.cadr(done_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        return listS($sym5$DO_LIST, list(hl_module, $list189, $DONE, done), append(body, NIL));
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 61800L)
    public static SubLObject meta_transformation_modules() {
        return $meta_transformation_modules$.getGlobalValue();
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 61900L)
    public static SubLObject meta_transformation_module_p(SubLObject v_object) {
        return subl_promotions.memberP(v_object, $meta_transformation_modules$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 62000L)
    public static SubLObject meta_transformation_module_count() {
        return Sequences.length($meta_transformation_modules$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 62100L)
    public static SubLObject inference_meta_transformation_module(SubLObject name, SubLObject plist) {
        if (plist == UNPROVIDED) {
            plist = NIL;
        }
        SubLObject item_var;
        SubLObject hl_module = item_var = setup_module(name, $META_TRANSFORMATION, plist);
        if (NIL == conses_high.member(item_var, $meta_transformation_modules$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY))) {
            $meta_transformation_modules$.setGlobalValue(cons(item_var, $meta_transformation_modules$.getGlobalValue()));
        }
        return hl_module;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 62600L)
    public static SubLObject do_rewrite_modules(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list174);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject module = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list174);
        module = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$10 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list174);
            current_$10 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list174);
            if (NIL == conses_high.member(current_$10, $list87, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$10 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list174);
        }
        SubLObject done_tail = cdestructuring_bind.property_list_member($DONE, current);
        SubLObject done = (NIL != done_tail) ? conses_high.cadr(done_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        return listS($sym5$DO_LIST, list(module, $list194, $DONE, done), append(body, NIL));
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 62800L)
    public static SubLObject rewrite_modules() {
        return conses_high.copy_list($rewrite_modules$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 62900L)
    public static SubLObject rewrite_module_p(SubLObject v_object) {
        return subl_promotions.memberP(v_object, $rewrite_modules$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 63000L)
    public static SubLObject rewrite_module_count() {
        return Sequences.length($rewrite_modules$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 63000L)
    public static SubLObject rewrite_module_support(SubLObject module) {
        SubLObject support_spec = hl_module_property_without_values(module, $REWRITE_SUPPORT);
        if (support_spec.isSymbol()) {
            return Symbols.symbol_value(support_spec);
        }
        return support_spec;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 63300L)
    public static SubLObject rewrite_module_closure(SubLObject module) {
        return hl_module_property_without_values(module, $REWRITE_CLOSURE);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 63600L)
    public static SubLObject inference_rewrite_module(SubLObject name, SubLObject plist) {
        SubLObject strengthened_plist = strengthen_rewrite_module_properties(name, plist);
        SubLObject item_var;
        SubLObject hl_module = item_var = setup_module(name, $REWRITE, strengthened_plist);
        if (NIL == conses_high.member(item_var, $rewrite_modules$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY))) {
            $rewrite_modules$.setGlobalValue(cons(item_var, $rewrite_modules$.getGlobalValue()));
        }
        return hl_module;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 63900L)
    public static SubLObject undeclare_rewrite_module(SubLObject hl_module) {
        return deregister_rewrite_module(hl_module);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 64000L)
    public static SubLObject undeclare_rewrite_module_by_name(SubLObject name) {
        return deregister_rewrite_module_by_name(name);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 64100L)
    public static SubLObject deregister_rewrite_module(SubLObject module) {
        remove_hl_module(module);
        $rewrite_modules$.setGlobalValue(Sequences.remove(module, $rewrite_modules$.getGlobalValue(), Symbols.symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return module;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 64400L)
    public static SubLObject deregister_rewrite_module_by_name(SubLObject name) {
        SubLObject module = find_hl_module_by_name(name);
        return deregister_rewrite_module(module);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 64600L)
    public static SubLObject strengthen_rewrite_module_properties(SubLObject name, SubLObject plist) {
        plist = conses_high.copy_tree(plist);
        SubLObject pcase_var;
        SubLObject sense = pcase_var = conses_high.getf(plist, $SENSE, UNPROVIDED);
        if (!pcase_var.eql($POS)) {
            if (!pcase_var.eql($NEG)) {
                Errors.error($str198$rewrite_module__S_must_have_a__SE, name);
            }
        }
        return plist;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 65300L)
    public static SubLObject structural_module_p(SubLObject v_object) {
        return subl_promotions.memberP(v_object, $structural_modules$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 65400L)
    public static SubLObject inference_structural_module(SubLObject name, SubLObject plist) {
        if (plist == UNPROVIDED) {
            plist = NIL;
        }
        SubLObject item_var;
        SubLObject hl_module = item_var = setup_module(name, $STRUCTURAL, plist);
        if (NIL == conses_high.member(item_var, $structural_modules$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY))) {
            $structural_modules$.setGlobalValue(cons(item_var, $structural_modules$.getGlobalValue()));
        }
        return hl_module;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 65600L)
    public static SubLObject structural_module_count() {
        return Sequences.length($structural_modules$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 66000L)
    public static SubLObject do_meta_structural_modules(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list147);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject hl_module = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list147);
        hl_module = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$11 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list147);
            current_$11 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list147);
            if (NIL == conses_high.member(current_$11, $list87, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$11 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list147);
        }
        SubLObject done_tail = cdestructuring_bind.property_list_member($DONE, current);
        SubLObject done = (NIL != done_tail) ? conses_high.cadr(done_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        return listS($sym5$DO_LIST, list(hl_module, $list202, $DONE, done), append(body, NIL));
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 66200L)
    public static SubLObject meta_structural_modules() {
        return $meta_structural_modules$.getGlobalValue();
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 66300L)
    public static SubLObject meta_structural_module_p(SubLObject v_object) {
        return subl_promotions.memberP(v_object, $meta_structural_modules$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 66400L)
    public static SubLObject meta_structural_module_count() {
        return Sequences.length($meta_structural_modules$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 66500L)
    public static SubLObject inference_meta_structural_module(SubLObject name, SubLObject plist) {
        if (plist == UNPROVIDED) {
            plist = NIL;
        }
        SubLObject item_var;
        SubLObject hl_module = item_var = setup_module(name, $META_STRUCTURAL, plist);
        if (NIL == conses_high.member(item_var, $meta_structural_modules$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY))) {
            $meta_structural_modules$.setGlobalValue(cons(item_var, $meta_structural_modules$.getGlobalValue()));
        }
        return hl_module;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 66900L)
    public static SubLObject cfasl_output_object_hl_module_method(SubLObject v_object, SubLObject stream) {
        return cfasl_wide_output_hl_module(v_object, stream);
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 67000L)
    public static SubLObject cfasl_wide_output_hl_module(SubLObject hl_module, SubLObject stream) {
        cfasl.cfasl_output_wide_opcode($cfasl_wide_opcode_hl_module$.getGlobalValue(), stream);
        cfasl_output_hl_module_internal(hl_module, stream);
        return hl_module;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 67200L)
    public static SubLObject cfasl_output_hl_module_internal(SubLObject hl_module, SubLObject stream) {
        cfasl.cfasl_output(hl_module_name(hl_module), stream);
        cfasl.cfasl_output(hl_module_plist(hl_module), stream);
        return hl_module;
    }

    @SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 67400L)
    public static SubLObject cfasl_input_hl_module(SubLObject stream) {
        SubLObject name = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        SubLObject plist = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        return new_hl_module(name, plist);
    }

    public static SubLObject declare_inference_modules_file() {
        declareFunction("hl_module_property_p", "HL-MODULE-PROPERTY-P", 1, 0, false);
        declareMacro("do_hl_module_properties", "DO-HL-MODULE-PROPERTIES");
        declareFunction("hl_module_properties", "HL-MODULE-PROPERTIES", 0, 0, false);
        declareFunction("removal_module_plist_indicators", "REMOVAL-MODULE-PLIST-INDICATORS", 0, 0, false);
        declareFunction("hl_module_subtype_p", "HL-MODULE-SUBTYPE-P", 1, 0, false);
        declareFunction("allowed_modules_spec_p", "ALLOWED-MODULES-SPEC-P", 1, 0, false);
        new $allowed_modules_spec_p$UnaryFunction();
        declareFunction("non_universal_allowed_modules_spec_p", "NON-UNIVERSAL-ALLOWED-MODULES-SPEC-P", 1, 0, false);
        declareFunction("disjunctive_allowed_modules_spec_p", "DISJUNCTIVE-ALLOWED-MODULES-SPEC-P", 1, 0, false);
        declareFunction("conjunctive_allowed_modules_spec_p", "CONJUNCTIVE-ALLOWED-MODULES-SPEC-P", 1, 0, false);
        declareFunction("negated_allowed_modules_spec_p", "NEGATED-ALLOWED-MODULES-SPEC-P", 1, 0, false);
        declareFunction("hl_module_type_spec_p", "HL-MODULE-TYPE-SPEC-P", 1, 0, false);
        declareFunction("hl_module_subtype_spec_p", "HL-MODULE-SUBTYPE-SPEC-P", 1, 0, false);
        declareFunction("property_allowed_modules_spec_p", "PROPERTY-ALLOWED-MODULES-SPEC-P", 1, 0, false);
        declareFunction("hl_module_allowedP", "HL-MODULE-ALLOWED?", 2, 0, false);
        declareFunction("hl_module_allowed_by_allowed_modules_specP", "HL-MODULE-ALLOWED-BY-ALLOWED-MODULES-SPEC?", 2, 0, false);
        declareFunction("simple_allowed_modules_spec_p", "SIMPLE-ALLOWED-MODULES-SPEC-P", 1, 0, false);
        declareFunction("get_modules_from_simple_allowed_modules_spec", "GET-MODULES-FROM-SIMPLE-ALLOWED-MODULES-SPEC", 1, 0, false);
        declareFunction("hl_module_print_function_trampoline", "HL-MODULE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("hl_module_p", "HL-MODULE-P", 1, 0, false);
        new $hl_module_p$UnaryFunction();
        declareFunction("hl_mod_name", "HL-MOD-NAME", 1, 0, false);
        declareFunction("hl_mod_plist", "HL-MOD-PLIST", 1, 0, false);
        declareFunction("hl_mod_sense", "HL-MOD-SENSE", 1, 0, false);
        declareFunction("hl_mod_predicate", "HL-MOD-PREDICATE", 1, 0, false);
        declareFunction("hl_mod_any_predicates", "HL-MOD-ANY-PREDICATES", 1, 0, false);
        declareFunction("hl_mod_arity", "HL-MOD-ARITY", 1, 0, false);
        declareFunction("hl_mod_direction", "HL-MOD-DIRECTION", 1, 0, false);
        declareFunction("hl_mod_required_pattern", "HL-MOD-REQUIRED-PATTERN", 1, 0, false);
        declareFunction("hl_mod_required_mt", "HL-MOD-REQUIRED-MT", 1, 0, false);
        declareFunction("hl_mod_exclusive_func", "HL-MOD-EXCLUSIVE-FUNC", 1, 0, false);
        declareFunction("hl_mod_required_func", "HL-MOD-REQUIRED-FUNC", 1, 0, false);
        declareFunction("hl_mod_completeness", "HL-MOD-COMPLETENESS", 1, 0, false);
        declareFunction("_csetf_hl_mod_name", "_CSETF-HL-MOD-NAME", 2, 0, false);
        declareFunction("_csetf_hl_mod_plist", "_CSETF-HL-MOD-PLIST", 2, 0, false);
        declareFunction("_csetf_hl_mod_sense", "_CSETF-HL-MOD-SENSE", 2, 0, false);
        declareFunction("_csetf_hl_mod_predicate", "_CSETF-HL-MOD-PREDICATE", 2, 0, false);
        declareFunction("_csetf_hl_mod_any_predicates", "_CSETF-HL-MOD-ANY-PREDICATES", 2, 0, false);
        declareFunction("_csetf_hl_mod_arity", "_CSETF-HL-MOD-ARITY", 2, 0, false);
        declareFunction("_csetf_hl_mod_direction", "_CSETF-HL-MOD-DIRECTION", 2, 0, false);
        declareFunction("_csetf_hl_mod_required_pattern", "_CSETF-HL-MOD-REQUIRED-PATTERN", 2, 0, false);
        declareFunction("_csetf_hl_mod_required_mt", "_CSETF-HL-MOD-REQUIRED-MT", 2, 0, false);
        declareFunction("_csetf_hl_mod_exclusive_func", "_CSETF-HL-MOD-EXCLUSIVE-FUNC", 2, 0, false);
        declareFunction("_csetf_hl_mod_required_func", "_CSETF-HL-MOD-REQUIRED-FUNC", 2, 0, false);
        declareFunction("_csetf_hl_mod_completeness", "_CSETF-HL-MOD-COMPLETENESS", 2, 0, false);
        declareFunction("make_hl_module", "MAKE-HL-MODULE", 0, 1, false);
        declareFunction("visit_defstruct_hl_module", "VISIT-DEFSTRUCT-HL-MODULE", 2, 0, false);
        declareFunction("visit_defstruct_object_hl_module_method", "VISIT-DEFSTRUCT-OBJECT-HL-MODULE-METHOD", 2, 0, false);
        declareFunction("print_hl_module", "PRINT-HL-MODULE", 3, 0, false);
        declareFunction("sxhash_hl_module_method", "SXHASH-HL-MODULE-METHOD", 1, 0, false);
        new $sxhash_hl_module_method$UnaryFunction();
        declareFunction("check_hl_module_property_list", "CHECK-HL-MODULE-PROPERTY-LIST", 1, 0, false);
        declareFunction("new_hl_module", "NEW-HL-MODULE", 2, 0, false);
        declareFunction("clear_cfasl_create_invalid_hl_module", "CLEAR-CFASL-CREATE-INVALID-HL-MODULE", 0, 0, false);
        declareFunction("remove_cfasl_create_invalid_hl_module", "REMOVE-CFASL-CREATE-INVALID-HL-MODULE", 1, 0, false);
        declareFunction("cfasl_create_invalid_hl_module_internal", "CFASL-CREATE-INVALID-HL-MODULE-INTERNAL", 1, 0, false);
        declareFunction("cfasl_create_invalid_hl_module", "CFASL-CREATE-INVALID-HL-MODULE", 1, 0, false);
        declareFunction("canonicalize_hl_module_plist", "CANONICALIZE-HL-MODULE-PLIST", 1, 0, false);
        declareFunction("allocate_hl_module", "ALLOCATE-HL-MODULE", 1, 0, false);
        declareFunction("destroy_hl_module", "DESTROY-HL-MODULE", 1, 0, false);
        declareFunction("hl_module_name", "HL-MODULE-NAME", 1, 0, false);
        declareFunction("hl_module_plist", "HL-MODULE-PLIST", 1, 0, false);
        declareFunction("hl_module_property", "HL-MODULE-PROPERTY", 2, 0, false);
        declareFunction("hl_module_property_without_values", "HL-MODULE-PROPERTY-WITHOUT-VALUES", 2, 0, false);
        declareFunction("hl_module_property_not_defaultP", "HL-MODULE-PROPERTY-NOT-DEFAULT?", 2, 0, false);
        declareMacro("do_hl_modules", "DO-HL-MODULES");
        declareFunction("hl_module_store", "HL-MODULE-STORE", 0, 0, false);
        declareFunction("find_hl_module_by_name", "FIND-HL-MODULE-BY-NAME", 1, 0, false);
        declareFunction("add_hl_module", "ADD-HL-MODULE", 1, 0, false);
        declareFunction("remove_hl_module", "REMOVE-HL-MODULE", 1, 0, false);
        declareFunction("setup_module", "SETUP-MODULE", 3, 0, false);
        declareFunction("default_cost_func", "DEFAULT-COST-FUNC", 0, 1, false);
        declareFunction("default_expand_func", "DEFAULT-EXPAND-FUNC", 0, 2, false);
        declareFunction("hl_module_type", "HL-MODULE-TYPE", 1, 0, false);
        declareFunction("hl_module_subtypes", "HL-MODULE-SUBTYPES", 1, 0, false);
        declareFunction("abductive_hl_moduleP", "ABDUCTIVE-HL-MODULE?", 1, 0, false);
        declareFunction("hl_module_universal", "HL-MODULE-UNIVERSAL", 1, 0, false);
        declareFunction("hl_module_source", "HL-MODULE-SOURCE", 1, 0, false);
        declareFunction("hl_module_sense", "HL-MODULE-SENSE", 1, 0, false);
        new $hl_module_sense$UnaryFunction();
        declareFunction("hl_module_sense_relevant_p", "HL-MODULE-SENSE-RELEVANT-P", 2, 0, false);
        declareFunction("hl_module_required_pattern", "HL-MODULE-REQUIRED-PATTERN", 1, 0, false);
        declareFunction("hl_module_required_pattern_matched_p", "HL-MODULE-REQUIRED-PATTERN-MATCHED-P", 2, 0, false);
        declareFunction("hl_module_required_mt", "HL-MODULE-REQUIRED-MT", 1, 0, false);
        declareFunction("hl_module_required_mt_result", "HL-MODULE-REQUIRED-MT-RESULT", 1, 0, false);
        declareFunction("interpret_hl_module_mt_prop", "INTERPRET-HL-MODULE-MT-PROP", 1, 0, false);
        declareFunction("hl_module_required_mt_relevantP", "HL-MODULE-REQUIRED-MT-RELEVANT?", 1, 0, false);
        declareFunction("hl_module_required_func", "HL-MODULE-REQUIRED-FUNC", 1, 0, false);
        declareFunction("hl_module_required_func_p", "HL-MODULE-REQUIRED-FUNC-P", 2, 0, false);
        declareFunction("hl_module_cost_pattern", "HL-MODULE-COST-PATTERN", 1, 0, false);
        declareFunction("hl_module_cost_expression", "HL-MODULE-COST-EXPRESSION", 1, 0, false);
        declareFunction("hl_module_cost_func", "HL-MODULE-COST-FUNC", 1, 0, false);
        declareFunction("hl_module_cost", "HL-MODULE-COST", 2, 1, false);
        declareFunction("hl_module_asent_cost", "HL-MODULE-ASENT-COST", 2, 0, false);
        declareFunction("hl_module_clause_cost", "HL-MODULE-CLAUSE-COST", 2, 0, false);
        declareFunction("hl_module_cost_pattern_result", "HL-MODULE-COST-PATTERN-RESULT", 2, 0, false);
        declareFunction("hl_module_cost_expression_result", "HL-MODULE-COST-EXPRESSION-RESULT", 1, 0, false);
        declareFunction("hl_module_cost_function_result", "HL-MODULE-COST-FUNCTION-RESULT", 2, 0, false);
        declareFunction("hl_module_asent_cost_function_result", "HL-MODULE-ASENT-COST-FUNCTION-RESULT", 2, 0, false);
        declareFunction("hl_module_clause_cost_function_result", "HL-MODULE-CLAUSE-COST-FUNCTION-RESULT", 2, 0, false);
        declareFunction("hl_module_is_checkP", "HL-MODULE-IS-CHECK?", 1, 0, false);
        declareFunction("guess_hl_module_is_checkP", "GUESS-HL-MODULE-IS-CHECK?", 1, 0, false);
        declareFunction("hl_module_rule_select_func", "HL-MODULE-RULE-SELECT-FUNC", 1, 0, false);
        declareFunction("hl_module_rule_filter_func", "HL-MODULE-RULE-FILTER-FUNC", 1, 0, false);
        declareFunction("hl_module_expand_func", "HL-MODULE-EXPAND-FUNC", 1, 0, false);
        declareFunction("default_expand_func_for_hl_module", "DEFAULT-EXPAND-FUNC-FOR-HL-MODULE", 1, 0, false);
        declareFunction("hl_module_expand_pattern", "HL-MODULE-EXPAND-PATTERN", 1, 0, false);
        declareFunction("hl_module_expand_iterative_pattern", "HL-MODULE-EXPAND-ITERATIVE-PATTERN", 1, 0, false);
        declareFunction("hl_module_predicate", "HL-MODULE-PREDICATE", 1, 0, false);
        declareFunction("hl_module_predicate_relevant_p", "HL-MODULE-PREDICATE-RELEVANT-P", 2, 0, false);
        declareFunction("hl_module_arity", "HL-MODULE-ARITY", 1, 0, false);
        declareFunction("hl_module_arity_relevant_p", "HL-MODULE-ARITY-RELEVANT-P", 2, 0, false);
        declareFunction("hl_module_exclusive_func", "HL-MODULE-EXCLUSIVE-FUNC", 1, 0, false);
        declareFunction("hl_module_supplants_info", "HL-MODULE-SUPPLANTS-INFO", 1, 0, false);
        declareFunction("hl_module_direction", "HL-MODULE-DIRECTION", 1, 0, false);
        declareFunction("hl_module_direction_relevantP", "HL-MODULE-DIRECTION-RELEVANT?", 1, 0, false);
        declareFunction("hl_module_input_extract_pattern", "HL-MODULE-INPUT-EXTRACT-PATTERN", 1, 0, false);
        declareFunction("hl_module_input_verify_pattern", "HL-MODULE-INPUT-VERIFY-PATTERN", 1, 0, false);
        declareFunction("hl_module_input_encode_pattern", "HL-MODULE-INPUT-ENCODE-PATTERN", 1, 0, false);
        declareFunction("hl_module_output_check_pattern", "HL-MODULE-OUTPUT-CHECK-PATTERN", 1, 0, false);
        declareFunction("hl_module_output_generate_pattern", "HL-MODULE-OUTPUT-GENERATE-PATTERN", 1, 0, false);
        declareFunction("hl_module_output_decode_pattern", "HL-MODULE-OUTPUT-DECODE-PATTERN", 1, 0, false);
        declareFunction("hl_module_output_verify_pattern", "HL-MODULE-OUTPUT-VERIFY-PATTERN", 1, 0, false);
        declareFunction("hl_module_output_construct_pattern", "HL-MODULE-OUTPUT-CONSTRUCT-PATTERN", 1, 0, false);
        declareFunction("hl_module_support_pattern", "HL-MODULE-SUPPORT-PATTERN", 1, 0, false);
        declareFunction("hl_module_support_func", "HL-MODULE-SUPPORT-FUNC", 1, 0, false);
        declareFunction("hl_module_support_module", "HL-MODULE-SUPPORT-MODULE", 1, 0, false);
        declareFunction("hl_module_support_mt", "HL-MODULE-SUPPORT-MT", 1, 0, false);
        declareFunction("hl_module_support_mt_result", "HL-MODULE-SUPPORT-MT-RESULT", 1, 0, false);
        declareFunction("hl_module_support_strength", "HL-MODULE-SUPPORT-STRENGTH", 1, 0, false);
        declareFunction("hl_module_every_predicates", "HL-MODULE-EVERY-PREDICATES", 1, 0, false);
        declareFunction("hl_module_applicability_func", "HL-MODULE-APPLICABILITY-FUNC", 1, 0, false);
        declareFunction("hl_module_applicability_pattern", "HL-MODULE-APPLICABILITY-PATTERN", 1, 0, false);
        declareFunction("hl_module_any_predicates", "HL-MODULE-ANY-PREDICATES", 1, 0, false);
        declareFunction("hl_module_documentation_string", "HL-MODULE-DOCUMENTATION-STRING", 1, 0, false);
        declareFunction("hl_module_example_string", "HL-MODULE-EXAMPLE-STRING", 1, 0, false);
        declareFunction("hl_module_completeP", "HL-MODULE-COMPLETE?", 2, 0, false);
        declareFunction("hl_module_incompleteP", "HL-MODULE-INCOMPLETE?", 2, 0, false);
        declareFunction("hl_module_completeness", "HL-MODULE-COMPLETENESS", 2, 1, false);
        declareFunction("hl_module_clause_completeness", "HL-MODULE-CLAUSE-COMPLETENESS", 2, 0, false);
        declareFunction("hl_module_externalP", "HL-MODULE-EXTERNAL?", 1, 0, false);
        declareFunction("hl_module_activeP", "HL-MODULE-ACTIVE?", 1, 1, false);
        declareFunction("hl_module_implementation_methods", "HL-MODULE-IMPLEMENTATION-METHODS", 1, 0, false);
        declareMacro("do_removal_modules", "DO-REMOVAL-MODULES");
        declareFunction("removal_modules", "REMOVAL-MODULES", 0, 0, false);
        declareFunction("removal_module_p", "REMOVAL-MODULE-P", 1, 0, false);
        declareFunction("removal_module_count", "REMOVAL-MODULE-COUNT", 0, 0, false);
        declareFunction("some_external_removal_modulesP", "SOME-EXTERNAL-REMOVAL-MODULES?", 0, 0, false);
        declareFunction("removal_modules_external", "REMOVAL-MODULES-EXTERNAL", 0, 0, false);
        declareFunction("generic_removal_module_p", "GENERIC-REMOVAL-MODULE-P", 1, 0, false);
        declareFunction("generic_removal_modules", "GENERIC-REMOVAL-MODULES", 0, 0, false);
        declareFunction("generic_removal_modules_for_sense", "GENERIC-REMOVAL-MODULES-FOR-SENSE", 1, 0, false);
        declareFunction("generic_removal_module_count", "GENERIC-REMOVAL-MODULE-COUNT", 0, 0, false);
        declareFunction("universal_removal_modules", "UNIVERSAL-REMOVAL-MODULES", 0, 0, false);
        declareFunction("universal_removal_module_p", "UNIVERSAL-REMOVAL-MODULE-P", 1, 0, false);
        declareFunction("universal_removal_module_count", "UNIVERSAL-REMOVAL-MODULE-COUNT", 0, 0, false);
        declareFunction("universal_removal_module_exception_predicates", "UNIVERSAL-REMOVAL-MODULE-EXCEPTION-PREDICATES", 1, 0, false);
        declareFunction("universal_removal_module_exception_predicateP", "UNIVERSAL-REMOVAL-MODULE-EXCEPTION-PREDICATE?", 2, 0, false);
        declareFunction("predicate_doesnt_use_universal_removal_moduleP", "PREDICATE-DOESNT-USE-UNIVERSAL-REMOVAL-MODULE?", 2, 0, false);
        declareFunction("universal_removal_modules_for_sense", "UNIVERSAL-REMOVAL-MODULES-FOR-SENSE", 1, 0, false);
        declareFunction("removal_modules_specific", "REMOVAL-MODULES-SPECIFIC", 1, 0, false);
        declareFunction("predicate_has_specific_removal_modulesP", "PREDICATE-HAS-SPECIFIC-REMOVAL-MODULES?", 1, 0, false);
        declareFunction("removal_modules_specific_for_sense", "REMOVAL-MODULES-SPECIFIC-FOR-SENSE", 2, 0, false);
        declareFunction("removal_modules_universal_for_predicate_and_sense", "REMOVAL-MODULES-UNIVERSAL-FOR-PREDICATE-AND-SENSE", 2, 0, false);
        declareFunction("predicates_with_specific_removal_modules", "PREDICATES-WITH-SPECIFIC-REMOVAL-MODULES", 0, 0, false);
        declareFunction("specific_removal_modules", "SPECIFIC-REMOVAL-MODULES", 0, 0, false);
        declareFunction("specific_removal_module_count", "SPECIFIC-REMOVAL-MODULE-COUNT", 0, 0, false);
        declareFunction("specific_removal_module_set", "SPECIFIC-REMOVAL-MODULE-SET", 0, 0, false);
        declareFunction("clear_solely_specific_removal_module_predicate_store", "CLEAR-SOLELY-SPECIFIC-REMOVAL-MODULE-PREDICATE-STORE", 0, 0, false);
        declareFunction("rebuild_solely_specific_removal_module_predicate_store", "REBUILD-SOLELY-SPECIFIC-REMOVAL-MODULE-PREDICATE-STORE", 0, 0, false);
        declareFunction("register_solely_specific_removal_module_predicate", "REGISTER-SOLELY-SPECIFIC-REMOVAL-MODULE-PREDICATE", 1, 0, false);
        declareFunction("deregister_solely_specific_removal_module_predicate", "DEREGISTER-SOLELY-SPECIFIC-REMOVAL-MODULE-PREDICATE", 1, 0, false);
        declareFunction("solely_specific_removal_module_predicateP", "SOLELY-SPECIFIC-REMOVAL-MODULE-PREDICATE?", 1, 0, false);
        declareFunction("inference_removal_module", "INFERENCE-REMOVAL-MODULE", 2, 0, false);
        declareFunction("inference_removal_module_use_generic", "INFERENCE-REMOVAL-MODULE-USE-GENERIC", 2, 0, false);
        declareFunction("inference_removal_module_use_meta_removal", "INFERENCE-REMOVAL-MODULE-USE-META-REMOVAL", 2, 0, false);
        declareFunction("inference_removal_module_dont_use_universal", "INFERENCE-REMOVAL-MODULE-DONT-USE-UNIVERSAL", 2, 0, false);
        declareFunction("redeclare_inference_removal_module", "REDECLARE-INFERENCE-REMOVAL-MODULE", 1, 0, false);
        declareFunction("strengthen_removal_module_properties", "STRENGTHEN-REMOVAL-MODULE-PROPERTIES", 2, 0, false);
        declareFunction("undeclare_inference_removal_module", "UNDECLARE-INFERENCE-REMOVAL-MODULE", 1, 1, false);
        declareFunction("undeclare_inference_meta_removal_module", "UNDECLARE-INFERENCE-META-REMOVAL-MODULE", 1, 0, false);
        declareFunction("undeclare_inference_removal_module_use_generic", "UNDECLARE-INFERENCE-REMOVAL-MODULE-USE-GENERIC", 2, 1, false);
        declareFunction("undeclare_inference_removal_module_use_meta_removal", "UNDECLARE-INFERENCE-REMOVAL-MODULE-USE-META-REMOVAL", 2, 1, false);
        declareFunction("undeclare_inference_removal_module_dont_use_universal", "UNDECLARE-INFERENCE-REMOVAL-MODULE-DONT-USE-UNIVERSAL", 2, 1, false);
        declareFunction("reclassify_removal_modules", "RECLASSIFY-REMOVAL-MODULES", 0, 0, false);
        declareFunction("clear_removal_modules", "CLEAR-REMOVAL-MODULES", 0, 0, false);
        declareFunction("classify_removal_module", "CLASSIFY-REMOVAL-MODULE", 1, 0, false);
        declareFunction("inference_removal_module_note_specific", "INFERENCE-REMOVAL-MODULE-NOTE-SPECIFIC", 2, 0, false);
        declareFunction("inference_removal_moduleL_for_classification", "INFERENCE-REMOVAL-MODULE<-FOR-CLASSIFICATION", 2, 0, false);
        declareFunction("removal_module_specific_use_genericP_internal", "REMOVAL-MODULE-SPECIFIC-USE-GENERIC?-INTERNAL", 1, 0, false);
        declareFunction("removal_module_specific_use_genericP", "REMOVAL-MODULE-SPECIFIC-USE-GENERIC?", 1, 0, false);
        declareFunction("inference_removal_pruning_module", "INFERENCE-REMOVAL-PRUNING-MODULE", 2, 0, false);
        declareFunction("removal_pruning_moduleP", "REMOVAL-PRUNING-MODULE?", 1, 0, false);
        declareMacro("do_conjunctive_removal_modules", "DO-CONJUNCTIVE-REMOVAL-MODULES");
        declareFunction("removal_modules_conjunctive", "REMOVAL-MODULES-CONJUNCTIVE", 0, 0, false);
        declareFunction("conjunctive_removal_module_p", "CONJUNCTIVE-REMOVAL-MODULE-P", 1, 0, false);
        declareFunction("conjunctive_removal_module_count", "CONJUNCTIVE-REMOVAL-MODULE-COUNT", 0, 0, false);
        declareFunction("conjunctive_removal_modules", "CONJUNCTIVE-REMOVAL-MODULES", 0, 0, false);
        declareFunction("inference_conjunctive_removal_module", "INFERENCE-CONJUNCTIVE-REMOVAL-MODULE", 2, 0, false);
        declareFunction("undeclare_inference_conjunctive_removal_module", "UNDECLARE-INFERENCE-CONJUNCTIVE-REMOVAL-MODULE", 1, 0, false);
        declareMacro("do_meta_removal_modules", "DO-META-REMOVAL-MODULES");
        declareFunction("meta_removal_modules", "META-REMOVAL-MODULES", 0, 0, false);
        declareFunction("meta_removal_module_list", "META-REMOVAL-MODULE-LIST", 0, 0, false);
        declareFunction("meta_removal_module_p", "META-REMOVAL-MODULE-P", 1, 0, false);
        declareFunction("meta_removal_module_count", "META-REMOVAL-MODULE-COUNT", 0, 0, false);
        declareFunction("meta_removal_module_specific_predicates", "META-REMOVAL-MODULE-SPECIFIC-PREDICATES", 1, 0, false);
        declareFunction("meta_removal_module_specific_predicateP", "META-REMOVAL-MODULE-SPECIFIC-PREDICATE?", 2, 0, false);
        declareFunction("predicate_uses_meta_removal_moduleP", "PREDICATE-USES-META-REMOVAL-MODULE?", 2, 0, false);
        declareFunction("inference_meta_removal_module", "INFERENCE-META-REMOVAL-MODULE", 1, 1, false);
        declareFunction("removal_proof_module_p", "REMOVAL-PROOF-MODULE-P", 1, 0, false);
        declareMacro("do_transformation_modules", "DO-TRANSFORMATION-MODULES");
        declareFunction("transformation_modules", "TRANSFORMATION-MODULES", 0, 0, false);
        declareFunction("transformation_module_p", "TRANSFORMATION-MODULE-P", 1, 0, false);
        declareFunction("transformation_module_count", "TRANSFORMATION-MODULE-COUNT", 0, 0, false);
        declareFunction("inference_transformation_module", "INFERENCE-TRANSFORMATION-MODULE", 2, 0, false);
        declareMacro("do_meta_transformation_modules", "DO-META-TRANSFORMATION-MODULES");
        declareFunction("meta_transformation_modules", "META-TRANSFORMATION-MODULES", 0, 0, false);
        declareFunction("meta_transformation_module_p", "META-TRANSFORMATION-MODULE-P", 1, 0, false);
        declareFunction("meta_transformation_module_count", "META-TRANSFORMATION-MODULE-COUNT", 0, 0, false);
        declareFunction("inference_meta_transformation_module", "INFERENCE-META-TRANSFORMATION-MODULE", 1, 1, false);
        declareMacro("do_rewrite_modules", "DO-REWRITE-MODULES");
        declareFunction("rewrite_modules", "REWRITE-MODULES", 0, 0, false);
        declareFunction("rewrite_module_p", "REWRITE-MODULE-P", 1, 0, false);
        declareFunction("rewrite_module_count", "REWRITE-MODULE-COUNT", 0, 0, false);
        declareFunction("rewrite_module_support", "REWRITE-MODULE-SUPPORT", 1, 0, false);
        declareFunction("rewrite_module_closure", "REWRITE-MODULE-CLOSURE", 1, 0, false);
        declareFunction("inference_rewrite_module", "INFERENCE-REWRITE-MODULE", 2, 0, false);
        declareFunction("undeclare_rewrite_module", "UNDECLARE-REWRITE-MODULE", 1, 0, false);
        declareFunction("undeclare_rewrite_module_by_name", "UNDECLARE-REWRITE-MODULE-BY-NAME", 1, 0, false);
        declareFunction("deregister_rewrite_module", "DEREGISTER-REWRITE-MODULE", 1, 0, false);
        declareFunction("deregister_rewrite_module_by_name", "DEREGISTER-REWRITE-MODULE-BY-NAME", 1, 0, false);
        declareFunction("strengthen_rewrite_module_properties", "STRENGTHEN-REWRITE-MODULE-PROPERTIES", 2, 0, false);
        declareFunction("structural_module_p", "STRUCTURAL-MODULE-P", 1, 0, false);
        declareFunction("inference_structural_module", "INFERENCE-STRUCTURAL-MODULE", 1, 1, false);
        declareFunction("structural_module_count", "STRUCTURAL-MODULE-COUNT", 0, 0, false);
        declareMacro("do_meta_structural_modules", "DO-META-STRUCTURAL-MODULES");
        declareFunction("meta_structural_modules", "META-STRUCTURAL-MODULES", 0, 0, false);
        declareFunction("meta_structural_module_p", "META-STRUCTURAL-MODULE-P", 1, 0, false);
        declareFunction("meta_structural_module_count", "META-STRUCTURAL-MODULE-COUNT", 0, 0, false);
        declareFunction("inference_meta_structural_module", "INFERENCE-META-STRUCTURAL-MODULE", 1, 1, false);
        declareFunction("cfasl_output_object_hl_module_method", "CFASL-OUTPUT-OBJECT-HL-MODULE-METHOD", 2, 0, false);
        declareFunction("cfasl_wide_output_hl_module", "CFASL-WIDE-OUTPUT-HL-MODULE", 2, 0, false);
        declareFunction("cfasl_output_hl_module_internal", "CFASL-OUTPUT-HL-MODULE-INTERNAL", 2, 0, false);
        declareFunction("cfasl_input_hl_module", "CFASL-INPUT-HL-MODULE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_inference_modules_file() {
        $meta_removal_modules$ = deflexical("*META-REMOVAL-MODULES*", (maybeDefault($sym0$_META_REMOVAL_MODULES_, $meta_removal_modules$, NIL)));
        $hl_module_properties$ = deflexical("*HL-MODULE-PROPERTIES*", $list1);
        $valid_hl_module_subtypes$ = deflexical("*VALID-HL-MODULE-SUBTYPES*", $list10);
        $default_hl_module_subtype$ = deflexical("*DEFAULT-HL-MODULE-SUBTYPE*", $KB);
        $hl_module_property_defaults$ = SubLFiles.deflexical("*HL-MODULE-PROPERTY-DEFAULTS*", dictionary_utilities.new_dictionary_from_alist(Sequences.reverse(listS($list12, list($MODULE_SUBTYPE, $default_hl_module_subtype$.getGlobalValue()), $list14)), Symbols.symbol_function(EQL)));
        $dtp_hl_module$ = defconstant("*DTP-HL-MODULE*", $sym22$HL_MODULE);
        $cfasl_create_invalid_hl_module_caching_state$ = SubLFiles.deflexical("*CFASL-CREATE-INVALID-HL-MODULE-CACHING-STATE*", NIL);
        $hl_module_store$ = deflexical("*HL-MODULE-STORE*", maybeDefault($sym84$_HL_MODULE_STORE_, $hl_module_store$, () -> (Hashtables.make_hash_table($int$212, Symbols.symbol_function(EQUAL), UNPROVIDED))));
        $removal_modules$ = deflexical("*REMOVAL-MODULES*", maybeDefault($sym146$_REMOVAL_MODULES_, $removal_modules$, () -> (set.new_set(Symbols.symbol_function(EQL), UNPROVIDED))));
        $removal_modules_external$ = deflexical("*REMOVAL-MODULES-EXTERNAL*", (maybeDefault($sym152$_REMOVAL_MODULES_EXTERNAL_, $removal_modules_external$, NIL)));
        $removal_modules_generic$ = deflexical("*REMOVAL-MODULES-GENERIC*", (maybeDefault($sym153$_REMOVAL_MODULES_GENERIC_, $removal_modules_generic$, NIL)));
        $removal_modules_universal$ = deflexical("*REMOVAL-MODULES-UNIVERSAL*", (maybeDefault($sym155$_REMOVAL_MODULES_UNIVERSAL_, $removal_modules_universal$, NIL)));
        $removal_modules_specific$ = deflexical("*REMOVAL-MODULES-SPECIFIC*", maybeDefault($sym156$_REMOVAL_MODULES_SPECIFIC_, $removal_modules_specific$, () -> (Hashtables.make_hash_table($int$32, UNPROVIDED, UNPROVIDED))));
        $removal_modules_specific_use_generic$ = deflexical("*REMOVAL-MODULES-SPECIFIC-USE-GENERIC*", (maybeDefault($sym159$_REMOVAL_MODULES_SPECIFIC_USE_GENERIC_, $removal_modules_specific_use_generic$, NIL)));
        $removal_modules_specific_use_meta_removal$ = deflexical("*REMOVAL-MODULES-SPECIFIC-USE-META-REMOVAL*", (maybeDefault($sym160$_REMOVAL_MODULES_SPECIFIC_USE_META_REMOVAL_, $removal_modules_specific_use_meta_removal$, NIL)));
        $removal_modules_specific_dont_use_universal$ = deflexical("*REMOVAL-MODULES-SPECIFIC-DONT-USE-UNIVERSAL*", (maybeDefault($sym161$_REMOVAL_MODULES_SPECIFIC_DONT_USE_UNIVERSAL_, $removal_modules_specific_dont_use_universal$, NIL)));
        $solely_specific_removal_module_predicate_store$ = SubLFiles.deflexical("*SOLELY-SPECIFIC-REMOVAL-MODULE-PREDICATE-STORE*", maybeDefault($sym162$_SOLELY_SPECIFIC_REMOVAL_MODULE_PREDICATE_STORE_, $solely_specific_removal_module_predicate_store$, () -> (set.new_set(EQL, $int$50))));
        $classify_removal_modules_with_deterministic_sortP$ = SubLFiles.defparameter("*CLASSIFY-REMOVAL-MODULES-WITH-DETERMINISTIC-SORT?*", T);
        $removal_pruning_module_properties$ = deflexical("*REMOVAL-PRUNING-MODULE-PROPERTIES*", $list171);
        $conjunctive_removal_modules$ = deflexical("*CONJUNCTIVE-REMOVAL-MODULES*", maybeDefault($sym173$_CONJUNCTIVE_REMOVAL_MODULES_, $conjunctive_removal_modules$, () -> (set.new_set(Symbols.symbol_function(EQL), UNPROVIDED))));
        $transformation_modules$ = deflexical("*TRANSFORMATION-MODULES*", (maybeDefault($sym183$_TRANSFORMATION_MODULES_, $transformation_modules$, NIL)));
        $meta_transformation_modules$ = deflexical("*META-TRANSFORMATION-MODULES*", (maybeDefault($sym188$_META_TRANSFORMATION_MODULES_, $meta_transformation_modules$, NIL)));
        $rewrite_modules$ = deflexical("*REWRITE-MODULES*", (maybeDefault($sym193$_REWRITE_MODULES_, $rewrite_modules$, NIL)));
        $structural_modules$ = deflexical("*STRUCTURAL-MODULES*", (maybeDefault($sym199$_STRUCTURAL_MODULES_, $structural_modules$, NIL)));
        $meta_structural_modules$ = deflexical("*META-STRUCTURAL-MODULES*", (maybeDefault($sym201$_META_STRUCTURAL_MODULES_, $meta_structural_modules$, NIL)));
        $cfasl_wide_opcode_hl_module$ = defconstant("*CFASL-WIDE-OPCODE-HL-MODULE*", $int$256);
        return NIL;
    }

    public static SubLObject setup_inference_modules_file() {
        subl_macro_promotions.declare_defglobal($sym0$_META_REMOVAL_MODULES_);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_hl_module$.getGlobalValue(), Symbols.symbol_function($sym28$HL_MODULE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list29);
        Structures.def_csetf($sym30$HL_MOD_NAME, $sym31$_CSETF_HL_MOD_NAME);
        Structures.def_csetf($sym32$HL_MOD_PLIST, $sym33$_CSETF_HL_MOD_PLIST);
        Structures.def_csetf($sym34$HL_MOD_SENSE, $sym35$_CSETF_HL_MOD_SENSE);
        Structures.def_csetf($sym36$HL_MOD_PREDICATE, $sym37$_CSETF_HL_MOD_PREDICATE);
        Structures.def_csetf($sym38$HL_MOD_ANY_PREDICATES, $sym39$_CSETF_HL_MOD_ANY_PREDICATES);
        Structures.def_csetf($sym40$HL_MOD_ARITY, $sym41$_CSETF_HL_MOD_ARITY);
        Structures.def_csetf($sym42$HL_MOD_DIRECTION, $sym43$_CSETF_HL_MOD_DIRECTION);
        Structures.def_csetf($sym44$HL_MOD_REQUIRED_PATTERN, $sym45$_CSETF_HL_MOD_REQUIRED_PATTERN);
        Structures.def_csetf($sym46$HL_MOD_REQUIRED_MT, $sym47$_CSETF_HL_MOD_REQUIRED_MT);
        Structures.def_csetf($sym48$HL_MOD_EXCLUSIVE_FUNC, $sym49$_CSETF_HL_MOD_EXCLUSIVE_FUNC);
        Structures.def_csetf($sym50$HL_MOD_REQUIRED_FUNC, $sym51$_CSETF_HL_MOD_REQUIRED_FUNC);
        Structures.def_csetf($sym52$HL_MOD_COMPLETENESS, $sym53$_CSETF_HL_MOD_COMPLETENESS);
        Equality.identity($sym22$HL_MODULE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_hl_module$.getGlobalValue(), Symbols.symbol_function($sym71$VISIT_DEFSTRUCT_OBJECT_HL_MODULE_METHOD));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_hl_module$.getGlobalValue(), Symbols.symbol_function($sym73$SXHASH_HL_MODULE_METHOD));
        memoization_state.note_globally_cached_function($sym79$CFASL_CREATE_INVALID_HL_MODULE);
        subl_macro_promotions.declare_defglobal($sym84$_HL_MODULE_STORE_);
        access_macros.register_macro_helper($sym94$HL_MODULE_STORE, $sym95$DO_HL_MODULES);
        subl_macro_promotions.declare_defglobal($sym146$_REMOVAL_MODULES_);
        access_macros.register_macro_helper($sym150$REMOVAL_MODULES, $sym151$DO_REMOVAL_MODULES);
        subl_macro_promotions.declare_defglobal($sym152$_REMOVAL_MODULES_EXTERNAL_);
        subl_macro_promotions.declare_defglobal($sym153$_REMOVAL_MODULES_GENERIC_);
        subl_macro_promotions.declare_defglobal($sym155$_REMOVAL_MODULES_UNIVERSAL_);
        subl_macro_promotions.declare_defglobal($sym156$_REMOVAL_MODULES_SPECIFIC_);
        subl_macro_promotions.declare_defglobal($sym159$_REMOVAL_MODULES_SPECIFIC_USE_GENERIC_);
        subl_macro_promotions.declare_defglobal($sym160$_REMOVAL_MODULES_SPECIFIC_USE_META_REMOVAL_);
        subl_macro_promotions.declare_defglobal($sym161$_REMOVAL_MODULES_SPECIFIC_DONT_USE_UNIVERSAL_);
        subl_macro_promotions.declare_defglobal($sym162$_SOLELY_SPECIFIC_REMOVAL_MODULE_PREDICATE_STORE_);
        memoization_state.note_memoized_function($sym170$REMOVAL_MODULE_SPECIFIC_USE_GENERIC_);
        subl_macro_promotions.declare_defglobal($sym173$_CONJUNCTIVE_REMOVAL_MODULES_);
        access_macros.register_macro_helper($sym176$REMOVAL_MODULES_CONJUNCTIVE, $sym177$DO_CONJUNCTIVE_REMOVAL_MODULES);
        access_macros.register_macro_helper($sym180$META_REMOVAL_MODULES, $sym181$DO_META_REMOVAL_MODULES);
        subl_macro_promotions.declare_defglobal($sym183$_TRANSFORMATION_MODULES_);
        access_macros.register_macro_helper($sym185$TRANSFORMATION_MODULES, $sym186$DO_TRANSFORMATION_MODULES);
        subl_macro_promotions.declare_defglobal($sym188$_META_TRANSFORMATION_MODULES_);
        access_macros.register_macro_helper($sym190$META_TRANSFORMATION_MODULES, $sym191$DO_META_TRANSFORMATION_MODULES);
        subl_macro_promotions.declare_defglobal($sym193$_REWRITE_MODULES_);
        subl_macro_promotions.declare_defglobal($sym199$_STRUCTURAL_MODULES_);
        subl_macro_promotions.declare_defglobal($sym201$_META_STRUCTURAL_MODULES_);
        access_macros.register_macro_helper($sym203$META_STRUCTURAL_MODULES, $sym204$DO_META_STRUCTURAL_MODULES);
        cfasl.register_wide_cfasl_opcode_input_function($cfasl_wide_opcode_hl_module$.getGlobalValue(), $sym207$CFASL_INPUT_HL_MODULE);
        Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), $dtp_hl_module$.getGlobalValue(), Symbols.symbol_function($sym208$CFASL_OUTPUT_OBJECT_HL_MODULE_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_inference_modules_file();
    }

    @Override
    public void initializeVariables() {
        init_inference_modules_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_modules_file();
    }

    static {
        me = new inference_modules();
        $meta_removal_modules$ = null;
        $hl_module_properties$ = null;
        $valid_hl_module_subtypes$ = null;
        $default_hl_module_subtype$ = null;
        $hl_module_property_defaults$ = null;
        $dtp_hl_module$ = null;
        $cfasl_create_invalid_hl_module_caching_state$ = null;
        $hl_module_store$ = null;
        $removal_modules$ = null;
        $removal_modules_external$ = null;
        $removal_modules_generic$ = null;
        $removal_modules_universal$ = null;
        $removal_modules_specific$ = null;
        $removal_modules_specific_use_generic$ = null;
        $removal_modules_specific_use_meta_removal$ = null;
        $removal_modules_specific_dont_use_universal$ = null;
        $solely_specific_removal_module_predicate_store$ = null;
        $classify_removal_modules_with_deterministic_sortP$ = null;
        $removal_pruning_module_properties$ = null;
        $conjunctive_removal_modules$ = null;
        $transformation_modules$ = null;
        $meta_transformation_modules$ = null;
        $rewrite_modules$ = null;
        $structural_modules$ = null;
        $meta_structural_modules$ = null;
        $cfasl_wide_opcode_hl_module$ = null;
        $sym0$_META_REMOVAL_MODULES_ = makeSymbol("*META-REMOVAL-MODULES*");
        $list1 = list(new SubLObject[] { makeKeyword("MODULE-TYPE"), makeKeyword("MODULE-SUBTYPE"), makeKeyword("MODULE-SOURCE"), makeKeyword("CHECK"), makeKeyword("EXTERNAL"), makeKeyword("UNIVERSAL"), makeKeyword("SENSE"), makeKeyword("DIRECTION"), makeKeyword("PREDICATE"),
                makeKeyword("EVERY-PREDICATES"), makeKeyword("ANY-PREDICATES"), makeKeyword("REQUIRED-PATTERN"), makeKeyword("REQUIRED-MT"), makeKeyword("ARITY"), makeKeyword("EXCLUSIVE"), makeKeyword("SUPPLANTS"), makeKeyword("REQUIRED"), makeKeyword("APPLICABILITY-PATTERN"),
                makeKeyword("APPLICABILITY"), makeKeyword("COST-PATTERN"), makeKeyword("COST-EXPRESSION"), makeKeyword("COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE-PATTERN"), makeKeyword("COMPLETENESS-PATTERN"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                makeKeyword("INPUT-VERIFY-PATTERN"), makeKeyword("INPUT-ENCODE-PATTERN"), makeKeyword("OUTPUT-CHECK-PATTERN"), makeKeyword("OUTPUT-GENERATE-PATTERN"), makeKeyword("OUTPUT-DECODE-PATTERN"), makeKeyword("OUTPUT-VERIFY-PATTERN"), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                makeKeyword("RULE-SELECT"), makeKeyword("RULE-FILTER"), makeKeyword("EXPAND-ITERATIVE-PATTERN"), makeKeyword("EXPAND-PATTERN"), makeKeyword("EXPAND"), makeKeyword("REWRITE-CLOSURE"), makeKeyword("SUPPORT-PATTERN"), makeKeyword("SUPPORT"), makeKeyword("SUPPORT-MODULE"),
                makeKeyword("SUPPORT-MT"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("REWRITE-SUPPORT"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("INCOMPLETENESS"), makeKeyword("ADD"), makeKeyword("REMOVE"), makeKeyword("REMOVE-ALL"), makeKeyword("PREFERRED-OVER"), makeKeyword("DOCUMENTATION"),
                makeKeyword("EXAMPLE"), makeKeyword("PRETTY-NAME") });
        $list2 = list(list(makeSymbol("PROPERTY-VAR"), makeSymbol("VALUE-VAR"), makeSymbol("HL-MODULE")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym3$MODULE_VAR = makeUninternedSymbol("MODULE-VAR");
        $sym4$CLET = makeSymbol("CLET");
        $sym5$DO_LIST = makeSymbol("DO-LIST");
        $list6 = list(list(makeSymbol("HL-MODULE-PROPERTIES")));
        $sym7$PWHEN = makeSymbol("PWHEN");
        $sym8$HL_MODULE_PROPERTY_NOT_DEFAULT_ = makeSymbol("HL-MODULE-PROPERTY-NOT-DEFAULT?");
        $sym9$HL_MODULE_PROPERTY_WITHOUT_VALUES = makeSymbol("HL-MODULE-PROPERTY-WITHOUT-VALUES");
        $list10 = list(makeKeyword("SKSI"), makeKeyword("KB"), makeKeyword("ABDUCTION"), makeKeyword("PRUNING"));
        $KB = makeKeyword("KB");
        $list12 = list(makeKeyword("MODULE-TYPE"));
        $MODULE_SUBTYPE = makeKeyword("MODULE-SUBTYPE");
        $list14 = list(new SubLObject[] { list(makeKeyword("MODULE-SOURCE")), list(makeKeyword("UNIVERSAL")), list(makeKeyword("SENSE")), cons(makeKeyword("REQUIRED-PATTERN"), makeKeyword("ANYTHING")), list(makeKeyword("REQUIRED-MT")), list(makeKeyword("REQUIRED")),
                list(makeKeyword("COST-PATTERN")), list(makeKeyword("COST-EXPRESSION")), cons(makeKeyword("COST"), makeSymbol("DEFAULT-COST-FUNC")), list(makeKeyword("COMPLETENESS")), list(makeKeyword("COMPLETE-PATTERN")), list(makeKeyword("COMPLETENESS-PATTERN")),
                cons(makeKeyword("CHECK"), makeKeyword("UNKNOWN")), list(makeKeyword("RULE-SELECT")), cons(makeKeyword("EXPAND"), makeKeyword("DEFAULT")), list(makeKeyword("EXPAND-PATTERN")), list(makeKeyword("EXPAND-ITERATIVE-PATTERN")), list(makeKeyword("PREDICATE")), list(makeKeyword("ARITY")),
                list(makeKeyword("EXCLUSIVE")), cons(makeKeyword("SUPPLANTS"), makeKeyword("ALL")), cons(makeKeyword("DIRECTION"), makeKeyword("FORWARD")), cons(makeKeyword("INPUT-EXTRACT-PATTERN"), makeKeyword("INPUT")), cons(makeKeyword("INPUT-VERIFY-PATTERN"), makeKeyword("ANYTHING")),
                cons(makeKeyword("INPUT-ENCODE-PATTERN"), makeKeyword("INPUT")), list(makeKeyword("OUTPUT-CHECK-PATTERN")), list(makeKeyword("OUTPUT-GENERATE-PATTERN")), cons(makeKeyword("OUTPUT-DECODE-PATTERN"), makeKeyword("INPUT")),
                cons(makeKeyword("OUTPUT-VERIFY-PATTERN"), makeKeyword("ANYTHING")), cons(makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), makeKeyword("INPUT")), list(makeKeyword("SUPPORT-PATTERN")), list(makeKeyword("SUPPORT")), cons(makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE")),
                list(makeKeyword("SUPPORT-MT")), cons(makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT")), list(makeKeyword("EVERY-PREDICATES")), cons(makeKeyword("APPLICABILITY"), makeSymbol("FALSE")), list(makeKeyword("APPLICABILITY-PATTERN")), list(makeKeyword("ANY-PREDICATES")),
                cons(makeKeyword("DOCUMENTATION"), makeString("")), cons(makeKeyword("EXAMPLE"), makeString("")), list(makeKeyword("EXTERNAL")), list(makeKeyword("REWRITE-SUPPORT")), list(makeKeyword("REWRITE-CLOSURE")) });
        $ALL = makeKeyword("ALL");
        $OR = makeKeyword("OR");
        $sym17$ALLOWED_MODULES_SPEC_P = makeSymbol("ALLOWED-MODULES-SPEC-P");
        $AND = makeKeyword("AND");
        $NOT = makeKeyword("NOT");
        $MODULE_TYPE = makeKeyword("MODULE-TYPE");
        $sym21$HL_MODULE_P = makeSymbol("HL-MODULE-P");
        $sym22$HL_MODULE = makeSymbol("HL-MODULE");
        $list23 = list(new SubLObject[] { makeSymbol("NAME"), makeSymbol("PLIST"), makeSymbol("SENSE"), makeSymbol("PREDICATE"), makeSymbol("ANY-PREDICATES"), makeSymbol("ARITY"), makeSymbol("DIRECTION"), makeSymbol("REQUIRED-PATTERN"), makeSymbol("REQUIRED-MT"), makeSymbol("EXCLUSIVE-FUNC"),
                makeSymbol("REQUIRED-FUNC"), makeSymbol("COMPLETENESS") });
        $list24 = list(new SubLObject[] { makeKeyword("NAME"), makeKeyword("PLIST"), makeKeyword("SENSE"), makeKeyword("PREDICATE"), makeKeyword("ANY-PREDICATES"), makeKeyword("ARITY"), makeKeyword("DIRECTION"), makeKeyword("REQUIRED-PATTERN"), makeKeyword("REQUIRED-MT"),
                makeKeyword("EXCLUSIVE-FUNC"), makeKeyword("REQUIRED-FUNC"), makeKeyword("COMPLETENESS") });
        $list25 = list(new SubLObject[] { makeSymbol("HL-MOD-NAME"), makeSymbol("HL-MOD-PLIST"), makeSymbol("HL-MOD-SENSE"), makeSymbol("HL-MOD-PREDICATE"), makeSymbol("HL-MOD-ANY-PREDICATES"), makeSymbol("HL-MOD-ARITY"), makeSymbol("HL-MOD-DIRECTION"), makeSymbol("HL-MOD-REQUIRED-PATTERN"),
                makeSymbol("HL-MOD-REQUIRED-MT"), makeSymbol("HL-MOD-EXCLUSIVE-FUNC"), makeSymbol("HL-MOD-REQUIRED-FUNC"), makeSymbol("HL-MOD-COMPLETENESS") });
        $list26 = list(new SubLObject[] { makeSymbol("_CSETF-HL-MOD-NAME"), makeSymbol("_CSETF-HL-MOD-PLIST"), makeSymbol("_CSETF-HL-MOD-SENSE"), makeSymbol("_CSETF-HL-MOD-PREDICATE"), makeSymbol("_CSETF-HL-MOD-ANY-PREDICATES"), makeSymbol("_CSETF-HL-MOD-ARITY"),
                makeSymbol("_CSETF-HL-MOD-DIRECTION"), makeSymbol("_CSETF-HL-MOD-REQUIRED-PATTERN"), makeSymbol("_CSETF-HL-MOD-REQUIRED-MT"), makeSymbol("_CSETF-HL-MOD-EXCLUSIVE-FUNC"), makeSymbol("_CSETF-HL-MOD-REQUIRED-FUNC"), makeSymbol("_CSETF-HL-MOD-COMPLETENESS") });
        $sym27$PRINT_HL_MODULE = makeSymbol("PRINT-HL-MODULE");
        $sym28$HL_MODULE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("HL-MODULE-PRINT-FUNCTION-TRAMPOLINE");
        $list29 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("HL-MODULE-P"));
        $sym30$HL_MOD_NAME = makeSymbol("HL-MOD-NAME");
        $sym31$_CSETF_HL_MOD_NAME = makeSymbol("_CSETF-HL-MOD-NAME");
        $sym32$HL_MOD_PLIST = makeSymbol("HL-MOD-PLIST");
        $sym33$_CSETF_HL_MOD_PLIST = makeSymbol("_CSETF-HL-MOD-PLIST");
        $sym34$HL_MOD_SENSE = makeSymbol("HL-MOD-SENSE");
        $sym35$_CSETF_HL_MOD_SENSE = makeSymbol("_CSETF-HL-MOD-SENSE");
        $sym36$HL_MOD_PREDICATE = makeSymbol("HL-MOD-PREDICATE");
        $sym37$_CSETF_HL_MOD_PREDICATE = makeSymbol("_CSETF-HL-MOD-PREDICATE");
        $sym38$HL_MOD_ANY_PREDICATES = makeSymbol("HL-MOD-ANY-PREDICATES");
        $sym39$_CSETF_HL_MOD_ANY_PREDICATES = makeSymbol("_CSETF-HL-MOD-ANY-PREDICATES");
        $sym40$HL_MOD_ARITY = makeSymbol("HL-MOD-ARITY");
        $sym41$_CSETF_HL_MOD_ARITY = makeSymbol("_CSETF-HL-MOD-ARITY");
        $sym42$HL_MOD_DIRECTION = makeSymbol("HL-MOD-DIRECTION");
        $sym43$_CSETF_HL_MOD_DIRECTION = makeSymbol("_CSETF-HL-MOD-DIRECTION");
        $sym44$HL_MOD_REQUIRED_PATTERN = makeSymbol("HL-MOD-REQUIRED-PATTERN");
        $sym45$_CSETF_HL_MOD_REQUIRED_PATTERN = makeSymbol("_CSETF-HL-MOD-REQUIRED-PATTERN");
        $sym46$HL_MOD_REQUIRED_MT = makeSymbol("HL-MOD-REQUIRED-MT");
        $sym47$_CSETF_HL_MOD_REQUIRED_MT = makeSymbol("_CSETF-HL-MOD-REQUIRED-MT");
        $sym48$HL_MOD_EXCLUSIVE_FUNC = makeSymbol("HL-MOD-EXCLUSIVE-FUNC");
        $sym49$_CSETF_HL_MOD_EXCLUSIVE_FUNC = makeSymbol("_CSETF-HL-MOD-EXCLUSIVE-FUNC");
        $sym50$HL_MOD_REQUIRED_FUNC = makeSymbol("HL-MOD-REQUIRED-FUNC");
        $sym51$_CSETF_HL_MOD_REQUIRED_FUNC = makeSymbol("_CSETF-HL-MOD-REQUIRED-FUNC");
        $sym52$HL_MOD_COMPLETENESS = makeSymbol("HL-MOD-COMPLETENESS");
        $sym53$_CSETF_HL_MOD_COMPLETENESS = makeSymbol("_CSETF-HL-MOD-COMPLETENESS");
        $NAME = makeKeyword("NAME");
        $PLIST = makeKeyword("PLIST");
        $SENSE = makeKeyword("SENSE");
        $PREDICATE = makeKeyword("PREDICATE");
        $ANY_PREDICATES = makeKeyword("ANY-PREDICATES");
        $ARITY = makeKeyword("ARITY");
        $DIRECTION = makeKeyword("DIRECTION");
        $REQUIRED_PATTERN = makeKeyword("REQUIRED-PATTERN");
        $REQUIRED_MT = makeKeyword("REQUIRED-MT");
        $EXCLUSIVE_FUNC = makeKeyword("EXCLUSIVE-FUNC");
        $REQUIRED_FUNC = makeKeyword("REQUIRED-FUNC");
        $COMPLETENESS = makeKeyword("COMPLETENESS");
        $str66$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
        $BEGIN = makeKeyword("BEGIN");
        $sym68$MAKE_HL_MODULE = makeSymbol("MAKE-HL-MODULE");
        $SLOT = makeKeyword("SLOT");
        $END = makeKeyword("END");
        $sym71$VISIT_DEFSTRUCT_OBJECT_HL_MODULE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-HL-MODULE-METHOD");
        $str72$_HL_Module___a_ = makeString("[HL Module: ~a]");
        $sym73$SXHASH_HL_MODULE_METHOD = makeSymbol("SXHASH-HL-MODULE-METHOD");
        $sym74$PROPERTY_LIST_P = makeSymbol("PROPERTY-LIST-P");
        $sym75$HL_MODULE_PROPERTY_P = makeSymbol("HL-MODULE-PROPERTY-P");
        $EXCLUSIVE = makeKeyword("EXCLUSIVE");
        $SUPPLANTS = makeKeyword("SUPPLANTS");
        $str78$_supplants_is_meaningless_without = makeString(":supplants is meaningless without :exclusive being specified.  ~s contains a :supplants specification without an :exclusive.");
        $sym79$CFASL_CREATE_INVALID_HL_MODULE = makeSymbol("CFASL-CREATE-INVALID-HL-MODULE");
        $list80 = list(makeKeyword("MODULE-TYPE"), makeKeyword("INVALID"));
        $sym81$_CFASL_CREATE_INVALID_HL_MODULE_CACHING_STATE_ = makeSymbol("*CFASL-CREATE-INVALID-HL-MODULE-CACHING-STATE*");
        $FREE = makeKeyword("FREE");
        $DEFAULT = makeKeyword("DEFAULT");
        $sym84$_HL_MODULE_STORE_ = makeSymbol("*HL-MODULE-STORE*");
        $int$212 = makeInteger(212);
        $list86 = list(list(makeSymbol("HL-MODULE-VAR"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $list87 = list(makeKeyword("DONE"));
        $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
        $DONE = makeKeyword("DONE");
        $sym90$NAME_VAR = makeUninternedSymbol("NAME-VAR");
        $sym91$DO_HASH_TABLE = makeSymbol("DO-HASH-TABLE");
        $list92 = list(makeSymbol("HL-MODULE-STORE"));
        $sym93$IGNORE = makeSymbol("IGNORE");
        $sym94$HL_MODULE_STORE = makeSymbol("HL-MODULE-STORE");
        $sym95$DO_HL_MODULES = makeSymbol("DO-HL-MODULES");
        $ABDUCTION = makeKeyword("ABDUCTION");
        $UNIVERSAL = makeKeyword("UNIVERSAL");
        $MODULE_SOURCE = makeKeyword("MODULE-SOURCE");
        $ANYTHING = makeKeyword("ANYTHING");
        $REQUIRED = makeKeyword("REQUIRED");
        $COST_PATTERN = makeKeyword("COST-PATTERN");
        $COST_EXPRESSION = makeKeyword("COST-EXPRESSION");
        $COST = makeKeyword("COST");
        $CHECK = makeKeyword("CHECK");
        $UNKNOWN = makeKeyword("UNKNOWN");
        $NOT_FULLY_BOUND = makeKeyword("NOT-FULLY-BOUND");
        $str107$check = makeString("check");
        $RULE_SELECT = makeKeyword("RULE-SELECT");
        $RULE_FILTER = makeKeyword("RULE-FILTER");
        $EXPAND = makeKeyword("EXPAND");
        $REMOVAL = makeKeyword("REMOVAL");
        $sym112$INFERENCE_REMOVE_CHECK_DEFAULT = makeSymbol("INFERENCE-REMOVE-CHECK-DEFAULT");
        $sym113$INFERENCE_REMOVE_UNIFY_DEFAULT = makeSymbol("INFERENCE-REMOVE-UNIFY-DEFAULT");
        $sym114$DEFAULT_EXPAND_FUNC = makeSymbol("DEFAULT-EXPAND-FUNC");
        $EXPAND_PATTERN = makeKeyword("EXPAND-PATTERN");
        $EXPAND_ITERATIVE_PATTERN = makeKeyword("EXPAND-ITERATIVE-PATTERN");
        $sym117$PATTERN_MATCHES_FORMULA = makeSymbol("PATTERN-MATCHES-FORMULA");
        $FORWARD = makeKeyword("FORWARD");
        $INPUT_EXTRACT_PATTERN = makeKeyword("INPUT-EXTRACT-PATTERN");
        $INPUT_VERIFY_PATTERN = makeKeyword("INPUT-VERIFY-PATTERN");
        $INPUT_ENCODE_PATTERN = makeKeyword("INPUT-ENCODE-PATTERN");
        $OUTPUT_CHECK_PATTERN = makeKeyword("OUTPUT-CHECK-PATTERN");
        $OUTPUT_GENERATE_PATTERN = makeKeyword("OUTPUT-GENERATE-PATTERN");
        $OUTPUT_DECODE_PATTERN = makeKeyword("OUTPUT-DECODE-PATTERN");
        $OUTPUT_VERIFY_PATTERN = makeKeyword("OUTPUT-VERIFY-PATTERN");
        $OUTPUT_CONSTRUCT_PATTERN = makeKeyword("OUTPUT-CONSTRUCT-PATTERN");
        $SUPPORT_PATTERN = makeKeyword("SUPPORT-PATTERN");
        $SUPPORT = makeKeyword("SUPPORT");
        $SUPPORT_MODULE = makeKeyword("SUPPORT-MODULE");
        $SUPPORT_MT = makeKeyword("SUPPORT-MT");
        $SUPPORT_STRENGTH = makeKeyword("SUPPORT-STRENGTH");
        $EVERY_PREDICATES = makeKeyword("EVERY-PREDICATES");
        $APPLICABILITY = makeKeyword("APPLICABILITY");
        $APPLICABILITY_PATTERN = makeKeyword("APPLICABILITY-PATTERN");
        $DOCUMENTATION = makeKeyword("DOCUMENTATION");
        $EXAMPLE = makeKeyword("EXAMPLE");
        $COMPLETE = makeKeyword("COMPLETE");
        $INCOMPLETE = makeKeyword("INCOMPLETE");
        $COMPLETE_PATTERN = makeKeyword("COMPLETE-PATTERN");
        $COMPLETENESS_PATTERN = makeKeyword("COMPLETENESS-PATTERN");
        $EXTERNAL = makeKeyword("EXTERNAL");
        $sym142$FUNCTION_SYMBOL_P = makeSymbol("FUNCTION-SYMBOL-P");
        $list143 = list(makeSymbol("TRUE"), makeSymbol("FALSE"));
        $sym144$STRING_LESSP = makeSymbol("STRING-LESSP");
        $sym145$SYMBOL_NAME = makeSymbol("SYMBOL-NAME");
        $sym146$_REMOVAL_MODULES_ = makeSymbol("*REMOVAL-MODULES*");
        $list147 = list(list(makeSymbol("HL-MODULE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym148$DO_SET = makeSymbol("DO-SET");
        $list149 = list(makeSymbol("REMOVAL-MODULES"));
        $sym150$REMOVAL_MODULES = makeSymbol("REMOVAL-MODULES");
        $sym151$DO_REMOVAL_MODULES = makeSymbol("DO-REMOVAL-MODULES");
        $sym152$_REMOVAL_MODULES_EXTERNAL_ = makeSymbol("*REMOVAL-MODULES-EXTERNAL*");
        $sym153$_REMOVAL_MODULES_GENERIC_ = makeSymbol("*REMOVAL-MODULES-GENERIC*");
        $sym154$HL_MODULE_SENSE = makeSymbol("HL-MODULE-SENSE");
        $sym155$_REMOVAL_MODULES_UNIVERSAL_ = makeSymbol("*REMOVAL-MODULES-UNIVERSAL*");
        $sym156$_REMOVAL_MODULES_SPECIFIC_ = makeSymbol("*REMOVAL-MODULES-SPECIFIC*");
        $int$32 = makeInteger(32);
        $sym158$FORT_P = makeSymbol("FORT-P");
        $sym159$_REMOVAL_MODULES_SPECIFIC_USE_GENERIC_ = makeSymbol("*REMOVAL-MODULES-SPECIFIC-USE-GENERIC*");
        $sym160$_REMOVAL_MODULES_SPECIFIC_USE_META_REMOVAL_ = makeSymbol("*REMOVAL-MODULES-SPECIFIC-USE-META-REMOVAL*");
        $sym161$_REMOVAL_MODULES_SPECIFIC_DONT_USE_UNIVERSAL_ = makeSymbol("*REMOVAL-MODULES-SPECIFIC-DONT-USE-UNIVERSAL*");
        $sym162$_SOLELY_SPECIFIC_REMOVAL_MODULE_PREDICATE_STORE_ = makeSymbol("*SOLELY-SPECIFIC-REMOVAL-MODULE-PREDICATE-STORE*");
        $int$50 = makeInteger(50);
        $POS = makeKeyword("POS");
        $NEG = makeKeyword("NEG");
        $str166$removal_module__S_must_have_a__SE = makeString("removal module ~S must have a :SENSE of :POS or :NEG");
        $sym167$CAR = makeSymbol("CAR");
        $list168 = cons(makeSymbol("HL-MODULE"), makeSymbol("PREDICATES"));
        $sym169$INFERENCE_REMOVAL_MODULE__FOR_CLASSIFICATION = makeSymbol("INFERENCE-REMOVAL-MODULE<-FOR-CLASSIFICATION");
        $sym170$REMOVAL_MODULE_SPECIFIC_USE_GENERIC_ = makeSymbol("REMOVAL-MODULE-SPECIFIC-USE-GENERIC?");
        $list171 = list(makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"));
        $PRUNING = makeKeyword("PRUNING");
        $sym173$_CONJUNCTIVE_REMOVAL_MODULES_ = makeSymbol("*CONJUNCTIVE-REMOVAL-MODULES*");
        $list174 = list(list(makeSymbol("MODULE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $list175 = list(makeSymbol("REMOVAL-MODULES-CONJUNCTIVE"));
        $sym176$REMOVAL_MODULES_CONJUNCTIVE = makeSymbol("REMOVAL-MODULES-CONJUNCTIVE");
        $sym177$DO_CONJUNCTIVE_REMOVAL_MODULES = makeSymbol("DO-CONJUNCTIVE-REMOVAL-MODULES");
        $REMOVAL_CONJUNCTIVE = makeKeyword("REMOVAL-CONJUNCTIVE");
        $list179 = list(makeSymbol("META-REMOVAL-MODULES"));
        $sym180$META_REMOVAL_MODULES = makeSymbol("META-REMOVAL-MODULES");
        $sym181$DO_META_REMOVAL_MODULES = makeSymbol("DO-META-REMOVAL-MODULES");
        $META_REMOVAL = makeKeyword("META-REMOVAL");
        $sym183$_TRANSFORMATION_MODULES_ = makeSymbol("*TRANSFORMATION-MODULES*");
        $list184 = list(makeSymbol("TRANSFORMATION-MODULES"));
        $sym185$TRANSFORMATION_MODULES = makeSymbol("TRANSFORMATION-MODULES");
        $sym186$DO_TRANSFORMATION_MODULES = makeSymbol("DO-TRANSFORMATION-MODULES");
        $TRANSFORMATION = makeKeyword("TRANSFORMATION");
        $sym188$_META_TRANSFORMATION_MODULES_ = makeSymbol("*META-TRANSFORMATION-MODULES*");
        $list189 = list(makeSymbol("META-TRANSFORMATION-MODULES"));
        $sym190$META_TRANSFORMATION_MODULES = makeSymbol("META-TRANSFORMATION-MODULES");
        $sym191$DO_META_TRANSFORMATION_MODULES = makeSymbol("DO-META-TRANSFORMATION-MODULES");
        $META_TRANSFORMATION = makeKeyword("META-TRANSFORMATION");
        $sym193$_REWRITE_MODULES_ = makeSymbol("*REWRITE-MODULES*");
        $list194 = list(makeSymbol("REWRITE-MODULES"));
        $REWRITE_SUPPORT = makeKeyword("REWRITE-SUPPORT");
        $REWRITE_CLOSURE = makeKeyword("REWRITE-CLOSURE");
        $REWRITE = makeKeyword("REWRITE");
        $str198$rewrite_module__S_must_have_a__SE = makeString("rewrite module ~S must have a :SENSE of :POS or :NEG");
        $sym199$_STRUCTURAL_MODULES_ = makeSymbol("*STRUCTURAL-MODULES*");
        $STRUCTURAL = makeKeyword("STRUCTURAL");
        $sym201$_META_STRUCTURAL_MODULES_ = makeSymbol("*META-STRUCTURAL-MODULES*");
        $list202 = list(makeSymbol("META-STRUCTURAL-MODULES"));
        $sym203$META_STRUCTURAL_MODULES = makeSymbol("META-STRUCTURAL-MODULES");
        $sym204$DO_META_STRUCTURAL_MODULES = makeSymbol("DO-META-STRUCTURAL-MODULES");
        $META_STRUCTURAL = makeKeyword("META-STRUCTURAL");
        $int$256 = makeInteger(256);
        $sym207$CFASL_INPUT_HL_MODULE = makeSymbol("CFASL-INPUT-HL-MODULE");
        $sym208$CFASL_OUTPUT_OBJECT_HL_MODULE_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-HL-MODULE-METHOD");
    }

    public static class $allowed_modules_spec_p$UnaryFunction extends UnaryFunction {
        public $allowed_modules_spec_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("ALLOWED-MODULES-SPEC-P"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return allowed_modules_spec_p(arg1);
        }
    }

    public static class $hl_module_native extends SubLStructNative {
        public SubLObject $name;
        public SubLObject $plist;
        public SubLObject $sense;
        public SubLObject $predicate;
        public SubLObject $any_predicates;
        public SubLObject $arity;
        public SubLObject $direction;
        public SubLObject $required_pattern;
        public SubLObject $required_mt;
        public SubLObject $exclusive_func;
        public SubLObject $required_func;
        public SubLObject $completeness;
        private static SubLStructDeclNative structDecl;

        public $hl_module_native() {
            this.$name = CommonSymbols.NIL;
            this.$plist = CommonSymbols.NIL;
            this.$sense = CommonSymbols.NIL;
            this.$predicate = CommonSymbols.NIL;
            this.$any_predicates = CommonSymbols.NIL;
            this.$arity = CommonSymbols.NIL;
            this.$direction = CommonSymbols.NIL;
            this.$required_pattern = CommonSymbols.NIL;
            this.$required_mt = CommonSymbols.NIL;
            this.$exclusive_func = CommonSymbols.NIL;
            this.$required_func = CommonSymbols.NIL;
            this.$completeness = CommonSymbols.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return $hl_module_native.structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$name;
        }

        @Override
        public SubLObject getField3() {
            return this.$plist;
        }

        @Override
        public SubLObject getField4() {
            return this.$sense;
        }

        @Override
        public SubLObject getField5() {
            return this.$predicate;
        }

        @Override
        public SubLObject getField6() {
            return this.$any_predicates;
        }

        @Override
        public SubLObject getField7() {
            return this.$arity;
        }

        @Override
        public SubLObject getField8() {
            return this.$direction;
        }

        @Override
        public SubLObject getField9() {
            return this.$required_pattern;
        }

        @Override
        public SubLObject getField10() {
            return this.$required_mt;
        }

        @Override
        public SubLObject getField11() {
            return this.$exclusive_func;
        }

        @Override
        public SubLObject getField12() {
            return this.$required_func;
        }

        @Override
        public SubLObject getField13() {
            return this.$completeness;
        }

        @Override
        public SubLObject setField2(SubLObject value) {
            return this.$name = value;
        }

        @Override
        public SubLObject setField3(SubLObject value) {
            return this.$plist = value;
        }

        @Override
        public SubLObject setField4(SubLObject value) {
            return this.$sense = value;
        }

        @Override
        public SubLObject setField5(SubLObject value) {
            return this.$predicate = value;
        }

        @Override
        public SubLObject setField6(SubLObject value) {
            return this.$any_predicates = value;
        }

        @Override
        public SubLObject setField7(SubLObject value) {
            return this.$arity = value;
        }

        @Override
        public SubLObject setField8(SubLObject value) {
            return this.$direction = value;
        }

        @Override
        public SubLObject setField9(SubLObject value) {
            return this.$required_pattern = value;
        }

        @Override
        public SubLObject setField10(SubLObject value) {
            return this.$required_mt = value;
        }

        @Override
        public SubLObject setField11(SubLObject value) {
            return this.$exclusive_func = value;
        }

        @Override
        public SubLObject setField12(SubLObject value) {
            return this.$required_func = value;
        }

        @Override
        public SubLObject setField13(SubLObject value) {
            return this.$completeness = value;
        }

        static {
            structDecl = Structures.makeStructDeclNative($hl_module_native.class, $sym22$HL_MODULE, $sym21$HL_MODULE_P, $list23, $list24,
                    new String[] { "$name", "$plist", "$sense", "$predicate", "$any_predicates", "$arity", "$direction", "$required_pattern", "$required_mt", "$exclusive_func", "$required_func", "$completeness" }, $list25, $list26, $sym27$PRINT_HL_MODULE);
        }
    }

    public static class $hl_module_p$UnaryFunction extends UnaryFunction {
        public $hl_module_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("HL-MODULE-P"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return hl_module_p(arg1);
        }
    }

    public static class $sxhash_hl_module_method$UnaryFunction extends UnaryFunction {
        public $sxhash_hl_module_method$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SXHASH-HL-MODULE-METHOD"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return sxhash_hl_module_method(arg1);
        }
    }

    public static class $hl_module_sense$UnaryFunction extends UnaryFunction {
        public $hl_module_sense$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("HL-MODULE-SENSE"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return hl_module_sense(arg1);
        }
    }
}
/*
 *
 * Total time: 790 ms
 *
 */