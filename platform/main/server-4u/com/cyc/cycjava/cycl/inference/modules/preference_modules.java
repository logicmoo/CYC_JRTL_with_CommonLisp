/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules;


import static com.cyc.cycjava.cycl.bindings.apply_bindings;
import static com.cyc.cycjava.cycl.cb_utilities.cb_form;
import static com.cyc.cycjava.cycl.clause_utilities.atomic_clause_asent;
import static com.cyc.cycjava.cycl.clause_utilities.pos_atomic_clause_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.cycl_utilities.atomic_sentence_arg;
import static com.cyc.cycjava.cycl.cycl_utilities.atomic_sentence_predicate;
import static com.cyc.cycjava.cycl.cycl_utilities.el_formula_operator;
import static com.cyc.cycjava.cycl.cycl_utilities.formula_args;
import static com.cyc.cycjava.cycl.cycl_utilities.fort_or_possibly_naut_p;
import static com.cyc.cycjava.cycl.cycl_utilities.negate;
import static com.cyc.cycjava.cycl.cycl_utilities.negatedP;
import static com.cyc.cycjava.cycl.czer_main.canonicalize_query_sentence;
import static com.cyc.cycjava.cycl.dictionary.dictionary_enter;
import static com.cyc.cycjava.cycl.dictionary.dictionary_keys;
import static com.cyc.cycjava.cycl.dictionary.dictionary_length;
import static com.cyc.cycjava.cycl.dictionary.dictionary_lookup_without_values;
import static com.cyc.cycjava.cycl.dictionary.dictionary_rebuild;
import static com.cyc.cycjava.cycl.dictionary.dictionary_remove;
import static com.cyc.cycjava.cycl.dictionary.new_dictionary;
import static com.cyc.cycjava.cycl.dictionary_utilities.dictionary_delete_from_value;
import static com.cyc.cycjava.cycl.dictionary_utilities.dictionary_push;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.formula_pattern_match.formula_matches_pattern;
import static com.cyc.cycjava.cycl.html_utilities.html_newline;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_princ_strong;
import static com.cyc.cycjava.cycl.list_utilities.alist_lookup;
import static com.cyc.cycjava.cycl.list_utilities.every_in_list;
import static com.cyc.cycjava.cycl.list_utilities.extremal;
import static com.cyc.cycjava.cycl.list_utilities.member_eqP;
import static com.cyc.cycjava.cycl.list_utilities.nadd_to_dotted_end;
import static com.cyc.cycjava.cycl.list_utilities.position_L;
import static com.cyc.cycjava.cycl.list_utilities.proper_list_p;
import static com.cyc.cycjava.cycl.list_utilities.simple_tree_findP;
import static com.cyc.cycjava.cycl.list_utilities.singletonP;
import static com.cyc.cycjava.cycl.list_utilities.sublisp_boolean;
import static com.cyc.cycjava.cycl.list_utilities.tree_find_if;
import static com.cyc.cycjava.cycl.mt_relevance_macros.$mt$;
import static com.cyc.cycjava.cycl.mt_relevance_macros.$relevant_mt_function$;
import static com.cyc.cycjava.cycl.mt_relevance_macros.$relevant_mts$;
import static com.cyc.cycjava.cycl.mt_relevance_macros.relevant_mtP;
import static com.cyc.cycjava.cycl.mt_relevance_macros.update_inference_mt_relevance_function;
import static com.cyc.cycjava.cycl.mt_relevance_macros.update_inference_mt_relevance_mt;
import static com.cyc.cycjava.cycl.mt_relevance_macros.update_inference_mt_relevance_mt_list;
import static com.cyc.cycjava.cycl.set.do_set_internal;
import static com.cyc.cycjava.cycl.set.new_set;
import static com.cyc.cycjava.cycl.set.set_add;
import static com.cyc.cycjava.cycl.set.set_element_list;
import static com.cyc.cycjava.cycl.set.set_remove;
import static com.cyc.cycjava.cycl.set.set_size;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_basis_object;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_doneP;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_element_validP;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_initial_state;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_next;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_update_state;
import static com.cyc.cycjava.cycl.string_utilities.str;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.subl_promotions.memberP;
import static com.cyc.cycjava.cycl.subl_promotions.non_negative_integer_p;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.cycjava.cycl.variables.error_unless_canonicalize_default_el_vars;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.consp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.function_spec_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.keywordp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.symbolp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.intersection;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_removal;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_abduction;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup;
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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      PREFERENCE-MODULES
 * source file: /cyc/top/cycl/inference/modules/preference-modules.lisp
 * created:     2019/07/03 17:37:38
 */
public final class preference_modules extends SubLTranslatedFile implements V12 {
    public static final SubLObject problem_preference_level_wrt_modules(SubLObject problem, SubLObject strategic_context, SubLObject shared_vars) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(problem, SINGLE_LITERAL_PROBLEM_P);
            {
                SubLObject preference_level = NIL;
                SubLObject justification = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject mt = inference_datastructures_problem.mt_asent_sense_from_single_literal_problem(problem);
                    SubLObject asent = thread.secondMultipleValue();
                    SubLObject sense = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject mt_var = mt;
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                thread.resetMultipleValues();
                                {
                                    SubLObject preference_level_5 = com.cyc.cycjava.cycl.inference.modules.preference_modules.literal_preference_level_wrt_modules(asent, sense, shared_vars, strategic_context);
                                    SubLObject justification_6 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    preference_level = preference_level_5;
                                    justification = justification_6;
                                }
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return values(preference_level, justification);
            }
        }
    }

    public static final SubLFile me = new preference_modules();



    // defvar
    @LispMethod(comment = "defvar")
    private static final SubLSymbol $within_generic_preference_analysisP$ = makeSymbol("*WITHIN-GENERIC-PREFERENCE-ANALYSIS?*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $min_preference_level$ = makeSymbol("*MIN-PREFERENCE-LEVEL*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $max_preference_level$ = makeSymbol("*MAX-PREFERENCE-LEVEL*");

    // deflexical
    @LispMethod(comment = "deflexical")
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
    @LispMethod(comment = "These are sorted from least preferred to most preferred. Disallowed: no\r\nanswers can be generated for the literal as-is, but answers might be\r\ngenerated if the literal were more fully bound. Grossly Dispreferred: many\r\nanswers will probably be missed if the literal is enumerated, but they might\r\nbe testable if the literal were more fully bound. Dispreferred: some answers\r\nmight be missed if the literal is enumerated, but they might be testable if\r\nthe literal were more fully bound. Preferred: everything that\'s decidable is\r\nalso enumerable, i.e. anything that could be proven if the literal were more\r\nfully bound is provable in the current state.\ndeflexical\nThese are sorted from least preferred to most preferred. Disallowed: no\nanswers can be generated for the literal as-is, but answers might be\ngenerated if the literal were more fully bound. Grossly Dispreferred: many\nanswers will probably be missed if the literal is enumerated, but they might\nbe testable if the literal were more fully bound. Dispreferred: some answers\nmight be missed if the literal is enumerated, but they might be testable if\nthe literal were more fully bound. Preferred: everything that\'s decidable is\nalso enumerable, i.e. anything that could be proven if the literal were more\nfully bound is provable in the current state.")
    private static final SubLSymbol $ordered_preference_levels$ = makeSymbol("*ORDERED-PREFERENCE-LEVELS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $preference_module_properties$ = makeSymbol("*PREFERENCE-MODULE-PROPERTIES*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_preference_module$ = makeSymbol("*DTP-PREFERENCE-MODULE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $bindable_vars_lambda$ = makeSymbol("*BINDABLE-VARS-LAMBDA*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $preference_functions_from_must_bind_arg$ = makeSymbol("*PREFERENCE-FUNCTIONS-FROM-MUST-BIND-ARG*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(list(makeSymbol("PREFMOD"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list1 = list($DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    public static final SubLSymbol $generic_preference_modules$ = makeSymbol("*GENERIC-PREFERENCE-MODULES*");

    static private final SubLList $list6 = list(list(makeSymbol("PREFMOD"), makeSymbol("PRED"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol SPECIFIC_PREFERENCE_MODULES_FOR_PRED = makeSymbol("SPECIFIC-PREFERENCE-MODULES-FOR-PRED");

    static private final SubLList $list9 = list(list(makeSymbol("PREFMOD"), makeSymbol("ASENT"), makeSymbol("SENSE"), makeSymbol("BINDABLE-VARS"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym10$PRED = makeUninternedSymbol("PRED");

    private static final SubLSymbol DO_SPECIFIC_PREFERENCE_MODULES_FOR_PRED = makeSymbol("DO-SPECIFIC-PREFERENCE-MODULES-FOR-PRED");

    static private final SubLSymbol $sym15$PREFERENCE_MODULE_RELEVANT_ = makeSymbol("PREFERENCE-MODULE-RELEVANT?");

    private static final SubLSymbol DO_GENERIC_PREFERENCE_MODULES = makeSymbol("DO-GENERIC-PREFERENCE-MODULES");

    private static final SubLSymbol DO_DICTIONARY_VALUES = makeSymbol("DO-DICTIONARY-VALUES");

    public static final SubLSymbol $preference_modules_by_name$ = makeSymbol("*PREFERENCE-MODULES-BY-NAME*");

    private static final SubLSymbol SINGLE_LITERAL_PROBLEM_P = makeSymbol("SINGLE-LITERAL-PROBLEM-P");

    private static final SubLString $$$no_preference_modules_applicable = makeString("no preference modules applicable");

    private static final SubLSymbol PREFERENCE_MODULE_NAME = makeSymbol("PREFERENCE-MODULE-NAME");

    private static final SubLSymbol $sym24$SINGLETON_ = makeSymbol("SINGLETON?");

    private static final SubLList $list25 = list(makeSymbol("DNF-CLAUSE"), makeSymbol("BINDINGS"));

    private static final SubLSymbol POS_ATOMIC_CLAUSE_P = makeSymbol("POS-ATOMIC-CLAUSE-P");







    private static final SubLList $list34 = list(reader_make_constant_shell("SomeFn"), reader_make_constant_shell("Thing"));

    private static final SubLString $$$closed_asent = makeString("closed asent");

    private static final SubLString $$$open_negation = makeString("open negation");

    private static final SubLString $$$no_removal_options = makeString("no removal options");



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

    private static final SubLList $list87 = list($NAME, makeKeyword("PREDICATE"), makeKeyword("SENSE"), makeKeyword("REQUIRED-PATTERN"), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("PREFERENCE-FUNC"), makeKeyword("REQUIRED-MT"), makeKeyword("ANY-PREDICATES"));

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

    static private final SubLList $list121 = list(makeKeyword("PREDICATE"), makeKeyword("SENSE"), makeKeyword("ANY-PREDICATES"), makeKeyword("REQUIRED-PATTERN"), makeKeyword("REQUIRED-MT"), makeKeyword("SUPPLANTS"), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("PREFERENCE"));

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

    private static final SubLList $list170 = list(list(list(list(reader_make_constant_shell("isa"), makeSymbol("?VAR0"), makeSymbol("?VAR1")), makeKeyword("POS"), list(makeSymbol("?VAR0"), makeSymbol("?VAR1")), reader_make_constant_shell("InferencePSC")), makeKeyword("DISALLOWED")), list(list(list(reader_make_constant_shell("isa"), makeSymbol("?VAR0"), reader_make_constant_shell("Thing")), makeKeyword("POS"), list(makeSymbol("?VAR0")), reader_make_constant_shell("InferencePSC")), makeKeyword("GROSSLY-DISPREFERRED")), list(list(list(reader_make_constant_shell("isa"), reader_make_constant_shell("Thing"), makeSymbol("?VAR0")), makeKeyword("POS"), list(makeSymbol("?VAR0")), reader_make_constant_shell("InferencePSC")), makeKeyword("DISPREFERRED")), list(list(list(reader_make_constant_shell("isa"), reader_make_constant_shell("Thing"), reader_make_constant_shell("Thing")), makeKeyword("POS"), NIL, reader_make_constant_shell("InferencePSC")), makeKeyword("PREFERRED")));

    private static final SubLSymbol FULL_KB_EL_LITERAL_PREFERENCE_LEVEL_WRT_MODULES = makeSymbol("FULL-KB-EL-LITERAL-PREFERENCE-LEVEL-WRT-MODULES");

    private static final SubLList $list173 = list(list(list(list(reader_make_constant_shell("likesAsFriend"), reader_make_constant_shell("Muffet"), makeSymbol("?VAR0")), makeKeyword("POS"), list(makeSymbol("?VAR0")), reader_make_constant_shell("InferencePSC")), makeKeyword("PREFERRED")), list(list(list(reader_make_constant_shell("residesInRegion"), reader_make_constant_shell("Muffet"), makeSymbol("?VAR0")), makeKeyword("POS"), list(makeSymbol("?VAR0")), reader_make_constant_shell("InferencePSC")), makeKeyword("PREFERRED")));

    // Definitions
    public static final SubLObject do_generic_preference_modules_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject prefmod = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    prefmod = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt0);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt0);
                            if (NIL == member(current_1, $list_alt1, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt0);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(DO_SET, list(prefmod, $generic_preference_modules$, $DONE, done), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    // Definitions
    public static SubLObject do_generic_preference_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, preference_modules.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject prefmod = NIL;
        destructuring_bind_must_consp(current, datum, preference_modules.$list0);
        prefmod = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, preference_modules.$list0);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, preference_modules.$list0);
            if (NIL == member(current_$1, preference_modules.$list1, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == preference_modules.$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, preference_modules.$list0);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_SET, list(prefmod, preference_modules.$generic_preference_modules$, $DONE, done), append(body, NIL));
    }

    public static final SubLObject do_specific_preference_modules_for_pred_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt6);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject prefmod = NIL;
                    SubLObject pred = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt6);
                    prefmod = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt6);
                    pred = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_2 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt6);
                            current_2 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt6);
                            if (NIL == member(current_2, $list_alt1, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_2 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt6);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(CSOME, list(prefmod, list(SPECIFIC_PREFERENCE_MODULES_FOR_PRED, pred), done), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_specific_preference_modules_for_pred(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, preference_modules.$list6);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject prefmod = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, preference_modules.$list6);
        prefmod = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, preference_modules.$list6);
        pred = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, preference_modules.$list6);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, preference_modules.$list6);
            if (NIL == member(current_$2, preference_modules.$list1, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == preference_modules.$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, preference_modules.$list6);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(CSOME, list(prefmod, list(preference_modules.SPECIFIC_PREFERENCE_MODULES_FOR_PRED, pred), done), append(body, NIL));
    }

    /**
     *
     *
     * @unknown PREFMOD to each preference module that's relevant to ASENT with SENSE and BINDABLE-VARS.
     */
    @LispMethod(comment = "@unknown PREFMOD to each preference module that\'s relevant to ASENT with SENSE and BINDABLE-VARS.")
    public static final SubLObject do_relevant_preference_modules_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt9);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject prefmod = NIL;
                    SubLObject asent = NIL;
                    SubLObject sense = NIL;
                    SubLObject bindable_vars = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt9);
                    prefmod = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt9);
                    asent = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt9);
                    sense = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt9);
                    bindable_vars = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_3 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt9);
                            current_3 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt9);
                            if (NIL == member(current_3, $list_alt1, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_3 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt9);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject pred = $sym10$PRED;
                                return list(CLET, list(list(pred, list(ATOMIC_SENTENCE_PREDICATE, asent))), list(DO_SPECIFIC_PREFERENCE_MODULES_FOR_PRED, list(prefmod, pred, $DONE, done), listS(PWHEN, list($sym15$PREFERENCE_MODULE_RELEVANT_, prefmod, asent, sense, bindable_vars), append(body, NIL))), list(DO_GENERIC_PREFERENCE_MODULES, list(prefmod, $DONE, done), listS(PWHEN, list($sym15$PREFERENCE_MODULE_RELEVANT_, prefmod, asent, sense, bindable_vars), append(body, NIL))));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @unknown PREFMOD to each preference module that's relevant to ASENT with SENSE and BINDABLE-VARS.
     */
    @LispMethod(comment = "@unknown PREFMOD to each preference module that\'s relevant to ASENT with SENSE and BINDABLE-VARS.")
    public static SubLObject do_relevant_preference_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, preference_modules.$list9);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject prefmod = NIL;
        SubLObject asent = NIL;
        SubLObject sense = NIL;
        SubLObject bindable_vars = NIL;
        destructuring_bind_must_consp(current, datum, preference_modules.$list9);
        prefmod = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, preference_modules.$list9);
        asent = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, preference_modules.$list9);
        sense = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, preference_modules.$list9);
        bindable_vars = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$3 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, preference_modules.$list9);
            current_$3 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, preference_modules.$list9);
            if (NIL == member(current_$3, preference_modules.$list1, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$3 == preference_modules.$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, preference_modules.$list9);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject pred = preference_modules.$sym10$PRED;
        return list(CLET, list(list(pred, list(ATOMIC_SENTENCE_PREDICATE, asent))), list(preference_modules.DO_SPECIFIC_PREFERENCE_MODULES_FOR_PRED, list(prefmod, pred, $DONE, done), listS(PWHEN, list(preference_modules.$sym15$PREFERENCE_MODULE_RELEVANT_, prefmod, asent, sense, bindable_vars), append(body, NIL))), list(preference_modules.DO_GENERIC_PREFERENCE_MODULES, list(prefmod, $DONE, done), listS(PWHEN, list(preference_modules.$sym15$PREFERENCE_MODULE_RELEVANT_, prefmod, asent, sense, bindable_vars), append(body, NIL))));
    }

    public static final SubLObject do_preference_modules_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject prefmod = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    prefmod = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_4 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt0);
                            current_4 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt0);
                            if (NIL == member(current_4, $list_alt1, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_4 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt0);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(DO_DICTIONARY_VALUES, list(prefmod, $preference_modules_by_name$, $DONE, done), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_preference_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, preference_modules.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject prefmod = NIL;
        destructuring_bind_must_consp(current, datum, preference_modules.$list0);
        prefmod = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$4 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, preference_modules.$list0);
            current_$4 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, preference_modules.$list0);
            if (NIL == member(current_$4, preference_modules.$list1, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$4 == preference_modules.$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, preference_modules.$list0);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(preference_modules.DO_DICTIONARY_VALUES, list(prefmod, preference_modules.$preference_modules_by_name$, $DONE, done), append(body, NIL));
    }

    public static SubLObject single_literal_problem_preference_level_wrt_modules(final SubLObject problem, final SubLObject strategic_context, final SubLObject shared_vars) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_problem.single_literal_problem_p(problem) : "! inference_datastructures_problem.single_literal_problem_p(problem) " + ("inference_datastructures_problem.single_literal_problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.single_literal_problem_p(problem) ") + problem;
        SubLObject preference_level = NIL;
        SubLObject justification = NIL;
        thread.resetMultipleValues();
        final SubLObject mt = inference_datastructures_problem.mt_asent_sense_from_single_literal_problem(problem);
        final SubLObject asent = thread.secondMultipleValue();
        final SubLObject sense = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = $mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $relevant_mts$.currentBinding(thread);
        try {
            $mt$.bind(update_inference_mt_relevance_mt(mt_var), thread);
            $relevant_mt_function$.bind(update_inference_mt_relevance_function(mt_var), thread);
            $relevant_mts$.bind(update_inference_mt_relevance_mt_list(mt_var), thread);
            thread.resetMultipleValues();
            final SubLObject preference_level_$5 = preference_modules.literal_preference_level_wrt_modules(asent, sense, shared_vars, strategic_context);
            final SubLObject justification_$6 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            preference_level = preference_level_$5;
            justification = justification_$6;
        } finally {
            $relevant_mts$.rebind(_prev_bind_3, thread);
            $relevant_mt_function$.rebind(_prev_bind_2, thread);
            $mt$.rebind(_prev_bind_0, thread);
        }
        return values(preference_level, justification);
    }

    public static final SubLObject literal_preference_level_wrt_modules_alt(SubLObject asent, SubLObject sense, SubLObject bindable_vars, SubLObject strategic_context) {
        {
            SubLObject min_preference_level = $PREFERRED;
            SubLObject justification = $$$no_preference_modules_applicable;
            SubLObject disallowedP = NIL;
            if (NIL != bindable_vars) {
                {
                    SubLObject relevant_modules = com.cyc.cycjava.cycl.inference.modules.preference_modules.all_relevant_preference_modules(asent, sense, bindable_vars);
                    SubLObject rest = NIL;
                    for (rest = relevant_modules; !((NIL != disallowedP) || (NIL == rest)); rest = rest.rest()) {
                        {
                            SubLObject prefmod = rest.first();
                            SubLObject preference_level = com.cyc.cycjava.cycl.inference.modules.preference_modules.preference_module_compute_preference_level(prefmod, asent, bindable_vars, strategic_context);
                            if (NIL != preference_level) {
                                if (NIL != com.cyc.cycjava.cycl.inference.modules.preference_modules.preference_level_L(preference_level, min_preference_level)) {
                                    min_preference_level = preference_level;
                                    justification = string_utilities.str(com.cyc.cycjava.cycl.inference.modules.preference_modules.preference_module_name(prefmod));
                                }
                                if ($DISALLOWED == preference_level) {
                                    disallowedP = T;
                                }
                            }
                        }
                    }
                }
            }
            return values(min_preference_level, justification);
        }
    }

    public static SubLObject literal_preference_level_wrt_modules(final SubLObject asent, final SubLObject sense, final SubLObject bindable_vars, final SubLObject strategic_context) {
        SubLObject min_preference_level = preference_modules.$min_preference_level$.getGlobalValue();
        SubLObject justification = preference_modules.$$$no_preference_modules_applicable;
        SubLObject disallowedP = NIL;
        if (NIL != bindable_vars) {
            final SubLObject relevant_modules = preference_modules.all_relevant_preference_modules(asent, sense, bindable_vars);
            SubLObject rest;
            SubLObject prefmod;
            SubLObject preference_level;
            for (rest = NIL, rest = relevant_modules; (NIL == disallowedP) && (NIL != rest); rest = rest.rest()) {
                prefmod = rest.first();
                preference_level = preference_modules.preference_module_compute_preference_level(prefmod, asent, bindable_vars, strategic_context);
                if (NIL != preference_level) {
                    if (NIL != preference_modules.preference_level_L(preference_level, min_preference_level)) {
                        min_preference_level = preference_level;
                        justification = str(preference_modules.preference_module_name(prefmod));
                    }
                    if ($DISALLOWED == preference_level) {
                        disallowedP = T;
                    }
                }
            }
        }
        return values(min_preference_level, justification);
    }

    public static final SubLObject all_relevant_preference_modules_alt(SubLObject asent, SubLObject sense, SubLObject bindable_vars) {
        {
            SubLObject candidate_modules = NIL;
            SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
            {
                SubLObject csome_list_var = com.cyc.cycjava.cycl.inference.modules.preference_modules.specific_preference_modules_for_pred(pred);
                SubLObject prefmod = NIL;
                for (prefmod = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , prefmod = csome_list_var.first()) {
                    if (NIL != com.cyc.cycjava.cycl.inference.modules.preference_modules.preference_module_relevantP(prefmod, asent, sense, bindable_vars)) {
                        candidate_modules = cons(prefmod, candidate_modules);
                    }
                }
            }
            {
                SubLObject set_contents_var = set.do_set_internal($generic_preference_modules$.getGlobalValue());
                SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                SubLObject state = NIL;
                for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    {
                        SubLObject prefmod = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, prefmod)) {
                            if (NIL != com.cyc.cycjava.cycl.inference.modules.preference_modules.preference_module_relevantP(prefmod, asent, sense, bindable_vars)) {
                                candidate_modules = cons(prefmod, candidate_modules);
                            }
                        }
                    }
                }
            }
            {
                SubLObject relevant_modules = NIL;
                SubLObject supplanted_module_names = NIL;
                SubLObject cdolist_list_var = candidate_modules;
                SubLObject candidate_module = NIL;
                for (candidate_module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , candidate_module = cdolist_list_var.first()) {
                    if (!(($ALL == supplanted_module_names) || (NIL != list_utilities.member_eqP(com.cyc.cycjava.cycl.inference.modules.preference_modules.preference_module_name(candidate_module), supplanted_module_names)))) {
                        if (NIL != com.cyc.cycjava.cycl.inference.modules.preference_modules.preference_module_exclusiveP(candidate_module)) {
                            {
                                SubLObject supplants_spec = com.cyc.cycjava.cycl.inference.modules.preference_modules.preference_module_supplants(candidate_module);
                                if ($ALL == supplants_spec) {
                                    supplanted_module_names = $ALL;
                                    relevant_modules = NIL;
                                } else {
                                    {
                                        SubLObject cdolist_list_var_7 = supplants_spec;
                                        SubLObject supplanted_module_name = NIL;
                                        for (supplanted_module_name = cdolist_list_var_7.first(); NIL != cdolist_list_var_7; cdolist_list_var_7 = cdolist_list_var_7.rest() , supplanted_module_name = cdolist_list_var_7.first()) {
                                            relevant_modules = delete(supplanted_module_name, relevant_modules, symbol_function(EQ), symbol_function(PREFERENCE_MODULE_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            {
                                                SubLObject item_var = supplanted_module_name;
                                                if (NIL == member(item_var, supplanted_module_names, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                    supplanted_module_names = cons(item_var, supplanted_module_names);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        relevant_modules = cons(candidate_module, relevant_modules);
                    }
                }
                return relevant_modules;
            }
        }
    }

    public static SubLObject all_relevant_preference_modules(final SubLObject asent, final SubLObject sense, final SubLObject bindable_vars) {
        SubLObject candidate_modules = NIL;
        final SubLObject pred = atomic_sentence_predicate(asent);
        SubLObject csome_list_var = preference_modules.specific_preference_modules_for_pred(pred);
        SubLObject prefmod = NIL;
        prefmod = csome_list_var.first();
        while (NIL != csome_list_var) {
            if (NIL != preference_modules.preference_module_relevantP(prefmod, asent, sense, bindable_vars)) {
                candidate_modules = cons(prefmod, candidate_modules);
            }
            csome_list_var = csome_list_var.rest();
            prefmod = csome_list_var.first();
        } 
        final SubLObject set_contents_var = do_set_internal(preference_modules.$generic_preference_modules$.getGlobalValue());
        SubLObject basis_object;
        SubLObject state;
        SubLObject prefmod2;
        for (basis_object = do_set_contents_basis_object(set_contents_var), state = NIL, state = do_set_contents_initial_state(basis_object, set_contents_var); NIL == do_set_contents_doneP(basis_object, state); state = do_set_contents_update_state(state)) {
            prefmod2 = do_set_contents_next(basis_object, state);
            if ((NIL != do_set_contents_element_validP(state, prefmod2)) && (NIL != preference_modules.preference_module_relevantP(prefmod2, asent, sense, bindable_vars))) {
                candidate_modules = cons(prefmod2, candidate_modules);
            }
        }
        SubLObject relevant_modules = NIL;
        SubLObject supplanted_module_names = NIL;
        SubLObject cdolist_list_var = candidate_modules;
        SubLObject candidate_module = NIL;
        candidate_module = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (($ALL != supplanted_module_names) && (NIL == member_eqP(preference_modules.preference_module_name(candidate_module), supplanted_module_names))) {
                if (NIL != preference_modules.preference_module_exclusiveP(candidate_module)) {
                    final SubLObject supplants_spec = preference_modules.preference_module_supplants(candidate_module);
                    if ($ALL == supplants_spec) {
                        supplanted_module_names = $ALL;
                        relevant_modules = NIL;
                    } else {
                        SubLObject cdolist_list_var_$7 = supplants_spec;
                        SubLObject supplanted_module_name = NIL;
                        supplanted_module_name = cdolist_list_var_$7.first();
                        while (NIL != cdolist_list_var_$7) {
                            relevant_modules = delete(supplanted_module_name, relevant_modules, symbol_function(EQ), symbol_function(preference_modules.PREFERENCE_MODULE_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED);
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

    public static final SubLObject el_literal_preference_level_wrt_modules_alt(SubLObject el_asent, SubLObject sense, SubLObject el_bindable_vars, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject preference_level = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject czer_results = czer_main.canonicalize_query_sentence(el_asent, UNPROVIDED);
                            SubLTrampolineFile.checkType(czer_results, $sym25$SINGLETON_);
                            {
                                SubLObject czer_result = czer_results.first();
                                SubLObject datum = czer_result;
                                SubLObject current = datum;
                                SubLObject dnf_clause = NIL;
                                SubLObject v_bindings = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt26);
                                dnf_clause = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt26);
                                v_bindings = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    SubLTrampolineFile.checkType(dnf_clause, POS_ATOMIC_CLAUSE_P);
                                    {
                                        SubLObject hl_asent = clause_utilities.atomic_clause_asent(dnf_clause);
                                        SubLObject hl_bindable_vars = bindings.apply_bindings(v_bindings, el_bindable_vars);
                                        preference_level = com.cyc.cycjava.cycl.inference.modules.preference_modules.literal_preference_level_wrt_modules(hl_asent, sense, hl_bindable_vars, $TACTICAL);
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt26);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return preference_level;
            }
        }
    }

    public static SubLObject el_literal_preference_level_wrt_modules(final SubLObject el_asent, final SubLObject sense, final SubLObject el_bindable_vars, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preference_level = NIL;
        final SubLObject _prev_bind_0 = $mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $relevant_mts$.currentBinding(thread);
        try {
            $mt$.bind(update_inference_mt_relevance_mt(mt), thread);
            $relevant_mt_function$.bind(update_inference_mt_relevance_function(mt), thread);
            $relevant_mts$.bind(update_inference_mt_relevance_mt_list(mt), thread);
            final SubLObject czer_results = canonicalize_query_sentence(el_asent, UNPROVIDED);
            assert NIL != singletonP(czer_results) : "! list_utilities.singletonP(czer_results) " + ("list_utilities.singletonP(czer_results) " + "CommonSymbols.NIL != list_utilities.singletonP(czer_results) ") + czer_results;
            final SubLObject czer_result = czer_results.first();
            SubLObject current;
            final SubLObject datum = current = czer_result;
            SubLObject dnf_clause = NIL;
            SubLObject v_bindings = NIL;
            destructuring_bind_must_consp(current, datum, preference_modules.$list25);
            dnf_clause = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, preference_modules.$list25);
            v_bindings = current.first();
            current = current.rest();
            if (NIL == current) {
                assert NIL != pos_atomic_clause_p(dnf_clause) : "! clause_utilities.pos_atomic_clause_p(dnf_clause) " + ("clause_utilities.pos_atomic_clause_p(dnf_clause) " + "CommonSymbols.NIL != clause_utilities.pos_atomic_clause_p(dnf_clause) ") + dnf_clause;
                final SubLObject hl_asent = atomic_clause_asent(dnf_clause);
                final SubLObject hl_bindable_vars = apply_bindings(v_bindings, el_bindable_vars);
                preference_level = preference_modules.literal_preference_level_wrt_modules(hl_asent, sense, hl_bindable_vars, $TACTICAL);
            } else {
                cdestructuring_bind_error(datum, preference_modules.$list25);
            }
        } finally {
            $relevant_mts$.rebind(_prev_bind_3, thread);
            $relevant_mt_function$.rebind(_prev_bind_2, thread);
            $mt$.rebind(_prev_bind_0, thread);
        }
        return preference_level;
    }

    public static SubLObject statically_sort_conjunct_literals(final SubLObject literals, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return preference_modules.statically_sort_conjunct_literals_recursive(literals, mt, NIL);
    }

    public static SubLObject statically_sort_conjunct_literals_recursive(final SubLObject literals, final SubLObject mt, final SubLObject reverse_sorted_literals) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == literals) {
            return nreverse(reverse_sorted_literals);
        }
        thread.resetMultipleValues();
        final SubLObject next_literal = preference_modules.statically_select_next_conjunct_literal(literals, reverse_sorted_literals);
        final SubLObject remaining_literals = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return preference_modules.statically_sort_conjunct_literals_recursive(remaining_literals, mt, cons(next_literal, reverse_sorted_literals));
    }

    public static SubLObject statically_select_next_conjunct_literal(final SubLObject literals, final SubLObject reverse_sorted_literals) {
        if (NIL != singletonP(literals)) {
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
            final SubLObject candidate_asent = (NIL != negatedP(candidate_literal)) ? negate(candidate_literal) : candidate_literal;
            final SubLObject candidate_sense = (NIL != negatedP(candidate_literal)) ? $NEG : $POS;
            final SubLObject analysis_asent = preference_modules.compute_analysis_asent_wrt_static_sort(candidate_asent, bound_literal_vars);
            final SubLObject candidate_preference = preference_modules.literal_preference_level_wrt_static_sort(analysis_asent, candidate_sense, bindable_vars);
            final SubLObject candidate_cost = preference_modules.literal_removal_cost_wrt_static_sort(analysis_asent, candidate_sense);
            if (($UNSPECIFIED.eql(best_preference) || (NIL != preference_modules.preference_level_G(candidate_preference, best_preference))) || (candidate_preference.equal(best_preference) && candidate_cost.numL(best_cost))) {
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
            final SubLObject predicate = atomic_sentence_predicate(asent);
            final SubLObject generic_term = preference_modules.compute_generic_term_for_bound_argument_of_predicate(predicate);
            SubLObject cdolist_list_var = bound_literal_vars;
            SubLObject bound_var = NIL;
            bound_var = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != simple_tree_findP(bound_var, asent)) {
                    asent = subst(generic_term, bound_var, asent, symbol_function(EQL), UNPROVIDED);
                }
                cdolist_list_var = cdolist_list_var.rest();
                bound_var = cdolist_list_var.first();
            } 
        }
        return asent;
    }

    public static SubLObject compute_generic_term_for_bound_argument_of_predicate(final SubLObject predicate) {
        if (predicate.eql(preference_modules.$$isa) || predicate.eql(preference_modules.$$genls)) {
            return preference_modules.$$Thing;
        }
        return preference_modules.$list34;
    }

    public static SubLObject within_generic_preference_analysisP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return preference_modules.$within_generic_preference_analysisP$.getDynamicValue(thread);
    }

    public static SubLObject literal_preference_level_wrt_static_sort(final SubLObject asent, final SubLObject sense, final SubLObject bindable_vars) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != variables.fully_bound_p(asent)) {
            return values($PREFERRED, preference_modules.$$$closed_asent);
        }
        if ((sense == $NEG) && (NIL != bindable_vars)) {
            return values($DISALLOWED, preference_modules.$$$open_negation);
        }
        if (NIL == inference_worker_removal.literal_removal_options(asent, sense, UNPROVIDED)) {
            return values($DISALLOWED, preference_modules.$$$no_removal_options);
        }
        SubLObject preference = NIL;
        SubLObject reason = NIL;
        final SubLObject _prev_bind_0 = preference_modules.$within_generic_preference_analysisP$.currentBinding(thread);
        try {
            preference_modules.$within_generic_preference_analysisP$.bind(T, thread);
            thread.resetMultipleValues();
            final SubLObject preference_$8 = preference_modules.literal_preference_level_wrt_modules(asent, sense, bindable_vars, $TACTICAL);
            final SubLObject reason_$9 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            preference = preference_$8;
            reason = reason_$9;
        } finally {
            preference_modules.$within_generic_preference_analysisP$.rebind(_prev_bind_0, thread);
        }
        return values(preference, reason);
    }

    public static SubLObject literal_removal_cost_wrt_static_sort(final SubLObject asent, final SubLObject sense) {
        return inference_utilities.literal_removal_cost(asent, sense, preference_modules.$$EverythingPSC, removal_modules_abduction.abductive_modules_not_allowed_spec());
    }

    public static final SubLObject preference_level_string_alt(SubLObject preference_level) {
        if (NIL != preference_level) {
            SubLTrampolineFile.checkType(preference_level, PREFERENCE_LEVEL_P);
        }
        {
            SubLObject pcase_var = preference_level;
            if (pcase_var.eql($PREFERRED)) {
                return $$$Preferred;
            } else {
                if (pcase_var.eql($DISPREFERRED)) {
                    return $$$Dispreferred;
                } else {
                    if (pcase_var.eql($GROSSLY_DISPREFERRED)) {
                        return $$$Grossly_Dispreferred;
                    } else {
                        if (pcase_var.eql($DISALLOWED)) {
                            return $$$Disallowed;
                        } else {
                            if (pcase_var.eql(NIL)) {
                                return $$$Undetermined;
                            } else {
                                Errors.error($str_alt38$Unexpected_preference_level__a, preference_level);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject preference_level_string(final SubLObject preference_level) {
        if (((NIL != preference_level) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == preference_modules.preference_level_p(preference_level))) {
            throw new AssertionError(preference_level);
        }
        if (preference_level.eql($PREFERRED)) {
            return preference_modules.$$$Preferred;
        }
        if (preference_level.eql($DISPREFERRED)) {
            return preference_modules.$$$Dispreferred;
        }
        if (preference_level.eql($GROSSLY_DISPREFERRED)) {
            return preference_modules.$$$Grossly_Dispreferred;
        }
        if (preference_level.eql($DISALLOWED)) {
            return preference_modules.$$$Disallowed;
        }
        if (preference_level.eql($DOOMED)) {
            return preference_modules.$$$Doomed;
        }
        if (preference_level.eql(NIL)) {
            return preference_modules.$$$Undetermined;
        }
        Errors.error(preference_modules.$str51$Unexpected_preference_level__a, preference_level);
        return NIL;
    }

    public static final SubLObject preference_level_p_alt(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $ordered_preference_levels$.getGlobalValue());
    }

    public static SubLObject preference_level_p(final SubLObject v_object) {
        return member_eqP(v_object, preference_modules.$ordered_preference_levels$.getGlobalValue());
    }

    public static final SubLObject disallowed_preference_level_p_alt(SubLObject v_object) {
        return eq($DISALLOWED, v_object);
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

    /**
     *
     *
     * @return boolean; t iff PREFERENCE-LEVEL1 is _less_ preferred than PREFERENCE-LEVEL2.
     */
    @LispMethod(comment = "@return boolean; t iff PREFERENCE-LEVEL1 is _less_ preferred than PREFERENCE-LEVEL2.")
    public static final SubLObject preference_level_L_alt(SubLObject preference_level1, SubLObject preference_level2) {
        SubLTrampolineFile.checkType(preference_level1, PREFERENCE_LEVEL_P);
        SubLTrampolineFile.checkType(preference_level2, PREFERENCE_LEVEL_P);
        return list_utilities.position_L(preference_level1, preference_level2, $ordered_preference_levels$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return boolean; t iff PREFERENCE-LEVEL1 is _less_ preferred than PREFERENCE-LEVEL2.
     */
    @LispMethod(comment = "@return boolean; t iff PREFERENCE-LEVEL1 is _less_ preferred than PREFERENCE-LEVEL2.")
    public static SubLObject preference_level_L(final SubLObject preference_level1, final SubLObject preference_level2) {
        assert NIL != preference_modules.preference_level_p(preference_level1) : "! preference_modules.preference_level_p(preference_level1) " + ("preference_modules.preference_level_p(preference_level1) " + "CommonSymbols.NIL != preference_modules.preference_level_p(preference_level1) ") + preference_level1;
        assert NIL != preference_modules.preference_level_p(preference_level2) : "! preference_modules.preference_level_p(preference_level2) " + ("preference_modules.preference_level_p(preference_level2) " + "CommonSymbols.NIL != preference_modules.preference_level_p(preference_level2) ") + preference_level2;
        return position_L(preference_level1, preference_level2, preference_modules.$ordered_preference_levels$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return boolean; t iff PREFERENCE-LEVEL1 is _more_ preferred than PREFERENCE-LEVEL2.
     */
    @LispMethod(comment = "@return boolean; t iff PREFERENCE-LEVEL1 is _more_ preferred than PREFERENCE-LEVEL2.")
    public static final SubLObject preference_level_G_alt(SubLObject preference_level1, SubLObject preference_level2) {
        return com.cyc.cycjava.cycl.inference.modules.preference_modules.preference_level_L(preference_level2, preference_level1);
    }

    /**
     *
     *
     * @return boolean; t iff PREFERENCE-LEVEL1 is _more_ preferred than PREFERENCE-LEVEL2.
     */
    @LispMethod(comment = "@return boolean; t iff PREFERENCE-LEVEL1 is _more_ preferred than PREFERENCE-LEVEL2.")
    public static SubLObject preference_level_G(final SubLObject preference_level1, final SubLObject preference_level2) {
        return preference_modules.preference_level_L(preference_level2, preference_level1);
    }

    public static final SubLObject preference_level_LE_alt(SubLObject preference_level1, SubLObject preference_level2) {
        return makeBoolean(NIL == com.cyc.cycjava.cycl.inference.modules.preference_modules.preference_level_G(preference_level1, preference_level2));
    }

    public static SubLObject preference_level_LE(final SubLObject preference_level1, final SubLObject preference_level2) {
        return makeBoolean(NIL == preference_modules.preference_level_G(preference_level1, preference_level2));
    }

    public static final SubLObject preference_level_GE_alt(SubLObject preference_level1, SubLObject preference_level2) {
        return makeBoolean(NIL == com.cyc.cycjava.cycl.inference.modules.preference_modules.preference_level_L(preference_level1, preference_level2));
    }

    public static SubLObject preference_level_GE(final SubLObject preference_level1, final SubLObject preference_level2) {
        return makeBoolean(NIL == preference_modules.preference_level_L(preference_level1, preference_level2));
    }

    /**
     *
     *
     * @return preference-level-p; the least preferred preference-level in PREFERENCE-LEVEL-LIST
     */
    @LispMethod(comment = "@return preference-level-p; the least preferred preference-level in PREFERENCE-LEVEL-LIST")
    public static final SubLObject min_preference_level_alt(SubLObject preference_level_list) {
        return NIL != preference_level_list ? ((SubLObject) (list_utilities.extremal(preference_level_list, $sym39$PREFERENCE_LEVEL__, UNPROVIDED))) : last($ordered_preference_levels$.getGlobalValue(), UNPROVIDED).first();
    }

    /**
     *
     *
     * @return preference-level-p; the least preferred preference-level in PREFERENCE-LEVEL-LIST
     */
    @LispMethod(comment = "@return preference-level-p; the least preferred preference-level in PREFERENCE-LEVEL-LIST")
    public static SubLObject min_preference_level(final SubLObject preference_level_list) {
        return NIL != preference_level_list ? extremal(preference_level_list, preference_modules.$sym52$PREFERENCE_LEVEL__, UNPROVIDED) : last(preference_modules.$ordered_preference_levels$.getGlobalValue(), UNPROVIDED).first();
    }

    public static final SubLObject min2_preference_level_alt(SubLObject preference_level1, SubLObject preference_level2) {
        return NIL != com.cyc.cycjava.cycl.inference.modules.preference_modules.preference_level_L(preference_level2, preference_level1) ? ((SubLObject) (preference_level2)) : preference_level1;
    }

    public static SubLObject min2_preference_level(final SubLObject preference_level1, final SubLObject preference_level2) {
        return NIL != preference_modules.preference_level_L(preference_level2, preference_level1) ? preference_level2 : preference_level1;
    }

    /**
     *
     *
     * @return preference-level-p; the most preferred preference-level in PREFERENCE-LEVEL-LIST
     */
    @LispMethod(comment = "@return preference-level-p; the most preferred preference-level in PREFERENCE-LEVEL-LIST")
    public static final SubLObject max_preference_level_alt(SubLObject preference_level_list) {
        return NIL != preference_level_list ? ((SubLObject) (list_utilities.extremal(preference_level_list, $sym40$PREFERENCE_LEVEL__, UNPROVIDED))) : $ordered_preference_levels$.getGlobalValue().first();
    }

    /**
     *
     *
     * @return preference-level-p; the most preferred preference-level in PREFERENCE-LEVEL-LIST
     */
    @LispMethod(comment = "@return preference-level-p; the most preferred preference-level in PREFERENCE-LEVEL-LIST")
    public static SubLObject max_preference_level(final SubLObject preference_level_list) {
        return NIL != preference_level_list ? extremal(preference_level_list, preference_modules.$sym53$PREFERENCE_LEVEL__, UNPROVIDED) : preference_modules.$ordered_preference_levels$.getGlobalValue().first();
    }

    public static final SubLObject max2_preference_level_alt(SubLObject preference_level1, SubLObject preference_level2) {
        return NIL != com.cyc.cycjava.cycl.inference.modules.preference_modules.preference_level_L(preference_level2, preference_level1) ? ((SubLObject) (preference_level1)) : preference_level2;
    }

    public static SubLObject max2_preference_level(final SubLObject preference_level1, final SubLObject preference_level2) {
        return NIL != preference_modules.preference_level_L(preference_level2, preference_level1) ? preference_level1 : preference_level2;
    }

    /**
     *
     *
     * @unknown This function should go away soon.
     */
    @LispMethod(comment = "@unknown This function should go away soon.")
    public static final SubLObject completeness_to_preference_level_alt(SubLObject completeness) {
        {
            SubLObject pcase_var = completeness;
            if (pcase_var.eql($COMPLETE)) {
                return $PREFERRED;
            } else {
                if (pcase_var.eql($INCOMPLETE)) {
                    return $DISPREFERRED;
                } else {
                    if (pcase_var.eql($GROSSLY_INCOMPLETE)) {
                        return $GROSSLY_DISPREFERRED;
                    } else {
                        if (pcase_var.eql($IMPOSSIBLE)) {
                            return $DISALLOWED;
                        } else {
                            return Errors.error($str_alt45$unexpected_completeness__s, completeness);
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @unknown This function should go away soon.
     */
    @LispMethod(comment = "@unknown This function should go away soon.")
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
        return Errors.error(preference_modules.$str58$unexpected_completeness__s, completeness);
    }

    /**
     *
     *
     * @unknown This function should go away soon.
     */
    @LispMethod(comment = "@unknown This function should go away soon.")
    public static final SubLObject preference_level_to_completeness_alt(SubLObject preference_level) {
        {
            SubLObject pcase_var = preference_level;
            if (pcase_var.eql($PREFERRED)) {
                return $COMPLETE;
            } else {
                if (pcase_var.eql($DISPREFERRED)) {
                    return $INCOMPLETE;
                } else {
                    if (pcase_var.eql($GROSSLY_DISPREFERRED)) {
                        return $GROSSLY_INCOMPLETE;
                    } else {
                        if (pcase_var.eql($DISALLOWED)) {
                            return $IMPOSSIBLE;
                        } else {
                            return Errors.error($str_alt46$unexpected_preference_level__s, preference_level);
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @unknown This function should go away soon.
     */
    @LispMethod(comment = "@unknown This function should go away soon.")
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
        return Errors.error(preference_modules.$str59$unexpected_preference_level__s, preference_level);
    }

    public static final SubLObject preference_module_property_p_alt(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $preference_module_properties$.getGlobalValue());
    }

    public static SubLObject preference_module_property_p(final SubLObject v_object) {
        return member_eqP(v_object, preference_modules.$preference_module_properties$.getGlobalValue());
    }

    /**
     *
     *
     * @return t or throw an error
     */
    @LispMethod(comment = "@return t or throw an error")
    public static final SubLObject check_preference_module_properties_alt(SubLObject plist) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject remainder = NIL;
                for (remainder = plist; NIL != remainder; remainder = cddr(remainder)) {
                    {
                        SubLObject property = remainder.first();
                        SubLObject value = cadr(remainder);
                        SubLTrampolineFile.checkType(property, PREFERENCE_MODULE_PROPERTY_P);
                        {
                            SubLObject pcase_var = property;
                            if (pcase_var.eql($PREDICATE)) {
                                SubLTrampolineFile.checkType(value, FORT_P);
                            } else {
                                if (pcase_var.eql($SENSE)) {
                                    SubLTrampolineFile.checkType(value, SENSE_P);
                                } else {
                                    if (pcase_var.eql($REQUIRED_PATTERN)) {
                                        SubLTrampolineFile.checkType(value, CONSP);
                                    } else {
                                        if (pcase_var.eql($REQUIRED_MT)) {
                                            SubLTrampolineFile.checkType(value, HLMT_P);
                                        } else {
                                            if (pcase_var.eql($ANY_PREDICATES)) {
                                                SubLTrampolineFile.checkType(value, LISTP);
                                            } else {
                                                if (pcase_var.eql($EXCLUSIVE)) {
                                                    SubLTrampolineFile.checkType(value, FUNCTION_SPEC_P);
                                                } else {
                                                    if (pcase_var.eql($SUPPLANTS)) {
                                                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                                            if (!((value == $ALL) || ((NIL != list_utilities.proper_list_p(value)) && (NIL != list_utilities.every_in_list(SYMBOLP, value, UNPROVIDED))))) {
                                                                Errors.error($str_alt63$invalid__supplants_value__s, value);
                                                            }
                                                        }
                                                    } else {
                                                        if (pcase_var.eql($PREFERENCE_LEVEL)) {
                                                            SubLTrampolineFile.checkType(value, PREFERENCE_LEVEL_P);
                                                        } else {
                                                            if (pcase_var.eql($PREFERENCE)) {
                                                                SubLTrampolineFile.checkType(value, SYMBOLP);
                                                            } else {
                                                                Errors.error($str_alt66$unexpected_preference_module_prop, property);
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
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == getf(plist, $SENSE, UNPROVIDED)) {
                    Errors.error($str_alt67$_s_must_specify__sense);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (makeBoolean(NIL == getf(plist, $PREFERENCE_LEVEL, UNPROVIDED)) == makeBoolean(NIL == getf(plist, $PREFERENCE, UNPROVIDED))) {
                    Errors.error($str_alt68$_s_must_specify_exactly_one_of__p, plist);
                }
            }
            return T;
        }
    }

    /**
     *
     *
     * @return t or throw an error
     */
    @LispMethod(comment = "@return t or throw an error")
    public static SubLObject check_preference_module_properties(final SubLObject plist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        SubLObject pcase_var;
        for (remainder = NIL, remainder = plist; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            assert NIL != preference_modules.preference_module_property_p(property) : "! preference_modules.preference_module_property_p(property) " + ("preference_modules.preference_module_property_p(property) " + "CommonSymbols.NIL != preference_modules.preference_module_property_p(property) ") + property;
            pcase_var = property;
            if (pcase_var.eql($PREDICATE)) {
                assert NIL != forts.fort_p(value) : "! forts.fort_p(value) " + ("forts.fort_p(value) " + "CommonSymbols.NIL != forts.fort_p(value) ") + value;
            } else
                if (pcase_var.eql($SENSE)) {
                    assert NIL != enumeration_types.sense_p(value) : "! enumeration_types.sense_p(value) " + ("enumeration_types.sense_p(value) " + "CommonSymbols.NIL != enumeration_types.sense_p(value) ") + value;
                } else
                    if (pcase_var.eql($REQUIRED_PATTERN)) {
                        assert NIL != consp(value) : "! consp(value) " + ("Types.consp(value) " + "CommonSymbols.NIL != Types.consp(value) ") + value;
                    } else
                        if (pcase_var.eql($REQUIRED_MT)) {
                            assert NIL != fort_or_possibly_naut_p(value) : "! cycl_utilities.fort_or_possibly_naut_p(value) " + ("cycl_utilities.fort_or_possibly_naut_p(value) " + "CommonSymbols.NIL != cycl_utilities.fort_or_possibly_naut_p(value) ") + value;
                        } else
                            if (pcase_var.eql($ANY_PREDICATES)) {
                                assert NIL != listp(value) : "! listp(value) " + ("Types.listp(value) " + "CommonSymbols.NIL != Types.listp(value) ") + value;
                            } else
                                if (pcase_var.eql($EXCLUSIVE)) {
                                    assert NIL != function_spec_p(value) : "! function_spec_p(value) " + ("Types.function_spec_p(value) " + "CommonSymbols.NIL != Types.function_spec_p(value) ") + value;
                                } else
                                    if (pcase_var.eql($SUPPLANTS)) {
                                        if (((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (value != $ALL)) && ((NIL == proper_list_p(value)) || (NIL == every_in_list(SYMBOLP, value, UNPROVIDED)))) {
                                            Errors.error(preference_modules.$str76$invalid__supplants_value__s, value);
                                        }
                                    } else
                                        if (pcase_var.eql($PREFERENCE_LEVEL)) {
                                            assert NIL != preference_modules.preference_level_p(value) : "! preference_modules.preference_level_p(value) " + ("preference_modules.preference_level_p(value) " + "CommonSymbols.NIL != preference_modules.preference_level_p(value) ") + value;
                                        } else
                                            if (pcase_var.eql($PREFERENCE)) {
                                                assert NIL != symbolp(value) : "! symbolp(value) " + ("Types.symbolp(value) " + "CommonSymbols.NIL != Types.symbolp(value) ") + value;
                                            } else {
                                                Errors.error(preference_modules.$str79$unexpected_preference_module_prop, property);
                                            }








        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == getf(plist, $SENSE, UNPROVIDED))) {
            Errors.error(preference_modules.$str80$_s_must_specify__sense, plist);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && makeBoolean(NIL == getf(plist, $PREFERENCE_LEVEL, UNPROVIDED)).eql(makeBoolean(NIL == getf(plist, $PREFERENCE, UNPROVIDED)))) {
            Errors.error(preference_modules.$str81$_s_must_specify_exactly_one_of__p, plist);
        }
        return T;
    }

    /**
     *
     *
     * @unknown called by reclassify-removal-modules
     */
    @LispMethod(comment = "@unknown called by reclassify-removal-modules")
    public static final SubLObject reclassify_preference_modules_alt() {
        dictionary.dictionary_rebuild($specific_preference_modules$.getGlobalValue());
        return NIL;
    }

    /**
     *
     *
     * @unknown called by reclassify-removal-modules
     */
    @LispMethod(comment = "@unknown called by reclassify-removal-modules")
    public static SubLObject reclassify_preference_modules() {
        dictionary_rebuild(preference_modules.$specific_preference_modules$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject generic_preference_modules_alt() {
        return set.set_element_list($generic_preference_modules$.getGlobalValue());
    }

    public static SubLObject generic_preference_modules() {
        return set_element_list(preference_modules.$generic_preference_modules$.getGlobalValue());
    }

    public static final SubLObject generic_preference_module_count_alt() {
        return set.set_size($generic_preference_modules$.getGlobalValue());
    }

    public static SubLObject generic_preference_module_count() {
        return set_size(preference_modules.$generic_preference_modules$.getGlobalValue());
    }

    public static final SubLObject specific_preference_module_count_alt() {
        return dictionary.dictionary_length($specific_preference_modules$.getGlobalValue());
    }

    public static SubLObject specific_preference_module_count() {
        return dictionary_length(preference_modules.$specific_preference_modules$.getGlobalValue());
    }

    public static final SubLObject preference_module_count_alt() {
        return add(com.cyc.cycjava.cycl.inference.modules.preference_modules.generic_preference_module_count(), com.cyc.cycjava.cycl.inference.modules.preference_modules.specific_preference_module_count());
    }

    public static SubLObject preference_module_count() {
        return add(preference_modules.generic_preference_module_count(), preference_modules.specific_preference_module_count());
    }

    public static final SubLObject specific_preference_module_predicates_alt() {
        return dictionary.dictionary_keys($specific_preference_modules$.getGlobalValue());
    }

    public static SubLObject specific_preference_module_predicates() {
        return dictionary_keys(preference_modules.$specific_preference_modules$.getGlobalValue());
    }

    public static final SubLObject specific_preference_modules_for_pred_alt(SubLObject pred) {
        return dictionary.dictionary_lookup_without_values($specific_preference_modules$.getGlobalValue(), pred, UNPROVIDED);
    }

    public static SubLObject specific_preference_modules_for_pred(final SubLObject pred) {
        return dictionary_lookup_without_values(preference_modules.$specific_preference_modules$.getGlobalValue(), pred, UNPROVIDED);
    }

    public static final SubLObject predicate_has_specific_preference_modulesP_alt(SubLObject predicate) {
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.inference.modules.preference_modules.specific_preference_modules_for_pred(predicate));
    }

    public static SubLObject predicate_has_specific_preference_modulesP(final SubLObject predicate) {
        return sublisp_boolean(preference_modules.specific_preference_modules_for_pred(predicate));
    }

    public static final SubLObject note_preference_module_supplants_alt(SubLObject prefmod, SubLObject supplants) {
        if (NIL == supplants) {
            dictionary.dictionary_remove($preference_module_supplants$.getGlobalValue(), prefmod);
        } else {
            dictionary.dictionary_enter($preference_module_supplants$.getGlobalValue(), prefmod, supplants);
        }
        return prefmod;
    }

    public static SubLObject note_preference_module_supplants(final SubLObject prefmod, final SubLObject supplants) {
        if (NIL == supplants) {
            dictionary_remove(preference_modules.$preference_module_supplants$.getGlobalValue(), prefmod);
        } else {
            dictionary_enter(preference_modules.$preference_module_supplants$.getGlobalValue(), prefmod, supplants);
        }
        return prefmod;
    }

    public static final SubLObject preference_module_exclusiveP_alt(SubLObject prefmod) {
        return list_utilities.sublisp_boolean(dictionary.dictionary_lookup_without_values($preference_module_supplants$.getGlobalValue(), prefmod, NIL));
    }

    public static SubLObject preference_module_exclusiveP(final SubLObject prefmod) {
        return sublisp_boolean(dictionary_lookup_without_values(preference_modules.$preference_module_supplants$.getGlobalValue(), prefmod, NIL));
    }

    public static final SubLObject preference_module_supplants_alt(SubLObject prefmod) {
        return dictionary.dictionary_lookup_without_values($preference_module_supplants$.getGlobalValue(), prefmod, NIL);
    }

    public static SubLObject preference_module_supplants(final SubLObject prefmod) {
        return dictionary_lookup_without_values(preference_modules.$preference_module_supplants$.getGlobalValue(), prefmod, NIL);
    }

    public static final SubLObject deregister_preference_module_alt(SubLObject prefmod) {
        {
            SubLObject pred = com.cyc.cycjava.cycl.inference.modules.preference_modules.preference_module_predicate(prefmod);
            if (NIL != pred) {
                dictionary_utilities.dictionary_delete_from_value($specific_preference_modules$.getGlobalValue(), pred, prefmod, UNPROVIDED, UNPROVIDED);
            }
        }
        set.set_remove(prefmod, $generic_preference_modules$.getGlobalValue());
        dictionary.dictionary_remove($preference_modules_by_name$.getGlobalValue(), com.cyc.cycjava.cycl.inference.modules.preference_modules.preference_module_name(prefmod));
        return NIL;
    }

    public static SubLObject deregister_preference_module(final SubLObject prefmod) {
        final SubLObject pred = preference_modules.preference_module_predicate(prefmod);
        if (NIL != pred) {
            dictionary_delete_from_value(preference_modules.$specific_preference_modules$.getGlobalValue(), pred, prefmod, UNPROVIDED, UNPROVIDED);
        }
        set_remove(prefmod, preference_modules.$generic_preference_modules$.getGlobalValue());
        dictionary_remove(preference_modules.$preference_modules_by_name$.getGlobalValue(), preference_modules.preference_module_name(prefmod));
        return NIL;
    }

    public static final SubLObject register_preference_module_alt(SubLObject prefmod) {
        dictionary.dictionary_enter($preference_modules_by_name$.getGlobalValue(), com.cyc.cycjava.cycl.inference.modules.preference_modules.preference_module_name(prefmod), prefmod);
        {
            SubLObject predicate = com.cyc.cycjava.cycl.inference.modules.preference_modules.preference_module_predicate(prefmod);
            if (NIL != predicate) {
                dictionary_utilities.dictionary_push($specific_preference_modules$.getGlobalValue(), predicate, prefmod);
            } else {
                set.set_add(prefmod, $generic_preference_modules$.getGlobalValue());
            }
        }
        return prefmod;
    }

    public static SubLObject register_preference_module(final SubLObject prefmod) {
        dictionary_enter(preference_modules.$preference_modules_by_name$.getGlobalValue(), preference_modules.preference_module_name(prefmod), prefmod);
        final SubLObject predicate = preference_modules.preference_module_predicate(prefmod);
        if (NIL != predicate) {
            dictionary_push(preference_modules.$specific_preference_modules$.getGlobalValue(), predicate, prefmod);
        } else {
            set_add(prefmod, preference_modules.$generic_preference_modules$.getGlobalValue());
        }
        return prefmod;
    }

    public static SubLObject deregister_all_preference_modules_for_predicate(final SubLObject predicate) {
        SubLObject count = ZERO_INTEGER;
        SubLObject cdolist_list_var = preference_modules.specific_preference_modules_for_pred(predicate);
        SubLObject prefmod = NIL;
        prefmod = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            preference_modules.deregister_preference_module(prefmod);
            count = add(count, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            prefmod = cdolist_list_var.first();
        } 
        return count;
    }

    public static final SubLObject preference_module_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        com.cyc.cycjava.cycl.inference.modules.preference_modules.print_preference_module(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject preference_module_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        preference_modules.print_preference_module(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject preference_module_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.inference.modules.preference_modules.$preference_module_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject preference_module_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.inference.modules.preference_modules.$preference_module_native.class ? T : NIL;
    }

    public static final SubLObject pref_mod_name_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PREFERENCE_MODULE_P);
        return v_object.getField2();
    }

    public static SubLObject pref_mod_name(final SubLObject v_object) {
        assert NIL != preference_modules.preference_module_p(v_object) : "! preference_modules.preference_module_p(v_object) " + "preference_modules.preference_module_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject pref_mod_predicate_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PREFERENCE_MODULE_P);
        return v_object.getField3();
    }

    public static SubLObject pref_mod_predicate(final SubLObject v_object) {
        assert NIL != preference_modules.preference_module_p(v_object) : "! preference_modules.preference_module_p(v_object) " + "preference_modules.preference_module_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject pref_mod_sense_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PREFERENCE_MODULE_P);
        return v_object.getField4();
    }

    public static SubLObject pref_mod_sense(final SubLObject v_object) {
        assert NIL != preference_modules.preference_module_p(v_object) : "! preference_modules.preference_module_p(v_object) " + "preference_modules.preference_module_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject pref_mod_required_pattern_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PREFERENCE_MODULE_P);
        return v_object.getField5();
    }

    public static SubLObject pref_mod_required_pattern(final SubLObject v_object) {
        assert NIL != preference_modules.preference_module_p(v_object) : "! preference_modules.preference_module_p(v_object) " + "preference_modules.preference_module_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject pref_mod_preference_level_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PREFERENCE_MODULE_P);
        return v_object.getField6();
    }

    public static SubLObject pref_mod_preference_level(final SubLObject v_object) {
        assert NIL != preference_modules.preference_module_p(v_object) : "! preference_modules.preference_module_p(v_object) " + "preference_modules.preference_module_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject pref_mod_preference_func_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PREFERENCE_MODULE_P);
        return v_object.getField7();
    }

    public static SubLObject pref_mod_preference_func(final SubLObject v_object) {
        assert NIL != preference_modules.preference_module_p(v_object) : "! preference_modules.preference_module_p(v_object) " + "preference_modules.preference_module_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject pref_mod_required_mt_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PREFERENCE_MODULE_P);
        return v_object.getField8();
    }

    public static SubLObject pref_mod_required_mt(final SubLObject v_object) {
        assert NIL != preference_modules.preference_module_p(v_object) : "! preference_modules.preference_module_p(v_object) " + "preference_modules.preference_module_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject pref_mod_any_predicates_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PREFERENCE_MODULE_P);
        return v_object.getField9();
    }

    public static SubLObject pref_mod_any_predicates(final SubLObject v_object) {
        assert NIL != preference_modules.preference_module_p(v_object) : "! preference_modules.preference_module_p(v_object) " + "preference_modules.preference_module_p error :" + v_object;
        return v_object.getField9();
    }

    public static final SubLObject _csetf_pref_mod_name_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PREFERENCE_MODULE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_pref_mod_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != preference_modules.preference_module_p(v_object) : "! preference_modules.preference_module_p(v_object) " + "preference_modules.preference_module_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_pref_mod_predicate_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PREFERENCE_MODULE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_pref_mod_predicate(final SubLObject v_object, final SubLObject value) {
        assert NIL != preference_modules.preference_module_p(v_object) : "! preference_modules.preference_module_p(v_object) " + "preference_modules.preference_module_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_pref_mod_sense_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PREFERENCE_MODULE_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_pref_mod_sense(final SubLObject v_object, final SubLObject value) {
        assert NIL != preference_modules.preference_module_p(v_object) : "! preference_modules.preference_module_p(v_object) " + "preference_modules.preference_module_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_pref_mod_required_pattern_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PREFERENCE_MODULE_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_pref_mod_required_pattern(final SubLObject v_object, final SubLObject value) {
        assert NIL != preference_modules.preference_module_p(v_object) : "! preference_modules.preference_module_p(v_object) " + "preference_modules.preference_module_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_pref_mod_preference_level_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PREFERENCE_MODULE_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_pref_mod_preference_level(final SubLObject v_object, final SubLObject value) {
        assert NIL != preference_modules.preference_module_p(v_object) : "! preference_modules.preference_module_p(v_object) " + "preference_modules.preference_module_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_pref_mod_preference_func_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PREFERENCE_MODULE_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_pref_mod_preference_func(final SubLObject v_object, final SubLObject value) {
        assert NIL != preference_modules.preference_module_p(v_object) : "! preference_modules.preference_module_p(v_object) " + "preference_modules.preference_module_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_pref_mod_required_mt_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PREFERENCE_MODULE_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_pref_mod_required_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != preference_modules.preference_module_p(v_object) : "! preference_modules.preference_module_p(v_object) " + "preference_modules.preference_module_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_pref_mod_any_predicates_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PREFERENCE_MODULE_P);
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_pref_mod_any_predicates(final SubLObject v_object, final SubLObject value) {
        assert NIL != preference_modules.preference_module_p(v_object) : "! preference_modules.preference_module_p(v_object) " + "preference_modules.preference_module_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static final SubLObject make_preference_module_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.inference.modules.preference_modules.$preference_module_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($NAME)) {
                        com.cyc.cycjava.cycl.inference.modules.preference_modules._csetf_pref_mod_name(v_new, current_value);
                    } else {
                        if (pcase_var.eql($PREDICATE)) {
                            com.cyc.cycjava.cycl.inference.modules.preference_modules._csetf_pref_mod_predicate(v_new, current_value);
                        } else {
                            if (pcase_var.eql($SENSE)) {
                                com.cyc.cycjava.cycl.inference.modules.preference_modules._csetf_pref_mod_sense(v_new, current_value);
                            } else {
                                if (pcase_var.eql($REQUIRED_PATTERN)) {
                                    com.cyc.cycjava.cycl.inference.modules.preference_modules._csetf_pref_mod_required_pattern(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($PREFERENCE_LEVEL)) {
                                        com.cyc.cycjava.cycl.inference.modules.preference_modules._csetf_pref_mod_preference_level(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($PREFERENCE_FUNC)) {
                                            com.cyc.cycjava.cycl.inference.modules.preference_modules._csetf_pref_mod_preference_func(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($REQUIRED_MT)) {
                                                com.cyc.cycjava.cycl.inference.modules.preference_modules._csetf_pref_mod_required_mt(v_new, current_value);
                                            } else {
                                                if (pcase_var.eql($ANY_PREDICATES)) {
                                                    com.cyc.cycjava.cycl.inference.modules.preference_modules._csetf_pref_mod_any_predicates(v_new, current_value);
                                                } else {
                                                    Errors.error($str_alt97$Invalid_slot__S_for_construction_, current_arg);
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

    public static SubLObject make_preference_module(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.inference.modules.preference_modules.$preference_module_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($NAME)) {
                preference_modules._csetf_pref_mod_name(v_new, current_value);
            } else
                if (pcase_var.eql($PREDICATE)) {
                    preference_modules._csetf_pref_mod_predicate(v_new, current_value);
                } else
                    if (pcase_var.eql($SENSE)) {
                        preference_modules._csetf_pref_mod_sense(v_new, current_value);
                    } else
                        if (pcase_var.eql($REQUIRED_PATTERN)) {
                            preference_modules._csetf_pref_mod_required_pattern(v_new, current_value);
                        } else
                            if (pcase_var.eql($PREFERENCE_LEVEL)) {
                                preference_modules._csetf_pref_mod_preference_level(v_new, current_value);
                            } else
                                if (pcase_var.eql($PREFERENCE_FUNC)) {
                                    preference_modules._csetf_pref_mod_preference_func(v_new, current_value);
                                } else
                                    if (pcase_var.eql($REQUIRED_MT)) {
                                        preference_modules._csetf_pref_mod_required_mt(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($ANY_PREDICATES)) {
                                            preference_modules._csetf_pref_mod_any_predicates(v_new, current_value);
                                        } else {
                                            Errors.error(preference_modules.$str111$Invalid_slot__S_for_construction_, current_arg);
                                        }







        }
        return v_new;
    }

    public static SubLObject visit_defstruct_preference_module(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, preference_modules.MAKE_PREFERENCE_MODULE, EIGHT_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $NAME, preference_modules.pref_mod_name(obj));
        funcall(visitor_fn, obj, $SLOT, $PREDICATE, preference_modules.pref_mod_predicate(obj));
        funcall(visitor_fn, obj, $SLOT, $SENSE, preference_modules.pref_mod_sense(obj));
        funcall(visitor_fn, obj, $SLOT, $REQUIRED_PATTERN, preference_modules.pref_mod_required_pattern(obj));
        funcall(visitor_fn, obj, $SLOT, $PREFERENCE_LEVEL, preference_modules.pref_mod_preference_level(obj));
        funcall(visitor_fn, obj, $SLOT, $PREFERENCE_FUNC, preference_modules.pref_mod_preference_func(obj));
        funcall(visitor_fn, obj, $SLOT, $REQUIRED_MT, preference_modules.pref_mod_required_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $ANY_PREDICATES, preference_modules.pref_mod_any_predicates(obj));
        funcall(visitor_fn, obj, $END, preference_modules.MAKE_PREFERENCE_MODULE, EIGHT_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_preference_module_method(final SubLObject obj, final SubLObject visitor_fn) {
        return preference_modules.visit_defstruct_preference_module(obj, visitor_fn);
    }

    public static final SubLObject print_preference_module_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt98$_PREFMOD__a_, com.cyc.cycjava.cycl.inference.modules.preference_modules.pref_mod_name(v_object));
        return NIL;
    }

    public static SubLObject print_preference_module(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, preference_modules.$str117$_PREFMOD__a_, preference_modules.pref_mod_name(v_object));
        return NIL;
    }

    public static final SubLObject sxhash_preference_module_method_alt(SubLObject v_object) {
        return Sxhash.sxhash(com.cyc.cycjava.cycl.inference.modules.preference_modules.pref_mod_name(v_object));
    }

    public static SubLObject sxhash_preference_module_method(final SubLObject v_object) {
        return Sxhash.sxhash(preference_modules.pref_mod_name(v_object));
    }

    /**
     *
     *
     * @return nil or preference-module-p
     */
    @LispMethod(comment = "@return nil or preference-module-p")
    public static final SubLObject find_preference_module_alt(SubLObject name) {
        SubLTrampolineFile.checkType(name, KEYWORDP);
        return dictionary.dictionary_lookup_without_values($preference_modules_by_name$.getGlobalValue(), name, UNPROVIDED);
    }

    /**
     *
     *
     * @return nil or preference-module-p
     */
    @LispMethod(comment = "@return nil or preference-module-p")
    public static SubLObject find_preference_module(final SubLObject name) {
        assert NIL != keywordp(name) : "! keywordp(name) " + ("Types.keywordp(name) " + "CommonSymbols.NIL != Types.keywordp(name) ") + name;
        return dictionary_lookup_without_values(preference_modules.$preference_modules_by_name$.getGlobalValue(), name, UNPROVIDED);
    }

    public static final SubLObject inference_preference_module_alt(SubLObject name, SubLObject plist) {
        SubLTrampolineFile.checkType(name, KEYWORDP);
        com.cyc.cycjava.cycl.inference.modules.preference_modules.check_preference_module_properties(plist);
        {
            SubLObject prefmod = com.cyc.cycjava.cycl.inference.modules.preference_modules.find_preference_module(name);
            if (NIL != prefmod) {
                com.cyc.cycjava.cycl.inference.modules.preference_modules.deregister_preference_module(prefmod);
            } else {
                prefmod = com.cyc.cycjava.cycl.inference.modules.preference_modules.make_preference_module(UNPROVIDED);
            }
            {
                SubLObject datum = plist;
                SubLObject current = datum;
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_8 = NIL;
                for (; NIL != rest;) {
                    destructuring_bind_must_consp(rest, datum, $list_alt101);
                    current_8 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list_alt101);
                    if (NIL == member(current_8, $list_alt102, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_8 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list_alt101);
                }
                {
                    SubLObject predicate_tail = property_list_member($PREDICATE, current);
                    SubLObject predicate = (NIL != predicate_tail) ? ((SubLObject) (cadr(predicate_tail))) : NIL;
                    SubLObject sense_tail = property_list_member($SENSE, current);
                    SubLObject sense = (NIL != sense_tail) ? ((SubLObject) (cadr(sense_tail))) : NIL;
                    SubLObject any_predicates_tail = property_list_member($ANY_PREDICATES, current);
                    SubLObject any_predicates = (NIL != any_predicates_tail) ? ((SubLObject) (cadr(any_predicates_tail))) : NIL;
                    SubLObject required_pattern_tail = property_list_member($REQUIRED_PATTERN, current);
                    SubLObject required_pattern = (NIL != required_pattern_tail) ? ((SubLObject) (cadr(required_pattern_tail))) : NIL;
                    SubLObject required_mt_tail = property_list_member($REQUIRED_MT, current);
                    SubLObject required_mt = (NIL != required_mt_tail) ? ((SubLObject) (cadr(required_mt_tail))) : NIL;
                    SubLObject supplants_tail = property_list_member($SUPPLANTS, current);
                    SubLObject supplants = (NIL != supplants_tail) ? ((SubLObject) (cadr(supplants_tail))) : NIL;
                    SubLObject preference_level_tail = property_list_member($PREFERENCE_LEVEL, current);
                    SubLObject preference_level = (NIL != preference_level_tail) ? ((SubLObject) (cadr(preference_level_tail))) : NIL;
                    SubLObject preference_tail = property_list_member($PREFERENCE, current);
                    SubLObject preference = (NIL != preference_tail) ? ((SubLObject) (cadr(preference_tail))) : NIL;
                    com.cyc.cycjava.cycl.inference.modules.preference_modules._csetf_pref_mod_name(prefmod, name);
                    com.cyc.cycjava.cycl.inference.modules.preference_modules._csetf_pref_mod_predicate(prefmod, predicate);
                    com.cyc.cycjava.cycl.inference.modules.preference_modules._csetf_pref_mod_any_predicates(prefmod, any_predicates);
                    com.cyc.cycjava.cycl.inference.modules.preference_modules._csetf_pref_mod_sense(prefmod, sense);
                    com.cyc.cycjava.cycl.inference.modules.preference_modules._csetf_pref_mod_required_pattern(prefmod, required_pattern);
                    com.cyc.cycjava.cycl.inference.modules.preference_modules._csetf_pref_mod_required_mt(prefmod, required_mt);
                    com.cyc.cycjava.cycl.inference.modules.preference_modules._csetf_pref_mod_preference_level(prefmod, preference_level);
                    com.cyc.cycjava.cycl.inference.modules.preference_modules._csetf_pref_mod_preference_func(prefmod, preference);
                    com.cyc.cycjava.cycl.inference.modules.preference_modules.note_preference_module_supplants(prefmod, supplants);
                }
            }
            com.cyc.cycjava.cycl.inference.modules.preference_modules.register_preference_module(prefmod);
            return prefmod;
        }
    }

    public static SubLObject inference_preference_module(final SubLObject name, final SubLObject plist) {
        assert NIL != keywordp(name) : "! keywordp(name) " + ("Types.keywordp(name) " + "CommonSymbols.NIL != Types.keywordp(name) ") + name;
        preference_modules.check_preference_module_properties(plist);
        SubLObject prefmod = preference_modules.find_preference_module(name);
        if (NIL != prefmod) {
            preference_modules.deregister_preference_module(prefmod);
        } else {
            prefmod = preference_modules.make_preference_module(UNPROVIDED);
        }
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = plist;
        SubLObject bad = NIL;
        SubLObject current_$10 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, plist, preference_modules.$list120);
            current_$10 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, plist, preference_modules.$list120);
            if (NIL == member(current_$10, preference_modules.$list121, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$10 == preference_modules.$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(plist, preference_modules.$list120);
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
        preference_modules._csetf_pref_mod_name(prefmod, name);
        preference_modules._csetf_pref_mod_predicate(prefmod, predicate);
        preference_modules._csetf_pref_mod_any_predicates(prefmod, any_predicates);
        preference_modules._csetf_pref_mod_sense(prefmod, sense);
        preference_modules._csetf_pref_mod_required_pattern(prefmod, required_pattern);
        preference_modules._csetf_pref_mod_required_mt(prefmod, required_mt);
        preference_modules._csetf_pref_mod_preference_level(prefmod, preference_level);
        preference_modules._csetf_pref_mod_preference_func(prefmod, preference);
        preference_modules.note_preference_module_supplants(prefmod, supplants);
        preference_modules.register_preference_module(prefmod);
        return prefmod;
    }

    public static final SubLObject undeclare_inference_preference_module_alt(SubLObject name) {
        {
            SubLObject prefmod = com.cyc.cycjava.cycl.inference.modules.preference_modules.find_preference_module(name);
            if (NIL != prefmod) {
                com.cyc.cycjava.cycl.inference.modules.preference_modules.deregister_preference_module(prefmod);
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject undeclare_inference_preference_module(final SubLObject name) {
        final SubLObject prefmod = preference_modules.find_preference_module(name);
        if (NIL != prefmod) {
            preference_modules.deregister_preference_module(prefmod);
            return T;
        }
        return NIL;
    }

    public static final SubLObject preference_module_name_alt(SubLObject prefmod) {
        SubLTrampolineFile.checkType(prefmod, PREFERENCE_MODULE_P);
        return com.cyc.cycjava.cycl.inference.modules.preference_modules.pref_mod_name(prefmod);
    }

    public static SubLObject preference_module_name(final SubLObject prefmod) {
        assert NIL != preference_modules.preference_module_p(prefmod) : "! preference_modules.preference_module_p(prefmod) " + ("preference_modules.preference_module_p(prefmod) " + "CommonSymbols.NIL != preference_modules.preference_module_p(prefmod) ") + prefmod;
        return preference_modules.pref_mod_name(prefmod);
    }

    public static final SubLObject preference_module_predicate_alt(SubLObject prefmod) {
        SubLTrampolineFile.checkType(prefmod, PREFERENCE_MODULE_P);
        return com.cyc.cycjava.cycl.inference.modules.preference_modules.pref_mod_predicate(prefmod);
    }

    public static SubLObject preference_module_predicate(final SubLObject prefmod) {
        assert NIL != preference_modules.preference_module_p(prefmod) : "! preference_modules.preference_module_p(prefmod) " + ("preference_modules.preference_module_p(prefmod) " + "CommonSymbols.NIL != preference_modules.preference_module_p(prefmod) ") + prefmod;
        return preference_modules.pref_mod_predicate(prefmod);
    }

    public static final SubLObject preference_module_any_predicates_alt(SubLObject prefmod) {
        SubLTrampolineFile.checkType(prefmod, PREFERENCE_MODULE_P);
        return com.cyc.cycjava.cycl.inference.modules.preference_modules.pref_mod_any_predicates(prefmod);
    }

    public static SubLObject preference_module_any_predicates(final SubLObject prefmod) {
        assert NIL != preference_modules.preference_module_p(prefmod) : "! preference_modules.preference_module_p(prefmod) " + ("preference_modules.preference_module_p(prefmod) " + "CommonSymbols.NIL != preference_modules.preference_module_p(prefmod) ") + prefmod;
        return preference_modules.pref_mod_any_predicates(prefmod);
    }

    public static final SubLObject preference_module_sense_alt(SubLObject prefmod) {
        SubLTrampolineFile.checkType(prefmod, PREFERENCE_MODULE_P);
        return com.cyc.cycjava.cycl.inference.modules.preference_modules.pref_mod_sense(prefmod);
    }

    public static SubLObject preference_module_sense(final SubLObject prefmod) {
        assert NIL != preference_modules.preference_module_p(prefmod) : "! preference_modules.preference_module_p(prefmod) " + ("preference_modules.preference_module_p(prefmod) " + "CommonSymbols.NIL != preference_modules.preference_module_p(prefmod) ") + prefmod;
        return preference_modules.pref_mod_sense(prefmod);
    }

    public static final SubLObject preference_module_required_pattern_alt(SubLObject prefmod) {
        SubLTrampolineFile.checkType(prefmod, PREFERENCE_MODULE_P);
        return com.cyc.cycjava.cycl.inference.modules.preference_modules.pref_mod_required_pattern(prefmod);
    }

    public static SubLObject preference_module_required_pattern(final SubLObject prefmod) {
        assert NIL != preference_modules.preference_module_p(prefmod) : "! preference_modules.preference_module_p(prefmod) " + ("preference_modules.preference_module_p(prefmod) " + "CommonSymbols.NIL != preference_modules.preference_module_p(prefmod) ") + prefmod;
        return preference_modules.pref_mod_required_pattern(prefmod);
    }

    public static final SubLObject preference_module_required_mt_alt(SubLObject prefmod) {
        SubLTrampolineFile.checkType(prefmod, PREFERENCE_MODULE_P);
        return com.cyc.cycjava.cycl.inference.modules.preference_modules.pref_mod_required_mt(prefmod);
    }

    public static SubLObject preference_module_required_mt(final SubLObject prefmod) {
        assert NIL != preference_modules.preference_module_p(prefmod) : "! preference_modules.preference_module_p(prefmod) " + ("preference_modules.preference_module_p(prefmod) " + "CommonSymbols.NIL != preference_modules.preference_module_p(prefmod) ") + prefmod;
        return preference_modules.pref_mod_required_mt(prefmod);
    }

    public static final SubLObject preference_module_preference_level_alt(SubLObject prefmod) {
        SubLTrampolineFile.checkType(prefmod, PREFERENCE_MODULE_P);
        return com.cyc.cycjava.cycl.inference.modules.preference_modules.pref_mod_preference_level(prefmod);
    }

    public static SubLObject preference_module_preference_level(final SubLObject prefmod) {
        assert NIL != preference_modules.preference_module_p(prefmod) : "! preference_modules.preference_module_p(prefmod) " + ("preference_modules.preference_module_p(prefmod) " + "CommonSymbols.NIL != preference_modules.preference_module_p(prefmod) ") + prefmod;
        return preference_modules.pref_mod_preference_level(prefmod);
    }

    public static final SubLObject preference_module_preference_func_alt(SubLObject prefmod) {
        SubLTrampolineFile.checkType(prefmod, PREFERENCE_MODULE_P);
        return com.cyc.cycjava.cycl.inference.modules.preference_modules.pref_mod_preference_func(prefmod);
    }

    public static SubLObject preference_module_preference_func(final SubLObject prefmod) {
        assert NIL != preference_modules.preference_module_p(prefmod) : "! preference_modules.preference_module_p(prefmod) " + ("preference_modules.preference_module_p(prefmod) " + "CommonSymbols.NIL != preference_modules.preference_module_p(prefmod) ") + prefmod;
        return preference_modules.pref_mod_preference_func(prefmod);
    }

    public static final SubLObject cb_display_preference_module_info_alt(SubLObject prefmod) {
        {
            SubLObject name = com.cyc.cycjava.cycl.inference.modules.preference_modules.preference_module_name(prefmod);
            html_princ($str_alt103$module_);
            html_princ_strong(name);
            html_newline(UNPROVIDED);
        }
        {
            SubLObject sense = com.cyc.cycjava.cycl.inference.modules.preference_modules.preference_module_sense(prefmod);
            html_princ($str_alt104$sense___);
            html_princ(sense);
            html_newline(UNPROVIDED);
        }
        {
            SubLObject pred = com.cyc.cycjava.cycl.inference.modules.preference_modules.preference_module_predicate(prefmod);
            if (NIL != pred) {
                html_princ($str_alt105$predicate___);
                cb_form(pred, UNPROVIDED, UNPROVIDED);
                html_newline(UNPROVIDED);
            }
        }
        {
            SubLObject any_preds = com.cyc.cycjava.cycl.inference.modules.preference_modules.preference_module_any_predicates(prefmod);
            if (NIL != any_preds) {
                html_princ($str_alt106$any_predicates___);
                cb_form(any_preds, UNPROVIDED, UNPROVIDED);
                html_newline(UNPROVIDED);
            }
        }
        {
            SubLObject required_pattern = com.cyc.cycjava.cycl.inference.modules.preference_modules.preference_module_required_pattern(prefmod);
            if (NIL != required_pattern) {
                html_princ($str_alt107$required_pattern___);
                cb_form(required_pattern, UNPROVIDED, UNPROVIDED);
                html_newline(UNPROVIDED);
            }
        }
        {
            SubLObject required_mt = com.cyc.cycjava.cycl.inference.modules.preference_modules.preference_module_required_mt(prefmod);
            if (NIL != required_mt) {
                html_princ($str_alt108$required_mt___);
                cb_form(required_mt, UNPROVIDED, UNPROVIDED);
                html_newline(UNPROVIDED);
            }
        }
        {
            SubLObject preference_level = com.cyc.cycjava.cycl.inference.modules.preference_modules.preference_module_preference_level(prefmod);
            if (NIL != preference_level) {
                html_princ($str_alt109$preference_level___);
                html_princ(preference_level);
                html_newline(UNPROVIDED);
            }
        }
        {
            SubLObject preference_func = com.cyc.cycjava.cycl.inference.modules.preference_modules.preference_module_preference_func(prefmod);
            if (NIL != preference_func) {
                html_princ($str_alt110$preference_function___);
                html_princ(preference_func);
                html_newline(UNPROVIDED);
            }
        }
        html_newline(UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_display_preference_module_info(final SubLObject prefmod) {
        final SubLObject name = preference_modules.preference_module_name(prefmod);
        html_princ(preference_modules.$$$module_);
        html_princ_strong(name);
        html_newline(UNPROVIDED);
        final SubLObject sense = preference_modules.preference_module_sense(prefmod);
        html_princ(preference_modules.$str123$sense___);
        html_princ(sense);
        html_newline(UNPROVIDED);
        final SubLObject pred = preference_modules.preference_module_predicate(prefmod);
        if (NIL != pred) {
            html_princ(preference_modules.$str124$predicate___);
            cb_form(pred, UNPROVIDED, UNPROVIDED);
            html_newline(UNPROVIDED);
        }
        final SubLObject any_preds = preference_modules.preference_module_any_predicates(prefmod);
        if (NIL != any_preds) {
            html_princ(preference_modules.$str125$any_predicates___);
            cb_form(any_preds, UNPROVIDED, UNPROVIDED);
            html_newline(UNPROVIDED);
        }
        final SubLObject required_pattern = preference_modules.preference_module_required_pattern(prefmod);
        if (NIL != required_pattern) {
            html_princ(preference_modules.$str126$required_pattern___);
            cb_form(required_pattern, UNPROVIDED, UNPROVIDED);
            html_newline(UNPROVIDED);
        }
        final SubLObject required_mt = preference_modules.preference_module_required_mt(prefmod);
        if (NIL != required_mt) {
            html_princ(preference_modules.$str127$required_mt___);
            cb_form(required_mt, UNPROVIDED, UNPROVIDED);
            html_newline(UNPROVIDED);
        }
        final SubLObject preference_level = preference_modules.preference_module_preference_level(prefmod);
        if (NIL != preference_level) {
            html_princ(preference_modules.$str128$preference_level___);
            html_princ(preference_level);
            html_newline(UNPROVIDED);
        }
        final SubLObject preference_func = preference_modules.preference_module_preference_func(prefmod);
        if (NIL != preference_func) {
            html_princ(preference_modules.$str129$preference_function___);
            html_princ(preference_func);
            html_newline(UNPROVIDED);
        }
        html_newline(UNPROVIDED);
        return NIL;
    }

    public static final SubLObject preference_module_relevantP_alt(SubLObject prefmod, SubLObject asent, SubLObject sense, SubLObject bindable_vars) {
        if (NIL != com.cyc.cycjava.cycl.inference.modules.preference_modules.preference_module_predicate_matchP(prefmod, cycl_utilities.atomic_sentence_predicate(asent))) {
            if (NIL != com.cyc.cycjava.cycl.inference.modules.preference_modules.preference_module_sense_matchP(prefmod, sense)) {
                if (NIL != com.cyc.cycjava.cycl.inference.modules.preference_modules.preference_module_required_pattern_matchP(prefmod, asent, bindable_vars)) {
                    if (NIL != com.cyc.cycjava.cycl.inference.modules.preference_modules.preference_module_required_mt_matchP(prefmod)) {
                        return T;
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject preference_module_relevantP(final SubLObject prefmod, final SubLObject asent, final SubLObject sense, final SubLObject bindable_vars) {
        if ((((NIL != preference_modules.preference_module_predicate_matchP(prefmod, atomic_sentence_predicate(asent))) && (NIL != preference_modules.preference_module_sense_matchP(prefmod, sense))) && (NIL != preference_modules.preference_module_required_pattern_matchP(prefmod, asent, bindable_vars))) && (NIL != preference_modules.preference_module_required_mt_matchP(prefmod))) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject preference_module_predicate_matchP_alt(SubLObject prefmod, SubLObject pred) {
        {
            SubLObject match_pred = com.cyc.cycjava.cycl.inference.modules.preference_modules.preference_module_predicate(prefmod);
            if (NIL != match_pred) {
                return eq(match_pred, pred);
            }
        }
        {
            SubLObject match_any_preds = com.cyc.cycjava.cycl.inference.modules.preference_modules.preference_module_any_predicates(prefmod);
            if (NIL != match_any_preds) {
                return subl_promotions.memberP(pred, match_any_preds, PATTERN_MATCHES_FORMULA, UNPROVIDED);
            }
        }
        return T;
    }

    public static SubLObject preference_module_predicate_matchP(final SubLObject prefmod, final SubLObject pred) {
        final SubLObject match_pred = preference_modules.preference_module_predicate(prefmod);
        if (NIL != match_pred) {
            return eql(match_pred, pred);
        }
        final SubLObject match_any_preds = preference_modules.preference_module_any_predicates(prefmod);
        if (NIL != match_any_preds) {
            return memberP(pred, match_any_preds, preference_modules.PATTERN_MATCHES_FORMULA, UNPROVIDED);
        }
        return T;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(list(makeSymbol("PREFMOD"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt1 = list($DONE);

    static private final SubLList $list_alt6 = list(list(makeSymbol("PREFMOD"), makeSymbol("PRED"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLObject preference_module_sense_matchP_alt(SubLObject prefmod, SubLObject sense) {
        return eq(sense, com.cyc.cycjava.cycl.inference.modules.preference_modules.preference_module_sense(prefmod));
    }

    public static SubLObject preference_module_sense_matchP(final SubLObject prefmod, final SubLObject sense) {
        return eql(sense, preference_modules.preference_module_sense(prefmod));
    }

    public static final SubLObject preference_module_required_pattern_matchP_alt(SubLObject prefmod, SubLObject asent, SubLObject bindable_vars) {
        {
            SubLObject pattern = com.cyc.cycjava.cycl.inference.modules.preference_modules.preference_module_required_pattern(prefmod);
            return makeBoolean((NIL == pattern) || (NIL != formula_pattern_match.formula_matches_pattern(asent, pattern)));
        }
    }

    public static SubLObject preference_module_required_pattern_matchP(final SubLObject prefmod, final SubLObject asent, final SubLObject bindable_vars) {
        final SubLObject pattern = preference_modules.preference_module_required_pattern(prefmod);
        return makeBoolean((NIL == pattern) || (NIL != formula_matches_pattern(asent, pattern)));
    }

    static private final SubLList $list_alt9 = list(list(makeSymbol("PREFMOD"), makeSymbol("ASENT"), makeSymbol("SENSE"), makeSymbol("BINDABLE-VARS"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLObject preference_module_required_mt_matchP_alt(SubLObject prefmod) {
        {
            SubLObject match_mt = com.cyc.cycjava.cycl.inference.modules.preference_modules.preference_module_required_mt(prefmod);
            return makeBoolean((NIL == match_mt) || (NIL != mt_relevance_macros.relevant_mtP(match_mt)));
        }
    }

    public static SubLObject preference_module_required_mt_matchP(final SubLObject prefmod) {
        final SubLObject match_mt = preference_modules.preference_module_required_mt(prefmod);
        return makeBoolean((NIL == match_mt) || (NIL != relevant_mtP(match_mt)));
    }

    public static final SubLObject preference_module_compute_preference_level_alt(SubLObject prefmod, SubLObject asent, SubLObject bindable_vars, SubLObject strategic_context) {
        {
            SubLObject preference_level = com.cyc.cycjava.cycl.inference.modules.preference_modules.preference_module_preference_level(prefmod);
            if (NIL != preference_level) {
                return preference_level;
            } else {
                {
                    SubLObject preference_func = com.cyc.cycjava.cycl.inference.modules.preference_modules.preference_module_preference_func(prefmod);
                    return com.cyc.cycjava.cycl.inference.modules.preference_modules.preference_module_compute_preference_level_funcall(preference_func, asent, bindable_vars, strategic_context);
                }
            }
        }
    }

    public static SubLObject preference_module_compute_preference_level(final SubLObject prefmod, final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context) {
        final SubLObject preference_level = preference_modules.preference_module_preference_level(prefmod);
        if (NIL != preference_level) {
            return preference_level;
        }
        final SubLObject preference_func = preference_modules.preference_module_preference_func(prefmod);
        return preference_modules.preference_module_compute_preference_level_funcall(preference_func, asent, bindable_vars, strategic_context);
    }

    public static final SubLObject preference_module_compute_preference_level_funcall_alt(SubLObject preference_func, SubLObject asent, SubLObject bindable_vars, SubLObject strategic_context) {
        {
            SubLObject pcase_var = preference_func;
            if (pcase_var.eql(TVA_POS_PREFERENCE)) {
                return removal_modules_tva_lookup.tva_pos_preference(asent, bindable_vars, strategic_context);
            } else {
                return funcall(preference_func, asent, bindable_vars, strategic_context);
            }
        }
    }

    public static SubLObject preference_module_compute_preference_level_funcall(final SubLObject preference_func, final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context) {
        if (preference_func.eql(preference_modules.TVA_POS_PREFERENCE)) {
            return removal_modules_tva_lookup.tva_pos_preference(asent, bindable_vars, strategic_context);
        }
        return funcall(preference_func, asent, bindable_vars, strategic_context);
    }

    static private final SubLSymbol $sym25$SINGLETON_ = makeSymbol("SINGLETON?");

    static private final SubLList $list_alt26 = list(makeSymbol("DNF-CLAUSE"), makeSymbol("BINDINGS"));

    static private final SubLList $list_alt29 = list(makeKeyword("DISALLOWED"), makeKeyword("GROSSLY-DISPREFERRED"), makeKeyword("DISPREFERRED"), makeKeyword("PREFERRED"));

    public static SubLObject must_bind_arg1(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context) {
        return preference_modules.doomed_unless_bindable(preference_modules.arg_bindableP(ONE_INTEGER, asent, bindable_vars));
    }

    public static SubLObject must_bind_arg2(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context) {
        return preference_modules.doomed_unless_bindable(preference_modules.arg_bindableP(TWO_INTEGER, asent, bindable_vars));
    }

    public static SubLObject must_bind_arg3(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context) {
        return preference_modules.doomed_unless_bindable(preference_modules.arg_bindableP(THREE_INTEGER, asent, bindable_vars));
    }

    static private final SubLString $str_alt38$Unexpected_preference_level__a = makeString("Unexpected preference-level ~a");

    public static SubLObject must_bind_arg4(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context) {
        return preference_modules.doomed_unless_bindable(preference_modules.arg_bindableP(FOUR_INTEGER, asent, bindable_vars));
    }

    static private final SubLSymbol $sym39$PREFERENCE_LEVEL__ = makeSymbol("PREFERENCE-LEVEL-<");

    static private final SubLSymbol $sym40$PREFERENCE_LEVEL__ = makeSymbol("PREFERENCE-LEVEL->");

    static private final SubLString $str_alt45$unexpected_completeness__s = makeString("unexpected completeness ~s");

    public static SubLObject must_bind_arg5(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context) {
        return preference_modules.doomed_unless_bindable(preference_modules.arg_bindableP(FIVE_INTEGER, asent, bindable_vars));
    }

    static private final SubLString $str_alt46$unexpected_preference_level__s = makeString("unexpected preference-level ~s");

    static private final SubLList $list_alt47 = list(makeKeyword("PREDICATE"), makeKeyword("SENSE"), makeKeyword("REQUIRED-PATTERN"), makeKeyword("REQUIRED-MT"), makeKeyword("ANY-PREDICATES"), makeKeyword("SUPPLANTS"), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("PREFERENCE"));

    public static SubLObject must_bind_arg1_and_arg2(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context) {
        return preference_modules.doomed_unless_bindable(preference_modules.args_bindableP(preference_modules.$list137, asent, bindable_vars));
    }

    public static SubLObject must_bind_arg1_and_arg3(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context) {
        return preference_modules.doomed_unless_bindable(preference_modules.args_bindableP(preference_modules.$list139, asent, bindable_vars));
    }

    static private final SubLString $str_alt63$invalid__supplants_value__s = makeString("invalid :supplants value ~s");

    public static SubLObject must_bind_arg2_and_arg3(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context) {
        return preference_modules.doomed_unless_bindable(preference_modules.args_bindableP(preference_modules.$list141, asent, bindable_vars));
    }

    static private final SubLString $str_alt66$unexpected_preference_module_prop = makeString("unexpected preference module property ~s");

    static private final SubLString $str_alt67$_s_must_specify__sense = makeString("~s must specify :sense");

    public static SubLObject must_bind_arg1_arg2_and_arg3(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context) {
        return preference_modules.doomed_unless_bindable(preference_modules.args_bindableP(preference_modules.$list143, asent, bindable_vars));
    }

    static private final SubLString $str_alt68$_s_must_specify_exactly_one_of__p = makeString("~s must specify exactly one of :preference-level or :preference");

    public static SubLObject must_bind_arg1_or_arg2(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context) {
        final SubLObject at_least_one_arg_bindableP = makeBoolean((NIL != preference_modules.arg_bindableP(ONE_INTEGER, asent, bindable_vars)) || (NIL != preference_modules.arg_bindableP(TWO_INTEGER, asent, bindable_vars)));
        return preference_modules.doomed_unless_bindable(at_least_one_arg_bindableP);
    }

    public static SubLObject must_bind_arg1_or_arg3(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context) {
        final SubLObject at_least_one_arg_bindableP = makeBoolean((NIL != preference_modules.arg_bindableP(ONE_INTEGER, asent, bindable_vars)) || (NIL != preference_modules.arg_bindableP(THREE_INTEGER, asent, bindable_vars)));
        return preference_modules.doomed_unless_bindable(at_least_one_arg_bindableP);
    }

    static private final SubLList $list_alt73 = list(makeSymbol("NAME"), makeSymbol("PREDICATE"), makeSymbol("SENSE"), makeSymbol("REQUIRED-PATTERN"), makeSymbol("PREFERENCE-LEVEL"), makeSymbol("PREFERENCE-FUNC"), makeSymbol("REQUIRED-MT"), makeSymbol("ANY-PREDICATES"));

    static private final SubLList $list_alt74 = list($NAME, makeKeyword("PREDICATE"), makeKeyword("SENSE"), makeKeyword("REQUIRED-PATTERN"), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("PREFERENCE-FUNC"), makeKeyword("REQUIRED-MT"), makeKeyword("ANY-PREDICATES"));

    public static SubLObject must_bind_arg2_or_arg3(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context) {
        final SubLObject at_least_one_arg_bindableP = makeBoolean((NIL != preference_modules.arg_bindableP(TWO_INTEGER, asent, bindable_vars)) || (NIL != preference_modules.arg_bindableP(THREE_INTEGER, asent, bindable_vars)));
        return preference_modules.doomed_unless_bindable(at_least_one_arg_bindableP);
    }

    static private final SubLList $list_alt75 = list(makeSymbol("PREF-MOD-NAME"), makeSymbol("PREF-MOD-PREDICATE"), makeSymbol("PREF-MOD-SENSE"), makeSymbol("PREF-MOD-REQUIRED-PATTERN"), makeSymbol("PREF-MOD-PREFERENCE-LEVEL"), makeSymbol("PREF-MOD-PREFERENCE-FUNC"), makeSymbol("PREF-MOD-REQUIRED-MT"), makeSymbol("PREF-MOD-ANY-PREDICATES"));

    public static SubLObject must_bind_all_args(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context) {
        return preference_modules.doomed_unless_bindable(preference_modules.all_args_bindableP(asent, bindable_vars));
    }

    static private final SubLList $list_alt76 = list(makeSymbol("_CSETF-PREF-MOD-NAME"), makeSymbol("_CSETF-PREF-MOD-PREDICATE"), makeSymbol("_CSETF-PREF-MOD-SENSE"), makeSymbol("_CSETF-PREF-MOD-REQUIRED-PATTERN"), makeSymbol("_CSETF-PREF-MOD-PREFERENCE-LEVEL"), makeSymbol("_CSETF-PREF-MOD-PREFERENCE-FUNC"), makeSymbol("_CSETF-PREF-MOD-REQUIRED-MT"), makeSymbol("_CSETF-PREF-MOD-ANY-PREDICATES"));

    public static SubLObject doomed_unless_bindable(final SubLObject bindableP) {
        if (NIL != bindableP) {
            return $DISALLOWED;
        }
        return $DOOMED;
    }

    public static SubLObject all_args_bindableP(final SubLObject asent, final SubLObject bindable_vars) {
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = formula_args(asent, $REGULARIZE);
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != preference_modules.tree_find_a_non_bindable_varP(arg, bindable_vars)) {
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
            if (NIL == preference_modules.arg_bindableP(argnum, asent, bindable_vars)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            argnum = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject arg_bindableP(final SubLObject argnum, final SubLObject asent, final SubLObject bindable_vars) {
        final SubLObject arg = atomic_sentence_arg(asent, argnum, UNPROVIDED);
        return makeBoolean(NIL == preference_modules.tree_find_a_non_bindable_varP(arg, bindable_vars));
    }

    public static SubLObject non_bindable_varP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != variables.variable_p(v_object)) && (NIL == memberP(v_object, preference_modules.$bindable_vars_lambda$.getDynamicValue(thread), symbol_function(EQL), UNPROVIDED)));
    }

    public static SubLObject tree_find_a_non_bindable_varP(final SubLObject tree, final SubLObject bindable_vars) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = preference_modules.$bindable_vars_lambda$.currentBinding(thread);
        try {
            preference_modules.$bindable_vars_lambda$.bind(bindable_vars, thread);
            return tree_find_if(preference_modules.$sym151$NON_BINDABLE_VAR_, tree, UNPROVIDED);
        } finally {
            preference_modules.$bindable_vars_lambda$.rebind(_prev_bind_0, thread);
        }
    }

    static private final SubLString $str_alt97$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt98$_PREFMOD__a_ = makeString("[PREFMOD ~a]");

    static private final SubLList $list_alt101 = list(new SubLObject[]{ makeSymbol("&KEY"), makeSymbol("PREDICATE"), makeSymbol("SENSE"), makeSymbol("ANY-PREDICATES"), makeSymbol("REQUIRED-PATTERN"), makeSymbol("REQUIRED-MT"), makeSymbol("SUPPLANTS"), makeSymbol("PREFERENCE-LEVEL"), makeSymbol("PREFERENCE") });

    public static SubLObject sense_spec_p(final SubLObject v_object) {
        return makeBoolean((NIL != enumeration_types.sense_p(v_object)) || ($BOTH == v_object));
    }

    public static SubLObject disallowed_pattern_p(final SubLObject v_object) {
        return makeBoolean((NIL != el_formula_p(v_object)) && (NIL != forts.fort_p(el_formula_operator(v_object))));
    }

    static private final SubLList $list_alt102 = list(makeKeyword("PREDICATE"), makeKeyword("SENSE"), makeKeyword("ANY-PREDICATES"), makeKeyword("REQUIRED-PATTERN"), makeKeyword("REQUIRED-MT"), makeKeyword("SUPPLANTS"), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("PREFERENCE"));

    public static SubLObject lookup_preference_function_from_must_bind_arg(final SubLObject must_bind_arg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject preference_func = alist_lookup(preference_modules.$preference_functions_from_must_bind_arg$.getGlobalValue(), must_bind_arg, UNPROVIDED, UNPROVIDED);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == preference_func)) {
            Errors.error(preference_modules.$str154$No_preference_function_registered, must_bind_arg);
        }
        return preference_func;
    }

    static private final SubLString $str_alt103$module_ = makeString("module ");

    static private final SubLString $str_alt104$sense___ = makeString("sense : ");

    static private final SubLString $str_alt105$predicate___ = makeString("predicate : ");

    static private final SubLString $str_alt106$any_predicates___ = makeString("any predicates : ");

    static private final SubLString $str_alt107$required_pattern___ = makeString("required pattern : ");

    public static SubLObject compute_preference_module_name(final SubLObject sense, final SubLObject disallowed_pattern) {
        return removal_module_utilities.determine_hl_module_name(str(disallowed_pattern), sense);
    }

    static private final SubLString $str_alt108$required_mt___ = makeString("required mt : ");

    static private final SubLString $str_alt109$preference_level___ = makeString("preference level : ");

    static private final SubLString $str_alt110$preference_function___ = makeString("preference function : ");

    public static SubLObject compute_disallowed_pattern_from_must_bind_arg(final SubLObject predicate, final SubLObject must_bind_arg) {
        SubLObject pattern = NIL;
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = number_utilities.f_1_(must_bind_arg), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
            pattern = cons($ANYTHING, pattern);
        }
        pattern = cons(preference_modules.$NOT_FULLY_BOUND, pattern);
        pattern = nreverse(pattern);
        pattern = nadd_to_dotted_end($ANYTHING, pattern);
        pattern = nconc(list(predicate), pattern);
        return pattern;
    }

    static private final SubLString $$$pace = makeString("pace");

    static private final SubLList $list_alt121 = list(list(list(list(reader_make_constant_shell("isa"), makeSymbol("?VAR0"), makeSymbol("?VAR1")), makeKeyword("POS"), list(makeSymbol("?VAR0"), makeSymbol("?VAR1")), reader_make_constant_shell("InferencePSC")), makeKeyword("DISALLOWED")), list(list(list(reader_make_constant_shell("isa"), makeSymbol("?VAR0"), reader_make_constant_shell("Thing")), makeKeyword("POS"), list(makeSymbol("?VAR0")), reader_make_constant_shell("InferencePSC")), makeKeyword("GROSSLY-DISPREFERRED")), list(list(list(reader_make_constant_shell("isa"), reader_make_constant_shell("Thing"), makeSymbol("?VAR0")), makeKeyword("POS"), list(makeSymbol("?VAR0")), reader_make_constant_shell("InferencePSC")), makeKeyword("DISPREFERRED")), list(list(list(reader_make_constant_shell("isa"), reader_make_constant_shell("Thing"), reader_make_constant_shell("Thing")), makeKeyword("POS"), NIL, reader_make_constant_shell("InferencePSC")), makeKeyword("PREFERRED")));

    public static SubLObject note_doom_module(final SubLObject doom_module, final SubLObject name) {
        return dictionary_enter(preference_modules.$doom_module_store$.getGlobalValue(), doom_module, name);
    }

    public static SubLObject unnote_doom_module(final SubLObject doom_module) {
        return dictionary_remove(preference_modules.$doom_module_store$.getGlobalValue(), doom_module);
    }

    public static SubLObject doom_module_name(final SubLObject doom_module) {
        return dictionary_lookup_without_values(preference_modules.$doom_module_store$.getGlobalValue(), doom_module, UNPROVIDED);
    }

    public static SubLObject doom_module_already_declaredP(final SubLObject doom_module) {
        return sublisp_boolean(preference_modules.doom_module_name(doom_module));
    }

    public static SubLObject doomed_unless_arg_bindable(final SubLObject sense_spec, final SubLObject predicate, final SubLObject must_bind_arg) {
        assert NIL != non_negative_integer_p(must_bind_arg) : "! subl_promotions.non_negative_integer_p(must_bind_arg) " + ("subl_promotions.non_negative_integer_p(must_bind_arg) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(must_bind_arg) ") + must_bind_arg;
        final SubLObject preference_func = preference_modules.lookup_preference_function_from_must_bind_arg(must_bind_arg);
        final SubLObject disallowed_pattern = preference_modules.compute_disallowed_pattern_from_must_bind_arg(predicate, must_bind_arg);
        return preference_modules.doomed_unless_preference_func(sense_spec, disallowed_pattern, preference_func);
    }

    static private final SubLList $list_alt124 = list(list(list(list(reader_make_constant_shell("likesAsFriend"), reader_make_constant_shell("Muffet"), makeSymbol("?VAR0")), makeKeyword("POS"), list(makeSymbol("?VAR0")), reader_make_constant_shell("InferencePSC")), makeKeyword("PREFERRED")), list(list(list(reader_make_constant_shell("residesInRegion"), reader_make_constant_shell("Muffet"), makeSymbol("?VAR0")), makeKeyword("POS"), list(makeSymbol("?VAR0")), reader_make_constant_shell("InferencePSC")), makeKeyword("DISPREFERRED")));

    public static SubLObject doomed_unless_all_args_bindable(final SubLObject sense_spec, final SubLObject predicate) {
        assert NIL != forts.fort_p(predicate) : "! forts.fort_p(predicate) " + ("forts.fort_p(predicate) " + "CommonSymbols.NIL != forts.fort_p(predicate) ") + predicate;
        return preference_modules.doomed_unless_preference_func(sense_spec, bq_cons(predicate, preference_modules.$NOT_FULLY_BOUND), preference_modules.MUST_BIND_ALL_ARGS);
    }

    public static SubLObject doomed_unless_either_arg_bindable(final SubLObject sense_spec, final SubLObject binary_predicate) {
        assert NIL != forts.fort_p(binary_predicate) : "! forts.fort_p(binary_predicate) " + ("forts.fort_p(binary_predicate) " + "CommonSymbols.NIL != forts.fort_p(binary_predicate) ") + binary_predicate;
        return preference_modules.doomed_unless_preference_func(sense_spec, bq_cons(binary_predicate, preference_modules.$list159), preference_modules.MUST_BIND_ARG1_OR_ARG2);
    }

    public static SubLObject doomed_unless_preference_func(final SubLObject sense_spec, final SubLObject disallowed_pattern, final SubLObject preference_func) {
        assert NIL != preference_modules.sense_spec_p(sense_spec) : "! preference_modules.sense_spec_p(sense_spec) " + ("preference_modules.sense_spec_p(sense_spec) " + "CommonSymbols.NIL != preference_modules.sense_spec_p(sense_spec) ") + sense_spec;
        assert NIL != preference_modules.disallowed_pattern_p(disallowed_pattern) : "! preference_modules.disallowed_pattern_p(disallowed_pattern) " + ("preference_modules.disallowed_pattern_p(disallowed_pattern) " + "CommonSymbols.NIL != preference_modules.disallowed_pattern_p(disallowed_pattern) ") + disallowed_pattern;
        final SubLObject cdolist_list_var;
        final SubLObject senses = cdolist_list_var = ($BOTH == sense_spec) ? preference_modules.$list162 : list(sense_spec);
        SubLObject sense = NIL;
        sense = cdolist_list_var.first();
        if (NIL != cdolist_list_var) {
            final SubLObject pred = el_formula_operator(disallowed_pattern);
            final SubLObject doom_module_plist = list($SENSE, sense, $PREDICATE, pred, $REQUIRED_PATTERN, disallowed_pattern, $PREFERENCE, preference_func);
            if (NIL != preference_modules.doom_module_already_declaredP(doom_module_plist)) {
                preference_modules.unnote_doom_module(doom_module_plist);
            }
            final SubLObject module_name = preference_modules.compute_preference_module_name(sense, disallowed_pattern);
            preference_modules.note_doom_module(doom_module_plist, module_name);
            return preference_modules.inference_preference_module(module_name, doom_module_plist);
        }
        return NIL;
    }

    public static final SubLObject test_el_literal_preference_level_wrt_modules_alt(SubLObject el_asent, SubLObject sense, SubLObject el_bindable_vars, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject preference_level = NIL;
                SubLObject asent = error_unless_canonicalize_default_el_vars(el_asent);
                SubLObject bindable_vars = error_unless_canonicalize_default_el_vars(el_bindable_vars);
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        preference_level = com.cyc.cycjava.cycl.inference.modules.preference_modules.literal_preference_level_wrt_modules(asent, sense, bindable_vars, $TACTICAL);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return preference_level;
            }
        }
    }

    public static SubLObject test_el_literal_preference_level_wrt_modules(final SubLObject el_asent, final SubLObject sense, final SubLObject el_bindable_vars, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preference_level = NIL;
        final SubLObject asent = variables.error_unless_canonicalize_default_el_vars(el_asent);
        final SubLObject bindable_vars = variables.error_unless_canonicalize_default_el_vars(el_bindable_vars);
        final SubLObject _prev_bind_0 = $mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $relevant_mts$.currentBinding(thread);
        try {
            $mt$.bind(update_inference_mt_relevance_mt(mt), thread);
            $relevant_mt_function$.bind(update_inference_mt_relevance_function(mt), thread);
            $relevant_mts$.bind(update_inference_mt_relevance_mt_list(mt), thread);
            preference_level = preference_modules.literal_preference_level_wrt_modules(asent, sense, bindable_vars, $TACTICAL);
        } finally {
            $relevant_mts$.rebind(_prev_bind_3, thread);
            $relevant_mt_function$.rebind(_prev_bind_2, thread);
            $mt$.rebind(_prev_bind_0, thread);
        }
        return preference_level;
    }

    public static final SubLObject tiny_kb_el_literal_preference_level_wrt_modules_alt(SubLObject el_asent, SubLObject sense, SubLObject el_bindable_vars, SubLObject mt) {
        return com.cyc.cycjava.cycl.inference.modules.preference_modules.test_el_literal_preference_level_wrt_modules(el_asent, sense, el_bindable_vars, mt);
    }

    public static SubLObject tiny_kb_el_literal_preference_level_wrt_modules(final SubLObject el_asent, final SubLObject sense, final SubLObject el_bindable_vars, final SubLObject mt) {
        return preference_modules.test_el_literal_preference_level_wrt_modules(el_asent, sense, el_bindable_vars, mt);
    }

    public static final SubLObject full_kb_el_literal_preference_level_wrt_modules_alt(SubLObject el_asent, SubLObject sense, SubLObject el_bindable_vars, SubLObject mt) {
        return com.cyc.cycjava.cycl.inference.modules.preference_modules.test_el_literal_preference_level_wrt_modules(el_asent, sense, el_bindable_vars, mt);
    }

    public static SubLObject full_kb_el_literal_preference_level_wrt_modules(final SubLObject el_asent, final SubLObject sense, final SubLObject el_bindable_vars, final SubLObject mt) {
        return preference_modules.test_el_literal_preference_level_wrt_modules(el_asent, sense, el_bindable_vars, mt);
    }

    public static final SubLObject declare_preference_modules_file_alt() {
        declareMacro("do_generic_preference_modules", "DO-GENERIC-PREFERENCE-MODULES");
        declareMacro("do_specific_preference_modules_for_pred", "DO-SPECIFIC-PREFERENCE-MODULES-FOR-PRED");
        declareMacro("do_relevant_preference_modules", "DO-RELEVANT-PREFERENCE-MODULES");
        declareMacro("do_preference_modules", "DO-PREFERENCE-MODULES");
        declareFunction("problem_preference_level_wrt_modules", "PROBLEM-PREFERENCE-LEVEL-WRT-MODULES", 3, 0, false);
        declareFunction("literal_preference_level_wrt_modules", "LITERAL-PREFERENCE-LEVEL-WRT-MODULES", 4, 0, false);
        declareFunction("all_relevant_preference_modules", "ALL-RELEVANT-PREFERENCE-MODULES", 3, 0, false);
        declareFunction("el_literal_preference_level_wrt_modules", "EL-LITERAL-PREFERENCE-LEVEL-WRT-MODULES", 4, 0, false);
        declareFunction("preference_level_string", "PREFERENCE-LEVEL-STRING", 1, 0, false);
        declareFunction("preference_level_p", "PREFERENCE-LEVEL-P", 1, 0, false);
        declareFunction("disallowed_preference_level_p", "DISALLOWED-PREFERENCE-LEVEL-P", 1, 0, false);
        declareFunction("preference_level_L", "PREFERENCE-LEVEL-<", 2, 0, false);
        declareFunction("preference_level_G", "PREFERENCE-LEVEL->", 2, 0, false);
        declareFunction("preference_level_LE", "PREFERENCE-LEVEL-<=", 2, 0, false);
        declareFunction("preference_level_GE", "PREFERENCE-LEVEL->=", 2, 0, false);
        declareFunction("min_preference_level", "MIN-PREFERENCE-LEVEL", 1, 0, false);
        declareFunction("min2_preference_level", "MIN2-PREFERENCE-LEVEL", 2, 0, false);
        declareFunction("max_preference_level", "MAX-PREFERENCE-LEVEL", 1, 0, false);
        declareFunction("max2_preference_level", "MAX2-PREFERENCE-LEVEL", 2, 0, false);
        declareFunction("completeness_to_preference_level", "COMPLETENESS-TO-PREFERENCE-LEVEL", 1, 0, false);
        declareFunction("preference_level_to_completeness", "PREFERENCE-LEVEL-TO-COMPLETENESS", 1, 0, false);
        declareFunction("preference_module_property_p", "PREFERENCE-MODULE-PROPERTY-P", 1, 0, false);
        declareFunction("check_preference_module_properties", "CHECK-PREFERENCE-MODULE-PROPERTIES", 1, 0, false);
        declareFunction("reclassify_preference_modules", "RECLASSIFY-PREFERENCE-MODULES", 0, 0, false);
        declareFunction("generic_preference_modules", "GENERIC-PREFERENCE-MODULES", 0, 0, false);
        declareFunction("generic_preference_module_count", "GENERIC-PREFERENCE-MODULE-COUNT", 0, 0, false);
        declareFunction("specific_preference_module_count", "SPECIFIC-PREFERENCE-MODULE-COUNT", 0, 0, false);
        declareFunction("preference_module_count", "PREFERENCE-MODULE-COUNT", 0, 0, false);
        declareFunction("specific_preference_module_predicates", "SPECIFIC-PREFERENCE-MODULE-PREDICATES", 0, 0, false);
        declareFunction("specific_preference_modules_for_pred", "SPECIFIC-PREFERENCE-MODULES-FOR-PRED", 1, 0, false);
        declareFunction("predicate_has_specific_preference_modulesP", "PREDICATE-HAS-SPECIFIC-PREFERENCE-MODULES?", 1, 0, false);
        declareFunction("note_preference_module_supplants", "NOTE-PREFERENCE-MODULE-SUPPLANTS", 2, 0, false);
        declareFunction("preference_module_exclusiveP", "PREFERENCE-MODULE-EXCLUSIVE?", 1, 0, false);
        declareFunction("preference_module_supplants", "PREFERENCE-MODULE-SUPPLANTS", 1, 0, false);
        declareFunction("deregister_preference_module", "DEREGISTER-PREFERENCE-MODULE", 1, 0, false);
        declareFunction("register_preference_module", "REGISTER-PREFERENCE-MODULE", 1, 0, false);
        declareFunction("preference_module_print_function_trampoline", "PREFERENCE-MODULE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("preference_module_p", "PREFERENCE-MODULE-P", 1, 0, false);
        new com.cyc.cycjava.cycl.inference.modules.preference_modules.$preference_module_p$UnaryFunction();
        declareFunction("pref_mod_name", "PREF-MOD-NAME", 1, 0, false);
        declareFunction("pref_mod_predicate", "PREF-MOD-PREDICATE", 1, 0, false);
        declareFunction("pref_mod_sense", "PREF-MOD-SENSE", 1, 0, false);
        declareFunction("pref_mod_required_pattern", "PREF-MOD-REQUIRED-PATTERN", 1, 0, false);
        declareFunction("pref_mod_preference_level", "PREF-MOD-PREFERENCE-LEVEL", 1, 0, false);
        declareFunction("pref_mod_preference_func", "PREF-MOD-PREFERENCE-FUNC", 1, 0, false);
        declareFunction("pref_mod_required_mt", "PREF-MOD-REQUIRED-MT", 1, 0, false);
        declareFunction("pref_mod_any_predicates", "PREF-MOD-ANY-PREDICATES", 1, 0, false);
        declareFunction("_csetf_pref_mod_name", "_CSETF-PREF-MOD-NAME", 2, 0, false);
        declareFunction("_csetf_pref_mod_predicate", "_CSETF-PREF-MOD-PREDICATE", 2, 0, false);
        declareFunction("_csetf_pref_mod_sense", "_CSETF-PREF-MOD-SENSE", 2, 0, false);
        declareFunction("_csetf_pref_mod_required_pattern", "_CSETF-PREF-MOD-REQUIRED-PATTERN", 2, 0, false);
        declareFunction("_csetf_pref_mod_preference_level", "_CSETF-PREF-MOD-PREFERENCE-LEVEL", 2, 0, false);
        declareFunction("_csetf_pref_mod_preference_func", "_CSETF-PREF-MOD-PREFERENCE-FUNC", 2, 0, false);
        declareFunction("_csetf_pref_mod_required_mt", "_CSETF-PREF-MOD-REQUIRED-MT", 2, 0, false);
        declareFunction("_csetf_pref_mod_any_predicates", "_CSETF-PREF-MOD-ANY-PREDICATES", 2, 0, false);
        declareFunction("make_preference_module", "MAKE-PREFERENCE-MODULE", 0, 1, false);
        declareFunction("print_preference_module", "PRINT-PREFERENCE-MODULE", 3, 0, false);
        declareFunction("sxhash_preference_module_method", "SXHASH-PREFERENCE-MODULE-METHOD", 1, 0, false);
        new com.cyc.cycjava.cycl.inference.modules.preference_modules.$sxhash_preference_module_method$UnaryFunction();
        declareFunction("find_preference_module", "FIND-PREFERENCE-MODULE", 1, 0, false);
        declareFunction("inference_preference_module", "INFERENCE-PREFERENCE-MODULE", 2, 0, false);
        declareFunction("undeclare_inference_preference_module", "UNDECLARE-INFERENCE-PREFERENCE-MODULE", 1, 0, false);
        declareFunction("preference_module_name", "PREFERENCE-MODULE-NAME", 1, 0, false);
        declareFunction("preference_module_predicate", "PREFERENCE-MODULE-PREDICATE", 1, 0, false);
        declareFunction("preference_module_any_predicates", "PREFERENCE-MODULE-ANY-PREDICATES", 1, 0, false);
        declareFunction("preference_module_sense", "PREFERENCE-MODULE-SENSE", 1, 0, false);
        declareFunction("preference_module_required_pattern", "PREFERENCE-MODULE-REQUIRED-PATTERN", 1, 0, false);
        declareFunction("preference_module_required_mt", "PREFERENCE-MODULE-REQUIRED-MT", 1, 0, false);
        declareFunction("preference_module_preference_level", "PREFERENCE-MODULE-PREFERENCE-LEVEL", 1, 0, false);
        declareFunction("preference_module_preference_func", "PREFERENCE-MODULE-PREFERENCE-FUNC", 1, 0, false);
        declareFunction("cb_display_preference_module_info", "CB-DISPLAY-PREFERENCE-MODULE-INFO", 1, 0, false);
        declareFunction("preference_module_relevantP", "PREFERENCE-MODULE-RELEVANT?", 4, 0, false);
        declareFunction("preference_module_predicate_matchP", "PREFERENCE-MODULE-PREDICATE-MATCH?", 2, 0, false);
        declareFunction("preference_module_sense_matchP", "PREFERENCE-MODULE-SENSE-MATCH?", 2, 0, false);
        declareFunction("preference_module_required_pattern_matchP", "PREFERENCE-MODULE-REQUIRED-PATTERN-MATCH?", 3, 0, false);
        declareFunction("preference_module_required_mt_matchP", "PREFERENCE-MODULE-REQUIRED-MT-MATCH?", 1, 0, false);
        declareFunction("preference_module_compute_preference_level", "PREFERENCE-MODULE-COMPUTE-PREFERENCE-LEVEL", 4, 0, false);
        declareFunction("preference_module_compute_preference_level_funcall", "PREFERENCE-MODULE-COMPUTE-PREFERENCE-LEVEL-FUNCALL", 4, 0, false);
        declareFunction("test_el_literal_preference_level_wrt_modules", "TEST-EL-LITERAL-PREFERENCE-LEVEL-WRT-MODULES", 4, 0, false);
        declareFunction("tiny_kb_el_literal_preference_level_wrt_modules", "TINY-KB-EL-LITERAL-PREFERENCE-LEVEL-WRT-MODULES", 4, 0, false);
        declareFunction("full_kb_el_literal_preference_level_wrt_modules", "FULL-KB-EL-LITERAL-PREFERENCE-LEVEL-WRT-MODULES", 4, 0, false);
        return NIL;
    }

    public static SubLObject declare_preference_modules_file() {
        if (SubLFiles.USE_V1) {
            declareMacro("do_generic_preference_modules", "DO-GENERIC-PREFERENCE-MODULES");
            declareMacro("do_specific_preference_modules_for_pred", "DO-SPECIFIC-PREFERENCE-MODULES-FOR-PRED");
            declareMacro("do_relevant_preference_modules", "DO-RELEVANT-PREFERENCE-MODULES");
            declareMacro("do_preference_modules", "DO-PREFERENCE-MODULES");
            declareFunction("single_literal_problem_preference_level_wrt_modules", "SINGLE-LITERAL-PROBLEM-PREFERENCE-LEVEL-WRT-MODULES", 3, 0, false);
            declareFunction("literal_preference_level_wrt_modules", "LITERAL-PREFERENCE-LEVEL-WRT-MODULES", 4, 0, false);
            declareFunction("all_relevant_preference_modules", "ALL-RELEVANT-PREFERENCE-MODULES", 3, 0, false);
            declareFunction("el_literal_preference_level_wrt_modules", "EL-LITERAL-PREFERENCE-LEVEL-WRT-MODULES", 4, 0, false);
            declareFunction("statically_sort_conjunct_literals", "STATICALLY-SORT-CONJUNCT-LITERALS", 1, 1, false);
            declareFunction("statically_sort_conjunct_literals_recursive", "STATICALLY-SORT-CONJUNCT-LITERALS-RECURSIVE", 3, 0, false);
            declareFunction("statically_select_next_conjunct_literal", "STATICALLY-SELECT-NEXT-CONJUNCT-LITERAL", 2, 0, false);
            declareFunction("compute_analysis_asent_wrt_static_sort", "COMPUTE-ANALYSIS-ASENT-WRT-STATIC-SORT", 2, 0, false);
            declareFunction("compute_generic_term_for_bound_argument_of_predicate", "COMPUTE-GENERIC-TERM-FOR-BOUND-ARGUMENT-OF-PREDICATE", 1, 0, false);
            declareFunction("within_generic_preference_analysisP", "WITHIN-GENERIC-PREFERENCE-ANALYSIS?", 0, 0, false);
            declareFunction("literal_preference_level_wrt_static_sort", "LITERAL-PREFERENCE-LEVEL-WRT-STATIC-SORT", 3, 0, false);
            declareFunction("literal_removal_cost_wrt_static_sort", "LITERAL-REMOVAL-COST-WRT-STATIC-SORT", 2, 0, false);
            declareFunction("preference_level_string", "PREFERENCE-LEVEL-STRING", 1, 0, false);
            declareFunction("preference_level_p", "PREFERENCE-LEVEL-P", 1, 0, false);
            declareFunction("disallowed_preference_level_p", "DISALLOWED-PREFERENCE-LEVEL-P", 1, 0, false);
            declareFunction("doomed_preference_level_p", "DOOMED-PREFERENCE-LEVEL-P", 1, 0, false);
            declareFunction("disallowed_or_doomed_preference_level_p", "DISALLOWED-OR-DOOMED-PREFERENCE-LEVEL-P", 1, 0, false);
            declareFunction("preference_level_L", "PREFERENCE-LEVEL-<", 2, 0, false);
            declareFunction("preference_level_G", "PREFERENCE-LEVEL->", 2, 0, false);
            declareFunction("preference_level_LE", "PREFERENCE-LEVEL-<=", 2, 0, false);
            declareFunction("preference_level_GE", "PREFERENCE-LEVEL->=", 2, 0, false);
            declareFunction("min_preference_level", "MIN-PREFERENCE-LEVEL", 1, 0, false);
            declareFunction("min2_preference_level", "MIN2-PREFERENCE-LEVEL", 2, 0, false);
            declareFunction("max_preference_level", "MAX-PREFERENCE-LEVEL", 1, 0, false);
            declareFunction("max2_preference_level", "MAX2-PREFERENCE-LEVEL", 2, 0, false);
            declareFunction("completeness_to_preference_level", "COMPLETENESS-TO-PREFERENCE-LEVEL", 1, 0, false);
            declareFunction("preference_level_to_completeness", "PREFERENCE-LEVEL-TO-COMPLETENESS", 1, 0, false);
            declareFunction("preference_module_property_p", "PREFERENCE-MODULE-PROPERTY-P", 1, 0, false);
            declareFunction("check_preference_module_properties", "CHECK-PREFERENCE-MODULE-PROPERTIES", 1, 0, false);
            declareFunction("reclassify_preference_modules", "RECLASSIFY-PREFERENCE-MODULES", 0, 0, false);
            declareFunction("generic_preference_modules", "GENERIC-PREFERENCE-MODULES", 0, 0, false);
            declareFunction("generic_preference_module_count", "GENERIC-PREFERENCE-MODULE-COUNT", 0, 0, false);
            declareFunction("specific_preference_module_count", "SPECIFIC-PREFERENCE-MODULE-COUNT", 0, 0, false);
            declareFunction("preference_module_count", "PREFERENCE-MODULE-COUNT", 0, 0, false);
            declareFunction("specific_preference_module_predicates", "SPECIFIC-PREFERENCE-MODULE-PREDICATES", 0, 0, false);
            declareFunction("specific_preference_modules_for_pred", "SPECIFIC-PREFERENCE-MODULES-FOR-PRED", 1, 0, false);
            declareFunction("predicate_has_specific_preference_modulesP", "PREDICATE-HAS-SPECIFIC-PREFERENCE-MODULES?", 1, 0, false);
            declareFunction("note_preference_module_supplants", "NOTE-PREFERENCE-MODULE-SUPPLANTS", 2, 0, false);
            declareFunction("preference_module_exclusiveP", "PREFERENCE-MODULE-EXCLUSIVE?", 1, 0, false);
            declareFunction("preference_module_supplants", "PREFERENCE-MODULE-SUPPLANTS", 1, 0, false);
            declareFunction("deregister_preference_module", "DEREGISTER-PREFERENCE-MODULE", 1, 0, false);
            declareFunction("register_preference_module", "REGISTER-PREFERENCE-MODULE", 1, 0, false);
            declareFunction("deregister_all_preference_modules_for_predicate", "DEREGISTER-ALL-PREFERENCE-MODULES-FOR-PREDICATE", 1, 0, false);
            declareFunction("preference_module_print_function_trampoline", "PREFERENCE-MODULE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("preference_module_p", "PREFERENCE-MODULE-P", 1, 0, false);
            new preference_modules.$preference_module_p$UnaryFunction();
            declareFunction("pref_mod_name", "PREF-MOD-NAME", 1, 0, false);
            declareFunction("pref_mod_predicate", "PREF-MOD-PREDICATE", 1, 0, false);
            declareFunction("pref_mod_sense", "PREF-MOD-SENSE", 1, 0, false);
            declareFunction("pref_mod_required_pattern", "PREF-MOD-REQUIRED-PATTERN", 1, 0, false);
            declareFunction("pref_mod_preference_level", "PREF-MOD-PREFERENCE-LEVEL", 1, 0, false);
            declareFunction("pref_mod_preference_func", "PREF-MOD-PREFERENCE-FUNC", 1, 0, false);
            declareFunction("pref_mod_required_mt", "PREF-MOD-REQUIRED-MT", 1, 0, false);
            declareFunction("pref_mod_any_predicates", "PREF-MOD-ANY-PREDICATES", 1, 0, false);
            declareFunction("_csetf_pref_mod_name", "_CSETF-PREF-MOD-NAME", 2, 0, false);
            declareFunction("_csetf_pref_mod_predicate", "_CSETF-PREF-MOD-PREDICATE", 2, 0, false);
            declareFunction("_csetf_pref_mod_sense", "_CSETF-PREF-MOD-SENSE", 2, 0, false);
            declareFunction("_csetf_pref_mod_required_pattern", "_CSETF-PREF-MOD-REQUIRED-PATTERN", 2, 0, false);
            declareFunction("_csetf_pref_mod_preference_level", "_CSETF-PREF-MOD-PREFERENCE-LEVEL", 2, 0, false);
            declareFunction("_csetf_pref_mod_preference_func", "_CSETF-PREF-MOD-PREFERENCE-FUNC", 2, 0, false);
            declareFunction("_csetf_pref_mod_required_mt", "_CSETF-PREF-MOD-REQUIRED-MT", 2, 0, false);
            declareFunction("_csetf_pref_mod_any_predicates", "_CSETF-PREF-MOD-ANY-PREDICATES", 2, 0, false);
            declareFunction("make_preference_module", "MAKE-PREFERENCE-MODULE", 0, 1, false);
            declareFunction("visit_defstruct_preference_module", "VISIT-DEFSTRUCT-PREFERENCE-MODULE", 2, 0, false);
            declareFunction("visit_defstruct_object_preference_module_method", "VISIT-DEFSTRUCT-OBJECT-PREFERENCE-MODULE-METHOD", 2, 0, false);
            declareFunction("print_preference_module", "PRINT-PREFERENCE-MODULE", 3, 0, false);
            declareFunction("sxhash_preference_module_method", "SXHASH-PREFERENCE-MODULE-METHOD", 1, 0, false);
            new preference_modules.$sxhash_preference_module_method$UnaryFunction();
            declareFunction("find_preference_module", "FIND-PREFERENCE-MODULE", 1, 0, false);
            declareFunction("inference_preference_module", "INFERENCE-PREFERENCE-MODULE", 2, 0, false);
            declareFunction("undeclare_inference_preference_module", "UNDECLARE-INFERENCE-PREFERENCE-MODULE", 1, 0, false);
            declareFunction("preference_module_name", "PREFERENCE-MODULE-NAME", 1, 0, false);
            declareFunction("preference_module_predicate", "PREFERENCE-MODULE-PREDICATE", 1, 0, false);
            declareFunction("preference_module_any_predicates", "PREFERENCE-MODULE-ANY-PREDICATES", 1, 0, false);
            declareFunction("preference_module_sense", "PREFERENCE-MODULE-SENSE", 1, 0, false);
            declareFunction("preference_module_required_pattern", "PREFERENCE-MODULE-REQUIRED-PATTERN", 1, 0, false);
            declareFunction("preference_module_required_mt", "PREFERENCE-MODULE-REQUIRED-MT", 1, 0, false);
            declareFunction("preference_module_preference_level", "PREFERENCE-MODULE-PREFERENCE-LEVEL", 1, 0, false);
            declareFunction("preference_module_preference_func", "PREFERENCE-MODULE-PREFERENCE-FUNC", 1, 0, false);
            declareFunction("cb_display_preference_module_info", "CB-DISPLAY-PREFERENCE-MODULE-INFO", 1, 0, false);
            declareFunction("preference_module_relevantP", "PREFERENCE-MODULE-RELEVANT?", 4, 0, false);
            declareFunction("preference_module_predicate_matchP", "PREFERENCE-MODULE-PREDICATE-MATCH?", 2, 0, false);
            declareFunction("preference_module_sense_matchP", "PREFERENCE-MODULE-SENSE-MATCH?", 2, 0, false);
            declareFunction("preference_module_required_pattern_matchP", "PREFERENCE-MODULE-REQUIRED-PATTERN-MATCH?", 3, 0, false);
            declareFunction("preference_module_required_mt_matchP", "PREFERENCE-MODULE-REQUIRED-MT-MATCH?", 1, 0, false);
            declareFunction("preference_module_compute_preference_level", "PREFERENCE-MODULE-COMPUTE-PREFERENCE-LEVEL", 4, 0, false);
            declareFunction("preference_module_compute_preference_level_funcall", "PREFERENCE-MODULE-COMPUTE-PREFERENCE-LEVEL-FUNCALL", 4, 0, false);
            declareFunction("must_bind_arg1", "MUST-BIND-ARG1", 3, 0, false);
            declareFunction("must_bind_arg2", "MUST-BIND-ARG2", 3, 0, false);
            declareFunction("must_bind_arg3", "MUST-BIND-ARG3", 3, 0, false);
            declareFunction("must_bind_arg4", "MUST-BIND-ARG4", 3, 0, false);
            declareFunction("must_bind_arg5", "MUST-BIND-ARG5", 3, 0, false);
            declareFunction("must_bind_arg1_and_arg2", "MUST-BIND-ARG1-AND-ARG2", 3, 0, false);
            declareFunction("must_bind_arg1_and_arg3", "MUST-BIND-ARG1-AND-ARG3", 3, 0, false);
            declareFunction("must_bind_arg2_and_arg3", "MUST-BIND-ARG2-AND-ARG3", 3, 0, false);
            declareFunction("must_bind_arg1_arg2_and_arg3", "MUST-BIND-ARG1-ARG2-AND-ARG3", 3, 0, false);
            declareFunction("must_bind_arg1_or_arg2", "MUST-BIND-ARG1-OR-ARG2", 3, 0, false);
            declareFunction("must_bind_arg1_or_arg3", "MUST-BIND-ARG1-OR-ARG3", 3, 0, false);
            declareFunction("must_bind_arg2_or_arg3", "MUST-BIND-ARG2-OR-ARG3", 3, 0, false);
            declareFunction("must_bind_all_args", "MUST-BIND-ALL-ARGS", 3, 0, false);
            declareFunction("doomed_unless_bindable", "DOOMED-UNLESS-BINDABLE", 1, 0, false);
            declareFunction("all_args_bindableP", "ALL-ARGS-BINDABLE?", 2, 0, false);
            declareFunction("args_bindableP", "ARGS-BINDABLE?", 3, 0, false);
            declareFunction("arg_bindableP", "ARG-BINDABLE?", 3, 0, false);
            declareFunction("non_bindable_varP", "NON-BINDABLE-VAR?", 1, 0, false);
            declareFunction("tree_find_a_non_bindable_varP", "TREE-FIND-A-NON-BINDABLE-VAR?", 2, 0, false);
            declareFunction("sense_spec_p", "SENSE-SPEC-P", 1, 0, false);
            declareFunction("disallowed_pattern_p", "DISALLOWED-PATTERN-P", 1, 0, false);
            declareFunction("lookup_preference_function_from_must_bind_arg", "LOOKUP-PREFERENCE-FUNCTION-FROM-MUST-BIND-ARG", 1, 0, false);
            declareFunction("compute_preference_module_name", "COMPUTE-PREFERENCE-MODULE-NAME", 2, 0, false);
            declareFunction("compute_disallowed_pattern_from_must_bind_arg", "COMPUTE-DISALLOWED-PATTERN-FROM-MUST-BIND-ARG", 2, 0, false);
            declareFunction("note_doom_module", "NOTE-DOOM-MODULE", 2, 0, false);
            declareFunction("unnote_doom_module", "UNNOTE-DOOM-MODULE", 1, 0, false);
            declareFunction("doom_module_name", "DOOM-MODULE-NAME", 1, 0, false);
            declareFunction("doom_module_already_declaredP", "DOOM-MODULE-ALREADY-DECLARED?", 1, 0, false);
            declareFunction("doomed_unless_arg_bindable", "DOOMED-UNLESS-ARG-BINDABLE", 3, 0, false);
            declareFunction("doomed_unless_all_args_bindable", "DOOMED-UNLESS-ALL-ARGS-BINDABLE", 2, 0, false);
            declareFunction("doomed_unless_either_arg_bindable", "DOOMED-UNLESS-EITHER-ARG-BINDABLE", 2, 0, false);
            declareFunction("doomed_unless_preference_func", "DOOMED-UNLESS-PREFERENCE-FUNC", 3, 0, false);
            declareFunction("test_el_literal_preference_level_wrt_modules", "TEST-EL-LITERAL-PREFERENCE-LEVEL-WRT-MODULES", 4, 0, false);
            declareFunction("tiny_kb_el_literal_preference_level_wrt_modules", "TINY-KB-EL-LITERAL-PREFERENCE-LEVEL-WRT-MODULES", 4, 0, false);
            declareFunction("full_kb_el_literal_preference_level_wrt_modules", "FULL-KB-EL-LITERAL-PREFERENCE-LEVEL-WRT-MODULES", 4, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("problem_preference_level_wrt_modules", "PROBLEM-PREFERENCE-LEVEL-WRT-MODULES", 3, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_preference_modules_file_Previous() {
        declareMacro("do_generic_preference_modules", "DO-GENERIC-PREFERENCE-MODULES");
        declareMacro("do_specific_preference_modules_for_pred", "DO-SPECIFIC-PREFERENCE-MODULES-FOR-PRED");
        declareMacro("do_relevant_preference_modules", "DO-RELEVANT-PREFERENCE-MODULES");
        declareMacro("do_preference_modules", "DO-PREFERENCE-MODULES");
        declareFunction("single_literal_problem_preference_level_wrt_modules", "SINGLE-LITERAL-PROBLEM-PREFERENCE-LEVEL-WRT-MODULES", 3, 0, false);
        declareFunction("literal_preference_level_wrt_modules", "LITERAL-PREFERENCE-LEVEL-WRT-MODULES", 4, 0, false);
        declareFunction("all_relevant_preference_modules", "ALL-RELEVANT-PREFERENCE-MODULES", 3, 0, false);
        declareFunction("el_literal_preference_level_wrt_modules", "EL-LITERAL-PREFERENCE-LEVEL-WRT-MODULES", 4, 0, false);
        declareFunction("statically_sort_conjunct_literals", "STATICALLY-SORT-CONJUNCT-LITERALS", 1, 1, false);
        declareFunction("statically_sort_conjunct_literals_recursive", "STATICALLY-SORT-CONJUNCT-LITERALS-RECURSIVE", 3, 0, false);
        declareFunction("statically_select_next_conjunct_literal", "STATICALLY-SELECT-NEXT-CONJUNCT-LITERAL", 2, 0, false);
        declareFunction("compute_analysis_asent_wrt_static_sort", "COMPUTE-ANALYSIS-ASENT-WRT-STATIC-SORT", 2, 0, false);
        declareFunction("compute_generic_term_for_bound_argument_of_predicate", "COMPUTE-GENERIC-TERM-FOR-BOUND-ARGUMENT-OF-PREDICATE", 1, 0, false);
        declareFunction("within_generic_preference_analysisP", "WITHIN-GENERIC-PREFERENCE-ANALYSIS?", 0, 0, false);
        declareFunction("literal_preference_level_wrt_static_sort", "LITERAL-PREFERENCE-LEVEL-WRT-STATIC-SORT", 3, 0, false);
        declareFunction("literal_removal_cost_wrt_static_sort", "LITERAL-REMOVAL-COST-WRT-STATIC-SORT", 2, 0, false);
        declareFunction("preference_level_string", "PREFERENCE-LEVEL-STRING", 1, 0, false);
        declareFunction("preference_level_p", "PREFERENCE-LEVEL-P", 1, 0, false);
        declareFunction("disallowed_preference_level_p", "DISALLOWED-PREFERENCE-LEVEL-P", 1, 0, false);
        declareFunction("doomed_preference_level_p", "DOOMED-PREFERENCE-LEVEL-P", 1, 0, false);
        declareFunction("disallowed_or_doomed_preference_level_p", "DISALLOWED-OR-DOOMED-PREFERENCE-LEVEL-P", 1, 0, false);
        declareFunction("preference_level_L", "PREFERENCE-LEVEL-<", 2, 0, false);
        declareFunction("preference_level_G", "PREFERENCE-LEVEL->", 2, 0, false);
        declareFunction("preference_level_LE", "PREFERENCE-LEVEL-<=", 2, 0, false);
        declareFunction("preference_level_GE", "PREFERENCE-LEVEL->=", 2, 0, false);
        declareFunction("min_preference_level", "MIN-PREFERENCE-LEVEL", 1, 0, false);
        declareFunction("min2_preference_level", "MIN2-PREFERENCE-LEVEL", 2, 0, false);
        declareFunction("max_preference_level", "MAX-PREFERENCE-LEVEL", 1, 0, false);
        declareFunction("max2_preference_level", "MAX2-PREFERENCE-LEVEL", 2, 0, false);
        declareFunction("completeness_to_preference_level", "COMPLETENESS-TO-PREFERENCE-LEVEL", 1, 0, false);
        declareFunction("preference_level_to_completeness", "PREFERENCE-LEVEL-TO-COMPLETENESS", 1, 0, false);
        declareFunction("preference_module_property_p", "PREFERENCE-MODULE-PROPERTY-P", 1, 0, false);
        declareFunction("check_preference_module_properties", "CHECK-PREFERENCE-MODULE-PROPERTIES", 1, 0, false);
        declareFunction("reclassify_preference_modules", "RECLASSIFY-PREFERENCE-MODULES", 0, 0, false);
        declareFunction("generic_preference_modules", "GENERIC-PREFERENCE-MODULES", 0, 0, false);
        declareFunction("generic_preference_module_count", "GENERIC-PREFERENCE-MODULE-COUNT", 0, 0, false);
        declareFunction("specific_preference_module_count", "SPECIFIC-PREFERENCE-MODULE-COUNT", 0, 0, false);
        declareFunction("preference_module_count", "PREFERENCE-MODULE-COUNT", 0, 0, false);
        declareFunction("specific_preference_module_predicates", "SPECIFIC-PREFERENCE-MODULE-PREDICATES", 0, 0, false);
        declareFunction("specific_preference_modules_for_pred", "SPECIFIC-PREFERENCE-MODULES-FOR-PRED", 1, 0, false);
        declareFunction("predicate_has_specific_preference_modulesP", "PREDICATE-HAS-SPECIFIC-PREFERENCE-MODULES?", 1, 0, false);
        declareFunction("note_preference_module_supplants", "NOTE-PREFERENCE-MODULE-SUPPLANTS", 2, 0, false);
        declareFunction("preference_module_exclusiveP", "PREFERENCE-MODULE-EXCLUSIVE?", 1, 0, false);
        declareFunction("preference_module_supplants", "PREFERENCE-MODULE-SUPPLANTS", 1, 0, false);
        declareFunction("deregister_preference_module", "DEREGISTER-PREFERENCE-MODULE", 1, 0, false);
        declareFunction("register_preference_module", "REGISTER-PREFERENCE-MODULE", 1, 0, false);
        declareFunction("deregister_all_preference_modules_for_predicate", "DEREGISTER-ALL-PREFERENCE-MODULES-FOR-PREDICATE", 1, 0, false);
        declareFunction("preference_module_print_function_trampoline", "PREFERENCE-MODULE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("preference_module_p", "PREFERENCE-MODULE-P", 1, 0, false);
        new preference_modules.$preference_module_p$UnaryFunction();
        declareFunction("pref_mod_name", "PREF-MOD-NAME", 1, 0, false);
        declareFunction("pref_mod_predicate", "PREF-MOD-PREDICATE", 1, 0, false);
        declareFunction("pref_mod_sense", "PREF-MOD-SENSE", 1, 0, false);
        declareFunction("pref_mod_required_pattern", "PREF-MOD-REQUIRED-PATTERN", 1, 0, false);
        declareFunction("pref_mod_preference_level", "PREF-MOD-PREFERENCE-LEVEL", 1, 0, false);
        declareFunction("pref_mod_preference_func", "PREF-MOD-PREFERENCE-FUNC", 1, 0, false);
        declareFunction("pref_mod_required_mt", "PREF-MOD-REQUIRED-MT", 1, 0, false);
        declareFunction("pref_mod_any_predicates", "PREF-MOD-ANY-PREDICATES", 1, 0, false);
        declareFunction("_csetf_pref_mod_name", "_CSETF-PREF-MOD-NAME", 2, 0, false);
        declareFunction("_csetf_pref_mod_predicate", "_CSETF-PREF-MOD-PREDICATE", 2, 0, false);
        declareFunction("_csetf_pref_mod_sense", "_CSETF-PREF-MOD-SENSE", 2, 0, false);
        declareFunction("_csetf_pref_mod_required_pattern", "_CSETF-PREF-MOD-REQUIRED-PATTERN", 2, 0, false);
        declareFunction("_csetf_pref_mod_preference_level", "_CSETF-PREF-MOD-PREFERENCE-LEVEL", 2, 0, false);
        declareFunction("_csetf_pref_mod_preference_func", "_CSETF-PREF-MOD-PREFERENCE-FUNC", 2, 0, false);
        declareFunction("_csetf_pref_mod_required_mt", "_CSETF-PREF-MOD-REQUIRED-MT", 2, 0, false);
        declareFunction("_csetf_pref_mod_any_predicates", "_CSETF-PREF-MOD-ANY-PREDICATES", 2, 0, false);
        declareFunction("make_preference_module", "MAKE-PREFERENCE-MODULE", 0, 1, false);
        declareFunction("visit_defstruct_preference_module", "VISIT-DEFSTRUCT-PREFERENCE-MODULE", 2, 0, false);
        declareFunction("visit_defstruct_object_preference_module_method", "VISIT-DEFSTRUCT-OBJECT-PREFERENCE-MODULE-METHOD", 2, 0, false);
        declareFunction("print_preference_module", "PRINT-PREFERENCE-MODULE", 3, 0, false);
        declareFunction("sxhash_preference_module_method", "SXHASH-PREFERENCE-MODULE-METHOD", 1, 0, false);
        new preference_modules.$sxhash_preference_module_method$UnaryFunction();
        declareFunction("find_preference_module", "FIND-PREFERENCE-MODULE", 1, 0, false);
        declareFunction("inference_preference_module", "INFERENCE-PREFERENCE-MODULE", 2, 0, false);
        declareFunction("undeclare_inference_preference_module", "UNDECLARE-INFERENCE-PREFERENCE-MODULE", 1, 0, false);
        declareFunction("preference_module_name", "PREFERENCE-MODULE-NAME", 1, 0, false);
        declareFunction("preference_module_predicate", "PREFERENCE-MODULE-PREDICATE", 1, 0, false);
        declareFunction("preference_module_any_predicates", "PREFERENCE-MODULE-ANY-PREDICATES", 1, 0, false);
        declareFunction("preference_module_sense", "PREFERENCE-MODULE-SENSE", 1, 0, false);
        declareFunction("preference_module_required_pattern", "PREFERENCE-MODULE-REQUIRED-PATTERN", 1, 0, false);
        declareFunction("preference_module_required_mt", "PREFERENCE-MODULE-REQUIRED-MT", 1, 0, false);
        declareFunction("preference_module_preference_level", "PREFERENCE-MODULE-PREFERENCE-LEVEL", 1, 0, false);
        declareFunction("preference_module_preference_func", "PREFERENCE-MODULE-PREFERENCE-FUNC", 1, 0, false);
        declareFunction("cb_display_preference_module_info", "CB-DISPLAY-PREFERENCE-MODULE-INFO", 1, 0, false);
        declareFunction("preference_module_relevantP", "PREFERENCE-MODULE-RELEVANT?", 4, 0, false);
        declareFunction("preference_module_predicate_matchP", "PREFERENCE-MODULE-PREDICATE-MATCH?", 2, 0, false);
        declareFunction("preference_module_sense_matchP", "PREFERENCE-MODULE-SENSE-MATCH?", 2, 0, false);
        declareFunction("preference_module_required_pattern_matchP", "PREFERENCE-MODULE-REQUIRED-PATTERN-MATCH?", 3, 0, false);
        declareFunction("preference_module_required_mt_matchP", "PREFERENCE-MODULE-REQUIRED-MT-MATCH?", 1, 0, false);
        declareFunction("preference_module_compute_preference_level", "PREFERENCE-MODULE-COMPUTE-PREFERENCE-LEVEL", 4, 0, false);
        declareFunction("preference_module_compute_preference_level_funcall", "PREFERENCE-MODULE-COMPUTE-PREFERENCE-LEVEL-FUNCALL", 4, 0, false);
        declareFunction("must_bind_arg1", "MUST-BIND-ARG1", 3, 0, false);
        declareFunction("must_bind_arg2", "MUST-BIND-ARG2", 3, 0, false);
        declareFunction("must_bind_arg3", "MUST-BIND-ARG3", 3, 0, false);
        declareFunction("must_bind_arg4", "MUST-BIND-ARG4", 3, 0, false);
        declareFunction("must_bind_arg5", "MUST-BIND-ARG5", 3, 0, false);
        declareFunction("must_bind_arg1_and_arg2", "MUST-BIND-ARG1-AND-ARG2", 3, 0, false);
        declareFunction("must_bind_arg1_and_arg3", "MUST-BIND-ARG1-AND-ARG3", 3, 0, false);
        declareFunction("must_bind_arg2_and_arg3", "MUST-BIND-ARG2-AND-ARG3", 3, 0, false);
        declareFunction("must_bind_arg1_arg2_and_arg3", "MUST-BIND-ARG1-ARG2-AND-ARG3", 3, 0, false);
        declareFunction("must_bind_arg1_or_arg2", "MUST-BIND-ARG1-OR-ARG2", 3, 0, false);
        declareFunction("must_bind_arg1_or_arg3", "MUST-BIND-ARG1-OR-ARG3", 3, 0, false);
        declareFunction("must_bind_arg2_or_arg3", "MUST-BIND-ARG2-OR-ARG3", 3, 0, false);
        declareFunction("must_bind_all_args", "MUST-BIND-ALL-ARGS", 3, 0, false);
        declareFunction("doomed_unless_bindable", "DOOMED-UNLESS-BINDABLE", 1, 0, false);
        declareFunction("all_args_bindableP", "ALL-ARGS-BINDABLE?", 2, 0, false);
        declareFunction("args_bindableP", "ARGS-BINDABLE?", 3, 0, false);
        declareFunction("arg_bindableP", "ARG-BINDABLE?", 3, 0, false);
        declareFunction("non_bindable_varP", "NON-BINDABLE-VAR?", 1, 0, false);
        declareFunction("tree_find_a_non_bindable_varP", "TREE-FIND-A-NON-BINDABLE-VAR?", 2, 0, false);
        declareFunction("sense_spec_p", "SENSE-SPEC-P", 1, 0, false);
        declareFunction("disallowed_pattern_p", "DISALLOWED-PATTERN-P", 1, 0, false);
        declareFunction("lookup_preference_function_from_must_bind_arg", "LOOKUP-PREFERENCE-FUNCTION-FROM-MUST-BIND-ARG", 1, 0, false);
        declareFunction("compute_preference_module_name", "COMPUTE-PREFERENCE-MODULE-NAME", 2, 0, false);
        declareFunction("compute_disallowed_pattern_from_must_bind_arg", "COMPUTE-DISALLOWED-PATTERN-FROM-MUST-BIND-ARG", 2, 0, false);
        declareFunction("note_doom_module", "NOTE-DOOM-MODULE", 2, 0, false);
        declareFunction("unnote_doom_module", "UNNOTE-DOOM-MODULE", 1, 0, false);
        declareFunction("doom_module_name", "DOOM-MODULE-NAME", 1, 0, false);
        declareFunction("doom_module_already_declaredP", "DOOM-MODULE-ALREADY-DECLARED?", 1, 0, false);
        declareFunction("doomed_unless_arg_bindable", "DOOMED-UNLESS-ARG-BINDABLE", 3, 0, false);
        declareFunction("doomed_unless_all_args_bindable", "DOOMED-UNLESS-ALL-ARGS-BINDABLE", 2, 0, false);
        declareFunction("doomed_unless_either_arg_bindable", "DOOMED-UNLESS-EITHER-ARG-BINDABLE", 2, 0, false);
        declareFunction("doomed_unless_preference_func", "DOOMED-UNLESS-PREFERENCE-FUNC", 3, 0, false);
        declareFunction("test_el_literal_preference_level_wrt_modules", "TEST-EL-LITERAL-PREFERENCE-LEVEL-WRT-MODULES", 4, 0, false);
        declareFunction("tiny_kb_el_literal_preference_level_wrt_modules", "TINY-KB-EL-LITERAL-PREFERENCE-LEVEL-WRT-MODULES", 4, 0, false);
        declareFunction("full_kb_el_literal_preference_level_wrt_modules", "FULL-KB-EL-LITERAL-PREFERENCE-LEVEL-WRT-MODULES", 4, 0, false);
        return NIL;
    }

    public static final SubLObject init_preference_modules_file_alt() {
        deflexical("*ORDERED-PREFERENCE-LEVELS*", $list_alt29);
        deflexical("*PREFERENCE-MODULE-PROPERTIES*", $list_alt47);
        deflexical("*PREFERENCE-MODULES-BY-NAME*", NIL != boundp($preference_modules_by_name$) ? ((SubLObject) ($preference_modules_by_name$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
        deflexical("*GENERIC-PREFERENCE-MODULES*", NIL != boundp($generic_preference_modules$) ? ((SubLObject) ($generic_preference_modules$.getGlobalValue())) : set.new_set(symbol_function(EQ), UNPROVIDED));
        deflexical("*SPECIFIC-PREFERENCE-MODULES*", NIL != boundp($specific_preference_modules$) ? ((SubLObject) ($specific_preference_modules$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
        deflexical("*PREFERENCE-MODULE-SUPPLANTS*", NIL != boundp($preference_module_supplants$) ? ((SubLObject) ($preference_module_supplants$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
        defconstant("*DTP-PREFERENCE-MODULE*", PREFERENCE_MODULE);
        return NIL;
    }

    public static SubLObject init_preference_modules_file() {
        if (SubLFiles.USE_V1) {
            defvar("*WITHIN-GENERIC-PREFERENCE-ANALYSIS?*", NIL);
            deflexical("*MIN-PREFERENCE-LEVEL*", $PREFERRED);
            deflexical("*MAX-PREFERENCE-LEVEL*", $DOOMED);
            deflexical("*DEFAULT-PREFERENCE-LEVEL*", $DISALLOWED);
            deflexical("*ORDERED-PREFERENCE-LEVELS*", preference_modules.$list41);
            deflexical("*PREFERENCE-MODULE-PROPERTIES*", preference_modules.$list60);
            deflexical("*PREFERENCE-MODULES-BY-NAME*", SubLTrampolineFile.maybeDefault(preference_modules.$preference_modules_by_name$, preference_modules.$preference_modules_by_name$, () -> new_dictionary(symbol_function(EQ), UNPROVIDED)));
            deflexical("*GENERIC-PREFERENCE-MODULES*", SubLTrampolineFile.maybeDefault(preference_modules.$generic_preference_modules$, preference_modules.$generic_preference_modules$, () -> new_set(symbol_function(EQ), UNPROVIDED)));
            deflexical("*SPECIFIC-PREFERENCE-MODULES*", SubLTrampolineFile.maybeDefault(preference_modules.$specific_preference_modules$, preference_modules.$specific_preference_modules$, () -> new_dictionary(symbol_function(EQL), UNPROVIDED)));
            deflexical("*PREFERENCE-MODULE-SUPPLANTS*", SubLTrampolineFile.maybeDefault(preference_modules.$preference_module_supplants$, preference_modules.$preference_module_supplants$, () -> new_dictionary(symbol_function(EQ), UNPROVIDED)));
            defconstant("*DTP-PREFERENCE-MODULE*", preference_modules.PREFERENCE_MODULE);
            defparameter("*BINDABLE-VARS-LAMBDA*", NIL);
            deflexical("*PREFERENCE-FUNCTIONS-FROM-MUST-BIND-ARG*", preference_modules.$list153);
            deflexical("*DOOM-MODULE-STORE*", SubLTrampolineFile.maybeDefault(preference_modules.$doom_module_store$, preference_modules.$doom_module_store$, () -> new_dictionary(symbol_function(EQUAL), UNPROVIDED)));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*ORDERED-PREFERENCE-LEVELS*", $list_alt29);
            deflexical("*PREFERENCE-MODULE-PROPERTIES*", $list_alt47);
            deflexical("*PREFERENCE-MODULES-BY-NAME*", NIL != boundp($preference_modules_by_name$) ? ((SubLObject) ($preference_modules_by_name$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
            deflexical("*GENERIC-PREFERENCE-MODULES*", NIL != boundp($generic_preference_modules$) ? ((SubLObject) ($generic_preference_modules$.getGlobalValue())) : set.new_set(symbol_function(EQ), UNPROVIDED));
            deflexical("*SPECIFIC-PREFERENCE-MODULES*", NIL != boundp($specific_preference_modules$) ? ((SubLObject) ($specific_preference_modules$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
            deflexical("*PREFERENCE-MODULE-SUPPLANTS*", NIL != boundp($preference_module_supplants$) ? ((SubLObject) ($preference_module_supplants$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject init_preference_modules_file_Previous() {
        defvar("*WITHIN-GENERIC-PREFERENCE-ANALYSIS?*", NIL);
        deflexical("*MIN-PREFERENCE-LEVEL*", $PREFERRED);
        deflexical("*MAX-PREFERENCE-LEVEL*", $DOOMED);
        deflexical("*DEFAULT-PREFERENCE-LEVEL*", $DISALLOWED);
        deflexical("*ORDERED-PREFERENCE-LEVELS*", preference_modules.$list41);
        deflexical("*PREFERENCE-MODULE-PROPERTIES*", preference_modules.$list60);
        deflexical("*PREFERENCE-MODULES-BY-NAME*", SubLTrampolineFile.maybeDefault(preference_modules.$preference_modules_by_name$, preference_modules.$preference_modules_by_name$, () -> new_dictionary(symbol_function(EQ), UNPROVIDED)));
        deflexical("*GENERIC-PREFERENCE-MODULES*", SubLTrampolineFile.maybeDefault(preference_modules.$generic_preference_modules$, preference_modules.$generic_preference_modules$, () -> new_set(symbol_function(EQ), UNPROVIDED)));
        deflexical("*SPECIFIC-PREFERENCE-MODULES*", SubLTrampolineFile.maybeDefault(preference_modules.$specific_preference_modules$, preference_modules.$specific_preference_modules$, () -> new_dictionary(symbol_function(EQL), UNPROVIDED)));
        deflexical("*PREFERENCE-MODULE-SUPPLANTS*", SubLTrampolineFile.maybeDefault(preference_modules.$preference_module_supplants$, preference_modules.$preference_module_supplants$, () -> new_dictionary(symbol_function(EQ), UNPROVIDED)));
        defconstant("*DTP-PREFERENCE-MODULE*", preference_modules.PREFERENCE_MODULE);
        defparameter("*BINDABLE-VARS-LAMBDA*", NIL);
        deflexical("*PREFERENCE-FUNCTIONS-FROM-MUST-BIND-ARG*", preference_modules.$list153);
        deflexical("*DOOM-MODULE-STORE*", SubLTrampolineFile.maybeDefault(preference_modules.$doom_module_store$, preference_modules.$doom_module_store$, () -> new_dictionary(symbol_function(EQUAL), UNPROVIDED)));
        return NIL;
    }

    public static final SubLObject setup_preference_modules_file_alt() {
        declare_defglobal($preference_modules_by_name$);
        declare_defglobal($generic_preference_modules$);
        declare_defglobal($specific_preference_modules$);
        declare_defglobal($preference_module_supplants$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_preference_module$.getGlobalValue(), symbol_function(PREFERENCE_MODULE_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(PREF_MOD_NAME, _CSETF_PREF_MOD_NAME);
        def_csetf(PREF_MOD_PREDICATE, _CSETF_PREF_MOD_PREDICATE);
        def_csetf(PREF_MOD_SENSE, _CSETF_PREF_MOD_SENSE);
        def_csetf(PREF_MOD_REQUIRED_PATTERN, _CSETF_PREF_MOD_REQUIRED_PATTERN);
        def_csetf(PREF_MOD_PREFERENCE_LEVEL, _CSETF_PREF_MOD_PREFERENCE_LEVEL);
        def_csetf(PREF_MOD_PREFERENCE_FUNC, _CSETF_PREF_MOD_PREFERENCE_FUNC);
        def_csetf(PREF_MOD_REQUIRED_MT, _CSETF_PREF_MOD_REQUIRED_MT);
        def_csetf(PREF_MOD_ANY_PREDICATES, _CSETF_PREF_MOD_ANY_PREDICATES);
        identity(PREFERENCE_MODULE);
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_preference_module$.getGlobalValue(), symbol_function(SXHASH_PREFERENCE_MODULE_METHOD));
        define_test_case_table_int(TINY_KB_EL_LITERAL_PREFERENCE_LEVEL_WRT_MODULES, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$pace, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt121);
        define_test_case_table_int(FULL_KB_EL_LITERAL_PREFERENCE_LEVEL_WRT_MODULES, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$pace, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt124);
        return NIL;
    }

    public static SubLObject setup_preference_modules_file() {
        if (SubLFiles.USE_V1) {
            declare_defglobal(preference_modules.$preference_modules_by_name$);
            declare_defglobal(preference_modules.$generic_preference_modules$);
            declare_defglobal(preference_modules.$specific_preference_modules$);
            declare_defglobal(preference_modules.$preference_module_supplants$);
            register_method($print_object_method_table$.getGlobalValue(), preference_modules.$dtp_preference_module$.getGlobalValue(), symbol_function(preference_modules.PREFERENCE_MODULE_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim(preference_modules.$list92);
            def_csetf(preference_modules.PREF_MOD_NAME, preference_modules._CSETF_PREF_MOD_NAME);
            def_csetf(preference_modules.PREF_MOD_PREDICATE, preference_modules._CSETF_PREF_MOD_PREDICATE);
            def_csetf(preference_modules.PREF_MOD_SENSE, preference_modules._CSETF_PREF_MOD_SENSE);
            def_csetf(preference_modules.PREF_MOD_REQUIRED_PATTERN, preference_modules._CSETF_PREF_MOD_REQUIRED_PATTERN);
            def_csetf(preference_modules.PREF_MOD_PREFERENCE_LEVEL, preference_modules._CSETF_PREF_MOD_PREFERENCE_LEVEL);
            def_csetf(preference_modules.PREF_MOD_PREFERENCE_FUNC, preference_modules._CSETF_PREF_MOD_PREFERENCE_FUNC);
            def_csetf(preference_modules.PREF_MOD_REQUIRED_MT, preference_modules._CSETF_PREF_MOD_REQUIRED_MT);
            def_csetf(preference_modules.PREF_MOD_ANY_PREDICATES, preference_modules._CSETF_PREF_MOD_ANY_PREDICATES);
            identity(preference_modules.PREFERENCE_MODULE);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), preference_modules.$dtp_preference_module$.getGlobalValue(), symbol_function(preference_modules.VISIT_DEFSTRUCT_OBJECT_PREFERENCE_MODULE_METHOD));
            register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), preference_modules.$dtp_preference_module$.getGlobalValue(), symbol_function(preference_modules.SXHASH_PREFERENCE_MODULE_METHOD));
            note_funcall_helper_function(preference_modules.MUST_BIND_ARG1);
            note_funcall_helper_function(preference_modules.MUST_BIND_ARG2);
            note_funcall_helper_function(preference_modules.MUST_BIND_ARG3);
            note_funcall_helper_function(preference_modules.MUST_BIND_ARG4);
            note_funcall_helper_function(preference_modules.MUST_BIND_ARG5);
            note_funcall_helper_function(preference_modules.MUST_BIND_ARG1_AND_ARG2);
            note_funcall_helper_function(preference_modules.MUST_BIND_ARG1_AND_ARG3);
            note_funcall_helper_function(preference_modules.MUST_BIND_ARG2_AND_ARG3);
            note_funcall_helper_function(preference_modules.MUST_BIND_ARG1_ARG2_AND_ARG3);
            note_funcall_helper_function(preference_modules.MUST_BIND_ARG1_OR_ARG2);
            note_funcall_helper_function(preference_modules.MUST_BIND_ARG1_OR_ARG3);
            note_funcall_helper_function(preference_modules.MUST_BIND_ARG2_OR_ARG3);
            note_funcall_helper_function(preference_modules.MUST_BIND_ALL_ARGS);
            declare_defglobal(preference_modules.$doom_module_store$);
            define_test_case_table_int(preference_modules.TINY_KB_EL_LITERAL_PREFERENCE_LEVEL_WRT_MODULES, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), preference_modules.$list170);
            define_test_case_table_int(preference_modules.FULL_KB_EL_LITERAL_PREFERENCE_LEVEL_WRT_MODULES, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), preference_modules.$list173);
        }
        if (SubLFiles.USE_V2) {
            define_test_case_table_int(TINY_KB_EL_LITERAL_PREFERENCE_LEVEL_WRT_MODULES, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$pace, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt121);
            define_test_case_table_int(FULL_KB_EL_LITERAL_PREFERENCE_LEVEL_WRT_MODULES, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$pace, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt124);
        }
        return NIL;
    }

    public static SubLObject setup_preference_modules_file_Previous() {
        declare_defglobal(preference_modules.$preference_modules_by_name$);
        declare_defglobal(preference_modules.$generic_preference_modules$);
        declare_defglobal(preference_modules.$specific_preference_modules$);
        declare_defglobal(preference_modules.$preference_module_supplants$);
        register_method($print_object_method_table$.getGlobalValue(), preference_modules.$dtp_preference_module$.getGlobalValue(), symbol_function(preference_modules.PREFERENCE_MODULE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(preference_modules.$list92);
        def_csetf(preference_modules.PREF_MOD_NAME, preference_modules._CSETF_PREF_MOD_NAME);
        def_csetf(preference_modules.PREF_MOD_PREDICATE, preference_modules._CSETF_PREF_MOD_PREDICATE);
        def_csetf(preference_modules.PREF_MOD_SENSE, preference_modules._CSETF_PREF_MOD_SENSE);
        def_csetf(preference_modules.PREF_MOD_REQUIRED_PATTERN, preference_modules._CSETF_PREF_MOD_REQUIRED_PATTERN);
        def_csetf(preference_modules.PREF_MOD_PREFERENCE_LEVEL, preference_modules._CSETF_PREF_MOD_PREFERENCE_LEVEL);
        def_csetf(preference_modules.PREF_MOD_PREFERENCE_FUNC, preference_modules._CSETF_PREF_MOD_PREFERENCE_FUNC);
        def_csetf(preference_modules.PREF_MOD_REQUIRED_MT, preference_modules._CSETF_PREF_MOD_REQUIRED_MT);
        def_csetf(preference_modules.PREF_MOD_ANY_PREDICATES, preference_modules._CSETF_PREF_MOD_ANY_PREDICATES);
        identity(preference_modules.PREFERENCE_MODULE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), preference_modules.$dtp_preference_module$.getGlobalValue(), symbol_function(preference_modules.VISIT_DEFSTRUCT_OBJECT_PREFERENCE_MODULE_METHOD));
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), preference_modules.$dtp_preference_module$.getGlobalValue(), symbol_function(preference_modules.SXHASH_PREFERENCE_MODULE_METHOD));
        note_funcall_helper_function(preference_modules.MUST_BIND_ARG1);
        note_funcall_helper_function(preference_modules.MUST_BIND_ARG2);
        note_funcall_helper_function(preference_modules.MUST_BIND_ARG3);
        note_funcall_helper_function(preference_modules.MUST_BIND_ARG4);
        note_funcall_helper_function(preference_modules.MUST_BIND_ARG5);
        note_funcall_helper_function(preference_modules.MUST_BIND_ARG1_AND_ARG2);
        note_funcall_helper_function(preference_modules.MUST_BIND_ARG1_AND_ARG3);
        note_funcall_helper_function(preference_modules.MUST_BIND_ARG2_AND_ARG3);
        note_funcall_helper_function(preference_modules.MUST_BIND_ARG1_ARG2_AND_ARG3);
        note_funcall_helper_function(preference_modules.MUST_BIND_ARG1_OR_ARG2);
        note_funcall_helper_function(preference_modules.MUST_BIND_ARG1_OR_ARG3);
        note_funcall_helper_function(preference_modules.MUST_BIND_ARG2_OR_ARG3);
        note_funcall_helper_function(preference_modules.MUST_BIND_ALL_ARGS);
        declare_defglobal(preference_modules.$doom_module_store$);
        define_test_case_table_int(preference_modules.TINY_KB_EL_LITERAL_PREFERENCE_LEVEL_WRT_MODULES, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), preference_modules.$list170);
        define_test_case_table_int(preference_modules.FULL_KB_EL_LITERAL_PREFERENCE_LEVEL_WRT_MODULES, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), preference_modules.$list173);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        preference_modules.declare_preference_modules_file();
    }

    @Override
    public void initializeVariables() {
        preference_modules.init_preference_modules_file();
    }

    @Override
    public void runTopLevelForms() {
        preference_modules.setup_preference_modules_file();
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
            preference_modules.$preference_module_native.this.$name = Lisp.NIL;
            preference_modules.$preference_module_native.this.$predicate = Lisp.NIL;
            preference_modules.$preference_module_native.this.$sense = Lisp.NIL;
            preference_modules.$preference_module_native.this.$required_pattern = Lisp.NIL;
            preference_modules.$preference_module_native.this.$preference_level = Lisp.NIL;
            preference_modules.$preference_module_native.this.$preference_func = Lisp.NIL;
            preference_modules.$preference_module_native.this.$required_mt = Lisp.NIL;
            preference_modules.$preference_module_native.this.$any_predicates = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return preference_modules.$preference_module_native.this.$name;
        }

        @Override
        public SubLObject getField3() {
            return preference_modules.$preference_module_native.this.$predicate;
        }

        @Override
        public SubLObject getField4() {
            return preference_modules.$preference_module_native.this.$sense;
        }

        @Override
        public SubLObject getField5() {
            return preference_modules.$preference_module_native.this.$required_pattern;
        }

        @Override
        public SubLObject getField6() {
            return preference_modules.$preference_module_native.this.$preference_level;
        }

        @Override
        public SubLObject getField7() {
            return preference_modules.$preference_module_native.this.$preference_func;
        }

        @Override
        public SubLObject getField8() {
            return preference_modules.$preference_module_native.this.$required_mt;
        }

        @Override
        public SubLObject getField9() {
            return preference_modules.$preference_module_native.this.$any_predicates;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return preference_modules.$preference_module_native.this.$name = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return preference_modules.$preference_module_native.this.$predicate = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return preference_modules.$preference_module_native.this.$sense = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return preference_modules.$preference_module_native.this.$required_pattern = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return preference_modules.$preference_module_native.this.$preference_level = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return preference_modules.$preference_module_native.this.$preference_func = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return preference_modules.$preference_module_native.this.$required_mt = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return preference_modules.$preference_module_native.this.$any_predicates = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.inference.modules.preference_modules.$preference_module_native.class, preference_modules.PREFERENCE_MODULE, preference_modules.PREFERENCE_MODULE_P, preference_modules.$list86, preference_modules.$list87, new String[]{ "$name", "$predicate", "$sense", "$required_pattern", "$preference_level", "$preference_func", "$required_mt", "$any_predicates" }, preference_modules.$list88, preference_modules.$list89, preference_modules.PRINT_PREFERENCE_MODULE);
        }
    }

    public static final class $preference_module_p$UnaryFunction extends UnaryFunction {
        public $preference_module_p$UnaryFunction() {
            super(extractFunctionNamed("PREFERENCE-MODULE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return preference_modules.preference_module_p(arg1);
        }
    }

    public static final class $sxhash_preference_module_method$UnaryFunction extends UnaryFunction {
        public $sxhash_preference_module_method$UnaryFunction() {
            super(extractFunctionNamed("SXHASH-PREFERENCE-MODULE-METHOD"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return preference_modules.sxhash_preference_module_method(arg1);
        }
    }
}

/**
 * Total time: 640 ms synthetic
 */
