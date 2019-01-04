package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.cfasl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.set_contents;
import java.util.Map;
import java.util.Iterator;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.eval_in_api;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_modules extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_modules";
    public static final String myFingerPrint = "f5f9fcc424bd7fc666d1bc2ddf032d2b8831d8370456272003b844b3b510e8bf";
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 870L)
    private static SubLSymbol $meta_removal_modules$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 1192L)
    private static SubLSymbol $hl_module_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 3737L)
    private static SubLSymbol $valid_hl_module_subtypes$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 3855L)
    private static SubLSymbol $default_hl_module_subtype$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 4009L)
    private static SubLSymbol $hl_module_property_defaults$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
    public static SubLSymbol $dtp_hl_module$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 14253L)
    private static SubLSymbol $cfasl_create_invalid_hl_module_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 17099L)
    private static SubLSymbol $hl_module_store$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 36199L)
    private static SubLSymbol $removal_modules$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 36873L)
    private static SubLSymbol $removal_modules_external$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 37222L)
    private static SubLSymbol $removal_modules_generic$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 38061L)
    private static SubLSymbol $removal_modules_universal$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 39716L)
    private static SubLSymbol $removal_modules_specific$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 42062L)
    private static SubLSymbol $removal_modules_specific_use_generic$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 42268L)
    private static SubLSymbol $removal_modules_specific_use_meta_removal$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 42484L)
    private static SubLSymbol $removal_modules_specific_dont_use_universal$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 42663L)
    private static SubLSymbol $solely_specific_removal_module_predicate_store$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 50871L)
    private static SubLSymbol $classify_removal_modules_with_deterministic_sortP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 53737L)
    private static SubLSymbol $removal_pruning_module_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 54501L)
    private static SubLSymbol $conjunctive_removal_modules$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 60197L)
    private static SubLSymbol $transformation_modules$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 61217L)
    private static SubLSymbol $meta_transformation_modules$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 62420L)
    private static SubLSymbol $rewrite_modules$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 65023L)
    private static SubLSymbol $structural_modules$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 65712L)
    private static SubLSymbol $meta_structural_modules$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 66784L)
    private static SubLSymbol $cfasl_wide_opcode_hl_module$;
    private static final SubLSymbol $sym0$_META_REMOVAL_MODULES_;
    private static final SubLList $list1;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$MODULE_VAR;
    private static final SubLSymbol $sym4$CLET;
    private static final SubLSymbol $sym5$DO_LIST;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$PWHEN;
    private static final SubLSymbol $sym8$HL_MODULE_PROPERTY_NOT_DEFAULT_;
    private static final SubLSymbol $sym9$HL_MODULE_PROPERTY_WITHOUT_VALUES;
    private static final SubLList $list10;
    private static final SubLSymbol $kw11$KB;
    private static final SubLList $list12;
    private static final SubLSymbol $kw13$MODULE_SUBTYPE;
    private static final SubLList $list14;
    private static final SubLSymbol $kw15$ALL;
    private static final SubLSymbol $kw16$OR;
    private static final SubLSymbol $sym17$ALLOWED_MODULES_SPEC_P;
    private static final SubLSymbol $kw18$AND;
    private static final SubLSymbol $kw19$NOT;
    private static final SubLSymbol $kw20$MODULE_TYPE;
    private static final SubLSymbol $sym21$HL_MODULE_P;
    private static final SubLSymbol $sym22$HL_MODULE;
    private static final SubLList $list23;
    private static final SubLList $list24;
    private static final SubLList $list25;
    private static final SubLList $list26;
    private static final SubLSymbol $sym27$PRINT_HL_MODULE;
    private static final SubLSymbol $sym28$HL_MODULE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list29;
    private static final SubLSymbol $sym30$HL_MOD_NAME;
    private static final SubLSymbol $sym31$_CSETF_HL_MOD_NAME;
    private static final SubLSymbol $sym32$HL_MOD_PLIST;
    private static final SubLSymbol $sym33$_CSETF_HL_MOD_PLIST;
    private static final SubLSymbol $sym34$HL_MOD_SENSE;
    private static final SubLSymbol $sym35$_CSETF_HL_MOD_SENSE;
    private static final SubLSymbol $sym36$HL_MOD_PREDICATE;
    private static final SubLSymbol $sym37$_CSETF_HL_MOD_PREDICATE;
    private static final SubLSymbol $sym38$HL_MOD_ANY_PREDICATES;
    private static final SubLSymbol $sym39$_CSETF_HL_MOD_ANY_PREDICATES;
    private static final SubLSymbol $sym40$HL_MOD_ARITY;
    private static final SubLSymbol $sym41$_CSETF_HL_MOD_ARITY;
    private static final SubLSymbol $sym42$HL_MOD_DIRECTION;
    private static final SubLSymbol $sym43$_CSETF_HL_MOD_DIRECTION;
    private static final SubLSymbol $sym44$HL_MOD_REQUIRED_PATTERN;
    private static final SubLSymbol $sym45$_CSETF_HL_MOD_REQUIRED_PATTERN;
    private static final SubLSymbol $sym46$HL_MOD_REQUIRED_MT;
    private static final SubLSymbol $sym47$_CSETF_HL_MOD_REQUIRED_MT;
    private static final SubLSymbol $sym48$HL_MOD_EXCLUSIVE_FUNC;
    private static final SubLSymbol $sym49$_CSETF_HL_MOD_EXCLUSIVE_FUNC;
    private static final SubLSymbol $sym50$HL_MOD_REQUIRED_FUNC;
    private static final SubLSymbol $sym51$_CSETF_HL_MOD_REQUIRED_FUNC;
    private static final SubLSymbol $sym52$HL_MOD_COMPLETENESS;
    private static final SubLSymbol $sym53$_CSETF_HL_MOD_COMPLETENESS;
    private static final SubLSymbol $kw54$NAME;
    private static final SubLSymbol $kw55$PLIST;
    private static final SubLSymbol $kw56$SENSE;
    private static final SubLSymbol $kw57$PREDICATE;
    private static final SubLSymbol $kw58$ANY_PREDICATES;
    private static final SubLSymbol $kw59$ARITY;
    private static final SubLSymbol $kw60$DIRECTION;
    private static final SubLSymbol $kw61$REQUIRED_PATTERN;
    private static final SubLSymbol $kw62$REQUIRED_MT;
    private static final SubLSymbol $kw63$EXCLUSIVE_FUNC;
    private static final SubLSymbol $kw64$REQUIRED_FUNC;
    private static final SubLSymbol $kw65$COMPLETENESS;
    private static final SubLString $str66$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw67$BEGIN;
    private static final SubLSymbol $sym68$MAKE_HL_MODULE;
    private static final SubLSymbol $kw69$SLOT;
    private static final SubLSymbol $kw70$END;
    private static final SubLSymbol $sym71$VISIT_DEFSTRUCT_OBJECT_HL_MODULE_METHOD;
    private static final SubLString $str72$_HL_Module___a_;
    private static final SubLSymbol $sym73$SXHASH_HL_MODULE_METHOD;
    private static final SubLSymbol $sym74$PROPERTY_LIST_P;
    private static final SubLSymbol $sym75$HL_MODULE_PROPERTY_P;
    private static final SubLSymbol $kw76$EXCLUSIVE;
    private static final SubLSymbol $kw77$SUPPLANTS;
    private static final SubLString $str78$_supplants_is_meaningless_without;
    private static final SubLSymbol $sym79$CFASL_CREATE_INVALID_HL_MODULE;
    private static final SubLList $list80;
    private static final SubLSymbol $sym81$_CFASL_CREATE_INVALID_HL_MODULE_CACHING_STATE_;
    private static final SubLSymbol $kw82$FREE;
    private static final SubLSymbol $kw83$DEFAULT;
    private static final SubLSymbol $sym84$_HL_MODULE_STORE_;
    private static final SubLInteger $int85$212;
    private static final SubLList $list86;
    private static final SubLList $list87;
    private static final SubLSymbol $kw88$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw89$DONE;
    private static final SubLSymbol $sym90$NAME_VAR;
    private static final SubLSymbol $sym91$DO_HASH_TABLE;
    private static final SubLList $list92;
    private static final SubLSymbol $sym93$IGNORE;
    private static final SubLSymbol $sym94$HL_MODULE_STORE;
    private static final SubLSymbol $sym95$DO_HL_MODULES;
    private static final SubLSymbol $kw96$ABDUCTION;
    private static final SubLSymbol $kw97$UNIVERSAL;
    private static final SubLSymbol $kw98$MODULE_SOURCE;
    private static final SubLSymbol $kw99$ANYTHING;
    private static final SubLSymbol $kw100$REQUIRED;
    private static final SubLSymbol $kw101$COST_PATTERN;
    private static final SubLSymbol $kw102$COST_EXPRESSION;
    private static final SubLSymbol $kw103$COST;
    private static final SubLSymbol $kw104$CHECK;
    private static final SubLSymbol $kw105$UNKNOWN;
    private static final SubLSymbol $kw106$NOT_FULLY_BOUND;
    private static final SubLString $str107$check;
    private static final SubLSymbol $kw108$RULE_SELECT;
    private static final SubLSymbol $kw109$RULE_FILTER;
    private static final SubLSymbol $kw110$EXPAND;
    private static final SubLSymbol $kw111$REMOVAL;
    private static final SubLSymbol $sym112$INFERENCE_REMOVE_CHECK_DEFAULT;
    private static final SubLSymbol $sym113$INFERENCE_REMOVE_UNIFY_DEFAULT;
    private static final SubLSymbol $sym114$DEFAULT_EXPAND_FUNC;
    private static final SubLSymbol $kw115$EXPAND_PATTERN;
    private static final SubLSymbol $kw116$EXPAND_ITERATIVE_PATTERN;
    private static final SubLSymbol $sym117$PATTERN_MATCHES_FORMULA;
    private static final SubLSymbol $kw118$FORWARD;
    private static final SubLSymbol $kw119$INPUT_EXTRACT_PATTERN;
    private static final SubLSymbol $kw120$INPUT_VERIFY_PATTERN;
    private static final SubLSymbol $kw121$INPUT_ENCODE_PATTERN;
    private static final SubLSymbol $kw122$OUTPUT_CHECK_PATTERN;
    private static final SubLSymbol $kw123$OUTPUT_GENERATE_PATTERN;
    private static final SubLSymbol $kw124$OUTPUT_DECODE_PATTERN;
    private static final SubLSymbol $kw125$OUTPUT_VERIFY_PATTERN;
    private static final SubLSymbol $kw126$OUTPUT_CONSTRUCT_PATTERN;
    private static final SubLSymbol $kw127$SUPPORT_PATTERN;
    private static final SubLSymbol $kw128$SUPPORT;
    private static final SubLSymbol $kw129$SUPPORT_MODULE;
    private static final SubLSymbol $kw130$SUPPORT_MT;
    private static final SubLSymbol $kw131$SUPPORT_STRENGTH;
    private static final SubLSymbol $kw132$EVERY_PREDICATES;
    private static final SubLSymbol $kw133$APPLICABILITY;
    private static final SubLSymbol $kw134$APPLICABILITY_PATTERN;
    private static final SubLSymbol $kw135$DOCUMENTATION;
    private static final SubLSymbol $kw136$EXAMPLE;
    private static final SubLSymbol $kw137$COMPLETE;
    private static final SubLSymbol $kw138$INCOMPLETE;
    private static final SubLSymbol $kw139$COMPLETE_PATTERN;
    private static final SubLSymbol $kw140$COMPLETENESS_PATTERN;
    private static final SubLSymbol $kw141$EXTERNAL;
    private static final SubLSymbol $sym142$FUNCTION_SYMBOL_P;
    private static final SubLList $list143;
    private static final SubLSymbol $sym144$STRING_LESSP;
    private static final SubLSymbol $sym145$SYMBOL_NAME;
    private static final SubLSymbol $sym146$_REMOVAL_MODULES_;
    private static final SubLList $list147;
    private static final SubLSymbol $sym148$DO_SET;
    private static final SubLList $list149;
    private static final SubLSymbol $sym150$REMOVAL_MODULES;
    private static final SubLSymbol $sym151$DO_REMOVAL_MODULES;
    private static final SubLSymbol $sym152$_REMOVAL_MODULES_EXTERNAL_;
    private static final SubLSymbol $sym153$_REMOVAL_MODULES_GENERIC_;
    private static final SubLSymbol $sym154$HL_MODULE_SENSE;
    private static final SubLSymbol $sym155$_REMOVAL_MODULES_UNIVERSAL_;
    private static final SubLSymbol $sym156$_REMOVAL_MODULES_SPECIFIC_;
    private static final SubLInteger $int157$32;
    private static final SubLSymbol $sym158$FORT_P;
    private static final SubLSymbol $sym159$_REMOVAL_MODULES_SPECIFIC_USE_GENERIC_;
    private static final SubLSymbol $sym160$_REMOVAL_MODULES_SPECIFIC_USE_META_REMOVAL_;
    private static final SubLSymbol $sym161$_REMOVAL_MODULES_SPECIFIC_DONT_USE_UNIVERSAL_;
    private static final SubLSymbol $sym162$_SOLELY_SPECIFIC_REMOVAL_MODULE_PREDICATE_STORE_;
    private static final SubLInteger $int163$50;
    private static final SubLSymbol $kw164$POS;
    private static final SubLSymbol $kw165$NEG;
    private static final SubLString $str166$removal_module__S_must_have_a__SE;
    private static final SubLSymbol $sym167$CAR;
    private static final SubLList $list168;
    private static final SubLSymbol $sym169$INFERENCE_REMOVAL_MODULE__FOR_CLASSIFICATION;
    private static final SubLSymbol $sym170$REMOVAL_MODULE_SPECIFIC_USE_GENERIC_;
    private static final SubLList $list171;
    private static final SubLSymbol $kw172$PRUNING;
    private static final SubLSymbol $sym173$_CONJUNCTIVE_REMOVAL_MODULES_;
    private static final SubLList $list174;
    private static final SubLList $list175;
    private static final SubLSymbol $sym176$REMOVAL_MODULES_CONJUNCTIVE;
    private static final SubLSymbol $sym177$DO_CONJUNCTIVE_REMOVAL_MODULES;
    private static final SubLSymbol $kw178$REMOVAL_CONJUNCTIVE;
    private static final SubLList $list179;
    private static final SubLSymbol $sym180$META_REMOVAL_MODULES;
    private static final SubLSymbol $sym181$DO_META_REMOVAL_MODULES;
    private static final SubLSymbol $kw182$META_REMOVAL;
    private static final SubLSymbol $sym183$_TRANSFORMATION_MODULES_;
    private static final SubLList $list184;
    private static final SubLSymbol $sym185$TRANSFORMATION_MODULES;
    private static final SubLSymbol $sym186$DO_TRANSFORMATION_MODULES;
    private static final SubLSymbol $kw187$TRANSFORMATION;
    private static final SubLSymbol $sym188$_META_TRANSFORMATION_MODULES_;
    private static final SubLList $list189;
    private static final SubLSymbol $sym190$META_TRANSFORMATION_MODULES;
    private static final SubLSymbol $sym191$DO_META_TRANSFORMATION_MODULES;
    private static final SubLSymbol $kw192$META_TRANSFORMATION;
    private static final SubLSymbol $sym193$_REWRITE_MODULES_;
    private static final SubLList $list194;
    private static final SubLSymbol $kw195$REWRITE_SUPPORT;
    private static final SubLSymbol $kw196$REWRITE_CLOSURE;
    private static final SubLSymbol $kw197$REWRITE;
    private static final SubLString $str198$rewrite_module__S_must_have_a__SE;
    private static final SubLSymbol $sym199$_STRUCTURAL_MODULES_;
    private static final SubLSymbol $kw200$STRUCTURAL;
    private static final SubLSymbol $sym201$_META_STRUCTURAL_MODULES_;
    private static final SubLList $list202;
    private static final SubLSymbol $sym203$META_STRUCTURAL_MODULES;
    private static final SubLSymbol $sym204$DO_META_STRUCTURAL_MODULES;
    private static final SubLSymbol $kw205$META_STRUCTURAL;
    private static final SubLInteger $int206$256;
    private static final SubLSymbol $sym207$CFASL_INPUT_HL_MODULE;
    private static final SubLSymbol $sym208$CFASL_OUTPUT_OBJECT_HL_MODULE_METHOD;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 3019L)
    public static SubLObject hl_module_property_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isKeyword() && inference_modules.NIL != subl_promotions.memberP(v_object, inference_modules.$hl_module_properties$.getGlobalValue(), (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 3146L)
    public static SubLObject do_hl_module_properties(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_modules.$list2);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject property_var = (SubLObject)inference_modules.NIL;
        SubLObject value_var = (SubLObject)inference_modules.NIL;
        SubLObject hl_module = (SubLObject)inference_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_modules.$list2);
        property_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_modules.$list2);
        value_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_modules.$list2);
        hl_module = current.first();
        current = current.rest();
        if (inference_modules.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject module_var = (SubLObject)inference_modules.$sym3$MODULE_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)inference_modules.$sym4$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module_var, hl_module)), (SubLObject)ConsesLow.list((SubLObject)inference_modules.$sym5$DO_LIST, reader.bq_cons(property_var, (SubLObject)inference_modules.$list6), (SubLObject)ConsesLow.list((SubLObject)inference_modules.$sym7$PWHEN, (SubLObject)ConsesLow.list((SubLObject)inference_modules.$sym8$HL_MODULE_PROPERTY_NOT_DEFAULT_, module_var, property_var), (SubLObject)ConsesLow.listS((SubLObject)inference_modules.$sym4$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(value_var, (SubLObject)ConsesLow.list((SubLObject)inference_modules.$sym9$HL_MODULE_PROPERTY_WITHOUT_VALUES, module_var, property_var))), ConsesLow.append(body, (SubLObject)inference_modules.NIL)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_modules.$list2);
        return (SubLObject)inference_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 3543L)
    public static SubLObject hl_module_properties() {
        return inference_modules.$hl_module_properties$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 3618L)
    public static SubLObject removal_module_plist_indicators() {
        return hl_module_properties();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 3908L)
    public static SubLObject hl_module_subtype_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, inference_modules.$valid_hl_module_subtypes$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 5520L)
    public static SubLObject allowed_modules_spec_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_modules.$kw15$ALL == v_object || inference_modules.NIL != disjunctive_allowed_modules_spec_p(v_object) || inference_modules.NIL != conjunctive_allowed_modules_spec_p(v_object) || inference_modules.NIL != negated_allowed_modules_spec_p(v_object) || inference_modules.NIL != hl_module_type_spec_p(v_object) || inference_modules.NIL != hl_module_subtype_spec_p(v_object) || inference_modules.NIL != property_allowed_modules_spec_p(v_object) || inference_modules.NIL != find_hl_module_by_name(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 6872L)
    public static SubLObject non_universal_allowed_modules_spec_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_modules.$kw15$ALL != v_object && inference_modules.NIL != allowed_modules_spec_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 7061L)
    public static SubLObject disjunctive_allowed_modules_spec_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isCons() && inference_modules.$kw16$OR == v_object.first() && inference_modules.NIL != list_utilities.list_of_type_p((SubLObject)inference_modules.$sym17$ALLOWED_MODULES_SPEC_P, v_object.rest()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 7244L)
    public static SubLObject conjunctive_allowed_modules_spec_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isCons() && inference_modules.$kw18$AND == v_object.first() && inference_modules.NIL != list_utilities.list_of_type_p((SubLObject)inference_modules.$sym17$ALLOWED_MODULES_SPEC_P, v_object.rest()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 7428L)
    public static SubLObject negated_allowed_modules_spec_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isCons() && inference_modules.$kw19$NOT == v_object.first() && inference_modules.NIL != list_utilities.list_of_type_p((SubLObject)inference_modules.$sym17$ALLOWED_MODULES_SPEC_P, v_object.rest()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 7608L)
    public static SubLObject hl_module_type_spec_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_modules.NIL != list_utilities.doubletonP(v_object) && inference_modules.$kw20$MODULE_TYPE == v_object.first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 7731L)
    public static SubLObject hl_module_subtype_spec_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_modules.NIL != list_utilities.doubletonP(v_object) && inference_modules.$kw13$MODULE_SUBTYPE == v_object.first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 7860L)
    public static SubLObject property_allowed_modules_spec_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_modules.NIL != list_utilities.doubletonP(v_object) && inference_modules.NIL != hl_module_property_p(v_object.first()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 7998L)
    public static SubLObject hl_module_allowedP(final SubLObject hl_module, final SubLObject allowed_modules_spec) {
        assert inference_modules.NIL != hl_module_p(hl_module) : hl_module;
        assert inference_modules.NIL != allowed_modules_spec_p(allowed_modules_spec) : allowed_modules_spec;
        return hl_module_allowed_by_allowed_modules_specP(hl_module, allowed_modules_spec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 8872L)
    public static SubLObject hl_module_allowed_by_allowed_modules_specP(final SubLObject hl_module, final SubLObject allowed_modules_spec) {
        if (inference_modules.$kw15$ALL == allowed_modules_spec) {
            return (SubLObject)inference_modules.T;
        }
        if (inference_modules.NIL != disjunctive_allowed_modules_spec_p(allowed_modules_spec)) {
            SubLObject cdolist_list_var = allowed_modules_spec.rest();
            SubLObject allowed_modules_subspec = (SubLObject)inference_modules.NIL;
            allowed_modules_subspec = cdolist_list_var.first();
            while (inference_modules.NIL != cdolist_list_var) {
                if (inference_modules.NIL != hl_module_allowed_by_allowed_modules_specP(hl_module, allowed_modules_subspec)) {
                    return (SubLObject)inference_modules.T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                allowed_modules_subspec = cdolist_list_var.first();
            }
            return (SubLObject)inference_modules.NIL;
        }
        if (inference_modules.NIL != conjunctive_allowed_modules_spec_p(allowed_modules_spec)) {
            SubLObject cdolist_list_var = allowed_modules_spec.rest();
            SubLObject allowed_modules_subspec = (SubLObject)inference_modules.NIL;
            allowed_modules_subspec = cdolist_list_var.first();
            while (inference_modules.NIL != cdolist_list_var) {
                if (inference_modules.NIL == hl_module_allowed_by_allowed_modules_specP(hl_module, allowed_modules_subspec)) {
                    return (SubLObject)inference_modules.NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                allowed_modules_subspec = cdolist_list_var.first();
            }
            return (SubLObject)inference_modules.T;
        }
        if (inference_modules.NIL != negated_allowed_modules_spec_p(allowed_modules_spec)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(inference_modules.NIL == hl_module_allowed_by_allowed_modules_specP(hl_module, conses_high.second(allowed_modules_spec)));
        }
        if (inference_modules.NIL != hl_module_type_spec_p(allowed_modules_spec)) {
            return Equality.eql(conses_high.second(allowed_modules_spec), hl_module_type(hl_module));
        }
        if (inference_modules.NIL != hl_module_subtype_spec_p(allowed_modules_spec)) {
            return subl_promotions.memberP(conses_high.second(allowed_modules_spec), hl_module_subtypes(hl_module), (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED);
        }
        if (inference_modules.NIL != property_allowed_modules_spec_p(allowed_modules_spec)) {
            final SubLObject property = allowed_modules_spec.first();
            final SubLObject allowed_value = conses_high.second(allowed_modules_spec);
            final SubLObject actual_value = hl_module_property_without_values(hl_module, property);
            return Equality.equal(allowed_value, actual_value);
        }
        return Equality.eql(hl_module, find_hl_module_by_name(allowed_modules_spec));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 10326L)
    public static SubLObject simple_allowed_modules_spec_p(final SubLObject allowed_modules_spec) {
        if (inference_modules.NIL != find_hl_module_by_name(allowed_modules_spec)) {
            return (SubLObject)inference_modules.T;
        }
        if (inference_modules.NIL != disjunctive_allowed_modules_spec_p(allowed_modules_spec)) {
            SubLObject cdolist_list_var = allowed_modules_spec.rest();
            SubLObject allowed_modules_subspec = (SubLObject)inference_modules.NIL;
            allowed_modules_subspec = cdolist_list_var.first();
            while (inference_modules.NIL != cdolist_list_var) {
                if (inference_modules.NIL == simple_allowed_modules_spec_p(allowed_modules_subspec)) {
                    return (SubLObject)inference_modules.NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                allowed_modules_subspec = cdolist_list_var.first();
            }
            return (SubLObject)inference_modules.T;
        }
        if (inference_modules.NIL != conjunctive_allowed_modules_spec_p(allowed_modules_spec)) {
            SubLObject cdolist_list_var = allowed_modules_spec.rest();
            SubLObject allowed_modules_subspec = (SubLObject)inference_modules.NIL;
            allowed_modules_subspec = cdolist_list_var.first();
            while (inference_modules.NIL != cdolist_list_var) {
                if (inference_modules.NIL == simple_allowed_modules_spec_p(allowed_modules_subspec)) {
                    return (SubLObject)inference_modules.NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                allowed_modules_subspec = cdolist_list_var.first();
            }
            return (SubLObject)inference_modules.T;
        }
        if (inference_modules.$kw15$ALL == allowed_modules_spec || inference_modules.NIL != negated_allowed_modules_spec_p(allowed_modules_spec) || inference_modules.NIL != hl_module_type_spec_p(allowed_modules_spec) || inference_modules.NIL != hl_module_subtype_spec_p(allowed_modules_spec) || inference_modules.NIL != property_allowed_modules_spec_p(allowed_modules_spec)) {
            return (SubLObject)inference_modules.NIL;
        }
        return (SubLObject)inference_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 11232L)
    public static SubLObject get_modules_from_simple_allowed_modules_spec(final SubLObject allowed_modules_spec) {
        if (inference_modules.NIL != disjunctive_allowed_modules_spec_p(allowed_modules_spec)) {
            SubLObject module_specs = (SubLObject)inference_modules.NIL;
            SubLObject cdolist_list_var = allowed_modules_spec.rest();
            SubLObject allowed_modules_subspec = (SubLObject)inference_modules.NIL;
            allowed_modules_subspec = cdolist_list_var.first();
            while (inference_modules.NIL != cdolist_list_var) {
                module_specs = ConsesLow.append(module_specs, get_modules_from_simple_allowed_modules_spec(allowed_modules_subspec));
                cdolist_list_var = cdolist_list_var.rest();
                allowed_modules_subspec = cdolist_list_var.first();
            }
            return module_specs;
        }
        if (inference_modules.NIL != conjunctive_allowed_modules_spec_p(allowed_modules_spec)) {
            SubLObject module_specs = (SubLObject)inference_modules.NIL;
            SubLObject cdolist_list_var = allowed_modules_spec.rest();
            SubLObject allowed_modules_subspec = (SubLObject)inference_modules.NIL;
            allowed_modules_subspec = cdolist_list_var.first();
            while (inference_modules.NIL != cdolist_list_var) {
                module_specs = ConsesLow.append(module_specs, get_modules_from_simple_allowed_modules_spec(allowed_modules_subspec));
                cdolist_list_var = cdolist_list_var.rest();
                allowed_modules_subspec = cdolist_list_var.first();
            }
            return module_specs;
        }
        return (SubLObject)ConsesLow.list(find_hl_module_by_name(allowed_modules_spec));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
    public static SubLObject hl_module_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_hl_module(v_object, stream, (SubLObject)inference_modules.ZERO_INTEGER);
        return (SubLObject)inference_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
    public static SubLObject hl_module_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $hl_module_native.class) ? inference_modules.T : inference_modules.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
    public static SubLObject hl_mod_name(final SubLObject v_object) {
        assert inference_modules.NIL != hl_module_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
    public static SubLObject hl_mod_plist(final SubLObject v_object) {
        assert inference_modules.NIL != hl_module_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
    public static SubLObject hl_mod_sense(final SubLObject v_object) {
        assert inference_modules.NIL != hl_module_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
    public static SubLObject hl_mod_predicate(final SubLObject v_object) {
        assert inference_modules.NIL != hl_module_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
    public static SubLObject hl_mod_any_predicates(final SubLObject v_object) {
        assert inference_modules.NIL != hl_module_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
    public static SubLObject hl_mod_arity(final SubLObject v_object) {
        assert inference_modules.NIL != hl_module_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
    public static SubLObject hl_mod_direction(final SubLObject v_object) {
        assert inference_modules.NIL != hl_module_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
    public static SubLObject hl_mod_required_pattern(final SubLObject v_object) {
        assert inference_modules.NIL != hl_module_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
    public static SubLObject hl_mod_required_mt(final SubLObject v_object) {
        assert inference_modules.NIL != hl_module_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
    public static SubLObject hl_mod_exclusive_func(final SubLObject v_object) {
        assert inference_modules.NIL != hl_module_p(v_object) : v_object;
        return v_object.getField11();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
    public static SubLObject hl_mod_required_func(final SubLObject v_object) {
        assert inference_modules.NIL != hl_module_p(v_object) : v_object;
        return v_object.getField12();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
    public static SubLObject hl_mod_completeness(final SubLObject v_object) {
        assert inference_modules.NIL != hl_module_p(v_object) : v_object;
        return v_object.getField13();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
    public static SubLObject _csetf_hl_mod_name(final SubLObject v_object, final SubLObject value) {
        assert inference_modules.NIL != hl_module_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
    public static SubLObject _csetf_hl_mod_plist(final SubLObject v_object, final SubLObject value) {
        assert inference_modules.NIL != hl_module_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
    public static SubLObject _csetf_hl_mod_sense(final SubLObject v_object, final SubLObject value) {
        assert inference_modules.NIL != hl_module_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
    public static SubLObject _csetf_hl_mod_predicate(final SubLObject v_object, final SubLObject value) {
        assert inference_modules.NIL != hl_module_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
    public static SubLObject _csetf_hl_mod_any_predicates(final SubLObject v_object, final SubLObject value) {
        assert inference_modules.NIL != hl_module_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
    public static SubLObject _csetf_hl_mod_arity(final SubLObject v_object, final SubLObject value) {
        assert inference_modules.NIL != hl_module_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
    public static SubLObject _csetf_hl_mod_direction(final SubLObject v_object, final SubLObject value) {
        assert inference_modules.NIL != hl_module_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
    public static SubLObject _csetf_hl_mod_required_pattern(final SubLObject v_object, final SubLObject value) {
        assert inference_modules.NIL != hl_module_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
    public static SubLObject _csetf_hl_mod_required_mt(final SubLObject v_object, final SubLObject value) {
        assert inference_modules.NIL != hl_module_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
    public static SubLObject _csetf_hl_mod_exclusive_func(final SubLObject v_object, final SubLObject value) {
        assert inference_modules.NIL != hl_module_p(v_object) : v_object;
        return v_object.setField11(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
    public static SubLObject _csetf_hl_mod_required_func(final SubLObject v_object, final SubLObject value) {
        assert inference_modules.NIL != hl_module_p(v_object) : v_object;
        return v_object.setField12(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
    public static SubLObject _csetf_hl_mod_completeness(final SubLObject v_object, final SubLObject value) {
        assert inference_modules.NIL != hl_module_p(v_object) : v_object;
        return v_object.setField13(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
    public static SubLObject make_hl_module(SubLObject arglist) {
        if (arglist == inference_modules.UNPROVIDED) {
            arglist = (SubLObject)inference_modules.NIL;
        }
        final SubLObject v_new = (SubLObject)new $hl_module_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)inference_modules.NIL, next = arglist; inference_modules.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)inference_modules.$kw54$NAME)) {
                _csetf_hl_mod_name(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_modules.$kw55$PLIST)) {
                _csetf_hl_mod_plist(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_modules.$kw56$SENSE)) {
                _csetf_hl_mod_sense(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_modules.$kw57$PREDICATE)) {
                _csetf_hl_mod_predicate(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_modules.$kw58$ANY_PREDICATES)) {
                _csetf_hl_mod_any_predicates(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_modules.$kw59$ARITY)) {
                _csetf_hl_mod_arity(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_modules.$kw60$DIRECTION)) {
                _csetf_hl_mod_direction(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_modules.$kw61$REQUIRED_PATTERN)) {
                _csetf_hl_mod_required_pattern(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_modules.$kw62$REQUIRED_MT)) {
                _csetf_hl_mod_required_mt(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_modules.$kw63$EXCLUSIVE_FUNC)) {
                _csetf_hl_mod_exclusive_func(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_modules.$kw64$REQUIRED_FUNC)) {
                _csetf_hl_mod_required_func(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_modules.$kw65$COMPLETENESS)) {
                _csetf_hl_mod_completeness(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)inference_modules.$str66$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
    public static SubLObject visit_defstruct_hl_module(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_modules.$kw67$BEGIN, (SubLObject)inference_modules.$sym68$MAKE_HL_MODULE, (SubLObject)inference_modules.TWELVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_modules.$kw69$SLOT, (SubLObject)inference_modules.$kw54$NAME, hl_mod_name(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_modules.$kw69$SLOT, (SubLObject)inference_modules.$kw55$PLIST, hl_mod_plist(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_modules.$kw69$SLOT, (SubLObject)inference_modules.$kw56$SENSE, hl_mod_sense(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_modules.$kw69$SLOT, (SubLObject)inference_modules.$kw57$PREDICATE, hl_mod_predicate(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_modules.$kw69$SLOT, (SubLObject)inference_modules.$kw58$ANY_PREDICATES, hl_mod_any_predicates(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_modules.$kw69$SLOT, (SubLObject)inference_modules.$kw59$ARITY, hl_mod_arity(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_modules.$kw69$SLOT, (SubLObject)inference_modules.$kw60$DIRECTION, hl_mod_direction(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_modules.$kw69$SLOT, (SubLObject)inference_modules.$kw61$REQUIRED_PATTERN, hl_mod_required_pattern(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_modules.$kw69$SLOT, (SubLObject)inference_modules.$kw62$REQUIRED_MT, hl_mod_required_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_modules.$kw69$SLOT, (SubLObject)inference_modules.$kw63$EXCLUSIVE_FUNC, hl_mod_exclusive_func(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_modules.$kw69$SLOT, (SubLObject)inference_modules.$kw64$REQUIRED_FUNC, hl_mod_required_func(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_modules.$kw69$SLOT, (SubLObject)inference_modules.$kw65$COMPLETENESS, hl_mod_completeness(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_modules.$kw70$END, (SubLObject)inference_modules.$sym68$MAKE_HL_MODULE, (SubLObject)inference_modules.TWELVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12393L)
    public static SubLObject visit_defstruct_object_hl_module_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_hl_module(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 12898L)
    public static SubLObject print_hl_module(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLObject name = hl_module_name(v_object);
        PrintLow.format(stream, (SubLObject)inference_modules.$str72$_HL_Module___a_, name);
        return (SubLObject)inference_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 13068L)
    public static SubLObject sxhash_hl_module_method(final SubLObject v_object) {
        return Sxhash.sxhash(hl_mod_name(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 13151L)
    public static SubLObject check_hl_module_property_list(final SubLObject plist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert inference_modules.NIL != list_utilities.property_list_p(plist) : plist;
        SubLObject exclusive_specifiedP = (SubLObject)inference_modules.NIL;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        SubLObject pcase_var;
        for (remainder = (SubLObject)inference_modules.NIL, remainder = plist; inference_modules.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            value = conses_high.cadr(remainder);
            assert inference_modules.NIL != hl_module_property_p(property) : property;
            pcase_var = property;
            if (pcase_var.eql((SubLObject)inference_modules.$kw76$EXCLUSIVE)) {
                exclusive_specifiedP = (SubLObject)inference_modules.T;
            }
        }
        for (remainder = (SubLObject)inference_modules.NIL, remainder = plist; inference_modules.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            value = conses_high.cadr(remainder);
            pcase_var = property;
            if (pcase_var.eql((SubLObject)inference_modules.$kw77$SUPPLANTS) && inference_modules.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && inference_modules.NIL == exclusive_specifiedP) {
                Errors.error((SubLObject)inference_modules.$str78$_supplants_is_meaningless_without, plist);
            }
        }
        return (SubLObject)inference_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 13871L)
    public static SubLObject new_hl_module(final SubLObject name, SubLObject plist) {
        check_hl_module_property_list(plist);
        final SubLObject hl_module = allocate_hl_module(name);
        plist = canonicalize_hl_module_plist(plist);
        _csetf_hl_mod_plist(hl_module, plist);
        add_hl_module(hl_module);
        return hl_module;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 14253L)
    public static SubLObject clear_cfasl_create_invalid_hl_module() {
        final SubLObject cs = inference_modules.$cfasl_create_invalid_hl_module_caching_state$.getGlobalValue();
        if (inference_modules.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)inference_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 14253L)
    public static SubLObject remove_cfasl_create_invalid_hl_module(final SubLObject name) {
        return memoization_state.caching_state_remove_function_results_with_args(inference_modules.$cfasl_create_invalid_hl_module_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(name), (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 14253L)
    public static SubLObject cfasl_create_invalid_hl_module_internal(final SubLObject name) {
        return new_hl_module(name, (SubLObject)inference_modules.$list80);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 14253L)
    public static SubLObject cfasl_create_invalid_hl_module(final SubLObject name) {
        SubLObject caching_state = inference_modules.$cfasl_create_invalid_hl_module_caching_state$.getGlobalValue();
        if (inference_modules.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)inference_modules.$sym79$CFASL_CREATE_INVALID_HL_MODULE, (SubLObject)inference_modules.$sym81$_CFASL_CREATE_INVALID_HL_MODULE_CACHING_STATE_, (SubLObject)inference_modules.NIL, (SubLObject)inference_modules.EQUAL, (SubLObject)inference_modules.ONE_INTEGER, (SubLObject)inference_modules.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, name, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cfasl_create_invalid_hl_module_internal(name)));
            memoization_state.caching_state_put(caching_state, name, results, (SubLObject)inference_modules.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 14487L)
    public static SubLObject canonicalize_hl_module_plist(SubLObject plist) {
        final SubLObject module_subtypes = conses_high.getf(plist, (SubLObject)inference_modules.$kw13$MODULE_SUBTYPE, (SubLObject)inference_modules.UNPROVIDED);
        if (!module_subtypes.isList()) {
            plist = conses_high.putf(conses_high.copy_list(plist), (SubLObject)inference_modules.$kw13$MODULE_SUBTYPE, (SubLObject)ConsesLow.list(module_subtypes));
        }
        return plist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 14844L)
    public static SubLObject allocate_hl_module(final SubLObject name) {
        SubLObject hl_module = find_hl_module_by_name(name);
        if (inference_modules.NIL != hl_module) {
            remove_hl_module(hl_module);
        }
        else {
            hl_module = make_hl_module((SubLObject)inference_modules.UNPROVIDED);
            _csetf_hl_mod_name(hl_module, name);
        }
        _csetf_hl_mod_plist(hl_module, (SubLObject)inference_modules.NIL);
        return hl_module;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 15143L)
    public static SubLObject destroy_hl_module(final SubLObject hl_module) {
        remove_hl_module(hl_module);
        _csetf_hl_mod_plist(hl_module, (SubLObject)inference_modules.$kw82$FREE);
        return (SubLObject)inference_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 15291L)
    public static SubLObject hl_module_name(final SubLObject hl_module) {
        assert inference_modules.NIL != hl_module_p(hl_module) : hl_module;
        return hl_mod_name(hl_module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 15486L)
    public static SubLObject hl_module_plist(final SubLObject hl_module) {
        return hl_mod_plist(hl_module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 15603L)
    public static SubLObject hl_module_property(final SubLObject hl_module, final SubLObject property) {
        final SubLObject plist = hl_module_plist(hl_module);
        final SubLObject value = conses_high.getf(plist, property, (SubLObject)inference_modules.$kw83$DEFAULT);
        if (value == inference_modules.$kw83$DEFAULT) {
            final SubLObject v_default = dictionary.dictionary_lookup_without_values(inference_modules.$hl_module_property_defaults$.getGlobalValue(), property, (SubLObject)inference_modules.UNPROVIDED);
            return subl_promotions.values2(v_default, (SubLObject)inference_modules.T);
        }
        return subl_promotions.values2(value, (SubLObject)inference_modules.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 16228L)
    public static SubLObject hl_module_property_without_values(final SubLObject hl_module, final SubLObject property) {
        final SubLObject plist = hl_module_plist(hl_module);
        SubLObject value = conses_high.getf(plist, property, (SubLObject)inference_modules.$kw83$DEFAULT);
        if (value == inference_modules.$kw83$DEFAULT) {
            value = dictionary.dictionary_lookup_without_values(inference_modules.$hl_module_property_defaults$.getGlobalValue(), property, (SubLObject)inference_modules.UNPROVIDED);
        }
        return value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 16827L)
    public static SubLObject hl_module_property_not_defaultP(final SubLObject hl_module, final SubLObject property) {
        final SubLObject value = hl_module_property_without_values(hl_module, property);
        final SubLObject v_default = dictionary.dictionary_lookup_without_values(inference_modules.$hl_module_property_defaults$.getGlobalValue(), property, (SubLObject)inference_modules.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(!value.equal(v_default));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 17736L)
    public static SubLObject do_hl_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_modules.$list86);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject hl_module_var = (SubLObject)inference_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_modules.$list86);
        hl_module_var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)inference_modules.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)inference_modules.NIL;
        SubLObject current_$1 = (SubLObject)inference_modules.NIL;
        while (inference_modules.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_modules.$list86);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_modules.$list86);
            if (inference_modules.NIL == conses_high.member(current_$1, (SubLObject)inference_modules.$list87, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED)) {
                bad = (SubLObject)inference_modules.T;
            }
            if (current_$1 == inference_modules.$kw88$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (inference_modules.NIL != bad && inference_modules.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_modules.$list86);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)inference_modules.$kw89$DONE, current);
        final SubLObject done = (SubLObject)((inference_modules.NIL != done_tail) ? conses_high.cadr(done_tail) : inference_modules.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject name_var = (SubLObject)inference_modules.$sym90$NAME_VAR;
        return (SubLObject)ConsesLow.listS((SubLObject)inference_modules.$sym91$DO_HASH_TABLE, (SubLObject)ConsesLow.list(name_var, hl_module_var, (SubLObject)inference_modules.$list92, (SubLObject)inference_modules.$kw89$DONE, done), (SubLObject)ConsesLow.list((SubLObject)inference_modules.$sym93$IGNORE, name_var), ConsesLow.append(body, (SubLObject)inference_modules.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 17971L)
    public static SubLObject hl_module_store() {
        return inference_modules.$hl_module_store$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 18064L)
    public static SubLObject find_hl_module_by_name(final SubLObject name) {
        final SubLObject hl_module = Hashtables.gethash_without_values(name, inference_modules.$hl_module_store$.getGlobalValue(), (SubLObject)inference_modules.UNPROVIDED);
        return hl_module;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 18216L)
    public static SubLObject add_hl_module(final SubLObject hl_module) {
        final SubLObject name = hl_module_name(hl_module);
        Hashtables.sethash(name, inference_modules.$hl_module_store$.getGlobalValue(), hl_module);
        return hl_module;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 18422L)
    public static SubLObject remove_hl_module(final SubLObject hl_module) {
        final SubLObject name = hl_module_name(hl_module);
        Hashtables.remhash(name, inference_modules.$hl_module_store$.getGlobalValue());
        return hl_module;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 18609L)
    public static SubLObject setup_module(final SubLObject name, final SubLObject type, final SubLObject plist) {
        SubLObject new_plist = conses_high.copy_list(plist);
        new_plist = conses_high.putf(plist, (SubLObject)inference_modules.$kw20$MODULE_TYPE, type);
        final SubLObject hl_module = new_hl_module(name, new_plist);
        return hl_module;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 18890L)
    public static SubLObject default_cost_func(SubLObject v_object) {
        if (v_object == inference_modules.UNPROVIDED) {
            v_object = (SubLObject)inference_modules.NIL;
        }
        return (SubLObject)inference_modules.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 18975L)
    public static SubLObject default_expand_func(SubLObject arg1, SubLObject arg2) {
        if (arg1 == inference_modules.UNPROVIDED) {
            arg1 = (SubLObject)inference_modules.NIL;
        }
        if (arg2 == inference_modules.UNPROVIDED) {
            arg2 = (SubLObject)inference_modules.NIL;
        }
        return (SubLObject)inference_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 19068L)
    public static SubLObject hl_module_type(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, (SubLObject)inference_modules.$kw20$MODULE_TYPE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 19193L)
    public static SubLObject hl_module_subtypes(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, (SubLObject)inference_modules.$kw13$MODULE_SUBTYPE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 19311L)
    public static SubLObject abductive_hl_moduleP(final SubLObject hl_module) {
        return list_utilities.member_eqP((SubLObject)inference_modules.$kw96$ABDUCTION, hl_module_subtypes(hl_module));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 19427L)
    public static SubLObject hl_module_universal(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, (SubLObject)inference_modules.$kw97$UNIVERSAL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 19544L)
    public static SubLObject hl_module_source(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, (SubLObject)inference_modules.$kw98$MODULE_SOURCE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 19702L)
    public static SubLObject hl_module_sense(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, (SubLObject)inference_modules.$kw56$SENSE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 19808L)
    public static SubLObject hl_module_sense_relevant_p(final SubLObject hl_module, final SubLObject sense) {
        final SubLObject module_sense = hl_module_sense(hl_module);
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_modules.NIL == module_sense || module_sense.eql(sense));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 19992L)
    public static SubLObject hl_module_required_pattern(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, (SubLObject)inference_modules.$kw61$REQUIRED_PATTERN);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 20120L)
    public static SubLObject hl_module_required_pattern_matched_p(final SubLObject hl_module, final SubLObject asent) {
        final SubLObject pattern = hl_module_required_pattern(hl_module);
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_modules.$kw99$ANYTHING == pattern || inference_modules.NIL != formula_pattern_match.pattern_matches_formula_without_bindings(pattern, asent));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 20355L)
    public static SubLObject hl_module_required_mt(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, (SubLObject)inference_modules.$kw62$REQUIRED_MT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 20473L)
    public static SubLObject hl_module_required_mt_result(final SubLObject hl_module) {
        final SubLObject required_mt_prop = hl_module_required_mt(hl_module);
        if (inference_modules.NIL != required_mt_prop) {
            return interpret_hl_module_mt_prop(required_mt_prop);
        }
        return (SubLObject)inference_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 20761L)
    public static SubLObject interpret_hl_module_mt_prop(final SubLObject mt_prop) {
        if (inference_modules.NIL != hlmt.hlmt_p(mt_prop)) {
            return mt_prop;
        }
        if (mt_prop.isSymbol() && inference_modules.NIL != Symbols.boundp(mt_prop)) {
            return Symbols.symbol_value(mt_prop);
        }
        return eval_in_api.possibly_cyc_api_eval(mt_prop);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 20990L)
    public static SubLObject hl_module_required_mt_relevantP(final SubLObject hl_module) {
        final SubLObject required_mt = hl_module_required_mt_result(hl_module);
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_modules.NIL == required_mt || inference_modules.NIL != mt_relevance_macros.relevant_mtP(required_mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 21186L)
    public static SubLObject hl_module_required_func(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, (SubLObject)inference_modules.$kw100$REQUIRED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 21303L)
    public static SubLObject hl_module_required_func_p(final SubLObject hl_module, final SubLObject asent) {
        final SubLObject required_func = hl_module_required_func(hl_module);
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_modules.NIL == required_func || inference_modules.NIL != Functions.funcall(required_func, asent));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 21501L)
    public static SubLObject hl_module_cost_pattern(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, (SubLObject)inference_modules.$kw101$COST_PATTERN);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 21621L)
    public static SubLObject hl_module_cost_expression(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, (SubLObject)inference_modules.$kw102$COST_EXPRESSION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 21747L)
    public static SubLObject hl_module_cost_func(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, (SubLObject)inference_modules.$kw103$COST);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 21856L)
    public static SubLObject hl_module_cost(final SubLObject hl_module, final SubLObject v_object, SubLObject sense) {
        if (sense == inference_modules.UNPROVIDED) {
            sense = (SubLObject)inference_modules.NIL;
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
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 22349L)
    public static SubLObject hl_module_asent_cost(final SubLObject hl_module, final SubLObject asent) {
        return hl_module_cost(hl_module, asent, (SubLObject)inference_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 22467L)
    public static SubLObject hl_module_clause_cost(final SubLObject hl_module, final SubLObject contextualized_dnf_clause) {
        return hl_module_cost(hl_module, contextualized_dnf_clause, (SubLObject)inference_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 22626L)
    public static SubLObject hl_module_cost_pattern_result(final SubLObject hl_module, final SubLObject formula) {
        final SubLObject cost_pattern = hl_module_cost_pattern(hl_module);
        if (inference_modules.NIL != cost_pattern) {
            return formula_pattern_match.pattern_transform_formula(cost_pattern, formula, (SubLObject)inference_modules.UNPROVIDED);
        }
        return (SubLObject)inference_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 22996L)
    public static SubLObject hl_module_cost_expression_result(final SubLObject hl_module) {
        final SubLObject cost_expression = hl_module_cost_expression(hl_module);
        if (inference_modules.NIL == cost_expression) {
            return (SubLObject)inference_modules.NIL;
        }
        if (cost_expression.isNumber()) {
            return cost_expression;
        }
        if (cost_expression.isSymbol() && inference_modules.NIL != Symbols.boundp(cost_expression)) {
            return Symbols.symbol_value(cost_expression);
        }
        return eval_in_api.possibly_cyc_api_eval(cost_expression);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 23600L)
    public static SubLObject hl_module_cost_function_result(final SubLObject hl_module, final SubLObject v_object) {
        final SubLObject cost_func = hl_module_cost_func(hl_module);
        if (inference_modules.NIL != eval_in_api.possibly_cyc_api_function_spec_p(cost_func)) {
            final SubLObject cost = eval_in_api.possibly_cyc_api_funcall_1(cost_func, v_object);
            return cost;
        }
        return (SubLObject)inference_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 23997L)
    public static SubLObject hl_module_asent_cost_function_result(final SubLObject hl_module, final SubLObject asent) {
        return hl_module_cost_function_result(hl_module, asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 24266L)
    public static SubLObject hl_module_clause_cost_function_result(final SubLObject hl_module, final SubLObject contextualized_dnf_clause) {
        return hl_module_cost_function_result(hl_module, contextualized_dnf_clause);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 24597L)
    public static SubLObject hl_module_is_checkP(final SubLObject hl_module) {
        final SubLObject check = hl_module_property_without_values(hl_module, (SubLObject)inference_modules.$kw104$CHECK);
        if (check == inference_modules.$kw105$UNKNOWN) {
            return guess_hl_module_is_checkP(hl_module);
        }
        return list_utilities.sublisp_boolean(check);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 24977L)
    public static SubLObject guess_hl_module_is_checkP(final SubLObject hl_module) {
        final SubLObject required_pattern = hl_module_required_pattern(hl_module);
        if (inference_modules.NIL != cycl_utilities.expression_find((SubLObject)inference_modules.$kw106$NOT_FULLY_BOUND, required_pattern, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED)) {
            return (SubLObject)inference_modules.NIL;
        }
        final SubLObject name = string_utilities.str(hl_module_name(hl_module));
        final SubLObject checkP = string_utilities.substringP((SubLObject)inference_modules.$str107$check, name, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED);
        return checkP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 25354L)
    public static SubLObject hl_module_rule_select_func(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, (SubLObject)inference_modules.$kw108$RULE_SELECT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 25477L)
    public static SubLObject hl_module_rule_filter_func(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, (SubLObject)inference_modules.$kw109$RULE_FILTER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 25600L)
    public static SubLObject hl_module_expand_func(final SubLObject hl_module) {
        inference_analysis.cinc_module_expand_count(hl_module);
        final SubLObject expand = hl_module_property_without_values(hl_module, (SubLObject)inference_modules.$kw110$EXPAND);
        if (inference_modules.$kw83$DEFAULT == expand) {
            return default_expand_func_for_hl_module(hl_module);
        }
        return expand;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 25864L)
    public static SubLObject default_expand_func_for_hl_module(final SubLObject hl_module) {
        if (inference_modules.$kw111$REMOVAL != hl_module_type(hl_module)) {
            return (SubLObject)inference_modules.$sym114$DEFAULT_EXPAND_FUNC;
        }
        if (inference_modules.NIL != hl_module_is_checkP(hl_module)) {
            return (SubLObject)inference_modules.$sym112$INFERENCE_REMOVE_CHECK_DEFAULT;
        }
        return (SubLObject)inference_modules.$sym113$INFERENCE_REMOVE_UNIFY_DEFAULT;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 26142L)
    public static SubLObject hl_module_expand_pattern(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, (SubLObject)inference_modules.$kw115$EXPAND_PATTERN);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 26266L)
    public static SubLObject hl_module_expand_iterative_pattern(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, (SubLObject)inference_modules.$kw116$EXPAND_ITERATIVE_PATTERN);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 26410L)
    public static SubLObject hl_module_predicate(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, (SubLObject)inference_modules.$kw57$PREDICATE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 26524L)
    public static SubLObject hl_module_predicate_relevant_p(final SubLObject hl_module, final SubLObject predicate) {
        final SubLObject hl_module_predicate = hl_module_predicate(hl_module);
        if (inference_modules.NIL != hl_module_predicate) {
            return Equality.eql(hl_module_predicate, predicate);
        }
        final SubLObject hl_module_any_preds = hl_module_any_predicates(hl_module);
        if (inference_modules.NIL != hl_module_any_preds) {
            return subl_promotions.memberP(predicate, hl_module_any_preds, (SubLObject)inference_modules.$sym117$PATTERN_MATCHES_FORMULA, (SubLObject)inference_modules.UNPROVIDED);
        }
        return (SubLObject)inference_modules.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 26928L)
    public static SubLObject hl_module_arity(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, (SubLObject)inference_modules.$kw59$ARITY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 27034L)
    public static SubLObject hl_module_arity_relevant_p(final SubLObject hl_module, final SubLObject asent) {
        final SubLObject hl_module_arity = hl_module_arity(hl_module);
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_modules.NIL == hl_module_arity || (inference_modules.NIL != el_utilities.el_formula_without_sequence_termP(asent) && hl_module_arity.numE(Sequences.length(asent.rest()))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 27357L)
    public static SubLObject hl_module_exclusive_func(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, (SubLObject)inference_modules.$kw76$EXCLUSIVE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 28186L)
    public static SubLObject hl_module_supplants_info(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, (SubLObject)inference_modules.$kw77$SUPPLANTS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 28305L)
    public static SubLObject hl_module_direction(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, (SubLObject)inference_modules.$kw60$DIRECTION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 28420L)
    public static SubLObject hl_module_direction_relevantP(final SubLObject hl_module) {
        if (inference_modules.NIL == kb_control_vars.within_forward_inferenceP()) {
            return (SubLObject)inference_modules.T;
        }
        final SubLObject direction = hl_module_direction(hl_module);
        return Equality.eq(direction, (SubLObject)inference_modules.$kw118$FORWARD);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 28935L)
    public static SubLObject hl_module_input_extract_pattern(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, (SubLObject)inference_modules.$kw119$INPUT_EXTRACT_PATTERN);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 29074L)
    public static SubLObject hl_module_input_verify_pattern(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, (SubLObject)inference_modules.$kw120$INPUT_VERIFY_PATTERN);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 29210L)
    public static SubLObject hl_module_input_encode_pattern(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, (SubLObject)inference_modules.$kw121$INPUT_ENCODE_PATTERN);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 29346L)
    public static SubLObject hl_module_output_check_pattern(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, (SubLObject)inference_modules.$kw122$OUTPUT_CHECK_PATTERN);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 29482L)
    public static SubLObject hl_module_output_generate_pattern(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, (SubLObject)inference_modules.$kw123$OUTPUT_GENERATE_PATTERN);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 29626L)
    public static SubLObject hl_module_output_decode_pattern(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, (SubLObject)inference_modules.$kw124$OUTPUT_DECODE_PATTERN);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 29766L)
    public static SubLObject hl_module_output_verify_pattern(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, (SubLObject)inference_modules.$kw125$OUTPUT_VERIFY_PATTERN);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 29904L)
    public static SubLObject hl_module_output_construct_pattern(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, (SubLObject)inference_modules.$kw126$OUTPUT_CONSTRUCT_PATTERN);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 30048L)
    public static SubLObject hl_module_support_pattern(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, (SubLObject)inference_modules.$kw127$SUPPORT_PATTERN);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 30174L)
    public static SubLObject hl_module_support_func(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, (SubLObject)inference_modules.$kw128$SUPPORT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 30289L)
    public static SubLObject hl_module_support_module(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, (SubLObject)inference_modules.$kw129$SUPPORT_MODULE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 30413L)
    public static SubLObject hl_module_support_mt(final SubLObject hl_module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject support_mt = hl_module_property(hl_module, (SubLObject)inference_modules.$kw130$SUPPORT_MT);
        final SubLObject default_inferredP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (inference_modules.NIL != default_inferredP) {
            support_mt = mt_relevance_macros.current_mt_relevance_mt();
        }
        return support_mt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 30670L)
    public static SubLObject hl_module_support_mt_result(final SubLObject hl_module) {
        final SubLObject support_mt_prop = hl_module_support_mt(hl_module);
        return interpret_hl_module_mt_prop(support_mt_prop);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 30845L)
    public static SubLObject hl_module_support_strength(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, (SubLObject)inference_modules.$kw131$SUPPORT_STRENGTH);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 30973L)
    public static SubLObject hl_module_every_predicates(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, (SubLObject)inference_modules.$kw132$EVERY_PREDICATES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 31101L)
    public static SubLObject hl_module_applicability_func(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, (SubLObject)inference_modules.$kw133$APPLICABILITY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 31228L)
    public static SubLObject hl_module_applicability_pattern(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, (SubLObject)inference_modules.$kw134$APPLICABILITY_PATTERN);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 31366L)
    public static SubLObject hl_module_any_predicates(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, (SubLObject)inference_modules.$kw58$ANY_PREDICATES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 31490L)
    public static SubLObject hl_module_documentation_string(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, (SubLObject)inference_modules.$kw135$DOCUMENTATION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 31619L)
    public static SubLObject hl_module_example_string(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, (SubLObject)inference_modules.$kw136$EXAMPLE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 31736L)
    public static SubLObject hl_module_completeP(final SubLObject hl_module, final SubLObject asent) {
        return Equality.eq((SubLObject)inference_modules.$kw137$COMPLETE, hl_module_completeness(hl_module, asent, (SubLObject)inference_modules.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 31856L)
    public static SubLObject hl_module_incompleteP(final SubLObject hl_module, final SubLObject asent) {
        return Equality.eq((SubLObject)inference_modules.$kw138$INCOMPLETE, hl_module_completeness(hl_module, asent, (SubLObject)inference_modules.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 32122L)
    public static SubLObject hl_module_completeness(final SubLObject hl_module, final SubLObject asent, SubLObject default_completeness) {
        if (default_completeness == inference_modules.UNPROVIDED) {
            default_completeness = (SubLObject)inference_modules.$kw138$INCOMPLETE;
        }
        final SubLObject completeness = hl_module_property_without_values(hl_module, (SubLObject)inference_modules.$kw65$COMPLETENESS);
        if (inference_modules.NIL != completeness) {
            return completeness;
        }
        SubLObject pattern = hl_module_property_without_values(hl_module, (SubLObject)inference_modules.$kw139$COMPLETE_PATTERN);
        if (inference_modules.NIL != pattern && inference_modules.NIL != formula_pattern_match.pattern_matches_formula_without_bindings(pattern, asent)) {
            return (SubLObject)inference_modules.$kw137$COMPLETE;
        }
        pattern = hl_module_property_without_values(hl_module, (SubLObject)inference_modules.$kw140$COMPLETENESS_PATTERN);
        if (inference_modules.NIL != pattern) {
            final SubLObject completeness2 = formula_pattern_match.pattern_transform_formula(pattern, asent, (SubLObject)inference_modules.UNPROVIDED);
            if (inference_modules.NIL != completeness2) {
                return completeness2;
            }
        }
        return default_completeness;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 33747L)
    public static SubLObject hl_module_clause_completeness(final SubLObject hl_module, final SubLObject clause) {
        final SubLObject completeness = hl_module_property_without_values(hl_module, (SubLObject)inference_modules.$kw65$COMPLETENESS);
        if (inference_modules.NIL != completeness) {
            return completeness;
        }
        SubLObject pattern = hl_module_property_without_values(hl_module, (SubLObject)inference_modules.$kw139$COMPLETE_PATTERN);
        if (inference_modules.NIL != pattern && inference_modules.NIL != formula_pattern_match.pattern_matches_formula_without_bindings(pattern, clause)) {
            return (SubLObject)inference_modules.$kw137$COMPLETE;
        }
        pattern = hl_module_property_without_values(hl_module, (SubLObject)inference_modules.$kw140$COMPLETENESS_PATTERN);
        if (inference_modules.NIL != pattern) {
            final SubLObject completeness2 = formula_pattern_match.pattern_transform_formula(pattern, clause, (SubLObject)inference_modules.UNPROVIDED);
            if (inference_modules.NIL != completeness2) {
                return completeness2;
            }
        }
        return (SubLObject)inference_modules.$kw138$INCOMPLETE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 35197L)
    public static SubLObject hl_module_externalP(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, (SubLObject)inference_modules.$kw141$EXTERNAL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 35310L)
    public static SubLObject hl_module_activeP(final SubLObject hl_module, SubLObject inactive_hl_modules) {
        if (inactive_hl_modules == inference_modules.UNPROVIDED) {
            inactive_hl_modules = (SubLObject)inference_modules.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_modules.NIL == subl_promotions.memberP(hl_module, inactive_hl_modules, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 35442L)
    public static SubLObject hl_module_implementation_methods(SubLObject hl_module) {
        if (hl_module.isSymbol()) {
            hl_module = find_hl_module_by_name(hl_module);
        }
        assert inference_modules.NIL != hl_module_p(hl_module) : hl_module;
        final SubLObject plist = hl_module_plist(hl_module);
        SubLObject all_methods = (SubLObject)inference_modules.NIL;
        SubLObject remainder;
        SubLObject key;
        SubLObject value;
        SubLObject cdolist_list_var;
        SubLObject v_methods;
        SubLObject method;
        SubLObject item_var;
        for (remainder = (SubLObject)inference_modules.NIL, remainder = plist; inference_modules.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            key = remainder.first();
            value = conses_high.cadr(remainder);
            v_methods = (cdolist_list_var = list_utilities.tree_gather(value, Symbols.symbol_function((SubLObject)inference_modules.$sym142$FUNCTION_SYMBOL_P), (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED));
            method = (SubLObject)inference_modules.NIL;
            method = cdolist_list_var.first();
            while (inference_modules.NIL != cdolist_list_var) {
                if (inference_modules.NIL == list_utilities.member_eqP(method, (SubLObject)inference_modules.$list143)) {
                    item_var = method;
                    if (inference_modules.NIL == conses_high.member(item_var, all_methods, Symbols.symbol_function((SubLObject)inference_modules.EQL), Symbols.symbol_function((SubLObject)inference_modules.IDENTITY))) {
                        all_methods = (SubLObject)ConsesLow.cons(item_var, all_methods);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                method = cdolist_list_var.first();
            }
        }
        return Sort.sort(all_methods, Symbols.symbol_function((SubLObject)inference_modules.$sym144$STRING_LESSP), Symbols.symbol_function((SubLObject)inference_modules.$sym145$SYMBOL_NAME));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 36463L)
    public static SubLObject do_removal_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_modules.$list147);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject hl_module = (SubLObject)inference_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_modules.$list147);
        hl_module = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)inference_modules.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)inference_modules.NIL;
        SubLObject current_$2 = (SubLObject)inference_modules.NIL;
        while (inference_modules.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_modules.$list147);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_modules.$list147);
            if (inference_modules.NIL == conses_high.member(current_$2, (SubLObject)inference_modules.$list87, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED)) {
                bad = (SubLObject)inference_modules.T;
            }
            if (current_$2 == inference_modules.$kw88$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (inference_modules.NIL != bad && inference_modules.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_modules.$list147);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)inference_modules.$kw89$DONE, current);
        final SubLObject done = (SubLObject)((inference_modules.NIL != done_tail) ? conses_high.cadr(done_tail) : inference_modules.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)inference_modules.$sym148$DO_SET, (SubLObject)ConsesLow.list(hl_module, (SubLObject)inference_modules.$list149, (SubLObject)inference_modules.$kw89$DONE, done), ConsesLow.append(body, (SubLObject)inference_modules.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 36607L)
    public static SubLObject removal_modules() {
        return inference_modules.$removal_modules$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 36705L)
    public static SubLObject removal_module_p(final SubLObject v_object) {
        return set.set_memberP(v_object, inference_modules.$removal_modules$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 36795L)
    public static SubLObject removal_module_count() {
        return set.set_size(inference_modules.$removal_modules$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 37005L)
    public static SubLObject some_external_removal_modulesP() {
        return list_utilities.sublisp_boolean(inference_modules.$removal_modules_external$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 37101L)
    public static SubLObject removal_modules_external() {
        return inference_modules.$removal_modules_external$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 37489L)
    public static SubLObject generic_removal_module_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_modules.NIL != removal_module_p(v_object) && inference_modules.NIL != subl_promotions.memberP(v_object, inference_modules.$removal_modules_generic$.getGlobalValue(), (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 37630L)
    public static SubLObject generic_removal_modules() {
        return conses_high.copy_list(inference_modules.$removal_modules_generic$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 37792L)
    public static SubLObject generic_removal_modules_for_sense(final SubLObject sense) {
        return Sequences.remove(enumeration_types.inverse_sense(sense), inference_modules.$removal_modules_generic$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_modules.EQL), (SubLObject)inference_modules.$sym154$HL_MODULE_SENSE, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 37969L)
    public static SubLObject generic_removal_module_count() {
        return Sequences.length(inference_modules.$removal_modules_generic$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 38263L)
    public static SubLObject universal_removal_modules() {
        return conses_high.copy_list(inference_modules.$removal_modules_universal$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 38429L)
    public static SubLObject universal_removal_module_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_modules.NIL != removal_module_p(v_object) && inference_modules.NIL != subl_promotions.memberP(v_object, inference_modules.$removal_modules_universal$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_modules.EQL), (SubLObject)inference_modules.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 38580L)
    public static SubLObject universal_removal_module_count() {
        return Sequences.length(inference_modules.$removal_modules_universal$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 38676L)
    public static SubLObject universal_removal_module_exception_predicates(final SubLObject universal_module) {
        return list_utilities.alist_lookup(inference_modules.$removal_modules_specific_dont_use_universal$.getGlobalValue(), universal_module, Symbols.symbol_function((SubLObject)inference_modules.EQL), (SubLObject)inference_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 38974L)
    public static SubLObject universal_removal_module_exception_predicateP(final SubLObject universal_module, final SubLObject predicate) {
        return subl_promotions.memberP(predicate, universal_removal_module_exception_predicates(universal_module), (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 39160L)
    public static SubLObject predicate_doesnt_use_universal_removal_moduleP(final SubLObject predicate, final SubLObject universal_module) {
        if (inference_modules.NIL != forts.fort_p(predicate) && inference_modules.NIL == universal_removal_module_exception_predicateP(universal_module, predicate)) {
            return (SubLObject)inference_modules.NIL;
        }
        return (SubLObject)inference_modules.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 39535L)
    public static SubLObject universal_removal_modules_for_sense(final SubLObject sense) {
        return Sequences.remove(enumeration_types.inverse_sense(sense), inference_modules.$removal_modules_universal$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_modules.EQL), (SubLObject)inference_modules.$sym154$HL_MODULE_SENSE, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 40007L)
    public static SubLObject removal_modules_specific(final SubLObject predicate) {
        assert inference_modules.NIL != forts.fort_p(predicate) : predicate;
        return conses_high.copy_list(Hashtables.gethash_without_values(predicate, inference_modules.$removal_modules_specific$.getGlobalValue(), (SubLObject)inference_modules.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 40264L)
    public static SubLObject predicate_has_specific_removal_modulesP(final SubLObject predicate) {
        return list_utilities.sublisp_boolean(Hashtables.gethash_without_values(predicate, inference_modules.$removal_modules_specific$.getGlobalValue(), (SubLObject)inference_modules.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 40417L)
    public static SubLObject removal_modules_specific_for_sense(final SubLObject predicate, final SubLObject sense) {
        assert inference_modules.NIL != forts.fort_p(predicate) : predicate;
        return Sequences.remove(enumeration_types.inverse_sense(sense), Hashtables.gethash_without_values(predicate, inference_modules.$removal_modules_specific$.getGlobalValue(), (SubLObject)inference_modules.NIL), Symbols.symbol_function((SubLObject)inference_modules.EQL), (SubLObject)inference_modules.$sym154$HL_MODULE_SENSE, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 40796L)
    public static SubLObject removal_modules_universal_for_predicate_and_sense(final SubLObject predicate, final SubLObject sense) {
        assert inference_modules.NIL != forts.fort_p(predicate) : predicate;
        SubLObject universal_modules = (SubLObject)inference_modules.NIL;
        SubLObject cdolist_list_var = universal_removal_modules_for_sense(sense);
        SubLObject universal_module = (SubLObject)inference_modules.NIL;
        universal_module = cdolist_list_var.first();
        while (inference_modules.NIL != cdolist_list_var) {
            if (inference_modules.NIL == predicate_doesnt_use_universal_removal_moduleP(predicate, universal_module)) {
                universal_modules = (SubLObject)ConsesLow.cons(universal_module, universal_modules);
            }
            cdolist_list_var = cdolist_list_var.rest();
            universal_module = cdolist_list_var.first();
        }
        return Sequences.nreverse(universal_modules);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 41376L)
    public static SubLObject predicates_with_specific_removal_modules() {
        return hash_table_utilities.hash_table_keys(inference_modules.$removal_modules_specific$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 41516L)
    public static SubLObject specific_removal_modules() {
        return set.set_element_list(specific_removal_module_set());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 41644L)
    public static SubLObject specific_removal_module_count() {
        return set.set_size(specific_removal_module_set());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 41743L)
    public static SubLObject specific_removal_module_set() {
        final SubLObject v_set = set.new_set((SubLObject)inference_modules.EQL, removal_module_count());
        SubLObject pred = (SubLObject)inference_modules.NIL;
        SubLObject hl_module_list = (SubLObject)inference_modules.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(inference_modules.$removal_modules_specific$.getGlobalValue());
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                pred = Hashtables.getEntryKey(cdohash_entry);
                SubLObject cdolist_list_var;
                hl_module_list = (cdolist_list_var = Hashtables.getEntryValue(cdohash_entry));
                SubLObject hl_module = (SubLObject)inference_modules.NIL;
                hl_module = cdolist_list_var.first();
                while (inference_modules.NIL != cdolist_list_var) {
                    if (inference_modules.NIL == generic_removal_module_p(hl_module)) {
                        set.set_add(hl_module, v_set);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    hl_module = cdolist_list_var.first();
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return v_set;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 42798L)
    public static SubLObject clear_solely_specific_removal_module_predicate_store() {
        set.clear_set(inference_modules.$solely_specific_removal_module_predicate_store$.getGlobalValue());
        return (SubLObject)inference_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 42947L)
    public static SubLObject rebuild_solely_specific_removal_module_predicate_store() {
        return set.set_rebuild(inference_modules.$solely_specific_removal_module_predicate_store$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 43096L)
    public static SubLObject register_solely_specific_removal_module_predicate(final SubLObject predicate) {
        return set.set_add(predicate, inference_modules.$solely_specific_removal_module_predicate_store$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 43384L)
    public static SubLObject deregister_solely_specific_removal_module_predicate(final SubLObject predicate) {
        return set.set_remove(predicate, inference_modules.$solely_specific_removal_module_predicate_store$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 43548L)
    public static SubLObject solely_specific_removal_module_predicateP(final SubLObject predicate) {
        return set.set_memberP(predicate, inference_modules.$solely_specific_removal_module_predicate_store$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 43703L)
    public static SubLObject inference_removal_module(final SubLObject name, final SubLObject plist) {
        final SubLObject strengthened_plist = strengthen_removal_module_properties(name, plist);
        final SubLObject hl_module = setup_module(name, (SubLObject)inference_modules.$kw111$REMOVAL, strengthened_plist);
        set.set_add(hl_module, inference_modules.$removal_modules$.getGlobalValue());
        classify_removal_module(hl_module);
        return hl_module;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 44315L)
    public static SubLObject inference_removal_module_use_generic(final SubLObject predicate, final SubLObject name) {
        final SubLObject hl_module = find_hl_module_by_name(name);
        if (inference_modules.NIL != hl_module) {
            SubLObject existing = conses_high.assoc(hl_module, inference_modules.$removal_modules_specific_use_generic$.getGlobalValue(), (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED);
            if (inference_modules.NIL == existing) {
                existing = (SubLObject)ConsesLow.list(hl_module);
                inference_modules.$removal_modules_specific_use_generic$.setGlobalValue((SubLObject)ConsesLow.cons(existing, inference_modules.$removal_modules_specific_use_generic$.getGlobalValue()));
            }
            ConsesLow.rplacd(existing, conses_high.adjoin(predicate, existing.rest(), (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED));
            return inference_removal_module_note_specific(predicate, hl_module);
        }
        return (SubLObject)inference_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 44876L)
    public static SubLObject inference_removal_module_use_meta_removal(final SubLObject predicate, final SubLObject name) {
        final SubLObject hl_module = find_hl_module_by_name(name);
        if (inference_modules.NIL != hl_module) {
            SubLObject existing = conses_high.assoc(hl_module, inference_modules.$removal_modules_specific_use_meta_removal$.getGlobalValue(), (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED);
            if (inference_modules.NIL == existing) {
                existing = (SubLObject)ConsesLow.list(hl_module);
                inference_modules.$removal_modules_specific_use_meta_removal$.setGlobalValue((SubLObject)ConsesLow.cons(existing, inference_modules.$removal_modules_specific_use_meta_removal$.getGlobalValue()));
            }
            ConsesLow.rplacd(existing, conses_high.adjoin(predicate, existing.rest(), (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED));
            return hl_module;
        }
        return (SubLObject)inference_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 45398L)
    public static SubLObject inference_removal_module_dont_use_universal(final SubLObject predicate, final SubLObject name) {
        final SubLObject hl_module = find_hl_module_by_name(name);
        if (inference_modules.NIL != hl_module) {
            SubLObject existing = conses_high.assoc(hl_module, inference_modules.$removal_modules_specific_dont_use_universal$.getGlobalValue(), (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED);
            if (inference_modules.NIL == existing) {
                existing = (SubLObject)ConsesLow.list(hl_module);
                inference_modules.$removal_modules_specific_dont_use_universal$.setGlobalValue((SubLObject)ConsesLow.cons(existing, inference_modules.$removal_modules_specific_dont_use_universal$.getGlobalValue()));
            }
            ConsesLow.rplacd(existing, conses_high.adjoin(predicate, existing.rest(), (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED));
            return hl_module;
        }
        return (SubLObject)inference_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 45929L)
    public static SubLObject redeclare_inference_removal_module(final SubLObject name) {
        final SubLObject hl_module = find_hl_module_by_name(name);
        if (inference_modules.NIL != hl_module) {
            set.set_add(hl_module, inference_modules.$removal_modules$.getGlobalValue());
            classify_removal_module(hl_module);
            return hl_module;
        }
        return (SubLObject)inference_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 46309L)
    public static SubLObject strengthen_removal_module_properties(final SubLObject name, SubLObject plist) {
        plist = conses_high.copy_tree(plist);
        final SubLObject pcase_var;
        final SubLObject sense = pcase_var = conses_high.getf(plist, (SubLObject)inference_modules.$kw56$SENSE, (SubLObject)inference_modules.UNPROVIDED);
        if (!pcase_var.eql((SubLObject)inference_modules.$kw164$POS)) {
            if (!pcase_var.eql((SubLObject)inference_modules.$kw165$NEG)) {
                Errors.error((SubLObject)inference_modules.$str166$removal_module__S_must_have_a__SE, name);
            }
        }
        return plist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 46681L)
    public static SubLObject undeclare_inference_removal_module(final SubLObject name, SubLObject reclassifyP) {
        if (reclassifyP == inference_modules.UNPROVIDED) {
            reclassifyP = (SubLObject)inference_modules.T;
        }
        final SubLObject hl_module = find_hl_module_by_name(name);
        if (inference_modules.NIL != hl_module) {
            remove_hl_module(hl_module);
            set.set_remove(hl_module, inference_modules.$removal_modules$.getGlobalValue());
            inference_modules.$removal_modules_generic$.setGlobalValue(Sequences.remove(hl_module, inference_modules.$removal_modules_generic$.getGlobalValue(), (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED));
            inference_modules.$removal_modules_universal$.setGlobalValue(Sequences.remove(hl_module, inference_modules.$removal_modules_universal$.getGlobalValue(), (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED));
            inference_modules.$removal_modules_specific_use_generic$.setGlobalValue(Sequences.delete(hl_module, inference_modules.$removal_modules_specific_use_generic$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_modules.EQL), Symbols.symbol_function((SubLObject)inference_modules.$sym167$CAR), (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED));
            inference_modules.$removal_modules_specific_use_meta_removal$.setGlobalValue(Sequences.delete(hl_module, inference_modules.$removal_modules_specific_use_meta_removal$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_modules.EQL), Symbols.symbol_function((SubLObject)inference_modules.$sym167$CAR), (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED));
            inference_modules.$removal_modules_specific_dont_use_universal$.setGlobalValue(Sequences.delete(hl_module, inference_modules.$removal_modules_specific_dont_use_universal$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_modules.EQL), Symbols.symbol_function((SubLObject)inference_modules.$sym167$CAR), (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED));
            if (inference_modules.NIL != reclassifyP) {
                reclassify_removal_modules();
            }
            return hl_module;
        }
        return (SubLObject)inference_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 47702L)
    public static SubLObject undeclare_inference_meta_removal_module(final SubLObject name) {
        final SubLObject hl_module = find_hl_module_by_name(name);
        if (inference_modules.NIL != hl_module) {
            remove_hl_module(hl_module);
            set.set_remove(hl_module, inference_modules.$meta_removal_modules$.getGlobalValue());
        }
        return hl_module;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 48001L)
    public static SubLObject undeclare_inference_removal_module_use_generic(final SubLObject predicate, final SubLObject name, SubLObject reclassifyP) {
        if (reclassifyP == inference_modules.UNPROVIDED) {
            reclassifyP = (SubLObject)inference_modules.NIL;
        }
        final SubLObject hl_module = find_hl_module_by_name(name);
        if (inference_modules.NIL != hl_module) {
            final SubLObject existing = conses_high.assoc(hl_module, inference_modules.$removal_modules_specific_use_generic$.getGlobalValue(), (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED);
            if (inference_modules.NIL != existing) {
                ConsesLow.rplacd(existing, Sequences.delete(predicate, existing.rest(), (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED));
                if (inference_modules.NIL == existing.rest()) {
                    inference_modules.$removal_modules_specific_use_generic$.setGlobalValue(Sequences.delete(existing, inference_modules.$removal_modules_specific_use_generic$.getGlobalValue(), (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED));
                }
            }
            if (inference_modules.NIL != reclassifyP) {
                reclassify_removal_modules();
            }
            return hl_module;
        }
        return (SubLObject)inference_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 48650L)
    public static SubLObject undeclare_inference_removal_module_use_meta_removal(final SubLObject predicate, final SubLObject name, SubLObject reclassifyP) {
        if (reclassifyP == inference_modules.UNPROVIDED) {
            reclassifyP = (SubLObject)inference_modules.NIL;
        }
        final SubLObject hl_module = find_hl_module_by_name(name);
        if (inference_modules.NIL != hl_module) {
            final SubLObject existing = conses_high.assoc(hl_module, inference_modules.$removal_modules_specific_use_meta_removal$.getGlobalValue(), (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED);
            if (inference_modules.NIL != existing) {
                ConsesLow.rplacd(existing, Sequences.delete(predicate, existing.rest(), (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED));
                if (inference_modules.NIL == existing.rest()) {
                    inference_modules.$removal_modules_specific_use_meta_removal$.setGlobalValue(Sequences.delete(existing, inference_modules.$removal_modules_specific_use_meta_removal$.getGlobalValue(), (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED));
                }
            }
            if (inference_modules.NIL != reclassifyP) {
                reclassify_removal_modules();
            }
            return hl_module;
        }
        return (SubLObject)inference_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 49316L)
    public static SubLObject undeclare_inference_removal_module_dont_use_universal(final SubLObject predicate, final SubLObject name, SubLObject reclassifyP) {
        if (reclassifyP == inference_modules.UNPROVIDED) {
            reclassifyP = (SubLObject)inference_modules.NIL;
        }
        final SubLObject hl_module = find_hl_module_by_name(name);
        if (inference_modules.NIL != hl_module) {
            final SubLObject existing = conses_high.assoc(hl_module, inference_modules.$removal_modules_specific_dont_use_universal$.getGlobalValue(), (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED);
            if (inference_modules.NIL != existing) {
                ConsesLow.rplacd(existing, Sequences.delete(predicate, existing.rest(), (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED));
                if (inference_modules.NIL == existing.rest()) {
                    inference_modules.$removal_modules_specific_dont_use_universal$.setGlobalValue(Sequences.delete(existing, inference_modules.$removal_modules_specific_dont_use_universal$.getGlobalValue(), (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED));
                }
            }
            if (inference_modules.NIL != reclassifyP) {
                reclassify_removal_modules();
            }
            return hl_module;
        }
        return (SubLObject)inference_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 49986L)
    public static SubLObject reclassify_removal_modules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_removal_modules();
        rebuild_solely_specific_removal_module_predicate_store();
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state((SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                SubLObject cdolist_list_var = inference_modules.$removal_modules_specific_use_generic$.getGlobalValue();
                SubLObject generic_info = (SubLObject)inference_modules.NIL;
                generic_info = cdolist_list_var.first();
                while (inference_modules.NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = generic_info;
                    SubLObject hl_module = (SubLObject)inference_modules.NIL;
                    SubLObject predicates = (SubLObject)inference_modules.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_modules.$list168);
                    hl_module = current.first();
                    current = current.rest();
                    SubLObject cdolist_list_var_$3;
                    predicates = (cdolist_list_var_$3 = current);
                    SubLObject predicate = (SubLObject)inference_modules.NIL;
                    predicate = cdolist_list_var_$3.first();
                    while (inference_modules.NIL != cdolist_list_var_$3) {
                        inference_removal_module_note_specific(predicate, hl_module);
                        cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                        predicate = cdolist_list_var_$3.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    generic_info = cdolist_list_var.first();
                }
                final SubLObject set_var = removal_modules();
                final SubLObject set_contents_var = set.do_set_internal(set_var);
                SubLObject basis_object;
                SubLObject state_$4;
                SubLObject hl_module2;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state_$4 = (SubLObject)inference_modules.NIL, state_$4 = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_modules.NIL == set_contents.do_set_contents_doneP(basis_object, state_$4); state_$4 = set_contents.do_set_contents_update_state(state_$4)) {
                    hl_module2 = set_contents.do_set_contents_next(basis_object, state_$4);
                    if (inference_modules.NIL != set_contents.do_set_contents_element_validP(state_$4, hl_module2)) {
                        classify_removal_module(hl_module2);
                    }
                }
                preference_modules.reclassify_preference_modules();
            }
            finally {
                final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inference_modules.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)inference_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 50630L)
    public static SubLObject clear_removal_modules() {
        Hashtables.clrhash(inference_modules.$removal_modules_specific$.getGlobalValue());
        inference_modules.$removal_modules_external$.setGlobalValue((SubLObject)inference_modules.NIL);
        inference_modules.$removal_modules_generic$.setGlobalValue((SubLObject)inference_modules.NIL);
        inference_modules.$removal_modules_universal$.setGlobalValue((SubLObject)inference_modules.NIL);
        return (SubLObject)inference_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 51047L)
    public static SubLObject classify_removal_module(final SubLObject hl_module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_modules.NIL != hl_module_externalP(hl_module)) {
            if (inference_modules.NIL != inference_modules.$classify_removal_modules_with_deterministic_sortP$.getDynamicValue(thread)) {
                inference_modules.$removal_modules_external$.setGlobalValue(list_utilities.sort_adjoin(hl_module, inference_modules.$removal_modules_external$.getGlobalValue(), (SubLObject)inference_modules.EQL, (SubLObject)inference_modules.$sym169$INFERENCE_REMOVAL_MODULE__FOR_CLASSIFICATION, (SubLObject)inference_modules.IDENTITY));
            }
            else if (inference_modules.NIL == conses_high.member(hl_module, inference_modules.$removal_modules_external$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_modules.EQL), Symbols.symbol_function((SubLObject)inference_modules.IDENTITY))) {
                inference_modules.$removal_modules_external$.setGlobalValue((SubLObject)ConsesLow.cons(hl_module, inference_modules.$removal_modules_external$.getGlobalValue()));
            }
        }
        else {
            final SubLObject predicate_spec = hl_module_predicate(hl_module);
            final SubLObject universalP = hl_module_universal(hl_module);
            if (inference_modules.NIL != universalP) {
                if (inference_modules.NIL != inference_modules.$classify_removal_modules_with_deterministic_sortP$.getDynamicValue(thread)) {
                    inference_modules.$removal_modules_universal$.setGlobalValue(list_utilities.sort_adjoin(hl_module, inference_modules.$removal_modules_universal$.getGlobalValue(), (SubLObject)inference_modules.EQL, (SubLObject)inference_modules.$sym169$INFERENCE_REMOVAL_MODULE__FOR_CLASSIFICATION, (SubLObject)inference_modules.IDENTITY));
                }
                else if (inference_modules.NIL == conses_high.member(hl_module, inference_modules.$removal_modules_universal$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_modules.EQL), Symbols.symbol_function((SubLObject)inference_modules.IDENTITY))) {
                    inference_modules.$removal_modules_universal$.setGlobalValue((SubLObject)ConsesLow.cons(hl_module, inference_modules.$removal_modules_universal$.getGlobalValue()));
                }
            }
            else if (inference_modules.NIL == predicate_spec) {
                if (inference_modules.NIL != inference_modules.$classify_removal_modules_with_deterministic_sortP$.getDynamicValue(thread)) {
                    inference_modules.$removal_modules_generic$.setGlobalValue(list_utilities.sort_adjoin(hl_module, inference_modules.$removal_modules_generic$.getGlobalValue(), (SubLObject)inference_modules.EQL, (SubLObject)inference_modules.$sym169$INFERENCE_REMOVAL_MODULE__FOR_CLASSIFICATION, (SubLObject)inference_modules.IDENTITY));
                }
                else if (inference_modules.NIL == conses_high.member(hl_module, inference_modules.$removal_modules_generic$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_modules.EQL), Symbols.symbol_function((SubLObject)inference_modules.IDENTITY))) {
                    inference_modules.$removal_modules_generic$.setGlobalValue((SubLObject)ConsesLow.cons(hl_module, inference_modules.$removal_modules_generic$.getGlobalValue()));
                }
            }
            else if (predicate_spec.isAtom()) {
                inference_removal_module_note_specific(predicate_spec, hl_module);
            }
            else {
                SubLObject cdolist_list_var = predicate_spec;
                SubLObject predicate = (SubLObject)inference_modules.NIL;
                predicate = cdolist_list_var.first();
                while (inference_modules.NIL != cdolist_list_var) {
                    inference_removal_module_note_specific(predicate, hl_module);
                    cdolist_list_var = cdolist_list_var.rest();
                    predicate = cdolist_list_var.first();
                }
            }
        }
        return hl_module;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 52357L)
    public static SubLObject inference_removal_module_note_specific(final SubLObject predicate, final SubLObject hl_module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.sethash(predicate, inference_modules.$removal_modules_specific$.getGlobalValue(), (inference_modules.NIL != inference_modules.$classify_removal_modules_with_deterministic_sortP$.getDynamicValue(thread)) ? list_utilities.sort_adjoin(hl_module, Hashtables.gethash(predicate, inference_modules.$removal_modules_specific$.getGlobalValue(), (SubLObject)inference_modules.NIL), (SubLObject)inference_modules.EQL, (SubLObject)inference_modules.$sym169$INFERENCE_REMOVAL_MODULE__FOR_CLASSIFICATION, (SubLObject)inference_modules.IDENTITY) : conses_high.adjoin(hl_module, Hashtables.gethash(predicate, inference_modules.$removal_modules_specific$.getGlobalValue(), (SubLObject)inference_modules.NIL), (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED));
        return hl_module;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 52791L)
    public static SubLObject inference_removal_moduleL_for_classification(final SubLObject module1, final SubLObject module2) {
        final SubLObject module1_specific_use_genericP = removal_module_specific_use_genericP(module1);
        final SubLObject module2_specific_use_genericP = removal_module_specific_use_genericP(module2);
        if (inference_modules.NIL != module1_specific_use_genericP && inference_modules.NIL == module2_specific_use_genericP) {
            return (SubLObject)inference_modules.NIL;
        }
        if (inference_modules.NIL == module1_specific_use_genericP && inference_modules.NIL != module2_specific_use_genericP) {
            return (SubLObject)inference_modules.T;
        }
        final SubLObject name1 = Symbols.symbol_name(hl_module_name(module1));
        final SubLObject name2 = Symbols.symbol_name(hl_module_name(module2));
        final SubLObject name1_length = Sequences.length(name1);
        final SubLObject name2_length = Sequences.length(name2);
        if (name1_length.numL(name2_length)) {
            return (SubLObject)inference_modules.T;
        }
        if (name1_length.numG(name2_length)) {
            return (SubLObject)inference_modules.NIL;
        }
        return Strings.stringL(name1, name2, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 53578L)
    public static SubLObject removal_module_specific_use_genericP_internal(final SubLObject module) {
        return conses_high.assoc(module, inference_modules.$removal_modules_specific_use_generic$.getGlobalValue(), (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 53578L)
    public static SubLObject removal_module_specific_use_genericP(final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)inference_modules.NIL;
        if (inference_modules.NIL == v_memoization_state) {
            return removal_module_specific_use_genericP_internal(module);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)inference_modules.$sym170$REMOVAL_MODULE_SPECIFIC_USE_GENERIC_, (SubLObject)inference_modules.UNPROVIDED);
        if (inference_modules.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)inference_modules.$sym170$REMOVAL_MODULE_SPECIFIC_USE_GENERIC_, (SubLObject)inference_modules.ONE_INTEGER, (SubLObject)inference_modules.NIL, (SubLObject)inference_modules.EQ, (SubLObject)inference_modules.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)inference_modules.$sym170$REMOVAL_MODULE_SPECIFIC_USE_GENERIC_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, module, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(removal_module_specific_use_genericP_internal(module)));
            memoization_state.caching_state_put(caching_state, module, results, (SubLObject)inference_modules.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 53925L)
    public static SubLObject inference_removal_pruning_module(final SubLObject name, final SubLObject plist) {
        SubLObject removal_plist = list_utilities.merge_plist(plist, inference_modules.$removal_pruning_module_properties$.getGlobalValue());
        final SubLObject subtypes = conses_high.adjoin((SubLObject)inference_modules.$kw172$PRUNING, conses_high.getf(plist, (SubLObject)inference_modules.$kw13$MODULE_SUBTYPE, (SubLObject)inference_modules.NIL), (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED);
        removal_plist = conses_high.putf(removal_plist, (SubLObject)inference_modules.$kw13$MODULE_SUBTYPE, subtypes);
        return inference_removal_module(name, removal_plist);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 54351L)
    public static SubLObject removal_pruning_moduleP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_modules.NIL != removal_module_p(v_object) && inference_modules.NIL != list_utilities.member_eqP((SubLObject)inference_modules.$kw172$PRUNING, hl_module_subtypes(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 54682L)
    public static SubLObject do_conjunctive_removal_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_modules.$list174);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject module = (SubLObject)inference_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_modules.$list174);
        module = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)inference_modules.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)inference_modules.NIL;
        SubLObject current_$6 = (SubLObject)inference_modules.NIL;
        while (inference_modules.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_modules.$list174);
            current_$6 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_modules.$list174);
            if (inference_modules.NIL == conses_high.member(current_$6, (SubLObject)inference_modules.$list87, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED)) {
                bad = (SubLObject)inference_modules.T;
            }
            if (current_$6 == inference_modules.$kw88$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (inference_modules.NIL != bad && inference_modules.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_modules.$list174);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)inference_modules.$kw89$DONE, current);
        final SubLObject done = (SubLObject)((inference_modules.NIL != done_tail) ? conses_high.cadr(done_tail) : inference_modules.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)inference_modules.$sym148$DO_SET, (SubLObject)ConsesLow.list(module, (SubLObject)inference_modules.$list175, (SubLObject)inference_modules.$kw89$DONE, done), ConsesLow.append(body, (SubLObject)inference_modules.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 54990L)
    public static SubLObject removal_modules_conjunctive() {
        return inference_modules.$conjunctive_removal_modules$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 55124L)
    public static SubLObject conjunctive_removal_module_p(final SubLObject v_object) {
        return set.set_memberP(v_object, inference_modules.$conjunctive_removal_modules$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 55295L)
    public static SubLObject conjunctive_removal_module_count() {
        return set.set_size(inference_modules.$conjunctive_removal_modules$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 55397L)
    public static SubLObject conjunctive_removal_modules() {
        SubLObject v_modules = (SubLObject)inference_modules.NIL;
        final SubLObject set_var = removal_modules_conjunctive();
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject module;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_modules.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_modules.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            module = set_contents.do_set_contents_next(basis_object, state);
            if (inference_modules.NIL != set_contents.do_set_contents_element_validP(state, module)) {
                v_modules = (SubLObject)ConsesLow.cons(module, v_modules);
            }
        }
        return v_modules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 55621L)
    public static SubLObject inference_conjunctive_removal_module(final SubLObject name, final SubLObject plist) {
        final SubLObject hl_module = setup_module(name, (SubLObject)inference_modules.$kw178$REMOVAL_CONJUNCTIVE, plist);
        set.set_add(hl_module, inference_modules.$conjunctive_removal_modules$.getGlobalValue());
        return hl_module;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 57550L)
    public static SubLObject undeclare_inference_conjunctive_removal_module(final SubLObject name) {
        final SubLObject hl_module = find_hl_module_by_name(name);
        if (inference_modules.NIL != hl_module_p(hl_module)) {
            remove_hl_module(hl_module);
            return set.set_remove(hl_module, inference_modules.$conjunctive_removal_modules$.getGlobalValue());
        }
        return (SubLObject)inference_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 57905L)
    public static SubLObject do_meta_removal_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_modules.$list147);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject hl_module = (SubLObject)inference_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_modules.$list147);
        hl_module = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)inference_modules.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)inference_modules.NIL;
        SubLObject current_$7 = (SubLObject)inference_modules.NIL;
        while (inference_modules.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_modules.$list147);
            current_$7 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_modules.$list147);
            if (inference_modules.NIL == conses_high.member(current_$7, (SubLObject)inference_modules.$list87, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED)) {
                bad = (SubLObject)inference_modules.T;
            }
            if (current_$7 == inference_modules.$kw88$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (inference_modules.NIL != bad && inference_modules.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_modules.$list147);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)inference_modules.$kw89$DONE, current);
        final SubLObject done = (SubLObject)((inference_modules.NIL != done_tail) ? conses_high.cadr(done_tail) : inference_modules.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)inference_modules.$sym5$DO_LIST, (SubLObject)ConsesLow.list(hl_module, (SubLObject)inference_modules.$list179, (SubLObject)inference_modules.$kw89$DONE, done), ConsesLow.append(body, (SubLObject)inference_modules.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 58091L)
    public static SubLObject meta_removal_modules() {
        return inference_modules.$meta_removal_modules$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 58204L)
    public static SubLObject meta_removal_module_list() {
        return conses_high.copy_list(inference_modules.$meta_removal_modules$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 58292L)
    public static SubLObject meta_removal_module_p(final SubLObject v_object) {
        SubLObject cdolist_list_var = meta_removal_modules();
        SubLObject module = (SubLObject)inference_modules.NIL;
        module = cdolist_list_var.first();
        while (inference_modules.NIL != cdolist_list_var) {
            if (v_object.eql(module)) {
                return (SubLObject)inference_modules.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            module = cdolist_list_var.first();
        }
        return (SubLObject)inference_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 58423L)
    public static SubLObject meta_removal_module_count() {
        return Sequences.length(inference_modules.$meta_removal_modules$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 58509L)
    public static SubLObject meta_removal_module_specific_predicates(final SubLObject meta_removal_module) {
        return list_utilities.alist_lookup(inference_modules.$removal_modules_specific_use_meta_removal$.getGlobalValue(), meta_removal_module, Symbols.symbol_function((SubLObject)inference_modules.EQL), (SubLObject)inference_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 58795L)
    public static SubLObject meta_removal_module_specific_predicateP(final SubLObject meta_removal_module, final SubLObject predicate) {
        return subl_promotions.memberP(predicate, meta_removal_module_specific_predicates(meta_removal_module), (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 58975L)
    public static SubLObject predicate_uses_meta_removal_moduleP(final SubLObject predicate, final SubLObject meta_removal_module) {
        if (inference_modules.NIL != forts.fort_p(predicate) && inference_modules.NIL != solely_specific_removal_module_predicateP(predicate) && inference_modules.NIL == meta_removal_module_specific_predicateP(meta_removal_module, predicate)) {
            return (SubLObject)inference_modules.NIL;
        }
        return (SubLObject)inference_modules.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 59424L)
    public static SubLObject inference_meta_removal_module(final SubLObject name, SubLObject plist) {
        if (plist == inference_modules.UNPROVIDED) {
            plist = (SubLObject)inference_modules.NIL;
        }
        final SubLObject item_var;
        final SubLObject hl_module = item_var = setup_module(name, (SubLObject)inference_modules.$kw182$META_REMOVAL, plist);
        if (inference_modules.NIL == conses_high.member(item_var, inference_modules.$meta_removal_modules$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_modules.EQL), Symbols.symbol_function((SubLObject)inference_modules.IDENTITY))) {
            inference_modules.$meta_removal_modules$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, inference_modules.$meta_removal_modules$.getGlobalValue()));
        }
        return hl_module;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 59899L)
    public static SubLObject removal_proof_module_p(final SubLObject hl_module) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_modules.NIL != removal_module_p(hl_module) || inference_modules.NIL != conjunctive_removal_module_p(hl_module));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 60507L)
    public static SubLObject do_transformation_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_modules.$list147);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject hl_module = (SubLObject)inference_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_modules.$list147);
        hl_module = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)inference_modules.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)inference_modules.NIL;
        SubLObject current_$8 = (SubLObject)inference_modules.NIL;
        while (inference_modules.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_modules.$list147);
            current_$8 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_modules.$list147);
            if (inference_modules.NIL == conses_high.member(current_$8, (SubLObject)inference_modules.$list87, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED)) {
                bad = (SubLObject)inference_modules.T;
            }
            if (current_$8 == inference_modules.$kw88$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (inference_modules.NIL != bad && inference_modules.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_modules.$list147);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)inference_modules.$kw89$DONE, current);
        final SubLObject done = (SubLObject)((inference_modules.NIL != done_tail) ? conses_high.cadr(done_tail) : inference_modules.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)inference_modules.$sym5$DO_LIST, (SubLObject)ConsesLow.list(hl_module, (SubLObject)inference_modules.$list184, (SubLObject)inference_modules.$kw89$DONE, done), ConsesLow.append(body, (SubLObject)inference_modules.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 60666L)
    public static SubLObject transformation_modules() {
        return inference_modules.$transformation_modules$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 60785L)
    public static SubLObject transformation_module_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, inference_modules.$transformation_modules$.getGlobalValue(), (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 60885L)
    public static SubLObject transformation_module_count() {
        return Sequences.length(inference_modules.$transformation_modules$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 60975L)
    public static SubLObject inference_transformation_module(final SubLObject name, final SubLObject plist) {
        final SubLObject item_var;
        final SubLObject hl_module = item_var = setup_module(name, (SubLObject)inference_modules.$kw187$TRANSFORMATION, plist);
        if (inference_modules.NIL == conses_high.member(item_var, inference_modules.$transformation_modules$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_modules.EQL), Symbols.symbol_function((SubLObject)inference_modules.IDENTITY))) {
            inference_modules.$transformation_modules$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, inference_modules.$transformation_modules$.getGlobalValue()));
        }
        return hl_module;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 61635L)
    public static SubLObject do_meta_transformation_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_modules.$list147);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject hl_module = (SubLObject)inference_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_modules.$list147);
        hl_module = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)inference_modules.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)inference_modules.NIL;
        SubLObject current_$9 = (SubLObject)inference_modules.NIL;
        while (inference_modules.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_modules.$list147);
            current_$9 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_modules.$list147);
            if (inference_modules.NIL == conses_high.member(current_$9, (SubLObject)inference_modules.$list87, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED)) {
                bad = (SubLObject)inference_modules.T;
            }
            if (current_$9 == inference_modules.$kw88$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (inference_modules.NIL != bad && inference_modules.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_modules.$list147);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)inference_modules.$kw89$DONE, current);
        final SubLObject done = (SubLObject)((inference_modules.NIL != done_tail) ? conses_high.cadr(done_tail) : inference_modules.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)inference_modules.$sym5$DO_LIST, (SubLObject)ConsesLow.list(hl_module, (SubLObject)inference_modules.$list189, (SubLObject)inference_modules.$kw89$DONE, done), ConsesLow.append(body, (SubLObject)inference_modules.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 61804L)
    public static SubLObject meta_transformation_modules() {
        return inference_modules.$meta_transformation_modules$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 61938L)
    public static SubLObject meta_transformation_module_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, inference_modules.$meta_transformation_modules$.getGlobalValue(), (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 62048L)
    public static SubLObject meta_transformation_module_count() {
        return Sequences.length(inference_modules.$meta_transformation_modules$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 62148L)
    public static SubLObject inference_meta_transformation_module(final SubLObject name, SubLObject plist) {
        if (plist == inference_modules.UNPROVIDED) {
            plist = (SubLObject)inference_modules.NIL;
        }
        final SubLObject item_var;
        final SubLObject hl_module = item_var = setup_module(name, (SubLObject)inference_modules.$kw192$META_TRANSFORMATION, plist);
        if (inference_modules.NIL == conses_high.member(item_var, inference_modules.$meta_transformation_modules$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_modules.EQL), Symbols.symbol_function((SubLObject)inference_modules.IDENTITY))) {
            inference_modules.$meta_transformation_modules$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, inference_modules.$meta_transformation_modules$.getGlobalValue()));
        }
        return hl_module;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 62699L)
    public static SubLObject do_rewrite_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_modules.$list174);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject module = (SubLObject)inference_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_modules.$list174);
        module = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)inference_modules.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)inference_modules.NIL;
        SubLObject current_$10 = (SubLObject)inference_modules.NIL;
        while (inference_modules.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_modules.$list174);
            current_$10 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_modules.$list174);
            if (inference_modules.NIL == conses_high.member(current_$10, (SubLObject)inference_modules.$list87, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED)) {
                bad = (SubLObject)inference_modules.T;
            }
            if (current_$10 == inference_modules.$kw88$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (inference_modules.NIL != bad && inference_modules.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_modules.$list174);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)inference_modules.$kw89$DONE, current);
        final SubLObject done = (SubLObject)((inference_modules.NIL != done_tail) ? conses_high.cadr(done_tail) : inference_modules.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)inference_modules.$sym5$DO_LIST, (SubLObject)ConsesLow.list(module, (SubLObject)inference_modules.$list194, (SubLObject)inference_modules.$kw89$DONE, done), ConsesLow.append(body, (SubLObject)inference_modules.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 62838L)
    public static SubLObject rewrite_modules() {
        return conses_high.copy_list(inference_modules.$rewrite_modules$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 62915L)
    public static SubLObject rewrite_module_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, inference_modules.$rewrite_modules$.getGlobalValue(), (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 63001L)
    public static SubLObject rewrite_module_count() {
        return Sequences.length(inference_modules.$rewrite_modules$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 63077L)
    public static SubLObject rewrite_module_support(final SubLObject module) {
        final SubLObject support_spec = hl_module_property_without_values(module, (SubLObject)inference_modules.$kw195$REWRITE_SUPPORT);
        if (support_spec.isSymbol()) {
            return Symbols.symbol_value(support_spec);
        }
        return support_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 63383L)
    public static SubLObject rewrite_module_closure(final SubLObject module) {
        return hl_module_property_without_values(module, (SubLObject)inference_modules.$kw196$REWRITE_CLOSURE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 63604L)
    public static SubLObject inference_rewrite_module(final SubLObject name, final SubLObject plist) {
        final SubLObject strengthened_plist = strengthen_rewrite_module_properties(name, plist);
        final SubLObject item_var;
        final SubLObject hl_module = item_var = setup_module(name, (SubLObject)inference_modules.$kw197$REWRITE, strengthened_plist);
        if (inference_modules.NIL == conses_high.member(item_var, inference_modules.$rewrite_modules$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_modules.EQL), Symbols.symbol_function((SubLObject)inference_modules.IDENTITY))) {
            inference_modules.$rewrite_modules$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, inference_modules.$rewrite_modules$.getGlobalValue()));
        }
        return hl_module;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 63991L)
    public static SubLObject undeclare_rewrite_module(final SubLObject hl_module) {
        return deregister_rewrite_module(hl_module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 64091L)
    public static SubLObject undeclare_rewrite_module_by_name(final SubLObject name) {
        return deregister_rewrite_module_by_name(name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 64197L)
    public static SubLObject deregister_rewrite_module(final SubLObject module) {
        remove_hl_module(module);
        inference_modules.$rewrite_modules$.setGlobalValue(Sequences.remove(module, inference_modules.$rewrite_modules$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_modules.EQL), (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED));
        return module;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 64448L)
    public static SubLObject deregister_rewrite_module_by_name(final SubLObject name) {
        final SubLObject module = find_hl_module_by_name(name);
        return deregister_rewrite_module(module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 64651L)
    public static SubLObject strengthen_rewrite_module_properties(final SubLObject name, SubLObject plist) {
        plist = conses_high.copy_tree(plist);
        final SubLObject pcase_var;
        final SubLObject sense = pcase_var = conses_high.getf(plist, (SubLObject)inference_modules.$kw56$SENSE, (SubLObject)inference_modules.UNPROVIDED);
        if (!pcase_var.eql((SubLObject)inference_modules.$kw164$POS)) {
            if (!pcase_var.eql((SubLObject)inference_modules.$kw165$NEG)) {
                Errors.error((SubLObject)inference_modules.$str198$rewrite_module__S_must_have_a__SE, name);
            }
        }
        return plist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 65334L)
    public static SubLObject structural_module_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, inference_modules.$structural_modules$.getGlobalValue(), (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 65426L)
    public static SubLObject inference_structural_module(final SubLObject name, SubLObject plist) {
        if (plist == inference_modules.UNPROVIDED) {
            plist = (SubLObject)inference_modules.NIL;
        }
        final SubLObject item_var;
        final SubLObject hl_module = item_var = setup_module(name, (SubLObject)inference_modules.$kw200$STRUCTURAL, plist);
        if (inference_modules.NIL == conses_high.member(item_var, inference_modules.$structural_modules$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_modules.EQL), Symbols.symbol_function((SubLObject)inference_modules.IDENTITY))) {
            inference_modules.$structural_modules$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, inference_modules.$structural_modules$.getGlobalValue()));
        }
        return hl_module;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 65627L)
    public static SubLObject structural_module_count() {
        return Sequences.length(inference_modules.$structural_modules$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 66051L)
    public static SubLObject do_meta_structural_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_modules.$list147);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject hl_module = (SubLObject)inference_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_modules.$list147);
        hl_module = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)inference_modules.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)inference_modules.NIL;
        SubLObject current_$11 = (SubLObject)inference_modules.NIL;
        while (inference_modules.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_modules.$list147);
            current_$11 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_modules.$list147);
            if (inference_modules.NIL == conses_high.member(current_$11, (SubLObject)inference_modules.$list87, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED)) {
                bad = (SubLObject)inference_modules.T;
            }
            if (current_$11 == inference_modules.$kw88$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (inference_modules.NIL != bad && inference_modules.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_modules.$list147);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)inference_modules.$kw89$DONE, current);
        final SubLObject done = (SubLObject)((inference_modules.NIL != done_tail) ? conses_high.cadr(done_tail) : inference_modules.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)inference_modules.$sym5$DO_LIST, (SubLObject)ConsesLow.list(hl_module, (SubLObject)inference_modules.$list202, (SubLObject)inference_modules.$kw89$DONE, done), ConsesLow.append(body, (SubLObject)inference_modules.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 66212L)
    public static SubLObject meta_structural_modules() {
        return inference_modules.$meta_structural_modules$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 66334L)
    public static SubLObject meta_structural_module_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, inference_modules.$meta_structural_modules$.getGlobalValue(), (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 66436L)
    public static SubLObject meta_structural_module_count() {
        return Sequences.length(inference_modules.$meta_structural_modules$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 66528L)
    public static SubLObject inference_meta_structural_module(final SubLObject name, SubLObject plist) {
        if (plist == inference_modules.UNPROVIDED) {
            plist = (SubLObject)inference_modules.NIL;
        }
        final SubLObject item_var;
        final SubLObject hl_module = item_var = setup_module(name, (SubLObject)inference_modules.$kw205$META_STRUCTURAL, plist);
        if (inference_modules.NIL == conses_high.member(item_var, inference_modules.$meta_structural_modules$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_modules.EQL), Symbols.symbol_function((SubLObject)inference_modules.IDENTITY))) {
            inference_modules.$meta_structural_modules$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, inference_modules.$meta_structural_modules$.getGlobalValue()));
        }
        return hl_module;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 66919L)
    public static SubLObject cfasl_output_object_hl_module_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_wide_output_hl_module(v_object, stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 67036L)
    public static SubLObject cfasl_wide_output_hl_module(final SubLObject hl_module, final SubLObject stream) {
        cfasl.cfasl_output_wide_opcode(inference_modules.$cfasl_wide_opcode_hl_module$.getGlobalValue(), stream);
        cfasl_output_hl_module_internal(hl_module, stream);
        return hl_module;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 67239L)
    public static SubLObject cfasl_output_hl_module_internal(final SubLObject hl_module, final SubLObject stream) {
        cfasl.cfasl_output(hl_module_name(hl_module), stream);
        cfasl.cfasl_output(hl_module_plist(hl_module), stream);
        return hl_module;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-modules.lisp", position = 67430L)
    public static SubLObject cfasl_input_hl_module(final SubLObject stream) {
        final SubLObject name = cfasl.cfasl_input(stream, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED);
        final SubLObject plist = cfasl.cfasl_input(stream, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED);
        return new_hl_module(name, plist);
    }
    
    public static SubLObject declare_inference_modules_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_property_p", "HL-MODULE-PROPERTY-P", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_modules", "do_hl_module_properties", "DO-HL-MODULE-PROPERTIES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_properties", "HL-MODULE-PROPERTIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "removal_module_plist_indicators", "REMOVAL-MODULE-PLIST-INDICATORS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_subtype_p", "HL-MODULE-SUBTYPE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "allowed_modules_spec_p", "ALLOWED-MODULES-SPEC-P", 1, 0, false);
        new $allowed_modules_spec_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "non_universal_allowed_modules_spec_p", "NON-UNIVERSAL-ALLOWED-MODULES-SPEC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "disjunctive_allowed_modules_spec_p", "DISJUNCTIVE-ALLOWED-MODULES-SPEC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "conjunctive_allowed_modules_spec_p", "CONJUNCTIVE-ALLOWED-MODULES-SPEC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "negated_allowed_modules_spec_p", "NEGATED-ALLOWED-MODULES-SPEC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_type_spec_p", "HL-MODULE-TYPE-SPEC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_subtype_spec_p", "HL-MODULE-SUBTYPE-SPEC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "property_allowed_modules_spec_p", "PROPERTY-ALLOWED-MODULES-SPEC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_allowedP", "HL-MODULE-ALLOWED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_allowed_by_allowed_modules_specP", "HL-MODULE-ALLOWED-BY-ALLOWED-MODULES-SPEC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "simple_allowed_modules_spec_p", "SIMPLE-ALLOWED-MODULES-SPEC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "get_modules_from_simple_allowed_modules_spec", "GET-MODULES-FROM-SIMPLE-ALLOWED-MODULES-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_print_function_trampoline", "HL-MODULE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_p", "HL-MODULE-P", 1, 0, false);
        new $hl_module_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_mod_name", "HL-MOD-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_mod_plist", "HL-MOD-PLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_mod_sense", "HL-MOD-SENSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_mod_predicate", "HL-MOD-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_mod_any_predicates", "HL-MOD-ANY-PREDICATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_mod_arity", "HL-MOD-ARITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_mod_direction", "HL-MOD-DIRECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_mod_required_pattern", "HL-MOD-REQUIRED-PATTERN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_mod_required_mt", "HL-MOD-REQUIRED-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_mod_exclusive_func", "HL-MOD-EXCLUSIVE-FUNC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_mod_required_func", "HL-MOD-REQUIRED-FUNC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_mod_completeness", "HL-MOD-COMPLETENESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "_csetf_hl_mod_name", "_CSETF-HL-MOD-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "_csetf_hl_mod_plist", "_CSETF-HL-MOD-PLIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "_csetf_hl_mod_sense", "_CSETF-HL-MOD-SENSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "_csetf_hl_mod_predicate", "_CSETF-HL-MOD-PREDICATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "_csetf_hl_mod_any_predicates", "_CSETF-HL-MOD-ANY-PREDICATES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "_csetf_hl_mod_arity", "_CSETF-HL-MOD-ARITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "_csetf_hl_mod_direction", "_CSETF-HL-MOD-DIRECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "_csetf_hl_mod_required_pattern", "_CSETF-HL-MOD-REQUIRED-PATTERN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "_csetf_hl_mod_required_mt", "_CSETF-HL-MOD-REQUIRED-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "_csetf_hl_mod_exclusive_func", "_CSETF-HL-MOD-EXCLUSIVE-FUNC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "_csetf_hl_mod_required_func", "_CSETF-HL-MOD-REQUIRED-FUNC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "_csetf_hl_mod_completeness", "_CSETF-HL-MOD-COMPLETENESS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "make_hl_module", "MAKE-HL-MODULE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "visit_defstruct_hl_module", "VISIT-DEFSTRUCT-HL-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "visit_defstruct_object_hl_module_method", "VISIT-DEFSTRUCT-OBJECT-HL-MODULE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "print_hl_module", "PRINT-HL-MODULE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "sxhash_hl_module_method", "SXHASH-HL-MODULE-METHOD", 1, 0, false);
        new $sxhash_hl_module_method$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "check_hl_module_property_list", "CHECK-HL-MODULE-PROPERTY-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "new_hl_module", "NEW-HL-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "clear_cfasl_create_invalid_hl_module", "CLEAR-CFASL-CREATE-INVALID-HL-MODULE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "remove_cfasl_create_invalid_hl_module", "REMOVE-CFASL-CREATE-INVALID-HL-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "cfasl_create_invalid_hl_module_internal", "CFASL-CREATE-INVALID-HL-MODULE-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "cfasl_create_invalid_hl_module", "CFASL-CREATE-INVALID-HL-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "canonicalize_hl_module_plist", "CANONICALIZE-HL-MODULE-PLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "allocate_hl_module", "ALLOCATE-HL-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "destroy_hl_module", "DESTROY-HL-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_name", "HL-MODULE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_plist", "HL-MODULE-PLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_property", "HL-MODULE-PROPERTY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_property_without_values", "HL-MODULE-PROPERTY-WITHOUT-VALUES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_property_not_defaultP", "HL-MODULE-PROPERTY-NOT-DEFAULT?", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_modules", "do_hl_modules", "DO-HL-MODULES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_store", "HL-MODULE-STORE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "find_hl_module_by_name", "FIND-HL-MODULE-BY-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "add_hl_module", "ADD-HL-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "remove_hl_module", "REMOVE-HL-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "setup_module", "SETUP-MODULE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "default_cost_func", "DEFAULT-COST-FUNC", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "default_expand_func", "DEFAULT-EXPAND-FUNC", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_type", "HL-MODULE-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_subtypes", "HL-MODULE-SUBTYPES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "abductive_hl_moduleP", "ABDUCTIVE-HL-MODULE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_universal", "HL-MODULE-UNIVERSAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_source", "HL-MODULE-SOURCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_sense", "HL-MODULE-SENSE", 1, 0, false);
        new $hl_module_sense$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_sense_relevant_p", "HL-MODULE-SENSE-RELEVANT-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_required_pattern", "HL-MODULE-REQUIRED-PATTERN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_required_pattern_matched_p", "HL-MODULE-REQUIRED-PATTERN-MATCHED-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_required_mt", "HL-MODULE-REQUIRED-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_required_mt_result", "HL-MODULE-REQUIRED-MT-RESULT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "interpret_hl_module_mt_prop", "INTERPRET-HL-MODULE-MT-PROP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_required_mt_relevantP", "HL-MODULE-REQUIRED-MT-RELEVANT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_required_func", "HL-MODULE-REQUIRED-FUNC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_required_func_p", "HL-MODULE-REQUIRED-FUNC-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_cost_pattern", "HL-MODULE-COST-PATTERN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_cost_expression", "HL-MODULE-COST-EXPRESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_cost_func", "HL-MODULE-COST-FUNC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_cost", "HL-MODULE-COST", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_asent_cost", "HL-MODULE-ASENT-COST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_clause_cost", "HL-MODULE-CLAUSE-COST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_cost_pattern_result", "HL-MODULE-COST-PATTERN-RESULT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_cost_expression_result", "HL-MODULE-COST-EXPRESSION-RESULT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_cost_function_result", "HL-MODULE-COST-FUNCTION-RESULT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_asent_cost_function_result", "HL-MODULE-ASENT-COST-FUNCTION-RESULT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_clause_cost_function_result", "HL-MODULE-CLAUSE-COST-FUNCTION-RESULT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_is_checkP", "HL-MODULE-IS-CHECK?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "guess_hl_module_is_checkP", "GUESS-HL-MODULE-IS-CHECK?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_rule_select_func", "HL-MODULE-RULE-SELECT-FUNC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_rule_filter_func", "HL-MODULE-RULE-FILTER-FUNC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_expand_func", "HL-MODULE-EXPAND-FUNC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "default_expand_func_for_hl_module", "DEFAULT-EXPAND-FUNC-FOR-HL-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_expand_pattern", "HL-MODULE-EXPAND-PATTERN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_expand_iterative_pattern", "HL-MODULE-EXPAND-ITERATIVE-PATTERN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_predicate", "HL-MODULE-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_predicate_relevant_p", "HL-MODULE-PREDICATE-RELEVANT-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_arity", "HL-MODULE-ARITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_arity_relevant_p", "HL-MODULE-ARITY-RELEVANT-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_exclusive_func", "HL-MODULE-EXCLUSIVE-FUNC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_supplants_info", "HL-MODULE-SUPPLANTS-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_direction", "HL-MODULE-DIRECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_direction_relevantP", "HL-MODULE-DIRECTION-RELEVANT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_input_extract_pattern", "HL-MODULE-INPUT-EXTRACT-PATTERN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_input_verify_pattern", "HL-MODULE-INPUT-VERIFY-PATTERN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_input_encode_pattern", "HL-MODULE-INPUT-ENCODE-PATTERN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_output_check_pattern", "HL-MODULE-OUTPUT-CHECK-PATTERN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_output_generate_pattern", "HL-MODULE-OUTPUT-GENERATE-PATTERN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_output_decode_pattern", "HL-MODULE-OUTPUT-DECODE-PATTERN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_output_verify_pattern", "HL-MODULE-OUTPUT-VERIFY-PATTERN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_output_construct_pattern", "HL-MODULE-OUTPUT-CONSTRUCT-PATTERN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_support_pattern", "HL-MODULE-SUPPORT-PATTERN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_support_func", "HL-MODULE-SUPPORT-FUNC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_support_module", "HL-MODULE-SUPPORT-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_support_mt", "HL-MODULE-SUPPORT-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_support_mt_result", "HL-MODULE-SUPPORT-MT-RESULT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_support_strength", "HL-MODULE-SUPPORT-STRENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_every_predicates", "HL-MODULE-EVERY-PREDICATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_applicability_func", "HL-MODULE-APPLICABILITY-FUNC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_applicability_pattern", "HL-MODULE-APPLICABILITY-PATTERN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_any_predicates", "HL-MODULE-ANY-PREDICATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_documentation_string", "HL-MODULE-DOCUMENTATION-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_example_string", "HL-MODULE-EXAMPLE-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_completeP", "HL-MODULE-COMPLETE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_incompleteP", "HL-MODULE-INCOMPLETE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_completeness", "HL-MODULE-COMPLETENESS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_clause_completeness", "HL-MODULE-CLAUSE-COMPLETENESS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_externalP", "HL-MODULE-EXTERNAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_activeP", "HL-MODULE-ACTIVE?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "hl_module_implementation_methods", "HL-MODULE-IMPLEMENTATION-METHODS", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_modules", "do_removal_modules", "DO-REMOVAL-MODULES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "removal_modules", "REMOVAL-MODULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "removal_module_p", "REMOVAL-MODULE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "removal_module_count", "REMOVAL-MODULE-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "some_external_removal_modulesP", "SOME-EXTERNAL-REMOVAL-MODULES?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "removal_modules_external", "REMOVAL-MODULES-EXTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "generic_removal_module_p", "GENERIC-REMOVAL-MODULE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "generic_removal_modules", "GENERIC-REMOVAL-MODULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "generic_removal_modules_for_sense", "GENERIC-REMOVAL-MODULES-FOR-SENSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "generic_removal_module_count", "GENERIC-REMOVAL-MODULE-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "universal_removal_modules", "UNIVERSAL-REMOVAL-MODULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "universal_removal_module_p", "UNIVERSAL-REMOVAL-MODULE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "universal_removal_module_count", "UNIVERSAL-REMOVAL-MODULE-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "universal_removal_module_exception_predicates", "UNIVERSAL-REMOVAL-MODULE-EXCEPTION-PREDICATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "universal_removal_module_exception_predicateP", "UNIVERSAL-REMOVAL-MODULE-EXCEPTION-PREDICATE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "predicate_doesnt_use_universal_removal_moduleP", "PREDICATE-DOESNT-USE-UNIVERSAL-REMOVAL-MODULE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "universal_removal_modules_for_sense", "UNIVERSAL-REMOVAL-MODULES-FOR-SENSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "removal_modules_specific", "REMOVAL-MODULES-SPECIFIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "predicate_has_specific_removal_modulesP", "PREDICATE-HAS-SPECIFIC-REMOVAL-MODULES?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "removal_modules_specific_for_sense", "REMOVAL-MODULES-SPECIFIC-FOR-SENSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "removal_modules_universal_for_predicate_and_sense", "REMOVAL-MODULES-UNIVERSAL-FOR-PREDICATE-AND-SENSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "predicates_with_specific_removal_modules", "PREDICATES-WITH-SPECIFIC-REMOVAL-MODULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "specific_removal_modules", "SPECIFIC-REMOVAL-MODULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "specific_removal_module_count", "SPECIFIC-REMOVAL-MODULE-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "specific_removal_module_set", "SPECIFIC-REMOVAL-MODULE-SET", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "clear_solely_specific_removal_module_predicate_store", "CLEAR-SOLELY-SPECIFIC-REMOVAL-MODULE-PREDICATE-STORE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "rebuild_solely_specific_removal_module_predicate_store", "REBUILD-SOLELY-SPECIFIC-REMOVAL-MODULE-PREDICATE-STORE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "register_solely_specific_removal_module_predicate", "REGISTER-SOLELY-SPECIFIC-REMOVAL-MODULE-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "deregister_solely_specific_removal_module_predicate", "DEREGISTER-SOLELY-SPECIFIC-REMOVAL-MODULE-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "solely_specific_removal_module_predicateP", "SOLELY-SPECIFIC-REMOVAL-MODULE-PREDICATE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "inference_removal_module", "INFERENCE-REMOVAL-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "inference_removal_module_use_generic", "INFERENCE-REMOVAL-MODULE-USE-GENERIC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "inference_removal_module_use_meta_removal", "INFERENCE-REMOVAL-MODULE-USE-META-REMOVAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "inference_removal_module_dont_use_universal", "INFERENCE-REMOVAL-MODULE-DONT-USE-UNIVERSAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "redeclare_inference_removal_module", "REDECLARE-INFERENCE-REMOVAL-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "strengthen_removal_module_properties", "STRENGTHEN-REMOVAL-MODULE-PROPERTIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "undeclare_inference_removal_module", "UNDECLARE-INFERENCE-REMOVAL-MODULE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "undeclare_inference_meta_removal_module", "UNDECLARE-INFERENCE-META-REMOVAL-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "undeclare_inference_removal_module_use_generic", "UNDECLARE-INFERENCE-REMOVAL-MODULE-USE-GENERIC", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "undeclare_inference_removal_module_use_meta_removal", "UNDECLARE-INFERENCE-REMOVAL-MODULE-USE-META-REMOVAL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "undeclare_inference_removal_module_dont_use_universal", "UNDECLARE-INFERENCE-REMOVAL-MODULE-DONT-USE-UNIVERSAL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "reclassify_removal_modules", "RECLASSIFY-REMOVAL-MODULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "clear_removal_modules", "CLEAR-REMOVAL-MODULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "classify_removal_module", "CLASSIFY-REMOVAL-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "inference_removal_module_note_specific", "INFERENCE-REMOVAL-MODULE-NOTE-SPECIFIC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "inference_removal_moduleL_for_classification", "INFERENCE-REMOVAL-MODULE<-FOR-CLASSIFICATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "removal_module_specific_use_genericP_internal", "REMOVAL-MODULE-SPECIFIC-USE-GENERIC?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "removal_module_specific_use_genericP", "REMOVAL-MODULE-SPECIFIC-USE-GENERIC?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "inference_removal_pruning_module", "INFERENCE-REMOVAL-PRUNING-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "removal_pruning_moduleP", "REMOVAL-PRUNING-MODULE?", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_modules", "do_conjunctive_removal_modules", "DO-CONJUNCTIVE-REMOVAL-MODULES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "removal_modules_conjunctive", "REMOVAL-MODULES-CONJUNCTIVE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "conjunctive_removal_module_p", "CONJUNCTIVE-REMOVAL-MODULE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "conjunctive_removal_module_count", "CONJUNCTIVE-REMOVAL-MODULE-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "conjunctive_removal_modules", "CONJUNCTIVE-REMOVAL-MODULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "inference_conjunctive_removal_module", "INFERENCE-CONJUNCTIVE-REMOVAL-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "undeclare_inference_conjunctive_removal_module", "UNDECLARE-INFERENCE-CONJUNCTIVE-REMOVAL-MODULE", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_modules", "do_meta_removal_modules", "DO-META-REMOVAL-MODULES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "meta_removal_modules", "META-REMOVAL-MODULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "meta_removal_module_list", "META-REMOVAL-MODULE-LIST", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "meta_removal_module_p", "META-REMOVAL-MODULE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "meta_removal_module_count", "META-REMOVAL-MODULE-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "meta_removal_module_specific_predicates", "META-REMOVAL-MODULE-SPECIFIC-PREDICATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "meta_removal_module_specific_predicateP", "META-REMOVAL-MODULE-SPECIFIC-PREDICATE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "predicate_uses_meta_removal_moduleP", "PREDICATE-USES-META-REMOVAL-MODULE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "inference_meta_removal_module", "INFERENCE-META-REMOVAL-MODULE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "removal_proof_module_p", "REMOVAL-PROOF-MODULE-P", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_modules", "do_transformation_modules", "DO-TRANSFORMATION-MODULES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "transformation_modules", "TRANSFORMATION-MODULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "transformation_module_p", "TRANSFORMATION-MODULE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "transformation_module_count", "TRANSFORMATION-MODULE-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "inference_transformation_module", "INFERENCE-TRANSFORMATION-MODULE", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_modules", "do_meta_transformation_modules", "DO-META-TRANSFORMATION-MODULES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "meta_transformation_modules", "META-TRANSFORMATION-MODULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "meta_transformation_module_p", "META-TRANSFORMATION-MODULE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "meta_transformation_module_count", "META-TRANSFORMATION-MODULE-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "inference_meta_transformation_module", "INFERENCE-META-TRANSFORMATION-MODULE", 1, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_modules", "do_rewrite_modules", "DO-REWRITE-MODULES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "rewrite_modules", "REWRITE-MODULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "rewrite_module_p", "REWRITE-MODULE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "rewrite_module_count", "REWRITE-MODULE-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "rewrite_module_support", "REWRITE-MODULE-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "rewrite_module_closure", "REWRITE-MODULE-CLOSURE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "inference_rewrite_module", "INFERENCE-REWRITE-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "undeclare_rewrite_module", "UNDECLARE-REWRITE-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "undeclare_rewrite_module_by_name", "UNDECLARE-REWRITE-MODULE-BY-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "deregister_rewrite_module", "DEREGISTER-REWRITE-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "deregister_rewrite_module_by_name", "DEREGISTER-REWRITE-MODULE-BY-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "strengthen_rewrite_module_properties", "STRENGTHEN-REWRITE-MODULE-PROPERTIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "structural_module_p", "STRUCTURAL-MODULE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "inference_structural_module", "INFERENCE-STRUCTURAL-MODULE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "structural_module_count", "STRUCTURAL-MODULE-COUNT", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_modules", "do_meta_structural_modules", "DO-META-STRUCTURAL-MODULES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "meta_structural_modules", "META-STRUCTURAL-MODULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "meta_structural_module_p", "META-STRUCTURAL-MODULE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "meta_structural_module_count", "META-STRUCTURAL-MODULE-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "inference_meta_structural_module", "INFERENCE-META-STRUCTURAL-MODULE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "cfasl_output_object_hl_module_method", "CFASL-OUTPUT-OBJECT-HL-MODULE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "cfasl_wide_output_hl_module", "CFASL-WIDE-OUTPUT-HL-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "cfasl_output_hl_module_internal", "CFASL-OUTPUT-HL-MODULE-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_modules", "cfasl_input_hl_module", "CFASL-INPUT-HL-MODULE", 1, 0, false);
        return (SubLObject)inference_modules.NIL;
    }
    
    public static SubLObject init_inference_modules_file() {
        inference_modules.$meta_removal_modules$ = SubLFiles.deflexical("*META-REMOVAL-MODULES*", (SubLObject)((inference_modules.NIL != Symbols.boundp((SubLObject)inference_modules.$sym0$_META_REMOVAL_MODULES_)) ? inference_modules.$meta_removal_modules$.getGlobalValue() : inference_modules.NIL));
        inference_modules.$hl_module_properties$ = SubLFiles.deflexical("*HL-MODULE-PROPERTIES*", (SubLObject)inference_modules.$list1);
        inference_modules.$valid_hl_module_subtypes$ = SubLFiles.deflexical("*VALID-HL-MODULE-SUBTYPES*", (SubLObject)inference_modules.$list10);
        inference_modules.$default_hl_module_subtype$ = SubLFiles.deflexical("*DEFAULT-HL-MODULE-SUBTYPE*", (SubLObject)inference_modules.$kw11$KB);
        inference_modules.$hl_module_property_defaults$ = SubLFiles.deflexical("*HL-MODULE-PROPERTY-DEFAULTS*", dictionary_utilities.new_dictionary_from_alist(Sequences.reverse((SubLObject)ConsesLow.listS((SubLObject)inference_modules.$list12, (SubLObject)ConsesLow.list((SubLObject)inference_modules.$kw13$MODULE_SUBTYPE, inference_modules.$default_hl_module_subtype$.getGlobalValue()), (SubLObject)inference_modules.$list14)), Symbols.symbol_function((SubLObject)inference_modules.EQL)));
        inference_modules.$dtp_hl_module$ = SubLFiles.defconstant("*DTP-HL-MODULE*", (SubLObject)inference_modules.$sym22$HL_MODULE);
        inference_modules.$cfasl_create_invalid_hl_module_caching_state$ = SubLFiles.deflexical("*CFASL-CREATE-INVALID-HL-MODULE-CACHING-STATE*", (SubLObject)inference_modules.NIL);
        inference_modules.$hl_module_store$ = SubLFiles.deflexical("*HL-MODULE-STORE*", (inference_modules.NIL != Symbols.boundp((SubLObject)inference_modules.$sym84$_HL_MODULE_STORE_)) ? inference_modules.$hl_module_store$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)inference_modules.$int85$212, Symbols.symbol_function((SubLObject)inference_modules.EQUAL), (SubLObject)inference_modules.UNPROVIDED));
        inference_modules.$removal_modules$ = SubLFiles.deflexical("*REMOVAL-MODULES*", (inference_modules.NIL != Symbols.boundp((SubLObject)inference_modules.$sym146$_REMOVAL_MODULES_)) ? inference_modules.$removal_modules$.getGlobalValue() : set.new_set(Symbols.symbol_function((SubLObject)inference_modules.EQL), (SubLObject)inference_modules.UNPROVIDED));
        inference_modules.$removal_modules_external$ = SubLFiles.deflexical("*REMOVAL-MODULES-EXTERNAL*", (SubLObject)((inference_modules.NIL != Symbols.boundp((SubLObject)inference_modules.$sym152$_REMOVAL_MODULES_EXTERNAL_)) ? inference_modules.$removal_modules_external$.getGlobalValue() : inference_modules.NIL));
        inference_modules.$removal_modules_generic$ = SubLFiles.deflexical("*REMOVAL-MODULES-GENERIC*", (SubLObject)((inference_modules.NIL != Symbols.boundp((SubLObject)inference_modules.$sym153$_REMOVAL_MODULES_GENERIC_)) ? inference_modules.$removal_modules_generic$.getGlobalValue() : inference_modules.NIL));
        inference_modules.$removal_modules_universal$ = SubLFiles.deflexical("*REMOVAL-MODULES-UNIVERSAL*", (SubLObject)((inference_modules.NIL != Symbols.boundp((SubLObject)inference_modules.$sym155$_REMOVAL_MODULES_UNIVERSAL_)) ? inference_modules.$removal_modules_universal$.getGlobalValue() : inference_modules.NIL));
        inference_modules.$removal_modules_specific$ = SubLFiles.deflexical("*REMOVAL-MODULES-SPECIFIC*", (inference_modules.NIL != Symbols.boundp((SubLObject)inference_modules.$sym156$_REMOVAL_MODULES_SPECIFIC_)) ? inference_modules.$removal_modules_specific$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)inference_modules.$int157$32, (SubLObject)inference_modules.UNPROVIDED, (SubLObject)inference_modules.UNPROVIDED));
        inference_modules.$removal_modules_specific_use_generic$ = SubLFiles.deflexical("*REMOVAL-MODULES-SPECIFIC-USE-GENERIC*", (SubLObject)((inference_modules.NIL != Symbols.boundp((SubLObject)inference_modules.$sym159$_REMOVAL_MODULES_SPECIFIC_USE_GENERIC_)) ? inference_modules.$removal_modules_specific_use_generic$.getGlobalValue() : inference_modules.NIL));
        inference_modules.$removal_modules_specific_use_meta_removal$ = SubLFiles.deflexical("*REMOVAL-MODULES-SPECIFIC-USE-META-REMOVAL*", (SubLObject)((inference_modules.NIL != Symbols.boundp((SubLObject)inference_modules.$sym160$_REMOVAL_MODULES_SPECIFIC_USE_META_REMOVAL_)) ? inference_modules.$removal_modules_specific_use_meta_removal$.getGlobalValue() : inference_modules.NIL));
        inference_modules.$removal_modules_specific_dont_use_universal$ = SubLFiles.deflexical("*REMOVAL-MODULES-SPECIFIC-DONT-USE-UNIVERSAL*", (SubLObject)((inference_modules.NIL != Symbols.boundp((SubLObject)inference_modules.$sym161$_REMOVAL_MODULES_SPECIFIC_DONT_USE_UNIVERSAL_)) ? inference_modules.$removal_modules_specific_dont_use_universal$.getGlobalValue() : inference_modules.NIL));
        inference_modules.$solely_specific_removal_module_predicate_store$ = SubLFiles.deflexical("*SOLELY-SPECIFIC-REMOVAL-MODULE-PREDICATE-STORE*", (inference_modules.NIL != Symbols.boundp((SubLObject)inference_modules.$sym162$_SOLELY_SPECIFIC_REMOVAL_MODULE_PREDICATE_STORE_)) ? inference_modules.$solely_specific_removal_module_predicate_store$.getGlobalValue() : set.new_set((SubLObject)inference_modules.EQL, (SubLObject)inference_modules.$int163$50));
        inference_modules.$classify_removal_modules_with_deterministic_sortP$ = SubLFiles.defparameter("*CLASSIFY-REMOVAL-MODULES-WITH-DETERMINISTIC-SORT?*", (SubLObject)inference_modules.T);
        inference_modules.$removal_pruning_module_properties$ = SubLFiles.deflexical("*REMOVAL-PRUNING-MODULE-PROPERTIES*", (SubLObject)inference_modules.$list171);
        inference_modules.$conjunctive_removal_modules$ = SubLFiles.deflexical("*CONJUNCTIVE-REMOVAL-MODULES*", (inference_modules.NIL != Symbols.boundp((SubLObject)inference_modules.$sym173$_CONJUNCTIVE_REMOVAL_MODULES_)) ? inference_modules.$conjunctive_removal_modules$.getGlobalValue() : set.new_set(Symbols.symbol_function((SubLObject)inference_modules.EQL), (SubLObject)inference_modules.UNPROVIDED));
        inference_modules.$transformation_modules$ = SubLFiles.deflexical("*TRANSFORMATION-MODULES*", (SubLObject)((inference_modules.NIL != Symbols.boundp((SubLObject)inference_modules.$sym183$_TRANSFORMATION_MODULES_)) ? inference_modules.$transformation_modules$.getGlobalValue() : inference_modules.NIL));
        inference_modules.$meta_transformation_modules$ = SubLFiles.deflexical("*META-TRANSFORMATION-MODULES*", (SubLObject)((inference_modules.NIL != Symbols.boundp((SubLObject)inference_modules.$sym188$_META_TRANSFORMATION_MODULES_)) ? inference_modules.$meta_transformation_modules$.getGlobalValue() : inference_modules.NIL));
        inference_modules.$rewrite_modules$ = SubLFiles.deflexical("*REWRITE-MODULES*", (SubLObject)((inference_modules.NIL != Symbols.boundp((SubLObject)inference_modules.$sym193$_REWRITE_MODULES_)) ? inference_modules.$rewrite_modules$.getGlobalValue() : inference_modules.NIL));
        inference_modules.$structural_modules$ = SubLFiles.deflexical("*STRUCTURAL-MODULES*", (SubLObject)((inference_modules.NIL != Symbols.boundp((SubLObject)inference_modules.$sym199$_STRUCTURAL_MODULES_)) ? inference_modules.$structural_modules$.getGlobalValue() : inference_modules.NIL));
        inference_modules.$meta_structural_modules$ = SubLFiles.deflexical("*META-STRUCTURAL-MODULES*", (SubLObject)((inference_modules.NIL != Symbols.boundp((SubLObject)inference_modules.$sym201$_META_STRUCTURAL_MODULES_)) ? inference_modules.$meta_structural_modules$.getGlobalValue() : inference_modules.NIL));
        inference_modules.$cfasl_wide_opcode_hl_module$ = SubLFiles.defconstant("*CFASL-WIDE-OPCODE-HL-MODULE*", (SubLObject)inference_modules.$int206$256);
        return (SubLObject)inference_modules.NIL;
    }
    
    public static SubLObject setup_inference_modules_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)inference_modules.$sym0$_META_REMOVAL_MODULES_);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), inference_modules.$dtp_hl_module$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_modules.$sym28$HL_MODULE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)inference_modules.$list29);
        Structures.def_csetf((SubLObject)inference_modules.$sym30$HL_MOD_NAME, (SubLObject)inference_modules.$sym31$_CSETF_HL_MOD_NAME);
        Structures.def_csetf((SubLObject)inference_modules.$sym32$HL_MOD_PLIST, (SubLObject)inference_modules.$sym33$_CSETF_HL_MOD_PLIST);
        Structures.def_csetf((SubLObject)inference_modules.$sym34$HL_MOD_SENSE, (SubLObject)inference_modules.$sym35$_CSETF_HL_MOD_SENSE);
        Structures.def_csetf((SubLObject)inference_modules.$sym36$HL_MOD_PREDICATE, (SubLObject)inference_modules.$sym37$_CSETF_HL_MOD_PREDICATE);
        Structures.def_csetf((SubLObject)inference_modules.$sym38$HL_MOD_ANY_PREDICATES, (SubLObject)inference_modules.$sym39$_CSETF_HL_MOD_ANY_PREDICATES);
        Structures.def_csetf((SubLObject)inference_modules.$sym40$HL_MOD_ARITY, (SubLObject)inference_modules.$sym41$_CSETF_HL_MOD_ARITY);
        Structures.def_csetf((SubLObject)inference_modules.$sym42$HL_MOD_DIRECTION, (SubLObject)inference_modules.$sym43$_CSETF_HL_MOD_DIRECTION);
        Structures.def_csetf((SubLObject)inference_modules.$sym44$HL_MOD_REQUIRED_PATTERN, (SubLObject)inference_modules.$sym45$_CSETF_HL_MOD_REQUIRED_PATTERN);
        Structures.def_csetf((SubLObject)inference_modules.$sym46$HL_MOD_REQUIRED_MT, (SubLObject)inference_modules.$sym47$_CSETF_HL_MOD_REQUIRED_MT);
        Structures.def_csetf((SubLObject)inference_modules.$sym48$HL_MOD_EXCLUSIVE_FUNC, (SubLObject)inference_modules.$sym49$_CSETF_HL_MOD_EXCLUSIVE_FUNC);
        Structures.def_csetf((SubLObject)inference_modules.$sym50$HL_MOD_REQUIRED_FUNC, (SubLObject)inference_modules.$sym51$_CSETF_HL_MOD_REQUIRED_FUNC);
        Structures.def_csetf((SubLObject)inference_modules.$sym52$HL_MOD_COMPLETENESS, (SubLObject)inference_modules.$sym53$_CSETF_HL_MOD_COMPLETENESS);
        Equality.identity((SubLObject)inference_modules.$sym22$HL_MODULE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), inference_modules.$dtp_hl_module$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_modules.$sym71$VISIT_DEFSTRUCT_OBJECT_HL_MODULE_METHOD));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), inference_modules.$dtp_hl_module$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_modules.$sym73$SXHASH_HL_MODULE_METHOD));
        memoization_state.note_globally_cached_function((SubLObject)inference_modules.$sym79$CFASL_CREATE_INVALID_HL_MODULE);
        subl_macro_promotions.declare_defglobal((SubLObject)inference_modules.$sym84$_HL_MODULE_STORE_);
        access_macros.register_macro_helper((SubLObject)inference_modules.$sym94$HL_MODULE_STORE, (SubLObject)inference_modules.$sym95$DO_HL_MODULES);
        subl_macro_promotions.declare_defglobal((SubLObject)inference_modules.$sym146$_REMOVAL_MODULES_);
        access_macros.register_macro_helper((SubLObject)inference_modules.$sym150$REMOVAL_MODULES, (SubLObject)inference_modules.$sym151$DO_REMOVAL_MODULES);
        subl_macro_promotions.declare_defglobal((SubLObject)inference_modules.$sym152$_REMOVAL_MODULES_EXTERNAL_);
        subl_macro_promotions.declare_defglobal((SubLObject)inference_modules.$sym153$_REMOVAL_MODULES_GENERIC_);
        subl_macro_promotions.declare_defglobal((SubLObject)inference_modules.$sym155$_REMOVAL_MODULES_UNIVERSAL_);
        subl_macro_promotions.declare_defglobal((SubLObject)inference_modules.$sym156$_REMOVAL_MODULES_SPECIFIC_);
        subl_macro_promotions.declare_defglobal((SubLObject)inference_modules.$sym159$_REMOVAL_MODULES_SPECIFIC_USE_GENERIC_);
        subl_macro_promotions.declare_defglobal((SubLObject)inference_modules.$sym160$_REMOVAL_MODULES_SPECIFIC_USE_META_REMOVAL_);
        subl_macro_promotions.declare_defglobal((SubLObject)inference_modules.$sym161$_REMOVAL_MODULES_SPECIFIC_DONT_USE_UNIVERSAL_);
        subl_macro_promotions.declare_defglobal((SubLObject)inference_modules.$sym162$_SOLELY_SPECIFIC_REMOVAL_MODULE_PREDICATE_STORE_);
        memoization_state.note_memoized_function((SubLObject)inference_modules.$sym170$REMOVAL_MODULE_SPECIFIC_USE_GENERIC_);
        subl_macro_promotions.declare_defglobal((SubLObject)inference_modules.$sym173$_CONJUNCTIVE_REMOVAL_MODULES_);
        access_macros.register_macro_helper((SubLObject)inference_modules.$sym176$REMOVAL_MODULES_CONJUNCTIVE, (SubLObject)inference_modules.$sym177$DO_CONJUNCTIVE_REMOVAL_MODULES);
        access_macros.register_macro_helper((SubLObject)inference_modules.$sym180$META_REMOVAL_MODULES, (SubLObject)inference_modules.$sym181$DO_META_REMOVAL_MODULES);
        subl_macro_promotions.declare_defglobal((SubLObject)inference_modules.$sym183$_TRANSFORMATION_MODULES_);
        access_macros.register_macro_helper((SubLObject)inference_modules.$sym185$TRANSFORMATION_MODULES, (SubLObject)inference_modules.$sym186$DO_TRANSFORMATION_MODULES);
        subl_macro_promotions.declare_defglobal((SubLObject)inference_modules.$sym188$_META_TRANSFORMATION_MODULES_);
        access_macros.register_macro_helper((SubLObject)inference_modules.$sym190$META_TRANSFORMATION_MODULES, (SubLObject)inference_modules.$sym191$DO_META_TRANSFORMATION_MODULES);
        subl_macro_promotions.declare_defglobal((SubLObject)inference_modules.$sym193$_REWRITE_MODULES_);
        subl_macro_promotions.declare_defglobal((SubLObject)inference_modules.$sym199$_STRUCTURAL_MODULES_);
        subl_macro_promotions.declare_defglobal((SubLObject)inference_modules.$sym201$_META_STRUCTURAL_MODULES_);
        access_macros.register_macro_helper((SubLObject)inference_modules.$sym203$META_STRUCTURAL_MODULES, (SubLObject)inference_modules.$sym204$DO_META_STRUCTURAL_MODULES);
        cfasl.register_wide_cfasl_opcode_input_function(inference_modules.$cfasl_wide_opcode_hl_module$.getGlobalValue(), (SubLObject)inference_modules.$sym207$CFASL_INPUT_HL_MODULE);
        Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), inference_modules.$dtp_hl_module$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_modules.$sym208$CFASL_OUTPUT_OBJECT_HL_MODULE_METHOD));
        return (SubLObject)inference_modules.NIL;
    }
    
    public void declareFunctions() {
        declare_inference_modules_file();
    }
    
    public void initializeVariables() {
        init_inference_modules_file();
    }
    
    public void runTopLevelForms() {
        setup_inference_modules_file();
    }
    
    static {
        me = (SubLFile)new inference_modules();
        inference_modules.$meta_removal_modules$ = null;
        inference_modules.$hl_module_properties$ = null;
        inference_modules.$valid_hl_module_subtypes$ = null;
        inference_modules.$default_hl_module_subtype$ = null;
        inference_modules.$hl_module_property_defaults$ = null;
        inference_modules.$dtp_hl_module$ = null;
        inference_modules.$cfasl_create_invalid_hl_module_caching_state$ = null;
        inference_modules.$hl_module_store$ = null;
        inference_modules.$removal_modules$ = null;
        inference_modules.$removal_modules_external$ = null;
        inference_modules.$removal_modules_generic$ = null;
        inference_modules.$removal_modules_universal$ = null;
        inference_modules.$removal_modules_specific$ = null;
        inference_modules.$removal_modules_specific_use_generic$ = null;
        inference_modules.$removal_modules_specific_use_meta_removal$ = null;
        inference_modules.$removal_modules_specific_dont_use_universal$ = null;
        inference_modules.$solely_specific_removal_module_predicate_store$ = null;
        inference_modules.$classify_removal_modules_with_deterministic_sortP$ = null;
        inference_modules.$removal_pruning_module_properties$ = null;
        inference_modules.$conjunctive_removal_modules$ = null;
        inference_modules.$transformation_modules$ = null;
        inference_modules.$meta_transformation_modules$ = null;
        inference_modules.$rewrite_modules$ = null;
        inference_modules.$structural_modules$ = null;
        inference_modules.$meta_structural_modules$ = null;
        inference_modules.$cfasl_wide_opcode_hl_module$ = null;
        $sym0$_META_REMOVAL_MODULES_ = SubLObjectFactory.makeSymbol("*META-REMOVAL-MODULES*");
        $list1 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("MODULE-TYPE"), SubLObjectFactory.makeKeyword("MODULE-SUBTYPE"), SubLObjectFactory.makeKeyword("MODULE-SOURCE"), SubLObjectFactory.makeKeyword("CHECK"), SubLObjectFactory.makeKeyword("EXTERNAL"), SubLObjectFactory.makeKeyword("UNIVERSAL"), SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("DIRECTION"), SubLObjectFactory.makeKeyword("PREDICATE"), SubLObjectFactory.makeKeyword("EVERY-PREDICATES"), SubLObjectFactory.makeKeyword("ANY-PREDICATES"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), SubLObjectFactory.makeKeyword("REQUIRED-MT"), SubLObjectFactory.makeKeyword("ARITY"), SubLObjectFactory.makeKeyword("EXCLUSIVE"), SubLObjectFactory.makeKeyword("SUPPLANTS"), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeKeyword("APPLICABILITY-PATTERN"), SubLObjectFactory.makeKeyword("APPLICABILITY"), SubLObjectFactory.makeKeyword("COST-PATTERN"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE-PATTERN"), SubLObjectFactory.makeKeyword("COMPLETENESS-PATTERN"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), SubLObjectFactory.makeKeyword("INPUT-VERIFY-PATTERN"), SubLObjectFactory.makeKeyword("INPUT-ENCODE-PATTERN"), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), SubLObjectFactory.makeKeyword("OUTPUT-VERIFY-PATTERN"), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), SubLObjectFactory.makeKeyword("RULE-SELECT"), SubLObjectFactory.makeKeyword("RULE-FILTER"), SubLObjectFactory.makeKeyword("EXPAND-ITERATIVE-PATTERN"), SubLObjectFactory.makeKeyword("EXPAND-PATTERN"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeKeyword("REWRITE-CLOSURE"), SubLObjectFactory.makeKeyword("SUPPORT-PATTERN"), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("REWRITE-SUPPORT"), SubLObjectFactory.makeKeyword("ARGUMENT-TYPE"), SubLObjectFactory.makeKeyword("INCOMPLETENESS"), SubLObjectFactory.makeKeyword("ADD"), SubLObjectFactory.makeKeyword("REMOVE"), SubLObjectFactory.makeKeyword("REMOVE-ALL"), SubLObjectFactory.makeKeyword("PREFERRED-OVER"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeKeyword("PRETTY-NAME") });
        $list2 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROPERTY-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("HL-MODULE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym3$MODULE_VAR = SubLObjectFactory.makeUninternedSymbol("MODULE-VAR");
        $sym4$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym5$DO_LIST = SubLObjectFactory.makeSymbol("DO-LIST");
        $list6 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-MODULE-PROPERTIES")));
        $sym7$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym8$HL_MODULE_PROPERTY_NOT_DEFAULT_ = SubLObjectFactory.makeSymbol("HL-MODULE-PROPERTY-NOT-DEFAULT?");
        $sym9$HL_MODULE_PROPERTY_WITHOUT_VALUES = SubLObjectFactory.makeSymbol("HL-MODULE-PROPERTY-WITHOUT-VALUES");
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SKSI"), (SubLObject)SubLObjectFactory.makeKeyword("KB"), (SubLObject)SubLObjectFactory.makeKeyword("ABDUCTION"), (SubLObject)SubLObjectFactory.makeKeyword("PRUNING"));
        $kw11$KB = SubLObjectFactory.makeKeyword("KB");
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MODULE-TYPE"));
        $kw13$MODULE_SUBTYPE = SubLObjectFactory.makeKeyword("MODULE-SUBTYPE");
        $list14 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MODULE-SOURCE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("UNIVERSAL")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-MT")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REQUIRED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COST-PATTERN")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COST-EXPRESSION")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("COST"), (SubLObject)SubLObjectFactory.makeSymbol("DEFAULT-COST-FUNC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COMPLETENESS")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COMPLETE-PATTERN")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COMPLETENESS-PATTERN")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("CHECK"), (SubLObject)SubLObjectFactory.makeKeyword("UNKNOWN")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RULE-SELECT")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("EXPAND"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPAND-PATTERN")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPAND-ITERATIVE-PATTERN")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PREDICATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ARITY")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXCLUSIVE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("SUPPLANTS"), (SubLObject)SubLObjectFactory.makeKeyword("ALL")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("INPUT-VERIFY-PATTERN"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("INPUT-ENCODE-PATTERN"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("OUTPUT-VERIFY-PATTERN"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUPPORT-PATTERN")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUPPORT")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), (SubLObject)SubLObjectFactory.makeKeyword("OPAQUE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUPPORT-MT")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EVERY-PREDICATES")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("APPLICABILITY"), (SubLObject)SubLObjectFactory.makeSymbol("FALSE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("APPLICABILITY-PATTERN")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANY-PREDICATES")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("EXAMPLE"), (SubLObject)SubLObjectFactory.makeString("")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXTERNAL")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REWRITE-SUPPORT")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REWRITE-CLOSURE")) });
        $kw15$ALL = SubLObjectFactory.makeKeyword("ALL");
        $kw16$OR = SubLObjectFactory.makeKeyword("OR");
        $sym17$ALLOWED_MODULES_SPEC_P = SubLObjectFactory.makeSymbol("ALLOWED-MODULES-SPEC-P");
        $kw18$AND = SubLObjectFactory.makeKeyword("AND");
        $kw19$NOT = SubLObjectFactory.makeKeyword("NOT");
        $kw20$MODULE_TYPE = SubLObjectFactory.makeKeyword("MODULE-TYPE");
        $sym21$HL_MODULE_P = SubLObjectFactory.makeSymbol("HL-MODULE-P");
        $sym22$HL_MODULE = SubLObjectFactory.makeSymbol("HL-MODULE");
        $list23 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("NAME"), SubLObjectFactory.makeSymbol("PLIST"), SubLObjectFactory.makeSymbol("SENSE"), SubLObjectFactory.makeSymbol("PREDICATE"), SubLObjectFactory.makeSymbol("ANY-PREDICATES"), SubLObjectFactory.makeSymbol("ARITY"), SubLObjectFactory.makeSymbol("DIRECTION"), SubLObjectFactory.makeSymbol("REQUIRED-PATTERN"), SubLObjectFactory.makeSymbol("REQUIRED-MT"), SubLObjectFactory.makeSymbol("EXCLUSIVE-FUNC"), SubLObjectFactory.makeSymbol("REQUIRED-FUNC"), SubLObjectFactory.makeSymbol("COMPLETENESS") });
        $list24 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeKeyword("PLIST"), SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("PREDICATE"), SubLObjectFactory.makeKeyword("ANY-PREDICATES"), SubLObjectFactory.makeKeyword("ARITY"), SubLObjectFactory.makeKeyword("DIRECTION"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), SubLObjectFactory.makeKeyword("REQUIRED-MT"), SubLObjectFactory.makeKeyword("EXCLUSIVE-FUNC"), SubLObjectFactory.makeKeyword("REQUIRED-FUNC"), SubLObjectFactory.makeKeyword("COMPLETENESS") });
        $list25 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("HL-MOD-NAME"), SubLObjectFactory.makeSymbol("HL-MOD-PLIST"), SubLObjectFactory.makeSymbol("HL-MOD-SENSE"), SubLObjectFactory.makeSymbol("HL-MOD-PREDICATE"), SubLObjectFactory.makeSymbol("HL-MOD-ANY-PREDICATES"), SubLObjectFactory.makeSymbol("HL-MOD-ARITY"), SubLObjectFactory.makeSymbol("HL-MOD-DIRECTION"), SubLObjectFactory.makeSymbol("HL-MOD-REQUIRED-PATTERN"), SubLObjectFactory.makeSymbol("HL-MOD-REQUIRED-MT"), SubLObjectFactory.makeSymbol("HL-MOD-EXCLUSIVE-FUNC"), SubLObjectFactory.makeSymbol("HL-MOD-REQUIRED-FUNC"), SubLObjectFactory.makeSymbol("HL-MOD-COMPLETENESS") });
        $list26 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-HL-MOD-NAME"), SubLObjectFactory.makeSymbol("_CSETF-HL-MOD-PLIST"), SubLObjectFactory.makeSymbol("_CSETF-HL-MOD-SENSE"), SubLObjectFactory.makeSymbol("_CSETF-HL-MOD-PREDICATE"), SubLObjectFactory.makeSymbol("_CSETF-HL-MOD-ANY-PREDICATES"), SubLObjectFactory.makeSymbol("_CSETF-HL-MOD-ARITY"), SubLObjectFactory.makeSymbol("_CSETF-HL-MOD-DIRECTION"), SubLObjectFactory.makeSymbol("_CSETF-HL-MOD-REQUIRED-PATTERN"), SubLObjectFactory.makeSymbol("_CSETF-HL-MOD-REQUIRED-MT"), SubLObjectFactory.makeSymbol("_CSETF-HL-MOD-EXCLUSIVE-FUNC"), SubLObjectFactory.makeSymbol("_CSETF-HL-MOD-REQUIRED-FUNC"), SubLObjectFactory.makeSymbol("_CSETF-HL-MOD-COMPLETENESS") });
        $sym27$PRINT_HL_MODULE = SubLObjectFactory.makeSymbol("PRINT-HL-MODULE");
        $sym28$HL_MODULE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("HL-MODULE-PRINT-FUNCTION-TRAMPOLINE");
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("HL-MODULE-P"));
        $sym30$HL_MOD_NAME = SubLObjectFactory.makeSymbol("HL-MOD-NAME");
        $sym31$_CSETF_HL_MOD_NAME = SubLObjectFactory.makeSymbol("_CSETF-HL-MOD-NAME");
        $sym32$HL_MOD_PLIST = SubLObjectFactory.makeSymbol("HL-MOD-PLIST");
        $sym33$_CSETF_HL_MOD_PLIST = SubLObjectFactory.makeSymbol("_CSETF-HL-MOD-PLIST");
        $sym34$HL_MOD_SENSE = SubLObjectFactory.makeSymbol("HL-MOD-SENSE");
        $sym35$_CSETF_HL_MOD_SENSE = SubLObjectFactory.makeSymbol("_CSETF-HL-MOD-SENSE");
        $sym36$HL_MOD_PREDICATE = SubLObjectFactory.makeSymbol("HL-MOD-PREDICATE");
        $sym37$_CSETF_HL_MOD_PREDICATE = SubLObjectFactory.makeSymbol("_CSETF-HL-MOD-PREDICATE");
        $sym38$HL_MOD_ANY_PREDICATES = SubLObjectFactory.makeSymbol("HL-MOD-ANY-PREDICATES");
        $sym39$_CSETF_HL_MOD_ANY_PREDICATES = SubLObjectFactory.makeSymbol("_CSETF-HL-MOD-ANY-PREDICATES");
        $sym40$HL_MOD_ARITY = SubLObjectFactory.makeSymbol("HL-MOD-ARITY");
        $sym41$_CSETF_HL_MOD_ARITY = SubLObjectFactory.makeSymbol("_CSETF-HL-MOD-ARITY");
        $sym42$HL_MOD_DIRECTION = SubLObjectFactory.makeSymbol("HL-MOD-DIRECTION");
        $sym43$_CSETF_HL_MOD_DIRECTION = SubLObjectFactory.makeSymbol("_CSETF-HL-MOD-DIRECTION");
        $sym44$HL_MOD_REQUIRED_PATTERN = SubLObjectFactory.makeSymbol("HL-MOD-REQUIRED-PATTERN");
        $sym45$_CSETF_HL_MOD_REQUIRED_PATTERN = SubLObjectFactory.makeSymbol("_CSETF-HL-MOD-REQUIRED-PATTERN");
        $sym46$HL_MOD_REQUIRED_MT = SubLObjectFactory.makeSymbol("HL-MOD-REQUIRED-MT");
        $sym47$_CSETF_HL_MOD_REQUIRED_MT = SubLObjectFactory.makeSymbol("_CSETF-HL-MOD-REQUIRED-MT");
        $sym48$HL_MOD_EXCLUSIVE_FUNC = SubLObjectFactory.makeSymbol("HL-MOD-EXCLUSIVE-FUNC");
        $sym49$_CSETF_HL_MOD_EXCLUSIVE_FUNC = SubLObjectFactory.makeSymbol("_CSETF-HL-MOD-EXCLUSIVE-FUNC");
        $sym50$HL_MOD_REQUIRED_FUNC = SubLObjectFactory.makeSymbol("HL-MOD-REQUIRED-FUNC");
        $sym51$_CSETF_HL_MOD_REQUIRED_FUNC = SubLObjectFactory.makeSymbol("_CSETF-HL-MOD-REQUIRED-FUNC");
        $sym52$HL_MOD_COMPLETENESS = SubLObjectFactory.makeSymbol("HL-MOD-COMPLETENESS");
        $sym53$_CSETF_HL_MOD_COMPLETENESS = SubLObjectFactory.makeSymbol("_CSETF-HL-MOD-COMPLETENESS");
        $kw54$NAME = SubLObjectFactory.makeKeyword("NAME");
        $kw55$PLIST = SubLObjectFactory.makeKeyword("PLIST");
        $kw56$SENSE = SubLObjectFactory.makeKeyword("SENSE");
        $kw57$PREDICATE = SubLObjectFactory.makeKeyword("PREDICATE");
        $kw58$ANY_PREDICATES = SubLObjectFactory.makeKeyword("ANY-PREDICATES");
        $kw59$ARITY = SubLObjectFactory.makeKeyword("ARITY");
        $kw60$DIRECTION = SubLObjectFactory.makeKeyword("DIRECTION");
        $kw61$REQUIRED_PATTERN = SubLObjectFactory.makeKeyword("REQUIRED-PATTERN");
        $kw62$REQUIRED_MT = SubLObjectFactory.makeKeyword("REQUIRED-MT");
        $kw63$EXCLUSIVE_FUNC = SubLObjectFactory.makeKeyword("EXCLUSIVE-FUNC");
        $kw64$REQUIRED_FUNC = SubLObjectFactory.makeKeyword("REQUIRED-FUNC");
        $kw65$COMPLETENESS = SubLObjectFactory.makeKeyword("COMPLETENESS");
        $str66$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw67$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym68$MAKE_HL_MODULE = SubLObjectFactory.makeSymbol("MAKE-HL-MODULE");
        $kw69$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw70$END = SubLObjectFactory.makeKeyword("END");
        $sym71$VISIT_DEFSTRUCT_OBJECT_HL_MODULE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-HL-MODULE-METHOD");
        $str72$_HL_Module___a_ = SubLObjectFactory.makeString("[HL Module: ~a]");
        $sym73$SXHASH_HL_MODULE_METHOD = SubLObjectFactory.makeSymbol("SXHASH-HL-MODULE-METHOD");
        $sym74$PROPERTY_LIST_P = SubLObjectFactory.makeSymbol("PROPERTY-LIST-P");
        $sym75$HL_MODULE_PROPERTY_P = SubLObjectFactory.makeSymbol("HL-MODULE-PROPERTY-P");
        $kw76$EXCLUSIVE = SubLObjectFactory.makeKeyword("EXCLUSIVE");
        $kw77$SUPPLANTS = SubLObjectFactory.makeKeyword("SUPPLANTS");
        $str78$_supplants_is_meaningless_without = SubLObjectFactory.makeString(":supplants is meaningless without :exclusive being specified.  ~s contains a :supplants specification without an :exclusive.");
        $sym79$CFASL_CREATE_INVALID_HL_MODULE = SubLObjectFactory.makeSymbol("CFASL-CREATE-INVALID-HL-MODULE");
        $list80 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MODULE-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("INVALID"));
        $sym81$_CFASL_CREATE_INVALID_HL_MODULE_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CFASL-CREATE-INVALID-HL-MODULE-CACHING-STATE*");
        $kw82$FREE = SubLObjectFactory.makeKeyword("FREE");
        $kw83$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $sym84$_HL_MODULE_STORE_ = SubLObjectFactory.makeSymbol("*HL-MODULE-STORE*");
        $int85$212 = SubLObjectFactory.makeInteger(212);
        $list86 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-MODULE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list87 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw88$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw89$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym90$NAME_VAR = SubLObjectFactory.makeUninternedSymbol("NAME-VAR");
        $sym91$DO_HASH_TABLE = SubLObjectFactory.makeSymbol("DO-HASH-TABLE");
        $list92 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-MODULE-STORE"));
        $sym93$IGNORE = SubLObjectFactory.makeSymbol("IGNORE");
        $sym94$HL_MODULE_STORE = SubLObjectFactory.makeSymbol("HL-MODULE-STORE");
        $sym95$DO_HL_MODULES = SubLObjectFactory.makeSymbol("DO-HL-MODULES");
        $kw96$ABDUCTION = SubLObjectFactory.makeKeyword("ABDUCTION");
        $kw97$UNIVERSAL = SubLObjectFactory.makeKeyword("UNIVERSAL");
        $kw98$MODULE_SOURCE = SubLObjectFactory.makeKeyword("MODULE-SOURCE");
        $kw99$ANYTHING = SubLObjectFactory.makeKeyword("ANYTHING");
        $kw100$REQUIRED = SubLObjectFactory.makeKeyword("REQUIRED");
        $kw101$COST_PATTERN = SubLObjectFactory.makeKeyword("COST-PATTERN");
        $kw102$COST_EXPRESSION = SubLObjectFactory.makeKeyword("COST-EXPRESSION");
        $kw103$COST = SubLObjectFactory.makeKeyword("COST");
        $kw104$CHECK = SubLObjectFactory.makeKeyword("CHECK");
        $kw105$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $kw106$NOT_FULLY_BOUND = SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND");
        $str107$check = SubLObjectFactory.makeString("check");
        $kw108$RULE_SELECT = SubLObjectFactory.makeKeyword("RULE-SELECT");
        $kw109$RULE_FILTER = SubLObjectFactory.makeKeyword("RULE-FILTER");
        $kw110$EXPAND = SubLObjectFactory.makeKeyword("EXPAND");
        $kw111$REMOVAL = SubLObjectFactory.makeKeyword("REMOVAL");
        $sym112$INFERENCE_REMOVE_CHECK_DEFAULT = SubLObjectFactory.makeSymbol("INFERENCE-REMOVE-CHECK-DEFAULT");
        $sym113$INFERENCE_REMOVE_UNIFY_DEFAULT = SubLObjectFactory.makeSymbol("INFERENCE-REMOVE-UNIFY-DEFAULT");
        $sym114$DEFAULT_EXPAND_FUNC = SubLObjectFactory.makeSymbol("DEFAULT-EXPAND-FUNC");
        $kw115$EXPAND_PATTERN = SubLObjectFactory.makeKeyword("EXPAND-PATTERN");
        $kw116$EXPAND_ITERATIVE_PATTERN = SubLObjectFactory.makeKeyword("EXPAND-ITERATIVE-PATTERN");
        $sym117$PATTERN_MATCHES_FORMULA = SubLObjectFactory.makeSymbol("PATTERN-MATCHES-FORMULA");
        $kw118$FORWARD = SubLObjectFactory.makeKeyword("FORWARD");
        $kw119$INPUT_EXTRACT_PATTERN = SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN");
        $kw120$INPUT_VERIFY_PATTERN = SubLObjectFactory.makeKeyword("INPUT-VERIFY-PATTERN");
        $kw121$INPUT_ENCODE_PATTERN = SubLObjectFactory.makeKeyword("INPUT-ENCODE-PATTERN");
        $kw122$OUTPUT_CHECK_PATTERN = SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN");
        $kw123$OUTPUT_GENERATE_PATTERN = SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN");
        $kw124$OUTPUT_DECODE_PATTERN = SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN");
        $kw125$OUTPUT_VERIFY_PATTERN = SubLObjectFactory.makeKeyword("OUTPUT-VERIFY-PATTERN");
        $kw126$OUTPUT_CONSTRUCT_PATTERN = SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN");
        $kw127$SUPPORT_PATTERN = SubLObjectFactory.makeKeyword("SUPPORT-PATTERN");
        $kw128$SUPPORT = SubLObjectFactory.makeKeyword("SUPPORT");
        $kw129$SUPPORT_MODULE = SubLObjectFactory.makeKeyword("SUPPORT-MODULE");
        $kw130$SUPPORT_MT = SubLObjectFactory.makeKeyword("SUPPORT-MT");
        $kw131$SUPPORT_STRENGTH = SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH");
        $kw132$EVERY_PREDICATES = SubLObjectFactory.makeKeyword("EVERY-PREDICATES");
        $kw133$APPLICABILITY = SubLObjectFactory.makeKeyword("APPLICABILITY");
        $kw134$APPLICABILITY_PATTERN = SubLObjectFactory.makeKeyword("APPLICABILITY-PATTERN");
        $kw135$DOCUMENTATION = SubLObjectFactory.makeKeyword("DOCUMENTATION");
        $kw136$EXAMPLE = SubLObjectFactory.makeKeyword("EXAMPLE");
        $kw137$COMPLETE = SubLObjectFactory.makeKeyword("COMPLETE");
        $kw138$INCOMPLETE = SubLObjectFactory.makeKeyword("INCOMPLETE");
        $kw139$COMPLETE_PATTERN = SubLObjectFactory.makeKeyword("COMPLETE-PATTERN");
        $kw140$COMPLETENESS_PATTERN = SubLObjectFactory.makeKeyword("COMPLETENESS-PATTERN");
        $kw141$EXTERNAL = SubLObjectFactory.makeKeyword("EXTERNAL");
        $sym142$FUNCTION_SYMBOL_P = SubLObjectFactory.makeSymbol("FUNCTION-SYMBOL-P");
        $list143 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUE"), (SubLObject)SubLObjectFactory.makeSymbol("FALSE"));
        $sym144$STRING_LESSP = SubLObjectFactory.makeSymbol("STRING-LESSP");
        $sym145$SYMBOL_NAME = SubLObjectFactory.makeSymbol("SYMBOL-NAME");
        $sym146$_REMOVAL_MODULES_ = SubLObjectFactory.makeSymbol("*REMOVAL-MODULES*");
        $list147 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym148$DO_SET = SubLObjectFactory.makeSymbol("DO-SET");
        $list149 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-MODULES"));
        $sym150$REMOVAL_MODULES = SubLObjectFactory.makeSymbol("REMOVAL-MODULES");
        $sym151$DO_REMOVAL_MODULES = SubLObjectFactory.makeSymbol("DO-REMOVAL-MODULES");
        $sym152$_REMOVAL_MODULES_EXTERNAL_ = SubLObjectFactory.makeSymbol("*REMOVAL-MODULES-EXTERNAL*");
        $sym153$_REMOVAL_MODULES_GENERIC_ = SubLObjectFactory.makeSymbol("*REMOVAL-MODULES-GENERIC*");
        $sym154$HL_MODULE_SENSE = SubLObjectFactory.makeSymbol("HL-MODULE-SENSE");
        $sym155$_REMOVAL_MODULES_UNIVERSAL_ = SubLObjectFactory.makeSymbol("*REMOVAL-MODULES-UNIVERSAL*");
        $sym156$_REMOVAL_MODULES_SPECIFIC_ = SubLObjectFactory.makeSymbol("*REMOVAL-MODULES-SPECIFIC*");
        $int157$32 = SubLObjectFactory.makeInteger(32);
        $sym158$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym159$_REMOVAL_MODULES_SPECIFIC_USE_GENERIC_ = SubLObjectFactory.makeSymbol("*REMOVAL-MODULES-SPECIFIC-USE-GENERIC*");
        $sym160$_REMOVAL_MODULES_SPECIFIC_USE_META_REMOVAL_ = SubLObjectFactory.makeSymbol("*REMOVAL-MODULES-SPECIFIC-USE-META-REMOVAL*");
        $sym161$_REMOVAL_MODULES_SPECIFIC_DONT_USE_UNIVERSAL_ = SubLObjectFactory.makeSymbol("*REMOVAL-MODULES-SPECIFIC-DONT-USE-UNIVERSAL*");
        $sym162$_SOLELY_SPECIFIC_REMOVAL_MODULE_PREDICATE_STORE_ = SubLObjectFactory.makeSymbol("*SOLELY-SPECIFIC-REMOVAL-MODULE-PREDICATE-STORE*");
        $int163$50 = SubLObjectFactory.makeInteger(50);
        $kw164$POS = SubLObjectFactory.makeKeyword("POS");
        $kw165$NEG = SubLObjectFactory.makeKeyword("NEG");
        $str166$removal_module__S_must_have_a__SE = SubLObjectFactory.makeString("removal module ~S must have a :SENSE of :POS or :NEG");
        $sym167$CAR = SubLObjectFactory.makeSymbol("CAR");
        $list168 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("HL-MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATES"));
        $sym169$INFERENCE_REMOVAL_MODULE__FOR_CLASSIFICATION = SubLObjectFactory.makeSymbol("INFERENCE-REMOVAL-MODULE<-FOR-CLASSIFICATION");
        $sym170$REMOVAL_MODULE_SPECIFIC_USE_GENERIC_ = SubLObjectFactory.makeSymbol("REMOVAL-MODULE-SPECIFIC-USE-GENERIC?");
        $list171 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COST-EXPRESSION"), (SubLObject)inference_modules.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("COMPLETENESS"), (SubLObject)SubLObjectFactory.makeKeyword("COMPLETE"), (SubLObject)SubLObjectFactory.makeKeyword("EXCLUSIVE"), (SubLObject)SubLObjectFactory.makeSymbol("TRUE"));
        $kw172$PRUNING = SubLObjectFactory.makeKeyword("PRUNING");
        $sym173$_CONJUNCTIVE_REMOVAL_MODULES_ = SubLObjectFactory.makeSymbol("*CONJUNCTIVE-REMOVAL-MODULES*");
        $list174 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list175 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-MODULES-CONJUNCTIVE"));
        $sym176$REMOVAL_MODULES_CONJUNCTIVE = SubLObjectFactory.makeSymbol("REMOVAL-MODULES-CONJUNCTIVE");
        $sym177$DO_CONJUNCTIVE_REMOVAL_MODULES = SubLObjectFactory.makeSymbol("DO-CONJUNCTIVE-REMOVAL-MODULES");
        $kw178$REMOVAL_CONJUNCTIVE = SubLObjectFactory.makeKeyword("REMOVAL-CONJUNCTIVE");
        $list179 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("META-REMOVAL-MODULES"));
        $sym180$META_REMOVAL_MODULES = SubLObjectFactory.makeSymbol("META-REMOVAL-MODULES");
        $sym181$DO_META_REMOVAL_MODULES = SubLObjectFactory.makeSymbol("DO-META-REMOVAL-MODULES");
        $kw182$META_REMOVAL = SubLObjectFactory.makeKeyword("META-REMOVAL");
        $sym183$_TRANSFORMATION_MODULES_ = SubLObjectFactory.makeSymbol("*TRANSFORMATION-MODULES*");
        $list184 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRANSFORMATION-MODULES"));
        $sym185$TRANSFORMATION_MODULES = SubLObjectFactory.makeSymbol("TRANSFORMATION-MODULES");
        $sym186$DO_TRANSFORMATION_MODULES = SubLObjectFactory.makeSymbol("DO-TRANSFORMATION-MODULES");
        $kw187$TRANSFORMATION = SubLObjectFactory.makeKeyword("TRANSFORMATION");
        $sym188$_META_TRANSFORMATION_MODULES_ = SubLObjectFactory.makeSymbol("*META-TRANSFORMATION-MODULES*");
        $list189 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("META-TRANSFORMATION-MODULES"));
        $sym190$META_TRANSFORMATION_MODULES = SubLObjectFactory.makeSymbol("META-TRANSFORMATION-MODULES");
        $sym191$DO_META_TRANSFORMATION_MODULES = SubLObjectFactory.makeSymbol("DO-META-TRANSFORMATION-MODULES");
        $kw192$META_TRANSFORMATION = SubLObjectFactory.makeKeyword("META-TRANSFORMATION");
        $sym193$_REWRITE_MODULES_ = SubLObjectFactory.makeSymbol("*REWRITE-MODULES*");
        $list194 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REWRITE-MODULES"));
        $kw195$REWRITE_SUPPORT = SubLObjectFactory.makeKeyword("REWRITE-SUPPORT");
        $kw196$REWRITE_CLOSURE = SubLObjectFactory.makeKeyword("REWRITE-CLOSURE");
        $kw197$REWRITE = SubLObjectFactory.makeKeyword("REWRITE");
        $str198$rewrite_module__S_must_have_a__SE = SubLObjectFactory.makeString("rewrite module ~S must have a :SENSE of :POS or :NEG");
        $sym199$_STRUCTURAL_MODULES_ = SubLObjectFactory.makeSymbol("*STRUCTURAL-MODULES*");
        $kw200$STRUCTURAL = SubLObjectFactory.makeKeyword("STRUCTURAL");
        $sym201$_META_STRUCTURAL_MODULES_ = SubLObjectFactory.makeSymbol("*META-STRUCTURAL-MODULES*");
        $list202 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("META-STRUCTURAL-MODULES"));
        $sym203$META_STRUCTURAL_MODULES = SubLObjectFactory.makeSymbol("META-STRUCTURAL-MODULES");
        $sym204$DO_META_STRUCTURAL_MODULES = SubLObjectFactory.makeSymbol("DO-META-STRUCTURAL-MODULES");
        $kw205$META_STRUCTURAL = SubLObjectFactory.makeKeyword("META-STRUCTURAL");
        $int206$256 = SubLObjectFactory.makeInteger(256);
        $sym207$CFASL_INPUT_HL_MODULE = SubLObjectFactory.makeSymbol("CFASL-INPUT-HL-MODULE");
        $sym208$CFASL_OUTPUT_OBJECT_HL_MODULE_METHOD = SubLObjectFactory.makeSymbol("CFASL-OUTPUT-OBJECT-HL-MODULE-METHOD");
    }
    
    public static final class $allowed_modules_spec_p$UnaryFunction extends UnaryFunction
    {
        public $allowed_modules_spec_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("ALLOWED-MODULES-SPEC-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return inference_modules.allowed_modules_spec_p(arg1);
        }
    }
    
    public static final class $hl_module_native extends SubLStructNative
    {
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
        private static final SubLStructDeclNative structDecl;
        
        public $hl_module_native() {
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$plist = (SubLObject)CommonSymbols.NIL;
            this.$sense = (SubLObject)CommonSymbols.NIL;
            this.$predicate = (SubLObject)CommonSymbols.NIL;
            this.$any_predicates = (SubLObject)CommonSymbols.NIL;
            this.$arity = (SubLObject)CommonSymbols.NIL;
            this.$direction = (SubLObject)CommonSymbols.NIL;
            this.$required_pattern = (SubLObject)CommonSymbols.NIL;
            this.$required_mt = (SubLObject)CommonSymbols.NIL;
            this.$exclusive_func = (SubLObject)CommonSymbols.NIL;
            this.$required_func = (SubLObject)CommonSymbols.NIL;
            this.$completeness = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$hl_module_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$name;
        }
        
        public SubLObject getField3() {
            return this.$plist;
        }
        
        public SubLObject getField4() {
            return this.$sense;
        }
        
        public SubLObject getField5() {
            return this.$predicate;
        }
        
        public SubLObject getField6() {
            return this.$any_predicates;
        }
        
        public SubLObject getField7() {
            return this.$arity;
        }
        
        public SubLObject getField8() {
            return this.$direction;
        }
        
        public SubLObject getField9() {
            return this.$required_pattern;
        }
        
        public SubLObject getField10() {
            return this.$required_mt;
        }
        
        public SubLObject getField11() {
            return this.$exclusive_func;
        }
        
        public SubLObject getField12() {
            return this.$required_func;
        }
        
        public SubLObject getField13() {
            return this.$completeness;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$plist = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$sense = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$predicate = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$any_predicates = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$arity = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$direction = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$required_pattern = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$required_mt = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$exclusive_func = value;
        }
        
        public SubLObject setField12(final SubLObject value) {
            return this.$required_func = value;
        }
        
        public SubLObject setField13(final SubLObject value) {
            return this.$completeness = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$hl_module_native.class, inference_modules.$sym22$HL_MODULE, inference_modules.$sym21$HL_MODULE_P, inference_modules.$list23, inference_modules.$list24, new String[] { "$name", "$plist", "$sense", "$predicate", "$any_predicates", "$arity", "$direction", "$required_pattern", "$required_mt", "$exclusive_func", "$required_func", "$completeness" }, inference_modules.$list25, inference_modules.$list26, inference_modules.$sym27$PRINT_HL_MODULE);
        }
    }
    
    public static final class $hl_module_p$UnaryFunction extends UnaryFunction
    {
        public $hl_module_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("HL-MODULE-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return inference_modules.hl_module_p(arg1);
        }
    }
    
    public static final class $sxhash_hl_module_method$UnaryFunction extends UnaryFunction
    {
        public $sxhash_hl_module_method$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SXHASH-HL-MODULE-METHOD"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return inference_modules.sxhash_hl_module_method(arg1);
        }
    }
    
    public static final class $hl_module_sense$UnaryFunction extends UnaryFunction
    {
        public $hl_module_sense$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("HL-MODULE-SENSE"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return inference_modules.hl_module_sense(arg1);
        }
    }
}

/*

	Total time: 790 ms
	
*/