/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.define_obsolete_register;
import static com.cyc.cycjava.cycl.assertions_high.gaf_arg;
import static com.cyc.cycjava.cycl.assertions_high.gaf_arg2;
import static com.cyc.cycjava.cycl.assertions_high.gaf_predicate;
import static com.cyc.cycjava.cycl.backward.removal_ask;
import static com.cyc.cycjava.cycl.backward.removal_ask_variable;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cyc_kernel.closed_query_success_result_p;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.cycl_grammar.cycl_formula_p;
import static com.cyc.cycjava.cycl.cycl_grammar.cycl_nat_p;
import static com.cyc.cycjava.cycl.cycl_grammar.cycl_term_p;
import static com.cyc.cycjava.cycl.cycl_grammar.fast_cycl_quoted_term_p;
import static com.cyc.cycjava.cycl.czer_main.cyc_find_or_create_nart;
import static com.cyc.cycjava.cycl.czer_main.unquote_quoted_term;
import static com.cyc.cycjava.cycl.date_utilities.$start_of_1970$;
import static com.cyc.cycjava.cycl.date_utilities.universal_time_to_cycl_date;
import static com.cyc.cycjava.cycl.dictionary.dictionary_enter;
import static com.cyc.cycjava.cycl.dictionary.dictionary_lookup;
import static com.cyc.cycjava.cycl.dictionary.new_dictionary;
import static com.cyc.cycjava.cycl.dictionary_utilities.dictionary_increment;
import static com.cyc.cycjava.cycl.dictionary_utilities.sort_dictionary_by_values;
import static com.cyc.cycjava.cycl.el_utilities.cycl_subl_symbol_symbol;
import static com.cyc.cycjava.cycl.el_utilities.el_binary_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_empty_set_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_with_operator_p;
import static com.cyc.cycjava.cycl.el_utilities.el_list_items;
import static com.cyc.cycjava.cycl.el_utilities.el_list_p;
import static com.cyc.cycjava.cycl.el_utilities.el_non_empty_list_p;
import static com.cyc.cycjava.cycl.el_utilities.el_set_p;
import static com.cyc.cycjava.cycl.el_utilities.extensional_set_elements;
import static com.cyc.cycjava.cycl.el_utilities.formula_arity;
import static com.cyc.cycjava.cycl.el_utilities.formula_length;
import static com.cyc.cycjava.cycl.el_utilities.kappa_predicate_formal_args;
import static com.cyc.cycjava.cycl.el_utilities.kappa_predicate_p;
import static com.cyc.cycjava.cycl.el_utilities.kappa_predicate_query;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_el_extensional_set;
import static com.cyc.cycjava.cycl.el_utilities.make_el_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_el_list;
import static com.cyc.cycjava.cycl.el_utilities.make_el_list_recursively;
import static com.cyc.cycjava.cycl.el_utilities.make_el_set;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_formula;
import static com.cyc.cycjava.cycl.el_utilities.possibly_naut_p;
import static com.cyc.cycjava.cycl.el_utilities.relation_expressionP;
import static com.cyc.cycjava.cycl.el_utilities.replace_formula_arg;
import static com.cyc.cycjava.cycl.el_utilities.replace_formula_arg_position;
import static com.cyc.cycjava.cycl.el_utilities.unmake_binary_formula;
import static com.cyc.cycjava.cycl.html_utilities.html_align;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_simple_attribute;
import static com.cyc.cycjava.cycl.html_utilities.html_source_readability_terpri;
import static com.cyc.cycjava.cycl.html_utilities.remove_html_tags;
import static com.cyc.cycjava.cycl.html_utilities.subl_string_to_display_vector_string;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.memoization_state.$memoization_state$;
import static com.cyc.cycjava.cycl.memoization_state.caching_results;
import static com.cyc.cycjava.cycl.memoization_state.caching_state_enter_multi_key_n;
import static com.cyc.cycjava.cycl.memoization_state.caching_state_lookup;
import static com.cyc.cycjava.cycl.memoization_state.create_caching_state;
import static com.cyc.cycjava.cycl.memoization_state.memoization_state_lock;
import static com.cyc.cycjava.cycl.memoization_state.memoization_state_lookup;
import static com.cyc.cycjava.cycl.memoization_state.memoization_state_put;
import static com.cyc.cycjava.cycl.memoization_state.note_memoized_function;
import static com.cyc.cycjava.cycl.memoization_state.sxhash_calc_2;
import static com.cyc.cycjava.cycl.pph_utilities.pph_remove_html_tags;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.subl_macro_promotions.validate_tcp_connection;
import static com.cyc.cycjava.cycl.subl_promotions.open_tcp_stream_with_timeout;
import static com.cyc.cycjava.cycl.utilities_macros.register_kb_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_less;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.set_nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.search;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.fboundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.butlast;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.endp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$read_default_float_format$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava.cycl.inference.harness.prove;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_perform_subl;
import com.cyc.cycjava.cycl.owl.owl_cycl_to_xml;
import com.cyc.cycjava.cycl.rdf.rdf_uri;
import com.cyc.cycjava.cycl.rdf.rdf_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.cycjava.cycl.wordnet_import.wordnet_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
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
 * module:      EVALUATION-DEFNS
 * source file: /cyc/top/cycl/evaluation-defns.lisp
 * created:     2019/07/03 17:37:49
 */
public final class evaluation_defns extends SubLTranslatedFile implements V12 {
    public static final SubLObject unicode_naut_or_string_to_unicode_vector(SubLObject string) {
        return unicode_strings.display_to_unicode_vector(NIL != unicode_strings.ascii_string_p(string) ? ((SubLObject) (string)) : cycl_utilities.nat_arg1(string, UNPROVIDED));
    }

    public static final SubLObject strings_to_display_vector_strings(SubLObject strings) {
        {
            SubLObject display_vector_strings = copy_list(strings);
            SubLObject list_var = NIL;
            SubLObject string = NIL;
            SubLObject i = NIL;
            for (list_var = strings, string = list_var.first(), i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , string = list_var.first() , i = add(ONE_INTEGER, i)) {
                if (NIL != unicode_nauts.unicode_naut_p(string)) {
                    set_nth(i, display_vector_strings, cycl_utilities.nat_arg1(string, UNPROVIDED));
                } else {
                    set_nth(i, display_vector_strings, subl_string_to_display_vector_string(string));
                }
            }
            return display_vector_strings;
        }
    }

    /**
     * #$evaluationDefn for #$StringToSubstanceTypeFn
     *
     * @unknown bgottesm
     */
    @LispMethod(comment = "#$evaluationDefn for #$StringToSubstanceTypeFn\r\n\r\n@unknown bgottesm")
    public static final SubLObject cyc_string_to_substance_type(SubLObject formula_string) {
        {
            SubLObject substance_type = NIL;
            SubLObject ignore_errors_tag = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
                        try {
                            SubLTrampolineFile.checkType(formula_string, STRINGP);
                            {
                                SubLObject composition = chemistry_utilities.chem_parse(formula_string, T);
                                substance_type = chemistry_utilities.kb_constant_for_composition(composition, UNPROVIDED);
                                if (NIL == substance_type) {
                                    {
                                        SubLObject element_list = make_el_list(chemistry_utilities.atomic_composition_elements(composition), UNPROVIDED);
                                        SubLObject subscript_list = make_el_list(chemistry_utilities.atomic_composition_subscripts(composition), UNPROVIDED);
                                        substance_type = make_el_formula($$CompoundTypeByCompositionFn, list(element_list, subscript_list), UNPROVIDED);
                                    }
                                }
                            }
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
            }
            if (NIL != substance_type) {
                return substance_type;
            } else {
                relation_evaluation.throw_unevaluatable();
            }
        }
        return NIL;
    }

    /**
     * #$evaluationDefn for #$NameToIonicCompoundFn
     *
     * @unknown bgottesm
     */
    @LispMethod(comment = "#$evaluationDefn for #$NameToIonicCompoundFn\r\n\r\n@unknown bgottesm")
    public static final SubLObject cyc_name_to_ionic_compound(SubLObject name_string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject compound_type = NIL;
                SubLObject ignore_errors_tag = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                            try {
                                SubLTrampolineFile.checkType(name_string, STRINGP);
                                {
                                    SubLObject ion_strings = string_utilities.break_words(name_string, symbol_function(NON_SPACE_CHAR_P), UNPROVIDED);
                                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                        if (NIL == list_utilities.doubletonP(ion_strings)) {
                                            Errors.error($str_alt223$The_string_must_have_precisely_2_);
                                        }
                                    }
                                    {
                                        SubLObject cation = chemistry_utilities.kb_constant_for_cation(ion_strings.first(), UNPROVIDED);
                                        SubLObject anion = chemistry_utilities.kb_constant_for_anion(second(ion_strings));
                                        compound_type = chemistry_utilities.kb_compound_of_ions(cation, anion, $$ChemistryMt);
                                        if (NIL == compound_type) {
                                            compound_type = make_el_formula($$IonicCompoundFn, list(cation, anion), UNPROVIDED);
                                        }
                                    }
                                }
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                }
                if (NIL != compound_type) {
                    return compound_type;
                } else {
                    relation_evaluation.throw_unevaluatable();
                }
            }
            return NIL;
        }
    }

    static private final SubLString $str_alt29$ = makeString("");

    public static final SubLFile me = new evaluation_defns();



    // deflexical
    // Definitions
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $cycl_functions_used_as_evaluation_defns$ = makeSymbol("*CYCL-FUNCTIONS-USED-AS-EVALUATION-DEFNS*");

    // deflexical
    /**
     * Formulas longer than this cause more trouble than they're worth. See, e.g.
     * bug 18429.
     *
     * @unknown - Move to more general file if other cases are discovered.
     */
    @LispMethod(comment = "Formulas longer than this cause more trouble than they\'re worth. See, e.g.\r\nbug 18429.\r\n\r\n@unknown - Move to more general file if other cases are discovered.\ndeflexical\nFormulas longer than this cause more trouble than they\'re worth. See, e.g.\nbug 18429.")
    private static final SubLSymbol $max_supported_formula_arity$ = makeSymbol("*MAX-SUPPORTED-FORMULA-ARITY*");

    // defparameter
    /**
     * Determines whether #$MakeFormulaFn, #$SubstituteFormulaArgFn and
     * #$SubstituteFormulaFn take and return explicitly quoted formula
     */
    @LispMethod(comment = "Determines whether #$MakeFormulaFn, #$SubstituteFormulaArgFn and\r\n#$SubstituteFormulaFn take and return explicitly quoted formula\ndefparameter\nDetermines whether #$MakeFormulaFn, #$SubstituteFormulaArgFn and\n#$SubstituteFormulaFn take and return explicitly quoted formula")
    private static final SubLSymbol $bug_18769_switchP$ = makeSymbol("*BUG-18769-SWITCH?*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $word_strings_fn$ = makeSymbol("*WORD-STRINGS-FN*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $word_sequence_fn$ = makeSymbol("*WORD-SEQUENCE-FN*");



    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $assertions_relevant_to_string_defn_max_to_check$ = makeSymbol("*ASSERTIONS-RELEVANT-TO-STRING-DEFN-MAX-TO-CHECK*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $cyc_ordering_relation$ = makeSymbol("*CYC-ORDERING-RELATION*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $term_to_isg_table_lock$ = makeSymbol("*TERM-TO-ISG-TABLE-LOCK*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $term_to_isg_wXstart_table_lock$ = makeSymbol("*TERM-TO-ISG-W/START-TABLE-LOCK*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $term_to_isg_wXstart_table$ = makeSymbol("*TERM-TO-ISG-W/START-TABLE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(makeSymbol("ASSERTED-WHEN"));







    private static final SubLSymbol CYC_TRUE_SUBL = makeSymbol("CYC-TRUE-SUBL");

    private static final SubLSymbol CYC_DIFFERENT = makeSymbol("CYC-DIFFERENT");

    private static final SubLSymbol CYC_DIFFERENT_SYMBOLS = makeSymbol("CYC-DIFFERENT-SYMBOLS");

    private static final SubLSymbol CYC_STRING_PRECEDES = makeSymbol("CYC-STRING-PRECEDES");

    private static final SubLSymbol CYC_STRING_PRECEDES_CASE_INSENSITIVE = makeSymbol("CYC-STRING-PRECEDES-CASE-INSENSITIVE");

    private static final SubLSymbol $sym11$CHAR_ = makeSymbol("CHAR=");

    private static final SubLSymbol CYC_SUBSTRING_PREDICATE = makeSymbol("CYC-SUBSTRING-PREDICATE");

    private static final SubLSymbol CYC_SUBSTRING_CASE_INSENSITIVE_PREDICATE = makeSymbol("CYC-SUBSTRING-CASE-INSENSITIVE-PREDICATE");

    private static final SubLSymbol CYC_PREFIX_SUBSTRING = makeSymbol("CYC-PREFIX-SUBSTRING");

    private static final SubLSymbol CYC_SUFFIX_SUBSTRING = makeSymbol("CYC-SUFFIX-SUBSTRING");

    private static final SubLSymbol CYC_SUBWORD_PREDICATE = makeSymbol("CYC-SUBWORD-PREDICATE");

    private static final SubLString $str18$Could_not_find_constant__A_ = makeString("Could not find constant ~A.");

    private static final SubLString $str19$Arg1_of___FindConstantFn_must_be_ = makeString("Arg1 of #$FindConstantFn must be a string: ~A.");

    private static final SubLSymbol CYC_FIND_CONSTANT = makeSymbol("CYC-FIND-CONSTANT");



    private static final SubLSymbol CYC_EVALUATE_SUBL = makeSymbol("CYC-EVALUATE-SUBL");

    private static final SubLSymbol CYC_STRING_UPCASE = makeSymbol("CYC-STRING-UPCASE");

    private static final SubLSymbol STRING_UPCASE_DEFN = makeSymbol("STRING-UPCASE-DEFN");

    private static final SubLList $list25 = list(makeSymbol("CYC-STRING-UPCASE"));

    private static final SubLSymbol CYC_STRING_DOWNCASE = makeSymbol("CYC-STRING-DOWNCASE");

    private static final SubLSymbol CYC_SUBSTRING = makeSymbol("CYC-SUBSTRING");

    private static final SubLSymbol CYC_STRING_CONCAT = makeSymbol("CYC-STRING-CONCAT");

    private static final SubLString $str31$ = makeString("");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLSymbol CYC_STRINGS_TO_PHRASE = makeSymbol("CYC-STRINGS-TO-PHRASE");

    private static final SubLSymbol CYC_PRE_REMOVE = makeSymbol("CYC-PRE-REMOVE");

    private static final SubLInteger $int$128 = makeInteger(128);

    private static final SubLSymbol $sym36$__ = makeSymbol("<=");

    private static final SubLSymbol CYC_REPLACE_SUBSTRING = makeSymbol("CYC-REPLACE-SUBSTRING");

    private static final SubLSymbol CYC_UNIQUE_WS = makeSymbol("CYC-UNIQUE-WS");

    private static final SubLSymbol GENERATE_NAMES_FOR_TERM = makeSymbol("GENERATE-NAMES-FOR-TERM");

    private static final SubLSymbol CYC_REMOVE_SUBSTRING = makeSymbol("CYC-REMOVE-SUBSTRING");

    private static final SubLSymbol CYC_POST_REMOVE = makeSymbol("CYC-POST-REMOVE");

    private static final SubLSymbol CYC_TRIM_WHITESPACE = makeSymbol("CYC-TRIM-WHITESPACE");

    private static final SubLSymbol CYC_STRING_SEARCH = makeSymbol("CYC-STRING-SEARCH");

    private static final SubLSymbol CYC_LENGTH = makeSymbol("CYC-LENGTH");

    private static final SubLString $str45$_ = makeString(",");

    private static final SubLSymbol CYC_STRING_TO_INTEGER = makeSymbol("CYC-STRING-TO-INTEGER");

    private static final SubLSymbol CYC_INTEGRAL_NUMBER_TO_INTEGER = makeSymbol("CYC-INTEGRAL-NUMBER-TO-INTEGER");

    private static final SubLSymbol CYC_INTEGER_TO_STRING = makeSymbol("CYC-INTEGER-TO-STRING");

    private static final SubLSymbol CYC_STRINGIFY_FN = makeSymbol("CYC-STRINGIFY-FN");

    private static final SubLSymbol CYC_STRING_TO_REAL_NUMBER = makeSymbol("CYC-STRING-TO-REAL-NUMBER");

    private static final SubLString $str52$__0_9______0_9______0_9___ = makeString("([0-9]+) ([0-9]+)/([0-9]+)");



    private static final SubLString $str55$__0_9______0_9___ = makeString("([0-9]+)/([0-9]+)");



    private static final SubLString $str58$__0_9_______0_9___ = makeString("([0-9]+)\\.([0-9]+)");



    private static final SubLString $str61$__0_9___ = makeString("([0-9]+)");

    private static final SubLSymbol CYC_SYNTACTIC_DISQUOTATION = makeSymbol("CYC-SYNTACTIC-DISQUOTATION");

    private static final SubLString $str63$_0_9____0_9____0_9__ = makeString("[0-9]+ [0-9]+/[0-9]+");

    private static final SubLString $str64$_0_9____0_9__ = makeString("[0-9]+/[0-9]+");

    private static final SubLString $str65$_0_9_____0_9__ = makeString("[0-9]+\\.[0-9]+");

    private static final SubLString $str66$_0_9__ = makeString("[0-9]+");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLSymbol $sym69$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol CYC_REAL_NUMBER_TO_STRING = makeSymbol("CYC-REAL-NUMBER-TO-STRING");

    private static final SubLSymbol CYC_STRING_TOKENIZE = makeSymbol("CYC-STRING-TOKENIZE");

    private static final SubLSymbol CYC_STRING_TO_NTH_CODE_POINT = makeSymbol("CYC-STRING-TO-NTH-CODE-POINT");

    private static final SubLSymbol CYC_HTTP_URL_ENCODE = makeSymbol("CYC-HTTP-URL-ENCODE");

    private static final SubLSymbol CYC_XML_VALUE_STRING = makeSymbol("CYC-XML-VALUE-STRING");

    private static final SubLSymbol CYC_HTTP_URL_DECODE = makeSymbol("CYC-HTTP-URL-DECODE");

    private static final SubLSymbol CYC_ACRONYM_FROM_STRING = makeSymbol("CYC-ACRONYM-FROM-STRING");

    static private final SubLList $list80 = list(new SubLObject[]{ makeSymbol("&KEY"), makeSymbol("ID"), makeSymbol("CLASS"), makeSymbol("ISMAP"), makeSymbol("HEIGHT"), makeSymbol("WIDTH"), makeSymbol("ALT"), makeSymbol("ALIGN"), makeSymbol("BORDER") });

    static private final SubLList $list81 = list(makeKeyword("ID"), makeKeyword("CLASS"), makeKeyword("ISMAP"), makeKeyword("HEIGHT"), makeKeyword("WIDTH"), makeKeyword("ALT"), makeKeyword("ALIGN"), makeKeyword("BORDER"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol CYC_HTML_IMAGE = makeSymbol("CYC-HTML-IMAGE");

    private static final SubLList $list92 = list(new SubLObject[]{ makeSymbol("&KEY"), makeSymbol("NOWRAP"), makeSymbol("COLSPAN"), makeSymbol("ROWSPAN"), makeSymbol("ALIGN"), makeSymbol("VALIGN"), makeSymbol("BGCOLOR"), makeSymbol("WIDTH"), makeSymbol("HEIGHT"), makeSymbol("ID") });

    private static final SubLList $list93 = list(new SubLObject[]{ makeKeyword("NOWRAP"), makeKeyword("COLSPAN"), makeKeyword("ROWSPAN"), makeKeyword("ALIGN"), makeKeyword("VALIGN"), makeKeyword("BGCOLOR"), makeKeyword("WIDTH"), makeKeyword("HEIGHT"), makeKeyword("ID") });

    private static final SubLSymbol CYC_HTML_TABLE_DATA = makeSymbol("CYC-HTML-TABLE-DATA");

    private static final SubLList $list100 = cons(makeSymbol("OPTIONS"), makeSymbol("CONTENT"));

    private static final SubLSymbol CYC_HTML_TABLE_DATA_VARIABLE_ARITY = makeSymbol("CYC-HTML-TABLE-DATA-VARIABLE-ARITY");

    private static final SubLList $list102 = list(makeSymbol("&KEY"), makeSymbol("ALIGN"), makeSymbol("VALIGN"), makeSymbol("BGCOLOR"), makeSymbol("HEIGHT"));

    private static final SubLList $list103 = list(makeKeyword("ALIGN"), makeKeyword("VALIGN"), makeKeyword("BGCOLOR"), makeKeyword("HEIGHT"));

    private static final SubLSymbol CYC_HTML_TABLE_ROW = makeSymbol("CYC-HTML-TABLE-ROW");

    private static final SubLList $list105 = cons(makeSymbol("OPTIONS"), makeSymbol("DATA"));

    private static final SubLSymbol CYC_HTML_TABLE_ROW_VARIABLE_ARITY = makeSymbol("CYC-HTML-TABLE-ROW-VARIABLE-ARITY");

    private static final SubLList $list107 = list(new SubLObject[]{ makeSymbol("&KEY"), makeSymbol("NOFLOW"), makeSymbol("NOWRAP"), makeSymbol("ALIGN"), makeSymbol("BORDER"), makeSymbol("CELLPADDING"), makeSymbol("CELLSPACING"), makeSymbol("COLSPEC"), makeSymbol("UNITS"), makeSymbol("BGCOLOR"), makeSymbol("WIDTH"), makeSymbol("BACKGROUND") });

    private static final SubLList $list108 = list(new SubLObject[]{ makeKeyword("NOFLOW"), makeKeyword("NOWRAP"), makeKeyword("ALIGN"), makeKeyword("BORDER"), makeKeyword("CELLPADDING"), makeKeyword("CELLSPACING"), makeKeyword("COLSPEC"), makeKeyword("UNITS"), makeKeyword("BGCOLOR"), makeKeyword("WIDTH"), makeKeyword("BACKGROUND") });

    private static final SubLSymbol CYC_HTML_TABLE = makeSymbol("CYC-HTML-TABLE");

    private static final SubLSymbol CYC_HTML_TABLE_VARIABLE_ARITY = makeSymbol("CYC-HTML-TABLE-VARIABLE-ARITY");

    private static final SubLList $list117 = list(makeSymbol("&KEY"), makeSymbol("ID"), makeSymbol("CLASS"), makeSymbol("STYLE"), makeSymbol("ONLOAD"));

    private static final SubLList $list118 = list(makeKeyword("ID"), makeKeyword("CLASS"), makeKeyword("STYLE"), makeKeyword("ONLOAD"));

    private static final SubLSymbol CYC_HTML_DIVISION = makeSymbol("CYC-HTML-DIVISION");

    private static final SubLSymbol CYC_HTML_DIVISION_VARIABLE_ARITY = makeSymbol("CYC-HTML-DIVISION-VARIABLE-ARITY");

    private static final SubLList $list123 = list(makeSymbol("EL-ATTRIBUTE"), makeSymbol("EL-VALUE"));

    private static final SubLList $list124 = list(reader_make_constant_shell("SubLQuoteFn"), makeKeyword("ANYTHING"));

    private static final SubLList $list125 = list(reader_make_constant_shell("Percent"), makeKeyword("ANYTHING"));

    private static final SubLString $str126$_ = makeString("%");

    private static final SubLSymbol PARSE_HTML_ATTRIBUTE_VALUE = makeSymbol("PARSE-HTML-ATTRIBUTE-VALUE");



    private static final SubLSymbol CYC_CONTEXTUAL_URL = makeSymbol("CYC-CONTEXTUAL-URL");

    private static final SubLList $list130 = list(CHAR_less);

    private static final SubLList $list131 = list(CHAR_greater);

    private static final SubLSymbol CYC_TERM_FROM_SPARQL_URI = makeSymbol("CYC-TERM-FROM-SPARQL-URI");

    private static final SubLSymbol OPEN_CYC_URI_FOR_TERM = makeSymbol("OPEN-CYC-URI-FOR-TERM");

    private static final SubLSymbol CANONICAL_URI_FOR_TERM = makeSymbol("CANONICAL-URI-FOR-TERM");



    private static final SubLSymbol CYC_REMOVE_HTML_TAGS = makeSymbol("CYC-REMOVE-HTML-TAGS");

    private static final SubLSymbol CYC_CAPITALIZE_SMART = makeSymbol("CYC-CAPITALIZE-SMART");

    private static final SubLSymbol CYC_RECAPITALIZE_SMART = makeSymbol("CYC-RECAPITALIZE-SMART");

    private static final SubLSymbol CYC_RELATION_ARG = makeSymbol("CYC-RELATION-ARG");



    private static final SubLSymbol CYC_RELATION_ARGS_LIST = makeSymbol("CYC-RELATION-ARGS-LIST");



    private static final SubLSymbol CYC_RELATION_ARG_SET = makeSymbol("CYC-RELATION-ARG-SET");

    private static final SubLSymbol CYC_QUOTED_RELATION_EXPRESSION_ARITY = makeSymbol("CYC-QUOTED-RELATION-EXPRESSION-ARITY");

    private static final SubLSymbol CYC_RELATION_EXPRESSION_ARITY = makeSymbol("CYC-RELATION-EXPRESSION-ARITY");

    private static final SubLSymbol CYC_IDENTITY = makeSymbol("CYC-IDENTITY");

    private static final SubLSymbol CYC_RELATION_TUPLES = makeSymbol("CYC-RELATION-TUPLES");



    private static final SubLSymbol CYC_SUBSTITUTE_FORMULA = makeSymbol("CYC-SUBSTITUTE-FORMULA");

    private static final SubLSymbol $sym150$SYMMETRIC_PART_TYPE_ = makeSymbol("SYMMETRIC-PART-TYPE?");

    private static final SubLSymbol LEFT_FORM_OF_SYMMETRIC_PART_TYPE = makeSymbol("LEFT-FORM-OF-SYMMETRIC-PART-TYPE");

    private static final SubLSymbol CYC_BILATERAL_FORM_OF_SENTENCE_LEFT = makeSymbol("CYC-BILATERAL-FORM-OF-SENTENCE-LEFT");





    private static final SubLSymbol RIGHT_FORM_OF_SYMMETRIC_PART_TYPE = makeSymbol("RIGHT-FORM-OF-SYMMETRIC-PART-TYPE");

    private static final SubLSymbol CYC_BILATERAL_FORM_OF_SENTENCE_RIGHT = makeSymbol("CYC-BILATERAL-FORM-OF-SENTENCE-RIGHT");



    private static final SubLSymbol SIDE_FN_NAUT_P = makeSymbol("SIDE-FN-NAUT-P");

    private static final SubLSymbol NAT_ARG1 = makeSymbol("NAT-ARG1");

    private static final SubLSymbol $sym160$_SIDEFN = makeSymbol("?SIDEFN");



    private static final SubLSymbol CYC_SUBSTITUTE_FORMULA_ARG = makeSymbol("CYC-SUBSTITUTE-FORMULA-ARG");

    private static final SubLSymbol CYC_SUBSTITUTE_FORMULA_ARG_POSITION = makeSymbol("CYC-SUBSTITUTE-FORMULA-ARG-POSITION");

    private static final SubLSymbol CYC_MAKE_FORMULA = makeSymbol("CYC-MAKE-FORMULA");

    private static final SubLSymbol CYC_SUBSTITUTE_QUOTED_FORMULA = makeSymbol("CYC-SUBSTITUTE-QUOTED-FORMULA");

    private static final SubLSymbol CYC_SUBSTITUTE_QUOTED_FORMULA_ARG = makeSymbol("CYC-SUBSTITUTE-QUOTED-FORMULA-ARG");

    private static final SubLSymbol CYC_SUBSTITUTE_QUOTED_FORMULA_ARG_POSITION = makeSymbol("CYC-SUBSTITUTE-QUOTED-FORMULA-ARG-POSITION");

    private static final SubLSymbol CYC_MAKE_QUOTED_FORMULA = makeSymbol("CYC-MAKE-QUOTED-FORMULA");

    private static final SubLSymbol CYCL_TO_EL_FN = makeSymbol("CYCL-TO-EL-FN");

    private static final SubLSymbol CYC_SUBSTITUTE_NLTE = makeSymbol("CYC-SUBSTITUTE-NLTE");

    private static final SubLSymbol SEM_TRANS_TEMPLATE_DEFN = makeSymbol("SEM-TRANS-TEMPLATE-DEFN");

    private static final SubLSymbol CYC_WORD_STRINGS = makeSymbol("CYC-WORD-STRINGS");

    private static final SubLString $$$WordStringsFn = makeString("WordStringsFn");

    private static final SubLString $$$WordSequenceFn = makeString("WordSequenceFn");

    private static final SubLSymbol CYC_STRINGS_OF_WORD_SEQUENCE = makeSymbol("CYC-STRINGS-OF-WORD-SEQUENCE");

    private static final SubLSymbol CYC_INSTANTIATE = makeSymbol("CYC-INSTANTIATE");

    private static final SubLList $list177 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER);

    private static final SubLSymbol CYC_FIND_OR_INSTANTIATE = makeSymbol("CYC-FIND-OR-INSTANTIATE");



    private static final SubLSymbol $sym180$_OBJ = makeSymbol("?OBJ");





    private static final SubLSymbol CYC_FIND_VIA_PRED_VALUE_OR_CREATE_VIA_TEMPLATE = makeSymbol("CYC-FIND-VIA-PRED-VALUE-OR-CREATE-VIA-TEMPLATE");

    private static final SubLSymbol CACHED_FIND_VIA_PRED_VALUE_WRT_TEMPLATE = makeSymbol("CACHED-FIND-VIA-PRED-VALUE-WRT-TEMPLATE");

    private static final SubLSymbol $cached_find_via_pred_value_wrt_template_caching_state$ = makeSymbol("*CACHED-FIND-VIA-PRED-VALUE-WRT-TEMPLATE-CACHING-STATE*");



    private static final SubLObject $const188$creationTemplateConstantNameForma = reader_make_constant_shell("creationTemplateConstantNameFormat");





    private static final SubLSymbol $sym194$INDIVIDUAL_DENOTING_FN_ = makeSymbol("INDIVIDUAL-DENOTING-FN?");

    private static final SubLSymbol CYC_INDIVIDUAL_DENOTING_UNARY_FUNCTION_FOR = makeSymbol("CYC-INDIVIDUAL-DENOTING-UNARY-FUNCTION-FOR");



    private static final SubLSymbol CYC_COLLECTION_DENOTING_UNARY_FUNCTION_FOR = makeSymbol("CYC-COLLECTION-DENOTING-UNARY-FUNCTION-FOR");

    private static final SubLSymbol $sym198$UNARY_FUNCTION_ = makeSymbol("UNARY-FUNCTION?");

    private static final SubLSymbol $sym199$SKOLEM_FUNCTION_ = makeSymbol("SKOLEM-FUNCTION?");





    private static final SubLSymbol CYC_EL_VARIABLE_FN = makeSymbol("CYC-EL-VARIABLE-FN");

    private static final SubLSymbol CYC_ADD_ENGLISH_SUFFIX = makeSymbol("CYC-ADD-ENGLISH-SUFFIX");

    public static final SubLSymbol $use_new_nl_generation_api_for_generate_phrase_fnP$ = makeSymbol("*USE-NEW-NL-GENERATION-API-FOR-GENERATE-PHRASE-FN?*");

    private static final SubLSymbol GENERATE_PHRASE_DEFN = makeSymbol("GENERATE-PHRASE-DEFN");

    private static final SubLSymbol GENERATE_PHRASE_MEMOIZED = makeSymbol("GENERATE-PHRASE-MEMOIZED");

    private static final SubLInteger $int$500000 = makeInteger(500000);

    private static final SubLString $str209$__Got__D_scored_assertions___ = makeString("~&Got ~D scored assertions.~%");

    private static final SubLList $list210 = cons(makeSymbol("ASSERTION.NL"), makeUninternedSymbol("VALUE"));

    private static final SubLSymbol $sym211$_ = makeSymbol("<");

    private static final SubLString $str212$__Returning__D_assertions___ = makeString("~&Returning ~D assertions.~%");

    private static final SubLSymbol ASSERTIONS_RELEVANT_TO_STRING_DEFN = makeSymbol("ASSERTIONS-RELEVANT-TO-STRING-DEFN");

    private static final SubLSymbol ASSERTIONS_FOR_PROMPT_STRING_MEMOIZED = makeSymbol("ASSERTIONS-FOR-PROMPT-STRING-MEMOIZED");

    private static final SubLSymbol BEST_STRING_OF_NL_PHRASE_DEFN = makeSymbol("BEST-STRING-OF-NL-PHRASE-DEFN");

    private static final SubLSymbol BEST_STRING_OF_NL_PHRASE_ADDRESSING_DEFN = makeSymbol("BEST-STRING-OF-NL-PHRASE-ADDRESSING-DEFN");

    private static final SubLSymbol BEST_STRING_OF_NL_PHRASE_WITH_FORCE_DEFN = makeSymbol("BEST-STRING-OF-NL-PHRASE-WITH-FORCE-DEFN");

    private static final SubLSymbol GENERATE_GKE_GLOSS_WRT_MT = makeSymbol("GENERATE-GKE-GLOSS-WRT-MT");

    private static final SubLSymbol BASIC_DATUM_PARAPHRASE_DEFN = makeSymbol("BASIC-DATUM-PARAPHRASE-DEFN");

    private static final SubLObject $$nonPlural_Generic = reader_make_constant_shell("nonPlural-Generic");

    private static final SubLSymbol $append_stack_traces_to_error_messagesP$ = makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*");

    private static final SubLList $list223 = list(makeSymbol("CSETQ"), makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*"), NIL);

    private static final SubLObject $$genTemplate_QuerySentence = reader_make_constant_shell("genTemplate-QuerySentence");

    private static final SubLObject $$genTemplate_Constrained = reader_make_constant_shell("genTemplate-Constrained");

    private static final SubLString $str230$Formula_does_not_meet_this_assert = makeString("Formula does not meet this assertion's constraints.");

    private static final SubLSymbol PARAPHRASE_OF_FORMULA_FROM_TEMPLATE_DEFN = makeSymbol("PARAPHRASE-OF-FORMULA-FROM-TEMPLATE-DEFN");



    private static final SubLObject $$State_UnitedStates = reader_make_constant_shell("State-UnitedStates");



    private static final SubLSymbol STATE_OR_PROVINCE_FOR_CITY_DEFN = makeSymbol("STATE-OR-PROVINCE-FOR-CITY-DEFN");

    private static final SubLSymbol CYC_HTML_URL_ENCODE = makeSymbol("CYC-HTML-URL-ENCODE");

    private static final SubLSymbol CHAR_CODE = makeSymbol("CHAR-CODE");

    private static final SubLString $str240$charset_utf_8 = makeString("charset=utf-8");

    private static final SubLSymbol CYC_URL_SOURCE = makeSymbol("CYC-URL-SOURCE");

    private static final SubLInteger $int$80 = makeInteger(80);

    private static final SubLString $str249$simple_http_get = makeString("simple-http-get");

    private static final SubLSymbol $kw251$KEEP_ALIVE_ = makeKeyword("KEEP-ALIVE?");

    private static final SubLSymbol $kw252$WIDE_NEWLINES_ = makeKeyword("WIDE-NEWLINES?");

    private static final SubLSymbol $SOAP_ACTION_URI = makeKeyword("SOAP-ACTION-URI");

    private static final SubLSymbol CYC_GET_FROM_HTTP_SOURCE = makeSymbol("CYC-GET-FROM-HTTP-SOURCE");

    private static final SubLString $str257$_ = makeString("\"");

    private static final SubLString $str258$_ = makeString("&");



    private static final SubLString $str260$_ = makeString("<");

    private static final SubLString $str261$_ = makeString(">");

    private static final SubLSymbol CYC_TERM_URI_FN = makeSymbol("CYC-TERM-URI-FN");





    private static final SubLSymbol CITY_NAMED_FN_DEFN = makeSymbol("CITY-NAMED-FN-DEFN");

    static private final SubLList $list266 = list(makeKeyword("ALLOWED-MODULES"), list(makeKeyword("NOT"), list(makeKeyword("MODULE-SUBTYPE"), $SKSI)));

    private static final SubLSymbol TEXT_TOPIC_STRUCTURE = makeSymbol("TEXT-TOPIC-STRUCTURE");

    private static final SubLSymbol EL_LIST_TO_SUBL_LIST = makeSymbol("EL-LIST-TO-SUBL-LIST");



    private static final SubLList $list272 = list(makeKeyword("BASE-SET"));



    private static final SubLList $list275 = list(makeKeyword("ORDERING-RELATION"));

    private static final SubLSymbol CYC_ORDERING_RESULT = makeSymbol("CYC-ORDERING-RESULT");



    private static final SubLSymbol $sym279$ORDERING__ = makeSymbol("ORDERING-<");

    private static final SubLSymbol CYC_TIME_OF_DAY_OF_DATE = makeSymbol("CYC-TIME-OF-DAY-OF-DATE");

    private static final SubLSymbol CYC_SECONDS_SINCE_1970_TO_DATE = makeSymbol("CYC-SECONDS-SINCE-1970-TO-DATE");

    private static final SubLSymbol CYC_DATE_TO_SECONDS_SINCE_1970 = makeSymbol("CYC-DATE-TO-SECONDS-SINCE-1970");

    private static final SubLSymbol CYC_TYPES_MOST_OFTEN_ASSERTED_USING_TOOL = makeSymbol("CYC-TYPES-MOST-OFTEN-ASSERTED-USING-TOOL");

    private static final SubLSymbol ASSERTION_GENERATING_TOOL_P = makeSymbol("ASSERTION-GENERATING-TOOL-P");





    private static final SubLSymbol $sym290$_ = makeSymbol(">");



    private static final SubLString $str293$_TEXT_ = makeString("<TEXT>");

    private static final SubLString $str294$__TEXT_ = makeString("</TEXT>");

    private static final SubLString $str295$_b_ = makeString("<b>");

    private static final SubLString $str296$__b_ = makeString("</b>");

    private static final SubLSymbol CYC_HTML_FOR_TEXT_CONTAINING_STRINGS_COUNT_BOLD_TAGS = makeSymbol("CYC-HTML-FOR-TEXT-CONTAINING-STRINGS-COUNT-BOLD-TAGS");

    private static final SubLString $str298$_____ = makeString(" ... ");

    private static final SubLSymbol CYC_HTML_FOR_TEXT_CONTAINING_STRINGS = makeSymbol("CYC-HTML-FOR-TEXT-CONTAINING-STRINGS");

    private static final SubLSymbol CYC_FORMAT = makeSymbol("CYC-FORMAT");

    private static final SubLString $str302$term____isg_table_lock = makeString("term -> isg table lock");

    private static final SubLSymbol $term_to_isg_table$ = makeSymbol("*TERM-TO-ISG-TABLE*");

    private static final SubLSymbol CYC_NEXT_INTEGER_IN_SEQUENCE = makeSymbol("CYC-NEXT-INTEGER-IN-SEQUENCE");

    private static final SubLString $str305$term____isg_w__start_table_lock = makeString("term -> isg w/ start table lock");

    private static final SubLSymbol $sym306$_TERM_TO_ISG_W_START_TABLE_ = makeSymbol("*TERM-TO-ISG-W/START-TABLE*");

    private static final SubLSymbol CYC_NEXT_INTEGER_IN_SEQUENCE_STARTING_AT = makeSymbol("CYC-NEXT-INTEGER-IN-SEQUENCE-STARTING-AT");





    private static final SubLSymbol CYC_CYCLIFY = makeSymbol("CYC-CYCLIFY");

    private static final SubLSymbol CYCL_STRING_P = makeSymbol("CYCL-STRING-P");

    private static final SubLSymbol CYC_CONCATENATE_STRINGS = makeSymbol("CYC-CONCATENATE-STRINGS");

    private static final SubLSymbol CYC_CONCATENATE_LIST_OF_STRINGS = makeSymbol("CYC-CONCATENATE-LIST-OF-STRINGS");

    private static final SubLSymbol CYC_TERM_SIMILARITY_METRIC = makeSymbol("CYC-TERM-SIMILARITY-METRIC");

    private static final SubLObject $const316$WordNet2_0_KS = reader_make_constant_shell("WordNet2_0-KS");

    private static final SubLSymbol $WN_SKS_REGISTERED = makeKeyword("WN-SKS-REGISTERED");

    private static final SubLSymbol $sym318$CYC_WN_ALL_CANDIDATE_CYCLS_FOR_WORD_UNIT_POS = makeSymbol("CYC-WN-ALL-CANDIDATE-CYCLS-FOR-WORD-UNIT&POS");

    private static final SubLSymbol $sym319$CYC_WN_ALL_HYPERNYMS_FOR_WORD_UNIT_POS = makeSymbol("CYC-WN-ALL-HYPERNYMS-FOR-WORD-UNIT&POS");

    private static final SubLSymbol $sym320$CYC_WN_ALL_SYNONYMS_FOR_WORD_UNIT_POS = makeSymbol("CYC-WN-ALL-SYNONYMS-FOR-WORD-UNIT&POS");

    private static final SubLSymbol MAKE_EL_SET = makeSymbol("MAKE-EL-SET");

    private static final SubLSymbol $sym324$CYC_WN_RANKED_CANDIDATE_CYCLS_FOR_WORD_UNIT_POS = makeSymbol("CYC-WN-RANKED-CANDIDATE-CYCLS-FOR-WORD-UNIT&POS");

    private static final SubLSymbol $sym325$CYC_WN_RANKED_HYPERNYMS_FOR_WORD_UNIT_POS = makeSymbol("CYC-WN-RANKED-HYPERNYMS-FOR-WORD-UNIT&POS");

    private static final SubLSymbol $sym326$CYC_WN_RANKED_SYNONYMS_FOR_WORD_UNIT_POS = makeSymbol("CYC-WN-RANKED-SYNONYMS-FOR-WORD-UNIT&POS");

    private static final SubLSymbol CYC_KB_ORTHOGONAL = makeSymbol("CYC-KB-ORTHOGONAL");

    private static final SubLSymbol CYC_CONTENT_OF_FILE = makeSymbol("CYC-CONTENT-OF-FILE");

    private static final SubLSymbol CYC_TRANSFORM_RELATION_TUPLES = makeSymbol("CYC-TRANSFORM-RELATION-TUPLES");

    private static final SubLString $str330$_a_doesn_t_start_with___TheList = makeString("~a doesn't start with #$TheList");



    private static final SubLSymbol CYC_PROVABLE_VIA_DEFNS = makeSymbol("CYC-PROVABLE-VIA-DEFNS");

    private static final SubLSymbol CURRENT_INFERENCE_ANSWER_JUSTIFICATION_PROOF_VIEW = makeSymbol("CURRENT-INFERENCE-ANSWER-JUSTIFICATION-PROOF-VIEW");

    private static final SubLSymbol CYC_FIND_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING = makeSymbol("CYC-FIND-OBJECT-BY-COMPACT-HL-EXTERNAL-ID-STRING");

    private static final SubLSymbol CYC_COMPACT_HL_EXTERNAL_ID_STRING = makeSymbol("CYC-COMPACT-HL-EXTERNAL-ID-STRING");



    private static final SubLSymbol CYC_DECODE_KA_INTERACTION = makeSymbol("CYC-DECODE-KA-INTERACTION");



    private static final SubLSymbol $sym339$CYC_MOST_RECENTLY_STARTED_EVENTS_BY_AGENT_RELATIVE_TO_INTERACTION = makeSymbol("CYC-MOST-RECENTLY-STARTED-EVENTS-BY-AGENT-RELATIVE-TO-INTERACTION-MT-FN");





    private static final SubLObject $$laterInteractionHistoryMt_Direct = reader_make_constant_shell("laterInteractionHistoryMt-Direct");

    private static final SubLObject $const343$laterInteractionHistoryMtForSimul = reader_make_constant_shell("laterInteractionHistoryMtForSimulatedAgent-Direct");

    private static final SubLString $str344$More_than_one_recently_started_ev = makeString("More than one recently started event found for (MostRecentlyStartedEventsByAgentRelativeToInteractionMtFn ~S ~S) -> ~S");

    private static final SubLObject $const345$executionOfPlannedEventBeginsInCo = reader_make_constant_shell("executionOfPlannedEventBeginsInContext");









    private static final SubLSymbol $sym350$CYC_MOST_RECENTLY_STARTED_UNFINISH_EVENTS_BY_AGENT_RELATIVE_TO_IN = makeSymbol("CYC-MOST-RECENTLY-STARTED-UNFINISH-EVENTS-BY-AGENT-RELATIVE-TO-INTERACTION-MT-FN");

    private static final SubLSymbol CYC_EVENT_TO_PLAN_FOR_BY_AGENT_IN_INTERACTION_CONTEXT_FN = makeSymbol("CYC-EVENT-TO-PLAN-FOR-BY-AGENT-IN-INTERACTION-CONTEXT-FN");

    private static final SubLSymbol GAF_ARG3 = makeSymbol("GAF-ARG3");

    private static final SubLObject $const353$agentShouldAttemptToFindModelForE = reader_make_constant_shell("agentShouldAttemptToFindModelForEventInInteractionContext");

    private static final SubLString $str354$More_that_one_event_found_for__Ev = makeString("More that one event found for (EventToPlanForByAgentInInteractionContextFn ~S ~S): ~S");

    private static final SubLSymbol CYC_PLAN_AGENT_SHOULD_EXECUTE_IN_INTERACTION_CONTEXT_FN = makeSymbol("CYC-PLAN-AGENT-SHOULD-EXECUTE-IN-INTERACTION-CONTEXT-FN");













    private static final SubLString $str363$More_than_one_agenda_found_for__H = makeString("More than one agenda found for (HighestPriorityItemOnAgendaForAgentInInteractionContextFn ~S ~S) -> ~S");



    private static final SubLString $str366$More_than_one_priority_found_for_ = makeString("More than one priority found for (#$agendaHasTaskWithPriority ~S ~S ?PRIORITY): ~S");

    private static final SubLSymbol CYC_AGENT_CANNOT_PROGRESS_IN_INTERACTION_CONTEXT_FN = makeSymbol("CYC-AGENT-CANNOT-PROGRESS-IN-INTERACTION-CONTEXT-FN");





    private static final SubLSymbol $sym370$CYC_HIGHEST_PRIORITY_ITEM_ON_AGENDA_FOR_AGENT_IN_INTERACTION_CONT = makeSymbol("CYC-HIGHEST-PRIORITY-ITEM-ON-AGENDA-FOR-AGENT-IN-INTERACTION-CONTEXT-FN");

    private static final SubLObject $const372$agentToDoMtAndHistoryCoincideAtDa = reader_make_constant_shell("agentToDoMtAndHistoryCoincideAtDate");

    private static final SubLString $str373$More_than_one_todo_mt_found_for__ = makeString("More than one todo-mt found for (HighestPriorityItemOnAgendaForAgentInInteractionContextFn ~S ~S) -> ~S");

    private static final SubLSymbol CYC_HIGHEST_PRIORITY_ITEM_ON_AGENDA_IN_TO_DO_MT_FN = makeSymbol("CYC-HIGHEST-PRIORITY-ITEM-ON-AGENDA-IN-TO-DO-MT-FN");

    private static final SubLList $list375 = list(TWO_INTEGER, THREE_INTEGER);



    private static final SubLSymbol CYC_LIKELIHOOD_OF_TRUTH_OF_SENTENCE = makeSymbol("CYC-LIKELIHOOD-OF-TRUTH-OF-SENTENCE");

    private static final SubLSymbol CYC_TIME_INTERVALS_FOR_SENTENCE = makeSymbol("CYC-TIME-INTERVALS-FOR-SENTENCE");

    private static final SubLString $str381$math_expression_evaluate_error___ = makeString("math-expression-evaluate error: ~A");

    private static final SubLSymbol CYC_EVALUATE_MATH_EXPRESSION = makeSymbol("CYC-EVALUATE-MATH-EXPRESSION");

    private static final SubLString $str383$math_expression_flatten_error___A = makeString("math-expression-flatten error: ~A");

    private static final SubLSymbol CYC_FLATTEN_MATH_EXPRESSION = makeSymbol("CYC-FLATTEN-MATH-EXPRESSION");

    private static final SubLSymbol CYC_APPLY_OPERATION_TO_MATH_STATEMENT = makeSymbol("CYC-APPLY-OPERATION-TO-MATH-STATEMENT");

    private static final SubLSymbol CYC_SERIALIZE_MATHML = makeSymbol("CYC-SERIALIZE-MATHML");

    private static final SubLSymbol EXTENSIONAL_SET_ELEMENTS = makeSymbol("EXTENSIONAL-SET-ELEMENTS");

    private static final SubLSymbol MAKE_EL_LIST = makeSymbol("MAKE-EL-LIST");

    private static final SubLSymbol CYC_CARTESIAN_PRODUCT = makeSymbol("CYC-CARTESIAN-PRODUCT");

    private static final SubLSymbol CYC_FILTER_LIST = makeSymbol("CYC-FILTER-LIST");

    public static final SubLObject evaluatable_predicate_count_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = ZERO_INTEGER;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject cdolist_list_var = isa.all_fort_instances($$EvaluatablePredicate, UNPROVIDED, UNPROVIDED);
                            SubLObject pred = NIL;
                            for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                                {
                                    SubLObject defn = cycl_subl_symbol_symbol(kb_mapping_utilities.fpred_value_in_any_mt(pred, $$evaluationDefn, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                    if (defn.isSymbol() && (NIL != fboundp(defn))) {
                                        count = add(count, ONE_INTEGER);
                                    }
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return count;
            }
        }
    }

    public static SubLObject evaluatable_predicate_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject cdolist_list_var = isa.all_fort_instances($$EvaluatablePredicate, UNPROVIDED, UNPROVIDED);
            SubLObject pred = NIL;
            pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject defn = cycl_subl_symbol_symbol(kb_mapping_utilities.fpred_value_in_any_mt(pred, $$evaluationDefn, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                if (defn.isSymbol() && (NIL != fboundp(defn))) {
                    count = add(count, ONE_INTEGER);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    /**
     * #$evaluationDefn for #$trueSubL
     */
    @LispMethod(comment = "#$evaluationDefn for #$trueSubL")
    public static final SubLObject cyc_true_subl_alt(SubLObject form) {
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.evaluation_defns.cyc_evaluate_subl(form));
    }

    /**
     * #$evaluationDefn for #$trueSubL
     */
    @LispMethod(comment = "#$evaluationDefn for #$trueSubL")
    public static SubLObject cyc_true_subl(final SubLObject form) {
        return list_utilities.sublisp_boolean(cyc_evaluate_subl(form));
    }

    /**
     * #$evaluationDefn for #$different
     */
    @LispMethod(comment = "#$evaluationDefn for #$different")
    public static final SubLObject cyc_different_alt(SubLObject args) {
        {
            SubLObject result = equals.differentP(args, $UNKNOWN);
            if (result == $UNKNOWN) {
                relation_evaluation.throw_unevaluatable();
            }
            return result;
        }
    }

    /**
     * #$evaluationDefn for #$different
     */
    @LispMethod(comment = "#$evaluationDefn for #$different")
    public static SubLObject cyc_different(final SubLObject args) {
        final SubLObject result = equals.differentP(args, $UNKNOWN);
        if (result == $UNKNOWN) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }

    /**
     * #$evaluationDefn for #$differentSymbols
     */
    @LispMethod(comment = "#$evaluationDefn for #$differentSymbols")
    public static final SubLObject cyc_different_symbols_alt(SubLObject args) {
        return makeBoolean(NIL == list_utilities.duplicatesP(args, symbol_function(EQUAL), UNPROVIDED));
    }

    /**
     * #$evaluationDefn for #$differentSymbols
     */
    @LispMethod(comment = "#$evaluationDefn for #$differentSymbols")
    public static SubLObject cyc_different_symbols(final SubLObject args) {
        return makeBoolean(NIL == list_utilities.duplicatesP(args, symbol_function(EQUAL), UNPROVIDED));
    }

    public static SubLObject cyc_string_precedes(final SubLObject earlier_string, final SubLObject later_string) {
        return cyc_string_precedes_internal(earlier_string, later_string, T);
    }

    public static SubLObject cyc_string_precedes_case_insensitive(final SubLObject earlier_string, final SubLObject later_string) {
        return cyc_string_precedes_internal(earlier_string, later_string, NIL);
    }

    public static SubLObject cyc_string_precedes_internal(final SubLObject earlier_string, final SubLObject later_string, final SubLObject case_sensitiveP) {
        if ((!earlier_string.isString()) || (!later_string.isString())) {
            relation_evaluation.throw_unevaluatable();
            return NIL;
        }
        if (NIL != case_sensitiveP) {
            return list_utilities.sublisp_boolean(Strings.stringL(earlier_string, later_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
        return list_utilities.sublisp_boolean(Strings.string_lessp(earlier_string, later_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    /**
     * #$evaluationDefn for #$substring
     */
    @LispMethod(comment = "#$evaluationDefn for #$substring")
    public static final SubLObject cyc_substring_predicate_alt(SubLObject substring, SubLObject string) {
        return com.cyc.cycjava.cycl.evaluation_defns.cyc_substring_predicate_internal(substring, string, symbol_function($sym9$CHAR_));
    }

    /**
     * #$evaluationDefn for #$substring
     */
    @LispMethod(comment = "#$evaluationDefn for #$substring")
    public static SubLObject cyc_substring_predicate(final SubLObject substring, final SubLObject string) {
        return cyc_substring_predicate_internal(substring, string, symbol_function($sym11$CHAR_));
    }

    /**
     * #$evaluationDefn for #$substring-CaseInsensitive
     */
    @LispMethod(comment = "#$evaluationDefn for #$substring-CaseInsensitive")
    public static final SubLObject cyc_substring_case_insensitive_predicate_alt(SubLObject substring, SubLObject string) {
        return com.cyc.cycjava.cycl.evaluation_defns.cyc_substring_predicate_internal(substring, string, symbol_function(CHAR_EQUAL));
    }

    /**
     * #$evaluationDefn for #$substring-CaseInsensitive
     */
    @LispMethod(comment = "#$evaluationDefn for #$substring-CaseInsensitive")
    public static SubLObject cyc_substring_case_insensitive_predicate(final SubLObject substring, final SubLObject string) {
        return cyc_substring_predicate_internal(substring, string, symbol_function(CHAR_EQUAL));
    }

    public static final SubLObject cyc_substring_predicate_internal_alt(SubLObject substring, SubLObject string, SubLObject test) {
        if (substring.isString() && string.isString()) {
            return list_utilities.sublisp_boolean(search(substring, string, test, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        } else {
            if ((NIL != unicode_nauts.string_or_unicode_naut_p(substring)) && (NIL != unicode_nauts.string_or_unicode_naut_p(string))) {
                {
                    SubLObject case_sensitiveP = eql(test, symbol_function($sym9$CHAR_));
                    return unicode_nauts.unicode_substringP(substring, string, case_sensitiveP);
                }
            } else {
                relation_evaluation.throw_unevaluatable();
            }
        }
        return NIL;
    }

    public static SubLObject cyc_substring_predicate_internal(final SubLObject substring, final SubLObject string, final SubLObject test) {
        if (substring.isString() && string.isString()) {
            return list_utilities.sublisp_boolean(search(substring, string, test, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
        if ((NIL != unicode_nauts.string_or_unicode_naut_p(substring)) && (NIL != unicode_nauts.string_or_unicode_naut_p(string))) {
            final SubLObject case_sensitiveP = eql(test, symbol_function($sym11$CHAR_));
            return unicode_nauts.unicode_substringP(substring, string, case_sensitiveP);
        }
        relation_evaluation.throw_unevaluatable();
        return NIL;
    }

    /**
     * #$evaluationDefn for #$prefixSubstring
     */
    @LispMethod(comment = "#$evaluationDefn for #$prefixSubstring")
    public static final SubLObject cyc_prefix_substring_alt(SubLObject prefix, SubLObject string) {
        if (!(string.isString() && prefix.isString())) {
            relation_evaluation.throw_unevaluatable();
        }
        return string_utilities.starts_with(string, prefix);
    }

    /**
     * #$evaluationDefn for #$prefixSubstring
     */
    @LispMethod(comment = "#$evaluationDefn for #$prefixSubstring")
    public static SubLObject cyc_prefix_substring(final SubLObject prefix, final SubLObject string) {
        if ((!string.isString()) || (!prefix.isString())) {
            relation_evaluation.throw_unevaluatable();
        }
        return string_utilities.starts_with(string, prefix);
    }

    /**
     * #$evaluationDefn for #$suffixSubstring
     */
    @LispMethod(comment = "#$evaluationDefn for #$suffixSubstring")
    public static final SubLObject cyc_suffix_substring_alt(SubLObject suffix, SubLObject string) {
        if (!(suffix.isString() && string.isString())) {
            relation_evaluation.throw_unevaluatable();
        }
        return string_utilities.ends_with(string, suffix, UNPROVIDED);
    }

    /**
     * #$evaluationDefn for #$suffixSubstring
     */
    @LispMethod(comment = "#$evaluationDefn for #$suffixSubstring")
    public static SubLObject cyc_suffix_substring(final SubLObject suffix, final SubLObject string) {
        if ((!suffix.isString()) || (!string.isString())) {
            relation_evaluation.throw_unevaluatable();
        }
        return string_utilities.ends_with(string, suffix, UNPROVIDED);
    }

    /**
     * #$evaluationDefn for #$stringSubword
     */
    @LispMethod(comment = "#$evaluationDefn for #$stringSubword")
    public static final SubLObject cyc_subword_predicate_alt(SubLObject subword, SubLObject string) {
        if (!(subword.isString() && string.isString())) {
            relation_evaluation.throw_unevaluatable();
        }
        return list_utilities.sublisp_boolean(string_utilities.subwordP(subword, string, UNPROVIDED, UNPROVIDED));
    }

    /**
     * #$evaluationDefn for #$stringSubword
     */
    @LispMethod(comment = "#$evaluationDefn for #$stringSubword")
    public static SubLObject cyc_subword_predicate(final SubLObject subword, final SubLObject string) {
        if ((!subword.isString()) || (!string.isString())) {
            relation_evaluation.throw_unevaluatable();
        }
        return list_utilities.sublisp_boolean(string_utilities.subwordP(subword, string, UNPROVIDED, UNPROVIDED));
    }

    /**
     * Returns a constant if it exists, o/w throws an error.
     */
    @LispMethod(comment = "Returns a constant if it exists, o/w throws an error.")
    public static final SubLObject cyc_find_constant_alt(SubLObject nat) {
        {
            SubLObject constant_name = cycl_utilities.nat_arg1(nat, UNPROVIDED);
            if (constant_name.isString()) {
                {
                    SubLObject constant = constants_high.find_constant(constant_name);
                    if (NIL != constant) {
                        return constant;
                    }
                }
                Errors.error($str_alt16$Could_not_find_constant__A_, constant_name);
            }
            Errors.error($str_alt17$Arg1_of___FindConstantFn_must_be_, constant_name);
        }
        return NIL;
    }

    /**
     * Returns a constant if it exists, o/w throws an error.
     */
    @LispMethod(comment = "Returns a constant if it exists, o/w throws an error.")
    public static SubLObject cyc_find_constant(final SubLObject nat) {
        final SubLObject constant_name = cycl_utilities.nat_arg1(nat, UNPROVIDED);
        if (constant_name.isString()) {
            final SubLObject constant = constants_high.find_constant(constant_name);
            if (NIL != constant) {
                return constant;
            }
            Errors.error($str18$Could_not_find_constant__A_, constant_name);
        }
        Errors.error($str19$Arg1_of___FindConstantFn_must_be_, constant_name);
        return NIL;
    }

    public static final SubLObject evaluatable_function_count_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = ZERO_INTEGER;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject cdolist_list_var = isa.all_fort_instances($$EvaluatableFunction, UNPROVIDED, UNPROVIDED);
                            SubLObject pred = NIL;
                            for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                                {
                                    SubLObject defn = cycl_subl_symbol_symbol(kb_mapping_utilities.fpred_value_in_any_mt(pred, $$evaluationDefn, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                    if (defn.isSymbol() && (NIL != fboundp(defn))) {
                                        count = add(count, ONE_INTEGER);
                                    }
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return count;
            }
        }
    }

    public static SubLObject evaluatable_function_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject cdolist_list_var = isa.all_fort_instances($$EvaluatableFunction, UNPROVIDED, UNPROVIDED);
            SubLObject pred = NIL;
            pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject defn = cycl_subl_symbol_symbol(kb_mapping_utilities.fpred_value_in_any_mt(pred, $$evaluationDefn, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                if (defn.isSymbol() && (NIL != fboundp(defn))) {
                    count = add(count, ONE_INTEGER);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    /**
     * #$evaluationDefn for #$EvaluateSubLFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$EvaluateSubLFn")
    public static final SubLObject cyc_evaluate_subl_alt(SubLObject form) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject result = removal_modules_perform_subl.evaluate_subl_expression(form);
                SubLObject successfulP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL == successfulP) {
                    relation_evaluation.throw_unevaluatable();
                }
                return result;
            }
        }
    }

    /**
     * #$evaluationDefn for #$EvaluateSubLFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$EvaluateSubLFn")
    public static SubLObject cyc_evaluate_subl(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject result = removal_modules_perform_subl.evaluate_subl_expression(form);
        final SubLObject successfulP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == successfulP) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }

    /**
     * #$evaluationDefn for #$StringUpcaseFn.
     */
    @LispMethod(comment = "#$evaluationDefn for #$StringUpcaseFn.")
    public static final SubLObject cyc_string_upcase_alt(SubLObject string) {
        if (!string.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        return Strings.string_upcase(string, UNPROVIDED, UNPROVIDED);
    }

    /**
     * #$evaluationDefn for #$StringUpcaseFn.
     */
    @LispMethod(comment = "#$evaluationDefn for #$StringUpcaseFn.")
    public static SubLObject cyc_string_upcase(final SubLObject string) {
        if (!string.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        return Strings.string_upcase(string, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject string_upcase_defn_alt(SubLObject string) {
        return com.cyc.cycjava.cycl.evaluation_defns.cyc_string_upcase(string);
    }

    public static SubLObject string_upcase_defn(final SubLObject string) {
        return cyc_string_upcase(string);
    }

    /**
     * #$evaluationDefn for #$StringDowncaseFn.
     */
    @LispMethod(comment = "#$evaluationDefn for #$StringDowncaseFn.")
    public static final SubLObject cyc_string_downcase_alt(SubLObject string) {
        if (!string.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        return Strings.string_downcase(string, UNPROVIDED, UNPROVIDED);
    }

    /**
     * #$evaluationDefn for #$StringDowncaseFn.
     */
    @LispMethod(comment = "#$evaluationDefn for #$StringDowncaseFn.")
    public static SubLObject cyc_string_downcase(final SubLObject string) {
        if (!string.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        return Strings.string_downcase(string, UNPROVIDED, UNPROVIDED);
    }

    /**
     * #$evaluationDefn for #$SubstringFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$SubstringFn")
    public static final SubLObject cyc_substring_alt(SubLObject string, SubLObject start, SubLObject end) {
        if (NIL == unicode_nauts.string_or_unicode_naut_p(string)) {
            relation_evaluation.throw_unevaluatable();
        } else {
            if ((end.numG(com.cyc.cycjava.cycl.evaluation_defns.cyc_length(string)) || start.numL(ZERO_INTEGER)) || start.numG(end)) {
                relation_evaluation.throw_unevaluatable();
            } else {
                if (string.isString()) {
                    return string_utilities.substring(string, start, end);
                } else {
                    if (NIL != unicode_nauts.unicode_naut_p(string)) {
                        return unicode_nauts.unicode_substring(string, start, end);
                    } else {
                        relation_evaluation.throw_unevaluatable();
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * #$evaluationDefn for #$SubstringFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$SubstringFn")
    public static SubLObject cyc_substring(final SubLObject string, final SubLObject start, final SubLObject end) {
        if (NIL == unicode_nauts.string_or_unicode_naut_p(string)) {
            relation_evaluation.throw_unevaluatable();
        } else
            if ((end.numG(cyc_length(string)) || start.numL(ZERO_INTEGER)) || start.numG(end)) {
                relation_evaluation.throw_unevaluatable();
            } else {
                if (string.isString()) {
                    return string_utilities.substring(string, start, end);
                }
                if (NIL != unicode_nauts.unicode_naut_p(string, UNPROVIDED)) {
                    return unicode_nauts.unicode_substring(string, start, end);
                }
                relation_evaluation.throw_unevaluatable();
            }

        return NIL;
    }

    /**
     * #$evaluationDefn for #$StringConcatFn
     *
     * @see cyc-concatenate-strings
     */
    @LispMethod(comment = "#$evaluationDefn for #$StringConcatFn\r\n\r\n@see cyc-concatenate-strings")
    public static final SubLObject cyc_string_concat_alt(SubLObject strings) {
        if ((NIL == strings) || (NIL != list_utilities.find_if_not(symbol_function(STRINGP), strings, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            relation_evaluation.throw_unevaluatable();
        }
        return apply(symbol_function(CCONCATENATE), strings);
    }

    /**
     * #$evaluationDefn for #$StringConcatFn
     *
     * @see cyc-concatenate-strings
     */
    @LispMethod(comment = "#$evaluationDefn for #$StringConcatFn\r\n\r\n@see cyc-concatenate-strings")
    public static SubLObject cyc_string_concat(final SubLObject strings) {
        if ((NIL == strings) || (NIL != list_utilities.find_if_not(symbol_function(STRINGP), strings, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            relation_evaluation.throw_unevaluatable();
        }
        return apply(symbol_function(CCONCATENATE), strings);
    }

    /**
     * #EvaluationDefn for #$StringsToPhraseFn. Returns the concatenation of all
     * strings in STRINGS (a list of strings) with a space inserted after each
     * individual one.
     */
    @LispMethod(comment = "#EvaluationDefn for #$StringsToPhraseFn. Returns the concatenation of all\r\nstrings in STRINGS (a list of strings) with a space inserted after each\r\nindividual one.\n#EvaluationDefn for #$StringsToPhraseFn. Returns the concatenation of all\nstrings in STRINGS (a list of strings) with a space inserted after each\nindividual one.")
    public static final SubLObject cyc_strings_to_phrase_alt(SubLObject strings) {
        if (NIL == el_non_empty_list_p(strings)) {
            relation_evaluation.throw_unevaluatable();
        } else {
            if (NIL != list_utilities.find_if_not(symbol_function(STRINGP), el_list_items(strings), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                relation_evaluation.throw_unevaluatable();
            } else {
                if (NIL == strings) {
                    return $str_alt29$;
                } else {
                    {
                        SubLObject result = $str_alt29$;
                        SubLObject cdolist_list_var = butlast(el_list_items(strings), UNPROVIDED);
                        SubLObject string = NIL;
                        for (string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , string = cdolist_list_var.first()) {
                            result = cconcatenate(result, new SubLObject[]{ string, $str_alt30$_ });
                        }
                        return cconcatenate(result, last(strings, UNPROVIDED).first());
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * #EvaluationDefn for #$StringsToPhraseFn. Returns the concatenation of all
     * strings in STRINGS (a list of strings) with a space inserted after each
     * individual one.
     */
    @LispMethod(comment = "#EvaluationDefn for #$StringsToPhraseFn. Returns the concatenation of all\r\nstrings in STRINGS (a list of strings) with a space inserted after each\r\nindividual one.\n#EvaluationDefn for #$StringsToPhraseFn. Returns the concatenation of all\nstrings in STRINGS (a list of strings) with a space inserted after each\nindividual one.")
    public static SubLObject cyc_strings_to_phrase(final SubLObject strings) {
        if (NIL == el_non_empty_list_p(strings)) {
            relation_evaluation.throw_unevaluatable();
        } else
            if (NIL != list_utilities.find_if_not(symbol_function(STRINGP), el_list_items(strings), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                relation_evaluation.throw_unevaluatable();
            } else {
                if (NIL == strings) {
                    return $str31$;
                }
                SubLObject result = $str31$;
                SubLObject cdolist_list_var = butlast(el_list_items(strings), UNPROVIDED);
                SubLObject string = NIL;
                string = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    result = cconcatenate(result, new SubLObject[]{ string, $$$_ });
                    cdolist_list_var = cdolist_list_var.rest();
                    string = cdolist_list_var.first();
                } 
                return cconcatenate(result, last(strings, UNPROVIDED).first());
            }

        return NIL;
    }

    /**
     * #$evaluationDefn for #$StringPreremoveFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$StringPreremoveFn")
    public static final SubLObject cyc_pre_remove_alt(SubLObject string1, SubLObject string2) {
        if (!(string1.isString() && string2.isString())) {
            relation_evaluation.throw_unevaluatable();
        }
        return string_utilities.pre_remove(string1, string2, UNPROVIDED);
    }

    /**
     * #$evaluationDefn for #$StringPreremoveFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$StringPreremoveFn")
    public static SubLObject cyc_pre_remove(final SubLObject string1, final SubLObject string2) {
        if ((!string1.isString()) || (!string2.isString())) {
            relation_evaluation.throw_unevaluatable();
        }
        return string_utilities.pre_remove(string1, string2, UNPROVIDED);
    }

    /**
     * #$evaluationDefn for #$StringReplaceSubstringFn.
     */
    @LispMethod(comment = "#$evaluationDefn for #$StringReplaceSubstringFn.")
    public static final SubLObject cyc_replace_substring_alt(SubLObject string, SubLObject substring, SubLObject newstring) {
        if ((string.isString() && (NIL != string_utilities.non_empty_string_p(substring))) && newstring.isString()) {
            return string_utilities.string_substitute(newstring, substring, string, UNPROVIDED);
        } else {
            if (((NIL != com.cyc.cycjava.cycl.evaluation_defns.unicode_naut_or_ascii_string_p(string)) && ((NIL != string_utilities.non_empty_string_p(substring)) || ((NIL != unicode_nauts.unicode_naut_p(substring)) && (NIL != string_utilities.non_empty_string_p(cycl_utilities.nat_arg1(substring, UNPROVIDED)))))) && (NIL != com.cyc.cycjava.cycl.evaluation_defns.unicode_naut_or_ascii_string_p(newstring))) {
                {
                    SubLObject new_unicode_vector = vector_utilities.vector_nreplace_subsequence(com.cyc.cycjava.cycl.evaluation_defns.unicode_naut_or_string_to_unicode_vector(newstring), com.cyc.cycjava.cycl.evaluation_defns.unicode_naut_or_string_to_unicode_vector(substring), com.cyc.cycjava.cycl.evaluation_defns.unicode_naut_or_string_to_unicode_vector(string), UNPROVIDED, UNPROVIDED);
                    return NIL != find($int$128, new_unicode_vector, symbol_function($sym34$__), UNPROVIDED, UNPROVIDED, UNPROVIDED) ? ((SubLObject) (unicode_nauts.make_unicode_naut(unicode_strings.unicode_vector_to_display(new_unicode_vector)))) : unicode_strings.unicode_vector_to_display(new_unicode_vector);
                }
            } else {
                relation_evaluation.throw_unevaluatable();
            }
        }
        return NIL;
    }

    /**
     * #$evaluationDefn for #$StringReplaceSubstringFn.
     */
    @LispMethod(comment = "#$evaluationDefn for #$StringReplaceSubstringFn.")
    public static SubLObject cyc_replace_substring(final SubLObject string, final SubLObject substring, final SubLObject newstring) {
        if ((string.isString() && (NIL != string_utilities.non_empty_string_p(substring))) && newstring.isString()) {
            return string_utilities.string_substitute(newstring, substring, string, UNPROVIDED);
        }
        if (((NIL != unicode_naut_or_ascii_string_p(string)) && ((NIL != string_utilities.non_empty_string_p(substring)) || ((NIL != unicode_nauts.unicode_naut_p(substring, UNPROVIDED)) && (NIL != string_utilities.non_empty_string_p(cycl_utilities.nat_arg1(substring, UNPROVIDED)))))) && (NIL != unicode_naut_or_ascii_string_p(newstring))) {
            final SubLObject new_unicode_vector = vector_utilities.vector_nreplace_subsequence(cycl_string.cycl_string_to_unicode_vector(newstring), cycl_string.cycl_string_to_unicode_vector(substring), cycl_string.cycl_string_to_unicode_vector(string), UNPROVIDED, UNPROVIDED);
            return NIL != find($int$128, new_unicode_vector, symbol_function($sym36$__), UNPROVIDED, UNPROVIDED, UNPROVIDED) ? unicode_nauts.make_unicode_naut(unicode_strings.unicode_vector_to_display(new_unicode_vector)) : unicode_strings.unicode_vector_to_display(new_unicode_vector);
        }
        relation_evaluation.throw_unevaluatable();
        return NIL;
    }

    public static final SubLObject unicode_naut_or_ascii_string_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != unicode_strings.ascii_string_p(v_object)) || (NIL != unicode_nauts.unicode_naut_p(v_object)));
    }

    public static SubLObject unicode_naut_or_ascii_string_p(final SubLObject v_object) {
        return makeBoolean((NIL != unicode_strings.ascii_string_p(v_object)) || (NIL != unicode_nauts.unicode_naut_p(v_object, UNPROVIDED)));
    }

    /**
     * #$evaluationDefn for #$UniqueWordSenseFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$UniqueWordSenseFn")
    public static final SubLObject cyc_unique_ws_alt(SubLObject wu, SubLObject pos, SubLObject denot) {
        if (!(((NIL != forts.fort_p(wu)) && (NIL != forts.fort_p(pos))) && (NIL != forts.fort_p(denot)))) {
            relation_evaluation.throw_unevaluatable();
        }
        return lexicon_utilities.unique_ws(wu, pos, denot);
    }

    /**
     * #$evaluationDefn for #$UniqueWordSenseFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$UniqueWordSenseFn")
    public static SubLObject cyc_unique_ws(final SubLObject wu, final SubLObject pos, final SubLObject denot) {
        if (((NIL == forts.fort_p(wu)) || (NIL == forts.fort_p(pos))) || (NIL == forts.fort_p(denot))) {
            relation_evaluation.throw_unevaluatable();
        }
        return lexicon_utilities.unique_ws(wu, pos, denot);
    }

    /**
     * #$evaluationDefn for #$NamesForTermFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$NamesForTermFn")
    public static final SubLObject generate_names_for_term_alt(SubLObject v_term) {
        if (!((NIL != forts.fort_p(v_term)) || (NIL != misc_kb_utilities.instance_named_fn_expression_p(v_term)))) {
            relation_evaluation.throw_unevaluatable();
        }
        return make_el_list(pph_methods_lexicon.names_for_term(v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
    }

    /**
     * #$evaluationDefn for #$NamesForTermFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$NamesForTermFn")
    public static SubLObject generate_names_for_term(final SubLObject v_term) {
        if ((NIL == forts.fort_p(v_term)) && (NIL == misc_kb_utilities.instance_named_fn_expression_p(v_term))) {
            relation_evaluation.throw_unevaluatable();
        }
        return make_el_list(pph_methods_lexicon.names_for_term(v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
    }

    /**
     * #$evaluationDefn for #$StringRemoveSubstringFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$StringRemoveSubstringFn")
    public static final SubLObject cyc_remove_substring_alt(SubLObject string1, SubLObject string2) {
        if (!(string1.isString() && string2.isString())) {
            relation_evaluation.throw_unevaluatable();
        }
        return string_utilities.remove_substring(string1, string2);
    }

    /**
     * #$evaluationDefn for #$StringRemoveSubstringFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$StringRemoveSubstringFn")
    public static SubLObject cyc_remove_substring(final SubLObject string1, final SubLObject string2) {
        if ((!string1.isString()) || (!string2.isString())) {
            relation_evaluation.throw_unevaluatable();
        }
        return string_utilities.remove_substring(string1, string2);
    }

    /**
     * #$evaluationDefn for #$StringPostremoveFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$StringPostremoveFn")
    public static final SubLObject cyc_post_remove_alt(SubLObject string1, SubLObject string2) {
        if (!(string1.isString() && string2.isString())) {
            relation_evaluation.throw_unevaluatable();
        }
        return string_utilities.post_remove(string1, string2, UNPROVIDED);
    }

    /**
     * #$evaluationDefn for #$StringPostremoveFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$StringPostremoveFn")
    public static SubLObject cyc_post_remove(final SubLObject string1, final SubLObject string2) {
        if ((!string1.isString()) || (!string2.isString())) {
            relation_evaluation.throw_unevaluatable();
        }
        return string_utilities.post_remove(string1, string2, UNPROVIDED);
    }

    /**
     * #$evaluationDefn for #$StringTrimWhiteSpaceFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$StringTrimWhiteSpaceFn")
    public static final SubLObject cyc_trim_whitespace_alt(SubLObject string) {
        if (!string.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        return string_utilities.trim_whitespace(string);
    }

    /**
     * #$evaluationDefn for #$StringTrimWhiteSpaceFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$StringTrimWhiteSpaceFn")
    public static SubLObject cyc_trim_whitespace(final SubLObject string) {
        if (!string.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        return string_utilities.trim_whitespace(string);
    }

    /**
     * #$evaluationDefn for #$StringSearchFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$StringSearchFn")
    public static final SubLObject cyc_string_search_alt(SubLObject string1, SubLObject string2) {
        if (!(string1.isString() && string2.isString())) {
            relation_evaluation.throw_unevaluatable();
        }
        return search(string1, string2, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * #$evaluationDefn for #$StringSearchFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$StringSearchFn")
    public static SubLObject cyc_string_search(final SubLObject string1, final SubLObject string2) {
        if ((!string1.isString()) || (!string2.isString())) {
            relation_evaluation.throw_unevaluatable();
        }
        return search(string1, string2, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * #$evaluationDefn for #$LengthOfStringFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$LengthOfStringFn")
    public static final SubLObject cyc_length_alt(SubLObject sequence) {
        if (sequence.isString()) {
            return length(sequence);
        } else {
            if (NIL != unicode_nauts.unicode_naut_p(sequence)) {
                return length(unicode_strings.display_to_unicode_vector(cycl_utilities.nat_arg1(sequence, UNPROVIDED)));
            } else {
                relation_evaluation.throw_unevaluatable();
            }
        }
        return NIL;
    }

    /**
     * #$evaluationDefn for #$LengthOfStringFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$LengthOfStringFn")
    public static SubLObject cyc_length(final SubLObject sequence) {
        if (sequence.isString()) {
            return length(sequence);
        }
        if (NIL != unicode_nauts.unicode_naut_p(sequence, UNPROVIDED)) {
            return length(unicode_strings.display_to_unicode_vector(cycl_utilities.nat_arg1(sequence, UNPROVIDED)));
        }
        relation_evaluation.throw_unevaluatable();
        return NIL;
    }

    /**
     * #$evaluationDefn for #$StringToIntegerFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$StringToIntegerFn")
    public static final SubLObject cyc_string_to_integer_alt(SubLObject string) {
        if (!string.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        {
            SubLObject result = read_from_string_ignoring_errors(string_utilities.remove_substring(string, $str_alt43$_), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (result.isInteger()) {
                return result;
            } else {
                relation_evaluation.throw_unevaluatable();
            }
        }
        return NIL;
    }

    /**
     * #$evaluationDefn for #$StringToIntegerFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$StringToIntegerFn")
    public static SubLObject cyc_string_to_integer(final SubLObject string) {
        if (!string.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject result = read_from_string_ignoring_errors(string_utilities.remove_substring(string, $str45$_), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (result.isInteger()) {
            return result;
        }
        relation_evaluation.throw_unevaluatable();
        return NIL;
    }

    public static SubLObject cyc_integral_number_to_integer(final SubLObject extended_number) {
        if (NIL == extended_numbers.extended_number_integer_p(extended_number)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject result = extended_numbers.extended_number_to_subl_real(extended_number);
        if (result.isInteger()) {
            return result;
        }
        relation_evaluation.throw_unevaluatable();
        return NIL;
    }

    /**
     * #$evaluationDefn for #$IntegerToStringFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$IntegerToStringFn")
    public static final SubLObject cyc_integer_to_string_alt(SubLObject integer) {
        if (!integer.isInteger()) {
            relation_evaluation.throw_unevaluatable();
        }
        return princ_to_string(integer);
    }

    /**
     * #$evaluationDefn for #$IntegerToStringFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$IntegerToStringFn")
    public static SubLObject cyc_integer_to_string(final SubLObject integer) {
        if (!integer.isInteger()) {
            relation_evaluation.throw_unevaluatable();
        }
        return princ_to_string(integer);
    }

    public static SubLObject cyc_stringify_fn(final SubLObject v_object) {
        return princ_to_string(v_object);
    }

    public static SubLObject cyc_syntactic_disquotation(final SubLObject string) {
        final SubLObject pcase_var = identify_pattern(string);
        if (pcase_var.eql($MIXEDFRACTION)) {
            final SubLObject v_bindings = Mapping.mapcar(symbol_function(CYC_STRING_TO_REAL_NUMBER), regular_expression_utilities.regexp_capturing_match($str52$__0_9______0_9______0_9___, string, UNPROVIDED, UNPROVIDED).rest());
            if (((v_bindings.first().isInteger() && second(v_bindings).isInteger()) && third(v_bindings).isInteger()) && third(v_bindings).numGE(second(v_bindings))) {
                return make_el_formula($$MixedFractionFn, v_bindings, UNPROVIDED);
            }
            relation_evaluation.throw_unevaluatable();
        } else
            if (pcase_var.eql($SIMPLEFRACTION)) {
                final SubLObject v_bindings = Mapping.mapcar(symbol_function(CYC_STRING_TO_REAL_NUMBER), regular_expression_utilities.regexp_capturing_match($str55$__0_9______0_9___, string, UNPROVIDED, UNPROVIDED).rest());
                if (v_bindings.first().isInteger() && (NIL != subl_promotions.non_zero_integer_p(second(v_bindings)))) {
                    return make_el_formula($$SimpleFractionFn, v_bindings, UNPROVIDED);
                }
                relation_evaluation.throw_unevaluatable();
            } else
                if (pcase_var.eql($DECIMALNUMBER)) {
                    final SubLObject v_bindings = regular_expression_utilities.regexp_capturing_match($str58$__0_9_______0_9___, string, UNPROVIDED, UNPROVIDED).rest();
                    final SubLObject decimal_place = length(second(v_bindings));
                    final SubLObject number_no_dot = cyc_string_to_real_number(cconcatenate(v_bindings.first(), second(v_bindings)));
                    if (number_no_dot.isInteger()) {
                        return make_el_formula($$DecimalFractionFn, list(number_no_dot, decimal_place), UNPROVIDED);
                    }
                    relation_evaluation.throw_unevaluatable();
                } else
                    if (pcase_var.eql($NUMBER)) {
                        final SubLObject v_bindings = Mapping.mapcar(symbol_function(CYC_STRING_TO_REAL_NUMBER), regular_expression_utilities.regexp_capturing_match($str61$__0_9___, string, UNPROVIDED, UNPROVIDED).rest());
                        if (v_bindings.first().isInteger()) {
                            return v_bindings.first();
                        }
                        relation_evaluation.throw_unevaluatable();
                    }



        return NIL;
    }

    public static SubLObject identify_pattern(final SubLObject string) {
        if (NIL != regular_expression_utilities.regex_match_compile_pattern($str63$_0_9____0_9____0_9__, string)) {
            return $MIXEDFRACTION;
        }
        if (NIL != regular_expression_utilities.regex_match_compile_pattern($str64$_0_9____0_9__, string)) {
            return $SIMPLEFRACTION;
        }
        if (NIL != regular_expression_utilities.regex_match_compile_pattern($str65$_0_9_____0_9__, string)) {
            return $DECIMALNUMBER;
        }
        if (NIL != regular_expression_utilities.regex_match_compile_pattern($str66$_0_9__, string)) {
            return $NUMBER;
        }
        relation_evaluation.throw_unevaluatable();
        return NIL;
    }

    /**
     * #$evaluationDefn for #$StringToRealNumberFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$StringToRealNumberFn")
    public static final SubLObject cyc_string_to_real_number_alt(SubLObject string) {
        if (!string.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        {
            SubLObject result = read_from_string_ignoring_errors(string_utilities.remove_substring(string, $str_alt43$_), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != collection_defns.cyc_real_number(result)) {
                return result;
            } else {
                relation_evaluation.throw_unevaluatable();
            }
        }
        return NIL;
    }

    /**
     * #$evaluationDefn for #$StringToRealNumberFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$StringToRealNumberFn")
    public static SubLObject cyc_string_to_real_number(final SubLObject string) {
        if (!string.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject result = read_from_string_ignoring_errors(string_utilities.remove_substring(string, $str45$_), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != collection_defns.cyc_real_number(result)) {
            return result;
        }
        relation_evaluation.throw_unevaluatable();
        return NIL;
    }

    /**
     * #$evaluationDefn for #$RealNumberToStringFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$RealNumberToStringFn")
    public static final SubLObject cyc_real_number_to_string_alt(SubLObject number) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == collection_defns.cyc_real_number(number)) {
                relation_evaluation.throw_unevaluatable();
            }
            {
                SubLObject string = NIL;
                {
                    SubLObject _prev_bind_0 = $read_default_float_format$.currentBinding(thread);
                    try {
                        $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
                        string = princ_to_string(number);
                    } finally {
                        $read_default_float_format$.rebind(_prev_bind_0, thread);
                    }
                }
                return string;
            }
        }
    }

    /**
     * #$evaluationDefn for #$RealNumberToStringFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$RealNumberToStringFn")
    public static SubLObject cyc_real_number_to_string(final SubLObject number) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == collection_defns.cyc_real_number(number)) {
            relation_evaluation.throw_unevaluatable();
        }
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    if (NIL != scientific_numbers.scientific_number_p(number)) {
                        return scientific_numbers.scientific_number_to_string(number, UNPROVIDED);
                    }
                    if (number.isNumber()) {
                        final SubLObject _prev_bind_0_$1 = $read_default_float_format$.currentBinding(thread);
                        try {
                            $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
                            return princ_to_string(number);
                        } finally {
                            $read_default_float_format$.rebind(_prev_bind_0_$1, thread);
                        }
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        relation_evaluation.throw_unevaluatable();
        return NIL;
    }

    public static final SubLObject max_supported_formula_arity_alt() {
        return $max_supported_formula_arity$.getGlobalValue();
    }

    public static SubLObject max_supported_formula_arity() {
        return $max_supported_formula_arity$.getGlobalValue();
    }

    /**
     * #$evaluationDefn for #$StringTokenizeFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$StringTokenizeFn")
    public static final SubLObject cyc_string_tokenize_alt(SubLObject big_string, SubLObject separator_strings) {
        if (!((NIL != unicode_nauts.string_or_unicode_naut_p(big_string)) && (NIL != el_list_p(separator_strings)))) {
            relation_evaluation.throw_unevaluatable();
        }
        {
            SubLObject big_string_is_unicodeP = unicode_nauts.unicode_naut_p(big_string);
            SubLObject stringy_string = (NIL != big_string_is_unicodeP) ? ((SubLObject) (cycl_utilities.nat_arg1(big_string, UNPROVIDED))) : big_string;
            SubLObject stringy_strings = string_utilities.string_tokenize(stringy_string, el_list_items(separator_strings), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject cyc_strings = NIL;
            SubLObject cdolist_list_var = stringy_strings;
            SubLObject string = NIL;
            for (string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , string = cdolist_list_var.first()) {
                cyc_strings = cons(NIL != big_string_is_unicodeP ? ((SubLObject) (unicode_nauts.display_vector_string_to_cycl_safe_string(string))) : string, cyc_strings);
            }
            if (NIL != list_utilities.lengthG(cyc_strings, com.cyc.cycjava.cycl.evaluation_defns.max_supported_formula_arity(), UNPROVIDED)) {
                relation_evaluation.throw_unevaluatable();
            }
            return make_el_list(nreverse(cyc_strings), UNPROVIDED);
        }
    }

    /**
     * #$evaluationDefn for #$StringTokenizeFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$StringTokenizeFn")
    public static SubLObject cyc_string_tokenize(final SubLObject big_string, final SubLObject separator_strings) {
        if ((NIL == unicode_nauts.string_or_unicode_naut_p(big_string)) || (NIL == el_list_p(separator_strings))) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject cyc_strings = cycl_string.cycl_string_tokenize(big_string, el_list_items(separator_strings));
        if (NIL != list_utilities.lengthG(cyc_strings, max_supported_formula_arity(), UNPROVIDED)) {
            relation_evaluation.throw_unevaluatable();
        }
        return make_el_list(cyc_strings, UNPROVIDED);
    }

    public static SubLObject cyc_string_to_nth_code_point(final SubLObject str, final SubLObject n) {
        if ((NIL == cycl_string.cycl_string_p(str)) || (NIL == subl_promotions.non_negative_integer_p(n))) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject unicode_vector = cycl_string.cycl_string_to_unicode_vector(str);
        return aref(unicode_vector, n);
    }

    /**
     * #$evaluationDefn for #$HTTP-URL-EncodeFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$HTTP-URL-EncodeFn")
    public static final SubLObject cyc_http_url_encode_alt(SubLObject string) {
        if (!string.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        return web_utilities.html_url_encode(string, UNPROVIDED);
    }

    /**
     * #$evaluationDefn for #$HTTP-URL-EncodeFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$HTTP-URL-EncodeFn")
    public static SubLObject cyc_http_url_encode(final SubLObject string) {
        if (!string.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        return web_utilities.html_url_encode(string, UNPROVIDED);
    }

    public static SubLObject cyc_xml_value_string(final SubLObject url, final SubLObject field_name, final SubLObject staleness_cutoff) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    SubLObject seconds = NIL;
                    seconds = date_utilities.convert_time_quant_to_seconds(staleness_cutoff);
                    thread.resetMultipleValues();
                    final SubLObject machine = web_utilities.parse_http_url(url_string(url));
                    final SubLObject port = thread.secondMultipleValue();
                    final SubLObject url_string = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    final SubLObject value = xml_retrieval.get_xml_field_value(machine, url_string, field_name, seconds, port, UNPROVIDED);
                    if (value.isString()) {
                        return value;
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        relation_evaluation.throw_unevaluatable();
        return NIL;
    }

    public static SubLObject cyc_http_url_decode(final SubLObject string) {
        if (!string.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        return web_utilities.html_url_decode(string);
    }

    public static SubLObject cyc_acronym_from_string(final SubLObject string) {
        relation_evaluation.throw_unevaluatable();
        return NIL;
    }

    /**
     *
     *
     * @unknown baxter
     */
    @LispMethod(comment = "@unknown baxter")
    public static final SubLObject cyc_html_image_alt(SubLObject src, SubLObject options) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!(src.isString() && (NIL != el_list_p(options)))) {
                relation_evaluation.throw_unevaluatable();
            }
            {
                SubLObject html_string = NIL;
                SubLObject error_message = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                {
                                    SubLObject datum = com.cyc.cycjava.cycl.evaluation_defns.html_image_plist(options);
                                    SubLObject current = datum;
                                    SubLObject allow_other_keys_p = NIL;
                                    SubLObject rest = current;
                                    SubLObject bad = NIL;
                                    SubLObject current_1 = NIL;
                                    for (; NIL != rest;) {
                                        destructuring_bind_must_consp(rest, datum, $list_alt53);
                                        current_1 = rest.first();
                                        rest = rest.rest();
                                        destructuring_bind_must_consp(rest, datum, $list_alt53);
                                        if (NIL == member(current_1, $list_alt54, UNPROVIDED, UNPROVIDED)) {
                                            bad = T;
                                        }
                                        if (current_1 == $ALLOW_OTHER_KEYS) {
                                            allow_other_keys_p = rest.first();
                                        }
                                        rest = rest.rest();
                                    }
                                    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                        cdestructuring_bind_error(datum, $list_alt53);
                                    }
                                    {
                                        SubLObject id_tail = property_list_member($ID, current);
                                        SubLObject id = (NIL != id_tail) ? ((SubLObject) (cadr(id_tail))) : NIL;
                                        SubLObject class_tail = property_list_member($CLASS, current);
                                        SubLObject v_class = (NIL != class_tail) ? ((SubLObject) (cadr(class_tail))) : NIL;
                                        SubLObject ismap_tail = property_list_member($ISMAP, current);
                                        SubLObject ismap = (NIL != ismap_tail) ? ((SubLObject) (cadr(ismap_tail))) : NIL;
                                        SubLObject height_tail = property_list_member($HEIGHT, current);
                                        SubLObject height = (NIL != height_tail) ? ((SubLObject) (cadr(height_tail))) : NIL;
                                        SubLObject width_tail = property_list_member($WIDTH, current);
                                        SubLObject width = (NIL != width_tail) ? ((SubLObject) (cadr(width_tail))) : NIL;
                                        SubLObject alt_tail = property_list_member($ALT, current);
                                        SubLObject alt = (NIL != alt_tail) ? ((SubLObject) (cadr(alt_tail))) : NIL;
                                        SubLObject align_tail = property_list_member($ALIGN, current);
                                        SubLObject align = (NIL != align_tail) ? ((SubLObject) (cadr(align_tail))) : NIL;
                                        SubLObject border_tail = property_list_member($BORDER, current);
                                        SubLObject border = (NIL != border_tail) ? ((SubLObject) (cadr(border_tail))) : NIL;
                                        SubLObject stream = NIL;
                                        try {
                                            stream = make_private_string_output_stream();
                                            {
                                                SubLObject _prev_bind_0_2 = html_macros.$html_stream$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_stream$.bind(stream, thread);
                                                    html_markup(html_macros.$html_image_head$.getGlobalValue());
                                                    html_markup(html_macros.$html_image_src$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(src);
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    if (NIL != id) {
                                                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(id);
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    if (NIL != v_class) {
                                                        html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(v_class);
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    if (NIL != ismap) {
                                                        html_simple_attribute(html_macros.$html_image_ismap$.getGlobalValue());
                                                    }
                                                    if (NIL != height) {
                                                        html_markup(html_macros.$html_image_height$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(height);
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    if (NIL != width) {
                                                        html_markup(html_macros.$html_image_width$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(width);
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    if (NIL != alt) {
                                                        html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(alt);
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    if (NIL != align) {
                                                        html_markup(html_macros.$html_image_align$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(html_align(align));
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    if (NIL != border) {
                                                        html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(border);
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                                                        }
                                                    }
                                                    html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_stream$.rebind(_prev_bind_0_2, thread);
                                                }
                                            }
                                            html_string = get_output_stream_string(stream);
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    close(stream, UNPROVIDED);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_4, thread);
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                }
                if (NIL != error_message) {
                    relation_evaluation.throw_unevaluatable();
                }
                return html_string;
            }
        }
    }

    /**
     *
     *
     * @unknown baxter
     */
    @LispMethod(comment = "@unknown baxter")
    public static SubLObject cyc_html_image(final SubLObject src, final SubLObject options) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((!src.isString()) || (NIL == el_list_p(options))) {
            relation_evaluation.throw_unevaluatable();
        }
        SubLObject html_string = NIL;
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject current;
                    final SubLObject datum = current = html_image_plist(options);
                    SubLObject allow_other_keys_p = NIL;
                    SubLObject rest = current;
                    SubLObject bad = NIL;
                    SubLObject current_$2 = NIL;
                    while (NIL != rest) {
                        destructuring_bind_must_consp(rest, datum, $list80);
                        current_$2 = rest.first();
                        rest = rest.rest();
                        destructuring_bind_must_consp(rest, datum, $list80);
                        if (NIL == member(current_$2, $list81, UNPROVIDED, UNPROVIDED)) {
                            bad = T;
                        }
                        if (current_$2 == $ALLOW_OTHER_KEYS) {
                            allow_other_keys_p = rest.first();
                        }
                        rest = rest.rest();
                    } 
                    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                        cdestructuring_bind_error(datum, $list80);
                    }
                    final SubLObject id_tail = property_list_member($ID, current);
                    final SubLObject id = (NIL != id_tail) ? cadr(id_tail) : NIL;
                    final SubLObject class_tail = property_list_member($CLASS, current);
                    final SubLObject v_class = (NIL != class_tail) ? cadr(class_tail) : NIL;
                    final SubLObject ismap_tail = property_list_member($ISMAP, current);
                    final SubLObject ismap = (NIL != ismap_tail) ? cadr(ismap_tail) : NIL;
                    final SubLObject height_tail = property_list_member($HEIGHT, current);
                    final SubLObject height = (NIL != height_tail) ? cadr(height_tail) : NIL;
                    final SubLObject width_tail = property_list_member($WIDTH, current);
                    final SubLObject width = (NIL != width_tail) ? cadr(width_tail) : NIL;
                    final SubLObject alt_tail = property_list_member($ALT, current);
                    final SubLObject alt = (NIL != alt_tail) ? cadr(alt_tail) : NIL;
                    final SubLObject align_tail = property_list_member($ALIGN, current);
                    final SubLObject align = (NIL != align_tail) ? cadr(align_tail) : NIL;
                    final SubLObject border_tail = property_list_member($BORDER, current);
                    final SubLObject border = (NIL != border_tail) ? cadr(border_tail) : NIL;
                    SubLObject stream = NIL;
                    try {
                        stream = make_private_string_output_stream();
                        final SubLObject _prev_bind_0_$3 = html_macros.$html_stream$.currentBinding(thread);
                        try {
                            html_macros.$html_stream$.bind(stream, thread);
                            html_markup(html_macros.$html_image_head$.getGlobalValue());
                            html_markup(html_macros.$html_image_src$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(src);
                            html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != id) {
                                html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(id);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != v_class) {
                                html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(v_class);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != ismap) {
                                html_simple_attribute(html_macros.$html_image_ismap$.getGlobalValue());
                            }
                            if (NIL != height) {
                                html_markup(html_macros.$html_image_height$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(height);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != width) {
                                html_markup(html_macros.$html_image_width$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(width);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != alt) {
                                html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(alt);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != align) {
                                html_markup(html_macros.$html_image_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align(align));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != border) {
                                html_markup(html_macros.$html_image_border$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(border);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                            }
                            html_markup(html_macros.$html_image_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_stream$.rebind(_prev_bind_0_$3, thread);
                        }
                        html_string = get_output_stream_string(stream);
                    } finally {
                        final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            close(stream, UNPROVIDED);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                        }
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error_message) {
            relation_evaluation.throw_unevaluatable();
        }
        return html_string;
    }

    public static final SubLObject html_image_plist_alt(SubLObject options) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject plist = NIL;
                SubLObject cdolist_list_var = el_list_items(options);
                SubLObject item = NIL;
                for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                    thread.resetMultipleValues();
                    {
                        SubLObject key = com.cyc.cycjava.cycl.evaluation_defns.decode_html_option(item);
                        SubLObject value = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        plist = putf(plist, key, value);
                    }
                }
                return plist;
            }
        }
    }

    public static SubLObject html_image_plist(final SubLObject options) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject plist = NIL;
        SubLObject cdolist_list_var = el_list_items(options);
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject key = decode_html_option(item);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            plist = putf(plist, key, value);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return plist;
    }

    /**
     *
     *
     * @unknown baxter
     */
    @LispMethod(comment = "@unknown baxter")
    public static final SubLObject cyc_html_table_data_alt(SubLObject options, SubLObject content) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!(content.isString() && (NIL != el_list_p(options)))) {
                relation_evaluation.throw_unevaluatable();
            }
            {
                SubLObject html_string = NIL;
                SubLObject error_message = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                {
                                    SubLObject datum = com.cyc.cycjava.cycl.evaluation_defns.html_table_data_plist(options);
                                    SubLObject current = datum;
                                    SubLObject allow_other_keys_p = NIL;
                                    SubLObject rest = current;
                                    SubLObject bad = NIL;
                                    SubLObject current_5 = NIL;
                                    for (; NIL != rest;) {
                                        destructuring_bind_must_consp(rest, datum, $list_alt65);
                                        current_5 = rest.first();
                                        rest = rest.rest();
                                        destructuring_bind_must_consp(rest, datum, $list_alt65);
                                        if (NIL == member(current_5, $list_alt66, UNPROVIDED, UNPROVIDED)) {
                                            bad = T;
                                        }
                                        if (current_5 == $ALLOW_OTHER_KEYS) {
                                            allow_other_keys_p = rest.first();
                                        }
                                        rest = rest.rest();
                                    }
                                    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                        cdestructuring_bind_error(datum, $list_alt65);
                                    }
                                    {
                                        SubLObject nowrap_tail = property_list_member($NOWRAP, current);
                                        SubLObject nowrap = (NIL != nowrap_tail) ? ((SubLObject) (cadr(nowrap_tail))) : NIL;
                                        SubLObject colspan_tail = property_list_member($COLSPAN, current);
                                        SubLObject colspan = (NIL != colspan_tail) ? ((SubLObject) (cadr(colspan_tail))) : NIL;
                                        SubLObject rowspan_tail = property_list_member($ROWSPAN, current);
                                        SubLObject rowspan = (NIL != rowspan_tail) ? ((SubLObject) (cadr(rowspan_tail))) : NIL;
                                        SubLObject align_tail = property_list_member($ALIGN, current);
                                        SubLObject align = (NIL != align_tail) ? ((SubLObject) (cadr(align_tail))) : NIL;
                                        SubLObject valign_tail = property_list_member($VALIGN, current);
                                        SubLObject valign = (NIL != valign_tail) ? ((SubLObject) (cadr(valign_tail))) : NIL;
                                        SubLObject bgcolor_tail = property_list_member($BGCOLOR, current);
                                        SubLObject bgcolor = (NIL != bgcolor_tail) ? ((SubLObject) (cadr(bgcolor_tail))) : NIL;
                                        SubLObject width_tail = property_list_member($WIDTH, current);
                                        SubLObject width = (NIL != width_tail) ? ((SubLObject) (cadr(width_tail))) : NIL;
                                        SubLObject height_tail = property_list_member($HEIGHT, current);
                                        SubLObject height = (NIL != height_tail) ? ((SubLObject) (cadr(height_tail))) : NIL;
                                        SubLObject id_tail = property_list_member($ID, current);
                                        SubLObject id = (NIL != id_tail) ? ((SubLObject) (cadr(id_tail))) : NIL;
                                        SubLObject stream = NIL;
                                        try {
                                            stream = make_private_string_output_stream();
                                            {
                                                SubLObject _prev_bind_0_6 = html_macros.$html_stream$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_stream$.bind(stream, thread);
                                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    if (NIL != id) {
                                                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(id);
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    if (NIL != nowrap) {
                                                        html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                                    }
                                                    if (NIL != colspan) {
                                                        html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(colspan);
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    if (NIL != rowspan) {
                                                        html_markup(html_macros.$html_table_data_rowspan$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(rowspan);
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    if (NIL != align) {
                                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(html_align(align));
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    if (NIL != valign) {
                                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(html_align(valign));
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    if (NIL != bgcolor) {
                                                        html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(bgcolor);
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    if (NIL != width) {
                                                        html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(width);
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    if (NIL != height) {
                                                        html_markup(html_macros.$html_table_data_height$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(height);
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        SubLObject _prev_bind_1 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_macros.$html_safe_print$.bind(NIL, thread);
                                                            html_princ(content);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_1, thread);
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                                                        }
                                                    }
                                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_stream$.rebind(_prev_bind_0_6, thread);
                                                }
                                            }
                                            html_string = get_output_stream_string(stream);
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0_8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    close(stream, UNPROVIDED);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_8, thread);
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                }
                if (NIL != error_message) {
                    relation_evaluation.throw_unevaluatable();
                }
                return html_string;
            }
        }
    }

    /**
     *
     *
     * @unknown baxter
     */
    @LispMethod(comment = "@unknown baxter")
    public static SubLObject cyc_html_table_data(final SubLObject options, final SubLObject content) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((!content.isString()) || (NIL == el_list_p(options))) {
            relation_evaluation.throw_unevaluatable();
        }
        SubLObject html_string = NIL;
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject current;
                    final SubLObject datum = current = html_table_data_plist(options);
                    SubLObject allow_other_keys_p = NIL;
                    SubLObject rest = current;
                    SubLObject bad = NIL;
                    SubLObject current_$6 = NIL;
                    while (NIL != rest) {
                        destructuring_bind_must_consp(rest, datum, $list92);
                        current_$6 = rest.first();
                        rest = rest.rest();
                        destructuring_bind_must_consp(rest, datum, $list92);
                        if (NIL == member(current_$6, $list93, UNPROVIDED, UNPROVIDED)) {
                            bad = T;
                        }
                        if (current_$6 == $ALLOW_OTHER_KEYS) {
                            allow_other_keys_p = rest.first();
                        }
                        rest = rest.rest();
                    } 
                    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                        cdestructuring_bind_error(datum, $list92);
                    }
                    final SubLObject nowrap_tail = property_list_member($NOWRAP, current);
                    final SubLObject nowrap = (NIL != nowrap_tail) ? cadr(nowrap_tail) : NIL;
                    final SubLObject colspan_tail = property_list_member($COLSPAN, current);
                    final SubLObject colspan = (NIL != colspan_tail) ? cadr(colspan_tail) : NIL;
                    final SubLObject rowspan_tail = property_list_member($ROWSPAN, current);
                    final SubLObject rowspan = (NIL != rowspan_tail) ? cadr(rowspan_tail) : NIL;
                    final SubLObject align_tail = property_list_member($ALIGN, current);
                    final SubLObject align = (NIL != align_tail) ? cadr(align_tail) : NIL;
                    final SubLObject valign_tail = property_list_member($VALIGN, current);
                    final SubLObject valign = (NIL != valign_tail) ? cadr(valign_tail) : NIL;
                    final SubLObject bgcolor_tail = property_list_member($BGCOLOR, current);
                    final SubLObject bgcolor = (NIL != bgcolor_tail) ? cadr(bgcolor_tail) : NIL;
                    final SubLObject width_tail = property_list_member($WIDTH, current);
                    final SubLObject width = (NIL != width_tail) ? cadr(width_tail) : NIL;
                    final SubLObject height_tail = property_list_member($HEIGHT, current);
                    final SubLObject height = (NIL != height_tail) ? cadr(height_tail) : NIL;
                    final SubLObject id_tail = property_list_member($ID, current);
                    final SubLObject id = (NIL != id_tail) ? cadr(id_tail) : NIL;
                    SubLObject stream = NIL;
                    try {
                        stream = make_private_string_output_stream();
                        final SubLObject _prev_bind_0_$7 = html_macros.$html_stream$.currentBinding(thread);
                        try {
                            html_macros.$html_stream$.bind(stream, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (NIL != id) {
                                html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(id);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != nowrap) {
                                html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                            }
                            if (NIL != colspan) {
                                html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(colspan);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != rowspan) {
                                html_markup(html_macros.$html_table_data_rowspan$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(rowspan);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != align) {
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align(align));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != valign) {
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align(valign));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != bgcolor) {
                                html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(bgcolor);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != width) {
                                html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(width);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != height) {
                                html_markup(html_macros.$html_table_data_height$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(height);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_macros.$html_safe_print$.bind(NIL, thread);
                                html_princ(content);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_stream$.rebind(_prev_bind_0_$7, thread);
                        }
                        html_string = get_output_stream_string(stream);
                    } finally {
                        final SubLObject _prev_bind_0_$9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            close(stream, UNPROVIDED);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                        }
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error_message) {
            relation_evaluation.throw_unevaluatable();
        }
        return html_string;
    }

    /**
     *
     *
     * @unknown baxter
     */
    @LispMethod(comment = "@unknown baxter")
    public static final SubLObject cyc_html_table_data_variable_arity_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject options = NIL;
                SubLObject content = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt73);
                options = current.first();
                current = current.rest();
                content = current;
                if (!(content.isCons() && (NIL != el_list_p(options)))) {
                    relation_evaluation.throw_unevaluatable();
                }
                {
                    SubLObject html_string = NIL;
                    SubLObject error_message = NIL;
                    try {
                        {
                            SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                try {
                                    {
                                        SubLObject datum_9 = com.cyc.cycjava.cycl.evaluation_defns.html_table_data_plist(options);
                                        SubLObject current_10 = datum_9;
                                        SubLObject allow_other_keys_p = NIL;
                                        SubLObject rest = current_10;
                                        SubLObject bad = NIL;
                                        SubLObject current_11 = NIL;
                                        for (; NIL != rest;) {
                                            destructuring_bind_must_consp(rest, datum_9, $list_alt65);
                                            current_11 = rest.first();
                                            rest = rest.rest();
                                            destructuring_bind_must_consp(rest, datum_9, $list_alt65);
                                            if (NIL == member(current_11, $list_alt66, UNPROVIDED, UNPROVIDED)) {
                                                bad = T;
                                            }
                                            if (current_11 == $ALLOW_OTHER_KEYS) {
                                                allow_other_keys_p = rest.first();
                                            }
                                            rest = rest.rest();
                                        }
                                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                            cdestructuring_bind_error(datum_9, $list_alt65);
                                        }
                                        {
                                            SubLObject nowrap_tail = property_list_member($NOWRAP, current_10);
                                            SubLObject nowrap = (NIL != nowrap_tail) ? ((SubLObject) (cadr(nowrap_tail))) : NIL;
                                            SubLObject colspan_tail = property_list_member($COLSPAN, current_10);
                                            SubLObject colspan = (NIL != colspan_tail) ? ((SubLObject) (cadr(colspan_tail))) : NIL;
                                            SubLObject rowspan_tail = property_list_member($ROWSPAN, current_10);
                                            SubLObject rowspan = (NIL != rowspan_tail) ? ((SubLObject) (cadr(rowspan_tail))) : NIL;
                                            SubLObject align_tail = property_list_member($ALIGN, current_10);
                                            SubLObject align = (NIL != align_tail) ? ((SubLObject) (cadr(align_tail))) : NIL;
                                            SubLObject valign_tail = property_list_member($VALIGN, current_10);
                                            SubLObject valign = (NIL != valign_tail) ? ((SubLObject) (cadr(valign_tail))) : NIL;
                                            SubLObject bgcolor_tail = property_list_member($BGCOLOR, current_10);
                                            SubLObject bgcolor = (NIL != bgcolor_tail) ? ((SubLObject) (cadr(bgcolor_tail))) : NIL;
                                            SubLObject width_tail = property_list_member($WIDTH, current_10);
                                            SubLObject width = (NIL != width_tail) ? ((SubLObject) (cadr(width_tail))) : NIL;
                                            SubLObject height_tail = property_list_member($HEIGHT, current_10);
                                            SubLObject height = (NIL != height_tail) ? ((SubLObject) (cadr(height_tail))) : NIL;
                                            SubLObject id_tail = property_list_member($ID, current_10);
                                            SubLObject id = (NIL != id_tail) ? ((SubLObject) (cadr(id_tail))) : NIL;
                                            SubLObject stream = NIL;
                                            try {
                                                stream = make_private_string_output_stream();
                                                {
                                                    SubLObject _prev_bind_0_12 = html_macros.$html_stream$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_stream$.bind(stream, thread);
                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (NIL != id) {
                                                            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(id);
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        if (NIL != nowrap) {
                                                            html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                                        }
                                                        if (NIL != colspan) {
                                                            html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(colspan);
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        if (NIL != rowspan) {
                                                            html_markup(html_macros.$html_table_data_rowspan$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(rowspan);
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        if (NIL != align) {
                                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(html_align(align));
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        if (NIL != valign) {
                                                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(html_align(valign));
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        if (NIL != bgcolor) {
                                                            html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(bgcolor);
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        if (NIL != width) {
                                                            html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(width);
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        if (NIL != height) {
                                                            html_markup(html_macros.$html_table_data_height$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(height);
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            SubLObject _prev_bind_1 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_macros.$html_safe_print$.bind(NIL, thread);
                                                                {
                                                                    SubLObject cdolist_list_var = content;
                                                                    SubLObject item = NIL;
                                                                    for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                                                                        html_princ(item);
                                                                    }
                                                                }
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_1, thread);
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_stream$.rebind(_prev_bind_0_12, thread);
                                                    }
                                                }
                                                html_string = get_output_stream_string(stream);
                                            } finally {
                                                {
                                                    SubLObject _prev_bind_0_14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        close(stream, UNPROVIDED);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_14, thread);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                Errors.$error_handler$.rebind(_prev_bind_0, thread);
                            }
                        }
                    } catch (Throwable ccatch_env_var) {
                        error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                    }
                    if (NIL != error_message) {
                        relation_evaluation.throw_unevaluatable();
                    }
                    return html_string;
                }
            }
        }
    }

    /**
     *
     *
     * @unknown baxter
     */
    @LispMethod(comment = "@unknown baxter")
    public static SubLObject cyc_html_table_data_variable_arity(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject options = NIL;
        SubLObject content = NIL;
        destructuring_bind_must_consp(args, args, $list100);
        options = args.first();
        final SubLObject current = content = args.rest();
        if ((!content.isCons()) || (NIL == el_list_p(options))) {
            relation_evaluation.throw_unevaluatable();
        }
        SubLObject html_string = NIL;
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject current_$11;
                    final SubLObject datum_$10 = current_$11 = html_table_data_plist(options);
                    SubLObject allow_other_keys_p = NIL;
                    SubLObject rest = current_$11;
                    SubLObject bad = NIL;
                    SubLObject current_$12 = NIL;
                    while (NIL != rest) {
                        destructuring_bind_must_consp(rest, datum_$10, $list92);
                        current_$12 = rest.first();
                        rest = rest.rest();
                        destructuring_bind_must_consp(rest, datum_$10, $list92);
                        if (NIL == member(current_$12, $list93, UNPROVIDED, UNPROVIDED)) {
                            bad = T;
                        }
                        if (current_$12 == $ALLOW_OTHER_KEYS) {
                            allow_other_keys_p = rest.first();
                        }
                        rest = rest.rest();
                    } 
                    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                        cdestructuring_bind_error(datum_$10, $list92);
                    }
                    final SubLObject nowrap_tail = property_list_member($NOWRAP, current_$11);
                    final SubLObject nowrap = (NIL != nowrap_tail) ? cadr(nowrap_tail) : NIL;
                    final SubLObject colspan_tail = property_list_member($COLSPAN, current_$11);
                    final SubLObject colspan = (NIL != colspan_tail) ? cadr(colspan_tail) : NIL;
                    final SubLObject rowspan_tail = property_list_member($ROWSPAN, current_$11);
                    final SubLObject rowspan = (NIL != rowspan_tail) ? cadr(rowspan_tail) : NIL;
                    final SubLObject align_tail = property_list_member($ALIGN, current_$11);
                    final SubLObject align = (NIL != align_tail) ? cadr(align_tail) : NIL;
                    final SubLObject valign_tail = property_list_member($VALIGN, current_$11);
                    final SubLObject valign = (NIL != valign_tail) ? cadr(valign_tail) : NIL;
                    final SubLObject bgcolor_tail = property_list_member($BGCOLOR, current_$11);
                    final SubLObject bgcolor = (NIL != bgcolor_tail) ? cadr(bgcolor_tail) : NIL;
                    final SubLObject width_tail = property_list_member($WIDTH, current_$11);
                    final SubLObject width = (NIL != width_tail) ? cadr(width_tail) : NIL;
                    final SubLObject height_tail = property_list_member($HEIGHT, current_$11);
                    final SubLObject height = (NIL != height_tail) ? cadr(height_tail) : NIL;
                    final SubLObject id_tail = property_list_member($ID, current_$11);
                    final SubLObject id = (NIL != id_tail) ? cadr(id_tail) : NIL;
                    SubLObject stream = NIL;
                    try {
                        stream = make_private_string_output_stream();
                        final SubLObject _prev_bind_0_$13 = html_macros.$html_stream$.currentBinding(thread);
                        try {
                            html_macros.$html_stream$.bind(stream, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (NIL != id) {
                                html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(id);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != nowrap) {
                                html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                            }
                            if (NIL != colspan) {
                                html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(colspan);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != rowspan) {
                                html_markup(html_macros.$html_table_data_rowspan$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(rowspan);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != align) {
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align(align));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != valign) {
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align(valign));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != bgcolor) {
                                html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(bgcolor);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != width) {
                                html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(width);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != height) {
                                html_markup(html_macros.$html_table_data_height$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(height);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_macros.$html_safe_print$.bind(NIL, thread);
                                SubLObject cdolist_list_var = content;
                                SubLObject item = NIL;
                                item = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    html_princ(item);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    item = cdolist_list_var.first();
                                } 
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_stream$.rebind(_prev_bind_0_$13, thread);
                        }
                        html_string = get_output_stream_string(stream);
                    } finally {
                        final SubLObject _prev_bind_0_$15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            close(stream, UNPROVIDED);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                        }
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error_message) {
            relation_evaluation.throw_unevaluatable();
        }
        return html_string;
    }

    public static final SubLObject html_table_data_plist_alt(SubLObject options) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject plist = NIL;
                SubLObject cdolist_list_var = el_list_items(options);
                SubLObject item = NIL;
                for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                    thread.resetMultipleValues();
                    {
                        SubLObject key = com.cyc.cycjava.cycl.evaluation_defns.decode_html_option(item);
                        SubLObject value = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        plist = putf(plist, key, value);
                    }
                }
                return plist;
            }
        }
    }

    public static SubLObject html_table_data_plist(final SubLObject options) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject plist = NIL;
        SubLObject cdolist_list_var = el_list_items(options);
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject key = decode_html_option(item);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            plist = putf(plist, key, value);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return plist;
    }

    /**
     *
     *
     * @unknown baxter
     */
    @LispMethod(comment = "@unknown baxter")
    public static final SubLObject cyc_html_table_row_alt(SubLObject options, SubLObject content) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!(content.isString() && (NIL != el_list_p(options)))) {
                relation_evaluation.throw_unevaluatable();
            }
            {
                SubLObject html_string = NIL;
                SubLObject error_message = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                {
                                    SubLObject datum = com.cyc.cycjava.cycl.evaluation_defns.html_table_row_plist(options);
                                    SubLObject current = datum;
                                    SubLObject allow_other_keys_p = NIL;
                                    SubLObject rest = current;
                                    SubLObject bad = NIL;
                                    SubLObject current_15 = NIL;
                                    for (; NIL != rest;) {
                                        destructuring_bind_must_consp(rest, datum, $list_alt75);
                                        current_15 = rest.first();
                                        rest = rest.rest();
                                        destructuring_bind_must_consp(rest, datum, $list_alt75);
                                        if (NIL == member(current_15, $list_alt76, UNPROVIDED, UNPROVIDED)) {
                                            bad = T;
                                        }
                                        if (current_15 == $ALLOW_OTHER_KEYS) {
                                            allow_other_keys_p = rest.first();
                                        }
                                        rest = rest.rest();
                                    }
                                    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                        cdestructuring_bind_error(datum, $list_alt75);
                                    }
                                    {
                                        SubLObject align_tail = property_list_member($ALIGN, current);
                                        SubLObject align = (NIL != align_tail) ? ((SubLObject) (cadr(align_tail))) : NIL;
                                        SubLObject valign_tail = property_list_member($VALIGN, current);
                                        SubLObject valign = (NIL != valign_tail) ? ((SubLObject) (cadr(valign_tail))) : NIL;
                                        SubLObject bgcolor_tail = property_list_member($BGCOLOR, current);
                                        SubLObject bgcolor = (NIL != bgcolor_tail) ? ((SubLObject) (cadr(bgcolor_tail))) : NIL;
                                        SubLObject height_tail = property_list_member($HEIGHT, current);
                                        SubLObject height = (NIL != height_tail) ? ((SubLObject) (cadr(height_tail))) : NIL;
                                        SubLObject stream = NIL;
                                        try {
                                            stream = make_private_string_output_stream();
                                            {
                                                SubLObject _prev_bind_0_16 = html_macros.$html_stream$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_stream$.bind(stream, thread);
                                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                    if (NIL != align) {
                                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(html_align(align));
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    if (NIL != valign) {
                                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(html_align(valign));
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    if (NIL != height) {
                                                        html_markup(html_macros.$html_table_row_height$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(height);
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    if (NIL != bgcolor) {
                                                        html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(bgcolor);
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        SubLObject _prev_bind_1 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_macros.$html_safe_print$.bind(NIL, thread);
                                                            html_princ(content);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_1, thread);
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
                                                        }
                                                    }
                                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                    html_source_readability_terpri(UNPROVIDED);
                                                } finally {
                                                    html_macros.$html_stream$.rebind(_prev_bind_0_16, thread);
                                                }
                                            }
                                            html_string = get_output_stream_string(stream);
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0_18 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    close(stream, UNPROVIDED);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_18, thread);
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                }
                if (NIL != error_message) {
                    relation_evaluation.throw_unevaluatable();
                }
                return html_string;
            }
        }
    }

    /**
     *
     *
     * @unknown baxter
     */
    @LispMethod(comment = "@unknown baxter")
    public static SubLObject cyc_html_table_row(final SubLObject options, final SubLObject content) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((!content.isString()) || (NIL == el_list_p(options))) {
            relation_evaluation.throw_unevaluatable();
        }
        SubLObject html_string = NIL;
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject current;
                    final SubLObject datum = current = html_table_row_plist(options);
                    SubLObject allow_other_keys_p = NIL;
                    SubLObject rest = current;
                    SubLObject bad = NIL;
                    SubLObject current_$16 = NIL;
                    while (NIL != rest) {
                        destructuring_bind_must_consp(rest, datum, $list102);
                        current_$16 = rest.first();
                        rest = rest.rest();
                        destructuring_bind_must_consp(rest, datum, $list102);
                        if (NIL == member(current_$16, $list103, UNPROVIDED, UNPROVIDED)) {
                            bad = T;
                        }
                        if (current_$16 == $ALLOW_OTHER_KEYS) {
                            allow_other_keys_p = rest.first();
                        }
                        rest = rest.rest();
                    } 
                    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                        cdestructuring_bind_error(datum, $list102);
                    }
                    final SubLObject align_tail = property_list_member($ALIGN, current);
                    final SubLObject align = (NIL != align_tail) ? cadr(align_tail) : NIL;
                    final SubLObject valign_tail = property_list_member($VALIGN, current);
                    final SubLObject valign = (NIL != valign_tail) ? cadr(valign_tail) : NIL;
                    final SubLObject bgcolor_tail = property_list_member($BGCOLOR, current);
                    final SubLObject bgcolor = (NIL != bgcolor_tail) ? cadr(bgcolor_tail) : NIL;
                    final SubLObject height_tail = property_list_member($HEIGHT, current);
                    final SubLObject height = (NIL != height_tail) ? cadr(height_tail) : NIL;
                    SubLObject stream = NIL;
                    try {
                        stream = make_private_string_output_stream();
                        final SubLObject _prev_bind_0_$17 = html_macros.$html_stream$.currentBinding(thread);
                        try {
                            html_macros.$html_stream$.bind(stream, thread);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            if (NIL != align) {
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(align);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != valign) {
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align(valign));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != height) {
                                html_markup(html_macros.$html_table_row_height$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(height);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != bgcolor) {
                                html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(bgcolor);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_macros.$html_safe_print$.bind(NIL, thread);
                                html_princ(content);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_stream$.rebind(_prev_bind_0_$17, thread);
                        }
                        html_string = get_output_stream_string(stream);
                    } finally {
                        final SubLObject _prev_bind_0_$19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            close(stream, UNPROVIDED);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                        }
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error_message) {
            relation_evaluation.throw_unevaluatable();
        }
        return html_string;
    }

    /**
     *
     *
     * @unknown baxter
     */
    @LispMethod(comment = "@unknown baxter")
    public static final SubLObject cyc_html_table_row_variable_arity_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject options = NIL;
                SubLObject data = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt78);
                options = current.first();
                current = current.rest();
                data = current;
                if (!(data.isCons() && (NIL != el_list_p(options)))) {
                    relation_evaluation.throw_unevaluatable();
                }
                {
                    SubLObject html_string = NIL;
                    SubLObject error_message = NIL;
                    try {
                        {
                            SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                try {
                                    {
                                        SubLObject datum_19 = com.cyc.cycjava.cycl.evaluation_defns.html_table_row_plist(options);
                                        SubLObject current_20 = datum_19;
                                        SubLObject allow_other_keys_p = NIL;
                                        SubLObject rest = current_20;
                                        SubLObject bad = NIL;
                                        SubLObject current_21 = NIL;
                                        for (; NIL != rest;) {
                                            destructuring_bind_must_consp(rest, datum_19, $list_alt75);
                                            current_21 = rest.first();
                                            rest = rest.rest();
                                            destructuring_bind_must_consp(rest, datum_19, $list_alt75);
                                            if (NIL == member(current_21, $list_alt76, UNPROVIDED, UNPROVIDED)) {
                                                bad = T;
                                            }
                                            if (current_21 == $ALLOW_OTHER_KEYS) {
                                                allow_other_keys_p = rest.first();
                                            }
                                            rest = rest.rest();
                                        }
                                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                            cdestructuring_bind_error(datum_19, $list_alt75);
                                        }
                                        {
                                            SubLObject align_tail = property_list_member($ALIGN, current_20);
                                            SubLObject align = (NIL != align_tail) ? ((SubLObject) (cadr(align_tail))) : NIL;
                                            SubLObject valign_tail = property_list_member($VALIGN, current_20);
                                            SubLObject valign = (NIL != valign_tail) ? ((SubLObject) (cadr(valign_tail))) : NIL;
                                            SubLObject bgcolor_tail = property_list_member($BGCOLOR, current_20);
                                            SubLObject bgcolor = (NIL != bgcolor_tail) ? ((SubLObject) (cadr(bgcolor_tail))) : NIL;
                                            SubLObject height_tail = property_list_member($HEIGHT, current_20);
                                            SubLObject height = (NIL != height_tail) ? ((SubLObject) (cadr(height_tail))) : NIL;
                                            SubLObject stream = NIL;
                                            try {
                                                stream = make_private_string_output_stream();
                                                {
                                                    SubLObject _prev_bind_0_22 = html_macros.$html_stream$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_stream$.bind(stream, thread);
                                                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        if (NIL != align) {
                                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(html_align(align));
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        if (NIL != valign) {
                                                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(html_align(valign));
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        if (NIL != height) {
                                                            html_markup(html_macros.$html_table_row_height$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(height);
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        if (NIL != bgcolor) {
                                                            html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(bgcolor);
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_23 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            SubLObject _prev_bind_1 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_macros.$html_safe_print$.bind(NIL, thread);
                                                                {
                                                                    SubLObject cdolist_list_var = data;
                                                                    SubLObject datum_24 = NIL;
                                                                    for (datum_24 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , datum_24 = cdolist_list_var.first()) {
                                                                        html_princ(datum_24);
                                                                    }
                                                                }
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_1, thread);
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_23, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_source_readability_terpri(UNPROVIDED);
                                                    } finally {
                                                        html_macros.$html_stream$.rebind(_prev_bind_0_22, thread);
                                                    }
                                                }
                                                html_string = get_output_stream_string(stream);
                                            } finally {
                                                {
                                                    SubLObject _prev_bind_0_25 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        close(stream, UNPROVIDED);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_25, thread);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                Errors.$error_handler$.rebind(_prev_bind_0, thread);
                            }
                        }
                    } catch (Throwable ccatch_env_var) {
                        error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                    }
                    if (NIL != error_message) {
                        relation_evaluation.throw_unevaluatable();
                    }
                    return html_string;
                }
            }
        }
    }

    /**
     *
     *
     * @unknown baxter
     */
    @LispMethod(comment = "@unknown baxter")
    public static SubLObject cyc_html_table_row_variable_arity(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject options = NIL;
        SubLObject data = NIL;
        destructuring_bind_must_consp(args, args, $list105);
        options = args.first();
        final SubLObject current = data = args.rest();
        if ((!data.isCons()) || (NIL == el_list_p(options))) {
            relation_evaluation.throw_unevaluatable();
        }
        SubLObject html_string = NIL;
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject current_$21;
                    final SubLObject datum_$20 = current_$21 = html_table_row_plist(options);
                    SubLObject allow_other_keys_p = NIL;
                    SubLObject rest = current_$21;
                    SubLObject bad = NIL;
                    SubLObject current_$22 = NIL;
                    while (NIL != rest) {
                        destructuring_bind_must_consp(rest, datum_$20, $list102);
                        current_$22 = rest.first();
                        rest = rest.rest();
                        destructuring_bind_must_consp(rest, datum_$20, $list102);
                        if (NIL == member(current_$22, $list103, UNPROVIDED, UNPROVIDED)) {
                            bad = T;
                        }
                        if (current_$22 == $ALLOW_OTHER_KEYS) {
                            allow_other_keys_p = rest.first();
                        }
                        rest = rest.rest();
                    } 
                    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                        cdestructuring_bind_error(datum_$20, $list102);
                    }
                    final SubLObject align_tail = property_list_member($ALIGN, current_$21);
                    final SubLObject align = (NIL != align_tail) ? cadr(align_tail) : NIL;
                    final SubLObject valign_tail = property_list_member($VALIGN, current_$21);
                    final SubLObject valign = (NIL != valign_tail) ? cadr(valign_tail) : NIL;
                    final SubLObject bgcolor_tail = property_list_member($BGCOLOR, current_$21);
                    final SubLObject bgcolor = (NIL != bgcolor_tail) ? cadr(bgcolor_tail) : NIL;
                    final SubLObject height_tail = property_list_member($HEIGHT, current_$21);
                    final SubLObject height = (NIL != height_tail) ? cadr(height_tail) : NIL;
                    SubLObject stream = NIL;
                    try {
                        stream = make_private_string_output_stream();
                        final SubLObject _prev_bind_0_$23 = html_macros.$html_stream$.currentBinding(thread);
                        try {
                            html_macros.$html_stream$.bind(stream, thread);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            if (NIL != align) {
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(align);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != valign) {
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align(valign));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != height) {
                                html_markup(html_macros.$html_table_row_height$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(height);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != bgcolor) {
                                html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(bgcolor);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_macros.$html_safe_print$.bind(NIL, thread);
                                SubLObject cdolist_list_var = data;
                                SubLObject datum_$21 = NIL;
                                datum_$21 = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    html_princ(datum_$21);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    datum_$21 = cdolist_list_var.first();
                                } 
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_stream$.rebind(_prev_bind_0_$23, thread);
                        }
                        html_string = get_output_stream_string(stream);
                    } finally {
                        final SubLObject _prev_bind_0_$25 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            close(stream, UNPROVIDED);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$25, thread);
                        }
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error_message) {
            relation_evaluation.throw_unevaluatable();
        }
        return html_string;
    }

    public static final SubLObject html_table_row_plist_alt(SubLObject options) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject plist = NIL;
                SubLObject cdolist_list_var = el_list_items(options);
                SubLObject item = NIL;
                for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                    thread.resetMultipleValues();
                    {
                        SubLObject key = com.cyc.cycjava.cycl.evaluation_defns.decode_html_option(item);
                        SubLObject value = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        plist = putf(plist, key, value);
                    }
                }
                return plist;
            }
        }
    }

    public static SubLObject html_table_row_plist(final SubLObject options) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject plist = NIL;
        SubLObject cdolist_list_var = el_list_items(options);
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject key = decode_html_option(item);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            plist = putf(plist, key, value);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return plist;
    }

    /**
     *
     *
     * @unknown baxter
     */
    @LispMethod(comment = "@unknown baxter")
    public static final SubLObject cyc_html_table_alt(SubLObject options, SubLObject content) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!(content.isString() && (NIL != el_list_p(options)))) {
                relation_evaluation.throw_unevaluatable();
            }
            {
                SubLObject html_string = NIL;
                SubLObject error_message = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                {
                                    SubLObject datum = com.cyc.cycjava.cycl.evaluation_defns.html_table_plist(options);
                                    SubLObject current = datum;
                                    SubLObject allow_other_keys_p = NIL;
                                    SubLObject rest = current;
                                    SubLObject bad = NIL;
                                    SubLObject current_26 = NIL;
                                    for (; NIL != rest;) {
                                        destructuring_bind_must_consp(rest, datum, $list_alt80);
                                        current_26 = rest.first();
                                        rest = rest.rest();
                                        destructuring_bind_must_consp(rest, datum, $list_alt80);
                                        if (NIL == member(current_26, $list_alt81, UNPROVIDED, UNPROVIDED)) {
                                            bad = T;
                                        }
                                        if (current_26 == $ALLOW_OTHER_KEYS) {
                                            allow_other_keys_p = rest.first();
                                        }
                                        rest = rest.rest();
                                    }
                                    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                        cdestructuring_bind_error(datum, $list_alt80);
                                    }
                                    {
                                        SubLObject noflow_tail = property_list_member($NOFLOW, current);
                                        SubLObject noflow = (NIL != noflow_tail) ? ((SubLObject) (cadr(noflow_tail))) : NIL;
                                        SubLObject nowrap_tail = property_list_member($NOWRAP, current);
                                        SubLObject nowrap = (NIL != nowrap_tail) ? ((SubLObject) (cadr(nowrap_tail))) : NIL;
                                        SubLObject align_tail = property_list_member($ALIGN, current);
                                        SubLObject align = (NIL != align_tail) ? ((SubLObject) (cadr(align_tail))) : NIL;
                                        SubLObject border_tail = property_list_member($BORDER, current);
                                        SubLObject border = (NIL != border_tail) ? ((SubLObject) (cadr(border_tail))) : NIL;
                                        SubLObject cellpadding_tail = property_list_member($CELLPADDING, current);
                                        SubLObject cellpadding = (NIL != cellpadding_tail) ? ((SubLObject) (cadr(cellpadding_tail))) : NIL;
                                        SubLObject cellspacing_tail = property_list_member($CELLSPACING, current);
                                        SubLObject cellspacing = (NIL != cellspacing_tail) ? ((SubLObject) (cadr(cellspacing_tail))) : NIL;
                                        SubLObject colspec_tail = property_list_member($COLSPEC, current);
                                        SubLObject colspec = (NIL != colspec_tail) ? ((SubLObject) (cadr(colspec_tail))) : NIL;
                                        SubLObject units_tail = property_list_member($UNITS, current);
                                        SubLObject units = (NIL != units_tail) ? ((SubLObject) (cadr(units_tail))) : NIL;
                                        SubLObject bgcolor_tail = property_list_member($BGCOLOR, current);
                                        SubLObject bgcolor = (NIL != bgcolor_tail) ? ((SubLObject) (cadr(bgcolor_tail))) : NIL;
                                        SubLObject width_tail = property_list_member($WIDTH, current);
                                        SubLObject width = (NIL != width_tail) ? ((SubLObject) (cadr(width_tail))) : NIL;
                                        SubLObject background_tail = property_list_member($BACKGROUND, current);
                                        SubLObject background = (NIL != background_tail) ? ((SubLObject) (cadr(background_tail))) : NIL;
                                        SubLObject stream = NIL;
                                        try {
                                            stream = make_private_string_output_stream();
                                            {
                                                SubLObject _prev_bind_0_27 = html_macros.$html_stream$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_stream$.bind(stream, thread);
                                                    html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                    if (NIL != noflow) {
                                                        html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
                                                    }
                                                    if (NIL != nowrap) {
                                                        html_simple_attribute(html_macros.$html_table_nowrap$.getGlobalValue());
                                                    }
                                                    if (NIL != align) {
                                                        html_markup(html_macros.$html_table_align$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(html_align(align));
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    if (NIL != border) {
                                                        html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(border);
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    if (NIL != cellpadding) {
                                                        html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(cellpadding);
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    if (NIL != cellspacing) {
                                                        html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(cellspacing);
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    if (NIL != colspec) {
                                                        html_markup(html_macros.$html_table_colspec$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(colspec);
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    if (NIL != units) {
                                                        html_markup(html_macros.$html_table_units$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(units);
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    if (NIL != bgcolor) {
                                                        html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(bgcolor);
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    if (NIL != width) {
                                                        html_markup(html_macros.$html_table_width$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(width);
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    if (NIL != background) {
                                                        html_markup(html_macros.$html_table_background$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(background);
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_28 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        SubLObject _prev_bind_1 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_macros.$html_safe_print$.bind(NIL, thread);
                                                            html_princ(content);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_1, thread);
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_28, thread);
                                                        }
                                                    }
                                                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_stream$.rebind(_prev_bind_0_27, thread);
                                                }
                                            }
                                            html_string = get_output_stream_string(stream);
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0_29 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    close(stream, UNPROVIDED);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_29, thread);
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                }
                if (NIL != error_message) {
                    relation_evaluation.throw_unevaluatable();
                }
                return html_string;
            }
        }
    }

    /**
     *
     *
     * @unknown baxter
     */
    @LispMethod(comment = "@unknown baxter")
    public static SubLObject cyc_html_table(final SubLObject options, final SubLObject content) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((!content.isString()) || (NIL == el_list_p(options))) {
            relation_evaluation.throw_unevaluatable();
        }
        SubLObject html_string = NIL;
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject current;
                    final SubLObject datum = current = html_table_plist(options);
                    SubLObject allow_other_keys_p = NIL;
                    SubLObject rest = current;
                    SubLObject bad = NIL;
                    SubLObject current_$27 = NIL;
                    while (NIL != rest) {
                        destructuring_bind_must_consp(rest, datum, $list107);
                        current_$27 = rest.first();
                        rest = rest.rest();
                        destructuring_bind_must_consp(rest, datum, $list107);
                        if (NIL == member(current_$27, $list108, UNPROVIDED, UNPROVIDED)) {
                            bad = T;
                        }
                        if (current_$27 == $ALLOW_OTHER_KEYS) {
                            allow_other_keys_p = rest.first();
                        }
                        rest = rest.rest();
                    } 
                    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                        cdestructuring_bind_error(datum, $list107);
                    }
                    final SubLObject noflow_tail = property_list_member($NOFLOW, current);
                    final SubLObject noflow = (NIL != noflow_tail) ? cadr(noflow_tail) : NIL;
                    final SubLObject nowrap_tail = property_list_member($NOWRAP, current);
                    final SubLObject nowrap = (NIL != nowrap_tail) ? cadr(nowrap_tail) : NIL;
                    final SubLObject align_tail = property_list_member($ALIGN, current);
                    final SubLObject align = (NIL != align_tail) ? cadr(align_tail) : NIL;
                    final SubLObject border_tail = property_list_member($BORDER, current);
                    final SubLObject border = (NIL != border_tail) ? cadr(border_tail) : NIL;
                    final SubLObject cellpadding_tail = property_list_member($CELLPADDING, current);
                    final SubLObject cellpadding = (NIL != cellpadding_tail) ? cadr(cellpadding_tail) : NIL;
                    final SubLObject cellspacing_tail = property_list_member($CELLSPACING, current);
                    final SubLObject cellspacing = (NIL != cellspacing_tail) ? cadr(cellspacing_tail) : NIL;
                    final SubLObject colspec_tail = property_list_member($COLSPEC, current);
                    final SubLObject colspec = (NIL != colspec_tail) ? cadr(colspec_tail) : NIL;
                    final SubLObject units_tail = property_list_member($UNITS, current);
                    final SubLObject units = (NIL != units_tail) ? cadr(units_tail) : NIL;
                    final SubLObject bgcolor_tail = property_list_member($BGCOLOR, current);
                    final SubLObject bgcolor = (NIL != bgcolor_tail) ? cadr(bgcolor_tail) : NIL;
                    final SubLObject width_tail = property_list_member($WIDTH, current);
                    final SubLObject width = (NIL != width_tail) ? cadr(width_tail) : NIL;
                    final SubLObject background_tail = property_list_member($BACKGROUND, current);
                    final SubLObject background = (NIL != background_tail) ? cadr(background_tail) : NIL;
                    SubLObject stream = NIL;
                    try {
                        stream = make_private_string_output_stream();
                        final SubLObject _prev_bind_0_$28 = html_macros.$html_stream$.currentBinding(thread);
                        try {
                            html_macros.$html_stream$.bind(stream, thread);
                            html_markup(html_macros.$html_table_head$.getGlobalValue());
                            if (NIL != noflow) {
                                html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
                            }
                            if (NIL != nowrap) {
                                html_simple_attribute(html_macros.$html_table_nowrap$.getGlobalValue());
                            }
                            if (NIL != align) {
                                html_markup(html_macros.$html_table_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align(align));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != border) {
                                html_markup(html_macros.$html_table_border$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(border);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != cellpadding) {
                                html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(cellpadding);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != cellspacing) {
                                html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(cellspacing);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != colspec) {
                                html_markup(html_macros.$html_table_colspec$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(colspec);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != units) {
                                html_markup(html_macros.$html_table_units$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(units);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != bgcolor) {
                                html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(bgcolor);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != width) {
                                html_markup(html_macros.$html_table_width$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(width);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != background) {
                                html_markup(html_macros.$html_table_background$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(background);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_macros.$html_safe_print$.bind(NIL, thread);
                                html_princ(content);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
                            }
                            html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_stream$.rebind(_prev_bind_0_$28, thread);
                        }
                        html_string = get_output_stream_string(stream);
                    } finally {
                        final SubLObject _prev_bind_0_$30 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            close(stream, UNPROVIDED);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
                        }
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error_message) {
            relation_evaluation.throw_unevaluatable();
        }
        return html_string;
    }

    /**
     *
     *
     * @unknown baxter
     */
    @LispMethod(comment = "@unknown baxter")
    public static final SubLObject cyc_html_table_variable_arity_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject options = NIL;
                SubLObject content = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt73);
                options = current.first();
                current = current.rest();
                content = current;
                if (!(content.isCons() && (NIL != el_list_p(options)))) {
                    relation_evaluation.throw_unevaluatable();
                }
                {
                    SubLObject html_string = NIL;
                    SubLObject error_message = NIL;
                    try {
                        {
                            SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                try {
                                    {
                                        SubLObject datum_30 = com.cyc.cycjava.cycl.evaluation_defns.html_table_plist(options);
                                        SubLObject current_31 = datum_30;
                                        SubLObject allow_other_keys_p = NIL;
                                        SubLObject rest = current_31;
                                        SubLObject bad = NIL;
                                        SubLObject current_32 = NIL;
                                        for (; NIL != rest;) {
                                            destructuring_bind_must_consp(rest, datum_30, $list_alt80);
                                            current_32 = rest.first();
                                            rest = rest.rest();
                                            destructuring_bind_must_consp(rest, datum_30, $list_alt80);
                                            if (NIL == member(current_32, $list_alt81, UNPROVIDED, UNPROVIDED)) {
                                                bad = T;
                                            }
                                            if (current_32 == $ALLOW_OTHER_KEYS) {
                                                allow_other_keys_p = rest.first();
                                            }
                                            rest = rest.rest();
                                        }
                                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                            cdestructuring_bind_error(datum_30, $list_alt80);
                                        }
                                        {
                                            SubLObject noflow_tail = property_list_member($NOFLOW, current_31);
                                            SubLObject noflow = (NIL != noflow_tail) ? ((SubLObject) (cadr(noflow_tail))) : NIL;
                                            SubLObject nowrap_tail = property_list_member($NOWRAP, current_31);
                                            SubLObject nowrap = (NIL != nowrap_tail) ? ((SubLObject) (cadr(nowrap_tail))) : NIL;
                                            SubLObject align_tail = property_list_member($ALIGN, current_31);
                                            SubLObject align = (NIL != align_tail) ? ((SubLObject) (cadr(align_tail))) : NIL;
                                            SubLObject border_tail = property_list_member($BORDER, current_31);
                                            SubLObject border = (NIL != border_tail) ? ((SubLObject) (cadr(border_tail))) : NIL;
                                            SubLObject cellpadding_tail = property_list_member($CELLPADDING, current_31);
                                            SubLObject cellpadding = (NIL != cellpadding_tail) ? ((SubLObject) (cadr(cellpadding_tail))) : NIL;
                                            SubLObject cellspacing_tail = property_list_member($CELLSPACING, current_31);
                                            SubLObject cellspacing = (NIL != cellspacing_tail) ? ((SubLObject) (cadr(cellspacing_tail))) : NIL;
                                            SubLObject colspec_tail = property_list_member($COLSPEC, current_31);
                                            SubLObject colspec = (NIL != colspec_tail) ? ((SubLObject) (cadr(colspec_tail))) : NIL;
                                            SubLObject units_tail = property_list_member($UNITS, current_31);
                                            SubLObject units = (NIL != units_tail) ? ((SubLObject) (cadr(units_tail))) : NIL;
                                            SubLObject bgcolor_tail = property_list_member($BGCOLOR, current_31);
                                            SubLObject bgcolor = (NIL != bgcolor_tail) ? ((SubLObject) (cadr(bgcolor_tail))) : NIL;
                                            SubLObject width_tail = property_list_member($WIDTH, current_31);
                                            SubLObject width = (NIL != width_tail) ? ((SubLObject) (cadr(width_tail))) : NIL;
                                            SubLObject background_tail = property_list_member($BACKGROUND, current_31);
                                            SubLObject background = (NIL != background_tail) ? ((SubLObject) (cadr(background_tail))) : NIL;
                                            SubLObject stream = NIL;
                                            try {
                                                stream = make_private_string_output_stream();
                                                {
                                                    SubLObject _prev_bind_0_33 = html_macros.$html_stream$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_stream$.bind(stream, thread);
                                                        html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                        if (NIL != noflow) {
                                                            html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
                                                        }
                                                        if (NIL != nowrap) {
                                                            html_simple_attribute(html_macros.$html_table_nowrap$.getGlobalValue());
                                                        }
                                                        if (NIL != align) {
                                                            html_markup(html_macros.$html_table_align$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(html_align(align));
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        if (NIL != border) {
                                                            html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(border);
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        if (NIL != cellpadding) {
                                                            html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(cellpadding);
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        if (NIL != cellspacing) {
                                                            html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(cellspacing);
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        if (NIL != colspec) {
                                                            html_markup(html_macros.$html_table_colspec$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(colspec);
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        if (NIL != units) {
                                                            html_markup(html_macros.$html_table_units$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(units);
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        if (NIL != bgcolor) {
                                                            html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(bgcolor);
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        if (NIL != width) {
                                                            html_markup(html_macros.$html_table_width$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(width);
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        if (NIL != background) {
                                                            html_markup(html_macros.$html_table_background$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(background);
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_34 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            SubLObject _prev_bind_1 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_macros.$html_safe_print$.bind(NIL, thread);
                                                                {
                                                                    SubLObject cdolist_list_var = content;
                                                                    SubLObject row = NIL;
                                                                    for (row = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , row = cdolist_list_var.first()) {
                                                                        html_princ(row);
                                                                    }
                                                                }
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_1, thread);
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_34, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_stream$.rebind(_prev_bind_0_33, thread);
                                                    }
                                                }
                                                html_string = get_output_stream_string(stream);
                                            } finally {
                                                {
                                                    SubLObject _prev_bind_0_35 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        close(stream, UNPROVIDED);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_35, thread);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                Errors.$error_handler$.rebind(_prev_bind_0, thread);
                            }
                        }
                    } catch (Throwable ccatch_env_var) {
                        error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                    }
                    if (NIL != error_message) {
                        relation_evaluation.throw_unevaluatable();
                    }
                    return html_string;
                }
            }
        }
    }

    /**
     *
     *
     * @unknown baxter
     */
    @LispMethod(comment = "@unknown baxter")
    public static SubLObject cyc_html_table_variable_arity(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject options = NIL;
        SubLObject content = NIL;
        destructuring_bind_must_consp(args, args, $list100);
        options = args.first();
        final SubLObject current = content = args.rest();
        if ((!content.isCons()) || (NIL == el_list_p(options))) {
            relation_evaluation.throw_unevaluatable();
        }
        SubLObject html_string = NIL;
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject current_$32;
                    final SubLObject datum_$31 = current_$32 = html_table_plist(options);
                    SubLObject allow_other_keys_p = NIL;
                    SubLObject rest = current_$32;
                    SubLObject bad = NIL;
                    SubLObject current_$33 = NIL;
                    while (NIL != rest) {
                        destructuring_bind_must_consp(rest, datum_$31, $list107);
                        current_$33 = rest.first();
                        rest = rest.rest();
                        destructuring_bind_must_consp(rest, datum_$31, $list107);
                        if (NIL == member(current_$33, $list108, UNPROVIDED, UNPROVIDED)) {
                            bad = T;
                        }
                        if (current_$33 == $ALLOW_OTHER_KEYS) {
                            allow_other_keys_p = rest.first();
                        }
                        rest = rest.rest();
                    } 
                    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                        cdestructuring_bind_error(datum_$31, $list107);
                    }
                    final SubLObject noflow_tail = property_list_member($NOFLOW, current_$32);
                    final SubLObject noflow = (NIL != noflow_tail) ? cadr(noflow_tail) : NIL;
                    final SubLObject nowrap_tail = property_list_member($NOWRAP, current_$32);
                    final SubLObject nowrap = (NIL != nowrap_tail) ? cadr(nowrap_tail) : NIL;
                    final SubLObject align_tail = property_list_member($ALIGN, current_$32);
                    final SubLObject align = (NIL != align_tail) ? cadr(align_tail) : NIL;
                    final SubLObject border_tail = property_list_member($BORDER, current_$32);
                    final SubLObject border = (NIL != border_tail) ? cadr(border_tail) : NIL;
                    final SubLObject cellpadding_tail = property_list_member($CELLPADDING, current_$32);
                    final SubLObject cellpadding = (NIL != cellpadding_tail) ? cadr(cellpadding_tail) : NIL;
                    final SubLObject cellspacing_tail = property_list_member($CELLSPACING, current_$32);
                    final SubLObject cellspacing = (NIL != cellspacing_tail) ? cadr(cellspacing_tail) : NIL;
                    final SubLObject colspec_tail = property_list_member($COLSPEC, current_$32);
                    final SubLObject colspec = (NIL != colspec_tail) ? cadr(colspec_tail) : NIL;
                    final SubLObject units_tail = property_list_member($UNITS, current_$32);
                    final SubLObject units = (NIL != units_tail) ? cadr(units_tail) : NIL;
                    final SubLObject bgcolor_tail = property_list_member($BGCOLOR, current_$32);
                    final SubLObject bgcolor = (NIL != bgcolor_tail) ? cadr(bgcolor_tail) : NIL;
                    final SubLObject width_tail = property_list_member($WIDTH, current_$32);
                    final SubLObject width = (NIL != width_tail) ? cadr(width_tail) : NIL;
                    final SubLObject background_tail = property_list_member($BACKGROUND, current_$32);
                    final SubLObject background = (NIL != background_tail) ? cadr(background_tail) : NIL;
                    SubLObject stream = NIL;
                    try {
                        stream = make_private_string_output_stream();
                        final SubLObject _prev_bind_0_$34 = html_macros.$html_stream$.currentBinding(thread);
                        try {
                            html_macros.$html_stream$.bind(stream, thread);
                            html_markup(html_macros.$html_table_head$.getGlobalValue());
                            if (NIL != noflow) {
                                html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
                            }
                            if (NIL != nowrap) {
                                html_simple_attribute(html_macros.$html_table_nowrap$.getGlobalValue());
                            }
                            if (NIL != align) {
                                html_markup(html_macros.$html_table_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align(align));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != border) {
                                html_markup(html_macros.$html_table_border$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(border);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != cellpadding) {
                                html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(cellpadding);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != cellspacing) {
                                html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(cellspacing);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != colspec) {
                                html_markup(html_macros.$html_table_colspec$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(colspec);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != units) {
                                html_markup(html_macros.$html_table_units$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(units);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != bgcolor) {
                                html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(bgcolor);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != width) {
                                html_markup(html_macros.$html_table_width$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(width);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != background) {
                                html_markup(html_macros.$html_table_background$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(background);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_macros.$html_safe_print$.bind(NIL, thread);
                                SubLObject cdolist_list_var = content;
                                SubLObject row = NIL;
                                row = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    html_princ(row);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    row = cdolist_list_var.first();
                                } 
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
                            }
                            html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_stream$.rebind(_prev_bind_0_$34, thread);
                        }
                        html_string = get_output_stream_string(stream);
                    } finally {
                        final SubLObject _prev_bind_0_$36 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            close(stream, UNPROVIDED);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$36, thread);
                        }
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error_message) {
            relation_evaluation.throw_unevaluatable();
        }
        return html_string;
    }

    public static final SubLObject html_table_plist_alt(SubLObject options) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject plist = NIL;
                SubLObject cdolist_list_var = el_list_items(options);
                SubLObject item = NIL;
                for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                    thread.resetMultipleValues();
                    {
                        SubLObject key = com.cyc.cycjava.cycl.evaluation_defns.decode_html_option(item);
                        SubLObject value = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        plist = putf(plist, key, value);
                    }
                }
                return plist;
            }
        }
    }

    public static SubLObject html_table_plist(final SubLObject options) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject plist = NIL;
        SubLObject cdolist_list_var = el_list_items(options);
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject key = decode_html_option(item);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            plist = putf(plist, key, value);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return plist;
    }

    /**
     *
     *
     * @unknown baxter
     */
    @LispMethod(comment = "@unknown baxter")
    public static final SubLObject cyc_html_division_alt(SubLObject options, SubLObject content) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!(content.isString() && (NIL != el_list_p(options)))) {
                relation_evaluation.throw_unevaluatable();
            }
            {
                SubLObject html_string = NIL;
                SubLObject error_message = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                {
                                    SubLObject datum = com.cyc.cycjava.cycl.evaluation_defns.html_division_plist(options);
                                    SubLObject current = datum;
                                    SubLObject allow_other_keys_p = NIL;
                                    SubLObject rest = current;
                                    SubLObject bad = NIL;
                                    SubLObject current_36 = NIL;
                                    for (; NIL != rest;) {
                                        destructuring_bind_must_consp(rest, datum, $list_alt90);
                                        current_36 = rest.first();
                                        rest = rest.rest();
                                        destructuring_bind_must_consp(rest, datum, $list_alt90);
                                        if (NIL == member(current_36, $list_alt91, UNPROVIDED, UNPROVIDED)) {
                                            bad = T;
                                        }
                                        if (current_36 == $ALLOW_OTHER_KEYS) {
                                            allow_other_keys_p = rest.first();
                                        }
                                        rest = rest.rest();
                                    }
                                    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                        cdestructuring_bind_error(datum, $list_alt90);
                                    }
                                    {
                                        SubLObject id_tail = property_list_member($ID, current);
                                        SubLObject id = (NIL != id_tail) ? ((SubLObject) (cadr(id_tail))) : NIL;
                                        SubLObject class_tail = property_list_member($CLASS, current);
                                        SubLObject v_class = (NIL != class_tail) ? ((SubLObject) (cadr(class_tail))) : NIL;
                                        SubLObject style_tail = property_list_member($STYLE, current);
                                        SubLObject style = (NIL != style_tail) ? ((SubLObject) (cadr(style_tail))) : NIL;
                                        SubLObject onload_tail = property_list_member($ONLOAD, current);
                                        SubLObject onload = (NIL != onload_tail) ? ((SubLObject) (cadr(onload_tail))) : NIL;
                                        SubLObject stream = NIL;
                                        try {
                                            stream = make_private_string_output_stream();
                                            {
                                                SubLObject _prev_bind_0_37 = html_macros.$html_stream$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_stream$.bind(stream, thread);
                                                    if ((NIL != style) && (NIL != onload)) {
                                                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                                                        if (NIL != id) {
                                                            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(id);
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        if (NIL != v_class) {
                                                            html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(v_class);
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_markup(html_macros.$html_div_style$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(style);
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(html_macros.$html_div_onload$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(onload);
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_38 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            SubLObject _prev_bind_1 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_macros.$html_safe_print$.bind(NIL, thread);
                                                                html_princ(content);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_1, thread);
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_38, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                                    } else {
                                                        if (NIL != style) {
                                                            html_markup(html_macros.$html_div_head$.getGlobalValue());
                                                            if (NIL != id) {
                                                                html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                html_markup(id);
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            if (NIL != v_class) {
                                                                html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                html_markup(v_class);
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_markup(html_macros.$html_div_style$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(style);
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_39 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                SubLObject _prev_bind_1 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_macros.$html_safe_print$.bind(NIL, thread);
                                                                    html_princ(content);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_1, thread);
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_39, thread);
                                                                }
                                                            }
                                                            html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                                        } else {
                                                            if (NIL != onload) {
                                                                html_markup(html_macros.$html_div_head$.getGlobalValue());
                                                                if (NIL != id) {
                                                                    html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_markup(id);
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                if (NIL != v_class) {
                                                                    html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_markup(v_class);
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_markup(html_macros.$html_div_onload$.getGlobalValue());
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                html_markup(onload);
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_40 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    SubLObject _prev_bind_1 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_macros.$html_safe_print$.bind(NIL, thread);
                                                                        html_princ(content);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_1, thread);
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_40, thread);
                                                                    }
                                                                }
                                                                html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                                            } else {
                                                                html_markup(html_macros.$html_div_head$.getGlobalValue());
                                                                if (NIL != id) {
                                                                    html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_markup(id);
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                if (NIL != v_class) {
                                                                    html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_markup(v_class);
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_41 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    SubLObject _prev_bind_1 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_macros.$html_safe_print$.bind(NIL, thread);
                                                                        html_princ(content);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_1, thread);
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_41, thread);
                                                                    }
                                                                }
                                                                html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                                            }
                                                        }
                                                    }
                                                } finally {
                                                    html_macros.$html_stream$.rebind(_prev_bind_0_37, thread);
                                                }
                                            }
                                            html_string = get_output_stream_string(stream);
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0_42 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    close(stream, UNPROVIDED);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_42, thread);
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                }
                if (NIL != error_message) {
                    relation_evaluation.throw_unevaluatable();
                }
                return html_string;
            }
        }
    }

    /**
     *
     *
     * @unknown baxter
     */
    @LispMethod(comment = "@unknown baxter")
    public static SubLObject cyc_html_division(final SubLObject options, final SubLObject content) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((!content.isString()) || (NIL == el_list_p(options))) {
            relation_evaluation.throw_unevaluatable();
        }
        SubLObject html_string = NIL;
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject current;
                    final SubLObject datum = current = html_division_plist(options);
                    SubLObject allow_other_keys_p = NIL;
                    SubLObject rest = current;
                    SubLObject bad = NIL;
                    SubLObject current_$37 = NIL;
                    while (NIL != rest) {
                        destructuring_bind_must_consp(rest, datum, $list117);
                        current_$37 = rest.first();
                        rest = rest.rest();
                        destructuring_bind_must_consp(rest, datum, $list117);
                        if (NIL == member(current_$37, $list118, UNPROVIDED, UNPROVIDED)) {
                            bad = T;
                        }
                        if (current_$37 == $ALLOW_OTHER_KEYS) {
                            allow_other_keys_p = rest.first();
                        }
                        rest = rest.rest();
                    } 
                    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                        cdestructuring_bind_error(datum, $list117);
                    }
                    final SubLObject id_tail = property_list_member($ID, current);
                    final SubLObject id = (NIL != id_tail) ? cadr(id_tail) : NIL;
                    final SubLObject class_tail = property_list_member($CLASS, current);
                    final SubLObject v_class = (NIL != class_tail) ? cadr(class_tail) : NIL;
                    final SubLObject style_tail = property_list_member($STYLE, current);
                    final SubLObject style = (NIL != style_tail) ? cadr(style_tail) : NIL;
                    final SubLObject onload_tail = property_list_member($ONLOAD, current);
                    final SubLObject onload = (NIL != onload_tail) ? cadr(onload_tail) : NIL;
                    SubLObject stream = NIL;
                    try {
                        stream = make_private_string_output_stream();
                        final SubLObject _prev_bind_0_$38 = html_macros.$html_stream$.currentBinding(thread);
                        try {
                            html_macros.$html_stream$.bind(stream, thread);
                            if ((NIL != style) && (NIL != onload)) {
                                html_markup(html_macros.$html_div_head$.getGlobalValue());
                                if (NIL != id) {
                                    html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(id);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (NIL != v_class) {
                                    html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(v_class);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_markup(html_macros.$html_div_style$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(style);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_div_onload$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(onload);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding(thread);
                                final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_macros.$html_safe_print$.bind(NIL, thread);
                                    html_princ(content);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$39, thread);
                                }
                                html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            } else
                                if (NIL != style) {
                                    html_markup(html_macros.$html_div_head$.getGlobalValue());
                                    if (NIL != id) {
                                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(id);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    if (NIL != v_class) {
                                        html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(v_class);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_markup(html_macros.$html_div_style$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(style);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding(thread);
                                    final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_macros.$html_safe_print$.bind(NIL, thread);
                                        html_princ(content);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$40, thread);
                                    }
                                    html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                } else
                                    if (NIL != onload) {
                                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                                        if (NIL != id) {
                                            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(id);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        if (NIL != v_class) {
                                            html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(v_class);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_markup(html_macros.$html_div_onload$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(onload);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding(thread);
                                        final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_macros.$html_safe_print$.bind(NIL, thread);
                                            html_princ(content);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$41, thread);
                                        }
                                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                    } else {
                                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                                        if (NIL != id) {
                                            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(id);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        if (NIL != v_class) {
                                            html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(v_class);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding(thread);
                                        final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_macros.$html_safe_print$.bind(NIL, thread);
                                            html_princ(content);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$42, thread);
                                        }
                                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                    }


                        } finally {
                            html_macros.$html_stream$.rebind(_prev_bind_0_$38, thread);
                        }
                        html_string = get_output_stream_string(stream);
                    } finally {
                        final SubLObject _prev_bind_0_$43 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            close(stream, UNPROVIDED);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$43, thread);
                        }
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error_message) {
            relation_evaluation.throw_unevaluatable();
        }
        return html_string;
    }

    /**
     *
     *
     * @unknown baxter
     */
    @LispMethod(comment = "@unknown baxter")
    public static final SubLObject cyc_html_division_variable_arity_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject options = NIL;
                SubLObject content = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt73);
                options = current.first();
                current = current.rest();
                content = current;
                if (!(content.isCons() && (NIL != el_list_p(options)))) {
                    relation_evaluation.throw_unevaluatable();
                }
                {
                    SubLObject html_string = NIL;
                    SubLObject error_message = NIL;
                    try {
                        {
                            SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                try {
                                    {
                                        SubLObject datum_43 = com.cyc.cycjava.cycl.evaluation_defns.html_division_plist(options);
                                        SubLObject current_44 = datum_43;
                                        SubLObject allow_other_keys_p = NIL;
                                        SubLObject rest = current_44;
                                        SubLObject bad = NIL;
                                        SubLObject current_45 = NIL;
                                        for (; NIL != rest;) {
                                            destructuring_bind_must_consp(rest, datum_43, $list_alt90);
                                            current_45 = rest.first();
                                            rest = rest.rest();
                                            destructuring_bind_must_consp(rest, datum_43, $list_alt90);
                                            if (NIL == member(current_45, $list_alt91, UNPROVIDED, UNPROVIDED)) {
                                                bad = T;
                                            }
                                            if (current_45 == $ALLOW_OTHER_KEYS) {
                                                allow_other_keys_p = rest.first();
                                            }
                                            rest = rest.rest();
                                        }
                                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                            cdestructuring_bind_error(datum_43, $list_alt90);
                                        }
                                        {
                                            SubLObject id_tail = property_list_member($ID, current_44);
                                            SubLObject id = (NIL != id_tail) ? ((SubLObject) (cadr(id_tail))) : NIL;
                                            SubLObject class_tail = property_list_member($CLASS, current_44);
                                            SubLObject v_class = (NIL != class_tail) ? ((SubLObject) (cadr(class_tail))) : NIL;
                                            SubLObject style_tail = property_list_member($STYLE, current_44);
                                            SubLObject style = (NIL != style_tail) ? ((SubLObject) (cadr(style_tail))) : NIL;
                                            SubLObject onload_tail = property_list_member($ONLOAD, current_44);
                                            SubLObject onload = (NIL != onload_tail) ? ((SubLObject) (cadr(onload_tail))) : NIL;
                                            SubLObject stream = NIL;
                                            try {
                                                stream = make_private_string_output_stream();
                                                {
                                                    SubLObject _prev_bind_0_46 = html_macros.$html_stream$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_stream$.bind(stream, thread);
                                                        if ((NIL != style) && (NIL != onload)) {
                                                            html_markup(html_macros.$html_div_head$.getGlobalValue());
                                                            if (NIL != id) {
                                                                html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                html_markup(id);
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            if (NIL != v_class) {
                                                                html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                html_markup(v_class);
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_markup(html_macros.$html_div_style$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(style);
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(html_macros.$html_div_onload$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(onload);
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_47 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    com.cyc.cycjava.cycl.evaluation_defns.output_html_division_content(content);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_47, thread);
                                                                }
                                                            }
                                                            html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                                        } else {
                                                            if (NIL != style) {
                                                                html_markup(html_macros.$html_div_head$.getGlobalValue());
                                                                if (NIL != id) {
                                                                    html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_markup(id);
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                if (NIL != v_class) {
                                                                    html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_markup(v_class);
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_markup(html_macros.$html_div_style$.getGlobalValue());
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                html_markup(style);
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_48 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        com.cyc.cycjava.cycl.evaluation_defns.output_html_division_content(content);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_48, thread);
                                                                    }
                                                                }
                                                                html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                                            } else {
                                                                if (NIL != onload) {
                                                                    html_markup(html_macros.$html_div_head$.getGlobalValue());
                                                                    if (NIL != id) {
                                                                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_markup(id);
                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    if (NIL != v_class) {
                                                                        html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_markup(v_class);
                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_markup(html_macros.$html_div_onload$.getGlobalValue());
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_markup(onload);
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_49 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            com.cyc.cycjava.cycl.evaluation_defns.output_html_division_content(content);
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_49, thread);
                                                                        }
                                                                    }
                                                                    html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                                                } else {
                                                                    html_markup(html_macros.$html_div_head$.getGlobalValue());
                                                                    if (NIL != id) {
                                                                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_markup(id);
                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    if (NIL != v_class) {
                                                                        html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_markup(v_class);
                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_50 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            com.cyc.cycjava.cycl.evaluation_defns.output_html_division_content(content);
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_50, thread);
                                                                        }
                                                                    }
                                                                    html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        html_macros.$html_stream$.rebind(_prev_bind_0_46, thread);
                                                    }
                                                }
                                                html_string = get_output_stream_string(stream);
                                            } finally {
                                                {
                                                    SubLObject _prev_bind_0_51 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        close(stream, UNPROVIDED);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_51, thread);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                Errors.$error_handler$.rebind(_prev_bind_0, thread);
                            }
                        }
                    } catch (Throwable ccatch_env_var) {
                        error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                    }
                    if (NIL != error_message) {
                        relation_evaluation.throw_unevaluatable();
                    }
                    return html_string;
                }
            }
        }
    }

    /**
     *
     *
     * @unknown baxter
     */
    @LispMethod(comment = "@unknown baxter")
    public static SubLObject cyc_html_division_variable_arity(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject options = NIL;
        SubLObject content = NIL;
        destructuring_bind_must_consp(args, args, $list100);
        options = args.first();
        final SubLObject current = content = args.rest();
        if ((!content.isCons()) || (NIL == el_list_p(options))) {
            relation_evaluation.throw_unevaluatable();
        }
        SubLObject html_string = NIL;
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject current_$45;
                    final SubLObject datum_$44 = current_$45 = html_division_plist(options);
                    SubLObject allow_other_keys_p = NIL;
                    SubLObject rest = current_$45;
                    SubLObject bad = NIL;
                    SubLObject current_$46 = NIL;
                    while (NIL != rest) {
                        destructuring_bind_must_consp(rest, datum_$44, $list117);
                        current_$46 = rest.first();
                        rest = rest.rest();
                        destructuring_bind_must_consp(rest, datum_$44, $list117);
                        if (NIL == member(current_$46, $list118, UNPROVIDED, UNPROVIDED)) {
                            bad = T;
                        }
                        if (current_$46 == $ALLOW_OTHER_KEYS) {
                            allow_other_keys_p = rest.first();
                        }
                        rest = rest.rest();
                    } 
                    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                        cdestructuring_bind_error(datum_$44, $list117);
                    }
                    final SubLObject id_tail = property_list_member($ID, current_$45);
                    final SubLObject id = (NIL != id_tail) ? cadr(id_tail) : NIL;
                    final SubLObject class_tail = property_list_member($CLASS, current_$45);
                    final SubLObject v_class = (NIL != class_tail) ? cadr(class_tail) : NIL;
                    final SubLObject style_tail = property_list_member($STYLE, current_$45);
                    final SubLObject style = (NIL != style_tail) ? cadr(style_tail) : NIL;
                    final SubLObject onload_tail = property_list_member($ONLOAD, current_$45);
                    final SubLObject onload = (NIL != onload_tail) ? cadr(onload_tail) : NIL;
                    SubLObject stream = NIL;
                    try {
                        stream = make_private_string_output_stream();
                        final SubLObject _prev_bind_0_$47 = html_macros.$html_stream$.currentBinding(thread);
                        try {
                            html_macros.$html_stream$.bind(stream, thread);
                            if ((NIL != style) && (NIL != onload)) {
                                html_markup(html_macros.$html_div_head$.getGlobalValue());
                                if (NIL != id) {
                                    html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(id);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (NIL != v_class) {
                                    html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(v_class);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_markup(html_macros.$html_div_style$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(style);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_div_onload$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(onload);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$48 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    output_html_division_content(content);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$48, thread);
                                }
                                html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            } else
                                if (NIL != style) {
                                    html_markup(html_macros.$html_div_head$.getGlobalValue());
                                    if (NIL != id) {
                                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(id);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    if (NIL != v_class) {
                                        html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(v_class);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_markup(html_macros.$html_div_style$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(style);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$49 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        output_html_division_content(content);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$49, thread);
                                    }
                                    html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                } else
                                    if (NIL != onload) {
                                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                                        if (NIL != id) {
                                            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(id);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        if (NIL != v_class) {
                                            html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(v_class);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_markup(html_macros.$html_div_onload$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(onload);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$50 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            output_html_division_content(content);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$50, thread);
                                        }
                                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                    } else {
                                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                                        if (NIL != id) {
                                            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(id);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        if (NIL != v_class) {
                                            html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(v_class);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$51 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            output_html_division_content(content);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$51, thread);
                                        }
                                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                    }


                        } finally {
                            html_macros.$html_stream$.rebind(_prev_bind_0_$47, thread);
                        }
                        html_string = get_output_stream_string(stream);
                    } finally {
                        final SubLObject _prev_bind_0_$52 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            close(stream, UNPROVIDED);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$52, thread);
                        }
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error_message) {
            relation_evaluation.throw_unevaluatable();
        }
        return html_string;
    }

    public static final SubLObject output_html_division_content_alt(SubLObject content) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(NIL, thread);
                    {
                        SubLObject cdolist_list_var = content;
                        SubLObject item = NIL;
                        for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                            html_princ(item);
                        }
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject output_html_division_content(final SubLObject content) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(NIL, thread);
            SubLObject cdolist_list_var = content;
            SubLObject item = NIL;
            item = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                html_princ(item);
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            } 
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject html_division_plist_alt(SubLObject options) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject plist = NIL;
                SubLObject cdolist_list_var = el_list_items(options);
                SubLObject item = NIL;
                for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                    thread.resetMultipleValues();
                    {
                        SubLObject key = com.cyc.cycjava.cycl.evaluation_defns.decode_html_option(item);
                        SubLObject value = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        plist = putf(plist, key, value);
                    }
                }
                return plist;
            }
        }
    }

    public static SubLObject html_division_plist(final SubLObject options) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject plist = NIL;
        SubLObject cdolist_list_var = el_list_items(options);
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject key = decode_html_option(item);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            plist = putf(plist, key, value);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return plist;
    }

    public static final SubLObject decode_html_option_alt(SubLObject item) {
        {
            SubLObject datum = el_list_items(item);
            SubLObject current = datum;
            SubLObject el_attribute = NIL;
            SubLObject el_value = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt96);
            el_attribute = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt96);
            el_value = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != pattern_match.tree_matches_pattern(el_attribute, $list_alt97)) {
                    return values(cycl_utilities.nat_arg1(el_attribute, UNPROVIDED), el_value);
                } else {
                    return values(com.cyc.cycjava.cycl.evaluation_defns.parse_html_attribute(el_attribute), com.cyc.cycjava.cycl.evaluation_defns.parse_html_attribute_value(el_value));
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt96);
            }
        }
        return NIL;
    }

    public static SubLObject decode_html_option(final SubLObject item) {
        SubLObject current;
        final SubLObject datum = current = el_list_items(item);
        SubLObject el_attribute = NIL;
        SubLObject el_value = NIL;
        destructuring_bind_must_consp(current, datum, $list123);
        el_attribute = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list123);
        el_value = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list123);
            return NIL;
        }
        if (NIL != pattern_match.tree_matches_pattern(el_attribute, $list124)) {
            return values(cycl_utilities.nat_arg1(el_attribute, UNPROVIDED), el_value);
        }
        return values(parse_html_attribute(el_attribute), parse_html_attribute_value(el_value));
    }

    /**
     *
     *
     * @return KEYWORDP corresponding to EL-ATTRIBUTE.
     */
    @LispMethod(comment = "@return KEYWORDP corresponding to EL-ATTRIBUTE.")
    public static final SubLObject parse_html_attribute_alt(SubLObject el_attribute) {
        {
            SubLObject ans = (NIL != forts.fort_p(el_attribute)) ? ((SubLObject) (subl_identifier.sublid_from_cyc_entity(el_attribute))) : NIL;
            if (!ans.isKeyword()) {
                relation_evaluation.throw_unevaluatable();
            }
            return ans;
        }
    }

    /**
     *
     *
     * @return KEYWORDP corresponding to EL-ATTRIBUTE.
     */
    @LispMethod(comment = "@return KEYWORDP corresponding to EL-ATTRIBUTE.")
    public static SubLObject parse_html_attribute(final SubLObject el_attribute) {
        final SubLObject ans = (NIL != forts.fort_p(el_attribute)) ? subl_identifier.sublid_from_cyc_entity(el_attribute) : NIL;
        if (!ans.isKeyword()) {
            relation_evaluation.throw_unevaluatable();
        }
        return ans;
    }

    /**
     *
     *
     * @return ATOM corresponding to EL-VALUE.
     */
    @LispMethod(comment = "@return ATOM corresponding to EL-VALUE.")
    public static final SubLObject parse_html_attribute_value_alt(SubLObject el_value) {
        if (NIL != pattern_match.tree_matches_pattern($list_alt98, el_value)) {
            return cconcatenate(format_nil.format_nil_d_no_copy(cycl_utilities.nat_arg1(el_value, UNPROVIDED)), $str_alt99$_);
        } else {
            if (NIL != el_list_p(el_value)) {
                return string_utilities.bunge(Mapping.mapcar(symbol_function(PARSE_HTML_ATTRIBUTE_VALUE), el_list_items(el_value)), UNPROVIDED);
            } else {
                return el_value;
            }
        }
    }

    /**
     *
     *
     * @return ATOM corresponding to EL-VALUE.
     */
    @LispMethod(comment = "@return ATOM corresponding to EL-VALUE.")
    public static SubLObject parse_html_attribute_value(final SubLObject el_value) {
        if (NIL != pattern_match.tree_matches_pattern($list125, el_value)) {
            return cconcatenate(format_nil.format_nil_d_no_copy(cycl_utilities.nat_arg1(el_value, UNPROVIDED)), $str126$_);
        }
        if (NIL != el_list_p(el_value)) {
            return string_utilities.bunge(Mapping.mapcar(symbol_function(PARSE_HTML_ATTRIBUTE_VALUE), el_list_items(el_value)), UNPROVIDED);
        }
        return el_value;
    }

    public static final SubLObject cyc_contextual_url_alt(SubLObject local_url, SubLObject base_uri) {
        {
            SubLObject absolute_url = NIL;
            SubLObject error_message = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            absolute_url = web_utilities.absolute_url_from_relative_url_and_base(com.cyc.cycjava.cycl.evaluation_defns.url_string(local_url), com.cyc.cycjava.cycl.evaluation_defns.url_string(base_uri));
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            }
            if ((NIL != error_message) || (!absolute_url.isString())) {
                relation_evaluation.throw_unevaluatable();
            }
            return make_unary_formula($$URLFn, absolute_url);
        }
    }

    public static SubLObject cyc_contextual_url(final SubLObject local_url, final SubLObject base_uri) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject absolute_url = NIL;
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    absolute_url = web_utilities.absolute_url_from_relative_url_and_base(url_string(local_url), url_string(base_uri));
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if ((NIL != error_message) || (!absolute_url.isString())) {
            relation_evaluation.throw_unevaluatable();
        }
        return make_unary_formula($$URLFn, absolute_url);
    }

    public static final SubLObject url_string_alt(SubLObject url) {
        if (url.isString()) {
            return url;
        } else {
            if (cycl_utilities.nat_functor(url).eql($$URLFn)) {
                return cycl_utilities.nat_arg1(url, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject url_string(final SubLObject url) {
        if (url.isString()) {
            return url;
        }
        if (cycl_utilities.nat_functor(url).eql($$URLFn)) {
            return cycl_utilities.nat_arg1(url, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject cyc_term_from_sparql_uri(final SubLObject uri_string) {
        if (NIL == uri_string) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject rdf_uri_string = Strings.string_left_trim($list130, Strings.string_right_trim($list131, uri_string));
        return rdf_utilities.rdf_uri_to_cyc_term(rdf_uri.get_rdf_uri(rdf_uri_string, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject open_cyc_uri_for_term(final SubLObject v_term) {
        if (NIL == v_term) {
            relation_evaluation.throw_unevaluatable();
        }
        return owl_cycl_to_xml.owl_opencyc_uri_for_term(v_term, NIL, T, NIL);
    }

    public static SubLObject canonical_uri_for_term(final SubLObject v_term) {
        if (NIL == v_term) {
            relation_evaluation.throw_unevaluatable();
            return NIL;
        }
        if (NIL != resource_with_uri_fn_nat_p(v_term)) {
            return cycl_utilities.nat_arg1(v_term, UNPROVIDED);
        }
        return owl_cycl_to_xml.owl_opencyc_uri_for_term(v_term, NIL, T, NIL);
    }

    public static SubLObject resource_with_uri_fn_nat_p(final SubLObject v_term) {
        return cycl_utilities.nat_with_functor_p(v_term, $$ResourceWithURIFn);
    }

    public static final SubLObject cyc_remove_html_tags_alt(SubLObject string) {
        if (string.isString()) {
            return remove_html_tags(string, string_utilities.$empty_string$.getGlobalValue());
        } else {
            if (NIL != unicode_nauts.unicode_naut_p(string)) {
                return unicode_nauts.display_vector_string_to_cycl_safe_string(remove_html_tags(cycl_utilities.nat_arg1(string, UNPROVIDED), string_utilities.$empty_string$.getGlobalValue()));
            } else {
                relation_evaluation.throw_unevaluatable();
            }
        }
        return NIL;
    }

    public static SubLObject cyc_remove_html_tags(final SubLObject string) {
        if (string.isString()) {
            return remove_html_tags(string, string_utilities.$empty_string$.getGlobalValue());
        }
        if (NIL != unicode_nauts.unicode_naut_p(string, UNPROVIDED)) {
            return unicode_nauts.display_vector_string_to_cycl_safe_string(remove_html_tags(cycl_utilities.nat_arg1(string, UNPROVIDED), string_utilities.$empty_string$.getGlobalValue()));
        }
        relation_evaluation.throw_unevaluatable();
        return NIL;
    }

    /**
     * #$evaluationDefn for #$SmartCapitalizeFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$SmartCapitalizeFn")
    public static final SubLObject cyc_capitalize_smart_alt(SubLObject string) {
        if (!string.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        return string_utilities.capitalize_smart(string);
    }

    /**
     * #$evaluationDefn for #$SmartCapitalizeFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$SmartCapitalizeFn")
    public static SubLObject cyc_capitalize_smart(final SubLObject string) {
        if (!string.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        return string_utilities.capitalize_smart(string);
    }

    /**
     * #$evaluationDefn for #$RecapitalizeSmartFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$RecapitalizeSmartFn")
    public static final SubLObject cyc_recapitalize_smart_alt(SubLObject string) {
        if (!string.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        return string_utilities.uncapitalize_smart(string);
    }

    /**
     * #$evaluationDefn for #$RecapitalizeSmartFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$RecapitalizeSmartFn")
    public static SubLObject cyc_recapitalize_smart(final SubLObject string) {
        if (!string.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        return string_utilities.uncapitalize_smart(string);
    }

    /**
     * #$evaluationDefn for #$FormulaArgFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$FormulaArgFn")
    public static final SubLObject cyc_relation_arg_alt(SubLObject n, SubLObject expression) {
        if (!(((NIL != relation_expressionP(expression)) && n.isInteger()) && (!n.isNegative()))) {
            relation_evaluation.throw_unevaluatable();
        }
        if (expression.isCons()) {
            if (!n.numL(formula_length(expression, UNPROVIDED))) {
                relation_evaluation.throw_unevaluatable();
            }
            return cycl_utilities.formula_arg(expression, n, UNPROVIDED);
        } else {
            if (NIL != nart_handles.nart_p(expression)) {
                return com.cyc.cycjava.cycl.evaluation_defns.cyc_relation_arg(n, narts_high.nart_hl_formula(expression));
            } else {
                relation_evaluation.throw_unevaluatable();
            }
        }
        return NIL;
    }

    /**
     * #$evaluationDefn for #$FormulaArgFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$FormulaArgFn")
    public static SubLObject cyc_relation_arg(final SubLObject n, final SubLObject expression) {
        if (((NIL == relation_expressionP(expression)) || (!n.isInteger())) || n.isNegative()) {
            relation_evaluation.throw_unevaluatable();
        }
        if (expression.isCons()) {
            if (!n.numL(formula_length(expression, UNPROVIDED))) {
                relation_evaluation.throw_unevaluatable();
            }
            return cycl_utilities.formula_arg(expression, n, UNPROVIDED);
        }
        if (NIL != nart_handles.nart_p(expression)) {
            return cyc_relation_arg(n, narts_high.nart_hl_formula(expression));
        }
        relation_evaluation.throw_unevaluatable();
        return NIL;
    }

    /**
     * #$evaluationDefn for #$FormulaArgListFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$FormulaArgListFn")
    public static final SubLObject cyc_relation_args_list_alt(SubLObject expression) {
        if (NIL == relation_expressionP(expression)) {
            relation_evaluation.throw_unevaluatable();
        }
        {
            SubLObject args = copy_list(cycl_utilities.formula_args(expression, UNPROVIDED));
            return bq_cons($$TheList, append(args, NIL));
        }
    }

    /**
     * #$evaluationDefn for #$FormulaArgListFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$FormulaArgListFn")
    public static SubLObject cyc_relation_args_list(final SubLObject expression) {
        if (NIL == relation_expressionP(expression)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject args = copy_list(cycl_utilities.formula_args(expression, UNPROVIDED));
        return bq_cons($$TheList, append(args, NIL));
    }

    /**
     * #$evaluationDefn for #$FormulaArgSetFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$FormulaArgSetFn")
    public static final SubLObject cyc_relation_arg_set_alt(SubLObject expression) {
        if (NIL == relation_expressionP(expression)) {
            relation_evaluation.throw_unevaluatable();
        }
        {
            SubLObject args = cycl_utilities.formula_args(expression, UNPROVIDED);
            SubLObject v_set = reverse(delete_duplicates(reverse(args), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED));
            return bq_cons($$TheSet, append(v_set, NIL));
        }
    }

    /**
     * #$evaluationDefn for #$FormulaArgSetFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$FormulaArgSetFn")
    public static SubLObject cyc_relation_arg_set(final SubLObject expression) {
        if (NIL == relation_expressionP(expression)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject args = cycl_utilities.formula_args(expression, UNPROVIDED);
        final SubLObject v_set = reverse(delete_duplicates(reverse(args), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return bq_cons($$TheSet, append(v_set, NIL));
    }

    public static SubLObject cyc_quoted_relation_expression_arity(final SubLObject expression) {
        if (NIL == cycl_grammar.fast_cycl_quoted_term_p(expression)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject unquoted_expression = czer_main.unquote_quoted_term(expression, UNPROVIDED);
        return cyc_relation_expression_arity(unquoted_expression);
    }

    /**
     * #$evaluationDefn for #$FormulaArityFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$FormulaArityFn")
    public static final SubLObject cyc_relation_expression_arity_alt(SubLObject expression) {
        if (NIL == relation_expressionP(expression)) {
            relation_evaluation.throw_unevaluatable();
        }
        return formula_arity(expression, UNPROVIDED);
    }

    /**
     * #$evaluationDefn for #$FormulaArityFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$FormulaArityFn")
    public static SubLObject cyc_relation_expression_arity(final SubLObject expression) {
        if (NIL == cycl_utilities.possibly_cycl_formula_p(expression)) {
            relation_evaluation.throw_unevaluatable();
        }
        return formula_arity(expression, UNPROVIDED);
    }

    /**
     * #$evaluationDefn for #$IdentityFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$IdentityFn")
    public static final SubLObject cyc_identity_alt(SubLObject v_object) {
        return identity(v_object);
    }

    /**
     * #$evaluationDefn for #$IdentityFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$IdentityFn")
    public static SubLObject cyc_identity(final SubLObject v_object) {
        return identity(v_object);
    }

    /**
     * #$evaluationDefn for #$RelationTuplesFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$RelationTuplesFn")
    public static final SubLObject cyc_relation_tuples_alt(SubLObject relation) {
        return com.cyc.cycjava.cycl.evaluation_defns.cyc_relation_tuples_internal(relation, UNPROVIDED);
    }

    /**
     * #$evaluationDefn for #$RelationTuplesFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$RelationTuplesFn")
    public static SubLObject cyc_relation_tuples(final SubLObject relation) {
        return cyc_relation_tuples_internal(relation, UNPROVIDED);
    }

    public static final SubLObject cyc_relation_tuples_internal_alt(SubLObject relation, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            SubLObject kappa_predicate = com.cyc.cycjava.cycl.evaluation_defns.convert_relation_to_kappa(relation);
            if (NIL == kappa_predicate) {
                relation_evaluation.throw_unevaluatable();
            }
            {
                SubLObject formal_args = kappa_predicate_formal_args(kappa_predicate);
                SubLObject query = kappa_predicate_query(kappa_predicate);
                return make_el_list_recursively(ask_utilities.kappa_tuples(formal_args, query, mt, UNPROVIDED), UNPROVIDED);
            }
        }
    }

    public static SubLObject cyc_relation_tuples_internal(final SubLObject relation, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLObject kappa_predicate = convert_relation_to_kappa(relation);
        if (NIL == kappa_predicate) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject formal_args = kappa_predicate_formal_args(kappa_predicate);
        final SubLObject query = kappa_predicate_query(kappa_predicate);
        return make_el_list_recursively(ask_utilities.kappa_tuples(formal_args, query, mt, UNPROVIDED), NIL, TWO_INTEGER);
    }

    public static final SubLObject convert_relation_to_kappa_alt(SubLObject relation) {
        if (NIL != kappa_predicate_p(relation)) {
            return relation;
        }
        if (NIL != forts.fort_p(relation)) {
            {
                SubLObject v_arity = arity.arity(relation);
                if (v_arity.isInteger() && (!v_arity.isNegative())) {
                    {
                        SubLObject formal_args = variables.generate_hl_variable_list(v_arity);
                        SubLObject query = cons(relation, formal_args);
                        return list($$Kappa, formal_args, query);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject convert_relation_to_kappa(final SubLObject relation) {
        if (NIL != kappa_predicate_p(relation)) {
            return relation;
        }
        if (NIL != forts.fort_p(relation)) {
            final SubLObject v_arity = arity.arity(relation);
            if (v_arity.isInteger() && (!v_arity.isNegative())) {
                final SubLObject formal_args = variables.generate_hl_variable_list(v_arity);
                final SubLObject query = cons(relation, formal_args);
                return list($$Kappa, formal_args, query);
            }
        }
        return NIL;
    }

    /**
     * #$evaluationDefn for #$SubstituteFormulaFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$SubstituteFormulaFn")
    public static final SubLObject cyc_substitute_formula_alt(SubLObject v_new, SubLObject old, SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $bug_18769_switchP$.getDynamicValue(thread)) {
                {
                    SubLObject unquoted_new = unquote_quoted_term(v_new, UNPROVIDED);
                    SubLObject unquoted_old = unquote_quoted_term(old, UNPROVIDED);
                    SubLObject unquoted_formula = cycl_utilities.hl_to_el(unquote_quoted_term(formula, UNPROVIDED));
                    return subst(unquoted_new, unquoted_old, unquoted_formula, symbol_function(EQUAL), UNPROVIDED);
                }
            } else {
                return subst(v_new, old, cycl_utilities.hl_to_el(formula), symbol_function(EQUAL), UNPROVIDED);
            }
        }
    }

    /**
     * #$evaluationDefn for #$SubstituteFormulaFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$SubstituteFormulaFn")
    public static SubLObject cyc_substitute_formula(final SubLObject v_new, final SubLObject old, final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $bug_18769_switchP$.getDynamicValue(thread)) {
            final SubLObject unquoted_new = czer_main.unquote_quoted_term(v_new, UNPROVIDED);
            final SubLObject unquoted_old = czer_main.unquote_quoted_term(old, UNPROVIDED);
            return subst(unquoted_new, unquoted_old, formula, symbol_function(EQUAL), UNPROVIDED);
        }
        return narts_high.nart_substitute(subst(cycl_utilities.hl_to_el(v_new), cycl_utilities.hl_to_el(old), cycl_utilities.hl_to_el(formula), symbol_function(EQUAL), UNPROVIDED));
    }

    /**
     * #$evaluationDefn for #$BilateralFormOfSentence-Left.
     *
     * @unknown baxter
     */
    @LispMethod(comment = "#$evaluationDefn for #$BilateralFormOfSentence-Left.\r\n\r\n@unknown baxter")
    public static final SubLObject cyc_bilateral_form_of_sentence_left_alt(SubLObject sentence) {
        {
            SubLObject el_sentence = cycl_utilities.hl_to_el(sentence);
            if (NIL == com.cyc.cycjava.cycl.evaluation_defns.symmetry_neutralized_el_sentence_p(el_sentence)) {
                relation_evaluation.throw_unevaluatable();
            }
            return cycl_utilities.hl_to_el(cycl_utilities.expression_transform(cycl_utilities.hl_to_el(el_sentence), $sym116$SYMMETRIC_PART_TYPE_, LEFT_FORM_OF_SYMMETRIC_PART_TYPE, UNPROVIDED, UNPROVIDED));
        }
    }

    /**
     * #$evaluationDefn for #$BilateralFormOfSentence-Left.
     *
     * @unknown baxter
     */
    @LispMethod(comment = "#$evaluationDefn for #$BilateralFormOfSentence-Left.\r\n\r\n@unknown baxter")
    public static SubLObject cyc_bilateral_form_of_sentence_left(final SubLObject sentence) {
        final SubLObject el_sentence = cycl_utilities.hl_to_el(sentence);
        if (NIL == symmetry_neutralized_el_sentence_p(el_sentence)) {
            relation_evaluation.throw_unevaluatable();
        }
        return cycl_utilities.hl_to_el(cycl_utilities.expression_transform(cycl_utilities.hl_to_el(el_sentence), $sym150$SYMMETRIC_PART_TYPE_, LEFT_FORM_OF_SYMMETRIC_PART_TYPE, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject symmetric_part_typeP_alt(SubLObject v_object) {
        return isa.isaP(v_object, $$SymmetricAnatomicalPartType, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject symmetric_part_typeP(final SubLObject v_object) {
        return isa.isaP(v_object, $$SymmetricAnatomicalPartType, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject left_form_of_symmetric_part_type_alt(SubLObject symmetric_part_type) {
        return cyc_find_or_create_nart(make_unary_formula($$LeftObjectOfPairFn, symmetric_part_type), UNPROVIDED);
    }

    public static SubLObject left_form_of_symmetric_part_type(final SubLObject symmetric_part_type) {
        return czer_main.cyc_find_or_create_nart(make_unary_formula($$LeftObjectOfPairFn, symmetric_part_type), UNPROVIDED);
    }

    /**
     * #$evaluationDefn for #$BilateralFormOfSentence-Right.
     *
     * @unknown baxter
     */
    @LispMethod(comment = "#$evaluationDefn for #$BilateralFormOfSentence-Right.\r\n\r\n@unknown baxter")
    public static final SubLObject cyc_bilateral_form_of_sentence_right_alt(SubLObject sentence) {
        {
            SubLObject el_sentence = cycl_utilities.hl_to_el(sentence);
            if (NIL == com.cyc.cycjava.cycl.evaluation_defns.symmetry_neutralized_el_sentence_p(el_sentence)) {
                relation_evaluation.throw_unevaluatable();
            }
            return cycl_utilities.hl_to_el(cycl_utilities.expression_transform(cycl_utilities.hl_to_el(el_sentence), $sym116$SYMMETRIC_PART_TYPE_, RIGHT_FORM_OF_SYMMETRIC_PART_TYPE, UNPROVIDED, UNPROVIDED));
        }
    }

    /**
     * #$evaluationDefn for #$BilateralFormOfSentence-Right.
     *
     * @unknown baxter
     */
    @LispMethod(comment = "#$evaluationDefn for #$BilateralFormOfSentence-Right.\r\n\r\n@unknown baxter")
    public static SubLObject cyc_bilateral_form_of_sentence_right(final SubLObject sentence) {
        final SubLObject el_sentence = cycl_utilities.hl_to_el(sentence);
        if (NIL == symmetry_neutralized_el_sentence_p(el_sentence)) {
            relation_evaluation.throw_unevaluatable();
        }
        return cycl_utilities.hl_to_el(cycl_utilities.expression_transform(cycl_utilities.hl_to_el(el_sentence), $sym150$SYMMETRIC_PART_TYPE_, RIGHT_FORM_OF_SYMMETRIC_PART_TYPE, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject symmetry_neutralized_el_sentence_p_alt(SubLObject v_object) {
        return makeBoolean(((NIL != el_grammar.el_sentence_p(v_object)) && (NIL == cycl_utilities.expression_find($$LeftObjectOfPairFn, v_object, T, UNPROVIDED, UNPROVIDED))) && (NIL == cycl_utilities.expression_find($$RightObjectOfPairFn, v_object, T, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject symmetry_neutralized_el_sentence_p(final SubLObject v_object) {
        return makeBoolean(((NIL != el_grammar.el_sentence_p(v_object)) && (NIL == cycl_utilities.expression_find($$LeftObjectOfPairFn, v_object, T, UNPROVIDED, UNPROVIDED))) && (NIL == cycl_utilities.expression_find($$RightObjectOfPairFn, v_object, T, UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject right_form_of_symmetric_part_type_alt(SubLObject symmetric_part_type) {
        return cyc_find_or_create_nart(make_unary_formula($$RightObjectOfPairFn, symmetric_part_type), UNPROVIDED);
    }

    public static SubLObject right_form_of_symmetric_part_type(final SubLObject symmetric_part_type) {
        return czer_main.cyc_find_or_create_nart(make_unary_formula($$RightObjectOfPairFn, symmetric_part_type), UNPROVIDED);
    }

    public static final SubLObject neutralize_symmetric_formula_alt(SubLObject sentence) {
        return cycl_utilities.expression_transform(cycl_utilities.hl_to_el(sentence), SIDE_FN_NAUT_P, NAT_ARG1, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject neutralize_symmetric_formula(final SubLObject sentence) {
        return cycl_utilities.expression_transform(cycl_utilities.hl_to_el(sentence), SIDE_FN_NAUT_P, NAT_ARG1, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject side_fn_naut_p_alt(SubLObject v_object) {
        return el_formula_with_operator_p(v_object, $sym126$_SIDEFN);
    }

    public static SubLObject side_fn_naut_p(final SubLObject v_object) {
        return el_formula_with_operator_p(v_object, $sym160$_SIDEFN);
    }

    /**
     * #$evaluationDefn for #$SubstituteFormulaArgFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$SubstituteFormulaArgFn")
    public static final SubLObject cyc_substitute_formula_arg_alt(SubLObject argnum, SubLObject arg, SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $bug_18769_switchP$.getDynamicValue(thread)) {
                {
                    SubLObject unquoted_arg = unquote_quoted_term(arg, UNPROVIDED);
                    SubLObject unquoted_formula = unquote_quoted_term(formula, UNPROVIDED);
                    SubLObject replaced_formula = replace_formula_arg(argnum, unquoted_arg, unquoted_formula);
                    return make_el_formula($$Quote, list(replaced_formula), UNPROVIDED);
                }
            } else {
                return replace_formula_arg(argnum, arg, formula);
            }
        }
    }

    /**
     * #$evaluationDefn for #$SubstituteFormulaArgFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$SubstituteFormulaArgFn")
    public static SubLObject cyc_substitute_formula_arg(final SubLObject argnum, final SubLObject arg, final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $bug_18769_switchP$.getDynamicValue(thread)) {
            final SubLObject unquoted_arg = czer_main.unquote_quoted_term(arg, UNPROVIDED);
            final SubLObject unquoted_formula = czer_main.unquote_quoted_term(formula, UNPROVIDED);
            final SubLObject replaced_formula = narts_high.nart_substitute(replace_formula_arg(argnum, unquoted_arg, unquoted_formula));
            return make_el_formula($$Quote, list(replaced_formula), UNPROVIDED);
        }
        return narts_high.nart_substitute(replace_formula_arg(argnum, arg, formula));
    }

    /**
     * #$evaluationDefn for #$SubstituteFormulaArgPositionFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$SubstituteFormulaArgPositionFn")
    public static final SubLObject cyc_substitute_formula_arg_position_alt(SubLObject cycl_arg_position, SubLObject arg, SubLObject formula) {
        {
            SubLObject arg_position = cycl_utilities.cycl_arg_position_to_arg_position(cycl_arg_position);
            return replace_formula_arg_position(arg_position, arg, formula);
        }
    }

    /**
     * #$evaluationDefn for #$SubstituteFormulaArgPositionFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$SubstituteFormulaArgPositionFn")
    public static SubLObject cyc_substitute_formula_arg_position(final SubLObject cycl_arg_position, final SubLObject arg, final SubLObject formula) {
        if (NIL == el_formula_p(formula)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject arg_position = cycl_utilities.cycl_arg_position_to_arg_position(cycl_arg_position);
        return narts_high.nart_substitute(replace_formula_arg_position(arg_position, arg, formula));
    }

    /**
     * #$evaluationDefn for #$MakeFormulaFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$MakeFormulaFn")
    public static final SubLObject cyc_make_formula_alt(SubLObject operator, SubLObject el_arg_list) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == el_list_p(el_arg_list)) {
                relation_evaluation.throw_unevaluatable();
            }
            {
                SubLObject subl_arg_list = el_list_items(el_arg_list);
                SubLObject el_formula = NIL;
                if (NIL != $bug_18769_switchP$.getDynamicValue(thread)) {
                    {
                        SubLObject unquoted_operator = NIL;
                        SubLObject unquoted_arg_list = NIL;
                        SubLObject cdolist_list_var = subl_arg_list;
                        SubLObject subl_arg = NIL;
                        for (subl_arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subl_arg = cdolist_list_var.first()) {
                            if (NIL == fast_cycl_quoted_term_p(subl_arg)) {
                                relation_evaluation.throw_unevaluatable();
                            }
                            unquoted_arg_list = cons(unquote_quoted_term(subl_arg, UNPROVIDED), unquoted_arg_list);
                        }
                        unquoted_arg_list = nreverse(unquoted_arg_list);
                        unquoted_operator = unquote_quoted_term(operator, T);
                        el_formula = make_el_formula(unquoted_operator, unquoted_arg_list, UNPROVIDED);
                        if (NIL == cycl_formula_p(el_formula)) {
                            relation_evaluation.throw_unevaluatable();
                        }
                        el_formula = make_el_formula($$Quote, list(el_formula), UNPROVIDED);
                    }
                } else {
                    el_formula = make_el_formula(operator, subl_arg_list, UNPROVIDED);
                    if (NIL == cycl_formula_p(el_formula)) {
                        relation_evaluation.throw_unevaluatable();
                    }
                }
                return el_formula;
            }
        }
    }

    /**
     * #$evaluationDefn for #$MakeFormulaFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$MakeFormulaFn")
    public static SubLObject cyc_make_formula(final SubLObject operator, final SubLObject el_arg_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == el_list_p(el_arg_list)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject subl_arg_list = el_list_items(el_arg_list);
        SubLObject el_formula = NIL;
        if (operator.eql($$Quote)) {
            el_formula = make_el_formula($$Quote, subl_arg_list, UNPROVIDED);
        } else
            if (NIL != $bug_18769_switchP$.getDynamicValue(thread)) {
                el_formula = make_el_formula(operator, subl_arg_list, UNPROVIDED);
                if (NIL == cycl_grammar.cycl_formula_p(el_formula)) {
                    relation_evaluation.throw_unevaluatable();
                }
                el_formula = make_el_formula($$Quote, list(el_formula), UNPROVIDED);
            } else {
                el_formula = make_el_formula(operator, subl_arg_list, UNPROVIDED);
                if (NIL == cycl_grammar.cycl_formula_p(el_formula)) {
                    relation_evaluation.throw_unevaluatable();
                }
            }

        return narts_high.nart_substitute(el_formula);
    }

    public static SubLObject cyc_substitute_quoted_formula(final SubLObject v_new, final SubLObject old, final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $bug_18769_switchP$.currentBinding(thread);
        try {
            $bug_18769_switchP$.bind(T, thread);
            result = cyc_substitute_formula(v_new, old, formula);
        } finally {
            $bug_18769_switchP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * #$evaluationDefn for #$SubstituteQuotedFormulaArgFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$SubstituteQuotedFormulaArgFn")
    public static final SubLObject cyc_substitute_quoted_formula_arg_alt(SubLObject argnum, SubLObject arg, SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $bug_18769_switchP$.currentBinding(thread);
                    try {
                        $bug_18769_switchP$.bind(T, thread);
                        result = com.cyc.cycjava.cycl.evaluation_defns.cyc_substitute_formula_arg(argnum, arg, formula);
                    } finally {
                        $bug_18769_switchP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * #$evaluationDefn for #$SubstituteQuotedFormulaArgFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$SubstituteQuotedFormulaArgFn")
    public static SubLObject cyc_substitute_quoted_formula_arg(final SubLObject argnum, final SubLObject arg, final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $bug_18769_switchP$.currentBinding(thread);
        try {
            $bug_18769_switchP$.bind(T, thread);
            result = cyc_substitute_formula_arg(argnum, arg, formula);
        } finally {
            $bug_18769_switchP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * #$evaluationDefn for #$SubstituteQuotedFormulaArgPositionFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$SubstituteQuotedFormulaArgPositionFn")
    public static final SubLObject cyc_substitute_quoted_formula_arg_position_alt(SubLObject cycl_arg_position, SubLObject arg, SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $bug_18769_switchP$.currentBinding(thread);
                    try {
                        $bug_18769_switchP$.bind(T, thread);
                        result = com.cyc.cycjava.cycl.evaluation_defns.cyc_substitute_formula_arg_position(cycl_arg_position, arg, formula);
                    } finally {
                        $bug_18769_switchP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * #$evaluationDefn for #$SubstituteQuotedFormulaArgPositionFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$SubstituteQuotedFormulaArgPositionFn")
    public static SubLObject cyc_substitute_quoted_formula_arg_position(final SubLObject cycl_arg_position, final SubLObject arg, final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $bug_18769_switchP$.currentBinding(thread);
        try {
            $bug_18769_switchP$.bind(T, thread);
            result = cyc_substitute_formula_arg_position(cycl_arg_position, arg, formula);
        } finally {
            $bug_18769_switchP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * #$evaluationDefn for #$MakeQuotedFormulaFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$MakeQuotedFormulaFn")
    public static final SubLObject cyc_make_quoted_formula_alt(SubLObject operator, SubLObject el_arg_list) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $bug_18769_switchP$.currentBinding(thread);
                    try {
                        $bug_18769_switchP$.bind(T, thread);
                        result = com.cyc.cycjava.cycl.evaluation_defns.cyc_make_formula(operator, el_arg_list);
                    } finally {
                        $bug_18769_switchP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * #$evaluationDefn for #$MakeQuotedFormulaFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$MakeQuotedFormulaFn")
    public static SubLObject cyc_make_quoted_formula(final SubLObject operator, final SubLObject el_arg_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $bug_18769_switchP$.currentBinding(thread);
        try {
            $bug_18769_switchP$.bind(T, thread);
            result = cyc_make_formula(operator, el_arg_list);
        } finally {
            $bug_18769_switchP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * #$evaluationDefn for #$MakeQuotedFormulaFn
     */


    public static final SubLObject cycl_to_el_fn_alt(SubLObject expression) {
        return cycl_utilities.hl_to_el(expression);
    }

    public static SubLObject cycl_to_el_fn(final SubLObject expression) {
        return cycl_utilities.hl_to_el(expression);
    }

    /**
     * Replace occurrences of OLD in NLTE with NEW. The #$evaluationDefn
     * for #$SubstituteNLTEFn.
     */
    @LispMethod(comment = "Replace occurrences of OLD in NLTE with NEW. The #$evaluationDefn\r\nfor #$SubstituteNLTEFn.\nReplace occurrences of OLD in NLTE with NEW. The #$evaluationDefn\nfor #$SubstituteNLTEFn.")
    public static final SubLObject cyc_substitute_nlte_alt(SubLObject v_new, SubLObject old, SubLObject nlte) {
        if (NIL == wff.kwt_wffP(nlte, UNPROVIDED)) {
            relation_evaluation.throw_unevaluatable();
        }
        return subst(v_new, old, nlte, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Replace occurrences of OLD in NLTE with NEW. The #$evaluationDefn
     * for #$SubstituteNLTEFn.
     */
    @LispMethod(comment = "Replace occurrences of OLD in NLTE with NEW. The #$evaluationDefn\r\nfor #$SubstituteNLTEFn.\nReplace occurrences of OLD in NLTE with NEW. The #$evaluationDefn\nfor #$SubstituteNLTEFn.")
    public static SubLObject cyc_substitute_nlte(final SubLObject v_new, final SubLObject old, final SubLObject nlte) {
        if (NIL == wff.kwt_wffP(nlte, UNPROVIDED)) {
            relation_evaluation.throw_unevaluatable();
        }
        return subst(v_new, old, nlte, UNPROVIDED, UNPROVIDED);
    }/**
     * Replace occurrences of OLD in NLTE with NEW. The #$evaluationDefn
     * for #$SubstituteNLTEFn.
     */


    public static final SubLObject sem_trans_template_defn_alt(SubLObject frame, SubLObject head_type, SubLObject pred_list) {
        {
            SubLObject subl_pred_list = el_list_items(pred_list);
            SubLObject template = lexicon_utilities.construct_semtrans_template_from_head_type_and_argument_roles(frame, head_type, subl_pred_list);
            if (NIL != template) {
                return template;
            }
        }
        relation_evaluation.throw_unevaluatable();
        return NIL;
    }

    public static SubLObject sem_trans_template_defn(final SubLObject frame, final SubLObject head_type, final SubLObject pred_list) {
        final SubLObject subl_pred_list = el_list_items(pred_list);
        final SubLObject template = lexicon_utilities.construct_semtrans_template_from_head_type_and_argument_roles(frame, head_type, subl_pred_list);
        if (NIL != template) {
            return template;
        }
        relation_evaluation.throw_unevaluatable();
        return NIL;
    }

    public static final SubLObject cyc_word_strings_alt(SubLObject wu, SubLObject pred) {
        {
            SubLObject strings = NIL;
            SubLObject error_message = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            strings = lexicon_cache.strings_of_wordXpred(wu, pred, mt_relevance_macros.mt_info(UNPROVIDED));
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            }
            if (NIL != error_message) {
                relation_evaluation.throw_unevaluatable();
            } else {
                return make_el_set(strings, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject cyc_word_strings(final SubLObject wu, final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject strings = NIL;
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    strings = lexicon_cache.strings_of_wordXpred(wu, pred, mt_relevance_macros.mt_info(UNPROVIDED));
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error_message) {
            relation_evaluation.throw_unevaluatable();
            return NIL;
        }
        return make_el_set(strings, UNPROVIDED);
    }

    public static final SubLObject word_strings_fn_alt() {
        if (NIL == $word_strings_fn$.getGlobalValue()) {
            $word_strings_fn$.setGlobalValue(constants_high.find_constant($$$WordStringsFn));
        }
        return $word_strings_fn$.getGlobalValue();
    }

    public static SubLObject word_strings_fn() {
        if (NIL == $word_strings_fn$.getGlobalValue()) {
            $word_strings_fn$.setGlobalValue(constants_high.find_constant($$$WordStringsFn));
        }
        return $word_strings_fn$.getGlobalValue();
    }

    public static final SubLObject word_sequence_fn_alt() {
        if (NIL == $word_sequence_fn$.getGlobalValue()) {
            $word_sequence_fn$.setGlobalValue(constants_high.find_constant($$$WordSequenceFn));
        }
        return $word_sequence_fn$.getGlobalValue();
    }

    public static SubLObject word_sequence_fn() {
        if (NIL == $word_sequence_fn$.getGlobalValue()) {
            $word_sequence_fn$.setGlobalValue(constants_high.find_constant($$$WordSequenceFn));
        }
        return $word_sequence_fn$.getGlobalValue();
    }

    public static final SubLObject cyc_strings_of_word_sequence_alt(SubLObject word_sequence) {
        if (!cycl_utilities.nat_functor(word_sequence).eql(com.cyc.cycjava.cycl.evaluation_defns.word_sequence_fn())) {
            relation_evaluation.throw_unevaluatable();
        }
        {
            SubLObject string_sets_in_reverse_order = NIL;
            {
                SubLObject cdolist_list_var = cycl_utilities.nat_args(word_sequence, UNPROVIDED);
                SubLObject item = NIL;
                for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                    {
                        SubLObject item_strings = NIL;
                        if (item.isString()) {
                            item_strings = list(item);
                        } else {
                            if (NIL != el_formula_with_operator_p(item, com.cyc.cycjava.cycl.evaluation_defns.word_strings_fn())) {
                                item_strings = lexicon_cache.strings_of_wordXpred(cycl_utilities.nat_arg1(item, UNPROVIDED), cycl_utilities.nat_arg2(item, UNPROVIDED), mt_relevance_macros.mt_info(UNPROVIDED));
                            }
                        }
                        if (NIL != list_utilities.non_empty_list_p(item_strings)) {
                            string_sets_in_reverse_order = cons(item_strings, string_sets_in_reverse_order);
                        } else {
                            relation_evaluation.throw_unevaluatable();
                        }
                    }
                }
            }
            {
                SubLObject strings = NIL;
                SubLObject cdolist_list_var = list_utilities.cartesian_product(nreverse(string_sets_in_reverse_order), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject string_list = NIL;
                for (string_list = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , string_list = cdolist_list_var.first()) {
                    strings = cons(string_utilities.bunge(string_list, UNPROVIDED), strings);
                }
                return make_el_set(strings, UNPROVIDED);
            }
        }
    }

    public static SubLObject cyc_strings_of_word_sequence(final SubLObject word_sequence) {
        if (!cycl_utilities.nat_functor(word_sequence).eql(word_sequence_fn())) {
            relation_evaluation.throw_unevaluatable();
        }
        SubLObject string_sets_in_reverse_order = NIL;
        SubLObject cdolist_list_var = cycl_utilities.nat_args(word_sequence, UNPROVIDED);
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject item_strings = NIL;
            if (item.isString()) {
                item_strings = list(item);
            } else
                if (NIL != el_formula_with_operator_p(item, word_strings_fn())) {
                    item_strings = lexicon_cache.strings_of_wordXpred(cycl_utilities.nat_arg1(item, UNPROVIDED), cycl_utilities.nat_arg2(item, UNPROVIDED), mt_relevance_macros.mt_info(UNPROVIDED));
                }

            if (NIL != list_utilities.non_empty_list_p(item_strings)) {
                string_sets_in_reverse_order = cons(item_strings, string_sets_in_reverse_order);
            } else {
                relation_evaluation.throw_unevaluatable();
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        SubLObject strings = NIL;
        SubLObject cdolist_list_var2 = list_utilities.cartesian_product(nreverse(string_sets_in_reverse_order), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject string_list = NIL;
        string_list = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            strings = cons(string_utilities.bunge(string_list, UNPROVIDED), strings);
            cdolist_list_var2 = cdolist_list_var2.rest();
            string_list = cdolist_list_var2.first();
        } 
        return make_el_set(strings, UNPROVIDED);
    }

    /**
     * #$evaluationDefn for #$InstantiateFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$InstantiateFn")
    public static final SubLObject cyc_instantiate_alt(SubLObject prefix, SubLObject mt, SubLObject v_set) {
        if (!(prefix.isString() && (NIL != hlmt.hlmt_p(mt)))) {
            relation_evaluation.throw_unevaluatable();
        }
        {
            SubLObject formula = com.cyc.cycjava.cycl.evaluation_defns.cyc_instantiate_set_formula(v_set);
            if (NIL == formula) {
                relation_evaluation.throw_unevaluatable();
            }
            {
                SubLObject v_term = com.cyc.cycjava.cycl.evaluation_defns.cyc_instantiate_formula(formula, mt, prefix);
                if (NIL == v_term) {
                    relation_evaluation.throw_unevaluatable();
                }
                return v_term;
            }
        }
    }

    /**
     * #$evaluationDefn for #$InstantiateFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$InstantiateFn")
    public static SubLObject cyc_instantiate(final SubLObject prefix, final SubLObject mt, final SubLObject v_set) {
        if ((!prefix.isString()) || (NIL == hlmt.hlmt_p(mt))) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject formula = cyc_instantiate_set_formula(v_set);
        if (NIL == formula) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject v_term = cyc_instantiate_formula(formula, mt, prefix);
        if (NIL == v_term) {
            relation_evaluation.throw_unevaluatable();
        }
        return v_term;
    }/**
     * #$evaluationDefn for #$InstantiateFn
     */


    /**
     * #$evaluationDefn for #$FindOrInstantiateFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$FindOrInstantiateFn")
    public static final SubLObject cyc_find_or_instantiate_alt(SubLObject prefix, SubLObject mt, SubLObject v_set) {
        if (!(prefix.isString() && (NIL != hlmt.hlmt_p(mt)))) {
            relation_evaluation.throw_unevaluatable();
        }
        {
            SubLObject formula = com.cyc.cycjava.cycl.evaluation_defns.cyc_instantiate_set_formula(v_set);
            if (NIL == formula) {
                relation_evaluation.throw_unevaluatable();
            }
            {
                SubLObject existing = ask_utilities.inference_recursive_query_unique_bindings(formula, mt, $list_alt142);
                if (NIL != existing) {
                    {
                        SubLObject v_term = bindings.variable_binding_value(existing.first().first());
                        return v_term;
                    }
                } else {
                    {
                        SubLObject v_term = com.cyc.cycjava.cycl.evaluation_defns.cyc_instantiate_formula(formula, mt, prefix);
                        if (NIL == v_term) {
                            relation_evaluation.throw_unevaluatable();
                        }
                        return v_term;
                    }
                }
            }
        }
    }

    /**
     * #$evaluationDefn for #$FindOrInstantiateFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$FindOrInstantiateFn")
    public static SubLObject cyc_find_or_instantiate(final SubLObject prefix, final SubLObject mt, final SubLObject v_set) {
        if ((!prefix.isString()) || (NIL == hlmt.hlmt_p(mt))) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject formula = cyc_instantiate_set_formula(v_set);
        if (NIL == formula) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject existing = ask_utilities.inference_recursive_query_unique_bindings(formula, mt, $list177);
        if (NIL != existing) {
            final SubLObject v_term = bindings.variable_binding_value(existing.first().first());
            return v_term;
        }
        final SubLObject v_term = cyc_instantiate_formula(formula, mt, prefix);
        if (NIL == v_term) {
            relation_evaluation.throw_unevaluatable();
        }
        return v_term;
    }/**
     * #$evaluationDefn for #$FindOrInstantiateFn
     */


    public static final SubLObject cyc_instantiate_set_formula_alt(SubLObject v_set) {
        {
            SubLObject formula = NIL;
            if (NIL != forts.fort_p(v_set)) {
                formula = list($$isa, $sym145$_OBJ, v_set);
            } else {
                if (v_set.isCons() && ($$TheSetOf == cycl_utilities.nat_functor(v_set))) {
                    formula = cycl_utilities.nat_arg2(v_set, UNPROVIDED);
                }
            }
            return formula;
        }
    }

    public static SubLObject cyc_instantiate_set_formula(final SubLObject v_set) {
        SubLObject formula = NIL;
        if (NIL != forts.fort_p(v_set)) {
            formula = list($$isa, $sym180$_OBJ, v_set);
        } else
            if (v_set.isCons() && $$TheSetOf.eql(cycl_utilities.nat_functor(v_set))) {
                formula = cycl_utilities.nat_arg2(v_set, UNPROVIDED);
            }

        return formula;
    }

    public static final SubLObject cyc_instantiate_formula_alt(SubLObject formula, SubLObject mt, SubLObject prefix) {
        {
            SubLObject v_bindings = prove.fi_hypothesize_int(formula, mt, prefix, UNPROVIDED);
            if (NIL != v_bindings) {
                {
                    SubLObject v_term = bindings.variable_binding_value(v_bindings.first());
                    SubLObject unique_name = constant_completion_high.uniquify_constant_name(prefix);
                    fi.fi_rename_int(v_term, unique_name);
                    fi.fi_assert_int(list($$definingMt, v_term, mt), mt_vars.$defining_mt_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
                    return v_term;
                }
            }
        }
        return NIL;
    }

    public static SubLObject cyc_instantiate_formula(final SubLObject formula, final SubLObject mt, final SubLObject prefix) {
        final SubLObject v_bindings = prove.fi_hypothesize_int(formula, mt, prefix, UNPROVIDED);
        if (NIL != v_bindings) {
            final SubLObject v_term = bindings.variable_binding_value(v_bindings.first());
            final SubLObject unique_name = constant_completion_high.uniquify_constant_name(prefix, UNPROVIDED);
            fi.fi_rename_int(v_term, unique_name);
            fi.fi_assert_int(list($$definingMt, v_term, mt), mt_vars.$defining_mt_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
            return v_term;
        }
        return NIL;
    }

    public static SubLObject cyc_find_via_pred_value_or_create_via_template(final SubLObject template, final SubLObject pred, final SubLObject value) {
        SubLObject v_term = cached_find_via_pred_value_wrt_template(template, pred, value, UNPROVIDED);
        if (NIL == v_term) {
            v_term = create_and_assert_via_value_wrt_template(template, value, UNPROVIDED);
            if (NIL == v_term) {
                relation_evaluation.throw_unevaluatable();
            }
            remove_cached_find_via_pred_value_wrt_template(template, pred, value, UNPROVIDED);
        }
        return v_term;
    }

    public static SubLObject clear_cached_find_via_pred_value_wrt_template() {
        final SubLObject cs = $cached_find_via_pred_value_wrt_template_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_cached_find_via_pred_value_wrt_template(final SubLObject template, final SubLObject pred, final SubLObject value, SubLObject meta_mt) {
        if (meta_mt == UNPROVIDED) {
            meta_mt = NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args($cached_find_via_pred_value_wrt_template_caching_state$.getGlobalValue(), list(template, pred, value, meta_mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cached_find_via_pred_value_wrt_template_internal(final SubLObject template, final SubLObject pred, final SubLObject value, final SubLObject meta_mt) {
        return find_via_pred_value_wrt_template(template, pred, value, meta_mt);
    }

    public static SubLObject cached_find_via_pred_value_wrt_template(final SubLObject template, final SubLObject pred, final SubLObject value, SubLObject meta_mt) {
        if (meta_mt == UNPROVIDED) {
            meta_mt = NIL;
        }
        SubLObject caching_state = $cached_find_via_pred_value_wrt_template_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CACHED_FIND_VIA_PRED_VALUE_WRT_TEMPLATE, $cached_find_via_pred_value_wrt_template_caching_state$, $int$1000, EQUAL, FOUR_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(template, pred, value, meta_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (template.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pred.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (value.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && meta_mt.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(cached_find_via_pred_value_wrt_template_internal(template, pred, value, meta_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(template, pred, value, meta_mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject find_via_pred_value_wrt_template(final SubLObject template, final SubLObject pred, final SubLObject value, SubLObject meta_mt) {
        if (meta_mt == UNPROVIDED) {
            meta_mt = NIL;
        }
        final SubLObject mt = kb_mapping_utilities.fpred_value_in_relevant_mts(template, $$creationTemplateMt, meta_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject variable = variables.get_variable(ZERO_INTEGER);
        final SubLObject query = make_binary_formula(pred, variable, value);
        final SubLObject candidates = backward.removal_ask_variable(variable, query, mt, UNPROVIDED, UNPROVIDED);
        final SubLObject by_preference = (NIL != list_utilities.singletonP(candidates)) ? candidates : list_utilities.sort_via_test(candidates, symbol_function(CONSTANT_P), UNPROVIDED);
        final SubLObject v_term = by_preference.first();
        return v_term;
    }

    public static SubLObject create_and_assert_via_value_wrt_template(final SubLObject template, final SubLObject value, SubLObject meta_mt) {
        if (meta_mt == UNPROVIDED) {
            meta_mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_constant = create_constant_from_value_wrt_template(template, value, meta_mt);
        thread.resetMultipleValues();
        final SubLObject sentence = compute_constant_assert_sentence_wrt_template(template, new_constant, value, meta_mt);
        final SubLObject assert_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        ke.ke_assert_now(sentence, assert_mt, UNPROVIDED, UNPROVIDED);
        return new_constant;
    }

    public static SubLObject create_constant_from_value_wrt_template(final SubLObject template, final SubLObject value, SubLObject meta_mt) {
        if (meta_mt == UNPROVIDED) {
            meta_mt = NIL;
        }
        final SubLObject format_string = kb_mapping_utilities.fpred_value_in_relevant_mts(template, $const188$creationTemplateConstantNameForma, meta_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject name_basis = format(NIL, format_string, value);
        final SubLObject new_name = string_utilities.make_valid_constant_name(name_basis, UNPROVIDED);
        final SubLObject new_constant = cyc_kernel.cyc_create_new_permanent(new_name);
        return new_constant;
    }

    public static SubLObject compute_constant_assert_sentence_wrt_template(final SubLObject template, final SubLObject new_constant, final SubLObject value, SubLObject meta_mt) {
        if (meta_mt == UNPROVIDED) {
            meta_mt = NIL;
        }
        final SubLObject mt = kb_mapping_utilities.fpred_value_in_relevant_mts(template, $$creationTemplateMt, meta_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject raw = kb_mapping_utilities.fpred_value_in_relevant_mts(template, $$creationTemplateSentenceTemplate, meta_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject v_bindings = list(bq_cons($TERM, new_constant), bq_cons($VALUE, value));
        final SubLObject sentence = bindings.apply_bindings(v_bindings, raw);
        return values(sentence, mt);
    }

    /**
     * Returns a unique CycL collection which is the intersection of
     * collections <collection> such that (#$isa :ACTION <collection>)
     * appears as a first order assertion in NLTE, NIL if there aren't
     * any.
     */
    @LispMethod(comment = "Returns a unique CycL collection which is the intersection of\r\ncollections <collection> such that (#$isa :ACTION <collection>)\r\nappears as a first order assertion in NLTE, NIL if there aren\'t\r\nany.\nReturns a unique CycL collection which is the intersection of\ncollections <collection> such that (#$isa :ACTION <collection>)\nappears as a first order assertion in NLTE, NIL if there aren\'t\nany.")
    public static final SubLObject cyc_action_type_nlte_alt(SubLObject nlte) {
        if (NIL != wff.kwt_wffP(nlte, UNPROVIDED)) {
            return cycl_utilities.collection_intersection(com.cyc.cycjava.cycl.evaluation_defns.action_type_nlte(nlte));
        } else {
            relation_evaluation.throw_unevaluatable();
        }
        return NIL;
    }

    /**
     * Returns a unique CycL collection which is the intersection of
     * collections <collection> such that (#$isa :ACTION <collection>)
     * appears as a first order assertion in NLTE, NIL if there aren't
     * any.
     */
    @LispMethod(comment = "Returns a unique CycL collection which is the intersection of\r\ncollections <collection> such that (#$isa :ACTION <collection>)\r\nappears as a first order assertion in NLTE, NIL if there aren\'t\r\nany.\nReturns a unique CycL collection which is the intersection of\ncollections <collection> such that (#$isa :ACTION <collection>)\nappears as a first order assertion in NLTE, NIL if there aren\'t\nany.")
    public static SubLObject cyc_action_type_nlte(final SubLObject nlte) {
        if (NIL != wff.kwt_wffP(nlte, UNPROVIDED)) {
            return cycl_utilities.collection_intersection(action_type_nlte(nlte));
        }
        relation_evaluation.throw_unevaluatable();
        return NIL;
    }

    /**
     * Returns a list of all collections <collection> such that
     * (isa :ACTION <collection>) occurs in NLTE as a first order
     * assertion and NIL otherwise.
     */
    @LispMethod(comment = "Returns a list of all collections <collection> such that\r\n(isa :ACTION <collection>) occurs in NLTE as a first order\r\nassertion and NIL otherwise.\nReturns a list of all collections <collection> such that\n(isa :ACTION <collection>) occurs in NLTE as a first order\nassertion and NIL otherwise.")
    public static final SubLObject action_type_nlte_alt(SubLObject nlte) {
        {
            SubLObject head = nlte.first();
            if ((head == $$isa) && (second(nlte) == $ACTION)) {
                return list(third(nlte));
            } else {
                if (NIL != fort_types_interface.predicateP(head)) {
                    return NIL;
                } else {
                    if (NIL != fort_types_interface.logical_connective_p(head)) {
                        return com.cyc.cycjava.cycl.evaluation_defns.action_type_nltes(nlte.rest());
                    } else {
                        if (NIL != fort_types_interface.quantifier_p(head)) {
                            return com.cyc.cycjava.cycl.evaluation_defns.action_type_nlte(third(nlte));
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Returns a list of all collections <collection> such that
     * (isa :ACTION <collection>) occurs in NLTE as a first order
     * assertion and NIL otherwise.
     */
    @LispMethod(comment = "Returns a list of all collections <collection> such that\r\n(isa :ACTION <collection>) occurs in NLTE as a first order\r\nassertion and NIL otherwise.\nReturns a list of all collections <collection> such that\n(isa :ACTION <collection>) occurs in NLTE as a first order\nassertion and NIL otherwise.")
    public static SubLObject action_type_nlte(final SubLObject nlte) {
        final SubLObject head = nlte.first();
        if (head.eql($$isa) && (second(nlte) == $ACTION)) {
            return list(third(nlte));
        }
        if (NIL != fort_types_interface.predicateP(head)) {
            return NIL;
        }
        if (NIL != fort_types_interface.logical_connective_p(head)) {
            return action_type_nltes(nlte.rest());
        }
        if (NIL != fort_types_interface.quantifier_p(head)) {
            return action_type_nlte(third(nlte));
        }
        return NIL;
    }

    /**
     * Returns a list of all collections <collection> such that
     * (isa :ACTION <collection>) occurs in one of the members of NLTEs
     * as a first order assertion.
     */
    @LispMethod(comment = "Returns a list of all collections <collection> such that\r\n(isa :ACTION <collection>) occurs in one of the members of NLTEs\r\nas a first order assertion.\nReturns a list of all collections <collection> such that\n(isa :ACTION <collection>) occurs in one of the members of NLTEs\nas a first order assertion.")
    public static final SubLObject action_type_nltes_alt(SubLObject nltes) {
        if (NIL != endp(nltes)) {
            return NIL;
        } else {
            return append(com.cyc.cycjava.cycl.evaluation_defns.action_type_nlte(nltes.first()), com.cyc.cycjava.cycl.evaluation_defns.action_type_nltes(nltes.rest()));
        }
    }

    /**
     * Returns a list of all collections <collection> such that
     * (isa :ACTION <collection>) occurs in one of the members of NLTEs
     * as a first order assertion.
     */
    @LispMethod(comment = "Returns a list of all collections <collection> such that\r\n(isa :ACTION <collection>) occurs in one of the members of NLTEs\r\nas a first order assertion.\nReturns a list of all collections <collection> such that\n(isa :ACTION <collection>) occurs in one of the members of NLTEs\nas a first order assertion.")
    public static SubLObject action_type_nltes(final SubLObject nltes) {
        if (NIL != endp(nltes)) {
            return NIL;
        }
        return append(action_type_nlte(nltes.first()), action_type_nltes(nltes.rest()));
    }

    /**
     * #$evaluationDefn for #$UnaryIndividualDenotingFunctionForFn.
     *
     * @return The unique non-skolem individual-denoting function FN s.t. (#$resultIsa FN COL). Throws non-evaluatable if there is not a unique such function.
     */
    @LispMethod(comment = "#$evaluationDefn for #$UnaryIndividualDenotingFunctionForFn.\r\n\r\n@return The unique non-skolem individual-denoting function FN s.t. (#$resultIsa FN COL). Throws non-evaluatable if there is not a unique such function.")
    public static final SubLObject cyc_individual_denoting_unary_function_for_alt(SubLObject col) {
        {
            SubLObject functions = com.cyc.cycjava.cycl.evaluation_defns.unary_functions_for(col, $$resultIsa);
            SubLObject individual_denoters = list_utilities.remove_if_not($sym150$INDIVIDUAL_DENOTING_FN_, functions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != list_utilities.singletonP(individual_denoters)) {
                return individual_denoters.first();
            } else {
                relation_evaluation.throw_unevaluatable();
            }
        }
        return NIL;
    }

    /**
     * #$evaluationDefn for #$UnaryIndividualDenotingFunctionForFn.
     *
     * @return The unique non-skolem individual-denoting function FN s.t. (#$resultIsa FN COL). Throws non-evaluatable if there is not a unique such function.
     */
    @LispMethod(comment = "#$evaluationDefn for #$UnaryIndividualDenotingFunctionForFn.\r\n\r\n@return The unique non-skolem individual-denoting function FN s.t. (#$resultIsa FN COL). Throws non-evaluatable if there is not a unique such function.")
    public static SubLObject cyc_individual_denoting_unary_function_for(final SubLObject col) {
        final SubLObject functions = unary_functions_for(col, $$resultIsa);
        final SubLObject individual_denoters = list_utilities.remove_if_not($sym194$INDIVIDUAL_DENOTING_FN_, functions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != list_utilities.singletonP(individual_denoters)) {
            return individual_denoters.first();
        }
        relation_evaluation.throw_unevaluatable();
        return NIL;
    }

    /**
     * #$evaluationDefn for #$UnaryCollectionDenotingFunctionForFn.
     *
     * @return The unique non-skolem collection-denoting function FN s.t. (#$resultIsa FN COL). Throws non-evaluatable if there is not a unique such function.
     */
    @LispMethod(comment = "#$evaluationDefn for #$UnaryCollectionDenotingFunctionForFn.\r\n\r\n@return The unique non-skolem collection-denoting function FN s.t. (#$resultIsa FN COL). Throws non-evaluatable if there is not a unique such function.")
    public static final SubLObject cyc_collection_denoting_unary_function_for_alt(SubLObject col) {
        {
            SubLObject functions = com.cyc.cycjava.cycl.evaluation_defns.unary_functions_for(col, $$resultGenl);
            if (NIL != list_utilities.singletonP(functions)) {
                return functions.first();
            } else {
                relation_evaluation.throw_unevaluatable();
            }
        }
        return NIL;
    }

    /**
     * #$evaluationDefn for #$UnaryCollectionDenotingFunctionForFn.
     *
     * @return The unique non-skolem collection-denoting function FN s.t. (#$resultIsa FN COL). Throws non-evaluatable if there is not a unique such function.
     */
    @LispMethod(comment = "#$evaluationDefn for #$UnaryCollectionDenotingFunctionForFn.\r\n\r\n@return The unique non-skolem collection-denoting function FN s.t. (#$resultIsa FN COL). Throws non-evaluatable if there is not a unique such function.")
    public static SubLObject cyc_collection_denoting_unary_function_for(final SubLObject col) {
        final SubLObject functions = unary_functions_for(col, $$resultGenl);
        if (NIL != list_utilities.singletonP(functions)) {
            return functions.first();
        }
        relation_evaluation.throw_unevaluatable();
        return NIL;
    }

    /**
     *
     *
     * @param SLOT;
     * 		#$resultIsa or #$resultGenl.
     * @return LISTP of non-skolem unary functions denoting instances or specs - depending
    on value of SLOT - of COL.
     */
    @LispMethod(comment = "@param SLOT;\r\n\t\t#$resultIsa or #$resultGenl.\r\n@return LISTP of non-skolem unary functions denoting instances or specs - depending\r\non value of SLOT - of COL.")
    public static final SubLObject unary_functions_for_alt(SubLObject col, SubLObject slot) {
        if (NIL == indexed_term_p(col)) {
            relation_evaluation.throw_unevaluatable();
        }
        {
            SubLObject functions = kb_mapping_utilities.pred_values(col, slot, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
            SubLObject unary_functions = list_utilities.remove_if_not(UNARY_FUNCTION_, functions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject non_skolems = remove_if(SKOLEM_FUNCTION_, unary_functions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject ans = NIL;
            SubLObject cdolist_list_var = non_skolems;
            SubLObject fn = NIL;
            for (fn = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , fn = cdolist_list_var.first()) {
                if (kb_indexing.num_gaf_arg_index(fn, ONE_INTEGER, slot, UNPROVIDED).eql(ONE_INTEGER)) {
                    ans = cons(fn, ans);
                }
            }
            return ans;
        }
    }

    /**
     *
     *
     * @param SLOT;
     * 		#$resultIsa or #$resultGenl.
     * @return LISTP of non-skolem unary functions denoting instances or specs - depending
    on value of SLOT - of COL.
     */
    @LispMethod(comment = "@param SLOT;\r\n\t\t#$resultIsa or #$resultGenl.\r\n@return LISTP of non-skolem unary functions denoting instances or specs - depending\r\non value of SLOT - of COL.")
    public static SubLObject unary_functions_for(final SubLObject col, final SubLObject slot) {
        if (NIL == indexed_term_p(col)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject functions = kb_mapping_utilities.pred_values(col, slot, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
        final SubLObject unary_functions = list_utilities.remove_if_not($sym198$UNARY_FUNCTION_, functions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject non_skolems = remove_if($sym199$SKOLEM_FUNCTION_, unary_functions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = non_skolems;
        SubLObject fn = NIL;
        fn = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (kb_indexing.num_gaf_arg_index(fn, ONE_INTEGER, slot, UNPROVIDED).eql(ONE_INTEGER)) {
                ans = cons(fn, ans);
            }
            cdolist_list_var = cdolist_list_var.rest();
            fn = cdolist_list_var.first();
        } 
        return ans;
    }

    public static final SubLObject unary_functionP_alt(SubLObject obj) {
        return at_defns.quiet_has_typeP(obj, $$UnaryFunction, UNPROVIDED);
    }

    public static SubLObject unary_functionP(final SubLObject obj) {
        return at_defns.quiet_has_typeP(obj, $$UnaryFunction, UNPROVIDED);
    }

    public static final SubLObject individual_denoting_fnP_alt(SubLObject obj) {
        return at_defns.quiet_has_typeP(obj, $$IndividualDenotingFunction, UNPROVIDED);
    }

    public static SubLObject individual_denoting_fnP(final SubLObject obj) {
        return at_defns.quiet_has_typeP(obj, $$IndividualDenotingFunction, UNPROVIDED);
    }

    public static final SubLObject cyc_el_variable_fn_alt(SubLObject args) {
        return cycl_variables.make_el_var(constants_high.constant_name(args));
    }

    public static SubLObject cyc_el_variable_fn(final SubLObject args) {
        return cycl_variables.make_el_var(constants_high.constant_name(args));
    }

    /**
     * #$evaluationDefn for EnglishSuffixationFn (provisional name).
     *
     * @unknown baxter
     */
    @LispMethod(comment = "#$evaluationDefn for EnglishSuffixationFn (provisional name).\r\n\r\n@unknown baxter")
    public static final SubLObject cyc_add_english_suffix_alt(SubLObject base, SubLObject suffix) {
        if (!(base.isString() && suffix.isString())) {
            relation_evaluation.throw_unevaluatable();
        }
        return morphology.add_english_suffix(base, suffix);
    }

    /**
     * #$evaluationDefn for EnglishSuffixationFn (provisional name).
     *
     * @unknown baxter
     */
    @LispMethod(comment = "#$evaluationDefn for EnglishSuffixationFn (provisional name).\r\n\r\n@unknown baxter")
    public static SubLObject cyc_add_english_suffix(final SubLObject base, final SubLObject suffix) {
        if ((!base.isString()) || (!suffix.isString())) {
            relation_evaluation.throw_unevaluatable();
        }
        return morphology.add_english_suffix(base, suffix);
    }

    /**
     * #$evaluationDefn for #$GeneratePhraseFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$GeneratePhraseFn")
    public static final SubLObject generate_phrase_defn_alt(SubLObject v_term) {
        return com.cyc.cycjava.cycl.evaluation_defns.generate_phrase_memoized(v_term, $use_new_nl_generation_api_for_generate_phrase_fnP$.getGlobalValue());
    }

    /**
     * #$evaluationDefn for #$GeneratePhraseFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$GeneratePhraseFn")
    public static SubLObject generate_phrase_defn(final SubLObject v_term) {
        return generate_phrase_memoized(v_term, $use_new_nl_generation_api_for_generate_phrase_fnP$.getGlobalValue());
    }

    public static final SubLObject generate_phrase_memoized_internal_alt(SubLObject v_term, SubLObject use_new_apiP) {
        if (NIL != use_new_apiP) {
            {
                SubLObject maps = nl_generation_api.cycl_term_to_nl_internal(v_term, $DEFAULT);
                return NIL != maps ? ((SubLObject) (nl_generation_api.pph_output_map_to_text_internal(maps.first(), NIL, ZERO_INTEGER, NIL, NIL))) : NIL;
            }
        } else {
            return pph_main.generate_phrase(v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject generate_phrase_memoized_internal(final SubLObject v_term, final SubLObject use_new_apiP) {
        if (NIL != use_new_apiP) {
            final SubLObject maps = nl_generation_api.cycl_term_to_nl_internal(v_term, $DEFAULT);
            return NIL != maps ? nl_generation_api.pph_output_map_to_text_internal(maps.first(), NIL, ZERO_INTEGER, NIL, NIL) : NIL;
        }
        return pph_main.generate_phrase(v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject generate_phrase_memoized_alt(SubLObject v_term, SubLObject use_new_apiP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = $memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.evaluation_defns.generate_phrase_memoized_internal(v_term, use_new_apiP);
                }
                caching_state = memoization_state_lookup(v_memoization_state, GENERATE_PHRASE_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = create_caching_state(memoization_state_lock(v_memoization_state), GENERATE_PHRASE_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state_put(v_memoization_state, GENERATE_PHRASE_MEMOIZED, caching_state);
                }
                {
                    SubLObject sxhash = sxhash_calc_2(v_term, use_new_apiP);
                    SubLObject collisions = caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw164$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (v_term.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && use_new_apiP.equal(cached_args.first())) {
                                            return caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.evaluation_defns.generate_phrase_memoized_internal(v_term, use_new_apiP)));
                        caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(v_term, use_new_apiP));
                        return caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject generate_phrase_memoized(final SubLObject v_term, final SubLObject use_new_apiP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return generate_phrase_memoized_internal(v_term, use_new_apiP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, GENERATE_PHRASE_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), GENERATE_PHRASE_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, GENERATE_PHRASE_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, use_new_apiP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && use_new_apiP.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(generate_phrase_memoized_internal(v_term, use_new_apiP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, use_new_apiP));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject assertions_relevant_to_string_defn(final SubLObject prompt_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == string_utilities.non_empty_string_p(prompt_string)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject scored_assertions = assertions_for_prompt_string_memoized(prompt_string, mt_relevance_macros.$mt$.getDynamicValue(thread), $assertions_relevant_to_string_defn_max_to_check$.getGlobalValue());
        SubLObject assertions = NIL;
        format_nil.force_format(T, $str209$__Got__D_scored_assertions___, dictionary.dictionary_length(scored_assertions), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = dictionary_utilities.sort_dictionary_by_values(scored_assertions, symbol_function($sym211$_));
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject assertionXnl = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list210);
            assertionXnl = current.first();
            current = value = current.rest();
            assertions = cons(assertionXnl.first(), assertions);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        format_nil.force_format(T, $str212$__Returning__D_assertions___, length(assertions), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return make_el_list(assertions, UNPROVIDED);
    }

    public static SubLObject assertions_for_prompt_string_memoized_internal(final SubLObject prompt_string, final SubLObject mt, final SubLObject max_to_check) {
        return string_relevant_assertions.assertions_for_prompt_string(prompt_string, mt, max_to_check);
    }

    public static SubLObject assertions_for_prompt_string_memoized(final SubLObject prompt_string, final SubLObject mt, final SubLObject max_to_check) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return assertions_for_prompt_string_memoized_internal(prompt_string, mt, max_to_check);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, ASSERTIONS_FOR_PROMPT_STRING_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), ASSERTIONS_FOR_PROMPT_STRING_MEMOIZED, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, ASSERTIONS_FOR_PROMPT_STRING_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(prompt_string, mt, max_to_check);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (prompt_string.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && max_to_check.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(assertions_for_prompt_string_memoized_internal(prompt_string, mt, max_to_check)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(prompt_string, mt, max_to_check));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject best_string_of_nl_phrase_defn_alt(SubLObject phrase_naut) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == pph_types.pph_phrase_nautP(phrase_naut)) {
                relation_evaluation.throw_unevaluatable();
            }
            {
                SubLObject string = NIL;
                SubLObject error_message = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject string_52 = pph_main.generate_good_string_from_phrase_naut(phrase_naut, pph_vars.$pph_language_mt$.getDynamicValue(thread), mt_relevance_macros.$mt$.getDynamicValue(thread));
                    SubLObject error_message_53 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    string = string_52;
                    error_message = error_message_53;
                }
                if ((NIL != error_message) || (!string.isString())) {
                    relation_evaluation.throw_unevaluatable();
                }
                return string;
            }
        }
    }

    public static SubLObject best_string_of_nl_phrase_defn(final SubLObject phrase_naut) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == pph_types.pph_phrase_nautP(phrase_naut)) {
            relation_evaluation.throw_unevaluatable();
        }
        SubLObject string = NIL;
        SubLObject error_message = NIL;
        thread.resetMultipleValues();
        final SubLObject string_$53 = pph_main.generate_good_string_from_phrase_naut(phrase_naut, mt_relevance_macros.$mt$.getDynamicValue(thread), mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED);
        final SubLObject error_message_$54 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        string = string_$53;
        error_message = error_message_$54;
        if ((NIL != error_message) || (NIL == cycl_string.cycl_string_p(string))) {
            relation_evaluation.throw_unevaluatable();
        }
        return string;
    }

    public static SubLObject best_string_of_nl_phrase_addressing_defn(final SubLObject phrase_naut, final SubLObject user) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = pph_vars.$pph_addressee$.currentBinding(thread);
        try {
            pph_vars.$pph_addressee$.bind(user, thread);
            return best_string_of_nl_phrase_defn(phrase_naut);
        } finally {
            pph_vars.$pph_addressee$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject best_string_of_nl_phrase_with_force_defn(final SubLObject phrase_naut, final SubLObject cycl_force) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == pph_types.pph_phrase_nautP(phrase_naut)) {
            relation_evaluation.throw_unevaluatable();
        }
        SubLObject string = NIL;
        SubLObject error_message = NIL;
        thread.resetMultipleValues();
        final SubLObject string_$55 = pph_main.generate_good_string_from_phrase_naut(phrase_naut, mt_relevance_macros.$mt$.getDynamicValue(thread), mt_relevance_macros.$mt$.getDynamicValue(thread), pph_utilities.pph_force_from_cycl_force(cycl_force));
        final SubLObject error_message_$56 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        string = string_$55;
        error_message = error_message_$56;
        if ((NIL != error_message) || (NIL == cycl_string.cycl_string_p(string))) {
            relation_evaluation.throw_unevaluatable();
        }
        return string;
    }

    public static SubLObject generate_gke_gloss_wrt_mt(final SubLObject quoted_literal, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return pph_utilities.pph_javalist_to_cycl_structured_paraphrase(gke_main.generate_gke_gloss_wrt_mt_cached(cycl_utilities.formula_arg1(quoted_literal, UNPROVIDED), domain_mt, mt_relevance_macros.$mt$.getDynamicValue(thread)));
    }

    public static final SubLObject basic_datum_paraphrase_defn_alt(SubLObject el_set, SubLObject language_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != el_set_p(el_set)) && (NIL != hlmt.possibly_hlmt_p(language_mt)))) {
                relation_evaluation.throw_unevaluatable();
            } else {
                if (NIL != el_empty_set_p(el_set)) {
                    return string_utilities.$empty_string$.getGlobalValue();
                } else {
                    if (NIL != el_formula_p(el_set)) {
                        {
                            SubLObject phrase_naut = com.cyc.cycjava.cycl.evaluation_defns.basic_datum_phrase_naut(el_set);
                            thread.resetMultipleValues();
                            {
                                SubLObject string = pph_main.generate_good_string_from_phrase_naut(phrase_naut, language_mt, mt_relevance_macros.$mt$.getDynamicValue(thread));
                                SubLObject error_message = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if ((NIL != error_message) || (!string.isString())) {
                                    relation_evaluation.throw_unevaluatable();
                                }
                                return string;
                            }
                        }
                    } else {
                        relation_evaluation.throw_unevaluatable();
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject basic_datum_paraphrase_defn(final SubLObject el_set, final SubLObject language_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == el_set_p(el_set)) || (NIL == hlmt.possibly_hlmt_p(language_mt))) {
            relation_evaluation.throw_unevaluatable();
        } else {
            if (NIL != el_empty_set_p(el_set)) {
                return string_utilities.$empty_string$.getGlobalValue();
            }
            if (NIL != el_formula_p(el_set)) {
                final SubLObject phrase_naut = basic_datum_phrase_naut(el_set);
                thread.resetMultipleValues();
                final SubLObject string = pph_main.generate_good_string_from_phrase_naut(phrase_naut, language_mt, mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED);
                final SubLObject error_message = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if ((NIL != error_message) || (!string.isString())) {
                    relation_evaluation.throw_unevaluatable();
                }
                return string;
            }
            relation_evaluation.throw_unevaluatable();
        }
        return NIL;
    }

    public static final SubLObject basic_datum_phrase_naut_alt(SubLObject el_set) {
        {
            SubLObject phrase_nauts = NIL;
            SubLObject i = ZERO_INTEGER;
            SubLObject args = cycl_utilities.formula_args(el_set, $IGNORE);
            SubLObject cdolist_list_var = args;
            SubLObject item = NIL;
            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                i = add(i, ONE_INTEGER);
                if (i.numG(ONE_INTEGER)) {
                    phrase_nauts = cons($list_alt168, phrase_nauts);
                }
                phrase_nauts = cons(make_binary_formula($$TermParaphraseFn_Constrained, $$nonPlural_Generic, item), phrase_nauts);
            }
            if (NIL == phrase_nauts) {
                relation_evaluation.throw_unevaluatable();
            }
            return NIL != list_utilities.singletonP(phrase_nauts) ? ((SubLObject) (phrase_nauts.first())) : make_el_formula($$ConcatenatePhrasesFn, nreverse(phrase_nauts), UNPROVIDED);
        }
    }

    public static SubLObject basic_datum_phrase_naut(final SubLObject el_set) {
        SubLObject phrase_nauts = NIL;
        SubLObject i = ZERO_INTEGER;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(el_set, $IGNORE);
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            i = add(i, ONE_INTEGER);
            if (i.numG(ONE_INTEGER)) {
                phrase_nauts = cons(make_unary_formula(pph_functions.bestnlphraseofstringfn(), $str45$_), phrase_nauts);
            }
            phrase_nauts = cons(make_binary_formula(pph_functions.termparaphrasefn_constrained(), $$nonPlural_Generic, item), phrase_nauts);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        if (NIL == phrase_nauts) {
            relation_evaluation.throw_unevaluatable();
        }
        return NIL != list_utilities.singletonP(phrase_nauts) ? phrase_nauts.first() : make_el_formula(pph_functions.concatenatephrasesfn(), nreverse(phrase_nauts), UNPROVIDED);
    }

    public static SubLObject paraphrase_of_formula_from_template_defn(final SubLObject formula, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject err_msg = NIL;
        SubLObject paraphrase = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject was_appendingP = eval($append_stack_traces_to_error_messagesP$);
                    eval($list223);
                    try {
                        final SubLObject _prev_bind_0_$57 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = pph_macros.$new_pph_phrases$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = pph_macros.$new_pph_phrase_count$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding(thread);
                        try {
                            pph_vars.$pph_demerit_cutoff$.bind(number_utilities.positive_infinity(), thread);
                            pph_macros.$new_pph_phrases$.bind(stacks.create_stack(), thread);
                            pph_macros.$new_pph_phrase_count$.bind(pph_macros.get_new_pph_phrase_count(), thread);
                            pph_macros.$destroy_new_pph_phrasesP$.bind(T, thread);
                            try {
                                final SubLObject force = (NIL != cycl_grammar.cycl_sentence_p(formula)) ? $$genTemplate_QuerySentence.eql(assertions_high.gaf_arg0(assertion)) ? $INTERROGATIVE : $DECLARATIVE : $NONE;
                                final SubLObject _prev_bind_0_$58 = pph_vars.$pph_problem_reporting_mode$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$59 = pph_vars.$pph_language_mt$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$60 = pph_vars.$pph_domain_mt$.currentBinding(thread);
                                try {
                                    pph_vars.$pph_problem_reporting_mode$.bind(NIL != pph_vars.pph_problem_reporting_on_p() ? pph_vars.$pph_problem_reporting_mode$.getDynamicValue(thread) : $QUIET, thread);
                                    pph_vars.$pph_language_mt$.bind(mt_relevance_macros.$mt$.getDynamicValue(thread), thread);
                                    pph_vars.$pph_domain_mt$.bind(mt_relevance_macros.$mt$.getDynamicValue(thread), thread);
                                    SubLObject v_pph_phrase = NIL;
                                    if ($$genTemplate_Constrained.eql(assertions_high.gaf_arg0(assertion))) {
                                        if (NIL != pph_templates.gen_template_constraint_passesP_internal(assertions_high.gaf_arg2(assertion), formula, NIL)) {
                                            v_pph_phrase = pph_methods_formulas.new_pph_phrase_for_formula_and_gen_template_assertion(formula, assertion, force);
                                        } else {
                                            Errors.error($str230$Formula_does_not_meet_this_assert);
                                        }
                                    } else {
                                        v_pph_phrase = pph_methods_formulas.new_pph_phrase_for_formula_and_gen_template_assertion(formula, assertion, force);
                                    }
                                    if (NIL != v_pph_phrase) {
                                        paraphrase = pph_string.pph_string_to_cycl(pph_phrase.pph_phrase_string(v_pph_phrase, NIL));
                                    }
                                } finally {
                                    pph_vars.$pph_domain_mt$.rebind(_prev_bind_2_$60, thread);
                                    pph_vars.$pph_language_mt$.rebind(_prev_bind_1_$59, thread);
                                    pph_vars.$pph_problem_reporting_mode$.rebind(_prev_bind_0_$58, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$59 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    pph_macros.destroy_new_pph_phrases();
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$59, thread);
                                }
                            }
                        } finally {
                            pph_macros.$destroy_new_pph_phrasesP$.rebind(_prev_bind_4, thread);
                            pph_macros.$new_pph_phrase_count$.rebind(_prev_bind_3, thread);
                            pph_macros.$new_pph_phrases$.rebind(_prev_bind_2, thread);
                            pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_0_$57, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$60 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            eval(list(CSETQ, $append_stack_traces_to_error_messagesP$, was_appendingP));
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$60, thread);
                        }
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            err_msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if ((NIL != err_msg) || (NIL == paraphrase)) {
            relation_evaluation.throw_unevaluatable();
            return NIL;
        }
        return paraphrase;
    }

    /**
     * #$evaluationDefn for StateForCityFn and for ProvinceForCityFn.
     *
     * @unknown nancy
     */
    @LispMethod(comment = "#$evaluationDefn for StateForCityFn and for ProvinceForCityFn.\r\n\r\n@unknown nancy")
    public static final SubLObject state_or_province_for_city_defn_alt(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject state_list = kb_mapping_utilities.pred_values_in_any_mt(fort, $$geopoliticalSubdivision, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject cdolist_list_var = state_list;
                            SubLObject item = NIL;
                            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                                if ((NIL != isa.isaP(item, $$State_UnitedStates, UNPROVIDED, UNPROVIDED)) || (NIL != isa.isaP(item, $$CanadianProvince, UNPROVIDED, UNPROVIDED))) {
                                    ans = cons(item, ans);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                if (!length(ans).eql(ONE_INTEGER)) {
                    relation_evaluation.throw_unevaluatable();
                }
                return ans.first();
            }
        }
    }

    /**
     * #$evaluationDefn for StateForCityFn and for ProvinceForCityFn.
     *
     * @unknown nancy
     */
    @LispMethod(comment = "#$evaluationDefn for StateForCityFn and for ProvinceForCityFn.\r\n\r\n@unknown nancy")
    public static SubLObject state_or_province_for_city_defn(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject state_list = kb_mapping_utilities.pred_values_in_any_mt(fort, $$geopoliticalSubdivision, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject cdolist_list_var = state_list;
            SubLObject item = NIL;
            item = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((NIL != isa.isaP(item, $$State_UnitedStates, UNPROVIDED, UNPROVIDED)) || (NIL != isa.isaP(item, $$CanadianProvince, UNPROVIDED, UNPROVIDED))) {
                    ans = cons(item, ans);
                }
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (!length(ans).eql(ONE_INTEGER)) {
            relation_evaluation.throw_unevaluatable();
        }
        return ans.first();
    }

    public static final SubLObject cyc_html_url_encode_alt(SubLObject the_string) {
        if (!(the_string.isString() || (NIL != unicode_nauts.unicode_naut_p(the_string)))) {
            relation_evaluation.throw_unevaluatable();
        }
        return web_utilities.html_url_encode(NIL != unicode_nauts.unicode_naut_p(the_string) ? ((SubLObject) (unicode_strings.display_to_utf8_string(cycl_utilities.nat_arg1(the_string, UNPROVIDED)))) : the_string, UNPROVIDED);
    }

    public static SubLObject cyc_html_url_encode(final SubLObject the_string) {
        if ((!the_string.isString()) && (NIL == unicode_nauts.unicode_naut_p(the_string, UNPROVIDED))) {
            relation_evaluation.throw_unevaluatable();
        }
        return web_utilities.html_url_encode(NIL != unicode_nauts.unicode_naut_p(the_string, UNPROVIDED) ? unicode_strings.display_to_utf8_string(cycl_utilities.nat_arg1(the_string, UNPROVIDED)) : the_string, UNPROVIDED);
    }

    public static final SubLObject cyc_url_source_alt(SubLObject url) {
        {
            SubLObject error_message = NIL;
            SubLObject ans = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            ans = web_utilities.get_html_source_from_url(com.cyc.cycjava.cycl.evaluation_defns.url_string(url), UNPROVIDED, UNPROVIDED);
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            }
            if (NIL != error_message) {
                relation_evaluation.throw_unevaluatable();
            } else {
                if (!ans.isString()) {
                    relation_evaluation.throw_unevaluatable();
                } else {
                    if (NIL != find($int$255, ans, symbol_function($sym178$_), symbol_function(CHAR_CODE), UNPROVIDED, UNPROVIDED)) {
                        relation_evaluation.throw_unevaluatable();
                    } else {
                        if ((NIL != unicode_strings.non_ascii_string_p(ans)) && (NIL != search($str_alt180$charset_utf_8, ans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                            return unicode_nauts.make_unicode_naut(unicode_strings.utf8_string_to_display(ans));
                        } else {
                            return ans;
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject cyc_url_source(final SubLObject url) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error_message = NIL;
        SubLObject ans = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    ans = web_utilities.get_html_source_from_url(url_string(url), UNPROVIDED, UNPROVIDED);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error_message) {
            relation_evaluation.throw_unevaluatable();
        } else
            if (!ans.isString()) {
                relation_evaluation.throw_unevaluatable();
            } else
                if (NIL != find($int$255, ans, symbol_function($sym211$_), symbol_function(CHAR_CODE), UNPROVIDED, UNPROVIDED)) {
                    relation_evaluation.throw_unevaluatable();
                } else {
                    if ((NIL != unicode_strings.non_ascii_string_p(ans)) && (NIL != search($str240$charset_utf_8, ans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                        return unicode_nauts.make_unicode_naut(unicode_strings.utf8_string_to_display(ans));
                    }
                    return ans;
                }


        return NIL;
    }

    public static final SubLObject cyc_get_from_http_source_alt(SubLObject args) {
        {
            SubLObject result = NIL;
            SubLObject query_string = NIL;
            if (length(args).numG(TWO_INTEGER)) {
                query_string = com.cyc.cycjava.cycl.evaluation_defns.encode_list_for_simple_http_server(cddr(args));
            }
            if (NIL != query_string) {
                {
                    SubLObject real_port = (cadr(args).eql($DEFAULT)) ? ((SubLObject) ($int$80)) : cadr(args);
                    SubLObject channel = NIL;
                    try {
                        channel = open_tcp_stream_with_timeout(args.first(), real_port, NIL, $PRIVATE);
                        if (NIL != channel) {
                            web_utilities.send_http_request(channel, list(new SubLObject[]{ $MACHINE, args.first(), $PORT, cadr(args), $METHOD, $GET, $URL, $str_alt189$simple_http_get, $QUERY, query_string, $kw191$KEEP_ALIVE_, T, $kw192$WIDE_NEWLINES_, NIL, $ACCEPT_TYPES, $DEFAULT }));
                            result = web_utilities.http_response_body(web_utilities.read_until_eof(channel, UNPROVIDED));
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                if (NIL != channel) {
                                    close(channel, UNPROVIDED);
                                }
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                }
            } else {
                {
                    SubLObject real_port = (cadr(args).eql($DEFAULT)) ? ((SubLObject) ($int$80)) : cadr(args);
                    SubLObject channel = NIL;
                    try {
                        channel = open_tcp_stream_with_timeout(args.first(), real_port, NIL, $PRIVATE);
                        if (NIL != channel) {
                            web_utilities.send_http_request(channel, list(new SubLObject[]{ $MACHINE, args.first(), $PORT, cadr(args), $METHOD, $GET, $URL, $str_alt189$simple_http_get, $QUERY, NIL, $kw191$KEEP_ALIVE_, T, $kw192$WIDE_NEWLINES_, NIL, $ACCEPT_TYPES, $DEFAULT }));
                            result = web_utilities.http_response_body(web_utilities.read_until_eof(channel, UNPROVIDED));
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                if (NIL != channel) {
                                    close(channel, UNPROVIDED);
                                }
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                }
            }
            return web_utilities.html_url_decode(result);
        }
    }

    public static SubLObject cyc_get_from_http_source(final SubLObject args) {
        SubLObject result = NIL;
        SubLObject query_string = NIL;
        if (length(args).numG(TWO_INTEGER)) {
            query_string = encode_list_for_simple_http_server(cddr(args));
        }
        if (NIL != query_string) {
            final SubLObject real_port = (cadr(args).eql($DEFAULT)) ? $int$80 : cadr(args);
            SubLObject channel = NIL;
            try {
                channel = subl_promotions.open_tcp_stream_with_timeout(args.first(), real_port, NIL, $PRIVATE);
                if (NIL != validate_tcp_connection(channel, args.first(), real_port)) {
                    web_utilities.send_http_request(channel, list(new SubLObject[]{ $MACHINE, args.first(), $PORT, cadr(args), $METHOD, $GET, $URL, $str249$simple_http_get, $QUERY, query_string, $kw251$KEEP_ALIVE_, T, $kw252$WIDE_NEWLINES_, NIL, $ACCEPT_TYPES, $DEFAULT, $CONTENT_TYPE, $DEFAULT, $SOAP_ACTION_URI, NIL }));
                    result = web_utilities.http_response_body(web_utilities.read_until_eof(channel, UNPROVIDED));
                }
            } finally {
                final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                try {
                    bind($is_thread_performing_cleanupP$, T);
                    final SubLObject _values = getValuesAsVector();
                    if (NIL != channel) {
                        close(channel, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                }
            }
        } else {
            final SubLObject real_port = (cadr(args).eql($DEFAULT)) ? $int$80 : cadr(args);
            SubLObject channel = NIL;
            try {
                channel = subl_promotions.open_tcp_stream_with_timeout(args.first(), real_port, NIL, $PRIVATE);
                if (NIL != validate_tcp_connection(channel, args.first(), real_port)) {
                    web_utilities.send_http_request(channel, list(new SubLObject[]{ $MACHINE, args.first(), $PORT, cadr(args), $METHOD, $GET, $URL, $str249$simple_http_get, $QUERY, NIL, $kw251$KEEP_ALIVE_, T, $kw252$WIDE_NEWLINES_, NIL, $ACCEPT_TYPES, $DEFAULT, $CONTENT_TYPE, $DEFAULT, $SOAP_ACTION_URI, NIL }));
                    result = web_utilities.http_response_body(web_utilities.read_until_eof(channel, UNPROVIDED));
                }
            } finally {
                final SubLObject _prev_bind_2 = currentBinding($is_thread_performing_cleanupP$);
                try {
                    bind($is_thread_performing_cleanupP$, T);
                    final SubLObject _values2 = getValuesAsVector();
                    if (NIL != channel) {
                        close(channel, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values2);
                } finally {
                    rebind($is_thread_performing_cleanupP$, _prev_bind_2);
                }
            }
        }
        return web_utilities.html_url_decode(result);
    }

    public static final SubLObject encode_list_for_simple_http_server_alt(SubLObject the_list) {
        {
            SubLObject result = $str_alt29$;
            SubLObject cdolist_list_var = the_list;
            SubLObject the_element = NIL;
            for (the_element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , the_element = cdolist_list_var.first()) {
                result = cconcatenate(result, new SubLObject[]{ the_element.isString() ? ((SubLObject) (web_utilities.html_url_encode(cconcatenate($str_alt195$_, new SubLObject[]{ the_element, $str_alt195$_ }), UNPROVIDED))) : web_utilities.html_url_encode(string_utilities.to_string(the_element), UNPROVIDED), $str_alt196$_ });
            }
            return string_utilities.post_remove(result, $str_alt196$_, UNPROVIDED);
        }
    }

    public static SubLObject encode_list_for_simple_http_server(final SubLObject the_list) {
        SubLObject result = $str31$;
        SubLObject cdolist_list_var = the_list;
        SubLObject the_element = NIL;
        the_element = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cconcatenate(result, new SubLObject[]{ the_element.isString() ? web_utilities.html_url_encode(cconcatenate($str257$_, new SubLObject[]{ the_element, $str257$_ }), UNPROVIDED) : web_utilities.html_url_encode(string_utilities.to_string(the_element), UNPROVIDED), $str258$_ });
            cdolist_list_var = cdolist_list_var.rest();
            the_element = cdolist_list_var.first();
        } 
        return string_utilities.post_remove(result, $str258$_, UNPROVIDED);
    }

    public static final SubLObject cyc_term_uri_fn_alt(SubLObject cyc_term) {
        {
            SubLObject result = NIL;
            if ((((NIL != cycl_nat_p(cyc_term)) && (cycl_utilities.nat_functor(cyc_term) == $$SchemaObjectFn)) && (NIL != string_utilities.starts_with(cycl_utilities.formula_arg2(cyc_term, UNPROVIDED), $str_alt198$_))) && (NIL != string_utilities.ends_with(cycl_utilities.formula_arg2(cyc_term, UNPROVIDED), $str_alt199$_, UNPROVIDED))) {
                return string_utilities.substring(cycl_utilities.formula_arg2(cyc_term, UNPROVIDED), ONE_INTEGER, subtract(length(cycl_utilities.formula_arg2(cyc_term, UNPROVIDED)), ONE_INTEGER));
            } else {
                relation_evaluation.throw_unevaluatable();
            }
        }
        return NIL;
    }

    public static SubLObject cyc_term_uri_fn(final SubLObject cyc_term) {
        SubLObject result = NIL;
        if ((((NIL != cycl_grammar.cycl_nat_p(cyc_term)) && cycl_utilities.nat_functor(cyc_term).eql($$SchemaObjectFn)) && (NIL != string_utilities.starts_with(cycl_utilities.formula_arg2(cyc_term, UNPROVIDED), $str260$_))) && (NIL != string_utilities.ends_with(cycl_utilities.formula_arg2(cyc_term, UNPROVIDED), $str261$_, UNPROVIDED))) {
            result = string_utilities.substring(cycl_utilities.formula_arg2(cyc_term, UNPROVIDED), ONE_INTEGER, subtract(length(cycl_utilities.formula_arg2(cyc_term, UNPROVIDED)), ONE_INTEGER));
        } else {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }

    /**
     * #$evaluationDfn for #$CityNamedFn.
     *
     * @unknown ghowe
     */
    @LispMethod(comment = "#$evaluationDfn for #$CityNamedFn.\r\n\r\n@unknown ghowe")
    public static final SubLObject city_named_fn_defn_alt(SubLObject the_string, SubLObject the_country) {
        if (!the_string.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        {
            SubLObject all_candidates = NIL;
            SubLObject result = NIL;
            all_candidates = lexicon_accessors.denots_of_name_string(the_string, T, UNPROVIDED, UNPROVIDED);
            if (NIL == result) {
                {
                    SubLObject csome_list_var = all_candidates;
                    SubLObject candidate = NIL;
                    for (candidate = csome_list_var.first(); !((NIL != result) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , candidate = csome_list_var.first()) {
                        if ((NIL != isa.isa_in_any_mtP(candidate, $$City)) && (NIL != com.cyc.cycjava.cycl.evaluation_defns.city_in_regionP(candidate, the_country))) {
                            result = candidate;
                        }
                    }
                }
            }
            return NIL != result ? ((SubLObject) (result)) : cycl_utilities.reify_when_closed_naut(list($$CityNamedFn, the_string, the_country));
        }
    }

    /**
     * #$evaluationDfn for #$CityNamedFn.
     *
     * @unknown ghowe
     */
    @LispMethod(comment = "#$evaluationDfn for #$CityNamedFn.\r\n\r\n@unknown ghowe")
    public static SubLObject city_named_fn_defn(final SubLObject the_string, final SubLObject the_country) {
        if (!the_string.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        SubLObject all_candidates = NIL;
        SubLObject result = NIL;
        all_candidates = lexicon_accessors.denots_of_name_string(the_string, T, UNPROVIDED, UNPROVIDED);
        if (NIL == result) {
            SubLObject csome_list_var = all_candidates;
            SubLObject candidate = NIL;
            candidate = csome_list_var.first();
            while ((NIL == result) && (NIL != csome_list_var)) {
                if ((NIL != isa.isa_in_any_mtP(candidate, $$City)) && (NIL != city_in_regionP(candidate, the_country))) {
                    result = candidate;
                }
                csome_list_var = csome_list_var.rest();
                candidate = csome_list_var.first();
            } 
        }
        return NIL != result ? result : cycl_utilities.reify_when_closed_naut(list($$CityNamedFn, the_string, the_country));
    }

    public static final SubLObject city_in_regionP_alt(SubLObject city, SubLObject region) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
                SubLObject city_in_regionP = NIL;
                {
                    SubLObject _prev_bind_0 = gt_vars.$suspend_gt_type_checkingP$.currentBinding(thread);
                    try {
                        gt_vars.$suspend_gt_type_checkingP$.bind(T, thread);
                        city_in_regionP = closed_query_success_result_p(inference_kernel.new_cyc_query(list($$geopoliticalSubdivision, region, city), mt, $list_alt204));
                    } finally {
                        gt_vars.$suspend_gt_type_checkingP$.rebind(_prev_bind_0, thread);
                    }
                }
                return city_in_regionP;
            }
        }
    }

    public static SubLObject city_in_regionP(final SubLObject city, final SubLObject region) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
        SubLObject city_in_regionP = NIL;
        final SubLObject _prev_bind_0 = gt_vars.$suspend_gt_type_checkingP$.currentBinding(thread);
        try {
            gt_vars.$suspend_gt_type_checkingP$.bind(T, thread);
            city_in_regionP = cyc_kernel.closed_query_success_result_p(inference_kernel.new_cyc_query(list($$geopoliticalSubdivision, region, city), mt, $list266));
        } finally {
            gt_vars.$suspend_gt_type_checkingP$.rebind(_prev_bind_0, thread);
        }
        return city_in_regionP;
    }

    /**
     * #$evaluationDefn for #$TextTopicStructureFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$TextTopicStructureFn")
    public static final SubLObject text_topic_structure_alt(SubLObject source_string) {
        {
            SubLObject unicodeP = unicode_nauts.unicode_naut_p(source_string);
            SubLObject string = (NIL != unicodeP) ? ((SubLObject) (unicode_strings.display_to_subl_string(cycl_utilities.nat_arg1(source_string, UNPROVIDED), UNPROVIDED, UNPROVIDED))) : source_string;
            if (!string.isString()) {
                relation_evaluation.throw_unevaluatable();
            }
            {
                SubLObject doc = document.new_document(string, UNPROVIDED);
                return parsing_utilities.complete_text_topic_structure_tagging(concept_tagger.tag_concepts(doc, list($OUTPUT_SPEC, nl_api_datastructures.new_nl_interpretation_spec(UNPROVIDED))));
            }
        }
    }

    /**
     * #$evaluationDefn for #$TextTopicStructureFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$TextTopicStructureFn")
    public static SubLObject text_topic_structure(final SubLObject source_string) {
        final SubLObject unicodeP = unicode_nauts.unicode_naut_p(source_string, UNPROVIDED);
        final SubLObject string = (NIL != unicodeP) ? unicode_strings.display_to_subl_string(cycl_utilities.nat_arg1(source_string, UNPROVIDED), UNPROVIDED, UNPROVIDED) : source_string;
        if (!string.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject doc = document.new_document(string, UNPROVIDED, UNPROVIDED);
        return parsing_utilities.complete_text_topic_structure_tagging(concept_tagger.tag_concepts(doc, list($OUTPUT_SPEC, nl_api_datastructures.new_nl_interpretation_spec(UNPROVIDED))));
    }

    public static final SubLObject el_list_to_subl_list_alt(SubLObject el_list) {
        if (NIL == el_list_p(el_list)) {
            relation_evaluation.throw_unevaluatable();
        }
        return el_list_items(el_list);
    }

    public static SubLObject el_list_to_subl_list(final SubLObject el_list) {
        if (NIL == el_list_p(el_list)) {
            relation_evaluation.throw_unevaluatable();
        }
        return el_list_items(el_list);
    }

    public static final SubLObject cyc_ordering_result_alt(SubLObject total_ordering) {
        {
            SubLObject ans = NIL;
            SubLObject ignore_errors_tag = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
                        try {
                            {
                                SubLObject base_set = removal_ask_variable($BASE_SET, listS($$baseSet, total_ordering, $list_alt212), mt_relevance_macros.inference_relevant_mt(), UNPROVIDED, UNPROVIDED).first();
                                SubLObject ordering_relation = removal_ask_variable($ORDERING_RELATION, listS($$orderingRelation, total_ordering, $list_alt215), mt_relevance_macros.inference_relevant_mt(), UNPROVIDED, UNPROVIDED).first();
                                ans = ((NIL != base_set) && (NIL != ordering_relation)) ? ((SubLObject) (com.cyc.cycjava.cycl.evaluation_defns.cyc_ordering_result_internal(base_set, ordering_relation))) : NIL;
                            }
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
            }
            if (NIL == el_list_p(ans)) {
                relation_evaluation.throw_unevaluatable();
            }
            return ans;
        }
    }

    public static SubLObject cyc_ordering_result(final SubLObject total_ordering) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    final SubLObject base_set = backward.removal_ask_variable($BASE_SET, listS($$baseSet, total_ordering, $list272), mt_relevance_macros.inference_relevant_mt(), UNPROVIDED, UNPROVIDED).first();
                    final SubLObject ordering_relation = backward.removal_ask_variable($ORDERING_RELATION, listS($$orderingRelation, total_ordering, $list275), mt_relevance_macros.inference_relevant_mt(), UNPROVIDED, UNPROVIDED).first();
                    ans = ((NIL != base_set) && (NIL != ordering_relation)) ? cyc_ordering_result_internal(base_set, ordering_relation) : NIL;
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        if (NIL == el_list_p(ans)) {
            relation_evaluation.throw_unevaluatable();
        }
        return ans;
    }

    /**
     *
     *
     * @return BOOLEANP; Does ELEMENT1 precede ELEMENT2 according to *CYC-ORDERING-RELATION*?
     */
    @LispMethod(comment = "@return BOOLEANP; Does ELEMENT1 precede ELEMENT2 according to *CYC-ORDERING-RELATION*?")
    public static final SubLObject ordering_L_alt(SubLObject element1, SubLObject element2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return list_utilities.sublisp_boolean(removal_ask(make_binary_formula($cyc_ordering_relation$.getDynamicValue(thread), element1, element2), mt_relevance_macros.inference_relevant_mt(), UNPROVIDED, UNPROVIDED));
        }
    }

    /**
     *
     *
     * @return BOOLEANP; Does ELEMENT1 precede ELEMENT2 according to *CYC-ORDERING-RELATION*?
     */
    @LispMethod(comment = "@return BOOLEANP; Does ELEMENT1 precede ELEMENT2 according to *CYC-ORDERING-RELATION*?")
    public static SubLObject ordering_L(final SubLObject element1, final SubLObject element2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.sublisp_boolean(backward.removal_ask(make_binary_formula($cyc_ordering_relation$.getDynamicValue(thread), element1, element2), mt_relevance_macros.inference_relevant_mt(), UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject cyc_ordering_result_internal_alt(SubLObject base_set, SubLObject ordering_relation) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject elements = removal_ask_variable($ELEMENT, list($$elementOf, $ELEMENT, base_set), mt_relevance_macros.inference_relevant_mt(), UNPROVIDED, UNPROVIDED);
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = $cyc_ordering_relation$.currentBinding(thread);
                    try {
                        $cyc_ordering_relation$.bind(ordering_relation, thread);
                        {
                            SubLObject sorted = Sort.sort(elements, $sym219$ORDERING__, UNPROVIDED);
                            ans = make_el_list(sorted, UNPROVIDED);
                        }
                    } finally {
                        $cyc_ordering_relation$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    public static SubLObject cyc_ordering_result_internal(final SubLObject base_set, final SubLObject ordering_relation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject elements = backward.removal_ask_variable($ELEMENT, list($$elementOf, $ELEMENT, base_set), mt_relevance_macros.inference_relevant_mt(), UNPROVIDED, UNPROVIDED);
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = $cyc_ordering_relation$.currentBinding(thread);
        try {
            $cyc_ordering_relation$.bind(ordering_relation, thread);
            final SubLObject sorted = Sort.sort(elements, $sym279$ORDERING__, UNPROVIDED);
            ans = make_el_list(sorted, UNPROVIDED);
        } finally {
            $cyc_ordering_relation$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject cyc_time_of_day_of_date(final SubLObject date) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    result = date_utilities.time_of_day_of_date(date);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        if (NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }

    /**
     * evaluationDefn for #$SecondsSince1970ToDateFn
     *
     * @unknown baxter
     */
    @LispMethod(comment = "evaluationDefn for #$SecondsSince1970ToDateFn\r\n\r\n@unknown baxter")
    public static final SubLObject cyc_seconds_since_1970_to_date_alt(SubLObject seconds) {
        {
            SubLObject result = NIL;
            SubLObject ignore_errors_tag = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
                        try {
                            {
                                SubLObject universal_time = add(seconds, $start_of_1970$.getGlobalValue());
                                result = universal_time_to_cycl_date(universal_time);
                            }
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
            }
            if (NIL == result) {
                relation_evaluation.throw_unevaluatable();
            }
            return result;
        }
    }

    /**
     * evaluationDefn for #$SecondsSince1970ToDateFn
     *
     * @unknown baxter
     */
    @LispMethod(comment = "evaluationDefn for #$SecondsSince1970ToDateFn\r\n\r\n@unknown baxter")
    public static SubLObject cyc_seconds_since_1970_to_date(final SubLObject seconds) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    final SubLObject universal_time = add(seconds, date_utilities.$start_of_1970$.getGlobalValue());
                    result = date_utilities.universal_time_to_cycl_date(universal_time);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        if (NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }

    public static SubLObject cyc_date_to_seconds_since_1970(final SubLObject date) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    result = subtract(date_utilities.cycl_date_to_universal_time(date), date_utilities.$start_of_1970$.getGlobalValue());
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        if (NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }

    /**
     * evaluationDefn for #$TypesMostOftenAssertedUsingToolFn
     */
    @LispMethod(comment = "evaluationDefn for #$TypesMostOftenAssertedUsingToolFn")
    public static final SubLObject cyc_types_most_often_asserted_using_tool_alt(SubLObject tool, SubLObject result_length) {
        return make_el_list(com.cyc.cycjava.cycl.evaluation_defns.types_most_often_asserted_using_tool(tool, result_length, UNPROVIDED, UNPROVIDED), UNPROVIDED);
    }

    /**
     * evaluationDefn for #$TypesMostOftenAssertedUsingToolFn
     */
    @LispMethod(comment = "evaluationDefn for #$TypesMostOftenAssertedUsingToolFn")
    public static SubLObject cyc_types_most_often_asserted_using_tool(final SubLObject tool, final SubLObject result_length) {
        return make_el_list(types_most_often_asserted_using_tool(tool, result_length, UNPROVIDED, UNPROVIDED), UNPROVIDED);
    }

    /**
     *
     *
     * @param RESULT-LENGTH;
     * 		non-negative-integer-p: how long the result list will be
     * @param EXCLUDE-LIST;
     * 		listp: collections that are to be explicitly excluded from the result
     * @param EXCLUDE-IF-NOT-LIST;
     * 		listp: predicates that a collection must pass in order to avoid exclusion from the result
     * @return listp; the collections that most often appear as the arg2 of #$isa and #$genls assertions
    asserted using TOOL in relevant microtheories.  MT relevance is established outside.
     */
    @LispMethod(comment = "@param RESULT-LENGTH;\r\n\t\tnon-negative-integer-p: how long the result list will be\r\n@param EXCLUDE-LIST;\r\n\t\tlistp: collections that are to be explicitly excluded from the result\r\n@param EXCLUDE-IF-NOT-LIST;\r\n\t\tlistp: predicates that a collection must pass in order to avoid exclusion from the result\r\n@return listp; the collections that most often appear as the arg2 of #$isa and #$genls assertions\r\nasserted using TOOL in relevant microtheories.  MT relevance is established outside.")
    public static final SubLObject types_most_often_asserted_using_tool_alt(SubLObject tool, SubLObject result_length, SubLObject exclude_list, SubLObject exclude_if_not_list) {
        if (result_length == UNPROVIDED) {
            result_length = TEN_INTEGER;
        }
        if (exclude_list == UNPROVIDED) {
            exclude_list = NIL;
        }
        if (exclude_if_not_list == UNPROVIDED) {
            exclude_if_not_list = NIL;
        }
        SubLTrampolineFile.checkType(tool, ASSERTION_GENERATING_TOOL_P);
        SubLTrampolineFile.checkType(result_length, NON_NEGATIVE_INTEGER_P);
        SubLTrampolineFile.checkType(exclude_list, NON_DOTTED_LIST_P);
        SubLTrampolineFile.checkType(exclude_if_not_list, NON_DOTTED_LIST_P);
        {
            SubLObject count_by_type = new_dictionary(symbol_function(EQ), UNPROVIDED);
            {
                SubLObject cdolist_list_var = genl_predicates.all_spec_predicates($$assertedUsingTool, UNPROVIDED, UNPROVIDED);
                SubLObject spec_pred = NIL;
                for (spec_pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , spec_pred = cdolist_list_var.first()) {
                    {
                        SubLObject assertion = NIL;
                        SubLObject pred_var = spec_pred;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(tool, TWO_INTEGER, pred_var)) {
                            {
                                SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(tool, TWO_INTEGER, pred_var);
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
                                                        SubLObject done_var_54 = NIL;
                                                        SubLObject token_var_55 = NIL;
                                                        while (NIL == done_var_54) {
                                                            {
                                                                SubLObject assertion_56 = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_55);
                                                                SubLObject valid_57 = makeBoolean(token_var_55 != assertion_56);
                                                                if (NIL != valid_57) {
                                                                    assertion = gaf_arg(assertion_56, ONE_INTEGER);
                                                                    if (NIL != assertion_handles.assertion_p(assertion)) {
                                                                        {
                                                                            SubLObject pred = gaf_predicate(assertion);
                                                                            if ((NIL != genls.genlP(pred, $$isa, UNPROVIDED, UNPROVIDED)) || (NIL != genls.genlP(pred, $$genls, UNPROVIDED, UNPROVIDED))) {
                                                                                {
                                                                                    SubLObject type = gaf_arg2(assertion);
                                                                                    dictionary_increment(count_by_type, type, UNPROVIDED);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                done_var_54 = makeBoolean(NIL == valid_57);
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
                    }
                }
            }
            {
                SubLObject types_sorted = sort_dictionary_by_values(count_by_type, symbol_function($sym235$_));
                {
                    SubLObject cdolist_list_var = exclude_list;
                    SubLObject collection = NIL;
                    for (collection = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collection = cdolist_list_var.first()) {
                        types_sorted = delete(collection, types_sorted, symbol_function(EQ), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }
                {
                    SubLObject cdolist_list_var = exclude_if_not_list;
                    SubLObject predicate = NIL;
                    for (predicate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , predicate = cdolist_list_var.first()) {
                        types_sorted = list_utilities.delete_if_not(predicate, types_sorted, symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }
                return Mapping.mapcar(symbol_function(CAR), list_utilities.first_n(result_length, types_sorted));
            }
        }
    }

    /**
     *
     *
     * @param RESULT-LENGTH;
     * 		non-negative-integer-p: how long the result list will be
     * @param EXCLUDE-LIST;
     * 		listp: collections that are to be explicitly excluded from the result
     * @param EXCLUDE-IF-NOT-LIST;
     * 		listp: predicates that a collection must pass in order to avoid exclusion from the result
     * @return listp; the collections that most often appear as the arg2 of #$isa and #$genls assertions
    asserted using TOOL in relevant microtheories.  MT relevance is established outside.
     */
    @LispMethod(comment = "@param RESULT-LENGTH;\r\n\t\tnon-negative-integer-p: how long the result list will be\r\n@param EXCLUDE-LIST;\r\n\t\tlistp: collections that are to be explicitly excluded from the result\r\n@param EXCLUDE-IF-NOT-LIST;\r\n\t\tlistp: predicates that a collection must pass in order to avoid exclusion from the result\r\n@return listp; the collections that most often appear as the arg2 of #$isa and #$genls assertions\r\nasserted using TOOL in relevant microtheories.  MT relevance is established outside.")
    public static SubLObject types_most_often_asserted_using_tool(final SubLObject tool, SubLObject result_length, SubLObject exclude_list, SubLObject exclude_if_not_list) {
        if (result_length == UNPROVIDED) {
            result_length = TEN_INTEGER;
        }
        if (exclude_list == UNPROVIDED) {
            exclude_list = NIL;
        }
        if (exclude_if_not_list == UNPROVIDED) {
            exclude_if_not_list = NIL;
        }
        assert NIL != assertion_generating_tool_p(tool) : "! evaluation_defns.assertion_generating_tool_p(tool) " + ("evaluation_defns.assertion_generating_tool_p(tool) " + "CommonSymbols.NIL != evaluation_defns.assertion_generating_tool_p(tool) ") + tool;
        assert NIL != subl_promotions.non_negative_integer_p(result_length) : "! subl_promotions.non_negative_integer_p(result_length) " + ("subl_promotions.non_negative_integer_p(result_length) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(result_length) ") + result_length;
        assert NIL != list_utilities.non_dotted_list_p(exclude_list) : "! list_utilities.non_dotted_list_p(exclude_list) " + ("list_utilities.non_dotted_list_p(exclude_list) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(exclude_list) ") + exclude_list;
        assert NIL != list_utilities.non_dotted_list_p(exclude_if_not_list) : "! list_utilities.non_dotted_list_p(exclude_if_not_list) " + ("list_utilities.non_dotted_list_p(exclude_if_not_list) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(exclude_if_not_list) ") + exclude_if_not_list;
        final SubLObject count_by_type = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
        SubLObject cdolist_list_var = genl_predicates.all_spec_predicates($$assertedUsingTool, UNPROVIDED, UNPROVIDED);
        SubLObject spec_pred = NIL;
        spec_pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject assertion = NIL;
            final SubLObject pred_var = spec_pred;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(tool, TWO_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(tool, TWO_INTEGER, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                            SubLObject done_var_$63 = NIL;
                            final SubLObject token_var_$64 = NIL;
                            while (NIL == done_var_$63) {
                                final SubLObject assertion_$65 = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$64);
                                final SubLObject valid_$66 = makeBoolean(!token_var_$64.eql(assertion_$65));
                                if (NIL != valid_$66) {
                                    assertion = assertions_high.gaf_arg(assertion_$65, ONE_INTEGER);
                                    if (NIL != assertion_handles.assertion_p(assertion)) {
                                        final SubLObject pred = assertions_high.gaf_predicate(assertion);
                                        if ((NIL != genls.genlP(pred, $$isa, UNPROVIDED, UNPROVIDED)) || (NIL != genls.genlP(pred, $$genls, UNPROVIDED, UNPROVIDED))) {
                                            final SubLObject type = assertions_high.gaf_arg2(assertion);
                                            dictionary_utilities.dictionary_increment(count_by_type, type, UNPROVIDED);
                                        }
                                    }
                                }
                                done_var_$63 = makeBoolean(NIL == valid_$66);
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
            cdolist_list_var = cdolist_list_var.rest();
            spec_pred = cdolist_list_var.first();
        } 
        SubLObject types_sorted = dictionary_utilities.sort_dictionary_by_values(count_by_type, symbol_function($sym290$_));
        SubLObject cdolist_list_var2 = exclude_list;
        SubLObject collection = NIL;
        collection = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            types_sorted = delete(collection, types_sorted, symbol_function(EQL), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cdolist_list_var2 = cdolist_list_var2.rest();
            collection = cdolist_list_var2.first();
        } 
        cdolist_list_var2 = exclude_if_not_list;
        SubLObject predicate = NIL;
        predicate = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            types_sorted = list_utilities.delete_if_not(predicate, types_sorted, symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cdolist_list_var2 = cdolist_list_var2.rest();
            predicate = cdolist_list_var2.first();
        } 
        return Mapping.mapcar(symbol_function(CAR), list_utilities.first_n(result_length, types_sorted));
    }

    public static final SubLObject assertion_generating_tool_p_alt(SubLObject v_object) {
        return isa.isa_in_any_mtP(v_object, $$AssertionGeneratingRKFTool);
    }

    public static SubLObject assertion_generating_tool_p(final SubLObject v_object) {
        return isa.isa_in_any_mtP(v_object, $$AssertionGeneratingRKFTool);
    }

    /**
     * Highlights each string of STRING-SET in TEXT and returns the resulting HTML text.  Used a bunch of heuristica and cleaning strategems.
     */
    @LispMethod(comment = "Highlights each string of STRING-SET in TEXT and returns the resulting HTML text.  Used a bunch of heuristica and cleaning strategems.")
    public static final SubLObject cyc_html_for_text_containing_strings_alt(SubLObject text_string, SubLObject string_cyc_set) {
        {
            SubLObject result_string = text_string;
            result_string = pph_remove_html_tags(text_string, UNPROVIDED);
            {
                SubLObject text_between_text_tags = string_utilities.get_substring_between_tags(result_string, $str_alt238$_TEXT_, $str_alt239$__TEXT_, UNPROVIDED, UNPROVIDED);
                if (NIL != string_utilities.non_empty_stringP(text_between_text_tags)) {
                    result_string = text_between_text_tags;
                }
            }
            result_string = string_utilities.trim_whitespace(result_string);
            {
                SubLObject cdolist_list_var = extensional_set_elements(string_cyc_set);
                SubLObject term_string = NIL;
                for (term_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , term_string = cdolist_list_var.first()) {
                    result_string = string_utilities.string_substitute(cconcatenate($str_alt240$_b_, new SubLObject[]{ term_string, $str_alt241$__b_ }), term_string, result_string, UNPROVIDED);
                }
            }
            {
                SubLObject separate_sentences = string_utilities.separate_sentences(result_string, UNPROVIDED);
                SubLObject sentence_bold_tag_counts = Mapping.mapcar(CYC_HTML_FOR_TEXT_CONTAINING_STRINGS_COUNT_BOLD_TAGS, separate_sentences);
                SubLObject saved_sentences = NIL;
                SubLObject sentence = NIL;
                SubLObject sentence_58 = NIL;
                SubLObject sentence_bold_tag_count = NIL;
                SubLObject sentence_bold_tag_count_59 = NIL;
                for (sentence = separate_sentences, sentence_58 = sentence.first(), sentence_bold_tag_count = sentence_bold_tag_counts, sentence_bold_tag_count_59 = sentence_bold_tag_count.first(); !((NIL == sentence_bold_tag_count) && (NIL == sentence)); sentence = sentence.rest() , sentence_58 = sentence.first() , sentence_bold_tag_count = sentence_bold_tag_count.rest() , sentence_bold_tag_count_59 = sentence_bold_tag_count.first()) {
                    if (sentence_bold_tag_count_59.numG(ZERO_INTEGER)) {
                        saved_sentences = cons(sentence_58, saved_sentences);
                    }
                }
                result_string = string_utilities.join_strings(nreverse(saved_sentences), $str_alt243$_____);
            }
            if (NIL == result_string) {
                relation_evaluation.throw_unevaluatable();
            }
            return result_string;
        }
    }

    /**
     * Highlights each string of STRING-SET in TEXT and returns the resulting HTML text.  Used a bunch of heuristica and cleaning strategems.
     */
    @LispMethod(comment = "Highlights each string of STRING-SET in TEXT and returns the resulting HTML text.  Used a bunch of heuristica and cleaning strategems.")
    public static SubLObject cyc_html_for_text_containing_strings(final SubLObject text_string, final SubLObject string_cyc_set) {
        SubLObject result_string = pph_utilities.pph_remove_html_tags(text_string, UNPROVIDED);
        final SubLObject text_between_text_tags = string_utilities.get_substring_between_tags(result_string, $str293$_TEXT_, $str294$__TEXT_, UNPROVIDED, UNPROVIDED);
        if (NIL != string_utilities.non_empty_stringP(text_between_text_tags)) {
            result_string = text_between_text_tags;
        }
        result_string = string_utilities.trim_whitespace(result_string);
        SubLObject cdolist_list_var = extensional_set_elements(string_cyc_set);
        SubLObject term_string = NIL;
        term_string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result_string = string_utilities.string_substitute(cconcatenate($str295$_b_, new SubLObject[]{ term_string, $str296$__b_ }), term_string, result_string, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            term_string = cdolist_list_var.first();
        } 
        final SubLObject separate_sentences = string_utilities.separate_sentences(result_string, UNPROVIDED);
        final SubLObject sentence_bold_tag_counts = Mapping.mapcar(CYC_HTML_FOR_TEXT_CONTAINING_STRINGS_COUNT_BOLD_TAGS, separate_sentences);
        SubLObject saved_sentences = NIL;
        SubLObject sentence = NIL;
        SubLObject sentence_$67 = NIL;
        SubLObject sentence_bold_tag_count = NIL;
        SubLObject sentence_bold_tag_count_$68 = NIL;
        sentence = separate_sentences;
        sentence_$67 = sentence.first();
        sentence_bold_tag_count = sentence_bold_tag_counts;
        sentence_bold_tag_count_$68 = sentence_bold_tag_count.first();
        while ((NIL != sentence_bold_tag_count) || (NIL != sentence)) {
            if (sentence_bold_tag_count_$68.numG(ZERO_INTEGER)) {
                saved_sentences = cons(sentence_$67, saved_sentences);
            }
            sentence = sentence.rest();
            sentence_$67 = sentence.first();
            sentence_bold_tag_count = sentence_bold_tag_count.rest();
            sentence_bold_tag_count_$68 = sentence_bold_tag_count.first();
        } 
        result_string = string_utilities.join_strings(nreverse(saved_sentences), $str298$_____);
        if (NIL == result_string) {
            relation_evaluation.throw_unevaluatable();
        }
        return result_string;
    }

    public static final SubLObject cyc_html_for_text_containing_strings_count_bold_tags_alt(SubLObject sentence) {
        return length(string_utilities.search_all($str_alt240$_b_, sentence, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject cyc_html_for_text_containing_strings_count_bold_tags(final SubLObject sentence) {
        return length(string_utilities.search_all($str295$_b_, sentence, UNPROVIDED, UNPROVIDED));
    }

    /**
     * Evaluation defn for CycL evaluatable form of format.
     */
    @LispMethod(comment = "Evaluation defn for CycL evaluatable form of format.")
    public static final SubLObject cyc_format_alt(SubLObject format_string, SubLObject arg_list) {
        return apply(symbol_function(FORMAT), cons(NIL, cons(format_string, arg_list)));
    }

    /**
     * Evaluation defn for CycL evaluatable form of format.
     */
    @LispMethod(comment = "Evaluation defn for CycL evaluatable form of format.")
    public static SubLObject cyc_format(final SubLObject format_string, final SubLObject arg_list) {
        return apply(symbol_function(FORMAT), cons(NIL, cons(format_string, arg_list)));
    }

    public static final SubLObject cyc_next_integer_in_sequence_alt(SubLObject cycl_term) {
        if (NIL == cycl_term_p(cycl_term)) {
            relation_evaluation.throw_unevaluatable();
        }
        {
            SubLObject v_term = cycl_utilities.hl_to_el(cycl_term);
            SubLObject isg = NIL;
            SubLObject lock = $term_to_isg_table_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                isg = dictionary_lookup($term_to_isg_table$.getGlobalValue(), v_term, UNPROVIDED);
                if (NIL == isg) {
                    isg = integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    dictionary_enter($term_to_isg_table$.getGlobalValue(), v_term, isg);
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return integer_sequence_generator.integer_sequence_generator_next(isg);
        }
    }

    public static SubLObject cyc_next_integer_in_sequence(final SubLObject cycl_term) {
        if (NIL == cycl_grammar.cycl_term_p(cycl_term)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject v_term = cycl_utilities.hl_to_el(cycl_term);
        SubLObject isg = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($term_to_isg_table_lock$.getGlobalValue());
            isg = dictionary.dictionary_lookup($term_to_isg_table$.getGlobalValue(), v_term, UNPROVIDED);
            if (NIL == isg) {
                isg = integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED);
                dictionary.dictionary_enter($term_to_isg_table$.getGlobalValue(), v_term, isg);
            }
        } finally {
            if (NIL != release) {
                release_lock($term_to_isg_table_lock$.getGlobalValue());
            }
        }
        return integer_sequence_generator.integer_sequence_generator_next(isg);
    }

    public static final SubLObject cyc_next_integer_in_sequence_starting_at_alt(SubLObject cycl_term, SubLObject number) {
        if (!(((NIL != cycl_term_p(cycl_term)) && number.isInteger()) && number.isPositive())) {
            relation_evaluation.throw_unevaluatable();
        }
        {
            SubLObject v_term = cycl_utilities.hl_to_el(cycl_term);
            SubLObject key_for_isg = cons(v_term, number);
            SubLObject isg = NIL;
            SubLObject lock = $term_to_isg_wXstart_table_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                isg = dictionary_lookup($term_to_isg_wXstart_table$.getGlobalValue(), key_for_isg, UNPROVIDED);
                if (NIL == isg) {
                    isg = integer_sequence_generator.new_integer_sequence_generator(number, UNPROVIDED, UNPROVIDED);
                    dictionary_enter($term_to_isg_wXstart_table$.getGlobalValue(), key_for_isg, isg);
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return integer_sequence_generator.integer_sequence_generator_next(isg);
        }
    }

    public static SubLObject cyc_next_integer_in_sequence_starting_at(final SubLObject cycl_term, final SubLObject number) {
        if (((NIL == cycl_grammar.cycl_term_p(cycl_term)) || (!number.isInteger())) || (!number.isPositive())) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject v_term = cycl_utilities.hl_to_el(cycl_term);
        final SubLObject key_for_isg = cons(v_term, number);
        SubLObject isg = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($term_to_isg_wXstart_table_lock$.getGlobalValue());
            isg = dictionary.dictionary_lookup($term_to_isg_wXstart_table$.getGlobalValue(), key_for_isg, UNPROVIDED);
            if (NIL == isg) {
                isg = integer_sequence_generator.new_integer_sequence_generator(number, UNPROVIDED, UNPROVIDED);
                dictionary.dictionary_enter($term_to_isg_wXstart_table$.getGlobalValue(), key_for_isg, isg);
            }
        } finally {
            if (NIL != release) {
                release_lock($term_to_isg_wXstart_table_lock$.getGlobalValue());
            }
        }
        return integer_sequence_generator.integer_sequence_generator_next(isg);
    }

    /**
     * #$evaluationDefn for #$CyclifyFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$CyclifyFn")
    public static final SubLObject cyc_cyclify_alt(SubLObject sentence, SubLObject parser_constant) {
        if (!sentence.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        {
            SubLObject v_parser = (parser_constant.eql($$LinkParser)) ? ((SubLObject) (parser.new_link_parser(UNPROVIDED, UNPROVIDED, UNPROVIDED))) : parser_constant.eql($$CharniakParser) ? ((SubLObject) (parser.new_charniak_parser(UNPROVIDED, UNPROVIDED))) : relation_evaluation.throw_unevaluatable();
            return make_el_list(cyclifier.cyclify(sentence, list($PARSER, v_parser)), UNPROVIDED);
        }
    }

    /**
     * #$evaluationDefn for #$CyclifyFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$CyclifyFn")
    public static SubLObject cyc_cyclify(final SubLObject sentence, final SubLObject parser_constant) {
        if (!sentence.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject v_parser = (parser_constant.eql($$LinkParser)) ? parser.new_link_parser(UNPROVIDED, UNPROVIDED, UNPROVIDED) : parser_constant.eql($$CharniakParser) ? parser.new_charniak_parser(UNPROVIDED, UNPROVIDED) : relation_evaluation.throw_unevaluatable();
        return make_el_list(cyclifier.cyclify(sentence, list($PARSER, v_parser)), UNPROVIDED);
    }

    /**
     * #$evaluationDefn for #$ConcatenateStringsFn.  Handles ASCII (SubL) strings and UnicodeStringFn nauts.
     *
     * @see cyc-string-concat
     */
    @LispMethod(comment = "#$evaluationDefn for #$ConcatenateStringsFn.  Handles ASCII (SubL) strings and UnicodeStringFn nauts.\r\n\r\n@see cyc-string-concat")
    public static final SubLObject cyc_concatenate_strings_alt(SubLObject strings) {
        {
            SubLObject unicodeP = find_if(UNICODE_NAUT_P, strings, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject stringy_strings = (NIL != unicodeP) ? ((SubLObject) (com.cyc.cycjava.cycl.evaluation_defns.strings_to_display_vector_strings(strings))) : strings;
            SubLObject big_string = (NIL != stringy_strings) ? ((SubLObject) (apply(symbol_function(CCONCATENATE), stringy_strings))) : $str_alt29$;
            return NIL != unicodeP ? ((SubLObject) (unicode_nauts.make_unicode_naut(big_string))) : big_string;
        }
    }

    /**
     * #$evaluationDefn for #$ConcatenateStringsFn.  Handles ASCII (SubL) strings and UnicodeStringFn nauts.
     *
     * @see cyc-string-concat
     */
    @LispMethod(comment = "#$evaluationDefn for #$ConcatenateStringsFn.  Handles ASCII (SubL) strings and UnicodeStringFn nauts.\r\n\r\n@see cyc-string-concat")
    public static SubLObject cyc_concatenate_strings(final SubLObject strings) {
        if ((NIL == list_utilities.non_dotted_list_p(strings)) || (NIL == list_utilities.every_in_list(CYCL_STRING_P, strings, UNPROVIDED))) {
            return relation_evaluation.throw_unevaluatable();
        }
        return string_utilities.concatenate_strings(strings);
    }

    public static SubLObject cyc_concatenate_list_of_strings(final SubLObject el_list_of_strings) {
        if (NIL != el_list_p(el_list_of_strings)) {
            final SubLObject strings = el_list_items(el_list_of_strings);
            if ((NIL != list_utilities.non_dotted_list_p(strings)) && (NIL != list_utilities.every_in_list(CYCL_STRING_P, strings, UNPROVIDED))) {
                return string_utilities.concatenate_strings(strings);
            }
        }
        return relation_evaluation.throw_unevaluatable();
    }

    /**
     * #$evaluationDefn for #$TermSimilarityMetricFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$TermSimilarityMetricFn")
    public static final SubLObject cyc_term_similarity_metric_alt(SubLObject term1, SubLObject term2) {
        return kb_utilities.term_similarity_metric(term1, term2);
    }

    /**
     * #$evaluationDefn for #$TermSimilarityMetricFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$TermSimilarityMetricFn")
    public static SubLObject cyc_term_similarity_metric(final SubLObject term1, final SubLObject term2) {
        return kb_utilities.term_similarity_metric(term1, term2);
    }

    public static final SubLObject check_wn_sks_registered_alt() {
        if (NIL != sksi_infrastructure_utilities.sk_source_registeredP($const268$WordNet2_0_KS, UNPROVIDED)) {
            return $WN_SKS_REGISTERED;
        }
        return relation_evaluation.throw_unevaluatable();
    }

    public static SubLObject check_wn_sks_registered() {
        if (NIL != sksi_infrastructure_utilities.sk_source_registeredP($const316$WordNet2_0_KS, UNPROVIDED)) {
            return $WN_SKS_REGISTERED;
        }
        return relation_evaluation.throw_unevaluatable();
    }

    /**
     * #$evaluationDefn for #$WNAllCandidateDenotsForWordPOSFn-Default
     */
    @LispMethod(comment = "#$evaluationDefn for #$WNAllCandidateDenotsForWordPOSFn-Default")
    public static final SubLObject cyc_wn_all_candidate_cycls_for_word_unitXpos_alt(SubLObject word_unit, SubLObject pos) {
        com.cyc.cycjava.cycl.evaluation_defns.check_wn_sks_registered();
        return make_el_set(wordnet_utilities.wn_all_candidate_cycls_for_word_unitXpos(word_unit, pos, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
    }

    /**
     * #$evaluationDefn for #$WNAllCandidateDenotsForWordPOSFn-Default
     */
    @LispMethod(comment = "#$evaluationDefn for #$WNAllCandidateDenotsForWordPOSFn-Default")
    public static SubLObject cyc_wn_all_candidate_cycls_for_word_unitXpos(final SubLObject word_unit, final SubLObject pos) {
        check_wn_sks_registered();
        return make_el_set(wordnet_utilities.wn_all_candidate_cycls_for_word_unitXpos(word_unit, pos, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
    }

    /**
     * #$evaluationDefn for #$WNAllHypernymDenotsForWordPOSFn-Default
     */
    @LispMethod(comment = "#$evaluationDefn for #$WNAllHypernymDenotsForWordPOSFn-Default")
    public static final SubLObject cyc_wn_all_hypernyms_for_word_unitXpos_alt(SubLObject word_unit, SubLObject pos) {
        com.cyc.cycjava.cycl.evaluation_defns.check_wn_sks_registered();
        return make_el_set(wordnet_utilities.wn_all_hypernyms_for_word_unitXpos(word_unit, pos), UNPROVIDED);
    }

    /**
     * #$evaluationDefn for #$WNAllHypernymDenotsForWordPOSFn-Default
     */
    @LispMethod(comment = "#$evaluationDefn for #$WNAllHypernymDenotsForWordPOSFn-Default")
    public static SubLObject cyc_wn_all_hypernyms_for_word_unitXpos(final SubLObject word_unit, final SubLObject pos) {
        check_wn_sks_registered();
        return make_el_set(wordnet_utilities.wn_all_hypernyms_for_word_unitXpos(word_unit, pos), UNPROVIDED);
    }

    /**
     * #$evaluationDefn for #$WNAllSynonymStringsForWordAndPOSFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$WNAllSynonymStringsForWordAndPOSFn")
    public static final SubLObject cyc_wn_all_synonyms_for_word_unitXpos_alt(SubLObject word_unit, SubLObject pos) {
        com.cyc.cycjava.cycl.evaluation_defns.check_wn_sks_registered();
        return make_el_set(wordnet_utilities.wn_all_synonyms_for_word_unitXpos(word_unit, pos), UNPROVIDED);
    }

    /**
     * #$evaluationDefn for #$WNAllSynonymStringsForWordAndPOSFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$WNAllSynonymStringsForWordAndPOSFn")
    public static SubLObject cyc_wn_all_synonyms_for_word_unitXpos(final SubLObject word_unit, final SubLObject pos) {
        check_wn_sks_registered();
        return make_el_set(wordnet_utilities.wn_all_synonyms_for_word_unitXpos(word_unit, pos), UNPROVIDED);
    }

    /**
     * #$evaluationDefn for #$WNRankedCandidateDenotsForWordPOSFn-Default
     */
    @LispMethod(comment = "#$evaluationDefn for #$WNRankedCandidateDenotsForWordPOSFn-Default")
    public static final SubLObject cyc_wn_ranked_candidate_cycls_for_word_unitXpos_alt(SubLObject word_unit, SubLObject pos) {
        com.cyc.cycjava.cycl.evaluation_defns.check_wn_sks_registered();
        return make_el_list(Mapping.mapcar(MAKE_EL_SET, wordnet_utilities.wn_ranked_candidate_cycls_for_word_unitXpos(word_unit, pos, $STRONG, $COLLECTIONS, UNPROVIDED)), UNPROVIDED);
    }

    /**
     * #$evaluationDefn for #$WNRankedCandidateDenotsForWordPOSFn-Default
     */
    @LispMethod(comment = "#$evaluationDefn for #$WNRankedCandidateDenotsForWordPOSFn-Default")
    public static SubLObject cyc_wn_ranked_candidate_cycls_for_word_unitXpos(final SubLObject word_unit, final SubLObject pos) {
        check_wn_sks_registered();
        return make_el_list(Mapping.mapcar(MAKE_EL_SET, wordnet_utilities.wn_ranked_candidate_cycls_for_word_unitXpos(word_unit, pos, $STRONG, $COLLECTIONS, UNPROVIDED)), UNPROVIDED);
    }

    /**
     * #$evaluationDefn for #$WNRankedHypernymDenotsForWordPOSFn-Default
     */
    @LispMethod(comment = "#$evaluationDefn for #$WNRankedHypernymDenotsForWordPOSFn-Default")
    public static final SubLObject cyc_wn_ranked_hypernyms_for_word_unitXpos_alt(SubLObject word_unit, SubLObject pos) {
        com.cyc.cycjava.cycl.evaluation_defns.check_wn_sks_registered();
        return make_el_list(Mapping.mapcar(MAKE_EL_SET, wordnet_utilities.wn_ranked_hypernyms_for_word_unitXpos(word_unit, pos)), UNPROVIDED);
    }

    /**
     * #$evaluationDefn for #$WNRankedHypernymDenotsForWordPOSFn-Default
     */
    @LispMethod(comment = "#$evaluationDefn for #$WNRankedHypernymDenotsForWordPOSFn-Default")
    public static SubLObject cyc_wn_ranked_hypernyms_for_word_unitXpos(final SubLObject word_unit, final SubLObject pos) {
        check_wn_sks_registered();
        return make_el_list(Mapping.mapcar(MAKE_EL_SET, wordnet_utilities.wn_ranked_hypernyms_for_word_unitXpos(word_unit, pos)), UNPROVIDED);
    }

    /**
     * #$evaluationDefn for #$WNRankedSynonymStringsForWordAndPOSFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$WNRankedSynonymStringsForWordAndPOSFn")
    public static final SubLObject cyc_wn_ranked_synonyms_for_word_unitXpos_alt(SubLObject word_unit, SubLObject pos) {
        com.cyc.cycjava.cycl.evaluation_defns.check_wn_sks_registered();
        return make_el_list(Mapping.mapcar(MAKE_EL_SET, wordnet_utilities.wn_ranked_synonyms_for_word_unitXpos(word_unit, pos)), UNPROVIDED);
    }

    /**
     * #$evaluationDefn for #$WNRankedSynonymStringsForWordAndPOSFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$WNRankedSynonymStringsForWordAndPOSFn")
    public static SubLObject cyc_wn_ranked_synonyms_for_word_unitXpos(final SubLObject word_unit, final SubLObject pos) {
        check_wn_sks_registered();
        return make_el_list(Mapping.mapcar(MAKE_EL_SET, wordnet_utilities.wn_ranked_synonyms_for_word_unitXpos(word_unit, pos)), UNPROVIDED);
    }

    public static final SubLObject cyc_kb_orthogonal_alt(SubLObject col1, SubLObject col2) {
        if (!((NIL != fort_types_interface.collection_p(col1)) && (NIL != fort_types_interface.collection_p(col2)))) {
            relation_evaluation.throw_unevaluatable();
        }
        return makeBoolean(!(((NIL != genls.genlsP(col1, col2, UNPROVIDED, UNPROVIDED)) || (NIL != genls.genlsP(col2, col1, UNPROVIDED, UNPROVIDED))) || (NIL != disjoint_with.disjoint_withP(col1, col2, UNPROVIDED, UNPROVIDED))));
    }

    public static SubLObject cyc_kb_orthogonal(final SubLObject col1, final SubLObject col2) {
        if ((NIL == fort_types_interface.collection_p(col1)) || (NIL == fort_types_interface.collection_p(col2))) {
            relation_evaluation.throw_unevaluatable();
        }
        return makeBoolean(((NIL == genls.genlsP(col1, col2, UNPROVIDED, UNPROVIDED)) && (NIL == genls.genlsP(col2, col1, UNPROVIDED, UNPROVIDED))) && (NIL == disjoint_with.disjoint_withP(col1, col2, UNPROVIDED, UNPROVIDED)));
    }

    /**
     *
     *
     * @param FILE-PATH
     * 		stringp; a relative/absolute pathname
     * @return stringp
     */
    @LispMethod(comment = "@param FILE-PATH\r\n\t\tstringp; a relative/absolute pathname\r\n@return stringp")
    public static final SubLObject cyc_content_of_file_alt(SubLObject file_path) {
        return file_utilities.slurp_file(file_path);
    }

    /**
     *
     *
     * @param FILE-PATH
     * 		stringp; a relative/absolute pathname
     * @return stringp
     */
    @LispMethod(comment = "@param FILE-PATH\r\n\t\tstringp; a relative/absolute pathname\r\n@return stringp")
    public static SubLObject cyc_content_of_file(final SubLObject file_path) {
        return file_utilities.slurp_file(file_path);
    }

    public static final SubLObject cyc_transform_relation_tuples_alt(SubLObject relation_tuples) {
        {
            SubLObject result = list($$TheList);
            SubLObject cdolist_list_var = relation_tuples.rest();
            SubLObject middle = NIL;
            for (middle = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , middle = cdolist_list_var.first()) {
                {
                    SubLObject middle_new = list($$TheList);
                    SubLObject cdolist_list_var_60 = middle.rest();
                    SubLObject inner = NIL;
                    for (inner = cdolist_list_var_60.first(); NIL != cdolist_list_var_60; cdolist_list_var_60 = cdolist_list_var_60.rest() , inner = cdolist_list_var_60.first()) {
                        middle_new = cons(com.cyc.cycjava.cycl.evaluation_defns.unlist(inner), middle_new);
                    }
                    result = cons(nreverse(middle_new), result);
                }
            }
            return nreverse(result);
        }
    }

    public static SubLObject cyc_transform_relation_tuples(final SubLObject relation_tuples) {
        SubLObject result = list($$TheList);
        SubLObject cdolist_list_var = relation_tuples.rest();
        SubLObject middle = NIL;
        middle = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject middle_new = list($$TheList);
            SubLObject cdolist_list_var_$69 = middle.rest();
            SubLObject inner = NIL;
            inner = cdolist_list_var_$69.first();
            while (NIL != cdolist_list_var_$69) {
                middle_new = cons(unlist(inner), middle_new);
                cdolist_list_var_$69 = cdolist_list_var_$69.rest();
                inner = cdolist_list_var_$69.first();
            } 
            result = cons(nreverse(middle_new), result);
            cdolist_list_var = cdolist_list_var.rest();
            middle = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static final SubLObject unlist_alt(SubLObject list) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!$$TheList.eql(list.first())) {
                    Errors.error($str_alt282$_a_doesn_t_start_with___TheList, list);
                }
            }
            {
                SubLObject operator = cycl_utilities.formula_arg1(list, UNPROVIDED);
                if (NIL != fort_types_interface.functionP(operator)) {
                    return cycl_utilities.formula_args(list, UNPROVIDED);
                } else {
                    if (NIL != fort_types_interface.predicateP(operator)) {
                        return cycl_utilities.formula_args(list, UNPROVIDED);
                    } else {
                        return list;
                    }
                }
            }
        }
    }

    public static SubLObject unlist(final SubLObject list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!$$TheList.eql(list.first()))) {
            Errors.error($str330$_a_doesn_t_start_with___TheList, list);
        }
        final SubLObject operator = cycl_utilities.formula_arg1(list, UNPROVIDED);
        if (NIL != fort_types_interface.functionP(operator)) {
            return cycl_utilities.formula_args(list, UNPROVIDED);
        }
        if (NIL != fort_types_interface.predicateP(operator)) {
            return cycl_utilities.formula_args(list, UNPROVIDED);
        }
        return list;
    }

    public static SubLObject cyc_provable_via_defns(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != el_binary_formula_p(asent)) {
            thread.resetMultipleValues();
            final SubLObject pred = unmake_binary_formula(asent);
            final SubLObject ins = thread.secondMultipleValue();
            final SubLObject col = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            SubLObject result = provable_via_defns_proper(pred, ins, col);
            if ((NIL == result) && (NIL != possibly_naut_p(ins))) {
                final SubLObject pcase_var = pred;
                if (pcase_var.eql($$isa)) {
                    final SubLObject known_cols = kb_accessors.result_isa(cycl_utilities.naut_functor(ins), UNPROVIDED);
                    result = genls.any_specP(col, known_cols, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($$quotedIsa)) {
                        final SubLObject known_cols = kb_accessors.result_quoted_isa(cycl_utilities.naut_functor(ins), UNPROVIDED);
                        result = genls.any_specP(col, known_cols, UNPROVIDED, UNPROVIDED);
                    }

            }
            return result;
        }
        return NIL;
    }

    public static SubLObject provable_via_defns_proper(final SubLObject pred, final SubLObject ins, final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding(thread);
        try {
            at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind(NIL, thread);
            if (pred.eql($$isa)) {
                return at_defns.quiet_defns_admitP(col, ins, UNPROVIDED);
            }
            if (pred.eql($$quotedIsa)) {
                return at_defns.quiet_quoted_defns_admitP(col, ins, UNPROVIDED);
            }
        } finally {
            at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject current_inference_answer_justification_proof_view() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == inference_datastructures_proof.proof_p(inference_strategist.$current_inference_answer_justification_proof_being_cached$.getDynamicValue(thread))) || (NIL == inference_datastructures_inference.inference_answer_p(inference_strategist.$current_inference_answer_being_cached$.getDynamicValue(thread)))) {
            relation_evaluation.throw_unevaluatable();
        }
        return proof_view.proof_view_xml(proof_view.proof_view_get_id(proof_view.construct_inference_proof_view(inference_strategist.$current_inference_answer_justification_proof_being_cached$.getDynamicValue(thread), inference_strategist.$current_inference_answer_being_cached$.getDynamicValue(thread), UNPROVIDED)), UNPROVIDED);
    }

    public static SubLObject cyc_find_object_by_compact_hl_external_id_string(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    result = kb_utilities.maybe_find_object_by_compact_hl_external_id_string(string);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        if (NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }

    public static SubLObject cyc_compact_hl_external_id_string(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    result = kb_utilities.compact_hl_external_id_string(v_object);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        if (NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }

    public static SubLObject cyc_decode_ka_interaction(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    result = kb_utilities.maybe_find_object_by_compact_hl_external_id_string(v_object);
                    if ((NIL == result) && v_object.isString()) {
                        result = make_el_formula($$KAObjectInteractionFn, list(v_object), UNPROVIDED);
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        if (NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }

    public static SubLObject cyc_most_recently_started_events_by_agent_relative_to_interaction_mt_fn(final SubLObject agent, final SubLObject interaction_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    result = most_recently_started_events_by_agent_relative_to_interaction_mt(agent, interaction_mt);
                    if (NIL != result) {
                        result = make_el_list(result, UNPROVIDED);
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        if (NIL == result) {
            result = $$TheEmptyList;
        }
        return result;
    }

    public static SubLObject most_recently_started_events_by_agent_relative_to_interaction_mt(final SubLObject agent, final SubLObject interaction_mt) {
        SubLObject interaction_mts_to_check = list(interaction_mt);
        SubLObject interaction_mts_checked = NIL;
        SubLObject result = NIL;
        while (NIL != interaction_mts_to_check) {
            final SubLObject interaction_mt_to_check = interaction_mts_to_check.first();
            interaction_mts_checked = cons(interaction_mt_to_check, interaction_mts_checked);
            interaction_mts_to_check = interaction_mts_to_check.rest();
            final SubLObject executed_events = executed_events_for_agent_in_interaction_mt(agent, interaction_mt_to_check);
            if (NIL != executed_events) {
                SubLObject cdolist_list_var = executed_events;
                SubLObject executed_event = NIL;
                executed_event = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    result = cons(executed_event, result);
                    cdolist_list_var = cdolist_list_var.rest();
                    executed_event = cdolist_list_var.first();
                } 
            } else {
                SubLObject cdolist_list_var2;
                final SubLObject prior_mts = cdolist_list_var2 = remove_duplicates(append(kb_mapping_utilities.pred_values(interaction_mt_to_check, $$laterOrSameInteractionHistoryMt, TWO_INTEGER, ONE_INTEGER, UNPROVIDED), kb_mapping_utilities.pred_values(interaction_mt_to_check, $$laterInteractionHistoryMt, TWO_INTEGER, ONE_INTEGER, UNPROVIDED), kb_mapping_utilities.pred_values(interaction_mt_to_check, $$laterInteractionHistoryMt_Direct, TWO_INTEGER, ONE_INTEGER, UNPROVIDED), kb_mapping_utilities.pred_values(interaction_mt_to_check, $const343$laterInteractionHistoryMtForSimul, TWO_INTEGER, ONE_INTEGER, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject prior_mt = NIL;
                prior_mt = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    if (NIL == list_utilities.member_kbeqP(prior_mt, interaction_mts_checked)) {
                        interaction_mts_to_check = cons(prior_mt, interaction_mts_to_check);
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    prior_mt = cdolist_list_var2.first();
                } 
            }
        } 
        if ((NIL != result) && (NIL == list_utilities.singletonP(result))) {
            Errors.warn($str344$More_than_one_recently_started_ev, agent, interaction_mt, result);
        }
        return result;
    }

    public static SubLObject executed_events_for_agent_in_interaction_mt(final SubLObject agent, final SubLObject interaction_mt) {
        final SubLObject planned_events = kb_mapping_utilities.pred_values(interaction_mt, $const345$executionOfPlannedEventBeginsInCo, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
        SubLObject executed_events = NIL;
        SubLObject cdolist_list_var = planned_events;
        SubLObject planned_event = NIL;
        planned_event = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$70 = kb_mapping_utilities.pred_values(planned_event, $$executionOfPlannedEvent, ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
            SubLObject executed_event = NIL;
            executed_event = cdolist_list_var_$70.first();
            while (NIL != cdolist_list_var_$70) {
                if (NIL != kb_mapping_utilities.pred_u_v_holds($$performedByInBELLAUI, executed_event, agent, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    executed_events = cons(executed_event, executed_events);
                }
                cdolist_list_var_$70 = cdolist_list_var_$70.rest();
                executed_event = cdolist_list_var_$70.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            planned_event = cdolist_list_var.first();
        } 
        return executed_events;
    }

    public static SubLObject executed_unfinished_events_for_agent_in_interaction_mt(final SubLObject agent, final SubLObject interaction_mt, SubLObject perspective_mt) {
        if (perspective_mt == UNPROVIDED) {
            perspective_mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject planned_events = kb_mapping_utilities.pred_values(interaction_mt, $const345$executionOfPlannedEventBeginsInCo, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
        SubLObject executed_events = NIL;
        SubLObject cdolist_list_var = planned_events;
        SubLObject planned_event = NIL;
        planned_event = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$71 = kb_mapping_utilities.pred_values(planned_event, $$executionOfPlannedEvent, ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
            SubLObject executed_event = NIL;
            executed_event = cdolist_list_var_$71.first();
            while (NIL != cdolist_list_var_$71) {
                if (NIL != kb_mapping_utilities.pred_u_v_holds($$performedByInBELLAUI, executed_event, agent, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    if (NIL != perspective_mt) {
                        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(perspective_mt);
                        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            if ((NIL == kb_mapping_utilities.pred_values(executed_event, $$finishedEvent, ONE_INTEGER, ONE_INTEGER, UNPROVIDED)) && (NIL == kb_mapping_utilities.pred_values(executed_event, $$mistakenEvent, ONE_INTEGER, ONE_INTEGER, UNPROVIDED))) {
                                executed_events = cons(executed_event, executed_events);
                            }
                        } finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                        }
                    } else
                        if ((NIL == kb_mapping_utilities.pred_values(executed_event, $$finishedEvent, ONE_INTEGER, ONE_INTEGER, UNPROVIDED)) && (NIL == kb_mapping_utilities.pred_values(executed_event, $$mistakenEvent, ONE_INTEGER, ONE_INTEGER, UNPROVIDED))) {
                            executed_events = cons(executed_event, executed_events);
                        }

                }
                cdolist_list_var_$71 = cdolist_list_var_$71.rest();
                executed_event = cdolist_list_var_$71.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            planned_event = cdolist_list_var.first();
        } 
        return executed_events;
    }

    public static SubLObject cyc_most_recently_started_unfinish_events_by_agent_relative_to_interaction_mt_fn(final SubLObject agent, final SubLObject interaction_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    result = most_recently_started_unfinished_events_by_agent_relative_to_interaction_mt(agent, interaction_mt);
                    if (NIL != result) {
                        result = make_el_list(result, UNPROVIDED);
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        if (NIL == result) {
            result = $$TheEmptyList;
        }
        return result;
    }

    public static SubLObject most_recently_started_unfinished_events_by_agent_relative_to_interaction_mt(final SubLObject agent, final SubLObject interaction_mt) {
        SubLObject interaction_mts_to_check = list(interaction_mt);
        SubLObject interaction_mts_checked = NIL;
        SubLObject result = NIL;
        while (NIL != interaction_mts_to_check) {
            final SubLObject interaction_mt_to_check = interaction_mts_to_check.first();
            interaction_mts_checked = cons(interaction_mt_to_check, interaction_mts_checked);
            interaction_mts_to_check = interaction_mts_to_check.rest();
            final SubLObject executed_unfinished_events = executed_unfinished_events_for_agent_in_interaction_mt(agent, interaction_mt_to_check, interaction_mt);
            if (NIL != executed_unfinished_events) {
                SubLObject cdolist_list_var = executed_unfinished_events;
                SubLObject event = NIL;
                event = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    result = cons(event, result);
                    cdolist_list_var = cdolist_list_var.rest();
                    event = cdolist_list_var.first();
                } 
            } else {
                SubLObject cdolist_list_var2;
                final SubLObject prior_mts = cdolist_list_var2 = remove_duplicates(append(kb_mapping_utilities.pred_values(interaction_mt_to_check, $$laterOrSameInteractionHistoryMt, TWO_INTEGER, ONE_INTEGER, UNPROVIDED), kb_mapping_utilities.pred_values(interaction_mt_to_check, $$laterInteractionHistoryMt, TWO_INTEGER, ONE_INTEGER, UNPROVIDED), kb_mapping_utilities.pred_values(interaction_mt_to_check, $$laterInteractionHistoryMt_Direct, TWO_INTEGER, ONE_INTEGER, UNPROVIDED), kb_mapping_utilities.pred_values(interaction_mt_to_check, $const343$laterInteractionHistoryMtForSimul, TWO_INTEGER, ONE_INTEGER, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject prior_mt = NIL;
                prior_mt = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    if (NIL == list_utilities.member_kbeqP(prior_mt, interaction_mts_checked)) {
                        interaction_mts_to_check = cons(prior_mt, interaction_mts_to_check);
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    prior_mt = cdolist_list_var2.first();
                } 
            }
        } 
        if ((NIL != result) && (NIL == list_utilities.singletonP(result))) {
            Errors.warn($str344$More_than_one_recently_started_ev, agent, interaction_mt, result);
        }
        return result;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeSymbol("ASSERTED-WHEN"));

    static private final SubLSymbol $sym9$CHAR_ = makeSymbol("CHAR=");

    static private final SubLString $str_alt16$Could_not_find_constant__A_ = makeString("Could not find constant ~A.");

    static private final SubLString $str_alt17$Arg1_of___FindConstantFn_must_be_ = makeString("Arg1 of #$FindConstantFn must be a string: ~A.");

    public static SubLObject cyc_event_to_plan_for_by_agent_in_interaction_context_fn(final SubLObject agent, final SubLObject interaction_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    result = event_to_plan_for_by_agent_in_interaction_context(agent, interaction_mt);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        if (NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }

    static private final SubLList $list_alt23 = list(makeSymbol("CYC-STRING-UPCASE"));

    static private final SubLString $str_alt30$_ = makeString(" ");

    static private final SubLSymbol $sym34$__ = makeSymbol("<=");

    public static SubLObject event_to_plan_for_by_agent_in_interaction_context(final SubLObject agent, final SubLObject interaction_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(interaction_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject most_recently_started_unfinished_events = most_recently_started_unfinished_events_by_agent_relative_to_interaction_mt(agent, interaction_mt);
            SubLObject result = NIL;
            SubLObject cdolist_list_var = most_recently_started_unfinished_events;
            SubLObject event = NIL;
            event = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((NIL == kb_mapping_utilities.pred_values(event, $$finishedEvent, ONE_INTEGER, ONE_INTEGER, UNPROVIDED)) && (NIL == kb_mapping_utilities.pred_values(event, $$mistakenEvent, ONE_INTEGER, ONE_INTEGER, UNPROVIDED))) {
                    SubLObject subevents_of_event_were_planned_in_previous_contextP = NIL;
                    SubLObject cdolist_list_var_$72 = Mapping.mapcar(GAF_ARG3, kb_mapping_utilities.pred_u_v_holds_gafs($const353$agentShouldAttemptToFindModelForE, agent, event, ONE_INTEGER, TWO_INTEGER, UNPROVIDED));
                    SubLObject possible_prior_mt = NIL;
                    possible_prior_mt = cdolist_list_var_$72.first();
                    while (NIL != cdolist_list_var_$72) {
                        if (NIL != ghl_search_methods.ghl_predicate_relation_p($$laterInteractionHistoryMt, possible_prior_mt, interaction_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            subevents_of_event_were_planned_in_previous_contextP = T;
                        }
                        cdolist_list_var_$72 = cdolist_list_var_$72.rest();
                        possible_prior_mt = cdolist_list_var_$72.first();
                    } 
                    if (NIL == subevents_of_event_were_planned_in_previous_contextP) {
                        result = cons(event, result);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                event = cdolist_list_var.first();
            } 
            if (NIL != list_utilities.singletonP(result)) {
                return result.first();
            }
            if (NIL == result) {
                return NIL;
            }
            Errors.warn($str354$More_that_one_event_found_for__Ev, agent, interaction_mt, result);
            return result.first();
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
    }

    static private final SubLString $str_alt43$_ = makeString(",");

    static private final SubLList $list_alt53 = list(new SubLObject[]{ makeSymbol("&KEY"), makeSymbol("ID"), makeSymbol("CLASS"), makeSymbol("ISMAP"), makeSymbol("HEIGHT"), makeSymbol("WIDTH"), makeSymbol("ALT"), makeSymbol("ALIGN"), makeSymbol("BORDER") });

    static private final SubLList $list_alt54 = list(makeKeyword("ID"), makeKeyword("CLASS"), makeKeyword("ISMAP"), makeKeyword("HEIGHT"), makeKeyword("WIDTH"), makeKeyword("ALT"), makeKeyword("ALIGN"), makeKeyword("BORDER"));

    static private final SubLList $list_alt65 = list(new SubLObject[]{ makeSymbol("&KEY"), makeSymbol("NOWRAP"), makeSymbol("COLSPAN"), makeSymbol("ROWSPAN"), makeSymbol("ALIGN"), makeSymbol("VALIGN"), makeSymbol("BGCOLOR"), makeSymbol("WIDTH"), makeSymbol("HEIGHT"), makeSymbol("ID") });

    static private final SubLList $list_alt66 = list(new SubLObject[]{ makeKeyword("NOWRAP"), makeKeyword("COLSPAN"), makeKeyword("ROWSPAN"), makeKeyword("ALIGN"), makeKeyword("VALIGN"), makeKeyword("BGCOLOR"), makeKeyword("WIDTH"), makeKeyword("HEIGHT"), makeKeyword("ID") });

    static private final SubLList $list_alt73 = cons(makeSymbol("OPTIONS"), makeSymbol("CONTENT"));

    static private final SubLList $list_alt75 = list(makeSymbol("&KEY"), makeSymbol("ALIGN"), makeSymbol("VALIGN"), makeSymbol("BGCOLOR"), makeSymbol("HEIGHT"));

    static private final SubLList $list_alt76 = list(makeKeyword("ALIGN"), makeKeyword("VALIGN"), makeKeyword("BGCOLOR"), makeKeyword("HEIGHT"));

    static private final SubLList $list_alt78 = cons(makeSymbol("OPTIONS"), makeSymbol("DATA"));

    static private final SubLList $list_alt80 = list(new SubLObject[]{ makeSymbol("&KEY"), makeSymbol("NOFLOW"), makeSymbol("NOWRAP"), makeSymbol("ALIGN"), makeSymbol("BORDER"), makeSymbol("CELLPADDING"), makeSymbol("CELLSPACING"), makeSymbol("COLSPEC"), makeSymbol("UNITS"), makeSymbol("BGCOLOR"), makeSymbol("WIDTH"), makeSymbol("BACKGROUND") });

    public static SubLObject cyc_plan_agent_should_execute_in_interaction_context_fn(final SubLObject agent, final SubLObject interaction_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    result = plan_agent_should_execute_in_interaction_context(agent, interaction_mt);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        if (NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }

    static private final SubLList $list_alt81 = list(new SubLObject[]{ makeKeyword("NOFLOW"), makeKeyword("NOWRAP"), makeKeyword("ALIGN"), makeKeyword("BORDER"), makeKeyword("CELLPADDING"), makeKeyword("CELLSPACING"), makeKeyword("COLSPEC"), makeKeyword("UNITS"), makeKeyword("BGCOLOR"), makeKeyword("WIDTH"), makeKeyword("BACKGROUND") });

    static private final SubLList $list_alt90 = list(makeSymbol("&KEY"), makeSymbol("ID"), makeSymbol("CLASS"), makeSymbol("STYLE"), makeSymbol("ONLOAD"));

    static private final SubLList $list_alt91 = list(makeKeyword("ID"), makeKeyword("CLASS"), makeKeyword("STYLE"), makeKeyword("ONLOAD"));

    static private final SubLList $list_alt96 = list(makeSymbol("EL-ATTRIBUTE"), makeSymbol("EL-VALUE"));

    static private final SubLList $list_alt97 = list(reader_make_constant_shell("SubLQuoteFn"), makeKeyword("ANYTHING"));

    public static SubLObject earlier_mt_or_abandonedP(final SubLObject test_mt, final SubLObject interaction_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(interaction_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if ((NIL != ghl_search_methods.ghl_predicate_relation_p($$laterInteractionHistoryMt, test_mt, interaction_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != kb_mapping_utilities.pred_values(test_mt, $$interactionContextAbandonedAtDate, ONE_INTEGER, UNPROVIDED, UNPROVIDED))) {
                return T;
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    static private final SubLList $list_alt98 = list(reader_make_constant_shell("Percent"), makeKeyword("ANYTHING"));

    static private final SubLString $str_alt99$_ = makeString("%");

    public static SubLObject plan_agent_should_execute_in_interaction_context(final SubLObject agent, final SubLObject interaction_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != event_to_plan_for_by_agent_in_interaction_context(agent, interaction_mt)) {
            return NIL;
        }
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(interaction_mt, thread);
            if (NIL != kb_mapping_utilities.pred_values(agent, $$eventModeledByPlannedByAtDate, THREE_INTEGER, FIVE_INTEGER, UNPROVIDED)) {
                return NIL;
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        final SubLObject most_recently_started_events = most_recently_started_events_by_agent_relative_to_interaction_mt(agent, interaction_mt);
        SubLObject some_earlier_event_unfinishedP = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(interaction_mt);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_4 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_5 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (NIL == some_earlier_event_unfinishedP) {
                SubLObject csome_list_var = most_recently_started_events;
                SubLObject event = NIL;
                event = csome_list_var.first();
                while ((NIL == some_earlier_event_unfinishedP) && (NIL != csome_list_var)) {
                    if ((NIL == kb_mapping_utilities.fpred_value(event, $$finishedEvent, ONE_INTEGER, ONE_INTEGER, UNPROVIDED)) && (NIL == kb_mapping_utilities.fpred_value(event, $$mistakenEvent, ONE_INTEGER, ONE_INTEGER, UNPROVIDED))) {
                        some_earlier_event_unfinishedP = T;
                    }
                    if (NIL == some_earlier_event_unfinishedP) {
                        final SubLObject start_mts = kb_mapping_utilities.pred_values(event, $$startedInMt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL == some_earlier_event_unfinishedP) {
                            SubLObject csome_list_var_$73 = start_mts;
                            SubLObject start_mt = NIL;
                            start_mt = csome_list_var_$73.first();
                            while ((NIL == some_earlier_event_unfinishedP) && (NIL != csome_list_var_$73)) {
                                if (NIL == earlier_mt_or_abandonedP(start_mt, interaction_mt)) {
                                    some_earlier_event_unfinishedP = T;
                                }
                                csome_list_var_$73 = csome_list_var_$73.rest();
                                start_mt = csome_list_var_$73.first();
                            } 
                        }
                    }
                    if (NIL == some_earlier_event_unfinishedP) {
                        final SubLObject finish_mts = append(kb_mapping_utilities.pred_values(event, $$finishedInMt, UNPROVIDED, UNPROVIDED, UNPROVIDED), kb_mapping_utilities.pred_values(event, $$mistakenInMt, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                        if (NIL == some_earlier_event_unfinishedP) {
                            SubLObject csome_list_var_$74 = finish_mts;
                            SubLObject finish_mt = NIL;
                            finish_mt = csome_list_var_$74.first();
                            while ((NIL == some_earlier_event_unfinishedP) && (NIL != csome_list_var_$74)) {
                                if (NIL == earlier_mt_or_abandonedP(finish_mt, interaction_mt)) {
                                    some_earlier_event_unfinishedP = T;
                                }
                                csome_list_var_$74 = csome_list_var_$74.rest();
                                finish_mt = csome_list_var_$74.first();
                            } 
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    event = csome_list_var.first();
                } 
            }
            if ((NIL == some_earlier_event_unfinishedP) && (!kb_indexing.num_predicate_extent_index($$finishedEvent, interaction_mt).isZero())) {
                some_earlier_event_unfinishedP = T;
            }
            if (NIL == some_earlier_event_unfinishedP) {
                final SubLObject highest_priority_item_on_agenda = highest_priority_item_on_agenda_for_agent_in_interaction_context(agent, interaction_mt);
                if (NIL == kb_mapping_utilities.pred_values(highest_priority_item_on_agenda, $const345$executionOfPlannedEventBeginsInCo, ONE_INTEGER, ONE_INTEGER, UNPROVIDED)) {
                    return highest_priority_item_on_agenda;
                }
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_5, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_4, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
        }
        thread.resetMultipleValues();
        final SubLObject new_plan = highest_priority_item_on_agenda_for_agent_in_interaction_context(agent, interaction_mt);
        final SubLObject new_plan_priority = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = most_recently_started_events;
        SubLObject executed_event = NIL;
        executed_event = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject plans = kb_mapping_utilities.pred_values(executed_event, $$executionOfPlannedEvent, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
            final SubLObject agendas = kb_mapping_utilities.pred_values(agent, $$agentAgenda, ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
            final SubLObject v_agenda = agendas.first();
            if ((NIL != v_agenda) && (NIL == list_utilities.singletonP(agendas))) {
                Errors.warn($str363$More_than_one_agenda_found_for__H, agent, interaction_mt, agendas);
            }
            SubLObject cdolist_list_var_$75 = plans;
            SubLObject plan = NIL;
            plan = cdolist_list_var_$75.first();
            while (NIL != cdolist_list_var_$75) {
                final SubLObject plan_priorities = remove_duplicates(Mapping.mapcar(GAF_ARG3, kb_mapping_utilities.pred_u_v_holds_gafs($$agendaHasTaskWithPriority, v_agenda, plan, ONE_INTEGER, TWO_INTEGER, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                final SubLObject plan_priority = apply(MAX, plan_priorities);
                if ((NIL != plan_priority) && (NIL == list_utilities.singletonP(plan_priorities))) {
                    Errors.warn($str366$More_than_one_priority_found_for_, v_agenda, plan, plan_priorities);
                }
                if (new_plan_priority.numG(plan_priority)) {
                    return new_plan;
                }
                cdolist_list_var_$75 = cdolist_list_var_$75.rest();
                plan = cdolist_list_var_$75.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            executed_event = cdolist_list_var.first();
        } 
        return NIL;
    }

    static private final SubLSymbol $sym116$SYMMETRIC_PART_TYPE_ = makeSymbol("SYMMETRIC-PART-TYPE?");

    static private final SubLSymbol $sym126$_SIDEFN = makeSymbol("?SIDEFN");

    static private final SubLList $list_alt142 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER);

    static private final SubLSymbol $sym145$_OBJ = makeSymbol("?OBJ");

    static private final SubLSymbol $sym150$INDIVIDUAL_DENOTING_FN_ = makeSymbol("INDIVIDUAL-DENOTING-FN?");

    private static final SubLSymbol UNARY_FUNCTION_ = makeSymbol("UNARY-FUNCTION?");

    private static final SubLSymbol SKOLEM_FUNCTION_ = makeSymbol("SKOLEM-FUNCTION?");

    public static final SubLSymbol $kw164$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLList $list_alt168 = list(reader_make_constant_shell("BestNLPhraseOfStringFn"), makeString(","));

    public static final SubLObject $$TermParaphraseFn_Constrained = reader_make_constant_shell("TermParaphraseFn-Constrained");



    static private final SubLSymbol $sym178$_ = makeSymbol("<");

    static private final SubLString $str_alt180$charset_utf_8 = makeString("charset=utf-8");

    static private final SubLString $str_alt189$simple_http_get = makeString("simple-http-get");

    public static final SubLSymbol $kw191$KEEP_ALIVE_ = makeKeyword("KEEP-ALIVE?");

    public static final SubLSymbol $kw192$WIDE_NEWLINES_ = makeKeyword("WIDE-NEWLINES?");

    static private final SubLString $str_alt195$_ = makeString("\"");

    static private final SubLString $str_alt196$_ = makeString("&");

    static private final SubLString $str_alt198$_ = makeString("<");

    static private final SubLString $str_alt199$_ = makeString(">");

    public static SubLObject cyc_agent_cannot_progress_in_interaction_context_fn(final SubLObject agent, final SubLObject interaction_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    result = agent_cannot_progress_in_interaction_context(agent, interaction_mt);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        if (NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }

    static private final SubLList $list_alt204 = list(makeKeyword("ALLOWED-MODULES"), list(makeKeyword("NOT"), list(makeKeyword("MODULE-SUBTYPE"), $SKSI)));

    static private final SubLList $list_alt212 = list(makeKeyword("BASE-SET"));

    static private final SubLList $list_alt215 = list(makeKeyword("ORDERING-RELATION"));

    public static SubLObject agent_cannot_progress_in_interaction_context(final SubLObject agent, final SubLObject interaction_mt) {
        if (NIL != event_to_plan_for_by_agent_in_interaction_context(agent, interaction_mt)) {
            return $$False;
        }
        if (NIL != plan_agent_should_execute_in_interaction_context(agent, interaction_mt)) {
            return $$False;
        }
        return $$True;
    }

    static private final SubLSymbol $sym219$ORDERING__ = makeSymbol("ORDERING-<");



    private static final SubLSymbol CYC_STRING_TO_SUBSTANCE_TYPE = makeSymbol("CYC-STRING-TO-SUBSTANCE-TYPE");

    public static SubLObject cyc_highest_priority_item_on_agenda_for_agent_in_interaction_context_fn(final SubLObject agent, final SubLObject interaction_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    result = highest_priority_item_on_agenda_for_agent_in_interaction_context(agent, interaction_mt);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        if (NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }

    private static final SubLSymbol NON_SPACE_CHAR_P = makeSymbol("NON-SPACE-CHAR-P");

    static private final SubLString $str_alt223$The_string_must_have_precisely_2_ = makeString("The string must have precisely 2 words.");





    private static final SubLSymbol CYC_NAME_TO_IONIC_COMPOUND = makeSymbol("CYC-NAME-TO-IONIC-COMPOUND");

    static private final SubLSymbol $sym235$_ = makeSymbol(">");

    public static SubLObject highest_priority_item_on_agenda_for_agent_in_interaction_context(final SubLObject agent, final SubLObject interaction_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(interaction_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject todo_mts = Mapping.mapcar(GAF_ARG2, kb_mapping_utilities.pred_u_v_holds_gafs($const372$agentToDoMtAndHistoryCoincideAtDa, agent, interaction_mt, ONE_INTEGER, THREE_INTEGER, UNPROVIDED));
            final SubLObject agendas = kb_mapping_utilities.pred_values(agent, $$agentAgenda, ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
            final SubLObject todo_mt = todo_mts.first();
            final SubLObject v_agenda = agendas.first();
            if ((NIL != todo_mt) && (NIL == list_utilities.singletonP(todo_mts))) {
                Errors.warn($str373$More_than_one_todo_mt_found_for__, agent, interaction_mt, todo_mts);
            }
            if ((NIL != v_agenda) && (NIL == list_utilities.singletonP(agendas))) {
                Errors.warn($str363$More_than_one_agenda_found_for__H, agent, interaction_mt, agendas);
            }
            if ((NIL != todo_mt) && (NIL != v_agenda)) {
                return highest_priority_item_on_agenda_in_to_do_mt(v_agenda, todo_mt);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    static private final SubLString $str_alt238$_TEXT_ = makeString("<TEXT>");

    static private final SubLString $str_alt239$__TEXT_ = makeString("</TEXT>");

    static private final SubLString $str_alt240$_b_ = makeString("<b>");

    static private final SubLString $str_alt241$__b_ = makeString("</b>");

    static private final SubLString $str_alt243$_____ = makeString(" ... ");

    static private final SubLString $str_alt247$term____isg_table_lock = makeString("term -> isg table lock");

    static private final SubLString $str_alt250$term____isg_w__start_table_lock = makeString("term -> isg w/ start table lock");

    static private final SubLSymbol $sym251$_TERM_TO_ISG_W_START_TABLE_ = makeSymbol("*TERM-TO-ISG-W/START-TABLE*");

    private static final SubLSymbol UNICODE_NAUT_P = makeSymbol("UNICODE-NAUT-P");

    static private final SubLString $$$pace = makeString("pace");

    static private final SubLList $list_alt266 = list(list(list(list(makeString("foo"), makeString("bar"))), makeString("foobar")), list(list(list(list(reader_make_constant_shell("UnicodeStringFn"), makeString("for debts not exceeding &ua3;5,000")), makeString(" or more"))), list(reader_make_constant_shell("UnicodeStringFn"), makeString("for debts not exceeding &ua3;5,000 or more"))), list(list(list(makeString("as well as "), list(reader_make_constant_shell("UnicodeStringFn"), makeString("for debts not exceeding &ua3;5,000")))), list(reader_make_constant_shell("UnicodeStringFn"), makeString("as well as for debts not exceeding &ua3;5,000"))), list(list(list(list(reader_make_constant_shell("UnicodeStringFn"), makeString("for debts not exceeding &ua3;5,000")), list(reader_make_constant_shell("UnicodeStringFn"), makeString(" or &ua3;6,000")))), list(reader_make_constant_shell("UnicodeStringFn"), makeString("for debts not exceeding &ua3;5,000 or &ua3;6,000"))), list(list(list(makeString("&quot;"), makeString("US Designates Al Akhtar Trust"), makeString("&quot;"))), makeString("&quot;US Designates Al Akhtar Trust&quot;")));

    public static SubLObject cyc_highest_priority_item_on_agenda_in_to_do_mt_fn(final SubLObject v_agenda, final SubLObject todo_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    result = highest_priority_item_on_agenda_in_to_do_mt(v_agenda, todo_mt);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        if (NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }

    public static final SubLObject $const268$WordNet2_0_KS = reader_make_constant_shell("WordNet2_0-KS");

    public static SubLObject highest_priority_item_on_agenda_in_to_do_mt(final SubLObject v_agenda, final SubLObject todo_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(todo_mt, thread);
            final SubLObject task_priority_pairs = kb_mapping_utilities.pred_value_tuples(v_agenda, $$agendaHasTaskWithPriority, ONE_INTEGER, $list375, UNPROVIDED);
            if (NIL != task_priority_pairs) {
                final SubLObject task_priority_pair = Sort.sort(task_priority_pairs, $sym290$_, SECOND).first();
                return values(task_priority_pair.first(), second(task_priority_pair));
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    static private final SubLSymbol $sym270$CYC_WN_ALL_CANDIDATE_CYCLS_FOR_WORD_UNIT_POS = makeSymbol("CYC-WN-ALL-CANDIDATE-CYCLS-FOR-WORD-UNIT&POS");

    static private final SubLSymbol $sym271$CYC_WN_ALL_HYPERNYMS_FOR_WORD_UNIT_POS = makeSymbol("CYC-WN-ALL-HYPERNYMS-FOR-WORD-UNIT&POS");

    static private final SubLSymbol $sym272$CYC_WN_ALL_SYNONYMS_FOR_WORD_UNIT_POS = makeSymbol("CYC-WN-ALL-SYNONYMS-FOR-WORD-UNIT&POS");

    static private final SubLSymbol $sym276$CYC_WN_RANKED_CANDIDATE_CYCLS_FOR_WORD_UNIT_POS = makeSymbol("CYC-WN-RANKED-CANDIDATE-CYCLS-FOR-WORD-UNIT&POS");

    static private final SubLSymbol $sym277$CYC_WN_RANKED_HYPERNYMS_FOR_WORD_UNIT_POS = makeSymbol("CYC-WN-RANKED-HYPERNYMS-FOR-WORD-UNIT&POS");

    static private final SubLSymbol $sym278$CYC_WN_RANKED_SYNONYMS_FOR_WORD_UNIT_POS = makeSymbol("CYC-WN-RANKED-SYNONYMS-FOR-WORD-UNIT&POS");

    public static SubLObject cyc_likelihood_of_truth_of_sentence(final SubLObject sent, final SubLObject mt) {
        if (!sent.isList()) {
            relation_evaluation.throw_unevaluatable();
        }
        if (NIL == isa.isaP(mt, $$Microtheory, UNPROVIDED, UNPROVIDED)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject result = temporal_projection.likelihood_of_truth_of_sentence(sent, mt, UNPROVIDED);
        if (NIL != result) {
            return result;
        }
        relation_evaluation.throw_unevaluatable();
        return NIL;
    }

    static private final SubLString $str_alt282$_a_doesn_t_start_with___TheList = makeString("~a doesn't start with #$TheList");

    public static SubLObject cyc_time_intervals_for_sentence(final SubLObject sent, final SubLObject mt) {
        if (!sent.isList()) {
            relation_evaluation.throw_unevaluatable();
        }
        if (NIL == isa.isaP(mt, $$Microtheory, UNPROVIDED, UNPROVIDED)) {
            relation_evaluation.throw_unevaluatable();
        }
        SubLObject result = Mapping.mapcar(symbol_function(FORMULA_ARG0), temporal_projection.time_intervals_for_sentence(sent, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        if (NIL != result) {
            result = cons($$TheSet, result);
            return result;
        }
        relation_evaluation.throw_unevaluatable();
        return NIL;
    }

    public static SubLObject cyc_evaluate_math_expression(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject error_message = NIL;
        thread.resetMultipleValues();
        final SubLObject result = math_expression_utilities.math_expression_evaluate(expression);
        final SubLObject reason = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        if (NIL != error_message) {
            Errors.warn($str381$math_expression_evaluate_error___, error_message);
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }

    public static SubLObject cyc_flatten_math_expression(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject error_message = NIL;
        thread.resetMultipleValues();
        final SubLObject result = math_expression_utilities.math_expression_flatten(expression);
        final SubLObject reason = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        if (NIL != error_message) {
            Errors.warn($str383$math_expression_flatten_error___A, error_message);
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }

    public static SubLObject cyc_apply_operation_to_math_statement(final SubLObject statement, final SubLObject operation, final SubLObject v_term) {
        final SubLObject result = math_expression_utilities.apply_operation_to_math_statement(statement, operation, v_term);
        if (NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }

    public static SubLObject cyc_serialize_mathml(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    final SubLObject _prev_bind_0_$76 = xml_vars.$xml_stream$.currentBinding(thread);
                    try {
                        xml_vars.$xml_stream$.bind(NIL, thread);
                        try {
                            xml_vars.$xml_stream$.setDynamicValue(make_private_string_output_stream(), thread);
                            mathml.serialize_mathml(expression);
                            result = get_output_stream_string(xml_vars.$xml_stream$.getDynamicValue(thread));
                        } finally {
                            final SubLObject _prev_bind_0_$77 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                close(xml_vars.$xml_stream$.getDynamicValue(thread), UNPROVIDED);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$77, thread);
                            }
                        }
                    } finally {
                        xml_vars.$xml_stream$.rebind(_prev_bind_0_$76, thread);
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        if (NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }

    public static SubLObject cyc_cartesian_product(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == el_list_p(expression)) {
            relation_evaluation.throw_unevaluatable();
        }
        SubLObject result = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    final SubLObject input_el_sets = el_list_items(expression);
                    final SubLObject input_hl_sets = Mapping.mapcar(symbol_function(EXTENSIONAL_SET_ELEMENTS), input_el_sets);
                    final SubLObject hl_cartesian_product = list_utilities.cartesian_product(input_hl_sets, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    final SubLObject result_el_lists = Mapping.mapcar(symbol_function(MAKE_EL_LIST), hl_cartesian_product);
                    result = make_el_extensional_set(result_el_lists);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        if (NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }

    public static SubLObject cyc_filter_list(final SubLObject unary_pred, final SubLObject el_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == el_list_p(el_list)) {
            relation_evaluation.throw_unevaluatable();
        }
        SubLObject result = NIL;
        final SubLObject items = el_list_items(el_list);
        SubLObject filtered_items = NIL;
        SubLObject cdolist_list_var = items;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        if (NIL != inference_kernel.new_cyc_query(list(unary_pred, item), mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED)) {
                            filtered_items = cons(item, filtered_items);
                        }
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
            } finally {
                thread.throwStack.pop();
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        result = make_el_list(nreverse(filtered_items), UNPROVIDED);
        if (NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }

    public static final SubLObject declare_evaluation_defns_file_alt() {
        declareFunction("evaluatable_predicate_count", "EVALUATABLE-PREDICATE-COUNT", 0, 0, false);
        declareFunction("cyc_true_subl", "CYC-TRUE-SUBL", 1, 0, false);
        declareFunction("cyc_different", "CYC-DIFFERENT", 1, 0, false);
        new com.cyc.cycjava.cycl.evaluation_defns.$cyc_different$UnaryFunction();
        declareFunction("cyc_different_symbols", "CYC-DIFFERENT-SYMBOLS", 1, 0, false);
        declareFunction("cyc_substring_predicate", "CYC-SUBSTRING-PREDICATE", 2, 0, false);
        declareFunction("cyc_substring_case_insensitive_predicate", "CYC-SUBSTRING-CASE-INSENSITIVE-PREDICATE", 2, 0, false);
        declareFunction("cyc_substring_predicate_internal", "CYC-SUBSTRING-PREDICATE-INTERNAL", 3, 0, false);
        declareFunction("cyc_prefix_substring", "CYC-PREFIX-SUBSTRING", 2, 0, false);
        declareFunction("cyc_suffix_substring", "CYC-SUFFIX-SUBSTRING", 2, 0, false);
        declareFunction("cyc_subword_predicate", "CYC-SUBWORD-PREDICATE", 2, 0, false);
        declareFunction("cyc_find_constant", "CYC-FIND-CONSTANT", 1, 0, false);
        declareFunction("evaluatable_function_count", "EVALUATABLE-FUNCTION-COUNT", 0, 0, false);
        declareFunction("cyc_evaluate_subl", "CYC-EVALUATE-SUBL", 1, 0, false);
        declareFunction("cyc_string_upcase", "CYC-STRING-UPCASE", 1, 0, false);
        declareFunction("string_upcase_defn", "STRING-UPCASE-DEFN", 1, 0, false);
        declareFunction("cyc_string_downcase", "CYC-STRING-DOWNCASE", 1, 0, false);
        declareFunction("cyc_substring", "CYC-SUBSTRING", 3, 0, false);
        declareFunction("cyc_string_concat", "CYC-STRING-CONCAT", 1, 0, false);
        declareFunction("cyc_strings_to_phrase", "CYC-STRINGS-TO-PHRASE", 1, 0, false);
        declareFunction("cyc_pre_remove", "CYC-PRE-REMOVE", 2, 0, false);
        declareFunction("cyc_replace_substring", "CYC-REPLACE-SUBSTRING", 3, 0, false);
        declareFunction("unicode_naut_or_ascii_string_p", "UNICODE-NAUT-OR-ASCII-STRING-P", 1, 0, false);
        declareFunction("unicode_naut_or_string_to_unicode_vector", "UNICODE-NAUT-OR-STRING-TO-UNICODE-VECTOR", 1, 0, false);
        declareFunction("cyc_unique_ws", "CYC-UNIQUE-WS", 3, 0, false);
        declareFunction("generate_names_for_term", "GENERATE-NAMES-FOR-TERM", 1, 0, false);
        declareFunction("cyc_remove_substring", "CYC-REMOVE-SUBSTRING", 2, 0, false);
        declareFunction("cyc_post_remove", "CYC-POST-REMOVE", 2, 0, false);
        declareFunction("cyc_trim_whitespace", "CYC-TRIM-WHITESPACE", 1, 0, false);
        declareFunction("cyc_string_search", "CYC-STRING-SEARCH", 2, 0, false);
        declareFunction("cyc_length", "CYC-LENGTH", 1, 0, false);
        declareFunction("cyc_string_to_integer", "CYC-STRING-TO-INTEGER", 1, 0, false);
        declareFunction("cyc_integer_to_string", "CYC-INTEGER-TO-STRING", 1, 0, false);
        declareFunction("cyc_string_to_real_number", "CYC-STRING-TO-REAL-NUMBER", 1, 0, false);
        declareFunction("cyc_real_number_to_string", "CYC-REAL-NUMBER-TO-STRING", 1, 0, false);
        declareFunction("max_supported_formula_arity", "MAX-SUPPORTED-FORMULA-ARITY", 0, 0, false);
        declareFunction("cyc_string_tokenize", "CYC-STRING-TOKENIZE", 2, 0, false);
        declareFunction("cyc_http_url_encode", "CYC-HTTP-URL-ENCODE", 1, 0, false);
        declareFunction("cyc_html_image", "CYC-HTML-IMAGE", 2, 0, false);
        declareFunction("html_image_plist", "HTML-IMAGE-PLIST", 1, 0, false);
        declareFunction("cyc_html_table_data", "CYC-HTML-TABLE-DATA", 2, 0, false);
        declareFunction("cyc_html_table_data_variable_arity", "CYC-HTML-TABLE-DATA-VARIABLE-ARITY", 1, 0, false);
        declareFunction("html_table_data_plist", "HTML-TABLE-DATA-PLIST", 1, 0, false);
        declareFunction("cyc_html_table_row", "CYC-HTML-TABLE-ROW", 2, 0, false);
        declareFunction("cyc_html_table_row_variable_arity", "CYC-HTML-TABLE-ROW-VARIABLE-ARITY", 1, 0, false);
        declareFunction("html_table_row_plist", "HTML-TABLE-ROW-PLIST", 1, 0, false);
        declareFunction("cyc_html_table", "CYC-HTML-TABLE", 2, 0, false);
        declareFunction("cyc_html_table_variable_arity", "CYC-HTML-TABLE-VARIABLE-ARITY", 1, 0, false);
        declareFunction("html_table_plist", "HTML-TABLE-PLIST", 1, 0, false);
        declareFunction("cyc_html_division", "CYC-HTML-DIVISION", 2, 0, false);
        declareFunction("cyc_html_division_variable_arity", "CYC-HTML-DIVISION-VARIABLE-ARITY", 1, 0, false);
        declareFunction("output_html_division_content", "OUTPUT-HTML-DIVISION-CONTENT", 1, 0, false);
        declareFunction("html_division_plist", "HTML-DIVISION-PLIST", 1, 0, false);
        declareFunction("decode_html_option", "DECODE-HTML-OPTION", 1, 0, false);
        declareFunction("parse_html_attribute", "PARSE-HTML-ATTRIBUTE", 1, 0, false);
        declareFunction("parse_html_attribute_value", "PARSE-HTML-ATTRIBUTE-VALUE", 1, 0, false);
        declareFunction("cyc_contextual_url", "CYC-CONTEXTUAL-URL", 2, 0, false);
        declareFunction("url_string", "URL-STRING", 1, 0, false);
        declareFunction("cyc_remove_html_tags", "CYC-REMOVE-HTML-TAGS", 1, 0, false);
        declareFunction("cyc_capitalize_smart", "CYC-CAPITALIZE-SMART", 1, 0, false);
        declareFunction("cyc_recapitalize_smart", "CYC-RECAPITALIZE-SMART", 1, 0, false);
        declareFunction("cyc_relation_arg", "CYC-RELATION-ARG", 2, 0, false);
        declareFunction("cyc_relation_args_list", "CYC-RELATION-ARGS-LIST", 1, 0, false);
        declareFunction("cyc_relation_arg_set", "CYC-RELATION-ARG-SET", 1, 0, false);
        declareFunction("cyc_relation_expression_arity", "CYC-RELATION-EXPRESSION-ARITY", 1, 0, false);
        declareFunction("cyc_identity", "CYC-IDENTITY", 1, 0, false);
        declareFunction("cyc_relation_tuples", "CYC-RELATION-TUPLES", 1, 0, false);
        declareFunction("cyc_relation_tuples_internal", "CYC-RELATION-TUPLES-INTERNAL", 1, 1, false);
        declareFunction("convert_relation_to_kappa", "CONVERT-RELATION-TO-KAPPA", 1, 0, false);
        declareFunction("cyc_substitute_formula", "CYC-SUBSTITUTE-FORMULA", 3, 0, false);
        declareFunction("cyc_bilateral_form_of_sentence_left", "CYC-BILATERAL-FORM-OF-SENTENCE-LEFT", 1, 0, false);
        declareFunction("symmetric_part_typeP", "SYMMETRIC-PART-TYPE?", 1, 0, false);
        declareFunction("left_form_of_symmetric_part_type", "LEFT-FORM-OF-SYMMETRIC-PART-TYPE", 1, 0, false);
        declareFunction("cyc_bilateral_form_of_sentence_right", "CYC-BILATERAL-FORM-OF-SENTENCE-RIGHT", 1, 0, false);
        declareFunction("symmetry_neutralized_el_sentence_p", "SYMMETRY-NEUTRALIZED-EL-SENTENCE-P", 1, 0, false);
        declareFunction("right_form_of_symmetric_part_type", "RIGHT-FORM-OF-SYMMETRIC-PART-TYPE", 1, 0, false);
        declareFunction("neutralize_symmetric_formula", "NEUTRALIZE-SYMMETRIC-FORMULA", 1, 0, false);
        declareFunction("side_fn_naut_p", "SIDE-FN-NAUT-P", 1, 0, false);
        declareFunction("cyc_substitute_formula_arg", "CYC-SUBSTITUTE-FORMULA-ARG", 3, 0, false);
        declareFunction("cyc_substitute_formula_arg_position", "CYC-SUBSTITUTE-FORMULA-ARG-POSITION", 3, 0, false);
        declareFunction("cyc_make_formula", "CYC-MAKE-FORMULA", 2, 0, false);
        declareFunction("cyc_substitute_quoted_formula_arg", "CYC-SUBSTITUTE-QUOTED-FORMULA-ARG", 3, 0, false);
        declareFunction("cyc_substitute_quoted_formula_arg_position", "CYC-SUBSTITUTE-QUOTED-FORMULA-ARG-POSITION", 3, 0, false);
        declareFunction("cyc_make_quoted_formula", "CYC-MAKE-QUOTED-FORMULA", 2, 0, false);
        declareFunction("cycl_to_el_fn", "CYCL-TO-EL-FN", 1, 0, false);
        declareFunction("cyc_substitute_nlte", "CYC-SUBSTITUTE-NLTE", 3, 0, false);
        declareFunction("sem_trans_template_defn", "SEM-TRANS-TEMPLATE-DEFN", 3, 0, false);
        declareFunction("cyc_word_strings", "CYC-WORD-STRINGS", 2, 0, false);
        declareFunction("word_strings_fn", "WORD-STRINGS-FN", 0, 0, false);
        declareFunction("word_sequence_fn", "WORD-SEQUENCE-FN", 0, 0, false);
        declareFunction("cyc_strings_of_word_sequence", "CYC-STRINGS-OF-WORD-SEQUENCE", 1, 0, false);
        declareFunction("cyc_instantiate", "CYC-INSTANTIATE", 3, 0, false);
        declareFunction("cyc_find_or_instantiate", "CYC-FIND-OR-INSTANTIATE", 3, 0, false);
        declareFunction("cyc_instantiate_set_formula", "CYC-INSTANTIATE-SET-FORMULA", 1, 0, false);
        declareFunction("cyc_instantiate_formula", "CYC-INSTANTIATE-FORMULA", 3, 0, false);
        declareFunction("cyc_action_type_nlte", "CYC-ACTION-TYPE-NLTE", 1, 0, false);
        declareFunction("action_type_nlte", "ACTION-TYPE-NLTE", 1, 0, false);
        declareFunction("action_type_nltes", "ACTION-TYPE-NLTES", 1, 0, false);
        declareFunction("cyc_individual_denoting_unary_function_for", "CYC-INDIVIDUAL-DENOTING-UNARY-FUNCTION-FOR", 1, 0, false);
        declareFunction("cyc_collection_denoting_unary_function_for", "CYC-COLLECTION-DENOTING-UNARY-FUNCTION-FOR", 1, 0, false);
        declareFunction("unary_functions_for", "UNARY-FUNCTIONS-FOR", 2, 0, false);
        declareFunction("unary_functionP", "UNARY-FUNCTION?", 1, 0, false);
        declareFunction("individual_denoting_fnP", "INDIVIDUAL-DENOTING-FN?", 1, 0, false);
        declareFunction("cyc_el_variable_fn", "CYC-EL-VARIABLE-FN", 1, 0, false);
        declareFunction("cyc_add_english_suffix", "CYC-ADD-ENGLISH-SUFFIX", 2, 0, false);
        declareFunction("generate_phrase_defn", "GENERATE-PHRASE-DEFN", 1, 0, false);
        declareFunction("generate_phrase_memoized_internal", "GENERATE-PHRASE-MEMOIZED-INTERNAL", 2, 0, false);
        declareFunction("generate_phrase_memoized", "GENERATE-PHRASE-MEMOIZED", 2, 0, false);
        declareFunction("best_string_of_nl_phrase_defn", "BEST-STRING-OF-NL-PHRASE-DEFN", 1, 0, false);
        declareFunction("basic_datum_paraphrase_defn", "BASIC-DATUM-PARAPHRASE-DEFN", 2, 0, false);
        declareFunction("basic_datum_phrase_naut", "BASIC-DATUM-PHRASE-NAUT", 1, 0, false);
        declareFunction("state_or_province_for_city_defn", "STATE-OR-PROVINCE-FOR-CITY-DEFN", 1, 0, false);
        declareFunction("cyc_html_url_encode", "CYC-HTML-URL-ENCODE", 1, 0, false);
        declareFunction("cyc_url_source", "CYC-URL-SOURCE", 1, 0, false);
        declareFunction("cyc_get_from_http_source", "CYC-GET-FROM-HTTP-SOURCE", 1, 0, false);
        declareFunction("encode_list_for_simple_http_server", "ENCODE-LIST-FOR-SIMPLE-HTTP-SERVER", 1, 0, false);
        declareFunction("cyc_term_uri_fn", "CYC-TERM-URI-FN", 1, 0, false);
        declareFunction("city_named_fn_defn", "CITY-NAMED-FN-DEFN", 2, 0, false);
        declareFunction("city_in_regionP", "CITY-IN-REGION?", 2, 0, false);
        declareFunction("text_topic_structure", "TEXT-TOPIC-STRUCTURE", 1, 0, false);
        declareFunction("el_list_to_subl_list", "EL-LIST-TO-SUBL-LIST", 1, 0, false);
        declareFunction("cyc_ordering_result", "CYC-ORDERING-RESULT", 1, 0, false);
        declareFunction("ordering_L", "ORDERING-<", 2, 0, false);
        declareFunction("cyc_ordering_result_internal", "CYC-ORDERING-RESULT-INTERNAL", 2, 0, false);
        declareFunction("cyc_string_to_substance_type", "CYC-STRING-TO-SUBSTANCE-TYPE", 1, 0, false);
        declareFunction("cyc_name_to_ionic_compound", "CYC-NAME-TO-IONIC-COMPOUND", 1, 0, false);
        declareFunction("cyc_seconds_since_1970_to_date", "CYC-SECONDS-SINCE-1970-TO-DATE", 1, 0, false);
        declareFunction("cyc_types_most_often_asserted_using_tool", "CYC-TYPES-MOST-OFTEN-ASSERTED-USING-TOOL", 2, 0, false);
        declareFunction("types_most_often_asserted_using_tool", "TYPES-MOST-OFTEN-ASSERTED-USING-TOOL", 1, 3, false);
        declareFunction("assertion_generating_tool_p", "ASSERTION-GENERATING-TOOL-P", 1, 0, false);
        declareFunction("cyc_html_for_text_containing_strings", "CYC-HTML-FOR-TEXT-CONTAINING-STRINGS", 2, 0, false);
        declareFunction("cyc_html_for_text_containing_strings_count_bold_tags", "CYC-HTML-FOR-TEXT-CONTAINING-STRINGS-COUNT-BOLD-TAGS", 1, 0, false);
        declareFunction("cyc_format", "CYC-FORMAT", 2, 0, false);
        declareFunction("cyc_next_integer_in_sequence", "CYC-NEXT-INTEGER-IN-SEQUENCE", 1, 0, false);
        declareFunction("cyc_next_integer_in_sequence_starting_at", "CYC-NEXT-INTEGER-IN-SEQUENCE-STARTING-AT", 2, 0, false);
        declareFunction("cyc_cyclify", "CYC-CYCLIFY", 2, 0, false);
        declareFunction("cyc_concatenate_strings", "CYC-CONCATENATE-STRINGS", 1, 0, false);
        declareFunction("strings_to_display_vector_strings", "STRINGS-TO-DISPLAY-VECTOR-STRINGS", 1, 0, false);
        declareFunction("cyc_term_similarity_metric", "CYC-TERM-SIMILARITY-METRIC", 2, 0, false);
        declareFunction("check_wn_sks_registered", "CHECK-WN-SKS-REGISTERED", 0, 0, false);
        declareFunction("cyc_wn_all_candidate_cycls_for_word_unitXpos", "CYC-WN-ALL-CANDIDATE-CYCLS-FOR-WORD-UNIT&POS", 2, 0, false);
        declareFunction("cyc_wn_all_hypernyms_for_word_unitXpos", "CYC-WN-ALL-HYPERNYMS-FOR-WORD-UNIT&POS", 2, 0, false);
        declareFunction("cyc_wn_all_synonyms_for_word_unitXpos", "CYC-WN-ALL-SYNONYMS-FOR-WORD-UNIT&POS", 2, 0, false);
        declareFunction("cyc_wn_ranked_candidate_cycls_for_word_unitXpos", "CYC-WN-RANKED-CANDIDATE-CYCLS-FOR-WORD-UNIT&POS", 2, 0, false);
        declareFunction("cyc_wn_ranked_hypernyms_for_word_unitXpos", "CYC-WN-RANKED-HYPERNYMS-FOR-WORD-UNIT&POS", 2, 0, false);
        declareFunction("cyc_wn_ranked_synonyms_for_word_unitXpos", "CYC-WN-RANKED-SYNONYMS-FOR-WORD-UNIT&POS", 2, 0, false);
        declareFunction("cyc_kb_orthogonal", "CYC-KB-ORTHOGONAL", 2, 0, false);
        declareFunction("cyc_content_of_file", "CYC-CONTENT-OF-FILE", 1, 0, false);
        declareFunction("cyc_transform_relation_tuples", "CYC-TRANSFORM-RELATION-TUPLES", 1, 0, false);
        declareFunction("unlist", "UNLIST", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_evaluation_defns_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("evaluatable_predicate_count", "EVALUATABLE-PREDICATE-COUNT", 0, 0, false);
            declareFunction("cyc_true_subl", "CYC-TRUE-SUBL", 1, 0, false);
            declareFunction("cyc_different", "CYC-DIFFERENT", 1, 0, false);
            new evaluation_defns.$cyc_different$UnaryFunction();
            declareFunction("cyc_different_symbols", "CYC-DIFFERENT-SYMBOLS", 1, 0, false);
            declareFunction("cyc_string_precedes", "CYC-STRING-PRECEDES", 2, 0, false);
            declareFunction("cyc_string_precedes_case_insensitive", "CYC-STRING-PRECEDES-CASE-INSENSITIVE", 2, 0, false);
            declareFunction("cyc_string_precedes_internal", "CYC-STRING-PRECEDES-INTERNAL", 3, 0, false);
            declareFunction("cyc_substring_predicate", "CYC-SUBSTRING-PREDICATE", 2, 0, false);
            declareFunction("cyc_substring_case_insensitive_predicate", "CYC-SUBSTRING-CASE-INSENSITIVE-PREDICATE", 2, 0, false);
            declareFunction("cyc_substring_predicate_internal", "CYC-SUBSTRING-PREDICATE-INTERNAL", 3, 0, false);
            declareFunction("cyc_prefix_substring", "CYC-PREFIX-SUBSTRING", 2, 0, false);
            declareFunction("cyc_suffix_substring", "CYC-SUFFIX-SUBSTRING", 2, 0, false);
            declareFunction("cyc_subword_predicate", "CYC-SUBWORD-PREDICATE", 2, 0, false);
            declareFunction("cyc_find_constant", "CYC-FIND-CONSTANT", 1, 0, false);
            declareFunction("evaluatable_function_count", "EVALUATABLE-FUNCTION-COUNT", 0, 0, false);
            declareFunction("cyc_evaluate_subl", "CYC-EVALUATE-SUBL", 1, 0, false);
            declareFunction("cyc_string_upcase", "CYC-STRING-UPCASE", 1, 0, false);
            declareFunction("string_upcase_defn", "STRING-UPCASE-DEFN", 1, 0, false);
            declareFunction("cyc_string_downcase", "CYC-STRING-DOWNCASE", 1, 0, false);
            declareFunction("cyc_substring", "CYC-SUBSTRING", 3, 0, false);
            declareFunction("cyc_string_concat", "CYC-STRING-CONCAT", 1, 0, false);
            declareFunction("cyc_strings_to_phrase", "CYC-STRINGS-TO-PHRASE", 1, 0, false);
            declareFunction("cyc_pre_remove", "CYC-PRE-REMOVE", 2, 0, false);
            declareFunction("cyc_replace_substring", "CYC-REPLACE-SUBSTRING", 3, 0, false);
            declareFunction("unicode_naut_or_ascii_string_p", "UNICODE-NAUT-OR-ASCII-STRING-P", 1, 0, false);
            declareFunction("cyc_unique_ws", "CYC-UNIQUE-WS", 3, 0, false);
            declareFunction("generate_names_for_term", "GENERATE-NAMES-FOR-TERM", 1, 0, false);
            declareFunction("cyc_remove_substring", "CYC-REMOVE-SUBSTRING", 2, 0, false);
            declareFunction("cyc_post_remove", "CYC-POST-REMOVE", 2, 0, false);
            declareFunction("cyc_trim_whitespace", "CYC-TRIM-WHITESPACE", 1, 0, false);
            declareFunction("cyc_string_search", "CYC-STRING-SEARCH", 2, 0, false);
            declareFunction("cyc_length", "CYC-LENGTH", 1, 0, false);
            declareFunction("cyc_string_to_integer", "CYC-STRING-TO-INTEGER", 1, 0, false);
            declareFunction("cyc_integral_number_to_integer", "CYC-INTEGRAL-NUMBER-TO-INTEGER", 1, 0, false);
            declareFunction("cyc_integer_to_string", "CYC-INTEGER-TO-STRING", 1, 0, false);
            declareFunction("cyc_stringify_fn", "CYC-STRINGIFY-FN", 1, 0, false);
            declareFunction("cyc_syntactic_disquotation", "CYC-SYNTACTIC-DISQUOTATION", 1, 0, false);
            declareFunction("identify_pattern", "IDENTIFY-PATTERN", 1, 0, false);
            declareFunction("cyc_string_to_real_number", "CYC-STRING-TO-REAL-NUMBER", 1, 0, false);
            declareFunction("cyc_real_number_to_string", "CYC-REAL-NUMBER-TO-STRING", 1, 0, false);
            declareFunction("max_supported_formula_arity", "MAX-SUPPORTED-FORMULA-ARITY", 0, 0, false);
            declareFunction("cyc_string_tokenize", "CYC-STRING-TOKENIZE", 2, 0, false);
            declareFunction("cyc_string_to_nth_code_point", "CYC-STRING-TO-NTH-CODE-POINT", 2, 0, false);
            declareFunction("cyc_http_url_encode", "CYC-HTTP-URL-ENCODE", 1, 0, false);
            declareFunction("cyc_xml_value_string", "CYC-XML-VALUE-STRING", 3, 0, false);
            declareFunction("cyc_http_url_decode", "CYC-HTTP-URL-DECODE", 1, 0, false);
            declareFunction("cyc_acronym_from_string", "CYC-ACRONYM-FROM-STRING", 1, 0, false);
            declareFunction("cyc_html_image", "CYC-HTML-IMAGE", 2, 0, false);
            declareFunction("html_image_plist", "HTML-IMAGE-PLIST", 1, 0, false);
            declareFunction("cyc_html_table_data", "CYC-HTML-TABLE-DATA", 2, 0, false);
            declareFunction("cyc_html_table_data_variable_arity", "CYC-HTML-TABLE-DATA-VARIABLE-ARITY", 1, 0, false);
            declareFunction("html_table_data_plist", "HTML-TABLE-DATA-PLIST", 1, 0, false);
            declareFunction("cyc_html_table_row", "CYC-HTML-TABLE-ROW", 2, 0, false);
            declareFunction("cyc_html_table_row_variable_arity", "CYC-HTML-TABLE-ROW-VARIABLE-ARITY", 1, 0, false);
            declareFunction("html_table_row_plist", "HTML-TABLE-ROW-PLIST", 1, 0, false);
            declareFunction("cyc_html_table", "CYC-HTML-TABLE", 2, 0, false);
            declareFunction("cyc_html_table_variable_arity", "CYC-HTML-TABLE-VARIABLE-ARITY", 1, 0, false);
            declareFunction("html_table_plist", "HTML-TABLE-PLIST", 1, 0, false);
            declareFunction("cyc_html_division", "CYC-HTML-DIVISION", 2, 0, false);
            declareFunction("cyc_html_division_variable_arity", "CYC-HTML-DIVISION-VARIABLE-ARITY", 1, 0, false);
            declareFunction("output_html_division_content", "OUTPUT-HTML-DIVISION-CONTENT", 1, 0, false);
            declareFunction("html_division_plist", "HTML-DIVISION-PLIST", 1, 0, false);
            declareFunction("decode_html_option", "DECODE-HTML-OPTION", 1, 0, false);
            declareFunction("parse_html_attribute", "PARSE-HTML-ATTRIBUTE", 1, 0, false);
            declareFunction("parse_html_attribute_value", "PARSE-HTML-ATTRIBUTE-VALUE", 1, 0, false);
            declareFunction("cyc_contextual_url", "CYC-CONTEXTUAL-URL", 2, 0, false);
            declareFunction("url_string", "URL-STRING", 1, 0, false);
            declareFunction("cyc_term_from_sparql_uri", "CYC-TERM-FROM-SPARQL-URI", 1, 0, false);
            declareFunction("open_cyc_uri_for_term", "OPEN-CYC-URI-FOR-TERM", 1, 0, false);
            declareFunction("canonical_uri_for_term", "CANONICAL-URI-FOR-TERM", 1, 0, false);
            declareFunction("resource_with_uri_fn_nat_p", "RESOURCE-WITH-URI-FN-NAT-P", 1, 0, false);
            declareFunction("cyc_remove_html_tags", "CYC-REMOVE-HTML-TAGS", 1, 0, false);
            declareFunction("cyc_capitalize_smart", "CYC-CAPITALIZE-SMART", 1, 0, false);
            declareFunction("cyc_recapitalize_smart", "CYC-RECAPITALIZE-SMART", 1, 0, false);
            declareFunction("cyc_relation_arg", "CYC-RELATION-ARG", 2, 0, false);
            declareFunction("cyc_relation_args_list", "CYC-RELATION-ARGS-LIST", 1, 0, false);
            declareFunction("cyc_relation_arg_set", "CYC-RELATION-ARG-SET", 1, 0, false);
            declareFunction("cyc_quoted_relation_expression_arity", "CYC-QUOTED-RELATION-EXPRESSION-ARITY", 1, 0, false);
            declareFunction("cyc_relation_expression_arity", "CYC-RELATION-EXPRESSION-ARITY", 1, 0, false);
            declareFunction("cyc_identity", "CYC-IDENTITY", 1, 0, false);
            declareFunction("cyc_relation_tuples", "CYC-RELATION-TUPLES", 1, 0, false);
            declareFunction("cyc_relation_tuples_internal", "CYC-RELATION-TUPLES-INTERNAL", 1, 1, false);
            declareFunction("convert_relation_to_kappa", "CONVERT-RELATION-TO-KAPPA", 1, 0, false);
            declareFunction("cyc_substitute_formula", "CYC-SUBSTITUTE-FORMULA", 3, 0, false);
            declareFunction("cyc_bilateral_form_of_sentence_left", "CYC-BILATERAL-FORM-OF-SENTENCE-LEFT", 1, 0, false);
            declareFunction("symmetric_part_typeP", "SYMMETRIC-PART-TYPE?", 1, 0, false);
            declareFunction("left_form_of_symmetric_part_type", "LEFT-FORM-OF-SYMMETRIC-PART-TYPE", 1, 0, false);
            declareFunction("cyc_bilateral_form_of_sentence_right", "CYC-BILATERAL-FORM-OF-SENTENCE-RIGHT", 1, 0, false);
            declareFunction("symmetry_neutralized_el_sentence_p", "SYMMETRY-NEUTRALIZED-EL-SENTENCE-P", 1, 0, false);
            declareFunction("right_form_of_symmetric_part_type", "RIGHT-FORM-OF-SYMMETRIC-PART-TYPE", 1, 0, false);
            declareFunction("neutralize_symmetric_formula", "NEUTRALIZE-SYMMETRIC-FORMULA", 1, 0, false);
            declareFunction("side_fn_naut_p", "SIDE-FN-NAUT-P", 1, 0, false);
            declareFunction("cyc_substitute_formula_arg", "CYC-SUBSTITUTE-FORMULA-ARG", 3, 0, false);
            declareFunction("cyc_substitute_formula_arg_position", "CYC-SUBSTITUTE-FORMULA-ARG-POSITION", 3, 0, false);
            declareFunction("cyc_make_formula", "CYC-MAKE-FORMULA", 2, 0, false);
            declareFunction("cyc_substitute_quoted_formula", "CYC-SUBSTITUTE-QUOTED-FORMULA", 3, 0, false);
            declareFunction("cyc_substitute_quoted_formula_arg", "CYC-SUBSTITUTE-QUOTED-FORMULA-ARG", 3, 0, false);
            declareFunction("cyc_substitute_quoted_formula_arg_position", "CYC-SUBSTITUTE-QUOTED-FORMULA-ARG-POSITION", 3, 0, false);
            declareFunction("cyc_make_quoted_formula", "CYC-MAKE-QUOTED-FORMULA", 2, 0, false);
            declareFunction("cycl_to_el_fn", "CYCL-TO-EL-FN", 1, 0, false);
            declareFunction("cyc_substitute_nlte", "CYC-SUBSTITUTE-NLTE", 3, 0, false);
            declareFunction("sem_trans_template_defn", "SEM-TRANS-TEMPLATE-DEFN", 3, 0, false);
            declareFunction("cyc_word_strings", "CYC-WORD-STRINGS", 2, 0, false);
            declareFunction("word_strings_fn", "WORD-STRINGS-FN", 0, 0, false);
            declareFunction("word_sequence_fn", "WORD-SEQUENCE-FN", 0, 0, false);
            declareFunction("cyc_strings_of_word_sequence", "CYC-STRINGS-OF-WORD-SEQUENCE", 1, 0, false);
            declareFunction("cyc_instantiate", "CYC-INSTANTIATE", 3, 0, false);
            declareFunction("cyc_find_or_instantiate", "CYC-FIND-OR-INSTANTIATE", 3, 0, false);
            declareFunction("cyc_instantiate_set_formula", "CYC-INSTANTIATE-SET-FORMULA", 1, 0, false);
            declareFunction("cyc_instantiate_formula", "CYC-INSTANTIATE-FORMULA", 3, 0, false);
            declareFunction("cyc_find_via_pred_value_or_create_via_template", "CYC-FIND-VIA-PRED-VALUE-OR-CREATE-VIA-TEMPLATE", 3, 0, false);
            declareFunction("clear_cached_find_via_pred_value_wrt_template", "CLEAR-CACHED-FIND-VIA-PRED-VALUE-WRT-TEMPLATE", 0, 0, false);
            declareFunction("remove_cached_find_via_pred_value_wrt_template", "REMOVE-CACHED-FIND-VIA-PRED-VALUE-WRT-TEMPLATE", 3, 1, false);
            declareFunction("cached_find_via_pred_value_wrt_template_internal", "CACHED-FIND-VIA-PRED-VALUE-WRT-TEMPLATE-INTERNAL", 4, 0, false);
            declareFunction("cached_find_via_pred_value_wrt_template", "CACHED-FIND-VIA-PRED-VALUE-WRT-TEMPLATE", 3, 1, false);
            declareFunction("find_via_pred_value_wrt_template", "FIND-VIA-PRED-VALUE-WRT-TEMPLATE", 3, 1, false);
            declareFunction("create_and_assert_via_value_wrt_template", "CREATE-AND-ASSERT-VIA-VALUE-WRT-TEMPLATE", 2, 1, false);
            declareFunction("create_constant_from_value_wrt_template", "CREATE-CONSTANT-FROM-VALUE-WRT-TEMPLATE", 2, 1, false);
            declareFunction("compute_constant_assert_sentence_wrt_template", "COMPUTE-CONSTANT-ASSERT-SENTENCE-WRT-TEMPLATE", 3, 1, false);
            declareFunction("cyc_action_type_nlte", "CYC-ACTION-TYPE-NLTE", 1, 0, false);
            declareFunction("action_type_nlte", "ACTION-TYPE-NLTE", 1, 0, false);
            declareFunction("action_type_nltes", "ACTION-TYPE-NLTES", 1, 0, false);
            declareFunction("cyc_individual_denoting_unary_function_for", "CYC-INDIVIDUAL-DENOTING-UNARY-FUNCTION-FOR", 1, 0, false);
            declareFunction("cyc_collection_denoting_unary_function_for", "CYC-COLLECTION-DENOTING-UNARY-FUNCTION-FOR", 1, 0, false);
            declareFunction("unary_functions_for", "UNARY-FUNCTIONS-FOR", 2, 0, false);
            declareFunction("unary_functionP", "UNARY-FUNCTION?", 1, 0, false);
            declareFunction("individual_denoting_fnP", "INDIVIDUAL-DENOTING-FN?", 1, 0, false);
            declareFunction("cyc_el_variable_fn", "CYC-EL-VARIABLE-FN", 1, 0, false);
            declareFunction("cyc_add_english_suffix", "CYC-ADD-ENGLISH-SUFFIX", 2, 0, false);
            declareFunction("generate_phrase_defn", "GENERATE-PHRASE-DEFN", 1, 0, false);
            declareFunction("generate_phrase_memoized_internal", "GENERATE-PHRASE-MEMOIZED-INTERNAL", 2, 0, false);
            declareFunction("generate_phrase_memoized", "GENERATE-PHRASE-MEMOIZED", 2, 0, false);
            declareFunction("assertions_relevant_to_string_defn", "ASSERTIONS-RELEVANT-TO-STRING-DEFN", 1, 0, false);
            declareFunction("assertions_for_prompt_string_memoized_internal", "ASSERTIONS-FOR-PROMPT-STRING-MEMOIZED-INTERNAL", 3, 0, false);
            declareFunction("assertions_for_prompt_string_memoized", "ASSERTIONS-FOR-PROMPT-STRING-MEMOIZED", 3, 0, false);
            declareFunction("best_string_of_nl_phrase_defn", "BEST-STRING-OF-NL-PHRASE-DEFN", 1, 0, false);
            declareFunction("best_string_of_nl_phrase_addressing_defn", "BEST-STRING-OF-NL-PHRASE-ADDRESSING-DEFN", 2, 0, false);
            declareFunction("best_string_of_nl_phrase_with_force_defn", "BEST-STRING-OF-NL-PHRASE-WITH-FORCE-DEFN", 2, 0, false);
            declareFunction("generate_gke_gloss_wrt_mt", "GENERATE-GKE-GLOSS-WRT-MT", 2, 0, false);
            declareFunction("basic_datum_paraphrase_defn", "BASIC-DATUM-PARAPHRASE-DEFN", 2, 0, false);
            declareFunction("basic_datum_phrase_naut", "BASIC-DATUM-PHRASE-NAUT", 1, 0, false);
            declareFunction("paraphrase_of_formula_from_template_defn", "PARAPHRASE-OF-FORMULA-FROM-TEMPLATE-DEFN", 2, 0, false);
            declareFunction("state_or_province_for_city_defn", "STATE-OR-PROVINCE-FOR-CITY-DEFN", 1, 0, false);
            declareFunction("cyc_html_url_encode", "CYC-HTML-URL-ENCODE", 1, 0, false);
            declareFunction("cyc_url_source", "CYC-URL-SOURCE", 1, 0, false);
            declareFunction("cyc_get_from_http_source", "CYC-GET-FROM-HTTP-SOURCE", 1, 0, false);
            declareFunction("encode_list_for_simple_http_server", "ENCODE-LIST-FOR-SIMPLE-HTTP-SERVER", 1, 0, false);
            declareFunction("cyc_term_uri_fn", "CYC-TERM-URI-FN", 1, 0, false);
            declareFunction("city_named_fn_defn", "CITY-NAMED-FN-DEFN", 2, 0, false);
            declareFunction("city_in_regionP", "CITY-IN-REGION?", 2, 0, false);
            declareFunction("text_topic_structure", "TEXT-TOPIC-STRUCTURE", 1, 0, false);
            declareFunction("el_list_to_subl_list", "EL-LIST-TO-SUBL-LIST", 1, 0, false);
            declareFunction("cyc_ordering_result", "CYC-ORDERING-RESULT", 1, 0, false);
            declareFunction("ordering_L", "ORDERING-<", 2, 0, false);
            declareFunction("cyc_ordering_result_internal", "CYC-ORDERING-RESULT-INTERNAL", 2, 0, false);
            declareFunction("cyc_time_of_day_of_date", "CYC-TIME-OF-DAY-OF-DATE", 1, 0, false);
            declareFunction("cyc_seconds_since_1970_to_date", "CYC-SECONDS-SINCE-1970-TO-DATE", 1, 0, false);
            declareFunction("cyc_date_to_seconds_since_1970", "CYC-DATE-TO-SECONDS-SINCE-1970", 1, 0, false);
            declareFunction("cyc_types_most_often_asserted_using_tool", "CYC-TYPES-MOST-OFTEN-ASSERTED-USING-TOOL", 2, 0, false);
            declareFunction("types_most_often_asserted_using_tool", "TYPES-MOST-OFTEN-ASSERTED-USING-TOOL", 1, 3, false);
            declareFunction("assertion_generating_tool_p", "ASSERTION-GENERATING-TOOL-P", 1, 0, false);
            declareFunction("cyc_html_for_text_containing_strings", "CYC-HTML-FOR-TEXT-CONTAINING-STRINGS", 2, 0, false);
            declareFunction("cyc_html_for_text_containing_strings_count_bold_tags", "CYC-HTML-FOR-TEXT-CONTAINING-STRINGS-COUNT-BOLD-TAGS", 1, 0, false);
            declareFunction("cyc_format", "CYC-FORMAT", 2, 0, false);
            declareFunction("cyc_next_integer_in_sequence", "CYC-NEXT-INTEGER-IN-SEQUENCE", 1, 0, false);
            declareFunction("cyc_next_integer_in_sequence_starting_at", "CYC-NEXT-INTEGER-IN-SEQUENCE-STARTING-AT", 2, 0, false);
            declareFunction("cyc_cyclify", "CYC-CYCLIFY", 2, 0, false);
            declareFunction("cyc_concatenate_strings", "CYC-CONCATENATE-STRINGS", 1, 0, false);
            declareFunction("cyc_concatenate_list_of_strings", "CYC-CONCATENATE-LIST-OF-STRINGS", 1, 0, false);
            declareFunction("cyc_term_similarity_metric", "CYC-TERM-SIMILARITY-METRIC", 2, 0, false);
            declareFunction("check_wn_sks_registered", "CHECK-WN-SKS-REGISTERED", 0, 0, false);
            declareFunction("cyc_wn_all_candidate_cycls_for_word_unitXpos", "CYC-WN-ALL-CANDIDATE-CYCLS-FOR-WORD-UNIT&POS", 2, 0, false);
            declareFunction("cyc_wn_all_hypernyms_for_word_unitXpos", "CYC-WN-ALL-HYPERNYMS-FOR-WORD-UNIT&POS", 2, 0, false);
            declareFunction("cyc_wn_all_synonyms_for_word_unitXpos", "CYC-WN-ALL-SYNONYMS-FOR-WORD-UNIT&POS", 2, 0, false);
            declareFunction("cyc_wn_ranked_candidate_cycls_for_word_unitXpos", "CYC-WN-RANKED-CANDIDATE-CYCLS-FOR-WORD-UNIT&POS", 2, 0, false);
            declareFunction("cyc_wn_ranked_hypernyms_for_word_unitXpos", "CYC-WN-RANKED-HYPERNYMS-FOR-WORD-UNIT&POS", 2, 0, false);
            declareFunction("cyc_wn_ranked_synonyms_for_word_unitXpos", "CYC-WN-RANKED-SYNONYMS-FOR-WORD-UNIT&POS", 2, 0, false);
            declareFunction("cyc_kb_orthogonal", "CYC-KB-ORTHOGONAL", 2, 0, false);
            declareFunction("cyc_content_of_file", "CYC-CONTENT-OF-FILE", 1, 0, false);
            declareFunction("cyc_transform_relation_tuples", "CYC-TRANSFORM-RELATION-TUPLES", 1, 0, false);
            declareFunction("unlist", "UNLIST", 1, 0, false);
            declareFunction("cyc_provable_via_defns", "CYC-PROVABLE-VIA-DEFNS", 1, 0, false);
            declareFunction("provable_via_defns_proper", "PROVABLE-VIA-DEFNS-PROPER", 3, 0, false);
            declareFunction("current_inference_answer_justification_proof_view", "CURRENT-INFERENCE-ANSWER-JUSTIFICATION-PROOF-VIEW", 0, 0, false);
            declareFunction("cyc_find_object_by_compact_hl_external_id_string", "CYC-FIND-OBJECT-BY-COMPACT-HL-EXTERNAL-ID-STRING", 1, 0, false);
            declareFunction("cyc_compact_hl_external_id_string", "CYC-COMPACT-HL-EXTERNAL-ID-STRING", 1, 0, false);
            declareFunction("cyc_decode_ka_interaction", "CYC-DECODE-KA-INTERACTION", 1, 0, false);
            declareFunction("cyc_most_recently_started_events_by_agent_relative_to_interaction_mt_fn", "CYC-MOST-RECENTLY-STARTED-EVENTS-BY-AGENT-RELATIVE-TO-INTERACTION-MT-FN", 2, 0, false);
            declareFunction("most_recently_started_events_by_agent_relative_to_interaction_mt", "MOST-RECENTLY-STARTED-EVENTS-BY-AGENT-RELATIVE-TO-INTERACTION-MT", 2, 0, false);
            declareFunction("executed_events_for_agent_in_interaction_mt", "EXECUTED-EVENTS-FOR-AGENT-IN-INTERACTION-MT", 2, 0, false);
            declareFunction("executed_unfinished_events_for_agent_in_interaction_mt", "EXECUTED-UNFINISHED-EVENTS-FOR-AGENT-IN-INTERACTION-MT", 2, 1, false);
            declareFunction("cyc_most_recently_started_unfinish_events_by_agent_relative_to_interaction_mt_fn", "CYC-MOST-RECENTLY-STARTED-UNFINISH-EVENTS-BY-AGENT-RELATIVE-TO-INTERACTION-MT-FN", 2, 0, false);
            declareFunction("most_recently_started_unfinished_events_by_agent_relative_to_interaction_mt", "MOST-RECENTLY-STARTED-UNFINISHED-EVENTS-BY-AGENT-RELATIVE-TO-INTERACTION-MT", 2, 0, false);
            declareFunction("cyc_event_to_plan_for_by_agent_in_interaction_context_fn", "CYC-EVENT-TO-PLAN-FOR-BY-AGENT-IN-INTERACTION-CONTEXT-FN", 2, 0, false);
            declareFunction("event_to_plan_for_by_agent_in_interaction_context", "EVENT-TO-PLAN-FOR-BY-AGENT-IN-INTERACTION-CONTEXT", 2, 0, false);
            declareFunction("cyc_plan_agent_should_execute_in_interaction_context_fn", "CYC-PLAN-AGENT-SHOULD-EXECUTE-IN-INTERACTION-CONTEXT-FN", 2, 0, false);
            declareFunction("earlier_mt_or_abandonedP", "EARLIER-MT-OR-ABANDONED?", 2, 0, false);
            declareFunction("plan_agent_should_execute_in_interaction_context", "PLAN-AGENT-SHOULD-EXECUTE-IN-INTERACTION-CONTEXT", 2, 0, false);
            declareFunction("cyc_agent_cannot_progress_in_interaction_context_fn", "CYC-AGENT-CANNOT-PROGRESS-IN-INTERACTION-CONTEXT-FN", 2, 0, false);
            declareFunction("agent_cannot_progress_in_interaction_context", "AGENT-CANNOT-PROGRESS-IN-INTERACTION-CONTEXT", 2, 0, false);
            declareFunction("cyc_highest_priority_item_on_agenda_for_agent_in_interaction_context_fn", "CYC-HIGHEST-PRIORITY-ITEM-ON-AGENDA-FOR-AGENT-IN-INTERACTION-CONTEXT-FN", 2, 0, false);
            declareFunction("highest_priority_item_on_agenda_for_agent_in_interaction_context", "HIGHEST-PRIORITY-ITEM-ON-AGENDA-FOR-AGENT-IN-INTERACTION-CONTEXT", 2, 0, false);
            declareFunction("cyc_highest_priority_item_on_agenda_in_to_do_mt_fn", "CYC-HIGHEST-PRIORITY-ITEM-ON-AGENDA-IN-TO-DO-MT-FN", 2, 0, false);
            declareFunction("highest_priority_item_on_agenda_in_to_do_mt", "HIGHEST-PRIORITY-ITEM-ON-AGENDA-IN-TO-DO-MT", 2, 0, false);
            declareFunction("cyc_likelihood_of_truth_of_sentence", "CYC-LIKELIHOOD-OF-TRUTH-OF-SENTENCE", 2, 0, false);
            declareFunction("cyc_time_intervals_for_sentence", "CYC-TIME-INTERVALS-FOR-SENTENCE", 2, 0, false);
            declareFunction("cyc_evaluate_math_expression", "CYC-EVALUATE-MATH-EXPRESSION", 1, 0, false);
            declareFunction("cyc_flatten_math_expression", "CYC-FLATTEN-MATH-EXPRESSION", 1, 0, false);
            declareFunction("cyc_apply_operation_to_math_statement", "CYC-APPLY-OPERATION-TO-MATH-STATEMENT", 3, 0, false);
            declareFunction("cyc_serialize_mathml", "CYC-SERIALIZE-MATHML", 1, 0, false);
            declareFunction("cyc_cartesian_product", "CYC-CARTESIAN-PRODUCT", 1, 0, false);
            declareFunction("cyc_filter_list", "CYC-FILTER-LIST", 2, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("unicode_naut_or_string_to_unicode_vector", "UNICODE-NAUT-OR-STRING-TO-UNICODE-VECTOR", 1, 0, false);
            declareFunction("cyc_string_to_substance_type", "CYC-STRING-TO-SUBSTANCE-TYPE", 1, 0, false);
            declareFunction("cyc_name_to_ionic_compound", "CYC-NAME-TO-IONIC-COMPOUND", 1, 0, false);
            declareFunction("strings_to_display_vector_strings", "STRINGS-TO-DISPLAY-VECTOR-STRINGS", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_evaluation_defns_file_Previous() {
        declareFunction("evaluatable_predicate_count", "EVALUATABLE-PREDICATE-COUNT", 0, 0, false);
        declareFunction("cyc_true_subl", "CYC-TRUE-SUBL", 1, 0, false);
        declareFunction("cyc_different", "CYC-DIFFERENT", 1, 0, false);
        new evaluation_defns.$cyc_different$UnaryFunction();
        declareFunction("cyc_different_symbols", "CYC-DIFFERENT-SYMBOLS", 1, 0, false);
        declareFunction("cyc_string_precedes", "CYC-STRING-PRECEDES", 2, 0, false);
        declareFunction("cyc_string_precedes_case_insensitive", "CYC-STRING-PRECEDES-CASE-INSENSITIVE", 2, 0, false);
        declareFunction("cyc_string_precedes_internal", "CYC-STRING-PRECEDES-INTERNAL", 3, 0, false);
        declareFunction("cyc_substring_predicate", "CYC-SUBSTRING-PREDICATE", 2, 0, false);
        declareFunction("cyc_substring_case_insensitive_predicate", "CYC-SUBSTRING-CASE-INSENSITIVE-PREDICATE", 2, 0, false);
        declareFunction("cyc_substring_predicate_internal", "CYC-SUBSTRING-PREDICATE-INTERNAL", 3, 0, false);
        declareFunction("cyc_prefix_substring", "CYC-PREFIX-SUBSTRING", 2, 0, false);
        declareFunction("cyc_suffix_substring", "CYC-SUFFIX-SUBSTRING", 2, 0, false);
        declareFunction("cyc_subword_predicate", "CYC-SUBWORD-PREDICATE", 2, 0, false);
        declareFunction("cyc_find_constant", "CYC-FIND-CONSTANT", 1, 0, false);
        declareFunction("evaluatable_function_count", "EVALUATABLE-FUNCTION-COUNT", 0, 0, false);
        declareFunction("cyc_evaluate_subl", "CYC-EVALUATE-SUBL", 1, 0, false);
        declareFunction("cyc_string_upcase", "CYC-STRING-UPCASE", 1, 0, false);
        declareFunction("string_upcase_defn", "STRING-UPCASE-DEFN", 1, 0, false);
        declareFunction("cyc_string_downcase", "CYC-STRING-DOWNCASE", 1, 0, false);
        declareFunction("cyc_substring", "CYC-SUBSTRING", 3, 0, false);
        declareFunction("cyc_string_concat", "CYC-STRING-CONCAT", 1, 0, false);
        declareFunction("cyc_strings_to_phrase", "CYC-STRINGS-TO-PHRASE", 1, 0, false);
        declareFunction("cyc_pre_remove", "CYC-PRE-REMOVE", 2, 0, false);
        declareFunction("cyc_replace_substring", "CYC-REPLACE-SUBSTRING", 3, 0, false);
        declareFunction("unicode_naut_or_ascii_string_p", "UNICODE-NAUT-OR-ASCII-STRING-P", 1, 0, false);
        declareFunction("cyc_unique_ws", "CYC-UNIQUE-WS", 3, 0, false);
        declareFunction("generate_names_for_term", "GENERATE-NAMES-FOR-TERM", 1, 0, false);
        declareFunction("cyc_remove_substring", "CYC-REMOVE-SUBSTRING", 2, 0, false);
        declareFunction("cyc_post_remove", "CYC-POST-REMOVE", 2, 0, false);
        declareFunction("cyc_trim_whitespace", "CYC-TRIM-WHITESPACE", 1, 0, false);
        declareFunction("cyc_string_search", "CYC-STRING-SEARCH", 2, 0, false);
        declareFunction("cyc_length", "CYC-LENGTH", 1, 0, false);
        declareFunction("cyc_string_to_integer", "CYC-STRING-TO-INTEGER", 1, 0, false);
        declareFunction("cyc_integral_number_to_integer", "CYC-INTEGRAL-NUMBER-TO-INTEGER", 1, 0, false);
        declareFunction("cyc_integer_to_string", "CYC-INTEGER-TO-STRING", 1, 0, false);
        declareFunction("cyc_stringify_fn", "CYC-STRINGIFY-FN", 1, 0, false);
        declareFunction("cyc_syntactic_disquotation", "CYC-SYNTACTIC-DISQUOTATION", 1, 0, false);
        declareFunction("identify_pattern", "IDENTIFY-PATTERN", 1, 0, false);
        declareFunction("cyc_string_to_real_number", "CYC-STRING-TO-REAL-NUMBER", 1, 0, false);
        declareFunction("cyc_real_number_to_string", "CYC-REAL-NUMBER-TO-STRING", 1, 0, false);
        declareFunction("max_supported_formula_arity", "MAX-SUPPORTED-FORMULA-ARITY", 0, 0, false);
        declareFunction("cyc_string_tokenize", "CYC-STRING-TOKENIZE", 2, 0, false);
        declareFunction("cyc_string_to_nth_code_point", "CYC-STRING-TO-NTH-CODE-POINT", 2, 0, false);
        declareFunction("cyc_http_url_encode", "CYC-HTTP-URL-ENCODE", 1, 0, false);
        declareFunction("cyc_xml_value_string", "CYC-XML-VALUE-STRING", 3, 0, false);
        declareFunction("cyc_http_url_decode", "CYC-HTTP-URL-DECODE", 1, 0, false);
        declareFunction("cyc_acronym_from_string", "CYC-ACRONYM-FROM-STRING", 1, 0, false);
        declareFunction("cyc_html_image", "CYC-HTML-IMAGE", 2, 0, false);
        declareFunction("html_image_plist", "HTML-IMAGE-PLIST", 1, 0, false);
        declareFunction("cyc_html_table_data", "CYC-HTML-TABLE-DATA", 2, 0, false);
        declareFunction("cyc_html_table_data_variable_arity", "CYC-HTML-TABLE-DATA-VARIABLE-ARITY", 1, 0, false);
        declareFunction("html_table_data_plist", "HTML-TABLE-DATA-PLIST", 1, 0, false);
        declareFunction("cyc_html_table_row", "CYC-HTML-TABLE-ROW", 2, 0, false);
        declareFunction("cyc_html_table_row_variable_arity", "CYC-HTML-TABLE-ROW-VARIABLE-ARITY", 1, 0, false);
        declareFunction("html_table_row_plist", "HTML-TABLE-ROW-PLIST", 1, 0, false);
        declareFunction("cyc_html_table", "CYC-HTML-TABLE", 2, 0, false);
        declareFunction("cyc_html_table_variable_arity", "CYC-HTML-TABLE-VARIABLE-ARITY", 1, 0, false);
        declareFunction("html_table_plist", "HTML-TABLE-PLIST", 1, 0, false);
        declareFunction("cyc_html_division", "CYC-HTML-DIVISION", 2, 0, false);
        declareFunction("cyc_html_division_variable_arity", "CYC-HTML-DIVISION-VARIABLE-ARITY", 1, 0, false);
        declareFunction("output_html_division_content", "OUTPUT-HTML-DIVISION-CONTENT", 1, 0, false);
        declareFunction("html_division_plist", "HTML-DIVISION-PLIST", 1, 0, false);
        declareFunction("decode_html_option", "DECODE-HTML-OPTION", 1, 0, false);
        declareFunction("parse_html_attribute", "PARSE-HTML-ATTRIBUTE", 1, 0, false);
        declareFunction("parse_html_attribute_value", "PARSE-HTML-ATTRIBUTE-VALUE", 1, 0, false);
        declareFunction("cyc_contextual_url", "CYC-CONTEXTUAL-URL", 2, 0, false);
        declareFunction("url_string", "URL-STRING", 1, 0, false);
        declareFunction("cyc_term_from_sparql_uri", "CYC-TERM-FROM-SPARQL-URI", 1, 0, false);
        declareFunction("open_cyc_uri_for_term", "OPEN-CYC-URI-FOR-TERM", 1, 0, false);
        declareFunction("canonical_uri_for_term", "CANONICAL-URI-FOR-TERM", 1, 0, false);
        declareFunction("resource_with_uri_fn_nat_p", "RESOURCE-WITH-URI-FN-NAT-P", 1, 0, false);
        declareFunction("cyc_remove_html_tags", "CYC-REMOVE-HTML-TAGS", 1, 0, false);
        declareFunction("cyc_capitalize_smart", "CYC-CAPITALIZE-SMART", 1, 0, false);
        declareFunction("cyc_recapitalize_smart", "CYC-RECAPITALIZE-SMART", 1, 0, false);
        declareFunction("cyc_relation_arg", "CYC-RELATION-ARG", 2, 0, false);
        declareFunction("cyc_relation_args_list", "CYC-RELATION-ARGS-LIST", 1, 0, false);
        declareFunction("cyc_relation_arg_set", "CYC-RELATION-ARG-SET", 1, 0, false);
        declareFunction("cyc_quoted_relation_expression_arity", "CYC-QUOTED-RELATION-EXPRESSION-ARITY", 1, 0, false);
        declareFunction("cyc_relation_expression_arity", "CYC-RELATION-EXPRESSION-ARITY", 1, 0, false);
        declareFunction("cyc_identity", "CYC-IDENTITY", 1, 0, false);
        declareFunction("cyc_relation_tuples", "CYC-RELATION-TUPLES", 1, 0, false);
        declareFunction("cyc_relation_tuples_internal", "CYC-RELATION-TUPLES-INTERNAL", 1, 1, false);
        declareFunction("convert_relation_to_kappa", "CONVERT-RELATION-TO-KAPPA", 1, 0, false);
        declareFunction("cyc_substitute_formula", "CYC-SUBSTITUTE-FORMULA", 3, 0, false);
        declareFunction("cyc_bilateral_form_of_sentence_left", "CYC-BILATERAL-FORM-OF-SENTENCE-LEFT", 1, 0, false);
        declareFunction("symmetric_part_typeP", "SYMMETRIC-PART-TYPE?", 1, 0, false);
        declareFunction("left_form_of_symmetric_part_type", "LEFT-FORM-OF-SYMMETRIC-PART-TYPE", 1, 0, false);
        declareFunction("cyc_bilateral_form_of_sentence_right", "CYC-BILATERAL-FORM-OF-SENTENCE-RIGHT", 1, 0, false);
        declareFunction("symmetry_neutralized_el_sentence_p", "SYMMETRY-NEUTRALIZED-EL-SENTENCE-P", 1, 0, false);
        declareFunction("right_form_of_symmetric_part_type", "RIGHT-FORM-OF-SYMMETRIC-PART-TYPE", 1, 0, false);
        declareFunction("neutralize_symmetric_formula", "NEUTRALIZE-SYMMETRIC-FORMULA", 1, 0, false);
        declareFunction("side_fn_naut_p", "SIDE-FN-NAUT-P", 1, 0, false);
        declareFunction("cyc_substitute_formula_arg", "CYC-SUBSTITUTE-FORMULA-ARG", 3, 0, false);
        declareFunction("cyc_substitute_formula_arg_position", "CYC-SUBSTITUTE-FORMULA-ARG-POSITION", 3, 0, false);
        declareFunction("cyc_make_formula", "CYC-MAKE-FORMULA", 2, 0, false);
        declareFunction("cyc_substitute_quoted_formula", "CYC-SUBSTITUTE-QUOTED-FORMULA", 3, 0, false);
        declareFunction("cyc_substitute_quoted_formula_arg", "CYC-SUBSTITUTE-QUOTED-FORMULA-ARG", 3, 0, false);
        declareFunction("cyc_substitute_quoted_formula_arg_position", "CYC-SUBSTITUTE-QUOTED-FORMULA-ARG-POSITION", 3, 0, false);
        declareFunction("cyc_make_quoted_formula", "CYC-MAKE-QUOTED-FORMULA", 2, 0, false);
        declareFunction("cycl_to_el_fn", "CYCL-TO-EL-FN", 1, 0, false);
        declareFunction("cyc_substitute_nlte", "CYC-SUBSTITUTE-NLTE", 3, 0, false);
        declareFunction("sem_trans_template_defn", "SEM-TRANS-TEMPLATE-DEFN", 3, 0, false);
        declareFunction("cyc_word_strings", "CYC-WORD-STRINGS", 2, 0, false);
        declareFunction("word_strings_fn", "WORD-STRINGS-FN", 0, 0, false);
        declareFunction("word_sequence_fn", "WORD-SEQUENCE-FN", 0, 0, false);
        declareFunction("cyc_strings_of_word_sequence", "CYC-STRINGS-OF-WORD-SEQUENCE", 1, 0, false);
        declareFunction("cyc_instantiate", "CYC-INSTANTIATE", 3, 0, false);
        declareFunction("cyc_find_or_instantiate", "CYC-FIND-OR-INSTANTIATE", 3, 0, false);
        declareFunction("cyc_instantiate_set_formula", "CYC-INSTANTIATE-SET-FORMULA", 1, 0, false);
        declareFunction("cyc_instantiate_formula", "CYC-INSTANTIATE-FORMULA", 3, 0, false);
        declareFunction("cyc_find_via_pred_value_or_create_via_template", "CYC-FIND-VIA-PRED-VALUE-OR-CREATE-VIA-TEMPLATE", 3, 0, false);
        declareFunction("clear_cached_find_via_pred_value_wrt_template", "CLEAR-CACHED-FIND-VIA-PRED-VALUE-WRT-TEMPLATE", 0, 0, false);
        declareFunction("remove_cached_find_via_pred_value_wrt_template", "REMOVE-CACHED-FIND-VIA-PRED-VALUE-WRT-TEMPLATE", 3, 1, false);
        declareFunction("cached_find_via_pred_value_wrt_template_internal", "CACHED-FIND-VIA-PRED-VALUE-WRT-TEMPLATE-INTERNAL", 4, 0, false);
        declareFunction("cached_find_via_pred_value_wrt_template", "CACHED-FIND-VIA-PRED-VALUE-WRT-TEMPLATE", 3, 1, false);
        declareFunction("find_via_pred_value_wrt_template", "FIND-VIA-PRED-VALUE-WRT-TEMPLATE", 3, 1, false);
        declareFunction("create_and_assert_via_value_wrt_template", "CREATE-AND-ASSERT-VIA-VALUE-WRT-TEMPLATE", 2, 1, false);
        declareFunction("create_constant_from_value_wrt_template", "CREATE-CONSTANT-FROM-VALUE-WRT-TEMPLATE", 2, 1, false);
        declareFunction("compute_constant_assert_sentence_wrt_template", "COMPUTE-CONSTANT-ASSERT-SENTENCE-WRT-TEMPLATE", 3, 1, false);
        declareFunction("cyc_action_type_nlte", "CYC-ACTION-TYPE-NLTE", 1, 0, false);
        declareFunction("action_type_nlte", "ACTION-TYPE-NLTE", 1, 0, false);
        declareFunction("action_type_nltes", "ACTION-TYPE-NLTES", 1, 0, false);
        declareFunction("cyc_individual_denoting_unary_function_for", "CYC-INDIVIDUAL-DENOTING-UNARY-FUNCTION-FOR", 1, 0, false);
        declareFunction("cyc_collection_denoting_unary_function_for", "CYC-COLLECTION-DENOTING-UNARY-FUNCTION-FOR", 1, 0, false);
        declareFunction("unary_functions_for", "UNARY-FUNCTIONS-FOR", 2, 0, false);
        declareFunction("unary_functionP", "UNARY-FUNCTION?", 1, 0, false);
        declareFunction("individual_denoting_fnP", "INDIVIDUAL-DENOTING-FN?", 1, 0, false);
        declareFunction("cyc_el_variable_fn", "CYC-EL-VARIABLE-FN", 1, 0, false);
        declareFunction("cyc_add_english_suffix", "CYC-ADD-ENGLISH-SUFFIX", 2, 0, false);
        declareFunction("generate_phrase_defn", "GENERATE-PHRASE-DEFN", 1, 0, false);
        declareFunction("generate_phrase_memoized_internal", "GENERATE-PHRASE-MEMOIZED-INTERNAL", 2, 0, false);
        declareFunction("generate_phrase_memoized", "GENERATE-PHRASE-MEMOIZED", 2, 0, false);
        declareFunction("assertions_relevant_to_string_defn", "ASSERTIONS-RELEVANT-TO-STRING-DEFN", 1, 0, false);
        declareFunction("assertions_for_prompt_string_memoized_internal", "ASSERTIONS-FOR-PROMPT-STRING-MEMOIZED-INTERNAL", 3, 0, false);
        declareFunction("assertions_for_prompt_string_memoized", "ASSERTIONS-FOR-PROMPT-STRING-MEMOIZED", 3, 0, false);
        declareFunction("best_string_of_nl_phrase_defn", "BEST-STRING-OF-NL-PHRASE-DEFN", 1, 0, false);
        declareFunction("best_string_of_nl_phrase_addressing_defn", "BEST-STRING-OF-NL-PHRASE-ADDRESSING-DEFN", 2, 0, false);
        declareFunction("best_string_of_nl_phrase_with_force_defn", "BEST-STRING-OF-NL-PHRASE-WITH-FORCE-DEFN", 2, 0, false);
        declareFunction("generate_gke_gloss_wrt_mt", "GENERATE-GKE-GLOSS-WRT-MT", 2, 0, false);
        declareFunction("basic_datum_paraphrase_defn", "BASIC-DATUM-PARAPHRASE-DEFN", 2, 0, false);
        declareFunction("basic_datum_phrase_naut", "BASIC-DATUM-PHRASE-NAUT", 1, 0, false);
        declareFunction("paraphrase_of_formula_from_template_defn", "PARAPHRASE-OF-FORMULA-FROM-TEMPLATE-DEFN", 2, 0, false);
        declareFunction("state_or_province_for_city_defn", "STATE-OR-PROVINCE-FOR-CITY-DEFN", 1, 0, false);
        declareFunction("cyc_html_url_encode", "CYC-HTML-URL-ENCODE", 1, 0, false);
        declareFunction("cyc_url_source", "CYC-URL-SOURCE", 1, 0, false);
        declareFunction("cyc_get_from_http_source", "CYC-GET-FROM-HTTP-SOURCE", 1, 0, false);
        declareFunction("encode_list_for_simple_http_server", "ENCODE-LIST-FOR-SIMPLE-HTTP-SERVER", 1, 0, false);
        declareFunction("cyc_term_uri_fn", "CYC-TERM-URI-FN", 1, 0, false);
        declareFunction("city_named_fn_defn", "CITY-NAMED-FN-DEFN", 2, 0, false);
        declareFunction("city_in_regionP", "CITY-IN-REGION?", 2, 0, false);
        declareFunction("text_topic_structure", "TEXT-TOPIC-STRUCTURE", 1, 0, false);
        declareFunction("el_list_to_subl_list", "EL-LIST-TO-SUBL-LIST", 1, 0, false);
        declareFunction("cyc_ordering_result", "CYC-ORDERING-RESULT", 1, 0, false);
        declareFunction("ordering_L", "ORDERING-<", 2, 0, false);
        declareFunction("cyc_ordering_result_internal", "CYC-ORDERING-RESULT-INTERNAL", 2, 0, false);
        declareFunction("cyc_time_of_day_of_date", "CYC-TIME-OF-DAY-OF-DATE", 1, 0, false);
        declareFunction("cyc_seconds_since_1970_to_date", "CYC-SECONDS-SINCE-1970-TO-DATE", 1, 0, false);
        declareFunction("cyc_date_to_seconds_since_1970", "CYC-DATE-TO-SECONDS-SINCE-1970", 1, 0, false);
        declareFunction("cyc_types_most_often_asserted_using_tool", "CYC-TYPES-MOST-OFTEN-ASSERTED-USING-TOOL", 2, 0, false);
        declareFunction("types_most_often_asserted_using_tool", "TYPES-MOST-OFTEN-ASSERTED-USING-TOOL", 1, 3, false);
        declareFunction("assertion_generating_tool_p", "ASSERTION-GENERATING-TOOL-P", 1, 0, false);
        declareFunction("cyc_html_for_text_containing_strings", "CYC-HTML-FOR-TEXT-CONTAINING-STRINGS", 2, 0, false);
        declareFunction("cyc_html_for_text_containing_strings_count_bold_tags", "CYC-HTML-FOR-TEXT-CONTAINING-STRINGS-COUNT-BOLD-TAGS", 1, 0, false);
        declareFunction("cyc_format", "CYC-FORMAT", 2, 0, false);
        declareFunction("cyc_next_integer_in_sequence", "CYC-NEXT-INTEGER-IN-SEQUENCE", 1, 0, false);
        declareFunction("cyc_next_integer_in_sequence_starting_at", "CYC-NEXT-INTEGER-IN-SEQUENCE-STARTING-AT", 2, 0, false);
        declareFunction("cyc_cyclify", "CYC-CYCLIFY", 2, 0, false);
        declareFunction("cyc_concatenate_strings", "CYC-CONCATENATE-STRINGS", 1, 0, false);
        declareFunction("cyc_concatenate_list_of_strings", "CYC-CONCATENATE-LIST-OF-STRINGS", 1, 0, false);
        declareFunction("cyc_term_similarity_metric", "CYC-TERM-SIMILARITY-METRIC", 2, 0, false);
        declareFunction("check_wn_sks_registered", "CHECK-WN-SKS-REGISTERED", 0, 0, false);
        declareFunction("cyc_wn_all_candidate_cycls_for_word_unitXpos", "CYC-WN-ALL-CANDIDATE-CYCLS-FOR-WORD-UNIT&POS", 2, 0, false);
        declareFunction("cyc_wn_all_hypernyms_for_word_unitXpos", "CYC-WN-ALL-HYPERNYMS-FOR-WORD-UNIT&POS", 2, 0, false);
        declareFunction("cyc_wn_all_synonyms_for_word_unitXpos", "CYC-WN-ALL-SYNONYMS-FOR-WORD-UNIT&POS", 2, 0, false);
        declareFunction("cyc_wn_ranked_candidate_cycls_for_word_unitXpos", "CYC-WN-RANKED-CANDIDATE-CYCLS-FOR-WORD-UNIT&POS", 2, 0, false);
        declareFunction("cyc_wn_ranked_hypernyms_for_word_unitXpos", "CYC-WN-RANKED-HYPERNYMS-FOR-WORD-UNIT&POS", 2, 0, false);
        declareFunction("cyc_wn_ranked_synonyms_for_word_unitXpos", "CYC-WN-RANKED-SYNONYMS-FOR-WORD-UNIT&POS", 2, 0, false);
        declareFunction("cyc_kb_orthogonal", "CYC-KB-ORTHOGONAL", 2, 0, false);
        declareFunction("cyc_content_of_file", "CYC-CONTENT-OF-FILE", 1, 0, false);
        declareFunction("cyc_transform_relation_tuples", "CYC-TRANSFORM-RELATION-TUPLES", 1, 0, false);
        declareFunction("unlist", "UNLIST", 1, 0, false);
        declareFunction("cyc_provable_via_defns", "CYC-PROVABLE-VIA-DEFNS", 1, 0, false);
        declareFunction("provable_via_defns_proper", "PROVABLE-VIA-DEFNS-PROPER", 3, 0, false);
        declareFunction("current_inference_answer_justification_proof_view", "CURRENT-INFERENCE-ANSWER-JUSTIFICATION-PROOF-VIEW", 0, 0, false);
        declareFunction("cyc_find_object_by_compact_hl_external_id_string", "CYC-FIND-OBJECT-BY-COMPACT-HL-EXTERNAL-ID-STRING", 1, 0, false);
        declareFunction("cyc_compact_hl_external_id_string", "CYC-COMPACT-HL-EXTERNAL-ID-STRING", 1, 0, false);
        declareFunction("cyc_decode_ka_interaction", "CYC-DECODE-KA-INTERACTION", 1, 0, false);
        declareFunction("cyc_most_recently_started_events_by_agent_relative_to_interaction_mt_fn", "CYC-MOST-RECENTLY-STARTED-EVENTS-BY-AGENT-RELATIVE-TO-INTERACTION-MT-FN", 2, 0, false);
        declareFunction("most_recently_started_events_by_agent_relative_to_interaction_mt", "MOST-RECENTLY-STARTED-EVENTS-BY-AGENT-RELATIVE-TO-INTERACTION-MT", 2, 0, false);
        declareFunction("executed_events_for_agent_in_interaction_mt", "EXECUTED-EVENTS-FOR-AGENT-IN-INTERACTION-MT", 2, 0, false);
        declareFunction("executed_unfinished_events_for_agent_in_interaction_mt", "EXECUTED-UNFINISHED-EVENTS-FOR-AGENT-IN-INTERACTION-MT", 2, 1, false);
        declareFunction("cyc_most_recently_started_unfinish_events_by_agent_relative_to_interaction_mt_fn", "CYC-MOST-RECENTLY-STARTED-UNFINISH-EVENTS-BY-AGENT-RELATIVE-TO-INTERACTION-MT-FN", 2, 0, false);
        declareFunction("most_recently_started_unfinished_events_by_agent_relative_to_interaction_mt", "MOST-RECENTLY-STARTED-UNFINISHED-EVENTS-BY-AGENT-RELATIVE-TO-INTERACTION-MT", 2, 0, false);
        declareFunction("cyc_event_to_plan_for_by_agent_in_interaction_context_fn", "CYC-EVENT-TO-PLAN-FOR-BY-AGENT-IN-INTERACTION-CONTEXT-FN", 2, 0, false);
        declareFunction("event_to_plan_for_by_agent_in_interaction_context", "EVENT-TO-PLAN-FOR-BY-AGENT-IN-INTERACTION-CONTEXT", 2, 0, false);
        declareFunction("cyc_plan_agent_should_execute_in_interaction_context_fn", "CYC-PLAN-AGENT-SHOULD-EXECUTE-IN-INTERACTION-CONTEXT-FN", 2, 0, false);
        declareFunction("earlier_mt_or_abandonedP", "EARLIER-MT-OR-ABANDONED?", 2, 0, false);
        declareFunction("plan_agent_should_execute_in_interaction_context", "PLAN-AGENT-SHOULD-EXECUTE-IN-INTERACTION-CONTEXT", 2, 0, false);
        declareFunction("cyc_agent_cannot_progress_in_interaction_context_fn", "CYC-AGENT-CANNOT-PROGRESS-IN-INTERACTION-CONTEXT-FN", 2, 0, false);
        declareFunction("agent_cannot_progress_in_interaction_context", "AGENT-CANNOT-PROGRESS-IN-INTERACTION-CONTEXT", 2, 0, false);
        declareFunction("cyc_highest_priority_item_on_agenda_for_agent_in_interaction_context_fn", "CYC-HIGHEST-PRIORITY-ITEM-ON-AGENDA-FOR-AGENT-IN-INTERACTION-CONTEXT-FN", 2, 0, false);
        declareFunction("highest_priority_item_on_agenda_for_agent_in_interaction_context", "HIGHEST-PRIORITY-ITEM-ON-AGENDA-FOR-AGENT-IN-INTERACTION-CONTEXT", 2, 0, false);
        declareFunction("cyc_highest_priority_item_on_agenda_in_to_do_mt_fn", "CYC-HIGHEST-PRIORITY-ITEM-ON-AGENDA-IN-TO-DO-MT-FN", 2, 0, false);
        declareFunction("highest_priority_item_on_agenda_in_to_do_mt", "HIGHEST-PRIORITY-ITEM-ON-AGENDA-IN-TO-DO-MT", 2, 0, false);
        declareFunction("cyc_likelihood_of_truth_of_sentence", "CYC-LIKELIHOOD-OF-TRUTH-OF-SENTENCE", 2, 0, false);
        declareFunction("cyc_time_intervals_for_sentence", "CYC-TIME-INTERVALS-FOR-SENTENCE", 2, 0, false);
        declareFunction("cyc_evaluate_math_expression", "CYC-EVALUATE-MATH-EXPRESSION", 1, 0, false);
        declareFunction("cyc_flatten_math_expression", "CYC-FLATTEN-MATH-EXPRESSION", 1, 0, false);
        declareFunction("cyc_apply_operation_to_math_statement", "CYC-APPLY-OPERATION-TO-MATH-STATEMENT", 3, 0, false);
        declareFunction("cyc_serialize_mathml", "CYC-SERIALIZE-MATHML", 1, 0, false);
        declareFunction("cyc_cartesian_product", "CYC-CARTESIAN-PRODUCT", 1, 0, false);
        declareFunction("cyc_filter_list", "CYC-FILTER-LIST", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_evaluation_defns_file_alt() {
        deflexical("*CYCL-FUNCTIONS-USED-AS-EVALUATION-DEFNS*", $list_alt0);
        deflexical("*MAX-SUPPORTED-FORMULA-ARITY*", $int$1000);
        defparameter("*BUG-18769-SWITCH?*", NIL);
        deflexical("*WORD-STRINGS-FN*", NIL);
        deflexical("*WORD-SEQUENCE-FN*", NIL);
        deflexical("*USE-NEW-NL-GENERATION-API-FOR-GENERATE-PHRASE-FN?*", NIL != boundp($use_new_nl_generation_api_for_generate_phrase_fnP$) ? ((SubLObject) ($use_new_nl_generation_api_for_generate_phrase_fnP$.getGlobalValue())) : NIL);
        defparameter("*CYC-ORDERING-RELATION*", NIL);
        deflexical("*TERM-TO-ISG-TABLE-LOCK*", make_lock($str_alt247$term____isg_table_lock));
        deflexical("*TERM-TO-ISG-TABLE*", NIL != boundp($term_to_isg_table$) ? ((SubLObject) ($term_to_isg_table$.getGlobalValue())) : new_dictionary(symbol_function(EQUAL), UNPROVIDED));
        deflexical("*TERM-TO-ISG-W/START-TABLE-LOCK*", make_lock($str_alt250$term____isg_w__start_table_lock));
        deflexical("*TERM-TO-ISG-W/START-TABLE*", NIL != boundp($sym251$_TERM_TO_ISG_W_START_TABLE_) ? ((SubLObject) ($term_to_isg_wXstart_table$.getGlobalValue())) : new_dictionary(symbol_function(EQUAL), UNPROVIDED));
        return NIL;
    }

    public static SubLObject init_evaluation_defns_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*CYCL-FUNCTIONS-USED-AS-EVALUATION-DEFNS*", $list0);
            deflexical("*MAX-SUPPORTED-FORMULA-ARITY*", $int$1000);
            defparameter("*BUG-18769-SWITCH?*", NIL);
            deflexical("*WORD-STRINGS-FN*", NIL);
            deflexical("*WORD-SEQUENCE-FN*", NIL);
            deflexical("*CACHED-FIND-VIA-PRED-VALUE-WRT-TEMPLATE-CACHING-STATE*", NIL);
            deflexical("*USE-NEW-NL-GENERATION-API-FOR-GENERATE-PHRASE-FN?*", SubLTrampolineFile.maybeDefault($use_new_nl_generation_api_for_generate_phrase_fnP$, $use_new_nl_generation_api_for_generate_phrase_fnP$, NIL));
            deflexical("*ASSERTIONS-RELEVANT-TO-STRING-DEFN-MAX-TO-CHECK*", $int$500000);
            defparameter("*CYC-ORDERING-RELATION*", NIL);
            deflexical("*TERM-TO-ISG-TABLE-LOCK*", make_lock($str302$term____isg_table_lock));
            deflexical("*TERM-TO-ISG-TABLE*", SubLTrampolineFile.maybeDefault($term_to_isg_table$, $term_to_isg_table$, () -> dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED)));
            deflexical("*TERM-TO-ISG-W/START-TABLE-LOCK*", make_lock($str305$term____isg_w__start_table_lock));
            deflexical("*TERM-TO-ISG-W/START-TABLE*", SubLTrampolineFile.maybeDefault($sym306$_TERM_TO_ISG_W_START_TABLE_, $term_to_isg_wXstart_table$, () -> dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED)));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*USE-NEW-NL-GENERATION-API-FOR-GENERATE-PHRASE-FN?*", NIL != boundp($use_new_nl_generation_api_for_generate_phrase_fnP$) ? ((SubLObject) ($use_new_nl_generation_api_for_generate_phrase_fnP$.getGlobalValue())) : NIL);
            deflexical("*TERM-TO-ISG-TABLE-LOCK*", make_lock($str_alt247$term____isg_table_lock));
            deflexical("*TERM-TO-ISG-TABLE*", NIL != boundp($term_to_isg_table$) ? ((SubLObject) ($term_to_isg_table$.getGlobalValue())) : new_dictionary(symbol_function(EQUAL), UNPROVIDED));
            deflexical("*TERM-TO-ISG-W/START-TABLE-LOCK*", make_lock($str_alt250$term____isg_w__start_table_lock));
            deflexical("*TERM-TO-ISG-W/START-TABLE*", NIL != boundp($sym251$_TERM_TO_ISG_W_START_TABLE_) ? ((SubLObject) ($term_to_isg_wXstart_table$.getGlobalValue())) : new_dictionary(symbol_function(EQUAL), UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject init_evaluation_defns_file_Previous() {
        deflexical("*CYCL-FUNCTIONS-USED-AS-EVALUATION-DEFNS*", $list0);
        deflexical("*MAX-SUPPORTED-FORMULA-ARITY*", $int$1000);
        defparameter("*BUG-18769-SWITCH?*", NIL);
        deflexical("*WORD-STRINGS-FN*", NIL);
        deflexical("*WORD-SEQUENCE-FN*", NIL);
        deflexical("*CACHED-FIND-VIA-PRED-VALUE-WRT-TEMPLATE-CACHING-STATE*", NIL);
        deflexical("*USE-NEW-NL-GENERATION-API-FOR-GENERATE-PHRASE-FN?*", SubLTrampolineFile.maybeDefault($use_new_nl_generation_api_for_generate_phrase_fnP$, $use_new_nl_generation_api_for_generate_phrase_fnP$, NIL));
        deflexical("*ASSERTIONS-RELEVANT-TO-STRING-DEFN-MAX-TO-CHECK*", $int$500000);
        defparameter("*CYC-ORDERING-RELATION*", NIL);
        deflexical("*TERM-TO-ISG-TABLE-LOCK*", make_lock($str302$term____isg_table_lock));
        deflexical("*TERM-TO-ISG-TABLE*", SubLTrampolineFile.maybeDefault($term_to_isg_table$, $term_to_isg_table$, () -> dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED)));
        deflexical("*TERM-TO-ISG-W/START-TABLE-LOCK*", make_lock($str305$term____isg_w__start_table_lock));
        deflexical("*TERM-TO-ISG-W/START-TABLE*", SubLTrampolineFile.maybeDefault($sym306$_TERM_TO_ISG_W_START_TABLE_, $term_to_isg_wXstart_table$, () -> dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED)));
        return NIL;
    }

    public static final SubLObject setup_evaluation_defns_file_alt() {
        {
            SubLObject cdolist_list_var = $cycl_functions_used_as_evaluation_defns$.getGlobalValue();
            SubLObject symbol = NIL;
            for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                register_kb_function(symbol);
            }
        }
        register_kb_function(CYC_TRUE_SUBL);
        register_kb_function(CYC_DIFFERENT);
        register_kb_function(CYC_DIFFERENT_SYMBOLS);
        register_kb_function(CYC_SUBSTRING_PREDICATE);
        register_kb_function(CYC_SUBSTRING_CASE_INSENSITIVE_PREDICATE);
        register_kb_function(CYC_PREFIX_SUBSTRING);
        register_kb_function(CYC_SUFFIX_SUBSTRING);
        register_kb_function(CYC_SUBWORD_PREDICATE);
        register_kb_function(CYC_FIND_CONSTANT);
        register_kb_function(CYC_EVALUATE_SUBL);
        register_kb_function(CYC_STRING_UPCASE);
        define_obsolete_register(STRING_UPCASE_DEFN, $list_alt23);
        register_kb_function(CYC_STRING_DOWNCASE);
        register_kb_function(CYC_SUBSTRING);
        register_kb_function(CYC_STRING_CONCAT);
        register_kb_function(CYC_STRINGS_TO_PHRASE);
        register_kb_function(CYC_PRE_REMOVE);
        register_kb_function(CYC_REPLACE_SUBSTRING);
        register_kb_function(CYC_UNIQUE_WS);
        register_kb_function(GENERATE_NAMES_FOR_TERM);
        register_kb_function(CYC_REMOVE_SUBSTRING);
        register_kb_function(CYC_POST_REMOVE);
        register_kb_function(CYC_TRIM_WHITESPACE);
        register_kb_function(CYC_STRING_SEARCH);
        register_kb_function(CYC_LENGTH);
        register_kb_function(CYC_STRING_TO_INTEGER);
        register_kb_function(CYC_INTEGER_TO_STRING);
        register_kb_function(CYC_STRING_TO_REAL_NUMBER);
        register_kb_function(CYC_REAL_NUMBER_TO_STRING);
        register_kb_function(CYC_STRING_TOKENIZE);
        register_kb_function(CYC_HTTP_URL_ENCODE);
        register_kb_function(CYC_HTML_IMAGE);
        register_kb_function(CYC_HTML_TABLE_DATA);
        register_kb_function(CYC_HTML_TABLE_DATA_VARIABLE_ARITY);
        register_kb_function(CYC_HTML_TABLE_ROW);
        register_kb_function(CYC_HTML_TABLE_ROW_VARIABLE_ARITY);
        register_kb_function(CYC_HTML_TABLE);
        register_kb_function(CYC_HTML_TABLE_VARIABLE_ARITY);
        register_kb_function(CYC_HTML_DIVISION);
        register_kb_function(CYC_HTML_DIVISION_VARIABLE_ARITY);
        register_kb_function(CYC_CONTEXTUAL_URL);
        register_kb_function(CYC_REMOVE_HTML_TAGS);
        register_kb_function(CYC_CAPITALIZE_SMART);
        register_kb_function(CYC_RECAPITALIZE_SMART);
        register_kb_function(CYC_RELATION_ARG);
        register_kb_function(CYC_RELATION_ARGS_LIST);
        register_kb_function(CYC_RELATION_ARG_SET);
        register_kb_function(CYC_RELATION_EXPRESSION_ARITY);
        register_kb_function(CYC_IDENTITY);
        register_kb_function(CYC_RELATION_TUPLES);
        register_kb_function(CYC_SUBSTITUTE_FORMULA);
        register_kb_function(CYC_BILATERAL_FORM_OF_SENTENCE_LEFT);
        register_kb_function(CYC_BILATERAL_FORM_OF_SENTENCE_RIGHT);
        register_kb_function(CYC_SUBSTITUTE_FORMULA_ARG);
        register_kb_function(CYC_SUBSTITUTE_FORMULA_ARG_POSITION);
        register_kb_function(CYC_MAKE_FORMULA);
        register_kb_function(CYC_SUBSTITUTE_QUOTED_FORMULA_ARG);
        register_kb_function(CYC_SUBSTITUTE_QUOTED_FORMULA_ARG_POSITION);
        register_kb_function(CYC_MAKE_QUOTED_FORMULA);
        register_kb_function(CYCL_TO_EL_FN);
        register_kb_function(CYC_SUBSTITUTE_NLTE);
        register_kb_function(SEM_TRANS_TEMPLATE_DEFN);
        register_kb_function(CYC_WORD_STRINGS);
        register_kb_function(CYC_STRINGS_OF_WORD_SEQUENCE);
        register_kb_function(CYC_INSTANTIATE);
        register_kb_function(CYC_FIND_OR_INSTANTIATE);
        register_kb_function(CYC_INDIVIDUAL_DENOTING_UNARY_FUNCTION_FOR);
        register_kb_function(CYC_COLLECTION_DENOTING_UNARY_FUNCTION_FOR);
        register_kb_function(CYC_EL_VARIABLE_FN);
        register_kb_function(CYC_ADD_ENGLISH_SUFFIX);
        declare_defglobal($use_new_nl_generation_api_for_generate_phrase_fnP$);
        register_kb_function(GENERATE_PHRASE_DEFN);
        note_memoized_function(GENERATE_PHRASE_MEMOIZED);
        register_kb_function(BEST_STRING_OF_NL_PHRASE_DEFN);
        register_kb_function(BASIC_DATUM_PARAPHRASE_DEFN);
        register_kb_function(STATE_OR_PROVINCE_FOR_CITY_DEFN);
        register_kb_function(CYC_HTML_URL_ENCODE);
        register_kb_function(CYC_URL_SOURCE);
        register_kb_function(CYC_GET_FROM_HTTP_SOURCE);
        register_kb_function(CYC_TERM_URI_FN);
        register_kb_function(CITY_NAMED_FN_DEFN);
        register_kb_function(TEXT_TOPIC_STRUCTURE);
        register_kb_function(EL_LIST_TO_SUBL_LIST);
        register_kb_function(CYC_ORDERING_RESULT);
        register_kb_function(CYC_STRING_TO_SUBSTANCE_TYPE);
        register_kb_function(CYC_NAME_TO_IONIC_COMPOUND);
        register_kb_function(CYC_SECONDS_SINCE_1970_TO_DATE);
        register_kb_function(CYC_TYPES_MOST_OFTEN_ASSERTED_USING_TOOL);
        register_kb_function(CYC_HTML_FOR_TEXT_CONTAINING_STRINGS);
        register_kb_function(CYC_FORMAT);
        declare_defglobal($term_to_isg_table$);
        register_kb_function(CYC_NEXT_INTEGER_IN_SEQUENCE);
        declare_defglobal($sym251$_TERM_TO_ISG_W_START_TABLE_);
        register_kb_function(CYC_NEXT_INTEGER_IN_SEQUENCE_STARTING_AT);
        register_kb_function(CYC_CYCLIFY);
        register_kb_function(CYC_CONCATENATE_STRINGS);
        define_test_case_table_int(CYC_CONCATENATE_STRINGS, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$pace, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt266);
        register_kb_function(CYC_TERM_SIMILARITY_METRIC);
        register_kb_function($sym270$CYC_WN_ALL_CANDIDATE_CYCLS_FOR_WORD_UNIT_POS);
        register_kb_function($sym271$CYC_WN_ALL_HYPERNYMS_FOR_WORD_UNIT_POS);
        register_kb_function($sym272$CYC_WN_ALL_SYNONYMS_FOR_WORD_UNIT_POS);
        register_kb_function($sym276$CYC_WN_RANKED_CANDIDATE_CYCLS_FOR_WORD_UNIT_POS);
        register_kb_function($sym277$CYC_WN_RANKED_HYPERNYMS_FOR_WORD_UNIT_POS);
        register_kb_function($sym278$CYC_WN_RANKED_SYNONYMS_FOR_WORD_UNIT_POS);
        register_kb_function(CYC_KB_ORTHOGONAL);
        register_kb_function(CYC_CONTENT_OF_FILE);
        register_kb_function(CYC_TRANSFORM_RELATION_TUPLES);
        return NIL;
    }

    public static SubLObject setup_evaluation_defns_file() {
        if (SubLFiles.USE_V1) {
            SubLObject cdolist_list_var = $cycl_functions_used_as_evaluation_defns$.getGlobalValue();
            SubLObject symbol = NIL;
            symbol = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                register_kb_function(symbol);
                cdolist_list_var = cdolist_list_var.rest();
                symbol = cdolist_list_var.first();
            } 
            register_kb_function(CYC_TRUE_SUBL);
            register_kb_function(CYC_DIFFERENT);
            register_kb_function(CYC_DIFFERENT_SYMBOLS);
            register_kb_function(CYC_STRING_PRECEDES);
            register_kb_function(CYC_STRING_PRECEDES_CASE_INSENSITIVE);
            register_kb_function(CYC_SUBSTRING_PREDICATE);
            register_kb_function(CYC_SUBSTRING_CASE_INSENSITIVE_PREDICATE);
            register_kb_function(CYC_PREFIX_SUBSTRING);
            register_kb_function(CYC_SUFFIX_SUBSTRING);
            register_kb_function(CYC_SUBWORD_PREDICATE);
            register_kb_function(CYC_FIND_CONSTANT);
            register_kb_function(CYC_EVALUATE_SUBL);
            register_kb_function(CYC_STRING_UPCASE);
            define_obsolete_register(STRING_UPCASE_DEFN, $list25);
            register_kb_function(CYC_STRING_DOWNCASE);
            register_kb_function(CYC_SUBSTRING);
            register_kb_function(CYC_STRING_CONCAT);
            register_kb_function(CYC_STRINGS_TO_PHRASE);
            register_kb_function(CYC_PRE_REMOVE);
            register_kb_function(CYC_REPLACE_SUBSTRING);
            register_kb_function(CYC_UNIQUE_WS);
            register_kb_function(GENERATE_NAMES_FOR_TERM);
            register_kb_function(CYC_REMOVE_SUBSTRING);
            register_kb_function(CYC_POST_REMOVE);
            register_kb_function(CYC_TRIM_WHITESPACE);
            register_kb_function(CYC_STRING_SEARCH);
            register_kb_function(CYC_LENGTH);
            register_kb_function(CYC_STRING_TO_INTEGER);
            register_kb_function(CYC_INTEGRAL_NUMBER_TO_INTEGER);
            register_kb_function(CYC_INTEGER_TO_STRING);
            register_kb_function(CYC_STRINGIFY_FN);
            register_kb_function(CYC_SYNTACTIC_DISQUOTATION);
            register_kb_function(CYC_STRING_TO_REAL_NUMBER);
            register_kb_function(CYC_REAL_NUMBER_TO_STRING);
            register_kb_function(CYC_STRING_TOKENIZE);
            register_kb_function(CYC_STRING_TO_NTH_CODE_POINT);
            register_kb_function(CYC_HTTP_URL_ENCODE);
            register_kb_function(CYC_XML_VALUE_STRING);
            register_kb_function(CYC_HTTP_URL_DECODE);
            register_kb_function(CYC_ACRONYM_FROM_STRING);
            register_kb_function(CYC_HTML_IMAGE);
            register_kb_function(CYC_HTML_TABLE_DATA);
            register_kb_function(CYC_HTML_TABLE_DATA_VARIABLE_ARITY);
            register_kb_function(CYC_HTML_TABLE_ROW);
            register_kb_function(CYC_HTML_TABLE_ROW_VARIABLE_ARITY);
            register_kb_function(CYC_HTML_TABLE);
            register_kb_function(CYC_HTML_TABLE_VARIABLE_ARITY);
            register_kb_function(CYC_HTML_DIVISION);
            register_kb_function(CYC_HTML_DIVISION_VARIABLE_ARITY);
            register_kb_function(CYC_CONTEXTUAL_URL);
            register_kb_function(CYC_TERM_FROM_SPARQL_URI);
            register_kb_function(OPEN_CYC_URI_FOR_TERM);
            register_kb_function(CANONICAL_URI_FOR_TERM);
            register_kb_function(CYC_REMOVE_HTML_TAGS);
            register_kb_function(CYC_CAPITALIZE_SMART);
            register_kb_function(CYC_RECAPITALIZE_SMART);
            register_kb_function(CYC_RELATION_ARG);
            register_kb_function(CYC_RELATION_ARGS_LIST);
            register_kb_function(CYC_RELATION_ARG_SET);
            register_kb_function(CYC_QUOTED_RELATION_EXPRESSION_ARITY);
            register_kb_function(CYC_RELATION_EXPRESSION_ARITY);
            register_kb_function(CYC_IDENTITY);
            register_kb_function(CYC_RELATION_TUPLES);
            register_kb_function(CYC_SUBSTITUTE_FORMULA);
            register_kb_function(CYC_BILATERAL_FORM_OF_SENTENCE_LEFT);
            register_kb_function(CYC_BILATERAL_FORM_OF_SENTENCE_RIGHT);
            register_kb_function(CYC_SUBSTITUTE_FORMULA_ARG);
            register_kb_function(CYC_SUBSTITUTE_FORMULA_ARG_POSITION);
            register_kb_function(CYC_MAKE_FORMULA);
            register_kb_function(CYC_SUBSTITUTE_QUOTED_FORMULA);
            register_kb_function(CYC_SUBSTITUTE_QUOTED_FORMULA_ARG);
            register_kb_function(CYC_SUBSTITUTE_QUOTED_FORMULA_ARG_POSITION);
            register_kb_function(CYC_MAKE_QUOTED_FORMULA);
            register_kb_function(CYCL_TO_EL_FN);
            register_kb_function(CYC_SUBSTITUTE_NLTE);
            register_kb_function(SEM_TRANS_TEMPLATE_DEFN);
            register_kb_function(CYC_WORD_STRINGS);
            register_kb_function(CYC_STRINGS_OF_WORD_SEQUENCE);
            register_kb_function(CYC_INSTANTIATE);
            register_kb_function(CYC_FIND_OR_INSTANTIATE);
            register_kb_function(CYC_FIND_VIA_PRED_VALUE_OR_CREATE_VIA_TEMPLATE);
            memoization_state.note_globally_cached_function(CACHED_FIND_VIA_PRED_VALUE_WRT_TEMPLATE);
            register_kb_function(CYC_INDIVIDUAL_DENOTING_UNARY_FUNCTION_FOR);
            register_kb_function(CYC_COLLECTION_DENOTING_UNARY_FUNCTION_FOR);
            register_kb_function(CYC_EL_VARIABLE_FN);
            register_kb_function(CYC_ADD_ENGLISH_SUFFIX);
            declare_defglobal($use_new_nl_generation_api_for_generate_phrase_fnP$);
            register_kb_function(GENERATE_PHRASE_DEFN);
            memoization_state.note_memoized_function(GENERATE_PHRASE_MEMOIZED);
            register_kb_function(ASSERTIONS_RELEVANT_TO_STRING_DEFN);
            memoization_state.note_memoized_function(ASSERTIONS_FOR_PROMPT_STRING_MEMOIZED);
            register_kb_function(BEST_STRING_OF_NL_PHRASE_DEFN);
            register_kb_function(BEST_STRING_OF_NL_PHRASE_ADDRESSING_DEFN);
            register_kb_function(BEST_STRING_OF_NL_PHRASE_WITH_FORCE_DEFN);
            register_kb_function(GENERATE_GKE_GLOSS_WRT_MT);
            register_kb_function(BASIC_DATUM_PARAPHRASE_DEFN);
            register_kb_function(PARAPHRASE_OF_FORMULA_FROM_TEMPLATE_DEFN);
            register_kb_function(STATE_OR_PROVINCE_FOR_CITY_DEFN);
            register_kb_function(CYC_HTML_URL_ENCODE);
            register_kb_function(CYC_URL_SOURCE);
            register_kb_function(CYC_GET_FROM_HTTP_SOURCE);
            register_kb_function(CYC_TERM_URI_FN);
            register_kb_function(CITY_NAMED_FN_DEFN);
            register_kb_function(TEXT_TOPIC_STRUCTURE);
            register_kb_function(EL_LIST_TO_SUBL_LIST);
            register_kb_function(CYC_ORDERING_RESULT);
            register_kb_function(CYC_TIME_OF_DAY_OF_DATE);
            register_kb_function(CYC_SECONDS_SINCE_1970_TO_DATE);
            register_kb_function(CYC_DATE_TO_SECONDS_SINCE_1970);
            register_kb_function(CYC_TYPES_MOST_OFTEN_ASSERTED_USING_TOOL);
            register_kb_function(CYC_HTML_FOR_TEXT_CONTAINING_STRINGS);
            register_kb_function(CYC_FORMAT);
            declare_defglobal($term_to_isg_table$);
            register_kb_function(CYC_NEXT_INTEGER_IN_SEQUENCE);
            declare_defglobal($sym306$_TERM_TO_ISG_W_START_TABLE_);
            register_kb_function(CYC_NEXT_INTEGER_IN_SEQUENCE_STARTING_AT);
            register_kb_function(CYC_CYCLIFY);
            register_kb_function(CYC_CONCATENATE_STRINGS);
            register_kb_function(CYC_CONCATENATE_LIST_OF_STRINGS);
            register_kb_function(CYC_TERM_SIMILARITY_METRIC);
            register_kb_function($sym318$CYC_WN_ALL_CANDIDATE_CYCLS_FOR_WORD_UNIT_POS);
            register_kb_function($sym319$CYC_WN_ALL_HYPERNYMS_FOR_WORD_UNIT_POS);
            register_kb_function($sym320$CYC_WN_ALL_SYNONYMS_FOR_WORD_UNIT_POS);
            register_kb_function($sym324$CYC_WN_RANKED_CANDIDATE_CYCLS_FOR_WORD_UNIT_POS);
            register_kb_function($sym325$CYC_WN_RANKED_HYPERNYMS_FOR_WORD_UNIT_POS);
            register_kb_function($sym326$CYC_WN_RANKED_SYNONYMS_FOR_WORD_UNIT_POS);
            register_kb_function(CYC_KB_ORTHOGONAL);
            register_kb_function(CYC_CONTENT_OF_FILE);
            register_kb_function(CYC_TRANSFORM_RELATION_TUPLES);
            register_kb_function(CYC_PROVABLE_VIA_DEFNS);
            register_kb_function(CURRENT_INFERENCE_ANSWER_JUSTIFICATION_PROOF_VIEW);
            register_kb_function(CYC_FIND_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING);
            register_kb_function(CYC_COMPACT_HL_EXTERNAL_ID_STRING);
            register_kb_function(CYC_DECODE_KA_INTERACTION);
            register_kb_function($sym339$CYC_MOST_RECENTLY_STARTED_EVENTS_BY_AGENT_RELATIVE_TO_INTERACTION);
            register_kb_function($sym350$CYC_MOST_RECENTLY_STARTED_UNFINISH_EVENTS_BY_AGENT_RELATIVE_TO_IN);
            register_kb_function(CYC_EVENT_TO_PLAN_FOR_BY_AGENT_IN_INTERACTION_CONTEXT_FN);
            register_kb_function(CYC_PLAN_AGENT_SHOULD_EXECUTE_IN_INTERACTION_CONTEXT_FN);
            register_kb_function(CYC_AGENT_CANNOT_PROGRESS_IN_INTERACTION_CONTEXT_FN);
            register_kb_function($sym370$CYC_HIGHEST_PRIORITY_ITEM_ON_AGENDA_FOR_AGENT_IN_INTERACTION_CONT);
            register_kb_function(CYC_HIGHEST_PRIORITY_ITEM_ON_AGENDA_IN_TO_DO_MT_FN);
            register_kb_function(CYC_LIKELIHOOD_OF_TRUTH_OF_SENTENCE);
            register_kb_function(CYC_TIME_INTERVALS_FOR_SENTENCE);
            register_kb_function(CYC_EVALUATE_MATH_EXPRESSION);
            register_kb_function(CYC_FLATTEN_MATH_EXPRESSION);
            register_kb_function(CYC_APPLY_OPERATION_TO_MATH_STATEMENT);
            register_kb_function(CYC_SERIALIZE_MATHML);
            register_kb_function(CYC_CARTESIAN_PRODUCT);
            register_kb_function(CYC_FILTER_LIST);
        }
        if (SubLFiles.USE_V2) {
            {
                SubLObject cdolist_list_var = $cycl_functions_used_as_evaluation_defns$.getGlobalValue();
                SubLObject symbol = NIL;
                for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                    register_kb_function(symbol);
                }
            }
            define_obsolete_register(STRING_UPCASE_DEFN, $list_alt23);
            declare_defglobal($use_new_nl_generation_api_for_generate_phrase_fnP$);
            register_kb_function(CYC_STRING_TO_SUBSTANCE_TYPE);
            register_kb_function(CYC_NAME_TO_IONIC_COMPOUND);
            declare_defglobal($sym251$_TERM_TO_ISG_W_START_TABLE_);
            define_test_case_table_int(CYC_CONCATENATE_STRINGS, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$pace, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt266);
            register_kb_function($sym270$CYC_WN_ALL_CANDIDATE_CYCLS_FOR_WORD_UNIT_POS);
            register_kb_function($sym271$CYC_WN_ALL_HYPERNYMS_FOR_WORD_UNIT_POS);
            register_kb_function($sym272$CYC_WN_ALL_SYNONYMS_FOR_WORD_UNIT_POS);
            register_kb_function($sym276$CYC_WN_RANKED_CANDIDATE_CYCLS_FOR_WORD_UNIT_POS);
            register_kb_function($sym277$CYC_WN_RANKED_HYPERNYMS_FOR_WORD_UNIT_POS);
            register_kb_function($sym278$CYC_WN_RANKED_SYNONYMS_FOR_WORD_UNIT_POS);
        }
        return NIL;
    }

    public static SubLObject setup_evaluation_defns_file_Previous() {
        SubLObject cdolist_list_var = $cycl_functions_used_as_evaluation_defns$.getGlobalValue();
        SubLObject symbol = NIL;
        symbol = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            register_kb_function(symbol);
            cdolist_list_var = cdolist_list_var.rest();
            symbol = cdolist_list_var.first();
        } 
        register_kb_function(CYC_TRUE_SUBL);
        register_kb_function(CYC_DIFFERENT);
        register_kb_function(CYC_DIFFERENT_SYMBOLS);
        register_kb_function(CYC_STRING_PRECEDES);
        register_kb_function(CYC_STRING_PRECEDES_CASE_INSENSITIVE);
        register_kb_function(CYC_SUBSTRING_PREDICATE);
        register_kb_function(CYC_SUBSTRING_CASE_INSENSITIVE_PREDICATE);
        register_kb_function(CYC_PREFIX_SUBSTRING);
        register_kb_function(CYC_SUFFIX_SUBSTRING);
        register_kb_function(CYC_SUBWORD_PREDICATE);
        register_kb_function(CYC_FIND_CONSTANT);
        register_kb_function(CYC_EVALUATE_SUBL);
        register_kb_function(CYC_STRING_UPCASE);
        define_obsolete_register(STRING_UPCASE_DEFN, $list25);
        register_kb_function(CYC_STRING_DOWNCASE);
        register_kb_function(CYC_SUBSTRING);
        register_kb_function(CYC_STRING_CONCAT);
        register_kb_function(CYC_STRINGS_TO_PHRASE);
        register_kb_function(CYC_PRE_REMOVE);
        register_kb_function(CYC_REPLACE_SUBSTRING);
        register_kb_function(CYC_UNIQUE_WS);
        register_kb_function(GENERATE_NAMES_FOR_TERM);
        register_kb_function(CYC_REMOVE_SUBSTRING);
        register_kb_function(CYC_POST_REMOVE);
        register_kb_function(CYC_TRIM_WHITESPACE);
        register_kb_function(CYC_STRING_SEARCH);
        register_kb_function(CYC_LENGTH);
        register_kb_function(CYC_STRING_TO_INTEGER);
        register_kb_function(CYC_INTEGRAL_NUMBER_TO_INTEGER);
        register_kb_function(CYC_INTEGER_TO_STRING);
        register_kb_function(CYC_STRINGIFY_FN);
        register_kb_function(CYC_SYNTACTIC_DISQUOTATION);
        register_kb_function(CYC_STRING_TO_REAL_NUMBER);
        register_kb_function(CYC_REAL_NUMBER_TO_STRING);
        register_kb_function(CYC_STRING_TOKENIZE);
        register_kb_function(CYC_STRING_TO_NTH_CODE_POINT);
        register_kb_function(CYC_HTTP_URL_ENCODE);
        register_kb_function(CYC_XML_VALUE_STRING);
        register_kb_function(CYC_HTTP_URL_DECODE);
        register_kb_function(CYC_ACRONYM_FROM_STRING);
        register_kb_function(CYC_HTML_IMAGE);
        register_kb_function(CYC_HTML_TABLE_DATA);
        register_kb_function(CYC_HTML_TABLE_DATA_VARIABLE_ARITY);
        register_kb_function(CYC_HTML_TABLE_ROW);
        register_kb_function(CYC_HTML_TABLE_ROW_VARIABLE_ARITY);
        register_kb_function(CYC_HTML_TABLE);
        register_kb_function(CYC_HTML_TABLE_VARIABLE_ARITY);
        register_kb_function(CYC_HTML_DIVISION);
        register_kb_function(CYC_HTML_DIVISION_VARIABLE_ARITY);
        register_kb_function(CYC_CONTEXTUAL_URL);
        register_kb_function(CYC_TERM_FROM_SPARQL_URI);
        register_kb_function(OPEN_CYC_URI_FOR_TERM);
        register_kb_function(CANONICAL_URI_FOR_TERM);
        register_kb_function(CYC_REMOVE_HTML_TAGS);
        register_kb_function(CYC_CAPITALIZE_SMART);
        register_kb_function(CYC_RECAPITALIZE_SMART);
        register_kb_function(CYC_RELATION_ARG);
        register_kb_function(CYC_RELATION_ARGS_LIST);
        register_kb_function(CYC_RELATION_ARG_SET);
        register_kb_function(CYC_QUOTED_RELATION_EXPRESSION_ARITY);
        register_kb_function(CYC_RELATION_EXPRESSION_ARITY);
        register_kb_function(CYC_IDENTITY);
        register_kb_function(CYC_RELATION_TUPLES);
        register_kb_function(CYC_SUBSTITUTE_FORMULA);
        register_kb_function(CYC_BILATERAL_FORM_OF_SENTENCE_LEFT);
        register_kb_function(CYC_BILATERAL_FORM_OF_SENTENCE_RIGHT);
        register_kb_function(CYC_SUBSTITUTE_FORMULA_ARG);
        register_kb_function(CYC_SUBSTITUTE_FORMULA_ARG_POSITION);
        register_kb_function(CYC_MAKE_FORMULA);
        register_kb_function(CYC_SUBSTITUTE_QUOTED_FORMULA);
        register_kb_function(CYC_SUBSTITUTE_QUOTED_FORMULA_ARG);
        register_kb_function(CYC_SUBSTITUTE_QUOTED_FORMULA_ARG_POSITION);
        register_kb_function(CYC_MAKE_QUOTED_FORMULA);
        register_kb_function(CYCL_TO_EL_FN);
        register_kb_function(CYC_SUBSTITUTE_NLTE);
        register_kb_function(SEM_TRANS_TEMPLATE_DEFN);
        register_kb_function(CYC_WORD_STRINGS);
        register_kb_function(CYC_STRINGS_OF_WORD_SEQUENCE);
        register_kb_function(CYC_INSTANTIATE);
        register_kb_function(CYC_FIND_OR_INSTANTIATE);
        register_kb_function(CYC_FIND_VIA_PRED_VALUE_OR_CREATE_VIA_TEMPLATE);
        memoization_state.note_globally_cached_function(CACHED_FIND_VIA_PRED_VALUE_WRT_TEMPLATE);
        register_kb_function(CYC_INDIVIDUAL_DENOTING_UNARY_FUNCTION_FOR);
        register_kb_function(CYC_COLLECTION_DENOTING_UNARY_FUNCTION_FOR);
        register_kb_function(CYC_EL_VARIABLE_FN);
        register_kb_function(CYC_ADD_ENGLISH_SUFFIX);
        declare_defglobal($use_new_nl_generation_api_for_generate_phrase_fnP$);
        register_kb_function(GENERATE_PHRASE_DEFN);
        memoization_state.note_memoized_function(GENERATE_PHRASE_MEMOIZED);
        register_kb_function(ASSERTIONS_RELEVANT_TO_STRING_DEFN);
        memoization_state.note_memoized_function(ASSERTIONS_FOR_PROMPT_STRING_MEMOIZED);
        register_kb_function(BEST_STRING_OF_NL_PHRASE_DEFN);
        register_kb_function(BEST_STRING_OF_NL_PHRASE_ADDRESSING_DEFN);
        register_kb_function(BEST_STRING_OF_NL_PHRASE_WITH_FORCE_DEFN);
        register_kb_function(GENERATE_GKE_GLOSS_WRT_MT);
        register_kb_function(BASIC_DATUM_PARAPHRASE_DEFN);
        register_kb_function(PARAPHRASE_OF_FORMULA_FROM_TEMPLATE_DEFN);
        register_kb_function(STATE_OR_PROVINCE_FOR_CITY_DEFN);
        register_kb_function(CYC_HTML_URL_ENCODE);
        register_kb_function(CYC_URL_SOURCE);
        register_kb_function(CYC_GET_FROM_HTTP_SOURCE);
        register_kb_function(CYC_TERM_URI_FN);
        register_kb_function(CITY_NAMED_FN_DEFN);
        register_kb_function(TEXT_TOPIC_STRUCTURE);
        register_kb_function(EL_LIST_TO_SUBL_LIST);
        register_kb_function(CYC_ORDERING_RESULT);
        register_kb_function(CYC_TIME_OF_DAY_OF_DATE);
        register_kb_function(CYC_SECONDS_SINCE_1970_TO_DATE);
        register_kb_function(CYC_DATE_TO_SECONDS_SINCE_1970);
        register_kb_function(CYC_TYPES_MOST_OFTEN_ASSERTED_USING_TOOL);
        register_kb_function(CYC_HTML_FOR_TEXT_CONTAINING_STRINGS);
        register_kb_function(CYC_FORMAT);
        declare_defglobal($term_to_isg_table$);
        register_kb_function(CYC_NEXT_INTEGER_IN_SEQUENCE);
        declare_defglobal($sym306$_TERM_TO_ISG_W_START_TABLE_);
        register_kb_function(CYC_NEXT_INTEGER_IN_SEQUENCE_STARTING_AT);
        register_kb_function(CYC_CYCLIFY);
        register_kb_function(CYC_CONCATENATE_STRINGS);
        register_kb_function(CYC_CONCATENATE_LIST_OF_STRINGS);
        register_kb_function(CYC_TERM_SIMILARITY_METRIC);
        register_kb_function($sym318$CYC_WN_ALL_CANDIDATE_CYCLS_FOR_WORD_UNIT_POS);
        register_kb_function($sym319$CYC_WN_ALL_HYPERNYMS_FOR_WORD_UNIT_POS);
        register_kb_function($sym320$CYC_WN_ALL_SYNONYMS_FOR_WORD_UNIT_POS);
        register_kb_function($sym324$CYC_WN_RANKED_CANDIDATE_CYCLS_FOR_WORD_UNIT_POS);
        register_kb_function($sym325$CYC_WN_RANKED_HYPERNYMS_FOR_WORD_UNIT_POS);
        register_kb_function($sym326$CYC_WN_RANKED_SYNONYMS_FOR_WORD_UNIT_POS);
        register_kb_function(CYC_KB_ORTHOGONAL);
        register_kb_function(CYC_CONTENT_OF_FILE);
        register_kb_function(CYC_TRANSFORM_RELATION_TUPLES);
        register_kb_function(CYC_PROVABLE_VIA_DEFNS);
        register_kb_function(CURRENT_INFERENCE_ANSWER_JUSTIFICATION_PROOF_VIEW);
        register_kb_function(CYC_FIND_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING);
        register_kb_function(CYC_COMPACT_HL_EXTERNAL_ID_STRING);
        register_kb_function(CYC_DECODE_KA_INTERACTION);
        register_kb_function($sym339$CYC_MOST_RECENTLY_STARTED_EVENTS_BY_AGENT_RELATIVE_TO_INTERACTION);
        register_kb_function($sym350$CYC_MOST_RECENTLY_STARTED_UNFINISH_EVENTS_BY_AGENT_RELATIVE_TO_IN);
        register_kb_function(CYC_EVENT_TO_PLAN_FOR_BY_AGENT_IN_INTERACTION_CONTEXT_FN);
        register_kb_function(CYC_PLAN_AGENT_SHOULD_EXECUTE_IN_INTERACTION_CONTEXT_FN);
        register_kb_function(CYC_AGENT_CANNOT_PROGRESS_IN_INTERACTION_CONTEXT_FN);
        register_kb_function($sym370$CYC_HIGHEST_PRIORITY_ITEM_ON_AGENDA_FOR_AGENT_IN_INTERACTION_CONT);
        register_kb_function(CYC_HIGHEST_PRIORITY_ITEM_ON_AGENDA_IN_TO_DO_MT_FN);
        register_kb_function(CYC_LIKELIHOOD_OF_TRUTH_OF_SENTENCE);
        register_kb_function(CYC_TIME_INTERVALS_FOR_SENTENCE);
        register_kb_function(CYC_EVALUATE_MATH_EXPRESSION);
        register_kb_function(CYC_FLATTEN_MATH_EXPRESSION);
        register_kb_function(CYC_APPLY_OPERATION_TO_MATH_STATEMENT);
        register_kb_function(CYC_SERIALIZE_MATHML);
        register_kb_function(CYC_CARTESIAN_PRODUCT);
        register_kb_function(CYC_FILTER_LIST);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_evaluation_defns_file();
    }

    @Override
    public void initializeVariables() {
        init_evaluation_defns_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_evaluation_defns_file();
    }

    static {
    }

    public static final class $cyc_different$UnaryFunction extends UnaryFunction {
        public $cyc_different$UnaryFunction() {
            super(extractFunctionNamed("CYC-DIFFERENT"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cyc_different(arg1);
        }
    }
}

/**
 * Total time: 3015 ms
 */
