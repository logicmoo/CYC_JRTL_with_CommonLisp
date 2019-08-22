package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.cfasl.$cfasl_output_object_method_table$;
import static com.cyc.cycjava.cycl.cfasl.cfasl_input;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output_wide_opcode;
import static com.cyc.cycjava.cycl.cfasl.register_wide_cfasl_opcode_input_function;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_without_sequence_termP;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.clrhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.remhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_value;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.adjoin;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.Iterator;
import java.util.Map;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_utilities;
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
import com.cyc.cycjava.cycl.subl_promotions;
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


public final class inference_modules extends SubLTranslatedFile {
    public static final SubLFile me = new inference_modules();

    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_modules";

    public static final String myFingerPrint = "f5f9fcc424bd7fc666d1bc2ddf032d2b8831d8370456272003b844b3b510e8bf";



    // deflexical
    private static final SubLSymbol $hl_module_properties$ = makeSymbol("*HL-MODULE-PROPERTIES*");

    // deflexical
    private static final SubLSymbol $valid_hl_module_subtypes$ = makeSymbol("*VALID-HL-MODULE-SUBTYPES*");

    // deflexical
    private static final SubLSymbol $default_hl_module_subtype$ = makeSymbol("*DEFAULT-HL-MODULE-SUBTYPE*");

    // deflexical
    private static final SubLSymbol $hl_module_property_defaults$ = makeSymbol("*HL-MODULE-PROPERTY-DEFAULTS*");

    // defconstant
    public static final SubLSymbol $dtp_hl_module$ = makeSymbol("*DTP-HL-MODULE*");























    // defparameter
    private static final SubLSymbol $classify_removal_modules_with_deterministic_sortP$ = makeSymbol("*CLASSIFY-REMOVAL-MODULES-WITH-DETERMINISTIC-SORT?*");

    // deflexical
    private static final SubLSymbol $removal_pruning_module_properties$ = makeSymbol("*REMOVAL-PRUNING-MODULE-PROPERTIES*");













    // defconstant
    private static final SubLSymbol $cfasl_wide_opcode_hl_module$ = makeSymbol("*CFASL-WIDE-OPCODE-HL-MODULE*");

    // Internal Constants
    public static final SubLSymbol $meta_removal_modules$ = makeSymbol("*META-REMOVAL-MODULES*");

    public static final SubLList $list1 = list(new SubLObject[]{ makeKeyword("MODULE-TYPE"), makeKeyword("MODULE-SUBTYPE"), makeKeyword("MODULE-SOURCE"), makeKeyword("CHECK"), makeKeyword("EXTERNAL"), makeKeyword("UNIVERSAL"), makeKeyword("SENSE"), makeKeyword("DIRECTION"), makeKeyword("PREDICATE"), makeKeyword("EVERY-PREDICATES"), makeKeyword("ANY-PREDICATES"), makeKeyword("REQUIRED-PATTERN"), makeKeyword("REQUIRED-MT"), makeKeyword("ARITY"), makeKeyword("EXCLUSIVE"), makeKeyword("SUPPLANTS"), makeKeyword("REQUIRED"), makeKeyword("APPLICABILITY-PATTERN"), makeKeyword("APPLICABILITY"), makeKeyword("COST-PATTERN"), makeKeyword("COST-EXPRESSION"), makeKeyword("COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE-PATTERN"), makeKeyword("COMPLETENESS-PATTERN"), makeKeyword("INPUT-EXTRACT-PATTERN"), makeKeyword("INPUT-VERIFY-PATTERN"), makeKeyword("INPUT-ENCODE-PATTERN"), makeKeyword("OUTPUT-CHECK-PATTERN"), makeKeyword("OUTPUT-GENERATE-PATTERN"), makeKeyword("OUTPUT-DECODE-PATTERN"), makeKeyword("OUTPUT-VERIFY-PATTERN"), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), makeKeyword("RULE-SELECT"), makeKeyword("RULE-FILTER"), makeKeyword("EXPAND-ITERATIVE-PATTERN"), makeKeyword("EXPAND-PATTERN"), makeKeyword("EXPAND"), makeKeyword("REWRITE-CLOSURE"), makeKeyword("SUPPORT-PATTERN"), makeKeyword("SUPPORT"), makeKeyword("SUPPORT-MODULE"), makeKeyword("SUPPORT-MT"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("REWRITE-SUPPORT"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("INCOMPLETENESS"), makeKeyword("ADD"), makeKeyword("REMOVE"), makeKeyword("REMOVE-ALL"), makeKeyword("PREFERRED-OVER"), makeKeyword("DOCUMENTATION"), makeKeyword("EXAMPLE"), makeKeyword("PRETTY-NAME") });

    public static final SubLList $list2 = list(list(makeSymbol("PROPERTY-VAR"), makeSymbol("VALUE-VAR"), makeSymbol("HL-MODULE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym3$MODULE_VAR = makeUninternedSymbol("MODULE-VAR");





    public static final SubLList $list6 = list(list(makeSymbol("HL-MODULE-PROPERTIES")));



    public static final SubLSymbol $sym8$HL_MODULE_PROPERTY_NOT_DEFAULT_ = makeSymbol("HL-MODULE-PROPERTY-NOT-DEFAULT?");

    public static final SubLSymbol HL_MODULE_PROPERTY_WITHOUT_VALUES = makeSymbol("HL-MODULE-PROPERTY-WITHOUT-VALUES");

    public static final SubLList $list10 = list(makeKeyword("SKSI"), makeKeyword("KB"), makeKeyword("ABDUCTION"), makeKeyword("PRUNING"));



    public static final SubLList $list12 = list(makeKeyword("MODULE-TYPE"));



    public static final SubLList $list14 = list(new SubLObject[]{ list(makeKeyword("MODULE-SOURCE")), list(makeKeyword("UNIVERSAL")), list(makeKeyword("SENSE")), cons(makeKeyword("REQUIRED-PATTERN"), makeKeyword("ANYTHING")), list(makeKeyword("REQUIRED-MT")), list(makeKeyword("REQUIRED")), list(makeKeyword("COST-PATTERN")), list(makeKeyword("COST-EXPRESSION")), cons(makeKeyword("COST"), makeSymbol("DEFAULT-COST-FUNC")), list(makeKeyword("COMPLETENESS")), list(makeKeyword("COMPLETE-PATTERN")), list(makeKeyword("COMPLETENESS-PATTERN")), cons(makeKeyword("CHECK"), makeKeyword("UNKNOWN")), list(makeKeyword("RULE-SELECT")), cons(makeKeyword("EXPAND"), makeKeyword("DEFAULT")), list(makeKeyword("EXPAND-PATTERN")), list(makeKeyword("EXPAND-ITERATIVE-PATTERN")), list(makeKeyword("PREDICATE")), list(makeKeyword("ARITY")), list(makeKeyword("EXCLUSIVE")), cons(makeKeyword("SUPPLANTS"), makeKeyword("ALL")), cons(makeKeyword("DIRECTION"), makeKeyword("FORWARD")), cons(makeKeyword("INPUT-EXTRACT-PATTERN"), makeKeyword("INPUT")), cons(makeKeyword("INPUT-VERIFY-PATTERN"), makeKeyword("ANYTHING")), cons(makeKeyword("INPUT-ENCODE-PATTERN"), makeKeyword("INPUT")), list(makeKeyword("OUTPUT-CHECK-PATTERN")), list(makeKeyword("OUTPUT-GENERATE-PATTERN")), cons(makeKeyword("OUTPUT-DECODE-PATTERN"), makeKeyword("INPUT")), cons(makeKeyword("OUTPUT-VERIFY-PATTERN"), makeKeyword("ANYTHING")), cons(makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), makeKeyword("INPUT")), list(makeKeyword("SUPPORT-PATTERN")), list(makeKeyword("SUPPORT")), cons(makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE")), list(makeKeyword("SUPPORT-MT")), cons(makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT")), list(makeKeyword("EVERY-PREDICATES")), cons(makeKeyword("APPLICABILITY"), makeSymbol("FALSE")), list(makeKeyword("APPLICABILITY-PATTERN")), list(makeKeyword("ANY-PREDICATES")), cons(makeKeyword("DOCUMENTATION"), makeString("")), cons(makeKeyword("EXAMPLE"), makeString("")), list(makeKeyword("EXTERNAL")), list(makeKeyword("REWRITE-SUPPORT")), list(makeKeyword("REWRITE-CLOSURE")) });





    public static final SubLSymbol ALLOWED_MODULES_SPEC_P = makeSymbol("ALLOWED-MODULES-SPEC-P");











    public static final SubLList $list23 = list(new SubLObject[]{ makeSymbol("NAME"), makeSymbol("PLIST"), makeSymbol("SENSE"), makeSymbol("PREDICATE"), makeSymbol("ANY-PREDICATES"), makeSymbol("ARITY"), makeSymbol("DIRECTION"), makeSymbol("REQUIRED-PATTERN"), makeSymbol("REQUIRED-MT"), makeSymbol("EXCLUSIVE-FUNC"), makeSymbol("REQUIRED-FUNC"), makeSymbol("COMPLETENESS") });

    public static final SubLList $list24 = list(new SubLObject[]{ makeKeyword("NAME"), makeKeyword("PLIST"), makeKeyword("SENSE"), makeKeyword("PREDICATE"), makeKeyword("ANY-PREDICATES"), makeKeyword("ARITY"), makeKeyword("DIRECTION"), makeKeyword("REQUIRED-PATTERN"), makeKeyword("REQUIRED-MT"), makeKeyword("EXCLUSIVE-FUNC"), makeKeyword("REQUIRED-FUNC"), makeKeyword("COMPLETENESS") });

    public static final SubLList $list25 = list(new SubLObject[]{ makeSymbol("HL-MOD-NAME"), makeSymbol("HL-MOD-PLIST"), makeSymbol("HL-MOD-SENSE"), makeSymbol("HL-MOD-PREDICATE"), makeSymbol("HL-MOD-ANY-PREDICATES"), makeSymbol("HL-MOD-ARITY"), makeSymbol("HL-MOD-DIRECTION"), makeSymbol("HL-MOD-REQUIRED-PATTERN"), makeSymbol("HL-MOD-REQUIRED-MT"), makeSymbol("HL-MOD-EXCLUSIVE-FUNC"), makeSymbol("HL-MOD-REQUIRED-FUNC"), makeSymbol("HL-MOD-COMPLETENESS") });

    public static final SubLList $list26 = list(new SubLObject[]{ makeSymbol("_CSETF-HL-MOD-NAME"), makeSymbol("_CSETF-HL-MOD-PLIST"), makeSymbol("_CSETF-HL-MOD-SENSE"), makeSymbol("_CSETF-HL-MOD-PREDICATE"), makeSymbol("_CSETF-HL-MOD-ANY-PREDICATES"), makeSymbol("_CSETF-HL-MOD-ARITY"), makeSymbol("_CSETF-HL-MOD-DIRECTION"), makeSymbol("_CSETF-HL-MOD-REQUIRED-PATTERN"), makeSymbol("_CSETF-HL-MOD-REQUIRED-MT"), makeSymbol("_CSETF-HL-MOD-EXCLUSIVE-FUNC"), makeSymbol("_CSETF-HL-MOD-REQUIRED-FUNC"), makeSymbol("_CSETF-HL-MOD-COMPLETENESS") });

    public static final SubLSymbol PRINT_HL_MODULE = makeSymbol("PRINT-HL-MODULE");

    public static final SubLSymbol HL_MODULE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("HL-MODULE-PRINT-FUNCTION-TRAMPOLINE");

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

    private static final SubLList $list87 = list(makeKeyword("DONE"));

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

    public static SubLObject hl_module_property_p(final SubLObject v_object) {
        return makeBoolean(v_object.isKeyword() && (NIL != subl_promotions.memberP(v_object, $hl_module_properties$.getGlobalValue(), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject do_hl_module_properties(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list2);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject property_var = NIL;
        SubLObject value_var = NIL;
        SubLObject hl_module = NIL;
        destructuring_bind_must_consp(current, datum, $list2);
        property_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list2);
        value_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list2);
        hl_module = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject module_var = $sym3$MODULE_VAR;
            return list(CLET, list(list(module_var, hl_module)), list(DO_LIST, bq_cons(property_var, $list6), list(PWHEN, list($sym8$HL_MODULE_PROPERTY_NOT_DEFAULT_, module_var, property_var), listS(CLET, list(list(value_var, list(HL_MODULE_PROPERTY_WITHOUT_VALUES, module_var, property_var))), append(body, NIL)))));
        }
        cdestructuring_bind_error(datum, $list2);
        return NIL;
    }

    public static SubLObject hl_module_properties() {
        return $hl_module_properties$.getGlobalValue();
    }

    public static SubLObject removal_module_plist_indicators() {
        return hl_module_properties();
    }

    public static SubLObject hl_module_subtype_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $valid_hl_module_subtypes$.getGlobalValue());
    }

    public static SubLObject allowed_modules_spec_p(final SubLObject v_object) {
        return makeBoolean(((((((($ALL == v_object) || (NIL != disjunctive_allowed_modules_spec_p(v_object))) || (NIL != conjunctive_allowed_modules_spec_p(v_object))) || (NIL != negated_allowed_modules_spec_p(v_object))) || (NIL != hl_module_type_spec_p(v_object))) || (NIL != hl_module_subtype_spec_p(v_object))) || (NIL != property_allowed_modules_spec_p(v_object))) || (NIL != find_hl_module_by_name(v_object)));
    }

    public static SubLObject non_universal_allowed_modules_spec_p(final SubLObject v_object) {
        return makeBoolean(($ALL != v_object) && (NIL != allowed_modules_spec_p(v_object)));
    }

    public static SubLObject disjunctive_allowed_modules_spec_p(final SubLObject v_object) {
        return makeBoolean((v_object.isCons() && ($OR == v_object.first())) && (NIL != list_utilities.list_of_type_p(ALLOWED_MODULES_SPEC_P, v_object.rest())));
    }

    public static SubLObject conjunctive_allowed_modules_spec_p(final SubLObject v_object) {
        return makeBoolean((v_object.isCons() && ($AND == v_object.first())) && (NIL != list_utilities.list_of_type_p(ALLOWED_MODULES_SPEC_P, v_object.rest())));
    }

    public static SubLObject negated_allowed_modules_spec_p(final SubLObject v_object) {
        return makeBoolean((v_object.isCons() && ($NOT == v_object.first())) && (NIL != list_utilities.list_of_type_p(ALLOWED_MODULES_SPEC_P, v_object.rest())));
    }

    public static SubLObject hl_module_type_spec_p(final SubLObject v_object) {
        return makeBoolean((NIL != list_utilities.doubletonP(v_object)) && ($MODULE_TYPE == v_object.first()));
    }

    public static SubLObject hl_module_subtype_spec_p(final SubLObject v_object) {
        return makeBoolean((NIL != list_utilities.doubletonP(v_object)) && ($MODULE_SUBTYPE == v_object.first()));
    }

    public static SubLObject property_allowed_modules_spec_p(final SubLObject v_object) {
        return makeBoolean((NIL != list_utilities.doubletonP(v_object)) && (NIL != hl_module_property_p(v_object.first())));
    }

    public static SubLObject hl_module_allowedP(final SubLObject hl_module, final SubLObject allowed_modules_spec) {
        assert NIL != hl_module_p(hl_module) : "inference_modules.hl_module_p(hl_module) " + "CommonSymbols.NIL != inference_modules.hl_module_p(hl_module) " + hl_module;
        assert NIL != allowed_modules_spec_p(allowed_modules_spec) : "inference_modules.allowed_modules_spec_p(allowed_modules_spec) " + "CommonSymbols.NIL != inference_modules.allowed_modules_spec_p(allowed_modules_spec) " + allowed_modules_spec;
        return hl_module_allowed_by_allowed_modules_specP(hl_module, allowed_modules_spec);
    }

    public static SubLObject hl_module_allowed_by_allowed_modules_specP(final SubLObject hl_module, final SubLObject allowed_modules_spec) {
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
            return makeBoolean(NIL == hl_module_allowed_by_allowed_modules_specP(hl_module, second(allowed_modules_spec)));
        }
        if (NIL != hl_module_type_spec_p(allowed_modules_spec)) {
            return eql(second(allowed_modules_spec), hl_module_type(hl_module));
        }
        if (NIL != hl_module_subtype_spec_p(allowed_modules_spec)) {
            return subl_promotions.memberP(second(allowed_modules_spec), hl_module_subtypes(hl_module), UNPROVIDED, UNPROVIDED);
        }
        if (NIL != property_allowed_modules_spec_p(allowed_modules_spec)) {
            final SubLObject property = allowed_modules_spec.first();
            final SubLObject allowed_value = second(allowed_modules_spec);
            final SubLObject actual_value = hl_module_property_without_values(hl_module, property);
            return equal(allowed_value, actual_value);
        }
        return eql(hl_module, find_hl_module_by_name(allowed_modules_spec));
    }

    public static SubLObject simple_allowed_modules_spec_p(final SubLObject allowed_modules_spec) {
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
        if ((((($ALL == allowed_modules_spec) || (NIL != negated_allowed_modules_spec_p(allowed_modules_spec))) || (NIL != hl_module_type_spec_p(allowed_modules_spec))) || (NIL != hl_module_subtype_spec_p(allowed_modules_spec))) || (NIL != property_allowed_modules_spec_p(allowed_modules_spec))) {
            return NIL;
        }
        return NIL;
    }

    public static SubLObject get_modules_from_simple_allowed_modules_spec(final SubLObject allowed_modules_spec) {
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

    public static SubLObject hl_module_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_hl_module(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject hl_module_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$hl_module_native.class ? T : NIL;
    }

    public static SubLObject hl_mod_name(final SubLObject v_object) {
        assert NIL != hl_module_p(v_object) : "inference_modules.hl_module_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject hl_mod_plist(final SubLObject v_object) {
        assert NIL != hl_module_p(v_object) : "inference_modules.hl_module_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject hl_mod_sense(final SubLObject v_object) {
        assert NIL != hl_module_p(v_object) : "inference_modules.hl_module_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject hl_mod_predicate(final SubLObject v_object) {
        assert NIL != hl_module_p(v_object) : "inference_modules.hl_module_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject hl_mod_any_predicates(final SubLObject v_object) {
        assert NIL != hl_module_p(v_object) : "inference_modules.hl_module_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject hl_mod_arity(final SubLObject v_object) {
        assert NIL != hl_module_p(v_object) : "inference_modules.hl_module_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject hl_mod_direction(final SubLObject v_object) {
        assert NIL != hl_module_p(v_object) : "inference_modules.hl_module_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject hl_mod_required_pattern(final SubLObject v_object) {
        assert NIL != hl_module_p(v_object) : "inference_modules.hl_module_p error :" + v_object;
        return v_object.getField9();
    }

    public static SubLObject hl_mod_required_mt(final SubLObject v_object) {
        assert NIL != hl_module_p(v_object) : "inference_modules.hl_module_p error :" + v_object;
        return v_object.getField10();
    }

    public static SubLObject hl_mod_exclusive_func(final SubLObject v_object) {
        assert NIL != hl_module_p(v_object) : "inference_modules.hl_module_p error :" + v_object;
        return v_object.getField11();
    }

    public static SubLObject hl_mod_required_func(final SubLObject v_object) {
        assert NIL != hl_module_p(v_object) : "inference_modules.hl_module_p error :" + v_object;
        return v_object.getField12();
    }

    public static SubLObject hl_mod_completeness(final SubLObject v_object) {
        assert NIL != hl_module_p(v_object) : "inference_modules.hl_module_p error :" + v_object;
        return v_object.getField13();
    }

    public static SubLObject _csetf_hl_mod_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != hl_module_p(v_object) : "inference_modules.hl_module_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_hl_mod_plist(final SubLObject v_object, final SubLObject value) {
        assert NIL != hl_module_p(v_object) : "inference_modules.hl_module_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_hl_mod_sense(final SubLObject v_object, final SubLObject value) {
        assert NIL != hl_module_p(v_object) : "inference_modules.hl_module_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_hl_mod_predicate(final SubLObject v_object, final SubLObject value) {
        assert NIL != hl_module_p(v_object) : "inference_modules.hl_module_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_hl_mod_any_predicates(final SubLObject v_object, final SubLObject value) {
        assert NIL != hl_module_p(v_object) : "inference_modules.hl_module_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_hl_mod_arity(final SubLObject v_object, final SubLObject value) {
        assert NIL != hl_module_p(v_object) : "inference_modules.hl_module_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_hl_mod_direction(final SubLObject v_object, final SubLObject value) {
        assert NIL != hl_module_p(v_object) : "inference_modules.hl_module_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_hl_mod_required_pattern(final SubLObject v_object, final SubLObject value) {
        assert NIL != hl_module_p(v_object) : "inference_modules.hl_module_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_hl_mod_required_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != hl_module_p(v_object) : "inference_modules.hl_module_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_hl_mod_exclusive_func(final SubLObject v_object, final SubLObject value) {
        assert NIL != hl_module_p(v_object) : "inference_modules.hl_module_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_hl_mod_required_func(final SubLObject v_object, final SubLObject value) {
        assert NIL != hl_module_p(v_object) : "inference_modules.hl_module_p error :" + v_object;
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_hl_mod_completeness(final SubLObject v_object, final SubLObject value) {
        assert NIL != hl_module_p(v_object) : "inference_modules.hl_module_p error :" + v_object;
        return v_object.setField13(value);
    }

    public static SubLObject make_hl_module(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $hl_module_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($NAME)) {
                _csetf_hl_mod_name(v_new, current_value);
            } else
                if (pcase_var.eql($PLIST)) {
                    _csetf_hl_mod_plist(v_new, current_value);
                } else
                    if (pcase_var.eql($SENSE)) {
                        _csetf_hl_mod_sense(v_new, current_value);
                    } else
                        if (pcase_var.eql($PREDICATE)) {
                            _csetf_hl_mod_predicate(v_new, current_value);
                        } else
                            if (pcase_var.eql($ANY_PREDICATES)) {
                                _csetf_hl_mod_any_predicates(v_new, current_value);
                            } else
                                if (pcase_var.eql($ARITY)) {
                                    _csetf_hl_mod_arity(v_new, current_value);
                                } else
                                    if (pcase_var.eql($DIRECTION)) {
                                        _csetf_hl_mod_direction(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($REQUIRED_PATTERN)) {
                                            _csetf_hl_mod_required_pattern(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($REQUIRED_MT)) {
                                                _csetf_hl_mod_required_mt(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($EXCLUSIVE_FUNC)) {
                                                    _csetf_hl_mod_exclusive_func(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($REQUIRED_FUNC)) {
                                                        _csetf_hl_mod_required_func(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($COMPLETENESS)) {
                                                            _csetf_hl_mod_completeness(v_new, current_value);
                                                        } else {
                                                            Errors.error($str66$Invalid_slot__S_for_construction_, current_arg);
                                                        }











        }
        return v_new;
    }

    public static SubLObject visit_defstruct_hl_module(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_HL_MODULE, TWELVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $NAME, hl_mod_name(obj));
        funcall(visitor_fn, obj, $SLOT, $PLIST, hl_mod_plist(obj));
        funcall(visitor_fn, obj, $SLOT, $SENSE, hl_mod_sense(obj));
        funcall(visitor_fn, obj, $SLOT, $PREDICATE, hl_mod_predicate(obj));
        funcall(visitor_fn, obj, $SLOT, $ANY_PREDICATES, hl_mod_any_predicates(obj));
        funcall(visitor_fn, obj, $SLOT, $ARITY, hl_mod_arity(obj));
        funcall(visitor_fn, obj, $SLOT, $DIRECTION, hl_mod_direction(obj));
        funcall(visitor_fn, obj, $SLOT, $REQUIRED_PATTERN, hl_mod_required_pattern(obj));
        funcall(visitor_fn, obj, $SLOT, $REQUIRED_MT, hl_mod_required_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $EXCLUSIVE_FUNC, hl_mod_exclusive_func(obj));
        funcall(visitor_fn, obj, $SLOT, $REQUIRED_FUNC, hl_mod_required_func(obj));
        funcall(visitor_fn, obj, $SLOT, $COMPLETENESS, hl_mod_completeness(obj));
        funcall(visitor_fn, obj, $END, MAKE_HL_MODULE, TWELVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_hl_module_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_hl_module(obj, visitor_fn);
    }

    public static SubLObject print_hl_module(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLObject name = hl_module_name(v_object);
        format(stream, $str72$_HL_Module___a_, name);
        return NIL;
    }

    public static SubLObject sxhash_hl_module_method(final SubLObject v_object) {
        return Sxhash.sxhash(hl_mod_name(v_object));
    }

    public static SubLObject check_hl_module_property_list(final SubLObject plist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != list_utilities.property_list_p(plist) : "list_utilities.property_list_p(plist) " + "CommonSymbols.NIL != list_utilities.property_list_p(plist) " + plist;
        SubLObject exclusive_specifiedP = NIL;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        SubLObject pcase_var;
        for (remainder = NIL, remainder = plist; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            assert NIL != hl_module_property_p(property) : "inference_modules.hl_module_property_p(property) " + "CommonSymbols.NIL != inference_modules.hl_module_property_p(property) " + property;
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
                Errors.error($str78$_supplants_is_meaningless_without, plist);
            }
        }
        return NIL;
    }

    public static SubLObject new_hl_module(final SubLObject name, SubLObject plist) {
        check_hl_module_property_list(plist);
        final SubLObject hl_module = allocate_hl_module(name);
        plist = canonicalize_hl_module_plist(plist);
        _csetf_hl_mod_plist(hl_module, plist);
        add_hl_module(hl_module);
        return hl_module;
    }

    public static SubLObject clear_cfasl_create_invalid_hl_module() {
        final SubLObject cs = $cfasl_create_invalid_hl_module_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_cfasl_create_invalid_hl_module(final SubLObject name) {
        return memoization_state.caching_state_remove_function_results_with_args($cfasl_create_invalid_hl_module_caching_state$.getGlobalValue(), list(name), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cfasl_create_invalid_hl_module_internal(final SubLObject name) {
        return new_hl_module(name, $list80);
    }

    public static SubLObject cfasl_create_invalid_hl_module(final SubLObject name) {
        SubLObject caching_state = $cfasl_create_invalid_hl_module_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CFASL_CREATE_INVALID_HL_MODULE, $cfasl_create_invalid_hl_module_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, name, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(cfasl_create_invalid_hl_module_internal(name)));
            memoization_state.caching_state_put(caching_state, name, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject canonicalize_hl_module_plist(SubLObject plist) {
        final SubLObject module_subtypes = getf(plist, $MODULE_SUBTYPE, UNPROVIDED);
        if (!module_subtypes.isList()) {
            plist = putf(copy_list(plist), $MODULE_SUBTYPE, list(module_subtypes));
        }
        return plist;
    }

    public static SubLObject allocate_hl_module(final SubLObject name) {
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

    public static SubLObject destroy_hl_module(final SubLObject hl_module) {
        remove_hl_module(hl_module);
        _csetf_hl_mod_plist(hl_module, $FREE);
        return NIL;
    }

    public static SubLObject hl_module_name(final SubLObject hl_module) {
        assert NIL != hl_module_p(hl_module) : "inference_modules.hl_module_p(hl_module) " + "CommonSymbols.NIL != inference_modules.hl_module_p(hl_module) " + hl_module;
        return hl_mod_name(hl_module);
    }

    public static SubLObject hl_module_plist(final SubLObject hl_module) {
        return hl_mod_plist(hl_module);
    }

    public static SubLObject hl_module_property(final SubLObject hl_module, final SubLObject property) {
        final SubLObject plist = hl_module_plist(hl_module);
        final SubLObject value = getf(plist, property, $DEFAULT);
        if (value == $DEFAULT) {
            final SubLObject v_default = dictionary.dictionary_lookup_without_values($hl_module_property_defaults$.getGlobalValue(), property, UNPROVIDED);
            return subl_promotions.values2(v_default, T);
        }
        return subl_promotions.values2(value, NIL);
    }

    public static SubLObject hl_module_property_without_values(final SubLObject hl_module, final SubLObject property) {
        final SubLObject plist = hl_module_plist(hl_module);
        SubLObject value = getf(plist, property, $DEFAULT);
        if (value == $DEFAULT) {
            value = dictionary.dictionary_lookup_without_values($hl_module_property_defaults$.getGlobalValue(), property, UNPROVIDED);
        }
        return value;
    }

    public static SubLObject hl_module_property_not_defaultP(final SubLObject hl_module, final SubLObject property) {
        final SubLObject value = hl_module_property_without_values(hl_module, property);
        final SubLObject v_default = dictionary.dictionary_lookup_without_values($hl_module_property_defaults$.getGlobalValue(), property, UNPROVIDED);
        return makeBoolean(!value.equal(v_default));
    }

    public static SubLObject do_hl_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list86);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject hl_module_var = NIL;
        destructuring_bind_must_consp(current, datum, $list86);
        hl_module_var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list86);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list86);
            if (NIL == member(current_$1, $list87, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list86);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject name_var = $sym90$NAME_VAR;
        return listS(DO_HASH_TABLE, list(name_var, hl_module_var, $list92, $DONE, done), list(IGNORE, name_var), append(body, NIL));
    }

    public static SubLObject hl_module_store() {
        return $hl_module_store$.getGlobalValue();
    }

    public static SubLObject find_hl_module_by_name(final SubLObject name) {
        final SubLObject hl_module = gethash_without_values(name, $hl_module_store$.getGlobalValue(), UNPROVIDED);
        return hl_module;
    }

    public static SubLObject add_hl_module(final SubLObject hl_module) {
        final SubLObject name = hl_module_name(hl_module);
        sethash(name, $hl_module_store$.getGlobalValue(), hl_module);
        return hl_module;
    }

    public static SubLObject remove_hl_module(final SubLObject hl_module) {
        final SubLObject name = hl_module_name(hl_module);
        remhash(name, $hl_module_store$.getGlobalValue());
        return hl_module;
    }

    public static SubLObject setup_module(final SubLObject name, final SubLObject type, final SubLObject plist) {
        SubLObject new_plist = copy_list(plist);
        new_plist = putf(plist, $MODULE_TYPE, type);
        final SubLObject hl_module = new_hl_module(name, new_plist);
        return hl_module;
    }

    public static SubLObject default_cost_func(SubLObject v_object) {
        if (v_object == UNPROVIDED) {
            v_object = NIL;
        }
        return ZERO_INTEGER;
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

    public static SubLObject hl_module_type(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $MODULE_TYPE);
    }

    public static SubLObject hl_module_subtypes(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $MODULE_SUBTYPE);
    }

    public static SubLObject abductive_hl_moduleP(final SubLObject hl_module) {
        return list_utilities.member_eqP($ABDUCTION, hl_module_subtypes(hl_module));
    }

    public static SubLObject hl_module_universal(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $UNIVERSAL);
    }

    public static SubLObject hl_module_source(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $MODULE_SOURCE);
    }

    public static SubLObject hl_module_sense(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $SENSE);
    }

    public static SubLObject hl_module_sense_relevant_p(final SubLObject hl_module, final SubLObject sense) {
        final SubLObject module_sense = hl_module_sense(hl_module);
        return makeBoolean((NIL == module_sense) || module_sense.eql(sense));
    }

    public static SubLObject hl_module_required_pattern(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $REQUIRED_PATTERN);
    }

    public static SubLObject hl_module_required_pattern_matched_p(final SubLObject hl_module, final SubLObject asent) {
        final SubLObject pattern = hl_module_required_pattern(hl_module);
        return makeBoolean(($ANYTHING == pattern) || (NIL != formula_pattern_match.pattern_matches_formula_without_bindings(pattern, asent)));
    }

    public static SubLObject hl_module_required_mt(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $REQUIRED_MT);
    }

    public static SubLObject hl_module_required_mt_result(final SubLObject hl_module) {
        final SubLObject required_mt_prop = hl_module_required_mt(hl_module);
        if (NIL != required_mt_prop) {
            return interpret_hl_module_mt_prop(required_mt_prop);
        }
        return NIL;
    }

    public static SubLObject interpret_hl_module_mt_prop(final SubLObject mt_prop) {
        if (NIL != hlmt.hlmt_p(mt_prop)) {
            return mt_prop;
        }
        if (mt_prop.isSymbol() && (NIL != boundp(mt_prop))) {
            return symbol_value(mt_prop);
        }
        return eval_in_api.possibly_cyc_api_eval(mt_prop);
    }

    public static SubLObject hl_module_required_mt_relevantP(final SubLObject hl_module) {
        final SubLObject required_mt = hl_module_required_mt_result(hl_module);
        return makeBoolean((NIL == required_mt) || (NIL != mt_relevance_macros.relevant_mtP(required_mt)));
    }

    public static SubLObject hl_module_required_func(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $REQUIRED);
    }

    public static SubLObject hl_module_required_func_p(final SubLObject hl_module, final SubLObject asent) {
        final SubLObject required_func = hl_module_required_func(hl_module);
        return makeBoolean((NIL == required_func) || (NIL != funcall(required_func, asent)));
    }

    public static SubLObject hl_module_cost_pattern(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $COST_PATTERN);
    }

    public static SubLObject hl_module_cost_expression(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $COST_EXPRESSION);
    }

    public static SubLObject hl_module_cost_func(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $COST);
    }

    public static SubLObject hl_module_cost(final SubLObject hl_module, final SubLObject v_object, SubLObject sense) {
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

    public static SubLObject hl_module_asent_cost(final SubLObject hl_module, final SubLObject asent) {
        return hl_module_cost(hl_module, asent, UNPROVIDED);
    }

    public static SubLObject hl_module_clause_cost(final SubLObject hl_module, final SubLObject contextualized_dnf_clause) {
        return hl_module_cost(hl_module, contextualized_dnf_clause, UNPROVIDED);
    }

    public static SubLObject hl_module_cost_pattern_result(final SubLObject hl_module, final SubLObject formula) {
        final SubLObject cost_pattern = hl_module_cost_pattern(hl_module);
        if (NIL != cost_pattern) {
            return formula_pattern_match.pattern_transform_formula(cost_pattern, formula, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject hl_module_cost_expression_result(final SubLObject hl_module) {
        final SubLObject cost_expression = hl_module_cost_expression(hl_module);
        if (NIL == cost_expression) {
            return NIL;
        }
        if (cost_expression.isNumber()) {
            return cost_expression;
        }
        if (cost_expression.isSymbol() && (NIL != boundp(cost_expression))) {
            return symbol_value(cost_expression);
        }
        return eval_in_api.possibly_cyc_api_eval(cost_expression);
    }

    public static SubLObject hl_module_cost_function_result(final SubLObject hl_module, final SubLObject v_object) {
        final SubLObject cost_func = hl_module_cost_func(hl_module);
        if (NIL != eval_in_api.possibly_cyc_api_function_spec_p(cost_func)) {
            final SubLObject cost = eval_in_api.possibly_cyc_api_funcall_1(cost_func, v_object);
            return cost;
        }
        return NIL;
    }

    public static SubLObject hl_module_asent_cost_function_result(final SubLObject hl_module, final SubLObject asent) {
        return hl_module_cost_function_result(hl_module, asent);
    }

    public static SubLObject hl_module_clause_cost_function_result(final SubLObject hl_module, final SubLObject contextualized_dnf_clause) {
        return hl_module_cost_function_result(hl_module, contextualized_dnf_clause);
    }

    public static SubLObject hl_module_is_checkP(final SubLObject hl_module) {
        final SubLObject check = hl_module_property_without_values(hl_module, $CHECK);
        if (check == $UNKNOWN) {
            return guess_hl_module_is_checkP(hl_module);
        }
        return list_utilities.sublisp_boolean(check);
    }

    public static SubLObject guess_hl_module_is_checkP(final SubLObject hl_module) {
        final SubLObject required_pattern = hl_module_required_pattern(hl_module);
        if (NIL != cycl_utilities.expression_find($NOT_FULLY_BOUND, required_pattern, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        final SubLObject name = string_utilities.str(hl_module_name(hl_module));
        final SubLObject checkP = string_utilities.substringP($$$check, name, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return checkP;
    }

    public static SubLObject hl_module_rule_select_func(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $RULE_SELECT);
    }

    public static SubLObject hl_module_rule_filter_func(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $RULE_FILTER);
    }

    public static SubLObject hl_module_expand_func(final SubLObject hl_module) {
        inference_analysis.cinc_module_expand_count(hl_module);
        final SubLObject expand = hl_module_property_without_values(hl_module, $EXPAND);
        if ($DEFAULT == expand) {
            return default_expand_func_for_hl_module(hl_module);
        }
        return expand;
    }

    public static SubLObject default_expand_func_for_hl_module(final SubLObject hl_module) {
        if ($REMOVAL != hl_module_type(hl_module)) {
            return DEFAULT_EXPAND_FUNC;
        }
        if (NIL != hl_module_is_checkP(hl_module)) {
            return INFERENCE_REMOVE_CHECK_DEFAULT;
        }
        return INFERENCE_REMOVE_UNIFY_DEFAULT;
    }

    public static SubLObject hl_module_expand_pattern(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $EXPAND_PATTERN);
    }

    public static SubLObject hl_module_expand_iterative_pattern(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $EXPAND_ITERATIVE_PATTERN);
    }

    public static SubLObject hl_module_predicate(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $PREDICATE);
    }

    public static SubLObject hl_module_predicate_relevant_p(final SubLObject hl_module, final SubLObject predicate) {
        final SubLObject hl_module_predicate = hl_module_predicate(hl_module);
        if (NIL != hl_module_predicate) {
            return eql(hl_module_predicate, predicate);
        }
        final SubLObject hl_module_any_preds = hl_module_any_predicates(hl_module);
        if (NIL != hl_module_any_preds) {
            return subl_promotions.memberP(predicate, hl_module_any_preds, PATTERN_MATCHES_FORMULA, UNPROVIDED);
        }
        return T;
    }

    public static SubLObject hl_module_arity(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $ARITY);
    }

    public static SubLObject hl_module_arity_relevant_p(final SubLObject hl_module, final SubLObject asent) {
        final SubLObject hl_module_arity = hl_module_arity(hl_module);
        return makeBoolean((NIL == hl_module_arity) || ((NIL != el_formula_without_sequence_termP(asent)) && hl_module_arity.numE(length(asent.rest()))));
    }

    public static SubLObject hl_module_exclusive_func(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $EXCLUSIVE);
    }

    public static SubLObject hl_module_supplants_info(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $SUPPLANTS);
    }

    public static SubLObject hl_module_direction(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $DIRECTION);
    }

    public static SubLObject hl_module_direction_relevantP(final SubLObject hl_module) {
        if (NIL == kb_control_vars.within_forward_inferenceP()) {
            return T;
        }
        final SubLObject direction = hl_module_direction(hl_module);
        return eq(direction, $FORWARD);
    }

    public static SubLObject hl_module_input_extract_pattern(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $INPUT_EXTRACT_PATTERN);
    }

    public static SubLObject hl_module_input_verify_pattern(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $INPUT_VERIFY_PATTERN);
    }

    public static SubLObject hl_module_input_encode_pattern(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $INPUT_ENCODE_PATTERN);
    }

    public static SubLObject hl_module_output_check_pattern(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $OUTPUT_CHECK_PATTERN);
    }

    public static SubLObject hl_module_output_generate_pattern(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $OUTPUT_GENERATE_PATTERN);
    }

    public static SubLObject hl_module_output_decode_pattern(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $OUTPUT_DECODE_PATTERN);
    }

    public static SubLObject hl_module_output_verify_pattern(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $OUTPUT_VERIFY_PATTERN);
    }

    public static SubLObject hl_module_output_construct_pattern(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $OUTPUT_CONSTRUCT_PATTERN);
    }

    public static SubLObject hl_module_support_pattern(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $SUPPORT_PATTERN);
    }

    public static SubLObject hl_module_support_func(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $SUPPORT);
    }

    public static SubLObject hl_module_support_module(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $SUPPORT_MODULE);
    }

    public static SubLObject hl_module_support_mt(final SubLObject hl_module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject support_mt = hl_module_property(hl_module, $SUPPORT_MT);
        final SubLObject default_inferredP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != default_inferredP) {
            support_mt = mt_relevance_macros.current_mt_relevance_mt();
        }
        return support_mt;
    }

    public static SubLObject hl_module_support_mt_result(final SubLObject hl_module) {
        final SubLObject support_mt_prop = hl_module_support_mt(hl_module);
        return interpret_hl_module_mt_prop(support_mt_prop);
    }

    public static SubLObject hl_module_support_strength(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $SUPPORT_STRENGTH);
    }

    public static SubLObject hl_module_every_predicates(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $EVERY_PREDICATES);
    }

    public static SubLObject hl_module_applicability_func(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $APPLICABILITY);
    }

    public static SubLObject hl_module_applicability_pattern(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $APPLICABILITY_PATTERN);
    }

    public static SubLObject hl_module_any_predicates(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $ANY_PREDICATES);
    }

    public static SubLObject hl_module_documentation_string(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $DOCUMENTATION);
    }

    public static SubLObject hl_module_example_string(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $EXAMPLE);
    }

    public static SubLObject hl_module_completeP(final SubLObject hl_module, final SubLObject asent) {
        return eq($COMPLETE, hl_module_completeness(hl_module, asent, UNPROVIDED));
    }

    public static SubLObject hl_module_incompleteP(final SubLObject hl_module, final SubLObject asent) {
        return eq($INCOMPLETE, hl_module_completeness(hl_module, asent, UNPROVIDED));
    }

    public static SubLObject hl_module_completeness(final SubLObject hl_module, final SubLObject asent, SubLObject default_completeness) {
        if (default_completeness == UNPROVIDED) {
            default_completeness = $INCOMPLETE;
        }
        final SubLObject completeness = hl_module_property_without_values(hl_module, $COMPLETENESS);
        if (NIL != completeness) {
            return completeness;
        }
        SubLObject pattern = hl_module_property_without_values(hl_module, $COMPLETE_PATTERN);
        if ((NIL != pattern) && (NIL != formula_pattern_match.pattern_matches_formula_without_bindings(pattern, asent))) {
            return $COMPLETE;
        }
        pattern = hl_module_property_without_values(hl_module, $COMPLETENESS_PATTERN);
        if (NIL != pattern) {
            final SubLObject completeness2 = formula_pattern_match.pattern_transform_formula(pattern, asent, UNPROVIDED);
            if (NIL != completeness2) {
                return completeness2;
            }
        }
        return default_completeness;
    }

    public static SubLObject hl_module_clause_completeness(final SubLObject hl_module, final SubLObject clause) {
        final SubLObject completeness = hl_module_property_without_values(hl_module, $COMPLETENESS);
        if (NIL != completeness) {
            return completeness;
        }
        SubLObject pattern = hl_module_property_without_values(hl_module, $COMPLETE_PATTERN);
        if ((NIL != pattern) && (NIL != formula_pattern_match.pattern_matches_formula_without_bindings(pattern, clause))) {
            return $COMPLETE;
        }
        pattern = hl_module_property_without_values(hl_module, $COMPLETENESS_PATTERN);
        if (NIL != pattern) {
            final SubLObject completeness2 = formula_pattern_match.pattern_transform_formula(pattern, clause, UNPROVIDED);
            if (NIL != completeness2) {
                return completeness2;
            }
        }
        return $INCOMPLETE;
    }

    public static SubLObject hl_module_externalP(final SubLObject hl_module) {
        return hl_module_property_without_values(hl_module, $EXTERNAL);
    }

    public static SubLObject hl_module_activeP(final SubLObject hl_module, SubLObject inactive_hl_modules) {
        if (inactive_hl_modules == UNPROVIDED) {
            inactive_hl_modules = NIL;
        }
        return makeBoolean(NIL == subl_promotions.memberP(hl_module, inactive_hl_modules, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject hl_module_implementation_methods(SubLObject hl_module) {
        if (hl_module.isSymbol()) {
            hl_module = find_hl_module_by_name(hl_module);
        }
        assert NIL != hl_module_p(hl_module) : "inference_modules.hl_module_p(hl_module) " + "CommonSymbols.NIL != inference_modules.hl_module_p(hl_module) " + hl_module;
        final SubLObject plist = hl_module_plist(hl_module);
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
            v_methods = cdolist_list_var = list_utilities.tree_gather(value, symbol_function(FUNCTION_SYMBOL_P), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            method = NIL;
            method = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == list_utilities.member_eqP(method, $list143)) {
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

    public static SubLObject do_removal_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list147);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject hl_module = NIL;
        destructuring_bind_must_consp(current, datum, $list147);
        hl_module = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list147);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list147);
            if (NIL == member(current_$2, $list87, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list147);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_SET, list(hl_module, $list149, $DONE, done), append(body, NIL));
    }

    public static SubLObject removal_modules() {
        return $removal_modules$.getGlobalValue();
    }

    public static SubLObject removal_module_p(final SubLObject v_object) {
        return set.set_memberP(v_object, $removal_modules$.getGlobalValue());
    }

    public static SubLObject removal_module_count() {
        return set.set_size($removal_modules$.getGlobalValue());
    }

    public static SubLObject some_external_removal_modulesP() {
        return list_utilities.sublisp_boolean($removal_modules_external$.getGlobalValue());
    }

    public static SubLObject removal_modules_external() {
        return $removal_modules_external$.getGlobalValue();
    }

    public static SubLObject generic_removal_module_p(final SubLObject v_object) {
        return makeBoolean((NIL != removal_module_p(v_object)) && (NIL != subl_promotions.memberP(v_object, $removal_modules_generic$.getGlobalValue(), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject generic_removal_modules() {
        return copy_list($removal_modules_generic$.getGlobalValue());
    }

    public static SubLObject generic_removal_modules_for_sense(final SubLObject sense) {
        return remove(enumeration_types.inverse_sense(sense), $removal_modules_generic$.getGlobalValue(), symbol_function(EQL), HL_MODULE_SENSE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject generic_removal_module_count() {
        return length($removal_modules_generic$.getGlobalValue());
    }

    public static SubLObject universal_removal_modules() {
        return copy_list($removal_modules_universal$.getGlobalValue());
    }

    public static SubLObject universal_removal_module_p(final SubLObject v_object) {
        return makeBoolean((NIL != removal_module_p(v_object)) && (NIL != subl_promotions.memberP(v_object, $removal_modules_universal$.getGlobalValue(), symbol_function(EQL), UNPROVIDED)));
    }

    public static SubLObject universal_removal_module_count() {
        return length($removal_modules_universal$.getGlobalValue());
    }

    public static SubLObject universal_removal_module_exception_predicates(final SubLObject universal_module) {
        return list_utilities.alist_lookup($removal_modules_specific_dont_use_universal$.getGlobalValue(), universal_module, symbol_function(EQL), UNPROVIDED);
    }

    public static SubLObject universal_removal_module_exception_predicateP(final SubLObject universal_module, final SubLObject predicate) {
        return subl_promotions.memberP(predicate, universal_removal_module_exception_predicates(universal_module), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject predicate_doesnt_use_universal_removal_moduleP(final SubLObject predicate, final SubLObject universal_module) {
        if ((NIL != forts.fort_p(predicate)) && (NIL == universal_removal_module_exception_predicateP(universal_module, predicate))) {
            return NIL;
        }
        return T;
    }

    public static SubLObject universal_removal_modules_for_sense(final SubLObject sense) {
        return remove(enumeration_types.inverse_sense(sense), $removal_modules_universal$.getGlobalValue(), symbol_function(EQL), HL_MODULE_SENSE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject removal_modules_specific(final SubLObject predicate) {
        assert NIL != forts.fort_p(predicate) : "forts.fort_p(predicate) " + "CommonSymbols.NIL != forts.fort_p(predicate) " + predicate;
        return copy_list(gethash_without_values(predicate, $removal_modules_specific$.getGlobalValue(), NIL));
    }

    public static SubLObject predicate_has_specific_removal_modulesP(final SubLObject predicate) {
        return list_utilities.sublisp_boolean(gethash_without_values(predicate, $removal_modules_specific$.getGlobalValue(), NIL));
    }

    public static SubLObject removal_modules_specific_for_sense(final SubLObject predicate, final SubLObject sense) {
        assert NIL != forts.fort_p(predicate) : "forts.fort_p(predicate) " + "CommonSymbols.NIL != forts.fort_p(predicate) " + predicate;
        return remove(enumeration_types.inverse_sense(sense), gethash_without_values(predicate, $removal_modules_specific$.getGlobalValue(), NIL), symbol_function(EQL), HL_MODULE_SENSE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject removal_modules_universal_for_predicate_and_sense(final SubLObject predicate, final SubLObject sense) {
        assert NIL != forts.fort_p(predicate) : "forts.fort_p(predicate) " + "CommonSymbols.NIL != forts.fort_p(predicate) " + predicate;
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
        return nreverse(universal_modules);
    }

    public static SubLObject predicates_with_specific_removal_modules() {
        return hash_table_utilities.hash_table_keys($removal_modules_specific$.getGlobalValue());
    }

    public static SubLObject specific_removal_modules() {
        return set.set_element_list(specific_removal_module_set());
    }

    public static SubLObject specific_removal_module_count() {
        return set.set_size(specific_removal_module_set());
    }

    public static SubLObject specific_removal_module_set() {
        final SubLObject v_set = set.new_set(EQL, removal_module_count());
        SubLObject pred = NIL;
        SubLObject hl_module_list = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator($removal_modules_specific$.getGlobalValue());
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                pred = getEntryKey(cdohash_entry);
                SubLObject cdolist_list_var;
                hl_module_list = cdolist_list_var = getEntryValue(cdohash_entry);
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
            releaseEntrySetIterator(cdohash_iterator);
        }
        return v_set;
    }

    public static SubLObject clear_solely_specific_removal_module_predicate_store() {
        set.clear_set($solely_specific_removal_module_predicate_store$.getGlobalValue());
        return NIL;
    }

    public static SubLObject rebuild_solely_specific_removal_module_predicate_store() {
        return set.set_rebuild($solely_specific_removal_module_predicate_store$.getGlobalValue());
    }

    public static SubLObject register_solely_specific_removal_module_predicate(final SubLObject predicate) {
        return set.set_add(predicate, $solely_specific_removal_module_predicate_store$.getGlobalValue());
    }

    public static SubLObject deregister_solely_specific_removal_module_predicate(final SubLObject predicate) {
        return set.set_remove(predicate, $solely_specific_removal_module_predicate_store$.getGlobalValue());
    }

    public static SubLObject solely_specific_removal_module_predicateP(final SubLObject predicate) {
        return set.set_memberP(predicate, $solely_specific_removal_module_predicate_store$.getGlobalValue());
    }

    public static SubLObject inference_removal_module(final SubLObject name, final SubLObject plist) {
        final SubLObject strengthened_plist = strengthen_removal_module_properties(name, plist);
        final SubLObject hl_module = setup_module(name, $REMOVAL, strengthened_plist);
        set.set_add(hl_module, $removal_modules$.getGlobalValue());
        classify_removal_module(hl_module);
        return hl_module;
    }

    public static SubLObject inference_removal_module_use_generic(final SubLObject predicate, final SubLObject name) {
        final SubLObject hl_module = find_hl_module_by_name(name);
        if (NIL != hl_module) {
            SubLObject existing = assoc(hl_module, $removal_modules_specific_use_generic$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
            if (NIL == existing) {
                existing = list(hl_module);
                $removal_modules_specific_use_generic$.setGlobalValue(cons(existing, $removal_modules_specific_use_generic$.getGlobalValue()));
            }
            rplacd(existing, adjoin(predicate, existing.rest(), UNPROVIDED, UNPROVIDED));
            return inference_removal_module_note_specific(predicate, hl_module);
        }
        return NIL;
    }

    public static SubLObject inference_removal_module_use_meta_removal(final SubLObject predicate, final SubLObject name) {
        final SubLObject hl_module = find_hl_module_by_name(name);
        if (NIL != hl_module) {
            SubLObject existing = assoc(hl_module, $removal_modules_specific_use_meta_removal$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
            if (NIL == existing) {
                existing = list(hl_module);
                $removal_modules_specific_use_meta_removal$.setGlobalValue(cons(existing, $removal_modules_specific_use_meta_removal$.getGlobalValue()));
            }
            rplacd(existing, adjoin(predicate, existing.rest(), UNPROVIDED, UNPROVIDED));
            return hl_module;
        }
        return NIL;
    }

    public static SubLObject inference_removal_module_dont_use_universal(final SubLObject predicate, final SubLObject name) {
        final SubLObject hl_module = find_hl_module_by_name(name);
        if (NIL != hl_module) {
            SubLObject existing = assoc(hl_module, $removal_modules_specific_dont_use_universal$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
            if (NIL == existing) {
                existing = list(hl_module);
                $removal_modules_specific_dont_use_universal$.setGlobalValue(cons(existing, $removal_modules_specific_dont_use_universal$.getGlobalValue()));
            }
            rplacd(existing, adjoin(predicate, existing.rest(), UNPROVIDED, UNPROVIDED));
            return hl_module;
        }
        return NIL;
    }

    public static SubLObject redeclare_inference_removal_module(final SubLObject name) {
        final SubLObject hl_module = find_hl_module_by_name(name);
        if (NIL != hl_module) {
            set.set_add(hl_module, $removal_modules$.getGlobalValue());
            classify_removal_module(hl_module);
            return hl_module;
        }
        return NIL;
    }

    public static SubLObject strengthen_removal_module_properties(final SubLObject name, SubLObject plist) {
        plist = copy_tree(plist);
        final SubLObject pcase_var;
        final SubLObject sense = pcase_var = getf(plist, $SENSE, UNPROVIDED);
        if (!pcase_var.eql($POS)) {
            if (!pcase_var.eql($NEG)) {
                Errors.error($str166$removal_module__S_must_have_a__SE, name);
            }
        }
        return plist;
    }

    public static SubLObject undeclare_inference_removal_module(final SubLObject name, SubLObject reclassifyP) {
        if (reclassifyP == UNPROVIDED) {
            reclassifyP = T;
        }
        final SubLObject hl_module = find_hl_module_by_name(name);
        if (NIL != hl_module) {
            remove_hl_module(hl_module);
            set.set_remove(hl_module, $removal_modules$.getGlobalValue());
            $removal_modules_generic$.setGlobalValue(remove(hl_module, $removal_modules_generic$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            $removal_modules_universal$.setGlobalValue(remove(hl_module, $removal_modules_universal$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            $removal_modules_specific_use_generic$.setGlobalValue(delete(hl_module, $removal_modules_specific_use_generic$.getGlobalValue(), symbol_function(EQL), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED));
            $removal_modules_specific_use_meta_removal$.setGlobalValue(delete(hl_module, $removal_modules_specific_use_meta_removal$.getGlobalValue(), symbol_function(EQL), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED));
            $removal_modules_specific_dont_use_universal$.setGlobalValue(delete(hl_module, $removal_modules_specific_dont_use_universal$.getGlobalValue(), symbol_function(EQL), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED));
            if (NIL != reclassifyP) {
                reclassify_removal_modules();
            }
            return hl_module;
        }
        return NIL;
    }

    public static SubLObject undeclare_inference_meta_removal_module(final SubLObject name) {
        final SubLObject hl_module = find_hl_module_by_name(name);
        if (NIL != hl_module) {
            remove_hl_module(hl_module);
            set.set_remove(hl_module, $meta_removal_modules$.getGlobalValue());
        }
        return hl_module;
    }

    public static SubLObject undeclare_inference_removal_module_use_generic(final SubLObject predicate, final SubLObject name, SubLObject reclassifyP) {
        if (reclassifyP == UNPROVIDED) {
            reclassifyP = NIL;
        }
        final SubLObject hl_module = find_hl_module_by_name(name);
        if (NIL != hl_module) {
            final SubLObject existing = assoc(hl_module, $removal_modules_specific_use_generic$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
            if (NIL != existing) {
                rplacd(existing, delete(predicate, existing.rest(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                if (NIL == existing.rest()) {
                    $removal_modules_specific_use_generic$.setGlobalValue(delete(existing, $removal_modules_specific_use_generic$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                }
            }
            if (NIL != reclassifyP) {
                reclassify_removal_modules();
            }
            return hl_module;
        }
        return NIL;
    }

    public static SubLObject undeclare_inference_removal_module_use_meta_removal(final SubLObject predicate, final SubLObject name, SubLObject reclassifyP) {
        if (reclassifyP == UNPROVIDED) {
            reclassifyP = NIL;
        }
        final SubLObject hl_module = find_hl_module_by_name(name);
        if (NIL != hl_module) {
            final SubLObject existing = assoc(hl_module, $removal_modules_specific_use_meta_removal$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
            if (NIL != existing) {
                rplacd(existing, delete(predicate, existing.rest(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                if (NIL == existing.rest()) {
                    $removal_modules_specific_use_meta_removal$.setGlobalValue(delete(existing, $removal_modules_specific_use_meta_removal$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                }
            }
            if (NIL != reclassifyP) {
                reclassify_removal_modules();
            }
            return hl_module;
        }
        return NIL;
    }

    public static SubLObject undeclare_inference_removal_module_dont_use_universal(final SubLObject predicate, final SubLObject name, SubLObject reclassifyP) {
        if (reclassifyP == UNPROVIDED) {
            reclassifyP = NIL;
        }
        final SubLObject hl_module = find_hl_module_by_name(name);
        if (NIL != hl_module) {
            final SubLObject existing = assoc(hl_module, $removal_modules_specific_dont_use_universal$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
            if (NIL != existing) {
                rplacd(existing, delete(predicate, existing.rest(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                if (NIL == existing.rest()) {
                    $removal_modules_specific_dont_use_universal$.setGlobalValue(delete(existing, $removal_modules_specific_dont_use_universal$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                }
            }
            if (NIL != reclassifyP) {
                reclassify_removal_modules();
            }
            return hl_module;
        }
        return NIL;
    }

    public static SubLObject reclassify_removal_modules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_removal_modules();
        rebuild_solely_specific_removal_module_predicate_store();
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                SubLObject cdolist_list_var = $removal_modules_specific_use_generic$.getGlobalValue();
                SubLObject generic_info = NIL;
                generic_info = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = generic_info;
                    SubLObject hl_module = NIL;
                    SubLObject predicates = NIL;
                    destructuring_bind_must_consp(current, datum, $list168);
                    hl_module = current.first();
                    current = current.rest();
                    SubLObject cdolist_list_var_$3;
                    predicates = cdolist_list_var_$3 = current;
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
                final SubLObject set_var = removal_modules();
                final SubLObject set_contents_var = set.do_set_internal(set_var);
                SubLObject basis_object;
                SubLObject state_$4;
                SubLObject hl_module2;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state_$4 = NIL, state_$4 = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state_$4); state_$4 = set_contents.do_set_contents_update_state(state_$4)) {
                    hl_module2 = set_contents.do_set_contents_next(basis_object, state_$4);
                    if (NIL != set_contents.do_set_contents_element_validP(state_$4, hl_module2)) {
                        classify_removal_module(hl_module2);
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

    public static SubLObject clear_removal_modules() {
        clrhash($removal_modules_specific$.getGlobalValue());
        $removal_modules_external$.setGlobalValue(NIL);
        $removal_modules_generic$.setGlobalValue(NIL);
        $removal_modules_universal$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject classify_removal_module(final SubLObject hl_module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != hl_module_externalP(hl_module)) {
            if (NIL != $classify_removal_modules_with_deterministic_sortP$.getDynamicValue(thread)) {
                $removal_modules_external$.setGlobalValue(list_utilities.sort_adjoin(hl_module, $removal_modules_external$.getGlobalValue(), EQL, $sym169$INFERENCE_REMOVAL_MODULE__FOR_CLASSIFICATION, IDENTITY));
            } else
                if (NIL == member(hl_module, $removal_modules_external$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $removal_modules_external$.setGlobalValue(cons(hl_module, $removal_modules_external$.getGlobalValue()));
                }

        } else {
            final SubLObject predicate_spec = hl_module_predicate(hl_module);
            final SubLObject universalP = hl_module_universal(hl_module);
            if (NIL != universalP) {
                if (NIL != $classify_removal_modules_with_deterministic_sortP$.getDynamicValue(thread)) {
                    $removal_modules_universal$.setGlobalValue(list_utilities.sort_adjoin(hl_module, $removal_modules_universal$.getGlobalValue(), EQL, $sym169$INFERENCE_REMOVAL_MODULE__FOR_CLASSIFICATION, IDENTITY));
                } else
                    if (NIL == member(hl_module, $removal_modules_universal$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                        $removal_modules_universal$.setGlobalValue(cons(hl_module, $removal_modules_universal$.getGlobalValue()));
                    }

            } else
                if (NIL == predicate_spec) {
                    if (NIL != $classify_removal_modules_with_deterministic_sortP$.getDynamicValue(thread)) {
                        $removal_modules_generic$.setGlobalValue(list_utilities.sort_adjoin(hl_module, $removal_modules_generic$.getGlobalValue(), EQL, $sym169$INFERENCE_REMOVAL_MODULE__FOR_CLASSIFICATION, IDENTITY));
                    } else
                        if (NIL == member(hl_module, $removal_modules_generic$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                            $removal_modules_generic$.setGlobalValue(cons(hl_module, $removal_modules_generic$.getGlobalValue()));
                        }

                } else
                    if (predicate_spec.isAtom()) {
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

    public static SubLObject inference_removal_module_note_specific(final SubLObject predicate, final SubLObject hl_module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash(predicate, $removal_modules_specific$.getGlobalValue(), NIL != $classify_removal_modules_with_deterministic_sortP$.getDynamicValue(thread) ? list_utilities.sort_adjoin(hl_module, gethash(predicate, $removal_modules_specific$.getGlobalValue(), NIL), EQL, $sym169$INFERENCE_REMOVAL_MODULE__FOR_CLASSIFICATION, IDENTITY) : adjoin(hl_module, gethash(predicate, $removal_modules_specific$.getGlobalValue(), NIL), UNPROVIDED, UNPROVIDED));
        return hl_module;
    }

    public static SubLObject inference_removal_moduleL_for_classification(final SubLObject module1, final SubLObject module2) {
        final SubLObject module1_specific_use_genericP = removal_module_specific_use_genericP(module1);
        final SubLObject module2_specific_use_genericP = removal_module_specific_use_genericP(module2);
        if ((NIL != module1_specific_use_genericP) && (NIL == module2_specific_use_genericP)) {
            return NIL;
        }
        if ((NIL == module1_specific_use_genericP) && (NIL != module2_specific_use_genericP)) {
            return T;
        }
        final SubLObject name1 = symbol_name(hl_module_name(module1));
        final SubLObject name2 = symbol_name(hl_module_name(module2));
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
        return assoc(module, $removal_modules_specific_use_generic$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject removal_module_specific_use_genericP(final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
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
            results = arg2(thread.resetMultipleValues(), multiple_value_list(removal_module_specific_use_genericP_internal(module)));
            memoization_state.caching_state_put(caching_state, module, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject inference_removal_pruning_module(final SubLObject name, final SubLObject plist) {
        SubLObject removal_plist = list_utilities.merge_plist(plist, $removal_pruning_module_properties$.getGlobalValue());
        final SubLObject subtypes = adjoin($PRUNING, getf(plist, $MODULE_SUBTYPE, NIL), UNPROVIDED, UNPROVIDED);
        removal_plist = putf(removal_plist, $MODULE_SUBTYPE, subtypes);
        return inference_removal_module(name, removal_plist);
    }

    public static SubLObject removal_pruning_moduleP(final SubLObject v_object) {
        return makeBoolean((NIL != removal_module_p(v_object)) && (NIL != list_utilities.member_eqP($PRUNING, hl_module_subtypes(v_object))));
    }

    public static SubLObject do_conjunctive_removal_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list174);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject module = NIL;
        destructuring_bind_must_consp(current, datum, $list174);
        module = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$6 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list174);
            current_$6 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list174);
            if (NIL == member(current_$6, $list87, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$6 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list174);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_SET, list(module, $list175, $DONE, done), append(body, NIL));
    }

    public static SubLObject removal_modules_conjunctive() {
        return $conjunctive_removal_modules$.getGlobalValue();
    }

    public static SubLObject conjunctive_removal_module_p(final SubLObject v_object) {
        return set.set_memberP(v_object, $conjunctive_removal_modules$.getGlobalValue());
    }

    public static SubLObject conjunctive_removal_module_count() {
        return set.set_size($conjunctive_removal_modules$.getGlobalValue());
    }

    public static SubLObject conjunctive_removal_modules() {
        SubLObject v_modules = NIL;
        final SubLObject set_var = removal_modules_conjunctive();
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject module;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            module = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, module)) {
                v_modules = cons(module, v_modules);
            }
        }
        return v_modules;
    }

    public static SubLObject inference_conjunctive_removal_module(final SubLObject name, final SubLObject plist) {
        final SubLObject hl_module = setup_module(name, $REMOVAL_CONJUNCTIVE, plist);
        set.set_add(hl_module, $conjunctive_removal_modules$.getGlobalValue());
        return hl_module;
    }

    public static SubLObject undeclare_inference_conjunctive_removal_module(final SubLObject name) {
        final SubLObject hl_module = find_hl_module_by_name(name);
        if (NIL != hl_module_p(hl_module)) {
            remove_hl_module(hl_module);
            return set.set_remove(hl_module, $conjunctive_removal_modules$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject do_meta_removal_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list147);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject hl_module = NIL;
        destructuring_bind_must_consp(current, datum, $list147);
        hl_module = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$7 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list147);
            current_$7 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list147);
            if (NIL == member(current_$7, $list87, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$7 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list147);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_LIST, list(hl_module, $list179, $DONE, done), append(body, NIL));
    }

    public static SubLObject meta_removal_modules() {
        return $meta_removal_modules$.getGlobalValue();
    }

    public static SubLObject meta_removal_module_list() {
        return copy_list($meta_removal_modules$.getGlobalValue());
    }

    public static SubLObject meta_removal_module_p(final SubLObject v_object) {
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

    public static SubLObject meta_removal_module_count() {
        return length($meta_removal_modules$.getGlobalValue());
    }

    public static SubLObject meta_removal_module_specific_predicates(final SubLObject meta_removal_module) {
        return list_utilities.alist_lookup($removal_modules_specific_use_meta_removal$.getGlobalValue(), meta_removal_module, symbol_function(EQL), UNPROVIDED);
    }

    public static SubLObject meta_removal_module_specific_predicateP(final SubLObject meta_removal_module, final SubLObject predicate) {
        return subl_promotions.memberP(predicate, meta_removal_module_specific_predicates(meta_removal_module), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject predicate_uses_meta_removal_moduleP(final SubLObject predicate, final SubLObject meta_removal_module) {
        if (((NIL != forts.fort_p(predicate)) && (NIL != solely_specific_removal_module_predicateP(predicate))) && (NIL == meta_removal_module_specific_predicateP(meta_removal_module, predicate))) {
            return NIL;
        }
        return T;
    }

    public static SubLObject inference_meta_removal_module(final SubLObject name, SubLObject plist) {
        if (plist == UNPROVIDED) {
            plist = NIL;
        }
        final SubLObject item_var;
        final SubLObject hl_module = item_var = setup_module(name, $META_REMOVAL, plist);
        if (NIL == member(item_var, $meta_removal_modules$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $meta_removal_modules$.setGlobalValue(cons(item_var, $meta_removal_modules$.getGlobalValue()));
        }
        return hl_module;
    }

    public static SubLObject removal_proof_module_p(final SubLObject hl_module) {
        return makeBoolean((NIL != removal_module_p(hl_module)) || (NIL != conjunctive_removal_module_p(hl_module)));
    }

    public static SubLObject do_transformation_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list147);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject hl_module = NIL;
        destructuring_bind_must_consp(current, datum, $list147);
        hl_module = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$8 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list147);
            current_$8 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list147);
            if (NIL == member(current_$8, $list87, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$8 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list147);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_LIST, list(hl_module, $list184, $DONE, done), append(body, NIL));
    }

    public static SubLObject transformation_modules() {
        return $transformation_modules$.getGlobalValue();
    }

    public static SubLObject transformation_module_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $transformation_modules$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject transformation_module_count() {
        return length($transformation_modules$.getGlobalValue());
    }

    public static SubLObject inference_transformation_module(final SubLObject name, final SubLObject plist) {
        final SubLObject item_var;
        final SubLObject hl_module = item_var = setup_module(name, $TRANSFORMATION, plist);
        if (NIL == member(item_var, $transformation_modules$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $transformation_modules$.setGlobalValue(cons(item_var, $transformation_modules$.getGlobalValue()));
        }
        return hl_module;
    }

    public static SubLObject do_meta_transformation_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list147);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject hl_module = NIL;
        destructuring_bind_must_consp(current, datum, $list147);
        hl_module = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$9 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list147);
            current_$9 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list147);
            if (NIL == member(current_$9, $list87, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$9 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list147);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_LIST, list(hl_module, $list189, $DONE, done), append(body, NIL));
    }

    public static SubLObject meta_transformation_modules() {
        return $meta_transformation_modules$.getGlobalValue();
    }

    public static SubLObject meta_transformation_module_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $meta_transformation_modules$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject meta_transformation_module_count() {
        return length($meta_transformation_modules$.getGlobalValue());
    }

    public static SubLObject inference_meta_transformation_module(final SubLObject name, SubLObject plist) {
        if (plist == UNPROVIDED) {
            plist = NIL;
        }
        final SubLObject item_var;
        final SubLObject hl_module = item_var = setup_module(name, $META_TRANSFORMATION, plist);
        if (NIL == member(item_var, $meta_transformation_modules$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $meta_transformation_modules$.setGlobalValue(cons(item_var, $meta_transformation_modules$.getGlobalValue()));
        }
        return hl_module;
    }

    public static SubLObject do_rewrite_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list174);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject module = NIL;
        destructuring_bind_must_consp(current, datum, $list174);
        module = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$10 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list174);
            current_$10 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list174);
            if (NIL == member(current_$10, $list87, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$10 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list174);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_LIST, list(module, $list194, $DONE, done), append(body, NIL));
    }

    public static SubLObject rewrite_modules() {
        return copy_list($rewrite_modules$.getGlobalValue());
    }

    public static SubLObject rewrite_module_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $rewrite_modules$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rewrite_module_count() {
        return length($rewrite_modules$.getGlobalValue());
    }

    public static SubLObject rewrite_module_support(final SubLObject module) {
        final SubLObject support_spec = hl_module_property_without_values(module, $REWRITE_SUPPORT);
        if (support_spec.isSymbol()) {
            return symbol_value(support_spec);
        }
        return support_spec;
    }

    public static SubLObject rewrite_module_closure(final SubLObject module) {
        return hl_module_property_without_values(module, $REWRITE_CLOSURE);
    }

    public static SubLObject inference_rewrite_module(final SubLObject name, final SubLObject plist) {
        final SubLObject strengthened_plist = strengthen_rewrite_module_properties(name, plist);
        final SubLObject item_var;
        final SubLObject hl_module = item_var = setup_module(name, $REWRITE, strengthened_plist);
        if (NIL == member(item_var, $rewrite_modules$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $rewrite_modules$.setGlobalValue(cons(item_var, $rewrite_modules$.getGlobalValue()));
        }
        return hl_module;
    }

    public static SubLObject undeclare_rewrite_module(final SubLObject hl_module) {
        return deregister_rewrite_module(hl_module);
    }

    public static SubLObject undeclare_rewrite_module_by_name(final SubLObject name) {
        return deregister_rewrite_module_by_name(name);
    }

    public static SubLObject deregister_rewrite_module(final SubLObject module) {
        remove_hl_module(module);
        $rewrite_modules$.setGlobalValue(remove(module, $rewrite_modules$.getGlobalValue(), symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return module;
    }

    public static SubLObject deregister_rewrite_module_by_name(final SubLObject name) {
        final SubLObject module = find_hl_module_by_name(name);
        return deregister_rewrite_module(module);
    }

    public static SubLObject strengthen_rewrite_module_properties(final SubLObject name, SubLObject plist) {
        plist = copy_tree(plist);
        final SubLObject pcase_var;
        final SubLObject sense = pcase_var = getf(plist, $SENSE, UNPROVIDED);
        if (!pcase_var.eql($POS)) {
            if (!pcase_var.eql($NEG)) {
                Errors.error($str198$rewrite_module__S_must_have_a__SE, name);
            }
        }
        return plist;
    }

    public static SubLObject structural_module_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $structural_modules$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject inference_structural_module(final SubLObject name, SubLObject plist) {
        if (plist == UNPROVIDED) {
            plist = NIL;
        }
        final SubLObject item_var;
        final SubLObject hl_module = item_var = setup_module(name, $STRUCTURAL, plist);
        if (NIL == member(item_var, $structural_modules$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $structural_modules$.setGlobalValue(cons(item_var, $structural_modules$.getGlobalValue()));
        }
        return hl_module;
    }

    public static SubLObject structural_module_count() {
        return length($structural_modules$.getGlobalValue());
    }

    public static SubLObject do_meta_structural_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list147);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject hl_module = NIL;
        destructuring_bind_must_consp(current, datum, $list147);
        hl_module = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$11 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list147);
            current_$11 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list147);
            if (NIL == member(current_$11, $list87, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$11 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list147);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_LIST, list(hl_module, $list202, $DONE, done), append(body, NIL));
    }

    public static SubLObject meta_structural_modules() {
        return $meta_structural_modules$.getGlobalValue();
    }

    public static SubLObject meta_structural_module_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $meta_structural_modules$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject meta_structural_module_count() {
        return length($meta_structural_modules$.getGlobalValue());
    }

    public static SubLObject inference_meta_structural_module(final SubLObject name, SubLObject plist) {
        if (plist == UNPROVIDED) {
            plist = NIL;
        }
        final SubLObject item_var;
        final SubLObject hl_module = item_var = setup_module(name, $META_STRUCTURAL, plist);
        if (NIL == member(item_var, $meta_structural_modules$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $meta_structural_modules$.setGlobalValue(cons(item_var, $meta_structural_modules$.getGlobalValue()));
        }
        return hl_module;
    }

    public static SubLObject cfasl_output_object_hl_module_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_wide_output_hl_module(v_object, stream);
    }

    public static SubLObject cfasl_wide_output_hl_module(final SubLObject hl_module, final SubLObject stream) {
        cfasl_output_wide_opcode($cfasl_wide_opcode_hl_module$.getGlobalValue(), stream);
        cfasl_output_hl_module_internal(hl_module, stream);
        return hl_module;
    }

    public static SubLObject cfasl_output_hl_module_internal(final SubLObject hl_module, final SubLObject stream) {
        cfasl_output(hl_module_name(hl_module), stream);
        cfasl_output(hl_module_plist(hl_module), stream);
        return hl_module;
    }

    public static SubLObject cfasl_input_hl_module(final SubLObject stream) {
        final SubLObject name = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject plist = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        return new_hl_module(name, plist);
    }

    public static SubLObject declare_inference_modules_file() {
        declareFunction(me, "hl_module_property_p", "HL-MODULE-PROPERTY-P", 1, 0, false);
        declareMacro(me, "do_hl_module_properties", "DO-HL-MODULE-PROPERTIES");
        declareFunction(me, "hl_module_properties", "HL-MODULE-PROPERTIES", 0, 0, false);
        declareFunction(me, "removal_module_plist_indicators", "REMOVAL-MODULE-PLIST-INDICATORS", 0, 0, false);
        declareFunction(me, "hl_module_subtype_p", "HL-MODULE-SUBTYPE-P", 1, 0, false);
        declareFunction(me, "allowed_modules_spec_p", "ALLOWED-MODULES-SPEC-P", 1, 0, false);
        new inference_modules.$allowed_modules_spec_p$UnaryFunction();
        declareFunction(me, "non_universal_allowed_modules_spec_p", "NON-UNIVERSAL-ALLOWED-MODULES-SPEC-P", 1, 0, false);
        declareFunction(me, "disjunctive_allowed_modules_spec_p", "DISJUNCTIVE-ALLOWED-MODULES-SPEC-P", 1, 0, false);
        declareFunction(me, "conjunctive_allowed_modules_spec_p", "CONJUNCTIVE-ALLOWED-MODULES-SPEC-P", 1, 0, false);
        declareFunction(me, "negated_allowed_modules_spec_p", "NEGATED-ALLOWED-MODULES-SPEC-P", 1, 0, false);
        declareFunction(me, "hl_module_type_spec_p", "HL-MODULE-TYPE-SPEC-P", 1, 0, false);
        declareFunction(me, "hl_module_subtype_spec_p", "HL-MODULE-SUBTYPE-SPEC-P", 1, 0, false);
        declareFunction(me, "property_allowed_modules_spec_p", "PROPERTY-ALLOWED-MODULES-SPEC-P", 1, 0, false);
        declareFunction(me, "hl_module_allowedP", "HL-MODULE-ALLOWED?", 2, 0, false);
        declareFunction(me, "hl_module_allowed_by_allowed_modules_specP", "HL-MODULE-ALLOWED-BY-ALLOWED-MODULES-SPEC?", 2, 0, false);
        declareFunction(me, "simple_allowed_modules_spec_p", "SIMPLE-ALLOWED-MODULES-SPEC-P", 1, 0, false);
        declareFunction(me, "get_modules_from_simple_allowed_modules_spec", "GET-MODULES-FROM-SIMPLE-ALLOWED-MODULES-SPEC", 1, 0, false);
        declareFunction(me, "hl_module_print_function_trampoline", "HL-MODULE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "hl_module_p", "HL-MODULE-P", 1, 0, false);
        new inference_modules.$hl_module_p$UnaryFunction();
        declareFunction(me, "hl_mod_name", "HL-MOD-NAME", 1, 0, false);
        declareFunction(me, "hl_mod_plist", "HL-MOD-PLIST", 1, 0, false);
        declareFunction(me, "hl_mod_sense", "HL-MOD-SENSE", 1, 0, false);
        declareFunction(me, "hl_mod_predicate", "HL-MOD-PREDICATE", 1, 0, false);
        declareFunction(me, "hl_mod_any_predicates", "HL-MOD-ANY-PREDICATES", 1, 0, false);
        declareFunction(me, "hl_mod_arity", "HL-MOD-ARITY", 1, 0, false);
        declareFunction(me, "hl_mod_direction", "HL-MOD-DIRECTION", 1, 0, false);
        declareFunction(me, "hl_mod_required_pattern", "HL-MOD-REQUIRED-PATTERN", 1, 0, false);
        declareFunction(me, "hl_mod_required_mt", "HL-MOD-REQUIRED-MT", 1, 0, false);
        declareFunction(me, "hl_mod_exclusive_func", "HL-MOD-EXCLUSIVE-FUNC", 1, 0, false);
        declareFunction(me, "hl_mod_required_func", "HL-MOD-REQUIRED-FUNC", 1, 0, false);
        declareFunction(me, "hl_mod_completeness", "HL-MOD-COMPLETENESS", 1, 0, false);
        declareFunction(me, "_csetf_hl_mod_name", "_CSETF-HL-MOD-NAME", 2, 0, false);
        declareFunction(me, "_csetf_hl_mod_plist", "_CSETF-HL-MOD-PLIST", 2, 0, false);
        declareFunction(me, "_csetf_hl_mod_sense", "_CSETF-HL-MOD-SENSE", 2, 0, false);
        declareFunction(me, "_csetf_hl_mod_predicate", "_CSETF-HL-MOD-PREDICATE", 2, 0, false);
        declareFunction(me, "_csetf_hl_mod_any_predicates", "_CSETF-HL-MOD-ANY-PREDICATES", 2, 0, false);
        declareFunction(me, "_csetf_hl_mod_arity", "_CSETF-HL-MOD-ARITY", 2, 0, false);
        declareFunction(me, "_csetf_hl_mod_direction", "_CSETF-HL-MOD-DIRECTION", 2, 0, false);
        declareFunction(me, "_csetf_hl_mod_required_pattern", "_CSETF-HL-MOD-REQUIRED-PATTERN", 2, 0, false);
        declareFunction(me, "_csetf_hl_mod_required_mt", "_CSETF-HL-MOD-REQUIRED-MT", 2, 0, false);
        declareFunction(me, "_csetf_hl_mod_exclusive_func", "_CSETF-HL-MOD-EXCLUSIVE-FUNC", 2, 0, false);
        declareFunction(me, "_csetf_hl_mod_required_func", "_CSETF-HL-MOD-REQUIRED-FUNC", 2, 0, false);
        declareFunction(me, "_csetf_hl_mod_completeness", "_CSETF-HL-MOD-COMPLETENESS", 2, 0, false);
        declareFunction(me, "make_hl_module", "MAKE-HL-MODULE", 0, 1, false);
        declareFunction(me, "visit_defstruct_hl_module", "VISIT-DEFSTRUCT-HL-MODULE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_hl_module_method", "VISIT-DEFSTRUCT-OBJECT-HL-MODULE-METHOD", 2, 0, false);
        declareFunction(me, "print_hl_module", "PRINT-HL-MODULE", 3, 0, false);
        declareFunction(me, "sxhash_hl_module_method", "SXHASH-HL-MODULE-METHOD", 1, 0, false);
        new inference_modules.$sxhash_hl_module_method$UnaryFunction();
        declareFunction(me, "check_hl_module_property_list", "CHECK-HL-MODULE-PROPERTY-LIST", 1, 0, false);
        declareFunction(me, "new_hl_module", "NEW-HL-MODULE", 2, 0, false);
        declareFunction(me, "clear_cfasl_create_invalid_hl_module", "CLEAR-CFASL-CREATE-INVALID-HL-MODULE", 0, 0, false);
        declareFunction(me, "remove_cfasl_create_invalid_hl_module", "REMOVE-CFASL-CREATE-INVALID-HL-MODULE", 1, 0, false);
        declareFunction(me, "cfasl_create_invalid_hl_module_internal", "CFASL-CREATE-INVALID-HL-MODULE-INTERNAL", 1, 0, false);
        declareFunction(me, "cfasl_create_invalid_hl_module", "CFASL-CREATE-INVALID-HL-MODULE", 1, 0, false);
        declareFunction(me, "canonicalize_hl_module_plist", "CANONICALIZE-HL-MODULE-PLIST", 1, 0, false);
        declareFunction(me, "allocate_hl_module", "ALLOCATE-HL-MODULE", 1, 0, false);
        declareFunction(me, "destroy_hl_module", "DESTROY-HL-MODULE", 1, 0, false);
        declareFunction(me, "hl_module_name", "HL-MODULE-NAME", 1, 0, false);
        declareFunction(me, "hl_module_plist", "HL-MODULE-PLIST", 1, 0, false);
        declareFunction(me, "hl_module_property", "HL-MODULE-PROPERTY", 2, 0, false);
        declareFunction(me, "hl_module_property_without_values", "HL-MODULE-PROPERTY-WITHOUT-VALUES", 2, 0, false);
        declareFunction(me, "hl_module_property_not_defaultP", "HL-MODULE-PROPERTY-NOT-DEFAULT?", 2, 0, false);
        declareMacro(me, "do_hl_modules", "DO-HL-MODULES");
        declareFunction(me, "hl_module_store", "HL-MODULE-STORE", 0, 0, false);
        declareFunction(me, "find_hl_module_by_name", "FIND-HL-MODULE-BY-NAME", 1, 0, false);
        declareFunction(me, "add_hl_module", "ADD-HL-MODULE", 1, 0, false);
        declareFunction(me, "remove_hl_module", "REMOVE-HL-MODULE", 1, 0, false);
        declareFunction(me, "setup_module", "SETUP-MODULE", 3, 0, false);
        declareFunction(me, "default_cost_func", "DEFAULT-COST-FUNC", 0, 1, false);
        declareFunction(me, "default_expand_func", "DEFAULT-EXPAND-FUNC", 0, 2, false);
        declareFunction(me, "hl_module_type", "HL-MODULE-TYPE", 1, 0, false);
        declareFunction(me, "hl_module_subtypes", "HL-MODULE-SUBTYPES", 1, 0, false);
        declareFunction(me, "abductive_hl_moduleP", "ABDUCTIVE-HL-MODULE?", 1, 0, false);
        declareFunction(me, "hl_module_universal", "HL-MODULE-UNIVERSAL", 1, 0, false);
        declareFunction(me, "hl_module_source", "HL-MODULE-SOURCE", 1, 0, false);
        declareFunction(me, "hl_module_sense", "HL-MODULE-SENSE", 1, 0, false);
        new inference_modules.$hl_module_sense$UnaryFunction();
        declareFunction(me, "hl_module_sense_relevant_p", "HL-MODULE-SENSE-RELEVANT-P", 2, 0, false);
        declareFunction(me, "hl_module_required_pattern", "HL-MODULE-REQUIRED-PATTERN", 1, 0, false);
        declareFunction(me, "hl_module_required_pattern_matched_p", "HL-MODULE-REQUIRED-PATTERN-MATCHED-P", 2, 0, false);
        declareFunction(me, "hl_module_required_mt", "HL-MODULE-REQUIRED-MT", 1, 0, false);
        declareFunction(me, "hl_module_required_mt_result", "HL-MODULE-REQUIRED-MT-RESULT", 1, 0, false);
        declareFunction(me, "interpret_hl_module_mt_prop", "INTERPRET-HL-MODULE-MT-PROP", 1, 0, false);
        declareFunction(me, "hl_module_required_mt_relevantP", "HL-MODULE-REQUIRED-MT-RELEVANT?", 1, 0, false);
        declareFunction(me, "hl_module_required_func", "HL-MODULE-REQUIRED-FUNC", 1, 0, false);
        declareFunction(me, "hl_module_required_func_p", "HL-MODULE-REQUIRED-FUNC-P", 2, 0, false);
        declareFunction(me, "hl_module_cost_pattern", "HL-MODULE-COST-PATTERN", 1, 0, false);
        declareFunction(me, "hl_module_cost_expression", "HL-MODULE-COST-EXPRESSION", 1, 0, false);
        declareFunction(me, "hl_module_cost_func", "HL-MODULE-COST-FUNC", 1, 0, false);
        declareFunction(me, "hl_module_cost", "HL-MODULE-COST", 2, 1, false);
        declareFunction(me, "hl_module_asent_cost", "HL-MODULE-ASENT-COST", 2, 0, false);
        declareFunction(me, "hl_module_clause_cost", "HL-MODULE-CLAUSE-COST", 2, 0, false);
        declareFunction(me, "hl_module_cost_pattern_result", "HL-MODULE-COST-PATTERN-RESULT", 2, 0, false);
        declareFunction(me, "hl_module_cost_expression_result", "HL-MODULE-COST-EXPRESSION-RESULT", 1, 0, false);
        declareFunction(me, "hl_module_cost_function_result", "HL-MODULE-COST-FUNCTION-RESULT", 2, 0, false);
        declareFunction(me, "hl_module_asent_cost_function_result", "HL-MODULE-ASENT-COST-FUNCTION-RESULT", 2, 0, false);
        declareFunction(me, "hl_module_clause_cost_function_result", "HL-MODULE-CLAUSE-COST-FUNCTION-RESULT", 2, 0, false);
        declareFunction(me, "hl_module_is_checkP", "HL-MODULE-IS-CHECK?", 1, 0, false);
        declareFunction(me, "guess_hl_module_is_checkP", "GUESS-HL-MODULE-IS-CHECK?", 1, 0, false);
        declareFunction(me, "hl_module_rule_select_func", "HL-MODULE-RULE-SELECT-FUNC", 1, 0, false);
        declareFunction(me, "hl_module_rule_filter_func", "HL-MODULE-RULE-FILTER-FUNC", 1, 0, false);
        declareFunction(me, "hl_module_expand_func", "HL-MODULE-EXPAND-FUNC", 1, 0, false);
        declareFunction(me, "default_expand_func_for_hl_module", "DEFAULT-EXPAND-FUNC-FOR-HL-MODULE", 1, 0, false);
        declareFunction(me, "hl_module_expand_pattern", "HL-MODULE-EXPAND-PATTERN", 1, 0, false);
        declareFunction(me, "hl_module_expand_iterative_pattern", "HL-MODULE-EXPAND-ITERATIVE-PATTERN", 1, 0, false);
        declareFunction(me, "hl_module_predicate", "HL-MODULE-PREDICATE", 1, 0, false);
        declareFunction(me, "hl_module_predicate_relevant_p", "HL-MODULE-PREDICATE-RELEVANT-P", 2, 0, false);
        declareFunction(me, "hl_module_arity", "HL-MODULE-ARITY", 1, 0, false);
        declareFunction(me, "hl_module_arity_relevant_p", "HL-MODULE-ARITY-RELEVANT-P", 2, 0, false);
        declareFunction(me, "hl_module_exclusive_func", "HL-MODULE-EXCLUSIVE-FUNC", 1, 0, false);
        declareFunction(me, "hl_module_supplants_info", "HL-MODULE-SUPPLANTS-INFO", 1, 0, false);
        declareFunction(me, "hl_module_direction", "HL-MODULE-DIRECTION", 1, 0, false);
        declareFunction(me, "hl_module_direction_relevantP", "HL-MODULE-DIRECTION-RELEVANT?", 1, 0, false);
        declareFunction(me, "hl_module_input_extract_pattern", "HL-MODULE-INPUT-EXTRACT-PATTERN", 1, 0, false);
        declareFunction(me, "hl_module_input_verify_pattern", "HL-MODULE-INPUT-VERIFY-PATTERN", 1, 0, false);
        declareFunction(me, "hl_module_input_encode_pattern", "HL-MODULE-INPUT-ENCODE-PATTERN", 1, 0, false);
        declareFunction(me, "hl_module_output_check_pattern", "HL-MODULE-OUTPUT-CHECK-PATTERN", 1, 0, false);
        declareFunction(me, "hl_module_output_generate_pattern", "HL-MODULE-OUTPUT-GENERATE-PATTERN", 1, 0, false);
        declareFunction(me, "hl_module_output_decode_pattern", "HL-MODULE-OUTPUT-DECODE-PATTERN", 1, 0, false);
        declareFunction(me, "hl_module_output_verify_pattern", "HL-MODULE-OUTPUT-VERIFY-PATTERN", 1, 0, false);
        declareFunction(me, "hl_module_output_construct_pattern", "HL-MODULE-OUTPUT-CONSTRUCT-PATTERN", 1, 0, false);
        declareFunction(me, "hl_module_support_pattern", "HL-MODULE-SUPPORT-PATTERN", 1, 0, false);
        declareFunction(me, "hl_module_support_func", "HL-MODULE-SUPPORT-FUNC", 1, 0, false);
        declareFunction(me, "hl_module_support_module", "HL-MODULE-SUPPORT-MODULE", 1, 0, false);
        declareFunction(me, "hl_module_support_mt", "HL-MODULE-SUPPORT-MT", 1, 0, false);
        declareFunction(me, "hl_module_support_mt_result", "HL-MODULE-SUPPORT-MT-RESULT", 1, 0, false);
        declareFunction(me, "hl_module_support_strength", "HL-MODULE-SUPPORT-STRENGTH", 1, 0, false);
        declareFunction(me, "hl_module_every_predicates", "HL-MODULE-EVERY-PREDICATES", 1, 0, false);
        declareFunction(me, "hl_module_applicability_func", "HL-MODULE-APPLICABILITY-FUNC", 1, 0, false);
        declareFunction(me, "hl_module_applicability_pattern", "HL-MODULE-APPLICABILITY-PATTERN", 1, 0, false);
        declareFunction(me, "hl_module_any_predicates", "HL-MODULE-ANY-PREDICATES", 1, 0, false);
        declareFunction(me, "hl_module_documentation_string", "HL-MODULE-DOCUMENTATION-STRING", 1, 0, false);
        declareFunction(me, "hl_module_example_string", "HL-MODULE-EXAMPLE-STRING", 1, 0, false);
        declareFunction(me, "hl_module_completeP", "HL-MODULE-COMPLETE?", 2, 0, false);
        declareFunction(me, "hl_module_incompleteP", "HL-MODULE-INCOMPLETE?", 2, 0, false);
        declareFunction(me, "hl_module_completeness", "HL-MODULE-COMPLETENESS", 2, 1, false);
        declareFunction(me, "hl_module_clause_completeness", "HL-MODULE-CLAUSE-COMPLETENESS", 2, 0, false);
        declareFunction(me, "hl_module_externalP", "HL-MODULE-EXTERNAL?", 1, 0, false);
        declareFunction(me, "hl_module_activeP", "HL-MODULE-ACTIVE?", 1, 1, false);
        declareFunction(me, "hl_module_implementation_methods", "HL-MODULE-IMPLEMENTATION-METHODS", 1, 0, false);
        declareMacro(me, "do_removal_modules", "DO-REMOVAL-MODULES");
        declareFunction(me, "removal_modules", "REMOVAL-MODULES", 0, 0, false);
        declareFunction(me, "removal_module_p", "REMOVAL-MODULE-P", 1, 0, false);
        declareFunction(me, "removal_module_count", "REMOVAL-MODULE-COUNT", 0, 0, false);
        declareFunction(me, "some_external_removal_modulesP", "SOME-EXTERNAL-REMOVAL-MODULES?", 0, 0, false);
        declareFunction(me, "removal_modules_external", "REMOVAL-MODULES-EXTERNAL", 0, 0, false);
        declareFunction(me, "generic_removal_module_p", "GENERIC-REMOVAL-MODULE-P", 1, 0, false);
        declareFunction(me, "generic_removal_modules", "GENERIC-REMOVAL-MODULES", 0, 0, false);
        declareFunction(me, "generic_removal_modules_for_sense", "GENERIC-REMOVAL-MODULES-FOR-SENSE", 1, 0, false);
        declareFunction(me, "generic_removal_module_count", "GENERIC-REMOVAL-MODULE-COUNT", 0, 0, false);
        declareFunction(me, "universal_removal_modules", "UNIVERSAL-REMOVAL-MODULES", 0, 0, false);
        declareFunction(me, "universal_removal_module_p", "UNIVERSAL-REMOVAL-MODULE-P", 1, 0, false);
        declareFunction(me, "universal_removal_module_count", "UNIVERSAL-REMOVAL-MODULE-COUNT", 0, 0, false);
        declareFunction(me, "universal_removal_module_exception_predicates", "UNIVERSAL-REMOVAL-MODULE-EXCEPTION-PREDICATES", 1, 0, false);
        declareFunction(me, "universal_removal_module_exception_predicateP", "UNIVERSAL-REMOVAL-MODULE-EXCEPTION-PREDICATE?", 2, 0, false);
        declareFunction(me, "predicate_doesnt_use_universal_removal_moduleP", "PREDICATE-DOESNT-USE-UNIVERSAL-REMOVAL-MODULE?", 2, 0, false);
        declareFunction(me, "universal_removal_modules_for_sense", "UNIVERSAL-REMOVAL-MODULES-FOR-SENSE", 1, 0, false);
        declareFunction(me, "removal_modules_specific", "REMOVAL-MODULES-SPECIFIC", 1, 0, false);
        declareFunction(me, "predicate_has_specific_removal_modulesP", "PREDICATE-HAS-SPECIFIC-REMOVAL-MODULES?", 1, 0, false);
        declareFunction(me, "removal_modules_specific_for_sense", "REMOVAL-MODULES-SPECIFIC-FOR-SENSE", 2, 0, false);
        declareFunction(me, "removal_modules_universal_for_predicate_and_sense", "REMOVAL-MODULES-UNIVERSAL-FOR-PREDICATE-AND-SENSE", 2, 0, false);
        declareFunction(me, "predicates_with_specific_removal_modules", "PREDICATES-WITH-SPECIFIC-REMOVAL-MODULES", 0, 0, false);
        declareFunction(me, "specific_removal_modules", "SPECIFIC-REMOVAL-MODULES", 0, 0, false);
        declareFunction(me, "specific_removal_module_count", "SPECIFIC-REMOVAL-MODULE-COUNT", 0, 0, false);
        declareFunction(me, "specific_removal_module_set", "SPECIFIC-REMOVAL-MODULE-SET", 0, 0, false);
        declareFunction(me, "clear_solely_specific_removal_module_predicate_store", "CLEAR-SOLELY-SPECIFIC-REMOVAL-MODULE-PREDICATE-STORE", 0, 0, false);
        declareFunction(me, "rebuild_solely_specific_removal_module_predicate_store", "REBUILD-SOLELY-SPECIFIC-REMOVAL-MODULE-PREDICATE-STORE", 0, 0, false);
        declareFunction(me, "register_solely_specific_removal_module_predicate", "REGISTER-SOLELY-SPECIFIC-REMOVAL-MODULE-PREDICATE", 1, 0, false);
        declareFunction(me, "deregister_solely_specific_removal_module_predicate", "DEREGISTER-SOLELY-SPECIFIC-REMOVAL-MODULE-PREDICATE", 1, 0, false);
        declareFunction(me, "solely_specific_removal_module_predicateP", "SOLELY-SPECIFIC-REMOVAL-MODULE-PREDICATE?", 1, 0, false);
        declareFunction(me, "inference_removal_module", "INFERENCE-REMOVAL-MODULE", 2, 0, false);
        declareFunction(me, "inference_removal_module_use_generic", "INFERENCE-REMOVAL-MODULE-USE-GENERIC", 2, 0, false);
        declareFunction(me, "inference_removal_module_use_meta_removal", "INFERENCE-REMOVAL-MODULE-USE-META-REMOVAL", 2, 0, false);
        declareFunction(me, "inference_removal_module_dont_use_universal", "INFERENCE-REMOVAL-MODULE-DONT-USE-UNIVERSAL", 2, 0, false);
        declareFunction(me, "redeclare_inference_removal_module", "REDECLARE-INFERENCE-REMOVAL-MODULE", 1, 0, false);
        declareFunction(me, "strengthen_removal_module_properties", "STRENGTHEN-REMOVAL-MODULE-PROPERTIES", 2, 0, false);
        declareFunction(me, "undeclare_inference_removal_module", "UNDECLARE-INFERENCE-REMOVAL-MODULE", 1, 1, false);
        declareFunction(me, "undeclare_inference_meta_removal_module", "UNDECLARE-INFERENCE-META-REMOVAL-MODULE", 1, 0, false);
        declareFunction(me, "undeclare_inference_removal_module_use_generic", "UNDECLARE-INFERENCE-REMOVAL-MODULE-USE-GENERIC", 2, 1, false);
        declareFunction(me, "undeclare_inference_removal_module_use_meta_removal", "UNDECLARE-INFERENCE-REMOVAL-MODULE-USE-META-REMOVAL", 2, 1, false);
        declareFunction(me, "undeclare_inference_removal_module_dont_use_universal", "UNDECLARE-INFERENCE-REMOVAL-MODULE-DONT-USE-UNIVERSAL", 2, 1, false);
        declareFunction(me, "reclassify_removal_modules", "RECLASSIFY-REMOVAL-MODULES", 0, 0, false);
        declareFunction(me, "clear_removal_modules", "CLEAR-REMOVAL-MODULES", 0, 0, false);
        declareFunction(me, "classify_removal_module", "CLASSIFY-REMOVAL-MODULE", 1, 0, false);
        declareFunction(me, "inference_removal_module_note_specific", "INFERENCE-REMOVAL-MODULE-NOTE-SPECIFIC", 2, 0, false);
        declareFunction(me, "inference_removal_moduleL_for_classification", "INFERENCE-REMOVAL-MODULE<-FOR-CLASSIFICATION", 2, 0, false);
        declareFunction(me, "removal_module_specific_use_genericP_internal", "REMOVAL-MODULE-SPECIFIC-USE-GENERIC?-INTERNAL", 1, 0, false);
        declareFunction(me, "removal_module_specific_use_genericP", "REMOVAL-MODULE-SPECIFIC-USE-GENERIC?", 1, 0, false);
        declareFunction(me, "inference_removal_pruning_module", "INFERENCE-REMOVAL-PRUNING-MODULE", 2, 0, false);
        declareFunction(me, "removal_pruning_moduleP", "REMOVAL-PRUNING-MODULE?", 1, 0, false);
        declareMacro(me, "do_conjunctive_removal_modules", "DO-CONJUNCTIVE-REMOVAL-MODULES");
        declareFunction(me, "removal_modules_conjunctive", "REMOVAL-MODULES-CONJUNCTIVE", 0, 0, false);
        declareFunction(me, "conjunctive_removal_module_p", "CONJUNCTIVE-REMOVAL-MODULE-P", 1, 0, false);
        declareFunction(me, "conjunctive_removal_module_count", "CONJUNCTIVE-REMOVAL-MODULE-COUNT", 0, 0, false);
        declareFunction(me, "conjunctive_removal_modules", "CONJUNCTIVE-REMOVAL-MODULES", 0, 0, false);
        declareFunction(me, "inference_conjunctive_removal_module", "INFERENCE-CONJUNCTIVE-REMOVAL-MODULE", 2, 0, false);
        declareFunction(me, "undeclare_inference_conjunctive_removal_module", "UNDECLARE-INFERENCE-CONJUNCTIVE-REMOVAL-MODULE", 1, 0, false);
        declareMacro(me, "do_meta_removal_modules", "DO-META-REMOVAL-MODULES");
        declareFunction(me, "meta_removal_modules", "META-REMOVAL-MODULES", 0, 0, false);
        declareFunction(me, "meta_removal_module_list", "META-REMOVAL-MODULE-LIST", 0, 0, false);
        declareFunction(me, "meta_removal_module_p", "META-REMOVAL-MODULE-P", 1, 0, false);
        declareFunction(me, "meta_removal_module_count", "META-REMOVAL-MODULE-COUNT", 0, 0, false);
        declareFunction(me, "meta_removal_module_specific_predicates", "META-REMOVAL-MODULE-SPECIFIC-PREDICATES", 1, 0, false);
        declareFunction(me, "meta_removal_module_specific_predicateP", "META-REMOVAL-MODULE-SPECIFIC-PREDICATE?", 2, 0, false);
        declareFunction(me, "predicate_uses_meta_removal_moduleP", "PREDICATE-USES-META-REMOVAL-MODULE?", 2, 0, false);
        declareFunction(me, "inference_meta_removal_module", "INFERENCE-META-REMOVAL-MODULE", 1, 1, false);
        declareFunction(me, "removal_proof_module_p", "REMOVAL-PROOF-MODULE-P", 1, 0, false);
        declareMacro(me, "do_transformation_modules", "DO-TRANSFORMATION-MODULES");
        declareFunction(me, "transformation_modules", "TRANSFORMATION-MODULES", 0, 0, false);
        declareFunction(me, "transformation_module_p", "TRANSFORMATION-MODULE-P", 1, 0, false);
        declareFunction(me, "transformation_module_count", "TRANSFORMATION-MODULE-COUNT", 0, 0, false);
        declareFunction(me, "inference_transformation_module", "INFERENCE-TRANSFORMATION-MODULE", 2, 0, false);
        declareMacro(me, "do_meta_transformation_modules", "DO-META-TRANSFORMATION-MODULES");
        declareFunction(me, "meta_transformation_modules", "META-TRANSFORMATION-MODULES", 0, 0, false);
        declareFunction(me, "meta_transformation_module_p", "META-TRANSFORMATION-MODULE-P", 1, 0, false);
        declareFunction(me, "meta_transformation_module_count", "META-TRANSFORMATION-MODULE-COUNT", 0, 0, false);
        declareFunction(me, "inference_meta_transformation_module", "INFERENCE-META-TRANSFORMATION-MODULE", 1, 1, false);
        declareMacro(me, "do_rewrite_modules", "DO-REWRITE-MODULES");
        declareFunction(me, "rewrite_modules", "REWRITE-MODULES", 0, 0, false);
        declareFunction(me, "rewrite_module_p", "REWRITE-MODULE-P", 1, 0, false);
        declareFunction(me, "rewrite_module_count", "REWRITE-MODULE-COUNT", 0, 0, false);
        declareFunction(me, "rewrite_module_support", "REWRITE-MODULE-SUPPORT", 1, 0, false);
        declareFunction(me, "rewrite_module_closure", "REWRITE-MODULE-CLOSURE", 1, 0, false);
        declareFunction(me, "inference_rewrite_module", "INFERENCE-REWRITE-MODULE", 2, 0, false);
        declareFunction(me, "undeclare_rewrite_module", "UNDECLARE-REWRITE-MODULE", 1, 0, false);
        declareFunction(me, "undeclare_rewrite_module_by_name", "UNDECLARE-REWRITE-MODULE-BY-NAME", 1, 0, false);
        declareFunction(me, "deregister_rewrite_module", "DEREGISTER-REWRITE-MODULE", 1, 0, false);
        declareFunction(me, "deregister_rewrite_module_by_name", "DEREGISTER-REWRITE-MODULE-BY-NAME", 1, 0, false);
        declareFunction(me, "strengthen_rewrite_module_properties", "STRENGTHEN-REWRITE-MODULE-PROPERTIES", 2, 0, false);
        declareFunction(me, "structural_module_p", "STRUCTURAL-MODULE-P", 1, 0, false);
        declareFunction(me, "inference_structural_module", "INFERENCE-STRUCTURAL-MODULE", 1, 1, false);
        declareFunction(me, "structural_module_count", "STRUCTURAL-MODULE-COUNT", 0, 0, false);
        declareMacro(me, "do_meta_structural_modules", "DO-META-STRUCTURAL-MODULES");
        declareFunction(me, "meta_structural_modules", "META-STRUCTURAL-MODULES", 0, 0, false);
        declareFunction(me, "meta_structural_module_p", "META-STRUCTURAL-MODULE-P", 1, 0, false);
        declareFunction(me, "meta_structural_module_count", "META-STRUCTURAL-MODULE-COUNT", 0, 0, false);
        declareFunction(me, "inference_meta_structural_module", "INFERENCE-META-STRUCTURAL-MODULE", 1, 1, false);
        declareFunction(me, "cfasl_output_object_hl_module_method", "CFASL-OUTPUT-OBJECT-HL-MODULE-METHOD", 2, 0, false);
        declareFunction(me, "cfasl_wide_output_hl_module", "CFASL-WIDE-OUTPUT-HL-MODULE", 2, 0, false);
        declareFunction(me, "cfasl_output_hl_module_internal", "CFASL-OUTPUT-HL-MODULE-INTERNAL", 2, 0, false);
        declareFunction(me, "cfasl_input_hl_module", "CFASL-INPUT-HL-MODULE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_inference_modules_file() {
        deflexical("*META-REMOVAL-MODULES*", SubLTrampolineFile.maybeDefault($meta_removal_modules$, $meta_removal_modules$, NIL));
        deflexical("*HL-MODULE-PROPERTIES*", $list1);
        deflexical("*VALID-HL-MODULE-SUBTYPES*", $list10);
        deflexical("*DEFAULT-HL-MODULE-SUBTYPE*", $KB);
        deflexical("*HL-MODULE-PROPERTY-DEFAULTS*", dictionary_utilities.new_dictionary_from_alist(reverse(listS($list12, list($MODULE_SUBTYPE, $default_hl_module_subtype$.getGlobalValue()), $list14)), symbol_function(EQL)));
        defconstant("*DTP-HL-MODULE*", HL_MODULE);
        deflexical("*CFASL-CREATE-INVALID-HL-MODULE-CACHING-STATE*", NIL);
        deflexical("*HL-MODULE-STORE*", SubLTrampolineFile.maybeDefault($hl_module_store$, $hl_module_store$, () -> make_hash_table($int$212, symbol_function(EQUAL), UNPROVIDED)));
        deflexical("*REMOVAL-MODULES*", SubLTrampolineFile.maybeDefault($removal_modules$, $removal_modules$, () -> set.new_set(symbol_function(EQL), UNPROVIDED)));
        deflexical("*REMOVAL-MODULES-EXTERNAL*", SubLTrampolineFile.maybeDefault($removal_modules_external$, $removal_modules_external$, NIL));
        deflexical("*REMOVAL-MODULES-GENERIC*", SubLTrampolineFile.maybeDefault($removal_modules_generic$, $removal_modules_generic$, NIL));
        deflexical("*REMOVAL-MODULES-UNIVERSAL*", SubLTrampolineFile.maybeDefault($removal_modules_universal$, $removal_modules_universal$, NIL));
        deflexical("*REMOVAL-MODULES-SPECIFIC*", SubLTrampolineFile.maybeDefault($removal_modules_specific$, $removal_modules_specific$, () -> make_hash_table($int$32, UNPROVIDED, UNPROVIDED)));
        deflexical("*REMOVAL-MODULES-SPECIFIC-USE-GENERIC*", SubLTrampolineFile.maybeDefault($removal_modules_specific_use_generic$, $removal_modules_specific_use_generic$, NIL));
        deflexical("*REMOVAL-MODULES-SPECIFIC-USE-META-REMOVAL*", SubLTrampolineFile.maybeDefault($removal_modules_specific_use_meta_removal$, $removal_modules_specific_use_meta_removal$, NIL));
        deflexical("*REMOVAL-MODULES-SPECIFIC-DONT-USE-UNIVERSAL*", SubLTrampolineFile.maybeDefault($removal_modules_specific_dont_use_universal$, $removal_modules_specific_dont_use_universal$, NIL));
        deflexical("*SOLELY-SPECIFIC-REMOVAL-MODULE-PREDICATE-STORE*", SubLTrampolineFile.maybeDefault($solely_specific_removal_module_predicate_store$, $solely_specific_removal_module_predicate_store$, () -> set.new_set(EQL, $int$50)));
        defparameter("*CLASSIFY-REMOVAL-MODULES-WITH-DETERMINISTIC-SORT?*", T);
        deflexical("*REMOVAL-PRUNING-MODULE-PROPERTIES*", $list171);
        deflexical("*CONJUNCTIVE-REMOVAL-MODULES*", SubLTrampolineFile.maybeDefault($conjunctive_removal_modules$, $conjunctive_removal_modules$, () -> set.new_set(symbol_function(EQL), UNPROVIDED)));
        deflexical("*TRANSFORMATION-MODULES*", SubLTrampolineFile.maybeDefault($transformation_modules$, $transformation_modules$, NIL));
        deflexical("*META-TRANSFORMATION-MODULES*", SubLTrampolineFile.maybeDefault($meta_transformation_modules$, $meta_transformation_modules$, NIL));
        deflexical("*REWRITE-MODULES*", SubLTrampolineFile.maybeDefault($rewrite_modules$, $rewrite_modules$, NIL));
        deflexical("*STRUCTURAL-MODULES*", SubLTrampolineFile.maybeDefault($structural_modules$, $structural_modules$, NIL));
        deflexical("*META-STRUCTURAL-MODULES*", SubLTrampolineFile.maybeDefault($meta_structural_modules$, $meta_structural_modules$, NIL));
        defconstant("*CFASL-WIDE-OPCODE-HL-MODULE*", $int$256);
        return NIL;
    }

    public static SubLObject setup_inference_modules_file() {
        declare_defglobal($meta_removal_modules$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_hl_module$.getGlobalValue(), symbol_function(HL_MODULE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list29);
        def_csetf(HL_MOD_NAME, _CSETF_HL_MOD_NAME);
        def_csetf(HL_MOD_PLIST, _CSETF_HL_MOD_PLIST);
        def_csetf(HL_MOD_SENSE, _CSETF_HL_MOD_SENSE);
        def_csetf(HL_MOD_PREDICATE, _CSETF_HL_MOD_PREDICATE);
        def_csetf(HL_MOD_ANY_PREDICATES, _CSETF_HL_MOD_ANY_PREDICATES);
        def_csetf(HL_MOD_ARITY, _CSETF_HL_MOD_ARITY);
        def_csetf(HL_MOD_DIRECTION, _CSETF_HL_MOD_DIRECTION);
        def_csetf(HL_MOD_REQUIRED_PATTERN, _CSETF_HL_MOD_REQUIRED_PATTERN);
        def_csetf(HL_MOD_REQUIRED_MT, _CSETF_HL_MOD_REQUIRED_MT);
        def_csetf(HL_MOD_EXCLUSIVE_FUNC, _CSETF_HL_MOD_EXCLUSIVE_FUNC);
        def_csetf(HL_MOD_REQUIRED_FUNC, _CSETF_HL_MOD_REQUIRED_FUNC);
        def_csetf(HL_MOD_COMPLETENESS, _CSETF_HL_MOD_COMPLETENESS);
        identity(HL_MODULE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_hl_module$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_HL_MODULE_METHOD));
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_hl_module$.getGlobalValue(), symbol_function(SXHASH_HL_MODULE_METHOD));
        memoization_state.note_globally_cached_function(CFASL_CREATE_INVALID_HL_MODULE);
        declare_defglobal($hl_module_store$);
        register_macro_helper(HL_MODULE_STORE, DO_HL_MODULES);
        declare_defglobal($removal_modules$);
        register_macro_helper(REMOVAL_MODULES, DO_REMOVAL_MODULES);
        declare_defglobal($removal_modules_external$);
        declare_defglobal($removal_modules_generic$);
        declare_defglobal($removal_modules_universal$);
        declare_defglobal($removal_modules_specific$);
        declare_defglobal($removal_modules_specific_use_generic$);
        declare_defglobal($removal_modules_specific_use_meta_removal$);
        declare_defglobal($removal_modules_specific_dont_use_universal$);
        declare_defglobal($solely_specific_removal_module_predicate_store$);
        memoization_state.note_memoized_function($sym170$REMOVAL_MODULE_SPECIFIC_USE_GENERIC_);
        declare_defglobal($conjunctive_removal_modules$);
        register_macro_helper(REMOVAL_MODULES_CONJUNCTIVE, DO_CONJUNCTIVE_REMOVAL_MODULES);
        register_macro_helper(META_REMOVAL_MODULES, DO_META_REMOVAL_MODULES);
        declare_defglobal($transformation_modules$);
        register_macro_helper(TRANSFORMATION_MODULES, DO_TRANSFORMATION_MODULES);
        declare_defglobal($meta_transformation_modules$);
        register_macro_helper(META_TRANSFORMATION_MODULES, DO_META_TRANSFORMATION_MODULES);
        declare_defglobal($rewrite_modules$);
        declare_defglobal($structural_modules$);
        declare_defglobal($meta_structural_modules$);
        register_macro_helper(META_STRUCTURAL_MODULES, DO_META_STRUCTURAL_MODULES);
        register_wide_cfasl_opcode_input_function($cfasl_wide_opcode_hl_module$.getGlobalValue(), CFASL_INPUT_HL_MODULE);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_hl_module$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_HL_MODULE_METHOD));
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

    

    public static final class $allowed_modules_spec_p$UnaryFunction extends UnaryFunction {
        public $allowed_modules_spec_p$UnaryFunction() {
            super(extractFunctionNamed("ALLOWED-MODULES-SPEC-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return allowed_modules_spec_p(arg1);
        }
    }

    public static final class $hl_module_native extends SubLStructNative {
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

        private $hl_module_native() {
            this.$name = Lisp.NIL;
            this.$plist = Lisp.NIL;
            this.$sense = Lisp.NIL;
            this.$predicate = Lisp.NIL;
            this.$any_predicates = Lisp.NIL;
            this.$arity = Lisp.NIL;
            this.$direction = Lisp.NIL;
            this.$required_pattern = Lisp.NIL;
            this.$required_mt = Lisp.NIL;
            this.$exclusive_func = Lisp.NIL;
            this.$required_func = Lisp.NIL;
            this.$completeness = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
        public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$plist = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$sense = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$predicate = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$any_predicates = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$arity = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$direction = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$required_pattern = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return this.$required_mt = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return this.$exclusive_func = value;
        }

        @Override
        public SubLObject setField12(final SubLObject value) {
            return this.$required_func = value;
        }

        @Override
        public SubLObject setField13(final SubLObject value) {
            return this.$completeness = value;
        }

        static {
            structDecl = makeStructDeclNative($hl_module_native.class, HL_MODULE, HL_MODULE_P, $list23, $list24, new String[]{ "$name", "$plist", "$sense", "$predicate", "$any_predicates", "$arity", "$direction", "$required_pattern", "$required_mt", "$exclusive_func", "$required_func", "$completeness" }, $list25, $list26, PRINT_HL_MODULE);
        }
    }

    public static final class $hl_module_p$UnaryFunction extends UnaryFunction {
        public $hl_module_p$UnaryFunction() {
            super(extractFunctionNamed("HL-MODULE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return hl_module_p(arg1);
        }
    }

    public static final class $sxhash_hl_module_method$UnaryFunction extends UnaryFunction {
        public $sxhash_hl_module_method$UnaryFunction() {
            super(extractFunctionNamed("SXHASH-HL-MODULE-METHOD"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sxhash_hl_module_method(arg1);
        }
    }

    public static final class $hl_module_sense$UnaryFunction extends UnaryFunction {
        public $hl_module_sense$UnaryFunction() {
            super(extractFunctionNamed("HL-MODULE-SENSE"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return hl_module_sense(arg1);
        }
    }
}

/**
 * Total time: 790 ms
 */
