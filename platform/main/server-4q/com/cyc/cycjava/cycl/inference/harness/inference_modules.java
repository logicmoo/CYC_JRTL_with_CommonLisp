/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.cfasl.*;
import static com.cyc.cycjava.cycl.cycl_utilities.*;
import static com.cyc.cycjava.cycl.dictionary.*;
import static com.cyc.cycjava.cycl.dictionary_utilities.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.enumeration_types.*;
import static com.cyc.cycjava.cycl.eval_in_api.*;
import static com.cyc.cycjava.cycl.formula_pattern_match.*;
import static com.cyc.cycjava.cycl.forts.*;
import static com.cyc.cycjava.cycl.hash_table_utilities.*;
import static com.cyc.cycjava.cycl.hlmt.*;
import static com.cyc.cycjava.cycl.kb_control_vars.*;
import static com.cyc.cycjava.cycl.list_utilities.*;
import static com.cyc.cycjava.cycl.mt_relevance_macros.*;
import static com.cyc.cycjava.cycl.set.*;
import static com.cyc.cycjava.cycl.set_contents.*;
import static com.cyc.cycjava.cycl.string_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.subl_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import org.armedbear.lisp.Lisp;
import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      INFERENCE-MODULES
 * source file: /cyc/top/cycl/inference/harness/inference-modules.lisp
 * created:     2019/07/03 17:37:37
 */
public final class inference_modules extends SubLTranslatedFile implements V12 {
    public static final class $hl_module_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.inference.harness.inference_modules.$hl_module_native.this.$name;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.inference.harness.inference_modules.$hl_module_native.this.$plist;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.inference.harness.inference_modules.$hl_module_native.this.$sense;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.inference.harness.inference_modules.$hl_module_native.this.$predicate;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.inference.harness.inference_modules.$hl_module_native.this.$any_predicates;
        }

        public SubLObject getField7() {
            return com.cyc.cycjava.cycl.inference.harness.inference_modules.$hl_module_native.this.$arity;
        }

        public SubLObject getField8() {
            return com.cyc.cycjava.cycl.inference.harness.inference_modules.$hl_module_native.this.$direction;
        }

        public SubLObject getField9() {
            return com.cyc.cycjava.cycl.inference.harness.inference_modules.$hl_module_native.this.$required_pattern;
        }

        public SubLObject getField10() {
            return com.cyc.cycjava.cycl.inference.harness.inference_modules.$hl_module_native.this.$required_mt;
        }

        public SubLObject getField11() {
            return com.cyc.cycjava.cycl.inference.harness.inference_modules.$hl_module_native.this.$exclusive_func;
        }

        public SubLObject getField12() {
            return com.cyc.cycjava.cycl.inference.harness.inference_modules.$hl_module_native.this.$required_func;
        }

        public SubLObject getField13() {
            return com.cyc.cycjava.cycl.inference.harness.inference_modules.$hl_module_native.this.$completeness;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.inference.harness.inference_modules.$hl_module_native.this.$name = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.inference.harness.inference_modules.$hl_module_native.this.$plist = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.inference.harness.inference_modules.$hl_module_native.this.$sense = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.inference.harness.inference_modules.$hl_module_native.this.$predicate = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.inference.harness.inference_modules.$hl_module_native.this.$any_predicates = value;
        }

        public SubLObject setField7(SubLObject value) {
            return com.cyc.cycjava.cycl.inference.harness.inference_modules.$hl_module_native.this.$arity = value;
        }

        public SubLObject setField8(SubLObject value) {
            return com.cyc.cycjava.cycl.inference.harness.inference_modules.$hl_module_native.this.$direction = value;
        }

        public SubLObject setField9(SubLObject value) {
            return com.cyc.cycjava.cycl.inference.harness.inference_modules.$hl_module_native.this.$required_pattern = value;
        }

        public SubLObject setField10(SubLObject value) {
            return com.cyc.cycjava.cycl.inference.harness.inference_modules.$hl_module_native.this.$required_mt = value;
        }

        public SubLObject setField11(SubLObject value) {
            return com.cyc.cycjava.cycl.inference.harness.inference_modules.$hl_module_native.this.$exclusive_func = value;
        }

        public SubLObject setField12(SubLObject value) {
            return com.cyc.cycjava.cycl.inference.harness.inference_modules.$hl_module_native.this.$required_func = value;
        }

        public SubLObject setField13(SubLObject value) {
            return com.cyc.cycjava.cycl.inference.harness.inference_modules.$hl_module_native.this.$completeness = value;
        }

        public SubLObject $name = Lisp.NIL;

        public SubLObject $plist = Lisp.NIL;

        public SubLObject $sense = Lisp.NIL;

        public SubLObject $predicate = Lisp.NIL;

        public SubLObject $any_predicates = Lisp.NIL;

        public SubLObject $arity = Lisp.NIL;

        public SubLObject $direction = Lisp.NIL;

        public SubLObject $required_pattern = Lisp.NIL;

        public SubLObject $required_mt = Lisp.NIL;

        public SubLObject $exclusive_func = Lisp.NIL;

        public SubLObject $required_func = Lisp.NIL;

        public SubLObject $completeness = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.inference.harness.inference_modules.$hl_module_native.class, HL_MODULE, HL_MODULE_P, $list_alt23, $list_alt24, new String[]{ "$name", "$plist", "$sense", "$predicate", "$any_predicates", "$arity", "$direction", "$required_pattern", "$required_mt", "$exclusive_func", "$required_func", "$completeness" }, $list_alt25, $list_alt26, PRINT_HL_MODULE);
    }

    public static final SubLFile me = new inference_modules();

 public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_modules";


    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $hl_module_properties$ = makeSymbol("*HL-MODULE-PROPERTIES*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $valid_hl_module_subtypes$ = makeSymbol("*VALID-HL-MODULE-SUBTYPES*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $default_hl_module_subtype$ = makeSymbol("*DEFAULT-HL-MODULE-SUBTYPE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $hl_module_property_defaults$ = makeSymbol("*HL-MODULE-PROPERTY-DEFAULTS*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_hl_module$ = makeSymbol("*DTP-HL-MODULE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $classify_removal_modules_with_deterministic_sortP$ = makeSymbol("*CLASSIFY-REMOVAL-MODULES-WITH-DETERMINISTIC-SORT?*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $removal_pruning_module_properties$ = makeSymbol("*REMOVAL-PRUNING-MODULE-PROPERTIES*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $cfasl_wide_opcode_hl_module$ = makeSymbol("*CFASL-WIDE-OPCODE-HL-MODULE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $meta_removal_modules$ = makeSymbol("*META-REMOVAL-MODULES*");

    static private final SubLList $list1 = list(new SubLObject[]{ makeKeyword("MODULE-TYPE"), makeKeyword("MODULE-SUBTYPE"), makeKeyword("MODULE-SOURCE"), makeKeyword("CHECK"), makeKeyword("EXTERNAL"), makeKeyword("UNIVERSAL"), makeKeyword("SENSE"), makeKeyword("DIRECTION"), makeKeyword("PREDICATE"), makeKeyword("EVERY-PREDICATES"), makeKeyword("ANY-PREDICATES"), makeKeyword("REQUIRED-PATTERN"), makeKeyword("REQUIRED-MT"), makeKeyword("ARITY"), makeKeyword("EXCLUSIVE"), makeKeyword("SUPPLANTS"), makeKeyword("REQUIRED"), makeKeyword("APPLICABILITY-PATTERN"), makeKeyword("APPLICABILITY"), makeKeyword("COST-PATTERN"), makeKeyword("COST-EXPRESSION"), $COST, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE-PATTERN"), makeKeyword("COMPLETENESS-PATTERN"), makeKeyword("INPUT-EXTRACT-PATTERN"), makeKeyword("INPUT-VERIFY-PATTERN"), makeKeyword("INPUT-ENCODE-PATTERN"), makeKeyword("OUTPUT-CHECK-PATTERN"), makeKeyword("OUTPUT-GENERATE-PATTERN"), makeKeyword("OUTPUT-DECODE-PATTERN"), makeKeyword("OUTPUT-VERIFY-PATTERN"), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), makeKeyword("RULE-SELECT"), makeKeyword("RULE-FILTER"), makeKeyword("EXPAND-ITERATIVE-PATTERN"), makeKeyword("EXPAND-PATTERN"), makeKeyword("EXPAND"), makeKeyword("REWRITE-CLOSURE"), makeKeyword("SUPPORT-PATTERN"), makeKeyword("SUPPORT"), makeKeyword("SUPPORT-MODULE"), makeKeyword("SUPPORT-MT"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("REWRITE-SUPPORT"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("INCOMPLETENESS"), makeKeyword("ADD"), makeKeyword("REMOVE"), makeKeyword("REMOVE-ALL"), makeKeyword("PREFERRED-OVER"), makeKeyword("DOCUMENTATION"), makeKeyword("EXAMPLE"), makeKeyword("PRETTY-NAME") });

    static private final SubLList $list2 = list(list(makeSymbol("PROPERTY-VAR"), makeSymbol("VALUE-VAR"), makeSymbol("HL-MODULE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym3$MODULE_VAR = makeUninternedSymbol("MODULE-VAR");

    static private final SubLList $list6 = list(list(makeSymbol("HL-MODULE-PROPERTIES")));

    static private final SubLSymbol $sym8$HL_MODULE_PROPERTY_NOT_DEFAULT_ = makeSymbol("HL-MODULE-PROPERTY-NOT-DEFAULT?");

    private static final SubLSymbol HL_MODULE_PROPERTY_WITHOUT_VALUES = makeSymbol("HL-MODULE-PROPERTY-WITHOUT-VALUES");

    static private final SubLList $list10 = list($SKSI, makeKeyword("KB"), makeKeyword("ABDUCTION"), makeKeyword("PRUNING"));

    static private final SubLList $list12 = list(makeKeyword("MODULE-TYPE"));

    static private final SubLList $list14 = list(new SubLObject[]{ list(makeKeyword("MODULE-SOURCE")), list(makeKeyword("UNIVERSAL")), list(makeKeyword("SENSE")), cons(makeKeyword("REQUIRED-PATTERN"), makeKeyword("ANYTHING")), list(makeKeyword("REQUIRED-MT")), list(makeKeyword("REQUIRED")), list(makeKeyword("COST-PATTERN")), list(makeKeyword("COST-EXPRESSION")), cons($COST, makeSymbol("DEFAULT-COST-FUNC")), list(makeKeyword("COMPLETENESS")), list(makeKeyword("COMPLETE-PATTERN")), list(makeKeyword("COMPLETENESS-PATTERN")), cons(makeKeyword("CHECK"), makeKeyword("UNKNOWN")), list(makeKeyword("RULE-SELECT")), cons(makeKeyword("EXPAND"), makeKeyword("DEFAULT")), list(makeKeyword("EXPAND-PATTERN")), list(makeKeyword("EXPAND-ITERATIVE-PATTERN")), list(makeKeyword("PREDICATE")), list(makeKeyword("ARITY")), list(makeKeyword("EXCLUSIVE")), cons(makeKeyword("SUPPLANTS"), makeKeyword("ALL")), cons(makeKeyword("DIRECTION"), makeKeyword("FORWARD")), cons(makeKeyword("INPUT-EXTRACT-PATTERN"), makeKeyword("INPUT")), cons(makeKeyword("INPUT-VERIFY-PATTERN"), makeKeyword("ANYTHING")), cons(makeKeyword("INPUT-ENCODE-PATTERN"), makeKeyword("INPUT")), list(makeKeyword("OUTPUT-CHECK-PATTERN")), list(makeKeyword("OUTPUT-GENERATE-PATTERN")), cons(makeKeyword("OUTPUT-DECODE-PATTERN"), makeKeyword("INPUT")), cons(makeKeyword("OUTPUT-VERIFY-PATTERN"), makeKeyword("ANYTHING")), cons(makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), makeKeyword("INPUT")), list(makeKeyword("SUPPORT-PATTERN")), list(makeKeyword("SUPPORT")), cons(makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE")), list(makeKeyword("SUPPORT-MT")), cons(makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT")), list(makeKeyword("EVERY-PREDICATES")), cons(makeKeyword("APPLICABILITY"), makeSymbol("FALSE")), list(makeKeyword("APPLICABILITY-PATTERN")), list(makeKeyword("ANY-PREDICATES")), cons(makeKeyword("DOCUMENTATION"), makeString("")), cons(makeKeyword("EXAMPLE"), makeString("")), list(makeKeyword("EXTERNAL")), list(makeKeyword("REWRITE-SUPPORT")), list(makeKeyword("REWRITE-CLOSURE")) });

    private static final SubLSymbol ALLOWED_MODULES_SPEC_P = makeSymbol("ALLOWED-MODULES-SPEC-P");

    static private final SubLList $list23 = list(new SubLObject[]{ makeSymbol("NAME"), makeSymbol("PLIST"), makeSymbol("SENSE"), makeSymbol("PREDICATE"), makeSymbol("ANY-PREDICATES"), makeSymbol("ARITY"), makeSymbol("DIRECTION"), makeSymbol("REQUIRED-PATTERN"), makeSymbol("REQUIRED-MT"), makeSymbol("EXCLUSIVE-FUNC"), makeSymbol("REQUIRED-FUNC"), makeSymbol("COMPLETENESS") });

    static private final SubLList $list24 = list(new SubLObject[]{ $NAME, makeKeyword("PLIST"), makeKeyword("SENSE"), makeKeyword("PREDICATE"), makeKeyword("ANY-PREDICATES"), makeKeyword("ARITY"), makeKeyword("DIRECTION"), makeKeyword("REQUIRED-PATTERN"), makeKeyword("REQUIRED-MT"), makeKeyword("EXCLUSIVE-FUNC"), makeKeyword("REQUIRED-FUNC"), makeKeyword("COMPLETENESS") });

    static private final SubLList $list25 = list(new SubLObject[]{ makeSymbol("HL-MOD-NAME"), makeSymbol("HL-MOD-PLIST"), makeSymbol("HL-MOD-SENSE"), makeSymbol("HL-MOD-PREDICATE"), makeSymbol("HL-MOD-ANY-PREDICATES"), makeSymbol("HL-MOD-ARITY"), makeSymbol("HL-MOD-DIRECTION"), makeSymbol("HL-MOD-REQUIRED-PATTERN"), makeSymbol("HL-MOD-REQUIRED-MT"), makeSymbol("HL-MOD-EXCLUSIVE-FUNC"), makeSymbol("HL-MOD-REQUIRED-FUNC"), makeSymbol("HL-MOD-COMPLETENESS") });

    static private final SubLList $list26 = list(new SubLObject[]{ makeSymbol("_CSETF-HL-MOD-NAME"), makeSymbol("_CSETF-HL-MOD-PLIST"), makeSymbol("_CSETF-HL-MOD-SENSE"), makeSymbol("_CSETF-HL-MOD-PREDICATE"), makeSymbol("_CSETF-HL-MOD-ANY-PREDICATES"), makeSymbol("_CSETF-HL-MOD-ARITY"), makeSymbol("_CSETF-HL-MOD-DIRECTION"), makeSymbol("_CSETF-HL-MOD-REQUIRED-PATTERN"), makeSymbol("_CSETF-HL-MOD-REQUIRED-MT"), makeSymbol("_CSETF-HL-MOD-EXCLUSIVE-FUNC"), makeSymbol("_CSETF-HL-MOD-REQUIRED-FUNC"), makeSymbol("_CSETF-HL-MOD-COMPLETENESS") });

    private static final SubLSymbol PRINT_HL_MODULE = makeSymbol("PRINT-HL-MODULE");

    private static final SubLSymbol HL_MODULE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("HL-MODULE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list29 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("HL-MODULE-P"));

    private static final SubLSymbol HL_MOD_NAME = makeSymbol("HL-MOD-NAME");

    private static final SubLSymbol _CSETF_HL_MOD_NAME = makeSymbol("_CSETF-HL-MOD-NAME");

    private static final SubLSymbol HL_MOD_PLIST = makeSymbol("HL-MOD-PLIST");

    private static final SubLSymbol _CSETF_HL_MOD_PLIST = makeSymbol("_CSETF-HL-MOD-PLIST");

    private static final SubLSymbol HL_MOD_SENSE = makeSymbol("HL-MOD-SENSE");

    private static final SubLSymbol _CSETF_HL_MOD_SENSE = makeSymbol("_CSETF-HL-MOD-SENSE");

    private static final SubLSymbol HL_MOD_PREDICATE = makeSymbol("HL-MOD-PREDICATE");

    private static final SubLSymbol _CSETF_HL_MOD_PREDICATE = makeSymbol("_CSETF-HL-MOD-PREDICATE");

    private static final SubLSymbol HL_MOD_ANY_PREDICATES = makeSymbol("HL-MOD-ANY-PREDICATES");

    private static final SubLSymbol _CSETF_HL_MOD_ANY_PREDICATES = makeSymbol("_CSETF-HL-MOD-ANY-PREDICATES");

    private static final SubLSymbol HL_MOD_ARITY = makeSymbol("HL-MOD-ARITY");

    private static final SubLSymbol _CSETF_HL_MOD_ARITY = makeSymbol("_CSETF-HL-MOD-ARITY");

    private static final SubLSymbol HL_MOD_DIRECTION = makeSymbol("HL-MOD-DIRECTION");

    private static final SubLSymbol _CSETF_HL_MOD_DIRECTION = makeSymbol("_CSETF-HL-MOD-DIRECTION");

    private static final SubLSymbol HL_MOD_REQUIRED_PATTERN = makeSymbol("HL-MOD-REQUIRED-PATTERN");

    private static final SubLSymbol _CSETF_HL_MOD_REQUIRED_PATTERN = makeSymbol("_CSETF-HL-MOD-REQUIRED-PATTERN");

    private static final SubLSymbol HL_MOD_REQUIRED_MT = makeSymbol("HL-MOD-REQUIRED-MT");

    private static final SubLSymbol _CSETF_HL_MOD_REQUIRED_MT = makeSymbol("_CSETF-HL-MOD-REQUIRED-MT");

    private static final SubLSymbol HL_MOD_EXCLUSIVE_FUNC = makeSymbol("HL-MOD-EXCLUSIVE-FUNC");

    private static final SubLSymbol _CSETF_HL_MOD_EXCLUSIVE_FUNC = makeSymbol("_CSETF-HL-MOD-EXCLUSIVE-FUNC");

    private static final SubLSymbol HL_MOD_REQUIRED_FUNC = makeSymbol("HL-MOD-REQUIRED-FUNC");

    private static final SubLSymbol _CSETF_HL_MOD_REQUIRED_FUNC = makeSymbol("_CSETF-HL-MOD-REQUIRED-FUNC");

    private static final SubLSymbol HL_MOD_COMPLETENESS = makeSymbol("HL-MOD-COMPLETENESS");

    private static final SubLSymbol _CSETF_HL_MOD_COMPLETENESS = makeSymbol("_CSETF-HL-MOD-COMPLETENESS");

    private static final SubLString $str66$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_HL_MODULE = makeSymbol("MAKE-HL-MODULE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_HL_MODULE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-HL-MODULE-METHOD");

    private static final SubLString $str72$_HL_Module___a_ = makeString("[HL Module: ~a]");

    private static final SubLSymbol SXHASH_HL_MODULE_METHOD = makeSymbol("SXHASH-HL-MODULE-METHOD");

    private static final SubLSymbol HL_MODULE_PROPERTY_P = makeSymbol("HL-MODULE-PROPERTY-P");

    private static final SubLString $str78$_supplants_is_meaningless_without = makeString(":supplants is meaningless without :exclusive being specified.  ~s contains a :supplants specification without an :exclusive.");

    private static final SubLSymbol CFASL_CREATE_INVALID_HL_MODULE = makeSymbol("CFASL-CREATE-INVALID-HL-MODULE");

    private static final SubLList $list80 = list(makeKeyword("MODULE-TYPE"), makeKeyword("INVALID"));

    private static final SubLSymbol $cfasl_create_invalid_hl_module_caching_state$ = makeSymbol("*CFASL-CREATE-INVALID-HL-MODULE-CACHING-STATE*");

    private static final SubLSymbol $hl_module_store$ = makeSymbol("*HL-MODULE-STORE*");

    private static final SubLInteger $int$212 = makeInteger(212);

    private static final SubLList $list86 = list(list(makeSymbol("HL-MODULE-VAR"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list87 = list($DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $sym90$NAME_VAR = makeUninternedSymbol("NAME-VAR");

    private static final SubLList $list92 = list(makeSymbol("HL-MODULE-STORE"));

    private static final SubLSymbol HL_MODULE_STORE = makeSymbol("HL-MODULE-STORE");

    private static final SubLSymbol DO_HL_MODULES = makeSymbol("DO-HL-MODULES");

    private static final SubLSymbol $NOT_FULLY_BOUND = makeKeyword("NOT-FULLY-BOUND");

    private static final SubLString $$$check = makeString("check");

    private static final SubLSymbol INFERENCE_REMOVE_CHECK_DEFAULT = makeSymbol("INFERENCE-REMOVE-CHECK-DEFAULT");

    private static final SubLSymbol INFERENCE_REMOVE_UNIFY_DEFAULT = makeSymbol("INFERENCE-REMOVE-UNIFY-DEFAULT");

    private static final SubLSymbol DEFAULT_EXPAND_FUNC = makeSymbol("DEFAULT-EXPAND-FUNC");

    private static final SubLSymbol $EXPAND_ITERATIVE_PATTERN = makeKeyword("EXPAND-ITERATIVE-PATTERN");

    private static final SubLSymbol PATTERN_MATCHES_FORMULA = makeSymbol("PATTERN-MATCHES-FORMULA");

    private static final SubLSymbol $INPUT_EXTRACT_PATTERN = makeKeyword("INPUT-EXTRACT-PATTERN");

    private static final SubLSymbol $INPUT_VERIFY_PATTERN = makeKeyword("INPUT-VERIFY-PATTERN");

    private static final SubLSymbol $INPUT_ENCODE_PATTERN = makeKeyword("INPUT-ENCODE-PATTERN");

    private static final SubLSymbol $OUTPUT_CHECK_PATTERN = makeKeyword("OUTPUT-CHECK-PATTERN");

    private static final SubLSymbol $OUTPUT_GENERATE_PATTERN = makeKeyword("OUTPUT-GENERATE-PATTERN");

    private static final SubLSymbol $OUTPUT_DECODE_PATTERN = makeKeyword("OUTPUT-DECODE-PATTERN");

    private static final SubLSymbol $OUTPUT_VERIFY_PATTERN = makeKeyword("OUTPUT-VERIFY-PATTERN");

    private static final SubLSymbol $OUTPUT_CONSTRUCT_PATTERN = makeKeyword("OUTPUT-CONSTRUCT-PATTERN");

    private static final SubLSymbol FUNCTION_SYMBOL_P = makeSymbol("FUNCTION-SYMBOL-P");

    private static final SubLList $list143 = list(makeSymbol("TRUE"), makeSymbol("FALSE"));

    private static final SubLSymbol $removal_modules$ = makeSymbol("*REMOVAL-MODULES*");

    private static final SubLList $list147 = list(list(makeSymbol("HL-MODULE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list149 = list(makeSymbol("REMOVAL-MODULES"));

    private static final SubLSymbol REMOVAL_MODULES = makeSymbol("REMOVAL-MODULES");

    private static final SubLSymbol DO_REMOVAL_MODULES = makeSymbol("DO-REMOVAL-MODULES");

    private static final SubLSymbol $removal_modules_external$ = makeSymbol("*REMOVAL-MODULES-EXTERNAL*");

    private static final SubLSymbol $removal_modules_generic$ = makeSymbol("*REMOVAL-MODULES-GENERIC*");

    private static final SubLSymbol HL_MODULE_SENSE = makeSymbol("HL-MODULE-SENSE");

    private static final SubLSymbol $removal_modules_universal$ = makeSymbol("*REMOVAL-MODULES-UNIVERSAL*");

    private static final SubLSymbol $removal_modules_specific$ = makeSymbol("*REMOVAL-MODULES-SPECIFIC*");

    private static final SubLSymbol $removal_modules_specific_use_generic$ = makeSymbol("*REMOVAL-MODULES-SPECIFIC-USE-GENERIC*");

    private static final SubLSymbol $removal_modules_specific_use_meta_removal$ = makeSymbol("*REMOVAL-MODULES-SPECIFIC-USE-META-REMOVAL*");

    private static final SubLSymbol $removal_modules_specific_dont_use_universal$ = makeSymbol("*REMOVAL-MODULES-SPECIFIC-DONT-USE-UNIVERSAL*");

    private static final SubLSymbol $solely_specific_removal_module_predicate_store$ = makeSymbol("*SOLELY-SPECIFIC-REMOVAL-MODULE-PREDICATE-STORE*");

    private static final SubLInteger $int$50 = makeInteger(50);

    private static final SubLString $str166$removal_module__S_must_have_a__SE = makeString("removal module ~S must have a :SENSE of :POS or :NEG");

    private static final SubLList $list168 = cons(makeSymbol("HL-MODULE"), makeSymbol("PREDICATES"));

    private static final SubLSymbol $sym169$INFERENCE_REMOVAL_MODULE__FOR_CLASSIFICATION = makeSymbol("INFERENCE-REMOVAL-MODULE<-FOR-CLASSIFICATION");

    private static final SubLSymbol $sym170$REMOVAL_MODULE_SPECIFIC_USE_GENERIC_ = makeSymbol("REMOVAL-MODULE-SPECIFIC-USE-GENERIC?");

    private static final SubLList $list171 = list(makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"));

    private static final SubLSymbol $conjunctive_removal_modules$ = makeSymbol("*CONJUNCTIVE-REMOVAL-MODULES*");

    private static final SubLList $list174 = list(list(makeSymbol("MODULE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list175 = list(makeSymbol("REMOVAL-MODULES-CONJUNCTIVE"));

    private static final SubLSymbol REMOVAL_MODULES_CONJUNCTIVE = makeSymbol("REMOVAL-MODULES-CONJUNCTIVE");

    private static final SubLSymbol DO_CONJUNCTIVE_REMOVAL_MODULES = makeSymbol("DO-CONJUNCTIVE-REMOVAL-MODULES");

    private static final SubLList $list179 = list(makeSymbol("META-REMOVAL-MODULES"));

    private static final SubLSymbol META_REMOVAL_MODULES = makeSymbol("META-REMOVAL-MODULES");

    private static final SubLSymbol DO_META_REMOVAL_MODULES = makeSymbol("DO-META-REMOVAL-MODULES");

    private static final SubLSymbol $transformation_modules$ = makeSymbol("*TRANSFORMATION-MODULES*");

    private static final SubLList $list184 = list(makeSymbol("TRANSFORMATION-MODULES"));

    private static final SubLSymbol TRANSFORMATION_MODULES = makeSymbol("TRANSFORMATION-MODULES");

    private static final SubLSymbol DO_TRANSFORMATION_MODULES = makeSymbol("DO-TRANSFORMATION-MODULES");

    private static final SubLSymbol $meta_transformation_modules$ = makeSymbol("*META-TRANSFORMATION-MODULES*");

    private static final SubLList $list189 = list(makeSymbol("META-TRANSFORMATION-MODULES"));

    private static final SubLSymbol META_TRANSFORMATION_MODULES = makeSymbol("META-TRANSFORMATION-MODULES");

    private static final SubLSymbol DO_META_TRANSFORMATION_MODULES = makeSymbol("DO-META-TRANSFORMATION-MODULES");

    private static final SubLSymbol $rewrite_modules$ = makeSymbol("*REWRITE-MODULES*");

    private static final SubLList $list194 = list(makeSymbol("REWRITE-MODULES"));

    private static final SubLString $str198$rewrite_module__S_must_have_a__SE = makeString("rewrite module ~S must have a :SENSE of :POS or :NEG");

    private static final SubLSymbol $structural_modules$ = makeSymbol("*STRUCTURAL-MODULES*");

    private static final SubLSymbol $meta_structural_modules$ = makeSymbol("*META-STRUCTURAL-MODULES*");

    private static final SubLList $list202 = list(makeSymbol("META-STRUCTURAL-MODULES"));

    private static final SubLSymbol META_STRUCTURAL_MODULES = makeSymbol("META-STRUCTURAL-MODULES");

    private static final SubLSymbol DO_META_STRUCTURAL_MODULES = makeSymbol("DO-META-STRUCTURAL-MODULES");

    private static final SubLSymbol CFASL_INPUT_HL_MODULE = makeSymbol("CFASL-INPUT-HL-MODULE");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_HL_MODULE_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-HL-MODULE-METHOD");

    public static final SubLObject hl_module_property_p_alt(SubLObject v_object) {
        return makeBoolean(v_object.isKeyword() && (NIL != list_utilities.member_eqP(v_object, $hl_module_properties$.getGlobalValue())));
    }

    public static SubLObject hl_module_property_p(final SubLObject v_object) {
        return makeBoolean(v_object.isKeyword() && (NIL != subl_promotions.memberP(v_object, inference_modules.$hl_module_properties$.getGlobalValue(), UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject do_hl_module_properties_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject property_var = NIL;
                    SubLObject value_var = NIL;
                    SubLObject hl_module = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt2);
                    property_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt2);
                    value_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt2);
                    hl_module = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject module_var = $sym3$MODULE_VAR;
                            return list(CLET, list(list(module_var, hl_module)), list(DO_LIST, bq_cons(property_var, $list_alt6), list(PWHEN, list($sym8$HL_MODULE_PROPERTY_NOT_DEFAULT_, module_var, property_var), listS(CLET, list(list(value_var, list(HL_MODULE_PROPERTY_WITHOUT_VALUES, module_var, property_var))), append(body, NIL)))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt2);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject do_hl_module_properties(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, inference_modules.$list2);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject property_var = NIL;
        SubLObject value_var = NIL;
        SubLObject hl_module = NIL;
        destructuring_bind_must_consp(current, datum, inference_modules.$list2);
        property_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, inference_modules.$list2);
        value_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, inference_modules.$list2);
        hl_module = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject module_var = inference_modules.$sym3$MODULE_VAR;
            return list(CLET, list(list(module_var, hl_module)), list(DO_LIST, bq_cons(property_var, inference_modules.$list6), list(PWHEN, list(inference_modules.$sym8$HL_MODULE_PROPERTY_NOT_DEFAULT_, module_var, property_var), listS(CLET, list(list(value_var, list(inference_modules.HL_MODULE_PROPERTY_WITHOUT_VALUES, module_var, property_var))), append(body, NIL)))));
        }
        cdestructuring_bind_error(datum, inference_modules.$list2);
        return NIL;
    }

    public static final SubLObject hl_module_properties_alt() {
        return $hl_module_properties$.getGlobalValue();
    }

    public static SubLObject hl_module_properties() {
        return inference_modules.$hl_module_properties$.getGlobalValue();
    }

    public static final SubLObject removal_module_plist_indicators_alt() {
        return com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_properties();
    }

    public static SubLObject removal_module_plist_indicators() {
        return inference_modules.hl_module_properties();
    }

    public static final SubLObject hl_module_subtype_p_alt(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $valid_hl_module_subtypes$.getGlobalValue());
    }

    public static SubLObject hl_module_subtype_p(final SubLObject v_object) {
        return member_eqP(v_object, inference_modules.$valid_hl_module_subtypes$.getGlobalValue());
    }

    /**
     * An allowed-modules-spec is a specification for stating which HL modules
     * are allowed to be used.  It can be of any of the following forms:
     * :all                        All HL modules are allowed
     * (:or <spec1> .. <specN>)    Any HL module which meets any of allowed-modules-specs 1..N is allowed
     * (:and <spec1> .. <specN>)   Any HL module which meets ALL of allowed-modules-specs 1..N is allowed
     * (:not <spec>)               Any HL module which does not meet allowed-module-spec <spec> is allowed
     * (:module-type <type>)       Any HL module which has <type> as its type is allowed (see hl-module-type)
     * (:module-subtype <type>)    Any HL module which has <type> as one of its subtypes is allowed (see the HL module property :module-subtypes)
     * (<property> <value>)        Any HL module which has <value> as its value for the HL module property <property> is allowed
     * <module-name>               The HL module whose name is <module-name> is allowed
     */
    @LispMethod(comment = "An allowed-modules-spec is a specification for stating which HL modules\r\nare allowed to be used.  It can be of any of the following forms:\r\n:all                        All HL modules are allowed\r\n(:or <spec1> .. <specN>)    Any HL module which meets any of allowed-modules-specs 1..N is allowed\r\n(:and <spec1> .. <specN>)   Any HL module which meets ALL of allowed-modules-specs 1..N is allowed\r\n(:not <spec>)               Any HL module which does not meet allowed-module-spec <spec> is allowed\r\n(:module-type <type>)       Any HL module which has <type> as its type is allowed (see hl-module-type)\r\n(:module-subtype <type>)    Any HL module which has <type> as one of its subtypes is allowed (see the HL module property :module-subtypes)\r\n(<property> <value>)        Any HL module which has <value> as its value for the HL module property <property> is allowed\r\n<module-name>               The HL module whose name is <module-name> is allowed\nAn allowed-modules-spec is a specification for stating which HL modules\nare allowed to be used.  It can be of any of the following forms:\n:all                        All HL modules are allowed\n(:or <spec1> .. <specN>)    Any HL module which meets any of allowed-modules-specs 1..N is allowed\n(:and <spec1> .. <specN>)   Any HL module which meets ALL of allowed-modules-specs 1..N is allowed\n(:not <spec>)               Any HL module which does not meet allowed-module-spec <spec> is allowed\n(:module-type <type>)       Any HL module which has <type> as its type is allowed (see hl-module-type)\n(:module-subtype <type>)    Any HL module which has <type> as one of its subtypes is allowed (see the HL module property :module-subtypes)\n(<property> <value>)        Any HL module which has <value> as its value for the HL module property <property> is allowed\n<module-name>               The HL module whose name is <module-name> is allowed")
    public static final SubLObject allowed_modules_spec_p_alt(SubLObject v_object) {
        return makeBoolean(((((((($ALL == v_object) || (NIL != com.cyc.cycjava.cycl.inference.harness.inference_modules.disjunctive_allowed_modules_spec_p(v_object))) || (NIL != com.cyc.cycjava.cycl.inference.harness.inference_modules.conjunctive_allowed_modules_spec_p(v_object))) || (NIL != com.cyc.cycjava.cycl.inference.harness.inference_modules.negated_allowed_modules_spec_p(v_object))) || (NIL != com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_type_spec_p(v_object))) || (NIL != com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_subtype_spec_p(v_object))) || (NIL != com.cyc.cycjava.cycl.inference.harness.inference_modules.property_allowed_modules_spec_p(v_object))) || (NIL != com.cyc.cycjava.cycl.inference.harness.inference_modules.find_hl_module_by_name(v_object)));
    }

    /**
     * An allowed-modules-spec is a specification for stating which HL modules
     * are allowed to be used.  It can be of any of the following forms:
     * :all                        All HL modules are allowed
     * (:or <spec1> .. <specN>)    Any HL module which meets any of allowed-modules-specs 1..N is allowed
     * (:and <spec1> .. <specN>)   Any HL module which meets ALL of allowed-modules-specs 1..N is allowed
     * (:not <spec>)               Any HL module which does not meet allowed-module-spec <spec> is allowed
     * (:module-type <type>)       Any HL module which has <type> as its type is allowed (see hl-module-type)
     * (:module-subtype <type>)    Any HL module which has <type> as one of its subtypes is allowed (see the HL module property :module-subtypes)
     * (<property> <value>)        Any HL module which has <value> as its value for the HL module property <property> is allowed
     * <module-name>               The HL module whose name is <module-name> is allowed
     */
    @LispMethod(comment = "An allowed-modules-spec is a specification for stating which HL modules\r\nare allowed to be used.  It can be of any of the following forms:\r\n:all                        All HL modules are allowed\r\n(:or <spec1> .. <specN>)    Any HL module which meets any of allowed-modules-specs 1..N is allowed\r\n(:and <spec1> .. <specN>)   Any HL module which meets ALL of allowed-modules-specs 1..N is allowed\r\n(:not <spec>)               Any HL module which does not meet allowed-module-spec <spec> is allowed\r\n(:module-type <type>)       Any HL module which has <type> as its type is allowed (see hl-module-type)\r\n(:module-subtype <type>)    Any HL module which has <type> as one of its subtypes is allowed (see the HL module property :module-subtypes)\r\n(<property> <value>)        Any HL module which has <value> as its value for the HL module property <property> is allowed\r\n<module-name>               The HL module whose name is <module-name> is allowed\nAn allowed-modules-spec is a specification for stating which HL modules\nare allowed to be used.  It can be of any of the following forms:\n:all                        All HL modules are allowed\n(:or <spec1> .. <specN>)    Any HL module which meets any of allowed-modules-specs 1..N is allowed\n(:and <spec1> .. <specN>)   Any HL module which meets ALL of allowed-modules-specs 1..N is allowed\n(:not <spec>)               Any HL module which does not meet allowed-module-spec <spec> is allowed\n(:module-type <type>)       Any HL module which has <type> as its type is allowed (see hl-module-type)\n(:module-subtype <type>)    Any HL module which has <type> as one of its subtypes is allowed (see the HL module property :module-subtypes)\n(<property> <value>)        Any HL module which has <value> as its value for the HL module property <property> is allowed\n<module-name>               The HL module whose name is <module-name> is allowed")
    public static SubLObject allowed_modules_spec_p(final SubLObject v_object) {
        return makeBoolean(((((((($ALL == v_object) || (NIL != inference_modules.disjunctive_allowed_modules_spec_p(v_object))) || (NIL != inference_modules.conjunctive_allowed_modules_spec_p(v_object))) || (NIL != inference_modules.negated_allowed_modules_spec_p(v_object))) || (NIL != inference_modules.hl_module_type_spec_p(v_object))) || (NIL != inference_modules.hl_module_subtype_spec_p(v_object))) || (NIL != inference_modules.property_allowed_modules_spec_p(v_object))) || (NIL != inference_modules.find_hl_module_by_name(v_object)));
    }

    /**
     * Any allowed-modules-spec other than :all.
     */
    @LispMethod(comment = "Any allowed-modules-spec other than :all.")
    public static final SubLObject non_universal_allowed_modules_spec_p_alt(SubLObject v_object) {
        return makeBoolean(($ALL != v_object) && (NIL != com.cyc.cycjava.cycl.inference.harness.inference_modules.allowed_modules_spec_p(v_object)));
    }

    /**
     * Any allowed-modules-spec other than :all.
     */
    @LispMethod(comment = "Any allowed-modules-spec other than :all.")
    public static SubLObject non_universal_allowed_modules_spec_p(final SubLObject v_object) {
        return makeBoolean(($ALL != v_object) && (NIL != inference_modules.allowed_modules_spec_p(v_object)));
    }

    public static final SubLObject disjunctive_allowed_modules_spec_p_alt(SubLObject v_object) {
        return makeBoolean((v_object.isCons() && ($OR == v_object.first())) && (NIL != list_utilities.list_of_type_p(ALLOWED_MODULES_SPEC_P, v_object.rest())));
    }

    public static SubLObject disjunctive_allowed_modules_spec_p(final SubLObject v_object) {
        return makeBoolean((v_object.isCons() && ($OR == v_object.first())) && (NIL != list_of_type_p(inference_modules.ALLOWED_MODULES_SPEC_P, v_object.rest())));
    }

    public static final SubLObject conjunctive_allowed_modules_spec_p_alt(SubLObject v_object) {
        return makeBoolean((v_object.isCons() && ($AND == v_object.first())) && (NIL != list_utilities.list_of_type_p(ALLOWED_MODULES_SPEC_P, v_object.rest())));
    }

    public static SubLObject conjunctive_allowed_modules_spec_p(final SubLObject v_object) {
        return makeBoolean((v_object.isCons() && ($AND == v_object.first())) && (NIL != list_of_type_p(inference_modules.ALLOWED_MODULES_SPEC_P, v_object.rest())));
    }

    public static final SubLObject negated_allowed_modules_spec_p_alt(SubLObject v_object) {
        return makeBoolean((v_object.isCons() && ($NOT == v_object.first())) && (NIL != list_utilities.list_of_type_p(ALLOWED_MODULES_SPEC_P, v_object.rest())));
    }

    public static SubLObject negated_allowed_modules_spec_p(final SubLObject v_object) {
        return makeBoolean((v_object.isCons() && ($NOT == v_object.first())) && (NIL != list_of_type_p(inference_modules.ALLOWED_MODULES_SPEC_P, v_object.rest())));
    }

    public static final SubLObject hl_module_type_spec_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != list_utilities.doubletonP(v_object)) && ($MODULE_TYPE == v_object.first()));
    }

    public static SubLObject hl_module_type_spec_p(final SubLObject v_object) {
        return makeBoolean((NIL != doubletonP(v_object)) && ($MODULE_TYPE == v_object.first()));
    }

    public static final SubLObject hl_module_subtype_spec_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != list_utilities.doubletonP(v_object)) && ($MODULE_SUBTYPE == v_object.first()));
    }

    public static SubLObject hl_module_subtype_spec_p(final SubLObject v_object) {
        return makeBoolean((NIL != doubletonP(v_object)) && ($MODULE_SUBTYPE == v_object.first()));
    }

    public static final SubLObject property_allowed_modules_spec_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != list_utilities.doubletonP(v_object)) && (NIL != com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_property_p(v_object.first())));
    }

    public static SubLObject property_allowed_modules_spec_p(final SubLObject v_object) {
        return makeBoolean((NIL != doubletonP(v_object)) && (NIL != inference_modules.hl_module_property_p(v_object.first())));
    }

    /**
     *
     *
     * @return booleanp; whether HL-MODULE is permitted to be used,
    according to ALLOWED-MODULES-SPEC.
     */
    @LispMethod(comment = "@return booleanp; whether HL-MODULE is permitted to be used,\r\naccording to ALLOWED-MODULES-SPEC.")
    public static final SubLObject hl_module_allowedP_alt(SubLObject hl_module, SubLObject allowed_modules_spec) {
        SubLTrampolineFile.checkType(hl_module, HL_MODULE_P);
        SubLTrampolineFile.checkType(allowed_modules_spec, ALLOWED_MODULES_SPEC_P);
        return com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_allowed_by_allowed_modules_specP(hl_module, allowed_modules_spec);
    }

    /**
     *
     *
     * @return booleanp; whether HL-MODULE is permitted to be used,
    according to ALLOWED-MODULES-SPEC.
     */
    @LispMethod(comment = "@return booleanp; whether HL-MODULE is permitted to be used,\r\naccording to ALLOWED-MODULES-SPEC.")
    public static SubLObject hl_module_allowedP(final SubLObject hl_module, final SubLObject allowed_modules_spec) {
        assert NIL != inference_modules.hl_module_p(hl_module) : "! inference_modules.hl_module_p(hl_module) " + ("inference_modules.hl_module_p(hl_module) " + "CommonSymbols.NIL != inference_modules.hl_module_p(hl_module) ") + hl_module;
        assert NIL != inference_modules.allowed_modules_spec_p(allowed_modules_spec) : "! inference_modules.allowed_modules_spec_p(allowed_modules_spec) " + ("inference_modules.allowed_modules_spec_p(allowed_modules_spec) " + "CommonSymbols.NIL != inference_modules.allowed_modules_spec_p(allowed_modules_spec) ") + allowed_modules_spec;
        return inference_modules.hl_module_allowed_by_allowed_modules_specP(hl_module, allowed_modules_spec);
    }

    public static final SubLObject hl_module_allowed_by_allowed_modules_specP_alt(SubLObject hl_module, SubLObject allowed_modules_spec) {
        if ($ALL == allowed_modules_spec) {
            return T;
        } else {
            if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_modules.disjunctive_allowed_modules_spec_p(allowed_modules_spec)) {
                {
                    SubLObject cdolist_list_var = allowed_modules_spec.rest();
                    SubLObject allowed_modules_subspec = NIL;
                    for (allowed_modules_subspec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , allowed_modules_subspec = cdolist_list_var.first()) {
                        if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_allowed_by_allowed_modules_specP(hl_module, allowed_modules_subspec)) {
                            return T;
                        }
                    }
                }
                return NIL;
            } else {
                if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_modules.conjunctive_allowed_modules_spec_p(allowed_modules_spec)) {
                    {
                        SubLObject cdolist_list_var = allowed_modules_spec.rest();
                        SubLObject allowed_modules_subspec = NIL;
                        for (allowed_modules_subspec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , allowed_modules_subspec = cdolist_list_var.first()) {
                            if (NIL == com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_allowed_by_allowed_modules_specP(hl_module, allowed_modules_subspec)) {
                                return NIL;
                            }
                        }
                    }
                    return T;
                } else {
                    if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_modules.negated_allowed_modules_spec_p(allowed_modules_spec)) {
                        return makeBoolean(NIL == com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_allowed_by_allowed_modules_specP(hl_module, second(allowed_modules_spec)));
                    } else {
                        if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_type_spec_p(allowed_modules_spec)) {
                            return eq(second(allowed_modules_spec), com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_type(hl_module));
                        } else {
                            if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_subtype_spec_p(allowed_modules_spec)) {
                                return list_utilities.member_eqP(second(allowed_modules_spec), com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_subtypes(hl_module));
                            } else {
                                if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_modules.property_allowed_modules_spec_p(allowed_modules_spec)) {
                                    {
                                        SubLObject property = allowed_modules_spec.first();
                                        SubLObject allowed_value = second(allowed_modules_spec);
                                        SubLObject actual_value = com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_property_without_values(hl_module, property);
                                        return equal(allowed_value, actual_value);
                                    }
                                } else {
                                    return eq(hl_module, com.cyc.cycjava.cycl.inference.harness.inference_modules.find_hl_module_by_name(allowed_modules_spec));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject hl_module_allowed_by_allowed_modules_specP(final SubLObject hl_module, final SubLObject allowed_modules_spec) {
        if ($ALL == allowed_modules_spec) {
            return T;
        }
        if (NIL != inference_modules.disjunctive_allowed_modules_spec_p(allowed_modules_spec)) {
            SubLObject cdolist_list_var = allowed_modules_spec.rest();
            SubLObject allowed_modules_subspec = NIL;
            allowed_modules_subspec = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != inference_modules.hl_module_allowed_by_allowed_modules_specP(hl_module, allowed_modules_subspec)) {
                    return T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                allowed_modules_subspec = cdolist_list_var.first();
            } 
            return NIL;
        }
        if (NIL != inference_modules.conjunctive_allowed_modules_spec_p(allowed_modules_spec)) {
            SubLObject cdolist_list_var = allowed_modules_spec.rest();
            SubLObject allowed_modules_subspec = NIL;
            allowed_modules_subspec = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == inference_modules.hl_module_allowed_by_allowed_modules_specP(hl_module, allowed_modules_subspec)) {
                    return NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                allowed_modules_subspec = cdolist_list_var.first();
            } 
            return T;
        }
        if (NIL != inference_modules.negated_allowed_modules_spec_p(allowed_modules_spec)) {
            return makeBoolean(NIL == inference_modules.hl_module_allowed_by_allowed_modules_specP(hl_module, second(allowed_modules_spec)));
        }
        if (NIL != inference_modules.hl_module_type_spec_p(allowed_modules_spec)) {
            return eql(second(allowed_modules_spec), inference_modules.hl_module_type(hl_module));
        }
        if (NIL != inference_modules.hl_module_subtype_spec_p(allowed_modules_spec)) {
            return subl_promotions.memberP(second(allowed_modules_spec), inference_modules.hl_module_subtypes(hl_module), UNPROVIDED, UNPROVIDED);
        }
        if (NIL != inference_modules.property_allowed_modules_spec_p(allowed_modules_spec)) {
            final SubLObject property = allowed_modules_spec.first();
            final SubLObject allowed_value = second(allowed_modules_spec);
            final SubLObject actual_value = inference_modules.hl_module_property_without_values(hl_module, property);
            return equal(allowed_value, actual_value);
        }
        return eql(hl_module, inference_modules.find_hl_module_by_name(allowed_modules_spec));
    }

    public static final SubLObject simple_allowed_modules_spec_p_alt(SubLObject allowed_modules_spec) {
        if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_modules.find_hl_module_by_name(allowed_modules_spec)) {
            return T;
        } else {
            if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_modules.disjunctive_allowed_modules_spec_p(allowed_modules_spec)) {
                {
                    SubLObject cdolist_list_var = allowed_modules_spec.rest();
                    SubLObject allowed_modules_subspec = NIL;
                    for (allowed_modules_subspec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , allowed_modules_subspec = cdolist_list_var.first()) {
                        if (NIL == com.cyc.cycjava.cycl.inference.harness.inference_modules.simple_allowed_modules_spec_p(allowed_modules_subspec)) {
                            return NIL;
                        }
                    }
                }
                return T;
            } else {
                if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_modules.conjunctive_allowed_modules_spec_p(allowed_modules_spec)) {
                    {
                        SubLObject cdolist_list_var = allowed_modules_spec.rest();
                        SubLObject allowed_modules_subspec = NIL;
                        for (allowed_modules_subspec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , allowed_modules_subspec = cdolist_list_var.first()) {
                            if (NIL == com.cyc.cycjava.cycl.inference.harness.inference_modules.simple_allowed_modules_spec_p(allowed_modules_subspec)) {
                                return NIL;
                            }
                        }
                    }
                    return T;
                } else {
                    if ((((($ALL == allowed_modules_spec) || (NIL != com.cyc.cycjava.cycl.inference.harness.inference_modules.negated_allowed_modules_spec_p(allowed_modules_spec))) || (NIL != com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_type_spec_p(allowed_modules_spec))) || (NIL != com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_subtype_spec_p(allowed_modules_spec))) || (NIL != com.cyc.cycjava.cycl.inference.harness.inference_modules.property_allowed_modules_spec_p(allowed_modules_spec))) {
                        return NIL;
                    } else {
                        return NIL;
                    }
                }
            }
        }
    }

    public static SubLObject simple_allowed_modules_spec_p(final SubLObject allowed_modules_spec) {
        if (NIL != inference_modules.find_hl_module_by_name(allowed_modules_spec)) {
            return T;
        }
        if (NIL != inference_modules.disjunctive_allowed_modules_spec_p(allowed_modules_spec)) {
            SubLObject cdolist_list_var = allowed_modules_spec.rest();
            SubLObject allowed_modules_subspec = NIL;
            allowed_modules_subspec = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == inference_modules.simple_allowed_modules_spec_p(allowed_modules_subspec)) {
                    return NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                allowed_modules_subspec = cdolist_list_var.first();
            } 
            return T;
        }
        if (NIL != inference_modules.conjunctive_allowed_modules_spec_p(allowed_modules_spec)) {
            SubLObject cdolist_list_var = allowed_modules_spec.rest();
            SubLObject allowed_modules_subspec = NIL;
            allowed_modules_subspec = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == inference_modules.simple_allowed_modules_spec_p(allowed_modules_subspec)) {
                    return NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                allowed_modules_subspec = cdolist_list_var.first();
            } 
            return T;
        }
        if ((((($ALL == allowed_modules_spec) || (NIL != inference_modules.negated_allowed_modules_spec_p(allowed_modules_spec))) || (NIL != inference_modules.hl_module_type_spec_p(allowed_modules_spec))) || (NIL != inference_modules.hl_module_subtype_spec_p(allowed_modules_spec))) || (NIL != inference_modules.property_allowed_modules_spec_p(allowed_modules_spec))) {
            return NIL;
        }
        return NIL;
    }

    public static final SubLObject get_modules_from_simple_allowed_modules_spec_alt(SubLObject allowed_modules_spec) {
        if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_modules.disjunctive_allowed_modules_spec_p(allowed_modules_spec)) {
            {
                SubLObject module_specs = NIL;
                SubLObject cdolist_list_var = allowed_modules_spec.rest();
                SubLObject allowed_modules_subspec = NIL;
                for (allowed_modules_subspec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , allowed_modules_subspec = cdolist_list_var.first()) {
                    module_specs = append(module_specs, com.cyc.cycjava.cycl.inference.harness.inference_modules.get_modules_from_simple_allowed_modules_spec(allowed_modules_subspec));
                }
                return module_specs;
            }
        } else {
            if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_modules.conjunctive_allowed_modules_spec_p(allowed_modules_spec)) {
                {
                    SubLObject module_specs = NIL;
                    SubLObject cdolist_list_var = allowed_modules_spec.rest();
                    SubLObject allowed_modules_subspec = NIL;
                    for (allowed_modules_subspec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , allowed_modules_subspec = cdolist_list_var.first()) {
                        module_specs = append(module_specs, com.cyc.cycjava.cycl.inference.harness.inference_modules.get_modules_from_simple_allowed_modules_spec(allowed_modules_subspec));
                    }
                    return module_specs;
                }
            } else {
                return list(com.cyc.cycjava.cycl.inference.harness.inference_modules.find_hl_module_by_name(allowed_modules_spec));
            }
        }
    }

    public static SubLObject get_modules_from_simple_allowed_modules_spec(final SubLObject allowed_modules_spec) {
        if (NIL != inference_modules.disjunctive_allowed_modules_spec_p(allowed_modules_spec)) {
            SubLObject module_specs = NIL;
            SubLObject cdolist_list_var = allowed_modules_spec.rest();
            SubLObject allowed_modules_subspec = NIL;
            allowed_modules_subspec = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                module_specs = append(module_specs, inference_modules.get_modules_from_simple_allowed_modules_spec(allowed_modules_subspec));
                cdolist_list_var = cdolist_list_var.rest();
                allowed_modules_subspec = cdolist_list_var.first();
            } 
            return module_specs;
        }
        if (NIL != inference_modules.conjunctive_allowed_modules_spec_p(allowed_modules_spec)) {
            SubLObject module_specs = NIL;
            SubLObject cdolist_list_var = allowed_modules_spec.rest();
            SubLObject allowed_modules_subspec = NIL;
            allowed_modules_subspec = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                module_specs = append(module_specs, inference_modules.get_modules_from_simple_allowed_modules_spec(allowed_modules_subspec));
                cdolist_list_var = cdolist_list_var.rest();
                allowed_modules_subspec = cdolist_list_var.first();
            } 
            return module_specs;
        }
        return list(inference_modules.find_hl_module_by_name(allowed_modules_spec));
    }

    public static final SubLObject hl_module_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        com.cyc.cycjava.cycl.inference.harness.inference_modules.print_hl_module(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject hl_module_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        inference_modules.print_hl_module(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject hl_module_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.inference.harness.inference_modules.$hl_module_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject hl_module_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.inference.harness.inference_modules.$hl_module_native.class ? T : NIL;
    }

    public static final SubLObject hl_mod_name_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HL_MODULE_P);
        return v_object.getField2();
    }

    public static SubLObject hl_mod_name(final SubLObject v_object) {
        assert NIL != inference_modules.hl_module_p(v_object) : "! inference_modules.hl_module_p(v_object) " + "inference_modules.hl_module_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject hl_mod_plist_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HL_MODULE_P);
        return v_object.getField3();
    }

    public static SubLObject hl_mod_plist(final SubLObject v_object) {
        assert NIL != inference_modules.hl_module_p(v_object) : "! inference_modules.hl_module_p(v_object) " + "inference_modules.hl_module_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject hl_mod_sense_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HL_MODULE_P);
        return v_object.getField4();
    }

    public static SubLObject hl_mod_sense(final SubLObject v_object) {
        assert NIL != inference_modules.hl_module_p(v_object) : "! inference_modules.hl_module_p(v_object) " + "inference_modules.hl_module_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject hl_mod_predicate_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HL_MODULE_P);
        return v_object.getField5();
    }

    public static SubLObject hl_mod_predicate(final SubLObject v_object) {
        assert NIL != inference_modules.hl_module_p(v_object) : "! inference_modules.hl_module_p(v_object) " + "inference_modules.hl_module_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject hl_mod_any_predicates_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HL_MODULE_P);
        return v_object.getField6();
    }

    public static SubLObject hl_mod_any_predicates(final SubLObject v_object) {
        assert NIL != inference_modules.hl_module_p(v_object) : "! inference_modules.hl_module_p(v_object) " + "inference_modules.hl_module_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject hl_mod_arity_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HL_MODULE_P);
        return v_object.getField7();
    }

    public static SubLObject hl_mod_arity(final SubLObject v_object) {
        assert NIL != inference_modules.hl_module_p(v_object) : "! inference_modules.hl_module_p(v_object) " + "inference_modules.hl_module_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject hl_mod_direction_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HL_MODULE_P);
        return v_object.getField8();
    }

    public static SubLObject hl_mod_direction(final SubLObject v_object) {
        assert NIL != inference_modules.hl_module_p(v_object) : "! inference_modules.hl_module_p(v_object) " + "inference_modules.hl_module_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject hl_mod_required_pattern_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HL_MODULE_P);
        return v_object.getField9();
    }

    public static SubLObject hl_mod_required_pattern(final SubLObject v_object) {
        assert NIL != inference_modules.hl_module_p(v_object) : "! inference_modules.hl_module_p(v_object) " + "inference_modules.hl_module_p error :" + v_object;
        return v_object.getField9();
    }

    public static final SubLObject hl_mod_required_mt_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HL_MODULE_P);
        return v_object.getField10();
    }

    public static SubLObject hl_mod_required_mt(final SubLObject v_object) {
        assert NIL != inference_modules.hl_module_p(v_object) : "! inference_modules.hl_module_p(v_object) " + "inference_modules.hl_module_p error :" + v_object;
        return v_object.getField10();
    }

    public static final SubLObject hl_mod_exclusive_func_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HL_MODULE_P);
        return v_object.getField11();
    }

    public static SubLObject hl_mod_exclusive_func(final SubLObject v_object) {
        assert NIL != inference_modules.hl_module_p(v_object) : "! inference_modules.hl_module_p(v_object) " + "inference_modules.hl_module_p error :" + v_object;
        return v_object.getField11();
    }

    public static final SubLObject hl_mod_required_func_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HL_MODULE_P);
        return v_object.getField12();
    }

    public static SubLObject hl_mod_required_func(final SubLObject v_object) {
        assert NIL != inference_modules.hl_module_p(v_object) : "! inference_modules.hl_module_p(v_object) " + "inference_modules.hl_module_p error :" + v_object;
        return v_object.getField12();
    }

    public static final SubLObject hl_mod_completeness_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HL_MODULE_P);
        return v_object.getField13();
    }

    public static SubLObject hl_mod_completeness(final SubLObject v_object) {
        assert NIL != inference_modules.hl_module_p(v_object) : "! inference_modules.hl_module_p(v_object) " + "inference_modules.hl_module_p error :" + v_object;
        return v_object.getField13();
    }

    public static final SubLObject _csetf_hl_mod_name_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HL_MODULE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_hl_mod_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_modules.hl_module_p(v_object) : "! inference_modules.hl_module_p(v_object) " + "inference_modules.hl_module_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_hl_mod_plist_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HL_MODULE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_hl_mod_plist(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_modules.hl_module_p(v_object) : "! inference_modules.hl_module_p(v_object) " + "inference_modules.hl_module_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_hl_mod_sense_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HL_MODULE_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_hl_mod_sense(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_modules.hl_module_p(v_object) : "! inference_modules.hl_module_p(v_object) " + "inference_modules.hl_module_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_hl_mod_predicate_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HL_MODULE_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_hl_mod_predicate(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_modules.hl_module_p(v_object) : "! inference_modules.hl_module_p(v_object) " + "inference_modules.hl_module_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_hl_mod_any_predicates_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HL_MODULE_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_hl_mod_any_predicates(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_modules.hl_module_p(v_object) : "! inference_modules.hl_module_p(v_object) " + "inference_modules.hl_module_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_hl_mod_arity_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HL_MODULE_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_hl_mod_arity(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_modules.hl_module_p(v_object) : "! inference_modules.hl_module_p(v_object) " + "inference_modules.hl_module_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_hl_mod_direction_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HL_MODULE_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_hl_mod_direction(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_modules.hl_module_p(v_object) : "! inference_modules.hl_module_p(v_object) " + "inference_modules.hl_module_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_hl_mod_required_pattern_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HL_MODULE_P);
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_hl_mod_required_pattern(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_modules.hl_module_p(v_object) : "! inference_modules.hl_module_p(v_object) " + "inference_modules.hl_module_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static final SubLObject _csetf_hl_mod_required_mt_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HL_MODULE_P);
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_hl_mod_required_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_modules.hl_module_p(v_object) : "! inference_modules.hl_module_p(v_object) " + "inference_modules.hl_module_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static final SubLObject _csetf_hl_mod_exclusive_func_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HL_MODULE_P);
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_hl_mod_exclusive_func(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_modules.hl_module_p(v_object) : "! inference_modules.hl_module_p(v_object) " + "inference_modules.hl_module_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static final SubLObject _csetf_hl_mod_required_func_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HL_MODULE_P);
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_hl_mod_required_func(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_modules.hl_module_p(v_object) : "! inference_modules.hl_module_p(v_object) " + "inference_modules.hl_module_p error :" + v_object;
        return v_object.setField12(value);
    }

    public static final SubLObject _csetf_hl_mod_completeness_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HL_MODULE_P);
        return v_object.setField13(value);
    }

    public static SubLObject _csetf_hl_mod_completeness(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_modules.hl_module_p(v_object) : "! inference_modules.hl_module_p(v_object) " + "inference_modules.hl_module_p error :" + v_object;
        return v_object.setField13(value);
    }

    public static final SubLObject make_hl_module_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.inference.harness.inference_modules.$hl_module_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($NAME)) {
                        com.cyc.cycjava.cycl.inference.harness.inference_modules._csetf_hl_mod_name(v_new, current_value);
                    } else {
                        if (pcase_var.eql($PLIST)) {
                            com.cyc.cycjava.cycl.inference.harness.inference_modules._csetf_hl_mod_plist(v_new, current_value);
                        } else {
                            if (pcase_var.eql($SENSE)) {
                                com.cyc.cycjava.cycl.inference.harness.inference_modules._csetf_hl_mod_sense(v_new, current_value);
                            } else {
                                if (pcase_var.eql($PREDICATE)) {
                                    com.cyc.cycjava.cycl.inference.harness.inference_modules._csetf_hl_mod_predicate(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($ANY_PREDICATES)) {
                                        com.cyc.cycjava.cycl.inference.harness.inference_modules._csetf_hl_mod_any_predicates(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($ARITY)) {
                                            com.cyc.cycjava.cycl.inference.harness.inference_modules._csetf_hl_mod_arity(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($DIRECTION)) {
                                                com.cyc.cycjava.cycl.inference.harness.inference_modules._csetf_hl_mod_direction(v_new, current_value);
                                            } else {
                                                if (pcase_var.eql($REQUIRED_PATTERN)) {
                                                    com.cyc.cycjava.cycl.inference.harness.inference_modules._csetf_hl_mod_required_pattern(v_new, current_value);
                                                } else {
                                                    if (pcase_var.eql($REQUIRED_MT)) {
                                                        com.cyc.cycjava.cycl.inference.harness.inference_modules._csetf_hl_mod_required_mt(v_new, current_value);
                                                    } else {
                                                        if (pcase_var.eql($EXCLUSIVE_FUNC)) {
                                                            com.cyc.cycjava.cycl.inference.harness.inference_modules._csetf_hl_mod_exclusive_func(v_new, current_value);
                                                        } else {
                                                            if (pcase_var.eql($REQUIRED_FUNC)) {
                                                                com.cyc.cycjava.cycl.inference.harness.inference_modules._csetf_hl_mod_required_func(v_new, current_value);
                                                            } else {
                                                                if (pcase_var.eql($COMPLETENESS)) {
                                                                    com.cyc.cycjava.cycl.inference.harness.inference_modules._csetf_hl_mod_completeness(v_new, current_value);
                                                                } else {
                                                                    Errors.error($str_alt65$Invalid_slot__S_for_construction_, current_arg);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_hl_module(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.inference.harness.inference_modules.$hl_module_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($NAME)) {
                inference_modules._csetf_hl_mod_name(v_new, current_value);
            } else
                if (pcase_var.eql($PLIST)) {
                    inference_modules._csetf_hl_mod_plist(v_new, current_value);
                } else
                    if (pcase_var.eql($SENSE)) {
                        inference_modules._csetf_hl_mod_sense(v_new, current_value);
                    } else
                        if (pcase_var.eql($PREDICATE)) {
                            inference_modules._csetf_hl_mod_predicate(v_new, current_value);
                        } else
                            if (pcase_var.eql($ANY_PREDICATES)) {
                                inference_modules._csetf_hl_mod_any_predicates(v_new, current_value);
                            } else
                                if (pcase_var.eql($ARITY)) {
                                    inference_modules._csetf_hl_mod_arity(v_new, current_value);
                                } else
                                    if (pcase_var.eql($DIRECTION)) {
                                        inference_modules._csetf_hl_mod_direction(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($REQUIRED_PATTERN)) {
                                            inference_modules._csetf_hl_mod_required_pattern(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($REQUIRED_MT)) {
                                                inference_modules._csetf_hl_mod_required_mt(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($EXCLUSIVE_FUNC)) {
                                                    inference_modules._csetf_hl_mod_exclusive_func(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($REQUIRED_FUNC)) {
                                                        inference_modules._csetf_hl_mod_required_func(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($COMPLETENESS)) {
                                                            inference_modules._csetf_hl_mod_completeness(v_new, current_value);
                                                        } else {
                                                            Errors.error(inference_modules.$str66$Invalid_slot__S_for_construction_, current_arg);
                                                        }











        }
        return v_new;
    }

    public static SubLObject visit_defstruct_hl_module(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, inference_modules.MAKE_HL_MODULE, TWELVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $NAME, inference_modules.hl_mod_name(obj));
        funcall(visitor_fn, obj, $SLOT, $PLIST, inference_modules.hl_mod_plist(obj));
        funcall(visitor_fn, obj, $SLOT, $SENSE, inference_modules.hl_mod_sense(obj));
        funcall(visitor_fn, obj, $SLOT, $PREDICATE, inference_modules.hl_mod_predicate(obj));
        funcall(visitor_fn, obj, $SLOT, $ANY_PREDICATES, inference_modules.hl_mod_any_predicates(obj));
        funcall(visitor_fn, obj, $SLOT, $ARITY, inference_modules.hl_mod_arity(obj));
        funcall(visitor_fn, obj, $SLOT, $DIRECTION, inference_modules.hl_mod_direction(obj));
        funcall(visitor_fn, obj, $SLOT, $REQUIRED_PATTERN, inference_modules.hl_mod_required_pattern(obj));
        funcall(visitor_fn, obj, $SLOT, $REQUIRED_MT, inference_modules.hl_mod_required_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $EXCLUSIVE_FUNC, inference_modules.hl_mod_exclusive_func(obj));
        funcall(visitor_fn, obj, $SLOT, $REQUIRED_FUNC, inference_modules.hl_mod_required_func(obj));
        funcall(visitor_fn, obj, $SLOT, $COMPLETENESS, inference_modules.hl_mod_completeness(obj));
        funcall(visitor_fn, obj, $END, inference_modules.MAKE_HL_MODULE, TWELVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_hl_module_method(final SubLObject obj, final SubLObject visitor_fn) {
        return inference_modules.visit_defstruct_hl_module(obj, visitor_fn);
    }

    public static final SubLObject print_hl_module_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        {
            SubLObject name = com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_name(v_object);
            format(stream, $str_alt66$_HL_Module___a_, name);
        }
        return NIL;
    }

    public static SubLObject print_hl_module(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLObject name = inference_modules.hl_module_name(v_object);
        format(stream, inference_modules.$str72$_HL_Module___a_, name);
        return NIL;
    }

    public static final SubLObject sxhash_hl_module_method_alt(SubLObject v_object) {
        return Sxhash.sxhash(com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_mod_name(v_object));
    }

    public static SubLObject sxhash_hl_module_method(final SubLObject v_object) {
        return Sxhash.sxhash(inference_modules.hl_mod_name(v_object));
    }

    public static final SubLObject check_hl_module_property_list_alt(SubLObject plist) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(plist, PROPERTY_LIST_P);
            {
                SubLObject exclusive_specifiedP = NIL;
                {
                    SubLObject remainder = NIL;
                    for (remainder = plist; NIL != remainder; remainder = cddr(remainder)) {
                        {
                            SubLObject property = remainder.first();
                            SubLObject value = cadr(remainder);
                            SubLTrampolineFile.checkType(property, HL_MODULE_PROPERTY_P);
                            {
                                SubLObject pcase_var = property;
                                if (pcase_var.eql($EXCLUSIVE)) {
                                    exclusive_specifiedP = T;
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject remainder = NIL;
                    for (remainder = plist; NIL != remainder; remainder = cddr(remainder)) {
                        {
                            SubLObject property = remainder.first();
                            SubLObject value = cadr(remainder);
                            SubLObject pcase_var = property;
                            if (pcase_var.eql($SUPPLANTS)) {
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (NIL == exclusive_specifiedP) {
                                        Errors.error($str_alt72$_supplants_is_meaningless_without, plist);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject check_hl_module_property_list(final SubLObject plist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != property_list_p(plist) : "! list_utilities.property_list_p(plist) " + ("list_utilities.property_list_p(plist) " + "CommonSymbols.NIL != list_utilities.property_list_p(plist) ") + plist;
        SubLObject exclusive_specifiedP = NIL;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        SubLObject pcase_var;
        for (remainder = NIL, remainder = plist; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            assert NIL != inference_modules.hl_module_property_p(property) : "! inference_modules.hl_module_property_p(property) " + ("inference_modules.hl_module_property_p(property) " + "CommonSymbols.NIL != inference_modules.hl_module_property_p(property) ") + property;
            pcase_var = property;
            if (pcase_var.eql($EXCLUSIVE)) {
                exclusive_specifiedP = T;
            }
        }
        for (remainder = NIL, remainder = plist; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            pcase_var = property;
            if ((pcase_var.eql($SUPPLANTS) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) && (NIL == exclusive_specifiedP)) {
                Errors.error(inference_modules.$str78$_supplants_is_meaningless_without, plist);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return hl-module-p; a new HL module named NAME with properties PLIST
     */
    @LispMethod(comment = "@return hl-module-p; a new HL module named NAME with properties PLIST")
    public static final SubLObject new_hl_module_alt(SubLObject name, SubLObject plist) {
        com.cyc.cycjava.cycl.inference.harness.inference_modules.check_hl_module_property_list(plist);
        {
            SubLObject hl_module = com.cyc.cycjava.cycl.inference.harness.inference_modules.allocate_hl_module(name);
            plist = com.cyc.cycjava.cycl.inference.harness.inference_modules.canonicalize_hl_module_plist(plist);
            com.cyc.cycjava.cycl.inference.harness.inference_modules._csetf_hl_mod_plist(hl_module, plist);
            com.cyc.cycjava.cycl.inference.harness.inference_modules.add_hl_module(hl_module);
            return hl_module;
        }
    }

    /**
     *
     *
     * @return hl-module-p; a new HL module named NAME with properties PLIST
     */
    @LispMethod(comment = "@return hl-module-p; a new HL module named NAME with properties PLIST")
    public static SubLObject new_hl_module(final SubLObject name, SubLObject plist) {
        inference_modules.check_hl_module_property_list(plist);
        final SubLObject hl_module = inference_modules.allocate_hl_module(name);
        plist = inference_modules.canonicalize_hl_module_plist(plist);
        inference_modules._csetf_hl_mod_plist(hl_module, plist);
        inference_modules.add_hl_module(hl_module);
        return hl_module;
    }

    public static SubLObject clear_cfasl_create_invalid_hl_module() {
        final SubLObject cs = inference_modules.$cfasl_create_invalid_hl_module_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_cfasl_create_invalid_hl_module(final SubLObject name) {
        return memoization_state.caching_state_remove_function_results_with_args(inference_modules.$cfasl_create_invalid_hl_module_caching_state$.getGlobalValue(), list(name), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cfasl_create_invalid_hl_module_internal(final SubLObject name) {
        return inference_modules.new_hl_module(name, inference_modules.$list80);
    }

    public static SubLObject cfasl_create_invalid_hl_module(final SubLObject name) {
        SubLObject caching_state = inference_modules.$cfasl_create_invalid_hl_module_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(inference_modules.CFASL_CREATE_INVALID_HL_MODULE, inference_modules.$cfasl_create_invalid_hl_module_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, name, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(inference_modules.cfasl_create_invalid_hl_module_internal(name)));
            memoization_state.caching_state_put(caching_state, name, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    /**
     * Right now the only thing this changes is a single module-subtype canonicalizes
     * into a singleton list.
     */
    @LispMethod(comment = "Right now the only thing this changes is a single module-subtype canonicalizes\r\ninto a singleton list.\nRight now the only thing this changes is a single module-subtype canonicalizes\ninto a singleton list.")
    public static final SubLObject canonicalize_hl_module_plist_alt(SubLObject plist) {
        {
            SubLObject module_subtypes = getf(plist, $MODULE_SUBTYPE, UNPROVIDED);
            if (!module_subtypes.isList()) {
                plist = putf(copy_list(plist), $MODULE_SUBTYPE, list(module_subtypes));
            }
        }
        return plist;
    }

    /**
     * Right now the only thing this changes is a single module-subtype canonicalizes
     * into a singleton list.
     */
    @LispMethod(comment = "Right now the only thing this changes is a single module-subtype canonicalizes\r\ninto a singleton list.\nRight now the only thing this changes is a single module-subtype canonicalizes\ninto a singleton list.")
    public static SubLObject canonicalize_hl_module_plist(SubLObject plist) {
        final SubLObject module_subtypes = getf(plist, $MODULE_SUBTYPE, UNPROVIDED);
        if (!module_subtypes.isList()) {
            plist = putf(copy_list(plist), $MODULE_SUBTYPE, list(module_subtypes));
        }
        return plist;
    }

    public static final SubLObject allocate_hl_module_alt(SubLObject name) {
        {
            SubLObject hl_module = com.cyc.cycjava.cycl.inference.harness.inference_modules.find_hl_module_by_name(name);
            if (NIL != hl_module) {
                com.cyc.cycjava.cycl.inference.harness.inference_modules.remove_hl_module(hl_module);
            } else {
                hl_module = com.cyc.cycjava.cycl.inference.harness.inference_modules.make_hl_module(UNPROVIDED);
                com.cyc.cycjava.cycl.inference.harness.inference_modules._csetf_hl_mod_name(hl_module, name);
            }
            com.cyc.cycjava.cycl.inference.harness.inference_modules._csetf_hl_mod_plist(hl_module, NIL);
            return hl_module;
        }
    }

    public static SubLObject allocate_hl_module(final SubLObject name) {
        SubLObject hl_module = inference_modules.find_hl_module_by_name(name);
        if (NIL != hl_module) {
            inference_modules.remove_hl_module(hl_module);
        } else {
            hl_module = inference_modules.make_hl_module(UNPROVIDED);
            inference_modules._csetf_hl_mod_name(hl_module, name);
        }
        inference_modules._csetf_hl_mod_plist(hl_module, NIL);
        return hl_module;
    }

    public static final SubLObject destroy_hl_module_alt(SubLObject hl_module) {
        com.cyc.cycjava.cycl.inference.harness.inference_modules.remove_hl_module(hl_module);
        com.cyc.cycjava.cycl.inference.harness.inference_modules._csetf_hl_mod_plist(hl_module, $FREE);
        return NIL;
    }

    public static SubLObject destroy_hl_module(final SubLObject hl_module) {
        inference_modules.remove_hl_module(hl_module);
        inference_modules._csetf_hl_mod_plist(hl_module, $FREE);
        return NIL;
    }

    public static final SubLObject hl_module_name_alt(SubLObject hl_module) {
        SubLTrampolineFile.checkType(hl_module, HL_MODULE_P);
        return com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_mod_name(hl_module);
    }

    public static SubLObject hl_module_name(final SubLObject hl_module) {
        assert NIL != inference_modules.hl_module_p(hl_module) : "! inference_modules.hl_module_p(hl_module) " + ("inference_modules.hl_module_p(hl_module) " + "CommonSymbols.NIL != inference_modules.hl_module_p(hl_module) ") + hl_module;
        return inference_modules.hl_mod_name(hl_module);
    }

    public static final SubLObject hl_module_plist_alt(SubLObject hl_module) {
        return com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_mod_plist(hl_module);
    }

    public static SubLObject hl_module_plist(final SubLObject hl_module) {
        return inference_modules.hl_mod_plist(hl_module);
    }

    /**
     *
     *
     * @return 0 the value of PROPERTY for HL-MODULE.
     * @return 1 booleanp; whether the returned value was inferred as a default.
     */
    @LispMethod(comment = "@return 0 the value of PROPERTY for HL-MODULE.\r\n@return 1 booleanp; whether the returned value was inferred as a default.")
    public static final SubLObject hl_module_property_alt(SubLObject hl_module, SubLObject property) {
        {
            SubLObject plist = com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_plist(hl_module);
            SubLObject value = getf(plist, property, $DEFAULT);
            if (value == $DEFAULT) {
                {
                    SubLObject v_default = dictionary.dictionary_lookup_without_values($hl_module_property_defaults$.getGlobalValue(), property, UNPROVIDED);
                    return values(v_default, T);
                }
            } else {
                return values(value, NIL);
            }
        }
    }

    /**
     *
     *
     * @return 0 the value of PROPERTY for HL-MODULE.
     * @return 1 booleanp; whether the returned value was inferred as a default.
     */
    @LispMethod(comment = "@return 0 the value of PROPERTY for HL-MODULE.\r\n@return 1 booleanp; whether the returned value was inferred as a default.")
    public static SubLObject hl_module_property(final SubLObject hl_module, final SubLObject property) {
        final SubLObject plist = inference_modules.hl_module_plist(hl_module);
        final SubLObject value = getf(plist, property, $DEFAULT);
        if (value == $DEFAULT) {
            final SubLObject v_default = dictionary_lookup_without_values(inference_modules.$hl_module_property_defaults$.getGlobalValue(), property, UNPROVIDED);
            return subl_promotions.values2(v_default, T);
        }
        return subl_promotions.values2(value, NIL);
    }

    /**
     *
     *
     * @return 0 the value of PROPERTY for HL-MODULE.
     * @return 1 booleanp; whether the returned value was inferred as a default.
     */
    @LispMethod(comment = "@return 0 the value of PROPERTY for HL-MODULE.\r\n@return 1 booleanp; whether the returned value was inferred as a default.")
    public static final SubLObject hl_module_property_without_values_alt(SubLObject hl_module, SubLObject property) {
        {
            SubLObject plist = com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_plist(hl_module);
            SubLObject value = getf(plist, property, $DEFAULT);
            if (value == $DEFAULT) {
                value = dictionary.dictionary_lookup_without_values($hl_module_property_defaults$.getGlobalValue(), property, UNPROVIDED);
            }
            return value;
        }
    }

    /**
     *
     *
     * @return 0 the value of PROPERTY for HL-MODULE.
     * @return 1 booleanp; whether the returned value was inferred as a default.
     */
    @LispMethod(comment = "@return 0 the value of PROPERTY for HL-MODULE.\r\n@return 1 booleanp; whether the returned value was inferred as a default.")
    public static SubLObject hl_module_property_without_values(final SubLObject hl_module, final SubLObject property) {
        final SubLObject plist = inference_modules.hl_module_plist(hl_module);
        SubLObject value = getf(plist, property, $DEFAULT);
        if (value == $DEFAULT) {
            value = dictionary_lookup_without_values(inference_modules.$hl_module_property_defaults$.getGlobalValue(), property, UNPROVIDED);
        }
        return value;
    }

    public static final SubLObject hl_module_property_not_defaultP_alt(SubLObject hl_module, SubLObject property) {
        {
            SubLObject value = com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_property_without_values(hl_module, property);
            SubLObject v_default = dictionary.dictionary_lookup_without_values($hl_module_property_defaults$.getGlobalValue(), property, UNPROVIDED);
            return makeBoolean(!value.equal(v_default));
        }
    }

    public static SubLObject hl_module_property_not_defaultP(final SubLObject hl_module, final SubLObject property) {
        final SubLObject value = inference_modules.hl_module_property_without_values(hl_module, property);
        final SubLObject v_default = dictionary_lookup_without_values(inference_modules.$hl_module_property_defaults$.getGlobalValue(), property, UNPROVIDED);
        return makeBoolean(!value.equal(v_default));
    }

    public static final SubLObject do_hl_modules_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt77);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject hl_module_var = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt77);
                    hl_module_var = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt77);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt77);
                            if (NIL == member(current_1, $list_alt78, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt77);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject name_var = $sym81$NAME_VAR;
                                return listS(DO_HASH_TABLE, list(name_var, hl_module_var, $list_alt83, $DONE, done), list(IGNORE, name_var), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_hl_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, inference_modules.$list86);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject hl_module_var = NIL;
        destructuring_bind_must_consp(current, datum, inference_modules.$list86);
        hl_module_var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, inference_modules.$list86);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, inference_modules.$list86);
            if (NIL == member(current_$1, inference_modules.$list87, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == inference_modules.$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, inference_modules.$list86);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject name_var = inference_modules.$sym90$NAME_VAR;
        return listS(DO_HASH_TABLE, list(name_var, hl_module_var, inference_modules.$list92, $DONE, done), list(IGNORE, name_var), append(body, NIL));
    }

    public static final SubLObject hl_module_store_alt() {
        return $hl_module_store$.getGlobalValue();
    }

    public static SubLObject hl_module_store() {
        return inference_modules.$hl_module_store$.getGlobalValue();
    }

    public static final SubLObject find_hl_module_by_name_alt(SubLObject name) {
        {
            SubLObject hl_module = gethash_without_values(name, $hl_module_store$.getGlobalValue(), UNPROVIDED);
            return hl_module;
        }
    }

    public static SubLObject find_hl_module_by_name(final SubLObject name) {
        final SubLObject hl_module = gethash_without_values(name, inference_modules.$hl_module_store$.getGlobalValue(), UNPROVIDED);
        return hl_module;
    }

    public static final SubLObject add_hl_module_alt(SubLObject hl_module) {
        {
            SubLObject name = com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_name(hl_module);
            sethash(name, $hl_module_store$.getGlobalValue(), hl_module);
        }
        return hl_module;
    }

    public static SubLObject add_hl_module(final SubLObject hl_module) {
        final SubLObject name = inference_modules.hl_module_name(hl_module);
        sethash(name, inference_modules.$hl_module_store$.getGlobalValue(), hl_module);
        return hl_module;
    }

    public static final SubLObject remove_hl_module_alt(SubLObject hl_module) {
        {
            SubLObject name = com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_name(hl_module);
            remhash(name, $hl_module_store$.getGlobalValue());
        }
        return hl_module;
    }

    public static SubLObject remove_hl_module(final SubLObject hl_module) {
        final SubLObject name = inference_modules.hl_module_name(hl_module);
        remhash(name, inference_modules.$hl_module_store$.getGlobalValue());
        return hl_module;
    }

    public static final SubLObject setup_module_alt(SubLObject name, SubLObject type, SubLObject plist) {
        {
            SubLObject new_plist = copy_list(plist);
            new_plist = putf(plist, $MODULE_TYPE, type);
            {
                SubLObject hl_module = com.cyc.cycjava.cycl.inference.harness.inference_modules.new_hl_module(name, new_plist);
                return hl_module;
            }
        }
    }

    public static SubLObject setup_module(final SubLObject name, final SubLObject type, final SubLObject plist) {
        SubLObject new_plist = copy_list(plist);
        new_plist = putf(plist, $MODULE_TYPE, type);
        final SubLObject hl_module = inference_modules.new_hl_module(name, new_plist);
        return hl_module;
    }

    public static final SubLObject default_cost_func_alt(SubLObject v_object) {
        if (v_object == UNPROVIDED) {
            v_object = NIL;
        }
        return ZERO_INTEGER;
    }

    public static SubLObject default_cost_func(SubLObject v_object) {
        if (v_object == UNPROVIDED) {
            v_object = NIL;
        }
        return ZERO_INTEGER;
    }

    public static final SubLObject default_expand_func_alt(SubLObject arg1, SubLObject arg2) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        return NIL;
    }

    public static SubLObject default_expand_func(SubLObject arg1, SubLObject arg2) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        return NIL;
    }

    public static final SubLObject hl_module_type_alt(SubLObject hl_module) {
        return com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_property_without_values(hl_module, $MODULE_TYPE);
    }

    public static SubLObject hl_module_type(final SubLObject hl_module) {
        return inference_modules.hl_module_property_without_values(hl_module, $MODULE_TYPE);
    }

    public static final SubLObject hl_module_subtypes_alt(SubLObject hl_module) {
        return com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_property_without_values(hl_module, $MODULE_SUBTYPE);
    }

    public static SubLObject hl_module_subtypes(final SubLObject hl_module) {
        return inference_modules.hl_module_property_without_values(hl_module, $MODULE_SUBTYPE);
    }

    public static final SubLObject abductive_hl_moduleP_alt(SubLObject hl_module) {
        return list_utilities.member_eqP($ABDUCTION, com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_subtypes(hl_module));
    }

    public static SubLObject abductive_hl_moduleP(final SubLObject hl_module) {
        return member_eqP($ABDUCTION, inference_modules.hl_module_subtypes(hl_module));
    }

    public static final SubLObject hl_module_universal_alt(SubLObject hl_module) {
        return com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_property_without_values(hl_module, $UNIVERSAL);
    }

    public static SubLObject hl_module_universal(final SubLObject hl_module) {
        return inference_modules.hl_module_property_without_values(hl_module, $UNIVERSAL);
    }

    public static final SubLObject hl_module_source_alt(SubLObject hl_module) {
        return com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_property_without_values(hl_module, $MODULE_SOURCE);
    }

    public static SubLObject hl_module_source(final SubLObject hl_module) {
        return inference_modules.hl_module_property_without_values(hl_module, $MODULE_SOURCE);
    }

    public static final SubLObject hl_module_sense_alt(SubLObject hl_module) {
        return com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_property_without_values(hl_module, $SENSE);
    }

    public static SubLObject hl_module_sense(final SubLObject hl_module) {
        return inference_modules.hl_module_property_without_values(hl_module, $SENSE);
    }

    public static final SubLObject hl_module_sense_relevant_p_alt(SubLObject hl_module, SubLObject sense) {
        {
            SubLObject module_sense = com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_sense(hl_module);
            return makeBoolean((NIL == module_sense) || (module_sense == sense));
        }
    }

    public static SubLObject hl_module_sense_relevant_p(final SubLObject hl_module, final SubLObject sense) {
        final SubLObject module_sense = inference_modules.hl_module_sense(hl_module);
        return makeBoolean((NIL == module_sense) || module_sense.eql(sense));
    }

    public static final SubLObject hl_module_required_pattern_alt(SubLObject hl_module) {
        return com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_property_without_values(hl_module, $REQUIRED_PATTERN);
    }

    public static SubLObject hl_module_required_pattern(final SubLObject hl_module) {
        return inference_modules.hl_module_property_without_values(hl_module, $REQUIRED_PATTERN);
    }

    public static final SubLObject hl_module_required_pattern_matched_p_alt(SubLObject hl_module, SubLObject asent) {
        {
            SubLObject pattern = com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_required_pattern(hl_module);
            return makeBoolean(($ANYTHING == pattern) || (NIL != formula_pattern_match.pattern_matches_formula_without_bindings(pattern, asent)));
        }
    }

    public static SubLObject hl_module_required_pattern_matched_p(final SubLObject hl_module, final SubLObject asent) {
        final SubLObject pattern = inference_modules.hl_module_required_pattern(hl_module);
        return makeBoolean(($ANYTHING == pattern) || (NIL != pattern_matches_formula_without_bindings(pattern, asent)));
    }

    public static final SubLObject hl_module_required_mt_alt(SubLObject hl_module) {
        return com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_property_without_values(hl_module, $REQUIRED_MT);
    }

    public static SubLObject hl_module_required_mt(final SubLObject hl_module) {
        return inference_modules.hl_module_property_without_values(hl_module, $REQUIRED_MT);
    }

    /**
     *
     *
     * @unknown a return value of NIL means that all mts are relevant to HL-MODULE
     */
    @LispMethod(comment = "@unknown a return value of NIL means that all mts are relevant to HL-MODULE")
    public static final SubLObject hl_module_required_mt_result_alt(SubLObject hl_module) {
        {
            SubLObject required_mt_prop = com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_required_mt(hl_module);
            if (NIL != required_mt_prop) {
                return com.cyc.cycjava.cycl.inference.harness.inference_modules.interpret_hl_module_mt_prop(required_mt_prop);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @unknown a return value of NIL means that all mts are relevant to HL-MODULE
     */
    @LispMethod(comment = "@unknown a return value of NIL means that all mts are relevant to HL-MODULE")
    public static SubLObject hl_module_required_mt_result(final SubLObject hl_module) {
        final SubLObject required_mt_prop = inference_modules.hl_module_required_mt(hl_module);
        if (NIL != required_mt_prop) {
            return inference_modules.interpret_hl_module_mt_prop(required_mt_prop);
        }
        return NIL;
    }

    public static final SubLObject interpret_hl_module_mt_prop_alt(SubLObject mt_prop) {
        if (NIL != hlmt.hlmt_p(mt_prop)) {
            return mt_prop;
        } else {
            if (mt_prop.isSymbol() && (NIL != boundp(mt_prop))) {
                return symbol_value(mt_prop);
            } else {
                return eval_in_api.possibly_cyc_api_eval(mt_prop);
            }
        }
    }

    public static SubLObject interpret_hl_module_mt_prop(final SubLObject mt_prop) {
        if (NIL != hlmt_p(mt_prop)) {
            return mt_prop;
        }
        if (mt_prop.isSymbol() && (NIL != boundp(mt_prop))) {
            return symbol_value(mt_prop);
        }
        return possibly_cyc_api_eval(mt_prop);
    }

    public static final SubLObject hl_module_required_mt_relevantP_alt(SubLObject hl_module) {
        {
            SubLObject required_mt = com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_required_mt_result(hl_module);
            return makeBoolean((NIL == required_mt) || (NIL != mt_relevance_macros.relevant_mtP(required_mt)));
        }
    }

    public static SubLObject hl_module_required_mt_relevantP(final SubLObject hl_module) {
        final SubLObject required_mt = inference_modules.hl_module_required_mt_result(hl_module);
        return makeBoolean((NIL == required_mt) || (NIL != relevant_mtP(required_mt)));
    }

    public static final SubLObject hl_module_required_func_alt(SubLObject hl_module) {
        return com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_property_without_values(hl_module, $REQUIRED);
    }

    public static SubLObject hl_module_required_func(final SubLObject hl_module) {
        return inference_modules.hl_module_property_without_values(hl_module, $REQUIRED);
    }

    public static SubLObject hl_module_required_func_p(final SubLObject hl_module, final SubLObject asent) {
        final SubLObject required_func = inference_modules.hl_module_required_func(hl_module);
        return makeBoolean((NIL == required_func) || (NIL != funcall(required_func, asent)));
    }

    public static final SubLObject hl_module_cost_pattern_alt(SubLObject hl_module) {
        return com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_property_without_values(hl_module, $COST_PATTERN);
    }

    public static SubLObject hl_module_cost_pattern(final SubLObject hl_module) {
        return inference_modules.hl_module_property_without_values(hl_module, $COST_PATTERN);
    }

    public static final SubLObject hl_module_cost_expression_alt(SubLObject hl_module) {
        return com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_property_without_values(hl_module, $COST_EXPRESSION);
    }

    public static SubLObject hl_module_cost_expression(final SubLObject hl_module) {
        return inference_modules.hl_module_property_without_values(hl_module, $COST_EXPRESSION);
    }

    public static final SubLObject hl_module_cost_func_alt(SubLObject hl_module) {
        return com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_property_without_values(hl_module, $COST);
    }

    public static SubLObject hl_module_cost_func(final SubLObject hl_module) {
        return inference_modules.hl_module_property_without_values(hl_module, $COST);
    }

    /**
     * Determines the estimated # of child nodes generated by HL-MODULE
     * when applied to OBJECT with sense SENSE
     */
    @LispMethod(comment = "Determines the estimated # of child nodes generated by HL-MODULE\r\nwhen applied to OBJECT with sense SENSE\nDetermines the estimated # of child nodes generated by HL-MODULE\nwhen applied to OBJECT with sense SENSE")
    public static final SubLObject hl_module_cost_alt(SubLObject hl_module, SubLObject v_object, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject cost = com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_cost_pattern_result(hl_module, v_object);
            if (!cost.isNumber()) {
                cost = com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_cost_expression_result(hl_module);
                if (!cost.isNumber()) {
                    cost = com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_cost_function_result(hl_module, v_object);
                }
            }
            return cost;
        }
    }

    /**
     * Determines the estimated # of child nodes generated by HL-MODULE
     * when applied to OBJECT with sense SENSE
     */
    @LispMethod(comment = "Determines the estimated # of child nodes generated by HL-MODULE\r\nwhen applied to OBJECT with sense SENSE\nDetermines the estimated # of child nodes generated by HL-MODULE\nwhen applied to OBJECT with sense SENSE")
    public static SubLObject hl_module_cost(final SubLObject hl_module, final SubLObject v_object, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject cost = inference_modules.hl_module_cost_pattern_result(hl_module, v_object);
        if (!cost.isNumber()) {
            cost = inference_modules.hl_module_cost_expression_result(hl_module);
            if (!cost.isNumber()) {
                cost = inference_modules.hl_module_cost_function_result(hl_module, v_object);
            }
        }
        return cost;
    }

    public static final SubLObject hl_module_asent_cost_alt(SubLObject hl_module, SubLObject asent) {
        return com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_cost(hl_module, asent, UNPROVIDED);
    }

    public static SubLObject hl_module_asent_cost(final SubLObject hl_module, final SubLObject asent) {
        return inference_modules.hl_module_cost(hl_module, asent, UNPROVIDED);
    }

    public static final SubLObject hl_module_clause_cost_alt(SubLObject hl_module, SubLObject contextualized_dnf_clause) {
        return com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_cost(hl_module, contextualized_dnf_clause, UNPROVIDED);
    }

    public static SubLObject hl_module_clause_cost(final SubLObject hl_module, final SubLObject contextualized_dnf_clause) {
        return inference_modules.hl_module_cost(hl_module, contextualized_dnf_clause, UNPROVIDED);
    }

    /**
     * Determines the estimated # of child nodes generated by HL-MODULE
     * when applied to FORMULA based on the :cost-pattern
     * property of HL-MODULE.
     */
    @LispMethod(comment = "Determines the estimated # of child nodes generated by HL-MODULE\r\nwhen applied to FORMULA based on the :cost-pattern\r\nproperty of HL-MODULE.\nDetermines the estimated # of child nodes generated by HL-MODULE\nwhen applied to FORMULA based on the :cost-pattern\nproperty of HL-MODULE.")
    public static final SubLObject hl_module_cost_pattern_result_alt(SubLObject hl_module, SubLObject formula) {
        {
            SubLObject cost_pattern = com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_cost_pattern(hl_module);
            if (NIL != cost_pattern) {
                return formula_pattern_match.pattern_transform_formula(cost_pattern, formula, UNPROVIDED);
            } else {
                return NIL;
            }
        }
    }

    /**
     * Determines the estimated # of child nodes generated by HL-MODULE
     * when applied to FORMULA based on the :cost-pattern
     * property of HL-MODULE.
     */
    @LispMethod(comment = "Determines the estimated # of child nodes generated by HL-MODULE\r\nwhen applied to FORMULA based on the :cost-pattern\r\nproperty of HL-MODULE.\nDetermines the estimated # of child nodes generated by HL-MODULE\nwhen applied to FORMULA based on the :cost-pattern\nproperty of HL-MODULE.")
    public static SubLObject hl_module_cost_pattern_result(final SubLObject hl_module, final SubLObject formula) {
        final SubLObject cost_pattern = inference_modules.hl_module_cost_pattern(hl_module);
        if (NIL != cost_pattern) {
            return pattern_transform_formula(cost_pattern, formula, UNPROVIDED);
        }
        return NIL;
    }

    /**
     * Determines the estimated # of child nodes generated by HL-MODULE
     * based on the :cost-expression property of HL-MODULE.
     */
    @LispMethod(comment = "Determines the estimated # of child nodes generated by HL-MODULE\r\nbased on the :cost-expression property of HL-MODULE.\nDetermines the estimated # of child nodes generated by HL-MODULE\nbased on the :cost-expression property of HL-MODULE.")
    public static final SubLObject hl_module_cost_expression_result_alt(SubLObject hl_module) {
        {
            SubLObject cost_expression = com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_cost_expression(hl_module);
            if (NIL == cost_expression) {
                return NIL;
            }
            if (cost_expression.isNumber()) {
                return cost_expression;
            } else {
                if (cost_expression.isSymbol() && (NIL != boundp(cost_expression))) {
                    return symbol_value(cost_expression);
                } else {
                    return eval_in_api.possibly_cyc_api_eval(cost_expression);
                }
            }
        }
    }

    /**
     * Determines the estimated # of child nodes generated by HL-MODULE
     * based on the :cost-expression property of HL-MODULE.
     */
    @LispMethod(comment = "Determines the estimated # of child nodes generated by HL-MODULE\r\nbased on the :cost-expression property of HL-MODULE.\nDetermines the estimated # of child nodes generated by HL-MODULE\nbased on the :cost-expression property of HL-MODULE.")
    public static SubLObject hl_module_cost_expression_result(final SubLObject hl_module) {
        final SubLObject cost_expression = inference_modules.hl_module_cost_expression(hl_module);
        if (NIL == cost_expression) {
            return NIL;
        }
        if (cost_expression.isNumber()) {
            return cost_expression;
        }
        if (cost_expression.isSymbol() && (NIL != boundp(cost_expression))) {
            return symbol_value(cost_expression);
        }
        return possibly_cyc_api_eval(cost_expression);
    }

    /**
     * Determines the estimated # of child nodes generated by HL-MODULE
     * when applied to OBJECT based on the :cost property of HL-MODULE.
     */
    @LispMethod(comment = "Determines the estimated # of child nodes generated by HL-MODULE\r\nwhen applied to OBJECT based on the :cost property of HL-MODULE.\nDetermines the estimated # of child nodes generated by HL-MODULE\nwhen applied to OBJECT based on the :cost property of HL-MODULE.")
    public static final SubLObject hl_module_cost_function_result_alt(SubLObject hl_module, SubLObject v_object) {
        {
            SubLObject cost_func = com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_cost_func(hl_module);
            if (NIL != eval_in_api.possibly_cyc_api_function_spec_p(cost_func)) {
                {
                    SubLObject cost = eval_in_api.possibly_cyc_api_funcall_1(cost_func, v_object);
                    return cost;
                }
            }
        }
        return NIL;
    }

    /**
     * Determines the estimated # of child nodes generated by HL-MODULE
     * when applied to OBJECT based on the :cost property of HL-MODULE.
     */
    @LispMethod(comment = "Determines the estimated # of child nodes generated by HL-MODULE\r\nwhen applied to OBJECT based on the :cost property of HL-MODULE.\nDetermines the estimated # of child nodes generated by HL-MODULE\nwhen applied to OBJECT based on the :cost property of HL-MODULE.")
    public static SubLObject hl_module_cost_function_result(final SubLObject hl_module, final SubLObject v_object) {
        final SubLObject cost_func = inference_modules.hl_module_cost_func(hl_module);
        if (NIL != possibly_cyc_api_function_spec_p(cost_func)) {
            final SubLObject cost = possibly_cyc_api_funcall_1(cost_func, v_object);
            return cost;
        }
        return NIL;
    }

    /**
     * Determines the estimated # of child nodes generated by HL-MODULE
     * when applied to ASENT based on the :cost
     * property of HL-MODULE.
     */
    @LispMethod(comment = "Determines the estimated # of child nodes generated by HL-MODULE\r\nwhen applied to ASENT based on the :cost\r\nproperty of HL-MODULE.\nDetermines the estimated # of child nodes generated by HL-MODULE\nwhen applied to ASENT based on the :cost\nproperty of HL-MODULE.")
    public static final SubLObject hl_module_asent_cost_function_result_alt(SubLObject hl_module, SubLObject asent) {
        return com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_cost_function_result(hl_module, asent);
    }

    /**
     * Determines the estimated # of child nodes generated by HL-MODULE
     * when applied to ASENT based on the :cost
     * property of HL-MODULE.
     */
    @LispMethod(comment = "Determines the estimated # of child nodes generated by HL-MODULE\r\nwhen applied to ASENT based on the :cost\r\nproperty of HL-MODULE.\nDetermines the estimated # of child nodes generated by HL-MODULE\nwhen applied to ASENT based on the :cost\nproperty of HL-MODULE.")
    public static SubLObject hl_module_asent_cost_function_result(final SubLObject hl_module, final SubLObject asent) {
        return inference_modules.hl_module_cost_function_result(hl_module, asent);
    }

    /**
     * Determines the estimated # of child nodes generated by HL-MODULE
     * when applied to CONTEXTUALIZED-DNF-CLAUSE, based on the :cost
     * property of HL-MODULE.
     */
    @LispMethod(comment = "Determines the estimated # of child nodes generated by HL-MODULE\r\nwhen applied to CONTEXTUALIZED-DNF-CLAUSE, based on the :cost\r\nproperty of HL-MODULE.\nDetermines the estimated # of child nodes generated by HL-MODULE\nwhen applied to CONTEXTUALIZED-DNF-CLAUSE, based on the :cost\nproperty of HL-MODULE.")
    public static final SubLObject hl_module_clause_cost_function_result_alt(SubLObject hl_module, SubLObject contextualized_dnf_clause) {
        return com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_cost_function_result(hl_module, contextualized_dnf_clause);
    }

    /**
     * Determines the estimated # of child nodes generated by HL-MODULE
     * when applied to CONTEXTUALIZED-DNF-CLAUSE, based on the :cost
     * property of HL-MODULE.
     */
    @LispMethod(comment = "Determines the estimated # of child nodes generated by HL-MODULE\r\nwhen applied to CONTEXTUALIZED-DNF-CLAUSE, based on the :cost\r\nproperty of HL-MODULE.\nDetermines the estimated # of child nodes generated by HL-MODULE\nwhen applied to CONTEXTUALIZED-DNF-CLAUSE, based on the :cost\nproperty of HL-MODULE.")
    public static SubLObject hl_module_clause_cost_function_result(final SubLObject hl_module, final SubLObject contextualized_dnf_clause) {
        return inference_modules.hl_module_cost_function_result(hl_module, contextualized_dnf_clause);
    }

    /**
     *
     *
     * @return boolean; whether HL-MODULE is a check module which evaluates
    to a boolean.  If false, it is an HL module which produces (some or no) bindings.
     */
    @LispMethod(comment = "@return boolean; whether HL-MODULE is a check module which evaluates\r\nto a boolean.  If false, it is an HL module which produces (some or no) bindings.")
    public static final SubLObject hl_module_is_checkP_alt(SubLObject hl_module) {
        {
            SubLObject check = com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_property_without_values(hl_module, $CHECK);
            if (check == $UNKNOWN) {
                return com.cyc.cycjava.cycl.inference.harness.inference_modules.guess_hl_module_is_checkP(hl_module);
            } else {
                return list_utilities.sublisp_boolean(check);
            }
        }
    }

    /**
     *
     *
     * @return boolean; whether HL-MODULE is a check module which evaluates
    to a boolean.  If false, it is an HL module which produces (some or no) bindings.
     */
    @LispMethod(comment = "@return boolean; whether HL-MODULE is a check module which evaluates\r\nto a boolean.  If false, it is an HL module which produces (some or no) bindings.")
    public static SubLObject hl_module_is_checkP(final SubLObject hl_module) {
        final SubLObject check = inference_modules.hl_module_property_without_values(hl_module, $CHECK);
        if (check == $UNKNOWN) {
            return inference_modules.guess_hl_module_is_checkP(hl_module);
        }
        return sublisp_boolean(check);
    }

    public static final SubLObject guess_hl_module_is_checkP_alt(SubLObject hl_module) {
        {
            SubLObject required_pattern = com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_required_pattern(hl_module);
            if (NIL != cycl_utilities.expression_find($NOT_FULLY_BOUND, required_pattern, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                return NIL;
            } else {
                {
                    SubLObject name = string_utilities.str(com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_name(hl_module));
                    SubLObject checkP = string_utilities.substringP($$$check, name, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    return checkP;
                }
            }
        }
    }

    public static SubLObject guess_hl_module_is_checkP(final SubLObject hl_module) {
        final SubLObject required_pattern = inference_modules.hl_module_required_pattern(hl_module);
        if (NIL != expression_find(inference_modules.$NOT_FULLY_BOUND, required_pattern, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        final SubLObject name = str(inference_modules.hl_module_name(hl_module));
        final SubLObject checkP = substringP(inference_modules.$$$check, name, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return checkP;
    }

    public static final SubLObject hl_module_rule_select_func_alt(SubLObject hl_module) {
        return com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_property_without_values(hl_module, $RULE_SELECT);
    }

    public static SubLObject hl_module_rule_select_func(final SubLObject hl_module) {
        return inference_modules.hl_module_property_without_values(hl_module, $RULE_SELECT);
    }

    public static final SubLObject hl_module_rule_filter_func_alt(SubLObject hl_module) {
        return com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_property_without_values(hl_module, $RULE_FILTER);
    }

    public static SubLObject hl_module_rule_filter_func(final SubLObject hl_module) {
        return inference_modules.hl_module_property_without_values(hl_module, $RULE_FILTER);
    }

    public static final SubLObject hl_module_expand_func_alt(SubLObject hl_module) {
        inference_analysis.cinc_module_expand_count(hl_module);
        {
            SubLObject expand = com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_property_without_values(hl_module, $EXPAND);
            if ($DEFAULT == expand) {
                return com.cyc.cycjava.cycl.inference.harness.inference_modules.default_expand_func_for_hl_module(hl_module);
            } else {
                return expand;
            }
        }
    }

    public static SubLObject hl_module_expand_func(final SubLObject hl_module) {
        inference_analysis.cinc_module_expand_count(hl_module);
        final SubLObject expand = inference_modules.hl_module_property_without_values(hl_module, $EXPAND);
        if ($DEFAULT == expand) {
            return inference_modules.default_expand_func_for_hl_module(hl_module);
        }
        return expand;
    }

    public static final SubLObject default_expand_func_for_hl_module_alt(SubLObject hl_module) {
        if ($REMOVAL == com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_type(hl_module)) {
            if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_is_checkP(hl_module)) {
                return INFERENCE_REMOVE_CHECK_DEFAULT;
            } else {
                return INFERENCE_REMOVE_UNIFY_DEFAULT;
            }
        } else {
            return DEFAULT_EXPAND_FUNC;
        }
    }

    public static SubLObject default_expand_func_for_hl_module(final SubLObject hl_module) {
        if ($REMOVAL != inference_modules.hl_module_type(hl_module)) {
            return inference_modules.DEFAULT_EXPAND_FUNC;
        }
        if (NIL != inference_modules.hl_module_is_checkP(hl_module)) {
            return inference_modules.INFERENCE_REMOVE_CHECK_DEFAULT;
        }
        return inference_modules.INFERENCE_REMOVE_UNIFY_DEFAULT;
    }

    public static final SubLObject hl_module_expand_pattern_alt(SubLObject hl_module) {
        return com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_property_without_values(hl_module, $EXPAND_PATTERN);
    }

    public static SubLObject hl_module_expand_pattern(final SubLObject hl_module) {
        return inference_modules.hl_module_property_without_values(hl_module, $EXPAND_PATTERN);
    }

    public static final SubLObject hl_module_expand_iterative_pattern_alt(SubLObject hl_module) {
        return com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_property_without_values(hl_module, $EXPAND_ITERATIVE_PATTERN);
    }

    public static SubLObject hl_module_expand_iterative_pattern(final SubLObject hl_module) {
        return inference_modules.hl_module_property_without_values(hl_module, inference_modules.$EXPAND_ITERATIVE_PATTERN);
    }

    public static final SubLObject hl_module_predicate_alt(SubLObject hl_module) {
        return com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_property_without_values(hl_module, $PREDICATE);
    }

    public static SubLObject hl_module_predicate(final SubLObject hl_module) {
        return inference_modules.hl_module_property_without_values(hl_module, $PREDICATE);
    }

    public static final SubLObject hl_module_predicate_relevant_p_alt(SubLObject hl_module, SubLObject predicate) {
        {
            SubLObject hl_module_predicate = com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_predicate(hl_module);
            if (NIL != hl_module_predicate) {
                return eq(hl_module_predicate, predicate);
            }
        }
        {
            SubLObject hl_module_any_preds = com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_any_predicates(hl_module);
            if (NIL != hl_module_any_preds) {
                return memberP(predicate, hl_module_any_preds, PATTERN_MATCHES_FORMULA, UNPROVIDED);
            }
        }
        return T;
    }

    public static SubLObject hl_module_predicate_relevant_p(final SubLObject hl_module, final SubLObject predicate) {
        final SubLObject hl_module_predicate = inference_modules.hl_module_predicate(hl_module);
        if (NIL != hl_module_predicate) {
            return eql(hl_module_predicate, predicate);
        }
        final SubLObject hl_module_any_preds = inference_modules.hl_module_any_predicates(hl_module);
        if (NIL != hl_module_any_preds) {
            return subl_promotions.memberP(predicate, hl_module_any_preds, inference_modules.PATTERN_MATCHES_FORMULA, UNPROVIDED);
        }
        return T;
    }

    public static final SubLObject hl_module_arity_alt(SubLObject hl_module) {
        return com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_property_without_values(hl_module, $ARITY);
    }

    public static SubLObject hl_module_arity(final SubLObject hl_module) {
        return inference_modules.hl_module_property_without_values(hl_module, $ARITY);
    }

    public static final SubLObject hl_module_arity_relevant_p_alt(SubLObject hl_module, SubLObject asent) {
        {
            SubLObject hl_module_arity = com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_arity(hl_module);
            return makeBoolean((NIL == hl_module_arity) || ((NIL != el_formula_without_sequence_termP(asent)) && hl_module_arity.numE(length(asent.rest()))));
        }
    }

    public static SubLObject hl_module_arity_relevant_p(final SubLObject hl_module, final SubLObject asent) {
        final SubLObject hl_module_arity = inference_modules.hl_module_arity(hl_module);
        return makeBoolean((NIL == hl_module_arity) || ((NIL != el_formula_without_sequence_termP(asent)) && hl_module_arity.numE(length(asent.rest()))));
    }

    public static final SubLObject hl_module_exclusive_func_alt(SubLObject hl_module) {
        return com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_property_without_values(hl_module, $EXCLUSIVE);
    }

    public static SubLObject hl_module_exclusive_func(final SubLObject hl_module) {
        return inference_modules.hl_module_property_without_values(hl_module, $EXCLUSIVE);
    }

    public static final SubLObject hl_module_supplants_info_alt(SubLObject hl_module) {
        return com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_property_without_values(hl_module, $SUPPLANTS);
    }

    public static SubLObject hl_module_supplants_info(final SubLObject hl_module) {
        return inference_modules.hl_module_property_without_values(hl_module, $SUPPLANTS);
    }

    public static final SubLObject hl_module_direction_alt(SubLObject hl_module) {
        return com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_property_without_values(hl_module, $DIRECTION);
    }

    public static SubLObject hl_module_direction(final SubLObject hl_module) {
        return inference_modules.hl_module_property_without_values(hl_module, $DIRECTION);
    }

    public static final SubLObject hl_module_direction_relevantP_alt(SubLObject hl_module) {
        if (NIL == kb_control_vars.within_forward_inferenceP()) {
            return T;
        }
        {
            SubLObject direction = com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_direction(hl_module);
            return eq(direction, $FORWARD);
        }
    }

    public static SubLObject hl_module_direction_relevantP(final SubLObject hl_module) {
        if (NIL == within_forward_inferenceP()) {
            return T;
        }
        final SubLObject direction = inference_modules.hl_module_direction(hl_module);
        return eq(direction, $FORWARD);
    }

    public static final SubLObject hl_module_input_extract_pattern_alt(SubLObject hl_module) {
        return com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_property_without_values(hl_module, $INPUT_EXTRACT_PATTERN);
    }

    public static SubLObject hl_module_input_extract_pattern(final SubLObject hl_module) {
        return inference_modules.hl_module_property_without_values(hl_module, inference_modules.$INPUT_EXTRACT_PATTERN);
    }

    public static final SubLObject hl_module_input_verify_pattern_alt(SubLObject hl_module) {
        return com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_property_without_values(hl_module, $INPUT_VERIFY_PATTERN);
    }

    public static SubLObject hl_module_input_verify_pattern(final SubLObject hl_module) {
        return inference_modules.hl_module_property_without_values(hl_module, inference_modules.$INPUT_VERIFY_PATTERN);
    }

    public static final SubLObject hl_module_input_encode_pattern_alt(SubLObject hl_module) {
        return com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_property_without_values(hl_module, $INPUT_ENCODE_PATTERN);
    }

    public static SubLObject hl_module_input_encode_pattern(final SubLObject hl_module) {
        return inference_modules.hl_module_property_without_values(hl_module, inference_modules.$INPUT_ENCODE_PATTERN);
    }

    public static final SubLObject hl_module_output_check_pattern_alt(SubLObject hl_module) {
        return com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_property_without_values(hl_module, $OUTPUT_CHECK_PATTERN);
    }

    public static SubLObject hl_module_output_check_pattern(final SubLObject hl_module) {
        return inference_modules.hl_module_property_without_values(hl_module, inference_modules.$OUTPUT_CHECK_PATTERN);
    }

    public static final SubLObject hl_module_output_generate_pattern_alt(SubLObject hl_module) {
        return com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_property_without_values(hl_module, $OUTPUT_GENERATE_PATTERN);
    }

    public static SubLObject hl_module_output_generate_pattern(final SubLObject hl_module) {
        return inference_modules.hl_module_property_without_values(hl_module, inference_modules.$OUTPUT_GENERATE_PATTERN);
    }

    public static final SubLObject hl_module_output_decode_pattern_alt(SubLObject hl_module) {
        return com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_property_without_values(hl_module, $OUTPUT_DECODE_PATTERN);
    }

    public static SubLObject hl_module_output_decode_pattern(final SubLObject hl_module) {
        return inference_modules.hl_module_property_without_values(hl_module, inference_modules.$OUTPUT_DECODE_PATTERN);
    }

    public static final SubLObject hl_module_output_verify_pattern_alt(SubLObject hl_module) {
        return com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_property_without_values(hl_module, $OUTPUT_VERIFY_PATTERN);
    }

    public static SubLObject hl_module_output_verify_pattern(final SubLObject hl_module) {
        return inference_modules.hl_module_property_without_values(hl_module, inference_modules.$OUTPUT_VERIFY_PATTERN);
    }

    public static final SubLObject hl_module_output_construct_pattern_alt(SubLObject hl_module) {
        return com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_property_without_values(hl_module, $OUTPUT_CONSTRUCT_PATTERN);
    }

    public static SubLObject hl_module_output_construct_pattern(final SubLObject hl_module) {
        return inference_modules.hl_module_property_without_values(hl_module, inference_modules.$OUTPUT_CONSTRUCT_PATTERN);
    }

    public static final SubLObject hl_module_support_pattern_alt(SubLObject hl_module) {
        return com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_property_without_values(hl_module, $SUPPORT_PATTERN);
    }

    public static SubLObject hl_module_support_pattern(final SubLObject hl_module) {
        return inference_modules.hl_module_property_without_values(hl_module, $SUPPORT_PATTERN);
    }

    public static final SubLObject hl_module_support_func_alt(SubLObject hl_module) {
        return com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_property_without_values(hl_module, $SUPPORT);
    }

    public static SubLObject hl_module_support_func(final SubLObject hl_module) {
        return inference_modules.hl_module_property_without_values(hl_module, $SUPPORT);
    }

    public static final SubLObject hl_module_support_module_alt(SubLObject hl_module) {
        return com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_property_without_values(hl_module, $SUPPORT_MODULE);
    }

    public static SubLObject hl_module_support_module(final SubLObject hl_module) {
        return inference_modules.hl_module_property_without_values(hl_module, $SUPPORT_MODULE);
    }

    public static final SubLObject hl_module_support_mt_alt(SubLObject hl_module) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject support_mt = com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_property(hl_module, $SUPPORT_MT);
                SubLObject default_inferredP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != default_inferredP) {
                    support_mt = mt_relevance_macros.current_mt_relevance_mt();
                }
                return support_mt;
            }
        }
    }

    public static SubLObject hl_module_support_mt(final SubLObject hl_module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject support_mt = inference_modules.hl_module_property(hl_module, $SUPPORT_MT);
        final SubLObject default_inferredP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != default_inferredP) {
            support_mt = current_mt_relevance_mt();
        }
        return support_mt;
    }

    public static final SubLObject hl_module_support_mt_result_alt(SubLObject hl_module) {
        {
            SubLObject support_mt_prop = com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_support_mt(hl_module);
            return com.cyc.cycjava.cycl.inference.harness.inference_modules.interpret_hl_module_mt_prop(support_mt_prop);
        }
    }

    public static SubLObject hl_module_support_mt_result(final SubLObject hl_module) {
        final SubLObject support_mt_prop = inference_modules.hl_module_support_mt(hl_module);
        return inference_modules.interpret_hl_module_mt_prop(support_mt_prop);
    }

    public static final SubLObject hl_module_support_strength_alt(SubLObject hl_module) {
        return com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_property_without_values(hl_module, $SUPPORT_STRENGTH);
    }

    public static SubLObject hl_module_support_strength(final SubLObject hl_module) {
        return inference_modules.hl_module_property_without_values(hl_module, $SUPPORT_STRENGTH);
    }

    public static final SubLObject hl_module_every_predicates_alt(SubLObject hl_module) {
        return com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_property_without_values(hl_module, $EVERY_PREDICATES);
    }

    public static SubLObject hl_module_every_predicates(final SubLObject hl_module) {
        return inference_modules.hl_module_property_without_values(hl_module, $EVERY_PREDICATES);
    }

    public static final SubLObject hl_module_applicability_func_alt(SubLObject hl_module) {
        return com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_property_without_values(hl_module, $APPLICABILITY);
    }

    public static SubLObject hl_module_applicability_func(final SubLObject hl_module) {
        return inference_modules.hl_module_property_without_values(hl_module, $APPLICABILITY);
    }

    public static final SubLObject hl_module_applicability_pattern_alt(SubLObject hl_module) {
        return com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_property_without_values(hl_module, $APPLICABILITY_PATTERN);
    }

    public static SubLObject hl_module_applicability_pattern(final SubLObject hl_module) {
        return inference_modules.hl_module_property_without_values(hl_module, $APPLICABILITY_PATTERN);
    }

    public static final SubLObject hl_module_any_predicates_alt(SubLObject hl_module) {
        return com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_property_without_values(hl_module, $ANY_PREDICATES);
    }

    public static SubLObject hl_module_any_predicates(final SubLObject hl_module) {
        return inference_modules.hl_module_property_without_values(hl_module, $ANY_PREDICATES);
    }

    public static final SubLObject hl_module_documentation_string_alt(SubLObject hl_module) {
        return com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_property_without_values(hl_module, $DOCUMENTATION);
    }

    public static SubLObject hl_module_documentation_string(final SubLObject hl_module) {
        return inference_modules.hl_module_property_without_values(hl_module, $DOCUMENTATION);
    }

    public static final SubLObject hl_module_example_string_alt(SubLObject hl_module) {
        return com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_property_without_values(hl_module, $EXAMPLE);
    }

    public static SubLObject hl_module_example_string(final SubLObject hl_module) {
        return inference_modules.hl_module_property_without_values(hl_module, $EXAMPLE);
    }

    public static final SubLObject hl_module_completeP_alt(SubLObject hl_module, SubLObject asent) {
        return eq($COMPLETE, com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_completeness(hl_module, asent, UNPROVIDED));
    }

    public static SubLObject hl_module_completeP(final SubLObject hl_module, final SubLObject asent) {
        return eq($COMPLETE, inference_modules.hl_module_completeness(hl_module, asent, UNPROVIDED));
    }

    public static final SubLObject hl_module_incompleteP_alt(SubLObject hl_module, SubLObject asent) {
        return eq($INCOMPLETE, com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_completeness(hl_module, asent, UNPROVIDED));
    }

    public static SubLObject hl_module_incompleteP(final SubLObject hl_module, final SubLObject asent) {
        return eq($INCOMPLETE, inference_modules.hl_module_completeness(hl_module, asent, UNPROVIDED));
    }

    public static final SubLObject hl_module_completeness_alt(SubLObject hl_module, SubLObject asent, SubLObject default_completeness) {
        if (default_completeness == UNPROVIDED) {
            default_completeness = $INCOMPLETE;
        }
        {
            SubLObject completeness = com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_property_without_values(hl_module, $COMPLETENESS);
            if (NIL != completeness) {
                return completeness;
            }
        }
        {
            SubLObject pattern = com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_property_without_values(hl_module, $COMPLETE_PATTERN);
            if ((NIL != pattern) && (NIL != formula_pattern_match.pattern_matches_formula_without_bindings(pattern, asent))) {
                return $COMPLETE;
            }
        }
        {
            SubLObject pattern = com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_property_without_values(hl_module, $COMPLETENESS_PATTERN);
            if (NIL != pattern) {
                {
                    SubLObject completeness = formula_pattern_match.pattern_transform_formula(pattern, asent, UNPROVIDED);
                    if (NIL != completeness) {
                        return completeness;
                    }
                }
            }
        }
        return default_completeness;
    }

    public static SubLObject hl_module_completeness(final SubLObject hl_module, final SubLObject asent, SubLObject default_completeness) {
        if (default_completeness == UNPROVIDED) {
            default_completeness = $INCOMPLETE;
        }
        final SubLObject completeness = inference_modules.hl_module_property_without_values(hl_module, $COMPLETENESS);
        if (NIL != completeness) {
            return completeness;
        }
        SubLObject pattern = inference_modules.hl_module_property_without_values(hl_module, $COMPLETE_PATTERN);
        if ((NIL != pattern) && (NIL != pattern_matches_formula_without_bindings(pattern, asent))) {
            return $COMPLETE;
        }
        pattern = inference_modules.hl_module_property_without_values(hl_module, $COMPLETENESS_PATTERN);
        if (NIL != pattern) {
            final SubLObject completeness2 = pattern_transform_formula(pattern, asent, UNPROVIDED);
            if (NIL != completeness2) {
                return completeness2;
            }
        }
        return default_completeness;
    }

    public static final SubLObject hl_module_clause_completeness_alt(SubLObject hl_module, SubLObject clause) {
        {
            SubLObject completeness = com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_property_without_values(hl_module, $COMPLETENESS);
            if (NIL != completeness) {
                return completeness;
            }
        }
        {
            SubLObject pattern = com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_property_without_values(hl_module, $COMPLETE_PATTERN);
            if ((NIL != pattern) && (NIL != formula_pattern_match.pattern_matches_formula_without_bindings(pattern, clause))) {
                return $COMPLETE;
            }
        }
        {
            SubLObject pattern = com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_property_without_values(hl_module, $COMPLETENESS_PATTERN);
            if (NIL != pattern) {
                {
                    SubLObject completeness = formula_pattern_match.pattern_transform_formula(pattern, clause, UNPROVIDED);
                    if (NIL != completeness) {
                        return completeness;
                    }
                }
            }
        }
        return $INCOMPLETE;
    }

    public static SubLObject hl_module_clause_completeness(final SubLObject hl_module, final SubLObject clause) {
        final SubLObject completeness = inference_modules.hl_module_property_without_values(hl_module, $COMPLETENESS);
        if (NIL != completeness) {
            return completeness;
        }
        SubLObject pattern = inference_modules.hl_module_property_without_values(hl_module, $COMPLETE_PATTERN);
        if ((NIL != pattern) && (NIL != pattern_matches_formula_without_bindings(pattern, clause))) {
            return $COMPLETE;
        }
        pattern = inference_modules.hl_module_property_without_values(hl_module, $COMPLETENESS_PATTERN);
        if (NIL != pattern) {
            final SubLObject completeness2 = pattern_transform_formula(pattern, clause, UNPROVIDED);
            if (NIL != completeness2) {
                return completeness2;
            }
        }
        return $INCOMPLETE;
    }

    public static final SubLObject hl_module_externalP_alt(SubLObject hl_module) {
        return com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_property_without_values(hl_module, $EXTERNAL);
    }

    public static SubLObject hl_module_externalP(final SubLObject hl_module) {
        return inference_modules.hl_module_property_without_values(hl_module, $EXTERNAL);
    }

    public static final SubLObject hl_module_activeP_alt(SubLObject hl_module, SubLObject inactive_hl_modules) {
        if (inactive_hl_modules == UNPROVIDED) {
            inactive_hl_modules = NIL;
        }
        return makeBoolean(NIL == memberP(hl_module, inactive_hl_modules, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject hl_module_activeP(final SubLObject hl_module, SubLObject inactive_hl_modules) {
        if (inactive_hl_modules == UNPROVIDED) {
            inactive_hl_modules = NIL;
        }
        return makeBoolean(NIL == subl_promotions.memberP(hl_module, inactive_hl_modules, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject hl_module_implementation_methods(SubLObject hl_module) {
        if (hl_module.isSymbol()) {
            hl_module = inference_modules.find_hl_module_by_name(hl_module);
        }
        assert NIL != inference_modules.hl_module_p(hl_module) : "! inference_modules.hl_module_p(hl_module) " + ("inference_modules.hl_module_p(hl_module) " + "CommonSymbols.NIL != inference_modules.hl_module_p(hl_module) ") + hl_module;
        final SubLObject plist = inference_modules.hl_module_plist(hl_module);
        SubLObject all_methods = NIL;
        SubLObject remainder;
        SubLObject key;
        SubLObject value;
        SubLObject cdolist_list_var;
        SubLObject v_methods;
        SubLObject method;
        SubLObject item_var;
        for (remainder = NIL, remainder = plist; NIL != remainder; remainder = cddr(remainder)) {
            key = remainder.first();
            value = cadr(remainder);
            v_methods = cdolist_list_var = tree_gather(value, symbol_function(inference_modules.FUNCTION_SYMBOL_P), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            method = NIL;
            method = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == member_eqP(method, inference_modules.$list143)) {
                    item_var = method;
                    if (NIL == member(item_var, all_methods, symbol_function(EQL), symbol_function(IDENTITY))) {
                        all_methods = cons(item_var, all_methods);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                method = cdolist_list_var.first();
            } 
        }
        return Sort.sort(all_methods, symbol_function(STRING_LESSP), symbol_function(SYMBOL_NAME));
    }

    public static final SubLObject do_removal_modules_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt134);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject hl_module = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt134);
                    hl_module = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_2 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt134);
                            current_2 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt134);
                            if (NIL == member(current_2, $list_alt78, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_2 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt134);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(DO_SET, list(hl_module, $list_alt136, $DONE, done), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_removal_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, inference_modules.$list147);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject hl_module = NIL;
        destructuring_bind_must_consp(current, datum, inference_modules.$list147);
        hl_module = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, inference_modules.$list147);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, inference_modules.$list147);
            if (NIL == member(current_$2, inference_modules.$list87, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == inference_modules.$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, inference_modules.$list147);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_SET, list(hl_module, inference_modules.$list149, $DONE, done), append(body, NIL));
    }

    public static final SubLObject removal_modules_alt() {
        return $removal_modules$.getGlobalValue();
    }

    public static SubLObject removal_modules() {
        return inference_modules.$removal_modules$.getGlobalValue();
    }

    public static final SubLObject removal_module_p_alt(SubLObject v_object) {
        return set.set_memberP(v_object, $removal_modules$.getGlobalValue());
    }

    public static SubLObject removal_module_p(final SubLObject v_object) {
        return set_memberP(v_object, inference_modules.$removal_modules$.getGlobalValue());
    }

    public static final SubLObject removal_module_count_alt() {
        return set.set_size($removal_modules$.getGlobalValue());
    }

    public static SubLObject removal_module_count() {
        return set_size(inference_modules.$removal_modules$.getGlobalValue());
    }

    public static final SubLObject some_external_removal_modulesP_alt() {
        return list_utilities.sublisp_boolean($removal_modules_external$.getGlobalValue());
    }

    public static SubLObject some_external_removal_modulesP() {
        return sublisp_boolean(inference_modules.$removal_modules_external$.getGlobalValue());
    }

    public static final SubLObject removal_modules_external_alt() {
        return $removal_modules_external$.getGlobalValue();
    }

    public static SubLObject removal_modules_external() {
        return inference_modules.$removal_modules_external$.getGlobalValue();
    }

    public static final SubLObject generic_removal_module_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.inference.harness.inference_modules.removal_module_p(v_object)) && (NIL != list_utilities.member_eqP(v_object, $removal_modules_generic$.getGlobalValue())));
    }

    public static SubLObject generic_removal_module_p(final SubLObject v_object) {
        return makeBoolean((NIL != inference_modules.removal_module_p(v_object)) && (NIL != subl_promotions.memberP(v_object, inference_modules.$removal_modules_generic$.getGlobalValue(), UNPROVIDED, UNPROVIDED)));
    }

    /**
     * Return a list of the generic removal modules.
     *
     * @unknown destructible
     */
    @LispMethod(comment = "Return a list of the generic removal modules.\r\n\r\n@unknown destructible")
    public static final SubLObject generic_removal_modules_alt() {
        return copy_list($removal_modules_generic$.getGlobalValue());
    }

    /**
     * Return a list of the generic removal modules.
     *
     * @unknown destructible
     */
    @LispMethod(comment = "Return a list of the generic removal modules.\r\n\r\n@unknown destructible")
    public static SubLObject generic_removal_modules() {
        return copy_list(inference_modules.$removal_modules_generic$.getGlobalValue());
    }

    public static final SubLObject generic_removal_modules_for_sense_alt(SubLObject sense) {
        return remove(enumeration_types.inverse_sense(sense), $removal_modules_generic$.getGlobalValue(), symbol_function(EQ), HL_MODULE_SENSE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject generic_removal_modules_for_sense(final SubLObject sense) {
        return remove(inverse_sense(sense), inference_modules.$removal_modules_generic$.getGlobalValue(), symbol_function(EQL), inference_modules.HL_MODULE_SENSE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject generic_removal_module_count_alt() {
        return length($removal_modules_generic$.getGlobalValue());
    }

    public static SubLObject generic_removal_module_count() {
        return length(inference_modules.$removal_modules_generic$.getGlobalValue());
    }

    /**
     * Return a list of the generic removal modules.
     *
     * @unknown destructible
     */
    @LispMethod(comment = "Return a list of the generic removal modules.\r\n\r\n@unknown destructible")
    public static final SubLObject universal_removal_modules_alt() {
        return copy_list($removal_modules_universal$.getGlobalValue());
    }

    /**
     * Return a list of the generic removal modules.
     *
     * @unknown destructible
     */
    @LispMethod(comment = "Return a list of the generic removal modules.\r\n\r\n@unknown destructible")
    public static SubLObject universal_removal_modules() {
        return copy_list(inference_modules.$removal_modules_universal$.getGlobalValue());
    }

    public static final SubLObject universal_removal_module_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.inference.harness.inference_modules.removal_module_p(v_object)) && (NIL != memberP(v_object, $removal_modules_universal$.getGlobalValue(), symbol_function(EQ), UNPROVIDED)));
    }

    public static SubLObject universal_removal_module_p(final SubLObject v_object) {
        return makeBoolean((NIL != inference_modules.removal_module_p(v_object)) && (NIL != subl_promotions.memberP(v_object, inference_modules.$removal_modules_universal$.getGlobalValue(), symbol_function(EQL), UNPROVIDED)));
    }

    public static final SubLObject universal_removal_module_count_alt() {
        return length($removal_modules_universal$.getGlobalValue());
    }

    public static SubLObject universal_removal_module_count() {
        return length(inference_modules.$removal_modules_universal$.getGlobalValue());
    }

    /**
     *
     *
     * @return listp; a list of predicates with specific removal modules that dont want to use this universal-removal module.
     */
    @LispMethod(comment = "@return listp; a list of predicates with specific removal modules that dont want to use this universal-removal module.")
    public static final SubLObject universal_removal_module_exception_predicates_alt(SubLObject universal_module) {
        return list_utilities.alist_lookup($removal_modules_specific_dont_use_universal$.getGlobalValue(), universal_module, symbol_function(EQ), UNPROVIDED);
    }

    /**
     *
     *
     * @return listp; a list of predicates with specific removal modules that dont want to use this universal-removal module.
     */
    @LispMethod(comment = "@return listp; a list of predicates with specific removal modules that dont want to use this universal-removal module.")
    public static SubLObject universal_removal_module_exception_predicates(final SubLObject universal_module) {
        return alist_lookup(inference_modules.$removal_modules_specific_dont_use_universal$.getGlobalValue(), universal_module, symbol_function(EQL), UNPROVIDED);
    }

    public static final SubLObject universal_removal_module_exception_predicateP_alt(SubLObject universal_module, SubLObject predicate) {
        return list_utilities.member_eqP(predicate, com.cyc.cycjava.cycl.inference.harness.inference_modules.universal_removal_module_exception_predicates(universal_module));
    }

    public static SubLObject universal_removal_module_exception_predicateP(final SubLObject universal_module, final SubLObject predicate) {
        return subl_promotions.memberP(predicate, inference_modules.universal_removal_module_exception_predicates(universal_module), UNPROVIDED, UNPROVIDED);
    }

    /**
     * All predicates use all universal-removal modules unless they have been stated as @xref inference-removal-module-dont-use-universal
     */
    @LispMethod(comment = "All predicates use all universal-removal modules unless they have been stated as @xref inference-removal-module-dont-use-universal")
    public static final SubLObject predicate_doesnt_use_universal_removal_moduleP_alt(SubLObject predicate, SubLObject universal_module) {
        if (NIL != forts.fort_p(predicate)) {
            if (NIL == com.cyc.cycjava.cycl.inference.harness.inference_modules.universal_removal_module_exception_predicateP(universal_module, predicate)) {
                return NIL;
            }
        }
        return T;
    }

    /**
     * All predicates use all universal-removal modules unless they have been stated as @xref inference-removal-module-dont-use-universal
     */
    @LispMethod(comment = "All predicates use all universal-removal modules unless they have been stated as @xref inference-removal-module-dont-use-universal")
    public static SubLObject predicate_doesnt_use_universal_removal_moduleP(final SubLObject predicate, final SubLObject universal_module) {
        if ((NIL != fort_p(predicate)) && (NIL == inference_modules.universal_removal_module_exception_predicateP(universal_module, predicate))) {
            return NIL;
        }
        return T;
    }

    public static final SubLObject universal_removal_modules_for_sense_alt(SubLObject sense) {
        return remove(enumeration_types.inverse_sense(sense), $removal_modules_universal$.getGlobalValue(), symbol_function(EQ), HL_MODULE_SENSE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject universal_removal_modules_for_sense(final SubLObject sense) {
        return remove(inverse_sense(sense), inference_modules.$removal_modules_universal$.getGlobalValue(), symbol_function(EQL), inference_modules.HL_MODULE_SENSE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Return the removal modules declared specific to PREDICATE.
     *
     * @unknown destructible
     */
    @LispMethod(comment = "Return the removal modules declared specific to PREDICATE.\r\n\r\n@unknown destructible")
    public static final SubLObject removal_modules_specific_alt(SubLObject predicate) {
        SubLTrampolineFile.checkType(predicate, FORT_P);
        return copy_list(gethash_without_values(predicate, $removal_modules_specific$.getGlobalValue(), NIL));
    }

    /**
     * Return the removal modules declared specific to PREDICATE.
     *
     * @unknown destructible
     */
    @LispMethod(comment = "Return the removal modules declared specific to PREDICATE.\r\n\r\n@unknown destructible")
    public static SubLObject removal_modules_specific(final SubLObject predicate) {
        assert NIL != fort_p(predicate) : "! forts.fort_p(predicate) " + ("forts.fort_p(predicate) " + "CommonSymbols.NIL != forts.fort_p(predicate) ") + predicate;
        return copy_list(gethash_without_values(predicate, inference_modules.$removal_modules_specific$.getGlobalValue(), NIL));
    }

    public static final SubLObject predicate_has_specific_removal_modulesP_alt(SubLObject predicate) {
        return list_utilities.sublisp_boolean(gethash_without_values(predicate, $removal_modules_specific$.getGlobalValue(), NIL));
    }

    public static SubLObject predicate_has_specific_removal_modulesP(final SubLObject predicate) {
        return sublisp_boolean(gethash_without_values(predicate, inference_modules.$removal_modules_specific$.getGlobalValue(), NIL));
    }

    /**
     * Return the removal modules declared specific to PREDICATE in SENSE literals.
     *
     * @unknown destructible
     */
    @LispMethod(comment = "Return the removal modules declared specific to PREDICATE in SENSE literals.\r\n\r\n@unknown destructible")
    public static final SubLObject removal_modules_specific_for_sense_alt(SubLObject predicate, SubLObject sense) {
        SubLTrampolineFile.checkType(predicate, FORT_P);
        return remove(enumeration_types.inverse_sense(sense), gethash_without_values(predicate, $removal_modules_specific$.getGlobalValue(), NIL), symbol_function(EQ), HL_MODULE_SENSE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Return the removal modules declared specific to PREDICATE in SENSE literals.
     *
     * @unknown destructible
     */
    @LispMethod(comment = "Return the removal modules declared specific to PREDICATE in SENSE literals.\r\n\r\n@unknown destructible")
    public static SubLObject removal_modules_specific_for_sense(final SubLObject predicate, final SubLObject sense) {
        assert NIL != fort_p(predicate) : "! forts.fort_p(predicate) " + ("forts.fort_p(predicate) " + "CommonSymbols.NIL != forts.fort_p(predicate) ") + predicate;
        return remove(inverse_sense(sense), gethash_without_values(predicate, inference_modules.$removal_modules_specific$.getGlobalValue(), NIL), symbol_function(EQL), inference_modules.HL_MODULE_SENSE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Return universal removal modules declared to use in SENSE literals and which have not been declared as dont-use for PREDICATE.
     *
     * @unknown destructible
     */
    @LispMethod(comment = "Return universal removal modules declared to use in SENSE literals and which have not been declared as dont-use for PREDICATE.\r\n\r\n@unknown destructible")
    public static final SubLObject removal_modules_universal_for_predicate_and_sense_alt(SubLObject predicate, SubLObject sense) {
        SubLTrampolineFile.checkType(predicate, FORT_P);
        {
            SubLObject universal_modules = NIL;
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.inference.harness.inference_modules.universal_removal_modules_for_sense(sense);
            SubLObject universal_module = NIL;
            for (universal_module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , universal_module = cdolist_list_var.first()) {
                if (NIL == com.cyc.cycjava.cycl.inference.harness.inference_modules.predicate_doesnt_use_universal_removal_moduleP(predicate, universal_module)) {
                    universal_modules = cons(universal_module, universal_modules);
                }
            }
            return nreverse(universal_modules);
        }
    }

    /**
     * Return universal removal modules declared to use in SENSE literals and which have not been declared as dont-use for PREDICATE.
     *
     * @unknown destructible
     */
    @LispMethod(comment = "Return universal removal modules declared to use in SENSE literals and which have not been declared as dont-use for PREDICATE.\r\n\r\n@unknown destructible")
    public static SubLObject removal_modules_universal_for_predicate_and_sense(final SubLObject predicate, final SubLObject sense) {
        assert NIL != fort_p(predicate) : "! forts.fort_p(predicate) " + ("forts.fort_p(predicate) " + "CommonSymbols.NIL != forts.fort_p(predicate) ") + predicate;
        SubLObject universal_modules = NIL;
        SubLObject cdolist_list_var = inference_modules.universal_removal_modules_for_sense(sense);
        SubLObject universal_module = NIL;
        universal_module = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == inference_modules.predicate_doesnt_use_universal_removal_moduleP(predicate, universal_module)) {
                universal_modules = cons(universal_module, universal_modules);
            }
            cdolist_list_var = cdolist_list_var.rest();
            universal_module = cdolist_list_var.first();
        } 
        return nreverse(universal_modules);
    }

    /**
     *
     *
     * @unknown destructible
     */
    @LispMethod(comment = "@unknown destructible")
    public static final SubLObject predicates_with_specific_removal_modules_alt() {
        return hash_table_utilities.hash_table_keys($removal_modules_specific$.getGlobalValue());
    }

    /**
     *
     *
     * @unknown destructible
     */
    @LispMethod(comment = "@unknown destructible")
    public static SubLObject predicates_with_specific_removal_modules() {
        return hash_table_keys(inference_modules.$removal_modules_specific$.getGlobalValue());
    }

    /**
     *
     *
     * @unknown destructible
     */
    @LispMethod(comment = "@unknown destructible")
    public static final SubLObject specific_removal_modules_alt() {
        return set.set_element_list(com.cyc.cycjava.cycl.inference.harness.inference_modules.specific_removal_module_set());
    }

    /**
     *
     *
     * @unknown destructible
     */
    @LispMethod(comment = "@unknown destructible")
    public static SubLObject specific_removal_modules() {
        return set_element_list(inference_modules.specific_removal_module_set());
    }

    public static final SubLObject specific_removal_module_count_alt() {
        return set.set_size(com.cyc.cycjava.cycl.inference.harness.inference_modules.specific_removal_module_set());
    }

    public static SubLObject specific_removal_module_count() {
        return set_size(inference_modules.specific_removal_module_set());
    }

    public static final SubLObject specific_removal_module_set_alt() {
        {
            SubLObject v_set = set.new_set(EQL, com.cyc.cycjava.cycl.inference.harness.inference_modules.removal_module_count());
            SubLObject pred = NIL;
            SubLObject hl_module_list = NIL;
            {
                final Iterator cdohash_iterator = getEntrySetIterator($removal_modules_specific$.getGlobalValue());
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        pred = getEntryKey(cdohash_entry);
                        hl_module_list = getEntryValue(cdohash_entry);
                        {
                            SubLObject cdolist_list_var = hl_module_list;
                            SubLObject hl_module = NIL;
                            for (hl_module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , hl_module = cdolist_list_var.first()) {
                                if (NIL == com.cyc.cycjava.cycl.inference.harness.inference_modules.generic_removal_module_p(hl_module)) {
                                    set.set_add(hl_module, v_set);
                                }
                            }
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
            return v_set;
        }
    }

    public static SubLObject specific_removal_module_set() {
        final SubLObject v_set = new_set(EQL, inference_modules.removal_module_count());
        SubLObject pred = NIL;
        SubLObject hl_module_list = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(inference_modules.$removal_modules_specific$.getGlobalValue());
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                pred = getEntryKey(cdohash_entry);
                SubLObject cdolist_list_var;
                hl_module_list = cdolist_list_var = getEntryValue(cdohash_entry);
                SubLObject hl_module = NIL;
                hl_module = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL == inference_modules.generic_removal_module_p(hl_module)) {
                        set_add(hl_module, v_set);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    hl_module = cdolist_list_var.first();
                } 
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return v_set;
    }

    public static final SubLObject clear_solely_specific_removal_module_predicate_store_alt() {
        set.clear_set($solely_specific_removal_module_predicate_store$.getGlobalValue());
        return NIL;
    }

    public static SubLObject clear_solely_specific_removal_module_predicate_store() {
        clear_set(inference_modules.$solely_specific_removal_module_predicate_store$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject rebuild_solely_specific_removal_module_predicate_store_alt() {
        return set.set_rebuild($solely_specific_removal_module_predicate_store$.getGlobalValue());
    }

    public static SubLObject rebuild_solely_specific_removal_module_predicate_store() {
        return set_rebuild(inference_modules.$solely_specific_removal_module_predicate_store$.getGlobalValue());
    }

    /**
     * If you want the specific removal modules for PREDICATE to supplant ALL
     * generic removal modules, then register this property.
     */
    @LispMethod(comment = "If you want the specific removal modules for PREDICATE to supplant ALL\r\ngeneric removal modules, then register this property.\nIf you want the specific removal modules for PREDICATE to supplant ALL\ngeneric removal modules, then register this property.")
    public static final SubLObject register_solely_specific_removal_module_predicate_alt(SubLObject predicate) {
        return set.set_add(predicate, $solely_specific_removal_module_predicate_store$.getGlobalValue());
    }

    /**
     * If you want the specific removal modules for PREDICATE to supplant ALL
     * generic removal modules, then register this property.
     */
    @LispMethod(comment = "If you want the specific removal modules for PREDICATE to supplant ALL\r\ngeneric removal modules, then register this property.\nIf you want the specific removal modules for PREDICATE to supplant ALL\ngeneric removal modules, then register this property.")
    public static SubLObject register_solely_specific_removal_module_predicate(final SubLObject predicate) {
        return set_add(predicate, inference_modules.$solely_specific_removal_module_predicate_store$.getGlobalValue());
    }

    public static final SubLObject deregister_solely_specific_removal_module_predicate_alt(SubLObject predicate) {
        return set.set_remove(predicate, $solely_specific_removal_module_predicate_store$.getGlobalValue());
    }

    public static SubLObject deregister_solely_specific_removal_module_predicate(final SubLObject predicate) {
        return set_remove(predicate, inference_modules.$solely_specific_removal_module_predicate_store$.getGlobalValue());
    }

    public static final SubLObject solely_specific_removal_module_predicateP_alt(SubLObject predicate) {
        return set.set_memberP(predicate, $solely_specific_removal_module_predicate_store$.getGlobalValue());
    }

    public static SubLObject solely_specific_removal_module_predicateP(final SubLObject predicate) {
        return set_memberP(predicate, inference_modules.$solely_specific_removal_module_predicate_store$.getGlobalValue());
    }

    /**
     * Declare an inference removal module named NAME with properties in PLIST.
     *
     * @unknown For instructions on writing removal modules, see http://research.cyc.com/doc/removal-module-documentationv2.doc
    and the other documentation provided from that doc page.
     */
    @LispMethod(comment = "Declare an inference removal module named NAME with properties in PLIST.\r\n\r\n@unknown For instructions on writing removal modules, see http://research.cyc.com/doc/removal-module-documentationv2.doc\r\nand the other documentation provided from that doc page.")
    public static final SubLObject inference_removal_module_alt(SubLObject name, SubLObject plist) {
        {
            SubLObject strengthened_plist = com.cyc.cycjava.cycl.inference.harness.inference_modules.strengthen_removal_module_properties(name, plist);
            SubLObject hl_module = com.cyc.cycjava.cycl.inference.harness.inference_modules.setup_module(name, $REMOVAL, strengthened_plist);
            set.set_add(hl_module, $removal_modules$.getGlobalValue());
            com.cyc.cycjava.cycl.inference.harness.inference_modules.classify_removal_module(hl_module);
            return hl_module;
        }
    }

    /**
     * Declare an inference removal module named NAME with properties in PLIST.
     *
     * @unknown For instructions on writing removal modules, see http://research.cyc.com/doc/removal-module-documentationv2.doc
    and the other documentation provided from that doc page.
     */
    @LispMethod(comment = "Declare an inference removal module named NAME with properties in PLIST.\r\n\r\n@unknown For instructions on writing removal modules, see http://research.cyc.com/doc/removal-module-documentationv2.doc\r\nand the other documentation provided from that doc page.")
    public static SubLObject inference_removal_module(final SubLObject name, final SubLObject plist) {
        final SubLObject strengthened_plist = inference_modules.strengthen_removal_module_properties(name, plist);
        final SubLObject hl_module = inference_modules.setup_module(name, $REMOVAL, strengthened_plist);
        set_add(hl_module, inference_modules.$removal_modules$.getGlobalValue());
        inference_modules.classify_removal_module(hl_module);
        return hl_module;
    }

    /**
     * State that the generic removal module named NAME should also be used for PREDICATE.
     */
    @LispMethod(comment = "State that the generic removal module named NAME should also be used for PREDICATE.")
    public static final SubLObject inference_removal_module_use_generic_alt(SubLObject predicate, SubLObject name) {
        {
            SubLObject hl_module = com.cyc.cycjava.cycl.inference.harness.inference_modules.find_hl_module_by_name(name);
            if (NIL != hl_module) {
                {
                    SubLObject existing = assoc(hl_module, $removal_modules_specific_use_generic$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
                    if (NIL == existing) {
                        existing = list(hl_module);
                        $removal_modules_specific_use_generic$.setGlobalValue(cons(existing, $removal_modules_specific_use_generic$.getGlobalValue()));
                    }
                    rplacd(existing, adjoin(predicate, existing.rest(), UNPROVIDED, UNPROVIDED));
                }
                return com.cyc.cycjava.cycl.inference.harness.inference_modules.inference_removal_module_note_specific(predicate, hl_module);
            }
        }
        return NIL;
    }

    /**
     * State that the generic removal module named NAME should also be used for PREDICATE.
     */
    @LispMethod(comment = "State that the generic removal module named NAME should also be used for PREDICATE.")
    public static SubLObject inference_removal_module_use_generic(final SubLObject predicate, final SubLObject name) {
        final SubLObject hl_module = inference_modules.find_hl_module_by_name(name);
        if (NIL != hl_module) {
            SubLObject existing = assoc(hl_module, inference_modules.$removal_modules_specific_use_generic$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
            if (NIL == existing) {
                existing = list(hl_module);
                inference_modules.$removal_modules_specific_use_generic$.setGlobalValue(cons(existing, inference_modules.$removal_modules_specific_use_generic$.getGlobalValue()));
            }
            rplacd(existing, adjoin(predicate, existing.rest(), UNPROVIDED, UNPROVIDED));
            return inference_modules.inference_removal_module_note_specific(predicate, hl_module);
        }
        return NIL;
    }

    /**
     * State that the meta-removal module named NAME should also be used for PREDICATE.
     */
    @LispMethod(comment = "State that the meta-removal module named NAME should also be used for PREDICATE.")
    public static final SubLObject inference_removal_module_use_meta_removal_alt(SubLObject predicate, SubLObject name) {
        {
            SubLObject hl_module = com.cyc.cycjava.cycl.inference.harness.inference_modules.find_hl_module_by_name(name);
            if (NIL != hl_module) {
                {
                    SubLObject existing = assoc(hl_module, $removal_modules_specific_use_meta_removal$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
                    if (NIL == existing) {
                        existing = list(hl_module);
                        $removal_modules_specific_use_meta_removal$.setGlobalValue(cons(existing, $removal_modules_specific_use_meta_removal$.getGlobalValue()));
                    }
                    rplacd(existing, adjoin(predicate, existing.rest(), UNPROVIDED, UNPROVIDED));
                }
                return hl_module;
            }
        }
        return NIL;
    }

    /**
     * State that the meta-removal module named NAME should also be used for PREDICATE.
     */
    @LispMethod(comment = "State that the meta-removal module named NAME should also be used for PREDICATE.")
    public static SubLObject inference_removal_module_use_meta_removal(final SubLObject predicate, final SubLObject name) {
        final SubLObject hl_module = inference_modules.find_hl_module_by_name(name);
        if (NIL != hl_module) {
            SubLObject existing = assoc(hl_module, inference_modules.$removal_modules_specific_use_meta_removal$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
            if (NIL == existing) {
                existing = list(hl_module);
                inference_modules.$removal_modules_specific_use_meta_removal$.setGlobalValue(cons(existing, inference_modules.$removal_modules_specific_use_meta_removal$.getGlobalValue()));
            }
            rplacd(existing, adjoin(predicate, existing.rest(), UNPROVIDED, UNPROVIDED));
            return hl_module;
        }
        return NIL;
    }

    /**
     * State that the universal removal module named NAME should not be used for PREDICATE.
     */
    @LispMethod(comment = "State that the universal removal module named NAME should not be used for PREDICATE.")
    public static final SubLObject inference_removal_module_dont_use_universal_alt(SubLObject predicate, SubLObject name) {
        {
            SubLObject hl_module = com.cyc.cycjava.cycl.inference.harness.inference_modules.find_hl_module_by_name(name);
            if (NIL != hl_module) {
                {
                    SubLObject existing = assoc(hl_module, $removal_modules_specific_dont_use_universal$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
                    if (NIL == existing) {
                        existing = list(hl_module);
                        $removal_modules_specific_dont_use_universal$.setGlobalValue(cons(existing, $removal_modules_specific_dont_use_universal$.getGlobalValue()));
                    }
                    rplacd(existing, adjoin(predicate, existing.rest(), UNPROVIDED, UNPROVIDED));
                }
                return hl_module;
            }
        }
        return NIL;
    }

    /**
     * State that the universal removal module named NAME should not be used for PREDICATE.
     */
    @LispMethod(comment = "State that the universal removal module named NAME should not be used for PREDICATE.")
    public static SubLObject inference_removal_module_dont_use_universal(final SubLObject predicate, final SubLObject name) {
        final SubLObject hl_module = inference_modules.find_hl_module_by_name(name);
        if (NIL != hl_module) {
            SubLObject existing = assoc(hl_module, inference_modules.$removal_modules_specific_dont_use_universal$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
            if (NIL == existing) {
                existing = list(hl_module);
                inference_modules.$removal_modules_specific_dont_use_universal$.setGlobalValue(cons(existing, inference_modules.$removal_modules_specific_dont_use_universal$.getGlobalValue()));
            }
            rplacd(existing, adjoin(predicate, existing.rest(), UNPROVIDED, UNPROVIDED));
            return hl_module;
        }
        return NIL;
    }

    /**
     *
     *
     * @unknown Redeclares removal module named NAME, based on its existing plist. Used in testing when we temporarily undeclare a module.
     */
    @LispMethod(comment = "@unknown Redeclares removal module named NAME, based on its existing plist. Used in testing when we temporarily undeclare a module.")
    public static final SubLObject redeclare_inference_removal_module_alt(SubLObject name) {
        {
            SubLObject hl_module = com.cyc.cycjava.cycl.inference.harness.inference_modules.find_hl_module_by_name(name);
            if (NIL != hl_module) {
                set.set_add(hl_module, $removal_modules$.getGlobalValue());
                com.cyc.cycjava.cycl.inference.harness.inference_modules.classify_removal_module(hl_module);
                return hl_module;
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @unknown Redeclares removal module named NAME, based on its existing plist. Used in testing when we temporarily undeclare a module.
     */
    @LispMethod(comment = "@unknown Redeclares removal module named NAME, based on its existing plist. Used in testing when we temporarily undeclare a module.")
    public static SubLObject redeclare_inference_removal_module(final SubLObject name) {
        final SubLObject hl_module = inference_modules.find_hl_module_by_name(name);
        if (NIL != hl_module) {
            set_add(hl_module, inference_modules.$removal_modules$.getGlobalValue());
            inference_modules.classify_removal_module(hl_module);
            return hl_module;
        }
        return NIL;
    }

    public static final SubLObject strengthen_removal_module_properties_alt(SubLObject name, SubLObject plist) {
        plist = copy_tree(plist);
        {
            SubLObject sense = getf(plist, $SENSE, UNPROVIDED);
            SubLObject pcase_var = sense;
            if (pcase_var.eql($POS) || pcase_var.eql($NEG)) {
            } else {
                Errors.error($str_alt153$removal_module__S_must_have_a__SE, name);
            }
        }
        return plist;
    }

    public static SubLObject strengthen_removal_module_properties(final SubLObject name, SubLObject plist) {
        plist = copy_tree(plist);
        final SubLObject pcase_var;
        final SubLObject sense = pcase_var = getf(plist, $SENSE, UNPROVIDED);
        if (!pcase_var.eql($POS)) {
            if (!pcase_var.eql($NEG)) {
                Errors.error(inference_modules.$str166$removal_module__S_must_have_a__SE, name);
            }
        }
        return plist;
    }

    /**
     * Undeclare the removal module named NAME.
     * If RECLASSIFY? is non-nil, we reclassify all the removal modules.
     */
    @LispMethod(comment = "Undeclare the removal module named NAME.\r\nIf RECLASSIFY? is non-nil, we reclassify all the removal modules.\nUndeclare the removal module named NAME.\nIf RECLASSIFY? is non-nil, we reclassify all the removal modules.")
    public static final SubLObject undeclare_inference_removal_module_alt(SubLObject name, SubLObject reclassifyP) {
        if (reclassifyP == UNPROVIDED) {
            reclassifyP = T;
        }
        {
            SubLObject hl_module = com.cyc.cycjava.cycl.inference.harness.inference_modules.find_hl_module_by_name(name);
            if (NIL != hl_module) {
                com.cyc.cycjava.cycl.inference.harness.inference_modules.remove_hl_module(hl_module);
                set.set_remove(hl_module, $removal_modules$.getGlobalValue());
                $removal_modules_generic$.setGlobalValue(remove(hl_module, $removal_modules_generic$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                $removal_modules_universal$.setGlobalValue(remove(hl_module, $removal_modules_universal$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                $removal_modules_specific_use_generic$.setGlobalValue(delete(hl_module, $removal_modules_specific_use_generic$.getGlobalValue(), symbol_function(EQL), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED));
                $removal_modules_specific_use_meta_removal$.setGlobalValue(delete(hl_module, $removal_modules_specific_use_meta_removal$.getGlobalValue(), symbol_function(EQL), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED));
                $removal_modules_specific_dont_use_universal$.setGlobalValue(delete(hl_module, $removal_modules_specific_dont_use_universal$.getGlobalValue(), symbol_function(EQL), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED));
                if (NIL != reclassifyP) {
                    com.cyc.cycjava.cycl.inference.harness.inference_modules.reclassify_removal_modules();
                }
                return hl_module;
            }
        }
        return NIL;
    }

    /**
     * Undeclare the removal module named NAME.
     * If RECLASSIFY? is non-nil, we reclassify all the removal modules.
     */
    @LispMethod(comment = "Undeclare the removal module named NAME.\r\nIf RECLASSIFY? is non-nil, we reclassify all the removal modules.\nUndeclare the removal module named NAME.\nIf RECLASSIFY? is non-nil, we reclassify all the removal modules.")
    public static SubLObject undeclare_inference_removal_module(final SubLObject name, SubLObject reclassifyP) {
        if (reclassifyP == UNPROVIDED) {
            reclassifyP = T;
        }
        final SubLObject hl_module = inference_modules.find_hl_module_by_name(name);
        if (NIL != hl_module) {
            inference_modules.remove_hl_module(hl_module);
            set_remove(hl_module, inference_modules.$removal_modules$.getGlobalValue());
            inference_modules.$removal_modules_generic$.setGlobalValue(remove(hl_module, inference_modules.$removal_modules_generic$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            inference_modules.$removal_modules_universal$.setGlobalValue(remove(hl_module, inference_modules.$removal_modules_universal$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            inference_modules.$removal_modules_specific_use_generic$.setGlobalValue(delete(hl_module, inference_modules.$removal_modules_specific_use_generic$.getGlobalValue(), symbol_function(EQL), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED));
            inference_modules.$removal_modules_specific_use_meta_removal$.setGlobalValue(delete(hl_module, inference_modules.$removal_modules_specific_use_meta_removal$.getGlobalValue(), symbol_function(EQL), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED));
            inference_modules.$removal_modules_specific_dont_use_universal$.setGlobalValue(delete(hl_module, inference_modules.$removal_modules_specific_dont_use_universal$.getGlobalValue(), symbol_function(EQL), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED));
            if (NIL != reclassifyP) {
                inference_modules.reclassify_removal_modules();
            }
            return hl_module;
        }
        return NIL;
    }

    /**
     * Undeclare the meta-removal module named NAME.
     */
    @LispMethod(comment = "Undeclare the meta-removal module named NAME.")
    public static final SubLObject undeclare_inference_meta_removal_module_alt(SubLObject name) {
        {
            SubLObject hl_module = com.cyc.cycjava.cycl.inference.harness.inference_modules.find_hl_module_by_name(name);
            if (NIL != hl_module) {
                com.cyc.cycjava.cycl.inference.harness.inference_modules.remove_hl_module(hl_module);
                set.set_remove(hl_module, $meta_removal_modules$.getGlobalValue());
            }
            return hl_module;
        }
    }

    /**
     * Undeclare the meta-removal module named NAME.
     */
    @LispMethod(comment = "Undeclare the meta-removal module named NAME.")
    public static SubLObject undeclare_inference_meta_removal_module(final SubLObject name) {
        final SubLObject hl_module = inference_modules.find_hl_module_by_name(name);
        if (NIL != hl_module) {
            inference_modules.remove_hl_module(hl_module);
            set_remove(hl_module, inference_modules.$meta_removal_modules$.getGlobalValue());
        }
        return hl_module;
    }

    /**
     * Undeclare that the generic removal module named NAME should also be used for PREDICATE.
     */
    @LispMethod(comment = "Undeclare that the generic removal module named NAME should also be used for PREDICATE.")
    public static final SubLObject undeclare_inference_removal_module_use_generic_alt(SubLObject predicate, SubLObject name, SubLObject reclassifyP) {
        if (reclassifyP == UNPROVIDED) {
            reclassifyP = NIL;
        }
        {
            SubLObject hl_module = com.cyc.cycjava.cycl.inference.harness.inference_modules.find_hl_module_by_name(name);
            if (NIL != hl_module) {
                {
                    SubLObject existing = assoc(hl_module, $removal_modules_specific_use_generic$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
                    if (NIL != existing) {
                        rplacd(existing, delete(predicate, existing.rest(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                        if (NIL == existing.rest()) {
                            $removal_modules_specific_use_generic$.setGlobalValue(delete(existing, $removal_modules_specific_use_generic$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                        }
                    }
                }
                if (NIL != reclassifyP) {
                    com.cyc.cycjava.cycl.inference.harness.inference_modules.reclassify_removal_modules();
                }
                return hl_module;
            }
        }
        return NIL;
    }

    /**
     * Undeclare that the generic removal module named NAME should also be used for PREDICATE.
     */
    @LispMethod(comment = "Undeclare that the generic removal module named NAME should also be used for PREDICATE.")
    public static SubLObject undeclare_inference_removal_module_use_generic(final SubLObject predicate, final SubLObject name, SubLObject reclassifyP) {
        if (reclassifyP == UNPROVIDED) {
            reclassifyP = NIL;
        }
        final SubLObject hl_module = inference_modules.find_hl_module_by_name(name);
        if (NIL != hl_module) {
            final SubLObject existing = assoc(hl_module, inference_modules.$removal_modules_specific_use_generic$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
            if (NIL != existing) {
                rplacd(existing, delete(predicate, existing.rest(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                if (NIL == existing.rest()) {
                    inference_modules.$removal_modules_specific_use_generic$.setGlobalValue(delete(existing, inference_modules.$removal_modules_specific_use_generic$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                }
            }
            if (NIL != reclassifyP) {
                inference_modules.reclassify_removal_modules();
            }
            return hl_module;
        }
        return NIL;
    }

    /**
     * Undeclare that the meta-removal module named NAME should also be used for PREDICATE.
     */
    @LispMethod(comment = "Undeclare that the meta-removal module named NAME should also be used for PREDICATE.")
    public static final SubLObject undeclare_inference_removal_module_use_meta_removal_alt(SubLObject predicate, SubLObject name, SubLObject reclassifyP) {
        if (reclassifyP == UNPROVIDED) {
            reclassifyP = NIL;
        }
        {
            SubLObject hl_module = com.cyc.cycjava.cycl.inference.harness.inference_modules.find_hl_module_by_name(name);
            if (NIL != hl_module) {
                {
                    SubLObject existing = assoc(hl_module, $removal_modules_specific_use_meta_removal$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
                    if (NIL != existing) {
                        rplacd(existing, delete(predicate, existing.rest(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                        if (NIL == existing.rest()) {
                            $removal_modules_specific_use_meta_removal$.setGlobalValue(delete(existing, $removal_modules_specific_use_meta_removal$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                        }
                    }
                }
                if (NIL != reclassifyP) {
                    com.cyc.cycjava.cycl.inference.harness.inference_modules.reclassify_removal_modules();
                }
                return hl_module;
            }
        }
        return NIL;
    }

    /**
     * Undeclare that the meta-removal module named NAME should also be used for PREDICATE.
     */
    @LispMethod(comment = "Undeclare that the meta-removal module named NAME should also be used for PREDICATE.")
    public static SubLObject undeclare_inference_removal_module_use_meta_removal(final SubLObject predicate, final SubLObject name, SubLObject reclassifyP) {
        if (reclassifyP == UNPROVIDED) {
            reclassifyP = NIL;
        }
        final SubLObject hl_module = inference_modules.find_hl_module_by_name(name);
        if (NIL != hl_module) {
            final SubLObject existing = assoc(hl_module, inference_modules.$removal_modules_specific_use_meta_removal$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
            if (NIL != existing) {
                rplacd(existing, delete(predicate, existing.rest(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                if (NIL == existing.rest()) {
                    inference_modules.$removal_modules_specific_use_meta_removal$.setGlobalValue(delete(existing, inference_modules.$removal_modules_specific_use_meta_removal$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                }
            }
            if (NIL != reclassifyP) {
                inference_modules.reclassify_removal_modules();
            }
            return hl_module;
        }
        return NIL;
    }

    /**
     * Undeclare that the universal module named NAME should not be used for PREDICATE.
     */
    @LispMethod(comment = "Undeclare that the universal module named NAME should not be used for PREDICATE.")
    public static final SubLObject undeclare_inference_removal_module_dont_use_universal_alt(SubLObject predicate, SubLObject name, SubLObject reclassifyP) {
        if (reclassifyP == UNPROVIDED) {
            reclassifyP = NIL;
        }
        {
            SubLObject hl_module = com.cyc.cycjava.cycl.inference.harness.inference_modules.find_hl_module_by_name(name);
            if (NIL != hl_module) {
                {
                    SubLObject existing = assoc(hl_module, $removal_modules_specific_dont_use_universal$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
                    if (NIL != existing) {
                        rplacd(existing, delete(predicate, existing.rest(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                        if (NIL == existing.rest()) {
                            $removal_modules_specific_dont_use_universal$.setGlobalValue(delete(existing, $removal_modules_specific_dont_use_universal$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                        }
                    }
                }
                if (NIL != reclassifyP) {
                    com.cyc.cycjava.cycl.inference.harness.inference_modules.reclassify_removal_modules();
                }
                return hl_module;
            }
        }
        return NIL;
    }

    /**
     * Undeclare that the universal module named NAME should not be used for PREDICATE.
     */
    @LispMethod(comment = "Undeclare that the universal module named NAME should not be used for PREDICATE.")
    public static SubLObject undeclare_inference_removal_module_dont_use_universal(final SubLObject predicate, final SubLObject name, SubLObject reclassifyP) {
        if (reclassifyP == UNPROVIDED) {
            reclassifyP = NIL;
        }
        final SubLObject hl_module = inference_modules.find_hl_module_by_name(name);
        if (NIL != hl_module) {
            final SubLObject existing = assoc(hl_module, inference_modules.$removal_modules_specific_dont_use_universal$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
            if (NIL != existing) {
                rplacd(existing, delete(predicate, existing.rest(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                if (NIL == existing.rest()) {
                    inference_modules.$removal_modules_specific_dont_use_universal$.setGlobalValue(delete(existing, inference_modules.$removal_modules_specific_dont_use_universal$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                }
            }
            if (NIL != reclassifyP) {
                inference_modules.reclassify_removal_modules();
            }
            return hl_module;
        }
        return NIL;
    }

    /**
     *
     *
     * @unknown also reclassifies preference modules
     */
    @LispMethod(comment = "@unknown also reclassifies preference modules")
    public static final SubLObject reclassify_removal_modules_alt() {
        com.cyc.cycjava.cycl.inference.harness.inference_modules.clear_removal_modules();
        com.cyc.cycjava.cycl.inference.harness.inference_modules.rebuild_solely_specific_removal_module_predicate_store();
        {
            SubLObject cdolist_list_var = $removal_modules_specific_use_generic$.getGlobalValue();
            SubLObject generic_info = NIL;
            for (generic_info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , generic_info = cdolist_list_var.first()) {
                {
                    SubLObject datum = generic_info;
                    SubLObject current = datum;
                    SubLObject hl_module = NIL;
                    SubLObject predicates = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt155);
                    hl_module = current.first();
                    current = current.rest();
                    predicates = current;
                    {
                        SubLObject cdolist_list_var_3 = predicates;
                        SubLObject predicate = NIL;
                        for (predicate = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest() , predicate = cdolist_list_var_3.first()) {
                            com.cyc.cycjava.cycl.inference.harness.inference_modules.inference_removal_module_note_specific(predicate, hl_module);
                        }
                    }
                }
            }
        }
        {
            SubLObject set_contents_var = set.do_set_internal(com.cyc.cycjava.cycl.inference.harness.inference_modules.removal_modules());
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject hl_module = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, hl_module)) {
                        com.cyc.cycjava.cycl.inference.harness.inference_modules.classify_removal_module(hl_module);
                    }
                }
            }
        }
        preference_modules.reclassify_preference_modules();
        return NIL;
    }

    /**
     *
     *
     * @unknown also reclassifies preference modules
     */
    @LispMethod(comment = "@unknown also reclassifies preference modules")
    public static SubLObject reclassify_removal_modules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        inference_modules.clear_removal_modules();
        inference_modules.rebuild_solely_specific_removal_module_predicate_store();
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                SubLObject cdolist_list_var = inference_modules.$removal_modules_specific_use_generic$.getGlobalValue();
                SubLObject generic_info = NIL;
                generic_info = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = generic_info;
                    SubLObject hl_module = NIL;
                    SubLObject predicates = NIL;
                    destructuring_bind_must_consp(current, datum, inference_modules.$list168);
                    hl_module = current.first();
                    current = current.rest();
                    SubLObject cdolist_list_var_$3;
                    predicates = cdolist_list_var_$3 = current;
                    SubLObject predicate = NIL;
                    predicate = cdolist_list_var_$3.first();
                    while (NIL != cdolist_list_var_$3) {
                        inference_modules.inference_removal_module_note_specific(predicate, hl_module);
                        cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                        predicate = cdolist_list_var_$3.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    generic_info = cdolist_list_var.first();
                } 
                final SubLObject set_var = inference_modules.removal_modules();
                final SubLObject set_contents_var = do_set_internal(set_var);
                SubLObject basis_object;
                SubLObject state_$4;
                SubLObject hl_module2;
                for (basis_object = do_set_contents_basis_object(set_contents_var), state_$4 = NIL, state_$4 = do_set_contents_initial_state(basis_object, set_contents_var); NIL == do_set_contents_doneP(basis_object, state_$4); state_$4 = do_set_contents_update_state(state_$4)) {
                    hl_module2 = do_set_contents_next(basis_object, state_$4);
                    if (NIL != do_set_contents_element_validP(state_$4, hl_module2)) {
                        inference_modules.classify_removal_module(hl_module2);
                    }
                }
                preference_modules.reclassify_preference_modules();
            } finally {
                final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject clear_removal_modules_alt() {
        clrhash($removal_modules_specific$.getGlobalValue());
        $removal_modules_external$.setGlobalValue(NIL);
        $removal_modules_generic$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject clear_removal_modules() {
        clrhash(inference_modules.$removal_modules_specific$.getGlobalValue());
        inference_modules.$removal_modules_external$.setGlobalValue(NIL);
        inference_modules.$removal_modules_generic$.setGlobalValue(NIL);
        inference_modules.$removal_modules_universal$.setGlobalValue(NIL);
        return NIL;
    }

    public static final SubLObject classify_removal_module_alt(SubLObject hl_module) {
        if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_externalP(hl_module)) {
            {
                SubLObject item_var = hl_module;
                if (NIL == member(item_var, $removal_modules_external$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $removal_modules_external$.setGlobalValue(cons(item_var, $removal_modules_external$.getGlobalValue()));
                }
            }
        } else {
            {
                SubLObject predicate_spec = com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_predicate(hl_module);
                SubLObject universalP = com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_universal(hl_module);
                if (NIL != universalP) {
                    {
                        SubLObject item_var = hl_module;
                        if (NIL == member(item_var, $removal_modules_universal$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                            $removal_modules_universal$.setGlobalValue(cons(item_var, $removal_modules_universal$.getGlobalValue()));
                        }
                    }
                } else {
                    if (NIL == predicate_spec) {
                        {
                            SubLObject item_var = hl_module;
                            if (NIL == member(item_var, $removal_modules_generic$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                                $removal_modules_generic$.setGlobalValue(cons(item_var, $removal_modules_generic$.getGlobalValue()));
                            }
                        }
                    } else {
                        if (predicate_spec.isAtom()) {
                            com.cyc.cycjava.cycl.inference.harness.inference_modules.inference_removal_module_note_specific(predicate_spec, hl_module);
                        } else {
                            {
                                SubLObject cdolist_list_var = predicate_spec;
                                SubLObject predicate = NIL;
                                for (predicate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , predicate = cdolist_list_var.first()) {
                                    com.cyc.cycjava.cycl.inference.harness.inference_modules.inference_removal_module_note_specific(predicate, hl_module);
                                }
                            }
                        }
                    }
                }
            }
        }
        return hl_module;
    }

    public static SubLObject classify_removal_module(final SubLObject hl_module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != inference_modules.hl_module_externalP(hl_module)) {
            if (NIL != inference_modules.$classify_removal_modules_with_deterministic_sortP$.getDynamicValue(thread)) {
                inference_modules.$removal_modules_external$.setGlobalValue(sort_adjoin(hl_module, inference_modules.$removal_modules_external$.getGlobalValue(), EQL, inference_modules.$sym169$INFERENCE_REMOVAL_MODULE__FOR_CLASSIFICATION, IDENTITY));
            } else
                if (NIL == member(hl_module, inference_modules.$removal_modules_external$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    inference_modules.$removal_modules_external$.setGlobalValue(cons(hl_module, inference_modules.$removal_modules_external$.getGlobalValue()));
                }

        } else {
            final SubLObject predicate_spec = inference_modules.hl_module_predicate(hl_module);
            final SubLObject universalP = inference_modules.hl_module_universal(hl_module);
            if (NIL != universalP) {
                if (NIL != inference_modules.$classify_removal_modules_with_deterministic_sortP$.getDynamicValue(thread)) {
                    inference_modules.$removal_modules_universal$.setGlobalValue(sort_adjoin(hl_module, inference_modules.$removal_modules_universal$.getGlobalValue(), EQL, inference_modules.$sym169$INFERENCE_REMOVAL_MODULE__FOR_CLASSIFICATION, IDENTITY));
                } else
                    if (NIL == member(hl_module, inference_modules.$removal_modules_universal$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                        inference_modules.$removal_modules_universal$.setGlobalValue(cons(hl_module, inference_modules.$removal_modules_universal$.getGlobalValue()));
                    }

            } else
                if (NIL == predicate_spec) {
                    if (NIL != inference_modules.$classify_removal_modules_with_deterministic_sortP$.getDynamicValue(thread)) {
                        inference_modules.$removal_modules_generic$.setGlobalValue(sort_adjoin(hl_module, inference_modules.$removal_modules_generic$.getGlobalValue(), EQL, inference_modules.$sym169$INFERENCE_REMOVAL_MODULE__FOR_CLASSIFICATION, IDENTITY));
                    } else
                        if (NIL == member(hl_module, inference_modules.$removal_modules_generic$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                            inference_modules.$removal_modules_generic$.setGlobalValue(cons(hl_module, inference_modules.$removal_modules_generic$.getGlobalValue()));
                        }

                } else
                    if (predicate_spec.isAtom()) {
                        inference_modules.inference_removal_module_note_specific(predicate_spec, hl_module);
                    } else {
                        SubLObject cdolist_list_var = predicate_spec;
                        SubLObject predicate = NIL;
                        predicate = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            inference_modules.inference_removal_module_note_specific(predicate, hl_module);
                            cdolist_list_var = cdolist_list_var.rest();
                            predicate = cdolist_list_var.first();
                        } 
                    }


        }
        return hl_module;
    }

    public static final SubLObject inference_removal_module_note_specific_alt(SubLObject predicate, SubLObject hl_module) {
        sethash(predicate, $removal_modules_specific$.getGlobalValue(), adjoin(hl_module, gethash(predicate, $removal_modules_specific$.getGlobalValue(), NIL), UNPROVIDED, UNPROVIDED));
        return hl_module;
    }

    public static SubLObject inference_removal_module_note_specific(final SubLObject predicate, final SubLObject hl_module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash(predicate, inference_modules.$removal_modules_specific$.getGlobalValue(), NIL != inference_modules.$classify_removal_modules_with_deterministic_sortP$.getDynamicValue(thread) ? sort_adjoin(hl_module, gethash(predicate, inference_modules.$removal_modules_specific$.getGlobalValue(), NIL), EQL, inference_modules.$sym169$INFERENCE_REMOVAL_MODULE__FOR_CLASSIFICATION, IDENTITY) : adjoin(hl_module, gethash(predicate, inference_modules.$removal_modules_specific$.getGlobalValue(), NIL), UNPROVIDED, UNPROVIDED));
        return hl_module;
    }

    public static SubLObject inference_removal_moduleL_for_classification(final SubLObject module1, final SubLObject module2) {
        final SubLObject module1_specific_use_genericP = inference_modules.removal_module_specific_use_genericP(module1);
        final SubLObject module2_specific_use_genericP = inference_modules.removal_module_specific_use_genericP(module2);
        if ((NIL != module1_specific_use_genericP) && (NIL == module2_specific_use_genericP)) {
            return NIL;
        }
        if ((NIL == module1_specific_use_genericP) && (NIL != module2_specific_use_genericP)) {
            return T;
        }
        final SubLObject name1 = symbol_name(inference_modules.hl_module_name(module1));
        final SubLObject name2 = symbol_name(inference_modules.hl_module_name(module2));
        final SubLObject name1_length = length(name1);
        final SubLObject name2_length = length(name2);
        if (name1_length.numL(name2_length)) {
            return T;
        }
        if (name1_length.numG(name2_length)) {
            return NIL;
        }
        return Strings.stringL(name1, name2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject removal_module_specific_use_genericP_internal(final SubLObject module) {
        return assoc(module, inference_modules.$removal_modules_specific_use_generic$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject removal_module_specific_use_genericP(final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_modules.removal_module_specific_use_genericP_internal(module);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, inference_modules.$sym170$REMOVAL_MODULE_SPECIFIC_USE_GENERIC_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), inference_modules.$sym170$REMOVAL_MODULE_SPECIFIC_USE_GENERIC_, ONE_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, inference_modules.$sym170$REMOVAL_MODULE_SPECIFIC_USE_GENERIC_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, module, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(inference_modules.removal_module_specific_use_genericP_internal(module)));
            memoization_state.caching_state_put(caching_state, module, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject inference_removal_pruning_module(final SubLObject name, final SubLObject plist) {
        SubLObject removal_plist = merge_plist(plist, inference_modules.$removal_pruning_module_properties$.getGlobalValue());
        final SubLObject subtypes = adjoin($PRUNING, getf(plist, $MODULE_SUBTYPE, NIL), UNPROVIDED, UNPROVIDED);
        removal_plist = putf(removal_plist, $MODULE_SUBTYPE, subtypes);
        return inference_modules.inference_removal_module(name, removal_plist);
    }

    public static SubLObject removal_pruning_moduleP(final SubLObject v_object) {
        return makeBoolean((NIL != inference_modules.removal_module_p(v_object)) && (NIL != member_eqP($PRUNING, inference_modules.hl_module_subtypes(v_object))));
    }

    /**
     * Iterate MODULE over all conjunctive removal modules, and evaluate BODY for each.
     * Iteration halts early as soon as DONE becomes non-nil.
     */
    @LispMethod(comment = "Iterate MODULE over all conjunctive removal modules, and evaluate BODY for each.\r\nIteration halts early as soon as DONE becomes non-nil.\nIterate MODULE over all conjunctive removal modules, and evaluate BODY for each.\nIteration halts early as soon as DONE becomes non-nil.")
    public static final SubLObject do_conjunctive_removal_modules_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt157);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject module = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt157);
                    module = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_4 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt157);
                            current_4 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt157);
                            if (NIL == member(current_4, $list_alt78, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_4 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt157);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(DO_SET, list(module, $list_alt158, $DONE, done), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Iterate MODULE over all conjunctive removal modules, and evaluate BODY for each.
     * Iteration halts early as soon as DONE becomes non-nil.
     */
    @LispMethod(comment = "Iterate MODULE over all conjunctive removal modules, and evaluate BODY for each.\r\nIteration halts early as soon as DONE becomes non-nil.\nIterate MODULE over all conjunctive removal modules, and evaluate BODY for each.\nIteration halts early as soon as DONE becomes non-nil.")
    public static SubLObject do_conjunctive_removal_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, inference_modules.$list174);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject module = NIL;
        destructuring_bind_must_consp(current, datum, inference_modules.$list174);
        module = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$6 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, inference_modules.$list174);
            current_$6 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, inference_modules.$list174);
            if (NIL == member(current_$6, inference_modules.$list87, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$6 == inference_modules.$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, inference_modules.$list174);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_SET, list(module, inference_modules.$list175, $DONE, done), append(body, NIL));
    }

    public static final SubLObject removal_modules_conjunctive_alt() {
        return $conjunctive_removal_modules$.getGlobalValue();
    }

    public static SubLObject removal_modules_conjunctive() {
        return inference_modules.$conjunctive_removal_modules$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a conjunctive removal module.
     */
    @LispMethod(comment = "Return T iff OBJECT is a conjunctive removal module.")
    public static final SubLObject conjunctive_removal_module_p_alt(SubLObject v_object) {
        return set.set_memberP(v_object, $conjunctive_removal_modules$.getGlobalValue());
    }

    /**
     * Return T iff OBJECT is a conjunctive removal module.
     */
    @LispMethod(comment = "Return T iff OBJECT is a conjunctive removal module.")
    public static SubLObject conjunctive_removal_module_p(final SubLObject v_object) {
        return set_memberP(v_object, inference_modules.$conjunctive_removal_modules$.getGlobalValue());
    }

    public static final SubLObject conjunctive_removal_module_count_alt() {
        return set.set_size($conjunctive_removal_modules$.getGlobalValue());
    }

    public static SubLObject conjunctive_removal_module_count() {
        return set_size(inference_modules.$conjunctive_removal_modules$.getGlobalValue());
    }

    /**
     * Return a list of all the conjunctive removal modules.
     */
    @LispMethod(comment = "Return a list of all the conjunctive removal modules.")
    public static final SubLObject conjunctive_removal_modules_alt() {
        {
            SubLObject v_modules = NIL;
            SubLObject set_contents_var = set.do_set_internal(com.cyc.cycjava.cycl.inference.harness.inference_modules.removal_modules_conjunctive());
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject module = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, module)) {
                        v_modules = cons(module, v_modules);
                    }
                }
            }
            return v_modules;
        }
    }

    /**
     * Return a list of all the conjunctive removal modules.
     */
    @LispMethod(comment = "Return a list of all the conjunctive removal modules.")
    public static SubLObject conjunctive_removal_modules() {
        SubLObject v_modules = NIL;
        final SubLObject set_var = inference_modules.removal_modules_conjunctive();
        final SubLObject set_contents_var = do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject module;
        for (basis_object = do_set_contents_basis_object(set_contents_var), state = NIL, state = do_set_contents_initial_state(basis_object, set_contents_var); NIL == do_set_contents_doneP(basis_object, state); state = do_set_contents_update_state(state)) {
            module = do_set_contents_next(basis_object, state);
            if (NIL != do_set_contents_element_validP(state, module)) {
                v_modules = cons(module, v_modules);
            }
        }
        return v_modules;
    }

    /**
     * Declare a conjunctive inference removal module named NAME.
     * Allowed properties in PLIST:
     * :every-predicates <listp of predicate-p>; a necessary condition for applicability;
     * the clause must contain every predicate in the list for MODULE to apply.
     * :applicability <function-spec-p>; a unary function whose single argument is
     * a contextualized-dnf-clause-p.  Its return value is a list of subclause-spec-p
     * indicating which subclauses of the input clause MODULE applies to.
     *
     * @unknown each of the returned subclauses must be a multi-literal-subclause-spec?.
    :cost <function-spec-p>; a unary function whose single argument is
    a contextualized-dnf-clause-p.  Its return value is a non-negative number which is
    the expected number of bindings returned by MODULE when MODULE applies
    to the entire input clause, i.e. the return value of the applicability method
    is a singleton whose sole element picks out the totality of the input clause.
    A special case is that if it returns a zero, this indicates that this module
    does not in fact apply.
    :expand <function-spec-p>; a unary function whose single argument is
    a contextualized-dnf-clause-p.  Its return value is NIL and it works by
    side effect, calling @xref conjunctive-removal-callback once for each
    binding list it determines to be an answer.  The JUSTIFICATIONS argument
    to @xref conjunctive-removal-callback is an ordered list of hl-justification-p.
    Each justification in JUSTIFICATIONS is a justification for a particular
    literal in the input clause, neg-lits first followed by pos-lits.
    :documentation <stringp>; an explanation of what types of queries MODULE solves.
    :example <stringp>; an example query that could be solved by MODULE.
     */
    @LispMethod(comment = "Declare a conjunctive inference removal module named NAME.\r\nAllowed properties in PLIST:\r\n:every-predicates <listp of predicate-p>; a necessary condition for applicability;\r\nthe clause must contain every predicate in the list for MODULE to apply.\r\n:applicability <function-spec-p>; a unary function whose single argument is\r\na contextualized-dnf-clause-p.  Its return value is a list of subclause-spec-p\r\nindicating which subclauses of the input clause MODULE applies to.\r\n\r\n@unknown each of the returned subclauses must be a multi-literal-subclause-spec?.\r\n:cost <function-spec-p>; a unary function whose single argument is\r\na contextualized-dnf-clause-p.  Its return value is a non-negative number which is\r\nthe expected number of bindings returned by MODULE when MODULE applies\r\nto the entire input clause, i.e. the return value of the applicability method\r\nis a singleton whose sole element picks out the totality of the input clause.\r\nA special case is that if it returns a zero, this indicates that this module\r\ndoes not in fact apply.\r\n:expand <function-spec-p>; a unary function whose single argument is\r\na contextualized-dnf-clause-p.  Its return value is NIL and it works by\r\nside effect, calling @xref conjunctive-removal-callback once for each\r\nbinding list it determines to be an answer.  The JUSTIFICATIONS argument\r\nto @xref conjunctive-removal-callback is an ordered list of hl-justification-p.\r\nEach justification in JUSTIFICATIONS is a justification for a particular\r\nliteral in the input clause, neg-lits first followed by pos-lits.\r\n:documentation <stringp>; an explanation of what types of queries MODULE solves.\r\n:example <stringp>; an example query that could be solved by MODULE.\nDeclare a conjunctive inference removal module named NAME.\nAllowed properties in PLIST:\n:every-predicates <listp of predicate-p>; a necessary condition for applicability;\nthe clause must contain every predicate in the list for MODULE to apply.\n:applicability <function-spec-p>; a unary function whose single argument is\na contextualized-dnf-clause-p.  Its return value is a list of subclause-spec-p\nindicating which subclauses of the input clause MODULE applies to.")
    public static final SubLObject inference_conjunctive_removal_module_alt(SubLObject name, SubLObject plist) {
        {
            SubLObject hl_module = com.cyc.cycjava.cycl.inference.harness.inference_modules.setup_module(name, $REMOVAL_CONJUNCTIVE, plist);
            set.set_add(hl_module, $conjunctive_removal_modules$.getGlobalValue());
            return hl_module;
        }
    }

    /**
     * Declare a conjunctive inference removal module named NAME.
     * Allowed properties in PLIST:
     * :every-predicates <listp of predicate-p>; a necessary condition for applicability;
     * the clause must contain every predicate in the list for MODULE to apply.
     * :applicability <function-spec-p>; a unary function whose single argument is
     * a contextualized-dnf-clause-p.  Its return value is a list of subclause-spec-p
     * indicating which subclauses of the input clause MODULE applies to.
     *
     * @unknown each of the returned subclauses must be a multi-literal-subclause-spec?.
    :cost <function-spec-p>; a unary function whose single argument is
    a contextualized-dnf-clause-p.  Its return value is a non-negative number which is
    the expected number of bindings returned by MODULE when MODULE applies
    to the entire input clause, i.e. the return value of the applicability method
    is a singleton whose sole element picks out the totality of the input clause.
    A special case is that if it returns a zero, this indicates that this module
    does not in fact apply.
    :expand <function-spec-p>; a unary function whose single argument is
    a contextualized-dnf-clause-p.  Its return value is NIL and it works by
    side effect, calling @xref conjunctive-removal-callback once for each
    binding list it determines to be an answer.  The JUSTIFICATIONS argument
    to @xref conjunctive-removal-callback is an ordered list of hl-justification-p.
    Each justification in JUSTIFICATIONS is a justification for a particular
    literal in the input clause, neg-lits first followed by pos-lits.
    :documentation <stringp>; an explanation of what types of queries MODULE solves.
    :example <stringp>; an example query that could be solved by MODULE.
     */
    @LispMethod(comment = "Declare a conjunctive inference removal module named NAME.\r\nAllowed properties in PLIST:\r\n:every-predicates <listp of predicate-p>; a necessary condition for applicability;\r\nthe clause must contain every predicate in the list for MODULE to apply.\r\n:applicability <function-spec-p>; a unary function whose single argument is\r\na contextualized-dnf-clause-p.  Its return value is a list of subclause-spec-p\r\nindicating which subclauses of the input clause MODULE applies to.\r\n\r\n@unknown each of the returned subclauses must be a multi-literal-subclause-spec?.\r\n:cost <function-spec-p>; a unary function whose single argument is\r\na contextualized-dnf-clause-p.  Its return value is a non-negative number which is\r\nthe expected number of bindings returned by MODULE when MODULE applies\r\nto the entire input clause, i.e. the return value of the applicability method\r\nis a singleton whose sole element picks out the totality of the input clause.\r\nA special case is that if it returns a zero, this indicates that this module\r\ndoes not in fact apply.\r\n:expand <function-spec-p>; a unary function whose single argument is\r\na contextualized-dnf-clause-p.  Its return value is NIL and it works by\r\nside effect, calling @xref conjunctive-removal-callback once for each\r\nbinding list it determines to be an answer.  The JUSTIFICATIONS argument\r\nto @xref conjunctive-removal-callback is an ordered list of hl-justification-p.\r\nEach justification in JUSTIFICATIONS is a justification for a particular\r\nliteral in the input clause, neg-lits first followed by pos-lits.\r\n:documentation <stringp>; an explanation of what types of queries MODULE solves.\r\n:example <stringp>; an example query that could be solved by MODULE.\nDeclare a conjunctive inference removal module named NAME.\nAllowed properties in PLIST:\n:every-predicates <listp of predicate-p>; a necessary condition for applicability;\nthe clause must contain every predicate in the list for MODULE to apply.\n:applicability <function-spec-p>; a unary function whose single argument is\na contextualized-dnf-clause-p.  Its return value is a list of subclause-spec-p\nindicating which subclauses of the input clause MODULE applies to.")
    public static SubLObject inference_conjunctive_removal_module(final SubLObject name, final SubLObject plist) {
        final SubLObject hl_module = inference_modules.setup_module(name, $REMOVAL_CONJUNCTIVE, plist);
        set_add(hl_module, inference_modules.$conjunctive_removal_modules$.getGlobalValue());
        return hl_module;
    }

    /**
     * Undeclare the module named NAME as an inference conjunctive removal module.
     */
    @LispMethod(comment = "Undeclare the module named NAME as an inference conjunctive removal module.")
    public static final SubLObject undeclare_inference_conjunctive_removal_module_alt(SubLObject name) {
        {
            SubLObject hl_module = com.cyc.cycjava.cycl.inference.harness.inference_modules.find_hl_module_by_name(name);
            if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_p(hl_module)) {
                com.cyc.cycjava.cycl.inference.harness.inference_modules.remove_hl_module(hl_module);
                return set.set_remove(hl_module, $conjunctive_removal_modules$.getGlobalValue());
            }
        }
        return NIL;
    }

    /**
     * Undeclare the module named NAME as an inference conjunctive removal module.
     */
    @LispMethod(comment = "Undeclare the module named NAME as an inference conjunctive removal module.")
    public static SubLObject undeclare_inference_conjunctive_removal_module(final SubLObject name) {
        final SubLObject hl_module = inference_modules.find_hl_module_by_name(name);
        if (NIL != inference_modules.hl_module_p(hl_module)) {
            inference_modules.remove_hl_module(hl_module);
            return set_remove(hl_module, inference_modules.$conjunctive_removal_modules$.getGlobalValue());
        }
        return NIL;
    }

    public static final SubLObject do_meta_removal_modules_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt134);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject hl_module = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt134);
                    hl_module = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_5 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt134);
                            current_5 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt134);
                            if (NIL == member(current_5, $list_alt78, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_5 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt134);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(DO_LIST, list(hl_module, $list_alt162, $DONE, done), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_meta_removal_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, inference_modules.$list147);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject hl_module = NIL;
        destructuring_bind_must_consp(current, datum, inference_modules.$list147);
        hl_module = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$7 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, inference_modules.$list147);
            current_$7 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, inference_modules.$list147);
            if (NIL == member(current_$7, inference_modules.$list87, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$7 == inference_modules.$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, inference_modules.$list147);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_LIST, list(hl_module, inference_modules.$list179, $DONE, done), append(body, NIL));
    }

    public static final SubLObject meta_removal_modules_alt() {
        return $meta_removal_modules$.getGlobalValue();
    }

    public static SubLObject meta_removal_modules() {
        return inference_modules.$meta_removal_modules$.getGlobalValue();
    }

    public static final SubLObject meta_removal_module_list_alt() {
        return copy_list($meta_removal_modules$.getGlobalValue());
    }

    public static SubLObject meta_removal_module_list() {
        return copy_list(inference_modules.$meta_removal_modules$.getGlobalValue());
    }

    public static final SubLObject meta_removal_module_p_alt(SubLObject v_object) {
        {
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.inference.harness.inference_modules.meta_removal_modules();
            SubLObject module = NIL;
            for (module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module = cdolist_list_var.first()) {
                if (v_object == module) {
                    return T;
                }
            }
        }
        return NIL;
    }

    public static SubLObject meta_removal_module_p(final SubLObject v_object) {
        SubLObject cdolist_list_var = inference_modules.meta_removal_modules();
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

    public static final SubLObject meta_removal_module_count_alt() {
        return length($meta_removal_modules$.getGlobalValue());
    }

    public static SubLObject meta_removal_module_count() {
        return length(inference_modules.$meta_removal_modules$.getGlobalValue());
    }

    /**
     *
     *
     * @return listp; a list of predicates with specific removal modules
    that want to use this meta-removal module.
     */
    @LispMethod(comment = "@return listp; a list of predicates with specific removal modules\r\nthat want to use this meta-removal module.")
    public static final SubLObject meta_removal_module_specific_predicates_alt(SubLObject meta_removal_module) {
        return list_utilities.alist_lookup($removal_modules_specific_use_meta_removal$.getGlobalValue(), meta_removal_module, symbol_function(EQ), UNPROVIDED);
    }

    /**
     *
     *
     * @return listp; a list of predicates with specific removal modules
    that want to use this meta-removal module.
     */
    @LispMethod(comment = "@return listp; a list of predicates with specific removal modules\r\nthat want to use this meta-removal module.")
    public static SubLObject meta_removal_module_specific_predicates(final SubLObject meta_removal_module) {
        return alist_lookup(inference_modules.$removal_modules_specific_use_meta_removal$.getGlobalValue(), meta_removal_module, symbol_function(EQL), UNPROVIDED);
    }

    public static final SubLObject meta_removal_module_specific_predicateP_alt(SubLObject meta_removal_module, SubLObject predicate) {
        return list_utilities.member_eqP(predicate, com.cyc.cycjava.cycl.inference.harness.inference_modules.meta_removal_module_specific_predicates(meta_removal_module));
    }

    public static SubLObject meta_removal_module_specific_predicateP(final SubLObject meta_removal_module, final SubLObject predicate) {
        return subl_promotions.memberP(predicate, inference_modules.meta_removal_module_specific_predicates(meta_removal_module), UNPROVIDED, UNPROVIDED);
    }

    /**
     * All predicates use all meta-removal modules unless they are solely specific
     * and have not been stated as @xref inference-removal-module-use-meta-removal.
     */
    @LispMethod(comment = "All predicates use all meta-removal modules unless they are solely specific\r\nand have not been stated as @xref inference-removal-module-use-meta-removal.\nAll predicates use all meta-removal modules unless they are solely specific\nand have not been stated as @xref inference-removal-module-use-meta-removal.")
    public static final SubLObject predicate_uses_meta_removal_moduleP_alt(SubLObject predicate, SubLObject meta_removal_module) {
        if (NIL != forts.fort_p(predicate)) {
            if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_modules.solely_specific_removal_module_predicateP(predicate)) {
                if (NIL == com.cyc.cycjava.cycl.inference.harness.inference_modules.meta_removal_module_specific_predicateP(meta_removal_module, predicate)) {
                    return NIL;
                }
            }
        }
        return T;
    }

    /**
     * All predicates use all meta-removal modules unless they are solely specific
     * and have not been stated as @xref inference-removal-module-use-meta-removal.
     */
    @LispMethod(comment = "All predicates use all meta-removal modules unless they are solely specific\r\nand have not been stated as @xref inference-removal-module-use-meta-removal.\nAll predicates use all meta-removal modules unless they are solely specific\nand have not been stated as @xref inference-removal-module-use-meta-removal.")
    public static SubLObject predicate_uses_meta_removal_moduleP(final SubLObject predicate, final SubLObject meta_removal_module) {
        if (((NIL != fort_p(predicate)) && (NIL != inference_modules.solely_specific_removal_module_predicateP(predicate))) && (NIL == inference_modules.meta_removal_module_specific_predicateP(meta_removal_module, predicate))) {
            return NIL;
        }
        return T;
    }

    /**
     * Meta-removal modules are modules which execute other removal tactics on the same problem.
     * They use the same required, cost, and completeness handling as removal modules,
     * but their execution is handled specially by the harness.
     */
    @LispMethod(comment = "Meta-removal modules are modules which execute other removal tactics on the same problem.\r\nThey use the same required, cost, and completeness handling as removal modules,\r\nbut their execution is handled specially by the harness.\nMeta-removal modules are modules which execute other removal tactics on the same problem.\nThey use the same required, cost, and completeness handling as removal modules,\nbut their execution is handled specially by the harness.")
    public static final SubLObject inference_meta_removal_module_alt(SubLObject name, SubLObject plist) {
        if (plist == UNPROVIDED) {
            plist = NIL;
        }
        {
            SubLObject hl_module = com.cyc.cycjava.cycl.inference.harness.inference_modules.setup_module(name, $META_REMOVAL, plist);
            SubLObject item_var = hl_module;
            if (NIL == member(item_var, $meta_removal_modules$.getGlobalValue(), symbol_function(EQ), symbol_function(IDENTITY))) {
                $meta_removal_modules$.setGlobalValue(cons(item_var, $meta_removal_modules$.getGlobalValue()));
            }
            return hl_module;
        }
    }

    /**
     * Meta-removal modules are modules which execute other removal tactics on the same problem.
     * They use the same required, cost, and completeness handling as removal modules,
     * but their execution is handled specially by the harness.
     */
    @LispMethod(comment = "Meta-removal modules are modules which execute other removal tactics on the same problem.\r\nThey use the same required, cost, and completeness handling as removal modules,\r\nbut their execution is handled specially by the harness.\nMeta-removal modules are modules which execute other removal tactics on the same problem.\nThey use the same required, cost, and completeness handling as removal modules,\nbut their execution is handled specially by the harness.")
    public static SubLObject inference_meta_removal_module(final SubLObject name, SubLObject plist) {
        if (plist == UNPROVIDED) {
            plist = NIL;
        }
        final SubLObject item_var;
        final SubLObject hl_module = item_var = inference_modules.setup_module(name, $META_REMOVAL, plist);
        if (NIL == member(item_var, inference_modules.$meta_removal_modules$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            inference_modules.$meta_removal_modules$.setGlobalValue(cons(item_var, inference_modules.$meta_removal_modules$.getGlobalValue()));
        }
        return hl_module;
    }

    /**
     * Returns T if the module participates in a proof that caches out as a removal
     * proof.
     */
    @LispMethod(comment = "Returns T if the module participates in a proof that caches out as a removal\r\nproof.\nReturns T if the module participates in a proof that caches out as a removal\nproof.")
    public static final SubLObject removal_proof_module_p_alt(SubLObject hl_module) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.inference.harness.inference_modules.removal_module_p(hl_module)) || (NIL != com.cyc.cycjava.cycl.inference.harness.inference_modules.conjunctive_removal_module_p(hl_module)));
    }

    @LispMethod(comment = "Returns T if the module participates in a proof that caches out as a removal\r\nproof.\nReturns T if the module participates in a proof that caches out as a removal\nproof.")
    public static SubLObject removal_proof_module_p(final SubLObject hl_module) {
        return makeBoolean((NIL != inference_modules.removal_module_p(hl_module)) || (NIL != inference_modules.conjunctive_removal_module_p(hl_module)));
    }

    public static final SubLObject do_transformation_modules_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt134);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject hl_module = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt134);
                    hl_module = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_6 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt134);
                            current_6 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt134);
                            if (NIL == member(current_6, $list_alt78, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_6 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt134);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(DO_LIST, list(hl_module, $list_alt167, $DONE, done), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_transformation_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, inference_modules.$list147);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject hl_module = NIL;
        destructuring_bind_must_consp(current, datum, inference_modules.$list147);
        hl_module = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$8 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, inference_modules.$list147);
            current_$8 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, inference_modules.$list147);
            if (NIL == member(current_$8, inference_modules.$list87, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$8 == inference_modules.$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, inference_modules.$list147);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_LIST, list(hl_module, inference_modules.$list184, $DONE, done), append(body, NIL));
    }

    public static final SubLObject transformation_modules_alt() {
        return $transformation_modules$.getGlobalValue();
    }

    public static SubLObject transformation_modules() {
        return inference_modules.$transformation_modules$.getGlobalValue();
    }

    public static final SubLObject transformation_module_p_alt(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $transformation_modules$.getGlobalValue());
    }

    public static SubLObject transformation_module_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, inference_modules.$transformation_modules$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject transformation_module_count_alt() {
        return length($transformation_modules$.getGlobalValue());
    }

    public static SubLObject transformation_module_count() {
        return length(inference_modules.$transformation_modules$.getGlobalValue());
    }

    public static final SubLObject inference_transformation_module_alt(SubLObject name, SubLObject plist) {
        {
            SubLObject hl_module = com.cyc.cycjava.cycl.inference.harness.inference_modules.setup_module(name, $TRANSFORMATION, plist);
            SubLObject item_var = hl_module;
            if (NIL == member(item_var, $transformation_modules$.getGlobalValue(), symbol_function(EQ), symbol_function(IDENTITY))) {
                $transformation_modules$.setGlobalValue(cons(item_var, $transformation_modules$.getGlobalValue()));
            }
            return hl_module;
        }
    }

    public static SubLObject inference_transformation_module(final SubLObject name, final SubLObject plist) {
        final SubLObject item_var;
        final SubLObject hl_module = item_var = inference_modules.setup_module(name, $TRANSFORMATION, plist);
        if (NIL == member(item_var, inference_modules.$transformation_modules$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            inference_modules.$transformation_modules$.setGlobalValue(cons(item_var, inference_modules.$transformation_modules$.getGlobalValue()));
        }
        return hl_module;
    }

    public static final SubLObject do_meta_transformation_modules_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt134);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject hl_module = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt134);
                    hl_module = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_7 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt134);
                            current_7 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt134);
                            if (NIL == member(current_7, $list_alt78, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_7 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt134);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(DO_LIST, list(hl_module, $list_alt172, $DONE, done), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_meta_transformation_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, inference_modules.$list147);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject hl_module = NIL;
        destructuring_bind_must_consp(current, datum, inference_modules.$list147);
        hl_module = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$9 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, inference_modules.$list147);
            current_$9 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, inference_modules.$list147);
            if (NIL == member(current_$9, inference_modules.$list87, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$9 == inference_modules.$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, inference_modules.$list147);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_LIST, list(hl_module, inference_modules.$list189, $DONE, done), append(body, NIL));
    }

    public static final SubLObject meta_transformation_modules_alt() {
        return $meta_transformation_modules$.getGlobalValue();
    }

    public static SubLObject meta_transformation_modules() {
        return inference_modules.$meta_transformation_modules$.getGlobalValue();
    }

    public static final SubLObject meta_transformation_module_p_alt(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $meta_transformation_modules$.getGlobalValue());
    }

    public static SubLObject meta_transformation_module_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, inference_modules.$meta_transformation_modules$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject meta_transformation_module_count_alt() {
        return length($meta_transformation_modules$.getGlobalValue());
    }

    public static SubLObject meta_transformation_module_count() {
        return length(inference_modules.$meta_transformation_modules$.getGlobalValue());
    }

    public static final SubLObject inference_meta_transformation_module_alt(SubLObject name, SubLObject plist) {
        if (plist == UNPROVIDED) {
            plist = NIL;
        }
        {
            SubLObject hl_module = com.cyc.cycjava.cycl.inference.harness.inference_modules.setup_module(name, $META_TRANSFORMATION, plist);
            SubLObject item_var = hl_module;
            if (NIL == member(item_var, $meta_transformation_modules$.getGlobalValue(), symbol_function(EQ), symbol_function(IDENTITY))) {
                $meta_transformation_modules$.setGlobalValue(cons(item_var, $meta_transformation_modules$.getGlobalValue()));
            }
            return hl_module;
        }
    }

    public static SubLObject inference_meta_transformation_module(final SubLObject name, SubLObject plist) {
        if (plist == UNPROVIDED) {
            plist = NIL;
        }
        final SubLObject item_var;
        final SubLObject hl_module = item_var = inference_modules.setup_module(name, $META_TRANSFORMATION, plist);
        if (NIL == member(item_var, inference_modules.$meta_transformation_modules$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            inference_modules.$meta_transformation_modules$.setGlobalValue(cons(item_var, inference_modules.$meta_transformation_modules$.getGlobalValue()));
        }
        return hl_module;
    }

    public static final SubLObject do_rewrite_modules_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt157);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject module = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt157);
                    module = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_8 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt157);
                            current_8 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt157);
                            if (NIL == member(current_8, $list_alt78, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_8 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt157);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(DO_LIST, list(module, $list_alt177, $DONE, done), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_rewrite_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, inference_modules.$list174);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject module = NIL;
        destructuring_bind_must_consp(current, datum, inference_modules.$list174);
        module = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$10 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, inference_modules.$list174);
            current_$10 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, inference_modules.$list174);
            if (NIL == member(current_$10, inference_modules.$list87, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$10 == inference_modules.$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, inference_modules.$list174);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_LIST, list(module, inference_modules.$list194, $DONE, done), append(body, NIL));
    }

    public static final SubLObject rewrite_modules_alt() {
        return copy_list($rewrite_modules$.getGlobalValue());
    }

    public static SubLObject rewrite_modules() {
        return copy_list(inference_modules.$rewrite_modules$.getGlobalValue());
    }

    public static final SubLObject rewrite_module_p_alt(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $rewrite_modules$.getGlobalValue());
    }

    public static SubLObject rewrite_module_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, inference_modules.$rewrite_modules$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject rewrite_module_count_alt() {
        return length($rewrite_modules$.getGlobalValue());
    }

    public static SubLObject rewrite_module_count() {
        return length(inference_modules.$rewrite_modules$.getGlobalValue());
    }

    /**
     *
     *
     * @return hl-support-p; Returns the rewrite support associated with MODULE.
     */
    @LispMethod(comment = "@return hl-support-p; Returns the rewrite support associated with MODULE.")
    public static final SubLObject rewrite_module_support_alt(SubLObject module) {
        {
            SubLObject support_spec = com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_property_without_values(module, $REWRITE_SUPPORT);
            if (support_spec.isSymbol()) {
                return symbol_value(support_spec);
            } else {
                return support_spec;
            }
        }
    }

    /**
     *
     *
     * @return hl-support-p; Returns the rewrite support associated with MODULE.
     */
    @LispMethod(comment = "@return hl-support-p; Returns the rewrite support associated with MODULE.")
    public static SubLObject rewrite_module_support(final SubLObject module) {
        final SubLObject support_spec = inference_modules.hl_module_property_without_values(module, $REWRITE_SUPPORT);
        if (support_spec.isSymbol()) {
            return symbol_value(support_spec);
        }
        return support_spec;
    }

    /**
     *
     *
     * @return function-spec-p; Returns the function that generates the closure of rewrites for MODULE.
     */
    @LispMethod(comment = "@return function-spec-p; Returns the function that generates the closure of rewrites for MODULE.")
    public static final SubLObject rewrite_module_closure_alt(SubLObject module) {
        return com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_property_without_values(module, $REWRITE_CLOSURE);
    }

    /**
     *
     *
     * @return function-spec-p; Returns the function that generates the closure of rewrites for MODULE.
     */
    @LispMethod(comment = "@return function-spec-p; Returns the function that generates the closure of rewrites for MODULE.")
    public static SubLObject rewrite_module_closure(final SubLObject module) {
        return inference_modules.hl_module_property_without_values(module, $REWRITE_CLOSURE);
    }

    /**
     * Declares NAME to be a rewrite module, with properties specified by PLIST.
     */
    @LispMethod(comment = "Declares NAME to be a rewrite module, with properties specified by PLIST.")
    public static final SubLObject inference_rewrite_module_alt(SubLObject name, SubLObject plist) {
        {
            SubLObject strengthened_plist = com.cyc.cycjava.cycl.inference.harness.inference_modules.strengthen_rewrite_module_properties(name, plist);
            SubLObject hl_module = com.cyc.cycjava.cycl.inference.harness.inference_modules.setup_module(name, $REWRITE, strengthened_plist);
            SubLObject item_var = hl_module;
            if (NIL == member(item_var, $rewrite_modules$.getGlobalValue(), symbol_function(EQ), symbol_function(IDENTITY))) {
                $rewrite_modules$.setGlobalValue(cons(item_var, $rewrite_modules$.getGlobalValue()));
            }
            return hl_module;
        }
    }

    @LispMethod(comment = "Declares NAME to be a rewrite module, with properties specified by PLIST.")
    public static SubLObject inference_rewrite_module(final SubLObject name, final SubLObject plist) {
        final SubLObject strengthened_plist = inference_modules.strengthen_rewrite_module_properties(name, plist);
        final SubLObject item_var;
        final SubLObject hl_module = item_var = inference_modules.setup_module(name, $REWRITE, strengthened_plist);
        if (NIL == member(item_var, inference_modules.$rewrite_modules$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            inference_modules.$rewrite_modules$.setGlobalValue(cons(item_var, inference_modules.$rewrite_modules$.getGlobalValue()));
        }
        return hl_module;
    }

    public static final SubLObject undeclare_rewrite_module_alt(SubLObject hl_module) {
        return com.cyc.cycjava.cycl.inference.harness.inference_modules.deregister_rewrite_module(hl_module);
    }

    public static SubLObject undeclare_rewrite_module(final SubLObject hl_module) {
        return inference_modules.deregister_rewrite_module(hl_module);
    }

    public static final SubLObject undeclare_rewrite_module_by_name_alt(SubLObject name) {
        return com.cyc.cycjava.cycl.inference.harness.inference_modules.deregister_rewrite_module_by_name(name);
    }

    public static SubLObject undeclare_rewrite_module_by_name(final SubLObject name) {
        return inference_modules.deregister_rewrite_module_by_name(name);
    }

    /**
     * Undeclare MODULE as an HL rewrite module.
     */
    @LispMethod(comment = "Undeclare MODULE as an HL rewrite module.")
    public static final SubLObject deregister_rewrite_module_alt(SubLObject module) {
        com.cyc.cycjava.cycl.inference.harness.inference_modules.remove_hl_module(module);
        $rewrite_modules$.setGlobalValue(remove(module, $rewrite_modules$.getGlobalValue(), symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return module;
    }

    @LispMethod(comment = "Undeclare MODULE as an HL rewrite module.")
    public static SubLObject deregister_rewrite_module(final SubLObject module) {
        inference_modules.remove_hl_module(module);
        inference_modules.$rewrite_modules$.setGlobalValue(remove(module, inference_modules.$rewrite_modules$.getGlobalValue(), symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return module;
    }

    /**
     * Undeclare the HL rewrite module by name NAME.
     */
    @LispMethod(comment = "Undeclare the HL rewrite module by name NAME.")
    public static final SubLObject deregister_rewrite_module_by_name_alt(SubLObject name) {
        {
            SubLObject module = com.cyc.cycjava.cycl.inference.harness.inference_modules.find_hl_module_by_name(name);
            return com.cyc.cycjava.cycl.inference.harness.inference_modules.deregister_rewrite_module(module);
        }
    }

    @LispMethod(comment = "Undeclare the HL rewrite module by name NAME.")
    public static SubLObject deregister_rewrite_module_by_name(final SubLObject name) {
        final SubLObject module = inference_modules.find_hl_module_by_name(name);
        return inference_modules.deregister_rewrite_module(module);
    }

    public static final SubLObject strengthen_rewrite_module_properties_alt(SubLObject name, SubLObject plist) {
        plist = copy_tree(plist);
        {
            SubLObject sense = getf(plist, $SENSE, UNPROVIDED);
            SubLObject pcase_var = sense;
            if (pcase_var.eql($POS) || pcase_var.eql($NEG)) {
            } else {
                Errors.error($str_alt181$rewrite_module__S_must_have_a__SE, name);
            }
        }
        return plist;
    }

    public static SubLObject strengthen_rewrite_module_properties(final SubLObject name, SubLObject plist) {
        plist = copy_tree(plist);
        final SubLObject pcase_var;
        final SubLObject sense = pcase_var = getf(plist, $SENSE, UNPROVIDED);
        if (!pcase_var.eql($POS)) {
            if (!pcase_var.eql($NEG)) {
                Errors.error(inference_modules.$str198$rewrite_module__S_must_have_a__SE, name);
            }
        }
        return plist;
    }

    public static final SubLObject structural_module_p_alt(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $structural_modules$.getGlobalValue());
    }

    public static SubLObject structural_module_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, inference_modules.$structural_modules$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject inference_structural_module_alt(SubLObject name, SubLObject plist) {
        if (plist == UNPROVIDED) {
            plist = NIL;
        }
        {
            SubLObject hl_module = com.cyc.cycjava.cycl.inference.harness.inference_modules.setup_module(name, $STRUCTURAL, plist);
            SubLObject item_var = hl_module;
            if (NIL == member(item_var, $structural_modules$.getGlobalValue(), symbol_function(EQ), symbol_function(IDENTITY))) {
                $structural_modules$.setGlobalValue(cons(item_var, $structural_modules$.getGlobalValue()));
            }
            return hl_module;
        }
    }

    public static SubLObject inference_structural_module(final SubLObject name, SubLObject plist) {
        if (plist == UNPROVIDED) {
            plist = NIL;
        }
        final SubLObject item_var;
        final SubLObject hl_module = item_var = inference_modules.setup_module(name, $STRUCTURAL, plist);
        if (NIL == member(item_var, inference_modules.$structural_modules$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            inference_modules.$structural_modules$.setGlobalValue(cons(item_var, inference_modules.$structural_modules$.getGlobalValue()));
        }
        return hl_module;
    }

    public static final SubLObject structural_module_count_alt() {
        return length($structural_modules$.getGlobalValue());
    }

    public static SubLObject structural_module_count() {
        return length(inference_modules.$structural_modules$.getGlobalValue());
    }

    public static final SubLObject do_meta_structural_modules_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt134);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject hl_module = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt134);
                    hl_module = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_9 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt134);
                            current_9 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt134);
                            if (NIL == member(current_9, $list_alt78, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_9 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt134);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(DO_LIST, list(hl_module, $list_alt185, $DONE, done), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_meta_structural_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, inference_modules.$list147);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject hl_module = NIL;
        destructuring_bind_must_consp(current, datum, inference_modules.$list147);
        hl_module = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$11 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, inference_modules.$list147);
            current_$11 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, inference_modules.$list147);
            if (NIL == member(current_$11, inference_modules.$list87, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$11 == inference_modules.$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, inference_modules.$list147);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_LIST, list(hl_module, inference_modules.$list202, $DONE, done), append(body, NIL));
    }

    public static final SubLObject meta_structural_modules_alt() {
        return $meta_structural_modules$.getGlobalValue();
    }

    public static SubLObject meta_structural_modules() {
        return inference_modules.$meta_structural_modules$.getGlobalValue();
    }

    public static final SubLObject meta_structural_module_p_alt(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $meta_structural_modules$.getGlobalValue());
    }

    public static SubLObject meta_structural_module_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, inference_modules.$meta_structural_modules$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject meta_structural_module_count_alt() {
        return length($meta_structural_modules$.getGlobalValue());
    }

    public static SubLObject meta_structural_module_count() {
        return length(inference_modules.$meta_structural_modules$.getGlobalValue());
    }

    public static final SubLObject inference_meta_structural_module_alt(SubLObject name, SubLObject plist) {
        if (plist == UNPROVIDED) {
            plist = NIL;
        }
        {
            SubLObject hl_module = com.cyc.cycjava.cycl.inference.harness.inference_modules.setup_module(name, $META_STRUCTURAL, plist);
            SubLObject item_var = hl_module;
            if (NIL == member(item_var, $meta_structural_modules$.getGlobalValue(), symbol_function(EQ), symbol_function(IDENTITY))) {
                $meta_structural_modules$.setGlobalValue(cons(item_var, $meta_structural_modules$.getGlobalValue()));
            }
            return hl_module;
        }
    }

    public static SubLObject inference_meta_structural_module(final SubLObject name, SubLObject plist) {
        if (plist == UNPROVIDED) {
            plist = NIL;
        }
        final SubLObject item_var;
        final SubLObject hl_module = item_var = inference_modules.setup_module(name, $META_STRUCTURAL, plist);
        if (NIL == member(item_var, inference_modules.$meta_structural_modules$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            inference_modules.$meta_structural_modules$.setGlobalValue(cons(item_var, inference_modules.$meta_structural_modules$.getGlobalValue()));
        }
        return hl_module;
    }

    public static final SubLObject cfasl_output_object_hl_module_method_alt(SubLObject v_object, SubLObject stream) {
        return com.cyc.cycjava.cycl.inference.harness.inference_modules.cfasl_wide_output_hl_module(v_object, stream);
    }

    public static SubLObject cfasl_output_object_hl_module_method(final SubLObject v_object, final SubLObject stream) {
        return inference_modules.cfasl_wide_output_hl_module(v_object, stream);
    }

    public static final SubLObject cfasl_wide_output_hl_module_alt(SubLObject hl_module, SubLObject stream) {
        cfasl_output_wide_opcode($cfasl_wide_opcode_hl_module$.getGlobalValue(), stream);
        com.cyc.cycjava.cycl.inference.harness.inference_modules.cfasl_output_hl_module_internal(hl_module, stream);
        return hl_module;
    }

    public static SubLObject cfasl_wide_output_hl_module(final SubLObject hl_module, final SubLObject stream) {
        cfasl_output_wide_opcode(inference_modules.$cfasl_wide_opcode_hl_module$.getGlobalValue(), stream);
        inference_modules.cfasl_output_hl_module_internal(hl_module, stream);
        return hl_module;
    }

    public static final SubLObject cfasl_output_hl_module_internal_alt(SubLObject hl_module, SubLObject stream) {
        cfasl_output(com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_name(hl_module), stream);
        cfasl_output(com.cyc.cycjava.cycl.inference.harness.inference_modules.hl_module_plist(hl_module), stream);
        return hl_module;
    }

    public static SubLObject cfasl_output_hl_module_internal(final SubLObject hl_module, final SubLObject stream) {
        cfasl_output(inference_modules.hl_module_name(hl_module), stream);
        cfasl_output(inference_modules.hl_module_plist(hl_module), stream);
        return hl_module;
    }

    public static final SubLObject cfasl_input_hl_module_alt(SubLObject stream) {
        {
            SubLObject name = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject plist = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            return com.cyc.cycjava.cycl.inference.harness.inference_modules.new_hl_module(name, plist);
        }
    }

    public static SubLObject cfasl_input_hl_module(final SubLObject stream) {
        final SubLObject name = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject plist = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        return inference_modules.new_hl_module(name, plist);
    }

    public static SubLObject declare_inference_modules_file() {
        declareFunction("hl_module_property_p", "HL-MODULE-PROPERTY-P", 1, 0, false);
        declareMacro("do_hl_module_properties", "DO-HL-MODULE-PROPERTIES");
        declareFunction("hl_module_properties", "HL-MODULE-PROPERTIES", 0, 0, false);
        declareFunction("removal_module_plist_indicators", "REMOVAL-MODULE-PLIST-INDICATORS", 0, 0, false);
        declareFunction("hl_module_subtype_p", "HL-MODULE-SUBTYPE-P", 1, 0, false);
        declareFunction("allowed_modules_spec_p", "ALLOWED-MODULES-SPEC-P", 1, 0, false);
        new inference_modules.$allowed_modules_spec_p$UnaryFunction();
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
        new inference_modules.$hl_module_p$UnaryFunction();
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
        new inference_modules.$sxhash_hl_module_method$UnaryFunction();
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
        new inference_modules.$hl_module_sense$UnaryFunction();
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

    static private final SubLList $list_alt1 = list(new SubLObject[]{ makeKeyword("MODULE-TYPE"), makeKeyword("MODULE-SUBTYPE"), makeKeyword("MODULE-SOURCE"), makeKeyword("CHECK"), makeKeyword("EXTERNAL"), makeKeyword("UNIVERSAL"), makeKeyword("SENSE"), makeKeyword("DIRECTION"), makeKeyword("PREDICATE"), makeKeyword("EVERY-PREDICATES"), makeKeyword("ANY-PREDICATES"), makeKeyword("REQUIRED-PATTERN"), makeKeyword("REQUIRED-MT"), makeKeyword("ARITY"), makeKeyword("EXCLUSIVE"), makeKeyword("SUPPLANTS"), makeKeyword("REQUIRED"), makeKeyword("APPLICABILITY-PATTERN"), makeKeyword("APPLICABILITY"), makeKeyword("COST-PATTERN"), makeKeyword("COST-EXPRESSION"), $COST, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE-PATTERN"), makeKeyword("COMPLETENESS-PATTERN"), makeKeyword("INPUT-EXTRACT-PATTERN"), makeKeyword("INPUT-VERIFY-PATTERN"), makeKeyword("INPUT-ENCODE-PATTERN"), makeKeyword("OUTPUT-CHECK-PATTERN"), makeKeyword("OUTPUT-GENERATE-PATTERN"), makeKeyword("OUTPUT-DECODE-PATTERN"), makeKeyword("OUTPUT-VERIFY-PATTERN"), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), makeKeyword("RULE-SELECT"), makeKeyword("RULE-FILTER"), makeKeyword("EXPAND-ITERATIVE-PATTERN"), makeKeyword("EXPAND-PATTERN"), makeKeyword("EXPAND"), makeKeyword("REWRITE-CLOSURE"), makeKeyword("SUPPORT-PATTERN"), makeKeyword("SUPPORT"), makeKeyword("SUPPORT-MODULE"), makeKeyword("SUPPORT-MT"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("REWRITE-SUPPORT"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("INCOMPLETENESS"), makeKeyword("ADD"), makeKeyword("REMOVE"), makeKeyword("REMOVE-ALL"), makeKeyword("PREFERRED-OVER"), makeKeyword("DOCUMENTATION"), makeKeyword("EXAMPLE"), makeKeyword("PRETTY-NAME") });

    public static final SubLObject init_inference_modules_file_alt() {
        deflexical("*META-REMOVAL-MODULES*", NIL != boundp($meta_removal_modules$) ? ((SubLObject) ($meta_removal_modules$.getGlobalValue())) : NIL);
        deflexical("*HL-MODULE-PROPERTIES*", $list_alt1);
        deflexical("*VALID-HL-MODULE-SUBTYPES*", $list_alt10);
        deflexical("*DEFAULT-HL-MODULE-SUBTYPE*", $KB);
        deflexical("*HL-MODULE-PROPERTY-DEFAULTS*", dictionary_utilities.new_dictionary_from_alist(reverse(listS($list_alt12, list($MODULE_SUBTYPE, $default_hl_module_subtype$.getGlobalValue()), $list_alt14)), symbol_function(EQ)));
        defconstant("*DTP-HL-MODULE*", HL_MODULE);
        deflexical("*HL-MODULE-STORE*", NIL != boundp($hl_module_store$) ? ((SubLObject) ($hl_module_store$.getGlobalValue())) : make_hash_table($int$212, symbol_function(EQUAL), UNPROVIDED));
        deflexical("*REMOVAL-MODULES*", NIL != boundp($removal_modules$) ? ((SubLObject) ($removal_modules$.getGlobalValue())) : set.new_set(symbol_function(EQ), UNPROVIDED));
        deflexical("*REMOVAL-MODULES-EXTERNAL*", NIL != boundp($removal_modules_external$) ? ((SubLObject) ($removal_modules_external$.getGlobalValue())) : NIL);
        deflexical("*REMOVAL-MODULES-GENERIC*", NIL != boundp($removal_modules_generic$) ? ((SubLObject) ($removal_modules_generic$.getGlobalValue())) : NIL);
        deflexical("*REMOVAL-MODULES-UNIVERSAL*", NIL != boundp($removal_modules_universal$) ? ((SubLObject) ($removal_modules_universal$.getGlobalValue())) : NIL);
        deflexical("*REMOVAL-MODULES-SPECIFIC*", NIL != boundp($removal_modules_specific$) ? ((SubLObject) ($removal_modules_specific$.getGlobalValue())) : make_hash_table($int$32, UNPROVIDED, UNPROVIDED));
        deflexical("*REMOVAL-MODULES-SPECIFIC-USE-GENERIC*", NIL != boundp($removal_modules_specific_use_generic$) ? ((SubLObject) ($removal_modules_specific_use_generic$.getGlobalValue())) : NIL);
        deflexical("*REMOVAL-MODULES-SPECIFIC-USE-META-REMOVAL*", NIL != boundp($removal_modules_specific_use_meta_removal$) ? ((SubLObject) ($removal_modules_specific_use_meta_removal$.getGlobalValue())) : NIL);
        deflexical("*REMOVAL-MODULES-SPECIFIC-DONT-USE-UNIVERSAL*", NIL != boundp($removal_modules_specific_dont_use_universal$) ? ((SubLObject) ($removal_modules_specific_dont_use_universal$.getGlobalValue())) : NIL);
        deflexical("*SOLELY-SPECIFIC-REMOVAL-MODULE-PREDICATE-STORE*", NIL != boundp($solely_specific_removal_module_predicate_store$) ? ((SubLObject) ($solely_specific_removal_module_predicate_store$.getGlobalValue())) : set.new_set(EQ, $int$50));
        deflexical("*CONJUNCTIVE-REMOVAL-MODULES*", NIL != boundp($conjunctive_removal_modules$) ? ((SubLObject) ($conjunctive_removal_modules$.getGlobalValue())) : set.new_set(symbol_function(EQ), UNPROVIDED));
        deflexical("*TRANSFORMATION-MODULES*", NIL != boundp($transformation_modules$) ? ((SubLObject) ($transformation_modules$.getGlobalValue())) : NIL);
        deflexical("*META-TRANSFORMATION-MODULES*", NIL != boundp($meta_transformation_modules$) ? ((SubLObject) ($meta_transformation_modules$.getGlobalValue())) : NIL);
        deflexical("*REWRITE-MODULES*", NIL != boundp($rewrite_modules$) ? ((SubLObject) ($rewrite_modules$.getGlobalValue())) : NIL);
        deflexical("*STRUCTURAL-MODULES*", NIL != boundp($structural_modules$) ? ((SubLObject) ($structural_modules$.getGlobalValue())) : NIL);
        deflexical("*META-STRUCTURAL-MODULES*", NIL != boundp($meta_structural_modules$) ? ((SubLObject) ($meta_structural_modules$.getGlobalValue())) : NIL);
        defconstant("*CFASL-WIDE-OPCODE-HL-MODULE*", $int$256);
        return NIL;
    }

    public static SubLObject init_inference_modules_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*META-REMOVAL-MODULES*", SubLTrampolineFile.maybeDefault(inference_modules.$meta_removal_modules$, inference_modules.$meta_removal_modules$, NIL));
            deflexical("*HL-MODULE-PROPERTIES*", inference_modules.$list1);
            deflexical("*VALID-HL-MODULE-SUBTYPES*", inference_modules.$list10);
            deflexical("*DEFAULT-HL-MODULE-SUBTYPE*", $KB);
            deflexical("*HL-MODULE-PROPERTY-DEFAULTS*", new_dictionary_from_alist(reverse(listS(inference_modules.$list12, list($MODULE_SUBTYPE, inference_modules.$default_hl_module_subtype$.getGlobalValue()), inference_modules.$list14)), symbol_function(EQL)));
            defconstant("*DTP-HL-MODULE*", HL_MODULE);
            deflexical("*CFASL-CREATE-INVALID-HL-MODULE-CACHING-STATE*", NIL);
            deflexical("*HL-MODULE-STORE*", SubLTrampolineFile.maybeDefault(inference_modules.$hl_module_store$, inference_modules.$hl_module_store$, () -> make_hash_table(inference_modules.$int$212, symbol_function(EQUAL), UNPROVIDED)));
            deflexical("*REMOVAL-MODULES*", SubLTrampolineFile.maybeDefault(inference_modules.$removal_modules$, inference_modules.$removal_modules$, () -> new_set(symbol_function(EQL), UNPROVIDED)));
            deflexical("*REMOVAL-MODULES-EXTERNAL*", SubLTrampolineFile.maybeDefault(inference_modules.$removal_modules_external$, inference_modules.$removal_modules_external$, NIL));
            deflexical("*REMOVAL-MODULES-GENERIC*", SubLTrampolineFile.maybeDefault(inference_modules.$removal_modules_generic$, inference_modules.$removal_modules_generic$, NIL));
            deflexical("*REMOVAL-MODULES-UNIVERSAL*", SubLTrampolineFile.maybeDefault(inference_modules.$removal_modules_universal$, inference_modules.$removal_modules_universal$, NIL));
            deflexical("*REMOVAL-MODULES-SPECIFIC*", SubLTrampolineFile.maybeDefault(inference_modules.$removal_modules_specific$, inference_modules.$removal_modules_specific$, () -> make_hash_table($int$32, UNPROVIDED, UNPROVIDED)));
            deflexical("*REMOVAL-MODULES-SPECIFIC-USE-GENERIC*", SubLTrampolineFile.maybeDefault(inference_modules.$removal_modules_specific_use_generic$, inference_modules.$removal_modules_specific_use_generic$, NIL));
            deflexical("*REMOVAL-MODULES-SPECIFIC-USE-META-REMOVAL*", SubLTrampolineFile.maybeDefault(inference_modules.$removal_modules_specific_use_meta_removal$, inference_modules.$removal_modules_specific_use_meta_removal$, NIL));
            deflexical("*REMOVAL-MODULES-SPECIFIC-DONT-USE-UNIVERSAL*", SubLTrampolineFile.maybeDefault(inference_modules.$removal_modules_specific_dont_use_universal$, inference_modules.$removal_modules_specific_dont_use_universal$, NIL));
            deflexical("*SOLELY-SPECIFIC-REMOVAL-MODULE-PREDICATE-STORE*", SubLTrampolineFile.maybeDefault(inference_modules.$solely_specific_removal_module_predicate_store$, inference_modules.$solely_specific_removal_module_predicate_store$, () -> new_set(EQL, inference_modules.$int$50)));
            defparameter("*CLASSIFY-REMOVAL-MODULES-WITH-DETERMINISTIC-SORT?*", T);
            deflexical("*REMOVAL-PRUNING-MODULE-PROPERTIES*", inference_modules.$list171);
            deflexical("*CONJUNCTIVE-REMOVAL-MODULES*", SubLTrampolineFile.maybeDefault(inference_modules.$conjunctive_removal_modules$, inference_modules.$conjunctive_removal_modules$, () -> new_set(symbol_function(EQL), UNPROVIDED)));
            deflexical("*TRANSFORMATION-MODULES*", SubLTrampolineFile.maybeDefault(inference_modules.$transformation_modules$, inference_modules.$transformation_modules$, NIL));
            deflexical("*META-TRANSFORMATION-MODULES*", SubLTrampolineFile.maybeDefault(inference_modules.$meta_transformation_modules$, inference_modules.$meta_transformation_modules$, NIL));
            deflexical("*REWRITE-MODULES*", SubLTrampolineFile.maybeDefault(inference_modules.$rewrite_modules$, inference_modules.$rewrite_modules$, NIL));
            deflexical("*STRUCTURAL-MODULES*", SubLTrampolineFile.maybeDefault(inference_modules.$structural_modules$, inference_modules.$structural_modules$, NIL));
            deflexical("*META-STRUCTURAL-MODULES*", SubLTrampolineFile.maybeDefault(inference_modules.$meta_structural_modules$, inference_modules.$meta_structural_modules$, NIL));
            defconstant("*CFASL-WIDE-OPCODE-HL-MODULE*", $int$256);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*META-REMOVAL-MODULES*", NIL != boundp($meta_removal_modules$) ? ((SubLObject) ($meta_removal_modules$.getGlobalValue())) : NIL);
            deflexical("*HL-MODULE-PROPERTY-DEFAULTS*", dictionary_utilities.new_dictionary_from_alist(reverse(listS($list_alt12, list($MODULE_SUBTYPE, $default_hl_module_subtype$.getGlobalValue()), $list_alt14)), symbol_function(EQ)));
            deflexical("*HL-MODULE-STORE*", NIL != boundp($hl_module_store$) ? ((SubLObject) ($hl_module_store$.getGlobalValue())) : make_hash_table($int$212, symbol_function(EQUAL), UNPROVIDED));
            deflexical("*REMOVAL-MODULES*", NIL != boundp($removal_modules$) ? ((SubLObject) ($removal_modules$.getGlobalValue())) : set.new_set(symbol_function(EQ), UNPROVIDED));
            deflexical("*REMOVAL-MODULES-EXTERNAL*", NIL != boundp($removal_modules_external$) ? ((SubLObject) ($removal_modules_external$.getGlobalValue())) : NIL);
            deflexical("*REMOVAL-MODULES-GENERIC*", NIL != boundp($removal_modules_generic$) ? ((SubLObject) ($removal_modules_generic$.getGlobalValue())) : NIL);
            deflexical("*REMOVAL-MODULES-UNIVERSAL*", NIL != boundp($removal_modules_universal$) ? ((SubLObject) ($removal_modules_universal$.getGlobalValue())) : NIL);
            deflexical("*REMOVAL-MODULES-SPECIFIC*", NIL != boundp($removal_modules_specific$) ? ((SubLObject) ($removal_modules_specific$.getGlobalValue())) : make_hash_table($int$32, UNPROVIDED, UNPROVIDED));
            deflexical("*REMOVAL-MODULES-SPECIFIC-USE-GENERIC*", NIL != boundp($removal_modules_specific_use_generic$) ? ((SubLObject) ($removal_modules_specific_use_generic$.getGlobalValue())) : NIL);
            deflexical("*REMOVAL-MODULES-SPECIFIC-USE-META-REMOVAL*", NIL != boundp($removal_modules_specific_use_meta_removal$) ? ((SubLObject) ($removal_modules_specific_use_meta_removal$.getGlobalValue())) : NIL);
            deflexical("*REMOVAL-MODULES-SPECIFIC-DONT-USE-UNIVERSAL*", NIL != boundp($removal_modules_specific_dont_use_universal$) ? ((SubLObject) ($removal_modules_specific_dont_use_universal$.getGlobalValue())) : NIL);
            deflexical("*SOLELY-SPECIFIC-REMOVAL-MODULE-PREDICATE-STORE*", NIL != boundp($solely_specific_removal_module_predicate_store$) ? ((SubLObject) ($solely_specific_removal_module_predicate_store$.getGlobalValue())) : set.new_set(EQ, $int$50));
            deflexical("*CONJUNCTIVE-REMOVAL-MODULES*", NIL != boundp($conjunctive_removal_modules$) ? ((SubLObject) ($conjunctive_removal_modules$.getGlobalValue())) : set.new_set(symbol_function(EQ), UNPROVIDED));
            deflexical("*TRANSFORMATION-MODULES*", NIL != boundp($transformation_modules$) ? ((SubLObject) ($transformation_modules$.getGlobalValue())) : NIL);
            deflexical("*META-TRANSFORMATION-MODULES*", NIL != boundp($meta_transformation_modules$) ? ((SubLObject) ($meta_transformation_modules$.getGlobalValue())) : NIL);
            deflexical("*REWRITE-MODULES*", NIL != boundp($rewrite_modules$) ? ((SubLObject) ($rewrite_modules$.getGlobalValue())) : NIL);
            deflexical("*STRUCTURAL-MODULES*", NIL != boundp($structural_modules$) ? ((SubLObject) ($structural_modules$.getGlobalValue())) : NIL);
            deflexical("*META-STRUCTURAL-MODULES*", NIL != boundp($meta_structural_modules$) ? ((SubLObject) ($meta_structural_modules$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_inference_modules_file_Previous() {
        deflexical("*META-REMOVAL-MODULES*", SubLTrampolineFile.maybeDefault(inference_modules.$meta_removal_modules$, inference_modules.$meta_removal_modules$, NIL));
        deflexical("*HL-MODULE-PROPERTIES*", inference_modules.$list1);
        deflexical("*VALID-HL-MODULE-SUBTYPES*", inference_modules.$list10);
        deflexical("*DEFAULT-HL-MODULE-SUBTYPE*", $KB);
        deflexical("*HL-MODULE-PROPERTY-DEFAULTS*", new_dictionary_from_alist(reverse(listS(inference_modules.$list12, list($MODULE_SUBTYPE, inference_modules.$default_hl_module_subtype$.getGlobalValue()), inference_modules.$list14)), symbol_function(EQL)));
        defconstant("*DTP-HL-MODULE*", HL_MODULE);
        deflexical("*CFASL-CREATE-INVALID-HL-MODULE-CACHING-STATE*", NIL);
        deflexical("*HL-MODULE-STORE*", SubLTrampolineFile.maybeDefault(inference_modules.$hl_module_store$, inference_modules.$hl_module_store$, () -> make_hash_table(inference_modules.$int$212, symbol_function(EQUAL), UNPROVIDED)));
        deflexical("*REMOVAL-MODULES*", SubLTrampolineFile.maybeDefault(inference_modules.$removal_modules$, inference_modules.$removal_modules$, () -> new_set(symbol_function(EQL), UNPROVIDED)));
        deflexical("*REMOVAL-MODULES-EXTERNAL*", SubLTrampolineFile.maybeDefault(inference_modules.$removal_modules_external$, inference_modules.$removal_modules_external$, NIL));
        deflexical("*REMOVAL-MODULES-GENERIC*", SubLTrampolineFile.maybeDefault(inference_modules.$removal_modules_generic$, inference_modules.$removal_modules_generic$, NIL));
        deflexical("*REMOVAL-MODULES-UNIVERSAL*", SubLTrampolineFile.maybeDefault(inference_modules.$removal_modules_universal$, inference_modules.$removal_modules_universal$, NIL));
        deflexical("*REMOVAL-MODULES-SPECIFIC*", SubLTrampolineFile.maybeDefault(inference_modules.$removal_modules_specific$, inference_modules.$removal_modules_specific$, () -> make_hash_table($int$32, UNPROVIDED, UNPROVIDED)));
        deflexical("*REMOVAL-MODULES-SPECIFIC-USE-GENERIC*", SubLTrampolineFile.maybeDefault(inference_modules.$removal_modules_specific_use_generic$, inference_modules.$removal_modules_specific_use_generic$, NIL));
        deflexical("*REMOVAL-MODULES-SPECIFIC-USE-META-REMOVAL*", SubLTrampolineFile.maybeDefault(inference_modules.$removal_modules_specific_use_meta_removal$, inference_modules.$removal_modules_specific_use_meta_removal$, NIL));
        deflexical("*REMOVAL-MODULES-SPECIFIC-DONT-USE-UNIVERSAL*", SubLTrampolineFile.maybeDefault(inference_modules.$removal_modules_specific_dont_use_universal$, inference_modules.$removal_modules_specific_dont_use_universal$, NIL));
        deflexical("*SOLELY-SPECIFIC-REMOVAL-MODULE-PREDICATE-STORE*", SubLTrampolineFile.maybeDefault(inference_modules.$solely_specific_removal_module_predicate_store$, inference_modules.$solely_specific_removal_module_predicate_store$, () -> new_set(EQL, inference_modules.$int$50)));
        defparameter("*CLASSIFY-REMOVAL-MODULES-WITH-DETERMINISTIC-SORT?*", T);
        deflexical("*REMOVAL-PRUNING-MODULE-PROPERTIES*", inference_modules.$list171);
        deflexical("*CONJUNCTIVE-REMOVAL-MODULES*", SubLTrampolineFile.maybeDefault(inference_modules.$conjunctive_removal_modules$, inference_modules.$conjunctive_removal_modules$, () -> new_set(symbol_function(EQL), UNPROVIDED)));
        deflexical("*TRANSFORMATION-MODULES*", SubLTrampolineFile.maybeDefault(inference_modules.$transformation_modules$, inference_modules.$transformation_modules$, NIL));
        deflexical("*META-TRANSFORMATION-MODULES*", SubLTrampolineFile.maybeDefault(inference_modules.$meta_transformation_modules$, inference_modules.$meta_transformation_modules$, NIL));
        deflexical("*REWRITE-MODULES*", SubLTrampolineFile.maybeDefault(inference_modules.$rewrite_modules$, inference_modules.$rewrite_modules$, NIL));
        deflexical("*STRUCTURAL-MODULES*", SubLTrampolineFile.maybeDefault(inference_modules.$structural_modules$, inference_modules.$structural_modules$, NIL));
        deflexical("*META-STRUCTURAL-MODULES*", SubLTrampolineFile.maybeDefault(inference_modules.$meta_structural_modules$, inference_modules.$meta_structural_modules$, NIL));
        defconstant("*CFASL-WIDE-OPCODE-HL-MODULE*", $int$256);
        return NIL;
    }

    static private final SubLList $list_alt2 = list(list(makeSymbol("PROPERTY-VAR"), makeSymbol("VALUE-VAR"), makeSymbol("HL-MODULE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt6 = list(list(makeSymbol("HL-MODULE-PROPERTIES")));

    static private final SubLList $list_alt10 = list($SKSI, makeKeyword("KB"), makeKeyword("ABDUCTION"));

    static private final SubLList $list_alt12 = list(makeKeyword("MODULE-TYPE"));

    static private final SubLList $list_alt14 = list(new SubLObject[]{ list(makeKeyword("MODULE-SOURCE")), list(makeKeyword("UNIVERSAL")), list(makeKeyword("SENSE")), cons(makeKeyword("REQUIRED-PATTERN"), makeKeyword("ANYTHING")), list(makeKeyword("REQUIRED-MT")), list(makeKeyword("REQUIRED")), list(makeKeyword("COST-PATTERN")), list(makeKeyword("COST-EXPRESSION")), cons($COST, makeSymbol("DEFAULT-COST-FUNC")), list(makeKeyword("COMPLETENESS")), list(makeKeyword("COMPLETE-PATTERN")), list(makeKeyword("COMPLETENESS-PATTERN")), cons(makeKeyword("CHECK"), makeKeyword("UNKNOWN")), list(makeKeyword("RULE-SELECT")), cons(makeKeyword("EXPAND"), makeKeyword("DEFAULT")), list(makeKeyword("EXPAND-PATTERN")), list(makeKeyword("EXPAND-ITERATIVE-PATTERN")), list(makeKeyword("PREDICATE")), list(makeKeyword("ARITY")), list(makeKeyword("EXCLUSIVE")), cons(makeKeyword("SUPPLANTS"), makeKeyword("ALL")), cons(makeKeyword("DIRECTION"), makeKeyword("FORWARD")), cons(makeKeyword("INPUT-EXTRACT-PATTERN"), makeKeyword("INPUT")), cons(makeKeyword("INPUT-VERIFY-PATTERN"), makeKeyword("ANYTHING")), cons(makeKeyword("INPUT-ENCODE-PATTERN"), makeKeyword("INPUT")), list(makeKeyword("OUTPUT-CHECK-PATTERN")), list(makeKeyword("OUTPUT-GENERATE-PATTERN")), cons(makeKeyword("OUTPUT-DECODE-PATTERN"), makeKeyword("INPUT")), cons(makeKeyword("OUTPUT-VERIFY-PATTERN"), makeKeyword("ANYTHING")), cons(makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), makeKeyword("INPUT")), list(makeKeyword("SUPPORT-PATTERN")), list(makeKeyword("SUPPORT")), cons(makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE")), list(makeKeyword("SUPPORT-MT")), cons(makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT")), list(makeKeyword("EVERY-PREDICATES")), cons(makeKeyword("APPLICABILITY"), makeSymbol("FALSE")), list(makeKeyword("APPLICABILITY-PATTERN")), list(makeKeyword("ANY-PREDICATES")), cons(makeKeyword("DOCUMENTATION"), makeString("")), cons(makeKeyword("EXAMPLE"), makeString("")), list(makeKeyword("EXTERNAL")), list(makeKeyword("REWRITE-SUPPORT")), list(makeKeyword("REWRITE-CLOSURE")) });

    public static SubLObject setup_inference_modules_file() {
        declare_defglobal(inference_modules.$meta_removal_modules$);
        register_method($print_object_method_table$.getGlobalValue(), inference_modules.$dtp_hl_module$.getGlobalValue(), symbol_function(inference_modules.HL_MODULE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(inference_modules.$list29);
        def_csetf(inference_modules.HL_MOD_NAME, inference_modules._CSETF_HL_MOD_NAME);
        def_csetf(inference_modules.HL_MOD_PLIST, inference_modules._CSETF_HL_MOD_PLIST);
        def_csetf(inference_modules.HL_MOD_SENSE, inference_modules._CSETF_HL_MOD_SENSE);
        def_csetf(inference_modules.HL_MOD_PREDICATE, inference_modules._CSETF_HL_MOD_PREDICATE);
        def_csetf(inference_modules.HL_MOD_ANY_PREDICATES, inference_modules._CSETF_HL_MOD_ANY_PREDICATES);
        def_csetf(inference_modules.HL_MOD_ARITY, inference_modules._CSETF_HL_MOD_ARITY);
        def_csetf(inference_modules.HL_MOD_DIRECTION, inference_modules._CSETF_HL_MOD_DIRECTION);
        def_csetf(inference_modules.HL_MOD_REQUIRED_PATTERN, inference_modules._CSETF_HL_MOD_REQUIRED_PATTERN);
        def_csetf(inference_modules.HL_MOD_REQUIRED_MT, inference_modules._CSETF_HL_MOD_REQUIRED_MT);
        def_csetf(inference_modules.HL_MOD_EXCLUSIVE_FUNC, inference_modules._CSETF_HL_MOD_EXCLUSIVE_FUNC);
        def_csetf(inference_modules.HL_MOD_REQUIRED_FUNC, inference_modules._CSETF_HL_MOD_REQUIRED_FUNC);
        def_csetf(inference_modules.HL_MOD_COMPLETENESS, inference_modules._CSETF_HL_MOD_COMPLETENESS);
        identity(HL_MODULE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), inference_modules.$dtp_hl_module$.getGlobalValue(), symbol_function(inference_modules.VISIT_DEFSTRUCT_OBJECT_HL_MODULE_METHOD));
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), inference_modules.$dtp_hl_module$.getGlobalValue(), symbol_function(inference_modules.SXHASH_HL_MODULE_METHOD));
        memoization_state.note_globally_cached_function(inference_modules.CFASL_CREATE_INVALID_HL_MODULE);
        declare_defglobal(inference_modules.$hl_module_store$);
        register_macro_helper(inference_modules.HL_MODULE_STORE, inference_modules.DO_HL_MODULES);
        declare_defglobal(inference_modules.$removal_modules$);
        register_macro_helper(inference_modules.REMOVAL_MODULES, inference_modules.DO_REMOVAL_MODULES);
        declare_defglobal(inference_modules.$removal_modules_external$);
        declare_defglobal(inference_modules.$removal_modules_generic$);
        declare_defglobal(inference_modules.$removal_modules_universal$);
        declare_defglobal(inference_modules.$removal_modules_specific$);
        declare_defglobal(inference_modules.$removal_modules_specific_use_generic$);
        declare_defglobal(inference_modules.$removal_modules_specific_use_meta_removal$);
        declare_defglobal(inference_modules.$removal_modules_specific_dont_use_universal$);
        declare_defglobal(inference_modules.$solely_specific_removal_module_predicate_store$);
        memoization_state.note_memoized_function(inference_modules.$sym170$REMOVAL_MODULE_SPECIFIC_USE_GENERIC_);
        declare_defglobal(inference_modules.$conjunctive_removal_modules$);
        register_macro_helper(inference_modules.REMOVAL_MODULES_CONJUNCTIVE, inference_modules.DO_CONJUNCTIVE_REMOVAL_MODULES);
        register_macro_helper(inference_modules.META_REMOVAL_MODULES, inference_modules.DO_META_REMOVAL_MODULES);
        declare_defglobal(inference_modules.$transformation_modules$);
        register_macro_helper(inference_modules.TRANSFORMATION_MODULES, inference_modules.DO_TRANSFORMATION_MODULES);
        declare_defglobal(inference_modules.$meta_transformation_modules$);
        register_macro_helper(inference_modules.META_TRANSFORMATION_MODULES, inference_modules.DO_META_TRANSFORMATION_MODULES);
        declare_defglobal(inference_modules.$rewrite_modules$);
        declare_defglobal(inference_modules.$structural_modules$);
        declare_defglobal(inference_modules.$meta_structural_modules$);
        register_macro_helper(inference_modules.META_STRUCTURAL_MODULES, inference_modules.DO_META_STRUCTURAL_MODULES);
        register_wide_cfasl_opcode_input_function(inference_modules.$cfasl_wide_opcode_hl_module$.getGlobalValue(), inference_modules.CFASL_INPUT_HL_MODULE);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), inference_modules.$dtp_hl_module$.getGlobalValue(), symbol_function(inference_modules.CFASL_OUTPUT_OBJECT_HL_MODULE_METHOD));
        return NIL;
    }

    static private final SubLList $list_alt23 = list(new SubLObject[]{ makeSymbol("NAME"), makeSymbol("PLIST"), makeSymbol("SENSE"), makeSymbol("PREDICATE"), makeSymbol("ANY-PREDICATES"), makeSymbol("ARITY"), makeSymbol("DIRECTION"), makeSymbol("REQUIRED-PATTERN"), makeSymbol("REQUIRED-MT"), makeSymbol("EXCLUSIVE-FUNC"), makeSymbol("REQUIRED-FUNC"), makeSymbol("COMPLETENESS") });

    static private final SubLList $list_alt24 = list(new SubLObject[]{ $NAME, makeKeyword("PLIST"), makeKeyword("SENSE"), makeKeyword("PREDICATE"), makeKeyword("ANY-PREDICATES"), makeKeyword("ARITY"), makeKeyword("DIRECTION"), makeKeyword("REQUIRED-PATTERN"), makeKeyword("REQUIRED-MT"), makeKeyword("EXCLUSIVE-FUNC"), makeKeyword("REQUIRED-FUNC"), makeKeyword("COMPLETENESS") });

    static private final SubLList $list_alt25 = list(new SubLObject[]{ makeSymbol("HL-MOD-NAME"), makeSymbol("HL-MOD-PLIST"), makeSymbol("HL-MOD-SENSE"), makeSymbol("HL-MOD-PREDICATE"), makeSymbol("HL-MOD-ANY-PREDICATES"), makeSymbol("HL-MOD-ARITY"), makeSymbol("HL-MOD-DIRECTION"), makeSymbol("HL-MOD-REQUIRED-PATTERN"), makeSymbol("HL-MOD-REQUIRED-MT"), makeSymbol("HL-MOD-EXCLUSIVE-FUNC"), makeSymbol("HL-MOD-REQUIRED-FUNC"), makeSymbol("HL-MOD-COMPLETENESS") });

    static private final SubLList $list_alt26 = list(new SubLObject[]{ makeSymbol("_CSETF-HL-MOD-NAME"), makeSymbol("_CSETF-HL-MOD-PLIST"), makeSymbol("_CSETF-HL-MOD-SENSE"), makeSymbol("_CSETF-HL-MOD-PREDICATE"), makeSymbol("_CSETF-HL-MOD-ANY-PREDICATES"), makeSymbol("_CSETF-HL-MOD-ARITY"), makeSymbol("_CSETF-HL-MOD-DIRECTION"), makeSymbol("_CSETF-HL-MOD-REQUIRED-PATTERN"), makeSymbol("_CSETF-HL-MOD-REQUIRED-MT"), makeSymbol("_CSETF-HL-MOD-EXCLUSIVE-FUNC"), makeSymbol("_CSETF-HL-MOD-REQUIRED-FUNC"), makeSymbol("_CSETF-HL-MOD-COMPLETENESS") });

    @Override
    public void declareFunctions() {
        inference_modules.declare_inference_modules_file();
    }

    @Override
    public void initializeVariables() {
        inference_modules.init_inference_modules_file();
    }

    @Override
    public void runTopLevelForms() {
        inference_modules.setup_inference_modules_file();
    }

    static {
    }

    public static final class $allowed_modules_spec_p$UnaryFunction extends UnaryFunction {
        public $allowed_modules_spec_p$UnaryFunction() {
            super(extractFunctionNamed("ALLOWED-MODULES-SPEC-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return inference_modules.allowed_modules_spec_p(arg1);
        }
    }

    static private final SubLString $str_alt65$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt66$_HL_Module___a_ = makeString("[HL Module: ~a]");

    static private final SubLString $str_alt72$_supplants_is_meaningless_without = makeString(":supplants is meaningless without :exclusive being specified.  ~s contains a :supplants specification without an :exclusive.");

    static private final SubLList $list_alt77 = list(list(makeSymbol("HL-MODULE-VAR"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt78 = list($DONE);

    static private final SubLSymbol $sym81$NAME_VAR = makeUninternedSymbol("NAME-VAR");

    static private final SubLList $list_alt83 = list(makeSymbol("HL-MODULE-STORE"));

    static private final SubLList $list_alt134 = list(list(makeSymbol("HL-MODULE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt136 = list(makeSymbol("REMOVAL-MODULES"));

    public static final class $hl_module_p$UnaryFunction extends UnaryFunction {
        public $hl_module_p$UnaryFunction() {
            super(extractFunctionNamed("HL-MODULE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return inference_modules.hl_module_p(arg1);
        }
    }

    public static final class $sxhash_hl_module_method$UnaryFunction extends UnaryFunction {
        public $sxhash_hl_module_method$UnaryFunction() {
            super(extractFunctionNamed("SXHASH-HL-MODULE-METHOD"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return inference_modules.sxhash_hl_module_method(arg1);
        }
    }

    static private final SubLString $str_alt153$removal_module__S_must_have_a__SE = makeString("removal module ~S must have a :SENSE of :POS or :NEG");

    public static final class $hl_module_sense$UnaryFunction extends UnaryFunction {
        public $hl_module_sense$UnaryFunction() {
            super(extractFunctionNamed("HL-MODULE-SENSE"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return inference_modules.hl_module_sense(arg1);
        }
    }

    static private final SubLList $list_alt155 = cons(makeSymbol("HL-MODULE"), makeSymbol("PREDICATES"));

    static private final SubLList $list_alt157 = list(list(makeSymbol("MODULE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt158 = list(makeSymbol("REMOVAL-MODULES-CONJUNCTIVE"));

    static private final SubLList $list_alt162 = list(makeSymbol("META-REMOVAL-MODULES"));

    static private final SubLList $list_alt167 = list(makeSymbol("TRANSFORMATION-MODULES"));

    static private final SubLList $list_alt172 = list(makeSymbol("META-TRANSFORMATION-MODULES"));

    static private final SubLList $list_alt177 = list(makeSymbol("REWRITE-MODULES"));

    static private final SubLString $str_alt181$rewrite_module__S_must_have_a__SE = makeString("rewrite module ~S must have a :SENSE of :POS or :NEG");

    static private final SubLList $list_alt185 = list(makeSymbol("META-STRUCTURAL-MODULES"));
}

/**
 * Total time: 790 ms
 */
