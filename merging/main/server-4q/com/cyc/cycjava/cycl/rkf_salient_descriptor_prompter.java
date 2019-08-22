/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.constant_handles.valid_constantP;
import static com.cyc.cycjava.cycl.el_utilities.el_conjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_existential_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_with_operator_p;
import static com.cyc.cycjava.cycl.el_utilities.el_negation_p;
import static com.cyc.cycjava.cycl.el_utilities.elf_p;
import static com.cyc.cycjava.cycl.el_utilities.groundP;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_existential;
import static com.cyc.cycjava.cycl.el_utilities.make_negation;
import static com.cyc.cycjava.cycl.el_utilities.make_specs_fn;
import static com.cyc.cycjava.cycl.el_utilities.make_ternary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_formula;
import static com.cyc.cycjava.cycl.el_utilities.possibly_sentence_p;
import static com.cyc.cycjava.cycl.el_utilities.replace_formula_arg;
import static com.cyc.cycjava.cycl.el_utilities.same_formula_arity_p;
import static com.cyc.cycjava.cycl.el_utilities.sentence_free_variables;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures._csetf_rkf_sd_prompt_deducible_cnfs;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures._csetf_rkf_sd_prompter_tactics;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures._csetf_rkf_sd_rule_info_score_mt_generality_score;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures._csetf_rkf_sd_rule_info_score_neg_lit_count;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures._csetf_rkf_sd_rule_info_score_pos_lit_count;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures._csetf_rkf_sd_rule_info_score_pos_lit_quality_score;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures._csetf_rkf_sd_rule_info_score_seed_term_in_neg_litsP;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures._csetf_rkf_sd_rule_info_score_seed_term_in_pos_litsP;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures._csetf_rkf_sd_rule_info_score_var_count;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures.new_rkf_salient_descriptor_prompter;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures.new_rkf_sd_example;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures.new_rkf_sd_prompt;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures.new_rkf_sd_rule_info_score;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_formula;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_justification;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_prompter;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_subprompts;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_clear;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_set;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures.rkf_sd_example_focus_term_analog;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures.rkf_sd_example_supports;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures.rkf_sd_example_term;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures.rkf_sd_example_type;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures.rkf_sd_precedent_example_p;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures.rkf_sd_prompt_deducible_cnfs;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures.rkf_sd_prompt_formula;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures.rkf_sd_prompt_id;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures.rkf_sd_prompt_justification;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures.rkf_sd_prompt_prompter;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures.rkf_sd_prompt_salient_property_sentence;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_formula;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_id;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_justification;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_prompter;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_salient_property_sentence;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_subprompts;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_tactic;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures.rkf_sd_prompt_subprompts;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures.rkf_sd_prompt_tactic;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures.rkf_sd_prompter_isg;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures.rkf_sd_prompter_mt;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures.rkf_sd_prompter_seed_term;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures.rkf_sd_prompter_tactics;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures.rkf_sd_prompter_unused_prompts;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures.rkf_sd_prompter_used_prompts;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_mt_generality_score;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_neg_lit_count;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_pos_lit_count;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_pos_lit_quality_score;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_seed_term_in_neg_litsP;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_seed_term_in_pos_litsP;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_var_count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numG;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.fboundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.process_unblock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.valid_process_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.butlast;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fifth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.parse_integer;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      RKF-SALIENT-DESCRIPTOR-PROMPTER
 * source file: /cyc/top/cycl/rkf-salient-descriptor-prompter.lisp
 * created:     2019/07/03 17:38:00
 */
public final class rkf_salient_descriptor_prompter extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new rkf_salient_descriptor_prompter();

 public static final String myName = "com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter";


    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $rkf_sd_strings_for_tactics$ = makeSymbol("*RKF-SD-STRINGS-FOR-TACTICS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $rkf_prompter_sort_prompter$ = makeSymbol("*RKF-PROMPTER-SORT-PROMPTER*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $rkf_sd_suppress_rarely_known_prompt_formulasP$ = makeSymbol("*RKF-SD-SUPPRESS-RARELY-KNOWN-PROMPT-FORMULAS?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $rkf_sd_suppress_formula_percent_min$ = makeSymbol("*RKF-SD-SUPPRESS-FORMULA-PERCENT-MIN*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $rkf_sd_suppress_formula_count_min$ = makeSymbol("*RKF-SD-SUPPRESS-FORMULA-COUNT-MIN*");

    // defparameter
    // Holder for the current seed term during certain operations
    /**
     * Holder for the current seed term during certain operations
     */
    @LispMethod(comment = "Holder for the current seed term during certain operations\ndefparameter")
    private static final SubLSymbol $rkf_sd_seed_term$ = makeSymbol("*RKF-SD-SEED-TERM*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $rkf_sd_rule_score_tests$ = makeSymbol("*RKF-SD-RULE-SCORE-TESTS*");

    // defconstant
    // LISTP of types we generally can't get to (yet) by parsing.
    /**
     * LISTP of types we generally can't get to (yet) by parsing.
     */
    @LispMethod(comment = "LISTP of types we generally can\'t get to (yet) by parsing.\ndefconstant")
    private static final SubLSymbol $rkf_unparseable_arg_types$ = makeSymbol("*RKF-UNPARSEABLE-ARG-TYPES*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol RKF_SALIENT_DESCRIPTOR_PROMPTER_P = makeSymbol("RKF-SALIENT-DESCRIPTOR-PROMPTER-P");

    static private final SubLList $list3 = list(list(makeSymbol("PROMPTER"), makeSymbol("WHOSTATE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym4$LOCK = makeUninternedSymbol("LOCK");

    private static final SubLSymbol RKF_SALIENT_DESCRIPTOR_PROMPTER_LOOKUP = makeSymbol("RKF-SALIENT-DESCRIPTOR-PROMPTER-LOOKUP");

    static private final SubLList $list7 = list($LOCK);

    static private final SubLList $list10 = list(list(makeSymbol("PROMPTER")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym11$STATE = makeUninternedSymbol("STATE");

    static private final SubLList $list12 = list(makeKeyword("MEMOIZATION-STATE"), list(makeSymbol("CURRENT-MEMOIZATION-STATE")));

    public static final SubLSymbol $rkf_sd_problem_store$ = makeSymbol("*RKF-SD-PROBLEM-STORE*");

    private static final SubLSymbol RKF_SD_PROMPTER_FIND_OR_SET_PROBLEM_STORE = makeSymbol("RKF-SD-PROMPTER-FIND-OR-SET-PROBLEM-STORE");

    private static final SubLSymbol REUSING_RKF_SD_PROBLEM_STORE = makeSymbol("REUSING-RKF-SD-PROBLEM-STORE");

    private static final SubLSymbol WITH_RKF_SD_PROMPTER_PROBLEM_STORE = makeSymbol("WITH-RKF-SD-PROMPTER-PROBLEM-STORE");

    private static final SubLSymbol RKF_SALIENT_DESCRIPTOR_PROMPT_P = makeSymbol("RKF-SALIENT-DESCRIPTOR-PROMPT-P");

    private static final SubLList $list28 = list(new SubLObject[]{ cons(makeSymbol("RKF-SD-PROMPTER-RULES-FOR-TERM"), makeString("Rules for Term")), cons(makeSymbol("RKF-SD-PROMPTER-ANALOGIZE"), makeString("Analogy")), cons(makeSymbol("RKF-SD-PROMPTER-INDUCED"), makeString("Induced Interview Questions")), cons(makeSymbol("RKF-SD-PROMPTER-COMPUTE-SUBPROMPTSS"), makeString("Flesh out Precomputed Questions")), cons(makeSymbol("RKF-SD-PROMPTER-REQUIRED"), makeString("Required Knowledge")), cons(makeSymbol("RKF-SD-PROMPTER-STRONG"), makeString("Strong Suggestions")), cons(makeSymbol("RKF-SD-PROMPTER-WEAK"), makeString("Weak Suggestions")), cons(makeSymbol("RKF-INTERACTION-CONTEXT-REQUIRED"), makeString("Required Interaction Context Refinements")), cons(makeSymbol("RKF-INTERACTION-CONTEXT-STRONG"), makeString("Strongly Suggested Interaction Context Refinements")), cons(makeSymbol("FOLLOW-UP"), makeString("Follow-up Prompt")) });

    private static final SubLString $$$None = makeString("None");

    private static final SubLString $$$Unknown = makeString("Unknown");

    private static final SubLSymbol $sym32$RKF_SD_BETTER_PROMPT_ = makeSymbol("RKF-SD-BETTER-PROMPT?");

    private static final SubLList $list36 = list(makeSymbol("NEG-LITS"), makeSymbol("POS-LITS"));

    private static final SubLSymbol $sym37$EL_VAR_ = makeSymbol("EL-VAR?");

    private static final SubLSymbol $sym46$_ = makeSymbol("+");

    private static final SubLSymbol RKF_SD_TERM_GENERALITY = makeSymbol("RKF-SD-TERM-GENERALITY");

    private static final SubLList $list48 = list(list($FORT, makeSymbol("RKF-SD-PROMPTER-SUGGESTION"), makeSymbol("RKF-SD-PROMPTER-ANALOGIZE"), makeSymbol("RKF-SD-PROMPTER-RULES-FOR-TERM"), makeSymbol("RKF-SD-PROMPTER-INDUCED")), list(makeKeyword("EXAMPLE-INSTANCE"), makeSymbol("RKF-SD-PROMPTER-SUGGESTION"), makeSymbol("RKF-SD-PROMPTER-EXAMPLE-INSTANCE-NONINDUCED"), makeSymbol("RKF-SD-PROMPTER-EXAMPLE-INSTANCE-INDUCED-STRONG"), makeSymbol("RKF-SD-PROMPTER-EXAMPLE-INSTANCE-INDUCED-WEAK")), list(makeKeyword("GAF")), list(makeKeyword("MT"), makeSymbol("RKF-SD-PROMPTER-INTERACTION-CONTEXT-REQUIRED"), makeSymbol("RKF-SD-PROMPTER-INTERACTION-CONTEXT-STRONG")), list($RULE, makeSymbol("RKF-SD-PROMPTER-FIND-RULE-PROMPTS")));

    static private final SubLList $list49 = list(list(makeSymbol("TABLE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list52 = list(makeSymbol("ALIST-P"));

    public static final SubLSymbol $rkf_sd_seed_term_tactics_table$ = makeSymbol("*RKF-SD-SEED-TERM-TACTICS-TABLE*");



    private static final SubLString $str61$Couldn_t_find__S_in__S_ = makeString("Couldn't find ~S in ~S.");

    private static final SubLObject $const63$focalTermPositionForFormulaTempla = reader_make_constant_shell("focalTermPositionForFormulaTemplate");





    private static final SubLList $list67 = cons(makeSymbol("ARG-POS"), makeSymbol("INFO"));

    static private final SubLList $list68 = list(makeSymbol("GLOSS"), makeSymbol("COLLECTION"), makeSymbol("EXPLANATION"));



    private static final SubLObject $const70$templateReplacementsInvisibleForP = reader_make_constant_shell("templateReplacementsInvisibleForPosition");

















    private static final SubLSymbol SUGGEST_MT = makeSymbol("SUGGEST-MT");

    private static final SubLSymbol $sym81$_MT = makeSymbol("?MT");



    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");





    private static final SubLList $list89 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER);







    private static final SubLList $list93 = list(reader_make_constant_shell("FormulaTemplate"));



    private static final SubLString $str95$constantNameAutoGeneratedFromColl = makeString("constantNameAutoGeneratedFromCollection");



    private static final SubLSymbol RKF_GENERIC_EXAMPLE_P = makeSymbol("RKF-GENERIC-EXAMPLE-P");



    private static final SubLObject $const101$focalTermTypeForInducedTemplateTy = reader_make_constant_shell("focalTermTypeForInducedTemplateType");



    private static final SubLObject $$True_JustificationTruth = reader_make_constant_shell("True-JustificationTruth");

    private static final SubLString $str110$_A_is_not_a__A = makeString("~A is not a ~A");

    private static final SubLString $$$continue_anyway = makeString("continue anyway");

    private static final SubLString $str115$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");



    private static final SubLString $str117$Redundant_with__S_____S_on__S = makeString("Redundant with ~S:~% ~S on ~S");

    private static final SubLString $str118$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    static private final SubLString $str119$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    static private final SubLString $str120$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    static private final SubLList $list121 = list(reader_make_constant_shell("isa"), reader_make_constant_shell("formulaTemplateHasType"));

    static private final SubLString $str122$Hey_ho___S_has_got_to_go___ = makeString("Hey ho. ~S has got to go.~%");

    static private final SubLSymbol $sym123$ISA_COLLECTION_ = makeSymbol("ISA-COLLECTION?");

    static private final SubLList $list124 = list(list(makeKeyword("EXAMPLE-INSTANCE"), makeSymbol("RKF-SD-PROMPTER-EXAMPLE-INSTANCE-INDUCED-STRONG"), makeSymbol("RKF-SD-PROMPTER-EXAMPLE-INSTANCE-INDUCED-WEAK")));

    static private final SubLList $list127 = list(list(makeSymbol("SEED-TERM-TYPE"), makeSymbol("TACTIC")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym128$TACTICS_FOR_SEED_TERM_TYPE = makeUninternedSymbol("TACTICS-FOR-SEED-TERM-TYPE");

    static private final SubLSymbol $sym129$TACTICS_TABLE_COPY = makeUninternedSymbol("TACTICS-TABLE-COPY");

    private static final SubLSymbol RKF_SD_PROMPTER_TACTICS_FOR_SEED_TERM_TYPE = makeSymbol("RKF-SD-PROMPTER-TACTICS-FOR-SEED-TERM-TYPE");

    static private final SubLList $list132 = list(list(makeSymbol("FUNCTION"), EQ));

    static private final SubLList $list133 = list(list(makeSymbol("COPY-TREE"), makeSymbol("*RKF-SD-SEED-TERM-TACTICS-TABLE*")));

    private static final SubLSymbol ALIST_ENTER = makeSymbol("ALIST-ENTER");

    static private final SubLList $list135 = list(list(makeSymbol("SEED-TERM-TYPE"), makeSymbol("TACTICS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym136$TACTICS_FOR_SEED_TERM_TYPE = makeUninternedSymbol("TACTICS-FOR-SEED-TERM-TYPE");

    static private final SubLSymbol $sym137$TACTICS_TABLE_COPY = makeUninternedSymbol("TACTICS-TABLE-COPY");

    static private final SubLList $list138 = list(makeSymbol("NON-DOTTED-LIST-P"));

    private static final SubLSymbol ORDERED_SET_DIFFERENCE = makeSymbol("ORDERED-SET-DIFFERENCE");









    static private final SubLList $list144 = list(makeSymbol("FORMULAS"), makeSymbol("JUSTIFICATIONS"));

    private static final SubLSymbol $KE_DRIVEN_PROMPTS = makeKeyword("KE-DRIVEN-PROMPTS");

    private static final SubLSymbol RKF_NEIGHBOR_SUGGESTIONS = makeSymbol("RKF-NEIGHBOR-SUGGESTIONS");

    private static final SubLSymbol $kw147$SUPPRESS_RARELY_KNOWN_PROMPT_FORMULAS_ = makeKeyword("SUPPRESS-RARELY-KNOWN-PROMPT-FORMULAS?");

    static private final SubLList $list149 = cons(makeSymbol("INFERENCE"), makeSymbol("FORMULA-VAR"));

    static private final SubLString $str150$Timed_out_after__S_seconds_gettin = makeString("Timed out after ~S seconds getting ~S for ~S.~%");

    private static final SubLSymbol $PROBABLY_APPROXIMATELY_DONE = makeKeyword("PROBABLY-APPROXIMATELY-DONE");

    static private final SubLString $str152$P_A_D__getting__S_for__S___ = makeString("P.A.D. getting ~S for ~S.~%");

    static private final SubLString $str154$_S_is_not_continuable____Exit_con = makeString("~S is not continuable.~% Exit condition: ~S~%");

    static private final SubLSymbol $sym155$_SEED_TERM = makeSymbol("?SEED-TERM");

    static private final SubLString $str156$Suppressing_SD_prompt_for__S_____ = makeString("Suppressing SD prompt for ~S:~% ~S~% Couldn't find the minimum ~S similar terms about which that is known.~%");

    private static final SubLSymbol RKF_SD_SUPPRESS_FORMULA_THRESHOLD_FOR_PROPERTY = makeSymbol("RKF-SD-SUPPRESS-FORMULA-THRESHOLD-FOR-PROPERTY");

    private static final SubLList $list159 = list(NIL);

    static private final SubLList $list160 = cons(makeSymbol("INFERENCE"), makeSymbol("VAR"));

    private static final SubLSymbol $sym161$_FORMULA = makeSymbol("?FORMULA");

    private static final SubLList $list162 = list(makeSymbol("BINDINGS"), makeSymbol("SUPPORTS"));

    private static final SubLSymbol $sym163$_SOURCE_TERM = makeSymbol("?SOURCE-TERM");



    private static final SubLList $list166 = list(makeSymbol("SOURCE-JUSTIFICATION"), makeSymbol("UNKNOWN-JUSTIFICATION"));



    private static final SubLSymbol $sym169$_X = makeSymbol("?X");



    private static final SubLSymbol $kw172$USE_RULES_ = makeKeyword("USE-RULES?");

    private static final SubLSymbol $sym176$EL_EXPRESSION_EQUAL_ = makeSymbol("EL-EXPRESSION-EQUAL?");

    private static final SubLSymbol RKF_SD_PROMPTER_RULES_FOR_TERM = makeSymbol("RKF-SD-PROMPTER-RULES-FOR-TERM");

    private static final SubLSymbol $sym180$RKF_SD_RULE_TUPLE__ = makeSymbol("RKF-SD-RULE-TUPLE-=");

    private static final SubLSymbol $sym181$RKF_SD_PREFER_RULE_TUPLE_ = makeSymbol("RKF-SD-PREFER-RULE-TUPLE?");

    private static final SubLSymbol RKF_SD_LOW_SCORING_TUPLE_P = makeSymbol("RKF-SD-LOW-SCORING-TUPLE-P");

    private static final SubLSymbol RKF_SD_SCORE_RULE_TUPLE = makeSymbol("RKF-SD-SCORE-RULE-TUPLE");

    private static final SubLList $list184 = list(makeSymbol("GAF1"), makeSymbol("GAF-LIT1"), makeSymbol("RULE1"), makeSymbol("BINDINGS1"));

    static private final SubLList $list185 = list(makeSymbol("GAF2"), makeSymbol("GAF-LIT2"), makeSymbol("RULE2"), makeSymbol("BINDINGS2"));

    static private final SubLList $list186 = list(makeSymbol("RKF-SD-RST-SEED-TERM-IN-POS-LITS"), makeSymbol("RKF-SD-RST-SEED-TERM-IN-NEG-LITS"), makeSymbol("RKF-SD-RST-VAR-COUNT"), makeSymbol("RKF-SD-RST-NEG-LIT-COUNT"), makeSymbol("RKF-SD-RST-POS-LIT-COUNT"), makeSymbol("RKF-SD-RST-MT-GENERALITY"), makeSymbol("RKF-SD-RST-POS-LIT-QUALITY"));

    private static final SubLList $list189 = list(makeSymbol("GAF"), makeSymbol("GAF-LIT"), makeSymbol("RULE"), makeSymbol("BINDINGS"));

    private static final SubLSymbol $sym190$RKF_SD_TERM_TOO_GENERAL_ = makeSymbol("RKF-SD-TERM-TOO-GENERAL?");

    private static final SubLInteger $int$5000 = makeInteger(5000);





    private static final SubLSymbol $sym194$RKF_SD_NOT_ASSERTIBLE_SUBPROMPTS_ = makeSymbol("RKF-SD-NOT-ASSERTIBLE-SUBPROMPTS?");

    private static final SubLSymbol $sym195$RKF_SD_UNPARSEABLE_SUBPROMPTS_ = makeSymbol("RKF-SD-UNPARSEABLE-SUBPROMPTS?");

    private static final SubLSymbol $sym196$RKF_SD_UNPARSEABLE_PROMPT_LIT_ = makeSymbol("RKF-SD-UNPARSEABLE-PROMPT-LIT?");

    private static final SubLList $list197 = list(makeKeyword("ANYTHING"));

    static private final SubLList $list198 = list(reader_make_constant_shell("SubLString"), reader_make_constant_shell("CycLAssertion"));









    private static final SubLList $list203 = list(makeSymbol("UNKNOWN-CNF"), makeSymbol("JUST-SENTENCE"));

    private static final SubLSymbol RKF_SD_PROMPTER_FIND_RULE_PROMPTS = makeSymbol("RKF-SD-PROMPTER-FIND-RULE-PROMPTS");

    private static final SubLSymbol RKF_SD_EL_FULLY_BOUND_P = makeSymbol("RKF-SD-EL-FULLY-BOUND-P");

    private static final SubLList $list208 = cons(makeSymbol("BINARY-PRED"), makeSymbol("COUNT"));

    private static final SubLSymbol RKF_SD_PROMPT_EXAMPLE_INSTANCE = makeSymbol("RKF-SD-PROMPT-EXAMPLE-INSTANCE");

    // Definitions
    public static final SubLObject rkf_salient_descriptor_prompter_prune_unused_prompts_alt(SubLObject prompter) {
        SubLTrampolineFile.checkType(prompter, RKF_SALIENT_DESCRIPTOR_PROMPTER_P);
        com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_prune_bad_prompts(prompter);
        return prompter;
    }

    // Definitions
    public static SubLObject rkf_salient_descriptor_prompter_prune_unused_prompts(final SubLObject prompter) {
        assert NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_p(prompter) : "! rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_p(prompter) " + ("rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_p(prompter) " + "CommonSymbols.NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_p(prompter) ") + prompter;
        rkf_sd_prompter_prune_bad_prompts(prompter);
        return prompter;
    }

    public static final SubLObject rkf_salient_descriptor_prompter_prompt_count_alt(SubLObject prompter) {
        {
            SubLObject unused_prompts = rkf_sd_prompter_unused_prompts(prompter);
            if (NIL != set.set_p(unused_prompts)) {
                return set.set_size(unused_prompts);
            } else {
                return ZERO_INTEGER;
            }
        }
    }

    public static SubLObject rkf_salient_descriptor_prompter_prompt_count(final SubLObject prompter) {
        final SubLObject unused_prompts = rkf_salient_descriptor_datastructures.rkf_sd_prompter_unused_prompts(prompter);
        if (NIL != set.set_p(unused_prompts)) {
            return set.set_size(unused_prompts);
        }
        return ZERO_INTEGER;
    }

    public static final SubLObject rkf_salient_descriptor_prompter_note_generator_thread_alt(SubLObject prompter, SubLObject generator_thread) {
        return rkf_salient_descriptor_prompter_set(prompter, $GENERATOR_THREAD, generator_thread);
    }

    public static SubLObject rkf_salient_descriptor_prompter_note_generator_thread(final SubLObject prompter, final SubLObject generator_thread) {
        return rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_set(prompter, $GENERATOR_THREAD, generator_thread);
    }

    public static final SubLObject rkf_salient_descriptor_prompter_clear_generator_thread_alt(SubLObject prompter) {
        return rkf_salient_descriptor_prompter_set(prompter, $GENERATOR_THREAD, $NONE);
    }

    public static SubLObject rkf_salient_descriptor_prompter_clear_generator_thread(final SubLObject prompter) {
        return rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_set(prompter, $GENERATOR_THREAD, $NONE);
    }

    /**
     *
     *
     * @return BOOLEAN; Can we possibly generate SD prompts for OBJECT?
     */
    @LispMethod(comment = "@return BOOLEAN; Can we possibly generate SD prompts for OBJECT?")
    public static final SubLObject rkf_salient_descriptor_candidate_p_alt(SubLObject v_object) {
        {
            SubLObject seed_term_type = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_compute_seed_term_type(v_object);
            SubLObject tactics = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_tactics_for_seed_term_type(seed_term_type);
            return list_utilities.sublisp_boolean(tactics);
        }
    }

    /**
     *
     *
     * @return BOOLEAN; Can we possibly generate SD prompts for OBJECT?
     */
    @LispMethod(comment = "@return BOOLEAN; Can we possibly generate SD prompts for OBJECT?")
    public static SubLObject rkf_salient_descriptor_candidate_p(final SubLObject v_object) {
        final SubLObject seed_term_type = rkf_sd_prompter_compute_seed_term_type(v_object);
        final SubLObject tactics = rkf_sd_prompter_tactics_for_seed_term_type(seed_term_type);
        return list_utilities.sublisp_boolean(tactics);
    }

    public static final SubLObject with_rkf_sd_prompter_lock_held_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt3);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject prompter = NIL;
                    SubLObject whostate = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt3);
                    prompter = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt3);
                    whostate = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject lock = $sym4$LOCK;
                            return list(CLET, list(list(lock, listS(RKF_SALIENT_DESCRIPTOR_PROMPTER_LOOKUP, prompter, $list_alt7))), listS(WITH_LOCK_HELD, list(lock, $WHOSTATE, whostate), append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt3);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject with_rkf_sd_prompter_lock_held(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list3);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject prompter = NIL;
        SubLObject whostate = NIL;
        destructuring_bind_must_consp(current, datum, $list3);
        prompter = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list3);
        whostate = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject lock = $sym4$LOCK;
            return list(CLET, list(list(lock, listS(RKF_SALIENT_DESCRIPTOR_PROMPTER_LOOKUP, prompter, $list7))), listS(WITH_LOCK_HELD, list(lock, $WHOSTATE, whostate), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list3);
        return NIL;
    }

    public static final SubLObject with_rkf_sd_prompter_memoization_state_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt10);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject prompter = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt10);
                    prompter = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject state = $sym11$STATE;
                            return list(CLET, list(list(state, listS(RKF_SALIENT_DESCRIPTOR_PROMPTER_LOOKUP, prompter, $list_alt12))), listS(WITH_MEMOIZATION_STATE, list(state), append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt10);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject with_rkf_sd_prompter_memoization_state(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list10);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject prompter = NIL;
        destructuring_bind_must_consp(current, datum, $list10);
        prompter = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject state = $sym11$STATE;
            return list(CLET, list(list(state, listS(RKF_SALIENT_DESCRIPTOR_PROMPTER_LOOKUP, prompter, $list12))), listS(WITH_MEMOIZATION_STATE, list(state), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list10);
        return NIL;
    }

    public static final SubLObject with_rkf_sd_prompter_problem_store_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt10);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject prompter = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt10);
                    prompter = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(CLET, list(list($rkf_sd_problem_store$, list(RKF_SD_PROMPTER_FIND_OR_SET_PROBLEM_STORE, prompter))), bq_cons(REUSING_RKF_SD_PROBLEM_STORE, append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt10);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject with_rkf_sd_prompter_problem_store(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list10);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject prompter = NIL;
        destructuring_bind_must_consp(current, datum, $list10);
        prompter = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(CLET, list(list($rkf_sd_problem_store$, list(RKF_SD_PROMPTER_FIND_OR_SET_PROBLEM_STORE, prompter))), bq_cons(REUSING_RKF_SD_PROBLEM_STORE, append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list10);
        return NIL;
    }

    public static final SubLObject rkf_sd_examples_for_prompt_alt(SubLObject prompt, SubLObject bad_example_num, SubLObject bad_examples) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject justification = rkf_salient_descriptor_prompt_justification(prompt);
                SubLObject prompter = rkf_salient_descriptor_prompt_prompter(prompt);
                SubLObject v_term = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_salient_descriptor_prompter_seed_term(prompter);
                SubLObject mt = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_salient_descriptor_prompter_mt(prompter);
                SubLObject salient_property_sentence = rkf_salient_descriptor.rkf_salient_property_sentence_from_justification(v_term, justification);
                SubLObject subprompts = rkf_salient_descriptor_prompt_subprompts(prompt);
                SubLObject subprompt = nth(bad_example_num, subprompts);
                SubLObject formula = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_assert_sentence(subprompt, UNPROVIDED, UNPROVIDED);
                SubLObject new_examples = NIL;
                {
                    SubLObject _prev_bind_0 = rkf_macros.$rkf_ok_to_generate_examplesP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
                    try {
                        rkf_macros.$rkf_ok_to_generate_examplesP$.bind(T, thread);
                        rkf_salient_descriptor.$rkf_sd_problem_store$.bind(com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_find_or_set_problem_store(prompter), thread);
                        {
                            SubLObject reuse_existingP = rkf_salient_descriptor.rkf_sd_problem_store_okP(rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread));
                            {
                                SubLObject _prev_bind_0_1 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
                                try {
                                    rkf_salient_descriptor.$rkf_sd_problem_store$.bind(rkf_salient_descriptor.rkf_sd_find_or_make_problem_store(), thread);
                                    {
                                        SubLObject store = rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread);
                                        try {
                                            new_examples = rkf_salient_descriptor.rkf_sd_examples(formula, v_term, mt, salient_property_sentence, bad_examples, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    if (NIL == reuse_existingP) {
                                                        rkf_salient_descriptor.rkf_sd_free_problem_store(store);
                                                    }
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_2, thread);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                        }
                    } finally {
                        rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_1, thread);
                        rkf_macros.$rkf_ok_to_generate_examplesP$.rebind(_prev_bind_0, thread);
                    }
                }
                return new_examples;
            }
        }
    }

    public static SubLObject rkf_sd_examples_for_prompt(final SubLObject prompt, final SubLObject bad_example_num, final SubLObject bad_examples) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject justification = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_justification(prompt);
        final SubLObject prompter = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_prompter(prompt);
        final SubLObject v_term = rkf_salient_descriptor_prompter_seed_term(prompter);
        final SubLObject mt = rkf_salient_descriptor_prompter_mt(prompter);
        final SubLObject salient_property_sentence = rkf_salient_descriptor.rkf_salient_property_sentence_from_justification(v_term, justification);
        final SubLObject subprompts = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_subprompts(prompt);
        final SubLObject subprompt = nth(bad_example_num, subprompts);
        final SubLObject formula = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_assert_sentence(subprompt, UNPROVIDED, UNPROVIDED);
        SubLObject new_examples = NIL;
        final SubLObject _prev_bind_0 = rkf_macros.$rkf_ok_to_generate_examplesP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
        try {
            rkf_macros.$rkf_ok_to_generate_examplesP$.bind(T, thread);
            rkf_salient_descriptor.$rkf_sd_problem_store$.bind(rkf_sd_prompter_find_or_set_problem_store(prompter), thread);
            final SubLObject reuse_existingP = rkf_salient_descriptor.rkf_sd_problem_store_okP(rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread));
            final SubLObject _prev_bind_0_$1 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
            try {
                rkf_salient_descriptor.$rkf_sd_problem_store$.bind(rkf_salient_descriptor.rkf_sd_find_or_make_problem_store(), thread);
                final SubLObject store = rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread);
                try {
                    new_examples = rkf_salient_descriptor.rkf_sd_examples(formula, v_term, mt, salient_property_sentence, bad_examples, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } finally {
                    final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        if (NIL == reuse_existingP) {
                            rkf_salient_descriptor.rkf_sd_free_problem_store(store);
                        }
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                    }
                }
            } finally {
                rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_0_$1, thread);
            }
        } finally {
            rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_2, thread);
            rkf_macros.$rkf_ok_to_generate_examplesP$.rebind(_prev_bind_0, thread);
        }
        return new_examples;
    }

    public static final SubLObject rkf_sd_prompter_find_or_set_problem_store_alt(SubLObject prompter) {
        {
            SubLObject problem_store = rkf_salient_descriptor_prompter_lookup(prompter, $PROBLEM_STORE, UNPROVIDED);
            if (NIL == rkf_salient_descriptor.rkf_sd_problem_store_okP(problem_store)) {
                problem_store = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_salient_descriptor_prompter_reset_problem_store(prompter);
            }
            return problem_store;
        }
    }

    public static SubLObject rkf_sd_prompter_find_or_set_problem_store(final SubLObject prompter) {
        SubLObject problem_store = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, $PROBLEM_STORE, UNPROVIDED);
        if (NIL == rkf_salient_descriptor.rkf_sd_problem_store_okP(problem_store)) {
            problem_store = rkf_salient_descriptor_prompter_reset_problem_store(prompter);
        }
        return problem_store;
    }

    /**
     * Reset the problem store of PROMPTER.
     */
    @LispMethod(comment = "Reset the problem store of PROMPTER.")
    public static final SubLObject rkf_salient_descriptor_prompter_reset_problem_store_alt(SubLObject prompter) {
        {
            SubLObject old_problem_store = rkf_salient_descriptor_prompter_lookup(prompter, $PROBLEM_STORE, UNPROVIDED);
            SubLObject new_problem_store = rkf_salient_descriptor.rkf_sd_make_problem_store();
            if (NIL != inference_datastructures_problem_store.problem_store_p(old_problem_store)) {
                rkf_salient_descriptor.rkf_sd_free_problem_store(old_problem_store);
            }
            rkf_salient_descriptor_prompter_set(prompter, $PROBLEM_STORE, new_problem_store);
            return new_problem_store;
        }
    }

    /**
     * Reset the problem store of PROMPTER.
     */
    @LispMethod(comment = "Reset the problem store of PROMPTER.")
    public static SubLObject rkf_salient_descriptor_prompter_reset_problem_store(final SubLObject prompter) {
        final SubLObject old_problem_store = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, $PROBLEM_STORE, UNPROVIDED);
        final SubLObject new_problem_store = rkf_salient_descriptor.rkf_sd_make_problem_store();
        if (NIL != inference_datastructures_problem_store.problem_store_p(old_problem_store)) {
            rkf_salient_descriptor.rkf_sd_free_problem_store(old_problem_store);
        }
        rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_set(prompter, $PROBLEM_STORE, new_problem_store);
        return new_problem_store;
    }

    /**
     *
     *
     * @return RKF-SALIENT-DESCRIPTOR-PROMPT-P; The next prompt from PROMPTER,
    or :DONE if PROMPTER cannot generate any more prompts.
     * @param CHOSEN-PROMPT;
     * 		RKF-SALIENT-DESCRIPTOR-PROMPT-P or NIL. If specified, this will
     * 		be returned, and PROMPTER will be updated accordingly.
     */
    @LispMethod(comment = "@return RKF-SALIENT-DESCRIPTOR-PROMPT-P; The next prompt from PROMPTER,\r\nor :DONE if PROMPTER cannot generate any more prompts.\r\n@param CHOSEN-PROMPT;\r\n\t\tRKF-SALIENT-DESCRIPTOR-PROMPT-P or NIL. If specified, this will\r\n\t\tbe returned, and PROMPTER will be updated accordingly.")
    public static final SubLObject rkf_salient_descriptor_prompter_next_alt(SubLObject prompter, SubLObject chosen_prompt) {
        if (chosen_prompt == UNPROVIDED) {
            chosen_prompt = NIL;
        }
        {
            SubLObject use_generator_threadP = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_salient_descriptor_prompter_has_generator_thread_p(prompter);
            while (!((NIL != rkf_salient_descriptor_prompt_p(chosen_prompt)) || (NIL != com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_exhausted_p(prompter)))) {
                if (NIL == use_generator_threadP) {
                    com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_salient_descriptor_prompter_generate_prompt(prompter, UNPROVIDED);
                } else {
                    if (NIL == com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_salient_descriptor_prompter_has_generator_thread_p(prompter)) {
                        com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_salient_descriptor_prompter_generate_prompt(prompter, UNPROVIDED);
                    } else {
                        com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_salient_descriptor_prompter_unblock_generator_thread(prompter);
                        sleep(ONE_INTEGER);
                    }
                }
                chosen_prompt = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_best_prompt(prompter);
            } 
            if (NIL != rkf_salient_descriptor_prompt_p(chosen_prompt)) {
                com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_mark_prompt_used(prompter, chosen_prompt);
            } else {
                chosen_prompt = $DONE;
                com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_salient_descriptor_prompter_finalize(prompter);
            }
            return chosen_prompt;
        }
    }

    /**
     *
     *
     * @return RKF-SALIENT-DESCRIPTOR-PROMPT-P; The next prompt from PROMPTER,
    or :DONE if PROMPTER cannot generate any more prompts.
     * @param CHOSEN-PROMPT;
     * 		RKF-SALIENT-DESCRIPTOR-PROMPT-P or NIL. If specified, this will
     * 		be returned, and PROMPTER will be updated accordingly.
     */
    @LispMethod(comment = "@return RKF-SALIENT-DESCRIPTOR-PROMPT-P; The next prompt from PROMPTER,\r\nor :DONE if PROMPTER cannot generate any more prompts.\r\n@param CHOSEN-PROMPT;\r\n\t\tRKF-SALIENT-DESCRIPTOR-PROMPT-P or NIL. If specified, this will\r\n\t\tbe returned, and PROMPTER will be updated accordingly.")
    public static SubLObject rkf_salient_descriptor_prompter_next(final SubLObject prompter, SubLObject chosen_prompt) {
        if (chosen_prompt == UNPROVIDED) {
            chosen_prompt = NIL;
        }
        final SubLObject use_generator_threadP = rkf_salient_descriptor_prompter_has_generator_thread_p(prompter);
        while ((NIL == rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p(chosen_prompt)) && (NIL == rkf_sd_prompter_exhausted_p(prompter))) {
            if (NIL == use_generator_threadP) {
                rkf_salient_descriptor_prompter_generate_prompt(prompter, UNPROVIDED);
            } else
                if (NIL == rkf_salient_descriptor_prompter_has_generator_thread_p(prompter)) {
                    rkf_salient_descriptor_prompter_generate_prompt(prompter, UNPROVIDED);
                } else {
                    rkf_salient_descriptor_prompter_unblock_generator_thread(prompter);
                    sleep(ONE_INTEGER);
                }

            chosen_prompt = rkf_sd_prompter_best_prompt(prompter);
        } 
        if (NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p(chosen_prompt)) {
            rkf_sd_prompter_mark_prompt_used(prompter, chosen_prompt);
        } else {
            chosen_prompt = $DONE;
            rkf_salient_descriptor_prompter_finalize(prompter);
        }
        return chosen_prompt;
    }

    public static final SubLObject rkf_salient_descriptor_prompter_finalize_alt(SubLObject prompter) {
        {
            SubLObject v_memoization_state = rkf_salient_descriptor_prompter_lookup(prompter, $MEMOIZATION_STATE, UNPROVIDED);
            if (NIL != memoization_state.memoization_state_p(v_memoization_state)) {
                memoization_state.clear_all_memoization(v_memoization_state);
            }
        }
        {
            SubLObject problem_store = rkf_salient_descriptor_prompter_lookup(prompter, $PROBLEM_STORE, UNPROVIDED);
            if (NIL != inference_datastructures_problem_store.problem_store_p(problem_store)) {
                inference_datastructures_problem_store.destroy_problem_store(problem_store);
            }
        }
        return prompter;
    }

    public static SubLObject rkf_salient_descriptor_prompter_finalize(final SubLObject prompter) {
        final SubLObject v_memoization_state = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, $MEMOIZATION_STATE, UNPROVIDED);
        if (NIL != memoization_state.memoization_state_p(v_memoization_state)) {
            memoization_state.clear_all_memoization(v_memoization_state);
        }
        final SubLObject problem_store = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, $PROBLEM_STORE, UNPROVIDED);
        if (NIL != inference_datastructures_problem_store.problem_store_p(problem_store)) {
            inference_datastructures_problem_store.destroy_problem_store(problem_store);
        }
        return prompter;
    }

    public static final SubLObject rkf_sd_prompter_mark_prompt_used_alt(SubLObject prompter, SubLObject prompt) {
        com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_remove_unused_prompt(prompter, prompt);
        set.set_add(prompt, rkf_sd_prompter_used_prompts(prompter));
        return prompter;
    }

    public static SubLObject rkf_sd_prompter_mark_prompt_used(final SubLObject prompter, final SubLObject prompt) {
        rkf_sd_prompter_remove_unused_prompt(prompter, prompt);
        set.set_add(prompt, rkf_salient_descriptor_datastructures.rkf_sd_prompter_used_prompts(prompter));
        return prompter;
    }

    public static final SubLObject rkf_sd_prompter_remove_unused_prompt_alt(SubLObject prompter, SubLObject prompt) {
        set.set_remove(prompt, rkf_sd_prompter_unused_prompts(prompter));
        com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_salient_descriptor_prompter_unblock_generator_thread(prompter);
        return $REMOVED;
    }

    public static SubLObject rkf_sd_prompter_remove_unused_prompt(final SubLObject prompter, final SubLObject prompt) {
        set.set_remove(prompt, rkf_salient_descriptor_datastructures.rkf_sd_prompter_unused_prompts(prompter));
        rkf_salient_descriptor_prompter_unblock_generator_thread(prompter);
        return $REMOVED;
    }

    public static final SubLObject rkf_salient_descriptor_prompter_has_generator_thread_p_alt(SubLObject prompter) {
        {
            SubLObject generator_thread = rkf_salient_descriptor_prompter_lookup(prompter, $GENERATOR_THREAD, UNPROVIDED);
            return valid_process_p(generator_thread);
        }
    }

    public static SubLObject rkf_salient_descriptor_prompter_has_generator_thread_p(final SubLObject prompter) {
        final SubLObject generator_thread = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, $GENERATOR_THREAD, UNPROVIDED);
        return valid_process_p(generator_thread);
    }

    public static final SubLObject rkf_salient_descriptor_prompter_unblock_generator_thread_alt(SubLObject prompter) {
        {
            SubLObject generator_thread = rkf_salient_descriptor_prompter_lookup(prompter, $GENERATOR_THREAD, UNPROVIDED);
            if (NIL != valid_process_p(generator_thread)) {
                process_unblock(generator_thread);
            }
        }
        return prompter;
    }

    public static SubLObject rkf_salient_descriptor_prompter_unblock_generator_thread(final SubLObject prompter) {
        final SubLObject generator_thread = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, $GENERATOR_THREAD, UNPROVIDED);
        if (NIL != valid_process_p(generator_thread)) {
            process_unblock(generator_thread);
        }
        return prompter;
    }

    /**
     * Tell PROMPTER to try to generate - but not spit out - one more prompt.
     *
     * @return :TACTIC-DONE if current tactic done, :DONE if all done.
     */
    @LispMethod(comment = "Tell PROMPTER to try to generate - but not spit out - one more prompt.\r\n\r\n@return :TACTIC-DONE if current tactic done, :DONE if all done.")
    public static final SubLObject rkf_salient_descriptor_prompter_generate_prompt_alt(SubLObject prompter, SubLObject allow_tactic_rolloverP) {
        if (allow_tactic_rolloverP == UNPROVIDED) {
            allow_tactic_rolloverP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject start_count = set.set_size(rkf_sd_prompter_unused_prompts(prompter));
                SubLObject result = NIL;
                SubLObject state = rkf_salient_descriptor_prompter_lookup(prompter, $MEMOIZATION_STATE, memoization_state.current_memoization_state());
                SubLObject local_state = state;
                {
                    SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        {
                            SubLObject original_memoization_process = NIL;
                            if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                {
                                    SubLObject current_proc = current_process();
                                    if (NIL == original_memoization_process) {
                                        memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                    } else {
                                        if (original_memoization_process != current_proc) {
                                            Errors.error($str_alt22$Invalid_attempt_to_reuse_memoizat);
                                        }
                                    }
                                }
                            }
                            try {
                                while (!((set.set_size(rkf_sd_prompter_unused_prompts(prompter)).numG(start_count) || (result == $DONE)) || ((NIL == allow_tactic_rolloverP) && (result == $TACTIC_DONE)))) {
                                    result = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_apply_tactics(prompter);
                                } 
                            } finally {
                                {
                                    SubLObject _prev_bind_0_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if (!start_count.eql(set.set_size(rkf_sd_prompter_unused_prompts(prompter)))) {
                                            com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_update_best_prompt(prompter);
                                        }
                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_3, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Tell PROMPTER to try to generate - but not spit out - one more prompt.
     *
     * @return :TACTIC-DONE if current tactic done, :DONE if all done.
     */
    @LispMethod(comment = "Tell PROMPTER to try to generate - but not spit out - one more prompt.\r\n\r\n@return :TACTIC-DONE if current tactic done, :DONE if all done.")
    public static SubLObject rkf_salient_descriptor_prompter_generate_prompt(final SubLObject prompter, SubLObject allow_tactic_rolloverP) {
        if (allow_tactic_rolloverP == UNPROVIDED) {
            allow_tactic_rolloverP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject start_count = set.set_size(rkf_salient_descriptor_datastructures.rkf_sd_prompter_unused_prompts(prompter));
        SubLObject result = NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, $MEMOIZATION_STATE, memoization_state.current_memoization_state());
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                while (((!set.set_size(rkf_salient_descriptor_datastructures.rkf_sd_prompter_unused_prompts(prompter)).numG(start_count)) && (result != $DONE)) && ((NIL != allow_tactic_rolloverP) || (result != $TACTIC_DONE))) {
                    result = rkf_sd_prompter_apply_tactics(prompter);
                } 
                if (!start_count.eql(set.set_size(rkf_salient_descriptor_datastructures.rkf_sd_prompter_unused_prompts(prompter)))) {
                    rkf_sd_prompter_update_best_prompt(prompter);
                }
            } finally {
                final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * Remove PROMPT from PROMPTER.
     */
    @LispMethod(comment = "Remove PROMPT from PROMPTER.")
    public static final SubLObject rkf_salient_descriptor_prompter_remove_prompt_alt(SubLObject prompter, SubLObject prompt) {
        {
            SubLObject lock = rkf_salient_descriptor_prompter_lookup(prompter, $LOCK, UNPROVIDED);
            SubLObject lock_4 = lock;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock_4);
                {
                    SubLObject best_prompt = rkf_salient_descriptor_prompter_lookup(prompter, $BEST_PROMPT, UNPROVIDED);
                    if (best_prompt == prompt) {
                        rkf_salient_descriptor_prompter_set(prompter, $BEST_PROMPT, $RECOMPUTE);
                    }
                }
                com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_remove_unused_prompt(prompter, prompt);
            } finally {
                if (NIL != release) {
                    release_lock(lock_4);
                }
            }
        }
        return prompter;
    }

    /**
     * Remove PROMPT from PROMPTER.
     */
    @LispMethod(comment = "Remove PROMPT from PROMPTER.")
    public static SubLObject rkf_salient_descriptor_prompter_remove_prompt(final SubLObject prompter, final SubLObject prompt) {
        final SubLObject lock = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, $LOCK, UNPROVIDED);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            final SubLObject best_prompt = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, $BEST_PROMPT, UNPROVIDED);
            if (best_prompt.eql(prompt)) {
                rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_set(prompter, $BEST_PROMPT, $RECOMPUTE);
            }
            rkf_sd_prompter_remove_unused_prompt(prompter, prompt);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return prompter;
    }

    /**
     * Put PROMPT back in PROMPTER as an unused prompt.
     */
    @LispMethod(comment = "Put PROMPT back in PROMPTER as an unused prompt.")
    public static final SubLObject rkf_salient_descriptor_prompter_replace_prompt_alt(SubLObject prompter, SubLObject prompt) {
        SubLTrampolineFile.checkType(prompter, RKF_SALIENT_DESCRIPTOR_PROMPTER_P);
        SubLTrampolineFile.checkType(prompt, RKF_SALIENT_DESCRIPTOR_PROMPT_P);
        set.set_remove(prompt, rkf_sd_prompter_used_prompts(prompter));
        return com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_add_to_unused_prompts(prompter, prompt);
    }

    /**
     * Put PROMPT back in PROMPTER as an unused prompt.
     */
    @LispMethod(comment = "Put PROMPT back in PROMPTER as an unused prompt.")
    public static SubLObject rkf_salient_descriptor_prompter_replace_prompt(final SubLObject prompter, final SubLObject prompt) {
        assert NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_p(prompter) : "! rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_p(prompter) " + ("rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_p(prompter) " + "CommonSymbols.NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_p(prompter) ") + prompter;
        assert NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p(prompt) : "! rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p(prompt) " + ("rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p(prompt) " + "CommonSymbols.NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p(prompt) ") + prompt;
        set.set_remove(prompt, rkf_salient_descriptor_datastructures.rkf_sd_prompter_used_prompts(prompter));
        return rkf_sd_prompter_add_to_unused_prompts(prompter, prompt);
    }

    /**
     *
     *
     * @return HLMT-P; the mt for PROMPTER.
     */
    @LispMethod(comment = "@return HLMT-P; the mt for PROMPTER.")
    public static final SubLObject rkf_salient_descriptor_prompter_mt_alt(SubLObject prompter) {
        return rkf_sd_prompter_mt(prompter);
    }

    /**
     *
     *
     * @return HLMT-P; the mt for PROMPTER.
     */
    @LispMethod(comment = "@return HLMT-P; the mt for PROMPTER.")
    public static SubLObject rkf_salient_descriptor_prompter_mt(final SubLObject prompter) {
        return rkf_salient_descriptor_datastructures.rkf_sd_prompter_mt(prompter);
    }

    /**
     *
     *
     * @return CycL expression; the seed-term for PROMPTER.
     */
    @LispMethod(comment = "@return CycL expression; the seed-term for PROMPTER.")
    public static final SubLObject rkf_salient_descriptor_prompter_seed_term_alt(SubLObject prompter) {
        return rkf_sd_prompter_seed_term(prompter);
    }

    /**
     *
     *
     * @return CycL expression; the seed-term for PROMPTER.
     */
    @LispMethod(comment = "@return CycL expression; the seed-term for PROMPTER.")
    public static SubLObject rkf_salient_descriptor_prompter_seed_term(final SubLObject prompter) {
        return rkf_salient_descriptor_datastructures.rkf_sd_prompter_seed_term(prompter);
    }

    /**
     * Pop the tactic on PROMPTER that is responsible for PROMPT, allowing it to skip to the next tactic.
     */
    @LispMethod(comment = "Pop the tactic on PROMPTER that is responsible for PROMPT, allowing it to skip to the next tactic.")
    public static final SubLObject rkf_salient_descriptor_prompter_pop_prompt_tactic_alt(SubLObject prompter, SubLObject prompt) {
        {
            SubLObject tactic_to_pop = rkf_sd_prompt_tactic(prompt);
            if (tactic_to_pop.eql(com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_salient_descriptor_prompter_current_tactic(prompter))) {
                _csetf_rkf_sd_prompter_tactics(prompter, rkf_sd_prompter_tactics(prompter).rest());
            }
            {
                SubLObject lock = rkf_salient_descriptor_prompter_lookup(prompter, $LOCK, UNPROVIDED);
                SubLObject lock_5 = lock;
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock_5);
                    {
                        SubLObject best_prompt = rkf_salient_descriptor_prompter_lookup(prompter, $BEST_PROMPT, UNPROVIDED);
                        if ((NIL != rkf_salient_descriptor_prompt_p(best_prompt)) && tactic_to_pop.eql(rkf_sd_prompt_tactic(best_prompt))) {
                            rkf_salient_descriptor_prompter_set(prompter, $BEST_PROMPT, $RECOMPUTE);
                        }
                    }
                    com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_prune_tactic_prompts(prompter, tactic_to_pop);
                } finally {
                    if (NIL != release) {
                        release_lock(lock_5);
                    }
                }
            }
            return prompter;
        }
    }

    /**
     * Pop the tactic on PROMPTER that is responsible for PROMPT, allowing it to skip to the next tactic.
     */
    @LispMethod(comment = "Pop the tactic on PROMPTER that is responsible for PROMPT, allowing it to skip to the next tactic.")
    public static SubLObject rkf_salient_descriptor_prompter_pop_prompt_tactic(final SubLObject prompter, final SubLObject prompt) {
        final SubLObject tactic_to_pop = rkf_salient_descriptor_datastructures.rkf_sd_prompt_tactic(prompt);
        if (tactic_to_pop.eql(rkf_salient_descriptor_prompter_current_tactic(prompter))) {
            rkf_salient_descriptor_datastructures._csetf_rkf_sd_prompter_tactics(prompter, rkf_salient_descriptor_datastructures.rkf_sd_prompter_tactics(prompter).rest());
        }
        final SubLObject lock = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, $LOCK, UNPROVIDED);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            final SubLObject best_prompt = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, $BEST_PROMPT, UNPROVIDED);
            if ((NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p(best_prompt)) && tactic_to_pop.eql(rkf_salient_descriptor_datastructures.rkf_sd_prompt_tactic(best_prompt))) {
                rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_set(prompter, $BEST_PROMPT, $RECOMPUTE);
            }
            rkf_sd_prompter_prune_tactic_prompts(prompter, tactic_to_pop);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return prompter;
    }

    public static final SubLObject rkf_sd_prompter_prune_tactic_prompts_alt(SubLObject prompter, SubLObject tactic_to_pop) {
        {
            SubLObject bad_prompts = set.new_set(UNPROVIDED, UNPROVIDED);
            {
                SubLObject set_contents_var = set.do_set_internal(rkf_sd_prompter_unused_prompts(prompter));
                SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                SubLObject state = NIL;
                for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    {
                        SubLObject prompt = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, prompt)) {
                            if (tactic_to_pop.eql(rkf_sd_prompt_tactic(prompt))) {
                                set.set_add(prompt, bad_prompts);
                            }
                        }
                    }
                }
            }
            {
                SubLObject set_contents_var = set.do_set_internal(bad_prompts);
                SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                SubLObject state = NIL;
                for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    {
                        SubLObject bad_prompt = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, bad_prompt)) {
                            com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_remove_unused_prompt(prompter, bad_prompt);
                        }
                    }
                }
            }
        }
        return prompter;
    }

    public static SubLObject rkf_sd_prompter_prune_tactic_prompts(final SubLObject prompter, final SubLObject tactic_to_pop) {
        final SubLObject bad_prompts = set.new_set(UNPROVIDED, UNPROVIDED);
        final SubLObject set_var = rkf_salient_descriptor_datastructures.rkf_sd_prompter_unused_prompts(prompter);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject prompt;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            prompt = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, prompt)) && tactic_to_pop.eql(rkf_salient_descriptor_datastructures.rkf_sd_prompt_tactic(prompt))) {
                set.set_add(prompt, bad_prompts);
            }
        }
        final SubLObject set_contents_var2 = set.do_set_internal(bad_prompts);
        SubLObject basis_object2;
        SubLObject state2;
        SubLObject bad_prompt;
        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
            bad_prompt = set_contents.do_set_contents_next(basis_object2, state2);
            if (NIL != set_contents.do_set_contents_element_validP(state2, bad_prompt)) {
                rkf_sd_prompter_remove_unused_prompt(prompter, bad_prompt);
            }
        }
        return prompter;
    }

    public static final SubLObject rkf_sd_prompter_prune_bad_prompts_alt(SubLObject prompter) {
        {
            SubLObject bad_prompts = set.new_set(UNPROVIDED, UNPROVIDED);
            {
                SubLObject set_contents_var = set.do_set_internal(rkf_sd_prompter_unused_prompts(prompter));
                SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                SubLObject state = NIL;
                for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    {
                        SubLObject prompt = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, prompt)) {
                            if (NIL != com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_bad_promptP(prompt)) {
                                set.set_add(prompt, bad_prompts);
                            }
                        }
                    }
                }
            }
            {
                SubLObject set_contents_var = set.do_set_internal(bad_prompts);
                SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                SubLObject state = NIL;
                for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    {
                        SubLObject bad_prompt = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, bad_prompt)) {
                            com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_remove_unused_prompt(prompter, bad_prompt);
                        }
                    }
                }
            }
        }
        return prompter;
    }

    public static SubLObject rkf_sd_prompter_prune_bad_prompts(final SubLObject prompter) {
        final SubLObject bad_prompts = set.new_set(UNPROVIDED, UNPROVIDED);
        final SubLObject set_var = rkf_salient_descriptor_datastructures.rkf_sd_prompter_unused_prompts(prompter);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject prompt;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            prompt = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, prompt)) && (NIL != rkf_sd_bad_promptP(prompt))) {
                set.set_add(prompt, bad_prompts);
            }
        }
        final SubLObject set_contents_var2 = set.do_set_internal(bad_prompts);
        SubLObject basis_object2;
        SubLObject state2;
        SubLObject bad_prompt;
        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
            bad_prompt = set_contents.do_set_contents_next(basis_object2, state2);
            if (NIL != set_contents.do_set_contents_element_validP(state2, bad_prompt)) {
                rkf_sd_prompter_remove_unused_prompt(prompter, bad_prompt);
            }
        }
        return prompter;
    }

    public static final SubLObject rkf_sd_bad_promptP_alt(SubLObject prompt) {
        {
            SubLObject subprompts = rkf_sd_prompt_subprompts(prompt);
            SubLObject badP = makeBoolean(NIL == rkf_salient_descriptor.rkf_salient_descriptor_subprompts_p(subprompts));
            if (NIL == badP) {
                {
                    SubLObject justification = rkf_sd_prompt_justification(prompt);
                    SubLObject mt = rkf_sd_prompter_mt(rkf_sd_prompt_prompter(prompt));
                    if (NIL != arguments.supports_p(justification)) {
                        if (NIL == badP) {
                            {
                                SubLObject csome_list_var = justification;
                                SubLObject support = NIL;
                                for (support = csome_list_var.first(); !((NIL != badP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , support = csome_list_var.first()) {
                                    badP = makeBoolean(NIL == com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_ok_support_p(support, mt));
                                }
                            }
                        }
                    }
                }
            }
            return badP;
        }
    }

    public static SubLObject rkf_sd_bad_promptP(final SubLObject prompt) {
        final SubLObject subprompts = rkf_salient_descriptor_datastructures.rkf_sd_prompt_subprompts(prompt);
        SubLObject badP = makeBoolean(NIL == rkf_salient_descriptor.rkf_salient_descriptor_subprompts_p(subprompts));
        if (NIL == badP) {
            final SubLObject justification = rkf_salient_descriptor_datastructures.rkf_sd_prompt_justification(prompt);
            final SubLObject mt = rkf_salient_descriptor_datastructures.rkf_sd_prompter_mt(rkf_salient_descriptor_datastructures.rkf_sd_prompt_prompter(prompt));
            if ((NIL != arguments.supports_p(justification)) && (NIL == badP)) {
                SubLObject csome_list_var;
                SubLObject support;
                for (csome_list_var = justification, support = NIL, support = csome_list_var.first(); (NIL == badP) && (NIL != csome_list_var); badP = makeBoolean(NIL == rkf_sd_ok_support_p(support, mt)) , csome_list_var = csome_list_var.rest() , support = csome_list_var.first()) {
                }
            }
        }
        return badP;
    }

    public static final SubLObject rkf_sd_ok_support_p_alt(SubLObject support, SubLObject mt) {
        if (NIL != assertion_handles.assertion_p(support)) {
            return makeBoolean((NIL != assertions_high.valid_assertion(support, UNPROVIDED)) && (NIL == rkf_salient_descriptor.rkf_deprecated_sd_ruleP(support, mt)));
        } else {
            if (NIL != arguments.hl_support_p(support)) {
                return hl_supports.hl_verify(support);
            } else {
                return T;
            }
        }
    }

    public static SubLObject rkf_sd_ok_support_p(final SubLObject support, final SubLObject mt) {
        if (NIL != assertion_handles.assertion_p(support)) {
            return makeBoolean((NIL != assertions_high.valid_assertion(support, UNPROVIDED)) && (NIL == rkf_salient_descriptor.rkf_deprecated_sd_ruleP(support, mt)));
        }
        if (NIL != arguments.hl_support_p(support)) {
            return hl_supports.hl_verify(support);
        }
        return T;
    }

    /**
     *
     *
     * @return SYMBOLP; the most-recently applied tactic on PROMPTER, or NIL if none.
     */
    @LispMethod(comment = "@return SYMBOLP; the most-recently applied tactic on PROMPTER, or NIL if none.")
    public static final SubLObject rkf_salient_descriptor_prompter_last_tactic_alt(SubLObject prompter) {
        return rkf_salient_descriptor_prompter_lookup(prompter, $LAST_TACTIC, NIL);
    }

    /**
     *
     *
     * @return SYMBOLP; the most-recently applied tactic on PROMPTER, or NIL if none.
     */
    @LispMethod(comment = "@return SYMBOLP; the most-recently applied tactic on PROMPTER, or NIL if none.")
    public static SubLObject rkf_salient_descriptor_prompter_last_tactic(final SubLObject prompter) {
        return rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, $LAST_TACTIC, NIL);
    }

    /**
     *
     *
     * @return SYMBOLP; the currently active tactic to be applied on PROMPTER, or NIL if none.
     */
    @LispMethod(comment = "@return SYMBOLP; the currently active tactic to be applied on PROMPTER, or NIL if none.")
    public static final SubLObject rkf_salient_descriptor_prompter_current_tactic_alt(SubLObject prompter) {
        return rkf_sd_prompter_tactics(prompter).first();
    }

    /**
     *
     *
     * @return SYMBOLP; the currently active tactic to be applied on PROMPTER, or NIL if none.
     */
    @LispMethod(comment = "@return SYMBOLP; the currently active tactic to be applied on PROMPTER, or NIL if none.")
    public static SubLObject rkf_salient_descriptor_prompter_current_tactic(final SubLObject prompter) {
        return rkf_salient_descriptor_datastructures.rkf_sd_prompter_tactics(prompter).first();
    }

    /**
     *
     *
     * @return SYMBOLP; the next tactic that will be applied on PROMPTER after the current one,
    or NIL if none.
     */
    @LispMethod(comment = "@return SYMBOLP; the next tactic that will be applied on PROMPTER after the current one,\r\nor NIL if none.")
    public static final SubLObject rkf_salient_descriptor_prompter_next_tactic_alt(SubLObject prompter) {
        return second(rkf_sd_prompter_tactics(prompter));
    }

    /**
     *
     *
     * @return SYMBOLP; the next tactic that will be applied on PROMPTER after the current one,
    or NIL if none.
     */
    @LispMethod(comment = "@return SYMBOLP; the next tactic that will be applied on PROMPTER after the current one,\r\nor NIL if none.")
    public static SubLObject rkf_salient_descriptor_prompter_next_tactic(final SubLObject prompter) {
        return second(rkf_salient_descriptor_datastructures.rkf_sd_prompter_tactics(prompter));
    }

    /**
     *
     *
     * @return STRINGP; the currently active tactic to be applied on PROMPTER
     */
    @LispMethod(comment = "@return STRINGP; the currently active tactic to be applied on PROMPTER")
    public static final SubLObject rkf_salient_descriptor_prompter_current_tactic_string_alt(SubLObject prompter, SubLObject language_mt) {
        {
            SubLObject tactic = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_salient_descriptor_prompter_current_tactic(prompter);
            return com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_string_for_tactic(tactic, language_mt);
        }
    }

    /**
     *
     *
     * @return STRINGP; the currently active tactic to be applied on PROMPTER
     */
    @LispMethod(comment = "@return STRINGP; the currently active tactic to be applied on PROMPTER")
    public static SubLObject rkf_salient_descriptor_prompter_current_tactic_string(final SubLObject prompter, final SubLObject language_mt) {
        final SubLObject tactic = rkf_salient_descriptor_prompter_current_tactic(prompter);
        return rkf_sd_string_for_tactic(tactic, language_mt);
    }

    /**
     *
     *
     * @return STRINGP; the next tactic that will be applied on PROMPTER after the current one
     */
    @LispMethod(comment = "@return STRINGP; the next tactic that will be applied on PROMPTER after the current one")
    public static final SubLObject rkf_salient_descriptor_prompter_next_tactic_string_alt(SubLObject prompter, SubLObject language_mt) {
        {
            SubLObject tactic = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_salient_descriptor_prompter_next_tactic(prompter);
            return com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_string_for_tactic(tactic, language_mt);
        }
    }

    /**
     *
     *
     * @return STRINGP; the next tactic that will be applied on PROMPTER after the current one
     */
    @LispMethod(comment = "@return STRINGP; the next tactic that will be applied on PROMPTER after the current one")
    public static SubLObject rkf_salient_descriptor_prompter_next_tactic_string(final SubLObject prompter, final SubLObject language_mt) {
        final SubLObject tactic = rkf_salient_descriptor_prompter_next_tactic(prompter);
        return rkf_sd_string_for_tactic(tactic, language_mt);
    }

    /**
     *
     *
     * @return STRINGP; the tactic used to generate PROMPT
     */
    @LispMethod(comment = "@return STRINGP; the tactic used to generate PROMPT")
    public static final SubLObject rkf_salient_descriptor_prompt_tactic_string_alt(SubLObject prompt, SubLObject language_mt) {
        {
            SubLObject tactic = rkf_sd_prompt_tactic(prompt);
            return com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_string_for_tactic(tactic, language_mt);
        }
    }

    /**
     *
     *
     * @return STRINGP; the tactic used to generate PROMPT
     */
    @LispMethod(comment = "@return STRINGP; the tactic used to generate PROMPT")
    public static SubLObject rkf_salient_descriptor_prompt_tactic_string(final SubLObject prompt, final SubLObject language_mt) {
        final SubLObject tactic = rkf_salient_descriptor_datastructures.rkf_sd_prompt_tactic(prompt);
        return rkf_sd_string_for_tactic(tactic, language_mt);
    }

    public static final SubLObject rkf_sd_string_for_tactic_alt(SubLObject tactic, SubLObject language_mt) {
        if (NIL == tactic) {
            return $$$None;
        }
        return list_utilities.alist_lookup($rkf_sd_strings_for_tactics$.getGlobalValue(), tactic, symbol_function(EQL), $$$Unknown);
    }

    public static SubLObject rkf_sd_string_for_tactic(final SubLObject tactic, final SubLObject language_mt) {
        if (NIL == tactic) {
            return $$$None;
        }
        return list_utilities.alist_lookup($rkf_sd_strings_for_tactics$.getGlobalValue(), tactic, symbol_function(EQL), $$$Unknown);
    }

    public static final SubLObject rkf_sd_prompter_best_prompt_alt(SubLObject prompter) {
        {
            SubLObject best_prompt = rkf_salient_descriptor_prompter_lookup(prompter, $BEST_PROMPT, $RECOMPUTE);
            if (best_prompt == $RECOMPUTE) {
                best_prompt = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_update_best_prompt(prompter);
            }
            if (NIL != rkf_salient_descriptor_prompt_p(best_prompt)) {
                rkf_salient_descriptor_prompter_set(prompter, $BEST_PROMPT, $RECOMPUTE);
            } else {
                rkf_salient_descriptor_prompter_set(prompter, $BEST_PROMPT, $NONE);
            }
            return best_prompt;
        }
    }

    public static SubLObject rkf_sd_prompter_best_prompt(final SubLObject prompter) {
        SubLObject best_prompt = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, $BEST_PROMPT, $RECOMPUTE);
        if (best_prompt == $RECOMPUTE) {
            best_prompt = rkf_sd_prompter_update_best_prompt(prompter);
        }
        if (NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p(best_prompt)) {
            rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_set(prompter, $BEST_PROMPT, $RECOMPUTE);
        } else {
            rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_set(prompter, $BEST_PROMPT, $NONE);
        }
        return best_prompt;
    }

    public static final SubLObject rkf_sd_prompter_update_best_prompt_alt(SubLObject prompter) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_default = $NONE;
                SubLObject best_prompt = v_default;
                SubLObject lock = rkf_salient_descriptor_prompter_lookup(prompter, $LOCK, UNPROVIDED);
                SubLObject lock_6 = lock;
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock_6);
                    {
                        SubLObject set_contents_var = set.do_set_internal(rkf_sd_prompter_unused_prompts(prompter));
                        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                        SubLObject state = NIL;
                        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                            {
                                SubLObject prompt = set_contents.do_set_contents_next(basis_object, state);
                                if (NIL != set_contents.do_set_contents_element_validP(state, prompt)) {
                                    if (NIL != com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_prefer_promptP(prompter, prompt, best_prompt, v_default)) {
                                        best_prompt = prompt;
                                    }
                                }
                            }
                        }
                    }
                    if (!v_default.eql(best_prompt)) {
                        {
                            SubLObject _prev_bind_0 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
                            try {
                                rkf_salient_descriptor.$rkf_sd_problem_store$.bind(com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_find_or_set_problem_store(prompter), thread);
                                {
                                    SubLObject reuse_existingP = rkf_salient_descriptor.rkf_sd_problem_store_okP(rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread));
                                    {
                                        SubLObject _prev_bind_0_7 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
                                        try {
                                            rkf_salient_descriptor.$rkf_sd_problem_store$.bind(rkf_salient_descriptor.rkf_sd_find_or_make_problem_store(), thread);
                                            {
                                                SubLObject store = rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread);
                                                try {
                                                    com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompt_maybe_compute_subprompts(best_prompt);
                                                    if ($BAD == rkf_sd_prompt_subprompts(best_prompt)) {
                                                        com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_remove_unused_prompt(prompter, best_prompt);
                                                        best_prompt = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_update_best_prompt(prompter);
                                                    }
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            if (NIL == reuse_existingP) {
                                                                rkf_salient_descriptor.rkf_sd_free_problem_store(store);
                                                            }
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_8, thread);
                                                        }
                                                    }
                                                }
                                            }
                                        } finally {
                                            rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_0_7, thread);
                                        }
                                    }
                                }
                            } finally {
                                rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock_6);
                    }
                }
                rkf_salient_descriptor_prompter_set(prompter, $BEST_PROMPT, best_prompt);
                return best_prompt;
            }
        }
    }

    public static SubLObject rkf_sd_prompter_update_best_prompt(final SubLObject prompter) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject best_prompt;
        final SubLObject v_default = best_prompt = $NONE;
        final SubLObject lock = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, $LOCK, UNPROVIDED);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            final SubLObject set_var = rkf_salient_descriptor_datastructures.rkf_sd_prompter_unused_prompts(prompter);
            final SubLObject set_contents_var = set.do_set_internal(set_var);
            SubLObject basis_object;
            SubLObject state;
            SubLObject prompt;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                prompt = set_contents.do_set_contents_next(basis_object, state);
                if ((NIL != set_contents.do_set_contents_element_validP(state, prompt)) && (NIL != rkf_sd_prompter_prefer_promptP(prompter, prompt, best_prompt, v_default))) {
                    best_prompt = prompt;
                }
            }
            if (!v_default.eql(best_prompt)) {
                final SubLObject _prev_bind_0 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
                try {
                    rkf_salient_descriptor.$rkf_sd_problem_store$.bind(rkf_sd_prompter_find_or_set_problem_store(prompter), thread);
                    final SubLObject reuse_existingP = rkf_salient_descriptor.rkf_sd_problem_store_okP(rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread));
                    final SubLObject _prev_bind_0_$4 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
                    try {
                        rkf_salient_descriptor.$rkf_sd_problem_store$.bind(rkf_salient_descriptor.rkf_sd_find_or_make_problem_store(), thread);
                        final SubLObject store = rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread);
                        try {
                            rkf_sd_prompt_maybe_compute_subprompts(best_prompt);
                            if ($BAD == rkf_salient_descriptor_datastructures.rkf_sd_prompt_subprompts(best_prompt)) {
                                rkf_sd_prompter_remove_unused_prompt(prompter, best_prompt);
                                best_prompt = rkf_sd_prompter_update_best_prompt(prompter);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL == reuse_existingP) {
                                    rkf_salient_descriptor.rkf_sd_free_problem_store(store);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                            }
                        }
                    } finally {
                        rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_0_$4, thread);
                    }
                } finally {
                    rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_0, thread);
                }
            }
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_set(prompter, $BEST_PROMPT, best_prompt);
        return best_prompt;
    }

    public static final SubLObject rkf_salient_descriptor_prompter_sorted_unused_prompts_alt(SubLObject prompter) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject unused_prompts = set.set_element_list(rkf_sd_prompter_unused_prompts(prompter));
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = $rkf_prompter_sort_prompter$.currentBinding(thread);
                    try {
                        $rkf_prompter_sort_prompter$.bind(prompter, thread);
                        ans = Sort.stable_sort(unused_prompts, $sym33$RKF_SD_BETTER_PROMPT_, UNPROVIDED);
                    } finally {
                        $rkf_prompter_sort_prompter$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    public static SubLObject rkf_salient_descriptor_prompter_sorted_unused_prompts(final SubLObject prompter) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject unused_prompts = set.set_element_list(rkf_salient_descriptor_datastructures.rkf_sd_prompter_unused_prompts(prompter));
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = $rkf_prompter_sort_prompter$.currentBinding(thread);
        try {
            $rkf_prompter_sort_prompter$.bind(prompter, thread);
            ans = Sort.stable_sort(unused_prompts, $sym32$RKF_SD_BETTER_PROMPT_, UNPROVIDED);
        } finally {
            $rkf_prompter_sort_prompter$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static final SubLObject rkf_sd_better_promptP_alt(SubLObject prompt1, SubLObject prompt2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_prefer_promptP($rkf_prompter_sort_prompter$.getDynamicValue(thread), prompt1, prompt2, NIL);
        }
    }

    public static SubLObject rkf_sd_better_promptP(final SubLObject prompt1, final SubLObject prompt2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return rkf_sd_prompter_prefer_promptP($rkf_prompter_sort_prompter$.getDynamicValue(thread), prompt1, prompt2, NIL);
    }

    public static final SubLObject rkf_sd_prompter_knownP_alt(SubLObject prompter, SubLObject sentence, SubLObject mt, SubLObject exclude_indeterminatesP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
                    try {
                        rkf_salient_descriptor.$rkf_sd_problem_store$.bind(com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_find_or_set_problem_store(prompter), thread);
                        {
                            SubLObject reuse_existingP = rkf_salient_descriptor.rkf_sd_problem_store_okP(rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread));
                            {
                                SubLObject _prev_bind_0_9 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
                                try {
                                    rkf_salient_descriptor.$rkf_sd_problem_store$.bind(rkf_salient_descriptor.rkf_sd_find_or_make_problem_store(), thread);
                                    {
                                        SubLObject store = rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread);
                                        try {
                                            ans = rkf_salient_descriptor.rkf_sd_known(sentence, mt, exclude_indeterminatesP);
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0_10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    if (NIL == reuse_existingP) {
                                                        rkf_salient_descriptor.rkf_sd_free_problem_store(store);
                                                    }
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_10, thread);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_0_9, thread);
                                }
                            }
                        }
                    } finally {
                        rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    public static SubLObject rkf_sd_prompter_knownP(final SubLObject prompter, final SubLObject sentence, final SubLObject mt, final SubLObject exclude_indeterminatesP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
        try {
            rkf_salient_descriptor.$rkf_sd_problem_store$.bind(rkf_sd_prompter_find_or_set_problem_store(prompter), thread);
            final SubLObject reuse_existingP = rkf_salient_descriptor.rkf_sd_problem_store_okP(rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread));
            final SubLObject _prev_bind_0_$6 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
            try {
                rkf_salient_descriptor.$rkf_sd_problem_store$.bind(rkf_salient_descriptor.rkf_sd_find_or_make_problem_store(), thread);
                final SubLObject store = rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread);
                try {
                    ans = rkf_salient_descriptor.rkf_sd_known(sentence, mt, exclude_indeterminatesP);
                } finally {
                    final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        if (NIL == reuse_existingP) {
                            rkf_salient_descriptor.rkf_sd_free_problem_store(store);
                        }
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                    }
                }
            } finally {
                rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_0_$6, thread);
            }
        } finally {
            rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    /**
     *
     *
     * @return RKF-SALIENT-DESCRIPTOR-PROMPT-P or NIL.
     */
    @LispMethod(comment = "@return RKF-SALIENT-DESCRIPTOR-PROMPT-P or NIL.")
    public static final SubLObject rkf_salient_descriptor_prompter_find_prompt_by_id_alt(SubLObject prompter, SubLObject id) {
        SubLTrampolineFile.checkType(prompter, RKF_SALIENT_DESCRIPTOR_PROMPTER_P);
        SubLTrampolineFile.checkType(id, INTEGERP);
        {
            SubLObject ans = NIL;
            SubLObject set_contents_var = set.do_set_internal(rkf_sd_prompter_unused_prompts(prompter));
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); !((NIL != ans) || (NIL != set_contents.do_set_contents_doneP(basis_object, state))); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject prompt = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, prompt)) {
                        if (id.eql(rkf_sd_prompt_id(prompt))) {
                            ans = prompt;
                        }
                    }
                }
            }
            return ans;
        }
    }

    /**
     *
     *
     * @return RKF-SALIENT-DESCRIPTOR-PROMPT-P or NIL.
     */
    @LispMethod(comment = "@return RKF-SALIENT-DESCRIPTOR-PROMPT-P or NIL.")
    public static SubLObject rkf_salient_descriptor_prompter_find_prompt_by_id(final SubLObject prompter, final SubLObject id) {
        assert NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_p(prompter) : "! rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_p(prompter) " + ("rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_p(prompter) " + "CommonSymbols.NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_p(prompter) ") + prompter;
        assert NIL != integerp(id) : "! integerp(id) " + ("Types.integerp(id) " + "CommonSymbols.NIL != Types.integerp(id) ") + id;
        SubLObject ans = NIL;
        final SubLObject set_var = rkf_salient_descriptor_datastructures.rkf_sd_prompter_unused_prompts(prompter);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject prompt;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == ans) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
            prompt = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, prompt)) && id.eql(rkf_salient_descriptor_datastructures.rkf_sd_prompt_id(prompt))) {
                ans = prompt;
            }
        }
        return ans;
    }

    public static final SubLObject rkf_sd_prompt_maybe_compute_subprompts_alt(SubLObject prompt) {
        {
            SubLObject cached_subprompts = rkf_sd_prompt_subprompts(prompt);
            if (NIL == cached_subprompts) {
                com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompt_compute_subprompts(prompt);
            }
        }
        return prompt;
    }

    public static SubLObject rkf_sd_prompt_maybe_compute_subprompts(final SubLObject prompt) {
        final SubLObject cached_subprompts = rkf_salient_descriptor_datastructures.rkf_sd_prompt_subprompts(prompt);
        if (NIL == cached_subprompts) {
            rkf_sd_prompt_compute_subprompts(prompt);
        }
        return prompt;
    }

    public static final SubLObject rkf_sd_prompt_compute_subprompts_alt(SubLObject prompt) {
        {
            SubLObject prompter = rkf_sd_prompt_prompter(prompt);
            if (NIL == el_formula_p(rkf_sd_prompt_salient_property_sentence(prompt))) {
                if (NIL != rkf_sd_prompt_justification(prompt)) {
                    {
                        SubLObject seed_term = rkf_sd_prompter_seed_term(prompter);
                        rkf_sd_prompt_set_salient_property_sentence(prompt, rkf_salient_descriptor.rkf_salient_property_sentence_from_justification(seed_term, rkf_sd_prompt_justification(prompt)));
                    }
                }
            }
            {
                SubLObject sentence = rkf_sd_prompt_formula(prompt);
                SubLObject seed_term = rkf_sd_prompter_seed_term(prompter);
                SubLObject seed_term_type = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_compute_seed_term_type(seed_term);
                SubLObject mt = rkf_sd_prompter_mt(prompter);
                SubLObject confirmedP = (($EXAMPLE_INSTANCE == seed_term_type) || (NIL == el_existential_p(sentence))) ? ((SubLObject) (NIL)) : com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_knownP(prompter, sentence, mt, NIL);
                SubLObject salient_property_sentence = rkf_sd_prompt_salient_property_sentence(prompt);
                SubLObject subprompts = rkf_salient_descriptor.rkf_salient_descriptor_get_subprompts(sentence, seed_term, mt, confirmedP, salient_property_sentence);
                if ((NIL != confirmedP) && (NIL != collection_defns.el_sentence_askableP(sentence))) {
                    rkf_sd_prompt_set_formula(prompt, rkf_salient_descriptor.rkf_sd_existentially_unbind(sentence));
                }
                if (NIL != com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompt_bad_subpromptsP(prompt, subprompts)) {
                    subprompts = $BAD;
                }
                rkf_sd_prompt_set_subprompts(prompt, subprompts);
            }
        }
        return prompt;
    }

    public static SubLObject rkf_sd_prompt_compute_subprompts(final SubLObject prompt) {
        final SubLObject prompter = rkf_salient_descriptor_datastructures.rkf_sd_prompt_prompter(prompt);
        if ((NIL == el_formula_p(rkf_salient_descriptor_datastructures.rkf_sd_prompt_salient_property_sentence(prompt))) && (NIL != rkf_salient_descriptor_datastructures.rkf_sd_prompt_justification(prompt))) {
            final SubLObject seed_term = rkf_salient_descriptor_datastructures.rkf_sd_prompter_seed_term(prompter);
            rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_salient_property_sentence(prompt, rkf_salient_descriptor.rkf_salient_property_sentence_from_justification(seed_term, rkf_salient_descriptor_datastructures.rkf_sd_prompt_justification(prompt)));
        }
        final SubLObject sentence = rkf_salient_descriptor_datastructures.rkf_sd_prompt_formula(prompt);
        final SubLObject seed_term2 = rkf_salient_descriptor_datastructures.rkf_sd_prompter_seed_term(prompter);
        final SubLObject seed_term_type = rkf_sd_prompter_compute_seed_term_type(seed_term2);
        final SubLObject mt = rkf_salient_descriptor_datastructures.rkf_sd_prompter_mt(prompter);
        final SubLObject confirmedP = (($EXAMPLE_INSTANCE == seed_term_type) || (NIL == el_existential_p(sentence))) ? NIL : rkf_sd_prompter_knownP(prompter, sentence, mt, NIL);
        final SubLObject salient_property_sentence = rkf_salient_descriptor_datastructures.rkf_sd_prompt_salient_property_sentence(prompt);
        SubLObject subprompts = rkf_salient_descriptor.rkf_salient_descriptor_get_subprompts(sentence, seed_term2, mt, confirmedP, salient_property_sentence);
        if ((NIL != confirmedP) && (NIL != collection_defns.el_sentence_askableP(sentence))) {
            rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_formula(prompt, rkf_salient_descriptor.rkf_sd_existentially_unbind(sentence));
        }
        if (NIL != rkf_sd_prompt_bad_subpromptsP(prompt, subprompts)) {
            subprompts = $BAD;
        }
        rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_subprompts(prompt, subprompts);
        return prompt;
    }

    public static final SubLObject rkf_sd_prompt_missing_examplesP_alt(SubLObject prompt) {
        {
            SubLObject subprompts = rkf_sd_prompt_subprompts(prompt);
            SubLObject badP = NIL;
            if (NIL != rkf_salient_descriptor.rkf_salient_descriptor_subprompts_p(subprompts)) {
                if (NIL == badP) {
                    {
                        SubLObject csome_list_var = subprompts;
                        SubLObject subprompt = NIL;
                        for (subprompt = csome_list_var.first(); !((NIL != badP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , subprompt = csome_list_var.first()) {
                            {
                                SubLObject pcase_var = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_type(subprompt);
                                if (pcase_var.eql($SPECIFY)) {
                                    badP = sublisp_null(rkf_salient_descriptor.rkf_salient_descriptor_subprompt_examples(subprompt));
                                }
                            }
                        }
                    }
                }
            }
            return badP;
        }
    }

    public static SubLObject rkf_sd_prompt_missing_examplesP(final SubLObject prompt) {
        final SubLObject subprompts = rkf_salient_descriptor_datastructures.rkf_sd_prompt_subprompts(prompt);
        SubLObject badP = NIL;
        if ((NIL != rkf_salient_descriptor.rkf_salient_descriptor_subprompts_p(subprompts)) && (NIL == badP)) {
            SubLObject csome_list_var = subprompts;
            SubLObject subprompt = NIL;
            subprompt = csome_list_var.first();
            while ((NIL == badP) && (NIL != csome_list_var)) {
                final SubLObject pcase_var = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_type(subprompt);
                if (pcase_var.eql($SPECIFY)) {
                    badP = sublisp_null(rkf_salient_descriptor.rkf_salient_descriptor_subprompt_examples(subprompt));
                }
                csome_list_var = csome_list_var.rest();
                subprompt = csome_list_var.first();
            } 
        }
        return badP;
    }

    /**
     *
     *
     * @unknown to sidestep macro ordering problem
     */
    @LispMethod(comment = "@unknown to sidestep macro ordering problem")
    public static final SubLObject rkf_salient_descriptor_followup_prompt_via_prompter_alt(SubLObject prompter, SubLObject old_prompt, SubLObject confirmed_sentence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject state = rkf_salient_descriptor_prompter_lookup(prompter, $MEMOIZATION_STATE, memoization_state.current_memoization_state());
                SubLObject local_state = state;
                {
                    SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        {
                            SubLObject original_memoization_process = NIL;
                            if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                {
                                    SubLObject current_proc = current_process();
                                    if (NIL == original_memoization_process) {
                                        memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                    } else {
                                        if (original_memoization_process != current_proc) {
                                            Errors.error($str_alt22$Invalid_attempt_to_reuse_memoizat);
                                        }
                                    }
                                }
                            }
                            try {
                                result = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_salient_descriptor_followup_prompt(old_prompt, prompter, confirmed_sentence);
                            } finally {
                                {
                                    SubLObject _prev_bind_0_11 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_11, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @unknown to sidestep macro ordering problem
     */
    @LispMethod(comment = "@unknown to sidestep macro ordering problem")
    public static SubLObject rkf_salient_descriptor_followup_prompt_via_prompter(final SubLObject prompter, final SubLObject old_prompt, final SubLObject confirmed_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, $MEMOIZATION_STATE, memoization_state.current_memoization_state());
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                result = rkf_salient_descriptor_followup_prompt(old_prompt, prompter, confirmed_sentence);
            } finally {
                final SubLObject _prev_bind_0_$8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject rkf_salient_descriptor_followup_prompt_alt(SubLObject old_prompt, SubLObject prompter, SubLObject assert_sentence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_term = rkf_sd_prompter_seed_term(prompter);
                SubLObject mt = rkf_sd_prompter_mt(prompter);
                SubLObject salient_property_sentence = rkf_sd_prompt_salient_property_sentence(old_prompt);
                SubLObject tactic = rkf_sd_prompt_tactic(old_prompt);
                SubLObject deducible_cnfs = rkf_sd_prompt_deducible_cnfs(old_prompt);
                SubLObject justification = rkf_sd_prompt_justification(old_prompt);
                SubLObject new_prompt = NIL;
                if ((NIL != el_negation_p(assert_sentence)) && (NIL != com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.positive_gaf_cnfs_p(deducible_cnfs))) {
                    {
                        SubLObject consequent = clauses.pos_lits(deducible_cnfs.first()).first();
                        new_prompt = new_rkf_sd_prompt();
                        rkf_sd_prompt_set_formula(new_prompt, make_negation(consequent));
                    }
                }
                if (NIL == rkf_salient_descriptor_prompt_p(new_prompt)) {
                    {
                        SubLObject _prev_bind_0 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
                        try {
                            rkf_salient_descriptor.$rkf_sd_problem_store$.bind(com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_find_or_set_problem_store(prompter), thread);
                            {
                                SubLObject reuse_existingP = rkf_salient_descriptor.rkf_sd_problem_store_okP(rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread));
                                {
                                    SubLObject _prev_bind_0_12 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
                                    try {
                                        rkf_salient_descriptor.$rkf_sd_problem_store$.bind(rkf_salient_descriptor.rkf_sd_find_or_make_problem_store(), thread);
                                        {
                                            SubLObject store = rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread);
                                            try {
                                                {
                                                    SubLObject subprompts = rkf_salient_descriptor.rkf_salient_descriptor_get_subprompts(assert_sentence, v_term, mt, T, salient_property_sentence);
                                                    if (NIL != rkf_salient_descriptor.rkf_salient_descriptor_subprompts_p(subprompts)) {
                                                        new_prompt = new_rkf_sd_prompt();
                                                        rkf_sd_prompt_set_subprompts(new_prompt, subprompts);
                                                    }
                                                }
                                            } finally {
                                                {
                                                    SubLObject _prev_bind_0_13 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        if (NIL == reuse_existingP) {
                                                            rkf_salient_descriptor.rkf_sd_free_problem_store(store);
                                                        }
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_13, thread);
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_0_12, thread);
                                    }
                                }
                            }
                        } finally {
                            rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                if (NIL != rkf_salient_descriptor_prompt_p(new_prompt)) {
                    rkf_sd_prompt_set_justification(new_prompt, justification);
                    rkf_sd_prompt_set_tactic(new_prompt, tactic);
                    com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_add_prompt(prompter, new_prompt);
                    com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_mark_prompt_used(prompter, new_prompt);
                }
                return new_prompt;
            }
        }
    }

    public static SubLObject rkf_salient_descriptor_followup_prompt(final SubLObject old_prompt, final SubLObject prompter, final SubLObject assert_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_term = rkf_salient_descriptor_datastructures.rkf_sd_prompter_seed_term(prompter);
        final SubLObject mt = rkf_salient_descriptor_datastructures.rkf_sd_prompter_mt(prompter);
        final SubLObject salient_property_sentence = rkf_salient_descriptor_datastructures.rkf_sd_prompt_salient_property_sentence(old_prompt);
        final SubLObject tactic = rkf_salient_descriptor_datastructures.rkf_sd_prompt_tactic(old_prompt);
        final SubLObject deducible_cnfs = rkf_salient_descriptor_datastructures.rkf_sd_prompt_deducible_cnfs(old_prompt);
        final SubLObject justification = rkf_salient_descriptor_datastructures.rkf_sd_prompt_justification(old_prompt);
        SubLObject new_prompt = NIL;
        if ((NIL != el_negation_p(assert_sentence)) && (NIL != positive_gaf_cnfs_p(deducible_cnfs))) {
            final SubLObject consequent = clauses.pos_lits(deducible_cnfs.first()).first();
            new_prompt = rkf_salient_descriptor_datastructures.new_rkf_sd_prompt();
            rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_formula(new_prompt, make_negation(consequent));
        }
        if (NIL == rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p(new_prompt)) {
            final SubLObject _prev_bind_0 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
            try {
                rkf_salient_descriptor.$rkf_sd_problem_store$.bind(rkf_sd_prompter_find_or_set_problem_store(prompter), thread);
                final SubLObject reuse_existingP = rkf_salient_descriptor.rkf_sd_problem_store_okP(rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread));
                final SubLObject _prev_bind_0_$9 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
                try {
                    rkf_salient_descriptor.$rkf_sd_problem_store$.bind(rkf_salient_descriptor.rkf_sd_find_or_make_problem_store(), thread);
                    final SubLObject store = rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread);
                    try {
                        final SubLObject subprompts = rkf_salient_descriptor.rkf_salient_descriptor_get_subprompts(assert_sentence, v_term, mt, T, salient_property_sentence);
                        if (NIL != rkf_salient_descriptor.rkf_salient_descriptor_subprompts_p(subprompts)) {
                            new_prompt = rkf_salient_descriptor_datastructures.new_rkf_sd_prompt();
                            rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_subprompts(new_prompt, subprompts);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL == reuse_existingP) {
                                rkf_salient_descriptor.rkf_sd_free_problem_store(store);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                        }
                    }
                } finally {
                    rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_0_$9, thread);
                }
            } finally {
                rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_0, thread);
            }
        }
        if (NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p(new_prompt)) {
            rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_justification(new_prompt, justification);
            rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_tactic(new_prompt, tactic);
            rkf_sd_prompter_add_prompt(prompter, new_prompt);
            rkf_sd_prompter_mark_prompt_used(prompter, new_prompt);
        }
        return new_prompt;
    }

    public static final SubLObject positive_gaf_cnfs_p_alt(SubLObject cnfs) {
        {
            SubLObject ans = NIL;
            if (NIL != list_utilities.singletonP(cnfs)) {
                {
                    SubLObject cnf = cnfs.first();
                    SubLObject datum = cnf;
                    SubLObject current = datum;
                    SubLObject neg_lits = NIL;
                    SubLObject pos_lits = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt37);
                    neg_lits = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt37);
                    pos_lits = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (((NIL == neg_lits) && (NIL != list_utilities.singletonP(pos_lits))) && (NIL != groundP(pos_lits.first(), $sym38$EL_VAR_))) {
                            ans = T;
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt37);
                    }
                }
            }
            return ans;
        }
    }

    public static SubLObject positive_gaf_cnfs_p(final SubLObject cnfs) {
        SubLObject ans = NIL;
        if (NIL != list_utilities.singletonP(cnfs)) {
            final SubLObject cnf = cnfs.first();
            SubLObject current;
            final SubLObject datum = current = cnf;
            SubLObject neg_lits = NIL;
            SubLObject pos_lits = NIL;
            destructuring_bind_must_consp(current, datum, $list36);
            neg_lits = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list36);
            pos_lits = current.first();
            current = current.rest();
            if (NIL == current) {
                if (((NIL == neg_lits) && (NIL != list_utilities.singletonP(pos_lits))) && (NIL != groundP(pos_lits.first(), $sym37$EL_VAR_))) {
                    ans = T;
                }
            } else {
                cdestructuring_bind_error(datum, $list36);
            }
        }
        return ans;
    }

    public static final SubLObject rkf_sd_prompter_add_prompt_alt(SubLObject prompter, SubLObject new_prompt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject id = integer_sequence_generator.integer_sequence_generator_next(rkf_sd_prompter_isg(prompter));
                rkf_sd_prompt_set_id(new_prompt, id);
            }
            rkf_sd_prompt_set_prompter(new_prompt, prompter);
            {
                SubLObject _prev_bind_0 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
                try {
                    rkf_salient_descriptor.$rkf_sd_problem_store$.bind(com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_find_or_set_problem_store(prompter), thread);
                    {
                        SubLObject reuse_existingP = rkf_salient_descriptor.rkf_sd_problem_store_okP(rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread));
                        {
                            SubLObject _prev_bind_0_14 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
                            try {
                                rkf_salient_descriptor.$rkf_sd_problem_store$.bind(rkf_salient_descriptor.rkf_sd_find_or_make_problem_store(), thread);
                                {
                                    SubLObject store = rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread);
                                    try {
                                        com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompt_maybe_compute_subprompts(new_prompt);
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0_15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                if (NIL == reuse_existingP) {
                                                    rkf_salient_descriptor.rkf_sd_free_problem_store(store);
                                                }
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_15, thread);
                                            }
                                        }
                                    }
                                }
                            } finally {
                                rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_0_14, thread);
                            }
                        }
                    }
                } finally {
                    rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_0, thread);
                }
            }
            {
                SubLObject foundP = NIL;
                {
                    SubLObject set_contents_var = set.do_set_internal(rkf_sd_prompter_unused_prompts(prompter));
                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                    SubLObject state = NIL;
                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); !((NIL != foundP) || (NIL != set_contents.do_set_contents_doneP(basis_object, state))); state = set_contents.do_set_contents_update_state(state)) {
                        {
                            SubLObject prompt = set_contents.do_set_contents_next(basis_object, state);
                            if (NIL != set_contents.do_set_contents_element_validP(state, prompt)) {
                                foundP = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompt_E(prompt, new_prompt);
                            }
                        }
                    }
                }
                {
                    SubLObject set_contents_var = set.do_set_internal(rkf_sd_prompter_used_prompts(prompter));
                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                    SubLObject state = NIL;
                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); !((NIL != foundP) || (NIL != set_contents.do_set_contents_doneP(basis_object, state))); state = set_contents.do_set_contents_update_state(state)) {
                        {
                            SubLObject prompt = set_contents.do_set_contents_next(basis_object, state);
                            if (NIL != set_contents.do_set_contents_element_validP(state, prompt)) {
                                foundP = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompt_E(prompt, new_prompt);
                            }
                        }
                    }
                }
                if (NIL == foundP) {
                    com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_add_to_unused_prompts(prompter, new_prompt);
                }
            }
            return prompter;
        }
    }

    public static SubLObject rkf_sd_prompter_add_prompt(final SubLObject prompter, final SubLObject new_prompt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject id = integer_sequence_generator.integer_sequence_generator_next(rkf_salient_descriptor_datastructures.rkf_sd_prompter_isg(prompter));
        rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_id(new_prompt, id);
        rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_prompter(new_prompt, prompter);
        final SubLObject _prev_bind_0 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
        try {
            rkf_salient_descriptor.$rkf_sd_problem_store$.bind(rkf_sd_prompter_find_or_set_problem_store(prompter), thread);
            final SubLObject reuse_existingP = rkf_salient_descriptor.rkf_sd_problem_store_okP(rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread));
            final SubLObject _prev_bind_0_$11 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
            try {
                rkf_salient_descriptor.$rkf_sd_problem_store$.bind(rkf_salient_descriptor.rkf_sd_find_or_make_problem_store(), thread);
                final SubLObject store = rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread);
                try {
                    rkf_sd_prompt_maybe_compute_subprompts(new_prompt);
                } finally {
                    final SubLObject _prev_bind_0_$12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        if (NIL == reuse_existingP) {
                            rkf_salient_descriptor.rkf_sd_free_problem_store(store);
                        }
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                    }
                }
            } finally {
                rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_0_$11, thread);
            }
        } finally {
            rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_0, thread);
        }
        SubLObject foundP = NIL;
        SubLObject set_var = rkf_salient_descriptor_datastructures.rkf_sd_prompter_unused_prompts(prompter);
        SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject prompt;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == foundP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
            prompt = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, prompt)) {
                foundP = rkf_sd_prompt_E(prompt, new_prompt);
            }
        }
        set_var = rkf_salient_descriptor_datastructures.rkf_sd_prompter_used_prompts(prompter);
        set_contents_var = set.do_set_internal(set_var);
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == foundP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
            prompt = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, prompt)) {
                foundP = rkf_sd_prompt_E(prompt, new_prompt);
            }
        }
        if (NIL == foundP) {
            rkf_sd_prompter_add_to_unused_prompts(prompter, new_prompt);
        }
        return prompter;
    }

    public static final SubLObject rkf_sd_prompter_add_to_unused_prompts_alt(SubLObject prompter, SubLObject new_prompt) {
        if (rkf_sd_prompt_prompter(new_prompt) != prompter) {
            rkf_sd_prompt_set_prompter(new_prompt, prompter);
        }
        {
            SubLObject addedP = set.set_add(new_prompt, rkf_sd_prompter_unused_prompts(prompter));
            return NIL != addedP ? ((SubLObject) ($ADDED)) : $ALREADY_PRESENT;
        }
    }

    public static SubLObject rkf_sd_prompter_add_to_unused_prompts(final SubLObject prompter, final SubLObject new_prompt) {
        if (!rkf_salient_descriptor_datastructures.rkf_sd_prompt_prompter(new_prompt).eql(prompter)) {
            rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_prompter(new_prompt, prompter);
        }
        final SubLObject addedP = set.set_add(new_prompt, rkf_salient_descriptor_datastructures.rkf_sd_prompter_unused_prompts(prompter));
        return NIL != addedP ? $ADDED : $ALREADY_PRESENT;
    }

    public static final SubLObject rkf_sd_prompt_E_alt(SubLObject prompt1, SubLObject prompt2) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompt_formula_E(rkf_sd_prompt_formula(prompt1), rkf_sd_prompt_formula(prompt2))) || ((NIL != rkf_sd_prompt_subprompts(prompt1)) && rkf_sd_prompt_subprompts(prompt1).equal(rkf_sd_prompt_subprompts(prompt2))));
    }

    public static SubLObject rkf_sd_prompt_E(final SubLObject prompt1, final SubLObject prompt2) {
        return makeBoolean((NIL != rkf_sd_prompt_formula_E(rkf_salient_descriptor_datastructures.rkf_sd_prompt_formula(prompt1), rkf_salient_descriptor_datastructures.rkf_sd_prompt_formula(prompt2))) || ((NIL != rkf_salient_descriptor_datastructures.rkf_sd_prompt_subprompts(prompt1)) && rkf_salient_descriptor_datastructures.rkf_sd_prompt_subprompts(prompt1).equal(rkf_salient_descriptor_datastructures.rkf_sd_prompt_subprompts(prompt2))));
    }

    public static final SubLObject rkf_sd_prompt_formula_E_alt(SubLObject formula1, SubLObject formula2) {
        {
            SubLObject equalP = makeBoolean((NIL != same_formula_arity_p(formula1, formula2, UNPROVIDED)) && (NIL != czer_utilities.equals_elP(formula1, formula2, UNPROVIDED, UNPROVIDED)));
            return equalP;
        }
    }

    public static SubLObject rkf_sd_prompt_formula_E(final SubLObject formula1, final SubLObject formula2) {
        final SubLObject equalP = makeBoolean((NIL != same_formula_arity_p(formula1, formula2, UNPROVIDED)) && (NIL != czer_utilities.equals_elP(formula1, formula2, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        return equalP;
    }

    public static final SubLObject rkf_sd_prompter_find_prompt_by_id_string_alt(SubLObject prompter, SubLObject id_string) {
        SubLTrampolineFile.checkType(id_string, STRINGP);
        return com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_find_prompt_by_id(prompter, parse_integer(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject rkf_sd_prompter_find_prompt_by_id_string(final SubLObject prompter, final SubLObject id_string) {
        assert NIL != stringp(id_string) : "! stringp(id_string) " + ("Types.stringp(id_string) " + "CommonSymbols.NIL != Types.stringp(id_string) ") + id_string;
        return rkf_sd_prompter_find_prompt_by_id(prompter, parse_integer(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject rkf_sd_prompter_find_prompt_by_id_alt(SubLObject prompter, SubLObject prompt_id) {
        {
            SubLObject set_contents_var = set.do_set_internal(rkf_sd_prompter_used_prompts(prompter));
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject prompt = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, prompt)) {
                        if (NIL != rkf_salient_descriptor_prompt_p(prompt)) {
                            if (rkf_sd_prompt_id(prompt).eql(prompt_id)) {
                                return prompt;
                            }
                        }
                    }
                }
            }
        }
        {
            SubLObject set_contents_var = set.do_set_internal(rkf_sd_prompter_unused_prompts(prompter));
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject prompt = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, prompt)) {
                        if (rkf_sd_prompt_id(prompt).eql(prompt_id)) {
                            return prompt;
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject rkf_sd_prompter_find_prompt_by_id(final SubLObject prompter, final SubLObject prompt_id) {
        SubLObject set_var = rkf_salient_descriptor_datastructures.rkf_sd_prompter_used_prompts(prompter);
        SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject prompt;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            prompt = set_contents.do_set_contents_next(basis_object, state);
            if (((NIL != set_contents.do_set_contents_element_validP(state, prompt)) && (NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p(prompt))) && rkf_salient_descriptor_datastructures.rkf_sd_prompt_id(prompt).eql(prompt_id)) {
                return prompt;
            }
        }
        set_var = rkf_salient_descriptor_datastructures.rkf_sd_prompter_unused_prompts(prompter);
        set_contents_var = set.do_set_internal(set_var);
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            prompt = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, prompt)) && rkf_salient_descriptor_datastructures.rkf_sd_prompt_id(prompt).eql(prompt_id)) {
                return prompt;
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return BOOLEAN; Prefer CONTENDER over CHAMP?
     */
    @LispMethod(comment = "@return BOOLEAN; Prefer CONTENDER over CHAMP?")
    public static final SubLObject rkf_sd_prompter_prefer_promptP_alt(SubLObject prompter, SubLObject contender, SubLObject champ, SubLObject v_default) {
        if (champ.eql(v_default)) {
            return T;
        } else {
            if (contender.eql(v_default)) {
                return NIL;
            } else {
                if (NIL == rkf_salient_descriptor_prompt_p(champ)) {
                    return T;
                } else {
                    if (NIL == rkf_salient_descriptor_prompt_p(contender)) {
                        return NIL;
                    } else {
                        if ($BAD == rkf_sd_prompt_subprompts(champ)) {
                            return T;
                        } else {
                            if ($BAD == rkf_sd_prompt_subprompts(contender)) {
                                return NIL;
                            } else {
                                if (NIL != com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompt_localityG(prompter, contender, champ)) {
                                    return T;
                                } else {
                                    if (NIL != com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompt_localityG(prompter, champ, contender)) {
                                        return NIL;
                                    } else {
                                        if (NIL != com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompt_generalityL(contender, champ)) {
                                            return T;
                                        } else {
                                            if (NIL != com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompt_generalityL(champ, contender)) {
                                                return NIL;
                                            } else {
                                                if (NIL != com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompt_fewer_lits_p(contender, champ)) {
                                                    return T;
                                                } else {
                                                    if (NIL != com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompt_fewer_lits_p(champ, contender)) {
                                                        return NIL;
                                                    } else {
                                                        if ((NIL == com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompt_missing_examplesP(contender)) && (NIL != com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompt_missing_examplesP(champ))) {
                                                            return T;
                                                        } else {
                                                            if ((NIL == com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompt_missing_examplesP(champ)) && (NIL != com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompt_missing_examplesP(contender))) {
                                                                return NIL;
                                                            } else {
                                                                return NIL;
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
    }

    /**
     *
     *
     * @return BOOLEAN; Prefer CONTENDER over CHAMP?
     */
    @LispMethod(comment = "@return BOOLEAN; Prefer CONTENDER over CHAMP?")
    public static SubLObject rkf_sd_prompter_prefer_promptP(final SubLObject prompter, final SubLObject contender, final SubLObject champ, final SubLObject v_default) {
        if (champ.eql(v_default)) {
            return T;
        }
        if (contender.eql(v_default)) {
            return NIL;
        }
        if (NIL == rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p(champ)) {
            return T;
        }
        if (NIL == rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p(contender)) {
            return NIL;
        }
        if ($BAD == rkf_salient_descriptor_datastructures.rkf_sd_prompt_subprompts(champ)) {
            return T;
        }
        if ($BAD == rkf_salient_descriptor_datastructures.rkf_sd_prompt_subprompts(contender)) {
            return NIL;
        }
        if (NIL != rkf_sd_prompt_localityG(prompter, contender, champ)) {
            return T;
        }
        if (NIL != rkf_sd_prompt_localityG(prompter, champ, contender)) {
            return NIL;
        }
        if (NIL != rkf_sd_prompt_generalityL(contender, champ)) {
            return T;
        }
        if (NIL != rkf_sd_prompt_generalityL(champ, contender)) {
            return NIL;
        }
        if (NIL != rkf_sd_prompt_fewer_lits_p(contender, champ)) {
            return T;
        }
        if (NIL != rkf_sd_prompt_fewer_lits_p(champ, contender)) {
            return NIL;
        }
        if ((NIL == rkf_sd_prompt_missing_examplesP(contender)) && (NIL != rkf_sd_prompt_missing_examplesP(champ))) {
            return T;
        }
        if ((NIL == rkf_sd_prompt_missing_examplesP(champ)) && (NIL != rkf_sd_prompt_missing_examplesP(contender))) {
            return NIL;
        }
        return NIL;
    }

    public static final SubLObject rkf_sd_prompt_localityG_alt(SubLObject prompter, SubLObject prompt1, SubLObject prompt2) {
        {
            SubLObject local_mt = rkf_sd_prompter_mt(prompter);
            SubLObject local_supports1 = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompt_local_supports(local_mt, prompt1);
            SubLObject local_supports2 = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompt_local_supports(local_mt, prompt2);
            return makeBoolean((NIL != hlmt.hlmt_p(local_mt)) && (((NIL != local_supports1) && (NIL == local_supports2)) || (NIL != com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_more_recent_supportsP(local_supports1, local_supports2))));
        }
    }

    public static SubLObject rkf_sd_prompt_localityG(final SubLObject prompter, final SubLObject prompt1, final SubLObject prompt2) {
        final SubLObject local_mt = rkf_salient_descriptor_datastructures.rkf_sd_prompter_mt(prompter);
        final SubLObject local_supports1 = rkf_sd_prompt_local_supports(local_mt, prompt1);
        final SubLObject local_supports2 = rkf_sd_prompt_local_supports(local_mt, prompt2);
        return makeBoolean((NIL != hlmt.hlmt_p(local_mt)) && (((NIL != local_supports1) && (NIL == local_supports2)) || (NIL != rkf_sd_more_recent_supportsP(local_supports1, local_supports2))));
    }

    public static final SubLObject rkf_sd_prompt_local_supports_alt(SubLObject local_mt, SubLObject prompt) {
        {
            SubLObject justification = rkf_sd_prompt_justification(prompt);
            SubLObject supports = (NIL != arguments.supports_p(justification)) ? ((SubLObject) (justification)) : NIL;
            return list_utilities.find_all(local_mt, supports, symbol_function(EQ), SUPPORT_MT);
        }
    }

    public static SubLObject rkf_sd_prompt_local_supports(final SubLObject local_mt, final SubLObject prompt) {
        final SubLObject justification = rkf_salient_descriptor_datastructures.rkf_sd_prompt_justification(prompt);
        final SubLObject supports = (NIL != arguments.supports_p(justification)) ? justification : NIL;
        return list_utilities.find_all(local_mt, supports, symbol_function(EQ), SUPPORT_MT);
    }

    public static final SubLObject rkf_sd_more_recent_supportsP_alt(SubLObject supports1, SubLObject supports2) {
        {
            SubLObject times1 = list_utilities.remove_if_not(UNIVERSAL_DATE_P, Mapping.mapcar(ASSERTED_WHEN, list_utilities.remove_if_not(ASSERTION_P, supports1, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject times2 = list_utilities.remove_if_not(UNIVERSAL_DATE_P, Mapping.mapcar(ASSERTED_WHEN, list_utilities.remove_if_not(ASSERTION_P, supports2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return makeBoolean(((NIL != times1) && (NIL != times2)) && number_utilities.maximum(times1, UNPROVIDED).numG(number_utilities.maximum(times2, UNPROVIDED)));
        }
    }

    public static SubLObject rkf_sd_more_recent_supportsP(final SubLObject supports1, final SubLObject supports2) {
        final SubLObject times1 = list_utilities.remove_if_not(UNIVERSAL_DATE_P, Mapping.mapcar(ASSERTED_WHEN, list_utilities.remove_if_not(ASSERTION_P, supports1, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject times2 = list_utilities.remove_if_not(UNIVERSAL_DATE_P, Mapping.mapcar(ASSERTED_WHEN, list_utilities.remove_if_not(ASSERTION_P, supports2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return makeBoolean(((NIL != times1) && (NIL != times2)) && number_utilities.maximum(times1, UNPROVIDED).numG(number_utilities.maximum(times2, UNPROVIDED)));
    }

    public static final SubLObject rkf_sd_prompt_generalityL_alt(SubLObject prompt1, SubLObject prompt2) {
        {
            SubLObject sentence1 = rkf_sd_prompt_salient_property_sentence(prompt1);
            SubLObject sentence2 = rkf_sd_prompt_salient_property_sentence(prompt2);
            return makeBoolean(((NIL != el_formula_p(sentence1)) && (NIL != el_formula_p(sentence2))) && (NIL != com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_sentence_generalityL(sentence1, sentence2)));
        }
    }

    public static SubLObject rkf_sd_prompt_generalityL(final SubLObject prompt1, final SubLObject prompt2) {
        final SubLObject sentence1 = rkf_salient_descriptor_datastructures.rkf_sd_prompt_salient_property_sentence(prompt1);
        final SubLObject sentence2 = rkf_salient_descriptor_datastructures.rkf_sd_prompt_salient_property_sentence(prompt2);
        return makeBoolean(((NIL != el_formula_p(sentence1)) && (NIL != el_formula_p(sentence2))) && (NIL != rkf_sd_sentence_generalityL(sentence1, sentence2)));
    }

    public static final SubLObject rkf_sd_sentence_generalityL_alt(SubLObject sentence1, SubLObject sentence2) {
        {
            SubLObject terms1 = NIL;
            SubLObject terms2 = NIL;
            {
                SubLObject terms = cycl_utilities.formula_terms(sentence1, $IGNORE);
                SubLObject cdolist_list_var = terms;
                SubLObject term1 = NIL;
                for (term1 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , term1 = cdolist_list_var.first()) {
                    if (NIL == cycl_utilities.expression_find(term1, sentence2, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        {
                            SubLObject item_var = term1;
                            if (NIL == member(item_var, terms1, symbol_function(EQL), symbol_function(IDENTITY))) {
                                terms1 = cons(item_var, terms1);
                            }
                        }
                    }
                }
            }
            {
                SubLObject terms = cycl_utilities.formula_terms(sentence2, $IGNORE);
                SubLObject cdolist_list_var = terms;
                SubLObject term2 = NIL;
                for (term2 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , term2 = cdolist_list_var.first()) {
                    if (NIL == cycl_utilities.expression_find(term2, sentence1, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        {
                            SubLObject item_var = term2;
                            if (NIL == member(item_var, terms2, symbol_function(EQL), symbol_function(IDENTITY))) {
                                terms2 = cons(item_var, terms2);
                            }
                        }
                    }
                }
            }
            return numL(com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_terms_generality(terms1), com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_terms_generality(terms2));
        }
    }

    public static SubLObject rkf_sd_sentence_generalityL(final SubLObject sentence1, final SubLObject sentence2) {
        SubLObject terms1 = NIL;
        SubLObject terms2 = NIL;
        SubLObject cdolist_list_var;
        SubLObject terms3 = cdolist_list_var = cycl_utilities.formula_terms(sentence1, $IGNORE);
        SubLObject term1 = NIL;
        term1 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == cycl_utilities.expression_find(term1, sentence2, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                final SubLObject item_var = term1;
                if (NIL == member(item_var, terms1, symbol_function(EQL), symbol_function(IDENTITY))) {
                    terms1 = cons(item_var, terms1);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            term1 = cdolist_list_var.first();
        } 
        terms3 = cdolist_list_var = cycl_utilities.formula_terms(sentence2, $IGNORE);
        SubLObject term2 = NIL;
        term2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == cycl_utilities.expression_find(term2, sentence1, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                final SubLObject item_var = term2;
                if (NIL == member(item_var, terms2, symbol_function(EQL), symbol_function(IDENTITY))) {
                    terms2 = cons(item_var, terms2);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            term2 = cdolist_list_var.first();
        } 
        return numL(rkf_sd_terms_generality(terms1), rkf_sd_terms_generality(terms2));
    }

    public static final SubLObject rkf_sd_sentence_generality_alt(SubLObject sentence) {
        return apply(symbol_function($sym47$_), Mapping.mapcar(RKF_SD_TERM_GENERALITY, cycl_utilities.formula_args(sentence, UNPROVIDED)));
    }

    public static SubLObject rkf_sd_sentence_generality(final SubLObject sentence) {
        return apply(symbol_function($sym46$_), Mapping.mapcar(RKF_SD_TERM_GENERALITY, cycl_utilities.formula_args(sentence, UNPROVIDED)));
    }

    public static final SubLObject rkf_sd_terms_generality_alt(SubLObject terms) {
        return apply(symbol_function($sym47$_), Mapping.mapcar(RKF_SD_TERM_GENERALITY, terms));
    }

    public static SubLObject rkf_sd_terms_generality(final SubLObject terms) {
        return apply(symbol_function($sym46$_), Mapping.mapcar(RKF_SD_TERM_GENERALITY, terms));
    }

    public static final SubLObject rkf_sd_term_generality_alt(SubLObject v_term) {
        return cardinality_estimates.generality_estimate(v_term);
    }

    public static SubLObject rkf_sd_term_generality(final SubLObject v_term) {
        return cardinality_estimates.generality_estimate(v_term);
    }

    public static final SubLObject rkf_sd_prompt_fewer_lits_p_alt(SubLObject prompt1, SubLObject prompt2) {
        {
            SubLObject count1 = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompt_min_lit_count(prompt1);
            SubLObject count2 = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompt_min_lit_count(prompt2);
            return makeBoolean(count1.isInteger() && ((!count2.isInteger()) || count1.numL(count2)));
        }
    }

    public static SubLObject rkf_sd_prompt_fewer_lits_p(final SubLObject prompt1, final SubLObject prompt2) {
        final SubLObject count1 = rkf_sd_prompt_min_lit_count(prompt1);
        final SubLObject count2 = rkf_sd_prompt_min_lit_count(prompt2);
        return makeBoolean(count1.isInteger() && ((!count2.isInteger()) || count1.numL(count2)));
    }

    public static final SubLObject rkf_sd_prompt_min_lit_count_alt(SubLObject prompt) {
        {
            SubLObject min = $NONE;
            SubLObject cdolist_list_var = rkf_sd_prompt_deducible_cnfs(prompt);
            SubLObject cnf = NIL;
            for (cnf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cnf = cdolist_list_var.first()) {
                {
                    SubLObject count = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_cnf_lit_count(cnf);
                    if (count.isInteger() && ((min == $NONE) || count.numL(min))) {
                        min = count;
                    }
                }
            }
            return min;
        }
    }

    public static SubLObject rkf_sd_prompt_min_lit_count(final SubLObject prompt) {
        SubLObject min = $NONE;
        SubLObject cdolist_list_var = rkf_salient_descriptor_datastructures.rkf_sd_prompt_deducible_cnfs(prompt);
        SubLObject cnf = NIL;
        cnf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject count = rkf_sd_cnf_lit_count(cnf);
            if (count.isInteger() && ((min == $NONE) || count.numL(min))) {
                min = count;
            }
            cdolist_list_var = cdolist_list_var.rest();
            cnf = cdolist_list_var.first();
        } 
        return min;
    }

    public static final SubLObject rkf_sd_cnf_lit_count_alt(SubLObject cnf) {
        return add(length(clauses.pos_lits(cnf)), length(clauses.neg_lits(cnf)));
    }

    public static SubLObject rkf_sd_cnf_lit_count(final SubLObject cnf) {
        return add(length(clauses.pos_lits(cnf)), length(clauses.neg_lits(cnf)));
    }

    /**
     * Execute BODY with the tactics specified in TABLE.
     */
    @LispMethod(comment = "Execute BODY with the tactics specified in TABLE.")
    public static final SubLObject with_rkf_salient_descriptor_seed_term_tactics_table_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt50);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject table = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt50);
                    table = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(PROGN, listS(CHECK_TYPE, table, $list_alt53), listS(CLET, list(list($rkf_sd_seed_term_tactics_table$, table)), append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt50);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Execute BODY with the tactics specified in TABLE.
     */
    @LispMethod(comment = "Execute BODY with the tactics specified in TABLE.")
    public static SubLObject with_rkf_salient_descriptor_seed_term_tactics_table(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list49);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject table = NIL;
        destructuring_bind_must_consp(current, datum, $list49);
        table = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(PROGN, listS(CHECK_TYPE, table, $list52), listS(CLET, list(list($rkf_sd_seed_term_tactics_table$, table)), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list49);
        return NIL;
    }

    public static final SubLObject rkf_sd_prompter_tactics_for_seed_term_type_alt(SubLObject seed_term_type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return list_utilities.alist_lookup($rkf_sd_seed_term_tactics_table$.getDynamicValue(thread), seed_term_type, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject rkf_sd_prompter_tactics_for_seed_term_type(final SubLObject seed_term_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.alist_lookup($rkf_sd_seed_term_tactics_table$.getDynamicValue(thread), seed_term_type, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject rkf_sd_prompter_compute_seed_term_type_alt(SubLObject seed_term) {
        if (NIL != isa.isaP(seed_term, $$Microtheory, UNPROVIDED, UNPROVIDED)) {
            return $MT;
        } else {
            if (NIL != forts.fort_p(seed_term)) {
                return $FORT;
            } else {
                if (NIL != rkf_domain_examples.rkf_generic_example_p(seed_term)) {
                    return $EXAMPLE_INSTANCE;
                } else {
                    if (NIL == assertion_handles.assertion_p(seed_term)) {
                        return $UNKNOWN;
                    } else {
                        if (NIL != assertions_high.gaf_assertionP(seed_term)) {
                            return $GAF;
                        } else {
                            return $RULE;
                        }
                    }
                }
            }
        }
    }

    public static SubLObject rkf_sd_prompter_compute_seed_term_type(final SubLObject seed_term) {
        if (NIL != isa.isaP(seed_term, $$Microtheory, UNPROVIDED, UNPROVIDED)) {
            return $MT;
        }
        if (NIL != forts.fort_p(seed_term)) {
            return $FORT;
        }
        if (NIL != rkf_domain_examples.rkf_generic_example_p(seed_term)) {
            return $EXAMPLE_INSTANCE;
        }
        if (NIL == assertion_handles.assertion_p(seed_term)) {
            return $UNKNOWN;
        }
        if (NIL != assertions_high.gaf_assertionP(seed_term)) {
            return $GAF;
        }
        return $RULE;
    }

    public static final SubLObject formula_template_fort_for_rkf_salient_descriptor_prompt_alt(SubLObject prompt, SubLObject topic_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(prompt, RKF_SALIENT_DESCRIPTOR_PROMPT_P);
            SubLTrampolineFile.checkType(topic_id, FORT_P);
            {
                SubLObject raw_formula = rkf_salient_descriptor_prompt_formula(prompt);
                SubLObject formula = rkf_salient_descriptor.rkf_sd_existentially_unbind(raw_formula);
                SubLObject prompter = rkf_salient_descriptor_prompt_prompter(prompt);
                SubLObject focal_term = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_salient_descriptor_prompter_seed_term(prompter);
                SubLObject el_focal_term = cycl_utilities.hl_to_el(focal_term);
                SubLObject example_sentences = NIL;
                SubLObject data_assert_mt = NIL;
                SubLObject single_entryP = NIL;
                {
                    SubLObject _prev_bind_0 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
                    try {
                        rkf_salient_descriptor.$rkf_sd_problem_store$.bind(com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_find_or_set_problem_store(prompter), thread);
                        {
                            SubLObject reuse_existingP = rkf_salient_descriptor.rkf_sd_problem_store_okP(rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread));
                            {
                                SubLObject _prev_bind_0_16 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
                                try {
                                    rkf_salient_descriptor.$rkf_sd_problem_store$.bind(rkf_salient_descriptor.rkf_sd_find_or_make_problem_store(), thread);
                                    {
                                        SubLObject store = rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread);
                                        try {
                                            {
                                                SubLObject prompter_mt = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_salient_descriptor_prompter_mt(prompter);
                                                example_sentences = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompt_get_precedent_example_sentences(prompt, focal_term);
                                                data_assert_mt = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_fet_data_assert_mt(formula, prompter_mt);
                                                single_entryP = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_single_entry_promptP(prompt, prompter_mt);
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0_17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    if (NIL == reuse_existingP) {
                                                        rkf_salient_descriptor.rkf_sd_free_problem_store(store);
                                                    }
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_17, thread);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_0_16, thread);
                                }
                            }
                        }
                    } finally {
                        rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_0, thread);
                    }
                }
                return com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.find_or_create_formula_template_fort(topic_id, el_focal_term, formula, example_sentences, data_assert_mt, single_entryP);
            }
        }
    }

    public static SubLObject formula_template_fort_for_rkf_salient_descriptor_prompt(final SubLObject prompt, final SubLObject topic_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p(prompt) : "! rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p(prompt) " + ("rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p(prompt) " + "CommonSymbols.NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p(prompt) ") + prompt;
        assert NIL != forts.fort_p(topic_id) : "! forts.fort_p(topic_id) " + ("forts.fort_p(topic_id) " + "CommonSymbols.NIL != forts.fort_p(topic_id) ") + topic_id;
        final SubLObject raw_formula = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_formula(prompt);
        final SubLObject formula = rkf_salient_descriptor.rkf_sd_existentially_unbind(raw_formula);
        final SubLObject prompter = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_prompter(prompt);
        final SubLObject focal_term = rkf_salient_descriptor_prompter_seed_term(prompter);
        final SubLObject el_focal_term = cycl_utilities.hl_to_el(focal_term);
        SubLObject example_sentences = NIL;
        SubLObject data_assert_mt = NIL;
        SubLObject single_entryP = NIL;
        final SubLObject _prev_bind_0 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
        try {
            rkf_salient_descriptor.$rkf_sd_problem_store$.bind(rkf_sd_prompter_find_or_set_problem_store(prompter), thread);
            final SubLObject reuse_existingP = rkf_salient_descriptor.rkf_sd_problem_store_okP(rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread));
            final SubLObject _prev_bind_0_$13 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
            try {
                rkf_salient_descriptor.$rkf_sd_problem_store$.bind(rkf_salient_descriptor.rkf_sd_find_or_make_problem_store(), thread);
                final SubLObject store = rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread);
                try {
                    final SubLObject prompter_mt = rkf_salient_descriptor_prompter_mt(prompter);
                    example_sentences = rkf_sd_prompt_get_precedent_example_sentences(prompt, focal_term);
                    data_assert_mt = rkf_sd_fet_data_assert_mt(formula, prompter_mt);
                    single_entryP = rkf_sd_single_entry_promptP(prompt, prompter_mt);
                } finally {
                    final SubLObject _prev_bind_0_$14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        if (NIL == reuse_existingP) {
                            rkf_salient_descriptor.rkf_sd_free_problem_store(store);
                        }
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                    }
                }
            } finally {
                rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_0_$13, thread);
            }
        } finally {
            rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_0, thread);
        }
        return find_or_create_formula_template_fort(topic_id, el_focal_term, formula, example_sentences, data_assert_mt, single_entryP);
    }

    public static final SubLObject find_or_create_formula_template_fort_alt(SubLObject topic_id, SubLObject el_focal_term, SubLObject formula, SubLObject example_sentences, SubLObject data_assert_mt, SubLObject single_entryP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject focal_term_arg_position = cycl_utilities.arg_positions_bfs(el_focal_term, formula, symbol_function(EQUAL)).first();
                SubLObject candidate_replacement_info = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_candidate_replacement_info(focal_term_arg_position, formula);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == cycl_utilities.arg_position_p(focal_term_arg_position)) {
                        Errors.error($str_alt62$Couldn_t_find__S_in__S_, el_focal_term, formula);
                    }
                }
                thread.resetMultipleValues();
                {
                    SubLObject definitional_properties = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.formula_template_definitional_properties(focal_term_arg_position, topic_id, candidate_replacement_info, formula, example_sentences, single_entryP, data_assert_mt);
                    SubLObject match_properties = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject template_fort = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_fet_find_match(match_properties, UNPROVIDED);
                        if (NIL == template_fort) {
                            template_fort = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_new_formula_template_fort(topic_id);
                            {
                                SubLObject cdolist_list_var = definitional_properties;
                                SubLObject property = NIL;
                                for (property = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , property = cdolist_list_var.first()) {
                                    {
                                        SubLObject sentence = properties.property_to_sentence(property, template_fort);
                                        com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_fet_assert(sentence);
                                    }
                                }
                            }
                        }
                        return template_fort;
                    }
                }
            }
        }
    }

    public static SubLObject find_or_create_formula_template_fort(final SubLObject topic_id, final SubLObject el_focal_term, final SubLObject formula, final SubLObject example_sentences, final SubLObject data_assert_mt, final SubLObject single_entryP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject focal_term_arg_position = cycl_utilities.arg_positions_bfs(el_focal_term, formula, symbol_function(EQUAL)).first();
        final SubLObject candidate_replacement_info = rkf_sd_candidate_replacement_info(focal_term_arg_position, formula);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == cycl_utilities.arg_position_p(focal_term_arg_position))) {
            Errors.error($str61$Couldn_t_find__S_in__S_, el_focal_term, formula);
        }
        thread.resetMultipleValues();
        final SubLObject definitional_properties = formula_template_definitional_properties(focal_term_arg_position, topic_id, candidate_replacement_info, formula, example_sentences, single_entryP, data_assert_mt);
        final SubLObject match_properties = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject template_fort = rkf_sd_fet_find_match(match_properties, UNPROVIDED);
        if (NIL == template_fort) {
            template_fort = rkf_sd_new_formula_template_fort(topic_id);
            SubLObject cdolist_list_var = definitional_properties;
            SubLObject property = NIL;
            property = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject sentence = properties.property_to_sentence(property, template_fort);
                rkf_sd_fet_assert(sentence);
                cdolist_list_var = cdolist_list_var.rest();
                property = cdolist_list_var.first();
            } 
        }
        return template_fort;
    }

    /**
     *
     *
     * @return LISTP of CycL properties derived from the input parameters.
     */
    @LispMethod(comment = "@return LISTP of CycL properties derived from the input parameters.")
    public static final SubLObject formula_template_definitional_properties_alt(SubLObject focal_term_arg_position, SubLObject topic_id, SubLObject candidate_replacement_info, SubLObject formula, SubLObject example_sentences, SubLObject single_entryP, SubLObject data_assert_mt) {
        {
            SubLObject definitional_properties = NIL;
            SubLObject match_properties = NIL;
            SubLObject template = $TEMPLATE;
            definitional_properties = cons(properties.sentence_to_property(list($const64$focalTermPositionForFormulaTempla, template, cycl_utilities.make_cycl_arg_position(focal_term_arg_position), topic_id), template), definitional_properties);
            definitional_properties = cons(properties.sentence_to_property(list($$formulaForFormulaTemplate, template, formula), template), definitional_properties);
            match_properties = definitional_properties;
            {
                SubLObject cdolist_list_var = example_sentences;
                SubLObject example_sentence = NIL;
                for (example_sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , example_sentence = cdolist_list_var.first()) {
                    definitional_properties = cons(properties.sentence_to_property(list($$formulaTemplateExample, template, example_sentence), template), definitional_properties);
                }
            }
            {
                SubLObject order = ONE_INTEGER;
                SubLObject generality_cutoff = $int$100;
                SubLObject cdolist_list_var = candidate_replacement_info;
                SubLObject cons = NIL;
                for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                    {
                        SubLObject datum = cons;
                        SubLObject current = datum;
                        SubLObject arg_pos = NIL;
                        SubLObject info = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt68);
                        arg_pos = current.first();
                        current = current.rest();
                        info = current;
                        {
                            SubLObject cycl_arg_pos = cycl_utilities.make_cycl_arg_position(arg_pos);
                            SubLObject datum_18 = info;
                            SubLObject current_19 = datum_18;
                            SubLObject gloss = NIL;
                            SubLObject collection = NIL;
                            SubLObject explanation = NIL;
                            destructuring_bind_must_consp(current_19, datum_18, $list_alt69);
                            gloss = current_19.first();
                            current_19 = current_19.rest();
                            destructuring_bind_must_consp(current_19, datum_18, $list_alt69);
                            collection = current_19.first();
                            current_19 = current_19.rest();
                            destructuring_bind_must_consp(current_19, datum_18, $list_alt69);
                            explanation = current_19.first();
                            current_19 = current_19.rest();
                            if (NIL == current_19) {
                                if (cardinality_estimates.generality_estimate(collection).numG(generality_cutoff) || ((NIL != el_formula_with_operator_p(collection, $$SpecsFn)) && cardinality_estimates.generality_estimate(cycl_utilities.nat_arg1(collection, UNPROVIDED)).numG(generality_cutoff))) {
                                    definitional_properties = cons(properties.sentence_to_property(list($const71$templateReplacementsInvisibleForP, template, cycl_arg_pos), template), definitional_properties);
                                } else {
                                    definitional_properties = cons(properties.sentence_to_property(list($$candidateReplacementForPosition, template, cycl_arg_pos, collection), template), definitional_properties);
                                }
                                definitional_properties = cons(properties.sentence_to_property(list($$glossForFormulaTemplate, template, topic_id, cycl_arg_pos, gloss, order), template), definitional_properties);
                                definitional_properties = cons(properties.sentence_to_property(list($$formulaTemplateArgExplanation, template, topic_id, cycl_arg_pos, explanation), template), definitional_properties);
                            } else {
                                cdestructuring_bind_error(datum_18, $list_alt69);
                            }
                        }
                        order = add(order, ONE_INTEGER);
                    }
                }
            }
            definitional_properties = cons(properties.sentence_to_property(list($$assertMtForFormulaTemplate, template, data_assert_mt), template), definitional_properties);
            definitional_properties = cons(properties.sentence_to_property(list($$assertionFormatForFormulaTemplate, template, NIL != single_entryP ? ((SubLObject) ($$SingleAssertionEntry)) : $$MultipleAssertionEntry, topic_id), template), definitional_properties);
            return values(definitional_properties, match_properties);
        }
    }

    /**
     *
     *
     * @return LISTP of CycL properties derived from the input parameters.
     */
    @LispMethod(comment = "@return LISTP of CycL properties derived from the input parameters.")
    public static SubLObject formula_template_definitional_properties(final SubLObject focal_term_arg_position, final SubLObject topic_id, final SubLObject candidate_replacement_info, final SubLObject formula, final SubLObject example_sentences, final SubLObject single_entryP, final SubLObject data_assert_mt) {
        SubLObject definitional_properties = NIL;
        SubLObject match_properties = NIL;
        final SubLObject template = $TEMPLATE;
        definitional_properties = cons(properties.sentence_to_property(list($const63$focalTermPositionForFormulaTempla, template, cycl_utilities.make_cycl_arg_position(focal_term_arg_position), topic_id), template), definitional_properties);
        definitional_properties = match_properties = cons(properties.sentence_to_property(list($$formulaForFormulaTemplate, template, formula), template), definitional_properties);
        SubLObject cdolist_list_var = example_sentences;
        SubLObject example_sentence = NIL;
        example_sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            definitional_properties = cons(properties.sentence_to_property(list($$formulaTemplateExample, template, example_sentence), template), definitional_properties);
            cdolist_list_var = cdolist_list_var.rest();
            example_sentence = cdolist_list_var.first();
        } 
        SubLObject order = ONE_INTEGER;
        final SubLObject generality_cutoff = $int$100;
        SubLObject cdolist_list_var2 = candidate_replacement_info;
        SubLObject cons = NIL;
        cons = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject arg_pos = NIL;
            SubLObject info = NIL;
            destructuring_bind_must_consp(current, datum, $list67);
            arg_pos = current.first();
            current = info = current.rest();
            final SubLObject cycl_arg_pos = cycl_utilities.make_cycl_arg_position(arg_pos);
            SubLObject current_$16;
            final SubLObject datum_$15 = current_$16 = info;
            SubLObject gloss = NIL;
            SubLObject collection = NIL;
            SubLObject explanation = NIL;
            destructuring_bind_must_consp(current_$16, datum_$15, $list68);
            gloss = current_$16.first();
            current_$16 = current_$16.rest();
            destructuring_bind_must_consp(current_$16, datum_$15, $list68);
            collection = current_$16.first();
            current_$16 = current_$16.rest();
            destructuring_bind_must_consp(current_$16, datum_$15, $list68);
            explanation = current_$16.first();
            current_$16 = current_$16.rest();
            if (NIL == current_$16) {
                if (cardinality_estimates.generality_estimate(collection).numG(generality_cutoff) || ((NIL != el_formula_with_operator_p(collection, $$SpecsFn)) && cardinality_estimates.generality_estimate(cycl_utilities.nat_arg1(collection, UNPROVIDED)).numG(generality_cutoff))) {
                    definitional_properties = cons(properties.sentence_to_property(list($const70$templateReplacementsInvisibleForP, template, cycl_arg_pos), template), definitional_properties);
                } else {
                    definitional_properties = cons(properties.sentence_to_property(list($$candidateReplacementForPosition, template, cycl_arg_pos, collection), template), definitional_properties);
                }
                definitional_properties = cons(properties.sentence_to_property(list($$glossForFormulaTemplate, template, topic_id, cycl_arg_pos, gloss, order), template), definitional_properties);
                definitional_properties = cons(properties.sentence_to_property(list($$formulaTemplateArgExplanation, template, topic_id, cycl_arg_pos, explanation), template), definitional_properties);
            } else {
                cdestructuring_bind_error(datum_$15, $list68);
            }
            order = add(order, ONE_INTEGER);
            cdolist_list_var2 = cdolist_list_var2.rest();
            cons = cdolist_list_var2.first();
        } 
        definitional_properties = cons(properties.sentence_to_property(list($$assertMtForFormulaTemplate, template, data_assert_mt), template), definitional_properties);
        definitional_properties = cons(properties.sentence_to_property(list($$assertionFormatForFormulaTemplate, template, NIL != single_entryP ? $$SingleAssertionEntry : $$MultipleAssertionEntry, topic_id), template), definitional_properties);
        return values(definitional_properties, match_properties);
    }

    /**
     *
     *
     * @return HLMT-P; In which to assert info entered via the FET for FORMULA.
     */
    @LispMethod(comment = "@return HLMT-P; In which to assert info entered via the FET for FORMULA.")
    public static final SubLObject rkf_sd_fet_data_assert_mt_alt(SubLObject formula, SubLObject prompter_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject principled_mt = NIL;
                SubLObject unprincipled_mt = $$DataForNLMt;
                if (NIL != fboundp(SUGGEST_MT)) {
                    principled_mt = eval(list(SUGGEST_MT, list(QUOTE, formula)));
                } else {
                    {
                        SubLObject mt_var = $sym82$_MT;
                        principled_mt = inference_kernel.new_cyc_query(list($$defaultDefiningMtForSentence, formula, mt_var), prompter_mt, list(new SubLObject[]{ $MAX_NUMBER, ONE_INTEGER, $MAX_TRANSFORMATION_DEPTH, ONE_INTEGER, $PROBLEM_STORE, rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread), $MAX_TIME, $int$30, $RETURN, list($TEMPLATE, mt_var) })).first();
                    }
                }
                return NIL != principled_mt ? ((SubLObject) (principled_mt)) : unprincipled_mt;
            }
        }
    }

    /**
     *
     *
     * @return HLMT-P; In which to assert info entered via the FET for FORMULA.
     */
    @LispMethod(comment = "@return HLMT-P; In which to assert info entered via the FET for FORMULA.")
    public static SubLObject rkf_sd_fet_data_assert_mt(final SubLObject formula, final SubLObject prompter_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject principled_mt = NIL;
        final SubLObject unprincipled_mt = $$DataForNLMt;
        if (NIL != fboundp(SUGGEST_MT)) {
            principled_mt = eval(list(SUGGEST_MT, list(QUOTE, formula)));
        } else {
            final SubLObject mt_var = $sym81$_MT;
            principled_mt = inference_kernel.new_cyc_query(list($$defaultDefiningMtForSentence, formula, mt_var), prompter_mt, list(new SubLObject[]{ $MAX_NUMBER, ONE_INTEGER, $MAX_TRANSFORMATION_DEPTH, ONE_INTEGER, $PROBLEM_STORE, rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread), $MAX_TIME, $int$30, $RETURN, list($TEMPLATE, mt_var) })).first();
        }
        return NIL != principled_mt ? principled_mt : unprincipled_mt;
    }

    /**
     *
     *
     * @return FORT-P or NIL; A template FORT that has DEFINITIONAL-PROPERTIES.
     */
    @LispMethod(comment = "@return FORT-P or NIL; A template FORT that has DEFINITIONAL-PROPERTIES.")
    public static final SubLObject rkf_sd_fet_find_match_alt(SubLObject definitional_properties, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$GKEFormulaTemplatesMt;
        }
        {
            SubLObject definitional_lits = NIL;
            SubLObject template_var = variables.get_variable(ZERO_INTEGER);
            SubLObject badP = NIL;
            SubLObject match = NIL;
            if (NIL == badP) {
                {
                    SubLObject csome_list_var = definitional_properties;
                    SubLObject property = NIL;
                    for (property = csome_list_var.first(); !((NIL != badP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , property = csome_list_var.first()) {
                        {
                            SubLObject sentence = properties.property_to_sentence(property, template_var);
                            if (NIL != cycl_grammar.cycl_atomic_sentence_p(sentence)) {
                                definitional_lits = cons(sentence, definitional_lits);
                            } else {
                                badP = T;
                            }
                        }
                    }
                }
            }
            if (NIL == badP) {
                {
                    SubLObject neg_lits = NIL;
                    SubLObject dnf = clauses.make_clause(neg_lits, definitional_lits);
                    SubLObject answers = inference_kernel.new_cyc_query_from_dnf(dnf, mt, NIL, listS($RETURN, list($TEMPLATE, template_var), $list_alt90));
                    match = answers.first();
                }
            }
            return match;
        }
    }

    /**
     *
     *
     * @return FORT-P or NIL; A template FORT that has DEFINITIONAL-PROPERTIES.
     */
    @LispMethod(comment = "@return FORT-P or NIL; A template FORT that has DEFINITIONAL-PROPERTIES.")
    public static SubLObject rkf_sd_fet_find_match(final SubLObject definitional_properties, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$GKEFormulaTemplatesMt;
        }
        SubLObject definitional_lits = NIL;
        final SubLObject template_var = variables.get_variable(ZERO_INTEGER);
        SubLObject badP = NIL;
        SubLObject match = NIL;
        if (NIL == badP) {
            SubLObject csome_list_var = definitional_properties;
            SubLObject property = NIL;
            property = csome_list_var.first();
            while ((NIL == badP) && (NIL != csome_list_var)) {
                final SubLObject sentence = properties.property_to_sentence(property, template_var);
                if (NIL != cycl_grammar.cycl_atomic_sentence_p(sentence)) {
                    definitional_lits = cons(sentence, definitional_lits);
                } else {
                    badP = T;
                }
                csome_list_var = csome_list_var.rest();
                property = csome_list_var.first();
            } 
        }
        if (NIL == badP) {
            final SubLObject neg_lits = NIL;
            final SubLObject dnf = clauses.make_clause(neg_lits, definitional_lits);
            final SubLObject answers = inference_kernel.new_cyc_query_from_dnf(dnf, mt, NIL, listS($RETURN, list($TEMPLATE, template_var), $list89));
            match = answers.first();
        }
        return match;
    }

    /**
     * Get new template info into the KB, so it can be slurped.
     */
    @LispMethod(comment = "Get new template info into the KB, so it can be slurped.")
    public static final SubLObject rkf_sd_fet_assert_alt(SubLObject sentence) {
        {
            SubLObject result = NIL;
            SubLObject template_info_mt = $$GKEFormulaTemplatesMt;
            result = rkf_assertion_utilities.rkf_assert_now(sentence, template_info_mt);
            return result;
        }
    }

    /**
     * Get new template info into the KB, so it can be slurped.
     */
    @LispMethod(comment = "Get new template info into the KB, so it can be slurped.")
    public static SubLObject rkf_sd_fet_assert(final SubLObject sentence) {
        SubLObject result = NIL;
        final SubLObject template_info_mt = $$GKEFormulaTemplatesMt;
        result = rkf_assertion_utilities.rkf_assert_now(sentence, template_info_mt);
        return result;
    }

    public static final SubLObject rkf_sd_new_formula_template_fort_alt(SubLObject topic_id) {
        {
            SubLObject focal_term_type = formula_template_utilities.focal_term_type_for_topic_type(topic_id, $$InferencePSC);
            SubLObject collection = (NIL != forts.fort_p(focal_term_type)) ? ((SubLObject) (focal_term_type)) : NIL != forts.fort_p(topic_id) ? ((SubLObject) (topic_id)) : $$FormulaTemplate;
            SubLObject name = rkf_term_utilities.rkf_new_constant_name_from_collection(collection);
            SubLObject template_id = ke.ke_create_now(name, UNPROVIDED);
            if (NIL != valid_constantP(template_id, UNPROVIDED)) {
                com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_fet_assert(listS($$isa, template_id, $list_alt94));
                com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_fet_assert(list($$formulaTemplateHasType, template_id, topic_id));
                {
                    SubLObject pred = constants_high.find_constant($str_alt96$constantNameAutoGeneratedFromColl);
                    if (NIL != pred) {
                        rkf_assertion_utilities.rkf_assert_now(make_ternary_formula(pred, template_id, collection, name), $$BaseKB);
                    }
                }
            }
            return template_id;
        }
    }

    public static SubLObject rkf_sd_new_formula_template_fort(final SubLObject topic_id) {
        final SubLObject focal_term_type = formula_template_utilities.focal_term_type_for_topic_type(topic_id, $$InferencePSC);
        final SubLObject collection = (NIL != forts.fort_p(focal_term_type)) ? focal_term_type : NIL != forts.fort_p(topic_id) ? topic_id : $$FormulaTemplate;
        final SubLObject name = rkf_term_utilities.rkf_new_constant_name_from_collection(collection);
        final SubLObject template_id = ke.ke_create_now(name, UNPROVIDED);
        if (NIL != valid_constantP(template_id, UNPROVIDED)) {
            rkf_sd_fet_assert(listS($$isa, template_id, $list93));
            rkf_sd_fet_assert(list($$formulaTemplateHasType, template_id, topic_id));
            final SubLObject pred = constants_high.find_constant($str95$constantNameAutoGeneratedFromColl);
            if (NIL != pred) {
                rkf_assertion_utilities.rkf_assert_now(make_ternary_formula(pred, template_id, collection, name), $$BaseKB);
            }
        }
        return template_id;
    }

    /**
     *
     *
     * @return ALIST-P of arg-position -> constraint-collection mappings.
     */
    @LispMethod(comment = "@return ALIST-P of arg-position -> constraint-collection mappings.")
    public static final SubLObject rkf_sd_candidate_replacement_info_alt(SubLObject focal_term_arg_position, SubLObject formula) {
        {
            SubLObject ans = NIL;
            SubLObject focal_term = cycl_utilities.formula_arg_position(formula, focal_term_arg_position, UNPROVIDED);
            SubLObject cdolist_list_var = cycl_utilities.arg_positions_if_bfs(RKF_GENERIC_EXAMPLE_P, formula, UNPROVIDED);
            SubLObject arg_position = NIL;
            for (arg_position = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg_position = cdolist_list_var.first()) {
                {
                    SubLObject v_term = cycl_utilities.formula_arg_position(formula, arg_position, UNPROVIDED);
                    if (!v_term.equal(focal_term)) {
                        {
                            SubLObject gloss = formula_template_utilities.make_fet_gloss_for_arg_position(arg_position, formula, UNPROVIDED);
                            SubLObject explanation = formula_template_utilities.make_fet_explanation_for_arg_position(arg_position, focal_term_arg_position, formula, UNPROVIDED);
                            SubLObject collection = cycl_utilities.nat_arg1(v_term, UNPROVIDED);
                            ans = list_utilities.alist_enter(ans, arg_position, list(gloss, collection, explanation), UNPROVIDED);
                        }
                    }
                }
            }
            return ans;
        }
    }

    /**
     *
     *
     * @return ALIST-P of arg-position -> constraint-collection mappings.
     */
    @LispMethod(comment = "@return ALIST-P of arg-position -> constraint-collection mappings.")
    public static SubLObject rkf_sd_candidate_replacement_info(final SubLObject focal_term_arg_position, final SubLObject formula) {
        SubLObject ans = NIL;
        final SubLObject focal_term = cycl_utilities.formula_arg_position(formula, focal_term_arg_position, UNPROVIDED);
        SubLObject cdolist_list_var = cycl_utilities.arg_positions_if_bfs(RKF_GENERIC_EXAMPLE_P, formula, UNPROVIDED);
        SubLObject arg_position = NIL;
        arg_position = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject v_term = cycl_utilities.formula_arg_position(formula, arg_position, UNPROVIDED);
            if (!v_term.equal(focal_term)) {
                final SubLObject gloss = formula_template_utilities.make_fet_gloss_for_arg_position(arg_position, formula, UNPROVIDED);
                final SubLObject explanation = formula_template_utilities.make_fet_explanation_for_arg_position(arg_position, focal_term_arg_position, formula, UNPROVIDED);
                final SubLObject collection = cycl_utilities.nat_arg1(v_term, UNPROVIDED);
                ans = list_utilities.alist_enter(ans, arg_position, list(gloss, collection, explanation), UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg_position = cdolist_list_var.first();
        } 
        return ans;
    }

    public static final SubLObject rkf_sd_prompt_get_var_arg_positions_alt(SubLObject prompt, SubLObject formula) {
        {
            SubLObject arg_positions = NIL;
            SubLObject cdolist_list_var = rkf_salient_descriptor_prompt_subprompts(prompt);
            SubLObject subprompt = NIL;
            for (subprompt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subprompt = cdolist_list_var.first()) {
                {
                    SubLObject var = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_var(subprompt);
                    if (NIL != cycl_variables.el_varP(var)) {
                        {
                            SubLObject var_arg_positions = cycl_utilities.arg_positions_bfs(var, formula, UNPROVIDED);
                            arg_positions = append(arg_positions, var_arg_positions);
                        }
                    }
                }
            }
            return arg_positions;
        }
    }

    public static SubLObject rkf_sd_prompt_get_var_arg_positions(final SubLObject prompt, final SubLObject formula) {
        SubLObject arg_positions = NIL;
        SubLObject cdolist_list_var = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_subprompts(prompt);
        SubLObject subprompt = NIL;
        subprompt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject var = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_var(subprompt);
            if (NIL != cycl_variables.el_varP(var)) {
                final SubLObject var_arg_positions = cycl_utilities.arg_positions_bfs(var, formula, UNPROVIDED);
                arg_positions = append(arg_positions, var_arg_positions);
            }
            cdolist_list_var = cdolist_list_var.rest();
            subprompt = cdolist_list_var.first();
        } 
        return arg_positions;
    }

    public static final SubLObject rkf_sd_prompt_get_precedent_example_sentences_alt(SubLObject prompt, SubLObject focal_term) {
        {
            SubLObject example_sentences = NIL;
            SubLObject cdolist_list_var = rkf_salient_descriptor_prompt_subprompts(prompt);
            SubLObject subprompt = NIL;
            for (subprompt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subprompt = cdolist_list_var.first()) {
                {
                    SubLObject examples = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_examples(subprompt);
                    if (examples.isList()) {
                        {
                            SubLObject var = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_var(subprompt);
                            SubLObject assert_sentence_template = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_assert_sentence(subprompt, $ANYTHING, var);
                            SubLObject cdolist_list_var_20 = examples;
                            SubLObject example = NIL;
                            for (example = cdolist_list_var_20.first(); NIL != cdolist_list_var_20; cdolist_list_var_20 = cdolist_list_var_20.rest() , example = cdolist_list_var_20.first()) {
                                if (NIL != rkf_sd_precedent_example_p(example)) {
                                    {
                                        SubLObject type = rkf_sd_example_type(example);
                                        SubLObject v_term = rkf_sd_example_term(example);
                                        SubLObject supports = rkf_sd_example_supports(example);
                                        SubLObject focus_term_analog = rkf_sd_example_focus_term_analog(example);
                                        SubLObject template = cycl_utilities.expression_subst(focus_term_analog, focal_term, assert_sentence_template, UNPROVIDED, UNPROVIDED);
                                        SubLObject cdolist_list_var_21 = supports;
                                        SubLObject support = NIL;
                                        for (support = cdolist_list_var_21.first(); NIL != cdolist_list_var_21; cdolist_list_var_21 = cdolist_list_var_21.rest() , support = cdolist_list_var_21.first()) {
                                            if (NIL != formula_pattern_match.formula_matches_pattern(arguments.support_sentence(support), template)) {
                                                example_sentences = cons(arguments.support_sentence(support), example_sentences);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return example_sentences;
        }
    }

    public static SubLObject rkf_sd_prompt_get_precedent_example_sentences(final SubLObject prompt, final SubLObject focal_term) {
        SubLObject example_sentences = NIL;
        SubLObject cdolist_list_var = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_subprompts(prompt);
        SubLObject subprompt = NIL;
        subprompt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject examples = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_examples(subprompt);
            if (examples.isList()) {
                final SubLObject var = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_var(subprompt);
                final SubLObject assert_sentence_template = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_assert_sentence(subprompt, $ANYTHING, var);
                SubLObject cdolist_list_var_$17 = examples;
                SubLObject example = NIL;
                example = cdolist_list_var_$17.first();
                while (NIL != cdolist_list_var_$17) {
                    if (NIL != rkf_salient_descriptor_datastructures.rkf_sd_precedent_example_p(example)) {
                        final SubLObject type = rkf_salient_descriptor_datastructures.rkf_sd_example_type(example);
                        final SubLObject v_term = rkf_salient_descriptor_datastructures.rkf_sd_example_term(example);
                        final SubLObject supports = rkf_salient_descriptor_datastructures.rkf_sd_example_supports(example);
                        final SubLObject focus_term_analog = rkf_salient_descriptor_datastructures.rkf_sd_example_focus_term_analog(example);
                        final SubLObject template = cycl_utilities.expression_subst(focus_term_analog, focal_term, assert_sentence_template, UNPROVIDED, UNPROVIDED);
                        SubLObject cdolist_list_var_$18 = supports;
                        SubLObject support = NIL;
                        support = cdolist_list_var_$18.first();
                        while (NIL != cdolist_list_var_$18) {
                            if (NIL != formula_pattern_match.formula_matches_pattern(arguments.support_sentence(support), template)) {
                                example_sentences = cons(arguments.support_sentence(support), example_sentences);
                            }
                            cdolist_list_var_$18 = cdolist_list_var_$18.rest();
                            support = cdolist_list_var_$18.first();
                        } 
                    }
                    cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                    example = cdolist_list_var_$17.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            subprompt = cdolist_list_var.first();
        } 
        return example_sentences;
    }

    public static final SubLObject rkf_sd_single_entry_promptP_alt(SubLObject prompt, SubLObject mt) {
        {
            SubLObject failP = NIL;
            if (NIL == failP) {
                {
                    SubLObject csome_list_var = rkf_salient_descriptor_prompt_subprompts(prompt);
                    SubLObject subprompt = NIL;
                    for (subprompt = csome_list_var.first(); !((NIL != failP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , subprompt = csome_list_var.first()) {
                        {
                            SubLObject var = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_var(subprompt);
                            SubLObject assert_sentence_template = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_assert_sentence(subprompt, $FOCAL_TERM, var);
                            SubLObject single_entryP = rkf_salient_descriptor.rkf_salient_descriptor_single_entry_varP(var, assert_sentence_template, mt);
                            failP = makeBoolean(NIL == single_entryP);
                        }
                    }
                }
            }
            return makeBoolean(NIL == failP);
        }
    }

    public static SubLObject rkf_sd_single_entry_promptP(final SubLObject prompt, final SubLObject mt) {
        SubLObject failP = NIL;
        if (NIL == failP) {
            SubLObject csome_list_var = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_subprompts(prompt);
            SubLObject subprompt = NIL;
            subprompt = csome_list_var.first();
            while ((NIL == failP) && (NIL != csome_list_var)) {
                final SubLObject var = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_var(subprompt);
                final SubLObject assert_sentence_template = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_assert_sentence(subprompt, $FOCAL_TERM, var);
                final SubLObject single_entryP = rkf_salient_descriptor.rkf_salient_descriptor_single_entry_varP(var, assert_sentence_template, mt);
                failP = makeBoolean(NIL == single_entryP);
                csome_list_var = csome_list_var.rest();
                subprompt = csome_list_var.first();
            } 
        }
        return makeBoolean(NIL == failP);
    }

    public static final SubLObject rkf_sd_hide_specs_fn_replacements_alt(SubLObject template_fort) {
        {
            SubLObject formula = kb_mapping_utilities.fpred_value_in_any_mt(template_fort, $$formulaForFormulaTemplate, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject specs_fn_positions = (NIL != elf_p(formula)) ? ((SubLObject) (cycl_utilities.arg_positions_bfs($$SpecsFn, formula, UNPROVIDED))) : NIL;
            SubLObject cdolist_list_var = specs_fn_positions;
            SubLObject specs_fn_position = NIL;
            for (specs_fn_position = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , specs_fn_position = cdolist_list_var.first()) {
                if ((NIL != list_utilities.lengthG(specs_fn_position, TWO_INTEGER, UNPROVIDED)) && (NIL != el_formula_with_operator_p(cycl_utilities.formula_arg_position(formula, butlast(specs_fn_position, TWO_INTEGER), UNPROVIDED), $$SomeExampleFn))) {
                    {
                        SubLObject type = cycl_utilities.formula_arg_position(formula, list_utilities.replace_last(specs_fn_position, ONE_INTEGER), UNPROVIDED);
                        if (NIL == forts.fort_p(type)) {
                        } else {
                            if (cardinality_estimates.generality_estimate(type).numL($int$100)) {
                            } else {
                                {
                                    SubLObject type_pos = cycl_utilities.make_cycl_arg_position(butlast(specs_fn_position, TWO_INTEGER));
                                    SubLObject sentence = list($const71$templateReplacementsInvisibleForP, template_fort, type_pos);
                                    if (NIL == kb_indexing.find_assertion_any_mt(list(NIL, list(sentence)))) {
                                        com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_fet_assert(sentence);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return template_fort;
    }

    public static SubLObject rkf_sd_hide_specs_fn_replacements(final SubLObject template_fort) {
        final SubLObject formula = kb_mapping_utilities.fpred_value_in_any_mt(template_fort, $$formulaForFormulaTemplate, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject specs_fn_positions = cdolist_list_var = (NIL != elf_p(formula)) ? cycl_utilities.arg_positions_bfs($$SpecsFn, formula, UNPROVIDED) : NIL;
        SubLObject specs_fn_position = NIL;
        specs_fn_position = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != list_utilities.lengthG(specs_fn_position, TWO_INTEGER, UNPROVIDED)) && (NIL != el_formula_with_operator_p(cycl_utilities.formula_arg_position(formula, butlast(specs_fn_position, TWO_INTEGER), UNPROVIDED), $$SomeExampleFn))) {
                final SubLObject type = cycl_utilities.formula_arg_position(formula, list_utilities.replace_last(specs_fn_position, ONE_INTEGER), UNPROVIDED);
                if (NIL != forts.fort_p(type)) {
                    if (!cardinality_estimates.generality_estimate(type).numL($int$100)) {
                        final SubLObject type_pos = cycl_utilities.make_cycl_arg_position(butlast(specs_fn_position, TWO_INTEGER));
                        final SubLObject sentence = list($const70$templateReplacementsInvisibleForP, template_fort, type_pos);
                        if (NIL == kb_indexing.find_assertion_any_mt(list(NIL, list(sentence)))) {
                            rkf_sd_fet_assert(sentence);
                        }
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            specs_fn_position = cdolist_list_var.first();
        } 
        return template_fort;
    }

    public static final SubLObject prune_rkf_sd_formula_template_topic_alt(SubLObject topic) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject focal_term_type = kb_mapping_utilities.fpred_value_in_any_mt(topic, $const102$focalTermTypeForInducedTemplateTy, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
                if (NIL != focal_term_type) {
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            {
                                SubLObject cdolist_list_var = $list_alt121;
                                SubLObject pred = NIL;
                                for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                                    {
                                        SubLObject pred_var = pred;
                                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(topic, TWO_INTEGER, pred_var)) {
                                            {
                                                SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(topic, TWO_INTEGER, pred_var);
                                                SubLObject done_var = NIL;
                                                SubLObject token_var = NIL;
                                                while (NIL == done_var) {
                                                    {
                                                        SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                        SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                        if (NIL != valid) {
                                                            {
                                                                SubLObject final_index_iterator = NIL;
                                                                try {
                                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                                    {
                                                                        SubLObject done_var_22 = NIL;
                                                                        SubLObject token_var_23 = NIL;
                                                                        while (NIL == done_var_22) {
                                                                            {
                                                                                SubLObject template_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_23);
                                                                                SubLObject valid_24 = makeBoolean(token_var_23 != template_gaf);
                                                                                if (NIL != valid_24) {
                                                                                    {
                                                                                        SubLObject template = assertions_high.gaf_arg1(template_gaf);
                                                                                        SubLObject template_formula = kb_mapping_utilities.fpred_value_in_any_mt(template, $$formulaForFormulaTemplate, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                        SubLObject bin_pred = (NIL != template_formula) ? ((SubLObject) (cycl_utilities.formula_arg0(template_formula))) : NIL;
                                                                                        if (NIL != kb_accessors.binary_predicateP(bin_pred)) {
                                                                                            {
                                                                                                SubLObject found_genlP = NIL;
                                                                                                if (NIL == found_genlP) {
                                                                                                    {
                                                                                                        SubLObject node_var = focal_term_type;
                                                                                                        SubLObject deck_type = (false) ? ((SubLObject) ($QUEUE)) : $STACK;
                                                                                                        SubLObject recur_deck = deck.create_deck(deck_type);
                                                                                                        {
                                                                                                            SubLObject _prev_bind_0_25 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                                                                                            try {
                                                                                                                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                                                                                {
                                                                                                                    SubLObject tv_var = $$True_JustificationTruth;
                                                                                                                    {
                                                                                                                        SubLObject _prev_bind_0_26 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                                                                                        SubLObject _prev_bind_1_27 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                                                                                        try {
                                                                                                                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                                                                                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                                                                                            if (NIL != tv_var) {
                                                                                                                                if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                                                                                                    if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                                                                                        {
                                                                                                                                            SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                                                                                            if (pcase_var.eql($ERROR)) {
                                                                                                                                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt111$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                                            } else {
                                                                                                                                                if (pcase_var.eql($CERROR)) {
                                                                                                                                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt111$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                                                } else {
                                                                                                                                                    if (pcase_var.eql($WARN)) {
                                                                                                                                                        Errors.warn($str_alt111$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                                                                                    } else {
                                                                                                                                                        Errors.warn($str_alt116$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                                                                                                        Errors.cerror($$$continue_anyway, $str_alt111$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            {
                                                                                                                                SubLObject _prev_bind_0_28 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                                                                                                SubLObject _prev_bind_1_29 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                                                                                                SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                                                                                                SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                                                SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                                                try {
                                                                                                                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                                                                                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                                                                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                                                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                                                                                                    if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(focal_term_type, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                                                                                                        {
                                                                                                                                            SubLObject _prev_bind_0_30 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                                                                                            SubLObject _prev_bind_1_31 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                                                                                            SubLObject _prev_bind_2_32 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                                                            try {
                                                                                                                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                                                                                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                                                                                                                while ((NIL != node_var) && (NIL == found_genlP)) {
                                                                                                                                                    {
                                                                                                                                                        SubLObject genl = node_var;
                                                                                                                                                        if ((!genl.eql(focal_term_type)) && (NIL != com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.focal_term_type_has_template_with_bin_predP(genl, bin_pred))) {
                                                                                                                                                            found_genlP = T;
                                                                                                                                                            Errors.warn($str_alt118$Redundant_with__S_____S_on__S, genl, bin_pred, focal_term_type);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    {
                                                                                                                                                        SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                                                                                                                                        SubLObject rest = NIL;
                                                                                                                                                        for (rest = accessible_modules; !((NIL != found_genlP) || (NIL == rest)); rest = rest.rest()) {
                                                                                                                                                            {
                                                                                                                                                                SubLObject module_var = rest.first();
                                                                                                                                                                {
                                                                                                                                                                    SubLObject _prev_bind_0_33 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                                                                                    SubLObject _prev_bind_1_34 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                                                                                    try {
                                                                                                                                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                                                                                        {
                                                                                                                                                                            SubLObject node = function_terms.naut_to_nart(node_var);
                                                                                                                                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                                                                                                {
                                                                                                                                                                                    SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                                                                                    if (NIL != d_link) {
                                                                                                                                                                                        {
                                                                                                                                                                                            SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                                                                                            if (NIL != mt_links) {
                                                                                                                                                                                                {
                                                                                                                                                                                                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                                                                                                    while (!((NIL != found_genlP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                                                                                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                                                                                        {
                                                                                                                                                                                                            SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                                                                                            SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                                                                                                {
                                                                                                                                                                                                                    SubLObject _prev_bind_0_35 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                                                                                                        {
                                                                                                                                                                                                                            SubLObject iteration_state_36 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                                                                                            while (!((NIL != found_genlP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_36)))) {
                                                                                                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                                                                                                {
                                                                                                                                                                                                                                    SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_36);
                                                                                                                                                                                                                                    SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                                                                                        {
                                                                                                                                                                                                                                            SubLObject _prev_bind_0_37 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                                                                                                {
                                                                                                                                                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                                                                                    SubLObject rest_38 = NIL;
                                                                                                                                                                                                                                                    for (rest_38 = new_list; !((NIL != found_genlP) || (NIL == rest_38)); rest_38 = rest_38.rest()) {
                                                                                                                                                                                                                                                        {
                                                                                                                                                                                                                                                            SubLObject node_vars_link_node = rest_38.first();
                                                                                                                                                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            } finally {
                                                                                                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_37, thread);
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    iteration_state_36 = dictionary_contents.do_dictionary_contents_next(iteration_state_36);
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            } 
                                                                                                                                                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_36);
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    } finally {
                                                                                                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_35, thread);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                                                                                                        }
                                                                                                                                                                                                    } 
                                                                                                                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    } else {
                                                                                                                                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt119$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            } else {
                                                                                                                                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                                                                                    {
                                                                                                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                                                                                        SubLObject rest_39 = NIL;
                                                                                                                                                                                        for (rest_39 = new_list; !((NIL != found_genlP) || (NIL == rest_39)); rest_39 = rest_39.rest()) {
                                                                                                                                                                                            {
                                                                                                                                                                                                SubLObject generating_fn = rest_39.first();
                                                                                                                                                                                                {
                                                                                                                                                                                                    SubLObject _prev_bind_0_40 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                                                                                                    try {
                                                                                                                                                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                                                                                        {
                                                                                                                                                                                                            SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                                                                                            SubLObject new_list_41 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                                            SubLObject rest_42 = NIL;
                                                                                                                                                                                                            for (rest_42 = new_list_41; !((NIL != found_genlP) || (NIL == rest_42)); rest_42 = rest_42.rest()) {
                                                                                                                                                                                                                {
                                                                                                                                                                                                                    SubLObject node_vars_link_node = rest_42.first();
                                                                                                                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                    } finally {
                                                                                                                                                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_40, thread);
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    } finally {
                                                                                                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_34, thread);
                                                                                                                                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_33, thread);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    node_var = deck.deck_pop(recur_deck);
                                                                                                                                                } 
                                                                                                                                            } finally {
                                                                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_32, thread);
                                                                                                                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_31, thread);
                                                                                                                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_30, thread);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt120$Node__a_does_not_pass_sbhl_type_t, focal_term_type, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                                    }
                                                                                                                                } finally {
                                                                                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                                                                                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                                                                                                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_29, thread);
                                                                                                                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_28, thread);
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } finally {
                                                                                                                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_27, thread);
                                                                                                                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_26, thread);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                                                                                }
                                                                                                            } finally {
                                                                                                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_25, thread);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                if (NIL != found_genlP) {
                                                                                                    rkf_term_utilities.rkf_kill(template);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                done_var_22 = makeBoolean(NIL == valid_24);
                                                                            }
                                                                        } 
                                                                    }
                                                                } finally {
                                                                    {
                                                                        SubLObject _prev_bind_0_43 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            if (NIL != final_index_iterator) {
                                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                            }
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_43, thread);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        done_var = makeBoolean(NIL == valid);
                                                    }
                                                } 
                                            }
                                        }
                                    }
                                }
                            }
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (NIL == formula_templates.fet_topic_fort_has_templatesP(topic, $$InferencePSC)) {
                        Errors.warn($str_alt122$Hey_ho___S_has_got_to_go___, topic);
                        rkf_term_utilities.rkf_kill(topic);
                    }
                }
            }
            return topic;
        }
    }

    public static SubLObject prune_rkf_sd_formula_template_topic(final SubLObject topic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject focal_term_type = kb_mapping_utilities.fpred_value_in_any_mt(topic, $const101$focalTermTypeForInducedTemplateTy, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
        if (NIL != focal_term_type) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                SubLObject cdolist_list_var = $list121;
                SubLObject pred = NIL;
                pred = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject pred_var = pred;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(topic, TWO_INTEGER, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(topic, TWO_INTEGER, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                    SubLObject done_var_$19 = NIL;
                                    final SubLObject token_var_$20 = NIL;
                                    while (NIL == done_var_$19) {
                                        final SubLObject template_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$20);
                                        final SubLObject valid_$21 = makeBoolean(!token_var_$20.eql(template_gaf));
                                        if (NIL != valid_$21) {
                                            final SubLObject template = assertions_high.gaf_arg1(template_gaf);
                                            final SubLObject template_formula = kb_mapping_utilities.fpred_value_in_any_mt(template, $$formulaForFormulaTemplate, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            final SubLObject bin_pred = (NIL != template_formula) ? cycl_utilities.formula_arg0(template_formula) : NIL;
                                            if (NIL != kb_accessors.binary_predicateP(bin_pred)) {
                                                SubLObject found_genlP = NIL;
                                                if (NIL == found_genlP) {
                                                    SubLObject node_var = focal_term_type;
                                                    final SubLObject deck_type = $STACK;
                                                    final SubLObject recur_deck = deck.create_deck(deck_type);
                                                    final SubLObject _prev_bind_0_$22 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                                    try {
                                                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                        try {
                                                            final SubLObject tv_var = $$True_JustificationTruth;
                                                            final SubLObject _prev_bind_0_$23 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$24 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                            try {
                                                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                                if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                    if (pcase_var.eql($ERROR)) {
                                                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str110$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } else
                                                                        if (pcase_var.eql($CERROR)) {
                                                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str110$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                        } else
                                                                            if (pcase_var.eql($WARN)) {
                                                                                Errors.warn($str110$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                            } else {
                                                                                Errors.warn($str115$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                                Errors.cerror($$$continue_anyway, $str110$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                            }


                                                                }
                                                                final SubLObject _prev_bind_0_$24 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                                final SubLObject _prev_bind_1_$25 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                                final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                try {
                                                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                                    if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(focal_term_type, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                                        final SubLObject _prev_bind_0_$25 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                        final SubLObject _prev_bind_1_$26 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                        final SubLObject _prev_bind_2_$29 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                                            while ((NIL != node_var) && (NIL == found_genlP)) {
                                                                                final SubLObject genl = node_var;
                                                                                if ((!genl.eql(focal_term_type)) && (NIL != focal_term_type_has_template_with_bin_predP(genl, bin_pred))) {
                                                                                    found_genlP = T;
                                                                                    Errors.warn($str117$Redundant_with__S_____S_on__S, genl, bin_pred, focal_term_type);
                                                                                }
                                                                                final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                                                                SubLObject rest;
                                                                                SubLObject module_var;
                                                                                SubLObject _prev_bind_0_$26;
                                                                                SubLObject _prev_bind_1_$27;
                                                                                SubLObject node;
                                                                                SubLObject d_link;
                                                                                SubLObject mt_links;
                                                                                SubLObject iteration_state;
                                                                                SubLObject mt;
                                                                                SubLObject tv_links;
                                                                                SubLObject _prev_bind_0_$27;
                                                                                SubLObject iteration_state_$33;
                                                                                SubLObject tv;
                                                                                SubLObject link_nodes;
                                                                                SubLObject _prev_bind_0_$28;
                                                                                SubLObject sol;
                                                                                SubLObject set_contents_var;
                                                                                SubLObject basis_object;
                                                                                SubLObject state;
                                                                                SubLObject node_vars_link_node;
                                                                                SubLObject csome_list_var;
                                                                                SubLObject node_vars_link_node2;
                                                                                SubLObject new_list;
                                                                                SubLObject rest_$35;
                                                                                SubLObject generating_fn;
                                                                                SubLObject _prev_bind_0_$29;
                                                                                SubLObject sol2;
                                                                                SubLObject link_nodes2;
                                                                                SubLObject set_contents_var2;
                                                                                SubLObject basis_object2;
                                                                                SubLObject state2;
                                                                                SubLObject node_vars_link_node3;
                                                                                SubLObject csome_list_var2;
                                                                                SubLObject node_vars_link_node4;
                                                                                for (rest = NIL, rest = accessible_modules; (NIL == found_genlP) && (NIL != rest); rest = rest.rest()) {
                                                                                    module_var = rest.first();
                                                                                    _prev_bind_0_$26 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                    _prev_bind_1_$27 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                        node = function_terms.naut_to_nart(node_var);
                                                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                            d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                            if (NIL != d_link) {
                                                                                                mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                if (NIL != mt_links) {
                                                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == found_genlP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                                                        thread.resetMultipleValues();
                                                                                                        mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                        tv_links = thread.secondMultipleValue();
                                                                                                        thread.resetMultipleValues();
                                                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                            _prev_bind_0_$27 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                            try {
                                                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                for (iteration_state_$33 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == found_genlP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$33)); iteration_state_$33 = dictionary_contents.do_dictionary_contents_next(iteration_state_$33)) {
                                                                                                                    thread.resetMultipleValues();
                                                                                                                    tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$33);
                                                                                                                    link_nodes = thread.secondMultipleValue();
                                                                                                                    thread.resetMultipleValues();
                                                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                        _prev_bind_0_$28 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                        try {
                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                            sol = link_nodes;
                                                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                                                set_contents_var = set.do_set_internal(sol);
                                                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == found_genlP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } else
                                                                                                                                if (sol.isList()) {
                                                                                                                                    if (NIL == found_genlP) {
                                                                                                                                        csome_list_var = sol;
                                                                                                                                        node_vars_link_node2 = NIL;
                                                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                                                        while ((NIL == found_genlP) && (NIL != csome_list_var)) {
                                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                                                deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                                                            }
                                                                                                                                            csome_list_var = csome_list_var.rest();
                                                                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                                                                        } 
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    Errors.error($str118$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                                                }

                                                                                                                        } finally {
                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$28, thread);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$33);
                                                                                                            } finally {
                                                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$27, thread);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                }
                                                                                            } else {
                                                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str119$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                            }
                                                                                        } else
                                                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                for (rest_$35 = NIL, rest_$35 = new_list; (NIL == found_genlP) && (NIL != rest_$35); rest_$35 = rest_$35.rest()) {
                                                                                                    generating_fn = rest_$35.first();
                                                                                                    _prev_bind_0_$29 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                    try {
                                                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                        link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                                                        if (NIL != set.set_p(sol2)) {
                                                                                                            set_contents_var2 = set.do_set_internal(sol2);
                                                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == found_genlP) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                                                    deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                                                }
                                                                                                            }
                                                                                                        } else
                                                                                                            if (sol2.isList()) {
                                                                                                                if (NIL == found_genlP) {
                                                                                                                    csome_list_var2 = sol2;
                                                                                                                    node_vars_link_node4 = NIL;
                                                                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                                                                    while ((NIL == found_genlP) && (NIL != csome_list_var2)) {
                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                                                            deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                                                        }
                                                                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                                                                    } 
                                                                                                                }
                                                                                                            } else {
                                                                                                                Errors.error($str118$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                                            }

                                                                                                    } finally {
                                                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$29, thread);
                                                                                                    }
                                                                                                }
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$27, thread);
                                                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$26, thread);
                                                                                    }
                                                                                }
                                                                                node_var = deck.deck_pop(recur_deck);
                                                                            } 
                                                                        } finally {
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$29, thread);
                                                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$26, thread);
                                                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$25, thread);
                                                                        }
                                                                    } else {
                                                                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str120$Node__a_does_not_pass_sbhl_type_t, focal_term_type, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    }
                                                                } finally {
                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$25, thread);
                                                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$24, thread);
                                                                }
                                                            } finally {
                                                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$24, thread);
                                                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$23, thread);
                                                            }
                                                        } finally {
                                                            final SubLObject _prev_bind_0_$30 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                final SubLObject _values = getValuesAsVector();
                                                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                                restoreValuesFromVector(_values);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$22, thread);
                                                    }
                                                }
                                                if (NIL != found_genlP) {
                                                    rkf_term_utilities.rkf_kill(template);
                                                }
                                            }
                                        }
                                        done_var_$19 = makeBoolean(NIL == valid_$21);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$31 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$31, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    pred = cdolist_list_var.first();
                } 
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            if (NIL == formula_templates.fet_topic_fort_has_templatesP(topic, $$InferencePSC)) {
                Errors.warn($str122$Hey_ho___S_has_got_to_go___, topic);
                rkf_term_utilities.rkf_kill(topic);
            }
        }
        return topic;
    }

    public static final SubLObject focal_term_type_has_template_with_bin_predP_alt(SubLObject type, SubLObject bin_pred) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject foundP = NIL;
                SubLObject topic = formula_template_utilities.induction_topic_type_for_collection(type);
                if (NIL != nart_handles.nart_p(topic)) {
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            {
                                SubLObject cdolist_list_var = $list_alt121;
                                SubLObject pred = NIL;
                                for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                                    {
                                        SubLObject pred_var = pred;
                                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(topic, TWO_INTEGER, pred_var)) {
                                            {
                                                SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(topic, TWO_INTEGER, pred_var);
                                                SubLObject done_var = foundP;
                                                SubLObject token_var = NIL;
                                                while (NIL == done_var) {
                                                    {
                                                        SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                        SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                        if (NIL != valid) {
                                                            {
                                                                SubLObject final_index_iterator = NIL;
                                                                try {
                                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                                    {
                                                                        SubLObject done_var_44 = foundP;
                                                                        SubLObject token_var_45 = NIL;
                                                                        while (NIL == done_var_44) {
                                                                            {
                                                                                SubLObject template_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_45);
                                                                                SubLObject valid_46 = makeBoolean(token_var_45 != template_gaf);
                                                                                if (NIL != valid_46) {
                                                                                    {
                                                                                        SubLObject template = assertions_high.gaf_arg1(template_gaf);
                                                                                        SubLObject template_formula = kb_mapping_utilities.fpred_value_in_any_mt(template, $$formulaForFormulaTemplate, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                        SubLObject this_bin_pred = (NIL != template_formula) ? ((SubLObject) (cycl_utilities.formula_arg0(template_formula))) : NIL;
                                                                                        foundP = eql(bin_pred, this_bin_pred);
                                                                                    }
                                                                                }
                                                                                done_var_44 = makeBoolean((NIL == valid_46) || (NIL != foundP));
                                                                            }
                                                                        } 
                                                                    }
                                                                } finally {
                                                                    {
                                                                        SubLObject _prev_bind_0_47 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            if (NIL != final_index_iterator) {
                                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                            }
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_47, thread);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        done_var = makeBoolean((NIL == valid) || (NIL != foundP));
                                                    }
                                                } 
                                            }
                                        }
                                    }
                                }
                            }
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return foundP;
            }
        }
    }

    public static SubLObject focal_term_type_has_template_with_bin_predP(final SubLObject type, final SubLObject bin_pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject foundP = NIL;
        final SubLObject topic = formula_template_utilities.induction_topic_type_for_collection(type);
        if (NIL != nart_handles.nart_p(topic)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                SubLObject cdolist_list_var = $list121;
                SubLObject pred = NIL;
                pred = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject pred_var = pred;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(topic, TWO_INTEGER, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(topic, TWO_INTEGER, pred_var);
                        SubLObject done_var = foundP;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                    SubLObject done_var_$39 = foundP;
                                    final SubLObject token_var_$40 = NIL;
                                    while (NIL == done_var_$39) {
                                        final SubLObject template_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$40);
                                        final SubLObject valid_$41 = makeBoolean(!token_var_$40.eql(template_gaf));
                                        if (NIL != valid_$41) {
                                            final SubLObject template = assertions_high.gaf_arg1(template_gaf);
                                            final SubLObject template_formula = kb_mapping_utilities.fpred_value_in_any_mt(template, $$formulaForFormulaTemplate, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            final SubLObject this_bin_pred = (NIL != template_formula) ? cycl_utilities.formula_arg0(template_formula) : NIL;
                                            foundP = eql(bin_pred, this_bin_pred);
                                        }
                                        done_var_$39 = makeBoolean((NIL == valid_$41) || (NIL != foundP));
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$42 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$42, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean((NIL == valid) || (NIL != foundP));
                        } 
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    pred = cdolist_list_var.first();
                } 
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return foundP;
    }

    /**
     *
     *
     * @return LISTP of induced RKF-SALIENT-DESCRIPTOR-PROMPT-P appropriate for FOCAL-TERM-TYPE in ELMT.
     */
    @LispMethod(comment = "@return LISTP of induced RKF-SALIENT-DESCRIPTOR-PROMPT-P appropriate for FOCAL-TERM-TYPE in ELMT.")
    public static final SubLObject rkf_induced_salient_descriptor_prompts_for_focal_term_type_alt(SubLObject focal_term_type, SubLObject elmt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(focal_term_type, $sym123$ISA_COLLECTION_);
            {
                SubLObject prompts = NIL;
                SubLObject table = $list_alt124;
                SubLTrampolineFile.checkType(table, ALIST_P);
                {
                    SubLObject _prev_bind_0 = $rkf_sd_seed_term_tactics_table$.currentBinding(thread);
                    try {
                        $rkf_sd_seed_term_tactics_table$.bind(table, thread);
                        prompts = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_salient_descriptor_prompts_for_focal_term_type(focal_term_type, elmt);
                    } finally {
                        $rkf_sd_seed_term_tactics_table$.rebind(_prev_bind_0, thread);
                    }
                }
                return prompts;
            }
        }
    }

    /**
     *
     *
     * @return LISTP of induced RKF-SALIENT-DESCRIPTOR-PROMPT-P appropriate for FOCAL-TERM-TYPE in ELMT.
     */
    @LispMethod(comment = "@return LISTP of induced RKF-SALIENT-DESCRIPTOR-PROMPT-P appropriate for FOCAL-TERM-TYPE in ELMT.")
    public static SubLObject rkf_induced_salient_descriptor_prompts_for_focal_term_type(final SubLObject focal_term_type, final SubLObject elmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != fort_types_interface.isa_collectionP(focal_term_type, UNPROVIDED) : "! fort_types_interface.isa_collectionP(focal_term_type, .UNPROVIDED) " + ("fort_types_interface.isa_collectionP(focal_term_type, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != fort_types_interface.isa_collectionP(focal_term_type, CommonSymbols.UNPROVIDED) ") + focal_term_type;
        SubLObject prompts = NIL;
        final SubLObject table = $list124;
        assert NIL != list_utilities.alist_p(table) : "! list_utilities.alist_p(table) " + ("list_utilities.alist_p(table) " + "CommonSymbols.NIL != list_utilities.alist_p(table) ") + table;
        final SubLObject _prev_bind_0 = $rkf_sd_seed_term_tactics_table$.currentBinding(thread);
        try {
            $rkf_sd_seed_term_tactics_table$.bind(table, thread);
            prompts = rkf_salient_descriptor_prompts_for_focal_term_type(focal_term_type, elmt);
        } finally {
            $rkf_sd_seed_term_tactics_table$.rebind(_prev_bind_0, thread);
        }
        return prompts;
    }

    /**
     *
     *
     * @return LISTP of RKF-SALIENT-DESCRIPTOR-PROMPT-P appropriate for FOCAL-TERM-TYPE in ELMT.
     */
    @LispMethod(comment = "@return LISTP of RKF-SALIENT-DESCRIPTOR-PROMPT-P appropriate for FOCAL-TERM-TYPE in ELMT.")
    public static final SubLObject rkf_salient_descriptor_prompts_for_focal_term_type_alt(SubLObject focal_term_type, SubLObject elmt) {
        SubLTrampolineFile.checkType(focal_term_type, $sym123$ISA_COLLECTION_);
        {
            SubLObject focal_term = rkf_domain_examples.rkf_generic_example_for_collection(focal_term_type);
            SubLObject prompter = new_rkf_salient_descriptor_prompter(focal_term, elmt);
            SubLObject prompts = NIL;
            SubLObject prompt = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_salient_descriptor_prompter_next(prompter, UNPROVIDED);
            while (NIL != rkf_salient_descriptor_prompt_p(prompt)) {
                prompts = cons(prompt, prompts);
                prompt = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_salient_descriptor_prompter_next(prompter, UNPROVIDED);
            } 
            return nreverse(prompts);
        }
    }

    /**
     *
     *
     * @return LISTP of RKF-SALIENT-DESCRIPTOR-PROMPT-P appropriate for FOCAL-TERM-TYPE in ELMT.
     */
    @LispMethod(comment = "@return LISTP of RKF-SALIENT-DESCRIPTOR-PROMPT-P appropriate for FOCAL-TERM-TYPE in ELMT.")
    public static SubLObject rkf_salient_descriptor_prompts_for_focal_term_type(final SubLObject focal_term_type, final SubLObject elmt) {
        assert NIL != fort_types_interface.isa_collectionP(focal_term_type, UNPROVIDED) : "! fort_types_interface.isa_collectionP(focal_term_type, .UNPROVIDED) " + ("fort_types_interface.isa_collectionP(focal_term_type, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != fort_types_interface.isa_collectionP(focal_term_type, CommonSymbols.UNPROVIDED) ") + focal_term_type;
        final SubLObject focal_term = rkf_domain_examples.rkf_generic_example_for_collection(focal_term_type);
        final SubLObject prompter = rkf_salient_descriptor_datastructures.new_rkf_salient_descriptor_prompter(focal_term, elmt);
        SubLObject prompts = NIL;
        for (SubLObject prompt = rkf_salient_descriptor_prompter_next(prompter, UNPROVIDED); NIL != rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p(prompt); prompt = rkf_salient_descriptor_prompter_next(prompter, UNPROVIDED)) {
            prompts = cons(prompt, prompts);
        }
        return nreverse(prompts);
    }

    /**
     *
     *
     * @return :TACTIC-DONE if current tactic done, :DONE if all done.
     */
    @LispMethod(comment = "@return :TACTIC-DONE if current tactic done, :DONE if all done.")
    public static final SubLObject rkf_sd_prompter_apply_tactics_alt(SubLObject prompter) {
        {
            SubLObject result = NIL;
            SubLObject lock = rkf_salient_descriptor_prompter_lookup(prompter, $LOCK, UNPROVIDED);
            SubLObject lock_48 = lock;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock_48);
                if (NIL != com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_tactics_exhausted_p(prompter)) {
                    result = $DONE;
                } else {
                    {
                        SubLObject tactic = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_tactics_next(prompter);
                        result = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_apply_tactic(prompter, tactic);
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock_48);
                }
            }
            return result;
        }
    }

    /**
     *
     *
     * @return :TACTIC-DONE if current tactic done, :DONE if all done.
     */
    @LispMethod(comment = "@return :TACTIC-DONE if current tactic done, :DONE if all done.")
    public static SubLObject rkf_sd_prompter_apply_tactics(final SubLObject prompter) {
        SubLObject result = NIL;
        final SubLObject lock = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, $LOCK, UNPROVIDED);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            if (NIL != rkf_sd_prompter_tactics_exhausted_p(prompter)) {
                result = $DONE;
            } else {
                final SubLObject tactic = rkf_sd_prompter_tactics_next(prompter);
                result = rkf_sd_prompter_apply_tactic(prompter, tactic);
            }
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return result;
    }

    /**
     *
     *
     * @return BOOLEAN; Can PROMPTER produce no more prompts?
     */
    @LispMethod(comment = "@return BOOLEAN; Can PROMPTER produce no more prompts?")
    public static final SubLObject rkf_sd_prompter_exhausted_p_alt(SubLObject prompter) {
        return makeBoolean((NIL == rkf_sd_prompter_tactics(prompter)) && (NIL != set.set_emptyP(rkf_sd_prompter_unused_prompts(prompter))));
    }

    /**
     *
     *
     * @return BOOLEAN; Can PROMPTER produce no more prompts?
     */
    @LispMethod(comment = "@return BOOLEAN; Can PROMPTER produce no more prompts?")
    public static SubLObject rkf_sd_prompter_exhausted_p(final SubLObject prompter) {
        return makeBoolean((NIL == rkf_salient_descriptor_datastructures.rkf_sd_prompter_tactics(prompter)) && (NIL != set.set_emptyP(rkf_salient_descriptor_datastructures.rkf_sd_prompter_unused_prompts(prompter))));
    }

    public static final SubLObject rkf_sd_prompter_tactics_exhausted_p_alt(SubLObject prompter) {
        return sublisp_null(rkf_sd_prompter_tactics(prompter));
    }

    public static SubLObject rkf_sd_prompter_tactics_exhausted_p(final SubLObject prompter) {
        return sublisp_null(rkf_salient_descriptor_datastructures.rkf_sd_prompter_tactics(prompter));
    }

    public static final SubLObject rkf_sd_prompter_tactics_next_alt(SubLObject prompter) {
        if (NIL != com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_tactics_exhausted_p(prompter)) {
            return $EXHAUSTED;
        } else {
            return rkf_sd_prompter_tactics(prompter).first();
        }
    }

    public static SubLObject rkf_sd_prompter_tactics_next(final SubLObject prompter) {
        if (NIL != rkf_sd_prompter_tactics_exhausted_p(prompter)) {
            return $EXHAUSTED;
        }
        return rkf_salient_descriptor_datastructures.rkf_sd_prompter_tactics(prompter).first();
    }

    /**
     * Apply TACTIC to try to generate more prompts on PROMPTER, removing TACTIC
     * from PROMPTER when it reports it is done.
     */
    @LispMethod(comment = "Apply TACTIC to try to generate more prompts on PROMPTER, removing TACTIC\r\nfrom PROMPTER when it reports it is done.\nApply TACTIC to try to generate more prompts on PROMPTER, removing TACTIC\nfrom PROMPTER when it reports it is done.")
    public static final SubLObject rkf_sd_prompter_apply_tactic_alt(SubLObject prompter, SubLObject tactic) {
        if (NIL == fboundp(tactic)) {
            _csetf_rkf_sd_prompter_tactics(prompter, rkf_sd_prompter_tactics(prompter).rest());
        } else {
            {
                SubLObject result = funcall(tactic, prompter);
                rkf_salient_descriptor_prompter_set(prompter, $LAST_TACTIC, tactic);
                if ($DONE == result) {
                    _csetf_rkf_sd_prompter_tactics(prompter, rkf_sd_prompter_tactics(prompter).rest());
                    return $TACTIC_DONE;
                }
            }
        }
        return prompter;
    }

    @LispMethod(comment = "Apply TACTIC to try to generate more prompts on PROMPTER, removing TACTIC\r\nfrom PROMPTER when it reports it is done.\nApply TACTIC to try to generate more prompts on PROMPTER, removing TACTIC\nfrom PROMPTER when it reports it is done.")
    public static SubLObject rkf_sd_prompter_apply_tactic(final SubLObject prompter, final SubLObject tactic) {
        if (NIL == fboundp(tactic)) {
            rkf_salient_descriptor_datastructures._csetf_rkf_sd_prompter_tactics(prompter, rkf_salient_descriptor_datastructures.rkf_sd_prompter_tactics(prompter).rest());
        } else {
            final SubLObject result = funcall(tactic, prompter);
            rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_set(prompter, $LAST_TACTIC, tactic);
            if ($DONE == result) {
                rkf_salient_descriptor_datastructures._csetf_rkf_sd_prompter_tactics(prompter, rkf_salient_descriptor_datastructures.rkf_sd_prompter_tactics(prompter).rest());
                return $TACTIC_DONE;
            }
        }
        return prompter;
    }/**
     * Apply TACTIC to try to generate more prompts on PROMPTER, removing TACTIC
     * from PROMPTER when it reports it is done.
     */


    public static final SubLObject with_sd_tactic_disabled_for_seed_term_type_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt127);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject seed_term_type = NIL;
                    SubLObject tactic = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt127);
                    seed_term_type = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt127);
                    tactic = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject tactics_for_seed_term_type = $sym128$TACTICS_FOR_SEED_TERM_TYPE;
                            SubLObject tactics_table_copy = $sym129$TACTICS_TABLE_COPY;
                            return listS(CLET, list(list(tactics_for_seed_term_type, listS(REMOVE, tactic, list(RKF_SD_PROMPTER_TACTICS_FOR_SEED_TERM_TYPE, seed_term_type), $list_alt132)), bq_cons(tactics_table_copy, $list_alt133), list($rkf_sd_seed_term_tactics_table$, listS(ALIST_ENTER, tactics_table_copy, seed_term_type, tactics_for_seed_term_type, $list_alt132))), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt127);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject with_sd_tactic_disabled_for_seed_term_type(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list127);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject seed_term_type = NIL;
        SubLObject tactic = NIL;
        destructuring_bind_must_consp(current, datum, $list127);
        seed_term_type = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list127);
        tactic = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject tactics_for_seed_term_type = $sym128$TACTICS_FOR_SEED_TERM_TYPE;
            final SubLObject tactics_table_copy = $sym129$TACTICS_TABLE_COPY;
            return listS(CLET, list(list(tactics_for_seed_term_type, listS(REMOVE, tactic, list(RKF_SD_PROMPTER_TACTICS_FOR_SEED_TERM_TYPE, seed_term_type), $list132)), bq_cons(tactics_table_copy, $list133), list($rkf_sd_seed_term_tactics_table$, listS(ALIST_ENTER, tactics_table_copy, seed_term_type, tactics_for_seed_term_type, $list132))), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list127);
        return NIL;
    }

    public static final SubLObject with_sd_tactics_disabled_for_seed_term_type_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt135);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject seed_term_type = NIL;
                    SubLObject tactics = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt135);
                    seed_term_type = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt135);
                    tactics = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject tactics_for_seed_term_type = $sym136$TACTICS_FOR_SEED_TERM_TYPE;
                            SubLObject tactics_table_copy = $sym137$TACTICS_TABLE_COPY;
                            return list(PROGN, listS(CHECK_TYPE, tactics, $list_alt138), listS(CLET, list(list(tactics_for_seed_term_type, listS(ORDERED_SET_DIFFERENCE, list(RKF_SD_PROMPTER_TACTICS_FOR_SEED_TERM_TYPE, seed_term_type), tactics, $list_alt132)), bq_cons(tactics_table_copy, $list_alt133), list($rkf_sd_seed_term_tactics_table$, listS(ALIST_ENTER, tactics_table_copy, seed_term_type, tactics_for_seed_term_type, $list_alt132))), append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt135);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject with_sd_tactics_disabled_for_seed_term_type(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list135);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject seed_term_type = NIL;
        SubLObject tactics = NIL;
        destructuring_bind_must_consp(current, datum, $list135);
        seed_term_type = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list135);
        tactics = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject tactics_for_seed_term_type = $sym136$TACTICS_FOR_SEED_TERM_TYPE;
            final SubLObject tactics_table_copy = $sym137$TACTICS_TABLE_COPY;
            return list(PROGN, listS(CHECK_TYPE, tactics, $list138), listS(CLET, list(list(tactics_for_seed_term_type, listS(ORDERED_SET_DIFFERENCE, list(RKF_SD_PROMPTER_TACTICS_FOR_SEED_TERM_TYPE, seed_term_type), tactics, $list132)), bq_cons(tactics_table_copy, $list133), list($rkf_sd_seed_term_tactics_table$, listS(ALIST_ENTER, tactics_table_copy, seed_term_type, tactics_for_seed_term_type, $list132))), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list135);
        return NIL;
    }

    public static final SubLObject rkf_sd_prompter_suggestion_alt(SubLObject prompter) {
        return com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_add_ke_driven_prompts(prompter, $$keSuggestion);
    }

    public static SubLObject rkf_sd_prompter_suggestion(final SubLObject prompter) {
        return rkf_sd_prompter_add_ke_driven_prompts(prompter, $$keSuggestion);
    }

    public static final SubLObject rkf_sd_prompter_required_alt(SubLObject prompter) {
        return com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_add_ke_driven_prompts(prompter, $$keRequirement);
    }

    public static SubLObject rkf_sd_prompter_required(final SubLObject prompter) {
        return rkf_sd_prompter_add_ke_driven_prompts(prompter, $$keRequirement);
    }

    public static final SubLObject rkf_sd_prompter_interaction_context_required_alt(SubLObject prompter) {
        return com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_add_ke_driven_prompts(prompter, $$keInteractionRequirement);
    }

    public static SubLObject rkf_sd_prompter_interaction_context_required(final SubLObject prompter) {
        return rkf_sd_prompter_add_ke_driven_prompts(prompter, $$keInteractionRequirement);
    }

    public static final SubLObject rkf_sd_prompter_interaction_context_strong_alt(SubLObject prompter) {
        return com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_add_ke_driven_prompts(prompter, $$keInteractionStrongSuggestion);
    }

    public static SubLObject rkf_sd_prompter_interaction_context_strong(final SubLObject prompter) {
        return rkf_sd_prompter_add_ke_driven_prompts(prompter, $$keInteractionStrongSuggestion);
    }

    /**
     * Helper for #$keRequirements, #$keStrongSuggestions, etc.
     */
    @LispMethod(comment = "Helper for #$keRequirements, #$keStrongSuggestions, etc.")
    public static final SubLObject rkf_sd_prompter_add_ke_driven_prompts_alt(SubLObject prompter, SubLObject salience_pred) {
        {
            SubLObject fodder_to_add = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_ke_driven_prompt_fodder(prompter, salience_pred);
            if (!fodder_to_add.isList()) {
                return $DONE;
            } else {
                if (NIL == fodder_to_add) {
                    fodder_to_add = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_compute_ke_driven_prompt_fodder(prompter, salience_pred);
                    if (!fodder_to_add.isList()) {
                        return $DONE;
                    }
                }
            }
            {
                SubLObject datum = fodder_to_add;
                SubLObject current = datum;
                SubLObject formulas = NIL;
                SubLObject justifications = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt144);
                formulas = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt144);
                justifications = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject new_prompt = new_rkf_sd_prompt();
                        SubLObject formula = formulas.first();
                        SubLObject justification = justifications.first();
                        SubLObject tactic = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_salient_descriptor_prompter_current_tactic(prompter);
                        SubLObject remaining_fodder = NIL;
                        if (NIL != formulas.rest()) {
                            remaining_fodder = list(formulas.rest(), justifications.rest());
                        } else {
                            if (NIL != com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_iterative_prompt_method_p(salience_pred)) {
                                remaining_fodder = NIL;
                            } else {
                                remaining_fodder = $DONE;
                            }
                        }
                        com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_update_ke_driven_prompts(prompter, salience_pred, remaining_fodder);
                        rkf_sd_prompt_set_formula(new_prompt, formula);
                        rkf_sd_prompt_set_tactic(new_prompt, tactic);
                        rkf_sd_prompt_set_justification(new_prompt, justification);
                        com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_add_prompt(prompter, new_prompt);
                        return prompter;
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt144);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Helper for #$keRequirements, #$keStrongSuggestions, etc.")
    public static SubLObject rkf_sd_prompter_add_ke_driven_prompts(final SubLObject prompter, final SubLObject salience_pred) {
        SubLObject fodder_to_add = rkf_sd_prompter_ke_driven_prompt_fodder(prompter, salience_pred);
        if (!fodder_to_add.isList()) {
            return $DONE;
        }
        if (NIL == fodder_to_add) {
            fodder_to_add = rkf_sd_prompter_compute_ke_driven_prompt_fodder(prompter, salience_pred);
            if (!fodder_to_add.isList()) {
                return $DONE;
            }
        }
        SubLObject current;
        final SubLObject datum = current = fodder_to_add;
        SubLObject formulas = NIL;
        SubLObject justifications = NIL;
        destructuring_bind_must_consp(current, datum, $list144);
        formulas = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list144);
        justifications = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject new_prompt = rkf_salient_descriptor_datastructures.new_rkf_sd_prompt();
            final SubLObject formula = formulas.first();
            final SubLObject justification = justifications.first();
            final SubLObject tactic = rkf_salient_descriptor_prompter_current_tactic(prompter);
            SubLObject remaining_fodder = NIL;
            if (NIL != formulas.rest()) {
                remaining_fodder = list(formulas.rest(), justifications.rest());
            } else
                if (NIL != rkf_sd_prompter_iterative_prompt_method_p(salience_pred)) {
                    remaining_fodder = NIL;
                } else {
                    remaining_fodder = $DONE;
                }

            rkf_sd_prompter_update_ke_driven_prompts(prompter, salience_pred, remaining_fodder);
            rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_formula(new_prompt, formula);
            rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_tactic(new_prompt, tactic);
            rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_justification(new_prompt, justification);
            rkf_sd_prompter_add_prompt(prompter, new_prompt);
            return prompter;
        }
        cdestructuring_bind_error(datum, $list144);
        return NIL;
    }/**
     * Helper for #$keRequirements, #$keStrongSuggestions, etc.
     */


    public static final SubLObject rkf_sd_prompter_ke_driven_prompt_fodder_alt(SubLObject prompter, SubLObject salience_pred) {
        {
            SubLObject alist = rkf_salient_descriptor_prompter_lookup(prompter, $KE_DRIVEN_PROMPTS, NIL);
            return list_utilities.alist_lookup(alist, salience_pred, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject rkf_sd_prompter_ke_driven_prompt_fodder(final SubLObject prompter, final SubLObject salience_pred) {
        final SubLObject alist = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, $KE_DRIVEN_PROMPTS, NIL);
        return list_utilities.alist_lookup(alist, salience_pred, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject rkf_sd_prompter_update_ke_driven_prompts_alt(SubLObject prompter, SubLObject salience_pred, SubLObject fodder) {
        {
            SubLObject old_alist = rkf_salient_descriptor_prompter_lookup(prompter, $KE_DRIVEN_PROMPTS, NIL);
            SubLObject new_alist = list_utilities.alist_enter(old_alist, salience_pred, fodder, UNPROVIDED);
            rkf_salient_descriptor_prompter_set(prompter, $KE_DRIVEN_PROMPTS, new_alist);
            return fodder;
        }
    }

    public static SubLObject rkf_sd_prompter_update_ke_driven_prompts(final SubLObject prompter, final SubLObject salience_pred, final SubLObject fodder) {
        final SubLObject old_alist = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, $KE_DRIVEN_PROMPTS, NIL);
        final SubLObject new_alist = list_utilities.alist_enter(old_alist, salience_pred, fodder, UNPROVIDED);
        rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_set(prompter, $KE_DRIVEN_PROMPTS, new_alist);
        return fodder;
    }

    public static final SubLObject rkf_sd_prompter_compute_ke_driven_prompt_fodder_alt(SubLObject prompter, SubLObject salience_pred) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject formulas = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_get_ke_driven_prompt_formulas(prompter, salience_pred);
                SubLObject justifications = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return NIL != formulas ? ((SubLObject) (list(formulas, justifications))) : $DONE;
            }
        }
    }

    public static SubLObject rkf_sd_prompter_compute_ke_driven_prompt_fodder(final SubLObject prompter, final SubLObject salience_pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject formulas = rkf_sd_prompter_get_ke_driven_prompt_formulas(prompter, salience_pred);
        final SubLObject justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return NIL != formulas ? list(formulas, justifications) : $DONE;
    }

    /**
     *
     *
     * @return BOOLEANP; Is OBJ a method that can be used by RKF-SD-PROMPTER-COMPUTE-KE-DRIVEN-PROMPT-FODDER
    on a prompter more than once, reliably returning :DONE when it's done?
     */
    @LispMethod(comment = "@return BOOLEANP; Is OBJ a method that can be used by RKF-SD-PROMPTER-COMPUTE-KE-DRIVEN-PROMPT-FODDER\r\non a prompter more than once, reliably returning :DONE when it\'s done?")
    public static final SubLObject rkf_sd_prompter_iterative_prompt_method_p_alt(SubLObject obj) {
        if (NIL != valid_constantP(obj, UNPROVIDED)) {
            return T;
        } else {
            if (obj == RKF_NEIGHBOR_SUGGESTIONS) {
                return NIL;
            } else {
                return NIL;
            }
        }
    }

    /**
     *
     *
     * @return BOOLEANP; Is OBJ a method that can be used by RKF-SD-PROMPTER-COMPUTE-KE-DRIVEN-PROMPT-FODDER
    on a prompter more than once, reliably returning :DONE when it's done?
     */
    @LispMethod(comment = "@return BOOLEANP; Is OBJ a method that can be used by RKF-SD-PROMPTER-COMPUTE-KE-DRIVEN-PROMPT-FODDER\r\non a prompter more than once, reliably returning :DONE when it\'s done?")
    public static SubLObject rkf_sd_prompter_iterative_prompt_method_p(final SubLObject obj) {
        if (NIL != valid_constantP(obj, UNPROVIDED)) {
            return T;
        }
        if (obj == RKF_NEIGHBOR_SUGGESTIONS) {
            return NIL;
        }
        return NIL;
    }

    public static final SubLObject rkf_sd_prompter_get_ke_driven_prompt_formulas_alt(SubLObject prompter, SubLObject salience_pred) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject formulas = NIL;
                SubLObject justifications = NIL;
                SubLObject seed_term = rkf_sd_prompter_seed_term(prompter);
                {
                    SubLObject _prev_bind_0 = $rkf_sd_suppress_rarely_known_prompt_formulasP$.currentBinding(thread);
                    try {
                        $rkf_sd_suppress_rarely_known_prompt_formulasP$.bind(rkf_salient_descriptor_prompter_lookup(prompter, $kw147$SUPPRESS_RARELY_KNOWN_PROMPT_FORMULAS_, $rkf_sd_suppress_rarely_known_prompt_formulasP$.getDynamicValue(thread)), thread);
                        {
                            SubLObject mt = rkf_sd_prompter_mt(prompter);
                            if (salience_pred.isFunctionSpec()) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject formulas_49 = funcall(salience_pred, seed_term, mt);
                                    SubLObject justifications_50 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    formulas = formulas_49;
                                    justifications = justifications_50;
                                }
                            } else {
                                if (NIL != valid_constantP(salience_pred, UNPROVIDED)) {
                                    {
                                        SubLObject results_queue = rkf_salient_descriptor_prompter_lookup(prompter, $RESULTS_QUEUE, NIL);
                                        SubLObject no_more_bindingsP = NIL;
                                        {
                                            SubLObject _prev_bind_0_51 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
                                            try {
                                                rkf_salient_descriptor.$rkf_sd_problem_store$.bind(com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_find_or_set_problem_store(prompter), thread);
                                                {
                                                    SubLObject reuse_existingP = rkf_salient_descriptor.rkf_sd_problem_store_okP(rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread));
                                                    {
                                                        SubLObject _prev_bind_0_52 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
                                                        try {
                                                            rkf_salient_descriptor.$rkf_sd_problem_store$.bind(rkf_salient_descriptor.rkf_sd_find_or_make_problem_store(), thread);
                                                            {
                                                                SubLObject store = rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread);
                                                                try {
                                                                    {
                                                                        SubLObject datum = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_ke_driven_inference_and_var(prompter, salience_pred);
                                                                        SubLObject current = datum;
                                                                        SubLObject inference = NIL;
                                                                        SubLObject formula_var = NIL;
                                                                        destructuring_bind_must_consp(current, datum, $list_alt149);
                                                                        inference = current.first();
                                                                        current = current.rest();
                                                                        formula_var = current;
                                                                        while (!((NIL != formulas) || (NIL != no_more_bindingsP))) {
                                                                            {
                                                                                SubLObject max_depth_max = rkf_salient_descriptor.$rkf_sd_formulas_max_depth_max$.getDynamicValue(thread);
                                                                                SubLObject inference_max_depth = inference_datastructures_inference.inference_max_transformation_depth(inference);
                                                                                SubLObject max_depth = (NIL != inference_datastructures_inference.exhausted_inference_p(inference)) ? ((SubLObject) (number_utilities.f_1X(inference_max_depth))) : inference_max_depth;
                                                                                no_more_bindingsP = numG(max_depth, max_depth_max);
                                                                                if (NIL == no_more_bindingsP) {
                                                                                    thread.resetMultipleValues();
                                                                                    {
                                                                                        SubLObject new_formulas = rkf_salient_descriptor.rkf_salient_descriptor_formulas_one_batch(inference, max_depth, mt, formula_var, results_queue);
                                                                                        SubLObject new_justs = thread.secondMultipleValue();
                                                                                        SubLObject exit_condition = thread.thirdMultipleValue();
                                                                                        SubLObject more_results = thread.fourthMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        results_queue = more_results;
                                                                                        {
                                                                                            SubLObject new_formula = NIL;
                                                                                            SubLObject new_formula_53 = NIL;
                                                                                            SubLObject new_just = NIL;
                                                                                            SubLObject new_just_54 = NIL;
                                                                                            for (new_formula = new_formulas, new_formula_53 = new_formula.first(), new_just = new_justs, new_just_54 = new_just.first(); !((NIL == new_just) && (NIL == new_formula)); new_formula = new_formula.rest() , new_formula_53 = new_formula.first() , new_just = new_just.rest() , new_just_54 = new_just.first()) {
                                                                                                if (NIL == com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_suppress_formula_for_seed_termP(new_formula_53, seed_term, new_just_54, mt)) {
                                                                                                    formulas = cons(new_formula_53, formulas);
                                                                                                    justifications = cons(new_just_54, justifications);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        if ($MAX_TIME == exit_condition) {
                                                                                            Errors.warn($str_alt150$Timed_out_after__S_seconds_gettin, rkf_salient_descriptor.$rkf_salient_descriptor_time_cutoff$.getDynamicValue(thread), salience_pred, seed_term);
                                                                                            no_more_bindingsP = T;
                                                                                        } else {
                                                                                            if ($PROBABLY_APPROXIMATELY_DONE == exit_condition) {
                                                                                                Errors.warn($str_alt152$P_A_D__getting__S_for__S___, salience_pred, seed_term);
                                                                                                no_more_bindingsP = T;
                                                                                            } else {
                                                                                                if ($EXHAUST_TOTAL == exit_condition) {
                                                                                                    no_more_bindingsP = T;
                                                                                                } else {
                                                                                                    if (NIL == inference_datastructures_inference.continuable_inference_p(inference)) {
                                                                                                        Errors.warn($str_alt154$_S_is_not_continuable____Exit_con, inference, exit_condition);
                                                                                                        no_more_bindingsP = T;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } 
                                                                        if (NIL == formulas) {
                                                                            inference_datastructures_inference.destroy_inference(inference);
                                                                        }
                                                                    }
                                                                } finally {
                                                                    {
                                                                        SubLObject _prev_bind_0_55 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            if (NIL == reuse_existingP) {
                                                                                rkf_salient_descriptor.rkf_sd_free_problem_store(store);
                                                                            }
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_55, thread);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } finally {
                                                            rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_0_52, thread);
                                                        }
                                                    }
                                                }
                                            } finally {
                                                rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_0_51, thread);
                                            }
                                        }
                                        rkf_salient_descriptor_prompter_set(prompter, $RESULTS_QUEUE, results_queue);
                                    }
                                }
                            }
                        }
                    } finally {
                        $rkf_sd_suppress_rarely_known_prompt_formulasP$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(formulas, justifications);
            }
        }
    }

    public static SubLObject rkf_sd_prompter_get_ke_driven_prompt_formulas(final SubLObject prompter, final SubLObject salience_pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject formulas = NIL;
        SubLObject justifications = NIL;
        final SubLObject seed_term = rkf_salient_descriptor_datastructures.rkf_sd_prompter_seed_term(prompter);
        final SubLObject _prev_bind_0 = $rkf_sd_suppress_rarely_known_prompt_formulasP$.currentBinding(thread);
        try {
            $rkf_sd_suppress_rarely_known_prompt_formulasP$.bind(rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, $kw147$SUPPRESS_RARELY_KNOWN_PROMPT_FORMULAS_, $rkf_sd_suppress_rarely_known_prompt_formulasP$.getDynamicValue(thread)), thread);
            final SubLObject mt = rkf_salient_descriptor_datastructures.rkf_sd_prompter_mt(prompter);
            if (salience_pred.isFunctionSpec()) {
                thread.resetMultipleValues();
                final SubLObject formulas_$43 = funcall(salience_pred, seed_term, mt);
                final SubLObject justifications_$44 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                formulas = formulas_$43;
                justifications = justifications_$44;
            } else
                if (NIL != valid_constantP(salience_pred, UNPROVIDED)) {
                    SubLObject results_queue = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, $RESULTS_QUEUE, NIL);
                    SubLObject no_more_bindingsP = NIL;
                    final SubLObject _prev_bind_0_$45 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
                    try {
                        rkf_salient_descriptor.$rkf_sd_problem_store$.bind(rkf_sd_prompter_find_or_set_problem_store(prompter), thread);
                        final SubLObject reuse_existingP = rkf_salient_descriptor.rkf_sd_problem_store_okP(rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread));
                        final SubLObject _prev_bind_0_$46 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
                        try {
                            rkf_salient_descriptor.$rkf_sd_problem_store$.bind(rkf_salient_descriptor.rkf_sd_find_or_make_problem_store(), thread);
                            final SubLObject store = rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread);
                            try {
                                SubLObject current;
                                final SubLObject datum = current = rkf_sd_prompter_ke_driven_inference_and_var(prompter, salience_pred);
                                SubLObject inference = NIL;
                                SubLObject formula_var = NIL;
                                destructuring_bind_must_consp(current, datum, $list149);
                                inference = current.first();
                                current = formula_var = current.rest();
                                while ((NIL == formulas) && (NIL == no_more_bindingsP)) {
                                    final SubLObject max_depth_max = rkf_salient_descriptor.$rkf_sd_formulas_max_depth_max$.getDynamicValue(thread);
                                    final SubLObject inference_max_depth = inference_datastructures_inference.inference_max_transformation_depth(inference);
                                    final SubLObject max_depth = (NIL != inference_datastructures_inference.exhausted_inference_p(inference)) ? number_utilities.f_1X(inference_max_depth) : inference_max_depth;
                                    no_more_bindingsP = numG(max_depth, max_depth_max);
                                    if (NIL == no_more_bindingsP) {
                                        thread.resetMultipleValues();
                                        final SubLObject new_formulas = rkf_salient_descriptor.rkf_salient_descriptor_formulas_one_batch(inference, max_depth, mt, formula_var, results_queue);
                                        final SubLObject new_justs = thread.secondMultipleValue();
                                        final SubLObject exit_condition = thread.thirdMultipleValue();
                                        final SubLObject more_results = thread.fourthMultipleValue();
                                        thread.resetMultipleValues();
                                        results_queue = more_results;
                                        SubLObject new_formula = NIL;
                                        SubLObject new_formula_$47 = NIL;
                                        SubLObject new_just = NIL;
                                        SubLObject new_just_$48 = NIL;
                                        new_formula = new_formulas;
                                        new_formula_$47 = new_formula.first();
                                        new_just = new_justs;
                                        new_just_$48 = new_just.first();
                                        while ((NIL != new_just) || (NIL != new_formula)) {
                                            if (NIL == rkf_sd_suppress_formula_for_seed_termP(new_formula_$47, seed_term, new_just_$48, mt)) {
                                                formulas = cons(new_formula_$47, formulas);
                                                justifications = cons(new_just_$48, justifications);
                                            }
                                            new_formula = new_formula.rest();
                                            new_formula_$47 = new_formula.first();
                                            new_just = new_just.rest();
                                            new_just_$48 = new_just.first();
                                        } 
                                        if ($MAX_TIME == exit_condition) {
                                            Errors.warn($str150$Timed_out_after__S_seconds_gettin, rkf_salient_descriptor.$rkf_salient_descriptor_time_cutoff$.getDynamicValue(thread), salience_pred, seed_term);
                                            no_more_bindingsP = T;
                                        } else
                                            if ($PROBABLY_APPROXIMATELY_DONE == exit_condition) {
                                                Errors.warn($str152$P_A_D__getting__S_for__S___, salience_pred, seed_term);
                                                no_more_bindingsP = T;
                                            } else
                                                if ($EXHAUST_TOTAL == exit_condition) {
                                                    no_more_bindingsP = T;
                                                } else {
                                                    if (NIL != inference_datastructures_inference.continuable_inference_p(inference)) {
                                                        continue;
                                                    }
                                                    Errors.warn($str154$_S_is_not_continuable____Exit_con, inference, exit_condition);
                                                    no_more_bindingsP = T;
                                                }


                                    }
                                } 
                                if (NIL == formulas) {
                                    inference_datastructures_inference.destroy_inference(inference);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$47 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL == reuse_existingP) {
                                        rkf_salient_descriptor.rkf_sd_free_problem_store(store);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$47, thread);
                                }
                            }
                        } finally {
                            rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_0_$46, thread);
                        }
                    } finally {
                        rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_0_$45, thread);
                    }
                    rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_set(prompter, $RESULTS_QUEUE, results_queue);
                }

        } finally {
            $rkf_sd_suppress_rarely_known_prompt_formulasP$.rebind(_prev_bind_0, thread);
        }
        return values(formulas, justifications);
    }

    public static final SubLObject rkf_sd_suppress_formula_for_seed_termP_alt(SubLObject formula, SubLObject seed_term, SubLObject justification, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject suppressP = NIL;
                if (NIL != $rkf_sd_suppress_rarely_known_prompt_formulasP$.getDynamicValue(thread)) {
                    {
                        SubLObject salient_property_sentence = rkf_salient_descriptor.rkf_salient_property_sentence_from_justification(seed_term, justification);
                        if (NIL != possibly_sentence_p(salient_property_sentence)) {
                            {
                                SubLObject seed_term_sentence = simplifier.conjoin(list(salient_property_sentence, formula), UNPROVIDED);
                                SubLObject seed_term_var = czer_utilities.unique_el_var_wrt_expression(seed_term_sentence, $sym155$_SEED_TERM);
                                SubLObject query_formula = cycl_utilities.expression_subst(seed_term_var, seed_term, seed_term_sentence, UNPROVIDED, UNPROVIDED);
                                SubLObject threshold = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_suppress_formula_threshold(salient_property_sentence, seed_term, mt);
                                SubLObject v_bindings = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_suppress_formula_test_query(query_formula, mt, threshold);
                                suppressP = list_utilities.lengthL(v_bindings, threshold, UNPROVIDED);
                                if (NIL != suppressP) {
                                    Errors.warn($str_alt156$Suppressing_SD_prompt_for__S_____, seed_term, formula, threshold);
                                }
                            }
                        }
                    }
                }
                return suppressP;
            }
        }
    }

    public static SubLObject rkf_sd_suppress_formula_for_seed_termP(final SubLObject formula, final SubLObject seed_term, final SubLObject justification, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject suppressP = NIL;
        if (NIL != $rkf_sd_suppress_rarely_known_prompt_formulasP$.getDynamicValue(thread)) {
            final SubLObject salient_property_sentence = rkf_salient_descriptor.rkf_salient_property_sentence_from_justification(seed_term, justification);
            if (NIL != possibly_sentence_p(salient_property_sentence)) {
                final SubLObject seed_term_sentence = simplifier.conjoin(list(salient_property_sentence, formula), UNPROVIDED);
                final SubLObject seed_term_var = czer_utilities.unique_el_var_wrt_expression(seed_term_sentence, $sym155$_SEED_TERM);
                final SubLObject query_formula = cycl_utilities.expression_subst(seed_term_var, seed_term, seed_term_sentence, UNPROVIDED, UNPROVIDED);
                final SubLObject threshold = rkf_sd_suppress_formula_threshold(salient_property_sentence, seed_term, mt);
                final SubLObject v_bindings = rkf_sd_suppress_formula_test_query(query_formula, mt, threshold);
                suppressP = list_utilities.lengthL(v_bindings, threshold, UNPROVIDED);
                if (NIL != suppressP) {
                    Errors.warn($str156$Suppressing_SD_prompt_for__S_____, seed_term, formula, threshold);
                }
            }
        }
        return suppressP;
    }

    public static final SubLObject rkf_sd_suppress_formula_threshold_alt(SubLObject salient_property_sentence, SubLObject seed_term, SubLObject mt) {
        {
            SubLObject salient_property = properties.sentence_to_property(salient_property_sentence, seed_term);
            return com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_suppress_formula_threshold_for_property(salient_property, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject rkf_sd_suppress_formula_threshold(final SubLObject salient_property_sentence, final SubLObject seed_term, final SubLObject mt) {
        final SubLObject salient_property = properties.sentence_to_property(salient_property_sentence, seed_term);
        return rkf_sd_suppress_formula_threshold_for_property(salient_property, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject rkf_sd_suppress_formula_threshold_for_property_internal_alt(SubLObject salient_property, SubLObject mt, SubLObject problem_store, SubLObject min_percent, SubLObject min_count) {
        if (problem_store == UNPROVIDED) {
            problem_store = rkf_salient_descriptor.rkf_sd_find_or_make_problem_store();
        }
        if (min_percent == UNPROVIDED) {
            min_percent = $rkf_sd_suppress_formula_percent_min$.getDynamicValue();
        }
        if (min_count == UNPROVIDED) {
            min_count = $rkf_sd_suppress_formula_count_min$.getDynamicValue();
        }
        {
            SubLObject salient_property_extent = properties.property_extent(salient_property, mt, list($PROBLEM_STORE, problem_store));
            SubLObject threshold_via_percent = integerDivide(multiply(length(salient_property_extent), min_percent), $int$100);
            return max(threshold_via_percent, min_count);
        }
    }

    public static SubLObject rkf_sd_suppress_formula_threshold_for_property_internal(final SubLObject salient_property, final SubLObject mt, SubLObject problem_store, SubLObject min_percent, SubLObject min_count) {
        if (problem_store == UNPROVIDED) {
            problem_store = rkf_salient_descriptor.rkf_sd_find_or_make_problem_store();
        }
        if (min_percent == UNPROVIDED) {
            min_percent = $rkf_sd_suppress_formula_percent_min$.getDynamicValue();
        }
        if (min_count == UNPROVIDED) {
            min_count = $rkf_sd_suppress_formula_count_min$.getDynamicValue();
        }
        final SubLObject salient_property_extent = properties.property_extent(salient_property, mt, list($PROBLEM_STORE, problem_store));
        final SubLObject threshold_via_percent = integerDivide(multiply(length(salient_property_extent), min_percent), $int$100);
        return max(threshold_via_percent, min_count);
    }

    public static final SubLObject rkf_sd_suppress_formula_threshold_for_property_alt(SubLObject salient_property, SubLObject mt, SubLObject problem_store, SubLObject min_percent, SubLObject min_count) {
        if (problem_store == UNPROVIDED) {
            problem_store = rkf_salient_descriptor.rkf_sd_find_or_make_problem_store();
        }
        if (min_percent == UNPROVIDED) {
            min_percent = $rkf_sd_suppress_formula_percent_min$.getDynamicValue();
        }
        if (min_count == UNPROVIDED) {
            min_count = $rkf_sd_suppress_formula_count_min$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_suppress_formula_threshold_for_property_internal(salient_property, mt, problem_store, min_percent, min_count);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, RKF_SD_SUPPRESS_FORMULA_THRESHOLD_FOR_PROPERTY, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), RKF_SD_SUPPRESS_FORMULA_THRESHOLD_FOR_PROPERTY, FIVE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, RKF_SD_SUPPRESS_FORMULA_THRESHOLD_FOR_PROPERTY, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_5(salient_property, mt, problem_store, min_percent, min_count);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw158$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (salient_property.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (mt.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (problem_store.equal(cached_args.first())) {
                                                cached_args = cached_args.rest();
                                                if (min_percent.equal(cached_args.first())) {
                                                    cached_args = cached_args.rest();
                                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && min_count.equal(cached_args.first())) {
                                                        return memoization_state.caching_results(results2);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_suppress_formula_threshold_for_property_internal(salient_property, mt, problem_store, min_percent, min_count)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(salient_property, mt, problem_store, min_percent, min_count));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject rkf_sd_suppress_formula_threshold_for_property(final SubLObject salient_property, final SubLObject mt, SubLObject problem_store, SubLObject min_percent, SubLObject min_count) {
        if (problem_store == UNPROVIDED) {
            problem_store = rkf_salient_descriptor.rkf_sd_find_or_make_problem_store();
        }
        if (min_percent == UNPROVIDED) {
            min_percent = $rkf_sd_suppress_formula_percent_min$.getDynamicValue();
        }
        if (min_count == UNPROVIDED) {
            min_count = $rkf_sd_suppress_formula_count_min$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return rkf_sd_suppress_formula_threshold_for_property_internal(salient_property, mt, problem_store, min_percent, min_count);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, RKF_SD_SUPPRESS_FORMULA_THRESHOLD_FOR_PROPERTY, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), RKF_SD_SUPPRESS_FORMULA_THRESHOLD_FOR_PROPERTY, FIVE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, RKF_SD_SUPPRESS_FORMULA_THRESHOLD_FOR_PROPERTY, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_5(salient_property, mt, problem_store, min_percent, min_count);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (salient_property.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (problem_store.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (min_percent.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && min_count.equal(cached_args.first())) {
                                    return memoization_state.caching_results(results2);
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(rkf_sd_suppress_formula_threshold_for_property_internal(salient_property, mt, problem_store, min_percent, min_count)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(salient_property, mt, problem_store, min_percent, min_count));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject rkf_sd_suppress_formula_test_query_alt(SubLObject query_formula, SubLObject mt, SubLObject threshold) {
        return inference_kernel.new_cyc_query(query_formula, mt, list($MAX_NUMBER, threshold, $PROBLEM_STORE, rkf_salient_descriptor.rkf_sd_find_or_make_problem_store()));
    }

    public static SubLObject rkf_sd_suppress_formula_test_query(final SubLObject query_formula, final SubLObject mt, final SubLObject threshold) {
        return inference_kernel.new_cyc_query(query_formula, mt, list($MAX_NUMBER, threshold, $PROBLEM_STORE, rkf_salient_descriptor.rkf_sd_find_or_make_problem_store()));
    }

    public static final SubLObject rkf_sd_prompter_ke_driven_inference_and_var_alt(SubLObject prompter, SubLObject salience_pred) {
        {
            SubLObject seed_term = rkf_sd_prompter_seed_term(prompter);
            SubLObject mt = rkf_sd_prompter_mt(prompter);
            SubLObject cached_inferences = rkf_salient_descriptor_prompter_lookup(prompter, $CACHED_INFERENCES, dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
            SubLObject inference_and_var = dictionary.dictionary_lookup(cached_inferences, salience_pred, $list_alt160);
            SubLObject datum = inference_and_var;
            SubLObject current = datum;
            SubLObject inference = NIL;
            SubLObject var = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt161);
            inference = current.first();
            current = current.rest();
            var = current;
            if (NIL == inference_datastructures_inference.valid_inference_p(inference)) {
                {
                    SubLObject formula_var = $sym162$_FORMULA;
                    SubLObject inference_56 = rkf_salient_descriptor.rkf_salient_descriptor_formulas_inference(seed_term, formula_var, salience_pred, mt);
                    inference_and_var = cons(inference_56, formula_var);
                    dictionary.dictionary_enter(cached_inferences, salience_pred, inference_and_var);
                }
            }
            return inference_and_var;
        }
    }

    public static SubLObject rkf_sd_prompter_ke_driven_inference_and_var(final SubLObject prompter, final SubLObject salience_pred) {
        final SubLObject seed_term = rkf_salient_descriptor_datastructures.rkf_sd_prompter_seed_term(prompter);
        final SubLObject mt = rkf_salient_descriptor_datastructures.rkf_sd_prompter_mt(prompter);
        final SubLObject cached_inferences = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, $CACHED_INFERENCES, dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        SubLObject inference_and_var = dictionary.dictionary_lookup(cached_inferences, salience_pred, $list159);
        SubLObject current;
        final SubLObject datum = current = inference_and_var;
        SubLObject inference = NIL;
        SubLObject var = NIL;
        destructuring_bind_must_consp(current, datum, $list160);
        inference = current.first();
        current = var = current.rest();
        if (NIL == inference_datastructures_inference.valid_inference_p(inference)) {
            final SubLObject formula_var = $sym161$_FORMULA;
            final SubLObject inference_$50 = rkf_salient_descriptor.rkf_salient_descriptor_formulas_inference(seed_term, formula_var, salience_pred, mt);
            inference_and_var = cons(inference_$50, formula_var);
            dictionary.dictionary_enter(cached_inferences, salience_pred, inference_and_var);
        }
        return inference_and_var;
    }

    /**
     * Add prompt based on similarity to other term
     */
    @LispMethod(comment = "Add prompt based on similarity to other term")
    public static final SubLObject rkf_sd_prompter_analogize_alt(SubLObject prompter) {
        {
            SubLObject analogous_terms_results = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_get_analogous_terms(prompter);
            while (NIL == queues.queue_empty_p(analogous_terms_results)) {
                {
                    SubLObject result = queues.queue_peek(analogous_terms_results);
                    SubLObject datum = result;
                    SubLObject current = datum;
                    SubLObject v_bindings = NIL;
                    SubLObject supports = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt163);
                    v_bindings = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt163);
                    supports = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject source_term_var = $sym164$_SOURCE_TERM;
                            SubLObject source_term = bindings.variable_lookup(source_term_var, v_bindings);
                            SubLObject result_57 = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_add_analogy_prompt(prompter, source_term, supports);
                            if ($DONE == result_57) {
                                queues.dequeue(analogous_terms_results);
                            } else {
                                return result_57;
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt163);
                    }
                }
            } 
        }
        com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_clear_analogous_terms(prompter);
        return $DONE;
    }

    @LispMethod(comment = "Add prompt based on similarity to other term")
    public static SubLObject rkf_sd_prompter_analogize(final SubLObject prompter) {
        final SubLObject analogous_terms_results = rkf_sd_prompter_get_analogous_terms(prompter);
        while (NIL == queues.queue_empty_p(analogous_terms_results)) {
            final SubLObject result = queues.queue_peek(analogous_terms_results);
            SubLObject current;
            final SubLObject datum = current = result;
            SubLObject v_bindings = NIL;
            SubLObject supports = NIL;
            destructuring_bind_must_consp(current, datum, $list162);
            v_bindings = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list162);
            supports = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject source_term_var = $sym163$_SOURCE_TERM;
                final SubLObject source_term = bindings.variable_lookup(source_term_var, v_bindings);
                final SubLObject result_$51 = rkf_sd_prompter_add_analogy_prompt(prompter, source_term, supports);
                if ($DONE != result_$51) {
                    return result_$51;
                }
                queues.dequeue(analogous_terms_results);
            } else {
                cdestructuring_bind_error(datum, $list162);
            }
        } 
        rkf_sd_prompter_clear_analogous_terms(prompter);
        return $DONE;
    }/**
     * Add prompt based on similarity to other term
     */


    public static final SubLObject rkf_sd_prompter_get_analogous_terms_alt(SubLObject prompter) {
        {
            SubLObject analogous_terms_field = $ANALOGOUS_TERMS;
            SubLObject analogous_terms = rkf_salient_descriptor_prompter_lookup(prompter, analogous_terms_field, NIL);
            if (NIL == queues.queue_p(analogous_terms)) {
                {
                    SubLObject seed_term = rkf_sd_prompter_seed_term(prompter);
                    SubLObject mt = rkf_sd_prompter_mt(prompter);
                    SubLObject source_term_var = $sym164$_SOURCE_TERM;
                    SubLObject query_formula = make_binary_formula($$similarTo, seed_term, source_term_var);
                    SubLObject query_results = rkf_query_utilities.rkf_ask(query_formula, mt, NIL, NIL, UNPROVIDED, UNPROVIDED);
                    analogous_terms = queues.create_queue();
                    {
                        SubLObject cdolist_list_var = query_results;
                        SubLObject result = NIL;
                        for (result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result = cdolist_list_var.first()) {
                            queues.enqueue(result, analogous_terms);
                        }
                    }
                }
                rkf_salient_descriptor_prompter_set(prompter, analogous_terms_field, analogous_terms);
            }
            return analogous_terms;
        }
    }

    public static SubLObject rkf_sd_prompter_get_analogous_terms(final SubLObject prompter) {
        final SubLObject analogous_terms_field = $ANALOGOUS_TERMS;
        SubLObject analogous_terms = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, analogous_terms_field, NIL);
        if (NIL == queues.queue_p(analogous_terms)) {
            final SubLObject seed_term = rkf_salient_descriptor_datastructures.rkf_sd_prompter_seed_term(prompter);
            final SubLObject mt = rkf_salient_descriptor_datastructures.rkf_sd_prompter_mt(prompter);
            final SubLObject source_term_var = $sym163$_SOURCE_TERM;
            final SubLObject query_formula = make_binary_formula($$similarTo, seed_term, source_term_var);
            final SubLObject query_results = rkf_query_utilities.rkf_ask(query_formula, mt, NIL, NIL, UNPROVIDED, UNPROVIDED);
            analogous_terms = queues.create_queue(UNPROVIDED);
            SubLObject cdolist_list_var = query_results;
            SubLObject result = NIL;
            result = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                queues.enqueue(result, analogous_terms);
                cdolist_list_var = cdolist_list_var.rest();
                result = cdolist_list_var.first();
            } 
            rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_set(prompter, analogous_terms_field, analogous_terms);
        }
        return analogous_terms;
    }

    public static final SubLObject rkf_sd_prompter_clear_analogous_terms_alt(SubLObject prompter) {
        {
            SubLObject analogous_terms_field = $ANALOGOUS_TERMS;
            return rkf_salient_descriptor_prompter_clear(prompter, analogous_terms_field);
        }
    }

    public static SubLObject rkf_sd_prompter_clear_analogous_terms(final SubLObject prompter) {
        final SubLObject analogous_terms_field = $ANALOGOUS_TERMS;
        return rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_clear(prompter, analogous_terms_field);
    }

    /**
     * Add prompt based on similarity to SOURCE-TERM, as justified by ANALOGOSITY-SUPPORTS.
     */
    @LispMethod(comment = "Add prompt based on similarity to SOURCE-TERM, as justified by ANALOGOSITY-SUPPORTS.")
    public static final SubLObject rkf_sd_prompter_add_analogy_prompt_alt(SubLObject prompter, SubLObject source_term, SubLObject analogosity_supports) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject formulas = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_get_analogy_suggestions(prompter, source_term);
                SubLObject tactic = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_salient_descriptor_prompter_current_tactic(prompter);
                SubLObject seed_term = rkf_sd_prompter_seed_term(prompter);
                SubLObject salient_property_sentence = make_binary_formula($$similarTo, seed_term, source_term);
                while (NIL == queues.queue_empty_p(formulas)) {
                    {
                        SubLObject ground_formula = queues.queue_peek(formulas);
                        thread.resetMultipleValues();
                        {
                            SubLObject formula = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_loosen_analogy_formula(seed_term, ground_formula);
                            SubLObject v_bindings = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            queues.dequeue(formulas);
                            {
                                SubLObject justifications = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_analogy_justifications(prompter, source_term, ground_formula, formula);
                                if (NIL != list_utilities.doubletonP(justifications)) {
                                    {
                                        SubLObject datum = justifications;
                                        SubLObject current = datum;
                                        SubLObject source_justification = NIL;
                                        SubLObject unknown_justification = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt167);
                                        source_justification = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt167);
                                        unknown_justification = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            {
                                                SubLObject new_prompt = new_rkf_sd_prompt();
                                                SubLObject justification = append(analogosity_supports, source_justification);
                                                rkf_sd_prompt_set_formula(new_prompt, formula);
                                                rkf_sd_prompt_set_tactic(new_prompt, tactic);
                                                rkf_sd_prompt_set_justification(new_prompt, justification);
                                                rkf_sd_prompt_set_salient_property_sentence(new_prompt, salient_property_sentence);
                                                com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_add_prompt(prompter, new_prompt);
                                                com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompt_add_analogy_examples(new_prompt, source_term, v_bindings, source_justification);
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum, $list_alt167);
                                        }
                                    }
                                    if (NIL != queues.queue_empty_p(formulas)) {
                                        com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_clear_analogy_suggestions(prompter);
                                        return $DONE;
                                    } else {
                                        return prompter;
                                    }
                                }
                            }
                        }
                    }
                } 
            }
            com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_clear_analogy_suggestions(prompter);
            return $DONE;
        }
    }

    @LispMethod(comment = "Add prompt based on similarity to SOURCE-TERM, as justified by ANALOGOSITY-SUPPORTS.")
    public static SubLObject rkf_sd_prompter_add_analogy_prompt(final SubLObject prompter, final SubLObject source_term, final SubLObject analogosity_supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject formulas = rkf_sd_prompter_get_analogy_suggestions(prompter, source_term);
        final SubLObject tactic = rkf_salient_descriptor_prompter_current_tactic(prompter);
        final SubLObject seed_term = rkf_salient_descriptor_datastructures.rkf_sd_prompter_seed_term(prompter);
        final SubLObject salient_property_sentence = make_binary_formula($$similarTo, seed_term, source_term);
        while (NIL == queues.queue_empty_p(formulas)) {
            final SubLObject ground_formula = queues.queue_peek(formulas);
            thread.resetMultipleValues();
            final SubLObject formula = rkf_sd_prompter_loosen_analogy_formula(seed_term, ground_formula);
            final SubLObject v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            queues.dequeue(formulas);
            final SubLObject justifications = rkf_sd_analogy_justifications(prompter, source_term, ground_formula, formula);
            if (NIL != list_utilities.doubletonP(justifications)) {
                SubLObject current;
                final SubLObject datum = current = justifications;
                SubLObject source_justification = NIL;
                SubLObject unknown_justification = NIL;
                destructuring_bind_must_consp(current, datum, $list166);
                source_justification = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list166);
                unknown_justification = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject new_prompt = rkf_salient_descriptor_datastructures.new_rkf_sd_prompt();
                    final SubLObject justification = append(analogosity_supports, source_justification);
                    rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_formula(new_prompt, formula);
                    rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_tactic(new_prompt, tactic);
                    rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_justification(new_prompt, justification);
                    rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_salient_property_sentence(new_prompt, salient_property_sentence);
                    rkf_sd_prompter_add_prompt(prompter, new_prompt);
                    rkf_sd_prompt_add_analogy_examples(new_prompt, source_term, v_bindings, source_justification);
                } else {
                    cdestructuring_bind_error(datum, $list166);
                }
                if (NIL != queues.queue_empty_p(formulas)) {
                    rkf_sd_prompter_clear_analogy_suggestions(prompter);
                    return $DONE;
                }
                return prompter;
            }
        } 
        rkf_sd_prompter_clear_analogy_suggestions(prompter);
        return $DONE;
    }/**
     * Add prompt based on similarity to SOURCE-TERM, as justified by ANALOGOSITY-SUPPORTS.
     */


    /**
     * Compute examples for NEW-PROMPT, and add examples from SOURCE-TERM, from BINDINGS.
     */
    @LispMethod(comment = "Compute examples for NEW-PROMPT, and add examples from SOURCE-TERM, from BINDINGS.")
    public static final SubLObject rkf_sd_prompt_add_analogy_examples_alt(SubLObject new_prompt, SubLObject source_term, SubLObject v_bindings, SubLObject source_justification) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = rkf_salient_descriptor.$rkf_examples_to_show$.currentBinding(thread);
                try {
                    rkf_salient_descriptor.$rkf_examples_to_show$.bind(number_utilities.maximum(list(ZERO_INTEGER, number_utilities.f_1_(rkf_salient_descriptor.$rkf_examples_to_show$.getDynamicValue(thread))), UNPROVIDED), thread);
                    com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompt_compute_subprompts(new_prompt);
                } finally {
                    rkf_salient_descriptor.$rkf_examples_to_show$.rebind(_prev_bind_0, thread);
                }
            }
            {
                SubLObject subprompts = rkf_sd_prompt_subprompts(new_prompt);
                if (NIL != rkf_salient_descriptor.rkf_salient_descriptor_subprompts_p(subprompts)) {
                    {
                        SubLObject cdolist_list_var = subprompts;
                        SubLObject subprompt = NIL;
                        for (subprompt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subprompt = cdolist_list_var.first()) {
                            {
                                SubLObject var = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_var(subprompt);
                                SubLObject precedent = bindings.variable_lookup(var, v_bindings);
                                if (NIL != precedent) {
                                    {
                                        SubLObject supports = source_justification;
                                        SubLObject new_example = new_rkf_sd_example($PRECEDENT, precedent, supports, source_term);
                                        SubLObject existing = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_examples(subprompt);
                                        SubLObject new_examples = cons(new_example, existing);
                                        rkf_salient_descriptor.rkf_salient_descriptor_subprompt_set_examples(subprompt, new_examples);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return new_prompt;
        }
    }

    @LispMethod(comment = "Compute examples for NEW-PROMPT, and add examples from SOURCE-TERM, from BINDINGS.")
    public static SubLObject rkf_sd_prompt_add_analogy_examples(final SubLObject new_prompt, final SubLObject source_term, final SubLObject v_bindings, final SubLObject source_justification) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = rkf_salient_descriptor.$rkf_examples_to_show$.currentBinding(thread);
        try {
            rkf_salient_descriptor.$rkf_examples_to_show$.bind(number_utilities.maximum(list(ZERO_INTEGER, number_utilities.f_1_(rkf_salient_descriptor.$rkf_examples_to_show$.getDynamicValue(thread))), UNPROVIDED), thread);
            rkf_sd_prompt_compute_subprompts(new_prompt);
        } finally {
            rkf_salient_descriptor.$rkf_examples_to_show$.rebind(_prev_bind_0, thread);
        }
        final SubLObject subprompts = rkf_salient_descriptor_datastructures.rkf_sd_prompt_subprompts(new_prompt);
        if (NIL != rkf_salient_descriptor.rkf_salient_descriptor_subprompts_p(subprompts)) {
            SubLObject cdolist_list_var = subprompts;
            SubLObject subprompt = NIL;
            subprompt = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject var = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_var(subprompt);
                final SubLObject precedent = bindings.variable_lookup(var, v_bindings);
                if (NIL != precedent) {
                    final SubLObject new_example = rkf_salient_descriptor_datastructures.new_rkf_sd_example($PRECEDENT, precedent, source_justification, source_term);
                    final SubLObject existing = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_examples(subprompt);
                    final SubLObject new_examples = cons(new_example, existing);
                    rkf_salient_descriptor.rkf_salient_descriptor_subprompt_set_examples(subprompt, new_examples);
                }
                cdolist_list_var = cdolist_list_var.rest();
                subprompt = cdolist_list_var.first();
            } 
        }
        return new_prompt;
    }/**
     * Compute examples for NEW-PROMPT, and add examples from SOURCE-TERM, from BINDINGS.
     */


    public static final SubLObject rkf_sd_prompter_loosen_analogy_formula_alt(SubLObject seed_term, SubLObject ground_formula) {
        if ((NIL != forts.fort_p(seed_term)) && (NIL != el_formula_p(ground_formula))) {
            {
                SubLObject argnum = ZERO_INTEGER;
                SubLObject args = cycl_utilities.formula_args(ground_formula, $IGNORE);
                SubLObject cdolist_list_var = args;
                SubLObject arg = NIL;
                for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                    argnum = add(argnum, ONE_INTEGER);
                    if (NIL == com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_uneditable_analogy_argP(arg, seed_term)) {
                        {
                            SubLObject var = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_analogy_var(ground_formula, argnum);
                            SubLObject loose = make_existential(var, replace_formula_arg(argnum, var, ground_formula));
                            SubLObject v_bindings = list(bindings.make_variable_binding(var, arg));
                            return values(loose, v_bindings);
                        }
                    }
                }
            }
        }
        return values(ground_formula, NIL);
    }

    public static SubLObject rkf_sd_prompter_loosen_analogy_formula(final SubLObject seed_term, final SubLObject ground_formula) {
        if ((NIL != forts.fort_p(seed_term)) && (NIL != el_formula_p(ground_formula))) {
            SubLObject argnum = ZERO_INTEGER;
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(ground_formula, $IGNORE);
            SubLObject arg = NIL;
            arg = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                argnum = add(argnum, ONE_INTEGER);
                if (NIL == rkf_sd_prompter_uneditable_analogy_argP(arg, seed_term)) {
                    final SubLObject var = rkf_sd_prompter_analogy_var(ground_formula, argnum);
                    final SubLObject loose = make_existential(var, replace_formula_arg(argnum, var, ground_formula));
                    final SubLObject v_bindings = list(bindings.make_variable_binding(var, arg));
                    return values(loose, v_bindings);
                }
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            } 
        }
        return values(ground_formula, NIL);
    }

    /**
     *
     *
     * @return BOOLEANP; Should we make the user leave ARG alone, and not edit it?
     */
    @LispMethod(comment = "@return BOOLEANP; Should we make the user leave ARG alone, and not edit it?")
    public static final SubLObject rkf_sd_prompter_uneditable_analogy_argP_alt(SubLObject arg, SubLObject seed_term) {
        return makeBoolean(arg.eql(seed_term) || (NIL != isa.isaP(arg, $$Predicate, UNPROVIDED, UNPROVIDED)));
    }

    /**
     *
     *
     * @return BOOLEANP; Should we make the user leave ARG alone, and not edit it?
     */
    @LispMethod(comment = "@return BOOLEANP; Should we make the user leave ARG alone, and not edit it?")
    public static SubLObject rkf_sd_prompter_uneditable_analogy_argP(final SubLObject arg, final SubLObject seed_term) {
        return makeBoolean(arg.eql(seed_term) || (NIL != isa.isaP(arg, $$Predicate, UNPROVIDED, UNPROVIDED)));
    }

    /**
     *
     *
     * @return EL-VAR?; appropriate for ARGNUM of GROUND-FORMULA.
     * @unknown - It would be nice to come up with a var name tailored for GROUND-FORMULA and ARGNUM.
     */
    @LispMethod(comment = "@return EL-VAR?; appropriate for ARGNUM of GROUND-FORMULA.\r\n@unknown - It would be nice to come up with a var name tailored for GROUND-FORMULA and ARGNUM.")
    public static final SubLObject rkf_sd_prompter_analogy_var_alt(SubLObject ground_formula, SubLObject argnum) {
        return $sym170$_X;
    }

    /**
     *
     *
     * @return EL-VAR?; appropriate for ARGNUM of GROUND-FORMULA.
     * @unknown - It would be nice to come up with a var name tailored for GROUND-FORMULA and ARGNUM.
     */
    @LispMethod(comment = "@return EL-VAR?; appropriate for ARGNUM of GROUND-FORMULA.\r\n@unknown - It would be nice to come up with a var name tailored for GROUND-FORMULA and ARGNUM.")
    public static SubLObject rkf_sd_prompter_analogy_var(final SubLObject ground_formula, final SubLObject argnum) {
        return $sym169$_X;
    }

    public static final SubLObject rkf_sd_prompter_get_analogy_suggestions_alt(SubLObject prompter, SubLObject source_term) {
        {
            SubLObject analogy_suggestions_field = $ANALOGY_SUGGESTIONS;
            SubLObject suggestions = rkf_salient_descriptor_prompter_lookup(prompter, analogy_suggestions_field, NIL);
            if (NIL == queues.queue_p(suggestions)) {
                {
                    SubLObject seed_term = rkf_sd_prompter_seed_term(prompter);
                    SubLObject mt = rkf_sd_prompter_mt(prompter);
                    SubLObject formulas = rkf_analogy_developer.rkf_analogous_formulas(seed_term, source_term, mt);
                    suggestions = queues.create_queue();
                    {
                        SubLObject cdolist_list_var = formulas;
                        SubLObject formula = NIL;
                        for (formula = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , formula = cdolist_list_var.first()) {
                            queues.enqueue(formula, suggestions);
                        }
                    }
                }
                rkf_salient_descriptor_prompter_set(prompter, analogy_suggestions_field, suggestions);
            }
            return suggestions;
        }
    }

    public static SubLObject rkf_sd_prompter_get_analogy_suggestions(final SubLObject prompter, final SubLObject source_term) {
        final SubLObject analogy_suggestions_field = $ANALOGY_SUGGESTIONS;
        SubLObject suggestions = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, analogy_suggestions_field, NIL);
        if (NIL == queues.queue_p(suggestions)) {
            final SubLObject seed_term = rkf_salient_descriptor_datastructures.rkf_sd_prompter_seed_term(prompter);
            final SubLObject mt = rkf_salient_descriptor_datastructures.rkf_sd_prompter_mt(prompter);
            final SubLObject formulas = rkf_analogy_developer.rkf_analogous_formulas(seed_term, source_term, mt);
            suggestions = queues.create_queue(UNPROVIDED);
            SubLObject cdolist_list_var = formulas;
            SubLObject formula = NIL;
            formula = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                queues.enqueue(formula, suggestions);
                cdolist_list_var = cdolist_list_var.rest();
                formula = cdolist_list_var.first();
            } 
            rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_set(prompter, analogy_suggestions_field, suggestions);
        }
        return suggestions;
    }

    public static final SubLObject rkf_sd_prompter_clear_analogy_suggestions_alt(SubLObject prompter) {
        {
            SubLObject analogy_suggestions_field = $ANALOGY_SUGGESTIONS;
            return rkf_salient_descriptor_prompter_clear(prompter, analogy_suggestions_field);
        }
    }

    public static SubLObject rkf_sd_prompter_clear_analogy_suggestions(final SubLObject prompter) {
        final SubLObject analogy_suggestions_field = $ANALOGY_SUGGESTIONS;
        return rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_clear(prompter, analogy_suggestions_field);
    }

    public static final SubLObject rkf_sd_analogy_justifications_alt(SubLObject prompter, SubLObject source_term, SubLObject ground_formula, SubLObject formula) {
        {
            SubLObject mt = rkf_sd_prompter_mt(prompter);
            SubLObject seed_term = rkf_sd_prompter_seed_term(prompter);
            SubLObject source_formula = cycl_utilities.expression_subst(source_term, seed_term, ground_formula, UNPROVIDED, UNPROVIDED);
            SubLObject source_formula_justification = rkf_query_utilities.rkf_justify(source_formula, mt).first();
            if (NIL != arguments.supports_p(source_formula_justification)) {
                {
                    SubLObject unknown_formula = rkf_salient_descriptor.rkf_sd_conjoin(list(make_unary_formula($$unknownSentence, formula), make_unary_formula($$unknownSentence, make_negation(formula))), NIL, NIL);
                    SubLObject unknown_justification = rkf_query_utilities.rkf_justify(unknown_formula, mt).first();
                    return NIL != arguments.supports_p(unknown_justification) ? ((SubLObject) (list(source_formula_justification, unknown_justification))) : NIL;
                }
            }
            return NIL;
        }
    }

    public static SubLObject rkf_sd_analogy_justifications(final SubLObject prompter, final SubLObject source_term, final SubLObject ground_formula, final SubLObject formula) {
        final SubLObject mt = rkf_salient_descriptor_datastructures.rkf_sd_prompter_mt(prompter);
        final SubLObject seed_term = rkf_salient_descriptor_datastructures.rkf_sd_prompter_seed_term(prompter);
        final SubLObject source_formula = cycl_utilities.expression_subst(source_term, seed_term, ground_formula, UNPROVIDED, UNPROVIDED);
        final SubLObject source_formula_justification = rkf_query_utilities.rkf_justify(source_formula, mt).first();
        if (NIL != arguments.supports_p(source_formula_justification)) {
            final SubLObject unknown_formula = rkf_salient_descriptor.rkf_sd_conjoin(list(make_unary_formula($$unknownSentence, formula), make_unary_formula($$unknownSentence, make_negation(formula))), NIL, NIL);
            final SubLObject unknown_justification = rkf_query_utilities.rkf_justify(unknown_formula, mt).first();
            return NIL != arguments.supports_p(unknown_justification) ? list(source_formula_justification, unknown_justification) : NIL;
        }
        return NIL;
    }

    /**
     * Figure out which rules we could satisfy with targeted prompts, and update
     * PROMPTER appropriately.
     */
    @LispMethod(comment = "Figure out which rules we could satisfy with targeted prompts, and update\r\nPROMPTER appropriately.\nFigure out which rules we could satisfy with targeted prompts, and update\nPROMPTER appropriately.")
    public static final SubLObject rkf_sd_prompter_rules_for_term_alt(SubLObject prompter) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject seed_term = rkf_sd_prompter_seed_term(prompter);
                SubLObject mt = rkf_sd_prompter_mt(prompter);
                SubLObject allowedP = rkf_salient_descriptor_prompter_lookup(prompter, $kw173$USE_RULES_, $FALSE);
                SubLObject rule_table = (NIL != allowedP) ? ((SubLObject) (rkf_salient_descriptor_prompter_lookup(prompter, $RULE_TABLE, $UNKNOWN))) : NIL;
                if (allowedP != $TRUE) {
                    return $DONE;
                }
                if ($UNKNOWN == rule_table) {
                    rule_table = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_rule_table(seed_term, mt);
                    rkf_salient_descriptor_prompter_set(prompter, $RULE_TABLE, rule_table);
                }
                {
                    SubLObject cnfs = NIL;
                    SubLObject gaf = NIL;
                    SubLObject gaf_lit = NIL;
                    SubLObject v_bindings = NIL;
                    SubLObject rule = NIL;
                    SubLObject doneP = NIL;
                    SubLObject unbound_var_max = ONE_INTEGER;
                    SubLObject state = rkf_salient_descriptor_prompter_lookup(prompter, $MEMOIZATION_STATE, memoization_state.current_memoization_state());
                    SubLObject local_state = state;
                    {
                        SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                        try {
                            memoization_state.$memoization_state$.bind(local_state, thread);
                            {
                                SubLObject original_memoization_process = NIL;
                                if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                    original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                    {
                                        SubLObject current_proc = current_process();
                                        if (NIL == original_memoization_process) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                        } else {
                                            if (original_memoization_process != current_proc) {
                                                Errors.error($str_alt22$Invalid_attempt_to_reuse_memoizat);
                                            }
                                        }
                                    }
                                }
                                try {
                                    {
                                        SubLObject _prev_bind_0_58 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
                                        try {
                                            rkf_salient_descriptor.$rkf_sd_problem_store$.bind(com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_find_or_set_problem_store(prompter), thread);
                                            {
                                                SubLObject reuse_existingP = rkf_salient_descriptor.rkf_sd_problem_store_okP(rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread));
                                                {
                                                    SubLObject _prev_bind_0_59 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
                                                    try {
                                                        rkf_salient_descriptor.$rkf_sd_problem_store$.bind(rkf_salient_descriptor.rkf_sd_find_or_make_problem_store(), thread);
                                                        {
                                                            SubLObject store = rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread);
                                                            try {
                                                                while (!((NIL != cnfs) || (NIL != doneP))) {
                                                                    {
                                                                        SubLObject rule_info = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_rule_table_pop(rule_table);
                                                                        if (NIL != rule_info) {
                                                                            {
                                                                                SubLObject datum_evaluated_var = list_utilities.first_n(FOUR_INTEGER, rule_info);
                                                                                gaf = datum_evaluated_var.first();
                                                                                gaf_lit = cadr(datum_evaluated_var);
                                                                                rule = cddr(datum_evaluated_var).first();
                                                                                v_bindings = cadr(cddr(datum_evaluated_var));
                                                                                cnfs = inference_utilities.unsatisfied_cnfs_for_rule(rule, v_bindings, unbound_var_max, mt, rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread));
                                                                            }
                                                                        } else {
                                                                            doneP = T;
                                                                        }
                                                                    }
                                                                } 
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0_60 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL == reuse_existingP) {
                                                                            rkf_salient_descriptor.rkf_sd_free_problem_store(store);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_60, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_0_59, thread);
                                                    }
                                                }
                                            }
                                        } finally {
                                            rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_0_58, thread);
                                        }
                                    }
                                } finally {
                                    {
                                        SubLObject _prev_bind_0_61 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                            }
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_61, thread);
                                        }
                                    }
                                }
                            }
                        } finally {
                            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (NIL == cnfs) {
                        return $DONE;
                    }
                    {
                        SubLObject cdolist_list_var = cnfs;
                        SubLObject cnf = NIL;
                        for (cnf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cnf = cdolist_list_var.first()) {
                            {
                                SubLObject set_contents_var = set.do_set_internal(rkf_sd_prompter_unused_prompts(prompter));
                                SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                SubLObject state_62 = NIL;
                                for (state_62 = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state_62); state_62 = set_contents.do_set_contents_update_state(state_62)) {
                                    {
                                        SubLObject prompt = set_contents.do_set_contents_next(basis_object, state_62);
                                        if (NIL != set_contents.do_set_contents_element_validP(state_62, prompt)) {
                                            {
                                                SubLObject subprompts = rkf_sd_prompt_subprompts(prompt);
                                                if (!((NIL != rkf_sd_prompt_deducible_cnfs(prompt)) || (NIL == rkf_salient_descriptor.rkf_salient_descriptor_subprompts_p(subprompts)))) {
                                                    {
                                                        SubLObject new_cnf = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_subprompts_matches_cnfP(subprompts, cnf);
                                                        if (NIL != new_cnf) {
                                                            {
                                                                SubLObject item_var = new_cnf;
                                                                if (NIL == member(item_var, rkf_sd_prompt_deducible_cnfs(prompt), $sym177$EL_EXPRESSION_EQUAL_, symbol_function(IDENTITY))) {
                                                                    _csetf_rkf_sd_prompt_deducible_cnfs(prompt, cons(item_var, rkf_sd_prompt_deducible_cnfs(prompt)));
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
                            {
                                SubLObject prompt = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompt_from_cnf(cnf, seed_term);
                                SubLObject justification = nreverse(cons(rule, com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompt_justification_from_sentence(gaf_lit, assertions_high.assertion_mt(gaf))));
                                rkf_sd_prompt_set_justification(prompt, justification);
                                rkf_sd_prompt_set_tactic(prompt, RKF_SD_PROMPTER_RULES_FOR_TERM);
                                com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_add_prompt(prompter, prompt);
                                com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompt_compute_subprompts(prompt);
                            }
                        }
                    }
                }
            }
            return prompter;
        }
    }

    @LispMethod(comment = "Figure out which rules we could satisfy with targeted prompts, and update\r\nPROMPTER appropriately.\nFigure out which rules we could satisfy with targeted prompts, and update\nPROMPTER appropriately.")
    public static SubLObject rkf_sd_prompter_rules_for_term(final SubLObject prompter) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject seed_term = rkf_salient_descriptor_datastructures.rkf_sd_prompter_seed_term(prompter);
        final SubLObject mt = rkf_salient_descriptor_datastructures.rkf_sd_prompter_mt(prompter);
        final SubLObject allowedP = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, $kw172$USE_RULES_, $FALSE);
        SubLObject rule_table = (NIL != allowedP) ? rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, $RULE_TABLE, $UNKNOWN) : NIL;
        if (allowedP != $TRUE) {
            return $DONE;
        }
        if ($UNKNOWN == rule_table) {
            rule_table = rkf_sd_prompter_rule_table(seed_term, mt);
            rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_set(prompter, $RULE_TABLE, rule_table);
        }
        SubLObject cnfs = NIL;
        SubLObject gaf = NIL;
        SubLObject gaf_lit = NIL;
        SubLObject v_bindings = NIL;
        SubLObject rule = NIL;
        SubLObject doneP = NIL;
        final SubLObject unbound_var_max = ONE_INTEGER;
        final SubLObject local_state;
        final SubLObject state = local_state = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, $MEMOIZATION_STATE, memoization_state.current_memoization_state());
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject _prev_bind_0_$52 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
                try {
                    rkf_salient_descriptor.$rkf_sd_problem_store$.bind(rkf_sd_prompter_find_or_set_problem_store(prompter), thread);
                    final SubLObject reuse_existingP = rkf_salient_descriptor.rkf_sd_problem_store_okP(rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread));
                    final SubLObject _prev_bind_0_$53 = rkf_salient_descriptor.$rkf_sd_problem_store$.currentBinding(thread);
                    try {
                        rkf_salient_descriptor.$rkf_sd_problem_store$.bind(rkf_salient_descriptor.rkf_sd_find_or_make_problem_store(), thread);
                        final SubLObject store = rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread);
                        try {
                            while ((NIL == cnfs) && (NIL == doneP)) {
                                final SubLObject rule_info = rkf_sd_prompter_rule_table_pop(rule_table);
                                if (NIL != rule_info) {
                                    final SubLObject datum_evaluated_var = list_utilities.first_n(FOUR_INTEGER, rule_info);
                                    gaf = datum_evaluated_var.first();
                                    gaf_lit = cadr(datum_evaluated_var);
                                    rule = cddr(datum_evaluated_var).first();
                                    v_bindings = cadr(cddr(datum_evaluated_var));
                                    cnfs = inference_utilities.unsatisfied_cnfs_for_rule(rule, v_bindings, unbound_var_max, mt, rkf_salient_descriptor.$rkf_sd_problem_store$.getDynamicValue(thread));
                                } else {
                                    doneP = T;
                                }
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$54 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL == reuse_existingP) {
                                    rkf_salient_descriptor.rkf_sd_free_problem_store(store);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$54, thread);
                            }
                        }
                    } finally {
                        rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_0_$53, thread);
                    }
                } finally {
                    rkf_salient_descriptor.$rkf_sd_problem_store$.rebind(_prev_bind_0_$52, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$55 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$55, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        if (NIL == cnfs) {
            return $DONE;
        }
        SubLObject cdolist_list_var = cnfs;
        SubLObject cnf = NIL;
        cnf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject set_var = rkf_salient_descriptor_datastructures.rkf_sd_prompter_unused_prompts(prompter);
            final SubLObject set_contents_var = set.do_set_internal(set_var);
            SubLObject basis_object;
            SubLObject state_$56;
            SubLObject prompt;
            SubLObject subprompts;
            SubLObject new_cnf;
            SubLObject item_var;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state_$56 = NIL, state_$56 = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state_$56); state_$56 = set_contents.do_set_contents_update_state(state_$56)) {
                prompt = set_contents.do_set_contents_next(basis_object, state_$56);
                if (NIL != set_contents.do_set_contents_element_validP(state_$56, prompt)) {
                    subprompts = rkf_salient_descriptor_datastructures.rkf_sd_prompt_subprompts(prompt);
                    if ((NIL == rkf_salient_descriptor_datastructures.rkf_sd_prompt_deducible_cnfs(prompt)) && (NIL != rkf_salient_descriptor.rkf_salient_descriptor_subprompts_p(subprompts))) {
                        new_cnf = rkf_sd_subprompts_matches_cnfP(subprompts, cnf);
                        if (NIL != new_cnf) {
                            item_var = new_cnf;
                            if (NIL == member(item_var, rkf_salient_descriptor_datastructures.rkf_sd_prompt_deducible_cnfs(prompt), $sym176$EL_EXPRESSION_EQUAL_, symbol_function(IDENTITY))) {
                                rkf_salient_descriptor_datastructures._csetf_rkf_sd_prompt_deducible_cnfs(prompt, cons(item_var, rkf_salient_descriptor_datastructures.rkf_sd_prompt_deducible_cnfs(prompt)));
                            }
                        }
                    }
                }
            }
            final SubLObject prompt2 = rkf_sd_prompt_from_cnf(cnf, seed_term);
            final SubLObject justification = nreverse(cons(rule, rkf_sd_prompt_justification_from_sentence(gaf_lit, assertions_high.assertion_mt(gaf))));
            rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_justification(prompt2, justification);
            rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_tactic(prompt2, RKF_SD_PROMPTER_RULES_FOR_TERM);
            rkf_sd_prompter_add_prompt(prompter, prompt2);
            rkf_sd_prompt_compute_subprompts(prompt2);
            cdolist_list_var = cdolist_list_var.rest();
            cnf = cdolist_list_var.first();
        } 
        return prompter;
    }/**
     * Figure out which rules we could satisfy with targeted prompts, and update
     * PROMPTER appropriately.
     */


    /**
     *
     *
     * @return LISTP; (<GAF> <GAF-LIT> <RULE>) or NIL.
     */
    @LispMethod(comment = "@return LISTP; (<GAF> <GAF-LIT> <RULE>) or NIL.")
    public static final SubLObject rkf_sd_prompter_rule_table_pop_alt(SubLObject rule_table) {
        {
            SubLObject top = queues.queue_peek(rule_table);
            queues.dequeue(rule_table);
            return top;
        }
    }

    /**
     *
     *
     * @return LISTP; (<GAF> <GAF-LIT> <RULE>) or NIL.
     */
    @LispMethod(comment = "@return LISTP; (<GAF> <GAF-LIT> <RULE>) or NIL.")
    public static SubLObject rkf_sd_prompter_rule_table_pop(final SubLObject rule_table) {
        final SubLObject top = queues.queue_peek(rule_table);
        queues.dequeue(rule_table);
        return top;
    }

    /**
     *
     *
     * @return QUEUE-P; of (<GAF> <GAF-LIT> <RULE>) tuples
     */
    @LispMethod(comment = "@return QUEUE-P; of (<GAF> <GAF-LIT> <RULE>) tuples")
    public static final SubLObject rkf_sd_prompter_rule_table_alt(SubLObject seed_term, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject items = NIL;
                SubLObject done_isas = NIL;
                SubLObject done_genls = NIL;
                {
                    SubLObject _prev_bind_0 = $rkf_sd_seed_term$.currentBinding(thread);
                    try {
                        $rkf_sd_seed_term$.bind(seed_term, thread);
                        {
                            SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                            {
                                SubLObject _prev_bind_0_63 = mt_relevance_macros.$mt$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                    {
                                        SubLObject state = memoization_state.possibly_new_memoization_state();
                                        SubLObject local_state = state;
                                        {
                                            SubLObject _prev_bind_0_64 = memoization_state.$memoization_state$.currentBinding(thread);
                                            try {
                                                memoization_state.$memoization_state$.bind(local_state, thread);
                                                {
                                                    SubLObject original_memoization_process = NIL;
                                                    if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                                        original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                                        {
                                                            SubLObject current_proc = current_process();
                                                            if (NIL == original_memoization_process) {
                                                                memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                                            } else {
                                                                if (original_memoization_process != current_proc) {
                                                                    Errors.error($str_alt22$Invalid_attempt_to_reuse_memoizat);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    try {
                                                        {
                                                            SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                                                            {
                                                                SubLObject _prev_bind_0_65 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_66 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                                                SubLObject _prev_bind_2_67 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                                                try {
                                                                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
                                                                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                                                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                                                    {
                                                                        SubLObject pred_var = NIL;
                                                                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(seed_term, ONE_INTEGER, pred_var)) {
                                                                            {
                                                                                SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(seed_term, ONE_INTEGER, pred_var);
                                                                                SubLObject done_var = NIL;
                                                                                SubLObject token_var = NIL;
                                                                                while (NIL == done_var) {
                                                                                    {
                                                                                        SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                                                        SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                                                        if (NIL != valid) {
                                                                                            {
                                                                                                SubLObject final_index_iterator = NIL;
                                                                                                try {
                                                                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                                                                    {
                                                                                                        SubLObject done_var_68 = NIL;
                                                                                                        SubLObject token_var_69 = NIL;
                                                                                                        while (NIL == done_var_68) {
                                                                                                            {
                                                                                                                SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_69);
                                                                                                                SubLObject valid_70 = makeBoolean(token_var_69 != gaf);
                                                                                                                if (NIL != valid_70) {
                                                                                                                    if ((NIL != com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_gaf_okP(gaf)) && (NIL == rkf_argument_communicator.rkf_irrelevant_support_p(gaf))) {
                                                                                                                        {
                                                                                                                            SubLObject rule_sense = ($TRUE == assertions_high.assertion_truth(gaf)) ? ((SubLObject) ($NEG)) : $POS;
                                                                                                                            SubLObject pred = assertions_high.gaf_arg0(gaf);
                                                                                                                            SubLObject pcase_var = pred;
                                                                                                                            if (pcase_var.eql($$isa)) {
                                                                                                                                {
                                                                                                                                    SubLObject col = assertions_high.gaf_arg2(gaf);
                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                    {
                                                                                                                                        SubLObject new_items = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_get_isa_rules(seed_term, gaf, col, done_isas, mt);
                                                                                                                                        SubLObject new_done_isas = thread.secondMultipleValue();
                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                        done_isas = new_done_isas;
                                                                                                                                        items = union(items, new_items, symbol_function($sym181$RKF_SD_RULE_TUPLE__), UNPROVIDED);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                if (pcase_var.eql($$genls)) {
                                                                                                                                    {
                                                                                                                                        SubLObject col = assertions_high.gaf_arg2(gaf);
                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                        {
                                                                                                                                            SubLObject new_items = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_get_genls_rules(seed_term, gaf, col, done_genls, mt);
                                                                                                                                            SubLObject new_done_genls = thread.secondMultipleValue();
                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                            done_genls = new_done_genls;
                                                                                                                                            items = union(items, new_items, symbol_function($sym181$RKF_SD_RULE_TUPLE__), UNPROVIDED);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    {
                                                                                                                                        SubLObject new_items = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_get_other_rules(pred, rule_sense, gaf, mt);
                                                                                                                                        items = union(items, new_items, symbol_function($sym181$RKF_SD_RULE_TUPLE__), UNPROVIDED);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                done_var_68 = makeBoolean(NIL == valid_70);
                                                                                                            }
                                                                                                        } 
                                                                                                    }
                                                                                                } finally {
                                                                                                    {
                                                                                                        SubLObject _prev_bind_0_71 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                        try {
                                                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                            if (NIL != final_index_iterator) {
                                                                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                                            }
                                                                                                        } finally {
                                                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_71, thread);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        done_var = makeBoolean(NIL == valid);
                                                                                    }
                                                                                } 
                                                                            }
                                                                        }
                                                                    }
                                                                } finally {
                                                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2_67, thread);
                                                                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_66, thread);
                                                                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_65, thread);
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_72 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                                    memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_72, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            } finally {
                                                memoization_state.$memoization_state$.rebind(_prev_bind_0_64, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_63, thread);
                                }
                            }
                            items = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_score_rule_tuples(items);
                            items = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_remove_low_scoring_tuples(items);
                            items = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_sort_rule_tuples(items);
                        }
                    } finally {
                        $rkf_sd_seed_term$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject table = queues.create_queue();
                    SubLObject cdolist_list_var = items;
                    SubLObject item = NIL;
                    for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                        queues.enqueue(item, table);
                    }
                    return table;
                }
            }
        }
    }

    /**
     *
     *
     * @return QUEUE-P; of (<GAF> <GAF-LIT> <RULE>) tuples
     */
    @LispMethod(comment = "@return QUEUE-P; of (<GAF> <GAF-LIT> <RULE>) tuples")
    public static SubLObject rkf_sd_prompter_rule_table(final SubLObject seed_term, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject items = NIL;
        SubLObject done_isas = NIL;
        SubLObject done_genls = NIL;
        final SubLObject _prev_bind_0 = $rkf_sd_seed_term$.currentBinding(thread);
        try {
            $rkf_sd_seed_term$.bind(seed_term, thread);
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0_$57 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject local_state;
                final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
                final SubLObject _prev_bind_0_$58 = memoization_state.$memoization_state$.currentBinding(thread);
                try {
                    memoization_state.$memoization_state$.bind(local_state, thread);
                    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                    try {
                        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                        final SubLObject _prev_bind_0_$59 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$60 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$61 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
                            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                            final SubLObject pred_var = NIL;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(seed_term, ONE_INTEGER, pred_var)) {
                                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(seed_term, ONE_INTEGER, pred_var);
                                SubLObject done_var = NIL;
                                final SubLObject token_var = NIL;
                                while (NIL == done_var) {
                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                    if (NIL != valid) {
                                        SubLObject final_index_iterator = NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                            SubLObject done_var_$62 = NIL;
                                            final SubLObject token_var_$63 = NIL;
                                            while (NIL == done_var_$62) {
                                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$63);
                                                final SubLObject valid_$64 = makeBoolean(!token_var_$63.eql(gaf));
                                                if (((NIL != valid_$64) && (NIL != rkf_sd_gaf_okP(gaf))) && (NIL == rkf_argument_communicator.rkf_irrelevant_support_p(gaf))) {
                                                    final SubLObject rule_sense = ($TRUE == assertions_high.assertion_truth(gaf)) ? $NEG : $POS;
                                                    final SubLObject pcase_var;
                                                    final SubLObject pred = pcase_var = assertions_high.gaf_arg0(gaf);
                                                    if (pcase_var.eql($$isa)) {
                                                        final SubLObject col = assertions_high.gaf_arg2(gaf);
                                                        thread.resetMultipleValues();
                                                        final SubLObject new_items = rkf_sd_get_isa_rules(seed_term, gaf, col, done_isas, mt);
                                                        final SubLObject new_done_isas = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        done_isas = new_done_isas;
                                                        items = union(items, new_items, symbol_function($sym180$RKF_SD_RULE_TUPLE__), UNPROVIDED);
                                                    } else
                                                        if (pcase_var.eql($$genls)) {
                                                            final SubLObject col = assertions_high.gaf_arg2(gaf);
                                                            thread.resetMultipleValues();
                                                            final SubLObject new_items = rkf_sd_get_genls_rules(seed_term, gaf, col, done_genls, mt);
                                                            final SubLObject new_done_genls = thread.secondMultipleValue();
                                                            thread.resetMultipleValues();
                                                            done_genls = new_done_genls;
                                                            items = union(items, new_items, symbol_function($sym180$RKF_SD_RULE_TUPLE__), UNPROVIDED);
                                                        } else {
                                                            final SubLObject new_items2 = rkf_sd_get_other_rules(pred, rule_sense, gaf, mt);
                                                            items = union(items, new_items2, symbol_function($sym180$RKF_SD_RULE_TUPLE__), UNPROVIDED);
                                                        }

                                                }
                                                done_var_$62 = makeBoolean(NIL == valid_$64);
                                            } 
                                        } finally {
                                            final SubLObject _prev_bind_0_$60 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values = getValuesAsVector();
                                                if (NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                restoreValuesFromVector(_values);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$60, thread);
                                            }
                                        }
                                    }
                                    done_var = makeBoolean(NIL == valid);
                                } 
                            }
                        } finally {
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2_$61, thread);
                            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$60, thread);
                            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$59, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$61 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$61, thread);
                        }
                    }
                } finally {
                    memoization_state.$memoization_state$.rebind(_prev_bind_0_$58, thread);
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$57, thread);
            }
            items = rkf_sd_score_rule_tuples(items);
            items = rkf_sd_remove_low_scoring_tuples(items);
            items = rkf_sd_sort_rule_tuples(items);
        } finally {
            $rkf_sd_seed_term$.rebind(_prev_bind_0, thread);
        }
        final SubLObject table = queues.create_queue(UNPROVIDED);
        SubLObject cdolist_list_var = items;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            queues.enqueue(item, table);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return table;
    }

    public static final SubLObject rkf_sd_sort_rule_tuples_alt(SubLObject rule_tuples) {
        return Sort.sort(rule_tuples, $sym182$RKF_SD_PREFER_RULE_TUPLE_, UNPROVIDED);
    }

    public static SubLObject rkf_sd_sort_rule_tuples(final SubLObject rule_tuples) {
        return Sort.sort(rule_tuples, $sym181$RKF_SD_PREFER_RULE_TUPLE_, UNPROVIDED);
    }

    public static final SubLObject rkf_sd_remove_low_scoring_tuples_alt(SubLObject rule_tuples) {
        return remove_if(RKF_SD_LOW_SCORING_TUPLE_P, rule_tuples, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rkf_sd_remove_low_scoring_tuples(final SubLObject rule_tuples) {
        return remove_if(RKF_SD_LOW_SCORING_TUPLE_P, rule_tuples, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return BOOLEANP; Is RULE-TUPLE so bad we don't even want to use it?
     */
    @LispMethod(comment = "@return BOOLEANP; Is RULE-TUPLE so bad we don\'t even want to use it?")
    public static final SubLObject rkf_sd_low_scoring_tuple_p_alt(SubLObject rule_tuple) {
        {
            SubLObject score = fifth(rule_tuple);
            SubLObject badP = NIL;
            if (NIL == rkf_sd_rule_info_score_seed_term_in_pos_litsP(score)) {
                badP = T;
            }
            return badP;
        }
    }

    /**
     *
     *
     * @return BOOLEANP; Is RULE-TUPLE so bad we don't even want to use it?
     */
    @LispMethod(comment = "@return BOOLEANP; Is RULE-TUPLE so bad we don\'t even want to use it?")
    public static SubLObject rkf_sd_low_scoring_tuple_p(final SubLObject rule_tuple) {
        final SubLObject score = fifth(rule_tuple);
        SubLObject badP = NIL;
        if (NIL == rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_seed_term_in_pos_litsP(score)) {
            badP = T;
        }
        return badP;
    }

    public static final SubLObject rkf_sd_score_rule_tuples_alt(SubLObject rule_tuples) {
        return Mapping.mapcar(RKF_SD_SCORE_RULE_TUPLE, rule_tuples);
    }

    public static SubLObject rkf_sd_score_rule_tuples(final SubLObject rule_tuples) {
        return Mapping.mapcar(RKF_SD_SCORE_RULE_TUPLE, rule_tuples);
    }

    public static final SubLObject rkf_sd_get_other_rules_alt(SubLObject pred, SubLObject sense, SubLObject gaf, SubLObject mt) {
        {
            SubLObject new_items = NIL;
            SubLObject cutoff = TEN_INTEGER;
            SubLObject strictP = numG(kb_indexing.num_predicate_rule_index(pred, $NEG, UNPROVIDED, UNPROVIDED), cutoff);
            if (NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(pred, sense, NIL)) {
                {
                    SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(pred, sense, NIL);
                    SubLObject done_var = NIL;
                    SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        {
                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                            if (NIL != valid) {
                                {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                        {
                                            SubLObject done_var_73 = NIL;
                                            SubLObject token_var_74 = NIL;
                                            while (NIL == done_var_73) {
                                                {
                                                    SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_74);
                                                    SubLObject valid_75 = makeBoolean(token_var_74 != rule);
                                                    if (NIL != valid_75) {
                                                        {
                                                            SubLObject v_bindings = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_gaf_rule_bindings(gaf, rule, sense, strictP);
                                                            if (!((NIL == v_bindings) || (NIL != rkf_salient_descriptor.rkf_bad_sd_ruleP(rule, mt)))) {
                                                                {
                                                                    SubLObject item_var = list(gaf, assertions_high.gaf_formula(gaf), rule, v_bindings);
                                                                    if (NIL == member(item_var, new_items, $sym181$RKF_SD_RULE_TUPLE__, symbol_function(IDENTITY))) {
                                                                        new_items = cons(item_var, new_items);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    done_var_73 = makeBoolean(NIL == valid_75);
                                                }
                                            } 
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                            try {
                                                bind($is_thread_performing_cleanupP$, T);
                                                if (NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                            } finally {
                                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                            }
                                        }
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        }
                    } 
                }
            }
            return new_items;
        }
    }

    public static SubLObject rkf_sd_get_other_rules(final SubLObject pred, final SubLObject sense, final SubLObject gaf, final SubLObject mt) {
        SubLObject new_items = NIL;
        final SubLObject cutoff = TEN_INTEGER;
        final SubLObject strictP = numG(kb_indexing.num_predicate_rule_index(pred, $NEG, UNPROVIDED, UNPROVIDED), cutoff);
        if (NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(pred, sense, NIL)) {
            final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(pred, sense, NIL);
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                        SubLObject done_var_$67 = NIL;
                        final SubLObject token_var_$68 = NIL;
                        while (NIL == done_var_$67) {
                            final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$68);
                            final SubLObject valid_$69 = makeBoolean(!token_var_$68.eql(rule));
                            if (NIL != valid_$69) {
                                final SubLObject v_bindings = rkf_sd_gaf_rule_bindings(gaf, rule, sense, strictP);
                                if ((NIL != v_bindings) && (NIL == rkf_salient_descriptor.rkf_bad_sd_ruleP(rule, mt))) {
                                    final SubLObject item_var = list(gaf, assertions_high.gaf_formula(gaf), rule, v_bindings);
                                    if (NIL == member(item_var, new_items, $sym180$RKF_SD_RULE_TUPLE__, symbol_function(IDENTITY))) {
                                        new_items = cons(item_var, new_items);
                                    }
                                }
                            }
                            done_var_$67 = makeBoolean(NIL == valid_$69);
                        } 
                    } finally {
                        final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = makeBoolean(NIL == valid);
            } 
        }
        return new_items;
    }

    public static final SubLObject rkf_sd_get_isa_rules_alt(SubLObject seed_term, SubLObject gaf, SubLObject col, SubLObject done_genls, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject rule_sense = ($TRUE == assertions_high.assertion_truth(gaf)) ? ((SubLObject) ($NEG)) : $POS;
                SubLObject new_items = NIL;
                SubLObject state = memoization_state.possibly_new_memoization_state();
                SubLObject local_state = state;
                {
                    SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        {
                            SubLObject original_memoization_process = NIL;
                            if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                {
                                    SubLObject current_proc = current_process();
                                    if (NIL == original_memoization_process) {
                                        memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                    } else {
                                        if (original_memoization_process != current_proc) {
                                            Errors.error($str_alt22$Invalid_attempt_to_reuse_memoizat);
                                        }
                                    }
                                }
                            }
                            try {
                                {
                                    SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                                    {
                                        SubLObject _prev_bind_0_76 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                        try {
                                            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
                                            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                            {
                                                SubLObject node_var = col;
                                                SubLObject deck_type = (false) ? ((SubLObject) ($QUEUE)) : $STACK;
                                                SubLObject recur_deck = deck.create_deck(deck_type);
                                                {
                                                    SubLObject _prev_bind_0_77 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                                    try {
                                                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                        {
                                                            SubLObject tv_var = NIL;
                                                            {
                                                                SubLObject _prev_bind_0_78 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_79 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                                try {
                                                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                                    if (NIL != tv_var) {
                                                                        if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                                            if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                                {
                                                                                    SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                                    if (pcase_var.eql($ERROR)) {
                                                                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt111$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                    } else {
                                                                                        if (pcase_var.eql($CERROR)) {
                                                                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt111$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                        } else {
                                                                                            if (pcase_var.eql($WARN)) {
                                                                                                Errors.warn($str_alt111$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                            } else {
                                                                                                Errors.warn($str_alt116$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                                                Errors.cerror($$$continue_anyway, $str_alt111$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    {
                                                                        SubLObject _prev_bind_0_80 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                                        SubLObject _prev_bind_1_81 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                                        SubLObject _prev_bind_2_82 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                                        SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                        SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                                            if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(col, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                                                {
                                                                                    SubLObject _prev_bind_0_83 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_1_84 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_2_85 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                                                        while (NIL != node_var) {
                                                                                            {
                                                                                                SubLObject genl = node_var;
                                                                                                if (NIL != member(genl, done_genls, UNPROVIDED, UNPROVIDED)) {
                                                                                                } else {
                                                                                                    if (NIL != com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_term_too_generalP(genl)) {
                                                                                                        done_genls = cons(genl, done_genls);
                                                                                                    } else {
                                                                                                        {
                                                                                                            SubLObject gaf_lit = make_binary_formula($$isa, seed_term, genl);
                                                                                                            SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                                                                                                            {
                                                                                                                SubLObject _prev_bind_0_86 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                                                                                SubLObject _prev_bind_1_87 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                                                                                SubLObject _prev_bind_2_88 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                                                                                                try {
                                                                                                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                                                                                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                                                                                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                                                                                                    if (NIL != kb_mapping_macros.do_isa_rule_index_key_validator(genl, rule_sense, NIL)) {
                                                                                                                        {
                                                                                                                            SubLObject iterator_var = kb_mapping_macros.new_isa_rule_final_index_spec_iterator(genl, rule_sense, NIL);
                                                                                                                            SubLObject done_var = NIL;
                                                                                                                            SubLObject token_var = NIL;
                                                                                                                            while (NIL == done_var) {
                                                                                                                                {
                                                                                                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                                                                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                                                                                                    if (NIL != valid) {
                                                                                                                                        {
                                                                                                                                            SubLObject final_index_iterator = NIL;
                                                                                                                                            try {
                                                                                                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                                                                                                                                {
                                                                                                                                                    SubLObject done_var_89 = NIL;
                                                                                                                                                    SubLObject token_var_90 = NIL;
                                                                                                                                                    while (NIL == done_var_89) {
                                                                                                                                                        {
                                                                                                                                                            SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_90);
                                                                                                                                                            SubLObject valid_91 = makeBoolean(token_var_90 != rule);
                                                                                                                                                            if (NIL != valid_91) {
                                                                                                                                                                {
                                                                                                                                                                    SubLObject v_bindings = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_gaf_lit_rule_bindings(gaf_lit, rule, rule_sense, UNPROVIDED);
                                                                                                                                                                    if (!((NIL == v_bindings) || (NIL != rkf_salient_descriptor.rkf_bad_sd_ruleP(rule, mt)))) {
                                                                                                                                                                        {
                                                                                                                                                                            SubLObject item_var = list(gaf, gaf_lit, rule, v_bindings);
                                                                                                                                                                            if (NIL == member(item_var, new_items, $sym181$RKF_SD_RULE_TUPLE__, symbol_function(IDENTITY))) {
                                                                                                                                                                                new_items = cons(item_var, new_items);
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            done_var_89 = makeBoolean(NIL == valid_91);
                                                                                                                                                        }
                                                                                                                                                    } 
                                                                                                                                                }
                                                                                                                                            } finally {
                                                                                                                                                {
                                                                                                                                                    SubLObject _prev_bind_0_92 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                                                                    try {
                                                                                                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                                                        if (NIL != final_index_iterator) {
                                                                                                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                                                                                        }
                                                                                                                                                    } finally {
                                                                                                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_92, thread);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    done_var = makeBoolean(NIL == valid);
                                                                                                                                }
                                                                                                                            } 
                                                                                                                        }
                                                                                                                    }
                                                                                                                } finally {
                                                                                                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_88, thread);
                                                                                                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_87, thread);
                                                                                                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_86, thread);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        done_genls = cons(genl, done_genls);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            {
                                                                                                SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                                                                                SubLObject cdolist_list_var = accessible_modules;
                                                                                                SubLObject module_var = NIL;
                                                                                                for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                                    {
                                                                                                        SubLObject _prev_bind_0_93 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                        SubLObject _prev_bind_1_94 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                        try {
                                                                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                            {
                                                                                                                SubLObject node = function_terms.naut_to_nart(node_var);
                                                                                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                                    {
                                                                                                                        SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                        if (NIL != d_link) {
                                                                                                                            {
                                                                                                                                SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                                if (NIL != mt_links) {
                                                                                                                                    {
                                                                                                                                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                            {
                                                                                                                                                SubLObject mt_95 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                                SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt_95)) {
                                                                                                                                                    {
                                                                                                                                                        SubLObject _prev_bind_0_96 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                        try {
                                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_95, thread);
                                                                                                                                                            {
                                                                                                                                                                SubLObject iteration_state_97 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_97)) {
                                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_97);
                                                                                                                                                                        SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                            {
                                                                                                                                                                                SubLObject _prev_bind_0_98 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                                try {
                                                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                                    {
                                                                                                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                        SubLObject cdolist_list_var_99 = new_list;
                                                                                                                                                                                        SubLObject node_vars_link_node = NIL;
                                                                                                                                                                                        for (node_vars_link_node = cdolist_list_var_99.first(); NIL != cdolist_list_var_99; cdolist_list_var_99 = cdolist_list_var_99.rest() , node_vars_link_node = cdolist_list_var_99.first()) {
                                                                                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                } finally {
                                                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_98, thread);
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        iteration_state_97 = dictionary_contents.do_dictionary_contents_next(iteration_state_97);
                                                                                                                                                                    }
                                                                                                                                                                } 
                                                                                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_97);
                                                                                                                                                            }
                                                                                                                                                        } finally {
                                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_96, thread);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                                            }
                                                                                                                                        } 
                                                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt119$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                        {
                                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                            SubLObject cdolist_list_var_100 = new_list;
                                                                                                                            SubLObject generating_fn = NIL;
                                                                                                                            for (generating_fn = cdolist_list_var_100.first(); NIL != cdolist_list_var_100; cdolist_list_var_100 = cdolist_list_var_100.rest() , generating_fn = cdolist_list_var_100.first()) {
                                                                                                                                {
                                                                                                                                    SubLObject _prev_bind_0_101 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                                    try {
                                                                                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                        {
                                                                                                                                            SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                            SubLObject new_list_102 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                            SubLObject cdolist_list_var_103 = new_list_102;
                                                                                                                                            SubLObject node_vars_link_node = NIL;
                                                                                                                                            for (node_vars_link_node = cdolist_list_var_103.first(); NIL != cdolist_list_var_103; cdolist_list_var_103 = cdolist_list_var_103.rest() , node_vars_link_node = cdolist_list_var_103.first()) {
                                                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    } finally {
                                                                                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_101, thread);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        } finally {
                                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_94, thread);
                                                                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_93, thread);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            node_var = deck.deck_pop(recur_deck);
                                                                                        } 
                                                                                    } finally {
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_85, thread);
                                                                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_84, thread);
                                                                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_83, thread);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt120$Node__a_does_not_pass_sbhl_type_t, col, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                            }
                                                                        } finally {
                                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_82, thread);
                                                                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_81, thread);
                                                                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_80, thread);
                                                                        }
                                                                    }
                                                                } finally {
                                                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_79, thread);
                                                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_78, thread);
                                                                }
                                                            }
                                                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                        }
                                                    } finally {
                                                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_77, thread);
                                                    }
                                                }
                                            }
                                        } finally {
                                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                                            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1, thread);
                                            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_76, thread);
                                        }
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_104 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_104, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(new_items, done_genls);
            }
        }
    }

    public static SubLObject rkf_sd_get_isa_rules(final SubLObject seed_term, final SubLObject gaf, final SubLObject col, SubLObject done_genls, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rule_sense = ($TRUE == assertions_high.assertion_truth(gaf)) ? $NEG : $POS;
        SubLObject new_items = NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$70 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                    SubLObject node_var = col;
                    final SubLObject deck_type = $STACK;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    final SubLObject _prev_bind_0_$71 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject tv_var = NIL;
                            final SubLObject _prev_bind_0_$72 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$73 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql($ERROR)) {
                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str110$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($CERROR)) {
                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str110$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($WARN)) {
                                                Errors.warn($str110$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            } else {
                                                Errors.warn($str115$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                Errors.cerror($$$continue_anyway, $str110$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            }


                                }
                                final SubLObject _prev_bind_0_$73 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$74 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$76 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                    if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(col, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                        final SubLObject _prev_bind_0_$74 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$75 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$77 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                            while (NIL != node_var) {
                                                final SubLObject genl = node_var;
                                                if (NIL == member(genl, done_genls, UNPROVIDED, UNPROVIDED)) {
                                                    if (NIL != rkf_sd_term_too_generalP(genl)) {
                                                        done_genls = cons(genl, done_genls);
                                                    } else {
                                                        final SubLObject gaf_lit = make_binary_formula($$isa, seed_term, genl);
                                                        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                                                        final SubLObject _prev_bind_0_$75 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$76 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                        final SubLObject _prev_bind_2_$78 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                                        try {
                                                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                                            if (NIL != kb_mapping_macros.do_isa_rule_index_key_validator(genl, rule_sense, NIL)) {
                                                                final SubLObject iterator_var = kb_mapping_macros.new_isa_rule_final_index_spec_iterator(genl, rule_sense, NIL);
                                                                SubLObject done_var = NIL;
                                                                final SubLObject token_var = NIL;
                                                                while (NIL == done_var) {
                                                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                                                    if (NIL != valid) {
                                                                        SubLObject final_index_iterator = NIL;
                                                                        try {
                                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                                                            SubLObject done_var_$83 = NIL;
                                                                            final SubLObject token_var_$84 = NIL;
                                                                            while (NIL == done_var_$83) {
                                                                                final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$84);
                                                                                final SubLObject valid_$85 = makeBoolean(!token_var_$84.eql(rule));
                                                                                if (NIL != valid_$85) {
                                                                                    final SubLObject v_bindings = rkf_sd_gaf_lit_rule_bindings(gaf_lit, rule, rule_sense, UNPROVIDED);
                                                                                    if ((NIL != v_bindings) && (NIL == rkf_salient_descriptor.rkf_bad_sd_ruleP(rule, mt))) {
                                                                                        final SubLObject item_var = list(gaf, gaf_lit, rule, v_bindings);
                                                                                        if (NIL == member(item_var, new_items, $sym180$RKF_SD_RULE_TUPLE__, symbol_function(IDENTITY))) {
                                                                                            new_items = cons(item_var, new_items);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                done_var_$83 = makeBoolean(NIL == valid_$85);
                                                                            } 
                                                                        } finally {
                                                                            final SubLObject _prev_bind_0_$76 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                final SubLObject _values = getValuesAsVector();
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                                restoreValuesFromVector(_values);
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$76, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    done_var = makeBoolean(NIL == valid);
                                                                } 
                                                            }
                                                        } finally {
                                                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$78, thread);
                                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$76, thread);
                                                            mt_relevance_macros.$mt$.rebind(_prev_bind_0_$75, thread);
                                                        }
                                                        done_genls = cons(genl, done_genls);
                                                    }
                                                }
                                                SubLObject cdolist_list_var;
                                                final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                                SubLObject module_var = NIL;
                                                module_var = cdolist_list_var.first();
                                                while (NIL != cdolist_list_var) {
                                                    final SubLObject _prev_bind_0_$77 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$77 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        final SubLObject node = function_terms.naut_to_nart(node_var);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link) {
                                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links) {
                                                                    SubLObject iteration_state;
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt_$89 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt_$89)) {
                                                                            final SubLObject _prev_bind_0_$78 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt_$89, thread);
                                                                                SubLObject iteration_state_$91;
                                                                                for (iteration_state_$91 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$91); iteration_state_$91 = dictionary_contents.do_dictionary_contents_next(iteration_state_$91)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$91);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        final SubLObject _prev_bind_0_$79 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            final SubLObject sol = link_nodes;
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state_$93;
                                                                                                SubLObject node_vars_link_node;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state_$93 = NIL, state_$93 = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state_$93); state_$93 = set_contents.do_set_contents_update_state(state_$93)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object, state_$93);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state_$93, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    SubLObject csome_list_var = sol;
                                                                                                    SubLObject node_vars_link_node2 = NIL;
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                    while (NIL != csome_list_var) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error($str118$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$79, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$91);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$78, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str119$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$94;
                                                                final SubLObject new_list = cdolist_list_var_$94 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                SubLObject generating_fn = NIL;
                                                                generating_fn = cdolist_list_var_$94.first();
                                                                while (NIL != cdolist_list_var_$94) {
                                                                    final SubLObject _prev_bind_0_$80 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        final SubLObject sol2;
                                                                        final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                        if (NIL != set.set_p(sol2)) {
                                                                            final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                            SubLObject basis_object2;
                                                                            SubLObject state_$94;
                                                                            SubLObject node_vars_link_node3;
                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state_$94 = NIL, state_$94 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state_$94); state_$94 = set_contents.do_set_contents_update_state(state_$94)) {
                                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state_$94);
                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state_$94, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol2.isList()) {
                                                                                SubLObject csome_list_var2 = sol2;
                                                                                SubLObject node_vars_link_node4 = NIL;
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                                while (NIL != csome_list_var2) {
                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                    }
                                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                                } 
                                                                            } else {
                                                                                Errors.error($str118$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$80, thread);
                                                                    }
                                                                    cdolist_list_var_$94 = cdolist_list_var_$94.rest();
                                                                    generating_fn = cdolist_list_var_$94.first();
                                                                } 
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$77, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$77, thread);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    module_var = cdolist_list_var.first();
                                                } 
                                                node_var = deck.deck_pop(recur_deck);
                                            } 
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$77, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$75, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$74, thread);
                                        }
                                    } else {
                                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str120$Node__a_does_not_pass_sbhl_type_t, col, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                } finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$76, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$74, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$73, thread);
                                }
                            } finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$73, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$72, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$81 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$81, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$71, thread);
                    }
                } finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$70, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$82 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values3 = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values3);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$82, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return values(new_items, done_genls);
    }

    public static final SubLObject rkf_sd_get_genls_rules_alt(SubLObject seed_term, SubLObject gaf, SubLObject col, SubLObject done_genls, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject rule_sense = ($TRUE == assertions_high.assertion_truth(gaf)) ? ((SubLObject) ($NEG)) : $POS;
                SubLObject new_items = NIL;
                SubLObject state = memoization_state.possibly_new_memoization_state();
                SubLObject local_state = state;
                {
                    SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        {
                            SubLObject original_memoization_process = NIL;
                            if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                {
                                    SubLObject current_proc = current_process();
                                    if (NIL == original_memoization_process) {
                                        memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                    } else {
                                        if (original_memoization_process != current_proc) {
                                            Errors.error($str_alt22$Invalid_attempt_to_reuse_memoizat);
                                        }
                                    }
                                }
                            }
                            try {
                                {
                                    SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                                    {
                                        SubLObject _prev_bind_0_105 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                        try {
                                            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
                                            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                            {
                                                SubLObject node_var = col;
                                                SubLObject deck_type = (false) ? ((SubLObject) ($QUEUE)) : $STACK;
                                                SubLObject recur_deck = deck.create_deck(deck_type);
                                                {
                                                    SubLObject _prev_bind_0_106 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                                    try {
                                                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                        {
                                                            SubLObject tv_var = NIL;
                                                            {
                                                                SubLObject _prev_bind_0_107 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_108 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                                try {
                                                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                                    if (NIL != tv_var) {
                                                                        if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                                            if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                                {
                                                                                    SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                                    if (pcase_var.eql($ERROR)) {
                                                                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt111$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                    } else {
                                                                                        if (pcase_var.eql($CERROR)) {
                                                                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt111$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                        } else {
                                                                                            if (pcase_var.eql($WARN)) {
                                                                                                Errors.warn($str_alt111$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                            } else {
                                                                                                Errors.warn($str_alt116$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                                                Errors.cerror($$$continue_anyway, $str_alt111$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    {
                                                                        SubLObject _prev_bind_0_109 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                                        SubLObject _prev_bind_1_110 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                                        SubLObject _prev_bind_2_111 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                                        SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                        SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                                            if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(col, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                                                {
                                                                                    SubLObject _prev_bind_0_112 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_1_113 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_2_114 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                                                        while (NIL != node_var) {
                                                                                            {
                                                                                                SubLObject genl = node_var;
                                                                                                if (NIL != member(genl, done_genls, UNPROVIDED, UNPROVIDED)) {
                                                                                                } else {
                                                                                                    if (NIL != com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_term_too_generalP(genl)) {
                                                                                                        done_genls = cons(genl, done_genls);
                                                                                                    } else {
                                                                                                        {
                                                                                                            SubLObject gaf_lit = make_binary_formula($$genls, seed_term, genl);
                                                                                                            if (NIL != kb_mapping_macros.do_genls_rule_index_key_validator(genl, rule_sense, NIL)) {
                                                                                                                {
                                                                                                                    SubLObject iterator_var = kb_mapping_macros.new_genls_rule_final_index_spec_iterator(genl, rule_sense, NIL);
                                                                                                                    SubLObject done_var = NIL;
                                                                                                                    SubLObject token_var = NIL;
                                                                                                                    while (NIL == done_var) {
                                                                                                                        {
                                                                                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                                                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                                                                                            if (NIL != valid) {
                                                                                                                                {
                                                                                                                                    SubLObject final_index_iterator = NIL;
                                                                                                                                    try {
                                                                                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                                                                                                                        {
                                                                                                                                            SubLObject done_var_115 = NIL;
                                                                                                                                            SubLObject token_var_116 = NIL;
                                                                                                                                            while (NIL == done_var_115) {
                                                                                                                                                {
                                                                                                                                                    SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_116);
                                                                                                                                                    SubLObject valid_117 = makeBoolean(token_var_116 != rule);
                                                                                                                                                    if (NIL != valid_117) {
                                                                                                                                                        {
                                                                                                                                                            SubLObject v_bindings = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_gaf_lit_rule_bindings(gaf_lit, rule, rule_sense, UNPROVIDED);
                                                                                                                                                            if (!((NIL == v_bindings) || (NIL != rkf_salient_descriptor.rkf_bad_sd_ruleP(rule, mt)))) {
                                                                                                                                                                {
                                                                                                                                                                    SubLObject item_var = list(gaf, gaf_lit, rule, v_bindings);
                                                                                                                                                                    if (NIL == member(item_var, new_items, $sym181$RKF_SD_RULE_TUPLE__, symbol_function(IDENTITY))) {
                                                                                                                                                                        new_items = cons(item_var, new_items);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    done_var_115 = makeBoolean(NIL == valid_117);
                                                                                                                                                }
                                                                                                                                            } 
                                                                                                                                        }
                                                                                                                                    } finally {
                                                                                                                                        {
                                                                                                                                            SubLObject _prev_bind_0_118 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                                                            try {
                                                                                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                                                if (NIL != final_index_iterator) {
                                                                                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                                                                                }
                                                                                                                                            } finally {
                                                                                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_118, thread);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            done_var = makeBoolean(NIL == valid);
                                                                                                                        }
                                                                                                                    } 
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        done_genls = cons(genl, done_genls);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            {
                                                                                                SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                                                                                SubLObject cdolist_list_var = accessible_modules;
                                                                                                SubLObject module_var = NIL;
                                                                                                for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                                    {
                                                                                                        SubLObject _prev_bind_0_119 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                        SubLObject _prev_bind_1_120 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                        try {
                                                                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                            {
                                                                                                                SubLObject node = function_terms.naut_to_nart(node_var);
                                                                                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                                    {
                                                                                                                        SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                        if (NIL != d_link) {
                                                                                                                            {
                                                                                                                                SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                                if (NIL != mt_links) {
                                                                                                                                    {
                                                                                                                                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                            {
                                                                                                                                                SubLObject mt_121 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                                SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt_121)) {
                                                                                                                                                    {
                                                                                                                                                        SubLObject _prev_bind_0_122 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                        try {
                                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_121, thread);
                                                                                                                                                            {
                                                                                                                                                                SubLObject iteration_state_123 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_123)) {
                                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_123);
                                                                                                                                                                        SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                            {
                                                                                                                                                                                SubLObject _prev_bind_0_124 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                                try {
                                                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                                    {
                                                                                                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                        SubLObject cdolist_list_var_125 = new_list;
                                                                                                                                                                                        SubLObject node_vars_link_node = NIL;
                                                                                                                                                                                        for (node_vars_link_node = cdolist_list_var_125.first(); NIL != cdolist_list_var_125; cdolist_list_var_125 = cdolist_list_var_125.rest() , node_vars_link_node = cdolist_list_var_125.first()) {
                                                                                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                } finally {
                                                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_124, thread);
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        iteration_state_123 = dictionary_contents.do_dictionary_contents_next(iteration_state_123);
                                                                                                                                                                    }
                                                                                                                                                                } 
                                                                                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_123);
                                                                                                                                                            }
                                                                                                                                                        } finally {
                                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_122, thread);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                                            }
                                                                                                                                        } 
                                                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt119$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                        {
                                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                            SubLObject cdolist_list_var_126 = new_list;
                                                                                                                            SubLObject generating_fn = NIL;
                                                                                                                            for (generating_fn = cdolist_list_var_126.first(); NIL != cdolist_list_var_126; cdolist_list_var_126 = cdolist_list_var_126.rest() , generating_fn = cdolist_list_var_126.first()) {
                                                                                                                                {
                                                                                                                                    SubLObject _prev_bind_0_127 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                                    try {
                                                                                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                        {
                                                                                                                                            SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                            SubLObject new_list_128 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                            SubLObject cdolist_list_var_129 = new_list_128;
                                                                                                                                            SubLObject node_vars_link_node = NIL;
                                                                                                                                            for (node_vars_link_node = cdolist_list_var_129.first(); NIL != cdolist_list_var_129; cdolist_list_var_129 = cdolist_list_var_129.rest() , node_vars_link_node = cdolist_list_var_129.first()) {
                                                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    } finally {
                                                                                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_127, thread);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        } finally {
                                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_120, thread);
                                                                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_119, thread);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            node_var = deck.deck_pop(recur_deck);
                                                                                        } 
                                                                                    } finally {
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_114, thread);
                                                                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_113, thread);
                                                                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_112, thread);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt120$Node__a_does_not_pass_sbhl_type_t, col, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                            }
                                                                        } finally {
                                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_111, thread);
                                                                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_110, thread);
                                                                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_109, thread);
                                                                        }
                                                                    }
                                                                } finally {
                                                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_108, thread);
                                                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_107, thread);
                                                                }
                                                            }
                                                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                        }
                                                    } finally {
                                                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_106, thread);
                                                    }
                                                }
                                            }
                                        } finally {
                                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                                            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1, thread);
                                            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_105, thread);
                                        }
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_130 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_130, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(new_items, done_genls);
            }
        }
    }

    public static SubLObject rkf_sd_get_genls_rules(final SubLObject seed_term, final SubLObject gaf, final SubLObject col, SubLObject done_genls, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rule_sense = ($TRUE == assertions_high.assertion_truth(gaf)) ? $NEG : $POS;
        SubLObject new_items = NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$99 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                    SubLObject node_var = col;
                    final SubLObject deck_type = $STACK;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    final SubLObject _prev_bind_0_$100 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject tv_var = NIL;
                            final SubLObject _prev_bind_0_$101 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$102 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql($ERROR)) {
                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str110$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($CERROR)) {
                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str110$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($WARN)) {
                                                Errors.warn($str110$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            } else {
                                                Errors.warn($str115$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                Errors.cerror($$$continue_anyway, $str110$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            }


                                }
                                final SubLObject _prev_bind_0_$102 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$103 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$105 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                    if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(col, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                        final SubLObject _prev_bind_0_$103 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$104 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$106 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                            while (NIL != node_var) {
                                                final SubLObject genl = node_var;
                                                if (NIL == member(genl, done_genls, UNPROVIDED, UNPROVIDED)) {
                                                    if (NIL != rkf_sd_term_too_generalP(genl)) {
                                                        done_genls = cons(genl, done_genls);
                                                    } else {
                                                        final SubLObject gaf_lit = make_binary_formula($$genls, seed_term, genl);
                                                        if (NIL != kb_mapping_macros.do_genls_rule_index_key_validator(genl, rule_sense, NIL)) {
                                                            final SubLObject iterator_var = kb_mapping_macros.new_genls_rule_final_index_spec_iterator(genl, rule_sense, NIL);
                                                            SubLObject done_var = NIL;
                                                            final SubLObject token_var = NIL;
                                                            while (NIL == done_var) {
                                                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                                                if (NIL != valid) {
                                                                    SubLObject final_index_iterator = NIL;
                                                                    try {
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                                                        SubLObject done_var_$109 = NIL;
                                                                        final SubLObject token_var_$110 = NIL;
                                                                        while (NIL == done_var_$109) {
                                                                            final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$110);
                                                                            final SubLObject valid_$111 = makeBoolean(!token_var_$110.eql(rule));
                                                                            if (NIL != valid_$111) {
                                                                                final SubLObject v_bindings = rkf_sd_gaf_lit_rule_bindings(gaf_lit, rule, rule_sense, UNPROVIDED);
                                                                                if ((NIL != v_bindings) && (NIL == rkf_salient_descriptor.rkf_bad_sd_ruleP(rule, mt))) {
                                                                                    final SubLObject item_var = list(gaf, gaf_lit, rule, v_bindings);
                                                                                    if (NIL == member(item_var, new_items, $sym180$RKF_SD_RULE_TUPLE__, symbol_function(IDENTITY))) {
                                                                                        new_items = cons(item_var, new_items);
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_var_$109 = makeBoolean(NIL == valid_$111);
                                                                        } 
                                                                    } finally {
                                                                        final SubLObject _prev_bind_0_$104 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            final SubLObject _values = getValuesAsVector();
                                                                            if (NIL != final_index_iterator) {
                                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                            }
                                                                            restoreValuesFromVector(_values);
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$104, thread);
                                                                        }
                                                                    }
                                                                }
                                                                done_var = makeBoolean(NIL == valid);
                                                            } 
                                                        }
                                                        done_genls = cons(genl, done_genls);
                                                    }
                                                }
                                                SubLObject cdolist_list_var;
                                                final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                                SubLObject module_var = NIL;
                                                module_var = cdolist_list_var.first();
                                                while (NIL != cdolist_list_var) {
                                                    final SubLObject _prev_bind_0_$105 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$105 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        final SubLObject node = function_terms.naut_to_nart(node_var);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link) {
                                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links) {
                                                                    SubLObject iteration_state;
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt_$115 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt_$115)) {
                                                                            final SubLObject _prev_bind_0_$106 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt_$115, thread);
                                                                                SubLObject iteration_state_$117;
                                                                                for (iteration_state_$117 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$117); iteration_state_$117 = dictionary_contents.do_dictionary_contents_next(iteration_state_$117)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$117);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        final SubLObject _prev_bind_0_$107 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            final SubLObject sol = link_nodes;
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state_$119;
                                                                                                SubLObject node_vars_link_node;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state_$119 = NIL, state_$119 = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state_$119); state_$119 = set_contents.do_set_contents_update_state(state_$119)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object, state_$119);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state_$119, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    SubLObject csome_list_var = sol;
                                                                                                    SubLObject node_vars_link_node2 = NIL;
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                    while (NIL != csome_list_var) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error($str118$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$107, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$117);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$106, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str119$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$120;
                                                                final SubLObject new_list = cdolist_list_var_$120 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                SubLObject generating_fn = NIL;
                                                                generating_fn = cdolist_list_var_$120.first();
                                                                while (NIL != cdolist_list_var_$120) {
                                                                    final SubLObject _prev_bind_0_$108 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        final SubLObject sol2;
                                                                        final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                        if (NIL != set.set_p(sol2)) {
                                                                            final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                            SubLObject basis_object2;
                                                                            SubLObject state_$120;
                                                                            SubLObject node_vars_link_node3;
                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state_$120 = NIL, state_$120 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state_$120); state_$120 = set_contents.do_set_contents_update_state(state_$120)) {
                                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state_$120);
                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state_$120, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol2.isList()) {
                                                                                SubLObject csome_list_var2 = sol2;
                                                                                SubLObject node_vars_link_node4 = NIL;
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                                while (NIL != csome_list_var2) {
                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                    }
                                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                                } 
                                                                            } else {
                                                                                Errors.error($str118$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$108, thread);
                                                                    }
                                                                    cdolist_list_var_$120 = cdolist_list_var_$120.rest();
                                                                    generating_fn = cdolist_list_var_$120.first();
                                                                } 
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$105, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$105, thread);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    module_var = cdolist_list_var.first();
                                                } 
                                                node_var = deck.deck_pop(recur_deck);
                                            } 
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$106, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$104, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$103, thread);
                                        }
                                    } else {
                                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str120$Node__a_does_not_pass_sbhl_type_t, col, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                } finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$105, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$103, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$102, thread);
                                }
                            } finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$102, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$101, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$109 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$109, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$100, thread);
                    }
                } finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$99, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$110 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values3 = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values3);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$110, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return values(new_items, done_genls);
    }

    public static final SubLObject rkf_sd_rule_tuple_E_alt(SubLObject tuple1, SubLObject tuple2) {
        {
            SubLObject datum = tuple1;
            SubLObject current = datum;
            SubLObject gaf1 = NIL;
            SubLObject gaf_lit1 = NIL;
            SubLObject rule1 = NIL;
            SubLObject bindings1 = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt185);
            gaf1 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt185);
            gaf_lit1 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt185);
            rule1 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt185);
            bindings1 = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject datum_131 = tuple2;
                    SubLObject current_132 = datum_131;
                    SubLObject gaf2 = NIL;
                    SubLObject gaf_lit2 = NIL;
                    SubLObject rule2 = NIL;
                    SubLObject bindings2 = NIL;
                    destructuring_bind_must_consp(current_132, datum_131, $list_alt186);
                    gaf2 = current_132.first();
                    current_132 = current_132.rest();
                    destructuring_bind_must_consp(current_132, datum_131, $list_alt186);
                    gaf_lit2 = current_132.first();
                    current_132 = current_132.rest();
                    destructuring_bind_must_consp(current_132, datum_131, $list_alt186);
                    rule2 = current_132.first();
                    current_132 = current_132.rest();
                    destructuring_bind_must_consp(current_132, datum_131, $list_alt186);
                    bindings2 = current_132.first();
                    current_132 = current_132.rest();
                    if (NIL == current_132) {
                        return makeBoolean((((gaf1 == gaf2) && (rule1 == rule2)) && gaf_lit1.equal(gaf_lit2)) && bindings1.equal(bindings2));
                    } else {
                        cdestructuring_bind_error(datum_131, $list_alt186);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt185);
            }
        }
        return NIL;
    }

    public static SubLObject rkf_sd_rule_tuple_E(final SubLObject tuple1, final SubLObject tuple2) {
        SubLObject gaf1 = NIL;
        SubLObject gaf_lit1 = NIL;
        SubLObject rule1 = NIL;
        SubLObject bindings1 = NIL;
        destructuring_bind_must_consp(tuple1, tuple1, $list184);
        gaf1 = tuple1.first();
        SubLObject current = tuple1.rest();
        destructuring_bind_must_consp(current, tuple1, $list184);
        gaf_lit1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, tuple1, $list184);
        rule1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, tuple1, $list184);
        bindings1 = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject gaf2 = NIL;
            SubLObject gaf_lit2 = NIL;
            SubLObject rule2 = NIL;
            SubLObject bindings2 = NIL;
            destructuring_bind_must_consp(tuple2, tuple2, $list185);
            gaf2 = tuple2.first();
            SubLObject current_$126 = tuple2.rest();
            destructuring_bind_must_consp(current_$126, tuple2, $list185);
            gaf_lit2 = current_$126.first();
            current_$126 = current_$126.rest();
            destructuring_bind_must_consp(current_$126, tuple2, $list185);
            rule2 = current_$126.first();
            current_$126 = current_$126.rest();
            destructuring_bind_must_consp(current_$126, tuple2, $list185);
            bindings2 = current_$126.first();
            current_$126 = current_$126.rest();
            if (NIL == current_$126) {
                return makeBoolean(((gaf1.eql(gaf2) && rule1.eql(rule2)) && gaf_lit1.equal(gaf_lit2)) && bindings1.equal(bindings2));
            }
            cdestructuring_bind_error(tuple2, $list185);
        } else {
            cdestructuring_bind_error(tuple1, $list184);
        }
        return NIL;
    }

    /**
     * Add a score onto TUPLE.
     */
    @LispMethod(comment = "Add a score onto TUPLE.")
    public static final SubLObject rkf_sd_score_rule_tuple_alt(SubLObject tuple) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cnf = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_el_cnf_from_rule_tuple(tuple);
                SubLObject score = new_rkf_sd_rule_info_score();
                _csetf_rkf_sd_rule_info_score_seed_term_in_pos_litsP(score, list_utilities.sublisp_boolean(list_utilities.tree_find($rkf_sd_seed_term$.getDynamicValue(thread), clauses.pos_lits(cnf), UNPROVIDED, UNPROVIDED)));
                _csetf_rkf_sd_rule_info_score_seed_term_in_neg_litsP(score, list_utilities.sublisp_boolean(list_utilities.tree_find($rkf_sd_seed_term$.getDynamicValue(thread), clauses.neg_lits(cnf), UNPROVIDED, UNPROVIDED)));
                _csetf_rkf_sd_rule_info_score_var_count(score, list_utilities.tree_count_if($sym38$EL_VAR_, cnf, UNPROVIDED));
                _csetf_rkf_sd_rule_info_score_neg_lit_count(score, length(clauses.neg_lits(cnf)));
                _csetf_rkf_sd_rule_info_score_pos_lit_count(score, length(clauses.pos_lits(cnf)));
                _csetf_rkf_sd_rule_info_score_pos_lit_quality_score(score, com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_cnf_rule_count(cnf));
                _csetf_rkf_sd_rule_info_score_mt_generality_score(score, com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_tuple_mt_generality(tuple));
                tuple = nconc(tuple, list(score));
            }
            return tuple;
        }
    }

    @LispMethod(comment = "Add a score onto TUPLE.")
    public static SubLObject rkf_sd_score_rule_tuple(SubLObject tuple) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cnf = rkf_sd_el_cnf_from_rule_tuple(tuple);
        final SubLObject score = rkf_salient_descriptor_datastructures.new_rkf_sd_rule_info_score();
        rkf_salient_descriptor_datastructures._csetf_rkf_sd_rule_info_score_seed_term_in_pos_litsP(score, list_utilities.sublisp_boolean(list_utilities.tree_find($rkf_sd_seed_term$.getDynamicValue(thread), clauses.pos_lits(cnf), UNPROVIDED, UNPROVIDED)));
        rkf_salient_descriptor_datastructures._csetf_rkf_sd_rule_info_score_seed_term_in_neg_litsP(score, list_utilities.sublisp_boolean(list_utilities.tree_find($rkf_sd_seed_term$.getDynamicValue(thread), clauses.neg_lits(cnf), UNPROVIDED, UNPROVIDED)));
        rkf_salient_descriptor_datastructures._csetf_rkf_sd_rule_info_score_var_count(score, list_utilities.tree_count_if($sym37$EL_VAR_, cnf, UNPROVIDED));
        rkf_salient_descriptor_datastructures._csetf_rkf_sd_rule_info_score_neg_lit_count(score, length(clauses.neg_lits(cnf)));
        rkf_salient_descriptor_datastructures._csetf_rkf_sd_rule_info_score_pos_lit_count(score, length(clauses.pos_lits(cnf)));
        rkf_salient_descriptor_datastructures._csetf_rkf_sd_rule_info_score_pos_lit_quality_score(score, rkf_sd_cnf_rule_count(cnf));
        rkf_salient_descriptor_datastructures._csetf_rkf_sd_rule_info_score_mt_generality_score(score, rkf_sd_tuple_mt_generality(tuple));
        tuple = nconc(tuple, list(score));
        return tuple;
    }/**
     * Add a score onto TUPLE.
     */


    /**
     *
     *
     * @return BOOLEAN; Should we prefer TUPLE1 over TUPLE2?
     */
    @LispMethod(comment = "@return BOOLEAN; Should we prefer TUPLE1 over TUPLE2?")
    public static final SubLObject rkf_sd_prefer_rule_tupleP_alt(SubLObject tuple1, SubLObject tuple2) {
        {
            SubLObject score1 = fifth(tuple1);
            SubLObject score2 = fifth(tuple2);
            return com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_rule_info_score_G(score1, score2);
        }
    }

    /**
     *
     *
     * @return BOOLEAN; Should we prefer TUPLE1 over TUPLE2?
     */
    @LispMethod(comment = "@return BOOLEAN; Should we prefer TUPLE1 over TUPLE2?")
    public static SubLObject rkf_sd_prefer_rule_tupleP(final SubLObject tuple1, final SubLObject tuple2) {
        final SubLObject score1 = fifth(tuple1);
        final SubLObject score2 = fifth(tuple2);
        return rkf_sd_rule_info_score_G(score1, score2);
    }

    /**
     *
     *
     * @return BOOLEAN; Is SCORE1 a better score than SCORE2?
     */
    @LispMethod(comment = "@return BOOLEAN; Is SCORE1 a better score than SCORE2?")
    public static final SubLObject rkf_sd_rule_info_score_G_alt(SubLObject score1, SubLObject score2) {
        {
            SubLObject test_result = NIL;
            if (NIL == test_result) {
                {
                    SubLObject csome_list_var = $rkf_sd_rule_score_tests$.getGlobalValue();
                    SubLObject test = NIL;
                    for (test = csome_list_var.first(); !((NIL != test_result) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , test = csome_list_var.first()) {
                        if (test.isFunctionSpec()) {
                            test_result = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_rule_score_do_test(test, score1, score2);
                        }
                    }
                }
            }
            return eq($BETTER, test_result);
        }
    }

    /**
     *
     *
     * @return BOOLEAN; Is SCORE1 a better score than SCORE2?
     */
    @LispMethod(comment = "@return BOOLEAN; Is SCORE1 a better score than SCORE2?")
    public static SubLObject rkf_sd_rule_info_score_G(final SubLObject score1, final SubLObject score2) {
        SubLObject test_result = NIL;
        if (NIL == test_result) {
            SubLObject csome_list_var = $rkf_sd_rule_score_tests$.getGlobalValue();
            SubLObject test = NIL;
            test = csome_list_var.first();
            while ((NIL == test_result) && (NIL != csome_list_var)) {
                if (test.isFunctionSpec()) {
                    test_result = rkf_sd_rule_score_do_test(test, score1, score2);
                }
                csome_list_var = csome_list_var.rest();
                test = csome_list_var.first();
            } 
        }
        return eq($BETTER, test_result);
    }

    /**
     * Use TEST to try to determine if SCORE1 is :BETTER or :WORSE than SCORE2.
     */
    @LispMethod(comment = "Use TEST to try to determine if SCORE1 is :BETTER or :WORSE than SCORE2.")
    public static final SubLObject rkf_sd_rule_score_do_test_alt(SubLObject test, SubLObject score1, SubLObject score2) {
        if (NIL != funcall(test, score1, score2)) {
            return $BETTER;
        } else {
            if (NIL != funcall(test, score2, score1)) {
                return $WORSE;
            } else {
                return NIL;
            }
        }
    }

    @LispMethod(comment = "Use TEST to try to determine if SCORE1 is :BETTER or :WORSE than SCORE2.")
    public static SubLObject rkf_sd_rule_score_do_test(final SubLObject test, final SubLObject score1, final SubLObject score2) {
        if (NIL != funcall(test, score1, score2)) {
            return $BETTER;
        }
        if (NIL != funcall(test, score2, score1)) {
            return $WORSE;
        }
        return NIL;
    }/**
     * Use TEST to try to determine if SCORE1 is :BETTER or :WORSE than SCORE2.
     */


    public static final SubLObject rkf_sd_rst_seed_term_in_pos_lits_alt(SubLObject score1, SubLObject score2) {
        return makeBoolean((NIL != rkf_sd_rule_info_score_seed_term_in_pos_litsP(score1)) && (NIL == rkf_sd_rule_info_score_seed_term_in_pos_litsP(score2)));
    }

    public static SubLObject rkf_sd_rst_seed_term_in_pos_lits(final SubLObject score1, final SubLObject score2) {
        return makeBoolean((NIL != rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_seed_term_in_pos_litsP(score1)) && (NIL == rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_seed_term_in_pos_litsP(score2)));
    }

    public static final SubLObject rkf_sd_rst_seed_term_in_neg_lits_alt(SubLObject score1, SubLObject score2) {
        return makeBoolean((NIL != rkf_sd_rule_info_score_seed_term_in_neg_litsP(score1)) && (NIL == rkf_sd_rule_info_score_seed_term_in_neg_litsP(score2)));
    }

    public static SubLObject rkf_sd_rst_seed_term_in_neg_lits(final SubLObject score1, final SubLObject score2) {
        return makeBoolean((NIL != rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_seed_term_in_neg_litsP(score1)) && (NIL == rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_seed_term_in_neg_litsP(score2)));
    }

    public static final SubLObject rkf_sd_rst_var_count_alt(SubLObject score1, SubLObject score2) {
        return numL(rkf_sd_rule_info_score_var_count(score1), rkf_sd_rule_info_score_var_count(score2));
    }

    public static SubLObject rkf_sd_rst_var_count(final SubLObject score1, final SubLObject score2) {
        return numL(rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_var_count(score1), rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_var_count(score2));
    }

    public static final SubLObject rkf_sd_rst_neg_lit_count_alt(SubLObject score1, SubLObject score2) {
        return makeBoolean(rkf_sd_rule_info_score_neg_lit_count(score1).isPositive() && rkf_sd_rule_info_score_neg_lit_count(score1).numL(rkf_sd_rule_info_score_neg_lit_count(score2)));
    }

    public static SubLObject rkf_sd_rst_neg_lit_count(final SubLObject score1, final SubLObject score2) {
        return makeBoolean(rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_neg_lit_count(score1).isPositive() && rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_neg_lit_count(score1).numL(rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_neg_lit_count(score2)));
    }

    public static final SubLObject rkf_sd_rst_pos_lit_count_alt(SubLObject score1, SubLObject score2) {
        return makeBoolean(rkf_sd_rule_info_score_pos_lit_count(score1).isPositive() && rkf_sd_rule_info_score_pos_lit_count(score1).numL(rkf_sd_rule_info_score_pos_lit_count(score2)));
    }

    public static SubLObject rkf_sd_rst_pos_lit_count(final SubLObject score1, final SubLObject score2) {
        return makeBoolean(rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_pos_lit_count(score1).isPositive() && rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_pos_lit_count(score1).numL(rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_pos_lit_count(score2)));
    }

    public static final SubLObject rkf_sd_rst_mt_generality_alt(SubLObject score1, SubLObject score2) {
        return numG(rkf_sd_rule_info_score_mt_generality_score(score1), rkf_sd_rule_info_score_mt_generality_score(score2));
    }

    public static SubLObject rkf_sd_rst_mt_generality(final SubLObject score1, final SubLObject score2) {
        return numG(rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_mt_generality_score(score1), rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_mt_generality_score(score2));
    }

    public static final SubLObject rkf_sd_rst_pos_lit_quality_alt(SubLObject score1, SubLObject score2) {
        return numG(rkf_sd_rule_info_score_pos_lit_quality_score(score1), rkf_sd_rule_info_score_pos_lit_quality_score(score2));
    }

    public static SubLObject rkf_sd_rst_pos_lit_quality(final SubLObject score1, final SubLObject score2) {
        return numG(rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_pos_lit_quality_score(score1), rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_pos_lit_quality_score(score2));
    }

    public static final SubLObject rkf_sd_tuple_mt_generality_alt(SubLObject tuple) {
        {
            SubLObject datum = tuple;
            SubLObject current = datum;
            SubLObject gaf = NIL;
            SubLObject gaf_lit = NIL;
            SubLObject rule = NIL;
            SubLObject v_bindings = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt190);
            gaf = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt190);
            gaf_lit = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt190);
            rule = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt190);
            v_bindings = current.first();
            current = current.rest();
            if (NIL == current) {
                return number_utilities.minimum(list(cardinality_estimates.generality_estimate(assertions_high.assertion_mt(gaf)), cardinality_estimates.generality_estimate(assertions_high.assertion_mt(rule))), UNPROVIDED);
            } else {
                cdestructuring_bind_error(datum, $list_alt190);
            }
        }
        return NIL;
    }

    public static SubLObject rkf_sd_tuple_mt_generality(final SubLObject tuple) {
        SubLObject gaf = NIL;
        SubLObject gaf_lit = NIL;
        SubLObject rule = NIL;
        SubLObject v_bindings = NIL;
        destructuring_bind_must_consp(tuple, tuple, $list189);
        gaf = tuple.first();
        SubLObject current = tuple.rest();
        destructuring_bind_must_consp(current, tuple, $list189);
        gaf_lit = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, tuple, $list189);
        rule = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, tuple, $list189);
        v_bindings = current.first();
        current = current.rest();
        if (NIL == current) {
            return number_utilities.minimum(list(cardinality_estimates.generality_estimate(assertions_high.assertion_mt(gaf)), cardinality_estimates.generality_estimate(assertions_high.assertion_mt(rule))), UNPROVIDED);
        }
        cdestructuring_bind_error(tuple, $list189);
        return NIL;
    }

    public static final SubLObject rkf_sd_cnf_rule_count_alt(SubLObject cnf) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject rule_count = ZERO_INTEGER;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject cdolist_list_var = clauses.pos_lits(cnf);
                            SubLObject pos_lit = NIL;
                            for (pos_lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pos_lit = cdolist_list_var.first()) {
                                rule_count = add(rule_count, kb_indexing.num_predicate_rule_index(cycl_utilities.atomic_sentence_predicate(pos_lit), $NEG, UNPROVIDED, UNPROVIDED));
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return rule_count;
            }
        }
    }

    public static SubLObject rkf_sd_cnf_rule_count(final SubLObject cnf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rule_count = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject cdolist_list_var = clauses.pos_lits(cnf);
            SubLObject pos_lit = NIL;
            pos_lit = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                rule_count = add(rule_count, kb_indexing.num_predicate_rule_index(cycl_utilities.atomic_sentence_predicate(pos_lit), $NEG, UNPROVIDED, UNPROVIDED));
                cdolist_list_var = cdolist_list_var.rest();
                pos_lit = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return rule_count;
    }

    public static final SubLObject rkf_sd_el_cnf_from_rule_tuple_alt(SubLObject tuple) {
        {
            SubLObject datum = tuple;
            SubLObject current = datum;
            SubLObject gaf = NIL;
            SubLObject gaf_lit = NIL;
            SubLObject rule = NIL;
            SubLObject v_bindings = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt190);
            gaf = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt190);
            gaf_lit = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt190);
            rule = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt190);
            v_bindings = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject hl_cnf = copy_tree(assertions_high.assertion_cnf(rule));
                    SubLObject el_vars = assertions_high.assertion_el_variables(rule);
                    SubLObject rule_sense = ($TRUE == assertions_high.assertion_truth(gaf)) ? ((SubLObject) ($NEG)) : $POS;
                    SubLObject lits = clauses.clause_sense_lits(hl_cnf, rule_sense);
                    SubLObject match = NIL;
                    if (NIL != v_bindings) {
                        {
                            SubLObject new_lits = remove(match, lits, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject new_neg_lits = ($NEG == rule_sense) ? ((SubLObject) (new_lits)) : clauses.neg_lits(hl_cnf);
                            SubLObject new_pos_lits = ($POS == rule_sense) ? ((SubLObject) (new_lits)) : clauses.pos_lits(hl_cnf);
                            SubLObject new_hl_cnf = clauses.make_clause(new_neg_lits, new_pos_lits);
                            new_hl_cnf = bindings.subst_bindings(v_bindings, new_hl_cnf);
                            return rkf_salient_descriptor.rkf_sd_el_cnf_of_hl_cnf(new_hl_cnf, el_vars);
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt190);
            }
        }
        return NIL;
    }

    public static SubLObject rkf_sd_el_cnf_from_rule_tuple(final SubLObject tuple) {
        SubLObject gaf = NIL;
        SubLObject gaf_lit = NIL;
        SubLObject rule = NIL;
        SubLObject v_bindings = NIL;
        destructuring_bind_must_consp(tuple, tuple, $list189);
        gaf = tuple.first();
        SubLObject current = tuple.rest();
        destructuring_bind_must_consp(current, tuple, $list189);
        gaf_lit = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, tuple, $list189);
        rule = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, tuple, $list189);
        v_bindings = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject hl_cnf = copy_tree(assertions_high.assertion_cnf(rule));
            final SubLObject el_vars = assertions_high.assertion_el_variables(rule);
            final SubLObject rule_sense = ($TRUE == assertions_high.assertion_truth(gaf)) ? $NEG : $POS;
            final SubLObject lits = clauses.clause_sense_lits(hl_cnf, rule_sense);
            final SubLObject match = NIL;
            if (NIL != v_bindings) {
                final SubLObject new_lits = remove(match, lits, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                final SubLObject new_neg_lits = ($NEG == rule_sense) ? new_lits : clauses.neg_lits(hl_cnf);
                final SubLObject new_pos_lits = ($POS == rule_sense) ? new_lits : clauses.pos_lits(hl_cnf);
                SubLObject new_hl_cnf = clauses.make_clause(new_neg_lits, new_pos_lits);
                new_hl_cnf = bindings.subst_bindings(v_bindings, new_hl_cnf);
                return rkf_salient_descriptor.rkf_sd_el_cnf_of_hl_cnf(new_hl_cnf, el_vars);
            }
        } else {
            cdestructuring_bind_error(tuple, $list189);
        }
        return NIL;
    }

    public static final SubLObject rkf_sd_gaf_okP_alt(SubLObject gaf) {
        return makeBoolean((NIL != assertions_high.asserted_assertionP(gaf)) && (NIL != com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_gaf_generality_okP(gaf)));
    }

    public static SubLObject rkf_sd_gaf_okP(final SubLObject gaf) {
        return makeBoolean((NIL != assertions_high.asserted_assertionP(gaf)) && (NIL != rkf_sd_gaf_generality_okP(gaf)));
    }

    public static final SubLObject rkf_sd_gaf_generality_okP_alt(SubLObject gaf) {
        return makeBoolean(NIL == cycl_utilities.expression_find_if($sym191$RKF_SD_TERM_TOO_GENERAL_, assertions_high.gaf_args(gaf), T, UNPROVIDED));
    }

    public static SubLObject rkf_sd_gaf_generality_okP(final SubLObject gaf) {
        return makeBoolean(NIL == cycl_utilities.expression_find_if($sym190$RKF_SD_TERM_TOO_GENERAL_, assertions_high.gaf_args(gaf), T, UNPROVIDED));
    }

    public static final SubLObject rkf_sd_term_too_generalP_alt(SubLObject v_term) {
        {
            SubLObject generality_cutoff = $int$5000;
            return makeBoolean((NIL != forts.fort_p(v_term)) && cardinality_estimates.generality_estimate(v_term).numG(generality_cutoff));
        }
    }

    public static SubLObject rkf_sd_term_too_generalP(final SubLObject v_term) {
        final SubLObject generality_cutoff = $int$5000;
        return makeBoolean((NIL != forts.fort_p(v_term)) && cardinality_estimates.generality_estimate(v_term).numG(generality_cutoff));
    }

    public static final SubLObject rkf_sd_gaf_rule_bindings_alt(SubLObject gaf, SubLObject rule, SubLObject rule_sense, SubLObject strictP) {
        if (strictP == UNPROVIDED) {
            strictP = NIL;
        }
        {
            SubLObject gaf_lit = assertions_high.gaf_formula(gaf);
            return com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_gaf_lit_rule_bindings(gaf_lit, rule, rule_sense, strictP);
        }
    }

    public static SubLObject rkf_sd_gaf_rule_bindings(final SubLObject gaf, final SubLObject rule, final SubLObject rule_sense, SubLObject strictP) {
        if (strictP == UNPROVIDED) {
            strictP = NIL;
        }
        final SubLObject gaf_lit = assertions_high.gaf_formula(gaf);
        return rkf_sd_gaf_lit_rule_bindings(gaf_lit, rule, rule_sense, strictP);
    }

    public static final SubLObject rkf_sd_gaf_lit_rule_bindings_alt(SubLObject gaf_lit, SubLObject rule, SubLObject sense, SubLObject strictP) {
        if (strictP == UNPROVIDED) {
            strictP = NIL;
        }
        {
            SubLObject cnf = assertions_high.assertion_cnf(rule);
            SubLObject rule_lits = ($NEG == sense) ? ((SubLObject) (clauses.neg_lits(cnf))) : clauses.pos_lits(cnf);
            SubLObject v_bindings = NIL;
            if (NIL == v_bindings) {
                {
                    SubLObject csome_list_var = rule_lits;
                    SubLObject rule_lit = NIL;
                    for (rule_lit = csome_list_var.first(); !((NIL != v_bindings) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , rule_lit = csome_list_var.first()) {
                        if ((NIL == strictP) || (NIL != variables.fully_bound_p(cycl_utilities.atomic_sentence_arg2(rule_lit, UNPROVIDED)))) {
                            v_bindings = unification_utilities.asent_unify(gaf_lit, rule_lit, UNPROVIDED, UNPROVIDED);
                        }
                    }
                }
            }
            return v_bindings;
        }
    }

    public static SubLObject rkf_sd_gaf_lit_rule_bindings(final SubLObject gaf_lit, final SubLObject rule, final SubLObject sense, SubLObject strictP) {
        if (strictP == UNPROVIDED) {
            strictP = NIL;
        }
        final SubLObject cnf = assertions_high.assertion_cnf(rule);
        final SubLObject rule_lits = ($NEG == sense) ? clauses.neg_lits(cnf) : clauses.pos_lits(cnf);
        SubLObject v_bindings = NIL;
        if (NIL == v_bindings) {
            SubLObject csome_list_var = rule_lits;
            SubLObject rule_lit = NIL;
            rule_lit = csome_list_var.first();
            while ((NIL == v_bindings) && (NIL != csome_list_var)) {
                if ((NIL == strictP) || (NIL != variables.fully_bound_p(cycl_utilities.atomic_sentence_arg2(rule_lit, UNPROVIDED)))) {
                    v_bindings = unification_utilities.asent_unify(gaf_lit, rule_lit, UNPROVIDED, UNPROVIDED);
                }
                csome_list_var = csome_list_var.rest();
                rule_lit = csome_list_var.first();
            } 
        }
        return v_bindings;
    }

    public static final SubLObject rkf_sd_subprompts_matches_cnfP_alt(SubLObject subprompts, SubLObject cnf) {
        {
            SubLObject new_cnf = NIL;
            if (NIL == new_cnf) {
                {
                    SubLObject csome_list_var = subprompts;
                    SubLObject subprompt = NIL;
                    for (subprompt = csome_list_var.first(); !((NIL != new_cnf) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , subprompt = csome_list_var.first()) {
                        {
                            SubLObject assert_sentence = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_assert_sentence(subprompt, UNPROVIDED, UNPROVIDED);
                            new_cnf = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_assert_sentence_matches_cnfP(assert_sentence, cnf);
                        }
                    }
                }
            }
            return new_cnf;
        }
    }

    public static SubLObject rkf_sd_subprompts_matches_cnfP(final SubLObject subprompts, final SubLObject cnf) {
        SubLObject new_cnf = NIL;
        if (NIL == new_cnf) {
            SubLObject csome_list_var = subprompts;
            SubLObject subprompt = NIL;
            subprompt = csome_list_var.first();
            while ((NIL == new_cnf) && (NIL != csome_list_var)) {
                final SubLObject assert_sentence = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_assert_sentence(subprompt, UNPROVIDED, UNPROVIDED);
                new_cnf = rkf_sd_assert_sentence_matches_cnfP(assert_sentence, cnf);
                csome_list_var = csome_list_var.rest();
                subprompt = csome_list_var.first();
            } 
        }
        return new_cnf;
    }

    public static final SubLObject rkf_sd_assert_sentence_matches_cnfP_alt(SubLObject assert_sentence, SubLObject cnf) {
        {
            SubLObject new_cnf = NIL;
            if (NIL == new_cnf) {
                {
                    SubLObject csome_list_var = clauses.neg_lits(cnf);
                    SubLObject neg_lit = NIL;
                    for (neg_lit = csome_list_var.first(); !((NIL != new_cnf) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , neg_lit = csome_list_var.first()) {
                        if (NIL != com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_assert_sentence_matches_neg_litP(assert_sentence, neg_lit)) {
                            {
                                SubLObject new_neg_lits = remove(neg_lit, clauses.neg_lits(cnf), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                new_cnf = clauses.make_clause(new_neg_lits, clauses.pos_lits(cnf));
                            }
                        }
                    }
                }
            }
            return new_cnf;
        }
    }

    public static SubLObject rkf_sd_assert_sentence_matches_cnfP(final SubLObject assert_sentence, final SubLObject cnf) {
        SubLObject new_cnf = NIL;
        if (NIL == new_cnf) {
            SubLObject csome_list_var = clauses.neg_lits(cnf);
            SubLObject neg_lit = NIL;
            neg_lit = csome_list_var.first();
            while ((NIL == new_cnf) && (NIL != csome_list_var)) {
                if (NIL != rkf_sd_assert_sentence_matches_neg_litP(assert_sentence, neg_lit)) {
                    final SubLObject new_neg_lits = remove(neg_lit, clauses.neg_lits(cnf), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    new_cnf = clauses.make_clause(new_neg_lits, clauses.pos_lits(cnf));
                }
                csome_list_var = csome_list_var.rest();
                neg_lit = csome_list_var.first();
            } 
        }
        return new_cnf;
    }

    public static final SubLObject rkf_sd_assert_sentence_matches_neg_litP_alt(SubLObject assert_sentence, SubLObject neg_lit) {
        {
            SubLObject mismatchP = makeBoolean(NIL == same_formula_arity_p(assert_sentence, neg_lit, UNPROVIDED));
            SubLObject terms = cycl_utilities.formula_terms(assert_sentence, $IGNORE);
            SubLObject list_var = NIL;
            SubLObject v_term = NIL;
            SubLObject argnum = NIL;
            for (list_var = terms, v_term = list_var.first(), argnum = ZERO_INTEGER; !((NIL != mismatchP) || (NIL == list_var)); list_var = list_var.rest() , v_term = list_var.first() , argnum = number_utilities.f_1X(argnum)) {
                if (!((NIL != cycl_variables.el_varP(v_term)) || v_term.equal(cycl_utilities.formula_arg(neg_lit, argnum, UNPROVIDED)))) {
                    mismatchP = T;
                }
            }
            return makeBoolean(NIL == mismatchP);
        }
    }

    public static SubLObject rkf_sd_assert_sentence_matches_neg_litP(final SubLObject assert_sentence, final SubLObject neg_lit) {
        SubLObject mismatchP = makeBoolean(NIL == same_formula_arity_p(assert_sentence, neg_lit, UNPROVIDED));
        final SubLObject terms = cycl_utilities.formula_terms(assert_sentence, $IGNORE);
        SubLObject list_var = NIL;
        SubLObject v_term = NIL;
        SubLObject argnum = NIL;
        list_var = terms;
        v_term = list_var.first();
        for (argnum = ZERO_INTEGER; (NIL == mismatchP) && (NIL != list_var); list_var = list_var.rest() , v_term = list_var.first() , argnum = number_utilities.f_1X(argnum)) {
            if ((NIL == cycl_variables.el_varP(v_term)) && (!v_term.equal(cycl_utilities.formula_arg(neg_lit, argnum, UNPROVIDED)))) {
                mismatchP = T;
            }
        }
        return makeBoolean(NIL == mismatchP);
    }

    public static final SubLObject rkf_sd_prompter_strong_alt(SubLObject prompter) {
        return com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_add_ke_driven_prompts(prompter, $$keStrongSuggestion);
    }

    public static SubLObject rkf_sd_prompter_strong(final SubLObject prompter) {
        return rkf_sd_prompter_add_ke_driven_prompts(prompter, $$keStrongSuggestion);
    }

    public static final SubLObject rkf_sd_prompter_induced_alt(SubLObject prompter) {
        return com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_add_ke_driven_prompts(prompter, RKF_NEIGHBOR_SUGGESTIONS);
    }

    public static SubLObject rkf_sd_prompter_induced(final SubLObject prompter) {
        return rkf_sd_prompter_add_ke_driven_prompts(prompter, RKF_NEIGHBOR_SUGGESTIONS);
    }

    public static final SubLObject rkf_sd_prompter_weak_alt(SubLObject prompter) {
        return com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_add_ke_driven_prompts(prompter, $$keWeakSuggestion);
    }

    public static SubLObject rkf_sd_prompter_weak(final SubLObject prompter) {
        return rkf_sd_prompter_add_ke_driven_prompts(prompter, $$keWeakSuggestion);
    }

    public static final SubLObject rkf_sd_prompter_compute_subpromptss_alt(SubLObject prompter) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject bad_prompts = NIL;
                SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                {
                    SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                    SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                        {
                            SubLObject set_contents_var = set.do_set_internal(rkf_sd_prompter_unused_prompts(prompter));
                            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                            SubLObject state = NIL;
                            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                {
                                    SubLObject prompt = set_contents.do_set_contents_next(basis_object, state);
                                    if (NIL != set_contents.do_set_contents_element_validP(state, prompt)) {
                                        {
                                            SubLObject cached_subprompts = rkf_sd_prompt_subprompts(prompt);
                                            if (NIL == rkf_salient_descriptor.rkf_salient_descriptor_subprompts_p(cached_subprompts)) {
                                                com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompt_compute_subprompts(prompt);
                                                if (NIL != com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompt_bad_subpromptsP(prompt, rkf_sd_prompt_subprompts(prompt))) {
                                                    bad_prompts = cons(prompt, bad_prompts);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject cdolist_list_var = bad_prompts;
                    SubLObject bad_prompt = NIL;
                    for (bad_prompt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , bad_prompt = cdolist_list_var.first()) {
                        com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_remove_unused_prompt(prompter, bad_prompt);
                    }
                }
            }
            return $DONE;
        }
    }

    public static SubLObject rkf_sd_prompter_compute_subpromptss(final SubLObject prompter) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject bad_prompts = NIL;
        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
            final SubLObject set_var = rkf_salient_descriptor_datastructures.rkf_sd_prompter_unused_prompts(prompter);
            final SubLObject set_contents_var = set.do_set_internal(set_var);
            SubLObject basis_object;
            SubLObject state;
            SubLObject prompt;
            SubLObject cached_subprompts;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                prompt = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, prompt)) {
                    cached_subprompts = rkf_salient_descriptor_datastructures.rkf_sd_prompt_subprompts(prompt);
                    if (NIL == rkf_salient_descriptor.rkf_salient_descriptor_subprompts_p(cached_subprompts)) {
                        rkf_sd_prompt_compute_subprompts(prompt);
                        if (NIL != rkf_sd_prompt_bad_subpromptsP(prompt, rkf_salient_descriptor_datastructures.rkf_sd_prompt_subprompts(prompt))) {
                            bad_prompts = cons(prompt, bad_prompts);
                        }
                    }
                }
            }
        } finally {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var = bad_prompts;
        SubLObject bad_prompt = NIL;
        bad_prompt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            rkf_sd_prompter_remove_unused_prompt(prompter, bad_prompt);
            cdolist_list_var = cdolist_list_var.rest();
            bad_prompt = cdolist_list_var.first();
        } 
        return $DONE;
    }

    /**
     *
     *
     * @return BOOLEAN; Do we not want to ask SUBPROMPTS at all?
     */
    @LispMethod(comment = "@return BOOLEAN; Do we not want to ask SUBPROMPTS at all?")
    public static final SubLObject rkf_sd_prompt_bad_subpromptsP_alt(SubLObject prompt, SubLObject subprompts) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject prompter = rkf_sd_prompt_prompter(prompt);
                SubLObject badP = NIL;
                if (NIL != prompter) {
                    {
                        SubLObject state = rkf_salient_descriptor_prompter_lookup(prompter, $MEMOIZATION_STATE, memoization_state.current_memoization_state());
                        SubLObject local_state = state;
                        {
                            SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                            try {
                                memoization_state.$memoization_state$.bind(local_state, thread);
                                {
                                    SubLObject original_memoization_process = NIL;
                                    if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                        original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                        {
                                            SubLObject current_proc = current_process();
                                            if (NIL == original_memoization_process) {
                                                memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                            } else {
                                                if (original_memoization_process != current_proc) {
                                                    Errors.error($str_alt22$Invalid_attempt_to_reuse_memoizat);
                                                }
                                            }
                                        }
                                    }
                                    try {
                                        if (NIL == rkf_salient_descriptor.rkf_salient_descriptor_subprompts_p(subprompts)) {
                                            badP = T;
                                        } else {
                                            if (NIL == rkf_salient_descriptor.rkf_salient_descriptor_subprompt_assert_sentence(subprompts.first(), UNPROVIDED, UNPROVIDED)) {
                                                badP = T;
                                            } else {
                                                if (NIL != com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_not_assertible_subpromptsP(subprompts)) {
                                                    badP = T;
                                                } else {
                                                    if (NIL != com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_unparseable_subpromptsP(subprompts)) {
                                                        badP = T;
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0_133 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                    memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                }
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_133, thread);
                                            }
                                        }
                                    }
                                }
                            } finally {
                                memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return badP;
            }
        }
    }

    /**
     *
     *
     * @return BOOLEAN; Do we not want to ask SUBPROMPTS at all?
     */
    @LispMethod(comment = "@return BOOLEAN; Do we not want to ask SUBPROMPTS at all?")
    public static SubLObject rkf_sd_prompt_bad_subpromptsP(final SubLObject prompt, final SubLObject subprompts) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject prompter = rkf_salient_descriptor_datastructures.rkf_sd_prompt_prompter(prompt);
        SubLObject badP = NIL;
        if (NIL != prompter) {
            final SubLObject local_state;
            final SubLObject state = local_state = rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_lookup(prompter, $MEMOIZATION_STATE, memoization_state.current_memoization_state());
            final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    if (NIL == rkf_salient_descriptor.rkf_salient_descriptor_subprompts_p(subprompts)) {
                        badP = T;
                    } else
                        if (NIL == rkf_salient_descriptor.rkf_salient_descriptor_subprompt_assert_sentence(subprompts.first(), UNPROVIDED, UNPROVIDED)) {
                            badP = T;
                        } else
                            if (NIL != rkf_sd_not_assertible_subpromptsP(subprompts)) {
                                badP = T;
                            } else
                                if (NIL != rkf_sd_unparseable_subpromptsP(subprompts)) {
                                    badP = T;
                                }



                } finally {
                    final SubLObject _prev_bind_0_$127 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$127, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
            }
        }
        return badP;
    }

    public static final SubLObject rkf_sd_not_assertible_subpromptsP_internal_alt(SubLObject subprompts) {
        {
            SubLObject assert_sentence = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_assert_sentence(subprompts.first(), UNPROVIDED, UNPROVIDED);
            return rkf_salient_descriptor.rkf_salient_descriptor_not_assertible_sentenceP(assert_sentence);
        }
    }

    public static SubLObject rkf_sd_not_assertible_subpromptsP_internal(final SubLObject subprompts) {
        final SubLObject assert_sentence = rkf_salient_descriptor.rkf_salient_descriptor_subprompt_assert_sentence(subprompts.first(), UNPROVIDED, UNPROVIDED);
        return rkf_salient_descriptor.rkf_salient_descriptor_not_assertible_sentenceP(assert_sentence);
    }

    public static final SubLObject rkf_sd_not_assertible_subpromptsP_alt(SubLObject subprompts) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_not_assertible_subpromptsP_internal(subprompts);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym195$RKF_SD_NOT_ASSERTIBLE_SUBPROMPTS_, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym195$RKF_SD_NOT_ASSERTIBLE_SUBPROMPTS_, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym195$RKF_SD_NOT_ASSERTIBLE_SUBPROMPTS_, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, subprompts, $kw158$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw158$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_not_assertible_subpromptsP_internal(subprompts)));
                        memoization_state.caching_state_put(caching_state, subprompts, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject rkf_sd_not_assertible_subpromptsP(final SubLObject subprompts) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return rkf_sd_not_assertible_subpromptsP_internal(subprompts);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym194$RKF_SD_NOT_ASSERTIBLE_SUBPROMPTS_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym194$RKF_SD_NOT_ASSERTIBLE_SUBPROMPTS_, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym194$RKF_SD_NOT_ASSERTIBLE_SUBPROMPTS_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, subprompts, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(rkf_sd_not_assertible_subpromptsP_internal(subprompts)));
            memoization_state.caching_state_put(caching_state, subprompts, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject rkf_sd_unparseable_subpromptsP_internal_alt(SubLObject subprompts) {
        {
            SubLObject badP = NIL;
            if (NIL == badP) {
                {
                    SubLObject csome_list_var = subprompts;
                    SubLObject subprompt = NIL;
                    for (subprompt = csome_list_var.first(); !((NIL != badP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , subprompt = csome_list_var.first()) {
                        if ($SPECIFY == rkf_salient_descriptor.rkf_salient_descriptor_subprompt_type(subprompt)) {
                            {
                                SubLObject var = second(subprompt);
                                SubLObject constraint_formula = third(subprompt);
                                if (NIL != el_conjunction_p(constraint_formula)) {
                                    if (NIL == badP) {
                                        {
                                            SubLObject csome_list_var_134 = cycl_utilities.formula_args(constraint_formula, UNPROVIDED);
                                            SubLObject conjunct = NIL;
                                            for (conjunct = csome_list_var_134.first(); !((NIL != badP) || (NIL == csome_list_var_134)); csome_list_var_134 = csome_list_var_134.rest() , conjunct = csome_list_var_134.first()) {
                                                badP = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_unparseable_prompt_litP(conjunct, var);
                                            }
                                        }
                                    }
                                } else {
                                    if (NIL != com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_unparseable_prompt_litP(constraint_formula, var)) {
                                        badP = T;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return badP;
        }
    }

    public static SubLObject rkf_sd_unparseable_subpromptsP_internal(final SubLObject subprompts) {
        SubLObject badP = NIL;
        if (NIL == badP) {
            SubLObject csome_list_var = subprompts;
            SubLObject subprompt = NIL;
            subprompt = csome_list_var.first();
            while ((NIL == badP) && (NIL != csome_list_var)) {
                if ($SPECIFY == rkf_salient_descriptor.rkf_salient_descriptor_subprompt_type(subprompt)) {
                    final SubLObject var = second(subprompt);
                    final SubLObject constraint_formula = third(subprompt);
                    if (NIL != el_conjunction_p(constraint_formula)) {
                        if (NIL == badP) {
                            SubLObject csome_list_var_$128;
                            SubLObject conjunct;
                            for (csome_list_var_$128 = cycl_utilities.formula_args(constraint_formula, UNPROVIDED), conjunct = NIL, conjunct = csome_list_var_$128.first(); (NIL == badP) && (NIL != csome_list_var_$128); badP = rkf_sd_unparseable_prompt_litP(conjunct, var) , csome_list_var_$128 = csome_list_var_$128.rest() , conjunct = csome_list_var_$128.first()) {
                            }
                        }
                    } else
                        if (NIL != rkf_sd_unparseable_prompt_litP(constraint_formula, var)) {
                            badP = T;
                        }

                }
                csome_list_var = csome_list_var.rest();
                subprompt = csome_list_var.first();
            } 
        }
        return badP;
    }

    public static final SubLObject rkf_sd_unparseable_subpromptsP_alt(SubLObject subprompts) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_unparseable_subpromptsP_internal(subprompts);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym196$RKF_SD_UNPARSEABLE_SUBPROMPTS_, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym196$RKF_SD_UNPARSEABLE_SUBPROMPTS_, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym196$RKF_SD_UNPARSEABLE_SUBPROMPTS_, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, subprompts, $kw158$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw158$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_unparseable_subpromptsP_internal(subprompts)));
                        memoization_state.caching_state_put(caching_state, subprompts, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject rkf_sd_unparseable_subpromptsP(final SubLObject subprompts) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return rkf_sd_unparseable_subpromptsP_internal(subprompts);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym195$RKF_SD_UNPARSEABLE_SUBPROMPTS_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym195$RKF_SD_UNPARSEABLE_SUBPROMPTS_, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym195$RKF_SD_UNPARSEABLE_SUBPROMPTS_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, subprompts, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(rkf_sd_unparseable_subpromptsP_internal(subprompts)));
            memoization_state.caching_state_put(caching_state, subprompts, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject rkf_sd_unparseable_prompt_litP_internal_alt(SubLObject conjunct, SubLObject var) {
        if (NIL != formula_pattern_match.formula_matches_pattern(conjunct, listS($$isa, var, $list_alt198))) {
            {
                SubLObject target_type = cycl_utilities.formula_arg2(conjunct, UNPROVIDED);
                if ((NIL != com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_unparseable_arg_typeP(target_type)) || (NIL != com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_no_instances_arg_typeP(target_type))) {
                    return T;
                }
            }
        }
        return NIL;
    }

    public static SubLObject rkf_sd_unparseable_prompt_litP_internal(final SubLObject conjunct, final SubLObject var) {
        if (NIL != formula_pattern_match.formula_matches_pattern(conjunct, listS($$isa, var, $list197))) {
            final SubLObject target_type = cycl_utilities.formula_arg2(conjunct, UNPROVIDED);
            if ((NIL != rkf_unparseable_arg_typeP(target_type)) || (NIL != rkf_no_instances_arg_typeP(target_type))) {
                return T;
            }
        }
        return NIL;
    }

    public static final SubLObject rkf_sd_unparseable_prompt_litP_alt(SubLObject conjunct, SubLObject var) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_unparseable_prompt_litP_internal(conjunct, var);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym197$RKF_SD_UNPARSEABLE_PROMPT_LIT_, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym197$RKF_SD_UNPARSEABLE_PROMPT_LIT_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym197$RKF_SD_UNPARSEABLE_PROMPT_LIT_, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(conjunct, var);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw158$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (conjunct.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && var.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_unparseable_prompt_litP_internal(conjunct, var)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(conjunct, var));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject rkf_sd_unparseable_prompt_litP(final SubLObject conjunct, final SubLObject var) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return rkf_sd_unparseable_prompt_litP_internal(conjunct, var);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym196$RKF_SD_UNPARSEABLE_PROMPT_LIT_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym196$RKF_SD_UNPARSEABLE_PROMPT_LIT_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym196$RKF_SD_UNPARSEABLE_PROMPT_LIT_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(conjunct, var);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (conjunct.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && var.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(rkf_sd_unparseable_prompt_litP_internal(conjunct, var)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(conjunct, var));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject rkf_unparseable_arg_typeP_alt(SubLObject v_arg_type) {
        {
            SubLObject badP = NIL;
            if (NIL == badP) {
                {
                    SubLObject csome_list_var = $rkf_unparseable_arg_types$.getGlobalValue();
                    SubLObject bad_arg_type = NIL;
                    for (bad_arg_type = csome_list_var.first(); !((NIL != badP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , bad_arg_type = csome_list_var.first()) {
                        badP = genls.genl_in_any_mtP(v_arg_type, bad_arg_type);
                    }
                }
            }
            return badP;
        }
    }

    public static SubLObject rkf_unparseable_arg_typeP(final SubLObject v_arg_type) {
        SubLObject badP = NIL;
        if (NIL == badP) {
            SubLObject csome_list_var;
            SubLObject bad_arg_type;
            for (csome_list_var = $rkf_unparseable_arg_types$.getGlobalValue(), bad_arg_type = NIL, bad_arg_type = csome_list_var.first(); (NIL == badP) && (NIL != csome_list_var); badP = genls.genl_in_any_mtP(v_arg_type, bad_arg_type) , csome_list_var = csome_list_var.rest() , bad_arg_type = csome_list_var.first()) {
            }
        }
        return badP;
    }

    /**
     *
     *
     * @return BOOLEAN; Does ARG-TYPE not have any instances we might be able to parse to?
     */
    @LispMethod(comment = "@return BOOLEAN; Does ARG-TYPE not have any instances we might be able to parse to?")
    public static final SubLObject rkf_no_instances_arg_typeP_alt(SubLObject v_arg_type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject okP = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        if (NIL == okP) {
                            {
                                SubLObject node_var = v_arg_type;
                                SubLObject deck_type = (false) ? ((SubLObject) ($QUEUE)) : $STACK;
                                SubLObject recur_deck = deck.create_deck(deck_type);
                                {
                                    SubLObject _prev_bind_0_135 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                    try {
                                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                        {
                                            SubLObject tv_var = $$True_JustificationTruth;
                                            {
                                                SubLObject _prev_bind_0_136 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                SubLObject _prev_bind_1_137 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                try {
                                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                    if (NIL != tv_var) {
                                                        if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                            if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                {
                                                                    SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                    if (pcase_var.eql($ERROR)) {
                                                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt111$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } else {
                                                                        if (pcase_var.eql($CERROR)) {
                                                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt111$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                        } else {
                                                                            if (pcase_var.eql($WARN)) {
                                                                                Errors.warn($str_alt111$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                            } else {
                                                                                Errors.warn($str_alt116$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                                Errors.cerror($$$continue_anyway, $str_alt111$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    {
                                                        SubLObject _prev_bind_0_138 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                        SubLObject _prev_bind_1_139 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                        SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                        SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        try {
                                                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                            if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(v_arg_type, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                                {
                                                                    SubLObject _prev_bind_0_140 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                    SubLObject _prev_bind_1_141 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                    SubLObject _prev_bind_2_142 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                                        while ((NIL != node_var) && (NIL == okP)) {
                                                                            {
                                                                                SubLObject spec = node_var;
                                                                                okP = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_direct_instances_arg_typeP(spec);
                                                                            }
                                                                            {
                                                                                SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                                                                SubLObject rest = NIL;
                                                                                for (rest = accessible_modules; !((NIL != okP) || (NIL == rest)); rest = rest.rest()) {
                                                                                    {
                                                                                        SubLObject module_var = rest.first();
                                                                                        {
                                                                                            SubLObject _prev_bind_0_143 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                            SubLObject _prev_bind_1_144 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                {
                                                                                                    SubLObject node = function_terms.naut_to_nart(node_var);
                                                                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                        {
                                                                                                            SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                            if (NIL != d_link) {
                                                                                                                {
                                                                                                                    SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                    if (NIL != mt_links) {
                                                                                                                        {
                                                                                                                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                            while (!((NIL != okP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                                                                                                                                thread.resetMultipleValues();
                                                                                                                                {
                                                                                                                                    SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                    SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                        {
                                                                                                                                            SubLObject _prev_bind_0_145 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                            try {
                                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                                {
                                                                                                                                                    SubLObject iteration_state_146 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                    while (!((NIL != okP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_146)))) {
                                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                                        {
                                                                                                                                                            SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_146);
                                                                                                                                                            SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                {
                                                                                                                                                                    SubLObject _prev_bind_0_147 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                    try {
                                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                        {
                                                                                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                            SubLObject rest_148 = NIL;
                                                                                                                                                                            for (rest_148 = new_list; !((NIL != okP) || (NIL == rest_148)); rest_148 = rest_148.rest()) {
                                                                                                                                                                                {
                                                                                                                                                                                    SubLObject node_vars_link_node = rest_148.first();
                                                                                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    } finally {
                                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_147, thread);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            iteration_state_146 = dictionary_contents.do_dictionary_contents_next(iteration_state_146);
                                                                                                                                                        }
                                                                                                                                                    } 
                                                                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_146);
                                                                                                                                                }
                                                                                                                                            } finally {
                                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_145, thread);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                                }
                                                                                                                            } 
                                                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            } else {
                                                                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt119$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                            {
                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                SubLObject rest_149 = NIL;
                                                                                                                for (rest_149 = new_list; !((NIL != okP) || (NIL == rest_149)); rest_149 = rest_149.rest()) {
                                                                                                                    {
                                                                                                                        SubLObject generating_fn = rest_149.first();
                                                                                                                        {
                                                                                                                            SubLObject _prev_bind_0_150 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                            try {
                                                                                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                {
                                                                                                                                    SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                    SubLObject new_list_151 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                    SubLObject rest_152 = NIL;
                                                                                                                                    for (rest_152 = new_list_151; !((NIL != okP) || (NIL == rest_152)); rest_152 = rest_152.rest()) {
                                                                                                                                        {
                                                                                                                                            SubLObject node_vars_link_node = rest_152.first();
                                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } finally {
                                                                                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_150, thread);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } finally {
                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_144, thread);
                                                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_143, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            node_var = deck.deck_pop(recur_deck);
                                                                        } 
                                                                    } finally {
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_142, thread);
                                                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_141, thread);
                                                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_140, thread);
                                                                    }
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt120$Node__a_does_not_pass_sbhl_type_t, v_arg_type, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } finally {
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_139, thread);
                                                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_138, thread);
                                                        }
                                                    }
                                                } finally {
                                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_137, thread);
                                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_136, thread);
                                                }
                                            }
                                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                        }
                                    } finally {
                                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_135, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return makeBoolean(NIL == okP);
            }
        }
    }

    /**
     *
     *
     * @return BOOLEAN; Does ARG-TYPE not have any instances we might be able to parse to?
     */
    @LispMethod(comment = "@return BOOLEAN; Does ARG-TYPE not have any instances we might be able to parse to?")
    public static SubLObject rkf_no_instances_arg_typeP(final SubLObject v_arg_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject okP = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            if (NIL == okP) {
                SubLObject node_var = v_arg_type;
                final SubLObject deck_type = $STACK;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0_$129 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = $$True_JustificationTruth;
                        final SubLObject _prev_bind_0_$130 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$131 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str110$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str110$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($WARN)) {
                                            Errors.warn($str110$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn($str115$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str110$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        }


                            }
                            final SubLObject _prev_bind_0_$131 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$132 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(v_arg_type, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$132 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$133 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$136 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                        while ((NIL != node_var) && (NIL == okP)) {
                                            final SubLObject spec = node_var;
                                            okP = rkf_direct_instances_arg_typeP(spec);
                                            final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                            SubLObject rest;
                                            SubLObject module_var;
                                            SubLObject _prev_bind_0_$133;
                                            SubLObject _prev_bind_1_$134;
                                            SubLObject node;
                                            SubLObject d_link;
                                            SubLObject mt_links;
                                            SubLObject iteration_state;
                                            SubLObject mt;
                                            SubLObject tv_links;
                                            SubLObject _prev_bind_0_$134;
                                            SubLObject iteration_state_$140;
                                            SubLObject tv;
                                            SubLObject link_nodes;
                                            SubLObject _prev_bind_0_$135;
                                            SubLObject sol;
                                            SubLObject set_contents_var;
                                            SubLObject basis_object;
                                            SubLObject state;
                                            SubLObject node_vars_link_node;
                                            SubLObject csome_list_var;
                                            SubLObject node_vars_link_node2;
                                            SubLObject new_list;
                                            SubLObject rest_$142;
                                            SubLObject generating_fn;
                                            SubLObject _prev_bind_0_$136;
                                            SubLObject sol2;
                                            SubLObject link_nodes2;
                                            SubLObject set_contents_var2;
                                            SubLObject basis_object2;
                                            SubLObject state2;
                                            SubLObject node_vars_link_node3;
                                            SubLObject csome_list_var2;
                                            SubLObject node_vars_link_node4;
                                            for (rest = NIL, rest = accessible_modules; (NIL == okP) && (NIL != rest); rest = rest.rest()) {
                                                module_var = rest.first();
                                                _prev_bind_0_$133 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                _prev_bind_1_$134 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    node = function_terms.naut_to_nart(node_var);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link) {
                                                            mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == okP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        _prev_bind_0_$134 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            for (iteration_state_$140 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == okP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$140)); iteration_state_$140 = dictionary_contents.do_dictionary_contents_next(iteration_state_$140)) {
                                                                                thread.resetMultipleValues();
                                                                                tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$140);
                                                                                link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    _prev_bind_0_$135 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        sol = link_nodes;
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            set_contents_var = set.do_set_internal(sol);
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == okP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                if (NIL == okP) {
                                                                                                    csome_list_var = sol;
                                                                                                    node_vars_link_node2 = NIL;
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                    while ((NIL == okP) && (NIL != csome_list_var)) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                    } 
                                                                                                }
                                                                                            } else {
                                                                                                Errors.error($str118$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$135, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$140);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$134, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str119$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            for (rest_$142 = NIL, rest_$142 = new_list; (NIL == okP) && (NIL != rest_$142); rest_$142 = rest_$142.rest()) {
                                                                generating_fn = rest_$142.first();
                                                                _prev_bind_0_$136 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                    if (NIL != set.set_p(sol2)) {
                                                                        set_contents_var2 = set.do_set_internal(sol2);
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == okP) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol2.isList()) {
                                                                            if (NIL == okP) {
                                                                                csome_list_var2 = sol2;
                                                                                node_vars_link_node4 = NIL;
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                                while ((NIL == okP) && (NIL != csome_list_var2)) {
                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                    }
                                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                                } 
                                                                            }
                                                                        } else {
                                                                            Errors.error($str118$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$136, thread);
                                                                }
                                                            }
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$134, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$133, thread);
                                                }
                                            }
                                            node_var = deck.deck_pop(recur_deck);
                                        } 
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$136, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$133, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$132, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str120$Node__a_does_not_pass_sbhl_type_t, v_arg_type, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$132, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$131, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$131, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$130, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$137 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$137, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$129, thread);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return makeBoolean(NIL == okP);
    }

    public static final SubLObject rkf_direct_instances_arg_typeP_alt(SubLObject v_arg_type) {
        return makeBoolean((((NIL != kb_mapping_utilities.some_pred_value_in_any_mt(v_arg_type, $$isa, TWO_INTEGER, $TRUE)) || (NIL != kb_mapping_utilities.some_pred_value_in_any_mt(v_arg_type, $$defnSufficient, ONE_INTEGER, $TRUE))) || (NIL != kb_mapping_utilities.some_pred_value_in_any_mt(v_arg_type, $$defnIff, ONE_INTEGER, $TRUE))) || (NIL != kb_mapping_utilities.some_pred_value_in_any_mt(v_arg_type, $$resultIsa, TWO_INTEGER, $TRUE)));
    }

    public static SubLObject rkf_direct_instances_arg_typeP(final SubLObject v_arg_type) {
        return makeBoolean((((NIL != kb_mapping_utilities.some_pred_value_in_any_mt(v_arg_type, $$isa, TWO_INTEGER, $TRUE)) || (NIL != kb_mapping_utilities.some_pred_value_in_any_mt(v_arg_type, $$defnSufficient, ONE_INTEGER, $TRUE))) || (NIL != kb_mapping_utilities.some_pred_value_in_any_mt(v_arg_type, $$defnIff, ONE_INTEGER, $TRUE))) || (NIL != kb_mapping_utilities.some_pred_value_in_any_mt(v_arg_type, $$resultIsa, TWO_INTEGER, $TRUE)));
    }

    public static final SubLObject rkf_sd_prompter_find_rule_prompts_alt(SubLObject prompter) {
        {
            SubLObject rule = rkf_sd_prompter_seed_term(prompter);
            SubLObject mt = rkf_sd_prompter_mt(prompter);
            SubLObject local_terms = append(rkf_term_utilities.rkf_terms_created_in_interaction_mt(mt), isa.all_fort_instances($$CoaDiagramObject, mt, UNPROVIDED));
            SubLObject cdolist_list_var = local_terms;
            SubLObject local_term = NIL;
            for (local_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , local_term = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_153 = rkf_salient_descriptor.rkf_rule_cnfs_for_term(rule, local_term, mt);
                    SubLObject cnf_pair = NIL;
                    for (cnf_pair = cdolist_list_var_153.first(); NIL != cdolist_list_var_153; cdolist_list_var_153 = cdolist_list_var_153.rest() , cnf_pair = cdolist_list_var_153.first()) {
                        {
                            SubLObject datum = cnf_pair;
                            SubLObject current = datum;
                            SubLObject unknown_cnf = NIL;
                            SubLObject just_sentence = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt204);
                            unknown_cnf = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt204);
                            just_sentence = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                {
                                    SubLObject prompt = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompt_from_cnf(unknown_cnf, local_term);
                                    SubLObject justification = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompt_justification_from_sentence(just_sentence, mt);
                                    rkf_sd_prompt_set_justification(prompt, justification);
                                    rkf_sd_prompt_set_tactic(prompt, RKF_SD_PROMPTER_FIND_RULE_PROMPTS);
                                    com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_add_prompt(prompter, prompt);
                                    com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompt_compute_subprompts(prompt);
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt204);
                            }
                        }
                    }
                }
            }
        }
        return $DONE;
    }

    public static SubLObject rkf_sd_prompter_find_rule_prompts(final SubLObject prompter) {
        final SubLObject rule = rkf_salient_descriptor_datastructures.rkf_sd_prompter_seed_term(prompter);
        final SubLObject mt = rkf_salient_descriptor_datastructures.rkf_sd_prompter_mt(prompter);
        SubLObject cdolist_list_var;
        final SubLObject local_terms = cdolist_list_var = append(rkf_term_utilities.rkf_terms_created_in_interaction_mt(mt), isa.all_fort_instances($$CoaDiagramObject, mt, UNPROVIDED));
        SubLObject local_term = NIL;
        local_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$145 = rkf_salient_descriptor.rkf_rule_cnfs_for_term(rule, local_term, mt);
            SubLObject cnf_pair = NIL;
            cnf_pair = cdolist_list_var_$145.first();
            while (NIL != cdolist_list_var_$145) {
                SubLObject current;
                final SubLObject datum = current = cnf_pair;
                SubLObject unknown_cnf = NIL;
                SubLObject just_sentence = NIL;
                destructuring_bind_must_consp(current, datum, $list203);
                unknown_cnf = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list203);
                just_sentence = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject prompt = rkf_sd_prompt_from_cnf(unknown_cnf, local_term);
                    final SubLObject justification = rkf_sd_prompt_justification_from_sentence(just_sentence, mt);
                    rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_justification(prompt, justification);
                    rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_tactic(prompt, RKF_SD_PROMPTER_FIND_RULE_PROMPTS);
                    rkf_sd_prompter_add_prompt(prompter, prompt);
                    rkf_sd_prompt_compute_subprompts(prompt);
                } else {
                    cdestructuring_bind_error(datum, $list203);
                }
                cdolist_list_var_$145 = cdolist_list_var_$145.rest();
                cnf_pair = cdolist_list_var_$145.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            local_term = cdolist_list_var.first();
        } 
        return $DONE;
    }

    public static final SubLObject rkf_sd_prompt_justification_from_sentence_alt(SubLObject just_sentence, SubLObject mt) {
        {
            SubLObject ask_results = ask_utilities.ask_justified(just_sentence, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != cyc_kernel.closed_query_justified_success_result_p(ask_results)) {
                {
                    SubLObject result = ask_results.first();
                    SubLObject ask_justification = second(result);
                    return ask_justification;
                }
            }
        }
        return NIL;
    }

    public static SubLObject rkf_sd_prompt_justification_from_sentence(final SubLObject just_sentence, final SubLObject mt) {
        final SubLObject ask_results = ask_utilities.ask_justified(just_sentence, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != cyc_kernel.closed_query_justified_success_result_p(ask_results)) {
            final SubLObject result = ask_results.first();
            final SubLObject ask_justification = second(result);
            return ask_justification;
        }
        return NIL;
    }

    public static final SubLObject rkf_sd_prompt_from_cnf_alt(SubLObject cnf, SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject prompt = new_rkf_sd_prompt();
                thread.resetMultipleValues();
                {
                    SubLObject formula = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompt_formula_for_cnf(cnf, v_term);
                    SubLObject new_cnf = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != el_formula_p(formula)) {
                        rkf_sd_prompt_set_formula(prompt, formula);
                        _csetf_rkf_sd_prompt_deducible_cnfs(prompt, cons(new_cnf, rkf_sd_prompt_deducible_cnfs(prompt)));
                    }
                }
                return prompt;
            }
        }
    }

    public static SubLObject rkf_sd_prompt_from_cnf(final SubLObject cnf, final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject prompt = rkf_salient_descriptor_datastructures.new_rkf_sd_prompt();
        thread.resetMultipleValues();
        final SubLObject formula = rkf_sd_prompt_formula_for_cnf(cnf, v_term);
        final SubLObject new_cnf = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != el_formula_p(formula)) {
            rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_formula(prompt, formula);
            rkf_salient_descriptor_datastructures._csetf_rkf_sd_prompt_deducible_cnfs(prompt, cons(new_cnf, rkf_salient_descriptor_datastructures.rkf_sd_prompt_deducible_cnfs(prompt)));
        }
        return prompt;
    }

    public static final SubLObject rkf_sd_prompt_formula_for_cnf_alt(SubLObject cnf, SubLObject v_term) {
        {
            SubLObject neg_lits = clauses.neg_lits(cnf);
            SubLObject bound_neg_lits = list_utilities.remove_if_not(RKF_SD_EL_FULLY_BOUND_P, neg_lits, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject unbound_neg_lits = (NIL != bound_neg_lits) ? ((SubLObject) (set_difference(neg_lits, bound_neg_lits, symbol_function(EQUAL), UNPROVIDED))) : neg_lits;
            SubLObject conjunction = rkf_salient_descriptor.rkf_sd_conjoin(NIL != bound_neg_lits ? ((SubLObject) (bound_neg_lits)) : unbound_neg_lits, T, NIL);
            SubLObject formula = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompt_formula_for_lit(conjunction);
            SubLObject new_neg_lits = (NIL != bound_neg_lits) ? ((SubLObject) (unbound_neg_lits)) : NIL;
            SubLObject new_cnf = clauses.make_clause(new_neg_lits, clauses.pos_lits(cnf));
            return values(formula, new_cnf);
        }
    }

    public static SubLObject rkf_sd_prompt_formula_for_cnf(final SubLObject cnf, final SubLObject v_term) {
        final SubLObject neg_lits = clauses.neg_lits(cnf);
        final SubLObject bound_neg_lits = list_utilities.remove_if_not(RKF_SD_EL_FULLY_BOUND_P, neg_lits, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject unbound_neg_lits = (NIL != bound_neg_lits) ? set_difference(neg_lits, bound_neg_lits, symbol_function(EQUAL), UNPROVIDED) : neg_lits;
        final SubLObject conjunction = rkf_salient_descriptor.rkf_sd_conjoin(NIL != bound_neg_lits ? bound_neg_lits : unbound_neg_lits, T, NIL);
        final SubLObject formula = rkf_sd_prompt_formula_for_lit(conjunction);
        final SubLObject new_neg_lits = (NIL != bound_neg_lits) ? unbound_neg_lits : NIL;
        final SubLObject new_cnf = clauses.make_clause(new_neg_lits, clauses.pos_lits(cnf));
        return values(formula, new_cnf);
    }

    public static final SubLObject rkf_sd_prompt_formula_for_lit_alt(SubLObject lit) {
        {
            SubLObject formula = lit;
            SubLObject cdolist_list_var = sentence_free_variables(lit, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject var = NIL;
            for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                formula = make_existential(var, formula);
            }
            return formula;
        }
    }

    public static SubLObject rkf_sd_prompt_formula_for_lit(final SubLObject lit) {
        SubLObject formula = lit;
        SubLObject cdolist_list_var = sentence_free_variables(lit, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            formula = make_existential(var, formula);
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        } 
        return formula;
    }

    public static final SubLObject rkf_sd_prompter_example_instance_induced_strong_alt(SubLObject prompter) {
        return com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_example_instance_induced(prompter, $STRONG);
    }

    public static SubLObject rkf_sd_prompter_example_instance_induced_strong(final SubLObject prompter) {
        return rkf_sd_prompter_example_instance_induced(prompter, $STRONG);
    }

    public static final SubLObject rkf_sd_prompter_example_instance_induced_weak_alt(SubLObject prompter) {
        return com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_example_instance_induced(prompter, $WEAK);
    }

    public static SubLObject rkf_sd_prompter_example_instance_induced_weak(final SubLObject prompter) {
        return rkf_sd_prompter_example_instance_induced(prompter, $WEAK);
    }

    public static final SubLObject rkf_sd_prompter_example_instance_induced_alt(SubLObject prompter, SubLObject strength) {
        {
            SubLObject example_instance = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_salient_descriptor_prompter_seed_term(prompter);
            SubLObject arg1 = cycl_utilities.nat_arg1(example_instance, UNPROVIDED);
            SubLObject collection = (NIL != rkf_domain_examples.rkf_generic_example_instance_level_p(example_instance)) ? ((SubLObject) (arg1)) : make_specs_fn(arg1);
            SubLObject mt = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_salient_descriptor_prompter_mt(prompter);
            SubLObject cdolist_list_var = rkf_salient_descriptor.rkf_induced_salient_descriptor_binary_preds(mt, collection, $ISA, TEN_INTEGER, strength, UNPROVIDED);
            SubLObject cons = NIL;
            for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                {
                    SubLObject datum = cons;
                    SubLObject current = datum;
                    SubLObject binary_pred = NIL;
                    SubLObject count = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt209);
                    binary_pred = current.first();
                    current = current.rest();
                    count = current;
                    if (NIL != com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_binary_pred_ok_for_promptsP(binary_pred)) {
                        {
                            SubLObject prompt = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompt_example_instance_prompt(binary_pred, collection, mt);
                            com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_add_prompt(prompter, prompt);
                        }
                    }
                }
            }
            return $DONE;
        }
    }

    public static SubLObject rkf_sd_prompter_example_instance_induced(final SubLObject prompter, final SubLObject strength) {
        final SubLObject example_instance = rkf_salient_descriptor_prompter_seed_term(prompter);
        final SubLObject arg1 = cycl_utilities.nat_arg1(example_instance, UNPROVIDED);
        final SubLObject collection = (NIL != rkf_domain_examples.rkf_generic_example_instance_level_p(example_instance)) ? arg1 : make_specs_fn(arg1);
        final SubLObject mt = rkf_salient_descriptor_prompter_mt(prompter);
        SubLObject cdolist_list_var = rkf_salient_descriptor.rkf_induced_salient_descriptor_binary_preds(mt, collection, $ISA, TEN_INTEGER, strength, UNPROVIDED);
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject binary_pred = NIL;
            SubLObject count = NIL;
            destructuring_bind_must_consp(current, datum, $list208);
            binary_pred = current.first();
            current = count = current.rest();
            if (NIL != rkf_sd_binary_pred_ok_for_promptsP(binary_pred)) {
                final SubLObject prompt = rkf_sd_prompt_example_instance_prompt(binary_pred, collection, mt);
                rkf_sd_prompter_add_prompt(prompter, prompt);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return $DONE;
    }

    public static final SubLObject rkf_sd_prompter_example_instance_noninduced_alt(SubLObject prompter) {
        {
            SubLObject example_instance = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_salient_descriptor_prompter_seed_term(prompter);
            SubLObject collection = cycl_utilities.nat_arg1(example_instance, UNPROVIDED);
            SubLObject mt = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_salient_descriptor_prompter_mt(prompter);
            SubLObject cdolist_list_var = rkf_salient_descriptor.rkf_noninduced_salient_descriptor_binary_preds(mt, collection, $ISA);
            SubLObject binary_pred = NIL;
            for (binary_pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binary_pred = cdolist_list_var.first()) {
                if (NIL != com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_binary_pred_ok_for_promptsP(binary_pred)) {
                    {
                        SubLObject prompt = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompt_example_instance_prompt(binary_pred, collection, mt);
                        com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompter_add_prompt(prompter, prompt);
                    }
                }
            }
            return $DONE;
        }
    }

    public static SubLObject rkf_sd_prompter_example_instance_noninduced(final SubLObject prompter) {
        final SubLObject example_instance = rkf_salient_descriptor_prompter_seed_term(prompter);
        final SubLObject collection = cycl_utilities.nat_arg1(example_instance, UNPROVIDED);
        final SubLObject mt = rkf_salient_descriptor_prompter_mt(prompter);
        SubLObject cdolist_list_var = rkf_salient_descriptor.rkf_noninduced_salient_descriptor_binary_preds(mt, collection, $ISA);
        SubLObject binary_pred = NIL;
        binary_pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != rkf_sd_binary_pred_ok_for_promptsP(binary_pred)) {
                final SubLObject prompt = rkf_sd_prompt_example_instance_prompt(binary_pred, collection, mt);
                rkf_sd_prompter_add_prompt(prompter, prompt);
            }
            cdolist_list_var = cdolist_list_var.rest();
            binary_pred = cdolist_list_var.first();
        } 
        return $DONE;
    }

    public static final SubLObject rkf_sd_binary_pred_ok_for_promptsP_alt(SubLObject binary_pred) {
        if (NIL != com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_binary_pred_arg2_unparseableP(binary_pred)) {
            return NIL;
        } else {
            return T;
        }
    }

    public static SubLObject rkf_sd_binary_pred_ok_for_promptsP(final SubLObject binary_pred) {
        if (NIL != rkf_binary_pred_arg2_unparseableP(binary_pred)) {
            return NIL;
        }
        return T;
    }

    public static final SubLObject rkf_binary_pred_arg2_unparseableP_alt(SubLObject binary_pred) {
        {
            SubLObject badP = NIL;
            if (NIL == badP) {
                {
                    SubLObject csome_list_var = kb_accessors.argn_isa(binary_pred, TWO_INTEGER, UNPROVIDED);
                    SubLObject v_arg_type = NIL;
                    for (v_arg_type = csome_list_var.first(); !((NIL != badP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , v_arg_type = csome_list_var.first()) {
                        badP = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_unparseable_arg_typeP(v_arg_type);
                    }
                }
            }
            return badP;
        }
    }

    public static SubLObject rkf_binary_pred_arg2_unparseableP(final SubLObject binary_pred) {
        SubLObject badP = NIL;
        if (NIL == badP) {
            SubLObject csome_list_var;
            SubLObject v_arg_type;
            for (csome_list_var = kb_accessors.argn_isa(binary_pred, TWO_INTEGER, UNPROVIDED), v_arg_type = NIL, v_arg_type = csome_list_var.first(); (NIL == badP) && (NIL != csome_list_var); badP = rkf_unparseable_arg_typeP(v_arg_type) , csome_list_var = csome_list_var.rest() , v_arg_type = csome_list_var.first()) {
            }
        }
        return badP;
    }

    public static final SubLObject rkf_sd_prompt_example_instance_prompt_alt(SubLObject binary_pred, SubLObject collection, SubLObject mt) {
        {
            SubLObject new_prompt = new_rkf_sd_prompt();
            SubLObject v_term = rkf_domain_examples.rkf_generic_example_for_collection(collection);
            SubLObject formula = com.cyc.cycjava.cycl.rkf_salient_descriptor_prompter.rkf_sd_prompt_example_instance_sentence(binary_pred, v_term, mt);
            SubLObject rule_spec = rkf_salient_descriptor.new_rkf_salient_descriptor_rule_spec($BIN_PRED, $ISA, collection, binary_pred);
            SubLObject justification = rkf_salient_descriptor.rkf_rule_spec_supports(v_term, rule_spec, mt);
            SubLObject tactic = RKF_SD_PROMPT_EXAMPLE_INSTANCE;
            rkf_sd_prompt_set_formula(new_prompt, formula);
            rkf_sd_prompt_set_tactic(new_prompt, tactic);
            rkf_sd_prompt_set_justification(new_prompt, justification);
            return new_prompt;
        }
    }

    public static SubLObject rkf_sd_prompt_example_instance_prompt(final SubLObject binary_pred, final SubLObject collection, final SubLObject mt) {
        final SubLObject new_prompt = rkf_salient_descriptor_datastructures.new_rkf_sd_prompt();
        final SubLObject v_term = rkf_domain_examples.rkf_generic_example_for_collection(collection);
        final SubLObject formula = rkf_sd_prompt_example_instance_sentence(binary_pred, v_term, mt);
        final SubLObject rule_spec = rkf_salient_descriptor.new_rkf_salient_descriptor_rule_spec($BIN_PRED, $ISA, collection, binary_pred);
        final SubLObject justification = rkf_salient_descriptor.rkf_rule_spec_supports(v_term, rule_spec, mt);
        final SubLObject tactic = RKF_SD_PROMPT_EXAMPLE_INSTANCE;
        rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_formula(new_prompt, formula);
        rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_tactic(new_prompt, tactic);
        rkf_salient_descriptor_datastructures.rkf_sd_prompt_set_justification(new_prompt, justification);
        return new_prompt;
    }

    public static final SubLObject rkf_sd_prompt_example_instance_sentence_alt(SubLObject binary_pred, SubLObject v_term, SubLObject mt) {
        {
            SubLObject arg2_collection = rkf_concept_clarifier.rkf_salient_argn_isa(binary_pred, TWO_INTEGER, mt);
            SubLObject arg2 = rkf_domain_examples.rkf_generic_example_for_collection(arg2_collection);
            SubLObject sentence = make_binary_formula(binary_pred, cycl_utilities.hl_to_el(v_term), arg2);
            return sentence;
        }
    }

    public static SubLObject rkf_sd_prompt_example_instance_sentence(final SubLObject binary_pred, final SubLObject v_term, final SubLObject mt) {
        final SubLObject arg2_collection = rkf_concept_clarifier.rkf_salient_argn_isa(binary_pred, TWO_INTEGER, mt);
        final SubLObject arg2 = rkf_domain_examples.rkf_generic_example_for_collection(arg2_collection);
        final SubLObject sentence = make_binary_formula(binary_pred, cycl_utilities.hl_to_el(v_term), arg2);
        return sentence;
    }

    public static SubLObject declare_rkf_salient_descriptor_prompter_file() {
        declareFunction("rkf_salient_descriptor_prompter_prune_unused_prompts", "RKF-SALIENT-DESCRIPTOR-PROMPTER-PRUNE-UNUSED-PROMPTS", 1, 0, false);
        declareFunction("rkf_salient_descriptor_prompter_prompt_count", "RKF-SALIENT-DESCRIPTOR-PROMPTER-PROMPT-COUNT", 1, 0, false);
        declareFunction("rkf_salient_descriptor_prompter_note_generator_thread", "RKF-SALIENT-DESCRIPTOR-PROMPTER-NOTE-GENERATOR-THREAD", 2, 0, false);
        declareFunction("rkf_salient_descriptor_prompter_clear_generator_thread", "RKF-SALIENT-DESCRIPTOR-PROMPTER-CLEAR-GENERATOR-THREAD", 1, 0, false);
        declareFunction("rkf_salient_descriptor_candidate_p", "RKF-SALIENT-DESCRIPTOR-CANDIDATE-P", 1, 0, false);
        declareMacro("with_rkf_sd_prompter_lock_held", "WITH-RKF-SD-PROMPTER-LOCK-HELD");
        declareMacro("with_rkf_sd_prompter_memoization_state", "WITH-RKF-SD-PROMPTER-MEMOIZATION-STATE");
        declareMacro("with_rkf_sd_prompter_problem_store", "WITH-RKF-SD-PROMPTER-PROBLEM-STORE");
        declareFunction("rkf_sd_examples_for_prompt", "RKF-SD-EXAMPLES-FOR-PROMPT", 3, 0, false);
        declareFunction("rkf_sd_prompter_find_or_set_problem_store", "RKF-SD-PROMPTER-FIND-OR-SET-PROBLEM-STORE", 1, 0, false);
        declareFunction("rkf_salient_descriptor_prompter_reset_problem_store", "RKF-SALIENT-DESCRIPTOR-PROMPTER-RESET-PROBLEM-STORE", 1, 0, false);
        declareFunction("rkf_salient_descriptor_prompter_next", "RKF-SALIENT-DESCRIPTOR-PROMPTER-NEXT", 1, 1, false);
        declareFunction("rkf_salient_descriptor_prompter_finalize", "RKF-SALIENT-DESCRIPTOR-PROMPTER-FINALIZE", 1, 0, false);
        declareFunction("rkf_sd_prompter_mark_prompt_used", "RKF-SD-PROMPTER-MARK-PROMPT-USED", 2, 0, false);
        declareFunction("rkf_sd_prompter_remove_unused_prompt", "RKF-SD-PROMPTER-REMOVE-UNUSED-PROMPT", 2, 0, false);
        declareFunction("rkf_salient_descriptor_prompter_has_generator_thread_p", "RKF-SALIENT-DESCRIPTOR-PROMPTER-HAS-GENERATOR-THREAD-P", 1, 0, false);
        declareFunction("rkf_salient_descriptor_prompter_unblock_generator_thread", "RKF-SALIENT-DESCRIPTOR-PROMPTER-UNBLOCK-GENERATOR-THREAD", 1, 0, false);
        declareFunction("rkf_salient_descriptor_prompter_generate_prompt", "RKF-SALIENT-DESCRIPTOR-PROMPTER-GENERATE-PROMPT", 1, 1, false);
        declareFunction("rkf_salient_descriptor_prompter_remove_prompt", "RKF-SALIENT-DESCRIPTOR-PROMPTER-REMOVE-PROMPT", 2, 0, false);
        declareFunction("rkf_salient_descriptor_prompter_replace_prompt", "RKF-SALIENT-DESCRIPTOR-PROMPTER-REPLACE-PROMPT", 2, 0, false);
        declareFunction("rkf_salient_descriptor_prompter_mt", "RKF-SALIENT-DESCRIPTOR-PROMPTER-MT", 1, 0, false);
        declareFunction("rkf_salient_descriptor_prompter_seed_term", "RKF-SALIENT-DESCRIPTOR-PROMPTER-SEED-TERM", 1, 0, false);
        declareFunction("rkf_salient_descriptor_prompter_pop_prompt_tactic", "RKF-SALIENT-DESCRIPTOR-PROMPTER-POP-PROMPT-TACTIC", 2, 0, false);
        declareFunction("rkf_sd_prompter_prune_tactic_prompts", "RKF-SD-PROMPTER-PRUNE-TACTIC-PROMPTS", 2, 0, false);
        declareFunction("rkf_sd_prompter_prune_bad_prompts", "RKF-SD-PROMPTER-PRUNE-BAD-PROMPTS", 1, 0, false);
        declareFunction("rkf_sd_bad_promptP", "RKF-SD-BAD-PROMPT?", 1, 0, false);
        declareFunction("rkf_sd_ok_support_p", "RKF-SD-OK-SUPPORT-P", 2, 0, false);
        declareFunction("rkf_salient_descriptor_prompter_last_tactic", "RKF-SALIENT-DESCRIPTOR-PROMPTER-LAST-TACTIC", 1, 0, false);
        declareFunction("rkf_salient_descriptor_prompter_current_tactic", "RKF-SALIENT-DESCRIPTOR-PROMPTER-CURRENT-TACTIC", 1, 0, false);
        declareFunction("rkf_salient_descriptor_prompter_next_tactic", "RKF-SALIENT-DESCRIPTOR-PROMPTER-NEXT-TACTIC", 1, 0, false);
        declareFunction("rkf_salient_descriptor_prompter_current_tactic_string", "RKF-SALIENT-DESCRIPTOR-PROMPTER-CURRENT-TACTIC-STRING", 2, 0, false);
        declareFunction("rkf_salient_descriptor_prompter_next_tactic_string", "RKF-SALIENT-DESCRIPTOR-PROMPTER-NEXT-TACTIC-STRING", 2, 0, false);
        declareFunction("rkf_salient_descriptor_prompt_tactic_string", "RKF-SALIENT-DESCRIPTOR-PROMPT-TACTIC-STRING", 2, 0, false);
        declareFunction("rkf_sd_string_for_tactic", "RKF-SD-STRING-FOR-TACTIC", 2, 0, false);
        declareFunction("rkf_sd_prompter_best_prompt", "RKF-SD-PROMPTER-BEST-PROMPT", 1, 0, false);
        declareFunction("rkf_sd_prompter_update_best_prompt", "RKF-SD-PROMPTER-UPDATE-BEST-PROMPT", 1, 0, false);
        declareFunction("rkf_salient_descriptor_prompter_sorted_unused_prompts", "RKF-SALIENT-DESCRIPTOR-PROMPTER-SORTED-UNUSED-PROMPTS", 1, 0, false);
        declareFunction("rkf_sd_better_promptP", "RKF-SD-BETTER-PROMPT?", 2, 0, false);
        declareFunction("rkf_sd_prompter_knownP", "RKF-SD-PROMPTER-KNOWN?", 4, 0, false);
        declareFunction("rkf_salient_descriptor_prompter_find_prompt_by_id", "RKF-SALIENT-DESCRIPTOR-PROMPTER-FIND-PROMPT-BY-ID", 2, 0, false);
        declareFunction("rkf_sd_prompt_maybe_compute_subprompts", "RKF-SD-PROMPT-MAYBE-COMPUTE-SUBPROMPTS", 1, 0, false);
        declareFunction("rkf_sd_prompt_compute_subprompts", "RKF-SD-PROMPT-COMPUTE-SUBPROMPTS", 1, 0, false);
        declareFunction("rkf_sd_prompt_missing_examplesP", "RKF-SD-PROMPT-MISSING-EXAMPLES?", 1, 0, false);
        declareFunction("rkf_salient_descriptor_followup_prompt_via_prompter", "RKF-SALIENT-DESCRIPTOR-FOLLOWUP-PROMPT-VIA-PROMPTER", 3, 0, false);
        declareFunction("rkf_salient_descriptor_followup_prompt", "RKF-SALIENT-DESCRIPTOR-FOLLOWUP-PROMPT", 3, 0, false);
        declareFunction("positive_gaf_cnfs_p", "POSITIVE-GAF-CNFS-P", 1, 0, false);
        declareFunction("rkf_sd_prompter_add_prompt", "RKF-SD-PROMPTER-ADD-PROMPT", 2, 0, false);
        declareFunction("rkf_sd_prompter_add_to_unused_prompts", "RKF-SD-PROMPTER-ADD-TO-UNUSED-PROMPTS", 2, 0, false);
        declareFunction("rkf_sd_prompt_E", "RKF-SD-PROMPT-=", 2, 0, false);
        declareFunction("rkf_sd_prompt_formula_E", "RKF-SD-PROMPT-FORMULA-=", 2, 0, false);
        declareFunction("rkf_sd_prompter_find_prompt_by_id_string", "RKF-SD-PROMPTER-FIND-PROMPT-BY-ID-STRING", 2, 0, false);
        declareFunction("rkf_sd_prompter_find_prompt_by_id", "RKF-SD-PROMPTER-FIND-PROMPT-BY-ID", 2, 0, false);
        declareFunction("rkf_sd_prompter_prefer_promptP", "RKF-SD-PROMPTER-PREFER-PROMPT?", 4, 0, false);
        declareFunction("rkf_sd_prompt_localityG", "RKF-SD-PROMPT-LOCALITY>", 3, 0, false);
        declareFunction("rkf_sd_prompt_local_supports", "RKF-SD-PROMPT-LOCAL-SUPPORTS", 2, 0, false);
        declareFunction("rkf_sd_more_recent_supportsP", "RKF-SD-MORE-RECENT-SUPPORTS?", 2, 0, false);
        declareFunction("rkf_sd_prompt_generalityL", "RKF-SD-PROMPT-GENERALITY<", 2, 0, false);
        declareFunction("rkf_sd_sentence_generalityL", "RKF-SD-SENTENCE-GENERALITY<", 2, 0, false);
        declareFunction("rkf_sd_sentence_generality", "RKF-SD-SENTENCE-GENERALITY", 1, 0, false);
        declareFunction("rkf_sd_terms_generality", "RKF-SD-TERMS-GENERALITY", 1, 0, false);
        declareFunction("rkf_sd_term_generality", "RKF-SD-TERM-GENERALITY", 1, 0, false);
        declareFunction("rkf_sd_prompt_fewer_lits_p", "RKF-SD-PROMPT-FEWER-LITS-P", 2, 0, false);
        declareFunction("rkf_sd_prompt_min_lit_count", "RKF-SD-PROMPT-MIN-LIT-COUNT", 1, 0, false);
        declareFunction("rkf_sd_cnf_lit_count", "RKF-SD-CNF-LIT-COUNT", 1, 0, false);
        declareMacro("with_rkf_salient_descriptor_seed_term_tactics_table", "WITH-RKF-SALIENT-DESCRIPTOR-SEED-TERM-TACTICS-TABLE");
        declareFunction("rkf_sd_prompter_tactics_for_seed_term_type", "RKF-SD-PROMPTER-TACTICS-FOR-SEED-TERM-TYPE", 1, 0, false);
        declareFunction("rkf_sd_prompter_compute_seed_term_type", "RKF-SD-PROMPTER-COMPUTE-SEED-TERM-TYPE", 1, 0, false);
        declareFunction("formula_template_fort_for_rkf_salient_descriptor_prompt", "FORMULA-TEMPLATE-FORT-FOR-RKF-SALIENT-DESCRIPTOR-PROMPT", 2, 0, false);
        declareFunction("find_or_create_formula_template_fort", "FIND-OR-CREATE-FORMULA-TEMPLATE-FORT", 6, 0, false);
        declareFunction("formula_template_definitional_properties", "FORMULA-TEMPLATE-DEFINITIONAL-PROPERTIES", 7, 0, false);
        declareFunction("rkf_sd_fet_data_assert_mt", "RKF-SD-FET-DATA-ASSERT-MT", 2, 0, false);
        declareFunction("rkf_sd_fet_find_match", "RKF-SD-FET-FIND-MATCH", 1, 1, false);
        declareFunction("rkf_sd_fet_assert", "RKF-SD-FET-ASSERT", 1, 0, false);
        declareFunction("rkf_sd_new_formula_template_fort", "RKF-SD-NEW-FORMULA-TEMPLATE-FORT", 1, 0, false);
        declareFunction("rkf_sd_candidate_replacement_info", "RKF-SD-CANDIDATE-REPLACEMENT-INFO", 2, 0, false);
        declareFunction("rkf_sd_prompt_get_var_arg_positions", "RKF-SD-PROMPT-GET-VAR-ARG-POSITIONS", 2, 0, false);
        declareFunction("rkf_sd_prompt_get_precedent_example_sentences", "RKF-SD-PROMPT-GET-PRECEDENT-EXAMPLE-SENTENCES", 2, 0, false);
        declareFunction("rkf_sd_single_entry_promptP", "RKF-SD-SINGLE-ENTRY-PROMPT?", 2, 0, false);
        declareFunction("rkf_sd_hide_specs_fn_replacements", "RKF-SD-HIDE-SPECS-FN-REPLACEMENTS", 1, 0, false);
        declareFunction("prune_rkf_sd_formula_template_topic", "PRUNE-RKF-SD-FORMULA-TEMPLATE-TOPIC", 1, 0, false);
        declareFunction("focal_term_type_has_template_with_bin_predP", "FOCAL-TERM-TYPE-HAS-TEMPLATE-WITH-BIN-PRED?", 2, 0, false);
        declareFunction("rkf_induced_salient_descriptor_prompts_for_focal_term_type", "RKF-INDUCED-SALIENT-DESCRIPTOR-PROMPTS-FOR-FOCAL-TERM-TYPE", 2, 0, false);
        declareFunction("rkf_salient_descriptor_prompts_for_focal_term_type", "RKF-SALIENT-DESCRIPTOR-PROMPTS-FOR-FOCAL-TERM-TYPE", 2, 0, false);
        declareFunction("rkf_sd_prompter_apply_tactics", "RKF-SD-PROMPTER-APPLY-TACTICS", 1, 0, false);
        declareFunction("rkf_sd_prompter_exhausted_p", "RKF-SD-PROMPTER-EXHAUSTED-P", 1, 0, false);
        declareFunction("rkf_sd_prompter_tactics_exhausted_p", "RKF-SD-PROMPTER-TACTICS-EXHAUSTED-P", 1, 0, false);
        declareFunction("rkf_sd_prompter_tactics_next", "RKF-SD-PROMPTER-TACTICS-NEXT", 1, 0, false);
        declareFunction("rkf_sd_prompter_apply_tactic", "RKF-SD-PROMPTER-APPLY-TACTIC", 2, 0, false);
        declareMacro("with_sd_tactic_disabled_for_seed_term_type", "WITH-SD-TACTIC-DISABLED-FOR-SEED-TERM-TYPE");
        declareMacro("with_sd_tactics_disabled_for_seed_term_type", "WITH-SD-TACTICS-DISABLED-FOR-SEED-TERM-TYPE");
        declareFunction("rkf_sd_prompter_suggestion", "RKF-SD-PROMPTER-SUGGESTION", 1, 0, false);
        declareFunction("rkf_sd_prompter_required", "RKF-SD-PROMPTER-REQUIRED", 1, 0, false);
        declareFunction("rkf_sd_prompter_interaction_context_required", "RKF-SD-PROMPTER-INTERACTION-CONTEXT-REQUIRED", 1, 0, false);
        declareFunction("rkf_sd_prompter_interaction_context_strong", "RKF-SD-PROMPTER-INTERACTION-CONTEXT-STRONG", 1, 0, false);
        declareFunction("rkf_sd_prompter_add_ke_driven_prompts", "RKF-SD-PROMPTER-ADD-KE-DRIVEN-PROMPTS", 2, 0, false);
        declareFunction("rkf_sd_prompter_ke_driven_prompt_fodder", "RKF-SD-PROMPTER-KE-DRIVEN-PROMPT-FODDER", 2, 0, false);
        declareFunction("rkf_sd_prompter_update_ke_driven_prompts", "RKF-SD-PROMPTER-UPDATE-KE-DRIVEN-PROMPTS", 3, 0, false);
        declareFunction("rkf_sd_prompter_compute_ke_driven_prompt_fodder", "RKF-SD-PROMPTER-COMPUTE-KE-DRIVEN-PROMPT-FODDER", 2, 0, false);
        declareFunction("rkf_sd_prompter_iterative_prompt_method_p", "RKF-SD-PROMPTER-ITERATIVE-PROMPT-METHOD-P", 1, 0, false);
        declareFunction("rkf_sd_prompter_get_ke_driven_prompt_formulas", "RKF-SD-PROMPTER-GET-KE-DRIVEN-PROMPT-FORMULAS", 2, 0, false);
        declareFunction("rkf_sd_suppress_formula_for_seed_termP", "RKF-SD-SUPPRESS-FORMULA-FOR-SEED-TERM?", 4, 0, false);
        declareFunction("rkf_sd_suppress_formula_threshold", "RKF-SD-SUPPRESS-FORMULA-THRESHOLD", 3, 0, false);
        declareFunction("rkf_sd_suppress_formula_threshold_for_property_internal", "RKF-SD-SUPPRESS-FORMULA-THRESHOLD-FOR-PROPERTY-INTERNAL", 2, 3, false);
        declareFunction("rkf_sd_suppress_formula_threshold_for_property", "RKF-SD-SUPPRESS-FORMULA-THRESHOLD-FOR-PROPERTY", 2, 3, false);
        declareFunction("rkf_sd_suppress_formula_test_query", "RKF-SD-SUPPRESS-FORMULA-TEST-QUERY", 3, 0, false);
        declareFunction("rkf_sd_prompter_ke_driven_inference_and_var", "RKF-SD-PROMPTER-KE-DRIVEN-INFERENCE-AND-VAR", 2, 0, false);
        declareFunction("rkf_sd_prompter_analogize", "RKF-SD-PROMPTER-ANALOGIZE", 1, 0, false);
        declareFunction("rkf_sd_prompter_get_analogous_terms", "RKF-SD-PROMPTER-GET-ANALOGOUS-TERMS", 1, 0, false);
        declareFunction("rkf_sd_prompter_clear_analogous_terms", "RKF-SD-PROMPTER-CLEAR-ANALOGOUS-TERMS", 1, 0, false);
        declareFunction("rkf_sd_prompter_add_analogy_prompt", "RKF-SD-PROMPTER-ADD-ANALOGY-PROMPT", 3, 0, false);
        declareFunction("rkf_sd_prompt_add_analogy_examples", "RKF-SD-PROMPT-ADD-ANALOGY-EXAMPLES", 4, 0, false);
        declareFunction("rkf_sd_prompter_loosen_analogy_formula", "RKF-SD-PROMPTER-LOOSEN-ANALOGY-FORMULA", 2, 0, false);
        declareFunction("rkf_sd_prompter_uneditable_analogy_argP", "RKF-SD-PROMPTER-UNEDITABLE-ANALOGY-ARG?", 2, 0, false);
        declareFunction("rkf_sd_prompter_analogy_var", "RKF-SD-PROMPTER-ANALOGY-VAR", 2, 0, false);
        declareFunction("rkf_sd_prompter_get_analogy_suggestions", "RKF-SD-PROMPTER-GET-ANALOGY-SUGGESTIONS", 2, 0, false);
        declareFunction("rkf_sd_prompter_clear_analogy_suggestions", "RKF-SD-PROMPTER-CLEAR-ANALOGY-SUGGESTIONS", 1, 0, false);
        declareFunction("rkf_sd_analogy_justifications", "RKF-SD-ANALOGY-JUSTIFICATIONS", 4, 0, false);
        declareFunction("rkf_sd_prompter_rules_for_term", "RKF-SD-PROMPTER-RULES-FOR-TERM", 1, 0, false);
        declareFunction("rkf_sd_prompter_rule_table_pop", "RKF-SD-PROMPTER-RULE-TABLE-POP", 1, 0, false);
        declareFunction("rkf_sd_prompter_rule_table", "RKF-SD-PROMPTER-RULE-TABLE", 2, 0, false);
        declareFunction("rkf_sd_sort_rule_tuples", "RKF-SD-SORT-RULE-TUPLES", 1, 0, false);
        declareFunction("rkf_sd_remove_low_scoring_tuples", "RKF-SD-REMOVE-LOW-SCORING-TUPLES", 1, 0, false);
        declareFunction("rkf_sd_low_scoring_tuple_p", "RKF-SD-LOW-SCORING-TUPLE-P", 1, 0, false);
        declareFunction("rkf_sd_score_rule_tuples", "RKF-SD-SCORE-RULE-TUPLES", 1, 0, false);
        declareFunction("rkf_sd_get_other_rules", "RKF-SD-GET-OTHER-RULES", 4, 0, false);
        declareFunction("rkf_sd_get_isa_rules", "RKF-SD-GET-ISA-RULES", 5, 0, false);
        declareFunction("rkf_sd_get_genls_rules", "RKF-SD-GET-GENLS-RULES", 5, 0, false);
        declareFunction("rkf_sd_rule_tuple_E", "RKF-SD-RULE-TUPLE-=", 2, 0, false);
        declareFunction("rkf_sd_score_rule_tuple", "RKF-SD-SCORE-RULE-TUPLE", 1, 0, false);
        declareFunction("rkf_sd_prefer_rule_tupleP", "RKF-SD-PREFER-RULE-TUPLE?", 2, 0, false);
        declareFunction("rkf_sd_rule_info_score_G", "RKF-SD-RULE-INFO-SCORE->", 2, 0, false);
        declareFunction("rkf_sd_rule_score_do_test", "RKF-SD-RULE-SCORE-DO-TEST", 3, 0, false);
        declareFunction("rkf_sd_rst_seed_term_in_pos_lits", "RKF-SD-RST-SEED-TERM-IN-POS-LITS", 2, 0, false);
        declareFunction("rkf_sd_rst_seed_term_in_neg_lits", "RKF-SD-RST-SEED-TERM-IN-NEG-LITS", 2, 0, false);
        declareFunction("rkf_sd_rst_var_count", "RKF-SD-RST-VAR-COUNT", 2, 0, false);
        declareFunction("rkf_sd_rst_neg_lit_count", "RKF-SD-RST-NEG-LIT-COUNT", 2, 0, false);
        declareFunction("rkf_sd_rst_pos_lit_count", "RKF-SD-RST-POS-LIT-COUNT", 2, 0, false);
        declareFunction("rkf_sd_rst_mt_generality", "RKF-SD-RST-MT-GENERALITY", 2, 0, false);
        declareFunction("rkf_sd_rst_pos_lit_quality", "RKF-SD-RST-POS-LIT-QUALITY", 2, 0, false);
        declareFunction("rkf_sd_tuple_mt_generality", "RKF-SD-TUPLE-MT-GENERALITY", 1, 0, false);
        declareFunction("rkf_sd_cnf_rule_count", "RKF-SD-CNF-RULE-COUNT", 1, 0, false);
        declareFunction("rkf_sd_el_cnf_from_rule_tuple", "RKF-SD-EL-CNF-FROM-RULE-TUPLE", 1, 0, false);
        declareFunction("rkf_sd_gaf_okP", "RKF-SD-GAF-OK?", 1, 0, false);
        declareFunction("rkf_sd_gaf_generality_okP", "RKF-SD-GAF-GENERALITY-OK?", 1, 0, false);
        declareFunction("rkf_sd_term_too_generalP", "RKF-SD-TERM-TOO-GENERAL?", 1, 0, false);
        declareFunction("rkf_sd_gaf_rule_bindings", "RKF-SD-GAF-RULE-BINDINGS", 3, 1, false);
        declareFunction("rkf_sd_gaf_lit_rule_bindings", "RKF-SD-GAF-LIT-RULE-BINDINGS", 3, 1, false);
        declareFunction("rkf_sd_subprompts_matches_cnfP", "RKF-SD-SUBPROMPTS-MATCHES-CNF?", 2, 0, false);
        declareFunction("rkf_sd_assert_sentence_matches_cnfP", "RKF-SD-ASSERT-SENTENCE-MATCHES-CNF?", 2, 0, false);
        declareFunction("rkf_sd_assert_sentence_matches_neg_litP", "RKF-SD-ASSERT-SENTENCE-MATCHES-NEG-LIT?", 2, 0, false);
        declareFunction("rkf_sd_prompter_strong", "RKF-SD-PROMPTER-STRONG", 1, 0, false);
        declareFunction("rkf_sd_prompter_induced", "RKF-SD-PROMPTER-INDUCED", 1, 0, false);
        declareFunction("rkf_sd_prompter_weak", "RKF-SD-PROMPTER-WEAK", 1, 0, false);
        declareFunction("rkf_sd_prompter_compute_subpromptss", "RKF-SD-PROMPTER-COMPUTE-SUBPROMPTSS", 1, 0, false);
        declareFunction("rkf_sd_prompt_bad_subpromptsP", "RKF-SD-PROMPT-BAD-SUBPROMPTS?", 2, 0, false);
        declareFunction("rkf_sd_not_assertible_subpromptsP_internal", "RKF-SD-NOT-ASSERTIBLE-SUBPROMPTS?-INTERNAL", 1, 0, false);
        declareFunction("rkf_sd_not_assertible_subpromptsP", "RKF-SD-NOT-ASSERTIBLE-SUBPROMPTS?", 1, 0, false);
        declareFunction("rkf_sd_unparseable_subpromptsP_internal", "RKF-SD-UNPARSEABLE-SUBPROMPTS?-INTERNAL", 1, 0, false);
        declareFunction("rkf_sd_unparseable_subpromptsP", "RKF-SD-UNPARSEABLE-SUBPROMPTS?", 1, 0, false);
        declareFunction("rkf_sd_unparseable_prompt_litP_internal", "RKF-SD-UNPARSEABLE-PROMPT-LIT?-INTERNAL", 2, 0, false);
        declareFunction("rkf_sd_unparseable_prompt_litP", "RKF-SD-UNPARSEABLE-PROMPT-LIT?", 2, 0, false);
        declareFunction("rkf_unparseable_arg_typeP", "RKF-UNPARSEABLE-ARG-TYPE?", 1, 0, false);
        declareFunction("rkf_no_instances_arg_typeP", "RKF-NO-INSTANCES-ARG-TYPE?", 1, 0, false);
        declareFunction("rkf_direct_instances_arg_typeP", "RKF-DIRECT-INSTANCES-ARG-TYPE?", 1, 0, false);
        declareFunction("rkf_sd_prompter_find_rule_prompts", "RKF-SD-PROMPTER-FIND-RULE-PROMPTS", 1, 0, false);
        declareFunction("rkf_sd_prompt_justification_from_sentence", "RKF-SD-PROMPT-JUSTIFICATION-FROM-SENTENCE", 2, 0, false);
        declareFunction("rkf_sd_prompt_from_cnf", "RKF-SD-PROMPT-FROM-CNF", 2, 0, false);
        declareFunction("rkf_sd_prompt_formula_for_cnf", "RKF-SD-PROMPT-FORMULA-FOR-CNF", 2, 0, false);
        declareFunction("rkf_sd_prompt_formula_for_lit", "RKF-SD-PROMPT-FORMULA-FOR-LIT", 1, 0, false);
        declareFunction("rkf_sd_prompter_example_instance_induced_strong", "RKF-SD-PROMPTER-EXAMPLE-INSTANCE-INDUCED-STRONG", 1, 0, false);
        declareFunction("rkf_sd_prompter_example_instance_induced_weak", "RKF-SD-PROMPTER-EXAMPLE-INSTANCE-INDUCED-WEAK", 1, 0, false);
        declareFunction("rkf_sd_prompter_example_instance_induced", "RKF-SD-PROMPTER-EXAMPLE-INSTANCE-INDUCED", 2, 0, false);
        declareFunction("rkf_sd_prompter_example_instance_noninduced", "RKF-SD-PROMPTER-EXAMPLE-INSTANCE-NONINDUCED", 1, 0, false);
        declareFunction("rkf_sd_binary_pred_ok_for_promptsP", "RKF-SD-BINARY-PRED-OK-FOR-PROMPTS?", 1, 0, false);
        declareFunction("rkf_binary_pred_arg2_unparseableP", "RKF-BINARY-PRED-ARG2-UNPARSEABLE?", 1, 0, false);
        declareFunction("rkf_sd_prompt_example_instance_prompt", "RKF-SD-PROMPT-EXAMPLE-INSTANCE-PROMPT", 3, 0, false);
        declareFunction("rkf_sd_prompt_example_instance_sentence", "RKF-SD-PROMPT-EXAMPLE-INSTANCE-SENTENCE", 3, 0, false);
        return NIL;
    }

    public static final SubLObject init_rkf_salient_descriptor_prompter_file_alt() {
        deflexical("*RKF-SD-STRINGS-FOR-TACTICS*", $list_alt29);
        defparameter("*RKF-PROMPTER-SORT-PROMPTER*", NIL);
        defparameter("*RKF-SD-SEED-TERM-TACTICS-TABLE*", $list_alt49);
        defparameter("*RKF-SD-SUPPRESS-RARELY-KNOWN-PROMPT-FORMULAS?*", T);
        defparameter("*RKF-SD-SUPPRESS-FORMULA-PERCENT-MIN*", ONE_INTEGER);
        defparameter("*RKF-SD-SUPPRESS-FORMULA-COUNT-MIN*", TWO_INTEGER);
        defparameter("*RKF-SD-SEED-TERM*", NIL);
        deflexical("*RKF-SD-RULE-SCORE-TESTS*", $list_alt187);
        defconstant("*RKF-UNPARSEABLE-ARG-TYPES*", $list_alt199);
        return NIL;
    }

    public static SubLObject init_rkf_salient_descriptor_prompter_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*RKF-SD-STRINGS-FOR-TACTICS*", $list28);
            defparameter("*RKF-PROMPTER-SORT-PROMPTER*", NIL);
            defparameter("*RKF-SD-SEED-TERM-TACTICS-TABLE*", $list48);
            defparameter("*RKF-SD-SUPPRESS-RARELY-KNOWN-PROMPT-FORMULAS?*", T);
            defparameter("*RKF-SD-SUPPRESS-FORMULA-PERCENT-MIN*", ONE_INTEGER);
            defparameter("*RKF-SD-SUPPRESS-FORMULA-COUNT-MIN*", TWO_INTEGER);
            defparameter("*RKF-SD-SEED-TERM*", NIL);
            deflexical("*RKF-SD-RULE-SCORE-TESTS*", $list186);
            defconstant("*RKF-UNPARSEABLE-ARG-TYPES*", $list198);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*RKF-SD-STRINGS-FOR-TACTICS*", $list_alt29);
            defparameter("*RKF-SD-SEED-TERM-TACTICS-TABLE*", $list_alt49);
            deflexical("*RKF-SD-RULE-SCORE-TESTS*", $list_alt187);
            defconstant("*RKF-UNPARSEABLE-ARG-TYPES*", $list_alt199);
        }
        return NIL;
    }

    public static SubLObject init_rkf_salient_descriptor_prompter_file_Previous() {
        deflexical("*RKF-SD-STRINGS-FOR-TACTICS*", $list28);
        defparameter("*RKF-PROMPTER-SORT-PROMPTER*", NIL);
        defparameter("*RKF-SD-SEED-TERM-TACTICS-TABLE*", $list48);
        defparameter("*RKF-SD-SUPPRESS-RARELY-KNOWN-PROMPT-FORMULAS?*", T);
        defparameter("*RKF-SD-SUPPRESS-FORMULA-PERCENT-MIN*", ONE_INTEGER);
        defparameter("*RKF-SD-SUPPRESS-FORMULA-COUNT-MIN*", TWO_INTEGER);
        defparameter("*RKF-SD-SEED-TERM*", NIL);
        deflexical("*RKF-SD-RULE-SCORE-TESTS*", $list186);
        defconstant("*RKF-UNPARSEABLE-ARG-TYPES*", $list198);
        return NIL;
    }

    public static final SubLObject setup_rkf_salient_descriptor_prompter_file_alt() {
        register_macro_helper(RKF_SD_PROMPTER_FIND_OR_SET_PROBLEM_STORE, WITH_RKF_SD_PROMPTER_PROBLEM_STORE);
        memoization_state.note_memoized_function(RKF_SD_SUPPRESS_FORMULA_THRESHOLD_FOR_PROPERTY);
        memoization_state.note_memoized_function($sym195$RKF_SD_NOT_ASSERTIBLE_SUBPROMPTS_);
        memoization_state.note_memoized_function($sym196$RKF_SD_UNPARSEABLE_SUBPROMPTS_);
        memoization_state.note_memoized_function($sym197$RKF_SD_UNPARSEABLE_PROMPT_LIT_);
        return NIL;
    }

    public static SubLObject setup_rkf_salient_descriptor_prompter_file() {
        if (SubLFiles.USE_V1) {
            register_macro_helper(RKF_SD_PROMPTER_FIND_OR_SET_PROBLEM_STORE, WITH_RKF_SD_PROMPTER_PROBLEM_STORE);
            memoization_state.note_memoized_function(RKF_SD_SUPPRESS_FORMULA_THRESHOLD_FOR_PROPERTY);
            memoization_state.note_memoized_function($sym194$RKF_SD_NOT_ASSERTIBLE_SUBPROMPTS_);
            memoization_state.note_memoized_function($sym195$RKF_SD_UNPARSEABLE_SUBPROMPTS_);
            memoization_state.note_memoized_function($sym196$RKF_SD_UNPARSEABLE_PROMPT_LIT_);
        }
        if (SubLFiles.USE_V2) {
            memoization_state.note_memoized_function($sym195$RKF_SD_NOT_ASSERTIBLE_SUBPROMPTS_);
            memoization_state.note_memoized_function($sym196$RKF_SD_UNPARSEABLE_SUBPROMPTS_);
            memoization_state.note_memoized_function($sym197$RKF_SD_UNPARSEABLE_PROMPT_LIT_);
        }
        return NIL;
    }

    public static SubLObject setup_rkf_salient_descriptor_prompter_file_Previous() {
        register_macro_helper(RKF_SD_PROMPTER_FIND_OR_SET_PROBLEM_STORE, WITH_RKF_SD_PROMPTER_PROBLEM_STORE);
        memoization_state.note_memoized_function(RKF_SD_SUPPRESS_FORMULA_THRESHOLD_FOR_PROPERTY);
        memoization_state.note_memoized_function($sym194$RKF_SD_NOT_ASSERTIBLE_SUBPROMPTS_);
        memoization_state.note_memoized_function($sym195$RKF_SD_UNPARSEABLE_SUBPROMPTS_);
        memoization_state.note_memoized_function($sym196$RKF_SD_UNPARSEABLE_PROMPT_LIT_);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_rkf_salient_descriptor_prompter_file();
    }

    @Override
    public void initializeVariables() {
        init_rkf_salient_descriptor_prompter_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rkf_salient_descriptor_prompter_file();
    }

    

    static private final SubLList $list_alt3 = list(list(makeSymbol("PROMPTER"), makeSymbol("WHOSTATE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt7 = list($LOCK);

    static private final SubLList $list_alt10 = list(list(makeSymbol("PROMPTER")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt12 = list(makeKeyword("MEMOIZATION-STATE"), list(makeSymbol("CURRENT-MEMOIZATION-STATE")));

    static private final SubLString $str_alt22$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    static private final SubLList $list_alt29 = list(new SubLObject[]{ cons(makeSymbol("RKF-SD-PROMPTER-RULES-FOR-TERM"), makeString("Rules for Term")), cons(makeSymbol("RKF-SD-PROMPTER-ANALOGIZE"), makeString("Analogy")), cons(makeSymbol("RKF-SD-PROMPTER-INDUCED"), makeString("Induced Interview Questions")), cons(makeSymbol("RKF-SD-PROMPTER-COMPUTE-SUBPROMPTSS"), makeString("Flesh out Precomputed Questions")), cons(makeSymbol("RKF-SD-PROMPTER-REQUIRED"), makeString("Required Knowledge")), cons(makeSymbol("RKF-SD-PROMPTER-STRONG"), makeString("Strong Suggestions")), cons(makeSymbol("RKF-SD-PROMPTER-WEAK"), makeString("Weak Suggestions")), cons(makeSymbol("RKF-INTERACTION-CONTEXT-REQUIRED"), makeString("Required Interaction Context Refinements")), cons(makeSymbol("RKF-INTERACTION-CONTEXT-STRONG"), makeString("Strongly Suggested Interaction Context Refinements")), cons(makeSymbol("FOLLOW-UP"), makeString("Follow-up Prompt")) });

    static private final SubLSymbol $sym33$RKF_SD_BETTER_PROMPT_ = makeSymbol("RKF-SD-BETTER-PROMPT?");

    static private final SubLList $list_alt37 = list(makeSymbol("NEG-LITS"), makeSymbol("POS-LITS"));

    static private final SubLSymbol $sym38$EL_VAR_ = makeSymbol("EL-VAR?");

    static private final SubLSymbol $sym47$_ = makeSymbol("+");

    static private final SubLList $list_alt49 = list(list($FORT, makeSymbol("RKF-SD-PROMPTER-SUGGESTION"), makeSymbol("RKF-SD-PROMPTER-ANALOGIZE"), makeSymbol("RKF-SD-PROMPTER-RULES-FOR-TERM"), makeSymbol("RKF-SD-PROMPTER-INDUCED")), list(makeKeyword("EXAMPLE-INSTANCE"), makeSymbol("RKF-SD-PROMPTER-SUGGESTION"), makeSymbol("RKF-SD-PROMPTER-EXAMPLE-INSTANCE-NONINDUCED"), makeSymbol("RKF-SD-PROMPTER-EXAMPLE-INSTANCE-INDUCED-STRONG"), makeSymbol("RKF-SD-PROMPTER-EXAMPLE-INSTANCE-INDUCED-WEAK")), list(makeKeyword("GAF")), list(makeKeyword("MT"), makeSymbol("RKF-SD-PROMPTER-INTERACTION-CONTEXT-REQUIRED"), makeSymbol("RKF-SD-PROMPTER-INTERACTION-CONTEXT-STRONG")), list($RULE, makeSymbol("RKF-SD-PROMPTER-FIND-RULE-PROMPTS")));

    static private final SubLList $list_alt50 = list(list(makeSymbol("TABLE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt53 = list(makeSymbol("ALIST-P"));

    static private final SubLString $str_alt62$Couldn_t_find__S_in__S_ = makeString("Couldn't find ~S in ~S.");

    public static final SubLObject $const64$focalTermPositionForFormulaTempla = reader_make_constant_shell("focalTermPositionForFormulaTemplate");

    static private final SubLList $list_alt68 = cons(makeSymbol("ARG-POS"), makeSymbol("INFO"));

    static private final SubLList $list_alt69 = list(makeSymbol("GLOSS"), makeSymbol("COLLECTION"), makeSymbol("EXPLANATION"));

    public static final SubLObject $const71$templateReplacementsInvisibleForP = reader_make_constant_shell("templateReplacementsInvisibleForPosition");

    static private final SubLSymbol $sym82$_MT = makeSymbol("?MT");

    static private final SubLList $list_alt90 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER);

    static private final SubLList $list_alt94 = list(reader_make_constant_shell("FormulaTemplate"));

    static private final SubLString $str_alt96$constantNameAutoGeneratedFromColl = makeString("constantNameAutoGeneratedFromCollection");

    public static final SubLObject $const102$focalTermTypeForInducedTemplateTy = reader_make_constant_shell("focalTermTypeForInducedTemplateType");

    static private final SubLString $str_alt111$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $str_alt116$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    static private final SubLString $str_alt118$Redundant_with__S_____S_on__S = makeString("Redundant with ~S:~% ~S on ~S");

    static private final SubLString $str_alt119$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    static private final SubLString $str_alt120$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    static private final SubLList $list_alt121 = list(reader_make_constant_shell("isa"), reader_make_constant_shell("formulaTemplateHasType"));

    static private final SubLString $str_alt122$Hey_ho___S_has_got_to_go___ = makeString("Hey ho. ~S has got to go.~%");

    static private final SubLList $list_alt124 = list(list(makeKeyword("EXAMPLE-INSTANCE"), makeSymbol("RKF-SD-PROMPTER-EXAMPLE-INSTANCE-INDUCED-STRONG"), makeSymbol("RKF-SD-PROMPTER-EXAMPLE-INSTANCE-INDUCED-WEAK")));

    static private final SubLList $list_alt127 = list(list(makeSymbol("SEED-TERM-TYPE"), makeSymbol("TACTIC")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt132 = list(list(makeSymbol("FUNCTION"), EQ));

    static private final SubLList $list_alt133 = list(list(makeSymbol("COPY-TREE"), makeSymbol("*RKF-SD-SEED-TERM-TACTICS-TABLE*")));

    static private final SubLList $list_alt135 = list(list(makeSymbol("SEED-TERM-TYPE"), makeSymbol("TACTICS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt138 = list(makeSymbol("NON-DOTTED-LIST-P"));

    static private final SubLList $list_alt144 = list(makeSymbol("FORMULAS"), makeSymbol("JUSTIFICATIONS"));

    static private final SubLList $list_alt149 = cons(makeSymbol("INFERENCE"), makeSymbol("FORMULA-VAR"));

    static private final SubLString $str_alt150$Timed_out_after__S_seconds_gettin = makeString("Timed out after ~S seconds getting ~S for ~S.~%");

    static private final SubLString $str_alt152$P_A_D__getting__S_for__S___ = makeString("P.A.D. getting ~S for ~S.~%");

    static private final SubLString $str_alt154$_S_is_not_continuable____Exit_con = makeString("~S is not continuable.~% Exit condition: ~S~%");

    static private final SubLString $str_alt156$Suppressing_SD_prompt_for__S_____ = makeString("Suppressing SD prompt for ~S:~% ~S~% Couldn't find the minimum ~S similar terms about which that is known.~%");

    public static final SubLSymbol $kw158$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLList $list_alt160 = list(NIL);

    static private final SubLList $list_alt161 = cons(makeSymbol("INFERENCE"), makeSymbol("VAR"));

    static private final SubLSymbol $sym162$_FORMULA = makeSymbol("?FORMULA");

    static private final SubLList $list_alt163 = list(makeSymbol("BINDINGS"), makeSymbol("SUPPORTS"));

    static private final SubLSymbol $sym164$_SOURCE_TERM = makeSymbol("?SOURCE-TERM");

    static private final SubLList $list_alt167 = list(makeSymbol("SOURCE-JUSTIFICATION"), makeSymbol("UNKNOWN-JUSTIFICATION"));

    static private final SubLSymbol $sym170$_X = makeSymbol("?X");

    public static final SubLSymbol $kw173$USE_RULES_ = makeKeyword("USE-RULES?");

    static private final SubLSymbol $sym177$EL_EXPRESSION_EQUAL_ = makeSymbol("EL-EXPRESSION-EQUAL?");

    static private final SubLSymbol $sym181$RKF_SD_RULE_TUPLE__ = makeSymbol("RKF-SD-RULE-TUPLE-=");

    static private final SubLSymbol $sym182$RKF_SD_PREFER_RULE_TUPLE_ = makeSymbol("RKF-SD-PREFER-RULE-TUPLE?");

    static private final SubLList $list_alt185 = list(makeSymbol("GAF1"), makeSymbol("GAF-LIT1"), makeSymbol("RULE1"), makeSymbol("BINDINGS1"));

    static private final SubLList $list_alt186 = list(makeSymbol("GAF2"), makeSymbol("GAF-LIT2"), makeSymbol("RULE2"), makeSymbol("BINDINGS2"));

    static private final SubLList $list_alt187 = list(makeSymbol("RKF-SD-RST-SEED-TERM-IN-POS-LITS"), makeSymbol("RKF-SD-RST-SEED-TERM-IN-NEG-LITS"), makeSymbol("RKF-SD-RST-VAR-COUNT"), makeSymbol("RKF-SD-RST-NEG-LIT-COUNT"), makeSymbol("RKF-SD-RST-POS-LIT-COUNT"), makeSymbol("RKF-SD-RST-MT-GENERALITY"), makeSymbol("RKF-SD-RST-POS-LIT-QUALITY"));

    static private final SubLList $list_alt190 = list(makeSymbol("GAF"), makeSymbol("GAF-LIT"), makeSymbol("RULE"), makeSymbol("BINDINGS"));

    static private final SubLSymbol $sym191$RKF_SD_TERM_TOO_GENERAL_ = makeSymbol("RKF-SD-TERM-TOO-GENERAL?");

    static private final SubLSymbol $sym195$RKF_SD_NOT_ASSERTIBLE_SUBPROMPTS_ = makeSymbol("RKF-SD-NOT-ASSERTIBLE-SUBPROMPTS?");

    static private final SubLSymbol $sym196$RKF_SD_UNPARSEABLE_SUBPROMPTS_ = makeSymbol("RKF-SD-UNPARSEABLE-SUBPROMPTS?");

    static private final SubLSymbol $sym197$RKF_SD_UNPARSEABLE_PROMPT_LIT_ = makeSymbol("RKF-SD-UNPARSEABLE-PROMPT-LIT?");

    static private final SubLList $list_alt198 = list(makeKeyword("ANYTHING"));

    static private final SubLList $list_alt199 = list(reader_make_constant_shell("SubLString"), reader_make_constant_shell("CycLAssertion"));

    static private final SubLList $list_alt204 = list(makeSymbol("UNKNOWN-CNF"), makeSymbol("JUST-SENTENCE"));

    static private final SubLList $list_alt209 = cons(makeSymbol("BINARY-PRED"), makeSymbol("COUNT"));
}

/**
 * Total time: 2896 ms
 */
