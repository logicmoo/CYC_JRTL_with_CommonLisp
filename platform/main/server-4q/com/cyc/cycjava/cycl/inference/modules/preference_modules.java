package com.cyc.cycjava.cycl.inference.modules;


import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_removal;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_abduction;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.variables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import java.util.function.Supplier;
import org.armedbear.lisp.Lisp;

import static com.cyc.cycjava.cycl.cb_utilities.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.html_utilities.*;
import static com.cyc.cycjava.cycl.inference.modules.preference_modules.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EIGHT_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class preference_modules extends SubLTranslatedFile {
    public static final SubLFile me = new preference_modules();

    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.preference_modules";

    public static final String myFingerPrint = "fbb6cc44efd26736fc2434c72afd320055fae8dc0a0c4e30326529b6f743fd35";

    // defvar
    private static final SubLSymbol $within_generic_preference_analysisP$ = makeSymbol("*WITHIN-GENERIC-PREFERENCE-ANALYSIS?*");

    // deflexical
    public static final SubLSymbol $min_preference_level$ = makeSymbol("*MIN-PREFERENCE-LEVEL*");

    // deflexical
    public static final SubLSymbol $max_preference_level$ = makeSymbol("*MAX-PREFERENCE-LEVEL*");

    // deflexical
    public static final SubLSymbol $default_preference_level$ = makeSymbol("*DEFAULT-PREFERENCE-LEVEL*");

    // deflexical
    /**
     * These are sorted from least preferred to most preferred. Disallowed: no
     * answers can be generated for the literal as-is, but answers might be
     * generated if the literal were more fully bound. Grossly Dispreferred: many
     * answers will probably be missed if the literal is enumerated, but they might
     * be testable if the literal were more fully bound. Dispreferred: some answers
     * might be missed if the literal is enumerated, but they might be testable if
     * the literal were more fully bound. Preferred: everything that's decidable is
     * also enumerable, i.e. anything that could be proven if the literal were more
     * fully bound is provable in the current state.
     */
    private static final SubLSymbol $ordered_preference_levels$ = makeSymbol("*ORDERED-PREFERENCE-LEVELS*");

    // deflexical
    private static final SubLSymbol $preference_module_properties$ = makeSymbol("*PREFERENCE-MODULE-PROPERTIES*");









    // defconstant
    public static final SubLSymbol $dtp_preference_module$ = makeSymbol("*DTP-PREFERENCE-MODULE*");

    // defparameter
    private static final SubLSymbol $bindable_vars_lambda$ = makeSymbol("*BINDABLE-VARS-LAMBDA*");

    // deflexical
    private static final SubLSymbol $preference_functions_from_must_bind_arg$ = makeSymbol("*PREFERENCE-FUNCTIONS-FROM-MUST-BIND-ARG*");



    // Internal Constants
    public static final SubLList $list0 = list(list(makeSymbol("PREFMOD"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list1 = list(makeKeyword("DONE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");





    public static final SubLSymbol $generic_preference_modules$ = makeSymbol("*GENERIC-PREFERENCE-MODULES*");

    public static final SubLList $list6 = list(list(makeSymbol("PREFMOD"), makeSymbol("PRED"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol SPECIFIC_PREFERENCE_MODULES_FOR_PRED = makeSymbol("SPECIFIC-PREFERENCE-MODULES-FOR-PRED");

    public static final SubLList $list9 = list(list(makeSymbol("PREFMOD"), makeSymbol("ASENT"), makeSymbol("SENSE"), makeSymbol("BINDABLE-VARS"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym10$PRED = makeUninternedSymbol("PRED");





    public static final SubLSymbol DO_SPECIFIC_PREFERENCE_MODULES_FOR_PRED = makeSymbol("DO-SPECIFIC-PREFERENCE-MODULES-FOR-PRED");



    public static final SubLSymbol $sym15$PREFERENCE_MODULE_RELEVANT_ = makeSymbol("PREFERENCE-MODULE-RELEVANT?");

    public static final SubLSymbol DO_GENERIC_PREFERENCE_MODULES = makeSymbol("DO-GENERIC-PREFERENCE-MODULES");

    public static final SubLSymbol DO_DICTIONARY_VALUES = makeSymbol("DO-DICTIONARY-VALUES");

    public static final SubLSymbol $preference_modules_by_name$ = makeSymbol("*PREFERENCE-MODULES-BY-NAME*");

    public static final SubLSymbol SINGLE_LITERAL_PROBLEM_P = makeSymbol("SINGLE-LITERAL-PROBLEM-P");

    private static final SubLString $$$no_preference_modules_applicable = makeString("no preference modules applicable");





    private static final SubLSymbol PREFERENCE_MODULE_NAME = makeSymbol("PREFERENCE-MODULE-NAME");

    private static final SubLSymbol $sym24$SINGLETON_ = makeSymbol("SINGLETON?");

    private static final SubLList $list25 = list(makeSymbol("DNF-CLAUSE"), makeSymbol("BINDINGS"));

    private static final SubLSymbol POS_ATOMIC_CLAUSE_P = makeSymbol("POS-ATOMIC-CLAUSE-P");









    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLObject $$Thing = reader_make_constant_shell(makeString("Thing"));

    private static final SubLList $list34 = list(reader_make_constant_shell(makeString("SomeFn")), reader_make_constant_shell(makeString("Thing")));



    private static final SubLString $$$closed_asent = makeString("closed asent");

    private static final SubLString $$$open_negation = makeString("open negation");

    private static final SubLString $$$no_removal_options = makeString("no removal options");

    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));



    private static final SubLList $list41 = list(makeKeyword("DOOMED"), makeKeyword("DISALLOWED"), makeKeyword("GROSSLY-DISPREFERRED"), makeKeyword("DISPREFERRED"), makeKeyword("PREFERRED"));

    private static final SubLSymbol PREFERENCE_LEVEL_P = makeSymbol("PREFERENCE-LEVEL-P");

    private static final SubLString $$$Preferred = makeString("Preferred");



    private static final SubLString $$$Dispreferred = makeString("Dispreferred");



    private static final SubLString $$$Grossly_Dispreferred = makeString("Grossly Dispreferred");

    private static final SubLString $$$Disallowed = makeString("Disallowed");

    private static final SubLString $$$Doomed = makeString("Doomed");

    private static final SubLString $$$Undetermined = makeString("Undetermined");

    private static final SubLString $str51$Unexpected_preference_level__a = makeString("Unexpected preference-level ~a");

    private static final SubLSymbol $sym52$PREFERENCE_LEVEL__ = makeSymbol("PREFERENCE-LEVEL-<");

    private static final SubLSymbol $sym53$PREFERENCE_LEVEL__ = makeSymbol("PREFERENCE-LEVEL->");









    private static final SubLString $str58$unexpected_completeness__s = makeString("unexpected completeness ~s");

    private static final SubLString $str59$unexpected_preference_level__s = makeString("unexpected preference-level ~s");

    private static final SubLList $list60 = list(makeKeyword("PREDICATE"), makeKeyword("SENSE"), makeKeyword("REQUIRED-PATTERN"), makeKeyword("REQUIRED-MT"), makeKeyword("ANY-PREDICATES"), makeKeyword("SUPPLANTS"), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("PREFERENCE"));

    private static final SubLSymbol PREFERENCE_MODULE_PROPERTY_P = makeSymbol("PREFERENCE-MODULE-PROPERTY-P");















    private static final SubLSymbol FORT_OR_POSSIBLY_NAUT_P = makeSymbol("FORT-OR-POSSIBLY-NAUT-P");













    private static final SubLString $str76$invalid__supplants_value__s = makeString("invalid :supplants value ~s");





    private static final SubLString $str79$unexpected_preference_module_prop = makeString("unexpected preference module property ~s");

    private static final SubLString $str80$_s_must_specify__sense = makeString("~s must specify :sense");

    private static final SubLString $str81$_s_must_specify_exactly_one_of__p = makeString("~s must specify exactly one of :preference-level or :preference");

    private static final SubLSymbol $specific_preference_modules$ = makeSymbol("*SPECIFIC-PREFERENCE-MODULES*");

    private static final SubLSymbol $preference_module_supplants$ = makeSymbol("*PREFERENCE-MODULE-SUPPLANTS*");

    private static final SubLSymbol PREFERENCE_MODULE = makeSymbol("PREFERENCE-MODULE");

    private static final SubLSymbol PREFERENCE_MODULE_P = makeSymbol("PREFERENCE-MODULE-P");

    private static final SubLList $list86 = list(makeSymbol("NAME"), makeSymbol("PREDICATE"), makeSymbol("SENSE"), makeSymbol("REQUIRED-PATTERN"), makeSymbol("PREFERENCE-LEVEL"), makeSymbol("PREFERENCE-FUNC"), makeSymbol("REQUIRED-MT"), makeSymbol("ANY-PREDICATES"));

    private static final SubLList $list87 = list(makeKeyword("NAME"), makeKeyword("PREDICATE"), makeKeyword("SENSE"), makeKeyword("REQUIRED-PATTERN"), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("PREFERENCE-FUNC"), makeKeyword("REQUIRED-MT"), makeKeyword("ANY-PREDICATES"));

    private static final SubLList $list88 = list(makeSymbol("PREF-MOD-NAME"), makeSymbol("PREF-MOD-PREDICATE"), makeSymbol("PREF-MOD-SENSE"), makeSymbol("PREF-MOD-REQUIRED-PATTERN"), makeSymbol("PREF-MOD-PREFERENCE-LEVEL"), makeSymbol("PREF-MOD-PREFERENCE-FUNC"), makeSymbol("PREF-MOD-REQUIRED-MT"), makeSymbol("PREF-MOD-ANY-PREDICATES"));

    private static final SubLList $list89 = list(makeSymbol("_CSETF-PREF-MOD-NAME"), makeSymbol("_CSETF-PREF-MOD-PREDICATE"), makeSymbol("_CSETF-PREF-MOD-SENSE"), makeSymbol("_CSETF-PREF-MOD-REQUIRED-PATTERN"), makeSymbol("_CSETF-PREF-MOD-PREFERENCE-LEVEL"), makeSymbol("_CSETF-PREF-MOD-PREFERENCE-FUNC"), makeSymbol("_CSETF-PREF-MOD-REQUIRED-MT"), makeSymbol("_CSETF-PREF-MOD-ANY-PREDICATES"));

    private static final SubLSymbol PRINT_PREFERENCE_MODULE = makeSymbol("PRINT-PREFERENCE-MODULE");

    private static final SubLSymbol PREFERENCE_MODULE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PREFERENCE-MODULE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list92 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("PREFERENCE-MODULE-P"));

    private static final SubLSymbol PREF_MOD_NAME = makeSymbol("PREF-MOD-NAME");

    private static final SubLSymbol _CSETF_PREF_MOD_NAME = makeSymbol("_CSETF-PREF-MOD-NAME");

    private static final SubLSymbol PREF_MOD_PREDICATE = makeSymbol("PREF-MOD-PREDICATE");

    private static final SubLSymbol _CSETF_PREF_MOD_PREDICATE = makeSymbol("_CSETF-PREF-MOD-PREDICATE");

    private static final SubLSymbol PREF_MOD_SENSE = makeSymbol("PREF-MOD-SENSE");

    private static final SubLSymbol _CSETF_PREF_MOD_SENSE = makeSymbol("_CSETF-PREF-MOD-SENSE");

    private static final SubLSymbol PREF_MOD_REQUIRED_PATTERN = makeSymbol("PREF-MOD-REQUIRED-PATTERN");

    private static final SubLSymbol _CSETF_PREF_MOD_REQUIRED_PATTERN = makeSymbol("_CSETF-PREF-MOD-REQUIRED-PATTERN");

    private static final SubLSymbol PREF_MOD_PREFERENCE_LEVEL = makeSymbol("PREF-MOD-PREFERENCE-LEVEL");

    private static final SubLSymbol _CSETF_PREF_MOD_PREFERENCE_LEVEL = makeSymbol("_CSETF-PREF-MOD-PREFERENCE-LEVEL");

    private static final SubLSymbol PREF_MOD_PREFERENCE_FUNC = makeSymbol("PREF-MOD-PREFERENCE-FUNC");

    private static final SubLSymbol _CSETF_PREF_MOD_PREFERENCE_FUNC = makeSymbol("_CSETF-PREF-MOD-PREFERENCE-FUNC");

    private static final SubLSymbol PREF_MOD_REQUIRED_MT = makeSymbol("PREF-MOD-REQUIRED-MT");

    private static final SubLSymbol _CSETF_PREF_MOD_REQUIRED_MT = makeSymbol("_CSETF-PREF-MOD-REQUIRED-MT");

    private static final SubLSymbol PREF_MOD_ANY_PREDICATES = makeSymbol("PREF-MOD-ANY-PREDICATES");

    private static final SubLSymbol _CSETF_PREF_MOD_ANY_PREDICATES = makeSymbol("_CSETF-PREF-MOD-ANY-PREDICATES");





    private static final SubLString $str111$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_PREFERENCE_MODULE = makeSymbol("MAKE-PREFERENCE-MODULE");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_PREFERENCE_MODULE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PREFERENCE-MODULE-METHOD");

    private static final SubLString $str117$_PREFMOD__a_ = makeString("[PREFMOD ~a]");

    private static final SubLSymbol SXHASH_PREFERENCE_MODULE_METHOD = makeSymbol("SXHASH-PREFERENCE-MODULE-METHOD");



    private static final SubLList $list120 = list(new SubLObject[]{ makeSymbol("&KEY"), makeSymbol("PREDICATE"), makeSymbol("SENSE"), makeSymbol("ANY-PREDICATES"), makeSymbol("REQUIRED-PATTERN"), makeSymbol("REQUIRED-MT"), makeSymbol("SUPPLANTS"), makeSymbol("PREFERENCE-LEVEL"), makeSymbol("PREFERENCE") });

    public static final SubLList $list121 = list(makeKeyword("PREDICATE"), makeKeyword("SENSE"), makeKeyword("ANY-PREDICATES"), makeKeyword("REQUIRED-PATTERN"), makeKeyword("REQUIRED-MT"), makeKeyword("SUPPLANTS"), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("PREFERENCE"));

    private static final SubLString $$$module_ = makeString("module ");

    private static final SubLString $str123$sense___ = makeString("sense : ");

    private static final SubLString $str124$predicate___ = makeString("predicate : ");

    private static final SubLString $str125$any_predicates___ = makeString("any predicates : ");

    private static final SubLString $str126$required_pattern___ = makeString("required pattern : ");

    private static final SubLString $str127$required_mt___ = makeString("required mt : ");

    private static final SubLString $str128$preference_level___ = makeString("preference level : ");

    private static final SubLString $str129$preference_function___ = makeString("preference function : ");

    private static final SubLSymbol PATTERN_MATCHES_FORMULA = makeSymbol("PATTERN-MATCHES-FORMULA");

    private static final SubLSymbol TVA_POS_PREFERENCE = makeSymbol("TVA-POS-PREFERENCE");

    private static final SubLSymbol MUST_BIND_ARG1 = makeSymbol("MUST-BIND-ARG1");

    private static final SubLSymbol MUST_BIND_ARG2 = makeSymbol("MUST-BIND-ARG2");

    private static final SubLSymbol MUST_BIND_ARG3 = makeSymbol("MUST-BIND-ARG3");

    private static final SubLSymbol MUST_BIND_ARG4 = makeSymbol("MUST-BIND-ARG4");

    private static final SubLSymbol MUST_BIND_ARG5 = makeSymbol("MUST-BIND-ARG5");

    private static final SubLList $list137 = list(ONE_INTEGER, TWO_INTEGER);

    private static final SubLSymbol MUST_BIND_ARG1_AND_ARG2 = makeSymbol("MUST-BIND-ARG1-AND-ARG2");

    private static final SubLList $list139 = list(ONE_INTEGER, THREE_INTEGER);

    private static final SubLSymbol MUST_BIND_ARG1_AND_ARG3 = makeSymbol("MUST-BIND-ARG1-AND-ARG3");

    private static final SubLList $list141 = list(TWO_INTEGER, THREE_INTEGER);

    private static final SubLSymbol MUST_BIND_ARG2_AND_ARG3 = makeSymbol("MUST-BIND-ARG2-AND-ARG3");

    private static final SubLList $list143 = list(ONE_INTEGER, TWO_INTEGER, THREE_INTEGER);

    private static final SubLSymbol MUST_BIND_ARG1_ARG2_AND_ARG3 = makeSymbol("MUST-BIND-ARG1-ARG2-AND-ARG3");

    private static final SubLSymbol MUST_BIND_ARG1_OR_ARG2 = makeSymbol("MUST-BIND-ARG1-OR-ARG2");

    private static final SubLSymbol MUST_BIND_ARG1_OR_ARG3 = makeSymbol("MUST-BIND-ARG1-OR-ARG3");

    private static final SubLSymbol MUST_BIND_ARG2_OR_ARG3 = makeSymbol("MUST-BIND-ARG2-OR-ARG3");

    private static final SubLSymbol MUST_BIND_ALL_ARGS = makeSymbol("MUST-BIND-ALL-ARGS");



    private static final SubLSymbol $sym150$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol $sym151$NON_BINDABLE_VAR_ = makeSymbol("NON-BINDABLE-VAR?");



    private static final SubLList $list153 = list(cons(ONE_INTEGER, makeSymbol("MUST-BIND-ARG1")), cons(TWO_INTEGER, makeSymbol("MUST-BIND-ARG2")), cons(THREE_INTEGER, makeSymbol("MUST-BIND-ARG3")), cons(FOUR_INTEGER, makeSymbol("MUST-BIND-ARG4")), cons(FIVE_INTEGER, makeSymbol("MUST-BIND-ARG5")));

    private static final SubLString $str154$No_preference_function_registered = makeString("No preference function registered for bindable args ~s");



    private static final SubLSymbol $NOT_FULLY_BOUND = makeKeyword("NOT-FULLY-BOUND");

    private static final SubLSymbol $doom_module_store$ = makeSymbol("*DOOM-MODULE-STORE*");



    private static final SubLList $list159 = list(makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"));

    private static final SubLSymbol SENSE_SPEC_P = makeSymbol("SENSE-SPEC-P");

    private static final SubLSymbol DISALLOWED_PATTERN_P = makeSymbol("DISALLOWED-PATTERN-P");

    private static final SubLList $list162 = list(makeKeyword("POS"), makeKeyword("NEG"));

    private static final SubLSymbol TINY_KB_EL_LITERAL_PREFERENCE_LEVEL_WRT_MODULES = makeSymbol("TINY-KB-EL-LITERAL-PREFERENCE-LEVEL-WRT-MODULES");













    private static final SubLList $list170 = list(list(list(list(reader_make_constant_shell(makeString("isa")), makeSymbol("?VAR0"), makeSymbol("?VAR1")), makeKeyword("POS"), list(makeSymbol("?VAR0"), makeSymbol("?VAR1")), reader_make_constant_shell(makeString("InferencePSC"))), makeKeyword("DISALLOWED")), list(list(list(reader_make_constant_shell(makeString("isa")), makeSymbol("?VAR0"), reader_make_constant_shell(makeString("Thing"))), makeKeyword("POS"), list(makeSymbol("?VAR0")), reader_make_constant_shell(makeString("InferencePSC"))), makeKeyword("GROSSLY-DISPREFERRED")), list(list(list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Thing")), makeSymbol("?VAR0")), makeKeyword("POS"), list(makeSymbol("?VAR0")), reader_make_constant_shell(makeString("InferencePSC"))), makeKeyword("DISPREFERRED")), list(list(list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Thing")), reader_make_constant_shell(makeString("Thing"))), makeKeyword("POS"), NIL, reader_make_constant_shell(makeString("InferencePSC"))), makeKeyword("PREFERRED")));

    private static final SubLSymbol FULL_KB_EL_LITERAL_PREFERENCE_LEVEL_WRT_MODULES = makeSymbol("FULL-KB-EL-LITERAL-PREFERENCE-LEVEL-WRT-MODULES");



    private static final SubLList $list173 = list(list(list(list(reader_make_constant_shell(makeString("likesAsFriend")), reader_make_constant_shell(makeString("Muffet")), makeSymbol("?VAR0")), makeKeyword("POS"), list(makeSymbol("?VAR0")), reader_make_constant_shell(makeString("InferencePSC"))), makeKeyword("PREFERRED")), list(list(list(reader_make_constant_shell(makeString("residesInRegion")), reader_make_constant_shell(makeString("Muffet")), makeSymbol("?VAR0")), makeKeyword("POS"), list(makeSymbol("?VAR0")), reader_make_constant_shell(makeString("InferencePSC"))), makeKeyword("PREFERRED")));

    public static SubLObject do_generic_preference_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject prefmod = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        prefmod = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list0);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list0);
            if (NIL == member(current_$1, $list1, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list0);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_SET, list(prefmod, $generic_preference_modules$, $DONE, done), append(body, NIL));
    }

    public static SubLObject do_specific_preference_modules_for_pred(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list6);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject prefmod = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list6);
        prefmod = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list6);
        pred = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list6);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list6);
            if (NIL == member(current_$2, $list1, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list6);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(CSOME, list(prefmod, list(SPECIFIC_PREFERENCE_MODULES_FOR_PRED, pred), done), append(body, NIL));
    }

    public static SubLObject do_relevant_preference_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list9);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject prefmod = NIL;
        SubLObject asent = NIL;
        SubLObject sense = NIL;
        SubLObject bindable_vars = NIL;
        destructuring_bind_must_consp(current, datum, $list9);
        prefmod = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list9);
        asent = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list9);
        sense = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list9);
        bindable_vars = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$3 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list9);
            current_$3 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list9);
            if (NIL == member(current_$3, $list1, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$3 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list9);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject pred = $sym10$PRED;
        return list(CLET, list(list(pred, list(ATOMIC_SENTENCE_PREDICATE, asent))), list(DO_SPECIFIC_PREFERENCE_MODULES_FOR_PRED, list(prefmod, pred, $DONE, done), listS(PWHEN, list($sym15$PREFERENCE_MODULE_RELEVANT_, prefmod, asent, sense, bindable_vars), append(body, NIL))), list(DO_GENERIC_PREFERENCE_MODULES, list(prefmod, $DONE, done), listS(PWHEN, list($sym15$PREFERENCE_MODULE_RELEVANT_, prefmod, asent, sense, bindable_vars), append(body, NIL))));
    }

    public static SubLObject do_preference_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject prefmod = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        prefmod = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$4 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list0);
            current_$4 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list0);
            if (NIL == member(current_$4, $list1, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$4 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list0);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_DICTIONARY_VALUES, list(prefmod, $preference_modules_by_name$, $DONE, done), append(body, NIL));
    }

    public static SubLObject single_literal_problem_preference_level_wrt_modules(final SubLObject problem, final SubLObject strategic_context, final SubLObject shared_vars) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_problem.single_literal_problem_p(problem) : "inference_datastructures_problem.single_literal_problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.single_literal_problem_p(problem) " + problem;
        SubLObject preference_level = NIL;
        SubLObject justification = NIL;
        thread.resetMultipleValues();
        final SubLObject mt = inference_datastructures_problem.mt_asent_sense_from_single_literal_problem(problem);
        final SubLObject asent = thread.secondMultipleValue();
        final SubLObject sense = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            thread.resetMultipleValues();
            final SubLObject preference_level_$5 = literal_preference_level_wrt_modules(asent, sense, shared_vars, strategic_context);
            final SubLObject justification_$6 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            preference_level = preference_level_$5;
            justification = justification_$6;
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return values(preference_level, justification);
    }

    public static SubLObject literal_preference_level_wrt_modules(final SubLObject asent, final SubLObject sense, final SubLObject bindable_vars, final SubLObject strategic_context) {
        SubLObject min_preference_level = $min_preference_level$.getGlobalValue();
        SubLObject justification = $$$no_preference_modules_applicable;
        SubLObject disallowedP = NIL;
        if (NIL != bindable_vars) {
            final SubLObject relevant_modules = all_relevant_preference_modules(asent, sense, bindable_vars);
            SubLObject rest;
            SubLObject prefmod;
            SubLObject preference_level;
            for (rest = NIL, rest = relevant_modules; (NIL == disallowedP) && (NIL != rest); rest = rest.rest()) {
                prefmod = rest.first();
                preference_level = preference_module_compute_preference_level(prefmod, asent, bindable_vars, strategic_context);
                if (NIL != preference_level) {
                    if (NIL != preference_level_L(preference_level, min_preference_level)) {
                        min_preference_level = preference_level;
                        justification = string_utilities.str(preference_module_name(prefmod));
                    }
                    if ($DISALLOWED == preference_level) {
                        disallowedP = T;
                    }
                }
            }
        }
        return values(min_preference_level, justification);
    }

    public static SubLObject all_relevant_preference_modules(final SubLObject asent, final SubLObject sense, final SubLObject bindable_vars) {
        SubLObject candidate_modules = NIL;
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject csome_list_var = specific_preference_modules_for_pred(pred);
        SubLObject prefmod = NIL;
        prefmod = csome_list_var.first();
        while (NIL != csome_list_var) {
            if (NIL != preference_module_relevantP(prefmod, asent, sense, bindable_vars)) {
                candidate_modules = cons(prefmod, candidate_modules);
            }
            csome_list_var = csome_list_var.rest();
            prefmod = csome_list_var.first();
        } 
        final SubLObject set_contents_var = set.do_set_internal($generic_preference_modules$.getGlobalValue());
        SubLObject basis_object;
        SubLObject state;
        SubLObject prefmod2;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            prefmod2 = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, prefmod2)) && (NIL != preference_module_relevantP(prefmod2, asent, sense, bindable_vars))) {
                candidate_modules = cons(prefmod2, candidate_modules);
            }
        }
        SubLObject relevant_modules = NIL;
        SubLObject supplanted_module_names = NIL;
        SubLObject cdolist_list_var = candidate_modules;
        SubLObject candidate_module = NIL;
        candidate_module = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (($ALL != supplanted_module_names) && (NIL == list_utilities.member_eqP(preference_module_name(candidate_module), supplanted_module_names))) {
                if (NIL != preference_module_exclusiveP(candidate_module)) {
                    final SubLObject supplants_spec = preference_module_supplants(candidate_module);
                    if ($ALL == supplants_spec) {
                        supplanted_module_names = $ALL;
                        relevant_modules = NIL;
                    } else {
                        SubLObject cdolist_list_var_$7 = supplants_spec;
                        SubLObject supplanted_module_name = NIL;
                        supplanted_module_name = cdolist_list_var_$7.first();
                        while (NIL != cdolist_list_var_$7) {
                            relevant_modules = delete(supplanted_module_name, relevant_modules, symbol_function(EQ), symbol_function(PREFERENCE_MODULE_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            final SubLObject item_var = supplanted_module_name;
                            if (NIL == member(item_var, supplanted_module_names, symbol_function(EQL), symbol_function(IDENTITY))) {
                                supplanted_module_names = cons(item_var, supplanted_module_names);
                            }
                            cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                            supplanted_module_name = cdolist_list_var_$7.first();
                        } 
                    }
                }
                relevant_modules = cons(candidate_module, relevant_modules);
            }
            cdolist_list_var = cdolist_list_var.rest();
            candidate_module = cdolist_list_var.first();
        } 
        return relevant_modules;
    }

    public static SubLObject el_literal_preference_level_wrt_modules(final SubLObject el_asent, final SubLObject sense, final SubLObject el_bindable_vars, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preference_level = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
            final SubLObject czer_results = czer_main.canonicalize_query_sentence(el_asent, UNPROVIDED);
            assert NIL != list_utilities.singletonP(czer_results) : "list_utilities.singletonP(czer_results) " + "CommonSymbols.NIL != list_utilities.singletonP(czer_results) " + czer_results;
            final SubLObject czer_result = czer_results.first();
            SubLObject current;
            final SubLObject datum = current = czer_result;
            SubLObject dnf_clause = NIL;
            SubLObject v_bindings = NIL;
            destructuring_bind_must_consp(current, datum, $list25);
            dnf_clause = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list25);
            v_bindings = current.first();
            current = current.rest();
            if (NIL == current) {
                assert NIL != clause_utilities.pos_atomic_clause_p(dnf_clause) : "clause_utilities.pos_atomic_clause_p(dnf_clause) " + "CommonSymbols.NIL != clause_utilities.pos_atomic_clause_p(dnf_clause) " + dnf_clause;
                final SubLObject hl_asent = clause_utilities.atomic_clause_asent(dnf_clause);
                final SubLObject hl_bindable_vars = bindings.apply_bindings(v_bindings, el_bindable_vars);
                preference_level = literal_preference_level_wrt_modules(hl_asent, sense, hl_bindable_vars, $TACTICAL);
            } else {
                cdestructuring_bind_error(datum, $list25);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return preference_level;
    }

    public static SubLObject statically_sort_conjunct_literals(final SubLObject literals, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return statically_sort_conjunct_literals_recursive(literals, mt, NIL);
    }

    public static SubLObject statically_sort_conjunct_literals_recursive(final SubLObject literals, final SubLObject mt, final SubLObject reverse_sorted_literals) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == literals) {
            return nreverse(reverse_sorted_literals);
        }
        thread.resetMultipleValues();
        final SubLObject next_literal = statically_select_next_conjunct_literal(literals, reverse_sorted_literals);
        final SubLObject remaining_literals = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return statically_sort_conjunct_literals_recursive(remaining_literals, mt, cons(next_literal, reverse_sorted_literals));
    }

    public static SubLObject statically_select_next_conjunct_literal(final SubLObject literals, final SubLObject reverse_sorted_literals) {
        if (NIL != list_utilities.singletonP(literals)) {
            return values(literals.first(), NIL);
        }
        SubLObject best_literal = $UNSPECIFIED;
        SubLObject best_remaining = $UNSPECIFIED;
        SubLObject best_preference = $UNSPECIFIED;
        SubLObject best_cost = $UNSPECIFIED;
        SubLObject cdolist_list_var = literals;
        SubLObject candidate_literal = NIL;
        candidate_literal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject remaining_literals = remove(candidate_literal, literals, symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject bound_vars = variables.gather_hl_variables(reverse_sorted_literals);
            final SubLObject literal_vars = variables.gather_hl_variables(candidate_literal);
            final SubLObject remaining_vars = variables.gather_hl_variables(remaining_literals);
            final SubLObject shared_vars = intersection(literal_vars, remaining_vars, symbol_function(EQL), UNPROVIDED);
            final SubLObject bound_literal_vars = intersection(literal_vars, bound_vars, symbol_function(EQL), UNPROVIDED);
            final SubLObject bindable_vars = set_difference(shared_vars, bound_vars, symbol_function(EQL), UNPROVIDED);
            final SubLObject candidate_asent = (NIL != cycl_utilities.negatedP(candidate_literal)) ? cycl_utilities.negate(candidate_literal) : candidate_literal;
            final SubLObject candidate_sense = (NIL != cycl_utilities.negatedP(candidate_literal)) ? $NEG : $POS;
            final SubLObject analysis_asent = compute_analysis_asent_wrt_static_sort(candidate_asent, bound_literal_vars);
            final SubLObject candidate_preference = literal_preference_level_wrt_static_sort(analysis_asent, candidate_sense, bindable_vars);
            final SubLObject candidate_cost = literal_removal_cost_wrt_static_sort(analysis_asent, candidate_sense);
            if (($UNSPECIFIED.eql(best_preference) || (NIL != preference_level_G(candidate_preference, best_preference))) || (candidate_preference.equal(best_preference) && candidate_cost.numL(best_cost))) {
                best_literal = candidate_literal;
                best_remaining = remaining_literals;
                best_preference = candidate_preference;
                best_cost = candidate_cost;
            }
            cdolist_list_var = cdolist_list_var.rest();
            candidate_literal = cdolist_list_var.first();
        } 
        return values(best_literal, best_remaining);
    }

    public static SubLObject compute_analysis_asent_wrt_static_sort(SubLObject asent, final SubLObject bound_literal_vars) {
        if (NIL != bound_literal_vars) {
            final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
            final SubLObject generic_term = compute_generic_term_for_bound_argument_of_predicate(predicate);
            SubLObject cdolist_list_var = bound_literal_vars;
            SubLObject bound_var = NIL;
            bound_var = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != list_utilities.simple_tree_findP(bound_var, asent)) {
                    asent = subst(generic_term, bound_var, asent, symbol_function(EQL), UNPROVIDED);
                }
                cdolist_list_var = cdolist_list_var.rest();
                bound_var = cdolist_list_var.first();
            } 
        }
        return asent;
    }

    public static SubLObject compute_generic_term_for_bound_argument_of_predicate(final SubLObject predicate) {
        if (predicate.eql($$isa) || predicate.eql($$genls)) {
            return $$Thing;
        }
        return $list34;
    }

    public static SubLObject within_generic_preference_analysisP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $within_generic_preference_analysisP$.getDynamicValue(thread);
    }

    public static SubLObject literal_preference_level_wrt_static_sort(final SubLObject asent, final SubLObject sense, final SubLObject bindable_vars) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != variables.fully_bound_p(asent)) {
            return values($PREFERRED, $$$closed_asent);
        }
        if ((sense == $NEG) && (NIL != bindable_vars)) {
            return values($DISALLOWED, $$$open_negation);
        }
        if (NIL == inference_worker_removal.literal_removal_options(asent, sense, UNPROVIDED)) {
            return values($DISALLOWED, $$$no_removal_options);
        }
        SubLObject preference = NIL;
        SubLObject reason = NIL;
        final SubLObject _prev_bind_0 = $within_generic_preference_analysisP$.currentBinding(thread);
        try {
            $within_generic_preference_analysisP$.bind(T, thread);
            thread.resetMultipleValues();
            final SubLObject preference_$8 = literal_preference_level_wrt_modules(asent, sense, bindable_vars, $TACTICAL);
            final SubLObject reason_$9 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            preference = preference_$8;
            reason = reason_$9;
        } finally {
            $within_generic_preference_analysisP$.rebind(_prev_bind_0, thread);
        }
        return values(preference, reason);
    }

    public static SubLObject literal_removal_cost_wrt_static_sort(final SubLObject asent, final SubLObject sense) {
        return inference_utilities.literal_removal_cost(asent, sense, $$EverythingPSC, removal_modules_abduction.abductive_modules_not_allowed_spec());
    }

    public static SubLObject preference_level_string(final SubLObject preference_level) {
        if (((NIL != preference_level) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == preference_level_p(preference_level))) {
            throw new AssertionError(preference_level);
        }
        if (preference_level.eql($PREFERRED)) {
            return $$$Preferred;
        }
        if (preference_level.eql($DISPREFERRED)) {
            return $$$Dispreferred;
        }
        if (preference_level.eql($GROSSLY_DISPREFERRED)) {
            return $$$Grossly_Dispreferred;
        }
        if (preference_level.eql($DISALLOWED)) {
            return $$$Disallowed;
        }
        if (preference_level.eql($DOOMED)) {
            return $$$Doomed;
        }
        if (preference_level.eql(NIL)) {
            return $$$Undetermined;
        }
        Errors.error($str51$Unexpected_preference_level__a, preference_level);
        return NIL;
    }

    public static SubLObject preference_level_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $ordered_preference_levels$.getGlobalValue());
    }

    public static SubLObject disallowed_preference_level_p(final SubLObject v_object) {
        return eq($DISALLOWED, v_object);
    }

    public static SubLObject doomed_preference_level_p(final SubLObject v_object) {
        return eq($DOOMED, v_object);
    }

    public static SubLObject disallowed_or_doomed_preference_level_p(final SubLObject v_object) {
        return makeBoolean(($DISALLOWED == v_object) || ($DOOMED == v_object));
    }

    public static SubLObject preference_level_L(final SubLObject preference_level1, final SubLObject preference_level2) {
        assert NIL != preference_level_p(preference_level1) : "preference_modules.preference_level_p(preference_level1) " + "CommonSymbols.NIL != preference_modules.preference_level_p(preference_level1) " + preference_level1;
        assert NIL != preference_level_p(preference_level2) : "preference_modules.preference_level_p(preference_level2) " + "CommonSymbols.NIL != preference_modules.preference_level_p(preference_level2) " + preference_level2;
        return list_utilities.position_L(preference_level1, preference_level2, $ordered_preference_levels$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject preference_level_G(final SubLObject preference_level1, final SubLObject preference_level2) {
        return preference_level_L(preference_level2, preference_level1);
    }

    public static SubLObject preference_level_LE(final SubLObject preference_level1, final SubLObject preference_level2) {
        return makeBoolean(NIL == preference_level_G(preference_level1, preference_level2));
    }

    public static SubLObject preference_level_GE(final SubLObject preference_level1, final SubLObject preference_level2) {
        return makeBoolean(NIL == preference_level_L(preference_level1, preference_level2));
    }

    public static SubLObject min_preference_level(final SubLObject preference_level_list) {
        return NIL != preference_level_list ? list_utilities.extremal(preference_level_list, $sym52$PREFERENCE_LEVEL__, UNPROVIDED) : last($ordered_preference_levels$.getGlobalValue(), UNPROVIDED).first();
    }

    public static SubLObject min2_preference_level(final SubLObject preference_level1, final SubLObject preference_level2) {
        return NIL != preference_level_L(preference_level2, preference_level1) ? preference_level2 : preference_level1;
    }

    public static SubLObject max_preference_level(final SubLObject preference_level_list) {
        return NIL != preference_level_list ? list_utilities.extremal(preference_level_list, $sym53$PREFERENCE_LEVEL__, UNPROVIDED) : $ordered_preference_levels$.getGlobalValue().first();
    }

    public static SubLObject max2_preference_level(final SubLObject preference_level1, final SubLObject preference_level2) {
        return NIL != preference_level_L(preference_level2, preference_level1) ? preference_level1 : preference_level2;
    }

    public static SubLObject completeness_to_preference_level(final SubLObject completeness) {
        if (completeness.eql($COMPLETE)) {
            return $PREFERRED;
        }
        if (completeness.eql($INCOMPLETE)) {
            return $DISPREFERRED;
        }
        if (completeness.eql($GROSSLY_INCOMPLETE)) {
            return $GROSSLY_DISPREFERRED;
        }
        if (completeness.eql($IMPOSSIBLE)) {
            return $DISALLOWED;
        }
        return Errors.error($str58$unexpected_completeness__s, completeness);
    }

    public static SubLObject preference_level_to_completeness(final SubLObject preference_level) {
        if (preference_level.eql($PREFERRED)) {
            return $COMPLETE;
        }
        if (preference_level.eql($DISPREFERRED)) {
            return $INCOMPLETE;
        }
        if (preference_level.eql($GROSSLY_DISPREFERRED)) {
            return $GROSSLY_INCOMPLETE;
        }
        if (preference_level.eql($DISALLOWED)) {
            return $IMPOSSIBLE;
        }
        if (preference_level.eql($DOOMED)) {
            return $IMPOSSIBLE;
        }
        return Errors.error($str59$unexpected_preference_level__s, preference_level);
    }

    public static SubLObject preference_module_property_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $preference_module_properties$.getGlobalValue());
    }

    public static SubLObject check_preference_module_properties(final SubLObject plist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        SubLObject pcase_var;
        for (remainder = NIL, remainder = plist; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            assert NIL != preference_module_property_p(property) : "preference_modules.preference_module_property_p(property) " + "CommonSymbols.NIL != preference_modules.preference_module_property_p(property) " + property;
            pcase_var = property;
            if (pcase_var.eql($PREDICATE)) {
                assert NIL != forts.fort_p(value) : "forts.fort_p(value) " + "CommonSymbols.NIL != forts.fort_p(value) " + value;
            } else
                if (pcase_var.eql($SENSE)) {
                    assert NIL != enumeration_types.sense_p(value) : "enumeration_types.sense_p(value) " + "CommonSymbols.NIL != enumeration_types.sense_p(value) " + value;
                } else
                    if (pcase_var.eql($REQUIRED_PATTERN)) {
                        assert NIL != consp(value) : "Types.consp(value) " + "CommonSymbols.NIL != Types.consp(value) " + value;
                    } else
                        if (pcase_var.eql($REQUIRED_MT)) {
                            assert NIL != cycl_utilities.fort_or_possibly_naut_p(value) : "cycl_utilities.fort_or_possibly_naut_p(value) " + "CommonSymbols.NIL != cycl_utilities.fort_or_possibly_naut_p(value) " + value;
                        } else
                            if (pcase_var.eql($ANY_PREDICATES)) {
                                assert NIL != listp(value) : "Types.listp(value) " + "CommonSymbols.NIL != Types.listp(value) " + value;
                            } else
                                if (pcase_var.eql($EXCLUSIVE)) {
                                    assert NIL != function_spec_p(value) : "Types.function_spec_p(value) " + "CommonSymbols.NIL != Types.function_spec_p(value) " + value;
                                } else
                                    if (pcase_var.eql($SUPPLANTS)) {
                                        if (((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (value != $ALL)) && ((NIL == list_utilities.proper_list_p(value)) || (NIL == list_utilities.every_in_list(SYMBOLP, value, UNPROVIDED)))) {
                                            Errors.error($str76$invalid__supplants_value__s, value);
                                        }
                                    } else
                                        if (pcase_var.eql($PREFERENCE_LEVEL)) {
                                            assert NIL != preference_level_p(value) : "preference_modules.preference_level_p(value) " + "CommonSymbols.NIL != preference_modules.preference_level_p(value) " + value;
                                        } else
                                            if (pcase_var.eql($PREFERENCE)) {
                                                assert NIL != symbolp(value) : "Types.symbolp(value) " + "CommonSymbols.NIL != Types.symbolp(value) " + value;
                                            } else {
                                                Errors.error($str79$unexpected_preference_module_prop, property);
                                            }








        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == getf(plist, $SENSE, UNPROVIDED))) {
            Errors.error($str80$_s_must_specify__sense, plist);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && makeBoolean(NIL == getf(plist, $PREFERENCE_LEVEL, UNPROVIDED)).eql(makeBoolean(NIL == getf(plist, $PREFERENCE, UNPROVIDED)))) {
            Errors.error($str81$_s_must_specify_exactly_one_of__p, plist);
        }
        return T;
    }

    public static SubLObject reclassify_preference_modules() {
        dictionary.dictionary_rebuild($specific_preference_modules$.getGlobalValue());
        return NIL;
    }

    public static SubLObject generic_preference_modules() {
        return set.set_element_list($generic_preference_modules$.getGlobalValue());
    }

    public static SubLObject generic_preference_module_count() {
        return set.set_size($generic_preference_modules$.getGlobalValue());
    }

    public static SubLObject specific_preference_module_count() {
        return dictionary.dictionary_length($specific_preference_modules$.getGlobalValue());
    }

    public static SubLObject preference_module_count() {
        return add(generic_preference_module_count(), specific_preference_module_count());
    }

    public static SubLObject specific_preference_module_predicates() {
        return dictionary.dictionary_keys($specific_preference_modules$.getGlobalValue());
    }

    public static SubLObject specific_preference_modules_for_pred(final SubLObject pred) {
        return dictionary.dictionary_lookup_without_values($specific_preference_modules$.getGlobalValue(), pred, UNPROVIDED);
    }

    public static SubLObject predicate_has_specific_preference_modulesP(final SubLObject predicate) {
        return list_utilities.sublisp_boolean(specific_preference_modules_for_pred(predicate));
    }

    public static SubLObject note_preference_module_supplants(final SubLObject prefmod, final SubLObject supplants) {
        if (NIL == supplants) {
            dictionary.dictionary_remove($preference_module_supplants$.getGlobalValue(), prefmod);
        } else {
            dictionary.dictionary_enter($preference_module_supplants$.getGlobalValue(), prefmod, supplants);
        }
        return prefmod;
    }

    public static SubLObject preference_module_exclusiveP(final SubLObject prefmod) {
        return list_utilities.sublisp_boolean(dictionary.dictionary_lookup_without_values($preference_module_supplants$.getGlobalValue(), prefmod, NIL));
    }

    public static SubLObject preference_module_supplants(final SubLObject prefmod) {
        return dictionary.dictionary_lookup_without_values($preference_module_supplants$.getGlobalValue(), prefmod, NIL);
    }

    public static SubLObject deregister_preference_module(final SubLObject prefmod) {
        final SubLObject pred = preference_module_predicate(prefmod);
        if (NIL != pred) {
            dictionary_utilities.dictionary_delete_from_value($specific_preference_modules$.getGlobalValue(), pred, prefmod, UNPROVIDED, UNPROVIDED);
        }
        set.set_remove(prefmod, $generic_preference_modules$.getGlobalValue());
        dictionary.dictionary_remove($preference_modules_by_name$.getGlobalValue(), preference_module_name(prefmod));
        return NIL;
    }

    public static SubLObject register_preference_module(final SubLObject prefmod) {
        dictionary.dictionary_enter($preference_modules_by_name$.getGlobalValue(), preference_module_name(prefmod), prefmod);
        final SubLObject predicate = preference_module_predicate(prefmod);
        if (NIL != predicate) {
            dictionary_utilities.dictionary_push($specific_preference_modules$.getGlobalValue(), predicate, prefmod);
        } else {
            set.set_add(prefmod, $generic_preference_modules$.getGlobalValue());
        }
        return prefmod;
    }

    public static SubLObject deregister_all_preference_modules_for_predicate(final SubLObject predicate) {
        SubLObject count = ZERO_INTEGER;
        SubLObject cdolist_list_var = specific_preference_modules_for_pred(predicate);
        SubLObject prefmod = NIL;
        prefmod = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            deregister_preference_module(prefmod);
            count = add(count, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            prefmod = cdolist_list_var.first();
        } 
        return count;
    }

    public static SubLObject preference_module_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_preference_module(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject preference_module_p(final SubLObject v_object) {
        return v_object.getClass() == preference_modules.$preference_module_native.class ? T : NIL;
    }

    public static SubLObject pref_mod_name(final SubLObject v_object) {
        assert NIL != preference_module_p(v_object) : "preference_modules.preference_module_p(v_object) " + "CommonSymbols.NIL != preference_modules.preference_module_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject pref_mod_predicate(final SubLObject v_object) {
        assert NIL != preference_module_p(v_object) : "preference_modules.preference_module_p(v_object) " + "CommonSymbols.NIL != preference_modules.preference_module_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject pref_mod_sense(final SubLObject v_object) {
        assert NIL != preference_module_p(v_object) : "preference_modules.preference_module_p(v_object) " + "CommonSymbols.NIL != preference_modules.preference_module_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject pref_mod_required_pattern(final SubLObject v_object) {
        assert NIL != preference_module_p(v_object) : "preference_modules.preference_module_p(v_object) " + "CommonSymbols.NIL != preference_modules.preference_module_p(v_object) " + v_object;
        return v_object.getField5();
    }

    public static SubLObject pref_mod_preference_level(final SubLObject v_object) {
        assert NIL != preference_module_p(v_object) : "preference_modules.preference_module_p(v_object) " + "CommonSymbols.NIL != preference_modules.preference_module_p(v_object) " + v_object;
        return v_object.getField6();
    }

    public static SubLObject pref_mod_preference_func(final SubLObject v_object) {
        assert NIL != preference_module_p(v_object) : "preference_modules.preference_module_p(v_object) " + "CommonSymbols.NIL != preference_modules.preference_module_p(v_object) " + v_object;
        return v_object.getField7();
    }

    public static SubLObject pref_mod_required_mt(final SubLObject v_object) {
        assert NIL != preference_module_p(v_object) : "preference_modules.preference_module_p(v_object) " + "CommonSymbols.NIL != preference_modules.preference_module_p(v_object) " + v_object;
        return v_object.getField8();
    }

    public static SubLObject pref_mod_any_predicates(final SubLObject v_object) {
        assert NIL != preference_module_p(v_object) : "preference_modules.preference_module_p(v_object) " + "CommonSymbols.NIL != preference_modules.preference_module_p(v_object) " + v_object;
        return v_object.getField9();
    }

    public static SubLObject _csetf_pref_mod_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != preference_module_p(v_object) : "preference_modules.preference_module_p(v_object) " + "CommonSymbols.NIL != preference_modules.preference_module_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_pref_mod_predicate(final SubLObject v_object, final SubLObject value) {
        assert NIL != preference_module_p(v_object) : "preference_modules.preference_module_p(v_object) " + "CommonSymbols.NIL != preference_modules.preference_module_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_pref_mod_sense(final SubLObject v_object, final SubLObject value) {
        assert NIL != preference_module_p(v_object) : "preference_modules.preference_module_p(v_object) " + "CommonSymbols.NIL != preference_modules.preference_module_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_pref_mod_required_pattern(final SubLObject v_object, final SubLObject value) {
        assert NIL != preference_module_p(v_object) : "preference_modules.preference_module_p(v_object) " + "CommonSymbols.NIL != preference_modules.preference_module_p(v_object) " + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_pref_mod_preference_level(final SubLObject v_object, final SubLObject value) {
        assert NIL != preference_module_p(v_object) : "preference_modules.preference_module_p(v_object) " + "CommonSymbols.NIL != preference_modules.preference_module_p(v_object) " + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_pref_mod_preference_func(final SubLObject v_object, final SubLObject value) {
        assert NIL != preference_module_p(v_object) : "preference_modules.preference_module_p(v_object) " + "CommonSymbols.NIL != preference_modules.preference_module_p(v_object) " + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_pref_mod_required_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != preference_module_p(v_object) : "preference_modules.preference_module_p(v_object) " + "CommonSymbols.NIL != preference_modules.preference_module_p(v_object) " + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_pref_mod_any_predicates(final SubLObject v_object, final SubLObject value) {
        assert NIL != preference_module_p(v_object) : "preference_modules.preference_module_p(v_object) " + "CommonSymbols.NIL != preference_modules.preference_module_p(v_object) " + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject make_preference_module(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new preference_modules.$preference_module_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($NAME)) {
                _csetf_pref_mod_name(v_new, current_value);
            } else
                if (pcase_var.eql($PREDICATE)) {
                    _csetf_pref_mod_predicate(v_new, current_value);
                } else
                    if (pcase_var.eql($SENSE)) {
                        _csetf_pref_mod_sense(v_new, current_value);
                    } else
                        if (pcase_var.eql($REQUIRED_PATTERN)) {
                            _csetf_pref_mod_required_pattern(v_new, current_value);
                        } else
                            if (pcase_var.eql($PREFERENCE_LEVEL)) {
                                _csetf_pref_mod_preference_level(v_new, current_value);
                            } else
                                if (pcase_var.eql($PREFERENCE_FUNC)) {
                                    _csetf_pref_mod_preference_func(v_new, current_value);
                                } else
                                    if (pcase_var.eql($REQUIRED_MT)) {
                                        _csetf_pref_mod_required_mt(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($ANY_PREDICATES)) {
                                            _csetf_pref_mod_any_predicates(v_new, current_value);
                                        } else {
                                            Errors.error($str111$Invalid_slot__S_for_construction_, current_arg);
                                        }







        }
        return v_new;
    }

    public static SubLObject visit_defstruct_preference_module(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_PREFERENCE_MODULE, EIGHT_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $NAME, pref_mod_name(obj));
        funcall(visitor_fn, obj, $SLOT, $PREDICATE, pref_mod_predicate(obj));
        funcall(visitor_fn, obj, $SLOT, $SENSE, pref_mod_sense(obj));
        funcall(visitor_fn, obj, $SLOT, $REQUIRED_PATTERN, pref_mod_required_pattern(obj));
        funcall(visitor_fn, obj, $SLOT, $PREFERENCE_LEVEL, pref_mod_preference_level(obj));
        funcall(visitor_fn, obj, $SLOT, $PREFERENCE_FUNC, pref_mod_preference_func(obj));
        funcall(visitor_fn, obj, $SLOT, $REQUIRED_MT, pref_mod_required_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $ANY_PREDICATES, pref_mod_any_predicates(obj));
        funcall(visitor_fn, obj, $END, MAKE_PREFERENCE_MODULE, EIGHT_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_preference_module_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_preference_module(obj, visitor_fn);
    }

    public static SubLObject print_preference_module(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str117$_PREFMOD__a_, pref_mod_name(v_object));
        return NIL;
    }

    public static SubLObject sxhash_preference_module_method(final SubLObject v_object) {
        return Sxhash.sxhash(pref_mod_name(v_object));
    }

    public static SubLObject find_preference_module(final SubLObject name) {
        assert NIL != keywordp(name) : "Types.keywordp(name) " + "CommonSymbols.NIL != Types.keywordp(name) " + name;
        return dictionary.dictionary_lookup_without_values($preference_modules_by_name$.getGlobalValue(), name, UNPROVIDED);
    }

    public static SubLObject inference_preference_module(final SubLObject name, final SubLObject plist) {
        assert NIL != keywordp(name) : "Types.keywordp(name) " + "CommonSymbols.NIL != Types.keywordp(name) " + name;
        check_preference_module_properties(plist);
        SubLObject prefmod = find_preference_module(name);
        if (NIL != prefmod) {
            deregister_preference_module(prefmod);
        } else {
            prefmod = make_preference_module(UNPROVIDED);
        }
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = plist;
        SubLObject bad = NIL;
        SubLObject current_$10 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, plist, $list120);
            current_$10 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, plist, $list120);
            if (NIL == member(current_$10, $list121, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$10 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(plist, $list120);
        }
        final SubLObject predicate_tail = property_list_member($PREDICATE, plist);
        final SubLObject predicate = (NIL != predicate_tail) ? cadr(predicate_tail) : NIL;
        final SubLObject sense_tail = property_list_member($SENSE, plist);
        final SubLObject sense = (NIL != sense_tail) ? cadr(sense_tail) : NIL;
        final SubLObject any_predicates_tail = property_list_member($ANY_PREDICATES, plist);
        final SubLObject any_predicates = (NIL != any_predicates_tail) ? cadr(any_predicates_tail) : NIL;
        final SubLObject required_pattern_tail = property_list_member($REQUIRED_PATTERN, plist);
        final SubLObject required_pattern = (NIL != required_pattern_tail) ? cadr(required_pattern_tail) : NIL;
        final SubLObject required_mt_tail = property_list_member($REQUIRED_MT, plist);
        final SubLObject required_mt = (NIL != required_mt_tail) ? cadr(required_mt_tail) : NIL;
        final SubLObject supplants_tail = property_list_member($SUPPLANTS, plist);
        final SubLObject supplants = (NIL != supplants_tail) ? cadr(supplants_tail) : NIL;
        final SubLObject preference_level_tail = property_list_member($PREFERENCE_LEVEL, plist);
        final SubLObject preference_level = (NIL != preference_level_tail) ? cadr(preference_level_tail) : NIL;
        final SubLObject preference_tail = property_list_member($PREFERENCE, plist);
        final SubLObject preference = (NIL != preference_tail) ? cadr(preference_tail) : NIL;
        _csetf_pref_mod_name(prefmod, name);
        _csetf_pref_mod_predicate(prefmod, predicate);
        _csetf_pref_mod_any_predicates(prefmod, any_predicates);
        _csetf_pref_mod_sense(prefmod, sense);
        _csetf_pref_mod_required_pattern(prefmod, required_pattern);
        _csetf_pref_mod_required_mt(prefmod, required_mt);
        _csetf_pref_mod_preference_level(prefmod, preference_level);
        _csetf_pref_mod_preference_func(prefmod, preference);
        note_preference_module_supplants(prefmod, supplants);
        register_preference_module(prefmod);
        return prefmod;
    }

    public static SubLObject undeclare_inference_preference_module(final SubLObject name) {
        final SubLObject prefmod = find_preference_module(name);
        if (NIL != prefmod) {
            deregister_preference_module(prefmod);
            return T;
        }
        return NIL;
    }

    public static SubLObject preference_module_name(final SubLObject prefmod) {
        assert NIL != preference_module_p(prefmod) : "preference_modules.preference_module_p(prefmod) " + "CommonSymbols.NIL != preference_modules.preference_module_p(prefmod) " + prefmod;
        return pref_mod_name(prefmod);
    }

    public static SubLObject preference_module_predicate(final SubLObject prefmod) {
        assert NIL != preference_module_p(prefmod) : "preference_modules.preference_module_p(prefmod) " + "CommonSymbols.NIL != preference_modules.preference_module_p(prefmod) " + prefmod;
        return pref_mod_predicate(prefmod);
    }

    public static SubLObject preference_module_any_predicates(final SubLObject prefmod) {
        assert NIL != preference_module_p(prefmod) : "preference_modules.preference_module_p(prefmod) " + "CommonSymbols.NIL != preference_modules.preference_module_p(prefmod) " + prefmod;
        return pref_mod_any_predicates(prefmod);
    }

    public static SubLObject preference_module_sense(final SubLObject prefmod) {
        assert NIL != preference_module_p(prefmod) : "preference_modules.preference_module_p(prefmod) " + "CommonSymbols.NIL != preference_modules.preference_module_p(prefmod) " + prefmod;
        return pref_mod_sense(prefmod);
    }

    public static SubLObject preference_module_required_pattern(final SubLObject prefmod) {
        assert NIL != preference_module_p(prefmod) : "preference_modules.preference_module_p(prefmod) " + "CommonSymbols.NIL != preference_modules.preference_module_p(prefmod) " + prefmod;
        return pref_mod_required_pattern(prefmod);
    }

    public static SubLObject preference_module_required_mt(final SubLObject prefmod) {
        assert NIL != preference_module_p(prefmod) : "preference_modules.preference_module_p(prefmod) " + "CommonSymbols.NIL != preference_modules.preference_module_p(prefmod) " + prefmod;
        return pref_mod_required_mt(prefmod);
    }

    public static SubLObject preference_module_preference_level(final SubLObject prefmod) {
        assert NIL != preference_module_p(prefmod) : "preference_modules.preference_module_p(prefmod) " + "CommonSymbols.NIL != preference_modules.preference_module_p(prefmod) " + prefmod;
        return pref_mod_preference_level(prefmod);
    }

    public static SubLObject preference_module_preference_func(final SubLObject prefmod) {
        assert NIL != preference_module_p(prefmod) : "preference_modules.preference_module_p(prefmod) " + "CommonSymbols.NIL != preference_modules.preference_module_p(prefmod) " + prefmod;
        return pref_mod_preference_func(prefmod);
    }

    public static SubLObject cb_display_preference_module_info(final SubLObject prefmod) {
        final SubLObject name = preference_module_name(prefmod);
        html_princ($$$module_);
        html_princ_strong(name);
        html_newline(UNPROVIDED);
        final SubLObject sense = preference_module_sense(prefmod);
        html_princ($str123$sense___);
        html_princ(sense);
        html_newline(UNPROVIDED);
        final SubLObject pred = preference_module_predicate(prefmod);
        if (NIL != pred) {
            html_princ($str124$predicate___);
            cb_form(pred, UNPROVIDED, UNPROVIDED);
            html_newline(UNPROVIDED);
        }
        final SubLObject any_preds = preference_module_any_predicates(prefmod);
        if (NIL != any_preds) {
            html_princ($str125$any_predicates___);
            cb_form(any_preds, UNPROVIDED, UNPROVIDED);
            html_newline(UNPROVIDED);
        }
        final SubLObject required_pattern = preference_module_required_pattern(prefmod);
        if (NIL != required_pattern) {
            html_princ($str126$required_pattern___);
            cb_form(required_pattern, UNPROVIDED, UNPROVIDED);
            html_newline(UNPROVIDED);
        }
        final SubLObject required_mt = preference_module_required_mt(prefmod);
        if (NIL != required_mt) {
            html_princ($str127$required_mt___);
            cb_form(required_mt, UNPROVIDED, UNPROVIDED);
            html_newline(UNPROVIDED);
        }
        final SubLObject preference_level = preference_module_preference_level(prefmod);
        if (NIL != preference_level) {
            html_princ($str128$preference_level___);
            html_princ(preference_level);
            html_newline(UNPROVIDED);
        }
        final SubLObject preference_func = preference_module_preference_func(prefmod);
        if (NIL != preference_func) {
            html_princ($str129$preference_function___);
            html_princ(preference_func);
            html_newline(UNPROVIDED);
        }
        html_newline(UNPROVIDED);
        return NIL;
    }

    public static SubLObject preference_module_relevantP(final SubLObject prefmod, final SubLObject asent, final SubLObject sense, final SubLObject bindable_vars) {
        if ((((NIL != preference_module_predicate_matchP(prefmod, cycl_utilities.atomic_sentence_predicate(asent))) && (NIL != preference_module_sense_matchP(prefmod, sense))) && (NIL != preference_module_required_pattern_matchP(prefmod, asent, bindable_vars))) && (NIL != preference_module_required_mt_matchP(prefmod))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject preference_module_predicate_matchP(final SubLObject prefmod, final SubLObject pred) {
        final SubLObject match_pred = preference_module_predicate(prefmod);
        if (NIL != match_pred) {
            return eql(match_pred, pred);
        }
        final SubLObject match_any_preds = preference_module_any_predicates(prefmod);
        if (NIL != match_any_preds) {
            return subl_promotions.memberP(pred, match_any_preds, PATTERN_MATCHES_FORMULA, UNPROVIDED);
        }
        return T;
    }

    public static SubLObject preference_module_sense_matchP(final SubLObject prefmod, final SubLObject sense) {
        return eql(sense, preference_module_sense(prefmod));
    }

    public static SubLObject preference_module_required_pattern_matchP(final SubLObject prefmod, final SubLObject asent, final SubLObject bindable_vars) {
        final SubLObject pattern = preference_module_required_pattern(prefmod);
        return makeBoolean((NIL == pattern) || (NIL != formula_pattern_match.formula_matches_pattern(asent, pattern)));
    }

    public static SubLObject preference_module_required_mt_matchP(final SubLObject prefmod) {
        final SubLObject match_mt = preference_module_required_mt(prefmod);
        return makeBoolean((NIL == match_mt) || (NIL != mt_relevance_macros.relevant_mtP(match_mt)));
    }

    public static SubLObject preference_module_compute_preference_level(final SubLObject prefmod, final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context) {
        final SubLObject preference_level = preference_module_preference_level(prefmod);
        if (NIL != preference_level) {
            return preference_level;
        }
        final SubLObject preference_func = preference_module_preference_func(prefmod);
        return preference_module_compute_preference_level_funcall(preference_func, asent, bindable_vars, strategic_context);
    }

    public static SubLObject preference_module_compute_preference_level_funcall(final SubLObject preference_func, final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context) {
        if (preference_func.eql(TVA_POS_PREFERENCE)) {
            return removal_modules_tva_lookup.tva_pos_preference(asent, bindable_vars, strategic_context);
        }
        return funcall(preference_func, asent, bindable_vars, strategic_context);
    }

    public static SubLObject must_bind_arg1(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context) {
        return doomed_unless_bindable(arg_bindableP(ONE_INTEGER, asent, bindable_vars));
    }

    public static SubLObject must_bind_arg2(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context) {
        return doomed_unless_bindable(arg_bindableP(TWO_INTEGER, asent, bindable_vars));
    }

    public static SubLObject must_bind_arg3(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context) {
        return doomed_unless_bindable(arg_bindableP(THREE_INTEGER, asent, bindable_vars));
    }

    public static SubLObject must_bind_arg4(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context) {
        return doomed_unless_bindable(arg_bindableP(FOUR_INTEGER, asent, bindable_vars));
    }

    public static SubLObject must_bind_arg5(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context) {
        return doomed_unless_bindable(arg_bindableP(FIVE_INTEGER, asent, bindable_vars));
    }

    public static SubLObject must_bind_arg1_and_arg2(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context) {
        return doomed_unless_bindable(args_bindableP($list137, asent, bindable_vars));
    }

    public static SubLObject must_bind_arg1_and_arg3(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context) {
        return doomed_unless_bindable(args_bindableP($list139, asent, bindable_vars));
    }

    public static SubLObject must_bind_arg2_and_arg3(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context) {
        return doomed_unless_bindable(args_bindableP($list141, asent, bindable_vars));
    }

    public static SubLObject must_bind_arg1_arg2_and_arg3(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context) {
        return doomed_unless_bindable(args_bindableP($list143, asent, bindable_vars));
    }

    public static SubLObject must_bind_arg1_or_arg2(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context) {
        final SubLObject at_least_one_arg_bindableP = makeBoolean((NIL != arg_bindableP(ONE_INTEGER, asent, bindable_vars)) || (NIL != arg_bindableP(TWO_INTEGER, asent, bindable_vars)));
        return doomed_unless_bindable(at_least_one_arg_bindableP);
    }

    public static SubLObject must_bind_arg1_or_arg3(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context) {
        final SubLObject at_least_one_arg_bindableP = makeBoolean((NIL != arg_bindableP(ONE_INTEGER, asent, bindable_vars)) || (NIL != arg_bindableP(THREE_INTEGER, asent, bindable_vars)));
        return doomed_unless_bindable(at_least_one_arg_bindableP);
    }

    public static SubLObject must_bind_arg2_or_arg3(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context) {
        final SubLObject at_least_one_arg_bindableP = makeBoolean((NIL != arg_bindableP(TWO_INTEGER, asent, bindable_vars)) || (NIL != arg_bindableP(THREE_INTEGER, asent, bindable_vars)));
        return doomed_unless_bindable(at_least_one_arg_bindableP);
    }

    public static SubLObject must_bind_all_args(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context) {
        return doomed_unless_bindable(all_args_bindableP(asent, bindable_vars));
    }

    public static SubLObject doomed_unless_bindable(final SubLObject bindableP) {
        if (NIL != bindableP) {
            return $DISALLOWED;
        }
        return $DOOMED;
    }

    public static SubLObject all_args_bindableP(final SubLObject asent, final SubLObject bindable_vars) {
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(asent, $REGULARIZE);
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != tree_find_a_non_bindable_varP(arg, bindable_vars)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject args_bindableP(final SubLObject argnums, final SubLObject asent, final SubLObject bindable_vars) {
        SubLObject cdolist_list_var = argnums;
        SubLObject argnum = NIL;
        argnum = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == arg_bindableP(argnum, asent, bindable_vars)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            argnum = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject arg_bindableP(final SubLObject argnum, final SubLObject asent, final SubLObject bindable_vars) {
        final SubLObject arg = cycl_utilities.atomic_sentence_arg(asent, argnum, UNPROVIDED);
        return makeBoolean(NIL == tree_find_a_non_bindable_varP(arg, bindable_vars));
    }

    public static SubLObject non_bindable_varP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != variables.variable_p(v_object)) && (NIL == subl_promotions.memberP(v_object, $bindable_vars_lambda$.getDynamicValue(thread), symbol_function(EQL), UNPROVIDED)));
    }

    public static SubLObject tree_find_a_non_bindable_varP(final SubLObject tree, final SubLObject bindable_vars) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $bindable_vars_lambda$.currentBinding(thread);
        try {
            $bindable_vars_lambda$.bind(bindable_vars, thread);
            return list_utilities.tree_find_if($sym151$NON_BINDABLE_VAR_, tree, UNPROVIDED);
        } finally {
            $bindable_vars_lambda$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject sense_spec_p(final SubLObject v_object) {
        return makeBoolean((NIL != enumeration_types.sense_p(v_object)) || ($BOTH == v_object));
    }

    public static SubLObject disallowed_pattern_p(final SubLObject v_object) {
        return makeBoolean((NIL != el_formula_p(v_object)) && (NIL != forts.fort_p(cycl_utilities.el_formula_operator(v_object))));
    }

    public static SubLObject lookup_preference_function_from_must_bind_arg(final SubLObject must_bind_arg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject preference_func = list_utilities.alist_lookup($preference_functions_from_must_bind_arg$.getGlobalValue(), must_bind_arg, UNPROVIDED, UNPROVIDED);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == preference_func)) {
            Errors.error($str154$No_preference_function_registered, must_bind_arg);
        }
        return preference_func;
    }

    public static SubLObject compute_preference_module_name(final SubLObject sense, final SubLObject disallowed_pattern) {
        return removal_module_utilities.determine_hl_module_name(string_utilities.str(disallowed_pattern), sense);
    }

    public static SubLObject compute_disallowed_pattern_from_must_bind_arg(final SubLObject predicate, final SubLObject must_bind_arg) {
        SubLObject pattern = NIL;
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = number_utilities.f_1_(must_bind_arg), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
            pattern = cons($ANYTHING, pattern);
        }
        pattern = cons($NOT_FULLY_BOUND, pattern);
        pattern = nreverse(pattern);
        pattern = list_utilities.nadd_to_dotted_end($ANYTHING, pattern);
        pattern = nconc(list(predicate), pattern);
        return pattern;
    }

    public static SubLObject note_doom_module(final SubLObject doom_module, final SubLObject name) {
        return dictionary.dictionary_enter($doom_module_store$.getGlobalValue(), doom_module, name);
    }

    public static SubLObject unnote_doom_module(final SubLObject doom_module) {
        return dictionary.dictionary_remove($doom_module_store$.getGlobalValue(), doom_module);
    }

    public static SubLObject doom_module_name(final SubLObject doom_module) {
        return dictionary.dictionary_lookup_without_values($doom_module_store$.getGlobalValue(), doom_module, UNPROVIDED);
    }

    public static SubLObject doom_module_already_declaredP(final SubLObject doom_module) {
        return list_utilities.sublisp_boolean(doom_module_name(doom_module));
    }

    public static SubLObject doomed_unless_arg_bindable(final SubLObject sense_spec, final SubLObject predicate, final SubLObject must_bind_arg) {
        assert NIL != subl_promotions.non_negative_integer_p(must_bind_arg) : "subl_promotions.non_negative_integer_p(must_bind_arg) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(must_bind_arg) " + must_bind_arg;
        final SubLObject preference_func = lookup_preference_function_from_must_bind_arg(must_bind_arg);
        final SubLObject disallowed_pattern = compute_disallowed_pattern_from_must_bind_arg(predicate, must_bind_arg);
        return doomed_unless_preference_func(sense_spec, disallowed_pattern, preference_func);
    }

    public static SubLObject doomed_unless_all_args_bindable(final SubLObject sense_spec, final SubLObject predicate) {
        assert NIL != forts.fort_p(predicate) : "forts.fort_p(predicate) " + "CommonSymbols.NIL != forts.fort_p(predicate) " + predicate;
        return doomed_unless_preference_func(sense_spec, bq_cons(predicate, $NOT_FULLY_BOUND), MUST_BIND_ALL_ARGS);
    }

    public static SubLObject doomed_unless_either_arg_bindable(final SubLObject sense_spec, final SubLObject binary_predicate) {
        assert NIL != forts.fort_p(binary_predicate) : "forts.fort_p(binary_predicate) " + "CommonSymbols.NIL != forts.fort_p(binary_predicate) " + binary_predicate;
        return doomed_unless_preference_func(sense_spec, bq_cons(binary_predicate, $list159), MUST_BIND_ARG1_OR_ARG2);
    }

    public static SubLObject doomed_unless_preference_func(final SubLObject sense_spec, final SubLObject disallowed_pattern, final SubLObject preference_func) {
        assert NIL != sense_spec_p(sense_spec) : "preference_modules.sense_spec_p(sense_spec) " + "CommonSymbols.NIL != preference_modules.sense_spec_p(sense_spec) " + sense_spec;
        assert NIL != disallowed_pattern_p(disallowed_pattern) : "preference_modules.disallowed_pattern_p(disallowed_pattern) " + "CommonSymbols.NIL != preference_modules.disallowed_pattern_p(disallowed_pattern) " + disallowed_pattern;
        final SubLObject cdolist_list_var;
        final SubLObject senses = cdolist_list_var = ($BOTH == sense_spec) ? $list162 : list(sense_spec);
        SubLObject sense = NIL;
        sense = cdolist_list_var.first();
        if (NIL != cdolist_list_var) {
            final SubLObject pred = cycl_utilities.el_formula_operator(disallowed_pattern);
            final SubLObject doom_module_plist = list($SENSE, sense, $PREDICATE, pred, $REQUIRED_PATTERN, disallowed_pattern, $PREFERENCE, preference_func);
            if (NIL != doom_module_already_declaredP(doom_module_plist)) {
                unnote_doom_module(doom_module_plist);
            }
            final SubLObject module_name = compute_preference_module_name(sense, disallowed_pattern);
            note_doom_module(doom_module_plist, module_name);
            return inference_preference_module(module_name, doom_module_plist);
        }
        return NIL;
    }

    public static SubLObject test_el_literal_preference_level_wrt_modules(final SubLObject el_asent, final SubLObject sense, final SubLObject el_bindable_vars, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preference_level = NIL;
        final SubLObject asent = variables.error_unless_canonicalize_default_el_vars(el_asent);
        final SubLObject bindable_vars = variables.error_unless_canonicalize_default_el_vars(el_bindable_vars);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
            preference_level = literal_preference_level_wrt_modules(asent, sense, bindable_vars, $TACTICAL);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return preference_level;
    }

    public static SubLObject tiny_kb_el_literal_preference_level_wrt_modules(final SubLObject el_asent, final SubLObject sense, final SubLObject el_bindable_vars, final SubLObject mt) {
        return test_el_literal_preference_level_wrt_modules(el_asent, sense, el_bindable_vars, mt);
    }

    public static SubLObject full_kb_el_literal_preference_level_wrt_modules(final SubLObject el_asent, final SubLObject sense, final SubLObject el_bindable_vars, final SubLObject mt) {
        return test_el_literal_preference_level_wrt_modules(el_asent, sense, el_bindable_vars, mt);
    }

    public static SubLObject declare_preference_modules_file() {
        declareMacro(me, "do_generic_preference_modules", "DO-GENERIC-PREFERENCE-MODULES");
        declareMacro(me, "do_specific_preference_modules_for_pred", "DO-SPECIFIC-PREFERENCE-MODULES-FOR-PRED");
        declareMacro(me, "do_relevant_preference_modules", "DO-RELEVANT-PREFERENCE-MODULES");
        declareMacro(me, "do_preference_modules", "DO-PREFERENCE-MODULES");
        declareFunction(me, "single_literal_problem_preference_level_wrt_modules", "SINGLE-LITERAL-PROBLEM-PREFERENCE-LEVEL-WRT-MODULES", 3, 0, false);
        declareFunction(me, "literal_preference_level_wrt_modules", "LITERAL-PREFERENCE-LEVEL-WRT-MODULES", 4, 0, false);
        declareFunction(me, "all_relevant_preference_modules", "ALL-RELEVANT-PREFERENCE-MODULES", 3, 0, false);
        declareFunction(me, "el_literal_preference_level_wrt_modules", "EL-LITERAL-PREFERENCE-LEVEL-WRT-MODULES", 4, 0, false);
        declareFunction(me, "statically_sort_conjunct_literals", "STATICALLY-SORT-CONJUNCT-LITERALS", 1, 1, false);
        declareFunction(me, "statically_sort_conjunct_literals_recursive", "STATICALLY-SORT-CONJUNCT-LITERALS-RECURSIVE", 3, 0, false);
        declareFunction(me, "statically_select_next_conjunct_literal", "STATICALLY-SELECT-NEXT-CONJUNCT-LITERAL", 2, 0, false);
        declareFunction(me, "compute_analysis_asent_wrt_static_sort", "COMPUTE-ANALYSIS-ASENT-WRT-STATIC-SORT", 2, 0, false);
        declareFunction(me, "compute_generic_term_for_bound_argument_of_predicate", "COMPUTE-GENERIC-TERM-FOR-BOUND-ARGUMENT-OF-PREDICATE", 1, 0, false);
        declareFunction(me, "within_generic_preference_analysisP", "WITHIN-GENERIC-PREFERENCE-ANALYSIS?", 0, 0, false);
        declareFunction(me, "literal_preference_level_wrt_static_sort", "LITERAL-PREFERENCE-LEVEL-WRT-STATIC-SORT", 3, 0, false);
        declareFunction(me, "literal_removal_cost_wrt_static_sort", "LITERAL-REMOVAL-COST-WRT-STATIC-SORT", 2, 0, false);
        declareFunction(me, "preference_level_string", "PREFERENCE-LEVEL-STRING", 1, 0, false);
        declareFunction(me, "preference_level_p", "PREFERENCE-LEVEL-P", 1, 0, false);
        declareFunction(me, "disallowed_preference_level_p", "DISALLOWED-PREFERENCE-LEVEL-P", 1, 0, false);
        declareFunction(me, "doomed_preference_level_p", "DOOMED-PREFERENCE-LEVEL-P", 1, 0, false);
        declareFunction(me, "disallowed_or_doomed_preference_level_p", "DISALLOWED-OR-DOOMED-PREFERENCE-LEVEL-P", 1, 0, false);
        declareFunction(me, "preference_level_L", "PREFERENCE-LEVEL-<", 2, 0, false);
        declareFunction(me, "preference_level_G", "PREFERENCE-LEVEL->", 2, 0, false);
        declareFunction(me, "preference_level_LE", "PREFERENCE-LEVEL-<=", 2, 0, false);
        declareFunction(me, "preference_level_GE", "PREFERENCE-LEVEL->=", 2, 0, false);
        declareFunction(me, "min_preference_level", "MIN-PREFERENCE-LEVEL", 1, 0, false);
        declareFunction(me, "min2_preference_level", "MIN2-PREFERENCE-LEVEL", 2, 0, false);
        declareFunction(me, "max_preference_level", "MAX-PREFERENCE-LEVEL", 1, 0, false);
        declareFunction(me, "max2_preference_level", "MAX2-PREFERENCE-LEVEL", 2, 0, false);
        declareFunction(me, "completeness_to_preference_level", "COMPLETENESS-TO-PREFERENCE-LEVEL", 1, 0, false);
        declareFunction(me, "preference_level_to_completeness", "PREFERENCE-LEVEL-TO-COMPLETENESS", 1, 0, false);
        declareFunction(me, "preference_module_property_p", "PREFERENCE-MODULE-PROPERTY-P", 1, 0, false);
        declareFunction(me, "check_preference_module_properties", "CHECK-PREFERENCE-MODULE-PROPERTIES", 1, 0, false);
        declareFunction(me, "reclassify_preference_modules", "RECLASSIFY-PREFERENCE-MODULES", 0, 0, false);
        declareFunction(me, "generic_preference_modules", "GENERIC-PREFERENCE-MODULES", 0, 0, false);
        declareFunction(me, "generic_preference_module_count", "GENERIC-PREFERENCE-MODULE-COUNT", 0, 0, false);
        declareFunction(me, "specific_preference_module_count", "SPECIFIC-PREFERENCE-MODULE-COUNT", 0, 0, false);
        declareFunction(me, "preference_module_count", "PREFERENCE-MODULE-COUNT", 0, 0, false);
        declareFunction(me, "specific_preference_module_predicates", "SPECIFIC-PREFERENCE-MODULE-PREDICATES", 0, 0, false);
        declareFunction(me, "specific_preference_modules_for_pred", "SPECIFIC-PREFERENCE-MODULES-FOR-PRED", 1, 0, false);
        declareFunction(me, "predicate_has_specific_preference_modulesP", "PREDICATE-HAS-SPECIFIC-PREFERENCE-MODULES?", 1, 0, false);
        declareFunction(me, "note_preference_module_supplants", "NOTE-PREFERENCE-MODULE-SUPPLANTS", 2, 0, false);
        declareFunction(me, "preference_module_exclusiveP", "PREFERENCE-MODULE-EXCLUSIVE?", 1, 0, false);
        declareFunction(me, "preference_module_supplants", "PREFERENCE-MODULE-SUPPLANTS", 1, 0, false);
        declareFunction(me, "deregister_preference_module", "DEREGISTER-PREFERENCE-MODULE", 1, 0, false);
        declareFunction(me, "register_preference_module", "REGISTER-PREFERENCE-MODULE", 1, 0, false);
        declareFunction(me, "deregister_all_preference_modules_for_predicate", "DEREGISTER-ALL-PREFERENCE-MODULES-FOR-PREDICATE", 1, 0, false);
        declareFunction(me, "preference_module_print_function_trampoline", "PREFERENCE-MODULE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "preference_module_p", "PREFERENCE-MODULE-P", 1, 0, false);
        new preference_modules.$preference_module_p$UnaryFunction();
        declareFunction(me, "pref_mod_name", "PREF-MOD-NAME", 1, 0, false);
        declareFunction(me, "pref_mod_predicate", "PREF-MOD-PREDICATE", 1, 0, false);
        declareFunction(me, "pref_mod_sense", "PREF-MOD-SENSE", 1, 0, false);
        declareFunction(me, "pref_mod_required_pattern", "PREF-MOD-REQUIRED-PATTERN", 1, 0, false);
        declareFunction(me, "pref_mod_preference_level", "PREF-MOD-PREFERENCE-LEVEL", 1, 0, false);
        declareFunction(me, "pref_mod_preference_func", "PREF-MOD-PREFERENCE-FUNC", 1, 0, false);
        declareFunction(me, "pref_mod_required_mt", "PREF-MOD-REQUIRED-MT", 1, 0, false);
        declareFunction(me, "pref_mod_any_predicates", "PREF-MOD-ANY-PREDICATES", 1, 0, false);
        declareFunction(me, "_csetf_pref_mod_name", "_CSETF-PREF-MOD-NAME", 2, 0, false);
        declareFunction(me, "_csetf_pref_mod_predicate", "_CSETF-PREF-MOD-PREDICATE", 2, 0, false);
        declareFunction(me, "_csetf_pref_mod_sense", "_CSETF-PREF-MOD-SENSE", 2, 0, false);
        declareFunction(me, "_csetf_pref_mod_required_pattern", "_CSETF-PREF-MOD-REQUIRED-PATTERN", 2, 0, false);
        declareFunction(me, "_csetf_pref_mod_preference_level", "_CSETF-PREF-MOD-PREFERENCE-LEVEL", 2, 0, false);
        declareFunction(me, "_csetf_pref_mod_preference_func", "_CSETF-PREF-MOD-PREFERENCE-FUNC", 2, 0, false);
        declareFunction(me, "_csetf_pref_mod_required_mt", "_CSETF-PREF-MOD-REQUIRED-MT", 2, 0, false);
        declareFunction(me, "_csetf_pref_mod_any_predicates", "_CSETF-PREF-MOD-ANY-PREDICATES", 2, 0, false);
        declareFunction(me, "make_preference_module", "MAKE-PREFERENCE-MODULE", 0, 1, false);
        declareFunction(me, "visit_defstruct_preference_module", "VISIT-DEFSTRUCT-PREFERENCE-MODULE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_preference_module_method", "VISIT-DEFSTRUCT-OBJECT-PREFERENCE-MODULE-METHOD", 2, 0, false);
        declareFunction(me, "print_preference_module", "PRINT-PREFERENCE-MODULE", 3, 0, false);
        declareFunction(me, "sxhash_preference_module_method", "SXHASH-PREFERENCE-MODULE-METHOD", 1, 0, false);
        new preference_modules.$sxhash_preference_module_method$UnaryFunction();
        declareFunction(me, "find_preference_module", "FIND-PREFERENCE-MODULE", 1, 0, false);
        declareFunction(me, "inference_preference_module", "INFERENCE-PREFERENCE-MODULE", 2, 0, false);
        declareFunction(me, "undeclare_inference_preference_module", "UNDECLARE-INFERENCE-PREFERENCE-MODULE", 1, 0, false);
        declareFunction(me, "preference_module_name", "PREFERENCE-MODULE-NAME", 1, 0, false);
        declareFunction(me, "preference_module_predicate", "PREFERENCE-MODULE-PREDICATE", 1, 0, false);
        declareFunction(me, "preference_module_any_predicates", "PREFERENCE-MODULE-ANY-PREDICATES", 1, 0, false);
        declareFunction(me, "preference_module_sense", "PREFERENCE-MODULE-SENSE", 1, 0, false);
        declareFunction(me, "preference_module_required_pattern", "PREFERENCE-MODULE-REQUIRED-PATTERN", 1, 0, false);
        declareFunction(me, "preference_module_required_mt", "PREFERENCE-MODULE-REQUIRED-MT", 1, 0, false);
        declareFunction(me, "preference_module_preference_level", "PREFERENCE-MODULE-PREFERENCE-LEVEL", 1, 0, false);
        declareFunction(me, "preference_module_preference_func", "PREFERENCE-MODULE-PREFERENCE-FUNC", 1, 0, false);
        declareFunction(me, "cb_display_preference_module_info", "CB-DISPLAY-PREFERENCE-MODULE-INFO", 1, 0, false);
        declareFunction(me, "preference_module_relevantP", "PREFERENCE-MODULE-RELEVANT?", 4, 0, false);
        declareFunction(me, "preference_module_predicate_matchP", "PREFERENCE-MODULE-PREDICATE-MATCH?", 2, 0, false);
        declareFunction(me, "preference_module_sense_matchP", "PREFERENCE-MODULE-SENSE-MATCH?", 2, 0, false);
        declareFunction(me, "preference_module_required_pattern_matchP", "PREFERENCE-MODULE-REQUIRED-PATTERN-MATCH?", 3, 0, false);
        declareFunction(me, "preference_module_required_mt_matchP", "PREFERENCE-MODULE-REQUIRED-MT-MATCH?", 1, 0, false);
        declareFunction(me, "preference_module_compute_preference_level", "PREFERENCE-MODULE-COMPUTE-PREFERENCE-LEVEL", 4, 0, false);
        declareFunction(me, "preference_module_compute_preference_level_funcall", "PREFERENCE-MODULE-COMPUTE-PREFERENCE-LEVEL-FUNCALL", 4, 0, false);
        declareFunction(me, "must_bind_arg1", "MUST-BIND-ARG1", 3, 0, false);
        declareFunction(me, "must_bind_arg2", "MUST-BIND-ARG2", 3, 0, false);
        declareFunction(me, "must_bind_arg3", "MUST-BIND-ARG3", 3, 0, false);
        declareFunction(me, "must_bind_arg4", "MUST-BIND-ARG4", 3, 0, false);
        declareFunction(me, "must_bind_arg5", "MUST-BIND-ARG5", 3, 0, false);
        declareFunction(me, "must_bind_arg1_and_arg2", "MUST-BIND-ARG1-AND-ARG2", 3, 0, false);
        declareFunction(me, "must_bind_arg1_and_arg3", "MUST-BIND-ARG1-AND-ARG3", 3, 0, false);
        declareFunction(me, "must_bind_arg2_and_arg3", "MUST-BIND-ARG2-AND-ARG3", 3, 0, false);
        declareFunction(me, "must_bind_arg1_arg2_and_arg3", "MUST-BIND-ARG1-ARG2-AND-ARG3", 3, 0, false);
        declareFunction(me, "must_bind_arg1_or_arg2", "MUST-BIND-ARG1-OR-ARG2", 3, 0, false);
        declareFunction(me, "must_bind_arg1_or_arg3", "MUST-BIND-ARG1-OR-ARG3", 3, 0, false);
        declareFunction(me, "must_bind_arg2_or_arg3", "MUST-BIND-ARG2-OR-ARG3", 3, 0, false);
        declareFunction(me, "must_bind_all_args", "MUST-BIND-ALL-ARGS", 3, 0, false);
        declareFunction(me, "doomed_unless_bindable", "DOOMED-UNLESS-BINDABLE", 1, 0, false);
        declareFunction(me, "all_args_bindableP", "ALL-ARGS-BINDABLE?", 2, 0, false);
        declareFunction(me, "args_bindableP", "ARGS-BINDABLE?", 3, 0, false);
        declareFunction(me, "arg_bindableP", "ARG-BINDABLE?", 3, 0, false);
        declareFunction(me, "non_bindable_varP", "NON-BINDABLE-VAR?", 1, 0, false);
        declareFunction(me, "tree_find_a_non_bindable_varP", "TREE-FIND-A-NON-BINDABLE-VAR?", 2, 0, false);
        declareFunction(me, "sense_spec_p", "SENSE-SPEC-P", 1, 0, false);
        declareFunction(me, "disallowed_pattern_p", "DISALLOWED-PATTERN-P", 1, 0, false);
        declareFunction(me, "lookup_preference_function_from_must_bind_arg", "LOOKUP-PREFERENCE-FUNCTION-FROM-MUST-BIND-ARG", 1, 0, false);
        declareFunction(me, "compute_preference_module_name", "COMPUTE-PREFERENCE-MODULE-NAME", 2, 0, false);
        declareFunction(me, "compute_disallowed_pattern_from_must_bind_arg", "COMPUTE-DISALLOWED-PATTERN-FROM-MUST-BIND-ARG", 2, 0, false);
        declareFunction(me, "note_doom_module", "NOTE-DOOM-MODULE", 2, 0, false);
        declareFunction(me, "unnote_doom_module", "UNNOTE-DOOM-MODULE", 1, 0, false);
        declareFunction(me, "doom_module_name", "DOOM-MODULE-NAME", 1, 0, false);
        declareFunction(me, "doom_module_already_declaredP", "DOOM-MODULE-ALREADY-DECLARED?", 1, 0, false);
        declareFunction(me, "doomed_unless_arg_bindable", "DOOMED-UNLESS-ARG-BINDABLE", 3, 0, false);
        declareFunction(me, "doomed_unless_all_args_bindable", "DOOMED-UNLESS-ALL-ARGS-BINDABLE", 2, 0, false);
        declareFunction(me, "doomed_unless_either_arg_bindable", "DOOMED-UNLESS-EITHER-ARG-BINDABLE", 2, 0, false);
        declareFunction(me, "doomed_unless_preference_func", "DOOMED-UNLESS-PREFERENCE-FUNC", 3, 0, false);
        declareFunction(me, "test_el_literal_preference_level_wrt_modules", "TEST-EL-LITERAL-PREFERENCE-LEVEL-WRT-MODULES", 4, 0, false);
        declareFunction(me, "tiny_kb_el_literal_preference_level_wrt_modules", "TINY-KB-EL-LITERAL-PREFERENCE-LEVEL-WRT-MODULES", 4, 0, false);
        declareFunction(me, "full_kb_el_literal_preference_level_wrt_modules", "FULL-KB-EL-LITERAL-PREFERENCE-LEVEL-WRT-MODULES", 4, 0, false);
        return NIL;
    }

    public static SubLObject init_preference_modules_file() {
        defvar("*WITHIN-GENERIC-PREFERENCE-ANALYSIS?*", NIL);
        deflexical("*MIN-PREFERENCE-LEVEL*", $PREFERRED);
        deflexical("*MAX-PREFERENCE-LEVEL*", $DOOMED);
        deflexical("*DEFAULT-PREFERENCE-LEVEL*", $DISALLOWED);
        deflexical("*ORDERED-PREFERENCE-LEVELS*", $list41);
        deflexical("*PREFERENCE-MODULE-PROPERTIES*", $list60);
        deflexical("*PREFERENCE-MODULES-BY-NAME*", SubLTrampolineFile.maybeDefault($preference_modules_by_name$, $preference_modules_by_name$, () -> dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED)));
        deflexical("*GENERIC-PREFERENCE-MODULES*", SubLTrampolineFile.maybeDefault($generic_preference_modules$, $generic_preference_modules$, () -> set.new_set(symbol_function(EQ), UNPROVIDED)));
        deflexical("*SPECIFIC-PREFERENCE-MODULES*", SubLTrampolineFile.maybeDefault($specific_preference_modules$, $specific_preference_modules$, () -> dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED)));
        deflexical("*PREFERENCE-MODULE-SUPPLANTS*", SubLTrampolineFile.maybeDefault($preference_module_supplants$, $preference_module_supplants$, () -> dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED)));
        defconstant("*DTP-PREFERENCE-MODULE*", PREFERENCE_MODULE);
        defparameter("*BINDABLE-VARS-LAMBDA*", NIL);
        deflexical("*PREFERENCE-FUNCTIONS-FROM-MUST-BIND-ARG*", $list153);
        deflexical("*DOOM-MODULE-STORE*", SubLTrampolineFile.maybeDefault($doom_module_store$, $doom_module_store$, () -> dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED)));
        return NIL;
    }

    public static SubLObject setup_preference_modules_file() {
        declare_defglobal($preference_modules_by_name$);
        declare_defglobal($generic_preference_modules$);
        declare_defglobal($specific_preference_modules$);
        declare_defglobal($preference_module_supplants$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_preference_module$.getGlobalValue(), symbol_function(PREFERENCE_MODULE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list92);
        def_csetf(PREF_MOD_NAME, _CSETF_PREF_MOD_NAME);
        def_csetf(PREF_MOD_PREDICATE, _CSETF_PREF_MOD_PREDICATE);
        def_csetf(PREF_MOD_SENSE, _CSETF_PREF_MOD_SENSE);
        def_csetf(PREF_MOD_REQUIRED_PATTERN, _CSETF_PREF_MOD_REQUIRED_PATTERN);
        def_csetf(PREF_MOD_PREFERENCE_LEVEL, _CSETF_PREF_MOD_PREFERENCE_LEVEL);
        def_csetf(PREF_MOD_PREFERENCE_FUNC, _CSETF_PREF_MOD_PREFERENCE_FUNC);
        def_csetf(PREF_MOD_REQUIRED_MT, _CSETF_PREF_MOD_REQUIRED_MT);
        def_csetf(PREF_MOD_ANY_PREDICATES, _CSETF_PREF_MOD_ANY_PREDICATES);
        identity(PREFERENCE_MODULE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_preference_module$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_PREFERENCE_MODULE_METHOD));
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_preference_module$.getGlobalValue(), symbol_function(SXHASH_PREFERENCE_MODULE_METHOD));
        note_funcall_helper_function(MUST_BIND_ARG1);
        note_funcall_helper_function(MUST_BIND_ARG2);
        note_funcall_helper_function(MUST_BIND_ARG3);
        note_funcall_helper_function(MUST_BIND_ARG4);
        note_funcall_helper_function(MUST_BIND_ARG5);
        note_funcall_helper_function(MUST_BIND_ARG1_AND_ARG2);
        note_funcall_helper_function(MUST_BIND_ARG1_AND_ARG3);
        note_funcall_helper_function(MUST_BIND_ARG2_AND_ARG3);
        note_funcall_helper_function(MUST_BIND_ARG1_ARG2_AND_ARG3);
        note_funcall_helper_function(MUST_BIND_ARG1_OR_ARG2);
        note_funcall_helper_function(MUST_BIND_ARG1_OR_ARG3);
        note_funcall_helper_function(MUST_BIND_ARG2_OR_ARG3);
        note_funcall_helper_function(MUST_BIND_ALL_ARGS);
        declare_defglobal($doom_module_store$);
        define_test_case_table_int(TINY_KB_EL_LITERAL_PREFERENCE_LEVEL_WRT_MODULES, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list170);
        define_test_case_table_int(FULL_KB_EL_LITERAL_PREFERENCE_LEVEL_WRT_MODULES, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list173);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_preference_modules_file();
    }

    @Override
    public void initializeVariables() {
        init_preference_modules_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_preference_modules_file();
    }

    static {





























































































































































































    }

    public static final class $preference_module_native extends SubLStructNative {
        public SubLObject $name;

        public SubLObject $predicate;

        public SubLObject $sense;

        public SubLObject $required_pattern;

        public SubLObject $preference_level;

        public SubLObject $preference_func;

        public SubLObject $required_mt;

        public SubLObject $any_predicates;

        private static final SubLStructDeclNative structDecl;

        public $preference_module_native() {
            this.$name = Lisp.NIL;
            this.$predicate = Lisp.NIL;
            this.$sense = Lisp.NIL;
            this.$required_pattern = Lisp.NIL;
            this.$preference_level = Lisp.NIL;
            this.$preference_func = Lisp.NIL;
            this.$required_mt = Lisp.NIL;
            this.$any_predicates = Lisp.NIL;
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
            return this.$predicate;
        }

        @Override
        public SubLObject getField4() {
            return this.$sense;
        }

        @Override
        public SubLObject getField5() {
            return this.$required_pattern;
        }

        @Override
        public SubLObject getField6() {
            return this.$preference_level;
        }

        @Override
        public SubLObject getField7() {
            return this.$preference_func;
        }

        @Override
        public SubLObject getField8() {
            return this.$required_mt;
        }

        @Override
        public SubLObject getField9() {
            return this.$any_predicates;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$predicate = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$sense = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$required_pattern = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$preference_level = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$preference_func = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$required_mt = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$any_predicates = value;
        }

        static {
            structDecl = makeStructDeclNative(preference_modules.$preference_module_native.class, PREFERENCE_MODULE, PREFERENCE_MODULE_P, $list86, $list87, new String[]{ "$name", "$predicate", "$sense", "$required_pattern", "$preference_level", "$preference_func", "$required_mt", "$any_predicates" }, $list88, $list89, PRINT_PREFERENCE_MODULE);
        }
    }

    public static final class $preference_module_p$UnaryFunction extends UnaryFunction {
        public $preference_module_p$UnaryFunction() {
            super(extractFunctionNamed("PREFERENCE-MODULE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return preference_module_p(arg1);
        }
    }

    public static final class $sxhash_preference_module_method$UnaryFunction extends UnaryFunction {
        public $sxhash_preference_module_method$UnaryFunction() {
            super(extractFunctionNamed("SXHASH-PREFERENCE-MODULE-METHOD"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sxhash_preference_module_method(arg1);
        }
    }
}

/**
 * Total time: 640 ms synthetic
 */
